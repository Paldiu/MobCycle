package dev.coomware.util;

import dev.coomware.types.*;
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
        //
        if (p.isSneaking()) {
            if (type.equals(EntityType.HORSE)) {
                Horse horse = (Horse) ent;
                //
                new HorseType(horse, p).openGUI();
            }
            if (type.equals(EntityType.CAT)) {
                Cat cat = (Cat) ent;
                //
                new CatType(cat, p).openGUI();
            }
            if (type.equals(EntityType.PARROT)) {
                Parrot parrot = (Parrot) ent;
                //
                new ParrotType(parrot, p).openGUI();
            }
            if (type.equals(EntityType.FOX)) {
                Fox fox = (Fox) ent;
                //
                new FoxType(fox, p);
            }
            if (type.equals(EntityType.LLAMA)) {
                Llama llama = (Llama) ent;
                //
                new LlamaType(llama, p).openGUI();
            }
            if (type.equals(EntityType.TROPICAL_FISH)) {
                TropicalFish fish = (TropicalFish) ent;
                //
                new TropicalFishType(fish, p).openGUI();
            }
            if (type.equals(EntityType.RABBIT)) {
                Rabbit rabbit = (Rabbit) ent;
                //
                new RabbitType(rabbit, p).openGUI();
            }
            if (type.equals(EntityType.VILLAGER)) {
                Villager villager = (Villager) ent;
                //
                new VillagerType(villager, p).openGUI();
            }
            if (type.equals(EntityType.PANDA)) {
                Panda panda = (Panda) ent;
                //
                new PandaType(panda, p).openGUI();
            }
            if (type.equals(EntityType.SHEEP)) {
                Sheep sheep = (Sheep) ent;
                //
                new SheepType(sheep, p).openGUI();
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
