package net.ibizsys.central.dataentity.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import javax.servlet.ServletResponse;

import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.central.dataentity.ac.IDEAutoCompleteRuntime;
import net.ibizsys.central.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionControlUtilRuntime;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntimeContext;
import net.ibizsys.central.service.SysServiceAPILevels;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetInput;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.der.DERSubTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodReturnTypes;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchCondRuntime;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.domain.File;

/**
 * 实体服务接口运行时对象接口
 * 
 * @author lionlau
 *
 */
public class DEServiceAPIRuntime extends DataEntityModelRuntimeBase implements IDEServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEServiceAPIRuntime.class);

	private ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext = null;
	private IPSDEServiceAPI iPSDEServiceAPI = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private Map<String, IPSDEServiceAPIMethod> psDEServiceAPIMethodMap = new HashMap<String, IPSDEServiceAPIMethod>();
	private String strAccessKey = null;

	@Override
	public void init(ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext, IPSDEServiceAPI iPSDEServiceAPI) throws Exception {
		Assert.notNull(iSysServiceAPIRuntimeContext, "传入系统服务接口运行时上下文对象无效");
		Assert.notNull(iPSDEServiceAPI, "传入实体服务接口模型对象无效");

		this.iSysServiceAPIRuntimeContext = iSysServiceAPIRuntimeContext;
		// 获取对应的实体运行时对象
		Object objDataEntityRuntime = iSysServiceAPIRuntimeContext.getSysServiceAPIRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEServiceAPI.getPSDataEntityMust().getId());
		if (!(objDataEntityRuntime instanceof IDataEntityRuntime)) {
			throw new DEServiceAPIRuntimeException(this, String.format("实体[%1$s]运行时对象不正确", iPSDEServiceAPI.getPSDataEntityMust().getId()));
		}
		iDataEntityRuntime = (IDataEntityRuntime) objDataEntityRuntime;
		this.setDataEntityRuntimeBase(iDataEntityRuntime);

		this.iPSDEServiceAPI = iPSDEServiceAPI;
		
		if(this.iPSDEServiceAPI.getPSSysUniRes()!=null) {
			this.strAccessKey = this.iPSDEServiceAPI.getPSSysUniResMust().getResCode();
		}

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		java.util.List<IPSDEServiceAPIMethod> psDEServcieAPIMethodList = this.getPSDEServiceAPI().getPSDEServiceAPIMethods();
		if (psDEServcieAPIMethodList != null) {
			for (IPSDEServiceAPIMethod iPSDEServiceAPIMethod : psDEServcieAPIMethodList) {
				if (StringUtils.hasLength(iPSDEServiceAPIMethod.getCodeName()) && !iPSDEServiceAPIMethod.isNoServiceCodeName()) {
					psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getCodeName(), iPSDEServiceAPIMethod);
					psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getCodeName().toUpperCase(), iPSDEServiceAPIMethod);
					psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getCodeName().toLowerCase(), iPSDEServiceAPIMethod);
				} else {
					if (iPSDEServiceAPIMethod.getPSDEAction() != null) {
						psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getPSDEAction().getCodeName(), iPSDEServiceAPIMethod);
						psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getPSDEAction().getCodeName().toUpperCase(), iPSDEServiceAPIMethod);
						psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getPSDEAction().getCodeName().toLowerCase(), iPSDEServiceAPIMethod);
					}
				}
			}
		}

		super.onInit();
	}

	@Override
	public ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		return this.getSysServiceAPIRuntimeContext().getSysServiceAPIRuntime();
	}

	@Override
	public IPSDEServiceAPI getPSDEServiceAPI() {
		return this.iPSDEServiceAPI;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEServiceAPI();
	}

	protected ISysServiceAPIRuntimeContext getSysServiceAPIRuntimeContext() {
		return this.iSysServiceAPIRuntimeContext;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	public String getAccessKey() {
		return this.strAccessKey;
	}
	
	protected ISystemAccessManager getSystemAccessManager() {
		return this.getSystemRuntime().getSystemAccessManager();
	}

	@Override
	public IPSDEServiceAPIMethod getPSDEServiceAPIMethod(String strMethodCodeName, boolean bTryMode) {
		IPSDEServiceAPIMethod iPSDEServiceAPIMethod = psDEServiceAPIMethodMap.get(strMethodCodeName);
		if (iPSDEServiceAPIMethod != null || bTryMode) {
			return iPSDEServiceAPIMethod;
		}

		throw new DEServiceAPIRuntimeException(this, String.format("不存在指定服务方法[%1$s]", strMethodCodeName));
	}

	protected void testAccessUser() throws Throwable {
		if(StringUtils.hasLength(this.getAccessKey())) {
			if(!this.getSystemAccessManager().testSysUniRes(UserContext.getCurrentMust(), this.getAccessKey())) {
				throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备资源能力[%2$s]", this.getLogicName(), this.getAccessKey()), Errors.ACCESSDENY);
			}
		}
	}
	
	@Override
	public Object invokeMethod(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		// 需要判断接口是否提供指定方法
		IPSDEServiceAPIMethod iPSDEServiceAPIMethod = null;
		if (iDEServiceAPIRSRuntime != null) {
			iPSDEServiceAPIMethod = iDEServiceAPIRSRuntime.getPSDEServiceAPIMethod(strMethodName, false);
		} else {
			iPSDEServiceAPIMethod = getPSDEServiceAPIMethod(strMethodName, false);
		}

		if (iPSDEServiceAPIMethod.getPSDEAction() != null) {
			return this.executeAction(strScope, iDEServiceAPIRSRuntime, strParentKey, iPSDEServiceAPIMethod, objBody, strKey, objTag);
		}

		if (iPSDEServiceAPIMethod.getPSDEDataSet() != null) {
			// Object[] args = getDataSetArgs(iPSDEServiceAPIMethod,
			// iDEServiceAPIRSRuntime, strParentKey, objBody);
			// return
			// this.getDataEntityRuntime().fetchDataSet(iPSDEServiceAPIMethod.getPSDEDataSet().getName(),
			// iPSDEServiceAPIMethod.getPSDEDataSet(), args);
			return this.fetchDataSet(strScope, iDEServiceAPIRSRuntime, strParentKey, iPSDEServiceAPIMethod, objBody, strKey, objTag);
		}

		// 暂时直接调用实体方法
		// return this.getDataEntityRuntime().invokeMethod(strMethodName,
		// objBody, objTag);
		throw new DEServiceAPIRuntimeException(this, String.format("无法识别服务方法[%1$s]", strMethodName));
	}

	protected Object fetchDataSet(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, Object objBody, String strKey, Object objTag) throws Throwable {

		return this.onFetchDataSet(strScope, iDEServiceAPIRSRuntime, strParentKey, iPSDEServiceAPIMethod, objBody, strKey, objTag);
	}

	protected Object onFetchDataSet(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, Object objBody, String strKey, Object objTag) throws Throwable {

		Object[] args = getDataSetArgs(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, strParentKey, objBody);

		ISearchContextDTO iSearchContextDTO = null;
		if (args.length > 0 && args[0] instanceof ISearchContextDTO) {
			iSearchContextDTO = (ISearchContextDTO) args[0];
		}

		if (iDEServiceAPIRSRuntime != null) {
			IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
			if (iAppContext == null) {
				iAppContext = new AppContext();
				UserContext.getCurrentMust().setAppContext(iAppContext);
			}
			iAppContext.set(iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getName(), strParentKey);
		}
		
		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, iSearchContextDTO, iPSDEServiceAPIMethod.getDataAccessAction())) {
			if (!StringUtils.hasLength(iPSDEServiceAPIMethod.getDataAccessAction())) {
				throw new DEServiceAPIRuntimeException(this, String.format("数据集[%1$s]未定义访问操作标识", iPSDEServiceAPIMethod.getPSDEDataSet().getName()), Errors.ACCESSDENY);
			}
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
		}

		return this.getDataEntityRuntime().fetchDataSet(iPSDEServiceAPIMethod.getPSDEDataSet().getName(), iPSDEServiceAPIMethod.getPSDEDataSet(), args);
	}

	protected Object executeAction(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, Object objBody, String strKey, Object objTag) throws Throwable {

		return this.onExecuteAction(strScope, iDEServiceAPIRSRuntime, strParentKey, iPSDEServiceAPIMethod, objBody, strKey, objTag);
	}

	protected Object onExecuteAction(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, Object objBody, String strKey, Object objTag) throws Throwable {

		Object[] args = getActionArgs(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, strParentKey, objBody, strKey);
		if (args != null && args[0] instanceof List) {
			
			if (iDEServiceAPIRSRuntime != null) {
				IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
				if (iAppContext == null) {
					iAppContext = new AppContext();
					UserContext.getCurrentMust().setAppContext(iAppContext);
				}
				iAppContext.set(iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getName(), strParentKey);
			}

			List list = (List) args[0];

			//从srfKey参数中填充对象key中
			if(StringUtils.hasLength(strKey) && list.iterator().next() instanceof IEntityDTO) {
				String[] strKeys = strKey.split(";");
				if (DataTypeUtils.compare(DataTypes.INT, list.size(), strKeys.length) == 0) {
					IntStream.range(0, list.size())
							.forEach(i -> ((IEntityDTO)list.get(i)).set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(),strKeys[i]));
				}else {
					throw new DEServiceAPIRuntimeException(this, String.format("行为[%1$s]参数数量不匹配", iPSDEServiceAPIMethod.getPSDEAction().getName()), Errors.INVALIDDATA);
				}
			}
			
			Map<String, Set<Object>> refCheckData = new HashMap<String, Set<Object>>();
			
			for (Object item : list) {
				if (item instanceof IEntityDTO) {
					// 判断数据访问
					if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, ((IEntityDTO) item).get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()), (IEntityDTO) item, iPSDEServiceAPIMethod.getDataAccessAction())) {

						if (!StringUtils.hasLength(iPSDEServiceAPIMethod.getDataAccessAction())) {
							throw new DEServiceAPIRuntimeException(this, String.format("行为[%1$s]未定义访问操作标识", iPSDEServiceAPIMethod.getPSDEAction().getName()), Errors.ACCESSDENY);
						}

						if (StringUtils.hasLength(strKey)) {
							throw new DEServiceAPIRuntimeException(this, String.format("%1$s[%2$s]不具备操作能力[%3$s]", this.getLogicName(), strKey, iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
						}

						throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
					}
					
					this.getDataEntityRuntime().fillEntityDTORefCheckData(refCheckData, (IEntityDTO)item);
					
				} else {
					// 判断数据访问
					if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, item, null, iPSDEServiceAPIMethod.getDataAccessAction())) {

						if (!StringUtils.hasLength(iPSDEServiceAPIMethod.getDataAccessAction())) {
							throw new DEServiceAPIRuntimeException(this, String.format("行为[%1$s]未定义访问操作标识", iPSDEServiceAPIMethod.getPSDEAction().getName()), Errors.ACCESSDENY);
						}

						// throw new DEServiceAPIRuntimeException(this,
						// String.format("数据[%1$s]不具备操作能力[%2$s]", strKey,
						// iPSDEServiceAPIMethod.getDataAccessAction()),
						// Errors.ACCESSDENY);

						if (StringUtils.hasLength(strKey)) {
							throw new DEServiceAPIRuntimeException(this, String.format("%1$s[%2$s]不具备操作能力[%3$s]", this.getLogicName(), strKey, iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
						}

						throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
					}
				}
			}
			
			
			this.checkRefData(iDEServiceAPIRSRuntime, strParentKey, refCheckData);

			
			// 判断行为是否支持为批操作行为
			if (iPSDEServiceAPIMethod.getPSDEAction().isBatchAction()) {
				// 直接传入
				Object objRet = this.getDataEntityRuntime().executeAction(iPSDEServiceAPIMethod.getPSDEAction().getName(), iPSDEServiceAPIMethod.getPSDEAction(), args);
				if (iPSDEServiceAPIMethod.getPSDEAction().getPSDEActionInput().isOutput()) {
					return args[0];
				}
				return objRet;
			} else {
				List retList = null;
				if (!DEMethodReturnTypes.VOID.equals(iPSDEServiceAPIMethod.getPSDEAction().getPSDEActionReturnMust().getType()) || iPSDEServiceAPIMethod.getPSDEAction().getPSDEActionInput().isOutput()) {
					retList = new ArrayList();
				}

				boolean bIgnoreExists = false;
				if (this.getDataEntityRuntime().getDEType() == DETypes.RELATED && DEActionModes.CREATE.equals(iPSDEServiceAPIMethod.getPSDEAction().getActionMode()) && this.getDataEntityRuntime().getUnionKeyValuePSDEFields() != null) {
					bIgnoreExists = true;
				}

				// 转为逐项调用
				for (Object item : list) {
					if (bIgnoreExists && item instanceof IEntityDTO) {
						boolean bSelect = true;
						ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
						for (IPSDEField iPSDEField : this.getDataEntityRuntime().getUnionKeyValuePSDEFields()) {
							Object objValue = this.getDataEntityRuntime().getFieldValue((IEntityDTO) item, iPSDEField);
							if (!iPSDEField.isAllowEmpty() && objValue == null) {
								bSelect = false;
								break;
							}
							SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getLowerCaseName(), Conditions.EQ, objValue, null);
						}
						if (bSelect) {
							if (this.getDataEntityRuntime().existsData(iSearchContextDTO)) {
								continue;
							}
						}
					}
					Object objRet = this.getDataEntityRuntime().executeAction(iPSDEServiceAPIMethod.getPSDEAction().getName(), iPSDEServiceAPIMethod.getPSDEAction(), new Object[] { item });
					if (iPSDEServiceAPIMethod.getPSDEAction().getPSDEActionInput().isOutput()) {
						if (retList != null) {
							retList.add(args[0]);
						}
					} else {
						if (retList != null) {
							retList.add(objRet);
						}
					}
				}
				return retList;
			}
		} else {
			IEntityDTO iEntityDTO = null;
			if (args != null && args.length > 0 && args[0] instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO) args[0];
			}

			if (iDEServiceAPIRSRuntime != null) {
				IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
				if (iAppContext == null) {
					iAppContext = new AppContext();
					UserContext.getCurrentMust().setAppContext(iAppContext);
				}
				iAppContext.set(iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getName(), strParentKey);
			}
			
			// 判断数据访问
			if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, strKey, iEntityDTO, iPSDEServiceAPIMethod.getDataAccessAction())) {

				if (!StringUtils.hasLength(iPSDEServiceAPIMethod.getDataAccessAction())) {
					throw new DEServiceAPIRuntimeException(this, String.format("行为[%1$s]未定义访问操作标识", iPSDEServiceAPIMethod.getPSDEAction().getName()), Errors.ACCESSDENY);
				}

				// throw new DEServiceAPIRuntimeException(this,
				// String.format("数据[%1$s]不具备操作能力[%2$s]", strKey,
				// iPSDEServiceAPIMethod.getDataAccessAction()),
				// Errors.ACCESSDENY);

				if (StringUtils.hasLength(strKey)) {
					throw new DEServiceAPIRuntimeException(this, String.format("%1$s[%2$s]不具备操作能力[%3$s]", this.getLogicName(), strKey, iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
				}

				throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), iPSDEServiceAPIMethod.getDataAccessAction()), Errors.ACCESSDENY);
			}

			if(iEntityDTO != null) {
				Map<String, Set<Object>> refCheckData = this.getDataEntityRuntime().fillEntityDTORefCheckData(null, iEntityDTO);
				this.checkRefData(iDEServiceAPIRSRuntime, strParentKey, refCheckData);
			}
			
			

			Object objRet = this.getDataEntityRuntime().executeAction(iPSDEServiceAPIMethod.getPSDEAction().getName(), iPSDEServiceAPIMethod.getPSDEAction(), args);
			if (iPSDEServiceAPIMethod.getPSDEAction().getPSDEActionInput().isOutput()) {
				return args[0];
			}
			return objRet;
		}
	}
	
	protected void checkRefData(IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, Map<String, Set<Object>> refCheckData) {
		if(ObjectUtils.isEmpty(refCheckData)) {
			return;
		}
		
		//去除默认父键
		if(iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			Set<Object> keys = refCheckData.get(iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getId());
			if(keys != null) {
				keys.remove(strParentKey);
			}
		}
		
		
		
		for(Map.Entry<String, Set<Object>> entry : refCheckData.entrySet()) {
			Set<Object> keys = entry.getValue();
			if(ObjectUtils.isEmpty(keys)) {
				continue;
			}
			
			IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(entry.getKey());
			
			try {
				if(!refDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(UserContext.getCurrent(), keys, DataAccessActions.READ)) {
					throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", refDataEntityRuntime.getLogicName(), DataAccessActions.READ), Errors.ACCESSDENY);
				}
			}
			catch (Exception ex) {
				log.error(String.format("检查引用数据[%1$s]发生异常，%2$s", refDataEntityRuntime.getLogicName(), ex.getMessage()), ex);
				throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", refDataEntityRuntime.getLogicName(), DataAccessActions.READ), Errors.ACCESSDENY);
			}
		}
	}

	protected Object[] getActionArgs(IPSDEServiceAPIMethod iPSDEServiceAPIMethod, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, Object objBody, String strKey) throws Throwable {
		IPSDEAction iPSDEAction = iPSDEServiceAPIMethod.getPSDEActionMust();
		IPSDEActionInput iPSDEActionInput = iPSDEAction.getPSDEActionInput();
		if (iPSDEActionInput == null) {
			throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]没有指定输入对象", iPSDEAction.getName()));
		}
		
		String strVersionId = null;
		if(this.getDataEntityRuntime().isEnableVersionControl()
				|| this.getDataEntityRuntime().isEnableVersionStorage()) {
			IWebContext iWebContext = UserContext.getCurrentMust().getWebContext();
			if(iWebContext!=null) {
				strVersionId = iWebContext.getParameter(IDEVersionControlUtilRuntime.ACTION_ARG_VERSIONID);
			}
		}
		
		if (DEMethodInputTypes.NONE.equals(iPSDEActionInput.getType())) {
			IEntityDTO iEntityDTO = (IEntityDTO) this.getDataEntityRuntime().createEntity();
			
			if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
				IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
				if (parentIdPSDEField != null) {
					Object objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
					iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
					
					IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
					if (parentTypePSDEField != null) {
						iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
					}
				}
			}

			return new Object[] { iEntityDTO };
		}
		
		if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
			if (ObjectUtils.isEmpty(strKey)) {
				throw new Exception("没有指定输入参数");
			}
			String[] items = strKey.trim().replace(",", ";").split("[;]");
			if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType())) {
				if (items.length == 1) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), (String) strKey);
					if(StringUtils.hasLength(strVersionId)) {
						return new Object[] { objValue, IDEVersionControlUtilRuntime.ACTION_ARG_VERSIONID, strVersionId};
					}
					else {
						return new Object[] { objValue };
					}
					
				} else {
					List list = new ArrayList();
					for (int i = 0; i < items.length; i++) {
						Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
						list.add(objValue);
					}
					return new Object[] { list };
				}
			}

			if (DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
				List list = new ArrayList();
				for (int i = 0; i < items.length; i++) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
					list.add(objValue);
				}
				return new Object[] { list };
			}
		}

		if (DEMethodInputTypes.DTO.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.DTOS.equals(iPSDEActionInput.getType())) {
			if (objBody == null) {
				throw new Exception("没有指定输入参数");
			}

			if (objBody instanceof List) {
				// 构建列表
				List dtoList = new ArrayList();
				List list = (List) objBody;
				for (Object item : list) {
					IEntityDTO iEntityDTO = (IEntityDTO) this.getDataEntityRuntime().getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), item);
					iEntityDTO.resetReadOnlyFields();
					this.removeInvalidUserInput(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, iEntityDTO);
					if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
						IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
						if (parentIdPSDEField != null) {
							Object objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
							iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
							
							IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
							if (parentTypePSDEField != null) {
								iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
							}
						}
					}
					dtoList.add(iEntityDTO);
				}
				return new Object[] { dtoList };
			} else {
				IEntityDTO iEntityDTO = (IEntityDTO) this.getDataEntityRuntime().getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), objBody);
				iEntityDTO.resetReadOnlyFields();
				this.removeInvalidUserInput(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, iEntityDTO);

				if (StringUtils.hasLength(strKey)) {
					Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), (String) strKey);
					iEntityDTO.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), objValue);
				}

				if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
					IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
					if (parentIdPSDEField != null) {
						Object objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
						iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
						
						IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
						if (parentTypePSDEField != null) {
							iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
						}
					}
				}
				return new Object[] { iEntityDTO };
			}
		}

		throw new DEServiceAPIRuntimeException(this, String.format("无法识别的实体行为输入类型[%1$s][%2$s]", iPSDEAction.getName(), iPSDEActionInput.getType()));
	}

	protected void removeInvalidUserInput(IPSDEServiceAPIMethod iPSDEServiceAPIMethod, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, IEntityDTO iEntityDTO) {

		if (this.getSysServiceAPIRuntime().getAPILevel() == SysServiceAPILevels.CORE) {
			return;
		}

		IPSDEAction iPSDEAction = iPSDEServiceAPIMethod.getPSDEAction();
		if (iPSDEAction != null) {
			this.getDataEntityRuntime().removeInvalidUserInput(iPSDEAction, iEntityDTO);
		}
	}

	protected Object[] getDataSetArgs(IPSDEServiceAPIMethod iPSDEServiceAPIMethod, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, Object objBody) throws Exception {
		IPSDEDataSet iPSDEDataSet = iPSDEServiceAPIMethod.getPSDEDataSetMust();
		IPSDEDataSetInput iPSDEDataSetInput = iPSDEDataSet.getPSDEDataSetInput();
		if (iPSDEDataSetInput == null) {
			throw new ModelException(iPSDEDataSet, String.format("实体数据集[%1$s]没有指定输入对象", iPSDEDataSet.getName()));
		}
		if (DEMethodInputTypes.DTO.equals(iPSDEDataSetInput.getType())) {

			// 判断传入参数是否已经处理（外部已经进行过滤加载）
			if (objBody instanceof ISearchContextDTO) {
				return new Object[] { objBody };
			}
			
			String strVersionId = null;
			if(this.getDataEntityRuntime().isEnableVersionControl()
					|| this.getDataEntityRuntime().isEnableVersionStorage()) {
				IWebContext iWebContext = UserContext.getCurrentMust().getWebContext();
				if(iWebContext!=null) {
					strVersionId = iWebContext.getParameter(IDEVersionControlUtilRuntime.ACTION_ARG_VERSIONID);
				}
			}

			ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) this.getDataEntityRuntime().getDEMethodDTO(iPSDEDataSetInput.getPSDEFilterDTOMust(), objBody);
			if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
				// 送入过滤条件
				if (DEServiceAPIMethodParentKeyModes.DEFAULT.equals(iPSDEServiceAPIMethod.getParentKeyMode())) {
					IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
					if (parentIdPSDEField != null) {
						Object objParentKey = DataTypeUtils.parse(parentIdPSDEField.getStdDataType(), strParentKey);
						ISearchCond iSearchCond = SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, parentIdPSDEField.getLowerCaseName(), Conditions.EQ, objParentKey, null);
						if(iSearchCond instanceof ISearchCondRuntime) {
							((ISearchCondRuntime)iSearchCond).setCat(ISearchFieldCond.CAT_DATACONTEXT);
						}
						//补充默认搜索上下文
						if(!iSearchContextDTO.contains(parentIdPSDEField.getLowerCaseName())) {
							iSearchContextDTO.set(parentIdPSDEField.getLowerCaseName(), objParentKey);
						}
					
						IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
						if (parentTypePSDEField != null) {
							SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, parentTypePSDEField.getLowerCaseName(), Conditions.EQ, iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName(), null);
						}
					}
				}
				else
					if (DEServiceAPIMethodParentKeyModes.DATACONTEXT.equals(iPSDEServiceAPIMethod.getParentKeyMode())) {
						IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
						if (parentIdPSDEField != null) {
							Object objParentKey = DataTypeUtils.parse(parentIdPSDEField.getStdDataType(), strParentKey);
							if(!iSearchContextDTO.contains(parentIdPSDEField.getLowerCaseName())) {
								iSearchContextDTO.set(parentIdPSDEField.getLowerCaseName(), objParentKey);
							}
						}
					}
			} else {
				// 兼容处理旧版本模式，考虑到外部宋体实体标识可能为服务实体代码标识，所以在接口处进行处理
				Object parentDEName = iSearchContextDTO.get(ISearchContextDTO.PARAM_PARENTDENAME);
				Object parentKey = iSearchContextDTO.get(ISearchContextDTO.PARAM_PARENTKEY);
				if (!ObjectUtils.isEmpty(parentDEName) && !ObjectUtils.isEmpty(parentKey)) {
					List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
					if (!ObjectUtils.isEmpty(psDERBaseList)) {

						String strParentDEName = parentDEName.toString();
						IDEServiceAPIRuntime iDEServiceAPIRuntime = this.getSysServiceAPIRuntime().getDEServiceAPIRuntime(strParentDEName, true);
						if (iDEServiceAPIRuntime != null) {
							strParentDEName = iDEServiceAPIRuntime.getDataEntityRuntime().getName();
						}

						IPSDERBase filterPSDERBase = null;
						for (IPSDERBase iPSDERBase : psDERBaseList) {
							if (DERTypes.DER1N.equals(iPSDERBase.getDERType())) {
								if (iPSDERBase.getMajorPSDataEntityMust().getName().equalsIgnoreCase(strParentDEName)) {
									if (filterPSDERBase == null) {
										filterPSDERBase = iPSDERBase;
									} else {
										// 存在多个实体，置空
										log.warn(String.format("实体[%1$s]存在多个父实体[%2$s]的关系，忽略过滤处理", this.getDataEntityRuntime().getName(), iPSDERBase.getMajorPSDataEntityMust().getName()));
										filterPSDERBase = null;
										break;
									}
								}
								continue;
							}

							if (DERTypes.DERCUSTOM.equals(iPSDERBase.getDERType())) {
								IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
								if (!DERSubTypes.DER1N.equals(iPSDERCustom.getDERSubType())) {
									continue;
								}

								if (iPSDERCustom.getPickupPSDEField() == null) {
									continue;
								}

								if (iPSDERBase.getMajorPSDataEntityMust().getName().equalsIgnoreCase(strParentDEName)) {
									if (filterPSDERBase == null) {
										filterPSDERBase = iPSDERBase;
									} else {
										// 存在多个实体，置空
										log.warn(String.format("实体[%1$s]存在多个父实体[%2$s]的关系，忽略过滤处理", this.getDataEntityRuntime().getName(), iPSDERBase.getMajorPSDataEntityMust().getName()));
										filterPSDERBase = null;
										break;
									}
								}
								continue;
							}
							continue;
						}

						if (filterPSDERBase instanceof IPSDER1N) {
							if (parentKey instanceof String) {
								parentKey = DataTypeUtils.parse(((IPSDER1N) filterPSDERBase).getPSPickupDEFieldMust().getStdDataType(), (String) parentKey);
							}
							ISearchCond iSearchCond = SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, ((IPSDER1N) filterPSDERBase).getPSPickupDEFieldMust().getLowerCaseName(), Conditions.EQ, parentKey, null);
							if(iSearchCond instanceof ISearchCondRuntime) {
								((ISearchCondRuntime)iSearchCond).setCat(ISearchFieldCond.CAT_DATACONTEXT);
							}
							if(!iSearchContextDTO.contains(((IPSDER1N) filterPSDERBase).getPSPickupDEFieldMust().getLowerCaseName())) {
								iSearchContextDTO.set(((IPSDER1N) filterPSDERBase).getPSPickupDEFieldMust().getLowerCaseName(), parentKey);
							}
						} else if (filterPSDERBase instanceof IPSDERCustom) {
							if (parentKey instanceof String) {
								parentKey = DataTypeUtils.parse(((IPSDERCustom) filterPSDERBase).getPickupPSDEFieldMust().getStdDataType(), (String) parentKey);
							}
							ISearchCond iSearchCond = SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, ((IPSDERCustom) filterPSDERBase).getPickupPSDEFieldMust().getLowerCaseName(), Conditions.EQ, parentKey, null);
							if(iSearchCond instanceof ISearchCondRuntime) {
								((ISearchCondRuntime)iSearchCond).setCat(ISearchFieldCond.CAT_DATACONTEXT);
							}
							if(!iSearchContextDTO.contains(((IPSDERCustom) filterPSDERBase).getPickupPSDEFieldMust().getLowerCaseName())) {
								iSearchContextDTO.set(((IPSDERCustom) filterPSDERBase).getPickupPSDEFieldMust().getLowerCaseName(), parentKey);
							}
						}
					}
				}
			}
			
			// 强行调整导出的最大数量
			int nMaxSize = iPSDEDataSet.getMaxRowCount();
			if(nMaxSize > 0) {
				Object size = null;
				if(objBody instanceof Map) {
					size = ((Map)objBody).get(ISearchContextDTO.PARAM_SIZE);
				}
				
				Pageable pageable = iSearchContextDTO.getPageable();
				if (pageable != null) {
					if (size == null) {
						// 直接使用最大值
						iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
					} else {
						int nSize = Integer.parseInt(size.toString());
						if (nSize <= 0 || nSize > pageable.getPageSize()) {
							if (nSize <= 0 || nSize > nMaxSize) {
								nSize = nMaxSize;
							}
							iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
						}
					}
				} else {
					iSearchContextDTO.limit(nMaxSize);
				}
			}
			
			if(StringUtils.hasLength(strVersionId)) {
				return new Object[] { iSearchContextDTO, IDEVersionControlUtilRuntime.ACTION_ARG_VERSIONID, strVersionId};
			}
			else {
				return new Object[] { iSearchContextDTO };
			}
		}

		throw new DEServiceAPIRuntimeException(this, String.format("无法识别的实体数据集输入类型[%1$s][%2$s]", iPSDEDataSet.getName(), iPSDEDataSetInput.getType()));
	}

	@Override
	public int getAPIMode() {
		return this.getPSDEServiceAPI().getAPIMode();
	}

	@Override
	public String getLogicName() {
		String strLogicName = this.getPSDEServiceAPI().getLogicName();
		if (!StringUtils.hasLength(strLogicName)) {
			return this.getDataEntityRuntime().getLogicName();
		}
		return strLogicName;
	}

	@Override
	public Object importData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onImportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}

	protected Object onImportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		Object objValue = null;
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
			if (parentIdPSDEField != null) {
				objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
				iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
				
				IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
				if (parentTypePSDEField != null) {
					iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
				}
				
			}
			else {
				throw new DEServiceAPIRuntimeException(this, "导入数据发生异常，未指定关系属性");
			}
		}

		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, null, iEntityDTO, DataAccessActions.CREATE)) {
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
		}

		InputStream inputStream = null;
		try {
			inputStream = getImportDataInputStream(objBody, iEntityDTO);
		}
		catch (Exception ex) {
			throw new DEServiceAPIRuntimeException(this, String.format("获取输入流发生异常，%1$s", ex.getMessage()), ex);
		}
			
		Map<Integer, EntityError> errorMap = null;
		
		// 填充parentKey
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			errorMap = this.getDataEntityRuntime().importData(strImportTag, iEntityDTO, inputStream, true, iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime(), String.valueOf(objValue));
		} else {
			// errorMap = iDEDataImportRuntime.importStream(iEntityDTO,
			// file.getInputStream(), true, null, null);
			errorMap = this.getDataEntityRuntime().importData(strImportTag, iEntityDTO, inputStream, true, null, null);
		}

		return errorMap;
	}

	@Override
	public Object importData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onImportData2(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}

	protected Object onImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		Object objValue = null;
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
			if (parentIdPSDEField != null) {
				objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
				iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
				
				IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
				if (parentTypePSDEField != null) {
					iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
				}
			}
			else {
				throw new DEServiceAPIRuntimeException(this, "解析导入发生异常，未指定关系属性");
			}
		}
		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, null, iEntityDTO, DataAccessActions.CREATE)) {
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
		}
		
