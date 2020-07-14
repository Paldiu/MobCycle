package dev.coomware.util;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class CycleListener implements Listener {
    public CycleListener(@NotNull Plugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void interact(@NotNull PlayerInteractEntityEvent e) {
        if (!e.getPlayer().hasPermission("mobcycle.menu")) { return; }
        //
        final Entity ent = e.getRightClicked();
        final EntityType type = ent.getType();
        final Player p = e.getPlayer();
        //
        final TypeCycler gui = new TypeCycler();
        final TypeCycler.SubTypes subTypes = new TypeCycler.SubTypes();
        final TypeCycler.Pattern pattern = new TypeCycler.Pattern();
        final TypeCycler.Body body = new TypeCycler.Body();
        //
        if (p.isSneaking()) {
            if (type.equals(EntityType.HORSE)) {
                Horse horse = (Horse) ent;
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
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(3, sub2, click -> {
                    horse.setStyle(Horse.Style.WHITE);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(4, sub3, click -> {
                    horse.setStyle(Horse.Style.WHITEFIELD);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(5, sub4, click -> {
                    horse.setStyle(Horse.Style.WHITE_DOTS);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(6, sub5, click -> {
                    horse.setStyle(Horse.Style.BLACK_DOTS);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                gui.open(p);
            }
            if (type.equals(EntityType.CAT)) {
                Cat cat = (Cat) ent;
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
                    gui.clearItems();
                });
                gui.setItem(3, type2, action -> {
                    cat.setCatType(Cat.Type.TABBY);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(4, type3, action -> {
                    cat.setCatType(Cat.Type.SIAMESE);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(5, type4, action -> {
                    cat.setCatType(Cat.Type.RED);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(6, type5, action -> {
                    cat.setCatType(Cat.Type.RAGDOLL);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(10, type6, action -> {
                    cat.setCatType(Cat.Type.PERSIAN);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(11, type7, action -> {
                    cat.setCatType(Cat.Type.JELLIE);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(12, type8, action -> {
                    cat.setCatType(Cat.Type.CALICO);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(14, type9, action -> {
                    cat.setCatType(Cat.Type.BRITISH_SHORTHAIR);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(15, type10, action -> {
                    cat.setCatType(Cat.Type.BLACK);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(16, type11, action -> {
                    cat.setCatType(Cat.Type.ALL_BLACK);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.open(p);
            }
            if (type.equals(EntityType.PARROT)) {
                Parrot parrot = (Parrot) ent;
                ItemStack type1 = gui.newItem(Material.BLUE_DYE, "BLUE", ChatColor.GRAY + "Royal blue colored parrot.");
                ItemStack type2 = gui.newItem(Material.LIGHT_BLUE_DYE, "CYAN", ChatColor.GRAY + "Cyan colored parrot.");
                ItemStack type3 = gui.newItem(Material.LIGHT_GRAY_DYE, "GRAY", ChatColor.GRAY + "Gray colored parrot.");
                ItemStack type4 = gui.newItem(Material.LIME_DYE, "GREEN", ChatColor.GRAY + "Green colored parrot.");
                ItemStack type5 = gui.newItem(Material.RED_DYE, "RED", ChatColor.GRAY + "Classic parrot - red with colored wing tips.");

                gui.setItem(2, type1, action -> {
                    parrot.setVariant(Parrot.Variant.BLUE);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(3, type2, action -> {
                    parrot.setVariant(Parrot.Variant.CYAN);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(4, type3, action -> {
                    parrot.setVariant(Parrot.Variant.GRAY);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(5, type4, action -> {
                    parrot.setVariant(Parrot.Variant.GREEN);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(6, type5, action -> {
                    parrot.setVariant(Parrot.Variant.RED);
                    p.closeInventory();
                    gui.clearItems();
                });
                //
                gui.open(p);
            }
            if (type.equals(EntityType.FOX)) {
                Fox fox = (Fox) ent;
                ItemStack type1 = gui.newItem(Material.RED_DYE, "RED", ChatColor.GRAY + "Red (default) fox.");
                ItemStack type2 = gui.newItem(Material.WHITE_DYE, "SNOW", ChatColor.GRAY + "Snow fox.");
                gui.setItem(3, type1, action -> {
                    fox.setFoxType(Fox.Type.RED);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(5, type2, action -> {
                    fox.setFoxType(Fox.Type.SNOW);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.open(p);
            }
            if (type.equals(EntityType.LLAMA)) {
                Llama llama = (Llama) ent;
                //
                ItemStack type1 = gui.newItem(Material.BROWN_DYE, "BROWN", ChatColor.GRAY + "Brown llama.");
                ItemStack type2 = gui.newItem(Material.LIGHT_GRAY_DYE, "CREAMY", ChatColor.GRAY + "Cream colored llama.");
                ItemStack type3 = gui.newItem(Material.GRAY_DYE, "GRAY", ChatColor.GRAY + "Gray llama.");
                ItemStack type4 = gui.newItem(Material.WHITE_DYE, "WHITE", ChatColor.GRAY + "White llama.");
                gui.setItem(2, type1, action -> {
                    llama.setColor(Llama.Color.BROWN);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(3, type2, action -> {
                    llama.setColor(Llama.Color.CREAMY);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(5, type3, action -> {
                    llama.setColor(Llama.Color.GRAY);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(6, type4, action -> {
                    llama.setColor(Llama.Color.WHITE);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.open(p);
            }
            if (type.equals(EntityType.TROPICAL_FISH)) {
                TropicalFish fish = (TropicalFish) ent;
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
                    gui.clearItems();
                });
                gui.setItem(2, type2, action -> {
                    fish.setPattern(TropicalFish.Pattern.BLOCKFISH);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(3, type3, action -> {
                    fish.setPattern(TropicalFish.Pattern.BRINELY);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(5, type4, action -> {
                    fish.setPattern(TropicalFish.Pattern.CLAYFISH);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(6, type5, action -> {
                    fish.setPattern(TropicalFish.Pattern.DASHER);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(7, type6, action -> {
                    fish.setPattern(TropicalFish.Pattern.FLOPPER);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(10, type7, action -> {
                    fish.setPattern(TropicalFish.Pattern.GLITTER);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(11, type8, action -> {
                    fish.setPattern(TropicalFish.Pattern.KOB);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(12, type9, action -> {
                    fish.setPattern(TropicalFish.Pattern.SNOOPER);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(14, type10, action -> {
                    fish.setPattern(TropicalFish.Pattern.SPOTTY);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(15, type11, action -> {
                    fish.setPattern(TropicalFish.Pattern.STRIPEY);
                    pattern.open(p);
                    gui.clearItems();
                });
                gui.setItem(16, type12, action -> {
                    fish.setPattern(TropicalFish.Pattern.SUNSTREAK);
                    pattern.open(p);
                    gui.clearItems();
                });
                // Pattern Color GUI \\
                pattern.setItem(1, pat1, action -> {
                    fish.setPatternColor(DyeColor.BLACK);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(2, pat2, action -> {
                    fish.setPatternColor(DyeColor.BLUE);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(3, pat3, action -> {
                    fish.setPatternColor(DyeColor.BROWN);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(4, pat4, action -> {
                    fish.setPatternColor(DyeColor.CYAN);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(5, pat5, action -> {
                    fish.setPatternColor(DyeColor.GRAY);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(6, pat6, action -> {
                    fish.setPatternColor(DyeColor.GREEN);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(7, pat7, action -> {
                    fish.setPatternColor(DyeColor.LIGHT_BLUE);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(9, pat8, action -> {
                    fish.setPatternColor(DyeColor.LIGHT_GRAY);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(10, pat9, action -> {
                    fish.setPatternColor(DyeColor.LIME);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(11, pat10, action -> {
                    fish.setPatternColor(DyeColor.MAGENTA);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(12, pat11, action -> {
                    fish.setPatternColor(DyeColor.ORANGE);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(13, pat12, action -> {
                    fish.setPatternColor(DyeColor.PINK);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(14, pat13, action -> {
                    fish.setPatternColor(DyeColor.PURPLE);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(15, pat14, action -> {
                    fish.setPatternColor(DyeColor.RED);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(16, pat15, action -> {
                    fish.setPatternColor(DyeColor.WHITE);
                    body.open(p);
                    pattern.clearItems();
                });
                pattern.setItem(17, pat16, action -> {
                    fish.setPatternColor(DyeColor.YELLOW);
                    body.open(p);
                    pattern.clearItems();
                });
                // Body Color GUI \\
                body.setItem(1, col1, action -> {
                    fish.setBodyColor(DyeColor.BLACK);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(2, col2, action -> {
                    fish.setBodyColor(DyeColor.BLUE);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(3, col3, action -> {
                    fish.setBodyColor(DyeColor.BROWN);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(4, col4, action -> {
                    fish.setBodyColor(DyeColor.CYAN);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(5, col5, action -> {
                    fish.setBodyColor(DyeColor.GRAY);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(6, col6, action -> {
                    fish.setBodyColor(DyeColor.GREEN);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(7, col7, action -> {
                    fish.setBodyColor(DyeColor.LIGHT_BLUE);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(9, col8, action -> {
                    fish.setBodyColor(DyeColor.LIGHT_GRAY);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(10, col9, action -> {
                    fish.setBodyColor(DyeColor.LIME);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(11, col10, action -> {
                    fish.setBodyColor(DyeColor.MAGENTA);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(12, col11, action -> {
                    fish.setBodyColor(DyeColor.ORANGE);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(13, col12, action -> {
                    fish.setBodyColor(DyeColor.PINK);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(14, col13, action -> {
                    fish.setBodyColor(DyeColor.PURPLE);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(15, col14, action -> {
                    fish.setBodyColor(DyeColor.RED);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(16, col15, action -> {
                    fish.setBodyColor(DyeColor.WHITE);
                    p.closeInventory();
                    body.clearItems();
                });
                body.setItem(17, col16, action -> {
                    fish.setBodyColor(DyeColor.YELLOW);
                    p.closeInventory();
                    body.clearItems();
                });
                // Open main menu to player \\
                gui.open(p);
            }
            if (type.equals(EntityType.RABBIT)) {
                Rabbit rabbit = (Rabbit) ent;
                //
                ItemStack type1 = gui.newItem(Material.WHITE_DYE, "WHITE", "");
                ItemStack type2 = gui.newItem(Material.LIGHT_GRAY_DYE, "BLACK_AND_WHITE", "");
                ItemStack type3 = gui.newItem(Material.BROWN_DYE, "BROWN", "");
                ItemStack type4 = gui.newItem(Material.YELLOW_DYE, "GOLD", "");
                ItemStack type5 = gui.newItem(Material.GRAY_DYE, "SALT_AND_PEPPER", "");
                ItemStack type6 = gui.newItem(Material.RED_DYE, "THE_KILLER_BUNNY", "");
                ItemStack type7 = gui.newItem(Material.BLACK_DYE, "BLACK", "");
                //
                gui.setItem(1, type1, action -> {
                    rabbit.setRabbitType(Rabbit.Type.WHITE);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(2, type2, action -> {
                    rabbit.setRabbitType(Rabbit.Type.BLACK_AND_WHITE);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(3, type3, action -> {
                    rabbit.setRabbitType(Rabbit.Type.BROWN);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(4, type4, action -> {
                    rabbit.setRabbitType(Rabbit.Type.GOLD);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(5, type5, action -> {
                    rabbit.setRabbitType(Rabbit.Type.SALT_AND_PEPPER);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(6, type6, action -> {
                    rabbit.setRabbitType(Rabbit.Type.THE_KILLER_BUNNY);
                    p.closeInventory();
                    gui.clearItems();
                });
                gui.setItem(7, type7, action -> {
                    rabbit.setRabbitType(Rabbit.Type.BLACK);
                    p.closeInventory();
                    gui.clearItems();
                });
                //
                gui.open(p);
            }
            if (type.equals(EntityType.VILLAGER)) {
                Villager villager = (Villager) ent;
                int xp = villager.getVillagerExperience() + 1;
                // Biome Types \\
                ItemStack type1 = gui.newItem(Material.SAND, "DESERT", "");
                ItemStack type2 = gui.newItem(Material.JUNGLE_LOG, "JUNGLE", "");
                ItemStack type3 = gui.newItem(Material.OAK_LOG, "PLAINS", "");
                ItemStack type4 = gui.newItem(Material.ACACIA_LOG, "SAVANNA", "");
                ItemStack type5 = gui.newItem(Material.SNOW_BLOCK, "SNOW", "");
                ItemStack type6 = gui.newItem(Material.VINE, "SWAMP", "");
                ItemStack type7 = gui.newItem(Material.SPRUCE_LOG, "TAIGA", "");
                // Professions \\
                ItemStack prof1 = subTypes.newItem(Material.IRON_CHESTPLATE, "ARMORER", "");
                ItemStack prof2 = subTypes.newItem(Material.COOKED_BEEF, "BUTCHER", "");
                ItemStack prof3 = subTypes.newItem(Material.MAP, "CARTOGRAPHER", "");
                ItemStack prof4 = subTypes.newItem(Material.BREWING_STAND, "CLERIC", "");
                ItemStack prof5 = subTypes.newItem(Material.IRON_HOE, "FARMER", "");
                ItemStack prof6 = subTypes.newItem(Material.FISHING_ROD, "FISHERMAN", "");
                ItemStack prof7 = subTypes.newItem(Material.ARROW, "FLETCHER", "");
                ItemStack prof8 = subTypes.newItem(Material.LEATHER, "LEATHERWORKER", "");
                ItemStack prof9 = subTypes.newItem(Material.BOOK, "LIBRARIAN", "");
                ItemStack prof10 = subTypes.newItem(Material.BRICK, "MASON", "");
                ItemStack prof11 = subTypes.newItem(Material.STICK, "NITWIT", "");
                ItemStack prof12 = subTypes.newItem(Material.BARRIER, "NONE", "");
                ItemStack prof13 = subTypes.newItem(Material.SHEARS, "SHEPHERD", "");
                ItemStack prof14 = subTypes.newItem(Material.IRON_PICKAXE, "TOOLSMITH", "");
                ItemStack prof15 = subTypes.newItem(Material.IRON_SWORD, "WEAPONSMITH", "");
                // Setup the GUI \\
                gui.setItem(1, type1, action -> {
                    villager.setVillagerType(Villager.Type.DESERT);
                    subTypes.open(p);
                });
                gui.setItem(2, type2, action -> {
                    villager.setVillagerType(Villager.Type.JUNGLE);
                    subTypes.open(p);
                });
                gui.setItem(3, type3, action -> {
                    villager.setVillagerType(Villager.Type.PLAINS);
                    subTypes.open(p);
                });
                gui.setItem(4, type4, action -> {
                    villager.setVillagerType(Villager.Type.SAVANNA);
                    subTypes.open(p);
                });
                gui.setItem(5, type5, action -> {
                    villager.setVillagerType(Villager.Type.SNOW);
                    subTypes.open(p);
                });
                gui.setItem(6, type6, action -> {
                    villager.setVillagerType(Villager.Type.SWAMP);
                    subTypes.open(p);
                });
                gui.setItem(7, type7, action -> {
                    villager.setVillagerType(Villager.Type.TAIGA);
                    subTypes.open(p);
                });
                subTypes.setItem(0, prof1, action -> {
                    villager.setProfession(Villager.Profession.ARMORER);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(1, prof2, action -> {
                    villager.setProfession(Villager.Profession.BUTCHER);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(2, prof3, action -> {
                    villager.setProfession(Villager.Profession.CARTOGRAPHER);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(3, prof4, action -> {
                    villager.setProfession(Villager.Profession.CLERIC);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(4, prof5, action -> {
                    villager.setProfession(Villager.Profession.FARMER);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(5, prof6, action -> {
                    villager.setProfession(Villager.Profession.FISHERMAN);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(6, prof7, action -> {
                    villager.setProfession(Villager.Profession.FLETCHER);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(7, prof8, action -> {
                    villager.setProfession(Villager.Profession.LEATHERWORKER);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(8, prof9, action -> {
                    villager.setProfession(Villager.Profession.LIBRARIAN);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(9, prof10, action -> {
                    villager.setProfession(Villager.Profession.MASON);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(10, prof11, action -> {
                    villager.setProfession(Villager.Profession.NITWIT);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(11, prof12, action -> {
                    villager.setProfession(Villager.Profession.NONE);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(12, prof13, action -> {
                    villager.setProfession(Villager.Profession.SHEPHERD);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(13, prof14, action -> {
                    villager.setProfession(Villager.Profession.TOOLSMITH);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                subTypes.setItem(14, prof15, action -> {
                    villager.setProfession(Villager.Profession.WEAPONSMITH);
                    villager.setVillagerExperience(xp);
                    p.closeInventory();
                    gui.clearItems();
                    subTypes.clearItems();
                });
                // Open the main menu \\
                gui.open(p);
            }
        }
    }

    @EventHandler
    public void onClick(@NotNull InventoryClickEvent e) {
        if (!(e.getWhoClicked() instanceof Player)) { return; }
        //
        Player player = (Player) e.getWhoClicked();
        UUID pUUID = player.getUniqueId();
        UUID invUUID = GUIMenu.getOpenInvs().get(pUUID);
        if (invUUID != null) {
            e.setCancelled(true);
            GUIMenu menu = GUIMenu.getInvByUUID().get(invUUID);
            GUIMenu.GUIAction action = menu.getActions().get(e.getSlot());
            if (action != null) {
                action.click(player);
            }
        }
    }

    @EventHandler
    public void onClose(@NotNull InventoryCloseEvent e) {
        Player player = (Player) e.getPlayer();
        UUID pUUID = player.getUniqueId();
        GUIMenu.getOpenInvs().remove(pUUID);
    }
}
