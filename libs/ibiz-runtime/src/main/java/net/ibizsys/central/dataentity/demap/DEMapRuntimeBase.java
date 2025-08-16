package net.ibizsys.central.dataentity.demap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.CondType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.datamap.IPSDEMap;
import net.ibizsys.model.dataentity.datamap.IPSDEMapAction;
import net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet;
import net.ibizsys.model.dataentity.datamap.IPSDEMapField;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQCustomCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.ISearchPredefinedCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;
import net.ibizsys.runtime.util.SearchPredefinedCond;

public abstract class DEMapRuntimeBase extends DataEntityModelRuntimeBase implements IDEMapRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEMapRuntimeBase.class);
	
	private IPSDEMap iPSDEMap = null;
	private Map<String, IPSDEMapAction> psDEMapActionMap = null;
	private Map<String, IPSDEMapDataSet> psDEMapDataSetMap = null;
	private Map<String, IPSDEMapField> srcPSDEMapFieldMap = null;
	private Map<String, IPSDEMapField> dstPSDEMapFieldMap = null;
	private IDataEntityRuntime dstDataEntityRuntime = null;
	private boolean bCopySrcEntityDTOAllFields = false;
	private boolean bCopyDstEntityDTOAllFields = false;
	
	
	/**
	 * 实体映射数据集参数：是否附加查询模型
	 */
	public final static String  DEMAPDATASETPARAM_QUERYMODEL = "QUERYMODEL";
	
	/**
	 * 实体映射属性参数：拷贝全部属性
	 */
	public final static String  DEMAPFIELDPARAM_ALLFIELDS = "ALLFIELDS";
	
	
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEMap iPSDEMap) throws Exception {
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.setPSDEMap(iPSDEMap);
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		boolean bAllFields = JsonUtils.getField(this.getPSDEMap().getMapParams(), DEMAPFIELDPARAM_ALLFIELDS, false);
		if(bAllFields) {
			this.setCopyDstEntityDTOAllFields(true);
			this.setCopySrcEntityDTOAllFields(true);
		}
		
		
		java.util.List<IPSDEMapField> psDEMapFields = this.getPSDEMap().getPSDEMapFields();
		if(!ObjectUtils.isEmpty(psDEMapFields)) {
			this.srcPSDEMapFieldMap = new HashMap<String, IPSDEMapField>();
			this.dstPSDEMapFieldMap = new HashMap<String, IPSDEMapField>();
			for(IPSDEMapField iPSDEMapField : psDEMapFields) {
				if(ObjectUtils.isEmpty(iPSDEMapField.getMapType()) ||  DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())) {
					if(ObjectUtils.isEmpty(iPSDEMapField.getSrcFieldName())) {
						throw new Exception(String.format("属性映射[%1$s]未指定源属性", iPSDEMapField.getName()));
					}
					if(ObjectUtils.isEmpty(iPSDEMapField.getDstFieldName())) {
						throw new Exception(String.format("属性映射[%1$s]未指定目标属性", iPSDEMapField.getName()));
					}
					
					this.srcPSDEMapFieldMap.put(iPSDEMapField.getSrcFieldName().toLowerCase(), iPSDEMapField);
					this.dstPSDEMapFieldMap.put(iPSDEMapField.getDstFieldName().toLowerCase(), iPSDEMapField);
					continue;
				}
				
				if(DEMapFieldMapTypes.VALUE.equals(iPSDEMapField.getMapType())
						|| DEMapFieldMapTypes.EXPRESSION.equals(iPSDEMapField.getMapType())) {
					if(ObjectUtils.isEmpty(iPSDEMapField.getDstFieldName())) {
						throw new Exception(String.format("属性映射[%1$s]未指定目标属性", iPSDEMapField.getName()));
					}
					this.dstPSDEMapFieldMap.put(iPSDEMapField.getDstFieldName().toLowerCase(), iPSDEMapField);
					continue;
				}
				
				if(DEMapFieldMapTypes.VALUE_SRC.equals(iPSDEMapField.getMapType())
						|| DEMapFieldMapTypes.EXPRESSION_SRC.equals(iPSDEMapField.getMapType())) {
					if(ObjectUtils.isEmpty(iPSDEMapField.getSrcFieldName())) {
						throw new Exception(String.format("属性映射[%1$s]未指定源属性", iPSDEMapField.getName()));
					}
					this.srcPSDEMapFieldMap.put(iPSDEMapField.getSrcFieldName().toLowerCase(), iPSDEMapField);
					continue;
				}
				
				throw new Exception(String.format("无法识别的属性映射类型[%1$s][%2$s]", iPSDEMapField.getName(), iPSDEMapField.getMapType()));
			}
		}
		
		java.util.List<IPSDEMapAction> psDEMapActions = this.getPSDEMap().getPSDEMapActions();
		if(!ObjectUtils.isEmpty(psDEMapActions)) {
			psDEMapActionMap = new HashMap<String, IPSDEMapAction>();
			for(IPSDEMapAction iPSDEMapAction : psDEMapActions) {
				psDEMapActionMap.put(iPSDEMapAction.getSrcPSDEActionMust().getName(), iPSDEMapAction);
				psDEMapActionMap.put(iPSDEMapAction.getSrcPSDEActionMust().getName().toLowerCase(), iPSDEMapAction);
			}
		}
		
		java.util.List<IPSDEMapDataSet> psDEMapDataSets = this.getPSDEMap().getPSDEMapDataSets();
		if(!ObjectUtils.isEmpty(psDEMapDataSets)) {
			psDEMapDataSetMap = new HashMap<String, IPSDEMapDataSet>();
			for(IPSDEMapDataSet iPSDEMapDataSet : psDEMapDataSets) {
				
				iPSDEMapDataSet.getDstPSDEDataSetMust();
				
				psDEMapDataSetMap.put(iPSDEMapDataSet.getSrcPSDEDataSetMust().getName(), iPSDEMapDataSet);
				psDEMapDataSetMap.put(iPSDEMapDataSet.getSrcPSDEDataSetMust().getName().toLowerCase(), iPSDEMapDataSet);
			}
		}
		
		
		super.onInit();
	}
	
	@Override
	public IPSDEMap getPSDEMap() {
		return this.iPSDEMap;
	}
	
	protected void setPSDEMap(IPSDEMap iPSDEMap) {
		this.iPSDEMap = iPSDEMap;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEMap();
	}
	
	public IDataEntityRuntime getDstDataEntityRuntime() {
		if(this.dstDataEntityRuntime == null) {
			this.dstDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDEMap().getDstPSDEMust().getId());
		}
		return this.dstDataEntityRuntime;
	}
	
	protected Map<String, IPSDEMapField> getDstPSDEMapFieldMap(){
		return this.dstPSDEMapFieldMap;
	}
	
	protected Map<String, IPSDEMapField> getSrcPSDEMapFieldMap(){
		return this.srcPSDEMapFieldMap;
	}
	
	protected boolean isCopySrcEntityDTOAllFields() {
		return this.bCopySrcEntityDTOAllFields;
	}
	
	protected void setCopySrcEntityDTOAllFields(boolean bCopySrcEntityDTOAllFields) {
		this.bCopySrcEntityDTOAllFields = bCopySrcEntityDTOAllFields;
	}
	
	protected boolean isCopyDstEntityDTOAllFields() {
		return this.bCopyDstEntityDTOAllFields;
	}
	
	protected void setCopyDstEntityDTOAllFields(boolean bCopyDstEntityDTOAllFields) {
		this.bCopyDstEntityDTOAllFields = bCopyDstEntityDTOAllFields;
	}
	

	@Override
	public IEntityDTO toEntityDTO(IEntityDTO srcEntityDTO) {
		return this.toEntityDTO(srcEntityDTO, null);
	}
	
	@Override
	public IEntityDTO toEntityDTO(IEntityDTO srcEntityDTO, IEntityDTO iEntityDTO) {
		try {
			if(ObjectUtils.isEmpty(this.getDstPSDEMapFieldMap())) {
				throw new Exception("未定义目标实体属性映射模型");
			}
			if(iEntityDTO == null) {
				iEntityDTO = this.getDstDataEntityRuntime().createEntity();
			}
			
			this.fillDstEntityDTO(srcEntityDTO, iEntityDTO, this.isCopySrcEntityDTOAllFields());
			
//			for(java.util.Map.Entry<String, IPSDEMapField> entry : this.getDstPSDEMapFieldMap().entrySet()) {
//				IPSDEMapField iPSDEMapField = entry.getValue();
//				if(DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())) {
//					if(!srcEntityDTO.contains(iPSDEMapField.getSrcFieldName())){
//						continue;
//					}
//					Object value = srcEntityDTO.get(iPSDEMapField.getSrcFieldName());
//					if(value != null) {
//						IPSSysTranslator iPSSysTranslator = iPSDEMapField.getPSSysTranslator();
//						if(iPSSysTranslator != null) {
//							value = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator).translate(value, true);
//						}
//					}
//					
//					iEntityDTO.set(iPSDEMapField.getDstFieldName(), value);
//					continue;
//				}
//				
//				if(DEMapFieldMapTypes.VALUE.equals(iPSDEMapField.getMapType())) {
//					iEntityDTO.set(iPSDEMapField.getDstFieldName(), iPSDEMapField.getRawValue());
//					continue;
//				}
//				
//				if(DEMapFieldMapTypes.EXPRESSION.equals(iPSDEMapField.getMapType())) {
//					//获取表达式
//					if(!StringUtils.hasLength(iPSDEMapField.getExpression())) {
//						throw new Exception(String.format("未定义属性映射[%1$s]表达式", iPSDEMapField.getName()));
//					}
//					
//					IDEScriptLogicRuntime iDEScriptLogicRuntime = this.getDataEntityRuntime().getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, iPSDEMapField.getExpression());
//					iEntityDTO.set(iPSDEMapField.getDstFieldName(), iDEScriptLogicRuntime.execute(new Object[] {srcEntityDTO}));
//					continue;
//				}
//			}
		
			return iEntityDTO;
		}
		catch (Throwable ex) {
			log.debug(String.format("转化当前实体数据对象到目标实体数据对象发生异常，%1$s", ex.getMessage()));
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("转化当前实体数据对象到目标实体数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	
	protected void fillDstEntityDTO(IEntityDTO srcEntityDTO, IEntityDTO iEntityDTO, boolean bAllFields) throws Throwable {
		Map<String, String> srcFieldMap = new HashMap<String, String>();
		for(java.util.Map.Entry<String, IPSDEMapField> entry : this.getDstPSDEMapFieldMap().entrySet()) {
			IPSDEMapField iPSDEMapField = entry.getValue();
			if(DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())) {
				if(ObjectUtils.isEmpty(iPSDEMapField.getSrcFieldName()) || ObjectUtils.isEmpty(iPSDEMapField.getDstFieldName())) {
					continue;
				}
				
				srcFieldMap.put(iPSDEMapField.getSrcFieldName().toUpperCase(), iPSDEMapField.getDstFieldName().toUpperCase());
				if(!srcEntityDTO.contains(iPSDEMapField.getSrcFieldName())){
					continue;
				}
				Object value = srcEntityDTO.get(iPSDEMapField.getSrcFieldName());
				if(value != null) {
					IPSSysTranslator iPSSysTranslator = iPSDEMapField.getPSSysTranslator();
					if(iPSSysTranslator != null) {
						value = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator).translate(value, true);
					}
				}
				
				iEntityDTO.set(iPSDEMapField.getDstFieldName(), value);
				continue;
			}
			
			if(DEMapFieldMapTypes.VALUE.equals(iPSDEMapField.getMapType())) {
				iEntityDTO.set(iPSDEMapField.getDstFieldName(), iPSDEMapField.getRawValue());
				continue;
			}
			
			if(DEMapFieldMapTypes.EXPRESSION.equals(iPSDEMapField.getMapType())) {
				//获取表达式
				if(!StringUtils.hasLength(iPSDEMapField.getExpression())) {
					throw new Exception(String.format("未定义属性映射[%1$s]表达式", iPSDEMapField.getName()));
				}
				
				IDEScriptLogicRuntime iDEScriptLogicRuntime = this.getDataEntityRuntime().getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, iPSDEMapField.getExpression());
				iEntityDTO.set(iPSDEMapField.getDstFieldName(), iDEScriptLogicRuntime.execute(new Object[] {srcEntityDTO}));
				continue;
			}
		}
	
		if(bAllFields && srcEntityDTO.getDEMethodDTORuntime()!=null) {
			Map<String, Object> map = srcEntityDTO.any();
			if(!ObjectUtils.isEmpty(map)) {
				for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
					IPSDEMethodDTOField iPSDEMethodDTOField = srcEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOField(entry.getKey(), true);
					if(iPSDEMethodDTOField == null || iPSDEMethodDTOField.getPSDEField() == null) {
						//判断指定目标属性是否存在
						if(!iEntityDTO.contains(entry.getKey())) {
							iEntityDTO.set(entry.getKey(), entry.getValue());
						}
					}
					else {
						//
						if(!srcFieldMap.containsKey(iPSDEMethodDTOField.getPSDEField().getName().toUpperCase())) {
							if(!iEntityDTO.contains(entry.getKey())) {
								iEntityDTO.set(entry.getKey(), entry.getValue());
							}
						}
					}
				}
			}
		}
	}
	

	@Override
	public IEntityDTO fromEntityDTO(IEntityDTO dstEntityDTO) {
		return this.fromEntityDTO(dstEntityDTO, null);
	}

	@Override
	public IEntityDTO fromEntityDTO(IEntityDTO dstEntityDTO, IEntityDTO iEntityDTO) {
		try {
			if(ObjectUtils.isEmpty(this.getSrcPSDEMapFieldMap())) {
				throw new Exception("未定义源实体属性映射模型");
			}
			if(iEntityDTO == null) {
				 iEntityDTO = this.getDataEntityRuntime().createEntity();
			}
//			for(java.util.Map.Entry<String, IPSDEMapField> entry : this.getSrcPSDEMapFieldMap().entrySet()) {
//				IPSDEMapField iPSDEMapField = entry.getValue();
//				if(DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())) {
//					if(!dstEntityDTO.contains(iPSDEMapField.getDstFieldName())){
//						continue;
//					}
//					Object value = dstEntityDTO.get(iPSDEMapField.getDstFieldName());
//					if(value != null) {
//						IPSSysTranslator iPSSysTranslator = iPSDEMapField.getPSSysTranslator();
//						if(iPSSysTranslator != null) {
//							value = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator).translate(value, false);
//						}
//					}
//					
//					iEntityDTO.set(iPSDEMapField.getSrcFieldName(), value);
//					continue;
//				}
//				
//				if(DEMapFieldMapTypes.VALUE_SRC.equals(iPSDEMapField.getMapType())) {
//					iEntityDTO.set(iPSDEMapField.getSrcFieldName(), iPSDEMapField.getRawValue());
//					continue;
//				}
//				
//				if(DEMapFieldMapTypes.EXPRESSION_SRC.equals(iPSDEMapField.getMapType())) {
//					//获取表达式
//					if(!StringUtils.hasLength(iPSDEMapField.getExpression())) {
//						throw new Exception(String.format("未定义属性映射[%1$s]表达式", iPSDEMapField.getName()));
//					}
//					
//					IDEScriptLogicRuntime iDEScriptLogicRuntime = this.getDstDataEntityRuntime().getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, iPSDEMapField.getExpression());
//					iEntityDTO.set(iPSDEMapField.getSrcFieldName(), iDEScriptLogicRuntime.execute(new Object[] {dstEntityDTO}));
//					continue;
//				}
//			}
		
			fillSrcEntityDTO(dstEntityDTO, iEntityDTO, isCopyDstEntityDTOAllFields());
			return iEntityDTO;
		}
		catch (Throwable ex) {
			log.debug(String.format("转化目标实体数据对象到当前实体数据对象发生异常，%1$s", ex.getMessage()));
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("转化目标实体数据对象到当前实体数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void fillSrcEntityDTO(IEntityDTO dstEntityDTO, IEntityDTO iEntityDTO, boolean bAllFields) throws Throwable {
		Map<String, String> dstFieldMap = new HashMap<String, String>();
		
		for(java.util.Map.Entry<String, IPSDEMapField> entry : this.getSrcPSDEMapFieldMap().entrySet()) {
			IPSDEMapField iPSDEMapField = entry.getValue();
			if(DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())) {
				
				if(ObjectUtils.isEmpty(iPSDEMapField.getSrcFieldName()) || ObjectUtils.isEmpty(iPSDEMapField.getDstFieldName())) {
					continue;
				}
				
				dstFieldMap.put(iPSDEMapField.getDstFieldName().toUpperCase(), iPSDEMapField.getSrcFieldName().toUpperCase());
				
				if(!dstEntityDTO.contains(iPSDEMapField.getDstFieldName())){
					continue;
				}
				Object value = dstEntityDTO.get(iPSDEMapField.getDstFieldName());
				if(value != null) {
					IPSSysTranslator iPSSysTranslator = iPSDEMapField.getPSSysTranslator();
					if(iPSSysTranslator != null) {
						value = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator).translate(value, false);
					}
				}
				
				iEntityDTO.set(iPSDEMapField.getSrcFieldName(), value);
				continue;
			}
			
			if(DEMapFieldMapTypes.VALUE_SRC.equals(iPSDEMapField.getMapType())) {
				iEntityDTO.set(iPSDEMapField.getSrcFieldName(), iPSDEMapField.getRawValue());
				continue;
			}
			
			if(DEMapFieldMapTypes.EXPRESSION_SRC.equals(iPSDEMapField.getMapType())) {
				//获取表达式
				if(!StringUtils.hasLength(iPSDEMapField.getExpression())) {
					throw new Exception(String.format("未定义属性映射[%1$s]表达式", iPSDEMapField.getName()));
				}
				
				IDEScriptLogicRuntime iDEScriptLogicRuntime = this.getDstDataEntityRuntime().getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, iPSDEMapField.getExpression());
				iEntityDTO.set(iPSDEMapField.getSrcFieldName(), iDEScriptLogicRuntime.execute(new Object[] {dstEntityDTO}));
				continue;
			}
		}
		
		if(bAllFields && dstEntityDTO.getDEMethodDTORuntime()!=null) {
			Map<String, Object> map = dstEntityDTO.any();
			if(!ObjectUtils.isEmpty(map)) {
				for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
					IPSDEMethodDTOField iPSDEMethodDTOField = dstEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOField(entry.getKey(), true);
					if(iPSDEMethodDTOField == null || iPSDEMethodDTOField.getPSDEField() == null) {
						//判断指定目标属性是否存在
						if(!iEntityDTO.contains(entry.getKey())) {
							iEntityDTO.set(entry.getKey(), entry.getValue());
						}
					}
					else {
						//
						if(!dstFieldMap.containsKey(iPSDEMethodDTOField.getPSDEField().getName().toUpperCase())) {
							if(!iEntityDTO.contains(entry.getKey())) {
								iEntityDTO.set(entry.getKey(), entry.getValue());
							}
						}
					}
				}
			}
		}
	}

	@Override
	public boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction) {
		return this.isEnableAction(strActionName, iPSDEAction, null);
	}
	
	@Override
	public boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, String strMode) {
		IPSDEMapAction iPSDEMapAction = getPSDEMapAction(strActionName, iPSDEAction);
		if(iPSDEMapAction!=null) {
			if(StringUtils.hasLength(strMode)) {
				if(StringUtils.hasLength(iPSDEMapAction.getMapMode())) {
					return strMode.equals(iPSDEMapAction.getMapMode());
				}
			}
			return true;
		}
		return false;
	}
	
	protected IPSDEMapAction getPSDEMapAction(String strActionName, IPSDEAction iPSDEAction) {
		if(ObjectUtils.isEmpty(this.psDEMapActionMap)) {
			return null;
		}
		if(iPSDEAction != null) {
			return this.psDEMapActionMap.get(iPSDEAction.getName());
		}
		return this.psDEMapActionMap.get(strActionName.toLowerCase());
	}
	

	@Override
	public boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet) {
		return this.isEnableDataSet(strDataSetName, iPSDEDataSet, null);
	}

	@Override
	public boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, String strMode) {
		IPSDEMapDataSet iPSDEMapDataSet = getPSDEMapDataSet(strDataSetName, iPSDEDataSet);
		if(iPSDEMapDataSet!=null) {
			if(StringUtils.hasLength(strMode)) {
				if(StringUtils.hasLength(iPSDEMapDataSet.getMapMode())) {
					return strMode.equals(iPSDEMapDataSet.getMapMode());
				}
			}
			return true;
		}
		return false;
	}
	
	
	protected IPSDEMapDataSet getPSDEMapDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet) {
		if(ObjectUtils.isEmpty(this.psDEMapDataSetMap)) {
			return null;
		}
		if(iPSDEDataSet != null) {
			return this.psDEMapDataSetMap.get(iPSDEDataSet.getName());
		}
		return this.psDEMapDataSetMap.get(strDataSetName.toLowerCase());
	}
	
	@Override
	public Page fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		IPSDEMapDataSet iPSDEMapDataSet = this.getPSDEMapDataSet(strDataSetName, iPSDEDataSet);
		if(iPSDEMapDataSet == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法获取指定数据集[%1$s]映射", (iPSDEDataSet != null)?iPSDEDataSet.getName():strDataSetName));
		}
		try {
			return this.onFetchDataSet(iPSDEMapDataSet, args, actionData);
		}
		catch (Throwable ex) {
			log.debug(String.format("获取映射实体结果集发生异常，%1$s", ex.getMessage()));
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取映射实体结果集发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Page onFetchDataSet(IPSDEMapDataSet iPSDEMapDataSet, Object[] args, Object actionData) throws Throwable{
		
		//进行搜索条件转化
		ISearchContextDTO iSearchContextDTO = null;
		if(args != null && args.length > 0 && args[0] instanceof ISearchContextDTO) {
			iSearchContextDTO = (ISearchContextDTO)args[0];
		}
		if(iSearchContextDTO == null) {
			throw new Exception(String.format("未指定搜索上下文对象"));
		}
		
		ISearchContextDTO dstSearchContextDTO = this.toSearchContextDTO(iSearchContextDTO);
		
		if(iPSDEMapDataSet.isEnableDQCond()) {
			ISearchCond dataSetSearchCond = this.toSearchCond(iPSDEMapDataSet.getSrcPSDEDataSetMust());
			if(dataSetSearchCond!=null) {
				dstSearchContextDTO.getSearchCondsIf().add(dataSetSearchCond);
			}
			//上下文转化
			IAppContext appContext = getAppContext();
			List<IPSDERBase> iPSDERBases = this.getDataEntityRuntime().getMasterPSDERs();
			if(!ObjectUtils.isEmpty(iPSDERBases)) {
				for(IPSDERBase iPSDERBase : iPSDERBases) {
					List<IPSDEMap> majorDEMaps = iPSDERBase.getMajorPSDataEntity().getAllPSDEMaps();
					String strMajorDEName = iPSDERBase.getMajorPSDataEntity().getName();
					if(appContext != null && (appContext.contains(strMajorDEName) || appContext.contains(strMajorDEName.toLowerCase()))) {
						if(!ObjectUtils.isEmpty(majorDEMaps)) {
							//匹配父实体映射写入上下文
							for(IPSDEMap majorDEMap : majorDEMaps) {
								IDEMapRuntime majorDEMapRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntity().getId()).getDEMapRuntime(majorDEMap.getCodeName(), true);
								if(majorDEMapRuntime == null) {
									continue;
								}
								appContext.set(majorDEMapRuntime.getDstDataEntityRuntime().getName(), appContext.get(strMajorDEName) != null ? appContext.get(strMajorDEName) : appContext.get(strMajorDEName.toLowerCase()));
							}
						}
					}
				}
			}
		}
		
		Object objRet = this.getDstDataEntityRuntime().fetchDataSet(iPSDEMapDataSet.getDstPSDEDataSetMust().getName(), iPSDEMapDataSet.getDstPSDEDataSetMust(), new Object[] {dstSearchContextDTO});
		//转化数据对象
		if(objRet instanceof Page) {
			
			IPSDEMethodDTO srcPSDEMethodDTO = null;
			if(iPSDEMapDataSet.getSrcPSDEDataSetMust().getPSDEDataSetReturn() != null){
				srcPSDEMethodDTO = iPSDEMapDataSet.getSrcPSDEDataSetMust().getPSDEDataSetReturn().getPSDEMethodDTO();
			}
			
			Page retPage = (Page)objRet;
			List retList = retPage.getContent();
			List<IEntityDTO> list = this.getDataEntityRuntime().createEntityList();
			if(!ObjectUtils.isEmpty(retList)) {
				for(Object item : retList) {
					if(!(item instanceof IEntityDTO)) {
						throw new Exception("无法识别的返回结果");
					}
					
					//建立返回数据对象
					IEntityDTO iEntityDTO = null;
					if(srcPSDEMethodDTO != null) {
						IDEMethodDTO iDEMethodDTO = this.getDataEntityRuntime().getDEMethodDTO(srcPSDEMethodDTO, null);
						if(iDEMethodDTO instanceof IEntityDTO) {
							iEntityDTO = (IEntityDTO)iDEMethodDTO;
						}
					}
					
					iEntityDTO = this.fromEntityDTO((IEntityDTO)item, iEntityDTO);
					list.add(iEntityDTO);
				}
			}
			
			return new PageImpl(list, retPage.getPageable(), retPage.getTotalElements());
		}
		
		throw new Exception("无法识别的返回结果");
	}

	protected IAppContext getAppContext() {
		if (ActionSessionManager.getCurrentSession() != null) {
			return ActionSessionManager.getCurrentSession().getAppContext();
		}
		else {
			return UserContext.getCurrentMust().getAppContext();
		}
	}

	@Override
	public ISearchContextDTO toSearchContextDTO(ISearchContextDTO iSearchContextDTO) {
	
		try {
			ISearchContextDTO dstContextDTO = this.getDstDataEntityRuntime().createSearchContext();
			
			//设置分页
			if(iSearchContextDTO.getPageable() != null) {
				dstContextDTO.setPageable(iSearchContextDTO.getPageable().getPageNumber(), iSearchContextDTO.getPageable().getPageSize(), iSearchContextDTO.getPageable().getOffset());
			}
			
			dstContextDTO.setCount(iSearchContextDTO.isCount());
			
			//设置排序
			if(iSearchContextDTO.getPageSort() != null && iSearchContextDTO.getPageSort() != Sort.unsorted()) {
				java.util.Iterator<Sort.Order> orders = iSearchContextDTO.getPageSort().iterator();
				if(orders != null) {
					while (orders.hasNext()) {
						Sort.Order order = orders.next();
						IPSDEMapField iPSDEMapField = this.getSrcPSDEMapField(order.getProperty());
						//if(iPSDEMapField == null) {
						if(iPSDEMapField == null || !DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())){
							log.warn(String.format("源属性[%1$s]未映射目标属性，忽略排序处理", order.getProperty()));
							//return null;
							continue;
						}
						
						if(order.isAscending()) {
							dstContextDTO.setPageSort(String.format("%1$s,asc", iPSDEMapField.getDstFieldName().toLowerCase()));
						}
						else {
							dstContextDTO.setPageSort(String.format("%1$s,desc", iPSDEMapField.getDstFieldName().toLowerCase()));
						}
						break;
					}
				}
			}
			
			//设置条件
			List<ISearchCond> searchConds = iSearchContextDTO.getSearchConds();
			if(!ObjectUtils.isEmpty(searchConds)) {
				for(ISearchCond iSearchCond : searchConds) {
					ISearchCond dstSearchCond = this.toSearchCond(iSearchCond);
					if(dstSearchCond != null) {
						dstContextDTO.getSearchCondsIf().add(dstSearchCond);
					}
				}
			}
			
			//设置上下文
			if(!ObjectUtils.isEmpty(iSearchContextDTO.any())) {
				for(java.util.Map.Entry<String, Object> entry : iSearchContextDTO.any().entrySet()) {
					dstContextDTO.set(entry.getKey(), entry.getValue());
				}
			}
			
			
			return dstContextDTO;
		}
		catch (Throwable ex) {
			log.debug(String.format("获取搜索上下文对象发生异常，%1$s", ex.getMessage()));
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取搜索上下文对象发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}
	
	 
	
	protected ISearchCond toSearchCond(ISearchCond iSearchCond) throws Throwable{
		
		String strType = iSearchCond.getCondType();
		if(ISearchCond.CONDTYPE_DEFIELD.equalsIgnoreCase(strType)) {
			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
			IPSDEMapField iPSDEMapField = this.getSrcPSDEMapField(iSearchFieldCond.getFieldName());
			//if(iPSDEMapField == null ){
			if(iPSDEMapField == null || !DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())){
				log.warn(String.format("源属性[%1$s]未映射目标属性，忽略过滤处理", iSearchFieldCond.getFieldName()));
				return null;
			}
			
			SearchFieldCond searchFieldCond = new SearchFieldCond();
			searchFieldCond.setCondOp(iSearchFieldCond.getCondOp());
			searchFieldCond.setDataType(iSearchFieldCond.getDataType());
			searchFieldCond.setFieldName(iPSDEMapField.getDstFieldName().toLowerCase());
			searchFieldCond.setName(iSearchFieldCond.getName());
			searchFieldCond.setParamMode(iSearchFieldCond.isParamMode());
			searchFieldCond.setValue(iSearchFieldCond.getValue());
			searchFieldCond.setValueFunc(iSearchFieldCond.getValueFunc());
			return searchFieldCond;
		}
		
		if(ISearchCond.CONDTYPE_GROUP.equalsIgnoreCase(strType)) {
			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)iSearchCond;
			List<ISearchCond> childSearchConds = iSearchGroupCond.getSearchConds();
			if(ObjectUtils.isEmpty(childSearchConds)) {
				return null;
			}
			
			SearchGroupCond searchGroupCond = new SearchGroupCond();
			searchGroupCond.setCondOp(iSearchGroupCond.getCondOp());
			searchGroupCond.setNotMode(iSearchGroupCond.isNotMode());
			
			for(ISearchCond childSearchCond : childSearchConds) {
				ISearchCond dstSearchCond = this.toSearchCond(childSearchCond);
				if(dstSearchCond == null) {
					continue;
				}
				searchGroupCond.getSearchCondsIf().add(dstSearchCond);
			}
			
			if(ObjectUtils.isEmpty(searchGroupCond.getSearchConds())) {
				return null;
			}
			return searchGroupCond;
		}
		
		if(ISearchCond.CONDTYPE_CUSTOM.equalsIgnoreCase(strType)) {
			ISearchCustomCond iSearchCustomCond = (ISearchCustomCond)iSearchCond;
			SearchCustomCond searchCustomCond = new SearchCustomCond();
			searchCustomCond.setCustomCond(iSearchCustomCond.getCustomCond());
			return searchCustomCond;
		}
		
		if(ISearchCond.CONDTYPE_PREDEFINED.equalsIgnoreCase(strType)) {
			
			ISearchPredefinedCond iSearchPredefinedCond = (ISearchPredefinedCond)iSearchCond;
			
			SearchPredefinedCond searchPredefinedCond = new SearchPredefinedCond();
			searchPredefinedCond.setPredefinedCond(iSearchPredefinedCond.getPredefinedCond());
			searchPredefinedCond.setPredefinedType(iSearchPredefinedCond.getPredefinedType());
			return searchPredefinedCond;
		}
		
		throw new Exception(String.format("无法识别的搜索条件类型[%1$s]", strType));
	}
	
	protected ISearchCond toSearchCond(IPSDEDataSet iPSDEDataSet) throws Throwable{
		
		java.util.List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if(ObjectUtils.isEmpty(psDEDataQueryList)) {
			return null;
		}
		
		if(psDEDataQueryList.size()==0) {
			return this.toSearchCond(psDEDataQueryList.get(0));
		}
		
		SearchGroupCond searchGroupCond = new SearchGroupCond();
		searchGroupCond.setCondOp(Conditions.OR);
		
		for(IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
			ISearchCond dstSearchCond = this.toSearchCond(iPSDEDataQuery);
			if(dstSearchCond == null) {
				continue;
			}
			searchGroupCond.getSearchCondsIf().add(dstSearchCond);
		}
		
		if(ObjectUtils.isEmpty(searchGroupCond.getSearchConds())) {
			return null;
		}
		return searchGroupCond;
	}
	
	
	protected ISearchCond toSearchCond(IPSDEDataQuery iPSDEDataQuery) throws Throwable{
		
		IPSDEDQGroupCondition iPSDEDQGroupCondition = iPSDEDataQuery.getPSDEDQMainMust().getPSDEDQGroupCondition();
		if(iPSDEDQGroupCondition == null) {
			return null;
		}
		
		return this.toSearchCond(iPSDEDQGroupCondition);
	}
	
	protected ISearchCond toSearchCond(IPSDEDQCondition iPSDEDQCondition) throws Throwable{
		
		String strType = iPSDEDQCondition.getCondType();
		if(CondType.SINGLE.value.equalsIgnoreCase(strType)) {
			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition)iPSDEDQCondition;
			IPSDEMapField iPSDEMapField = this.getSrcPSDEMapField(iPSDEDQFieldCondition.getFieldName());
			if(iPSDEMapField == null || !DEMapFieldMapTypes.FIELD.equals(iPSDEMapField.getMapType())){
				log.warn(String.format("源属性[%1$s]未映射目标属性，忽略过滤处理", iPSDEDQFieldCondition.getFieldName()));
				return null;
			}
			
			SearchFieldCond searchFieldCond = new SearchFieldCond();
			searchFieldCond.setCondOp(iPSDEDQFieldCondition.getCondOp());
//			searchFieldCond.setDataType(iPSDEDQFieldCondition.getDataType());
			searchFieldCond.setFieldName(iPSDEMapField.getDstFieldName().toLowerCase());
			searchFieldCond.setName(iPSDEDQFieldCondition.getName());
			//searchFieldCond.setParamMode(iSearchFieldCond.isParamMode());
			searchFieldCond.setParamMode(false);
			searchFieldCond.setValue(iPSDEDQFieldCondition.getCondValue());
			//searchFieldCond.setValueFunc(iSearchFieldCond.getValueFunc());
			return searchFieldCond;
		}
		
		if(CondType.GROUP.value.equalsIgnoreCase(strType)) {
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition)iPSDEDQCondition;
			List<IPSDEDQCondition> childPSDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if(ObjectUtils.isEmpty(childPSDEDQConditions)) {
				return null;
			}
			
			SearchGroupCond searchGroupCond = new SearchGroupCond();
			searchGroupCond.setCondOp(iPSDEDQGroupCondition.getCondOp());
			searchGroupCond.setNotMode(iPSDEDQGroupCondition.isNotMode());
			
			for(IPSDEDQCondition childPSDEDQCondition : childPSDEDQConditions) {
				ISearchCond dstSearchCond = this.toSearchCond(childPSDEDQCondition);
				if(dstSearchCond == null) {
					continue;
				}
				searchGroupCond.getSearchCondsIf().add(dstSearchCond);
			}
			
			if(ObjectUtils.isEmpty(searchGroupCond.getSearchConds())) {
				return null;
			}
			return searchGroupCond;
		}
		
		if(CondType.CUSTOM.value.equalsIgnoreCase(strType)) {
			IPSDEDQCustomCondition iPSDEDQCustomCondition = (IPSDEDQCustomCondition)iPSDEDQCondition;
			SearchCustomCond searchCustomCond = new SearchCustomCond();
			searchCustomCond.setCustomCond(iPSDEDQCustomCondition.getCondition());
			return searchCustomCond;
		}
		
