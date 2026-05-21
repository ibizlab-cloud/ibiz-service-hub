package net.ibizsys.central.cloud.core.dataentity.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.codelist.ICodeListRuntime;

/**
 * 代理实体运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class ProxyDERuntimeBase<FIELD_ENUM extends IProxyDEFieldEnum, ACTION_ENUM extends IProxyDEActionEnum, DATASET_ENUM extends IProxyDEDataSetEnum> implements IProxyDERuntime<FIELD_ENUM, ACTION_ENUM, DATASET_ENUM> {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ProxyDERuntimeBase.class);

	private final IDataEntityRuntime iDataEntityRuntime;
	private final Class<FIELD_ENUM> proxyDEFieldEnum;
	private final Class<ACTION_ENUM> proxyDEActionEnum;
	private final Class<DATASET_ENUM> proxyDEDataSetEnum;
	private Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
	private Map<String, IProxyDEFieldEnum> proxyDEFieldEnumMap = new LinkedHashMap<String, IProxyDEFieldEnum>();

	private Map<String, IPSDEAction> psDEActionMap = new LinkedHashMap<String, IPSDEAction>();
	private Map<String, IProxyDEActionEnum> proxyDEActionEnumMap = new LinkedHashMap<String, IProxyDEActionEnum>();

	private Map<String, IPSDEDataSet> psDEDataSetMap = new LinkedHashMap<String, IPSDEDataSet>();
	private Map<String, IProxyDEDataSetEnum> proxyDEDataSetEnumMap = new LinkedHashMap<String, IProxyDEDataSetEnum>();

	public ProxyDERuntimeBase(IDataEntityRuntime iDataEntityRuntime, Class<FIELD_ENUM> proxyDEFieldEnum, Class<ACTION_ENUM> proxyDEActionEnum, Class<DATASET_ENUM> proxyDEDataSetEnum) throws Exception {
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.proxyDEFieldEnum = proxyDEFieldEnum;
		this.proxyDEActionEnum = proxyDEActionEnum;
		this.proxyDEDataSetEnum = proxyDEDataSetEnum;
		Assert.notNull(iDataEntityRuntime, "传入实体运行时对象无效");
		Assert.notNull(proxyDEFieldEnum, "传入代理实体属性枚举对象无效");
		prepareDEFields();
		if (this.getProxyDEActionEnum() != null) {
			this.prepareDEActions();
		}

		if (this.getProxyDEDataSetEnum() != null) {
			this.prepareDEDataSets();
		}
	}

	@Override
	public IDataEntityRuntime getReal() {
		return this.iDataEntityRuntime;
	}

	@Override
	public IPSDEField getIdPSDEField() throws Exception {
		return this.getPSDEField(FIELD_ID, false);
	}

	@Override
	public IPSDEField getNamePSDEField(boolean tryMode) throws Exception {
		return this.getPSDEField(FIELD_NAME, false);
	}

	@Override
	public Class<FIELD_ENUM> getProxyDEFieldEnum() {
		return this.proxyDEFieldEnum;
	}

	protected void prepareDEFields() throws Exception {
		psDEFieldMap.put(FIELD_ID, this.getReal().getKeyPSDEField());
		psDEFieldMap.put(FIELD_NAME, this.getReal().getMajorPSDEField());

		for (IProxyDEFieldEnum iProxyDEFieldEnum : getProxyDEFieldEnum().getEnumConstants()) {
			proxyDEFieldEnumMap.put(iProxyDEFieldEnum.name(), iProxyDEFieldEnum);
			psDEFieldMap.put(iProxyDEFieldEnum.name(), this.getReal().getPSDEFieldByTag(iProxyDEFieldEnum.name(), iProxyDEFieldEnum.required()));
		}
	}

	@Override
	public IPSDEField getPSDEField(String name, boolean tryMode) throws Exception {
		IPSDEField iPSDEField = this.psDEFieldMap.get(name);
		if (iPSDEField != null || tryMode) {
			return iPSDEField;
		}

		throw new Exception(String.format("指定属性[%1$s]不存在"));
	}

	@Override
	public IPSDEField getPSDEField(IProxyDEFieldEnum iProxyDEFieldEnum, boolean tryMode) throws Exception {
		return getPSDEField(iProxyDEFieldEnum.name(), tryMode);
	}

	protected Map<String, IPSDEField> getPSDEFieldMap() {
		return this.psDEFieldMap;
	}

	@Override
	public String getFieldEnumItem(FIELD_ENUM iProxyDEFieldEnum, Object value, boolean tryMode) throws Exception {
		IPSDEField iPSDEField = this.getPSDEField(iProxyDEFieldEnum);
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		IPSCodeItem iPSCodeItem = null;
		if (iPSCodeList != null) {
			ICodeListRuntime iCodeListRuntime = this.getReal().getSystemRuntime().getCodeListRuntime(iPSCodeList);
			iPSCodeItem = iCodeListRuntime.getPSCodeItem(String.valueOf(value), tryMode);
		}

		if (iPSCodeItem == null) {
			if (tryMode)
				return null;
			throw new Exception(String.format("无法获取代码项[%1$s]", value));
		}

		Class<? extends ICodeListEnum> cls = iProxyDEFieldEnum.codelist();
		if (cls == null) {
			return null;
		}

		String strTag = iPSCodeItem.getUserData();
		if (StringUtils.hasLength(strTag)) {
			for (ICodeListEnum iCodeListEnum : cls.getEnumConstants()) {
				if (strTag.equals(iCodeListEnum.name())) {
					return iCodeListEnum.name();
				}
			}
		}

		strTag = iPSCodeItem.getCodeName();
		if (StringUtils.hasLength(strTag)) {
			for (ICodeListEnum iCodeListEnum : cls.getEnumConstants()) {
				if (strTag.equalsIgnoreCase(iCodeListEnum.name())) {
					return iCodeListEnum.name();
				}
			}
		}

		if (tryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取枚举项[%1$s]", value));
	}
	
	@Override
	public Object getFieldEnumValue(FIELD_ENUM iProxyDEFieldEnum, Object value, boolean tryMode) throws Exception {
		IPSDEField iPSDEField = this.getPSDEField(iProxyDEFieldEnum);
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		IPSCodeItem iPSCodeItem = null;
		if (iPSCodeList != null) {
			ICodeListRuntime iCodeListRuntime = this.getReal().getSystemRuntime().getCodeListRuntime(iPSCodeList);
			iPSCodeItem = iCodeListRuntime.getPSCodeItem(String.valueOf(value), tryMode);
		}

		if (iPSCodeItem == null) {
			if (tryMode)
				return null;
			throw new Exception(String.format("无法获取代码项[%1$s]", value));
		}

		Class<? extends ICodeListEnum> cls = iProxyDEFieldEnum.codelist();
		if (cls == null) {
			return null;
		}

		String strTag = iPSCodeItem.getUserData();
		if (StringUtils.hasLength(strTag)) {
			for (ICodeListEnum iCodeListEnum : cls.getEnumConstants()) {
				if (strTag.equals(iCodeListEnum.name())) {
					return iCodeListEnum.value();
				}
			}
		}

		strTag = iPSCodeItem.getCodeName();
		if (StringUtils.hasLength(strTag)) {
			for (ICodeListEnum iCodeListEnum : cls.getEnumConstants()) {
				if (strTag.equalsIgnoreCase(iCodeListEnum.name())) {
					return iCodeListEnum.value();
				}
			}
		}

		if (tryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取枚举项[%1$s]", value));
	}
	

	@Override
	public Class<ACTION_ENUM> getProxyDEActionEnum() {
		return this.proxyDEActionEnum;
	}

	protected void prepareDEActions() throws Exception {
		for (IProxyDEActionEnum iProxyDEActionEnum : getProxyDEActionEnum().getEnumConstants()) {
			proxyDEActionEnumMap.put(iProxyDEActionEnum.name(), iProxyDEActionEnum);
			psDEActionMap.put(iProxyDEActionEnum.name(), this.getReal().getPSDEActionByTag(iProxyDEActionEnum.name(), iProxyDEActionEnum.required()));
		}
	}

	@Override
	public IPSDEAction getPSDEAction(ACTION_ENUM iProxyDEActionEnum, boolean tryMode) throws Exception {
		return getPSDEAction(iProxyDEActionEnum.name(), tryMode);
	}

	@Override
	public IPSDEAction getPSDEAction(String name, boolean tryMode) throws Exception {
		IPSDEAction iPSDEAction = this.psDEActionMap.get(name);
		if (iPSDEAction != null || tryMode) {
			return iPSDEAction;
		}

		throw new Exception(String.format("指定行为[%1$s]不存在"));
	}

	protected Map<String, IPSDEAction> getPSDEActionMap() {
		return this.psDEActionMap;
	}

	@Override
	public Class<DATASET_ENUM> getProxyDEDataSetEnum() {
		return this.proxyDEDataSetEnum;
	}

	protected void prepareDEDataSets() throws Exception {
		for (IProxyDEDataSetEnum iProxyDEDataSetEnum : getProxyDEDataSetEnum().getEnumConstants()) {
			proxyDEDataSetEnumMap.put(iProxyDEDataSetEnum.name(), iProxyDEDataSetEnum);
			psDEDataSetMap.put(iProxyDEDataSetEnum.name(), this.getReal().getPSDEDataSetByTag(iProxyDEDataSetEnum.name(), iProxyDEDataSetEnum.required()));
		}
	}

	@Override
	public IPSDEDataSet getPSDEDataSet(DATASET_ENUM iProxyDEDataSetEnum, boolean tryMode) throws Exception {
		return getPSDEDataSet(iProxyDEDataSetEnum.name(), tryMode);
	}

	@Override
	public IPSDEDataSet getPSDEDataSet(String name, boolean tryMode) throws Exception {
		IPSDEDataSet iPSDEDataSet = this.psDEDataSetMap.get(name);
		if (iPSDEDataSet != null || tryMode) {
			return iPSDEDataSet;
		}

		throw new Exception(String.format("指定数据集[%1$s]不存在"));
	}

	protected Map<String, IPSDEDataSet> getPSDEDataSetMap() {
		return this.psDEDataSetMap;
	}

	@Override
	public IEntityDTO getEntityDTO(Map<String, Object> item) throws Throwable {
		IEntityDTO iEntityDTO = this.getReal().createEntity();
		this.fillEntityDTO(iEntityDTO, item);
		return iEntityDTO;
	}

	@Override
	public void fillEntityDTO(IEntityDTO iEntityDTO, Map<String, Object> item) throws Throwable {
		for (java.util.Map.Entry<String, Object> entry : item.entrySet()) {
			IPSDEField iPSDEField = psDEFieldMap.get(entry.getKey());
			if (iPSDEField == null) {
				iEntityDTO.set(entry.getKey().toLowerCase(), entry.getValue());
			} else {
				if (entry.getValue() != null) {
					IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
					if (iPSCodeList != null) {
						ICodeListRuntime iCodeListRuntime = this.getReal().getSystemRuntime().getCodeListRuntime(iPSCodeList);
						IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItemByTag(String.valueOf(entry.getValue()), true);
						if (iPSCodeItem != null) {
							iEntityDTO.set(iPSDEField.getLowerCaseName(), iPSCodeItem.getValue());
							continue;
						}
					}
				}
				if (entry.getValue() instanceof double[]) {
					iEntityDTO.rawSet(iPSDEField.getLowerCaseName(), entry.getValue());
				} else
					iEntityDTO.set(iPSDEField.getLowerCaseName(), entry.getValue());
			}
		}
	}

	@Override
	public Map<String, Object> getDataItem(IEntityDTO iEntityDTO) throws Throwable {
		Map<String, Object> item = new LinkedHashMap<String, Object>();
		for (java.util.Map.Entry<String, IPSDEField> entry : psDEFieldMap.entrySet()) {
			IPSDEField iPSDEField = entry.getValue();
			if (iPSDEField == null) {
				continue;
			}
			Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
			IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
			if (iPSCodeList != null) {
				IProxyDEFieldEnum iProxyDEFieldEnum = proxyDEFieldEnumMap.get(iPSDEField.getName());
				String strEnumItem = this.getFieldEnumItem((FIELD_ENUM) iProxyDEFieldEnum, value, true);
				if (!ObjectUtils.isEmpty(strEnumItem)) {
					value = strEnumItem;
				}
			}
			item.put(entry.getKey(), value);
		}
		return item;
	}

	@Override
	public Object getFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum, Object defaultValue) throws Throwable {
		IPSDEField iPSDEField = this.getPSDEField(iProxyDEFieldEnum, true);
		if (iPSDEField == null) {
			return defaultValue;
		}

		Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
		if (value == null) {
			return defaultValue;
		}
		
		if(iProxyDEFieldEnum.codelist()!=null) {
			Object realValue = this.getFieldEnumValue(iProxyDEFieldEnum, value, true);
			if(realValue != null) {
				return realValue;
			}
		}
		
		return value;
	}

	@Override
	public boolean containsFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum) throws Throwable {
		IPSDEField iPSDEField = this.getPSDEField(iProxyDEFieldEnum, true);
		if (iPSDEField == null) {
			return false;
		}
		return iEntityDTO.contains(iPSDEField.getLowerCaseName());
	}

	@Override
	public boolean setFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum, Object value) throws Throwable {
		IPSDEField iPSDEField = this.getPSDEField(iProxyDEFieldEnum, true);
		if (iPSDEField == null) {
			return false;
		}
		
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		if (iPSCodeList != null && !ObjectUtils.isEmpty(value) ) {
			ICodeListRuntime iCodeListRuntime = this.getReal().getSystemRuntime().getCodeListRuntime(iPSCodeList);
			IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItemByTag(String.valueOf(value), true);
			if (iPSCodeItem != null) {
				iEntityDTO.set(iPSDEField.getLowerCaseName(), iPSCodeItem.getValue());
				return true;
			}
		}
		
		
		iEntityDTO.set(iPSDEField.getLowerCaseName(), value);
		return true;
	}

	@Override
	public boolean resetFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum, Object value) throws Throwable {
		IPSDEField iPSDEField = this.getPSDEField(iProxyDEFieldEnum, true);
		if (iPSDEField == null) {
			return false;
		}
		iEntityDTO.reset(iPSDEField.getLowerCaseName());
		return true;
	}
}
