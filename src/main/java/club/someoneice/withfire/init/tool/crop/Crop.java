package club.someoneice.withfire.init.tool.crop;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Crop extends CropBlock {
    public Crop() {
        super(Properties.of(Material.PLANT).noCollission().noOcclusion().sound(SoundType.CROP).randomTicks().instabreak());
    }
}
