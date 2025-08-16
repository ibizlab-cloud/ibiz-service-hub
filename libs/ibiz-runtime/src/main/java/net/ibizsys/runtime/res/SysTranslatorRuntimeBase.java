package net.ibizsys.runtime.res;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统值转换器运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysTranslatorRuntimeBase extends SystemModelRuntimeBase implements ISysTranslatorRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysTranslatorRuntimeBase.class);
	private IPSSysTranslator iPSSysTranslator = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysTranslator iPSSysTranslator) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysTranslator = iPSSysTranslator;

		this.setConfigFolder("systranslator." + PSModelUtils.calcUniqueTag(this.iPSSysTranslator.getPSSystemModule(), this.iPSSysTranslator.getCodeName()));

		this.onInit();
	}

	@Override
	public IPSSysTranslator getPSSysTranslator() {
		return this.iPSSysTranslator;
	}

	@Override
	public String getId() {
		return getPSSysTranslator().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysTranslator().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysTranslator();
	}

	@Override
	public Object translate(Object objValue, boolean bIn) throws Throwable {
		return this.translate(objValue, bIn, null, null, null);
	}
	
	protected String getTranslatorParam(String strKey, String strDefault) {
		if (this.getPSSysTranslator().getTranslatorParams() != null) {
			JsonNode node = this.getPSSysTranslator().getTranslatorParams().get(strKey);
			if (node != null) {
				return node.asText(strDefault);
			}
		}
		return strDefault;
	}

	protected int getTranslatorParam(String strKey, int nDefault) {
		if (this.getPSSysTranslator().getTranslatorParams() != null) {
			JsonNode node = this.getPSSysTranslator().getTranslatorParams().get(strKey);
			if (node != null) {
				return node.asInt(nDefault);
			}
		}
		return nDefault;
	}

	protected double getTranslatorParam(String strKey, double fDefault) {
		if (this.getPSSysTranslator().getTranslatorParams() != null) {
			JsonNode node = this.getPSSysTranslator().getTranslatorParams().get(strKey);
			if (node != null) {
				return node.asDouble(fDefault);
			}
		}
		return fDefault;
	}
	
	protected boolean getTranslatorParam(String strKey, boolean bDefault) {
		if (this.getPSSysTranslator().getTranslatorParams() != null) {
			JsonNode node = this.getPSSysTranslator().getTranslatorParams().get(strKey);
			if (node != null) {
				return node.asBoolean(bDefault);
			}
		}
		return bDefault;
	}
	
	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		try {
			return this.onTranslate(objValue, bIn, iEntityBase, iPSDEField, entityDataEntityRuntime);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("值转换发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onTranslate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		throw new Exception("没有实现");
	}
}
