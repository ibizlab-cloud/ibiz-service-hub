package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEUTIL 过滤器对象
 */
public class PSDEUtilFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEUtilFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter psdeutilname__eq(String value){
        this.setFieldCond("psdeutilname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdeutildename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter psdeutilname__like(String value){
        this.setFieldCond("psdeutilname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdeutildename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde10id__eq(String value){
        this.setFieldCond("utilpsde10id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde10name__eq(String value){
        this.setFieldCond("utilpsde10name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde10name__like(String value){
        this.setFieldCond("utilpsde10name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde11id__eq(String value){
        this.setFieldCond("utilpsde11id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde11name__eq(String value){
        this.setFieldCond("utilpsde11name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde11name__like(String value){
        this.setFieldCond("utilpsde11name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde12id__eq(String value){
        this.setFieldCond("utilpsde12id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde12name__eq(String value){
        this.setFieldCond("utilpsde12name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde12name__like(String value){
        this.setFieldCond("utilpsde12name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde13id__eq(String value){
        this.setFieldCond("utilpsde13id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde13name__eq(String value){
        this.setFieldCond("utilpsde13name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde13name__like(String value){
        this.setFieldCond("utilpsde13name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde14id__eq(String value){
        this.setFieldCond("utilpsde14id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde14name__eq(String value){
        this.setFieldCond("utilpsde14name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde14name__like(String value){
        this.setFieldCond("utilpsde14name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde15id__eq(String value){
        this.setFieldCond("utilpsde15id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde15name__eq(String value){
        this.setFieldCond("utilpsde15name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde15name__like(String value){
        this.setFieldCond("utilpsde15name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde16id__eq(String value){
        this.setFieldCond("utilpsde16id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde16name__eq(String value){
        this.setFieldCond("utilpsde16name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde16name__like(String value){
        this.setFieldCond("utilpsde16name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde17id__eq(String value){
        this.setFieldCond("utilpsde17id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde17name__eq(String value){
        this.setFieldCond("utilpsde17name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde17name__like(String value){
        this.setFieldCond("utilpsde17name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde18id__eq(String value){
        this.setFieldCond("utilpsde18id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde18name__eq(String value){
        this.setFieldCond("utilpsde18name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde18name__like(String value){
        this.setFieldCond("utilpsde18name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde19id__eq(String value){
        this.setFieldCond("utilpsde19id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde19name__eq(String value){
        this.setFieldCond("utilpsde19name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde19name__like(String value){
        this.setFieldCond("utilpsde19name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde20id__eq(String value){
        this.setFieldCond("utilpsde20id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde20name__eq(String value){
        this.setFieldCond("utilpsde20name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde20name__like(String value){
        this.setFieldCond("utilpsde20name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde2id__eq(String value){
        this.setFieldCond("utilpsde2id", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde2name__eq(String value){
        this.setFieldCond("utilpsde2name", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde2name__like(String value){
        this.setFieldCond("utilpsde2name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde3id__eq(String value){
        this.setFieldCond("utilpsde3id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde3name__eq(String value){
        this.setFieldCond("utilpsde3name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde3name__like(String value){
        this.setFieldCond("utilpsde3name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde4id__eq(String value){
        this.setFieldCond("utilpsde4id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde4name__eq(String value){
        this.setFieldCond("utilpsde4name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde4name__like(String value){
        this.setFieldCond("utilpsde4name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde5id__eq(String value){
        this.setFieldCond("utilpsde5id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde5name__eq(String value){
        this.setFieldCond("utilpsde5name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde5name__like(String value){
        this.setFieldCond("utilpsde5name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde6id__eq(String value){
        this.setFieldCond("utilpsde6id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde6name__eq(String value){
        this.setFieldCond("utilpsde6name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde6name__like(String value){
        this.setFieldCond("utilpsde6name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde7id__eq(String value){
        this.setFieldCond("utilpsde7id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde7name__eq(String value){
        this.setFieldCond("utilpsde7name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde7name__like(String value){
        this.setFieldCond("utilpsde7name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde8id__eq(String value){
        this.setFieldCond("utilpsde8id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde8name__eq(String value){
        this.setFieldCond("utilpsde8name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde8name__like(String value){
        this.setFieldCond("utilpsde8name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde9id__eq(String value){
        this.setFieldCond("utilpsde9id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde9name__eq(String value){
        this.setFieldCond("utilpsde9name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsde9name__like(String value){
        this.setFieldCond("utilpsde9name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsdeid__eq(String value){
        this.setFieldCond("utilpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsdename__eq(String value){
        this.setFieldCond("utilpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utilpsdename__like(String value){
        this.setFieldCond("utilpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilFilter utiltype__eq(String value){
        this.setFieldCond("utiltype", EQ, value);
        return this;
    }

}
