package com.sindercube.scoreCounter;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.awt.*;

public final class ScoreCounterRenderer {

    public static final MinecraftClient CLIENT = MinecraftClient.getInstance();
    public static final TextRenderer TEXT_RENDERER = CLIENT.textRenderer;
    public static final Window WINDOW = CLIENT.getWindow();

    public static void drawScoreCounter(DrawContext context) {
        ClientPlayerEntity player = CLIENT.player;
        if (player == null) return;

        String rawScore = Integer.toString(player.getScore());
        Text score = Text.literal(rawScore).formatted(Formatting.YELLOW);
        Text scoreDisplay = Text.translatable("deathScreen.score").append(": ").append(score);

        int x = WINDOW.getScaledWidth() - TEXT_RENDERER.getWidth(scoreDisplay) - 4;
        int y = 0;
        context.drawTextWithShadow(
                TEXT_RENDERER,
                scoreDisplay,
                x + 2,
                y + 2,
                Color.WHITE.getRGB()
        );
    }

}
