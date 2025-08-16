package net.ibizsys.central.plugin.extension.addin;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 运行时模型同步工具
 * @author lionlau
 *
 */
public interface IPSModelSyncTool extends IModelRTAddin{

	public final static String PSMODELSYNC_PREDEFINEDFIELD_OWNER_TYPE = "OWNER_TYPE";
	
	public final static String PSMODELSYNC_PREDEFINEDFIELD_OWNER_SUBTYPE = "OWNER_SUBTYPE";
	
	public final static String PSMODELSYNC_PREDEFINEDFIELD_OWNER_ID = "OWNER_ID";
	
	public final static String PSMODELSYNC_PREDEFINEDFIELD_ORDER_VALUE = "ORDER_VALUE";
	
	public final static String PSMODELSYNC_PREDEFINEDFIELD_NAME = "NAME";
	
	public final static String PSMODELSYNC_PREDEFINEDFIELD_DESCRIPTION = "DESCRIPTION";
	
	public final static String PSMODELSYNC_PREDEFINEDFIELD_TAG = "TAG";
	
	public final static String PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC = "PSMODEL_SYNC";
	

	
	/**
	 * 同步模型
	 * @param iPSModelObject
	 * @param param
	 */
	void sync(IPSModelObject iPSModelObject, Object param);
}
