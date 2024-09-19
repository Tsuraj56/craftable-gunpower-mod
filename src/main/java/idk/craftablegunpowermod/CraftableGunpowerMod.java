package idk.craftablegunpowermod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftableGunpowerMod implements ModInitializer {
	public static final String MOD_ID = "craftable-gunpower-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {LOGGER.info("Hello Fabric world!");
	}
}