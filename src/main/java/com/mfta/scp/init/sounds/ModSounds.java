package com.mfta.scp.init.sounds;

import com.mfta.scp.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ModSounds {
	
	private static final List<SoundEvent> SOUND_EVENTS = new ArrayList<>();
	
	public static SoundEvent NECK_SNAP = registerSound("neck_snap");
	public static SoundEvent AMBIENT_FOREST = registerSound("ambient_forest");
	public static SoundEvent AMBIENT_CAVE = registerSound("ambient_cave");
	public static SoundEvent SCP_SCREAM = registerSound("scp_scream");
	public static SoundEvent RADIO_1 = registerSound("radio_1");
	public static SoundEvent RADIO_2 = registerSound("radio_2");
	public static SoundEvent RADIO_3 = registerSound("radio_3");
	public static SoundEvent RADIO_4 = registerSound("radio_4");

	
	private static SoundEvent registerSound(String s) {
		
		ResourceLocation l = new ResourceLocation(Reference.MOD_ID, s);
		SoundEvent event = new SoundEvent(l);
		
		event.setRegistryName(s);
		SOUND_EVENTS.add(event);
		
		return event;
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<SoundEvent> e) {
		e.getRegistry().registerAll(SOUND_EVENTS.toArray(new SoundEvent[SOUND_EVENTS.size()]));
	}
}