package net.ibizsys.central.dataentity.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase2;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

public class DEUserRoleRuntime extends DataEntityModelRuntimeBase2 implements IDEUserRoleRuntime{

	private IPSDEUserRole iPSDEUserRole = null;
	private Map<String, List<IPSDEUserRoleOPPriv>> dataAccessActionMap = new HashMap<String, List<IPSDEUserRoleOPPriv>>();
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEUserRole iPSDEUserRole) throws Exception {
		this.setDataEntityRuntimeContext(iDataEntityRuntimeContext);
		this.iPSDEUserRole = iPSDEUserRole;
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		List<IPSDEUserRoleOPPriv> psDEUserRoleOPPrivList = this.getPSDEUserRole().getPSDEUserRoleOPPrivs();
		if(psDEUserRoleOPPrivList != null) {
			for(IPSDEUserRoleOPPriv iPSDEUserRoleOPPriv : psDEUserRoleOPPrivList) {
				List<IPSDEUserRoleOPPriv> list = dataAccessActionMap.get(iPSDEUserRoleOPPriv.getDataAccessAction());
				if(list == null) {
					list = new ArrayList<IPSDEUserRoleOPPriv>();
					dataAccessActionMap.put(iPSDEUserRoleOPPriv.getDataAccessAction(), list);
				}
				list.add(iPSDEUserRoleOPPriv);
			}
		}
		super.onInit();
	}
	
	@Override
	public IPSDEUserRole getPSDEUserRole() {
		return this.iPSDEUserRole;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEUserRole();
	}
	
	
	
	@Override
	public boolean containsDataAccessAction(String strDataAccessAction) {
		return this.dataAccessActionMap.containsKey(strDataAccessAction);
	}

	@Override
	public Boolean test(IUserContext iUserContext, String strDataAccessAction, IEntity iEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPSDEUserRoleOPPriv> getPSDEUserRoleOPPrivs(String strDataAccessAction) {
		return this.dataAccessActionMap.get(strDataAccessAction);
	}

	@Override
	public String getCustomCond() {
		return this.getPSDEUserRole().getCustomCond();
	}

	@Override
	public String getCustomDRMode() {
		return this.getPSDEUserRole().getCustomDRMode();
	}

	@Override
	public String getCustomDRMode2() {
		return this.getPSDEUserRole().getCustomDRMode2();
	}

	@Override
	public String getCustomDRMode2Param() {
		return this.getPSDEUserRole().getCustomDRMode2Param();
	}

	@Override
	public String getCustomDRModeParam() {
		return this.getPSDEUserRole().getCustomDRModeParam();
	}

	@Override
	public long getOrgDR() {
		return this.getPSDEUserRole().getOrgDR();
	}

	@Override
	public String getRoleTag() {
		return this.getPSDEUserRole().getRoleTag();
	}

	@Override
	public String getSecBC() {
		return this.getPSDEUserRole().getSecBC();
	}

	@Override
	public long getSecDR() {
		return this.getPSDEUserRole().getSecDR();
	}

	@Override
	public boolean isDefaultMode() {
		return this.getPSDEUserRole().isDefaultMode();
	}

	@Override
	public boolean isEnableOrgDR() {
		return this.getPSDEUserRole().isEnableOrgDR();
	}

	@Override
	public boolean isEnableSecBC() {
		return this.getPSDEUserRole().isEnableSecBC();
	}

	@Override
	public boolean isEnableSecDR() {
		return this.getPSDEUserRole().isEnableUserDR();
	}

	@Override
	public boolean isEnableUserDR() {
		return this.getPSDEUserRole().isEnableUserDR();
	}

	@Override
	public boolean isSystemReserved() {
		return this.getPSDEUserRole().isSystemReserved();
	}

	

}
