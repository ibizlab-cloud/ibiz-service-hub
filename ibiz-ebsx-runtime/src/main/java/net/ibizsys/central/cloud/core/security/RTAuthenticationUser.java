package net.ibizsys.central.cloud.core.security;

import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthGrantedSystem;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthMember;

import java.util.List;

/**
 *  cloud中RT认证用户
 *
 * @author xignzi
 * @date 2023/12/8
 */
public class RTAuthenticationUser extends AuthenticationUser{

    private String dc;

    private String employeeNumber;

    private String employeeType;

    private String title;

    private String mobile;

    private String telephoneNumber;

    private String identificationNumber;

    private String postalAddress;


    private List<AuthMember> memberOf;

    private List<AuthGrantedSystem> grants;

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public List<AuthMember> getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(List<AuthMember> memberOf) {
        this.memberOf = memberOf;
    }

    public List<AuthGrantedSystem> getGrants() {
        return grants;
    }

    public void setGrants(List<AuthGrantedSystem> grants) {
        this.grants = grants;
    }
}
