package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPMENUITEM 过滤器对象
 */
public class PSAppMenuItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppMenuItemFilter(){
    
    }      

    /**
     * 设置属性[行为级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter actionlevel__eq(Integer value){
        this.setFieldCond("actionlevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter amitemtype__eq(String value){
        this.setFieldCond("amitemtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter btnactiontype__eq(String value){
        this.setFieldCond("btnactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter caption__like(String value){
        this.setFieldCond("caption", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex横轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter flexalign__eq(String value){
        this.setFieldCond("flexalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex布局方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter flexdir__eq(String value){
        this.setFieldCond("flexdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex纵轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter flexvalign__eq(String value){
        this.setFieldCond("flexvalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter halignself__eq(String value){
        this.setFieldCond("halignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter openpsappviewid__eq(String value){
        this.setFieldCond("openpsappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter openpsappviewname__eq(String value){
        this.setFieldCond("openpsappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter openpsappviewname__like(String value){
        this.setFieldCond("openpsappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父菜单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter ppsappmenuitemid__eq(String value){
        this.setFieldCond("ppsappmenuitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父菜单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter ppsappmenuitemname__eq(String value){
        this.setFieldCond("ppsappmenuitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父菜单项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter ppsappmenuitemname__like(String value){
        this.setFieldCond("ppsappmenuitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappfuncid__eq(String value){
        this.setFieldCond("psappfuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappfuncname__eq(String value){
        this.setFieldCond("psappfuncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappfuncname__like(String value){
        this.setFieldCond("psappfuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[菜单项名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappmenuitemname__eq(String value){
        this.setFieldCond("psappmenuitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[菜单项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappmenuitemname__like(String value){
        this.setFieldCond("psappmenuitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问控制资源标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[菜单引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter refpsappmenuid__eq(String value){
        this.setFieldCond("refpsappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[菜单引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter refpsappmenuname__eq(String value){
        this.setFieldCond("refpsappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[菜单引用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter refpsappmenuname__like(String value){
        this.setFieldCond("refpsappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter templatemode__eq(Integer value){
        this.setFieldCond("templatemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter titlebarclosemode__eq(Integer value){
        this.setFieldCond("titlebarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppMenuItemFilter valignself__eq(String value){
        this.setFieldCond("valignself", Conditions.EQ, value);
        return this;
    }

}
