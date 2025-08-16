package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPSBITEMRS 过滤器对象
 */
public class PSAppSBItemRSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppSBItemRSFilter(){
    
    }      

    /**
     * 设置属性[从项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter cpsappsbitemid__eq(String value){
        this.setFieldCond("cpsappsbitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter cpsappsbitemname__eq(String value){
        this.setFieldCond("cpsappsbitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从项目]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter cpsappsbitemname__like(String value){
        this.setFieldCond("cpsappsbitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter ppsappsbitemid__eq(String value){
        this.setFieldCond("ppsappsbitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter ppsappsbitemname__eq(String value){
        this.setFieldCond("ppsappsbitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主项目]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter ppsappsbitemname__like(String value){
        this.setFieldCond("ppsappsbitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter psappsbitemrsname__like(String value){
        this.setFieldCond("psappsbitemrsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用故事板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter psappstoryboardid__eq(String value){
        this.setFieldCond("psappstoryboardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用故事板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter psappstoryboardname__eq(String value){
        this.setFieldCond("psappstoryboardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用故事板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter psappstoryboardname__like(String value){
        this.setFieldCond("psappstoryboardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
