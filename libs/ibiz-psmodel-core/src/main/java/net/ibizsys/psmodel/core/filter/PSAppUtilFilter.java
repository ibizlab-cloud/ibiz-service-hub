package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUTIL 过滤器对象
 */
public class PSAppUtilFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppUtilFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter psapputilname__eq(String value){
        this.setFieldCond("psapputilname", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter psapputilname__like(String value){
        this.setFieldCond("psapputilname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde2id__eq(String value){
        this.setFieldCond("utilpsde2id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde2name__eq(String value){
        this.setFieldCond("utilpsde2name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde2name__like(String value){
        this.setFieldCond("utilpsde2name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde3id__eq(String value){
        this.setFieldCond("utilpsde3id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde3name__eq(String value){
        this.setFieldCond("utilpsde3name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde3name__like(String value){
        this.setFieldCond("utilpsde3name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde4id__eq(String value){
        this.setFieldCond("utilpsde4id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde4name__eq(String value){
        this.setFieldCond("utilpsde4name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde4name__like(String value){
        this.setFieldCond("utilpsde4name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde5id__eq(String value){
        this.setFieldCond("utilpsde5id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde5name__eq(String value){
        this.setFieldCond("utilpsde5name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde5name__like(String value){
        this.setFieldCond("utilpsde5name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde6id__eq(String value){
        this.setFieldCond("utilpsde6id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde6name__eq(String value){
        this.setFieldCond("utilpsde6name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde6name__like(String value){
        this.setFieldCond("utilpsde6name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde7id__eq(String value){
        this.setFieldCond("utilpsde7id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde7name__eq(String value){
        this.setFieldCond("utilpsde7name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde7name__like(String value){
        this.setFieldCond("utilpsde7name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde8id__eq(String value){
        this.setFieldCond("utilpsde8id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde8name__eq(String value){
        this.setFieldCond("utilpsde8name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde8name__like(String value){
        this.setFieldCond("utilpsde8name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde9id__eq(String value){
        this.setFieldCond("utilpsde9id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde9name__eq(String value){
        this.setFieldCond("utilpsde9name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsde9name__like(String value){
        this.setFieldCond("utilpsde9name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsdeid__eq(String value){
        this.setFieldCond("utilpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsdename__eq(String value){
        this.setFieldCond("utilpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilFilter utilpsdename__like(String value){
        this.setFieldCond("utilpsdename", LIKE, value);
        return this;
    }

}
