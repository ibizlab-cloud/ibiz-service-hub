package net.ibizsys.central.plugin.util.sysutil;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.sysutil.SysDEDataSyncOutUtilRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;

public abstract class SysCloudConfigDESyncUtilRuntimeBase extends SysDEDataSyncOutUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysCloudConfigDESyncUtilRuntimeBase.class);
	
	/**
	 * 路径参数：主键
	 */
	public final static String PARAM_KEY = "key";
	
	/**
	 * 路径参数：系统标识
	 */
	public final static String PARAM_SYSTEM = "system";
	
	
	/**
	 * 功能参数：配置标识，支持{param}
	 */
	public final static String UTILPARAM_CONFIGID = "configid";
	
	
	
	/**
	 * 属性标记，存储Cloud配置信息
	 */
	public final static String FIELDTAG_CONFIG = "CONFIG";
	
	private String strConfigIdFormat = null;
	
	@Override
	protected void onInit() throws Exception {
		this.strConfigIdFormat = this.getUtilParam(UTILPARAM_CONFIGID, null);
		super.onInit();
	}
	
	
	@Override
	protected void onAfterCreate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable {
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String strConfigId = this.getCloudConfigId(iDataEntityRuntimeContext, map, iEntityDTO);
		String strConfig = this.getConfig(iDataEntityRuntimeContext, iEntityDTO);
		ServiceHub.getInstance().publishConfig(strConfigId, strConfig);
		
		super.onAfterCreate(iDataEntityRuntimeContext, iPSDEAction, iEntityDTO);
	}
	
	@Override
	protected void onAfterUpdate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String strConfigId = this.getCloudConfigId(iDataEntityRuntimeContext, map, iEntityDTO);
		String strConfig = this.getConfig(iDataEntityRuntimeContext, iEntityDTO);
		ServiceHub.getInstance().publishConfig(strConfigId, strConfig);
		
		super.onAfterUpdate(iDataEntityRuntimeContext, iPSDEAction, iEntityDTO);
	}
	
	@Override
	protected void onBeforeRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String strConfigId = this.getCloudConfigId(iDataEntityRuntimeContext, map, iEntityDTO);
		ServiceHub.getInstance().removeConfig(strConfigId);
		
		super.onBeforeRemove(iDataEntityRuntimeContext, iPSDEAction, iEntityDTO);
	}
	
	
	
	protected String getConfig(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO) throws Throwable{
		IPSDEField configPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(FIELDTAG_CONFIG, true);
		if(configPSDEField != null) {
			return iEntityDTO.getString(configPSDEField.getLowerCaseName(), null);
		}
		return null;
	}
	

	protected String getCloudConfigId(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map, IEntityDTO iEntityDTO) throws Exception {
		if(!map.containsKey(PARAM_SYSTEM)) {
			map.put(PARAM_SYSTEM, this.getSystemRuntime().getDeploySystemId());
		}
		if(!map.containsKey(PARAM_KEY)) {
			map.put(PARAM_KEY, iDataEntityRuntimeContext.getDataEntityRuntime().getKeyFieldValue(iEntityDTO));
		}
		return ExpressionUtils.getValue(this.getCloudConfigIdFormat(iDataEntityRuntimeContext), map).toLowerCase();
	}
	
	protected String getCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception{
		IPSDEGroupDetail iPSDEGroupDetail = this.getPSDEGroupDetail(iDataEntityRuntimeContext.getDataEntityRuntime().getId(), true);
		if(iPSDEGroupDetail == null || !StringUtils.hasLength(iPSDEGroupDetail.getDetailParam())) {
			//return "config-{system}-{de}-{key}";
			if(StringUtils.hasLength(strConfigIdFormat)) {
				return strConfigIdFormat;
			}
			return getDefaultCloudConfigIdFormat(iDataEntityRuntimeContext);
		}
		return iPSDEGroupDetail.getDetailParam();		
	}
	
	protected abstract String getDefaultCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception;

}
