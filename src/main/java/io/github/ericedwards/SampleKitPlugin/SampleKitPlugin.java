package io.github.ericedwards.SampleKitPlugin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class SampleKitPlugin extends JavaPlugin {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void onEnable() {
        logger.info("Enabling SampleKitPlugin");
        this.getCommand("kit").setExecutor(new KitCommand());
    }

    @Override
    public void onDisable() {
        logger.info("Disabling SampleKitPlugin");
    }
}
