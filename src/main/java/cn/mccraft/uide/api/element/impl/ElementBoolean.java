package cn.mccraft.uide.api.element.impl;

import cn.mccraft.uide.api.element.ElementSerializer;
import cn.mccraft.uide.api.element.ValueElement;

public class ElementBoolean implements ValueElement<Boolean> {
	private boolean value;

	public ElementBoolean(boolean value) {
		this.value = value;
	}

	@Override
	public Boolean getValue() {
		return value;
	}

	@Override
	public void setValue(Boolean value) {
		this.value = value;
	}

	@Override
	public ElementSerializer newSerializerInstance() {
		return new DefaultElementSerializer();
	}
}
