package net.ibizsys.runtime.util;


import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 基础数据对象
 * 
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public abstract class EntityBase implements IEntity{

	/**
	 * 草稿标志
	 */
	public final static String DRAFTFLAG = "srfdraftflag";

	/**
	 * 原始数据主键（临时数据模式）
	 */
	public final static String ORIGINKEY = "srforikey";
	
	/**
	 * 源数据主键（克隆模式）
	 */
	public final static String SOURCEKEY = "srfsourcekey";
	

	/**
	 * 上一次的数据对象
	 */
	public final static String LASTENTITY = "srflastentity";

	/**
	 * 主键状态
	 */
	public final static String KEYSTATE = "srfkeystate";

	/**
	 * 最后更新时间
	 */
	public final static String LASTUPDATEDATE = "srfupdatedate";

	/**
	 * 忽略检查
	 */
	public final static String IGNORECHECK = "srfignorecheck";

	/**
	 * 忽略检查主键
	 */
	public final static String IGNORECHECKKEY = "srfignorecheckkey";

	/**
	 * 调用返回值
	 */
	public final static String RET = "srfret";
	
	/**
	 * 主键
	 */
	public final static String KEY = "srfkey";
	

	/**
	 * Boolean 值，True
	 */
	public final static int BOOLEAN_TRUE = 1;

	/**
	 * Boolean 值，False
	 */
	public final static int BOOLEAN_FALSE = 0;



	@JsonIgnore
	private Map<String, Object> paramMap = null;

	
	@Override
	public Object get(String strName) {
		if (!StringUtils.hasLength(strName)) {
			return null;
		}
		if(isLowerCaseName()) {
			strName = strName.toLowerCase();
		}
		
		if (paramMap != null) {
			return paramMap.get(strName);
		}
		return null;
	}

	
	@Override
	@JsonAnySetter
	public void set(String strName, Object objValue) {
		if (!StringUtils.hasLength(strName)) {
			return;
		}
		
		if(isLowerCaseName()) {
			strName = strName.toLowerCase();
		}
		
		if (paramMap == null) {
			paramMap = createAny();
		}

		paramMap.put(strName, objValue);
	}

	@Override
	public boolean contains(String strName) {
		if (!StringUtils.hasLength(strName)) {
			return false;
		}
		
		if(isLowerCaseName()) {
			strName = strName.toLowerCase();
		}
		
		if (paramMap != null) {
			return paramMap.containsKey(strName);
		}
		return false;
	}

	@Override
	public void reset(String strName) {
		if (!StringUtils.hasLength(strName)) {
			return;
		}
		
		if(isLowerCaseName()) {
			strName = strName.toLowerCase();
		}
		
		if (paramMap != null) {
			paramMap.remove(strName);
		}
	}

	@Override
	public void resetAll() {
		onResetAll();
	}

	protected void onResetAll() {

		this.paramMap = null;

	}
	
	@JsonIgnore
	protected boolean isLowerCaseName() {
		return true;
	}

	// public void fillMap(Map<String, Object> params, boolean bDirtyOnly) {
	// if (this.proxyEntity != null) {
	// this.proxyEntity.fillMap(params, bDirtyOnly);
	// } else {
	// this.fillMap(params);
	// onFillMap(params, bDirtyOnly);
	// }
	// }

//	/**
//	 * 填充Map
//	 * 
//	 * @param params
//	 * @param bDirtyOnly
//	 */
//	protected void onFillMap(Map<String, Object> params, boolean bDirtyOnly) {
//
//	}

	/**
	 * 是否有草稿标志
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean hasDraftFlag(IEntity iEntity) {
		Object objValue = iEntity.get(DRAFTFLAG);
		if (objValue == null)
			return false;
		return true;
	}

	// /**
	// * 是否为草稿
	// *
	// * @param iEntity
	// * @return
	// * @throws Exception
	// */
	// public static boolean isDraft(IEntity iEntity) throws Exception {
	// Object objValue = iEntity.get(DRAFTFLAG);
	// if (objValue == null) return false;
	// if (StringHelper.compare(objValue.toString(), "1", true) == 0) return
	// true;
	// return false;
	// }

	/**
	 * 设置草稿状态
	 * 
	 * @param iEntity
	 * @param bDraftFlag
	 * @throws Exception
	 */
	public static void setDraft(IEntity iEntity, boolean bDraftFlag){
		iEntity.set(DRAFTFLAG, bDraftFlag ? 1 : 0);

	}

	/**
	 * 设置最后更新时间
	 * 
	 * @param iEntity
	 * @param timestamp
	 * @throws Exception
	 */
	public static void setLastUpdateDate(IEntity iEntity, java.sql.Timestamp timestamp)  {
		String strLastDateStr = String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", timestamp);
		iEntity.set(LASTUPDATEDATE, strLastDateStr);
	}

	/**
	 * 设置是否忽略检查
	 * 
	 * @param iEntity
	 * @param bIgnoreCheck
	 * @throws Exception
	 */
	public static void setIgnoreCheck(IEntity iEntity, boolean bIgnoreCheck) {
		iEntity.set(IGNORECHECK, bIgnoreCheck ? 1 : 0);
	}

	/**
	 * 获取是否忽略检查
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean isIgnoreCheck(IEntity iEntity)  throws Exception {
		return DataTypeUtils.getIntegerValue(iEntity.get(IGNORECHECK), 0) == 1;
	}

	/**
	 * 设置是否忽略检查主键
	 * 
	 * @param iEntity
	 * @param bIgnoreCheckKey
	 * @throws Exception
	 */
	public static void setIgnoreCheckKey(IEntity iEntity, boolean bIgnoreCheckKey) {
		iEntity.set(IGNORECHECKKEY, bIgnoreCheckKey ? 1 : 0);
	}

	/**
	 * 获取是否忽略检查主键
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean isIgnoreCheckKey(IEntity iEntity) throws Exception {
		return DataTypeUtils.getIntegerValue(iEntity.get(IGNORECHECKKEY), 0) == 1;
	}

	/**
	 * 获取原来的数据主键
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static Object getOriginKey(IEntity iEntity){
		return iEntity.get(ORIGINKEY);
	}

	/**
	 * 获取上一次的数据对象
	 * 
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static IEntity getLast(IEntity iEntity){
		Object objValue = iEntity.get(LASTENTITY);
		if (objValue == null)
			return null;
		if (objValue instanceof IEntity)
			return (IEntity) objValue;
		return null;
	}

	/**
	 * 设置上一次的数据对象
	 * 
	 * @param iEntity
	 * @param lastEntity
	 * @throws Exception
	 */
	public static void setLast(IEntity iEntity, IEntity lastEntity){
		if (lastEntity == null) {
			iEntity.reset(LASTENTITY);
		} else {
			iEntity.set(LASTENTITY, lastEntity);
		}
	}

	@Override
	public void copyTo(IEntity iEntity) {
		if (this.paramMap != null) {
			for (java.util.Map.Entry<String, Object> entry : this.paramMap.entrySet()) {
				iEntity.set(entry.getKey(), entry.getValue());
			}
		}
	}
	
	

	@Override
	public void copyToIf(IEntity iEntity) {
		if (this.paramMap != null) {
			for (java.util.Map.Entry<String, Object> entry : this.paramMap.entrySet()) {
				if(!iEntity.contains(entry.getKey())) {
					iEntity.set(entry.getKey(), entry.getValue());
				}
			}
		}
	}


	@JsonAnyGetter
	public Map<String, Object> any() {
		return this.paramMap;
	}
	
	@JsonIgnore
	protected void setAny(Map<String, Object> map){
		this.setAny(map, false);
	}
	
	@JsonIgnore
	protected void setAny(Map<String, Object> map, boolean bCopyMode){
		if(bCopyMode) {
			if(map == null) {
				this.paramMap = null;
			}
			else {
				this.paramMap = this.createAny();
				this.paramMap.putAll(map);
			}
		}
		else {
			this.paramMap = map;
		}
		
	}
	
	@JsonIgnore
	protected Map<String, Object> createAny(){
		return new HashMap<String, Object>();
	}
	
	@JsonIgnore
	@Override
	public void putAll(Map<String, Object> map) {
		Assert.notNull(map, "传入参数无效");
		for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			this.set(entry.getKey(), entry.getValue());
		}
	}
	
	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}
}
