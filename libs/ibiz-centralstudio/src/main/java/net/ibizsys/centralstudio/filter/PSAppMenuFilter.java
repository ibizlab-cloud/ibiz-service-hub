package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPMENU 过滤器对象
 */
public class PSAppMenuFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppMenuFilter(){
    
    }      

    /**
     * 设置属性[应用菜单样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter appmenustyle__eq(String value){
        this.setFieldCond("appmenustyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[Flex横轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter flexalign__eq(String value){
        this.setFieldCond("flexalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex布局方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter flexdir__eq(String value){
        this.setFieldCond("flexdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex纵轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter flexvalign__eq(String value){
        this.setFieldCond("flexvalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

}
