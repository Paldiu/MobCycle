package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TropicalFish;
import org.bukkit.inventory.ItemStack;

public class TropicalFishType {
    private final TropicalFish fish;
    private final Player p;
    private final TypeCycler gui;
    private final TypeCycler.Pattern pattern;
    private final TypeCycler.Body body;

    public TropicalFishType(TropicalFish fish, Player p) {
        this.gui = new TypeCycler();
        this.pattern = new TypeCycler.Pattern();
        this.body = new TypeCycler.Body();
        this.fish = fish;
        this.p = p;
    }

    public void openGUI() {
        // Fish Pattern Type \\
        ItemStack type1 = gui.newItem(Material.WHITE_DYE, "BETTY");
        ItemStack type2 = gui.newItem(Material.LIGHT_GRAY_DYE, "BLOCKFISH");
        ItemStack type3 = gui.newItem(Material.GRAY_DYE, "BRINELY");
        ItemStack type4 = gui.newItem(Material.RED_DYE, "CLAYFISH");
        ItemStack type5 = gui.newItem(Material.ORANGE_DYE, "DASHER");
        ItemStack type6 = gui.newItem(Material.YELLOW_DYE, "FLOPPER");
        ItemStack type7 = gui.newItem(Material.LIME_DYE, "GLITTER");
        ItemStack type8 = gui.newItem(Material.BLUE_DYE, "KOB");
        ItemStack type9 = gui.newItem(Material.PURPLE_DYE, "SNOOPER");
        ItemStack type10 = gui.newItem(Material.PINK_DYE, "SPOTTY");
        ItemStack type11 = gui.newItem(Material.BROWN_DYE, "STRIPEY");
        ItemStack type12 = gui.newItem(Material.BLACK_DYE, "SUNSTREAK");
        // Fish Pattern Color \\
        ItemStack pat1 = pattern.newItem(Material.BLACK_DYE, "BLACK");
        ItemStack pat2 = pattern.newItem(Material.BLUE_DYE, "BLUE");
        ItemStack pat3 = pattern.newItem(Material.BROWN_DYE, "BROWN");
        ItemStack pat4 = pattern.newItem(Material.CYAN_DYE, "CYAN");
        ItemStack pat5 = pattern.newItem(Material.GRAY_DYE, "GRAY");
        ItemStack pat6 = pattern.newItem(Material.GREEN_DYE, "GREEN");
        ItemStack pat7 = pattern.newItem(Material.LIGHT_BLUE_DYE, "LIGHT_BLUE");
        ItemStack pat8 = pattern.newItem(Material.LIGHT_GRAY_DYE, "LIGHT_GRAY");
        ItemStack pat9 = pattern.newItem(Material.LIME_DYE, "LIME");
        ItemStack pat10 = pattern.newItem(Material.MAGENTA_DYE, "MAGENTA");
        ItemStack pat11 = pattern.newItem(Material.ORANGE_DYE, "ORANGE");
        ItemStack pat12 = pattern.newItem(Material.PINK_DYE, "PINK");
        ItemStack pat13 = pattern.newItem(Material.PURPLE_DYE, "PURPLE");
        ItemStack pat14 = pattern.newItem(Material.RED_DYE, "RED");
        ItemStack pat15 = pattern.newItem(Material.WHITE_DYE, "WHITE");
        ItemStack pat16 = pattern.newItem(Material.YELLOW_DYE, "YELLOW");
        // Fish Body Color \\
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
        // GUI Initialization \\
        gui.setItem(1, type1, action -> {
            fish.setPattern(TropicalFish.Pattern.BETTY);
            pattern.open(p);
        });
        gui.setItem(2, type2, action -> {
            fish.setPattern(TropicalFish.Pattern.BLOCKFISH);
            pattern.open(p);
        });
        gui.setItem(3, type3, action -> {
            fish.setPattern(TropicalFish.Pattern.BRINELY);
            pattern.open(p);
        });
        gui.setItem(5, type4, action -> {
            fish.setPattern(TropicalFish.Pattern.CLAYFISH);
            pattern.open(p);
        });
        gui.setItem(6, type5, action -> {
            fish.setPattern(TropicalFish.Pattern.DASHER);
            pattern.open(p);
        });
        gui.setItem(7, type6, action -> {
            fish.setPattern(TropicalFish.Pattern.FLOPPER);
            pattern.open(p);
        });
        gui.setItem(10, type7, action -> {
            fish.setPattern(TropicalFish.Pattern.GLITTER);
            pattern.open(p);
        });
        gui.setItem(11, type8, action -> {
            fish.setPattern(TropicalFish.Pattern.KOB);
            pattern.open(p);
        });
        gui.setItem(12, type9, action -> {
            fish.setPattern(TropicalFish.Pattern.SNOOPER);
            pattern.open(p);
        });
        gui.setItem(14, type10, action -> {
            fish.setPattern(TropicalFish.Pattern.SPOTTY);
            pattern.open(p);
        });
        gui.setItem(15, type11, action -> {
            fish.setPattern(TropicalFish.Pattern.STRIPEY);
            pattern.open(p);
        });
        gui.setItem(16, type12, action -> {
            fish.setPattern(TropicalFish.Pattern.SUNSTREAK);
            pattern.open(p);
        });
        // Pattern Color GUI \\
        pattern.setItem(1, pat1, action -> {
            fish.setPatternColor(DyeColor.BLACK);
            body.open(p);
        });
        pattern.setItem(2, pat2, action -> {
            fish.setPatternColor(DyeColor.BLUE);
            body.open(p);
        });
        pattern.setItem(3, pat3, action -> {
            fish.setPatternColor(DyeColor.BROWN);
            body.open(p);
        });
        pattern.setItem(4, pat4, action -> {
            fish.setPatternColor(DyeColor.CYAN);
            body.open(p);
        });
        pattern.setItem(5, pat5, action -> {
            fish.setPatternColor(DyeColor.GRAY);
            body.open(p);
        });
        pattern.setItem(6, pat6, action -> {
            fish.setPatternColor(DyeColor.GREEN);
            body.open(p);
        });
        pattern.setItem(7, pat7, action -> {
            fish.setPatternColor(DyeColor.LIGHT_BLUE);
            body.open(p);
        });
        pattern.setItem(9, pat8, action -> {
            fish.setPatternColor(DyeColor.LIGHT_GRAY);
            body.open(p);
        });
        pattern.setItem(10, pat9, action -> {
            fish.setPatternColor(DyeColor.LIME);
            body.open(p);
        });
        pattern.setItem(11, pat10, action -> {
            fish.setPatternColor(DyeColor.MAGENTA);
            body.open(p);
        });
        pattern.setItem(12, pat11, action -> {
            fish.setPatternColor(DyeColor.ORANGE);
            body.open(p);
        });
        pattern.setItem(13, pat12, action -> {
            fish.setPatternColor(DyeColor.PINK);
            body.open(p);
        });
        pattern.setItem(14, pat13, action -> {
            fish.setPatternColor(DyeColor.PURPLE);
            body.open(p);
        });
        pattern.setItem(15, pat14, action -> {
            fish.setPatternColor(DyeColor.RED);
            body.open(p);
        });
        pattern.setItem(16, pat15, action -> {
            fish.setPatternColor(DyeColor.WHITE);
            body.open(p);
        });
        pattern.setItem(17, pat16, action -> {
            fish.setPatternColor(DyeColor.YELLOW);
            body.open(p);
        });
        // Body Color GUI \\
        body.setItem(1, col1, action -> {
            fish.setBodyColor(DyeColor.BLACK);
            p.closeInventory();
        });
        body.setItem(2, col2, action -> {
            fish.setBodyColor(DyeColor.BLUE);
            p.closeInventory();
        });
        body.setItem(3, col3, action -> {
            fish.setBodyColor(DyeColor.BROWN);
            p.closeInventory();
        });
        body.setItem(4, col4, action -> {
            fish.setBodyColor(DyeColor.CYAN);
            p.closeInventory();
        });
        body.setItem(5, col5, action -> {
            fish.setBodyColor(DyeColor.GRAY);
            p.closeInventory();
        });
        body.setItem(6, col6, action -> {
            fish.setBodyColor(DyeColor.GREEN);
            p.closeInventory();
        });
        body.setItem(7, col7, action -> {
            fish.setBodyColor(DyeColor.LIGHT_BLUE);
            p.closeInventory();
        });
        body.setItem(9, col8, action -> {
            fish.setBodyColor(DyeColor.LIGHT_GRAY);
            p.closeInventory();
        });
        body.setItem(10, col9, action -> {
            fish.setBodyColor(DyeColor.LIME);
            p.closeInventory();
        });
        body.setItem(11, col10, action -> {
            fish.setBodyColor(DyeColor.MAGENTA);
            p.closeInventory();
        });
        body.setItem(12, col11, action -> {
            fish.setBodyColor(DyeColor.ORANGE);
            p.closeInventory();
        });
        body.setItem(13, col12, action -> {
            fish.setBodyColor(DyeColor.PINK);
            p.closeInventory();
        });
        body.setItem(14, col13, action -> {
            fish.setBodyColor(DyeColor.PURPLE);
            p.closeInventory();
        });
        body.setItem(15, col14, action -> {
            fish.setBodyColor(DyeColor.RED);
            p.closeInventory();
        });
        body.setItem(16, col15, action -> {
            fish.setBodyColor(DyeColor.WHITE);
            p.closeInventory();
        });
        body.setItem(17, col16, action -> {
            fish.setBodyColor(DyeColor.YELLOW);
            p.closeInventory();
        });
        // Open main menu to player \\
        gui.open(p);
    }
}
