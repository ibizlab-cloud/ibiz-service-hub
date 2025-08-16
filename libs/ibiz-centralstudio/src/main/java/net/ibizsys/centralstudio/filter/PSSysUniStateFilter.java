package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUNISTATE 过滤器对象
 */
public class PSSysUniStateFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUniStateFilter(){
    
    }      

    /**
     * 设置属性[目录2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key2psdefid__eq(String value){
        this.setFieldCond("key2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目录1属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key2psdefname__eq(String value){
        this.setFieldCond("key2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目录1属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key2psdefname__like(String value){
        this.setFieldCond("key2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目录2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key3psdefid__eq(String value){
        this.setFieldCond("key3psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目录2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key3psdefname__eq(String value){
        this.setFieldCond("key3psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目录2属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key3psdefname__like(String value){
        this.setFieldCond("key3psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目录3属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key4psdefid__eq(String value){
        this.setFieldCond("key4psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目录3属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key4psdefname__eq(String value){
        this.setFieldCond("key4psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目录3属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter key4psdefname__like(String value){
        this.setFieldCond("key4psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统状态协同名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter pssysunistatename__like(String value){
        this.setFieldCond("pssysunistatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state2psdefid__eq(String value){
        this.setFieldCond("state2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state2psdefname__eq(String value){
        this.setFieldCond("state2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态2属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state2psdefname__like(String value){
        this.setFieldCond("state2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态3属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state3psdefid__eq(String value){
        this.setFieldCond("state3psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态3属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state3psdefname__eq(String value){
        this.setFieldCond("state3psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态3属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state3psdefname__like(String value){
        this.setFieldCond("state3psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态4属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state4psdefid__eq(String value){
        this.setFieldCond("state4psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态4属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state4psdefname__eq(String value){
        this.setFieldCond("state4psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态4属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state4psdefname__like(String value){
        this.setFieldCond("state4psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态5属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state5psdefid__eq(String value){
        this.setFieldCond("state5psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态5属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state5psdefname__eq(String value){
        this.setFieldCond("state5psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态5属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state5psdefname__like(String value){
        this.setFieldCond("state5psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态6属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state6psdefid__eq(String value){
        this.setFieldCond("state6psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态6属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state6psdefname__eq(String value){
        this.setFieldCond("state6psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态6属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state6psdefname__like(String value){
        this.setFieldCond("state6psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态7属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state7psdefid__eq(String value){
        this.setFieldCond("state7psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态7属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state7psdefname__eq(String value){
        this.setFieldCond("state7psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态7属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state7psdefname__like(String value){
        this.setFieldCond("state7psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态8属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state8psdefid__eq(String value){
        this.setFieldCond("state8psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态8属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state8psdefname__eq(String value){
        this.setFieldCond("state8psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态8属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter state8psdefname__like(String value){
        this.setFieldCond("state8psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态1属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态1属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态1属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[唯一业务标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter uniquetag__like(String value){
        this.setFieldCond("uniquetag", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[统一状态类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter unistatetype__eq(String value){
        this.setFieldCond("unistatetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUniStateFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
