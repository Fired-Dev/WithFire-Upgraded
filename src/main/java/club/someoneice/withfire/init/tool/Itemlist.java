package club.someoneice.withfire.init.tool;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.init.EffectRegister;
import club.someoneice.withfire.withFirePackage.item.HealItem;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.UseAnim;

public class Itemlist {
    public static Item item() {
        Item.Properties Properties = new Item.Properties();
        Properties.tab(Withfire.TAB);
        return new Item(Properties);
    }

    public static Item food(int hunger, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, MobEffect[] effects, int getEffectTime, int getEffectLever, float random, UseAnim useAnim) {
        Properties Properties = new Properties();
        Properties.tab(Withfire.TAB);
        Builder Builder = new Builder();
        Builder.nutrition(hunger);
        Builder.saturationMod(saturation);
        for (MobEffect effect : effects) {
            Builder.effect(() -> new MobEffectInstance(effect, getEffectTime, getEffectLever), random);
        }
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.fast();
        }
        if (alwaysEat) {
            Builder.alwaysEat();
        }

        Properties.food(Builder.build());
        return new Item(Properties);
    }

    public static Item Drink(int hunger, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, boolean isWine, MobEffect[] effects, int getEffectTime, int getEffectLever, float random) {
        Properties Properties = new Properties();
        Properties.tab(Withfire.TAB);
        Builder Builder = new Builder();
        Builder.nutrition(hunger);
        Builder.saturationMod(saturation);
        if (isWine) {
            Builder.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 20 * 10, 0), 0.8F);
        }
        for (MobEffect effect : effects) {
            Builder.effect(() -> new MobEffectInstance(effect, getEffectTime, getEffectLever), random);
        }
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.fast();
        }
        if (alwaysEat) {
            Builder.alwaysEat();
        }
        Properties.food(Builder.build());
        return new DrinkItem(Properties.stacksTo(1));
    }

    public static Item ham(int hunger, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat, int getEffectTime, int getEffectLever, float random, UseAnim useAnim) {
        Properties Properties = new Properties();
        Properties.tab(Withfire.TAB);
        Builder Builder = new Builder();
        Builder.nutrition(hunger);
        Builder.saturationMod(saturation);
        Builder.effect(() -> new MobEffectInstance(EffectRegister.SATISFY.get(), getEffectTime, getEffectLever), random);
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.fast();
        }
        if (alwaysEat) {
            Builder.alwaysEat();
        }

        Properties.food(Builder.build());
        return new Item(Properties);
    }

    public static Item healItem(int heal, MobEffect[] effects, int getEffectTime, int getEffectLever, float random) {
        Properties Properties = new Properties();
        Properties.tab(Withfire.TAB);
        Builder Builder = new Builder();
        for (MobEffect effect : effects) {
            Builder.effect(() -> new MobEffectInstance(effect, getEffectTime, getEffectLever), random);
        }
        return new HealItem(heal);
    }
}