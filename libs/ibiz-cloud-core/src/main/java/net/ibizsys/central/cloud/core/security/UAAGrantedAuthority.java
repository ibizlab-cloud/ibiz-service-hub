package net.ibizsys.central.cloud.core.security;

public class UAAGrantedAuthority implements IUAAGrantedAuthority {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
    private String type ;
    private String systemid;

    @Override
    public String getAuthority() {
        return null;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSystemid() {
		return systemid;
	}

	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}
    
    
    

}

