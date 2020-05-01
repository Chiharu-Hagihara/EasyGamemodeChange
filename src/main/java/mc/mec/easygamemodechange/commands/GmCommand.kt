package mc.mec.easygamemodechange.commands

import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.ConsoleCommandSender
import org.bukkit.entity.Player

object GmCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val p = sender as Player
        if (sender is ConsoleCommandSender) {
            sender.sendMessage("This command can only be executed by a player.")
            return false
        }
        if(p.hasPermission("egc.use")) {
            if (command.name == "gm") {
                when (args[0]) {
                    "c" -> {
                        setCreative(p)
                    }
                    "a" -> {
                        setAdventure(p)
                    }
                    "sp" -> {
                        setSpectator(p)
                    }
                    "s" -> {
                        setSurvival(p)
                    }
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
                    "creative" -> {
                        setCreative(p)
                    }
                    "adventure" -> {
                        setAdventure(p)
                    }
                    "spectator" -> {
                        setSpectator(p)
                    }
                    "survival" -> {
                        setSurvival(p)
                    }
                    else -> {
                        showHelp(p)
                    }
                }
            }
        }else {
            p.sendMessage("§4§lYou don't have permission.")
        }
        return true
    }
    fun showHelp(p: Player){
        p.sendMessage("§f/<1/2/3/0>")
        p.sendMessage("§f/gm <1/2/3/0>")
        p.sendMessage("§f/gm <c/a/sp/s>")
        p.sendMessage("§f/gm creative")
        p.sendMessage("§f/gm adventure")
        p.sendMessage("§f/gm spectator")
        p.sendMessage("§f/gm survival")
        p.sendMessage("§f/creative")
        p.sendMessage("§f/adventure")
        p.sendMessage("§f/spectator")
        p.sendMessage("§f/spectator")
    }

    fun setCreative(p: Player) {
        p.gameMode = GameMode.CREATIVE
        p.sendMessage("§6ゲームモードをクリエイティブに変更しました。")
    }

    fun setSurvival(p: Player) {
        p.gameMode = GameMode.SURVIVAL
        p.sendMessage("§6ゲームモードをサバイバルに変更しました。")
    }

    fun setAdventure(p: Player) {
        p.gameMode = GameMode.ADVENTURE
        p.sendMessage("§6ゲームモードをアドベンチャーに変更しました。")
    }

    fun setSpectator(p: Player) {
        p.gameMode = GameMode.SPECTATOR
        p.sendMessage("§6ゲームモードをスペクテイターに変更しました。")
    }
}