package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBEDIMENSION 过滤器对象
 */
public class PSSysBICubeDimensionFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBICubeDimensionFilter(){
    
    }      

    /**
     * 设置属性[维度类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter bidimensiontype__eq(String value){
        this.setFieldCond("bidimensiontype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[参数界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter parampsdeuiactionid__eq(String value){
        this.setFieldCond("parampsdeuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[参数界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter parampsdeuiactionname__eq(String value){
        this.setFieldCond("parampsdeuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[参数界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter parampsdeuiactionname__like(String value){
        this.setFieldCond("parampsdeuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体维度名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubedimensionname__eq(String value){
        this.setFieldCond("pssysbicubedimensionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubedimensionname__like(String value){
        this.setFieldCond("pssysbicubedimensionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbidimensionid__eq(String value){
        this.setFieldCond("pssysbidimensionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbidimensionname__eq(String value){
        this.setFieldCond("pssysbidimensionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbidimensionname__like(String value){
        this.setFieldCond("pssysbidimensionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysdbvfid__eq(String value){
        this.setFieldCond("pssysdbvfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysdbvfname__eq(String value){
        this.setFieldCond("pssysdbvfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysdbvfname__like(String value){
        this.setFieldCond("pssysdbvfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
