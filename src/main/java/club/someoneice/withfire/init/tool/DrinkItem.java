package club.someoneice.withfire.init.tool;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.init.ItemRegister;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import static net.minecraft.world.item.UseAnim.DRINK;

public class DrinkItem extends Item {
    public DrinkItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity player) {
        if (player instanceof Player) {
            if (!((Player) player).getInventory().add(new ItemStack(ItemRegister.WOODEN_CAP.get()))) {
                ((Player) player).drop(new ItemStack(ItemRegister.WOODEN_CAP.get()), false);
            }
        }
        return super.finishUsingItem(item, LV, player);
    }
}