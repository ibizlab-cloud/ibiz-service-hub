package net.ibizsys.central.cloud.kb.core.spring.controller;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.kb.core.IKBUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class KBRestController {

	private static final Log log = LogFactory.getLog(KBRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud知识库服务已经启动"));
		iServiceHub.registerNamingService("ibizcloud-kb");
	}

	@Autowired(required=false)
	private ICloudKBUtilRuntime iCloudKBUtilRuntime = null;

	protected ICloudKBUtilRuntime getCloudKBUtilRuntime() {
		if (this.iCloudKBUtilRuntime == null) {
			try {
				this.iCloudKBUtilRuntime = iServiceHub.getCloudUtilRuntime(IKBUtilSystemRuntime.class, ICloudKBUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务KB功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务知识库功能模块"), ex);
			}
		}
		return this.iCloudKBUtilRuntime;
	}
	
	
	
//	/**
//	 * 建立知识库
//	 * @param type
//	 * @param knowledgeBase
//	 * @return
//	 */
//	@RequestMapping(method = {RequestMethod.POST}, value = {"/kb/{type}"})
//	public KnowledgeBase createKnowledgeBase(@PathVariable("type") String type, @RequestBody KnowledgeBase knowledgeBase) {
//		return this.getCloudKBUtilRuntime().createKnowledgeBase(type, knowledgeBase);
//	}
//	
//	/**
//	 * 更新知识库
//	 * @param type
//	 * @param db
//	 * @param knowledgeBase
//	 * @return
//	 */
//	@RequestMapping(method = {RequestMethod.PUT}, value = {"/kb/{type}/{db}"})
//	public KnowledgeBase updateKnowledgeBase(@PathVariable("type") String type, @PathVariable("db") String db, @RequestBody KnowledgeBase knowledgeBase) {
//		knowledgeBase.setName(db);
//		return this.getCloudKBUtilRuntime().updateKnowledgeBase(type, knowledgeBase);
//	}
//	
//	
//	@RequestMapping(method = {RequestMethod.POST}, value = {"/kb/{type}/{db}"})
//	public Collection createCollection(@PathVariable("type") String type, @PathVariable("db") String db, @RequestBody Collection collection) {
//		return this.getCloudKBUtilRuntime().createCollection(type, db, collection);
//	}
//	
//	@RequestMapping(method = {RequestMethod.PUT}, value = {"/kb/{type}/{db}/{name}"})
//	public Collection updateCollection(@PathVariable("type") String type, @PathVariable("db") String db, @PathVariable("name") String name, @RequestBody Collection collection) {
//		collection.setName(name);
//		return this.getCloudKBUtilRuntime().updateCollection(type, name, collection);
//	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = {"/kb/{type}/fetchchunks"})
	public ResponseEntity<Object> fetchChunks(@PathVariable("type") String type, @RequestBody Map params) {
//		if(!AuthenticationUser.isApiuser(AuthenticationUser.getCurrentMust()) && !AuthenticationUser.isSuperuser(AuthenticationUser.getCurrentMust())) {
//			throw new RuntimeException("仅限API用户访问");
//		}
		
		Page page = this.getCloudKBUtilRuntime().fetchChunks(type, params);
		return RestUtils.sendBackPage(page, Map.class);
	}
	
}
