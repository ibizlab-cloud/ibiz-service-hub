package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPPORTALVIEW</B>应用看板视图 模型传输对象
 * <P>
 * 应用数据看板视图模型，应用数据看板视图内置数据看板部件，提供应用级别的数据看板展现能力
 */
public class PSAppPortalView extends PSAppView {

    public PSAppPortalView(){
        this.setPSAppViewType("APPPORTALVIEW");
    }      

    /**
     * <B>COLMODEL</B>&nbsp;列模型，指定数据看板视图布局模式为【表格布局】时指定表格列分割模型，多列使用分号分隔，列宽度可以使用百分数（表格宽度占比）、数字、星号（剩余），如 100;50%;* 表现第一列100像素、第二列表格一半宽度，第三列为剩余宽度
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_COLMODEL = "colmodel";

    /**
     * 设置 列模型，详细说明：{@link #FIELD_COLMODEL}
     * 
     * @param colModel
     * 
     */
    @JsonProperty(FIELD_COLMODEL)
    public void setColModel(String colModel){
        this.set(FIELD_COLMODEL, colModel);
    }
    
    /**
     * 获取 列模型  
     * @return
     */
    @JsonIgnore
    public String getColModel(){
        Object objValue = this.get(FIELD_COLMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColModelDirty(){
        if(this.contains(FIELD_COLMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列模型
     */
    @JsonIgnore
    public void resetColModel(){
        this.reset(FIELD_COLMODEL);
    }

    /**
     * 设置 列模型，详细说明：{@link #FIELD_COLMODEL}
     * <P>
     * 等同 {@link #setColModel}
     * @param colModel
     */
    @JsonIgnore
    public PSAppPortalView colmodel(String colModel){
        this.setColModel(colModel);
        return this;
    }

    /**
     * <B>CREATEDATE</B>&nbsp;建立时间
     */
    public final static String FIELD_CREATEDATE = "createdate";

    /**
     * 设置 建立时间
     * 
     * @param createDate
     * 
     */
    @JsonProperty(FIELD_CREATEDATE)
    public void setCreateDate(String createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public String getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDateDirty(){
        if(this.contains(FIELD_CREATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立时间
     */
    @JsonIgnore
    public void resetCreateDate(){
        this.reset(FIELD_CREATEDATE);
    }

    /**
     * 设置 建立时间
     * <P>
     * 等同 {@link #setCreateDate}
     * @param createDate
     */
    @JsonIgnore
    public PSAppPortalView createdate(String createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEMAN</B>&nbsp;建立人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEMAN = "createman";

    /**
     * 设置 建立人
     * 
     * @param createMan
     * 
     */
    @JsonProperty(FIELD_CREATEMAN)
    public void setCreateMan(String createMan){
        this.set(FIELD_CREATEMAN, createMan);
    }
    
    /**
     * 获取 建立人  
     * @return
     */
    @JsonIgnore
    public String getCreateMan(){
        Object objValue = this.get(FIELD_CREATEMAN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateManDirty(){
        if(this.contains(FIELD_CREATEMAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立人
     */
    @JsonIgnore
    public void resetCreateMan(){
        this.reset(FIELD_CREATEMAN);
    }

    /**
     * 设置 建立人
     * <P>
     * 等同 {@link #setCreateMan}
     * @param createMan
     */
    @JsonIgnore
    public PSAppPortalView createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DASHBOARDNAVBAR</B>&nbsp;面板导航栏
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DASHBOARDNAVBAR = "dashboardnavbar";

    /**
     * 设置 面板导航栏
     * 
     * @param dashboardNavBar
     * 
     */
    @JsonProperty(FIELD_DASHBOARDNAVBAR)
    public void setDashboardNavBar(Integer dashboardNavBar){
        this.set(FIELD_DASHBOARDNAVBAR, dashboardNavBar);
    }
    
    /**
     * 获取 面板导航栏  
     * @return
     */
    @JsonIgnore
    public Integer getDashboardNavBar(){
        Object objValue = this.get(FIELD_DASHBOARDNAVBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板导航栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDashboardNavBarDirty(){
        if(this.contains(FIELD_DASHBOARDNAVBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板导航栏
     */
    @JsonIgnore
    public void resetDashboardNavBar(){
        this.reset(FIELD_DASHBOARDNAVBAR);
    }

    /**
     * 设置 面板导航栏
     * <P>
     * 等同 {@link #setDashboardNavBar}
     * @param dashboardNavBar
     */
    @JsonIgnore
    public PSAppPortalView dashboardnavbar(Integer dashboardNavBar){
        this.setDashboardNavBar(dashboardNavBar);
        return this;
    }

     /**
     * 设置 面板导航栏
     * <P>
     * 等同 {@link #setDashboardNavBar}
     * @param dashboardNavBar
     */
    @JsonIgnore
    public PSAppPortalView dashboardnavbar(Boolean dashboardNavBar){
        if(dashboardNavBar == null){
            this.setDashboardNavBar(null);
        }
        else{
            this.setDashboardNavBar(dashboardNavBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DASHBOARDSTYLE</B>&nbsp;数据看板样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DashboardStyle} 
     */
    public final static String FIELD_DASHBOARDSTYLE = "dashboardstyle";

    /**
     * 设置 数据看板样式
     * 
     * @param dashboardStyle
     * 
     */
    @JsonProperty(FIELD_DASHBOARDSTYLE)
    public void setDashboardStyle(String dashboardStyle){
        this.set(FIELD_DASHBOARDSTYLE, dashboardStyle);
    }
    
    /**
     * 获取 数据看板样式  
     * @return
     */
    @JsonIgnore
    public String getDashboardStyle(){
        Object objValue = this.get(FIELD_DASHBOARDSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据看板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDashboardStyleDirty(){
        if(this.contains(FIELD_DASHBOARDSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据看板样式
     */
    @JsonIgnore
    public void resetDashboardStyle(){
        this.reset(FIELD_DASHBOARDSTYLE);
    }

    /**
     * 设置 数据看板样式
     * <P>
     * 等同 {@link #setDashboardStyle}
     * @param dashboardStyle
     */
    @JsonIgnore
    public PSAppPortalView dashboardstyle(String dashboardStyle){
        this.setDashboardStyle(dashboardStyle);
        return this;
    }

     /**
     * 设置 数据看板样式
     * <P>
     * 等同 {@link #setDashboardStyle}
     * @param dashboardStyle
     */
    @JsonIgnore
    public PSAppPortalView dashboardstyle(net.ibizsys.psmodel.core.util.PSModelEnums.DashboardStyle dashboardStyle){
        if(dashboardStyle == null){
            this.setDashboardStyle(null);
        }
        else{
            this.setDashboardStyle(dashboardStyle.value);
        }
        return this;
    }

    /**
     * <B>DASHBOARDTAG</B>&nbsp;数据看板标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DASHBOARDTAG = "dashboardtag";

    /**
     * 设置 数据看板标记
     * 
     * @param dashboardTag
     * 
     */
    @JsonProperty(FIELD_DASHBOARDTAG)
    public void setDashboardTag(String dashboardTag){
        this.set(FIELD_DASHBOARDTAG, dashboardTag);
    }
    
    /**
     * 获取 数据看板标记  
     * @return
     */
    @JsonIgnore
    public String getDashboardTag(){
        Object objValue = this.get(FIELD_DASHBOARDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据看板标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDashboardTagDirty(){
        if(this.contains(FIELD_DASHBOARDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据看板标记
     */
    @JsonIgnore
    public void resetDashboardTag(){
        this.reset(FIELD_DASHBOARDTAG);
    }

    /**
     * 设置 数据看板标记
     * <P>
     * 等同 {@link #setDashboardTag}
     * @param dashboardTag
     */
    @JsonIgnore
    public PSAppPortalView dashboardtag(String dashboardTag){
        this.setDashboardTag(dashboardTag);
        return this;
    }

    /**
     * <B>DASHBOARDTAG2</B>&nbsp;数据看板标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DASHBOARDTAG2 = "dashboardtag2";

    /**
     * 设置 数据看板标记2
     * 
     * @param dashboardTag2
     * 
     */
    @JsonProperty(FIELD_DASHBOARDTAG2)
    public void setDashboardTag2(String dashboardTag2){
        this.set(FIELD_DASHBOARDTAG2, dashboardTag2);
    }
    
    /**
     * 获取 数据看板标记2  
     * @return
     */
    @JsonIgnore
    public String getDashboardTag2(){
        Object objValue = this.get(FIELD_DASHBOARDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据看板标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDashboardTag2Dirty(){
        if(this.contains(FIELD_DASHBOARDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据看板标记2
     */
    @JsonIgnore
    public void resetDashboardTag2(){
        this.reset(FIELD_DASHBOARDTAG2);
    }

    /**
     * 设置 数据看板标记2
     * <P>
     * 等同 {@link #setDashboardTag2}
     * @param dashboardTag2
     */
    @JsonIgnore
    public PSAppPortalView dashboardtag2(String dashboardTag2){
        this.setDashboardTag2(dashboardTag2);
        return this;
    }

    /**
     * <B>DEFAULTPAGE</B>&nbsp;系统默认页，指定应用数据看板视图是否为所属应用的默认页，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTPAGE = "defaultpage";

    /**
     * 设置 系统默认页，详细说明：{@link #FIELD_DEFAULTPAGE}
     * 
     * @param defaultPage
     * 
     */
    @JsonProperty(FIELD_DEFAULTPAGE)
    public void setDefaultPage(Integer defaultPage){
        this.set(FIELD_DEFAULTPAGE, defaultPage);
    }
    
    /**
     * 获取 系统默认页  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultPage(){
        Object objValue = this.get(FIELD_DEFAULTPAGE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统默认页 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultPageDirty(){
        if(this.contains(FIELD_DEFAULTPAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统默认页
     */
    @JsonIgnore
    public void resetDefaultPage(){
        this.reset(FIELD_DEFAULTPAGE);
    }

    /**
     * 设置 系统默认页，详细说明：{@link #FIELD_DEFAULTPAGE}
     * <P>
     * 等同 {@link #setDefaultPage}
     * @param defaultPage
     */
    @JsonIgnore
    public PSAppPortalView defaultpage(Integer defaultPage){
        this.setDefaultPage(defaultPage);
        return this;
    }

     /**
     * 设置 系统默认页，详细说明：{@link #FIELD_DEFAULTPAGE}
     * <P>
     * 等同 {@link #setDefaultPage}
     * @param defaultPage
     */
    @JsonIgnore
    public PSAppPortalView defaultpage(Boolean defaultPage){
        if(defaultPage == null){
            this.setDefaultPage(null);
        }
        else{
            this.setDefaultPage(defaultPage?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制，指定应用数据看板视图是否支持用户自定义，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlCustomizeMode} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZED}
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
        //属性名称与代码标识不一致，设置属性名称
        this.set("enablecustomize", enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("enablecustomize");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("enablecustomize")){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("enablecustomize");
    }

    /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZED}
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSAppPortalView enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZED}
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSAppPortalView enablecustomized(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlCustomizeMode enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getEnableCustomize(){
        return this.getEnableCustomized();
    }

    @JsonIgnore
    @Deprecated        
    public void setEnableCustomize(Integer enableCustomize){
        this.setEnableCustomized(enableCustomize);
    }

    @JsonIgnore
    @Deprecated
    public boolean isEnableCustomizeDirty(){
        return this.isEnableCustomizedDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetEnableCustomize(){
        this.resetEnableCustomized();
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，视图默认数据看板部件布局模式为【Flex布局】时指定横轴对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign} 
     */
    public final static String FIELD_FLEXALIGN = "flexalign";

    /**
     * 设置 Flex横轴对齐，详细说明：{@link #FIELD_FLEXALIGN}
     * 
     * @param flexAlign
     * 
     */
    @JsonProperty(FIELD_FLEXALIGN)
    public void setFlexAlign(String flexAlign){
        this.set(FIELD_FLEXALIGN, flexAlign);
    }
    
    /**
     * 获取 Flex横轴对齐  
     * @return
     */
    @JsonIgnore
    public String getFlexAlign(){
        Object objValue = this.get(FIELD_FLEXALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Flex横轴对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexAlignDirty(){
        if(this.contains(FIELD_FLEXALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex横轴对齐
     */
    @JsonIgnore
    public void resetFlexAlign(){
        this.reset(FIELD_FLEXALIGN);
    }

    /**
     * 设置 Flex横轴对齐，详细说明：{@link #FIELD_FLEXALIGN}
     * <P>
     * 等同 {@link #setFlexAlign}
     * @param flexAlign
     */
    @JsonIgnore
    public PSAppPortalView flexalign(String flexAlign){
        this.setFlexAlign(flexAlign);
        return this;
    }

     /**
     * 设置 Flex横轴对齐，详细说明：{@link #FIELD_FLEXALIGN}
     * <P>
     * 等同 {@link #setFlexAlign}
     * @param flexAlign
     */
    @JsonIgnore
    public PSAppPortalView flexalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign flexAlign){
        if(flexAlign == null){
            this.setFlexAlign(null);
        }
        else{
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    /**
     * <B>FLEXDIR</B>&nbsp;Flex布局方向，视图默认数据看板部件布局模式为【Flex布局】时指定布局方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir} 
     */
    public final static String FIELD_FLEXDIR = "flexdir";

    /**
     * 设置 Flex布局方向，详细说明：{@link #FIELD_FLEXDIR}
     * 
     * @param flexDir
     * 
     */
    @JsonProperty(FIELD_FLEXDIR)
    public void setFlexDir(String flexDir){
        this.set(FIELD_FLEXDIR, flexDir);
    }
    
    /**
     * 获取 Flex布局方向  
     * @return
     */
    @JsonIgnore
    public String getFlexDir(){
        Object objValue = this.get(FIELD_FLEXDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Flex布局方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexDirDirty(){
        if(this.contains(FIELD_FLEXDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex布局方向
     */
    @JsonIgnore
    public void resetFlexDir(){
        this.reset(FIELD_FLEXDIR);
    }

    /**
     * 设置 Flex布局方向，详细说明：{@link #FIELD_FLEXDIR}
     * <P>
     * 等同 {@link #setFlexDir}
     * @param flexDir
     */
    @JsonIgnore
    public PSAppPortalView flexdir(String flexDir){
        this.setFlexDir(flexDir);
        return this;
    }

     /**
     * 设置 Flex布局方向，详细说明：{@link #FIELD_FLEXDIR}
     * <P>
     * 等同 {@link #setFlexDir}
     * @param flexDir
     */
    @JsonIgnore
    public PSAppPortalView flexdir(net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir flexDir){
        if(flexDir == null){
            this.setFlexDir(null);
        }
        else{
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    /**
     * <B>FLEXVALIGN</B>&nbsp;Flex纵轴对齐，视图默认数据看板部件布局模式为【Flex布局】时指定纵轴对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign} 
     */
    public final static String FIELD_FLEXVALIGN = "flexvalign";

    /**
     * 设置 Flex纵轴对齐，详细说明：{@link #FIELD_FLEXVALIGN}
     * 
     * @param flexVAlign
     * 
     */
    @JsonProperty(FIELD_FLEXVALIGN)
    public void setFlexVAlign(String flexVAlign){
        this.set(FIELD_FLEXVALIGN, flexVAlign);
    }
    
    /**
     * 获取 Flex纵轴对齐  
     * @return
     */
    @JsonIgnore
    public String getFlexVAlign(){
        Object objValue = this.get(FIELD_FLEXVALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Flex纵轴对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFlexVAlignDirty(){
        if(this.contains(FIELD_FLEXVALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Flex纵轴对齐
     */
    @JsonIgnore
    public void resetFlexVAlign(){
        this.reset(FIELD_FLEXVALIGN);
    }

    /**
     * 设置 Flex纵轴对齐，详细说明：{@link #FIELD_FLEXVALIGN}
     * <P>
     * 等同 {@link #setFlexVAlign}
     * @param flexVAlign
     */
    @JsonIgnore
    public PSAppPortalView flexvalign(String flexVAlign){
        this.setFlexVAlign(flexVAlign);
        return this;
    }

     /**
     * 设置 Flex纵轴对齐，详细说明：{@link #FIELD_FLEXVALIGN}
     * <P>
     * 等同 {@link #setFlexVAlign}
     * @param flexVAlign
     */
    @JsonIgnore
    public PSAppPortalView flexvalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign flexVAlign){
        if(flexVAlign == null){
            this.setFlexVAlign(null);
        }
        else{
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定视图默认数据看板部件的布局模式，未定义时使用前端应用使用模板的默认布局模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode} 
     */
    public final static String FIELD_LAYOUTMODE = "layoutmode";

    /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * 
     * @param layoutMode
     * 
     */
    @JsonProperty(FIELD_LAYOUTMODE)
    public void setLayoutMode(String layoutMode){
        this.set(FIELD_LAYOUTMODE, layoutMode);
    }
    
    /**
     * 获取 布局模式  
     * @return
     */
    @JsonIgnore
    public String getLayoutMode(){
        Object objValue = this.get(FIELD_LAYOUTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutModeDirty(){
        if(this.contains(FIELD_LAYOUTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局模式
     */
    @JsonIgnore
    public void resetLayoutMode(){
        this.reset(FIELD_LAYOUTMODE);
    }

    /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * <P>
     * 等同 {@link #setLayoutMode}
     * @param layoutMode
     */
    @JsonIgnore
    public PSAppPortalView layoutmode(String layoutMode){
        this.setLayoutMode(layoutMode);
        return this;
    }

     /**
     * 设置 布局模式，详细说明：{@link #FIELD_LAYOUTMODE}
     * <P>
     * 等同 {@link #setLayoutMode}
     * @param layoutMode
     */
    @JsonIgnore
    public PSAppPortalView layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    /**
     * <B>NAVBARHEIGHT</B>&nbsp;导航栏高度
     */
    public final static String FIELD_NAVBARHEIGHT = "navbarheight";

    /**
     * 设置 导航栏高度
     * 
     * @param navBarHeight
     * 
     */
    @JsonProperty(FIELD_NAVBARHEIGHT)
    public void setNavBarHeight(Integer navBarHeight){
        this.set(FIELD_NAVBARHEIGHT, navBarHeight);
    }
    
    /**
     * 获取 导航栏高度  
     * @return
     */
    @JsonIgnore
    public Integer getNavBarHeight(){
        Object objValue = this.get(FIELD_NAVBARHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导航栏高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarHeightDirty(){
        if(this.contains(FIELD_NAVBARHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏高度
     */
    @JsonIgnore
    public void resetNavBarHeight(){
        this.reset(FIELD_NAVBARHEIGHT);
    }

    /**
     * 设置 导航栏高度
     * <P>
     * 等同 {@link #setNavBarHeight}
     * @param navBarHeight
     */
    @JsonIgnore
    public PSAppPortalView navbarheight(Integer navBarHeight){
        this.setNavBarHeight(navBarHeight);
        return this;
    }

    /**
     * <B>NAVBARPOS</B>&nbsp;导航栏位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NavBarPos} 
     */
    public final static String FIELD_NAVBARPOS = "navbarpos";

    /**
     * 设置 导航栏位置
     * 
     * @param navBarPos
     * 
     */
    @JsonProperty(FIELD_NAVBARPOS)
    public void setNavBarPos(String navBarPos){
        this.set(FIELD_NAVBARPOS, navBarPos);
    }
    
    /**
     * 获取 导航栏位置  
     * @return
     */
    @JsonIgnore
    public String getNavBarPos(){
        Object objValue = this.get(FIELD_NAVBARPOS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarPosDirty(){
        if(this.contains(FIELD_NAVBARPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏位置
     */
    @JsonIgnore
    public void resetNavBarPos(){
        this.reset(FIELD_NAVBARPOS);
    }

    /**
     * 设置 导航栏位置
     * <P>
     * 等同 {@link #setNavBarPos}
     * @param navBarPos
     */
    @JsonIgnore
    public PSAppPortalView navbarpos(String navBarPos){
        this.setNavBarPos(navBarPos);
        return this;
    }

     /**
     * 设置 导航栏位置
     * <P>
     * 等同 {@link #setNavBarPos}
     * @param navBarPos
     */
    @JsonIgnore
    public PSAppPortalView navbarpos(net.ibizsys.psmodel.core.util.PSModelEnums.NavBarPos navBarPos){
        if(navBarPos == null){
            this.setNavBarPos(null);
        }
        else{
            this.setNavBarPos(navBarPos.value);
        }
        return this;
    }

    /**
     * <B>NAVBARSTYLE</B>&nbsp;导航栏样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle} 
     */
    public final static String FIELD_NAVBARSTYLE = "navbarstyle";

    /**
     * 设置 导航栏样式
     * 
     * @param navBarStyle
     * 
     */
    @JsonProperty(FIELD_NAVBARSTYLE)
    public void setNavBarStyle(String navBarStyle){
        this.set(FIELD_NAVBARSTYLE, navBarStyle);
    }
    
    /**
     * 获取 导航栏样式  
     * @return
     */
    @JsonIgnore
    public String getNavBarStyle(){
        Object objValue = this.get(FIELD_NAVBARSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarStyleDirty(){
        if(this.contains(FIELD_NAVBARSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏样式
     */
    @JsonIgnore
    public void resetNavBarStyle(){
        this.reset(FIELD_NAVBARSTYLE);
    }

    /**
     * 设置 导航栏样式
     * <P>
     * 等同 {@link #setNavBarStyle}
     * @param navBarStyle
     */
    @JsonIgnore
    public PSAppPortalView navbarstyle(String navBarStyle){
        this.setNavBarStyle(navBarStyle);
        return this;
    }

     /**
     * 设置 导航栏样式
     * <P>
     * 等同 {@link #setNavBarStyle}
     * @param navBarStyle
     */
    @JsonIgnore
    public PSAppPortalView navbarstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle navBarStyle){
        if(navBarStyle == null){
            this.setNavBarStyle(null);
        }
        else{
            this.setNavBarStyle(navBarStyle.value);
        }
        return this;
    }

    /**
     * <B>NAVBARWIDTH</B>&nbsp;导航栏宽度
     */
    public final static String FIELD_NAVBARWIDTH = "navbarwidth";

    /**
     * 设置 导航栏宽度
     * 
     * @param navBarWidth
     * 
     */
    @JsonProperty(FIELD_NAVBARWIDTH)
    public void setNavBarWidth(Integer navBarWidth){
        this.set(FIELD_NAVBARWIDTH, navBarWidth);
    }
    
    /**
     * 获取 导航栏宽度  
     * @return
     */
    @JsonIgnore
    public Integer getNavBarWidth(){
        Object objValue = this.get(FIELD_NAVBARWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导航栏宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarWidthDirty(){
        if(this.contains(FIELD_NAVBARWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏宽度
     */
    @JsonIgnore
    public void resetNavBarWidth(){
        this.reset(FIELD_NAVBARWIDTH);
    }

    /**
     * 设置 导航栏宽度
     * <P>
     * 等同 {@link #setNavBarWidth}
     * @param navBarWidth
     */
    @JsonIgnore
    public PSAppPortalView navbarwidth(Integer navBarWidth){
        this.setNavBarWidth(navBarWidth);
        return this;
    }

    /**
     * <B>PSAPPPORTALVIEWID</B>&nbsp;应用门户视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPPORTALVIEWID = "psappportalviewid";

    /**
     * 设置 应用门户视图标识
     * 
     * @param pSAppPortalViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPPORTALVIEWID)
    public void setPSAppPortalViewId(String pSAppPortalViewId){
        this.set(FIELD_PSAPPPORTALVIEWID, pSAppPortalViewId);
        this.set(FIELD_PSAPPVIEWID, pSAppPortalViewId);        
    }
    
    /**
     * 获取 应用门户视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPortalViewId(){
        Object objValue = this.get(FIELD_PSAPPPORTALVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用门户视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPortalViewIdDirty(){
        if(this.contains(FIELD_PSAPPPORTALVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用门户视图标识
     */
    @JsonIgnore
    public void resetPSAppPortalViewId(){
        this.reset(FIELD_PSAPPPORTALVIEWID);
        this.reset(FIELD_PSAPPVIEWID);        
    }

    /**
     * 设置 应用门户视图标识
     * <P>
     * 等同 {@link #setPSAppPortalViewId}
     * @param pSAppPortalViewId
     */
    @JsonIgnore
    public PSAppPortalView psappportalviewid(String pSAppPortalViewId){
        this.setPSAppPortalViewId(pSAppPortalViewId);
        return this;
    }

    /**
     * <B>PSAPPPORTALVIEWNAME</B>&nbsp;代码标识，指定应用看板视图的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPPORTALVIEWNAME = "psappportalviewname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPPORTALVIEWNAME}
     * 
     * @param pSAppPortalViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPPORTALVIEWNAME)
    public void setPSAppPortalViewName(String pSAppPortalViewName){
        this.set(FIELD_PSAPPPORTALVIEWNAME, pSAppPortalViewName);
        this.set(FIELD_PSAPPVIEWNAME, pSAppPortalViewName);        
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPortalViewName(){
        Object objValue = this.get(FIELD_PSAPPPORTALVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPortalViewNameDirty(){
        if(this.contains(FIELD_PSAPPPORTALVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppPortalViewName(){
        this.reset(FIELD_PSAPPPORTALVIEWNAME);
        this.reset(FIELD_PSAPPVIEWNAME);        
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPPORTALVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppPortalViewName}
     * @param pSAppPortalViewName
     */
    @JsonIgnore
    public PSAppPortalView psappportalviewname(String pSAppPortalViewName){
        this.setPSAppPortalViewName(pSAppPortalViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppPortalViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppPortalViewName(strName);
    }

    @JsonIgnore
    public PSAppPortalView name(String strName){
        this.setPSAppPortalViewName(strName);
        return this;
    }

    /**
     * <B>UPDATEDATE</B>&nbsp;更新时间
     */
    public final static String FIELD_UPDATEDATE = "updatedate";

    /**
     * 设置 更新时间
     * 
     * @param updateDate
     * 
     */
    @JsonProperty(FIELD_UPDATEDATE)
    public void setUpdateDate(String updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public String getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDateDirty(){
        if(this.contains(FIELD_UPDATEDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新时间
     */
    @JsonIgnore
    public void resetUpdateDate(){
        this.reset(FIELD_UPDATEDATE);
    }

    /**
     * 设置 更新时间
     * <P>
     * 等同 {@link #setUpdateDate}
     * @param updateDate
     */
    @JsonIgnore
    public PSAppPortalView updatedate(String updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEMAN</B>&nbsp;更新人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UPDATEMAN = "updateman";

    /**
     * 设置 更新人
     * 
     * @param updateMan
     * 
     */
    @JsonProperty(FIELD_UPDATEMAN)
    public void setUpdateMan(String updateMan){
        this.set(FIELD_UPDATEMAN, updateMan);
    }
    
    /**
     * 获取 更新人  
     * @return
     */
    @JsonIgnore
    public String getUpdateMan(){
        Object objValue = this.get(FIELD_UPDATEMAN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateManDirty(){
        if(this.contains(FIELD_UPDATEMAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新人
     */
    @JsonIgnore
    public void resetUpdateMan(){
        this.reset(FIELD_UPDATEMAN);
    }

    /**
     * 设置 更新人
     * <P>
     * 等同 {@link #setUpdateMan}
     * @param updateMan
     */
    @JsonIgnore
    public PSAppPortalView updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppPortalViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppPortalViewId(strValue);
    }

    @JsonIgnore
    public PSAppPortalView id(String strValue){
        this.setPSAppPortalViewId(strValue);
        return this;
    }


    /**
     *  应用门户视图部件 成员集合
     */
    public final static String FIELD_PSAPPPVPARTS = "psapppvparts";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> psapppvparts;

    /**
     * 获取 应用门户视图部件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSAPPPVPARTS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> getPSAppPVParts(){
        return this.psapppvparts;
    }

    /**
     * 设置 应用门户视图部件 成员集合  
     * @param psapppvparts
     */
    @JsonProperty(FIELD_PSAPPPVPARTS)
    public void setPSAppPVParts(java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> psapppvparts){
        this.psapppvparts = psapppvparts;
    }

    /**
     * 获取 应用门户视图部件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSAppPVPart> getPSAppPVPartsIf(){
        if(this.psapppvparts == null){
            this.psapppvparts = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSAppPVPart>();          
        }
        return this.psapppvparts;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppPortalView){
            PSAppPortalView model = (PSAppPortalView)iPSModel;
            model.setPSAppPVParts(this.getPSAppPVParts());
        }
        super.copyTo(iPSModel);
    }
}
