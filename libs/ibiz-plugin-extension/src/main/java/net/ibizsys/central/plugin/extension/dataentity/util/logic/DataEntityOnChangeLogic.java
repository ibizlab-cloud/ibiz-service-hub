package net.ibizsys.central.plugin.extension.dataentity.util.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.DataEntityOnChangeLogicBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class DataEntityOnChangeLogic extends DataEntityOnChangeLogicBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityOnChangeLogic.class);

	final IDEExtensionUtilRuntimeContext iDExtensionUtilRuntimeContext;
	final IDELogicRuntime iDELogicRuntime;
	
	private String strHookDataEntityTag = null;
	private String strHookDataScope = null;
	private String strHookDataScopeField = null;
	
	private IDataEntityRuntime hookDataEntityRuntime = null;
	private IPSDEField hookPSDEField = null;
	
	private List<?> hookPolicyList = null;
	
	
	
	
	public DataEntityOnChangeLogic(IDEExtensionUtilRuntimeContext iDExtensionUtilRuntimeContext, IDELogicRuntime iDELogicRuntime) {
		this.iDExtensionUtilRuntimeContext = iDExtensionUtilRuntimeContext;
		this.iDELogicRuntime = iDELogicRuntime;
	}
	
	protected IDEExtensionUtilRuntimeContext getDEExtensionUtilRuntimeContext() {
		return this.iDExtensionUtilRuntimeContext;
	}
	
	public IDELogicRuntime getDELogicRuntime() {
		return this.iDELogicRuntime;
	}
	
	
	
	public void install() throws Exception {
		this.onInstall();
		
		if(this.getHookDataEntityRuntime() == null) {
			throw new Exception("未指定监控实体对象");
		}
		
		if(this.getHookPSDEField() == null) {
			throw new Exception("未指定监控属性对象");
		}
		
		this.getHookDataEntityRuntime().registerDataEntityOnChangeLogic(this);
		
		
	}
	
	protected void onInstall() throws Exception {
		
		final IPSDELogic iPSDELogic = this.getDELogicRuntime().getPSDELogic();
		
		String strEventName = iPSDELogic.getEvents();
		if(StringUtils.hasLength(strEventName)) {
			String[] items = strEventName.split("[@]");
			String strHookDEFieldTag = null;
			if(items.length == 1) {
				//单项
				strHookDEFieldTag = items[0];
			}
			else {
				strHookDataScope = items[0];
				strHookDEFieldTag = items[1];
			}
			
			this.strHookDataEntityTag = PSModelUtils.getParentId(strHookDEFieldTag);
			//获取实体运行时
			this.hookDataEntityRuntime = this.getDEExtensionUtilRuntimeContext().getModelRuntime().getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(this.strHookDataEntityTag, false);
		
			this.hookPSDEField = this.hookDataEntityRuntime.getPSDEField(PSModelUtils.getSimpleId(strHookDEFieldTag), false);
			
			if(StringUtils.hasLength(iPSDELogic.getEventModel())) {
				this.hookPolicyList = JsonUtils.asList(iPSDELogic.getEventModel());
			}
			
		}
		else {
			this.hookDataEntityRuntime = this.getDEExtensionUtilRuntimeContext().getDEExtensionUtilRuntime().getDataEntityRuntime();
			//this.hookPSDEField = this.getDELogicRuntime().getPSDELogic().getps
			throw new Exception("没有实现");
		}
	}

	 
	
	public void uninstall() throws Exception {
		
		if(this.getHookDataEntityRuntime() != null) {
			this.getHookDataEntityRuntime().unregisterDataEntityOnChangeLogic(this);
		}
		
		
		this.onUninstall();
	}

	protected void onUninstall() throws Exception {
		
	}

	protected IDataEntityRuntime getHookDataEntityRuntime() {
		return this.hookDataEntityRuntime;
	}
	
	protected IPSDEField getHookPSDEField() {
		return this.hookPSDEField;
	}
	
	@Override
	protected void onExecute(net.ibizsys.central.dataentity.IDataEntityRuntime iDataEntityRuntime, IEntityDTO data, IEntityDTO last, String strActionMode, IPSDEAction iPSDEAction) throws Throwable {
		
		Object curValue = data.get(this.getHookPSDEField().getLowerCaseName());
		Object lastValue = last.get(this.getHookPSDEField().getLowerCaseName());
		
		if(DataTypeUtils.compare(this.getHookPSDEField().getStdDataType(), curValue, lastValue) == 0) {
			return;
		}
		
		if(!ObjectUtils.isEmpty(this.hookPolicyList)) {
			boolean bMatch = false;
			for(Object item : this.hookPolicyList) {
				if(!(item instanceof List)) {
					continue;
				}
				
				List list = (List)item;
				if(list.size() != 2) {
					continue;
				}
				
				//判断源值
				Object src = list.get(0);
				Object dst = list.get(1);
				
				if(!this.testValue(this.getHookPSDEField().getStdDataType(), src, lastValue)) {
					continue;
				}
				
				if(!this.testValue(this.getHookPSDEField().getStdDataType(), dst, curValue)) {
					continue;
				}
				
				
				
				bMatch = true;
				break;				
			}
			
			if(!bMatch) {
				return;
			}
		}
		
		Map<String, Object> logicParamMap = new HashMap<String, Object>();
		logicParamMap.put(IDEExtensionUtilRuntime.DELOGIC_DEFIELDHOOK_PARAM_LAST, last);
		
		this.getDEExtensionUtilRuntimeContext().executeLogic(getDELogicRuntime(), new Object[] {data, logicParamMap}, null);
	}
	
	protected boolean testValue(int nStdDataType, Object value, Object compare) {
		if(value == null) {
			return (compare == null);
		}
		
		if(value instanceof List) {
			List list = (List)value;
			for(Object item : list) {
				if(testValue(nStdDataType, item, compare )) {
					return true;
				}
			}
			return false;
		}
		else
			if(value instanceof String) {
				String strSource = (String)value;
				if(strSource.length() == 0) {
					return true;
				}
				return strSource.equals(compare);
			}
			else
				return DataTypeUtils.compare(nStdDataType, value, compare) == 0;
	}

}
