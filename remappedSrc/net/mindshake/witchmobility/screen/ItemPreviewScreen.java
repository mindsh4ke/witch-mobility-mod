package net.mindshake.witchmobility.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.entity.BroomEntity;
import net.mindshake.witchmobility.registry.ModEntities;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3f;

import java.util.Objects;


public class ItemPreviewScreen extends Screen {

    private final int backgroundWidth, backgroundHeight;

    private float showAnimTime = 0;
    private final LivingEntity entity;

    public ItemPreviewScreen(EntityType<?> entityType) {
        super(entityType.getName());
        backgroundWidth = 176;
        backgroundHeight = 188;
        this.entity = (LivingEntity) entityType.create(MinecraftClient.getInstance().world);
    }

    @Override
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
    }

    @Override
    public Text getTitle() {
        return entity.getName();
    }

    public Text getMovementSpeedText () {
        return new LiteralText("Movement speed: " + ((BroomEntity)entity).getSpeed());
    }

    public Text getRotationSpeedText () {
        return new LiteralText("Rotation speed: " + ((BroomEntity)entity).getRotationSpeed());
    }

    public static float lerp(float a, float b, float interpolation) {
        return a + interpolation * (b - a);
    }

    public static void drawEntity(int x, int y, int size, float mouseX, float mouseY, LivingEntity entity) {
        float f = (float)Math.atan(mouseX / 40.0f) * 1.5f; //40.0f was default
        float g = (float)Math.atan(mouseY / 40.0f) * 1.5f;
        MatrixStack matrixStack = RenderSystem.getModelViewStack();
        matrixStack.push();
        matrixStack.translate(x, y, 1200.0);
        matrixStack.scale(1.0f, 1.0f, -1.0f);
        RenderSystem.applyModelViewMatrix();
        MatrixStack matrixStack2 = new MatrixStack();
        matrixStack2.translate(0.0, 0.0, 1000.0);
        matrixStack2.scale(size, size, size);
        Quaternion quaternion = Vec3f.POSITIVE_Z.getDegreesQuaternion(180.0f);
        Quaternion quaternion2 = Vec3f.POSITIVE_X.getDegreesQuaternion(g * 20.0f);
        quaternion.hamiltonProduct(quaternion2);
        matrixStack2.multiply(quaternion);
        float h = entity.bodyYaw;
        float i = entity.getYaw();
        float j = entity.getPitch();
        float k = entity.prevHeadYaw;
        float l = entity.headYaw;
        entity.bodyYaw = 180.0f + f * 20.0f;
        entity.setYaw(180.0f + f * 40.0f);
        entity.setPitch(-g * 20.0f);
        entity.headYaw = entity.getYaw();
        entity.prevHeadYaw = entity.getYaw();
        DiffuseLighting.method_34742();
        EntityRenderDispatcher entityRenderDispatcher = MinecraftClient.getInstance().getEntityRenderDispatcher();
        quaternion2.conjugate();
        entityRenderDispatcher.setRotation(quaternion2);
        entityRenderDispatcher.setRenderShadows(false);
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        RenderSystem.runAsFancy(() -> entityRenderDispatcher.render(entity, 0.0, 0.0, 0.0, 0.0f, 1.0f, matrixStack2, immediate, 0xF000F0));
        immediate.draw();
        entityRenderDispatcher.setRenderShadows(true);
        entity.bodyYaw = h;
        entity.setYaw(i);
        entity.setPitch(j);
        entity.prevHeadYaw = k;
        entity.headYaw = l;
        matrixStack.pop();
        RenderSystem.applyModelViewMatrix();
        DiffuseLighting.enableGuiDepthLighting();
    }
}
