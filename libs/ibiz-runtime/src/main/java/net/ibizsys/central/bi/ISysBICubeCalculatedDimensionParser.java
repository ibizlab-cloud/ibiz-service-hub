package net.ibizsys.central.bi;

import java.util.Set;

import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.model.bi.IPSSysBICubeDimension;

public interface ISysBICubeCalculatedDimensionParser {

	/**
	 * SQL 分析群
	 */
	public final static String SQL = "SQL";
	
	/**
	 * 分析
	 * @param iPSSysBICubeDimension
	 * @param iSysBICubeRuntime
	 * @param iBISearchContext
	 * @return
	 * @throws Throwable
	 */
	String parse(IPSSysBICubeDimension iPSSysBICubeDimension, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> relatedColumnList) throws Throwable;
	
	
	
	
	/**
	 * 分析
	 * @param iPSSysBICubeDimension
	 * @param strDimensionFormula 公式
	 * @param iSysBICubeRuntime
	 * @param iBISearchContext
	 * @return
	 * @throws Throwable
	 */
	String parse(IPSSysBICubeDimension iPSSysBICubeDimension, String strDimensionFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> relatedColumnList) throws Throwable;
}
