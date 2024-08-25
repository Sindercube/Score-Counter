package com.sindercube.scoreCounter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ScoreCounter {

    public static final String MOD_ID = "score_counter";
    public static final Logger LOGGER = LoggerFactory.getLogger("Score Counter");

    public static void init() {
        LOGGER.info("Initialized!");
    }

}
