package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFIUDETAIL 过滤器对象
 */
public class PSDEFIUDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFIUDetailFilter(){
    
    }      

    /**
     * 设置属性[更新明细名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdefiudetailname__like(String value){
        this.setFieldCond("psdefiudetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdefiupdateid__eq(String value){
        this.setFieldCond("psdefiupdateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdefiupdatename__eq(String value){
        this.setFieldCond("psdefiupdatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单项更新]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdefiupdatename__like(String value){
        this.setFieldCond("psdefiupdatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdeformdetailid__eq(String value){
        this.setFieldCond("psdeformdetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdeformdetailname__eq(String value){
        this.setFieldCond("psdeformdetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIUDetailFilter psdeformdetailname__like(String value){
        this.setFieldCond("psdeformdetailname", Conditions.LIKE, value);
        return this;
    }

}
