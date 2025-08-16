package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUITHEME 过滤器对象
 */
public class PSAppUIThemeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppUIThemeFilter(){
    
    }      

    /**
     * 设置属性[主题名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIThemeFilter psappuithemename__like(String value){
        this.setFieldCond("psappuithemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIThemeFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIThemeFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIThemeFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUIThemeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
