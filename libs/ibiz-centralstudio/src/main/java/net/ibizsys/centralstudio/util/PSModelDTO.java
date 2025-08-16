package net.ibizsys.centralstudio.util;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PSModelDTO extends PSModelDTOBase {

	 @JsonIgnore
	private String srfKey = null;
	
	@Override
    @JsonIgnore
	public String getSrfkey() {
		return srfKey;
	}
	
	 @JsonIgnore
	public void setSrfKey(String srfKey) {
		this.srfKey = srfKey;
	}

}
