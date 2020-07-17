package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;

public class VillagerType {
    private final Villager villager;
    private final Player p;
    private final TypeCycler gui;
    private final TypeCycler.Professions subTypes;

    public VillagerType(Villager villager, Player p) {
        this.villager = villager;
        this.p = p;
        this.gui = new TypeCycler();
        this.subTypes = new TypeCycler.Professions();
    }

    public void openGUI() {
        gui.clearItems();
        subTypes.clearItems();
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
        });
        subTypes.setItem(1, prof2, action -> {
            villager.setProfession(Villager.Profession.BUTCHER);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(2, prof3, action -> {
            villager.setProfession(Villager.Profession.CARTOGRAPHER);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(3, prof4, action -> {
            villager.setProfession(Villager.Profession.CLERIC);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(4, prof5, action -> {
            villager.setProfession(Villager.Profession.FARMER);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(5, prof6, action -> {
            villager.setProfession(Villager.Profession.FISHERMAN);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(6, prof7, action -> {
            villager.setProfession(Villager.Profession.FLETCHER);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(7, prof8, action -> {
            villager.setProfession(Villager.Profession.LEATHERWORKER);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(8, prof9, action -> {
            villager.setProfession(Villager.Profession.LIBRARIAN);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(9, prof10, action -> {
            villager.setProfession(Villager.Profession.MASON);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(10, prof11, action -> {
            villager.setProfession(Villager.Profession.NITWIT);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(11, prof12, action -> {
            villager.setProfession(Villager.Profession.NONE);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(12, prof13, action -> {
            villager.setProfession(Villager.Profession.SHEPHERD);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(13, prof14, action -> {
            villager.setProfession(Villager.Profession.TOOLSMITH);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        subTypes.setItem(14, prof15, action -> {
            villager.setProfession(Villager.Profession.WEAPONSMITH);
            villager.setVillagerExperience(xp);
            p.closeInventory();
        });
        // Open the main menu \\
        gui.open(p);
    }
}
