package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysConfUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统配置组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysConfUtilRuntimeBase extends net.ibizsys.central.sysutil.SysConfUtilRuntimeBase implements ISysConfUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysConfUtilRuntimeBase.class);
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void prepareDefaultSetting() throws Exception {

	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	protected IWebClient getWebClient() {
		return this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_CONF);
	}

	@Override
	protected String onGet(String strCat, String strName) throws Throwable {

		String strUrl = "/configs/{configtype}/{targettype}";
		Map<String, Object> uriParams = new HashMap<String, Object>();
		uriParams.put("configtype", strCat);
		uriParams.put("targettype", strName);

		return getWebClient().get(strUrl, uriParams, null, null, String.class, null).getBody();
	}

	@Override
	protected boolean onContains(String strCat, String strName) throws Throwable {
		String strContent = onGet(strCat, strName);
		return StringUtils.hasLength(strContent);
	}

	@Override
	protected void onSet(String strCat, String strName, String strValue) throws Throwable {
		// RequestMethod.PUT, value = "/configs/{configType}/{targetType}"
		String strUrl = "/configs/{configtype}/{targettype}";
		Map<String, Object> uriParams = new HashMap<String, Object>();
		uriParams.put("configtype", strCat);
		uriParams.put("targettype", strName);

		getWebClient().put(strUrl, uriParams, null, null, strValue, null, String.class, null);
	}

	@Override
	protected void onReset(String strCat, String strName) throws Throwable {
		onSet(strCat, strName, null);
	}

	@Override
	public CodeList getCodeList(String strCodeListTag, boolean bTryMode) {
		return this.executeAction("获取代码表", new IAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetCodeList(strCodeListTag, bTryMode);
			}

		}, null, CodeList.class);
	}

	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode) throws Throwable {
		String strUrl = "/dictionaries/codelist/{code}?trymode={trymode}";
		Map<String, Object> uriParams = new HashMap<String, Object>();
		uriParams.put("code", strCodeListTag);
		uriParams.put("trymode", bTryMode);

		return getWebClient().get(strUrl, uriParams, null, null, CodeList.class, null).getBody();
	}

}
