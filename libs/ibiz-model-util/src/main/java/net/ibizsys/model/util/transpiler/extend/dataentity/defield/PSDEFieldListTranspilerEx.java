package net.ibizsys.model.util.transpiler.extend.dataentity.defield;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.DEFType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSFormulaDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyObjDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2OneObjDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDataDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupTextDEField;
import net.ibizsys.model.dataentity.defield.PSDEFieldImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.domain.PSCodeList;
import net.ibizsys.psmodel.core.domain.PSDEField;
import net.ibizsys.psmodel.core.util.IPSModel;


public class PSDEFieldListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldListTranspiler{
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSDEFieldListTranspilerEx.class);
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		if(iPSModelObject instanceof IPSFormulaDEField) {
			
			if(iPSModelObject instanceof IPSOne2ManyDataDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSFormulaOne2ManyDataDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSOne2ManyObjDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSFormulaOne2ManyObjDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSOne2OneDataDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSFormulaOne2ManyObjDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSOne2OneObjDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSFormulaOne2OneObjDEFieldImpl.class, false);
			}
			
			return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl.class, false);
		}
		
		if(iPSModelObject instanceof IPSLinkDEField) {
			
			if(iPSModelObject instanceof IPSPickupTextDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSPickupTextDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSPickupDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSPickupDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSPickupObjectDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSPickupObjectDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSPickupDataDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSPickupDataDEFieldImpl.class, false);
			}
			
			if(iPSModelObject instanceof IPSInheritDEField) {
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSInheritDEFieldImpl.class, false);
			}
			
			return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl.class, false);
		}

		if(iPSModelObject instanceof IPSOne2ManyDataDEField) {
			return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSOne2ManyDataDEFieldImpl.class, false);
		}
		
		if(iPSModelObject instanceof IPSOne2ManyObjDEField) {
			return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSOne2ManyObjDEFieldImpl.class, false);
		}
		
		if(iPSModelObject instanceof IPSOne2OneDataDEField) {
			return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSOne2ManyObjDEFieldImpl.class, false);
		}
		
		if(iPSModelObject instanceof IPSOne2OneObjDEField) {
			return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.defield.PSOne2OneObjDEFieldImpl.class, false);
		}
		
		return super.getPSModelTranspiler(iPSModelTranspileContext, iPSModelObject);
	}
	
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		IPSDEField iPSDEField = (IPSDEField)iPSModelObject;
		PSDEField psDEField = (PSDEField)domain;
		if(StringUtils.hasLength(psDEField.getPSDataTypeId())) {
			psDEField.setPSDataTypeName(DEFDataType.from(psDEField.getPSDataTypeId()).text);
		}
		
		if(psDEField.getScale() == null) {
			if(iPSDEField.getPrecision() > 0) {
				psDEField.setScale(iPSDEField.getPrecision());
			}
		}
		
		if(iPSModelObject.getParentPSModelObject()!=null) {
			domain.set("psdeid", PSModelUtils.calcFullUniqueTag(iPSModelObject.getParentPSModelObject()));
			domain.set("psdename", iPSModelObject.getParentPSModelObject().getName());
		}
	}
	
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDEField psDEField = (PSDEField)domain;
		
		objectNode.put(PSDEFieldImpl.ATTR_GETSTDDATATYPE, getStdDataType(psDEField.getPSDataTypeId()));
		int nDEFType = DataTypeUtils.asInteger(psDEField.getDEFType(), DEFType.DYNASTORAGE.value);
		if(nDEFType == DEFType.DYNASTORAGE.value) {
			objectNode.put(PSDEFieldImpl.ATTR_ISDYNASTORAGEDEFIELD, true);
		}
		
		if(psDEField.getScale() != null && psDEField.getScale()>0) {
			objectNode.put(PSDEFieldImpl.ATTR_GETPRECISION, psDEField.getScale());
		}
		
		//编译内联代码表模型
		Object codeListModel = psDEField.get("codelistmodel");
		if(codeListModel instanceof Map) {
			PSCodeList psCodeList = JsonUtils.as(codeListModel, PSCodeList.class);
			psCodeList.setCLType("INLINE");
			psCodeList.setCodeName(String.format("%1$s_codelist", psDEField.getId().replace(".", "__")));
			ObjectNode psCodeListModel = iPSModelTranspileContext.getPSModelTranspiler(IPSCodeList.class, false).compile(iPSModelTranspileContext, psCodeList, null);
			objectNode.set(PSDEFieldImpl.ATTR_GETINLINEPSCODELIST, psCodeListModel);
		}
	}
	
	protected int getStdDataType(String strPSDataTypeId) {
		if(DEFDataType.ACID.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.BIGDECIMAL.value.equalsIgnoreCase(strPSDataTypeId)) {
			return StdDataType.BIGDECIMAL.value;
		}
		
		if(DEFDataType.BIGINT.value.equalsIgnoreCase(strPSDataTypeId)) {
			return StdDataType.BIGINT.value;
		}
		
		if(DEFDataType.DECIMAL.value.equalsIgnoreCase(strPSDataTypeId)) {
			return StdDataType.DECIMAL.value;
		}
		
		
		if(DEFDataType.FLOAT.value.equalsIgnoreCase(strPSDataTypeId)) {
			return StdDataType.FLOAT.value;
		}
		if(DEFDataType.INT.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.NBID.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.NMCODELIST.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.NSCODELIST.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.TRUEFALSE.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.WFSTATE.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.YESNO.value.equalsIgnoreCase(strPSDataTypeId)
				) {
			return StdDataType.INT.value;
		}
		
		
		if(DEFDataType.BIGINTARRAY.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.DECIMALARRAY.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.FLOATARRAY.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.INTARRAY.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.CURRENCY.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.CURRENCYUNIT.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.FILE.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.FILELIST.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.GUID.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.LONGTEXT_1000.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.PICTURE.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.PICTURELIST.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.SBID.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.SMCODELIST.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.SSCODELIST.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.TEXTARRAY.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.TEXT.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.TEXT_EMAIL.value.equalsIgnoreCase(strPSDataTypeId)
				) {
			return StdDataType.VARCHAR.value;
		}
		
		if(DEFDataType.BIGINTARRAY2.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.DECIMALARRAY2.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.FLOATARRAY2.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.INTARRAY2.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.LONGFILELIST.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.LONGPICTURELIST.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.LONGTEXT.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.ONE2MANYDATA.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.ONE2MANYDATA_MAP.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.ONE2MANYOBJ.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.ONE2MANYOBJ_MAP.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.ONE2ONEDATA.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.ONE2ONEOBJ.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.PICKUPOBJECT.value.equalsIgnoreCase(strPSDataTypeId)
				|| DEFDataType.TEXTARRAY2.value.equalsIgnoreCase(strPSDataTypeId)) {
			return StdDataType.TEXT.value;
		}
		
		if(DEFDataType.DATE.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.DATETIME.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.DATETIME_BIRTHDAY.value.equalsIgnoreCase(strPSDataTypeId)
				||DEFDataType.TIME.value.equalsIgnoreCase(strPSDataTypeId)
				) {
			return StdDataType.DATETIME.value;
		}
		
		if(DEFDataType.VARBINARY.value.equalsIgnoreCase(strPSDataTypeId)) {
			return StdDataType.VARBINARY.value;
		}
		
		log.warn(String.format("无法识别的属性值类型[%1$s]，按文本处理", strPSDataTypeId));
		return StdDataType.VARCHAR.value;
	}
}