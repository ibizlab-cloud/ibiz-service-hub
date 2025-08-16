package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDBINDEX 过滤器对象
 */
public class PSDEDBIndexFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDBIndexFilter(){
    
    }      

    /**
     * 设置属性[索引类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter indextype__eq(String value){
        this.setFieldCond("indextype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库索引标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdedbindexname__like(String value){
        this.setFieldCond("psdedbindexname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

}
