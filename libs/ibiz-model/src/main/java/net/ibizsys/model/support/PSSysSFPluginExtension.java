package net.ibizsys.model.support;

import net.ibizsys.model.res.IPSSysSFPlugin;

/**
 * 后台插件对象扩展
 * @author lionlau
 *
 */
public class PSSysSFPluginExtension {

	public static String getComment(IPSSysSFPlugin self) {
		return self.getMemo();
	}
	
	
	
	
}
