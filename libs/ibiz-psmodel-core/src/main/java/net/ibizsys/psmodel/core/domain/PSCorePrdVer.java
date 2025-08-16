package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSCOREPRDVER</B>云平台核心产品版本 模型传输对象
 * <P>
 * 
 */
public class PSCorePrdVer extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSCorePrdVer(){
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
    public PSCorePrdVer createdate(String createDate){
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
    public PSCorePrdVer createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认版本
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认版本
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认版本  
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
     * 判断 默认版本 是否指定值，包括空值
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
     * 重置 默认版本
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认版本
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSCorePrdVer defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认版本
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSCorePrdVer defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSCorePrdVer memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PLANPUBDATE</B>&nbsp;预计发布时间
     */
    public final static String FIELD_PLANPUBDATE = "planpubdate";

    /**
     * 设置 预计发布时间
     * 
     * @param planPubDate
     * 
     */
    @JsonProperty(FIELD_PLANPUBDATE)
    public void setPlanPubDate(String planPubDate){
        this.set(FIELD_PLANPUBDATE, planPubDate);
    }
    
    /**
     * 获取 预计发布时间  
     * @return
     */
    @JsonIgnore
    public String getPlanPubDate(){
        Object objValue = this.get(FIELD_PLANPUBDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预计发布时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlanPubDateDirty(){
        if(this.contains(FIELD_PLANPUBDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预计发布时间
     */
    @JsonIgnore
    public void resetPlanPubDate(){
        this.reset(FIELD_PLANPUBDATE);
    }

    /**
     * 设置 预计发布时间
     * <P>
     * 等同 {@link #setPlanPubDate}
     * @param planPubDate
     */
    @JsonIgnore
    public PSCorePrdVer planpubdate(String planPubDate){
        this.setPlanPubDate(planPubDate);
        return this;
    }

    /**
     * <B>PSCOREPRDFUNCID</B>&nbsp;产品功能
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDFUNCID = "pscoreprdfuncid";

    /**
     * 设置 产品功能
     * 
     * @param pSCorePrdFuncId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDFUNCID)
    public void setPSCorePrdFuncId(String pSCorePrdFuncId){
        this.set(FIELD_PSCOREPRDFUNCID, pSCorePrdFuncId);
    }
    
    /**
     * 获取 产品功能  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdFuncId(){
        Object objValue = this.get(FIELD_PSCOREPRDFUNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdFuncIdDirty(){
        if(this.contains(FIELD_PSCOREPRDFUNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品功能
     */
    @JsonIgnore
    public void resetPSCorePrdFuncId(){
        this.reset(FIELD_PSCOREPRDFUNCID);
    }

    /**
     * 设置 产品功能
     * <P>
     * 等同 {@link #setPSCorePrdFuncId}
     * @param pSCorePrdFuncId
     */
    @JsonIgnore
    public PSCorePrdVer pscoreprdfuncid(String pSCorePrdFuncId){
        this.setPSCorePrdFuncId(pSCorePrdFuncId);
        return this;
    }

    /**
     * <B>PSCOREPRDFUNCNAME</B>&nbsp;产品功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDFUNCID}
     */
    public final static String FIELD_PSCOREPRDFUNCNAME = "pscoreprdfuncname";

    /**
     * 设置 产品功能
     * 
     * @param pSCorePrdFuncName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDFUNCNAME)
    public void setPSCorePrdFuncName(String pSCorePrdFuncName){
        this.set(FIELD_PSCOREPRDFUNCNAME, pSCorePrdFuncName);
    }
    
    /**
     * 获取 产品功能  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdFuncName(){
        Object objValue = this.get(FIELD_PSCOREPRDFUNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品功能 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdFuncNameDirty(){
        if(this.contains(FIELD_PSCOREPRDFUNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品功能
     */
    @JsonIgnore
    public void resetPSCorePrdFuncName(){
        this.reset(FIELD_PSCOREPRDFUNCNAME);
    }

    /**
     * 设置 产品功能
     * <P>
     * 等同 {@link #setPSCorePrdFuncName}
     * @param pSCorePrdFuncName
     */
    @JsonIgnore
    public PSCorePrdVer pscoreprdfuncname(String pSCorePrdFuncName){
        this.setPSCorePrdFuncName(pSCorePrdFuncName);
        return this;
    }

    /**
     * <B>PSCOREPRDID</B>&nbsp;核心产品
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDID = "pscoreprdid";

    /**
     * 设置 核心产品
     * 
     * @param pSCorePrdId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDID)
    public void setPSCorePrdId(String pSCorePrdId){
        this.set(FIELD_PSCOREPRDID, pSCorePrdId);
    }
    
    /**
     * 获取 核心产品  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdId(){
        Object objValue = this.get(FIELD_PSCOREPRDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 核心产品 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdIdDirty(){
        if(this.contains(FIELD_PSCOREPRDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 核心产品
     */
    @JsonIgnore
    public void resetPSCorePrdId(){
        this.reset(FIELD_PSCOREPRDID);
    }

    /**
     * 设置 核心产品
     * <P>
     * 等同 {@link #setPSCorePrdId}
     * @param pSCorePrdId
     */
    @JsonIgnore
    public PSCorePrdVer pscoreprdid(String pSCorePrdId){
        this.setPSCorePrdId(pSCorePrdId);
        return this;
    }

    /**
     * <B>PSCOREPRDNAME</B>&nbsp;核心产品
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDID}
     */
    public final static String FIELD_PSCOREPRDNAME = "pscoreprdname";

    /**
     * 设置 核心产品
     * 
     * @param pSCorePrdName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDNAME)
    public void setPSCorePrdName(String pSCorePrdName){
        this.set(FIELD_PSCOREPRDNAME, pSCorePrdName);
    }
    
    /**
     * 获取 核心产品  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdName(){
        Object objValue = this.get(FIELD_PSCOREPRDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 核心产品 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdNameDirty(){
        if(this.contains(FIELD_PSCOREPRDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 核心产品
     */
    @JsonIgnore
    public void resetPSCorePrdName(){
        this.reset(FIELD_PSCOREPRDNAME);
    }

    /**
     * 设置 核心产品
     * <P>
     * 等同 {@link #setPSCorePrdName}
     * @param pSCorePrdName
     */
    @JsonIgnore
    public PSCorePrdVer pscoreprdname(String pSCorePrdName){
        this.setPSCorePrdName(pSCorePrdName);
        return this;
    }

    /**
     * <B>PSCOREPRDVERID</B>&nbsp;云平台核心产品版本标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDVERID = "pscoreprdverid";

    /**
     * 设置 云平台核心产品版本标识
     * 
     * @param pSCorePrdVerId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDVERID)
    public void setPSCorePrdVerId(String pSCorePrdVerId){
        this.set(FIELD_PSCOREPRDVERID, pSCorePrdVerId);
    }
    
    /**
     * 获取 云平台核心产品版本标识  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdVerId(){
        Object objValue = this.get(FIELD_PSCOREPRDVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台核心产品版本标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdVerIdDirty(){
        if(this.contains(FIELD_PSCOREPRDVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台核心产品版本标识
     */
    @JsonIgnore
    public void resetPSCorePrdVerId(){
        this.reset(FIELD_PSCOREPRDVERID);
    }

    /**
     * 设置 云平台核心产品版本标识
     * <P>
     * 等同 {@link #setPSCorePrdVerId}
     * @param pSCorePrdVerId
     */
    @JsonIgnore
    public PSCorePrdVer pscoreprdverid(String pSCorePrdVerId){
        this.setPSCorePrdVerId(pSCorePrdVerId);
        return this;
    }

    /**
     * <B>PSCOREPRDVERNAME</B>&nbsp;产品版本
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCOREPRDVERNAME = "pscoreprdvername";

    /**
     * 设置 产品版本
     * 
     * @param pSCorePrdVerName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDVERNAME)
    public void setPSCorePrdVerName(String pSCorePrdVerName){
        this.set(FIELD_PSCOREPRDVERNAME, pSCorePrdVerName);
    }
    
    /**
     * 获取 产品版本  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdVerName(){
        Object objValue = this.get(FIELD_PSCOREPRDVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdVerNameDirty(){
        if(this.contains(FIELD_PSCOREPRDVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品版本
     */
    @JsonIgnore
    public void resetPSCorePrdVerName(){
        this.reset(FIELD_PSCOREPRDVERNAME);
    }

    /**
     * 设置 产品版本
     * <P>
     * 等同 {@link #setPSCorePrdVerName}
     * @param pSCorePrdVerName
     */
    @JsonIgnore
    public PSCorePrdVer pscoreprdvername(String pSCorePrdVerName){
        this.setPSCorePrdVerName(pSCorePrdVerName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCorePrdVerName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCorePrdVerName(strName);
    }

    @JsonIgnore
    public PSCorePrdVer name(String strName){
        this.setPSCorePrdVerName(strName);
        return this;
    }

    /**
     * <B>PUBDATE</B>&nbsp;发布时间
     */
    public final static String FIELD_PUBDATE = "pubdate";

    /**
     * 设置 发布时间
     * 
     * @param pubDate
     * 
     */
    @JsonProperty(FIELD_PUBDATE)
    public void setPubDate(String pubDate){
        this.set(FIELD_PUBDATE, pubDate);
    }
    
    /**
     * 获取 发布时间  
     * @return
     */
    @JsonIgnore
    public String getPubDate(){
        Object objValue = this.get(FIELD_PUBDATE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubDateDirty(){
        if(this.contains(FIELD_PUBDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布时间
     */
    @JsonIgnore
    public void resetPubDate(){
        this.reset(FIELD_PUBDATE);
    }

    /**
     * 设置 发布时间
     * <P>
     * 等同 {@link #setPubDate}
     * @param pubDate
     */
    @JsonIgnore
    public PSCorePrdVer pubdate(String pubDate){
        this.setPubDate(pubDate);
        return this;
    }

    /**
     * <B>PUBSTATE</B>&nbsp;发布状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PSCorePrdVerState} 
     */
    public final static String FIELD_PUBSTATE = "pubstate";

    /**
     * 设置 发布状态
     * 
     * @param pubState
     * 
     */
    @JsonProperty(FIELD_PUBSTATE)
    public void setPubState(Integer pubState){
        this.set(FIELD_PUBSTATE, pubState);
    }
    
    /**
     * 获取 发布状态  
     * @return
     */
    @JsonIgnore
    public Integer getPubState(){
        Object objValue = this.get(FIELD_PUBSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 发布状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubStateDirty(){
        if(this.contains(FIELD_PUBSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布状态
     */
    @JsonIgnore
    public void resetPubState(){
        this.reset(FIELD_PUBSTATE);
    }

    /**
     * 设置 发布状态
     * <P>
     * 等同 {@link #setPubState}
     * @param pubState
     */
    @JsonIgnore
    public PSCorePrdVer pubstate(Integer pubState){
        this.setPubState(pubState);
        return this;
    }

//     /**
//     * 设置 发布状态
//     * <P>
//     * 等同 {@link #setPubState}
//     * @param pubState
//     */
//    @JsonIgnore
//    public PSCorePrdVer pubstate(Integer pubState){
//        if(pubState == null){
//            this.setPubState(null);
//        }
//        else{
//            this.setPubState(pubState.value);
//        }
//        return this;
//    }

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
    public PSCorePrdVer updatedate(String updateDate){
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
    public PSCorePrdVer updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>VERSN</B>&nbsp;版本序列号
     */
    public final static String FIELD_VERSN = "versn";

    /**
     * 设置 版本序列号
     * 
     * @param verSN
     * 
     */
    @JsonProperty(FIELD_VERSN)
    public void setVerSN(Integer verSN){
        this.set(FIELD_VERSN, verSN);
    }
    
    /**
     * 获取 版本序列号  
     * @return
     */
    @JsonIgnore
    public Integer getVerSN(){
        Object objValue = this.get(FIELD_VERSN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 版本序列号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerSNDirty(){
        if(this.contains(FIELD_VERSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本序列号
     */
    @JsonIgnore
    public void resetVerSN(){
        this.reset(FIELD_VERSN);
    }

    /**
     * 设置 版本序列号
     * <P>
     * 等同 {@link #setVerSN}
     * @param verSN
     */
    @JsonIgnore
    public PSCorePrdVer versn(Integer verSN){
        this.setVerSN(verSN);
        return this;
    }

    /**
     * <B>VERTAG</B>&nbsp;版本标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VERTAG = "vertag";

    /**
     * 设置 版本标记
     * 
     * @param verTag
     * 
     */
    @JsonProperty(FIELD_VERTAG)
    public void setVerTag(String verTag){
        this.set(FIELD_VERTAG, verTag);
    }
    
    /**
     * 获取 版本标记  
     * @return
     */
    @JsonIgnore
    public String getVerTag(){
        Object objValue = this.get(FIELD_VERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerTagDirty(){
        if(this.contains(FIELD_VERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本标记
     */
    @JsonIgnore
    public void resetVerTag(){
        this.reset(FIELD_VERTAG);
    }

    /**
     * 设置 版本标记
     * <P>
     * 等同 {@link #setVerTag}
     * @param verTag
     */
    @JsonIgnore
    public PSCorePrdVer vertag(String verTag){
        this.setVerTag(verTag);
        return this;
    }

    /**
     * <B>VERTAG2</B>&nbsp;版本标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VERTAG2 = "vertag2";

    /**
     * 设置 版本标记2
     * 
     * @param verTag2
     * 
     */
    @JsonProperty(FIELD_VERTAG2)
    public void setVerTag2(String verTag2){
        this.set(FIELD_VERTAG2, verTag2);
    }
    
    /**
     * 获取 版本标记2  
     * @return
     */
    @JsonIgnore
    public String getVerTag2(){
        Object objValue = this.get(FIELD_VERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerTag2Dirty(){
        if(this.contains(FIELD_VERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本标记2
     */
    @JsonIgnore
    public void resetVerTag2(){
        this.reset(FIELD_VERTAG2);
    }

    /**
     * 设置 版本标记2
     * <P>
     * 等同 {@link #setVerTag2}
     * @param verTag2
     */
    @JsonIgnore
    public PSCorePrdVer vertag2(String verTag2){
        this.setVerTag2(verTag2);
        return this;
    }

    /**
     * <B>VERTYPE</B>&nbsp;版本类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VERTYPE = "vertype";

    /**
     * 设置 版本类型
     * 
     * @param verType
     * 
     */
    @JsonProperty(FIELD_VERTYPE)
    public void setVerType(String verType){
        this.set(FIELD_VERTYPE, verType);
    }
    
    /**
     * 获取 版本类型  
     * @return
     */
    @JsonIgnore
    public String getVerType(){
        Object objValue = this.get(FIELD_VERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerTypeDirty(){
        if(this.contains(FIELD_VERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本类型
     */
    @JsonIgnore
    public void resetVerType(){
        this.reset(FIELD_VERTYPE);
    }

    /**
     * 设置 版本类型
     * <P>
     * 等同 {@link #setVerType}
     * @param verType
     */
    @JsonIgnore
    public PSCorePrdVer vertype(String verType){
        this.setVerType(verType);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCorePrdVerId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCorePrdVerId(strValue);
    }

    @JsonIgnore
    public PSCorePrdVer id(String strValue){
        this.setPSCorePrdVerId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSCorePrdVer){
            PSCorePrdVer model = (PSCorePrdVer)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
