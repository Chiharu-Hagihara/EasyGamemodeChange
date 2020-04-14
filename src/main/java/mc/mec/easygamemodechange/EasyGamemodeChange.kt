package mc.mec.easygamemodechange

import mc.mec.easygamemodechange.commands.GmCommand
import mc.mec.easygamemodechange.commands.ModeCommand
import mc.mec.easygamemodechange.commands.NumberCommand
import org.bukkit.plugin.java.JavaPlugin

class EasyGamemodeChange : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        // Plugin startup logic
        getCommand("1")?.setExecutor(NumberCommand)
        getCommand("2")?.setExecutor(NumberCommand)
        getCommand("3")?.setExecutor(NumberCommand)
        getCommand("0")?.setExecutor(NumberCommand)
        getCommand("gm")?.setExecutor(GmCommand)
        getCommand("creative")?.setExecutor(ModeCommand)
        getCommand("adventure")?.setExecutor(ModeCommand)
        getCommand("spectator")?.setExecutor(ModeCommand)
        getCommand("survival")?.setExecutor(ModeCommand)

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}