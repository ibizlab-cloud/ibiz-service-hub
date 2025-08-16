package net.ibizsys.central.cloud.core.security;


public class UAARoleAuthority extends UAAGrantedAuthority {

    private String roleTag;

    public UAARoleAuthority(){
        this.setType(TYPE_ROLE);
    }

    @Override
    public String getAuthority() {
        return roleTag;
    }

    public void setAuthority(String roleTag) {
        this.roleTag = roleTag;
    }
   
    
}

