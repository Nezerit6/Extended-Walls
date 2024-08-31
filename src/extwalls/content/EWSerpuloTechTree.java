package extwalls.content;

import arc.struct.Seq;
import mindustry.content.*;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives;
import mindustry.type.ItemStack;

public class EWSerpuloTechTree {
    public static TechTree.TechNode context;

    public static void load() {
        margeNode(Blocks.copperWallLarge, () -> {
            node(EWBlocks.copperWallHuge, () -> {
                node(EWBlocks.copperWallGigantic);
            });
        });

        margeNode(Blocks.titaniumWallLarge, () -> {
            node(EWBlocks.titaniumWallHuge, () -> {
                node(EWBlocks.titaniumWallGigantic);
            });
        });

        margeNode(Blocks.plastaniumWallLarge, () -> {
            node(EWBlocks.plastaniumWallHuge, () -> {
                node(EWBlocks.plastaniumWallGigantic);
            });
        });

        margeNode(Blocks.thoriumWallLarge, () -> {
            node(EWBlocks.thoriumWallHuge, () -> {
                node(EWBlocks.thoriumWallGigantic);
            });
        });

        margeNode(Blocks.phaseWallLarge, () -> {
            node(EWBlocks.phaseWallHuge, () -> {
                node(EWBlocks.phaseWallGigantic);
            });
        });

        margeNode(Blocks.surgeWallLarge, () -> {
            node(EWBlocks.surgeWallHuge, () -> {
                node(EWBlocks.surgeWallGigantic);
            });
        });
    }

    private static void margeNode(UnlockableContent parent, Runnable children) {
        context = TechTree.all.find(t -> t.content == parent);
        children.run();
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objectives.Objective> objectives, Runnable children) {
        TechTree.TechNode node = new TechTree.TechNode(context, content, requirements);
        if (objectives != null) node.objectives = objectives;

        TechTree.TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children) {
        node(content, requirements, null, children);
    }

    private static void node(UnlockableContent content, Runnable children) {
        node(content, content.researchRequirements(), children);
    }

    private static void node(UnlockableContent block) {
        node(block, () -> {
        });
    }
}