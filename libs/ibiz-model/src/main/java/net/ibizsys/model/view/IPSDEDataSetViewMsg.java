package net.ibizsys.model.view;



/**
 * 实体数据集视图消息模型基础对象接口
 *
 */
public interface IPSDEDataSetViewMsg extends net.ibizsys.model.view.IPSViewMsg{

	
	String getCacheScope();
	
	int getCacheTimeout();
	
	boolean isEnableCache();
}