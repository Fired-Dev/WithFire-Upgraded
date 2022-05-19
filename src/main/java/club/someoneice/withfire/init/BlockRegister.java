package club.someoneice.withfire.init;

import club.someoneice.withfire.Withfire;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Withfire.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlockRegister {
    public static final DeferredRegister<Block> BlockList = DeferredRegister.create(Block.class, Withfire.MODID);

    

    public static RegistryObject<Block> register(@Nonnull Block block, @Nonnull String names) {
        ItemRegister.register(() -> new BlockItem(block, new Item.Properties().tab(Withfire.TAB)), names);
        return registerBaseBlock(() -> block, names);
    }

    public static RegistryObject<Block> registerBaseBlock(@Nonnull Supplier<Block> initializer, @Nonnull String name) {
        return BlockList.register(name, initializer);
    }
}
