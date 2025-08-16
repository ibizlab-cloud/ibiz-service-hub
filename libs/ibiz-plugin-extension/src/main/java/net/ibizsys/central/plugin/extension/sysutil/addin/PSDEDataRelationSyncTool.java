package net.ibizsys.central.plugin.extension.sysutil.addin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.dr.IPSDEDRDetail;
import net.ibizsys.model.dataentity.dr.IPSDEDataRelation;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.psmodel.core.util.PSModels;

public class PSDEDataRelationSyncTool extends PSDEModelSyncToolBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSDEDataRelationSyncTool.class);
	
	@Override
	protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
		
		Map<String, Object> params = null;
		if(param instanceof Map) {
			params = (Map)param;
		}
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());

		String[] fields = new String[] {PSMODELSYNC_PREDEFINEDFIELD_OWNER_TYPE,
				PSMODELSYNC_PREDEFINEDFIELD_OWNER_SUBTYPE,
				PSMODELSYNC_PREDEFINEDFIELD_TAG,
				PSMODELSYNC_PREDEFINEDFIELD_DESCRIPTION,
				PSMODELSYNC_PREDEFINEDFIELD_NAME,
				PSMODELSYNC_PREDEFINEDFIELD_ORDER_VALUE};
		
		Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
		for(String strFieldTag : fields) {
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEFieldByTag(strFieldTag, true);
			if(iPSDEField != null) {
				psDEFieldMap.put(strFieldTag, iPSDEField);
			}
		}
		
		if(!psDEFieldMap.containsKey(PSMODELSYNC_PREDEFINEDFIELD_NAME)) {
			psDEFieldMap.put(PSMODELSYNC_PREDEFINEDFIELD_NAME, iDataEntityRuntime.getMajorPSDEField());
		}
		
		
		List<Map> mapList = new ArrayList<Map>();
		
		List<IPSDERBase> psDERBaseList = iPSDataEntity.getMinorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				
				if(!(iPSDERBase instanceof IPSDERCustom)) {
					continue;
				}
				
				IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
				
//				if(!ObjectUtils.isEmpty(iPSDERCustom.getDERSubType()) && !DERSubType.USER.value.equals(iPSDERCustom.getDERSubType())){
//					continue;
//				}
				
				String strDERTag = iPSDERCustom.getDERTag();
				String strDRTags = "Default";
				if(StringUtils.hasLength(strDERTag)) {
					String[] items = strDERTag.split("[:]");
					if(items.length == 2) {
						if(!PSModels.PSDEDATARELATION.equalsIgnoreCase(items[0])) {
							continue;
						}
						strDRTags = items[1];
					}
					else {
						strDRTags = items[0];
					}
				}
				
				if(!StringUtils.hasLength(strDRTags)) {
					continue;
				}
				
				//获取相应的
				IPSDataEntity majorPSDataEntity = iPSDERCustom.getMajorPSDataEntityMust();
				
				String[] tags = strDRTags.split("[,]");
				for(String strDRTag : tags) {
					
					IPSDEDataRelation iPSDEDataRelation = null;
					List<IPSDEDataRelation> psDEDataRelationList =	majorPSDataEntity.getAllPSDEDataRelations();
					if(!ObjectUtils.isEmpty(psDEDataRelationList)) {
						for(IPSDEDataRelation item : psDEDataRelationList) {
							if(strDRTag.equalsIgnoreCase(item.getCodeName())) {
								iPSDEDataRelation = item;
								break;
							}
						}
					}
					
					if(iPSDEDataRelation == null) {
						throw new Exception(String.format("无法从实体[%1$s]获取指定关系界面组[%2$s]", majorPSDataEntity.getName(), strDRTag));
					}
					
					List<IPSDEDRDetail> psDEDRDetailList = iPSDEDataRelation.getPSDEDRDetails();
					if(ObjectUtils.isEmpty(psDEDRDetailList)) {
						continue;
					}
					
					
					for(IPSDEDRDetail item : psDEDRDetailList) {
						Map<String, Object> obj = new LinkedHashMap<String, Object>();
						obj.put(PSMODELSYNC_PREDEFINEDFIELD_OWNER_TYPE, majorPSDataEntity.getCodeName());
						obj.put(PSMODELSYNC_PREDEFINEDFIELD_OWNER_SUBTYPE, strDRTag);
						obj.put(PSMODELSYNC_PREDEFINEDFIELD_TAG, item.getName());
						obj.put(PSMODELSYNC_PREDEFINEDFIELD_DESCRIPTION, item.getMemo());
						obj.put(PSMODELSYNC_PREDEFINEDFIELD_NAME, item.getCaption());
						obj.put(PSMODELSYNC_PREDEFINEDFIELD_ORDER_VALUE, item.getOrderValue());
						mapList.add(obj);
					}
				}
			}
		}
		
		//查询历史数据
		Map<String, IEntityDTO> lastEntityDTOMap = null;;
		IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
		if(iPSDEDataSet != null) {
			
			lastEntityDTOMap = new HashMap<String, IEntityDTO>();
			ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
			iSearchContextDTO.all().count(false);
			
			List<IEntityDTO> list = iDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
			for(IEntityDTO item : list) {
				lastEntityDTOMap.put(item.getString(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), null), item);
			}
		}
		
		
		//执行批保存
		List<IEntityDTO> entityList = new ArrayList<IEntityDTO>();
		for(Map<String, Object> item : mapList) {
			IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity();
			for(java.util.Map.Entry<String, IPSDEField> entry : psDEFieldMap.entrySet()) {
				if(entry.getValue() == null) {
					continue;
				}
				
				Object value = item.get(entry.getKey());
				iEntityDTO.set(entry.getValue().getLowerCaseName(), value);
			}
			iDataEntityRuntime.fillEntityKeyValue(iEntityDTO);
			if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(iEntityDTO.getString(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), null))) {
				continue;
			}
			
			entityList.add(iEntityDTO);
		}
		
		
		for(IEntityDTO iEntityDTO : entityList) {
			iDataEntityRuntime.fillEntityDefaultValues(iEntityDTO);
		}

		if(ObjectUtils.isEmpty(entityList)){
			return;
		}

		try {
			if(lastEntityDTOMap != null) {
				iDataEntityRuntime.rawCreate(entityList, true);
			}
			else {
				iDataEntityRuntime.rawSave(entityList, true);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("同步界面关系组成员发生异常，%1$s", ex.getMessage()), ex);
		}
	}

}
