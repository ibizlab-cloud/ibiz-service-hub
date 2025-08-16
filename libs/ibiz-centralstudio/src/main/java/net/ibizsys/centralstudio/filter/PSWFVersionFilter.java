package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFVERSION 过滤器对象
 */
public class PSWFVersionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFVersionFilter(){
    
    }      

    /**
     * 设置属性[动态实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter psdynainstname__eq(String value){
        this.setFieldCond("psdynainstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter psdynainstname__like(String value){
        this.setFieldCond("psdynainstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssyswfmodeid__eq(String value){
        this.setFieldCond("pssyswfmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssyswfmodename__eq(String value){
        this.setFieldCond("pssyswfmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pssyswfmodename__like(String value){
        this.setFieldCond("pssyswfmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfname__like(String value){
        this.setFieldCond("pswfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfsteppscodelistid__eq(String value){
        this.setFieldCond("wfsteppscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfsteppscodelistname__eq(String value){
        this.setFieldCond("wfsteppscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfsteppscodelistname__like(String value){
        this.setFieldCond("wfsteppscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFVersionFilter wfvermode__eq(String value){
        this.setFieldCond("wfvermode", Conditions.EQ, value);
        return this;
    }

}
