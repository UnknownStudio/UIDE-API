package cn.mccraft.uide.api.file;

import cn.mccraft.uide.api.structure.Workspace;

import java.io.File;

public interface IWorkspaceIO {
	Workspace readWorkspace(File file);
	void writeWorkspace(File file);
}
