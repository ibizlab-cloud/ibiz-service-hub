package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNSYSAPP 过滤器对象
 */
public class PSDevSlnSysAppFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnSysAppFilter(){
    
    }      

    /**
     * 设置属性[开发系统应用标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter psdevslnsysappid__eq(String value){
        this.setFieldCond("psdevslnsysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统应用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter psdevslnsysappname__like(String value){
        this.setFieldCond("psdevslnsysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter devsysstate__eq(String value){
        this.setFieldCond("devsysstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用框架]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAppFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", Conditions.EQ, value);
        return this;
    }

}