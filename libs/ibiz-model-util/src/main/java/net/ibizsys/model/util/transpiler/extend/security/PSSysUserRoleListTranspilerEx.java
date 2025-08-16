package net.ibizsys.model.util.transpiler.extend.security;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.model.security.IPSSysUserRoleData;
import net.ibizsys.model.security.IPSSysUserRoleRes;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSSysUserRole;
import net.ibizsys.psmodel.core.domain.PSSysUserRoleData;
import net.ibizsys.psmodel.core.domain.PSSysUserRoleRes;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSSysUserRoleListTranspilerEx extends net.ibizsys.model.util.transpiler.security.PSSysUserRoleListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			PSSysUserRole psSysUserRole = (PSSysUserRole)domain;
			IPSSysUserRole iPSSysUserRole = (IPSSysUserRole)iPSModelObject;
			if(iPSSysUserRole.getPSSysUserRoleReses()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSSysUserRoleRes.class, false).decompile(iPSModelTranspileContext, iPSSysUserRole.getPSSysUserRoleReses(), psSysUserRole.getPSSysUserRoleResesIf(), bFullMode);
				int nOrder = 100;
				for(PSSysUserRoleRes child : psSysUserRole.getPSSysUserRoleResesIf()) {
					child.setPSSysUserRoleId(iPSSysUserRole.getId());
					child.setPSSysUserRoleName(iPSSysUserRole.getName());
					//child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
			
			if(iPSSysUserRole.getPSSysUserRoleDatas()!=null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSSysUserRoleData.class, false).decompile(iPSModelTranspileContext, iPSSysUserRole.getPSSysUserRoleDatas(), psSysUserRole.getPSSysUserRoleDatasIf(), bFullMode);
				int nOrder = 100;
				for(PSSysUserRoleData child : psSysUserRole.getPSSysUserRoleDatasIf()) {
					child.setPSSysUserRoleId(iPSSysUserRole.getId());
					child.setPSSysUserRoleName(iPSSysUserRole.getName());
					//child.setOrderValue(nOrder);
					nOrder += 100;
				}
			}
		}
	}
	
}