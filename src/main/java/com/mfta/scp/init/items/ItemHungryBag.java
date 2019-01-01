package com.mfta.scp.init.items;

import com.mfta.scp.SCPMain;
import com.mfta.scp.proxy.CommonProxy;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;

public class ItemHungryBag extends ItemSCP {

	public IInventory inventory;
	
	public ItemHungryBag() {
		this.inventory = new InventoryBasic("Hungry Bag", true, 5);
	}
	 
	public net.minecraft.util.ActionResult<net.minecraft.item.ItemStack> onItemRightClick(net.minecraft.world.World worldIn, net.minecraft.entity.player.EntityPlayer playerIn, net.minecraft.util.EnumHand handIn) {
		
		playerIn.openGui(SCPMain.instance, CommonProxy.GUI.HUNGRY_BAG.id, worldIn, (int)Math.floor(playerIn.posX), (int)Math.floor(playerIn.posY), (int)Math.floor(playerIn.posZ));
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
		
}
