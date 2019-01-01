package com.mfta.scp.gui.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerHungryBagInventory extends Container
{
    private final IInventory bagInventory;

    public ContainerHungryBagInventory(IInventory playerInventory, IInventory bagInventoryIn, EntityPlayer player)
    {
        this.bagInventory = bagInventoryIn;
        int i = 3;
        bagInventoryIn.openInventory(player);
        int j = -18;

        Slot s = new Slot(bagInventoryIn, 3, 44 + 2 * 18, 20) {
        	
        	@Override
        	public void onSlotChanged() {
        		
        		bagInventoryIn.clear();
        		super.onSlotChanged();
        	
        	}
        };
        
        this.addSlotToContainer(s);

        for (int l = 0; l < 3; ++l)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new Slot(playerInventory, k + l * 9 + 9, 8 + k * 18, l * 18 + 51));
            }
        }

        for (int i1 = 0; i1 < 9; ++i1)
        {
            this.addSlotToContainer(new Slot(playerInventory, i1, 8 + i1 * 18, 109));
        }
    }

    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        return ItemStack.EMPTY;
    }

    public void onContainerClosed(EntityPlayer playerIn)
    {
        super.onContainerClosed(playerIn);
        this.bagInventory.closeInventory(playerIn);
    }
}