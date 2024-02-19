package ldahleen54.phantomimproved;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class PhantomImproved extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "PhantomImproved plugin has started");
        getServer().getPluginManager().registerEvents(new PhantomSpawnListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "PhantomImproved plugin has stopped");
    }
}
