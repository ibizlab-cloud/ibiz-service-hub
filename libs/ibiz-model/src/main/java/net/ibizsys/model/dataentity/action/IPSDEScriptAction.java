package net.ibizsys.model.dataentity.action;



/**
 * 实体自定义脚本行为模型对象接口
 * <P>
 * 扩展父接口类型[SCRIPT]
 *
 */
public interface IPSDEScriptAction extends net.ibizsys.model.dataentity.action.IPSDEAction{

	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
}