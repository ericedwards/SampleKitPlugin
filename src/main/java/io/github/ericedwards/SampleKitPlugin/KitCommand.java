package io.github.ericedwards.SampleKitPlugin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitCommand implements CommandExecutor {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            logger.info("Giving " + player.getDisplayName() + " a diamond sword");
            player.getInventory().addItem(sword);
        }
        return true;
    }
}