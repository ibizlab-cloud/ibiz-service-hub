package net.ibizsys.central.bi;

import java.util.Set;

import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;

public interface ISysBICubeCalculatedMeasureParser {

	/**
	 * SQL 分析群
	 */
	public final static String SQL = "SQL";
	
	/**
	 * 分析
	 * @param iPSSysBICubeMeasure
	 * @param iSysBICubeRuntime
	 * @param iBISearchContext
	 * @return
	 * @throws Throwable
	 */
	String parse(IPSSysBICubeMeasure iPSSysBICubeMeasure, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable;
	
	/**
	 * 分析
	 * @param iPSSysBICubeMeasure
	 * @param strMeasureFormula
	 * @param iSysBICubeRuntime
	 * @param iBISearchContext
	 * @return
	 * @throws Throwable
	 */
	String parse(IPSSysBICubeMeasure iPSSysBICubeMeasure, String strMeasureFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable;
	
}
