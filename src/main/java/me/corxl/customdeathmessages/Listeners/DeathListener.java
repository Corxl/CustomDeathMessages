package me.corxl.customdeathmessages.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {


    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        String message = event.getDeathMessage().replace(event.getEntity().getName(), event.getEntity().getDisplayName());
        event.setDeathMessage(message);
    }
}
