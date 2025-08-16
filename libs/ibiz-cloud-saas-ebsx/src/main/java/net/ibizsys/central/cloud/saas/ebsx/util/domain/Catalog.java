package net.ibizsys.central.cloud.saas.ebsx.util.domain;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Catalog
{
	private String code;
	private String name;


	@JsonProperty("items")
	private List<Option> options = new ArrayList<>();


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
