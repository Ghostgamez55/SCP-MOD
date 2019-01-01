package com.mfta.scp.init.entity;

import com.mfta.scp.init.sounds.ModSounds;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityBilly extends EntityMob {

	private EntityPlayer theWatcher;
	private boolean beingWatched;
	
	public EntityBilly(World worldIn) {
		
		super(worldIn);
		
		this.setSize(1, 2);
		this.tasks.addTask(1, new EntityAIWander(this, 0.7D));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.26D, true));
	
	}
	
	public EntityPlayer getWatcher() {
		return theWatcher;
	}

	public boolean isBeingWatched() {
		return this.beingWatched && theWatcher != null;
	}
	
	@Override
	public void onLivingUpdate() {

		if (this.world.getClosestPlayerToEntity(this, 30.0D) instanceof EntityPlayer) {
			
			EntityPlayer entityIn = this.world.getClosestPlayerToEntity(this, 30.0D);
        	theWatcher = entityIn;
            
        	Vec3d vec3d = entityIn.getLook(1.0F).normalize();
            Vec3d vec3d1 = new Vec3d(this.posX - entityIn.posX, this.getEntityBoundingBox().minY + (double)this.getEyeHeight() - (entityIn.posY + (double)entityIn.getEyeHeight()), this.posZ - entityIn.posZ);
			
            double d0 = vec3d1.length();
            vec3d1 = vec3d1.normalize();
            double d1 = vec3d.dotProduct(vec3d1);
			
            beingWatched = d1 > 1.0D - 0.425D / d0 && entityIn.canEntityBeSeen(this);
		
		}
		
		super.onLivingUpdate();
	
	}

	@Override
	protected boolean isMovementBlocked() {
		return isBeingWatched() || super.isMovementBlocked();
	}
	
	public boolean attackEntityAsMob(Entity e) {
		
		this.world.setEntityState(this, (byte) 4);
		this.playSound(ModSounds.NECK_SNAP, 1.0F, 1.0F);
		
		return e.attackEntityFrom(DamageSource.causeMobDamage(this), 25.0F);
	
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		return (source == DamageSource.LAVA || source == DamageSource.OUT_OF_WORLD) && super.attackEntityFrom(source, amount);
	}
	
	@Override
	protected void applyEntityAttributes() {
		
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.21D);
	
	}

}
