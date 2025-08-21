package net.ibizsys.central.dataentity.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.priv.IPSDEOPPriv;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.security.DEDataAccCtrlModes;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Errors;

/**
 * 实体访问控制管理对象实现
 * 
 * @author lionlau
 *
 */
public class DataEntityAccessManager implements IDataEntityAccessManager {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityAccessManager.class);

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private Map<String, IPSDEOPPriv> psDEOPPrivMap = null;
	private int nDataAccCtrlMode = DEDataAccCtrlModes.SELF;
	private ISystemAccessManager iSystemAccessManager = null;
	private List<IDEUserRoleRuntime> defaultDEUserRoleRuntimeList = null;
	private Map<String, IDEUserRoleRuntime> deUserRoleRuntimeMap = null;

	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISystemAccessManager iSystemAccessManager) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.nDataAccCtrlMode = this.getDataEntityRuntime().getDataAccCtrlMode();
		this.iSystemAccessManager = iSystemAccessManager;
		if (this.iSystemAccessManager == null) {
			this.iSystemAccessManager = this.getDataEntityRuntime().getSystemRuntime().getSystemAccessManager();
		}
		this.onInit();
	}

	protected void onInit() throws Exception {
		prepareDEOPPrivs();
		prepareDEUserRoles();

	}

	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}

	public IDataEntityRuntime getDataEntityRuntime() {
		return getDataEntityRuntimeContext().getDataEntityRuntime();
	}

	public ISystemRuntime getSystemRuntime() {
		return this.getDataEntityRuntime().getSystemRuntime();
	}

	protected void prepareDEUserRoles() throws Exception {
		if (this.defaultDEUserRoleRuntimeList != null) {
			return;
		}

		List<IDEUserRoleRuntime> defaultDEUserRoleRuntimeList = new ArrayList<>();
		Map<String, IDEUserRoleRuntime> deUserRoleRuntimeMap = new HashMap<>();
		java.util.List<IPSDEUserRole> psDEUserRoleList = this.getDataEntityRuntimeContext().getDataEntityRuntime().getPSDataEntity().getAllPSDEUserRoles();
		if (psDEUserRoleList != null) {
			for (IPSDEUserRole iPSDEUserRole : psDEUserRoleList) {
				IDEUserRoleRuntime iDEUserRoleRuntime = this.createDEUserRoleRuntime(iPSDEUserRole);
				iDEUserRoleRuntime.init(this.getDataEntityRuntimeContext(), iPSDEUserRole);

				if (iDEUserRoleRuntime.isDefaultMode()) {
					defaultDEUserRoleRuntimeList.add(iDEUserRoleRuntime);
				}
				deUserRoleRuntimeMap.put(iDEUserRoleRuntime.getRoleTag(), iDEUserRoleRuntime);
			}
		}

		if (this.defaultDEUserRoleRuntimeList == null) {
			this.defaultDEUserRoleRuntimeList = defaultDEUserRoleRuntimeList;
		}

		if (this.deUserRoleRuntimeMap == null) {
			this.deUserRoleRuntimeMap = deUserRoleRuntimeMap;
		}
	}

	protected IDEUserRoleRuntime createDEUserRoleRuntime(IPSDEUserRole iPSDEUserRole) {
		return new DEUserRoleRuntime();
	}

	protected void prepareDEOPPrivs() throws Exception {
		if (this.psDEOPPrivMap != null) {
			return;
		}

		Map<String, IPSDEOPPriv> psDEOPPrivMap = new HashMap<String, IPSDEOPPriv>();

		java.util.List<IPSDEOPPriv> psDEOPPrivList = this.getDataEntityRuntimeContext().getDataEntityRuntime().getPSDataEntity().getAllPSDEOPPrivs();
		if (psDEOPPrivList != null) {
			for (IPSDEOPPriv iPSDEOPPriv : psDEOPPrivList) {
				if (StringUtils.hasLength(iPSDEOPPriv.getMapPSDEName())) {
					String strKey = String.format("%1$s|%2$s", iPSDEOPPriv.getMapPSDEName(), iPSDEOPPriv.getName());
					psDEOPPrivMap.put(strKey, iPSDEOPPriv);
				} else {
					psDEOPPrivMap.put(iPSDEOPPriv.getName(), iPSDEOPPriv);
				}
			}
		}

		if (this.psDEOPPrivMap == null) {
			this.psDEOPPrivMap = psDEOPPrivMap;
		}
	}

	@Override
	public IPSDEOPPriv getPSDEOPPriv(IDataEntityRuntime parentDataEntityRuntime, String strAccessAction) {
		return getPSDEOPPriv(parentDataEntityRuntime, strAccessAction, false);
	}

	@Override
	public IPSDEOPPriv getPSDEOPPriv(IDataEntityRuntime parentDataEntityRuntime, String strAccessAction, boolean bMustMapMode) {
		Assert.hasLength(strAccessAction, "传入数据操作标识无效");
		IPSDEOPPriv iPSDEOPPriv = null;
		if (parentDataEntityRuntime != null) {
			String tag = String.format("%1$s|%2$s", parentDataEntityRuntime.getName(), strAccessAction);
			iPSDEOPPriv = psDEOPPrivMap.get(tag);
			if (iPSDEOPPriv != null) {
				return iPSDEOPPriv;
			}
			iPSDEOPPriv = this.getSystemAccessManager().getPSSysDEOPPriv(tag, true);
			if (iPSDEOPPriv != null) {
				return iPSDEOPPriv;
			}
			if (bMustMapMode) {
				return null;
			}
		}
		
		iPSDEOPPriv = psDEOPPrivMap.get(strAccessAction);
		if(iPSDEOPPriv == null) {
			iPSDEOPPriv = this.getSystemAccessManager().getPSSysDEOPPriv(strAccessAction, true);
		}
		return iPSDEOPPriv;
	}

	@Override
	public boolean testDataAccessAction(Object objKey, IEntityDTO iEntityDTO, String strAccessAction) throws Exception {
		return testDataAccessAction(UserContext.getCurrentMust(), null, null ,objKey, iEntityDTO, strAccessAction);
	}

	@Override
	public boolean testDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {

		if (!StringUtils.hasLength(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.DENY.equalsIgnoreCase(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.NONE.equalsIgnoreCase(strAccessAction)) {
			return true;
		}
		
		if (DataAccessActions.COPY.equalsIgnoreCase(strAccessAction)) {
			Object lastKey = null;
			if(inputEntityDTO != null) {
				lastKey = this.getDataEntityRuntime().getKeyFieldValue(inputEntityDTO);
				inputEntityDTO.reset(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
			}
			try {
				//先判断获取数据
				if(!this.testDataAccessAction(iUserContext, parentDataEntityRuntime, strParentKey, objKey, null, DataAccessActions.READ)) {
					return false;
				}
				return this.testDataAccessAction(iUserContext, parentDataEntityRuntime, strParentKey, null, inputEntityDTO, DataAccessActions.CREATE);
			}
			finally {
				if(inputEntityDTO != null && lastKey != null) {
					inputEntityDTO.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), lastKey);
				}
			}
		}
		

		IEntityDTO iEntityDTO = null;

		int nDataAccCtrlMode = this.getDataAccCtrlMode();
		if (nDataAccCtrlMode != DEDataAccCtrlModes.NONE) {
			IPSDEOPPriv iPSDEOPPriv = null;
			switch (nDataAccCtrlMode) {
			case DEDataAccCtrlModes.SELF:
				iPSDEOPPriv = this.getPSDEOPPriv(null, strAccessAction);
				if (iPSDEOPPriv != null && StringUtils.hasLength(iPSDEOPPriv.getMapSysUniResCode())) {
					if (!this.getSystemAccessManager().testSysUniRes(iUserContext, iPSDEOPPriv.getMapSysUniResCode(), inputEntityDTO)) {
						return false;
					}
				} else if (!onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction)) {
					return false;
				}
				break;
			case DEDataAccCtrlModes.MASTER_SELF:
				if (parentDataEntityRuntime != null) {
					iPSDEOPPriv = this.getPSDEOPPriv(parentDataEntityRuntime, strAccessAction, true);
					if (iPSDEOPPriv != null) {
						// 指定权限映射
						if (ObjectUtils.isEmpty(objKey)) {
							if (inputEntityDTO == null) {
								throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "未指定传入数据对象", Errors.ACCESSDENY);
							}
							Object objParentKey = null;
							IPSDERBase masterPSDERBase = iPSDEOPPriv.getMapPSDERMust();
							if (masterPSDERBase instanceof IPSDER1N) {
								objParentKey = this.getDataEntityRuntime().getFieldValue(inputEntityDTO, ((IPSDER1N) masterPSDERBase).getPSPickupDEFieldMust());
							} else if (masterPSDERBase instanceof IPSDERCustom) {
								objParentKey = this.getDataEntityRuntime().getFieldValue(inputEntityDTO, ((IPSDERCustom) masterPSDERBase).getPickupPSDEFieldMust());
							}

							if (ObjectUtils.isEmpty(objParentKey)) {
								throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "数据对象中未指定父数据", Errors.ACCESSDENY);
							}

							if (!strParentKey.equals(objParentKey)) {
								throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "数据对象中父数据不一致", Errors.ACCESSDENY);
							}
						} else {
							iEntityDTO = getSimpleEntity(iPSDEOPPriv.getMapPSDERMust(), strParentKey, objKey);
						}

						return parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(iUserContext, strParentKey, iPSDEOPPriv.getMapPSDEOPPrivName());
					}
				}
				iPSDEOPPriv = this.getPSDEOPPriv(null, strAccessAction);
				if (iPSDEOPPriv != null && StringUtils.hasLength(iPSDEOPPriv.getMapSysUniResCode())) {
					if (!this.getSystemAccessManager().testSysUniRes(iUserContext, iPSDEOPPriv.getMapSysUniResCode(), inputEntityDTO)) {
						return false;
					}
				} else if (!onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction)) {
					return false;
				}
				break;
			case DEDataAccCtrlModes.MASTER:
				if (parentDataEntityRuntime == null) {
					IEntityDTO simpleEntityDTO = this.getDataEntityRuntime().createEntity();
					if(ObjectUtils.isEmpty(objKey)) {
						inputEntityDTO.copyTo(simpleEntityDTO);
					}else {
						simpleEntityDTO = this.getSimpleEntity(objKey);
					}
					IPSDERBase iPSDERBase = this.getDataEntityRuntime().getMasterPSDER(simpleEntityDTO, true);
					if(iPSDERBase != null) {
						IPSDEField pickupPSDEField = null;
						if(iPSDERBase instanceof IPSDER1N) {
							pickupPSDEField = ((IPSDER1N)iPSDERBase).getPSPickupDEFieldMust();
						}
						else
							if(iPSDERBase instanceof IPSDERCustom) {
								pickupPSDEField = ((IPSDERCustom)iPSDERBase).getPickupPSDEFieldMust();
							}
						
						if(pickupPSDEField!=null) {
							parentDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId(), false);
							Object parentKey = this.getDataEntityRuntime().getFieldValue(simpleEntityDTO, pickupPSDEField);
							if(parentKey!=null) {
								strParentKey = parentKey.toString();
							}
						}
					}
					if(parentDataEntityRuntime == null) {
						throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "未指定权限控制实体", Errors.ACCESSDENY);
					}
				}

				IPSDERBase masterPSDERBase = null;
				iPSDEOPPriv = this.getPSDEOPPriv(parentDataEntityRuntime, strAccessAction, true);
				String strAction = DataAccessActions.UPDATE;
				if (DataAccessActions.READ.equals(strAccessAction)) {
					strAction = DataAccessActions.READ;
				}

				if (iPSDEOPPriv != null) {
					// 没有指定
					masterPSDERBase = iPSDEOPPriv.getMapPSDERMust();
					strAction = iPSDEOPPriv.getMapPSDEOPPrivName();

					if (DataAccessActions.DENY.equalsIgnoreCase(strAccessAction)) {
						return false;
					}

				} else {
					masterPSDERBase = this.getDataEntityRuntime().getMasterPSDER(parentDataEntityRuntime.getId(), false);
				}
				if (ObjectUtils.isEmpty(objKey)) {
					if (inputEntityDTO == null) {
						throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "未指定传入数据对象", Errors.ACCESSDENY);
					}
					Object objParentKey = null;
					if (masterPSDERBase instanceof IPSDER1N) {
						objParentKey = this.getDataEntityRuntime().getFieldValue(inputEntityDTO, ((IPSDER1N) masterPSDERBase).getPSPickupDEFieldMust());
					} else if (masterPSDERBase instanceof IPSDERCustom) {
						objParentKey = this.getDataEntityRuntime().getFieldValue(inputEntityDTO, ((IPSDERCustom) masterPSDERBase).getPickupPSDEFieldMust());
					}

					if (ObjectUtils.isEmpty(objParentKey)) {
						throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "数据对象中未指定父数据", Errors.ACCESSDENY);
					}

					if (!strParentKey.equals(objParentKey)) {
						throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "数据对象中父数据不一致", Errors.ACCESSDENY);
					}
				} else {
					iEntityDTO = getSimpleEntity(masterPSDERBase, strParentKey, objKey);
				}
				
				return parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(iUserContext, strParentKey, strAction);
			default:
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法识别的数据访问控制模式[%1$s]", nDataAccCtrlMode), Errors.ACCESSDENY);
			}
		}

		// 做数据主状态等判断（与权限无关）
		if(iEntityDTO == null && ObjectUtils.isEmpty(objKey)) {
			return true;
		}
		
		
		return this.getDataEntityRuntime().testDataAccessAction((iEntityDTO == null) ? objKey : iEntityDTO, strAccessAction);
	}

	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {
		return true;
	}

	@Override
	public boolean testDataAccessAction(ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {
		return testDataAccessAction(UserContext.getCurrentMust(), null, null, iSearchContextDTO, strAccessAction);
	}

	@Override
	public boolean testDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {

		if (iSearchContextDTO == null) {
			log.warn(String.format("未传入数据过滤对象，无法判断"));
			return false;
		}
		if (!StringUtils.hasLength(strAccessAction)) {
			log.warn(String.format("未传入数据访问操作，无法判断"));
			return false;
		}

		if (DataAccessActions.DENY.equalsIgnoreCase(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.NONE.equalsIgnoreCase(strAccessAction)) {
			return true;
		}

		int nDataAccCtrlMode = this.getDataAccCtrlMode();
		if (nDataAccCtrlMode == DEDataAccCtrlModes.NONE) {
			return true;
		}

		if (parentDataEntityRuntime == null && (nDataAccCtrlMode == DEDataAccCtrlModes.MASTER_SELF || nDataAccCtrlMode == DEDataAccCtrlModes.MASTER)) {
			Object parentDEName = iSearchContextDTO.get(ISearchContextDTO.PARAM_PARENTDENAME);
			Object parentKey = iSearchContextDTO.get(ISearchContextDTO.PARAM_PARENTKEY);
			if (!ObjectUtils.isEmpty(parentDEName) && !ObjectUtils.isEmpty(parentKey)) {
				parentDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(parentDEName.toString(), true);
				if (parentDataEntityRuntime != null) {
					strParentKey = parentKey.toString();
				}
			}
		}

		IPSDEOPPriv iPSDEOPPriv = null;
		switch (nDataAccCtrlMode) {
		case DEDataAccCtrlModes.SELF:
			iPSDEOPPriv = this.getPSDEOPPriv(null, strAccessAction);
			if (iPSDEOPPriv != null && StringUtils.hasLength(iPSDEOPPriv.getMapSysUniResCode())) {
				return this.getSystemAccessManager().testSysUniRes(iUserContext, iPSDEOPPriv.getMapSysUniResCode(), null);
			} else {
				return onTestDataAccessAction(iUserContext, null, null, iSearchContextDTO, strAccessAction);
			}
		case DEDataAccCtrlModes.MASTER_SELF:
			if (parentDataEntityRuntime != null) {
				iPSDEOPPriv = this.getPSDEOPPriv(parentDataEntityRuntime, strAccessAction, true);
				if (iPSDEOPPriv != null) {
					if (parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(iUserContext, strParentKey, iPSDEOPPriv.getMapPSDEOPPrivName())) {
						// 附加条件
						IPSDEField pickupPSDEField = null;
						IPSDERBase masterPSDERBase = iPSDEOPPriv.getMapPSDERMust();
						if (masterPSDERBase instanceof IPSDER1N) {
							pickupPSDEField = ((IPSDER1N) masterPSDERBase).getPSPickupDEFieldMust();
						} else if (masterPSDERBase instanceof IPSDERCustom) {
							pickupPSDEField = ((IPSDERCustom) masterPSDERBase).getPickupPSDEFieldMust();
						}

						if (pickupPSDEField == null) {
							throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "控制关系连接属性无效", Errors.ACCESSDENY);
						}
						Object objParentKey = DataTypeUtils.parse(pickupPSDEField.getStdDataType(), strParentKey);
						SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, pickupPSDEField.getLowerCaseName(), Conditions.EQ, objParentKey, null);
						return true;
					}
				}
			}
			iPSDEOPPriv = this.getPSDEOPPriv(null, strAccessAction);
			if (iPSDEOPPriv != null && StringUtils.hasLength(iPSDEOPPriv.getMapSysUniResCode())) {
				return this.getSystemAccessManager().testSysUniRes(iUserContext, iPSDEOPPriv.getMapSysUniResCode(), null);
			} else {
				return onTestDataAccessAction(iUserContext, null, null, iSearchContextDTO, strAccessAction);
			}
		case DEDataAccCtrlModes.MASTER:
			if (parentDataEntityRuntime == null) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "未指定权限控制实体", Errors.ACCESSDENY);
			}

			IPSDERBase masterPSDERBase = null;
			iPSDEOPPriv = this.getPSDEOPPriv(parentDataEntityRuntime, strAccessAction, true);
			String strAction = DataAccessActions.UPDATE;
			if (DataAccessActions.READ.equals(strAccessAction)) {
				strAction = DataAccessActions.READ;
			}

			if (iPSDEOPPriv != null) {
				// 没有指定
				masterPSDERBase = iPSDEOPPriv.getMapPSDERMust();
				strAction = iPSDEOPPriv.getMapPSDEOPPrivName();

				if (DataAccessActions.DENY.equalsIgnoreCase(strAccessAction)) {
					return false;
				}

			} else {
				masterPSDERBase = this.getDataEntityRuntime().getMasterPSDER(parentDataEntityRuntime.getId(), false);
			}

			if (parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(iUserContext, strParentKey, strAction)) {
				// 附加条件
				IPSDEField pickupPSDEField = null;
				if (masterPSDERBase instanceof IPSDER1N) {
					pickupPSDEField = ((IPSDER1N) masterPSDERBase).getPSPickupDEFieldMust();
				} else if (masterPSDERBase instanceof IPSDERCustom) {
					pickupPSDEField = ((IPSDERCustom) masterPSDERBase).getPickupPSDEFieldMust();
				}

				if (pickupPSDEField == null) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "控制关系连接属性无效", Errors.ACCESSDENY);
				}
				Object objParentKey = DataTypeUtils.parse(pickupPSDEField.getStdDataType(), strParentKey);
				SearchContextDTO.addSearchFieldCondIf(iSearchContextDTO, pickupPSDEField.getLowerCaseName(), Conditions.EQ, objParentKey, null);
				return true;
			} else {
				return false;
			}
		default:
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法识别的数据访问控制模式[%1$s]", nDataAccCtrlMode), Errors.ACCESSDENY);
		}
	}

	protected boolean onTestDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {
		return true;
	}

	@Override
	public int getDataAccCtrlMode() {
		return this.nDataAccCtrlMode;
	}

	@Override
	public ISystemAccessManager getSystemAccessManager() {
		return this.iSystemAccessManager;
	}

	protected IEntityDTO getSimpleEntity(IPSDERBase iPSDERBase, String strParentKey, Object objKey) throws Exception {

		IPSDEField iPSDEField = null;
		if (iPSDERBase instanceof IPSDER1N) {
			iPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
		} else if (iPSDERBase instanceof IPSDERCustom) {
			iPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEFieldMust();
		} else
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法从实体关系[%1$s]获取连接属性", iPSDERBase.getName()));

		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
		Object objParentKey = this.getDataEntityRuntime().getSystemRuntime().convertValue(iPSDEField.getStdDataType(), strParentKey);
		if ((objKey instanceof String) && !DataTypeUtils.isStringDataType(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType())) {
			objKey = this.getDataEntityRuntime().getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), (String) objKey);
		}
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getName(), Conditions.EQ, objParentKey, null);
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, this.getDataEntityRuntime().getKeyPSDEField().getName(), Conditions.EQ, objKey, null);

		List<IEntityDTO> iEntityDTO = this.getDataEntityRuntime().selectSimple(iSearchContextDTO);
		if (iEntityDTO == null || iEntityDTO.size() == 0) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("指定数据不存在"), Errors.ACCESSDENY);
		}
		return iEntityDTO.get(0);
	}
	
	protected IEntityDTO getSimpleEntity(Object objKey) throws Exception {

		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
		if ((objKey instanceof String) && !DataTypeUtils.isStringDataType(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType())) {
			objKey = this.getDataEntityRuntime().getSystemRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), (String) objKey);
		}
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, this.getDataEntityRuntime().getKeyPSDEField().getName(), Conditions.EQ, objKey, null);

		List<IEntityDTO> list = this.getDataEntityRuntime().selectSimple(iSearchContextDTO);
		if (list == null || list.size() == 0) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("指定数据不存在"), Errors.ACCESSDENY);
		}
		return list.get(0);
	}
	
	protected List<IEntityDTO> getSimpleEntityList(Set<Object> keys) throws Exception {

		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
		
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, this.getDataEntityRuntime().getKeyPSDEField().getName(), Conditions.IN, keys, null);

		List<IEntityDTO> list = this.getDataEntityRuntime().selectSimple(iSearchContextDTO);
		if (list == null || list.size() == 0 || keys.size() != list.size()) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("指定数据不存在"), Errors.ACCESSDENY);
		}
		return list;
	}
	
	
	@Override
	public List<IDEUserRoleRuntime> getDefaultDEUserRoleRuntimes() {
		if (this.defaultDEUserRoleRuntimeList == null || this.defaultDEUserRoleRuntimeList.size() == 0) {
			return null;
		}
		return this.defaultDEUserRoleRuntimeList;
	}

	@Override
	public IDEUserRoleRuntime getDEUserRoleRuntime(String strUserRoleTag, boolean bTryMode) {
		IDEUserRoleRuntime iDEUserRoleRuntime = null;
		if (this.deUserRoleRuntimeMap != null) {
			iDEUserRoleRuntime = this.deUserRoleRuntimeMap.get(strUserRoleTag);
		}
		if (iDEUserRoleRuntime != null || bTryMode) {
			return iDEUserRoleRuntime;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法获取指定用户角色模型对象[%1$s]", strUserRoleTag));
	}

	@Override
	public boolean testDataAccessActionIf(IUserContext iUserContext, Object objKey, String strAccessAction) throws Exception {
		
		if(this.getDataAccCtrlMode() == DEDataAccCtrlModes.MASTER_SELF
				|| this.getDataAccCtrlMode() == DEDataAccCtrlModes.MASTER) {
			//尝试获取父
			IEntityDTO iEntityDTO = this.getSimpleEntity(objKey);
			IPSDERBase iPSDERBase = this.getDataEntityRuntime().getMasterPSDER(iEntityDTO, true);
			if(iPSDERBase != null) {
				Object parentKey = null;
				if(iPSDERBase instanceof IPSDER1N) {
					parentKey = iEntityDTO.get(((IPSDER1N)iPSDERBase).getPSPickupDEFieldMust().getLowerCaseName());
				}
				else
					if(iPSDERBase instanceof IPSDERCustom) {
						parentKey = iEntityDTO.get(((IPSDERCustom)iPSDERBase).getPickupPSDEFieldMust().getLowerCaseName());
					}
				if(!ObjectUtils.isEmpty(parentKey)) {
					return this.testDataAccessAction(iUserContext, this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId()), parentKey.toString(), objKey, null, strAccessAction);
				}
			}
		}
		
		return this.testDataAccessAction(iUserContext, null, null, objKey, null, strAccessAction);
	}

	@Override
	public boolean testDataAccessActionIf(IUserContext iUserContext, Set<Object> keys, String strAccessAction) throws Exception {
		
		if(this.getDataAccCtrlMode() == DEDataAccCtrlModes.MASTER_SELF
				|| this.getDataAccCtrlMode() == DEDataAccCtrlModes.MASTER) {
			//尝试获取父
			List<IEntityDTO> list  = this.getSimpleEntityList(keys);
			for(IEntityDTO iEntityDTO : list) {
				IPSDERBase iPSDERBase = this.getDataEntityRuntime().getMasterPSDER(iEntityDTO, true);
				if(iPSDERBase != null) {
					Object parentKey = null;
					if(iPSDERBase instanceof IPSDER1N) {
						parentKey = iEntityDTO.get(((IPSDER1N)iPSDERBase).getPSPickupDEFieldMust().getLowerCaseName());
					}
					else
						if(iPSDERBase instanceof IPSDERCustom) {
							parentKey = iEntityDTO.get(((IPSDERCustom)iPSDERBase).getPickupPSDEFieldMust().getLowerCaseName());
						}
					if(!ObjectUtils.isEmpty(parentKey)) {
						if(!this.testDataAccessAction(iUserContext, this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId()), parentKey.toString(), iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()), null, strAccessAction)) {
							return false;
						}
					}
				}
			}
			return true;
		}
		
		for(Object objKey : keys) {
			if(!this.testDataAccessAction(iUserContext, null, null, objKey, null, strAccessAction)) {
				return false;
			}
		}
		return true;
		
	}
	
	
}
