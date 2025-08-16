package net.ibizsys.model.control.drctrl;



/**
 * 数据关系边栏部件模型对象接口
 *
 */
public interface IPSDRBar extends net.ibizsys.model.control.drctrl.IPSDRCtrl
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取抬头
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CAPTION}
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取抬头语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取是否显示标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_CTRLPARAM11}
	 * @return
	 */
	boolean isShowTitle();
}