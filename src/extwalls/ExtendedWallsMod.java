package extwalls;

import extwalls.content.EWBlocks;
import extwalls.content.EWSerpuloTechTree;
import mindustry.mod.*;

public class ExtendedWallsMod extends Mod{

    @Override
    public void loadContent(){
        EWBlocks.load();
        EWSerpuloTechTree.load();
    }
}