package net.ibizsys.central.cloud.core.wf;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.wf.IPSWFDEDataSetRole;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体数据集工作流角色运行时对象
 * 
 * @author lionlau
 *
 */
public class WFDEDataSetRoleRuntime extends WFRoleRuntimeBase implements IWFRoleRuntime {

	private static final Log log = LogFactory.getLog(WFDEDataSetRoleRuntime.class);
	
	private IPSWFDEDataSetRole iPSWFDEDataSetRole = null;
	private IPSDataEntity iPSDataEntity = null;
	private IPSDEDataSet iPSDEDataSet = null;
	private IPSDEField iWFUserIdDEF = null;
	private IPSDEField iWFUserNameDEF = null;

	@Override
	protected void onInit() throws Exception {
		if (!(this.getPSWFRole() instanceof IPSWFDEDataSetRole)) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("流程角色[%1$s]类型不正确", this.getPSWFRole().getName()));
		}
		iPSWFDEDataSetRole = (IPSWFDEDataSetRole) this.getPSWFRole();
		iPSDataEntity = iPSWFDEDataSetRole.getPSDataEntityMust();
		iPSDEDataSet = iPSWFDEDataSetRole.getPSDEDataSetMust();
		iWFUserIdDEF = iPSWFDEDataSetRole.getWFUserIdPSDEFMust();
		iWFUserNameDEF = iPSWFDEDataSetRole.getWFUserNamePSDEFMust();
		super.onInit();
	}
	
	protected IPSWFDEDataSetRole getPSWFDEDataSetRole() {
		return iPSWFDEDataSetRole;
	}

	protected void setPSWFDEDataSetRole(IPSWFDEDataSetRole iPSWFDEDataSetRole) {
		this.iPSWFDEDataSetRole = iPSWFDEDataSetRole;
	}

	protected IPSDataEntity getPSDataEntity() {
		return iPSDataEntity;
	}

	protected void setPSDataEntity(IPSDataEntity iPSDataEntity) {
		this.iPSDataEntity = iPSDataEntity;
	}

	protected IPSDEDataSet getPSDEDataSet() {
		return iPSDEDataSet;
	}

	protected void setPSDEDataSet(IPSDEDataSet iPSDEDataSet) {
		this.iPSDEDataSet = iPSDEDataSet;
	}

	protected IPSDEField getWFUserIdDEF() {
		return iWFUserIdDEF;
	}

	protected void setWFUserIdDEF(IPSDEField iWFUserIdDEF) {
		this.iWFUserIdDEF = iWFUserIdDEF;
	}

	protected IPSDEField getWFUserNameDEF() {
		return iWFUserNameDEF;
	}

	protected void setWFUserNameDEF(IPSDEField iWFUserNameDEF) {
		this.iWFUserNameDEF = iWFUserNameDEF;
	}




	@Override
	protected List<WFMember> onGetWFMembers(IEntity iEntity) throws Throwable {
		List<WFMember> emps = new ArrayList<>();
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
		ISearchContextDTO searchContext = iDataEntityRuntime.createSearchContext();
		if (iEntity != null && iEntity.any() != null) {
			searchContext.any().putAll(iEntity.any());
		}
		
		searchContext.all();
		
		Page result = (Page) iDataEntityRuntime.fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, new Object[] { searchContext });
		if (!ObjectUtils.isEmpty(result.getContent())) {
			for (Object obj : result.getContent()) {
				if (obj instanceof EntityDTO) {
					EntityDTO data = (EntityDTO) obj;
					Object userIdObj = data.get(iWFUserIdDEF.getName());
					Object userNameObj = data.get(iWFUserNameDEF.getName());
					if (userIdObj == null)
						continue;
					WFMember emp = new WFMember();
					emp.setUserId(String.valueOf(userIdObj));
					if (userNameObj != null) {
						emp.setPersonName(String.valueOf(userNameObj));
					}
					emps.add(emp);
				}
			}
		}
		
		return emps;
	}
}
