package net.ibizsys.model.util.transpiler.extend.control.form;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFormDetailState;
import net.ibizsys.model.control.form.IPSDEFIUpdateDetail;
import net.ibizsys.model.control.form.IPSDEFormItemUpdate;
import net.ibizsys.model.control.form.PSDEFormImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFIUDetail;
import net.ibizsys.psmodel.core.domain.PSDEFIUpdate;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFormItemUpdateListTranspilerEx extends net.ibizsys.model.util.transpiler.control.form.PSDEFormItemUpdateListTranspiler {

	public final static int MODELSTATE_PLACEHOLDER = DEFormDetailState.ENABLEEXTENSION.value | DEFormDetailState.ENABLEPLACEHOLDER.value;

	public final static String FIELD_PLACEHOLDERMODEL = "placeholdermodel";
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		IPSDEFormItemUpdate iPSDEFormItemUpdate = (IPSDEFormItemUpdate) iPSModelObject;
		PSDEFIUpdate psDEFIUpdate = (PSDEFIUpdate) domain;
		// 判断是否有模型控制
		if (bFullMode) {
			if ((iPSDEFormItemUpdate.getModelState() & MODELSTATE_PLACEHOLDER) == MODELSTATE_PLACEHOLDER) {
				domain.set(FIELD_PLACEHOLDERMODEL, iPSDEFormItemUpdate.getObjectNode().toString());
			}
		}

		if (bFullMode) {
			if (iPSDEFormItemUpdate.getPSDEFIUpdateDetails() != null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFIUpdateDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFormItemUpdate.getPSDEFIUpdateDetails(), psDEFIUpdate.getPSDEFIDetailsIf(), bFullMode);
				for (PSDEFIUDetail child : psDEFIUpdate.getPSDEFIDetailsIf()) {
					child.setPSDEFIUpdateId(psDEFIUpdate.getId());
					child.setPSDEFIUpdateName(psDEFIUpdate.getName());
					// child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		PSDEFIUpdate psDEFIUpdate = (PSDEFIUpdate) domain;
		if((DataTypeUtils.asInteger(psDEFIUpdate.getModelState(), 0) & MODELSTATE_PLACEHOLDER) == MODELSTATE_PLACEHOLDER) {
			
			String strPlaceHolderModel = DataTypeUtils.asString(psDEFIUpdate.get(FIELD_PLACEHOLDERMODEL), null);
			if(StringUtils.hasLength(strPlaceHolderModel)) {
				ObjectNode originNode = JsonUtils.toObjectNode(strPlaceHolderModel);
				java.util.Iterator<String> fields = originNode.fieldNames();
				if(fields!=null) {
					while(fields.hasNext()) {
						String strFieldName = fields.next();
						objectNode.set(strFieldName, originNode.get(strFieldName));
					}
				}
				return;
			}
		}
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);

		

		if (!ObjectUtils.isEmpty(psDEFIUpdate.getPSDEFIDetails())) {
			ArrayNode arrayNode = objectNode.putArray(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFIUpdateDetail.class, false).compile(iPSModelTranspileContext, psDEFIUpdate.getPSDEFIDetails(), arrayNode);
		}

	}
}