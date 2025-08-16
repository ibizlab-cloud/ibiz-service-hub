package net.ibizsys.centralstudio.util;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class PSCodeGeneratorBase extends PSRTModelExporterBase{

	private static final Log log = LogFactory.getLog(PSCodeGeneratorBase.class);
	
	
	@Override
	protected String onGetPSSysDevBKTaskName(Map paramMap) {
		return "代码产生任务";
	}
}
