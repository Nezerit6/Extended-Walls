package extwalls.content;

import arc.struct.Seq;
import mindustry.content.*;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives;
import mindustry.type.ItemStack;

public class EWErekirTechTree {
    public static TechTree.TechNode context;

    public static void load() {
        margeNode(Blocks.berylliumWallLarge, () -> {
            node(EWBlocks.berylliumWallHuge, () -> {
                node(EWBlocks.berylliumWallGigantic);
            });
        });

        margeNode(Blocks.tungstenWallLarge, () -> {
            node(EWBlocks.tungstenWallHuge, () -> {
                node(EWBlocks.tungstenWallGigantic);
            });
        });

        margeNode(Blocks.surgeWallLarge, () -> {
            node(EWBlocks.surgeWallHugeErekir, () -> {
                node(EWBlocks.surgeWallGiganticErekir);
            });
        });

        margeNode(Blocks.carbideWallLarge, () -> {
            node(EWBlocks.carbideWallHuge, () -> {
                node(EWBlocks.carbideWallGigantic);
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