package net.ibizsys.central.cloud.core.security;


public class UAAMenuAuthority extends UAAGrantedAuthority {

    private String menuTag;

    public UAAMenuAuthority(){
        this.setType(TYPE_APPMENU);
    }

    @Override
    public String getAuthority() {
        return menuTag;
    }

    public void setAuthority(String menuTag) {
        this.menuTag = menuTag;
    }

    
}

