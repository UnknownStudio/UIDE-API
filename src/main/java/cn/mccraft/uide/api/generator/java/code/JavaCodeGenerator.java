package cn.mccraft.uide.api.generator.java.code;

import cn.mccraft.uide.api.element.Element;
import cn.mccraft.uide.api.generator.Generator;

import java.nio.CharBuffer;

public interface JavaCodeGenerator<T extends Element> extends Generator<T> {
	@Override
	CharBuffer generate(T element);
}
