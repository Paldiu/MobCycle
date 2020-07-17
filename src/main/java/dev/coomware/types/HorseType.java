package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HorseType {
    private final TypeCycler gui;
    private final TypeCycler.SubTypes subTypes;
    //
    private final Horse horse;
    private final Player p;

    public HorseType(Horse horse, Player p) {
        this.horse = horse;
        this.p = p;
        this.gui = new TypeCycler();
        this.subTypes = new TypeCycler.SubTypes();
    }

    public void openGUI() {
        gui.clearItems();
        subTypes.clearItems();
        //
        ItemStack type1 = gui.newItem(Material.WHITE_WOOL, "WHITE", ChatColor.GRAY + "Snow white.");
        ItemStack type2 = gui.newItem(Material.GRAY_WOOL, "GRAY", ChatColor.GRAY + "Gray.");
        ItemStack type3 = gui.newItem(Material.BROWN_WOOL, "DARK_BROWN", ChatColor.GRAY + "Dark brown.");
        ItemStack type4 = gui.newItem(Material.BROWN_CONCRETE, "BROWN", ChatColor.GRAY + "Light brown.");
        ItemStack type5 = gui.newItem(Material.BROWN_TERRACOTTA, "CREAMY", ChatColor.GRAY + "Very light brown/");
        ItemStack type6 = gui.newItem(Material.BROWN_DYE, "CHESTNUT", ChatColor.GRAY + "Chestnut.");
        ItemStack type7 = gui.newItem(Material.BLACK_WOOL, "BLACK", ChatColor.GRAY + "Pitch black.");
        //
        ItemStack sub1 = subTypes.newItem(Material.BARRIER, "NONE", ChatColor.GRAY + "No markings.");
        ItemStack sub2 = subTypes.newItem(Material.WHITE_WOOL, "WHITE", ChatColor.GRAY + "White socks or stripes.");
        ItemStack sub3 = subTypes.newItem(Material.WHITE_DYE, "WHITEFIELD", ChatColor.GRAY + "Milky splotches.");
        ItemStack sub4 = subTypes.newItem(Material.BONE_MEAL, "WHITE_DOTS", ChatColor.GRAY + "Round white dots.");
        ItemStack sub5 = subTypes.newItem(Material.BLACK_DYE, "BLACK_DOTS", ChatColor.GRAY + "Small black dots.");
        //
        gui.setItem(1, type1, click -> {
            horse.setColor(Horse.Color.WHITE);
            subTypes.open(p);
        });
        gui.setItem(2, type2, click -> {
            horse.setColor(Horse.Color.GRAY);
            subTypes.open(p);
        });
        gui.setItem(3, type3, click -> {
            horse.setColor(Horse.Color.DARK_BROWN);
            subTypes.open(p);
        });
        gui.setItem(4, type4, click -> {
            horse.setColor(Horse.Color.BROWN);
            subTypes.open(p);
        });
        gui.setItem(5, type5, click -> {
            horse.setColor(Horse.Color.CREAMY);
            subTypes.open(p);
        });
        gui.setItem(6, type6, click -> {
            horse.setColor(Horse.Color.CHESTNUT);
            subTypes.open(p);
        });
        gui.setItem(7, type7, click -> {
            horse.setColor(Horse.Color.BLACK);
            subTypes.open(p);
        });
        subTypes.setItem(2, sub1, click -> {
            horse.setStyle(Horse.Style.NONE);
            p.closeInventory();
        });
        subTypes.setItem(3, sub2, click -> {
            horse.setStyle(Horse.Style.WHITE);
            p.closeInventory();
        });
        subTypes.setItem(4, sub3, click -> {
            horse.setStyle(Horse.Style.WHITEFIELD);
            p.closeInventory();
        });
        subTypes.setItem(5, sub4, click -> {
            horse.setStyle(Horse.Style.WHITE_DOTS);
            p.closeInventory();
        });
        subTypes.setItem(6, sub5, click -> {
            horse.setStyle(Horse.Style.BLACK_DOTS);
            p.closeInventory();
        });
        gui.open(p);
    }

}
