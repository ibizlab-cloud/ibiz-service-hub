package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACMODE 过滤器对象
 */
public class PSDEACModeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEACModeFilter(){
    
    }      

    /**
     * 设置属性[列表项插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter acipssyspfpluginid__eq(String value){
        this.setFieldCond("acipssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter acipssyspfpluginname__eq(String value){
        this.setFieldCond("acipssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter acipssyspfpluginname__like(String value){
        this.setFieldCond("acipssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[行为所有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI工厂系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter aifactorypssysutildeid__eq(String value){
        this.setFieldCond("aifactorypssysutildeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter aifactorypssysutildename__eq(String value){
        this.setFieldCond("aifactorypssysutildename", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂系统功能组件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter aifactorypssysutildename__like(String value){
        this.setFieldCond("aifactorypssysutildename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter createpsdeopprivid__eq(String value){
        this.setFieldCond("createpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立实体操作标示]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter createpsdeopprivname__eq(String value){
        this.setFieldCond("createpsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立实体操作标示]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter createpsdeopprivname__like(String value){
        this.setFieldCond("createpsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[历史消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter historypssysmsgtemplid__eq(String value){
        this.setFieldCond("historypssysmsgtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[历史消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter historypssysmsgtemplname__eq(String value){
        this.setFieldCond("historypssysmsgtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[历史消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter historypssysmsgtemplname__like(String value){
        this.setFieldCond("historypssysmsgtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分页数量]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pagingsize__eq(Integer value){
        this.setFieldCond("pagingsize", EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌入选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pickuppsdeviewid__eq(String value){
        this.setFieldCond("pickuppsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌入选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pickuppsdeviewname__eq(String value){
        this.setFieldCond("pickuppsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌入选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pickuppsdeviewname__like(String value){
        this.setFieldCond("pickuppsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自填模式标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdeacmodename__eq(String value){
        this.setFieldCond("psdeacmodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[自填模式标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdeacmodename__like(String value){
        this.setFieldCond("psdeacmodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[读取要求权限]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter readpsdeopprivid__eq(String value){
        this.setFieldCond("readpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取实体操作标示]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter readpsdeopprivname__eq(String value){
        this.setFieldCond("readpsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[读取实体操作标示]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter readpsdeopprivname__like(String value){
        this.setFieldCond("readpsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEACModeFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", LIKE, value);
        return this;
    }

}
