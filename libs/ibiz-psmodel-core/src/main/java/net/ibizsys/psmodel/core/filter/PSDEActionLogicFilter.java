package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACTIONLOGIC 过滤器对象
 */
public class PSDEActionLogicFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEActionLogicFilter(){
    
    }      

    /**
     * 设置属性[附加模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter attachmode__eq(String value){
        this.setFieldCond("attachmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[同步事件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter datasyncevent__eq(Integer value){
        this.setFieldCond("datasyncevent", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeactionid__eq(String value){
        this.setFieldCond("dstpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeactionname__eq(String value){
        this.setFieldCond("dstpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeactionname__like(String value){
        this.setFieldCond("dstpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedataqueryid__eq(String value){
        this.setFieldCond("dstpsdedataqueryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedataqueryname__eq(String value){
        this.setFieldCond("dstpsdedataqueryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedataqueryname__like(String value){
        this.setFieldCond("dstpsdedataqueryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedatasetid__eq(String value){
        this.setFieldCond("dstpsdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedatasetname__eq(String value){
        this.setFieldCond("dstpsdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标结果集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedatasetname__like(String value){
        this.setFieldCond("dstpsdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeid__eq(String value){
        this.setFieldCond("dstpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdename__eq(String value){
        this.setFieldCond("dstpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdename__like(String value){
        this.setFieldCond("dstpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[错误消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter errorpslanresid__eq(String value){
        this.setFieldCond("errorpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[错误消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter errorpslanresname__eq(String value){
        this.setFieldCond("errorpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[错误消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter errorpslanresname__like(String value){
        this.setFieldCond("errorpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑所有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter logicholder__eq(Integer value){
        this.setFieldCond("logicholder", EQ, value);
        return this;
    }

    /**
     * 设置属性[主关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter majorpsderid__eq(String value){
        this.setFieldCond("majorpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter majorpsdername__eq(String value){
        this.setFieldCond("majorpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[主关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter majorpsdername__like(String value){
        this.setFieldCond("majorpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[从关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter minorpsderid__eq(String value){
        this.setFieldCond("minorpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter minorpsdername__eq(String value){
        this.setFieldCond("minorpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[从关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter minorpsdername__like(String value){
        this.setFieldCond("minorpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionlogicname__eq(String value){
        this.setFieldCond("psdeactionlogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionlogicname__like(String value){
        this.setFieldCond("psdeactionlogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdedatasyncid__eq(String value){
        this.setFieldCond("psdedatasyncid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdedatasyncname__eq(String value){
        this.setFieldCond("psdedatasyncname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据同步]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdedatasyncname__like(String value){
        this.setFieldCond("psdedatasyncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdenotifyid__eq(String value){
        this.setFieldCond("psdenotifyid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdenotifyname__eq(String value){
        this.setFieldCond("psdenotifyname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdenotifyname__like(String value){
        this.setFieldCond("psdenotifyname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysdelogicnodeid__eq(String value){
        this.setFieldCond("pssysdelogicnodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysdelogicnodename__eq(String value){
        this.setFieldCond("pssysdelogicnodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysdelogicnodename__like(String value){
        this.setFieldCond("pssysdelogicnodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssequenceid__eq(String value){
        this.setFieldCond("pssyssequenceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssequencename__eq(String value){
        this.setFieldCond("pssyssequencename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssequencename__like(String value){
        this.setFieldCond("pssyssequencename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", EQ, value);
        return this;
    }

}
