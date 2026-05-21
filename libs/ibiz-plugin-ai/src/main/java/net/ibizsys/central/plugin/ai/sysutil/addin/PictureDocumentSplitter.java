package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.runtime.util.domain.File;

/**
 * 图片文档分割器
 * @author lionlau
 *
 */
public class PictureDocumentSplitter extends DocumentSplitterBase {

	@Override
	protected String onGetOriginalContent(Object documentId, File ossFile, String chunkMethod, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if (!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE)) {
			if(StringUtils.hasLength(parserConfig.getLayoutRecognize())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, parserConfig.getLayoutRecognize());
			}
			else
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, ICloudOSSClient.DOWNLOAD_TEXT_ENGINE__VL);
		}
		return super.onGetOriginalContent(documentId, ossFile, chunkMethod, parserConfig, requestParams);
	}
}
