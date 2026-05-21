package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.ChunkField;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorConfig;
import net.ibizsys.runtime.util.domain.File;

/**
 * 单个文档分割器
 * 
 * @author lionlau
 *
 */
public class OneDocumentSplitter extends DocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OneDocumentSplitter.class);

	@Override
	public List<Chunk> split(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		parserConfig.getRaptorConfig().setUseRaptor(false);
		return super.split(documentId, ossFile, chunkMethod, parserConfig);
	}

	@Override
	public List<Chunk> split(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		parserConfig.getRaptorConfig().setUseRaptor(false);
		return super.split(documentId, text, chunkMethod, parserConfig);
	}

	@Override
	protected List<Chunk> doRaptorCluster(Object documentId, List<Chunk> chunkList, RaptorConfig config) throws Throwable {
		return chunkList;
	}

	@Override
	protected List<Chunk> doSplitText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		List<Chunk> chunkList = new ArrayList<Chunk>();
		Chunk chunk = new Chunk();
		chunk.setContent(text);
		chunk.setType(ChunkType.ORIGINAL.getValue());
		chunk.set(ChunkField.SEQUENCE.name(), 0);
		chunkList.add(chunk);
		return chunkList;
	}

	@Override
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if (!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE)) {
			if (StringUtils.hasLength(parserConfig.getLayoutRecognize())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, parserConfig.getLayoutRecognize());
			}
		}
		return super.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
}
