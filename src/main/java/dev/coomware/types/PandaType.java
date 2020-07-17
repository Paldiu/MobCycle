package dev.coomware.types;

import dev.coomware.util.TypeCycler;
import org.bukkit.Material;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PandaType {
    private final Panda panda;
    private final Player p;
    private final TypeCycler.MainGene gui;
    private final TypeCycler.HiddenGene subs;
    
    public PandaType(Panda panda, Player p) {
        this.panda = panda;
        this.p = p;
        this.gui = new TypeCycler.MainGene();
        this.subs = new TypeCycler.HiddenGene();
    }
    
    public void openGUI() {
        gui.clearItems();
        subs.clearItems();
        //
        ItemStack gene1 = gui.newItem(Material.RED_DYE, "AGGRESSIVE");
        ItemStack gene2 = gui.newItem(Material.BROWN_DYE, "BROWN");
        ItemStack gene3 = gui.newItem(Material.CYAN_DYE, "LAZY");
        ItemStack gene4 = gui.newItem(Material.WHITE_DYE, "NORMAL");
        ItemStack gene5 = gui.newItem(Material.YELLOW_DYE, "PLAYFUL");
        ItemStack gene6 = gui.newItem(Material.GRAY_DYE, "WEAK");
        ItemStack gene7 = gui.newItem(Material.BLACK_DYE, "WORRIED");
        //
        gui.setItem(1, gene1, action -> {
            panda.setMainGene(Panda.Gene.AGGRESSIVE);
            subs.open(p);
        });
        gui.setItem(2, gene2, action -> {
            panda.setMainGene(Panda.Gene.BROWN);
            subs.open(p);
        });
        gui.setItem(3, gene3, action -> {
            panda.setMainGene(Panda.Gene.LAZY);
            subs.open(p);
        });
        gui.setItem(4, gene4, action -> {
            panda.setMainGene(Panda.Gene.NORMAL);
            subs.open(p);
        });
        gui.setItem(5, gene5, action -> {
            panda.setMainGene(Panda.Gene.PLAYFUL);
            subs.open(p);
        });
        gui.setItem(6, gene6, action -> {
            panda.setMainGene(Panda.Gene.WEAK);
            subs.open(p);
        });
        gui.setItem(7, gene7, action -> {
            panda.setMainGene(Panda.Gene.WORRIED);
            subs.open(p);
        });
        //
        subs.setItem(1, gene1, action -> {
            panda.setMainGene(Panda.Gene.AGGRESSIVE);
            p.closeInventory();
        });
        subs.setItem(2, gene2, action -> {
            panda.setMainGene(Panda.Gene.BROWN);
            p.closeInventory();
        });
        subs.setItem(3, gene3, action -> {
            panda.setMainGene(Panda.Gene.LAZY);
            p.closeInventory();
        });
        subs.setItem(4, gene4, action -> {
            panda.setMainGene(Panda.Gene.NORMAL);
            p.closeInventory();
        });
        subs.setItem(5, gene5, action -> {
            panda.setMainGene(Panda.Gene.PLAYFUL);
            p.closeInventory();
        });
        subs.setItem(6, gene6, action -> {
            panda.setMainGene(Panda.Gene.WEAK);
            p.closeInventory();
        });
        subs.setItem(7, gene7, action -> {
            panda.setMainGene(Panda.Gene.WORRIED);
            p.closeInventory();
        });
        //
        gui.open(p);
    }
}
