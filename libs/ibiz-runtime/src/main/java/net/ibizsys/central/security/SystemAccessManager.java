package net.ibizsys.central.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.security.DataEntityAccessManager;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.SysUserRoleDefaultModes;
import net.ibizsys.runtime.util.IEntity;

public class SystemAccessManager implements ISystemAccessManager{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemAccessManager.class);
	
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private Map<String, IPSSysDEOPPriv> psSysDEOPPrivMap = new HashMap<String, IPSSysDEOPPriv>();
	
	private List<ISysUserRoleRuntime> defaultSysUserRoleRuntimeList = new ArrayList<ISysUserRoleRuntime>();
	private List<ISysUserRoleRuntime> adminSysUserRoleRuntimeList = new ArrayList<ISysUserRoleRuntime>();
	private List<ISysUserRoleRuntime> testSysUserRoleRuntimeList = new ArrayList<ISysUserRoleRuntime>();
	private Map<String, ISysUserRoleRuntime> sysUserRoleRuntimeMap = new HashMap<String, ISysUserRoleRuntime>();
	
	private Map<String, ISysUniResRuntime> sysUniResRuntimeMap = new ConcurrentHashMap<String, ISysUniResRuntime>();
	
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	
//	private ISysUserRoleRuntime accessUserSysUserRoleRuntime = null;
//	private ISysUserRoleRuntime accessAdminSysUserRoleRuntime = null;
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext) throws Exception {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.onInit();
	}
	
	protected void onInit()  throws Exception {
		
//		List<IPSSysUniRes> psSysUniRess = this.getSystemRuntimeContext().getSystemRuntime().getPSSystem().getAllPSSysUniReses();
//		if(psSysUniRess != null) {
//			for(IPSSysUniRes iPSSysUniRes:psSysUniRess) {
//				ISysUniResRuntime iSysUniResRuntime = this.createSysUniResRuntime(iPSSysUniRes);
//				iSysUniResRuntime.init(this.iSystemRuntimeContext, this, iPSSysUniRes);
//				this.registerSysUniResRuntime(iSysUniResRuntime);
//			}
//		}
//		
		
		
//		List<IPSSysUserRole> psSysUserRoles = this.getSystemRuntimeContext().getSystemRuntime().getPSSystem().getAllPSSysUserRoles();
//		if(psSysUserRoles != null) {
//			for(IPSSysUserRole iPSSysUserRole:psSysUserRoles) {
//				ISysUserRoleRuntime iSysUserRoleRuntime = this.createSysUserRoleRuntime(iPSSysUserRole);
//				iSysUserRoleRuntime.init(this.iSystemRuntimeContext, this, iPSSysUserRole);
//				this.registerSysUserRoleRuntime(iSysUserRoleRuntime);
//			}
//		}
		
		reloadAll();
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		return this.getSysCacheUtilRuntime(false);
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) {
		if(this.iSysCacheUtilRuntime != null || bTryMode) {
			return this.iSysCacheUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), "未指定系统缓存功能组件");
	}
	
	protected void setSysCacheUtilRuntime(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
		this.iSysCacheUtilRuntime = iSysCacheUtilRuntime;
	}
	
	protected void prepareSysCacheUtilRuntime() throws Exception {
		this.setSysCacheUtilRuntime(this.getSystemRuntime().getSysCacheUtilRuntime(true));
	}
	
	
	public void reloadAll() throws Exception{
		reloadSysDEOPPrivs();
		reloadSysUniResRuntimes();
		reloadSysUserRoleRuntimes();
	}
	
	public void reloadSysDEOPPrivs() throws Exception{
		this.psSysDEOPPrivMap.clear();
		this.onReloadSysDEOPPrivs();
	}
	
	protected void onReloadSysDEOPPrivs() throws Exception{
		
		Map<String, IPSSysDEOPPriv> psSysDEOPPrivMap = new HashMap<String, IPSSysDEOPPriv>();

		java.util.List<IPSSysDEOPPriv> psSysDEOPPrivList = this.getSystemRuntime().getPSSystem().getAllPSDEOPPrivs();
		if (psSysDEOPPrivList != null) {
			for (IPSSysDEOPPriv iPSSysDEOPPriv : psSysDEOPPrivList) {
				if (StringUtils.hasLength(iPSSysDEOPPriv.getMapPSDEName())) {
					String strKey = String.format("%1$s|%2$s", iPSSysDEOPPriv.getMapPSDEName(), iPSSysDEOPPriv.getName());
					psSysDEOPPrivMap.put(strKey, iPSSysDEOPPriv);
				} else {
					psSysDEOPPrivMap.put(iPSSysDEOPPriv.getName(), iPSSysDEOPPriv);
				}
			}
		}
		this.psSysDEOPPrivMap.putAll(psSysDEOPPrivMap);
	}

	 
	
	public void reloadSysUserRoleRuntimes() throws Exception{
		this.defaultSysUserRoleRuntimeList.clear();
		this.adminSysUserRoleRuntimeList.clear();
		this.testSysUserRoleRuntimeList.clear();
		this.sysUserRoleRuntimeMap.clear();
		
		this.onReloadSysUserRoleRuntimes();
	}
	
	protected void onReloadSysUserRoleRuntimes() throws Exception{
		List<IPSSysUserRole> psSysUserRoles = this.getSystemRuntimeContext().getSystemRuntime().getPSSystem().getAllPSSysUserRoles();
		if(psSysUserRoles != null) {
			for(IPSSysUserRole iPSSysUserRole:psSysUserRoles) {
				ISysUserRoleRuntime iSysUserRoleRuntime = this.createSysUserRoleRuntime(iPSSysUserRole);
				iSysUserRoleRuntime.init(this.iSystemRuntimeContext, this, iPSSysUserRole);
				this.registerSysUserRoleRuntime(iSysUserRoleRuntime);
			}
		}
	}
	
	public void reloadSysUniResRuntimes() throws Exception{
		this.sysUniResRuntimeMap.clear();
		
		this.onReloadSysUniResRuntimes();
	}
	
	protected void onReloadSysUniResRuntimes() throws Exception{
		List<IPSSysUniRes> psSysUniRess = this.getSystemRuntimeContext().getSystemRuntime().getPSSystem().getAllPSSysUniReses();
		if(psSysUniRess != null) {
			for(IPSSysUniRes iPSSysUniRes:psSysUniRess) {
				ISysUniResRuntime iSysUniResRuntime = this.createSysUniResRuntime(iPSSysUniRes);
				iSysUniResRuntime.init(this.iSystemRuntimeContext, this, iPSSysUniRes);
				this.registerSysUniResRuntime(iSysUniResRuntime);
			}
		}
	}
	
	
	protected void registerSysUserRoleRuntime(ISysUserRoleRuntime iSysUserRoleRuntime) {
		if(StringUtils.hasLength(iSysUserRoleRuntime.getRoleTag())) {
			sysUserRoleRuntimeMap.put(iSysUserRoleRuntime.getRoleTag().toUpperCase(), iSysUserRoleRuntime);
		}
		
		
		if(SysUserRoleDefaultModes.ACCESSUSER.equals(iSysUserRoleRuntime.getDefaultUser())) {
			this.defaultSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
			return;
		}
		
		if(SysUserRoleDefaultModes.USER.equals(iSysUserRoleRuntime.getDefaultUser())) {
			this.defaultSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
			return;
		}
		
		if(SysUserRoleDefaultModes.ACCESSADMIN.equals(iSysUserRoleRuntime.getDefaultUser())) {
			this.adminSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
			return;
		}
		
		if(SysUserRoleDefaultModes.ADMIN.equals(iSysUserRoleRuntime.getDefaultUser())) {
			this.adminSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
			return;
		}
		
		if(iSysUserRoleRuntime.isEnableTestUser()) {
			this.testSysUserRoleRuntimeList.add(iSysUserRoleRuntime);
		}
	}
	
	protected void registerSysUniResRuntime(ISysUniResRuntime iSysUniResRuntime) {
		sysUniResRuntimeMap.put(iSysUniResRuntime.getResCode(), iSysUniResRuntime);
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	
	@Override
	public IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
		return new DataEntityAccessManager();
	}

	protected ISysUserRoleRuntime createSysUserRoleRuntime(IPSSysUserRole iPSSysUserRole) {
		return new SysUserRoleRuntime();
	}
	
	protected ISysUniResRuntime createSysUniResRuntime(IPSSysUniRes iPSSysUniRes) {
		return new SysUniResRuntime();
	}
	
	
	@Override
	public List<ISysUserRoleRuntime> getSysUserRoleRuntimes(IUserContext iUserContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean testSysUniRes(IUserContext iUserContext, String strSysUniRes) throws Exception {
		return testSysUniRes(iUserContext, strSysUniRes, null);
	}
	

	@Override
	public boolean testSysUniRes(IUserContext iUserContext, String strSysUniRes, IEntity iEntity) throws Exception {
		List<ISysUserRoleRuntime> sysUserRoleRuntimeList = getSysUserRoleRuntimes(iUserContext);
		if(sysUserRoleRuntimeList != null) {
			for(ISysUserRoleRuntime iSysUserRoleRuntime : sysUserRoleRuntimeList) {
				Boolean bRet = iSysUserRoleRuntime.testSysUniRes(iUserContext, strSysUniRes, iEntity);
				if(bRet != null && bRet) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	protected IPSSysDEOPPriv getPSysDEOPPriv(String strAccessAction) {
		return psSysDEOPPrivMap.get(strAccessAction);
	}
	
	@Override
	public IPSSysDEOPPriv getPSSysDEOPPriv(String strAccessAction, boolean bTryMode) {
		IPSSysDEOPPriv iPSSysDEOPPriv = psSysDEOPPrivMap.get(strAccessAction);
		if(iPSSysDEOPPriv != null || bTryMode) {
			return iPSSysDEOPPriv;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定系统实体操作标识对象[%1$s]", strAccessAction));
	}
	
	@Override
	public ISysUniResRuntime getSysUniResRuntime(String strUniResCode, boolean bTryMode) {
		ISysUniResRuntime iSysUniResRuntime = this.sysUniResRuntimeMap.get(strUniResCode);
		if(iSysUniResRuntime != null || bTryMode) {
			return iSysUniResRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定系统统一标识对象[%1$s]", strUniResCode));
	}

	@Override
	public List<ISysUserRoleRuntime> getUserSysUserRoleRuntimes() {
		return this.defaultSysUserRoleRuntimeList;
	}

	@Override
	public List<ISysUserRoleRuntime> getAdminSysUserRoleRuntimes() {
		return this.adminSysUserRoleRuntimeList;
	}

	@Override
	public List<ISysUserRoleRuntime> getTestSysUserRoleRuntimes() {
		return this.testSysUserRoleRuntimeList;
	}

	@Override
	public ISysUserRoleRuntime getSysUserRoleRuntime(String strRoleTag, boolean bTryMode) {
		ISysUserRoleRuntime iSysUserRoleRuntime = this.sysUserRoleRuntimeMap.get(strRoleTag.toUpperCase());
		if(iSysUserRoleRuntime != null || bTryMode) {
			return iSysUserRoleRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime(), String.format("无法获取指定系统角色对象[%1$s]", strRoleTag));
	}
	

}
