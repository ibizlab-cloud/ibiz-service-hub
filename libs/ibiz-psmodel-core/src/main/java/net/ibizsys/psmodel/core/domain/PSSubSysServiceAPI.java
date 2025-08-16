package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSUBSYSSERVICEAPI</B>外部服务接口 模型传输对象
 * <P>
 * 外部服务接口模型，定义系统使用的外部服务接口，包括接口类型、认证模式等信息，外部服务接口包含外部接口实体、外部接口实体关系等模型
 */
public class PSSubSysServiceAPI extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSubSysServiceAPI(){
        this.setValidFlag(1);
    }      

    /**
     * <B>APISOURCE</B>&nbsp;接口来源，指定外部服务接口的来源，未定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SubSysAPISource} 
     */
    public final static String FIELD_APISOURCE = "apisource";

    /**
     * 设置 接口来源，详细说明：{@link #FIELD_APISOURCE}
     * 
     * @param aPISource
     * 
     */
    @JsonProperty(FIELD_APISOURCE)
    public void setAPISource(String aPISource){
        this.set(FIELD_APISOURCE, aPISource);
    }
    
    /**
     * 获取 接口来源  
     * @return
     */
    @JsonIgnore
    public String getAPISource(){
        Object objValue = this.get(FIELD_APISOURCE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口来源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPISourceDirty(){
        if(this.contains(FIELD_APISOURCE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口来源
     */
    @JsonIgnore
    public void resetAPISource(){
        this.reset(FIELD_APISOURCE);
    }

    /**
     * 设置 接口来源，详细说明：{@link #FIELD_APISOURCE}
     * <P>
     * 等同 {@link #setAPISource}
     * @param aPISource
     */
    @JsonIgnore
    public PSSubSysServiceAPI apisource(String aPISource){
        this.setAPISource(aPISource);
        return this;
    }

     /**
     * 设置 接口来源，详细说明：{@link #FIELD_APISOURCE}
     * <P>
     * 等同 {@link #setAPISource}
     * @param aPISource
     */
    @JsonIgnore
    public PSSubSysServiceAPI apisource(net.ibizsys.psmodel.core.util.PSModelEnums.SubSysAPISource aPISource){
        if(aPISource == null){
            this.setAPISource(null);
        }
        else{
            this.setAPISource(aPISource.value);
        }
        return this;
    }

    /**
     * <B>APITAG</B>&nbsp;接口标记，指定外部服务接口的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_APITAG = "apitag";

    /**
     * 设置 接口标记，详细说明：{@link #FIELD_APITAG}
     * 
     * @param aPITag
     * 
     */
    @JsonProperty(FIELD_APITAG)
    public void setAPITag(String aPITag){
        this.set(FIELD_APITAG, aPITag);
    }
    
    /**
     * 获取 接口标记  
     * @return
     */
    @JsonIgnore
    public String getAPITag(){
        Object objValue = this.get(FIELD_APITAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPITagDirty(){
        if(this.contains(FIELD_APITAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口标记
     */
    @JsonIgnore
    public void resetAPITag(){
        this.reset(FIELD_APITAG);
    }

    /**
     * 设置 接口标记，详细说明：{@link #FIELD_APITAG}
     * <P>
     * 等同 {@link #setAPITag}
     * @param aPITag
     */
    @JsonIgnore
    public PSSubSysServiceAPI apitag(String aPITag){
        this.setAPITag(aPITag);
        return this;
    }

    /**
     * <B>APITAG2</B>&nbsp;接口标记2，指定外部服务接口的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_APITAG2 = "apitag2";

    /**
     * 设置 接口标记2，详细说明：{@link #FIELD_APITAG2}
     * 
     * @param aPITag2
     * 
     */
    @JsonProperty(FIELD_APITAG2)
    public void setAPITag2(String aPITag2){
        this.set(FIELD_APITAG2, aPITag2);
    }
    
    /**
     * 获取 接口标记2  
     * @return
     */
    @JsonIgnore
    public String getAPITag2(){
        Object objValue = this.get(FIELD_APITAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPITag2Dirty(){
        if(this.contains(FIELD_APITAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口标记2
     */
    @JsonIgnore
    public void resetAPITag2(){
        this.reset(FIELD_APITAG2);
    }

    /**
     * 设置 接口标记2，详细说明：{@link #FIELD_APITAG2}
     * <P>
     * 等同 {@link #setAPITag2}
     * @param aPITag2
     */
    @JsonIgnore
    public PSSubSysServiceAPI apitag2(String aPITag2){
        this.setAPITag2(aPITag2);
        return this;
    }

    /**
     * <B>APITYPE</B>&nbsp;接口类型，指定外部服务接口的类型，未定义时为【RESTful API】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SubSysAPIType} 
     */
    public final static String FIELD_APITYPE = "apitype";

    /**
     * 设置 接口类型，详细说明：{@link #FIELD_APITYPE}
     * 
     * @param aPIType
     * 
     */
    @JsonProperty(FIELD_APITYPE)
    public void setAPIType(String aPIType){
        this.set(FIELD_APITYPE, aPIType);
    }
    
    /**
     * 获取 接口类型  
     * @return
     */
    @JsonIgnore
    public String getAPIType(){
        Object objValue = this.get(FIELD_APITYPE);
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
    public boolean isAPITypeDirty(){
        if(this.contains(FIELD_APITYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口类型
     */
    @JsonIgnore
    public void resetAPIType(){
        this.reset(FIELD_APITYPE);
    }

    /**
     * 设置 接口类型，详细说明：{@link #FIELD_APITYPE}
     * <P>
     * 等同 {@link #setAPIType}
     * @param aPIType
     */
    @JsonIgnore
    public PSSubSysServiceAPI apitype(String aPIType){
        this.setAPIType(aPIType);
        return this;
    }

     /**
     * 设置 接口类型，详细说明：{@link #FIELD_APITYPE}
     * <P>
     * 等同 {@link #setAPIType}
     * @param aPIType
     */
    @JsonIgnore
    public PSSubSysServiceAPI apitype(net.ibizsys.psmodel.core.util.PSModelEnums.SubSysAPIType aPIType){
        if(aPIType == null){
            this.setAPIType(null);
        }
        else{
            this.setAPIType(aPIType.value);
        }
        return this;
    }

    /**
     * <B>AUTHACCESSTOKENURI</B>&nbsp;获取token路径，指定外部服务接口的默认获取token路径，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_AUTHACCESSTOKENURI = "authaccesstokenuri";

    /**
     * 设置 获取token路径，详细说明：{@link #FIELD_AUTHACCESSTOKENURI}
     * 
     * @param authAccessTokenUri
     * 
     */
    @JsonProperty(FIELD_AUTHACCESSTOKENURI)
    public void setAuthAccessTokenUri(String authAccessTokenUri){
        this.set(FIELD_AUTHACCESSTOKENURI, authAccessTokenUri);
    }
    
    /**
     * 获取 获取token路径  
     * @return
     */
    @JsonIgnore
    public String getAuthAccessTokenUri(){
        Object objValue = this.get(FIELD_AUTHACCESSTOKENURI);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取token路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthAccessTokenUriDirty(){
        if(this.contains(FIELD_AUTHACCESSTOKENURI)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取token路径
     */
    @JsonIgnore
    public void resetAuthAccessTokenUri(){
        this.reset(FIELD_AUTHACCESSTOKENURI);
    }

    /**
     * 设置 获取token路径，详细说明：{@link #FIELD_AUTHACCESSTOKENURI}
     * <P>
     * 等同 {@link #setAuthAccessTokenUri}
     * @param authAccessTokenUri
     */
    @JsonIgnore
    public PSSubSysServiceAPI authaccesstokenuri(String authAccessTokenUri){
        this.setAuthAccessTokenUri(authAccessTokenUri);
        return this;
    }

    /**
     * <B>AUTHCLIENTID</B>&nbsp;认证客户端标识，指定外部服务接口的默认客户端标识，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AUTHCLIENTID = "authclientid";

    /**
     * 设置 认证客户端标识，详细说明：{@link #FIELD_AUTHCLIENTID}
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
     * 设置 认证客户端标识，详细说明：{@link #FIELD_AUTHCLIENTID}
     * <P>
     * 等同 {@link #setAuthClientId}
     * @param authClientId
     */
    @JsonIgnore
    public PSSubSysServiceAPI authclientid(String authClientId){
        this.setAuthClientId(authClientId);
        return this;
    }

    /**
     * <B>AUTHCLIENTSECRET</B>&nbsp;认证客户端密钥，指定外部服务接口的默认客户端密钥标识，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_AUTHCLIENTSECRET = "authclientsecret";

    /**
     * 设置 认证客户端密钥，详细说明：{@link #FIELD_AUTHCLIENTSECRET}
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
     * 设置 认证客户端密钥，详细说明：{@link #FIELD_AUTHCLIENTSECRET}
     * <P>
     * 等同 {@link #setAuthClientSecret}
     * @param authClientSecret
     */
    @JsonIgnore
    public PSSubSysServiceAPI authclientsecret(String authClientSecret){
        this.setAuthClientSecret(authClientSecret);
        return this;
    }

    /**
     * <B>AUTHCODE</B>&nbsp;认证代码
     */
    public final static String FIELD_AUTHCODE = "authcode";

    /**
     * 设置 认证代码
     * 
     * @param authCode
     * 
     */
    @JsonProperty(FIELD_AUTHCODE)
    public void setAuthCode(String authCode){
        this.set(FIELD_AUTHCODE, authCode);
    }
    
    /**
     * 获取 认证代码  
     * @return
     */
    @JsonIgnore
    public String getAuthCode(){
        Object objValue = this.get(FIELD_AUTHCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthCodeDirty(){
        if(this.contains(FIELD_AUTHCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证代码
     */
    @JsonIgnore
    public void resetAuthCode(){
        this.reset(FIELD_AUTHCODE);
    }

    /**
     * 设置 认证代码
     * <P>
     * 等同 {@link #setAuthCode}
     * @param authCode
     */
    @JsonIgnore
    public PSSubSysServiceAPI authcode(String authCode){
        this.setAuthCode(authCode);
        return this;
    }

    /**
     * <B>AUTHMODE</B>&nbsp;认证模式，指定外部服务接口的默认认证模式，支持在运行时配置调整，未定义时为【无认证】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.APIAuthMode} 
     */
    public final static String FIELD_AUTHMODE = "authmode";

    /**
     * 设置 认证模式，详细说明：{@link #FIELD_AUTHMODE}
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
     * 设置 认证模式，详细说明：{@link #FIELD_AUTHMODE}
     * <P>
     * 等同 {@link #setAuthMode}
     * @param authMode
     */
    @JsonIgnore
    public PSSubSysServiceAPI authmode(String authMode){
        this.setAuthMode(authMode);
        return this;
    }

     /**
     * 设置 认证模式，详细说明：{@link #FIELD_AUTHMODE}
     * <P>
     * 等同 {@link #setAuthMode}
     * @param authMode
     */
    @JsonIgnore
    public PSSubSysServiceAPI authmode(net.ibizsys.psmodel.core.util.PSModelEnums.APIAuthMode authMode){
        if(authMode == null){
            this.setAuthMode(null);
        }
        else{
            this.setAuthMode(authMode.value);
        }
        return this;
    }

    /**
     * <B>AUTHPARAM</B>&nbsp;认证参数，指定外部服务接口的默认认证参数，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_AUTHPARAM = "authparam";

    /**
     * 设置 认证参数，详细说明：{@link #FIELD_AUTHPARAM}
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
     * 设置 认证参数，详细说明：{@link #FIELD_AUTHPARAM}
     * <P>
     * 等同 {@link #setAuthParam}
     * @param authParam
     */
    @JsonIgnore
    public PSSubSysServiceAPI authparam(String authParam){
        this.setAuthParam(authParam);
        return this;
    }

    /**
     * <B>AUTHPARAM2</B>&nbsp;认证参数2，指定外部服务接口的默认认证参数2，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_AUTHPARAM2 = "authparam2";

    /**
     * 设置 认证参数2，详细说明：{@link #FIELD_AUTHPARAM2}
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
     * 设置 认证参数2，详细说明：{@link #FIELD_AUTHPARAM2}
     * <P>
     * 等同 {@link #setAuthParam2}
     * @param authParam2
     */
    @JsonIgnore
    public PSSubSysServiceAPI authparam2(String authParam2){
        this.setAuthParam2(authParam2);
        return this;
    }

    /**
     * <B>AUTHPARAM3</B>&nbsp;认证参数3，指定外部服务接口的默认认证参数3，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AUTHPARAM3 = "authparam3";

    /**
     * 设置 认证参数3，详细说明：{@link #FIELD_AUTHPARAM3}
     * 
     * @param authParam3
     * 
     */
    @JsonProperty(FIELD_AUTHPARAM3)
    public void setAuthParam3(String authParam3){
        this.set(FIELD_AUTHPARAM3, authParam3);
    }
    
    /**
     * 获取 认证参数3  
     * @return
     */
    @JsonIgnore
    public String getAuthParam3(){
        Object objValue = this.get(FIELD_AUTHPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthParam3Dirty(){
        if(this.contains(FIELD_AUTHPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证参数3
     */
    @JsonIgnore
    public void resetAuthParam3(){
        this.reset(FIELD_AUTHPARAM3);
    }

    /**
     * 设置 认证参数3，详细说明：{@link #FIELD_AUTHPARAM3}
     * <P>
     * 等同 {@link #setAuthParam3}
     * @param authParam3
     */
    @JsonIgnore
    public PSSubSysServiceAPI authparam3(String authParam3){
        this.setAuthParam3(authParam3);
        return this;
    }

    /**
     * <B>AUTHPARAM4</B>&nbsp;认证参数4，指定外部服务接口的默认认证参数4，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_AUTHPARAM4 = "authparam4";

    /**
     * 设置 认证参数4，详细说明：{@link #FIELD_AUTHPARAM4}
     * 
     * @param authParam4
     * 
     */
    @JsonProperty(FIELD_AUTHPARAM4)
    public void setAuthParam4(String authParam4){
        this.set(FIELD_AUTHPARAM4, authParam4);
    }
    
    /**
     * 获取 认证参数4  
     * @return
     */
    @JsonIgnore
    public String getAuthParam4(){
        Object objValue = this.get(FIELD_AUTHPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 认证参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthParam4Dirty(){
        if(this.contains(FIELD_AUTHPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证参数4
     */
    @JsonIgnore
    public void resetAuthParam4(){
        this.reset(FIELD_AUTHPARAM4);
    }

    /**
     * 设置 认证参数4，详细说明：{@link #FIELD_AUTHPARAM4}
     * <P>
     * 等同 {@link #setAuthParam4}
     * @param authParam4
     */
    @JsonIgnore
    public PSSubSysServiceAPI authparam4(String authParam4){
        this.setAuthParam4(authParam4);
        return this;
    }

    /**
     * <B>AUTHTIMEOUT</B>&nbsp;认证超时时长
     */
    public final static String FIELD_AUTHTIMEOUT = "authtimeout";

    /**
     * 设置 认证超时时长
     * 
     * @param authTimeout
     * 
     */
    @JsonProperty(FIELD_AUTHTIMEOUT)
    public void setAuthTimeout(Integer authTimeout){
        this.set(FIELD_AUTHTIMEOUT, authTimeout);
    }
    
    /**
     * 获取 认证超时时长  
     * @return
     */
    @JsonIgnore
    public Integer getAuthTimeout(){
        Object objValue = this.get(FIELD_AUTHTIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 认证超时时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuthTimeoutDirty(){
        if(this.contains(FIELD_AUTHTIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 认证超时时长
     */
    @JsonIgnore
    public void resetAuthTimeout(){
        this.reset(FIELD_AUTHTIMEOUT);
    }

    /**
     * 设置 认证超时时长
     * <P>
     * 等同 {@link #setAuthTimeout}
     * @param authTimeout
     */
    @JsonIgnore
    public PSSubSysServiceAPI authtimeout(Integer authTimeout){
        this.setAuthTimeout(authTimeout);
        return this;
    }

    /**
     * <B>BASECLSPARAMS</B>&nbsp;基类参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_BASECLSPARAMS = "baseclsparams";

    /**
     * 设置 基类参数
     * 
     * @param baseClsParams
     * 
     */
    @JsonProperty(FIELD_BASECLSPARAMS)
    public void setBaseClsParams(String baseClsParams){
        this.set(FIELD_BASECLSPARAMS, baseClsParams);
    }
    
    /**
     * 获取 基类参数  
     * @return
     */
    @JsonIgnore
    public String getBaseClsParams(){
        Object objValue = this.get(FIELD_BASECLSPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 基类参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseClsParamsDirty(){
        if(this.contains(FIELD_BASECLSPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基类参数
     */
    @JsonIgnore
    public void resetBaseClsParams(){
        this.reset(FIELD_BASECLSPARAMS);
    }

    /**
     * 设置 基类参数
     * <P>
     * 等同 {@link #setBaseClsParams}
     * @param baseClsParams
     */
    @JsonIgnore
    public PSSubSysServiceAPI baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定外部服务接口的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSubSysServiceAPI codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAMEMODE</B>&nbsp;接口代码标识模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode} 
     */
    public final static String FIELD_CODENAMEMODE = "codenamemode";

    /**
     * 设置 接口代码标识模式
     * 
     * @param codeNameMode
     * 
     */
    @JsonProperty(FIELD_CODENAMEMODE)
    public void setCodeNameMode(String codeNameMode){
        this.set(FIELD_CODENAMEMODE, codeNameMode);
    }
    
    /**
     * 获取 接口代码标识模式  
     * @return
     */
    @JsonIgnore
    public String getCodeNameMode(){
        Object objValue = this.get(FIELD_CODENAMEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口代码标识模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameModeDirty(){
        if(this.contains(FIELD_CODENAMEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口代码标识模式
     */
    @JsonIgnore
    public void resetCodeNameMode(){
        this.reset(FIELD_CODENAMEMODE);
    }

    /**
     * 设置 接口代码标识模式
     * <P>
     * 等同 {@link #setCodeNameMode}
     * @param codeNameMode
     */
    @JsonIgnore
    public PSSubSysServiceAPI codenamemode(String codeNameMode){
        this.setCodeNameMode(codeNameMode);
        return this;
    }

     /**
     * 设置 接口代码标识模式
     * <P>
     * 等同 {@link #setCodeNameMode}
     * @param codeNameMode
     */
    @JsonIgnore
    public PSSubSysServiceAPI codenamemode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeNameMode codeNameMode){
        if(codeNameMode == null){
            this.setCodeNameMode(null);
        }
        else{
            this.setCodeNameMode(codeNameMode.value);
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
    public PSSubSysServiceAPI createdate(String createDate){
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
    public PSSubSysServiceAPI createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSubSysServiceAPI customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSubSysServiceAPI custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSubSysServiceAPI custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DEFCREATEREQMETHOD</B>&nbsp;默认建立行为请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFCREATEREQMETHOD = "defcreatereqmethod";

    /**
     * 设置 默认建立行为请求方式
     * 
     * @param defCreateReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFCREATEREQMETHOD)
    public void setDefCreateReqMethod(String defCreateReqMethod){
        this.set(FIELD_DEFCREATEREQMETHOD, defCreateReqMethod);
    }
    
    /**
     * 获取 默认建立行为请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefCreateReqMethod(){
        Object objValue = this.get(FIELD_DEFCREATEREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认建立行为请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefCreateReqMethodDirty(){
        if(this.contains(FIELD_DEFCREATEREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认建立行为请求方式
     */
    @JsonIgnore
    public void resetDefCreateReqMethod(){
        this.reset(FIELD_DEFCREATEREQMETHOD);
    }

    /**
     * 设置 默认建立行为请求方式
     * <P>
     * 等同 {@link #setDefCreateReqMethod}
     * @param defCreateReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defcreatereqmethod(String defCreateReqMethod){
        this.setDefCreateReqMethod(defCreateReqMethod);
        return this;
    }

     /**
     * 设置 默认建立行为请求方式
     * <P>
     * 等同 {@link #setDefCreateReqMethod}
     * @param defCreateReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defcreatereqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defCreateReqMethod){
        if(defCreateReqMethod == null){
            this.setDefCreateReqMethod(null);
        }
        else{
            this.setDefCreateReqMethod(defCreateReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFDEACTIONREQMETHOD</B>&nbsp;默认行为请求方式，指定外部服务接口的默认行为请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFDEACTIONREQMETHOD = "defdeactionreqmethod";

    /**
     * 设置 默认行为请求方式，详细说明：{@link #FIELD_DEFDEACTIONREQMETHOD}
     * 
     * @param defDEActionReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFDEACTIONREQMETHOD)
    public void setDefDEActionReqMethod(String defDEActionReqMethod){
        this.set(FIELD_DEFDEACTIONREQMETHOD, defDEActionReqMethod);
    }
    
    /**
     * 获取 默认行为请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefDEActionReqMethod(){
        Object objValue = this.get(FIELD_DEFDEACTIONREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认行为请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefDEActionReqMethodDirty(){
        if(this.contains(FIELD_DEFDEACTIONREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认行为请求方式
     */
    @JsonIgnore
    public void resetDefDEActionReqMethod(){
        this.reset(FIELD_DEFDEACTIONREQMETHOD);
    }

    /**
     * 设置 默认行为请求方式，详细说明：{@link #FIELD_DEFDEACTIONREQMETHOD}
     * <P>
     * 等同 {@link #setDefDEActionReqMethod}
     * @param defDEActionReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defdeactionreqmethod(String defDEActionReqMethod){
        this.setDefDEActionReqMethod(defDEActionReqMethod);
        return this;
    }

     /**
     * 设置 默认行为请求方式，详细说明：{@link #FIELD_DEFDEACTIONREQMETHOD}
     * <P>
     * 等同 {@link #setDefDEActionReqMethod}
     * @param defDEActionReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defdeactionreqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defDEActionReqMethod){
        if(defDEActionReqMethod == null){
            this.setDefDEActionReqMethod(null);
        }
        else{
            this.setDefDEActionReqMethod(defDEActionReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFDEDATASETREQMETHOD</B>&nbsp;默认结果集请求方式，指定外部服务接口的默认结果集请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFDEDATASETREQMETHOD = "defdedatasetreqmethod";

    /**
     * 设置 默认结果集请求方式，详细说明：{@link #FIELD_DEFDEDATASETREQMETHOD}
     * 
     * @param defDEDataSetReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFDEDATASETREQMETHOD)
    public void setDefDEDataSetReqMethod(String defDEDataSetReqMethod){
        this.set(FIELD_DEFDEDATASETREQMETHOD, defDEDataSetReqMethod);
    }
    
    /**
     * 获取 默认结果集请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefDEDataSetReqMethod(){
        Object objValue = this.get(FIELD_DEFDEDATASETREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认结果集请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefDEDataSetReqMethodDirty(){
        if(this.contains(FIELD_DEFDEDATASETREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认结果集请求方式
     */
    @JsonIgnore
    public void resetDefDEDataSetReqMethod(){
        this.reset(FIELD_DEFDEDATASETREQMETHOD);
    }

    /**
     * 设置 默认结果集请求方式，详细说明：{@link #FIELD_DEFDEDATASETREQMETHOD}
     * <P>
     * 等同 {@link #setDefDEDataSetReqMethod}
     * @param defDEDataSetReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defdedatasetreqmethod(String defDEDataSetReqMethod){
        this.setDefDEDataSetReqMethod(defDEDataSetReqMethod);
        return this;
    }

     /**
     * 设置 默认结果集请求方式，详细说明：{@link #FIELD_DEFDEDATASETREQMETHOD}
     * <P>
     * 等同 {@link #setDefDEDataSetReqMethod}
     * @param defDEDataSetReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defdedatasetreqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defDEDataSetReqMethod){
        if(defDEDataSetReqMethod == null){
            this.setDefDEDataSetReqMethod(null);
        }
        else{
            this.setDefDEDataSetReqMethod(defDEDataSetReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFDELETEREQMETHOD</B>&nbsp;默认删除行为请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFDELETEREQMETHOD = "defdeletereqmethod";

    /**
     * 设置 默认删除行为请求方式
     * 
     * @param defDeleteReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFDELETEREQMETHOD)
    public void setDefDeleteReqMethod(String defDeleteReqMethod){
        this.set(FIELD_DEFDELETEREQMETHOD, defDeleteReqMethod);
    }
    
    /**
     * 获取 默认删除行为请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefDeleteReqMethod(){
        Object objValue = this.get(FIELD_DEFDELETEREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认删除行为请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefDeleteReqMethodDirty(){
        if(this.contains(FIELD_DEFDELETEREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认删除行为请求方式
     */
    @JsonIgnore
    public void resetDefDeleteReqMethod(){
        this.reset(FIELD_DEFDELETEREQMETHOD);
    }

    /**
     * 设置 默认删除行为请求方式
     * <P>
     * 等同 {@link #setDefDeleteReqMethod}
     * @param defDeleteReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defdeletereqmethod(String defDeleteReqMethod){
        this.setDefDeleteReqMethod(defDeleteReqMethod);
        return this;
    }

     /**
     * 设置 默认删除行为请求方式
     * <P>
     * 等同 {@link #setDefDeleteReqMethod}
     * @param defDeleteReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defdeletereqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defDeleteReqMethod){
        if(defDeleteReqMethod == null){
            this.setDefDeleteReqMethod(null);
        }
        else{
            this.setDefDeleteReqMethod(defDeleteReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFGETDRAFTREQMETHOD</B>&nbsp;默认获取草稿行为请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFGETDRAFTREQMETHOD = "defgetdraftreqmethod";

    /**
     * 设置 默认获取草稿行为请求方式
     * 
     * @param defGetDraftReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFGETDRAFTREQMETHOD)
    public void setDefGetDraftReqMethod(String defGetDraftReqMethod){
        this.set(FIELD_DEFGETDRAFTREQMETHOD, defGetDraftReqMethod);
    }
    
    /**
     * 获取 默认获取草稿行为请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefGetDraftReqMethod(){
        Object objValue = this.get(FIELD_DEFGETDRAFTREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认获取草稿行为请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefGetDraftReqMethodDirty(){
        if(this.contains(FIELD_DEFGETDRAFTREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认获取草稿行为请求方式
     */
    @JsonIgnore
    public void resetDefGetDraftReqMethod(){
        this.reset(FIELD_DEFGETDRAFTREQMETHOD);
    }

    /**
     * 设置 默认获取草稿行为请求方式
     * <P>
     * 等同 {@link #setDefGetDraftReqMethod}
     * @param defGetDraftReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defgetdraftreqmethod(String defGetDraftReqMethod){
        this.setDefGetDraftReqMethod(defGetDraftReqMethod);
        return this;
    }

     /**
     * 设置 默认获取草稿行为请求方式
     * <P>
     * 等同 {@link #setDefGetDraftReqMethod}
     * @param defGetDraftReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defgetdraftreqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defGetDraftReqMethod){
        if(defGetDraftReqMethod == null){
            this.setDefGetDraftReqMethod(null);
        }
        else{
            this.setDefGetDraftReqMethod(defGetDraftReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFGETREQMETHOD</B>&nbsp;默认获取行为请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFGETREQMETHOD = "defgetreqmethod";

    /**
     * 设置 默认获取行为请求方式
     * 
     * @param defGetReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFGETREQMETHOD)
    public void setDefGetReqMethod(String defGetReqMethod){
        this.set(FIELD_DEFGETREQMETHOD, defGetReqMethod);
    }
    
    /**
     * 获取 默认获取行为请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefGetReqMethod(){
        Object objValue = this.get(FIELD_DEFGETREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认获取行为请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefGetReqMethodDirty(){
        if(this.contains(FIELD_DEFGETREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认获取行为请求方式
     */
    @JsonIgnore
    public void resetDefGetReqMethod(){
        this.reset(FIELD_DEFGETREQMETHOD);
    }

    /**
     * 设置 默认获取行为请求方式
     * <P>
     * 等同 {@link #setDefGetReqMethod}
     * @param defGetReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defgetreqmethod(String defGetReqMethod){
        this.setDefGetReqMethod(defGetReqMethod);
        return this;
    }

     /**
     * 设置 默认获取行为请求方式
     * <P>
     * 等同 {@link #setDefGetReqMethod}
     * @param defGetReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defgetreqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defGetReqMethod){
        if(defGetReqMethod == null){
            this.setDefGetReqMethod(null);
        }
        else{
            this.setDefGetReqMethod(defGetReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFNEEDRESOURCEKEY</B>&nbsp;默认独立输出资源键值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFNEEDRESOURCEKEY = "defneedresourcekey";

    /**
     * 设置 默认独立输出资源键值
     * 
     * @param defNeedResourceKey
     * 
     */
    @JsonProperty(FIELD_DEFNEEDRESOURCEKEY)
    public void setDefNeedResourceKey(Integer defNeedResourceKey){
        this.set(FIELD_DEFNEEDRESOURCEKEY, defNeedResourceKey);
    }
    
    /**
     * 获取 默认独立输出资源键值  
     * @return
     */
    @JsonIgnore
    public Integer getDefNeedResourceKey(){
        Object objValue = this.get(FIELD_DEFNEEDRESOURCEKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认独立输出资源键值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefNeedResourceKeyDirty(){
        if(this.contains(FIELD_DEFNEEDRESOURCEKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认独立输出资源键值
     */
    @JsonIgnore
    public void resetDefNeedResourceKey(){
        this.reset(FIELD_DEFNEEDRESOURCEKEY);
    }

    /**
     * 设置 默认独立输出资源键值
     * <P>
     * 等同 {@link #setDefNeedResourceKey}
     * @param defNeedResourceKey
     */
    @JsonIgnore
    public PSSubSysServiceAPI defneedresourcekey(Integer defNeedResourceKey){
        this.setDefNeedResourceKey(defNeedResourceKey);
        return this;
    }

     /**
     * 设置 默认独立输出资源键值
     * <P>
     * 等同 {@link #setDefNeedResourceKey}
     * @param defNeedResourceKey
     */
    @JsonIgnore
    public PSSubSysServiceAPI defneedresourcekey(Boolean defNeedResourceKey){
        if(defNeedResourceKey == null){
            this.setDefNeedResourceKey(null);
        }
        else{
            this.setDefNeedResourceKey(defNeedResourceKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFSELECTREQMETHOD</B>&nbsp;默认查询请求方式，指定外部服务接口的默认查询请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFSELECTREQMETHOD = "defselectreqmethod";

    /**
     * 设置 默认查询请求方式，详细说明：{@link #FIELD_DEFSELECTREQMETHOD}
     * 
     * @param defSelectReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFSELECTREQMETHOD)
    public void setDefSelectReqMethod(String defSelectReqMethod){
        this.set(FIELD_DEFSELECTREQMETHOD, defSelectReqMethod);
    }
    
    /**
     * 获取 默认查询请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefSelectReqMethod(){
        Object objValue = this.get(FIELD_DEFSELECTREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认查询请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefSelectReqMethodDirty(){
        if(this.contains(FIELD_DEFSELECTREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认查询请求方式
     */
    @JsonIgnore
    public void resetDefSelectReqMethod(){
        this.reset(FIELD_DEFSELECTREQMETHOD);
    }

    /**
     * 设置 默认查询请求方式，详细说明：{@link #FIELD_DEFSELECTREQMETHOD}
     * <P>
     * 等同 {@link #setDefSelectReqMethod}
     * @param defSelectReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defselectreqmethod(String defSelectReqMethod){
        this.setDefSelectReqMethod(defSelectReqMethod);
        return this;
    }

     /**
     * 设置 默认查询请求方式，详细说明：{@link #FIELD_DEFSELECTREQMETHOD}
     * <P>
     * 等同 {@link #setDefSelectReqMethod}
     * @param defSelectReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defselectreqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defSelectReqMethod){
        if(defSelectReqMethod == null){
            this.setDefSelectReqMethod(null);
        }
        else{
            this.setDefSelectReqMethod(defSelectReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEFUPDATEREQMETHOD</B>&nbsp;默认更新行为请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_DEFUPDATEREQMETHOD = "defupdatereqmethod";

    /**
     * 设置 默认更新行为请求方式
     * 
     * @param defUpdateReqMethod
     * 
     */
    @JsonProperty(FIELD_DEFUPDATEREQMETHOD)
    public void setDefUpdateReqMethod(String defUpdateReqMethod){
        this.set(FIELD_DEFUPDATEREQMETHOD, defUpdateReqMethod);
    }
    
    /**
     * 获取 默认更新行为请求方式  
     * @return
     */
    @JsonIgnore
    public String getDefUpdateReqMethod(){
        Object objValue = this.get(FIELD_DEFUPDATEREQMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认更新行为请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefUpdateReqMethodDirty(){
        if(this.contains(FIELD_DEFUPDATEREQMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认更新行为请求方式
     */
    @JsonIgnore
    public void resetDefUpdateReqMethod(){
        this.reset(FIELD_DEFUPDATEREQMETHOD);
    }

    /**
     * 设置 默认更新行为请求方式
     * <P>
     * 等同 {@link #setDefUpdateReqMethod}
     * @param defUpdateReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defupdatereqmethod(String defUpdateReqMethod){
        this.setDefUpdateReqMethod(defUpdateReqMethod);
        return this;
    }

     /**
     * 设置 默认更新行为请求方式
     * <P>
     * 等同 {@link #setDefUpdateReqMethod}
     * @param defUpdateReqMethod
     */
    @JsonIgnore
    public PSSubSysServiceAPI defupdatereqmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod defUpdateReqMethod){
        if(defUpdateReqMethod == null){
            this.setDefUpdateReqMethod(null);
        }
        else{
            this.setDefUpdateReqMethod(defUpdateReqMethod.value);
        }
        return this;
    }

    /**
     * <B>DEPSSYSSFPLUGINID</B>&nbsp;实体后台扩展插件，指定外部服务接口实体默认使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_DEPSSYSSFPLUGINID = "depssyssfpluginid";

    /**
     * 设置 实体后台扩展插件，详细说明：{@link #FIELD_DEPSSYSSFPLUGINID}
     * 
     * @param dEPSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_DEPSSYSSFPLUGINID)
    public void setDEPSSysSFPluginId(String dEPSSysSFPluginId){
        this.set(FIELD_DEPSSYSSFPLUGINID, dEPSSysSFPluginId);
    }
    
    /**
     * 获取 实体后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getDEPSSysSFPluginId(){
        Object objValue = this.get(FIELD_DEPSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_DEPSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体后台扩展插件
     */
    @JsonIgnore
    public void resetDEPSSysSFPluginId(){
        this.reset(FIELD_DEPSSYSSFPLUGINID);
    }

    /**
     * 设置 实体后台扩展插件，详细说明：{@link #FIELD_DEPSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setDEPSSysSFPluginId}
     * @param dEPSSysSFPluginId
     */
    @JsonIgnore
    public PSSubSysServiceAPI depssyssfpluginid(String dEPSSysSFPluginId){
        this.setDEPSSysSFPluginId(dEPSSysSFPluginId);
        return this;
    }

    /**
     * 设置 实体后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDEPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSubSysServiceAPI depssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setDEPSSysSFPluginId(null);
            this.setDEPSSysSFPluginName(null);
        }
        else{
            this.setDEPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setDEPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>DEPSSYSSFPLUGINNAME</B>&nbsp;实体后台扩展插件，指定外部服务接口实体默认使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DEPSSYSSFPLUGINID}
     */
    public final static String FIELD_DEPSSYSSFPLUGINNAME = "depssyssfpluginname";

    /**
     * 设置 实体后台扩展插件，详细说明：{@link #FIELD_DEPSSYSSFPLUGINNAME}
     * 
     * @param dEPSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_DEPSSYSSFPLUGINNAME)
    public void setDEPSSysSFPluginName(String dEPSSysSFPluginName){
        this.set(FIELD_DEPSSYSSFPLUGINNAME, dEPSSysSFPluginName);
    }
    
    /**
     * 获取 实体后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getDEPSSysSFPluginName(){
        Object objValue = this.get(FIELD_DEPSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_DEPSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体后台扩展插件
     */
    @JsonIgnore
    public void resetDEPSSysSFPluginName(){
        this.reset(FIELD_DEPSSYSSFPLUGINNAME);
    }

    /**
     * 设置 实体后台扩展插件，详细说明：{@link #FIELD_DEPSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setDEPSSysSFPluginName}
     * @param dEPSSysSFPluginName
     */
    @JsonIgnore
    public PSSubSysServiceAPI depssyssfpluginname(String dEPSSysSFPluginName){
        this.setDEPSSysSFPluginName(dEPSSysSFPluginName);
        return this;
    }

    /**
     * <B>ENABLEAPIMODELEX</B>&nbsp;启用接口模型扩展
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEAPIMODELEX = "enableapimodelex";

    /**
     * 设置 启用接口模型扩展
     * 
     * @param enableAPIModelEx
     * 
     */
    @JsonProperty(FIELD_ENABLEAPIMODELEX)
    public void setEnableAPIModelEx(Integer enableAPIModelEx){
        this.set(FIELD_ENABLEAPIMODELEX, enableAPIModelEx);
    }
    
    /**
     * 获取 启用接口模型扩展  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAPIModelEx(){
        Object objValue = this.get(FIELD_ENABLEAPIMODELEX);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用接口模型扩展 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAPIModelExDirty(){
        if(this.contains(FIELD_ENABLEAPIMODELEX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用接口模型扩展
     */
    @JsonIgnore
    public void resetEnableAPIModelEx(){
        this.reset(FIELD_ENABLEAPIMODELEX);
    }

    /**
     * 设置 启用接口模型扩展
     * <P>
     * 等同 {@link #setEnableAPIModelEx}
     * @param enableAPIModelEx
     */
    @JsonIgnore
    public PSSubSysServiceAPI enableapimodelex(Integer enableAPIModelEx){
        this.setEnableAPIModelEx(enableAPIModelEx);
        return this;
    }

     /**
     * 设置 启用接口模型扩展
     * <P>
     * 等同 {@link #setEnableAPIModelEx}
     * @param enableAPIModelEx
     */
    @JsonIgnore
    public PSSubSysServiceAPI enableapimodelex(Boolean enableAPIModelEx){
        if(enableAPIModelEx == null){
            this.setEnableAPIModelEx(null);
        }
        else{
            this.setEnableAPIModelEx(enableAPIModelEx?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FROMDEMODELFLAG</B>&nbsp;从实体模型展开
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FROMDEMODELFLAG = "fromdemodelflag";

    /**
     * 设置 从实体模型展开
     * 
     * @param fromDEModelFlag
     * 
     */
    @JsonProperty(FIELD_FROMDEMODELFLAG)
    public void setFromDEModelFlag(Integer fromDEModelFlag){
        this.set(FIELD_FROMDEMODELFLAG, fromDEModelFlag);
    }
    
    /**
     * 获取 从实体模型展开  
     * @return
     */
    @JsonIgnore
    public Integer getFromDEModelFlag(){
        Object objValue = this.get(FIELD_FROMDEMODELFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 从实体模型展开 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFromDEModelFlagDirty(){
        if(this.contains(FIELD_FROMDEMODELFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体模型展开
     */
    @JsonIgnore
    public void resetFromDEModelFlag(){
        this.reset(FIELD_FROMDEMODELFLAG);
    }

    /**
     * 设置 从实体模型展开
     * <P>
     * 等同 {@link #setFromDEModelFlag}
     * @param fromDEModelFlag
     */
    @JsonIgnore
    public PSSubSysServiceAPI fromdemodelflag(Integer fromDEModelFlag){
        this.setFromDEModelFlag(fromDEModelFlag);
        return this;
    }

     /**
     * 设置 从实体模型展开
     * <P>
     * 等同 {@link #setFromDEModelFlag}
     * @param fromDEModelFlag
     */
    @JsonIgnore
    public PSSubSysServiceAPI fromdemodelflag(Boolean fromDEModelFlag){
        if(fromDEModelFlag == null){
            this.setFromDEModelFlag(null);
        }
        else{
            this.setFromDEModelFlag(fromDEModelFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HEADERPARAMS</B>&nbsp;请求头参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_HEADERPARAMS = "headerparams";

    /**
     * 设置 请求头参数
     * 
     * @param headerParams
     * 
     */
    @JsonProperty(FIELD_HEADERPARAMS)
    public void setHeaderParams(String headerParams){
        this.set(FIELD_HEADERPARAMS, headerParams);
    }
    
    /**
     * 获取 请求头参数  
     * @return
     */
    @JsonIgnore
    public String getHeaderParams(){
        Object objValue = this.get(FIELD_HEADERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求头参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderParamsDirty(){
        if(this.contains(FIELD_HEADERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求头参数
     */
    @JsonIgnore
    public void resetHeaderParams(){
        this.reset(FIELD_HEADERPARAMS);
    }

    /**
     * 设置 请求头参数
     * <P>
     * 等同 {@link #setHeaderParams}
     * @param headerParams
     */
    @JsonIgnore
    public PSSubSysServiceAPI headerparams(String headerParams){
        this.setHeaderParams(headerParams);
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
    public PSSubSysServiceAPI memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>METHODCODE</B>&nbsp;方法代码
     */
    public final static String FIELD_METHODCODE = "methodcode";

    /**
     * 设置 方法代码
     * 
     * @param methodCode
     * 
     */
    @JsonProperty(FIELD_METHODCODE)
    public void setMethodCode(String methodCode){
        this.set(FIELD_METHODCODE, methodCode);
    }
    
    /**
     * 获取 方法代码  
     * @return
     */
    @JsonIgnore
    public String getMethodCode(){
        Object objValue = this.get(FIELD_METHODCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方法代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMethodCodeDirty(){
        if(this.contains(FIELD_METHODCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方法代码
     */
    @JsonIgnore
    public void resetMethodCode(){
        this.reset(FIELD_METHODCODE);
    }

    /**
     * 设置 方法代码
     * <P>
     * 等同 {@link #setMethodCode}
     * @param methodCode
     */
    @JsonIgnore
    public PSSubSysServiceAPI methodcode(String methodCode){
        this.setMethodCode(methodCode);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型，指定外部服务接口的平台预定义类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedServiceAPIClient} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSubSysServiceAPI predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 预定义类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSubSysServiceAPI predefinedtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedServiceAPIClient predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    /**
     * <B>PSDEVSLNSYSAPIID</B>&nbsp;开发系统接口，接口来源为【外部开发系统服务接口】时指定当前开发方案的开发系统服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDevSlnSysAPI} 
     */
    public final static String FIELD_PSDEVSLNSYSAPIID = "psdevslnsysapiid";

    /**
     * 设置 开发系统接口，详细说明：{@link #FIELD_PSDEVSLNSYSAPIID}
     * 
     * @param pSDevSlnSysAPIId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPIID)
    public void setPSDevSlnSysAPIId(String pSDevSlnSysAPIId){
        this.set(FIELD_PSDEVSLNSYSAPIID, pSDevSlnSysAPIId);
    }
    
    /**
     * 获取 开发系统接口  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysAPIId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysAPIIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统接口
     */
    @JsonIgnore
    public void resetPSDevSlnSysAPIId(){
        this.reset(FIELD_PSDEVSLNSYSAPIID);
    }

    /**
     * 设置 开发系统接口，详细说明：{@link #FIELD_PSDEVSLNSYSAPIID}
     * <P>
     * 等同 {@link #setPSDevSlnSysAPIId}
     * @param pSDevSlnSysAPIId
     */
    @JsonIgnore
    public PSSubSysServiceAPI psdevslnsysapiid(String pSDevSlnSysAPIId){
        this.setPSDevSlnSysAPIId(pSDevSlnSysAPIId);
        return this;
    }


    /**
     * <B>PSDEVSLNSYSAPINAME</B>&nbsp;开发系统接口，接口来源为【外部开发系统服务接口】时指定当前开发方案的开发系统服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSAPIID}
     */
    public final static String FIELD_PSDEVSLNSYSAPINAME = "psdevslnsysapiname";

    /**
     * 设置 开发系统接口，详细说明：{@link #FIELD_PSDEVSLNSYSAPINAME}
     * 
     * @param pSDevSlnSysAPIName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSAPINAME)
    public void setPSDevSlnSysAPIName(String pSDevSlnSysAPIName){
        this.set(FIELD_PSDEVSLNSYSAPINAME, pSDevSlnSysAPIName);
    }
    
    /**
     * 获取 开发系统接口  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysAPIName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysAPINameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统接口
     */
    @JsonIgnore
    public void resetPSDevSlnSysAPIName(){
        this.reset(FIELD_PSDEVSLNSYSAPINAME);
    }

    /**
     * 设置 开发系统接口，详细说明：{@link #FIELD_PSDEVSLNSYSAPINAME}
     * <P>
     * 等同 {@link #setPSDevSlnSysAPIName}
     * @param pSDevSlnSysAPIName
     */
    @JsonIgnore
    public PSSubSysServiceAPI psdevslnsysapiname(String pSDevSlnSysAPIName){
        this.setPSDevSlnSysAPIName(pSDevSlnSysAPIName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定外部服务接口所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
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
    public PSSubSysServiceAPI psmoduleid(String pSModuleId){
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
    public PSSubSysServiceAPI psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定外部服务接口所在的系统模块
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
    public PSSubSysServiceAPI psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;子系统服务接口标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 子系统服务接口标识
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 子系统服务接口标识  
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
     * 判断 子系统服务接口标识 是否指定值，包括空值
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
     * 重置 子系统服务接口标识
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 子系统服务接口标识
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;服务接口名称，指定外部服务接口的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 服务接口名称，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 服务接口名称  
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
     * 判断 服务接口名称 是否指定值，包括空值
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
     * 重置 服务接口名称
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 服务接口名称，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSubSysServiceAPIName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSubSysServiceAPIName(strName);
    }

    @JsonIgnore
    public PSSubSysServiceAPI name(String strName){
        this.setPSSubSysServiceAPIName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMEID</B>&nbsp;系统集成体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIScheme} 
     */
    public final static String FIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";

    /**
     * 设置 系统集成体系
     * 
     * @param pSSysEAISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMEID)
    public void setPSSysEAISchemeId(String pSSysEAISchemeId){
        this.set(FIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }
    
    /**
     * 获取 系统集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeId(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeId(){
        this.reset(FIELD_PSSYSEAISCHEMEID);
    }

    /**
     * 设置 系统集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAISchemeId
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * 设置 系统集成体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAIScheme 引用对象
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyseaischemeid(PSSysEAIScheme pSSysEAIScheme){
        if(pSSysEAIScheme == null){
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        }
        else{
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMENAME</B>&nbsp;系统集成体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAISCHEMEID}
     */
    public final static String FIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";

    /**
     * 设置 系统集成体系
     * 
     * @param pSSysEAISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMENAME)
    public void setPSSysEAISchemeName(String pSSysEAISchemeName){
        this.set(FIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }
    
    /**
     * 获取 系统集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeName(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeName(){
        this.reset(FIELD_PSSYSEAISCHEMENAME);
    }

    /**
     * 设置 系统集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeName}
     * @param pSSysEAISchemeName
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyseaischemename(String pSSysEAISchemeName){
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
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
    public PSSubSysServiceAPI pssysreqitemid(String pSSysReqItemId){
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
    public PSSubSysServiceAPI pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSSubSysServiceAPI pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSSubSysServiceAPI pssysresourceid(String pSSysResourceId){
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
    public PSSubSysServiceAPI pssysresourceid(PSSysResource pSSysResource){
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
    public PSSubSysServiceAPI pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSAHANDLERID</B>&nbsp;系统服务接口处理器，指定外部服务接口的处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSAHandler} 
     */
    public final static String FIELD_PSSYSSAHANDLERID = "pssyssahandlerid";

    /**
     * 设置 系统服务接口处理器，详细说明：{@link #FIELD_PSSYSSAHANDLERID}
     * 
     * @param pSSysSAHandlerId
     * 
     */
    @JsonProperty(FIELD_PSSYSSAHANDLERID)
    public void setPSSysSAHandlerId(String pSSysSAHandlerId){
        this.set(FIELD_PSSYSSAHANDLERID, pSSysSAHandlerId);
    }
    
    /**
     * 获取 系统服务接口处理器  
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
     * 判断 系统服务接口处理器 是否指定值，包括空值
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
     * 重置 系统服务接口处理器
     */
    @JsonIgnore
    public void resetPSSysSAHandlerId(){
        this.reset(FIELD_PSSYSSAHANDLERID);
    }

    /**
     * 设置 系统服务接口处理器，详细说明：{@link #FIELD_PSSYSSAHANDLERID}
     * <P>
     * 等同 {@link #setPSSysSAHandlerId}
     * @param pSSysSAHandlerId
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyssahandlerid(String pSSysSAHandlerId){
        this.setPSSysSAHandlerId(pSSysSAHandlerId);
        return this;
    }

    /**
     * 设置 系统服务接口处理器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSAHandlerId}
     * @param pSSysSAHandler 引用对象
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyssahandlerid(PSSysSAHandler pSSysSAHandler){
        if(pSSysSAHandler == null){
            this.setPSSysSAHandlerId(null);
            this.setPSSysSAHandlerName(null);
        }
        else{
            this.setPSSysSAHandlerId(pSSysSAHandler.getPSSysSAHandlerId());
            this.setPSSysSAHandlerName(pSSysSAHandler.getPSSysSAHandlerName());
        }
        return this;
    }

    /**
     * <B>PSSYSSAHANDLERNAME</B>&nbsp;接口处理器，指定外部服务接口的处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSAHANDLERID}
     */
    public final static String FIELD_PSSYSSAHANDLERNAME = "pssyssahandlername";

    /**
     * 设置 接口处理器，详细说明：{@link #FIELD_PSSYSSAHANDLERNAME}
     * 
     * @param pSSysSAHandlerName
     * 
     */
    @JsonProperty(FIELD_PSSYSSAHANDLERNAME)
    public void setPSSysSAHandlerName(String pSSysSAHandlerName){
        this.set(FIELD_PSSYSSAHANDLERNAME, pSSysSAHandlerName);
    }
    
    /**
     * 获取 接口处理器  
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
     * 判断 接口处理器 是否指定值，包括空值
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
     * 重置 接口处理器
     */
    @JsonIgnore
    public void resetPSSysSAHandlerName(){
        this.reset(FIELD_PSSYSSAHANDLERNAME);
    }

    /**
     * 设置 接口处理器，详细说明：{@link #FIELD_PSSYSSAHANDLERNAME}
     * <P>
     * 等同 {@link #setPSSysSAHandlerName}
     * @param pSSysSAHandlerName
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyssahandlername(String pSSysSAHandlerName){
        this.setPSSysSAHandlerName(pSSysSAHandlerName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口，接口来源为【当前系统服务接口】时指定当前系统的服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysServiceAPI} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPIID}
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
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssysserviceapiid(String pSSysServiceAPIId){
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
    public PSSubSysServiceAPI pssysserviceapiid(PSSysServiceAPI pSSysServiceAPI){
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
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口，接口来源为【当前系统服务接口】时指定当前系统的服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPINAME}
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
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定外部服务接口的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定外部服务接口的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSubSysServiceAPI pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>RESETDEFACTIONCODENAME</B>&nbsp;重置默认行为代码标识
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_RESETDEFACTIONCODENAME = "resetdefactioncodename";

    /**
     * 设置 重置默认行为代码标识
     * 
     * @param resetDefActionCodeName
     * 
     */
    @JsonProperty(FIELD_RESETDEFACTIONCODENAME)
    public void setResetDefActionCodeName(Integer resetDefActionCodeName){
        this.set(FIELD_RESETDEFACTIONCODENAME, resetDefActionCodeName);
    }
    
    /**
     * 获取 重置默认行为代码标识  
     * @return
     */
    @JsonIgnore
    public Integer getResetDefActionCodeName(){
        Object objValue = this.get(FIELD_RESETDEFACTIONCODENAME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 重置默认行为代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResetDefActionCodeNameDirty(){
        if(this.contains(FIELD_RESETDEFACTIONCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重置默认行为代码标识
     */
    @JsonIgnore
    public void resetResetDefActionCodeName(){
        this.reset(FIELD_RESETDEFACTIONCODENAME);
    }

    /**
     * 设置 重置默认行为代码标识
     * <P>
     * 等同 {@link #setResetDefActionCodeName}
     * @param resetDefActionCodeName
     */
    @JsonIgnore
    public PSSubSysServiceAPI resetdefactioncodename(Integer resetDefActionCodeName){
        this.setResetDefActionCodeName(resetDefActionCodeName);
        return this;
    }

     /**
     * 设置 重置默认行为代码标识
     * <P>
     * 等同 {@link #setResetDefActionCodeName}
     * @param resetDefActionCodeName
     */
    @JsonIgnore
    public PSSubSysServiceAPI resetdefactioncodename(Boolean resetDefActionCodeName){
        if(resetDefActionCodeName == null){
            this.setResetDefActionCodeName(null);
        }
        else{
            this.setResetDefActionCodeName(resetDefActionCodeName?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SCRIPTENGINE</B>&nbsp;默认脚本引擎
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_SCRIPTENGINE = "scriptengine";

    /**
     * 设置 默认脚本引擎
     * 
     * @param scriptEngine
     * 
     */
    @JsonProperty(FIELD_SCRIPTENGINE)
    public void setScriptEngine(String scriptEngine){
        this.set(FIELD_SCRIPTENGINE, scriptEngine);
    }
    
    /**
     * 获取 默认脚本引擎  
     * @return
     */
    @JsonIgnore
    public String getScriptEngine(){
        Object objValue = this.get(FIELD_SCRIPTENGINE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认脚本引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isScriptEngineDirty(){
        if(this.contains(FIELD_SCRIPTENGINE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认脚本引擎
     */
    @JsonIgnore
    public void resetScriptEngine(){
        this.reset(FIELD_SCRIPTENGINE);
    }

    /**
     * 设置 默认脚本引擎
     * <P>
     * 等同 {@link #setScriptEngine}
     * @param scriptEngine
     */
    @JsonIgnore
    public PSSubSysServiceAPI scriptengine(String scriptEngine){
        this.setScriptEngine(scriptEngine);
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码标识，指定外部服务接口的服务代码标识，未定义时使用接口的【代码标识】
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
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
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSSubSysServiceAPI servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>SERVICEDTOFLAG</B>&nbsp;使用服务传输对象（DTO）
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SERVICEDTOFLAG = "servicedtoflag";

    /**
     * 设置 使用服务传输对象（DTO）
     * 
     * @param serviceDTOFlag
     * 
     */
    @JsonProperty(FIELD_SERVICEDTOFLAG)
    public void setServiceDTOFlag(Integer serviceDTOFlag){
        this.set(FIELD_SERVICEDTOFLAG, serviceDTOFlag);
    }
    
    /**
     * 获取 使用服务传输对象（DTO）  
     * @return
     */
    @JsonIgnore
    public Integer getServiceDTOFlag(){
        Object objValue = this.get(FIELD_SERVICEDTOFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 使用服务传输对象（DTO） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceDTOFlagDirty(){
        if(this.contains(FIELD_SERVICEDTOFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 使用服务传输对象（DTO）
     */
    @JsonIgnore
    public void resetServiceDTOFlag(){
        this.reset(FIELD_SERVICEDTOFLAG);
    }

    /**
     * 设置 使用服务传输对象（DTO）
     * <P>
     * 等同 {@link #setServiceDTOFlag}
     * @param serviceDTOFlag
     */
    @JsonIgnore
    public PSSubSysServiceAPI servicedtoflag(Integer serviceDTOFlag){
        this.setServiceDTOFlag(serviceDTOFlag);
        return this;
    }

     /**
     * 设置 使用服务传输对象（DTO）
     * <P>
     * 等同 {@link #setServiceDTOFlag}
     * @param serviceDTOFlag
     */
    @JsonIgnore
    public PSSubSysServiceAPI servicedtoflag(Boolean serviceDTOFlag){
        if(serviceDTOFlag == null){
            this.setServiceDTOFlag(null);
        }
        else{
            this.setServiceDTOFlag(serviceDTOFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SERVICEPARAM</B>&nbsp;服务参数，指定外部服务接口的默认服务参数，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPARAM = "serviceparam";

    /**
     * 设置 服务参数，详细说明：{@link #FIELD_SERVICEPARAM}
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
     * 设置 服务参数，详细说明：{@link #FIELD_SERVICEPARAM}
     * <P>
     * 等同 {@link #setServiceParam}
     * @param serviceParam
     */
    @JsonIgnore
    public PSSubSysServiceAPI serviceparam(String serviceParam){
        this.setServiceParam(serviceParam);
        return this;
    }

    /**
     * <B>SERVICEPARAM2</B>&nbsp;服务参数2，指定外部服务接口的默认服务参数2，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPARAM2 = "serviceparam2";

    /**
     * 设置 服务参数2，详细说明：{@link #FIELD_SERVICEPARAM2}
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
     * 设置 服务参数2，详细说明：{@link #FIELD_SERVICEPARAM2}
     * <P>
     * 等同 {@link #setServiceParam2}
     * @param serviceParam2
     */
    @JsonIgnore
    public PSSubSysServiceAPI serviceparam2(String serviceParam2){
        this.setServiceParam2(serviceParam2);
        return this;
    }

    /**
     * <B>SERVICEPARAM3</B>&nbsp;服务参数3，指定外部服务接口的默认服务参数3，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERVICEPARAM3 = "serviceparam3";

    /**
     * 设置 服务参数3，详细说明：{@link #FIELD_SERVICEPARAM3}
     * 
     * @param serviceParam3
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAM3)
    public void setServiceParam3(String serviceParam3){
        this.set(FIELD_SERVICEPARAM3, serviceParam3);
    }
    
    /**
     * 获取 服务参数3  
     * @return
     */
    @JsonIgnore
    public String getServiceParam3(){
        Object objValue = this.get(FIELD_SERVICEPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParam3Dirty(){
        if(this.contains(FIELD_SERVICEPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务参数3
     */
    @JsonIgnore
    public void resetServiceParam3(){
        this.reset(FIELD_SERVICEPARAM3);
    }

    /**
     * 设置 服务参数3，详细说明：{@link #FIELD_SERVICEPARAM3}
     * <P>
     * 等同 {@link #setServiceParam3}
     * @param serviceParam3
     */
    @JsonIgnore
    public PSSubSysServiceAPI serviceparam3(String serviceParam3){
        this.setServiceParam3(serviceParam3);
        return this;
    }

    /**
     * <B>SERVICEPARAM4</B>&nbsp;服务参数4，指定外部服务接口的默认服务参数4，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SERVICEPARAM4 = "serviceparam4";

    /**
     * 设置 服务参数4，详细说明：{@link #FIELD_SERVICEPARAM4}
     * 
     * @param serviceParam4
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAM4)
    public void setServiceParam4(String serviceParam4){
        this.set(FIELD_SERVICEPARAM4, serviceParam4);
    }
    
    /**
     * 获取 服务参数4  
     * @return
     */
    @JsonIgnore
    public String getServiceParam4(){
        Object objValue = this.get(FIELD_SERVICEPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParam4Dirty(){
        if(this.contains(FIELD_SERVICEPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务参数4
     */
    @JsonIgnore
    public void resetServiceParam4(){
        this.reset(FIELD_SERVICEPARAM4);
    }

    /**
     * 设置 服务参数4，详细说明：{@link #FIELD_SERVICEPARAM4}
     * <P>
     * 等同 {@link #setServiceParam4}
     * @param serviceParam4
     */
    @JsonIgnore
    public PSSubSysServiceAPI serviceparam4(String serviceParam4){
        this.setServiceParam4(serviceParam4);
        return this;
    }

    /**
     * <B>SERVICEPARAMS</B>&nbsp;更多服务参数
     */
    public final static String FIELD_SERVICEPARAMS = "serviceparams";

    /**
     * 设置 更多服务参数
     * 
     * @param serviceParams
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAMS)
    public void setServiceParams(String serviceParams){
        this.set(FIELD_SERVICEPARAMS, serviceParams);
    }
    
    /**
     * 获取 更多服务参数  
     * @return
     */
    @JsonIgnore
    public String getServiceParams(){
        Object objValue = this.get(FIELD_SERVICEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更多服务参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParamsDirty(){
        if(this.contains(FIELD_SERVICEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更多服务参数
     */
    @JsonIgnore
    public void resetServiceParams(){
        this.reset(FIELD_SERVICEPARAMS);
    }

    /**
     * 设置 更多服务参数
     * <P>
     * 等同 {@link #setServiceParams}
     * @param serviceParams
     */
    @JsonIgnore
    public PSSubSysServiceAPI serviceparams(String serviceParams){
        this.setServiceParams(serviceParams);
        return this;
    }

    /**
     * <B>SERVICEPATH</B>&nbsp;默认服务路径，指定外部服务接口的默认服务路径，支持在运行时配置调整
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_SERVICEPATH = "servicepath";

    /**
     * 设置 默认服务路径，详细说明：{@link #FIELD_SERVICEPATH}
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
     * 设置 默认服务路径，详细说明：{@link #FIELD_SERVICEPATH}
     * <P>
     * 等同 {@link #setServicePath}
     * @param servicePath
     */
    @JsonIgnore
    public PSSubSysServiceAPI servicepath(String servicePath){
        this.setServicePath(servicePath);
        return this;
    }

    /**
     * <B>SERVICETYPE</B>&nbsp;服务类型，接口来源为【预定义系统服务接口】时指定平台预置的服务类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ServiceType} 
     */
    public final static String FIELD_SERVICETYPE = "servicetype";

    /**
     * 设置 服务类型，详细说明：{@link #FIELD_SERVICETYPE}
     * 
     * @param serviceType
     * 
     */
    @JsonProperty(FIELD_SERVICETYPE)
    public void setServiceType(String serviceType){
        this.set(FIELD_SERVICETYPE, serviceType);
    }
    
    /**
     * 获取 服务类型  
     * @return
     */
    @JsonIgnore
    public String getServiceType(){
        Object objValue = this.get(FIELD_SERVICETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceTypeDirty(){
        if(this.contains(FIELD_SERVICETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务类型
     */
    @JsonIgnore
    public void resetServiceType(){
        this.reset(FIELD_SERVICETYPE);
    }

    /**
     * 设置 服务类型，详细说明：{@link #FIELD_SERVICETYPE}
     * <P>
     * 等同 {@link #setServiceType}
     * @param serviceType
     */
    @JsonIgnore
    public PSSubSysServiceAPI servicetype(String serviceType){
        this.setServiceType(serviceType);
        return this;
    }

     /**
     * 设置 服务类型，详细说明：{@link #FIELD_SERVICETYPE}
     * <P>
     * 等同 {@link #setServiceType}
     * @param serviceType
     */
    @JsonIgnore
    public PSSubSysServiceAPI servicetype(net.ibizsys.psmodel.core.util.PSModelEnums.ServiceType serviceType){
        if(serviceType == null){
            this.setServiceType(null);
        }
        else{
            this.setServiceType(serviceType.value);
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
    public PSSubSysServiceAPI updatedate(String updateDate){
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
    public PSSubSysServiceAPI updateman(String updateMan){
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
    public PSSubSysServiceAPI usercat(String userCat){
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
    public PSSubSysServiceAPI usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSubSysServiceAPI usertag(String userTag){
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
    public PSSubSysServiceAPI usertag2(String userTag2){
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
    public PSSubSysServiceAPI usertag3(String userTag3){
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
    public PSSubSysServiceAPI usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSSubSysServiceAPI validflag(Integer validFlag){
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
    public PSSubSysServiceAPI validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VER</B>&nbsp;版本，指定外部服务接口的版本
     */
    public final static String FIELD_VER = "ver";

    /**
     * 设置 版本，详细说明：{@link #FIELD_VER}
     * 
     * @param ver
     * 
     */
    @JsonProperty(FIELD_VER)
    public void setVer(Integer ver){
        this.set(FIELD_VER, ver);
    }
    
    /**
     * 获取 版本  
     * @return
     */
    @JsonIgnore
    public Integer getVer(){
        Object objValue = this.get(FIELD_VER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerDirty(){
        if(this.contains(FIELD_VER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本
     */
    @JsonIgnore
    public void resetVer(){
        this.reset(FIELD_VER);
    }

    /**
     * 设置 版本，详细说明：{@link #FIELD_VER}
     * <P>
     * 等同 {@link #setVer}
     * @param ver
     */
    @JsonIgnore
    public PSSubSysServiceAPI ver(Integer ver){
        this.setVer(ver);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSubSysServiceAPIId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSubSysServiceAPIId(strValue);
    }

    @JsonIgnore
    public PSSubSysServiceAPI id(String strValue){
        this.setPSSubSysServiceAPIId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSubSysServiceAPI){
            PSSubSysServiceAPI model = (PSSubSysServiceAPI)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
