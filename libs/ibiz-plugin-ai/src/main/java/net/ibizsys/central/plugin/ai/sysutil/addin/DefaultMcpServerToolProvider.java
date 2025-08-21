package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSSysDEGroup;

public class DefaultMcpServerToolProvider extends DEMcpServerToolProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultMcpServerToolProvider.class);
	
	private List<IPSDataEntity> psDataEntityList = null;
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	protected List<IPSDataEntity> getPSDataEntities() {
		if(this.psDataEntityList == null) {
			List<IPSDataEntity> list = new ArrayList<IPSDataEntity>();
			IPSSysDEGroup iPSSysDEGroup = this.getContext().getSysMcpServerUtilRuntime().getPSModelObject().getPSSysDEGroup();
			if(iPSSysDEGroup != null && !ObjectUtils.isEmpty(iPSSysDEGroup.getPSDEGroupDetails())) {
				for(IPSDEGroupDetail iPSDEGroupDetail : iPSSysDEGroup.getPSDEGroupDetails()) {
					list.add(iPSDEGroupDetail.getPSDataEntityMust());
				}
			}
			this.psDataEntityList = Collections.unmodifiableList(list);
		}
		
		return this.psDataEntityList;
	}
}
