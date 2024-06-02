package dev.prangellplays.bread.item.weapons.PotatoBoy24;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Random;

public class PotatoBladeL1 extends SwordItem {
    public PotatoBladeL1(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Random roll = new Random();
        if (roll.nextDouble() < 0.34D) {
            target.dropItem(Items.POTATO);
        }
        return super.postHit(stack, target, attacker);
    }
}
