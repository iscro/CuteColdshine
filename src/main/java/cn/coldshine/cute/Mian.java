package cn.coldshine.cute;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Mian implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mian")) {
            sender.sendMessage("§a[Mian]免面棉眠FreeNoodleCottonSleep");
            return true;
        }
        return false;
    }
}
