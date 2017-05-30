package cn.mccraft.uide.api.element.impl;

import cn.mccraft.uide.api.element.ElementSerializer;
import cn.mccraft.uide.api.element.ValueElement;

public class ElementNumber implements ValueElement<Number> {
	private Number value;

	public ElementNumber(Number value) {
		this.value = value;
	}

	@Override
	public Number getValue() {
		return value;
	}

	@Override
	public void setValue(Number value) {
		this.value = value;
	}

	@Override
	public ElementSerializer newSerializerInstance() {
		return new DefaultElementSerializer();
	}
}