//		if(CondType.PREDEFINED.value.equalsIgnoreCase(strType)) {
//			
//			IPSDEDQPDCondition iPSDEDQPDCondition = (IPSDEDQPDCondition)iPSDEDQCondition;
//			
//			SearchPredefinedCond searchPredefinedCond = new SearchPredefinedCond();
//			searchPredefinedCond.setPredefinedCond(iPSDEDQPDCondition.get.getPredefinedCond());
//			searchPredefinedCond.setPredefinedType(iSearchPredefinedCond.getPredefinedType());
//			return searchPredefinedCond;
//		}
		
		throw new Exception(String.format("无法识别的搜索条件类型[%1$s]", strType));
	}

	
	protected IPSDEMapField getDstPSDEMapField(String strFieldName) {
		if(!ObjectUtils.isEmpty(this.getDstPSDEMapFieldMap())) {
			return this.getDstPSDEMapFieldMap().get(strFieldName.toLowerCase());
		}
		return null;
	}

	
	protected IPSDEMapField getSrcPSDEMapField(String strFieldName) {
		if(!ObjectUtils.isEmpty(this.getSrcPSDEMapFieldMap())) {
			return this.getSrcPSDEMapFieldMap().get(strFieldName.toLowerCase());
		}
		return null;
	}
	
	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		IPSDEMapAction iPSDEMapAction = this.getPSDEMapAction(strActionName, iPSDEAction);
		if(iPSDEMapAction == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法获取指定行为[%1$s]映射", (iPSDEAction != null)?iPSDEAction.getName():strActionName));
		}
		try {
			return this.onExecuteAction(iPSDEMapAction, args, actionData);
		}
		catch (Throwable ex) {
			log.debug(String.format("执行映射实体行为发生异常，%1$s", ex.getMessage()));
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("执行映射实体行为发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onExecuteAction(IPSDEMapAction iPSDEMapAction, Object[] args, Object actionData) throws Throwable{
		
		if(args == null || args.length == 0) {
			throw new Exception(String.format("传入参数无效"));
		}
		
		Object[] dstArgs = new Object[args.length];
		for(int i = 0; i<args.length; i++) {
			dstArgs[i] = args[i];
		}
		
		IPSDEMethodDTO dstPSDEMethodDTO = iPSDEMapAction.getDstPSDEActionMust().getPSDEActionInputMust().getPSDEMethodDTO();
		
		
		if(args[0] instanceof IEntityDTO) {
			if(dstPSDEMethodDTO == null) {
				throw new Exception(String.format("目标行为[%1$s]输入参数与当前行为[%2$s]模式不一致", iPSDEMapAction.getDstPSDEActionMust().getName(), iPSDEMapAction.getSrcPSDEActionMust().getName()));
			}
			
			IEntityDTO dstEntityDTO = (IEntityDTO)this.getDstDataEntityRuntime().getDEMethodDTO(dstPSDEMethodDTO, null);
			dstEntityDTO = toEntityDTO((IEntityDTO)args[0], dstEntityDTO);
			dstArgs[0] = dstEntityDTO;
		}
		else
			if(args[0] instanceof List) {
				//列表参数
				List srcList = (List)args[0];
				List dstList = new ArrayList();
				for(Object objItem : srcList) {
					if(objItem instanceof IEntityDTO) {
						if(dstPSDEMethodDTO == null) {
							throw new Exception(String.format("目标行为[%1$s]输入参数与当前行为[%2$s]模式不一致", iPSDEMapAction.getDstPSDEActionMust().getName(), iPSDEMapAction.getSrcPSDEActionMust().getName()));
						}
						
						IEntityDTO dstEntityDTO = (IEntityDTO)this.getDstDataEntityRuntime().getDEMethodDTO(dstPSDEMethodDTO, null);
						dstEntityDTO = toEntityDTO((IEntityDTO)objItem, dstEntityDTO);
						dstList.add(dstEntityDTO);
					}
					else {
						dstList.add(objItem);
					}
				}
				dstArgs[0] = dstList;
			}
		
		
		Object objRet = this.getDstDataEntityRuntime().executeAction(iPSDEMapAction.getDstPSDEActionMust().getName(), iPSDEMapAction.getDstPSDEActionMust(), dstArgs);
		if(objRet != null) {
			if(objRet instanceof IEntityDTO) {
				if(iPSDEMapAction.getSrcPSDEActionMust().getPSDEActionInputMust().isOutput()) {
					if(args[0] instanceof IEntityDTO) {
						IEntityDTO srcEntityDTO = (IEntityDTO)args[0];
						srcEntityDTO.resetAll();
						this.fromEntityDTO((IEntityDTO)objRet, srcEntityDTO);
					}
					else {
						throw new Exception(String.format("传入参数[0]类型不正确"));
					}
				}
				else {
					IPSDEMethodDTO retPSDEMethodDTO = iPSDEMapAction.getSrcPSDEActionMust().getPSDEActionReturnMust().getPSDEMethodDTO();
					if(retPSDEMethodDTO != null) {
						IEntityDTO srcEntityDTO = (IEntityDTO)this.getDataEntityRuntime().getDEMethodDTO(retPSDEMethodDTO, null);
						this.fromEntityDTO((IEntityDTO)objRet, srcEntityDTO);
						return srcEntityDTO;
					}
				}
			}
		}
		else {
			if(iPSDEMapAction.getDstPSDEActionMust().getPSDEActionInputMust().isOutput()) {
				if(dstArgs[0] instanceof IEntityDTO) {
					if(iPSDEMapAction.getSrcPSDEActionMust().getPSDEActionInputMust().isOutput()) {
						if(args[0] instanceof IEntityDTO) {
							IEntityDTO srcEntityDTO = (IEntityDTO)args[0];
							srcEntityDTO.resetAll();
							this.fromEntityDTO((IEntityDTO)dstArgs[0], srcEntityDTO);
						}
						else {
							throw new Exception(String.format("传入参数[0]类型不正确"));
						}
					}
					else {
						IPSDEMethodDTO retPSDEMethodDTO = iPSDEMapAction.getSrcPSDEActionMust().getPSDEActionReturnMust().getPSDEMethodDTO();
						if(retPSDEMethodDTO != null) {
							IEntityDTO srcEntityDTO = (IEntityDTO)this.getDataEntityRuntime().getDEMethodDTO(retPSDEMethodDTO, null);
							this.fromEntityDTO((IEntityDTO)dstArgs[0], srcEntityDTO);
							return srcEntityDTO;
						}
					}
				}
				
			}
		}
		return objRet;
	}
	
}
