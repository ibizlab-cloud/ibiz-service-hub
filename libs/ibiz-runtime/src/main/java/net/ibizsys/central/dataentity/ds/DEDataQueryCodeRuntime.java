package net.ibizsys.central.dataentity.ds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.CondType;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public class DEDataQueryCodeRuntime extends ModelRuntimeBase implements IDEDataQueryCodeRuntime
{
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataQueryCodeRuntime.class);
	
	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IPSDEDataQueryCode iPSDEDataQueryCode = null;
	private IPSDEDataQuery iPSDEDataQuery = null;
	private IDBDialect iDBDialect = null;
	private Map<String, IPSDEDataQueryCodeExp> psDEDataQueryCodeExpMap = new HashMap<String, IPSDEDataQueryCodeExp>();
	//private Map<String, IPSDEDQFieldCondition> ignorePSDEDQFieldConditionMap = null;

	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataQuery iPSDEDataQuery, IPSDEDataQueryCode iPSDEDataQueryCode) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.iPSDEDataQueryCode = iPSDEDataQueryCode;
		this.iPSDEDataQuery = iPSDEDataQuery;
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {
		
		this.iDBDialect = this.getDataEntityRuntimeContext().getDataEntityRuntime().getSystemRuntime().getDBDialect(this.getPSDEDataQueryCode().getDBType());
		
		List<IPSDEDataQueryCodeExp> psDEDataQueryCodeExpList = this.getPSDEDataQueryCode().getPSDEDataQueryCodeExps();
		if(psDEDataQueryCodeExpList != null) {
			for(IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp: psDEDataQueryCodeExpList) {
				psDEDataQueryCodeExpMap.put(iPSDEDataQueryCodeExp.getName().toUpperCase(), iPSDEDataQueryCodeExp);
			}
		}
		
//		if(this.getPSDEDataQuery().getPSDEDQMain() != null && this.getPSDEDataQuery().getPSDEDQMain().getPSDEDQGroupCondition()!=null) {
//			Map<String, IPSDEDQFieldCondition> ignorePSDEDQFieldConditionMap = new HashMap<String, IPSDEDQFieldCondition>();
//			this.fillIgnorePSDEDQFieldConditions(ignorePSDEDQFieldConditionMap, this.getPSDEDataQuery().getPSDEDQMain().getPSDEDQGroupCondition());
//			if(ignorePSDEDQFieldConditionMap.size() > 0) {
//				this.ignorePSDEDQFieldConditionMap = ignorePSDEDQFieldConditionMap;
//			}
//		}
		super.onInit();
	}
	
	@Override
	public IPSDEDataQueryCode getPSDEDataQueryCode() {
		return this.iPSDEDataQueryCode;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEDataQueryCode();
	}
	
	@Override
	public IPSDEDataQuery getPSDEDataQuery() {
		return this.iPSDEDataQuery;
	}
	
	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return getDataEntityRuntimeContext().getDataEntityRuntime();
	}
	
	@Override
	public IPSDEDataQueryCodeExp getPSDEDataQueryCodeExp(String strName, boolean bTryMode) {
		IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = psDEDataQueryCodeExpMap.get(strName.toUpperCase());
		if(iPSDEDataQueryCodeExp != null || bTryMode) {
			return iPSDEDataQueryCodeExp;
		}
		throw new DataEntityRuntimeException(getDataEntityRuntimeContext().getDataEntityRuntime(), this, String.format("实体查询[%1$s]代码[%2$s]无法获取指定表达式", getPSDEDataQuery().getName(),this.getPSDEDataQueryCode().getDBType(), strName));
	}
	
	@Override
	public IDBDialect getDBDialect() {
		return this.iDBDialect;
	}
	
	protected void fillIgnorePSDEDQFieldConditions(Map<String, IPSDEDQFieldCondition> ignorePSDEDQFieldConditionMap, IPSDEDQCondition iPSDEDQCondition) throws Exception{
		
		String strType = iPSDEDQCondition.getCondType();
		if(CondType.SINGLE.value.equalsIgnoreCase(strType)) {
			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition)iPSDEDQCondition;
			if(iPSDEDQFieldCondition.isIgnoreOthers()) {
				if(StringUtils.hasLength(iPSDEDQFieldCondition.getFieldName())) {
					ignorePSDEDQFieldConditionMap.put(iPSDEDQFieldCondition.getFieldName().toUpperCase(), iPSDEDQFieldCondition);
				}
			}
			return;
		}
		
		if(CondType.GROUP.value.equalsIgnoreCase(strType)) {
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition)iPSDEDQCondition;
			List<IPSDEDQCondition> childPSDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
			if(ObjectUtils.isEmpty(childPSDEDQConditions)) {
				return;
			}
			
			for(IPSDEDQCondition childPSDEDQCondition : childPSDEDQConditions) {
				this.fillIgnorePSDEDQFieldConditions(ignorePSDEDQFieldConditionMap, childPSDEDQCondition);
				
			}
			return;
		}
	}

