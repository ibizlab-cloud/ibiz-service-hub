package net.ibizsys.central.database;

public class SimpleDBDialect extends DBDialectBase{

	private String strDBType = null;
	
	public SimpleDBDialect(String strDBType) {
		this.strDBType = strDBType;
	}
	
	@Override
	public String getDBType() {
		return this.strDBType;
	}

}
