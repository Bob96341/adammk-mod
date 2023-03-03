package net.tylericepack.adammkmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tylericepack.adammkmod.AdammkMod;
import net.tylericepack.adammkmod.item.custom.PalmAdamItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdammkMod.MODID);

    public static final RegistryObject<Item> Adamium = ITEMS.register("adamium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ADAM_IN_A_PALM = ITEMS.register("adam_in_a_palm", () -> new PalmAdamItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(1).fireResistant()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
