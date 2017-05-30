package cn.mccraft.uide.api.registry;

import java.util.Collection;

public interface RegistryManager {
	<K, V extends RegistryEntry> Registry<K, V> getRegistryForEntry(V entry);
	Collection<? extends Registry> getAllRegistries();
}
