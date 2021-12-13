package net.starlegacy.feature.gas.collectionfactors

import org.bukkit.Location

class HyperspaceOnlyFactor : CollectionFactor() {
	override fun factor(location: Location?): Boolean {
		return location!!.world.name.contains("Hyperspace")
	}
}