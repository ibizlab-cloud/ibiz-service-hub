package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMODELFOLDERITEM 过滤器对象
 */
public class PSSysModelFolderItemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysModelFolderItemFilter(){
    
    }      

    /**
     * 设置属性[对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter psobjname__like(String value){
        this.setFieldCond("psobjname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[成员类型名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter psobjtypename__like(String value){
        this.setFieldCond("psobjtypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型目录]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter pssysmodelfolderid__eq(String value){
        this.setFieldCond("pssysmodelfolderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter pssysmodelfolderitemname__eq(String value){
        this.setFieldCond("pssysmodelfolderitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter pssysmodelfolderitemname__like(String value){
        this.setFieldCond("pssysmodelfolderitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型目录]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter pssysmodelfoldername__eq(String value){
        this.setFieldCond("pssysmodelfoldername", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型目录]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter pssysmodelfoldername__like(String value){
        this.setFieldCond("pssysmodelfoldername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter studiotag__eq(String value){
        this.setFieldCond("studiotag", EQ, value);
        return this;
    }

    /**
     * 设置属性[工具标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter studiotag2__eq(String value){
        this.setFieldCond("studiotag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[工具类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter studiotype__eq(String value){
        this.setFieldCond("studiotype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
