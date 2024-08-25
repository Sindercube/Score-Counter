package com.sindercube.scoreCounter.fabric.mixin;

import com.sindercube.scoreCounter.ScoreCounterRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Inject(method = "render", at = @At(value = "TAIL"))
    public void render(DrawContext context, float t, CallbackInfo ci) {
        ScoreCounterRenderer.drawScoreCounter(context);
    }

}
