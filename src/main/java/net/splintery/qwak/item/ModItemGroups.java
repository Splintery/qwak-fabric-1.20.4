package net.splintery.qwak.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.splintery.qwak.Qwak;
import net.splintery.qwak.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ENDER_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(Qwak.MOD_ID, "ender"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ender"))
                    .icon(() -> new ItemStack(ModItems.ENDER_SHARD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDER_SHARD);
                        entries.add(ModBlocks.ENGINEER_TABLE);
                    }).build()
    );

    public static void registerModItemGroups() {
        Qwak.LOGGER.info("Registering item groups for {}", Qwak.MOD_ID);
    }
}
