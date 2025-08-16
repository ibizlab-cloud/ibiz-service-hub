package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEUIACTION 过滤器对象
 */
public class PSDEUIActionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEUIActionFilter(){
    
    }      

    /**
     * 设置属性[行为级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter actionlevel__eq(Integer value){
        this.setFieldCond("actionlevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据目标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter actiontarget__eq(String value){
        this.setFieldCond("actiontarget", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter caption__like(String value){
        this.setFieldCond("caption", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cmpslanresid__eq(String value){
        this.setFieldCond("cmpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cmpslanresname__eq(String value){
        this.setFieldCond("cmpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[确认消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter cmpslanresname__like(String value){
        this.setFieldCond("cmpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前台处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter frontprotype__eq(String value){
        this.setFieldCond("frontprotype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter mobpsdeviewid__eq(String value){
        this.setFieldCond("mobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter mobpsdeviewname__eq(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端打开视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter mobpsdeviewname__like(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后续界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter nextpsdeuiactionid__eq(String value){
        this.setFieldCond("nextpsdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后续界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter nextpsdeuiactionname__eq(String value){
        this.setFieldCond("nextpsdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后续界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter nextpsdeuiactionname__like(String value){
        this.setFieldCond("nextpsdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter no2psdedataexpid__eq(String value){
        this.setFieldCond("no2psdedataexpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter no2psdedataexpname__eq(String value){
        this.setFieldCond("no2psdedataexpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter no2psdedataexpname__like(String value){
        this.setFieldCond("no2psdedataexpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter noprivdm__eq(Integer value){
        this.setFieldCond("noprivdm", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdedataimpid__eq(String value){
        this.setFieldCond("psdedataimpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdedataimpname__eq(String value){
        this.setFieldCond("psdedataimpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeprintid__eq(String value){
        this.setFieldCond("psdeprintid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeprintname__eq(String value){
        this.setFieldCond("psdeprintname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeprintname__like(String value){
        this.setFieldCond("psdeprintname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewlogicid__eq(String value){
        this.setFieldCond("psdeviewlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewlogicname__eq(String value){
        this.setFieldCond("psdeviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psdeviewlogicname__like(String value){
        this.setFieldCond("psdeviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspdtviewid__eq(String value){
        this.setFieldCond("pssyspdtviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspdtviewname__eq(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预定义界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysuiactionid__eq(String value){
        this.setFieldCond("pssysuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysuiactionname__eq(String value){
        this.setFieldCond("pssysuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysuiactionname__like(String value){
        this.setFieldCond("pssysuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysviewlogicid__eq(String value){
        this.setFieldCond("pssysviewlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysviewlogicname__eq(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pssysviewlogicname__like(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统流程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统流程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统流程]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfname__like(String value){
        this.setFieldCond("pswfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[替换预定义行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter reppssysuiactionid__eq(String value){
        this.setFieldCond("reppssysuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[替换预定义行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter reppssysuiactionname__eq(String value){
        this.setFieldCond("reppssysuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[替换预定义行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter reppssysuiactionname__like(String value){
        this.setFieldCond("reppssysuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[成功消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter smpslanresid__eq(String value){
        this.setFieldCond("smpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[成功消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter smpslanresname__eq(String value){
        this.setFieldCond("smpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[成功消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter smpslanresname__like(String value){
        this.setFieldCond("smpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter uiactiontype__eq(String value){
        this.setFieldCond("uiactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter viewlogictype__eq(String value){
        this.setFieldCond("viewlogictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUIActionFilter vlexecmode__eq(String value){
        this.setFieldCond("vlexecmode", Conditions.EQ, value);
        return this;
    }

}
