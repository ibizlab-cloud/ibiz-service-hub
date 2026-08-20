package net.ibizsys.model.control;



/**
 * 编辑器容器模型对象接口
 *
 */
public interface IPSEditorContainer extends net.ibizsys.model.IPSModelObject{

	
	net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageRes();

net.ibizsys.model.res.IPSLanguageRes getPHPSLanguageResMust();
	
	
	/**
	 * 获取编辑器对象
	 * @return
	 */
	net.ibizsys.model.control.IPSEditor getPSEditor();


	/**
	 * 获取编辑器对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSEditor getPSEditorMust();
	
	
	/**
	 * 获取值项名称
	 * @return
	 */
	String getValueItemName();
}