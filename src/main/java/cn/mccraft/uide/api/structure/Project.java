package cn.mccraft.uide.api.structure;

import cn.mccraft.uide.api.element.Element;
import cn.mccraft.uide.api.registry.Registry;

import java.util.Collection;

public interface Project extends Dependency {
	Collection<Element> getElements();
}
