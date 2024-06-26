package dev.prangellplays.bread.item.armor.PrangellPlays;

import dev.prangellplays.bread.item.util.BreadArmourMaterials;
import dev.prangellplays.bread.registry.BreadEffects;
import dev.prangellplays.bread.registry.BreadItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PlasmythicChestplateItem extends PlasmythicArmorItem implements Equipment {

    private BreadArmourMaterials material;

    public PlasmythicChestplateItem(BreadArmourMaterials material, Type type, Settings settings) {
        super(material, type, settings);
        this.material = material;
    }
    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.CHEST;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return this.equipAndSwap(this, world, user, hand);
    }
}
