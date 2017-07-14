package cn.mccraft.uide.api.structure;

import cn.mccraft.uide.api.resource.ResourceLocation;

import java.util.Collection;
import java.util.Collections;

public interface Dependency {
	Dependency UIDEAPI = new Dependency() {
		@Override
		public ResourceLocation getName() {
			return new ResourceLocation("uide", "api");
		}

		@Override
		public String getVersion() {
			return "@apiver@";
		}

		@Override
		public Collection<Dependency> getDependencies() {
			return Collections.emptySet();
		}
	};

	ResourceLocation getName();
	String getVersion();
	default Collection<Dependency> getDependencies() {
		return Collections.singleton(UIDEAPI);
	}
}
