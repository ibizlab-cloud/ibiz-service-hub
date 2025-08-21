package net.ibizsys.model.app.view;



/**
 * 应用实体多项数据视图模型基础对象接口2
 * <P>
 * 支持配置多数据视图的数据激活模式
 *
 */
public interface IPSAppDEMultiDataView2 extends net.ibizsys.model.app.view.IPSAppDEMultiDataView{

	
	
	/**
	 * 获取多数据部件激活模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridRowActiveMode}
	 * @return
	 */
	int getMDCtrlActiveMode();
}