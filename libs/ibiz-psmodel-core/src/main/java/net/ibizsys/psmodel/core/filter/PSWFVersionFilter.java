package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFVERSION 过滤器对象
 */
public class PSWFVersionFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWFVersionFilter(){
    
    }      

    /**
     * 设置属性[动态实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter psdynainstname__eq(String value){
        this.setFieldCond("psdynainstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter psdynainstname__like(String value){
        this.setFieldCond("psdynainstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssyswfmodeid__eq(String value){
        this.setFieldCond("pssyswfmodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssyswfmodename__eq(String value){
        this.setFieldCond("pssyswfmodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssyswfmodename__like(String value){
        this.setFieldCond("pssyswfmodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfname__like(String value){
        this.setFieldCond("pswfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfsteppscodelistid__eq(String value){
        this.setFieldCond("wfsteppscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfsteppscodelistname__eq(String value){
        this.setFieldCond("wfsteppscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfsteppscodelistname__like(String value){
        this.setFieldCond("wfsteppscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfvermode__eq(String value){
        this.setFieldCond("wfvermode", EQ, value);
        return this;
    }

}
