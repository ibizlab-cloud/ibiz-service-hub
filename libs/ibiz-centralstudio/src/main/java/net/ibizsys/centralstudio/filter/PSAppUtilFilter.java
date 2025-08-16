package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUTIL 过滤器对象
 */
public class PSAppUtilFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppUtilFilter(){
    
    }      

    /**
     * 设置属性[功能配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter psapputilname__like(String value){
        this.setFieldCond("psapputilname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde2id__eq(String value){
        this.setFieldCond("utilpsde2id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde2name__eq(String value){
        this.setFieldCond("utilpsde2name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde2name__like(String value){
        this.setFieldCond("utilpsde2name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde3id__eq(String value){
        this.setFieldCond("utilpsde3id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde3name__eq(String value){
        this.setFieldCond("utilpsde3name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde3name__like(String value){
        this.setFieldCond("utilpsde3name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde4id__eq(String value){
        this.setFieldCond("utilpsde4id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde4name__eq(String value){
        this.setFieldCond("utilpsde4name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde4name__like(String value){
        this.setFieldCond("utilpsde4name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde5id__eq(String value){
        this.setFieldCond("utilpsde5id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde5name__eq(String value){
        this.setFieldCond("utilpsde5name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde5name__like(String value){
        this.setFieldCond("utilpsde5name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde6id__eq(String value){
        this.setFieldCond("utilpsde6id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde6name__eq(String value){
        this.setFieldCond("utilpsde6name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde6name__like(String value){
        this.setFieldCond("utilpsde6name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde7id__eq(String value){
        this.setFieldCond("utilpsde7id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde7name__eq(String value){
        this.setFieldCond("utilpsde7name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde7name__like(String value){
        this.setFieldCond("utilpsde7name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde8id__eq(String value){
        this.setFieldCond("utilpsde8id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde8name__eq(String value){
        this.setFieldCond("utilpsde8name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde8name__like(String value){
        this.setFieldCond("utilpsde8name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde9id__eq(String value){
        this.setFieldCond("utilpsde9id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde9name__eq(String value){
        this.setFieldCond("utilpsde9name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde9name__like(String value){
        this.setFieldCond("utilpsde9name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsdeid__eq(String value){
        this.setFieldCond("utilpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsdename__eq(String value){
        this.setFieldCond("utilpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsdename__like(String value){
        this.setFieldCond("utilpsdename", Conditions.LIKE, value);
        return this;
    }

}
