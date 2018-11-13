package com.mfta.scp.init.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityBilly extends EntityAnimal{

	public EntityBilly(World worldIn) {
		super(worldIn);
		this.setSize(1, 1);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
	}

}
