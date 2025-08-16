package net.ibizsys.central.bi;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.model.bi.IPSSysBICubeDimension;

public abstract class SysBICubeCalculatedDimensionParserBase implements ISysBICubeCalculatedDimensionParser {

	private static final Log log = LogFactory.getLog(SysBICubeCalculatedDimensionParserBase.class);
	
	@Override
	public String parse(IPSSysBICubeDimension iPSSysBICubeDimension, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {
		Assert.notNull(iPSSysBICubeDimension, "传入系统智能立方体维度对象无效");
		return this.parse(iPSSysBICubeDimension, iPSSysBICubeDimension.getDimensionFormula(), iSysBICubeRuntime, iBISearchContext, columnList);
	}
	
	


	@Override
	public String parse(IPSSysBICubeDimension iPSSysBICubeDimension, String strDimensionFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {
		Assert.notNull(iPSSysBICubeDimension, "传入系统智能立方体维度对象无效");
		Assert.hasLength(strDimensionFormula, "传入自定义表达式无效");
		Assert.notNull(iSysBICubeRuntime, "传入系统智能立方体运行时对象无效");
		try {
			return this.onParse(iPSSysBICubeDimension, strDimensionFormula, iSysBICubeRuntime, iBISearchContext, columnList);
		}
		catch (Throwable ex) {
			//throw new RuntimeException(arg0);
			throw ex;
		}
	}




	protected abstract String onParse(IPSSysBICubeDimension iPSSysBICubeDimension, String strDimensionFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable;
}
