package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPPKG</B>应用组件包 模型传输对象
 * <P>
 * 前端应用组件包模型，定义前端应用额外加载的组件包
 */
public class PSAppPkgDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSAppPkgDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用组件包的代码标识，需在所属前端应用中具备唯一性
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
    public PSAppPkgDTO codename(String codeName){
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
    public PSAppPkgDTO createdate(Timestamp createDate){
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
    public PSAppPkgDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSAppPkgDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定应用组件包的加载次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
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
     * 判断 排序值 是否指定值，包括空值
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
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSAppPkgDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PKGPARAM</B>&nbsp;包参数，指定应用组件包的参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_PKGPARAM = "pkgparam";

    /**
     * 设置 包参数，详细说明：{@link #FIELD_PKGPARAM}
     * 
     * @param pkgParam
     * 
     */
    @JsonProperty(FIELD_PKGPARAM)
    public void setPkgParam(String pkgParam){
        this.set(FIELD_PKGPARAM, pkgParam);
    }
    
    /**
     * 获取 包参数  
     * @return
     */
    @JsonIgnore
    public String getPkgParam(){
        Object objValue = this.get(FIELD_PKGPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 包参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPkgParamDirty(){
        if(this.contains(FIELD_PKGPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包参数
     */
    @JsonIgnore
    public void resetPkgParam(){
        this.reset(FIELD_PKGPARAM);
    }

    /**
     * 设置 包参数，详细说明：{@link #FIELD_PKGPARAM}
     * <P>
     * 等同 {@link #setPkgParam}
     * @param pkgParam
     */
    @JsonIgnore
    public PSAppPkgDTO pkgparam(String pkgParam){
        this.setPkgParam(pkgParam);
        return this;
    }

    /**
     * <B>PKGPARAM2</B>&nbsp;包参数2，指定应用组件包的参数2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_PKGPARAM2 = "pkgparam2";

    /**
     * 设置 包参数2，详细说明：{@link #FIELD_PKGPARAM2}
     * 
     * @param pkgParam2
     * 
     */
    @JsonProperty(FIELD_PKGPARAM2)
    public void setPkgParam2(String pkgParam2){
        this.set(FIELD_PKGPARAM2, pkgParam2);
    }
    
    /**
     * 获取 包参数2  
     * @return
     */
    @JsonIgnore
    public String getPkgParam2(){
        Object objValue = this.get(FIELD_PKGPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 包参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPkgParam2Dirty(){
        if(this.contains(FIELD_PKGPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包参数2
     */
    @JsonIgnore
    public void resetPkgParam2(){
        this.reset(FIELD_PKGPARAM2);
    }

    /**
     * 设置 包参数2，详细说明：{@link #FIELD_PKGPARAM2}
     * <P>
     * 等同 {@link #setPkgParam2}
     * @param pkgParam2
     */
    @JsonIgnore
    public PSAppPkgDTO pkgparam2(String pkgParam2){
        this.setPkgParam2(pkgParam2);
        return this;
    }

    /**
     * <B>PKGPARAM3</B>&nbsp;包参数3，指定应用组件包的参数3
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_PKGPARAM3 = "pkgparam3";

    /**
     * 设置 包参数3，详细说明：{@link #FIELD_PKGPARAM3}
     * 
     * @param pkgParam3
     * 
     */
    @JsonProperty(FIELD_PKGPARAM3)
    public void setPkgParam3(String pkgParam3){
        this.set(FIELD_PKGPARAM3, pkgParam3);
    }
    
    /**
     * 获取 包参数3  
     * @return
     */
    @JsonIgnore
    public String getPkgParam3(){
        Object objValue = this.get(FIELD_PKGPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 包参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPkgParam3Dirty(){
        if(this.contains(FIELD_PKGPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包参数3
     */
    @JsonIgnore
    public void resetPkgParam3(){
        this.reset(FIELD_PKGPARAM3);
    }

    /**
     * 设置 包参数3，详细说明：{@link #FIELD_PKGPARAM3}
     * <P>
     * 等同 {@link #setPkgParam3}
     * @param pkgParam3
     */
    @JsonIgnore
    public PSAppPkgDTO pkgparam3(String pkgParam3){
        this.setPkgParam3(pkgParam3);
        return this;
    }

    /**
     * <B>PKGPARAM4</B>&nbsp;包参数4，指定应用组件包的参数4
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_PKGPARAM4 = "pkgparam4";

    /**
     * 设置 包参数4，详细说明：{@link #FIELD_PKGPARAM4}
     * 
     * @param pkgParam4
     * 
     */
    @JsonProperty(FIELD_PKGPARAM4)
    public void setPkgParam4(String pkgParam4){
        this.set(FIELD_PKGPARAM4, pkgParam4);
    }
    
    /**
     * 获取 包参数4  
     * @return
     */
    @JsonIgnore
    public String getPkgParam4(){
        Object objValue = this.get(FIELD_PKGPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 包参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPkgParam4Dirty(){
        if(this.contains(FIELD_PKGPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包参数4
     */
    @JsonIgnore
    public void resetPkgParam4(){
        this.reset(FIELD_PKGPARAM4);
    }

    /**
     * 设置 包参数4，详细说明：{@link #FIELD_PKGPARAM4}
     * <P>
     * 等同 {@link #setPkgParam4}
     * @param pkgParam4
     */
    @JsonIgnore
    public PSAppPkgDTO pkgparam4(String pkgParam4){
        this.setPkgParam4(pkgParam4);
        return this;
    }

    /**
     * <B>PSAPPPKGID</B>&nbsp;系统应用组件包标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPPKGID = "psapppkgid";

    /**
     * 设置 系统应用组件包标识
     * 
     * @param pSAppPkgId
     * 
     */
    @JsonProperty(FIELD_PSAPPPKGID)
    public void setPSAppPkgId(String pSAppPkgId){
        this.set(FIELD_PSAPPPKGID, pSAppPkgId);
    }
    
    /**
     * 获取 系统应用组件包标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPkgId(){
        Object objValue = this.get(FIELD_PSAPPPKGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用组件包标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPkgIdDirty(){
        if(this.contains(FIELD_PSAPPPKGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用组件包标识
     */
    @JsonIgnore
    public void resetPSAppPkgId(){
        this.reset(FIELD_PSAPPPKGID);
    }

    /**
     * 设置 系统应用组件包标识
     * <P>
     * 等同 {@link #setPSAppPkgId}
     * @param pSAppPkgId
     */
    @JsonIgnore
    public PSAppPkgDTO psapppkgid(String pSAppPkgId){
        this.setPSAppPkgId(pSAppPkgId);
        return this;
    }

    /**
     * <B>PSAPPPKGNAME</B>&nbsp;组件包名称，指定应用组件包的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPPKGNAME = "psapppkgname";

    /**
     * 设置 组件包名称，详细说明：{@link #FIELD_PSAPPPKGNAME}
     * 
     * @param pSAppPkgName
     * 
     */
    @JsonProperty(FIELD_PSAPPPKGNAME)
    public void setPSAppPkgName(String pSAppPkgName){
        this.set(FIELD_PSAPPPKGNAME, pSAppPkgName);
    }
    
    /**
     * 获取 组件包名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppPkgName(){
        Object objValue = this.get(FIELD_PSAPPPKGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组件包名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPkgNameDirty(){
        if(this.contains(FIELD_PSAPPPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包名称
     */
    @JsonIgnore
    public void resetPSAppPkgName(){
        this.reset(FIELD_PSAPPPKGNAME);
    }

    /**
     * 设置 组件包名称，详细说明：{@link #FIELD_PSAPPPKGNAME}
     * <P>
     * 等同 {@link #setPSAppPkgName}
     * @param pSAppPkgName
     */
    @JsonIgnore
    public PSAppPkgDTO psapppkgname(String pSAppPkgName){
        this.setPSAppPkgName(pSAppPkgName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppPkgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppPkgName(strName);
    }

    @JsonIgnore
    public PSAppPkgDTO name(String strName){
        this.setPSAppPkgName(strName);
        return this;
    }

    /**
     * <B>PSPFPKGID</B>&nbsp;组件包，指定应用组件包引用的预置组件包
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFPKGID = "pspfpkgid";

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSPFPKGID}
     * 
     * @param pSPFPkgId
     * 
     */
    @JsonProperty(FIELD_PSPFPKGID)
    public void setPSPFPkgId(String pSPFPkgId){
        this.set(FIELD_PSPFPKGID, pSPFPkgId);
    }
    
    /**
     * 获取 组件包  
     * @return
     */
    @JsonIgnore
    public String getPSPFPkgId(){
        Object objValue = this.get(FIELD_PSPFPKGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组件包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPkgIdDirty(){
        if(this.contains(FIELD_PSPFPKGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包
     */
    @JsonIgnore
    public void resetPSPFPkgId(){
        this.reset(FIELD_PSPFPKGID);
    }

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSPFPKGID}
     * <P>
     * 等同 {@link #setPSPFPkgId}
     * @param pSPFPkgId
     */
    @JsonIgnore
    public PSAppPkgDTO pspfpkgid(String pSPFPkgId){
        this.setPSPFPkgId(pSPFPkgId);
        return this;
    }

    /**
     * <B>PSPFPKGNAME</B>&nbsp;组件包，指定应用组件包引用的预置组件包
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFPKGID}
     */
    public final static String FIELD_PSPFPKGNAME = "pspfpkgname";

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSPFPKGNAME}
     * 
     * @param pSPFPkgName
     * 
     */
    @JsonProperty(FIELD_PSPFPKGNAME)
    public void setPSPFPkgName(String pSPFPkgName){
        this.set(FIELD_PSPFPKGNAME, pSPFPkgName);
    }
    
    /**
     * 获取 组件包  
     * @return
     */
    @JsonIgnore
    public String getPSPFPkgName(){
        Object objValue = this.get(FIELD_PSPFPKGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组件包 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPkgNameDirty(){
        if(this.contains(FIELD_PSPFPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包
     */
    @JsonIgnore
    public void resetPSPFPkgName(){
        this.reset(FIELD_PSPFPKGNAME);
    }

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSPFPKGNAME}
     * <P>
     * 等同 {@link #setPSPFPkgName}
     * @param pSPFPkgName
     */
    @JsonIgnore
    public PSAppPkgDTO pspfpkgname(String pSPFPkgName){
        this.setPSPFPkgName(pSPFPkgName);
        return this;
    }

    /**
     * <B>PSPFPKGVERID</B>&nbsp;组件包版本，指定应用组件包引用的预置组件包版本
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFPKGVERID = "pspfpkgverid";

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSPFPKGVERID}
     * 
     * @param pSPFPkgVerId
     * 
     */
    @JsonProperty(FIELD_PSPFPKGVERID)
    public void setPSPFPkgVerId(String pSPFPkgVerId){
        this.set(FIELD_PSPFPKGVERID, pSPFPkgVerId);
    }
    
    /**
     * 获取 组件包版本  
     * @return
     */
    @JsonIgnore
    public String getPSPFPkgVerId(){
        Object objValue = this.get(FIELD_PSPFPKGVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组件包版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPkgVerIdDirty(){
        if(this.contains(FIELD_PSPFPKGVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包版本
     */
    @JsonIgnore
    public void resetPSPFPkgVerId(){
        this.reset(FIELD_PSPFPKGVERID);
    }

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSPFPKGVERID}
     * <P>
     * 等同 {@link #setPSPFPkgVerId}
     * @param pSPFPkgVerId
     */
    @JsonIgnore
    public PSAppPkgDTO pspfpkgverid(String pSPFPkgVerId){
        this.setPSPFPkgVerId(pSPFPkgVerId);
        return this;
    }

    /**
     * <B>PSPFPKGVERNAME</B>&nbsp;组件包版本，指定应用组件包引用的预置组件包版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFPKGVERID}
     */
    public final static String FIELD_PSPFPKGVERNAME = "pspfpkgvername";

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSPFPKGVERNAME}
     * 
     * @param pSPFPkgVerName
     * 
     */
    @JsonProperty(FIELD_PSPFPKGVERNAME)
    public void setPSPFPkgVerName(String pSPFPkgVerName){
        this.set(FIELD_PSPFPKGVERNAME, pSPFPkgVerName);
    }
    
    /**
     * 获取 组件包版本  
     * @return
     */
    @JsonIgnore
    public String getPSPFPkgVerName(){
        Object objValue = this.get(FIELD_PSPFPKGVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组件包版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPkgVerNameDirty(){
        if(this.contains(FIELD_PSPFPKGVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包版本
     */
    @JsonIgnore
    public void resetPSPFPkgVerName(){
        this.reset(FIELD_PSPFPKGVERNAME);
    }

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSPFPKGVERNAME}
     * <P>
     * 等同 {@link #setPSPFPkgVerName}
     * @param pSPFPkgVerName
     */
    @JsonIgnore
    public PSAppPkgDTO pspfpkgvername(String pSPFPkgVerName){
        this.setPSPFPkgVerName(pSPFPkgVerName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用组件包所属的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysAppDTO} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
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
     * 判断 系统应用 是否指定值，包括空值
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
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppPkgDTO pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSAppPkgDTO pssysappid(PSSysAppDTO pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用组件包所属的前端应用
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
    public PSAppPkgDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
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
    public PSAppPkgDTO updatedate(Timestamp updateDate){
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
    public PSAppPkgDTO updateman(String updateMan){
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
    public PSAppPkgDTO usercat(String userCat){
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
    public PSAppPkgDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSAppPkgDTO usertag(String userTag){
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
    public PSAppPkgDTO usertag2(String userTag2){
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
    public PSAppPkgDTO usertag3(String userTag3){
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
    public PSAppPkgDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppPkgId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppPkgId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppPkgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppPkgId(strValue);
    }

    @JsonIgnore
    public PSAppPkgDTO id(String strValue){
        this.setPSAppPkgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppPkgDTO){
            PSAppPkgDTO dto = (PSAppPkgDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
