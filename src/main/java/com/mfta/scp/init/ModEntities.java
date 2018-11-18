package com.mfta.scp.init;

import com.mfta.scp.Reference;
import com.mfta.scp.SCPMain;
import com.mfta.scp.init.entity.EntityBigFoot;
import com.mfta.scp.init.entity.EntityBilly;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * @author SoggyMustache
 */
public class ModEntities {

	private static int id = 0;

	public static void registerEntity() {
		createEntity(EntityBilly.class, "Billy", 0x000000, 0x000000);
		createEntity(EntityBigFoot.class, "BigFoot", 0x000000, 0x000000);
	}
	
	private static void createEntity(Class entityClass, String entityName, int prim, int sec) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + entityName), entityClass, entityName, id++, SCPMain.instance, 90, 1, true, prim, sec);
	}

	private static void createEntityNE(Class entityClass, String entityName) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + entityName), entityClass, entityName, id++, SCPMain.instance, 90, 1, true);
	}
}
