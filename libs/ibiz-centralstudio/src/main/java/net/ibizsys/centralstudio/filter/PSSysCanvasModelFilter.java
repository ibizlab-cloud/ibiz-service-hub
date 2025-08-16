package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCANVASMODEL 过滤器对象
 */
public class PSSysCanvasModelFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysCanvasModelFilter(){
    
    }      

    /**
     * 设置属性[系统画布]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCanvasModelFilter pssyscanvasid__eq(String value){
        this.setFieldCond("pssyscanvasid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关模型名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCanvasModelFilter pssyscanvasmodelname__like(String value){
        this.setFieldCond("pssyscanvasmodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统画布]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCanvasModelFilter pssyscanvasname__eq(String value){
        this.setFieldCond("pssyscanvasname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统画布]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCanvasModelFilter pssyscanvasname__like(String value){
        this.setFieldCond("pssyscanvasname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCanvasModelFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
