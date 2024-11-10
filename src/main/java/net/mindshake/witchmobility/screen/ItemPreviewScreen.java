package net.mindshake.witchmobility.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.mindshake.witchmobility.entity.BroomEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class ItemPreviewScreen extends Screen {

    private final int backgroundWidth, backgroundHeight;

    private float showAnimTime = 0;
    private final LivingEntity entity;

    public ItemPreviewScreen(EntityType<?> entityType) {
        super(Component.translatable("uwu"));
        backgroundWidth = 176;
        backgroundHeight = 188;
        assert Minecraft.getInstance().level != null;
        this.entity = (LivingEntity) entityType.create(Minecraft.getInstance().level);
    }


    /*@Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.fillGradient(matrices, 0, 0, this.width, this.height, -1072689136, -804253680);
        super.render(matrices, mouseX, mouseY, delta);
        int centerX = (width) / 2;
        int centerY = (height) / 2;

        showAnimTime = lerp(showAnimTime, 1f, delta / 1.25f);

        drawCenteredText(matrices,textRenderer, getTitle(), centerX, (int) (30 * showAnimTime), 0xffffff);
        drawCenteredText(matrices,textRenderer, getMovementSpeedText(), centerX, (int) (height - (120 * showAnimTime)), 0xffffff);
        drawCenteredText(matrices,textRenderer, getRotationSpeedText(), centerX, (int) (height - (100 * showAnimTime)), 0xffffff);
        drawEntity(centerX,centerY,(int) (80 * showAnimTime),mouseX - centerX,mouseY - centerY, entity);
    }*/
}
