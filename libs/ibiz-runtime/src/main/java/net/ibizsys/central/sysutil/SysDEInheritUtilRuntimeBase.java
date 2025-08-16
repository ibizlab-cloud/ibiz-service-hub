package net.ibizsys.central.sysutil;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.IDataEntityInheritLogic;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSDataEntity;

public abstract class SysDEInheritUtilRuntimeBase extends SysUtilRuntimeBase implements ISysDEInheritUtilRuntime, IDataEntityInheritLogic {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDEInheritUtilRuntimeBase.class);
	
	private Map<String, IPSDEGroupDetail> psDEGroupDetailMap = new LinkedHashMap<String, IPSDEGroupDetail>();

	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

	@Override
	protected void onInit() throws Exception {

		if(ObjectUtils.isEmpty(this.getPSDEGroupDetails())) {
			if (this.getPSSysUtil().getPSSysDEGroup() == null) {
				throw new Exception("未指定系统实体组模型对象");
			}
			
			List<IPSDEGroupDetail> psDEGroupDetailList = this.getPSSysUtil().getPSSysDEGroupMust().getPSDEGroupDetails();
			if(ObjectUtils.isEmpty(psDEGroupDetailList)) {
				throw new Exception("指定系统实体组未包含成员对象");
			}
			
			for(IPSDEGroupDetail psDEGroupDetail : psDEGroupDetailList) {
				this.psDEGroupDetailMap.put(psDEGroupDetail.getPSDataEntityMust().getId(), psDEGroupDetail);
			}
		}

		this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
		super.onInit();
	}
	
	protected Collection<IPSDEGroupDetail> getPSDEGroupDetails() {
		return this.psDEGroupDetailMap.values();
	}
	
	protected IPSDEGroupDetail getPSDEGroupDetail(String strPSDEId, boolean bTryMode) throws Exception {
		IPSDEGroupDetail iPSDEGroupDetail = this.psDEGroupDetailMap.get(strPSDEId);
		if(iPSDEGroupDetail != null || bTryMode) {
			return iPSDEGroupDetail;
		}
		throw new Exception(String.format("无法获取指定实体[%1$s]对应的实体组成员模型对象", strPSDEId));
	}
	
	protected IPSDEGroupDetail tryGetPSDEGroupDetail(String strPSDEId) {
		try {
			return this.getPSDEGroupDetail(strPSDEId, true);
		} catch (Exception ex) {
			log.error(ex);
			return null;
		}
	}

	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

		this.onRegisterDEMethodPluginRuntimes();
	}

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {
		Collection<IPSDEGroupDetail> psDEGroupDetailList = this.getPSDEGroupDetails();
		if(!ObjectUtils.isEmpty(psDEGroupDetailList)) {
			for(IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
				IPSDataEntity iPSDataEntity = iPSDEGroupDetail.getPSDataEntityMust();
				this.getDEMethodPluginRuntimeRepo().registerDataEntityInheritLogic(iPSDataEntity.getId(), this);
				continue;
			}
		}
	}
	

	@Override
	protected void onUninstall() throws Throwable {
		this.getDEMethodPluginRuntimeRepo().shutdown();
		super.onUninstall();
	}
}
