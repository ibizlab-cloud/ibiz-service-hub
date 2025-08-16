package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCALENDARITEMRV 过滤器对象
 */
public class PSSysCalendarItemRVFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysCalendarItemRVFilter(){
    
    }      

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[日历项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter pssyscalendaritemid__eq(String value){
        this.setFieldCond("pssyscalendaritemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[日历项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter pssyscalendaritemname__eq(String value){
        this.setFieldCond("pssyscalendaritemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[日历项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter pssyscalendaritemname__like(String value){
        this.setFieldCond("pssyscalendaritemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemRVFilter pssyscalendaritemrvname__like(String value){
        this.setFieldCond("pssyscalendaritemrvname", Conditions.LIKE, value);
        return this;
    }

}
