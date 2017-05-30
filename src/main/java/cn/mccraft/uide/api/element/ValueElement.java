package cn.mccraft.uide.api.element;

import java.util.List;

public interface ValueElement<T> extends Element {
	T getValue();
	void setValue(T value);

	@Override
	default void addProperty(Element property) {}

	@Override
	default void addProperty(String string) {}

	@Override
	default void addProperty(Number number) {}

	@Override
	default void addProperty(boolean bool) {}


	@Override
	default List<Element> getProperties() {
		return null;
	}

	@Override
	default boolean hasProperties() {
		return false;
	}
}
