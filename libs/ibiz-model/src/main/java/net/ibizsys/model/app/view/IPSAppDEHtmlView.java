package net.ibizsys.model.app.view;



/**
 * 应用实体Html视图模型对象接口
 * <P>
 * 扩展父接口类型[DEHTMLVIEW]
 *
 */
public interface IPSAppDEHtmlView extends net.ibizsys.model.app.view.IPSAppDEView{

	
	
	/**
	 * 获取Html路径
	 * @return
	 */
	java.lang.String getHtmlUrl();
	
	
	/**
	 * 获取是否默认加载数据
	 * @return
	 */
	boolean isLoadDefault();
}