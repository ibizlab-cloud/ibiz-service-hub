package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBISCHEME</B>智能报表体系 模型传输对象
 * <P>
 * 
 */
public class PSSysBISchemeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBISchemeDTO(){
    }      

    /**
     * <B>AUTHCLIENTID</B>&nbsp;认证客户端标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AUTHCLIENTID = "authclientid";

    /**
     * 设置 认证客户端标识
     * 
     * @param authClientId
     * 
     */
    @JsonProperty(FIELD_AUTHCLIENTID)
    public void setAuthClientId(String authClientId){
        this.set(FIELD_AUTHCLIENTID, authClientId);
    }
    
    /**
     * 获取 认证客户端标识  
     * @return
     */
    @JsonIgnore
    public String getAuthClientId(){
        Object objValue = this.get(FIELD_AUTHCLIENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证客户端标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthClientIdDirty(){
        if(this.contains(FIELD_AUTHCLIENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证客户端标识
     */
    @JsonIgnore
    public void resetAuthClientId(){
        this.reset(FIELD_AUTHCLIENTID);
    }

    /**
     * 设置 认证客户端标识
     * <P>
     * 等同 {@link #setAuthClientId}
     * @param authClientId
     */
    @JsonIgnore
    public PSSysBISchemeDTO authclientid(String authClientId){
        this.setAuthClientId(authClientId);
        return this;
    }

    /**
     * <B>AUTHCLIENTSECRET</B>&nbsp;认证客户端密钥
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_AUTHCLIENTSECRET = "authclientsecret";

    /**
     * 设置 认证客户端密钥
     * 
     * @param authClientSecret
     * 
     */
    @JsonProperty(FIELD_AUTHCLIENTSECRET)
    public void setAuthClientSecret(String authClientSecret){
        this.set(FIELD_AUTHCLIENTSECRET, authClientSecret);
    }
    
    /**
     * 获取 认证客户端密钥  
     * @return
     */
    @JsonIgnore
    public String getAuthClientSecret(){
        Object objValue = this.get(FIELD_AUTHCLIENTSECRET);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证客户端密钥 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthClientSecretDirty(){
        if(this.contains(FIELD_AUTHCLIENTSECRET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证客户端密钥
     */
    @JsonIgnore
    public void resetAuthClientSecret(){
        this.reset(FIELD_AUTHCLIENTSECRET);
    }

    /**
     * 设置 认证客户端密钥
     * <P>
     * 等同 {@link #setAuthClientSecret}
     * @param authClientSecret
     */
    @JsonIgnore
    public PSSysBISchemeDTO authclientsecret(String authClientSecret){
        this.setAuthClientSecret(authClientSecret);
        return this;
    }

    /**
     * <B>AUTHMODE</B>&nbsp;认证模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.APIAuthMode} 
     */
    public final static String FIELD_AUTHMODE = "authmode";

    /**
     * 设置 认证模式
     * 
     * @param authMode
     * 
     */
    @JsonProperty(FIELD_AUTHMODE)
    public void setAuthMode(String authMode){
        this.set(FIELD_AUTHMODE, authMode);
    }
    
    /**
     * 获取 认证模式  
     * @return
     */
    @JsonIgnore
    public String getAuthMode(){
        Object objValue = this.get(FIELD_AUTHMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthModeDirty(){
        if(this.contains(FIELD_AUTHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证模式
     */
    @JsonIgnore
    public void resetAuthMode(){
        this.reset(FIELD_AUTHMODE);
    }

    /**
     * 设置 认证模式
     * <P>
     * 等同 {@link #setAuthMode}
     * @param authMode
     */
    @JsonIgnore
    public PSSysBISchemeDTO authmode(String authMode){
        this.setAuthMode(authMode);
        return this;
    }

     /**
     * 设置 认证模式
     * <P>
     * 等同 {@link #setAuthMode}
     * @param authMode
     */
    @JsonIgnore
    public PSSysBISchemeDTO authmode(net.ibizsys.model.PSModelEnums.APIAuthMode authMode){
        if(authMode == null){
            this.setAuthMode(null);
        }
        else{
            this.setAuthMode(authMode.value);
        }
        return this;
    }

    /**
     * <B>AUTHPARAM</B>&nbsp;认证参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_AUTHPARAM = "authparam";

    /**
     * 设置 认证参数
     * 
     * @param authParam
     * 
     */
    @JsonProperty(FIELD_AUTHPARAM)
    public void setAuthParam(String authParam){
        this.set(FIELD_AUTHPARAM, authParam);
    }
    
    /**
     * 获取 认证参数  
     * @return
     */
    @JsonIgnore
    public String getAuthParam(){
        Object objValue = this.get(FIELD_AUTHPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthParamDirty(){
        if(this.contains(FIELD_AUTHPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证参数
     */
    @JsonIgnore
    public void resetAuthParam(){
        this.reset(FIELD_AUTHPARAM);
    }

    /**
     * 设置 认证参数
     * <P>
     * 等同 {@link #setAuthParam}
     * @param authParam
     */
    @JsonIgnore
    public PSSysBISchemeDTO authparam(String authParam){
        this.setAuthParam(authParam);
        return this;
    }

    /**
     * <B>AUTHPARAM2</B>&nbsp;认证参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_AUTHPARAM2 = "authparam2";

    /**
     * 设置 认证参数2
     * 
     * @param authParam2
     * 
     */
    @JsonProperty(FIELD_AUTHPARAM2)
    public void setAuthParam2(String authParam2){
        this.set(FIELD_AUTHPARAM2, authParam2);
    }
    
    /**
     * 获取 认证参数2  
     * @return
     */
    @JsonIgnore
    public String getAuthParam2(){
        Object objValue = this.get(FIELD_AUTHPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthParam2Dirty(){
        if(this.contains(FIELD_AUTHPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证参数2
     */
    @JsonIgnore
    public void resetAuthParam2(){
        this.reset(FIELD_AUTHPARAM2);
    }

    /**
     * 设置 认证参数2
     * <P>
     * 等同 {@link #setAuthParam2}
     * @param authParam2
     */
    @JsonIgnore
    public PSSysBISchemeDTO authparam2(String authParam2){
        this.setAuthParam2(authParam2);
        return this;
    }

    /**
     * <B>BIENGINETYPE</B>&nbsp;引擎类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BIEngineType} 
     */
    public final static String FIELD_BIENGINETYPE = "bienginetype";

    /**
     * 设置 引擎类型
     * 
     * @param bIEngineType
     * 
     */
    @JsonProperty(FIELD_BIENGINETYPE)
    public void setBIEngineType(String bIEngineType){
        this.set(FIELD_BIENGINETYPE, bIEngineType);
    }
    
    /**
     * 获取 引擎类型  
     * @return
     */
    @JsonIgnore
    public String getBIEngineType(){
        Object objValue = this.get(FIELD_BIENGINETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBIEngineTypeDirty(){
        if(this.contains(FIELD_BIENGINETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引擎类型
     */
    @JsonIgnore
    public void resetBIEngineType(){
        this.reset(FIELD_BIENGINETYPE);
    }

    /**
     * 设置 引擎类型
     * <P>
     * 等同 {@link #setBIEngineType}
     * @param bIEngineType
     */
    @JsonIgnore
    public PSSysBISchemeDTO bienginetype(String bIEngineType){
        this.setBIEngineType(bIEngineType);
        return this;
    }

     /**
     * 设置 引擎类型
     * <P>
     * 等同 {@link #setBIEngineType}
     * @param bIEngineType
     */
    @JsonIgnore
    public PSSysBISchemeDTO bienginetype(net.ibizsys.model.PSModelEnums.BIEngineType bIEngineType){
        if(bIEngineType == null){
            this.setBIEngineType(null);
        }
        else{
            this.setBIEngineType(bIEngineType.value);
        }
        return this;
    }

    /**
     * <B>BISCHEMETAG</B>&nbsp;体系标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_BISCHEMETAG = "bischemetag";

    /**
     * 设置 体系标记
     * 
     * @param bISchemeTag
     * 
     */
    @JsonProperty(FIELD_BISCHEMETAG)
    public void setBISchemeTag(String bISchemeTag){
        this.set(FIELD_BISCHEMETAG, bISchemeTag);
    }
    
    /**
     * 获取 体系标记  
     * @return
     */
    @JsonIgnore
    public String getBISchemeTag(){
        Object objValue = this.get(FIELD_BISCHEMETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 体系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBISchemeTagDirty(){
        if(this.contains(FIELD_BISCHEMETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 体系标记
     */
    @JsonIgnore
    public void resetBISchemeTag(){
        this.reset(FIELD_BISCHEMETAG);
    }

    /**
     * 设置 体系标记
     * <P>
     * 等同 {@link #setBISchemeTag}
     * @param bISchemeTag
     */
    @JsonIgnore
    public PSSysBISchemeDTO bischemetag(String bISchemeTag){
        this.setBISchemeTag(bISchemeTag);
        return this;
    }

    /**
     * <B>BISCHEMETAG2</B>&nbsp;体系标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_BISCHEMETAG2 = "bischemetag2";

    /**
     * 设置 体系标记2
     * 
     * @param bISchemeTag2
     * 
     */
    @JsonProperty(FIELD_BISCHEMETAG2)
    public void setBISchemeTag2(String bISchemeTag2){
        this.set(FIELD_BISCHEMETAG2, bISchemeTag2);
    }
    
    /**
     * 获取 体系标记2  
     * @return
     */
    @JsonIgnore
    public String getBISchemeTag2(){
        Object objValue = this.get(FIELD_BISCHEMETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 体系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBISchemeTag2Dirty(){
        if(this.contains(FIELD_BISCHEMETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 体系标记2
     */
    @JsonIgnore
    public void resetBISchemeTag2(){
        this.reset(FIELD_BISCHEMETAG2);
    }

    /**
     * 设置 体系标记2
     * <P>
     * 等同 {@link #setBISchemeTag2}
     * @param bISchemeTag2
     */
    @JsonIgnore
    public PSSysBISchemeDTO bischemetag2(String bISchemeTag2){
        this.setBISchemeTag2(bISchemeTag2);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysBISchemeDTO codename(String codeName){
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
    public PSSysBISchemeDTO createdate(Timestamp createDate){
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
    public PSSysBISchemeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENABLESERVICEAPI</B>&nbsp;启用服务接口
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESERVICEAPI = "enableserviceapi";

    /**
     * 设置 启用服务接口
     * 
     * @param enableServiceAPI
     * 
     */
    @JsonProperty(FIELD_ENABLESERVICEAPI)
    public void setEnableServiceAPI(Integer enableServiceAPI){
        this.set(FIELD_ENABLESERVICEAPI, enableServiceAPI);
    }
    
    /**
     * 获取 启用服务接口  
     * @return
     */
    @JsonIgnore
    public Integer getEnableServiceAPI(){
        Object objValue = this.get(FIELD_ENABLESERVICEAPI);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableServiceAPIDirty(){
        if(this.contains(FIELD_ENABLESERVICEAPI)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用服务接口
     */
    @JsonIgnore
    public void resetEnableServiceAPI(){
        this.reset(FIELD_ENABLESERVICEAPI);
    }

    /**
     * 设置 启用服务接口
     * <P>
     * 等同 {@link #setEnableServiceAPI}
     * @param enableServiceAPI
     */
    @JsonIgnore
    public PSSysBISchemeDTO enableserviceapi(Integer enableServiceAPI){
        this.setEnableServiceAPI(enableServiceAPI);
        return this;
    }

     /**
     * 设置 启用服务接口
     * <P>
     * 等同 {@link #setEnableServiceAPI}
     * @param enableServiceAPI
     */
    @JsonIgnore
    public PSSysBISchemeDTO enableserviceapi(Boolean enableServiceAPI){
        if(enableServiceAPI == null){
            this.setEnableServiceAPI(null);
        }
        else{
            this.setEnableServiceAPI(enableServiceAPI?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESUBSYSSERVICEAPI</B>&nbsp;启用外部服务接口
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESUBSYSSERVICEAPI = "enablesubsysserviceapi";

    /**
     * 设置 启用外部服务接口
     * 
     * @param enableSubSysServiceAPI
     * 
     */
    @JsonProperty(FIELD_ENABLESUBSYSSERVICEAPI)
    public void setEnableSubSysServiceAPI(Integer enableSubSysServiceAPI){
        this.set(FIELD_ENABLESUBSYSSERVICEAPI, enableSubSysServiceAPI);
    }
    
    /**
     * 获取 启用外部服务接口  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSubSysServiceAPI(){
        Object objValue = this.get(FIELD_ENABLESUBSYSSERVICEAPI);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSubSysServiceAPIDirty(){
        if(this.contains(FIELD_ENABLESUBSYSSERVICEAPI)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用外部服务接口
     */
    @JsonIgnore
    public void resetEnableSubSysServiceAPI(){
        this.reset(FIELD_ENABLESUBSYSSERVICEAPI);
    }

    /**
     * 设置 启用外部服务接口
     * <P>
     * 等同 {@link #setEnableSubSysServiceAPI}
     * @param enableSubSysServiceAPI
     */
    @JsonIgnore
    public PSSysBISchemeDTO enablesubsysserviceapi(Integer enableSubSysServiceAPI){
        this.setEnableSubSysServiceAPI(enableSubSysServiceAPI);
        return this;
    }

     /**
     * 设置 启用外部服务接口
     * <P>
     * 等同 {@link #setEnableSubSysServiceAPI}
     * @param enableSubSysServiceAPI
     */
    @JsonIgnore
    public PSSysBISchemeDTO enablesubsysserviceapi(Boolean enableSubSysServiceAPI){
        if(enableSubSysServiceAPI == null){
            this.setEnableSubSysServiceAPI(null);
        }
        else{
            this.setEnableSubSysServiceAPI(enableSubSysServiceAPI?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysBISchemeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysBISchemeDTO psmoduleid(String pSModuleId){
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
    public PSSysBISchemeDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysBISchemeDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部系统接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSubSysServiceAPIDTO} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部系统接口
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部系统接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部系统接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部系统接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部系统接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部系统接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部系统接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部系统接口
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部系统接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部系统接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部系统接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部系统接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;智能报表体系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 智能报表体系标识
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 智能报表体系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeId(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系标识
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 智能报表体系标识
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMENAME</B>&nbsp;智能报表体系名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBISCHEMENAME = "pssysbischemename";

    /**
     * 设置 智能报表体系名称
     * 
     * @param pSSysBISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMENAME)
    public void setPSSysBISchemeName(String pSSysBISchemeName){
        this.set(FIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }
    
    /**
     * 获取 智能报表体系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeName(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系名称
     */
    @JsonIgnore
    public void resetPSSysBISchemeName(){
        this.reset(FIELD_PSSYSBISCHEMENAME);
    }

    /**
     * 设置 智能报表体系名称
     * <P>
     * 等同 {@link #setPSSysBISchemeName}
     * @param pSSysBISchemeName
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBISchemeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBISchemeName(strName);
    }

    @JsonIgnore
    public PSSysBISchemeDTO name(String strName){
        this.setPSSysBISchemeName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * 设置 系统服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI){
        if(pSSysServiceAPI == null){
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        }
        else{
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPINAME)
    public void setPSSysServiceAPIName(String pSSysServiceAPIName){
        this.set(FIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIName(){
        this.reset(FIELD_PSSYSSERVICEAPINAME);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSSysBISchemeDTO pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
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
    public PSSysBISchemeDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysBISchemeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
    public PSSysBISchemeDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SCHEMEPARAMS</B>&nbsp;体系参数
     */
    public final static String FIELD_SCHEMEPARAMS = "schemeparams";

    /**
     * 设置 体系参数
     * 
     * @param schemeParams
     * 
     */
    @JsonProperty(FIELD_SCHEMEPARAMS)
    public void setSchemeParams(String schemeParams){
        this.set(FIELD_SCHEMEPARAMS, schemeParams);
    }
    
    /**
     * 获取 体系参数  
     * @return
     */
    @JsonIgnore
    public String getSchemeParams(){
        Object objValue = this.get(FIELD_SCHEMEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 体系参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSchemeParamsDirty(){
        if(this.contains(FIELD_SCHEMEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 体系参数
     */
    @JsonIgnore
    public void resetSchemeParams(){
        this.reset(FIELD_SCHEMEPARAMS);
    }

    /**
     * 设置 体系参数
     * <P>
     * 等同 {@link #setSchemeParams}
     * @param schemeParams
     */
    @JsonIgnore
    public PSSysBISchemeDTO schemeparams(String schemeParams){
        this.setSchemeParams(schemeParams);
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码标识
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 服务代码标识  
     * @return
     */
    @JsonIgnore
    public String getServiceCodeName(){
        Object objValue = this.get(FIELD_SERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceCodeNameDirty(){
        if(this.contains(FIELD_SERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务代码标识
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 服务代码标识
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSSysBISchemeDTO servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>SERVICEPARAM</B>&nbsp;服务参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPARAM = "serviceparam";

    /**
     * 设置 服务参数
     * 
     * @param serviceParam
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAM)
    public void setServiceParam(String serviceParam){
        this.set(FIELD_SERVICEPARAM, serviceParam);
    }
    
    /**
     * 获取 服务参数  
     * @return
     */
    @JsonIgnore
    public String getServiceParam(){
        Object objValue = this.get(FIELD_SERVICEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParamDirty(){
        if(this.contains(FIELD_SERVICEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务参数
     */
    @JsonIgnore
    public void resetServiceParam(){
        this.reset(FIELD_SERVICEPARAM);
    }

    /**
     * 设置 服务参数
     * <P>
     * 等同 {@link #setServiceParam}
     * @param serviceParam
     */
    @JsonIgnore
    public PSSysBISchemeDTO serviceparam(String serviceParam){
        this.setServiceParam(serviceParam);
        return this;
    }

    /**
     * <B>SERVICEPARAM2</B>&nbsp;服务参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPARAM2 = "serviceparam2";

    /**
     * 设置 服务参数2
     * 
     * @param serviceParam2
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAM2)
    public void setServiceParam2(String serviceParam2){
        this.set(FIELD_SERVICEPARAM2, serviceParam2);
    }
    
    /**
     * 获取 服务参数2  
     * @return
     */
    @JsonIgnore
    public String getServiceParam2(){
        Object objValue = this.get(FIELD_SERVICEPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParam2Dirty(){
        if(this.contains(FIELD_SERVICEPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务参数2
     */
    @JsonIgnore
    public void resetServiceParam2(){
        this.reset(FIELD_SERVICEPARAM2);
    }

    /**
     * 设置 服务参数2
     * <P>
     * 等同 {@link #setServiceParam2}
     * @param serviceParam2
     */
    @JsonIgnore
    public PSSysBISchemeDTO serviceparam2(String serviceParam2){
        this.setServiceParam2(serviceParam2);
        return this;
    }

    /**
     * <B>SERVICEPATH</B>&nbsp;默认服务路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SERVICEPATH = "servicepath";

    /**
     * 设置 默认服务路径
     * 
     * @param servicePath
     * 
     */
    @JsonProperty(FIELD_SERVICEPATH)
    public void setServicePath(String servicePath){
        this.set(FIELD_SERVICEPATH, servicePath);
    }
    
    /**
     * 获取 默认服务路径  
     * @return
     */
    @JsonIgnore
    public String getServicePath(){
        Object objValue = this.get(FIELD_SERVICEPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServicePathDirty(){
        if(this.contains(FIELD_SERVICEPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认服务路径
     */
    @JsonIgnore
    public void resetServicePath(){
        this.reset(FIELD_SERVICEPATH);
    }

    /**
     * 设置 默认服务路径
     * <P>
     * 等同 {@link #setServicePath}
     * @param servicePath
     */
    @JsonIgnore
    public PSSysBISchemeDTO servicepath(String servicePath){
        this.setServicePath(servicePath);
        return this;
    }

    /**
     * <B>SUBSYSSERVICECODENAME</B>&nbsp;外部服务代码标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SUBSYSSERVICECODENAME = "subsysservicecodename";

    /**
     * 设置 外部服务代码标识
     * 
     * @param subSysServiceCodeName
     * 
     */
    @JsonProperty(FIELD_SUBSYSSERVICECODENAME)
    public void setSubSysServiceCodeName(String subSysServiceCodeName){
        this.set(FIELD_SUBSYSSERVICECODENAME, subSysServiceCodeName);
    }
    
    /**
     * 获取 外部服务代码标识  
     * @return
     */
    @JsonIgnore
    public String getSubSysServiceCodeName(){
        Object objValue = this.get(FIELD_SUBSYSSERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubSysServiceCodeNameDirty(){
        if(this.contains(FIELD_SUBSYSSERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务代码标识
     */
    @JsonIgnore
    public void resetSubSysServiceCodeName(){
        this.reset(FIELD_SUBSYSSERVICECODENAME);
    }

    /**
     * 设置 外部服务代码标识
     * <P>
     * 等同 {@link #setSubSysServiceCodeName}
     * @param subSysServiceCodeName
     */
    @JsonIgnore
    public PSSysBISchemeDTO subsysservicecodename(String subSysServiceCodeName){
        this.setSubSysServiceCodeName(subSysServiceCodeName);
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
    public PSSysBISchemeDTO updatedate(Timestamp updateDate){
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
    public PSSysBISchemeDTO updateman(String updateMan){
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
    public PSSysBISchemeDTO usercat(String userCat){
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
    public PSSysBISchemeDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBISchemeDTO usertag(String userTag){
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
    public PSSysBISchemeDTO usertag2(String userTag2){
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
    public PSSysBISchemeDTO usertag3(String userTag3){
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
    public PSSysBISchemeDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysBISchemeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBISchemeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBISchemeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBISchemeId(strValue);
    }

    @JsonIgnore
    public PSSysBISchemeDTO id(String strValue){
        this.setPSSysBISchemeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBISchemeDTO){
            PSSysBISchemeDTO dto = (PSSysBISchemeDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
