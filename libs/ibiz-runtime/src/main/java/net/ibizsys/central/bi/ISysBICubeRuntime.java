package net.ibizsys.central.bi;

import java.util.List;

import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;
import net.ibizsys.runtime.IModelRuntime;

/**
 * 系统智能报表立方体运行时
 * @author lionlau
 *
 */
public interface ISysBICubeRuntime extends IModelRuntime{

	/**
	 * 初始化
	 * @param iSysBISchemeRuntimeContext
	 * @param iPSSysBICube
	 * @throws Exception
	 */
	void init(ISysBISchemeRuntimeContext iSysBISchemeRuntimeContext, IPSSysBICube iPSSysBICube) throws Exception;
	
	
	/**
	 * 获取系统智能报表立方体对象
	 * @return
	 */
	IPSSysBICube getPSSysBICube();
	
	
	/**
	 * 获取系统智能报表体系
	 * @return
	 */
	ISysBISchemeRuntime getSysBISchemeRuntime();
	
	
	/**
	 * 获取相关的实体运行时
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	/**
	 * 获取智能立方体指标
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSSysBICubeMeasure getPSSysBICubeMeasure(String strName, boolean bTryMode);

	
	/**
	 * 获取智能立方体维度
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSSysBICubeDimension getPSSysBICubeDimension(String strName, boolean bTryMode);
	
	
	/**
	 * 获取数据
	 * @param iBISearchContext
	 * @return
	 */
	List fetch(IBISearchContext iBISearchContext) throws Throwable;
	
	
	/**
	 * 获取访问标识
	 * @return
	 */
	String getAccessKey();
}
