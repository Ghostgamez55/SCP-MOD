package com.mfta.scp.init.entity.projectiles;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityFlare extends EntityThrowable implements IEntityAdditionalSpawnData {
	
	public Vec3d color;
	
	public EntityFlare(World worldIn) {
		super(worldIn);
	}
	
	public EntityFlare(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public EntityFlare(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	public EntityFlare(World worldIn, EntityLivingBase throwerIn, Vec3d color) {
		super(worldIn, throwerIn);
		this.color = color;
		shoot(throwerIn, throwerIn.rotationPitch, throwerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
	}
	
	@Override
	protected float getGravityVelocity() {
		return 0.00001F;
	}
	
	@Override
	public void onEntityUpdate() {
		
		double speed = new Vec3d(posX, posY, posZ).distanceTo(new Vec3d(prevPosX, prevPosY, prevPosZ));
		if (!this.world.isRemote && (ticksExisted > 30 * 20 || speed < 0.01)) {
			this.setDead();
		}
		super.onEntityUpdate();
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setDouble("Color_R", color.x);
		compound.setDouble("Color_G", color.y);
		compound.setDouble("Color_B", color.z);
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.color = new Vec3d(compound.getDouble("Color_R"), compound.getDouble("Color_G"), compound.getDouble("Color_B"));
	}
	
	@Override
	public void writeSpawnData(ByteBuf buffer) {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeEntityToNBT(nbt);
		ByteBufUtils.writeTag(buffer, nbt);
	}
	
	@Override
	public void readSpawnData(ByteBuf additionalData) {
		this.readEntityFromNBT(ByteBufUtils.readTag(additionalData));
	}
	
	@Override
	public boolean isInWater() {
		return false;
	}
	
	/**
	 * Called when this EntityThrowable hits a block or entity.
	 *
	 * @param result
	 */
	@Override
	protected void onImpact(RayTraceResult result) {
		
		if (result == null || isDead)
			return;
		
		if (result.typeOfHit == RayTraceResult.Type.ENTITY) {
			if (result.entityHit == this.getThrower()) return;
			
			if (world.isRemote) {
				this.world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, this.posX, this.posY - 0.3D, this.posZ, this.rand.nextGaussian() * 0.05D, -this.motionY * 0.5D, this.rand.nextGaussian() * 0.05D);
			}
			
			if (!this.world.isRemote)
				this.setDead();
		}
	}
}
