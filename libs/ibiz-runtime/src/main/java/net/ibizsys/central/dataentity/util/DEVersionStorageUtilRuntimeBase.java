package net.ibizsys.central.dataentity.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.PSModelEnums.SortDir;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.SearchFieldCond;

public abstract class DEVersionStorageUtilRuntimeBase extends DEUtilRuntimeBase implements IDEVersionStorageUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEVersionStorageUtilRuntimeBase.class);

	private IDataEntityRuntime versionDataEntityRuntime = null;
	//private Map<String, IPSDEField> versionDataPSDEFieldMap = null;
	private IPSDEField versionParentTypePSDEField = null;
	private IPSDEField versionParentIdPSDEField = null;
	private IPSDEField versionParentVersionIdPSDEField = null;
	private IPSDEField versionFilterPSDEField = null;
	private IPSDEField versionOwnerTypePSDEField = null;
	private IPSDEField versionOwnerIdPSDEField = null;
	private IPSDEField versionDataPSDEField = null;

	@Override
	protected void onInit() throws Exception {

		if (this.getVersionDataEntityRuntime(true) == null) {
			this.prepareVersionDataEntityRuntime();
			this.getVersionDataEntityRuntime(false);
		}

		super.onInit();
	}


	protected void prepareVersionDataEntityRuntime() throws Exception {
		IPSDataEntity utilPSDataEntity = this.getPSDEUtil().getUtilPSDE();
		if (utilPSDataEntity == null) {
			throw new Exception(String.format("未指定版本数据存储实体"));
		}

		IDataEntityRuntime versionDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(utilPSDataEntity.getId());
		this.setVersionDataEntityRuntime(versionDataEntityRuntime);

		this.setVersionParentIdPSDEField(versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false));
		this.setVersionParentVersionIdPSDEField(versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTVERSIONID.value, false));
		this.setVersionParentTypePSDEField(versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, true));
		this.setVersionDataPSDEField(versionDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_DATA, false));
		this.setVersionFilterPSDEField(versionDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_FILTER, false));
		this.setVersionOwnerTypePSDEField(versionDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_OWNER_TYPE, true));
		this.setVersionOwnerIdPSDEField(versionDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_OWNER_ID, true));
	}



	@Override
	public IDataEntityRuntime getVersionDataEntityRuntime() {
		try {
			return this.getVersionDataEntityRuntime(false);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}

	protected IPSDEField getVersionParentTypePSDEField() {
		return versionParentTypePSDEField;
	}


	protected void setVersionParentTypePSDEField(IPSDEField versionParentTypePSDEField) {
		this.versionParentTypePSDEField = versionParentTypePSDEField;
	}


	protected IPSDEField getVersionParentIdPSDEField() {
		return versionParentIdPSDEField;
	}


	protected void setVersionParentIdPSDEField(IPSDEField versionParentIdPSDEField) {
		this.versionParentIdPSDEField = versionParentIdPSDEField;
	}


	protected IPSDEField getVersionParentVersionIdPSDEField() {
		return versionParentVersionIdPSDEField;
	}


	protected void setVersionParentVersionIdPSDEField(IPSDEField versionParentVersionIdPSDEField) {
		this.versionParentVersionIdPSDEField = versionParentVersionIdPSDEField;
	}


	protected IPSDEField getVersionFilterPSDEField() {
		return versionFilterPSDEField;
	}


	protected void setVersionFilterPSDEField(IPSDEField versionFilterPSDEField) {
		this.versionFilterPSDEField = versionFilterPSDEField;
	}


	protected IPSDEField getVersionOwnerTypePSDEField() {
		return versionOwnerTypePSDEField;
	}


	protected void setVersionOwnerTypePSDEField(IPSDEField versionOwnerTypePSDEField) {
		this.versionOwnerTypePSDEField = versionOwnerTypePSDEField;
	}


	protected IPSDEField getVersionOwnerIdPSDEField() {
		return versionOwnerIdPSDEField;
	}


	protected void setVersionOwnerIdPSDEField(IPSDEField versionOwnerIdPSDEField) {
		this.versionOwnerIdPSDEField = versionOwnerIdPSDEField;
	}


	protected IPSDEField getVersionDataPSDEField() {
		return versionDataPSDEField;
	}


	protected void setVersionDataPSDEField(IPSDEField versionDataPSDEField) {
		this.versionDataPSDEField = versionDataPSDEField;
	}


	protected IDataEntityRuntime getVersionDataEntityRuntime(boolean tryMode) throws Exception {
		if (this.versionDataEntityRuntime != null || tryMode) {
			return this.versionDataEntityRuntime;
		}
		throw new Exception(String.format("版本数据实体运行时对象无效"));
	}

	protected void setVersionDataEntityRuntime(IDataEntityRuntime versionDataEntityRuntime) {
		this.versionDataEntityRuntime = versionDataEntityRuntime;
	}

	@Override
	public boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) {
		if(args!=null && args.length >= 3 && ACTION_ARG_VERSIONID.equals(args[1])) {
			try {
				return !this.isCurrentVersionId(args[2]);
			} catch (Throwable ex) {
				log.error(String.format("判断传入版本是否为当前版本发生异常，%1$s", ex.getMessage()), ex);
				return false;
			}
		}
		return false;
	}


	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		Assert.notNull(args, "未传入调用参数");
		try {
			if(args!=null && args.length >= 3 && ACTION_ARG_VERSIONID.equals(args[1])) {
				return onExecuteAction(strActionName, iPSDEAction, args, actionData);
			}
			throw new Exception("调用参数格式无效");
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("执行行为发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onExecuteAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final String strRealActionName = iPSDEAction!=null?iPSDEAction.getName():strActionName;
		if(DEActions.GET.equalsIgnoreCase(strRealActionName)) {
			return this.get(args[0], args[2]);
		}

		throw new Exception(String.format("未支持的行为[%1$s]", strRealActionName));
	}



	@Override
	public IEntityBase get(Object key, Object objVersionId) throws Throwable {
		try {
			return this.onGet(key, objVersionId);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取版本数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IEntityBase onGet(Object key, Object objVersionId) throws Throwable {
		IAppContext iAppContext = ActionSessionManager.getAppContextMust();
		IPSDERBase iPSDERBase = getVersionPSDERBase(iAppContext, false);
		Object parentId = ActionSessionManager.getAppContextMust().get(iPSDERBase.getMajorPSDataEntityMust().getName());

		ISearchContextDTO iSearchContextDTO = this.getVersionDataEntityRuntime().createSearchContext();
		iSearchContextDTO.count(false);
		iSearchContextDTO.eq(this.getVersionParentVersionIdPSDEField().getLowerCaseName(), objVersionId);
		iSearchContextDTO.eq(this.getVersionParentIdPSDEField().getLowerCaseName(), parentId);
		if(this.getVersionParentTypePSDEField()!=null) {
			iSearchContextDTO.eq(this.getVersionParentTypePSDEField().getLowerCaseName(), iPSDERBase.getMajorPSDataEntityMust().getName());
		}
		if(this.getVersionOwnerTypePSDEField()!=null) {
			iSearchContextDTO.eq(this.getVersionOwnerTypePSDEField().getLowerCaseName(), this.getDataEntityRuntime().getName());
		}
		if(this.getVersionOwnerIdPSDEField()!=null) {
			iSearchContextDTO.eq(this.getVersionOwnerIdPSDEField().getLowerCaseName(), key);
			iSearchContextDTO.limit(1);
		}
		else {
			iSearchContextDTO.all();
		}

		Object ret = this.getVersionDataEntityRuntime().fetchDataSet(null, this.getVersionDataEntityRuntime().getDefaultPSDEDataSet(), new Object[] {iSearchContextDTO});
		if(!(ret instanceof Page)) {
			throw new Exception("返回结果不正确");
		}
		Page page = (Page)ret;
		if(!ObjectUtils.isEmpty(page.getContent())) {
			for(Object item : page.getContent()) {
				IEntityDTO iEntityDTO = (IEntityDTO)this.getDataEntityRuntime().deserializeEntity(((IEntityDTO)item).get(this.getVersionDataPSDEField().getLowerCaseName()));
				if(key.equals(iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()))) {
					return iEntityDTO;
				}
			}
		}

		throw new Exception("指定数据不存在");
	}


	@Override
	public boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) {
		if(args!=null && args.length >= 3 && ACTION_ARG_VERSIONID.equals(args[1])) {
			//进一步判断传入版本是否为当前版本
			try {
				return !this.isCurrentVersionId(args[2]);
			} catch (Throwable ex) {
				log.error(String.format("判断传入版本是否为当前版本发生异常，%1$s", ex.getMessage()), ex);
				return false;
			}
		}
		return false;
	}

	@Override
	public Page fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		Assert.notNull(args, "未传入调用参数");
		try {
			if(args!=null && args.length >= 3 && ACTION_ARG_VERSIONID.equals(args[1])) {
				return onFetchDataSet(strDataSetName, iPSDEDataSet, args, actionData);
			}
			throw new Exception("调用参数格式无效");
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取数据集发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Page onFetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		//获取当前上下文
		ISearchContextDTO realSearchContextDTO = (ISearchContextDTO) args[0];
		Object versionId = args[2];

		IAppContext iAppContext = ActionSessionManager.getAppContextMust();
		IPSDERBase iPSDERBase = getVersionPSDERBase(iAppContext, false);
		Object parentId = ActionSessionManager.getAppContextMust().get(iPSDERBase.getMajorPSDataEntityMust().getName());

		ISearchContextDTO iSearchContextDTO = this.getVersionDataEntityRuntime().createSearchContext();
		if(realSearchContextDTO.getPageable()!=null) {
			iSearchContextDTO.setPageable(realSearchContextDTO.getPageable().getPageNumber(), realSearchContextDTO.getPageable().getPageSize(), 0);
		}

		iSearchContextDTO.eq(this.getVersionParentVersionIdPSDEField().getLowerCaseName(), versionId);
		iSearchContextDTO.eq(this.getVersionParentIdPSDEField().getLowerCaseName(), parentId);
		if(this.getVersionParentTypePSDEField()!=null) {
			iSearchContextDTO.eq(this.getVersionParentTypePSDEField().getLowerCaseName(), iPSDERBase.getMajorPSDataEntityMust().getName());
		}
		if(this.getVersionOwnerTypePSDEField()!=null) {
			iSearchContextDTO.eq(this.getVersionOwnerTypePSDEField().getLowerCaseName(), this.getDataEntityRuntime().getName());
		}


		Object ret = this.getVersionDataEntityRuntime().fetchDataSet(null, this.getVersionDataEntityRuntime().getDefaultPSDEDataSet(), new Object[] {iSearchContextDTO});
		if(!(ret instanceof Page)) {
			throw new Exception("返回结果不正确");
		}
		Page page = (Page)ret;
		//IPSDEMethodDTO iPSDEMethodDTO = (iPSDEDataSet==null)?this.getDataEntityRuntime().getDefaultPSDEMethodDTO() : iPSDEDataSet.getPSDEDataSetReturnMust().getPSDEMethodDTOMust();
		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		if(!ObjectUtils.isEmpty(page.getContent())) {
			for(Object item : page.getContent()) {
				IEntityDTO iEntityDTO = (IEntityDTO)this.getDataEntityRuntime().deserializeEntity(((IEntityDTO)item).get(this.getVersionDataPSDEField().getLowerCaseName()));
				entityDTOList.add(iEntityDTO);
			}
		}

		List<IEntityDTO> entityDTOList2 = this.filterEntityDTOList(entityDTOList, iPSDEDataSet, realSearchContextDTO);

		return new PageImpl<IEntityDTO>(entityDTOList2, realSearchContextDTO.getPageable(), entityDTOList2.size());
	}

	protected List<IEntityDTO> filterEntityDTOList(List<IEntityDTO> list, IPSDEDataSet iPSDEDataSet, ISearchContextDTO iSearchContextDTO) throws Throwable {

		if(ObjectUtils.isEmpty(list)) {
			return list;
		}

		List<IEntityDTO> all = new ArrayList<IEntityDTO>();
		all.addAll(list);

		Map<String, Object> params = new LinkedHashMap<String, Object>();
		if(iSearchContextDTO.any()!=null) {
			params.putAll(iSearchContextDTO.any());
		}
		Map<Object, IEntityDTO> map = new LinkedHashMap<Object, IEntityDTO>();
		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if(!ObjectUtils.isEmpty(psDEDataQueryList)) {
			for(IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
				if(iPSDEDataQuery.getPSDEDQMain() == null
						|| iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition() == null) {
					for(IEntityDTO iEntityDTO : all) {
						Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
						if(!map.containsKey(key)) {
							map.put(key, iEntityDTO);
						}
					}
				}
				else {
					IPSDEDQGroupCondition iPSDEDQGroupCondition = iPSDEDataQuery.getPSDEDQMain().getPSDEDQGroupCondition();
					for(IEntityDTO iEntityDTO : all) {
						if(this.filterEntityDTO(iEntityDTO, iPSDEDQGroupCondition, params)) {
							Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
							if(!map.containsKey(key)) {
								map.put(key, iEntityDTO);
							}
						}
					}
				}
			}
		}

		all.clear();
		all.addAll(map.values());
		map.clear();

		//循环条件
		for(IEntityDTO iEntityDTO : all) {
			if(this.filterEntityDTO(iEntityDTO, iSearchContextDTO, params)) {
				Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
				if(!map.containsKey(key)) {
					map.put(key, iEntityDTO);
				}
			}
		}

		all.clear();
		all.addAll(map.values());
		map.clear();
		return all;
	}

	protected boolean filterEntityDTO(IEntityDTO iEntityDTO, IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params) throws Throwable{

		ISearchCond iSearchCond = this.getSearchCond(iPSDEDQCondition, params);
		if(iSearchCond!=null) {
			return this.filterEntityDTO(iEntityDTO, iSearchCond, params);
		}
		return true;
	}

	protected boolean filterEntityDTO(IEntityDTO iEntityDTO, ISearchCond iSearchCond, Map<String, Object> params) throws Throwable{
		if(iSearchCond instanceof ISearchGroupCond) {
			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)iSearchCond;
			boolean bRet = true;
			if(iSearchGroupCond.getCondOp().equals(Conditions.AND)) {
				if(!ObjectUtils.isEmpty(iSearchGroupCond.getSearchConds())) {
					bRet = true;
					for(ISearchCond childSearchCond : iSearchGroupCond.getSearchConds()) {
						if(!filterEntityDTO(iEntityDTO, childSearchCond, params)) {
							bRet = false;
							break;
						}
					}
				}
			}
			else
			if(iSearchGroupCond.getCondOp().equals(Conditions.OR)) {
				if(!ObjectUtils.isEmpty(iSearchGroupCond.getSearchConds())) {
					bRet = false;
					for(ISearchCond childSearchCond : iSearchGroupCond.getSearchConds()) {
						if(filterEntityDTO(iEntityDTO, childSearchCond, params)) {
							bRet = true;
							break;
						}
					}
				}
			}
			if(iSearchGroupCond.isNotMode()) {
				bRet = !bRet;
			}
			return bRet;
		}
		
		if(iSearchCond instanceof ISearchFieldCond) {
			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
			if(ObjectUtils.isEmpty(iSearchFieldCond.getValueFunc())) {
				Object value = iEntityDTO.get(iSearchFieldCond.getFieldName());
				Object dstValue = iSearchFieldCond.isParamMode()?params.get(iSearchFieldCond.getValue()):iSearchFieldCond.getValue();
				IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(iSearchFieldCond.getFieldName(), true);
				if(iPSDEField != null) {
					return DataTypeUtils.testCond(value, iSearchFieldCond.getCondOp(), dstValue, iPSDEField.getStdDataType());
				}
				else {
					return DataTypeUtils.testCond(value, iSearchFieldCond.getCondOp(), dstValue, DataTypes.UNKNOWN);
				}
			}
			else {
				log.warn(String.format("未支持的值处理函数[%1$s]", iSearchFieldCond.getValueFunc()));
				return true;
			}
		}

		log.warn(String.format("未支持的条件类型[%1$s]", iSearchCond.getCondType()));
		return true;
	}

	protected IPSDERBase getVersionPSDERBase(IAppContext iAppContext, boolean bTryMode) throws Exception {
		java.util.List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)
				&& iAppContext!=null) {
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				if(iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId(), false);
					if(majorDataEntityRuntime.isEnableVersionControl()) {
						Object value = iAppContext.get(majorDataEntityRuntime.getName());
						if(!ObjectUtils.isEmpty(value)) {
							return iPSDER1N;
						}
					}
					continue;
				}


				if(iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERCustom.getMajorPSDataEntityMust().getId(), false);
					if(majorDataEntityRuntime.isEnableVersionControl()) {
						Object value = iAppContext.get(majorDataEntityRuntime.getName());
						if(!ObjectUtils.isEmpty(value)) {
							return iPSDERCustom;
						}
					}
					continue;
				}
			}
		}
		if(bTryMode) {
			return null;
		}

		throw new Exception("无法获取传入数据版本控制关系");
	}


	@Override
	public void commit(IEntityBase parentData, IPSDERBase iPSDERBase, Object versionId) {
		Assert.notNull(parentData, "传入父数据对象无效");
		Assert.notNull(iPSDERBase, "传入父数据关系模型无效");
		Assert.notNull(versionId, "传入父数据版本无效");
		try {
			onCommit(parentData, iPSDERBase, versionId);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("提交父数据相关数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onCommit(IEntityBase parentData, IPSDERBase iPSDERBase, Object versionId) throws Throwable {
		IPSDEField pickupPSDEField = null;
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentSubTypePSDEField = null;
		String strParentType = null;
		String strParentSubType = null;
		IPSDEDataSet nestedPSDEDataSet = null;

		if (iPSDERBase instanceof IPSDER1N) {
			IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
			if ((iPSDER1N.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value) {
				pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
				nestedPSDEDataSet = ((IPSDER1N) iPSDERBase).getNestedPSDEDataSet();
			}
		} else if (iPSDERBase instanceof IPSDERCustom) {
			IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
			if (((iPSDERCustom.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value)
					&& (this.getDataEntityRuntime().getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType()))){
				pickupPSDEField = iPSDERCustom.getPickupPSDEField();
				nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				parentTypePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, this.getDataEntityRuntime().getDEType() != DETypes.DYNAATTACHED);
				if(parentTypePSDEField != null) {
					strParentType = iPSDERCustom.getParentType();
					if(!StringUtils.hasLength(strParentType)) {
						//strParentType = iPSDERBase.getMajorPSDataEntityMust().getName();
						strParentType = this.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId(), false).getDERParentType();
					}
				}
				parentSubTypePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
				if (parentSubTypePSDEField != null) {
					strParentSubType = iPSDERCustom.getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERBase.getMinorCodeName();
					}
				}
			}
		}

		if (pickupPSDEField == null) {
			throw new Exception(String.format("传入关系无效，未提供连接属性"));
		}

		Object key = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId()).getKeyFieldValue(parentData);

		// 查出原有数据
		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
		iSearchContextDTO.all().count(false);
		this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, key);
		if (parentTypePSDEField != null) {
			this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
		}
		if (parentSubTypePSDEField != null) {
			if (StringUtils.hasLength(strParentSubType)) {
				this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
			} else {
				this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
			}
		}

		// 设置排序信息
		IPSDEField orderValuePSDEField = this.getDataEntityRuntime().getOrderValuePSDEField();
		if (orderValuePSDEField != null) {
			this.getDataEntityRuntime().setSearchSort(iSearchContextDTO, orderValuePSDEField, SortDir.ASC.value);
		}
		List<IEntityDTO> lastList = null;
		if (nestedPSDEDataSet != null) {
			lastList = this.getDataEntityRuntime().selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
		} else {
			lastList = this.getDataEntityRuntime().select(iSearchContextDTO);
		}

		//复制数据
		if(!ObjectUtils.isEmpty(lastList)) {
			List<IEntityDTO> insertList = new ArrayList<IEntityDTO>();
			for(IEntityDTO item : lastList) {
				IEntityDTO temp = this.getVersionDataEntityRuntime().createEntity();
				temp.set(this.getVersionParentIdPSDEField().getLowerCaseName(), key);
				temp.set(this.getVersionParentVersionIdPSDEField().getLowerCaseName(), versionId);
				if(this.getVersionParentTypePSDEField()!=null) {
					temp.set(this.getVersionParentTypePSDEField().getLowerCaseName(), iPSDERBase.getMajorPSDataEntityMust().getName());
				}
				temp.set(this.getVersionFilterPSDEField().getLowerCaseName(), pickupPSDEField.getName());
				temp.set(this.getVersionDataPSDEField().getLowerCaseName(), this.getDataEntityRuntime().serializeEntity(item));

				if(this.getVersionOwnerTypePSDEField()!=null) {
					temp.set(this.getVersionOwnerTypePSDEField().getLowerCaseName(), this.getDataEntityRuntime().getName());
				}
				if(this.getVersionOwnerIdPSDEField()!=null) {
					temp.set(this.getVersionOwnerIdPSDEField().getLowerCaseName(), item.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()));
				}

				this.getVersionDataEntityRuntime().fillEntityKeyValue(temp);
				insertList.add(temp);
			}

			this.getVersionDataEntityRuntime().rawCreate(insertList, false);
		}
	}


	@Override
	public void restore(IEntityBase parentData, IPSDERBase iPSDERBase, Object versionId) {
		Assert.notNull(parentData, "传入父数据对象无效");
		Assert.notNull(iPSDERBase, "传入父数据关系模型无效");
		Assert.notNull(versionId, "传入父数据版本无效");
		try {
			onRestore(parentData, iPSDERBase, versionId);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("恢复父数据相关数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onRestore(IEntityBase parentData, IPSDERBase iPSDERBase, Object versionId) throws Throwable {
		IPSDEField pickupPSDEField = null;
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentSubTypePSDEField = null;
		String strParentType = null;
		String strParentSubType = null;
		IPSDEDataSet nestedPSDEDataSet = null;

		if (iPSDERBase instanceof IPSDER1N) {
			IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
			if ((iPSDER1N.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value) {
				pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
				nestedPSDEDataSet = ((IPSDER1N) iPSDERBase).getNestedPSDEDataSet();
			}
		} else if (iPSDERBase instanceof IPSDERCustom) {
			IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
			if (((iPSDERCustom.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value)
					&& (this.getDataEntityRuntime().getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType()))){
				pickupPSDEField = iPSDERCustom.getPickupPSDEField();
				nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				parentTypePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, this.getDataEntityRuntime().getDEType() != DETypes.DYNAATTACHED);
				if(parentTypePSDEField != null) {
					strParentType = iPSDERCustom.getParentType();
					if(!StringUtils.hasLength(strParentType)) {
						//strParentType = this.getDataEntityRuntime().getName();
						strParentType = this.getDataEntityRuntime().getDERParentType();
					}
				}
				parentSubTypePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
				if (parentSubTypePSDEField != null) {
					strParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERBase.getMinorCodeName();
					}
				}
			}
		}

		if (pickupPSDEField == null) {
			throw new Exception(String.format("传入关系无效，未提供连接属性"));
		}

		Object key = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId()).getKeyFieldValue(parentData);

		// 查出原有数据
		Map<Object, IEntityDTO> lastMap = new LinkedHashMap<Object, IEntityDTO>();
		if(true) {
			ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
			iSearchContextDTO.all().count(false);
			this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, key);
			if (parentTypePSDEField != null) {
				this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
			}
			if (parentSubTypePSDEField != null) {
				if (StringUtils.hasLength(strParentSubType)) {
					this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
				} else {
					this.getDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
				}
			}

			// 设置排序信息
			IPSDEField orderValuePSDEField = this.getDataEntityRuntime().getOrderValuePSDEField();
			if (orderValuePSDEField != null) {
				this.getDataEntityRuntime().setSearchSort(iSearchContextDTO, orderValuePSDEField, SortDir.ASC.value);
			}

			List<IEntityDTO> lastList = null;
			if (nestedPSDEDataSet != null) {
				lastList = this.getDataEntityRuntime().selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
			} else {
				lastList = this.getDataEntityRuntime().select(iSearchContextDTO);
			}
			if(!ObjectUtils.isEmpty(lastList)) {
				for(IEntityDTO iEntityDTO : lastList) {
					lastMap.put(iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()), iEntityDTO);
				}
			}
		}

		List<IEntityDTO> updateList = new ArrayList<IEntityDTO>();
		List<IEntityDTO> createList = new ArrayList<IEntityDTO>();
		if(true) {
			ISearchContextDTO iSearchContextDTO = this.getVersionDataEntityRuntime().createSearchContext();
			iSearchContextDTO.all().count(false);
			this.getVersionDataEntityRuntime().setSearchCondition(iSearchContextDTO, this.getVersionParentIdPSDEField(), Conditions.EQ, key);
			this.getVersionDataEntityRuntime().setSearchCondition(iSearchContextDTO, this.getVersionParentTypePSDEField(), Conditions.EQ, iPSDERBase.getMajorPSDataEntityMust().getName());
			this.getVersionDataEntityRuntime().setSearchCondition(iSearchContextDTO, this.getVersionFilterPSDEField(), Conditions.EQ, pickupPSDEField.getName());
			this.getVersionDataEntityRuntime().setSearchCondition(iSearchContextDTO, this.getVersionParentVersionIdPSDEField(), Conditions.EQ, versionId);

			if(this.getVersionOwnerTypePSDEField()!=null) {
				this.getVersionDataEntityRuntime().setSearchCondition(iSearchContextDTO, this.getVersionOwnerTypePSDEField(), Conditions.EQ, this.getDataEntityRuntime().getName());
			}

			List<IEntityDTO> list = this.getVersionDataEntityRuntime().select(iSearchContextDTO);
			if(!ObjectUtils.isEmpty(list)) {
				for(IEntityDTO versionData : list) {
					IEntityDTO iEntityDTO = (IEntityDTO) this.getDataEntityRuntime().deserializeEntity(versionData.get(this.getVersionDataPSDEField().getLowerCaseName()));
					Object id = iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
					IEntityDTO lastEntityDTO = lastMap.remove(id);
					if(lastEntityDTO != null) {
						updateList.add(lastEntityDTO);
					}
					else {
						createList.add(iEntityDTO);
					}
				}
			}
		}

		//移除数据
		if(!ObjectUtils.isEmpty(lastMap)) {
			this.getDataEntityRuntime().rawRemove(new ArrayList<Object>(lastMap.keySet()), true);
		}

		//更新数据
		if(!ObjectUtils.isEmpty(updateList)) {
			this.getDataEntityRuntime().rawUpdate(updateList, true);
		}

		//新建数据
		if(!ObjectUtils.isEmpty(createList)) {
			this.getDataEntityRuntime().rawCreate(createList, true);
		}
	}

	protected boolean isCurrentVersionId(Object strVersionId) throws Throwable {
		IAppContext iAppContext = ActionSessionManager.getAppContextMust();
		IPSDERBase iPSDERBase = getVersionPSDERBase(iAppContext, false);
		Object parentId = ActionSessionManager.getAppContextMust().get(iPSDERBase.getMajorPSDataEntityMust().getName());
		IDataEntityRuntime majorDataEntityRuntime =	this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
		IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = majorDataEntityRuntime.getDEVersionControlUtilRuntime();
		if(iDEVersionControlUtilRuntime == null) {
			throw new Exception(String.format("版本控制主实体[%1$s]未提供版本控制功能组件", majorDataEntityRuntime.getName()));
		}

		return iDEVersionControlUtilRuntime.isCurrentVersionId(parentId, strVersionId);
	}

	protected ISearchCond getSearchCond(IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params) throws Throwable{
		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			List<ISearchCond> list = new ArrayList<ISearchCond>();
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if(psDEDQConditions != null) {
				for (IPSDEDQCondition item : psDEDQConditions) {
					ISearchCond iSearchCond = this.getSearchCond(item, params);
					if (iSearchCond != null) {
						list.add(iSearchCond);
					}
				}
			}

			if (list.size() > 0) {
				SearchGroupCond searchGroupCond = new SearchGroupCond();
				if (iPSDEDQGroupCondition.isNotMode()) {
					searchGroupCond.setNotMode(true);
				}
				searchGroupCond.setCondOp(iPSDEDQGroupCondition.getCondOp());
				searchGroupCond.getSearchCondsIf().addAll(list);
				return searchGroupCond;
			} else {
				return null;
			}
		}

		if (iPSDEDQCondition instanceof IPSDEDQFieldCondition) {
			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition) iPSDEDQCondition;
			String strVarType = iPSDEDQFieldCondition.getPSVARTypeId();
			if(StringUtils.hasLength(strVarType)) {
				Object objValue = null;
				if(StringUtils.hasLength(iPSDEDQFieldCondition.getCondValue())) {
					objValue = params==null?null:params.get(iPSDEDQFieldCondition.getCondValue().toLowerCase());
				}
				return getSearchCond(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue);
			}
			else {
				Object objValue = iPSDEDQFieldCondition.getCondValue();
				IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
				if(iPSDEField != null) {
					objValue = this.getDataEntityRuntime().convertValue(iPSDEField.getStdDataType(), (String)objValue);
				}
				return getSearchCond(iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue);
			}
		}

		log.warn(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));
		//throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));
		return null;
	}




	protected ISearchCond getSearchCond(String strFieldName, String strCondition, Object objValue) throws Throwable {

		if (StringUtils.hasLength(strFieldName)) {
			strFieldName = strFieldName.toLowerCase();
		}
		else {
			throw new Exception("未指定属性标识");
		}

		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setParamMode(false);
		searchFieldCond.setCondOp(strCondition);
		searchFieldCond.setValue(objValue);

		return searchFieldCond;
	}
}
