package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDATAENTITY 过滤器对象
 */
public class PSDataEntityFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDataEntityFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", EQ, value);
        return this;
    }

    /**
     * 设置属性[审计模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter auditmode__eq(Integer value){
        this.setFieldCond("auditmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据变更日志模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter datachglogmode__eq(Integer value){
        this.setFieldCond("datachglogmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据导入导出能力]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dataimpexpflag__eq(Integer value){
        this.setFieldCond("dataimpexpflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter desn__like(String value){
        this.setFieldCond("desn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter detype__eq(Integer value){
        this.setFieldCond("detype", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dslink__eq(String value){
        this.setFieldCond("dslink", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dslink__like(String value){
        this.setFieldCond("dslink", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dynamicmode__eq(Integer value){
        this.setFieldCond("dynamicmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[支持移动端]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter enablemob__eq(Integer value){
        this.setFieldCond("enablemob", EQ, value);
        return this;
    }

    /**
     * 设置属性[索引类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter indexdetype__eq(String value){
        this.setFieldCond("indexdetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter msactionlogicflag__eq(Integer value){
        this.setFieldCond("msactionlogicflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdataentityname__eq(String value){
        this.setFieldCond("psdataentityname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdataentityname__like(String value){
        this.setFieldCond("psdataentityname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认属性输入提示集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdefinputtipsetid__eq(String value){
        this.setFieldCond("psdefinputtipsetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认属性输入提示集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdefinputtipsetname__eq(String value){
        this.setFieldCond("psdefinputtipsetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认属性输入提示集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdefinputtipsetname__like(String value){
        this.setFieldCond("psdefinputtipsetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdynadetemplid__eq(String value){
        this.setFieldCond("psdynadetemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdynadetemplname__eq(String value){
        this.setFieldCond("psdynadetemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdynadetemplname__like(String value){
        this.setFieldCond("psdynadetemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认帮助模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pshelpmoduleid__eq(String value){
        this.setFieldCond("pshelpmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认帮助模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pshelpmodulename__eq(String value){
        this.setFieldCond("pshelpmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认帮助模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pshelpmodulename__like(String value){
        this.setFieldCond("pshelpmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[TESTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupid__testnull(Integer value){
        this.setFieldCond("pssysmodelgroupid", TESTNULL, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标志]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[SaaS构型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter saasmode__eq(Integer value){
        this.setFieldCond("saasmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务API模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter serviceapiflag__eq(Integer value){
        this.setFieldCond("serviceapiflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[存储模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter storagemode__eq(Integer value){
        this.setFieldCond("storagemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter subsysmodule__eq(Integer value){
        this.setFieldCond("subsysmodule", EQ, value);
        return this;
    }

    /**
     * 设置属性[主表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter tablename__like(String value){
        this.setFieldCond("tablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[多视图模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter viewlevel__eq(Integer value){
        this.setFieldCond("viewlevel", EQ, value);
        return this;
    }

}
