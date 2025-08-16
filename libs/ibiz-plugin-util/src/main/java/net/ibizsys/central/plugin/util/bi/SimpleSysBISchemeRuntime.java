package net.ibizsys.central.plugin.util.bi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.bi.ISysBICubeRuntime;
import net.ibizsys.central.bi.SysBISchemeRuntimeException;
import net.ibizsys.central.cloud.core.bi.SysBISchemeRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.AggMode;
import net.ibizsys.model.PSModelEnums.BIDimensionType;
import net.ibizsys.model.PSModelEnums.BIMeasureType;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.PSSysBICubeDimensionImpl;
import net.ibizsys.model.bi.PSSysBICubeImpl;
import net.ibizsys.model.bi.PSSysBICubeMeasureImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.PSDEFieldImpl;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.util.DataTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class SimpleSysBISchemeRuntime extends SysBISchemeRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SimpleSysBISchemeRuntime.class);
	
	private Map<String, ISysBICubeRuntime> sysBICubeRuntimeMap = new ConcurrentHashMap<String, ISysBICubeRuntime>();
	
	
	@Override
	public ISysBICubeRuntime getSysBICubeRuntime(String strBICubeTag, boolean bTryMode) {
		ISysBICubeRuntime iSysBICubeRuntime = super.getSysBICubeRuntime(strBICubeTag, true);
		if(iSysBICubeRuntime != null) {
			return iSysBICubeRuntime;
		}

		iSysBICubeRuntime = this.sysBICubeRuntimeMap.get(strBICubeTag.toUpperCase());
		if(iSysBICubeRuntime != null) {
			return iSysBICubeRuntime;
		}
		
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strBICubeTag, true);
		if(iDataEntityRuntime == null) {
			if(bTryMode)
				return null;
			//抛出异常
			return super.getSysBICubeRuntime(strBICubeTag, bTryMode);
		}
		
		
		try {
			IPSSysBICube iPSSysBICube = this.getPSSysBICube(iDataEntityRuntime);
			iSysBICubeRuntime = this.createSysBICubeRuntime(iPSSysBICube);
			iSysBICubeRuntime.init(this.getSysBISchemeRuntimeContext(), iPSSysBICube);
			this.sysBICubeRuntimeMap.put(strBICubeTag.toUpperCase(), iSysBICubeRuntime);
			return iSysBICubeRuntime;
		}
		catch (Exception ex) {
			throw new SysBISchemeRuntimeException(this, String.format("初始化实体仿真智能报表立方体[%1$s]运行时发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
		}
	}
	
	
	protected IPSSysBICube getPSSysBICube(IDataEntityRuntime iDataEntityRuntime) throws Exception {
		ObjectNode psSysBICubeNode = JsonUtils.createObjectNode();
		psSysBICubeNode.put(PSSysBICubeImpl.ATTR_GETID, iDataEntityRuntime.getLowerCaseName());
		psSysBICubeNode.put(PSSysBICubeImpl.ATTR_GETNAME, iDataEntityRuntime.getLogicName());
		psSysBICubeNode.put(PSSysBICubeImpl.ATTR_GETCODENAME, iDataEntityRuntime.getPSDataEntity().getCodeName());
		
		//放入引用实体
		ObjectNode psDataEntityRefNode = psSysBICubeNode.putObject(PSSysBICubeImpl.ATTR_GETPSDATAENTITY);
		psDataEntityRefNode.put("modelref", true);
		psDataEntityRefNode.put("path", iDataEntityRuntime.getId());
		
		
		ArrayNode psSysBICubeMeasuresNode = psSysBICubeNode.putArray(PSSysBICubeImpl.ATTR_GETALLPSSYSBICUBEMEASURES);
		ArrayNode psSysBICubeDimensionsNode = psSysBICubeNode.putArray(PSSysBICubeImpl.ATTR_GETALLPSSYSBICUBEDIMENSIONS);
		
		
		java.util.List<IPSDEField> psDEFieldList = iDataEntityRuntime.getPSDEFields();
		if(ObjectUtils.isEmpty(psDEFieldList)) {
			return null;
		}
		
		for(IPSDEField iPSDEField : psDEFieldList) {
			
			ObjectNode psSysBICubeMeasureNode = this.tryGetPSSysBICubeMeasureNode(iDataEntityRuntime, iPSDEField);
			if(psSysBICubeMeasureNode != null) {
				psSysBICubeMeasuresNode.add(psSysBICubeMeasureNode);
			}
			else {
				ObjectNode psSysBICubeDimensionNode = this.tryGetPSSysBICubeDimensionNode(iDataEntityRuntime, iPSDEField);
				if(psSysBICubeDimensionNode != null) {
					psSysBICubeDimensionsNode.add(psSysBICubeDimensionNode);
				}
			}
			
		}
		
		
		return this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSSysBIScheme(), IPSSysBICube.class, psSysBICubeNode);
		
	}
	
	protected ObjectNode tryGetPSSysBICubeMeasureNode(IDataEntityRuntime iDataEntityRuntime, IPSDEField iPSDEField) throws Exception {
		
		if(iPSDEField.isKeyDEField()) {
			ObjectNode psSysBICubeMeasureNode = JsonUtils.createObjectNode();
			psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETID, "srfcount");
			psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETNAME, "计数");
			psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETCODENAME, "srfcount");
			psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETAGGMODE, AggMode.COUNT.value);
			psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETMEASURETYPE, BIMeasureType.COMMON.value);
			ObjectNode psDEFieldRefNode = psSysBICubeMeasureNode.putObject(PSSysBICubeMeasureImpl.ATTR_GETPSDEFIELD);
			psDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETNAME, iPSDEField.getName());
			psDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETCODENAME, iPSDEField.getCodeName());
			psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETSTDDATATYPE, DataTypes.INT);

			return psSysBICubeMeasureNode;
		}
		
		
		if(iPSDEField instanceof IPSInheritDEField) {
			return this.tryGetPSSysBICubeMeasureNode(iDataEntityRuntime, ((IPSInheritDEField)iPSDEField).getRelatedPSDEFieldMust());
		}
		
		//需要是数值
		if(!DataTypeUtils.isNumberDataType(iPSDEField.getStdDataType())) {
			return null;
		}
		
		//不能是外键
		if(iPSDEField instanceof IPSPickupDEField) {
			return null;
		}
		
		if(iPSDEField.getPSCodeList() != null) {
			if(!iPSDEField.getPSCodeList().isThresholdGroup()) {
				return null;
			}
		}
		
		ObjectNode psSysBICubeMeasureNode = JsonUtils.createObjectNode();
		psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETID, iPSDEField.getCodeName());
		psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETNAME, iPSDEField.getLogicName());
		psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETCODENAME, iPSDEField.getCodeName());
		psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETMEASURETYPE, BIMeasureType.COMMON.value);
		ObjectNode psDEFieldRefNode = psSysBICubeMeasureNode.putObject(PSSysBICubeMeasureImpl.ATTR_GETPSDEFIELD);
		psDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETNAME, iPSDEField.getName());
		psDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETCODENAME, iPSDEField.getCodeName());
		psSysBICubeMeasureNode.put(PSSysBICubeMeasureImpl.ATTR_GETSTDDATATYPE, iPSDEField.getStdDataType());
		if(iPSDEField.getPSCodeList() != null) {
			ObjectNode psCodeListRefNode = psSysBICubeMeasureNode.putObject(PSSysBICubeMeasureImpl.ATTR_GETPSCODELIST);
			psCodeListRefNode.put("modelref", true);
			psCodeListRefNode.put("path", iPSDEField.getPSCodeList().getId());
		}
		
		return psSysBICubeMeasureNode;		
	}

	
	protected ObjectNode tryGetPSSysBICubeDimensionNode(IDataEntityRuntime iDataEntityRuntime, IPSDEField iPSDEField) throws Exception {
		if(iPSDEField instanceof IPSInheritDEField) {
			return this.tryGetPSSysBICubeDimensionNode(iDataEntityRuntime, ((IPSInheritDEField)iPSDEField).getRelatedPSDEFieldMust());
		}
		
		//需要是数值
		if(DataTypeUtils.isNumberDataType(iPSDEField.getStdDataType())) {
			if(!(iPSDEField instanceof IPSPickupDEField)) {
				return null;
			}
			
			if(iPSDEField.getPSCodeList() == null || iPSDEField.getPSCodeList().isThresholdGroup()) {
				return null;
			}
			
		}
		
		
		ObjectNode psSysBICubeDimensionNode = JsonUtils.createObjectNode();
		psSysBICubeDimensionNode.put(PSSysBICubeDimensionImpl.ATTR_GETID, iPSDEField.getCodeName());
		psSysBICubeDimensionNode.put(PSSysBICubeDimensionImpl.ATTR_GETNAME, iPSDEField.getLogicName());
		psSysBICubeDimensionNode.put(PSSysBICubeDimensionImpl.ATTR_GETCODENAME, iPSDEField.getCodeName());
		psSysBICubeDimensionNode.put(PSSysBICubeDimensionImpl.ATTR_GETDIMENSIONTYPE, BIDimensionType.COMMON.value);
		ObjectNode psDEFieldRefNode = psSysBICubeDimensionNode.putObject(PSSysBICubeDimensionImpl.ATTR_GETPSDEFIELD);
		psDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETNAME, iPSDEField.getName());
		psDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETCODENAME, iPSDEField.getCodeName());
		psSysBICubeDimensionNode.put(PSSysBICubeDimensionImpl.ATTR_GETSTDDATATYPE, iPSDEField.getStdDataType());
		if(iPSDEField.getPSCodeList() != null) {
			ObjectNode psCodeListRefNode = psSysBICubeDimensionNode.putObject(PSSysBICubeDimensionImpl.ATTR_GETPSCODELIST);
			psCodeListRefNode.put("modelref", true);
			psCodeListRefNode.put("path", iPSDEField.getPSCodeList().getId());
		}
		
		if(iPSDEField instanceof IPSPickupDEField) {
			IPSPickupDEField iPSPickupDEField = (IPSPickupDEField)iPSDEField;
			IPSDER1N iPSDER1N = (IPSDER1N)iPSPickupDEField.getPSDERMust();
			if(iPSDER1N.getPSPickupTextDEField()!=null) {
				IPSDEField pickupPSDEField = iDataEntityRuntime.getPSDEField(iPSDER1N.getPSPickupTextDEField().getName(), true);
				if(pickupPSDEField != null) {
					ObjectNode textPSDEFieldRefNode = psSysBICubeDimensionNode.putObject(PSSysBICubeDimensionImpl.ATTR_GETTEXTPSDEFIELD);
					textPSDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETNAME, pickupPSDEField.getName());
					textPSDEFieldRefNode.put(PSDEFieldImpl.ATTR_GETCODENAME, pickupPSDEField.getCodeName());
				}
			}
		}
		
		return psSysBICubeDimensionNode;	
	}
	
	
}


