package club.someoneice.withfire.with_fire_package.item;

import club.someoneice.withfire.Withfire;
import net.minecraft.world.item.*;

public class FlintKnife extends SwordItem {
    public FlintKnife() {
        super(Tiers.WOOD, 1, -2.4F, (new Item.Properties()).tab(Withfire.TAB).durability(64));
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack item = new ItemStack(this);
        item.setDamageValue(itemstack.getDamageValue() + 5);
        if (item.getDamageValue() >= item.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return item;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }
}