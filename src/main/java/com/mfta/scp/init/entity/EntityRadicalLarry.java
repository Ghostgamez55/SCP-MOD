package com.mfta.scp.init.entity;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * SCP-106
 * @author Elisis
 *
 */


//TODO: Needs models
public class EntityRadicalLarry extends EntityMob {
	
	private EntityPlayer player;
	
	public EntityRadicalLarry(World worldIn) {
		
		super(worldIn);
		this.targetTasks.addTask(1, EntityAIWander(this, 0.7d));
		this.targetTasks.addTask(2, EntityTeleportPlayer(this));
	
	}

	private EntityAIBase EntityTeleportPlayer(EntityRadicalLarry entityRadicalLarry) {
		// TODO Auto-generated method stub
		return null;
	}

	private EntityAIBase EntityAIWander(EntityRadicalLarry entityRadicalLarry, double d) {
		// TODO Auto-generated method stub
		return null;
	}

}
