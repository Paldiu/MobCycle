package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ParrotType {
    private final Parrot parrot;
    private final Player p;
    private final TypeCycler gui;

    public ParrotType(Parrot parrot, Player p) {
        this.gui = new TypeCycler();
        this.parrot = parrot;
        this.p = p;
    }

    public void openGUI() {
        gui.clearItems();
        //
        ItemStack type1 = gui.newItem(Material.BLUE_DYE, "BLUE", ChatColor.GRAY + "Royal blue colored parrot.");
        ItemStack type2 = gui.newItem(Material.LIGHT_BLUE_DYE, "CYAN", ChatColor.GRAY + "Cyan colored parrot.");
        ItemStack type3 = gui.newItem(Material.LIGHT_GRAY_DYE, "GRAY", ChatColor.GRAY + "Gray colored parrot.");
        ItemStack type4 = gui.newItem(Material.LIME_DYE, "GREEN", ChatColor.GRAY + "Green colored parrot.");
        ItemStack type5 = gui
                .newItem(Material.RED_DYE, "RED", ChatColor.GRAY + "Classic parrot - red with colored wing tips.");

        gui.setItem(2, type1, action -> {
            parrot.setVariant(Parrot.Variant.BLUE);
            p.closeInventory();
        });
        gui.setItem(3, type2, action -> {
            parrot.setVariant(Parrot.Variant.CYAN);
            p.closeInventory();
        });
        gui.setItem(4, type3, action -> {
            parrot.setVariant(Parrot.Variant.GRAY);
            p.closeInventory();
        });
        gui.setItem(5, type4, action -> {
            parrot.setVariant(Parrot.Variant.GREEN);
            p.closeInventory();
        });
        gui.setItem(6, type5, action -> {
            parrot.setVariant(Parrot.Variant.RED);
            p.closeInventory();
        });
        //
        gui.open(p);
    }
}
