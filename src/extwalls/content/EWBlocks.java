package extwalls.content;

import mindustry.content.Blocks;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.defense.*;
import mindustry.world.meta.Env;

public class EWBlocks {
    public static Block
    //Serpulo
    copperWallHuge, copperWallGigantic,
    titaniumWallHuge, titaniumWallGigantic,
    plastaniumWallHuge, plastaniumWallGigantic,
    thoriumWallHuge, thoriumWallGigantic,
    phaseWallHuge, phaseWallGigantic,
    surgeWallHuge, surgeWallGigantic,

    //Erekir
    berylliumWallHuge, berylliumWallGigantic,
    tungstenWallHuge, tungstenWallGigantic,
    surgeWallHugeErekir, surgeWallGiganticErekir,
    carbideWallHuge, carbideWallGigantic,
    phaseWallHugeErekir, phaseWallGiganticErekir;

    public static void load(){

        //SERPULO

        copperWallHuge = new Wall("copper-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.copperWall.requirements, 9));
            health = 80 * 36;
            size = 3;

            envDisabled |= Env.scorching;
        }};

        copperWallGigantic = new Wall("copper-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.copperWall.requirements, 16));
            health = 80 * 64;
            size = 4;

            envDisabled |= Env.scorching;
        }};

        titaniumWallHuge = new Wall("titanium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.titaniumWall.requirements, 9));
            health = 110 * 36;
            size = 3;

            envDisabled |= Env.scorching;
        }};

        titaniumWallGigantic = new Wall("titanium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.titaniumWall.requirements, 16));
            health = 110 * 64;
            size = 4;

            envDisabled |= Env.scorching;
        }};

        plastaniumWallHuge = new Wall("plastanium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.plastaniumWall.requirements, 9));
            health = 130 * 36;
            size = 3;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;

            envDisabled |= Env.scorching;
        }};

        plastaniumWallGigantic = new Wall("plastanium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.plastaniumWall.requirements, 16));
            health = 130 * 64;
            size = 4;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;

            envDisabled |= Env.scorching;
        }};

        thoriumWallHuge = new Wall("thorium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.thoriumWall.requirements, 9));
            health = 200 * 36;
            size = 3;

            envDisabled |= Env.scorching;
        }};

        thoriumWallGigantic = new Wall("thorium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.thoriumWall.requirements, 16));
            health = 200 * 64;
            size = 4;

            envDisabled |= Env.scorching;
        }};

        phaseWallHuge = new Wall("phase-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.phaseWall.requirements, 9));
            health = 150 * 36;
            size = 3;
            chanceDeflect = 10f;
            flashHit = true;

            envDisabled |= Env.scorching;
        }};

        phaseWallGigantic = new Wall("phase-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.phaseWall.requirements, 16));
            health = 150 * 64;
            size = 4;
            chanceDeflect = 10f;
            flashHit = true;

            envDisabled |= Env.scorching;
        }};

        surgeWallHuge = new Wall("surge-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.surgeWall.requirements, 9));
            health = 230 * 36;
            size = 3;
            lightningChance = 0.05f;

            envDisabled |= Env.scorching;
        }};

        surgeWallGigantic = new Wall("surge-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.surgeWall.requirements, 16));
            health = 230 * 64;
            size = 4;
            lightningChance = 0.05f;

            envDisabled |= Env.scorching;
        }};

        //EREKIR

        berylliumWallHuge = new Wall("beryllium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.berylliumWallLarge.requirements, 2.25f));
            health = 130 * 36;
            armor = 2f;
            buildCostMultiplier = 2.25f;
            size = 3;
        }};

        berylliumWallGigantic = new Wall("beryllium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.berylliumWallLarge.requirements, 4f));
            health = 130 * 64;
            armor = 2f;
            buildCostMultiplier = 4f;
            size = 4;
        }};

        tungstenWallHuge = new Wall("tungsten-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.tungstenWallLarge.requirements, 2.25f));
            health = 180 * 36;
            armor = 14f;
            buildCostMultiplier = 2.25f;
            size = 3;
        }};

        tungstenWallGigantic = new Wall("tungsten-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.tungstenWallLarge.requirements, 4f));
            health = 180 * 64;
            armor = 14f;
            buildCostMultiplier = 4f;
            size = 4;
        }};

        surgeWallHugeErekir = new Wall("surge-wall-huge-erekir"){{
            requirements(Category.defense, ItemStack.mult(Blocks.surgeWall.requirements, 9));
            health = 230 * 36;
            size = 3;
            lightningChance = 0.05f;

            envEnabled |= Env.scorching;
            envDisabled |= Env.oxygen;
        }};

        surgeWallGiganticErekir = new Wall("surge-wall-gigantic-erekir"){{
            requirements(Category.defense, ItemStack.mult(Blocks.surgeWall.requirements, 16));
            health = 230 * 64;
            size = 4;
            lightningChance = 0.05f;

            envEnabled |= Env.scorching;
            envDisabled |= Env.oxygen;
        }};

        carbideWallHuge = new Wall("carbide-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.carbideWallLarge.requirements, 2.25f));
            health = 270 * 36;
            armor = 18f;
            buildCostMultiplier = 2.25f;
            size = 3;
        }};

        carbideWallGigantic = new Wall("carbide-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.carbideWallLarge.requirements, 4f));
            health = 270 * 64;
            armor = 18f;
            buildCostMultiplier = 4f;
            size = 4;
        }};

        phaseWallHugeErekir = new ShieldWall("phase-wall-huge-erekir"){{
            requirements(Category.defense, ItemStack.mult(Blocks.phaseWall.requirements, 9));
            health = 150 * 36;
            size = 3;
            chanceDeflect = 10f;
            flashHit = true;

            envEnabled |= Env.scorching;
            envDisabled |= Env.oxygen;

            outputsPower = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;

            consumePower(3f / 60f * 9);
        }};

        phaseWallGiganticErekir = new ShieldWall("phase-wall-gigantic-erekir"){{
            requirements(Category.defense, ItemStack.mult(Blocks.phaseWall.requirements, 16));
            health = 150 * 64;
            size = 4;
            chanceDeflect = 10f;
            flashHit = true;

            envEnabled |= Env.scorching;
            envDisabled |= Env.oxygen;

            outputsPower = false;
            hasPower = true;
            consumesPower = true;
            conductivePower = true;

            consumePower(3f / 60f * 16);
        }};
    }
}