package net.ibizsys.model.util.transpiler.extend.bi;

import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysBICubeDimension;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysBICubeDimensionListTranspilerEx extends net.ibizsys.model.util.transpiler.bi.PSSysBICubeDimensionListTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		IPSSysBICubeDimension iPSSysBICubeDimension = (IPSSysBICubeDimension) iPSModelObject;
		PSSysBICubeDimension psSysBICubeDimension = (PSSysBICubeDimension) domain;	
		
		if(StringUtils.hasLength(iPSSysBICubeDimension.getParamPSDEUIActionTag())) {
			psSysBICubeDimension.set("parampsdeuiactiontag", iPSSysBICubeDimension.getParamPSDEUIActionTag());
		}
		
	}

}