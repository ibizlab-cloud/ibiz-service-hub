package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEGEIUDETAIL 过滤器对象
 */
public class PSDEGEIUDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEGEIUDetailFilter(){
    
    }      

    /**
     * 设置属性[更新成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegeiudetailname__like(String value){
        this.setFieldCond("psdegeiudetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格编辑项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegeiupdateid__eq(String value){
        this.setFieldCond("psdegeiupdateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格编辑项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegeiupdatename__eq(String value){
        this.setFieldCond("psdegeiupdatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格编辑项更新]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegeiupdatename__like(String value){
        this.setFieldCond("psdegeiupdatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegridcolid__eq(String value){
        this.setFieldCond("psdegridcolid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegridcolname__eq(String value){
        this.setFieldCond("psdegridcolname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegridcolname__like(String value){
        this.setFieldCond("psdegridcolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIUDetailFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

}
