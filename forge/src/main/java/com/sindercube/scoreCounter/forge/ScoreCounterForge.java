package com.sindercube.scoreCounter.forge;

import com.sindercube.scoreCounter.ScoreCounter;
import com.sindercube.scoreCounter.ScoreCounterRenderer;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(ScoreCounter.MOD_ID)
public final class ScoreCounterForge {

    public ScoreCounterForge() {
        ScoreCounter.init();
    }

}
