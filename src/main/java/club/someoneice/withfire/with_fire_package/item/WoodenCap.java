package club.someoneice.withfire.with_fire_package.item;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.init.ItemRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class WoodenCap extends Item {
    public WoodenCap() {
        super(new Item.Properties().tab(Withfire.TAB));
    }

    public InteractionResultHolder<ItemStack> use(Level LV, Player player, InteractionHand inHand) {
        ItemStack itemstack = player.getItemInHand(inHand);
        HitResult hitresult = getPlayerPOVHitResult(LV, player, ClipContext.Fluid.SOURCE_ONLY);
        BlockPos blockpos = ((BlockHitResult) hitresult).getBlockPos();
        if (LV.getFluidState(blockpos).is(FluidTags.WATER)) {
            LV.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);
            LV.gameEvent(player, GameEvent.FLUID_PICKUP, blockpos);
            return InteractionResultHolder.sidedSuccess(this.turnBottleIntoItem(itemstack, player, PotionUtils.setPotion(new ItemStack(ItemRegister.WATTER_WOODEN_CAP.get()), Potions.WATER)), LV.isClientSide());
        }
        return InteractionResultHolder.pass(itemstack);
    }

    protected ItemStack turnBottleIntoItem(ItemStack itemStack, Player player, ItemStack item) {
        player.awardStat(Stats.ITEM_USED.get(this));
        return ItemUtils.createFilledResult(itemStack, player, item);
    }
}


