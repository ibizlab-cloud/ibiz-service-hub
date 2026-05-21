package net.ibizsys.central.cloud.core.dataentity.search;

import java.util.List;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

public interface IDESearchRuntime extends net.ibizsys.central.dataentity.search.IDESearchRuntime {

	/**
	 * 获取知识片段
	 * @param iChunkSearchContext
	 * @return
	 */
	List<Chunk> selectChunks(IChunkSearchContext iChunkSearchContext);
}
