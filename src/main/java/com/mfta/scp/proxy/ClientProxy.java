package com.mfta.scp.proxy;

import com.mfta.scp.client.model.armor.ModelHazmatSuit;
import com.mfta.scp.client.model.armor.ModelSCPArmor;
import com.mfta.scp.client.render.RenderBigFoot;
import com.mfta.scp.client.render.RenderBilly;
import com.mfta.scp.client.render.RenderFlareProjectile;
import com.mfta.scp.init.ModItems;
import com.mfta.scp.init.entity.EntityBigFoot;
import com.mfta.scp.init.entity.EntityBilly;
import com.mfta.scp.init.entity.projectiles.EntityFlare;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	private static final ModelSCPArmor SCP_ARMOR = new ModelSCPArmor();
	private static final ModelHazmatSuit HAZMAT = new ModelHazmatSuit();
	
	@Override
	public void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityBigFoot.class, new RenderBigFoot.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class, new RenderBilly.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityFlare.class, RenderFlareProjectile::new);
	}

	@Override
	public ModelBiped getArmorModel(int ID, int type) {
		if(ID == ModItems.SCP_ARMOR) {
			switch(type) {
				case 0:
					return SCP_ARMOR;
				case 1:
					return SCP_ARMOR;
			}
		}
		else if (ID == ModItems.HAZMAT_ARMOR) {
			switch(type) {
				case 0:
					return HAZMAT;
				case 1:
					return HAZMAT;
			}
		}
		return null;
	} 
}