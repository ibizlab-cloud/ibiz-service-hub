package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEUIACTION 过滤器对象
 */
public class PSDEUIActionFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEUIActionFilter(){
    
    }      

    /**
     * 设置属性[行为级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter actionlevel__eq(Integer value){
        this.setFieldCond("actionlevel", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据目标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter actiontarget__eq(String value){
        this.setFieldCond("actiontarget", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter caption__like(String value){
        this.setFieldCond("caption", LIKE, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cmpslanresid__eq(String value){
        this.setFieldCond("cmpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cmpslanresname__eq(String value){
        this.setFieldCond("cmpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cmpslanresname__like(String value){
        this.setFieldCond("cmpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[前台处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter frontprotype__eq(String value){
        this.setFieldCond("frontprotype", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter mobpsdeviewid__eq(String value){
        this.setFieldCond("mobpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter mobpsdeviewname__eq(String value){
        this.setFieldCond("mobpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端打开视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter mobpsdeviewname__like(String value){
        this.setFieldCond("mobpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后续界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter nextpsdeuiactionid__eq(String value){
        this.setFieldCond("nextpsdeuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后续界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter nextpsdeuiactionname__eq(String value){
        this.setFieldCond("nextpsdeuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后续界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter nextpsdeuiactionname__like(String value){
        this.setFieldCond("nextpsdeuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter no2psdedataexpid__eq(String value){
        this.setFieldCond("no2psdedataexpid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter no2psdedataexpname__eq(String value){
        this.setFieldCond("no2psdedataexpname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter no2psdedataexpname__like(String value){
        this.setFieldCond("no2psdedataexpname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter noprivdm__eq(Integer value){
        this.setFieldCond("noprivdm", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeacmodeid__eq(String value){
        this.setFieldCond("psdeacmodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeacmodename__eq(String value){
        this.setFieldCond("psdeacmodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeacmodename__like(String value){
        this.setFieldCond("psdeacmodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdedataimpid__eq(String value){
        this.setFieldCond("psdedataimpid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdedataimpname__eq(String value){
        this.setFieldCond("psdedataimpname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性编辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdefgroupid__eq(String value){
        this.setFieldCond("psdefgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性编辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdefgroupname__eq(String value){
        this.setFieldCond("psdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性编辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdefgroupname__like(String value){
        this.setFieldCond("psdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeprintid__eq(String value){
        this.setFieldCond("psdeprintid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeprintname__eq(String value){
        this.setFieldCond("psdeprintname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeprintname__like(String value){
        this.setFieldCond("psdeprintname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[打开视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewlogicid__eq(String value){
        this.setFieldCond("psdeviewlogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewlogicname__eq(String value){
        this.setFieldCond("psdeviewlogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewlogicname__like(String value){
        this.setFieldCond("psdeviewlogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspdtviewid__eq(String value){
        this.setFieldCond("pssyspdtviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspdtviewname__eq(String value){
        this.setFieldCond("pssyspdtviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预定义界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysuiactionid__eq(String value){
        this.setFieldCond("pssysuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysuiactionname__eq(String value){
        this.setFieldCond("pssysuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysuiactionname__like(String value){
        this.setFieldCond("pssysuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysviewlogicid__eq(String value){
        this.setFieldCond("pssysviewlogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysviewlogicname__eq(String value){
        this.setFieldCond("pssysviewlogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysviewlogicname__like(String value){
        this.setFieldCond("pssysviewlogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统流程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统流程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统流程]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfname__like(String value){
        this.setFieldCond("pswfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[替换预定义行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter reppssysuiactionid__eq(String value){
        this.setFieldCond("reppssysuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[替换预定义行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter reppssysuiactionname__eq(String value){
        this.setFieldCond("reppssysuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[替换预定义行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter reppssysuiactionname__like(String value){
        this.setFieldCond("reppssysuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[成功消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter smpslanresid__eq(String value){
        this.setFieldCond("smpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[成功消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter smpslanresname__eq(String value){
        this.setFieldCond("smpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[成功消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter smpslanresname__like(String value){
        this.setFieldCond("smpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter uiactiontype__eq(String value){
        this.setFieldCond("uiactiontype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter viewlogictype__eq(String value){
        this.setFieldCond("viewlogictype", EQ, value);
        return this;
    }

    /**
     * 设置属性[附加界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter vlexecmode__eq(String value){
        this.setFieldCond("vlexecmode", EQ, value);
        return this;
    }

}
