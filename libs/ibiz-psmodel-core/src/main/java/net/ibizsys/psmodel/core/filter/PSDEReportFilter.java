package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEREPORT 过滤器对象
 */
public class PSDEReportFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEReportFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid2__eq(String value){
        this.setFieldCond("psdedsid2", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid3__eq(String value){
        this.setFieldCond("psdedsid3", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid4__eq(String value){
        this.setFieldCond("psdedsid4", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname2__eq(String value){
        this.setFieldCond("psdedsname2", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname2__like(String value){
        this.setFieldCond("psdedsname2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname3__eq(String value){
        this.setFieldCond("psdedsname3", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname3__like(String value){
        this.setFieldCond("psdedsname3", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname4__eq(String value){
        this.setFieldCond("psdedsname4", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname4__like(String value){
        this.setFieldCond("psdedsname4", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdereportname__eq(String value){
        this.setFieldCond("psdereportname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统智能立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统智能立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统智能立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统智能报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbireportid__eq(String value){
        this.setFieldCond("pssysbireportid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统智能报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbireportname__eq(String value){
        this.setFieldCond("pssysbireportname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统智能报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbireportname__like(String value){
        this.setFieldCond("pssysbireportname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[报表格式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter reporttype__eq(String value){
        this.setFieldCond("reporttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
