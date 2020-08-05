package cn.coldshine.cute;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.player.PlayerJoinEvent;

public final class CuteColdshine extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
      getLogger().info("小可爱泠曦已上线！");
        getCommand("cute").setExecutor(this);
        getCommand("luoni").setExecutor(new Luoni());
        getCommand("mian").setExecutor(new Mian());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("cute")) {
    sender.sendMessage("§1[小可爱]恭喜你发现我啦！");
    return true;
    }

        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
      getLogger().info("小可爱泠曦已下线！");
    }
}
