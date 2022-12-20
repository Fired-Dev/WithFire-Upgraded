package club.someoneice.withfire.with_fire_package.item;

import club.someoneice.withfire.Withfire;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class SawItem extends AxeItem {
    public SawItem(Tier Tier, float DG, float SP, int DB) {
        super(Tier, DG, SP, (new Item.Properties()).tab(Withfire.TAB).durability(DB));
    }

    //@Override
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
