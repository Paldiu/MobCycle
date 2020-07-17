package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LlamaType {
    private final Llama llama;
    private final Player p;
    private final TypeCycler gui;

    public LlamaType(Llama llama, Player p) {
        this.llama = llama;
        this.p = p;
        this.gui = new TypeCycler();
    }

    public void openGUI() {
        gui.clearItems();
        //
        ItemStack type1 = gui.newItem(Material.BROWN_DYE, "BROWN", ChatColor.GRAY + "Brown llama.");
        ItemStack type2 = gui.newItem(Material.LIGHT_GRAY_DYE, "CREAMY", ChatColor.GRAY + "Cream colored llama.");
        ItemStack type3 = gui.newItem(Material.GRAY_DYE, "GRAY", ChatColor.GRAY + "Gray llama.");
        ItemStack type4 = gui.newItem(Material.WHITE_DYE, "WHITE", ChatColor.GRAY + "White llama.");
        gui.setItem(2, type1, action -> {
            llama.setColor(Llama.Color.BROWN);
            p.closeInventory();
        });
        gui.setItem(3, type2, action -> {
            llama.setColor(Llama.Color.CREAMY);
            p.closeInventory();
        });
        gui.setItem(5, type3, action -> {
            llama.setColor(Llama.Color.GRAY);
            p.closeInventory();
        });
        gui.setItem(6, type4, action -> {
            llama.setColor(Llama.Color.WHITE);
            p.closeInventory();
        });
        //
        gui.open(p);
    }
}
