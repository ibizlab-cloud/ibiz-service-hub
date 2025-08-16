package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMODELFOLDER 过滤器对象
 */
public class PSSysModelFolderFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysModelFolderFilter(){
    
    }      

    /**
     * 设置属性[父目录]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter ppssysmodelfolderid__eq(String value){
        this.setFieldCond("ppssysmodelfolderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父目录]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter ppssysmodelfoldername__eq(String value){
        this.setFieldCond("ppssysmodelfoldername", EQ, value);
        return this;
    }

    /**
     * 设置属性[父目录]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter ppssysmodelfoldername__like(String value){
        this.setFieldCond("ppssysmodelfoldername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter pssysmodelfoldername__eq(String value){
        this.setFieldCond("pssysmodelfoldername", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter pssysmodelfoldername__like(String value){
        this.setFieldCond("pssysmodelfoldername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelFolderFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
