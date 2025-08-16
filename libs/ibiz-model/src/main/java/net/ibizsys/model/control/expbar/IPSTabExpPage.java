package net.ibizsys.model.control.expbar;



/**
 * 分页导航分页模型对象接口
 *
 */
public interface IPSTabExpPage extends net.ibizsys.model.control.IPSControl
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	java.lang.String getCounterId();
	
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER();

net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust();
	
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();

net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	net.ibizsys.model.res.IPSSysImage getPSSysImage();

net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取视图父数据对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO();
}