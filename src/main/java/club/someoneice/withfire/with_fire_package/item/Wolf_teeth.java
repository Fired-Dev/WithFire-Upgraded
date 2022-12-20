package club.someoneice.withfire.with_fire_package.item;

import club.someoneice.withfire.Withfire;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Wolf_teeth extends Item {
    public Wolf_teeth(){
        super(new Item.Properties().tab(Withfire.TAB));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack items, Level world, List<Component> list, @NotNull TooltipFlag data) {
        list.add(Component.translatable("info.teeth.pineapple").withStyle(ChatFormatting.GRAY));
    }
}
