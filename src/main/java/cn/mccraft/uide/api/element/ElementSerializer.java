package cn.mccraft.uide.api.element;

import com.google.common.reflect.TypeToken;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public interface ElementSerializer<T extends Element> extends JsonSerializer<T> {
	default Type getElementType() {
		return new TypeToken<T>(){}.getType();
	}
}
