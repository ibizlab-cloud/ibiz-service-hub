package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;

/**
 * 手册文档分割器
 * @author lionlau
 *
 */
public class ManualDocumentSplitter extends PageIndexDocumentSplitterBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ManualDocumentSplitter.class);
	
	@Override
	protected String downloadOSSText(String strImageUrl, ParserConfig parserConfig, Map<String, Object> requestParams) throws Throwable {
		if(!requestParams.containsKey(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE)) {
			if(!StringUtils.hasLength(parserConfig.getLayoutRecognize())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM__ENGINE, ICloudOSSClient.DOWNLOAD_TEXT_ENGINE__MANUAL);
			}
		}
		return super.downloadOSSText(strImageUrl, parserConfig, requestParams);
	}
	
}
