package net.ibizsys.central.cloud.core.dataentity.security.dr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.ds.DEDQCondVarTypes;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.priv.IPSDEDataRange;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;

public class DataSetDRProvider extends DataEntityDRProviderBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataSetDRProvider.class);

	@Override
	public boolean support(IPSDEUserRole iPSDEUserRole) {
		if (iPSDEUserRole.getPSDEDataSet() != null) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean support(IPSDEDataRange iPSDEDataRange) {
		if(iPSDEDataRange instanceof IPSDEUserRole) {
			if (((IPSDEUserRole)iPSDEDataRange).getPSDEDataSet() != null) {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action) {
		try {
			return this.onGetDRSearchConds(iDataEntityRuntime, iPSDEUserRole, action);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取实体[%1$s]角色[%2$s]数据范围条件发生异常，%3$s", iDataEntityRuntime.getName(), iPSDEUserRole.getName(), ex.getMessage()), ex);
		}
	}

	protected List<ISearchCond> onGetDRSearchConds(IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action) throws Throwable {

		List<ISearchCond> searchConds = new ArrayList<>();
		IPSDEDataSet iPSDEDataSet = iPSDEUserRole.getPSDEDataSetMust();
		if (ObjectUtils.isEmpty(iPSDEDataSet.getPSDEDataQueries())) {
			throw new Exception(String.format("数据集[%1$s]未包含查询模型", iPSDEDataSet.getName()));
		}

		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		SearchGroupCond orSearchGroupCond = null;
		if (iPSDEDataSet.getPSDEDataQueries().size() > 1) {
			orSearchGroupCond = new SearchGroupCond();
			orSearchGroupCond.setCondOp(Conditions.OR);
		}

		for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
			if (isEnableCustomCondMode(iDataEntityRuntime, iPSDEDataQuery)) {
				String strDBType = iDataEntityRuntime.getSysDBSchemeRuntimeMust().getDBType();
				List<IPSDEDataQueryCode> iPSDEDataQueryCodes = iPSDEDataQuery.getAllPSDEDataQueryCodes();
				if (iPSDEDataQueryCodes != null) {
					for (IPSDEDataQueryCode iPSDEDataQueryCode : iPSDEDataQueryCodes) {
						if (strDBType.equals(iPSDEDataQueryCode.getDBType())) {
							List<IPSDEDataQueryCodeCond> iPSDEDataQueryCodeConds = iPSDEDataQueryCode.getPSDEDataQueryCodeConds();
							if (!ObjectUtils.isEmpty(iPSDEDataQueryCodeConds)) {
								String strCustomCond = "";
								for (int i = 0; i < iPSDEDataQueryCodeConds.size(); i++) {
									IPSDEDataQueryCodeCond psdeDataQueryCodeCond = iPSDEDataQueryCodeConds.get(i);
									if (i > 0)
										strCustomCond += " AND ";
									strCustomCond += psdeDataQueryCodeCond.getCustomCond();
								}
								SearchCustomCond customCond = new SearchCustomCond();
								customCond.setCustomCond(strCustomCond);

								if (orSearchGroupCond != null) {
									orSearchGroupCond.getSearchCondsIf().add(customCond);
								} else {
									searchConds.add(customCond);
								}
							}
							break;
						}
					}
				}
			} else {
				// 展开逻辑
				IPSDEDQGroupCondition iPSDEDQGroupCondition = iPSDEDataQuery.getPSDEDQMainMust().getPSDEDQGroupCondition();
				if (iPSDEDQGroupCondition == null) {
					throw new Exception(String.format("数据查询[%1$s]未包含过滤条件", iPSDEDataQuery.getName()));
				}

				ISearchCond iSearchCond = this.getSearchCond(iDataEntityRuntime, iPSDEDQGroupCondition, null);
				if (iSearchCond != null) {
					if (orSearchGroupCond != null) {
						orSearchGroupCond.getSearchCondsIf().add(iSearchCond);
					} else {
						searchConds.add(iSearchCond);
					}
				}

			}
		}

		if (orSearchGroupCond != null && !ObjectUtils.isEmpty(orSearchGroupCond.getSearchConds())) {
			searchConds.add(orSearchGroupCond);
		}

		return searchConds;
	}

	protected boolean isEnableCustomCondMode(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery) {

		if (iPSDEDataQuery.isCustomCode()) {
			return true;
		}

		if (iDataEntityRuntime.getSysDBSchemeRuntime() == null || iDataEntityRuntime.isEnableDEMapping()) {
			return false;
		}

		return true;
	}

	protected ISearchCond getSearchCond(IDataEntityRuntime iDataEntityRuntime, IPSDEDQCondition iPSDEDQCondition, Map<String, Object> params) throws Exception {

		if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			List<ISearchCond> list = new ArrayList<ISearchCond>();
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition) iPSDEDQCondition;
			List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if (psDEDQConditions != null) {
				for (IPSDEDQCondition item : psDEDQConditions) {
					ISearchCond iSearchCond = this.getSearchCond(iDataEntityRuntime, item, params);
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
			if (StringUtils.hasLength(strVarType)) {
				if (DEDQCondVarTypes.SESSIONCONTEXT.equalsIgnoreCase(strVarType)) {
					Object objValue = null;
					if (StringUtils.hasLength(iPSDEDQFieldCondition.getCondValue())) {
						objValue = EmployeeContext.getCurrentMust().getSessionParam(iPSDEDQFieldCondition.getCondValue().toLowerCase());
					}
					return getSearchCond(iDataEntityRuntime, iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue);
				}
				throw new Exception(String.format("未支持的条件值类型[%1$s]", strVarType));
			} else {
				Object objValue = iPSDEDQFieldCondition.getCondValue();
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName(), true);
				if (iPSDEField != null) {
					objValue = iDataEntityRuntime.convertValue(iPSDEField.getStdDataType(), (String) objValue);
				}
				return getSearchCond(iDataEntityRuntime, iPSDEDQFieldCondition.getFieldName(), iPSDEDQFieldCondition.getCondOp(), objValue);
			}
		}

		throw new Exception(String.format("未支持的搜索条件类型[%1$s]", iPSDEDQCondition.getCondType()));
	}

	protected ISearchCond getSearchCond(IDataEntityRuntime iDataEntityRuntime, String strFieldName, String strCondition, Object objValue) throws Exception {

		if (StringUtils.hasLength(strFieldName)) {
			strFieldName = strFieldName.toLowerCase();
		} else {
			throw new Exception("未指定属性标识");
		}

		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setParamMode(false);
		searchFieldCond.setCondOp(strCondition);
		searchFieldCond.setValue(objValue);

		return searchFieldCond;

	}



	@Override
	protected List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataRange iPSDEDataRange, String action) {
		return null;
	}

	

}
