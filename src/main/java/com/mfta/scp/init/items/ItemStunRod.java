package com.mfta.scp.init.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ItemStunRod extends ItemSCP {
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		
		if (target instanceof IStunnable) {
			
			IStunnable stunned = (IStunnable) target;
			stunned.setStunned(true);
			target.attackEntityFrom(DamageSource.OUT_OF_WORLD, stunned.getDamage());
		
		}
		return super.hitEntity(stack, target, attacker);
	
	}
	
	public interface IStunnable {
		
		boolean isStunned();
		
		void setStunned(boolean stunned);
		
		float getDamage();
	
	}
	
}
