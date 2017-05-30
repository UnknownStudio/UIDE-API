package cn.mccraft.uide.api.resource;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResourceLocation {
	private String domain, location;

	public ResourceLocation(String domain, String location) {
		this.domain = domain;
		this.location = location;
	}

	public ResourceLocation(String location) {
		String[] splits = location.split(":", 2);
		domain = splits[0];
		this.location = splits[1];
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return domain + ":" + location;
	}

	public Path toPath() {
		return Paths.get(domain, location);
	}
}
