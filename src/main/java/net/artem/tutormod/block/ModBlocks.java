package net.artem.tutormod.block;

import net.artem.tutormod.TutorMod;
import net.artem.tutormod.item.ModelItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(BuiltInRegistries.BLOCK, TutorMod.MOD_ID);

    // Регистрируем руду бисмута (теперь с опытом при добыче)
    public static final DeferredHolder<Block, Block> BISMUTH_ORE = BLOCKS.register("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));

    // Регистрируем предмет блока
    public static final DeferredHolder<Item, Item> BISMUTH_ORE_ITEM = ModelItems.ITEMS.register("bismuth_ore",
            () -> new BlockItem(BISMUTH_ORE.get(), new Item.Properties()));
}