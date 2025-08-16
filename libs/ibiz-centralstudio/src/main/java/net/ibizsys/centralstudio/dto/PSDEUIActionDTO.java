package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEUIACTION</B>实体界面行为 模型传输对象
 * <P>
 * 界面行为模型，定义界面行为的操作目标、操作方式及附加逻辑等信息
 */
public class PSDEUIActionDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEUIActionDTO(){
    }      

    /**
     * <B>ACTIONLEVEL</B>&nbsp;行为级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionLevel} 
     */
    public final static String FIELD_ACTIONLEVEL = "actionlevel";

    /**
     * 设置 行为级别
     * 
     * @param actionLevel
     * 
     */
    @JsonProperty(FIELD_ACTIONLEVEL)
    public void setActionLevel(Integer actionLevel){
        this.set(FIELD_ACTIONLEVEL, actionLevel);
    }
    
    /**
     * 获取 行为级别  
     * @return
     */
    @JsonIgnore
    public Integer getActionLevel(){
        Object objValue = this.get(FIELD_ACTIONLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionLevelDirty(){
        if(this.contains(FIELD_ACTIONLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为级别
     */
    @JsonIgnore
    public void resetActionLevel(){
        this.reset(FIELD_ACTIONLEVEL);
    }

    /**
     * 设置 行为级别
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSDEUIActionDTO actionlevel(Integer actionLevel){
        this.setActionLevel(actionLevel);
        return this;
    }

     /**
     * 设置 行为级别
     * <P>
     * 等同 {@link #setActionLevel}
     * @param actionLevel
     */
    @JsonIgnore
    public PSDEUIActionDTO actionlevel(net.ibizsys.model.PSModelEnums.UIActionLevel actionLevel){
        if(actionLevel == null){
            this.setActionLevel(null);
        }
        else{
            this.setActionLevel(actionLevel.value);
        }
        return this;
    }

    /**
     * <B>ACTIONTARGET</B>&nbsp;数据目标，指定界面行为的操作目标
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionTarget} 
     */
    public final static String FIELD_ACTIONTARGET = "actiontarget";

    /**
     * 设置 数据目标，详细说明：{@link #FIELD_ACTIONTARGET}
     * 
     * @param actionTarget
     * 
     */
    @JsonProperty(FIELD_ACTIONTARGET)
    public void setActionTarget(String actionTarget){
        this.set(FIELD_ACTIONTARGET, actionTarget);
    }
    
    /**
     * 获取 数据目标  
     * @return
     */
    @JsonIgnore
    public String getActionTarget(){
        Object objValue = this.get(FIELD_ACTIONTARGET);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据目标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTargetDirty(){
        if(this.contains(FIELD_ACTIONTARGET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据目标
     */
    @JsonIgnore
    public void resetActionTarget(){
        this.reset(FIELD_ACTIONTARGET);
    }

    /**
     * 设置 数据目标，详细说明：{@link #FIELD_ACTIONTARGET}
     * <P>
     * 等同 {@link #setActionTarget}
     * @param actionTarget
     */
    @JsonIgnore
    public PSDEUIActionDTO actiontarget(String actionTarget){
        this.setActionTarget(actionTarget);
        return this;
    }

     /**
     * 设置 数据目标，详细说明：{@link #FIELD_ACTIONTARGET}
     * <P>
     * 等同 {@link #setActionTarget}
     * @param actionTarget
     */
    @JsonIgnore
    public PSDEUIActionDTO actiontarget(net.ibizsys.model.PSModelEnums.UIActionTarget actionTarget){
        if(actionTarget == null){
            this.setActionTarget(null);
        }
        else{
            this.setActionTarget(actionTarget.value);
        }
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示，指定后台界面行为在发送请求到接受反馈这段时间是否显示【处理中】等加载信息，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示，详细说明：{@link #FIELD_BUSYINDICATOR}
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
     * 设置 显示处理提示，详细说明：{@link #FIELD_BUSYINDICATOR}
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEUIActionDTO busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示，详细说明：{@link #FIELD_BUSYINDICATOR}
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDEUIActionDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
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
    public PSDEUIActionDTO cappslanresid(String capPSLanResId){
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
    public PSDEUIActionDTO cappslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定标题的多语言资源
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
    public PSDEUIActionDTO cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定界面行为的标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 标题  
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
     * 判断 标题 是否指定值，包括空值
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
     * 重置 标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSDEUIActionDTO caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CLOSEEDITVIEW</B>&nbsp;关闭编辑或弹出视图，指定界面行为执行完毕后是否关闭当前编辑或弹出视图，未定义时为【不关闭】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionCloseViewMode} 
     */
    public final static String FIELD_CLOSEEDITVIEW = "closeeditview";

    /**
     * 设置 关闭编辑或弹出视图，详细说明：{@link #FIELD_CLOSEEDITVIEW}
     * 
     * @param closeEditView
     * 
     */
    @JsonProperty(FIELD_CLOSEEDITVIEW)
    public void setCloseEditView(Integer closeEditView){
        this.set(FIELD_CLOSEEDITVIEW, closeEditView);
    }
    
    /**
     * 获取 关闭编辑或弹出视图  
     * @return
     */
    @JsonIgnore
    public Integer getCloseEditView(){
        Object objValue = this.get(FIELD_CLOSEEDITVIEW);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 关闭编辑或弹出视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCloseEditViewDirty(){
        if(this.contains(FIELD_CLOSEEDITVIEW)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关闭编辑或弹出视图
     */
    @JsonIgnore
    public void resetCloseEditView(){
        this.reset(FIELD_CLOSEEDITVIEW);
    }

    /**
     * 设置 关闭编辑或弹出视图，详细说明：{@link #FIELD_CLOSEEDITVIEW}
     * <P>
     * 等同 {@link #setCloseEditView}
     * @param closeEditView
     */
    @JsonIgnore
    public PSDEUIActionDTO closeeditview(Integer closeEditView){
        this.setCloseEditView(closeEditView);
        return this;
    }

     /**
     * 设置 关闭编辑或弹出视图，详细说明：{@link #FIELD_CLOSEEDITVIEW}
     * <P>
     * 等同 {@link #setCloseEditView}
     * @param closeEditView
     */
    @JsonIgnore
    public PSDEUIActionDTO closeeditview(net.ibizsys.model.PSModelEnums.UIActionCloseViewMode closeEditView){
        if(closeEditView == null){
            this.setCloseEditView(null);
        }
        else{
            this.setCloseEditView(closeEditView.value);
        }
        return this;
    }

    /**
     * <B>CMPSLANRESID</B>&nbsp;确认消息语言资源，指定确定信息的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_CMPSLANRESID = "cmpslanresid";

    /**
     * 设置 确认消息语言资源，详细说明：{@link #FIELD_CMPSLANRESID}
     * 
     * @param cMPSLanResId
     * 
     */
    @JsonProperty(FIELD_CMPSLANRESID)
    public void setCMPSLanResId(String cMPSLanResId){
        this.set(FIELD_CMPSLANRESID, cMPSLanResId);
    }
    
    /**
     * 获取 确认消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getCMPSLanResId(){
        Object objValue = this.get(FIELD_CMPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 确认消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCMPSLanResIdDirty(){
        if(this.contains(FIELD_CMPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 确认消息语言资源
     */
    @JsonIgnore
    public void resetCMPSLanResId(){
        this.reset(FIELD_CMPSLANRESID);
    }

    /**
     * 设置 确认消息语言资源，详细说明：{@link #FIELD_CMPSLANRESID}
     * <P>
     * 等同 {@link #setCMPSLanResId}
     * @param cMPSLanResId
     */
    @JsonIgnore
    public PSDEUIActionDTO cmpslanresid(String cMPSLanResId){
        this.setCMPSLanResId(cMPSLanResId);
        return this;
    }

    /**
     * 设置 确认消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCMPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO cmpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCMPSLanResId(null);
            this.setCMPSLanResName(null);
        }
        else{
            this.setCMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CMPSLANRESNAME</B>&nbsp;确认消息语言资源，指定确定信息的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CMPSLANRESID}
     */
    public final static String FIELD_CMPSLANRESNAME = "cmpslanresname";

    /**
     * 设置 确认消息语言资源，详细说明：{@link #FIELD_CMPSLANRESNAME}
     * 
     * @param cMPSLanResName
     * 
     */
    @JsonProperty(FIELD_CMPSLANRESNAME)
    public void setCMPSLanResName(String cMPSLanResName){
        this.set(FIELD_CMPSLANRESNAME, cMPSLanResName);
    }
    
    /**
     * 获取 确认消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getCMPSLanResName(){
        Object objValue = this.get(FIELD_CMPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 确认消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCMPSLanResNameDirty(){
        if(this.contains(FIELD_CMPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 确认消息语言资源
     */
    @JsonIgnore
    public void resetCMPSLanResName(){
        this.reset(FIELD_CMPSLANRESNAME);
    }

    /**
     * 设置 确认消息语言资源，详细说明：{@link #FIELD_CMPSLANRESNAME}
     * <P>
     * 等同 {@link #setCMPSLanResName}
     * @param cMPSLanResName
     */
    @JsonIgnore
    public PSDEUIActionDTO cmpslanresname(String cMPSLanResName){
        this.setCMPSLanResName(cMPSLanResName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定界面行为的代码标识，需要在所在的模型域（实体、工作流、系统模块或系统）中具有唯一性
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
    public PSDEUIActionDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONFIRMINFO</B>&nbsp;自定义确认信息，启用提示用户确认后，指定用户确认信息，未定义时使用默认提示信息
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_CONFIRMINFO = "confirminfo";

    /**
     * 设置 自定义确认信息，详细说明：{@link #FIELD_CONFIRMINFO}
     * 
     * @param confirmInfo
     * 
     */
    @JsonProperty(FIELD_CONFIRMINFO)
    public void setConfirmInfo(String confirmInfo){
        this.set(FIELD_CONFIRMINFO, confirmInfo);
    }
    
    /**
     * 获取 自定义确认信息  
     * @return
     */
    @JsonIgnore
    public String getConfirmInfo(){
        Object objValue = this.get(FIELD_CONFIRMINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义确认信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConfirmInfoDirty(){
        if(this.contains(FIELD_CONFIRMINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义确认信息
     */
    @JsonIgnore
    public void resetConfirmInfo(){
        this.reset(FIELD_CONFIRMINFO);
    }

    /**
     * 设置 自定义确认信息，详细说明：{@link #FIELD_CONFIRMINFO}
     * <P>
     * 等同 {@link #setConfirmInfo}
     * @param confirmInfo
     */
    @JsonIgnore
    public PSDEUIActionDTO confirminfo(String confirmInfo){
        this.setConfirmInfo(confirmInfo);
        return this;
    }

    /**
     * <B>COUNTERID</B>&nbsp;计数器标识，指定界面行为的计数标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_COUNTERID = "counterid";

    /**
     * 设置 计数器标识，详细说明：{@link #FIELD_COUNTERID}
     * 
     * @param counterId
     * 
     */
    @JsonProperty(FIELD_COUNTERID)
    public void setCounterId(String counterId){
        this.set(FIELD_COUNTERID, counterId);
    }
    
    /**
     * 获取 计数器标识  
     * @return
     */
    @JsonIgnore
    public String getCounterId(){
        Object objValue = this.get(FIELD_COUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计数器标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCounterIdDirty(){
        if(this.contains(FIELD_COUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计数器标识
     */
    @JsonIgnore
    public void resetCounterId(){
        this.reset(FIELD_COUNTERID);
    }

    /**
     * 设置 计数器标识，详细说明：{@link #FIELD_COUNTERID}
     * <P>
     * 等同 {@link #setCounterId}
     * @param counterId
     */
    @JsonIgnore
    public PSDEUIActionDTO counterid(String counterId){
        this.setCounterId(counterId);
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
    public PSDEUIActionDTO createdate(Timestamp createDate){
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
    public PSDEUIActionDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEUIActionDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DATAITEM</B>&nbsp;数据项名称，指定从数据对象中获取数据项的属性名称、未定义时为【srfkey】
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_DATAITEM = "dataitem";

    /**
     * 设置 数据项名称，详细说明：{@link #FIELD_DATAITEM}
     * 
     * @param dataItem
     * 
     */
    @JsonProperty(FIELD_DATAITEM)
    public void setDataItem(String dataItem){
        this.set(FIELD_DATAITEM, dataItem);
    }
    
    /**
     * 获取 数据项名称  
     * @return
     */
    @JsonIgnore
    public String getDataItem(){
        Object objValue = this.get(FIELD_DATAITEM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataItemDirty(){
        if(this.contains(FIELD_DATAITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据项名称
     */
    @JsonIgnore
    public void resetDataItem(){
        this.reset(FIELD_DATAITEM);
    }

    /**
     * 设置 数据项名称，详细说明：{@link #FIELD_DATAITEM}
     * <P>
     * 等同 {@link #setDataItem}
     * @param dataItem
     */
    @JsonIgnore
    public PSDEUIActionDTO dataitem(String dataItem){
        this.setDataItem(dataItem);
        return this;
    }

    /**
     * <B>ENABLERTMODEL</B>&nbsp;支持运行时模型，设置是否启用运行时模型，启用运行时模型将支持运行环境的动态配置系统进行动态组装，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLERTMODEL = "enablertmodel";

    /**
     * 设置 支持运行时模型，详细说明：{@link #FIELD_ENABLERTMODEL}
     * 
     * @param enableRTModel
     * 
     */
    @JsonProperty(FIELD_ENABLERTMODEL)
    public void setEnableRTModel(Integer enableRTModel){
        this.set(FIELD_ENABLERTMODEL, enableRTModel);
    }
    
    /**
     * 获取 支持运行时模型  
     * @return
     */
    @JsonIgnore
    public Integer getEnableRTModel(){
        Object objValue = this.get(FIELD_ENABLERTMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持运行时模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableRTModelDirty(){
        if(this.contains(FIELD_ENABLERTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持运行时模型
     */
    @JsonIgnore
    public void resetEnableRTModel(){
        this.reset(FIELD_ENABLERTMODEL);
    }

    /**
     * 设置 支持运行时模型，详细说明：{@link #FIELD_ENABLERTMODEL}
     * <P>
     * 等同 {@link #setEnableRTModel}
     * @param enableRTModel
     */
    @JsonIgnore
    public PSDEUIActionDTO enablertmodel(Integer enableRTModel){
        this.setEnableRTModel(enableRTModel);
        return this;
    }

     /**
     * 设置 支持运行时模型，详细说明：{@link #FIELD_ENABLERTMODEL}
     * <P>
     * 等同 {@link #setEnableRTModel}
     * @param enableRTModel
     */
    @JsonIgnore
    public PSDEUIActionDTO enablertmodel(Boolean enableRTModel){
        if(enableRTModel == null){
            this.setEnableRTModel(null);
        }
        else{
            this.setEnableRTModel(enableRTModel?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用视图操作控制，指定是否启用视图操作控制，启用控制需指定界面行为关联的【视图操作】，当所在视图支持相应的操作时界面行为才启用。未定义为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用视图操作控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableViewActions(){
        Object objValue = this.get(FIELD_ENABLEVIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图操作控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableViewActionsDirty(){
        if(this.contains(FIELD_ENABLEVIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图操作控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEUIActionDTO enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEUIActionDTO enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体界面行为的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_EXTENDMODE = "extendmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * 
     * @param extendMode
     * 
     */
    @JsonProperty(FIELD_EXTENDMODE)
    public void setExtendMode(Integer extendMode){
        this.set(FIELD_EXTENDMODE, extendMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendMode(){
        Object objValue = this.get(FIELD_EXTENDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendModeDirty(){
        if(this.contains(FIELD_EXTENDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetExtendMode(){
        this.reset(FIELD_EXTENDMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEUIActionDTO extendmode(Integer extendMode){
        this.setExtendMode(extendMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEUIActionDTO extendmode(net.ibizsys.model.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>FRONTPROTYPE</B>&nbsp;前台处理模式，指定前台操作的处理模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionFrontType} 
     */
    public final static String FIELD_FRONTPROTYPE = "frontprotype";

    /**
     * 设置 前台处理模式，详细说明：{@link #FIELD_FRONTPROTYPE}
     * 
     * @param frontProType
     * 
     */
    @JsonProperty(FIELD_FRONTPROTYPE)
    public void setFrontProType(String frontProType){
        this.set(FIELD_FRONTPROTYPE, frontProType);
    }
    
    /**
     * 获取 前台处理模式  
     * @return
     */
    @JsonIgnore
    public String getFrontProType(){
        Object objValue = this.get(FIELD_FRONTPROTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前台处理模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFrontProTypeDirty(){
        if(this.contains(FIELD_FRONTPROTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前台处理模式
     */
    @JsonIgnore
    public void resetFrontProType(){
        this.reset(FIELD_FRONTPROTYPE);
    }

    /**
     * 设置 前台处理模式，详细说明：{@link #FIELD_FRONTPROTYPE}
     * <P>
     * 等同 {@link #setFrontProType}
     * @param frontProType
     */
    @JsonIgnore
    public PSDEUIActionDTO frontprotype(String frontProType){
        this.setFrontProType(frontProType);
        return this;
    }

     /**
     * 设置 前台处理模式，详细说明：{@link #FIELD_FRONTPROTYPE}
     * <P>
     * 等同 {@link #setFrontProType}
     * @param frontProType
     */
    @JsonIgnore
    public PSDEUIActionDTO frontprotype(net.ibizsys.model.PSModelEnums.UIActionFrontType frontProType){
        if(frontProType == null){
            this.setFrontProType(null);
        }
        else{
            this.setFrontProType(frontProType.value);
        }
        return this;
    }

    /**
     * <B>GLOBALFLAG</B>&nbsp;支持全局使用，指定界面行为是否全局使用，默认情况下界面行为只能在当前实体的界面中使用，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GLOBALFLAG = "globalflag";

    /**
     * 设置 支持全局使用，详细说明：{@link #FIELD_GLOBALFLAG}
     * 
     * @param globalFlag
     * 
     */
    @JsonProperty(FIELD_GLOBALFLAG)
    public void setGlobalFlag(Integer globalFlag){
        this.set(FIELD_GLOBALFLAG, globalFlag);
    }
    
    /**
     * 获取 支持全局使用  
     * @return
     */
    @JsonIgnore
    public Integer getGlobalFlag(){
        Object objValue = this.get(FIELD_GLOBALFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持全局使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGlobalFlagDirty(){
        if(this.contains(FIELD_GLOBALFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持全局使用
     */
    @JsonIgnore
    public void resetGlobalFlag(){
        this.reset(FIELD_GLOBALFLAG);
    }

    /**
     * 设置 支持全局使用，详细说明：{@link #FIELD_GLOBALFLAG}
     * <P>
     * 等同 {@link #setGlobalFlag}
     * @param globalFlag
     */
    @JsonIgnore
    public PSDEUIActionDTO globalflag(Integer globalFlag){
        this.setGlobalFlag(globalFlag);
        return this;
    }

     /**
     * 设置 支持全局使用，详细说明：{@link #FIELD_GLOBALFLAG}
     * <P>
     * 等同 {@link #setGlobalFlag}
     * @param globalFlag
     */
    @JsonIgnore
    public PSDEUIActionDTO globalflag(Boolean globalFlag){
        if(globalFlag == null){
            this.setGlobalFlag(null);
        }
        else{
            this.setGlobalFlag(globalFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HTMLPAGEURL</B>&nbsp;网页地址，前台处理模式为【打开网页】时指定网页路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_HTMLPAGEURL = "htmlpageurl";

    /**
     * 设置 网页地址，详细说明：{@link #FIELD_HTMLPAGEURL}
     * 
     * @param htmlPageUrl
     * 
     */
    @JsonProperty(FIELD_HTMLPAGEURL)
    public void setHtmlPageUrl(String htmlPageUrl){
        this.set(FIELD_HTMLPAGEURL, htmlPageUrl);
    }
    
    /**
     * 获取 网页地址  
     * @return
     */
    @JsonIgnore
    public String getHtmlPageUrl(){
        Object objValue = this.get(FIELD_HTMLPAGEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 网页地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHtmlPageUrlDirty(){
        if(this.contains(FIELD_HTMLPAGEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 网页地址
     */
    @JsonIgnore
    public void resetHtmlPageUrl(){
        this.reset(FIELD_HTMLPAGEURL);
    }

    /**
     * 设置 网页地址，详细说明：{@link #FIELD_HTMLPAGEURL}
     * <P>
     * 等同 {@link #setHtmlPageUrl}
     * @param htmlPageUrl
     */
    @JsonIgnore
    public PSDEUIActionDTO htmlpageurl(String htmlPageUrl){
        this.setHtmlPageUrl(htmlPageUrl);
        return this;
    }

    /**
     * <B>ITEMOBJ</B>&nbsp;处理对象，指定自定义处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_ITEMOBJ = "itemobj";

    /**
     * 设置 处理对象，详细说明：{@link #FIELD_ITEMOBJ}
     * 
     * @param itemObj
     * 
     */
    @JsonProperty(FIELD_ITEMOBJ)
    public void setItemObj(String itemObj){
        this.set(FIELD_ITEMOBJ, itemObj);
    }
    
    /**
     * 获取 处理对象  
     * @return
     */
    @JsonIgnore
    public String getItemObj(){
        Object objValue = this.get(FIELD_ITEMOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemObjDirty(){
        if(this.contains(FIELD_ITEMOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理对象
     */
    @JsonIgnore
    public void resetItemObj(){
        this.reset(FIELD_ITEMOBJ);
    }

    /**
     * 设置 处理对象，详细说明：{@link #FIELD_ITEMOBJ}
     * <P>
     * 等同 {@link #setItemObj}
     * @param itemObj
     */
    @JsonIgnore
    public PSDEUIActionDTO itemobj(String itemObj){
        this.setItemObj(itemObj);
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
    public PSDEUIActionDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBPSDEVIEWID</B>&nbsp;移动端打开视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_MOBPSDEVIEWID = "mobpsdeviewid";

    /**
     * 设置 移动端打开视图
     * 
     * @param mobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWID)
    public void setMobPSDEViewId(String mobPSDEViewId){
        this.set(FIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }
    
    /**
     * 获取 移动端打开视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewId(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端打开视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端打开视图
     */
    @JsonIgnore
    public void resetMobPSDEViewId(){
        this.reset(FIELD_MOBPSDEVIEWID);
    }

    /**
     * 设置 移动端打开视图
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param mobPSDEViewId
     */
    @JsonIgnore
    public PSDEUIActionDTO mobpsdeviewid(String mobPSDEViewId){
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端打开视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO mobpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
        }
        else{
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEVIEWNAME</B>&nbsp;移动端打开视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";

    /**
     * 设置 移动端打开视图
     * 
     * @param mobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWNAME)
    public void setMobPSDEViewName(String mobPSDEViewName){
        this.set(FIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }
    
    /**
     * 获取 移动端打开视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewName(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端打开视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端打开视图
     */
    @JsonIgnore
    public void resetMobPSDEViewName(){
        this.reset(FIELD_MOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端打开视图
     * <P>
     * 等同 {@link #setMobPSDEViewName}
     * @param mobPSDEViewName
     */
    @JsonIgnore
    public PSDEUIActionDTO mobpsdeviewname(String mobPSDEViewName){
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    /**
     * <B>NEXTPSDEUIACTIONID</B>&nbsp;后续界面行为，指定当前界面行为执行结束调用的后续界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO} 
     */
    public final static String FIELD_NEXTPSDEUIACTIONID = "nextpsdeuiactionid";

    /**
     * 设置 后续界面行为，详细说明：{@link #FIELD_NEXTPSDEUIACTIONID}
     * 
     * @param nextPSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_NEXTPSDEUIACTIONID)
    public void setNextPSDEUIActionId(String nextPSDEUIActionId){
        this.set(FIELD_NEXTPSDEUIACTIONID, nextPSDEUIActionId);
    }
    
    /**
     * 获取 后续界面行为  
     * @return
     */
    @JsonIgnore
    public String getNextPSDEUIActionId(){
        Object objValue = this.get(FIELD_NEXTPSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后续界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSDEUIActionIdDirty(){
        if(this.contains(FIELD_NEXTPSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后续界面行为
     */
    @JsonIgnore
    public void resetNextPSDEUIActionId(){
        this.reset(FIELD_NEXTPSDEUIACTIONID);
    }

    /**
     * 设置 后续界面行为，详细说明：{@link #FIELD_NEXTPSDEUIACTIONID}
     * <P>
     * 等同 {@link #setNextPSDEUIActionId}
     * @param nextPSDEUIActionId
     */
    @JsonIgnore
    public PSDEUIActionDTO nextpsdeuiactionid(String nextPSDEUIActionId){
        this.setNextPSDEUIActionId(nextPSDEUIActionId);
        return this;
    }

    /**
     * 设置 后续界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNextPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO nextpsdeuiactionid(PSDEUIActionDTO pSDEUIAction){
        if(pSDEUIAction == null){
            this.setNextPSDEUIActionId(null);
            this.setNextPSDEUIActionName(null);
        }
        else{
            this.setNextPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setNextPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>NEXTPSDEUIACTIONNAME</B>&nbsp;后续界面行为，指定当前界面行为执行结束调用的后续界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NEXTPSDEUIACTIONID}
     */
    public final static String FIELD_NEXTPSDEUIACTIONNAME = "nextpsdeuiactionname";

    /**
     * 设置 后续界面行为，详细说明：{@link #FIELD_NEXTPSDEUIACTIONNAME}
     * 
     * @param nextPSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_NEXTPSDEUIACTIONNAME)
    public void setNextPSDEUIActionName(String nextPSDEUIActionName){
        this.set(FIELD_NEXTPSDEUIACTIONNAME, nextPSDEUIActionName);
    }
    
    /**
     * 获取 后续界面行为  
     * @return
     */
    @JsonIgnore
    public String getNextPSDEUIActionName(){
        Object objValue = this.get(FIELD_NEXTPSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后续界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSDEUIActionNameDirty(){
        if(this.contains(FIELD_NEXTPSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后续界面行为
     */
    @JsonIgnore
    public void resetNextPSDEUIActionName(){
        this.reset(FIELD_NEXTPSDEUIACTIONNAME);
    }

    /**
     * 设置 后续界面行为，详细说明：{@link #FIELD_NEXTPSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setNextPSDEUIActionName}
     * @param nextPSDEUIActionName
     */
    @JsonIgnore
    public PSDEUIActionDTO nextpsdeuiactionname(String nextPSDEUIActionName){
        this.setNextPSDEUIActionName(nextPSDEUIActionName);
        return this;
    }

    /**
     * <B>NO2PSDEDATAEXPID</B>&nbsp;实体数据导出
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataExpDTO} 
     */
    public final static String FIELD_NO2PSDEDATAEXPID = "no2psdedataexpid";

    /**
     * 设置 实体数据导出
     * 
     * @param no2PSDEDataExpId
     * 
     */
    @JsonProperty(FIELD_NO2PSDEDATAEXPID)
    public void setNo2PSDEDataExpId(String no2PSDEDataExpId){
        this.set(FIELD_NO2PSDEDATAEXPID, no2PSDEDataExpId);
    }
    
    /**
     * 获取 实体数据导出  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEDataExpId(){
        Object objValue = this.get(FIELD_NO2PSDEDATAEXPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEDataExpIdDirty(){
        if(this.contains(FIELD_NO2PSDEDATAEXPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导出
     */
    @JsonIgnore
    public void resetNo2PSDEDataExpId(){
        this.reset(FIELD_NO2PSDEDATAEXPID);
    }

    /**
     * 设置 实体数据导出
     * <P>
     * 等同 {@link #setNo2PSDEDataExpId}
     * @param no2PSDEDataExpId
     */
    @JsonIgnore
    public PSDEUIActionDTO no2psdedataexpid(String no2PSDEDataExpId){
        this.setNo2PSDEDataExpId(no2PSDEDataExpId);
        return this;
    }

    /**
     * 设置 实体数据导出，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2PSDEDataExpId}
     * @param pSDEDataExp 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO no2psdedataexpid(PSDEDataExpDTO pSDEDataExp){
        if(pSDEDataExp == null){
            this.setNo2PSDEDataExpId(null);
            this.setNo2PSDEDataExpName(null);
        }
        else{
            this.setNo2PSDEDataExpId(pSDEDataExp.getPSDEDataExpId());
            this.setNo2PSDEDataExpName(pSDEDataExp.getPSDEDataExpName());
        }
        return this;
    }

    /**
     * <B>NO2PSDEDATAEXPNAME</B>&nbsp;实体数据导出
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2PSDEDATAEXPID}
     */
    public final static String FIELD_NO2PSDEDATAEXPNAME = "no2psdedataexpname";

    /**
     * 设置 实体数据导出
     * 
     * @param no2PSDEDataExpName
     * 
     */
    @JsonProperty(FIELD_NO2PSDEDATAEXPNAME)
    public void setNo2PSDEDataExpName(String no2PSDEDataExpName){
        this.set(FIELD_NO2PSDEDATAEXPNAME, no2PSDEDataExpName);
    }
    
    /**
     * 获取 实体数据导出  
     * @return
     */
    @JsonIgnore
    public String getNo2PSDEDataExpName(){
        Object objValue = this.get(FIELD_NO2PSDEDATAEXPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2PSDEDataExpNameDirty(){
        if(this.contains(FIELD_NO2PSDEDATAEXPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导出
     */
    @JsonIgnore
    public void resetNo2PSDEDataExpName(){
        this.reset(FIELD_NO2PSDEDATAEXPNAME);
    }

    /**
     * 设置 实体数据导出
     * <P>
     * 等同 {@link #setNo2PSDEDataExpName}
     * @param no2PSDEDataExpName
     */
    @JsonIgnore
    public PSDEUIActionDTO no2psdedataexpname(String no2PSDEDataExpName){
        this.setNo2PSDEDataExpName(no2PSDEDataExpName);
        return this;
    }

    /**
     * <B>NOPRIVDM</B>&nbsp;无权限显示模式，指定界面行为在无权限时的显示模式，未定义时使用所在视图设置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BtnNoPrivDisplayMode} 
     */
    public final static String FIELD_NOPRIVDM = "noprivdm";

    /**
     * 设置 无权限显示模式，详细说明：{@link #FIELD_NOPRIVDM}
     * 
     * @param noPrivDM
     * 
     */
    @JsonProperty(FIELD_NOPRIVDM)
    public void setNoPrivDM(Integer noPrivDM){
        this.set(FIELD_NOPRIVDM, noPrivDM);
    }
    
    /**
     * 获取 无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNoPrivDM(){
        Object objValue = this.get(FIELD_NOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoPrivDMDirty(){
        if(this.contains(FIELD_NOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无权限显示模式
     */
    @JsonIgnore
    public void resetNoPrivDM(){
        this.reset(FIELD_NOPRIVDM);
    }

    /**
     * 设置 无权限显示模式，详细说明：{@link #FIELD_NOPRIVDM}
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDEUIActionDTO noprivdm(Integer noPrivDM){
        this.setNoPrivDM(noPrivDM);
        return this;
    }

     /**
     * 设置 无权限显示模式，详细说明：{@link #FIELD_NOPRIVDM}
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDEUIActionDTO noprivdm(net.ibizsys.model.PSModelEnums.BtnNoPrivDisplayMode noPrivDM){
        if(noPrivDM == null){
            this.setNoPrivDM(null);
        }
        else{
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    /**
     * <B>PARAMITEM</B>&nbsp;参数项名称，指定将界面数据项放入界面行为调用参数的属性名称、未定义时为【srfkeys】
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PARAMITEM = "paramitem";

    /**
     * 设置 参数项名称，详细说明：{@link #FIELD_PARAMITEM}
     * 
     * @param paramItem
     * 
     */
    @JsonProperty(FIELD_PARAMITEM)
    public void setParamItem(String paramItem){
        this.set(FIELD_PARAMITEM, paramItem);
    }
    
    /**
     * 获取 参数项名称  
     * @return
     */
    @JsonIgnore
    public String getParamItem(){
        Object objValue = this.get(FIELD_PARAMITEM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamItemDirty(){
        if(this.contains(FIELD_PARAMITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数项名称
     */
    @JsonIgnore
    public void resetParamItem(){
        this.reset(FIELD_PARAMITEM);
    }

    /**
     * 设置 参数项名称，详细说明：{@link #FIELD_PARAMITEM}
     * <P>
     * 等同 {@link #setParamItem}
     * @param paramItem
     */
    @JsonIgnore
    public PSDEUIActionDTO paramitem(String paramItem){
        this.setParamItem(paramItem);
        return this;
    }

    /**
     * <B>PDTVIEWFLAG</B>&nbsp;使用预置视图，指定界面行为打开的视图类型是否为系统预置视图，如设置为是需进一步指定具体的预置视图。未定义为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PDTVIEWFLAG = "pdtviewflag";

    /**
     * 设置 使用预置视图，详细说明：{@link #FIELD_PDTVIEWFLAG}
     * 
     * @param pDTViewFlag
     * 
     */
    @JsonProperty(FIELD_PDTVIEWFLAG)
    public void setPDTViewFlag(Integer pDTViewFlag){
        this.set(FIELD_PDTVIEWFLAG, pDTViewFlag);
    }
    
    /**
     * 获取 使用预置视图  
     * @return
     */
    @JsonIgnore
    public Integer getPDTViewFlag(){
        Object objValue = this.get(FIELD_PDTVIEWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 使用预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPDTViewFlagDirty(){
        if(this.contains(FIELD_PDTVIEWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 使用预置视图
     */
    @JsonIgnore
    public void resetPDTViewFlag(){
        this.reset(FIELD_PDTVIEWFLAG);
    }

    /**
     * 设置 使用预置视图，详细说明：{@link #FIELD_PDTVIEWFLAG}
     * <P>
     * 等同 {@link #setPDTViewFlag}
     * @param pDTViewFlag
     */
    @JsonIgnore
    public PSDEUIActionDTO pdtviewflag(Integer pDTViewFlag){
        this.setPDTViewFlag(pDTViewFlag);
        return this;
    }

     /**
     * 设置 使用预置视图，详细说明：{@link #FIELD_PDTVIEWFLAG}
     * <P>
     * 等同 {@link #setPDTViewFlag}
     * @param pDTViewFlag
     */
    @JsonIgnore
    public PSDEUIActionDTO pdtviewflag(Boolean pDTViewFlag){
        if(pDTViewFlag == null){
            this.setPDTViewFlag(null);
        }
        else{
            this.setPDTViewFlag(pDTViewFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSDEACMODEID</B>&nbsp;实体自填模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO} 
     */
    public final static String FIELD_PSDEACMODEID = "psdeacmodeid";

    /**
     * 设置 实体自填模式
     * 
     * @param pSDEACModeId
     * 
     */
    @JsonProperty(FIELD_PSDEACMODEID)
    public void setPSDEACModeId(String pSDEACModeId){
        this.set(FIELD_PSDEACMODEID, pSDEACModeId);
    }
    
    /**
     * 获取 实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeId(){
        Object objValue = this.get(FIELD_PSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeIdDirty(){
        if(this.contains(FIELD_PSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体自填模式
     */
    @JsonIgnore
    public void resetPSDEACModeId(){
        this.reset(FIELD_PSDEACMODEID);
    }

    /**
     * 设置 实体自填模式
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACModeId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeacmodeid(String pSDEACModeId){
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    /**
     * 设置 实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeacmodeid(PSDEACModeDTO pSDEACMode){
        if(pSDEACMode == null){
            this.setPSDEACModeId(null);
            this.setPSDEACModeName(null);
        }
        else{
            this.setPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>PSDEACMODENAME</B>&nbsp;实体自填模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACMODEID}
     */
    public final static String FIELD_PSDEACMODENAME = "psdeacmodename";

    /**
     * 设置 实体自填模式
     * 
     * @param pSDEACModeName
     * 
     */
    @JsonProperty(FIELD_PSDEACMODENAME)
    public void setPSDEACModeName(String pSDEACModeName){
        this.set(FIELD_PSDEACMODENAME, pSDEACModeName);
    }
    
    /**
     * 获取 实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeName(){
        Object objValue = this.get(FIELD_PSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeNameDirty(){
        if(this.contains(FIELD_PSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体自填模式
     */
    @JsonIgnore
    public void resetPSDEACModeName(){
        this.reset(FIELD_PSDEACMODENAME);
    }

    /**
     * 设置 实体自填模式
     * <P>
     * 等同 {@link #setPSDEACModeName}
     * @param pSDEACModeName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeacmodename(String pSDEACModeName){
        this.setPSDEACModeName(pSDEACModeName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，界面行为类型为【后台调用】，指定调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionId(){
        Object objValue = this.get(FIELD_PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionIdDirty(){
        if(this.contains(FIELD_PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，界面行为类型为【后台调用】，指定调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionName(){
        Object objValue = this.get(FIELD_PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionNameDirty(){
        if(this.contains(FIELD_PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEDATAEXPID</B>&nbsp;PSDEDATAEXPID
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSDEDATAEXPID = "psdedataexpid";

    /**
     * 设置 PSDEDATAEXPID
     * 
     * @param pSDEDataExpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAEXPID)
    public void setPSDEDataExpId(String pSDEDataExpId){
        this.set(FIELD_PSDEDATAEXPID, pSDEDataExpId);
    }
    
    /**
     * 获取 PSDEDATAEXPID  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataExpId(){
        Object objValue = this.get(FIELD_PSDEDATAEXPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSDEDATAEXPID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataExpIdDirty(){
        if(this.contains(FIELD_PSDEDATAEXPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSDEDATAEXPID
     */
    @JsonIgnore
    public void resetPSDEDataExpId(){
        this.reset(FIELD_PSDEDATAEXPID);
    }

    /**
     * 设置 PSDEDATAEXPID
     * <P>
     * 等同 {@link #setPSDEDataExpId}
     * @param pSDEDataExpId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdedataexpid(String pSDEDataExpId){
        this.setPSDEDataExpId(pSDEDataExpId);
        return this;
    }

    /**
     * <B>PSDEDATAIMPID</B>&nbsp;实体数据导入
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO} 
     */
    public final static String FIELD_PSDEDATAIMPID = "psdedataimpid";

    /**
     * 设置 实体数据导入
     * 
     * @param pSDEDataImpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPID)
    public void setPSDEDataImpId(String pSDEDataImpId){
        this.set(FIELD_PSDEDATAIMPID, pSDEDataImpId);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpId(){
        Object objValue = this.get(FIELD_PSDEDATAIMPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpIdDirty(){
        if(this.contains(FIELD_PSDEDATAIMPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpId(){
        this.reset(FIELD_PSDEDATAIMPID);
    }

    /**
     * 设置 实体数据导入
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImpId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdedataimpid(String pSDEDataImpId){
        this.setPSDEDataImpId(pSDEDataImpId);
        return this;
    }

    /**
     * 设置 实体数据导入，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataImpId}
     * @param pSDEDataImp 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdedataimpid(PSDEDataImpDTO pSDEDataImp){
        if(pSDEDataImp == null){
            this.setPSDEDataImpId(null);
            this.setPSDEDataImpName(null);
        }
        else{
            this.setPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAIMPNAME</B>&nbsp;实体数据导入
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAIMPID}
     */
    public final static String FIELD_PSDEDATAIMPNAME = "psdedataimpname";

    /**
     * 设置 实体数据导入
     * 
     * @param pSDEDataImpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAIMPNAME)
    public void setPSDEDataImpName(String pSDEDataImpName){
        this.set(FIELD_PSDEDATAIMPNAME, pSDEDataImpName);
    }
    
    /**
     * 获取 实体数据导入  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataImpName(){
        Object objValue = this.get(FIELD_PSDEDATAIMPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataImpNameDirty(){
        if(this.contains(FIELD_PSDEDATAIMPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导入
     */
    @JsonIgnore
    public void resetPSDEDataImpName(){
        this.reset(FIELD_PSDEDATAIMPNAME);
    }

    /**
     * 设置 实体数据导入
     * <P>
     * 等同 {@link #setPSDEDataImpName}
     * @param pSDEDataImpName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdedataimpname(String pSDEDataImpName){
        this.setPSDEDataImpName(pSDEDataImpName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeid(String pSDEId){
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
    public PSDEUIActionDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;实体操作标识，指定界面行为权限判断的实体操作标识，
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_PSDEOPPRIVID = "psdeopprivid";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * 
     * @param pSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVID)
    public void setPSDEOPPrivId(String pSDEOPPrivId){
        this.set(FIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivId(){
        this.reset(FIELD_PSDEOPPRIVID);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPrivId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeopprivid(String pSDEOPPrivId){
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    /**
     * 设置 实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        }
        else{
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>PSDEOPPRIVNAME</B>&nbsp;实体操作标识，指定界面行为权限判断的实体操作标识，
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEOPPRIVID}
     */
    public final static String FIELD_PSDEOPPRIVNAME = "psdeopprivname";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * 
     * @param pSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVNAME)
    public void setPSDEOPPrivName(String pSDEOPPrivName){
        this.set(FIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivName(){
        this.reset(FIELD_PSDEOPPRIVNAME);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setPSDEOPPrivName}
     * @param pSDEOPPrivName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    /**
     * <B>PSDEPRINTID</B>&nbsp;实体打印
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO} 
     */
    public final static String FIELD_PSDEPRINTID = "psdeprintid";

    /**
     * 设置 实体打印
     * 
     * @param pSDEPrintId
     * 
     */
    @JsonProperty(FIELD_PSDEPRINTID)
    public void setPSDEPrintId(String pSDEPrintId){
        this.set(FIELD_PSDEPRINTID, pSDEPrintId);
    }
    
    /**
     * 获取 实体打印  
     * @return
     */
    @JsonIgnore
    public String getPSDEPrintId(){
        Object objValue = this.get(FIELD_PSDEPRINTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPrintIdDirty(){
        if(this.contains(FIELD_PSDEPRINTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印
     */
    @JsonIgnore
    public void resetPSDEPrintId(){
        this.reset(FIELD_PSDEPRINTID);
    }

    /**
     * 设置 实体打印
     * <P>
     * 等同 {@link #setPSDEPrintId}
     * @param pSDEPrintId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeprintid(String pSDEPrintId){
        this.setPSDEPrintId(pSDEPrintId);
        return this;
    }

    /**
     * 设置 实体打印，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEPrintId}
     * @param pSDEPrint 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeprintid(PSDEPrintDTO pSDEPrint){
        if(pSDEPrint == null){
            this.setPSDEPrintId(null);
            this.setPSDEPrintName(null);
        }
        else{
            this.setPSDEPrintId(pSDEPrint.getPSDEPrintId());
            this.setPSDEPrintName(pSDEPrint.getPSDEPrintName());
        }
        return this;
    }

    /**
     * <B>PSDEPRINTNAME</B>&nbsp;实体打印
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEPRINTID}
     */
    public final static String FIELD_PSDEPRINTNAME = "psdeprintname";

    /**
     * 设置 实体打印
     * 
     * @param pSDEPrintName
     * 
     */
    @JsonProperty(FIELD_PSDEPRINTNAME)
    public void setPSDEPrintName(String pSDEPrintName){
        this.set(FIELD_PSDEPRINTNAME, pSDEPrintName);
    }
    
    /**
     * 获取 实体打印  
     * @return
     */
    @JsonIgnore
    public String getPSDEPrintName(){
        Object objValue = this.get(FIELD_PSDEPRINTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPrintNameDirty(){
        if(this.contains(FIELD_PSDEPRINTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印
     */
    @JsonIgnore
    public void resetPSDEPrintName(){
        this.reset(FIELD_PSDEPRINTNAME);
    }

    /**
     * 设置 实体打印
     * <P>
     * 等同 {@link #setPSDEPrintName}
     * @param pSDEPrintName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeprintname(String pSDEPrintName){
        this.setPSDEPrintName(pSDEPrintName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;界面行为标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 界面行为标识
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 界面行为标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为标识
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 界面行为标识
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;界面行为名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 界面行为名称
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 界面行为名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为名称
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 界面行为名称
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEUIActionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEUIActionName(strName);
    }

    @JsonIgnore
    public PSDEUIActionDTO name(String strName){
        this.setPSDEUIActionName(strName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;打开视图，指定前台调用打开的实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 打开视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 打开视图  
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
     * 判断 打开视图 是否指定值，包括空值
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
     * 重置 打开视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 打开视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 打开视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeviewbaseid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;打开视图，指定前台调用打开的实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 打开视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 打开视图  
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
     * 判断 打开视图 是否指定值，包括空值
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
     * 重置 打开视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 打开视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICID</B>&nbsp;实体界面逻辑，当前触发界面逻辑类型为【实体界面逻辑】时指定当前实体的实体界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_PSDEVIEWLOGICID = "psdeviewlogicid";

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDEVIEWLOGICID}
     * 
     * @param pSDEViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICID)
    public void setPSDEViewLogicId(String pSDEViewLogicId){
        this.set(FIELD_PSDEVIEWLOGICID, pSDEViewLogicId);
    }
    
    /**
     * 获取 实体界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicId(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewLogicIdDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDEViewLogicId(){
        this.reset(FIELD_PSDEVIEWLOGICID);
    }

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDEVIEWLOGICID}
     * <P>
     * 等同 {@link #setPSDEViewLogicId}
     * @param pSDEViewLogicId
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeviewlogicid(String pSDEViewLogicId){
        this.setPSDEViewLogicId(pSDEViewLogicId);
        return this;
    }

    /**
     * 设置 实体界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewLogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeviewlogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setPSDEViewLogicId(null);
            this.setPSDEViewLogicName(null);
        }
        else{
            this.setPSDEViewLogicId(pSDELogic.getPSDELogicId());
            this.setPSDEViewLogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWLOGICNAME</B>&nbsp;实体界面逻辑，当前触发界面逻辑类型为【实体界面逻辑】时指定当前实体的实体界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWLOGICID}
     */
    public final static String FIELD_PSDEVIEWLOGICNAME = "psdeviewlogicname";

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDEVIEWLOGICNAME}
     * 
     * @param pSDEViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICNAME)
    public void setPSDEViewLogicName(String pSDEViewLogicName){
        this.set(FIELD_PSDEVIEWLOGICNAME, pSDEViewLogicName);
    }
    
    /**
     * 获取 实体界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewLogicName(){
        Object objValue = this.get(FIELD_PSDEVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewLogicNameDirty(){
        if(this.contains(FIELD_PSDEVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面逻辑
     */
    @JsonIgnore
    public void resetPSDEViewLogicName(){
        this.reset(FIELD_PSDEVIEWLOGICNAME);
    }

    /**
     * 设置 实体界面逻辑，详细说明：{@link #FIELD_PSDEVIEWLOGICNAME}
     * <P>
     * 等同 {@link #setPSDEViewLogicName}
     * @param pSDEViewLogicName
     */
    @JsonIgnore
    public PSDEUIActionDTO psdeviewlogicname(String pSDEViewLogicName){
        this.setPSDEViewLogicName(pSDEViewLogicName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定实体界面行为所在的系统模块
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
    public PSDEUIActionDTO psmoduleid(String pSModuleId){
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
    public PSDEUIActionDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定实体界面行为所在的系统模块
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
    public PSDEUIActionDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定界面行为指定的系统计数器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCounterDTO} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 系统计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pssyscounterid(PSSysCounterDTO pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定界面行为指定的系统计数器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定界面行为默认的图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysimageid(PSSysImageDTO pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定界面行为默认的图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPDTVIEWID</B>&nbsp;系统预置视图，界面行为打开的视图类型为预置视图时，需指定具体的系统预置视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPDTViewDTO} 
     */
    public final static String FIELD_PSSYSPDTVIEWID = "pssyspdtviewid";

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWID}
     * 
     * @param pSSysPDTViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSPDTVIEWID)
    public void setPSSysPDTViewId(String pSSysPDTViewId){
        this.set(FIELD_PSSYSPDTVIEWID, pSSysPDTViewId);
    }
    
    /**
     * 获取 系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getPSSysPDTViewId(){
        Object objValue = this.get(FIELD_PSSYSPDTVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPDTViewIdDirty(){
        if(this.contains(FIELD_PSSYSPDTVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置视图
     */
    @JsonIgnore
    public void resetPSSysPDTViewId(){
        this.reset(FIELD_PSSYSPDTVIEWID);
    }

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWID}
     * <P>
     * 等同 {@link #setPSSysPDTViewId}
     * @param pSSysPDTViewId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssyspdtviewid(String pSSysPDTViewId){
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    /**
     * 设置 系统预置视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPDTViewId}
     * @param pSSysPDTView 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pssyspdtviewid(PSSysPDTViewDTO pSSysPDTView){
        if(pSSysPDTView == null){
            this.setPSSysPDTViewId(null);
            this.setPSSysPDTViewName(null);
        }
        else{
            this.setPSSysPDTViewId(pSSysPDTView.getPSSysPDTViewId());
            this.setPSSysPDTViewName(pSSysPDTView.getPSSysPDTViewName());
        }
        return this;
    }

    /**
     * <B>PSSYSPDTVIEWNAME</B>&nbsp;系统预置视图，界面行为打开的视图类型为预置视图时，需指定具体的系统预置视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPDTVIEWID}
     */
    public final static String FIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWNAME}
     * 
     * @param pSSysPDTViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSPDTVIEWNAME)
    public void setPSSysPDTViewName(String pSSysPDTViewName){
        this.set(FIELD_PSSYSPDTVIEWNAME, pSSysPDTViewName);
    }
    
    /**
     * 获取 系统预置视图  
     * @return
     */
    @JsonIgnore
    public String getPSSysPDTViewName(){
        Object objValue = this.get(FIELD_PSSYSPDTVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPDTViewNameDirty(){
        if(this.contains(FIELD_PSSYSPDTVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置视图
     */
    @JsonIgnore
    public void resetPSSysPDTViewName(){
        this.reset(FIELD_PSSYSPDTVIEWNAME);
    }

    /**
     * 设置 系统预置视图，详细说明：{@link #FIELD_PSSYSPDTVIEWNAME}
     * <P>
     * 等同 {@link #setPSSysPDTViewName}
     * @param pSSysPDTViewName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssyspdtviewname(String pSSysPDTViewName){
        this.setPSSysPDTViewName(pSSysPDTViewName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定界面行为使用的前端模板扩展插件，使用插件类型【应用实体界面行为】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
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
    public PSDEUIActionDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEUIActionDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定界面行为使用的前端模板扩展插件，使用插件类型【应用实体界面行为】
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
    public PSDEUIActionDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统需求项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统需求项  
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
     * 判断 系统需求项 是否指定值，包括空值
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
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统需求项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统需求项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统需求项
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统需求项  
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
     * 判断 系统需求项 是否指定值，包括空值
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
     * 重置 系统需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统需求项
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUIACTIONID</B>&nbsp;预定义界面行为，界面行为类型为【系统预定义】时指定预定义界面行为
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUIACTIONID = "pssysuiactionid";

    /**
     * 设置 预定义界面行为，详细说明：{@link #FIELD_PSSYSUIACTIONID}
     * 
     * @param pSSysUIActionId
     * 
     */
    @JsonProperty(FIELD_PSSYSUIACTIONID)
    public void setPSSysUIActionId(String pSSysUIActionId){
        this.set(FIELD_PSSYSUIACTIONID, pSSysUIActionId);
    }
    
    /**
     * 获取 预定义界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSSysUIActionId(){
        Object objValue = this.get(FIELD_PSSYSUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUIActionIdDirty(){
        if(this.contains(FIELD_PSSYSUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义界面行为
     */
    @JsonIgnore
    public void resetPSSysUIActionId(){
        this.reset(FIELD_PSSYSUIACTIONID);
    }

    /**
     * 设置 预定义界面行为，详细说明：{@link #FIELD_PSSYSUIACTIONID}
     * <P>
     * 等同 {@link #setPSSysUIActionId}
     * @param pSSysUIActionId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysuiactionid(String pSSysUIActionId){
        this.setPSSysUIActionId(pSSysUIActionId);
        return this;
    }

    /**
     * <B>PSSYSUIACTIONNAME</B>&nbsp;预定义界面行为，界面行为类型为【系统预定义】时指定预定义界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUIACTIONID}
     */
    public final static String FIELD_PSSYSUIACTIONNAME = "pssysuiactionname";

    /**
     * 设置 预定义界面行为，详细说明：{@link #FIELD_PSSYSUIACTIONNAME}
     * 
     * @param pSSysUIActionName
     * 
     */
    @JsonProperty(FIELD_PSSYSUIACTIONNAME)
    public void setPSSysUIActionName(String pSSysUIActionName){
        this.set(FIELD_PSSYSUIACTIONNAME, pSSysUIActionName);
    }
    
    /**
     * 获取 预定义界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSSysUIActionName(){
        Object objValue = this.get(FIELD_PSSYSUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUIActionNameDirty(){
        if(this.contains(FIELD_PSSYSUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义界面行为
     */
    @JsonIgnore
    public void resetPSSysUIActionName(){
        this.reset(FIELD_PSSYSUIACTIONNAME);
    }

    /**
     * 设置 预定义界面行为，详细说明：{@link #FIELD_PSSYSUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSSysUIActionName}
     * @param pSSysUIActionName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysuiactionname(String pSSysUIActionName){
        this.setPSSysUIActionName(pSSysUIActionName);
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICID</B>&nbsp;系统视图逻辑，当前触发界面逻辑类型为【系统界面逻辑】时指定当前系统的预置界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewLogicDTO} 
     */
    public final static String FIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";

    /**
     * 设置 系统视图逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * 
     * @param pSSysViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICID)
    public void setPSSysViewLogicId(String pSSysViewLogicId){
        this.set(FIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }
    
    /**
     * 获取 系统视图逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicId(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicId(){
        this.reset(FIELD_PSSYSVIEWLOGICID);
    }

    /**
     * 设置 系统视图逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogicId
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysviewlogicid(String pSSysViewLogicId){
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    /**
     * 设置 系统视图逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogic 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic){
        if(pSSysViewLogic == null){
            this.setPSSysViewLogicId(null);
            this.setPSSysViewLogicName(null);
        }
        else{
            this.setPSSysViewLogicId(pSSysViewLogic.getPSSysViewLogicId());
            this.setPSSysViewLogicName(pSSysViewLogic.getPSSysViewLogicName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICNAME</B>&nbsp;系统界面逻辑，当前触发界面逻辑类型为【系统界面逻辑】时指定当前系统的预置界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWLOGICID}
     */
    public final static String FIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * 
     * @param pSSysViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICNAME)
    public void setPSSysViewLogicName(String pSSysViewLogicName){
        this.set(FIELD_PSSYSVIEWLOGICNAME, pSSysViewLogicName);
    }
    
    /**
     * 获取 系统界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicName(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicName(){
        this.reset(FIELD_PSSYSVIEWLOGICNAME);
    }

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * <P>
     * 等同 {@link #setPSSysViewLogicName}
     * @param pSSysViewLogicName
     */
    @JsonIgnore
    public PSDEUIActionDTO pssysviewlogicname(String pSSysViewLogicName){
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;系统流程
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO} 
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 系统流程
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 系统流程  
     * @return
     */
    @JsonIgnore
    public String getPSWFId(){
        Object objValue = this.get(FIELD_PSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统流程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFIdDirty(){
        if(this.contains(FIELD_PSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统流程
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 系统流程
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * 设置 系统流程，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfid(PSWorkflowDTO pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWFId(null);
            this.setPSWFName(null);
        }
        else{
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    /**
     * <B>PSWFNAME</B>&nbsp;系统流程
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFID}
     */
    public final static String FIELD_PSWFNAME = "pswfname";

    /**
     * 设置 系统流程
     * 
     * @param pSWFName
     * 
     */
    @JsonProperty(FIELD_PSWFNAME)
    public void setPSWFName(String pSWFName){
        this.set(FIELD_PSWFNAME, pSWFName);
    }
    
    /**
     * 获取 系统流程  
     * @return
     */
    @JsonIgnore
    public String getPSWFName(){
        Object objValue = this.get(FIELD_PSWFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统流程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFNameDirty(){
        if(this.contains(FIELD_PSWFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统流程
     */
    @JsonIgnore
    public void resetPSWFName(){
        this.reset(FIELD_PSWFNAME);
    }

    /**
     * 设置 系统流程
     * <P>
     * 等同 {@link #setPSWFName}
     * @param pSWFName
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfname(String pSWFName){
        this.setPSWFName(pSWFName);
        return this;
    }

    /**
     * <B>PSWFLINKID</B>&nbsp;流程处理连接标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFLinkDTO} 
     */
    public final static String FIELD_PSWFLINKID = "pswflinkid";

    /**
     * 设置 流程处理连接标识
     * 
     * @param pSWFLinkId
     * 
     */
    @JsonProperty(FIELD_PSWFLINKID)
    public void setPSWFLinkId(String pSWFLinkId){
        this.set(FIELD_PSWFLINKID, pSWFLinkId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pswfplinkid", pSWFLinkId);
    }
    
    /**
     * 获取 流程处理连接标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkId(){
        Object objValue = this.get(FIELD_PSWFLINKID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pswfplinkid");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理连接标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkIdDirty(){
        if(this.contains(FIELD_PSWFLINKID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pswfplinkid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理连接标识
     */
    @JsonIgnore
    public void resetPSWFLinkId(){
        this.reset(FIELD_PSWFLINKID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pswfplinkid");
    }

    /**
     * 设置 流程处理连接标识
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLinkId
     */
    @JsonIgnore
    public PSDEUIActionDTO pswflinkid(String pSWFLinkId){
        this.setPSWFLinkId(pSWFLinkId);
        return this;
    }

    /**
     * 设置 流程处理连接标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFLinkId}
     * @param pSWFLink 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pswflinkid(PSWFLinkDTO pSWFLink){
        if(pSWFLink == null){
            this.setPSWFLinkId(null);
        }
        else{
            this.setPSWFLinkId(pSWFLink.getPSWFLinkId());
        }
        return this;
    }

    /**
     * <B>PSWFLINKNAME</B>&nbsp;流程连接名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFLINKNAME = "pswflinkname";

    /**
     * 设置 流程连接名称
     * 
     * @param pSWFLinkName
     * 
     */
    @JsonProperty(FIELD_PSWFLINKNAME)
    public void setPSWFLinkName(String pSWFLinkName){
        this.set(FIELD_PSWFLINKNAME, pSWFLinkName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pswfplinkname", pSWFLinkName);
    }
    
    /**
     * 获取 流程连接名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFLinkName(){
        Object objValue = this.get(FIELD_PSWFLINKNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pswfplinkname");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 流程连接名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFLinkNameDirty(){
        if(this.contains(FIELD_PSWFLINKNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pswfplinkname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程连接名称
     */
    @JsonIgnore
    public void resetPSWFLinkName(){
        this.reset(FIELD_PSWFLINKNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pswfplinkname");
    }

    /**
     * 设置 流程连接名称
     * <P>
     * 等同 {@link #setPSWFLinkName}
     * @param pSWFLinkName
     */
    @JsonIgnore
    public PSDEUIActionDTO pswflinkname(String pSWFLinkName){
        this.setPSWFLinkName(pSWFLinkName);
        return this;
    }

    /**
     * <B>PSWFPROCESSID</B>&nbsp;流程处理标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFProcessDTO} 
     */
    public final static String FIELD_PSWFPROCESSID = "pswfprocessid";

    /**
     * 设置 流程处理标识
     * 
     * @param pSWFProcessId
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSID)
    public void setPSWFProcessId(String pSWFProcessId){
        this.set(FIELD_PSWFPROCESSID, pSWFProcessId);
    }
    
    /**
     * 获取 流程处理标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessId(){
        Object objValue = this.get(FIELD_PSWFPROCESSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessIdDirty(){
        if(this.contains(FIELD_PSWFPROCESSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理标识
     */
    @JsonIgnore
    public void resetPSWFProcessId(){
        this.reset(FIELD_PSWFPROCESSID);
    }

    /**
     * 设置 流程处理标识
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcessId
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfprocessid(String pSWFProcessId){
        this.setPSWFProcessId(pSWFProcessId);
        return this;
    }

    /**
     * 设置 流程处理标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFProcessId}
     * @param pSWFProcess 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfprocessid(PSWFProcessDTO pSWFProcess){
        if(pSWFProcess == null){
            this.setPSWFProcessId(null);
        }
        else{
            this.setPSWFProcessId(pSWFProcess.getPSWFProcessId());
        }
        return this;
    }

    /**
     * <B>PSWFPROCESSNAME</B>&nbsp;流程处理名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFPROCESSNAME = "pswfprocessname";

    /**
     * 设置 流程处理名称
     * 
     * @param pSWFProcessName
     * 
     */
    @JsonProperty(FIELD_PSWFPROCESSNAME)
    public void setPSWFProcessName(String pSWFProcessName){
        this.set(FIELD_PSWFPROCESSNAME, pSWFProcessName);
    }
    
    /**
     * 获取 流程处理名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFProcessName(){
        Object objValue = this.get(FIELD_PSWFPROCESSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程处理名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFProcessNameDirty(){
        if(this.contains(FIELD_PSWFPROCESSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程处理名称
     */
    @JsonIgnore
    public void resetPSWFProcessName(){
        this.reset(FIELD_PSWFPROCESSNAME);
    }

    /**
     * 设置 流程处理名称
     * <P>
     * 等同 {@link #setPSWFProcessName}
     * @param pSWFProcessName
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfprocessname(String pSWFProcessName){
        this.setPSWFProcessName(pSWFProcessName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFVersionDTO} 
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * 设置 工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfversionid(PSWFVersionDTO pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionName(){
        Object objValue = this.get(FIELD_PSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionNameDirty(){
        if(this.contains(FIELD_PSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSDEUIActionDTO pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>RELOADDATA</B>&nbsp;刷新引用视图，指定界面行为执行完成后刷新引用视图的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionReloadDataMode} 
     */
    public final static String FIELD_RELOADDATA = "reloaddata";

    /**
     * 设置 刷新引用视图，详细说明：{@link #FIELD_RELOADDATA}
     * 
     * @param reloadData
     * 
     */
    @JsonProperty(FIELD_RELOADDATA)
    public void setReloadData(Integer reloadData){
        this.set(FIELD_RELOADDATA, reloadData);
    }
    
    /**
     * 获取 刷新引用视图  
     * @return
     */
    @JsonIgnore
    public Integer getReloadData(){
        Object objValue = this.get(FIELD_RELOADDATA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 刷新引用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReloadDataDirty(){
        if(this.contains(FIELD_RELOADDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 刷新引用视图
     */
    @JsonIgnore
    public void resetReloadData(){
        this.reset(FIELD_RELOADDATA);
    }

    /**
     * 设置 刷新引用视图，详细说明：{@link #FIELD_RELOADDATA}
     * <P>
     * 等同 {@link #setReloadData}
     * @param reloadData
     */
    @JsonIgnore
    public PSDEUIActionDTO reloaddata(Integer reloadData){
        this.setReloadData(reloadData);
        return this;
    }

     /**
     * 设置 刷新引用视图，详细说明：{@link #FIELD_RELOADDATA}
     * <P>
     * 等同 {@link #setReloadData}
     * @param reloadData
     */
    @JsonIgnore
    public PSDEUIActionDTO reloaddata(net.ibizsys.model.PSModelEnums.UIActionReloadDataMode reloadData){
        if(reloadData == null){
            this.setReloadData(null);
        }
        else{
            this.setReloadData(reloadData.value);
        }
        return this;
    }

    /**
     * <B>REPPSSYSUIACTIONID</B>&nbsp;替换预定义行为
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REPPSSYSUIACTIONID = "reppssysuiactionid";

    /**
     * 设置 替换预定义行为
     * 
     * @param repPSSysUIActionId
     * 
     */
    @JsonProperty(FIELD_REPPSSYSUIACTIONID)
    public void setRepPSSysUIActionId(String repPSSysUIActionId){
        this.set(FIELD_REPPSSYSUIACTIONID, repPSSysUIActionId);
    }
    
    /**
     * 获取 替换预定义行为  
     * @return
     */
    @JsonIgnore
    public String getRepPSSysUIActionId(){
        Object objValue = this.get(FIELD_REPPSSYSUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 替换预定义行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRepPSSysUIActionIdDirty(){
        if(this.contains(FIELD_REPPSSYSUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 替换预定义行为
     */
    @JsonIgnore
    public void resetRepPSSysUIActionId(){
        this.reset(FIELD_REPPSSYSUIACTIONID);
    }

    /**
     * 设置 替换预定义行为
     * <P>
     * 等同 {@link #setRepPSSysUIActionId}
     * @param repPSSysUIActionId
     */
    @JsonIgnore
    public PSDEUIActionDTO reppssysuiactionid(String repPSSysUIActionId){
        this.setRepPSSysUIActionId(repPSSysUIActionId);
        return this;
    }

    /**
     * <B>REPPSSYSUIACTIONNAME</B>&nbsp;替换预定义行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REPPSSYSUIACTIONID}
     */
    public final static String FIELD_REPPSSYSUIACTIONNAME = "reppssysuiactionname";

    /**
     * 设置 替换预定义行为
     * 
     * @param repPSSysUIActionName
     * 
     */
    @JsonProperty(FIELD_REPPSSYSUIACTIONNAME)
    public void setRepPSSysUIActionName(String repPSSysUIActionName){
        this.set(FIELD_REPPSSYSUIACTIONNAME, repPSSysUIActionName);
    }
    
    /**
     * 获取 替换预定义行为  
     * @return
     */
    @JsonIgnore
    public String getRepPSSysUIActionName(){
        Object objValue = this.get(FIELD_REPPSSYSUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 替换预定义行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRepPSSysUIActionNameDirty(){
        if(this.contains(FIELD_REPPSSYSUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 替换预定义行为
     */
    @JsonIgnore
    public void resetRepPSSysUIActionName(){
        this.reset(FIELD_REPPSSYSUIACTIONNAME);
    }

    /**
     * 设置 替换预定义行为
     * <P>
     * 等同 {@link #setRepPSSysUIActionName}
     * @param repPSSysUIActionName
     */
    @JsonIgnore
    public PSDEUIActionDTO reppssysuiactionname(String repPSSysUIActionName){
        this.setRepPSSysUIActionName(repPSSysUIActionName);
        return this;
    }

    /**
     * <B>SMPSLANRESID</B>&nbsp;成功消息语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_SMPSLANRESID = "smpslanresid";

    /**
     * 设置 成功消息语言资源
     * 
     * @param sMPSLanResId
     * 
     */
    @JsonProperty(FIELD_SMPSLANRESID)
    public void setSMPSLanResId(String sMPSLanResId){
        this.set(FIELD_SMPSLANRESID, sMPSLanResId);
    }
    
    /**
     * 获取 成功消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getSMPSLanResId(){
        Object objValue = this.get(FIELD_SMPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成功消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMPSLanResIdDirty(){
        if(this.contains(FIELD_SMPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成功消息语言资源
     */
    @JsonIgnore
    public void resetSMPSLanResId(){
        this.reset(FIELD_SMPSLANRESID);
    }

    /**
     * 设置 成功消息语言资源
     * <P>
     * 等同 {@link #setSMPSLanResId}
     * @param sMPSLanResId
     */
    @JsonIgnore
    public PSDEUIActionDTO smpslanresid(String sMPSLanResId){
        this.setSMPSLanResId(sMPSLanResId);
        return this;
    }

    /**
     * 设置 成功消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSMPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO smpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSMPSLanResId(null);
            this.setSMPSLanResName(null);
        }
        else{
            this.setSMPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSMPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SMPSLANRESNAME</B>&nbsp;成功消息语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SMPSLANRESID}
     */
    public final static String FIELD_SMPSLANRESNAME = "smpslanresname";

    /**
     * 设置 成功消息语言资源
     * 
     * @param sMPSLanResName
     * 
     */
    @JsonProperty(FIELD_SMPSLANRESNAME)
    public void setSMPSLanResName(String sMPSLanResName){
        this.set(FIELD_SMPSLANRESNAME, sMPSLanResName);
    }
    
    /**
     * 获取 成功消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getSMPSLanResName(){
        Object objValue = this.get(FIELD_SMPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成功消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSMPSLanResNameDirty(){
        if(this.contains(FIELD_SMPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成功消息语言资源
     */
    @JsonIgnore
    public void resetSMPSLanResName(){
        this.reset(FIELD_SMPSLANRESNAME);
    }

    /**
     * 设置 成功消息语言资源
     * <P>
     * 等同 {@link #setSMPSLanResName}
     * @param sMPSLanResName
     */
    @JsonIgnore
    public PSDEUIActionDTO smpslanresname(String sMPSLanResName){
        this.setSMPSLanResName(sMPSLanResName);
        return this;
    }

    /**
     * <B>SUCCESSINFO</B>&nbsp;成功提示信息，指定界面行为执行成功的提示信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SUCCESSINFO = "successinfo";

    /**
     * 设置 成功提示信息，详细说明：{@link #FIELD_SUCCESSINFO}
     * 
     * @param successInfo
     * 
     */
    @JsonProperty(FIELD_SUCCESSINFO)
    public void setSuccessInfo(String successInfo){
        this.set(FIELD_SUCCESSINFO, successInfo);
    }
    
    /**
     * 获取 成功提示信息  
     * @return
     */
    @JsonIgnore
    public String getSuccessInfo(){
        Object objValue = this.get(FIELD_SUCCESSINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成功提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSuccessInfoDirty(){
        if(this.contains(FIELD_SUCCESSINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成功提示信息
     */
    @JsonIgnore
    public void resetSuccessInfo(){
        this.reset(FIELD_SUCCESSINFO);
    }

    /**
     * 设置 成功提示信息，详细说明：{@link #FIELD_SUCCESSINFO}
     * <P>
     * 等同 {@link #setSuccessInfo}
     * @param successInfo
     */
    @JsonIgnore
    public PSDEUIActionDTO successinfo(String successInfo){
        this.setSuccessInfo(successInfo);
        return this;
    }

    /**
     * <B>SYSITEMOBJ</B>&nbsp;预置行为处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUIACTIONID}
     */
    public final static String FIELD_SYSITEMOBJ = "sysitemobj";

    /**
     * 设置 预置行为处理对象
     * 
     * @param sysItemObj
     * 
     */
    @JsonProperty(FIELD_SYSITEMOBJ)
    public void setSysItemObj(String sysItemObj){
        this.set(FIELD_SYSITEMOBJ, sysItemObj);
    }
    
    /**
     * 获取 预置行为处理对象  
     * @return
     */
    @JsonIgnore
    public String getSysItemObj(){
        Object objValue = this.get(FIELD_SYSITEMOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置行为处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysItemObjDirty(){
        if(this.contains(FIELD_SYSITEMOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置行为处理对象
     */
    @JsonIgnore
    public void resetSysItemObj(){
        this.reset(FIELD_SYSITEMOBJ);
    }

    /**
     * 设置 预置行为处理对象
     * <P>
     * 等同 {@link #setSysItemObj}
     * @param sysItemObj
     */
    @JsonIgnore
    public PSDEUIActionDTO sysitemobj(String sysItemObj){
        this.setSysItemObj(sysItemObj);
        return this;
    }

    /**
     * <B>TEMPLMODE</B>&nbsp;界面行为模版
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TEMPLMODE = "templmode";

    /**
     * 设置 界面行为模版
     * 
     * @param templMode
     * 
     */
    @JsonProperty(FIELD_TEMPLMODE)
    public void setTemplMode(Integer templMode){
        this.set(FIELD_TEMPLMODE, templMode);
    }
    
    /**
     * 获取 界面行为模版  
     * @return
     */
    @JsonIgnore
    public Integer getTemplMode(){
        Object objValue = this.get(FIELD_TEMPLMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为模版 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplModeDirty(){
        if(this.contains(FIELD_TEMPLMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为模版
     */
    @JsonIgnore
    public void resetTemplMode(){
        this.reset(FIELD_TEMPLMODE);
    }

    /**
     * 设置 界面行为模版
     * <P>
     * 等同 {@link #setTemplMode}
     * @param templMode
     */
    @JsonIgnore
    public PSDEUIActionDTO templmode(Integer templMode){
        this.setTemplMode(templMode);
        return this;
    }

     /**
     * 设置 界面行为模版
     * <P>
     * 等同 {@link #setTemplMode}
     * @param templMode
     */
    @JsonIgnore
    public PSDEUIActionDTO templmode(Boolean templMode){
        if(templMode == null){
            this.setTemplMode(null);
        }
        else{
            this.setTemplMode(templMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TEXTITEM</B>&nbsp;信息项名称，指定从数据对象中获取信息项的属性名称、未定义时为【srfmajortext】
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_TEXTITEM = "textitem";

    /**
     * 设置 信息项名称，详细说明：{@link #FIELD_TEXTITEM}
     * 
     * @param textItem
     * 
     */
    @JsonProperty(FIELD_TEXTITEM)
    public void setTextItem(String textItem){
        this.set(FIELD_TEXTITEM, textItem);
    }
    
    /**
     * 获取 信息项名称  
     * @return
     */
    @JsonIgnore
    public String getTextItem(){
        Object objValue = this.get(FIELD_TEXTITEM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 信息项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextItemDirty(){
        if(this.contains(FIELD_TEXTITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 信息项名称
     */
    @JsonIgnore
    public void resetTextItem(){
        this.reset(FIELD_TEXTITEM);
    }

    /**
     * 设置 信息项名称，详细说明：{@link #FIELD_TEXTITEM}
     * <P>
     * 等同 {@link #setTextItem}
     * @param textItem
     */
    @JsonIgnore
    public PSDEUIActionDTO textitem(String textItem){
        this.setTextItem(textItem);
        return this;
    }

    /**
     * <B>TIMEOUT</B>&nbsp;操作超时
     */
    public final static String FIELD_TIMEOUT = "timeout";

    /**
     * 设置 操作超时
     * 
     * @param timeout
     * 
     */
    @JsonProperty(FIELD_TIMEOUT)
    public void setTimeout(Integer timeout){
        this.set(FIELD_TIMEOUT, timeout);
    }
    
    /**
     * 获取 操作超时  
     * @return
     */
    @JsonIgnore
    public Integer getTimeout(){
        Object objValue = this.get(FIELD_TIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 操作超时 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutDirty(){
        if(this.contains(FIELD_TIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作超时
     */
    @JsonIgnore
    public void resetTimeout(){
        this.reset(FIELD_TIMEOUT);
    }

    /**
     * 设置 操作超时
     * <P>
     * 等同 {@link #setTimeout}
     * @param timeout
     */
    @JsonIgnore
    public PSDEUIActionDTO timeout(Integer timeout){
        this.setTimeout(timeout);
        return this;
    }

    /**
     * <B>TIPPSLANRESID</B>&nbsp;提示语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_TIPPSLANRESID = "tippslanresid";

    /**
     * 设置 提示语言资源
     * 
     * @param tipPSLanResId
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESID)
    public void setTipPSLanResId(String tipPSLanResId){
        this.set(FIELD_TIPPSLANRESID, tipPSLanResId);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResId(){
        Object objValue = this.get(FIELD_TIPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResIdDirty(){
        if(this.contains(FIELD_TIPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResId(){
        this.reset(FIELD_TIPPSLANRESID);
    }

    /**
     * 设置 提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param tipPSLanResId
     */
    @JsonIgnore
    public PSDEUIActionDTO tippslanresid(String tipPSLanResId){
        this.setTipPSLanResId(tipPSLanResId);
        return this;
    }

    /**
     * 设置 提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTipPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEUIActionDTO tippslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTipPSLanResId(null);
            this.setTipPSLanResName(null);
        }
        else{
            this.setTipPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTipPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TIPPSLANRESNAME</B>&nbsp;提示语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIPPSLANRESID}
     */
    public final static String FIELD_TIPPSLANRESNAME = "tippslanresname";

    /**
     * 设置 提示语言资源
     * 
     * @param tipPSLanResName
     * 
     */
    @JsonProperty(FIELD_TIPPSLANRESNAME)
    public void setTipPSLanResName(String tipPSLanResName){
        this.set(FIELD_TIPPSLANRESNAME, tipPSLanResName);
    }
    
    /**
     * 获取 提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getTipPSLanResName(){
        Object objValue = this.get(FIELD_TIPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipPSLanResNameDirty(){
        if(this.contains(FIELD_TIPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示语言资源
     */
    @JsonIgnore
    public void resetTipPSLanResName(){
        this.reset(FIELD_TIPPSLANRESNAME);
    }

    /**
     * 设置 提示语言资源
     * <P>
     * 等同 {@link #setTipPSLanResName}
     * @param tipPSLanResName
     */
    @JsonIgnore
    public PSDEUIActionDTO tippslanresname(String tipPSLanResName){
        this.setTipPSLanResName(tipPSLanResName);
        return this;
    }

    /**
     * <B>TOOLTIPINFO</B>&nbsp;提示信息
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_TOOLTIPINFO = "tooltipinfo";

    /**
     * 设置 提示信息
     * 
     * @param tooltipInfo
     * 
     */
    @JsonProperty(FIELD_TOOLTIPINFO)
    public void setTooltipInfo(String tooltipInfo){
        this.set(FIELD_TOOLTIPINFO, tooltipInfo);
    }
    
    /**
     * 获取 提示信息  
     * @return
     */
    @JsonIgnore
    public String getTooltipInfo(){
        Object objValue = this.get(FIELD_TOOLTIPINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTooltipInfoDirty(){
        if(this.contains(FIELD_TOOLTIPINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示信息
     */
    @JsonIgnore
    public void resetTooltipInfo(){
        this.reset(FIELD_TOOLTIPINFO);
    }

    /**
     * 设置 提示信息
     * <P>
     * 等同 {@link #setTooltipInfo}
     * @param tooltipInfo
     */
    @JsonIgnore
    public PSDEUIActionDTO tooltipinfo(String tooltipInfo){
        this.setTooltipInfo(tooltipInfo);
        return this;
    }

    /**
     * <B>UATAG</B>&nbsp;行为标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UATAG = "uatag";

    /**
     * 设置 行为标记
     * 
     * @param uATag
     * 
     */
    @JsonProperty(FIELD_UATAG)
    public void setUATag(String uATag){
        this.set(FIELD_UATAG, uATag);
    }
    
    /**
     * 获取 行为标记  
     * @return
     */
    @JsonIgnore
    public String getUATag(){
        Object objValue = this.get(FIELD_UATAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUATagDirty(){
        if(this.contains(FIELD_UATAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记
     */
    @JsonIgnore
    public void resetUATag(){
        this.reset(FIELD_UATAG);
    }

    /**
     * 设置 行为标记
     * <P>
     * 等同 {@link #setUATag}
     * @param uATag
     */
    @JsonIgnore
    public PSDEUIActionDTO uatag(String uATag){
        this.setUATag(uATag);
        return this;
    }

    /**
     * <B>UATAG2</B>&nbsp;行为标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UATAG2 = "uatag2";

    /**
     * 设置 行为标记2
     * 
     * @param uATag2
     * 
     */
    @JsonProperty(FIELD_UATAG2)
    public void setUATag2(String uATag2){
        this.set(FIELD_UATAG2, uATag2);
    }
    
    /**
     * 获取 行为标记2  
     * @return
     */
    @JsonIgnore
    public String getUATag2(){
        Object objValue = this.get(FIELD_UATAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUATag2Dirty(){
        if(this.contains(FIELD_UATAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记2
     */
    @JsonIgnore
    public void resetUATag2(){
        this.reset(FIELD_UATAG2);
    }

    /**
     * 设置 行为标记2
     * <P>
     * 等同 {@link #setUATag2}
     * @param uATag2
     */
    @JsonIgnore
    public PSDEUIActionDTO uatag2(String uATag2){
        this.setUATag2(uATag2);
        return this;
    }

    /**
     * <B>UATAG3</B>&nbsp;行为标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UATAG3 = "uatag3";

    /**
     * 设置 行为标记3
     * 
     * @param uATag3
     * 
     */
    @JsonProperty(FIELD_UATAG3)
    public void setUATag3(String uATag3){
        this.set(FIELD_UATAG3, uATag3);
    }
    
    /**
     * 获取 行为标记3  
     * @return
     */
    @JsonIgnore
    public String getUATag3(){
        Object objValue = this.get(FIELD_UATAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUATag3Dirty(){
        if(this.contains(FIELD_UATAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记3
     */
    @JsonIgnore
    public void resetUATag3(){
        this.reset(FIELD_UATAG3);
    }

    /**
     * 设置 行为标记3
     * <P>
     * 等同 {@link #setUATag3}
     * @param uATag3
     */
    @JsonIgnore
    public PSDEUIActionDTO uatag3(String uATag3){
        this.setUATag3(uATag3);
        return this;
    }

    /**
     * <B>UATAG4</B>&nbsp;行为标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UATAG4 = "uatag4";

    /**
     * 设置 行为标记4
     * 
     * @param uATag4
     * 
     */
    @JsonProperty(FIELD_UATAG4)
    public void setUATag4(String uATag4){
        this.set(FIELD_UATAG4, uATag4);
    }
    
    /**
     * 获取 行为标记4  
     * @return
     */
    @JsonIgnore
    public String getUATag4(){
        Object objValue = this.get(FIELD_UATAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUATag4Dirty(){
        if(this.contains(FIELD_UATAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标记4
     */
    @JsonIgnore
    public void resetUATag4(){
        this.reset(FIELD_UATAG4);
    }

    /**
     * 设置 行为标记4
     * <P>
     * 等同 {@link #setUATag4}
     * @param uATag4
     */
    @JsonIgnore
    public PSDEUIActionDTO uatag4(String uATag4){
        this.setUATag4(uATag4);
        return this;
    }

    /**
     * <B>UIACTIONCODE</B>&nbsp;界面行为代码
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_UIACTIONCODE = "uiactioncode";

    /**
     * 设置 界面行为代码
     * 
     * @param uIActionCode
     * 
     */
    @JsonProperty(FIELD_UIACTIONCODE)
    public void setUIActionCode(String uIActionCode){
        this.set(FIELD_UIACTIONCODE, uIActionCode);
    }
    
    /**
     * 获取 界面行为代码  
     * @return
     */
    @JsonIgnore
    public String getUIActionCode(){
        Object objValue = this.get(FIELD_UIACTIONCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionCodeDirty(){
        if(this.contains(FIELD_UIACTIONCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为代码
     */
    @JsonIgnore
    public void resetUIActionCode(){
        this.reset(FIELD_UIACTIONCODE);
    }

    /**
     * 设置 界面行为代码
     * <P>
     * 等同 {@link #setUIActionCode}
     * @param uIActionCode
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactioncode(String uIActionCode){
        this.setUIActionCode(uIActionCode);
        return this;
    }

    /**
     * <B>UIACTIONPARAM</B>&nbsp;界面行为参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UIACTIONPARAM = "uiactionparam";

    /**
     * 设置 界面行为参数
     * 
     * @param uIActionParam
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM)
    public void setUIActionParam(String uIActionParam){
        this.set(FIELD_UIACTIONPARAM, uIActionParam);
    }
    
    /**
     * 获取 界面行为参数  
     * @return
     */
    @JsonIgnore
    public String getUIActionParam(){
        Object objValue = this.get(FIELD_UIACTIONPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParamDirty(){
        if(this.contains(FIELD_UIACTIONPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数
     */
    @JsonIgnore
    public void resetUIActionParam(){
        this.reset(FIELD_UIACTIONPARAM);
    }

    /**
     * 设置 界面行为参数
     * <P>
     * 等同 {@link #setUIActionParam}
     * @param uIActionParam
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam(String uIActionParam){
        this.setUIActionParam(uIActionParam);
        return this;
    }

    /**
     * <B>UIACTIONPARAM10</B>&nbsp;界面行为参数10
     */
    public final static String FIELD_UIACTIONPARAM10 = "uiactionparam10";

    /**
     * 设置 界面行为参数10
     * 
     * @param uIActionParam10
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM10)
    public void setUIActionParam10(Double uIActionParam10){
        this.set(FIELD_UIACTIONPARAM10, uIActionParam10);
    }
    
    /**
     * 获取 界面行为参数10  
     * @return
     */
    @JsonIgnore
    public Double getUIActionParam10(){
        Object objValue = this.get(FIELD_UIACTIONPARAM10);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 界面行为参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam10Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数10
     */
    @JsonIgnore
    public void resetUIActionParam10(){
        this.reset(FIELD_UIACTIONPARAM10);
    }

    /**
     * 设置 界面行为参数10
     * <P>
     * 等同 {@link #setUIActionParam10}
     * @param uIActionParam10
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam10(Double uIActionParam10){
        this.setUIActionParam10(uIActionParam10);
        return this;
    }

    /**
     * <B>UIACTIONPARAM11</B>&nbsp;界面行为参数11
     */
    public final static String FIELD_UIACTIONPARAM11 = "uiactionparam11";

    /**
     * 设置 界面行为参数11
     * 
     * @param uIActionParam11
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM11)
    public void setUIActionParam11(Integer uIActionParam11){
        this.set(FIELD_UIACTIONPARAM11, uIActionParam11);
    }
    
    /**
     * 获取 界面行为参数11  
     * @return
     */
    @JsonIgnore
    public Integer getUIActionParam11(){
        Object objValue = this.get(FIELD_UIACTIONPARAM11);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam11Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数11
     */
    @JsonIgnore
    public void resetUIActionParam11(){
        this.reset(FIELD_UIACTIONPARAM11);
    }

    /**
     * 设置 界面行为参数11
     * <P>
     * 等同 {@link #setUIActionParam11}
     * @param uIActionParam11
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam11(Integer uIActionParam11){
        this.setUIActionParam11(uIActionParam11);
        return this;
    }

    /**
     * <B>UIACTIONPARAM12</B>&nbsp;界面行为参数12
     */
    public final static String FIELD_UIACTIONPARAM12 = "uiactionparam12";

    /**
     * 设置 界面行为参数12
     * 
     * @param uIActionParam12
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM12)
    public void setUIActionParam12(Integer uIActionParam12){
        this.set(FIELD_UIACTIONPARAM12, uIActionParam12);
    }
    
    /**
     * 获取 界面行为参数12  
     * @return
     */
    @JsonIgnore
    public Integer getUIActionParam12(){
        Object objValue = this.get(FIELD_UIACTIONPARAM12);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam12Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数12
     */
    @JsonIgnore
    public void resetUIActionParam12(){
        this.reset(FIELD_UIACTIONPARAM12);
    }

    /**
     * 设置 界面行为参数12
     * <P>
     * 等同 {@link #setUIActionParam12}
     * @param uIActionParam12
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam12(Integer uIActionParam12){
        this.setUIActionParam12(uIActionParam12);
        return this;
    }

    /**
     * <B>UIACTIONPARAM2</B>&nbsp;界面行为参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UIACTIONPARAM2 = "uiactionparam2";

    /**
     * 设置 界面行为参数2
     * 
     * @param uIActionParam2
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM2)
    public void setUIActionParam2(String uIActionParam2){
        this.set(FIELD_UIACTIONPARAM2, uIActionParam2);
    }
    
    /**
     * 获取 界面行为参数2  
     * @return
     */
    @JsonIgnore
    public String getUIActionParam2(){
        Object objValue = this.get(FIELD_UIACTIONPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam2Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数2
     */
    @JsonIgnore
    public void resetUIActionParam2(){
        this.reset(FIELD_UIACTIONPARAM2);
    }

    /**
     * 设置 界面行为参数2
     * <P>
     * 等同 {@link #setUIActionParam2}
     * @param uIActionParam2
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam2(String uIActionParam2){
        this.setUIActionParam2(uIActionParam2);
        return this;
    }

    /**
     * <B>UIACTIONPARAM3</B>&nbsp;界面行为参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UIACTIONPARAM3 = "uiactionparam3";

    /**
     * 设置 界面行为参数3
     * 
     * @param uIActionParam3
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM3)
    public void setUIActionParam3(String uIActionParam3){
        this.set(FIELD_UIACTIONPARAM3, uIActionParam3);
    }
    
    /**
     * 获取 界面行为参数3  
     * @return
     */
    @JsonIgnore
    public String getUIActionParam3(){
        Object objValue = this.get(FIELD_UIACTIONPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam3Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数3
     */
    @JsonIgnore
    public void resetUIActionParam3(){
        this.reset(FIELD_UIACTIONPARAM3);
    }

    /**
     * 设置 界面行为参数3
     * <P>
     * 等同 {@link #setUIActionParam3}
     * @param uIActionParam3
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam3(String uIActionParam3){
        this.setUIActionParam3(uIActionParam3);
        return this;
    }

    /**
     * <B>UIACTIONPARAM4</B>&nbsp;界面行为参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UIACTIONPARAM4 = "uiactionparam4";

    /**
     * 设置 界面行为参数4
     * 
     * @param uIActionParam4
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM4)
    public void setUIActionParam4(String uIActionParam4){
        this.set(FIELD_UIACTIONPARAM4, uIActionParam4);
    }
    
    /**
     * 获取 界面行为参数4  
     * @return
     */
    @JsonIgnore
    public String getUIActionParam4(){
        Object objValue = this.get(FIELD_UIACTIONPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam4Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数4
     */
    @JsonIgnore
    public void resetUIActionParam4(){
        this.reset(FIELD_UIACTIONPARAM4);
    }

    /**
     * 设置 界面行为参数4
     * <P>
     * 等同 {@link #setUIActionParam4}
     * @param uIActionParam4
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam4(String uIActionParam4){
        this.setUIActionParam4(uIActionParam4);
        return this;
    }

    /**
     * <B>UIACTIONPARAM5</B>&nbsp;界面行为参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UIACTIONPARAM5 = "uiactionparam5";

    /**
     * 设置 界面行为参数5
     * 
     * @param uIActionParam5
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM5)
    public void setUIActionParam5(Integer uIActionParam5){
        this.set(FIELD_UIACTIONPARAM5, uIActionParam5);
    }
    
    /**
     * 获取 界面行为参数5  
     * @return
     */
    @JsonIgnore
    public Integer getUIActionParam5(){
        Object objValue = this.get(FIELD_UIACTIONPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam5Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数5
     */
    @JsonIgnore
    public void resetUIActionParam5(){
        this.reset(FIELD_UIACTIONPARAM5);
    }

    /**
     * 设置 界面行为参数5
     * <P>
     * 等同 {@link #setUIActionParam5}
     * @param uIActionParam5
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam5(Integer uIActionParam5){
        this.setUIActionParam5(uIActionParam5);
        return this;
    }

     /**
     * 设置 界面行为参数5
     * <P>
     * 等同 {@link #setUIActionParam5}
     * @param uIActionParam5
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam5(Boolean uIActionParam5){
        if(uIActionParam5 == null){
            this.setUIActionParam5(null);
        }
        else{
            this.setUIActionParam5(uIActionParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UIACTIONPARAM6</B>&nbsp;界面行为参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UIACTIONPARAM6 = "uiactionparam6";

    /**
     * 设置 界面行为参数6
     * 
     * @param uIActionParam6
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM6)
    public void setUIActionParam6(Integer uIActionParam6){
        this.set(FIELD_UIACTIONPARAM6, uIActionParam6);
    }
    
    /**
     * 获取 界面行为参数6  
     * @return
     */
    @JsonIgnore
    public Integer getUIActionParam6(){
        Object objValue = this.get(FIELD_UIACTIONPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam6Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数6
     */
    @JsonIgnore
    public void resetUIActionParam6(){
        this.reset(FIELD_UIACTIONPARAM6);
    }

    /**
     * 设置 界面行为参数6
     * <P>
     * 等同 {@link #setUIActionParam6}
     * @param uIActionParam6
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam6(Integer uIActionParam6){
        this.setUIActionParam6(uIActionParam6);
        return this;
    }

     /**
     * 设置 界面行为参数6
     * <P>
     * 等同 {@link #setUIActionParam6}
     * @param uIActionParam6
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam6(Boolean uIActionParam6){
        if(uIActionParam6 == null){
            this.setUIActionParam6(null);
        }
        else{
            this.setUIActionParam6(uIActionParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UIACTIONPARAM7</B>&nbsp;界面行为参数7
     */
    public final static String FIELD_UIACTIONPARAM7 = "uiactionparam7";

    /**
     * 设置 界面行为参数7
     * 
     * @param uIActionParam7
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM7)
    public void setUIActionParam7(Integer uIActionParam7){
        this.set(FIELD_UIACTIONPARAM7, uIActionParam7);
    }
    
    /**
     * 获取 界面行为参数7  
     * @return
     */
    @JsonIgnore
    public Integer getUIActionParam7(){
        Object objValue = this.get(FIELD_UIACTIONPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam7Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数7
     */
    @JsonIgnore
    public void resetUIActionParam7(){
        this.reset(FIELD_UIACTIONPARAM7);
    }

    /**
     * 设置 界面行为参数7
     * <P>
     * 等同 {@link #setUIActionParam7}
     * @param uIActionParam7
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam7(Integer uIActionParam7){
        this.setUIActionParam7(uIActionParam7);
        return this;
    }

    /**
     * <B>UIACTIONPARAM8</B>&nbsp;界面行为参数8
     */
    public final static String FIELD_UIACTIONPARAM8 = "uiactionparam8";

    /**
     * 设置 界面行为参数8
     * 
     * @param uIActionParam8
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM8)
    public void setUIActionParam8(Integer uIActionParam8){
        this.set(FIELD_UIACTIONPARAM8, uIActionParam8);
    }
    
    /**
     * 获取 界面行为参数8  
     * @return
     */
    @JsonIgnore
    public Integer getUIActionParam8(){
        Object objValue = this.get(FIELD_UIACTIONPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 界面行为参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam8Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数8
     */
    @JsonIgnore
    public void resetUIActionParam8(){
        this.reset(FIELD_UIACTIONPARAM8);
    }

    /**
     * 设置 界面行为参数8
     * <P>
     * 等同 {@link #setUIActionParam8}
     * @param uIActionParam8
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam8(Integer uIActionParam8){
        this.setUIActionParam8(uIActionParam8);
        return this;
    }

    /**
     * <B>UIACTIONPARAM9</B>&nbsp;界面行为参数9
     */
    public final static String FIELD_UIACTIONPARAM9 = "uiactionparam9";

    /**
     * 设置 界面行为参数9
     * 
     * @param uIActionParam9
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAM9)
    public void setUIActionParam9(Double uIActionParam9){
        this.set(FIELD_UIACTIONPARAM9, uIActionParam9);
    }
    
    /**
     * 获取 界面行为参数9  
     * @return
     */
    @JsonIgnore
    public Double getUIActionParam9(){
        Object objValue = this.get(FIELD_UIACTIONPARAM9);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 界面行为参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParam9Dirty(){
        if(this.contains(FIELD_UIACTIONPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数9
     */
    @JsonIgnore
    public void resetUIActionParam9(){
        this.reset(FIELD_UIACTIONPARAM9);
    }

    /**
     * 设置 界面行为参数9
     * <P>
     * 等同 {@link #setUIActionParam9}
     * @param uIActionParam9
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparam9(Double uIActionParam9){
        this.setUIActionParam9(uIActionParam9);
        return this;
    }

    /**
     * <B>UIACTIONPARAMS</B>&nbsp;界面行为参数
     */
    public final static String FIELD_UIACTIONPARAMS = "uiactionparams";

    /**
     * 设置 界面行为参数
     * 
     * @param uIActionParams
     * 
     */
    @JsonProperty(FIELD_UIACTIONPARAMS)
    public void setUIActionParams(String uIActionParams){
        this.set(FIELD_UIACTIONPARAMS, uIActionParams);
    }
    
    /**
     * 获取 界面行为参数  
     * @return
     */
    @JsonIgnore
    public String getUIActionParams(){
        Object objValue = this.get(FIELD_UIACTIONPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionParamsDirty(){
        if(this.contains(FIELD_UIACTIONPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为参数
     */
    @JsonIgnore
    public void resetUIActionParams(){
        this.reset(FIELD_UIACTIONPARAMS);
    }

    /**
     * 设置 界面行为参数
     * <P>
     * 等同 {@link #setUIActionParams}
     * @param uIActionParams
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactionparams(String uIActionParams){
        this.setUIActionParams(uIActionParams);
        return this;
    }

    /**
     * <B>UIACTIONTYPE</B>&nbsp;界面行为类型，指定界面行为的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionType} 
     */
    public final static String FIELD_UIACTIONTYPE = "uiactiontype";

    /**
     * 设置 界面行为类型，详细说明：{@link #FIELD_UIACTIONTYPE}
     * 
     * @param uIActionType
     * 
     */
    @JsonProperty(FIELD_UIACTIONTYPE)
    public void setUIActionType(String uIActionType){
        this.set(FIELD_UIACTIONTYPE, uIActionType);
    }
    
    /**
     * 获取 界面行为类型  
     * @return
     */
    @JsonIgnore
    public String getUIActionType(){
        Object objValue = this.get(FIELD_UIACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUIActionTypeDirty(){
        if(this.contains(FIELD_UIACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为类型
     */
    @JsonIgnore
    public void resetUIActionType(){
        this.reset(FIELD_UIACTIONTYPE);
    }

    /**
     * 设置 界面行为类型，详细说明：{@link #FIELD_UIACTIONTYPE}
     * <P>
     * 等同 {@link #setUIActionType}
     * @param uIActionType
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactiontype(String uIActionType){
        this.setUIActionType(uIActionType);
        return this;
    }

     /**
     * 设置 界面行为类型，详细说明：{@link #FIELD_UIACTIONTYPE}
     * <P>
     * 等同 {@link #setUIActionType}
     * @param uIActionType
     */
    @JsonIgnore
    public PSDEUIActionDTO uiactiontype(net.ibizsys.model.PSModelEnums.UIActionType uIActionType){
        if(uIActionType == null){
            this.setUIActionType(null);
        }
        else{
            this.setUIActionType(uIActionType.value);
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
    public PSDEUIActionDTO updatedate(Timestamp updateDate){
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
    public PSDEUIActionDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
     */
    public final static String FIELD_USERCAT = "usercat";

    /**
     * 设置 用户分类
     * 
     * @param userCat
     * 
     */
    @JsonProperty(FIELD_USERCAT)
    public void setUserCat(String userCat){
        this.set(FIELD_USERCAT, userCat);
    }
    
    /**
     * 获取 用户分类  
     * @return
     */
    @JsonIgnore
    public String getUserCat(){
        Object objValue = this.get(FIELD_USERCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserCatDirty(){
        if(this.contains(FIELD_USERCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户分类
     */
    @JsonIgnore
    public void resetUserCat(){
        this.reset(FIELD_USERCAT);
    }

    /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSDEUIActionDTO usercat(String userCat){
        this.setUserCat(userCat);
        return this;
    }

     /**
     * 设置 用户分类
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSDEUIActionDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERCONFIRM</B>&nbsp;提示用户确认，指定操作之前是否需要用户确认，未定义时前端操作为【否】、其它为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERCONFIRM = "userconfirm";

    /**
     * 设置 提示用户确认，详细说明：{@link #FIELD_USERCONFIRM}
     * 
     * @param userConfirm
     * 
     */
    @JsonProperty(FIELD_USERCONFIRM)
    public void setUserConfirm(Integer userConfirm){
        this.set(FIELD_USERCONFIRM, userConfirm);
    }
    
    /**
     * 获取 提示用户确认  
     * @return
     */
    @JsonIgnore
    public Integer getUserConfirm(){
        Object objValue = this.get(FIELD_USERCONFIRM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 提示用户确认 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserConfirmDirty(){
        if(this.contains(FIELD_USERCONFIRM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示用户确认
     */
    @JsonIgnore
    public void resetUserConfirm(){
        this.reset(FIELD_USERCONFIRM);
    }

    /**
     * 设置 提示用户确认，详细说明：{@link #FIELD_USERCONFIRM}
     * <P>
     * 等同 {@link #setUserConfirm}
     * @param userConfirm
     */
    @JsonIgnore
    public PSDEUIActionDTO userconfirm(Integer userConfirm){
        this.setUserConfirm(userConfirm);
        return this;
    }

     /**
     * 设置 提示用户确认，详细说明：{@link #FIELD_USERCONFIRM}
     * <P>
     * 等同 {@link #setUserConfirm}
     * @param userConfirm
     */
    @JsonIgnore
    public PSDEUIActionDTO userconfirm(Boolean userConfirm){
        if(userConfirm == null){
            this.setUserConfirm(null);
        }
        else{
            this.setUserConfirm(userConfirm?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEUIActionDTO userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 100
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
    public PSDEUIActionDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDEUIActionDTO usertag2(String userTag2){
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
    public PSDEUIActionDTO usertag3(String userTag3){
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
    public PSDEUIActionDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWACTIONS</B>&nbsp;支持视图操作，启用视图操作控制时，指定界面行为关联的视图操作，未定义时为无操作【0】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEViewAction} 
     */
    public final static String FIELD_VIEWACTIONS = "viewactions";

    /**
     * 设置 支持视图操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * 
     * @param viewActions
     * 
     */
    @JsonProperty(FIELD_VIEWACTIONS)
    public void setViewActions(Integer viewActions){
        this.set(FIELD_VIEWACTIONS, viewActions);
    }
    
    /**
     * 获取 支持视图操作  
     * @return
     */
    @JsonIgnore
    public Integer getViewActions(){
        Object objValue = this.get(FIELD_VIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持视图操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewActionsDirty(){
        if(this.contains(FIELD_VIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持视图操作
     */
    @JsonIgnore
    public void resetViewActions(){
        this.reset(FIELD_VIEWACTIONS);
    }

    /**
     * 设置 支持视图操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSDEUIActionDTO viewactions(Integer viewActions){
        this.setViewActions(viewActions);
        return this;
    }

     /**
     * 设置 支持视图操作，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSDEUIActionDTO viewactions(net.ibizsys.model.PSModelEnums.DEViewAction[] viewActions){
        if(viewActions == null || viewActions.length == 0){
            this.setViewActions(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.DEViewAction _item : viewActions){
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    /**
     * <B>VIEWLOGICTYPE</B>&nbsp;界面逻辑类型，启用附加界面逻辑时指定触发的界面逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionTargetUILogic} 
     */
    public final static String FIELD_VIEWLOGICTYPE = "viewlogictype";

    /**
     * 设置 界面逻辑类型，详细说明：{@link #FIELD_VIEWLOGICTYPE}
     * 
     * @param viewLogicType
     * 
     */
    @JsonProperty(FIELD_VIEWLOGICTYPE)
    public void setViewLogicType(String viewLogicType){
        this.set(FIELD_VIEWLOGICTYPE, viewLogicType);
    }
    
    /**
     * 获取 界面逻辑类型  
     * @return
     */
    @JsonIgnore
    public String getViewLogicType(){
        Object objValue = this.get(FIELD_VIEWLOGICTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewLogicTypeDirty(){
        if(this.contains(FIELD_VIEWLOGICTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑类型
     */
    @JsonIgnore
    public void resetViewLogicType(){
        this.reset(FIELD_VIEWLOGICTYPE);
    }

    /**
     * 设置 界面逻辑类型，详细说明：{@link #FIELD_VIEWLOGICTYPE}
     * <P>
     * 等同 {@link #setViewLogicType}
     * @param viewLogicType
     */
    @JsonIgnore
    public PSDEUIActionDTO viewlogictype(String viewLogicType){
        this.setViewLogicType(viewLogicType);
        return this;
    }

     /**
     * 设置 界面逻辑类型，详细说明：{@link #FIELD_VIEWLOGICTYPE}
     * <P>
     * 等同 {@link #setViewLogicType}
     * @param viewLogicType
     */
    @JsonIgnore
    public PSDEUIActionDTO viewlogictype(net.ibizsys.model.PSModelEnums.UIActionTargetUILogic viewLogicType){
        if(viewLogicType == null){
            this.setViewLogicType(null);
        }
        else{
            this.setViewLogicType(viewLogicType.value);
        }
        return this;
    }

    /**
     * <B>VLEXECMODE</B>&nbsp;附加界面逻辑，指定附加界面逻辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UIActionVLExecMode} 
     */
    public final static String FIELD_VLEXECMODE = "vlexecmode";

    /**
     * 设置 附加界面逻辑，详细说明：{@link #FIELD_VLEXECMODE}
     * 
     * @param vLExecMode
     * 
     */
    @JsonProperty(FIELD_VLEXECMODE)
    public void setVLExecMode(String vLExecMode){
        this.set(FIELD_VLEXECMODE, vLExecMode);
    }
    
    /**
     * 获取 附加界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getVLExecMode(){
        Object objValue = this.get(FIELD_VLEXECMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVLExecModeDirty(){
        if(this.contains(FIELD_VLEXECMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加界面逻辑
     */
    @JsonIgnore
    public void resetVLExecMode(){
        this.reset(FIELD_VLEXECMODE);
    }

    /**
     * 设置 附加界面逻辑，详细说明：{@link #FIELD_VLEXECMODE}
     * <P>
     * 等同 {@link #setVLExecMode}
     * @param vLExecMode
     */
    @JsonIgnore
    public PSDEUIActionDTO vlexecmode(String vLExecMode){
        this.setVLExecMode(vLExecMode);
        return this;
    }

     /**
     * 设置 附加界面逻辑，详细说明：{@link #FIELD_VLEXECMODE}
     * <P>
     * 等同 {@link #setVLExecMode}
     * @param vLExecMode
     */
    @JsonIgnore
    public PSDEUIActionDTO vlexecmode(net.ibizsys.model.PSModelEnums.UIActionVLExecMode vLExecMode){
        if(vLExecMode == null){
            this.setVLExecMode(null);
        }
        else{
            this.setVLExecMode(vLExecMode.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEUIActionId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEUIActionId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEUIActionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEUIActionId(strValue);
    }

    @JsonIgnore
    public PSDEUIActionDTO id(String strValue){
        this.setPSDEUIActionId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEUIActionDTO){
            PSDEUIActionDTO dto = (PSDEUIActionDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
