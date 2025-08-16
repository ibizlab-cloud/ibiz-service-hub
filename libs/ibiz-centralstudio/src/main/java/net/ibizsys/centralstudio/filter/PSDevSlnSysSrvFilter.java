package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNSYSSRV 过滤器对象
 */
public class PSDevSlnSysSrvFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnSysSrvFilter(){
    
    }      

    /**
     * 设置属性[开发系统后台服务体系标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysSrvFilter psdevslnsyssrvid__eq(String value){
        this.setFieldCond("psdevslnsyssrvid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysSrvFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台服务体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysSrvFilter psdevslnsyssrvname__like(String value){
        this.setFieldCond("psdevslnsyssrvname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysSrvFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysSrvFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysSrvFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

}