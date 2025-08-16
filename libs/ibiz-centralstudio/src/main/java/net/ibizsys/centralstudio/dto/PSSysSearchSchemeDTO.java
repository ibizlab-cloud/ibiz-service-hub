package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHSCHEME</B>系统全文检索体系 模型传输对象
 * <P>
 * 系统全文检索体系模型，定义检索体系的引擎类型等参数，全文检索体系包含检索文档集合
 */
public class PSSysSearchSchemeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSearchSchemeDTO(){
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
    public PSSysSearchSchemeDTO authclientid(String authClientId){
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
    public PSSysSearchSchemeDTO authclientsecret(String authClientSecret){
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
    public PSSysSearchSchemeDTO authmode(String authMode){
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
    public PSSysSearchSchemeDTO authmode(net.ibizsys.model.PSModelEnums.APIAuthMode authMode){
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
    public PSSysSearchSchemeDTO authparam(String authParam){
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
    public PSSysSearchSchemeDTO authparam2(String authParam2){
        this.setAuthParam2(authParam2);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定全文搜索体系的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysSearchSchemeDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO codename2(String codeName2){
        this.setCodeName2(codeName2);
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
    public PSSysSearchSchemeDTO createdate(Timestamp createDate){
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
    public PSSysSearchSchemeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DOCREPLICAS</B>&nbsp;默认文档副本数，指定全文检索体系的默认文档副本数量，未定义时为【1】
     */
    public final static String FIELD_DOCREPLICAS = "docreplicas";

    /**
     * 设置 默认文档副本数，详细说明：{@link #FIELD_DOCREPLICAS}
     * 
     * @param docReplicas
     * 
     */
    @JsonProperty(FIELD_DOCREPLICAS)
    public void setDocReplicas(Integer docReplicas){
        this.set(FIELD_DOCREPLICAS, docReplicas);
    }
    
    /**
     * 获取 默认文档副本数  
     * @return
     */
    @JsonIgnore
    public Integer getDocReplicas(){
        Object objValue = this.get(FIELD_DOCREPLICAS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认文档副本数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDocReplicasDirty(){
        if(this.contains(FIELD_DOCREPLICAS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认文档副本数
     */
    @JsonIgnore
    public void resetDocReplicas(){
        this.reset(FIELD_DOCREPLICAS);
    }

    /**
     * 设置 默认文档副本数，详细说明：{@link #FIELD_DOCREPLICAS}
     * <P>
     * 等同 {@link #setDocReplicas}
     * @param docReplicas
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO docreplicas(Integer docReplicas){
        this.setDocReplicas(docReplicas);
        return this;
    }

    /**
     * <B>DOCSHARDS</B>&nbsp;默认文档分片，指定全文检索体系的默认文档分片数量，未定义时为【5】
     */
    public final static String FIELD_DOCSHARDS = "docshards";

    /**
     * 设置 默认文档分片，详细说明：{@link #FIELD_DOCSHARDS}
     * 
     * @param docShards
     * 
     */
    @JsonProperty(FIELD_DOCSHARDS)
    public void setDocShards(Integer docShards){
        this.set(FIELD_DOCSHARDS, docShards);
    }
    
    /**
     * 获取 默认文档分片  
     * @return
     */
    @JsonIgnore
    public Integer getDocShards(){
        Object objValue = this.get(FIELD_DOCSHARDS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认文档分片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDocShardsDirty(){
        if(this.contains(FIELD_DOCSHARDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认文档分片
     */
    @JsonIgnore
    public void resetDocShards(){
        this.reset(FIELD_DOCSHARDS);
    }

    /**
     * 设置 默认文档分片，详细说明：{@link #FIELD_DOCSHARDS}
     * <P>
     * 等同 {@link #setDocShards}
     * @param docShards
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO docshards(Integer docShards){
        this.setDocShards(docShards);
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
    public PSSysSearchSchemeDTO enableserviceapi(Integer enableServiceAPI){
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
    public PSSysSearchSchemeDTO enableserviceapi(Boolean enableServiceAPI){
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
    public PSSysSearchSchemeDTO enablesubsysserviceapi(Integer enableSubSysServiceAPI){
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
    public PSSysSearchSchemeDTO enablesubsysserviceapi(Boolean enableSubSysServiceAPI){
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
    public PSSysSearchSchemeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统全文检索体系所在的系统模块
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
    public PSSysSearchSchemeDTO psmoduleid(String pSModuleId){
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
    public PSSysSearchSchemeDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统全文检索体系所在的系统模块
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
    public PSSysSearchSchemeDTO psmodulename(String pSModuleName){
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
    public PSSysSearchSchemeDTO pssubsysserviceapiid(String pSSubSysServiceAPIId){
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
    public PSSysSearchSchemeDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI){
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
    public PSSysSearchSchemeDTO pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
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
    public PSSysSearchSchemeDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysSearchSchemeDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSSysSearchSchemeDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPID</B>&nbsp;系统模型组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysModelGroupDTO} 
     */
    public final static String FIELD_PSSYSMODELGROUPID = "pssysmodelgroupid";

    /**
     * 设置 系统模型组
     * 
     * @param pSSysModelGroupId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELGROUPID)
    public void setPSSysModelGroupId(String pSSysModelGroupId){
        this.set(FIELD_PSSYSMODELGROUPID, pSSysModelGroupId);
    }
    
    /**
     * 获取 系统模型组  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelGroupId(){
        Object objValue = this.get(FIELD_PSSYSMODELGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelGroupIdDirty(){
        if(this.contains(FIELD_PSSYSMODELGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型组
     */
    @JsonIgnore
    public void resetPSSysModelGroupId(){
        this.reset(FIELD_PSSYSMODELGROUPID);
    }

    /**
     * 设置 系统模型组
     * <P>
     * 等同 {@link #setPSSysModelGroupId}
     * @param pSSysModelGroupId
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO pssysmodelgroupid(String pSSysModelGroupId){
        this.setPSSysModelGroupId(pSSysModelGroupId);
        return this;
    }

    /**
     * 设置 系统模型组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysModelGroupId}
     * @param pSSysModelGroup 引用对象
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO pssysmodelgroupid(PSSysModelGroupDTO pSSysModelGroup){
        if(pSSysModelGroup == null){
            this.setPSSysModelGroupId(null);
            this.setPSSysModelGroupName(null);
        }
        else{
            this.setPSSysModelGroupId(pSSysModelGroup.getPSSysModelGroupId());
            this.setPSSysModelGroupName(pSSysModelGroup.getPSSysModelGroupName());
        }
        return this;
    }

    /**
     * <B>PSSYSMODELGROUPNAME</B>&nbsp;系统模型组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMODELGROUPID}
     */
    public final static String FIELD_PSSYSMODELGROUPNAME = "pssysmodelgroupname";

    /**
     * 设置 系统模型组
     * 
     * @param pSSysModelGroupName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELGROUPNAME)
    public void setPSSysModelGroupName(String pSSysModelGroupName){
        this.set(FIELD_PSSYSMODELGROUPNAME, pSSysModelGroupName);
    }
    
    /**
     * 获取 系统模型组  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelGroupName(){
        Object objValue = this.get(FIELD_PSSYSMODELGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelGroupNameDirty(){
        if(this.contains(FIELD_PSSYSMODELGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型组
     */
    @JsonIgnore
    public void resetPSSysModelGroupName(){
        this.reset(FIELD_PSSYSMODELGROUPNAME);
    }

    /**
     * 设置 系统模型组
     * <P>
     * 等同 {@link #setPSSysModelGroupName}
     * @param pSSysModelGroupName
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO pssysmodelgroupname(String pSSysModelGroupName){
        this.setPSSysModelGroupName(pSSysModelGroupName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMEID</B>&nbsp;搜索体系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";

    /**
     * 设置 搜索体系标识
     * 
     * @param pSSysSearchSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMEID)
    public void setPSSysSearchSchemeId(String pSSysSearchSchemeId){
        this.set(FIELD_PSSYSSEARCHSCHEMEID, pSSysSearchSchemeId);
    }
    
    /**
     * 获取 搜索体系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索体系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索体系标识
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeId(){
        this.reset(FIELD_PSSYSSEARCHSCHEMEID);
    }

    /**
     * 设置 搜索体系标识
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchSchemeId
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO pssyssearchschemeid(String pSSysSearchSchemeId){
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMENAME</B>&nbsp;检索体系名称，指定全文检索体系的名称，需在所在模型域（系统模块或系统）具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";

    /**
     * 设置 检索体系名称，详细说明：{@link #FIELD_PSSYSSEARCHSCHEMENAME}
     * 
     * @param pSSysSearchSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMENAME)
    public void setPSSysSearchSchemeName(String pSSysSearchSchemeName){
        this.set(FIELD_PSSYSSEARCHSCHEMENAME, pSSysSearchSchemeName);
    }
    
    /**
     * 获取 检索体系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索体系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索体系名称
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeName(){
        this.reset(FIELD_PSSYSSEARCHSCHEMENAME);
    }

    /**
     * 设置 检索体系名称，详细说明：{@link #FIELD_PSSYSSEARCHSCHEMENAME}
     * <P>
     * 等同 {@link #setPSSysSearchSchemeName}
     * @param pSSysSearchSchemeName
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO pssyssearchschemename(String pSSysSearchSchemeName){
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchSchemeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchSchemeName(strName);
    }

    @JsonIgnore
    public PSSysSearchSchemeDTO name(String strName){
        this.setPSSysSearchSchemeName(strName);
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
    public PSSysSearchSchemeDTO pssysserviceapiid(String pSSysServiceAPIId){
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
    public PSSysSearchSchemeDTO pssysserviceapiid(PSSysServiceAPIDTO pSSysServiceAPI){
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
    public PSSysSearchSchemeDTO pssysserviceapiname(String pSSysServiceAPIName){
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
    public PSSysSearchSchemeDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysSearchSchemeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
    public PSSysSearchSchemeDTO pssyssfpluginname(String pSSysSFPluginName){
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
    public PSSysSearchSchemeDTO schemeparams(String schemeParams){
        this.setSchemeParams(schemeParams);
        return this;
    }

    /**
     * <B>SCHEMETAG</B>&nbsp;体系标记，指定全文检索体系的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SCHEMETAG = "schemetag";

    /**
     * 设置 体系标记，详细说明：{@link #FIELD_SCHEMETAG}
     * 
     * @param schemeTag
     * 
     */
    @JsonProperty(FIELD_SCHEMETAG)
    public void setSchemeTag(String schemeTag){
        this.set(FIELD_SCHEMETAG, schemeTag);
    }
    
    /**
     * 获取 体系标记  
     * @return
     */
    @JsonIgnore
    public String getSchemeTag(){
        Object objValue = this.get(FIELD_SCHEMETAG);
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
    public boolean isSchemeTagDirty(){
        if(this.contains(FIELD_SCHEMETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 体系标记
     */
    @JsonIgnore
    public void resetSchemeTag(){
        this.reset(FIELD_SCHEMETAG);
    }

    /**
     * 设置 体系标记，详细说明：{@link #FIELD_SCHEMETAG}
     * <P>
     * 等同 {@link #setSchemeTag}
     * @param schemeTag
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO schemetag(String schemeTag){
        this.setSchemeTag(schemeTag);
        return this;
    }

    /**
     * <B>SCHEMETAG2</B>&nbsp;体系标记2，指定全文检索体系的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SCHEMETAG2 = "schemetag2";

    /**
     * 设置 体系标记2，详细说明：{@link #FIELD_SCHEMETAG2}
     * 
     * @param schemeTag2
     * 
     */
    @JsonProperty(FIELD_SCHEMETAG2)
    public void setSchemeTag2(String schemeTag2){
        this.set(FIELD_SCHEMETAG2, schemeTag2);
    }
    
    /**
     * 获取 体系标记2  
     * @return
     */
    @JsonIgnore
    public String getSchemeTag2(){
        Object objValue = this.get(FIELD_SCHEMETAG2);
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
    public boolean isSchemeTag2Dirty(){
        if(this.contains(FIELD_SCHEMETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 体系标记2
     */
    @JsonIgnore
    public void resetSchemeTag2(){
        this.reset(FIELD_SCHEMETAG2);
    }

    /**
     * 设置 体系标记2，详细说明：{@link #FIELD_SCHEMETAG2}
     * <P>
     * 等同 {@link #setSchemeTag2}
     * @param schemeTag2
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO schemetag2(String schemeTag2){
        this.setSchemeTag2(schemeTag2);
        return this;
    }

    /**
     * <B>SEARCHENGINETYPE</B>&nbsp;搜索引擎类型，指定全文检索体系的引擎类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SearchEngineType} 
     */
    public final static String FIELD_SEARCHENGINETYPE = "searchenginetype";

    /**
     * 设置 搜索引擎类型，详细说明：{@link #FIELD_SEARCHENGINETYPE}
     * 
     * @param searchEngineType
     * 
     */
    @JsonProperty(FIELD_SEARCHENGINETYPE)
    public void setSearchEngineType(String searchEngineType){
        this.set(FIELD_SEARCHENGINETYPE, searchEngineType);
    }
    
    /**
     * 获取 搜索引擎类型  
     * @return
     */
    @JsonIgnore
    public String getSearchEngineType(){
        Object objValue = this.get(FIELD_SEARCHENGINETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索引擎类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchEngineTypeDirty(){
        if(this.contains(FIELD_SEARCHENGINETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索引擎类型
     */
    @JsonIgnore
    public void resetSearchEngineType(){
        this.reset(FIELD_SEARCHENGINETYPE);
    }

    /**
     * 设置 搜索引擎类型，详细说明：{@link #FIELD_SEARCHENGINETYPE}
     * <P>
     * 等同 {@link #setSearchEngineType}
     * @param searchEngineType
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO searchenginetype(String searchEngineType){
        this.setSearchEngineType(searchEngineType);
        return this;
    }

     /**
     * 设置 搜索引擎类型，详细说明：{@link #FIELD_SEARCHENGINETYPE}
     * <P>
     * 等同 {@link #setSearchEngineType}
     * @param searchEngineType
     */
    @JsonIgnore
    public PSSysSearchSchemeDTO searchenginetype(net.ibizsys.model.PSModelEnums.SearchEngineType searchEngineType){
        if(searchEngineType == null){
            this.setSearchEngineType(null);
        }
        else{
            this.setSearchEngineType(searchEngineType.value);
        }
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
    public PSSysSearchSchemeDTO servicecodename(String serviceCodeName){
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
    public PSSysSearchSchemeDTO serviceparam(String serviceParam){
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
    public PSSysSearchSchemeDTO serviceparam2(String serviceParam2){
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
    public PSSysSearchSchemeDTO servicepath(String servicePath){
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
    public PSSysSearchSchemeDTO subsysservicecodename(String subSysServiceCodeName){
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
    public PSSysSearchSchemeDTO updatedate(Timestamp updateDate){
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
    public PSSysSearchSchemeDTO updateman(String updateMan){
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
    public PSSysSearchSchemeDTO usercat(String userCat){
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
    public PSSysSearchSchemeDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSearchSchemeDTO usertag(String userTag){
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
    public PSSysSearchSchemeDTO usertag2(String userTag2){
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
    public PSSysSearchSchemeDTO usertag3(String userTag3){
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
    public PSSysSearchSchemeDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysSearchSchemeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSearchSchemeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchSchemeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchSchemeId(strValue);
    }

    @JsonIgnore
    public PSSysSearchSchemeDTO id(String strValue){
        this.setPSSysSearchSchemeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSearchSchemeDTO){
            PSSysSearchSchemeDTO dto = (PSSysSearchSchemeDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
