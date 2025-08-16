package net.ibizsys.model.util.transpiler.extend.control.form;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFormDetailState;
import net.ibizsys.model.control.form.IPSDEFormItemVR;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFIVR;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFormItemVRListTranspilerEx extends net.ibizsys.model.util.transpiler.control.form.PSDEFormItemVRListTranspiler{
	
	public final static int MODELSTATE_PLACEHOLDER = DEFormDetailState.ENABLEEXTENSION.value | DEFormDetailState.ENABLEPLACEHOLDER.value;

	public final static String FIELD_PLACEHOLDERMODEL = "placeholdermodel";
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		IPSDEFormItemVR iPSDEFormItemVR = (IPSDEFormItemVR) iPSModelObject;
		PSDEFIVR psDEFIVR = (PSDEFIVR) domain;
		// 判断是否有模型控制
		if (bFullMode) {
			if ((iPSDEFormItemVR.getModelState() & MODELSTATE_PLACEHOLDER) == MODELSTATE_PLACEHOLDER) {
				domain.set(FIELD_PLACEHOLDERMODEL, iPSDEFormItemVR.getObjectNode().toString());
			}
		}

	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		PSDEFIVR psDEFIVR = (PSDEFIVR) domain;
//		if((DataTypeUtils.asInteger(psDEFIVR.getModelState(), 0) & MODELSTATE_PLACEHOLDER) == MODELSTATE_PLACEHOLDER) {
//			
//			String strPlaceHolderModel = DataTypeUtils.asString(psDEFIVR.get(FIELD_PLACEHOLDERMODEL), null);
//			if(StringUtils.hasLength(strPlaceHolderModel)) {
//				ObjectNode originNode = JsonUtils.toObjectNode(strPlaceHolderModel);
//				java.util.Iterator<String> fields = originNode.fieldNames();
//				if(fields!=null) {
//					while(fields.hasNext()) {
//						String strFieldName = fields.next();
//						objectNode.set(strFieldName, originNode.get(strFieldName));
//					}
//				}
//				return;
//			}
//		}
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);

		


	}
	
}