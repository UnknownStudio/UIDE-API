package cn.mccraft.uide.api.element;

import com.google.common.reflect.TypeToken;
import com.google.gson.JsonDeserializer;

import java.lang.reflect.Type;

public interface ElementDeserializer<T extends Element> extends JsonDeserializer<T> {
	default Type getElementType() {
		return new TypeToken<T>(){}.getType();
	}
}
