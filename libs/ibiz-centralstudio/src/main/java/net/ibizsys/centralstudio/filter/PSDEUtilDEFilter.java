package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEUTILDE 过滤器对象
 */
public class PSDEUtilDEFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEUtilDEFilter(){
    
    }      

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter psdeutildename__like(String value){
        this.setFieldCond("psdeutildename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde10id__eq(String value){
        this.setFieldCond("utilpsde10id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde10name__eq(String value){
        this.setFieldCond("utilpsde10name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde10name__like(String value){
        this.setFieldCond("utilpsde10name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde11id__eq(String value){
        this.setFieldCond("utilpsde11id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde11name__eq(String value){
        this.setFieldCond("utilpsde11name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde11name__like(String value){
        this.setFieldCond("utilpsde11name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde12id__eq(String value){
        this.setFieldCond("utilpsde12id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde12name__eq(String value){
        this.setFieldCond("utilpsde12name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde12name__like(String value){
        this.setFieldCond("utilpsde12name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde13id__eq(String value){
        this.setFieldCond("utilpsde13id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde13name__eq(String value){
        this.setFieldCond("utilpsde13name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde13name__like(String value){
        this.setFieldCond("utilpsde13name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde14id__eq(String value){
        this.setFieldCond("utilpsde14id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde14name__eq(String value){
        this.setFieldCond("utilpsde14name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde14name__like(String value){
        this.setFieldCond("utilpsde14name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde15id__eq(String value){
        this.setFieldCond("utilpsde15id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde15name__eq(String value){
        this.setFieldCond("utilpsde15name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde15name__like(String value){
        this.setFieldCond("utilpsde15name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde16id__eq(String value){
        this.setFieldCond("utilpsde16id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde16name__eq(String value){
        this.setFieldCond("utilpsde16name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde16name__like(String value){
        this.setFieldCond("utilpsde16name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde17id__eq(String value){
        this.setFieldCond("utilpsde17id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde17name__eq(String value){
        this.setFieldCond("utilpsde17name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde17name__like(String value){
        this.setFieldCond("utilpsde17name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde18id__eq(String value){
        this.setFieldCond("utilpsde18id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde18name__eq(String value){
        this.setFieldCond("utilpsde18name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde18name__like(String value){
        this.setFieldCond("utilpsde18name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde19id__eq(String value){
        this.setFieldCond("utilpsde19id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde19name__eq(String value){
        this.setFieldCond("utilpsde19name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde19name__like(String value){
        this.setFieldCond("utilpsde19name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde20id__eq(String value){
        this.setFieldCond("utilpsde20id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde20name__eq(String value){
        this.setFieldCond("utilpsde20name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde20name__like(String value){
        this.setFieldCond("utilpsde20name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde2id__eq(String value){
        this.setFieldCond("utilpsde2id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde2name__eq(String value){
        this.setFieldCond("utilpsde2name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde2name__like(String value){
        this.setFieldCond("utilpsde2name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde3id__eq(String value){
        this.setFieldCond("utilpsde3id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde3name__eq(String value){
        this.setFieldCond("utilpsde3name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde3name__like(String value){
        this.setFieldCond("utilpsde3name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde4id__eq(String value){
        this.setFieldCond("utilpsde4id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde4name__eq(String value){
        this.setFieldCond("utilpsde4name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde4name__like(String value){
        this.setFieldCond("utilpsde4name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde5id__eq(String value){
        this.setFieldCond("utilpsde5id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde5name__eq(String value){
        this.setFieldCond("utilpsde5name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde5name__like(String value){
        this.setFieldCond("utilpsde5name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde6id__eq(String value){
        this.setFieldCond("utilpsde6id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde6name__eq(String value){
        this.setFieldCond("utilpsde6name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde6name__like(String value){
        this.setFieldCond("utilpsde6name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde7id__eq(String value){
        this.setFieldCond("utilpsde7id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde7name__eq(String value){
        this.setFieldCond("utilpsde7name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde7name__like(String value){
        this.setFieldCond("utilpsde7name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde8id__eq(String value){
        this.setFieldCond("utilpsde8id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde8name__eq(String value){
        this.setFieldCond("utilpsde8name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde8name__like(String value){
        this.setFieldCond("utilpsde8name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde9id__eq(String value){
        this.setFieldCond("utilpsde9id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde9name__eq(String value){
        this.setFieldCond("utilpsde9name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsde9name__like(String value){
        this.setFieldCond("utilpsde9name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsdeid__eq(String value){
        this.setFieldCond("utilpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsdename__eq(String value){
        this.setFieldCond("utilpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utilpsdename__like(String value){
        this.setFieldCond("utilpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUtilDEFilter utiltype__eq(String value){
        this.setFieldCond("utiltype", Conditions.EQ, value);
        return this;
    }

}
