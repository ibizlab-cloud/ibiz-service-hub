package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEREPORT 过滤器对象
 */
public class PSDEReportFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEReportFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid2__eq(String value){
        this.setFieldCond("psdedsid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid3__eq(String value){
        this.setFieldCond("psdedsid3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsid4__eq(String value){
        this.setFieldCond("psdedsid4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname2__eq(String value){
        this.setFieldCond("psdedsname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname2__like(String value){
        this.setFieldCond("psdedsname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname3__eq(String value){
        this.setFieldCond("psdedsname3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname3__like(String value){
        this.setFieldCond("psdedsname3", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname4__eq(String value){
        this.setFieldCond("psdedsname4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdedsname4__like(String value){
        this.setFieldCond("psdedsname4", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[报表格式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter reporttype__eq(String value){
        this.setFieldCond("reporttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEReportFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
