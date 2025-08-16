package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCMODELTEMPL 过滤器对象
 */
public class PSDCModelTemplFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCModelTemplFilter(){
    
    }      

    /**
     * 设置属性[云模型模板标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCModelTemplFilter psdcmodeltemplid__eq(String value){
        this.setFieldCond("psdcmodeltemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云模型模板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCModelTemplFilter psdcmodeltemplname__like(String value){
        this.setFieldCond("psdcmodeltemplname", Conditions.LIKE, value);
        return this;
    }

}