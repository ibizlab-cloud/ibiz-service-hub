package net.ibizsys.central.cloud.open.ebsx.cloudutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.OpenDept;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.addin.IOpenAccessAgent;
import net.ibizsys.central.cloud.open.core.cloudutil.CloudOpenUtilRuntimeBase;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenAccessDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenDeptDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenUserDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenDeptService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IOpenUserService;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict.OpenAccessType;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;

public class EBSXCloudOpenUtilRuntime extends CloudOpenUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudOpenUtilRuntime.class);
	
	@Override
	protected void onSyncOrganizationUnits(String strOpenAccessId) throws Throwable {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		
		String strOpenType = iOpenAccessAgent.getOpenType().toLowerCase();
		//获取默认的开放应用
		String strDefaultAccessId = KeyValueUtils.genUniqueId(iEmployeeContext.getTenant(), strOpenType.toUpperCase());
		OpenAccessDTO openAccessDTO = EBSXSystemRuntime.getInstance().getOpenAccessService().get(strDefaultAccessId, true);
		if(openAccessDTO == null) {
			openAccessDTO = new OpenAccessDTO();
			//iOpenAccessAgent.getAgentData().copyTo(openAccessDTO);
			openAccessDTO.setId(strDefaultAccessId);
			openAccessDTO.setName(String.format("默认应用[%1$s]", OpenAccessType.valueOf(strOpenType.toUpperCase()).getText()));
			openAccessDTO.setOpenType(iOpenAccessAgent.getOpenType().toLowerCase());
			openAccessDTO.setDefaultflag(EntityBase.BOOLEAN_TRUE);
			EBSXSystemRuntime.getInstance().getOpenAccessService().create(openAccessDTO);
		}
		
		//构建部门
		Collection<OpenDept> openDepts = iOpenAccessAgent.selectOpenDepts(new SearchContextDTO());
		if(!ObjectUtils.isEmpty(openDepts)) {
			
			//查出数据
			List<OpenDeptDTO> list = EBSXSystemRuntime.getInstance().getOpenDeptService().selectDefault(new SearchContextDTO().all().eq(IOpenDeptService.FIELD_OPEN_TYPE, strOpenType));
			Map<String, OpenDeptDTO> map = new HashMap<String, OpenDeptDTO>();
			if(!ObjectUtils.isEmpty(list)) {
				list.forEach( t -> {
					map.put(t.getRealId(), t);
				});
			}
			
			list = new ArrayList<OpenDeptDTO>();
			for(OpenDept openDept : openDepts) {
				OpenDeptDTO item = map.get(openDept.getRealId());
				if(item != null) {
					continue;
				}
				
				item = new OpenDeptDTO();
				item.reload(openDept, true);
//				item.setAccessId(openAccessDTO.getId());
//				item.setAccessName(openAccessDTO.getName());
				item.setOpenType(strOpenType);
				item.setOpenDeptId(KeyValueUtils.genUniqueId());
				item.setIsBinding(0);
				list.add(item);
				
				map.put(openDept.getRealId(), item);
			}
			
			if(!ObjectUtils.isEmpty(list)) {
				EBSXSystemRuntime.getInstance().getOpenDeptService().rawCreate(list, false);
			}
		}
		
		//构建用户
		Collection<OpenUser> openUsers = iOpenAccessAgent.selectOpenUsers(new SearchContextDTO());
		if(!ObjectUtils.isEmpty(openUsers)) {
			
			//查出数据
			List<OpenUserDTO> list = EBSXSystemRuntime.getInstance().getOpenUserService().selectDefault(new SearchContextDTO().all().eq(IOpenUserService.FIELD_OPEN_TYPE, strOpenType));
			Map<String, OpenUserDTO> map = new HashMap<String, OpenUserDTO>();
			if(!ObjectUtils.isEmpty(list)) {
				list.forEach( t -> {
					map.put(t.getUserId(), t);
				});
			}
			
			list = new ArrayList<OpenUserDTO>();
			for(OpenUser openUser : openUsers) {
				OpenUserDTO item = map.get(openUser.getUserId());
				if(item != null) {
					continue;
				}
				
				item = new OpenUserDTO();
				item.reload(openUser, true);
//				item.setAccessId(openAccessDTO.getId());
//				item.setAccessName(openAccessDTO.getName());
				item.setOpenType(strOpenType);
				item.setOpenUserId(KeyValueUtils.genUniqueId());
				item.setIsBinding(0);
				list.add(item);
				
				map.put(openUser.getUserId(), item);
			}
			
			if(!ObjectUtils.isEmpty(list)) {
				EBSXSystemRuntime.getInstance().getOpenUserService().rawCreate(list, false);
			}
		}
	}

	
	@Override
	protected OpenUser onGetOpenUserBySNSCode(String strOpenAccessId, String strCode) throws Throwable {
		OpenUser openUser = super.onGetOpenUserBySNSCode(strOpenAccessId, strCode);
		
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		searchContextDTO.eq(IOpenUserService.FIELD_OPEN_TYPE, iOpenAccessAgent.getOpenType() );
		
		if(StringUtils.hasLength( openUser.getRealId())) {
			searchContextDTO.eq(IOpenUserService.FIELD_REALID, openUser.getRealId());
		}
//		else {
//			searchContextDTO.nvl(IOpenUserService.FIELD_REALID);
//		}
	
		if(StringUtils.hasLength( openUser.getUserId())) {
			searchContextDTO.eq(IOpenUserService.FIELD_USERID, openUser.getUserId());
		}
		
		searchContextDTO.limit(1);
		
		//查出数据
		List<OpenUserDTO> list = EBSXSystemRuntime.getInstance().getOpenUserService().selectDefault(searchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			list.get(0).copyTo(openUser, true);
		}
		
		return openUser;
	}

	
	@Override
	protected OpenUser onGetOpenUserByAuthCode(String strOpenAccessId, String strCode) throws Throwable {
		OpenUser openUser = super.onGetOpenUserByAuthCode(strOpenAccessId, strCode);
		
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		
		IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
		searchContextDTO.eq(IOpenUserService.FIELD_OPEN_TYPE, iOpenAccessAgent.getOpenType() );
		//searchContextDTO.eq(IOpenUserService.FIELD_ACCESSID, strOpenAccessId);
//		if(StringUtils.hasLength( openUser.getRealId())) {
//			searchContextDTO.eq(IOpenUserService.FIELD_REALID, openUser.getRealId());
//		}
//		else {
//			searchContextDTO.nvl(IOpenUserService.FIELD_REALID);
//		}
		searchContextDTO.eq(IOpenUserService.FIELD_USERID, openUser.getUserId());
		
		
		searchContextDTO.limit(1);
		
		//查出数据
		List<OpenUserDTO> list = EBSXSystemRuntime.getInstance().getOpenUserService().selectDefault(searchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			list.get(0).copyTo(openUser, true);
		}
		
		return openUser;
	}
}
