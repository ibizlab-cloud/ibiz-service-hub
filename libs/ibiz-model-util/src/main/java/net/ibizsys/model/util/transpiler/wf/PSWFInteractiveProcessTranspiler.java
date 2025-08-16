package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFInteractiveProcessImpl.*;



public class PSWFInteractiveProcessTranspiler extends net.ibizsys.model.util.transpiler.wf.PSWFProcessTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFInteractiveProcessImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFInteractiveProcessImpl realPSModelObject = (net.ibizsys.model.wf.PSWFInteractiveProcessImpl)iPSModelObject;
		this.setDomainListValue(iPSModelTranspileContext, domain, "editfields", realPSModelObject.getEditFields(), realPSModelObject, "getEditFields", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "editflag", realPSModelObject.getEditMode(), realPSModelObject, "getEditMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "formcodename", realPSModelObject.getFormCodeName(), realPSModelObject, "getFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeformname", realPSModelObject.getFormName(), realPSModelObject, "getFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "memofield", realPSModelObject.getMemoField(), realPSModelObject, "getMemoField");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobformcodename", realPSModelObject.getMobFormCodeName(), realPSModelObject, "getMobFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobpsdeformname", realPSModelObject.getMobFormName(), realPSModelObject, "getMobFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobuagroupcodename", realPSModelObject.getMobUAGroupCodeName(), realPSModelObject, "getMobUAGroupCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil2formcodename", realPSModelObject.getMobUtil2FormCodeName(), realPSModelObject, "getMobUtil2FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil2psdeformname", realPSModelObject.getMobUtil2FormName(), realPSModelObject, "getMobUtil2FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil3formcodename", realPSModelObject.getMobUtil3FormCodeName(), realPSModelObject, "getMobUtil3FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil3psdeformname", realPSModelObject.getMobUtil3FormName(), realPSModelObject, "getMobUtil3FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil4formcodename", realPSModelObject.getMobUtil4FormCodeName(), realPSModelObject, "getMobUtil4FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil4psdeformname", realPSModelObject.getMobUtil4FormName(), realPSModelObject, "getMobUtil4FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil5formcodename", realPSModelObject.getMobUtil5FormCodeName(), realPSModelObject, "getMobUtil5FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutil5psdeformname", realPSModelObject.getMobUtil5FormName(), realPSModelObject, "getMobUtil5FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutilformcodename", realPSModelObject.getMobUtilFormCodeName(), realPSModelObject, "getMobUtilFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobutilpsdeformname", realPSModelObject.getMobUtilFormName(), realPSModelObject, "getMobUtilFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtype", realPSModelObject.getMsgType(), realPSModelObject, "getMsgType");
		this.setDomainValue(iPSModelTranspileContext, domain, "multiinstmode", realPSModelObject.getMultiInstMode(), realPSModelObject, "getMultiInstMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagroupcodename", realPSModelObject.getUAGroupCodeName(), realPSModelObject, "getUAGroupCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util2formcodename", realPSModelObject.getUtil2FormCodeName(), realPSModelObject, "getUtil2FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util2psdeformname", realPSModelObject.getUtil2FormName(), realPSModelObject, "getUtil2FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util3formcodename", realPSModelObject.getUtil3FormCodeName(), realPSModelObject, "getUtil3FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util3psdeformname", realPSModelObject.getUtil3FormName(), realPSModelObject, "getUtil3FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util4formcodename", realPSModelObject.getUtil4FormCodeName(), realPSModelObject, "getUtil4FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util4psdeformname", realPSModelObject.getUtil4FormName(), realPSModelObject, "getUtil4FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util5formcodename", realPSModelObject.getUtil5FormCodeName(), realPSModelObject, "getUtil5FormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "util5psdeformname", realPSModelObject.getUtil5FormName(), realPSModelObject, "getUtil5FormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilformcodename", realPSModelObject.getUtilFormCodeName(), realPSModelObject, "getUtilFormCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "utilpsdeformname", realPSModelObject.getUtilFormName(), realPSModelObject, "getUtilFormName");
		this.setDomainValue(iPSModelTranspileContext, domain, "sendinform", realPSModelObject.isSendInform(), realPSModelObject, "isSendInform");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITFIELDS, domain, "editfields", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITMODE, domain, "editflag", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMCODENAME, domain, "formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMNAME, domain, "psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMEMOFIELD, domain, "memofield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBFORMCODENAME, domain, "mobformcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBFORMNAME, domain, "mobpsdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUAGROUPCODENAME, domain, "mobuagroupcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL2FORMCODENAME, domain, "mobutil2formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL2FORMNAME, domain, "mobutil2psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL3FORMCODENAME, domain, "mobutil3formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL3FORMNAME, domain, "mobutil3psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL4FORMCODENAME, domain, "mobutil4formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL4FORMNAME, domain, "mobutil4psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL5FORMCODENAME, domain, "mobutil5formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTIL5FORMNAME, domain, "mobutil5psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTILFORMCODENAME, domain, "mobutilformcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOBUTILFORMNAME, domain, "mobutilpsdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTYPE, domain, "msgtype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMULTIINSTMODE, domain, "multiinstmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUAGROUPCODENAME, domain, "uagroupcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL2FORMCODENAME, domain, "util2formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL2FORMNAME, domain, "util2psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL3FORMCODENAME, domain, "util3formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL3FORMNAME, domain, "util3psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL4FORMCODENAME, domain, "util4formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL4FORMNAME, domain, "util4psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL5FORMCODENAME, domain, "util5formcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTIL5FORMNAME, domain, "util5psdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILFORMCODENAME, domain, "utilformcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILFORMNAME, domain, "utilpsdeformname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSENDINFORM, domain, "sendinform", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}