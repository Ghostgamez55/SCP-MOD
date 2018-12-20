package com.mfta.scp.gui.client;

import com.mfta.scp.Reference;
import com.mfta.scp.gui.container.ContainerCoalGenerator;
import com.mfta.scp.tileentity.TileEntityCoalGenerator;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCoalGenerator extends GuiContainer
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/coal_generator.png");
	private final InventoryPlayer player;
	private final TileEntityCoalGenerator tileentity;
	
	
	public GuiCoalGenerator(InventoryPlayer player, TileEntityCoalGenerator titleentity)
	{
		super(new ContainerCoalGenerator(player, titleentity));
		this.player = player;
		this.tileentity = titleentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2), -5, 6);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 7, this.ySize - 96 + 2, 4210752);
		this.fontRenderer.drawString(Integer.toString(this.tileentity.gotEnergyStored()), 143, 71, 4210752);
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 113, this.guiTop + 32, 176, 14, l + 1, 16);
		
		int k = this.gotEnergyStoredScaled(64);
		this.drawTexturedModalRect(this.guiLeft + 152, this.guiTop + 7, 176, 32, 16, 65 - k);
		
	}

	private int gotEnergyStoredScaled(int pixels) 
	{
		int i = this.tileentity.gotEnergyStored();
		int j = this.tileentity.getMaxEnergyStored();
		return i != 0 && j != 0 ? i = pixels / j : 0;
	}

	private int getCookProgressScaled(int pixels) 
	{
		int i = this.tileentity.cookTime;
		return i != 0 ? i = pixels / 25 : 0;
	}
}
