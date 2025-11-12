package net.ibizsys.model.util.transpiler.extend.dataentity.wf;


import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.wf.PSDEWFImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;

import static net.ibizsys.model.dataentity.wf.PSDEWFImpl.*;

public class PSDEWFListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.wf.PSDEWFListTranspiler{

    @Override
    protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
        super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
        PSDEWFImpl realPSModelObject = (PSDEWFImpl)iPSModelObject;
        this.setDomainValue(iPSModelTranspileContext, domain, "entitywfstate", realPSModelObject.getEntityWFState(), realPSModelObject, "getEntityWFState");
        this.setDomainValue(iPSModelTranspileContext, domain, "entitywfcancelstate", realPSModelObject.getEntityWFCancelState(), realPSModelObject, "getEntityWFCancelState");
        this.setDomainValue(iPSModelTranspileContext, domain, "entitywferrorstate", realPSModelObject.getEntityWFErrorState(), realPSModelObject, "getEntityWFErrorState");
        this.setDomainValue(iPSModelTranspileContext, domain, "entitywffinishstate", realPSModelObject.getEntityWFFinishState(), realPSModelObject, "getEntityWFFinishState");
    }

    @Override
    protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
        super.onCompile(iPSModelTranspileContext, domain, objectNode);
        this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFSTATE, domain, "entitywfstate", java.lang.String.class);
        this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFCANCELSTATE, domain, "entitywfcancelstate",  java.lang.String.class);
        this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFERRORSTATE, domain, "entitywferrorstate", java.lang.String.class);
        this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFFINISHSTATE, domain, "entitywffinishstate", java.lang.String.class);
    }
}