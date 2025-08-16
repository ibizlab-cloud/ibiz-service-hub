package net.ibizsys.model.util.transpiler.extend.dataentity.priv;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEOPPrivRole;
import net.ibizsys.psmodel.core.domain.PSDEUserRole;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.DEOPPrivRoleType;

public class PSDEUserRoleListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.priv.PSDEUserRoleListTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		if(bFullMode) {
			IPSDEUserRole iPSDEUserRole = (IPSDEUserRole)iPSModelObject;
			PSDEUserRole psDEUserRole = (PSDEUserRole)domain;
			
			if(iPSDEUserRole.getPSDEUserRoleOPPrivs()!=null) {
			
				IPSDataEntity iPSDataEntity = iPSDEUserRole.getParentPSModelObject(IPSDataEntity.class, false);
				String strPSDEId = iPSModelTranspileContext.getPSModelUniqueTag(iPSDataEntity);
				
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEUserRoleOPPriv.class, false).decompile(iPSModelTranspileContext, iPSDEUserRole.getPSDEUserRoleOPPrivs(), psDEUserRole.getPSDEOPPrivRolesIf(), bFullMode);
				int nOrder = 100;
				for(PSDEOPPrivRole child : psDEUserRole.getPSDEOPPrivRolesIf()) {
					child.setPSDEUserRoleId(psDEUserRole.getId());
					child.setPSDEUserRoleName(psDEUserRole.getName());
					child.roletype(DEOPPrivRoleType.DEROLE);
					child.setPSDEId(strPSDEId);
					child.setPSDEName(iPSDataEntity.getName());
					
					nOrder += 100;
				}
			}
			
		}
	}

}

