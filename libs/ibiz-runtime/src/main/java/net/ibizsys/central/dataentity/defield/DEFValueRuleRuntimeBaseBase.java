package net.ibizsys.central.dataentity.defield;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRQueryCountCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRRegExCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSimpleCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRStringLengthCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSysValueRuleCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRange2Condition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRange3Condition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRangeCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRecursionCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.action.DEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.defield.DEFDefaultValueTypes;
import net.ibizsys.runtime.dataentity.field.valuerule.DEFVRConditionException;
import net.ibizsys.runtime.dataentity.field.valuerule.DEFVRConditionTypes;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.res.SysRegExValueRuleRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.EntityFieldError;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DEFValueRuleRuntimeBaseBase implements IDEFValueRuleRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEFValueRuleRuntimeBaseBase.class);
	
	private IPSDEField iPSDEField = null;

	private IDEScriptLogicRuntime iDEScriptActionRuntime = null;
	
	public abstract ISystemRuntime getSystemRuntime();
	
	public abstract IDataEntityRuntime getDataEntityRuntime();
	
	public abstract IPSDEFValueRule getPSDEFValueRule();
	
	protected IPSDEField getPSDEField() {
		if(this.iPSDEField == null) {
			this.iPSDEField = this.getPSDEFValueRule().getParentPSModelObject(IPSDEField.class);
		}
		return this.iPSDEField;
	}
	
	@Override
	public boolean test(Object objValue, IEntityBase iEntityBase, EntityError entityError) throws Throwable {
		return this.onTest(objValue, iEntityBase, entityError);
	}
	
	protected boolean onTest(Object objValue, IEntityBase iEntityBase, EntityError entityError) throws Throwable{
		IPSDEField iPSDEField = this.getPSDEField();
		
		if(getPSDEFValueRule().isCustomCode()) {
			IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFCHECK, getPSDEFValueRule().getScriptCode());
			Object objRet = iDEScriptActionRuntime.execute(new Object[] { iEntityBase, null, iPSDEField, null });
			if (objRet != null) {
				boolean bCheckOk = true;
				String strErrorInfo = null;
				if (objRet instanceof Boolean) {
					bCheckOk = (Boolean) objRet;
				} else if (objRet instanceof String) {
					bCheckOk = false;
					strErrorInfo = (String) objRet;
				}

				if (!bCheckOk) {
					EntityFieldError entityFieldError = new EntityFieldError();
					entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
					entityFieldError.setPSDEField(iPSDEField);
					entityFieldError.setErrorInfo(strErrorInfo);
					entityError.register(entityFieldError);
				}
				return bCheckOk;
			}
			return true;
		}
		

		IPSDEFVRGroupCondition iPSDEFVRGroupCondition = getPSDEFValueRule().getPSDEFVRGroupCondition();
		if (iPSDEFVRGroupCondition == null) {
			return true;
		}
		try {
			if (checkFieldValueRuleGroupCondition(objValue, iEntityBase, iPSDEFVRGroupCondition, iPSDEField)) {
				return true;
			}

			if (entityError != null) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
				entityFieldError.setPSDEField(iPSDEField);
				entityFieldError.setPSDEFValueRule(getPSDEFValueRule());
				entityError.register(entityFieldError);
			}
		} catch (DEFVRConditionException ex) {
			if (entityError != null) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
				entityFieldError.setPSDEField(iPSDEField);
				entityFieldError.setPSDEFValueRule(getPSDEFValueRule());
				entityFieldError.setPSDEFVRCondition(ex.getPSDEFVRCondition());
				entityFieldError.setErrorInfo(ex.getMessage());
				entityError.register(entityFieldError);
			}
		}

		return false;
	}
	
	protected IDEScriptLogicRuntime getDEScriptLogicRuntime(String strLogicMode, String strScriptCode) {
		if(this.iDEScriptActionRuntime == null) {
			IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDataEntityRuntime().createDEScriptLogicRuntime(strLogicMode, strScriptCode);
			try {
				iDEScriptActionRuntime.init(this.getSystemRuntime().getSystemRTScriptContext(), getDataEntityRuntime(), strLogicMode, strScriptCode);
				this.iDEScriptActionRuntime = iDEScriptActionRuntime;
			} catch (Exception e) {
				log.error(String.format("初始化实体脚本逻辑运行时对象发生异常，%1$s",e.getMessage()),e);
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("初始化实体脚本逻辑运行时对象发生异常，%1$s",e.getMessage()), e);
			}
		}
		return this.iDEScriptActionRuntime;
	}
	
	protected IDEScriptLogicRuntime createDEScriptLogicRuntime(String strLogicMode, String strScriptCode) {
		DEScriptLogicRuntime deScriptActionRuntime = new DEScriptLogicRuntime();
		return deScriptActionRuntime;
	}
	
	
	protected boolean checkFieldValueRuleGroupCondition(Object objValue, IEntityBase arg0, IPSDEFVRGroupCondition iPSDEFVRGroupCondition, IPSDEField iPSDEField) throws Throwable {
		List<IPSDEFVRCondition> psDEFVRConditions = iPSDEFVRGroupCondition.getPSDEFVRConditions();
		if (psDEFVRConditions == null) {
			return true;
		}

		boolean bRet = true;
		boolean bAndMode = Conditions.AND.equals(iPSDEFVRGroupCondition.getCondOp());
		if (!bAndMode) {
			bRet = false;
		}
		for (IPSDEFVRCondition iPSDEFVRCondition : psDEFVRConditions) {
			if (iPSDEFVRCondition instanceof IPSDEFVRSingleCondition) {
				IPSDEFVRSingleCondition iPSDEFVRSingleCondition = (IPSDEFVRSingleCondition)iPSDEFVRCondition;
				Object realValue = objValue;
				IPSDEField realPSDEField = iPSDEField;
				if(StringUtils.hasLength(iPSDEFVRSingleCondition.getDEFName())) {
					//重新指定属性
					realPSDEField = getDataEntityRuntime().getPSDEField(iPSDEFVRSingleCondition.getDEFName());
					if(realPSDEField != null) {
						realValue = getDataEntityRuntime().getFieldValue(arg0, realPSDEField);
					}
					else {
						realValue = getDataEntityRuntime().getFieldValue(arg0, iPSDEFVRSingleCondition.getDEFName());
					}
				}
				else {
					realValue = objValue;
					realPSDEField = iPSDEField;
				}
				
				
				if (this.checkFieldValueRuleSingleCondition(realValue, arg0, (IPSDEFVRSingleCondition) iPSDEFVRCondition, realPSDEField)) {
					if (!bAndMode) {
						bRet = true;
						break;
					}
				} else {
					if (bAndMode) {
						bRet = false;
						break;
					}
				}
				continue;
			}

			if (iPSDEFVRCondition instanceof IPSDEFVRGroupCondition) {
				if (this.checkFieldValueRuleGroupCondition(objValue, arg0, (IPSDEFVRGroupCondition) iPSDEFVRCondition, iPSDEField)) {
					if (!bAndMode) {
						bRet = true;
						break;
					}
				} else {
					if (bAndMode) {
						bRet = false;
						break;
					}
				}
				continue;
			}
		}

		if (iPSDEFVRGroupCondition.isNotMode()) {
			bRet = !bRet;
		}

		if (iPSDEFVRGroupCondition.isKeyCond() && !bRet) {
			throw createDEFVRConditionException(iPSDEFVRGroupCondition, null, null, iPSDEField);
			// throw new DEFVRConditionException(iPSDEFVRGroupCondition, null,
			// iPSDEField, this);
		}
		return bRet;
	}

	protected boolean checkFieldValueRuleSingleCondition(Object objValue, IEntityBase arg0, IPSDEFVRSingleCondition iPSDEFVRSingleCondition, IPSDEField iPSDEField) throws Throwable {

		if (DEFVRConditionTypes.REGEX.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldRegExCondition(objValue, arg0, (IPSDEFVRRegExCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.STRINGLENGTH.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldStringLengthCondition(objValue, arg0, (IPSDEFVRStringLengthCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.SIMPLE.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldSimpleCondition(objValue, arg0, (IPSDEFVRSimpleCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.QUERYCOUNT.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldQueryCountCondition(objValue, arg0, (IPSDEFVRQueryCountCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.VALUERECURSION.equals(iPSDEFVRSingleCondition.getCondType())) {
			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			if (actionSession != null && actionSession.isIgnoreRecursionCheck()) {
				return true;
			}
			return this.checkFieldValueRecursionCondition(objValue, arg0, (IPSDEFVRValueRecursionCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.SYSVALUERULE.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldSysValueRuleCondition(objValue, arg0, (IPSDEFVRSysValueRuleCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.VALUERANGE.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldValueRangeCondition(objValue, arg0, (IPSDEFVRValueRangeCondition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.VALUERANGE2.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldValueRange2Condition(objValue, arg0, (IPSDEFVRValueRange2Condition) iPSDEFVRSingleCondition, iPSDEField);
		}

		if (DEFVRConditionTypes.VALUERANGE3.equals(iPSDEFVRSingleCondition.getCondType())) {
			return this.checkFieldValueRange3Condition(objValue, arg0, (IPSDEFVRValueRange3Condition) iPSDEFVRSingleCondition, iPSDEField);
		}

		log.warn(String.format("无法检查属性值规则条件[%1$s]，不支持类型为[%2$s]", iPSDEFVRSingleCondition.getName(), iPSDEFVRSingleCondition.getCondType()));
		return true;
	}

	protected boolean checkFieldRegExCondition(Object objValue, Object arg0, IPSDEFVRRegExCondition iPSDEFVRRegExCondition, IPSDEField iPSDEField) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		String strValue = "";
		if (objValue != null) {
			if (!(objValue instanceof String)) {
				if(iPSDEField != null) {
					throw createDEFVRConditionException(iPSDEFVRRegExCondition, String.format("属性[%1$s]值不是字符类型", iPSDEField.getName()), IDataEntityRuntimeBase.MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE, iPSDEField);
				}
				else {
					throw createDEFVRConditionException(iPSDEFVRRegExCondition, String.format("值不是字符类型"), IDataEntityRuntimeBase.MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE, iPSDEField);
				}
			}
			strValue = (String) objValue;
		}

		if (!StringUtils.hasLength(strValue))
			return true;

		String strRuleInfo = iPSDEFVRRegExCondition.getRuleInfo();

		boolean bTryMode = !iPSDEFVRRegExCondition.isKeyCond();
		String strRegEx = iPSDEFVRRegExCondition.getRegExCode();
		Pattern p = SysRegExValueRuleRuntime.getPattern(strRegEx);
		Matcher m = p.matcher(strValue);
		boolean b = m.matches();
		if (!b) {
			if (bTryMode)
				return false;

			// throw new DEFVRConditionException(iPSDEFVRRegExCondition,
			// strRuleInfo, iPSDEField, this);
			throw createDEFVRConditionException(iPSDEFVRRegExCondition, strRuleInfo, null, iPSDEField);
		}

		return true;
	}

	protected boolean checkFieldStringLengthCondition(Object objValue, IEntityBase arg0, IPSDEFVRStringLengthCondition iPSDEFVRStringLengthCondition, IPSDEField iPSDEField) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		String strRuleInfo = iPSDEFVRStringLengthCondition.getRuleInfo();
		// if (!StringUtils.hasLength(strRuleInfo)) {
		// strRuleInfo =
		// this.getUserContext().getLocalization(MSG_CHECKFIELDSTRINGLENGTHRULE_INFO,
		// "内容长度必须符合范围规则");
		// }

		String strValue = "";
		if (objValue != null) {
			if (!(objValue instanceof String)) {

				strValue = JsonUtils.toString(objValue);
				// throw new
				// DEFVRConditionException(iPSDEFVRStringLengthCondition,
				// actionSession.getUserContext().getLocalization(MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE,
				// new Object[] { iPSDEField }, String.format("属性[%1$s]值不是字符类型",
				// iPSDEField.getName())), iPSDEField, this);
				// throw
				// createDEFVRConditionException(iPSDEFVRStringLengthCondition,
				// String.format("属性[%1$s]值不是字符类型", iPSDEField.getName()),
				// MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE, iPSDEField);
			} else {
				strValue = (String) objValue;
			}

		}

		Integer nMinValue = iPSDEFVRStringLengthCondition.getMinValue();
		Integer nMaxValue = iPSDEFVRStringLengthCondition.getMaxValue();
		boolean bIncMinValue = iPSDEFVRStringLengthCondition.isIncludeMinValue();
		boolean bIncMaxValue = iPSDEFVRStringLengthCondition.isIncludeMaxValue();
		boolean bTryMode = !iPSDEFVRStringLengthCondition.isKeyCond();
		int nLength = strValue.length();
		if (nMinValue != null) {
			if (bIncMinValue) {
				if (nLength < nMinValue) {
					if (bTryMode)
						return false;

					// throw new
					// DEFVRConditionException(iPSDEFVRStringLengthCondition,
					// strRuleInfo, iPSDEField, this);
					throw createDEFVRConditionException(iPSDEFVRStringLengthCondition, strRuleInfo, null, iPSDEField);
				}
			} else {
				if (nLength <= nMinValue) {
					if (bTryMode)
						return false;
					// throw new
					// DEFVRConditionException(iPSDEFVRStringLengthCondition,
					// strRuleInfo, iPSDEField, this);
					throw createDEFVRConditionException(iPSDEFVRStringLengthCondition, strRuleInfo, null, iPSDEField);
				}
			}
		}

		if (nMaxValue != null) {
			if (bIncMaxValue) {
				if (nLength > nMaxValue) {
					if (bTryMode)
						return false;
					// throw new
					// DEFVRConditionException(iPSDEFVRStringLengthCondition,
					// strRuleInfo, iPSDEField, this);
					throw createDEFVRConditionException(iPSDEFVRStringLengthCondition, strRuleInfo, null, iPSDEField);
				}
			} else {
				if (nLength >= nMaxValue) {
					if (bTryMode)
						return false;
					// throw new
					// DEFVRConditionException(iPSDEFVRStringLengthCondition,
					// strRuleInfo, iPSDEField, this);
					throw createDEFVRConditionException(iPSDEFVRStringLengthCondition, strRuleInfo, null, iPSDEField);
				}
			}
		}

		return true;
	}

	protected boolean checkFieldSimpleCondition(Object objValue, IEntityBase arg0, IPSDEFVRSimpleCondition iPSDEFVRSimpleCondition, IPSDEField iPSDEField) throws Throwable {
		String strRuleInfo = iPSDEFVRSimpleCondition.getRuleInfo();
		// if (!StringUtils.hasLength(strRuleInfo)) {
		// strRuleInfo =
		// this.getUserContext().getLocalization(MSG_CHECKFIELDSIMPLERULE_INFO,
		// "内容必须符合值规则");
		// }
		int nStdDataType = iPSDEField!=null ? iPSDEField.getStdDataType() : DataTypes.UNKNOWN;
		String strParamType = iPSDEFVRSimpleCondition.getParamType();
		String strParamValue = iPSDEFVRSimpleCondition.getParamValue();
		boolean bTryMode = !iPSDEFVRSimpleCondition.isKeyCond();

		Object objDst = this.calcFieldValue(arg0, iPSDEField, strParamType, strParamValue);
		if (this.getSystemRuntime().testValueCond(objValue, iPSDEFVRSimpleCondition.getCondOp(), objDst, nStdDataType)) {
			return true;
		} else {
			if (bTryMode) {
				return false;
			}
			// throw new DEFVRConditionException(iPSDEFVRSimpleCondition,
			// strRuleInfo, iPSDEField, this);
			throw createDEFVRConditionException(iPSDEFVRSimpleCondition, strRuleInfo, null, iPSDEField);
		}

	}

	protected boolean checkFieldSysValueRuleCondition(Object objValue, IEntityBase arg0, IPSDEFVRSysValueRuleCondition iPSDEFVRSysValueRuleCondition, IPSDEField iPSDEField) throws Throwable {

		// ISystemValueRuleModel iSystemValueRuleModel =
		// this.getSystemModel().getSystemValueRuleModel(strSysValueRuleId);
		// return iSystemValueRuleModel.check(et, strFieldName, bTempMode, null,
		// strRuleInfo, bTryMode);
		if (objValue == null)
			return true;

		String strRuleInfo = iPSDEFVRSysValueRuleCondition.getRuleInfo();

		IPSSysValueRule iPSSysValueRule = iPSDEFVRSysValueRuleCondition.getPSSysValueRule();
		if (iPSSysValueRule == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法获取属性规则项[%1$s]使用的系统值规则", iPSDEFVRSysValueRuleCondition.getName()), Errors.MODELERROR);
		}

		boolean bTryMode = !iPSDEFVRSysValueRuleCondition.isKeyCond();
		ISysValueRuleRuntime iSysValueRuleRuntime = this.getSystemRuntime().getSysValueRuleRuntime(iPSSysValueRule);
		if (iSysValueRuleRuntime.test(objValue, arg0, iPSDEField, this.getDataEntityRuntime())) {
			return true;
		} else {
			if (bTryMode) {
				return false;
			}
			// throw new DEFVRConditionException(iPSDEFVRSysValueRuleCondition,
			// strRuleInfo, iPSDEField, this);
			throw createDEFVRConditionException(iPSDEFVRSysValueRuleCondition, strRuleInfo, null, iPSDEField);
		}
	}

	protected boolean checkFieldValueRecursionCondition(Object objValue, IEntityBase arg0, IPSDEFVRValueRecursionCondition iPSDEFVRValueRecursionCondition, IPSDEField iPSDEField) throws Throwable {
		return true;
	}

	protected boolean checkFieldQueryCountCondition(Object objValue, IEntityBase arg0, IPSDEFVRQueryCountCondition iPSDEFVRQueryCountCondition, IPSDEField iPSDEField) throws Throwable {
		return true;
	}

	protected boolean checkFieldDuplicateCondition(Object objValue, IEntityBase arg0, IPSDEField iPSDEField) throws Throwable {
		return true;
	}

	protected boolean checkFieldValueRangeCondition(Object objValue, IEntityBase arg0, IPSDEFVRValueRangeCondition iPSDEFVRValueRangeCondition, IPSDEField iPSDEField) throws Throwable {
		return true;
	}

	protected boolean checkFieldValueRange2Condition(Object objValue, IEntityBase arg0, IPSDEFVRValueRange2Condition iPSDEFVRValueRange2Condition, IPSDEField iPSDEField) throws Throwable {

		if (objValue == null)
			return true;

		String strRuleInfo = iPSDEFVRValueRange2Condition.getRuleInfo();

		double fSrcValue = 0;
		if (objValue instanceof Double) {
			fSrcValue = (Double) objValue;
		} else {
			String strValue = objValue.toString();
			if (!StringUtils.hasLength(strValue))
				return true;
			fSrcValue = Double.parseDouble(objValue.toString());
		}

		Double fMinValue = iPSDEFVRValueRange2Condition.getMinValue();
		Double fMaxValue = iPSDEFVRValueRange2Condition.getMaxValue();
		boolean bIncMinValue = iPSDEFVRValueRange2Condition.isIncludeMinValue();
		boolean bIncMaxValue = iPSDEFVRValueRange2Condition.isIncludeMaxValue();
		boolean bTryMode = !iPSDEFVRValueRange2Condition.isKeyCond();

		if (fMinValue != null) {
			if (bIncMinValue) {
				if (fSrcValue < fMinValue) {
					if (bTryMode)
						return false;
					throw createDEFVRConditionException(iPSDEFVRValueRange2Condition, strRuleInfo, null, iPSDEField);
				}
			} else {
				if (fSrcValue <= fMinValue) {
					if (bTryMode)
						return false;
					throw createDEFVRConditionException(iPSDEFVRValueRange2Condition, strRuleInfo, null, iPSDEField);
				}
			}
		}

		if (fMaxValue != null) {
			if (bIncMaxValue) {
				if (fSrcValue > fMaxValue) {
					if (bTryMode)
						return false;
					throw createDEFVRConditionException(iPSDEFVRValueRange2Condition, strRuleInfo, null, iPSDEField);
				}
			} else {
				if (fSrcValue >= fMaxValue) {
					if (bTryMode)
						return false;
					throw createDEFVRConditionException(iPSDEFVRValueRange2Condition, strRuleInfo, null, iPSDEField);
				}
			}
		}

		return true;
	}

	protected boolean checkFieldValueRange3Condition(Object objValue, IEntityBase arg0, IPSDEFVRValueRange3Condition iPSDEFVRValueRange3Condition, IPSDEField iPSDEField) throws Throwable {

		if (objValue == null)
			return true;

		String strRuleInfo = iPSDEFVRValueRange3Condition.getRuleInfo();

		String[] values = iPSDEFVRValueRange3Condition.getValueRanges();
		boolean bTryMode = !iPSDEFVRValueRange3Condition.isKeyCond();
		int nStdDataType = iPSDEField!=null? iPSDEField.getStdDataType():DataTypes.UNKNOWN;

		if (values != null) {

			for (String strValue : values) {
				if (this.getSystemRuntime().compareValue(objValue, strValue, nStdDataType) == 0)
					return true;
			}
			if (bTryMode)
				return false;
			// throw new DEFVRConditionException(iPSDEFVRValueRange3Condition,
			// strRuleInfo, iPSDEField, this);
			throw createDEFVRConditionException(iPSDEFVRValueRange3Condition, strRuleInfo, null, iPSDEField);
		} else {
			if (bTryMode)
				return false;
			// throw new DEFVRConditionException(iPSDEFVRValueRange3Condition,
			// strRuleInfo, iPSDEField, this);
			throw createDEFVRConditionException(iPSDEFVRValueRange3Condition, strRuleInfo, null, iPSDEField);
		}
	}
	
	/**
	 * 计算默认值
	 * 
	 * @param entity
	 * @param iPSDEField
	 * @param strDefaultValueType
	 * @param strDefaultValue
	 * @return
	 * @throws Exception
	 */
	protected Object calcFieldValue(IEntityBase entity, IPSDEField iPSDEField, String strDefaultValueType, String strDefaultValue) throws Exception {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		if (!StringUtils.hasLength(strDefaultValueType) 
				|| "VALUE".equals(strDefaultValueType)) {
			// 直接值
			Object objSource = this.getSystemRuntime().convertValue(iPSDEField.getStdDataType(), strDefaultValue);
			return objSource;
		}

		if (DEFDefaultValueTypes.SESSION.equals(strDefaultValueType) && StringUtils.hasLength(strDefaultValue)) {
			// 用户全局对象属性
			Object objSource = ActionSessionManager.getUserContextMust().getSessionParam(strDefaultValue);
			return objSource;
		}

		if (DEFDefaultValueTypes.APPLICATION.equals(strDefaultValueType) && StringUtils.hasLength(strDefaultValue)) {
			// 系统全局对象属性
			Object objSource = this.getSystemRuntime().getGlobalParam(strDefaultValue);
			return objSource;
		}

		if (DEFDefaultValueTypes.UNIQUEID.equals(strDefaultValueType)) {
			// 唯一编码
			Object objSource = UUID.randomUUID().toString();
			return objSource;
		}

		if ((DEFDefaultValueTypes.PARAM.equals(strDefaultValueType) || "ENTITYFIELD".equals(strDefaultValueType)) && StringUtils.hasLength(strDefaultValue)) {
			Object objSource = null;
			IPSDEField srcPSDEField = this.getDataEntityRuntime().getPSDEField(strDefaultValue.toUpperCase());
			if (srcPSDEField != null) {
				objSource = this.getDataEntityRuntime().getFieldValue(entity, srcPSDEField);
			} else if (entity instanceof IEntity) {
				objSource = ((IEntity) entity).get(strDefaultValue);
			} else {
				log.warn(String.format("无法识别的数据对象，无法获取值"));
				return null;
			}

			// 数据对象属性
			return objSource;
		}

		if (DEFDefaultValueTypes.OPERATOR.equals(strDefaultValueType)) {
			// 当前操作用户(编号)
			Object objSource = actionSession.getUserContextMust().getUserid();
			return objSource;
		}

		if (DEFDefaultValueTypes.OPERATORNAME.equals(strDefaultValueType)) {
			// 当前操作用户(名称)
			Object objSource = actionSession.getUserContextMust().getUsername();
			return objSource;
		}

		if (DEFDefaultValueTypes.CURTIME.equals(strDefaultValueType)) {
			// 当前时间
			Object objSource = new java.sql.Time(System.currentTimeMillis());
			return objSource;
		}

//		if (DEFDefaultValueTypes.EXPRESSION.equals(strDefaultValueType)) {
//			IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDataEntityRuntime().getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, strDefaultValue, false);
//			return iDEScriptActionRuntime.execute(new Object[] { entity });
//		}

//		if (DEFDefaultValueTypes.ORDERVALUE.equals(strDefaultValueType)) {
//			return this.calcOrderValue(entity, iPSDEField, strDefaultValue);
//		}

//		if( DEFDefaultValueTypes.USER.equals(strDefaultValueType)
//			|| DEFDefaultValueTypes.USER2.equals(strDefaultValueType)
//			|| DEFDefaultValueTypes.USER3.equals(strDefaultValueType)
//			|| DEFDefaultValueTypes.USER4.equals(strDefaultValueType)) {
//			return null;
//		}
//		
		log.warn(String.format("无法计算默认值，不支持类型为[%1$s]", strDefaultValueType));
		return null;
	}
	
	
	protected DEFVRConditionException createDEFVRConditionException(IPSDEFVRCondition iPSDEFVRCondition, String strInfo, String strResTag, IPSDEField iPSDEField) {
		return new DEFVRConditionException(iPSDEFVRCondition, strInfo, iPSDEField, this.getDataEntityRuntime());
	}

}
