package com.zerren.chainreaction.core.registry;

import com.zerren.chainreaction.tile.TEMultiBlockBase;
import com.zerren.chainreaction.tile.chest.TEChest;
import com.zerren.chainreaction.tile.chest.TEChestThaumium;
import com.zerren.chainreaction.tile.chest.TEChestVoid;
import com.zerren.chainreaction.tile.mechanism.TEBloomery;
import com.zerren.chainreaction.tile.plumbing.TEDistroChamber;
import com.zerren.chainreaction.tile.plumbing.TEGasTank;
import com.zerren.chainreaction.tile.plumbing.TEHeatExchanger;
import com.zerren.chainreaction.tile.plumbing.TEPressurePipe;
import com.zerren.chainreaction.tile.reactor.TEPressurizedWaterReactor;
import com.zerren.chainreaction.tile.vault.TEVaultBase;
import com.zerren.chainreaction.tile.vault.TEVaultController;
import com.zerren.chainreaction.tile.vault.TEVaultLock;
import com.zerren.chainreaction.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zerren on 2/22/2015.
 */
public final class TileEntities {
    public static void init() {
        GameRegistry.registerTileEntityWithAlternatives(TEMultiBlockBase.class, "multiblock", "tile.multiblock");

        GameRegistry.registerTileEntityWithAlternatives(TEVaultBase.class, Names.Blocks.VAULT, "tile." + Names.Blocks.VAULT);
        GameRegistry.registerTileEntityWithAlternatives(TEVaultLock.class, Names.Blocks.VAULT + "Lock", "tile." + Names.Blocks.VAULT + "Lock");
        GameRegistry.registerTileEntityWithAlternatives(TEVaultController.class, Names.Blocks.VAULT + "Controller", "tile." + Names.Blocks.VAULT + "Controller");

        GameRegistry.registerTileEntityWithAlternatives(TEChest.class, Names.Blocks.CHEST + "Brick", "tile." + Names.Blocks.CHEST + "Brick");
        GameRegistry.registerTileEntityWithAlternatives(TEChestThaumium.class, Names.Blocks.CHEST + "Thaumium", "tile." + Names.Blocks.CHEST + "Thaumium");
        GameRegistry.registerTileEntityWithAlternatives(TEChestVoid.class, Names.Blocks.CHEST + "Void", "tile." + Names.Blocks.CHEST + "Void");

        GameRegistry.registerTileEntityWithAlternatives(TEHeatExchanger.class, Names.Blocks.PLUMBING, "tile." + Names.Blocks.PLUMBING);
        GameRegistry.registerTileEntityWithAlternatives(TEDistroChamber.class, Names.Blocks.PLUMBING + "DistroChamber", "tile." + Names.Blocks.PLUMBING + "DistroChamber");
        GameRegistry.registerTileEntityWithAlternatives(TEPressurePipe.class, Names.Blocks.PLUMBING + "PressurePipe", "tile." + Names.Blocks.PLUMBING + "PressurePipe");
        GameRegistry.registerTileEntityWithAlternatives(TEGasTank.class, Names.Blocks.PLUMBING + "GasTank", "tile." + Names.Blocks.PLUMBING + "GasTank");

        GameRegistry.registerTileEntityWithAlternatives(TEPressurizedWaterReactor.class, Names.Blocks.REACTOR, "tile." + Names.Blocks.REACTOR);
        GameRegistry.registerTileEntityWithAlternatives(TEBloomery.class, Names.Blocks.MECHANISM, "tile." + Names.Blocks.MECHANISM + "Bloomery");
    }
}
