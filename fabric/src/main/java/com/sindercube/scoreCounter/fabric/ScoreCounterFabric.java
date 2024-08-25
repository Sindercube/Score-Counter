package com.sindercube.scoreCounter.fabric;

import com.sindercube.scoreCounter.ScoreCounter;
import net.fabricmc.api.ClientModInitializer;

public final class ScoreCounterFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScoreCounter.init();
    }

}
