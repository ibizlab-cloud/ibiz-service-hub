package net.ibizsys.central.dataentity.logic;

import java.util.List;

import org.springframework.http.HttpStatus;

import net.ibizsys.central.util.IWebResponse;
import net.ibizsys.central.util.WebResponse;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * WebResponse参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicWebResponseParamRuntime extends DELogicParamRuntimeBase {

	public final static String PARAM_HEADER_PREFIX = "SRFHEADER.";

	public final static String PARAM_HEADERVALUES_PREFIX = "SRFHEADERVALUES.";

	public final static String PARAM_HEADERNAMES = "headernames";

	public final static String PARAM_BODY = "body";

	public final static String PARAM_CODE = "code";

	public final static String PARAM_TYPE = "type";

	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if (objParam instanceof IWebResponse) {
			return this.getSystemRuntime().createScriptWebResponse((IWebResponse)objParam);
		}
		return super.getScriptObject(iDELogicSession);
	}

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof IWebResponse)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是Web反馈对象类型", getCodeName()));
			}
			return object;
		}
		// 新建
		object = new WebResponse();
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if (!(paramObject instanceof IWebResponse)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非Web反馈对象类型参数", getCodeName()));
			}
		}
		super.bind(iDELogicSession, paramObject);
	}

	@Override
	protected void onSet(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {

		Object webResponse = this.getParamObject(iDELogicSession);
		IWebResponse iWebResponse = null;
		if (webResponse instanceof IWebResponse) {
			iWebResponse = (IWebResponse) webResponse;
		}

		if (iWebResponse == null) {
			super.onSet(iDELogicSession, strName, objValue);
			return;
		}

		if (PARAM_TYPE.equalsIgnoreCase(strName)) {
			iWebResponse.setContentType(DataTypeUtils.asString(objValue, null));
			return;
		}

		if (PARAM_CODE.equalsIgnoreCase(strName)) {
			iWebResponse.setStatusCode(DataTypeUtils.asInteger(objValue, HttpStatus.OK.value()));
			return;
		}

		if (PARAM_BODY.equalsIgnoreCase(strName)) {
			iWebResponse.setBody(objValue);
			return;
		}

		String strName2 = strName.toUpperCase();
		if (strName2.indexOf(PARAM_HEADER_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_HEADER_PREFIX.length());
			iWebResponse.setHeader(strName2, DataTypeUtils.asString(objValue, null));
			return;
		}

		if (strName2.indexOf(PARAM_HEADERVALUES_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_HEADERVALUES_PREFIX.length());
			iWebResponse.setHeaderValues(strName2, asList(objValue));
			return;
		}

		if (objValue instanceof List) {
			iWebResponse.setHeaderValues(strName, (List) objValue);
		} else {
			iWebResponse.setHeader(strName, DataTypeUtils.asString(objValue, null));
		}
	}

	@Override
	public Object onGet(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object webResponse = this.getParamObject(iDELogicSession);
		IWebResponse iWebResponse = null;
		if (webResponse instanceof IWebResponse) {
			iWebResponse = (IWebResponse) webResponse;
		}

		if (iWebResponse == null) {
			return super.onGet(iDELogicSession, strName);
		}

		if (PARAM_TYPE.equalsIgnoreCase(strName)) {
			return iWebResponse.getContentType();
		}

		if (PARAM_CODE.equalsIgnoreCase(strName)) {
			return iWebResponse.getStatusCode();
		}

		if (PARAM_BODY.equalsIgnoreCase(strName)) {
			return iWebResponse.getBody();
		}

		if (PARAM_HEADERNAMES.equalsIgnoreCase(strName)) {
			return iWebResponse.getHeaderNames();
		}

		String strName2 = strName.toUpperCase();
		if (strName2.indexOf(PARAM_HEADER_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_HEADER_PREFIX.length());
			return iWebResponse.getHeader(strName2);
		}

		if (strName2.indexOf(PARAM_HEADERVALUES_PREFIX) == 0) {
			strName2 = strName.substring(PARAM_HEADERVALUES_PREFIX.length());
			return iWebResponse.getHeaderValues(strName2);
		}

		return iWebResponse.getHeader(strName);
	}

}
