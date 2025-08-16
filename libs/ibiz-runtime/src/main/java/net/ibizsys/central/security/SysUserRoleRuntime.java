package net.ibizsys.central.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.SysUserRoleType;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.model.security.IPSSysUserRoleData;
import net.ibizsys.model.security.IPSSysUserRoleRes;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

public class SysUserRoleRuntime extends SystemModelRuntimeBase implements ISysUserRoleRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysUserRoleRuntime.class);
	
	private IPSSysUserRole iPSSysUserRole = null;
	private Map<String, ISysUniResRuntime> sysUniResRuntimeMap = null;
	private Map<String, List<IPSDEUserRole>> psDEUserRoleListMap = null;
	private ISystemAccessManager iSystemAccessManager = null;
	private boolean bEnableTestUser = false;
	private SysUserRoleType roleType = SysUserRoleType.CUSTOM;
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, ISystemAccessManager iSystemAccessManager, IPSSysUserRole iPSSysUserRole) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysUserRole = iPSSysUserRole;
		this.iSystemAccessManager = iSystemAccessManager;
		if(this.iSystemAccessManager == null) {
			this.iSystemAccessManager = this.getSystemRuntime().getSystemAccessManager();
		}
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		if(this.getPSSysUserRole() != null) {
			if(StringUtils.hasLength(this.getPSSysUserRole().getRoleType())) {
				this.roleType = SysUserRoleType.from(this.getPSSysUserRole().getRoleType());
			}
			
			if(SysUserRoleType.DEDATASET == this.getRoleType()) {
				if(this.getPSSysUserRole().getPSDataEntity()!= null
						&& this.getPSSysUserRole().getPSDEDataSet() != null
						&& this.getPSSysUserRole().getUserIdPSDEField() != null) {
					this.setEnableTestUser(true);
				}
				else {
					log.warn(String.format("角色[%1$s]设置动态数据集模式，但未提供相关的配置", this.getName()));
				}
			}
			
			
			this.sysUniResRuntimeMap = new HashMap<String, ISysUniResRuntime>();
			List<IPSSysUserRoleRes> psSysUserRoleResList = this.getPSSysUserRole().getPSSysUserRoleReses();
			if(psSysUserRoleResList != null) {
				for(IPSSysUserRoleRes iPSSysUserRoleRes : psSysUserRoleResList) {
					sysUniResRuntimeMap.put(iPSSysUserRoleRes.getSysUniResCode(), this.getSystemAccessManager().getSysUniResRuntime(iPSSysUserRoleRes.getSysUniResCode(), false));
				}
			}
			
			this.psDEUserRoleListMap = new HashMap<String, List<IPSDEUserRole>>();
			List<IPSSysUserRoleData> psSysUserRoleDataList = this.getPSSysUserRole().getPSSysUserRoleDatas();
			if(psSysUserRoleDataList != null) {
				for(IPSSysUserRoleData iPSSysUserRoleData : psSysUserRoleDataList) {
					List<IPSDEUserRole> list = psDEUserRoleListMap.get(iPSSysUserRoleData.getPSDataEntityMust().getId());
					if(list == null) {
						list = new ArrayList<IPSDEUserRole>();
						psDEUserRoleListMap.put(iPSSysUserRoleData.getPSDataEntityMust().getId(), list);
					}
					list.add(iPSSysUserRoleData.getPSDEUserRoleMust());
				}
			}
		}
		
		super.onInit();
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return getPSSysUserRole();
	}

	

	@Override
	public IPSSysUserRole getPSSysUserRole() {
		return this.iPSSysUserRole;
	}


	
	@Override
	public ISystemAccessManager getSystemAccessManager() {
		return this.iSystemAccessManager;
	}

	@Override
	public List<IPSDEUserRole> getPSDEUserRoles(String strDEId) {
		if(this.psDEUserRoleListMap == null) {
			return null;
		}
		return this.psDEUserRoleListMap.get(strDEId);
	}

	@Override
	public Boolean testSysUniRes(IUserContext iUserContext, String strUniResCode) {
		return this.testSysUniRes(iUserContext, strUniResCode, null);
	}
	
	@Override
	public Boolean testSysUniRes(IUserContext iUserContext, String strUniResCode, IEntity iEntity) {
		if(this.sysUniResRuntimeMap != null) {
			ISysUniResRuntime iSysUniResRuntime = this.sysUniResRuntimeMap.get(strUniResCode);
			if(iSysUniResRuntime != null) {
				return iSysUniResRuntime.test(iUserContext, iEntity);
			}
		}
		return null;
	}

	@Override
	public String getDefaultUser() {
		return this.getPSSysUserRole().getDefaultUser();
	}
	

	@Override
	public boolean testUser(IUserContext iUserContext) {
		Assert.notNull(iUserContext, "传入用户上下文对象无效");
		if(!isEnableTestUser()) {
			return false;
		}
		try {
			return this.onTestUser(iUserContext);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("判断用户是否在角色中发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean onTestUser(IUserContext iUserContext) throws Throwable {
		if(SysUserRoleType.DEDATASET == this.getRoleType()) {
			ISearchContextDTO iSearchContextDTO = getDataEntityRuntime().createSearchContext();
			iSearchContextDTO.eq(this.getPSSysUserRole().getUserIdPSDEFieldMust().getLowerCaseName(), iUserContext.getUserid());
			return getDataEntityRuntime().existsData(this.getPSSysUserRole().getPSDEDataSetMust(), iSearchContextDTO);
		}
		return false;
	}
	
	protected IDataEntityRuntime getDataEntityRuntime() {
		if(this.iDataEntityRuntime == null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysUserRole().getPSDataEntityMust().getId());
		}
		return this.iDataEntityRuntime;
	}

	@Override
	public boolean isEnableTestUser() {
		return this.bEnableTestUser;
	}
	
	protected void setEnableTestUser(boolean bEnableTestUser) {
		this.bEnableTestUser = bEnableTestUser;
	}
	
	
	
	@Override
	public String getRoleTag() {
		return this.getPSSysUserRole().getRoleTag();
	}

	@Override
	public SysUserRoleType getRoleType() {
		return this.roleType;
	}

}
