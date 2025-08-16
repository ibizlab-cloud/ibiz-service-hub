package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPPANELVIEW</B>应用面板视图 模型传输对象
 * <P>
 * 应用面板视图模型，应用面板视图内置面板部件，提供自由布局的多部件呈现能力
 */
public class PSAppPanelViewDTO extends PSAppViewDTO {

    public PSAppPanelViewDTO(){
        this.setPSAppViewType("APPPANELVIEW");
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
    public PSAppPanelViewDTO createdate(Timestamp createDate){
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
    public PSAppPanelViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定视图默认面板部件的布局模式，未定义时使用前端应用使用模板的默认布局模式
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
    public PSAppPanelViewDTO layoutmode(String layoutMode){
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
    public PSAppPanelViewDTO layoutmode(net.ibizsys.model.PSModelEnums.LayoutMode layoutMode){
        if(layoutMode == null){
            this.setLayoutMode(null);
        }
        else{
            this.setLayoutMode(layoutMode.value);
        }
        return this;
    }

    /**
     * <B>PANELSTYLE</B>&nbsp;面板样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PANELSTYLE = "panelstyle";

    /**
     * 设置 面板样式
     * 
     * @param panelStyle
     * 
     */
    @JsonProperty(FIELD_PANELSTYLE)
    public void setPanelStyle(String panelStyle){
        this.set(FIELD_PANELSTYLE, panelStyle);
    }
    
    /**
     * 获取 面板样式  
     * @return
     */
    @JsonIgnore
    public String getPanelStyle(){
        Object objValue = this.get(FIELD_PANELSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 面板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelStyleDirty(){
        if(this.contains(FIELD_PANELSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板样式
     */
    @JsonIgnore
    public void resetPanelStyle(){
        this.reset(FIELD_PANELSTYLE);
    }

    /**
     * 设置 面板样式
     * <P>
     * 等同 {@link #setPanelStyle}
     * @param panelStyle
     */
    @JsonIgnore
    public PSAppPanelViewDTO panelstyle(String panelStyle){
        this.setPanelStyle(panelStyle);
        return this;
    }

    /**
     * <B>PANELWIDTH</B>&nbsp;面板宽度
     */
    public final static String FIELD_PANELWIDTH = "panelwidth";

    /**
     * 设置 面板宽度
     * 
     * @param panelWidth
     * 
     */
    @JsonProperty(FIELD_PANELWIDTH)
    public void setPanelWidth(Integer panelWidth){
        this.set(FIELD_PANELWIDTH, panelWidth);
    }
    
    /**
     * 获取 面板宽度  
     * @return
     */
    @JsonIgnore
    public Integer getPanelWidth(){
        Object objValue = this.get(FIELD_PANELWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelWidthDirty(){
        if(this.contains(FIELD_PANELWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板宽度
     */
    @JsonIgnore
    public void resetPanelWidth(){
        this.reset(FIELD_PANELWIDTH);
    }

    /**
     * 设置 面板宽度
     * <P>
     * 等同 {@link #setPanelWidth}
     * @param panelWidth
     */
    @JsonIgnore
    public PSAppPanelViewDTO panelwidth(Integer panelWidth){
        this.setPanelWidth(panelWidth);
        return this;
    }

    /**
     * <B>PSAPPPANELVIEWID</B>&nbsp;应用面板视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPPANELVIEWID = "psapppanelviewid";

    /**
     * 设置 应用面板视图标识
     * 
     * @param pSAppPanelViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPPANELVIEWID)
    public void setPSAppPanelViewId(String pSAppPanelViewId){
        this.set(FIELD_PSAPPPANELVIEWID, pSAppPanelViewId);
        this.set(FIELD_PSAPPVIEWID, pSAppPanelViewId);        
    }
    
    /**
     * 获取 应用面板视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPanelViewId(){
        Object objValue = this.get(FIELD_PSAPPPANELVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用面板视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPanelViewIdDirty(){
        if(this.contains(FIELD_PSAPPPANELVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用面板视图标识
     */
    @JsonIgnore
    public void resetPSAppPanelViewId(){
        this.reset(FIELD_PSAPPPANELVIEWID);
        this.reset(FIELD_PSAPPVIEWID);        
    }

    /**
     * 设置 应用面板视图标识
     * <P>
     * 等同 {@link #setPSAppPanelViewId}
     * @param pSAppPanelViewId
     */
    @JsonIgnore
    public PSAppPanelViewDTO psapppanelviewid(String pSAppPanelViewId){
        this.setPSAppPanelViewId(pSAppPanelViewId);
        return this;
    }

    /**
     * <B>PSAPPPANELVIEWNAME</B>&nbsp;代码标识，指定应用面板视图的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPPANELVIEWNAME = "psapppanelviewname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPPANELVIEWNAME}
     * 
     * @param pSAppPanelViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPPANELVIEWNAME)
    public void setPSAppPanelViewName(String pSAppPanelViewName){
        this.set(FIELD_PSAPPPANELVIEWNAME, pSAppPanelViewName);
        this.set(FIELD_PSAPPVIEWNAME, pSAppPanelViewName);        
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPanelViewName(){
        Object objValue = this.get(FIELD_PSAPPPANELVIEWNAME);
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
    public boolean isPSAppPanelViewNameDirty(){
        if(this.contains(FIELD_PSAPPPANELVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppPanelViewName(){
        this.reset(FIELD_PSAPPPANELVIEWNAME);
        this.reset(FIELD_PSAPPVIEWNAME);        
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPPANELVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppPanelViewName}
     * @param pSAppPanelViewName
     */
    @JsonIgnore
    public PSAppPanelViewDTO psapppanelviewname(String pSAppPanelViewName){
        this.setPSAppPanelViewName(pSAppPanelViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppPanelViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppPanelViewName(strName);
    }

    @JsonIgnore
    public PSAppPanelViewDTO name(String strName){
        this.setPSAppPanelViewName(strName);
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
    public PSAppPanelViewDTO updatedate(Timestamp updateDate){
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
    public PSAppPanelViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppPanelViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppPanelViewId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppPanelViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppPanelViewId(strValue);
    }

    @JsonIgnore
    public PSAppPanelViewDTO id(String strValue){
        this.setPSAppPanelViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppPanelViewDTO){
            PSAppPanelViewDTO dto = (PSAppPanelViewDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
