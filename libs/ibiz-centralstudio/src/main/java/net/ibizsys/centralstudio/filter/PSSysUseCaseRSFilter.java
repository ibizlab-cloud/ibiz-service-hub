package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUSECASERS 过滤器对象
 */
public class PSSysUseCaseRSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUseCaseRSFilter(){
    
    }      

    /**
     * 设置属性[源操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysactorid__eq(String value){
        this.setFieldCond("ppssysactorid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysactorname__eq(String value){
        this.setFieldCond("ppssysactorname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源操作者]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysactorname__like(String value){
        this.setFieldCond("ppssysactorname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysusecaseid__eq(String value){
        this.setFieldCond("ppssysusecaseid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppssysusercaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysusecasename__eq(String value){
        this.setFieldCond("ppssysusecasename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppssysusercasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter ppssysusecasename__like(String value){
        this.setFieldCond("ppssysusecasename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppssysusercasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysactorid__eq(String value){
        this.setFieldCond("pssysactorid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标操作者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysactorname__eq(String value){
        this.setFieldCond("pssysactorname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标操作者]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysactorname__like(String value){
        this.setFieldCond("pssysactorname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecaseid__eq(String value){
        this.setFieldCond("pssysusecaseid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasename__eq(String value){
        this.setFieldCond("pssysusecasename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasename__like(String value){
        this.setFieldCond("pssysusecasename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统用例关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter pssysusecasersname__like(String value){
        this.setFieldCond("pssysusecasersname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysusercasersname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter rsmode__eq(String value){
        this.setFieldCond("rsmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter rstype__eq(String value){
        this.setFieldCond("rstype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUseCaseRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
