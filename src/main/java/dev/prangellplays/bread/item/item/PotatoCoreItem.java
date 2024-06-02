package dev.prangellplays.bread.item.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PotatoCoreItem extends Item {
    public PotatoCoreItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        {
            tooltip.add(Text.translatable("item.bread.core.description"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
