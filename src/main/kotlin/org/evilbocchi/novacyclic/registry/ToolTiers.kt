@file:Suppress("unused")

package org.evilbocchi.novacyclic.registry

import org.evilbocchi.novacyclic.NovaCyclic
import xyz.xenondevs.nova.addon.registry.ToolTierRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object ToolTiers : ToolTierRegistry by NovaCyclic.registry {
    
    val NETHERBRICK = registerToolTier("netherbrick")
    val SANDSTONE = registerToolTier("sandstone")
    val COPPER = registerToolTier("copper")
    val AMETHYST = registerToolTier("amethyst")
    val EMERALD = registerToolTier("emerald")
    val GEMOBSIDIAN = registerToolTier("gem_obsidian")
}