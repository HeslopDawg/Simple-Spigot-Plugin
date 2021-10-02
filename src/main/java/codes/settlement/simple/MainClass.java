package codes.settlement.simple;

import codes.settlement.simple.commands.HelloCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "YourPlugin has been enabled!");

        // Enable your commands
        getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "YourPlugin has been disabled!");
    }
}
