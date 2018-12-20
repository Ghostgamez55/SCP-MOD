package com.mfta.scp.gui;

import com.mfta.scp.Reference;
import com.mfta.scp.SCPMain;
import com.mfta.scp.gui.client.GuiCoalGenerator;
import com.mfta.scp.gui.client.GuiScreenHungryBag;
import com.mfta.scp.gui.container.ContainerCoalGenerator;
import com.mfta.scp.gui.container.ContainerHungryBag;
import com.mfta.scp.gui.container.ContainerHungryBagInventory;
import com.mfta.scp.init.items.ItemHungryBag;
import com.mfta.scp.proxy.CommonProxy;
import com.mfta.scp.tileentity.TileEntityCoalGenerator;

import net.minecraft.client.gui.inventory.GuiScreenHorseInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerHorseChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {
	
	public static void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(SCPMain.instance, new GuiHandler());
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getTileEntity(new BlockPos(x, y, z));	
		if(ID == CommonProxy.GUI.HUNGRY_BAG.id)
			return new ContainerHungryBagInventory(player.inventory, ((ItemHungryBag)player.getHeldItemMainhand().getItem()).inventory, player);
		if(ID == Reference.GUI_COAL_GENERATOR) return new ContainerCoalGenerator(player.inventory, (TileEntityCoalGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getTileEntity(new BlockPos(x, y, z));

		if(ID == CommonProxy.GUI.HUNGRY_BAG.id)
			return new GuiScreenHungryBag(player.inventory, ((ItemHungryBag)player.getHeldItemMainhand().getItem()).inventory);
		if(ID == Reference.GUI_COAL_GENERATOR) return new GuiCoalGenerator(player.inventory, (TileEntityCoalGenerator)world.getTileEntity(new BlockPos(x,y,z)));

		return null;
	}
	
}