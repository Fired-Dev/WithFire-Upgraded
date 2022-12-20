package club.someoneice.withfire.with_fire_package.effect;

import club.someoneice.withfire.init.EffectRegister;
import com.google.common.collect.Sets;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
//import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Set;

public class Satisfy extends MobEffect {
    public Satisfy() {
        super(MobEffectCategory.BENEFICIAL,4393481);
    }

    public static final Set<MobEffect> effects = Sets.newHashSet(MobEffects.WEAKNESS, MobEffects.DIG_SLOWDOWN);

    /*@SubscribeEvent
    public static void onBadEffectApplicable(PotionEvent.PotionApplicableEvent event) {
        MobEffectInstance effect = event.getPotionEffect();
        LivingEntity entity = event.getEntityLiving();
        if (entity.getEffect(EffectRegister.SATISFY.get()) != null && effects.contains(effect.getEffect())) {
            event.setResult(Event.Result.DENY);
        }
    }

    @SubscribeEvent
    public static void onBadEffectApplied(PotionEvent.PotionAddedEvent event) {
        MobEffectInstance addedEffect = event.getPotionEffect();
        LivingEntity entity = event.getEntityLiving();
        if (addedEffect.getEffect().equals(EffectRegister.SATISFY.get())) {
            for (MobEffect effect : effects) {
                entity.removeEffect(effect);
            }
        }
    }*/
}
