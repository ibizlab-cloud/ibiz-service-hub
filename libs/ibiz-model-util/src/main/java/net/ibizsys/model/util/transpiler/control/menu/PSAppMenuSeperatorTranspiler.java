package net.ibizsys.model.util.transpiler.control.menu;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl.*;



public class PSAppMenuSeperatorTranspiler extends net.ibizsys.model.util.transpiler.control.menu.PSAppMenuItemTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl realPSModelObject = (net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "spanflag", realPSModelObject.isSpanMode(), realPSModelObject, "isSpanMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSPANMODE, domain, "spanflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}