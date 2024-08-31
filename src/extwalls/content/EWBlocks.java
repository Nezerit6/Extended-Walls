package extwalls.content;

import mindustry.content.Blocks;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

public class EWBlocks {
    public static Block
    copperWallHuge, copperWallGigantic,
    titaniumWallHuge, titaniumWallGigantic,
    plastaniumWallHuge, plastaniumWallGigantic,
    thoriumWallHuge, thoriumWallGigantic,
    phaseWallHuge, phaseWallGigantic,
    surgeWallHuge, surgeWallGigantic;

    public static void load(){
        int wallHealthMultiplier = 4;

        copperWallHuge = new Wall("copper-wall-huge"){{
           requirements(Category.defense, ItemStack.mult(Blocks.copperWall.requirements, 9));
           health = 80 * 9 * wallHealthMultiplier;
           size = 3;
        }};

        copperWallGigantic = new Wall("copper-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.copperWall.requirements, 16));
            health = 80 * 16 * wallHealthMultiplier;
            size = 4;
        }};
        titaniumWallHuge = new Wall("titanium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.titaniumWall.requirements, 9));
            health = 110 * 9 * wallHealthMultiplier;
            size = 3;
        }};

        titaniumWallGigantic = new Wall("titanium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.titaniumWall.requirements, 16));
            health = 110 * 16 * wallHealthMultiplier;
            size = 4;
        }};
        plastaniumWallHuge = new Wall("plastanium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.plastaniumWall.requirements, 9));
            health = 125 * 9 * wallHealthMultiplier;
            size = 3;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
        }};

        plastaniumWallGigantic = new Wall("plastanium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.plastaniumWall.requirements, 16));
            health = 125 * 16 * wallHealthMultiplier;
            size = 4;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
        }};

        thoriumWallHuge = new Wall("thorium-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.thoriumWall.requirements, 9));
            health = 200 * 9 * wallHealthMultiplier;
            size = 3;
        }};

        thoriumWallGigantic = new Wall("thorium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.thoriumWall.requirements, 16));
            health = 200 * 16 * wallHealthMultiplier;
            size = 4;
        }};

        phaseWallHuge = new Wall("phase-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.phaseWall.requirements, 9));
            health = 150 * 9 * wallHealthMultiplier;
            size = 3;
            chanceDeflect = 10f;
            flashHit = true;
        }};

        phaseWallGigantic = new Wall("phase-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.phaseWall.requirements, 16));
            health = 150 * 16 * wallHealthMultiplier;
            size = 4;
            chanceDeflect = 10f;
            flashHit = true;
        }};

        surgeWallHuge = new Wall("surge-wall-huge"){{
            requirements(Category.defense, ItemStack.mult(Blocks.surgeWall.requirements, 9));
            health = 230 * 9 * wallHealthMultiplier;
            size = 3;
            lightningChance = 0.05f;
        }};

        surgeWallGigantic = new Wall("surge-wall-gigantic"){{
            requirements(Category.defense, ItemStack.mult(Blocks.surgeWall.requirements, 16));
            health = 230 * 16 * wallHealthMultiplier;
            size = 4;
            lightningChance = 0.05f;
        }};
    }
}