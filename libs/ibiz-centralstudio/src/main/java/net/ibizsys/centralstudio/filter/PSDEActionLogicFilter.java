package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACTIONLOGIC 过滤器对象
 */
public class PSDEActionLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEActionLogicFilter(){
    
    }      

    /**
     * 设置属性[附加模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter attachmode__eq(String value){
        this.setFieldCond("attachmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[同步事件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter datasyncevent__eq(Integer value){
        this.setFieldCond("datasyncevent", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeactionid__eq(String value){
        this.setFieldCond("dstpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeactionname__eq(String value){
        this.setFieldCond("dstpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeactionname__like(String value){
        this.setFieldCond("dstpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedataqueryid__eq(String value){
        this.setFieldCond("dstpsdedataqueryid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedataqueryname__eq(String value){
        this.setFieldCond("dstpsdedataqueryname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedataqueryname__like(String value){
        this.setFieldCond("dstpsdedataqueryname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedatasetid__eq(String value){
        this.setFieldCond("dstpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedatasetname__eq(String value){
        this.setFieldCond("dstpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标结果集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdedatasetname__like(String value){
        this.setFieldCond("dstpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdeid__eq(String value){
        this.setFieldCond("dstpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdename__eq(String value){
        this.setFieldCond("dstpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter dstpsdename__like(String value){
        this.setFieldCond("dstpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[错误消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter errorpslanresid__eq(String value){
        this.setFieldCond("errorpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[错误消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter errorpslanresname__eq(String value){
        this.setFieldCond("errorpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[错误消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter errorpslanresname__like(String value){
        this.setFieldCond("errorpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑所有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter logicholder__eq(Integer value){
        this.setFieldCond("logicholder", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter majorpsderid__eq(String value){
        this.setFieldCond("majorpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter majorpsdername__eq(String value){
        this.setFieldCond("majorpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter majorpsdername__like(String value){
        this.setFieldCond("majorpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter minorpsderid__eq(String value){
        this.setFieldCond("minorpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter minorpsdername__eq(String value){
        this.setFieldCond("minorpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter minorpsdername__like(String value){
        this.setFieldCond("minorpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionlogicname__eq(String value){
        this.setFieldCond("psdeactionlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionlogicname__like(String value){
        this.setFieldCond("psdeactionlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdedatasyncid__eq(String value){
        this.setFieldCond("psdedatasyncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdedatasyncname__eq(String value){
        this.setFieldCond("psdedatasyncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据同步]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdedatasyncname__like(String value){
        this.setFieldCond("psdedatasyncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdenotifyid__eq(String value){
        this.setFieldCond("psdenotifyid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdenotifyname__eq(String value){
        this.setFieldCond("psdenotifyname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter psdenotifyname__like(String value){
        this.setFieldCond("psdenotifyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysdelogicnodeid__eq(String value){
        this.setFieldCond("pssysdelogicnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysdelogicnodename__eq(String value){
        this.setFieldCond("pssysdelogicnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysdelogicnodename__like(String value){
        this.setFieldCond("pssysdelogicnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssequenceid__eq(String value){
        this.setFieldCond("pssyssequenceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssequencename__eq(String value){
        this.setFieldCond("pssyssequencename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssequencename__like(String value){
        this.setFieldCond("pssyssequencename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionLogicFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", Conditions.EQ, value);
        return this;
    }

}
