package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.inventory.ItemStack;

public class RabbitType {
    private final Rabbit rabbit;
    private final Player p;
    private final TypeCycler gui;

    public RabbitType(Rabbit rabbit, Player p) {
        this.rabbit = rabbit;
        this.p = p;
        this.gui = new TypeCycler();
    }

    public void openGUI() {
        gui.clearItems();
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
        });
        gui.setItem(2, type2, action -> {
            rabbit.setRabbitType(Rabbit.Type.BLACK_AND_WHITE);
            p.closeInventory();
        });
        gui.setItem(3, type3, action -> {
            rabbit.setRabbitType(Rabbit.Type.BROWN);
            p.closeInventory();
        });
        gui.setItem(4, type4, action -> {
            rabbit.setRabbitType(Rabbit.Type.GOLD);
            p.closeInventory();
        });
        gui.setItem(5, type5, action -> {
            rabbit.setRabbitType(Rabbit.Type.SALT_AND_PEPPER);
            p.closeInventory();
        });
        gui.setItem(6, type6, action -> {
            rabbit.setRabbitType(Rabbit.Type.THE_KILLER_BUNNY);
            p.closeInventory();
        });
        gui.setItem(7, type7, action -> {
            rabbit.setRabbitType(Rabbit.Type.BLACK);
            p.closeInventory();
        });
        //
        gui.open(p);
    }
}
