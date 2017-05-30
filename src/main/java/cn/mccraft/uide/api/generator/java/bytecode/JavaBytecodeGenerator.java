package cn.mccraft.uide.api.generator.java.bytecode;

import cn.mccraft.uide.api.element.Element;
import cn.mccraft.uide.api.generator.Generator;

import java.nio.ByteBuffer;

public interface JavaBytecodeGenerator<T extends Element> extends Generator<T> {
	@Override
	ByteBuffer generate(T element);
}
