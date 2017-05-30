package cn.mccraft.uide.api.element;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public interface ElementSerializer<T extends Element> extends JsonSerializer<T>, JsonDeserializer<T> {
}
