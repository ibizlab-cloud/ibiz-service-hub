package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCDETEMPL 过滤器对象
 */
public class PSDCDETemplFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCDETemplFilter(){
    
    }      

    /**
     * 设置属性[云实体模板标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCDETemplFilter psdcdetemplid__eq(String value){
        this.setFieldCond("psdcdetemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云实体模板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCDETemplFilter psdcdetemplname__like(String value){
        this.setFieldCond("psdcdetemplname", Conditions.LIKE, value);
        return this;
    }

}