package net.ibizsys.centralstudio.dto;

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
public class PSAppPortalViewDTO extends PSAppViewDTO {

    public PSAppPortalViewDTO(){
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
    public PSAppPortalViewDTO colmodel(String colModel){
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSAppPortalViewDTO createdate(Timestamp createDate){
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
    public PSAppPortalViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTPAGE</B>&nbsp;系统默认页，指定应用数据看板视图是否为所属应用的默认页，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSAppPortalViewDTO defaultpage(Integer defaultPage){
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
    public PSAppPortalViewDTO defaultpage(Boolean defaultPage){
        if(defaultPage == null){
            this.setDefaultPage(null);
        }
        else{
            this.setDefaultPage(defaultPage?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZE</B>&nbsp;支持定制，指定应用数据看板视图是否支持用户自定义，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZE = "enablecustomize";

    /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZE}
     * 
     * @param enableCustomize
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZE)
    public void setEnableCustomize(Integer enableCustomize){
        this.set(FIELD_ENABLECUSTOMIZE, enableCustomize);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomize(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZE);
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
    public boolean isEnableCustomizeDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomize(){
        this.reset(FIELD_ENABLECUSTOMIZE);
    }

    /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZE}
     * <P>
     * 等同 {@link #setEnableCustomize}
     * @param enableCustomize
     */
    @JsonIgnore
    public PSAppPortalViewDTO enablecustomize(Integer enableCustomize){
        this.setEnableCustomize(enableCustomize);
        return this;
    }

     /**
     * 设置 支持定制，详细说明：{@link #FIELD_ENABLECUSTOMIZE}
     * <P>
     * 等同 {@link #setEnableCustomize}
     * @param enableCustomize
     */
    @JsonIgnore
    public PSAppPortalViewDTO enablecustomize(Boolean enableCustomize){
        if(enableCustomize == null){
            this.setEnableCustomize(null);
        }
        else{
            this.setEnableCustomize(enableCustomize?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FLEXALIGN</B>&nbsp;Flex横轴对齐，视图默认数据看板部件布局模式为【Flex布局】时指定横轴对齐方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.FlexAlign} 
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
    public PSAppPortalViewDTO flexalign(String flexAlign){
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
    public PSAppPortalViewDTO flexalign(net.ibizsys.model.PSModelEnums.FlexAlign flexAlign){
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
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.FlexLayoutDir} 
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
    public PSAppPortalViewDTO flexdir(String flexDir){
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
    public PSAppPortalViewDTO flexdir(net.ibizsys.model.PSModelEnums.FlexLayoutDir flexDir){
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
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.FlexVAlign} 
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
    public PSAppPortalViewDTO flexvalign(String flexVAlign){
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
    public PSAppPortalViewDTO flexvalign(net.ibizsys.model.PSModelEnums.FlexVAlign flexVAlign){
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
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.LayoutMode} 
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
    public PSAppPortalViewDTO layoutmode(String layoutMode){
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
    public PSAppPortalViewDTO layoutmode(net.ibizsys.model.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
        }
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
    public PSAppPortalViewDTO psappportalviewid(String pSAppPortalViewId){
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
    public PSAppPortalViewDTO psappportalviewname(String pSAppPortalViewName){
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
    public PSAppPortalViewDTO name(String strName){
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSAppPortalViewDTO updatedate(Timestamp updateDate){
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
    public PSAppPortalViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppPortalViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppPortalViewId(strValue);
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
    public PSAppPortalViewDTO id(String strValue){
        this.setPSAppPortalViewId(strValue);
        return this;
    }


    /**
     *  应用门户视图部件 成员集合
     */
    public final static String FIELD_PSAPPPVPARTS = "psapppvparts";

    private java.util.List<net.ibizsys.centralstudio.dto.PSAppPVPartDTO> psapppvparts;

    /**
     * 获取 应用门户视图部件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSAPPPVPARTS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSAppPVPartDTO> getPSAppPVParts(){
        return this.psapppvparts;
    }

    /**
     * 设置 应用门户视图部件 成员集合  
     * @param psapppvparts
     */
    @JsonProperty(FIELD_PSAPPPVPARTS)
    public void setPSAppPVParts(java.util.List<net.ibizsys.centralstudio.dto.PSAppPVPartDTO> psapppvparts){
        this.psapppvparts = psapppvparts;
    }

    /**
     * 获取 应用门户视图部件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSAppPVPartDTO> getPSAppPVPartsIf(){
        if(this.psapppvparts == null){
            this.psapppvparts = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSAppPVPartDTO>();          
        }
        return this.psapppvparts;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppPortalViewDTO){
            PSAppPortalViewDTO dto = (PSAppPortalViewDTO)iEntity;
            dto.setPSAppPVParts(this.getPSAppPVParts());
        }
        super.copyTo(iEntity);
    }
}
