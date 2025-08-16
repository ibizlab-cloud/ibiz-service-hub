package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVUSER 过滤器对象
 */
public class PSDevUserFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevUserFilter(){
    
    }      

    /**
     * 设置属性[应用中心用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevUserFilter psdevuserid__eq(String value){
        this.setFieldCond("psdevuserid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心用户名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevUserFilter psdevusername__like(String value){
        this.setFieldCond("psdevusername", Conditions.LIKE, value);
        return this;
    }

}