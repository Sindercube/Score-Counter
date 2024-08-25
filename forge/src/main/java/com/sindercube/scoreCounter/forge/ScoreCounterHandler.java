package com.sindercube.scoreCounter.forge;

import com.sindercube.scoreCounter.ScoreCounter;
import com.sindercube.scoreCounter.ScoreCounterRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ScoreCounter.MOD_ID, value = Dist.CLIENT)
public class ScoreCounterHandler {

    @SubscribeEvent
    public static void onRenderGuiOverlay(RenderGuiOverlayEvent.Post event) {
        if (event.getOverlay() == VanillaGuiOverlay.HOTBAR.type()) ScoreCounterRenderer.drawScoreCounter(event.getGuiGraphics());
    }

}
