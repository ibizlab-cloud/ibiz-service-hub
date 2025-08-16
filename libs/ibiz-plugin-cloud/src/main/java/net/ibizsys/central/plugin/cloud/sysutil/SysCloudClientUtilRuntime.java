package net.ibizsys.central.plugin.cloud.sysutil;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.plugin.cloud.service.CloudServiceClientRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.PSSubSysServiceAPIImpl;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 系统云体系客户端组件运行时对象实现
 * 
 * @author lionlau
 *
 */
public class SysCloudClientUtilRuntime extends SysCloudClientUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysCloudClientUtilRuntime.class);


	@Override
	protected void onInit() throws Exception {
		// TODO Auto-generated method stub
		super.onInit();
	}

	@Override
	protected void onInstall() throws Exception {
		// TODO Auto-generated method stub
		super.onInstall();
	}

	@Override
	protected void onPrepareSubSysServiceAPIRuntime() throws Throwable {
		// 判断系统是否已经定义对应的接口
		java.util.List<IPSSubSysServiceAPI> psSubSysServiceAPIs = this.getSystemRuntime().getPSSystem().getAllPSSubSysServiceAPIs();
		IPSSubSysServiceAPI iPSSubSysServiceAPI = null;
		if (psSubSysServiceAPIs != null) {
			for (IPSSubSysServiceAPI item : psSubSysServiceAPIs) {
				if (CloudServiceClientRuntime.APITAG_CLOUDCLIENT.equalsIgnoreCase(item.getAPITag())) {
					iPSSubSysServiceAPI = item;
					break;
				}
			}
			if (iPSSubSysServiceAPI == null) {
				for (IPSSubSysServiceAPI item : psSubSysServiceAPIs) {
					if (CloudServiceClientRuntime.APITAG_CLOUDCLIENT.equalsIgnoreCase(item.getCodeName())) {
						iPSSubSysServiceAPI = item;
						break;
					}
				}
			}
		}
		if (iPSSubSysServiceAPI == null) {

			if (!StringUtils.hasLength(this.getServiceUrl())) {
				throw new Exception(String.format("未定义Cloud服务路径"));
			}

			String strFullModelPath = "/sysmodel/cloudclient/PSSUBSYSSERVICEAPIS/CloudClient.json";
			ObjectNode objectNode = (ObjectNode) JsonUtils.MAPPER.readTree(this.getClass().getResourceAsStream(strFullModelPath));

			objectNode.put(PSSubSysServiceAPIImpl.ATTR_GETSERVICEPATH, this.getServiceUrl());
			objectNode.put(PSSubSysServiceAPIImpl.ATTR_GETAUTHCLIENTID, this.getClientId());
			objectNode.put(PSSubSysServiceAPIImpl.ATTR_GETAUTHCLIENTSECRET, this.getClientSecret());
			objectNode.put(PSSubSysServiceAPIImpl.ATTR_GETAUTHMODE, this.getAuthMode());
			objectNode.put(PSSubSysServiceAPIImpl.ATTR_GETAUTHACCESSTOKENURL, this.getAccessTokenUrl());
			objectNode.put(PSSubSysServiceAPIImpl.ATTR_GETAPITAG, CloudServiceClientRuntime.APITAG_CLOUDCLIENT);

			iPSSubSysServiceAPI = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getSystemRuntime().getPSSystem(), IPSSubSysServiceAPI.class, objectNode);

			CloudServiceClientRuntime subSysServiceAPIRuntime = new CloudServiceClientRuntime();
			subSysServiceAPIRuntime.init(this.getSystemRuntimeContext(), iPSSubSysServiceAPI);

			this.setSubSysServiceAPIRuntime(subSysServiceAPIRuntime);
		} else {
			this.setSubSysServiceAPIRuntime(this.getSystemRuntime().getSubSysServiceAPIRuntime(iPSSubSysServiceAPI));
		}
	}
	

}
