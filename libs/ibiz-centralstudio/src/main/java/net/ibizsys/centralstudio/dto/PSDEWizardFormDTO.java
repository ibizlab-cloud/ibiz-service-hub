package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEWIZARDFORM</B>实体向导表单 模型传输对象
 * <P>
 * 实体向导表单模型，定义向导的操作界面，包括了操作表单，操作行为等
 */
public class PSDEWizardFormDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEWizardFormDTO(){
    }      

    /**
     * <B>CMPSLANRESID</B>&nbsp;确认消息语言资源，指定向导表单下一步操作的确认信息的多语言资源
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
    public PSDEWizardFormDTO cmpslanresid(String cMPSLanResId){
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
    public PSDEWizardFormDTO cmpslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>CMPSLANRESID2</B>&nbsp;确认消息语言资源2，指定向导表单下一步操作的确认信息2的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_CMPSLANRESID2 = "cmpslanresid2";

    /**
     * 设置 确认消息语言资源2，详细说明：{@link #FIELD_CMPSLANRESID2}
     * 
     * @param cMPSLanResId2
     * 
     */
    @JsonProperty(FIELD_CMPSLANRESID2)
    public void setCMPSLanResId2(String cMPSLanResId2){
        this.set(FIELD_CMPSLANRESID2, cMPSLanResId2);
    }
    
    /**
     * 获取 确认消息语言资源2  
     * @return
     */
    @JsonIgnore
    public String getCMPSLanResId2(){
        Object objValue = this.get(FIELD_CMPSLANRESID2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 确认消息语言资源2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCMPSLanResId2Dirty(){
        if(this.contains(FIELD_CMPSLANRESID2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 确认消息语言资源2
     */
    @JsonIgnore
    public void resetCMPSLanResId2(){
        this.reset(FIELD_CMPSLANRESID2);
    }

    /**
     * 设置 确认消息语言资源2，详细说明：{@link #FIELD_CMPSLANRESID2}
     * <P>
     * 等同 {@link #setCMPSLanResId2}
     * @param cMPSLanResId2
     */
    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresid2(String cMPSLanResId2){
        this.setCMPSLanResId2(cMPSLanResId2);
        return this;
    }

    /**
     * 设置 确认消息语言资源2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCMPSLanResId2}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresid2(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCMPSLanResId2(null);
            this.setCMPSLanResName2(null);
        }
        else{
            this.setCMPSLanResId2(pSLanguageRes.getPSLanguageResId());
            this.setCMPSLanResName2(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CMPSLANRESNAME</B>&nbsp;确认消息语言资源，指定向导表单下一步操作的确认信息的多语言资源
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
    public PSDEWizardFormDTO cmpslanresname(String cMPSLanResName){
        this.setCMPSLanResName(cMPSLanResName);
        return this;
    }

    /**
     * <B>CMPSLANRESNAME2</B>&nbsp;确认消息语言资源2，指定向导表单下一步操作的确认信息2的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CMPSLANRESID2}
     */
    public final static String FIELD_CMPSLANRESNAME2 = "cmpslanresname2";

    /**
     * 设置 确认消息语言资源2，详细说明：{@link #FIELD_CMPSLANRESNAME2}
     * 
     * @param cMPSLanResName2
     * 
     */
    @JsonProperty(FIELD_CMPSLANRESNAME2)
    public void setCMPSLanResName2(String cMPSLanResName2){
        this.set(FIELD_CMPSLANRESNAME2, cMPSLanResName2);
    }
    
    /**
     * 获取 确认消息语言资源2  
     * @return
     */
    @JsonIgnore
    public String getCMPSLanResName2(){
        Object objValue = this.get(FIELD_CMPSLANRESNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 确认消息语言资源2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCMPSLanResName2Dirty(){
        if(this.contains(FIELD_CMPSLANRESNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 确认消息语言资源2
     */
    @JsonIgnore
    public void resetCMPSLanResName2(){
        this.reset(FIELD_CMPSLANRESNAME2);
    }

    /**
     * 设置 确认消息语言资源2，详细说明：{@link #FIELD_CMPSLANRESNAME2}
     * <P>
     * 等同 {@link #setCMPSLanResName2}
     * @param cMPSLanResName2
     */
    @JsonIgnore
    public PSDEWizardFormDTO cmpslanresname2(String cMPSLanResName2){
        this.setCMPSLanResName2(cMPSLanResName2);
        return this;
    }

    /**
     * <B>CONFIRMINFO</B>&nbsp;下一步确认信息，指定向导表单下一步操作的确认信息
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CONFIRMINFO = "confirminfo";

    /**
     * 设置 下一步确认信息，详细说明：{@link #FIELD_CONFIRMINFO}
     * 
     * @param confirmInfo
     * 
     */
    @JsonProperty(FIELD_CONFIRMINFO)
    public void setConfirmInfo(String confirmInfo){
        this.set(FIELD_CONFIRMINFO, confirmInfo);
    }
    
    /**
     * 获取 下一步确认信息  
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
     * 判断 下一步确认信息 是否指定值，包括空值
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
     * 重置 下一步确认信息
     */
    @JsonIgnore
    public void resetConfirmInfo(){
        this.reset(FIELD_CONFIRMINFO);
    }

    /**
     * 设置 下一步确认信息，详细说明：{@link #FIELD_CONFIRMINFO}
     * <P>
     * 等同 {@link #setConfirmInfo}
     * @param confirmInfo
     */
    @JsonIgnore
    public PSDEWizardFormDTO confirminfo(String confirmInfo){
        this.setConfirmInfo(confirmInfo);
        return this;
    }

    /**
     * <B>CONFIRMINFO2</B>&nbsp;下一步确认信息2，指定向导表单下一步操作的确认信息2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CONFIRMINFO2 = "confirminfo2";

    /**
     * 设置 下一步确认信息2，详细说明：{@link #FIELD_CONFIRMINFO2}
     * 
     * @param confirmInfo2
     * 
     */
    @JsonProperty(FIELD_CONFIRMINFO2)
    public void setConfirmInfo2(String confirmInfo2){
        this.set(FIELD_CONFIRMINFO2, confirmInfo2);
    }
    
    /**
     * 获取 下一步确认信息2  
     * @return
     */
    @JsonIgnore
    public String getConfirmInfo2(){
        Object objValue = this.get(FIELD_CONFIRMINFO2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步确认信息2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConfirmInfo2Dirty(){
        if(this.contains(FIELD_CONFIRMINFO2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步确认信息2
     */
    @JsonIgnore
    public void resetConfirmInfo2(){
        this.reset(FIELD_CONFIRMINFO2);
    }

    /**
     * 设置 下一步确认信息2，详细说明：{@link #FIELD_CONFIRMINFO2}
     * <P>
     * 等同 {@link #setConfirmInfo2}
     * @param confirmInfo2
     */
    @JsonIgnore
    public PSDEWizardFormDTO confirminfo2(String confirmInfo2){
        this.setConfirmInfo2(confirmInfo2);
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
    public PSDEWizardFormDTO createdate(Timestamp createDate){
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
    public PSDEWizardFormDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FINISHENABLELOGIC</B>&nbsp;完成启用逻辑
     */
    public final static String FIELD_FINISHENABLELOGIC = "finishenablelogic";

    /**
     * 设置 完成启用逻辑
     * 
     * @param finishEnableLogic
     * 
     */
    @JsonProperty(FIELD_FINISHENABLELOGIC)
    public void setFinishEnableLogic(String finishEnableLogic){
        this.set(FIELD_FINISHENABLELOGIC, finishEnableLogic);
    }
    
    /**
     * 获取 完成启用逻辑  
     * @return
     */
    @JsonIgnore
    public String getFinishEnableLogic(){
        Object objValue = this.get(FIELD_FINISHENABLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成启用逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishEnableLogicDirty(){
        if(this.contains(FIELD_FINISHENABLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成启用逻辑
     */
    @JsonIgnore
    public void resetFinishEnableLogic(){
        this.reset(FIELD_FINISHENABLELOGIC);
    }

    /**
     * 设置 完成启用逻辑
     * <P>
     * 等同 {@link #setFinishEnableLogic}
     * @param finishEnableLogic
     */
    @JsonIgnore
    public PSDEWizardFormDTO finishenablelogic(String finishEnableLogic){
        this.setFinishEnableLogic(finishEnableLogic);
        return this;
    }

    /**
     * <B>FIRSTFORM</B>&nbsp;首表单，指定向导表单是否为所在实体向导的默认显示表单，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FIRSTFORM = "firstform";

    /**
     * 设置 首表单，详细说明：{@link #FIELD_FIRSTFORM}
     * 
     * @param firstForm
     * 
     */
    @JsonProperty(FIELD_FIRSTFORM)
    public void setFirstForm(Integer firstForm){
        this.set(FIELD_FIRSTFORM, firstForm);
    }
    
    /**
     * 获取 首表单  
     * @return
     */
    @JsonIgnore
    public Integer getFirstForm(){
        Object objValue = this.get(FIELD_FIRSTFORM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 首表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFirstFormDirty(){
        if(this.contains(FIELD_FIRSTFORM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 首表单
     */
    @JsonIgnore
    public void resetFirstForm(){
        this.reset(FIELD_FIRSTFORM);
    }

    /**
     * 设置 首表单，详细说明：{@link #FIELD_FIRSTFORM}
     * <P>
     * 等同 {@link #setFirstForm}
     * @param firstForm
     */
    @JsonIgnore
    public PSDEWizardFormDTO firstform(Integer firstForm){
        this.setFirstForm(firstForm);
        return this;
    }

     /**
     * 设置 首表单，详细说明：{@link #FIELD_FIRSTFORM}
     * <P>
     * 等同 {@link #setFirstForm}
     * @param firstForm
     */
    @JsonIgnore
    public PSDEWizardFormDTO firstform(Boolean firstForm){
        if(firstForm == null){
            this.setFirstForm(null);
        }
        else{
            this.setFirstForm(firstForm?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FORMTAG</B>&nbsp;表单标识，指定向导表单的标记，需在所在实体向导中具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成
     */
    public final static String FIELD_FORMTAG = "formtag";

    /**
     * 设置 表单标识，详细说明：{@link #FIELD_FORMTAG}
     * 
     * @param formTag
     * 
     */
    @JsonProperty(FIELD_FORMTAG)
    public void setFormTag(String formTag){
        this.set(FIELD_FORMTAG, formTag);
    }
    
    /**
     * 获取 表单标识  
     * @return
     */
    @JsonIgnore
    public String getFormTag(){
        Object objValue = this.get(FIELD_FORMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormTagDirty(){
        if(this.contains(FIELD_FORMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单标识
     */
    @JsonIgnore
    public void resetFormTag(){
        this.reset(FIELD_FORMTAG);
    }

    /**
     * 设置 表单标识，详细说明：{@link #FIELD_FORMTAG}
     * <P>
     * 等同 {@link #setFormTag}
     * @param formTag
     */
    @JsonIgnore
    public PSDEWizardFormDTO formtag(String formTag){
        this.setFormTag(formTag);
        return this;
    }

    /**
     * <B>LOADPSDEACTIONID</B>&nbsp;加载操作，指定向导表单数据加载调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_LOADPSDEACTIONID = "loadpsdeactionid";

    /**
     * 设置 加载操作，详细说明：{@link #FIELD_LOADPSDEACTIONID}
     * 
     * @param loadPSDEActionId
     * 
     */
    @JsonProperty(FIELD_LOADPSDEACTIONID)
    public void setLoadPSDEActionId(String loadPSDEActionId){
        this.set(FIELD_LOADPSDEACTIONID, loadPSDEActionId);
    }
    
    /**
     * 获取 加载操作  
     * @return
     */
    @JsonIgnore
    public String getLoadPSDEActionId(){
        Object objValue = this.get(FIELD_LOADPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 加载操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLoadPSDEActionIdDirty(){
        if(this.contains(FIELD_LOADPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 加载操作
     */
    @JsonIgnore
    public void resetLoadPSDEActionId(){
        this.reset(FIELD_LOADPSDEACTIONID);
    }

    /**
     * 设置 加载操作，详细说明：{@link #FIELD_LOADPSDEACTIONID}
     * <P>
     * 等同 {@link #setLoadPSDEActionId}
     * @param loadPSDEActionId
     */
    @JsonIgnore
    public PSDEWizardFormDTO loadpsdeactionid(String loadPSDEActionId){
        this.setLoadPSDEActionId(loadPSDEActionId);
        return this;
    }

    /**
     * 设置 加载操作，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLoadPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO loadpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setLoadPSDEActionId(null);
            this.setLoadPSDEActionName(null);
        }
        else{
            this.setLoadPSDEActionId(pSDEAction.getPSDEActionId());
            this.setLoadPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>LOADPSDEACTIONNAME</B>&nbsp;加载操作，指定向导表单数据加载调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LOADPSDEACTIONID}
     */
    public final static String FIELD_LOADPSDEACTIONNAME = "loadpsdeactionname";

    /**
     * 设置 加载操作，详细说明：{@link #FIELD_LOADPSDEACTIONNAME}
     * 
     * @param loadPSDEActionName
     * 
     */
    @JsonProperty(FIELD_LOADPSDEACTIONNAME)
    public void setLoadPSDEActionName(String loadPSDEActionName){
        this.set(FIELD_LOADPSDEACTIONNAME, loadPSDEActionName);
    }
    
    /**
     * 获取 加载操作  
     * @return
     */
    @JsonIgnore
    public String getLoadPSDEActionName(){
        Object objValue = this.get(FIELD_LOADPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 加载操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLoadPSDEActionNameDirty(){
        if(this.contains(FIELD_LOADPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 加载操作
     */
    @JsonIgnore
    public void resetLoadPSDEActionName(){
        this.reset(FIELD_LOADPSDEACTIONNAME);
    }

    /**
     * 设置 加载操作，详细说明：{@link #FIELD_LOADPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setLoadPSDEActionName}
     * @param loadPSDEActionName
     */
    @JsonIgnore
    public PSDEWizardFormDTO loadpsdeactionname(String loadPSDEActionName){
        this.setLoadPSDEActionName(loadPSDEActionName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEWizardFormDTO logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEWizardFormDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBPSDEFORMID</B>&nbsp;移动端表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFormDTO} 
     */
    public final static String FIELD_MOBPSDEFORMID = "mobpsdeformid";

    /**
     * 设置 移动端表单
     * 
     * @param mobPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMID)
    public void setMobPSDEFormId(String mobPSDEFormId){
        this.set(FIELD_MOBPSDEFORMID, mobPSDEFormId);
    }
    
    /**
     * 获取 移动端表单  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEFormId(){
        Object objValue = this.get(FIELD_MOBPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEFormIdDirty(){
        if(this.contains(FIELD_MOBPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端表单
     */
    @JsonIgnore
    public void resetMobPSDEFormId(){
        this.reset(FIELD_MOBPSDEFORMID);
    }

    /**
     * 设置 移动端表单
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param mobPSDEFormId
     */
    @JsonIgnore
    public PSDEWizardFormDTO mobpsdeformid(String mobPSDEFormId){
        this.setMobPSDEFormId(mobPSDEFormId);
        return this;
    }

    /**
     * 设置 移动端表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO mobpsdeformid(PSDEFormDTO pSDEForm){
        if(pSDEForm == null){
            this.setMobPSDEFormId(null);
            this.setMobPSDEFormName(null);
        }
        else{
            this.setMobPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMobPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MOBPSDEFORMNAME</B>&nbsp;移动端表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEFORMID}
     */
    public final static String FIELD_MOBPSDEFORMNAME = "mobpsdeformname";

    /**
     * 设置 移动端表单
     * 
     * @param mobPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEFORMNAME)
    public void setMobPSDEFormName(String mobPSDEFormName){
        this.set(FIELD_MOBPSDEFORMNAME, mobPSDEFormName);
    }
    
    /**
     * 获取 移动端表单  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEFormName(){
        Object objValue = this.get(FIELD_MOBPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEFormNameDirty(){
        if(this.contains(FIELD_MOBPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端表单
     */
    @JsonIgnore
    public void resetMobPSDEFormName(){
        this.reset(FIELD_MOBPSDEFORMNAME);
    }

    /**
     * 设置 移动端表单
     * <P>
     * 等同 {@link #setMobPSDEFormName}
     * @param mobPSDEFormName
     */
    @JsonIgnore
    public PSDEWizardFormDTO mobpsdeformname(String mobPSDEFormName){
        this.setMobPSDEFormName(mobPSDEFormName);
        return this;
    }

    /**
     * <B>NEXTENABLELOGIC</B>&nbsp;下一步启用逻辑
     */
    public final static String FIELD_NEXTENABLELOGIC = "nextenablelogic";

    /**
     * 设置 下一步启用逻辑
     * 
     * @param nextEnableLogic
     * 
     */
    @JsonProperty(FIELD_NEXTENABLELOGIC)
    public void setNextEnableLogic(String nextEnableLogic){
        this.set(FIELD_NEXTENABLELOGIC, nextEnableLogic);
    }
    
    /**
     * 获取 下一步启用逻辑  
     * @return
     */
    @JsonIgnore
    public String getNextEnableLogic(){
        Object objValue = this.get(FIELD_NEXTENABLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步启用逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextEnableLogicDirty(){
        if(this.contains(FIELD_NEXTENABLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步启用逻辑
     */
    @JsonIgnore
    public void resetNextEnableLogic(){
        this.reset(FIELD_NEXTENABLELOGIC);
    }

    /**
     * 设置 下一步启用逻辑
     * <P>
     * 等同 {@link #setNextEnableLogic}
     * @param nextEnableLogic
     */
    @JsonIgnore
    public PSDEWizardFormDTO nextenablelogic(String nextEnableLogic){
        this.setNextEnableLogic(nextEnableLogic);
        return this;
    }

    /**
     * <B>PREVENABLELOGIC</B>&nbsp;上一步启用逻辑
     */
    public final static String FIELD_PREVENABLELOGIC = "prevenablelogic";

    /**
     * 设置 上一步启用逻辑
     * 
     * @param prevEnableLogic
     * 
     */
    @JsonProperty(FIELD_PREVENABLELOGIC)
    public void setPrevEnableLogic(String prevEnableLogic){
        this.set(FIELD_PREVENABLELOGIC, prevEnableLogic);
    }
    
    /**
     * 获取 上一步启用逻辑  
     * @return
     */
    @JsonIgnore
    public String getPrevEnableLogic(){
        Object objValue = this.get(FIELD_PREVENABLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上一步启用逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevEnableLogicDirty(){
        if(this.contains(FIELD_PREVENABLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上一步启用逻辑
     */
    @JsonIgnore
    public void resetPrevEnableLogic(){
        this.reset(FIELD_PREVENABLELOGIC);
    }

    /**
     * 设置 上一步启用逻辑
     * <P>
     * 等同 {@link #setPrevEnableLogic}
     * @param prevEnableLogic
     */
    @JsonIgnore
    public PSDEWizardFormDTO prevenablelogic(String prevEnableLogic){
        this.setPrevEnableLogic(prevEnableLogic);
        return this;
    }

    /**
     * <B>PREVPSDEACTIONID</B>&nbsp;上一步操作，指定向导表单上一步操作调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_PREVPSDEACTIONID = "prevpsdeactionid";

    /**
     * 设置 上一步操作，详细说明：{@link #FIELD_PREVPSDEACTIONID}
     * 
     * @param prevPSDEActionId
     * 
     */
    @JsonProperty(FIELD_PREVPSDEACTIONID)
    public void setPrevPSDEActionId(String prevPSDEActionId){
        this.set(FIELD_PREVPSDEACTIONID, prevPSDEActionId);
    }
    
    /**
     * 获取 上一步操作  
     * @return
     */
    @JsonIgnore
    public String getPrevPSDEActionId(){
        Object objValue = this.get(FIELD_PREVPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上一步操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevPSDEActionIdDirty(){
        if(this.contains(FIELD_PREVPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上一步操作
     */
    @JsonIgnore
    public void resetPrevPSDEActionId(){
        this.reset(FIELD_PREVPSDEACTIONID);
    }

    /**
     * 设置 上一步操作，详细说明：{@link #FIELD_PREVPSDEACTIONID}
     * <P>
     * 等同 {@link #setPrevPSDEActionId}
     * @param prevPSDEActionId
     */
    @JsonIgnore
    public PSDEWizardFormDTO prevpsdeactionid(String prevPSDEActionId){
        this.setPrevPSDEActionId(prevPSDEActionId);
        return this;
    }

    /**
     * 设置 上一步操作，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPrevPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO prevpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setPrevPSDEActionId(null);
            this.setPrevPSDEActionName(null);
        }
        else{
            this.setPrevPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPrevPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PREVPSDEACTIONNAME</B>&nbsp;上一步操作，指定向导表单上一步操作调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PREVPSDEACTIONID}
     */
    public final static String FIELD_PREVPSDEACTIONNAME = "prevpsdeactionname";

    /**
     * 设置 上一步操作，详细说明：{@link #FIELD_PREVPSDEACTIONNAME}
     * 
     * @param prevPSDEActionName
     * 
     */
    @JsonProperty(FIELD_PREVPSDEACTIONNAME)
    public void setPrevPSDEActionName(String prevPSDEActionName){
        this.set(FIELD_PREVPSDEACTIONNAME, prevPSDEActionName);
    }
    
    /**
     * 获取 上一步操作  
     * @return
     */
    @JsonIgnore
    public String getPrevPSDEActionName(){
        Object objValue = this.get(FIELD_PREVPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上一步操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevPSDEActionNameDirty(){
        if(this.contains(FIELD_PREVPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上一步操作
     */
    @JsonIgnore
    public void resetPrevPSDEActionName(){
        this.reset(FIELD_PREVPSDEACTIONNAME);
    }

    /**
     * 设置 上一步操作，详细说明：{@link #FIELD_PREVPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPrevPSDEActionName}
     * @param prevPSDEActionName
     */
    @JsonIgnore
    public PSDEWizardFormDTO prevpsdeactionname(String prevPSDEActionName){
        this.setPrevPSDEActionName(prevPSDEActionName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单，指定向导表单使用的实体表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFormDTO} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 实体表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormId(){
        Object objValue = this.get(FIELD_PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormIdDirty(){
        if(this.contains(FIELD_PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdeformid(PSDEFormDTO pSDEForm){
        if(pSDEForm == null){
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        }
        else{
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;实体表单，指定向导表单使用的实体表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 实体表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormName(){
        Object objValue = this.get(FIELD_PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormNameDirty(){
        if(this.contains(FIELD_PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEWIZARDFORMID</B>&nbsp;实体向导表单标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEWIZARDFORMID = "psdewizardformid";

    /**
     * 设置 实体向导表单标识
     * 
     * @param pSDEWizardFormId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDFORMID)
    public void setPSDEWizardFormId(String pSDEWizardFormId){
        this.set(FIELD_PSDEWIZARDFORMID, pSDEWizardFormId);
    }
    
    /**
     * 获取 实体向导表单标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardFormId(){
        Object objValue = this.get(FIELD_PSDEWIZARDFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导表单标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardFormIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导表单标识
     */
    @JsonIgnore
    public void resetPSDEWizardFormId(){
        this.reset(FIELD_PSDEWIZARDFORMID);
    }

    /**
     * 设置 实体向导表单标识
     * <P>
     * 等同 {@link #setPSDEWizardFormId}
     * @param pSDEWizardFormId
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardformid(String pSDEWizardFormId){
        this.setPSDEWizardFormId(pSDEWizardFormId);
        return this;
    }

    /**
     * <B>PSDEWIZARDFORMNAME</B>&nbsp;向导表单名称，指定向导表单的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEWIZARDFORMNAME = "psdewizardformname";

    /**
     * 设置 向导表单名称，详细说明：{@link #FIELD_PSDEWIZARDFORMNAME}
     * 
     * @param pSDEWizardFormName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDFORMNAME)
    public void setPSDEWizardFormName(String pSDEWizardFormName){
        this.set(FIELD_PSDEWIZARDFORMNAME, pSDEWizardFormName);
    }
    
    /**
     * 获取 向导表单名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardFormName(){
        Object objValue = this.get(FIELD_PSDEWIZARDFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导表单名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardFormNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导表单名称
     */
    @JsonIgnore
    public void resetPSDEWizardFormName(){
        this.reset(FIELD_PSDEWIZARDFORMNAME);
    }

    /**
     * 设置 向导表单名称，详细说明：{@link #FIELD_PSDEWIZARDFORMNAME}
     * <P>
     * 等同 {@link #setPSDEWizardFormName}
     * @param pSDEWizardFormName
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardformname(String pSDEWizardFormName){
        this.setPSDEWizardFormName(pSDEWizardFormName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEWizardFormName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEWizardFormName(strName);
    }

    @JsonIgnore
    public PSDEWizardFormDTO name(String strName){
        this.setPSDEWizardFormName(strName);
        return this;
    }

    /**
     * <B>PSDEWIZARDID</B>&nbsp;实体向导，指定向导表单所属的实体向导
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO} 
     */
    public final static String FIELD_PSDEWIZARDID = "psdewizardid";

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDID}
     * 
     * @param pSDEWizardId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDID)
    public void setPSDEWizardId(String pSDEWizardId){
        this.set(FIELD_PSDEWIZARDID, pSDEWizardId);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardId(){
        Object objValue = this.get(FIELD_PSDEWIZARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardId(){
        this.reset(FIELD_PSDEWIZARDID);
    }

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDID}
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizardId
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardid(String pSDEWizardId){
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    /**
     * 设置 实体向导，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizard 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardid(PSDEWizardDTO pSDEWizard){
        if(pSDEWizard == null){
            this.setPSDEId(null);
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        }
        else{
            this.setPSDEId(pSDEWizard.getPSDEId());
            this.setPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDNAME</B>&nbsp;实体向导，指定向导表单所属的实体向导
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEWIZARDNAME = "psdewizardname";

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * 
     * @param pSDEWizardName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDNAME)
    public void setPSDEWizardName(String pSDEWizardName){
        this.set(FIELD_PSDEWIZARDNAME, pSDEWizardName);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardName(){
        Object objValue = this.get(FIELD_PSDEWIZARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardName(){
        this.reset(FIELD_PSDEWIZARDNAME);
    }

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * <P>
     * 等同 {@link #setPSDEWizardName}
     * @param pSDEWizardName
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardname(String pSDEWizardName){
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    /**
     * <B>PSDEWIZARDSTEPID</B>&nbsp;向导步骤，指定向导表单对应的向导步骤
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO} 
     */
    public final static String FIELD_PSDEWIZARDSTEPID = "psdewizardstepid";

    /**
     * 设置 向导步骤，详细说明：{@link #FIELD_PSDEWIZARDSTEPID}
     * 
     * @param pSDEWizardStepId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPID)
    public void setPSDEWizardStepId(String pSDEWizardStepId){
        this.set(FIELD_PSDEWIZARDSTEPID, pSDEWizardStepId);
    }
    
    /**
     * 获取 向导步骤  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardStepId(){
        Object objValue = this.get(FIELD_PSDEWIZARDSTEPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导步骤 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardStepIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDSTEPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导步骤
     */
    @JsonIgnore
    public void resetPSDEWizardStepId(){
        this.reset(FIELD_PSDEWIZARDSTEPID);
    }

    /**
     * 设置 向导步骤，详细说明：{@link #FIELD_PSDEWIZARDSTEPID}
     * <P>
     * 等同 {@link #setPSDEWizardStepId}
     * @param pSDEWizardStepId
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardstepid(String pSDEWizardStepId){
        this.setPSDEWizardStepId(pSDEWizardStepId);
        return this;
    }

    /**
     * 设置 向导步骤，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardStepId}
     * @param pSDEWizardStep 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardstepid(PSDEWizardStepDTO pSDEWizardStep){
        if(pSDEWizardStep == null){
            this.setPSDEWizardStepId(null);
            this.setPSDEWizardStepName(null);
            this.setStepOrderValue(null);
        }
        else{
            this.setPSDEWizardStepId(pSDEWizardStep.getPSDEWizardStepId());
            this.setPSDEWizardStepName(pSDEWizardStep.getPSDEWizardStepName());
            this.setStepOrderValue(pSDEWizardStep.getOrderValue());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDSTEPNAME</B>&nbsp;向导步骤，指定向导表单对应的向导步骤
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDSTEPID}
     */
    public final static String FIELD_PSDEWIZARDSTEPNAME = "psdewizardstepname";

    /**
     * 设置 向导步骤，详细说明：{@link #FIELD_PSDEWIZARDSTEPNAME}
     * 
     * @param pSDEWizardStepName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPNAME)
    public void setPSDEWizardStepName(String pSDEWizardStepName){
        this.set(FIELD_PSDEWIZARDSTEPNAME, pSDEWizardStepName);
    }
    
    /**
     * 获取 向导步骤  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardStepName(){
        Object objValue = this.get(FIELD_PSDEWIZARDSTEPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导步骤 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardStepNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDSTEPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导步骤
     */
    @JsonIgnore
    public void resetPSDEWizardStepName(){
        this.reset(FIELD_PSDEWIZARDSTEPNAME);
    }

    /**
     * 设置 向导步骤，详细说明：{@link #FIELD_PSDEWIZARDSTEPNAME}
     * <P>
     * 等同 {@link #setPSDEWizardStepName}
     * @param pSDEWizardStepName
     */
    @JsonIgnore
    public PSDEWizardFormDTO psdewizardstepname(String pSDEWizardStepName){
        this.setPSDEWizardStepName(pSDEWizardStepName);
        return this;
    }

    /**
     * <B>SAVEPSDEACTIONID</B>&nbsp;下一步操作，指定向导表单下一步操作调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_SAVEPSDEACTIONID = "savepsdeactionid";

    /**
     * 设置 下一步操作，详细说明：{@link #FIELD_SAVEPSDEACTIONID}
     * 
     * @param savePSDEActionId
     * 
     */
    @JsonProperty(FIELD_SAVEPSDEACTIONID)
    public void setSavePSDEActionId(String savePSDEActionId){
        this.set(FIELD_SAVEPSDEACTIONID, savePSDEActionId);
    }
    
    /**
     * 获取 下一步操作  
     * @return
     */
    @JsonIgnore
    public String getSavePSDEActionId(){
        Object objValue = this.get(FIELD_SAVEPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSavePSDEActionIdDirty(){
        if(this.contains(FIELD_SAVEPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步操作
     */
    @JsonIgnore
    public void resetSavePSDEActionId(){
        this.reset(FIELD_SAVEPSDEACTIONID);
    }

    /**
     * 设置 下一步操作，详细说明：{@link #FIELD_SAVEPSDEACTIONID}
     * <P>
     * 等同 {@link #setSavePSDEActionId}
     * @param savePSDEActionId
     */
    @JsonIgnore
    public PSDEWizardFormDTO savepsdeactionid(String savePSDEActionId){
        this.setSavePSDEActionId(savePSDEActionId);
        return this;
    }

    /**
     * 设置 下一步操作，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSavePSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardFormDTO savepsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setSavePSDEActionId(null);
            this.setSavePSDEActionName(null);
        }
        else{
            this.setSavePSDEActionId(pSDEAction.getPSDEActionId());
            this.setSavePSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>SAVEPSDEACTIONNAME</B>&nbsp;下一步操作，指定向导表单下一步操作调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SAVEPSDEACTIONID}
     */
    public final static String FIELD_SAVEPSDEACTIONNAME = "savepsdeactionname";

    /**
     * 设置 下一步操作，详细说明：{@link #FIELD_SAVEPSDEACTIONNAME}
     * 
     * @param savePSDEActionName
     * 
     */
    @JsonProperty(FIELD_SAVEPSDEACTIONNAME)
    public void setSavePSDEActionName(String savePSDEActionName){
        this.set(FIELD_SAVEPSDEACTIONNAME, savePSDEActionName);
    }
    
    /**
     * 获取 下一步操作  
     * @return
     */
    @JsonIgnore
    public String getSavePSDEActionName(){
        Object objValue = this.get(FIELD_SAVEPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSavePSDEActionNameDirty(){
        if(this.contains(FIELD_SAVEPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步操作
     */
    @JsonIgnore
    public void resetSavePSDEActionName(){
        this.reset(FIELD_SAVEPSDEACTIONNAME);
    }

    /**
     * 设置 下一步操作，详细说明：{@link #FIELD_SAVEPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setSavePSDEActionName}
     * @param savePSDEActionName
     */
    @JsonIgnore
    public PSDEWizardFormDTO savepsdeactionname(String savePSDEActionName){
        this.setSavePSDEActionName(savePSDEActionName);
        return this;
    }

    /**
     * <B>STEPACTIONS</B>&nbsp;向导步骤行为，指定向导表单支持的操作步骤
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WizardStepAction} 
     */
    public final static String FIELD_STEPACTIONS = "stepactions";

    /**
     * 设置 向导步骤行为，详细说明：{@link #FIELD_STEPACTIONS}
     * 
     * @param stepActions
     * 
     */
    @JsonProperty(FIELD_STEPACTIONS)
    public void setStepActions(String stepActions){
        this.set(FIELD_STEPACTIONS, stepActions);
    }
    
    /**
     * 获取 向导步骤行为  
     * @return
     */
    @JsonIgnore
    public String getStepActions(){
        Object objValue = this.get(FIELD_STEPACTIONS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导步骤行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepActionsDirty(){
        if(this.contains(FIELD_STEPACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导步骤行为
     */
    @JsonIgnore
    public void resetStepActions(){
        this.reset(FIELD_STEPACTIONS);
    }

    /**
     * 设置 向导步骤行为，详细说明：{@link #FIELD_STEPACTIONS}
     * <P>
     * 等同 {@link #setStepActions}
     * @param stepActions
     */
    @JsonIgnore
    public PSDEWizardFormDTO stepactions(String stepActions){
        this.setStepActions(stepActions);
        return this;
    }

     /**
     * 设置 向导步骤行为，详细说明：{@link #FIELD_STEPACTIONS}
     * <P>
     * 等同 {@link #setStepActions}
     * @param stepActions
     */
    @JsonIgnore
    public PSDEWizardFormDTO stepactions(net.ibizsys.model.PSModelEnums.WizardStepAction[] stepActions){
        if(stepActions == null || stepActions.length == 0){
            this.setStepActions(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.model.PSModelEnums.WizardStepAction _item : stepActions){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setStepActions(_value);
        }
        return this;
    }

    /**
     * <B>STEPORDERVALUE</B>&nbsp;步骤排序值
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDSTEPID}
     */
    public final static String FIELD_STEPORDERVALUE = "stepordervalue";

    /**
     * 设置 步骤排序值
     * 
     * @param stepOrderValue
     * 
     */
    @JsonProperty(FIELD_STEPORDERVALUE)
    public void setStepOrderValue(Integer stepOrderValue){
        this.set(FIELD_STEPORDERVALUE, stepOrderValue);
    }
    
    /**
     * 获取 步骤排序值  
     * @return
     */
    @JsonIgnore
    public Integer getStepOrderValue(){
        Object objValue = this.get(FIELD_STEPORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 步骤排序值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepOrderValueDirty(){
        if(this.contains(FIELD_STEPORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 步骤排序值
     */
    @JsonIgnore
    public void resetStepOrderValue(){
        this.reset(FIELD_STEPORDERVALUE);
    }

    /**
     * 设置 步骤排序值
     * <P>
     * 等同 {@link #setStepOrderValue}
     * @param stepOrderValue
     */
    @JsonIgnore
    public PSDEWizardFormDTO stepordervalue(Integer stepOrderValue){
        this.setStepOrderValue(stepOrderValue);
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
    public PSDEWizardFormDTO updatedate(Timestamp updateDate){
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
    public PSDEWizardFormDTO updateman(String updateMan){
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
    public PSDEWizardFormDTO usercat(String userCat){
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
    public PSDEWizardFormDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEWizardFormDTO usertag(String userTag){
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
    public PSDEWizardFormDTO usertag2(String userTag2){
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
    public PSDEWizardFormDTO usertag3(String userTag3){
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
    public PSDEWizardFormDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEWizardFormId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEWizardFormId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEWizardFormId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEWizardFormId(strValue);
    }

    @JsonIgnore
    public PSDEWizardFormDTO id(String strValue){
        this.setPSDEWizardFormId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEWizardFormDTO){
            PSDEWizardFormDTO dto = (PSDEWizardFormDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
