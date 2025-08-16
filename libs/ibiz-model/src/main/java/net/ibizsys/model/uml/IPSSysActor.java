package net.ibizsys.model.uml;



/**
 *
 */
public interface IPSSysActor extends net.ibizsys.model.uml.IPSUMLObject{

	
	
	/**
	 * 获取操作者编号
	 * @return
	 */
	java.lang.String getActorSN();
	
	
	/**
	 * 获取操作者标记
	 * @return
	 */
	java.lang.String getActorTag();
	
	
	/**
	 * 获取操作者标记2
	 * @return
	 */
	java.lang.String getActorTag2();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取连入用例关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> getFromPSSysUseCaseRSs();
	
	/**
	 * 获取连入用例关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysUseCaseRS getFromPSSysUseCaseRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置连入用例关系集合
	 * @param list 连入用例关系集合
	 */
	void setFromPSSysUseCaseRs(java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list);
	
	
	/**
	 * 获取连出用例关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> getToPSSysUseCaseRSs();
	
	/**
	 * 获取连出用例关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysUseCaseRS getToPSSysUseCaseRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置连出用例关系集合
	 * @param list 连出用例关系集合
	 */
	void setToPSSysUseCaseRs(java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list);
}