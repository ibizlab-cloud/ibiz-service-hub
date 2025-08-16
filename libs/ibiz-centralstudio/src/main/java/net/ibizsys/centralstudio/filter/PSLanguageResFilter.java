package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSLANGUAGERES 过滤器对象
 */
public class PSLanguageResFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSLanguageResFilter(){
    
    }      

    /**
     * 设置属性[语言资源标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter lanrestag__eq(String value){
        this.setFieldCond("lanrestag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言资源标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter lanrestag__like(String value){
        this.setFieldCond("lanrestag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter lanrestype__eq(String value){
        this.setFieldCond("lanrestype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pslanguageresname__like(String value){
        this.setFieldCond("pslanguageresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssyslanresid__eq(String value){
        this.setFieldCond("pssyslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssyslanresname__eq(String value){
        this.setFieldCond("pssyslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssyslanresname__like(String value){
        this.setFieldCond("pssyslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pswfname__like(String value){
        this.setFieldCond("pswfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter userdata__eq(String value){
        this.setFieldCond("userdata", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageResFilter userdata__like(String value){
        this.setFieldCond("userdata", Conditions.LIKE, value);
        return this;
    }

}
