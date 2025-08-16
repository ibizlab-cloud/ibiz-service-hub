package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFPROCSUBWF 过滤器对象
 */
public class PSWFProcSubWFFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFProcSubWFFilter(){
    
    }      

    /**
     * 设置属性[流程数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpsdedsid__eq(String value){
        this.setFieldCond("embedpsdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpsdedsname__eq(String value){
        this.setFieldCond("embedpsdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpsdedsname__like(String value){
        this.setFieldCond("embedpsdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfdeid__eq(String value){
        this.setFieldCond("embedpswfdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfdename__eq(String value){
        this.setFieldCond("embedpswfdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfdename__like(String value){
        this.setFieldCond("embedpswfdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfid__eq(String value){
        this.setFieldCond("embedpswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfname__eq(String value){
        this.setFieldCond("embedpswfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfname__like(String value){
        this.setFieldCond("embedpswfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfverid__eq(String value){
        this.setFieldCond("embedpswfverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfvername__eq(String value){
        this.setFieldCond("embedpswfvername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter embedpswfvername__like(String value){
        this.setFieldCond("embedpswfvername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter pswfprocessid__eq(String value){
        this.setFieldCond("pswfprocessid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter pswfprocessname__eq(String value){
        this.setFieldCond("pswfprocessname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter pswfprocessname__like(String value){
        this.setFieldCond("pswfprocessname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子流程名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter pswfprocsubwfname__like(String value){
        this.setFieldCond("pswfprocsubwfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcSubWFFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
