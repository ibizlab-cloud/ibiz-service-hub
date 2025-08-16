package net.ibizsys.model.util.transpiler.extend.bi;

import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBICubeMeasure;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysBICubeMeasureListTranspilerEx extends net.ibizsys.model.util.transpiler.bi.PSSysBICubeMeasureListTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		

		IPSSysBICubeMeasure iPSSysBICubeMeasure = (IPSSysBICubeMeasure) iPSModelObject;
		PSSysBICubeMeasure psSysBICubeMeasure = (PSSysBICubeMeasure) domain;	
		
		if(StringUtils.hasLength(iPSSysBICubeMeasure.getParamPSDEUIActionTag())) {
			psSysBICubeMeasure.set("parampsdeuiactiontag", iPSSysBICubeMeasure.getParamPSDEUIActionTag());
		}
		
	}
}