//	@Override
//	public boolean ignoreSearchFieldCond(ISearchFieldCond iSearchFieldCond) {
//		if(ObjectUtils.isEmpty(ignorePSDEDQFieldConditionMap)) {
//			return false;
//		}
//		
//		if(!ISearchFieldCond.CAT_DATACONTEXT.equals(iSearchFieldCond.getCat())) {
//			return false;
//		}
//		
//		String strFieldName = iSearchFieldCond.getFieldName();
//		if(StringUtils.hasLength(strFieldName)) {
//			return ignorePSDEDQFieldConditionMap.containsKey(strFieldName.toUpperCase());
//		}
//		
//		return false;
//	}
	
//	@Override
//	public String getConditionSQL(List<ISearchCond> searchCondList, String strCondOp, IDBDataService iDBDataService, ISearchContext iSearchContext) throws Throwable {
//		
//		if(StringUtils.isEmpty(strCondOp)) {
//			strCondOp = Conditions.AND;
//		}
//		
//		List<String> condList = null;
//		if (searchCondList != null && searchCondList.size() != 0) {
//			condList = new ArrayList<String>();
//			for(ISearchCond  subSearchCond : searchCondList) {
//				String strSubCond = getConditionSQL(subSearchCond, iDBDataService, iSearchContext);
//				if (StringUtils.hasLength(strSubCond)) {
//					condList.add(strSubCond);
//				}
//			}
//		}
//
//		if (condList == null || condList.size() == 0){
//			return null;
//		}
//
//		StringBuilder sb = new StringBuilder();
//
//		boolean bFirst = true;
//		for (String strCond : condList) {
//			if (bFirst)
//				bFirst = false;
//			else
//				sb.append(String.format(" %1$s ", strCondOp));
//			sb.append(String.format("( %1$s )", strCond));
//		}
//
//		return sb.toString();
//	}
//	
//	@Override
//	public String getConditionSQL(ISearchCond iSearchCond, IDBDataService iDBDataService, ISearchContext iSearchContext) throws Throwable {
//		
//		if (ISearchCond.CONDTYPE_GROUP.equals(iSearchCond.getCondType())) {
//			List<String> condList = null;
//			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)iSearchCond;
//			List<ISearchCond> subSearchCondList = iSearchGroupCond.getSearchConds();
//			if (subSearchCondList != null && subSearchCondList.size() != 0) {
//				condList = new ArrayList<String>();
//				for(ISearchCond  subSearchCond : subSearchCondList) {
//					String strSubCond = getConditionSQL(subSearchCond, iDBDataService, iSearchContext);
//					if (StringUtils.hasLength(strSubCond)) {
//						condList.add(strSubCond);
//					}
//				}
//			}
//
//			if (condList == null ||condList.size() == 0){
//				return null;
//			}
//
//			StringBuilder sb = new StringBuilder();
//
//			boolean bFirst = true;
//			for (String strCond : condList) {
//				if (bFirst)
//					bFirst = false;
//				else
//					sb.append(String.format(" %1$s ", iSearchGroupCond.getCondOp()));
//				sb.append(String.format("( %1$s )", strCond));
//			}
//
//			if (iSearchGroupCond.isNotMode()) {
//				return String.format(" NOT( %1$s )", sb.toString());
//			} else
//				return sb.toString();
//		}
//
//		if (ISearchCond.CONDTYPE_DEFIELD.equals(iSearchCond.getCondType())) {
//		
//			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
//			
//			String strDEFieldExp = iSearchFieldCond.getName();
//			int nStdDataType = iSearchFieldCond.getDataType();
//			if (StringUtils.isEmpty(strDEFieldExp)) {
//				strDEFieldExp = this.getPSDEDataQueryCodeExp(iSearchFieldCond.getFieldName(), false).getExpression();
//			}
//			if(StringUtils.isEmpty(iSearchFieldCond.getValueFunc())){
//				if (nStdDataType == DataTypes.UNKNOWN) {
//					nStdDataType = this.getDataEntityRuntimeContext().getDataEntityRuntime().getPSDEField(iSearchFieldCond.getFieldName(), false).getStdDataType();
//				}
//			}
//			else{
////				if (this.getDEModel() != null) {
////					iDBFunction = this.getDEModel().getSystemModel().getDBFunction(iDBDialect, iDEDataQueryCond.getValueFunc());
////				}
////				else {
////					iDBFunction = iDBDialect.getDBFunction(iDEDataQueryCond.getValueFunc());
////				}
//				IDBFunction iDBFunction = this.getDBDialect().getDBFunction(iSearchFieldCond.getValueFunc());
//				nStdDataType = iDBFunction.getOutputDataType();
//				strDEFieldExp = iDBFunction.getFuncSQL(new String[]{strDEFieldExp});
//			}
////			if (this.getDEModel() != null) {
////				return this.getDEModel().getDEFieldConditionSql(iDBDialect, iDEDataQueryCond.getDEFName(), strDEFieldExp, nStdDataType, iDEDataQueryCond.getCondOp(), iDEDataQueryCond.getCondValue());
////			}
//			
//			if(iDBDataService != null) {
//				return iDBDataService.getConditionSQL(strDEFieldExp, nStdDataType, iSearchFieldCond.getCondOp(), iSearchFieldCond.getValue(), iSearchFieldCond.isParamMode(), iSearchContext, this.getDBDialect());
//			}
//			
//			return  this.getDBDialect().getConditionSQL(strDEFieldExp, nStdDataType, iSearchFieldCond.getCondOp(), iSearchFieldCond.getValue(), iSearchFieldCond.isParamMode(), iSearchContext);
//			
//		}
//		
//		if (ISearchCond.CONDTYPE_CUSTOM.equals(iSearchCond.getCondType())) {
//			return ((ISearchCustomCond)iSearchCond).getCustomCond();
//		}
//		
////		if (StringHelper.compare(iDEDataQueryCond.getCondType(), IDEDataQueryCodeCond.CONDTYPE_CUSTOM, true) == 0) {
////			// 自定义代码，要分析是否有参数
////			SqlCodeHelper sqlCodeHelper = this.sqlCodeHelperMap.get(iDEDataQueryCond.getCustomCond());
////			if (sqlCodeHelper == null) {
////				sqlCodeHelper = new SqlCodeHelper();
////				sqlCodeHelper.init(this, iDEDataQueryCond.getCustomCond());
////				sqlCodeHelperMap.put(iDEDataQueryCond.getCustomCond(), sqlCodeHelper);
////			}
////			return sqlCodeHelper.generateCode(list, iDEDataSetFetchContext.getSessionFactory());
////		}
//
//		throw new DataEntityRuntimeException(this.getDataEntityRuntimeContext().getDataEntityRuntime(), this, String.format("无法识别的搜索条件类型[%1$s]", iSearchCond.getCondType()));
//	}
//	
	
	
//
//	
//	@Override
//	public String getQueryCode() {
//		return getPSDEDataQueryCode().getQueryCode();
//	}
}
