package net.ibizsys.model.uml;



/**
 *
 */
public interface IPSSysUCMapNode extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.uml.IPSUMLObject{

	
	
	/**
	 * 获取上方位置
	 * @return
	 */
	int getLeftPos();
	
	
	/**
	 * 获取节点类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UCMapNodeType}
	 * @return
	 */
	java.lang.String getNodeType();
	
	
	/**
	 * 获取系统操作者
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysActor getPSSysActor();


	/**
	 * 获取系统操作者，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysActor getPSSysActorMust();
	
	
	/**
	 * 获取系统用例
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCase();


	/**
	 * 获取系统用例，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCaseMust();
	
	
	/**
	 * 获取左侧位置
	 * @return
	 */
	int getTopPos();
}