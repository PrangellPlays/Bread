package dev.prangellplays.bread.item.armor.PrangellPlays;

import dev.prangellplays.bread.item.util.BreadArmourMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PlasmythicHelemtItem extends PlasmythicArmorItem implements Equipment {

    private BreadArmourMaterials material;

    public PlasmythicHelemtItem(BreadArmourMaterials material, Type type, Settings settings) {
        super(material, type, settings);
        this.material = material;
    }
    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return this.equipAndSwap(this, world, user, hand);
    }
}
