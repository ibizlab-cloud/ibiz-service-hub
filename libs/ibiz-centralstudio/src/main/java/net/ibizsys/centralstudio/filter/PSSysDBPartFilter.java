package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBPART 过滤器对象
 */
public class PSSysDBPartFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDBPartFilter(){
    
    }      

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter dbparttype__eq(String value){
        this.setFieldCond("dbparttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex横轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter flexalign__eq(String value){
        this.setFieldCond("flexalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex布局方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter flexdir__eq(String value){
        this.setFieldCond("flexdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex纵轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter flexvalign__eq(String value){
        this.setFieldCond("flexvalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter halignself__eq(String value){
        this.setFieldCond("halignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter partstyle__eq(String value){
        this.setFieldCond("partstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter ppssysdbpartid__eq(String value){
        this.setFieldCond("ppssysdbpartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter ppssysdbpartname__eq(String value){
        this.setFieldCond("ppssysdbpartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter ppssysdbpartname__like(String value){
        this.setFieldCond("ppssysdbpartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统数据看板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysdashboardid__eq(String value){
        this.setFieldCond("pssysdashboardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据看板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysdashboardname__eq(String value){
        this.setFieldCond("pssysdashboardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据看板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysdashboardname__like(String value){
        this.setFieldCond("pssysdashboardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysdbpartname__eq(String value){
        this.setFieldCond("pssysdbpartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysdbpartname__like(String value){
        this.setFieldCond("pssysdbpartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysportletid__eq(String value){
        this.setFieldCond("pssysportletid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysportletname__eq(String value){
        this.setFieldCond("pssysportletname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysportletname__like(String value){
        this.setFieldCond("pssysportletname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter templatemode__eq(Integer value){
        this.setFieldCond("templatemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter titlebarclosemode__eq(Integer value){
        this.setFieldCond("titlebarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBPartFilter valignself__eq(String value){
        this.setFieldCond("valignself", Conditions.EQ, value);
        return this;
    }

}
