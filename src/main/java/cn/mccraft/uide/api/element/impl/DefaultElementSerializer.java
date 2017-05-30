package cn.mccraft.uide.api.element.impl;

import cn.mccraft.uide.api.element.Element;
import cn.mccraft.uide.api.element.ElementSerializer;
import com.google.gson.*;

import java.lang.reflect.Type;

public class DefaultElementSerializer implements ElementSerializer<Element> {
	@Override
	public Element deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		if (!json.isJsonArray())
			throw new JsonParseException("Element json " + json + " isn't a instance of JsonArray");
		DefaultElement ret = new DefaultElement();
		for (JsonElement element : json.getAsJsonArray()) {
			if (element.isJsonPrimitive())
				if (element.getAsJsonPrimitive().isNumber())
					ret.addProperty(element.getAsNumber());
				else if (element.getAsJsonPrimitive().isString())
					ret.addProperty(element.getAsString());
				else if (element.getAsJsonPrimitive().isBoolean())
					ret.addProperty(element.getAsBoolean());
			else if (element.isJsonObject())
				ret.addProperty(context.<Element>deserialize(element, Element.class));
		}
		return ret;
	}

	@Override
	public JsonElement serialize(Element src, Type typeOfSrc, JsonSerializationContext context) {
		JsonArray array = new JsonArray();
		src.getProperties().stream().map(context::serialize).forEach(array::add);
		return array;
	}
}
