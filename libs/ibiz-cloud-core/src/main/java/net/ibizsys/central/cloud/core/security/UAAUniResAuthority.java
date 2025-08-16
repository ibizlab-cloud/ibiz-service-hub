package net.ibizsys.central.cloud.core.security;


public class UAAUniResAuthority extends UAAGrantedAuthority {

    private String unionResTag;

    public UAAUniResAuthority(){
        this.setType(TYPE_UNIRES);
    }

    @Override
    public String getAuthority() {
        return unionResTag;
    }

    public void setAuthority(String unionResTag) {
        this.unionResTag = unionResTag;
    }

}

