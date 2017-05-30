package cn.mccraft.uide.api.event;

import net.hakugyokurou.aeb.Cancelable;

public interface CancelableEvent extends Cancelable {
	void cancel();
}
