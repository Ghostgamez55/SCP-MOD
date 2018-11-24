package com.mfta.scp.gui.container;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerHungryBag extends InventoryBasic
{
    public ContainerHungryBag(String inventoryTitle, int slotCount)
    {
        super(inventoryTitle, false, slotCount);
    }

    @SideOnly(Side.CLIENT)
    public ContainerHungryBag(ITextComponent inventoryTitle, int slotCount)
    {
        super(inventoryTitle, slotCount);
    }
    
    @Override
    public ItemStack addItem(ItemStack stack) {
    	return super.addItem(stack);
    }
}