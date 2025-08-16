package net.ibizsys.central.cloud.core.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UAADEAuthority extends UAAGrantedAuthority {


    private String entity;
	private Integer isAllData;
    private Integer enableorgdr;
    private Integer enabledeptdr;
    private Integer enabledeptbc;
    private Long orgdr;
    private Long deptdr;
    private String deptbc;
    private boolean dataset;
    private String bscope;
    private List<Map<String,String>> deAction = new ArrayList<>();

    public UAADEAuthority(){
        this.setType(TYPE_OPPRIV);
    }

    @Override
    public String getAuthority() {
        return this.getName();
    }

    public void setAuthority(String name) {

    }

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public Integer getIsAllData() {
		return isAllData;
	}

	public void setIsAllData(Integer isAllData) {
		this.isAllData = isAllData;
	}

	public Integer getEnableorgdr() {
		return enableorgdr;
	}

	public void setEnableorgdr(Integer enableorgdr) {
		this.enableorgdr = enableorgdr;
	}

	public Integer getEnabledeptbc() {
		return enabledeptbc;
	}

	public void setEnabledeptbc(Integer enabledeptbc) {
		this.enabledeptbc = enabledeptbc;
	}

	public Long getOrgdr() {
		return orgdr;
	}

	public void setOrgdr(Long orgdr) {
		this.orgdr = orgdr;
	}

	public Long getDeptdr() {
		return deptdr;
	}

	public void setDeptdr(Long deptdr) {
		this.deptdr = deptdr;
	}

	public String getDeptbc() {
		return deptbc;
	}

	public void setDeptbc(String deptbc) {
		this.deptbc = deptbc;
	}

	public boolean isDataset() {
		return dataset;
	}

	public void setDataset(boolean dataset) {
		this.dataset = dataset;
	}

	public String getBscope() {
		return bscope;
	}

	public void setBscope(String bscope) {
		this.bscope = bscope;
	}

	public List<Map<String, String>> getDeAction() {
		return deAction;
	}

	public void setDeAction(List<Map<String, String>> deAction) {
		this.deAction = deAction;
	}

	
	public Integer getEnabledeptdr() {
		return enabledeptdr;
	}

	public void setEnabledeptdr(Integer enabledeptdr) {
		this.enabledeptdr = enabledeptdr;
	}
    
    
}

