package net.mindshake.witchmobility.util;

import net.mindshake.witchmobility.entity.BroomEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BroomFX {
    public static void spawnParticle (BroomEntity entity, Random r, World world, ParticleEffect particleEffect) {
        double d = r.nextGaussian() * 0.02;
        double e = r.nextGaussian() * 0.02;
        double f = r.nextGaussian() * 0.02;
        world.addParticle(particleEffect, entity.getParticleX(0.4), entity.getRandomBodyY() + 0.1, entity.getParticleZ(1.0), d, e, f);
    }
}
