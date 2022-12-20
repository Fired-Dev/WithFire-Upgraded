package club.someoneice.withfire.init;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.with_fire_package.effect.Satisfy;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Withfire.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class EffectRegister {
    public static final DeferredRegister<MobEffect> EffectList = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Withfire.MODID);

    public static final RegistryObject<MobEffect> SATISFY = register(Satisfy::new, "satisfy");

    public static RegistryObject<MobEffect> register(@Nonnull Supplier<MobEffect> initializer, @Nonnull String name) {
        return EffectList.register(name, initializer);
    }
}
