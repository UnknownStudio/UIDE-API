package cn.mccraft.uide.api.registry;

import cn.mccraft.uide.api.resource.ResourceLocation;
import ro.fortsoft.pf4j.ExtensionPoint;

public interface RegistryEntry extends ExtensionPoint {
	ResourceLocation getRegistryName();
	void setRegistryName(ResourceLocation location);
}
