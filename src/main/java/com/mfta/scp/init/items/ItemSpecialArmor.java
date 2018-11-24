package com.mfta.scp.init.items;

import com.mfta.scp.SCPMain;
import com.mfta.scp.tabs.SCPTabs;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSpecialArmor extends ItemArmor{

	private int ID;
	
	public ItemSpecialArmor(int ID, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.ID = ID;
		this.setCreativeTab(SCPTabs.SCP_TAB_ITEMS);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		if(itemStack != null) {
			if(itemStack.getItem() instanceof ItemArmor) {
				EntityEquipmentSlot type = ((ItemArmor)itemStack.getItem()).armorType;
				ModelBiped armorModel = null;
				
				switch(type) {
					case HEAD:
					case LEGS:
						armorModel = SCPMain.proxy.getArmorModel(ID, 0);
						break;
					case FEET:
					case CHEST:
						armorModel = SCPMain.proxy.getArmorModel(ID, 1);
						break;
					default:
						break;
				}
				
				armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				armorModel.bipedRightArm.showModel = armorModel.bipedLeftArm.showModel = armorModel.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg.showModel = armorModel.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS || armorSlot == EntityEquipmentSlot.FEET);
				
				armorModel.isSneak = _default.isSneak;
				armorModel.isRiding = _default.isRiding;
				armorModel.isChild = _default.isChild;
				armorModel.rightArmPose = _default.rightArmPose;
				armorModel.leftArmPose = _default.leftArmPose;
				
				return armorModel;
			}
		}
		return null;
	}
	
}
 