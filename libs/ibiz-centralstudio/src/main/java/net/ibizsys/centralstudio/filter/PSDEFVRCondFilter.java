package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFVRCOND 过滤器对象
 */
public class PSDEFVRCondFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFVRCondFilter(){
    
    }      

    /**
     * 设置属性[条件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter condtype__eq(String value){
        this.setFieldCond("condtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集实体附加约束属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter extmajorpsdefid__eq(String value){
        this.setFieldCond("extmajorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集实体附加约束属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter extmajorpsdefname__eq(String value){
        this.setFieldCond("extmajorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集实体附加约束属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter extmajorpsdefname__like(String value){
        this.setFieldCond("extmajorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[当前实体附加约束属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter extminorpsdefid__eq(String value){
        this.setFieldCond("extminorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前实体附加约束属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter extminorpsdefname__eq(String value){
        this.setFieldCond("extminorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前实体附加约束属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter extminorpsdefname__like(String value){
        this.setFieldCond("extminorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组合方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter groupop__eq(String value){
        this.setFieldCond("groupop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter majorpsdedsid__eq(String value){
        this.setFieldCond("majorpsdedsid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("majorpsdedstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter majorpsdedsname__eq(String value){
        this.setFieldCond("majorpsdedsname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("majorpsdedstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter majorpsdedsname__like(String value){
        this.setFieldCond("majorpsdedsname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("majorpsdedstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter majorpsdeid__eq(String value){
        this.setFieldCond("majorpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter majorpsdename__eq(String value){
        this.setFieldCond("majorpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter majorpsdename__like(String value){
        this.setFieldCond("majorpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter paramtype__eq(String value){
        this.setFieldCond("paramtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter ppsdefvrcondid__eq(String value){
        this.setFieldCond("ppsdefvrcondid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter ppsdefvrcondname__eq(String value){
        this.setFieldCond("ppsdefvrcondname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter ppsdefvrcondname__like(String value){
        this.setFieldCond("ppsdefvrcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作符号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[条件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefvrcondname__like(String value){
        this.setFieldCond("psdefvrcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefvrid__eq(String value){
        this.setFieldCond("psdefvrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefvrname__eq(String value){
        this.setFieldCond("psdefvrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter psdefvrname__like(String value){
        this.setFieldCond("psdefvrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[规则信息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter ripslanresid__eq(String value){
        this.setFieldCond("ripslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[规则信息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter ripslanresname__eq(String value){
        this.setFieldCond("ripslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[规则信息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFVRCondFilter ripslanresname__like(String value){
        this.setFieldCond("ripslanresname", Conditions.LIKE, value);
        return this;
    }

}
