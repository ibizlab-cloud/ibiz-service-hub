package net.ibizsys.central.cloud.conf.core.spring.controller;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.conf.core.IConfUtilSystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudConfUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.UAAUniResAuthority;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.runtime.util.EntityBase;

@RestController()
@RequestMapping("")
public class ConfRestController {

	private static final Log log = LogFactory.getLog(ConfRestController.class);

	/**
	 * 统一资源：CLoud 配置分享
	 */
	public final static String UNIRES_CLOUD_CONF_CONFIG_SHARE = "UNIRES_CLOUD_CONF_CONFIG_SHARE";
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud配置服务已经启动"));
		iServiceHub.registerNamingService("ibizcloud-conf");
	}


	@Autowired(required=false)
	private ICloudConfUtilRuntime iCloudConfUtilRuntime = null;

	protected ICloudConfUtilRuntime getCloudConfUtilRuntime() {
		if (this.iCloudConfUtilRuntime == null) {
			try {
				this.iCloudConfUtilRuntime = iServiceHub.getCloudUtilRuntime(IConfUtilSystemRuntime.class, ICloudConfUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务配置功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务配置功能模块"), ex);
			}
		}
		return this.iCloudConfUtilRuntime;
	}
	
	public boolean testUniRes(IEmployeeContext iEmployeeContext, String strUniRes){
		if(iEmployeeContext.isSuperuser()){
			return true;
		}
		Collection<? extends GrantedAuthority> grantedAuthorities = iEmployeeContext.getAuthorities();
		if (!ObjectUtils.isEmpty(grantedAuthorities)) {
			for (GrantedAuthority grantedAuthority : grantedAuthorities) {
				if (grantedAuthority instanceof UAAUniResAuthority) {
					if (grantedAuthority.getAuthority() != null && grantedAuthority.getAuthority().equals(strUniRes))
						return true;
				}
			}
		}
		return false;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/configs/{configType}/{targetType}")
	public ResponseEntity<Boolean> saveConfig(@PathVariable("configType") String configType, @PathVariable("targetType") String targetType, @RequestBody(required=false) Object cfg, @RequestParam(name="share", required=false, defaultValue="false") String share, HttpServletResponse httpServletResponse) {
		if(!ObjectUtils.isEmpty(cfg)) {
			boolean bShare = share.equalsIgnoreCase("true");
			if(bShare) {
				if(AuthenticationUser.getCurrentMust().getApiuser() != EntityBase.BOOLEAN_TRUE && !testUniRes(EmployeeContext.getCurrentMust(), UNIRES_CLOUD_CONF_CONFIG_SHARE)) {
					httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
					return ResponseEntity.ok(false);
				}
			}
			this.getCloudConfUtilRuntime().saveConfig(configType, targetType, cfg, bShare);
		}
		else {
			this.getCloudConfUtilRuntime().removeConfig(configType, targetType);
		}
		
		return ResponseEntity.ok(true);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/configs/{configType}/{targetType}")
	public ResponseEntity<Object> getConfig(@PathVariable("configType") String configType, @PathVariable("targetType") String targetType, @RequestParam(name="share", required=false, defaultValue="true") String share) {
		boolean bTryGlobal = share.equalsIgnoreCase("true");
		Config config = this.getCloudConfUtilRuntime().getConfig(configType, targetType, true, bTryGlobal);
		if(config == null) {
			return ResponseEntity.ok(null);
		}
		return ResponseEntity.ok(config.getCfg());
	}

	@RequestMapping(method = RequestMethod.GET, value = "/configs/share/{id}")
	public ResponseEntity<Object> getShareConfig(@PathVariable("id") String id) {


		// JSONObject jo = ibzConfigService.getShareConfig(id);
		// if (jo == null) {
		// throw new BadRequestAlertException("无效的共享配置数据", "IBZConfig", id);
		// }
		// return ResponseEntity.ok(jo);
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/configs/share/{configType}/{targetType}")
	public ResponseEntity<String> shareConfig(@PathVariable("configType") String configType, @PathVariable("targetType") String targetType) {


		// String userId =
		// AuthenticationUser.getAuthenticationUser().getUserid();
		// if (StringUtils.isEmpty(userId)) {
		// throw new BadRequestAlertException("分享配置失败，参数缺失", "IBZConfig",
		// configType);
		// }
		// String id = IdWorker.get32UUID();
		// ibzConfigService.saveShareConfig(id, configType, targetType, userId);
		// return ResponseEntity.ok(id);
		return null;
	}
	
	
	
//	@RequestMapping(method = {RequestMethod.GET}, value = "/dictionarys/catalogs/{code}")
//    public ResponseEntity<Catalog> getCatalogs(@PathVariable("code") String code, DictOptionSearchContext context) {
//        Catalog catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getDictCatalog(code);
//        else
//            catalog = dictCoreService.getDictCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog);
//    }
//
//    @RequestMapping(method = {RequestMethod.GET}, value = "/dictionarys/catalogs/{code}/options")
//    public ResponseEntity<List<Option>> getOptions(@PathVariable("code") String code, DictOptionSearchContext context) {
//        Catalog catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getDictCatalog(code);
//        else
//            catalog = dictCoreService.getDictCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog.getOptions());
//    }
//
//
//
//    @RequestMapping(method = {RequestMethod.GET}, value = "/dictionarys/codelist/{code}")
//    public ResponseEntity<CodeList> getCodeList(@PathVariable("code") String code, DictOptionSearchContext context) {
//        CodeList catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getCodeListCatalog(code);
//        else
//            catalog = dictCoreService.getCodeListCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog);
//    }
//
//
//    @RequestMapping(method = {RequestMethod.GET}, value = "/dictionarys/codelist/{code}/items")
//    public ResponseEntity<List<CodeItem>> getCodeItems(@PathVariable("code") String code, DictOptionSearchContext context) {
//        CodeList catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getCodeListCatalog(code);
//        else
//            catalog = dictCoreService.getCodeListCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog.getOptions());
//    }
//
//
//    @RequestMapping(method = {RequestMethod.POST}, value = "/dictionarys/catalogs/{code}")
//    public ResponseEntity<Catalog> catalogs(@PathVariable("code") String code, @RequestBody(required = false) DictOptionSearchContext context) {
//        Catalog catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getDictCatalog(code);
//        else
//            catalog = dictCoreService.getDictCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog);
//    }
//
//    @RequestMapping(method = {RequestMethod.POST}, value = "/dictionarys/catalogs/{code}/options")
//    public ResponseEntity<List<Option>> options(@PathVariable("code") String code, @RequestBody(required = false) DictOptionSearchContext context) {
//        Catalog catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getDictCatalog(code);
//        else
//            catalog = dictCoreService.getDictCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog.getOptions());
//    }
//
//
//
    @RequestMapping(method = {RequestMethod.GET}, value = {"/dictionaries/codelist/{code}","/dictionarys/codelist/{code}"})
    public ResponseEntity<CodeList> getCodeList(@PathVariable("code") String code, @RequestParam(name="trymode", required=false, defaultValue="false") String trymode, @RequestParam(name="size", required=false) Integer maxSize) {
    	boolean bTryMode = trymode.equalsIgnoreCase("true");
		CodeList codeList;
		if (ObjectUtils.isEmpty(maxSize)) {
			codeList = this.getCloudConfUtilRuntime().getCodeList(code, bTryMode);
		}else {
			codeList = this.getCloudConfUtilRuntime().getCodeList(code, bTryMode, maxSize);
		}
    	return ResponseEntity.status(HttpStatus.OK).body(codeList);
        
    }
//
//
//    @RequestMapping(method = {RequestMethod.POST}, value = "/dictionarys/codelist/{code}/items")
//    public ResponseEntity<List<CodeItem>> codeItems(@PathVariable("code") String code, @RequestBody(required = false) DictOptionSearchContext context) {
//        CodeList catalog = null;
//        if(context==null|| StringUtils.isEmpty(context.getSelectCond().getSqlSegment()))
//            catalog = dictCoreService.getCodeListCatalog(code);
//        else
//            catalog = dictCoreService.getCodeListCatalog(code,context);
//        return ResponseEntity.status(HttpStatus.OK).body(catalog.getOptions());
//    }
//
//
//    @RequestMapping(method = RequestMethod.POST, value = "/dictionarys/catalogs")
//    public ResponseEntity<Boolean> save(@RequestBody DictCatalogDTO dictcatalogdto) {
//        return ResponseEntity.status(HttpStatus.OK).body(dictcatalogService.save(dictcatalogMapping.toDomain(dictcatalogdto)));
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/dictionarys/catalogs/savebatch")
//    public ResponseEntity<Boolean> saveBatch(@RequestBody List<DictCatalogDTO> dictcatalogdtos) {
//        dictcatalogService.saveBatch(dictcatalogMapping.toDomain(dictcatalogdtos));
//        return  ResponseEntity.status(HttpStatus.OK).body(true);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/dictionarys/catalogs/sync")
//    public ResponseEntity<Boolean> syncRuntimeDict(@RequestBody List<DictCatalog> catalogs){
//        dictCoreService.syncRuntimeDict(catalogs);
//        return  ResponseEntity.status(HttpStatus.OK).body(true);
//    }
}
