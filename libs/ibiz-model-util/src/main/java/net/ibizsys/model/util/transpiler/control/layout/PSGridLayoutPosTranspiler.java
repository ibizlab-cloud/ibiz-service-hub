package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.layout.PSGridLayoutPosImpl.*;



public class PSGridLayoutPosTranspiler extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutPosTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.layout.PSGridLayoutPosImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.layout.PSGridLayoutPosImpl realPSModelObject = (net.ibizsys.model.control.layout.PSGridLayoutPosImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "col_lg", realPSModelObject.getColLG(), realPSModelObject, "getColLG", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_lg_os", realPSModelObject.getColLGOffset(), realPSModelObject, "getColLGOffset", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_md", realPSModelObject.getColMD(), realPSModelObject, "getColMD", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_md_os", realPSModelObject.getColMDOffset(), realPSModelObject, "getColMDOffset", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_sm", realPSModelObject.getColSM(), realPSModelObject, "getColSM", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_sm_os", realPSModelObject.getColSMOffset(), realPSModelObject, "getColSMOffset", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_width", realPSModelObject.getColWidth(), realPSModelObject, "getColWidth", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_xs", realPSModelObject.getColXS(), realPSModelObject, "getColXS", new String[]{"-1"});
		this.setDomainValue(iPSModelTranspileContext, domain, "col_xs_os", realPSModelObject.getColXSOffset(), realPSModelObject, "getColXSOffset", new String[]{"-1"});
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLLG, domain, "col_lg", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLLGOFFSET, domain, "col_lg_os", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLMD, domain, "col_md", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLMDOFFSET, domain, "col_md_os", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLSM, domain, "col_sm", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLSMOFFSET, domain, "col_sm_os", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLWIDTH, domain, "col_width", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLXS, domain, "col_xs", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLXSOFFSET, domain, "col_xs_os", int.class, new String[]{"-1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}