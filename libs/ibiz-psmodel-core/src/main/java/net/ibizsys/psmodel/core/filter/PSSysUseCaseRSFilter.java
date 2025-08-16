package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUSECASERS 过滤器对象
 */
public class PSSysUseCaseRSFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysUseCaseRSFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[源操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysactorid__eq(String value){
        this.setFieldCond("ppssysactorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[源操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysactorname__eq(String value){
        this.setFieldCond("ppssysactorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[源操作者]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysactorname__like(String value){
        this.setFieldCond("ppssysactorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[源用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysusecaseid__eq(String value){
        this.setFieldCond("ppssysusecaseid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppssysusercaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[源用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysusecasename__eq(String value){
        this.setFieldCond("ppssysusecasename", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppssysusercasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[源用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysusecasename__like(String value){
        this.setFieldCond("ppssysusecasename", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppssysusercasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysactorid__eq(String value){
        this.setFieldCond("pssysactorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysactorname__eq(String value){
        this.setFieldCond("pssysactorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标操作者]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysactorname__like(String value){
        this.setFieldCond("pssysactorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例关系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasersname__eq(String value){
        this.setFieldCond("pssysusecasersname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasersname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统用例关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasersname__like(String value){
        this.setFieldCond("pssysusecasersname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasersname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter rsmode__eq(String value){
        this.setFieldCond("rsmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter rstype__eq(String value){
        this.setFieldCond("rstype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
