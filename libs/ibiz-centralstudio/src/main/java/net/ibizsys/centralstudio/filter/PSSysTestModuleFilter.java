package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTESTMODULE 过滤器对象
 */
public class PSSysTestModuleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysTestModuleFilter(){
    
    }      

    /**
     * 设置属性[模块类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter moduletype__eq(String value){
        this.setFieldCond("moduletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestmodulename__like(String value){
        this.setFieldCond("pssystestmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestprjid__eq(String value){
        this.setFieldCond("pssystestprjid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestprjname__eq(String value){
        this.setFieldCond("pssystestprjname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试项目]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter pssystestprjname__like(String value){
        this.setFieldCond("pssystestprjname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
