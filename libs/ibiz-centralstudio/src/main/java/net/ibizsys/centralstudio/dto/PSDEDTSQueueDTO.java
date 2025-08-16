package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDTSQUEUE</B>实体异步处理队列 模型传输对象
 * <P>
 * 实体分布事务队列模型，定义支持二阶段提交的分布式事务的队列及处理逻辑
 */
public class PSDEDTSQueueDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEDTSQueueDTO(){
    }      

    /**
     * <B>CANCELLEDSTATE</B>&nbsp;已取消状态值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CANCELLEDSTATE = "cancelledstate";

    /**
     * 设置 已取消状态值
     * 
     * @param cancelledState
     * 
     */
    @JsonProperty(FIELD_CANCELLEDSTATE)
    public void setCancelledState(String cancelledState){
        this.set(FIELD_CANCELLEDSTATE, cancelledState);
    }
    
    /**
     * 获取 已取消状态值  
     * @return
     */
    @JsonIgnore
    public String getCancelledState(){
        Object objValue = this.get(FIELD_CANCELLEDSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已取消状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCancelledStateDirty(){
        if(this.contains(FIELD_CANCELLEDSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已取消状态值
     */
    @JsonIgnore
    public void resetCancelledState(){
        this.reset(FIELD_CANCELLEDSTATE);
    }

    /**
     * 设置 已取消状态值
     * <P>
     * 等同 {@link #setCancelledState}
     * @param cancelledState
     */
    @JsonIgnore
    public PSDEDTSQueueDTO cancelledstate(String cancelledState){
        this.setCancelledState(cancelledState);
        return this;
    }

    /**
     * <B>CANCELLEDSTATETEXT</B>&nbsp;已取消状态
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CANCELLEDSTATETEXT = "cancelledstatetext";

    /**
     * 设置 已取消状态
     * 
     * @param cancelledStateText
     * 
     */
    @JsonProperty(FIELD_CANCELLEDSTATETEXT)
    public void setCancelledStateText(String cancelledStateText){
        this.set(FIELD_CANCELLEDSTATETEXT, cancelledStateText);
    }
    
    /**
     * 获取 已取消状态  
     * @return
     */
    @JsonIgnore
    public String getCancelledStateText(){
        Object objValue = this.get(FIELD_CANCELLEDSTATETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已取消状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCancelledStateTextDirty(){
        if(this.contains(FIELD_CANCELLEDSTATETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已取消状态
     */
    @JsonIgnore
    public void resetCancelledStateText(){
        this.reset(FIELD_CANCELLEDSTATETEXT);
    }

    /**
     * 设置 已取消状态
     * <P>
     * 等同 {@link #setCancelledStateText}
     * @param cancelledStateText
     */
    @JsonIgnore
    public PSDEDTSQueueDTO cancelledstatetext(String cancelledStateText){
        this.setCancelledStateText(cancelledStateText);
        return this;
    }

    /**
     * <B>CANCELPSDEACTIONID</B>&nbsp;取消行为，指定分布事务队列进行回滚操作调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_CANCELPSDEACTIONID = "cancelpsdeactionid";

    /**
     * 设置 取消行为，详细说明：{@link #FIELD_CANCELPSDEACTIONID}
     * 
     * @param cancelPSDEActionId
     * 
     */
    @JsonProperty(FIELD_CANCELPSDEACTIONID)
    public void setCancelPSDEActionId(String cancelPSDEActionId){
        this.set(FIELD_CANCELPSDEACTIONID, cancelPSDEActionId);
    }
    
    /**
     * 获取 取消行为  
     * @return
     */
    @JsonIgnore
    public String getCancelPSDEActionId(){
        Object objValue = this.get(FIELD_CANCELPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 取消行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCancelPSDEActionIdDirty(){
        if(this.contains(FIELD_CANCELPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 取消行为
     */
    @JsonIgnore
    public void resetCancelPSDEActionId(){
        this.reset(FIELD_CANCELPSDEACTIONID);
    }

    /**
     * 设置 取消行为，详细说明：{@link #FIELD_CANCELPSDEACTIONID}
     * <P>
     * 等同 {@link #setCancelPSDEActionId}
     * @param cancelPSDEActionId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO cancelpsdeactionid(String cancelPSDEActionId){
        this.setCancelPSDEActionId(cancelPSDEActionId);
        return this;
    }

    /**
     * 设置 取消行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCancelPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO cancelpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setCancelPSDEActionId(null);
            this.setCancelPSDEActionName(null);
        }
        else{
            this.setCancelPSDEActionId(pSDEAction.getPSDEActionId());
            this.setCancelPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>CANCELPSDEACTIONNAME</B>&nbsp;取消行为，指定分布事务队列进行回滚操作调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CANCELPSDEACTIONID}
     */
    public final static String FIELD_CANCELPSDEACTIONNAME = "cancelpsdeactionname";

    /**
     * 设置 取消行为，详细说明：{@link #FIELD_CANCELPSDEACTIONNAME}
     * 
     * @param cancelPSDEActionName
     * 
     */
    @JsonProperty(FIELD_CANCELPSDEACTIONNAME)
    public void setCancelPSDEActionName(String cancelPSDEActionName){
        this.set(FIELD_CANCELPSDEACTIONNAME, cancelPSDEActionName);
    }
    
    /**
     * 获取 取消行为  
     * @return
     */
    @JsonIgnore
    public String getCancelPSDEActionName(){
        Object objValue = this.get(FIELD_CANCELPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 取消行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCancelPSDEActionNameDirty(){
        if(this.contains(FIELD_CANCELPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 取消行为
     */
    @JsonIgnore
    public void resetCancelPSDEActionName(){
        this.reset(FIELD_CANCELPSDEACTIONNAME);
    }

    /**
     * 设置 取消行为，详细说明：{@link #FIELD_CANCELPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setCancelPSDEActionName}
     * @param cancelPSDEActionName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO cancelpsdeactionname(String cancelPSDEActionName){
        this.setCancelPSDEActionName(cancelPSDEActionName);
        return this;
    }

    /**
     * <B>CANCELTIMEOUT</B>&nbsp;超时取消时长，指定分布事务队列二阶段提交的超时时长，单位为毫秒，-1为未定义，未定义时为【-1】
     */
    public final static String FIELD_CANCELTIMEOUT = "canceltimeout";

    /**
     * 设置 超时取消时长，详细说明：{@link #FIELD_CANCELTIMEOUT}
     * 
     * @param cancelTimeout
     * 
     */
    @JsonProperty(FIELD_CANCELTIMEOUT)
    public void setCancelTimeout(Integer cancelTimeout){
        this.set(FIELD_CANCELTIMEOUT, cancelTimeout);
    }
    
    /**
     * 获取 超时取消时长  
     * @return
     */
    @JsonIgnore
    public Integer getCancelTimeout(){
        Object objValue = this.get(FIELD_CANCELTIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 超时取消时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCancelTimeoutDirty(){
        if(this.contains(FIELD_CANCELTIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 超时取消时长
     */
    @JsonIgnore
    public void resetCancelTimeout(){
        this.reset(FIELD_CANCELTIMEOUT);
    }

    /**
     * 设置 超时取消时长，详细说明：{@link #FIELD_CANCELTIMEOUT}
     * <P>
     * 等同 {@link #setCancelTimeout}
     * @param cancelTimeout
     */
    @JsonIgnore
    public PSDEDTSQueueDTO canceltimeout(Integer cancelTimeout){
        this.setCancelTimeout(cancelTimeout);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定分布事务队列的代码标识，需在所属实体中具备唯一性
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
    public PSDEDTSQueueDTO codename(String codeName){
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
    public PSDEDTSQueueDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEDSTATE</B>&nbsp;已建立状态值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEDSTATE = "createdstate";

    /**
     * 设置 已建立状态值
     * 
     * @param createdState
     * 
     */
    @JsonProperty(FIELD_CREATEDSTATE)
    public void setCreatedState(String createdState){
        this.set(FIELD_CREATEDSTATE, createdState);
    }
    
    /**
     * 获取 已建立状态值  
     * @return
     */
    @JsonIgnore
    public String getCreatedState(){
        Object objValue = this.get(FIELD_CREATEDSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已建立状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatedStateDirty(){
        if(this.contains(FIELD_CREATEDSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已建立状态值
     */
    @JsonIgnore
    public void resetCreatedState(){
        this.reset(FIELD_CREATEDSTATE);
    }

    /**
     * 设置 已建立状态值
     * <P>
     * 等同 {@link #setCreatedState}
     * @param createdState
     */
    @JsonIgnore
    public PSDEDTSQueueDTO createdstate(String createdState){
        this.setCreatedState(createdState);
        return this;
    }

    /**
     * <B>CREATEDSTATETEXT</B>&nbsp;已建立状态
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEDSTATETEXT = "createdstatetext";

    /**
     * 设置 已建立状态
     * 
     * @param createdStateText
     * 
     */
    @JsonProperty(FIELD_CREATEDSTATETEXT)
    public void setCreatedStateText(String createdStateText){
        this.set(FIELD_CREATEDSTATETEXT, createdStateText);
    }
    
    /**
     * 获取 已建立状态  
     * @return
     */
    @JsonIgnore
    public String getCreatedStateText(){
        Object objValue = this.get(FIELD_CREATEDSTATETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已建立状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreatedStateTextDirty(){
        if(this.contains(FIELD_CREATEDSTATETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已建立状态
     */
    @JsonIgnore
    public void resetCreatedStateText(){
        this.reset(FIELD_CREATEDSTATETEXT);
    }

    /**
     * 设置 已建立状态
     * <P>
     * 等同 {@link #setCreatedStateText}
     * @param createdStateText
     */
    @JsonIgnore
    public PSDEDTSQueueDTO createdstatetext(String createdStateText){
        this.setCreatedStateText(createdStateText);
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
    public PSDEDTSQueueDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认队列，指定分布事务队列是否为所属实体的默认队列，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认队列，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认队列  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认队列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认队列
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认队列，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEDTSQueueDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认队列，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEDTSQueueDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ERRORPSDEFID</B>&nbsp;错误属性，指定分布事务队列存储错误代码的实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_ERRORPSDEFID = "errorpsdefid";

    /**
     * 设置 错误属性，详细说明：{@link #FIELD_ERRORPSDEFID}
     * 
     * @param errorPSDEFId
     * 
     */
    @JsonProperty(FIELD_ERRORPSDEFID)
    public void setErrorPSDEFId(String errorPSDEFId){
        this.set(FIELD_ERRORPSDEFID, errorPSDEFId);
    }
    
    /**
     * 获取 错误属性  
     * @return
     */
    @JsonIgnore
    public String getErrorPSDEFId(){
        Object objValue = this.get(FIELD_ERRORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 错误属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrorPSDEFIdDirty(){
        if(this.contains(FIELD_ERRORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误属性
     */
    @JsonIgnore
    public void resetErrorPSDEFId(){
        this.reset(FIELD_ERRORPSDEFID);
    }

    /**
     * 设置 错误属性，详细说明：{@link #FIELD_ERRORPSDEFID}
     * <P>
     * 等同 {@link #setErrorPSDEFId}
     * @param errorPSDEFId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO errorpsdefid(String errorPSDEFId){
        this.setErrorPSDEFId(errorPSDEFId);
        return this;
    }

    /**
     * 设置 错误属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setErrorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO errorpsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setErrorPSDEFId(null);
            this.setErrorPSDEFName(null);
        }
        else{
            this.setErrorPSDEFId(pSDEField.getPSDEFieldId());
            this.setErrorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ERRORPSDEFNAME</B>&nbsp;错误属性，指定分布事务队列存储错误代码的实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ERRORPSDEFID}
     */
    public final static String FIELD_ERRORPSDEFNAME = "errorpsdefname";

    /**
     * 设置 错误属性，详细说明：{@link #FIELD_ERRORPSDEFNAME}
     * 
     * @param errorPSDEFName
     * 
     */
    @JsonProperty(FIELD_ERRORPSDEFNAME)
    public void setErrorPSDEFName(String errorPSDEFName){
        this.set(FIELD_ERRORPSDEFNAME, errorPSDEFName);
    }
    
    /**
     * 获取 错误属性  
     * @return
     */
    @JsonIgnore
    public String getErrorPSDEFName(){
        Object objValue = this.get(FIELD_ERRORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 错误属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isErrorPSDEFNameDirty(){
        if(this.contains(FIELD_ERRORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 错误属性
     */
    @JsonIgnore
    public void resetErrorPSDEFName(){
        this.reset(FIELD_ERRORPSDEFNAME);
    }

    /**
     * 设置 错误属性，详细说明：{@link #FIELD_ERRORPSDEFNAME}
     * <P>
     * 等同 {@link #setErrorPSDEFName}
     * @param errorPSDEFName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO errorpsdefname(String errorPSDEFName){
        this.setErrorPSDEFName(errorPSDEFName);
        return this;
    }

    /**
     * <B>FAILEDSTATE</B>&nbsp;已失败状态值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FAILEDSTATE = "failedstate";

    /**
     * 设置 已失败状态值
     * 
     * @param failedState
     * 
     */
    @JsonProperty(FIELD_FAILEDSTATE)
    public void setFailedState(String failedState){
        this.set(FIELD_FAILEDSTATE, failedState);
    }
    
    /**
     * 获取 已失败状态值  
     * @return
     */
    @JsonIgnore
    public String getFailedState(){
        Object objValue = this.get(FIELD_FAILEDSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已失败状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFailedStateDirty(){
        if(this.contains(FIELD_FAILEDSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已失败状态值
     */
    @JsonIgnore
    public void resetFailedState(){
        this.reset(FIELD_FAILEDSTATE);
    }

    /**
     * 设置 已失败状态值
     * <P>
     * 等同 {@link #setFailedState}
     * @param failedState
     */
    @JsonIgnore
    public PSDEDTSQueueDTO failedstate(String failedState){
        this.setFailedState(failedState);
        return this;
    }

    /**
     * <B>FAILEDSTATETEXT</B>&nbsp;已失败状态
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FAILEDSTATETEXT = "failedstatetext";

    /**
     * 设置 已失败状态
     * 
     * @param failedStateText
     * 
     */
    @JsonProperty(FIELD_FAILEDSTATETEXT)
    public void setFailedStateText(String failedStateText){
        this.set(FIELD_FAILEDSTATETEXT, failedStateText);
    }
    
    /**
     * 获取 已失败状态  
     * @return
     */
    @JsonIgnore
    public String getFailedStateText(){
        Object objValue = this.get(FIELD_FAILEDSTATETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已失败状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFailedStateTextDirty(){
        if(this.contains(FIELD_FAILEDSTATETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已失败状态
     */
    @JsonIgnore
    public void resetFailedStateText(){
        this.reset(FIELD_FAILEDSTATETEXT);
    }

    /**
     * 设置 已失败状态
     * <P>
     * 等同 {@link #setFailedStateText}
     * @param failedStateText
     */
    @JsonIgnore
    public PSDEDTSQueueDTO failedstatetext(String failedStateText){
        this.setFailedStateText(failedStateText);
        return this;
    }

    /**
     * <B>FINISHEDSTATE</B>&nbsp;已完成状态值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FINISHEDSTATE = "finishedstate";

    /**
     * 设置 已完成状态值
     * 
     * @param finishedState
     * 
     */
    @JsonProperty(FIELD_FINISHEDSTATE)
    public void setFinishedState(String finishedState){
        this.set(FIELD_FINISHEDSTATE, finishedState);
    }
    
    /**
     * 获取 已完成状态值  
     * @return
     */
    @JsonIgnore
    public String getFinishedState(){
        Object objValue = this.get(FIELD_FINISHEDSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已完成状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishedStateDirty(){
        if(this.contains(FIELD_FINISHEDSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已完成状态值
     */
    @JsonIgnore
    public void resetFinishedState(){
        this.reset(FIELD_FINISHEDSTATE);
    }

    /**
     * 设置 已完成状态值
     * <P>
     * 等同 {@link #setFinishedState}
     * @param finishedState
     */
    @JsonIgnore
    public PSDEDTSQueueDTO finishedstate(String finishedState){
        this.setFinishedState(finishedState);
        return this;
    }

    /**
     * <B>FINISHEDSTATETEXT</B>&nbsp;已完成状态
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_FINISHEDSTATETEXT = "finishedstatetext";

    /**
     * 设置 已完成状态
     * 
     * @param finishedStateText
     * 
     */
    @JsonProperty(FIELD_FINISHEDSTATETEXT)
    public void setFinishedStateText(String finishedStateText){
        this.set(FIELD_FINISHEDSTATETEXT, finishedStateText);
    }
    
    /**
     * 获取 已完成状态  
     * @return
     */
    @JsonIgnore
    public String getFinishedStateText(){
        Object objValue = this.get(FIELD_FINISHEDSTATETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 已完成状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishedStateTextDirty(){
        if(this.contains(FIELD_FINISHEDSTATETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 已完成状态
     */
    @JsonIgnore
    public void resetFinishedStateText(){
        this.reset(FIELD_FINISHEDSTATETEXT);
    }

    /**
     * 设置 已完成状态
     * <P>
     * 等同 {@link #setFinishedStateText}
     * @param finishedStateText
     */
    @JsonIgnore
    public PSDEDTSQueueDTO finishedstatetext(String finishedStateText){
        this.setFinishedStateText(finishedStateText);
        return this;
    }

    /**
     * <B>FINISHPSDEACTIONID</B>&nbsp;完成行为，指定分布事务队列进行完成操作调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_FINISHPSDEACTIONID = "finishpsdeactionid";

    /**
     * 设置 完成行为，详细说明：{@link #FIELD_FINISHPSDEACTIONID}
     * 
     * @param finishPSDEActionId
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEACTIONID)
    public void setFinishPSDEActionId(String finishPSDEActionId){
        this.set(FIELD_FINISHPSDEACTIONID, finishPSDEActionId);
    }
    
    /**
     * 获取 完成行为  
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
     * 判断 完成行为 是否指定值，包括空值
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
     * 重置 完成行为
     */
    @JsonIgnore
    public void resetFinishPSDEActionId(){
        this.reset(FIELD_FINISHPSDEACTIONID);
    }

    /**
     * 设置 完成行为，详细说明：{@link #FIELD_FINISHPSDEACTIONID}
     * <P>
     * 等同 {@link #setFinishPSDEActionId}
     * @param finishPSDEActionId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO finishpsdeactionid(String finishPSDEActionId){
        this.setFinishPSDEActionId(finishPSDEActionId);
        return this;
    }

    /**
     * 设置 完成行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFinishPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO finishpsdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>FINISHPSDEACTIONNAME</B>&nbsp;完成行为，指定分布事务队列进行完成操作调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FINISHPSDEACTIONID}
     */
    public final static String FIELD_FINISHPSDEACTIONNAME = "finishpsdeactionname";

    /**
     * 设置 完成行为，详细说明：{@link #FIELD_FINISHPSDEACTIONNAME}
     * 
     * @param finishPSDEActionName
     * 
     */
    @JsonProperty(FIELD_FINISHPSDEACTIONNAME)
    public void setFinishPSDEActionName(String finishPSDEActionName){
        this.set(FIELD_FINISHPSDEACTIONNAME, finishPSDEActionName);
    }
    
    /**
     * 获取 完成行为  
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
     * 判断 完成行为 是否指定值，包括空值
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
     * 重置 完成行为
     */
    @JsonIgnore
    public void resetFinishPSDEActionName(){
        this.reset(FIELD_FINISHPSDEACTIONNAME);
    }

    /**
     * 设置 完成行为，详细说明：{@link #FIELD_FINISHPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setFinishPSDEActionName}
     * @param finishPSDEActionName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO finishpsdeactionname(String finishPSDEActionName){
        this.setFinishPSDEActionName(finishPSDEActionName);
        return this;
    }

    /**
     * <B>HISTORYPSDEID</B>&nbsp;历史队列实体，指定分布事务队列处理结束后备份历史队列实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_HISTORYPSDEID = "historypsdeid";

    /**
     * 设置 历史队列实体，详细说明：{@link #FIELD_HISTORYPSDEID}
     * 
     * @param historyPSDEId
     * 
     */
    @JsonProperty(FIELD_HISTORYPSDEID)
    public void setHistoryPSDEId(String historyPSDEId){
        this.set(FIELD_HISTORYPSDEID, historyPSDEId);
    }
    
    /**
     * 获取 历史队列实体  
     * @return
     */
    @JsonIgnore
    public String getHistoryPSDEId(){
        Object objValue = this.get(FIELD_HISTORYPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 历史队列实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHistoryPSDEIdDirty(){
        if(this.contains(FIELD_HISTORYPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 历史队列实体
     */
    @JsonIgnore
    public void resetHistoryPSDEId(){
        this.reset(FIELD_HISTORYPSDEID);
    }

    /**
     * 设置 历史队列实体，详细说明：{@link #FIELD_HISTORYPSDEID}
     * <P>
     * 等同 {@link #setHistoryPSDEId}
     * @param historyPSDEId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO historypsdeid(String historyPSDEId){
        this.setHistoryPSDEId(historyPSDEId);
        return this;
    }

    /**
     * 设置 历史队列实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setHistoryPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO historypsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setHistoryPSDEId(null);
            this.setHistoryPSDEName(null);
        }
        else{
            this.setHistoryPSDEId(pSDataEntity.getPSDataEntityId());
            this.setHistoryPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>HISTORYPSDENAME</B>&nbsp;历史队列实体，指定分布事务队列处理结束后备份历史队列实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_HISTORYPSDEID}
     */
    public final static String FIELD_HISTORYPSDENAME = "historypsdename";

    /**
     * 设置 历史队列实体，详细说明：{@link #FIELD_HISTORYPSDENAME}
     * 
     * @param historyPSDEName
     * 
     */
    @JsonProperty(FIELD_HISTORYPSDENAME)
    public void setHistoryPSDEName(String historyPSDEName){
        this.set(FIELD_HISTORYPSDENAME, historyPSDEName);
    }
    
    /**
     * 获取 历史队列实体  
     * @return
     */
    @JsonIgnore
    public String getHistoryPSDEName(){
        Object objValue = this.get(FIELD_HISTORYPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 历史队列实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHistoryPSDENameDirty(){
        if(this.contains(FIELD_HISTORYPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 历史队列实体
     */
    @JsonIgnore
    public void resetHistoryPSDEName(){
        this.reset(FIELD_HISTORYPSDENAME);
    }

    /**
     * 设置 历史队列实体，详细说明：{@link #FIELD_HISTORYPSDENAME}
     * <P>
     * 等同 {@link #setHistoryPSDEName}
     * @param historyPSDEName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO historypsdename(String historyPSDEName){
        this.setHistoryPSDEName(historyPSDEName);
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
    public PSDEDTSQueueDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PROCESSINGSTATE</B>&nbsp;处理中状态值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PROCESSINGSTATE = "processingstate";

    /**
     * 设置 处理中状态值
     * 
     * @param processingState
     * 
     */
    @JsonProperty(FIELD_PROCESSINGSTATE)
    public void setProcessingState(String processingState){
        this.set(FIELD_PROCESSINGSTATE, processingState);
    }
    
    /**
     * 获取 处理中状态值  
     * @return
     */
    @JsonIgnore
    public String getProcessingState(){
        Object objValue = this.get(FIELD_PROCESSINGSTATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理中状态值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProcessingStateDirty(){
        if(this.contains(FIELD_PROCESSINGSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理中状态值
     */
    @JsonIgnore
    public void resetProcessingState(){
        this.reset(FIELD_PROCESSINGSTATE);
    }

    /**
     * 设置 处理中状态值
     * <P>
     * 等同 {@link #setProcessingState}
     * @param processingState
     */
    @JsonIgnore
    public PSDEDTSQueueDTO processingstate(String processingState){
        this.setProcessingState(processingState);
        return this;
    }

    /**
     * <B>PROCESSINGSTATETEXT</B>&nbsp;处理中状态
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PROCESSINGSTATETEXT = "processingstatetext";

    /**
     * 设置 处理中状态
     * 
     * @param processingStateText
     * 
     */
    @JsonProperty(FIELD_PROCESSINGSTATETEXT)
    public void setProcessingStateText(String processingStateText){
        this.set(FIELD_PROCESSINGSTATETEXT, processingStateText);
    }
    
    /**
     * 获取 处理中状态  
     * @return
     */
    @JsonIgnore
    public String getProcessingStateText(){
        Object objValue = this.get(FIELD_PROCESSINGSTATETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理中状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isProcessingStateTextDirty(){
        if(this.contains(FIELD_PROCESSINGSTATETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理中状态
     */
    @JsonIgnore
    public void resetProcessingStateText(){
        this.reset(FIELD_PROCESSINGSTATETEXT);
    }

    /**
     * 设置 处理中状态
     * <P>
     * 等同 {@link #setProcessingStateText}
     * @param processingStateText
     */
    @JsonIgnore
    public PSDEDTSQueueDTO processingstatetext(String processingStateText){
        this.setProcessingStateText(processingStateText);
        return this;
    }

    /**
     * <B>PSDEDTSQUEUEID</B>&nbsp;实体分布事务队列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDTSQUEUEID = "psdedtsqueueid";

    /**
     * 设置 实体分布事务队列标识
     * 
     * @param pSDEDTSQueueId
     * 
     */
    @JsonProperty(FIELD_PSDEDTSQUEUEID)
    public void setPSDEDTSQueueId(String pSDEDTSQueueId){
        this.set(FIELD_PSDEDTSQUEUEID, pSDEDTSQueueId);
    }
    
    /**
     * 获取 实体分布事务队列标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDTSQueueId(){
        Object objValue = this.get(FIELD_PSDEDTSQUEUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体分布事务队列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDTSQueueIdDirty(){
        if(this.contains(FIELD_PSDEDTSQUEUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体分布事务队列标识
     */
    @JsonIgnore
    public void resetPSDEDTSQueueId(){
        this.reset(FIELD_PSDEDTSQUEUEID);
    }

    /**
     * 设置 实体分布事务队列标识
     * <P>
     * 等同 {@link #setPSDEDTSQueueId}
     * @param pSDEDTSQueueId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO psdedtsqueueid(String pSDEDTSQueueId){
        this.setPSDEDTSQueueId(pSDEDTSQueueId);
        return this;
    }

    /**
     * <B>PSDEDTSQUEUENAME</B>&nbsp;队列名称，指定分布事务队列的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDTSQUEUENAME = "psdedtsqueuename";

    /**
     * 设置 队列名称，详细说明：{@link #FIELD_PSDEDTSQUEUENAME}
     * 
     * @param pSDEDTSQueueName
     * 
     */
    @JsonProperty(FIELD_PSDEDTSQUEUENAME)
    public void setPSDEDTSQueueName(String pSDEDTSQueueName){
        this.set(FIELD_PSDEDTSQUEUENAME, pSDEDTSQueueName);
    }
    
    /**
     * 获取 队列名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDTSQueueName(){
        Object objValue = this.get(FIELD_PSDEDTSQUEUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 队列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDTSQueueNameDirty(){
        if(this.contains(FIELD_PSDEDTSQUEUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 队列名称
     */
    @JsonIgnore
    public void resetPSDEDTSQueueName(){
        this.reset(FIELD_PSDEDTSQUEUENAME);
    }

    /**
     * 设置 队列名称，详细说明：{@link #FIELD_PSDEDTSQUEUENAME}
     * <P>
     * 等同 {@link #setPSDEDTSQueueName}
     * @param pSDEDTSQueueName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO psdedtsqueuename(String pSDEDTSQueueName){
        this.setPSDEDTSQueueName(pSDEDTSQueueName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDTSQueueName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDTSQueueName(strName);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO name(String strName){
        this.setPSDEDTSQueueName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定分布事务队列所属的实体
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
    public PSDEDTSQueueDTO psdeid(String pSDEId){
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
    public PSDEDTSQueueDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定分布事务队列所属的实体
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
    public PSDEDTSQueueDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PUSHPSDEACTIONID</B>&nbsp;推送行为，指定分布事务队列进行推送操作调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_PUSHPSDEACTIONID = "pushpsdeactionid";

    /**
     * 设置 推送行为，详细说明：{@link #FIELD_PUSHPSDEACTIONID}
     * 
     * @param pushPSDEActionId
     * 
     */
    @JsonProperty(FIELD_PUSHPSDEACTIONID)
    public void setPushPSDEActionId(String pushPSDEActionId){
        this.set(FIELD_PUSHPSDEACTIONID, pushPSDEActionId);
    }
    
    /**
     * 获取 推送行为  
     * @return
     */
    @JsonIgnore
    public String getPushPSDEActionId(){
        Object objValue = this.get(FIELD_PUSHPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 推送行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPushPSDEActionIdDirty(){
        if(this.contains(FIELD_PUSHPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 推送行为
     */
    @JsonIgnore
    public void resetPushPSDEActionId(){
        this.reset(FIELD_PUSHPSDEACTIONID);
    }

    /**
     * 设置 推送行为，详细说明：{@link #FIELD_PUSHPSDEACTIONID}
     * <P>
     * 等同 {@link #setPushPSDEActionId}
     * @param pushPSDEActionId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO pushpsdeactionid(String pushPSDEActionId){
        this.setPushPSDEActionId(pushPSDEActionId);
        return this;
    }

    /**
     * 设置 推送行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPushPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO pushpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setPushPSDEActionId(null);
            this.setPushPSDEActionName(null);
        }
        else{
            this.setPushPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPushPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PUSHPSDEACTIONNAME</B>&nbsp;推送行为，指定分布事务队列进行推送操作调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PUSHPSDEACTIONID}
     */
    public final static String FIELD_PUSHPSDEACTIONNAME = "pushpsdeactionname";

    /**
     * 设置 推送行为，详细说明：{@link #FIELD_PUSHPSDEACTIONNAME}
     * 
     * @param pushPSDEActionName
     * 
     */
    @JsonProperty(FIELD_PUSHPSDEACTIONNAME)
    public void setPushPSDEActionName(String pushPSDEActionName){
        this.set(FIELD_PUSHPSDEACTIONNAME, pushPSDEActionName);
    }
    
    /**
     * 获取 推送行为  
     * @return
     */
    @JsonIgnore
    public String getPushPSDEActionName(){
        Object objValue = this.get(FIELD_PUSHPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 推送行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPushPSDEActionNameDirty(){
        if(this.contains(FIELD_PUSHPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 推送行为
     */
    @JsonIgnore
    public void resetPushPSDEActionName(){
        this.reset(FIELD_PUSHPSDEACTIONNAME);
    }

    /**
     * 设置 推送行为，详细说明：{@link #FIELD_PUSHPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPushPSDEActionName}
     * @param pushPSDEActionName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO pushpsdeactionname(String pushPSDEActionName){
        this.setPushPSDEActionName(pushPSDEActionName);
        return this;
    }

    /**
     * <B>QUEUEPARAMS</B>&nbsp;队列参数
     */
    public final static String FIELD_QUEUEPARAMS = "queueparams";

    /**
     * 设置 队列参数
     * 
     * @param queueParams
     * 
     */
    @JsonProperty(FIELD_QUEUEPARAMS)
    public void setQueueParams(String queueParams){
        this.set(FIELD_QUEUEPARAMS, queueParams);
    }
    
    /**
     * 获取 队列参数  
     * @return
     */
    @JsonIgnore
    public String getQueueParams(){
        Object objValue = this.get(FIELD_QUEUEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 队列参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueueParamsDirty(){
        if(this.contains(FIELD_QUEUEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 队列参数
     */
    @JsonIgnore
    public void resetQueueParams(){
        this.reset(FIELD_QUEUEPARAMS);
    }

    /**
     * 设置 队列参数
     * <P>
     * 等同 {@link #setQueueParams}
     * @param queueParams
     */
    @JsonIgnore
    public PSDEDTSQueueDTO queueparams(String queueParams){
        this.setQueueParams(queueParams);
        return this;
    }

    /**
     * <B>REFRESHPSDEACTIONID</B>&nbsp;刷新行为，指定分布事务队列进行状态刷新调用的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_REFRESHPSDEACTIONID = "refreshpsdeactionid";

    /**
     * 设置 刷新行为，详细说明：{@link #FIELD_REFRESHPSDEACTIONID}
     * 
     * @param refreshPSDEActionId
     * 
     */
    @JsonProperty(FIELD_REFRESHPSDEACTIONID)
    public void setRefreshPSDEActionId(String refreshPSDEActionId){
        this.set(FIELD_REFRESHPSDEACTIONID, refreshPSDEActionId);
    }
    
    /**
     * 获取 刷新行为  
     * @return
     */
    @JsonIgnore
    public String getRefreshPSDEActionId(){
        Object objValue = this.get(FIELD_REFRESHPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 刷新行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefreshPSDEActionIdDirty(){
        if(this.contains(FIELD_REFRESHPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 刷新行为
     */
    @JsonIgnore
    public void resetRefreshPSDEActionId(){
        this.reset(FIELD_REFRESHPSDEACTIONID);
    }

    /**
     * 设置 刷新行为，详细说明：{@link #FIELD_REFRESHPSDEACTIONID}
     * <P>
     * 等同 {@link #setRefreshPSDEActionId}
     * @param refreshPSDEActionId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO refreshpsdeactionid(String refreshPSDEActionId){
        this.setRefreshPSDEActionId(refreshPSDEActionId);
        return this;
    }

    /**
     * 设置 刷新行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefreshPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO refreshpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setRefreshPSDEActionId(null);
            this.setRefreshPSDEActionName(null);
        }
        else{
            this.setRefreshPSDEActionId(pSDEAction.getPSDEActionId());
            this.setRefreshPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>REFRESHPSDEACTIONNAME</B>&nbsp;刷新行为，指定分布事务队列进行状态刷新调用的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFRESHPSDEACTIONID}
     */
    public final static String FIELD_REFRESHPSDEACTIONNAME = "refreshpsdeactionname";

    /**
     * 设置 刷新行为，详细说明：{@link #FIELD_REFRESHPSDEACTIONNAME}
     * 
     * @param refreshPSDEActionName
     * 
     */
    @JsonProperty(FIELD_REFRESHPSDEACTIONNAME)
    public void setRefreshPSDEActionName(String refreshPSDEActionName){
        this.set(FIELD_REFRESHPSDEACTIONNAME, refreshPSDEActionName);
    }
    
    /**
     * 获取 刷新行为  
     * @return
     */
    @JsonIgnore
    public String getRefreshPSDEActionName(){
        Object objValue = this.get(FIELD_REFRESHPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 刷新行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefreshPSDEActionNameDirty(){
        if(this.contains(FIELD_REFRESHPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 刷新行为
     */
    @JsonIgnore
    public void resetRefreshPSDEActionName(){
        this.reset(FIELD_REFRESHPSDEACTIONNAME);
    }

    /**
     * 设置 刷新行为，详细说明：{@link #FIELD_REFRESHPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setRefreshPSDEActionName}
     * @param refreshPSDEActionName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO refreshpsdeactionname(String refreshPSDEActionName){
        this.setRefreshPSDEActionName(refreshPSDEActionName);
        return this;
    }

    /**
     * <B>REFRESHTIMER</B>&nbsp;刷新间隔，指定分布事务队列状态的刷新间隔，单位为【毫秒】，-1为未定义，未定义时为【-1】
     */
    public final static String FIELD_REFRESHTIMER = "refreshtimer";

    /**
     * 设置 刷新间隔，详细说明：{@link #FIELD_REFRESHTIMER}
     * 
     * @param refreshTimer
     * 
     */
    @JsonProperty(FIELD_REFRESHTIMER)
    public void setRefreshTimer(Integer refreshTimer){
        this.set(FIELD_REFRESHTIMER, refreshTimer);
    }
    
    /**
     * 获取 刷新间隔  
     * @return
     */
    @JsonIgnore
    public Integer getRefreshTimer(){
        Object objValue = this.get(FIELD_REFRESHTIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 刷新间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefreshTimerDirty(){
        if(this.contains(FIELD_REFRESHTIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 刷新间隔
     */
    @JsonIgnore
    public void resetRefreshTimer(){
        this.reset(FIELD_REFRESHTIMER);
    }

    /**
     * 设置 刷新间隔，详细说明：{@link #FIELD_REFRESHTIMER}
     * <P>
     * 等同 {@link #setRefreshTimer}
     * @param refreshTimer
     */
    @JsonIgnore
    public PSDEDTSQueueDTO refreshtimer(Integer refreshTimer){
        this.setRefreshTimer(refreshTimer);
        return this;
    }

    /**
     * <B>STATEPSDEFID</B>&nbsp;状态属性，指定分布事务队列存储队列状态的实体属性
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
    public PSDEDTSQueueDTO statepsdefid(String statePSDEFId){
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
    public PSDEDTSQueueDTO statepsdefid(PSDEFieldDTO pSDEField){
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
     * <B>STATEPSDEFNAME</B>&nbsp;状态属性，指定分布事务队列存储队列状态的实体属性
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
    public PSDEDTSQueueDTO statepsdefname(String statePSDEFName){
        this.setStatePSDEFName(statePSDEFName);
        return this;
    }

    /**
     * <B>TIMEPSDEFID</B>&nbsp;时间属性，指定分布事务队列存储超时时间的实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_TIMEPSDEFID = "timepsdefid";

    /**
     * 设置 时间属性，详细说明：{@link #FIELD_TIMEPSDEFID}
     * 
     * @param timePSDEFId
     * 
     */
    @JsonProperty(FIELD_TIMEPSDEFID)
    public void setTimePSDEFId(String timePSDEFId){
        this.set(FIELD_TIMEPSDEFID, timePSDEFId);
    }
    
    /**
     * 获取 时间属性  
     * @return
     */
    @JsonIgnore
    public String getTimePSDEFId(){
        Object objValue = this.get(FIELD_TIMEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimePSDEFIdDirty(){
        if(this.contains(FIELD_TIMEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间属性
     */
    @JsonIgnore
    public void resetTimePSDEFId(){
        this.reset(FIELD_TIMEPSDEFID);
    }

    /**
     * 设置 时间属性，详细说明：{@link #FIELD_TIMEPSDEFID}
     * <P>
     * 等同 {@link #setTimePSDEFId}
     * @param timePSDEFId
     */
    @JsonIgnore
    public PSDEDTSQueueDTO timepsdefid(String timePSDEFId){
        this.setTimePSDEFId(timePSDEFId);
        return this;
    }

    /**
     * 设置 时间属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTimePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEDTSQueueDTO timepsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setTimePSDEFId(null);
            this.setTimePSDEFName(null);
        }
        else{
            this.setTimePSDEFId(pSDEField.getPSDEFieldId());
            this.setTimePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TIMEPSDEFNAME</B>&nbsp;时间属性，指定分布事务队列存储超时时间的实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TIMEPSDEFID}
     */
    public final static String FIELD_TIMEPSDEFNAME = "timepsdefname";

    /**
     * 设置 时间属性，详细说明：{@link #FIELD_TIMEPSDEFNAME}
     * 
     * @param timePSDEFName
     * 
     */
    @JsonProperty(FIELD_TIMEPSDEFNAME)
    public void setTimePSDEFName(String timePSDEFName){
        this.set(FIELD_TIMEPSDEFNAME, timePSDEFName);
    }
    
    /**
     * 获取 时间属性  
     * @return
     */
    @JsonIgnore
    public String getTimePSDEFName(){
        Object objValue = this.get(FIELD_TIMEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 时间属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimePSDEFNameDirty(){
        if(this.contains(FIELD_TIMEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 时间属性
     */
    @JsonIgnore
    public void resetTimePSDEFName(){
        this.reset(FIELD_TIMEPSDEFNAME);
    }

    /**
     * 设置 时间属性，详细说明：{@link #FIELD_TIMEPSDEFNAME}
     * <P>
     * 等同 {@link #setTimePSDEFName}
     * @param timePSDEFName
     */
    @JsonIgnore
    public PSDEDTSQueueDTO timepsdefname(String timePSDEFName){
        this.setTimePSDEFName(timePSDEFName);
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
    public PSDEDTSQueueDTO updatedate(Timestamp updateDate){
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
    public PSDEDTSQueueDTO updateman(String updateMan){
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
    public PSDEDTSQueueDTO usercat(String userCat){
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
    public PSDEDTSQueueDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDTSQueueDTO usertag(String userTag){
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
    public PSDEDTSQueueDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSDEDTSQueueDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSDEDTSQueueDTO usertag4(String userTag4){
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
    public PSDEDTSQueueDTO validflag(Integer validFlag){
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
    public PSDEDTSQueueDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEDTSQueueId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEDTSQueueId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDTSQueueId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDTSQueueId(strValue);
    }

    @JsonIgnore
    public PSDEDTSQueueDTO id(String strValue){
        this.setPSDEDTSQueueId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEDTSQueueDTO){
            PSDEDTSQueueDTO dto = (PSDEDTSQueueDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
