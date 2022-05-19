package club.someoneice.withfire;

import club.someoneice.withfire.event.ModEvent;
import club.someoneice.withfire.init.BlockRegister;
import club.someoneice.withfire.init.EffectRegister;
import club.someoneice.withfire.init.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("with_fire")
public class Withfire {
    public static final String MODID = "with_fire";
    public static final String Version = "f1";
    public static final Logger LOGGER = LogManager.getLogger("[with_fire]");

    public static final CreativeModeTab TAB = new CreativeModeTab("Withfire") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.CIDER.get());
            // TODO - Remake It.
        }
    };

    public Withfire() {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ModEvent());

        EffectRegister.EffectList.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegister.BlockList.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegister.ItemList.register(FMLJavaModLoadingContext.get().getModEventBus());




        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    public static Logger getLogger()
    {
        return LOGGER;
    }
}

