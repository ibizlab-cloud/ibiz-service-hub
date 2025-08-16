package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDQJOIN 过滤器对象
 */
public class PSDEDQJoinFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDQJoinFilter(){
    
    }      

    /**
     * 设置属性[连接实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter joinpsdeid__eq(String value){
        this.setFieldCond("joinpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter joinpsdename__eq(String value){
        this.setFieldCond("joinpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter joinpsdename__like(String value){
        this.setFieldCond("joinpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父数据查询连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter ppsdedqjoinid__eq(String value){
        this.setFieldCond("ppsdedqjoinid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据查询连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter ppsdedqjoinname__eq(String value){
        this.setFieldCond("ppsdedqjoinname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据查询连接]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter ppsdedqjoinname__like(String value){
        this.setFieldCond("ppsdedqjoinname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接信息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdedqjoinname__like(String value){
        this.setFieldCond("psdedqjoinname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[连接方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdejointypeid__eq(String value){
        this.setFieldCond("psdejointypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdejointypename__eq(String value){
        this.setFieldCond("psdejointypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接方式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdejointypename__like(String value){
        this.setFieldCond("psdejointypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQJoinFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
