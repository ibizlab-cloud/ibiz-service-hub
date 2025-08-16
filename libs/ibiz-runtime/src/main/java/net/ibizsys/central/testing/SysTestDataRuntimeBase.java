package net.ibizsys.central.testing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.testing.IPSSysTestData;
import net.ibizsys.model.testing.IPSSysTestDataItem;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.PropertiesUtils;
import net.ibizsys.runtime.util.script.IScriptEntity;

/**
 * 系统测试数据运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysTestDataRuntimeBase extends SystemModelRuntimeBase implements ISysTestDataRuntime {

	private static final Log log = LogFactory.getLog(SysTestDataRuntimeBase.class);

	private IPSSysTestData iPSSysTestData = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private Invocable invocable = null;
	private Map<String, Object> data = null;
	private String strTestDataType = null;

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysTestData iPSSysTestData) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysTestData = iPSSysTestData;
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {
		strTestDataType = this.getPSSysTestData().getTestDataType();
		if(!StringUtils.hasLength(strTestDataType)) {
			strTestDataType = TestDataTypes.DATA;
		}
		
		prepareDataMode();
		if(TestDataTypes.CUSTOMCODE.equals(strTestDataType)) {
			prepareCodeMode();
		}
		
		super.onInit();
	}
	
	public String getTestDataType() {
		return this.strTestDataType;
	}
	
	protected void prepareDataMode() throws Exception{
		String strData = this.getPSSysTestData().getData();
		if (!StringUtils.hasLength(strData)) {
			return;
		}
		strData = strData.toString();
		if (!StringUtils.hasLength(strData)) {
			return;
		}
		
		if(strData.indexOf("{") == 0) {
			ObjectNode objectNode = JsonUtils.toObjectNode(strData);
			data = JsonUtils.MAPPER.convertValue(objectNode, Map.class);
		}
		else {
			Properties properties =	PropertiesUtils.load(strData);
			if(properties != null) {
				data = new LinkedHashMap<String, Object>();
				for(Object objKey : properties.keySet()) {
					String strName = (String)objKey;
					data.put(strName, PropertiesUtils.getProperty(properties, strName));
				}
			}
		}
	}
	
	protected void prepareCodeMode() throws Exception{
		String strCustomCode = this.getPSSysTestData().getScriptCode();
		if (!StringUtils.hasLength(strCustomCode)) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("没有指定脚本代码"));
		}

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String strJSCode = "function main(";
		strJSCode += "sys,entity";
		strJSCode += "){";
		strJSCode += strCustomCode;
		strJSCode += "}";
		engine.eval(strJSCode);
		invocable = (Invocable) engine;
	}

	public IPSSysTestData getPSSysTestData() {
		return this.iPSSysTestData;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysTestData();
	}

	public IDataEntityRuntime getDataEntityRuntime() {
		if (this.iDataEntityRuntime == null && this.getPSSysTestData().getPSDataEntity() != null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysTestData().getPSDataEntity().getId());
		}
		return this.iDataEntityRuntime;
	}
	
	protected Map<String, Object> getDataMap(){
		return this.data;
	}

	@Override
	public IEntity getEntity(IEntity iEntity) {
		try {
			if (iEntity == null) {
				IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntime();
				if (iDataEntityRuntime != null) {
					iEntity = iDataEntityRuntime.createEntity();
				} else {
					iEntity = new Entity();
				}
			}

			this.fillEntity(iEntity);
			return iEntity;
		} catch (Throwable ex) {
			log.error(String.format("获取数据对象发生异常，%1$s", ex.getMessage()), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("获取数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void fillEntity(IEntity iEntity) throws Throwable{
		
		//数据项
		java.util.List<IPSSysTestDataItem> psSysTestDataItemList = this.getPSSysTestData().getPSSysTestDataItems();
		if(!ObjectUtils.isEmpty(psSysTestDataItemList)) {
			for(IPSSysTestDataItem iPSSysTestDataItem : psSysTestDataItemList){
				String strType = iPSSysTestDataItem.getValueType();
				
				if(TestDataItemValueTypes.VALUE.equals(strType)) {
					iEntity.set(iPSSysTestDataItem.getName(), this.getSystemRuntime().convertValue(iPSSysTestDataItem.getStdDataType(), iPSSysTestDataItem.getValue()));
					continue;
				}
				
				if(TestDataItemValueTypes.NULLVALUE.equals(strType)) {
					iEntity.set(iPSSysTestDataItem.getName(), null);
					continue;
				}
				
				log.debug(String.format("不支持测试数据项类型[%1$s]", strType));
			}
		}
				
		
		Map<String, Object> data = this.getDataMap();
		if(data != null) {
			for(java.util.Map.Entry<String, Object> entry : data.entrySet()) {
				iEntity.set(entry.getKey(), entry.getValue());
			}
		}
		
		
		
		
		if(getTestDataType().equals(TestDataTypes.CUSTOMCODE)) {
			
			IScriptEntity iScriptEntity= null;
			IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntime();
			if(iDataEntityRuntime != null) {
				iScriptEntity = iDataEntityRuntime.createScriptEntity(iEntity);
			}
			else {
				iScriptEntity = this.getSystemRuntime().createScriptEntity(iEntity);
			}
			
			try {
				invocable.invokeFunction("main", this.getSystemRuntime().getSystemRTScriptContext(), iScriptEntity);
				
			} catch (NoSuchMethodException | ScriptException ex) {
				log.error(ex);
				this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行测试数据脚本[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("执行脚本发生异常，%1$s", ex.getMessage()));
			}
			
			return;
		}
	}

}
