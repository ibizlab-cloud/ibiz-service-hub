package net.ibizsys.central.cloud.core.dataentity.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.UAADEAuthority;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.security.IDEUserRoleRuntime;
import net.ibizsys.central.dataentity.security.dr.IDataEntityDRProvider;
import net.ibizsys.central.dataentity.wf.IDEWFRuntime;
import net.ibizsys.central.security.ISysUserRoleRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.priv.IPSDEDataRange;
import net.ibizsys.model.dataentity.priv.IPSDEOPPriv;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv;
import net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl;
import net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl;
import net.ibizsys.runtime.dataentity.security.DEDataAccCtrlModes;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.DataRanges;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;

public class DataEntityAccessManager extends net.ibizsys.central.dataentity.security.DataEntityAccessManager implements IDataEntityAccessManager {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityAccessManager.class);

	/**
	 * 全部操作标识
	 */
	private Map<String, Integer> allOPPrivs = new HashMap<>();

	private Map<String, IDataEntityDRProvider> dataEntityDRProviderMap = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();
		loadAllOPPrivs();

		this.dataEntityDRProviderMap = this.getSystemRuntime().getRuntimeObjects(IDataEntityDRProvider.class);
	}

	protected Map<String, IDataEntityDRProvider> getDataEntityDRProviderMap() {
		return this.dataEntityDRProviderMap;
	}

	// /**
	// * 是否启用超级用户模式
	// * @return
	// */
	// protected boolean isEnableSuperuser() {
	// return true;
	// }

	@Override
	public net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime getDataEntityRuntime() {
		return (net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime) super.getDataEntityRuntime();
	}

	protected boolean testSuperuser(IUserContext iUserContext) {
		return iUserContext.isSuperuser();
	}

	/**
	 * 加载操作标识
	 *
	 * @throws Exception
	 */
	protected void loadAllOPPrivs() throws Exception {
		List<IPSDEOPPriv> iPSDEOPPrivs = this.getDataEntityRuntime().getPSDataEntity().getAllPSDEOPPrivs();
		if (iPSDEOPPrivs != null) {
			for (IPSDEOPPriv psDEUserRoleOPPriv : iPSDEOPPrivs) {
				if (!allOPPrivs.containsKey(psDEUserRoleOPPriv.getName())) {
					allOPPrivs.put(psDEUserRoleOPPriv.getName(), 0);
				}
			}
		}
	}

	protected IDEUserRoleRuntime createDEUserRoleRuntime(IPSDEUserRole iPSDEUserRole) {
		return new DEUserRoleRuntime();
	}

	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {

		if (testSuperuser(iUserContext))
			return true;

		// 判断是否在流程中
		try {
			if (!ObjectUtils.isEmpty(objKey) && this.getDataEntityRuntime().isEnableWF()) {
				if (DataAccessActions.READ.equals(strAccessAction)) {
					int nAccessMode = this.getDataEntityRuntime().getDefaultDEWFRuntime().getAccessMode(objKey, null);
					if ((nAccessMode & IDEWFRuntime.ACCESSMODE_READ) > 0) {
						return true;
					}
				} else if (DataAccessActions.UPDATE.equals(strAccessAction) && this.getDataEntityRuntime().testDataInWF(this.getDataEntityRuntime().getSimpleEntity(objKey))) {
					int nAccessMode = this.getDataEntityRuntime().getDefaultDEWFRuntime().getAccessMode(objKey, null);
					// accessMode =
					// wfClient.getDataAccessMode(AuthenticationUser.getAuthenticationUser().getSrfsystemid(),
					// this.getPSDataEntity().getCodeName().toLowerCase(), key);
					boolean bRet = (nAccessMode & 2) > 0;
					if (bRet && inputEntityDTO != null) {
						// 进一步处理当前流程步骤的可编辑属性
						WFEditableFields wfEditableFields = this.getDataEntityRuntime().getDefaultDEWFRuntime().getEditableFields(objKey, null);
						if (wfEditableFields != null) {
							if (net.ibizsys.central.cloud.core.dataentity.wf.IDEWFRuntime.WFINSTFIELDEDITMODE_INCLUDE.equalsIgnoreCase(wfEditableFields.getEditMode()) || net.ibizsys.central.cloud.core.dataentity.wf.IDEWFRuntime.WFINSTFIELDEDITMODE_EXCLUDE.equalsIgnoreCase(wfEditableFields.getEditMode())) {
								List<String> fieldList = wfEditableFields.getFieldMap();
								Map<String, String> fieldMap = new HashMap<String, String>();
								if (!ObjectUtils.isEmpty(fieldList)) {
									for (String strField : fieldList) {
										if (!StringUtils.hasLength(strField)) {
											continue;
										}
										fieldMap.put(strField.trim().toLowerCase(), "");
									}
								}

								boolean bIncludeMode = net.ibizsys.central.cloud.core.dataentity.wf.IDEWFRuntime.WFINSTFIELDEDITMODE_INCLUDE.equalsIgnoreCase(wfEditableFields.getEditMode());
								java.util.List<IPSDEField> psDEFields = this.getDataEntityRuntime().getPSDataEntity().getAllPSDEFields();
								if (!ObjectUtils.isEmpty(psDEFields)) {
									for (IPSDEField iPSDEField : psDEFields) {
										if (iPSDEField.isKeyDEField()) {
											continue;
										}

										if (bIncludeMode) {
											if (!fieldMap.containsKey(iPSDEField.getLowerCaseName())) {
												inputEntityDTO.reset(iPSDEField.getLowerCaseName());
											}
										} else {
											if (fieldMap.containsKey(iPSDEField.getLowerCaseName())) {
												inputEntityDTO.reset(iPSDEField.getLowerCaseName());
											}
										}
									}
								}

								return true;
							}
						}
						return false;
					}
					return bRet;
				}
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("判断工作流数据权限发生异常，%1$s", ex.getMessage()), ex);
		}

		// 检查数据能力
		if (!onTestDataAccessAction(iUserContext, inputEntityDTO, strAccessAction)) {
			return false;
		}

		if (DataAccessActions.CREATE.equals(strAccessAction)) {
			return true;
		}

		// 检查数据范围
		if (objKey == null)
			return true;

		return existsData(iUserContext, objKey, strAccessAction);
	}

	protected boolean existsData(IUserContext iUserContext, Object objKey, String strAccessAction) {
		ISearchContextDTO context = this.getDataEntityRuntime().createSearchContext();
		SearchContextDTO.addSearchFieldCond(context, this.getDataEntityRuntime().getKeyPSDEField().getName(), Conditions.EQ, objKey, null);
		addAuthorityConditions(context, (IEmployeeContext) iUserContext, strAccessAction);
		if (!this.getDataEntityRuntime().existsData(context)) {
			return false;
		}
		return true;
	}

	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {

		if (testSuperuser(iUserContext))
			return true;

		// 检查数据能力
		if (!onTestDataAccessAction(iUserContext, null, strAccessAction)) {
			return false;
		}

		addAuthorityConditions(iSearchContextDTO, (IEmployeeContext) iUserContext, strAccessAction);
		return true;
	}

	/**
	 * 判断实体是否包含操作strAccessAction
	 *
	 * @param iUserContext
	 * @param strAccessAction
	 * @return
	 * @throws Exception
	 */
	protected boolean onTestDataAccessAction(IUserContext iUserContext, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {

		if (testSuperuser(iUserContext))
			return true;

		if (!StringUtils.hasLength(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.DENY.equals(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.NONE.equals(strAccessAction)) {
			return true;
		}

		List<IPSDEUserRole> list = this.getPSDEUserRoles((IEmployeeContext) iUserContext, strAccessAction);
		if (ObjectUtils.isEmpty(list)) {
			return false;
		}

		if (DataAccessActions.CREATE.equals(strAccessAction)) {

			// 判断有没有定义全部数据
			for (IPSDEUserRole iPSDEUserRole : list) {
				if (iPSDEUserRole.isAllData()) {
					return true;
				}
			}

			IEmployeeContext iEmployeeContext = (IEmployeeContext) iUserContext;
			// 获取数据中的组织
			IPSDEField orgIdPSDEField = this.getDataEntityRuntime().getOrgIdPSDEField();
			if (orgIdPSDEField != null) {
				String strOrgId = null;
				if (inputEntityDTO != null) {
					strOrgId = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(inputEntityDTO, orgIdPSDEField), null);
				}
				if (!StringUtils.hasLength(strOrgId)) {
					strOrgId = iEmployeeContext.getOrgid();
				}

				if (StringUtils.hasLength(iEmployeeContext.getOrgid())) {
					for (IPSDEUserRole iPSDEUserRole : list) {
						if (iPSDEUserRole.isEnableOrgDR() && ((iPSDEUserRole.getOrgDR() & DataRanges.ORG_CURRENT) == DataRanges.ORG_CURRENT)) {
							if (iEmployeeContext.getOrgid().equals(strOrgId)) {
								return true;
							}
						}
					}
				}
			}

			IPSDEField deptIdPSDEField = this.getDataEntityRuntime().getDeptIdPSDEField();
			if (deptIdPSDEField != null) {
				String strDeptId = null;
				if (inputEntityDTO != null) {
					strDeptId = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(inputEntityDTO, deptIdPSDEField), null);
				}
				if (!StringUtils.hasLength(strDeptId)) {
					strDeptId = iEmployeeContext.getDeptid();
				}

				if (StringUtils.hasLength(iEmployeeContext.getDeptid())) {
					for (IPSDEUserRole iPSDEUserRole : list) {
						if (iPSDEUserRole.isEnableSecDR() && ((iPSDEUserRole.getSecDR() & DataRanges.SECTOR_CURRENT) == DataRanges.SECTOR_CURRENT)) {
							if (iEmployeeContext.getDeptid().equals(strDeptId)) {
								return true;
							}
						}
					}
				}
			}

			// 存在范围定义
			if (orgIdPSDEField != null || deptIdPSDEField != null) {
				return false;
			}

			return true;
		}

		return true;
	}

	protected List<IPSDEUserRole> getPSDEUserRoles(IEmployeeContext iEmployeeContext, String strAccessAction) {
		List<IPSDEUserRole> authorities = new ArrayList<>();
		// AuthenticationUser authenticationUser =
		// AuthenticationUser.getAuthenticationUser();

		// 实体默认能力
		List<IPSDEUserRole> iPSDEUserRoles = new ArrayList<>();
		List<IDEUserRoleRuntime> iDEUserRoleRuntimes = this.getDefaultDEUserRoleRuntimes();
		if (iDEUserRoleRuntimes != null) {
			iDEUserRoleRuntimes.stream().forEach(iDEUserRoleRuntime -> iPSDEUserRoles.add(iDEUserRoleRuntime.getPSDEUserRole()));
		}
		if (iPSDEUserRoles != null) {
			iPSDEUserRoles.stream().forEach(iPSDEUserRole -> {
				List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = iPSDEUserRole.getPSDEUserRoleOPPrivs();
				if (iPSDEUserRoleOPPrivs != null) {
					if (iPSDEUserRoleOPPrivs.stream().anyMatch(iPSDEUserRoleOPPriv -> iPSDEUserRoleOPPriv.getDataAccessAction().equals(strAccessAction))) {
						authorities.add(iPSDEUserRole);
					}
				}
			});
		}

		// 系统用户能力
		if (true) {
			List<ISysUserRoleRuntime> userSysUserRoleRuntimes = this.getSystemAccessManager().getUserSysUserRoleRuntimes();
			if (userSysUserRoleRuntimes != null) {
				userSysUserRoleRuntimes.stream().forEach(userSysUserRoleRuntime -> {
					List<IPSDEUserRole> userIPSDEUserRoles = userSysUserRoleRuntime.getPSDEUserRoles(this.getDataEntityRuntime().getId());
					if (userIPSDEUserRoles != null) {
						userIPSDEUserRoles.forEach(userIPSDEUserRole -> {
							List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = userIPSDEUserRole.getPSDEUserRoleOPPrivs();
							if (iPSDEUserRoleOPPrivs != null) {
								if (iPSDEUserRoleOPPrivs.stream().anyMatch(iPSDEUserRoleOPPriv -> iPSDEUserRoleOPPriv.getDataAccessAction().equals(strAccessAction))) {
									authorities.add(userIPSDEUserRole);
								}
							}
						});
					}
				});
			}
		}

		// 系统管理员能力
		// if (authenticationUser.getAdminuser() == 1) {
		if (iEmployeeContext.isSystemadmin()) {
			List<ISysUserRoleRuntime> adminSysUserRoleRuntimes = this.getSystemAccessManager().getAdminSysUserRoleRuntimes();
			if (adminSysUserRoleRuntimes != null) {
				adminSysUserRoleRuntimes.stream().forEach(adminSysUserRoleRuntime -> {
					List<IPSDEUserRole> adminIPSDEUserRoles = adminSysUserRoleRuntime.getPSDEUserRoles(this.getDataEntityRuntime().getId());
					if (adminIPSDEUserRoles != null) {
						adminIPSDEUserRoles.stream().forEach(adminIPSDEUserRole -> {
							List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = adminIPSDEUserRole.getPSDEUserRoleOPPrivs();
							if (iPSDEUserRoleOPPrivs != null) {
								if (iPSDEUserRoleOPPrivs.stream().anyMatch(iPSDEUserRoleOPPriv -> iPSDEUserRoleOPPriv.getDataAccessAction().equals(strAccessAction))) {
									authorities.add(adminIPSDEUserRole);
								}
							}
						});
					}
				});
			}
		}

		// 系统角色分配固定能力
		List<ISysUserRoleRuntime> iSysUserRoleRuntimes = this.getSystemAccessManager().getSysUserRoleRuntimes(iEmployeeContext);
		iSysUserRoleRuntimes.stream().forEach(iSysUserRoleRuntime -> {
			List<IPSDEUserRole> followPSDEUserRoles = iSysUserRoleRuntime.getPSDEUserRoles(this.getDataEntityRuntime().getId());
			if (followPSDEUserRoles != null) {
				for (IPSDEUserRole followIPSDEUserRole : followPSDEUserRoles) {
					if (!"CAT1".equals(followIPSDEUserRole.getUserCat()) && !followIPSDEUserRole.isSystemReserved())
						continue;
					List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = followIPSDEUserRole.getPSDEUserRoleOPPrivs();
					if (iPSDEUserRoleOPPrivs != null) {
						if (iPSDEUserRoleOPPrivs.stream().anyMatch(iPSDEUserRoleOPPriv -> iPSDEUserRoleOPPriv.getDataAccessAction().equals(strAccessAction))) {
							authorities.add(followIPSDEUserRole);
						}
					}
				}
			}
		});

		// 运行时分配能力
		for (IPSDEUserRole rtPSDEUserRole : getPSDEUserRoleByRT(iEmployeeContext)) {
			List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = rtPSDEUserRole.getPSDEUserRoleOPPrivs();
			if (iPSDEUserRoleOPPrivs != null) {
				if (iPSDEUserRoleOPPrivs.stream().anyMatch(iPSDEUserRoleOPPriv -> iPSDEUserRoleOPPriv.getDataAccessAction().equals(strAccessAction))) {
					authorities.add(rtPSDEUserRole);
				}
			}
		}

		return authorities;
	}

	protected List<IPSDEUserRole> getPSDEUserRoleByRT(IEmployeeContext iEmployeeContext) {
		// AuthenticationUser authenticationUser =
		// AuthenticationUser.getAuthenticationUser();
		List<IPSDEUserRole> iPSDEUserRoles = new ArrayList<>();
		if (iEmployeeContext.getAuthorities() != null) {
			iEmployeeContext.getAuthorities().stream().filter(grantedAuthority -> grantedAuthority instanceof UAADEAuthority).forEach(grantedAuthority -> {
				UAADEAuthority uaadeAuthority = (UAADEAuthority) grantedAuthority;
				if (uaadeAuthority.getEntity().equals(this.getDataEntityRuntime().getName())) {
					ObjectNode userRoleNode = JsonUtils.createObjectNode();
					userRoleNode.put(PSDEUserRoleImpl.ATTR_GETNAME, uaadeAuthority.getName());
					if (uaadeAuthority.getIsAllData() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_ISALLDATA, uaadeAuthority.getIsAllData());
					if (uaadeAuthority.getEnableorgdr() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_ISENABLEORGDR, uaadeAuthority.getEnableorgdr());
					if (uaadeAuthority.getOrgdr() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_GETORGDR, uaadeAuthority.getOrgdr());
					if (uaadeAuthority.getEnabledeptdr() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_ISENABLESECDR, uaadeAuthority.getEnabledeptdr());
					if (uaadeAuthority.getDeptdr() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_GETSECDR, uaadeAuthority.getDeptdr());
					if (uaadeAuthority.getDeptbc() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_GETSECBC, uaadeAuthority.getDeptbc());
					if (uaadeAuthority.getBscope() != null)
						userRoleNode.put(PSDEUserRoleImpl.ATTR_GETCUSTOMCOND, uaadeAuthority.getBscope());
					if (!ObjectUtils.isEmpty(uaadeAuthority.getDeAction())) {
						ArrayNode userRoleDataActionsNode = JsonUtils.createArrayNode();
						for (Map<String, String> deAction : uaadeAuthority.getDeAction()) {
							ObjectNode userRoleDataActionNode = JsonUtils.createObjectNode();
							for (String key : deAction.keySet()) {
								userRoleDataActionNode.put(PSDEOPPrivRoleImpl.ATTR_GETDATAACCESSACTION, key);
								userRoleDataActionsNode.add(userRoleDataActionNode);
							}
						}
						userRoleNode.put(PSDEUserRoleImpl.ATTR_GETPSDEUSERROLEOPPRIVS, userRoleDataActionsNode);
					}
					try {
						IPSDEUserRole iPSDEUserRole = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDEUserRole.class, userRoleNode);
						iPSDEUserRoles.add(iPSDEUserRole);
					} catch (Exception ex) {
						log.error(ex);
					}
				}
			});
		}

		return iPSDEUserRoles;
	}

	
	
	@Override
	public void addAuthorityConditions(IEmployeeContext iEmployeeContext, ISearchContextDTO searchContext, IPSDEDataRange iPSDEDataRange) {
		if(iPSDEDataRange.isEnableUserDR()) {
			String strUserDRAction = iPSDEDataRange.getUserDRAction();
			if(ObjectUtils.isEmpty(strUserDRAction)) {
				strUserDRAction = DataAccessActions.READ;
			}
			addAuthorityConditionsIf(iEmployeeContext, searchContext, strUserDRAction);
		}
		
		Map<String, IDataEntityDRProvider> providerMap = getDataEntityDRProviderMap();
		if (!ObjectUtils.isEmpty(providerMap)) {
			List<net.ibizsys.central.cloud.core.dataentity.security.dr.IDataEntityDRProvider> dataEntityDRProviderList = new ArrayList<net.ibizsys.central.cloud.core.dataentity.security.dr.IDataEntityDRProvider>();
			providerMap.values().forEach(provider -> {
				if(provider instanceof net.ibizsys.central.cloud.core.dataentity.security.dr.IDataEntityDRProvider) {
					net.ibizsys.central.cloud.core.dataentity.security.dr.IDataEntityDRProvider iDataEntityDRProvider = (net.ibizsys.central.cloud.core.dataentity.security.dr.IDataEntityDRProvider)provider;
					if(iDataEntityDRProvider.support(iPSDEDataRange)) {
						dataEntityDRProviderList.add(iDataEntityDRProvider);
					}
				}
			});
			
			if(!ObjectUtils.isEmpty(dataEntityDRProviderList)) {
				List<ISearchCond> authorities = new ArrayList<ISearchCond>();
				for(net.ibizsys.central.cloud.core.dataentity.security.dr.IDataEntityDRProvider iDataEntityDRProvider : dataEntityDRProviderList) {
					List<ISearchCond> searchConds = iDataEntityDRProvider.getDRSearchConds(iEmployeeContext, this.getDataEntityRuntime(), iPSDEDataRange);
					if(!ObjectUtils.isEmpty(searchConds)) {
						if(searchConds.size() == 1) {
							authorities.add(searchConds.get(0));
						}
						else {
							// 对象能力 OR
							SearchGroupCond orGroupCond = new SearchGroupCond(searchContext);
							orGroupCond.setCondOp(Conditions.OR);
							orGroupCond.getSearchCondsIf().addAll(searchConds);
							authorities.add(orGroupCond);
						}
					}
				}
				
				if(authorities.size()>0) {
					if(authorities.size() == 1) {
						searchContext.getSearchCondsIf().add(authorities.get(0));
					}
					else {
						//使用or
						SearchGroupCond orGroupCond = new SearchGroupCond(searchContext);
						orGroupCond.setCondOp(Conditions.OR);
						orGroupCond.getSearchCondsIf().addAll(authorities);
						searchContext.getSearchCondsIf().add(orGroupCond);
					}
				}
				else {
					SearchCustomCond customCond = new SearchCustomCond();
					customCond.setCustomCond(ISearchCustomCond.FALSE);
					searchContext.getSearchCondsIf().add(customCond);
				}
			}
		}
	}

	@Override
	public void addAuthorityConditionsIf(IEmployeeContext iEmployeeContext, ISearchContextDTO searchContext, String action) {
		ISearchGroupCond iSearchGroupCond = searchContext.getSearchGroupCondByCat(ISearchGroupCond.CAT_AUTHORITY);
		if(iSearchGroupCond != null) {
			log.warn(String.format("搜索上下文对象已经存在授权分组，忽略添加"));
			return;
		}
		this.addAuthorityConditions(searchContext, iEmployeeContext, action);
	}

	/**
	 * 附加操作权限条件
	 *
	 * @param searchContext
	 * @param action
	 */
	public void addAuthorityConditions(ISearchContextDTO searchContext, IEmployeeContext iEmployeeContext, String action) {
		// AuthenticationUser authenticationUser =
		// AuthenticationUser.getAuthenticationUser();
		if (testSuperuser(iEmployeeContext))
			return;

		List<ISearchCond> items = searchContext.getSearchCondsIf();
		List<IPSDEUserRole> authorities = this.getPSDEUserRoles(iEmployeeContext, action);
		// 全部数据
		if (authorities.stream().anyMatch(authority -> authority.isAllData()))
			return;

		// 权限附加条件 AND
		SearchGroupCond authorityCond = new SearchGroupCond(searchContext);
		authorityCond.setCondOp(Conditions.AND);
		authorityCond.setCat(ISearchGroupCond.CAT_AUTHORITY);

		// 对象能力 OR
		SearchGroupCond authorityConds = new SearchGroupCond(searchContext);
		authorityConds.setCondOp(Conditions.OR);

		authorityCond.getSearchCondsIf().add(authorityConds);

		if (authorities.size() == 0) {
			SearchCustomCond customCond = new SearchCustomCond();
			customCond.setCustomCond(ISearchCustomCond.FALSE);
			authorityConds.getSearchCondsIf().add(customCond);
			items.add(authorityCond);
		} else {
			List<ISearchCond> conds = genAuthorityConditions(authorities, action);
			if (!ObjectUtils.isEmpty(conds)) {
				authorityConds.getSearchCondsIf().addAll(conds);
				items.add(authorityCond);
			} else {
				SearchCustomCond customCond = new SearchCustomCond();
				customCond.setCustomCond(ISearchCustomCond.FALSE);
				authorityConds.getSearchCondsIf().add(customCond);
				items.add(authorityCond);
			}
		}

	}

	/**
	 * 加载运行时能力
	 *
	 * @param iPSDEUserRoles
	 * @param action
	 * @return
	 */
	protected List<ISearchCond> genAuthorityConditions(Collection<IPSDEUserRole> iPSDEUserRoles, String action) {
		List<ISearchCond> searchConds = new ArrayList<>();
		// Map<String, IDataEntityDRProvider> providerMap =
		// SpringContextHolder.getApplicationContext().getBeansOfType(IDataEntityDRProvider.class);
		Map<String, IDataEntityDRProvider> providerMap = getDataEntityDRProviderMap();
		if (!ObjectUtils.isEmpty(providerMap)) {
			providerMap.values().forEach(provider -> {
				List<ISearchCond> drSearchConds = provider.getDRSearchConds(this.getDataEntityRuntime(), iPSDEUserRoles, action);
				if (!ObjectUtils.isEmpty(drSearchConds)) {
					searchConds.addAll(drSearchConds);
				}
			});
		}
		return searchConds;
	}

	/**
	 * 获取数据全部能力
	 *
	 * @param key
	 * @return
	 */
	protected Map<String, Integer> getDataOPPrivs(IEmployeeContext iEmployeeContext, Serializable key) {
		// AuthenticationUser authenticationUser =
		// AuthenticationUser.getAuthenticationUser();
		Map<String, Integer> opprivsMap = new HashMap<>();
		if (testSuperuser(iEmployeeContext)) {
			return opprivsMap;
		}
		// 实体默认能力
		List<IPSDEUserRole> iPSDEUserRoles = new ArrayList<>();
		List<IDEUserRoleRuntime> iDEUserRoleRuntimes = this.getDefaultDEUserRoleRuntimes();
		if (iDEUserRoleRuntimes != null) {
			iDEUserRoleRuntimes.stream().forEach(iDEUserRoleRuntime -> iPSDEUserRoles.add(iDEUserRoleRuntime.getPSDEUserRole()));
		}
		if (iPSDEUserRoles != null) {
			iPSDEUserRoles.stream().forEach(iPSDEUserRole -> {
				List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = iPSDEUserRole.getPSDEUserRoleOPPrivs();
				if (iPSDEUserRoleOPPrivs != null) {
					iPSDEUserRoleOPPrivs.stream().forEach(iPSDEUserRoleOPPriv -> {
						if (!opprivsMap.containsKey(iPSDEUserRoleOPPriv.getDataAccessAction())) {
							opprivsMap.put(iPSDEUserRoleOPPriv.getDataAccessAction(), 0);
						}
					});
				}
			});
		}

		// 系统用户能力
		if (true) {
			List<ISysUserRoleRuntime> userSysUserRoleRuntimes = this.getSystemAccessManager().getUserSysUserRoleRuntimes();
			if (userSysUserRoleRuntimes != null) {
				userSysUserRoleRuntimes.stream().forEach(userSysUserRoleRuntime -> {
					List<IPSDEUserRole> userIPSDEUserRoles = userSysUserRoleRuntime.getPSDEUserRoles(this.getDataEntityRuntime().getId());
					if (userIPSDEUserRoles != null) {
						userIPSDEUserRoles.forEach(userIPSDEUserRole -> {
							List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = userIPSDEUserRole.getPSDEUserRoleOPPrivs();
							if (iPSDEUserRoleOPPrivs != null) {
								iPSDEUserRoleOPPrivs.stream().forEach(iPSDEUserRoleOPPriv -> {
									if (!opprivsMap.containsKey(iPSDEUserRoleOPPriv.getDataAccessAction())) {
										opprivsMap.put(iPSDEUserRoleOPPriv.getDataAccessAction(), 0);
									}
								});
							}
						});
					}
				});
			}
		}

		// 系统管理员能力
		if (iEmployeeContext.isSystemadmin()) {
			List<ISysUserRoleRuntime> adminSysUserRoleRuntimes = this.getSystemAccessManager().getAdminSysUserRoleRuntimes();
			if (adminSysUserRoleRuntimes != null) {
				adminSysUserRoleRuntimes.stream().forEach(adminSysUserRoleRuntime -> {
					List<IPSDEUserRole> adminIPSDEUserRoles = adminSysUserRoleRuntime.getPSDEUserRoles(this.getDataEntityRuntime().getId());
					if (adminIPSDEUserRoles != null) {
						adminIPSDEUserRoles.stream().forEach(adminIPSDEUserRole -> {
							List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = adminIPSDEUserRole.getPSDEUserRoleOPPrivs();
							if (iPSDEUserRoleOPPrivs != null) {
								iPSDEUserRoleOPPrivs.stream().forEach(iPSDEUserRoleOPPriv -> {
									if (!opprivsMap.containsKey(iPSDEUserRoleOPPriv.getDataAccessAction())) {
										opprivsMap.put(iPSDEUserRoleOPPriv.getDataAccessAction(), 0);
									}
								});
							}
						});
					}
				});
			}
		}

		// 系统角色分配固定能力
		List<ISysUserRoleRuntime> iSysUserRoleRuntimes = this.getSystemAccessManager().getSysUserRoleRuntimes(iEmployeeContext);
		iSysUserRoleRuntimes.stream().forEach(iSysUserRoleRuntime -> {
			List<IPSDEUserRole> followPSDEUserRoles = iSysUserRoleRuntime.getPSDEUserRoles(this.getDataEntityRuntime().getId());
			if (followPSDEUserRoles != null) {
				for (IPSDEUserRole followIPSDEUserRole : followPSDEUserRoles) {
					if (!"CAT1".equals(followIPSDEUserRole.getUserCat()) && !followIPSDEUserRole.isSystemReserved())
						continue;
					List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = followIPSDEUserRole.getPSDEUserRoleOPPrivs();
					if (iPSDEUserRoleOPPrivs != null) {
						iPSDEUserRoleOPPrivs.stream().forEach(iPSDEUserRoleOPPriv -> {
							if (!opprivsMap.containsKey(iPSDEUserRoleOPPriv.getDataAccessAction())) {
								opprivsMap.put(iPSDEUserRoleOPPriv.getDataAccessAction(), 0);
							}
						});
					}
				}
			}
		});

		// 运行时分配能力
		for (IPSDEUserRole rtPSDEUserRole : getPSDEUserRoleByRT(iEmployeeContext)) {
			List<IPSDEUserRoleOPPriv> iPSDEUserRoleOPPrivs = rtPSDEUserRole.getPSDEUserRoleOPPrivs();
			if (iPSDEUserRoleOPPrivs != null) {
				iPSDEUserRoleOPPrivs.stream().forEach(iPSDEUserRoleOPPriv -> {
					if (!opprivsMap.containsKey(iPSDEUserRoleOPPriv.getDataAccessAction())) {
						opprivsMap.put(iPSDEUserRoleOPPriv.getDataAccessAction(), 0);
					}
				});
			}
		}

		opprivsMap.entrySet().stream().forEach(opprivsrEntry -> {
			try {
				if (onTestDataAccessAction(iEmployeeContext, key, null, opprivsrEntry.getKey())) {
					opprivsrEntry.setValue(1);
				}
			} catch (Throwable throwable) {
				//
			}
		});
		// 补充未分配能力
		allOPPrivs.entrySet().stream().forEach(opprivEntry -> {
			if (!opprivsMap.containsKey(opprivEntry.getKey())) {
				opprivsMap.put(opprivEntry.getKey(), 0);
			}
		});
		return opprivsMap;
	}

	@Override
	public void fillDataAccessActions(IEmployeeContext iEmployeeContext, List<IEntityDTO> iEntityDTOList, String strDataAccessActions, String strFieldName) throws Exception {

		if (ObjectUtils.isEmpty(iEntityDTOList)) {
			return;
		}

		Set<String> dataAccessActionList = new HashSet<String>();
		if (StringUtils.hasLength(strDataAccessActions)) {
			String[] items = strDataAccessActions.toUpperCase().replace(",", ";").split("[;]");
			dataAccessActionList.addAll(Arrays.asList(items));
		} else {
			dataAccessActionList.addAll(allOPPrivs.keySet());
		}

		dataAccessActionList.remove(DataAccessActions.CREATE);
		dataAccessActionList.remove(DataAccessActions.READ);

		this.fillDataAccessActions(iEmployeeContext, iEntityDTOList, dataAccessActionList, strFieldName);
	}

	protected void fillDataAccessActions(IEmployeeContext iEmployeeContext, List<IEntityDTO> iEntityDTOList, Set<String> dataAccessActionList, String strFieldName) throws Exception {

		if (ObjectUtils.isEmpty(dataAccessActionList)) {
			return;
		}

		if (!StringUtils.hasLength(strFieldName)) {
			strFieldName = "srfdataaccaction";
		}
		// 主状态
		Map<Object, Map<String, Boolean>> entityAccessActionMap = new LinkedHashMap<Object, Map<String, Boolean>>();
		for (IEntityDTO iEntityDTO : iEntityDTOList) {
			Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
			if (ObjectUtils.isEmpty(key)) {
				continue;
			}

			if (iEntityDTO.contains(strFieldName)) {
				continue;
			}

			Map<String, Boolean> map = new LinkedHashMap<String, Boolean>();
			for (String strAccessAction : dataAccessActionList) {
				map.put(strAccessAction, null);
			}
			entityAccessActionMap.put(key, map);
		}

		if (ObjectUtils.isEmpty(entityAccessActionMap)) {
			return;
		}

		int nDataAccCtrlMode = this.getDataAccCtrlMode();
		if (nDataAccCtrlMode != DEDataAccCtrlModes.NONE) {
			boolean bTestMaster = false;
			boolean bTestSelf = false;

			switch (nDataAccCtrlMode) {
			case DEDataAccCtrlModes.SELF:
				bTestSelf = true;
				break;
			case DEDataAccCtrlModes.MASTER:
				bTestMaster = true;
				break;
			case DEDataAccCtrlModes.MASTER_SELF:
				bTestSelf = true;
				bTestMaster = true;
				break;
			default:
				throw new Exception(String.format("无法识别的数据访问控制模式[%1$s]", nDataAccCtrlMode));
			}

			if (bTestMaster) {
				Map<String, Map<Object, List<String>>> masterActionsMap = new LinkedHashMap<String, Map<Object, List<String>>>();
				for (IEntityDTO iEntityDTO : iEntityDTOList) {
					IPSDERBase iPSDERBase = this.getDataEntityRuntime().getMasterPSDER(iEntityDTO, true);
					if (iPSDERBase instanceof IPSDER1NBase) {
						IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) iPSDERBase;
						for (String strAccessAction : dataAccessActionList) {
							IPSDEOPPriv iPSDEOPPriv = this.getPSDEOPPriv(this.getSystemRuntime().getDataEntityRuntime(iPSDER1NBase.getMajorPSDataEntityMust().getId()), strAccessAction, true);
							if (iPSDEOPPriv != null) {
								// 进行判断
								Object parentKey = this.getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDER1NBase.getPickupPSDEFieldMust());
								if (parentKey != null) {
									Map<Object, List<String>> map = masterActionsMap.get(iPSDER1NBase.getMajorPSDataEntityMust().getId());
									if (map == null) {
										map = new LinkedHashMap<Object, List<String>>();
										masterActionsMap.put(iPSDER1NBase.getMajorPSDataEntityMust().getId(), map);
									}

									List<String> list = map.get(parentKey);
									if (list == null) {
										list = new ArrayList<String>();
										map.put(parentKey, list);
									}

									if (!list.contains(iPSDEOPPriv.getMapPSDEOPPrivName())) {
										list.add(iPSDEOPPriv.getMapPSDEOPPrivName());
									}

									continue;
								}
							}

							if (!bTestSelf) {
								Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
								if (!ObjectUtils.isEmpty(key)) {
									Map<String, Boolean> map = entityAccessActionMap.get(key);
									if (map != null) {
										map.put(strAccessAction, false);
									}
								}
							}
						}
					}
				}

				//
				for (java.util.Map.Entry<String, Map<Object, List<String>>> entry : masterActionsMap.entrySet()) {
					IDataEntityRuntime masterDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(entry.getKey());
					ISearchContextDTO iSearchContextDTO = masterDataEntityRuntime.createSearchContext();
					iSearchContextDTO.all().count(false);
					iSearchContextDTO.in(masterDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), entry.getValue().keySet());
					List<IEntityDTO> masterEntityDTOList = masterDataEntityRuntime.selectDataQuery(masterDataEntityRuntime.getSimplePSDEDataQuery(), iSearchContextDTO);
					Set<String> actions = new LinkedHashSet<String>();
					for (List<String> list : entry.getValue().values()) {
						actions.addAll(list);
					}

					((IDataEntityAccessManager) masterDataEntityRuntime.getDataEntityAccessManager()).fillDataAccessActions(iEmployeeContext, masterEntityDTOList, StringUtils.collectionToDelimitedString(actions, ","), strFieldName);
					for (IEntityDTO masterEntityDTO : masterEntityDTOList) {
						Map<String, Boolean> masterOPPrivMap = new HashMap<String, Boolean>();
						String strMasterDataAccessActions = masterEntityDTO.getString(strFieldName, null);
						if (StringUtils.hasLength(strMasterDataAccessActions)) {
							String[] items = strMasterDataAccessActions.split("[,]");
							for (String item : items) {
								String[] items2 = item.split("[:]");
								if (items2.length != 2) {
									continue;
								}
								masterOPPrivMap.put(items2[0], "1".equals(items2[1]));
							}
						}
						Object parentKey = masterEntityDTO.get(masterDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
						// 重新循环成员数据
						for (IEntityDTO iEntityDTO : iEntityDTOList) {
							IPSDERBase iPSDERBase = this.getDataEntityRuntime().getMasterPSDER(iEntityDTO, true);
							if (iPSDERBase instanceof IPSDER1NBase) {
								IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) iPSDERBase;
								//判断父是否一致
								if(!iPSDER1NBase.getMajorPSDataEntityMust().getId().equals(entry.getKey())) {
									continue;
								}
								Object parentKey2 = this.getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDER1NBase.getPickupPSDEFieldMust());
								if (parentKey.equals(parentKey2)) {
									for (String strAccessAction : dataAccessActionList) {
										IPSDEOPPriv iPSDEOPPriv = this.getPSDEOPPriv(masterDataEntityRuntime, strAccessAction, true);
										if (iPSDEOPPriv != null) {
											Boolean bRet = masterOPPrivMap.get(iPSDEOPPriv.getMapPSDEOPPrivName());
											if (bRet == null) {
												continue;
											}
											Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
											if (!ObjectUtils.isEmpty(key)) {
												Map<String, Boolean> map = entityAccessActionMap.get(key);
												if (map != null) {
													map.put(strAccessAction, bRet);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

			if (bTestSelf) {
				for (IEntityDTO iEntityDTO : iEntityDTOList) {
					for (String strAccessAction : dataAccessActionList) {
						IPSDEOPPriv iPSDEOPPriv = this.getPSDEOPPriv(null, strAccessAction);
						if (iPSDEOPPriv != null && StringUtils.hasLength(iPSDEOPPriv.getMapSysUniResCode())) {
							Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
							if (ObjectUtils.isEmpty(key)) {
								continue;
							}
							Map<String, Boolean> map = entityAccessActionMap.get(key);
							if (map == null || map.get(strAccessAction) != null) {
								continue;
							}
							map.put(strAccessAction, this.getSystemAccessManager().testSysUniRes(iEmployeeContext, iPSDEOPPriv.getMapSysUniResCode(), iEntityDTO));
						}
					}
				}

				for (String strAccessAction : dataAccessActionList) {
					List<IPSDEUserRole> psUserRoleList = getPSDEUserRoles(iEmployeeContext, strAccessAction);
					if (!ObjectUtils.isEmpty(psUserRoleList)) {
						
						ISearchContextDTO context = this.getDataEntityRuntime().createSearchContext();
						context.all();
						context.count(false);

						this.getDataEntityRuntime().setSearchCondition(context, this.getDataEntityRuntime().getKeyPSDEField(), Conditions.IN, entityAccessActionMap.keySet());

						addAuthorityConditions(context, iEmployeeContext, strAccessAction);
						List<IEntityDTO> list = this.getDataEntityRuntime().selectDataQuery(this.getDataEntityRuntime().getSimplePSDEDataQuery(), context);

						for (Object key : entityAccessActionMap.keySet()) {
							Map<String, Boolean> map = entityAccessActionMap.get(key);
							if (map == null || map.get(strAccessAction) != null) {
								continue;
							}
							map.put(strAccessAction, false);
						}

						if (!ObjectUtils.isEmpty(list)) {
							for (IEntityDTO iEntityDTO : list) {
								Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
								if (ObjectUtils.isEmpty(key)) {
									continue;
								}
								Map<String, Boolean> map = entityAccessActionMap.get(key);
								if (map == null) {
									continue;
								}
								map.put(strAccessAction, true);
							}
						}
					} else {
						for (Object key : entityAccessActionMap.keySet()) {
							Map<String, Boolean> map = entityAccessActionMap.get(key);
							if (map == null || map.get(strAccessAction) != null) {
								continue;
							}
							map.put(strAccessAction, null);
						}
					}
				}
			}
			
			for (IEntityDTO iEntityDTO : iEntityDTOList) {
				Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
				if (ObjectUtils.isEmpty(key)) {
					continue;
				}

				if (iEntityDTO.contains(strFieldName)) {
					continue;
				}

				Map<String, Boolean> map = entityAccessActionMap.get(key);

				Map<String, Object> map2 = new LinkedHashMap<String, Object>();
				for (java.util.Map.Entry<String, Boolean> entry : map.entrySet()) {
					if (entry.getValue() == null || entry.getValue()) {
						map2.put(entry.getKey(), true);
					}
				}
				if (map2.size() > 0) {
					this.getDataEntityRuntime().fillDataAccessActions(iEntityDTO, map2);
					for (java.util.Map.Entry<String, Object> entry : map2.entrySet()) {
						boolean bRet = false;
						if (entry.getValue() instanceof Boolean) {
							bRet = (Boolean) entry.getValue();
						}
						map.put(entry.getKey(), bRet);
					}
				}

				StringBuilder sb = new StringBuilder();
				boolean bFirst = true;
				for (java.util.Map.Entry<String, Boolean> entry : map.entrySet()) {
					if (bFirst) {
						bFirst = false;
					} else {
						sb.append(",");
					}
					sb.append(String.format("%1$s:%2$s", entry.getKey(), (entry.getValue() != null && entry.getValue()) ? 1 : 0));
				}
				iEntityDTO.set(strFieldName, sb.toString());
			}
		}

	}
	
	@Override
	public void removeUnauthorizedFields(IEmployeeContext iEmployeeContext, List<IEntityDTO> entityDTOList) throws Exception {
		
	}
}
