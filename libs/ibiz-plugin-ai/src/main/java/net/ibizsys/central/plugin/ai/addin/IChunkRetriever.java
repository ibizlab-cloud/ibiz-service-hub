package net.ibizsys.central.plugin.ai.addin;

import java.util.List;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.plugin.IModelRTAddin2;

public interface IChunkRetriever extends IModelRTAddin2 {

	/**
	 * 召回资料
	 * @param kbId
	 * @param iChunkSearchContext
	 * @param config
	 * @return
	 * @throws Throwable
	 */
	List<Chunk> retrieve(List<Object> kbIds, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable;
}
