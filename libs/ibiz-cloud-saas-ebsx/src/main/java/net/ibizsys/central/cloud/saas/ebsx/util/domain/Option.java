package net.ibizsys.central.cloud.saas.ebsx.util.domain;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.ObjectUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Option{
	
	private String id;
	private Object value;
	private String label;
	private List<Option> children;
	private String iconClass;
	private String filter;
	private Boolean disabled;
	private Map<String,Object> extension;


	@JsonIgnore
	private String parent;
	
	@JsonIgnore
	public Set<String> getFilterSet(){
		Set<String> set=new HashSet<>();
		if(!ObjectUtils.isEmpty(filter))
			for(String str:filter.split(";|,"))
				set.add(str);
		return set;
	}
	
	@JsonIgnore
	public String getParent() {
		return parent;
	}

	@JsonIgnore
	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Option> getChildren() {
		return children;
	}

	public void setChildren(List<Option> children) {
		this.children = children;
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

	

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
	
}
