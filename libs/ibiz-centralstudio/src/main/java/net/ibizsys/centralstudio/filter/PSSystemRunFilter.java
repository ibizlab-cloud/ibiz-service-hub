package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTEMRUN 过滤器对象
 */
public class PSSystemRunFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSystemRunFilter(){
    
    }      

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappid2__eq(String value){
        this.setFieldCond("pssysappid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname2__eq(String value){
        this.setFieldCond("pssysappname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysappname2__like(String value){
        this.setFieldCond("pssysappname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysbdinstcfgid__eq(String value){
        this.setFieldCond("pssysbdinstcfgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysbdinstcfgname__eq(String value){
        this.setFieldCond("pssysbdinstcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssysbdinstcfgname__like(String value){
        this.setFieldCond("pssysbdinstcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemasid__eq(String value){
        this.setFieldCond("pssystemasid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用服务器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemasname__eq(String value){
        this.setFieldCond("pssystemasname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用服务器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemasname__like(String value){
        this.setFieldCond("pssystemasname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemdbcfgid__eq(String value){
        this.setFieldCond("pssystemdbcfgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemdbcfgname__eq(String value){
        this.setFieldCond("pssystemdbcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行数据库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemdbcfgname__like(String value){
        this.setFieldCond("pssystemdbcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter pssystemrunname__like(String value){
        this.setFieldCond("pssystemrunname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter runpssysdynamodelid__eq(String value){
        this.setFieldCond("runpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter runpssysdynamodelname__eq(String value){
        this.setFieldCond("runpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemRunFilter runpssysdynamodelname__like(String value){
        this.setFieldCond("runpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

}
