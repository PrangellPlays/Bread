package dev.prangellplays.bread.block;

import dev.prangellplays.bread.registry.BreadBlocks;
import dev.prangellplays.bread.registry.BreadItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class PlasmaOreBlock extends Block {
    public PlasmaOreBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.GLASS_BOTTLE)) {
            itemStack.decrement(1);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.addParticle(ParticleTypes.EXPLOSION, pos.getX(), pos.getY()+1, pos.getZ(), 1, 1, 1);
            world.setBlockState(this.getDefaultState(pos), Blocks.OBSIDIAN.getDefaultState());
            if (itemStack.isEmpty()) {
                player.setStackInHand(hand, new ItemStack(BreadItems.BOTTLE_OF_PLASMA));
            } else if (!player.getInventory().insertStack(new ItemStack(BreadItems.BOTTLE_OF_PLASMA))) {
                player.dropItem(new ItemStack(BreadItems.BOTTLE_OF_PLASMA), false);
            }
        }

        return ActionResult.SUCCESS;
    }

    private BlockPos getDefaultState(BlockPos pos) {
        return pos;
    }
}
