package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDEVIEW 过滤器对象
 */
public class PSAppDEViewFilter extends PSAppViewFilter {

    public PSAppDEViewFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDEViewFilter psappdeviewname__like(String value){
        this.setFieldCond("psappdeviewname", Conditions.LIKE, value);
        return this;
    }

}
