package cn.mccraft.uide.api.element;

import ro.fortsoft.pf4j.ExtensionPoint;

import java.util.Iterator;
import java.util.List;

public interface Element extends ExtensionPoint, Iterable<Element> {
	void addProperty(Element property);
	void addProperty(String string);
	void addProperty(Number number);
	void addProperty(boolean bool);
	List<Element> getProperties();
	default boolean hasProperties() {
		return getProperties() != null;
	}
	ElementSerializer newSerializerInstance();

	@Override
	default Iterator<Element> iterator() {
		return getProperties().iterator();
	}
}
