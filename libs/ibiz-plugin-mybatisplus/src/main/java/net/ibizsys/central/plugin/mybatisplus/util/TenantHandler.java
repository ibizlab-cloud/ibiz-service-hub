package net.ibizsys.central.plugin.mybatisplus.util;

import org.springframework.util.StringUtils;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.database.ISysDBTableRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;


public class TenantHandler implements com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler {

    private String tenantIdCloumn = "SRFDCID";

    @Override
    public Expression getTenantId(boolean where) {
        IUserContext userContext = UserContext.getCurrent();
        if (userContext == null)
            return new StringValue("");
        return new StringValue(StringUtils.isEmpty(userContext.getTenant()) ? "" : userContext.getTenant());
    }

    public void getTenantIdColumn(String tenantIdCloumn){
        this.tenantIdCloumn = tenantIdCloumn;
    }

    @Override
    public String getTenantIdColumn() {
    	ISysDBSchemeRuntime iSysDBSchemeRuntime = DBSchemeContextHolder.peek();
    	if(iSysDBSchemeRuntime != null && StringUtils.hasLength(iSysDBSchemeRuntime.getSaaSDCIdColumnName())) {
    		return iSysDBSchemeRuntime.getSaaSDCIdColumnName();
    	}
        return tenantIdCloumn;
    }

    @Override
    public boolean doTableFilter(String tableName) {
        String strTableName = tableName.replace("`", "");
        ISysDBSchemeRuntime iSysDBSchemeRuntime = DBSchemeContextHolder.peek();
        if (iSysDBSchemeRuntime == null)
            return true;
        ISysDBTableRuntime iSysDBTableRuntime = iSysDBSchemeRuntime.getSysDBTableRuntime(strTableName, true);
        if (iSysDBTableRuntime != null) {
            return !iSysDBTableRuntime.isTenantMode();
        }
        return true;
    }
    
    

}
