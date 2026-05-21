package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorConfig;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 直接分片文档分割器
 * @author lionlau
 *
 */
public class RawChunksDocumentSplitter extends DocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(RawChunksDocumentSplitter.class);
	
	@Override
	protected List<Chunk> doSplitText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		
		if(ObjectUtils.isEmpty(text)) {
			return new ArrayList<Chunk>();
		}
		
		List<Chunk> chunkList = JsonUtils.as(text, ChunkListType);
		for(Chunk chunk : chunkList) {
			if(ObjectUtils.isEmpty(chunk.getType())) {
				chunk.setType(ChunkType.ORIGINAL.getValue());
			}
		}
		
		return chunkList;
	}
	
	@Override
	protected List<Chunk> doChunkExtraction(Object documentId, List<Chunk> chunkList, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		return chunkList;
		//return super.doChunkExtraction(documentId, chunkList, chunkMethod, parserConfig);
	}
	
	@Override
	protected List<Chunk> doRaptorCluster(Object documentId, List<Chunk> chunkList, RaptorConfig config) throws Throwable {
		return chunkList;
		//return super.doRaptorCluster(documentId, chunkList, config);
	}
}
