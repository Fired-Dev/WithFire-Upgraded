package club.someoneice.withfire.with_fire_package.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class HealItem extends Item {
    int heal;

    public HealItem(int heal) {
        super(new Item.Properties());
        this.heal = heal;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return UseAnim.EAT;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(world, player, hand);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level world, LivingEntity player) {
        if (player instanceof Player) {
            world.playSound((Player) null, player.blockPosition(), SoundEvents.PLAYER_HURT, SoundSource.NEUTRAL, 1.0F, 1.0F + world.random.nextFloat() * 0.3F);
        }

        player.heal(this.heal);
        item.shrink(1);
        return item;
    }
}
