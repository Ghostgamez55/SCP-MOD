package com.mfta.scp.init.items;

import com.mfta.scp.init.ModItems;
import com.mfta.scp.init.entity.projectiles.EntityFlare;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class ItemFlareGun extends Item {
	
	public ItemFlareGun() {
		this.maxStackSize = 1;
		this.setMaxDamage(384);
	}
	
	private ItemStack findAmmo(EntityPlayer player) {
		if (this.isAmmo(player.getHeldItem(EnumHand.OFF_HAND))) {
			return player.getHeldItem(EnumHand.OFF_HAND);
		} else if (this.isAmmo(player.getHeldItem(EnumHand.MAIN_HAND))) {
			return player.getHeldItem(EnumHand.MAIN_HAND);
		} else {
			for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
				ItemStack itemstack = player.inventory.getStackInSlot(i);
				
				if (this.isAmmo(itemstack)) {
					return itemstack;
				}
			}
			
			return ItemStack.EMPTY;
		}
	}
	
	protected boolean isAmmo(ItemStack stack) {
		return stack.getItem() == ModItems.FLARE_AMMO;
	}
	
	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
		if (entityLiving instanceof EntityPlayer) {
			EntityPlayer entityplayer = (EntityPlayer) entityLiving;
			boolean flag = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
			ItemStack itemstack = this.findAmmo(entityplayer);
			
			int i = this.getMaxItemUseDuration(stack) - timeLeft;
			i = ForgeEventFactory.onArrowLoose(stack, worldIn, entityplayer, i, !itemstack.isEmpty() || flag);
			if (i < 0) return;
			
			if (!itemstack.isEmpty() || flag) {
				if (itemstack.isEmpty()) {
					itemstack = new ItemStack(ModItems.FLARE_AMMO);
				}
				
				float f = 1.0F;
				
				if (f >= 0.1D) {
					boolean flag1 = entityplayer.capabilities.isCreativeMode || isAmmo(itemstack);
					
					if (!worldIn.isRemote) {
						EntityFlare entityFlare = new EntityFlare(worldIn, entityplayer, new Vec3d(1, 0, 0));
						if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
							entityFlare.setFire(100);
						}
						stack.damageItem(1, entityplayer);
						
						worldIn.spawnEntity(entityFlare);
					}
					
					worldIn.playSound(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_FIREWORK_LARGE_BLAST_FAR, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
					if (!flag1 && !entityplayer.capabilities.isCreativeMode) {
						itemstack.shrink(1);
						
						if (itemstack.isEmpty()) {
							entityplayer.inventory.deleteStack(itemstack);
						}
					}
				}
			}
		}
	}
	
	/**
	 * How long it takes to use or consume an item
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}
	
	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BOW;
	}
	
	/**
	 * Called when the equipped item is right clicked.
	 */
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		boolean flag = !findAmmo(playerIn).isEmpty();
		
		if (!playerIn.capabilities.isCreativeMode && !flag) {
			return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
		} else {
			playerIn.setActiveHand(handIn);
			return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
		}
	}
	
	@Override
	public int getItemEnchantability() {
		return 1;
	}
	
}
