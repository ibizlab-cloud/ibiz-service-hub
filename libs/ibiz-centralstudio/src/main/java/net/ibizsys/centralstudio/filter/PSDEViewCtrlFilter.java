package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVIEWCTRL 过滤器对象
 */
public class PSDEViewCtrlFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEViewCtrlFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[按钮行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter btnactiontype__eq(String value){
        this.setFieldCond("btnactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no3psdeuagroupid__eq(String value){
        this.setFieldCond("no3psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no3psdeuagroupname__eq(String value){
        this.setFieldCond("no3psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no3psdeuagroupname__like(String value){
        this.setFieldCond("no3psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no4psdeuagroupid__eq(String value){
        this.setFieldCond("no4psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no4psdeuagroupname__eq(String value){
        this.setFieldCond("no4psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no4psdeuagroupname__like(String value){
        this.setFieldCond("no4psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no5psdeuagroupid__eq(String value){
        this.setFieldCond("no5psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no5psdeuagroupname__eq(String value){
        this.setFieldCond("no5psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no5psdeuagroupname__like(String value){
        this.setFieldCond("no5psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no6psdeuagroupid__eq(String value){
        this.setFieldCond("no6psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no6psdeuagroupname__eq(String value){
        this.setFieldCond("no6psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter no6psdeuagroupname__like(String value){
        this.setFieldCond("no6psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdechartid__eq(String value){
        this.setFieldCond("psdechartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdechartname__eq(String value){
        this.setFieldCond("psdechartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdechartname__like(String value){
        this.setFieldCond("psdechartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataexpid__eq(String value){
        this.setFieldCond("psdedataexpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataexpname__eq(String value){
        this.setFieldCond("psdedataexpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导出]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataexpname__like(String value){
        this.setFieldCond("psdedataexpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataimpid__eq(String value){
        this.setFieldCond("psdedataimpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataimpname__eq(String value){
        this.setFieldCond("psdedataimpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataviewid__eq(String value){
        this.setFieldCond("psdedataviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataviewname__eq(String value){
        this.setFieldCond("psdedataviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedataviewname__like(String value){
        this.setFieldCond("psdedataviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedrid__eq(String value){
        this.setFieldCond("psdedrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedrname__eq(String value){
        this.setFieldCond("psdedrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据关系组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdedrname__like(String value){
        this.setFieldCond("psdedrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdelistid__eq(String value){
        this.setFieldCond("psdelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdelistname__eq(String value){
        this.setFieldCond("psdelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdelistname__like(String value){
        this.setFieldCond("psdelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdereportid__eq(String value){
        this.setFieldCond("psdereportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdereportname__eq(String value){
        this.setFieldCond("psdereportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewctrlname__like(String value){
        this.setFieldCond("psdeviewctrlname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewctrltype__eq(String value){
        this.setFieldCond("psdeviewctrltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewid__eq(String value){
        this.setFieldCond("psdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewname__eq(String value){
        this.setFieldCond("psdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdeviewname__like(String value){
        this.setFieldCond("psdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdewizardid__eq(String value){
        this.setFieldCond("psdewizardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdewizardname__eq(String value){
        this.setFieldCond("psdewizardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter psdewizardname__like(String value){
        this.setFieldCond("psdewizardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscalendarid__eq(String value){
        this.setFieldCond("pssyscalendarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscalendarname__eq(String value){
        this.setFieldCond("pssyscalendarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscalendarname__like(String value){
        this.setFieldCond("pssyscalendarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据看板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysdashboardid__eq(String value){
        this.setFieldCond("pssysdashboardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据看板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysdashboardname__eq(String value){
        this.setFieldCond("pssysdashboardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据看板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysdashboardname__like(String value){
        this.setFieldCond("pssysdashboardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysmapviewid__eq(String value){
        this.setFieldCond("pssysmapviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysmapviewname__eq(String value){
        this.setFieldCond("pssysmapviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysmapviewname__like(String value){
        this.setFieldCond("pssysmapviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyssearchbarid__eq(String value){
        this.setFieldCond("pssyssearchbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyssearchbarname__eq(String value){
        this.setFieldCond("pssyssearchbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssyssearchbarname__like(String value){
        this.setFieldCond("pssyssearchbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件界面引擎2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter refctrl2usage__eq(String value){
        this.setFieldCond("refctrl2usage", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件界面引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter refctrlusage__eq(String value){
        this.setFieldCond("refctrlusage", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子部件处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter subpsachandlerid__eq(String value){
        this.setFieldCond("subpsachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子部件处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter subpsachandlername__eq(String value){
        this.setFieldCond("subpsachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子部件处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter subpsachandlername__like(String value){
        this.setFieldCond("subpsachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewCtrlFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", Conditions.EQ, value);
        return this;
    }

}
