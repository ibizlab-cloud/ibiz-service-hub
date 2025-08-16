package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPVIEW</B>应用视图 模型传输对象
 * <P>
 * 前端应用的基本视图对象模型，具体类型的视图模型都必须继承该对象
 */
public class PSAppView extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppView(){
    }      

    /**
     * <B>ACCUSERMODE</B>&nbsp;访问用户模式，指定授权访问该视图的用户类型，未定义时为【未指定】，由前端应用决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AccessUserMode} 
     */
    public final static String FIELD_ACCUSERMODE = "accusermode";

    /**
     * 设置 访问用户模式，详细说明：{@link #FIELD_ACCUSERMODE}
     * 
     * @param accUserMode
     * 
     */
    @JsonProperty(FIELD_ACCUSERMODE)
    public void setAccUserMode(String accUserMode){
        this.set(FIELD_ACCUSERMODE, accUserMode);
    }
    
    /**
     * 获取 访问用户模式  
     * @return
     */
    @JsonIgnore
    public String getAccUserMode(){
        Object objValue = this.get(FIELD_ACCUSERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccUserModeDirty(){
        if(this.contains(FIELD_ACCUSERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问用户模式
     */
    @JsonIgnore
    public void resetAccUserMode(){
        this.reset(FIELD_ACCUSERMODE);
    }

    /**
     * 设置 访问用户模式，详细说明：{@link #FIELD_ACCUSERMODE}
     * <P>
     * 等同 {@link #setAccUserMode}
     * @param accUserMode
     */
    @JsonIgnore
    public PSAppView accusermode(String accUserMode){
        this.setAccUserMode(accUserMode);
        return this;
    }

     /**
     * 设置 访问用户模式，详细说明：{@link #FIELD_ACCUSERMODE}
     * <P>
     * 等同 {@link #setAccUserMode}
     * @param accUserMode
     */
    @JsonIgnore
    public PSAppView accusermode(net.ibizsys.psmodel.core.util.PSModelEnums.AccessUserMode accUserMode){
        if(accUserMode == null){
            this.setAccUserMode(null);
        }
        else{
            this.setAccUserMode(accUserMode.value);
        }
        return this;
    }

    /**
     * <B>APPVIEWSN</B>&nbsp;应用视图编号，指定应用视图的编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_APPVIEWSN = "appviewsn";

    /**
     * 设置 应用视图编号，详细说明：{@link #FIELD_APPVIEWSN}
     * 
     * @param appViewSN
     * 
     */
    @JsonProperty(FIELD_APPVIEWSN)
    public void setAppViewSN(String appViewSN){
        this.set(FIELD_APPVIEWSN, appViewSN);
    }
    
    /**
     * 获取 应用视图编号  
     * @return
     */
    @JsonIgnore
    public String getAppViewSN(){
        Object objValue = this.get(FIELD_APPVIEWSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppViewSNDirty(){
        if(this.contains(FIELD_APPVIEWSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图编号
     */
    @JsonIgnore
    public void resetAppViewSN(){
        this.reset(FIELD_APPVIEWSN);
    }

    /**
     * 设置 应用视图编号，详细说明：{@link #FIELD_APPVIEWSN}
     * <P>
     * 等同 {@link #setAppViewSN}
     * @param appViewSN
     */
    @JsonIgnore
    public PSAppView appviewsn(String appViewSN){
        this.setAppViewSN(appViewSN);
        return this;
    }

    /**
     * <B>APPVIEWSTATE</B>&nbsp;应用视图状态
     */
    public final static String FIELD_APPVIEWSTATE = "appviewstate";

    /**
     * 设置 应用视图状态
     * 
     * @param appViewState
     * 
     */
    @JsonProperty(FIELD_APPVIEWSTATE)
    public void setAppViewState(Integer appViewState){
        this.set(FIELD_APPVIEWSTATE, appViewState);
    }
    
    /**
     * 获取 应用视图状态  
     * @return
     */
    @JsonIgnore
    public Integer getAppViewState(){
        Object objValue = this.get(FIELD_APPVIEWSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 应用视图状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppViewStateDirty(){
        if(this.contains(FIELD_APPVIEWSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图状态
     */
    @JsonIgnore
    public void resetAppViewState(){
        this.reset(FIELD_APPVIEWSTATE);
    }

    /**
     * 设置 应用视图状态
     * <P>
     * 等同 {@link #setAppViewState}
     * @param appViewState
     */
    @JsonIgnore
    public PSAppView appviewstate(Integer appViewState){
        this.setAppViewState(appViewState);
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定应用视图的标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_CAPPSLANRESID = "cappslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * 
     * @param capPSLanResId
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESID)
    public void setCapPSLanResId(String capPSLanResId){
        this.set(FIELD_CAPPSLANRESID, capPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResId(){
        Object objValue = this.get(FIELD_CAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResIdDirty(){
        if(this.contains(FIELD_CAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResId(){
        this.reset(FIELD_CAPPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param capPSLanResId
     */
    @JsonIgnore
    public PSAppView cappslanresid(String capPSLanResId){
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppView cappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        }
        else{
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定应用视图的标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CAPPSLANRESID}
     */
    public final static String FIELD_CAPPSLANRESNAME = "cappslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * 
     * @param capPSLanResName
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESNAME)
    public void setCapPSLanResName(String capPSLanResName){
        this.set(FIELD_CAPPSLANRESNAME, capPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResName(){
        Object objValue = this.get(FIELD_CAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCapPSLanResNameDirty(){
        if(this.contains(FIELD_CAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResName(){
        this.reset(FIELD_CAPPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setCapPSLanResName}
     * @param capPSLanResName
     */
    @JsonIgnore
    public PSAppView cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;视图标题，指定应用视图的标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 视图标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 视图标题  
     * @return
     */
    @JsonIgnore
    public String getCaption(){
        Object objValue = this.get(FIELD_CAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionDirty(){
        if(this.contains(FIELD_CAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 视图标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSAppView caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;颜色，指定应用视图的标记颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 颜色，详细说明：{@link #FIELD_COLOR}
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 颜色，详细说明：{@link #FIELD_COLOR}
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSAppView color(String color){
        this.setColor(color);
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
    public PSAppView createdate(String createDate){
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
    public PSAppView createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DYNCMODE</B>&nbsp;视图优先级
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppViewPriority} 
     */
    public final static String FIELD_DYNCMODE = "dyncmode";

    /**
     * 设置 视图优先级
     * 
     * @param dyncMode
     * 
     */
    @JsonProperty(FIELD_DYNCMODE)
    public void setDyncMode(Integer dyncMode){
        this.set(FIELD_DYNCMODE, dyncMode);
    }
    
    /**
     * 获取 视图优先级  
     * @return
     */
    @JsonIgnore
    public Integer getDyncMode(){
        Object objValue = this.get(FIELD_DYNCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图优先级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDyncModeDirty(){
        if(this.contains(FIELD_DYNCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图优先级
     */
    @JsonIgnore
    public void resetDyncMode(){
        this.reset(FIELD_DYNCMODE);
    }

    /**
     * 设置 视图优先级
     * <P>
     * 等同 {@link #setDyncMode}
     * @param dyncMode
     */
    @JsonIgnore
    public PSAppView dyncmode(Integer dyncMode){
        this.setDyncMode(dyncMode);
        return this;
    }

     /**
     * 设置 视图优先级
     * <P>
     * 等同 {@link #setDyncMode}
     * @param dyncMode
     */
    @JsonIgnore
    public PSAppView dyncmode(net.ibizsys.psmodel.core.util.PSModelEnums.AppViewPriority dyncMode){
        if(dyncMode == null){
            this.setDyncMode(null);
        }
        else{
            this.setDyncMode(dyncMode.value);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWSTYLE</B>&nbsp;启用视图级别样式，指定应用视图是否启用视图级别界面样式，未定义是为【否】，此配置为早期模板保留
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWSTYLE = "enableviewstyle";

    /**
     * 设置 启用视图级别样式，详细说明：{@link #FIELD_ENABLEVIEWSTYLE}
     * 
     * @param enableViewStyle
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWSTYLE)
    public void setEnableViewStyle(Integer enableViewStyle){
        this.set(FIELD_ENABLEVIEWSTYLE, enableViewStyle);
    }
    
    /**
     * 获取 启用视图级别样式  
     * @return
     */
    @JsonIgnore
    public Integer getEnableViewStyle(){
        Object objValue = this.get(FIELD_ENABLEVIEWSTYLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图级别样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableViewStyleDirty(){
        if(this.contains(FIELD_ENABLEVIEWSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图级别样式
     */
    @JsonIgnore
    public void resetEnableViewStyle(){
        this.reset(FIELD_ENABLEVIEWSTYLE);
    }

    /**
     * 设置 启用视图级别样式，详细说明：{@link #FIELD_ENABLEVIEWSTYLE}
     * <P>
     * 等同 {@link #setEnableViewStyle}
     * @param enableViewStyle
     */
    @JsonIgnore
    public PSAppView enableviewstyle(Integer enableViewStyle){
        this.setEnableViewStyle(enableViewStyle);
        return this;
    }

     /**
     * 设置 启用视图级别样式，详细说明：{@link #FIELD_ENABLEVIEWSTYLE}
     * <P>
     * 等同 {@link #setEnableViewStyle}
     * @param enableViewStyle
     */
    @JsonIgnore
    public PSAppView enableviewstyle(Boolean enableViewStyle){
        if(enableViewStyle == null){
            this.setEnableViewStyle(null);
        }
        else{
            this.setEnableViewStyle(enableViewStyle?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LAYOUTPANELMODE</B>&nbsp;布局面板模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutPanelMode} 
     */
    public final static String FIELD_LAYOUTPANELMODE = "layoutpanelmode";

    /**
     * 设置 布局面板模式
     * 
     * @param layoutPanelMode
     * 
     */
    @JsonProperty(FIELD_LAYOUTPANELMODE)
    public void setLayoutPanelMode(Integer layoutPanelMode){
        this.set(FIELD_LAYOUTPANELMODE, layoutPanelMode);
    }
    
    /**
     * 获取 布局面板模式  
     * @return
     */
    @JsonIgnore
    public Integer getLayoutPanelMode(){
        Object objValue = this.get(FIELD_LAYOUTPANELMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 布局面板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutPanelModeDirty(){
        if(this.contains(FIELD_LAYOUTPANELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板模式
     */
    @JsonIgnore
    public void resetLayoutPanelMode(){
        this.reset(FIELD_LAYOUTPANELMODE);
    }

    /**
     * 设置 布局面板模式
     * <P>
     * 等同 {@link #setLayoutPanelMode}
     * @param layoutPanelMode
     */
    @JsonIgnore
    public PSAppView layoutpanelmode(Integer layoutPanelMode){
        this.setLayoutPanelMode(layoutPanelMode);
        return this;
    }

     /**
     * 设置 布局面板模式
     * <P>
     * 等同 {@link #setLayoutPanelMode}
     * @param layoutPanelMode
     */
    @JsonIgnore
    public PSAppView layoutpanelmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutPanelMode layoutPanelMode){
        if(layoutPanelMode == null){
            this.setLayoutPanelMode(null);
        }
        else{
            this.setLayoutPanelMode(layoutPanelMode.value);
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
    public PSAppView memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODCOLOR</B>&nbsp;模块颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMODULEID}
     */
    public final static String FIELD_MODCOLOR = "modcolor";

    /**
     * 设置 模块颜色
     * 
     * @param modColor
     * 
     */
    @JsonProperty(FIELD_MODCOLOR)
    public void setModColor(String modColor){
        this.set(FIELD_MODCOLOR, modColor);
    }
    
    /**
     * 获取 模块颜色  
     * @return
     */
    @JsonIgnore
    public String getModColor(){
        Object objValue = this.get(FIELD_MODCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModColorDirty(){
        if(this.contains(FIELD_MODCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块颜色
     */
    @JsonIgnore
    public void resetModColor(){
        this.reset(FIELD_MODCOLOR);
    }

    /**
     * 设置 模块颜色
     * <P>
     * 等同 {@link #setModColor}
     * @param modColor
     */
    @JsonIgnore
    public PSAppView modcolor(String modColor){
        this.setModColor(modColor);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;视图后台处理对象，指定应用视图的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSACHandler} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 视图后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 视图后台处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图后台处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 视图后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSAppView psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 视图后台处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSAppView psachandlerid(PSACHandler pSACHandler){
        if(pSACHandler == null){
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        }
        else{
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;视图处理对象，指定应用视图的界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 视图处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 视图处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 视图处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSAppView psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSAPPDATAENTITYID</B>&nbsp;应用实体，指定应用视图的相关应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppDataEntity} 
     */
    public final static String FIELD_PSAPPDATAENTITYID = "psappdataentityid";

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYID}
     * 
     * @param pSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYID)
    public void setPSAppDataEntityId(String pSAppDataEntityId){
        this.set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldeid", pSAppDataEntityId);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityId(){
        this.reset(FIELD_PSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldeid");
    }

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYID}
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntityId
     */
    @JsonIgnore
    public PSAppView psappdataentityid(String pSAppDataEntityId){
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    /**
     * 设置 应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppView psappdataentityid(PSAppDataEntity pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
        }
        else{
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId(){
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEId(String pSAppLocalDEId){
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty(){
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId(){
        this.resetPSAppDataEntityId();
    }

    /**
     * <B>PSAPPDATAENTITYNAME</B>&nbsp;应用实体，指定应用视图的相关应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
     */
    public final static String FIELD_PSAPPDATAENTITYNAME = "psappdataentityname";

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYNAME}
     * 
     * @param pSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYNAME)
    public void setPSAppDataEntityName(String pSAppDataEntityName){
        this.set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldename", pSAppDataEntityName);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityName(){
        this.reset(FIELD_PSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldename");
    }

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYNAME}
     * <P>
     * 等同 {@link #setPSAppDataEntityName}
     * @param pSAppDataEntityName
     */
    @JsonIgnore
    public PSAppView psappdataentityname(String pSAppDataEntityName){
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName(){
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEName(String pSAppLocalDEName){
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty(){
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName(){
        this.resetPSAppDataEntityName();
    }

    /**
     * <B>PSAPPMODULEID</B>&nbsp;应用模块，指定应用视图的应用模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppModule} 
     */
    public final static String FIELD_PSAPPMODULEID = "psappmoduleid";

    /**
     * 设置 应用模块，详细说明：{@link #FIELD_PSAPPMODULEID}
     * 
     * @param pSAppModuleId
     * 
     */
    @JsonProperty(FIELD_PSAPPMODULEID)
    public void setPSAppModuleId(String pSAppModuleId){
        this.set(FIELD_PSAPPMODULEID, pSAppModuleId);
    }
    
    /**
     * 获取 应用模块  
     * @return
     */
    @JsonIgnore
    public String getPSAppModuleId(){
        Object objValue = this.get(FIELD_PSAPPMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppModuleIdDirty(){
        if(this.contains(FIELD_PSAPPMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模块
     */
    @JsonIgnore
    public void resetPSAppModuleId(){
        this.reset(FIELD_PSAPPMODULEID);
    }

    /**
     * 设置 应用模块，详细说明：{@link #FIELD_PSAPPMODULEID}
     * <P>
     * 等同 {@link #setPSAppModuleId}
     * @param pSAppModuleId
     */
    @JsonIgnore
    public PSAppView psappmoduleid(String pSAppModuleId){
        this.setPSAppModuleId(pSAppModuleId);
        return this;
    }

    /**
     * 设置 应用模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppModuleId}
     * @param pSAppModule 引用对象
     */
    @JsonIgnore
    public PSAppView psappmoduleid(PSAppModule pSAppModule){
        if(pSAppModule == null){
            this.setModColor(null);
            this.setPSAppModuleId(null);
            this.setPSAppModuleName(null);
        }
        else{
            this.setModColor(pSAppModule.getColor());
            this.setPSAppModuleId(pSAppModule.getPSAppModuleId());
            this.setPSAppModuleName(pSAppModule.getPSAppModuleName());
        }
        return this;
    }

    /**
     * <B>PSAPPMODULENAME</B>&nbsp;应用模块，指定应用视图的应用模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMODULEID}
     */
    public final static String FIELD_PSAPPMODULENAME = "psappmodulename";

    /**
     * 设置 应用模块，详细说明：{@link #FIELD_PSAPPMODULENAME}
     * 
     * @param pSAppModuleName
     * 
     */
    @JsonProperty(FIELD_PSAPPMODULENAME)
    public void setPSAppModuleName(String pSAppModuleName){
        this.set(FIELD_PSAPPMODULENAME, pSAppModuleName);
    }
    
    /**
     * 获取 应用模块  
     * @return
     */
    @JsonIgnore
    public String getPSAppModuleName(){
        Object objValue = this.get(FIELD_PSAPPMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppModuleNameDirty(){
        if(this.contains(FIELD_PSAPPMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模块
     */
    @JsonIgnore
    public void resetPSAppModuleName(){
        this.reset(FIELD_PSAPPMODULENAME);
    }

    /**
     * 设置 应用模块，详细说明：{@link #FIELD_PSAPPMODULENAME}
     * <P>
     * 等同 {@link #setPSAppModuleName}
     * @param pSAppModuleName
     */
    @JsonIgnore
    public PSAppView psappmodulename(String pSAppModuleName){
        this.setPSAppModuleName(pSAppModuleName);
        return this;
    }

    /**
     * <B>PSAPPTITLEBARID</B>&nbsp;应用标题栏，指定应用视图使用的标题栏部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppTitleBar} 
     */
    public final static String FIELD_PSAPPTITLEBARID = "psapptitlebarid";

    /**
     * 设置 应用标题栏，详细说明：{@link #FIELD_PSAPPTITLEBARID}
     * 
     * @param pSAppTitleBarId
     * 
     */
    @JsonProperty(FIELD_PSAPPTITLEBARID)
    public void setPSAppTitleBarId(String pSAppTitleBarId){
        this.set(FIELD_PSAPPTITLEBARID, pSAppTitleBarId);
    }
    
    /**
     * 获取 应用标题栏  
     * @return
     */
    @JsonIgnore
    public String getPSAppTitleBarId(){
        Object objValue = this.get(FIELD_PSAPPTITLEBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标题栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTitleBarIdDirty(){
        if(this.contains(FIELD_PSAPPTITLEBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标题栏
     */
    @JsonIgnore
    public void resetPSAppTitleBarId(){
        this.reset(FIELD_PSAPPTITLEBARID);
    }

    /**
     * 设置 应用标题栏，详细说明：{@link #FIELD_PSAPPTITLEBARID}
     * <P>
     * 等同 {@link #setPSAppTitleBarId}
     * @param pSAppTitleBarId
     */
    @JsonIgnore
    public PSAppView psapptitlebarid(String pSAppTitleBarId){
        this.setPSAppTitleBarId(pSAppTitleBarId);
        return this;
    }

    /**
     * 设置 应用标题栏，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppTitleBarId}
     * @param pSAppTitleBar 引用对象
     */
    @JsonIgnore
    public PSAppView psapptitlebarid(PSAppTitleBar pSAppTitleBar){
        if(pSAppTitleBar == null){
            this.setPSAppTitleBarId(null);
            this.setPSAppTitleBarName(null);
        }
        else{
            this.setPSAppTitleBarId(pSAppTitleBar.getPSAppTitleBarId());
            this.setPSAppTitleBarName(pSAppTitleBar.getPSAppTitleBarName());
        }
        return this;
    }

    /**
     * <B>PSAPPTITLEBARNAME</B>&nbsp;应用标题栏，指定应用视图使用的标题栏部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPTITLEBARID}
     */
    public final static String FIELD_PSAPPTITLEBARNAME = "psapptitlebarname";

    /**
     * 设置 应用标题栏，详细说明：{@link #FIELD_PSAPPTITLEBARNAME}
     * 
     * @param pSAppTitleBarName
     * 
     */
    @JsonProperty(FIELD_PSAPPTITLEBARNAME)
    public void setPSAppTitleBarName(String pSAppTitleBarName){
        this.set(FIELD_PSAPPTITLEBARNAME, pSAppTitleBarName);
    }
    
    /**
     * 获取 应用标题栏  
     * @return
     */
    @JsonIgnore
    public String getPSAppTitleBarName(){
        Object objValue = this.get(FIELD_PSAPPTITLEBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用标题栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTitleBarNameDirty(){
        if(this.contains(FIELD_PSAPPTITLEBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用标题栏
     */
    @JsonIgnore
    public void resetPSAppTitleBarName(){
        this.reset(FIELD_PSAPPTITLEBARNAME);
    }

    /**
     * 设置 应用标题栏，详细说明：{@link #FIELD_PSAPPTITLEBARNAME}
     * <P>
     * 等同 {@link #setPSAppTitleBarName}
     * @param pSAppTitleBarName
     */
    @JsonIgnore
    public PSAppView psapptitlebarname(String pSAppTitleBarName){
        this.setPSAppTitleBarName(pSAppTitleBarName);
        return this;
    }

    /**
     * <B>PSAPPUTILVIEWTYPE</B>&nbsp;应用功能视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilViewType} 
     */
    public final static String FIELD_PSAPPUTILVIEWTYPE = "psapputilviewtype";

    /**
     * 设置 应用功能视图类型
     * 
     * @param pSAppUtilViewType
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILVIEWTYPE)
    public void setPSAppUtilViewType(String pSAppUtilViewType){
        this.set(FIELD_PSAPPUTILVIEWTYPE, pSAppUtilViewType);
    }
    
    /**
     * 获取 应用功能视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilViewType(){
        Object objValue = this.get(FIELD_PSAPPUTILVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUtilViewTypeDirty(){
        if(this.contains(FIELD_PSAPPUTILVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能视图类型
     */
    @JsonIgnore
    public void resetPSAppUtilViewType(){
        this.reset(FIELD_PSAPPUTILVIEWTYPE);
    }

    /**
     * 设置 应用功能视图类型
     * <P>
     * 等同 {@link #setPSAppUtilViewType}
     * @param pSAppUtilViewType
     */
    @JsonIgnore
    public PSAppView psapputilviewtype(String pSAppUtilViewType){
        this.setPSAppUtilViewType(pSAppUtilViewType);
        return this;
    }

     /**
     * 设置 应用功能视图类型
     * <P>
     * 等同 {@link #setPSAppUtilViewType}
     * @param pSAppUtilViewType
     */
    @JsonIgnore
    public PSAppView psapputilviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilViewType pSAppUtilViewType){
        if(pSAppUtilViewType == null){
            this.setPSAppUtilViewType(null);
        }
        else{
            this.setPSAppUtilViewType(pSAppUtilViewType.value);
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图标识
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图标识
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图标识
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSAppView psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;代码标识，指定应用视图的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 80，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
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
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSAppView psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppViewName(strName);
    }

    @JsonIgnore
    public PSAppView name(String strName){
        this.setPSAppViewName(strName);
        return this;
    }

    /**
     * <B>PSAPPVIEWTYPE</B>&nbsp;应用视图类型，指定应用视图的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppViewType} 
     */
    public final static String FIELD_PSAPPVIEWTYPE = "psappviewtype";

    /**
     * 设置 应用视图类型，详细说明：{@link #FIELD_PSAPPVIEWTYPE}
     * 
     * @param pSAppViewType
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWTYPE)
    public void setPSAppViewType(String pSAppViewType){
        this.set(FIELD_PSAPPVIEWTYPE, pSAppViewType);
    }
    
    /**
     * 获取 应用视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewType(){
        Object objValue = this.get(FIELD_PSAPPVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewTypeDirty(){
        if(this.contains(FIELD_PSAPPVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图类型
     */
    @JsonIgnore
    public void resetPSAppViewType(){
        this.reset(FIELD_PSAPPVIEWTYPE);
    }

    /**
     * 设置 应用视图类型，详细说明：{@link #FIELD_PSAPPVIEWTYPE}
     * <P>
     * 等同 {@link #setPSAppViewType}
     * @param pSAppViewType
     */
    @JsonIgnore
    public PSAppView psappviewtype(String pSAppViewType){
        this.setPSAppViewType(pSAppViewType);
        return this;
    }

     /**
     * 设置 应用视图类型，详细说明：{@link #FIELD_PSAPPVIEWTYPE}
     * <P>
     * 等同 {@link #setPSAppViewType}
     * @param pSAppViewType
     */
    @JsonIgnore
    public PSAppView psappviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.AppViewType pSAppViewType){
        if(pSAppViewType == null){
            this.setPSAppViewType(null);
        }
        else{
            this.setPSAppViewType(pSAppViewType.value);
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组
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
     * 设置 界面逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSAppView psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSAppView psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组
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
     * 设置 界面逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSAppView psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSAppView psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSAppView psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
            this.setPSDEViewType(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
            this.setPSDEViewType(pSDEViewBase.getPSDEViewBaseType());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSAppView psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDEVIEWTYPE</B>&nbsp;实体视图类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWTYPE = "psdeviewtype";

    /**
     * 设置 实体视图类型
     * 
     * @param pSDEViewType
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWTYPE)
    public void setPSDEViewType(String pSDEViewType){
        this.set(FIELD_PSDEVIEWTYPE, pSDEViewType);
    }
    
    /**
     * 获取 实体视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewType(){
        Object objValue = this.get(FIELD_PSDEVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewTypeDirty(){
        if(this.contains(FIELD_PSDEVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图类型
     */
    @JsonIgnore
    public void resetPSDEViewType(){
        this.reset(FIELD_PSDEVIEWTYPE);
    }

    /**
     * 设置 实体视图类型
     * <P>
     * 等同 {@link #setPSDEViewType}
     * @param pSDEViewType
     */
    @JsonIgnore
    public PSAppView psdeviewtype(String pSDEViewType){
        this.setPSDEViewType(pSDEViewType);
        return this;
    }

    /**
     * <B>PSDYNADEVIEWTEMPLID</B>&nbsp;动态实体模板视图
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNADEVIEWTEMPLID = "psdynadeviewtemplid";

    /**
     * 设置 动态实体模板视图
     * 
     * @param pSDynaDEViewTemplId
     * 
     */
    @JsonProperty(FIELD_PSDYNADEVIEWTEMPLID)
    public void setPSDynaDEViewTemplId(String pSDynaDEViewTemplId){
        this.set(FIELD_PSDYNADEVIEWTEMPLID, pSDynaDEViewTemplId);
    }
    
    /**
     * 获取 动态实体模板视图  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDEViewTemplId(){
        Object objValue = this.get(FIELD_PSDYNADEVIEWTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体模板视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDEViewTemplIdDirty(){
        if(this.contains(FIELD_PSDYNADEVIEWTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体模板视图
     */
    @JsonIgnore
    public void resetPSDynaDEViewTemplId(){
        this.reset(FIELD_PSDYNADEVIEWTEMPLID);
    }

    /**
     * 设置 动态实体模板视图
     * <P>
     * 等同 {@link #setPSDynaDEViewTemplId}
     * @param pSDynaDEViewTemplId
     */
    @JsonIgnore
    public PSAppView psdynadeviewtemplid(String pSDynaDEViewTemplId){
        this.setPSDynaDEViewTemplId(pSDynaDEViewTemplId);
        return this;
    }

    /**
     * <B>PSDYNADEVIEWTEMPLNAME</B>&nbsp;动态实体模板视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNADEVIEWTEMPLID}
     */
    public final static String FIELD_PSDYNADEVIEWTEMPLNAME = "psdynadeviewtemplname";

    /**
     * 设置 动态实体模板视图
     * 
     * @param pSDynaDEViewTemplName
     * 
     */
    @JsonProperty(FIELD_PSDYNADEVIEWTEMPLNAME)
    public void setPSDynaDEViewTemplName(String pSDynaDEViewTemplName){
        this.set(FIELD_PSDYNADEVIEWTEMPLNAME, pSDynaDEViewTemplName);
    }
    
    /**
     * 获取 动态实体模板视图  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDEViewTemplName(){
        Object objValue = this.get(FIELD_PSDYNADEVIEWTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体模板视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDEViewTemplNameDirty(){
        if(this.contains(FIELD_PSDYNADEVIEWTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体模板视图
     */
    @JsonIgnore
    public void resetPSDynaDEViewTemplName(){
        this.reset(FIELD_PSDYNADEVIEWTEMPLNAME);
    }

    /**
     * 设置 动态实体模板视图
     * <P>
     * 等同 {@link #setPSDynaDEViewTemplName}
     * @param pSDynaDEViewTemplName
     */
    @JsonIgnore
    public PSAppView psdynadeviewtemplname(String pSDynaDEViewTemplName){
        this.setPSDynaDEViewTemplName(pSDynaDEViewTemplName);
        return this;
    }

    /**
     * <B>PSDYNADEVIEWTYPE</B>&nbsp;动态实体视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DynaDEViewTypes} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNADEVIEWTEMPLID}
     */
    public final static String FIELD_PSDYNADEVIEWTYPE = "psdynadeviewtype";

    /**
     * 设置 动态实体视图类型
     * 
     * @param pSDynaDEViewType
     * 
     */
    @JsonProperty(FIELD_PSDYNADEVIEWTYPE)
    public void setPSDynaDEViewType(String pSDynaDEViewType){
        this.set(FIELD_PSDYNADEVIEWTYPE, pSDynaDEViewType);
    }
    
    /**
     * 获取 动态实体视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDEViewType(){
        Object objValue = this.get(FIELD_PSDYNADEVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDEViewTypeDirty(){
        if(this.contains(FIELD_PSDYNADEVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体视图类型
     */
    @JsonIgnore
    public void resetPSDynaDEViewType(){
        this.reset(FIELD_PSDYNADEVIEWTYPE);
    }

    /**
     * 设置 动态实体视图类型
     * <P>
     * 等同 {@link #setPSDynaDEViewType}
     * @param pSDynaDEViewType
     */
    @JsonIgnore
    public PSAppView psdynadeviewtype(String pSDynaDEViewType){
        this.setPSDynaDEViewType(pSDynaDEViewType);
        return this;
    }

    /**
     * <B>PSHELPMODULEID</B>&nbsp;视图帮助
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSHELPMODULEID = "pshelpmoduleid";

    /**
     * 设置 视图帮助
     * 
     * @param pSHelpModuleId
     * 
     */
    @JsonProperty(FIELD_PSHELPMODULEID)
    public void setPSHelpModuleId(String pSHelpModuleId){
        this.set(FIELD_PSHELPMODULEID, pSHelpModuleId);
    }
    
    /**
     * 获取 视图帮助  
     * @return
     */
    @JsonIgnore
    public String getPSHelpModuleId(){
        Object objValue = this.get(FIELD_PSHELPMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图帮助 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSHelpModuleIdDirty(){
        if(this.contains(FIELD_PSHELPMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图帮助
     */
    @JsonIgnore
    public void resetPSHelpModuleId(){
        this.reset(FIELD_PSHELPMODULEID);
    }

    /**
     * 设置 视图帮助
     * <P>
     * 等同 {@link #setPSHelpModuleId}
     * @param pSHelpModuleId
     */
    @JsonIgnore
    public PSAppView pshelpmoduleid(String pSHelpModuleId){
        this.setPSHelpModuleId(pSHelpModuleId);
        return this;
    }

    /**
     * <B>PSHELPMODULENAME</B>&nbsp;视图帮助
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSHELPMODULEID}
     */
    public final static String FIELD_PSHELPMODULENAME = "pshelpmodulename";

    /**
     * 设置 视图帮助
     * 
     * @param pSHelpModuleName
     * 
     */
    @JsonProperty(FIELD_PSHELPMODULENAME)
    public void setPSHelpModuleName(String pSHelpModuleName){
        this.set(FIELD_PSHELPMODULENAME, pSHelpModuleName);
    }
    
    /**
     * 获取 视图帮助  
     * @return
     */
    @JsonIgnore
    public String getPSHelpModuleName(){
        Object objValue = this.get(FIELD_PSHELPMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图帮助 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSHelpModuleNameDirty(){
        if(this.contains(FIELD_PSHELPMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图帮助
     */
    @JsonIgnore
    public void resetPSHelpModuleName(){
        this.reset(FIELD_PSHELPMODULENAME);
    }

    /**
     * 设置 视图帮助
     * <P>
     * 等同 {@link #setPSHelpModuleName}
     * @param pSHelpModuleName
     */
    @JsonIgnore
    public PSAppView pshelpmodulename(String pSHelpModuleName){
        this.setPSHelpModuleName(pSHelpModuleName);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端模板
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 前端模板
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSAppView pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSSUBVIEWTYPEID</B>&nbsp;系统视图样式，指定应用视图使用的系统视图样式，用于扩展视图展现
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubViewType} 
     */
    public final static String FIELD_PSSUBVIEWTYPEID = "pssubviewtypeid";

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPEID}
     * 
     * @param pSSubViewTypeId
     * 
     */
    @JsonProperty(FIELD_PSSUBVIEWTYPEID)
    public void setPSSubViewTypeId(String pSSubViewTypeId){
        this.set(FIELD_PSSUBVIEWTYPEID, pSSubViewTypeId);
    }
    
    /**
     * 获取 系统视图样式  
     * @return
     */
    @JsonIgnore
    public String getPSSubViewTypeId(){
        Object objValue = this.get(FIELD_PSSUBVIEWTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubViewTypeIdDirty(){
        if(this.contains(FIELD_PSSUBVIEWTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图样式
     */
    @JsonIgnore
    public void resetPSSubViewTypeId(){
        this.reset(FIELD_PSSUBVIEWTYPEID);
    }

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPEID}
     * <P>
     * 等同 {@link #setPSSubViewTypeId}
     * @param pSSubViewTypeId
     */
    @JsonIgnore
    public PSAppView pssubviewtypeid(String pSSubViewTypeId){
        this.setPSSubViewTypeId(pSSubViewTypeId);
        return this;
    }

    /**
     * 设置 系统视图样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubViewTypeId}
     * @param pSSubViewType 引用对象
     */
    @JsonIgnore
    public PSAppView pssubviewtypeid(PSSubViewType pSSubViewType){
        if(pSSubViewType == null){
            this.setPSSubViewTypeId(null);
            this.setPSSubViewTypeName(null);
        }
        else{
            this.setPSSubViewTypeId(pSSubViewType.getPSSubViewTypeId());
            this.setPSSubViewTypeName(pSSubViewType.getPSSubViewTypeName());
        }
        return this;
    }

    /**
     * <B>PSSUBVIEWTYPENAME</B>&nbsp;系统视图样式，指定应用视图使用的系统视图样式，用于扩展视图展现
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBVIEWTYPEID}
     */
    public final static String FIELD_PSSUBVIEWTYPENAME = "pssubviewtypename";

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPENAME}
     * 
     * @param pSSubViewTypeName
     * 
     */
    @JsonProperty(FIELD_PSSUBVIEWTYPENAME)
    public void setPSSubViewTypeName(String pSSubViewTypeName){
        this.set(FIELD_PSSUBVIEWTYPENAME, pSSubViewTypeName);
    }
    
    /**
     * 获取 系统视图样式  
     * @return
     */
    @JsonIgnore
    public String getPSSubViewTypeName(){
        Object objValue = this.get(FIELD_PSSUBVIEWTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubViewTypeNameDirty(){
        if(this.contains(FIELD_PSSUBVIEWTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图样式
     */
    @JsonIgnore
    public void resetPSSubViewTypeName(){
        this.reset(FIELD_PSSUBVIEWTYPENAME);
    }

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPENAME}
     * <P>
     * 等同 {@link #setPSSubViewTypeName}
     * @param pSSubViewTypeName
     */
    @JsonIgnore
    public PSAppView pssubviewtypename(String pSSubViewTypeName){
        this.setPSSubViewTypeName(pSSubViewTypeName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用视图所属的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppView pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSAppView pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSPFId(null);
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSPFId(pSSysApp.getPSPFId());
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用视图所属的前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
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
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSAppView pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;系统界面样式，指定应用视图的容器界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 系统界面样式  
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
     * 判断 系统界面样式 是否指定值，包括空值
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
     * 重置 系统界面样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 系统界面样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSAppView pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 系统界面样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSAppView pssyscssid(PSSysCss pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定应用视图的容器界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSAppView pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSAppView pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSAppView pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSAppView pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;视图图标，指定应用视图的图标图片资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 视图图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSAppView pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 视图图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSAppView pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;视图图标，指定应用视图的图标图片资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 视图图标  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSAppView pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSAppView pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSAppView pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSAppView pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，应用视图访问用户模式设置为需要拥有指定资源能力时，指定相应的系统统一资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSAppView pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSAppView pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，应用视图访问用户模式设置为需要拥有指定资源能力时，指定相应的系统统一资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSAppView pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;视图布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 视图布局面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 视图布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 视图布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSAppView pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 视图布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSAppView pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;视图布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 视图布局面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 视图布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 视图布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSAppView pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组，指定应用视图使用的视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPID}
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
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPID}
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSAppView psviewmsggroupid(String pSViewMsgGroupId){
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
    public PSAppView psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
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
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组，指定应用视图使用的视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPNAME}
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
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPNAME}
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSAppView psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>SUBCAPPSLANRESID</B>&nbsp;子标题语言资源，指定应用视图的子标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_SUBCAPPSLANRESID = "subcappslanresid";

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBCAPPSLANRESID}
     * 
     * @param subCapPSLanResId
     * 
     */
    @JsonProperty(FIELD_SUBCAPPSLANRESID)
    public void setSubCapPSLanResId(String subCapPSLanResId){
        this.set(FIELD_SUBCAPPSLANRESID, subCapPSLanResId);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubCapPSLanResId(){
        Object objValue = this.get(FIELD_SUBCAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCapPSLanResIdDirty(){
        if(this.contains(FIELD_SUBCAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubCapPSLanResId(){
        this.reset(FIELD_SUBCAPPSLANRESID);
    }

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBCAPPSLANRESID}
     * <P>
     * 等同 {@link #setSubCapPSLanResId}
     * @param subCapPSLanResId
     */
    @JsonIgnore
    public PSAppView subcappslanresid(String subCapPSLanResId){
        this.setSubCapPSLanResId(subCapPSLanResId);
        return this;
    }

    /**
     * 设置 子标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppView subcappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSubCapPSLanResId(null);
            this.setSubCapPSLanResName(null);
        }
        else{
            this.setSubCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SUBCAPPSLANRESNAME</B>&nbsp;子标题语言资源，指定应用视图的子标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBCAPPSLANRESID}
     */
    public final static String FIELD_SUBCAPPSLANRESNAME = "subcappslanresname";

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBCAPPSLANRESNAME}
     * 
     * @param subCapPSLanResName
     * 
     */
    @JsonProperty(FIELD_SUBCAPPSLANRESNAME)
    public void setSubCapPSLanResName(String subCapPSLanResName){
        this.set(FIELD_SUBCAPPSLANRESNAME, subCapPSLanResName);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubCapPSLanResName(){
        Object objValue = this.get(FIELD_SUBCAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCapPSLanResNameDirty(){
        if(this.contains(FIELD_SUBCAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubCapPSLanResName(){
        this.reset(FIELD_SUBCAPPSLANRESNAME);
    }

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBCAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setSubCapPSLanResName}
     * @param subCapPSLanResName
     */
    @JsonIgnore
    public PSAppView subcappslanresname(String subCapPSLanResName){
        this.setSubCapPSLanResName(subCapPSLanResName);
        return this;
    }

    /**
     * <B>SUBCAPTION</B>&nbsp;视图子标题，指定应用视图的子标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SUBCAPTION = "subcaption";

    /**
     * 设置 视图子标题，详细说明：{@link #FIELD_SUBCAPTION}
     * 
     * @param subCaption
     * 
     */
    @JsonProperty(FIELD_SUBCAPTION)
    public void setSubCaption(String subCaption){
        this.set(FIELD_SUBCAPTION, subCaption);
    }
    
    /**
     * 获取 视图子标题  
     * @return
     */
    @JsonIgnore
    public String getSubCaption(){
        Object objValue = this.get(FIELD_SUBCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图子标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCaptionDirty(){
        if(this.contains(FIELD_SUBCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图子标题
     */
    @JsonIgnore
    public void resetSubCaption(){
        this.reset(FIELD_SUBCAPTION);
    }

    /**
     * 设置 视图子标题，详细说明：{@link #FIELD_SUBCAPTION}
     * <P>
     * 等同 {@link #setSubCaption}
     * @param subCaption
     */
    @JsonIgnore
    public PSAppView subcaption(String subCaption){
        this.setSubCaption(subCaption);
        return this;
    }

    /**
     * <B>SYNCCODENAME</B>&nbsp;同步代码标识
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SYNCCODENAME = "synccodename";

    /**
     * 设置 同步代码标识
     * 
     * @param syncCodeName
     * 
     */
    @JsonProperty(FIELD_SYNCCODENAME)
    public void setSyncCodeName(Integer syncCodeName){
        this.set(FIELD_SYNCCODENAME, syncCodeName);
    }
    
    /**
     * 获取 同步代码标识  
     * @return
     */
    @JsonIgnore
    public Integer getSyncCodeName(){
        Object objValue = this.get(FIELD_SYNCCODENAME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 同步代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncCodeNameDirty(){
        if(this.contains(FIELD_SYNCCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步代码标识
     */
    @JsonIgnore
    public void resetSyncCodeName(){
        this.reset(FIELD_SYNCCODENAME);
    }

    /**
     * 设置 同步代码标识
     * <P>
     * 等同 {@link #setSyncCodeName}
     * @param syncCodeName
     */
    @JsonIgnore
    public PSAppView synccodename(Integer syncCodeName){
        this.setSyncCodeName(syncCodeName);
        return this;
    }

     /**
     * 设置 同步代码标识
     * <P>
     * 等同 {@link #setSyncCodeName}
     * @param syncCodeName
     */
    @JsonIgnore
    public PSAppView synccodename(Boolean syncCodeName){
        if(syncCodeName == null){
            this.setSyncCodeName(null);
        }
        else{
            this.setSyncCodeName(syncCodeName?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;视图抬头，指定应用视图的抬头
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 视图抬头，详细说明：{@link #FIELD_TITLE}
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 视图抬头  
     * @return
     */
    @JsonIgnore
    public String getTitle(){
        Object objValue = this.get(FIELD_TITLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图抬头 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitleDirty(){
        if(this.contains(FIELD_TITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图抬头
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 视图抬头，详细说明：{@link #FIELD_TITLE}
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSAppView title(String title){
        this.setTitle(title);
        return this;
    }

    /**
     * <B>TITLEPSLANRESID</B>&nbsp;抬头语言资源，指定应用视图的抬头的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TITLEPSLANRESID = "titlepslanresid";

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * 
     * @param titlePSLanResId
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESID)
    public void setTitlePSLanResId(String titlePSLanResId){
        this.set(FIELD_TITLEPSLANRESID, titlePSLanResId);
    }
    
    /**
     * 获取 抬头语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResId(){
        Object objValue = this.get(FIELD_TITLEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 抬头语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSLanResIdDirty(){
        if(this.contains(FIELD_TITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 抬头语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResId(){
        this.reset(FIELD_TITLEPSLANRESID);
    }

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param titlePSLanResId
     */
    @JsonIgnore
    public PSAppView titlepslanresid(String titlePSLanResId){
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    /**
     * 设置 抬头语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSAppView titlepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        }
        else{
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESNAME</B>&nbsp;抬头语言资源，指定应用视图的抬头的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSLANRESID}
     */
    public final static String FIELD_TITLEPSLANRESNAME = "titlepslanresname";

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * 
     * @param titlePSLanResName
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESNAME)
    public void setTitlePSLanResName(String titlePSLanResName){
        this.set(FIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }
    
    /**
     * 获取 抬头语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResName(){
        Object objValue = this.get(FIELD_TITLEPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 抬头语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTitlePSLanResNameDirty(){
        if(this.contains(FIELD_TITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 抬头语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResName(){
        this.reset(FIELD_TITLEPSLANRESNAME);
    }

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setTitlePSLanResName}
     * @param titlePSLanResName
     */
    @JsonIgnore
    public PSAppView titlepslanresname(String titlePSLanResName){
        this.setTitlePSLanResName(titlePSLanResName);
        return this;
    }

    /**
     * <B>UISTYLE</B>&nbsp;内建界面样式，指定应用视图的内置界面样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUIStyle} 
     */
    public final static String FIELD_UISTYLE = "uistyle";

    /**
     * 设置 内建界面样式，详细说明：{@link #FIELD_UISTYLE}
     * 
     * @param uIStyle
     * 
     */
    @JsonProperty(FIELD_UISTYLE)
    public void setUIStyle(String uIStyle){
        this.set(FIELD_UISTYLE, uIStyle);
    }
    
    /**
     * 获取 内建界面样式  
     * @return
     */
    @JsonIgnore
    public String getUIStyle(){
        Object objValue = this.get(FIELD_UISTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内建界面样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIStyleDirty(){
        if(this.contains(FIELD_UISTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内建界面样式
     */
    @JsonIgnore
    public void resetUIStyle(){
        this.reset(FIELD_UISTYLE);
    }

    /**
     * 设置 内建界面样式，详细说明：{@link #FIELD_UISTYLE}
     * <P>
     * 等同 {@link #setUIStyle}
     * @param uIStyle
     */
    @JsonIgnore
    public PSAppView uistyle(String uIStyle){
        this.setUIStyle(uIStyle);
        return this;
    }

     /**
     * 设置 内建界面样式，详细说明：{@link #FIELD_UISTYLE}
     * <P>
     * 等同 {@link #setUIStyle}
     * @param uIStyle
     */
    @JsonIgnore
    public PSAppView uistyle(net.ibizsys.psmodel.core.util.PSModelEnums.AppUIStyle uIStyle){
        if(uIStyle == null){
            this.setUIStyle(null);
        }
        else{
            this.setUIStyle(uIStyle.value);
        }
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
    public PSAppView updatedate(String updateDate){
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
    public PSAppView updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSAppView userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERREFFLAG</B>&nbsp;用户引用，指定应用视图是否被标记为用户引用，前端应用发布引用视图包括用户定义与系统自动计算，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERREFFLAG = "userrefflag";

    /**
     * 设置 用户引用，详细说明：{@link #FIELD_USERREFFLAG}
     * 
     * @param userRefFlag
     * 
     */
    @JsonProperty(FIELD_USERREFFLAG)
    public void setUserRefFlag(Integer userRefFlag){
        this.set(FIELD_USERREFFLAG, userRefFlag);
    }
    
    /**
     * 获取 用户引用  
     * @return
     */
    @JsonIgnore
    public Integer getUserRefFlag(){
        Object objValue = this.get(FIELD_USERREFFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户引用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserRefFlagDirty(){
        if(this.contains(FIELD_USERREFFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户引用
     */
    @JsonIgnore
    public void resetUserRefFlag(){
        this.reset(FIELD_USERREFFLAG);
    }

    /**
     * 设置 用户引用，详细说明：{@link #FIELD_USERREFFLAG}
     * <P>
     * 等同 {@link #setUserRefFlag}
     * @param userRefFlag
     */
    @JsonIgnore
    public PSAppView userrefflag(Integer userRefFlag){
        this.setUserRefFlag(userRefFlag);
        return this;
    }

     /**
     * 设置 用户引用，详细说明：{@link #FIELD_USERREFFLAG}
     * <P>
     * 等同 {@link #setUserRefFlag}
     * @param userRefFlag
     */
    @JsonIgnore
    public PSAppView userrefflag(Boolean userRefFlag){
        if(userRefFlag == null){
            this.setUserRefFlag(null);
        }
        else{
            this.setUserRefFlag(userRefFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标记
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标记  
     * @return
     */
    @JsonIgnore
    public String getUserTag(){
        Object objValue = this.get(FIELD_USERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTagDirty(){
        if(this.contains(FIELD_USERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标记
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSAppView usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标记2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标记2  
     * @return
     */
    @JsonIgnore
    public String getUserTag2(){
        Object objValue = this.get(FIELD_USERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag2Dirty(){
        if(this.contains(FIELD_USERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标记2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSAppView usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标记3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标记3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标记3  
     * @return
     */
    @JsonIgnore
    public String getUserTag3(){
        Object objValue = this.get(FIELD_USERTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag3Dirty(){
        if(this.contains(FIELD_USERTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标记3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSAppView usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标记4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标记4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标记4  
     * @return
     */
    @JsonIgnore
    public String getUserTag4(){
        Object objValue = this.get(FIELD_USERTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserTag4Dirty(){
        if(this.contains(FIELD_USERTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标记4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标记4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSAppView usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppViewId(strValue);
    }

    @JsonIgnore
    public PSAppView id(String strValue){
        this.setPSAppViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppView){
            PSAppView model = (PSAppView)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
