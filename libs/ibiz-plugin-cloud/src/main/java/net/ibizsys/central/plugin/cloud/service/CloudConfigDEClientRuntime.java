package net.ibizsys.central.plugin.cloud.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.SubSysServiceAPIDERuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

public class CloudConfigDEClientRuntime extends SubSysServiceAPIDERuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CloudConfigDEClientRuntime.class);
	
	/**
	 * 路径参数：主键
	 */
	public final static String PARAM_KEY = "key";
	
	/**
	 * 路径参数：实体
	 */
	public final static String PARAM_DE = "de";
	
	/**
	 * 路径参数：系统标识
	 */
	public final static String PARAM_SYSTEM = "system";
	
	
	/**
	 * 属性标记，存储Cloud配置信息
	 */
	public final static String FIELDTAG_CLOUDCONFIG = "CLOUDCONFIG";
	
	private String strCloudConfigIdFormat = null;
	
	@Override
	protected void onInit() throws Exception {
		
		if(!StringUtils.hasLength(this.getCloudConfigIdFormat())){
			if(StringUtils.hasLength(this.getPSSubSysServiceAPIDE().getServiceParam())) {
				this.setCloudConfigIdFormat(this.getPSSubSysServiceAPIDE().getServiceParam());
			}
			else {
				this.setCloudConfigIdFormat("config-{system}-{de}-{key}");
			}
		}
			
		super.onInit();
	}
	
	
	
	protected String getCloudConfigIdFormat() {
		return strCloudConfigIdFormat;
	}



	protected void setCloudConfigIdFormat(String strCloudConfigIdFormat) {
		this.strCloudConfigIdFormat = strCloudConfigIdFormat;
	}



	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		
		String strActionMode = iPSDEAction.getActionMode();
		if(DEActionModes.GETDRAFT.equalsIgnoreCase(strActionMode)) {
			if(args != null && args.length != 0) {
				if(args[0] instanceof IEntityDTO) {
					return args[0];
				}
			}
			
			return iDataEntityRuntime.createEntity();
		}
		
		if(args == null || args.length == 0) {
			throw new Exception("传入参数无效");
		}
		
		Map<String, Object> map = new HashMap<>();
		IEntity iEntity = null;
		if(args != null && args.length > 0) {
			if(!(args[0] instanceof IEntity)) {
				map.put(PARAM_KEY , args[0]);
			}
			else
				iEntity = (IEntity)args[0];
				if(iDataEntityRuntime.getKeyPSDEField() != null) {
					Object objValue = iDataEntityRuntime.getFieldValue(iEntity, iDataEntityRuntime.getKeyPSDEField());
					map.put(PARAM_KEY , objValue);
				}
		}
		
		
		String strContent = null;
		IPSDEField cloudConfigPSDEField = iDataEntityRuntime.getPSDEFieldByTag(FIELDTAG_CLOUDCONFIG, true);
		
		if(DEActionModes.READ.equalsIgnoreCase(strActionMode)) {
			strContent = ServiceHub.getInstance().getConfig(this.getCloudConfigId(map));
			IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity();
			if(StringUtils.hasLength(strContent)) {
				if(cloudConfigPSDEField != null) {
					iEntityDTO.set(cloudConfigPSDEField.getLowerCaseName(), strContent);
				}
				else {
					Map data = JsonUtils.asMap(strContent);
					iEntityDTO.reload(data, true);
				}
			}
			iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), map.get(PARAM_KEY));
			return iEntityDTO;
		}
		else
			if(DEActionModes.REMOVE.equalsIgnoreCase(strActionMode)) {
				ServiceHub.getInstance().publishConfig(this.getCloudConfigId(map), new HashMap<String, Object>());
				return null;
			}
			else
				if(DEActionModes.CREATE.equalsIgnoreCase(strActionMode)
						|| DEActionModes.UPDATE.equalsIgnoreCase(strActionMode)) {
					
					if(iEntity == null) {
						throw new Exception("传入参数类型不正确");
					}
					
					if(cloudConfigPSDEField != null) {
						ServiceHub.getInstance().publishConfig(this.getCloudConfigId(map), JsonUtils.toString(iEntity.get(cloudConfigPSDEField.getLowerCaseName())));
					}
					else {
						ServiceHub.getInstance().publishConfig(this.getCloudConfigId(map), JsonUtils.toString(args[0]));
					}
					
					return null;
				}
				else
					throw new Exception(String.format("未支持的行为模式[%1$s]",  strActionMode));
	}
	

	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, java.util.Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		if(args!= null && args.length>0 &&  args[0] instanceof ISearchContext) {
			ISearchContext iSearchContext = (ISearchContext)args[0];
			return new PageImpl<Object>(new ArrayList<Object>(), iSearchContext.getPageable(), 0);
		}
		return null;
	}
	
	protected String getCloudConfigId(Map<String, Object> map) {
		map.put(PARAM_DE, this.getPSSubSysServiceAPIDE().getName());
		map.put(PARAM_SYSTEM, this.getSystemRuntime().getDeploySystemId());
		return ExpressionUtils.getValue(this.getCloudConfigIdFormat(), map).toLowerCase();
	}

}
