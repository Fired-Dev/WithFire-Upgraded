package club.someoneice.withfire.with_fire_package.item;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.init.ItemRegister;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class MoistWheat extends Item {
    private static final FoodProperties food = ((new FoodProperties.Builder()).alwaysEat().build());

    public MoistWheat() {
        super(new Properties().tab(Withfire.TAB).food(food));
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 64;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemStack) {
        return UseAnim.EAT;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity player) {
        if (player instanceof Player) {
            if (!((Player) player).getInventory().add(new ItemStack(ItemRegister.YEAST.get()))) {
                ((Player) player).drop(new ItemStack(ItemRegister.YEAST.get()), false);
            }
        }
        return super.finishUsingItem(item, LV, player);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack items, Level world, List<Component> list, @NotNull TooltipFlag data) {
        list.add(new TranslatableComponent("info.wheat.food").withStyle(ChatFormatting.GRAY));
    }
}
