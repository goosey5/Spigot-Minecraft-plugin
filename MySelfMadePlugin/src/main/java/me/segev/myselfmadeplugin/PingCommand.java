package me.segev.myselfmadeplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("You aint a player stop tryina break this");
        }

        Player player=(Player) sender;
        int playersPing= player.getPing();

        if(playersPing<100){
            player.sendMessage(ChatColor.GOLD+"Your ping is: "+ChatColor.GREEN+playersPing);
        }
        else if (playersPing>200) {
            player.sendMessage(ChatColor.GOLD+"Your ping is: "+ChatColor.YELLOW+playersPing);
        }
        else if(playersPing>300){
            player.sendMessage(ChatColor.GOLD+"Your ping is: "+ChatColor.RED+playersPing);
        }
        else if (playersPing>400) {
            player.sendMessage(ChatColor.GOLD+"Your ping is: "+ChatColor.DARK_RED+playersPing);
        }
        else if(playersPing>1000){
            player.sendMessage(ChatColor.GOLD+"Your ping is: "+ChatColor.DARK_RED+playersPing);
            player.sendMessage("I didn't know you can get this much ping");
        }
        return false;
    }
}
