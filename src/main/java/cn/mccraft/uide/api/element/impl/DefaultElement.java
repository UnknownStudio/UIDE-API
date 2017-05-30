package cn.mccraft.uide.api.element.impl;

import cn.mccraft.uide.api.element.Element;
import cn.mccraft.uide.api.element.ElementSerializer;

import java.util.ArrayList;
import java.util.List;

public class DefaultElement implements Element {
	private List<Element> properties = new ArrayList<>();

	@Override
	public void addProperty(Element property) {
		properties.add(property);
	}

	@Override
	public void addProperty(String string) {
		properties.add(new ElementString(string));
	}

	@Override
	public void addProperty(Number number) {
		properties.add(new ElementNumber(number));
	}

	@Override
	public void addProperty(boolean bool) {
		properties.add(new ElementBoolean(bool));
	}

	@Override
	public List<Element> getProperties() {
		return properties;
	}

	@Override
	public ElementSerializer newSerializerInstance() {
		return new DefaultElementSerializer();
	}
}
