package net.ibizsys.model.util.transpiler.extend.control.form;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DBValueOP;
import net.ibizsys.model.PSModelEnums.FormDetailLogicType;
import net.ibizsys.model.control.form.IPSDEFDGroupLogic;
import net.ibizsys.model.control.form.IPSDEFDLogic;
import net.ibizsys.model.control.form.PSDEFDGroupLogicImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFDLogic;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFDLogicListTranspilerEx extends net.ibizsys.model.util.transpiler.control.form.PSDEFDLogicListTranspiler {
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		IPSDEFDLogic iPSDEFDLogic = (IPSDEFDLogic) iPSModelObject;
		PSDEFDLogic psDEFDLogic = (PSDEFDLogic) domain;
		
		if(StringUtils.hasLength(psDEFDLogic.getPSDBValueOPId())) {
			if(!StringUtils.hasLength(psDEFDLogic.getPSDBValueOPName())) {
				DBValueOP dbValueOP = DBValueOP.from(psDEFDLogic.getPSDBValueOPId());
				psDEFDLogic.setPSDBValueOPName(dbValueOP.text);
			}
		}
		
		if(ObjectUtils.isEmpty(psDEFDLogic.getPSDEFDLogicName())) {
			psDEFDLogic.setPSDEFDLogicName(this.calcPSDEFDLogicName(psDEFDLogic));
		}

		if (bFullMode) {

			if (iPSDEFDLogic instanceof IPSDEFDGroupLogic) {
				IPSDEFDGroupLogic iPSDEFDGroupLogic = (IPSDEFDGroupLogic) iPSDEFDLogic;
				if (iPSDEFDGroupLogic.getPSDEFDLogics() != null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFDLogic.class, false).decompile(iPSModelTranspileContext, iPSDEFDGroupLogic.getPSDEFDLogics(), psDEFDLogic.getPSDEFDLogicsIf(), bFullMode);
					for (PSDEFDLogic child : psDEFDLogic.getPSDEFDLogicsIf()) {
						child.setPPSDEFDLogicId(psDEFDLogic.getId());
						child.setPPSDEFDLogicName(psDEFDLogic.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
			}
		}
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);

		PSDEFDLogic psDEFDLogic = (PSDEFDLogic) domain;
		if (!ObjectUtils.isEmpty(psDEFDLogic.getPSDEFDLogics())) {
			ArrayNode arrayNode = objectNode.putArray(PSDEFDGroupLogicImpl.ATTR_GETPSDEFDLOGICS);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFDLogic.class, false).compile(iPSModelTranspileContext, psDEFDLogic.getPSDEFDLogics(), arrayNode);
		}
	}

	protected String calcPSDEFDLogicName(PSDEFDLogic et) throws Exception {
		StringBuilder sb = new StringBuilder();
		if (FormDetailLogicType.SINGLE.value.equals(et.getLogicType())) {
			if (ObjectUtils.isEmpty(et.getFDName())) {
				return "?";
			} else
				sb.append(String.format("%1$s", et.getFDName()));

			if (!ObjectUtils.isEmpty(et.getPSDBValueOPName())) {
				sb.append(String.format(" %1$s ", et.getPSDBValueOPName()));
			} else {
				return "?";
			}

			if (!ObjectUtils.isEmpty(et.getCondValue())) {
				sb.append(String.format("(%1$s)", et.getCondValue()));
			}
			return sb.toString();
		}

		if (FormDetailLogicType.GROUP.value.equals(et.getLogicType())) {
			if (ObjectUtils.isEmpty(et.getGroupOP())) {
				return "?";
			} else {
				sb.append(String.format("%1$s", et.getGroupOP()));
			}

			if (et.getGroupNotFlag() != null && et.getGroupNotFlag() == 1) {
				sb.append("[取反]");
			}
			return sb.toString();
		}

		return "?";
	}

}