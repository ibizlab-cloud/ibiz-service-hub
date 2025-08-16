package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBPROC 过滤器对象
 */
public class PSSysDBProcFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDBProcFilter(){
    
    }      

    /**
     * 设置属性[过程名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbprocname__like(String value){
        this.setFieldCond("pssysdbprocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
