package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMAPLOGIC 过滤器对象
 */
public class PSSysMapLogicFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysMapLogicFilter(){
    
    }      

    /**
     * 设置属性[目标逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter dstlogictype__eq(String value){
        this.setFieldCond("dstlogictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysmaplogicname__eq(String value){
        this.setFieldCond("pssysmaplogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysmaplogicname__like(String value){
        this.setFieldCond("pssysmaplogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysmapviewid__eq(String value){
        this.setFieldCond("pssysmapviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysmapviewname__eq(String value){
        this.setFieldCond("pssysmapviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysmapviewname__like(String value){
        this.setFieldCond("pssysmapviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysviewlogicid__eq(String value){
        this.setFieldCond("pssysviewlogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysviewlogicname__eq(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysviewlogicname__like(String value){
        this.setFieldCond("pssysviewlogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[触发类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter triggertype__eq(String value){
        this.setFieldCond("triggertype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapLogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
