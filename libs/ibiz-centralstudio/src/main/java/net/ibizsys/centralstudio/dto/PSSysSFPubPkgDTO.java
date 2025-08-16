package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSFPUBPKG</B>后台体系组件 模型传输对象
 * <P>
 * 后台体系组件模型，定义后台体系额外使用的组件信息
 */
public class PSSysSFPubPkgDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSFPubPkgDTO(){
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
    public PSSysSFPubPkgDTO createdate(Timestamp createDate){
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
    public PSSysSFPubPkgDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysSFPubPkgDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定后台体系组件的加载次序
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
    public PSSysSFPubPkgDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PKGPARAM</B>&nbsp;组件包参数，指定后台体系组件的组件包参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_PKGPARAM = "pkgparam";

    /**
     * 设置 组件包参数，详细说明：{@link #FIELD_PKGPARAM}
     * 
     * @param pkgParam
     * 
     */
    @JsonProperty(FIELD_PKGPARAM)
    public void setPkgParam(String pkgParam){
        this.set(FIELD_PKGPARAM, pkgParam);
    }
    
    /**
     * 获取 组件包参数  
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
     * 判断 组件包参数 是否指定值，包括空值
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
     * 重置 组件包参数
     */
    @JsonIgnore
    public void resetPkgParam(){
        this.reset(FIELD_PKGPARAM);
    }

    /**
     * 设置 组件包参数，详细说明：{@link #FIELD_PKGPARAM}
     * <P>
     * 等同 {@link #setPkgParam}
     * @param pkgParam
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam(String pkgParam){
        this.setPkgParam(pkgParam);
        return this;
    }

    /**
     * <B>PKGPARAM2</B>&nbsp;组件包参数2，指定后台体系组件的组件包参数2
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_PKGPARAM2 = "pkgparam2";

    /**
     * 设置 组件包参数2，详细说明：{@link #FIELD_PKGPARAM2}
     * 
     * @param pkgParam2
     * 
     */
    @JsonProperty(FIELD_PKGPARAM2)
    public void setPkgParam2(String pkgParam2){
        this.set(FIELD_PKGPARAM2, pkgParam2);
    }
    
    /**
     * 获取 组件包参数2  
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
     * 判断 组件包参数2 是否指定值，包括空值
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
     * 重置 组件包参数2
     */
    @JsonIgnore
    public void resetPkgParam2(){
        this.reset(FIELD_PKGPARAM2);
    }

    /**
     * 设置 组件包参数2，详细说明：{@link #FIELD_PKGPARAM2}
     * <P>
     * 等同 {@link #setPkgParam2}
     * @param pkgParam2
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam2(String pkgParam2){
        this.setPkgParam2(pkgParam2);
        return this;
    }

    /**
     * <B>PKGPARAM3</B>&nbsp;组件包参数3，指定后台体系组件的组件包参数3
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_PKGPARAM3 = "pkgparam3";

    /**
     * 设置 组件包参数3，详细说明：{@link #FIELD_PKGPARAM3}
     * 
     * @param pkgParam3
     * 
     */
    @JsonProperty(FIELD_PKGPARAM3)
    public void setPkgParam3(String pkgParam3){
        this.set(FIELD_PKGPARAM3, pkgParam3);
    }
    
    /**
     * 获取 组件包参数3  
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
     * 判断 组件包参数3 是否指定值，包括空值
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
     * 重置 组件包参数3
     */
    @JsonIgnore
    public void resetPkgParam3(){
        this.reset(FIELD_PKGPARAM3);
    }

    /**
     * 设置 组件包参数3，详细说明：{@link #FIELD_PKGPARAM3}
     * <P>
     * 等同 {@link #setPkgParam3}
     * @param pkgParam3
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam3(String pkgParam3){
        this.setPkgParam3(pkgParam3);
        return this;
    }

    /**
     * <B>PKGPARAM4</B>&nbsp;组件包参数4，指定后台体系组件的组件包参数4
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_PKGPARAM4 = "pkgparam4";

    /**
     * 设置 组件包参数4，详细说明：{@link #FIELD_PKGPARAM4}
     * 
     * @param pkgParam4
     * 
     */
    @JsonProperty(FIELD_PKGPARAM4)
    public void setPkgParam4(String pkgParam4){
        this.set(FIELD_PKGPARAM4, pkgParam4);
    }
    
    /**
     * 获取 组件包参数4  
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
     * 判断 组件包参数4 是否指定值，包括空值
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
     * 重置 组件包参数4
     */
    @JsonIgnore
    public void resetPkgParam4(){
        this.reset(FIELD_PKGPARAM4);
    }

    /**
     * 设置 组件包参数4，详细说明：{@link #FIELD_PKGPARAM4}
     * <P>
     * 等同 {@link #setPkgParam4}
     * @param pkgParam4
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pkgparam4(String pkgParam4){
        this.setPkgParam4(pkgParam4);
        return this;
    }

    /**
     * <B>PSSFPKGID</B>&nbsp;组件包，指定后台体系组件引用的组件包
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFPKGID = "pssfpkgid";

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSSFPKGID}
     * 
     * @param pSSFPkgId
     * 
     */
    @JsonProperty(FIELD_PSSFPKGID)
    public void setPSSFPkgId(String pSSFPkgId){
        this.set(FIELD_PSSFPKGID, pSSFPkgId);
    }
    
    /**
     * 获取 组件包  
     * @return
     */
    @JsonIgnore
    public String getPSSFPkgId(){
        Object objValue = this.get(FIELD_PSSFPKGID);
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
    public boolean isPSSFPkgIdDirty(){
        if(this.contains(FIELD_PSSFPKGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包
     */
    @JsonIgnore
    public void resetPSSFPkgId(){
        this.reset(FIELD_PSSFPKGID);
    }

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSSFPKGID}
     * <P>
     * 等同 {@link #setPSSFPkgId}
     * @param pSSFPkgId
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgid(String pSSFPkgId){
        this.setPSSFPkgId(pSSFPkgId);
        return this;
    }

    /**
     * <B>PSSFPKGNAME</B>&nbsp;组件包，指定后台体系组件引用的组件包
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFPKGID}
     */
    public final static String FIELD_PSSFPKGNAME = "pssfpkgname";

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSSFPKGNAME}
     * 
     * @param pSSFPkgName
     * 
     */
    @JsonProperty(FIELD_PSSFPKGNAME)
    public void setPSSFPkgName(String pSSFPkgName){
        this.set(FIELD_PSSFPKGNAME, pSSFPkgName);
    }
    
    /**
     * 获取 组件包  
     * @return
     */
    @JsonIgnore
    public String getPSSFPkgName(){
        Object objValue = this.get(FIELD_PSSFPKGNAME);
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
    public boolean isPSSFPkgNameDirty(){
        if(this.contains(FIELD_PSSFPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包
     */
    @JsonIgnore
    public void resetPSSFPkgName(){
        this.reset(FIELD_PSSFPKGNAME);
    }

    /**
     * 设置 组件包，详细说明：{@link #FIELD_PSSFPKGNAME}
     * <P>
     * 等同 {@link #setPSSFPkgName}
     * @param pSSFPkgName
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgname(String pSSFPkgName){
        this.setPSSFPkgName(pSSFPkgName);
        return this;
    }

    /**
     * <B>PSSFPKGVERID</B>&nbsp;组件包版本，指定后台体系组件引用的组件包版本
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFPKGVERID = "pssfpkgverid";

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSSFPKGVERID}
     * 
     * @param pSSFPkgVerId
     * 
     */
    @JsonProperty(FIELD_PSSFPKGVERID)
    public void setPSSFPkgVerId(String pSSFPkgVerId){
        this.set(FIELD_PSSFPKGVERID, pSSFPkgVerId);
    }
    
    /**
     * 获取 组件包版本  
     * @return
     */
    @JsonIgnore
    public String getPSSFPkgVerId(){
        Object objValue = this.get(FIELD_PSSFPKGVERID);
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
    public boolean isPSSFPkgVerIdDirty(){
        if(this.contains(FIELD_PSSFPKGVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包版本
     */
    @JsonIgnore
    public void resetPSSFPkgVerId(){
        this.reset(FIELD_PSSFPKGVERID);
    }

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSSFPKGVERID}
     * <P>
     * 等同 {@link #setPSSFPkgVerId}
     * @param pSSFPkgVerId
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgverid(String pSSFPkgVerId){
        this.setPSSFPkgVerId(pSSFPkgVerId);
        return this;
    }

    /**
     * <B>PSSFPKGVERNAME</B>&nbsp;组件包版本，指定后台体系组件引用的组件包版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFPKGVERID}
     */
    public final static String FIELD_PSSFPKGVERNAME = "pssfpkgvername";

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSSFPKGVERNAME}
     * 
     * @param pSSFPkgVerName
     * 
     */
    @JsonProperty(FIELD_PSSFPKGVERNAME)
    public void setPSSFPkgVerName(String pSSFPkgVerName){
        this.set(FIELD_PSSFPKGVERNAME, pSSFPkgVerName);
    }
    
    /**
     * 获取 组件包版本  
     * @return
     */
    @JsonIgnore
    public String getPSSFPkgVerName(){
        Object objValue = this.get(FIELD_PSSFPKGVERNAME);
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
    public boolean isPSSFPkgVerNameDirty(){
        if(this.contains(FIELD_PSSFPKGVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件包版本
     */
    @JsonIgnore
    public void resetPSSFPkgVerName(){
        this.reset(FIELD_PSSFPKGVERNAME);
    }

    /**
     * 设置 组件包版本，详细说明：{@link #FIELD_PSSFPKGVERNAME}
     * <P>
     * 等同 {@link #setPSSFPkgVerName}
     * @param pSSFPkgVerName
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pssfpkgvername(String pSSFPkgVerName){
        this.setPSSFPkgVerName(pSSFPkgVerName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBID</B>&nbsp;后台体系，指定后台体系组件的所属后台体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPubDTO} 
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
    public PSSysSFPubPkgDTO pssyssfpubid(String pSSysSFPubId){
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
    public PSSysSFPubPkgDTO pssyssfpubid(PSSysSFPubDTO pSSysSFPub){
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
     * <B>PSSYSSFPUBNAME</B>&nbsp;后台体系，指定后台体系组件的所属后台体系
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
    public PSSysSFPubPkgDTO pssyssfpubname(String pSSysSFPubName){
        this.setPSSysSFPubName(pSSysSFPubName);
        return this;
    }

    /**
     * <B>PSSYSSFPUBPKGID</B>&nbsp;后台服务体系组件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSFPUBPKGID = "pssyssfpubpkgid";

    /**
     * 设置 后台服务体系组件标识
     * 
     * @param pSSysSFPubPkgId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBPKGID)
    public void setPSSysSFPubPkgId(String pSSysSFPubPkgId){
        this.set(FIELD_PSSYSSFPUBPKGID, pSSysSFPubPkgId);
    }
    
    /**
     * 获取 后台服务体系组件标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubPkgId(){
        Object objValue = this.get(FIELD_PSSYSSFPUBPKGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台服务体系组件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubPkgIdDirty(){
        if(this.contains(FIELD_PSSYSSFPUBPKGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台服务体系组件标识
     */
    @JsonIgnore
    public void resetPSSysSFPubPkgId(){
        this.reset(FIELD_PSSYSSFPUBPKGID);
    }

    /**
     * 设置 后台服务体系组件标识
     * <P>
     * 等同 {@link #setPSSysSFPubPkgId}
     * @param pSSysSFPubPkgId
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubpkgid(String pSSysSFPubPkgId){
        this.setPSSysSFPubPkgId(pSSysSFPubPkgId);
        return this;
    }

    /**
     * <B>PSSYSSFPUBPKGNAME</B>&nbsp;组件名称，指定后台体系组件的名称，需在所属后台体系中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSFPUBPKGNAME = "pssyssfpubpkgname";

    /**
     * 设置 组件名称，详细说明：{@link #FIELD_PSSYSSFPUBPKGNAME}
     * 
     * @param pSSysSFPubPkgName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPUBPKGNAME)
    public void setPSSysSFPubPkgName(String pSSysSFPubPkgName){
        this.set(FIELD_PSSYSSFPUBPKGNAME, pSSysSFPubPkgName);
    }
    
    /**
     * 获取 组件名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPubPkgName(){
        Object objValue = this.get(FIELD_PSSYSSFPUBPKGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPubPkgNameDirty(){
        if(this.contains(FIELD_PSSYSSFPUBPKGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组件名称
     */
    @JsonIgnore
    public void resetPSSysSFPubPkgName(){
        this.reset(FIELD_PSSYSSFPUBPKGNAME);
    }

    /**
     * 设置 组件名称，详细说明：{@link #FIELD_PSSYSSFPUBPKGNAME}
     * <P>
     * 等同 {@link #setPSSysSFPubPkgName}
     * @param pSSysSFPubPkgName
     */
    @JsonIgnore
    public PSSysSFPubPkgDTO pssyssfpubpkgname(String pSSysSFPubPkgName){
        this.setPSSysSFPubPkgName(pSSysSFPubPkgName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSFPubPkgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSFPubPkgName(strName);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO name(String strName){
        this.setPSSysSFPubPkgName(strName);
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
    public PSSysSFPubPkgDTO updatedate(Timestamp updateDate){
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
    public PSSysSFPubPkgDTO updateman(String updateMan){
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
    public PSSysSFPubPkgDTO usercat(String userCat){
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
    public PSSysSFPubPkgDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSFPubPkgDTO usertag(String userTag){
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
    public PSSysSFPubPkgDTO usertag2(String userTag2){
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
    public PSSysSFPubPkgDTO usertag3(String userTag3){
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
    public PSSysSFPubPkgDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysSFPubPkgId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSFPubPkgId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSFPubPkgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSFPubPkgId(strValue);
    }

    @JsonIgnore
    public PSSysSFPubPkgDTO id(String strValue){
        this.setPSSysSFPubPkgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSFPubPkgDTO){
            PSSysSFPubPkgDTO dto = (PSSysSFPubPkgDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
