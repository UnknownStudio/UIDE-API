package cn.mccraft.uide.api.generator;

import cn.mccraft.uide.api.element.Element;
import ro.fortsoft.pf4j.ExtensionPoint;

import java.nio.Buffer;

public interface Generator<T extends Element> extends ExtensionPoint {
	Buffer generate(T element);
}
