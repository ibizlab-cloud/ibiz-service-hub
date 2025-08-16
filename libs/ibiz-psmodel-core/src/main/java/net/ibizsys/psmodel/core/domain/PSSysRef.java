package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSREF</B>系统引用 模型传输对象
 * <P>
 * 系统引用模型，定义当前系统对其它开发系统或平台子系统的引用信息
 */
public class PSSysRef extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysRef(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CLSPKGPARAMS</B>&nbsp;类包参数，指定系统引用的类包参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CLSPKGPARAMS = "clspkgparams";

    /**
     * 设置 类包参数，详细说明：{@link #FIELD_CLSPKGPARAMS}
     * 
     * @param clsPkgParams
     * 
     */
    @JsonProperty(FIELD_CLSPKGPARAMS)
    public void setClsPkgParams(String clsPkgParams){
        this.set(FIELD_CLSPKGPARAMS, clsPkgParams);
    }
    
    /**
     * 获取 类包参数  
     * @return
     */
    @JsonIgnore
    public String getClsPkgParams(){
        Object objValue = this.get(FIELD_CLSPKGPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类包参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPkgParamsDirty(){
        if(this.contains(FIELD_CLSPKGPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类包参数
     */
    @JsonIgnore
    public void resetClsPkgParams(){
        this.reset(FIELD_CLSPKGPARAMS);
    }

    /**
     * 设置 类包参数，详细说明：{@link #FIELD_CLSPKGPARAMS}
     * <P>
     * 等同 {@link #setClsPkgParams}
     * @param clsPkgParams
     */
    @JsonIgnore
    public PSSysRef clspkgparams(String clsPkgParams){
        this.setClsPkgParams(clsPkgParams);
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
    public PSSysRef createdate(String createDate){
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
    public PSSysRef createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DCDOMAINNAME</B>&nbsp;应用中心短域名
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DCDOMAINNAME = "dcdomainname";

    /**
     * 设置 应用中心短域名
     * 
     * @param dCDomainName
     * 
     */
    @JsonProperty(FIELD_DCDOMAINNAME)
    public void setDCDomainName(String dCDomainName){
        this.set(FIELD_DCDOMAINNAME, dCDomainName);
    }
    
    /**
     * 获取 应用中心短域名  
     * @return
     */
    @JsonIgnore
    public String getDCDomainName(){
        Object objValue = this.get(FIELD_DCDOMAINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心短域名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDCDomainNameDirty(){
        if(this.contains(FIELD_DCDOMAINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心短域名
     */
    @JsonIgnore
    public void resetDCDomainName(){
        this.reset(FIELD_DCDOMAINNAME);
    }

    /**
     * 设置 应用中心短域名
     * <P>
     * 等同 {@link #setDCDomainName}
     * @param dCDomainName
     */
    @JsonIgnore
    public PSSysRef dcdomainname(String dCDomainName){
        this.setDCDomainName(dCDomainName);
        return this;
    }

    /**
     * <B>DEVSLNCODENAME</B>&nbsp;开发方案代码标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DEVSLNCODENAME = "devslncodename";

    /**
     * 设置 开发方案代码标识
     * 
     * @param devSlnCodeName
     * 
     */
    @JsonProperty(FIELD_DEVSLNCODENAME)
    public void setDevSlnCodeName(String devSlnCodeName){
        this.set(FIELD_DEVSLNCODENAME, devSlnCodeName);
    }
    
    /**
     * 获取 开发方案代码标识  
     * @return
     */
    @JsonIgnore
    public String getDevSlnCodeName(){
        Object objValue = this.get(FIELD_DEVSLNCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDevSlnCodeNameDirty(){
        if(this.contains(FIELD_DEVSLNCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案代码标识
     */
    @JsonIgnore
    public void resetDevSlnCodeName(){
        this.reset(FIELD_DEVSLNCODENAME);
    }

    /**
     * 设置 开发方案代码标识
     * <P>
     * 等同 {@link #setDevSlnCodeName}
     * @param devSlnCodeName
     */
    @JsonIgnore
    public PSSysRef devslncodename(String devSlnCodeName){
        this.setDevSlnCodeName(devSlnCodeName);
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
    public PSSysRef memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;引用次序，指定系统引用的引用次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 引用次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 引用次序  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引用次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 引用次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysRef ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统，引用类型为【开发系统】时指定引用的开发方案系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统，详细说明：{@link #FIELD_PSDEVSLNSYSID}
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统，详细说明：{@link #FIELD_PSDEVSLNSYSID}
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSSysRef psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSNAME</B>&nbsp;开发系统，引用类型为【开发系统】时指定引用的开发方案系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNSYSNAME = "psdevslnsysname";

    /**
     * 设置 开发系统，详细说明：{@link #FIELD_PSDEVSLNSYSNAME}
     * 
     * @param pSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSNAME)
    public void setPSDevSlnSysName(String pSDevSlnSysName){
        this.set(FIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysName(){
        this.reset(FIELD_PSDEVSLNSYSNAME);
    }

    /**
     * 设置 开发系统，详细说明：{@link #FIELD_PSDEVSLNSYSNAME}
     * <P>
     * 等同 {@link #setPSDevSlnSysName}
     * @param pSDevSlnSysName
     */
    @JsonIgnore
    public PSSysRef psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSSRVID</B>&nbsp;引用系统服务包，引用类型为【开发系统】时指定引用的开发系统服务包
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSSRVID = "psdevslnsyssrvid";

    /**
     * 设置 引用系统服务包，详细说明：{@link #FIELD_PSDEVSLNSYSSRVID}
     * 
     * @param pSDevSlnSysSrvId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSSRVID)
    public void setPSDevSlnSysSrvId(String pSDevSlnSysSrvId){
        this.set(FIELD_PSDEVSLNSYSSRVID, pSDevSlnSysSrvId);
    }
    
    /**
     * 获取 引用系统服务包  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysSrvId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSSRVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用系统服务包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysSrvIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSSRVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统服务包
     */
    @JsonIgnore
    public void resetPSDevSlnSysSrvId(){
        this.reset(FIELD_PSDEVSLNSYSSRVID);
    }

    /**
     * 设置 引用系统服务包，详细说明：{@link #FIELD_PSDEVSLNSYSSRVID}
     * <P>
     * 等同 {@link #setPSDevSlnSysSrvId}
     * @param pSDevSlnSysSrvId
     */
    @JsonIgnore
    public PSSysRef psdevslnsyssrvid(String pSDevSlnSysSrvId){
        this.setPSDevSlnSysSrvId(pSDevSlnSysSrvId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSSRVNAME</B>&nbsp;引用系统服务包，引用类型为【开发系统】时指定引用的开发系统服务包
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSSRVID}
     */
    public final static String FIELD_PSDEVSLNSYSSRVNAME = "psdevslnsyssrvname";

    /**
     * 设置 引用系统服务包，详细说明：{@link #FIELD_PSDEVSLNSYSSRVNAME}
     * 
     * @param pSDevSlnSysSrvName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSSRVNAME)
    public void setPSDevSlnSysSrvName(String pSDevSlnSysSrvName){
        this.set(FIELD_PSDEVSLNSYSSRVNAME, pSDevSlnSysSrvName);
    }
    
    /**
     * 获取 引用系统服务包  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysSrvName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSSRVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用系统服务包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysSrvNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSSRVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统服务包
     */
    @JsonIgnore
    public void resetPSDevSlnSysSrvName(){
        this.reset(FIELD_PSDEVSLNSYSSRVNAME);
    }

    /**
     * 设置 引用系统服务包，详细说明：{@link #FIELD_PSDEVSLNSYSSRVNAME}
     * <P>
     * 等同 {@link #setPSDevSlnSysSrvName}
     * @param pSDevSlnSysSrvName
     */
    @JsonIgnore
    public PSSysRef psdevslnsyssrvname(String pSDevSlnSysSrvName){
        this.setPSDevSlnSysSrvName(pSDevSlnSysSrvName);
        return this;
    }

    /**
     * <B>PSSUBSYSID</B>&nbsp;平台子系统，引用类型为【平台子系统】时指定引用的平台子系统
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBSYSID = "pssubsysid";

    /**
     * 设置 平台子系统，详细说明：{@link #FIELD_PSSUBSYSID}
     * 
     * @param pSSubSysId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSID)
    public void setPSSubSysId(String pSSubSysId){
        this.set(FIELD_PSSUBSYSID, pSSubSysId);
    }
    
    /**
     * 获取 平台子系统  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysId(){
        Object objValue = this.get(FIELD_PSSUBSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台子系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysIdDirty(){
        if(this.contains(FIELD_PSSUBSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台子系统
     */
    @JsonIgnore
    public void resetPSSubSysId(){
        this.reset(FIELD_PSSUBSYSID);
    }

    /**
     * 设置 平台子系统，详细说明：{@link #FIELD_PSSUBSYSID}
     * <P>
     * 等同 {@link #setPSSubSysId}
     * @param pSSubSysId
     */
    @JsonIgnore
    public PSSysRef pssubsysid(String pSSubSysId){
        this.setPSSubSysId(pSSubSysId);
        return this;
    }

    /**
     * <B>PSSUBSYSNAME</B>&nbsp;平台子系统，引用类型为【平台子系统】时指定引用的平台子系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSID}
     */
    public final static String FIELD_PSSUBSYSNAME = "pssubsysname";

    /**
     * 设置 平台子系统，详细说明：{@link #FIELD_PSSUBSYSNAME}
     * 
     * @param pSSubSysName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSNAME)
    public void setPSSubSysName(String pSSubSysName){
        this.set(FIELD_PSSUBSYSNAME, pSSubSysName);
    }
    
    /**
     * 获取 平台子系统  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysName(){
        Object objValue = this.get(FIELD_PSSUBSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台子系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysNameDirty(){
        if(this.contains(FIELD_PSSUBSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台子系统
     */
    @JsonIgnore
    public void resetPSSubSysName(){
        this.reset(FIELD_PSSUBSYSNAME);
    }

    /**
     * 设置 平台子系统，详细说明：{@link #FIELD_PSSUBSYSNAME}
     * <P>
     * 等同 {@link #setPSSubSysName}
     * @param pSSubSysName
     */
    @JsonIgnore
    public PSSysRef pssubsysname(String pSSubSysName){
        this.setPSSubSysName(pSSubSysName);
        return this;
    }

    /**
     * <B>PSSYSREFID</B>&nbsp;系统引用标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSREFID = "pssysrefid";

    /**
     * 设置 系统引用标识
     * 
     * @param pSSysRefId
     * 
     */
    @JsonProperty(FIELD_PSSYSREFID)
    public void setPSSysRefId(String pSSysRefId){
        this.set(FIELD_PSSYSREFID, pSSysRefId);
    }
    
    /**
     * 获取 系统引用标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysRefId(){
        Object objValue = this.get(FIELD_PSSYSREFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统引用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRefIdDirty(){
        if(this.contains(FIELD_PSSYSREFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统引用标识
     */
    @JsonIgnore
    public void resetPSSysRefId(){
        this.reset(FIELD_PSSYSREFID);
    }

    /**
     * 设置 系统引用标识
     * <P>
     * 等同 {@link #setPSSysRefId}
     * @param pSSysRefId
     */
    @JsonIgnore
    public PSSysRef pssysrefid(String pSSysRefId){
        this.setPSSysRefId(pSSysRefId);
        return this;
    }

    /**
     * <B>PSSYSREFNAME</B>&nbsp;引用名称，指定系统引用的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSREFNAME = "pssysrefname";

    /**
     * 设置 引用名称，详细说明：{@link #FIELD_PSSYSREFNAME}
     * 
     * @param pSSysRefName
     * 
     */
    @JsonProperty(FIELD_PSSYSREFNAME)
    public void setPSSysRefName(String pSSysRefName){
        this.set(FIELD_PSSYSREFNAME, pSSysRefName);
    }
    
    /**
     * 获取 引用名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysRefName(){
        Object objValue = this.get(FIELD_PSSYSREFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysRefNameDirty(){
        if(this.contains(FIELD_PSSYSREFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用名称
     */
    @JsonIgnore
    public void resetPSSysRefName(){
        this.reset(FIELD_PSSYSREFNAME);
    }

    /**
     * 设置 引用名称，详细说明：{@link #FIELD_PSSYSREFNAME}
     * <P>
     * 等同 {@link #setPSSysRefName}
     * @param pSSysRefName
     */
    @JsonIgnore
    public PSSysRef pssysrefname(String pSSysRefName){
        this.setPSSysRefName(pSSysRefName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysRefName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysRefName(strName);
    }

    @JsonIgnore
    public PSSysRef name(String strName){
        this.setPSSysRefName(strName);
        return this;
    }

    /**
     * <B>REALSYSID</B>&nbsp;引用系统标记，指定引用系统的标记
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DevSysRefMode2} 
     */
    public final static String FIELD_REALSYSID = "realsysid";

    /**
     * 设置 引用系统标记，详细说明：{@link #FIELD_REALSYSID}
     * 
     * @param realSysId
     * 
     */
    @JsonProperty(FIELD_REALSYSID)
    public void setRealSysId(String realSysId){
        this.set(FIELD_REALSYSID, realSysId);
    }
    
    /**
     * 获取 引用系统标记  
     * @return
     */
    @JsonIgnore
    public String getRealSysId(){
        Object objValue = this.get(FIELD_REALSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用系统标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRealSysIdDirty(){
        if(this.contains(FIELD_REALSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统标记
     */
    @JsonIgnore
    public void resetRealSysId(){
        this.reset(FIELD_REALSYSID);
    }

    /**
     * 设置 引用系统标记，详细说明：{@link #FIELD_REALSYSID}
     * <P>
     * 等同 {@link #setRealSysId}
     * @param realSysId
     */
    @JsonIgnore
    public PSSysRef realsysid(String realSysId){
        this.setRealSysId(realSysId);
        return this;
    }

    /**
     * <B>REFPARAM</B>&nbsp;引用参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_REFPARAM = "refparam";

    /**
     * 设置 引用参数
     * 
     * @param refParam
     * 
     */
    @JsonProperty(FIELD_REFPARAM)
    public void setRefParam(String refParam){
        this.set(FIELD_REFPARAM, refParam);
    }
    
    /**
     * 获取 引用参数  
     * @return
     */
    @JsonIgnore
    public String getRefParam(){
        Object objValue = this.get(FIELD_REFPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefParamDirty(){
        if(this.contains(FIELD_REFPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用参数
     */
    @JsonIgnore
    public void resetRefParam(){
        this.reset(FIELD_REFPARAM);
    }

    /**
     * 设置 引用参数
     * <P>
     * 等同 {@link #setRefParam}
     * @param refParam
     */
    @JsonIgnore
    public PSSysRef refparam(String refParam){
        this.setRefParam(refParam);
        return this;
    }

    /**
     * <B>REFPARAM2</B>&nbsp;引用参数2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_REFPARAM2 = "refparam2";

    /**
     * 设置 引用参数2
     * 
     * @param refParam2
     * 
     */
    @JsonProperty(FIELD_REFPARAM2)
    public void setRefParam2(String refParam2){
        this.set(FIELD_REFPARAM2, refParam2);
    }
    
    /**
     * 获取 引用参数2  
     * @return
     */
    @JsonIgnore
    public String getRefParam2(){
        Object objValue = this.get(FIELD_REFPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefParam2Dirty(){
        if(this.contains(FIELD_REFPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用参数2
     */
    @JsonIgnore
    public void resetRefParam2(){
        this.reset(FIELD_REFPARAM2);
    }

    /**
     * 设置 引用参数2
     * <P>
     * 等同 {@link #setRefParam2}
     * @param refParam2
     */
    @JsonIgnore
    public PSSysRef refparam2(String refParam2){
        this.setRefParam2(refParam2);
        return this;
    }

    /**
     * <B>REFPARAMS</B>&nbsp;引用参数集合
     */
    public final static String FIELD_REFPARAMS = "refparams";

    /**
     * 设置 引用参数集合
     * 
     * @param refParams
     * 
     */
    @JsonProperty(FIELD_REFPARAMS)
    public void setRefParams(String refParams){
        this.set(FIELD_REFPARAMS, refParams);
    }
    
    /**
     * 获取 引用参数集合  
     * @return
     */
    @JsonIgnore
    public String getRefParams(){
        Object objValue = this.get(FIELD_REFPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用参数集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefParamsDirty(){
        if(this.contains(FIELD_REFPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用参数集合
     */
    @JsonIgnore
    public void resetRefParams(){
        this.reset(FIELD_REFPARAMS);
    }

    /**
     * 设置 引用参数集合
     * <P>
     * 等同 {@link #setRefParams}
     * @param refParams
     */
    @JsonIgnore
    public PSSysRef refparams(String refParams){
        this.setRefParams(refParams);
        return this;
    }

    /**
     * <B>SFFWFLAG</B>&nbsp;后台架构基础框架，指定是否为后台架构的基础运行包，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SFFWFLAG = "sffwflag";

    /**
     * 设置 后台架构基础框架，详细说明：{@link #FIELD_SFFWFLAG}
     * 
     * @param sFFWFlag
     * 
     */
    @JsonProperty(FIELD_SFFWFLAG)
    public void setSFFWFlag(Integer sFFWFlag){
        this.set(FIELD_SFFWFLAG, sFFWFlag);
    }
    
    /**
     * 获取 后台架构基础框架  
     * @return
     */
    @JsonIgnore
    public Integer getSFFWFlag(){
        Object objValue = this.get(FIELD_SFFWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 后台架构基础框架 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSFFWFlagDirty(){
        if(this.contains(FIELD_SFFWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台架构基础框架
     */
    @JsonIgnore
    public void resetSFFWFlag(){
        this.reset(FIELD_SFFWFLAG);
    }

    /**
     * 设置 后台架构基础框架，详细说明：{@link #FIELD_SFFWFLAG}
     * <P>
     * 等同 {@link #setSFFWFlag}
     * @param sFFWFlag
     */
    @JsonIgnore
    public PSSysRef sffwflag(Integer sFFWFlag){
        this.setSFFWFlag(sFFWFlag);
        return this;
    }

     /**
     * 设置 后台架构基础框架，详细说明：{@link #FIELD_SFFWFLAG}
     * <P>
     * 等同 {@link #setSFFWFlag}
     * @param sFFWFlag
     */
    @JsonIgnore
    public PSSysRef sffwflag(Boolean sFFWFlag){
        if(sFFWFlag == null){
            this.setSFFWFlag(null);
        }
        else{
            this.setSFFWFlag(sFFWFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SRVCODENAME</B>&nbsp;系统代码标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SRVCODENAME = "srvcodename";

    /**
     * 设置 系统代码标识
     * 
     * @param srvCodeName
     * 
     */
    @JsonProperty(FIELD_SRVCODENAME)
    public void setSrvCodeName(String srvCodeName){
        this.set(FIELD_SRVCODENAME, srvCodeName);
    }
    
    /**
     * 获取 系统代码标识  
     * @return
     */
    @JsonIgnore
    public String getSrvCodeName(){
        Object objValue = this.get(FIELD_SRVCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrvCodeNameDirty(){
        if(this.contains(FIELD_SRVCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码标识
     */
    @JsonIgnore
    public void resetSrvCodeName(){
        this.reset(FIELD_SRVCODENAME);
    }

    /**
     * 设置 系统代码标识
     * <P>
     * 等同 {@link #setSrvCodeName}
     * @param srvCodeName
     */
    @JsonIgnore
    public PSSysRef srvcodename(String srvCodeName){
        this.setSrvCodeName(srvCodeName);
        return this;
    }

    /**
     * <B>SYSCODENAME</B>&nbsp;系统代码标识
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_SYSCODENAME = "syscodename";

    /**
     * 设置 系统代码标识
     * 
     * @param sysCodeName
     * 
     */
    @JsonProperty(FIELD_SYSCODENAME)
    public void setSysCodeName(String sysCodeName){
        this.set(FIELD_SYSCODENAME, sysCodeName);
    }
    
    /**
     * 获取 系统代码标识  
     * @return
     */
    @JsonIgnore
    public String getSysCodeName(){
        Object objValue = this.get(FIELD_SYSCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysCodeNameDirty(){
        if(this.contains(FIELD_SYSCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码标识
     */
    @JsonIgnore
    public void resetSysCodeName(){
        this.reset(FIELD_SYSCODENAME);
    }

    /**
     * 设置 系统代码标识
     * <P>
     * 等同 {@link #setSysCodeName}
     * @param sysCodeName
     */
    @JsonIgnore
    public PSSysRef syscodename(String sysCodeName){
        this.setSysCodeName(sysCodeName);
        return this;
    }

    /**
     * <B>SYSNAME</B>&nbsp;系统名
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SYSNAME = "sysname";

    /**
     * 设置 系统名
     * 
     * @param sysName
     * 
     */
    @JsonProperty(FIELD_SYSNAME)
    public void setSysName(String sysName){
        this.set(FIELD_SYSNAME, sysName);
    }
    
    /**
     * 获取 系统名  
     * @return
     */
    @JsonIgnore
    public String getSysName(){
        Object objValue = this.get(FIELD_SYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysNameDirty(){
        if(this.contains(FIELD_SYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统名
     */
    @JsonIgnore
    public void resetSysName(){
        this.reset(FIELD_SYSNAME);
    }

    /**
     * 设置 系统名
     * <P>
     * 等同 {@link #setSysName}
     * @param sysName
     */
    @JsonIgnore
    public PSSysRef sysname(String sysName){
        this.setSysName(sysName);
        return this;
    }

    /**
     * <B>SYSPKGNAME</B>&nbsp;系统包名
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_SYSPKGNAME = "syspkgname";

    /**
     * 设置 系统包名
     * 
     * @param sysPkgName
     * 
     */
    @JsonProperty(FIELD_SYSPKGNAME)
    public void setSysPkgName(String sysPkgName){
        this.set(FIELD_SYSPKGNAME, sysPkgName);
    }
    
    /**
     * 获取 系统包名  
     * @return
     */
    @JsonIgnore
    public String getSysPkgName(){
        Object objValue = this.get(FIELD_SYSPKGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统包名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysPkgNameDirty(){
        if(this.contains(FIELD_SYSPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统包名
     */
    @JsonIgnore
    public void resetSysPkgName(){
        this.reset(FIELD_SYSPKGNAME);
    }

    /**
     * 设置 系统包名
     * <P>
     * 等同 {@link #setSysPkgName}
     * @param sysPkgName
     */
    @JsonIgnore
    public PSSysRef syspkgname(String sysPkgName){
        this.setSysPkgName(sysPkgName);
        return this;
    }

    /**
     * <B>SYSREFTYPE</B>&nbsp;引用类型，指定系统引用的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SysRefType} 
     */
    public final static String FIELD_SYSREFTYPE = "sysreftype";

    /**
     * 设置 引用类型，详细说明：{@link #FIELD_SYSREFTYPE}
     * 
     * @param sysRefType
     * 
     */
    @JsonProperty(FIELD_SYSREFTYPE)
    public void setSysRefType(String sysRefType){
        this.set(FIELD_SYSREFTYPE, sysRefType);
    }
    
    /**
     * 获取 引用类型  
     * @return
     */
    @JsonIgnore
    public String getSysRefType(){
        Object objValue = this.get(FIELD_SYSREFTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysRefTypeDirty(){
        if(this.contains(FIELD_SYSREFTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用类型
     */
    @JsonIgnore
    public void resetSysRefType(){
        this.reset(FIELD_SYSREFTYPE);
    }

    /**
     * 设置 引用类型，详细说明：{@link #FIELD_SYSREFTYPE}
     * <P>
     * 等同 {@link #setSysRefType}
     * @param sysRefType
     */
    @JsonIgnore
    public PSSysRef sysreftype(String sysRefType){
        this.setSysRefType(sysRefType);
        return this;
    }

     /**
     * 设置 引用类型，详细说明：{@link #FIELD_SYSREFTYPE}
     * <P>
     * 等同 {@link #setSysRefType}
     * @param sysRefType
     */
    @JsonIgnore
    public PSSysRef sysreftype(net.ibizsys.psmodel.core.util.PSModelEnums.SysRefType sysRefType){
        if(sysRefType == null){
            this.setSysRefType(null);
        }
        else{
            this.setSysRefType(sysRefType.value);
        }
        return this;
    }

    /**
     * <B>SYSVCNAME</B>&nbsp;系统版本名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SYSVCNAME = "sysvcname";

    /**
     * 设置 系统版本名称
     * 
     * @param sysVCName
     * 
     */
    @JsonProperty(FIELD_SYSVCNAME)
    public void setSysVCName(String sysVCName){
        this.set(FIELD_SYSVCNAME, sysVCName);
    }
    
    /**
     * 获取 系统版本名称  
     * @return
     */
    @JsonIgnore
    public String getSysVCName(){
        Object objValue = this.get(FIELD_SYSVCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统版本名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysVCNameDirty(){
        if(this.contains(FIELD_SYSVCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统版本名称
     */
    @JsonIgnore
    public void resetSysVCName(){
        this.reset(FIELD_SYSVCNAME);
    }

    /**
     * 设置 系统版本名称
     * <P>
     * 等同 {@link #setSysVCName}
     * @param sysVCName
     */
    @JsonIgnore
    public PSSysRef sysvcname(String sysVCName){
        this.setSysVCName(sysVCName);
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
    public PSSysRef updatedate(String updateDate){
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
    public PSSysRef updateman(String updateMan){
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
    public PSSysRef usercat(String userCat){
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
    public PSSysRef usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysRef usertag(String userTag){
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
    public PSSysRef usertag2(String userTag2){
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
    public PSSysRef usertag3(String userTag3){
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
    public PSSysRef usertag4(String userTag4){
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
    public PSSysRef validflag(Integer validFlag){
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
    public PSSysRef validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VERSION</B>&nbsp;引用系统版本
     */
    public final static String FIELD_VERSION = "version";

    /**
     * 设置 引用系统版本
     * 
     * @param version
     * 
     */
    @JsonProperty(FIELD_VERSION)
    public void setVersion(Integer version){
        this.set(FIELD_VERSION, version);
    }
    
    /**
     * 获取 引用系统版本  
     * @return
     */
    @JsonIgnore
    public Integer getVersion(){
        Object objValue = this.get(FIELD_VERSION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 引用系统版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVersionDirty(){
        if(this.contains(FIELD_VERSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用系统版本
     */
    @JsonIgnore
    public void resetVersion(){
        this.reset(FIELD_VERSION);
    }

    /**
     * 设置 引用系统版本
     * <P>
     * 等同 {@link #setVersion}
     * @param version
     */
    @JsonIgnore
    public PSSysRef version(Integer version){
        this.setVersion(version);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysRefId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysRefId(strValue);
    }

    @JsonIgnore
    public PSSysRef id(String strValue){
        this.setPSSysRefId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysRef){
            PSSysRef model = (PSSysRef)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
