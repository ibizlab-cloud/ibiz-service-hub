package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCTRLLOGICGROUP 过滤器对象
 */
public class PSCtrlLogicGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSCtrlLogicGroupFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ctrltype__eq(String value){
        this.setFieldCond("ctrltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ppsctrllogicgroupid__eq(String value){
        this.setFieldCond("ppsctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ppsctrllogicgroupname__eq(String value){
        this.setFieldCond("ppsctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ppsctrllogicgroupname__like(String value){
        this.setFieldCond("ppsctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
