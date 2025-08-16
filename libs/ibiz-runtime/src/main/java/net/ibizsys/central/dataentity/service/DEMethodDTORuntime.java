package net.ibizsys.central.dataentity.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;

/**
 * 默认实体方法DTO运行时对象实现
 * 
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public class DEMethodDTORuntime extends DataEntityModelRuntimeBase implements IDEMethodDTORuntime {

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IPSDEMethodDTO iPSDEMethodDTO = null;
	private Map<String, IPSDEMethodDTOField> psDEMethodDTOFieldMap = new HashMap<String, IPSDEMethodDTOField>();
	private Map<String, IPSDEMethodDTOField> psDEMethodDTOFieldMap2 = null;
	private List<IDEMethodDTORuntime> nestedDEMethodDTORuntimeList = null;
//	private Map<String, String> dtoNameMap = new HashMap<String, String>();

	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEMethodDTO iPSDEMethodDTO) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.iPSDEMethodDTO = iPSDEMethodDTO;

		List<IPSDEMethodDTOField> psDEMethodDTOFieldList = this.iPSDEMethodDTO.getPSDEMethodDTOFields();
		if (psDEMethodDTOFieldList != null) {
			for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
				psDEMethodDTOFieldMap.put(iPSDEMethodDTOField.getLowerCaseName(), iPSDEMethodDTOField);
				psDEMethodDTOFieldMap.put(iPSDEMethodDTOField.getName(), iPSDEMethodDTOField);
				if(iPSDEMethodDTOField.getPSDER() != null) {
					psDEMethodDTOFieldMap.put(iPSDEMethodDTOField.getPSDER().getId(), iPSDEMethodDTOField);
				}
			}
			
			if(isPreparePSDEFieldMap()) {
				psDEMethodDTOFieldMap2 = new HashMap<String, IPSDEMethodDTOField>();
				for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					if(iPSDEMethodDTOField.getPSDEField()!=null) {
						psDEMethodDTOFieldMap2.put(iPSDEMethodDTOField.getPSDEField().getLowerCaseName(), iPSDEMethodDTOField);
						psDEMethodDTOFieldMap2.put(iPSDEMethodDTOField.getPSDEField().getName(), iPSDEMethodDTOField);
					}
					if(iPSDEMethodDTOField.getPSDER()!=null) {
						psDEMethodDTOFieldMap2.put(iPSDEMethodDTOField.getLowerCaseName(), iPSDEMethodDTOField);
						psDEMethodDTOFieldMap2.put(iPSDEMethodDTOField.getPSDER().getId(), iPSDEMethodDTOField);
					}
					else
						if(iPSDEMethodDTOField.getPSDEField()!=null &&  DEFDataTypes.INHERIT.equals(iPSDEMethodDTOField.getPSDEField().getDataType()) 
						  && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField()!=null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER()!=null) {
							psDEMethodDTOFieldMap2.put(iPSDEMethodDTOField.getLowerCaseName(), iPSDEMethodDTOField);
							psDEMethodDTOFieldMap2.put(iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER().getId(), iPSDEMethodDTOField);
						}
				}
			}
		}

		onInit();
	}
	
	

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	protected boolean isPreparePSDEFieldMap() {
		return true;
	}
	

	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return iDataEntityRuntimeContext;
	}

	@Override
	public IPSDEMethodDTO getPSDEMethodDTO() {
		return this.iPSDEMethodDTO;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEMethodDTO();
	}

	@Override
	public IPSDEMethodDTOField getPSDEMethodDTOField(String strName, boolean bTryMode) {
		IPSDEMethodDTOField iPSDEMethodDTOField = psDEMethodDTOFieldMap.get(strName);
		if(iPSDEMethodDTOField != null || bTryMode) {
			return iPSDEMethodDTOField;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeContext().getDataEntityRuntime(), this, String.format("无法获取指定属性[%1$s]", strName));
	}

	@Override
	public IPSDEMethodDTOField getPSDEMethodDTOFieldByDEField(IPSDEField iPSDEField, boolean bTryMode) {
		IPSDEMethodDTOField iPSDEMethodDTOField = null;
		if(psDEMethodDTOFieldMap2 != null) {
			iPSDEMethodDTOField = psDEMethodDTOFieldMap2.get(iPSDEField.getName());
		}
		if(iPSDEMethodDTOField != null || bTryMode) {
			return iPSDEMethodDTOField;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeContext().getDataEntityRuntime(), this, String.format("无法获取实体属性[%1$s]相关属性", iPSDEField.getName()));
	}
	
	@Override
	public IPSDEMethodDTOField getPSDEMethodDTOFieldByDEField(String strName, boolean bTryMode) {
		IPSDEMethodDTOField iPSDEMethodDTOField = null;
		if(psDEMethodDTOFieldMap2 != null) {
			iPSDEMethodDTOField = psDEMethodDTOFieldMap2.get(strName);
		}
		if(iPSDEMethodDTOField != null || bTryMode) {
			return iPSDEMethodDTOField;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeContext().getDataEntityRuntime(), this, String.format("无法获取实体属性[%1$s]相关属性", strName));
	}
	
	
	@Override
	public IPSDEMethodDTOField getPSDEMethodDTOFieldByDER(String strName, boolean bTryMode) {
		IPSDEMethodDTOField iPSDEMethodDTOField = null;
		if(psDEMethodDTOFieldMap2 != null) {
			iPSDEMethodDTOField = psDEMethodDTOFieldMap2.get(strName);
		}
		if(iPSDEMethodDTOField != null || bTryMode) {
			return iPSDEMethodDTOField;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeContext().getDataEntityRuntime(), this, String.format("无法获取实体关系[%1$s]相关属性", strName));
	}


	@Override
	public boolean isEnableAny() {
		return true;
	}



	@Override
	public List<IPSDEMethodDTOField> getPSDEMethodDTOFields() {
		return getPSDEMethodDTO().getPSDEMethodDTOFields();
	}



	@Override
	public List<IDEMethodDTORuntime> getNestedDEMethodDTORuntimes() {
		List<IDEMethodDTORuntime> list = this.nestedDEMethodDTORuntimeList;
		if(list == null) {
			Map<String, IDEMethodDTORuntime> map = new LinkedHashMap<String, IDEMethodDTORuntime>();
			this.fillNestedDEMethodDTORuntimeMap(map);
			if(ObjectUtils.isEmpty(map)) {
				this.nestedDEMethodDTORuntimeList = Collections.EMPTY_LIST;
			}
			else {
				this.nestedDEMethodDTORuntimeList = java.util.Collections.unmodifiableList(new ArrayList<IDEMethodDTORuntime>(map.values()));
			}
			list = this.nestedDEMethodDTORuntimeList;
		}
		if(list == Collections.EMPTY_LIST) {
			return null;
		}
		return list;
	}
	
	
	
	protected void fillNestedDEMethodDTORuntimeMap(Map<String, IDEMethodDTORuntime> map) {
		List<IPSDEMethodDTOField> psDEMethodDTOFieldList = this.getPSDEMethodDTOFields();
		if (!ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
			for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
				if(DEMethodDTOFieldType.DTO.value.equals(iPSDEMethodDTOField.getType())
						|| DEMethodDTOFieldType.DTOS.value.equals(iPSDEMethodDTOField.getType())) {
					
					if(iPSDEMethodDTOField.getRefPSDataEntity() == null
							|| iPSDEMethodDTOField.getRefPSDEMethodDTO() == null) {
						continue;
					}
					
					String strFullTag = String.format("%1$s__%2$s", iPSDEMethodDTOField.getRefPSDataEntity().getId(), iPSDEMethodDTOField.getRefPSDEMethodDTO().getId());
					if(map.containsKey(strFullTag)) {
						continue;
					}
					
					IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntity().getId(), false);
					IDEMethodDTORuntime refDEMethodDTORuntime = refDataEntityRuntime.getDEMethodDTORuntime(iPSDEMethodDTOField.getRefPSDEMethodDTO(), false);
					map.put(strFullTag, refDEMethodDTORuntime);
				}
			}
		}
	}
	
	public static void fillAllNestedDEMethodDTORuntimeMap(IDEMethodDTORuntime iDEMethodDTORuntime, Map<String, IDEMethodDTORuntime> map) {
		Assert.notNull(iDEMethodDTORuntime, "传入实体方法DTO运行时对象无效");
		Assert.notNull(map, "传入Map对象无效");
		
		String strFullTag = iDEMethodDTORuntime.getFullUniqueTag();
		if(map.containsKey(strFullTag)) {
			return;
		}
		
		map.put(strFullTag, iDEMethodDTORuntime);
		
		List<IDEMethodDTORuntime> list = iDEMethodDTORuntime.getNestedDEMethodDTORuntimes();
		if(ObjectUtils.isEmpty(list)) {
			return;
		}
		
		for(IDEMethodDTORuntime item : list) {
			fillAllNestedDEMethodDTORuntimeMap(item, map);
		}
		
	}
}
