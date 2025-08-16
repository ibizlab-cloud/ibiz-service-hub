package net.ibizsys.model.control.form;



/**
 * 实体表单成员单项逻辑模型对象接口
 * <P>
 * 扩展父接口类型[SINGLE]
 *
 */
public interface IPSDEFDSingleLogic extends net.ibizsys.model.control.form.IPSDEFDLogic{

	
	
	/**
	 * 获取条件操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFDLogicDTO#FIELD_PSDBVALUEOPID}
	 * @return
	 */
	java.lang.String getCondOP();
	
	
	/**
	 * 获取表单项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFDLogicDTO#FIELD_FDNAME}
	 * @return
	 */
	java.lang.String getDEFDName();
	
	
	/**
	 * 获取条件值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFDLogicDTO#FIELD_CONDVALUE}
	 * @return
	 */
	java.lang.String getValue();
}