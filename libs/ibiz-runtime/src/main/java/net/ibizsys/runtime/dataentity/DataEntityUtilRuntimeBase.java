package net.ibizsys.runtime.dataentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.PSModelEnums.DEActionPrepareLastMode;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionParam;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDataDEField;
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
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetParam;
import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.action.DEActionParamModes;
import net.ibizsys.runtime.dataentity.action.DEActionParamValueTypes;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.action.DEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncEvents;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncInRuntime;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncOutRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime;
import net.ibizsys.runtime.dataentity.defield.DEFDefaultValueTypes;
import net.ibizsys.runtime.dataentity.defield.DEFSequenceModes;
import net.ibizsys.runtime.dataentity.defield.DEFTranslatorModes;
import net.ibizsys.runtime.dataentity.defield.IDEFValueRuleRuntime;
import net.ibizsys.runtime.dataentity.der.DER1NMasterRSTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.dataentity.field.valuerule.DEFVRConditionException;
import net.ibizsys.runtime.dataentity.field.valuerule.DEFVRConditionTypes;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.notify.DENotifyRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.print.DEPrintRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.DEReportRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.dataentity.security.DEDataAuditModes;
import net.ibizsys.runtime.dataentity.util.DEDataAuditUtilRuntime;
import net.ibizsys.runtime.dataentity.util.DEDynaStorageUtilRuntime;
import net.ibizsys.runtime.dataentity.util.DEUtilTypes;
import net.ibizsys.runtime.dataentity.util.IDEDataAuditUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.res.SysDigestTranslatorRuntime;
import net.ibizsys.runtime.res.SysEncryptTranslatorRuntime;
import net.ibizsys.runtime.res.SysLCaseTranslatorRuntime;
import net.ibizsys.runtime.res.SysRegExValueRuleRuntime;
import net.ibizsys.runtime.res.SysUCaseTranslatorRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.EntityFieldError;
import net.ibizsys.runtime.util.EntityListUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptSearchContext;
import net.ibizsys.runtime.util.script.ScriptEntity;

