package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSWXLOGIC</B>微信交互逻辑 模型传输对象
 * <P>
 * 微信交互逻辑模型，定义微信应用的事件处理逻辑
 */
public class PSWXLogic extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSWXLogic(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定微信交互逻辑的代码标识，需在所属微信应用中具备唯一性
     * <P>
     * 字符串：最大长度 20
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
    public PSWXLogic codename(String codeName){
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
    public PSWXLogic createdate(String createDate){
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
    public PSWXLogic createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EVENTTYPE</B>&nbsp;事件类型，指定微信逻辑响应的事件类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WXLogicEventType} 
     */
    public final static String FIELD_EVENTTYPE = "eventtype";

    /**
     * 设置 事件类型，详细说明：{@link #FIELD_EVENTTYPE}
     * 
     * @param eventType
     * 
     */
    @JsonProperty(FIELD_EVENTTYPE)
    public void setEventType(String eventType){
        this.set(FIELD_EVENTTYPE, eventType);
    }
    
    /**
     * 获取 事件类型  
     * @return
     */
    @JsonIgnore
    public String getEventType(){
        Object objValue = this.get(FIELD_EVENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventTypeDirty(){
        if(this.contains(FIELD_EVENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事件类型
     */
    @JsonIgnore
    public void resetEventType(){
        this.reset(FIELD_EVENTTYPE);
    }

    /**
     * 设置 事件类型，详细说明：{@link #FIELD_EVENTTYPE}
     * <P>
     * 等同 {@link #setEventType}
     * @param eventType
     */
    @JsonIgnore
    public PSWXLogic eventtype(String eventType){
        this.setEventType(eventType);
        return this;
    }

     /**
     * 设置 事件类型，详细说明：{@link #FIELD_EVENTTYPE}
     * <P>
     * 等同 {@link #setEventType}
     * @param eventType
     */
    @JsonIgnore
    public PSWXLogic eventtype(net.ibizsys.psmodel.core.util.PSModelEnums.WXLogicEventType eventType){
        if(eventType == null){
            this.setEventType(null);
        }
        else{
            this.setEventType(eventType.value);
        }
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSWXLogic memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体逻辑，指定微信交互逻辑调用的实体处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体逻辑  
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
     * 判断 实体逻辑 是否指定值，包括空值
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
     * 重置 实体逻辑
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSWXLogic psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 实体逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSWXLogic psdeactionid(PSDEAction pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体逻辑，指定微信交互逻辑调用的实体处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体逻辑  
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
     * 判断 实体逻辑 是否指定值，包括空值
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
     * 重置 实体逻辑
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSWXLogic psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定微信交互逻辑调用处理逻辑的所属实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSWXLogic psdeid(String pSDEId){
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
    public PSWXLogic psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定微信交互逻辑调用处理逻辑的所属实体
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
    public PSWXLogic psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceId
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCEID)
    public void setPSSysResourceId(String pSSysResourceId){
        this.set(FIELD_PSSYSRESOURCEID, pSSysResourceId);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceId(){
        Object objValue = this.get(FIELD_PSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceIdDirty(){
        if(this.contains(FIELD_PSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceId(){
        this.reset(FIELD_PSSYSRESOURCEID);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSWXLogic pssysresourceid(String pSSysResourceId){
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    /**
     * 设置 系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSWXLogic pssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        }
        else{
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceName
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCENAME)
    public void setPSSysResourceName(String pSSysResourceName){
        this.set(FIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceName(){
        Object objValue = this.get(FIELD_PSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceNameDirty(){
        if(this.contains(FIELD_PSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceName(){
        this.reset(FIELD_PSSYSRESOURCENAME);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSWXLogic pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
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
    public PSWXLogic pssyssfpluginid(String pSSysSFPluginId){
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
    public PSWXLogic pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSWXLogic pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSWXACCOUNTID</B>&nbsp;公众微信号，指定微信交互逻辑所属的微信公众号
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWXAccount} 
     */
    public final static String FIELD_PSWXACCOUNTID = "pswxaccountid";

    /**
     * 设置 公众微信号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * 
     * @param pSWXAccountId
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTID)
    public void setPSWXAccountId(String pSWXAccountId){
        this.set(FIELD_PSWXACCOUNTID, pSWXAccountId);
    }
    
    /**
     * 获取 公众微信号  
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
     * 判断 公众微信号 是否指定值，包括空值
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
     * 重置 公众微信号
     */
    @JsonIgnore
    public void resetPSWXAccountId(){
        this.reset(FIELD_PSWXACCOUNTID);
    }

    /**
     * 设置 公众微信号，详细说明：{@link #FIELD_PSWXACCOUNTID}
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccountId
     */
    @JsonIgnore
    public PSWXLogic pswxaccountid(String pSWXAccountId){
        this.setPSWXAccountId(pSWXAccountId);
        return this;
    }

    /**
     * 设置 公众微信号，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXAccountId}
     * @param pSWXAccount 引用对象
     */
    @JsonIgnore
    public PSWXLogic pswxaccountid(PSWXAccount pSWXAccount){
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
     * <B>PSWXACCOUNTNAME</B>&nbsp;公众微信号，指定微信交互逻辑所属的微信公众号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXACCOUNTID}
     */
    public final static String FIELD_PSWXACCOUNTNAME = "pswxaccountname";

    /**
     * 设置 公众微信号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * 
     * @param pSWXAccountName
     * 
     */
    @JsonProperty(FIELD_PSWXACCOUNTNAME)
    public void setPSWXAccountName(String pSWXAccountName){
        this.set(FIELD_PSWXACCOUNTNAME, pSWXAccountName);
    }
    
    /**
     * 获取 公众微信号  
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
     * 判断 公众微信号 是否指定值，包括空值
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
     * 重置 公众微信号
     */
    @JsonIgnore
    public void resetPSWXAccountName(){
        this.reset(FIELD_PSWXACCOUNTNAME);
    }

    /**
     * 设置 公众微信号，详细说明：{@link #FIELD_PSWXACCOUNTNAME}
     * <P>
     * 等同 {@link #setPSWXAccountName}
     * @param pSWXAccountName
     */
    @JsonIgnore
    public PSWXLogic pswxaccountname(String pSWXAccountName){
        this.setPSWXAccountName(pSWXAccountName);
        return this;
    }

    /**
     * <B>PSWXENTAPPID</B>&nbsp;微信企业应用，指定微信交互逻辑所属的微信应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWXEntApp} 
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
    public PSWXLogic pswxentappid(String pSWXEntAppId){
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
    public PSWXLogic pswxentappid(PSWXEntApp pSWXEntApp){
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
     * <B>PSWXENTAPPNAME</B>&nbsp;微信企业应用，指定微信交互逻辑所属的微信应用
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
    public PSWXLogic pswxentappname(String pSWXEntAppName){
        this.setPSWXEntAppName(pSWXEntAppName);
        return this;
    }

    /**
     * <B>PSWXLOGICID</B>&nbsp;微信响应逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSWXLOGICID = "pswxlogicid";

    /**
     * 设置 微信响应逻辑标识
     * 
     * @param pSWXLogicId
     * 
     */
    @JsonProperty(FIELD_PSWXLOGICID)
    public void setPSWXLogicId(String pSWXLogicId){
        this.set(FIELD_PSWXLOGICID, pSWXLogicId);
    }
    
    /**
     * 获取 微信响应逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSWXLogicId(){
        Object objValue = this.get(FIELD_PSWXLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信响应逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXLogicIdDirty(){
        if(this.contains(FIELD_PSWXLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信响应逻辑标识
     */
    @JsonIgnore
    public void resetPSWXLogicId(){
        this.reset(FIELD_PSWXLOGICID);
    }

    /**
     * 设置 微信响应逻辑标识
     * <P>
     * 等同 {@link #setPSWXLogicId}
     * @param pSWXLogicId
     */
    @JsonIgnore
    public PSWXLogic pswxlogicid(String pSWXLogicId){
        this.setPSWXLogicId(pSWXLogicId);
        return this;
    }

    /**
     * <B>PSWXLOGICNAME</B>&nbsp;响应逻辑名称，指定微信应用响应逻辑的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSWXLOGICNAME = "pswxlogicname";

    /**
     * 设置 响应逻辑名称，详细说明：{@link #FIELD_PSWXLOGICNAME}
     * 
     * @param pSWXLogicName
     * 
     */
    @JsonProperty(FIELD_PSWXLOGICNAME)
    public void setPSWXLogicName(String pSWXLogicName){
        this.set(FIELD_PSWXLOGICNAME, pSWXLogicName);
    }
    
    /**
     * 获取 响应逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getPSWXLogicName(){
        Object objValue = this.get(FIELD_PSWXLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 响应逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXLogicNameDirty(){
        if(this.contains(FIELD_PSWXLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 响应逻辑名称
     */
    @JsonIgnore
    public void resetPSWXLogicName(){
        this.reset(FIELD_PSWXLOGICNAME);
    }

    /**
     * 设置 响应逻辑名称，详细说明：{@link #FIELD_PSWXLOGICNAME}
     * <P>
     * 等同 {@link #setPSWXLogicName}
     * @param pSWXLogicName
     */
    @JsonIgnore
    public PSWXLogic pswxlogicname(String pSWXLogicName){
        this.setPSWXLogicName(pSWXLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSWXLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSWXLogicName(strName);
    }

    @JsonIgnore
    public PSWXLogic name(String strName){
        this.setPSWXLogicName(strName);
        return this;
    }

    /**
     * <B>PSWXMENUFUNCID</B>&nbsp;微信菜单功能
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWXMenuFunc} 
     */
    public final static String FIELD_PSWXMENUFUNCID = "pswxmenufuncid";

    /**
     * 设置 微信菜单功能
     * 
     * @param pSWXMenuFuncId
     * 
     */
    @JsonProperty(FIELD_PSWXMENUFUNCID)
    public void setPSWXMenuFuncId(String pSWXMenuFuncId){
        this.set(FIELD_PSWXMENUFUNCID, pSWXMenuFuncId);
    }
    
    /**
     * 获取 微信菜单功能  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuFuncId(){
        Object objValue = this.get(FIELD_PSWXMENUFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuFuncIdDirty(){
        if(this.contains(FIELD_PSWXMENUFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单功能
     */
    @JsonIgnore
    public void resetPSWXMenuFuncId(){
        this.reset(FIELD_PSWXMENUFUNCID);
    }

    /**
     * 设置 微信菜单功能
     * <P>
     * 等同 {@link #setPSWXMenuFuncId}
     * @param pSWXMenuFuncId
     */
    @JsonIgnore
    public PSWXLogic pswxmenufuncid(String pSWXMenuFuncId){
        this.setPSWXMenuFuncId(pSWXMenuFuncId);
        return this;
    }

    /**
     * 设置 微信菜单功能，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWXMenuFuncId}
     * @param pSWXMenuFunc 引用对象
     */
    @JsonIgnore
    public PSWXLogic pswxmenufuncid(PSWXMenuFunc pSWXMenuFunc){
        if(pSWXMenuFunc == null){
            this.setPSWXMenuFuncId(null);
            this.setPSWXMenuFuncName(null);
        }
        else{
            this.setPSWXMenuFuncId(pSWXMenuFunc.getPSWXMenuFuncId());
            this.setPSWXMenuFuncName(pSWXMenuFunc.getPSWXMenuFuncName());
        }
        return this;
    }

    /**
     * <B>PSWXMENUFUNCNAME</B>&nbsp;微信菜单功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWXMENUFUNCID}
     */
    public final static String FIELD_PSWXMENUFUNCNAME = "pswxmenufuncname";

    /**
     * 设置 微信菜单功能
     * 
     * @param pSWXMenuFuncName
     * 
     */
    @JsonProperty(FIELD_PSWXMENUFUNCNAME)
    public void setPSWXMenuFuncName(String pSWXMenuFuncName){
        this.set(FIELD_PSWXMENUFUNCNAME, pSWXMenuFuncName);
    }
    
    /**
     * 获取 微信菜单功能  
     * @return
     */
    @JsonIgnore
    public String getPSWXMenuFuncName(){
        Object objValue = this.get(FIELD_PSWXMENUFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 微信菜单功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWXMenuFuncNameDirty(){
        if(this.contains(FIELD_PSWXMENUFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 微信菜单功能
     */
    @JsonIgnore
    public void resetPSWXMenuFuncName(){
        this.reset(FIELD_PSWXMENUFUNCNAME);
    }

    /**
     * 设置 微信菜单功能
     * <P>
     * 等同 {@link #setPSWXMenuFuncName}
     * @param pSWXMenuFuncName
     */
    @JsonIgnore
    public PSWXLogic pswxmenufuncname(String pSWXMenuFuncName){
        this.setPSWXMenuFuncName(pSWXMenuFuncName);
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
    public PSWXLogic updatedate(String updateDate){
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
    public PSWXLogic updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat} 
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
    public PSWXLogic usercat(String userCat){
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
    public PSWXLogic usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 40
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
    public PSWXLogic usertag(String userTag){
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
    public PSWXLogic usertag2(String userTag2){
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
    public PSWXLogic usertag3(String userTag3){
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
    public PSWXLogic usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSWXLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSWXLogicId(strValue);
    }

    @JsonIgnore
    public PSWXLogic id(String strValue){
        this.setPSWXLogicId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSWXLogic){
            PSWXLogic model = (PSWXLogic)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
