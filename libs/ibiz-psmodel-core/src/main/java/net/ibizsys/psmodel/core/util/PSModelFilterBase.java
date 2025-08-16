package net.ibizsys.psmodel.core.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class PSModelFilterBase implements IPSModelFilter, ISearchContext {

	@JsonIgnore
	private Map<String, Object> paramMap = null;

	@JsonIgnore
	private List<ISearchCond> searchCondList = null;

	@JsonIgnore
	public void setPage(int nPage) {
		this.set(PARAM_PAGE, nPage);
	}
	
	@JsonIgnore
	public void setSize(int nSize) {
		this.set(PARAM_SIZE, nSize);
	}
	
	
	
	@JsonIgnore
	public int getPage() {
		
		return asInteger(this.get(PARAM_PAGE), 0);
		
	}
	
	@JsonIgnore
	public int getSize() {
		return asInteger(this.get(PARAM_SIZE), 1000);
	}
	
	@Override
	@JsonIgnore
	public Pageable getPageable() {
		return PageRequest.of(getPage(), getSize());
	}
	
	

	@Override
	@JsonIgnore
	public Sort getPageSort() {
		Object sortInfo = this.get(PARAM_SORT);
		if(!ObjectUtils.isEmpty(sortInfo)) {
			String strSortInfo = sortInfo.toString();
			List<Sort.Order> list = new ArrayList<Sort.Order>();
			String[] items = strSortInfo.split("[,]");
			if (items.length == 1) {
				list.add(Sort.Order.asc(items[0]));
			} else if (items.length == 2) {
				if ("DESC".equalsIgnoreCase(items[1])) {
					list.add(Sort.Order.desc(items[0]));
				} else {
					list.add(Sort.Order.asc(items[0]));
				}
			}
			
			if (list.size() > 0) {
				return Sort.by(list);
			}
		}
		return Sort.unsorted();
	}

	
	
	
	@Override
	public Object get(String strName) {
		if (!StringUtils.hasLength(strName)) {
			return null;
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
	protected  Map<String, Object> createAny() {
		return new LinkedHashMap<String, Object>();
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
	public void setFieldCond(String strFieldName, String strCondOp, Object objValue) {
		
		if(!ISNULL.equals(strCondOp)
				&& !ISNOTNULL.equals(strCondOp)) {
			
			String strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
			set(strParamName, objValue);
		}
	}
	
	@Override
	public Object getFieldCond(String strFieldName, String strCondOp) {
		String strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
		return this.get(strParamName);
	}
	
	final static public Integer asInteger(Object objValue, Integer def){
		try {
			return getIntegerValue(objValue, def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	/**
	 * 转换对象值到整形值
	 * 
	 * @param objValue
	 * @param def
	 * @return
	 * @throws Exception
	 */
	final static public Integer getIntegerValue(Object objValue, Integer def) throws Exception {
		if (objValue == null) return def;

		if (objValue instanceof Integer) {
			return (Integer) objValue;
		}
		
		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		strValue = strValue.replace(",", "");
		return Integer.parseInt(strValue);
	}
	
	
	@Override
	@JsonProperty("searchconds")
	public List<ISearchCond> getSearchConds() {
		return this.searchCondList;
	}
	
	@JsonProperty("searchconds")
	public void setSearchConds(List<ISearchCond> list) {
		this.searchCondList = list;
	}
	
	@JsonIgnore
	public List<ISearchCond> getSearchCondsIf() {
		if(this.searchCondList == null) {
			this.searchCondList = new ArrayList<ISearchCond>();
		}
		return this.searchCondList;
	}
}
