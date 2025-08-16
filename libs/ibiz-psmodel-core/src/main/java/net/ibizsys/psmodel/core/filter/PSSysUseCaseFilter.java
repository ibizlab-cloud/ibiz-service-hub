package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUSECASE 过滤器对象
 */
public class PSSysUseCaseFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysUseCaseFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssysusecasecatid__eq(String value){
        this.setFieldCond("pssysusecasecatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssysusecasecatname__eq(String value){
        this.setFieldCond("pssysusecasecatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssysusecasecatname__like(String value){
        this.setFieldCond("pssysusecasecatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag__eq(String value){
        this.setFieldCond("uctag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag__like(String value){
        this.setFieldCond("uctag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag2__eq(String value){
        this.setFieldCond("uctag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag2__like(String value){
        this.setFieldCond("uctag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag3__eq(String value){
        this.setFieldCond("uctag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例标记3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag3__like(String value){
        this.setFieldCond("uctag3", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag4__eq(String value){
        this.setFieldCond("uctag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例标记4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter uctag4__like(String value){
        this.setFieldCond("uctag4", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例编号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usecasesn__eq(String value){
        this.setFieldCond("usecasesn", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("usercasesn", EQ, value);
        return this;
    }

    /**
     * 设置属性[用例编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usecasesn__like(String value){
        this.setFieldCond("usecasesn", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("usercasesn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
