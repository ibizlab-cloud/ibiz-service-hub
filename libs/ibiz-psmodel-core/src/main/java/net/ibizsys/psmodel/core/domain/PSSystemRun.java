package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSTEMRUN</B>系统运行 模型传输对象
 * <P>
 * 系统运行配置模型，定义系统运行模式，包括了后台体系、前端应用等信息
 */
public class PSSystemRun extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSystemRun(){
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
    public PSSystemRun createdate(String createDate){
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
    public PSSystemRun createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认运行，指定系统运行是否为所属系统的默认运行配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认运行，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认运行  
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
     * 判断 默认运行 是否指定值，包括空值
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
     * 重置 默认运行
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认运行，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSystemRun defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认运行，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSystemRun defaultflag(Boolean defaultFlag){
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
    public PSSystemRun memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;前端应用，指定系统运行的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSystemRun pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 前端应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSSystemRun pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPID2</B>&nbsp;前端应用2，指定系统运行的前端应用2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID2 = "pssysappid2";

    /**
     * 设置 前端应用2，详细说明：{@link #FIELD_PSSYSAPPID2}
     * 
     * @param pSSysAppId2
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID2)
    public void setPSSysAppId2(String pSSysAppId2){
        this.set(FIELD_PSSYSAPPID2, pSSysAppId2);
    }
    
    /**
     * 获取 前端应用2  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId2(){
        Object objValue = this.get(FIELD_PSSYSAPPID2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppId2Dirty(){
        if(this.contains(FIELD_PSSYSAPPID2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用2
     */
    @JsonIgnore
    public void resetPSSysAppId2(){
        this.reset(FIELD_PSSYSAPPID2);
    }

    /**
     * 设置 前端应用2，详细说明：{@link #FIELD_PSSYSAPPID2}
     * <P>
     * 等同 {@link #setPSSysAppId2}
     * @param pSSysAppId2
     */
    @JsonIgnore
    public PSSystemRun pssysappid2(String pSSysAppId2){
        this.setPSSysAppId2(pSSysAppId2);
        return this;
    }

    /**
     * 设置 前端应用2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId2}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSSystemRun pssysappid2(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId2(null);
            this.setPSSysAppName2(null);
        }
        else{
            this.setPSSysAppId2(pSSysApp.getPSSysAppId());
            this.setPSSysAppName2(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定系统运行的前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSSystemRun pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSAPPNAME2</B>&nbsp;前端应用2，指定系统运行的前端应用2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID2}
     */
    public final static String FIELD_PSSYSAPPNAME2 = "pssysappname2";

    /**
     * 设置 前端应用2，详细说明：{@link #FIELD_PSSYSAPPNAME2}
     * 
     * @param pSSysAppName2
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME2)
    public void setPSSysAppName2(String pSSysAppName2){
        this.set(FIELD_PSSYSAPPNAME2, pSSysAppName2);
    }
    
    /**
     * 获取 前端应用2  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName2(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppName2Dirty(){
        if(this.contains(FIELD_PSSYSAPPNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用2
     */
    @JsonIgnore
    public void resetPSSysAppName2(){
        this.reset(FIELD_PSSYSAPPNAME2);
    }

    /**
     * 设置 前端应用2，详细说明：{@link #FIELD_PSSYSAPPNAME2}
     * <P>
     * 等同 {@link #setPSSysAppName2}
     * @param pSSysAppName2
     */
    @JsonIgnore
    public PSSystemRun pssysappname2(String pSSysAppName2){
        this.setPSSysAppName2(pSSysAppName2);
        return this;
    }

    /**
     * <B>PSSYSBDINSTCFGID</B>&nbsp;大数据源，指定系统运行使用的大数据库
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDInstCfg} 
     */
    public final static String FIELD_PSSYSBDINSTCFGID = "pssysbdinstcfgid";

    /**
     * 设置 大数据源，详细说明：{@link #FIELD_PSSYSBDINSTCFGID}
     * 
     * @param pSSysBDInstCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDINSTCFGID)
    public void setPSSysBDInstCfgId(String pSSysBDInstCfgId){
        this.set(FIELD_PSSYSBDINSTCFGID, pSSysBDInstCfgId);
    }
    
    /**
     * 获取 大数据源  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDInstCfgId(){
        Object objValue = this.get(FIELD_PSSYSBDINSTCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDInstCfgIdDirty(){
        if(this.contains(FIELD_PSSYSBDINSTCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据源
     */
    @JsonIgnore
    public void resetPSSysBDInstCfgId(){
        this.reset(FIELD_PSSYSBDINSTCFGID);
    }

    /**
     * 设置 大数据源，详细说明：{@link #FIELD_PSSYSBDINSTCFGID}
     * <P>
     * 等同 {@link #setPSSysBDInstCfgId}
     * @param pSSysBDInstCfgId
     */
    @JsonIgnore
    public PSSystemRun pssysbdinstcfgid(String pSSysBDInstCfgId){
        this.setPSSysBDInstCfgId(pSSysBDInstCfgId);
        return this;
    }

    /**
     * 设置 大数据源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDInstCfgId}
     * @param pSSysBDInstCfg 引用对象
     */
    @JsonIgnore
    public PSSystemRun pssysbdinstcfgid(PSSysBDInstCfg pSSysBDInstCfg){
        if(pSSysBDInstCfg == null){
            this.setPSSysBDInstCfgId(null);
            this.setPSSysBDInstCfgName(null);
        }
        else{
            this.setPSSysBDInstCfgId(pSSysBDInstCfg.getPSSysBDInstCfgId());
            this.setPSSysBDInstCfgName(pSSysBDInstCfg.getPSSysBDInstCfgName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDINSTCFGNAME</B>&nbsp;大数据源，指定系统运行使用的大数据库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BDType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDINSTCFGID}
     */
    public final static String FIELD_PSSYSBDINSTCFGNAME = "pssysbdinstcfgname";

    /**
     * 设置 大数据源，详细说明：{@link #FIELD_PSSYSBDINSTCFGNAME}
     * 
     * @param pSSysBDInstCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDINSTCFGNAME)
    public void setPSSysBDInstCfgName(String pSSysBDInstCfgName){
        this.set(FIELD_PSSYSBDINSTCFGNAME, pSSysBDInstCfgName);
    }
    
    /**
     * 获取 大数据源  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDInstCfgName(){
        Object objValue = this.get(FIELD_PSSYSBDINSTCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDInstCfgNameDirty(){
        if(this.contains(FIELD_PSSYSBDINSTCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据源
     */
    @JsonIgnore
    public void resetPSSysBDInstCfgName(){
        this.reset(FIELD_PSSYSBDINSTCFGNAME);
    }

    /**
     * 设置 大数据源，详细说明：{@link #FIELD_PSSYSBDINSTCFGNAME}
     * <P>
     * 等同 {@link #setPSSysBDInstCfgName}
     * @param pSSysBDInstCfgName
     */
    @JsonIgnore
    public PSSystemRun pssysbdinstcfgname(String pSSysBDInstCfgName){
        this.setPSSysBDInstCfgName(pSSysBDInstCfgName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系，指定系统运行的后台体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPub} 
     */
    public final static String FIELD_PSSYSSFPUBID = "pssyssfpubid";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBID}
     * 
     * @param pSSysSFPubId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBID)
    public void setPSSysSFPubId(String pSSysSFPubId){
        this.set(FIELD_PSSYSSFPUBID, pSSysSFPubId);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubId(){
        Object objValue = this.get(FIELD_PSSYSSFPUBID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubIdDirty(){
        if(this.contains(FIELD_PSSYSSFPUBID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubId(){
        this.reset(FIELD_PSSYSSFPUBID);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBID}
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPubId
     */
    @JsonIgnore
    public PSSystemRun pssyssfpubid(String pSSysSFPubId){
        this.setPSSysSFPubId(pSSysSFPubId);
        return this;
    }

    /**
     * 设置 后台体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPubId}
     * @param pSSysSFPub 引用对象
     */
    @JsonIgnore
    public PSSystemRun pssyssfpubid(PSSysSFPub pSSysSFPub){
        if(pSSysSFPub == null){
            this.setPSSysSFPubId(null);
            this.setPSSysSFPubName(null);
        }
        else{
            this.setPSSysSFPubId(pSSysSFPub.getPSSysSFPubId());
            this.setPSSysSFPubName(pSSysSFPub.getPSSysSFPubName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系，指定系统运行的后台体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPUBID}
     */
    public final static String FIELD_PSSYSSFPUBNAME = "pssyssfpubname";

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * 
     * @param pSSysSFPubName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBNAME)
    public void setPSSysSFPubName(String pSSysSFPubName){
        this.set(FIELD_PSSYSSFPUBNAME, pSSysSFPubName);
    }
    
    /**
     * 获取 后台体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubName(){
        Object objValue = this.get(FIELD_PSSYSSFPUBNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubNameDirty(){
        if(this.contains(FIELD_PSSYSSFPUBNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系
     */
    @JsonIgnore
    public void resetPSSysSFPubName(){
        this.reset(FIELD_PSSYSSFPUBNAME);
    }

    /**
     * 设置 后台体系，详细说明：{@link #FIELD_PSSYSSFPUBNAME}
     * <P>
     * 等同 {@link #setPSSysSFPubName}
     * @param pSSysSFPubName
     */
    @JsonIgnore
    public PSSystemRun pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    /**
     * <B>PSSYSTEMASID</B>&nbsp;系统应用服务器，指定系统运行使用的应用容器
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTEMASID = "pssystemasid";

    /**
     * 设置 系统应用服务器，详细说明：{@link #FIELD_PSSYSTEMASID}
     * 
     * @param pSSystemASId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMASID)
    public void setPSSystemASId(String pSSystemASId){
        this.set(FIELD_PSSYSTEMASID, pSSystemASId);
    }
    
    /**
     * 获取 系统应用服务器  
     * @return
     */
    @JsonIgnore
    public String getPSSystemASId(){
        Object objValue = this.get(FIELD_PSSYSTEMASID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemASIdDirty(){
        if(this.contains(FIELD_PSSYSTEMASID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用服务器
     */
    @JsonIgnore
    public void resetPSSystemASId(){
        this.reset(FIELD_PSSYSTEMASID);
    }

    /**
     * 设置 系统应用服务器，详细说明：{@link #FIELD_PSSYSTEMASID}
     * <P>
     * 等同 {@link #setPSSystemASId}
     * @param pSSystemASId
     */
    @JsonIgnore
    public PSSystemRun pssystemasid(String pSSystemASId){
        this.setPSSystemASId(pSSystemASId);
        return this;
    }

    /**
     * <B>PSSYSTEMASNAME</B>&nbsp;应用服务器，指定系统运行使用的应用容器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTEMASID}
     */
    public final static String FIELD_PSSYSTEMASNAME = "pssystemasname";

    /**
     * 设置 应用服务器，详细说明：{@link #FIELD_PSSYSTEMASNAME}
     * 
     * @param pSSystemASName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMASNAME)
    public void setPSSystemASName(String pSSystemASName){
        this.set(FIELD_PSSYSTEMASNAME, pSSystemASName);
    }
    
    /**
     * 获取 应用服务器  
     * @return
     */
    @JsonIgnore
    public String getPSSystemASName(){
        Object objValue = this.get(FIELD_PSSYSTEMASNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemASNameDirty(){
        if(this.contains(FIELD_PSSYSTEMASNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用服务器
     */
    @JsonIgnore
    public void resetPSSystemASName(){
        this.reset(FIELD_PSSYSTEMASNAME);
    }

    /**
     * 设置 应用服务器，详细说明：{@link #FIELD_PSSYSTEMASNAME}
     * <P>
     * 等同 {@link #setPSSystemASName}
     * @param pSSystemASName
     */
    @JsonIgnore
    public PSSystemRun pssystemasname(String pSSystemASName){
        this.setPSSystemASName(pSSystemASName);
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGID</B>&nbsp;运行数据库，指定系统运行使用的关系数据库
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSystemDBCfg} 
     */
    public final static String FIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";

    /**
     * 设置 运行数据库，详细说明：{@link #FIELD_PSSYSTEMDBCFGID}
     * 
     * @param pSSystemDBCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGID)
    public void setPSSystemDBCfgId(String pSSystemDBCfgId){
        this.set(FIELD_PSSYSTEMDBCFGID, pSSystemDBCfgId);
    }
    
    /**
     * 获取 运行数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgId(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgIdDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行数据库
     */
    @JsonIgnore
    public void resetPSSystemDBCfgId(){
        this.reset(FIELD_PSSYSTEMDBCFGID);
    }

    /**
     * 设置 运行数据库，详细说明：{@link #FIELD_PSSYSTEMDBCFGID}
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfgId
     */
    @JsonIgnore
    public PSSystemRun pssystemdbcfgid(String pSSystemDBCfgId){
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    /**
     * 设置 运行数据库，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfg 引用对象
     */
    @JsonIgnore
    public PSSystemRun pssystemdbcfgid(PSSystemDBCfg pSSystemDBCfg){
        if(pSSystemDBCfg == null){
            this.setPSSystemDBCfgId(null);
            this.setPSSystemDBCfgName(null);
        }
        else{
            this.setPSSystemDBCfgId(pSSystemDBCfg.getPSSystemDBCfgId());
            this.setPSSystemDBCfgName(pSSystemDBCfg.getPSSystemDBCfgName());
        }
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGNAME</B>&nbsp;运行数据库，指定系统运行使用的关系数据库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTEMDBCFGID}
     */
    public final static String FIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";

    /**
     * 设置 运行数据库，详细说明：{@link #FIELD_PSSYSTEMDBCFGNAME}
     * 
     * @param pSSystemDBCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGNAME)
    public void setPSSystemDBCfgName(String pSSystemDBCfgName){
        this.set(FIELD_PSSYSTEMDBCFGNAME, pSSystemDBCfgName);
    }
    
    /**
     * 获取 运行数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgName(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgNameDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行数据库
     */
    @JsonIgnore
    public void resetPSSystemDBCfgName(){
        this.reset(FIELD_PSSYSTEMDBCFGNAME);
    }

    /**
     * 设置 运行数据库，详细说明：{@link #FIELD_PSSYSTEMDBCFGNAME}
     * <P>
     * 等同 {@link #setPSSystemDBCfgName}
     * @param pSSystemDBCfgName
     */
    @JsonIgnore
    public PSSystemRun pssystemdbcfgname(String pSSystemDBCfgName){
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    /**
     * <B>PSSYSTEMRUNID</B>&nbsp;系统运行标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTEMRUNID = "pssystemrunid";

    /**
     * 设置 系统运行标识
     * 
     * @param pSSystemRunId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMRUNID)
    public void setPSSystemRunId(String pSSystemRunId){
        this.set(FIELD_PSSYSTEMRUNID, pSSystemRunId);
    }
    
    /**
     * 获取 系统运行标识  
     * @return
     */
    @JsonIgnore
    public String getPSSystemRunId(){
        Object objValue = this.get(FIELD_PSSYSTEMRUNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统运行标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemRunIdDirty(){
        if(this.contains(FIELD_PSSYSTEMRUNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统运行标识
     */
    @JsonIgnore
    public void resetPSSystemRunId(){
        this.reset(FIELD_PSSYSTEMRUNID);
    }

    /**
     * 设置 系统运行标识
     * <P>
     * 等同 {@link #setPSSystemRunId}
     * @param pSSystemRunId
     */
    @JsonIgnore
    public PSSystemRun pssystemrunid(String pSSystemRunId){
        this.setPSSystemRunId(pSSystemRunId);
        return this;
    }

    /**
     * <B>PSSYSTEMRUNNAME</B>&nbsp;运行名称，指定系统运行的名称，需在所属系统中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSTEMRUNNAME = "pssystemrunname";

    /**
     * 设置 运行名称，详细说明：{@link #FIELD_PSSYSTEMRUNNAME}
     * 
     * @param pSSystemRunName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMRUNNAME)
    public void setPSSystemRunName(String pSSystemRunName){
        this.set(FIELD_PSSYSTEMRUNNAME, pSSystemRunName);
    }
    
    /**
     * 获取 运行名称  
     * @return
     */
    @JsonIgnore
    public String getPSSystemRunName(){
        Object objValue = this.get(FIELD_PSSYSTEMRUNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemRunNameDirty(){
        if(this.contains(FIELD_PSSYSTEMRUNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行名称
     */
    @JsonIgnore
    public void resetPSSystemRunName(){
        this.reset(FIELD_PSSYSTEMRUNNAME);
    }

    /**
     * 设置 运行名称，详细说明：{@link #FIELD_PSSYSTEMRUNNAME}
     * <P>
     * 等同 {@link #setPSSystemRunName}
     * @param pSSystemRunName
     */
    @JsonIgnore
    public PSSystemRun pssystemrunname(String pSSystemRunName){
        this.setPSSystemRunName(pSSystemRunName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSystemRunName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSystemRunName(strName);
    }

    @JsonIgnore
    public PSSystemRun name(String strName){
        this.setPSSystemRunName(strName);
        return this;
    }

    /**
     * <B>RUNPSSYSDYNAMODELID</B>&nbsp;运行动态模型，指定系统运行的动态运行配置模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_RUNPSSYSDYNAMODELID = "runpssysdynamodelid";

    /**
     * 设置 运行动态模型，详细说明：{@link #FIELD_RUNPSSYSDYNAMODELID}
     * 
     * @param runPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_RUNPSSYSDYNAMODELID)
    public void setRunPSSysDynaModelId(String runPSSysDynaModelId){
        this.set(FIELD_RUNPSSYSDYNAMODELID, runPSSysDynaModelId);
    }
    
    /**
     * 获取 运行动态模型  
     * @return
     */
    @JsonIgnore
    public String getRunPSSysDynaModelId(){
        Object objValue = this.get(FIELD_RUNPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_RUNPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行动态模型
     */
    @JsonIgnore
    public void resetRunPSSysDynaModelId(){
        this.reset(FIELD_RUNPSSYSDYNAMODELID);
    }

    /**
     * 设置 运行动态模型，详细说明：{@link #FIELD_RUNPSSYSDYNAMODELID}
     * <P>
     * 等同 {@link #setRunPSSysDynaModelId}
     * @param runPSSysDynaModelId
     */
    @JsonIgnore
    public PSSystemRun runpssysdynamodelid(String runPSSysDynaModelId){
        this.setRunPSSysDynaModelId(runPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 运行动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRunPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSystemRun runpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setRunPSSysDynaModelId(null);
            this.setRunPSSysDynaModelName(null);
        }
        else{
            this.setRunPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRunPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>RUNPSSYSDYNAMODELNAME</B>&nbsp;运行动态模型，指定系统运行的动态运行配置模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RUNPSSYSDYNAMODELID}
     */
    public final static String FIELD_RUNPSSYSDYNAMODELNAME = "runpssysdynamodelname";

    /**
     * 设置 运行动态模型，详细说明：{@link #FIELD_RUNPSSYSDYNAMODELNAME}
     * 
     * @param runPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_RUNPSSYSDYNAMODELNAME)
    public void setRunPSSysDynaModelName(String runPSSysDynaModelName){
        this.set(FIELD_RUNPSSYSDYNAMODELNAME, runPSSysDynaModelName);
    }
    
    /**
     * 获取 运行动态模型  
     * @return
     */
    @JsonIgnore
    public String getRunPSSysDynaModelName(){
        Object objValue = this.get(FIELD_RUNPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRunPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_RUNPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行动态模型
     */
    @JsonIgnore
    public void resetRunPSSysDynaModelName(){
        this.reset(FIELD_RUNPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 运行动态模型，详细说明：{@link #FIELD_RUNPSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setRunPSSysDynaModelName}
     * @param runPSSysDynaModelName
     */
    @JsonIgnore
    public PSSystemRun runpssysdynamodelname(String runPSSysDynaModelName){
        this.setRunPSSysDynaModelName(runPSSysDynaModelName);
        return this;
    }

    /**
     * <B>STOPWHENTEMPLERROR</B>&nbsp;模板出错时终止，指定系统运行在模板出错时终止发布
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STOPWHENTEMPLERROR = "stopwhentemplerror";

    /**
     * 设置 模板出错时终止，详细说明：{@link #FIELD_STOPWHENTEMPLERROR}
     * 
     * @param stopWhenTemplError
     * 
     */
    @JsonProperty(FIELD_STOPWHENTEMPLERROR)
    public void setStopWhenTemplError(Integer stopWhenTemplError){
        this.set(FIELD_STOPWHENTEMPLERROR, stopWhenTemplError);
    }
    
    /**
     * 获取 模板出错时终止  
     * @return
     */
    @JsonIgnore
    public Integer getStopWhenTemplError(){
        Object objValue = this.get(FIELD_STOPWHENTEMPLERROR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模板出错时终止 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStopWhenTemplErrorDirty(){
        if(this.contains(FIELD_STOPWHENTEMPLERROR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板出错时终止
     */
    @JsonIgnore
    public void resetStopWhenTemplError(){
        this.reset(FIELD_STOPWHENTEMPLERROR);
    }

    /**
     * 设置 模板出错时终止，详细说明：{@link #FIELD_STOPWHENTEMPLERROR}
     * <P>
     * 等同 {@link #setStopWhenTemplError}
     * @param stopWhenTemplError
     */
    @JsonIgnore
    public PSSystemRun stopwhentemplerror(Integer stopWhenTemplError){
        this.setStopWhenTemplError(stopWhenTemplError);
        return this;
    }

     /**
     * 设置 模板出错时终止，详细说明：{@link #FIELD_STOPWHENTEMPLERROR}
     * <P>
     * 等同 {@link #setStopWhenTemplError}
     * @param stopWhenTemplError
     */
    @JsonIgnore
    public PSSystemRun stopwhentemplerror(Boolean stopWhenTemplError){
        if(stopWhenTemplError == null){
            this.setStopWhenTemplError(null);
        }
        else{
            this.setStopWhenTemplError(stopWhenTemplError?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSystemRun updatedate(String updateDate){
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
    public PSSystemRun updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSystemRunId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSystemRunId(strValue);
    }

    @JsonIgnore
    public PSSystemRun id(String strValue){
        this.setPSSystemRunId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSystemRun){
            PSSystemRun model = (PSSystemRun)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
