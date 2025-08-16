package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDYNADEVIEW 过滤器对象
 */
public class PSAppDynaDEViewFilter extends PSAppViewFilter {

    public PSAppDynaDEViewFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDynaDEViewFilter psappdynadeviewname__like(String value){
        this.setFieldCond("psappdynadeviewname", Conditions.LIKE, value);
        return this;
    }

}
