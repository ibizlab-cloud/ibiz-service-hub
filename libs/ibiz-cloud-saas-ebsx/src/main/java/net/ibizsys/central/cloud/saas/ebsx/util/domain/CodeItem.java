package net.ibizsys.central.cloud.saas.ebsx.util.domain;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CodeItem{
	
	private String id;
	private Object value;
	
	
	private String iconClass;
	private String filter;
	private Boolean disabled;
	
	
	private Map<String,Object> extension;
	

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	private String label;
	
	@JsonProperty("text")
	public String getText(){
		return label;
	}

	@JsonIgnore
	public String getLabel() {
		return label;
	}

	@JsonIgnore
	public void setLabel(String label) {
		this.label = label;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}



	public Map<String, Object> getExtension() {
		return extension;
	}

	public void setExtension(Map<String, Object> extension) {
		this.extension = extension;
	}

	@JsonIgnore
	public Set<String> getFilterSet()
	{
		Set<String> set=new HashSet<>();
		if(!ObjectUtils.isEmpty(filter))
			for(String str:filter.split(";|,"))
				set.add(str);
		return set;
	}
	
	@JsonIgnore
	private String parent;
	
	@JsonIgnore
	public String getParent() {
		return parent;
	}

	@JsonIgnore
	public void setParent(String parent) {
		this.parent = parent;
	}
	
	@JsonProperty("pvalue")
	public String getPvalue() {
		return this.parent;
	}
	
	
	@JsonIgnore
	private List<CodeItem> children;
	
	@JsonIgnore
	public List<CodeItem> getChildren() {
		return children;
	}

	@JsonIgnore
	public void setChildren(List<CodeItem> children) {
		this.children = children;
	}
	
	
	
	
}
