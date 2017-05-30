package cn.mccraft.uide.api.event.element;

import cn.mccraft.uide.api.event.CancelableEvent;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;

public interface ElementDeserializeEvent extends ElementEvent, CancelableEvent {
	JsonSerializationContext getSerializationContext();
	void setSerializationContext(JsonSerializationContext serializationContext);
	JsonArray getSerializedJson();
	void setSerializedJson(JsonArray serializedJson);
}
