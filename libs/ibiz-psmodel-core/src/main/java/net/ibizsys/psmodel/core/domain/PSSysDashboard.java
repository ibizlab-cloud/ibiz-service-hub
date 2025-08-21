package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDASHBOARD</B>系统数据看板 模型传输对象
 * <P>
 * 数据看板部件模型，定义部件的界面及处理逻辑。数据看板部件包含部件成员，不同类型的部件成员提供不同的功能
 */
public class PSSysDashboard extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysDashboard(){
    }      

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示
     * 
     * @param busyIndicator
     * 
     */
    @JsonProperty(FIELD_BUSYINDICATOR)
    public void setBusyIndicator(Integer busyIndicator){
        this.set(FIELD_BUSYINDICATOR, busyIndicator);
    }
    
    /**
     * 获取 显示处理提示  
     * @return
     */
    @JsonIgnore
    public Integer getBusyIndicator(){
        Object objValue = this.get(FIELD_BUSYINDICATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示处理提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBusyIndicatorDirty(){
        if(this.contains(FIELD_BUSYINDICATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示处理提示
     */
    @JsonIgnore
    public void resetBusyIndicator(){
        this.reset(FIELD_BUSYINDICATOR);
    }

    /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSSysDashboard busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSSysDashboard busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据看板的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
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
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysDashboard codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLMODEL</B>&nbsp;列模型，指定数据看板布局模式为【表格布局】时指定表格列分割模型，多列使用分号分隔，列宽度可以使用百分数（表格宽度占比）、数字、星号（剩余），如 100;50%;* 表现第一列100像素、第二列表格一半宽度，第三列为剩余宽度
     * <P>
     * 字符串：最大长度 100
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
    public PSSysDashboard colmodel(String colModel){
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
    public PSSysDashboard createdate(String createDate){
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
    public PSSysDashboard createman(String createMan){
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
    public PSSysDashboard dashboardnavbar(Integer dashboardNavBar){
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
    public PSSysDashboard dashboardnavbar(Boolean dashboardNavBar){
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
    public PSSysDashboard dashboardstyle(String dashboardStyle){
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
    public PSSysDashboard dashboardstyle(net.ibizsys.psmodel.core.util.PSModelEnums.DashboardStyle dashboardStyle){
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
    public PSSysDashboard dashboardtag(String dashboardTag){
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
    public PSSysDashboard dashboardtag2(String dashboardTag2){
        this.setDashboardTag2(dashboardTag2);
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlCustomizeMode} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
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
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSSysDashboard enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSSysDashboard enablecustomized(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlCustomizeMode enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized.value);
        }
        return this;
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，数据看板部件布局模式为【Flex布局】时指定横轴对齐方式
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
    public PSSysDashboard flexalign(String flexAlign){
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
    public PSSysDashboard flexalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexAlign flexAlign){
        if(flexAlign == null){
            this.setFlexAlign(null);
        }
        else{
            this.setFlexAlign(flexAlign.value);
        }
        return this;
    }

    /**
     * <B>FLEXDIR</B>&nbsp;Flex布局方向，数据看板部件布局模式为【Flex布局】时指定布局方向
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
    public PSSysDashboard flexdir(String flexDir){
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
    public PSSysDashboard flexdir(net.ibizsys.psmodel.core.util.PSModelEnums.FlexLayoutDir flexDir){
        if(flexDir == null){
            this.setFlexDir(null);
        }
        else{
            this.setFlexDir(flexDir.value);
        }
        return this;
    }

    /**
     * <B>FLEXVALIGN</B>&nbsp;Flex纵轴对齐，数据看板部件布局模式为【Flex布局】时指定纵轴对齐方式
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
    public PSSysDashboard flexvalign(String flexVAlign){
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
    public PSSysDashboard flexvalign(net.ibizsys.psmodel.core.util.PSModelEnums.FlexVAlign flexVAlign){
        if(flexVAlign == null){
            this.setFlexVAlign(null);
        }
        else{
            this.setFlexVAlign(flexVAlign.value);
        }
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定数据看板部件的布局模式，未定义时使用前端应用使用模板的默认布局模式
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
    public PSSysDashboard layoutmode(String layoutMode){
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
    public PSSysDashboard layoutmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_MEMO = "memo";

    /**
     * 设置 备注
     * 
     * @param memo
     * 
     */
    @JsonProperty(FIELD_MEMO)
    public void setMemo(String memo){
        this.set(FIELD_MEMO, memo);
    }
    
    /**
     * 获取 备注  
     * @return
     */
    @JsonIgnore
    public String getMemo(){
        Object objValue = this.get(FIELD_MEMO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 备注 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMemoDirty(){
        if(this.contains(FIELD_MEMO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 备注
     */
    @JsonIgnore
    public void resetMemo(){
        this.reset(FIELD_MEMO);
    }

    /**
     * 设置 备注
     * <P>
     * 等同 {@link #setMemo}
     * @param memo
     */
    @JsonIgnore
    public PSSysDashboard memo(String memo){
        this.setMemo(memo);
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
    public PSSysDashboard navbarheight(Integer navBarHeight){
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
    public PSSysDashboard navbarpos(String navBarPos){
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
    public PSSysDashboard navbarpos(net.ibizsys.psmodel.core.util.PSModelEnums.NavBarPos navBarPos){
        if(navBarPos == null){
            this.setNavBarPos(null);
        }
        else{
            this.setNavBarPos(navBarPos.value);
        }
        return this;
    }

    /**
     * <B>NAVBARPSSYSCSSID</B>&nbsp;导航栏样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_NAVBARPSSYSCSSID = "navbarpssyscssid";

    /**
     * 设置 导航栏样式表
     * 
     * @param navBarPSSysCssId
     * 
     */
    @JsonProperty(FIELD_NAVBARPSSYSCSSID)
    public void setNavBarPSSysCssId(String navBarPSSysCssId){
        this.set(FIELD_NAVBARPSSYSCSSID, navBarPSSysCssId);
    }
    
    /**
     * 获取 导航栏样式表  
     * @return
     */
    @JsonIgnore
    public String getNavBarPSSysCssId(){
        Object objValue = this.get(FIELD_NAVBARPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarPSSysCssIdDirty(){
        if(this.contains(FIELD_NAVBARPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏样式表
     */
    @JsonIgnore
    public void resetNavBarPSSysCssId(){
        this.reset(FIELD_NAVBARPSSYSCSSID);
    }

    /**
     * 设置 导航栏样式表
     * <P>
     * 等同 {@link #setNavBarPSSysCssId}
     * @param navBarPSSysCssId
     */
    @JsonIgnore
    public PSSysDashboard navbarpssyscssid(String navBarPSSysCssId){
        this.setNavBarPSSysCssId(navBarPSSysCssId);
        return this;
    }

    /**
     * 设置 导航栏样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNavBarPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysDashboard navbarpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setNavBarPSSysCssId(null);
            this.setNavBarPSSysCssName(null);
        }
        else{
            this.setNavBarPSSysCssId(pSSysCss.getPSSysCssId());
            this.setNavBarPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>NAVBARPSSYSCSSNAME</B>&nbsp;导航栏样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAVBARPSSYSCSSID}
     */
    public final static String FIELD_NAVBARPSSYSCSSNAME = "navbarpssyscssname";

    /**
     * 设置 导航栏样式表
     * 
     * @param navBarPSSysCssName
     * 
     */
    @JsonProperty(FIELD_NAVBARPSSYSCSSNAME)
    public void setNavBarPSSysCssName(String navBarPSSysCssName){
        this.set(FIELD_NAVBARPSSYSCSSNAME, navBarPSSysCssName);
    }
    
    /**
     * 获取 导航栏样式表  
     * @return
     */
    @JsonIgnore
    public String getNavBarPSSysCssName(){
        Object objValue = this.get(FIELD_NAVBARPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导航栏样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNavBarPSSysCssNameDirty(){
        if(this.contains(FIELD_NAVBARPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导航栏样式表
     */
    @JsonIgnore
    public void resetNavBarPSSysCssName(){
        this.reset(FIELD_NAVBARPSSYSCSSNAME);
    }

    /**
     * 设置 导航栏样式表
     * <P>
     * 等同 {@link #setNavBarPSSysCssName}
     * @param navBarPSSysCssName
     */
    @JsonIgnore
    public PSSysDashboard navbarpssyscssname(String navBarPSSysCssName){
        this.setNavBarPSSysCssName(navBarPSSysCssName);
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
    public PSSysDashboard navbarstyle(String navBarStyle){
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
    public PSSysDashboard navbarstyle(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailStyle navBarStyle){
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
    public PSSysDashboard navbarwidth(Integer navBarWidth){
        this.setNavBarWidth(navBarWidth);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定数据看板部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSSysDashboard psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSSysDashboard psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定数据看板部件默认附加的部件逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSSysDashboard psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据看板部件所属实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysDashboard psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysDashboard psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定数据看板部件所属实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysDashboard psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统数据看板所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysDashboard psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSSysDashboard psmoduleid(PSModule pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统数据看板所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysDashboard psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSSysDashboard pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 默认样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysDashboard pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 默认样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysDashboard pssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 默认样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysDashboard pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDASHBOARDID</B>&nbsp;系统数据看板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDASHBOARDID = "pssysdashboardid";

    /**
     * 设置 系统数据看板标识
     * 
     * @param pSSysDashboardId
     * 
     */
    @JsonProperty(FIELD_PSSYSDASHBOARDID)
    public void setPSSysDashboardId(String pSSysDashboardId){
        this.set(FIELD_PSSYSDASHBOARDID, pSSysDashboardId);
    }
    
    /**
     * 获取 系统数据看板标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDashboardId(){
        Object objValue = this.get(FIELD_PSSYSDASHBOARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据看板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDashboardIdDirty(){
        if(this.contains(FIELD_PSSYSDASHBOARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据看板标识
     */
    @JsonIgnore
    public void resetPSSysDashboardId(){
        this.reset(FIELD_PSSYSDASHBOARDID);
    }

    /**
     * 设置 系统数据看板标识
     * <P>
     * 等同 {@link #setPSSysDashboardId}
     * @param pSSysDashboardId
     */
    @JsonIgnore
    public PSSysDashboard pssysdashboardid(String pSSysDashboardId){
        this.setPSSysDashboardId(pSSysDashboardId);
        return this;
    }

    /**
     * <B>PSSYSDASHBOARDNAME</B>&nbsp;数据看板名称，指定数据看板部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDASHBOARDNAME = "pssysdashboardname";

    /**
     * 设置 数据看板名称，详细说明：{@link #FIELD_PSSYSDASHBOARDNAME}
     * 
     * @param pSSysDashboardName
     * 
     */
    @JsonProperty(FIELD_PSSYSDASHBOARDNAME)
    public void setPSSysDashboardName(String pSSysDashboardName){
        this.set(FIELD_PSSYSDASHBOARDNAME, pSSysDashboardName);
    }
    
    /**
     * 获取 数据看板名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDashboardName(){
        Object objValue = this.get(FIELD_PSSYSDASHBOARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据看板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDashboardNameDirty(){
        if(this.contains(FIELD_PSSYSDASHBOARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据看板名称
     */
    @JsonIgnore
    public void resetPSSysDashboardName(){
        this.reset(FIELD_PSSYSDASHBOARDNAME);
    }

    /**
     * 设置 数据看板名称，详细说明：{@link #FIELD_PSSYSDASHBOARDNAME}
     * <P>
     * 等同 {@link #setPSSysDashboardName}
     * @param pSSysDashboardName
     */
    @JsonIgnore
    public PSSysDashboard pssysdashboardname(String pSSysDashboardName){
        this.setPSSysDashboardName(pSSysDashboardName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDashboardName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDashboardName(strName);
    }

    @JsonIgnore
    public PSSysDashboard name(String strName){
        this.setPSSysDashboardName(strName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定数据看板部件使用的前端模板扩展插件，使用插件类型【数据看板绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSSysDashboard pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysDashboard pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定数据看板部件使用的前端模板扩展插件，使用插件类型【数据看板绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSSysDashboard pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSSysDashboard psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 视图消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSSysDashboard psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSSysDashboard psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
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
    public PSSysDashboard updatedate(String updateDate){
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
    public PSSysDashboard updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDashboardId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDashboardId(strValue);
    }

    @JsonIgnore
    public PSSysDashboard id(String strValue){
        this.setPSSysDashboardId(strValue);
        return this;
    }


    /**
     *  数据看板逻辑 成员集合
     */
    public final static String FIELD_PSSYSDASHBOARDLOGICS = "pssysdashboardlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysDashboardLogic> pssysdashboardlogics;

    /**
     * 获取 数据看板逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSDASHBOARDLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysDashboardLogic> getPSSysDashboardLogics(){
        return this.pssysdashboardlogics;
    }

    /**
     * 设置 数据看板逻辑 成员集合  
     * @param pssysdashboardlogics
     */
    @JsonProperty(FIELD_PSSYSDASHBOARDLOGICS)
    public void setPSSysDashboardLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSSysDashboardLogic> pssysdashboardlogics){
        this.pssysdashboardlogics = pssysdashboardlogics;
    }

    /**
     * 获取 数据看板逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysDashboardLogic> getPSSysDashboardLogicsIf(){
        if(this.pssysdashboardlogics == null){
            this.pssysdashboardlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysDashboardLogic>();          
        }
        return this.pssysdashboardlogics;
    }


    /**
     *  数据看板成员 成员集合
     */
    public final static String FIELD_PSSYSDBPARTS = "pssysdbparts";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysDBPart> pssysdbparts;

    /**
     * 获取 数据看板成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSDBPARTS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysDBPart> getPSSysDBParts(){
        return this.pssysdbparts;
    }

    /**
     * 设置 数据看板成员 成员集合  
     * @param pssysdbparts
     */
    @JsonProperty(FIELD_PSSYSDBPARTS)
    public void setPSSysDBParts(java.util.List<net.ibizsys.psmodel.core.domain.PSSysDBPart> pssysdbparts){
        this.pssysdbparts = pssysdbparts;
    }

    /**
     * 获取 数据看板成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysDBPart> getPSSysDBPartsIf(){
        if(this.pssysdbparts == null){
            this.pssysdbparts = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysDBPart>();          
        }
        return this.pssysdbparts;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysDashboard){
            PSSysDashboard model = (PSSysDashboard)iPSModel;
            model.setPSSysDashboardLogics(this.getPSSysDashboardLogics());
            model.setPSSysDBParts(this.getPSSysDBParts());
        }
        super.copyTo(iPSModel);
    }
}
