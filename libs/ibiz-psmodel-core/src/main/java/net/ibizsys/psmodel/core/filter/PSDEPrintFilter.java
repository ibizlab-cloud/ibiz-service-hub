package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEPRINT 过滤器对象
 */
public class PSDEPrintFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEPrintFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter getdatapsdeactionid__eq(String value){
        this.setFieldCond("getdatapsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter getdatapsdeactionname__eq(String value){
        this.setFieldCond("getdatapsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter getdatapsdeactionname__like(String value){
        this.setFieldCond("getdatapsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[明细数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdeprintname__eq(String value){
        this.setFieldCond("psdeprintname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psdeprintname__like(String value){
        this.setFieldCond("psdeprintname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter readpsdeopprivid__eq(String value){
        this.setFieldCond("readpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter readpsdeopprivname__eq(String value){
        this.setFieldCond("readpsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter readpsdeopprivname__like(String value){
        this.setFieldCond("readpsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[报表格式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter reporttype__eq(String value){
        this.setFieldCond("reporttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEPrintFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