//		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		InputStream inputStream = null;
		try {
			inputStream = getImportDataInputStream(objBody, iEntityDTO);
		}
		catch (Exception ex) {
			throw new DEServiceAPIRuntimeException(this, String.format("获取输入流发生异常，%1$s", ex.getMessage()), ex);
		}
		
		
		ImportDataResult objRet = null;
		// 填充parentKey
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			objRet = this.getDataEntityRuntime().importData2(strImportTag, iEntityDTO, inputStream, true, iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime(), String.valueOf(objValue));
		} else {
			objRet = this.getDataEntityRuntime().importData2(strImportTag, iEntityDTO, inputStream, true, null, null);
		}

		return objRet;
	}
	
	@Override
	public Object asyncImportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onAsyncImportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}

	protected Object onAsyncImportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		Object objValue = null;
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
			if (parentIdPSDEField != null) {
				objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
				iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
				
				IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
				if (parentTypePSDEField != null) {
					iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
				}
			}
			else {
				throw new DEServiceAPIRuntimeException(this, "导入数据发生异常，未指定关系属性");
			}
		}
		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, null, iEntityDTO, DataAccessActions.CREATE)) {
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
		}

		InputStream inputStream2 = null;
		try {
			inputStream2 = getImportDataInputStream(objBody, iEntityDTO);
		}
		catch (Exception ex) {
			throw new DEServiceAPIRuntimeException(this, String.format("获取输入流发生异常，%1$s", ex.getMessage()), ex);
		}
		


		String strValue = (objValue == null)?null:String.valueOf(objValue);
		InputStream inputStream = inputStream2;
		
		Map<String, Object> actionTagMap = new HashMap<String, Object>();
		actionTagMap.put("actiontype", "DEIMPORTDATA");
		actionTagMap.put("actionparam", getDataEntityRuntime().getName());
		actionTagMap.put("actionparam2", strImportTag);
		
		//actionTagMap.put("", value);
		
		return this.getSystemRuntime().asyncExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
					return getDataEntityRuntime().importData(strImportTag, iEntityDTO, inputStream, true, iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime(), strValue);
				} else {
					return getDataEntityRuntime().importData(strImportTag, iEntityDTO, inputStream, true, null, null);
				}
			}

			@Override
			public String getName() {
				if(StringUtils.hasLength(strImportTag)) {
					return String.format("[%1$s]数据导入作业[%2$s]", getDataEntityRuntime().getLogicName(), strImportTag);
				}
				else {
					return String.format("[%1$s]数据导入作业", getDataEntityRuntime().getLogicName());
				}
			}
		}, null, actionTagMap);
	}

	@Override
	public Object asyncImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onAsyncImportData2(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objBody, objTag);
	}

	protected Object onAsyncImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		Object objValue = null;
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
			if (parentIdPSDEField != null) {
				objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
				iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
				
				IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
				if (parentTypePSDEField != null) {
					iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
				}
			}
			else {
				throw new DEServiceAPIRuntimeException(this, "导入数据发生异常，未指定关系属性");
			}
		}

		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, null, iEntityDTO, DataAccessActions.CREATE)) {
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
		}

		InputStream inputStream2 = null;
		try {
			inputStream2 = getImportDataInputStream(objBody, iEntityDTO);
		}
		catch (Exception ex) {
			throw new DEServiceAPIRuntimeException(this, String.format("获取输入流发生异常，%1$s", ex.getMessage()), ex);
		}


		String strValue = (objValue == null)?null:String.valueOf(objValue);
		
		Map<String, Object> actionTagMap = new HashMap<String, Object>();
		actionTagMap.put("actiontype", "DEIMPORTDATA2");
		actionTagMap.put("actionparam", getDataEntityRuntime().getName());
		actionTagMap.put("actionparam2", strImportTag);
		
		InputStream inputStream = inputStream2;
		return this.getSystemRuntime().asyncExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
					return getDataEntityRuntime().importData2(strImportTag, iEntityDTO, inputStream, true, iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime(), strValue);
				} else {
					return getDataEntityRuntime().importData2(strImportTag, iEntityDTO, inputStream, true, null, null);
				}
			}

			@Override
			public String getName() {
				if(StringUtils.hasLength(strImportTag)) {
					return String.format("[%1$s]数据导入作业[%2$s]", getDataEntityRuntime().getLogicName(), strImportTag);
				}
				else {
					return String.format("[%1$s]数据导入作业", getDataEntityRuntime().getLogicName());
				}
			}
		}, null, actionTagMap);
	}
	
	protected InputStream getImportDataInputStream(Object objBody, IEntityDTO iEntityDTO) throws Exception {
		if (objBody instanceof MultipartFile) {
			MultipartFile file = (MultipartFile) objBody;
			// 设置导入文件名
			if (iEntityDTO != null && !ObjectUtils.isEmpty(file.getOriginalFilename())) {
				iEntityDTO.set(IDEDataImportRuntime.FIELD_IMPORTFILENAME, file.getOriginalFilename());
			}
			
			return file.getInputStream();
		}
		else {
			throw new Exception("未传入导入数据文件");
		}
	}
	
	@Override
	public Object getImportTemplate(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objTag) throws Throwable {
		testAccessUser();
		return this.onGetImportTemplate(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, objTag);
	}

	protected Object onGetImportTemplate(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objTag) throws Throwable {
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		Object objValue = null;
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
			if (parentIdPSDEField != null) {
				objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
				iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);

				IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
				if (parentTypePSDEField != null) {
					iEntityDTO.set(parentTypePSDEField.getLowerCaseName(), iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName());
				}
			}
			else {
				throw new DEServiceAPIRuntimeException(this, "导入数据发生异常，未指定关系属性");
			}
		}

		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, null, iEntityDTO, DataAccessActions.CREATE)) {
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
		}

		OutputStream outputStream = null;
		if (objTag instanceof OutputStream) {
			outputStream = (OutputStream) objTag;
		}

		if (outputStream == null) {
			throw new DEServiceAPIRuntimeException(this, String.format("导出模板未传入输出流对象"));
		}

		this.getDataEntityRuntime().getImportTemplate(strImportTag, outputStream, false, iDEServiceAPIRSRuntime != null ? iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime() : null, strParentKey);
		return null;
	}

	@Override
	public Object exportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		throw new DEServiceAPIRuntimeException(this, "没有实现");
	}

	@Override
	public Object exportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		return onExportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strExportTag, strMethodName, objBody, strKey, objTag);
	}

	protected Object onExportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {

		OutputStream outputStream = null;
		if (objTag instanceof OutputStream) {
			outputStream = (OutputStream) objTag;
		}

		if (outputStream == null) {
			throw new DEServiceAPIRuntimeException(this, String.format("导出数据未传入输出流对象"));
		}
		
		
		IDEDataExportRuntime iDEDataExportRuntime = this.getDataEntityRuntime().getDEDataExportRuntime(strExportTag);

		// 需要判断接口是否提供指定方法
		IPSDEServiceAPIMethod iPSDEServiceAPIMethod = null;
		if (iDEServiceAPIRSRuntime != null) {
			iPSDEServiceAPIMethod = iDEServiceAPIRSRuntime.getPSDEServiceAPIMethod(strMethodName, false);
		} else {
			iPSDEServiceAPIMethod = getPSDEServiceAPIMethod(strMethodName, false);
		}
		
		if (iPSDEServiceAPIMethod.getPSDEDataSet() != null) {
			
			Object size = null;
			if(objBody instanceof Map) {
				size = ((Map)objBody).get(ISearchContextDTO.PARAM_SIZE);
			}
			
			Object[] args = getDataSetArgs(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, strParentKey, objBody);
			
			if (args.length > 0 && args[0] instanceof ISearchContextDTO) {
				ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) args[0];
				// 强行调整导出的最大数量
				int nMaxSize = iDEDataExportRuntime.getMaxRowCount();
				Pageable pageable = iSearchContextDTO.getPageable();
				if (pageable != null) {
					if (size == null) {
						// 直接使用最大值
						iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
					} else {
						int nSize = Integer.parseInt(size.toString());
						if (nSize <= 0 || nSize > pageable.getPageSize()) {
							if (nSize <= 0 || nSize > nMaxSize) {
								nSize = nMaxSize;
							}
							iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
						}
					}
				} else {
					iSearchContextDTO.limit(nMaxSize);
				}
				
				//将已经处理的过滤对象设置到Body对象
				objBody = iSearchContextDTO;
			}
		}

		// 进行实际方法执行
		Object objRet = this.invokeMethod(strScope, iDEServiceAPIRSRuntime, strParentKey, strMethodName, objBody, strKey, null);
		

		this.getDataEntityRuntime().exportData(strExportTag, objRet, outputStream);
		return null;
	}
	
	@Override
	public Object asyncExportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		return onAsyncExportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strExportTag, strMethodName, objBody, strKey, objTag);
	}

	protected Object onAsyncExportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {

		OutputStream outputStream = null;
		if (objTag instanceof OutputStream) {
			outputStream = (OutputStream) objTag;
		}

		if (outputStream == null) {
			throw new DEServiceAPIRuntimeException(this, String.format("导出数据未传入输出流对象"));
		}
		
		
		IDEDataExportRuntime iDEDataExportRuntime = this.getDataEntityRuntime().getDEDataExportRuntime(strExportTag);

		// 需要判断接口是否提供指定方法
		IPSDEServiceAPIMethod iPSDEServiceAPIMethod = null;
		if (iDEServiceAPIRSRuntime != null) {
			iPSDEServiceAPIMethod = iDEServiceAPIRSRuntime.getPSDEServiceAPIMethod(strMethodName, false);
		} else {
			iPSDEServiceAPIMethod = getPSDEServiceAPIMethod(strMethodName, false);
		}
		
		if (iPSDEServiceAPIMethod.getPSDEDataSet() != null) {
			
			Object size = null;
			if(objBody instanceof Map) {
				size = ((Map)objBody).get(ISearchContextDTO.PARAM_SIZE);
			}
			
			Object[] args = getDataSetArgs(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, strParentKey, objBody);
			
			if (args.length > 0 && args[0] instanceof ISearchContextDTO) {
				ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) args[0];
				// 强行调整导出的最大数量
				int nMaxSize = iDEDataExportRuntime.getMaxRowCount();
				Pageable pageable = iSearchContextDTO.getPageable();
				if (pageable != null) {
					if (size == null) {
						// 直接使用最大值
						iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
					} else {
						int nSize = Integer.parseInt(size.toString());
						if (nSize <= 0 || nSize > pageable.getPageSize()) {
							if (nSize <= 0 || nSize > nMaxSize) {
								nSize = nMaxSize;
							}
							iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
						}
					}
				} else {
					iSearchContextDTO.limit(nMaxSize);
				}
				
				//将已经处理的过滤对象设置到Body对象
				objBody = iSearchContextDTO;
			}
		}
		
		// 进行实际方法执行
