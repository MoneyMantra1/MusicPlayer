package dev.felnull.imp.forge.handler;

import dev.felnull.imp.IamMusicPlayer;
import dev.felnull.imp.data.IamMusicPlayerDataGenerator;
import dev.felnull.otyacraftengine.neoforge.data.CrossDataGeneratorAccesses;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IamMusicPlayer.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenHandler {
    @SubscribeEvent
    public static void onDataGen(GatherDataEvent event) {
        IamMusicPlayerDataGenerator.init(CrossDataGeneratorAccesses.create(event));
    }
}
