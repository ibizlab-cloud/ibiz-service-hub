package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPVPART 过滤器对象
 */
public class PSAppPVPartFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppPVPartFilter(){
    
    }      

    /**
     * 设置属性[快速菜单栏前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter ampssyspfpluginid__eq(String value){
        this.setFieldCond("ampssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速菜单栏前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter ampssyspfpluginname__eq(String value){
        this.setFieldCond("ampssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速菜单栏前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter ampssyspfpluginname__like(String value){
        this.setFieldCond("ampssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex横轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter flexalign__eq(String value){
        this.setFieldCond("flexalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex布局方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter flexdir__eq(String value){
        this.setFieldCond("flexdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex纵轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter flexvalign__eq(String value){
        this.setFieldCond("flexvalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter halignself__eq(String value){
        this.setFieldCond("halignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义菜单功能视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter menupsapputilviewid__eq(String value){
        this.setFieldCond("menupsapputilviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义菜单功能视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter menupsapputilviewname__eq(String value){
        this.setFieldCond("menupsapputilviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义菜单功能视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter menupsapputilviewname__like(String value){
        this.setFieldCond("menupsapputilviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[菜单栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter mobamstyle__eq(String value){
        this.setFieldCond("mobamstyle", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("mobamtyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter partstyle__eq(String value){
        this.setFieldCond("partstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据看板成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter ppsapppvpartid__eq(String value){
        this.setFieldCond("ppsapppvpartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据看板成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter ppsapppvpartname__eq(String value){
        this.setFieldCond("ppsapppvpartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父数据看板成员]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter ppsapppvpartname__like(String value){
        this.setFieldCond("ppsapppvpartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用门户视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappportalviewid__eq(String value){
        this.setFieldCond("psappportalviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用门户视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappportalviewname__eq(String value){
        this.setFieldCond("psappportalviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用门户视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappportalviewname__like(String value){
        this.setFieldCond("psappportalviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psapppvpartname__eq(String value){
        this.setFieldCond("psapppvpartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psapppvpartname__like(String value){
        this.setFieldCond("psapppvpartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysportletid__eq(String value){
        this.setFieldCond("pssysportletid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysportletname__eq(String value){
        this.setFieldCond("pssysportletname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysportletname__like(String value){
        this.setFieldCond("pssysportletname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter pvparttype__eq(String value){
        this.setFieldCond("pvparttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter templatemode__eq(Integer value){
        this.setFieldCond("templatemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter titlebarclosemode__eq(Integer value){
        this.setFieldCond("titlebarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPVPartFilter valignself__eq(String value){
        this.setFieldCond("valignself", Conditions.EQ, value);
        return this;
    }

}
