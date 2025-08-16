package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWFDE</B>工作流实体 模型传输对象
 * <P>
 * 工作流实体模型，定义支持工作流能力的实体，指定流程运行时信息存储的实体属性，相关的操作视图等
 */
public class PSWFDEDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWFDEDTO(){
    }      

    /**
     * <B>ACTIONMOBPSDEVIEWID</B>&nbsp;移动端默认操作视图，指定工作流实体的移动端默认操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_ACTIONMOBPSDEVIEWID = "actionmobpsdeviewid";

    /**
     * 设置 移动端默认操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWID}
     * 
     * @param actionMobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_ACTIONMOBPSDEVIEWID)
    public void setActionMobPSDEViewId(String actionMobPSDEViewId){
        this.set(FIELD_ACTIONMOBPSDEVIEWID, actionMobPSDEViewId);
    }
    
    /**
     * 获取 移动端默认操作视图  
     * @return
     */
    @JsonIgnore
    public String getActionMobPSDEViewId(){
        Object objValue = this.get(FIELD_ACTIONMOBPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端默认操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionMobPSDEViewIdDirty(){
        if(this.contains(FIELD_ACTIONMOBPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端默认操作视图
     */
    @JsonIgnore
    public void resetActionMobPSDEViewId(){
        this.reset(FIELD_ACTIONMOBPSDEVIEWID);
    }

    /**
     * 设置 移动端默认操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWID}
     * <P>
     * 等同 {@link #setActionMobPSDEViewId}
     * @param actionMobPSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO actionmobpsdeviewid(String actionMobPSDEViewId){
        this.setActionMobPSDEViewId(actionMobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端默认操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setActionMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO actionmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setActionMobPSDEViewId(null);
            this.setActionMobPSDEViewName(null);
        }
        else{
            this.setActionMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setActionMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>ACTIONMOBPSDEVIEWNAME</B>&nbsp;移动端默认操作视图，指定工作流实体的移动端默认操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ACTIONMOBPSDEVIEWID}
     */
    public final static String FIELD_ACTIONMOBPSDEVIEWNAME = "actionmobpsdeviewname";

    /**
     * 设置 移动端默认操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWNAME}
     * 
     * @param actionMobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_ACTIONMOBPSDEVIEWNAME)
    public void setActionMobPSDEViewName(String actionMobPSDEViewName){
        this.set(FIELD_ACTIONMOBPSDEVIEWNAME, actionMobPSDEViewName);
    }
    
    /**
     * 获取 移动端默认操作视图  
     * @return
     */
    @JsonIgnore
    public String getActionMobPSDEViewName(){
        Object objValue = this.get(FIELD_ACTIONMOBPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端默认操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionMobPSDEViewNameDirty(){
        if(this.contains(FIELD_ACTIONMOBPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端默认操作视图
     */
    @JsonIgnore
    public void resetActionMobPSDEViewName(){
        this.reset(FIELD_ACTIONMOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端默认操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setActionMobPSDEViewName}
     * @param actionMobPSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO actionmobpsdeviewname(String actionMobPSDEViewName){
        this.setActionMobPSDEViewName(actionMobPSDEViewName);
        return this;
    }

    /**
     * <B>ACTIONPSDEVIEWID</B>&nbsp;默认操作视图，指定工作流实体的桌面端默认操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_ACTIONPSDEVIEWID = "actionpsdeviewid";

    /**
     * 设置 默认操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWID}
     * 
     * @param actionPSDEViewId
     * 
     */
    @JsonProperty(FIELD_ACTIONPSDEVIEWID)
    public void setActionPSDEViewId(String actionPSDEViewId){
        this.set(FIELD_ACTIONPSDEVIEWID, actionPSDEViewId);
    }
    
    /**
     * 获取 默认操作视图  
     * @return
     */
    @JsonIgnore
    public String getActionPSDEViewId(){
        Object objValue = this.get(FIELD_ACTIONPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionPSDEViewIdDirty(){
        if(this.contains(FIELD_ACTIONPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认操作视图
     */
    @JsonIgnore
    public void resetActionPSDEViewId(){
        this.reset(FIELD_ACTIONPSDEVIEWID);
    }

    /**
     * 设置 默认操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWID}
     * <P>
     * 等同 {@link #setActionPSDEViewId}
     * @param actionPSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO actionpsdeviewid(String actionPSDEViewId){
        this.setActionPSDEViewId(actionPSDEViewId);
        return this;
    }

    /**
     * 设置 默认操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setActionPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO actionpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setActionPSDEViewId(null);
            this.setActionPSDEViewName(null);
        }
        else{
            this.setActionPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setActionPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>ACTIONPSDEVIEWNAME</B>&nbsp;默认操作视图，指定工作流实体的桌面端默认操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ACTIONPSDEVIEWID}
     */
    public final static String FIELD_ACTIONPSDEVIEWNAME = "actionpsdeviewname";

    /**
     * 设置 默认操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWNAME}
     * 
     * @param actionPSDEViewName
     * 
     */
    @JsonProperty(FIELD_ACTIONPSDEVIEWNAME)
    public void setActionPSDEViewName(String actionPSDEViewName){
        this.set(FIELD_ACTIONPSDEVIEWNAME, actionPSDEViewName);
    }
    
    /**
     * 获取 默认操作视图  
     * @return
     */
    @JsonIgnore
    public String getActionPSDEViewName(){
        Object objValue = this.get(FIELD_ACTIONPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认操作视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionPSDEViewNameDirty(){
        if(this.contains(FIELD_ACTIONPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认操作视图
     */
    @JsonIgnore
    public void resetActionPSDEViewName(){
        this.reset(FIELD_ACTIONPSDEVIEWNAME);
    }

    /**
     * 设置 默认操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setActionPSDEViewName}
     * @param actionPSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO actionpsdeviewname(String actionPSDEViewName){
        this.setActionPSDEViewName(actionPSDEViewName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定工作流实体配置的代码标识，需要在所在的实体中具有唯一性
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
    public PSWFDEDTO codename(String codeName){
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
    public PSWFDEDTO createdate(Timestamp createDate){
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
    public PSWFDEDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;实体默认，指定工作流实体是否为所在实体的默认工作流配置，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 实体默认，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 实体默认  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultMode(){
        Object objValue = this.get(FIELD_DEFAULTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体默认 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultModeDirty(){
        if(this.contains(FIELD_DEFAULTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体默认
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 实体默认，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSWFDEDTO defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 实体默认，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSWFDEDTO defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EDITABLEWFSTEP</B>&nbsp;可编辑流程步骤，指定工作流实体支持编辑的流程步骤清单，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_EDITABLEWFSTEP = "editablewfstep";

    /**
     * 设置 可编辑流程步骤，详细说明：{@link #FIELD_EDITABLEWFSTEP}
     * 
     * @param editableWFStep
     * 
     */
    @JsonProperty(FIELD_EDITABLEWFSTEP)
    public void setEditableWFStep(String editableWFStep){
        this.set(FIELD_EDITABLEWFSTEP, editableWFStep);
    }
    
    /**
     * 获取 可编辑流程步骤  
     * @return
     */
    @JsonIgnore
    public String getEditableWFStep(){
        Object objValue = this.get(FIELD_EDITABLEWFSTEP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 可编辑流程步骤 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditableWFStepDirty(){
        if(this.contains(FIELD_EDITABLEWFSTEP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 可编辑流程步骤
     */
    @JsonIgnore
    public void resetEditableWFStep(){
        this.reset(FIELD_EDITABLEWFSTEP);
    }

    /**
     * 设置 可编辑流程步骤，详细说明：{@link #FIELD_EDITABLEWFSTEP}
     * <P>
     * 等同 {@link #setEditableWFStep}
     * @param editableWFStep
     */
    @JsonIgnore
    public PSWFDEDTO editablewfstep(String editableWFStep){
        this.setEditableWFStep(editableWFStep);
        return this;
    }

    /**
     * <B>EXTCNTSTATES</B>&nbsp;额外计算步骤值，指定工作流实体额外计算步骤值清单，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_EXTCNTSTATES = "extcntstates";

    /**
     * 设置 额外计算步骤值，详细说明：{@link #FIELD_EXTCNTSTATES}
     * 
     * @param extCntStates
     * 
     */
    @JsonProperty(FIELD_EXTCNTSTATES)
    public void setExtCntStates(String extCntStates){
        this.set(FIELD_EXTCNTSTATES, extCntStates);
    }
    
    /**
     * 获取 额外计算步骤值  
     * @return
     */
    @JsonIgnore
    public String getExtCntStates(){
        Object objValue = this.get(FIELD_EXTCNTSTATES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 额外计算步骤值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtCntStatesDirty(){
        if(this.contains(FIELD_EXTCNTSTATES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 额外计算步骤值
     */
    @JsonIgnore
    public void resetExtCntStates(){
        this.reset(FIELD_EXTCNTSTATES);
    }

    /**
     * 设置 额外计算步骤值，详细说明：{@link #FIELD_EXTCNTSTATES}
     * <P>
     * 等同 {@link #setExtCntStates}
     * @param extCntStates
     */
    @JsonIgnore
    public PSWFDEDTO extcntstates(String extCntStates){
        this.setExtCntStates(extCntStates);
        return this;
    }

    /**
     * <B>FINISHPSDEACTIONID</B>&nbsp;完成实体行为，指定工作流实体流程结束时调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_FINISHPSDEACTIONID = "finishpsdeactionid";

    /**
     * 设置 完成实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONID}
     * 
     * @param finishPSDEActionId
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEACTIONID)
    public void setFinishPSDEActionId(String finishPSDEActionId){
        this.set(FIELD_FINISHPSDEACTIONID, finishPSDEActionId);
    }
    
    /**
     * 获取 完成实体行为  
     * @return
     */
    @JsonIgnore
    public String getFinishPSDEActionId(){
        Object objValue = this.get(FIELD_FINISHPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishPSDEActionIdDirty(){
        if(this.contains(FIELD_FINISHPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成实体行为
     */
    @JsonIgnore
    public void resetFinishPSDEActionId(){
        this.reset(FIELD_FINISHPSDEACTIONID);
    }

    /**
     * 设置 完成实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONID}
     * <P>
     * 等同 {@link #setFinishPSDEActionId}
     * @param finishPSDEActionId
     */
    @JsonIgnore
    public PSWFDEDTO finishpsdeactionid(String finishPSDEActionId){
        this.setFinishPSDEActionId(finishPSDEActionId);
        return this;
    }

    /**
     * 设置 完成实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFinishPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO finishpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setFinishPSDEActionId(null);
            this.setFinishPSDEActionName(null);
        }
        else{
            this.setFinishPSDEActionId(pSDEAction.getPSDEActionId());
            this.setFinishPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>FINISHPSDEACTIONNAME</B>&nbsp;完成实体行为，指定工作流实体流程结束时调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FINISHPSDEACTIONID}
     */
    public final static String FIELD_FINISHPSDEACTIONNAME = "finishpsdeactionname";

    /**
     * 设置 完成实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONNAME}
     * 
     * @param finishPSDEActionName
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEACTIONNAME)
    public void setFinishPSDEActionName(String finishPSDEActionName){
        this.set(FIELD_FINISHPSDEACTIONNAME, finishPSDEActionName);
    }
    
    /**
     * 获取 完成实体行为  
     * @return
     */
    @JsonIgnore
    public String getFinishPSDEActionName(){
        Object objValue = this.get(FIELD_FINISHPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishPSDEActionNameDirty(){
        if(this.contains(FIELD_FINISHPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成实体行为
     */
    @JsonIgnore
    public void resetFinishPSDEActionName(){
        this.reset(FIELD_FINISHPSDEACTIONNAME);
    }

    /**
     * 设置 完成实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setFinishPSDEActionName}
     * @param finishPSDEActionName
     */
    @JsonIgnore
    public PSWFDEDTO finishpsdeactionname(String finishPSDEActionName){
        this.setFinishPSDEActionName(finishPSDEActionName);
        return this;
    }

    /**
     * <B>INITPSDEACTIONID</B>&nbsp;初始化实体行为，指定工作流实体流程初始化时调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_INITPSDEACTIONID = "initpsdeactionid";

    /**
     * 设置 初始化实体行为，详细说明：{@link #FIELD_INITPSDEACTIONID}
     * 
     * @param initPSDEActionId
     * 
     */
    @JsonProperty(FIELD_INITPSDEACTIONID)
    public void setInitPSDEActionId(String initPSDEActionId){
        this.set(FIELD_INITPSDEACTIONID, initPSDEActionId);
    }
    
    /**
     * 获取 初始化实体行为  
     * @return
     */
    @JsonIgnore
    public String getInitPSDEActionId(){
        Object objValue = this.get(FIELD_INITPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 初始化实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitPSDEActionIdDirty(){
        if(this.contains(FIELD_INITPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 初始化实体行为
     */
    @JsonIgnore
    public void resetInitPSDEActionId(){
        this.reset(FIELD_INITPSDEACTIONID);
    }

    /**
     * 设置 初始化实体行为，详细说明：{@link #FIELD_INITPSDEACTIONID}
     * <P>
     * 等同 {@link #setInitPSDEActionId}
     * @param initPSDEActionId
     */
    @JsonIgnore
    public PSWFDEDTO initpsdeactionid(String initPSDEActionId){
        this.setInitPSDEActionId(initPSDEActionId);
        return this;
    }

    /**
     * 设置 初始化实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInitPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO initpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setInitPSDEActionId(null);
            this.setInitPSDEActionName(null);
        }
        else{
            this.setInitPSDEActionId(pSDEAction.getPSDEActionId());
            this.setInitPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>INITPSDEACTIONNAME</B>&nbsp;初始化实体行为，指定工作流实体流程初始化时调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INITPSDEACTIONID}
     */
    public final static String FIELD_INITPSDEACTIONNAME = "initpsdeactionname";

    /**
     * 设置 初始化实体行为，详细说明：{@link #FIELD_INITPSDEACTIONNAME}
     * 
     * @param initPSDEActionName
     * 
     */
    @JsonProperty(FIELD_INITPSDEACTIONNAME)
    public void setInitPSDEActionName(String initPSDEActionName){
        this.set(FIELD_INITPSDEACTIONNAME, initPSDEActionName);
    }
    
    /**
     * 获取 初始化实体行为  
     * @return
     */
    @JsonIgnore
    public String getInitPSDEActionName(){
        Object objValue = this.get(FIELD_INITPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 初始化实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitPSDEActionNameDirty(){
        if(this.contains(FIELD_INITPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 初始化实体行为
     */
    @JsonIgnore
    public void resetInitPSDEActionName(){
        this.reset(FIELD_INITPSDEACTIONNAME);
    }

    /**
     * 设置 初始化实体行为，详细说明：{@link #FIELD_INITPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setInitPSDEActionName}
     * @param initPSDEActionName
     */
    @JsonIgnore
    public PSWFDEDTO initpsdeactionname(String initPSDEActionName){
        this.setInitPSDEActionName(initPSDEActionName);
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
    public PSWFDEDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBPROXYDATA2PSDEVIEWID</B>&nbsp;移动端代理数据编辑视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的移动端代理数据编辑视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_MOBPROXYDATA2PSDEVIEWID = "mobproxydata2psdeviewid";

    /**
     * 设置 移动端代理数据编辑视图，详细说明：{@link #FIELD_MOBPROXYDATA2PSDEVIEWID}
     * 
     * @param mobProxyData2PSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBPROXYDATA2PSDEVIEWID)
    public void setMobProxyData2PSDEViewId(String mobProxyData2PSDEViewId){
        this.set(FIELD_MOBPROXYDATA2PSDEVIEWID, mobProxyData2PSDEViewId);
    }
    
    /**
     * 获取 移动端代理数据编辑视图  
     * @return
     */
    @JsonIgnore
    public String getMobProxyData2PSDEViewId(){
        Object objValue = this.get(FIELD_MOBPROXYDATA2PSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端代理数据编辑视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobProxyData2PSDEViewIdDirty(){
        if(this.contains(FIELD_MOBPROXYDATA2PSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端代理数据编辑视图
     */
    @JsonIgnore
    public void resetMobProxyData2PSDEViewId(){
        this.reset(FIELD_MOBPROXYDATA2PSDEVIEWID);
    }

    /**
     * 设置 移动端代理数据编辑视图，详细说明：{@link #FIELD_MOBPROXYDATA2PSDEVIEWID}
     * <P>
     * 等同 {@link #setMobProxyData2PSDEViewId}
     * @param mobProxyData2PSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO mobproxydata2psdeviewid(String mobProxyData2PSDEViewId){
        this.setMobProxyData2PSDEViewId(mobProxyData2PSDEViewId);
        return this;
    }

    /**
     * 设置 移动端代理数据编辑视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobProxyData2PSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO mobproxydata2psdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobProxyData2PSDEViewId(null);
            this.setMobProxyData2PSDEViewName(null);
        }
        else{
            this.setMobProxyData2PSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobProxyData2PSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBPROXYDATA2PSDEVIEWNAME</B>&nbsp;移动端代理数据编辑视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的移动端代理数据编辑视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPROXYDATA2PSDEVIEWID}
     */
    public final static String FIELD_MOBPROXYDATA2PSDEVIEWNAME = "mobproxydata2psdeviewname";

    /**
     * 设置 移动端代理数据编辑视图，详细说明：{@link #FIELD_MOBPROXYDATA2PSDEVIEWNAME}
     * 
     * @param mobProxyData2PSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBPROXYDATA2PSDEVIEWNAME)
    public void setMobProxyData2PSDEViewName(String mobProxyData2PSDEViewName){
        this.set(FIELD_MOBPROXYDATA2PSDEVIEWNAME, mobProxyData2PSDEViewName);
    }
    
    /**
     * 获取 移动端代理数据编辑视图  
     * @return
     */
    @JsonIgnore
    public String getMobProxyData2PSDEViewName(){
        Object objValue = this.get(FIELD_MOBPROXYDATA2PSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端代理数据编辑视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobProxyData2PSDEViewNameDirty(){
        if(this.contains(FIELD_MOBPROXYDATA2PSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端代理数据编辑视图
     */
    @JsonIgnore
    public void resetMobProxyData2PSDEViewName(){
        this.reset(FIELD_MOBPROXYDATA2PSDEVIEWNAME);
    }

    /**
     * 设置 移动端代理数据编辑视图，详细说明：{@link #FIELD_MOBPROXYDATA2PSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobProxyData2PSDEViewName}
     * @param mobProxyData2PSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO mobproxydata2psdeviewname(String mobProxyData2PSDEViewName){
        this.setMobProxyData2PSDEViewName(mobProxyData2PSDEViewName);
        return this;
    }

    /**
     * <B>MOBPROXYDATAPSDEVIEWID</B>&nbsp;移动端代理数据视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的移动端代理数据视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_MOBPROXYDATAPSDEVIEWID = "mobproxydatapsdeviewid";

    /**
     * 设置 移动端代理数据视图，详细说明：{@link #FIELD_MOBPROXYDATAPSDEVIEWID}
     * 
     * @param mobProxyDataPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBPROXYDATAPSDEVIEWID)
    public void setMobProxyDataPSDEViewId(String mobProxyDataPSDEViewId){
        this.set(FIELD_MOBPROXYDATAPSDEVIEWID, mobProxyDataPSDEViewId);
    }
    
    /**
     * 获取 移动端代理数据视图  
     * @return
     */
    @JsonIgnore
    public String getMobProxyDataPSDEViewId(){
        Object objValue = this.get(FIELD_MOBPROXYDATAPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端代理数据视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobProxyDataPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBPROXYDATAPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端代理数据视图
     */
    @JsonIgnore
    public void resetMobProxyDataPSDEViewId(){
        this.reset(FIELD_MOBPROXYDATAPSDEVIEWID);
    }

    /**
     * 设置 移动端代理数据视图，详细说明：{@link #FIELD_MOBPROXYDATAPSDEVIEWID}
     * <P>
     * 等同 {@link #setMobProxyDataPSDEViewId}
     * @param mobProxyDataPSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO mobproxydatapsdeviewid(String mobProxyDataPSDEViewId){
        this.setMobProxyDataPSDEViewId(mobProxyDataPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端代理数据视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobProxyDataPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO mobproxydatapsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobProxyDataPSDEViewId(null);
            this.setMobProxyDataPSDEViewName(null);
        }
        else{
            this.setMobProxyDataPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobProxyDataPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBPROXYDATAPSDEVIEWNAME</B>&nbsp;移动端代理数据视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的移动端代理数据视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPROXYDATAPSDEVIEWID}
     */
    public final static String FIELD_MOBPROXYDATAPSDEVIEWNAME = "mobproxydatapsdeviewname";

    /**
     * 设置 移动端代理数据视图，详细说明：{@link #FIELD_MOBPROXYDATAPSDEVIEWNAME}
     * 
     * @param mobProxyDataPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBPROXYDATAPSDEVIEWNAME)
    public void setMobProxyDataPSDEViewName(String mobProxyDataPSDEViewName){
        this.set(FIELD_MOBPROXYDATAPSDEVIEWNAME, mobProxyDataPSDEViewName);
    }
    
    /**
     * 获取 移动端代理数据视图  
     * @return
     */
    @JsonIgnore
    public String getMobProxyDataPSDEViewName(){
        Object objValue = this.get(FIELD_MOBPROXYDATAPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端代理数据视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobProxyDataPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBPROXYDATAPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端代理数据视图
     */
    @JsonIgnore
    public void resetMobProxyDataPSDEViewName(){
        this.reset(FIELD_MOBPROXYDATAPSDEVIEWNAME);
    }

    /**
     * 设置 移动端代理数据视图，详细说明：{@link #FIELD_MOBPROXYDATAPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobProxyDataPSDEViewName}
     * @param mobProxyDataPSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO mobproxydatapsdeviewname(String mobProxyDataPSDEViewName){
        this.setMobProxyDataPSDEViewName(mobProxyDataPSDEViewName);
        return this;
    }

    /**
     * <B>MYWFDATA</B>&nbsp;流程数据名称，指定工作流实体的我的数据的显示名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MYWFDATA = "mywfdata";

    /**
     * 设置 流程数据名称，详细说明：{@link #FIELD_MYWFDATA}
     * 
     * @param myWFData
     * 
     */
    @JsonProperty(FIELD_MYWFDATA)
    public void setMyWFData(String myWFData){
        this.set(FIELD_MYWFDATA, myWFData);
    }
    
    /**
     * 获取 流程数据名称  
     * @return
     */
    @JsonIgnore
    public String getMyWFData(){
        Object objValue = this.get(FIELD_MYWFDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程数据名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMyWFDataDirty(){
        if(this.contains(FIELD_MYWFDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程数据名称
     */
    @JsonIgnore
    public void resetMyWFData(){
        this.reset(FIELD_MYWFDATA);
    }

    /**
     * 设置 流程数据名称，详细说明：{@link #FIELD_MYWFDATA}
     * <P>
     * 等同 {@link #setMyWFData}
     * @param myWFData
     */
    @JsonIgnore
    public PSWFDEDTO mywfdata(String myWFData){
        this.setMyWFData(myWFData);
        return this;
    }

    /**
     * <B>MYWFDATAPSLANRESID</B>&nbsp;流程数据语言资源，指定工作流实体的我的数据的显示名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_MYWFDATAPSLANRESID = "mywfdatapslanresid";

    /**
     * 设置 流程数据语言资源，详细说明：{@link #FIELD_MYWFDATAPSLANRESID}
     * 
     * @param myWFDataPSLanResId
     * 
     */
    @JsonProperty(FIELD_MYWFDATAPSLANRESID)
    public void setMyWFDataPSLanResId(String myWFDataPSLanResId){
        this.set(FIELD_MYWFDATAPSLANRESID, myWFDataPSLanResId);
    }
    
    /**
     * 获取 流程数据语言资源  
     * @return
     */
    @JsonIgnore
    public String getMyWFDataPSLanResId(){
        Object objValue = this.get(FIELD_MYWFDATAPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程数据语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMyWFDataPSLanResIdDirty(){
        if(this.contains(FIELD_MYWFDATAPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程数据语言资源
     */
    @JsonIgnore
    public void resetMyWFDataPSLanResId(){
        this.reset(FIELD_MYWFDATAPSLANRESID);
    }

    /**
     * 设置 流程数据语言资源，详细说明：{@link #FIELD_MYWFDATAPSLANRESID}
     * <P>
     * 等同 {@link #setMyWFDataPSLanResId}
     * @param myWFDataPSLanResId
     */
    @JsonIgnore
    public PSWFDEDTO mywfdatapslanresid(String myWFDataPSLanResId){
        this.setMyWFDataPSLanResId(myWFDataPSLanResId);
        return this;
    }

    /**
     * 设置 流程数据语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMyWFDataPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO mywfdatapslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setMyWFDataPSLanResId(null);
            this.setMyWFDataPSLanResName(null);
        }
        else{
            this.setMyWFDataPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMyWFDataPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>MYWFDATAPSLANRESNAME</B>&nbsp;流程数据语言资源，指定工作流实体的我的数据的显示名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MYWFDATAPSLANRESID}
     */
    public final static String FIELD_MYWFDATAPSLANRESNAME = "mywfdatapslanresname";

    /**
     * 设置 流程数据语言资源，详细说明：{@link #FIELD_MYWFDATAPSLANRESNAME}
     * 
     * @param myWFDataPSLanResName
     * 
     */
    @JsonProperty(FIELD_MYWFDATAPSLANRESNAME)
    public void setMyWFDataPSLanResName(String myWFDataPSLanResName){
        this.set(FIELD_MYWFDATAPSLANRESNAME, myWFDataPSLanResName);
    }
    
    /**
     * 获取 流程数据语言资源  
     * @return
     */
    @JsonIgnore
    public String getMyWFDataPSLanResName(){
        Object objValue = this.get(FIELD_MYWFDATAPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程数据语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMyWFDataPSLanResNameDirty(){
        if(this.contains(FIELD_MYWFDATAPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程数据语言资源
     */
    @JsonIgnore
    public void resetMyWFDataPSLanResName(){
        this.reset(FIELD_MYWFDATAPSLANRESNAME);
    }

    /**
     * 设置 流程数据语言资源，详细说明：{@link #FIELD_MYWFDATAPSLANRESNAME}
     * <P>
     * 等同 {@link #setMyWFDataPSLanResName}
     * @param myWFDataPSLanResName
     */
    @JsonIgnore
    public PSWFDEDTO mywfdatapslanresname(String myWFDataPSLanResName){
        this.setMyWFDataPSLanResName(myWFDataPSLanResName);
        return this;
    }

    /**
     * <B>MYWFWORK</B>&nbsp;流程工作名称，指定工作流实体的我的工作的显示名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MYWFWORK = "mywfwork";

    /**
     * 设置 流程工作名称，详细说明：{@link #FIELD_MYWFWORK}
     * 
     * @param myWFWork
     * 
     */
    @JsonProperty(FIELD_MYWFWORK)
    public void setMyWFWork(String myWFWork){
        this.set(FIELD_MYWFWORK, myWFWork);
    }
    
    /**
     * 获取 流程工作名称  
     * @return
     */
    @JsonIgnore
    public String getMyWFWork(){
        Object objValue = this.get(FIELD_MYWFWORK);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程工作名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMyWFWorkDirty(){
        if(this.contains(FIELD_MYWFWORK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程工作名称
     */
    @JsonIgnore
    public void resetMyWFWork(){
        this.reset(FIELD_MYWFWORK);
    }

    /**
     * 设置 流程工作名称，详细说明：{@link #FIELD_MYWFWORK}
     * <P>
     * 等同 {@link #setMyWFWork}
     * @param myWFWork
     */
    @JsonIgnore
    public PSWFDEDTO mywfwork(String myWFWork){
        this.setMyWFWork(myWFWork);
        return this;
    }

    /**
     * <B>MYWFWORKPSLANRESID</B>&nbsp;流程工作语言资源，指定工作流实体的我的工作的显示名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_MYWFWORKPSLANRESID = "mywfworkpslanresid";

    /**
     * 设置 流程工作语言资源，详细说明：{@link #FIELD_MYWFWORKPSLANRESID}
     * 
     * @param myWFWorkPSLanResId
     * 
     */
    @JsonProperty(FIELD_MYWFWORKPSLANRESID)
    public void setMyWFWorkPSLanResId(String myWFWorkPSLanResId){
        this.set(FIELD_MYWFWORKPSLANRESID, myWFWorkPSLanResId);
    }
    
    /**
     * 获取 流程工作语言资源  
     * @return
     */
    @JsonIgnore
    public String getMyWFWorkPSLanResId(){
        Object objValue = this.get(FIELD_MYWFWORKPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程工作语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMyWFWorkPSLanResIdDirty(){
        if(this.contains(FIELD_MYWFWORKPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程工作语言资源
     */
    @JsonIgnore
    public void resetMyWFWorkPSLanResId(){
        this.reset(FIELD_MYWFWORKPSLANRESID);
    }

    /**
     * 设置 流程工作语言资源，详细说明：{@link #FIELD_MYWFWORKPSLANRESID}
     * <P>
     * 等同 {@link #setMyWFWorkPSLanResId}
     * @param myWFWorkPSLanResId
     */
    @JsonIgnore
    public PSWFDEDTO mywfworkpslanresid(String myWFWorkPSLanResId){
        this.setMyWFWorkPSLanResId(myWFWorkPSLanResId);
        return this;
    }

    /**
     * 设置 流程工作语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMyWFWorkPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO mywfworkpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setMyWFWorkPSLanResId(null);
            this.setMyWFWorkPSLanResName(null);
        }
        else{
            this.setMyWFWorkPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMyWFWorkPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>MYWFWORKPSLANRESNAME</B>&nbsp;流程工作语言资源，指定工作流实体的我的工作的显示名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MYWFWORKPSLANRESID}
     */
    public final static String FIELD_MYWFWORKPSLANRESNAME = "mywfworkpslanresname";

    /**
     * 设置 流程工作语言资源，详细说明：{@link #FIELD_MYWFWORKPSLANRESNAME}
     * 
     * @param myWFWorkPSLanResName
     * 
     */
    @JsonProperty(FIELD_MYWFWORKPSLANRESNAME)
    public void setMyWFWorkPSLanResName(String myWFWorkPSLanResName){
        this.set(FIELD_MYWFWORKPSLANRESNAME, myWFWorkPSLanResName);
    }
    
    /**
     * 获取 流程工作语言资源  
     * @return
     */
    @JsonIgnore
    public String getMyWFWorkPSLanResName(){
        Object objValue = this.get(FIELD_MYWFWORKPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程工作语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMyWFWorkPSLanResNameDirty(){
        if(this.contains(FIELD_MYWFWORKPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程工作语言资源
     */
    @JsonIgnore
    public void resetMyWFWorkPSLanResName(){
        this.reset(FIELD_MYWFWORKPSLANRESNAME);
    }

    /**
     * 设置 流程工作语言资源，详细说明：{@link #FIELD_MYWFWORKPSLANRESNAME}
     * <P>
     * 等同 {@link #setMyWFWorkPSLanResName}
     * @param myWFWorkPSLanResName
     */
    @JsonIgnore
    public PSWFDEDTO mywfworkpslanresname(String myWFWorkPSLanResName){
        this.setMyWFWorkPSLanResName(myWFWorkPSLanResName);
        return this;
    }

    /**
     * <B>PROXYDATA2PSDEVIEWID</B>&nbsp;代理数据编辑视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的桌面端代理数据编辑视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_PROXYDATA2PSDEVIEWID = "proxydata2psdeviewid";

    /**
     * 设置 代理数据编辑视图，详细说明：{@link #FIELD_PROXYDATA2PSDEVIEWID}
     * 
     * @param proxyData2PSDEViewId
     * 
     */
    @JsonProperty(FIELD_PROXYDATA2PSDEVIEWID)
    public void setProxyData2PSDEViewId(String proxyData2PSDEViewId){
        this.set(FIELD_PROXYDATA2PSDEVIEWID, proxyData2PSDEViewId);
    }
    
    /**
     * 获取 代理数据编辑视图  
     * @return
     */
    @JsonIgnore
    public String getProxyData2PSDEViewId(){
        Object objValue = this.get(FIELD_PROXYDATA2PSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理数据编辑视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyData2PSDEViewIdDirty(){
        if(this.contains(FIELD_PROXYDATA2PSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理数据编辑视图
     */
    @JsonIgnore
    public void resetProxyData2PSDEViewId(){
        this.reset(FIELD_PROXYDATA2PSDEVIEWID);
    }

    /**
     * 设置 代理数据编辑视图，详细说明：{@link #FIELD_PROXYDATA2PSDEVIEWID}
     * <P>
     * 等同 {@link #setProxyData2PSDEViewId}
     * @param proxyData2PSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO proxydata2psdeviewid(String proxyData2PSDEViewId){
        this.setProxyData2PSDEViewId(proxyData2PSDEViewId);
        return this;
    }

    /**
     * 设置 代理数据编辑视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setProxyData2PSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO proxydata2psdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setProxyData2PSDEViewId(null);
            this.setProxyData2PSDEViewName(null);
        }
        else{
            this.setProxyData2PSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setProxyData2PSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PROXYDATA2PSDEVIEWNAME</B>&nbsp;代理数据编辑视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的桌面端代理数据编辑视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PROXYDATA2PSDEVIEWID}
     */
    public final static String FIELD_PROXYDATA2PSDEVIEWNAME = "proxydata2psdeviewname";

    /**
     * 设置 代理数据编辑视图，详细说明：{@link #FIELD_PROXYDATA2PSDEVIEWNAME}
     * 
     * @param proxyData2PSDEViewName
     * 
     */
    @JsonProperty(FIELD_PROXYDATA2PSDEVIEWNAME)
    public void setProxyData2PSDEViewName(String proxyData2PSDEViewName){
        this.set(FIELD_PROXYDATA2PSDEVIEWNAME, proxyData2PSDEViewName);
    }
    
    /**
     * 获取 代理数据编辑视图  
     * @return
     */
    @JsonIgnore
    public String getProxyData2PSDEViewName(){
        Object objValue = this.get(FIELD_PROXYDATA2PSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理数据编辑视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyData2PSDEViewNameDirty(){
        if(this.contains(FIELD_PROXYDATA2PSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理数据编辑视图
     */
    @JsonIgnore
    public void resetProxyData2PSDEViewName(){
        this.reset(FIELD_PROXYDATA2PSDEVIEWNAME);
    }

    /**
     * 设置 代理数据编辑视图，详细说明：{@link #FIELD_PROXYDATA2PSDEVIEWNAME}
     * <P>
     * 等同 {@link #setProxyData2PSDEViewName}
     * @param proxyData2PSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO proxydata2psdeviewname(String proxyData2PSDEViewName){
        this.setProxyData2PSDEViewName(proxyData2PSDEViewName);
        return this;
    }

    /**
     * <B>PROXYDATAPSDEFID</B>&nbsp;代理数据属性，工作流实体流程代理模式为【提供流程代理服务（服务端）】时指定代理数据的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PROXYDATAPSDEFID = "proxydatapsdefid";

    /**
     * 设置 代理数据属性，详细说明：{@link #FIELD_PROXYDATAPSDEFID}
     * 
     * @param proxyDataPSDEFId
     * 
     */
    @JsonProperty(FIELD_PROXYDATAPSDEFID)
    public void setProxyDataPSDEFId(String proxyDataPSDEFId){
        this.set(FIELD_PROXYDATAPSDEFID, proxyDataPSDEFId);
    }
    
    /**
     * 获取 代理数据属性  
     * @return
     */
    @JsonIgnore
    public String getProxyDataPSDEFId(){
        Object objValue = this.get(FIELD_PROXYDATAPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyDataPSDEFIdDirty(){
        if(this.contains(FIELD_PROXYDATAPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理数据属性
     */
    @JsonIgnore
    public void resetProxyDataPSDEFId(){
        this.reset(FIELD_PROXYDATAPSDEFID);
    }

    /**
     * 设置 代理数据属性，详细说明：{@link #FIELD_PROXYDATAPSDEFID}
     * <P>
     * 等同 {@link #setProxyDataPSDEFId}
     * @param proxyDataPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO proxydatapsdefid(String proxyDataPSDEFId){
        this.setProxyDataPSDEFId(proxyDataPSDEFId);
        return this;
    }

    /**
     * 设置 代理数据属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setProxyDataPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO proxydatapsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setProxyDataPSDEFId(null);
            this.setProxyDataPSDEFName(null);
        }
        else{
            this.setProxyDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setProxyDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PROXYDATAPSDEFNAME</B>&nbsp;代理数据属性，工作流实体流程代理模式为【提供流程代理服务（服务端）】时指定代理数据的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PROXYDATAPSDEFID}
     */
    public final static String FIELD_PROXYDATAPSDEFNAME = "proxydatapsdefname";

    /**
     * 设置 代理数据属性，详细说明：{@link #FIELD_PROXYDATAPSDEFNAME}
     * 
     * @param proxyDataPSDEFName
     * 
     */
    @JsonProperty(FIELD_PROXYDATAPSDEFNAME)
    public void setProxyDataPSDEFName(String proxyDataPSDEFName){
        this.set(FIELD_PROXYDATAPSDEFNAME, proxyDataPSDEFName);
    }
    
    /**
     * 获取 代理数据属性  
     * @return
     */
    @JsonIgnore
    public String getProxyDataPSDEFName(){
        Object objValue = this.get(FIELD_PROXYDATAPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyDataPSDEFNameDirty(){
        if(this.contains(FIELD_PROXYDATAPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理数据属性
     */
    @JsonIgnore
    public void resetProxyDataPSDEFName(){
        this.reset(FIELD_PROXYDATAPSDEFNAME);
    }

    /**
     * 设置 代理数据属性，详细说明：{@link #FIELD_PROXYDATAPSDEFNAME}
     * <P>
     * 等同 {@link #setProxyDataPSDEFName}
     * @param proxyDataPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO proxydatapsdefname(String proxyDataPSDEFName){
        this.setProxyDataPSDEFName(proxyDataPSDEFName);
        return this;
    }

    /**
     * <B>PROXYDATAPSDEVIEWID</B>&nbsp;代理数据视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的桌面端代理数据视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_PROXYDATAPSDEVIEWID = "proxydatapsdeviewid";

    /**
     * 设置 代理数据视图，详细说明：{@link #FIELD_PROXYDATAPSDEVIEWID}
     * 
     * @param proxyDataPSDEViewId
     * 
     */
    @JsonProperty(FIELD_PROXYDATAPSDEVIEWID)
    public void setProxyDataPSDEViewId(String proxyDataPSDEViewId){
        this.set(FIELD_PROXYDATAPSDEVIEWID, proxyDataPSDEViewId);
    }
    
    /**
     * 获取 代理数据视图  
     * @return
     */
    @JsonIgnore
    public String getProxyDataPSDEViewId(){
        Object objValue = this.get(FIELD_PROXYDATAPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理数据视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyDataPSDEViewIdDirty(){
        if(this.contains(FIELD_PROXYDATAPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理数据视图
     */
    @JsonIgnore
    public void resetProxyDataPSDEViewId(){
        this.reset(FIELD_PROXYDATAPSDEVIEWID);
    }

    /**
     * 设置 代理数据视图，详细说明：{@link #FIELD_PROXYDATAPSDEVIEWID}
     * <P>
     * 等同 {@link #setProxyDataPSDEViewId}
     * @param proxyDataPSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO proxydatapsdeviewid(String proxyDataPSDEViewId){
        this.setProxyDataPSDEViewId(proxyDataPSDEViewId);
        return this;
    }

    /**
     * 设置 代理数据视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setProxyDataPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO proxydatapsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setProxyDataPSDEViewId(null);
            this.setProxyDataPSDEViewName(null);
        }
        else{
            this.setProxyDataPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setProxyDataPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PROXYDATAPSDEVIEWNAME</B>&nbsp;代理数据视图，工作流实体流程代理模式为【提供流程代理服务（客户端）】时指定工作流实体的桌面端代理数据视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PROXYDATAPSDEVIEWID}
     */
    public final static String FIELD_PROXYDATAPSDEVIEWNAME = "proxydatapsdeviewname";

    /**
     * 设置 代理数据视图，详细说明：{@link #FIELD_PROXYDATAPSDEVIEWNAME}
     * 
     * @param proxyDataPSDEViewName
     * 
     */
    @JsonProperty(FIELD_PROXYDATAPSDEVIEWNAME)
    public void setProxyDataPSDEViewName(String proxyDataPSDEViewName){
        this.set(FIELD_PROXYDATAPSDEVIEWNAME, proxyDataPSDEViewName);
    }
    
    /**
     * 获取 代理数据视图  
     * @return
     */
    @JsonIgnore
    public String getProxyDataPSDEViewName(){
        Object objValue = this.get(FIELD_PROXYDATAPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理数据视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyDataPSDEViewNameDirty(){
        if(this.contains(FIELD_PROXYDATAPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理数据视图
     */
    @JsonIgnore
    public void resetProxyDataPSDEViewName(){
        this.reset(FIELD_PROXYDATAPSDEVIEWNAME);
    }

    /**
     * 设置 代理数据视图，详细说明：{@link #FIELD_PROXYDATAPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setProxyDataPSDEViewName}
     * @param proxyDataPSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO proxydatapsdeviewname(String proxyDataPSDEViewName){
        this.setProxyDataPSDEViewName(proxyDataPSDEViewName);
        return this;
    }

    /**
     * <B>PROXYMODULEPSDEFID</B>&nbsp;代理模块属性，工作流实体流程代理模式为【提供流程代理服务（服务端）】时指定代理模块的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PROXYMODULEPSDEFID = "proxymodulepsdefid";

    /**
     * 设置 代理模块属性，详细说明：{@link #FIELD_PROXYMODULEPSDEFID}
     * 
     * @param proxyModulePSDEFId
     * 
     */
    @JsonProperty(FIELD_PROXYMODULEPSDEFID)
    public void setProxyModulePSDEFId(String proxyModulePSDEFId){
        this.set(FIELD_PROXYMODULEPSDEFID, proxyModulePSDEFId);
    }
    
    /**
     * 获取 代理模块属性  
     * @return
     */
    @JsonIgnore
    public String getProxyModulePSDEFId(){
        Object objValue = this.get(FIELD_PROXYMODULEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理模块属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyModulePSDEFIdDirty(){
        if(this.contains(FIELD_PROXYMODULEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理模块属性
     */
    @JsonIgnore
    public void resetProxyModulePSDEFId(){
        this.reset(FIELD_PROXYMODULEPSDEFID);
    }

    /**
     * 设置 代理模块属性，详细说明：{@link #FIELD_PROXYMODULEPSDEFID}
     * <P>
     * 等同 {@link #setProxyModulePSDEFId}
     * @param proxyModulePSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO proxymodulepsdefid(String proxyModulePSDEFId){
        this.setProxyModulePSDEFId(proxyModulePSDEFId);
        return this;
    }

    /**
     * 设置 代理模块属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setProxyModulePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO proxymodulepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setProxyModulePSDEFId(null);
            this.setProxyModulePSDEFName(null);
        }
        else{
            this.setProxyModulePSDEFId(pSDEField.getPSDEFieldId());
            this.setProxyModulePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PROXYMODULEPSDEFNAME</B>&nbsp;代理模块属性，工作流实体流程代理模式为【提供流程代理服务（服务端）】时指定代理模块的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PROXYMODULEPSDEFID}
     */
    public final static String FIELD_PROXYMODULEPSDEFNAME = "proxymodulepsdefname";

    /**
     * 设置 代理模块属性，详细说明：{@link #FIELD_PROXYMODULEPSDEFNAME}
     * 
     * @param proxyModulePSDEFName
     * 
     */
    @JsonProperty(FIELD_PROXYMODULEPSDEFNAME)
    public void setProxyModulePSDEFName(String proxyModulePSDEFName){
        this.set(FIELD_PROXYMODULEPSDEFNAME, proxyModulePSDEFName);
    }
    
    /**
     * 获取 代理模块属性  
     * @return
     */
    @JsonIgnore
    public String getProxyModulePSDEFName(){
        Object objValue = this.get(FIELD_PROXYMODULEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理模块属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyModulePSDEFNameDirty(){
        if(this.contains(FIELD_PROXYMODULEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理模块属性
     */
    @JsonIgnore
    public void resetProxyModulePSDEFName(){
        this.reset(FIELD_PROXYMODULEPSDEFNAME);
    }

    /**
     * 设置 代理模块属性，详细说明：{@link #FIELD_PROXYMODULEPSDEFNAME}
     * <P>
     * 等同 {@link #setProxyModulePSDEFName}
     * @param proxyModulePSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO proxymodulepsdefname(String proxyModulePSDEFName){
        this.setProxyModulePSDEFName(proxyModulePSDEFName);
        return this;
    }

    /**
     * <B>PROXYWFPSDEFID</B>&nbsp;代理流程属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PROXYWFPSDEFID = "proxywfpsdefid";

    /**
     * 设置 代理流程属性
     * 
     * @param proxyWFPSDEFId
     * 
     */
    @JsonProperty(FIELD_PROXYWFPSDEFID)
    public void setProxyWFPSDEFId(String proxyWFPSDEFId){
        this.set(FIELD_PROXYWFPSDEFID, proxyWFPSDEFId);
    }
    
    /**
     * 获取 代理流程属性  
     * @return
     */
    @JsonIgnore
    public String getProxyWFPSDEFId(){
        Object objValue = this.get(FIELD_PROXYWFPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理流程属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyWFPSDEFIdDirty(){
        if(this.contains(FIELD_PROXYWFPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理流程属性
     */
    @JsonIgnore
    public void resetProxyWFPSDEFId(){
        this.reset(FIELD_PROXYWFPSDEFID);
    }

    /**
     * 设置 代理流程属性
     * <P>
     * 等同 {@link #setProxyWFPSDEFId}
     * @param proxyWFPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO proxywfpsdefid(String proxyWFPSDEFId){
        this.setProxyWFPSDEFId(proxyWFPSDEFId);
        return this;
    }

    /**
     * 设置 代理流程属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setProxyWFPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO proxywfpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setProxyWFPSDEFId(null);
            this.setProxyWFPSDEFName(null);
        }
        else{
            this.setProxyWFPSDEFId(pSDEField.getPSDEFieldId());
            this.setProxyWFPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PROXYWFPSDEFNAME</B>&nbsp;代理流程属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PROXYWFPSDEFID}
     */
    public final static String FIELD_PROXYWFPSDEFNAME = "proxywfpsdefname";

    /**
     * 设置 代理流程属性
     * 
     * @param proxyWFPSDEFName
     * 
     */
    @JsonProperty(FIELD_PROXYWFPSDEFNAME)
    public void setProxyWFPSDEFName(String proxyWFPSDEFName){
        this.set(FIELD_PROXYWFPSDEFNAME, proxyWFPSDEFName);
    }
    
    /**
     * 获取 代理流程属性  
     * @return
     */
    @JsonIgnore
    public String getProxyWFPSDEFName(){
        Object objValue = this.get(FIELD_PROXYWFPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代理流程属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProxyWFPSDEFNameDirty(){
        if(this.contains(FIELD_PROXYWFPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代理流程属性
     */
    @JsonIgnore
    public void resetProxyWFPSDEFName(){
        this.reset(FIELD_PROXYWFPSDEFNAME);
    }

    /**
     * 设置 代理流程属性
     * <P>
     * 等同 {@link #setProxyWFPSDEFName}
     * @param proxyWFPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO proxywfpsdefname(String proxyWFPSDEFName){
        this.setProxyWFPSDEFName(proxyWFPSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定工作流实体相关的实体
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
    public PSWFDEDTO psdeid(String pSDEId){
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
    public PSWFDEDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定工作流实体相关的实体
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
    public PSWFDEDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSWFDEDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSWFDEDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;工作流实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 工作流实体标识
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 工作流实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEId(){
        Object objValue = this.get(FIELD_PSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDEIdDirty(){
        if(this.contains(FIELD_PSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流实体标识
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 工作流实体标识
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSWFDEDTO pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * <B>PSWFDENAME</B>&nbsp;工作流实体名称，指定工作流实体的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWFDENAME = "pswfdename";

    /**
     * 设置 工作流实体名称，详细说明：{@link #FIELD_PSWFDENAME}
     * 
     * @param pSWFDEName
     * 
     */
    @JsonProperty(FIELD_PSWFDENAME)
    public void setPSWFDEName(String pSWFDEName){
        this.set(FIELD_PSWFDENAME, pSWFDEName);
    }
    
    /**
     * 获取 工作流实体名称  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEName(){
        Object objValue = this.get(FIELD_PSWFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流实体名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDENameDirty(){
        if(this.contains(FIELD_PSWFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流实体名称
     */
    @JsonIgnore
    public void resetPSWFDEName(){
        this.reset(FIELD_PSWFDENAME);
    }

    /**
     * 设置 工作流实体名称，详细说明：{@link #FIELD_PSWFDENAME}
     * <P>
     * 等同 {@link #setPSWFDEName}
     * @param pSWFDEName
     */
    @JsonIgnore
    public PSWFDEDTO pswfdename(String pSWFDEName){
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWFDEName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWFDEName(strName);
    }

    @JsonIgnore
    public PSWFDEDTO name(String strName){
        this.setPSWFDEName(strName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;工作流，指定工作流实体相关的工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO} 
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFID}
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 工作流  
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
     * 判断 工作流 是否指定值，包括空值
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
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFID}
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSWFDEDTO pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * 设置 工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO pswfid(PSWorkflowDTO pSWorkflow){
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
     * <B>PSWFNAME</B>&nbsp;工作流，指定工作流实体相关的工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFID}
     */
    public final static String FIELD_PSWFNAME = "pswfname";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFNAME}
     * 
     * @param pSWFName
     * 
     */
    @JsonProperty(FIELD_PSWFNAME)
    public void setPSWFName(String pSWFName){
        this.set(FIELD_PSWFNAME, pSWFName);
    }
    
    /**
     * 获取 工作流  
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
     * 判断 工作流 是否指定值，包括空值
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
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWFName(){
        this.reset(FIELD_PSWFNAME);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWFNAME}
     * <P>
     * 等同 {@link #setPSWFName}
     * @param pSWFName
     */
    @JsonIgnore
    public PSWFDEDTO pswfname(String pSWFName){
        this.setPSWFName(pSWFName);
        return this;
    }

    /**
     * <B>PWFINSTPSDEFID</B>&nbsp;父流程实例属性，指定工作流实体的父流程实例值的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_PWFINSTPSDEFID = "pwfinstpsdefid";

    /**
     * 设置 父流程实例属性，详细说明：{@link #FIELD_PWFINSTPSDEFID}
     * 
     * @param pWFInstPSDEFId
     * 
     */
    @JsonProperty(FIELD_PWFINSTPSDEFID)
    public void setPWFInstPSDEFId(String pWFInstPSDEFId){
        this.set(FIELD_PWFINSTPSDEFID, pWFInstPSDEFId);
    }
    
    /**
     * 获取 父流程实例属性  
     * @return
     */
    @JsonIgnore
    public String getPWFInstPSDEFId(){
        Object objValue = this.get(FIELD_PWFINSTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父流程实例属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPWFInstPSDEFIdDirty(){
        if(this.contains(FIELD_PWFINSTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父流程实例属性
     */
    @JsonIgnore
    public void resetPWFInstPSDEFId(){
        this.reset(FIELD_PWFINSTPSDEFID);
    }

    /**
     * 设置 父流程实例属性，详细说明：{@link #FIELD_PWFINSTPSDEFID}
     * <P>
     * 等同 {@link #setPWFInstPSDEFId}
     * @param pWFInstPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO pwfinstpsdefid(String pWFInstPSDEFId){
        this.setPWFInstPSDEFId(pWFInstPSDEFId);
        return this;
    }

    /**
     * 设置 父流程实例属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPWFInstPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO pwfinstpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setPWFInstPSDEFId(null);
            this.setPWFInstPSDEFName(null);
        }
        else{
            this.setPWFInstPSDEFId(pSDEField.getPSDEFieldId());
            this.setPWFInstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PWFINSTPSDEFNAME</B>&nbsp;父流程实例属性，指定工作流实体的父流程实例值的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PWFINSTPSDEFID}
     */
    public final static String FIELD_PWFINSTPSDEFNAME = "pwfinstpsdefname";

    /**
     * 设置 父流程实例属性，详细说明：{@link #FIELD_PWFINSTPSDEFNAME}
     * 
     * @param pWFInstPSDEFName
     * 
     */
    @JsonProperty(FIELD_PWFINSTPSDEFNAME)
    public void setPWFInstPSDEFName(String pWFInstPSDEFName){
        this.set(FIELD_PWFINSTPSDEFNAME, pWFInstPSDEFName);
    }
    
    /**
     * 获取 父流程实例属性  
     * @return
     */
    @JsonIgnore
    public String getPWFInstPSDEFName(){
        Object objValue = this.get(FIELD_PWFINSTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父流程实例属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPWFInstPSDEFNameDirty(){
        if(this.contains(FIELD_PWFINSTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父流程实例属性
     */
    @JsonIgnore
    public void resetPWFInstPSDEFName(){
        this.reset(FIELD_PWFINSTPSDEFNAME);
    }

    /**
     * 设置 父流程实例属性，详细说明：{@link #FIELD_PWFINSTPSDEFNAME}
     * <P>
     * 等同 {@link #setPWFInstPSDEFName}
     * @param pWFInstPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO pwfinstpsdefname(String pWFInstPSDEFName){
        this.setPWFInstPSDEFName(pWFInstPSDEFName);
        return this;
    }

    /**
     * <B>STARTMOBPSDEVIEWID</B>&nbsp;移动端默认启动视图，指定工作流实体的移动端默认启动视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_STARTMOBPSDEVIEWID = "startmobpsdeviewid";

    /**
     * 设置 移动端默认启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWID}
     * 
     * @param startMobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_STARTMOBPSDEVIEWID)
    public void setStartMobPSDEViewId(String startMobPSDEViewId){
        this.set(FIELD_STARTMOBPSDEVIEWID, startMobPSDEViewId);
    }
    
    /**
     * 获取 移动端默认启动视图  
     * @return
     */
    @JsonIgnore
    public String getStartMobPSDEViewId(){
        Object objValue = this.get(FIELD_STARTMOBPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端默认启动视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartMobPSDEViewIdDirty(){
        if(this.contains(FIELD_STARTMOBPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端默认启动视图
     */
    @JsonIgnore
    public void resetStartMobPSDEViewId(){
        this.reset(FIELD_STARTMOBPSDEVIEWID);
    }

    /**
     * 设置 移动端默认启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWID}
     * <P>
     * 等同 {@link #setStartMobPSDEViewId}
     * @param startMobPSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO startmobpsdeviewid(String startMobPSDEViewId){
        this.setStartMobPSDEViewId(startMobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端默认启动视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStartMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO startmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setStartMobPSDEViewId(null);
            this.setStartMobPSDEViewName(null);
        }
        else{
            this.setStartMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setStartMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>STARTMOBPSDEVIEWNAME</B>&nbsp;移动端默认启动视图，指定工作流实体的移动端默认启动视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STARTMOBPSDEVIEWID}
     */
    public final static String FIELD_STARTMOBPSDEVIEWNAME = "startmobpsdeviewname";

    /**
     * 设置 移动端默认启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWNAME}
     * 
     * @param startMobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_STARTMOBPSDEVIEWNAME)
    public void setStartMobPSDEViewName(String startMobPSDEViewName){
        this.set(FIELD_STARTMOBPSDEVIEWNAME, startMobPSDEViewName);
    }
    
    /**
     * 获取 移动端默认启动视图  
     * @return
     */
    @JsonIgnore
    public String getStartMobPSDEViewName(){
        Object objValue = this.get(FIELD_STARTMOBPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端默认启动视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartMobPSDEViewNameDirty(){
        if(this.contains(FIELD_STARTMOBPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端默认启动视图
     */
    @JsonIgnore
    public void resetStartMobPSDEViewName(){
        this.reset(FIELD_STARTMOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端默认启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setStartMobPSDEViewName}
     * @param startMobPSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO startmobpsdeviewname(String startMobPSDEViewName){
        this.setStartMobPSDEViewName(startMobPSDEViewName);
        return this;
    }

    /**
     * <B>STARTPSDEVIEWID</B>&nbsp;默认启动视图，指定工作流实体的桌面端默认启动视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_STARTPSDEVIEWID = "startpsdeviewid";

    /**
     * 设置 默认启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWID}
     * 
     * @param startPSDEViewId
     * 
     */
    @JsonProperty(FIELD_STARTPSDEVIEWID)
    public void setStartPSDEViewId(String startPSDEViewId){
        this.set(FIELD_STARTPSDEVIEWID, startPSDEViewId);
    }
    
    /**
     * 获取 默认启动视图  
     * @return
     */
    @JsonIgnore
    public String getStartPSDEViewId(){
        Object objValue = this.get(FIELD_STARTPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认启动视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartPSDEViewIdDirty(){
        if(this.contains(FIELD_STARTPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认启动视图
     */
    @JsonIgnore
    public void resetStartPSDEViewId(){
        this.reset(FIELD_STARTPSDEVIEWID);
    }

    /**
     * 设置 默认启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWID}
     * <P>
     * 等同 {@link #setStartPSDEViewId}
     * @param startPSDEViewId
     */
    @JsonIgnore
    public PSWFDEDTO startpsdeviewid(String startPSDEViewId){
        this.setStartPSDEViewId(startPSDEViewId);
        return this;
    }

    /**
     * 设置 默认启动视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStartPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO startpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setStartPSDEViewId(null);
            this.setStartPSDEViewName(null);
        }
        else{
            this.setStartPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setStartPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>STARTPSDEVIEWNAME</B>&nbsp;默认启动视图，指定工作流实体的桌面端默认启动视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STARTPSDEVIEWID}
     */
    public final static String FIELD_STARTPSDEVIEWNAME = "startpsdeviewname";

    /**
     * 设置 默认启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWNAME}
     * 
     * @param startPSDEViewName
     * 
     */
    @JsonProperty(FIELD_STARTPSDEVIEWNAME)
    public void setStartPSDEViewName(String startPSDEViewName){
        this.set(FIELD_STARTPSDEVIEWNAME, startPSDEViewName);
    }
    
    /**
     * 获取 默认启动视图  
     * @return
     */
    @JsonIgnore
    public String getStartPSDEViewName(){
        Object objValue = this.get(FIELD_STARTPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认启动视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartPSDEViewNameDirty(){
        if(this.contains(FIELD_STARTPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认启动视图
     */
    @JsonIgnore
    public void resetStartPSDEViewName(){
        this.reset(FIELD_STARTPSDEVIEWNAME);
    }

    /**
     * 设置 默认启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setStartPSDEViewName}
     * @param startPSDEViewName
     */
    @JsonIgnore
    public PSWFDEDTO startpsdeviewname(String startPSDEViewName){
        this.setStartPSDEViewName(startPSDEViewName);
        return this;
    }

    /**
     * <B>STATEPSDEFID</B>&nbsp;业务状态属性，指定工作流实体的业务状态的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATEPSDEFID = "statepsdefid";

    /**
     * 设置 业务状态属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * 
     * @param statePSDEFId
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFID)
    public void setStatePSDEFId(String statePSDEFId){
        this.set(FIELD_STATEPSDEFID, statePSDEFId);
    }
    
    /**
     * 获取 业务状态属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFId(){
        Object objValue = this.get(FIELD_STATEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务状态属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFIdDirty(){
        if(this.contains(FIELD_STATEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务状态属性
     */
    @JsonIgnore
    public void resetStatePSDEFId(){
        this.reset(FIELD_STATEPSDEFID);
    }

    /**
     * 设置 业务状态属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param statePSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO statepsdefid(String statePSDEFId){
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    /**
     * 设置 业务状态属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO statepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setStatePSDEFId(null);
            this.setStatePSDEFName(null);
        }
        else{
            this.setStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>STATEPSDEFNAME</B>&nbsp;业务状态属性，指定工作流实体的业务状态的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATEPSDEFID}
     */
    public final static String FIELD_STATEPSDEFNAME = "statepsdefname";

    /**
     * 设置 业务状态属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * 
     * @param statePSDEFName
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFNAME)
    public void setStatePSDEFName(String statePSDEFName){
        this.set(FIELD_STATEPSDEFNAME, statePSDEFName);
    }
    
    /**
     * 获取 业务状态属性  
     * @return
     */
    @JsonIgnore
    public String getStatePSDEFName(){
        Object objValue = this.get(FIELD_STATEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务状态属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStatePSDEFNameDirty(){
        if(this.contains(FIELD_STATEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务状态属性
     */
    @JsonIgnore
    public void resetStatePSDEFName(){
        this.reset(FIELD_STATEPSDEFNAME);
    }

    /**
     * 设置 业务状态属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * <P>
     * 等同 {@link #setStatePSDEFName}
     * @param statePSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO statepsdefname(String statePSDEFName){
        this.setStatePSDEFName(statePSDEFName);
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
    public PSWFDEDTO updatedate(Timestamp updateDate){
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
    public PSWFDEDTO updateman(String updateMan){
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
    public PSWFDEDTO usercat(String userCat){
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
    public PSWFDEDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERSTART</B>&nbsp;支持用户启动流程
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERSTART = "userstart";

    /**
     * 设置 支持用户启动流程
     * 
     * @param userStart
     * 
     */
    @JsonProperty(FIELD_USERSTART)
    public void setUserStart(Integer userStart){
        this.set(FIELD_USERSTART, userStart);
    }
    
    /**
     * 获取 支持用户启动流程  
     * @return
     */
    @JsonIgnore
    public Integer getUserStart(){
        Object objValue = this.get(FIELD_USERSTART);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持用户启动流程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserStartDirty(){
        if(this.contains(FIELD_USERSTART)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持用户启动流程
     */
    @JsonIgnore
    public void resetUserStart(){
        this.reset(FIELD_USERSTART);
    }

    /**
     * 设置 支持用户启动流程
     * <P>
     * 等同 {@link #setUserStart}
     * @param userStart
     */
    @JsonIgnore
    public PSWFDEDTO userstart(Integer userStart){
        this.setUserStart(userStart);
        return this;
    }

     /**
     * 设置 支持用户启动流程
     * <P>
     * 等同 {@link #setUserStart}
     * @param userStart
     */
    @JsonIgnore
    public PSWFDEDTO userstart(Boolean userStart){
        if(userStart == null){
            this.setUserStart(null);
        }
        else{
            this.setUserStart(userStart?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSWFDEDTO usertag(String userTag){
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
    public PSWFDEDTO usertag2(String userTag2){
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
    public PSWFDEDTO usertag3(String userTag3){
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
    public PSWFDEDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VALIDFLAG = "validflag";

    /**
     * 设置 启用
     * 
     * @param validFlag
     * 
     */
    @JsonProperty(FIELD_VALIDFLAG)
    public void setValidFlag(Integer validFlag){
        this.set(FIELD_VALIDFLAG, validFlag);
    }
    
    /**
     * 获取 启用  
     * @return
     */
    @JsonIgnore
    public Integer getValidFlag(){
        Object objValue = this.get(FIELD_VALIDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValidFlagDirty(){
        if(this.contains(FIELD_VALIDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用
     */
    @JsonIgnore
    public void resetValidFlag(){
        this.reset(FIELD_VALIDFLAG);
    }

    /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSWFDEDTO validflag(Integer validFlag){
        this.setValidFlag(validFlag);
        return this;
    }

     /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSWFDEDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WFACTORPSDEFID</B>&nbsp;流程操作者属性，指定工作流实体的流程操作者的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFACTORPSDEFID = "wfactorpsdefid";

    /**
     * 设置 流程操作者属性，详细说明：{@link #FIELD_WFACTORPSDEFID}
     * 
     * @param wFActorPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFACTORPSDEFID)
    public void setWFActorPSDEFId(String wFActorPSDEFId){
        this.set(FIELD_WFACTORPSDEFID, wFActorPSDEFId);
    }
    
    /**
     * 获取 流程操作者属性  
     * @return
     */
    @JsonIgnore
    public String getWFActorPSDEFId(){
        Object objValue = this.get(FIELD_WFACTORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程操作者属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFActorPSDEFIdDirty(){
        if(this.contains(FIELD_WFACTORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程操作者属性
     */
    @JsonIgnore
    public void resetWFActorPSDEFId(){
        this.reset(FIELD_WFACTORPSDEFID);
    }

    /**
     * 设置 流程操作者属性，详细说明：{@link #FIELD_WFACTORPSDEFID}
     * <P>
     * 等同 {@link #setWFActorPSDEFId}
     * @param wFActorPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfactorpsdefid(String wFActorPSDEFId){
        this.setWFActorPSDEFId(wFActorPSDEFId);
        return this;
    }

    /**
     * 设置 流程操作者属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFActorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfactorpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFActorPSDEFId(null);
            this.setWFActorPSDEFName(null);
        }
        else{
            this.setWFActorPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFActorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFACTORPSDEFNAME</B>&nbsp;流程操作者属性，指定工作流实体的流程操作者的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFACTORPSDEFID}
     */
    public final static String FIELD_WFACTORPSDEFNAME = "wfactorpsdefname";

    /**
     * 设置 流程操作者属性，详细说明：{@link #FIELD_WFACTORPSDEFNAME}
     * 
     * @param wFActorPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFACTORPSDEFNAME)
    public void setWFActorPSDEFName(String wFActorPSDEFName){
        this.set(FIELD_WFACTORPSDEFNAME, wFActorPSDEFName);
    }
    
    /**
     * 获取 流程操作者属性  
     * @return
     */
    @JsonIgnore
    public String getWFActorPSDEFName(){
        Object objValue = this.get(FIELD_WFACTORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程操作者属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFActorPSDEFNameDirty(){
        if(this.contains(FIELD_WFACTORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程操作者属性
     */
    @JsonIgnore
    public void resetWFActorPSDEFName(){
        this.reset(FIELD_WFACTORPSDEFNAME);
    }

    /**
     * 设置 流程操作者属性，详细说明：{@link #FIELD_WFACTORPSDEFNAME}
     * <P>
     * 等同 {@link #setWFActorPSDEFName}
     * @param wFActorPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfactorpsdefname(String wFActorPSDEFName){
        this.setWFActorPSDEFName(wFActorPSDEFName);
        return this;
    }

    /**
     * <B>WFIDPSDEFID</B>&nbsp;流程标识属性，指定工作流实体的流程标识的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFIDPSDEFID = "wfidpsdefid";

    /**
     * 设置 流程标识属性，详细说明：{@link #FIELD_WFIDPSDEFID}
     * 
     * @param wFIdPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFIDPSDEFID)
    public void setWFIdPSDEFId(String wFIdPSDEFId){
        this.set(FIELD_WFIDPSDEFID, wFIdPSDEFId);
    }
    
    /**
     * 获取 流程标识属性  
     * @return
     */
    @JsonIgnore
    public String getWFIdPSDEFId(){
        Object objValue = this.get(FIELD_WFIDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFIdPSDEFIdDirty(){
        if(this.contains(FIELD_WFIDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标识属性
     */
    @JsonIgnore
    public void resetWFIdPSDEFId(){
        this.reset(FIELD_WFIDPSDEFID);
    }

    /**
     * 设置 流程标识属性，详细说明：{@link #FIELD_WFIDPSDEFID}
     * <P>
     * 等同 {@link #setWFIdPSDEFId}
     * @param wFIdPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfidpsdefid(String wFIdPSDEFId){
        this.setWFIdPSDEFId(wFIdPSDEFId);
        return this;
    }

    /**
     * 设置 流程标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFIdPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfidpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFIdPSDEFId(null);
            this.setWFIdPSDEFName(null);
        }
        else{
            this.setWFIdPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFIdPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFIDPSDEFNAME</B>&nbsp;流程标识属性，指定工作流实体的流程标识的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFIDPSDEFID}
     */
    public final static String FIELD_WFIDPSDEFNAME = "wfidpsdefname";

    /**
     * 设置 流程标识属性，详细说明：{@link #FIELD_WFIDPSDEFNAME}
     * 
     * @param wFIdPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFIDPSDEFNAME)
    public void setWFIdPSDEFName(String wFIdPSDEFName){
        this.set(FIELD_WFIDPSDEFNAME, wFIdPSDEFName);
    }
    
    /**
     * 获取 流程标识属性  
     * @return
     */
    @JsonIgnore
    public String getWFIdPSDEFName(){
        Object objValue = this.get(FIELD_WFIDPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFIdPSDEFNameDirty(){
        if(this.contains(FIELD_WFIDPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标识属性
     */
    @JsonIgnore
    public void resetWFIdPSDEFName(){
        this.reset(FIELD_WFIDPSDEFNAME);
    }

    /**
     * 设置 流程标识属性，详细说明：{@link #FIELD_WFIDPSDEFNAME}
     * <P>
     * 等同 {@link #setWFIdPSDEFName}
     * @param wFIdPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfidpsdefname(String wFIdPSDEFName){
        this.setWFIdPSDEFName(wFIdPSDEFName);
        return this;
    }

    /**
     * <B>WFINSTPSDEFID</B>&nbsp;流程实例属性，指定工作流实体的流程实例的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFINSTPSDEFID = "wfinstpsdefid";

    /**
     * 设置 流程实例属性，详细说明：{@link #FIELD_WFINSTPSDEFID}
     * 
     * @param wFInstPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFINSTPSDEFID)
    public void setWFInstPSDEFId(String wFInstPSDEFId){
        this.set(FIELD_WFINSTPSDEFID, wFInstPSDEFId);
    }
    
    /**
     * 获取 流程实例属性  
     * @return
     */
    @JsonIgnore
    public String getWFInstPSDEFId(){
        Object objValue = this.get(FIELD_WFINSTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程实例属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFInstPSDEFIdDirty(){
        if(this.contains(FIELD_WFINSTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程实例属性
     */
    @JsonIgnore
    public void resetWFInstPSDEFId(){
        this.reset(FIELD_WFINSTPSDEFID);
    }

    /**
     * 设置 流程实例属性，详细说明：{@link #FIELD_WFINSTPSDEFID}
     * <P>
     * 等同 {@link #setWFInstPSDEFId}
     * @param wFInstPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfinstpsdefid(String wFInstPSDEFId){
        this.setWFInstPSDEFId(wFInstPSDEFId);
        return this;
    }

    /**
     * 设置 流程实例属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFInstPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfinstpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFInstPSDEFId(null);
            this.setWFInstPSDEFName(null);
        }
        else{
            this.setWFInstPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFInstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFINSTPSDEFNAME</B>&nbsp;流程实例属性，指定工作流实体的流程实例的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFINSTPSDEFID}
     */
    public final static String FIELD_WFINSTPSDEFNAME = "wfinstpsdefname";

    /**
     * 设置 流程实例属性，详细说明：{@link #FIELD_WFINSTPSDEFNAME}
     * 
     * @param wFInstPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFINSTPSDEFNAME)
    public void setWFInstPSDEFName(String wFInstPSDEFName){
        this.set(FIELD_WFINSTPSDEFNAME, wFInstPSDEFName);
    }
    
    /**
     * 获取 流程实例属性  
     * @return
     */
    @JsonIgnore
    public String getWFInstPSDEFName(){
        Object objValue = this.get(FIELD_WFINSTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程实例属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFInstPSDEFNameDirty(){
        if(this.contains(FIELD_WFINSTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程实例属性
     */
    @JsonIgnore
    public void resetWFInstPSDEFName(){
        this.reset(FIELD_WFINSTPSDEFNAME);
    }

    /**
     * 设置 流程实例属性，详细说明：{@link #FIELD_WFINSTPSDEFNAME}
     * <P>
     * 等同 {@link #setWFInstPSDEFName}
     * @param wFInstPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfinstpsdefname(String wFInstPSDEFName){
        this.setWFInstPSDEFName(wFInstPSDEFName);
        return this;
    }

    /**
     * <B>WFMODE</B>&nbsp;流程模式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFMODE = "wfmode";

    /**
     * 设置 流程模式
     * 
     * @param wFMode
     * 
     */
    @JsonProperty(FIELD_WFMODE)
    public void setWFMode(String wFMode){
        this.set(FIELD_WFMODE, wFMode);
    }
    
    /**
     * 获取 流程模式  
     * @return
     */
    @JsonIgnore
    public String getWFMode(){
        Object objValue = this.get(FIELD_WFMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFModeDirty(){
        if(this.contains(FIELD_WFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程模式
     */
    @JsonIgnore
    public void resetWFMode(){
        this.reset(FIELD_WFMODE);
    }

    /**
     * 设置 流程模式
     * <P>
     * 等同 {@link #setWFMode}
     * @param wFMode
     */
    @JsonIgnore
    public PSWFDEDTO wfmode(String wFMode){
        this.setWFMode(wFMode);
        return this;
    }

    /**
     * <B>WFPROXYMODE</B>&nbsp;流程代理模式，指定工作流实体的流程代理模式，未定义时为【（不使用）】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WFProxyMode} 
     */
    public final static String FIELD_WFPROXYMODE = "wfproxymode";

    /**
     * 设置 流程代理模式，详细说明：{@link #FIELD_WFPROXYMODE}
     * 
     * @param wFProxyMode
     * 
     */
    @JsonProperty(FIELD_WFPROXYMODE)
    public void setWFProxyMode(Integer wFProxyMode){
        this.set(FIELD_WFPROXYMODE, wFProxyMode);
    }
    
    /**
     * 获取 流程代理模式  
     * @return
     */
    @JsonIgnore
    public Integer getWFProxyMode(){
        Object objValue = this.get(FIELD_WFPROXYMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 流程代理模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFProxyModeDirty(){
        if(this.contains(FIELD_WFPROXYMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程代理模式
     */
    @JsonIgnore
    public void resetWFProxyMode(){
        this.reset(FIELD_WFPROXYMODE);
    }

    /**
     * 设置 流程代理模式，详细说明：{@link #FIELD_WFPROXYMODE}
     * <P>
     * 等同 {@link #setWFProxyMode}
     * @param wFProxyMode
     */
    @JsonIgnore
    public PSWFDEDTO wfproxymode(Integer wFProxyMode){
        this.setWFProxyMode(wFProxyMode);
        return this;
    }

     /**
     * 设置 流程代理模式，详细说明：{@link #FIELD_WFPROXYMODE}
     * <P>
     * 等同 {@link #setWFProxyMode}
     * @param wFProxyMode
     */
    @JsonIgnore
    public PSWFDEDTO wfproxymode(net.ibizsys.model.PSModelEnums.WFProxyMode wFProxyMode){
        if(wFProxyMode == null){
            this.setWFProxyMode(null);
        }
        else{
            this.setWFProxyMode(wFProxyMode.value);
        }
        return this;
    }

    /**
     * <B>WFRETPSDEFID</B>&nbsp;流程结果属性，指定工作流实体的流程结果的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFRETPSDEFID = "wfretpsdefid";

    /**
     * 设置 流程结果属性，详细说明：{@link #FIELD_WFRETPSDEFID}
     * 
     * @param wFRetPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFRETPSDEFID)
    public void setWFRetPSDEFId(String wFRetPSDEFId){
        this.set(FIELD_WFRETPSDEFID, wFRetPSDEFId);
    }
    
    /**
     * 获取 流程结果属性  
     * @return
     */
    @JsonIgnore
    public String getWFRetPSDEFId(){
        Object objValue = this.get(FIELD_WFRETPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程结果属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFRetPSDEFIdDirty(){
        if(this.contains(FIELD_WFRETPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程结果属性
     */
    @JsonIgnore
    public void resetWFRetPSDEFId(){
        this.reset(FIELD_WFRETPSDEFID);
    }

    /**
     * 设置 流程结果属性，详细说明：{@link #FIELD_WFRETPSDEFID}
     * <P>
     * 等同 {@link #setWFRetPSDEFId}
     * @param wFRetPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfretpsdefid(String wFRetPSDEFId){
        this.setWFRetPSDEFId(wFRetPSDEFId);
        return this;
    }

    /**
     * 设置 流程结果属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFRetPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfretpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFRetPSDEFId(null);
            this.setWFRetPSDEFName(null);
        }
        else{
            this.setWFRetPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFRetPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFRETPSDEFNAME</B>&nbsp;流程结果属性，指定工作流实体的流程结果的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFRETPSDEFID}
     */
    public final static String FIELD_WFRETPSDEFNAME = "wfretpsdefname";

    /**
     * 设置 流程结果属性，详细说明：{@link #FIELD_WFRETPSDEFNAME}
     * 
     * @param wFRetPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFRETPSDEFNAME)
    public void setWFRetPSDEFName(String wFRetPSDEFName){
        this.set(FIELD_WFRETPSDEFNAME, wFRetPSDEFName);
    }
    
    /**
     * 获取 流程结果属性  
     * @return
     */
    @JsonIgnore
    public String getWFRetPSDEFName(){
        Object objValue = this.get(FIELD_WFRETPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程结果属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFRetPSDEFNameDirty(){
        if(this.contains(FIELD_WFRETPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程结果属性
     */
    @JsonIgnore
    public void resetWFRetPSDEFName(){
        this.reset(FIELD_WFRETPSDEFNAME);
    }

    /**
     * 设置 流程结果属性，详细说明：{@link #FIELD_WFRETPSDEFNAME}
     * <P>
     * 等同 {@link #setWFRetPSDEFName}
     * @param wFRetPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfretpsdefname(String wFRetPSDEFName){
        this.setWFRetPSDEFName(wFRetPSDEFName);
        return this;
    }

    /**
     * <B>WFSTATEPSDEFID</B>&nbsp;流程状态属性，指定工作流实体的流程状态的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFSTATEPSDEFID = "wfstatepsdefid";

    /**
     * 设置 流程状态属性，详细说明：{@link #FIELD_WFSTATEPSDEFID}
     * 
     * @param wFStatePSDEFId
     * 
     */
    @JsonProperty(FIELD_WFSTATEPSDEFID)
    public void setWFStatePSDEFId(String wFStatePSDEFId){
        this.set(FIELD_WFSTATEPSDEFID, wFStatePSDEFId);
    }
    
    /**
     * 获取 流程状态属性  
     * @return
     */
    @JsonIgnore
    public String getWFStatePSDEFId(){
        Object objValue = this.get(FIELD_WFSTATEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程状态属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStatePSDEFIdDirty(){
        if(this.contains(FIELD_WFSTATEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程状态属性
     */
    @JsonIgnore
    public void resetWFStatePSDEFId(){
        this.reset(FIELD_WFSTATEPSDEFID);
    }

    /**
     * 设置 流程状态属性，详细说明：{@link #FIELD_WFSTATEPSDEFID}
     * <P>
     * 等同 {@link #setWFStatePSDEFId}
     * @param wFStatePSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfstatepsdefid(String wFStatePSDEFId){
        this.setWFStatePSDEFId(wFStatePSDEFId);
        return this;
    }

    /**
     * 设置 流程状态属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFStatePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfstatepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFStatePSDEFId(null);
            this.setWFStatePSDEFName(null);
        }
        else{
            this.setWFStatePSDEFId(pSDEField.getPSDEFieldId());
            this.setWFStatePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFSTATEPSDEFNAME</B>&nbsp;流程状态属性，指定工作流实体的流程状态的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFSTATEPSDEFID}
     */
    public final static String FIELD_WFSTATEPSDEFNAME = "wfstatepsdefname";

    /**
     * 设置 流程状态属性，详细说明：{@link #FIELD_WFSTATEPSDEFNAME}
     * 
     * @param wFStatePSDEFName
     * 
     */
    @JsonProperty(FIELD_WFSTATEPSDEFNAME)
    public void setWFStatePSDEFName(String wFStatePSDEFName){
        this.set(FIELD_WFSTATEPSDEFNAME, wFStatePSDEFName);
    }
    
    /**
     * 获取 流程状态属性  
     * @return
     */
    @JsonIgnore
    public String getWFStatePSDEFName(){
        Object objValue = this.get(FIELD_WFSTATEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程状态属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStatePSDEFNameDirty(){
        if(this.contains(FIELD_WFSTATEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程状态属性
     */
    @JsonIgnore
    public void resetWFStatePSDEFName(){
        this.reset(FIELD_WFSTATEPSDEFNAME);
    }

    /**
     * 设置 流程状态属性，详细说明：{@link #FIELD_WFSTATEPSDEFNAME}
     * <P>
     * 等同 {@link #setWFStatePSDEFName}
     * @param wFStatePSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfstatepsdefname(String wFStatePSDEFName){
        this.setWFStatePSDEFName(wFStatePSDEFName);
        return this;
    }

    /**
     * <B>WFSTEPPSDEFID</B>&nbsp;流程步骤属性，指定工作流实体的流程步骤的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFSTEPPSDEFID = "wfsteppsdefid";

    /**
     * 设置 流程步骤属性，详细说明：{@link #FIELD_WFSTEPPSDEFID}
     * 
     * @param wFStepPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFSTEPPSDEFID)
    public void setWFStepPSDEFId(String wFStepPSDEFId){
        this.set(FIELD_WFSTEPPSDEFID, wFStepPSDEFId);
    }
    
    /**
     * 获取 流程步骤属性  
     * @return
     */
    @JsonIgnore
    public String getWFStepPSDEFId(){
        Object objValue = this.get(FIELD_WFSTEPPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepPSDEFIdDirty(){
        if(this.contains(FIELD_WFSTEPPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤属性
     */
    @JsonIgnore
    public void resetWFStepPSDEFId(){
        this.reset(FIELD_WFSTEPPSDEFID);
    }

    /**
     * 设置 流程步骤属性，详细说明：{@link #FIELD_WFSTEPPSDEFID}
     * <P>
     * 等同 {@link #setWFStepPSDEFId}
     * @param wFStepPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfsteppsdefid(String wFStepPSDEFId){
        this.setWFStepPSDEFId(wFStepPSDEFId);
        return this;
    }

    /**
     * 设置 流程步骤属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFStepPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfsteppsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFStepPSDEFId(null);
            this.setWFStepPSDEFName(null);
        }
        else{
            this.setWFStepPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFStepPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFSTEPPSDEFNAME</B>&nbsp;流程步骤属性，指定工作流实体的流程步骤的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFSTEPPSDEFID}
     */
    public final static String FIELD_WFSTEPPSDEFNAME = "wfsteppsdefname";

    /**
     * 设置 流程步骤属性，详细说明：{@link #FIELD_WFSTEPPSDEFNAME}
     * 
     * @param wFStepPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFSTEPPSDEFNAME)
    public void setWFStepPSDEFName(String wFStepPSDEFName){
        this.set(FIELD_WFSTEPPSDEFNAME, wFStepPSDEFName);
    }
    
    /**
     * 获取 流程步骤属性  
     * @return
     */
    @JsonIgnore
    public String getWFStepPSDEFName(){
        Object objValue = this.get(FIELD_WFSTEPPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepPSDEFNameDirty(){
        if(this.contains(FIELD_WFSTEPPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤属性
     */
    @JsonIgnore
    public void resetWFStepPSDEFName(){
        this.reset(FIELD_WFSTEPPSDEFNAME);
    }

    /**
     * 设置 流程步骤属性，详细说明：{@link #FIELD_WFSTEPPSDEFNAME}
     * <P>
     * 等同 {@link #setWFStepPSDEFName}
     * @param wFStepPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfsteppsdefname(String wFStepPSDEFName){
        this.setWFStepPSDEFName(wFStepPSDEFName);
        return this;
    }

    /**
     * <B>WFVERPSDEFID</B>&nbsp;流程版本属性，指定工作流实体的流程版本的存储属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_WFVERPSDEFID = "wfverpsdefid";

    /**
     * 设置 流程版本属性，详细说明：{@link #FIELD_WFVERPSDEFID}
     * 
     * @param wFVerPSDEFId
     * 
     */
    @JsonProperty(FIELD_WFVERPSDEFID)
    public void setWFVerPSDEFId(String wFVerPSDEFId){
        this.set(FIELD_WFVERPSDEFID, wFVerPSDEFId);
    }
    
    /**
     * 获取 流程版本属性  
     * @return
     */
    @JsonIgnore
    public String getWFVerPSDEFId(){
        Object objValue = this.get(FIELD_WFVERPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程版本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFVerPSDEFIdDirty(){
        if(this.contains(FIELD_WFVERPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程版本属性
     */
    @JsonIgnore
    public void resetWFVerPSDEFId(){
        this.reset(FIELD_WFVERPSDEFID);
    }

    /**
     * 设置 流程版本属性，详细说明：{@link #FIELD_WFVERPSDEFID}
     * <P>
     * 等同 {@link #setWFVerPSDEFId}
     * @param wFVerPSDEFId
     */
    @JsonIgnore
    public PSWFDEDTO wfverpsdefid(String wFVerPSDEFId){
        this.setWFVerPSDEFId(wFVerPSDEFId);
        return this;
    }

    /**
     * 设置 流程版本属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFVerPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSWFDEDTO wfverpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setWFVerPSDEFId(null);
            this.setWFVerPSDEFName(null);
        }
        else{
            this.setWFVerPSDEFId(pSDEField.getPSDEFieldId());
            this.setWFVerPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>WFVERPSDEFNAME</B>&nbsp;流程版本属性，指定工作流实体的流程版本的存储属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFVERPSDEFID}
     */
    public final static String FIELD_WFVERPSDEFNAME = "wfverpsdefname";

    /**
     * 设置 流程版本属性，详细说明：{@link #FIELD_WFVERPSDEFNAME}
     * 
     * @param wFVerPSDEFName
     * 
     */
    @JsonProperty(FIELD_WFVERPSDEFNAME)
    public void setWFVerPSDEFName(String wFVerPSDEFName){
        this.set(FIELD_WFVERPSDEFNAME, wFVerPSDEFName);
    }
    
    /**
     * 获取 流程版本属性  
     * @return
     */
    @JsonIgnore
    public String getWFVerPSDEFName(){
        Object objValue = this.get(FIELD_WFVERPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程版本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFVerPSDEFNameDirty(){
        if(this.contains(FIELD_WFVERPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程版本属性
     */
    @JsonIgnore
    public void resetWFVerPSDEFName(){
        this.reset(FIELD_WFVERPSDEFNAME);
    }

    /**
     * 设置 流程版本属性，详细说明：{@link #FIELD_WFVERPSDEFNAME}
     * <P>
     * 等同 {@link #setWFVerPSDEFName}
     * @param wFVerPSDEFName
     */
    @JsonIgnore
    public PSWFDEDTO wfverpsdefname(String wFVerPSDEFName){
        this.setWFVerPSDEFName(wFVerPSDEFName);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSWFDEId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWFDEId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWFDEId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWFDEId(strValue);
    }

    @JsonIgnore
    public PSWFDEDTO id(String strValue){
        this.setPSWFDEId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWFDEDTO){
            PSWFDEDTO dto = (PSWFDEDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
