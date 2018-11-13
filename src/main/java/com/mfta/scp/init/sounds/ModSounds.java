package com.mfta.scp.init.sounds;

import com.mfta.scp.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds {

	public static SoundEvent NECK_SNAP;

	public static void registerSounds() {
		NECK_SNAP = registerSound(Reference.MOD_ID + ":neck_snap");
	}

	private static SoundEvent registerSound(String s) {
		ResourceLocation l = new ResourceLocation(s);
		SoundEvent event = new SoundEvent(l);
		event.setRegistryName(s);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}