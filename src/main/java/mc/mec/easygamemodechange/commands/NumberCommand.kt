package mc.mec.easygamemodechange.commands

import mc.mec.easygamemodechange.commands.GmCommand.setAdventure
import mc.mec.easygamemodechange.commands.GmCommand.setCreative
import mc.mec.easygamemodechange.commands.GmCommand.setSpectator
import mc.mec.easygamemodechange.commands.GmCommand.setSurvival
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender
import org.bukkit.entity.Player

object NumberCommand : CommandExecutor {
    val _prefix = "§b&l[EGC]"
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val p = sender as Player
        if (sender is ConsoleCommandSender) {
            sender.sendMessage("This command can only be executed by a player.")
            return false
        }
        if(p.hasPermission("egc.use")){
            p.sendMessage("$_prefix §4§lYou don't have permission.")
        }
        when (command.name) {
            "1" -> {
                setCreative(p)
            }
            "2" -> {
                setAdventure(p)
            }
            "3" -> {
                setSpectator(p)
            }
            "0" -> {
                setSurvival(p)
            }
        }
        return true
    }

}