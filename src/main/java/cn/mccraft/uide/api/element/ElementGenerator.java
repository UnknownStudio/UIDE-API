package cn.mccraft.uide.api.element;

import ro.fortsoft.pf4j.ExtensionPoint;

public interface ElementGenerator<T extends Element> extends ExtensionPoint {
	T generate();
}
