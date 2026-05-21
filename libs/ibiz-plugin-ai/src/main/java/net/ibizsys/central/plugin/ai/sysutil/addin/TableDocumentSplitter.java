package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.plugin.ai.util.TextPreprocessUtils;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.File;

/**
 *表格文档分割器
 * 
 * @author lionlau
 *
 */
public class TableDocumentSplitter extends PageIndexDocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(TableDocumentSplitter.class);

	@Override
	protected List<Chunk> getPageChunks(Object documentId, String text, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {

		List<Chunk> chunkList = this.doSplitText(documentId, text, chunkMethod, parserConfig);
		if(!ObjectUtils.isEmpty(chunkList)) {
			for(Chunk chunk : chunkList) {
				chunk.setType(ChunkType.PAGE.getValue());
			}
		}
		return chunkList;
	}

	@Override
	protected List<Chunk> doSplitText(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		ObjectNode sheetArrays = JsonUtils.toObjectNode(text);
		if(sheetArrays.size() == 0) {
			return Collections.EMPTY_LIST;
		}
		//获取第一个分页
		ArrayNode rows = null;
		while(sheetArrays.fieldNames().hasNext()) {
			String name = sheetArrays.fieldNames().next();
			rows = (ArrayNode) sheetArrays.get(name);
			break;
		}
		//
		if(rows == null || rows.size() == 0) {
			return Collections.EMPTY_LIST;
		}
		
		List<Chunk> chunkList = new ArrayList<Chunk>();
		
		//第一行为标题
		ArrayNode captionRow = (ArrayNode) rows.get(0);
		for(int i = 1;i<rows.size();i++) {
			ArrayNode row = (ArrayNode) rows.get(i);
			StringBuilder sb = new StringBuilder();
			int nMinLength = captionRow.size();
			for(int j =0;j<nMinLength;j++) {
				String strCaption = captionRow.get(j).asText(null);
				if(ObjectUtils.isEmpty(strCaption)) {
					continue;
				}
				
				String strContent = "";
				if(j < row.size()) {
					strContent = row.get(j).asText("");
				}
				
				if(!ObjectUtils.isEmpty(sb.toString())) {
					sb.append("\n");
				}
				sb.append(String.format("%1$s: %2$s", strCaption, strContent));
			}
			String strText = TextPreprocessUtils.process(sb.toString(), parserConfig);
			if(!StringUtils.hasLength(strText)) {
				continue;
			}
			
			Chunk chunk = new Chunk();
			chunk.setContent(strText);
			chunk.setType(ChunkType.ORIGINAL.getValue());
			chunkList.add(chunk);
		}
		
		return chunkList;
	}

	@Override
	protected boolean needTOCValidation(List<Chunk> chunkList) {
		// 默认不需要做目录判断
		return false;
	}
	
	@Override
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if (!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE)) {
			requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__TYPE, ICloudOSSClient.DOWNLOAD_TEXT_TYPE__JSON);
		}
		return super.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}

}
