package com.mfta.scp.init.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBigFoot extends EntityMob {

	public EntityBigFoot(World worldIn) {
		super(worldIn);
		this.setSize(1, 2);
		this.tasks.addTask(1, new EntityAIWander(this, 0.7D));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.26D, true));
	}
	
	public boolean attackEntityAsMob(Entity e) {
		this.world.setEntityState(this, (byte) 4);
		return e.attackEntityFrom(DamageSource.causeMobDamage(this), 5.0F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.21D);
	}

}
