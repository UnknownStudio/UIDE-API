package cn.mccraft.uide.api.registry;

import ro.fortsoft.pf4j.ExtensionPoint;
import ro.fortsoft.pf4j.PluginWrapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public interface Registry<K, V> extends Iterable<V>, ExtensionPoint {
	V get(Object key);
	V put(K key, V value);
	Set<K> keySet();
	Collection<V> values();

	@Override
	default Iterator<V> iterator() {
		return values().iterator();
	}

	default Optional<PluginWrapper> getProvider() {
		return Optional.empty();
	}
}
