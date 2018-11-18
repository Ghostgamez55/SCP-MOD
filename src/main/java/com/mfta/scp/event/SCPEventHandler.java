package com.mfta.scp.event;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SCPEventHandler {
	
	@SubscribeEvent
	public void onSpawn(LivingSpawnEvent e) {
		if(e.getEntity() instanceof EntityZombie) {
			EntityZombie zombie = (EntityZombie)e.getEntity();
	        zombie.targetTasks.addTask(3, new EntityAINearestAttackableTarget(zombie, EntityAnimal.class, true));
		}
	}

	
}
