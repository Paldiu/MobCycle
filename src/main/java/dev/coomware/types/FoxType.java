package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class FoxType {
    private final Fox fox;
    private final Player p;
    private final TypeCycler gui;

    public FoxType(Fox fox, Player p) {
        this.gui = new TypeCycler();
        this.p = p;
        this.fox = fox;
    }

    public void openGUI() {
        gui.clearItems();
        //
        ItemStack type1 = gui.newItem(Material.RED_DYE, "RED", ChatColor.GRAY + "Red (default) fox.");
        ItemStack type2 = gui.newItem(Material.WHITE_DYE, "SNOW", ChatColor.GRAY + "Snow fox.");
        gui.setItem(3, type1, action -> {
            fox.setFoxType(Fox.Type.RED);
            p.closeInventory();
        });
        gui.setItem(5, type2, action -> {
            fox.setFoxType(Fox.Type.SNOW);
            p.closeInventory();
        });
        //
        gui.open(p);
    }
}
