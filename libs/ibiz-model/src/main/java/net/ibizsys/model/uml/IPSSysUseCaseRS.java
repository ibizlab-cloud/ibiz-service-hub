package net.ibizsys.model.uml;



/**
 *
 */
public interface IPSSysUseCaseRS extends net.ibizsys.model.uml.IPSUMLObject{

	
	
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
	 * 获取源操作者
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysActor getFromPSSysActor();


	/**
	 * 获取源操作者，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysActor getFromPSSysActorMust();
	
	
	/**
	 * 获取源用例
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getFromPSSysUseCase();


	/**
	 * 获取源用例，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getFromPSSysUseCaseMust();
	
	
	/**
	 * 获取关系模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UseCaseRSMode}
	 * @return
	 */
	java.lang.String getRSMode();
	
	
	/**
	 * 获取关系类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UseCaseRSType}
	 * @return
	 */
	java.lang.String getRSType();
	
	
	/**
	 * 获取目标操作者
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysActor getToPSSysActor();


	/**
	 * 获取目标操作者，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysActor getToPSSysActorMust();
	
	
	/**
	 * 获取目标用例
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getToPSSysUseCase();


	/**
	 * 获取目标用例，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.uml.IPSSysUseCase getToPSSysUseCaseMust();
}