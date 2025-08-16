package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCClusterDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;应用中心
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterName(){
        Object objValue = this.get(FIELD_PSDEVCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDCClusterDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterId(){
        Object objValue = this.get(FIELD_PSDEVCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDCClusterDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>RESREADYTIME</B>&nbsp;资源就绪时间
     */
    public final static String FIELD_RESREADYTIME = "resreadytime";

    /**
     * 设置 资源就绪时间
     * 
     * @param resReadyTime
     * 
     */
    @JsonProperty(FIELD_RESREADYTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setResReadyTime(Timestamp resReadyTime){
        this.set(FIELD_RESREADYTIME, resReadyTime);
    }
    
    /**
     * 获取 资源就绪时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getResReadyTime(){
        Object objValue = this.get(FIELD_RESREADYTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 资源就绪时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResReadyTimeDirty(){
        if(this.contains(FIELD_RESREADYTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源就绪时间
     */
    @JsonIgnore
    public void resetResReadyTime(){
        this.reset(FIELD_RESREADYTIME);
    }

    /**
     * 设置 资源就绪时间
     * <P>
     * 等同 {@link #setResReadyTime}
     * @param resReadyTime
     */
    @JsonIgnore
    public PSDCClusterDTO resreadytime(Timestamp resReadyTime){
        this.setResReadyTime(resReadyTime);
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
    public PSDCClusterDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDCClusterDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>EXPRIEDTIME</B>&nbsp;过期时间
     */
    public final static String FIELD_EXPRIEDTIME = "expriedtime";

    /**
     * 设置 过期时间
     * 
     * @param expriedTime
     * 
     */
    @JsonProperty(FIELD_EXPRIEDTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setExpriedTime(Timestamp expriedTime){
        this.set(FIELD_EXPRIEDTIME, expriedTime);
    }
    
    /**
     * 获取 过期时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getExpriedTime(){
        Object objValue = this.get(FIELD_EXPRIEDTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 过期时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpriedTimeDirty(){
        if(this.contains(FIELD_EXPRIEDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 过期时间
     */
    @JsonIgnore
    public void resetExpriedTime(){
        this.reset(FIELD_EXPRIEDTIME);
    }

    /**
     * 设置 过期时间
     * <P>
     * 等同 {@link #setExpriedTime}
     * @param expriedTime
     */
    @JsonIgnore
    public PSDCClusterDTO expriedtime(Timestamp expriedTime){
        this.setExpriedTime(expriedTime);
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
    public PSDCClusterDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
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
    public PSDCClusterDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>PARAM</B>&nbsp;参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM = "param";

    /**
     * 设置 参数
     * 
     * @param param
     * 
     */
    @JsonProperty(FIELD_PARAM)
    public void setParam(String param){
        this.set(FIELD_PARAM, param);
    }
    
    /**
     * 获取 参数  
     * @return
     */
    @JsonIgnore
    public String getParam(){
        Object objValue = this.get(FIELD_PARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDirty(){
        if(this.contains(FIELD_PARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数
     */
    @JsonIgnore
    public void resetParam(){
        this.reset(FIELD_PARAM);
    }

    /**
     * 设置 参数
     * <P>
     * 等同 {@link #setParam}
     * @param param
     */
    @JsonIgnore
    public PSDCClusterDTO param(String param){
        this.setParam(param);
        return this;
    }

    /**
     * <B>IPADDR</B>&nbsp;服务IP
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_IPADDR = "ipaddr";

    /**
     * 设置 服务IP
     * 
     * @param ipAddr
     * 
     */
    @JsonProperty(FIELD_IPADDR)
    public void setIpAddr(String ipAddr){
        this.set(FIELD_IPADDR, ipAddr);
    }
    
    /**
     * 获取 服务IP  
     * @return
     */
    @JsonIgnore
    public String getIpAddr(){
        Object objValue = this.get(FIELD_IPADDR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务IP 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIpAddrDirty(){
        if(this.contains(FIELD_IPADDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务IP
     */
    @JsonIgnore
    public void resetIpAddr(){
        this.reset(FIELD_IPADDR);
    }

    /**
     * 设置 服务IP
     * <P>
     * 等同 {@link #setIpAddr}
     * @param ipAddr
     */
    @JsonIgnore
    public PSDCClusterDTO ipaddr(String ipAddr){
        this.setIpAddr(ipAddr);
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
    public PSDCClusterDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERNAME</B>&nbsp;用户名
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_USERNAME = "username";

    /**
     * 设置 用户名
     * 
     * @param userName
     * 
     */
    @JsonProperty(FIELD_USERNAME)
    public void setUserName(String userName){
        this.set(FIELD_USERNAME, userName);
    }
    
    /**
     * 获取 用户名  
     * @return
     */
    @JsonIgnore
    public String getUserName(){
        Object objValue = this.get(FIELD_USERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserNameDirty(){
        if(this.contains(FIELD_USERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户名
     */
    @JsonIgnore
    public void resetUserName(){
        this.reset(FIELD_USERNAME);
    }

    /**
     * 设置 用户名
     * <P>
     * 等同 {@link #setUserName}
     * @param userName
     */
    @JsonIgnore
    public PSDCClusterDTO username(String userName){
        this.setUserName(userName);
        return this;
    }

    /**
     * <B>PSDCCLUSTERNAME</B>&nbsp;集群名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCCLUSTERNAME = "psdcclustername";

    /**
     * 设置 集群名称
     * 
     * @param pSDCClusterName
     * 
     */
    @JsonProperty(FIELD_PSDCCLUSTERNAME)
    public void setPSDCClusterName(String pSDCClusterName){
        this.set(FIELD_PSDCCLUSTERNAME, pSDCClusterName);
    }
    
    /**
     * 获取 集群名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCClusterName(){
        Object objValue = this.get(FIELD_PSDCCLUSTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集群名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCClusterNameDirty(){
        if(this.contains(FIELD_PSDCCLUSTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集群名称
     */
    @JsonIgnore
    public void resetPSDCClusterName(){
        this.reset(FIELD_PSDCCLUSTERNAME);
    }

    /**
     * 设置 集群名称
     * <P>
     * 等同 {@link #setPSDCClusterName}
     * @param pSDCClusterName
     */
    @JsonIgnore
    public PSDCClusterDTO psdcclustername(String pSDCClusterName){
        this.setPSDCClusterName(pSDCClusterName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCClusterName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCClusterName(strName);
    }

    @JsonIgnore
    public PSDCClusterDTO name(String strName){
        this.setPSDCClusterName(strName);
        return this;
    }

    /**
     * <B>PARAM3</B>&nbsp;参数3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM3 = "param3";

    /**
     * 设置 参数3
     * 
     * @param param3
     * 
     */
    @JsonProperty(FIELD_PARAM3)
    public void setParam3(String param3){
        this.set(FIELD_PARAM3, param3);
    }
    
    /**
     * 获取 参数3  
     * @return
     */
    @JsonIgnore
    public String getParam3(){
        Object objValue = this.get(FIELD_PARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam3Dirty(){
        if(this.contains(FIELD_PARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数3
     */
    @JsonIgnore
    public void resetParam3(){
        this.reset(FIELD_PARAM3);
    }

    /**
     * 设置 参数3
     * <P>
     * 等同 {@link #setParam3}
     * @param param3
     */
    @JsonIgnore
    public PSDCClusterDTO param3(String param3){
        this.setParam3(param3);
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
    public PSDCClusterDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>URL</B>&nbsp;访问路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_URL = "url";

    /**
     * 设置 访问路径
     * 
     * @param url
     * 
     */
    @JsonProperty(FIELD_URL)
    public void setUrl(String url){
        this.set(FIELD_URL, url);
    }
    
    /**
     * 获取 访问路径  
     * @return
     */
    @JsonIgnore
    public String getUrl(){
        Object objValue = this.get(FIELD_URL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUrlDirty(){
        if(this.contains(FIELD_URL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问路径
     */
    @JsonIgnore
    public void resetUrl(){
        this.reset(FIELD_URL);
    }

    /**
     * 设置 访问路径
     * <P>
     * 等同 {@link #setUrl}
     * @param url
     */
    @JsonIgnore
    public PSDCClusterDTO url(String url){
        this.setUrl(url);
        return this;
    }

    /**
     * <B>PARAM2</B>&nbsp;参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM2 = "param2";

    /**
     * 设置 参数2
     * 
     * @param param2
     * 
     */
    @JsonProperty(FIELD_PARAM2)
    public void setParam2(String param2){
        this.set(FIELD_PARAM2, param2);
    }
    
    /**
     * 获取 参数2  
     * @return
     */
    @JsonIgnore
    public String getParam2(){
        Object objValue = this.get(FIELD_PARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam2Dirty(){
        if(this.contains(FIELD_PARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数2
     */
    @JsonIgnore
    public void resetParam2(){
        this.reset(FIELD_PARAM2);
    }

    /**
     * 设置 参数2
     * <P>
     * 等同 {@link #setParam2}
     * @param param2
     */
    @JsonIgnore
    public PSDCClusterDTO param2(String param2){
        this.setParam2(param2);
        return this;
    }

    /**
     * <B>IPADDR2</B>&nbsp;内部IP
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_IPADDR2 = "ipaddr2";

    /**
     * 设置 内部IP
     * 
     * @param ipAddr2
     * 
     */
    @JsonProperty(FIELD_IPADDR2)
    public void setIpAddr2(String ipAddr2){
        this.set(FIELD_IPADDR2, ipAddr2);
    }
    
    /**
     * 获取 内部IP  
     * @return
     */
    @JsonIgnore
    public String getIpAddr2(){
        Object objValue = this.get(FIELD_IPADDR2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内部IP 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIpAddr2Dirty(){
        if(this.contains(FIELD_IPADDR2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内部IP
     */
    @JsonIgnore
    public void resetIpAddr2(){
        this.reset(FIELD_IPADDR2);
    }

    /**
     * 设置 内部IP
     * <P>
     * 等同 {@link #setIpAddr2}
     * @param ipAddr2
     */
    @JsonIgnore
    public PSDCClusterDTO ipaddr2(String ipAddr2){
        this.setIpAddr2(ipAddr2);
        return this;
    }

    /**
     * <B>DOMAINNAME</B>&nbsp;域名
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DOMAINNAME = "domainname";

    /**
     * 设置 域名
     * 
     * @param domainName
     * 
     */
    @JsonProperty(FIELD_DOMAINNAME)
    public void setDomainName(String domainName){
        this.set(FIELD_DOMAINNAME, domainName);
    }
    
    /**
     * 获取 域名  
     * @return
     */
    @JsonIgnore
    public String getDomainName(){
        Object objValue = this.get(FIELD_DOMAINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 域名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDomainNameDirty(){
        if(this.contains(FIELD_DOMAINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 域名
     */
    @JsonIgnore
    public void resetDomainName(){
        this.reset(FIELD_DOMAINNAME);
    }

    /**
     * 设置 域名
     * <P>
     * 等同 {@link #setDomainName}
     * @param domainName
     */
    @JsonIgnore
    public PSDCClusterDTO domainname(String domainName){
        this.setDomainName(domainName);
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
    public PSDCClusterDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PARAM4</B>&nbsp;参数4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM4 = "param4";

    /**
     * 设置 参数4
     * 
     * @param param4
     * 
     */
    @JsonProperty(FIELD_PARAM4)
    public void setParam4(String param4){
        this.set(FIELD_PARAM4, param4);
    }
    
    /**
     * 获取 参数4  
     * @return
     */
    @JsonIgnore
    public String getParam4(){
        Object objValue = this.get(FIELD_PARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam4Dirty(){
        if(this.contains(FIELD_PARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数4
     */
    @JsonIgnore
    public void resetParam4(){
        this.reset(FIELD_PARAM4);
    }

    /**
     * 设置 参数4
     * <P>
     * 等同 {@link #setParam4}
     * @param param4
     */
    @JsonIgnore
    public PSDCClusterDTO param4(String param4){
        this.setParam4(param4);
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
    public PSDCClusterDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>PORT</B>&nbsp;服务端口
     */
    public final static String FIELD_PORT = "port";

    /**
     * 设置 服务端口
     * 
     * @param port
     * 
     */
    @JsonProperty(FIELD_PORT)
    public void setPort(Integer port){
        this.set(FIELD_PORT, port);
    }
    
    /**
     * 获取 服务端口  
     * @return
     */
    @JsonIgnore
    public Integer getPort(){
        Object objValue = this.get(FIELD_PORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 服务端口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPortDirty(){
        if(this.contains(FIELD_PORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务端口
     */
    @JsonIgnore
    public void resetPort(){
        this.reset(FIELD_PORT);
    }

    /**
     * 设置 服务端口
     * <P>
     * 等同 {@link #setPort}
     * @param port
     */
    @JsonIgnore
    public PSDCClusterDTO port(Integer port){
        this.setPort(port);
        return this;
    }

    /**
     * <B>RESVER</B>&nbsp;资源版本
     */
    public final static String FIELD_RESVER = "resver";

    /**
     * 设置 资源版本
     * 
     * @param resVer
     * 
     */
    @JsonProperty(FIELD_RESVER)
    public void setResVer(Integer resVer){
        this.set(FIELD_RESVER, resVer);
    }
    
    /**
     * 获取 资源版本  
     * @return
     */
    @JsonIgnore
    public Integer getResVer(){
        Object objValue = this.get(FIELD_RESVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResVerDirty(){
        if(this.contains(FIELD_RESVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源版本
     */
    @JsonIgnore
    public void resetResVer(){
        this.reset(FIELD_RESVER);
    }

    /**
     * 设置 资源版本
     * <P>
     * 等同 {@link #setResVer}
     * @param resVer
     */
    @JsonIgnore
    public PSDCClusterDTO resver(Integer resVer){
        this.setResVer(resVer);
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
    public PSDCClusterDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CLUSTERTYPE</B>&nbsp;集群类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.ClusterType} 
     */
    public final static String FIELD_CLUSTERTYPE = "clustertype";

    /**
     * 设置 集群类型
     * 
     * @param clusterType
     * 
     */
    @JsonProperty(FIELD_CLUSTERTYPE)
    public void setClusterType(String clusterType){
        this.set(FIELD_CLUSTERTYPE, clusterType);
    }
    
    /**
     * 获取 集群类型  
     * @return
     */
    @JsonIgnore
    public String getClusterType(){
        Object objValue = this.get(FIELD_CLUSTERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集群类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClusterTypeDirty(){
        if(this.contains(FIELD_CLUSTERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集群类型
     */
    @JsonIgnore
    public void resetClusterType(){
        this.reset(FIELD_CLUSTERTYPE);
    }

    /**
     * 设置 集群类型
     * <P>
     * 等同 {@link #setClusterType}
     * @param clusterType
     */
    @JsonIgnore
    public PSDCClusterDTO clustertype(String clusterType){
        this.setClusterType(clusterType);
        return this;
    }

     /**
     * 设置 集群类型
     * <P>
     * 等同 {@link #setClusterType}
     * @param clusterType
     */
    @JsonIgnore
    public PSDCClusterDTO clustertype(net.ibizsys.centralstudio.util.CentralEnums.ClusterType clusterType){
        if(clusterType == null){
            this.setClusterType(null);
        }
        else{
            this.setClusterType(clusterType.value);
        }
        return this;
    }

    /**
     * <B>RESSTATE</B>&nbsp;资源状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevCenterResState} 
     */
    public final static String FIELD_RESSTATE = "resstate";

    /**
     * 设置 资源状态
     * 
     * @param resState
     * 
     */
    @JsonProperty(FIELD_RESSTATE)
    public void setResState(Integer resState){
        this.set(FIELD_RESSTATE, resState);
    }
    
    /**
     * 获取 资源状态  
     * @return
     */
    @JsonIgnore
    public Integer getResState(){
        Object objValue = this.get(FIELD_RESSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResStateDirty(){
        if(this.contains(FIELD_RESSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源状态
     */
    @JsonIgnore
    public void resetResState(){
        this.reset(FIELD_RESSTATE);
    }

    /**
     * 设置 资源状态
     * <P>
     * 等同 {@link #setResState}
     * @param resState
     */
    @JsonIgnore
    public PSDCClusterDTO resstate(Integer resState){
        this.setResState(resState);
        return this;
    }

     /**
     * 设置 资源状态
     * <P>
     * 等同 {@link #setResState}
     * @param resState
     */
    @JsonIgnore
    public PSDCClusterDTO resstate(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResState resState){
        if(resState == null){
            this.setResState(null);
        }
        else{
            this.setResState(resState.value);
        }
        return this;
    }

    /**
     * <B>PSDCCLUSTERID</B>&nbsp;应用中心集群标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCCLUSTERID = "psdcclusterid";

    /**
     * 设置 应用中心集群标识
     * 
     * @param pSDCClusterId
     * 
     */
    @JsonProperty(FIELD_PSDCCLUSTERID)
    public void setPSDCClusterId(String pSDCClusterId){
        this.set(FIELD_PSDCCLUSTERID, pSDCClusterId);
    }
    
    /**
     * 获取 应用中心集群标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCClusterId(){
        Object objValue = this.get(FIELD_PSDCCLUSTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心集群标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCClusterIdDirty(){
        if(this.contains(FIELD_PSDCCLUSTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心集群标识
     */
    @JsonIgnore
    public void resetPSDCClusterId(){
        this.reset(FIELD_PSDCCLUSTERID);
    }

    /**
     * 设置 应用中心集群标识
     * <P>
     * 等同 {@link #setPSDCClusterId}
     * @param pSDCClusterId
     */
    @JsonIgnore
    public PSDCClusterDTO psdcclusterid(String pSDCClusterId){
        this.setPSDCClusterId(pSDCClusterId);
        return this;
    }

    /**
     * <B>RESPOS</B>&nbsp;资源来源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevCenterResPos} 
     */
    public final static String FIELD_RESPOS = "respos";

    /**
     * 设置 资源来源
     * 
     * @param resPos
     * 
     */
    @JsonProperty(FIELD_RESPOS)
    public void setResPos(Integer resPos){
        this.set(FIELD_RESPOS, resPos);
    }
    
    /**
     * 获取 资源来源  
     * @return
     */
    @JsonIgnore
    public Integer getResPos(){
        Object objValue = this.get(FIELD_RESPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源来源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResPosDirty(){
        if(this.contains(FIELD_RESPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源来源
     */
    @JsonIgnore
    public void resetResPos(){
        this.reset(FIELD_RESPOS);
    }

    /**
     * 设置 资源来源
     * <P>
     * 等同 {@link #setResPos}
     * @param resPos
     */
    @JsonIgnore
    public PSDCClusterDTO respos(Integer resPos){
        this.setResPos(resPos);
        return this;
    }

     /**
     * 设置 资源来源
     * <P>
     * 等同 {@link #setResPos}
     * @param resPos
     */
    @JsonIgnore
    public PSDCClusterDTO respos(net.ibizsys.centralstudio.util.CentralEnums.DevCenterResPos resPos){
        if(resPos == null){
            this.setResPos(null);
        }
        else{
            this.setResPos(resPos.value);
        }
        return this;
    }

    /**
     * <B>CLUSTERPARAMS</B>&nbsp;集群参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CLUSTERPARAMS = "clusterparams";

    /**
     * 设置 集群参数
     * 
     * @param clusterParams
     * 
     */
    @JsonProperty(FIELD_CLUSTERPARAMS)
    public void setClusterParams(String clusterParams){
        this.set(FIELD_CLUSTERPARAMS, clusterParams);
    }
    
    /**
     * 获取 集群参数  
     * @return
     */
    @JsonIgnore
    public String getClusterParams(){
        Object objValue = this.get(FIELD_CLUSTERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集群参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClusterParamsDirty(){
        if(this.contains(FIELD_CLUSTERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集群参数
     */
    @JsonIgnore
    public void resetClusterParams(){
        this.reset(FIELD_CLUSTERPARAMS);
    }

    /**
     * 设置 集群参数
     * <P>
     * 等同 {@link #setClusterParams}
     * @param clusterParams
     */
    @JsonIgnore
    public PSDCClusterDTO clusterparams(String clusterParams){
        this.setClusterParams(clusterParams);
        return this;
    }

    /**
     * <B>CLUSTERCFG</B>&nbsp;集群配置
     */
    public final static String FIELD_CLUSTERCFG = "clustercfg";

    /**
     * 设置 集群配置
     * 
     * @param clusterCfg
     * 
     */
    @JsonProperty(FIELD_CLUSTERCFG)
    public void setClusterCfg(String clusterCfg){
        this.set(FIELD_CLUSTERCFG, clusterCfg);
    }
    
    /**
     * 获取 集群配置  
     * @return
     */
    @JsonIgnore
    public String getClusterCfg(){
        Object objValue = this.get(FIELD_CLUSTERCFG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集群配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClusterCfgDirty(){
        if(this.contains(FIELD_CLUSTERCFG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集群配置
     */
    @JsonIgnore
    public void resetClusterCfg(){
        this.reset(FIELD_CLUSTERCFG);
    }

    /**
     * 设置 集群配置
     * <P>
     * 等同 {@link #setClusterCfg}
     * @param clusterCfg
     */
    @JsonIgnore
    public PSDCClusterDTO clustercfg(String clusterCfg){
        this.setClusterCfg(clusterCfg);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCClusterId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCClusterDTO){
            PSDCClusterDTO dto = (PSDCClusterDTO)iEntity;
        }
        super.copyTo(iEntity);
    }

    @Override
    protected Map<String, Object> prepareAny() {
        Map<String, Object> any = super.prepareAny();
        if(any != null){
            any.remove(FIELD_CREATEMAN);
            any.remove(FIELD_UPDATEMAN);
            any.remove(FIELD_CREATEDATE);
            any.remove(FIELD_UPDATEDATE);
        }
        return any;
    }
    
}