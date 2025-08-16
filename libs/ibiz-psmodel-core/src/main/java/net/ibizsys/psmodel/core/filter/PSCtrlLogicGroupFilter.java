package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCTRLLOGICGROUP 过滤器对象
 */
public class PSCtrlLogicGroupFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCtrlLogicGroupFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ctrltype__eq(String value){
        this.setFieldCond("ctrltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ppsctrllogicgroupid__eq(String value){
        this.setFieldCond("ppsctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ppsctrllogicgroupname__eq(String value){
        this.setFieldCond("ppsctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter ppsctrllogicgroupname__like(String value){
        this.setFieldCond("ppsctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlLogicGroupFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
