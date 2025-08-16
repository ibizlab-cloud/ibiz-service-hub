package net.ibizsys.model.control.editor;



/**
 * 文本编辑器模型基础对象接口
 *
 */
public interface IPSTextEditor extends net.ibizsys.model.control.IPSEditor{

	
	
	/**
	 * 获取最大长度[MAXLENGTH]
	 * @return
	 */
	java.lang.Integer getMaxLength();
	
	
	/**
	 * 获取最小长度[MINLENGTH]
	 * @return
	 */
	java.lang.Integer getMinLength();
	
	
	/**
	 * 获取阈值应用代码表对象
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取阈值应用代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取值规则
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule();


	/**
	 * 获取值规则，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRuleMust();
	
	
	/**
	 * 获取是否显示最大长度[SHOWMAXLENGTH]
	 * @return
	 */
	boolean isShowMaxLength();
}