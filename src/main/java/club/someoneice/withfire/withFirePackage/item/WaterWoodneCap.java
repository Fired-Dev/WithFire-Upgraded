package club.someoneice.withfire.withFirePackage.item;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.init.ItemRegister;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class WaterWoodneCap extends Item {
    private static final FoodProperties food = ((new FoodProperties.Builder()).alwaysEat().build());

    public WaterWoodneCap() {
        super(new Item.Properties().tab(Withfire.TAB).food(food).stacksTo(1));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level LV, LivingEntity livingEntity) {
        if (livingEntity instanceof Player) {
            ServerPlayer Player = (ServerPlayer)livingEntity;
            CriteriaTriggers.CONSUME_ITEM.trigger(Player, itemStack);
            Player.awardStat(Stats.ITEM_USED.get(this));
        }

        if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return itemStack.isEmpty() ? new ItemStack(ItemRegister.WOODEN_CAP.get()) : itemStack;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }
}
