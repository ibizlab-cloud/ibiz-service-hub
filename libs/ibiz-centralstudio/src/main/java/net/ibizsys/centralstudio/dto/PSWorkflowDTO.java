package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWORKFLOW</B>系统工作流 模型传输对象
 * <P>
 * 系统工作流模型，定义系统运行的工作流，包括了状态、步骤代码表、相关的操作视图等信息
 */
public class PSWorkflowDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSWorkflowDTO(){
    }      

    /**
     * <B>ACTIONMOBPSDEVIEWID</B>&nbsp;移动端操作视图，指定工作流默认的移动端流程操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_ACTIONMOBPSDEVIEWID = "actionmobpsdeviewid";

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWID}
     * 
     * @param actionMobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_ACTIONMOBPSDEVIEWID)
    public void setActionMobPSDEViewId(String actionMobPSDEViewId){
        this.set(FIELD_ACTIONMOBPSDEVIEWID, actionMobPSDEViewId);
    }
    
    /**
     * 获取 移动端操作视图  
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
     * 判断 移动端操作视图 是否指定值，包括空值
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
     * 重置 移动端操作视图
     */
    @JsonIgnore
    public void resetActionMobPSDEViewId(){
        this.reset(FIELD_ACTIONMOBPSDEVIEWID);
    }

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWID}
     * <P>
     * 等同 {@link #setActionMobPSDEViewId}
     * @param actionMobPSDEViewId
     */
    @JsonIgnore
    public PSWorkflowDTO actionmobpsdeviewid(String actionMobPSDEViewId){
        this.setActionMobPSDEViewId(actionMobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setActionMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO actionmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>ACTIONMOBPSDEVIEWNAME</B>&nbsp;移动端操作视图，指定工作流默认的移动端流程操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ACTIONMOBPSDEVIEWID}
     */
    public final static String FIELD_ACTIONMOBPSDEVIEWNAME = "actionmobpsdeviewname";

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWNAME}
     * 
     * @param actionMobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_ACTIONMOBPSDEVIEWNAME)
    public void setActionMobPSDEViewName(String actionMobPSDEViewName){
        this.set(FIELD_ACTIONMOBPSDEVIEWNAME, actionMobPSDEViewName);
    }
    
    /**
     * 获取 移动端操作视图  
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
     * 判断 移动端操作视图 是否指定值，包括空值
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
     * 重置 移动端操作视图
     */
    @JsonIgnore
    public void resetActionMobPSDEViewName(){
        this.reset(FIELD_ACTIONMOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端操作视图，详细说明：{@link #FIELD_ACTIONMOBPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setActionMobPSDEViewName}
     * @param actionMobPSDEViewName
     */
    @JsonIgnore
    public PSWorkflowDTO actionmobpsdeviewname(String actionMobPSDEViewName){
        this.setActionMobPSDEViewName(actionMobPSDEViewName);
        return this;
    }

    /**
     * <B>ACTIONPSDEVIEWID</B>&nbsp;操作视图，指定工作流默认的桌面端流程操作视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_ACTIONPSDEVIEWID = "actionpsdeviewid";

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWID}
     * 
     * @param actionPSDEViewId
     * 
     */
    @JsonProperty(FIELD_ACTIONPSDEVIEWID)
    public void setActionPSDEViewId(String actionPSDEViewId){
        this.set(FIELD_ACTIONPSDEVIEWID, actionPSDEViewId);
    }
    
    /**
     * 获取 操作视图  
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
     * 判断 操作视图 是否指定值，包括空值
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
     * 重置 操作视图
     */
    @JsonIgnore
    public void resetActionPSDEViewId(){
        this.reset(FIELD_ACTIONPSDEVIEWID);
    }

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWID}
     * <P>
     * 等同 {@link #setActionPSDEViewId}
     * @param actionPSDEViewId
     */
    @JsonIgnore
    public PSWorkflowDTO actionpsdeviewid(String actionPSDEViewId){
        this.setActionPSDEViewId(actionPSDEViewId);
        return this;
    }

    /**
     * 设置 操作视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setActionPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO actionpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>ACTIONPSDEVIEWNAME</B>&nbsp;操作视图，指定工作流默认的桌面端流程操作视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ACTIONPSDEVIEWID}
     */
    public final static String FIELD_ACTIONPSDEVIEWNAME = "actionpsdeviewname";

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWNAME}
     * 
     * @param actionPSDEViewName
     * 
     */
    @JsonProperty(FIELD_ACTIONPSDEVIEWNAME)
    public void setActionPSDEViewName(String actionPSDEViewName){
        this.set(FIELD_ACTIONPSDEVIEWNAME, actionPSDEViewName);
    }
    
    /**
     * 获取 操作视图  
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
     * 判断 操作视图 是否指定值，包括空值
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
     * 重置 操作视图
     */
    @JsonIgnore
    public void resetActionPSDEViewName(){
        this.reset(FIELD_ACTIONPSDEVIEWNAME);
    }

    /**
     * 设置 操作视图，详细说明：{@link #FIELD_ACTIONPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setActionPSDEViewName}
     * @param actionPSDEViewName
     */
    @JsonIgnore
    public PSWorkflowDTO actionpsdeviewname(String actionPSDEViewName){
        this.setActionPSDEViewName(actionPSDEViewName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定工作流的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSWorkflowDTO codename(String codeName){
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
    public PSWorkflowDTO createdate(Timestamp createDate){
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
    public PSWorkflowDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EDITABLEWFSTEP</B>&nbsp;可编辑流程步骤，指定工作流支持编辑的流程步骤清单，多值使用【;】分隔
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
    public PSWorkflowDTO editablewfstep(String editableWFStep){
        this.setEditableWFStep(editableWFStep);
        return this;
    }

    /**
     * <B>ENABLEDYNAVIEW</B>&nbsp;支持动态视图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDYNAVIEW = "enabledynaview";

    /**
     * 设置 支持动态视图
     * 
     * @param enableDynaView
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNAVIEW)
    public void setEnableDynaView(Integer enableDynaView){
        this.set(FIELD_ENABLEDYNAVIEW, enableDynaView);
    }
    
    /**
     * 获取 支持动态视图  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaView(){
        Object objValue = this.get(FIELD_ENABLEDYNAVIEW);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaViewDirty(){
        if(this.contains(FIELD_ENABLEDYNAVIEW)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态视图
     */
    @JsonIgnore
    public void resetEnableDynaView(){
        this.reset(FIELD_ENABLEDYNAVIEW);
    }

    /**
     * 设置 支持动态视图
     * <P>
     * 等同 {@link #setEnableDynaView}
     * @param enableDynaView
     */
    @JsonIgnore
    public PSWorkflowDTO enabledynaview(Integer enableDynaView){
        this.setEnableDynaView(enableDynaView);
        return this;
    }

     /**
     * 设置 支持动态视图
     * <P>
     * 等同 {@link #setEnableDynaView}
     * @param enableDynaView
     */
    @JsonIgnore
    public PSWorkflowDTO enabledynaview(Boolean enableDynaView){
        if(enableDynaView == null){
            this.setEnableDynaView(null);
        }
        else{
            this.setEnableDynaView(enableDynaView?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEMOB</B>&nbsp;移动端支持，指定工作流是否支持移动端操作，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMOB = "enablemob";

    /**
     * 设置 移动端支持，详细说明：{@link #FIELD_ENABLEMOB}
     * 
     * @param enableMob
     * 
     */
    @JsonProperty(FIELD_ENABLEMOB)
    public void setEnableMob(Integer enableMob){
        this.set(FIELD_ENABLEMOB, enableMob);
    }
    
    /**
     * 获取 移动端支持  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMob(){
        Object objValue = this.get(FIELD_ENABLEMOB);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端支持 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMobDirty(){
        if(this.contains(FIELD_ENABLEMOB)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端支持
     */
    @JsonIgnore
    public void resetEnableMob(){
        this.reset(FIELD_ENABLEMOB);
    }

    /**
     * 设置 移动端支持，详细说明：{@link #FIELD_ENABLEMOB}
     * <P>
     * 等同 {@link #setEnableMob}
     * @param enableMob
     */
    @JsonIgnore
    public PSWorkflowDTO enablemob(Integer enableMob){
        this.setEnableMob(enableMob);
        return this;
    }

     /**
     * 设置 移动端支持，详细说明：{@link #FIELD_ENABLEMOB}
     * <P>
     * 等同 {@link #setEnableMob}
     * @param enableMob
     */
    @JsonIgnore
    public PSWorkflowDTO enablemob(Boolean enableMob){
        if(enableMob == null){
            this.setEnableMob(null);
        }
        else{
            this.setEnableMob(enableMob?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTCNTSTATES</B>&nbsp;额外计算步骤值，指定工作流额外计算步骤值清单，多值使用【;】分隔
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
    public PSWorkflowDTO extcntstates(String extCntStates){
        this.setExtCntStates(extCntStates);
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
    public PSWorkflowDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBWFEDITVIEWTYPE</B>&nbsp;移动端流程编辑视图类型，指定工作流默认初始化的移动端流程编辑视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEMobWFEditViewType} 
     */
    public final static String FIELD_MOBWFEDITVIEWTYPE = "mobwfeditviewtype";

    /**
     * 设置 移动端流程编辑视图类型，详细说明：{@link #FIELD_MOBWFEDITVIEWTYPE}
     * 
     * @param mobWFEditViewType
     * 
     */
    @JsonProperty(FIELD_MOBWFEDITVIEWTYPE)
    public void setMobWFEditViewType(String mobWFEditViewType){
        this.set(FIELD_MOBWFEDITVIEWTYPE, mobWFEditViewType);
    }
    
    /**
     * 获取 移动端流程编辑视图类型  
     * @return
     */
    @JsonIgnore
    public String getMobWFEditViewType(){
        Object objValue = this.get(FIELD_MOBWFEDITVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端流程编辑视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobWFEditViewTypeDirty(){
        if(this.contains(FIELD_MOBWFEDITVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端流程编辑视图类型
     */
    @JsonIgnore
    public void resetMobWFEditViewType(){
        this.reset(FIELD_MOBWFEDITVIEWTYPE);
    }

    /**
     * 设置 移动端流程编辑视图类型，详细说明：{@link #FIELD_MOBWFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setMobWFEditViewType}
     * @param mobWFEditViewType
     */
    @JsonIgnore
    public PSWorkflowDTO mobwfeditviewtype(String mobWFEditViewType){
        this.setMobWFEditViewType(mobWFEditViewType);
        return this;
    }

     /**
     * 设置 移动端流程编辑视图类型，详细说明：{@link #FIELD_MOBWFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setMobWFEditViewType}
     * @param mobWFEditViewType
     */
    @JsonIgnore
    public PSWorkflowDTO mobwfeditviewtype(net.ibizsys.model.PSModelEnums.DEMobWFEditViewType mobWFEditViewType){
        if(mobWFEditViewType == null){
            this.setMobWFEditViewType(null);
        }
        else{
            this.setMobWFEditViewType(mobWFEditViewType.value);
        }
        return this;
    }

    /**
     * <B>MODCOLOR</B>&nbsp;模块颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
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
    public PSWorkflowDTO modcolor(String modColor){
        this.setModColor(modColor);
        return this;
    }

    /**
     * <B>NAMEPSLANRESID</B>&nbsp;名称语言资源，指定工作流的名称的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_NAMEPSLANRESID = "namepslanresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * 
     * @param namePSLanResId
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESID)
    public void setNamePSLanResId(String namePSLanResId){
        this.set(FIELD_NAMEPSLANRESID, namePSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResId(){
        Object objValue = this.get(FIELD_NAMEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResIdDirty(){
        if(this.contains(FIELD_NAMEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResId(){
        this.reset(FIELD_NAMEPSLANRESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESID}
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param namePSLanResId
     */
    @JsonIgnore
    public PSWorkflowDTO namepslanresid(String namePSLanResId){
        this.setNamePSLanResId(namePSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNamePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO namepslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNamePSLanResId(null);
            this.setNamePSLanResName(null);
        }
        else{
            this.setNamePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NAMEPSLANRESNAME</B>&nbsp;名称语言资源，指定工作流的名称的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAMEPSLANRESID}
     */
    public final static String FIELD_NAMEPSLANRESNAME = "namepslanresname";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * 
     * @param namePSLanResName
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANRESNAME)
    public void setNamePSLanResName(String namePSLanResName){
        this.set(FIELD_NAMEPSLANRESNAME, namePSLanResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanResName(){
        Object objValue = this.get(FIELD_NAMEPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanResNameDirty(){
        if(this.contains(FIELD_NAMEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanResName(){
        this.reset(FIELD_NAMEPSLANRESNAME);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANRESNAME}
     * <P>
     * 等同 {@link #setNamePSLanResName}
     * @param namePSLanResName
     */
    @JsonIgnore
    public PSWorkflowDTO namepslanresname(String namePSLanResName){
        this.setNamePSLanResName(namePSLanResName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统工作流所在的系统模块
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
    public PSWorkflowDTO psmoduleid(String pSModuleId){
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
    public PSWorkflowDTO psmoduleid(PSModuleDTO pSModule){
        if(pSModule == null){
            this.setModColor(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setModColor(pSModule.getColor());
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统工作流所在的系统模块
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
    public PSWorkflowDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
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
    public PSWorkflowDTO pssysreqitemid(String pSSysReqItemId){
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
    public PSWorkflowDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
    public PSWorkflowDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSWFCATID</B>&nbsp;工作流分类，指定工作流所属的工作流分类
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysWFCatDTO} 
     */
    public final static String FIELD_PSSYSWFCATID = "pssyswfcatid";

    /**
     * 设置 工作流分类，详细说明：{@link #FIELD_PSSYSWFCATID}
     * 
     * @param pSSysWFCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSWFCATID)
    public void setPSSysWFCatId(String pSSysWFCatId){
        this.set(FIELD_PSSYSWFCATID, pSSysWFCatId);
    }
    
    /**
     * 获取 工作流分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysWFCatId(){
        Object objValue = this.get(FIELD_PSSYSWFCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysWFCatIdDirty(){
        if(this.contains(FIELD_PSSYSWFCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流分类
     */
    @JsonIgnore
    public void resetPSSysWFCatId(){
        this.reset(FIELD_PSSYSWFCATID);
    }

    /**
     * 设置 工作流分类，详细说明：{@link #FIELD_PSSYSWFCATID}
     * <P>
     * 等同 {@link #setPSSysWFCatId}
     * @param pSSysWFCatId
     */
    @JsonIgnore
    public PSWorkflowDTO pssyswfcatid(String pSSysWFCatId){
        this.setPSSysWFCatId(pSSysWFCatId);
        return this;
    }

    /**
     * 设置 工作流分类，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysWFCatId}
     * @param pSSysWFCat 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO pssyswfcatid(PSSysWFCatDTO pSSysWFCat){
        if(pSSysWFCat == null){
            this.setPSSysWFCatId(null);
            this.setPSSysWFCatName(null);
        }
        else{
            this.setPSSysWFCatId(pSSysWFCat.getPSSysWFCatId());
            this.setPSSysWFCatName(pSSysWFCat.getPSSysWFCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSWFCATNAME</B>&nbsp;工作流分类，指定工作流所属的工作流分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSWFCATID}
     */
    public final static String FIELD_PSSYSWFCATNAME = "pssyswfcatname";

    /**
     * 设置 工作流分类，详细说明：{@link #FIELD_PSSYSWFCATNAME}
     * 
     * @param pSSysWFCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSWFCATNAME)
    public void setPSSysWFCatName(String pSSysWFCatName){
        this.set(FIELD_PSSYSWFCATNAME, pSSysWFCatName);
    }
    
    /**
     * 获取 工作流分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysWFCatName(){
        Object objValue = this.get(FIELD_PSSYSWFCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysWFCatNameDirty(){
        if(this.contains(FIELD_PSSYSWFCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流分类
     */
    @JsonIgnore
    public void resetPSSysWFCatName(){
        this.reset(FIELD_PSSYSWFCATNAME);
    }

    /**
     * 设置 工作流分类，详细说明：{@link #FIELD_PSSYSWFCATNAME}
     * <P>
     * 等同 {@link #setPSSysWFCatName}
     * @param pSSysWFCatName
     */
    @JsonIgnore
    public PSWorkflowDTO pssyswfcatname(String pSSysWFCatName){
        this.setPSSysWFCatName(pSSysWFCatName);
        return this;
    }

    /**
     * <B>PSWORKFLOWID</B>&nbsp;系统工作流标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWORKFLOWID = "psworkflowid";

    /**
     * 设置 系统工作流标识
     * 
     * @param pSWorkflowId
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWID)
    public void setPSWorkflowId(String pSWorkflowId){
        this.set(FIELD_PSWORKFLOWID, pSWorkflowId);
    }
    
    /**
     * 获取 系统工作流标识  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowId(){
        Object objValue = this.get(FIELD_PSWORKFLOWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统工作流标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowIdDirty(){
        if(this.contains(FIELD_PSWORKFLOWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统工作流标识
     */
    @JsonIgnore
    public void resetPSWorkflowId(){
        this.reset(FIELD_PSWORKFLOWID);
    }

    /**
     * 设置 系统工作流标识
     * <P>
     * 等同 {@link #setPSWorkflowId}
     * @param pSWorkflowId
     */
    @JsonIgnore
    public PSWorkflowDTO psworkflowid(String pSWorkflowId){
        this.setPSWorkflowId(pSWorkflowId);
        return this;
    }

    /**
     * <B>PSWORKFLOWNAME</B>&nbsp;工作流名称，指定工作流的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWORKFLOWNAME = "psworkflowname";

    /**
     * 设置 工作流名称，详细说明：{@link #FIELD_PSWORKFLOWNAME}
     * 
     * @param pSWorkflowName
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWNAME)
    public void setPSWorkflowName(String pSWorkflowName){
        this.set(FIELD_PSWORKFLOWNAME, pSWorkflowName);
    }
    
    /**
     * 获取 工作流名称  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowName(){
        Object objValue = this.get(FIELD_PSWORKFLOWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowNameDirty(){
        if(this.contains(FIELD_PSWORKFLOWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流名称
     */
    @JsonIgnore
    public void resetPSWorkflowName(){
        this.reset(FIELD_PSWORKFLOWNAME);
    }

    /**
     * 设置 工作流名称，详细说明：{@link #FIELD_PSWORKFLOWNAME}
     * <P>
     * 等同 {@link #setPSWorkflowName}
     * @param pSWorkflowName
     */
    @JsonIgnore
    public PSWorkflowDTO psworkflowname(String pSWorkflowName){
        this.setPSWorkflowName(pSWorkflowName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWorkflowName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWorkflowName(strName);
    }

    @JsonIgnore
    public PSWorkflowDTO name(String strName){
        this.setPSWorkflowName(strName);
        return this;
    }

    /**
     * <B>PSWXACCOUNTID</B>&nbsp;微信通知公众号，指定工作流微信通知消息的目标公众号
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWXAccountDTO} 
     */
    public final static String FIELD_PSWXACCOUNTID = "pswxaccountid";

    /**
     * 设置 微信通知公众号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * 
     * @param pSWXAccountId
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTID)
    public void setPSWXAccountId(String pSWXAccountId){
        this.set(FIELD_PSWXACCOUNTID, pSWXAccountId);
    }
    
    /**
     * 获取 微信通知公众号  
     * @return
     */
    @JsonIgnore
    public String getPSWXAccountId(){
        Object objValue = this.get(FIELD_PSWXACCOUNTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信通知公众号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXAccountIdDirty(){
        if(this.contains(FIELD_PSWXACCOUNTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信通知公众号
     */
    @JsonIgnore
    public void resetPSWXAccountId(){
        this.reset(FIELD_PSWXACCOUNTID);
    }

    /**
     * 设置 微信通知公众号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccountId
     */
    @JsonIgnore
    public PSWorkflowDTO pswxaccountid(String pSWXAccountId){
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    /**
     * 设置 微信通知公众号，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccount 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO pswxaccountid(PSWXAccountDTO pSWXAccount){
        if(pSWXAccount == null){
            this.setPSWXAccountId(null);
            this.setPSWXAccountName(null);
        }
        else{
            this.setPSWXAccountId(pSWXAccount.getPSWXAccountId());
            this.setPSWXAccountName(pSWXAccount.getPSWXAccountName());
        }
        return this;
    }

    /**
     * <B>PSWXACCOUNTNAME</B>&nbsp;微信通知公众号，指定工作流微信通知消息的目标公众号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXACCOUNTID}
     */
    public final static String FIELD_PSWXACCOUNTNAME = "pswxaccountname";

    /**
     * 设置 微信通知公众号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * 
     * @param pSWXAccountName
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTNAME)
    public void setPSWXAccountName(String pSWXAccountName){
        this.set(FIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }
    
    /**
     * 获取 微信通知公众号  
     * @return
     */
    @JsonIgnore
    public String getPSWXAccountName(){
        Object objValue = this.get(FIELD_PSWXACCOUNTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信通知公众号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXAccountNameDirty(){
        if(this.contains(FIELD_PSWXACCOUNTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信通知公众号
     */
    @JsonIgnore
    public void resetPSWXAccountName(){
        this.reset(FIELD_PSWXACCOUNTNAME);
    }

    /**
     * 设置 微信通知公众号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * <P>
     * 等同 {@link #setPSWXAccountName}
     * @param pSWXAccountName
     */
    @JsonIgnore
    public PSWorkflowDTO pswxaccountname(String pSWXAccountName){
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    /**
     * <B>PSWXENTAPPID</B>&nbsp;微信企业应用，指定工作流微信通知消息的目标应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWXEntAppDTO} 
     */
    public final static String FIELD_PSWXENTAPPID = "pswxentappid";

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPID}
     * 
     * @param pSWXEntAppId
     * 
     */
    @JsonProperty(FIELD_PSWXENTAPPID)
    public void setPSWXEntAppId(String pSWXEntAppId){
        this.set(FIELD_PSWXENTAPPID, pSWXEntAppId);
    }
    
    /**
     * 获取 微信企业应用  
     * @return
     */
    @JsonIgnore
    public String getPSWXEntAppId(){
        Object objValue = this.get(FIELD_PSWXENTAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信企业应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXEntAppIdDirty(){
        if(this.contains(FIELD_PSWXENTAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信企业应用
     */
    @JsonIgnore
    public void resetPSWXEntAppId(){
        this.reset(FIELD_PSWXENTAPPID);
    }

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPID}
     * <P>
     * 等同 {@link #setPSWXEntAppId}
     * @param pSWXEntAppId
     */
    @JsonIgnore
    public PSWorkflowDTO pswxentappid(String pSWXEntAppId){
        this.setPSWXEntAppId(pSWXEntAppId);
        return this;
    }

    /**
     * 设置 微信企业应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXEntAppId}
     * @param pSWXEntApp 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO pswxentappid(PSWXEntAppDTO pSWXEntApp){
        if(pSWXEntApp == null){
            this.setPSWXEntAppId(null);
            this.setPSWXEntAppName(null);
        }
        else{
            this.setPSWXEntAppId(pSWXEntApp.getPSWXEntAppId());
            this.setPSWXEntAppName(pSWXEntApp.getPSWXEntAppName());
        }
        return this;
    }

    /**
     * <B>PSWXENTAPPNAME</B>&nbsp;微信企业应用，指定工作流微信通知消息的目标应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXENTAPPID}
     */
    public final static String FIELD_PSWXENTAPPNAME = "pswxentappname";

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPNAME}
     * 
     * @param pSWXEntAppName
     * 
     */
    @JsonProperty(FIELD_PSWXENTAPPNAME)
    public void setPSWXEntAppName(String pSWXEntAppName){
        this.set(FIELD_PSWXENTAPPNAME, pSWXEntAppName);
    }
    
    /**
     * 获取 微信企业应用  
     * @return
     */
    @JsonIgnore
    public String getPSWXEntAppName(){
        Object objValue = this.get(FIELD_PSWXENTAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信企业应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXEntAppNameDirty(){
        if(this.contains(FIELD_PSWXENTAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信企业应用
     */
    @JsonIgnore
    public void resetPSWXEntAppName(){
        this.reset(FIELD_PSWXENTAPPNAME);
    }

    /**
     * 设置 微信企业应用，详细说明：{@link #FIELD_PSWXENTAPPNAME}
     * <P>
     * 等同 {@link #setPSWXEntAppName}
     * @param pSWXEntAppName
     */
    @JsonIgnore
    public PSWorkflowDTO pswxentappname(String pSWXEntAppName){
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    /**
     * <B>REMINDPSSYSMSGTEMPLID</B>&nbsp;催办消息模板，指定工作流使用的催办消息模板，未定义时使用工作流设置的默认配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO} 
     */
    public final static String FIELD_REMINDPSSYSMSGTEMPLID = "remindpssysmsgtemplid";

    /**
     * 设置 催办消息模板，详细说明：{@link #FIELD_REMINDPSSYSMSGTEMPLID}
     * 
     * @param remindPSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_REMINDPSSYSMSGTEMPLID)
    public void setRemindPSSysMsgTemplId(String remindPSSysMsgTemplId){
        this.set(FIELD_REMINDPSSYSMSGTEMPLID, remindPSSysMsgTemplId);
    }
    
    /**
     * 获取 催办消息模板  
     * @return
     */
    @JsonIgnore
    public String getRemindPSSysMsgTemplId(){
        Object objValue = this.get(FIELD_REMINDPSSYSMSGTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 催办消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemindPSSysMsgTemplIdDirty(){
        if(this.contains(FIELD_REMINDPSSYSMSGTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 催办消息模板
     */
    @JsonIgnore
    public void resetRemindPSSysMsgTemplId(){
        this.reset(FIELD_REMINDPSSYSMSGTEMPLID);
    }

    /**
     * 设置 催办消息模板，详细说明：{@link #FIELD_REMINDPSSYSMSGTEMPLID}
     * <P>
     * 等同 {@link #setRemindPSSysMsgTemplId}
     * @param remindPSSysMsgTemplId
     */
    @JsonIgnore
    public PSWorkflowDTO remindpssysmsgtemplid(String remindPSSysMsgTemplId){
        this.setRemindPSSysMsgTemplId(remindPSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 催办消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemindPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO remindpssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl){
        if(pSSysMsgTempl == null){
            this.setRemindPSSysMsgTemplId(null);
            this.setRemindPSSysMsgTemplName(null);
        }
        else{
            this.setRemindPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setRemindPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    /**
     * <B>REMINDPSSYSMSGTEMPLNAME</B>&nbsp;催办消息模板，指定工作流使用的催办消息模板，未定义时使用工作流设置的默认配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMINDPSSYSMSGTEMPLID}
     */
    public final static String FIELD_REMINDPSSYSMSGTEMPLNAME = "remindpssysmsgtemplname";

    /**
     * 设置 催办消息模板，详细说明：{@link #FIELD_REMINDPSSYSMSGTEMPLNAME}
     * 
     * @param remindPSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_REMINDPSSYSMSGTEMPLNAME)
    public void setRemindPSSysMsgTemplName(String remindPSSysMsgTemplName){
        this.set(FIELD_REMINDPSSYSMSGTEMPLNAME, remindPSSysMsgTemplName);
    }
    
    /**
     * 获取 催办消息模板  
     * @return
     */
    @JsonIgnore
    public String getRemindPSSysMsgTemplName(){
        Object objValue = this.get(FIELD_REMINDPSSYSMSGTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 催办消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemindPSSysMsgTemplNameDirty(){
        if(this.contains(FIELD_REMINDPSSYSMSGTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 催办消息模板
     */
    @JsonIgnore
    public void resetRemindPSSysMsgTemplName(){
        this.reset(FIELD_REMINDPSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 催办消息模板，详细说明：{@link #FIELD_REMINDPSSYSMSGTEMPLNAME}
     * <P>
     * 等同 {@link #setRemindPSSysMsgTemplName}
     * @param remindPSSysMsgTemplName
     */
    @JsonIgnore
    public PSWorkflowDTO remindpssysmsgtemplname(String remindPSSysMsgTemplName){
        this.setRemindPSSysMsgTemplName(remindPSSysMsgTemplName);
        return this;
    }

    /**
     * <B>REMOTEENGINEFLAG</B>&nbsp;远程引擎模式，指定工作流是否启用远程引擎模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REMOTEENGINEFLAG = "remoteengineflag";

    /**
     * 设置 远程引擎模式，详细说明：{@link #FIELD_REMOTEENGINEFLAG}
     * 
     * @param remoteEngineFlag
     * 
     */
    @JsonProperty(FIELD_REMOTEENGINEFLAG)
    public void setRemoteEngineFlag(Integer remoteEngineFlag){
        this.set(FIELD_REMOTEENGINEFLAG, remoteEngineFlag);
    }
    
    /**
     * 获取 远程引擎模式  
     * @return
     */
    @JsonIgnore
    public Integer getRemoteEngineFlag(){
        Object objValue = this.get(FIELD_REMOTEENGINEFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 远程引擎模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoteEngineFlagDirty(){
        if(this.contains(FIELD_REMOTEENGINEFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 远程引擎模式
     */
    @JsonIgnore
    public void resetRemoteEngineFlag(){
        this.reset(FIELD_REMOTEENGINEFLAG);
    }

    /**
     * 设置 远程引擎模式，详细说明：{@link #FIELD_REMOTEENGINEFLAG}
     * <P>
     * 等同 {@link #setRemoteEngineFlag}
     * @param remoteEngineFlag
     */
    @JsonIgnore
    public PSWorkflowDTO remoteengineflag(Integer remoteEngineFlag){
        this.setRemoteEngineFlag(remoteEngineFlag);
        return this;
    }

     /**
     * 设置 远程引擎模式，详细说明：{@link #FIELD_REMOTEENGINEFLAG}
     * <P>
     * 等同 {@link #setRemoteEngineFlag}
     * @param remoteEngineFlag
     */
    @JsonIgnore
    public PSWorkflowDTO remoteengineflag(Boolean remoteEngineFlag){
        if(remoteEngineFlag == null){
            this.setRemoteEngineFlag(null);
        }
        else{
            this.setRemoteEngineFlag(remoteEngineFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>STARTMOBPSDEVIEWID</B>&nbsp;移动端启动视图，指定工作流默认的移动端流程启动视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_STARTMOBPSDEVIEWID = "startmobpsdeviewid";

    /**
     * 设置 移动端启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWID}
     * 
     * @param startMobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_STARTMOBPSDEVIEWID)
    public void setStartMobPSDEViewId(String startMobPSDEViewId){
        this.set(FIELD_STARTMOBPSDEVIEWID, startMobPSDEViewId);
    }
    
    /**
     * 获取 移动端启动视图  
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
     * 判断 移动端启动视图 是否指定值，包括空值
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
     * 重置 移动端启动视图
     */
    @JsonIgnore
    public void resetStartMobPSDEViewId(){
        this.reset(FIELD_STARTMOBPSDEVIEWID);
    }

    /**
     * 设置 移动端启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWID}
     * <P>
     * 等同 {@link #setStartMobPSDEViewId}
     * @param startMobPSDEViewId
     */
    @JsonIgnore
    public PSWorkflowDTO startmobpsdeviewid(String startMobPSDEViewId){
        this.setStartMobPSDEViewId(startMobPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端启动视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStartMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO startmobpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>STARTMOBPSDEVIEWNAME</B>&nbsp;移动端启动视图，指定工作流默认的移动端流程启动视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STARTMOBPSDEVIEWID}
     */
    public final static String FIELD_STARTMOBPSDEVIEWNAME = "startmobpsdeviewname";

    /**
     * 设置 移动端启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWNAME}
     * 
     * @param startMobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_STARTMOBPSDEVIEWNAME)
    public void setStartMobPSDEViewName(String startMobPSDEViewName){
        this.set(FIELD_STARTMOBPSDEVIEWNAME, startMobPSDEViewName);
    }
    
    /**
     * 获取 移动端启动视图  
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
     * 判断 移动端启动视图 是否指定值，包括空值
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
     * 重置 移动端启动视图
     */
    @JsonIgnore
    public void resetStartMobPSDEViewName(){
        this.reset(FIELD_STARTMOBPSDEVIEWNAME);
    }

    /**
     * 设置 移动端启动视图，详细说明：{@link #FIELD_STARTMOBPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setStartMobPSDEViewName}
     * @param startMobPSDEViewName
     */
    @JsonIgnore
    public PSWorkflowDTO startmobpsdeviewname(String startMobPSDEViewName){
        this.setStartMobPSDEViewName(startMobPSDEViewName);
        return this;
    }

    /**
     * <B>STARTPSDEVIEWID</B>&nbsp;启动视图，指定工作流默认的桌面端流程启动视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_STARTPSDEVIEWID = "startpsdeviewid";

    /**
     * 设置 启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWID}
     * 
     * @param startPSDEViewId
     * 
     */
    @JsonProperty(FIELD_STARTPSDEVIEWID)
    public void setStartPSDEViewId(String startPSDEViewId){
        this.set(FIELD_STARTPSDEVIEWID, startPSDEViewId);
    }
    
    /**
     * 获取 启动视图  
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
     * 判断 启动视图 是否指定值，包括空值
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
     * 重置 启动视图
     */
    @JsonIgnore
    public void resetStartPSDEViewId(){
        this.reset(FIELD_STARTPSDEVIEWID);
    }

    /**
     * 设置 启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWID}
     * <P>
     * 等同 {@link #setStartPSDEViewId}
     * @param startPSDEViewId
     */
    @JsonIgnore
    public PSWorkflowDTO startpsdeviewid(String startPSDEViewId){
        this.setStartPSDEViewId(startPSDEViewId);
        return this;
    }

    /**
     * 设置 启动视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStartPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO startpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>STARTPSDEVIEWNAME</B>&nbsp;启动视图，指定工作流默认的桌面端流程启动视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STARTPSDEVIEWID}
     */
    public final static String FIELD_STARTPSDEVIEWNAME = "startpsdeviewname";

    /**
     * 设置 启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWNAME}
     * 
     * @param startPSDEViewName
     * 
     */
    @JsonProperty(FIELD_STARTPSDEVIEWNAME)
    public void setStartPSDEViewName(String startPSDEViewName){
        this.set(FIELD_STARTPSDEVIEWNAME, startPSDEViewName);
    }
    
    /**
     * 获取 启动视图  
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
     * 判断 启动视图 是否指定值，包括空值
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
     * 重置 启动视图
     */
    @JsonIgnore
    public void resetStartPSDEViewName(){
        this.reset(FIELD_STARTPSDEVIEWNAME);
    }

    /**
     * 设置 启动视图，详细说明：{@link #FIELD_STARTPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setStartPSDEViewName}
     * @param startPSDEViewName
     */
    @JsonIgnore
    public PSWorkflowDTO startpsdeviewname(String startPSDEViewName){
        this.setStartPSDEViewName(startPSDEViewName);
        return this;
    }

    /**
     * <B>STATECODELISTID</B>&nbsp;业务状态代码表，指定工作流的业务状态代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_STATECODELISTID = "statecodelistid";

    /**
     * 设置 业务状态代码表，详细说明：{@link #FIELD_STATECODELISTID}
     * 
     * @param stateCodeListId
     * 
     */
    @JsonProperty(FIELD_STATECODELISTID)
    public void setStateCodeListId(String stateCodeListId){
        this.set(FIELD_STATECODELISTID, stateCodeListId);
    }
    
    /**
     * 获取 业务状态代码表  
     * @return
     */
    @JsonIgnore
    public String getStateCodeListId(){
        Object objValue = this.get(FIELD_STATECODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务状态代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStateCodeListIdDirty(){
        if(this.contains(FIELD_STATECODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务状态代码表
     */
    @JsonIgnore
    public void resetStateCodeListId(){
        this.reset(FIELD_STATECODELISTID);
    }

    /**
     * 设置 业务状态代码表，详细说明：{@link #FIELD_STATECODELISTID}
     * <P>
     * 等同 {@link #setStateCodeListId}
     * @param stateCodeListId
     */
    @JsonIgnore
    public PSWorkflowDTO statecodelistid(String stateCodeListId){
        this.setStateCodeListId(stateCodeListId);
        return this;
    }

    /**
     * 设置 业务状态代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStateCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO statecodelistid(PSCodeListDTO pSCodeList){
        if(pSCodeList == null){
            this.setStateCodeListId(null);
            this.setStateCodeListName(null);
        }
        else{
            this.setStateCodeListId(pSCodeList.getPSCodeListId());
            this.setStateCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>STATECODELISTNAME</B>&nbsp;业务状态代码表，指定工作流的业务状态代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATECODELISTID}
     */
    public final static String FIELD_STATECODELISTNAME = "statecodelistname";

    /**
     * 设置 业务状态代码表，详细说明：{@link #FIELD_STATECODELISTNAME}
     * 
     * @param stateCodeListName
     * 
     */
    @JsonProperty(FIELD_STATECODELISTNAME)
    public void setStateCodeListName(String stateCodeListName){
        this.set(FIELD_STATECODELISTNAME, stateCodeListName);
    }
    
    /**
     * 获取 业务状态代码表  
     * @return
     */
    @JsonIgnore
    public String getStateCodeListName(){
        Object objValue = this.get(FIELD_STATECODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务状态代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStateCodeListNameDirty(){
        if(this.contains(FIELD_STATECODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务状态代码表
     */
    @JsonIgnore
    public void resetStateCodeListName(){
        this.reset(FIELD_STATECODELISTNAME);
    }

    /**
     * 设置 业务状态代码表，详细说明：{@link #FIELD_STATECODELISTNAME}
     * <P>
     * 等同 {@link #setStateCodeListName}
     * @param stateCodeListName
     */
    @JsonIgnore
    public PSWorkflowDTO statecodelistname(String stateCodeListName){
        this.setStateCodeListName(stateCodeListName);
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
    public PSWorkflowDTO updatedate(Timestamp updateDate){
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
    public PSWorkflowDTO updateman(String updateMan){
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
    public PSWorkflowDTO usercat(String userCat){
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
    public PSWorkflowDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
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
    public PSWorkflowDTO usertag(String userTag){
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
    public PSWorkflowDTO usertag2(String userTag2){
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
    public PSWorkflowDTO usertag3(String userTag3){
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
    public PSWorkflowDTO usertag4(String userTag4){
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
    public PSWorkflowDTO validflag(Integer validFlag){
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
    public PSWorkflowDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WFCANCELVALUE</B>&nbsp;流程取消状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFCANCELVALUE = "wfcancelvalue";

    /**
     * 设置 流程取消状态值
     * 
     * @param wFCancelValue
     * 
     */
    @JsonProperty(FIELD_WFCANCELVALUE)
    public void setWFCancelValue(String wFCancelValue){
        this.set(FIELD_WFCANCELVALUE, wFCancelValue);
    }
    
    /**
     * 获取 流程取消状态值  
     * @return
     */
    @JsonIgnore
    public String getWFCancelValue(){
        Object objValue = this.get(FIELD_WFCANCELVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程取消状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFCancelValueDirty(){
        if(this.contains(FIELD_WFCANCELVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程取消状态值
     */
    @JsonIgnore
    public void resetWFCancelValue(){
        this.reset(FIELD_WFCANCELVALUE);
    }

    /**
     * 设置 流程取消状态值
     * <P>
     * 等同 {@link #setWFCancelValue}
     * @param wFCancelValue
     */
    @JsonIgnore
    public PSWorkflowDTO wfcancelvalue(String wFCancelValue){
        this.setWFCancelValue(wFCancelValue);
        return this;
    }

    /**
     * <B>WFCANCELVALUETEXT</B>&nbsp;流程取消状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFCANCELVALUETEXT = "wfcancelvaluetext";

    /**
     * 设置 流程取消状态值
     * 
     * @param wFCancelValueText
     * 
     */
    @JsonProperty(FIELD_WFCANCELVALUETEXT)
    public void setWFCancelValueText(String wFCancelValueText){
        this.set(FIELD_WFCANCELVALUETEXT, wFCancelValueText);
    }
    
    /**
     * 获取 流程取消状态值  
     * @return
     */
    @JsonIgnore
    public String getWFCancelValueText(){
        Object objValue = this.get(FIELD_WFCANCELVALUETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程取消状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFCancelValueTextDirty(){
        if(this.contains(FIELD_WFCANCELVALUETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程取消状态值
     */
    @JsonIgnore
    public void resetWFCancelValueText(){
        this.reset(FIELD_WFCANCELVALUETEXT);
    }

    /**
     * 设置 流程取消状态值
     * <P>
     * 等同 {@link #setWFCancelValueText}
     * @param wFCancelValueText
     */
    @JsonIgnore
    public PSWorkflowDTO wfcancelvaluetext(String wFCancelValueText){
        this.setWFCancelValueText(wFCancelValueText);
        return this;
    }

    /**
     * <B>WFEDITVIEWTYPE</B>&nbsp;流程编辑视图类型，指定工作流默认初始化的桌面端流程编辑视图类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEWFEditViewType} 
     */
    public final static String FIELD_WFEDITVIEWTYPE = "wfeditviewtype";

    /**
     * 设置 流程编辑视图类型，详细说明：{@link #FIELD_WFEDITVIEWTYPE}
     * 
     * @param wFEditViewType
     * 
     */
    @JsonProperty(FIELD_WFEDITVIEWTYPE)
    public void setWFEditViewType(String wFEditViewType){
        this.set(FIELD_WFEDITVIEWTYPE, wFEditViewType);
    }
    
    /**
     * 获取 流程编辑视图类型  
     * @return
     */
    @JsonIgnore
    public String getWFEditViewType(){
        Object objValue = this.get(FIELD_WFEDITVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程编辑视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFEditViewTypeDirty(){
        if(this.contains(FIELD_WFEDITVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程编辑视图类型
     */
    @JsonIgnore
    public void resetWFEditViewType(){
        this.reset(FIELD_WFEDITVIEWTYPE);
    }

    /**
     * 设置 流程编辑视图类型，详细说明：{@link #FIELD_WFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setWFEditViewType}
     * @param wFEditViewType
     */
    @JsonIgnore
    public PSWorkflowDTO wfeditviewtype(String wFEditViewType){
        this.setWFEditViewType(wFEditViewType);
        return this;
    }

     /**
     * 设置 流程编辑视图类型，详细说明：{@link #FIELD_WFEDITVIEWTYPE}
     * <P>
     * 等同 {@link #setWFEditViewType}
     * @param wFEditViewType
     */
    @JsonIgnore
    public PSWorkflowDTO wfeditviewtype(net.ibizsys.model.PSModelEnums.DEWFEditViewType wFEditViewType){
        if(wFEditViewType == null){
            this.setWFEditViewType(null);
        }
        else{
            this.setWFEditViewType(wFEditViewType.value);
        }
        return this;
    }

    /**
     * <B>WFENGINETYPE</B>&nbsp;流程引擎类型，指定工作流运行的引擎类型，未定义时为【iBiz内置（默认）】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WFEngineType} 
     */
    public final static String FIELD_WFENGINETYPE = "wfenginetype";

    /**
     * 设置 流程引擎类型，详细说明：{@link #FIELD_WFENGINETYPE}
     * 
     * @param wFEngineType
     * 
     */
    @JsonProperty(FIELD_WFENGINETYPE)
    public void setWFEngineType(String wFEngineType){
        this.set(FIELD_WFENGINETYPE, wFEngineType);
    }
    
    /**
     * 获取 流程引擎类型  
     * @return
     */
    @JsonIgnore
    public String getWFEngineType(){
        Object objValue = this.get(FIELD_WFENGINETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFEngineTypeDirty(){
        if(this.contains(FIELD_WFENGINETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程引擎类型
     */
    @JsonIgnore
    public void resetWFEngineType(){
        this.reset(FIELD_WFENGINETYPE);
    }

    /**
     * 设置 流程引擎类型，详细说明：{@link #FIELD_WFENGINETYPE}
     * <P>
     * 等同 {@link #setWFEngineType}
     * @param wFEngineType
     */
    @JsonIgnore
    public PSWorkflowDTO wfenginetype(String wFEngineType){
        this.setWFEngineType(wFEngineType);
        return this;
    }

     /**
     * 设置 流程引擎类型，详细说明：{@link #FIELD_WFENGINETYPE}
     * <P>
     * 等同 {@link #setWFEngineType}
     * @param wFEngineType
     */
    @JsonIgnore
    public PSWorkflowDTO wfenginetype(net.ibizsys.model.PSModelEnums.WFEngineType wFEngineType){
        if(wFEngineType == null){
            this.setWFEngineType(null);
        }
        else{
            this.setWFEngineType(wFEngineType.value);
        }
        return this;
    }

    /**
     * <B>WFERRORVALUE</B>&nbsp;流程错误状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFERRORVALUE = "wferrorvalue";

    /**
     * 设置 流程错误状态值
     * 
     * @param wFErrorValue
     * 
     */
    @JsonProperty(FIELD_WFERRORVALUE)
    public void setWFErrorValue(String wFErrorValue){
        this.set(FIELD_WFERRORVALUE, wFErrorValue);
    }
    
    /**
     * 获取 流程错误状态值  
     * @return
     */
    @JsonIgnore
    public String getWFErrorValue(){
        Object objValue = this.get(FIELD_WFERRORVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程错误状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFErrorValueDirty(){
        if(this.contains(FIELD_WFERRORVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程错误状态值
     */
    @JsonIgnore
    public void resetWFErrorValue(){
        this.reset(FIELD_WFERRORVALUE);
    }

    /**
     * 设置 流程错误状态值
     * <P>
     * 等同 {@link #setWFErrorValue}
     * @param wFErrorValue
     */
    @JsonIgnore
    public PSWorkflowDTO wferrorvalue(String wFErrorValue){
        this.setWFErrorValue(wFErrorValue);
        return this;
    }

    /**
     * <B>WFERRORVALUETEXT</B>&nbsp;流程错误状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFERRORVALUETEXT = "wferrorvaluetext";

    /**
     * 设置 流程错误状态值
     * 
     * @param wFErrorValueText
     * 
     */
    @JsonProperty(FIELD_WFERRORVALUETEXT)
    public void setWFErrorValueText(String wFErrorValueText){
        this.set(FIELD_WFERRORVALUETEXT, wFErrorValueText);
    }
    
    /**
     * 获取 流程错误状态值  
     * @return
     */
    @JsonIgnore
    public String getWFErrorValueText(){
        Object objValue = this.get(FIELD_WFERRORVALUETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程错误状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFErrorValueTextDirty(){
        if(this.contains(FIELD_WFERRORVALUETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程错误状态值
     */
    @JsonIgnore
    public void resetWFErrorValueText(){
        this.reset(FIELD_WFERRORVALUETEXT);
    }

    /**
     * 设置 流程错误状态值
     * <P>
     * 等同 {@link #setWFErrorValueText}
     * @param wFErrorValueText
     */
    @JsonIgnore
    public PSWorkflowDTO wferrorvaluetext(String wFErrorValueText){
        this.setWFErrorValueText(wFErrorValueText);
        return this;
    }

    /**
     * <B>WFFINISHVALUE</B>&nbsp;流程完成状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFFINISHVALUE = "wffinishvalue";

    /**
     * 设置 流程完成状态值
     * 
     * @param wFFinishValue
     * 
     */
    @JsonProperty(FIELD_WFFINISHVALUE)
    public void setWFFinishValue(String wFFinishValue){
        this.set(FIELD_WFFINISHVALUE, wFFinishValue);
        //属性名称与代码标识不一致，设置属性名称
        this.set("wffinishevalue", wFFinishValue);
    }
    
    /**
     * 获取 流程完成状态值  
     * @return
     */
    @JsonIgnore
    public String getWFFinishValue(){
        Object objValue = this.get(FIELD_WFFINISHVALUE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("wffinishevalue");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 流程完成状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFFinishValueDirty(){
        if(this.contains(FIELD_WFFINISHVALUE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("wffinishevalue")){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程完成状态值
     */
    @JsonIgnore
    public void resetWFFinishValue(){
        this.reset(FIELD_WFFINISHVALUE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("wffinishevalue");
    }

    /**
     * 设置 流程完成状态值
     * <P>
     * 等同 {@link #setWFFinishValue}
     * @param wFFinishValue
     */
    @JsonIgnore
    public PSWorkflowDTO wffinishvalue(String wFFinishValue){
        this.setWFFinishValue(wFFinishValue);
        return this;
    }

    /**
     * <B>WFFINISHVALUETEXT</B>&nbsp;流程完成状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFFINISHVALUETEXT = "wffinishvaluetext";

    /**
     * 设置 流程完成状态值
     * 
     * @param wFFinishValueText
     * 
     */
    @JsonProperty(FIELD_WFFINISHVALUETEXT)
    public void setWFFinishValueText(String wFFinishValueText){
        this.set(FIELD_WFFINISHVALUETEXT, wFFinishValueText);
        //属性名称与代码标识不一致，设置属性名称
        this.set("wffinishevaluetext", wFFinishValueText);
    }
    
    /**
     * 获取 流程完成状态值  
     * @return
     */
    @JsonIgnore
    public String getWFFinishValueText(){
        Object objValue = this.get(FIELD_WFFINISHVALUETEXT);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("wffinishevaluetext");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 流程完成状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFFinishValueTextDirty(){
        if(this.contains(FIELD_WFFINISHVALUETEXT)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("wffinishevaluetext")){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程完成状态值
     */
    @JsonIgnore
    public void resetWFFinishValueText(){
        this.reset(FIELD_WFFINISHVALUETEXT);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("wffinishevaluetext");
    }

    /**
     * 设置 流程完成状态值
     * <P>
     * 等同 {@link #setWFFinishValueText}
     * @param wFFinishValueText
     */
    @JsonIgnore
    public PSWorkflowDTO wffinishvaluetext(String wFFinishValueText){
        this.setWFFinishValueText(wFFinishValueText);
        return this;
    }

    /**
     * <B>WFPROXYMODE</B>&nbsp;流程代理模式，指定工作流使用代理模式，未定义时为【（不使用）】
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
    public PSWorkflowDTO wfproxymode(Integer wFProxyMode){
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
    public PSWorkflowDTO wfproxymode(net.ibizsys.model.PSModelEnums.WFProxyMode wFProxyMode){
        if(wFProxyMode == null){
            this.setWFProxyMode(null);
        }
        else{
            this.setWFProxyMode(wFProxyMode.value);
        }
        return this;
    }

    /**
     * <B>WFSN</B>&nbsp;工作流编号，指定工作流的编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFSN = "wfsn";

    /**
     * 设置 工作流编号，详细说明：{@link #FIELD_WFSN}
     * 
     * @param wFSN
     * 
     */
    @JsonProperty(FIELD_WFSN)
    public void setWFSN(String wFSN){
        this.set(FIELD_WFSN, wFSN);
    }
    
    /**
     * 获取 工作流编号  
     * @return
     */
    @JsonIgnore
    public String getWFSN(){
        Object objValue = this.get(FIELD_WFSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFSNDirty(){
        if(this.contains(FIELD_WFSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流编号
     */
    @JsonIgnore
    public void resetWFSN(){
        this.reset(FIELD_WFSN);
    }

    /**
     * 设置 工作流编号，详细说明：{@link #FIELD_WFSN}
     * <P>
     * 等同 {@link #setWFSN}
     * @param wFSN
     */
    @JsonIgnore
    public PSWorkflowDTO wfsn(String wFSN){
        this.setWFSN(wFSN);
        return this;
    }

    /**
     * <B>WFSTATEVALUE</B>&nbsp;流程中状态值，指定工作流业务状态的流程中状态值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_WFSTATEVALUE = "wfstatevalue";

    /**
     * 设置 流程中状态值，详细说明：{@link #FIELD_WFSTATEVALUE}
     * 
     * @param wFStateValue
     * 
     */
    @JsonProperty(FIELD_WFSTATEVALUE)
    public void setWFStateValue(String wFStateValue){
        this.set(FIELD_WFSTATEVALUE, wFStateValue);
    }
    
    /**
     * 获取 流程中状态值  
     * @return
     */
    @JsonIgnore
    public String getWFStateValue(){
        Object objValue = this.get(FIELD_WFSTATEVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程中状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStateValueDirty(){
        if(this.contains(FIELD_WFSTATEVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程中状态值
     */
    @JsonIgnore
    public void resetWFStateValue(){
        this.reset(FIELD_WFSTATEVALUE);
    }

    /**
     * 设置 流程中状态值，详细说明：{@link #FIELD_WFSTATEVALUE}
     * <P>
     * 等同 {@link #setWFStateValue}
     * @param wFStateValue
     */
    @JsonIgnore
    public PSWorkflowDTO wfstatevalue(String wFStateValue){
        this.setWFStateValue(wFStateValue);
        return this;
    }

    /**
     * <B>WFSTEPCODELISTID</B>&nbsp;流程步骤代码表，指定工作流的流程步骤代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_WFSTEPCODELISTID = "wfstepcodelistid";

    /**
     * 设置 流程步骤代码表，详细说明：{@link #FIELD_WFSTEPCODELISTID}
     * 
     * @param wFStepCodeListId
     * 
     */
    @JsonProperty(FIELD_WFSTEPCODELISTID)
    public void setWFStepCodeListId(String wFStepCodeListId){
        this.set(FIELD_WFSTEPCODELISTID, wFStepCodeListId);
    }
    
    /**
     * 获取 流程步骤代码表  
     * @return
     */
    @JsonIgnore
    public String getWFStepCodeListId(){
        Object objValue = this.get(FIELD_WFSTEPCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepCodeListIdDirty(){
        if(this.contains(FIELD_WFSTEPCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤代码表
     */
    @JsonIgnore
    public void resetWFStepCodeListId(){
        this.reset(FIELD_WFSTEPCODELISTID);
    }

    /**
     * 设置 流程步骤代码表，详细说明：{@link #FIELD_WFSTEPCODELISTID}
     * <P>
     * 等同 {@link #setWFStepCodeListId}
     * @param wFStepCodeListId
     */
    @JsonIgnore
    public PSWorkflowDTO wfstepcodelistid(String wFStepCodeListId){
        this.setWFStepCodeListId(wFStepCodeListId);
        return this;
    }

    /**
     * 设置 流程步骤代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setWFStepCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSWorkflowDTO wfstepcodelistid(PSCodeListDTO pSCodeList){
        if(pSCodeList == null){
            this.setWFStepCodeListId(null);
            this.setWFStepCodeListName(null);
        }
        else{
            this.setWFStepCodeListId(pSCodeList.getPSCodeListId());
            this.setWFStepCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>WFSTEPCODELISTNAME</B>&nbsp;流程步骤代码表，指定工作流的流程步骤代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_WFSTEPCODELISTID}
     */
    public final static String FIELD_WFSTEPCODELISTNAME = "wfstepcodelistname";

    /**
     * 设置 流程步骤代码表，详细说明：{@link #FIELD_WFSTEPCODELISTNAME}
     * 
     * @param wFStepCodeListName
     * 
     */
    @JsonProperty(FIELD_WFSTEPCODELISTNAME)
    public void setWFStepCodeListName(String wFStepCodeListName){
        this.set(FIELD_WFSTEPCODELISTNAME, wFStepCodeListName);
    }
    
    /**
     * 获取 流程步骤代码表  
     * @return
     */
    @JsonIgnore
    public String getWFStepCodeListName(){
        Object objValue = this.get(FIELD_WFSTEPCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程步骤代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFStepCodeListNameDirty(){
        if(this.contains(FIELD_WFSTEPCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程步骤代码表
     */
    @JsonIgnore
    public void resetWFStepCodeListName(){
        this.reset(FIELD_WFSTEPCODELISTNAME);
    }

    /**
     * 设置 流程步骤代码表，详细说明：{@link #FIELD_WFSTEPCODELISTNAME}
     * <P>
     * 等同 {@link #setWFStepCodeListName}
     * @param wFStepCodeListName
     */
    @JsonIgnore
    public PSWorkflowDTO wfstepcodelistname(String wFStepCodeListName){
        this.setWFStepCodeListName(wFStepCodeListName);
        return this;
    }

    /**
     * <B>WFTAG</B>&nbsp;流程标记
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_WFTAG = "wftag";

    /**
     * 设置 流程标记
     * 
     * @param wFTag
     * 
     */
    @JsonProperty(FIELD_WFTAG)
    public void setWFTag(String wFTag){
        this.set(FIELD_WFTAG, wFTag);
    }
    
    /**
     * 获取 流程标记  
     * @return
     */
    @JsonIgnore
    public String getWFTag(){
        Object objValue = this.get(FIELD_WFTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFTagDirty(){
        if(this.contains(FIELD_WFTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标记
     */
    @JsonIgnore
    public void resetWFTag(){
        this.reset(FIELD_WFTAG);
    }

    /**
     * 设置 流程标记
     * <P>
     * 等同 {@link #setWFTag}
     * @param wFTag
     */
    @JsonIgnore
    public PSWorkflowDTO wftag(String wFTag){
        this.setWFTag(wFTag);
        return this;
    }

    /**
     * <B>WFTAG2</B>&nbsp;流程标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_WFTAG2 = "wftag2";

    /**
     * 设置 流程标记2
     * 
     * @param wFTag2
     * 
     */
    @JsonProperty(FIELD_WFTAG2)
    public void setWFTag2(String wFTag2){
        this.set(FIELD_WFTAG2, wFTag2);
    }
    
    /**
     * 获取 流程标记2  
     * @return
     */
    @JsonIgnore
    public String getWFTag2(){
        Object objValue = this.get(FIELD_WFTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFTag2Dirty(){
        if(this.contains(FIELD_WFTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标记2
     */
    @JsonIgnore
    public void resetWFTag2(){
        this.reset(FIELD_WFTAG2);
    }

    /**
     * 设置 流程标记2
     * <P>
     * 等同 {@link #setWFTag2}
     * @param wFTag2
     */
    @JsonIgnore
    public PSWorkflowDTO wftag2(String wFTag2){
        this.setWFTag2(wFTag2);
        return this;
    }

    /**
     * <B>WFTAG3</B>&nbsp;流程标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_WFTAG3 = "wftag3";

    /**
     * 设置 流程标记3
     * 
     * @param wFTag3
     * 
     */
    @JsonProperty(FIELD_WFTAG3)
    public void setWFTag3(String wFTag3){
        this.set(FIELD_WFTAG3, wFTag3);
    }
    
    /**
     * 获取 流程标记3  
     * @return
     */
    @JsonIgnore
    public String getWFTag3(){
        Object objValue = this.get(FIELD_WFTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFTag3Dirty(){
        if(this.contains(FIELD_WFTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标记3
     */
    @JsonIgnore
    public void resetWFTag3(){
        this.reset(FIELD_WFTAG3);
    }

    /**
     * 设置 流程标记3
     * <P>
     * 等同 {@link #setWFTag3}
     * @param wFTag3
     */
    @JsonIgnore
    public PSWorkflowDTO wftag3(String wFTag3){
        this.setWFTag3(wFTag3);
        return this;
    }

    /**
     * <B>WFTAG4</B>&nbsp;流程标记4
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_WFTAG4 = "wftag4";

    /**
     * 设置 流程标记4
     * 
     * @param wFTag4
     * 
     */
    @JsonProperty(FIELD_WFTAG4)
    public void setWFTag4(String wFTag4){
        this.set(FIELD_WFTAG4, wFTag4);
    }
    
    /**
     * 获取 流程标记4  
     * @return
     */
    @JsonIgnore
    public String getWFTag4(){
        Object objValue = this.get(FIELD_WFTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFTag4Dirty(){
        if(this.contains(FIELD_WFTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程标记4
     */
    @JsonIgnore
    public void resetWFTag4(){
        this.reset(FIELD_WFTAG4);
    }

    /**
     * 设置 流程标记4
     * <P>
     * 等同 {@link #setWFTag4}
     * @param wFTag4
     */
    @JsonIgnore
    public PSWorkflowDTO wftag4(String wFTag4){
        this.setWFTag4(wFTag4);
        return this;
    }

    /**
     * <B>WFTYPE</B>&nbsp;工作流类型，指定工作流的类型，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WFType} 
     */
    public final static String FIELD_WFTYPE = "wftype";

    /**
     * 设置 工作流类型，详细说明：{@link #FIELD_WFTYPE}
     * 
     * @param wFType
     * 
     */
    @JsonProperty(FIELD_WFTYPE)
    public void setWFType(String wFType){
        this.set(FIELD_WFTYPE, wFType);
    }
    
    /**
     * 获取 工作流类型  
     * @return
     */
    @JsonIgnore
    public String getWFType(){
        Object objValue = this.get(FIELD_WFTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFTypeDirty(){
        if(this.contains(FIELD_WFTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流类型
     */
    @JsonIgnore
    public void resetWFType(){
        this.reset(FIELD_WFTYPE);
    }

    /**
     * 设置 工作流类型，详细说明：{@link #FIELD_WFTYPE}
     * <P>
     * 等同 {@link #setWFType}
     * @param wFType
     */
    @JsonIgnore
    public PSWorkflowDTO wftype(String wFType){
        this.setWFType(wFType);
        return this;
    }

     /**
     * 设置 工作流类型，详细说明：{@link #FIELD_WFTYPE}
     * <P>
     * 等同 {@link #setWFType}
     * @param wFType
     */
    @JsonIgnore
    public PSWorkflowDTO wftype(net.ibizsys.model.PSModelEnums.WFType wFType){
        if(wFType == null){
            this.setWFType(null);
        }
        else{
            this.setWFType(wFType.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSWorkflowId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSWorkflowId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWorkflowId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWorkflowId(strValue);
    }

    @JsonIgnore
    public PSWorkflowDTO id(String strValue){
        this.setPSWorkflowId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSWorkflowDTO){
            PSWorkflowDTO dto = (PSWorkflowDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
