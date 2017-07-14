package cn.mccraft.uide.api.element;

import cn.mccraft.uide.api.resource.ResourceLocation;
import ro.fortsoft.pf4j.ExtensionPoint;

public interface Element extends ExtensionPoint {
	String getName();
	ResourceLocation getType();
}
