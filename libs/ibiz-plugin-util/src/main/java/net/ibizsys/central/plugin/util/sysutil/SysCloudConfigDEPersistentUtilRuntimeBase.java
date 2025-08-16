package net.ibizsys.central.plugin.util.sysutil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.sysutil.SysDEPersistentUtilRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysCloudConfigDEPersistentUtilRuntimeBase extends SysDEPersistentUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysCloudConfigDEPersistentUtilRuntimeBase.class);
	
	/**
	 * 路径参数：主键
	 */
	public final static String PARAM_REALKEY = "realkey";
	
	
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
	public final static String FIELDTAG_CONFIG = "CONFIG";
	
	
	@Override
	protected Object doCreate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		Map<String, Object> map = new HashMap<>();
		IEntity iEntity = null;
		if(args != null && args.length > 0) {
			if(!(args[0] instanceof IEntity)) {
				map.put(PARAM_REALKEY , args[0]);
			}
			else
				iEntity = (IEntity)args[0];
				if(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField() != null) {
					Object objValue = iDataEntityRuntimeContext.getDataEntityRuntime().getFieldValue(iEntity, iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField());
					map.put(PARAM_REALKEY , objValue);
				}
		}

		String strContent = null;
		IPSDEField configPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(FIELDTAG_CONFIG, true);
		
		if(iEntity == null) {
			throw new Exception("传入参数类型不正确");
		}
		
		if(configPSDEField != null) {
			ServiceHub.getInstance().publishConfig(this.getCloudConfigId(iDataEntityRuntimeContext, map), JsonUtils.toString(iEntity.get(configPSDEField.getLowerCaseName())));
		}
		else {
			ServiceHub.getInstance().publishConfig(this.getCloudConfigId(iDataEntityRuntimeContext, map), JsonUtils.toString(args[0]));
		}
		
		return null;
	}

	@Override
	protected Object doUpdate(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		return this.doCreate(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
	}

	@Override
	protected Object doRemove(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		Map<String, Object> map = new HashMap<>();
		IEntity iEntity = null;
		if(args != null && args.length > 0) {
			if(!(args[0] instanceof IEntity)) {
				map.put(PARAM_REALKEY , args[0]);
			}
			else {
				iEntity = (IEntity)args[0];
				if(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField() != null) {
					Object objValue = iDataEntityRuntimeContext.getDataEntityRuntime().getFieldValue(iEntity, iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField());
					map.put(PARAM_REALKEY , objValue);
				}
			}
		}

		ServiceHub.getInstance().publishConfig(this.getCloudConfigId(iDataEntityRuntimeContext, map), new HashMap<String, Object>());
		return null;
	}

	@Override
	protected Object doGet(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		
		Map<String, Object> map = new HashMap<>();
		IEntity iEntity = null;
		if(args != null && args.length > 0) {
			if(!(args[0] instanceof IEntity)) {
				map.put(PARAM_REALKEY , args[0]);
			}
			else {
					iEntity = (IEntity)args[0];
					if(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField() != null) {
						Object objValue = iDataEntityRuntimeContext.getDataEntityRuntime().getFieldValue(iEntity, iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField());
						map.put(PARAM_REALKEY , objValue);
					}
				}
		}

		String strContent = null;
		IPSDEField configPSDEField = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFieldByTag(FIELDTAG_CONFIG, true);
		
		strContent = ServiceHub.getInstance().getConfig(this.getCloudConfigId(iDataEntityRuntimeContext, map));
		IEntityDTO iEntityDTO = (IEntityDTO)iDataEntityRuntimeContext.getDataEntityRuntime().createEntity();
		if(StringUtils.hasLength(strContent)) {
			if(configPSDEField != null) {
				iEntityDTO.set(configPSDEField.getLowerCaseName(), strContent);
			}
			else {
				Map data = JsonUtils.asMap(strContent);
				iEntityDTO.reload(data, true);
			}
		}
		iEntityDTO.set(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), map.get(PARAM_REALKEY));
		return iEntityDTO;
	}

	@Override
	protected Object doFetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		if(args!= null && args.length>0 &&  args[0] instanceof ISearchContext) {
			ISearchContext iSearchContext = (ISearchContext)args[0];
			return new PageImpl<Object>(new ArrayList<Object>(), iSearchContext.getPageable(), 0);
		}
		return null;
	}

	protected String getCloudConfigId(IDataEntityRuntimeContext iDataEntityRuntimeContext, Map<String, Object> map) throws Exception {
		Object key = map.get(PARAM_REALKEY);
		if(ObjectUtils.isEmpty(key)) {
			throw new Exception("未传入键值");
		}
		
		String strKey = KeyValueUtils.genUniqueId(key.toString());
		
		map.put(PARAM_KEY, strKey);
		map.put(PARAM_DE, iDataEntityRuntimeContext.getDataEntityRuntime().getName());
		map.put(PARAM_SYSTEM, this.getSystemRuntime().getDeploySystemId());
		return ExpressionUtils.getValue(this.getCloudConfigIdFormat(iDataEntityRuntimeContext), map).toLowerCase();
	}
	
	protected String getCloudConfigIdFormat(IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception{
		IPSDEGroupDetail iPSDEGroupDetail = this.getPSDEGroupDetail(iDataEntityRuntimeContext.getDataEntityRuntime().getId(), true);
		if(iPSDEGroupDetail == null || !StringUtils.hasLength(iPSDEGroupDetail.getDetailParam())) {
			return "config-{system}-{de}-{key}";
		}
		return iPSDEGroupDetail.getDetailParam();		
	}

}
