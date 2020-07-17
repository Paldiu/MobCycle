package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Cat;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CatType {
    private final TypeCycler gui;
    private final Cat cat;
    private final Player p;

    public CatType(Cat cat, Player p) {
        this.gui = new TypeCycler();
        this.cat = cat;
        this.p = p;
    }

    public void openGUI() {
        gui.clearItems();
        //
        ItemStack type1 = gui.newItem(Material.WHITE_DYE, "WHITE", ChatColor.GRAY + "White cat.");
        ItemStack type2 = gui.newItem(Material.LIGHT_GRAY_DYE, "TABBY", ChatColor.GRAY + "Tabby cat.");
        ItemStack type3 = gui.newItem(Material.BROWN_DYE, "SIAMESE", ChatColor.GRAY + "Siamese cat.");
        ItemStack type4 = gui.newItem(Material.RED_DYE, "RED", ChatColor.GRAY + "Red cat.");
        ItemStack type5 = gui.newItem(Material.YELLOW_DYE, "RAGDOLL", ChatColor.GRAY + "Ragdoll cat/");
        ItemStack type6 = gui.newItem(Material.BLUE_DYE, "PERSIAN", ChatColor.GRAY + "Persian cat.");
        ItemStack type7 = gui.newItem(Material.ORANGE_DYE, "JELLIE", ChatColor.GRAY + "Jellie cat.");
        ItemStack type8 = gui.newItem(Material.GREEN_DYE, "CALICO", ChatColor.GRAY + "Calico cat.");
        ItemStack type9 = gui.newItem(Material.PURPLE_DYE, "BRITISH_SHORTHAIR", ChatColor.GRAY + "British Shorthair cat.");
        ItemStack type10 = gui.newItem(Material.GRAY_DYE, "BLACK", ChatColor.GRAY + "Black cat.");
        ItemStack type11 = gui.newItem(Material.BLACK_DYE, "ALL_BLACK", ChatColor.GRAY + "All black cat.");
        //
        gui.setItem(2, type1, action -> {
            cat.setCatType(Cat.Type.WHITE);
            p.closeInventory();
        });
        gui.setItem(3, type2, action -> {
            cat.setCatType(Cat.Type.TABBY);
            p.closeInventory();
        });
        gui.setItem(4, type3, action -> {
            cat.setCatType(Cat.Type.SIAMESE);
            p.closeInventory();
        });
        gui.setItem(5, type4, action -> {
            cat.setCatType(Cat.Type.RED);
            p.closeInventory();
        });
        gui.setItem(6, type5, action -> {
            cat.setCatType(Cat.Type.RAGDOLL);
            p.closeInventory();
        });
        gui.setItem(10, type6, action -> {
            cat.setCatType(Cat.Type.PERSIAN);
            p.closeInventory();
        });
        gui.setItem(11, type7, action -> {
            cat.setCatType(Cat.Type.JELLIE);
            p.closeInventory();
        });
        gui.setItem(12, type8, action -> {
            cat.setCatType(Cat.Type.CALICO);
            p.closeInventory();
        });
        gui.setItem(14, type9, action -> {
            cat.setCatType(Cat.Type.BRITISH_SHORTHAIR);
            p.closeInventory();
        });
        gui.setItem(15, type10, action -> {
            cat.setCatType(Cat.Type.BLACK);
            p.closeInventory();
        });
        gui.setItem(16, type11, action -> {
            cat.setCatType(Cat.Type.ALL_BLACK);
            p.closeInventory();
        });
        gui.open(p);
    }
}
