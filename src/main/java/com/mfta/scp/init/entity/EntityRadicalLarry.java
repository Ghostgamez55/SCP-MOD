package com.mfta.scp.init.entity;

import java.util.Random;
import java.util.logging.Level;

import com.mfta.scp.SCPMain;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * SCP-106
 * @author Elisis
 * @see com.mfta.scp.client.model.ModelRadicalLarry
 */

public class EntityRadicalLarry extends EntityMob {
	
	private EntityPlayer player;
	private boolean stalking;
	
	public EntityRadicalLarry(World worldIn) {
		
		super(worldIn);
		this.targetTasks.addTask(1, EntityAIWander(this, 0.7d));
		this.targetTasks.addTask(2, EntityTeleportPlayer(this));
	
	}
	
	public boolean isStalking() {
		
		return this.stalking;
	
	}
	
	@Override
	public void onLivingUpdate() {
		
		Random rand = new Random();
		while (!stalking) {
			
			int r = rand.nextInt(1000) + 1;
		
			if (r == 42) {
			
				stalking = true;
			}
		}
		
		SCPMain.logger.log(Level.SEVERE, "Radical Larry is stalking.");
		
		
		
	}

	private EntityAIBase EntityTeleportPlayer(EntityRadicalLarry entityRadicalLarry) {
		// TODO Auto-generated method stub
		return null;
	}

	private EntityAIBase EntityAIWander(EntityRadicalLarry entityRadicalLarry, double d) {
		return null;
	}

}
