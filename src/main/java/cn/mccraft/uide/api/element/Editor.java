package cn.mccraft.uide.api.element;

import java.util.concurrent.Future;

public interface Editor<T extends Element> {
	Future<T> edit(T element);
}
