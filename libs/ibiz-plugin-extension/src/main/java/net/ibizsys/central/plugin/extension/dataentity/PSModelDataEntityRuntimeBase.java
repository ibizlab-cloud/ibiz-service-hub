package net.ibizsys.central.plugin.extension.dataentity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.plugin.extension.dataentity.action.PSModelDEActionRuntime;
import net.ibizsys.central.plugin.extension.dataentity.ds.PSModelDEDataSetRuntime;
import net.ibizsys.central.plugin.extension.dataentity.security.PSBICubeModelDataEntityAccessManager;
import net.ibizsys.central.plugin.extension.dataentity.security.PSBIModelDataEntityAccessManager;
import net.ibizsys.central.plugin.extension.dataentity.security.PSDEModelDataEntityAccessManager;
import net.ibizsys.central.plugin.extension.dataentity.security.PSModelDataEntityAccessManager;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModel;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class PSModelDataEntityRuntimeBase extends DataEntityRuntime implements IPSModelDataEntityRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelDataEntityRuntimeBase.class);
	private String strPSModelTag = null;
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSDataEntity iPSDataEntity, Object data) throws Exception {
		strPSModelTag = iPSDataEntity.getDETag();
		if(!StringUtils.hasLength(strPSModelTag)) {
			strPSModelTag = iPSDataEntity.getName();
		}
		super.init(iSystemRuntimeContext, iPSDataEntity, data);
	}
	
	@Override
	protected void onInit() throws Exception {
//		List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
//		if (psDEFieldList != null) {
//			for (IPSDEField iPSDEField : psDEFieldList) {
//				
//			}
//		}
		super.onInit();
	}
	
	
	@Override
	protected IDEDataSetRuntime onCreateDEDataSetRuntime(IPSDEDataSet iPSDEDataSet) {
		IDEDataSetRuntime iDEDataSetRuntime = super.onCreateDEDataSetRuntime(iPSDEDataSet);
		return (iDEDataSetRuntime == null)?new PSModelDEDataSetRuntime():iDEDataSetRuntime;
	}
	
	@Override
	protected IDEActionRuntime onCreateDEActionRuntime(IPSDEAction iPSDEAction) {
		IDEActionRuntime iDEActionRuntime = super.onCreateDEActionRuntime(iPSDEAction);
		return (iDEActionRuntime == null)?new PSModelDEActionRuntime():iDEActionRuntime;
	}
	
	@Override
	protected IDataEntityAccessManager createDataEntityAccessManager() {
		switch(this.getName()) {
		case PSModels.PSDEFORM:
		case PSModels.PSDEFIELD:
		case PSModels.PSDELOGIC:
		case "PSDEMSLOGIC":
		case PSModels.PSDENOTIFY:
			return new PSDEModelDataEntityAccessManager();
		case PSModels.PSSYSBISCHEME:
		case PSModels.PSSYSBIREPORT:
		case PSModels.PSSYSBIREPORTITEM:
		case PSModels.PSSYSBICUBE:
		case PSModels.PSSYSBIDIMENSION:
			return new PSBIModelDataEntityAccessManager();			
		case PSModels.PSSYSBICUBEDIMENSION:
		case PSModels.PSSYSBICUBELEVEL:
		case PSModels.PSSYSBICUBEMEASURE:
			return new PSBICubeModelDataEntityAccessManager();
		default:
			return new PSModelDataEntityAccessManager();
		}
	}
	
	@Override
	public String getPSModelTag() {
		return this.strPSModelTag;
	}


	@Override
	public IPSModelFilter toPSModelFilter(ISearchContextDTO iSearchContext) {
		Assert.notNull(iSearchContext, "传入搜索上下文对象无效");
		try {
			return fillPSModelFilter(null, iSearchContext);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getDataEntityRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this, String.format("转换PSModel过滤器发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected IPSModelFilter fillPSModelFilter(IPSModelFilter iPSModelFilter, ISearchContextDTO iSearchContext) throws Throwable {
	
		Map<String, Object> queryMap = new LinkedHashMap<String, Object>();
//		if(iSearchContext.any()!=null) {
//			queryMap.putAll(iSearchContext.any());
//			
//			List<IPSDEField> fields = this.getPSDataEntity().getAllPSDEFields();
//			if(!ObjectUtils.isEmpty(fields)) {
//				for(IPSDEField iPSDEField : fields) {
//					String strFieldTag = iPSDEField.getFieldTag();
//					if(!StringUtils.hasLength(strFieldTag)) {
//						strFieldTag = iPSDEField.getName();
//					}
//					
//					String strReplace = String.format("_%1$s_", iPSDEField.getName().toLowerCase());
//					String strOrgin = String.format("_%1$s_", strFieldTag.toLowerCase());
//					
//					for(java.util.Map.Entry<String, Object> entry : iSearchContext.any().entrySet()){
//						
//						if(entry.getKey().indexOf(strReplace)==-1) {
//							continue;
//						}
//						
//						queryMap.put(entry.getKey().replace(strReplace, strOrgin), entry.getValue());
//					}
//				}
//			}
//		}
		
		List<ISearchCond> searchCondList = iSearchContext.getSearchConds();
		if(!ObjectUtils.isEmpty(searchCondList)) {
			fillSearchCondsQueryMap(queryMap, iSearchContext, searchCondList);
			for(ISearchCond iSearchCond : searchCondList) {
				if(iSearchCond instanceof ISearchGroupCond) {
					
					ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)iSearchCond;
					if(ISearchGroupCond.CAT_FILTER.equals(iSearchGroupCond.getCat())) {
						fillSearchCondsQueryMap(queryMap, iSearchContext, iSearchGroupCond.getSearchConds());
					}
					
					continue;
				}
			}
		}
		
		if(StringUtils.hasLength(iSearchContext.getQuery())) {
			queryMap.put("query", iSearchContext.getQuery());
		}
		
		if(iSearchContext.getPageable()!=null) {
			queryMap.put("size", iSearchContext.getPageable().getPageSize());
			queryMap.put("page", iSearchContext.getPageable().getPageNumber());
		}
		
		if(iSearchContext.getPageSort()!=null && iSearchContext.getPageSort() != Sort.unsorted()) {
			java.util.Iterator<Sort.Order> orders = iSearchContext.getPageSort().iterator();
			if(orders != null) {
				while (orders.hasNext()) {
					Sort.Order order = orders.next();
					
					IPSDEField orderPSDEField = this.getPSDEField(order.getProperty(), true);
					if(orderPSDEField == null) {
						continue;
					}
					String strRealFieldName = orderPSDEField.getFieldTag();
					if(!StringUtils.hasLength(strRealFieldName)) {
						strRealFieldName = orderPSDEField.getName();
					}
					
					if(order.isAscending()) {
						queryMap.put("sort", String.format("%1$s,asc", strRealFieldName.toUpperCase()));
					}
					else {
						queryMap.put("sort", String.format("%1$s,desc", strRealFieldName.toUpperCase()));
					}
					break;
				}
			}
		}
		
		if(iPSModelFilter == null) {
			iPSModelFilter = createPSModelFilter();
		}
		iPSModelFilter.putAll(queryMap);
		return iPSModelFilter;
	}

	protected void fillSearchCondsQueryMap(Map<String, Object> queryMap, ISearchContextDTO iSearchContext, List<ISearchCond> searchCondList) {
		
		if(ObjectUtils.isEmpty(searchCondList)) {
			return;
		}
		
		for(ISearchCond iSearchCond : searchCondList) {
			if(iSearchCond instanceof ISearchFieldCond) {
				ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
				Object value = iSearchFieldCond.getValue();
				if(ObjectUtils.isEmpty(value)) {
					continue;
				}
				if(iSearchFieldCond.isParamMode()) {
					value = iSearchContext.get(value.toString());
				}
				
				String strCondOp = iSearchFieldCond.getCondOp();
				if(StringUtils.hasLength(iSearchFieldCond.getValueFunc())) {
					
				}
				else {
					
					IPSDEField iPSDEField = this.getPSDEField(iSearchFieldCond.getFieldName(), true);
					if(iPSDEField == null) {
						continue;
					}
					
					String strRealFieldName = iPSDEField.getFieldTag();
					if(!StringUtils.hasLength(strRealFieldName)) {
						strRealFieldName = iPSDEField.getName();
					}
					
					String strParam = String.format("n_%1$s_%2$s", strRealFieldName, strCondOp).toLowerCase();
					if(!queryMap.containsKey(strParam)) {
						queryMap.put(strParam, value);
					}
				}
				continue;
			}
			
		}
	}

	@Override
	public IPSModel toPSModel(IEntityDTO iEntity) {
		
		Assert.notNull(iEntity, "传入数据对象无效");
		try {
			return fillPSModel(null, iEntity);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getDataEntityRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this, String.format("转化数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}


	@Override
	public IEntityDTO fromPSModel(IPSModel iPSModel) {
		Assert.notNull(iPSModel, "传入模型数据对象无效");
		try {
			return fillEntity(null, iPSModel);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getDataEntityRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this, String.format("转化模型数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IEntityDTO fillEntity(IEntityDTO iEntity, IPSModel iPSModel) throws Throwable {

		if(iEntity == null) {
			iEntity = this.createEntity();
		}
		
		Map<String, Object> data = JsonUtils.asMap(iPSModel);
		if(data!=null) {
			Map<String, Object> real = new LinkedHashMap<String, Object>();
			//需要去除多余属性
			for(java.util.Map.Entry<String, ?> entry : data.entrySet()) {
				if(entry.getKey().indexOf("dirtyflag") != -1) {
					continue;
				}
				real.put(entry.getKey(), entry.getValue());
			}
			
			
			List<IPSDEField> fields = this.getPSDataEntity().getAllPSDEFields();
			if(!ObjectUtils.isEmpty(fields)) {
				for(IPSDEField iPSDEField : fields) {
					String strFieldTag = iPSDEField.getFieldTag();
					if(!StringUtils.hasLength(strFieldTag)) {
						strFieldTag = iPSDEField.getName();
					}
					strFieldTag = strFieldTag.toLowerCase();
					if(real.containsKey(strFieldTag)) {
						Object value = real.remove(strFieldTag);
						iEntity.set(iPSDEField.getName(), value);
					}							
				}
			}
			
			for(java.util.Map.Entry<String, ?> entry : real.entrySet()) {
				iEntity.set(entry.getKey(), entry.getValue());
			}
			
			if(!("PSSYSTEM".equalsIgnoreCase(this.getPSDataEntity().getName()))) {
				iEntity.reset("pssystemid");
				iEntity.reset("pssystemname");
			}
		}
		return iEntity;
	}

	protected IPSModel fillPSModel(IPSModel iPSModel, IEntityDTO iEntity) throws Throwable {

		if(iPSModel == null) {
			iPSModel = this.createPSModel();
		}
		
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		iEntity.copyTo(data, false);
		
		Map<String, Object> real = new LinkedHashMap<String, Object>();
		
		List<IPSDEField> fields = this.getPSDataEntity().getAllPSDEFields();
		if(!ObjectUtils.isEmpty(fields)) {
			for(IPSDEField iPSDEField : fields) {
				
				if(!data.containsKey(iPSDEField.getLowerCaseName())) {
					continue;
				}
				
				Object value = data.remove(iPSDEField.getLowerCaseName());
				
				
				String strFieldTag = iPSDEField.getFieldTag();
				if(!StringUtils.hasLength(strFieldTag)) {
					strFieldTag = iPSDEField.getName();
				}
				strFieldTag = strFieldTag.toLowerCase();
				
				if(!real.containsKey(strFieldTag)) {
					real.put(strFieldTag, value);
				}							
			}
		}
		
		real.putAll(data);
		iPSModel.putAll(real);
		return iPSModel;
	}
	
//	@Override
//	public Page<? extends IEntity> fromPSModelPage(Page<? extends IPSModel> page) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	protected IPSModel createPSModel() {
		return new PSModel();
	}
	
	
	protected IPSModelFilter createPSModelFilter() {
		return new PSModelFilter();
	}
	
	@Override
	public IEntityDTO getSimpleEntity(Object objKey) {
		if(objKey instanceof IEntityDTO) {
			return (IEntityDTO)objKey;
		}
		
		try {
			return this.get(objKey);
		} catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				throw (DataEntityRuntimeException)ex;
			}
			throw new DataEntityRuntimeException(this, String.format("获取简单数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	public void removeByForeignKey(IPSDEField iPSDEField, Object objKey, IPSDERBase iPSDERBase) {
		//super.removeByForeignKey(iPSDEField, objKey, iPSDERBase);
	}
	
	@Override
	public void resetByForeignKey(IPSDEField iPSDEField, Object objKey, IPSDERBase iPSDERBase) {
		//super.resetByForeignKey(iPSDEField, objKey, iPSDERBase);
	}
	
	
}
