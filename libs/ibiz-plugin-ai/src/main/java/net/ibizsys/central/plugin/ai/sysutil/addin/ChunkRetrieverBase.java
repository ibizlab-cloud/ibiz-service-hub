package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.addin.IChunkRetriever;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;

/**
 *  片段召回器对象基类
 * 
 * @author lionlau
 *
 */
public abstract class ChunkRetrieverBase extends SysKnowledgeBaseUtilRTAddinBase implements IChunkRetriever {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ChunkRetrieverBase.class);
	
	protected double[] getEmbedding(String strEmbeddingAgent, String strContent) throws Throwable {
		return this.getContext().getEmbedding(strEmbeddingAgent, strContent);
	}

	@Override
	public List<Chunk> retrieve(List<Object> kbIds, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable {
		return this.onRetrieve(kbIds, iChunkSearchContext, config);
	}
	
	protected List<Chunk> onRetrieve(List<Object> kbIds, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected String getTemplateContent(String strTemplate, Map<String, String> variables) {
		if (!ObjectUtils.isEmpty(variables)) {
			for (java.util.Map.Entry<String, String> entry : variables.entrySet()) {
				String strContent = ObjectUtils.isEmpty(entry.getValue())?"":entry.getValue();
				strTemplate = strTemplate.replace(String.format("{%1$s}", entry.getKey()), strContent);
			}
		}
		return strTemplate;
	}
}
