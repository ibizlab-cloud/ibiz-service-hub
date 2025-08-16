package net.ibizsys.central.plugin.mybatisplus.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.creator.DataSourceCreator;

import net.ibizsys.central.database.IDynaDataSource;


/**
 * 动态数据源配置
 */
public class DynaDataSource extends DynamicRoutingDataSource implements IDynaDataSource {

    @Autowired
    DataSourceCreator dataSourceCreator;

    private ApplicationContext applicationContext = null;
    
    public void setApplicationContext(ApplicationContext applicationContext) {
    	this.applicationContext = applicationContext;
    }
    
    protected ApplicationContext getApplicationContext() {
    	return this.applicationContext;
    }
    
    @Override
    public DataSource getDataSource(String rsinterface) {
        if (StringUtils.isNotBlank(rsinterface)) {
//            if (this.getCurrentDataSources().containsKey(rsinterface)) {
//            	return super.getDataSource(rsinterface);
//            }
            
            if(this.getApplicationContext() != null) {
            	String strBeanName = "dynadatasource_" + rsinterface;
            	if(this.getApplicationContext().containsBean(strBeanName)) {
            		Object objDataSource = this.getApplicationContext().getBean(strBeanName);
                	if(objDataSource instanceof DataSource) {
                		//this.addDataSource(rsinterface, (DataSource)objDataSource);
                		return (DataSource)objDataSource;
                	}
            	}
            }
        }

        return super.getDataSource(rsinterface);
    }

	@Override
	public DataSource getDefaultDataSource() {
		//return this.determineDataSource();
		return super.getDataSource(null);
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		return new DynaDataSourceConnection(this);
	}

}