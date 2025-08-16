package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSACHANDLERACTION</B>界面处理对象行为 模型传输对象
 * <P>
 * 界面处理对象的行为配置模型，定义界面请求行为及相应的处理逻辑
 */
public class PSACHandlerActionDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSACHandlerActionDTO(){
    }      

    /**
     * <B>ACTIONDESC</B>&nbsp;行为描述，指定界面处理行为的描述信息
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_ACTIONDESC = "actiondesc";

    /**
     * 设置 行为描述，详细说明：{@link #FIELD_ACTIONDESC}
     * 
     * @param actionDesc
     * 
     */
    @JsonProperty(FIELD_ACTIONDESC)
    public void setActionDesc(String actionDesc){
        this.set(FIELD_ACTIONDESC, actionDesc);
    }
    
    /**
     * 获取 行为描述  
     * @return
     */
    @JsonIgnore
    public String getActionDesc(){
        Object objValue = this.get(FIELD_ACTIONDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为描述 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionDescDirty(){
        if(this.contains(FIELD_ACTIONDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为描述
     */
    @JsonIgnore
    public void resetActionDesc(){
        this.reset(FIELD_ACTIONDESC);
    }

    /**
     * 设置 行为描述，详细说明：{@link #FIELD_ACTIONDESC}
     * <P>
     * 等同 {@link #setActionDesc}
     * @param actionDesc
     */
    @JsonIgnore
    public PSACHandlerActionDTO actiondesc(String actionDesc){
        this.setActionDesc(actionDesc);
        return this;
    }

    /**
     * <B>ACTIONTIMEOUT</B>&nbsp;操作超时，指定界面处理行为的超时时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_ACTIONTIMEOUT = "actiontimeout";

    /**
     * 设置 操作超时，详细说明：{@link #FIELD_ACTIONTIMEOUT}
     * 
     * @param actionTimeout
     * 
     */
    @JsonProperty(FIELD_ACTIONTIMEOUT)
    public void setActionTimeout(Integer actionTimeout){
        this.set(FIELD_ACTIONTIMEOUT, actionTimeout);
    }
    
    /**
     * 获取 操作超时  
     * @return
     */
    @JsonIgnore
    public Integer getActionTimeout(){
        Object objValue = this.get(FIELD_ACTIONTIMEOUT);
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
    public boolean isActionTimeoutDirty(){
        if(this.contains(FIELD_ACTIONTIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作超时
     */
    @JsonIgnore
    public void resetActionTimeout(){
        this.reset(FIELD_ACTIONTIMEOUT);
    }

    /**
     * 设置 操作超时，详细说明：{@link #FIELD_ACTIONTIMEOUT}
     * <P>
     * 等同 {@link #setActionTimeout}
     * @param actionTimeout
     */
    @JsonIgnore
    public PSACHandlerActionDTO actiontimeout(Integer actionTimeout){
        this.setActionTimeout(actionTimeout);
        return this;
    }

    /**
     * <B>ACTIONTYPE</B>&nbsp;行为类型，指定界面处理行为的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CtrlHandlerActionType} 
     */
    public final static String FIELD_ACTIONTYPE = "actiontype";

    /**
     * 设置 行为类型，详细说明：{@link #FIELD_ACTIONTYPE}
     * 
     * @param actionType
     * 
     */
    @JsonProperty(FIELD_ACTIONTYPE)
    public void setActionType(String actionType){
        this.set(FIELD_ACTIONTYPE, actionType);
    }
    
    /**
     * 获取 行为类型  
     * @return
     */
    @JsonIgnore
    public String getActionType(){
        Object objValue = this.get(FIELD_ACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTypeDirty(){
        if(this.contains(FIELD_ACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为类型
     */
    @JsonIgnore
    public void resetActionType(){
        this.reset(FIELD_ACTIONTYPE);
    }

    /**
     * 设置 行为类型，详细说明：{@link #FIELD_ACTIONTYPE}
     * <P>
     * 等同 {@link #setActionType}
     * @param actionType
     */
    @JsonIgnore
    public PSACHandlerActionDTO actiontype(String actionType){
        this.setActionType(actionType);
        return this;
    }

     /**
     * 设置 行为类型，详细说明：{@link #FIELD_ACTIONTYPE}
     * <P>
     * 等同 {@link #setActionType}
     * @param actionType
     */
    @JsonIgnore
    public PSACHandlerActionDTO actiontype(net.ibizsys.model.PSModelEnums.CtrlHandlerActionType actionType){
        if(actionType == null){
            this.setActionType(null);
        }
        else{
            this.setActionType(actionType.value);
        }
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
    public PSACHandlerActionDTO createdate(Timestamp createDate){
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
    public PSACHandlerActionDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATAACCACTION</B>&nbsp;数据访问行为
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_DATAACCACTION = "dataaccaction";

    /**
     * 设置 数据访问行为
     * 
     * @param dataAccAction
     * 
     */
    @JsonProperty(FIELD_DATAACCACTION)
    public void setDataAccAction(String dataAccAction){
        this.set(FIELD_DATAACCACTION, dataAccAction);
    }
    
    /**
     * 获取 数据访问行为  
     * @return
     */
    @JsonIgnore
    public String getDataAccAction(){
        Object objValue = this.get(FIELD_DATAACCACTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据访问行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataAccActionDirty(){
        if(this.contains(FIELD_DATAACCACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据访问行为
     */
    @JsonIgnore
    public void resetDataAccAction(){
        this.reset(FIELD_DATAACCACTION);
    }

    /**
     * 设置 数据访问行为
     * <P>
     * 等同 {@link #setDataAccAction}
     * @param dataAccAction
     */
    @JsonIgnore
    public PSACHandlerActionDTO dataaccaction(String dataAccAction){
        this.setDataAccAction(dataAccAction);
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
    public PSACHandlerActionDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSACHANDLERACTIONID</B>&nbsp;部件后台处理行为标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSACHANDLERACTIONID = "psachandleractionid";

    /**
     * 设置 部件后台处理行为标识
     * 
     * @param pSACHandlerActionId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERACTIONID)
    public void setPSACHandlerActionId(String pSACHandlerActionId){
        this.set(FIELD_PSACHANDLERACTIONID, pSACHandlerActionId);
    }
    
    /**
     * 获取 部件后台处理行为标识  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerActionId(){
        Object objValue = this.get(FIELD_PSACHANDLERACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件后台处理行为标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerActionIdDirty(){
        if(this.contains(FIELD_PSACHANDLERACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件后台处理行为标识
     */
    @JsonIgnore
    public void resetPSACHandlerActionId(){
        this.reset(FIELD_PSACHANDLERACTIONID);
    }

    /**
     * 设置 部件后台处理行为标识
     * <P>
     * 等同 {@link #setPSACHandlerActionId}
     * @param pSACHandlerActionId
     */
    @JsonIgnore
    public PSACHandlerActionDTO psachandleractionid(String pSACHandlerActionId){
        this.setPSACHandlerActionId(pSACHandlerActionId);
        return this;
    }

    /**
     * <B>PSACHANDLERACTIONNAME</B>&nbsp;行为标识，指定界面处理行为的标识，需在所在界面处理对象中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSACHANDLERACTIONNAME = "psachandleractionname";

    /**
     * 设置 行为标识，详细说明：{@link #FIELD_PSACHANDLERACTIONNAME}
     * 
     * @param pSACHandlerActionName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERACTIONNAME)
    public void setPSACHandlerActionName(String pSACHandlerActionName){
        this.set(FIELD_PSACHANDLERACTIONNAME, pSACHandlerActionName);
    }
    
    /**
     * 获取 行为标识  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerActionName(){
        Object objValue = this.get(FIELD_PSACHANDLERACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行为标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerActionNameDirty(){
        if(this.contains(FIELD_PSACHANDLERACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为标识
     */
    @JsonIgnore
    public void resetPSACHandlerActionName(){
        this.reset(FIELD_PSACHANDLERACTIONNAME);
    }

    /**
     * 设置 行为标识，详细说明：{@link #FIELD_PSACHANDLERACTIONNAME}
     * <P>
     * 等同 {@link #setPSACHandlerActionName}
     * @param pSACHandlerActionName
     */
    @JsonIgnore
    public PSACHandlerActionDTO psachandleractionname(String pSACHandlerActionName){
        this.setPSACHandlerActionName(pSACHandlerActionName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSACHandlerActionName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSACHandlerActionName(strName);
    }

    @JsonIgnore
    public PSACHandlerActionDTO name(String strName){
        this.setPSACHandlerActionName(strName);
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定行为所在的界面处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 界面处理对象  
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
     * 判断 界面处理对象 是否指定值，包括空值
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
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSACHandlerActionDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 界面处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSACHandlerActionDTO psachandlerid(PSACHandlerDTO pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定行为所在的界面处理对象
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
    public PSACHandlerActionDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定界面处理行为提供功能的实体行为
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
    public PSACHandlerActionDTO psdeactionid(String pSDEActionId){
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
    public PSACHandlerActionDTO psdeactionid(PSDEActionDTO pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定界面处理行为提供功能的实体行为
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
    public PSACHandlerActionDTO psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;实体操作标识，指定界面处理行为访问需要具备的操作标识
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
    public PSACHandlerActionDTO psdeopprivid(String pSDEOPPrivId){
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
    public PSACHandlerActionDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
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
     * <B>PSDEOPPRIVNAME</B>&nbsp;实体操作标识，指定界面处理行为访问需要具备的操作标识
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
    public PSACHandlerActionDTO psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
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
    public PSACHandlerActionDTO updatedate(Timestamp updateDate){
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
    public PSACHandlerActionDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSACHandlerActionDTO validflag(Integer validFlag){
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
    public PSACHandlerActionDTO validflag(Boolean validFlag){
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
        return this.getPSACHandlerActionId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSACHandlerActionId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSACHandlerActionId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSACHandlerActionId(strValue);
    }

    @JsonIgnore
    public PSACHandlerActionDTO id(String strValue){
        this.setPSACHandlerActionId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSACHandlerActionDTO){
            PSACHandlerActionDTO dto = (PSACHandlerActionDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
