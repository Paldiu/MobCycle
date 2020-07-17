package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.inventory.ItemStack;

public class SheepType {
    private final Sheep sheep;
    private final Player p;
    private final TypeCycler.Body body;
    
    public SheepType(Sheep sheep, Player p) {
        this.body = new TypeCycler.Body();
        this.sheep = sheep;
        this.p = p;
    }
    
    public void openGUI() {
        body.clearItems();
        //
        ItemStack col1 = body.newItem(Material.BLACK_DYE, "BLACK");
        ItemStack col2 = body.newItem(Material.BLUE_DYE, "BLUE");
        ItemStack col3 = body.newItem(Material.BROWN_DYE, "BROWN");
        ItemStack col4 = body.newItem(Material.CYAN_DYE, "CYAN");
        ItemStack col5 = body.newItem(Material.GRAY_DYE, "GRAY");
        ItemStack col6 = body.newItem(Material.GREEN_DYE, "GREEN");
        ItemStack col7 = body.newItem(Material.LIGHT_BLUE_DYE, "LIGHT_BLUE");
        ItemStack col8 = body.newItem(Material.LIGHT_GRAY_DYE, "LIGHT_GRAY");
        ItemStack col9 = body.newItem(Material.LIME_DYE, "LIME");
        ItemStack col10 = body.newItem(Material.MAGENTA_DYE, "MAGENTA");
        ItemStack col11 = body.newItem(Material.ORANGE_DYE, "ORANGE");
        ItemStack col12 = body.newItem(Material.PINK_DYE, "PINK");
        ItemStack col13 = body.newItem(Material.PURPLE_DYE, "PURPLE");
        ItemStack col14 = body.newItem(Material.RED_DYE, "RED");
        ItemStack col15 = body.newItem(Material.WHITE_DYE, "WHITE");
        ItemStack col16 = body.newItem(Material.YELLOW_DYE, "YELLOW");
        //
        body.setItem(1, col1, action -> {
            sheep.setColor(DyeColor.BLACK);
            p.closeInventory();
        });
        body.setItem(2, col2, action -> {
            sheep.setColor(DyeColor.BLUE);
            p.closeInventory();
        });
        body.setItem(3, col3, action -> {
            sheep.setColor(DyeColor.BROWN);
            p.closeInventory();
        });
        body.setItem(4, col4, action -> {
            sheep.setColor(DyeColor.CYAN);
            p.closeInventory();
        });
        body.setItem(5, col5, action -> {
            sheep.setColor(DyeColor.GRAY);
            p.closeInventory();
        });
        body.setItem(6, col6, action -> {
            sheep.setColor(DyeColor.GREEN);
            p.closeInventory();
        });
        body.setItem(7, col7, action -> {
            sheep.setColor(DyeColor.LIGHT_BLUE);
            p.closeInventory();
        });
        body.setItem(9, col8, action -> {
            sheep.setColor(DyeColor.LIGHT_GRAY);
            p.closeInventory();
        });
        body.setItem(10, col9, action -> {
            sheep.setColor(DyeColor.LIME);
            p.closeInventory();
        });
        body.setItem(11, col10, action -> {
            sheep.setColor(DyeColor.MAGENTA);
            p.closeInventory();
        });
        body.setItem(12, col11, action -> {
            sheep.setColor(DyeColor.ORANGE);
            p.closeInventory();
        });
        body.setItem(13, col12, action -> {
            sheep.setColor(DyeColor.PINK);
            p.closeInventory();
        });
        body.setItem(14, col13, action -> {
            sheep.setColor(DyeColor.PURPLE);
            p.closeInventory();
        });
        body.setItem(15, col14, action -> {
            sheep.setColor(DyeColor.RED);
            p.closeInventory();
        });
        body.setItem(16, col15, action -> {
            sheep.setColor(DyeColor.WHITE);
            p.closeInventory();
        });
        body.setItem(17, col16, action -> {
            sheep.setColor(DyeColor.YELLOW);
            p.closeInventory();
        });
        //
        body.open(p);
    }
}
