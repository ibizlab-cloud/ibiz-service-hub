package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDBIDXFIELD 过滤器对象
 */
public class PSDEDBIdxFieldFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDBIdxFieldFilter(){
    
    }      

    /**
     * 设置属性[索引属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdedbidxfieldname__like(String value){
        this.setFieldCond("psdedbidxfieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据库索引]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdedbindexid__eq(String value){
        this.setFieldCond("psdedbindexid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据库索引]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdedbindexname__eq(String value){
        this.setFieldCond("psdedbindexname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据库索引]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdedbindexname__like(String value){
        this.setFieldCond("psdedbindexname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIdxFieldFilter sortdir__eq(String value){
        this.setFieldCond("sortdir", Conditions.EQ, value);
        return this;
    }

}
