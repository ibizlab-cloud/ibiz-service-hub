package net.ibizsys.model.util.transpiler;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.psmodel.core.util.IPSModel;

/**
 * 运行时标准模型服务对象接口
 * 将运行时模型反编译至标准模型
 * @author lionlau
 *
 * @param <M>
 */
public interface IPSModelRTService<M extends IPSModel>{
	
	
	/**
	 * 获取传入标识的运行时模型对象
	 * @param key
	 * @param cls
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
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
