package net.mindshake.witchmobility.screen;

import net.mindshake.witchmobility.entity.BroomEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import org.joml.Quaternionf;
import org.joml.Vector3f;

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
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        //context.fillGradient(0, 0, this.width, this.height, -1072689136, -804253680);
        context.fillGradient(0, 0, this.width, this.height, 0x2a00384D, 0x0000004D);
        super.render(context, mouseX, mouseY, delta);
        int centerX = width / 2;
        int centerY = height / 2;

        showAnimTime = lerp(showAnimTime, 1f, delta / 1.25f);

        context.drawCenteredTextWithShadow(textRenderer, getTitle(), centerX, (int) (30 * showAnimTime), 0xffffff);
        context.drawCenteredTextWithShadow(textRenderer, getMovementSpeedText(), centerX, (int) (height - (120 * showAnimTime)), 0xffffff);
        context.drawCenteredTextWithShadow(textRenderer, getRotationSpeedText(), centerX, (int) (height - (100 * showAnimTime)), 0xffffff);
        drawEntity(
                context,
                centerX - 500,
                centerY - 500,
                centerX + 500,
                centerY + 500,
                (int) (80 * showAnimTime),
                0.0625F,
                mouseX - centerX - this.width,
                mouseY - centerY - this.height,
                entity
        );
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

    @Override
    public Text getTitle() {
        return entity.getName();
    }

    public Text getMovementSpeedText () {
        return Text.literal("Movement speed: " + ((BroomEntity)entity).getSpeed());
    }

    public Text getRotationSpeedText () {
        return Text.literal("Rotation speed: " + ((BroomEntity)entity).getRotationSpeed());
    }

    /**
     * Make mathematic lerp function
     * @param a Origin
     * @param b Destination
     * @param interpolation Interpolation between A and B
     * @return Result of interpolation
     */
    public static float lerp(float a, float b, float interpolation) {
        return a + interpolation * (b - a);
    }

    public static void drawEntity(DrawContext context, int x1, int y1, int x2, int y2, int size, float f, float mouseX, float mouseY, LivingEntity entity) {
        float g = (float)(x1 + x2) / 2.0F;
        float h = (float)(y1 + y2) / 2.0F;
        context.enableScissor(x1, y1, x2, y2);
        float i = (float)Math.atan(mouseX / 120f) * 3f;//(float)Math.atan((double)((g - mouseX) / 40.0F));
        float j = (float)Math.atan(mouseY / 120f) * 0.75f;//(float)Math.atan((double)((h - mouseY) / 40.0F));
        Quaternionf quaternionf = (new Quaternionf()).rotateZ(3.1415927F);
        Quaternionf quaternionf2 = (new Quaternionf()).rotateX(j * 20.0F * 0.017453292F);
        quaternionf.mul(quaternionf2);
        float k = entity.bodyYaw;
        float l = entity.getYaw();
        float m = entity.getPitch();
        float n = entity.prevHeadYaw;
        float o = entity.headYaw;
        entity.bodyYaw = 180F + i * 40.0F;
        entity.setYaw(180F + i * 80.0F);
        entity.setPitch(-j * 120.0F + 30f);
        entity.headYaw = entity.getYaw();
        entity.prevHeadYaw = entity.getYaw();
        Vector3f vector3f = new Vector3f(0.0F, entity.getHeight() / 2.0F + f, 0.0F);

        InventoryScreen.drawEntity(context, g, h, size, vector3f, quaternionf, quaternionf2, entity);

        entity.bodyYaw = k;
        entity.setYaw(l);
        entity.setPitch(m);
        entity.prevHeadYaw = n;
        entity.headYaw = o;
        context.disableScissor();
    }
}
