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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ResourceLocation that = (ResourceLocation) o;

		if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
		return location != null ? location.equals(that.location) : that.location == null;
	}

	@Override
	public int hashCode() {
		int result = domain != null ? domain.hashCode() : 0;
		result = 31 * result + (location != null ? location.hashCode() : 0);
		return result;
	}
}
