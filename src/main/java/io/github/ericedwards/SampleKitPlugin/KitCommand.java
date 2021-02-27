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
            logger.info("Giving " + player.getDisplayName() + " a kit");
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            ItemStack shield = new ItemStack(Material.SHIELD);
            ItemStack chestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
            player.getInventory().addItem(sword);
            player.getInventory().addItem(shield);
            player.getInventory().addItem(chestPlate);
            player.getInventory().addItem(helmet);
        }
        return true;
    }
}