package net.ibizsys.central.database;

/**
 * 数据源辅助对象
 * @author lionlau
 *
 */
public class DataSourceUtils {

	private static DataSourceUtils instance = null;
	
	public static DataSourceUtils getInstance() {
		if(DataSourceUtils.instance == null) {
			DataSourceUtils.instance = new DataSourceUtils();
		}
		return DataSourceUtils.instance;
	}
	
	public static void setInstance(DataSourceUtils instance) {
		DataSourceUtils.instance = instance;
	}
	
	
	
}
