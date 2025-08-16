package net.ibizsys.psmodel.runtime.util;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.psmodel.core.util.IPSModel;

/**
 * 运行时标准模型服务对象接口
 * 将运行时模型反编译至标准模型
 * @author lionlau
 *
 * @param <M>
 */
public interface IPSModelRTService<M extends IPSModel> extends net.ibizsys.model.util.transpiler.IPSModelRTService<M>{

	/**
	 * 执行自定义方法
	 * @param pmodelName
	 * @param pkey
	 * @param methodName
	 * @param key
	 * @param param
	 * @return
	 * @throws Exception
	 */
	Object invoke(String pmodelName, String pkey, String methodName, String key, Object param) throws Exception;
	
	
//	
//	<T> T getPSModelObject(String key, Class<T> cls) throws Exception;
//	
	
	
	<T> T getPSModelObject(String key, Class<T> cls, boolean tryMode) throws Exception;
	
	
	
	/**
	 * 填充模型域对象
	 * @param domain
	 * @param iPSModelObject
	 * @param bFullMode
	 * @throws Exception
	 */
	void fillDomain(M domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception;
}
