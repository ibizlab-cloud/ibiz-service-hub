package cn.ibizlab.central.plugin.odoo.security;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.ResGroupsDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.UniresGroupRelDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.security.OdooDataEntityAccessManager;
import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ibizlab.central.plugin.odoo.dataentity.service.IResGroupsService;
import cn.ibizlab.central.plugin.odoo.dataentity.service.IResUsersService;
import net.ibizsys.central.cloud.core.security.SystemAccessManager;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OdooSystemAccessManager extends SystemAccessManager {

	private static final Log log = LogFactory.getLog(OdooSystemAccessManager.class);

	@Autowired
	IResUsersService iResUsersService;


	@Autowired
	IResGroupsService iResGroupsService;



	@Override
	protected void onInit() throws Exception {
		// TODO Auto-generated method stub
		super.onInit();
	}

	@Override
	public IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime) {
		return new OdooDataEntityAccessManager();
	}

	@Override
	protected void onFillAppData(AppData appData) throws Throwable {
		super.onFillAppData(appData);
		//接管uniRes输出
		List resGroups = new ArrayList<>();
		Set<String> uniRes = new HashSet();
		appData.set("unires", uniRes);
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrent();
		List cacheResGroups = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()),"odoodeaccess", List.class);
		if(cacheResGroups == null) {
			ISearchContextDTO searchContextDTO = iResGroupsService.createSearchContextDTO();
			searchContextDTO.nestedfields(true).all().count(false);
			Object resGroupsPage =iResGroupsService.fetchDataSet("cur_user_ref", null, new Object[]{searchContextDTO});
			if (resGroupsPage != null && resGroupsPage instanceof Page) {
				resGroups.addAll(((Page<?>) resGroupsPage).getContent());
			}
			this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), "odoodeaccess", resGroups);
		}else {
			cacheResGroups.forEach(cacheResGroup -> {
				ResGroupsDTO resGroupsDTO = (ResGroupsDTO) iResGroupsService.createEntityDTO();
				try {
					resGroupsDTO.reload(cacheResGroup, true);
				} catch (Exception e) {
					log.error(String.format("缓存权限组读取失败：%1$s", e.getMessage()));
				}
				resGroups.add(resGroupsDTO);
			});

		}

		resGroups.forEach(item -> {
			ResGroupsDTO resGroupsDTO = (ResGroupsDTO) item;
			if (!ObjectUtils.isEmpty(resGroupsDTO.getUniresGroupRels())) {
				resGroupsDTO.getUniresGroupRels().forEach(ruleGroupRelDTO -> {
					if(ruleGroupRelDTO.getResCode()!=null) {
						uniRes.add(ruleGroupRelDTO.getResCode());
					}
				});
			}
		});
	}

	@Override
	public boolean testSysUniRes(IUserContext iUserContext, String strSysUniRes, IEntity iEntity) throws Exception {
		if (testSuperuser(iUserContext))
			return true;
		List resGroups = new ArrayList<>();
		IAuthenticationUser iAuthenticationUser = AuthenticationUser.getCurrent();
		List cacheResGroups = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()),"odoodeaccess", List.class);
		if(cacheResGroups == null) {
			try {
				ISearchContextDTO searchContextDTO = iResGroupsService.createSearchContextDTO();
				searchContextDTO.nestedfields(true).all().count(false);
				Object resGroupsPage =iResGroupsService.fetchDataSet("cur_user_ref", null, new Object[]{searchContextDTO});
				if (resGroupsPage != null && resGroupsPage instanceof Page) {
					resGroups.addAll(((Page<?>) resGroupsPage).getContent());
				}
				this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()), "odoodeaccess", resGroups);
			}catch(Throwable e){
				log.error(String.format("获取权限组失败：%1$s", e.getMessage()));
			}
		}else {
			cacheResGroups.forEach(cacheResGroup -> {
				ResGroupsDTO resGroupsDTO = iResGroupsService.createEntityDTO();
				try {
					resGroupsDTO.reload(cacheResGroup, true);
				} catch (Exception e) {
					log.error(String.format("缓存权限组读取失败：%1$s", e.getMessage()));
				}
				resGroups.add(resGroupsDTO);
			});

		}
		for (Object item : resGroups) {
			ResGroupsDTO resGroupsDTO = (ResGroupsDTO) item;
			if (!ObjectUtils.isEmpty(resGroupsDTO.getUniresGroupRels())) {
				for (Object uniresGroupRel : resGroupsDTO.getUniresGroupRels()) {
					UniresGroupRelDTO uniresGroupRelDTO = (UniresGroupRelDTO) uniresGroupRel;
					if (uniresGroupRelDTO.getResCode()!=null) {
						if(strSysUniRes.equals(uniresGroupRelDTO.getResCode())){
							return true;
						}
					}
				}
			}
		}
		return super.testSysUniRes(iUserContext, strSysUniRes, iEntity);
	}
}
