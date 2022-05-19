package club.someoneice.withfire.event;

import club.someoneice.withfire.Withfire;
import club.someoneice.withfire.init.ItemRegister;
import club.someoneice.withfire.init.tool.Itemlist;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Withfire.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvent {

    public void dropItem(LivingDropsEvent event, Item item, Item item2) {
    }

    @SubscribeEvent
    public void onLifeDrop(LivingDropsEvent event) {
        if (event.getEntityLiving() == null) {
            return;
        }

        if (event.getEntityLiving() instanceof Chicken) {
            this.dropItem(event, ItemRegister.BONE_SHARD.get(), null);
            return;
        }

        if (event.getEntityLiving() instanceof Fox) {
            this.dropItem(event, ItemRegister.BONE_SHARD.get(), ItemRegister.BONE_SHARD.get());
            return;
        }

        if (event.getEntityLiving() instanceof Cat) {
            this.dropItem(event, ItemRegister.BONE_SHARD.get(), ItemRegister.BONE_SHARD.get());
            return;
        }

        if (event.getEntityLiving() instanceof Wolf) {
            this.dropItem(event, Items.BONE, ItemRegister.BONE_SHARD.get());
            return;
        }

        if (event.getEntityLiving() instanceof Panda) {
            this.dropItem(event, Items.BONE, Items.BONE);
            return;
        }

        if (event.getEntityLiving() instanceof Pig) {
            this.dropItem(event, Items.BONE, Items.BONE);
            return;
        }

        if (event.getEntityLiving() instanceof Cow) {
            this.dropItem(event, Items.BONE, Items.BONE);
            return;
        }

        if (event.getEntityLiving() instanceof Goat) {
            this.dropItem(event, Items.BONE, Items.BONE);
            return;
        }

        if (event.getEntityLiving() instanceof Sheep) {
            this.dropItem(event, Items.BONE, Items.BONE);
            return;
        }

        if (event.getEntityLiving() instanceof Horse) {
            this.dropItem(event, Items.BONE, Items.BONE);
            return;
        }
    }
}