package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSAHANDLER</B>系统服务接口处理器 模型传输对象
 * <P>
 * 系统服务接口处理器模型，为接口提供预置处理能力，接口处理器可以是全功能组件或是以代码的基类对象存在
 */
public class PSSysSAHandlerDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSAHandlerDTO(){
    }      

    /**
     * <B>CLIENTHANDLEROBJ</B>&nbsp;客户端处理对象，指定服务接口处理对象的客户端组件对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CLIENTHANDLEROBJ = "clienthandlerobj";

    /**
     * 设置 客户端处理对象，详细说明：{@link #FIELD_CLIENTHANDLEROBJ}
     * 
     * @param clientHandlerObj
     * 
     */
    @JsonProperty(FIELD_CLIENTHANDLEROBJ)
    public void setClientHandlerObj(String clientHandlerObj){
        this.set(FIELD_CLIENTHANDLEROBJ, clientHandlerObj);
    }
    
    /**
     * 获取 客户端处理对象  
     * @return
     */
    @JsonIgnore
    public String getClientHandlerObj(){
        Object objValue = this.get(FIELD_CLIENTHANDLEROBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 客户端处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClientHandlerObjDirty(){
        if(this.contains(FIELD_CLIENTHANDLEROBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 客户端处理对象
     */
    @JsonIgnore
    public void resetClientHandlerObj(){
        this.reset(FIELD_CLIENTHANDLEROBJ);
    }

    /**
     * 设置 客户端处理对象，详细说明：{@link #FIELD_CLIENTHANDLEROBJ}
     * <P>
     * 等同 {@link #setClientHandlerObj}
     * @param clientHandlerObj
     */
    @JsonIgnore
    public PSSysSAHandlerDTO clienthandlerobj(String clientHandlerObj){
        this.setClientHandlerObj(clientHandlerObj);
        return this;
    }

    /**
     * <B>CLIENTHANDLEROBJ2</B>&nbsp;客户端处理对象2，指定服务接口处理对象的客户端组件对象2
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CLIENTHANDLEROBJ2 = "clienthandlerobj2";

    /**
     * 设置 客户端处理对象2，详细说明：{@link #FIELD_CLIENTHANDLEROBJ2}
     * 
     * @param clientHandlerObj2
     * 
     */
    @JsonProperty(FIELD_CLIENTHANDLEROBJ2)
    public void setClientHandlerObj2(String clientHandlerObj2){
        this.set(FIELD_CLIENTHANDLEROBJ2, clientHandlerObj2);
    }
    
    /**
     * 获取 客户端处理对象2  
     * @return
     */
    @JsonIgnore
    public String getClientHandlerObj2(){
        Object objValue = this.get(FIELD_CLIENTHANDLEROBJ2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 客户端处理对象2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClientHandlerObj2Dirty(){
        if(this.contains(FIELD_CLIENTHANDLEROBJ2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 客户端处理对象2
     */
    @JsonIgnore
    public void resetClientHandlerObj2(){
        this.reset(FIELD_CLIENTHANDLEROBJ2);
    }

    /**
     * 设置 客户端处理对象2，详细说明：{@link #FIELD_CLIENTHANDLEROBJ2}
     * <P>
     * 等同 {@link #setClientHandlerObj2}
     * @param clientHandlerObj2
     */
    @JsonIgnore
    public PSSysSAHandlerDTO clienthandlerobj2(String clientHandlerObj2){
        this.setClientHandlerObj2(clientHandlerObj2);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定服务接口处理对象的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysSAHandlerDTO codename(String codeName){
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
    public PSSysSAHandlerDTO createdate(Timestamp createDate){
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
    public PSSysSAHandlerDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>HANDLEROBJ</B>&nbsp;服务端处理对象，指定服务接口处理对象的服务器端组件对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_HANDLEROBJ = "handlerobj";

    /**
     * 设置 服务端处理对象，详细说明：{@link #FIELD_HANDLEROBJ}
     * 
     * @param handlerObj
     * 
     */
    @JsonProperty(FIELD_HANDLEROBJ)
    public void setHandlerObj(String handlerObj){
        this.set(FIELD_HANDLEROBJ, handlerObj);
    }
    
    /**
     * 获取 服务端处理对象  
     * @return
     */
    @JsonIgnore
    public String getHandlerObj(){
        Object objValue = this.get(FIELD_HANDLEROBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务端处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerObjDirty(){
        if(this.contains(FIELD_HANDLEROBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务端处理对象
     */
    @JsonIgnore
    public void resetHandlerObj(){
        this.reset(FIELD_HANDLEROBJ);
    }

    /**
     * 设置 服务端处理对象，详细说明：{@link #FIELD_HANDLEROBJ}
     * <P>
     * 等同 {@link #setHandlerObj}
     * @param handlerObj
     */
    @JsonIgnore
    public PSSysSAHandlerDTO handlerobj(String handlerObj){
        this.setHandlerObj(handlerObj);
        return this;
    }

    /**
     * <B>HANDLEROBJ2</B>&nbsp;服务端处理对象2，指定服务接口处理对象的服务器端组件对象2
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_HANDLEROBJ2 = "handlerobj2";

    /**
     * 设置 服务端处理对象2，详细说明：{@link #FIELD_HANDLEROBJ2}
     * 
     * @param handlerObj2
     * 
     */
    @JsonProperty(FIELD_HANDLEROBJ2)
    public void setHandlerObj2(String handlerObj2){
        this.set(FIELD_HANDLEROBJ2, handlerObj2);
    }
    
    /**
     * 获取 服务端处理对象2  
     * @return
     */
    @JsonIgnore
    public String getHandlerObj2(){
        Object objValue = this.get(FIELD_HANDLEROBJ2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务端处理对象2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerObj2Dirty(){
        if(this.contains(FIELD_HANDLEROBJ2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务端处理对象2
     */
    @JsonIgnore
    public void resetHandlerObj2(){
        this.reset(FIELD_HANDLEROBJ2);
    }

    /**
     * 设置 服务端处理对象2，详细说明：{@link #FIELD_HANDLEROBJ2}
     * <P>
     * 等同 {@link #setHandlerObj2}
     * @param handlerObj2
     */
    @JsonIgnore
    public PSSysSAHandlerDTO handlerobj2(String handlerObj2){
        this.setHandlerObj2(handlerObj2);
        return this;
    }

    /**
     * <B>HANDLERPARAMS</B>&nbsp;处理器参数，指定服务接口处理对象的参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_HANDLERPARAMS = "handlerparams";

    /**
     * 设置 处理器参数，详细说明：{@link #FIELD_HANDLERPARAMS}
     * 
     * @param handlerParams
     * 
     */
    @JsonProperty(FIELD_HANDLERPARAMS)
    public void setHandlerParams(String handlerParams){
        this.set(FIELD_HANDLERPARAMS, handlerParams);
    }
    
    /**
     * 获取 处理器参数  
     * @return
     */
    @JsonIgnore
    public String getHandlerParams(){
        Object objValue = this.get(FIELD_HANDLERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理器参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHandlerParamsDirty(){
        if(this.contains(FIELD_HANDLERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理器参数
     */
    @JsonIgnore
    public void resetHandlerParams(){
        this.reset(FIELD_HANDLERPARAMS);
    }

    /**
     * 设置 处理器参数，详细说明：{@link #FIELD_HANDLERPARAMS}
     * <P>
     * 等同 {@link #setHandlerParams}
     * @param handlerParams
     */
    @JsonIgnore
    public PSSysSAHandlerDTO handlerparams(String handlerParams){
        this.setHandlerParams(handlerParams);
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
    public PSSysSAHandlerDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统服务接口处理器所在的系统模块
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
    public PSSysSAHandlerDTO psmoduleid(String pSModuleId){
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
    public PSSysSAHandlerDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统服务接口处理器所在的系统模块
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
    public PSSysSAHandlerDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSFSAHANDLERID</B>&nbsp;预置接口处理器，指定系统服务接口处理器来源的预置接口处理对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFSAHANDLERID = "pssfsahandlerid";

    /**
     * 设置 预置接口处理器，详细说明：{@link #FIELD_PSSFSAHANDLERID}
     * 
     * @param pSSFSAHandlerId
     * 
     */
    @JsonProperty(FIELD_PSSFSAHANDLERID)
    public void setPSSFSAHandlerId(String pSSFSAHandlerId){
        this.set(FIELD_PSSFSAHANDLERID, pSSFSAHandlerId);
    }
    
    /**
     * 获取 预置接口处理器  
     * @return
     */
    @JsonIgnore
    public String getPSSFSAHandlerId(){
        Object objValue = this.get(FIELD_PSSFSAHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置接口处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFSAHandlerIdDirty(){
        if(this.contains(FIELD_PSSFSAHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置接口处理器
     */
    @JsonIgnore
    public void resetPSSFSAHandlerId(){
        this.reset(FIELD_PSSFSAHANDLERID);
    }

    /**
     * 设置 预置接口处理器，详细说明：{@link #FIELD_PSSFSAHANDLERID}
     * <P>
     * 等同 {@link #setPSSFSAHandlerId}
     * @param pSSFSAHandlerId
     */
    @JsonIgnore
    public PSSysSAHandlerDTO pssfsahandlerid(String pSSFSAHandlerId){
        this.setPSSFSAHandlerId(pSSFSAHandlerId);
        return this;
    }

    /**
     * <B>PSSFSAHANDLERNAME</B>&nbsp;预置接口处理器，指定系统服务接口处理器来源的预置接口处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFSAHANDLERID}
     */
    public final static String FIELD_PSSFSAHANDLERNAME = "pssfsahandlername";

    /**
     * 设置 预置接口处理器，详细说明：{@link #FIELD_PSSFSAHANDLERNAME}
     * 
     * @param pSSFSAHandlerName
     * 
     */
    @JsonProperty(FIELD_PSSFSAHANDLERNAME)
    public void setPSSFSAHandlerName(String pSSFSAHandlerName){
        this.set(FIELD_PSSFSAHANDLERNAME, pSSFSAHandlerName);
    }
    
    /**
     * 获取 预置接口处理器  
     * @return
     */
    @JsonIgnore
    public String getPSSFSAHandlerName(){
        Object objValue = this.get(FIELD_PSSFSAHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置接口处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFSAHandlerNameDirty(){
        if(this.contains(FIELD_PSSFSAHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置接口处理器
     */
    @JsonIgnore
    public void resetPSSFSAHandlerName(){
        this.reset(FIELD_PSSFSAHANDLERNAME);
    }

    /**
     * 设置 预置接口处理器，详细说明：{@link #FIELD_PSSFSAHANDLERNAME}
     * <P>
     * 等同 {@link #setPSSFSAHandlerName}
     * @param pSSFSAHandlerName
     */
    @JsonIgnore
    public PSSysSAHandlerDTO pssfsahandlername(String pSSFSAHandlerName){
        this.setPSSFSAHandlerName(pSSFSAHandlerName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
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
    public PSSysSAHandlerDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysSAHandlerDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSSysSAHandlerDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSAHANDLERID</B>&nbsp;系统服务接口后台处理器标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSAHANDLERID = "pssyssahandlerid";

    /**
     * 设置 系统服务接口后台处理器标识
     * 
     * @param pSSysSAHandlerId
     * 
     */
    @JsonProperty(FIELD_PSSYSSAHANDLERID)
    public void setPSSysSAHandlerId(String pSSysSAHandlerId){
        this.set(FIELD_PSSYSSAHANDLERID, pSSysSAHandlerId);
    }
    
    /**
     * 获取 系统服务接口后台处理器标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSAHandlerId(){
        Object objValue = this.get(FIELD_PSSYSSAHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口后台处理器标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSAHandlerIdDirty(){
        if(this.contains(FIELD_PSSYSSAHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口后台处理器标识
     */
    @JsonIgnore
    public void resetPSSysSAHandlerId(){
        this.reset(FIELD_PSSYSSAHANDLERID);
    }

    /**
     * 设置 系统服务接口后台处理器标识
     * <P>
     * 等同 {@link #setPSSysSAHandlerId}
     * @param pSSysSAHandlerId
     */
    @JsonIgnore
    public PSSysSAHandlerDTO pssyssahandlerid(String pSSysSAHandlerId){
        this.setPSSysSAHandlerId(pSSysSAHandlerId);
        return this;
    }

    /**
     * <B>PSSYSSAHANDLERNAME</B>&nbsp;处理器名称，指定服务接口处理对象的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSAHANDLERNAME = "pssyssahandlername";

    /**
     * 设置 处理器名称，详细说明：{@link #FIELD_PSSYSSAHANDLERNAME}
     * 
     * @param pSSysSAHandlerName
     * 
     */
    @JsonProperty(FIELD_PSSYSSAHANDLERNAME)
    public void setPSSysSAHandlerName(String pSSysSAHandlerName){
        this.set(FIELD_PSSYSSAHANDLERNAME, pSSysSAHandlerName);
    }
    
    /**
     * 获取 处理器名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSAHandlerName(){
        Object objValue = this.get(FIELD_PSSYSSAHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理器名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSAHandlerNameDirty(){
        if(this.contains(FIELD_PSSYSSAHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理器名称
     */
    @JsonIgnore
    public void resetPSSysSAHandlerName(){
        this.reset(FIELD_PSSYSSAHANDLERNAME);
    }

    /**
     * 设置 处理器名称，详细说明：{@link #FIELD_PSSYSSAHANDLERNAME}
     * <P>
     * 等同 {@link #setPSSysSAHandlerName}
     * @param pSSysSAHandlerName
     */
    @JsonIgnore
    public PSSysSAHandlerDTO pssyssahandlername(String pSSysSAHandlerName){
        this.setPSSysSAHandlerName(pSSysSAHandlerName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSAHandlerName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSAHandlerName(strName);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO name(String strName){
        this.setPSSysSAHandlerName(strName);
        return this;
    }

    /**
     * <B>SATYPE</B>&nbsp;接口类型，指定服务接口处理对象的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ServiceAPIPredefinedType} 
     */
    public final static String FIELD_SATYPE = "satype";

    /**
     * 设置 接口类型，详细说明：{@link #FIELD_SATYPE}
     * 
     * @param sAType
     * 
     */
    @JsonProperty(FIELD_SATYPE)
    public void setSAType(String sAType){
        this.set(FIELD_SATYPE, sAType);
    }
    
    /**
     * 获取 接口类型  
     * @return
     */
    @JsonIgnore
    public String getSAType(){
        Object objValue = this.get(FIELD_SATYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSATypeDirty(){
        if(this.contains(FIELD_SATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口类型
     */
    @JsonIgnore
    public void resetSAType(){
        this.reset(FIELD_SATYPE);
    }

    /**
     * 设置 接口类型，详细说明：{@link #FIELD_SATYPE}
     * <P>
     * 等同 {@link #setSAType}
     * @param sAType
     */
    @JsonIgnore
    public PSSysSAHandlerDTO satype(String sAType){
        this.setSAType(sAType);
        return this;
    }

     /**
     * 设置 接口类型，详细说明：{@link #FIELD_SATYPE}
     * <P>
     * 等同 {@link #setSAType}
     * @param sAType
     */
    @JsonIgnore
    public PSSysSAHandlerDTO satype(net.ibizsys.model.PSModelEnums.ServiceAPIPredefinedType sAType){
        if(sAType == null){
            this.setSAType(null);
        }
        else{
            this.setSAType(sAType.value);
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
    public PSSysSAHandlerDTO updatedate(Timestamp updateDate){
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
    public PSSysSAHandlerDTO updateman(String updateMan){
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
    public PSSysSAHandlerDTO usercat(String userCat){
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
    public PSSysSAHandlerDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSAHandlerDTO usertag(String userTag){
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
    public PSSysSAHandlerDTO usertag2(String userTag2){
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
    public PSSysSAHandlerDTO usertag3(String userTag3){
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
    public PSSysSAHandlerDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysSAHandlerId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSAHandlerId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSAHandlerId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSAHandlerId(strValue);
    }

    @JsonIgnore
    public PSSysSAHandlerDTO id(String strValue){
        this.setPSSysSAHandlerId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSAHandlerDTO){
            PSSysSAHandlerDTO dto = (PSSysSAHandlerDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
