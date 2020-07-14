package dev.coomware;

import dev.coomware.util.CycleListener;
import org.bukkit.plugin.java.JavaPlugin;

public class MobCycle extends JavaPlugin {
    @Override
    public void onEnable() {
        new CycleListener(this);
    }

    @Override
    public void onDisable() {

    }
}
