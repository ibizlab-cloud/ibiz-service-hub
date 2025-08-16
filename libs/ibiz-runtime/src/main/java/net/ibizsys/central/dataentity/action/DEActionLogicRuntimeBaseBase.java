package net.ibizsys.central.dataentity.action;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.mainstate.IPSDEMainState;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.runtime.dataentity.action.DEActionLogicAttachModes;
import net.ibizsys.runtime.dataentity.action.DEActionLogicTypes;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.EntityException;
import net.ibizsys.runtime.util.Errors;

public abstract class DEActionLogicRuntimeBaseBase implements IDEActionLogicRuntimeBase{

	public abstract IPSDEActionLogic getPSDEActionLogic();
	
	
	public abstract ISystemRuntime getSystemRuntime();
	
	
	@Override
	public String getAttachMode() {
		return this.getPSDEActionLogic().getAttachMode();
	}
	
	@Override
	public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable {
		Assert.notNull(iDataEntityRuntimeContext, "传入实体运行时上下文对象无效");
		final IPSDEActionLogic iPSDEActionLogic = this.getPSDEActionLogic();
		return this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, args, ret);
	}
	
	protected Object onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IPSDEActionLogic iPSDEActionLogic, Object[] args, Object ret)  throws Throwable {
		Object arg0 = null;
		if (args != null && args.length > 0) {
			arg0 = args[0]; 
		}
		
		final String strAttachMode = getAttachMode();
		switch(strAttachMode) {
		case DEActionLogicAttachModes.PREPARE:
		case DEActionLogicAttachModes.CHECK:
		case DEActionLogicAttachModes.BEFORE:
			this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, arg0, args, ret);
			return ret;
		case DEActionLogicAttachModes.AFTER:
			if (ret != null) {
				this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, ret, args, ret);
			}
			else {
				this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, arg0, args, ret);
			}
			return ret;
		default:
			throw new Exception(String.format("无法识别的逻辑附加模式[%1$s]", strAttachMode));
		}
	}
	
	protected void onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IPSDEActionLogic iPSDEActionLogic, Object obj, Object[] args, Object ret)  throws Throwable {
		if(obj instanceof IEntityDTO) {
			this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, (IEntityDTO)obj, args, ret);
			return;
		}
		else
			if(obj instanceof List) {
				List list = (List)obj;
				for(Object item : list) {
					this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, item, args, ret);
				}
				return;
			}
			else
				if(DataTypeUtils.asSimple(obj)!=null) {
					IEntityDTO iEntityDTO = iDataEntityRuntimeContext.getDataEntityRuntime().createEntity();
					iEntityDTO.set(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), obj);
					this.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, iEntityDTO, args, ret);
					return;
				}
		
		throw new Exception(String.format("无法识别的数据[%1$s]", obj));
	}
	
	protected void onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IPSDEActionLogic iPSDEActionLogic, IEntityDTO iEntityDTO, Object[] args, Object ret)  throws Throwable {
		boolean bCloneParam = iPSDEActionLogic.isCloneParam();
		int nActionLogicType = iPSDEActionLogic.getActionLogicType();
		
		IDataEntityRuntime iDataEntityRuntime = iDataEntityRuntimeContext.getDataEntityRuntime();
		
		if (nActionLogicType == DEActionLogicTypes.EXTERNAL) {

			// 直接调用外部行为
			IDataEntityRuntime dstDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());
			IPSDEAction dstPSDEAction = iPSDEActionLogic.getDstPSDEActionMust();
			IPSDEMethodDTO dstPSDEMethodDTO = null;
			if (!DEMethodInputTypes.DTO.equals(dstPSDEAction.getPSDEActionInputMust().getType())) {
				throw new Exception(String.format("实体[%1$s]行为[%2$s]输入类型必须为[DTO]", dstDataEntityRuntime.getName(), dstPSDEAction.getName()));
			}
			dstPSDEMethodDTO = dstPSDEAction.getPSDEActionInput().getPSDEMethodDTOMust();
			if (!bCloneParam) {
				if (!iDataEntityRuntime.getId().equals(iPSDEActionLogic.getDstPSDEMust().getId())) {
					bCloneParam = true;
				} else {
					// 判断行为使用的DTO是否一致
					if (iEntityDTO.getDEMethodDTORuntime() == null || iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() == null || !(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getId().equals(dstPSDEMethodDTO.getId()))) {
						bCloneParam = true;
					}
				}
			}
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				dstEntityDTO = (IEntityDTO) dstDataEntityRuntime.getDEMethodDTO(dstPSDEMethodDTO, null);
				iEntityDTO.copyTo(dstEntityDTO);
			} else {
				dstEntityDTO = iEntityDTO;
			}

			dstDataEntityRuntime.executeAction(dstPSDEAction.getName(), dstPSDEAction, new Object[] { dstEntityDTO });
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.INTERNAL) {
			IDELogicRuntime iDELogicRuntime = iDataEntityRuntime.getDELogicRuntime(iPSDEActionLogic.getPSDELogicMust());
			
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = iDataEntityRuntime.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}

			iDELogicRuntime.execute(new Object[] { dstEntityDTO });
			return;
		}
		
		if (nActionLogicType == DEActionLogicTypes.DSTDELOGIC) {
			IDataEntityRuntime dstDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());

			if (!bCloneParam) {
				net.ibizsys.central.dataentity.logic.IDELogicRuntime dstDELogicRuntime = dstDataEntityRuntime.getDELogicRuntime(iPSDEActionLogic.getDstPSDELogicMust());
				IDELogicParamRuntime iDELogicParamRuntime = dstDELogicRuntime.getDefaultDELogicParamRuntime();
				if(iDELogicParamRuntime!=null) {
					if(iDELogicParamRuntime.getDataEntityRuntime()!=null && !iDELogicParamRuntime.getDataEntityRuntime().getId().equals(iDataEntityRuntime.getId())) {
						bCloneParam = true;
					}
				}
			}
			
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if(dstDataEntityRuntime.getId().equals(iDataEntityRuntime.getId())) {
					if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
						dstEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
						iEntityDTO.copyTo(dstEntityDTO);
					} else {
						dstEntityDTO = iDataEntityRuntime.createEntity();
						iEntityDTO.copyTo(dstEntityDTO);
					}
				}
				else {
					dstEntityDTO = dstDataEntityRuntime.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			// 直接调用外部处理逻辑
			dstDataEntityRuntime.executeLogic(iPSDEActionLogic.getDstPSDELogicMust(), new Object[] { dstEntityDTO });
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.SCRIPT) {
			if (StringUtils.hasLength(iPSDEActionLogic.getScriptCode())) {
				IDEScriptLogicRuntime iDEScriptActionRuntime = iDataEntityRuntime.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getScriptCode());

				IEntityDTO dstEntityDTO = null;
				if (bCloneParam) {
					if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
						dstEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
						iEntityDTO.copyTo(dstEntityDTO);
					} else {
						dstEntityDTO = iDataEntityRuntime.createEntity();
						iEntityDTO.copyTo(dstEntityDTO);
					}
				} else {
					dstEntityDTO = iEntityDTO;
				}

				iDEScriptActionRuntime.execute(new Object[] { dstEntityDTO });
			}
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.NOTIFY) {
			IPSDENotify iPSDENotify = iPSDEActionLogic.getPSDENotifyMust();
			IDENotifyRuntime iDENotifyRuntime = iDataEntityRuntime.getDENotifyRuntime(iPSDENotify);

			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = iDataEntityRuntime.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			
			if(iDENotifyRuntime instanceof net.ibizsys.central.dataentity.notify.IDENotifyRuntime) {
				Map<String, Object> notifyParams = new LinkedHashMap<String, Object>();
				notifyParams.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, iDataEntityRuntime.getLastEntity());
				((net.ibizsys.central.dataentity.notify.IDENotifyRuntime)iDENotifyRuntime).send(dstEntityDTO, notifyParams);
			}
			else {
				iDENotifyRuntime.send(dstEntityDTO);
			}

			return;
		}

