package net.ibizsys.central.cloud.ou.core.util.domain;

import java.util.HashSet;
import java.util.Set;

import net.ibizsys.central.cloud.core.util.domain.Department;

public class DeptModel {

	private Department department = null;
	
	private Set<String> superDeptIdList = new HashSet<String>();
	
	private Set<String> subDeptIdList = new HashSet<String>();

	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<String> getSuperDeptIds() {
		return superDeptIdList;
	}

	public void setSuperDeptIds(Set<String> superDeptIdList) {
		this.superDeptIdList = superDeptIdList;
	}

	public Set<String> getSubDeptIds() {
		return subDeptIdList;
	}

	public void setSubDeptIds(Set<String> subDeptIdList) {
		this.subDeptIdList = subDeptIdList;
	}
	
}