//		Object objRet = this.invokeMethod(strScope, iDEServiceAPIRSRuntime, strParentKey, strMethodName, objBody, strKey, null);
//		this.getDataEntityRuntime().exportData(strExportTag, objRet, outputStream);
//		return null;
		
		
		
		Map<String, Object> actionTagMap = new HashMap<String, Object>();
		actionTagMap.put("actiontype", "DEEXPORTDATA");
		actionTagMap.put("actionparam", getDataEntityRuntime().getName());
		actionTagMap.put("actionparam2", strExportTag);
		

		Object objBody2 = objBody;
		OutputStream outputStream2 = outputStream;
		return this.getSystemRuntime().asyncExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				Object objRet = invokeMethod(strScope, iDEServiceAPIRSRuntime, strParentKey, strMethodName, objBody2, strKey, null);
				getDataEntityRuntime().exportData(strExportTag, objRet, outputStream2);
				return null;
			}

			@Override
			public String getName() {
				if(StringUtils.hasLength(strExportTag)) {
					return String.format("[%1$s]数据导出作业[%2$s]", getDataEntityRuntime().getLogicName(), strExportTag);
				}
				else {
					return String.format("[%1$s]数据导出作业", getDataEntityRuntime().getLogicName());
				}
			}
		}, null, actionTagMap);
		
	}
	

	@Override
	public Object printData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		try {
			return this.onPrintData(strScope, iDEServiceAPIRSRuntime, strParentKey, strPrintTag, strPrintType, objBody, strKey, objTag);
		}
		catch (Throwable ex) {
			if(ex instanceof DEServiceAPIRuntimeException) {
				throw (DEServiceAPIRuntimeException)ex;
			}
			throw new DEServiceAPIRuntimeException(this, String.format("打印数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onPrintData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strPrintTag, String strContentType, Object objBody, String strKey, Object objTag) throws Throwable {

		if (ObjectUtils.isEmpty(strKey)) {
			throw new Exception("没有指定输入参数");
		}

		IDEPrintRuntime iDEPrintRuntime = null;
		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = this.getDataEntityRuntime().getDynaInstDataEntityRuntime(null, false);
		if (iDynaInstDataEntityRuntime != null) {
			iDEPrintRuntime = iDynaInstDataEntityRuntime.getDEPrintRuntime(strPrintTag);
		} else {
			iDEPrintRuntime = this.getDataEntityRuntime().getDEPrintRuntime(strPrintTag);
		}

		String[] items = strKey.trim().split("[;]");
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < items.length; i++) {
			Object objValue = this.getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), items[i]);
			list.add(objValue);
		}

		Object[] keys = list.toArray(new Object[list.size()]);
		for (int i = 0; i < keys.length; i++) {
			// 判断数据访问
			if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, keys[i], null, iDEPrintRuntime.getPSDEPrint().getDataAccessAction())) {

				if (!StringUtils.hasLength(iDEPrintRuntime.getPSDEPrint().getDataAccessAction())) {
					throw new DEServiceAPIRuntimeException(this, String.format("打印[%1$s]未定义访问操作标识", iDEPrintRuntime.getPSDEPrint().getName()), Errors.ACCESSDENY);
				}

				throw new DEServiceAPIRuntimeException(this, String.format("%1$s[%2$s]不具备操作能力[%3$s]", this.getLogicName(), keys[i], iDEPrintRuntime.getPSDEPrint().getDataAccessAction()), Errors.ACCESSDENY);
			}
		}
		
		if(objTag instanceof ServletResponse) {
			ServletResponse servletResponse = (ServletResponse) objTag;
			this.getDataEntityRuntime().outputPrint(strPrintTag, servletResponse, keys, strContentType, false);
			return null;
		}
		
		if(objTag instanceof OutputStream) {
			OutputStream outputStream = (OutputStream) objTag;
			this.getDataEntityRuntime().outputPrint(strPrintTag, outputStream, keys, strContentType, false);
			return null;
		}
		
		throw new DEServiceAPIRuntimeException(this, String.format("打印数据未传入输出流对象"));
	}
	
	
	@Override
	public Object autoComplete(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strACTag, String strMethod, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onAutoComplete(strScope, iDEServiceAPIRSRuntime, strParentKey, strACTag, strMethod, objBody, objTag);
	}
	
	protected Object onAutoComplete(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strACTag, String strMethodName, Object objBody, Object objTag) throws Throwable {
		
		IDEAutoCompleteRuntime iDEAutoCompleteRuntime = this.getDataEntityRuntime().getDEAutoCompleteRuntime(strACTag, false);

		// 需要判断接口是否提供指定方法
		IPSDEServiceAPIMethod iPSDEServiceAPIMethod = null;
		if (iDEServiceAPIRSRuntime != null) {
			iPSDEServiceAPIMethod = iDEServiceAPIRSRuntime.getPSDEServiceAPIMethod(strMethodName, false);
		} else {
			iPSDEServiceAPIMethod = getPSDEServiceAPIMethod(strMethodName, false);
		}
		
		if (iPSDEServiceAPIMethod.getPSDEDataSet() != null) {
			
			Object size = null;
			if(objBody instanceof Map) {
				size = ((Map)objBody).get(ISearchContextDTO.PARAM_SIZE);
			}
			
			Object[] args = getDataSetArgs(iPSDEServiceAPIMethod, iDEServiceAPIRSRuntime, strParentKey, objBody);
			
			if (args.length > 0 && args[0] instanceof ISearchContextDTO) {
				ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) args[0];
//				// 强行调整导出的最大数量
//				int nMaxSize = iDEAutoCompleteRuntime.getMaxRowCount();
//				Pageable pageable = iSearchContextDTO.getPageable();
//				if (pageable != null) {
//					if (size == null) {
//						// 直接使用最大值
//						iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
//					} else {
//						int nSize = Integer.parseInt(size.toString());
//						if (nSize <= 0 || nSize > pageable.getPageSize()) {
//							if (nSize <= 0 || nSize > nMaxSize) {
//								nSize = nMaxSize;
//							}
//							iSearchContextDTO.setPageable(pageable.getPageNumber(), nMaxSize, pageable.getOffset());
//						}
//					}
//				} else {
//					iSearchContextDTO.limit(nMaxSize);
//				}
				
				//将已经处理的过滤对象设置到Body对象
				objBody = iSearchContextDTO;
			}
		}

		// 进行实际方法执行，解决权限问题
		Object objRet = this.invokeMethod(strScope, iDEServiceAPIRSRuntime, strParentKey, strMethodName, objBody, null, null);
		return iDEAutoCompleteRuntime.fetch(objRet, objTag);
	}

	@Override
	public Object wfStart(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		return this.onWFStart(strScope, iDEServiceAPIRSRuntime, strParentKey, strWFTag, objBody, strKey, objTag);
	}

	protected Object onWFStart(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		throw new DEServiceAPIRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object wfCancel(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		return this.onWFCancel(strScope, iDEServiceAPIRSRuntime, strParentKey, strWFTag, objBody, strKey, objTag);
	}

	protected Object onWFCancel(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		throw new DEServiceAPIRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object uploadFile(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onUploadFile(strScope, iDEServiceAPIRSRuntime, strParentKey, strKey, strStorageField, file, objBody, objTag);
	}

	protected Object onUploadFile(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		throw new DEServiceAPIRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object downloadFile(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		return this.onDownloadFile(strScope, iDEServiceAPIRSRuntime, strParentKey, strKey, strStorageField, file, objBody, objTag);
	}

	protected Object onDownloadFile(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		throw new DEServiceAPIRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	
	@Override
	public Object report(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strReportTag, String strReportType, Object objBody, Object objTag) throws Throwable {
		testAccessUser();
		try {
			return this.onReport(strScope, iDEServiceAPIRSRuntime, strParentKey, strReportTag, strReportType, objBody, objTag);
		}
		catch (Throwable ex) {
			if(ex instanceof DEServiceAPIRuntimeException) {
				throw (DEServiceAPIRuntimeException)ex;
			}
			throw new DEServiceAPIRuntimeException(this, String.format("输出报表发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onReport(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strReportTag, String strContentType, Object objBody, Object objTag) throws Throwable {

		if(!StringUtils.hasLength(strReportTag)) {
			throw new Exception("未传入报表标记");			
		}
		
		IDEReportRuntime iDEReportRuntime = this.getDataEntityRuntime().getDEReportRuntime(strReportTag);
		if(iDEReportRuntime.getPSDEReport().getPSSysUniRes()!=null) {
			// 判断数据访问
			if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iDEReportRuntime.getPSDEReport().getPSSysUniRes().getResCode())) {
				throw new DEServiceAPIRuntimeException(this, String.format("报表[%1$s]不具备访问控制资源[%2$s]", iDEReportRuntime.getPSDEReport().getName(), iDEReportRuntime.getPSDEReport().getPSSysUniRes().getResCode()), Errors.ACCESSDENY);
			}
		}
		else {
			throw new DEServiceAPIRuntimeException(this, String.format("报表[%1$s]未定义访问控制资源", iDEReportRuntime.getPSDEReport().getName()), Errors.ACCESSDENY);
		}
		
		Map params = null;
		if(objBody instanceof Map) {
			params = (Map)objBody;
		}
		if (params == null) {
			throw new Exception("未传入报表参数");
		}
		
		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext(params);
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			// 送入过滤条件
			//if (DEServiceAPIMethodParentKeyModes.DEFAULT.equals(iPSDEServiceAPIMethod.getParentKeyMode())) {
			if(true) {
				IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
				if (parentIdPSDEField != null) {
					Object objParentKey = DataTypeUtils.parse(parentIdPSDEField.getStdDataType(), strParentKey);
					ISearchCond iSearchCond = SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, parentIdPSDEField.getLowerCaseName(), Conditions.EQ, objParentKey, null);
					if(iSearchCond instanceof ISearchCondRuntime) {
						((ISearchCondRuntime)iSearchCond).setCat(ISearchFieldCond.CAT_DATACONTEXT);
					}
					//补充默认搜索上下文
					if(!iSearchContextDTO.contains(parentIdPSDEField.getLowerCaseName())) {
						iSearchContextDTO.set(parentIdPSDEField.getLowerCaseName(), objParentKey);
					}
					
					IPSDEField parentTypePSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentTypePSDEField();
					if (parentTypePSDEField != null) {
						SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, parentTypePSDEField.getLowerCaseName(), Conditions.EQ, iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime().getName(), null);
					}
				}
			}
		}
		
		if(objTag instanceof ServletResponse) {
			ServletResponse servletResponse = (ServletResponse) objTag;
			this.getDataEntityRuntime().outputReport(strReportTag, servletResponse, iSearchContextDTO, strContentType, false);
			return null;
		}
		
		if (objTag instanceof OutputStream) {
			OutputStream outputStream = (OutputStream) objTag;
			this.getDataEntityRuntime().outputReport(strReportTag, outputStream, iSearchContextDTO, strContentType, false);
			return null;
		}
		
		throw new DEServiceAPIRuntimeException(this, String.format("未传入输出流对象"));
	}
}
