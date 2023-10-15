package fr.tclobby.events;

import fr.tcapi.data.TryCubeData;
import fr.tcapi.integration.Titles;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class GlobalEvents implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        TryCubeData cubeData = new TryCubeData(p.getUniqueId());

        e.setJoinMessage(null);
        Location cubeSpawn = new Location(Bukkit.getWorld("world"), 34.5, 37.5, -17.5, -135, 0);

        p.teleport(cubeSpawn);
        p.setWalkSpeed(0.25F);
        p.setGameMode(GameMode.ADVENTURE);
        p.getInventory().clear();

        if(cubeData.file.exists()) {
            Titles.sendCustomTitle(p, "§3§lTry§f§lCube", "§3§l§ki§f§l Bon retour " + p.getName() + " ! §3§l§ki", 3, 60, 3);
            p.sendMessage("§3§m---------------------§r§b Try§fCube §3§m---------------------§r" );
            p.sendMessage("                         §7Site: §b%website%                      ");
            p.sendMessage("                         §7Boutique: §b%store%                      ");
            p.sendMessage("                         §7Discord: §b%discord%                      ");
            p.sendMessage("§3§m--------------------------------------------------§r");
        } else {
            Titles.sendCustomTitle(p, "§3§lTry§f§lCube", "§3§l§ki§f§l Bienvenue " + p.getName() + " ! §3§l§ki", 3, 60, 3);
            p.sendMessage("§3§m---------------------§r§b Try§fCube §3§m---------------------§r" );
            p.sendMessage("                         §7Site: §b%website%                      ");
            p.sendMessage("                         §7Boutique: §b%store%                      ");
            p.sendMessage("                         §7Discord: §b%discord%                      ");
            p.sendMessage("§3§m--------------------------------------------------§r");
            p.sendMessage("§f");
            p.sendMessage("§7(Toute l'équipe du serveur vous souhaite la bienvenue sur nos serveurs !)");
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage(null);
    }
}
