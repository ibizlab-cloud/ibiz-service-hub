package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEPRINT 过滤器对象
 */
public class PSDEPrintFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEPrintFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter getdatapsdeactionid__eq(String value){
        this.setFieldCond("getdatapsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[读取实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter getdatapsdeactionname__eq(String value){
        this.setFieldCond("getdatapsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[读取实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter getdatapsdeactionname__like(String value){
        this.setFieldCond("getdatapsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[明细数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdeprintname__like(String value){
        this.setFieldCond("psdeprintname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter readpsdeopprivid__eq(String value){
        this.setFieldCond("readpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter readpsdeopprivname__eq(String value){
        this.setFieldCond("readpsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter readpsdeopprivname__like(String value){
        this.setFieldCond("readpsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[报表格式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter reporttype__eq(String value){
        this.setFieldCond("reporttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
