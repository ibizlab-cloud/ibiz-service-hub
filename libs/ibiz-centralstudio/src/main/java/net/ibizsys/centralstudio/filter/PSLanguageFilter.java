package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSLANGUAGE 过滤器对象
 */
public class PSLanguageFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSLanguageFilter(){
    
    }      

    /**
     * 设置属性[平台语言名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

}
