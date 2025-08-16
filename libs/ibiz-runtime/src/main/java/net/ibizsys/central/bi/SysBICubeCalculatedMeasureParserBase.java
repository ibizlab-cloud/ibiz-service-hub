package net.ibizsys.central.bi;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;

public abstract class SysBICubeCalculatedMeasureParserBase implements ISysBICubeCalculatedMeasureParser {

	private static final Log log = LogFactory.getLog(SysBICubeCalculatedMeasureParserBase.class);
	
	@Override
	public String parse(IPSSysBICubeMeasure iPSSysBICubeMeasure, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {
		Assert.notNull(iPSSysBICubeMeasure, "传入系统智能立方体指标对象无效");
		return this.parse(iPSSysBICubeMeasure, iPSSysBICubeMeasure.getMeasureFormula(), iSysBICubeRuntime, iBISearchContext, columnList);
	}
	
	


	@Override
	public String parse(IPSSysBICubeMeasure iPSSysBICubeMeasure, String strDimensionFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {
		Assert.notNull(iPSSysBICubeMeasure, "传入系统智能立方体指标对象无效");
		Assert.hasLength(strDimensionFormula, "传入自定义表达式无效");
		Assert.notNull(iSysBICubeRuntime, "传入系统智能立方体运行时对象无效");
		try {
			return this.onParse(iPSSysBICubeMeasure, strDimensionFormula, iSysBICubeRuntime, iBISearchContext, columnList);
		}
		catch (Throwable ex) {
			//throw new RuntimeException(arg0);
			throw ex;
		}
	}




	protected abstract String onParse(IPSSysBICubeMeasure iPSSysBICubeMeasure, String strMeasureFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable;
}
