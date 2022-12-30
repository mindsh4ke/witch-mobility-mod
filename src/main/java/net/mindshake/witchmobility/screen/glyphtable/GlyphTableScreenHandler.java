package net.mindshake.witchmobility.screen.glyphtable;

import net.mindshake.witchmobility.screen.ModScreenHandlers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class GlyphTableScreenHandler extends ScreenHandler {

    private final Inventory inventory;

    public GlyphTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(8));
    }

    public GlyphTableScreenHandler(int syncId, PlayerInventory playerInventory,
                                   Inventory inventory) {
        super(ModScreenHandlers.GLYPH_TABLE_SCREEN_HANDLER, syncId);
        checkSize(inventory, 4);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);

        //
        this.addSlot(new Slot(inventory, 0, 80, 5));
        this.addSlot(new Slot(inventory, 1, 110, 17));
        this.addSlot(new Slot(inventory, 2, 119, 45));
        this.addSlot(new Slot(inventory, 3, 110, 73));
        this.addSlot(new Slot(inventory, 4, 80, 84));
        this.addSlot(new Slot(inventory, 5, 50, 73));
        this.addSlot(new Slot(inventory, 6, 41, 45));
        this.addSlot(new Slot(inventory, 7, 50, 17));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 106 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 164));
        }
    }
}