public abstract class DataEntityUtilRuntimeBase extends DataEntityRuntimeBaseBase implements IDataEntityRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntimeBaseBase.class);
	
	public static final String ACTIONSESSIONPARAM_FILLENTITYFULLINFO_X = "_FILLENTITYFULLINFO__%1$s__%2$s";
	                                                                            
	public static final String ACTIONSESSIONPARAM_FILLENTITYFULLINFO_EXIST_X = "_FILLENTITYFULLINFO_EXIST__%1$s__%2$s";
	
	/**
	 * 嵌套数据对象集合：参数1：主实体，参数2：嵌套属性，参数3：主实体键值
	 */
	public static final String ACTIONSESSIONPARAM_NESTEDENTITIES_X = "_NESTEDENTITIES__%1$s__%2$s__%3$s";
	
	private Map<String, List<IPSDEField>> psDEDataQueryFieldsMap = new HashMap<String, List<IPSDEField>>();

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this;
	}

	/**
	 * 获取数据审计功能数据查询
	 * 
	 * @return
	 */
	public IPSDEDataQuery getAuditPSDEDataQuery() {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	/**
	 * 获取实体数据审计功能组件
	 * 
	 * @return
	 */

	public IDEDataAuditUtilRuntime getDEDataAuditUtilRuntime() {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	/**
	 * 获取实体数据动态存储功能组件
	 * 
	 * @return
	 */
	public IDEDynaStorageUtilRuntime getDEDynaStorageUtilRuntime() {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	/**
	 * 填充数据对象的默认值
	 * 
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void fillEntityDefaultValues(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		// boolean bCreateMode = DEActions.CREATE.equals(strActionName) ||
		// (iPSDEAction != null &&
		// DEActionModes.CREATE.equals(iPSDEAction.getActionMode()));

		String strActionMode = (iPSDEAction != null) ? iPSDEAction.getActionMode() : strActionName;

		for (IPSDEField iPSDEField : psDEFields) {

			if (isFillFieldDefaultValueWhenNull()) {
				if (this.getFieldValue(arg0, iPSDEField) != null) {
					continue;
				}
			} else {
				if (this.containsFieldValue(arg0, iPSDEField)) {
					continue;
				}
			}

			String strDefaultValue = iPSDEField.getDefaultValue();
			String strDefaultValueType = iPSDEField.getDefaultValueType();

			// 支持直接默认值
			if (!StringUtils.hasLength(strDefaultValue) && !StringUtils.hasLength(strDefaultValueType)) {
				continue;
			}

			Object objValue = calcFieldValue(arg0, iPSDEField, strDefaultValueType, strDefaultValue);
			this.setFieldValue(arg0, iPSDEField, objValue);
		}

		// 执行属性默认值逻辑
		for (IPSDEField iPSDEField : psDEFields) {

			if (isFillFieldDefaultValueWhenNull()) {
				if (this.getFieldValue(arg0, iPSDEField) != null) {
					continue;
				}
			} else {
				if (this.containsFieldValue(arg0, iPSDEField)) {
					continue;
				}
			}

			IPSDEFLogic iPSDEFLogic = iPSDEField.getDefaultValuePSDEFLogic();
			if (iPSDEFLogic == null) {
				continue;
			}
			if (iPSDEFLogic.isCustomCode()) {
				if (StringUtils.hasLength(iPSDEFLogic.getScriptCode())) {
					IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFDEFAULT, iPSDEFLogic.getScriptCode(), iDynaInstRuntime != null);
					if (iDEScriptActionRuntime == null) {
						iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFDEFAULT, iPSDEFLogic.getScriptCode());
					}

					/**
					 * 20220314 调整为接收返回值
					 */
					Object objValue = iDEScriptActionRuntime.execute(new Object[] { arg0, strActionMode, iPSDEField, iPSDEAction });
					this.setFieldValue(arg0, iPSDEField, objValue);

					// Object objValue = iDEScriptActionRuntime.execute(new
					// Object[] {arg0, strActionMode, iPSDEField, iPSDEAction});
					// if(!ObjectUtils.isEmpty(objValue)) {
					// this.setFieldValue(arg0, iPSDEField, objValue);
					// }

				}
			} else {
				// log.warn(String.format("无法执行属性[%1$s]默认值逻辑[%2$s]",iPSDEField.getName(),iPSDEFLogic.getName()));
				IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDEFLogic);
				Object objValue = iDELogicRuntime.execute(new Object[] { arg0, strActionMode, iPSDEField, iPSDEAction });
				this.setFieldValue(arg0, iPSDEField, objValue);
			}

		}
	}

	/**
	 * 填充数据对象的序列值
	 * 
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void fillEntitySequenceValues(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		boolean bCreateMode = DEActions.CREATE.equals(strActionName) || (iPSDEAction != null && DEActionModes.CREATE.equals(iPSDEAction.getActionMode()));

		for (IPSDEField iPSDEField : psDEFields) {

			if (isFillFieldDefaultValueWhenNull()) {
				if (this.getFieldValue(arg0, iPSDEField) != null) {
					continue;
				}
			} else {
				if (this.containsFieldValue(arg0, iPSDEField)) {
					continue;
				}
			}

			String strSequenceMode = iPSDEField.getSequenceMode();
			if (StringUtils.hasLength(strSequenceMode) && !DEFSequenceModes.NONE.equals(strSequenceMode)) {
				if ((DEFSequenceModes.CREATE.equals(strSequenceMode) && bCreateMode) || (DEFSequenceModes.GETDRAFT.equals(strSequenceMode) && !bCreateMode)) {
					IPSSysSequence iPSSysSequence = iPSDEField.getPSSysSequence();
					ISysSequenceRuntime iSysSequenceRuntime = this.getCurrentSystemRuntimeBase(false).getSysSequenceRuntime(iPSSysSequence);
					Object objValue = iSysSequenceRuntime.get(arg0, iPSDEField, this);
					this.setFieldValue(arg0, iPSDEField, objValue);
					continue;
				}
			}
		}
	}

	/**
	 * 是否在属性值为空的情况下填充默认值，默认为是
	 * 
	 * @return
	 */
	protected boolean isFillFieldDefaultValueWhenNull() {
		return true;
	}

	/**
	 * 填充数据对象的完整信息
	 * 
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void fillEntityFullInfo(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (this.getInheritDataEntityRuntime() != null && this.getPSDERInherit() != null) {
			IEntityBase inheritEntity = this.getInheritDataEntityRuntime().createEntity();
			List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
			if (!ObjectUtils.isEmpty(psDEFields)) {
				for (IPSDEField iPSDEField : psDEFields) {
					if (!iPSDEField.isLinkDEField()) {
						continue;
					}
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (iPSLinkDEField.getPSDER() == null || !this.getPSDERInherit().getName().equals(iPSLinkDEField.getPSDER().getName())) {
						continue;
					}

					if (!this.containsFieldValue(arg0, iPSLinkDEField)) {
						continue;
					}
					Object objValue = this.getFieldValue(arg0, iPSLinkDEField);
					this.getInheritDataEntityRuntime().setFieldValue(inheritEntity, iPSLinkDEField.getRelatedPSDEFieldMust(), objValue);
				}
				this.getInheritDataEntityRuntime().fillEntityFullInfo(inheritEntity, strActionName);
				// 回填
				for (IPSDEField iPSDEField : psDEFields) {
					if (!iPSDEField.isLinkDEField()) {
						continue;
					}
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (iPSLinkDEField.getPSDER() == null || !this.getPSDERInherit().getName().equals(iPSLinkDEField.getPSDER().getName())) {
						continue;
					}

					if (!this.getInheritDataEntityRuntime().containsFieldValue(inheritEntity, iPSLinkDEField.getRelatedPSDEFieldMust())) {
						continue;
					}
					Object objValue = this.getInheritDataEntityRuntime().getFieldValue(inheritEntity, iPSLinkDEField.getRelatedPSDEFieldMust());
					this.setFieldValue(arg0, iPSLinkDEField, objValue);
				}
			}
		}

		// 查询实体的从关系
		java.util.List<IPSDERBase> psDERBases = iPSDataEntity.getMinorPSDERs();
		if (psDERBases == null) {
			return;
		}

		// 填充继承实体的关系信息
		for (IPSDERBase iPSDERBase : psDERBases) {
			if (DERTypes.DER1N.equals(iPSDERBase.getDERType())) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				this.fillEntityFullInfo(arg0, strActionName, iPSDEAction, iPSDER1N, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}
	}

	protected void fillEntityFullInfo(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDER1N iPSDER1N, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (!this.containsFieldValue(arg0, iPSDER1N.getPSPickupDEField())) {
			return;
		}

		Object objPickupValue = this.getFieldValue(arg0, iPSDER1N.getPSPickupDEField());
		if (ObjectUtils.isEmpty(objPickupValue)) {
			// 无值，执行置空

			List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
			if (!ObjectUtils.isEmpty(psDEFields)) {
				for (IPSDEField iPSDEField : psDEFields) {
					if (!iPSDEField.isLinkDEField()) {
						continue;
					}
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (iPSLinkDEField.getPSDER() == null || !iPSDER1N.getName().equals(iPSLinkDEField.getPSDER().getName())) {
						continue;
					}
					// 不是外键
					if (iPSDER1N.getPSPickupDEField().getName().equals(iPSLinkDEField.getName())) {
						continue;
					}

					// if (iPSDEField.isPhisicalDEField() ||
					// DEActions.GETDRAFT.equals(strActionName) || (iPSDEAction
					// != null &&
					// DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())))
					// {
					if (iPSDEField.isPhisicalDEField()) {
						if(iPSDEField instanceof IPSPickupDataDEField) {
							IPSPickupDataDEField iPSPickupDataDEField = (IPSPickupDataDEField)iPSDEField;
							if(iPSPickupDataDEField.isIgnoreRefresh()) {
								continue;
							}
						}
						
						this.setFieldValue(arg0, iPSDEField, null);
					}
				}
			}

		} else {
			// 查看是否有物理关系属性
			ActionSession actionSession = ActionSessionManager.getCurrentSession();

			
			
			List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
			if (!ObjectUtils.isEmpty(psDEFields)) {
				boolean bFillInfo = false;
				boolean bUpdateRefInfo = false;
				boolean bCalcUpdateRefInfo = ((iPSDER1N.getMasterRS() & DER1NMasterRS.INHERIT.value) == 0);
				for (IPSDEField iPSDEField : psDEFields) {
					if (!iPSDEField.isLinkDEField()) {
						continue;
					}
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (iPSLinkDEField.getPSDER() == null || !iPSDER1N.getName().equals(iPSLinkDEField.getPSDER().getName())) {
						continue;
					}
					// 不是外键
					if (iPSDER1N.getPSPickupDEField().getName().equals(iPSLinkDEField.getName())) {
						continue;
					}

					boolean bIgnoreRefresh = false;
					boolean bWriteBack = false;
					if(iPSDEField instanceof IPSPickupDataDEField) {
						bIgnoreRefresh = ((IPSPickupDataDEField)iPSDEField).isIgnoreRefresh();
						bWriteBack = ((IPSPickupDataDEField)iPSDEField).isEnableWriteBack();
					}
					
					if ((iPSDEField.isPhisicalDEField() && !bIgnoreRefresh) || DEActions.GETDRAFT.equalsIgnoreCase(strActionName) || (iPSDEAction != null && DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode()))) {
						bFillInfo = true;
						if(!bCalcUpdateRefInfo) {
							break;
						}
					}
					
					if (bCalcUpdateRefInfo && bWriteBack && (DEActions.CREATE.equalsIgnoreCase(strActionName) || DEActions.UPDATE.equalsIgnoreCase(strActionName) || (iPSDEAction != null && (DEActionModes.CREATE.equals(iPSDEAction.getActionMode()) || DEActionModes.UPDATE.equals(iPSDEAction.getActionMode()))))) {
						if (this.containsFieldValue(arg0, iPSLinkDEField)) {
							bUpdateRefInfo = true;
						}
					}
				}
					
				if(bUpdateRefInfo) {
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntity().getDynaModelFilePath());
					IEntityBase major = majorDataEntityRuntime.createEntity();
					majorDataEntityRuntime.setFieldValue(major, majorDataEntityRuntime.getKeyPSDEField(), objPickupValue);
					for (IPSDEField iPSDEField : psDEFields) {
						if (!iPSDEField.isLinkDEField()) {
							continue;
						}
						IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
						if (iPSLinkDEField.getPSDER() == null || !iPSDER1N.getName().equals(iPSLinkDEField.getPSDER().getName())) {
							continue;
						}
						// 不是外键
						if (iPSDER1N.getPSPickupDEField().getName().equals(iPSLinkDEField.getName())) {
							continue;
						}

						boolean bWriteBack = false;
						if(iPSDEField instanceof IPSPickupDataDEField) {
							bWriteBack = ((IPSPickupDataDEField)iPSDEField).isEnableWriteBack();
						}
						
						
						if (bWriteBack) {
							if (this.containsFieldValue(arg0, iPSLinkDEField)) {
								majorDataEntityRuntime.setFieldValue(major, iPSLinkDEField.getRelatedPSDEFieldMust(), this.getFieldValue(arg0, iPSLinkDEField));
							}
						}
					}
					
					//执行更新操作
					majorDataEntityRuntime.update(major);
				}
					

				if (bFillInfo || iPSDER1N.isEnablePDEREQ()) {
					// 查出数据
					IEntityBase major = null;
					String strCacheTag = null;
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntity().getDynaModelFilePath());
					if (actionSession != null) {
						strCacheTag = String.format(ACTIONSESSIONPARAM_FILLENTITYFULLINFO_X, iPSDER1N.getMajorPSDataEntity().getDynaModelFilePath(), objPickupValue);
						Object data = actionSession.getActionParam(strCacheTag);
						if (data instanceof IEntityBase) {
							major = (IEntityBase) data;
						}
					}
					if (major == null) {
						major = majorDataEntityRuntime.createEntity();
						majorDataEntityRuntime.setFieldValue(major, majorDataEntityRuntime.getKeyPSDEField(), objPickupValue);
						majorDataEntityRuntime.executeAction(DEActions.GET, null, new Object[] { major });
						if (StringUtils.hasLength(strCacheTag)) {
							actionSession.setActionParam(strCacheTag, major);
						}
					}

					if (bFillInfo) {
						// 填充属性
						for (IPSDEField iPSDEField : psDEFields) {
							if (!iPSDEField.isLinkDEField()) {
								continue;
							}
							IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
							if (iPSLinkDEField.getPSDER() == null || !iPSDER1N.getName().equals(iPSLinkDEField.getPSDER().getName())) {
								continue;
							}
							// 不是外键
							if (iPSDER1N.getPSPickupDEField().getName().equals(iPSLinkDEField.getName())) {
								continue;
							}
							
							boolean bIgnoreRefresh = false;
							if(iPSDEField instanceof IPSPickupDataDEField) {
								bIgnoreRefresh = ((IPSPickupDataDEField)iPSDEField).isIgnoreRefresh();
							}

							if ((iPSDEField.isPhisicalDEField() && !bIgnoreRefresh) || DEActions.GETDRAFT.equals(strActionName) || (iPSDEAction != null && DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode()))) {
								Object objValue = majorDataEntityRuntime.getFieldValue(major, iPSLinkDEField.getRelatedPSDEField());
								this.setFieldValue(arg0, iPSDEField, objValue);
							}
						}
					}

					if (iPSDER1N.isEnablePDEREQ()) {
						// 启用父关系等价
						if (iPSDER1N.getMajorPPSDER1N() != null && iPSDER1N.getMinorPPSDER1N() != null) {
							Object objValue = majorDataEntityRuntime.getFieldValue(major, iPSDER1N.getMajorPPSDER1N().getPSPickupDEFieldMust());
							if (!ObjectUtils.isEmpty(objValue)) {
								// 有值
								Object curValue = this.getFieldValue(arg0, iPSDER1N.getMinorPPSDER1N().getPSPickupDEFieldMust());
								if (ObjectUtils.isEmpty(curValue)) {
									this.setFieldValue(arg0, iPSDER1N.getMinorPPSDER1N().getPSPickupDEFieldMust(), objValue);
									// 进行额外填充（会出现重复填充）
									this.fillEntityFullInfo(arg0, strActionName, iPSDEAction, iPSDER1N.getMinorPPSDER1N(), iPSDataEntity, iDynaInstRuntime, actionData);
								}
							}
						}
					}
				} else {
					// 检测父数据是否存在
					if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName) || (iPSDEAction != null && DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode()))) {

					} else {
						// 非获取草稿
						IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntity().getDynaModelFilePath());
						String strCacheTag = null;
						Integer nCheckKey = null;
						if (actionSession != null) {
							strCacheTag = String.format(ACTIONSESSIONPARAM_FILLENTITYFULLINFO_EXIST_X, iPSDER1N.getMajorPSDataEntity().getDynaModelFilePath(), objPickupValue);
							Object data = actionSession.getActionParam(strCacheTag);
							if (data instanceof Integer) {
								nCheckKey = (Integer) data;
							}
						}
						if (nCheckKey == null) {
							nCheckKey = majorDataEntityRuntime.checkKeyState(objPickupValue);
							if (StringUtils.hasLength(strCacheTag)) {
								actionSession.setActionParam(strCacheTag, nCheckKey);
							}
						}
						if (nCheckKey != CheckKeyStates.EXIST) {
							if (iPSDER1N.getPSPickupTextDEField() != null) {
								throw new Exception(String.format("指定[%1$s][%2$s]无效", iPSDER1N.getPSPickupTextDEField().getLogicName(), objPickupValue));
							} else {
								throw new Exception(String.format("指定[%1$s][%2$s]无效", iPSDER1N.getPSPickupDEField().getLogicName(), objPickupValue));
							}
						}
					}
				}
			}
		}
	}
	
	@Override
	public Object getDefaultValue(String strDefaultValueType, String strDefaultValue, IEntityBase iEntityBase) throws Exception {
		return this.getDefaultValue(strDefaultValueType, strDefaultValue, iEntityBase, DataTypes.UNKNOWN);
	}
	
	@Override
	public Object getDefaultValue(String strDefaultValueType, String strDefaultValue, IEntityBase iEntityBase, int nDataType) throws Exception {
		if (!StringUtils.hasLength(strDefaultValueType) || "VALUE".equals(strDefaultValueType)) {
			// 直接值
			Object objSource = this.getSystemRuntime().convertValue(nDataType, strDefaultValue);
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
			IPSDEField srcPSDEField = this.getPSDEField(strDefaultValue.toUpperCase());
			if (srcPSDEField != null) {
				objSource = this.getFieldValue(iEntityBase, srcPSDEField);
			} else if (iEntityBase instanceof IEntity) {
				objSource = ((IEntity) iEntityBase).get(strDefaultValue);
			} else {
				throw new Exception(String.format("无法识别的数据对象，无法获取值"));
			}

			// 数据对象属性
			return objSource;
		}

		if (DEFDefaultValueTypes.OPERATOR.equals(strDefaultValueType)) {
			// 当前操作用户(编号)
			Object objSource = ActionSessionManager.getCurrentSessionMust().getUserContextMust().getUserid();
			return objSource;
		}

		if (DEFDefaultValueTypes.OPERATORNAME.equals(strDefaultValueType)) {
			// 当前操作用户(名称)
			Object objSource = ActionSessionManager.getCurrentSessionMust().getUserContextMust().getUsername();
			return objSource;
		}

		if (DEFDefaultValueTypes.CURTIME.equals(strDefaultValueType)) {
			// 当前时间
			Object objSource = new java.sql.Time(System.currentTimeMillis());
			return objSource;
		}

		if (DEFDefaultValueTypes.EXPRESSION.equals(strDefaultValueType)) {
			IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, strDefaultValue, false);
			return iDEScriptActionRuntime.execute(new Object[] { iEntityBase });
		}
		
		if (DEFDefaultValueTypes.ORDERVALUE.equals(strDefaultValueType)) {
			return this.calcOrderValue(iEntityBase, null, strDefaultValue);
		}

		throw new Exception(String.format("不支持的默认值类型[%1$s]", strDefaultValueType));
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
			IPSDEField srcPSDEField = this.getPSDEField(strDefaultValue.toUpperCase());
			if (srcPSDEField != null) {
				objSource = this.getFieldValue(entity, srcPSDEField);
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
			Object objSource = ActionSessionManager.getUserContextMust().getUserid();
			return objSource;
		}

		if (DEFDefaultValueTypes.OPERATORNAME.equals(strDefaultValueType)) {
			// 当前操作用户(名称)
			Object objSource = ActionSessionManager.getUserContextMust().getUsername();
			return objSource;
		}

		if (DEFDefaultValueTypes.CURTIME.equals(strDefaultValueType)) {
			// 当前时间
			Object objSource = new java.sql.Time(System.currentTimeMillis());
			return objSource;
		}

		if (DEFDefaultValueTypes.EXPRESSION.equals(strDefaultValueType)) {
			IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFEXPRESSION, strDefaultValue, false);
			return iDEScriptActionRuntime.execute(new Object[] { entity });
		}

		if (DEFDefaultValueTypes.ORDERVALUE.equals(strDefaultValueType)) {
			return this.calcOrderValue(entity, iPSDEField, strDefaultValue);
		}

		if( DEFDefaultValueTypes.USER.equals(strDefaultValueType)
			|| DEFDefaultValueTypes.USER2.equals(strDefaultValueType)
			|| DEFDefaultValueTypes.USER3.equals(strDefaultValueType)
			|| DEFDefaultValueTypes.USER4.equals(strDefaultValueType)) {
			return null;
		}
		
		log.warn(String.format("无法计算默认值，不支持类型为[%1$s]", strDefaultValueType));
		return null;
	}
	
	protected Object calcOrderValue(IEntityBase iEntityBase, IPSDEField iPSDEField, String strDefaultValue) throws Exception {
		throw new Exception("没有实现");
	}

	protected boolean checkFieldValueRule(Object objValue, IEntityBase arg0, IPSDEFValueRule iPSDEFValueRule, IPSDEField iPSDEField, IPSDataEntity iPSDataEntity, EntityError entityError) throws Throwable {

		IDEFValueRuleRuntime iDEFValueRuleRuntime = this.getDEFValueRuleRuntime(iPSDEFValueRule);
		if (iDEFValueRuleRuntime != null) {
			return iDEFValueRuleRuntime.test(objValue, arg0, entityError);
		}
		
		if(iPSDEFValueRule.isCustomCode()) {
			IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFCHECK, iPSDEFValueRule.getScriptCode(), false);
			Object objRet = iDEScriptActionRuntime.execute(new Object[] { arg0, null, iPSDEField, null });
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
		

		IPSDEFVRGroupCondition iPSDEFVRGroupCondition = iPSDEFValueRule.getPSDEFVRGroupCondition();
		if (iPSDEFVRGroupCondition == null) {
			return true;
		}
		try {
			if (checkFieldValueRuleGroupCondition(objValue, arg0, iPSDEFVRGroupCondition, iPSDEField)) {
				return true;
			}

			if (entityError != null) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
				entityFieldError.setPSDEField(iPSDEField);
				entityFieldError.setPSDEFValueRule(iPSDEFValueRule);
				entityError.register(entityFieldError);
			}
		} catch (DEFVRConditionException ex) {
			if (entityError != null) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
				entityFieldError.setPSDEField(iPSDEField);
				entityFieldError.setPSDEFValueRule(iPSDEFValueRule);
				entityFieldError.setPSDEFVRCondition(ex.getPSDEFVRCondition());
				entityFieldError.setErrorInfo(ex.getMessage());
				entityError.register(entityFieldError);
			}
		}

		return false;

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
					realPSDEField = this.getPSDEField(iPSDEFVRSingleCondition.getDEFName());
					if(realPSDEField != null) {
						realValue = this.getFieldValue(arg0, realPSDEField);
					}
					else {
						realValue = this.getFieldValue(arg0, iPSDEFVRSingleCondition.getDEFName());
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
					throw createDEFVRConditionException(iPSDEFVRRegExCondition, String.format("属性[%1$s]值不是字符类型", iPSDEField.getName()), MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE, iPSDEField);
				}
				else {
					throw createDEFVRConditionException(iPSDEFVRRegExCondition, String.format("值不是字符类型"), MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE, iPSDEField);
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
			throw new DataEntityRuntimeException(this, String.format("无法获取属性规则项[%1$s]使用的系统值规则", iPSDEFVRSysValueRuleCondition.getName()), Errors.MODELERROR);
		}

		boolean bTryMode = !iPSDEFVRSysValueRuleCondition.isKeyCond();
		ISysValueRuleRuntime iSysValueRuleRuntime = this.getCurrentSystemRuntimeBase(true).getSysValueRuleRuntime(iPSSysValueRule);
		if (iSysValueRuleRuntime.test(objValue, arg0, iPSDEField, this)) {
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
	 * 填充实体数据集参数
	 * 
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void fillActionParams(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Exception {
		List<IPSDEActionParam> psDEActionParams = iPSDEAction.getPSDEActionParams();
		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEActionParams != null && psDEFields != null) {
			// 判断参数模式
			int nParamMode = iPSDEAction.getParamMode();
			if (nParamMode == DEActionParamModes.ALL) {
				// 全部参数
				for (IPSDEActionParam iPSDEDataSetParam : psDEActionParams) {
					setActionParamValue(arg0, iPSDEDataSetParam, this.getPSDEField(iPSDEDataSetParam.getName().toUpperCase()));
				}
			} else if (nParamMode == DEActionParamModes.SOME) {
				// 指定限定参数
				for (IPSDEField iPSDEField : psDEFields) {
					boolean bReset = true;
					for (IPSDEActionParam iPSDEDataSetParam : psDEActionParams) {
						if (iPSDEField.getName().equalsIgnoreCase(iPSDEDataSetParam.getName())) {
							setActionParamValue(arg0, iPSDEDataSetParam, iPSDEField);
							bReset = false;
							break;
						}
					}
					if (bReset) {
						this.resetFieldValue(arg0, iPSDEField);
					}
				}
			} else {
				log.warn(String.format("无法识别的实体数据集参数模式[%1$s]", nParamMode));
			}
		}
	}

	/**
	 * 设置实体行为参数
	 * 
	 * @param entity
	 * @param iPSDEActionParam
	 * @throws Exception
	 */
	protected void setActionParamValue(IEntityBase entity, IPSDEActionParam iPSDEActionParam) throws Exception {
		this.setActionParamValue(entity, iPSDEActionParam, null);
	}

	/**
	 * 设置实体行为参数
	 * 
	 * @param entity
	 * @param iPSDEActionParam
	 * @param iPSDEField
	 * @throws Exception
	 */
	protected void setActionParamValue(IEntityBase entity, IPSDEActionParam iPSDEActionParam, IPSDEField iPSDEField) throws Exception {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		if (DEActionParamValueTypes.INPUTVALUE.equals(iPSDEActionParam.getValueType())) {
			// 输入值（默认）
			return;
		}

		if (DEActionParamValueTypes.NONEVALUE.equals(iPSDEActionParam.getValueType())) {
			// 无值（不设置）
			if (iPSDEField != null) {
				this.resetFieldValue(entity, iPSDEField);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).reset(iPSDEActionParam.getName());
				} else {
					log.warn(String.format("无法识别的数据对象，无法重置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.PARAM.equals(iPSDEActionParam.getValueType()) && StringUtils.hasLength(iPSDEActionParam.getValue())) {
			Object objSource = null;
			IPSDEField srcPSDEField = this.getPSDEField(iPSDEActionParam.getValue().toUpperCase());
			if (srcPSDEField != null) {
				objSource = this.getFieldValue(entity, srcPSDEField);
			} else if (entity instanceof IEntity) {
				objSource = ((IEntity) entity).get(iPSDEActionParam.getName());
			} else {
				log.warn(String.format("无法识别的数据对象，无法获取值"));
				return;
			}

			// 数据对象属性
			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}

			return;
		}

		if (DEActionParamValueTypes.VALUE.equals(iPSDEActionParam.getValueType()) && StringUtils.hasLength(iPSDEActionParam.getValue())) {
			// 指定值
			Object objSource = this.getSystemRuntime().convertValue(iPSDEActionParam.getStdDataType(), iPSDEActionParam.getValue());

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.NULLVALUE.equals(iPSDEActionParam.getValueType())) {
			// 空值
			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, null);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), null);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.OPERATOR.equals(iPSDEActionParam.getValueType())) {
			// 当前操作用户(编号)
			Object objSource = actionSession.getUserContext().getUserid();

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.OPERATORNAME.equals(iPSDEActionParam.getValueType())) {
			// 当前操作用户(名称)
			Object objSource = actionSession.getUserContext().getUsername();

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.SESSION.equals(iPSDEActionParam.getValueType()) && StringUtils.hasLength(iPSDEActionParam.getValue())) {
			// 用户全局对象属性
			Object objSource = actionSession.getUserContext().getSessionParam(iPSDEActionParam.getValue());

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.APPLICATION.equals(iPSDEActionParam.getValueType()) && StringUtils.hasLength(iPSDEActionParam.getValue())) {
			// 系统全局对象属性
			Object objSource = this.getSystemRuntime().getGlobalParam(iPSDEActionParam.getValue());

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.UNIQUEID.equals(iPSDEActionParam.getValueType())) {
			// 唯一编码
			Object objSource = UUID.randomUUID().toString();

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.CURTIME.equals(iPSDEActionParam.getValueType())) {
			// 当前时间
			Object objSource = new java.sql.Timestamp(System.currentTimeMillis());

			if (iPSDEField != null) {
				this.setFieldValue(entity, iPSDEField, objSource);
			} else {
				if (entity instanceof IEntity) {
					((IEntity) entity).set(iPSDEActionParam.getName(), objSource);
				} else {
					log.warn(String.format("无法识别的数据对象，无法设置值"));
					return;
				}
			}
			return;
		}

		if (DEActionParamValueTypes.CONTEXT.equals(iPSDEActionParam.getValueType())) {
			log.warn(String.format("无法设置实体行为参数，不支持值类型为[CONTEXT][网页请求]"));
			return;
		}

		if (DEActionParamValueTypes.APPDATA.equals(iPSDEActionParam.getValueType())) {
			log.warn(String.format("无法设置实体行为参数，不支持值类型为[APPDATA][应用数据]"));
			return;
		}

		log.warn(String.format("无法设置实体行为参数，不支持值类型为[%1$s]", iPSDEActionParam.getValueType()));
		return;
	}

	/**
	 * 填充实体数据集参数
	 * 
	 * @param iPSDEDataSet
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void fillDataSetParams(ISearchContextBase iSearchContextBase, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Exception {
		List<IPSDEDataSetParam> psDEDataSetParams = iPSDEDataSet.getPSDEDataSetParams();
		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEDataSetParams) && !ObjectUtils.isEmpty(psDEFields)) {
			// 判断参数模式
			int nParamMode = iPSDEDataSet.getParamMode();
			if (nParamMode == PSModelEnums.DEDataSetParamMode.ALL.value) {
				// 全部参数
				for (IPSDEDataSetParam iPSDEDataSetParam : psDEDataSetParams) {
					setDataSetParamValue(iSearchContextBase, iPSDEDataSetParam);
				}
			} else if (nParamMode == PSModelEnums.DEDataSetParamMode.SOME.value) {
				// 指定限定参数
				for (IPSDEField iPSDEField : psDEFields) {

					java.util.List<IPSDEFSearchMode> psDEFSearchModes = iPSDEField.getAllPSDEFSearchModes();
					if (ObjectUtils.isEmpty(psDEFSearchModes)) {
						continue;
					}

					for (IPSDEFSearchMode iPSDEFSearchMode : psDEFSearchModes) {
						boolean bReset = true;
						for (IPSDEDataSetParam iPSDEDataSetParam : psDEDataSetParams) {

							IPSDEField paramPSDEField = iPSDEDataSetParam.getPSDEField();
							IPSDEFSearchMode paramPSDEFSearchMode = iPSDEDataSetParam.getPSDEFSearchMode();
							if (paramPSDEFSearchMode == null) {
								paramPSDEFSearchMode = this.getPSDEFSearchMode(iPSDEDataSetParam.getName(), true);
								if (paramPSDEFSearchMode != null) {
									paramPSDEField = paramPSDEFSearchMode.getParentPSModelObject(IPSDEField.class, false);
								}
							}
							if (paramPSDEField == null || paramPSDEFSearchMode == null) {
								continue;
							}

							if (!iPSDEDataSetParam.getPSDEField().getName().equals(iPSDEField.getName())) {
								continue;
							}

							if (!iPSDEDataSetParam.getPSDEFSearchMode().getName().equals(iPSDEDataSetParam.getPSDEFSearchMode().getName())) {
								continue;
							}

							setDataSetParamValue(iSearchContextBase, iPSDEDataSetParam);
							bReset = false;
							break;
						}
						if (bReset) {
							this.resetSearchCondition(iSearchContextBase, iPSDEField, iPSDEFSearchMode);
						}
					}
				}
			} else {
				log.warn(String.format("无法识别的实体数据集参数模式[%1$s]", nParamMode));
			}
		}
	}

	/**
	 * 设置实体数据集参数
	 * 
	 * @param iSearchContextBase
	 * @param iPSDEDataSetParam
	 * @throws Exception
	 */
	protected void setDataSetParamValue(ISearchContextBase iSearchContextBase, IPSDEDataSetParam iPSDEDataSetParam) throws Exception {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		if (DEActionParamValueTypes.INPUTVALUE.equals(iPSDEDataSetParam.getValueType())) {
			// 输入值（默认）
			return;
		}

		// if
		// (DEActionParamValueTypes.NONEVALUE.equals(iPSDEDataSetParam.getValueType()))
		// {
		// // 无值（不设置）
		// if (iPSDEField != null) {
		// this.resetFieldValue(entity, iPSDEField);
		// } else {
		// if (entity instanceof IEntity) {
		// ((IEntity) entity).reset(iPSDEDataSetParam.getName());
		// } else {
		// log.warn(String.format("无法识别的数据对象，无法重置值"));
		// return;
		// }
		// }
		// return;
		// }

		if (DEActionParamValueTypes.PARAM.equals(iPSDEDataSetParam.getValueType()) && StringUtils.hasLength(iPSDEDataSetParam.getValue())) {
			Object objSource = this.getSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getValue());
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		if (DEActionParamValueTypes.VALUE.equals(iPSDEDataSetParam.getValueType()) && StringUtils.hasLength(iPSDEDataSetParam.getValue())) {
			// 指定值
			Object objSource = this.getSystemRuntime().convertValue(iPSDEDataSetParam.getStdDataType(), iPSDEDataSetParam.getValue());
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		// if
		// (DEActionParamValueTypes.NULLVALUE.equals(iPSDEDataSetParam.getValueType()))
		// {
		// // 空值
		// if (iPSDEField != null) {
		// this.setFieldValue(entity, iPSDEField, null);
		// } else {
		// if (entity instanceof IEntity) {
		// ((IEntity) entity).set(iPSDEDataSetParam.getName(), null);
		// } else {
		// log.warn(String.format("无法识别的数据对象，无法设置值"));
		// return;
		// }
		// }
		// return;
		// }

		if (DEActionParamValueTypes.OPERATOR.equals(iPSDEDataSetParam.getValueType())) {
			// 当前操作用户(编号)
			Object objSource = actionSession.getUserContext().getUserid();
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		if (DEActionParamValueTypes.OPERATORNAME.equals(iPSDEDataSetParam.getValueType())) {
			// 当前操作用户(名称)
			Object objSource = actionSession.getUserContext().getUsername();
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		if (DEActionParamValueTypes.SESSION.equals(iPSDEDataSetParam.getValueType()) && StringUtils.hasLength(iPSDEDataSetParam.getValue())) {
			// 用户全局对象属性
			Object objSource = actionSession.getUserContext().getSessionParam(iPSDEDataSetParam.getValue());
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		if (DEActionParamValueTypes.APPLICATION.equals(iPSDEDataSetParam.getValueType()) && StringUtils.hasLength(iPSDEDataSetParam.getValue())) {
			// 系统全局对象属性
			Object objSource = this.getSystemRuntime().getGlobalParam(iPSDEDataSetParam.getValue());
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		// if
		// (DEActionParamValueTypes.UNIQUEID.equals(iPSDEDataSetParam.getValueType()))
		// {
		// // 唯一编码
		// Object objSource = UUID.randomUUID().toString();
		//
		// if (iPSDEField != null) {
		// this.setFieldValue(entity, iPSDEField, objSource);
		// } else {
		// if (entity instanceof IEntity) {
		// ((IEntity) entity).set(iPSDEDataSetParam.getName(), objSource);
		// } else {
		// log.warn(String.format("无法识别的数据对象，无法设置值"));
		// return;
		// }
		// }
		// return;
		// }

		if (DEActionParamValueTypes.CURTIME.equals(iPSDEDataSetParam.getValueType())) {
			// 当前时间
			Object objSource = new java.sql.Timestamp(System.currentTimeMillis());
			if (iPSDEDataSetParam.getPSDEField() != null && iPSDEDataSetParam.getPSDEFSearchMode() != null) {
				this.setSearchCondition(iSearchContextBase, iPSDEDataSetParam.getPSDEField(), iPSDEDataSetParam.getPSDEFSearchMode(), objSource);
			} else {
				this.setSearchDataContext(iSearchContextBase, iPSDEDataSetParam.getName(), objSource);
			}
			return;
		}

		if (DEActionParamValueTypes.CONTEXT.equals(iPSDEDataSetParam.getValueType())) {
			log.warn(String.format("无法设置实体数据集参数，不支持值类型为[CONTEXT][网页请求]"));
			return;
		}

		if (DEActionParamValueTypes.APPDATA.equals(iPSDEDataSetParam.getValueType())) {
			log.warn(String.format("无法设置实体数据集参数，不支持值类型为[APPDATA][应用数据]"));
			return;
		}

		log.warn(String.format("无法设置实体数据集参数，不支持值类型为[%1$s]", iPSDEDataSetParam.getValueType()));
		return;
	}

	/**
	 * 获取指定属性的值
	 * 
	 * @param objEntity
	 * @param iPSDEField
	 * @return
	 */
	public Object getFieldValue(IEntityBase objEntity, IPSDEField iPSDEField) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	/**
	 * 判断是否包括指定属性值
	 * 
	 * @param objEntity
	 * @param iPSDEField
	 * @return
	 */
	public boolean containsFieldValue(IEntityBase objEntity, IPSDEField iPSDEField) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void resetFieldValue(IEntityBase objEntity, IPSDEField iPSDEField) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	
	/**
	 * 设置指定属性的值
	 * 
	 * @param objEntity
	 * @param iPSDEField
	 * @param objValue
	 */
	public void setFieldValue(IEntityBase objEntity, IPSDEField iPSDEField, Object objValue) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	/**
	 * 获取指定属性的值
	 * 
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	public Object getFieldValue(IEntityBase objEntity, String strFieldName) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	/**
	 * 设置指定属性的值
	 * 
	 * @param objEntity
	 * @param strFieldName
	 * @param objValue
	 */
	public void setFieldValue(IEntityBase objEntity, String strFieldName, Object objValue) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	
	/**
	 * 判断是否包括指定属性值
	 * 
	 * @param objEntity
	 * @param iPSDEField
	 * @return
	 */
	public boolean containsFieldValue(IEntityBase objEntity, String strFieldName) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void resetFieldValue(IEntityBase objEntity, String strFieldName) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IDEDataSyncOutRuntime createDEDataSyncOutRuntime(IPSDEDataSync iPSDEDataSync) {
		Assert.notNull(iPSDEDataSync, "实体数据同步模型对象无效");
		IDEDataSyncOutRuntime iDEDataSyncOutRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEDataSync.getPSSysSFPlugin(), IDEDataSyncOutRuntime.class, true);
		if (iDEDataSyncOutRuntime != null) {
			return iDEDataSyncOutRuntime;
		}
		return this.onCreateDEDataSyncOutRuntime(iPSDEDataSync);
	}

	protected IDEDataSyncOutRuntime onCreateDEDataSyncOutRuntime(IPSDEDataSync iPSDEDataSync) {
		IDEDataSyncOutRuntime iDEDataSyncOutRuntime = this.getSystemRuntime().getRuntimeObject(IDEDataSyncOutRuntime.class, null);
		if (iDEDataSyncOutRuntime != null) {
			return iDEDataSyncOutRuntime;
		}
		return createDefaultDEDataSyncOutRuntime(iPSDEDataSync);
	}

	protected IDEDataSyncOutRuntime createDefaultDEDataSyncOutRuntime(IPSDEDataSync iPSDEDataSync) {
		return new DEDataSyncOutRuntime();
	}
	
	@Override
	public IDEDataSyncInRuntime createDEDataSyncInRuntime(IPSDEDataSync iPSDEDataSync) {
		Assert.notNull(iPSDEDataSync, "实体数据同步模型对象无效");

		IDEDataSyncInRuntime iDEDataSyncInRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEDataSync.getPSSysSFPlugin(), IDEDataSyncInRuntime.class, true);
		if (iDEDataSyncInRuntime != null) {
			return iDEDataSyncInRuntime;
		}
		return this.onCreateDEDataSyncInRuntime(iPSDEDataSync);
	}

	protected IDEDataSyncInRuntime onCreateDEDataSyncInRuntime(IPSDEDataSync iPSDEDataSync) {
		IDEDataSyncInRuntime iDEDataSyncInRuntime = this.getSystemRuntime().getRuntimeObject(IDEDataSyncInRuntime.class, null);
		if (iDEDataSyncInRuntime != null) {
			return iDEDataSyncInRuntime;
		}
		return this.createDefaultDEDataSyncInRuntime(iPSDEDataSync);
	}
	
	protected IDEDataSyncInRuntime createDefaultDEDataSyncInRuntime(IPSDEDataSync iPSDEDataSync) {
		return new DEDataSyncInRuntime();
	}
	

	@Override
	public IDEUtilRuntime createDEUtilRuntime(IPSDEUtil iPSDEUtil) {
		Assert.notNull(iPSDEUtil, "实体功能模型对象无效");

		IDEUtilRuntime iDEUtilRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEUtil.getPSSysSFPlugin(), IDEUtilRuntime.class, true);
		if (iDEUtilRuntime != null) {
			return iDEUtilRuntime;
		}
		
		return this.onCreateDEUtilRuntime(iPSDEUtil);
	}

	protected IDEUtilRuntime onCreateDEUtilRuntime(IPSDEUtil iPSDEUtil) {

		String strTag = null;
		if (DEUtilTypes.USER.equals(iPSDEUtil.getUtilType())) {
			strTag = String.format("USER:%1$s", iPSDEUtil.getUtilTag());
		} else {
			strTag = iPSDEUtil.getUtilType();
		}

		IDEUtilRuntime iDEUtilRuntime = this.getSystemRuntime().getRuntimeObject(IDEUtilRuntime.class, strTag);
		if (iDEUtilRuntime != null) {
			return iDEUtilRuntime;
		}

		return this.createDefaultDEUtilRuntime(iPSDEUtil);
	}

	protected IDEUtilRuntime createDefaultDEUtilRuntime(IPSDEUtil iPSDEUtil) {

		if (DEUtilTypes.DATAAUDIT.equals(iPSDEUtil.getUtilType())) {
			return new DEDataAuditUtilRuntime();
		}

		if (DEUtilTypes.DYNASTORAGE.equals(iPSDEUtil.getUtilType())) {
			return new DEDynaStorageUtilRuntime();
		}

		return null;
	}
	
	
	@Override
	public IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify) {
		Assert.notNull(iPSDENotify, "实体通知模型对象无效");

		IDENotifyRuntime iDENotifyRuntime = this.getSystemRuntime().getRuntimeObject(iPSDENotify.getPSSysSFPlugin(), IDENotifyRuntime.class, true);
		if (iDENotifyRuntime != null) {
			return iDENotifyRuntime;
		}

		return onCreateDENotifyRuntime(iPSDENotify);
	}

	protected IDENotifyRuntime onCreateDENotifyRuntime(IPSDENotify iPSDENotify) {

		IDENotifyRuntime iDENotifyRuntime = this.getSystemRuntime().getRuntimeObject(IDENotifyRuntime.class, null);
		if (iDENotifyRuntime != null) {
			return iDENotifyRuntime;
		}
		
		return createDefaultDENotifyRuntime(iPSDENotify);
	}
	
	protected IDENotifyRuntime createDefaultDENotifyRuntime(IPSDENotify iPSDENotify) {
		return new DENotifyRuntime();
	}

	@Override
	public IDEPrintRuntime createDEPrintRuntime(IPSDEPrint iPSDEPrint) {
		Assert.notNull(iPSDEPrint, "实体打印模型对象无效");

		IDEPrintRuntime iDEPrintRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEPrint.getPSSysSFPlugin(), IDEPrintRuntime.class, true);
		if (iDEPrintRuntime != null) {
			return iDEPrintRuntime;
		}

		return onCreateDEPrintRuntime(iPSDEPrint);
	}

	protected IDEPrintRuntime onCreateDEPrintRuntime(IPSDEPrint iPSDEPrint) {
		IDEPrintRuntime iDEPrintRuntime = this.getSystemRuntime().getRuntimeObject(IDEPrintRuntime.class, iPSDEPrint.getReportType());
		if (iDEPrintRuntime != null) {
			return iDEPrintRuntime;
		}
		return this.createDefaultDEPrintRuntime(iPSDEPrint);
	}
	
	protected IDEPrintRuntime createDefaultDEPrintRuntime(IPSDEPrint iPSDEPrint) {
		return new DEPrintRuntime();
	}

	@Override
	public IDEReportRuntime createDEReportRuntime(IPSDEReport iPSDEReport) {
		Assert.notNull(iPSDEReport, "实体报表模型对象无效");

		IDEReportRuntime iDEReportRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEReport.getPSSysSFPlugin(), IDEReportRuntime.class, true);
		if (iDEReportRuntime != null) {
			return iDEReportRuntime;
		}

		return onCreateDEReportRuntime(iPSDEReport);
	}

	protected IDEReportRuntime onCreateDEReportRuntime(IPSDEReport iPSDEReport) {
		IDEReportRuntime iDEReportRuntime = this.getSystemRuntime().getRuntimeObject(IDEReportRuntime.class, iPSDEReport.getReportType());
		if (iDEReportRuntime != null) {
			return iDEReportRuntime;
		}
		return createDefaultDEReportRuntime(iPSDEReport);
	}
	
	protected IDEReportRuntime createDefaultDEReportRuntime(IPSDEReport iPSDEReport) {
		return new DEReportRuntime();
	}
	

	@Override
	public IScriptEntity createScriptEntity(IEntityBase iEntityBase) {
		return new ScriptEntity(this, iEntityBase);
	}

	@Override
	public IScriptSearchContext createScriptSearchContext(ISearchContextBase iSearchContextBase) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IDEScriptLogicRuntime createDEScriptLogicRuntime(String strLogicMode, String strScriptCode) {
		DEScriptLogicRuntime deScriptActionRuntime = new DEScriptLogicRuntime();
		return deScriptActionRuntime;
	}

	/**
	 * 操作之前 检查实体动态属性
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void checkEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	/**
	 * 操作之前 转化实体动态属性
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void translateEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (this.getPSDataEntity() == iPSDataEntity) {
			// 基本模型对象，忽略
			return;
		}

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		Map<String, Object> dynaFieldValueMap = null;
		// 判断添加的属性
		for (IPSDEField iPSDEField : psDEFields) {
			if (this.getPSDEField(iPSDEField.getName()) != null) {
				continue;
			}

			if (!this.containsFieldValue(arg0, iPSDEField)) {
				continue;
			}

			if (dynaFieldValueMap == null) {
				dynaFieldValueMap = new HashMap<String, Object>();
			}
			dynaFieldValueMap.put(iPSDEField.getName(), this.getFieldValue(arg0, iPSDEField));
		}

		if (dynaFieldValueMap != null) {
			ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
			// 备份
			String strParamKey = String.format("__DYNAFIELDS_%1$s", actionSession.getSessionId());
			actionSession.setActionParam(strParamKey, dynaFieldValueMap);
		}
	}

	/**
	 * 操作之前 转换数据对象
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void translateEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (!this.isTranslateField()) {
			return;
		}

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		if (this.isTranslateField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.translateFieldBeforeProceed(arg0, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

	}

	/**
	 * 操作之前 转换数据对象属性
	 * 
	 * @param arg0
	 * @param iPSDEField
	 *            属性名称
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void translateFieldBeforeProceed(IEntityBase arg0, IPSDEField iPSDEField, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		// 判断值转换模式
		String strTranslatorMode = iPSDEField.getTranslatorMode();
		if (StringUtils.hasLength(strTranslatorMode) && (DEFTranslatorModes.DIGEST.equals(strTranslatorMode) || DEFTranslatorModes.ENCRYPT.equals(strTranslatorMode) || DEFTranslatorModes.TRANSLATE.equals(strTranslatorMode) || DEFTranslatorModes.TRANSLATE2.equals(strTranslatorMode) || DEFTranslatorModes.UCASE.equals(strTranslatorMode) || DEFTranslatorModes.LCASE.equals(strTranslatorMode))) {

			// 进行值转换处理，输入
			if (this.containsFieldValue(arg0, iPSDEField)) {
				Object objValue = this.getFieldValue(arg0, iPSDEField);
				Object objNew = null;
				if (DEFTranslatorModes.DIGEST.equals(strTranslatorMode)) {
					objNew = SysDigestTranslatorRuntime.getInstance().translate(objValue, true, arg0, iPSDEField, this);
				} else if (DEFTranslatorModes.ENCRYPT.equals(strTranslatorMode)) {
					objNew = SysEncryptTranslatorRuntime.getInstance().translate(objValue, true, arg0, iPSDEField, this);
				} else if (DEFTranslatorModes.TRANSLATE.equals(strTranslatorMode) || DEFTranslatorModes.TRANSLATE2.equals(strTranslatorMode)) {
					ISysTranslatorRuntime iSysTranslatorRuntime = this.getCurrentSystemRuntimeBase(false).getSysTranslatorRuntime(iPSDEField.getPSSysTranslator());
					objNew = iSysTranslatorRuntime.translate(objValue, true, arg0, iPSDEField, this);
				} else if (DEFTranslatorModes.UCASE.equals(strTranslatorMode)) {
					objNew = SysUCaseTranslatorRuntime.getInstance().translate(objValue, true, arg0, iPSDEField, this);
				} else if (DEFTranslatorModes.LCASE.equals(strTranslatorMode)) {
					objNew = SysLCaseTranslatorRuntime.getInstance().translate(objValue, true, arg0, iPSDEField, this);
				}
				if (objNew == null) {
					// 空值处理
					this.setFieldValue(arg0, iPSDEField, null);
				} else if (ObjectUtils.isEmpty(objNew)) {
					// 无值处理
					this.resetFieldValue(arg0, iPSDEField);
				} else {
					this.setFieldValue(arg0, iPSDEField, objNew);
				}
			}
		}
	}

	/**
	 * 操作之后 转换数据对象动态属性
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void translateEntityDynaFieldsAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}
	}

	/**
	 * 操作之后 转换数据对象
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void translateEntityAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (!this.isTranslateField() && !this.isComputeField()) {
			return;
		}

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		IEntityBase iEntityBase = null;
		// 更替参数
		if (objRet != null && objRet instanceof IEntityBase) {
			iEntityBase = (IEntityBase) objRet;
		} else if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		if (this.isTranslateField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.translateFieldAfterProceed(iEntityBase, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

		if (this.isComputeField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.computeFieldAfterProceed(iEntityBase, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}
	}
	
	protected void translateEntitiesAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		for(IEntityBase item : list) {
			this.translateEntityAfterProceed(item, strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);
		}
	}

	/**
	 * 操作之后 转换数据对象
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void translateEntityAfterProceed(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (!this.isTranslateField() && !this.isComputeField()) {
			return;
		}

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		IEntityBase iEntityBase = null;

		if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		if (this.isTranslateField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.translateFieldAfterProceed(iEntityBase, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

		if (this.isComputeField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.computeFieldAfterProceed(iEntityBase, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}
	}
	
	protected void translateEntitiesAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		for(IEntityBase item : list) {
			this.translateEntityAfterProceed(item, strDataQueryName, iPSDEDataQuery, iPSDataEntity, iDynaInstRuntime, actionData);
		}
	}
	

	/**
	 * 查询之后 转换数据对象
	 * 
	 * @param arg0
	 * @param strDataQueryName
	 * @param iPSDEDataQuery
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void translateEntityAfterProceed(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (!this.isTranslateField() && !this.isComputeField()) {
			return;
		}

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		IEntityBase iEntityBase = null;

		if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		if (this.isTranslateField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.translateFieldAfterProceed(iEntityBase, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

		if (this.isComputeField()) {
			for (IPSDEField iPSDEField : psDEFields) {
				this.computeFieldAfterProceed(iEntityBase, iPSDEField, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}
	}

	protected void translateFieldAfterProceed(IEntityBase iEntityBase, IPSDEField iPSDEField, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		String strTranslatorMode = iPSDEField.getTranslatorMode();
		if (StringUtils.hasLength(strTranslatorMode) && (DEFTranslatorModes.DIGEST.equals(strTranslatorMode) || DEFTranslatorModes.ENCRYPT.equals(strTranslatorMode) || DEFTranslatorModes.TRANSLATE.equals(strTranslatorMode) || DEFTranslatorModes.TRANSLATE2.equals(strTranslatorMode) || DEFTranslatorModes.UCASE.equals(strTranslatorMode) || DEFTranslatorModes.LCASE.equals(strTranslatorMode))) {

			// 进行值转换处理，输入
			if (this.containsFieldValue(iEntityBase, iPSDEField)) {
				Object objValue = this.getFieldValue(iEntityBase, iPSDEField);
				Object objNew = null;
				if (DEFTranslatorModes.DIGEST.equals(strTranslatorMode)) {
					objNew = SysDigestTranslatorRuntime.getInstance().translate(objValue, false, iEntityBase, iPSDEField, this);
				} else if (DEFTranslatorModes.ENCRYPT.equals(strTranslatorMode)) {
					objNew = SysEncryptTranslatorRuntime.getInstance().translate(objValue, false, iEntityBase, iPSDEField, this);
				} else if (DEFTranslatorModes.TRANSLATE.equals(strTranslatorMode) || DEFTranslatorModes.TRANSLATE2.equals(strTranslatorMode)) {
					ISysTranslatorRuntime iSysTranslatorRuntime = this.getCurrentSystemRuntimeBase(false).getSysTranslatorRuntime(iPSDEField.getPSSysTranslator());
					objNew = iSysTranslatorRuntime.translate(objValue, false, iEntityBase, iPSDEField, this);
				} else if (DEFTranslatorModes.UCASE.equals(strTranslatorMode)) {
					objNew = SysUCaseTranslatorRuntime.getInstance().translate(objValue, false, iEntityBase, iPSDEField, this);
				} else if (DEFTranslatorModes.LCASE.equals(strTranslatorMode)) {
					objNew = SysLCaseTranslatorRuntime.getInstance().translate(objValue, false, iEntityBase, iPSDEField, this);
				}
				if (objNew == null) {
					// 空值处理
					this.setFieldValue(iEntityBase, iPSDEField, null);
				} else if (ObjectUtils.isEmpty(objNew)) {
					// 无值处理
					this.resetFieldValue(iEntityBase, iPSDEField);
				} else {
					this.setFieldValue(iEntityBase, iPSDEField, objNew);
				}
			}
		}
	}

	/**
	 * 填充属性的计算值
	 * 
	 * @param arg0
	 * @param iPSDEField
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void computeFieldAfterProceed(IEntityBase arg0, IPSDEField iPSDEField, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 判断是否有计算逻辑
		IPSDEFLogic iPSDEFLogic = iPSDEField.getComputePSDEFLogic();
		if (iPSDEFLogic == null) {
			return;
		}
		if (iPSDEFLogic.isCustomCode()) {
			if (StringUtils.hasLength(iPSDEFLogic.getScriptCode())) {
				IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFCOMPUTE, iPSDEFLogic.getScriptCode(), iDynaInstRuntime != null);
				if (iDEScriptActionRuntime == null) {
					iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFCOMPUTE, iPSDEFLogic.getScriptCode());
				}
				Object objValue = iDEScriptActionRuntime.execute(new Object[] { arg0 });
				this.setFieldValue(arg0, iPSDEField, objValue);
			}
		} else {

			// log.warn(String.format("无法执行属性[%1$s]值计算逻辑[%2$s]",iPSDEField.getName(),iPSDEFLogic.getName()));

			IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDEFLogic);
			Object objValue = iDELogicRuntime.execute(new Object[] { arg0 });
			this.setFieldValue(arg0, iPSDEField, objValue);
		}
	}

	/**
	 * 处理之前转换数据对象的主关系数据
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void translateEntityNestedDERsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IPSDERBase> psDERBases = this.getPSDataEntity().getMajorPSDERs();
		if (psDERBases == null) {
			return;
		}

		for (IPSDERBase iPSDERBase : psDERBases) {
			if (iPSDERBase instanceof IPSDER1N) {

				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.NESTED) == 0) {
					continue;
				}

				this.translateEntityNestedDER1NBeforeProceed(arg0, iPSDER1N, iPSDataEntity, iDynaInstRuntime, actionData);
				continue;
			}
		}
	}

	protected void translateEntityNestedDER1NBeforeProceed(IEntityBase arg0, IPSDER1N iPSDER1N, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (!this.containsNestedDERValue(arg0, iPSDER1N)) {
			return;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntity().getDynaModelFilePath());

		IEntityBase[] minorEntities = this.getNestedDERValue(arg0, iPSDER1N);

		// 检查嵌套数据
		if (minorEntities != null && minorEntities.length > 0) {
			minorDataEntityRuntime.checkNestedEntities(arg0, minorEntities, iDynaInstRuntime);
		}

		// 备份
		String strParamKey = String.format("ONE2MANYDATA_%1$s_%2$s", iPSDER1N.getName(), actionSession.getSessionId());
		actionSession.setActionParam(strParamKey, (minorEntities != null) ? minorEntities : ActionSession.EMPTYPARAM);

		// 执行数据映射处理
		if (iPSDER1N.getPSDER1NDEFieldMaps() != null) {
			for (IPSDER1NDEFieldMap iPSDER1NDEFieldMap : iPSDER1N.getPSDER1NDEFieldMaps()) {
				Object objCalcValue = EntityListUtils.calc(iPSDER1NDEFieldMap.getMapType(), minorEntities, iPSDER1NDEFieldMap.getMinorPSDEField(), minorDataEntityRuntime);
				this.setFieldValue(arg0, iPSDER1NDEFieldMap.getMajorPSDEField(), objCalcValue);
			}
		}
	}

	/**
	 * 检查数据对象的主关系数据
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void checkEntityNestedDERsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	// protected void translateEntityNestedDER11BeforeProceed(IEntityBase arg0,
	// IPSDER11 iPSDER11, IPSDataEntity iPSDataEntity, IDynaInstRuntime
	// iDynaInstRuntime, Object actionData) throws Throwable {
	// if(!this.containsFieldValue(arg0, iPSOne2OneDataDEField)) {
	// return;
	// }
	//
	// ActionSession actionSession =
	// ActionSessionManager.getCurrentSessionMust();
	//
	// IDataEntityRuntime minorDataEntityRuntime =
	// this.getSystemRuntime().getDataEntityRuntime(iPSOne2OneDataDEField.getPSDER().getMinorPSDataEntity().getDynaModelFilePath());
	// IEntityBase minorEntity = null;
	// Object objValue = this.getFieldValue(arg0, iPSOne2OneDataDEField);
	// if(ObjectUtils.isEmpty(objValue)) {
	// //执行数据清除操作
	// }
	// else {
	// minorEntity = minorDataEntityRuntime.deserializeEntity(objValue);
	// }
	//
	// //备份
	// String strParamKey =
	// String.format("ONE2ONEDATA_%1$s_%2$s",iPSOne2OneDataDEField.getName(),actionSession.getSessionId());
	// actionSession.setActionParam(strParamKey, (minorEntity != null)?
	// minorEntity: ActionSession.EMPTYPARAM);
	// }

	/**
	 * 处理之后转换数据对象的主关系数据
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void translateEntityNestedDERsAfterProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		java.util.List<IPSDERBase> psDERBases = this.getPSDataEntity().getMajorPSDERs();
		if (psDERBases == null) {
			return;
		}

		Object objKey = this.getFieldValue(arg0, this.getKeyPSDEField());
		if (ObjectUtils.isEmpty(objKey)) {
			log.warn(String.format("传入数据键值无效，忽略转换数据对象的主关系数据的处理"));
			return;
		}

		for (IPSDERBase iPSDERBase : psDERBases) {
			if (iPSDERBase instanceof IPSDER1N) {

				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.NESTED) == 0) {
					continue;
				}

				this.translateEntityNestedDER1NAfterProceed(objKey, arg0, iPSDER1N, iPSDataEntity, iDynaInstRuntime, actionData);
				continue;
			}

			// if(iPSDERBase instanceof IPSDER1N) {
			//
			// IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
			// if((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.NESTED) == 0){
			// continue;
			// }
			//
			// this.translateEntityOne2ManyFieldBeforeProceed(arg0, iPSDER1N,
			// iPSDataEntity, iDynaInstRuntime, actionData);
			// continue;
			// }
		}

		// for(IPSDEField iPSDEField : psDEFields) {
		// //属性类型为ONE2MANY 或 ONE2ONE
		// if(DEFDataTypes.ONE2MANYDATA.equals(iPSDEField.getDataType())) {
		// if(!(iPSDEField instanceof IPSOne2ManyDataDEField)) {
		// throw new DataEntityRuntimeException(String.format("属性[%1$s]类型不正确",
		// iPSDEField.getName()), Errors.MODELERROR,this);
		// }
		// IPSOne2ManyDataDEField iPSOne2ManyDataDEField =
		// (IPSOne2ManyDataDEField)iPSDEField;
		// this.translateEntityOne2ManyFieldAfterProceed(objKey, arg0,
		// iPSOne2ManyDataDEField, iPSDataEntity, iDynaInstRuntime, actionData);
		// continue;
		// }
		// if(DEFDataTypes.ONE2ONEDATA.equals(iPSDEField.getDataType())) {
		// if(!(iPSDEField instanceof IPSOne2OneDataDEField)) {
		// throw new DataEntityRuntimeException(String.format("属性[%1$s]类型不正确",
		// iPSDEField.getName()), Errors.MODELERROR,this);
		// }
		// IPSOne2OneDataDEField iPSOne2OneDataDEField =
		// (IPSOne2OneDataDEField)iPSDEField;
		// this.translateEntityOne2OneFieldAfterProceed(objKey, arg0,
		// iPSOne2OneDataDEField, iPSDataEntity, iDynaInstRuntime, actionData);
		// continue;
		// }
		// }
	}

	protected void translateEntityNestedDER1NAfterProceed(Object objKey, IEntityBase arg0, IPSDER1N iPSDER1N, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntity().getDynaModelFilePath());
		if (minorDataEntityRuntime.getStorageMode() == DEStorageModes.NONE) {
			// 判断是否有一对多关系数据存储属性
			if (iPSDER1N.getPSOne2ManyDataDEField() == null) {
				return;
			}

			Object objValue = this.getFieldValue(arg0, iPSDER1N.getPSOne2ManyDataDEField());
			if (ObjectUtils.isEmpty(objValue)) {
				return;
			}

			IEntityBase[] minorEntities = minorDataEntityRuntime.deserializeEntities(objValue);
			if (minorEntities != null) {
				this.setNestedDERValue(arg0, iPSDER1N, minorEntities);
			} else {
				this.setNestedDERValue(arg0, iPSDER1N, null);
			}
			return;
		}

		String strParamKey = String.format("ONE2MANYDATA_%1$s_%2$s", iPSDER1N.getName(), actionSession.getSessionId());
		Object objActionParam = actionSession.getActionParam(strParamKey);
		IEntityBase[] minorEntities = null;
		boolean bGetOnly = true;
		if (objActionParam != null) {
			if (objActionParam != ActionSession.EMPTYPARAM) {
				minorEntities = (IEntityBase[]) objActionParam;
			}
			bGetOnly = false;
		}

		ISearchContextBase iSearchContextBase = minorDataEntityRuntime.createSearchContext();

		// 设置外键属性
		IPSDEField pickupPSDEField = iPSDER1N.getPSPickupDEField();
		// IPSDERBase iPSDERBase = iPSOne2ManyDataDEField.getPSDER();
		// if(iPSDERBase instanceof IPSDER1N) {
		// IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
		// pickupPSDEField = iPSDER1N.getPSPickupDEField();
		// }
		// else if(iPSDERBase instanceof IPSDERCustom) {
		// IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
		// pickupPSDEField = iPSDERCustom.getPickupPSDEField();
		// }

		if (pickupPSDEField == null) {
			throw new DataEntityRuntimeException(this, String.format("关系[%1$s]连接属性无效", iPSDER1N.getName()), Errors.MODELERROR);
		}

		minorDataEntityRuntime.setSearchCondition(iSearchContextBase, pickupPSDEField, Conditions.EQ, objKey);
		// 查出原数据
		List<? extends IEntityBase> lastMinorEntityList = minorDataEntityRuntime.select(iSearchContextBase);

		if (bGetOnly) {
			if (lastMinorEntityList != null) {
				this.setNestedDERValue(arg0, iPSDER1N, lastMinorEntityList.toArray(new IEntityBase[lastMinorEntityList.size()]));
			} else {
				this.setNestedDERValue(arg0, iPSDER1N, null);
			}
			return;
		}

		// 执行关系数据的新建、更新、删除操作
		Map<Object, IEntityBase> lastMinorEntityMap = new HashMap<Object, IEntityBase>();
		if (lastMinorEntityList != null) {
			for (IEntityBase lastEntityBase : lastMinorEntityList) {
				Object keyValue = minorDataEntityRuntime.getFieldValue(lastEntityBase, minorDataEntityRuntime.getKeyPSDEField());
				if (ObjectUtils.isEmpty(keyValue)) {
					continue;
				}
				lastMinorEntityMap.put(keyValue, lastEntityBase);
			}
		}

		if (minorEntities != null) {
			for (IEntityBase iEntityBase : minorEntities) {
				Object keyValue = minorDataEntityRuntime.getFieldValue(iEntityBase, minorDataEntityRuntime.getKeyPSDEField());
				IEntityBase lastEntityBase = null;
				if (!ObjectUtils.isEmpty(keyValue)) {
					lastEntityBase = lastMinorEntityMap.remove(keyValue);
				}

				if (lastEntityBase == null) {
					// 新建
					minorDataEntityRuntime.setFieldValue(iEntityBase, pickupPSDEField, objKey);
					minorDataEntityRuntime.executeAction(DEActions.CREATE, null, new Object[] { iEntityBase });
				} else {
					// 更新，先判断上一次的外键值是否一致
					Object lastPickupValue = minorDataEntityRuntime.getFieldValue(lastEntityBase, pickupPSDEField);
					if (this.getSystemRuntime().compareValue(objKey, lastPickupValue, pickupPSDEField.getStdDataType()) != 0) {
						log.error(String.format("关系数据[%1$s][%2$s]外键值前后不一致", minorDataEntityRuntime.getName(), keyValue));
						throw new DataEntityRuntimeException(this, String.format("关系数据与当前数据的连接值前后不一致"));
					}
					minorDataEntityRuntime.setFieldValue(iEntityBase, pickupPSDEField, objKey);
					minorDataEntityRuntime.executeAction(DEActions.UPDATE, null, new Object[] { iEntityBase });
				}
			}
		}

		// 移除数据
		for (java.util.Map.Entry<Object, IEntityBase> entry : lastMinorEntityMap.entrySet()) {
			minorDataEntityRuntime.executeAction(DEActions.REMOVE, null, new Object[] { entry.getKey() });
		}

		// 重写查询
		lastMinorEntityList = minorDataEntityRuntime.select(iSearchContextBase);

		if (lastMinorEntityList != null) {
			this.setNestedDERValue(arg0, iPSDER1N, lastMinorEntityList.toArray(new IEntityBase[lastMinorEntityList.size()]));
		} else {
			this.setNestedDERValue(arg0, iPSDER1N, null);
		}
	}

	/**
	 * 操作之前 审计数据对象
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void auditEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (this.getDataAuditMode() != DEDataAuditModes.ADVANCE) {
			return;
		}

		// Assert.notNull(arg0,"传入数据对象无效");
		//
		// Object objKeyValue = this.getFieldValue(arg0,
		// this.getKeyPSDEField());
		// if(ObjectUtils.isEmpty(objKeyValue)) {
		// return ;
		// }
		//
		// //查询上一次的数据
		// ISearchContextBase iSearchContextBase = this.createSearchContext();
		// this.setSearchCondition(iSearchContextBase, this.getKeyPSDEField(),
		// Conditions.EQ, objKeyValue);
		//
		// IEntityBase last = null;
		// List<? extends IEntityBase> page =
		// this.selectDataQuery(this.getAuditPSDEDataQuery(),
		// iSearchContextBase);
		// if(page!=null && page.size() > 0) {
		// last = page.get(0);
		// }
		//
		// ActionSession actionSession =
		// ActionSessionManager.getCurrentSessionMust();
		// //备份数据
		// String strParamKey = String.format("AUDITDATA_%1$s",
		// actionSession.getSessionId());
		// actionSession.setActionParam(strParamKey, (last != null)? last:
		// ActionSession.EMPTYPARAM);

		this.prepareLastBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	/**
	 * 操作之后 审计数据对象
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void auditEntityAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		IEntityBase iEntityBase = null;
		// 更替参数
		if (objRet != null && objRet instanceof IEntityBase) {
			iEntityBase = (IEntityBase) objRet;
		} else if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		IEntityBase lastEntityBase = null;
		if (this.getDataAuditMode() == DEDataAuditModes.ADVANCE) {
			lastEntityBase = getLastEntity();
		}

		this.getDEDataAuditUtilRuntime().auditAction((iEntityBase != null) ? iEntityBase : arg0, lastEntityBase, strActionName, iPSDEAction, iPSDataEntity, this, iDynaInstRuntime, actionData);
	}

	/**
	 * 操作之前 备份数据
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void prepareLastBeforeProceed(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		Assert.notNull(arg0, "传入数据对象无效");

		if (getLastEntity() != null) {
			// 已经准备
			return;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("AUDITDATA_%1$s", actionSession.getSessionId());
		Object param = actionSession.getActionParam(strParamKey);
		if (param != null) {
			return;
		}

		Object objKeyValue = null;
		IEntityBase iEntityBase = null;
		if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase)arg0;
			objKeyValue = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKeyValue = arg0;
		}

		if (ObjectUtils.isEmpty(objKeyValue)) {
			return;
		}

//		// 查询上一次的数据
//		ISearchContextBase iSearchContextBase = this.createSearchContext();
//		this.setSearchCondition(iSearchContextBase, this.getKeyPSDEField(), Conditions.EQ, objKeyValue);
//
//		
//		
//		List<? extends IEntityBase> page = this.selectDataQuery(this.getViewPSDEDataQuery(), iSearchContextBase);
//		if (page != null && page.size() > 0) {
//			last = page.get(0);
//		}
		
		//调整为GET，select未提供嵌套成员数据填充
		IEntityBase last = this.get(objKeyValue);

		if (last != null) {
			this.fillLastEntity(last, arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		}

		// 备份数据
		actionSession.setActionParam(strParamKey, (last != null) ? last : ActionSession.EMPTYPARAM);

		// 进一步写回
		if(iEntityBase!=null && iPSDEAction != null && iPSDEAction.getPrepareLastMode() == DEActionPrepareLastMode.FILLED.value) {
			fillEntityFromLast(iEntityBase, last, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		}
	}

	protected void fillLastEntity(IEntityBase last, Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		
		
	}
	
	protected void fillEntityFromLast(IEntityBase iEntityBase, IEntityBase last, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		java.util.List<IPSDEField> psDEFieldList = iPSDataEntity.getAllPSDEFields();
		if(ObjectUtils.isEmpty(psDEFieldList)) {
			return;
		}
		
		for(IPSDEField iPSDEField :psDEFieldList) {
			if(this.containsFieldValue(iEntityBase, iPSDEField)
					|| !this.containsFieldValue(last, iPSDEField)) {
				continue;
			}
			
			this.setFieldValue(iEntityBase, iPSDEField, this.getFieldValue(last, iPSDEField));
		}
	}

	@Override
	public IEntityBase getLastEntity() {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strParamKey = String.format("AUDITDATA_%1$s", actionSession.getSessionId());
		Object param = actionSession.getActionParam(strParamKey);

		if (param != null && param != ActionSession.EMPTYPARAM) {
			return (IEntityBase) param;
		}
		return null;
	}

	protected int getDataSyncEvent(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if(iPSDEAction.getSyncEvent() != DEDataSyncEvents.AUTO) {
				return iPSDEAction.getSyncEvent();
			}
			
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return DEDataSyncEvents.CREATE;
			}

			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return DEDataSyncEvents.UPDATE;
			}

			if (DEActionModes.REMOVE.equals(iPSDEAction.getActionMode())) {
				return DEDataSyncEvents.REMOVE;
			}

			if (DEActionModes.CUSTOM.equals(iPSDEAction.getActionMode())) {
				return DEDataSyncEvents.UPDATE;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return DEDataSyncEvents.CREATE;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return DEDataSyncEvents.UPDATE;
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return DEDataSyncEvents.REMOVE;
		}

		return DEDataSyncEvents.NONE;
	}

	/**
	 * 操作之后 同步数据对象
	 * 
	 * @param nEvent
	 *            事件
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void syncEntityAfterProceed(int nEvent, Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IDEDataSyncOutRuntime> deDataSyncOutRuntimes = null;
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		if (actionSession.getDynaInstRuntime() != null) {
			// 只从默认实例获取数据同步
			IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = actionSession.getDynaInstRuntime().getDynaInstDataEntityRuntime(this.getId());
			if (iDynaInstDataEntityRuntime != null) {
				deDataSyncOutRuntimes = iDynaInstDataEntityRuntime.getDEDataSyncOutRuntimes();
			} else {
				deDataSyncOutRuntimes = this.getDEDataSyncOutRuntimes();
			}

		} else {
			// 核心模式
			deDataSyncOutRuntimes = this.getDEDataSyncOutRuntimes();
		}
		if (deDataSyncOutRuntimes == null) {
			return;
		}

		for (IDEDataSyncOutRuntime iDEDataSyncOutRuntime : deDataSyncOutRuntimes) {
			if (!iDEDataSyncOutRuntime.isRealTimeMode()) {
				continue;
			}
			iDEDataSyncOutRuntime.send(nEvent, arg0, (iPSDEAction != null) ? iPSDEAction : strActionName);
		}
	}

	protected void buildParentPathBeforeProceed(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.getRecursivePSDER1N() == null || this.getRecursivePSDER1N().getPSPickupDEField() == null) {
			return;
		}

		IEntityBase iEntityBase = null;
		if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		IPSDEField pickupPSDEField = this.getRecursivePSDER1N().getPSPickupDEField();

		// 判断是否计算相关信息
		boolean bCalcParentIdPath = false;
		// boolean bCalcParentNamePath = false;

		if (this.getParentIdPathPSDEField() != null) {
			if (this.containsFieldValue(iEntityBase, pickupPSDEField)) {
				bCalcParentIdPath = true;
			}
		}
		// if (this.getParentNamePathPSDEField() != null) {
		// if (this.containsFieldValue(iEntityBase, this.getMajorPSDEField())) {
		// bCalcParentNamePath = true;
		// }
		// }
		IEntityBase lastEntity = this.getLastEntity();
		if (lastEntity != null) {
			if (bCalcParentIdPath) {
				Object objParentKey = this.getFieldValue(iEntityBase, pickupPSDEField);
				Object lastParentKey = this.getFieldValue(lastEntity, pickupPSDEField);
				if (this.getSystemRuntime().testValueCond(objParentKey, Conditions.EQ, lastParentKey, pickupPSDEField.getStdDataType())) {
					bCalcParentIdPath = false;
					// bCalcParentNamePath = false;
				}
			}
		}

		if (!bCalcParentIdPath) {
			return;
		}

		Map<Object, IEntityBase> map = new HashMap<Object, IEntityBase>();

		Object parentId = this.getFieldValue(iEntityBase, pickupPSDEField);

		if (this.getParentIdPathPSDEField() != null) {
			this.setFieldValue(iEntityBase, this.getParentIdPathPSDEField(), calcParentIdPath(parentId, pickupPSDEField, map));
		}
	}

	/**
	 * 操作之后 构建父路径
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void buildParentPathAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		// 判断路径是否一致，如补一致需要执行批更新
		if (this.getRecursivePSDER1N() == null || this.getRecursivePSDER1N().getPSPickupDEField() == null) {
			return;
		}

		IEntityBase iEntityBase = null;
		// 更替参数
		if (objRet != null && objRet instanceof IEntityBase) {
			iEntityBase = (IEntityBase) objRet;
		} else if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		IPSDEField pickupPSDEField = this.getRecursivePSDER1N().getPSPickupDEField();

		// 判断是否计算相关信息
		boolean bCalcParentIdPath = false;
		// boolean bCalcParentNamePath = false;
		//
		Object objParentIdPath = null;
		if (this.getParentIdPathPSDEField() != null) {
			if (this.containsFieldValue(iEntityBase, pickupPSDEField)) {
				bCalcParentIdPath = true;
				objParentIdPath = this.getFieldValue(iEntityBase, getParentIdPathPSDEField());
			}
		}

		if (!bCalcParentIdPath) {
			return;
		}

		// if (this.getParentNamePathPSDEField() != null) {
		// if (this.containsFieldValue(iEntityBase, this.getMajorPSDEField())) {
		// bCalcParentNamePath = true;
		// }
		// }
		IEntityBase lastEntity = this.getLastEntity();
		Object lastParentIdPath = null;
		if (lastEntity != null) {
			if (bCalcParentIdPath) {
				lastParentIdPath = this.getFieldValue(lastEntity, getParentIdPathPSDEField());
				if (this.getSystemRuntime().testValueCond(objParentIdPath, Conditions.EQ, lastParentIdPath, pickupPSDEField.getStdDataType())) {
					bCalcParentIdPath = false;
				}
			}
		}

		if (!bCalcParentIdPath) {
			return;
		}
		Object keyValue = this.getKeyFieldValue(iEntityBase);
		String strKeyOnlyId = String.format("%1$s/", keyValue);
		String strFullId = null;
		if (ObjectUtils.isEmpty(objParentIdPath)) {
			strFullId = String.format("%1$s/", keyValue);
		} else {
			strFullId = String.format("%1$s%2$s/", objParentIdPath, keyValue);
		}
		//

		// 查出全部匹配匹配左侧数据
		ISearchContextBase iSearchContextBase = this.createSearchContext();
		this.setSearchCondition(iSearchContextBase, this.getParentIdPathPSDEField(), Conditions.LIKE, strKeyOnlyId);

		this.getDataEntityRuntime().setSearchPaging(iSearchContextBase, ISearchContext.STARTPAGE, Integer.MAX_VALUE, null);

		List<? extends IEntityBase> list = this.selectDataQuery(this.getSimplePSDEDataQuery(), iSearchContextBase);
		if (ObjectUtils.isEmpty(list)) {
			return;
		}

		List<IEntityBase> updateItemList = new ArrayList<IEntityBase>();

		for (IEntityBase item : list) {
			IEntityBase updateItem = this.createEntity();
			this.setFieldValue(updateItem, this.getKeyPSDEField(), this.getFieldValue(item, this.getKeyPSDEField()));
			String strParentIdPath = (String) this.getFieldValue(item, this.getParentIdPathPSDEField());
			if (!StringUtils.hasLength(strParentIdPath)) {
				continue;
			}

			int nPos = strParentIdPath.indexOf(strKeyOnlyId);
			if (nPos == -1) {
				continue;
			}

			String strNewId = strParentIdPath.substring(nPos + strKeyOnlyId.length());
			if (StringUtils.hasLength(strNewId)) {
				strNewId = String.format("%1$s%2$s", strFullId, strNewId);
			} else {
				strNewId = strFullId;
			}

			this.setFieldValue(updateItem, this.getParentIdPathPSDEField(), strNewId);
			updateItemList.add(updateItem);
		}

		if (ObjectUtils.isEmpty(updateItemList)) {
			return;
		}

		this.sysUpdate(updateItemList.toArray(new IEntityBase[updateItemList.size()]), true);
	}

	protected String calcParentIdPath(Object parentId, IPSDEField pickupPSDEField, Map<Object, IEntityBase> map) throws Throwable {
		if (ObjectUtils.isEmpty(parentId)) {
			return null;
		}

		// 获取数据，并进行填充
		IEntityBase parent = map.get(parentId);
		if (parent == null) {
			ISearchContextBase iSearchContextBase = this.createSearchContext();
			this.setSearchCondition(iSearchContextBase, this.getKeyPSDEField(), Conditions.EQ, parentId);
			List<? extends IEntityBase> list = this.selectDataQuery(this.getSimplePSDEDataQuery(), iSearchContextBase);
			if (ObjectUtils.isEmpty(list)) {
				throw new DataEntityRuntimeException(this, String.format("无法获取指定父数据[%1$s]", parentId));
			}
			parent = list.get(0);
			map.put(parentId, parent);
		}

		ActionSessionManager.getCurrentSession().registerRecursion("calcParentIdPath", this.getId(), parentId);
		// 获取数据中的父ID路径
		String strParentPath = (String) this.getFieldValue(parent, this.getParentIdPathPSDEField());
		if (!StringUtils.hasLength(strParentPath)) {
			// 未指定，强行计算
			strParentPath = calcParentIdPath(this.getFieldValue(parent, pickupPSDEField), pickupPSDEField, map);
			if (StringUtils.hasLength(strParentPath)) {
				this.setFieldValue(parent, this.getParentIdPathPSDEField(), strParentPath);
			}
		}
		ActionSessionManager.getCurrentSession().unregisterRecursion("calcParentIdPath", this.getId(), parentId);

		if (!StringUtils.hasLength(strParentPath)) {
			return String.format("%1$s/", parentId);
		} else {
			return String.format("%1$s%2$s/", strParentPath, parentId);
		}

	}

	protected String calcParentNamePath(Object parentId, IPSDEField pickupPSDEField, Map<Object, IEntityBase> map) throws Throwable {
		if (ObjectUtils.isEmpty(parentId)) {
			return null;
		}

		// 获取数据，并进行填充
		IEntityBase parent = map.get(parentId);
		if (parent == null) {
			ISearchContextBase iSearchContextBase = this.createSearchContext();
			this.setSearchCondition(iSearchContextBase, this.getKeyPSDEField(), Conditions.EQ, parentId);
			List<? extends IEntityBase> list = this.selectDataQuery(this.getSimplePSDEDataQuery(), iSearchContextBase);
			if (ObjectUtils.isEmpty(list)) {
				throw new DataEntityRuntimeException(this, String.format("无法获取指定父数据[%1$s]", parentId));
			}
			parent = list.get(0);
			map.put(parentId, parent);
		}

		Object parentName = this.getFieldValue(parent, this.getMajorPSDEField());

		ActionSessionManager.getCurrentSession().registerRecursion("calcParentNamePath", this.getId(), parentId);
		// 获取数据中的父名称路径
		String strParentPath = (String) this.getFieldValue(parent, this.getParentNamePathPSDEField());
		if (!StringUtils.hasLength(strParentPath)) {
			// 未指定，强行计算
			strParentPath = calcParentNamePath(this.getFieldValue(parent, pickupPSDEField), pickupPSDEField, map);
			if (StringUtils.hasLength(strParentPath)) {
				this.setFieldValue(parent, this.getParentNamePathPSDEField(), strParentPath);
			}
		}
		ActionSessionManager.getCurrentSession().unregisterRecursion("calcParentNamePath", this.getId(), parentId);

		if (!StringUtils.hasLength(strParentPath)) {
			return String.format("%1$s/", parentName);
		} else {
			return String.format("%1$s%2$s/", strParentPath, parentName);
		}
	}

	/**
	 * 操作之后 推入异步处理队列
	 * 
	 * @param arg0
	 * @param objRet
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void pushDTSQueueAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (this.getDefaultPSDEDTSQueue() == null) {
			return;
		}

		IEntityBase iEntityBase = null;
		// 更替参数
		if (objRet != null && objRet instanceof IEntityBase) {
			iEntityBase = (IEntityBase) objRet;
		} else if (arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase) arg0;
		}

		if (iEntityBase == null) {
			return;
		}

		this.getDEDTSQueueRuntime(this.getDefaultPSDEDTSQueue()).push(iEntityBase);
	}

	@Override
	public IEntityBase[] deserializeEntities(Object objData) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IEntityBase deserializeEntity(Object objData) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object serializeEntities(IEntityBase[] list) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object serializeEntity(IEntityBase iEntityBase) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IEntityBase[] getNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase, IEntityBase[] value) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public boolean containsNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void resetNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, String strCondition, Object objValue) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode, Object objValue) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object getSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object getSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, String strCondition) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setSearchCustomCondition(ISearchContextBase iSearchContextBase, String strCustomCondition) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setSearchPaging(ISearchContextBase iSearchContextBase, int nPageIndex, int nPageSize, Sort sort) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setSearchDataContext(ISearchContextBase iSearchContextBase, String strParam, Object objValue) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object getSearchDataContext(ISearchContextBase iSearchContextBase, String strParam) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void setSearchMode(ISearchContextBase iSearchContextBase, boolean bData, boolean bCount) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void resetSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IPSDEFSearchMode getPSDEFSearchMode(String strName, boolean bTryMode) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object getKeyFieldValue(IEntityBase iEntityBase) {
		return this.getFieldValue(iEntityBase, this.getKeyPSDEField());
	}

	protected DEFVRConditionException createDEFVRConditionException(IPSDEFVRCondition iPSDEFVRCondition, String strInfo, String strResTag, IPSDEField iPSDEField) {
		return new DEFVRConditionException(iPSDEFVRCondition, strInfo, iPSDEField, this);
	}

	@Override
	public Object convertValue(int nDataType, String strValue) throws Exception {
		return this.getSystemRuntime().convertValue(nDataType, strValue);
	}

	@Override
	public boolean testValueCond(Object objSrcValue, String strOp, Object objDstValue, int nValueDataType) {
		return this.getSystemRuntime().testValueCond(objSrcValue, strOp, objDstValue, nValueDataType);
	}

	@Override
	public long compareValue(Object objSrcValue, Object objDstValue, int nValueDataType) {
		return this.getSystemRuntime().compareValue(objSrcValue, objDstValue, nValueDataType);
	}

	/**
	 * 操作之前转换搜索上下文
	 * 
	 * @param arg0
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void translateSearchContextBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	/**
	 * 操作之前转换搜索上下文（动态属性）
	 * 
	 * @param arg0
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void translateSearchContextDynaFieldsBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	/**
	 * 操作之后转换分页结果对象
	 * 
	 * @param arg0
	 * @param list
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void translateEntityDynaFieldsAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}
	
//	/**
//	 * 操作之后转换分页结果对象
//	 * 
//	 * @param arg0
//	 * @param list
//	 * @param strDataSetName
//	 * @param iPSDEDataSet
//	 * @param iPSDataEntity
//	 * @param iDynaInstRuntime
//	 * @param actionData
//	 * @throws Throwable
//	 */
//	protected void translateEntityDynaFieldsAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
//
//	}
	

	@Override
	public List<IPSDEField> getPSDEFields(IPSDEDataQuery iPSDEDataQuery) {
		Assert.notNull(iPSDEDataQuery, "未传入实体数据查询模型对象");
		
		List<IPSDEField> list = this.psDEDataQueryFieldsMap.get(iPSDEDataQuery.getId());
		if(list != null) {
			return list;
		}
		
		try {
			list = this.onGetPSDEFields(iPSDEDataQuery);
			this.psDEDataQueryFieldsMap.put(iPSDEDataQuery.getId(), list);
			return list;
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体查询模型[%1$s]属性集合发生异常，%2$s", iPSDEDataQuery.getName(), ex.getMessage()), ex);
		}
	}
	
	protected List<IPSDEField> onGetPSDEFields(IPSDEDataQuery iPSDEDataQuery) throws Throwable{
		IPSDataEntity iPSDataEntity = this.getPSDataEntity();

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (ObjectUtils.isEmpty(psDEFields)) {
			return null;
		}

		int nViewLevel = iPSDEDataQuery.getViewLevel();

		java.util.List<IPSDEField> selectedPSDEFieldList = new ArrayList<IPSDEField>();
		// 判断数据查询模式
		if (nViewLevel == PSModelEnums.DEDataQueryViewLevel.QUERYCOLUMN.value) {
			for (IPSDEField iPSDEField : psDEFields) {
				if (iPSDEField.isQueryColumn()) {
					selectedPSDEFieldList.add(iPSDEField);
				}
			}
			return selectedPSDEFieldList;
		}

		if (nViewLevel == PSModelEnums.DEDataQueryViewLevel.ALL.value) {
			for (IPSDEField iPSDEField : psDEFields) {
				if (iPSDEField.getDEFType() == 1 || iPSDEField.getDEFType() == 2 || iPSDEField.getDEFType() == 3) {
					selectedPSDEFieldList.add(iPSDEField);
				}
			}
			return selectedPSDEFieldList;
		}

		if (nViewLevel == PSModelEnums.DEDataQueryViewLevel.DEFGROUP.value) {
			IPSDEFGroup iPSDEFGroup = iPSDEDataQuery.getPSDEFGroupMust();
			List<IPSDEFGroupDetail> psDEFGroupDetailList = iPSDEFGroup.getPSDEFGroupDetails();
			if (psDEFGroupDetailList != null) {
				for (IPSDEFGroupDetail iPSDEFGroupDetail : psDEFGroupDetailList) {
					IPSDEField iPSDEField = iPSDEFGroupDetail.getPSDEField();
					if (iPSDEField == null) {
						iPSDEField = this.getPSDEField(iPSDEFGroupDetail.getName());
					}
					if (iPSDEField == null) {
						throw new net.ibizsys.model.PSModelException(iPSDEFGroupDetail, "未指定实体属性");
					}
					selectedPSDEFieldList.add(iPSDEField);

					// selectedPSDEFieldList.add(iPSDEFGroupDetail.getPSDEFieldMust());
				}
			}
			return selectedPSDEFieldList;
		}

		for (IPSDEField iPSDEField : psDEFields) {
			if (nViewLevel <= iPSDEField.getViewLevel()) {
				selectedPSDEFieldList.add(iPSDEField);
				continue;
			}
		}

		if (this.getKeyPSDEField() != null) {
			if (!selectedPSDEFieldList.contains(this.getKeyPSDEField())) {
				selectedPSDEFieldList.add(this.getKeyPSDEField());
			}
		}

		if (this.getLogicValidPSDEField() != null) {
			if (!selectedPSDEFieldList.contains(this.getLogicValidPSDEField())) {
				selectedPSDEFieldList.add(this.getLogicValidPSDEField());
			}
		}

		return selectedPSDEFieldList;
	}
}
