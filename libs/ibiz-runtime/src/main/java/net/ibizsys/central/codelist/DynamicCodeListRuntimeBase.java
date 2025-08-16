package net.ibizsys.central.codelist;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.CodeListOrModes;
import net.ibizsys.runtime.codelist.DynamicCodeListRuntime;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IEntity;

public abstract class DynamicCodeListRuntimeBase extends DynamicCodeListRuntime implements IDynamicCodeListRuntime{

	private static final Log log = LogFactory.getLog(DynamicCodeListRuntimeBase.class);
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	private boolean bEnableCache = false;
	private int nCacheTimeoutSeconds = -1;
	private String strLastCacheData = null;
	private String strCacheTag = null;
	
	@Override
	protected void onInit() throws Exception {
		this.bEnableCache = this.getPSCodeList().isEnableCache();
		if(this.isEnableCache()) {
			this.nCacheTimeoutSeconds = this.getPSCodeList().getCacheTimeout();
			if(this.nCacheTimeoutSeconds>=1000) {
				this.nCacheTimeoutSeconds /=1000;
			}
			else {
				this.nCacheTimeoutSeconds = -1;
			}
			if(this.getSysCacheUtilRuntime(true) == null) {
				this.prepareSysCacheUtilRuntime();
				this.getSysCacheUtilRuntime(false);
			}
			this.strCacheTag = String.format("ibiz-cloud-codelist-%1$s--%2$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag());
			//this.strLastCacheData = this.getCurrentCacheData();
		}
		super.onInit();
	}
	
	public boolean isEnableCache() {
		return this.bEnableCache;
	}
	
	public int getCacheTimeoutSeconds() {
		return this.nCacheTimeoutSeconds;
	}
	
	public String getCacheTag() {
		return this.strCacheTag;
	}
	
	protected String getLastCacheData(){
		return this.strLastCacheData;
	}
	
	protected String getCurrentCacheData() throws Exception{
		return getSysCacheUtilRuntime(false).get(this.getCacheTag());
	}
	
	protected void setCurrentCacheData(String strData) throws Exception{
		getSysCacheUtilRuntime(false).set(this.getCacheTag(), strData, this.getCacheTimeoutSeconds());
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) throws Exception {
		if(this.iSysCacheUtilRuntime != null || bTryMode) {
			return this.iSysCacheUtilRuntime;
		}
		throw new Exception("系统缓存功能组件无效");
	}
	
	protected void setSysCacheUtilRuntime(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
		this.iSysCacheUtilRuntime = iSysCacheUtilRuntime;
	}
	
	protected void prepareSysCacheUtilRuntime() throws Exception {
		this.setSysCacheUtilRuntime(this.getSystemRuntime().getSysCacheUtilRuntime(true));
	}
	
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	@Override
	public ICodeListRuntime getInstance(Object dataOrKey) {
		try {
			return this.onGetInstance(dataOrKey);
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取上下文实例发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ICodeListRuntime onGetInstance(Object dataOrKey) throws Throwable {
		if(ObjectUtils.isEmpty(dataOrKey)) {
			return this;
		}
		
		Map params = getMap(dataOrKey);
		if(params == null) {
			return this;
		}
		
		DynamicCodeListRuntimeInstance dynamicCodeListRuntimeInstance = new DynamicCodeListRuntimeInstance();
		dynamicCodeListRuntimeInstance.init(this.getSystemRuntimeBaseContext(), this.getPSCodeList(), params);
		return dynamicCodeListRuntimeInstance;
	}
	
	protected Map getMap(Object keyOrData) throws Throwable {
		if(keyOrData instanceof Map) {
			return (Map)keyOrData;
		}
		if(keyOrData instanceof IEntity) {
			return ((IEntity)keyOrData).any();
		}
		
		return null;
	}
	
	@Override
	public List<IPSCodeItem> getPSCodeItems() {
		return getPSCodeItems(null);
	}
	
	@Override
	public List<IPSCodeItem> getPSCodeItems(Object dataOrKey) {
		if(this.isEnableCache()) {
			//获取最后一次标记
			try {
				String strCacheData = this.getCurrentCacheData();
				if(StringUtils.hasLength(strCacheData)) {
					if(!strCacheData.equals(this.getLastCacheData())) {
						super.reset();
						this.strLastCacheData = strCacheData;
					}
				}
				else {
					strCacheData = DateUtils.getCurTimeString();
					this.setCurrentCacheData(strCacheData);
					super.reset();
					this.strLastCacheData = strCacheData;
				}
			} catch (Throwable ex) {
				throw new SystemRuntimeException(this.getSystemRuntimeBase(),this, String.format("计算缓存标记发生异常，%1$s", ex.getMessage()), ex);
			}
		}else {
			super.reset();
		}
		
		return super.getPSCodeItems();
	}

	@Override
	public String getText(Object objValue, IUserContext iUserContext){
		return this.getText(null, objValue, iUserContext);
	}

	@Override
	public String getText(Object dataOrKey, Object objValue, IUserContext iUserContext) {
		if (ObjectUtils.isEmpty(objValue)) {
			return this.getPSCodeList().getEmptyText();
		}

		String strValue = null;
		if (objValue instanceof String) {
			strValue = (String) objValue;
		} else {
			strValue = objValue.toString();
		}

		String strOrMode = this.getPSCodeList().getOrMode();
		if (StringUtils.hasLength(strOrMode)) {
			if (CodeListOrModes.STRING.equals(strOrMode)) {
				// 字符串
				String strValueSeparator = this.getPSCodeList().getValueSeparator();
				if (!StringUtils.hasLength(strValueSeparator)) {
					strValueSeparator = ";";
				}
				String strTextSeparator = this.getPSCodeList().getTextSeparator();
				if (!StringUtils.hasLength(strTextSeparator)) {
					strTextSeparator = "、";
				}
				String strTotalText = "";
				String[] values = StringUtils.tokenizeToStringArray(strValue, strValueSeparator);
				for (String strItem : values) {
					IPSCodeItem iPSCodeItem = this.getPSCodeItem(dataOrKey, strItem, false);
					if (iPSCodeItem == null) {
						throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法获取值[%1$s]对应的文本信息", strItem));
					}
					if (!ObjectUtils.isEmpty(strTotalText)) {
						strTotalText += strTextSeparator;
					}
					strTotalText += iPSCodeItem.getText();
				}
				return strTotalText;
			}

			if (CodeListOrModes.NUMBER.equals(strOrMode)) {
				// 数值
				String strTextSeparator = this.getPSCodeList().getTextSeparator();
				if (!StringUtils.hasLength(strTextSeparator)) {
					strTextSeparator = "、";
				}
				int nValue = Integer.parseInt(strValue);
				if (nValue == 0) {
					return this.getPSCodeList().getEmptyText();
				}
				String strTotalText = "";
				java.util.Collection<IPSCodeItem> psCodeItems = this.getPSCodeItems(dataOrKey);
				if (psCodeItems != null) {
					for (IPSCodeItem iPSCodeItem : psCodeItems) {
						int nValueItem = Integer.parseInt(iPSCodeItem.getValue());
						if ((nValue & nValueItem) == nValueItem) {
							if (!ObjectUtils.isEmpty(strTotalText)) {
								strTotalText += strTextSeparator;
							}
							strTotalText += iPSCodeItem.getText();
						}
					}
				}
				return strTotalText;
			}

			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法识别的或模式[%1$s]", strOrMode));
		}

		IPSCodeItem iPSCodeItem = this.getPSCodeItem(dataOrKey, strValue, false);
		if (iPSCodeItem != null)
			return iPSCodeItem.getText();

		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法获取值[%1$s]对应的文本信息", objValue));
	}
	
	
	@Override
	public IPSCodeItem getPSCodeItem(Object dataOrKey, String strItemValue, boolean bTryMode) {
		
		List<IPSCodeItem> psCodeItemList = this.getPSCodeItems(dataOrKey);
		if (psCodeItemList != null) {
			for (IPSCodeItem iPSCodeItem : psCodeItemList) {
				if(DataTypeUtils.compare(strItemValue, iPSCodeItem.getValue())==0) {
					return iPSCodeItem;
				}
			}
		}

		if (bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法获取值[%1$s]对应的代码项", strItemValue));
	}

	@Override
	public IPSCodeItem getPSCodeItemByText(Object dataOrKey, String strText, IUserContext iUserContext, boolean bTryMode) {
		Assert.hasLength(strText, String.format("传入文本无效"));

		List<IPSCodeItem> psCodeItemList = this.getPSCodeItems(dataOrKey);
		if (psCodeItemList != null) {
			for (IPSCodeItem item : psCodeItemList) {
				String strItemText = item.getText();
				if (iUserContext != null) {
					if (item.getTextPSLanguageRes() != null) {
						strItemText = iUserContext.getLocalization(item.getTextPSLanguageRes().getLanResTag(), strItemText);
					}
				}
				if (strText.equals(strItemText)) {
					return item;
				}
			}
		}

		if (bTryMode) {
			return null;
		}

		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法获取文本[%1$s]对应的代码项", strText));
	}
	
	@Override
	public synchronized void reset() {
		if(this.isEnableCache()) {
			try {
				String strCacheData = DateUtils.getCurTimeString();
				this.setCurrentCacheData(strCacheData);
				super.reset();
				this.strLastCacheData = strCacheData;
				return;
			} catch (Throwable ex) {
				log.error(String.format("重置缓存标记发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		super.reset();
	}

	
	protected synchronized void superReset() {
		super.reset();
	}
}
