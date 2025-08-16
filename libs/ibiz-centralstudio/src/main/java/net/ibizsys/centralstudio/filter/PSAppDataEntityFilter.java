package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDATAENTITY 过滤器对象
 */
public class PSAppDataEntityFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppDataEntityFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[访问控制方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter decodename__like(String value){
        this.setFieldCond("decodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter defgroupmode__eq(String value){
        this.setFieldCond("defgroupmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主实体模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter majorflag__eq(Integer value){
        this.setFieldCond("majorflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter mdpsdeviewid__eq(String value){
        this.setFieldCond("mdpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter mdpsdeviewname__eq(String value){
        this.setFieldCond("mdpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter mdpsdeviewname__like(String value){
        this.setFieldCond("mdpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter ppsappdataentityid__eq(String value){
        this.setFieldCond("ppsappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter ppsappdataentityname__eq(String value){
        this.setFieldCond("ppsappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter ppsappdataentityname__like(String value){
        this.setFieldCond("ppsappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psappmoduleid__eq(String value){
        this.setFieldCond("psappmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psappmodulename__eq(String value){
        this.setFieldCond("psappmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psappmodulename__like(String value){
        this.setFieldCond("psappmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[控制实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[控制实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[控制实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体模块标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter sdpsdeviewid__eq(String value){
        this.setFieldCond("sdpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter sdpsdeviewname__eq(String value){
        this.setFieldCond("sdpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter sdpsdeviewname__like(String value){
        this.setFieldCond("sdpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDataEntityFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
