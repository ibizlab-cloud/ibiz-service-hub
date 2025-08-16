package net.ibizsys.model.util.transpiler.control.searchbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.searchbar.PSSysSearchBarImpl.*;



public class PSSysSearchBarTranspiler extends net.ibizsys.model.util.transpiler.control.PSControlContainerTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.searchbar.PSSysSearchBarImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.searchbar.PSSysSearchBarImpl realPSModelObject = (net.ibizsys.model.control.searchbar.PSSysSearchBarImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "groupmode", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "groupmode", java.lang.String.class, new String[]{"SINGLE"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}