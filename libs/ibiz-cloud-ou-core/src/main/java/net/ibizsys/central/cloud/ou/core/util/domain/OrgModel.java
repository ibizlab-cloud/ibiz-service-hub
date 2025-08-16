package net.ibizsys.central.cloud.ou.core.util.domain;

import java.util.HashSet;
import java.util.Set;

import net.ibizsys.central.cloud.core.util.domain.Organization;

public class OrgModel {

	private Organization organization = null;
	
	private Set<String> superOrgIdList = new HashSet<String>();
	
	private Set<String> subOrgIdList = new HashSet<String>();

	
	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Set<String> getSuperOrgIds() {
		return superOrgIdList;
	}

	public void setSuperOrgIds(Set<String> superOrgIdList) {
		this.superOrgIdList = superOrgIdList;
	}

	public Set<String> getSubOrgIds() {
		return subOrgIdList;
	}

	public void setSubOrgIds(Set<String> subOrgIdList) {
		this.subOrgIdList = subOrgIdList;
	}
	
	
	
}
