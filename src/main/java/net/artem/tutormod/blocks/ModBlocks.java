package net.artem.tutormod.blocks;

import net.artem.tutormod.TutorMod;
import net.artem.tutormod.item.ModelItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(BuiltInRegistries.BLOCK, TutorMod.MOD_ID);

    // Регистрируем сам блок
    public static final DeferredHolder<Block, Block> BISMUTH_ORE = BLOCKS.register("bismuth_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));

    // Регистрируем предмет блока
    public static final DeferredHolder<Item, Item> BISMUTH_ORE_ITEM = ModelItems.ITEMS.register("bismuth_ore",
            () -> new BlockItem(BISMUTH_ORE.get(), new Item.Properties()));
}
