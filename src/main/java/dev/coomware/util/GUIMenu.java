package dev.coomware.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public abstract class GUIMenu implements InventoryHolder, Listener {
    private final Inventory INV;
    private final Map<Integer, GUIAction> ACTIONS;
    private final UUID uuid;
    //
    public static Map<UUID, GUIMenu> invByUUID = new HashMap<>();
    public static Map<UUID, UUID> openInventories = new HashMap<>();

    public GUIMenu(int size, String name) {
        uuid = UUID.randomUUID();
        INV = Bukkit.createInventory(null, size, name);
        ACTIONS = new HashMap<>();
        invByUUID.put(getUUID(), this);
    }

    public UUID getUUID() {
        return uuid;
    }

    @Override
    public Inventory getInventory() {
        return INV;
    }

    public interface GUIAction {
        void click(Player player);
    }

    public final void setItem(int slot, ItemStack stack, GUIAction action) {
        INV.setItem(slot, stack);
        if (action != null) { ACTIONS.put(slot, action); }
    }

    public final void setItem(int slot, ItemStack stack) {
        setItem(slot, stack, null);
    }

    public final void clearItems() {
        INV.clear();
    }

    public final void open(@NotNull Player p) {
        p.openInventory(INV);
        openInventories.put(p.getUniqueId(), getUUID());
    }

    public final void delete() {
        Bukkit.getOnlinePlayers().forEach((p) -> {
           UUID u = openInventories.get(p.getUniqueId());
           if (u.equals(getUUID())) { p.closeInventory(); }
        });
        invByUUID.remove(getUUID());
    }

    public static Map<UUID, GUIMenu> getInvByUUID() {
        return invByUUID;
    }

    public static Map<UUID, UUID> getOpenInvs() {
        return openInventories;
    }

    public Map<Integer, GUIAction> getActions() {
        return ACTIONS;
    }

    public final ItemStack newItem(Material mat, String name, String... lore) {
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(name);
        ArrayList<String> lores = new ArrayList<>(Arrays.asList(lore));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }
}
