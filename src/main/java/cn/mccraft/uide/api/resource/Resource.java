package cn.mccraft.uide.api.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public interface Resource extends Serializable {
	Path getPath();
	default BufferedReader newBufferedReader() throws IOException {
		return Files.newBufferedReader(getPath(), StandardCharsets.UTF_8);
	}
}
