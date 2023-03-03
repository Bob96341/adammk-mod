package net.tylericepack.adammkmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PalmAdamItem extends Item {
    private final String[] msgs = {"the mere sight of a child makes my cock enormous",
            "and suddenly her face changes into a fucking autistic knucl=kel",
            "i imagine every time you right click me you constantly picture 20 different ways to cum in my mouth as i speak",
            "i will fucking delete homosexuality",
            "mo yundo",
            "your brain isnt actually a brain but the battleground for worms rumble",
            "the last time i interacted with a woman in my class i got punched in the face and fell over",
            "SOY PEDRO",
            "the letter 5 is too high of a number",
            "ok boomer",
            "let go of me",
            "my phat fingoes always cuck me",
            "how are men so hot"};
    public PalmAdamItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && (hand==InteractionHand.MAIN_HAND || hand==InteractionHand.OFF_HAND)){
            outputRandMsg(player);
            player.getCooldowns().addCooldown(this,20);
        }
        return super.use(level, player, hand);
    }
    private void outputRandMsg(Player player){
        player.sendSystemMessage(Component.literal(getRandMsg()));
    }
    private String getRandMsg(){
        return msgs[RandomSource.createNewThreadLocalInstance().nextInt(11)];
    }
}
