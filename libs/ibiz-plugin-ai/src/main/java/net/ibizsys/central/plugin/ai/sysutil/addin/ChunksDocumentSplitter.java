package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 分片文档分割器
 * @author lionlau
 *
 */
public class ChunksDocumentSplitter extends PageIndexDocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ChunksDocumentSplitter.class);
	
	@Override
	protected List<Chunk> doSplitText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		
		if(ObjectUtils.isEmpty(text)) {
			return new ArrayList<Chunk>();
		}
		
		List<Chunk> chunkList = JsonUtils.as(text, ChunkListType);
		for(Chunk chunk : chunkList) {
			chunk.setType(ChunkType.ORIGINAL.getValue());
		}
		
		return chunkList;
	}
}
