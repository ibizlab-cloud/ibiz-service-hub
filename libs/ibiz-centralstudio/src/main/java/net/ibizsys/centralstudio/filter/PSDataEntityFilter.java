package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDATAENTITY 过滤器对象
 */
public class PSDataEntityFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDataEntityFilter(){
    
    }      

    /**
     * 设置属性[访问控制体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter accctrlarch__eq(Integer value){
        this.setFieldCond("accctrlarch", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[审计模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter auditmode__eq(Integer value){
        this.setFieldCond("auditmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dataaccmode__eq(Integer value){
        this.setFieldCond("dataaccmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据变更日志模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter datachglogmode__eq(Integer value){
        this.setFieldCond("datachglogmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据导入导出能力]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dataimpexpflag__eq(Integer value){
        this.setFieldCond("dataimpexpflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter desn__like(String value){
        this.setFieldCond("desn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter detype__eq(Integer value){
        this.setFieldCond("detype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dslink__eq(String value){
        this.setFieldCond("dslink", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dslink__like(String value){
        this.setFieldCond("dslink", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter dynamicmode__eq(Integer value){
        this.setFieldCond("dynamicmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[支持移动端]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter enablemob__eq(Integer value){
        this.setFieldCond("enablemob", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[索引类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter indexdetype__eq(String value){
        this.setFieldCond("indexdetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态行为控制模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter msactionlogicflag__eq(Integer value){
        this.setFieldCond("msactionlogicflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdataentityname__like(String value){
        this.setFieldCond("psdataentityname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认属性输入提示集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdefinputtipsetid__eq(String value){
        this.setFieldCond("psdefinputtipsetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认属性输入提示集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdefinputtipsetname__eq(String value){
        this.setFieldCond("psdefinputtipsetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认属性输入提示集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdefinputtipsetname__like(String value){
        this.setFieldCond("psdefinputtipsetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdynadetemplid__eq(String value){
        this.setFieldCond("psdynadetemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdynadetemplname__eq(String value){
        this.setFieldCond("psdynadetemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psdynadetemplname__like(String value){
        this.setFieldCond("psdynadetemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认帮助模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pshelpmoduleid__eq(String value){
        this.setFieldCond("pshelpmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认帮助模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pshelpmodulename__eq(String value){
        this.setFieldCond("pshelpmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认帮助模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pshelpmodulename__like(String value){
        this.setFieldCond("pshelpmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsyssadeid__eq(String value){
        this.setFieldCond("pssubsyssadeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[TESTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupid__testnull(Integer value){
        this.setFieldCond("pssysmodelgroupid", Conditions.TESTNULL, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标志]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[SaaS构型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter saasmode__eq(Integer value){
        this.setFieldCond("saasmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务API模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter serviceapiflag__eq(Integer value){
        this.setFieldCond("serviceapiflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[存储模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter storagemode__eq(Integer value){
        this.setFieldCond("storagemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter subsysmodule__eq(Integer value){
        this.setFieldCond("subsysmodule", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter tablename__like(String value){
        this.setFieldCond("tablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多视图模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDataEntityFilter viewlevel__eq(Integer value){
        this.setFieldCond("viewlevel", Conditions.EQ, value);
        return this;
    }

}