//		if (nActionLogicType == DEActionLogicTypes.FILLMAINSTATE) {
//			IPSDEMainState iPSDEMainState = iPSDEActionLogic.getPSDEMainStateMust();
//			List<IPSDEMainStateField> psDEMainStateFieldList = iPSDEMainState.getPSDEMainStateFields();
//			if(!ObjectUtils.isEmpty(psDEMainStateFieldList)) {
//				for(IPSDEMainStateField iPSDEMainStateField : psDEMainStateFieldList) {
//					if(iPSDEMainStateField.isAllowMode()) {
//
//						String strDefaultValueType = iPSDEMainStateField.getDefaultValueType();
//
//
//					}
//					else {
//						iEntityDTO.reset(iPSDEMainStateField.getPSDEFieldMust().getLowerCaseName());
//					}
//				}
//			}
//
//			return;
//		}

		if (nActionLogicType == DEActionLogicTypes.DATASYNC) {
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = iDataEntityRuntime.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			iDataEntityRuntime.getDEDataSyncOutRuntime(iPSDEActionLogic.getPSDEDataSyncMust()).sendDirect(iPSDEActionLogic.getDataSyncEvent(), dstEntityDTO);
			return;
		}


		if (nActionLogicType == DEActionLogicTypes.DSTDATAACTION) {
			Object objKey = iEntityDTO.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
			IPSDERBase iPSDERBase = iPSDEActionLogic.getMajorPSDERMust();
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());


			IPSDEDataSet minorPSDEDataSet = null;
			String strPickupFieldName = null;
			if(iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
				minorPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
				strPickupFieldName = iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName();
			}
			else
			if(iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
				minorPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				if(iPSDERCustom.getPickupPSDEField()!=null) {
					strPickupFieldName = iPSDERCustom.getPickupPSDEField().getLowerCaseName();
				}
			}
			if(minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO()!=null) {
				iSearchContextDTO = (ISearchContextDTO)minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			}
			else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKey);
			if(StringUtils.hasLength(strPickupFieldName)) {
				iSearchContextDTO.eq(strPickupFieldName, objKey);
			}
			iSearchContextDTO.all().count(false);
			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if(!ObjectUtils.isEmpty(entityDTOList)) {
				for(IEntityDTO dstEntity : entityDTOList) {
					minorDataEntityRuntime.executeAction(iPSDEActionLogic.getDstPSDEActionMust().getName(), iPSDEActionLogic.getDstPSDEActionMust(), new Object[] {dstEntity});
				}
			}
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.DSTDATAACTION2) {
			Object objKey = iEntityDTO.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());
			IPSDEDataSet minorPSDEDataSet = iPSDEActionLogic.getDstPSDEDataSetMust();

			if(minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO()!=null) {
				iSearchContextDTO = (ISearchContextDTO)minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			}
			else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKey);

			iSearchContextDTO.all().count(false);
			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if(!ObjectUtils.isEmpty(entityDTOList)) {
				for(IEntityDTO dstEntity : entityDTOList) {
					minorDataEntityRuntime.executeAction(iPSDEActionLogic.getDstPSDEActionMust().getName(), iPSDEActionLogic.getDstPSDEActionMust(), new Object[] {dstEntity});
				}
			}
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.SYSLOGIC) {
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = iDataEntityRuntime.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			this.getSystemRuntime().getSysLogicRuntime(iPSDEActionLogic.getPSSysLogicMust()).execute(dstEntityDTO);
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.SYSTRANSLATOR) {
			String strFieldName = iPSDEActionLogic.getPSDEFieldMust().getLowerCaseName();
			if(iEntityDTO.contains(strFieldName)) {
				Object value = iEntityDTO.get(strFieldName);
				//目前按照输入模式处理
				value = this.getSystemRuntime().getSysTranslatorRuntime(iPSDEActionLogic.getPSSysTranslatorMust()).translate(value, true, iEntityDTO, iPSDEActionLogic.getPSDEFieldMust(), iDataEntityRuntime);
				iEntityDTO.set(strFieldName, value);
			}
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.SYSSEQUENCE) {
			String strFieldName = iPSDEActionLogic.getPSDEFieldMust().getLowerCaseName();
			Object value = this.getSystemRuntime().getSysSequenceRuntime(iPSDEActionLogic.getPSSysSequenceMust()).get(iEntityDTO, iPSDEActionLogic.getPSDEFieldMust(), iDataEntityRuntime);
			iEntityDTO.set(strFieldName, value);
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKDEFVALUERULE) {
			String strFieldName = iPSDEActionLogic.getPSDEFieldMust().getLowerCaseName();
			if(iEntityDTO.contains(strFieldName)) {
				Object value = iEntityDTO.get(strFieldName);
				EntityError entityError = new EntityError();
				iDataEntityRuntime.checkFieldValueRule(value, iEntityDTO, iPSDEActionLogic.getPSDEFValueRuleMust(), iPSDEActionLogic.getPSDEFieldMust(), entityError);
				if (entityError.hasError()) {
					throw new EntityException(entityError, iDataEntityRuntime);
				}
			}
			return;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKMAINSTATE
				|| nActionLogicType == DEActionLogicTypes.CHECKNOTMAINSTATE) {

			Object objKey = iEntityDTO.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
			IPSDEMainState lastPSDEMainState = iDataEntityRuntime.getPSDEMainState(objKey);
			if(!StringUtils.hasLength(iPSDEActionLogic.getPSDEMainStateMust().getMSTag())) {
				throw new Exception(String.format("主状态[%1$s]未指定标记", iPSDEActionLogic.getPSDEMainStateMust().getName()));
			}

			int nErrorCode = iPSDEActionLogic.getErrorCode();
			if(nErrorCode == Errors.OK) {
				nErrorCode = Errors.INPUTERROR;
			}
			EntityError entityError = new EntityError();
			String strErrorInfo = iPSDEActionLogic.getErrorInfo();
			String strErrorLanResTag = null;
			if(iPSDEActionLogic.getErrorInfoPSLanguageRes()!=null) {
				strErrorLanResTag = iPSDEActionLogic.getErrorInfoPSLanguageRes().getLanResTag();
			}

			if(nActionLogicType == DEActionLogicTypes.CHECKMAINSTATE) {
				if(lastPSDEMainState == null || !iPSDEActionLogic.getPSDEMainStateMust().getMSTag().equals(lastPSDEMainState.getMSTag())) {
					if(!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = String.format("数据不处在主状态[%1$s]", iPSDEActionLogic.getPSDEMainStateMust().getName());
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			else if(nActionLogicType == DEActionLogicTypes.CHECKNOTMAINSTATE) {
				if(lastPSDEMainState != null && iPSDEActionLogic.getPSDEMainStateMust().getMSTag().equals(lastPSDEMainState.getMSTag())) {
					if(!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = String.format("数据已处在主状态[%1$s]", iPSDEActionLogic.getPSDEMainStateMust().getName());
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}

			if (entityError.hasError()) {
				throw new EntityException(entityError, iDataEntityRuntime);
			}

			return;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS
				|| nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS) {

			Object objKey = iEntityDTO.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
			IPSDERBase iPSDERBase = iPSDEActionLogic.getMajorPSDERMust();
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());

			IPSDEDataSet minorPSDEDataSet = null;
			String strPickupFieldName = null;
			if(iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
				minorPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
				strPickupFieldName = iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName();
			}
			else
			if(iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
				minorPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				if(iPSDERCustom.getPickupPSDEField()!=null) {
					strPickupFieldName = iPSDERCustom.getPickupPSDEField().getLowerCaseName();
				}
			}
			if(minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO()!=null) {
				iSearchContextDTO = (ISearchContextDTO)minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			}
			else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKey);
			if(StringUtils.hasLength(strPickupFieldName)) {
				iSearchContextDTO.eq(strPickupFieldName, objKey);
			}
			iSearchContextDTO.limit(1).count(false);

			int nErrorCode = iPSDEActionLogic.getErrorCode();
			if(nErrorCode == Errors.OK) {
				nErrorCode = Errors.INPUTERROR;
			}
			EntityError entityError = new EntityError();
			String strErrorInfo = iPSDEActionLogic.getErrorInfo();
			String strErrorLanResTag = null;
			if(iPSDEActionLogic.getErrorInfoPSLanguageRes()!=null) {
				strErrorLanResTag = iPSDEActionLogic.getErrorInfoPSLanguageRes().getLanResTag();
			}

			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if(!ObjectUtils.isEmpty(entityDTOList)) {
				if(nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS) {
					if(!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据已存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			else {
				if(nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS) {
					if(!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据不存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			if (entityError.hasError()) {
				throw new EntityException(entityError, iDataEntityRuntime);
			}

			return;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS2
				|| nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS2) {

			Object objKey = iEntityDTO.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());
			IPSDEDataSet minorPSDEDataSet = iPSDEActionLogic.getDstPSDEDataSetMust();

			if(minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO()!=null) {
				iSearchContextDTO = (ISearchContextDTO)minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			}
			else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKey);
			iSearchContextDTO.limit(1).count(false);

			int nErrorCode = iPSDEActionLogic.getErrorCode();
			if(nErrorCode == Errors.OK) {
				nErrorCode = Errors.INPUTERROR;
			}
			EntityError entityError = new EntityError();
			String strErrorInfo = iPSDEActionLogic.getErrorInfo();
			String strErrorLanResTag = null;
			if(iPSDEActionLogic.getErrorInfoPSLanguageRes()!=null) {
				strErrorLanResTag = iPSDEActionLogic.getErrorInfoPSLanguageRes().getLanResTag();
			}

			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if(!ObjectUtils.isEmpty(entityDTOList)) {
				if(nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS2) {
					if(!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据已存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			else {
				if(nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS2) {
					if(!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据不存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			if (entityError.hasError()) {
				throw new EntityException(entityError, iDataEntityRuntime);
			}

			return;
		}
		
		throw new Exception(String.format("未支持的逻辑附加类型[%1$s]", iPSDEActionLogic.getActionLogicType()));
	}
}
