package cn.mccraft.uide.api.generator;

import cn.mccraft.uide.api.element.Element;
import com.google.common.reflect.TypeToken;
import ro.fortsoft.pf4j.ExtensionPoint;

import java.lang.reflect.Type;
import java.nio.Buffer;

public interface Generator<T extends Element> extends ExtensionPoint {
	Buffer generate(T element);
	String getFileName(T element);
	default Type getElementType() {
		return new TypeToken<T>(){}.getType();
	}
}
