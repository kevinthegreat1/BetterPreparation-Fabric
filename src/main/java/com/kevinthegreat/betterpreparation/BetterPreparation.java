package com.kevinthegreat.betterpreparation;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterPreparation implements ModInitializer {
	public static final String MOD_ID = "betterpreparation";
	public static final String MOD_NAME = "Better Preparation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_NAME + " initialized.");
	}
}
