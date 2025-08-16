package net.ibizsys.runtime.dataentity.util;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.res.ISysUtilRuntime;

/**
 * 实体功能运行时对象接口
 * @author lionlau
 *
 */
public abstract class DEUtilRuntimeBase extends ModelRuntimeBase implements IDEUtilRuntime, ISysUtilRuntime{

	private IDataEntityRuntime iDataEntityRuntime = null;
	private IPSDEUtil iPSDEUtil = null;
	private IPSSysUtil iPSSysUtil = null;
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private IDataEntityRuntimeContext  iDataEntityRuntimeContext = null;
	private ISystemRuntime iSystemRuntime = null;
	
	@Override
	public void init(IDataEntityRuntimeContext  iDataEntityRuntimeContext, IPSDEUtil iPSDEUtil) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.iDataEntityRuntime = this.iDataEntityRuntimeContext.getDataEntityRuntime();
		this.iPSDEUtil = iPSDEUtil;
		this.iSystemRuntime = this.iDataEntityRuntime.getSystemRuntime();
		this.onInit();
	}
	
	
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysUtil iPSSysUtil) throws Exception {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.iPSSysUtil = iPSSysUtil;
		this.iSystemRuntime = this.iSystemRuntimeContext.getSystemRuntime();
		
		this.onInit();
	}


	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}

	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	
	public IPSDEUtil getPSDEUtil() {
		return this.iPSDEUtil;
	}
	
	public IPSSysUtil getPSSysUtil() {
		return this.iPSSysUtil;
	}


	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		if(getPSDEUtil() != null) {
			return getPSDEUtil();
		}
		if(getPSSysUtil() != null) {
			return getPSSysUtil();
		}
		return null;
	}

	@Override
	public String getId() {
		if(getPSDEUtil() != null) {
			return getPSDEUtil().getDynaModelFilePath();
		}
		if(getPSSysUtil() != null) {
			return getPSSysUtil().getDynaModelFilePath();
		}
		return null;
	}

	@Override
	public String getName() {
		if(getPSDEUtil() != null) {
			return getPSDEUtil().getName();
		}
		if(getPSSysUtil() != null) {
			return getPSSysUtil().getName();
		}
		return null;
	}
	

	protected String getUtilParam(String strKey, String strDefault) {
		if (this.getPSDEUtil().getUtilParams() != null) {
			JsonNode node = this.getPSDEUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asText(strDefault);
			}
		}
		return strDefault;
	}

	protected int getUtilParam(String strKey, int nDefault) {
		if (this.getPSDEUtil().getUtilParams() != null) {
			JsonNode node = this.getPSDEUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asInt(nDefault);
			}
		}
		return nDefault;
	}

	protected double getUtilParam(String strKey, double fDefault) {
		if (this.getPSDEUtil().getUtilParams() != null) {
			JsonNode node = this.getPSDEUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asDouble(fDefault);
			}
		}
		return fDefault;
	}
	
	
	protected boolean getUtilParam(String strKey, boolean bDefault) {
		if (this.getPSDEUtil().getUtilParams() != null) {
			JsonNode node = this.getPSDEUtil().getUtilParams().get(strKey);
			if (node != null) {
				return node.asBoolean(bDefault);
			}
		}
		return bDefault;
	}
}
