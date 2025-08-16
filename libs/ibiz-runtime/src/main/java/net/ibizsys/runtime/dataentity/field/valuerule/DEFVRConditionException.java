package net.ibizsys.runtime.dataentity.field.valuerule;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;



/**
 * 实体属性值规则条件异常
 * 
 * @author lionlau
 *
 */
public class DEFVRConditionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IPSDEFVRCondition iPSDEFVRCondition = null;
	private IDataEntityRuntimeBase iDataEntityRuntimeBase = null;
	private IPSDEField iPSDEField = null;

	public DEFVRConditionException(IPSDEFVRCondition iPSDEFVRCondition,String strInfo, IPSDEField iPSDEField, IDataEntityRuntimeBase iDataEntityRuntimeBase) {
		super(strInfo);
		this.iPSDEFVRCondition = iPSDEFVRCondition;
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
		this.iPSDEField = iPSDEField;
	}

	/**
	 * 获取值规则条件
	 * @return
	 */
	public IPSDEFVRCondition getPSDEFVRCondition() {
		return iPSDEFVRCondition;
	}
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	public IDataEntityRuntimeBase getDataEntityRuntimeBase(){
		return this.iDataEntityRuntimeBase;
	}
	
	
	/**
	 * 获取实体属性对象
	 * @return
	 */
	public IPSDEField getPSDEField(){
		return this.iPSDEField;
	}
	
	@Override
	public String getMessage() {
		String strMessage =  super.getMessage();
		if(StringUtils.hasLength(strMessage)) {
			return strMessage;
		}
		
		strMessage = getPSDEFVRCondition().getRuleInfo();
		if(StringUtils.hasLength(strMessage)) {
			return strMessage;
		}
		
		return String.format("值规则条件[%1$s]检查失败",this.getPSDEFVRCondition().getName());
	}
}
