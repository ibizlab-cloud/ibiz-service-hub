package net.ibizsys.model;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSSysDEGroup;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.model.wf.IPSWorkflow;

/**
 * 系统模型服务对象
 * @author lionlau
 *
 */
public interface IPSSystemService extends IPSModelService{

	/**
	 * 系统模型
	 */
	public final static String PSSYSTEM = "PSSYSTEM";
	
	/**
	 * 实体模型
	 */
	public final static String PSDATAENTITY = "PSDATAENTITY";
	
	/**
	 * 获取系统对象
	 * @return
	 * @throws Exception
	 */
	IPSSystem getPSSystem();
	
	/**
	 * 获取模型文件夹路径
	 * @return
	 */
	String getPSModelFolderPath();
	
	
	/**
	 * 获取Groovy运行时源码文件夹路径
	 * @return
	 */
	String getGroovyFolderPath();
	
	
	/**
	 * 获取Library文件夹路径
	 * @return
	 */
	String getLibraryFolderPath();
	
	
	/**
	 * 获取实体
	 * @param strName
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IPSDataEntity getPSDataEntity(String strName, boolean bTryMode);
	
		
	
	
	/**
	 * 通过模型路径获取指定类型的模型对象
	 * @param cls
	 * @param strModelPath
	 * @return
	 * @throws Exception
	 */
	<T> T getPSModelObject(Class<T> cls,String strModelPath);
	
	

	/**
	 * 获取实体
	 * @param strName
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IPSDataEntity getPSDataEntity(String strName, String strDynaInstTag,String strDynaInstTag2,boolean bTryMode);
	
	
	/**
	 * 建立并初始化节点（默认使用系统作为父模型）
	 * @param cls
	 * @param objNode
	 * @return
	 */
	<T> T createAndInitPSModelObject(Class<T> cls, ObjectNode objNode);
	
	
	/**
	 * 建立并初始化节点
	 * @param parentPSModelObject
	 * @param cls
	 * @param objNode
	 * @return
	 */
	<T> T createAndInitPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode);
	
	
	/**
	 * 获取指定系统值序列模型
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysSequence getPSSysSequence(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定系统值转换器模型
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysTranslator getPSSysTranslator(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定系统服务接口模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysServiceAPI getPSSysServiceAPI(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定系统外部服务接口模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	@Deprecated
	IPSSubSysServiceAPI getPSSysSubSysServiceAPI(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定系统外部服务接口模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSubSysServiceAPI getPSSubSysServiceAPI(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定系统代码表模型
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSCodeList getPSCodeList(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取指定系统内容分类模型
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysContentCat getPSSysContentCat(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定系统值规则模型
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysValueRule getPSSysValueRule(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取模型摘要
	 * @return
	 */
	String getModelDigest();
	
	
	
	/**
	 * 获取路径直接内容
	 * @param strPath
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	String getRawContent(String strPath, boolean bTryMode) throws Exception;
	
	
	
	/**
	 * 获取系统预置逻辑模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysLogic getPSSysLogic(String strTag, boolean bTryMode); 
	
	
	/**
	 * 获取系统数据同步代理模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysDataSyncAgent getPSSysDataSyncAgent(String strTag, boolean bTryMode); 
	
	
	
	/**
	 * 获取系统消息目标模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysMsgTarget getPSSysMsgTarget(String strTag, boolean bTryMode); 
	
	
	
	/**
	 * 获取系统消息模板模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysMsgTempl getPSSysMsgTempl(String strTag, boolean bTryMode); 
	
	
	/**
	 * 获取系统消息队列模型对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysMsgQueue getPSSysMsgQueue(String strTag, boolean bTryMode); 
	
	
	
	/**
	 * 获取指定工作流角色
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSWFRole getPSWFRole(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取指定工作流
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSWorkflow getPSWorkflow(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取指定系统实体组
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IPSSysDEGroup getPSSysDEGroup(String strTag, boolean bTryMode);
	
	/**
	 * 获取模型对象
	 * @param strPSModelType
	 * @param strPSModelId
	 * @param bTryMode
	 * @return
	 */
	IPSModelObject getPSModelObject(String strPSModelType, String strPSModelId, boolean bTryMode);
}
