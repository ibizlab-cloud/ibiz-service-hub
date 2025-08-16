package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPSBITEM 过滤器对象
 */
public class PSAppSBItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppSBItemFilter(){
    
    }      

    /**
     * 设置属性[项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter itemtype__eq(String value){
        this.setFieldCond("itemtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappsbitemname__like(String value){
        this.setFieldCond("psappsbitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用故事板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappstoryboardid__eq(String value){
        this.setFieldCond("psappstoryboardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用故事板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappstoryboardname__eq(String value){
        this.setFieldCond("psappstoryboardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用故事板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappstoryboardname__like(String value){
        this.setFieldCond("psappstoryboardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter pssysusecaseid__eq(String value){
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
    public PSAppSBItemFilter pssysusecasename__eq(String value){
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
    public PSAppSBItemFilter pssysusecasename__like(String value){
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
    public PSAppSBItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户定义项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppSBItemFilter userflag__eq(Integer value){
        this.setFieldCond("userflag", Conditions.EQ, value);
        return this;
    }

}
