package dev.felnull.imp.forge;

import dev.architectury.platform.neoforge.EventBuses;
import dev.felnull.imp.IamMusicPlayer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IamMusicPlayer.MODID)
public class IamMusicPlayerForge {
    public IamMusicPlayerForge() {
        EventBuses.registerModEventBus(IamMusicPlayer.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        IamMusicPlayer.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(FMLCommonSetupEvent e) {
        IamMusicPlayer.setup();
    }
}
