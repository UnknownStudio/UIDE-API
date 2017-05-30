package cn.mccraft.uide.api.element.impl;

import cn.mccraft.uide.api.element.ElementSerializer;
import cn.mccraft.uide.api.element.ValueElement;

public class ElementString implements ValueElement<String> {
	private String string;

	public ElementString(String string) {
		this.string = string;
	}

	@Override
	public String getValue() {
		return string;
	}

	@Override
	public void setValue(String value) {
		this.string = value;
	}

	@Override
	public ElementSerializer newSerializerInstance() {
		return new DefaultElementSerializer();
	}
}
