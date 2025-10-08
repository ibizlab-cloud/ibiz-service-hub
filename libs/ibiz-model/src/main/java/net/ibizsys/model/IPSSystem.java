package net.ibizsys.model;



/**
 * 系统模型对象接口
 * <P>
 * 系统模型对象是系统模型的根对象
 *
 */
public interface IPSSystem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取前端应用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSApplication> getAllPSApps();
	
	/**
	 * 获取前端应用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSApplication getPSApplication(Object objKey, boolean bTryMode);
	
	/**
	 * 设置前端应用集合
	 * @param list 前端应用集合
	 */
	void setPSApplications(java.util.List<net.ibizsys.model.app.IPSApplication> list);
	
	
	/**
	 * 获取代码表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.codelist.IPSCodeList> getAllPSCodeLists();
	
	/**
	 * 获取代码表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList(Object objKey, boolean bTryMode);
	
	/**
	 * 设置代码表集合
	 * @param list 代码表集合
	 */
	void setPSCodeLists(java.util.List<net.ibizsys.model.codelist.IPSCodeList> list);
	
	
	/**
	 * 获取全局实体操作标识集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv> getAllPSDEOPPrivs();
	
	/**
	 * 获取全局实体操作标识集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv getPSSysDEOPPriv(Object objKey, boolean bTryMode);
	
	/**
	 * 设置全局实体操作标识集合
	 * @param list 全局实体操作标识集合
	 */
	void setPSSysDEOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv> list);
	
	
	/**
	 * 获取实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> getAllPSDataEntities();
	
	/**
	 * 获取实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体集合
	 * @param list 实体集合
	 */
	void setPSDataEntities(java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> list);
	
	
	/**
	 * 获取外部接口集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPI> getAllPSSubSysServiceAPIs();
	
	/**
	 * 获取外部接口集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI(Object objKey, boolean bTryMode);
	
	/**
	 * 设置外部接口集合
	 * @param list 外部接口集合
	 */
	void setPSSubSysServiceAPIs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPI> list);
	
	
	/**
	 * 获取AI工厂集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ai.IPSSysAIFactory> getAllPSSysAIFactories();
	
	/**
	 * 获取AI工厂集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory(Object objKey, boolean bTryMode);
	
	/**
	 * 设置AI工厂集合
	 * @param list AI工厂集合
	 */
	void setPSSysAIFactories(java.util.List<net.ibizsys.model.ai.IPSSysAIFactory> list);
	
	
	/**
	 * 获取系统操作者集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysActor> getAllPSSysActors();
	
	/**
	 * 获取系统操作者集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysActor getPSSysActor(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统操作者集合
	 * @param list 系统操作者集合
	 */
	void setPSSysActors(java.util.List<net.ibizsys.model.uml.IPSSysActor> list);
	
	
	/**
	 * 获取大数据体系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ba.IPSSysBDScheme> getAllPSSysBDSchemes();
	
	/**
	 * 获取大数据体系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme(Object objKey, boolean bTryMode);
	
	/**
	 * 设置大数据体系集合
	 * @param list 大数据体系集合
	 */
	void setPSSysBDSchemes(java.util.List<net.ibizsys.model.ba.IPSSysBDScheme> list);
	
	
	/**
	 * 获取智能报表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.bi.IPSSysBIScheme> getAllPSSysBISchemes();
	
	/**
	 * 获取智能报表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.bi.IPSSysBIScheme getPSSysBIScheme(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能报表集合
	 * @param list 智能报表集合
	 */
	void setPSSysBISchemes(java.util.List<net.ibizsys.model.bi.IPSSysBIScheme> list);
	
	
	/**
	 * 获取后台作业集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.backservice.IPSSysBackService> getAllPSSysBackServices();
	
	/**
	 * 获取后台作业集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.backservice.IPSSysBackService getPSSysBackService(Object objKey, boolean bTryMode);
	
	/**
	 * 设置后台作业集合
	 * @param list 后台作业集合
	 */
	void setPSSysBackServices(java.util.List<net.ibizsys.model.backservice.IPSSysBackService> list);
	
	
	/**
	 * 获取全部内容分类集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysContentCat> getAllPSSysContentCats();
	
	/**
	 * 获取全部内容分类集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysContentCat getPSSysContentCat(Object objKey, boolean bTryMode);
	
	/**
	 * 设置全部内容分类集合
	 * @param list 全部内容分类集合
	 */
	void setPSSysContentCats(java.util.List<net.ibizsys.model.res.IPSSysContentCat> list);
	
	
	/**
	 * 获取计数器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.counter.IPSSysCounter> getAllPSSysCounters();
	
	/**
	 * 获取计数器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.counter.IPSSysCounter getPSSysCounter(Object objKey, boolean bTryMode);
	
	/**
	 * 设置计数器集合
	 * @param list 计数器集合
	 */
	void setPSSysCounters(java.util.List<net.ibizsys.model.control.counter.IPSSysCounter> list);
	
	
	/**
	 * 获取数据库架构集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSysDBScheme> getAllPSSysDBSchemes();
	
	/**
	 * 获取数据库架构集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据库架构集合
	 * @param list 数据库架构集合
	 */
	void setPSSysDBSchemes(java.util.List<net.ibizsys.model.database.IPSSysDBScheme> list);
	
	
	/**
	 * 获取值函数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSysDBValueFunc> getAllPSSysDBValueFuncs();
	
	/**
	 * 获取值函数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSysDBValueFunc getPSSysDBValueFunc(Object objKey, boolean bTryMode);
	
	/**
	 * 设置值函数集合
	 * @param list 值函数集合
	 */
	void setPSSysDBValueFuncs(java.util.List<net.ibizsys.model.database.IPSSysDBValueFunc> list);
	
	
	/**
	 * 获取实体组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.IPSSysDEGroup> getAllPSSysDEGroups();
	
	/**
	 * 获取实体组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.IPSSysDEGroup getPSSysDEGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体组集合
	 * @param list 实体组集合
	 */
	void setPSSysDEGroups(java.util.List<net.ibizsys.model.dataentity.IPSSysDEGroup> list);
	
	
	/**
	 * 获取实体关系组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSSysDERGroup> getAllPSSysDERGroups();
	
	/**
	 * 获取实体关系组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSSysDERGroup getPSSysDERGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体关系组集合
	 * @param list 实体关系组集合
	 */
	void setPSSysDERGroups(java.util.List<net.ibizsys.model.dataentity.der.IPSSysDERGroup> list);
	
	
	/**
	 * 获取异步处理队列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dts.IPSSysDTSQueue> getAllPSSysDTSQueues();
	
	/**
	 * 获取异步处理队列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dts.IPSSysDTSQueue getPSSysDTSQueue(Object objKey, boolean bTryMode);
	
	/**
	 * 设置异步处理队列集合
	 * @param list 异步处理队列集合
	 */
	void setPSSysDTSQueues(java.util.List<net.ibizsys.model.dts.IPSSysDTSQueue> list);
	
	
	/**
	 * 获取数据同步代理集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysDataSyncAgent> getAllPSSysDataSyncAgents();
	
	/**
	 * 获取数据同步代理集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据同步代理集合
	 * @param list 数据同步代理集合
	 */
	void setPSSysDataSyncAgents(java.util.List<net.ibizsys.model.res.IPSSysDataSyncAgent> list);
	
	
	/**
	 * 获取动态模型集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dynamodel.IPSSysDynaModel> getAllPSSysDynaModels();
	
	/**
	 * 获取动态模型集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dynamodel.IPSSysDynaModel getPSSysDynaModel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置动态模型集合
	 * @param list 动态模型集合
	 */
	void setPSSysDynaModels(java.util.List<net.ibizsys.model.dynamodel.IPSSysDynaModel> list);
	
	
	/**
	 * 获取ER图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.er.IPSSysERMap> getAllPSSysERMaps();
	
	/**
	 * 获取ER图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.er.IPSSysERMap getPSSysERMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置ER图集合
	 * @param list ER图集合
	 */
	void setPSSysERMaps(java.util.List<net.ibizsys.model.er.IPSSysERMap> list);
	
	
	/**
	 * 获取编辑器样式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysEditorStyle> getAllPSSysEditorStyles();
	
	/**
	 * 获取编辑器样式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysEditorStyle getPSSysEditorStyle(Object objKey, boolean bTryMode);
	
	/**
	 * 设置编辑器样式集合
	 * @param list 编辑器样式集合
	 */
	void setPSSysEditorStyles(java.util.List<net.ibizsys.model.res.IPSSysEditorStyle> list);
	
	
	/**
	 * 获取系统国际化
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysI18N> getAllPSSysI18Ns();
	
	/**
	 * 获取系统国际化的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysI18N getPSSysI18N(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统国际化
	 * @param list 系统国际化
	 */
	void setPSSysI18Ns(java.util.List<net.ibizsys.model.res.IPSSysI18N> list);
	
	
	/**
	 * 获取逻辑组件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysLogic> getAllPSSysLogics();
	
	/**
	 * 获取逻辑组件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysLogic getPSSysLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑组件集合
	 * @param list 逻辑组件集合
	 */
	void setPSSysLogics(java.util.List<net.ibizsys.model.res.IPSSysLogic> list);
	
	
	/**
	 * 获取系统方法DTO集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSysMethodDTO> getAllPSSysMethodDTOs();
	
	/**
	 * 获取系统方法DTO集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSysMethodDTO getPSSysMethodDTO(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统方法DTO集合
	 * @param list 系统方法DTO集合
	 */
	void setPSSysMethodDTOs(java.util.List<net.ibizsys.model.service.IPSSysMethodDTO> list);
	
	
	/**
	 * 获取系统模型组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.system.IPSSysModelGroup> getAllPSSysModelGroups();
	
	/**
	 * 获取系统模型组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统模型组集合
	 * @param list 系统模型组集合
	 */
	void setPSSysModelGroups(java.util.List<net.ibizsys.model.system.IPSSysModelGroup> list);
	
	
	/**
	 * 获取消息队列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.msg.IPSSysMsgQueue> getAllPSSysMsgQueues();
	
	/**
	 * 获取消息队列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.msg.IPSSysMsgQueue getPSSysMsgQueue(Object objKey, boolean bTryMode);
	
	/**
	 * 设置消息队列集合
	 * @param list 消息队列集合
	 */
	void setPSSysMsgQueues(java.util.List<net.ibizsys.model.msg.IPSSysMsgQueue> list);
	
	
	/**
	 * 获取消息目标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.msg.IPSSysMsgTarget> getAllPSSysMsgTargets();
	
	/**
	 * 获取消息目标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.msg.IPSSysMsgTarget getPSSysMsgTarget(Object objKey, boolean bTryMode);
	
	/**
	 * 设置消息目标集合
	 * @param list 消息目标集合
	 */
	void setPSSysMsgTargets(java.util.List<net.ibizsys.model.msg.IPSSysMsgTarget> list);
	
	
	/**
	 * 获取消息模板集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.msg.IPSSysMsgTempl> getAllPSSysMsgTempls();
	
	/**
	 * 获取消息模板集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(Object objKey, boolean bTryMode);
	
	/**
	 * 设置消息模板集合
	 * @param list 消息模板集合
	 */
	void setPSSysMsgTempls(java.util.List<net.ibizsys.model.msg.IPSSysMsgTempl> list);
	
	
	/**
	 * 获取预定义视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysPDTView> getAllPSSysPDTViews();
	
	/**
	 * 获取预定义视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysPDTView getPSSysPDTView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置预定义视图集合
	 * @param list 预定义视图集合
	 */
	void setPSSysPDTViews(java.util.List<net.ibizsys.model.res.IPSSysPDTView> list);
	
	
	/**
	 * 获取子系统引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.system.IPSSysRef> getAllPSSysRefs();
	
	/**
	 * 获取子系统引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.system.IPSSysRef getPSSysRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子系统引用集合
	 * @param list 子系统引用集合
	 */
	void setPSSysRefs(java.util.List<net.ibizsys.model.system.IPSSysRef> list);
	
	
	/**
	 * 获取需求项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> getAllPSSysReqItems();
	
	/**
	 * 获取需求项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.requirement.IPSSysReqItem getPSSysReqItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置需求项集合
	 * @param list 需求项集合
	 */
	void setPSSysReqItems(java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> list);
	
	
	/**
	 * 获取预置资源集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysResource> getAllPSSysResources();
	
	/**
	 * 获取预置资源集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource(Object objKey, boolean bTryMode);
	
	/**
	 * 设置预置资源集合
	 * @param list 预置资源集合
	 */
	void setPSSysResources(java.util.List<net.ibizsys.model.res.IPSSysResource> list);
	
	
	/**
	 * 获取后台模板插件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysSFPlugin> getAllPSSysSFPlugins();
	
	/**
	 * 获取后台模板插件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(Object objKey, boolean bTryMode);
	
	/**
	 * 设置后台模板插件集合
	 * @param list 后台模板插件集合
	 */
	void setPSSysSFPlugins(java.util.List<net.ibizsys.model.res.IPSSysSFPlugin> list);
	
	
	/**
	 * 获取后台发布集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.pub.IPSSysSFPub> getAllPSSysSFPubs();
	
	/**
	 * 获取后台发布集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.pub.IPSSysSFPub getPSSysSFPub(Object objKey, boolean bTryMode);
	
	/**
	 * 设置后台发布集合
	 * @param list 后台发布集合
	 */
	void setPSSysSFPubs(java.util.List<net.ibizsys.model.pub.IPSSysSFPub> list);
	
	
	/**
	 * 获取示例值集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysSampleValue> getAllPSSysSampleValues();
	
	/**
	 * 获取示例值集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysSampleValue getPSSysSampleValue(Object objKey, boolean bTryMode);
	
	/**
	 * 设置示例值集合
	 * @param list 示例值集合
	 */
	void setPSSysSampleValues(java.util.List<net.ibizsys.model.res.IPSSysSampleValue> list);
	
	
	/**
	 * 获取检索体系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.search.IPSSysSearchScheme> getAllPSSysSearchSchemes();
	
	/**
	 * 获取检索体系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme(Object objKey, boolean bTryMode);
	
	/**
	 * 设置检索体系集合
	 * @param list 检索体系集合
	 */
	void setPSSysSearchSchemes(java.util.List<net.ibizsys.model.search.IPSSysSearchScheme> list);
	
	
	/**
	 * 获取值序列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysSequence> getAllPSSysSequences();
	
	/**
	 * 获取值序列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequence(Object objKey, boolean bTryMode);
	
	/**
	 * 设置值序列集合
	 * @param list 值序列集合
	 */
	void setPSSysSequences(java.util.List<net.ibizsys.model.res.IPSSysSequence> list);
	
	
	/**
	 * 获取服务接口集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSysServiceAPI> getAllPSSysServiceAPIs();
	
	/**
	 * 获取服务接口集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI(Object objKey, boolean bTryMode);
	
	/**
	 * 设置服务接口集合
	 * @param list 服务接口集合
	 */
	void setPSSysServiceAPIs(java.util.List<net.ibizsys.model.service.IPSSysServiceAPI> list);
	
	
	/**
	 * 获取测试数据集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestData> getAllPSSysTestDatas();
	
	/**
	 * 获取测试数据集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestData getPSSysTestData(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试数据集合
	 * @param list 测试数据集合
	 */
	void setPSSysTestData(java.util.List<net.ibizsys.model.testing.IPSSysTestData> list);
	
	
	/**
	 * 获取测试项目集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> getAllPSSysTestPrjs();
	
	/**
	 * 获取测试项目集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试项目集合
	 * @param list 测试项目集合
	 */
	void setPSSysTestPrjs(java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list);
	
	
	/**
	 * 获取值转换器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysTranslator> getAllPSSysTranslators();
	
	/**
	 * 获取值转换器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator(Object objKey, boolean bTryMode);
	
	/**
	 * 设置值转换器集合
	 * @param list 值转换器集合
	 */
	void setPSSysTranslators(java.util.List<net.ibizsys.model.res.IPSSysTranslator> list);
	
	
	/**
	 * 获取UC图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysUCMap> getAllPSSysUCMaps();
	
	/**
	 * 获取UC图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysUCMap getPSSysUCMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置UC图集合
	 * @param list UC图集合
	 */
	void setPSSysUCMaps(java.util.List<net.ibizsys.model.uml.IPSSysUCMap> list);
	
	
	/**
	 * 获取统一资源集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.security.IPSSysUniRes> getAllPSSysUniReses();
	
	/**
	 * 获取统一资源集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(Object objKey, boolean bTryMode);
	
	/**
	 * 设置统一资源集合
	 * @param list 统一资源集合
	 */
	void setPSSysUniRes(java.util.List<net.ibizsys.model.security.IPSSysUniRes> list);
	
	
	/**
	 * 获取统一状态集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysUniState> getAllPSSysUniStates();
	
	/**
	 * 获取统一状态集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysUniState getPSSysUniState(Object objKey, boolean bTryMode);
	
	/**
	 * 设置统一状态集合
	 * @param list 统一状态集合
	 */
	void setPSSysUniStates(java.util.List<net.ibizsys.model.res.IPSSysUniState> list);
	
	
	/**
	 * 获取系统用例集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysUseCase> getAllPSSysUseCases();
	
	/**
	 * 获取系统用例集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCase(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统用例集合
	 * @param list 系统用例集合
	 */
	void setPSSysUseCases(java.util.List<net.ibizsys.model.uml.IPSSysUseCase> list);
	
	
	/**
	 * 获取自定义数据范围集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.security.IPSSysUserDR> getAllPSSysUserDRs();
	
	/**
	 * 获取自定义数据范围集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR(Object objKey, boolean bTryMode);
	
	/**
	 * 设置自定义数据范围集合
	 * @param list 自定义数据范围集合
	 */
	void setPSSysUserDRs(java.util.List<net.ibizsys.model.security.IPSSysUserDR> list);
	
	
	/**
	 * 获取用户模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.security.IPSSysUserMode> getAllPSSysUserModes();
	
	/**
	 * 获取用户模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.security.IPSSysUserMode getPSSysUserMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置用户模式集合
	 * @param list 用户模式集合
	 */
	void setPSSysUserModes(java.util.List<net.ibizsys.model.security.IPSSysUserMode> list);
	
	
	/**
	 * 获取用户角色集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.security.IPSSysUserRole> getAllPSSysUserRoles();
	
	/**
	 * 获取用户角色集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.security.IPSSysUserRole getPSSysUserRole(Object objKey, boolean bTryMode);
	
	/**
	 * 设置用户角色集合
	 * @param list 用户角色集合
	 */
	void setPSSysUserRoles(java.util.List<net.ibizsys.model.security.IPSSysUserRole> list);
	
	
	/**
	 * 获取功能组件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysUtil> getAllPSSysUtils();
	
	/**
	 * 获取功能组件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysUtil getPSSysUtil(Object objKey, boolean bTryMode);
	
	/**
	 * 设置功能组件集合
	 * @param list 功能组件集合
	 */
	void setPSSysUtils(java.util.List<net.ibizsys.model.res.IPSSysUtil> list);
	
	
	/**
	 * 获取值规则集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.valuerule.IPSSysValueRule> getAllPSSysValueRules();
	
	/**
	 * 获取值规则集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置值规则集合
	 * @param list 值规则集合
	 */
	void setPSSysValueRules(java.util.List<net.ibizsys.model.valuerule.IPSSysValueRule> list);
	
	
	/**
	 * 获取数据库配置集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSystemDBConfig> getAllPSSystemDBConfigs();
	
	/**
	 * 获取数据库配置集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSystemDBConfig getPSSystemDBConfig(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据库配置集合
	 * @param list 数据库配置集合
	 */
	void setPSSystemDBConfigs(java.util.List<net.ibizsys.model.database.IPSSystemDBConfig> list);
	
	
	/**
	 * 获取系统模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.system.IPSSystemModule> getAllPSSystemModules();
	
	/**
	 * 获取系统模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置系统模块集合
	 * @param list 系统模块集合
	 */
	void setPSSystemModules(java.util.List<net.ibizsys.model.system.IPSSystemModule> list);
	
	
	/**
	 * 获取工作流角色集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFRole> getAllPSWFRoles();
	
	/**
	 * 获取工作流角色集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFRole getPSWFRole(Object objKey, boolean bTryMode);
	
	/**
	 * 设置工作流角色集合
	 * @param list 工作流角色集合
	 */
	void setPSWFRoles(java.util.List<net.ibizsys.model.wf.IPSWFRole> list);
	
	
	/**
	 * 获取工作流工作时间集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFWorkTime> getAllPSWFWorkTimes();
	
	/**
	 * 获取工作流工作时间集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFWorkTime getPSWFWorkTime(Object objKey, boolean bTryMode);
	
	/**
	 * 设置工作流工作时间集合
	 * @param list 工作流工作时间集合
	 */
	void setPSWFWorkTimes(java.util.List<net.ibizsys.model.wf.IPSWFWorkTime> list);
	
	
	/**
	 * 获取公众号集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXAccount> getAllPSWXAccounts();
	
	/**
	 * 获取公众号集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXAccount getPSWXAccount(Object objKey, boolean bTryMode);
	
	/**
	 * 设置公众号集合
	 * @param list 公众号集合
	 */
	void setPSWXAccounts(java.util.List<net.ibizsys.model.wx.IPSWXAccount> list);
	
	
	/**
	 * 获取工作流集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWorkflow> getAllPSWorkflows();
	
	/**
	 * 获取工作流集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(Object objKey, boolean bTryMode);
	
	/**
	 * 设置工作流集合
	 * @param list 工作流集合
	 */
	void setPSWorkflows(java.util.List<net.ibizsys.model.wf.IPSWorkflow> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认语言
	 * @return
	 */
	java.lang.String getDefaultLanguage();
	
	
	/**
	 * 获取默认系统国际化
	 * @return
	 */
	net.ibizsys.model.res.IPSSysI18N getDefaultPSSysI18N();


	/**
	 * 获取默认系统国际化，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysI18N getDefaultPSSysI18NMust();
	
	
	/**
	 * 获取默认系统后台发布
	 * @return
	 */
	net.ibizsys.model.pub.IPSSysSFPub getDefaultPSSysSFPub();


	/**
	 * 获取默认系统后台发布，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.pub.IPSSysSFPub getDefaultPSSysSFPubMust();
	
	
	/**
	 * 获取默认脚本引擎
	 * @return
	 */
	java.lang.String getDefaultScriptEngine();
	
	
	/**
	 * 获取部署系统标识
	 * @return
	 */
	java.lang.String getDeploySysId();
	
	
	/**
	 * 获取部署系统机构标识
	 * @return
	 */
	java.lang.String getDeploySysOrgId();
	
	
	/**
	 * 获取部署系统机构部门标识
	 * @return
	 */
	java.lang.String getDeploySysOrgSectorId();
	
	
	/**
	 * 获取部署系统标记
	 * @return
	 */
	java.lang.String getDeploySysTag();
	
	
	/**
	 * 获取部署系统标记2
	 * @return
	 */
	java.lang.String getDeploySysTag2();
	
	
	/**
	 * 获取部署系统类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DeploySysType}
	 * @return
	 */
	java.lang.String getDeploySysType();
	
	
	/**
	 * 获取模型引擎版本
	 * @return
	 */
	int getEngineVer();
	
	
	/**
	 * 获取初始化内容集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysContent> getInitPSSysContents();
	
	/**
	 * 获取初始化内容集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysContent getInitPSSysContent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置初始化内容集合
	 * @param list 初始化内容集合
	 */
	void setInitPSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list);
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取开发系统标识
	 * @return
	 */
	java.lang.String getPSDevSlnSysId();
	
	
	/**
	 * 获取运行时对象
	 * @return
	 */
	java.lang.String getRTObjectName();
	
	
	/**
	 * 获取根需求模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> getRootPSSysReqModules();
	
	/**
	 * 获取根需求模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.requirement.IPSSysReqModule getRootPSSysReqModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置根需求模块集合
	 * @param list 根需求模块集合
	 */
	void setRootPSSysReqModules(java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> list);
	
	
	/**
	 * 获取示例内容集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysContent> getSamplePSSysContents();
	
	/**
	 * 获取示例内容集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysContent getSamplePSSysContent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置示例内容集合
	 * @param list 示例内容集合
	 */
	void setSamplePSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list);
	
	
	/**
	 * 获取系统标记
	 * @return
	 */
	java.lang.String getSysTag();
	
	
	/**
	 * 获取系统标记2
	 * @return
	 */
	java.lang.String getSysTag2();
	
	
	/**
	 * 获取系统标记3
	 * @return
	 */
	java.lang.String getSysTag3();
	
	
	/**
	 * 获取系统标记4
	 * @return
	 */
	java.lang.String getSysTag4();
	
	
	/**
	 * 获取系统类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DevSysType}
	 * @return
	 */
	java.lang.String getSysType();
	
	
	/**
	 * 获取测试内容集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSSysContent> getTestPSSysContents();
	
	/**
	 * 获取测试内容集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSSysContent getTestPSSysContent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试内容集合
	 * @param list 测试内容集合
	 */
	void setTestPSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list);
	
	
	/**
	 * 获取版本名称
	 * @return
	 */
	java.lang.String getVCName();
}