package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;

/**
 * ppt文档分割器
 * @author lionlau
 *
 */
public class PresentationDocumentSplitter extends PageIndexDocumentSplitterBase {

	@Override
	protected String downloadOSSText(String strImageUrl, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE)) {
			if(!StringUtils.hasLength(parserConfig.getLayoutRecognize())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, ICloudOSSClient.DOWNLOAD_TEXT_ENGINE__PPT);
			}
		}
		return super.downloadOSSText(strImageUrl, parserConfig, requestParams);
	}
}
