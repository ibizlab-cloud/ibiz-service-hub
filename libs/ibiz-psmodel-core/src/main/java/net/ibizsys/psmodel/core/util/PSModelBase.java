package net.ibizsys.psmodel.core.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class PSModelBase implements IPSModel {

	@JsonIgnore
	private Map<String, Object> paramMap = null;

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
	public void resetAll(boolean baseAttrOnly) {
		onResetAll(baseAttrOnly);
	}

	protected void onResetAll(boolean baseAttrOnly) {

		this.paramMap = null;

	}
	
	@Override
	public void copyTo(IPSModel iPSModel) {
		if (this.paramMap != null) {
			for (java.util.Map.Entry<String, Object> entry : this.paramMap.entrySet()) {
				iPSModel.set(entry.getKey(), entry.getValue());
			}
		}
	}
	
	
	
	
	@Override
	public void copyToIf(IPSModel iPSModel) {
		if (this.paramMap != null) {
			for (java.util.Map.Entry<String, Object> entry : this.paramMap.entrySet()) {
				if(iPSModel.contains(entry.getKey())) {
					continue;
				}
				iPSModel.set(entry.getKey(), entry.getValue());
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
	protected  Map<String, Object> createAny() {
		return new LinkedHashMap<String, Object>();
	}
	
	@JsonIgnore
	public void putAll(Map<String, Object> map) {
		Assert.notNull(map, "传入参数无效");
		for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			this.set(entry.getKey(), entry.getValue());
		}
	}

	@Override
	@JsonIgnore
	public String getId() {
		return (String)this.get("id");
	}

	@Override
	@JsonIgnore
	public void setId(String id) {
		this.set("id", id);
	}

	@Override
	@JsonIgnore
	public String getName() {
		return (String)this.get("name");
	}

	@Override
	@JsonIgnore
	public void setName(String name) {
		this.set("name", name);
	}
	
	
	
}
