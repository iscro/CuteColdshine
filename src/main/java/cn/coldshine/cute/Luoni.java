package cn.coldshine.cute;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Luoni implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("luoni")) {
        sender.sendMessage("§d[小洛妮]小小小小小小小小小小小小小小小小小小小小小洛妮");
        return true;
    }
    return false;
    }
}
