package net.ibizsys.central.cloud.saas.ebsx.util.domain;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CodeList{
	
	
	//@JsonProperty("srfkey")
	private String code;
	private String name;

	

	@JsonProperty("items")
	private List<CodeItem> options = new ArrayList<>();

	public CodeItem findCodeItem(Object value){
		for(CodeItem codeItem : options){
			if(value != null && codeItem.getValue() != null && value.equals(codeItem.getValue()))
				return codeItem;
		}
		return null;
	}

    public CodeItem findChildren(Object value){
        CodeItem resultCodeItem = this.findCodeItem(value);
        List<CodeItem> children = new ArrayList<>();
        for(CodeItem codeItem : options){
            if(value != null && resultCodeItem.getValue() != null && codeItem.getParent() != null && codeItem.getParent().equals(resultCodeItem.getValue()))
                children.add(codeItem);
        }
        resultCodeItem.setChildren(children);
        return resultCodeItem;
    }

    @JsonProperty("srfkey")
	public String getCode() {
		return code;
	}

    @JsonProperty("srfkey")
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("items")
	public List<CodeItem> getOptions() {
		return options;
	}

	@JsonProperty("items")
	public void setOptions(List<CodeItem> options) {
		this.options = options;
	}
    
	@JsonProperty("emptytext")
	public String getEmptytext(){
		return "";
	}
    
}
