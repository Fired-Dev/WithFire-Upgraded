package club.someoneice.withfire.init;

import club.someoneice.withfire.Withfire;

import club.someoneice.withfire.init.tool.Itemlist;
import club.someoneice.withfire.withFirePackage.item.*;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.*;

import javax.annotation.Nonnull;
import java.util.Properties;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Withfire.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ItemRegister {
    public static final DeferredRegister<Item> ItemList = DeferredRegister.create(Item.class, Withfire.MODID);

    // Start Register Item.
    public static RegistryObject<Item> FIBROUS = register(Itemlist::item , "fibrous");
    public static RegistryObject<Item> DRY_FIBROUS = register(Itemlist::item , "dry_fibrous");
    public static RegistryObject<Item> HAY_ROPE = register(Itemlist::item , "hay_rope");
    public static RegistryObject<Item> INFERIOR_GUNPOWDER = register(Itemlist::item, "inferior_gunpowder");
    public static RegistryObject<Item> HARDEN_WOOD = register(Itemlist::item, "hard_wood");
    public static RegistryObject<Item> WOOD_GEAR = register(Itemlist::item, "wood_gear");
    public static RegistryObject<Item> WOODEN_BLADE = register(Itemlist::item, "wooden_blade");
    public static RegistryObject<Item> CLAY_BLADE = register(Itemlist::item, "clay_blade");
    public static RegistryObject<Item> CERAMIC_BLADE = register(Itemlist::item, "ceramic_blade");
    public static RegistryObject<Item> MOIST_WHEAT = register(MoistWheat::new, "moist_wheat");
    public static RegistryObject<Item> YEAST = register(Itemlist::item, "yeast");
    public static RegistryObject<Item> BEER_PREMIX = register(Itemlist::item, "beer_premix");
    public static RegistryObject<Item> CIDER_PREMIX = register(Itemlist::item, "cider_premix");
    public static RegistryObject<Item> PLUM_PREMIX = register(Itemlist::item, "plum_premix");
    public static RegistryObject<Item> FLINT_KNIFE = register(FlintKnife::new, "flint_knife");
    public static RegistryObject<Item> IRON_KNIFE = register(IronKnife::new, "iron_knife");
    public static RegistryObject<Item> GELATIN_PREMIX = register(Itemlist::item, "gelatin_premix");
    public static RegistryObject<Item> GELATIN = register(Itemlist::item, "gelatin");
    public static RegistryObject<Item> GLASS_BALL = register(Itemlist::item, "glass_ball");
    public static RegistryObject<Item> Ender = register(Itemlist::item, "ender");
    public static RegistryObject<Item> TEETH = register(Wolf_teeth::new, "wolf_teeth");
    public static RegistryObject<Item> BONE_SHARD = register(Itemlist::item, "bone_shard");
    public static RegistryObject<Item> WOODEN_CAP = register(WoodenCap::new, "wooden_cap");
    public static RegistryObject<Item> WATTER_WOODEN_CAP = register(WaterWoodneCap::new, "watter_wooden_cap");

    public static RegistryObject<Item> FIRE_STARTER = register(()-> new FlintAndSteelItem((new Item.Properties()).durability(5).tab(Withfire.TAB)), "fire_starter");
    public static RegistryObject<Item> WOODEN_SHEARS = register(()-> new ShearsItem((new Item.Properties()).durability(64).tab(Withfire.TAB)), "wooden_shears");
    public static RegistryObject<Item> CERAMIC_SHEARS = register(()-> new ShearsItem((new Item.Properties()).durability(128).tab(Withfire.TAB)), "ceramic_shears");

    public static RegistryObject<Item> HAM = register(() -> Itemlist.ham(4, 0.5F, true, false, true , 20 * 60, 0, 0.3F, UseAnim.EAT), "ham");
    public static RegistryObject<Item> COOK_HAM = register(() -> Itemlist.ham(6, 0.5F, true, false, true , 20 * 60 * 3, 0, 0.6F, UseAnim.EAT), "cook_ham");
    public static RegistryObject<Item> BAKE_HAM = register(() -> Itemlist.ham(10, 1F, true, false, true ,20 * 60 * 6, 1, 0.9F, UseAnim.EAT), "bake_ham");
    public static RegistryObject<Item> CASKET = register(() -> Itemlist.food(10, 0.5F, false, false, true, new MobEffect[]{}, 0, 0, 0, UseAnim.EAT), "casket");
    public static RegistryObject<Item> BEER = register(() -> Itemlist.Drink(3,0.5F, true, false, true, new MobEffect[]{MobEffects.DAMAGE_BOOST, MobEffects.MOVEMENT_SPEED}, 20 * 60, 0, 1), "beer");
    public static RegistryObject<Item> CIDER = register(() -> Itemlist.Drink(5,0.5F, true, false, true, new MobEffect[]{MobEffects.NIGHT_VISION, MobEffects.DAMAGE_BOOST, MobEffects.MOVEMENT_SPEED}, 20 * 120, 1, 1), "cider");
    public static RegistryObject<Item> PLUM_WINE = register(() -> Itemlist.Drink(5,0.5F, true, false, true, new MobEffect[]{MobEffects.NIGHT_VISION, MobEffects.DAMAGE_BOOST, MobEffects.MOVEMENT_SPEED}, 20 * 30, 0, 1), "plum_wine");

    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ItemList.register(name, initializer);
    }
}