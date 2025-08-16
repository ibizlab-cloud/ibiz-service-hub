package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSTHRESHOLD 过滤器对象
 */
public class PSThresholdFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSThresholdFilter(){
    
    }      

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值项图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter psthresholdgroupid__eq(String value){
        this.setFieldCond("psthresholdgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter psthresholdgroupname__eq(String value){
        this.setFieldCond("psthresholdgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter psthresholdgroupname__like(String value){
        this.setFieldCond("psthresholdgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter psthresholdname__like(String value){
        this.setFieldCond("psthresholdname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter textpslanresid__eq(String value){
        this.setFieldCond("textpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter textpslanresname__eq(String value){
        this.setFieldCond("textpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter textpslanresname__like(String value){
        this.setFieldCond("textpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
