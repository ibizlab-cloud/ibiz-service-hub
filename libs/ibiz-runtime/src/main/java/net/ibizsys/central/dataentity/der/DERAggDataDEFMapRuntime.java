package net.ibizsys.central.dataentity.der;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.logic.DELogicPrepareParamValueTypes;
import net.ibizsys.central.dataentity.logic.util.DEFCaseWhenLogicRuntime;
import net.ibizsys.central.dataentity.logic.util.IDEFCaseWhenLogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.util.IDEFCaseWhenLogicRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap;
import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkSingleCond;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.der.DERAggDataDEFMapTypes;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;

public class DERAggDataDEFMapRuntime extends ModelRuntimeBase implements IDERAggDataDEFMapRuntime {

	private IDERRuntimeContext iDERBaseRuntimeContext = null;
	private IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap = null;

	private boolean bDimension = false;
	private boolean bTimeGroup = false;
	private boolean bSimpleGroup = false;
	private String strFormulaFormat = null;
	private Map<String, String> formulaFormatMap = null;
	
	@Override
	public void init(IDERRuntimeContext iDERBaseRuntimeContext, IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap) throws Exception {
		
		Assert.notNull(iDERBaseRuntimeContext, String.format("传入关系运行时上下文对象无效"));
		Assert.notNull(iPSDERAggDataDEFieldMap, String.format("传入关系属性映射模型对象无效"));
		
		this.setDERBaseRuntimeContext(iDERBaseRuntimeContext);
		
		this.setPSDERAggDataDEFieldMap(iPSDERAggDataDEFieldMap);
		
		Assert.notNull(this.getMapType(), String.format("未指定属性映射模式"));
		
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
//		IPSDEField majorPSDEField = this.getPSDERAggDataDEFieldMap().getMajorPSDEFieldMust();
//		IPSDEField minorPSDEField = this.getPSDERAggDataDEFieldMap().getMinorPSDEField();
//		
		
		if( this.getMapType().indexOf(DERAggDataDEFMapTypes.GROUPBY) != -1
				||  this.getMapType().indexOf(DERAggDataDEFMapTypes.USER) != -1) {
			bDimension = true;	
			if(this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY)) {
				bSimpleGroup = true;
			}
			else {
				if(this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_DAYOFMONTH)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_DAYOFWEEK)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_DAYOFYEAR)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_HOUR)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_MINUTE)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_MONTH)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_QUARTER)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_WEEK)
						|| this.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY_YEAR)) {
					this.bTimeGroup = true;
				}
				
				
			}	
		}
		else {
			this.strFormulaFormat = this.getPSDERAggDataDEFieldMap().getFormulaFormat();
		}
		
		super.onInit();
	}
	

	
	protected IDERRuntimeContext getDERBaseRuntimeContext() {
		return this.iDERBaseRuntimeContext;
	}
	
	protected void setDERBaseRuntimeContext(IDERRuntimeContext iDERBaseRuntimeContext) {
		this.iDERBaseRuntimeContext = iDERBaseRuntimeContext;
	}
	
	@Override
	public IPSDERAggDataDEFieldMap getPSDERAggDataDEFieldMap() {
		return this.iPSDERAggDataDEFieldMap;
	}
	
	protected void setPSDERAggDataDEFieldMap(IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap) {
		this.iPSDERAggDataDEFieldMap = iPSDERAggDataDEFieldMap;
	}
	
	
	@Override
	public String getFormulaFormat() {
		return this.strFormulaFormat;
	}


	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDERAggDataDEFieldMap();
	}

	@Override
	public String getMapType() {
		return this.getPSDERAggDataDEFieldMap().getMapType();
	}

	@Override
	public boolean isDimension() {
		return this.bDimension;
	}

	@Override
	public boolean isMetric() {
		return !this.bDimension;
	}

	@Override
	public boolean isSimpleGroup() {
		return this.bSimpleGroup;
	}
	
	@Override
	public boolean isTimeGroup() {
		return this.bTimeGroup;
	}
	
	protected String calcFormulaFormat(IPSDEFLogic iPSDEFLogic) throws Throwable {
		return null;
	}
	
	@Override
	public int getStdDataType() {
		return this.getPSDERAggDataDEFieldMap().getMajorPSDEField().getStdDataType();
	}

	@Override
	public String getFormulaFormat(String strDBType) {
		if(StringUtils.hasLength(this.strFormulaFormat)) {
			return this.strFormulaFormat;
		}
		
		if(this.formulaFormatMap == null) {
			this.formulaFormatMap = new HashMap<>();
		}
		
		String strFormat = this.formulaFormatMap.get(strDBType);
		if(StringUtils.isEmpty(strFormat)) {
			IPSDEFLogic iPSDEFLogic = this.getPSDERAggDataDEFieldMap().getMajorPSDEFieldMust().getUserPSDEFLogic();
			if(iPSDEFLogic != null)
			{
				try {
					strFormat = calcFormulaFormat(iPSDEFLogic, this.getDERBaseRuntimeContext().getDERRuntime().getMajorDataEntityRuntime().getSystemRuntime().getDBDialect(strDBType));
					this.formulaFormatMap.put(strDBType, strFormat);
				}
				catch (Throwable ex) {
					throw new DataEntityRuntimeException(this.getDERBaseRuntimeContext().getDERRuntime().getMinorDataEntityRuntime(), this.getDERBaseRuntimeContext().getDERRuntime(), String.format("计算关系聚合属性映射[%1$s]发生异常，%2$s",
							this.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		
		return strFormat;
	}
	
	
	protected String calcFormulaFormat(IPSDEFLogic iPSDEFLogic, IDBDialect iDBDialect) throws Throwable {
		
		IDEFCaseWhenLogicRuntime iDEFCaseWhenLogicRuntime = DEFCaseWhenLogicRuntime.getInstance(iPSDEFLogic);
		
		List<IDEFCaseWhenLogicNodeRuntime> defCaseWhenLogicNodeRuntimeList = iDEFCaseWhenLogicRuntime.getDEFCaseWhenLogicNodeRuntimes();
		if(defCaseWhenLogicNodeRuntimeList == null || defCaseWhenLogicNodeRuntimeList.size() == 0) {
			throw new Exception("未定义任何CASEWHEN逻辑");
		}
		
		StringBuilder sb = new StringBuilder();
		for(IDEFCaseWhenLogicNodeRuntime item : defCaseWhenLogicNodeRuntimeList) {
			if(item.getPSDELogicLinkGroupCond() == null) {
				continue;
			}
			
			String strCondition = getCaseCondition(item.getPSDELogicLinkGroupCond(), iDBDialect);
			if(!StringUtils.hasLength(strCondition)) {
				continue;
			}
			
			String strValue = null;
			
			if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(item.getValueType())) {
				strValue =String.valueOf(item.getValue());
				if(StringUtils.hasLength(strValue)) {
					strValue = iDBDialect.getDBObjStandardName(strValue);
				}
			}
			else		
				if(DELogicPrepareParamValueTypes.SRCVALUE.equals(item.getValueType())) {	
					strValue = String.valueOf(item.getValue());
					if(DataTypeUtils.isStringDataType(this.getStdDataType())) {
						strValue = String.format("'%1$s'", strValue);
					}
				}
				else
					if(DELogicPrepareParamValueTypes.NULLVALUE.equals(item.getValueType())) {	
						strValue = "NULL";
					}
			
			if(!StringUtils.hasLength(strValue)) {
				continue;
			}
			sb.append(String.format(" WHEN %1$s THEN %2$s", strCondition, strValue));
		}
		
		String strValue = null;	
		if(iDEFCaseWhenLogicRuntime.getDefaultDEFCaseWhenLogicNodeRuntime() != null) {
			IDEFCaseWhenLogicNodeRuntime item = iDEFCaseWhenLogicRuntime.getDefaultDEFCaseWhenLogicNodeRuntime();
			if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(item.getValueType())) {
				strValue =String.valueOf(item.getValue());
				if(StringUtils.hasLength(strValue)) {
					strValue = strValue.toLowerCase();
				}
			}
			else		
				if(DELogicPrepareParamValueTypes.SRCVALUE.equals(item.getValueType())) {	
					strValue = String.valueOf(item.getValue());
					if(DataTypeUtils.isStringDataType(this.getStdDataType())) {
						strValue = String.format("'%1$s'", strValue);
					}
				}
				else
					if(DELogicPrepareParamValueTypes.NULLVALUE.equals(item.getValueType())) {	
						strValue = "NULL";
					}
		}
			
		if(!StringUtils.hasLength(strValue)) {
			strValue = "NULL";
		}
		
		return String.format("CASE%1$s ELSE %2$s END", sb.toString(), strValue);
	}

	
	protected String getCaseCondition(IPSDELogicLinkCond iPSDELogicLinkCond, IDBDialect iDBDialect) throws Throwable {
		if (iPSDELogicLinkCond instanceof IPSDELogicLinkGroupCond) {
			List<String> list = new ArrayList<String>();
			IPSDELogicLinkGroupCond iPSDELogicLinkGroupCond = (IPSDELogicLinkGroupCond) iPSDELogicLinkCond;
			List<IPSDELogicLinkCond> psDELogicLinkCondList = iPSDELogicLinkGroupCond.getPSDELogicLinkConds();
			if (psDELogicLinkCondList != null) {
				for (IPSDELogicLinkCond item : psDELogicLinkCondList) {
					String strCondition = this.getCaseCondition(item, iDBDialect);
					if (StringUtils.hasLength(strCondition)) {
						list.add(strCondition);
					} else if (Conditions.OR.equals(iPSDELogicLinkGroupCond.getGroupOP())) {
						return null;
					}
				}
			}
			if (list.size() == 0) {
				return null;
			}
			boolean bFirst = true;
			StringBuilder sb = new StringBuilder();
			for (String strCondition : list) {
				if (bFirst) {
					bFirst = false;
				} else {
					sb.append(String.format(" %1$s ", iPSDELogicLinkGroupCond.getGroupOP()));
				}
				sb.append(strCondition);
			}
			if (iPSDELogicLinkGroupCond.isNotMode()) {
				return String.format("NOT(%1$s)", sb.toString());
			} else if (list.size() == 1) {
				return sb.toString();
			} else {
				return String.format("(%1$s)", sb.toString());
			}

		}

		if (iPSDELogicLinkCond instanceof IPSDELogicLinkSingleCond) {
			IPSDELogicLinkSingleCond iPSDELogicLinkSingleCond = (IPSDELogicLinkSingleCond) iPSDELogicLinkCond;
			if (StringUtils.isEmpty(iPSDELogicLinkSingleCond.getDstFieldName())) {
				return null;
			}
			String strCondValue = iPSDELogicLinkSingleCond.getParamValue();
//			if (StringUtils.hasLength(iPSDELogicLinkSingleCond.getPSVARTypeId())) {
//				if (iSearchContext == null) {
//					return null;
//				}
//				strCondValue = (String) iSearchContext.get(iPSDELogicLinkSingleCond.getCondValue());
//			}

			int nStdDataType = DataTypes.VARCHAR;
			IPSDEField iPSDEField = this.getDERBaseRuntimeContext().getDERRuntime().getMajorDataEntityRuntime().getPSDEField(iPSDELogicLinkSingleCond.getDstFieldName(), true);
			if(iPSDEField == null) {
				iPSDEField = this.getDERBaseRuntimeContext().getDERRuntime().getMinorDataEntityRuntime().getPSDEField(iPSDELogicLinkSingleCond.getDstFieldName(), true);
			}
			if(iPSDEField != null) {
				nStdDataType = iPSDEField.getStdDataType();
			}
			
			return iDBDialect.getConditionSQL(iDBDialect.getDBObjStandardName(iPSDELogicLinkSingleCond.getDstFieldName()), nStdDataType, iPSDELogicLinkSingleCond.getCondOP(), strCondValue, false, null);

		}

		throw new Exception(String.format("无法识别的逻辑条件类型[%1$s]", iPSDELogicLinkCond.getLogicType()));
	}
	
//	protected String calcDrillDownCondFormat(IPSDEFLogic iPSDEFLogic) throws Throwable {
//		
//		IDEFCaseWhenLogicRuntime iDEFCaseWhenLogicRuntime = DEFCaseWhenLogicRuntime.getInstance(iPSDEFLogic);
//		
//		List<IDEFCaseWhenLogicNodeRuntime> defCaseWhenLogicNodeRuntimeList = iDEFCaseWhenLogicRuntime.getDEFCaseWhenLogicNodeRuntimes();
//		if(defCaseWhenLogicNodeRuntimeList == null || defCaseWhenLogicNodeRuntimeList.size() == 0) {
//			throw new Exception("未定义任何CASEWHEN逻辑");
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		boolean bFirst = true;
//		boolean bMulti = false;
//		for(IDEFCaseWhenLogicNodeRuntime item : defCaseWhenLogicNodeRuntimeList) {
//			if(item.getPSDELogicLinkGroupCond() == null) {
//				continue;
//			}
//			
//			String strCondition = getCaseCondition(item.getPSDELogicLinkGroupCond());
//			if(!StringUtils.hasLength(strCondition)) {
//				continue;
//			}
//			
//			if(bFirst) {
//				bFirst = false;
//			}
//			else {
//				sb.append(" OR ");
//				bMulti = true;
//			}
//			sb.append(strCondition);
//		}
//		if(bMulti) {
//			return "(" + sb.toString() + ")";
//		}
//		else
//			return sb.toString();
//	}
}
