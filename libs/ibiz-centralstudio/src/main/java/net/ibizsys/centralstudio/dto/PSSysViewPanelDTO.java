package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSVIEWPANEL</B>系统面板 模型传输对象
 * <P>
 * 系统面板部件模型，定义面板部件的界面及处理逻辑。面板部件是支持多种布局模式的容器，多种类型的面板成员提供了灵活的界面组织能力，满足各种界面组装需求。面板部件可应用在视图或是部件的布局
 */
public class PSSysViewPanelDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysViewPanelDTO(){
    }      

    /**
     * <B>BODYONLYFLAG</B>&nbsp;仅布局内容区，指定视图布局面板是否仅布置内容区，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BODYONLYFLAG = "bodyonlyflag";

    /**
     * 设置 仅布局内容区，详细说明：{@link #FIELD_BODYONLYFLAG}
     * 
     * @param bodyOnlyFlag
     * 
     */
    @JsonProperty(FIELD_BODYONLYFLAG)
    public void setBodyOnlyFlag(Integer bodyOnlyFlag){
        this.set(FIELD_BODYONLYFLAG, bodyOnlyFlag);
    }
    
    /**
     * 获取 仅布局内容区  
     * @return
     */
    @JsonIgnore
    public Integer getBodyOnlyFlag(){
        Object objValue = this.get(FIELD_BODYONLYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 仅布局内容区 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBodyOnlyFlagDirty(){
        if(this.contains(FIELD_BODYONLYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 仅布局内容区
     */
    @JsonIgnore
    public void resetBodyOnlyFlag(){
        this.reset(FIELD_BODYONLYFLAG);
    }

    /**
     * 设置 仅布局内容区，详细说明：{@link #FIELD_BODYONLYFLAG}
     * <P>
     * 等同 {@link #setBodyOnlyFlag}
     * @param bodyOnlyFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO bodyonlyflag(Integer bodyOnlyFlag){
        this.setBodyOnlyFlag(bodyOnlyFlag);
        return this;
    }

     /**
     * 设置 仅布局内容区，详细说明：{@link #FIELD_BODYONLYFLAG}
     * <P>
     * 等同 {@link #setBodyOnlyFlag}
     * @param bodyOnlyFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO bodyonlyflag(Boolean bodyOnlyFlag){
        if(bodyOnlyFlag == null){
            this.setBodyOnlyFlag(null);
        }
        else{
            this.setBodyOnlyFlag(bodyOnlyFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定面板的代码标识，需要在所在的模型域（实体、系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysViewPanelDTO codename(String codeName){
        this.setCodeName(codeName);
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
    public PSSysViewPanelDTO createdate(Timestamp createDate){
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
    public PSSysViewPanelDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATANAME</B>&nbsp;数据对象标识，指定从全局或视图会话变量中获取数据对象使用的键值名称，未定义时使用面板代码标识
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_DATANAME = "dataname";

    /**
     * 设置 数据对象标识，详细说明：{@link #FIELD_DATANAME}
     * 
     * @param dataName
     * 
     */
    @JsonProperty(FIELD_DATANAME)
    public void setDataName(String dataName){
        this.set(FIELD_DATANAME, dataName);
    }
    
    /**
     * 获取 数据对象标识  
     * @return
     */
    @JsonIgnore
    public String getDataName(){
        Object objValue = this.get(FIELD_DATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据对象标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataNameDirty(){
        if(this.contains(FIELD_DATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据对象标识
     */
    @JsonIgnore
    public void resetDataName(){
        this.reset(FIELD_DATANAME);
    }

    /**
     * 设置 数据对象标识，详细说明：{@link #FIELD_DATANAME}
     * <P>
     * 等同 {@link #setDataName}
     * @param dataName
     */
    @JsonIgnore
    public PSSysViewPanelDTO dataname(String dataName){
        this.setDataName(dataName);
        return this;
    }

    /**
     * <B>ENABLEPAGEFOOTER</B>&nbsp;支持页面尾部
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPAGEFOOTER = "enablepagefooter";

    /**
     * 设置 支持页面尾部
     * 
     * @param enablePageFooter
     * 
     */
    @JsonProperty(FIELD_ENABLEPAGEFOOTER)
    public void setEnablePageFooter(Integer enablePageFooter){
        this.set(FIELD_ENABLEPAGEFOOTER, enablePageFooter);
    }
    
    /**
     * 获取 支持页面尾部  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePageFooter(){
        Object objValue = this.get(FIELD_ENABLEPAGEFOOTER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持页面尾部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePageFooterDirty(){
        if(this.contains(FIELD_ENABLEPAGEFOOTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持页面尾部
     */
    @JsonIgnore
    public void resetEnablePageFooter(){
        this.reset(FIELD_ENABLEPAGEFOOTER);
    }

    /**
     * 设置 支持页面尾部
     * <P>
     * 等同 {@link #setEnablePageFooter}
     * @param enablePageFooter
     */
    @JsonIgnore
    public PSSysViewPanelDTO enablepagefooter(Integer enablePageFooter){
        this.setEnablePageFooter(enablePageFooter);
        return this;
    }

     /**
     * 设置 支持页面尾部
     * <P>
     * 等同 {@link #setEnablePageFooter}
     * @param enablePageFooter
     */
    @JsonIgnore
    public PSSysViewPanelDTO enablepagefooter(Boolean enablePageFooter){
        if(enablePageFooter == null){
            this.setEnablePageFooter(null);
        }
        else{
            this.setEnablePageFooter(enablePageFooter?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEPAGEHEADER</B>&nbsp;支持页面头部
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEPAGEHEADER = "enablepageheader";

    /**
     * 设置 支持页面头部
     * 
     * @param enablePageHeader
     * 
     */
    @JsonProperty(FIELD_ENABLEPAGEHEADER)
    public void setEnablePageHeader(Integer enablePageHeader){
        this.set(FIELD_ENABLEPAGEHEADER, enablePageHeader);
    }
    
    /**
     * 获取 支持页面头部  
     * @return
     */
    @JsonIgnore
    public Integer getEnablePageHeader(){
        Object objValue = this.get(FIELD_ENABLEPAGEHEADER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持页面头部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnablePageHeaderDirty(){
        if(this.contains(FIELD_ENABLEPAGEHEADER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持页面头部
     */
    @JsonIgnore
    public void resetEnablePageHeader(){
        this.reset(FIELD_ENABLEPAGEHEADER);
    }

    /**
     * 设置 支持页面头部
     * <P>
     * 等同 {@link #setEnablePageHeader}
     * @param enablePageHeader
     */
    @JsonIgnore
    public PSSysViewPanelDTO enablepageheader(Integer enablePageHeader){
        this.setEnablePageHeader(enablePageHeader);
        return this;
    }

     /**
     * 设置 支持页面头部
     * <P>
     * 等同 {@link #setEnablePageHeader}
     * @param enablePageHeader
     */
    @JsonIgnore
    public PSSysViewPanelDTO enablepageheader(Boolean enablePageHeader){
        if(enablePageHeader == null){
            this.setEnablePageHeader(null);
        }
        else{
            this.setEnablePageHeader(enablePageHeader?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GETDATAMODE</B>&nbsp;获取数据模式，指定面板数据的获取模式，未定义时默认为【不获取（使用传入数据）】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PanelGetDataMode} 
     */
    public final static String FIELD_GETDATAMODE = "getdatamode";

    /**
     * 设置 获取数据模式，详细说明：{@link #FIELD_GETDATAMODE}
     * 
     * @param getDataMode
     * 
     */
    @JsonProperty(FIELD_GETDATAMODE)
    public void setGetDataMode(Integer getDataMode){
        this.set(FIELD_GETDATAMODE, getDataMode);
    }
    
    /**
     * 获取 获取数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getGetDataMode(){
        Object objValue = this.get(FIELD_GETDATAMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 获取数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDataModeDirty(){
        if(this.contains(FIELD_GETDATAMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据模式
     */
    @JsonIgnore
    public void resetGetDataMode(){
        this.reset(FIELD_GETDATAMODE);
    }

    /**
     * 设置 获取数据模式，详细说明：{@link #FIELD_GETDATAMODE}
     * <P>
     * 等同 {@link #setGetDataMode}
     * @param getDataMode
     */
    @JsonIgnore
    public PSSysViewPanelDTO getdatamode(Integer getDataMode){
        this.setGetDataMode(getDataMode);
        return this;
    }

     /**
     * 设置 获取数据模式，详细说明：{@link #FIELD_GETDATAMODE}
     * <P>
     * 等同 {@link #setGetDataMode}
     * @param getDataMode
     */
    @JsonIgnore
    public PSSysViewPanelDTO getdatamode(net.ibizsys.model.PSModelEnums.PanelGetDataMode getDataMode){
        if(getDataMode == null){
            this.setGetDataMode(null);
        }
        else{
            this.setGetDataMode(getDataMode.value);
        }
        return this;
    }

    /**
     * <B>GETDATATIMER</B>&nbsp;获取数据间隔，指定面板数据获取的定时间隔，单位为【毫秒】，仅在指定获取数据行为时启用
     */
    public final static String FIELD_GETDATATIMER = "getdatatimer";

    /**
     * 设置 获取数据间隔，详细说明：{@link #FIELD_GETDATATIMER}
     * 
     * @param getDataTimer
     * 
     */
    @JsonProperty(FIELD_GETDATATIMER)
    public void setGetDataTimer(Integer getDataTimer){
        this.set(FIELD_GETDATATIMER, getDataTimer);
    }
    
    /**
     * 获取 获取数据间隔  
     * @return
     */
    @JsonIgnore
    public Integer getGetDataTimer(){
        Object objValue = this.get(FIELD_GETDATATIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 获取数据间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDataTimerDirty(){
        if(this.contains(FIELD_GETDATATIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据间隔
     */
    @JsonIgnore
    public void resetGetDataTimer(){
        this.reset(FIELD_GETDATATIMER);
    }

    /**
     * 设置 获取数据间隔，详细说明：{@link #FIELD_GETDATATIMER}
     * <P>
     * 等同 {@link #setGetDataTimer}
     * @param getDataTimer
     */
    @JsonIgnore
    public PSSysViewPanelDTO getdatatimer(Integer getDataTimer){
        this.setGetDataTimer(getDataTimer);
        return this;
    }

    /**
     * <B>GETPSDEACTIONID</B>&nbsp;获取数据行为，面板数据获取模式为【未传入时获取】或【始终获取】时指定获取数据的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_GETPSDEACTIONID = "getpsdeactionid";

    /**
     * 设置 获取数据行为，详细说明：{@link #FIELD_GETPSDEACTIONID}
     * 
     * @param getPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONID)
    public void setGetPSDEActionId(String getPSDEActionId){
        this.set(FIELD_GETPSDEACTIONID, getPSDEActionId);
    }
    
    /**
     * 获取 获取数据行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionId(){
        Object objValue = this.get(FIELD_GETPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionIdDirty(){
        if(this.contains(FIELD_GETPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据行为
     */
    @JsonIgnore
    public void resetGetPSDEActionId(){
        this.reset(FIELD_GETPSDEACTIONID);
    }

    /**
     * 设置 获取数据行为，详细说明：{@link #FIELD_GETPSDEACTIONID}
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param getPSDEActionId
     */
    @JsonIgnore
    public PSSysViewPanelDTO getpsdeactionid(String getPSDEActionId){
        this.setGetPSDEActionId(getPSDEActionId);
        return this;
    }

    /**
     * 设置 获取数据行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelDTO getpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setGetPSDEActionId(null);
            this.setGetPSDEActionName(null);
        }
        else{
            this.setGetPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETPSDEACTIONNAME</B>&nbsp;获取数据行为，面板数据获取模式为【未传入时获取】或【始终获取】时指定获取数据的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETPSDEACTIONID}
     */
    public final static String FIELD_GETPSDEACTIONNAME = "getpsdeactionname";

    /**
     * 设置 获取数据行为，详细说明：{@link #FIELD_GETPSDEACTIONNAME}
     * 
     * @param getPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETPSDEACTIONNAME)
    public void setGetPSDEActionName(String getPSDEActionName){
        this.set(FIELD_GETPSDEACTIONNAME, getPSDEActionName);
    }
    
    /**
     * 获取 获取数据行为  
     * @return
     */
    @JsonIgnore
    public String getGetPSDEActionName(){
        Object objValue = this.get(FIELD_GETPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetPSDEActionNameDirty(){
        if(this.contains(FIELD_GETPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据行为
     */
    @JsonIgnore
    public void resetGetPSDEActionName(){
        this.reset(FIELD_GETPSDEACTIONNAME);
    }

    /**
     * 设置 获取数据行为，详细说明：{@link #FIELD_GETPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setGetPSDEActionName}
     * @param getPSDEActionName
     */
    @JsonIgnore
    public PSSysViewPanelDTO getpsdeactionname(String getPSDEActionName){
        this.setGetPSDEActionName(getPSDEActionName);
        return this;
    }

    /**
     * <B>LAYOUTMODE</B>&nbsp;布局模式，指定面板部件的布局模式，未定义时使用前端应用使用模板的默认布局模式
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
    public PSSysViewPanelDTO layoutmode(String layoutMode){
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
    public PSSysViewPanelDTO layoutmode(net.ibizsys.model.PSModelEnums.LayoutMode layoutMode){
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
    public PSSysViewPanelDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFLAG</B>&nbsp;移动端面板，指定面板部件是否为移动端专用部件，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MOBFLAG = "mobflag";

    /**
     * 设置 移动端面板，详细说明：{@link #FIELD_MOBFLAG}
     * 
     * @param mobFlag
     * 
     */
    @JsonProperty(FIELD_MOBFLAG)
    public void setMobFlag(Integer mobFlag){
        this.set(FIELD_MOBFLAG, mobFlag);
    }
    
    /**
     * 获取 移动端面板  
     * @return
     */
    @JsonIgnore
    public Integer getMobFlag(){
        Object objValue = this.get(FIELD_MOBFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFlagDirty(){
        if(this.contains(FIELD_MOBFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端面板
     */
    @JsonIgnore
    public void resetMobFlag(){
        this.reset(FIELD_MOBFLAG);
    }

    /**
     * 设置 移动端面板，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO mobflag(Integer mobFlag){
        this.setMobFlag(mobFlag);
        return this;
    }

     /**
     * 设置 移动端面板，详细说明：{@link #FIELD_MOBFLAG}
     * <P>
     * 等同 {@link #setMobFlag}
     * @param mobFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO mobflag(Boolean mobFlag){
        if(mobFlag == null){
            this.setMobFlag(null);
        }
        else{
            this.setMobFlag(mobFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysViewPanelDTO navbarheight(Integer navBarHeight){
        this.setNavBarHeight(navBarHeight);
        return this;
    }

    /**
     * <B>NAVBARPOS</B>&nbsp;导航栏位置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.NavBarPos} 
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
    public PSSysViewPanelDTO navbarpos(String navBarPos){
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
    public PSSysViewPanelDTO navbarpos(net.ibizsys.model.PSModelEnums.NavBarPos navBarPos){
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
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
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
    public PSSysViewPanelDTO navbarpssyscssid(String navBarPSSysCssId){
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
    public PSSysViewPanelDTO navbarpssyscssid(PSSysCssDTO pSSysCss){
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
    public PSSysViewPanelDTO navbarpssyscssname(String navBarPSSysCssName){
        this.setNavBarPSSysCssName(navBarPSSysCssName);
        return this;
    }

    /**
     * <B>NAVBARSTYLE</B>&nbsp;导航栏样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle} 
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
    public PSSysViewPanelDTO navbarstyle(String navBarStyle){
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
    public PSSysViewPanelDTO navbarstyle(net.ibizsys.model.PSModelEnums.CtrlDetailStyle navBarStyle){
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
    public PSSysViewPanelDTO navbarwidth(Integer navBarWidth){
        this.setNavBarWidth(navBarWidth);
        return this;
    }

    /**
     * <B>PAGEFORMAT</B>&nbsp;页面格式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PAGEFORMAT = "pageformat";

    /**
     * 设置 页面格式
     * 
     * @param pageFormat
     * 
     */
    @JsonProperty(FIELD_PAGEFORMAT)
    public void setPageFormat(String pageFormat){
        this.set(FIELD_PAGEFORMAT, pageFormat);
    }
    
    /**
     * 获取 页面格式  
     * @return
     */
    @JsonIgnore
    public String getPageFormat(){
        Object objValue = this.get(FIELD_PAGEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 页面格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageFormatDirty(){
        if(this.contains(FIELD_PAGEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面格式
     */
    @JsonIgnore
    public void resetPageFormat(){
        this.reset(FIELD_PAGEFORMAT);
    }

    /**
     * 设置 页面格式
     * <P>
     * 等同 {@link #setPageFormat}
     * @param pageFormat
     */
    @JsonIgnore
    public PSSysViewPanelDTO pageformat(String pageFormat){
        this.setPageFormat(pageFormat);
        return this;
    }

    /**
     * <B>PAGEHEIGHT</B>&nbsp;页面高度
     */
    public final static String FIELD_PAGEHEIGHT = "pageheight";

    /**
     * 设置 页面高度
     * 
     * @param pageHeight
     * 
     */
    @JsonProperty(FIELD_PAGEHEIGHT)
    public void setPageHeight(BigDecimal pageHeight){
        this.set(FIELD_PAGEHEIGHT, pageHeight);
    }
    
    /**
     * 获取 页面高度  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPageHeight(){
        Object objValue = this.get(FIELD_PAGEHEIGHT);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 页面高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageHeightDirty(){
        if(this.contains(FIELD_PAGEHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面高度
     */
    @JsonIgnore
    public void resetPageHeight(){
        this.reset(FIELD_PAGEHEIGHT);
    }

    /**
     * 设置 页面高度
     * <P>
     * 等同 {@link #setPageHeight}
     * @param pageHeight
     */
    @JsonIgnore
    public PSSysViewPanelDTO pageheight(BigDecimal pageHeight){
        this.setPageHeight(pageHeight);
        return this;
    }

    /**
     * <B>PAGEMARGINBOTTOM</B>&nbsp;页面下方间隔
     */
    public final static String FIELD_PAGEMARGINBOTTOM = "pagemarginbottom";

    /**
     * 设置 页面下方间隔
     * 
     * @param pageMarginBottom
     * 
     */
    @JsonProperty(FIELD_PAGEMARGINBOTTOM)
    public void setPageMarginBottom(BigDecimal pageMarginBottom){
        this.set(FIELD_PAGEMARGINBOTTOM, pageMarginBottom);
    }
    
    /**
     * 获取 页面下方间隔  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPageMarginBottom(){
        Object objValue = this.get(FIELD_PAGEMARGINBOTTOM);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 页面下方间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageMarginBottomDirty(){
        if(this.contains(FIELD_PAGEMARGINBOTTOM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面下方间隔
     */
    @JsonIgnore
    public void resetPageMarginBottom(){
        this.reset(FIELD_PAGEMARGINBOTTOM);
    }

    /**
     * 设置 页面下方间隔
     * <P>
     * 等同 {@link #setPageMarginBottom}
     * @param pageMarginBottom
     */
    @JsonIgnore
    public PSSysViewPanelDTO pagemarginbottom(BigDecimal pageMarginBottom){
        this.setPageMarginBottom(pageMarginBottom);
        return this;
    }

    /**
     * <B>PAGEMARGINLEFT</B>&nbsp;页面左侧间隔
     */
    public final static String FIELD_PAGEMARGINLEFT = "pagemarginleft";

    /**
     * 设置 页面左侧间隔
     * 
     * @param pageMarginLeft
     * 
     */
    @JsonProperty(FIELD_PAGEMARGINLEFT)
    public void setPageMarginLeft(BigDecimal pageMarginLeft){
        this.set(FIELD_PAGEMARGINLEFT, pageMarginLeft);
    }
    
    /**
     * 获取 页面左侧间隔  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPageMarginLeft(){
        Object objValue = this.get(FIELD_PAGEMARGINLEFT);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 页面左侧间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageMarginLeftDirty(){
        if(this.contains(FIELD_PAGEMARGINLEFT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面左侧间隔
     */
    @JsonIgnore
    public void resetPageMarginLeft(){
        this.reset(FIELD_PAGEMARGINLEFT);
    }

    /**
     * 设置 页面左侧间隔
     * <P>
     * 等同 {@link #setPageMarginLeft}
     * @param pageMarginLeft
     */
    @JsonIgnore
    public PSSysViewPanelDTO pagemarginleft(BigDecimal pageMarginLeft){
        this.setPageMarginLeft(pageMarginLeft);
        return this;
    }

    /**
     * <B>PAGEMARGINRIGHT</B>&nbsp;页面右侧间隔
     */
    public final static String FIELD_PAGEMARGINRIGHT = "pagemarginright";

    /**
     * 设置 页面右侧间隔
     * 
     * @param pageMarginRight
     * 
     */
    @JsonProperty(FIELD_PAGEMARGINRIGHT)
    public void setPageMarginRight(BigDecimal pageMarginRight){
        this.set(FIELD_PAGEMARGINRIGHT, pageMarginRight);
    }
    
    /**
     * 获取 页面右侧间隔  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPageMarginRight(){
        Object objValue = this.get(FIELD_PAGEMARGINRIGHT);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 页面右侧间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageMarginRightDirty(){
        if(this.contains(FIELD_PAGEMARGINRIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面右侧间隔
     */
    @JsonIgnore
    public void resetPageMarginRight(){
        this.reset(FIELD_PAGEMARGINRIGHT);
    }

    /**
     * 设置 页面右侧间隔
     * <P>
     * 等同 {@link #setPageMarginRight}
     * @param pageMarginRight
     */
    @JsonIgnore
    public PSSysViewPanelDTO pagemarginright(BigDecimal pageMarginRight){
        this.setPageMarginRight(pageMarginRight);
        return this;
    }

    /**
     * <B>PAGEMARGINTOP</B>&nbsp;页面上方间隔
     */
    public final static String FIELD_PAGEMARGINTOP = "pagemargintop";

    /**
     * 设置 页面上方间隔
     * 
     * @param pageMarginTop
     * 
     */
    @JsonProperty(FIELD_PAGEMARGINTOP)
    public void setPageMarginTop(BigDecimal pageMarginTop){
        this.set(FIELD_PAGEMARGINTOP, pageMarginTop);
    }
    
    /**
     * 获取 页面上方间隔  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPageMarginTop(){
        Object objValue = this.get(FIELD_PAGEMARGINTOP);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 页面上方间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageMarginTopDirty(){
        if(this.contains(FIELD_PAGEMARGINTOP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面上方间隔
     */
    @JsonIgnore
    public void resetPageMarginTop(){
        this.reset(FIELD_PAGEMARGINTOP);
    }

    /**
     * 设置 页面上方间隔
     * <P>
     * 等同 {@link #setPageMarginTop}
     * @param pageMarginTop
     */
    @JsonIgnore
    public PSSysViewPanelDTO pagemargintop(BigDecimal pageMarginTop){
        this.setPageMarginTop(pageMarginTop);
        return this;
    }

    /**
     * <B>PAGEWIDTH</B>&nbsp;页面宽度
     */
    public final static String FIELD_PAGEWIDTH = "pagewidth";

    /**
     * 设置 页面宽度
     * 
     * @param pageWidth
     * 
     */
    @JsonProperty(FIELD_PAGEWIDTH)
    public void setPageWidth(BigDecimal pageWidth){
        this.set(FIELD_PAGEWIDTH, pageWidth);
    }
    
    /**
     * 获取 页面宽度  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPageWidth(){
        Object objValue = this.get(FIELD_PAGEWIDTH);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 页面宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPageWidthDirty(){
        if(this.contains(FIELD_PAGEWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 页面宽度
     */
    @JsonIgnore
    public void resetPageWidth(){
        this.reset(FIELD_PAGEWIDTH);
    }

    /**
     * 设置 页面宽度
     * <P>
     * 等同 {@link #setPageWidth}
     * @param pageWidth
     */
    @JsonIgnore
    public PSSysViewPanelDTO pagewidth(BigDecimal pageWidth){
        this.setPageWidth(pageWidth);
        return this;
    }

    /**
     * <B>PANELHEIGHT</B>&nbsp;面板高度
     */
    public final static String FIELD_PANELHEIGHT = "panelheight";

    /**
     * 设置 面板高度
     * 
     * @param panelHeight
     * 
     */
    @JsonProperty(FIELD_PANELHEIGHT)
    public void setPanelHeight(Integer panelHeight){
        this.set(FIELD_PANELHEIGHT, panelHeight);
    }
    
    /**
     * 获取 面板高度  
     * @return
     */
    @JsonIgnore
    public Integer getPanelHeight(){
        Object objValue = this.get(FIELD_PANELHEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPanelHeightDirty(){
        if(this.contains(FIELD_PANELHEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板高度
     */
    @JsonIgnore
    public void resetPanelHeight(){
        this.reset(FIELD_PANELHEIGHT);
    }

    /**
     * 设置 面板高度
     * <P>
     * 等同 {@link #setPanelHeight}
     * @param panelHeight
     */
    @JsonIgnore
    public PSSysViewPanelDTO panelheight(Integer panelHeight){
        this.setPanelHeight(panelHeight);
        return this;
    }

    /**
     * <B>PANELNAVBAR</B>&nbsp;面板导航栏
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PANELNAVBAR = "panelnavbar";

    /**
     * 设置 面板导航栏
     * 
     * @param panelNavBar
     * 
     */
    @JsonProperty(FIELD_PANELNAVBAR)
    public void setPanelNavBar(Integer panelNavBar){
        this.set(FIELD_PANELNAVBAR, panelNavBar);
    }
    
    /**
     * 获取 面板导航栏  
     * @return
     */
    @JsonIgnore
    public Integer getPanelNavBar(){
        Object objValue = this.get(FIELD_PANELNAVBAR);
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
    public boolean isPanelNavBarDirty(){
        if(this.contains(FIELD_PANELNAVBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板导航栏
     */
    @JsonIgnore
    public void resetPanelNavBar(){
        this.reset(FIELD_PANELNAVBAR);
    }

    /**
     * 设置 面板导航栏
     * <P>
     * 等同 {@link #setPanelNavBar}
     * @param panelNavBar
     */
    @JsonIgnore
    public PSSysViewPanelDTO panelnavbar(Integer panelNavBar){
        this.setPanelNavBar(panelNavBar);
        return this;
    }

     /**
     * 设置 面板导航栏
     * <P>
     * 等同 {@link #setPanelNavBar}
     * @param panelNavBar
     */
    @JsonIgnore
    public PSSysViewPanelDTO panelnavbar(Boolean panelNavBar){
        if(panelNavBar == null){
            this.setPanelNavBar(null);
        }
        else{
            this.setPanelNavBar(panelNavBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PANELSTYLE</B>&nbsp;面板样式，指定面板部件的内置样式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PANELSTYLE = "panelstyle";

    /**
     * 设置 面板样式，详细说明：{@link #FIELD_PANELSTYLE}
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
     * 设置 面板样式，详细说明：{@link #FIELD_PANELSTYLE}
     * <P>
     * 等同 {@link #setPanelStyle}
     * @param panelStyle
     */
    @JsonIgnore
    public PSSysViewPanelDTO panelstyle(String panelStyle){
        this.setPanelStyle(panelStyle);
        return this;
    }

    /**
     * <B>PANELWIDTH</B>&nbsp;面板宽度，指定面板部件的宽度，0为自适应宽度，未定义时为【0】
     */
    public final static String FIELD_PANELWIDTH = "panelwidth";

    /**
     * 设置 面板宽度，详细说明：{@link #FIELD_PANELWIDTH}
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
     * 设置 面板宽度，详细说明：{@link #FIELD_PANELWIDTH}
     * <P>
     * 等同 {@link #setPanelWidth}
     * @param panelWidth
     */
    @JsonIgnore
    public PSSysViewPanelDTO panelwidth(Integer panelWidth){
        this.setPanelWidth(panelWidth);
        return this;
    }

    /**
     * <B>PPI</B>&nbsp;PPI
     */
    public final static String FIELD_PPI = "ppi";

    /**
     * 设置 PPI
     * 
     * @param pPI
     * 
     */
    @JsonProperty(FIELD_PPI)
    public void setPPI(BigDecimal pPI){
        this.set(FIELD_PPI, pPI);
    }
    
    /**
     * 获取 PPI  
     * @return
     */
    @JsonIgnore
    public BigDecimal getPPI(){
        Object objValue = this.get(FIELD_PPI);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 PPI 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPIDirty(){
        if(this.contains(FIELD_PPI)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PPI
     */
    @JsonIgnore
    public void resetPPI(){
        this.reset(FIELD_PPI);
    }

    /**
     * 设置 PPI
     * <P>
     * 等同 {@link #setPPI}
     * @param pPI
     */
    @JsonIgnore
    public PSSysViewPanelDTO ppi(BigDecimal pPI){
        this.setPPI(pPI);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;面板后台处理对象，指定面板部件的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 面板后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 面板后台处理对象  
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
     * 判断 面板后台处理对象 是否指定值，包括空值
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
     * 重置 面板后台处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 面板后台处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSSysViewPanelDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 面板后台处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSSysViewPanelDTO psachandlerid(PSACHandlerDTO pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定面板部件的界面处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 界面处理对象  
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
     * 判断 界面处理对象 是否指定值，包括空值
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
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSSysViewPanelDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定面板部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
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
    public PSSysViewPanelDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSSysViewPanelDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定面板部件默认附加的部件逻辑组对象
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
    public PSSysViewPanelDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定面板部件所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSSysViewPanelDTO psdeid(String pSDEId){
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
    public PSSysViewPanelDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定面板部件所在的实体对象
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
    public PSSysViewPanelDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统面板所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSSysViewPanelDTO psmoduleid(String pSModuleId){
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
    public PSSysViewPanelDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统面板所在的系统模块
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
    public PSSysViewPanelDTO psmodulename(String pSModuleName){
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
    public PSSysViewPanelDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
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
    public PSSysViewPanelDTO pssyscssid(String pSSysCssId){
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
    public PSSysViewPanelDTO pssyscssid(PSSysCssDTO pSSysCss){
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
    public PSSysViewPanelDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件
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
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSSysViewPanelDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysViewPanelDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件
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
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSSysViewPanelDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;系统视图面板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 系统视图面板标识
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 系统视图面板标识  
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
     * 判断 系统视图面板标识 是否指定值，包括空值
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
     * 重置 系统视图面板标识
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 系统视图面板标识
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSSysViewPanelDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;面板名称，指定面板部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 面板名称，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 面板名称  
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
     * 判断 面板名称 是否指定值，包括空值
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
     * 重置 面板名称
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 面板名称，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSSysViewPanelDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysViewPanelName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysViewPanelName(strName);
    }

    @JsonIgnore
    public PSSysViewPanelDTO name(String strName){
        this.setPSSysViewPanelName(strName);
        return this;
    }

    /**
     * <B>PUBLICFLAG</B>&nbsp;公共面板
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBLICFLAG = "publicflag";

    /**
     * 设置 公共面板
     * 
     * @param publicFlag
     * 
     */
    @JsonProperty(FIELD_PUBLICFLAG)
    public void setPublicFlag(Integer publicFlag){
        this.set(FIELD_PUBLICFLAG, publicFlag);
    }
    
    /**
     * 获取 公共面板  
     * @return
     */
    @JsonIgnore
    public Integer getPublicFlag(){
        Object objValue = this.get(FIELD_PUBLICFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 公共面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPublicFlagDirty(){
        if(this.contains(FIELD_PUBLICFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 公共面板
     */
    @JsonIgnore
    public void resetPublicFlag(){
        this.reset(FIELD_PUBLICFLAG);
    }

    /**
     * 设置 公共面板
     * <P>
     * 等同 {@link #setPublicFlag}
     * @param publicFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO publicflag(Integer publicFlag){
        this.setPublicFlag(publicFlag);
        return this;
    }

     /**
     * 设置 公共面板
     * <P>
     * 等同 {@link #setPublicFlag}
     * @param publicFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO publicflag(Boolean publicFlag){
        if(publicFlag == null){
            this.setPublicFlag(null);
        }
        else{
            this.setPublicFlag(publicFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHOWFOOTERFIRSTPAGE</B>&nbsp;首页显示尾部
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWFOOTERFIRSTPAGE = "showfooterfirstpage";

    /**
     * 设置 首页显示尾部
     * 
     * @param showFooterFirstPage
     * 
     */
    @JsonProperty(FIELD_SHOWFOOTERFIRSTPAGE)
    public void setShowFooterFirstPage(Integer showFooterFirstPage){
        this.set(FIELD_SHOWFOOTERFIRSTPAGE, showFooterFirstPage);
    }
    
    /**
     * 获取 首页显示尾部  
     * @return
     */
    @JsonIgnore
    public Integer getShowFooterFirstPage(){
        Object objValue = this.get(FIELD_SHOWFOOTERFIRSTPAGE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 首页显示尾部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowFooterFirstPageDirty(){
        if(this.contains(FIELD_SHOWFOOTERFIRSTPAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 首页显示尾部
     */
    @JsonIgnore
    public void resetShowFooterFirstPage(){
        this.reset(FIELD_SHOWFOOTERFIRSTPAGE);
    }

    /**
     * 设置 首页显示尾部
     * <P>
     * 等同 {@link #setShowFooterFirstPage}
     * @param showFooterFirstPage
     */
    @JsonIgnore
    public PSSysViewPanelDTO showfooterfirstpage(Integer showFooterFirstPage){
        this.setShowFooterFirstPage(showFooterFirstPage);
        return this;
    }

     /**
     * 设置 首页显示尾部
     * <P>
     * 等同 {@link #setShowFooterFirstPage}
     * @param showFooterFirstPage
     */
    @JsonIgnore
    public PSSysViewPanelDTO showfooterfirstpage(Boolean showFooterFirstPage){
        if(showFooterFirstPage == null){
            this.setShowFooterFirstPage(null);
        }
        else{
            this.setShowFooterFirstPage(showFooterFirstPage?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHOWHEADERFIRSTPAGE</B>&nbsp;首页显示头部
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWHEADERFIRSTPAGE = "showheaderfirstpage";

    /**
     * 设置 首页显示头部
     * 
     * @param showHeaderFirstPage
     * 
     */
    @JsonProperty(FIELD_SHOWHEADERFIRSTPAGE)
    public void setShowHeaderFirstPage(Integer showHeaderFirstPage){
        this.set(FIELD_SHOWHEADERFIRSTPAGE, showHeaderFirstPage);
    }
    
    /**
     * 获取 首页显示头部  
     * @return
     */
    @JsonIgnore
    public Integer getShowHeaderFirstPage(){
        Object objValue = this.get(FIELD_SHOWHEADERFIRSTPAGE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 首页显示头部 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowHeaderFirstPageDirty(){
        if(this.contains(FIELD_SHOWHEADERFIRSTPAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 首页显示头部
     */
    @JsonIgnore
    public void resetShowHeaderFirstPage(){
        this.reset(FIELD_SHOWHEADERFIRSTPAGE);
    }

    /**
     * 设置 首页显示头部
     * <P>
     * 等同 {@link #setShowHeaderFirstPage}
     * @param showHeaderFirstPage
     */
    @JsonIgnore
    public PSSysViewPanelDTO showheaderfirstpage(Integer showHeaderFirstPage){
        this.setShowHeaderFirstPage(showHeaderFirstPage);
        return this;
    }

     /**
     * 设置 首页显示头部
     * <P>
     * 等同 {@link #setShowHeaderFirstPage}
     * @param showHeaderFirstPage
     */
    @JsonIgnore
    public PSSysViewPanelDTO showheaderfirstpage(Boolean showHeaderFirstPage){
        if(showHeaderFirstPage == null){
            this.setShowHeaderFirstPage(null);
        }
        else{
            this.setShowHeaderFirstPage(showHeaderFirstPage?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysViewPanelDTO updatedate(Timestamp updateDate){
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
    public PSSysViewPanelDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>VIEWLAYOUTFLAG</B>&nbsp;面板模式，指定面板部件的面板模式，未定义时为【面板部件】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PanelMode} 
     */
    public final static String FIELD_VIEWLAYOUTFLAG = "viewlayoutflag";

    /**
     * 设置 面板模式，详细说明：{@link #FIELD_VIEWLAYOUTFLAG}
     * 
     * @param viewLayoutFlag
     * 
     */
    @JsonProperty(FIELD_VIEWLAYOUTFLAG)
    public void setViewLayoutFlag(Integer viewLayoutFlag){
        this.set(FIELD_VIEWLAYOUTFLAG, viewLayoutFlag);
    }
    
    /**
     * 获取 面板模式  
     * @return
     */
    @JsonIgnore
    public Integer getViewLayoutFlag(){
        Object objValue = this.get(FIELD_VIEWLAYOUTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 面板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewLayoutFlagDirty(){
        if(this.contains(FIELD_VIEWLAYOUTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 面板模式
     */
    @JsonIgnore
    public void resetViewLayoutFlag(){
        this.reset(FIELD_VIEWLAYOUTFLAG);
    }

    /**
     * 设置 面板模式，详细说明：{@link #FIELD_VIEWLAYOUTFLAG}
     * <P>
     * 等同 {@link #setViewLayoutFlag}
     * @param viewLayoutFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO viewlayoutflag(Integer viewLayoutFlag){
        this.setViewLayoutFlag(viewLayoutFlag);
        return this;
    }

     /**
     * 设置 面板模式，详细说明：{@link #FIELD_VIEWLAYOUTFLAG}
     * <P>
     * 等同 {@link #setViewLayoutFlag}
     * @param viewLayoutFlag
     */
    @JsonIgnore
    public PSSysViewPanelDTO viewlayoutflag(net.ibizsys.model.PSModelEnums.PanelMode viewLayoutFlag){
        if(viewLayoutFlag == null){
            this.setViewLayoutFlag(null);
        }
        else{
            this.setViewLayoutFlag(viewLayoutFlag.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysViewPanelId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysViewPanelId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysViewPanelId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysViewPanelId(strValue);
    }

    @JsonIgnore
    public PSSysViewPanelDTO id(String strValue){
        this.setPSSysViewPanelId(strValue);
        return this;
    }


    /**
     *  系统面板逻辑 成员集合
     */
    public final static String FIELD_PSSYSVIEWPANELLOGICS = "pssysviewpanellogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO> pssysviewpanellogics;

    /**
     * 获取 系统面板逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO> getPSSysViewPanelLogics(){
        return this.pssysviewpanellogics;
    }

    /**
     * 设置 系统面板逻辑 成员集合  
     * @param pssysviewpanellogics
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELLOGICS)
    public void setPSSysViewPanelLogics(java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO> pssysviewpanellogics){
        this.pssysviewpanellogics = pssysviewpanellogics;
    }

    /**
     * 获取 系统面板逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO> getPSSysViewPanelLogicsIf(){
        if(this.pssysviewpanellogics == null){
            this.pssysviewpanellogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO>();          
        }
        return this.pssysviewpanellogics;
    }


    /**
     *  系统面板数据模型 成员集合
     */
    public final static String FIELD_PSSYSVIEWPANELMODELS = "pssysviewpanelmodels";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelModelDTO> pssysviewpanelmodels;

    /**
     * 获取 系统面板数据模型 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELMODELS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelModelDTO> getPSSysViewPanelModels(){
        return this.pssysviewpanelmodels;
    }

    /**
     * 设置 系统面板数据模型 成员集合  
     * @param pssysviewpanelmodels
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELMODELS)
    public void setPSSysViewPanelModels(java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelModelDTO> pssysviewpanelmodels){
        this.pssysviewpanelmodels = pssysviewpanelmodels;
    }

    /**
     * 获取 系统面板数据模型 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelModelDTO> getPSSysViewPanelModelsIf(){
        if(this.pssysviewpanelmodels == null){
            this.pssysviewpanelmodels = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysViewPanelModelDTO>();          
        }
        return this.pssysviewpanelmodels;
    }


    /**
     *  面板界面引擎 成员集合
     */
    public final static String FIELD_PSPANELENGINES = "pspanelengines";

    private java.util.List<net.ibizsys.centralstudio.dto.PSPanelEngineDTO> pspanelengines;

    /**
     * 获取 面板界面引擎 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSPANELENGINES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSPanelEngineDTO> getPSPanelEngines(){
        return this.pspanelengines;
    }

    /**
     * 设置 面板界面引擎 成员集合  
     * @param pspanelengines
     */
    @JsonProperty(FIELD_PSPANELENGINES)
    public void setPSPanelEngines(java.util.List<net.ibizsys.centralstudio.dto.PSPanelEngineDTO> pspanelengines){
        this.pspanelengines = pspanelengines;
    }

    /**
     * 获取 面板界面引擎 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSPanelEngineDTO> getPSPanelEnginesIf(){
        if(this.pspanelengines == null){
            this.pspanelengines = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSPanelEngineDTO>();          
        }
        return this.pspanelengines;
    }


    /**
     *  系统面板成员 成员集合
     */
    public final static String FIELD_PSSYSVIEWPANELITEMS = "pssysviewpanelitems";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO> pssysviewpanelitems;

    /**
     * 获取 系统面板成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO> getPSSysViewPanelItems(){
        return this.pssysviewpanelitems;
    }

    /**
     * 设置 系统面板成员 成员集合  
     * @param pssysviewpanelitems
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELITEMS)
    public void setPSSysViewPanelItems(java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO> pssysviewpanelitems){
        this.pssysviewpanelitems = pssysviewpanelitems;
    }

    /**
     * 获取 系统面板成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO> getPSSysViewPanelItemsIf(){
        if(this.pssysviewpanelitems == null){
            this.pssysviewpanelitems = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO>();          
        }
        return this.pssysviewpanelitems;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysViewPanelDTO){
            PSSysViewPanelDTO dto = (PSSysViewPanelDTO)iEntity;
            dto.setPSSysViewPanelLogics(this.getPSSysViewPanelLogics());
            dto.setPSSysViewPanelModels(this.getPSSysViewPanelModels());
            dto.setPSPanelEngines(this.getPSPanelEngines());
            dto.setPSSysViewPanelItems(this.getPSSysViewPanelItems());
        }
        super.copyTo(iEntity);
    }
}
