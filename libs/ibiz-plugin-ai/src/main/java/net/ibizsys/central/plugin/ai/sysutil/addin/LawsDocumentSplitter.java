package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.util.domain.File;

/**
 * 法律文档分割器
 * @author lionlau
 *
 */
public class LawsDocumentSplitter extends PageIndexDocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(LawsDocumentSplitter.class);
	private static final Map<String, String> originContentFileExtMap = new HashMap<String, String>();
	static {
		originContentFileExtMap.put("md", "");
		originContentFileExtMap.put("markdown", "");
		originContentFileExtMap.put("html", "");
		originContentFileExtMap.put("htm", "");
		originContentFileExtMap.put("txt", "");
		originContentFileExtMap.put("text", "");
		//originContentFileExtMap.put(".json", "");
		originContentFileExtMap.put("doc", "");
		originContentFileExtMap.put("docx", "");
	}
	
	@Override
	public List<Chunk> split(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		if(!parserConfig.getPageIndexConfig().isUsePageIndex()) {
			parserConfig.getPageIndexConfig().setUsePageIndex(true);
		}
		return super.split(documentId, ossFile, chunkMethod, parserConfig);
	}
	
	@Override
	public List<Chunk> split(Object documentId, String text, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		if(!parserConfig.getPageIndexConfig().isUsePageIndex()) {
			parserConfig.getPageIndexConfig().setUsePageIndex(true);
		}
		return super.split(documentId, text, chunkMethod, parserConfig);
	}
	
	@Override
	public String getOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig) throws Throwable {
		if(!parserConfig.getPageIndexConfig().isUsePageIndex()) {
			parserConfig.getPageIndexConfig().setUsePageIndex(true);
		}
		return super.getOriginalContent(documentId, ossFile, chunkMethod, parserConfig);
	}
	
	@Override
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		//需要判断文件结尾，是否对.md、.html、.txt做常规处理处理
		String strName = ossFile.getFileName();
		if(StringUtils.hasLength(strName)) {
			String strExt = FilenameUtils.getExtension(strName);
			if(StringUtils.hasLength(strExt)) {
				if(originContentFileExtMap.containsKey(strExt.toLowerCase())) {
					String strOriginalContent = this.doGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
					return  this.getMarkdownFullText(strOriginalContent, true, requestParams);
				}
			}
		}
		
		return super.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
	
	
}
