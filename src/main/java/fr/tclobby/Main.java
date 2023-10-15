package fr.tclobby;

import fr.tcapi.data.TryCubeData;
import fr.tcapi.data.TryCubeDataManager;
import fr.tclobby.events.GlobalEvents;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private long loaderTime;

    @Override
    public void onLoad() {
        loaderTime = System.currentTimeMillis();
    }
    
    @Override
    public void onEnable() {
        PluginManager cubeManager = Bukkit.getPluginManager();

        long endTime = System.currentTimeMillis();
        long loadTime = endTime - loaderTime;

        cubeManager.registerEvents(new GlobalEvents(), this);

        System.out.println("\n"+
                "                                           \n" +
                "           d8P                             \n" +
                "        d888888P                           \n" +
                "          ?88'    88bd88b?88   d8P         \n" +
                "          88P     88P'  `d88   88          \n" +
                "          88b    d88     ?8(  d88          \n" +
                "          `?8b  d88'     `?88P'?8b         \n" +
                "                                )88        \n" +
                "                               ,d8P        \n" +
                "                            `?888P'        \n" +
                " d8b          d8b       d8b                \n" +
                " 88P          ?88       ?88                \n" +
                "d88            88b       88b               \n" +
                "888   d8888b   888888b   888888b ?88   d8P \n" +
                "?88  d8P' ?88  88P `?8b  88P `?8bd88   88  \n" +
                " 88b 88b  d88 d88,  d88 d88,  d88?8(  d88  \n" +
                "  88b`?8888P'd88'`?88P'd88'`?88P'`?88P'?8b \n" +
                "                                        )88\n" +
                "                                       ,d8P\n" +
                "                                    `?888P'\n +" +
                " ");

        System.out.println("Le Lobby de TryCube à chargée en: " + loadTime + "ms !");
        System.out.println("La Version du server est:" + Bukkit.getVersion());
        System.out.println("Les services sont développer par : Deglam, azkv");
    }
}
