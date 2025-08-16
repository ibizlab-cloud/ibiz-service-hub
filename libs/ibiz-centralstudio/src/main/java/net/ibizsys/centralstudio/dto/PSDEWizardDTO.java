package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEWIZARD</B>实体向导 模型传输对象
 * <P>
 * 实体向导模型，定义向导的界面及处理信息，包括初始化，完成等处理逻辑，向导模型包含向导步骤及向导表单成员模型
 */
public class PSDEWizardDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEWizardDTO(){
    }      

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEWizardDTO busyindicator(Integer busyIndicator){
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
    public PSDEWizardDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定向导的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEWizardDTO codename(String codeName){
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
    public PSDEWizardDTO createdate(Timestamp createDate){
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
    public PSDEWizardDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENABLEMSLOGIC</B>&nbsp;启用主状态逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMSLOGIC = "enablemslogic";

    /**
     * 设置 启用主状态逻辑
     * 
     * @param enableMSLogic
     * 
     */
    @JsonProperty(FIELD_ENABLEMSLOGIC)
    public void setEnableMSLogic(Integer enableMSLogic){
        this.set(FIELD_ENABLEMSLOGIC, enableMSLogic);
    }
    
    /**
     * 获取 启用主状态逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMSLogic(){
        Object objValue = this.get(FIELD_ENABLEMSLOGIC);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用主状态逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMSLogicDirty(){
        if(this.contains(FIELD_ENABLEMSLOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用主状态逻辑
     */
    @JsonIgnore
    public void resetEnableMSLogic(){
        this.reset(FIELD_ENABLEMSLOGIC);
    }

    /**
     * 设置 启用主状态逻辑
     * <P>
     * 等同 {@link #setEnableMSLogic}
     * @param enableMSLogic
     */
    @JsonIgnore
    public PSDEWizardDTO enablemslogic(Integer enableMSLogic){
        this.setEnableMSLogic(enableMSLogic);
        return this;
    }

     /**
     * 设置 启用主状态逻辑
     * <P>
     * 等同 {@link #setEnableMSLogic}
     * @param enableMSLogic
     */
    @JsonIgnore
    public PSDEWizardDTO enablemslogic(Boolean enableMSLogic){
        if(enableMSLogic == null){
            this.setEnableMSLogic(null);
        }
        else{
            this.setEnableMSLogic(enableMSLogic?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FINISHCAPTION</B>&nbsp;完成标题，指定向导完成操作的显示标题
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FINISHCAPTION = "finishcaption";

    /**
     * 设置 完成标题，详细说明：{@link #FIELD_FINISHCAPTION}
     * 
     * @param finishCaption
     * 
     */
    @JsonProperty(FIELD_FINISHCAPTION)
    public void setFinishCaption(String finishCaption){
        this.set(FIELD_FINISHCAPTION, finishCaption);
    }
    
    /**
     * 获取 完成标题  
     * @return
     */
    @JsonIgnore
    public String getFinishCaption(){
        Object objValue = this.get(FIELD_FINISHCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishCaptionDirty(){
        if(this.contains(FIELD_FINISHCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成标题
     */
    @JsonIgnore
    public void resetFinishCaption(){
        this.reset(FIELD_FINISHCAPTION);
    }

    /**
     * 设置 完成标题，详细说明：{@link #FIELD_FINISHCAPTION}
     * <P>
     * 等同 {@link #setFinishCaption}
     * @param finishCaption
     */
    @JsonIgnore
    public PSDEWizardDTO finishcaption(String finishCaption){
        this.setFinishCaption(finishCaption);
        return this;
    }

    /**
     * <B>FINISHPSDEACTIONID</B>&nbsp;完成操作实体行为，指定向导完成操作调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_FINISHPSDEACTIONID = "finishpsdeactionid";

    /**
     * 设置 完成操作实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONID}
     * 
     * @param finishPSDEActionId
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEACTIONID)
    public void setFinishPSDEActionId(String finishPSDEActionId){
        this.set(FIELD_FINISHPSDEACTIONID, finishPSDEActionId);
    }
    
    /**
     * 获取 完成操作实体行为  
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
     * 判断 完成操作实体行为 是否指定值，包括空值
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
     * 重置 完成操作实体行为
     */
    @JsonIgnore
    public void resetFinishPSDEActionId(){
        this.reset(FIELD_FINISHPSDEACTIONID);
    }

    /**
     * 设置 完成操作实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONID}
     * <P>
     * 等同 {@link #setFinishPSDEActionId}
     * @param finishPSDEActionId
     */
    @JsonIgnore
    public PSDEWizardDTO finishpsdeactionid(String finishPSDEActionId){
        this.setFinishPSDEActionId(finishPSDEActionId);
        return this;
    }

    /**
     * 设置 完成操作实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFinishPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO finishpsdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>FINISHPSDEACTIONNAME</B>&nbsp;完成操作实体行为，指定向导完成操作调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FINISHPSDEACTIONID}
     */
    public final static String FIELD_FINISHPSDEACTIONNAME = "finishpsdeactionname";

    /**
     * 设置 完成操作实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONNAME}
     * 
     * @param finishPSDEActionName
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEACTIONNAME)
    public void setFinishPSDEActionName(String finishPSDEActionName){
        this.set(FIELD_FINISHPSDEACTIONNAME, finishPSDEActionName);
    }
    
    /**
     * 获取 完成操作实体行为  
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
     * 判断 完成操作实体行为 是否指定值，包括空值
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
     * 重置 完成操作实体行为
     */
    @JsonIgnore
    public void resetFinishPSDEActionName(){
        this.reset(FIELD_FINISHPSDEACTIONNAME);
    }

    /**
     * 设置 完成操作实体行为，详细说明：{@link #FIELD_FINISHPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setFinishPSDEActionName}
     * @param finishPSDEActionName
     */
    @JsonIgnore
    public PSDEWizardDTO finishpsdeactionname(String finishPSDEActionName){
        this.setFinishPSDEActionName(finishPSDEActionName);
        return this;
    }

    /**
     * <B>FINISHPSLANRESID</B>&nbsp;完成语言资源，指定向导完成操作的标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_FINISHPSLANRESID = "finishpslanresid";

    /**
     * 设置 完成语言资源，详细说明：{@link #FIELD_FINISHPSLANRESID}
     * 
     * @param finishPSLanResId
     * 
     */
    @JsonProperty(FIELD_FINISHPSLANRESID)
    public void setFinishPSLanResId(String finishPSLanResId){
        this.set(FIELD_FINISHPSLANRESID, finishPSLanResId);
    }
    
    /**
     * 获取 完成语言资源  
     * @return
     */
    @JsonIgnore
    public String getFinishPSLanResId(){
        Object objValue = this.get(FIELD_FINISHPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishPSLanResIdDirty(){
        if(this.contains(FIELD_FINISHPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成语言资源
     */
    @JsonIgnore
    public void resetFinishPSLanResId(){
        this.reset(FIELD_FINISHPSLANRESID);
    }

    /**
     * 设置 完成语言资源，详细说明：{@link #FIELD_FINISHPSLANRESID}
     * <P>
     * 等同 {@link #setFinishPSLanResId}
     * @param finishPSLanResId
     */
    @JsonIgnore
    public PSDEWizardDTO finishpslanresid(String finishPSLanResId){
        this.setFinishPSLanResId(finishPSLanResId);
        return this;
    }

    /**
     * 设置 完成语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFinishPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO finishpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setFinishPSLanResId(null);
            this.setFinishPSLanResName(null);
        }
        else{
            this.setFinishPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setFinishPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>FINISHPSLANRESNAME</B>&nbsp;完成语言资源，指定向导完成操作的标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FINISHPSLANRESID}
     */
    public final static String FIELD_FINISHPSLANRESNAME = "finishpslanresname";

    /**
     * 设置 完成语言资源，详细说明：{@link #FIELD_FINISHPSLANRESNAME}
     * 
     * @param finishPSLanResName
     * 
     */
    @JsonProperty(FIELD_FINISHPSLANRESNAME)
    public void setFinishPSLanResName(String finishPSLanResName){
        this.set(FIELD_FINISHPSLANRESNAME, finishPSLanResName);
    }
    
    /**
     * 获取 完成语言资源  
     * @return
     */
    @JsonIgnore
    public String getFinishPSLanResName(){
        Object objValue = this.get(FIELD_FINISHPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完成语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishPSLanResNameDirty(){
        if(this.contains(FIELD_FINISHPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完成语言资源
     */
    @JsonIgnore
    public void resetFinishPSLanResName(){
        this.reset(FIELD_FINISHPSLANRESNAME);
    }

    /**
     * 设置 完成语言资源，详细说明：{@link #FIELD_FINISHPSLANRESNAME}
     * <P>
     * 等同 {@link #setFinishPSLanResName}
     * @param finishPSLanResName
     */
    @JsonIgnore
    public PSDEWizardDTO finishpslanresname(String finishPSLanResName){
        this.setFinishPSLanResName(finishPSLanResName);
        return this;
    }

    /**
     * <B>INITPSDEACTIONID</B>&nbsp;初始化实体行为，指定向导初始化调用的实体行为
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
    public PSDEWizardDTO initpsdeactionid(String initPSDEActionId){
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
    public PSDEWizardDTO initpsdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>INITPSDEACTIONNAME</B>&nbsp;初始化实体行为，指定向导初始化调用的实体行为
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
    public PSDEWizardDTO initpsdeactionname(String initPSDEActionName){
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
    public PSDEWizardDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NEXTCAPTION</B>&nbsp;下一步标题，指定向导下一步操作的标题
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_NEXTCAPTION = "nextcaption";

    /**
     * 设置 下一步标题，详细说明：{@link #FIELD_NEXTCAPTION}
     * 
     * @param nextCaption
     * 
     */
    @JsonProperty(FIELD_NEXTCAPTION)
    public void setNextCaption(String nextCaption){
        this.set(FIELD_NEXTCAPTION, nextCaption);
    }
    
    /**
     * 获取 下一步标题  
     * @return
     */
    @JsonIgnore
    public String getNextCaption(){
        Object objValue = this.get(FIELD_NEXTCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextCaptionDirty(){
        if(this.contains(FIELD_NEXTCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步标题
     */
    @JsonIgnore
    public void resetNextCaption(){
        this.reset(FIELD_NEXTCAPTION);
    }

    /**
     * 设置 下一步标题，详细说明：{@link #FIELD_NEXTCAPTION}
     * <P>
     * 等同 {@link #setNextCaption}
     * @param nextCaption
     */
    @JsonIgnore
    public PSDEWizardDTO nextcaption(String nextCaption){
        this.setNextCaption(nextCaption);
        return this;
    }

    /**
     * <B>NEXTPSLANRESID</B>&nbsp;下一步语言标题，指定向导下一步操作的标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_NEXTPSLANRESID = "nextpslanresid";

    /**
     * 设置 下一步语言标题，详细说明：{@link #FIELD_NEXTPSLANRESID}
     * 
     * @param nextPSLanResId
     * 
     */
    @JsonProperty(FIELD_NEXTPSLANRESID)
    public void setNextPSLanResId(String nextPSLanResId){
        this.set(FIELD_NEXTPSLANRESID, nextPSLanResId);
    }
    
    /**
     * 获取 下一步语言标题  
     * @return
     */
    @JsonIgnore
    public String getNextPSLanResId(){
        Object objValue = this.get(FIELD_NEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步语言标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSLanResIdDirty(){
        if(this.contains(FIELD_NEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步语言标题
     */
    @JsonIgnore
    public void resetNextPSLanResId(){
        this.reset(FIELD_NEXTPSLANRESID);
    }

    /**
     * 设置 下一步语言标题，详细说明：{@link #FIELD_NEXTPSLANRESID}
     * <P>
     * 等同 {@link #setNextPSLanResId}
     * @param nextPSLanResId
     */
    @JsonIgnore
    public PSDEWizardDTO nextpslanresid(String nextPSLanResId){
        this.setNextPSLanResId(nextPSLanResId);
        return this;
    }

    /**
     * 设置 下一步语言标题，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO nextpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNextPSLanResId(null);
            this.setNextPSLanResName(null);
        }
        else{
            this.setNextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setNextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NEXTPSLANRESNAME</B>&nbsp;下一步语言资源，指定向导下一步操作的标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NEXTPSLANRESID}
     */
    public final static String FIELD_NEXTPSLANRESNAME = "nextpslanresname";

    /**
     * 设置 下一步语言资源，详细说明：{@link #FIELD_NEXTPSLANRESNAME}
     * 
     * @param nextPSLanResName
     * 
     */
    @JsonProperty(FIELD_NEXTPSLANRESNAME)
    public void setNextPSLanResName(String nextPSLanResName){
        this.set(FIELD_NEXTPSLANRESNAME, nextPSLanResName);
    }
    
    /**
     * 获取 下一步语言资源  
     * @return
     */
    @JsonIgnore
    public String getNextPSLanResName(){
        Object objValue = this.get(FIELD_NEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSLanResNameDirty(){
        if(this.contains(FIELD_NEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步语言资源
     */
    @JsonIgnore
    public void resetNextPSLanResName(){
        this.reset(FIELD_NEXTPSLANRESNAME);
    }

    /**
     * 设置 下一步语言资源，详细说明：{@link #FIELD_NEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setNextPSLanResName}
     * @param nextPSLanResName
     */
    @JsonIgnore
    public PSDEWizardDTO nextpslanresname(String nextPSLanResName){
        this.setNextPSLanResName(nextPSLanResName);
        return this;
    }

    /**
     * <B>PREVCAPTION</B>&nbsp;上一步标题，指定向导上一步操作的标题
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PREVCAPTION = "prevcaption";

    /**
     * 设置 上一步标题，详细说明：{@link #FIELD_PREVCAPTION}
     * 
     * @param prevCaption
     * 
     */
    @JsonProperty(FIELD_PREVCAPTION)
    public void setPrevCaption(String prevCaption){
        this.set(FIELD_PREVCAPTION, prevCaption);
    }
    
    /**
     * 获取 上一步标题  
     * @return
     */
    @JsonIgnore
    public String getPrevCaption(){
        Object objValue = this.get(FIELD_PREVCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上一步标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevCaptionDirty(){
        if(this.contains(FIELD_PREVCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上一步标题
     */
    @JsonIgnore
    public void resetPrevCaption(){
        this.reset(FIELD_PREVCAPTION);
    }

    /**
     * 设置 上一步标题，详细说明：{@link #FIELD_PREVCAPTION}
     * <P>
     * 等同 {@link #setPrevCaption}
     * @param prevCaption
     */
    @JsonIgnore
    public PSDEWizardDTO prevcaption(String prevCaption){
        this.setPrevCaption(prevCaption);
        return this;
    }

    /**
     * <B>PREVPSLANRESID</B>&nbsp;上一步语言标题，指定向导上一步操作的标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_PREVPSLANRESID = "prevpslanresid";

    /**
     * 设置 上一步语言标题，详细说明：{@link #FIELD_PREVPSLANRESID}
     * 
     * @param prevPSLanResId
     * 
     */
    @JsonProperty(FIELD_PREVPSLANRESID)
    public void setPrevPSLanResId(String prevPSLanResId){
        this.set(FIELD_PREVPSLANRESID, prevPSLanResId);
    }
    
    /**
     * 获取 上一步语言标题  
     * @return
     */
    @JsonIgnore
    public String getPrevPSLanResId(){
        Object objValue = this.get(FIELD_PREVPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上一步语言标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevPSLanResIdDirty(){
        if(this.contains(FIELD_PREVPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上一步语言标题
     */
    @JsonIgnore
    public void resetPrevPSLanResId(){
        this.reset(FIELD_PREVPSLANRESID);
    }

    /**
     * 设置 上一步语言标题，详细说明：{@link #FIELD_PREVPSLANRESID}
     * <P>
     * 等同 {@link #setPrevPSLanResId}
     * @param prevPSLanResId
     */
    @JsonIgnore
    public PSDEWizardDTO prevpslanresid(String prevPSLanResId){
        this.setPrevPSLanResId(prevPSLanResId);
        return this;
    }

    /**
     * 设置 上一步语言标题，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPrevPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO prevpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setPrevPSLanResId(null);
            this.setPrevPSLanResName(null);
        }
        else{
            this.setPrevPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPrevPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>PREVPSLANRESNAME</B>&nbsp;上一步语言资源，指定向导上一步操作的标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PREVPSLANRESID}
     */
    public final static String FIELD_PREVPSLANRESNAME = "prevpslanresname";

    /**
     * 设置 上一步语言资源，详细说明：{@link #FIELD_PREVPSLANRESNAME}
     * 
     * @param prevPSLanResName
     * 
     */
    @JsonProperty(FIELD_PREVPSLANRESNAME)
    public void setPrevPSLanResName(String prevPSLanResName){
        this.set(FIELD_PREVPSLANRESNAME, prevPSLanResName);
    }
    
    /**
     * 获取 上一步语言资源  
     * @return
     */
    @JsonIgnore
    public String getPrevPSLanResName(){
        Object objValue = this.get(FIELD_PREVPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 上一步语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrevPSLanResNameDirty(){
        if(this.contains(FIELD_PREVPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上一步语言资源
     */
    @JsonIgnore
    public void resetPrevPSLanResName(){
        this.reset(FIELD_PREVPSLANRESNAME);
    }

    /**
     * 设置 上一步语言资源，详细说明：{@link #FIELD_PREVPSLANRESNAME}
     * <P>
     * 等同 {@link #setPrevPSLanResName}
     * @param prevPSLanResName
     */
    @JsonIgnore
    public PSDEWizardDTO prevpslanresname(String prevPSLanResName){
        this.setPrevPSLanResName(prevPSLanResName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定向导部件默认附加的部件逻辑组对象
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
    public PSDEWizardDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEWizardDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定向导部件默认附加的部件逻辑组对象
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
    public PSDEWizardDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定向导部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlMsgDTO} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSDEWizardDTO psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定向导部件默认的部件消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSDEWizardDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定向导所在的实体
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
    public PSDEWizardDTO psdeid(String pSDEId){
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
    public PSDEWizardDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定向导所在的实体
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
    public PSDEWizardDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEWIZARDID</B>&nbsp;实体向导标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEWIZARDID = "psdewizardid";

    /**
     * 设置 实体向导标识
     * 
     * @param pSDEWizardId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDID)
    public void setPSDEWizardId(String pSDEWizardId){
        this.set(FIELD_PSDEWIZARDID, pSDEWizardId);
    }
    
    /**
     * 获取 实体向导标识  
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
     * 判断 实体向导标识 是否指定值，包括空值
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
     * 重置 实体向导标识
     */
    @JsonIgnore
    public void resetPSDEWizardId(){
        this.reset(FIELD_PSDEWIZARDID);
    }

    /**
     * 设置 实体向导标识
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizardId
     */
    @JsonIgnore
    public PSDEWizardDTO psdewizardid(String pSDEWizardId){
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    /**
     * <B>PSDEWIZARDNAME</B>&nbsp;实体向导名称，指定实体向导的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEWIZARDNAME = "psdewizardname";

    /**
     * 设置 实体向导名称，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * 
     * @param pSDEWizardName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDNAME)
    public void setPSDEWizardName(String pSDEWizardName){
        this.set(FIELD_PSDEWIZARDNAME, pSDEWizardName);
    }
    
    /**
     * 获取 实体向导名称  
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
     * 判断 实体向导名称 是否指定值，包括空值
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
     * 重置 实体向导名称
     */
    @JsonIgnore
    public void resetPSDEWizardName(){
        this.reset(FIELD_PSDEWIZARDNAME);
    }

    /**
     * 设置 实体向导名称，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * <P>
     * 等同 {@link #setPSDEWizardName}
     * @param pSDEWizardName
     */
    @JsonIgnore
    public PSDEWizardDTO psdewizardname(String pSDEWizardName){
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEWizardName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEWizardName(strName);
    }

    @JsonIgnore
    public PSDEWizardDTO name(String strName){
        this.setPSDEWizardName(strName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;部件样式，指定向导部件的容器样式表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 部件样式  
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
     * 判断 部件样式 是否指定值，包括空值
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
     * 重置 部件样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 部件样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEWizardDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 部件样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定向导部件的容器样式表对象
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
    public PSDEWizardDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体向导使用的前端模板扩展插件，使用插件类型【向导面板绘制插件】
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
    public PSDEWizardDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEWizardDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体向导使用的前端模板扩展插件，使用插件类型【向导面板绘制插件】
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
    public PSDEWizardDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSDEWizardDTO pssysreqitemid(String pSSysReqItemId){
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
    public PSDEWizardDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
    public PSDEWizardDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>STATEPSDEFID</B>&nbsp;状态属性，指定向导的状态值存储属性，可通过状态值指定调整的步骤
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_STATEPSDEFID = "statepsdefid";

    /**
     * 设置 状态属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * 
     * @param statePSDEFId
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFID)
    public void setStatePSDEFId(String statePSDEFId){
        this.set(FIELD_STATEPSDEFID, statePSDEFId);
    }
    
    /**
     * 获取 状态属性  
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
     * 判断 状态属性 是否指定值，包括空值
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
     * 重置 状态属性
     */
    @JsonIgnore
    public void resetStatePSDEFId(){
        this.reset(FIELD_STATEPSDEFID);
    }

    /**
     * 设置 状态属性，详细说明：{@link #FIELD_STATEPSDEFID}
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param statePSDEFId
     */
    @JsonIgnore
    public PSDEWizardDTO statepsdefid(String statePSDEFId){
        this.setStatePSDEFId(statePSDEFId);
        return this;
    }

    /**
     * 设置 状态属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setStatePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEWizardDTO statepsdefid(PSDEFieldDTO pSDEField){
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
     * <B>STATEPSDEFNAME</B>&nbsp;状态属性，指定向导的状态值存储属性，可通过状态值指定调整的步骤
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_STATEPSDEFID}
     */
    public final static String FIELD_STATEPSDEFNAME = "statepsdefname";

    /**
     * 设置 状态属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * 
     * @param statePSDEFName
     * 
     */
    @JsonProperty(FIELD_STATEPSDEFNAME)
    public void setStatePSDEFName(String statePSDEFName){
        this.set(FIELD_STATEPSDEFNAME, statePSDEFName);
    }
    
    /**
     * 获取 状态属性  
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
     * 判断 状态属性 是否指定值，包括空值
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
     * 重置 状态属性
     */
    @JsonIgnore
    public void resetStatePSDEFName(){
        this.reset(FIELD_STATEPSDEFNAME);
    }

    /**
     * 设置 状态属性，详细说明：{@link #FIELD_STATEPSDEFNAME}
     * <P>
     * 等同 {@link #setStatePSDEFName}
     * @param statePSDEFName
     */
    @JsonIgnore
    public PSDEWizardDTO statepsdefname(String statePSDEFName){
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    /**
     * <B>STATEWIZARDFLAG</B>&nbsp;状态向导，指定向导是否为状态向导模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STATEWIZARDFLAG = "statewizardflag";

    /**
     * 设置 状态向导，详细说明：{@link #FIELD_STATEWIZARDFLAG}
     * 
     * @param stateWizardFlag
     * 
     */
    @JsonProperty(FIELD_STATEWIZARDFLAG)
    public void setStateWizardFlag(Integer stateWizardFlag){
        this.set(FIELD_STATEWIZARDFLAG, stateWizardFlag);
    }
    
    /**
     * 获取 状态向导  
     * @return
     */
    @JsonIgnore
    public Integer getStateWizardFlag(){
        Object objValue = this.get(FIELD_STATEWIZARDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 状态向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStateWizardFlagDirty(){
        if(this.contains(FIELD_STATEWIZARDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 状态向导
     */
    @JsonIgnore
    public void resetStateWizardFlag(){
        this.reset(FIELD_STATEWIZARDFLAG);
    }

    /**
     * 设置 状态向导，详细说明：{@link #FIELD_STATEWIZARDFLAG}
     * <P>
     * 等同 {@link #setStateWizardFlag}
     * @param stateWizardFlag
     */
    @JsonIgnore
    public PSDEWizardDTO statewizardflag(Integer stateWizardFlag){
        this.setStateWizardFlag(stateWizardFlag);
        return this;
    }

     /**
     * 设置 状态向导，详细说明：{@link #FIELD_STATEWIZARDFLAG}
     * <P>
     * 等同 {@link #setStateWizardFlag}
     * @param stateWizardFlag
     */
    @JsonIgnore
    public PSDEWizardDTO statewizardflag(Boolean stateWizardFlag){
        if(stateWizardFlag == null){
            this.setStateWizardFlag(null);
        }
        else{
            this.setStateWizardFlag(stateWizardFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEWizardDTO updatedate(Timestamp updateDate){
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
    public PSDEWizardDTO updateman(String updateMan){
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
    public PSDEWizardDTO usercat(String userCat){
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
    public PSDEWizardDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEWizardDTO usertag(String userTag){
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
    public PSDEWizardDTO usertag2(String userTag2){
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
    public PSDEWizardDTO usertag3(String userTag3){
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
    public PSDEWizardDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>WIZARDSTYLE</B>&nbsp;内置样式，指定向导部件的内置样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.WizardStyle} 
     */
    public final static String FIELD_WIZARDSTYLE = "wizardstyle";

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_WIZARDSTYLE}
     * 
     * @param wizardStyle
     * 
     */
    @JsonProperty(FIELD_WIZARDSTYLE)
    public void setWizardStyle(String wizardStyle){
        this.set(FIELD_WIZARDSTYLE, wizardStyle);
    }
    
    /**
     * 获取 内置样式  
     * @return
     */
    @JsonIgnore
    public String getWizardStyle(){
        Object objValue = this.get(FIELD_WIZARDSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内置样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWizardStyleDirty(){
        if(this.contains(FIELD_WIZARDSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内置样式
     */
    @JsonIgnore
    public void resetWizardStyle(){
        this.reset(FIELD_WIZARDSTYLE);
    }

    /**
     * 设置 内置样式，详细说明：{@link #FIELD_WIZARDSTYLE}
     * <P>
     * 等同 {@link #setWizardStyle}
     * @param wizardStyle
     */
    @JsonIgnore
    public PSDEWizardDTO wizardstyle(String wizardStyle){
        this.setWizardStyle(wizardStyle);
        return this;
    }

     /**
     * 设置 内置样式，详细说明：{@link #FIELD_WIZARDSTYLE}
     * <P>
     * 等同 {@link #setWizardStyle}
     * @param wizardStyle
     */
    @JsonIgnore
    public PSDEWizardDTO wizardstyle(net.ibizsys.model.PSModelEnums.WizardStyle wizardStyle){
        if(wizardStyle == null){
            this.setWizardStyle(null);
        }
        else{
            this.setWizardStyle(wizardStyle.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEWizardId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEWizardId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEWizardId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEWizardId(strValue);
    }

    @JsonIgnore
    public PSDEWizardDTO id(String strValue){
        this.setPSDEWizardId(strValue);
        return this;
    }


    /**
     *  实体向导步骤 成员集合
     */
    public final static String FIELD_PSDEWIZARDSTEPS = "psdewizardsteps";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardStepDTO> psdewizardsteps;

    /**
     * 获取 实体向导步骤 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardStepDTO> getPSDEWizardSteps(){
        return this.psdewizardsteps;
    }

    /**
     * 设置 实体向导步骤 成员集合  
     * @param psdewizardsteps
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPS)
    public void setPSDEWizardSteps(java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardStepDTO> psdewizardsteps){
        this.psdewizardsteps = psdewizardsteps;
    }

    /**
     * 获取 实体向导步骤 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardStepDTO> getPSDEWizardStepsIf(){
        if(this.psdewizardsteps == null){
            this.psdewizardsteps = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEWizardStepDTO>();          
        }
        return this.psdewizardsteps;
    }


    /**
     *  实体向导表单 成员集合
     */
    public final static String FIELD_PSDEWIZARDFORMS = "psdewizardforms";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardFormDTO> psdewizardforms;

    /**
     * 获取 实体向导表单 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEWIZARDFORMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardFormDTO> getPSDEWizardForms(){
        return this.psdewizardforms;
    }

    /**
     * 设置 实体向导表单 成员集合  
     * @param psdewizardforms
     */
    @JsonProperty(FIELD_PSDEWIZARDFORMS)
    public void setPSDEWizardForms(java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardFormDTO> psdewizardforms){
        this.psdewizardforms = psdewizardforms;
    }

    /**
     * 获取 实体向导表单 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardFormDTO> getPSDEWizardFormsIf(){
        if(this.psdewizardforms == null){
            this.psdewizardforms = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEWizardFormDTO>();          
        }
        return this.psdewizardforms;
    }


    /**
     *  实体向导逻辑 成员集合
     */
    public final static String FIELD_PSDEWIZARDLOGICS = "psdewizardlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO> psdewizardlogics;

    /**
     * 获取 实体向导逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEWIZARDLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO> getPSDEWizardLogics(){
        return this.psdewizardlogics;
    }

    /**
     * 设置 实体向导逻辑 成员集合  
     * @param psdewizardlogics
     */
    @JsonProperty(FIELD_PSDEWIZARDLOGICS)
    public void setPSDEWizardLogics(java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO> psdewizardlogics){
        this.psdewizardlogics = psdewizardlogics;
    }

    /**
     * 获取 实体向导逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO> getPSDEWizardLogicsIf(){
        if(this.psdewizardlogics == null){
            this.psdewizardlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO>();          
        }
        return this.psdewizardlogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEWizardDTO){
            PSDEWizardDTO dto = (PSDEWizardDTO)iEntity;
            dto.setPSDEWizardSteps(this.getPSDEWizardSteps());
            dto.setPSDEWizardForms(this.getPSDEWizardForms());
            dto.setPSDEWizardLogics(this.getPSDEWizardLogics());
        }
        super.copyTo(iEntity);
    }
}
