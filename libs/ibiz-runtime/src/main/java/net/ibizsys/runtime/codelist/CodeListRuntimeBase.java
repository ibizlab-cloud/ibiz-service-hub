package net.ibizsys.runtime.codelist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 系统代码表运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class CodeListRuntimeBase extends SystemModelRuntimeBase implements ICodeListRuntime {

	private Map<String, IPSCodeItem> psCodeItemMap = null;

	private IPSCodeList iPSCodeList = null;

	private String strValueSeparator = "";
	private String strTextSeparator = "";
	//private String strEmptyText = "";

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSCodeList iPSCodeList) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSCodeList = iPSCodeList;

		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {
		String strOrMode = this.getPSCodeList().getOrMode();
		if (CodeListOrModes.STRING.equals(strOrMode)) {
			strValueSeparator = ";";
			strTextSeparator = "、";
			if (!ObjectUtils.isEmpty(this.getPSCodeList().getTextSeparator()))
				strTextSeparator = this.getPSCodeList().getTextSeparator();
			if (!ObjectUtils.isEmpty(this.getPSCodeList().getValueSeparator()))
				strValueSeparator = this.getPSCodeList().getValueSeparator();
		} else if (CodeListOrModes.NUMBER.equals(strOrMode)) {
			strValueSeparator = "";
			strTextSeparator = "、";
			if (!ObjectUtils.isEmpty(this.getPSCodeList().getTextSeparator()))
				strTextSeparator = this.getPSCodeList().getTextSeparator();
		} else {
			strValueSeparator = "";
			strTextSeparator = "";
		}
		super.onInit();
	}

	@Override
	public IPSCodeList getPSCodeList() {
		return this.iPSCodeList;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSCodeList();
	}

	@Override
	public String getText(Object objValue) {
		return this.getText(objValue, null);
	}

	@Override
	public String getText(Object objValue, IUserContext iUserContext) {

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
					IPSCodeItem iPSCodeItem = this.getPSCodeItem(strItem);
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
				java.util.Collection<IPSCodeItem> psCodeItems = this.getPSCodeItems();
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

		IPSCodeItem iPSCodeItem = this.getPSCodeItem(strValue);
		if (iPSCodeItem != null)
			return iPSCodeItem.getText();

		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法获取值[%1$s]对应的文本信息", objValue));
	}

	public abstract List<IPSCodeItem> getPSCodeItems();

	@Override
	public IPSCodeItem getPSCodeItem(String strItemValue) {
		return getPSCodeItem(strItemValue, false);
	}

	@Override
	public IPSCodeItem getPSCodeItem(String strItemValue, boolean bTryMode) {
		Map<String, IPSCodeItem> psCodeItemMap = this.psCodeItemMap;
		if (psCodeItemMap == null) {
			psCodeItemMap = new HashMap<>();
			List<IPSCodeItem> psCodeItemList = this.getPSCodeItems();
			if (psCodeItemList != null) {
				for (IPSCodeItem iPSCodeItem : psCodeItemList) {
					psCodeItemMap.put(iPSCodeItem.getValue(), iPSCodeItem);
				}
			}
			if (this.psCodeItemMap == null) {
				this.psCodeItemMap = psCodeItemMap;
			}
		}

		IPSCodeItem iPSCodeItem = psCodeItemMap.get(strItemValue);
		if (iPSCodeItem != null || bTryMode) {
			return iPSCodeItem;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("无法获取值[%1$s]对应的代码项", strItemValue));
	}
	
	

	@Override
	public IPSCodeItem getPSCodeItemByText(String strText, boolean bTryMode) {
		return getPSCodeItemByText(strText, null, bTryMode);
	}

	@Override
	public IPSCodeItem getPSCodeItemByText(String strText, IUserContext iUserContext, boolean bTryMode) {

		Assert.hasLength(strText, String.format("传入文本无效"));

		List<IPSCodeItem> psCodeItemList = this.getPSCodeItems();
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
	public IPSCodeItem getPSCodeItemByUserData(String strUserData, boolean bTryMode) {

		Assert.hasLength(strUserData, String.format("传入用户数据无效"));

		List<IPSCodeItem> psCodeItemList = this.getPSCodeItems();
		if (psCodeItemList != null) {
			for (IPSCodeItem item : psCodeItemList) {
				String strTag = item.getUserData();
				if(StringUtils.hasLength(strTag)) {
					if(strUserData.equals(strTag)) {
						return item;
					}
				}
			}
		}

		return this.getPSCodeItem(strUserData, bTryMode);
	}
	
	
	
	@Override
	public String getValueSeparator() {
		return this.strValueSeparator;
	}

	@Override
	public String getTextSeparator() {
		return this.strTextSeparator;
	}
	
	@Override
	public String getEmptyText() {
		return this.getPSCodeList().getEmptyText();
	}
	
	@Override
	public synchronized void reset() {
		this.psCodeItemMap = null;
		this.onReset();
	}
	
	
	protected void onReset() {
		
	}


}
