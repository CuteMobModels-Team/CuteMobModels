//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/billy/Music/yarr/map"!

//Decompiled by Procyon!

package yarrmateys.cuteMobModelsRemake.mobs;

import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.network.datasync.*;
import net.minecraft.util.math.*;
import yarrmateys.cuteMobModelsRemake.*;
import net.minecraft.entity.projectile.*;

public class EntityCMMRGhastS extends EntityMob
{
    private static final DataParameter<Byte> ON_FIRE;
    private float heightOffset;
    private int heightOffsetUpdateTime;
    private double moveSpeed;
    
    public EntityCMMRGhastS(final World var1) {
        super(var1);
        this.heightOffset = 0.5f;
        this.isImmuneToFire = true;
        this.experienceValue = 10;
        this.stepHeight = 1.2f;
        this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
        this.tasks.addTask(4, (EntityAIBase)new AIFireballAttack());
        this.tasks.addTask(5, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 1.0));
        this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0));
        this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityPlayer.class, 8.0f));
        this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, (Class)EntityLiving.class, 4.0f));
        this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
        this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false, new Class[0]));
        this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, (Class)EntityAgeable.class, true));
        this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, (Class)EntityWaterMob.class, true));
        this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, (Class)EntityAmbientCreature.class, true));
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0);
    }
    
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register((DataParameter)EntityCMMRGhastS.ON_FIRE, (Object)0);
    }
    
    protected String getLivingSound() {
        return "mob.ghast.moan";
    }
    
    public void onLivingUpdate() {
        if (!this.onGround && this.motionY < 0.0) {
            this.motionY *= 0.6;
        }
        if (this.world.isRemote) {
            if (this.rand.nextInt(24) != 0 || !this.isSilent()) {}
            for (int i = 0; i < 2; ++i) {}
        }
        super.onLivingUpdate();
    }
    
    protected void updateAITasks() {
        if (this.isWet()) {}
        --this.heightOffsetUpdateTime;
        if (this.heightOffsetUpdateTime <= 0) {
            this.heightOffsetUpdateTime = 100;
            this.heightOffset = 0.5f + (float)this.rand.nextGaussian() * 3.0f;
        }
        final EntityLivingBase entitylivingbase = this.getAttackTarget();
        if (entitylivingbase != null && entitylivingbase.posY + entitylivingbase.getEyeHeight() > this.posY + this.getEyeHeight() + this.heightOffset) {
            this.motionY += (0.30000001192092896 - this.motionY) * 0.30000001192092896;
            this.isAirBorne = true;
        }
        super.updateAITasks();
    }
    
    public void fall(final float distance, final float damageMultiplier) {
    }
    
    protected Item getDropItem() {
        return Items.GUNPOWDER;
    }
    
    public boolean isBurning() {
        return this.isCharged();
    }
    
    protected void dropFewItems(final boolean var1, final int var2) {
        for (int var3 = this.rand.nextInt(2) + this.rand.nextInt(1 + var2), var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.GHAST_TEAR, 1);
        }
        for (int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + var2), var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.GUNPOWDER, 1);
        }
    }
    
    public boolean isCharged() {
        return ((byte)this.dataManager.get((DataParameter)EntityCMMRGhastS.ON_FIRE) & 0x1) != 0x0;
    }
    
    public void setOnFire(final boolean onFire) {
        byte b0 = (byte)this.dataManager.get((DataParameter)EntityCMMRGhastS.ON_FIRE);
        if (onFire) {
            b0 |= 0x1;
        }
        else {
            b0 &= 0xFFFFFFFE;
        }
        this.dataManager.set((DataParameter)EntityCMMRGhastS.ON_FIRE, (Object)b0);
    }
    
    protected boolean isValidLightLevel() {
        return true;
    }
    
    public boolean getCanSpawnHere() {
        return this.rand.nextInt(20) == 0 && super.getCanSpawnHere() && this.world.getDifficulty().getId() > 0;
    }
    
    public int getMaxSpawnedInChunk() {
        return 1;
    }
    
    protected Entity findPlayerToAttack() {
        return null;
    }
    
    public float getEyeHeight() {
        return this.height * 0.92f;
    }
    
    static {
        ON_FIRE = EntityDataManager.createKey((Class)EntityCMMRGhastS.class, DataSerializers.BYTE);
    }
    
    class AIFireballAttack extends EntityAIBase
    {
        private EntityCMMRGhastS ghasts;
        private int attackStep;
        private int attackTime;
        
        public AIFireballAttack() {
            this.ghasts = EntityCMMRGhastS.this;
            this.setMutexBits(3);
        }
        
        public boolean shouldExecute() {
            final EntityLivingBase entitylivingbase = this.ghasts.getAttackTarget();
            return entitylivingbase != null && entitylivingbase.isEntityAlive();
        }
        
        public void startExecuting() {
            this.attackStep = 0;
        }
        
        public void resetTask() {
            this.ghasts.setOnFire(false);
        }
        
        public void updateTask() {
            --this.attackTime;
            final EntityLivingBase entitylivingbase = this.ghasts.getAttackTarget();
            final double d0 = this.ghasts.getDistanceSq((Entity)entitylivingbase);
            if (d0 < 4.0) {
                if (this.attackTime <= 0) {
                    this.attackTime = 20;
                    this.ghasts.attackEntityAsMob((Entity)entitylivingbase);
                }
                this.ghasts.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0);
            }
            else if (d0 < 256.0) {
                final double d2 = entitylivingbase.posX - this.ghasts.posX;
                final double d3 = entitylivingbase.getEntityBoundingBox().minY + entitylivingbase.height / 2.0f - (this.ghasts.posY + this.ghasts.height / 2.0f);
                final double d4 = entitylivingbase.posZ - this.ghasts.posZ;
                if (this.attackTime <= 0) {
                    ++this.attackStep;
                    if (this.attackStep == 1) {
                        this.attackTime = 60;
                        this.ghasts.setOnFire(true);
                    }
                    else if (this.attackStep <= 4) {
                        this.attackTime = 6;
                    }
                    else {
                        this.attackTime = 100;
                        this.attackStep = 0;
                        this.ghasts.setOnFire(false);
                    }
                    if (this.attackStep > 1) {
                        final float f = MathHelper.sqrt(MathHelper.sqrt(d0)) * 0.5f;
                        this.ghasts.world.playEvent((EntityPlayer)null, 1009, new BlockPos((int)this.ghasts.posX, (int)this.ghasts.posY, (int)this.ghasts.posZ), 0);
                        if (YarrCuteMobModelsRemake.GhastSBrutalGhastSister) {
                            for (int i = 0; i < 1; ++i) {
                                final EntityLargeFireball entitylargefireball = new EntityLargeFireball(this.ghasts.world, (EntityLivingBase)this.ghasts, d2 + this.ghasts.getRNG().nextGaussian() * f, d3, d4 + this.ghasts.getRNG().nextGaussian() * f);
                                entitylargefireball.posY = this.ghasts.posY + this.ghasts.height / 2.0f + 0.5;
                                this.ghasts.world.spawnEntity((Entity)entitylargefireball);
                            }
                        }
                        else {
                            for (int i = 0; i < 1; ++i) {
                                final EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.ghasts.world, (EntityLivingBase)this.ghasts, d2 + this.ghasts.getRNG().nextGaussian() * f, d3, d4 + this.ghasts.getRNG().nextGaussian() * f);
                                entitysmallfireball.posY = this.ghasts.posY + this.ghasts.height / 2.0f + 0.5;
                                this.ghasts.world.spawnEntity((Entity)entitysmallfireball);
                            }
                        }
                    }
                }
                this.ghasts.getLookHelper().setLookPositionWithEntity((Entity)entitylivingbase, 10.0f, 10.0f);
            }
            else {
                this.ghasts.getNavigator().clearPath();
                this.ghasts.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0);
            }
            super.updateTask();
        }
    }
}
