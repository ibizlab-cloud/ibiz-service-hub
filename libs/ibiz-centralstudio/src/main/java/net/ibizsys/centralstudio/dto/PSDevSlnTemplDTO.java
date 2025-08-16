package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevSlnTemplDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDEVSLNTEMPLNAME</B>&nbsp;开发模板名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVSLNTEMPLNAME = "psdevslntemplname";

    /**
     * 设置 开发模板名称
     * 
     * @param pSDevSlnTemplName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNTEMPLNAME)
    public void setPSDevSlnTemplName(String pSDevSlnTemplName){
        this.set(FIELD_PSDEVSLNTEMPLNAME, pSDevSlnTemplName);
    }
    
    /**
     * 获取 开发模板名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnTemplName(){
        Object objValue = this.get(FIELD_PSDEVSLNTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发模板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnTemplNameDirty(){
        if(this.contains(FIELD_PSDEVSLNTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发模板名称
     */
    @JsonIgnore
    public void resetPSDevSlnTemplName(){
        this.reset(FIELD_PSDEVSLNTEMPLNAME);
    }

    /**
     * 设置 开发模板名称
     * <P>
     * 等同 {@link #setPSDevSlnTemplName}
     * @param pSDevSlnTemplName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevslntemplname(String pSDevSlnTemplName){
        this.setPSDevSlnTemplName(pSDevSlnTemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevSlnTemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevSlnTemplName(strName);
    }

    @JsonIgnore
    public PSDevSlnTemplDTO name(String strName){
        this.setPSDevSlnTemplName(strName);
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
    public PSDevSlnTemplDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVSLNTEMPLID</B>&nbsp;开发模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNTEMPLID = "psdevslntemplid";

    /**
     * 设置 开发模板标识
     * 
     * @param pSDevSlnTemplId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNTEMPLID)
    public void setPSDevSlnTemplId(String pSDevSlnTemplId){
        this.set(FIELD_PSDEVSLNTEMPLID, pSDevSlnTemplId);
    }
    
    /**
     * 获取 开发模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnTemplId(){
        Object objValue = this.get(FIELD_PSDEVSLNTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnTemplIdDirty(){
        if(this.contains(FIELD_PSDEVSLNTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发模板标识
     */
    @JsonIgnore
    public void resetPSDevSlnTemplId(){
        this.reset(FIELD_PSDEVSLNTEMPLID);
    }

    /**
     * 设置 开发模板标识
     * <P>
     * 等同 {@link #setPSDevSlnTemplId}
     * @param pSDevSlnTemplId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevslntemplid(String pSDevSlnTemplId){
        this.setPSDevSlnTemplId(pSDevSlnTemplId);
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
    public PSDevSlnTemplDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDevSlnTemplDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDevSlnTemplDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PSSFNAME</B>&nbsp;后台体系模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFID}
     */
    public final static String FIELD_PSSFNAME = "pssfname";

    /**
     * 设置 后台体系模板
     * 
     * @param pSSFName
     * 
     */
    @JsonProperty(FIELD_PSSFNAME)
    public void setPSSFName(String pSSFName){
        this.set(FIELD_PSSFNAME, pSSFName);
    }
    
    /**
     * 获取 后台体系模板  
     * @return
     */
    @JsonIgnore
    public String getPSSFName(){
        Object objValue = this.get(FIELD_PSSFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFNameDirty(){
        if(this.contains(FIELD_PSSFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系模板
     */
    @JsonIgnore
    public void resetPSSFName(){
        this.reset(FIELD_PSSFNAME);
    }

    /**
     * 设置 后台体系模板
     * <P>
     * 等同 {@link #setPSSFName}
     * @param pSSFName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pssfname(String pSSFName){
        this.setPSSFName(pSSFName);
        return this;
    }

    /**
     * <B>PSSFID</B>&nbsp;后台体系模板
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFID = "pssfid";

    /**
     * 设置 后台体系模板
     * 
     * @param pSSFId
     * 
     */
    @JsonProperty(FIELD_PSSFID)
    public void setPSSFId(String pSSFId){
        this.set(FIELD_PSSFID, pSSFId);
    }
    
    /**
     * 获取 后台体系模板  
     * @return
     */
    @JsonIgnore
    public String getPSSFId(){
        Object objValue = this.get(FIELD_PSSFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台体系模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFIdDirty(){
        if(this.contains(FIELD_PSSFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台体系模板
     */
    @JsonIgnore
    public void resetPSSFId(){
        this.reset(FIELD_PSSFID);
    }

    /**
     * 设置 后台体系模板
     * <P>
     * 等同 {@link #setPSSFId}
     * @param pSSFId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pssfid(String pSSFId){
        this.setPSSFId(pSSFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端应用模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 前端应用模板
     * 
     * @param pSPFName
     * 
     */
    @JsonProperty(FIELD_PSPFNAME)
    public void setPSPFName(String pSPFName){
        this.set(FIELD_PSPFNAME, pSPFName);
    }
    
    /**
     * 获取 前端应用模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFName(){
        Object objValue = this.get(FIELD_PSPFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFNameDirty(){
        if(this.contains(FIELD_PSPFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用模板
     */
    @JsonIgnore
    public void resetPSPFName(){
        this.reset(FIELD_PSPFNAME);
    }

    /**
     * 设置 前端应用模板
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心标识
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心标识  
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
     * 判断 应用中心标识 是否指定值，包括空值
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
     * 重置 应用中心标识
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心标识
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端应用模板
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端应用模板
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 前端应用模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用模板
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 前端应用模板
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;云应用中心名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 云应用中心名称
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 云应用中心名称  
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
     * 判断 云应用中心名称 是否指定值，包括空值
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
     * 重置 云应用中心名称
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 云应用中心名称
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnName(){
        Object objValue = this.get(FIELD_PSDEVSLNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnNameDirty(){
        if(this.contains(FIELD_PSDEVSLNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnId(){
        Object objValue = this.get(FIELD_PSDEVSLNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnIdDirty(){
        if(this.contains(FIELD_PSDEVSLNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>TEMPLTAG2</B>&nbsp;模板标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TEMPLTAG2 = "templtag2";

    /**
     * 设置 模板标记2
     * 
     * @param templTag2
     * 
     */
    @JsonProperty(FIELD_TEMPLTAG2)
    public void setTemplTag2(String templTag2){
        this.set(FIELD_TEMPLTAG2, templTag2);
    }
    
    /**
     * 获取 模板标记2  
     * @return
     */
    @JsonIgnore
    public String getTemplTag2(){
        Object objValue = this.get(FIELD_TEMPLTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplTag2Dirty(){
        if(this.contains(FIELD_TEMPLTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板标记2
     */
    @JsonIgnore
    public void resetTemplTag2(){
        this.reset(FIELD_TEMPLTAG2);
    }

    /**
     * 设置 模板标记2
     * <P>
     * 等同 {@link #setTemplTag2}
     * @param templTag2
     */
    @JsonIgnore
    public PSDevSlnTemplDTO templtag2(String templTag2){
        this.setTemplTag2(templTag2);
        return this;
    }

    /**
     * <B>TEMPLTAG</B>&nbsp;模板标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TEMPLTAG = "templtag";

    /**
     * 设置 模板标记
     * 
     * @param templTag
     * 
     */
    @JsonProperty(FIELD_TEMPLTAG)
    public void setTemplTag(String templTag){
        this.set(FIELD_TEMPLTAG, templTag);
    }
    
    /**
     * 获取 模板标记  
     * @return
     */
    @JsonIgnore
    public String getTemplTag(){
        Object objValue = this.get(FIELD_TEMPLTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplTagDirty(){
        if(this.contains(FIELD_TEMPLTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板标记
     */
    @JsonIgnore
    public void resetTemplTag(){
        this.reset(FIELD_TEMPLTAG);
    }

    /**
     * 设置 模板标记
     * <P>
     * 等同 {@link #setTemplTag}
     * @param templTag
     */
    @JsonIgnore
    public PSDevSlnTemplDTO templtag(String templTag){
        this.setTemplTag(templTag);
        return this;
    }

    /**
     * <B>STYLECODE</B>&nbsp;样式代码
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_STYLECODE = "stylecode";

    /**
     * 设置 样式代码
     * 
     * @param styleCode
     * 
     */
    @JsonProperty(FIELD_STYLECODE)
    public void setStyleCode(String styleCode){
        this.set(FIELD_STYLECODE, styleCode);
    }
    
    /**
     * 获取 样式代码  
     * @return
     */
    @JsonIgnore
    public String getStyleCode(){
        Object objValue = this.get(FIELD_STYLECODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStyleCodeDirty(){
        if(this.contains(FIELD_STYLECODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式代码
     */
    @JsonIgnore
    public void resetStyleCode(){
        this.reset(FIELD_STYLECODE);
    }

    /**
     * 设置 样式代码
     * <P>
     * 等同 {@link #setStyleCode}
     * @param styleCode
     */
    @JsonIgnore
    public PSDevSlnTemplDTO stylecode(String styleCode){
        this.setStyleCode(styleCode);
        return this;
    }

    /**
     * <B>V2GITPATH</B>&nbsp;样式资源仓库地址
     * <P>
     * 字符串：最大长度 400
     */
    public final static String FIELD_V2GITPATH = "v2gitpath";

    /**
     * 设置 样式资源仓库地址
     * 
     * @param v2GitPath
     * 
     */
    @JsonProperty(FIELD_V2GITPATH)
    public void setV2GitPath(String v2GitPath){
        this.set(FIELD_V2GITPATH, v2GitPath);
    }
    
    /**
     * 获取 样式资源仓库地址  
     * @return
     */
    @JsonIgnore
    public String getV2GitPath(){
        Object objValue = this.get(FIELD_V2GITPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式资源仓库地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isV2GitPathDirty(){
        if(this.contains(FIELD_V2GITPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式资源仓库地址
     */
    @JsonIgnore
    public void resetV2GitPath(){
        this.reset(FIELD_V2GITPATH);
    }

    /**
     * 设置 样式资源仓库地址
     * <P>
     * 等同 {@link #setV2GitPath}
     * @param v2GitPath
     */
    @JsonIgnore
    public PSDevSlnTemplDTO v2gitpath(String v2GitPath){
        this.setV2GitPath(v2GitPath);
        return this;
    }

    /**
     * <B>LASTPUBDATE</B>&nbsp;最后发布时间
     */
    public final static String FIELD_LASTPUBDATE = "lastpubdate";

    /**
     * 设置 最后发布时间
     * 
     * @param lastPubDate
     * 
     */
    @JsonProperty(FIELD_LASTPUBDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setLastPubDate(Timestamp lastPubDate){
        this.set(FIELD_LASTPUBDATE, lastPubDate);
    }
    
    /**
     * 获取 最后发布时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getLastPubDate(){
        Object objValue = this.get(FIELD_LASTPUBDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 最后发布时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLastPubDateDirty(){
        if(this.contains(FIELD_LASTPUBDATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最后发布时间
     */
    @JsonIgnore
    public void resetLastPubDate(){
        this.reset(FIELD_LASTPUBDATE);
    }

    /**
     * 设置 最后发布时间
     * <P>
     * 等同 {@link #setLastPubDate}
     * @param lastPubDate
     */
    @JsonIgnore
    public PSDevSlnTemplDTO lastpubdate(Timestamp lastPubDate){
        this.setLastPubDate(lastPubDate);
        return this;
    }

    /**
     * <B>VERSTR</B>&nbsp;版本号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VERSTR = "verstr";

    /**
     * 设置 版本号
     * 
     * @param verStr
     * 
     */
    @JsonProperty(FIELD_VERSTR)
    public void setVerStr(String verStr){
        this.set(FIELD_VERSTR, verStr);
    }
    
    /**
     * 获取 版本号  
     * @return
     */
    @JsonIgnore
    public String getVerStr(){
        Object objValue = this.get(FIELD_VERSTR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerStrDirty(){
        if(this.contains(FIELD_VERSTR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本号
     */
    @JsonIgnore
    public void resetVerStr(){
        this.reset(FIELD_VERSTR);
    }

    /**
     * 设置 版本号
     * <P>
     * 等同 {@link #setVerStr}
     * @param verStr
     */
    @JsonIgnore
    public PSDevSlnTemplDTO verstr(String verStr){
        this.setVerStr(verStr);
        return this;
    }

    /**
     * <B>DEVTEMPLSTATE</B>&nbsp;开发模板状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSysState} 
     */
    public final static String FIELD_DEVTEMPLSTATE = "devtemplstate";

    /**
     * 设置 开发模板状态
     * 
     * @param devTemplState
     * 
     */
    @JsonProperty(FIELD_DEVTEMPLSTATE)
    public void setDevTemplState(Integer devTemplState){
        this.set(FIELD_DEVTEMPLSTATE, devTemplState);
    }
    
    /**
     * 获取 开发模板状态  
     * @return
     */
    @JsonIgnore
    public Integer getDevTemplState(){
        Object objValue = this.get(FIELD_DEVTEMPLSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 开发模板状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDevTemplStateDirty(){
        if(this.contains(FIELD_DEVTEMPLSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发模板状态
     */
    @JsonIgnore
    public void resetDevTemplState(){
        this.reset(FIELD_DEVTEMPLSTATE);
    }

    /**
     * 设置 开发模板状态
     * <P>
     * 等同 {@link #setDevTemplState}
     * @param devTemplState
     */
    @JsonIgnore
    public PSDevSlnTemplDTO devtemplstate(Integer devTemplState){
        this.setDevTemplState(devTemplState);
        return this;
    }

     /**
     * 设置 开发模板状态
     * <P>
     * 等同 {@link #setDevTemplState}
     * @param devTemplState
     */
    @JsonIgnore
    public PSDevSlnTemplDTO devtemplstate(net.ibizsys.centralstudio.util.CentralEnums.DevSysState devTemplState){
        if(devTemplState == null){
            this.setDevTemplState(null);
        }
        else{
            this.setDevTemplState(devTemplState.value);
        }
        return this;
    }

    /**
     * <B>STYLEENGINE</B>&nbsp;样式引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.PSTemplEngine} 
     */
    public final static String FIELD_STYLEENGINE = "styleengine";

    /**
     * 设置 样式引擎
     * 
     * @param styleEngine
     * 
     */
    @JsonProperty(FIELD_STYLEENGINE)
    public void setStyleEngine(String styleEngine){
        this.set(FIELD_STYLEENGINE, styleEngine);
    }
    
    /**
     * 获取 样式引擎  
     * @return
     */
    @JsonIgnore
    public String getStyleEngine(){
        Object objValue = this.get(FIELD_STYLEENGINE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStyleEngineDirty(){
        if(this.contains(FIELD_STYLEENGINE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式引擎
     */
    @JsonIgnore
    public void resetStyleEngine(){
        this.reset(FIELD_STYLEENGINE);
    }

    /**
     * 设置 样式引擎
     * <P>
     * 等同 {@link #setStyleEngine}
     * @param styleEngine
     */
    @JsonIgnore
    public PSDevSlnTemplDTO styleengine(String styleEngine){
        this.setStyleEngine(styleEngine);
        return this;
    }

     /**
     * 设置 样式引擎
     * <P>
     * 等同 {@link #setStyleEngine}
     * @param styleEngine
     */
    @JsonIgnore
    public PSDevSlnTemplDTO styleengine(net.ibizsys.centralstudio.util.CentralEnums.PSTemplEngine styleEngine){
        if(styleEngine == null){
            this.setStyleEngine(null);
        }
        else{
            this.setStyleEngine(styleEngine.value);
        }
        return this;
    }

    /**
     * <B>TEMPLTYPE</B>&nbsp;模板类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DevSlnTemplType} 
     */
    public final static String FIELD_TEMPLTYPE = "templtype";

    /**
     * 设置 模板类型
     * 
     * @param templType
     * 
     */
    @JsonProperty(FIELD_TEMPLTYPE)
    public void setTemplType(String templType){
        this.set(FIELD_TEMPLTYPE, templType);
    }
    
    /**
     * 获取 模板类型  
     * @return
     */
    @JsonIgnore
    public String getTemplType(){
        Object objValue = this.get(FIELD_TEMPLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模板类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplTypeDirty(){
        if(this.contains(FIELD_TEMPLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板类型
     */
    @JsonIgnore
    public void resetTemplType(){
        this.reset(FIELD_TEMPLTYPE);
    }

    /**
     * 设置 模板类型
     * <P>
     * 等同 {@link #setTemplType}
     * @param templType
     */
    @JsonIgnore
    public PSDevSlnTemplDTO templtype(String templType){
        this.setTemplType(templType);
        return this;
    }

     /**
     * 设置 模板类型
     * <P>
     * 等同 {@link #setTemplType}
     * @param templType
     */
    @JsonIgnore
    public PSDevSlnTemplDTO templtype(net.ibizsys.centralstudio.util.CentralEnums.DevSlnTemplType templType){
        if(templType == null){
            this.setTemplType(null);
        }
        else{
            this.setTemplType(templType.value);
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
    public PSDevSlnTemplDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSPFSTYLENAME</B>&nbsp;前端模板样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFSTYLEID}
     */
    public final static String FIELD_PSPFSTYLENAME = "pspfstylename";

    /**
     * 设置 前端模板样式
     * 
     * @param pSPFStyleName
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLENAME)
    public void setPSPFStyleName(String pSPFStyleName){
        this.set(FIELD_PSPFSTYLENAME, pSPFStyleName);
    }
    
    /**
     * 获取 前端模板样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleName(){
        Object objValue = this.get(FIELD_PSPFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleNameDirty(){
        if(this.contains(FIELD_PSPFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板样式
     */
    @JsonIgnore
    public void resetPSPFStyleName(){
        this.reset(FIELD_PSPFSTYLENAME);
    }

    /**
     * 设置 前端模板样式
     * <P>
     * 等同 {@link #setPSPFStyleName}
     * @param pSPFStyleName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pspfstylename(String pSPFStyleName){
        this.setPSPFStyleName(pSPFStyleName);
        return this;
    }

    /**
     * <B>PSSFSTYLENAME</B>&nbsp;后台模板样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFSTYLEID}
     */
    public final static String FIELD_PSSFSTYLENAME = "pssfstylename";

    /**
     * 设置 后台模板样式
     * 
     * @param pSSFStyleName
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLENAME)
    public void setPSSFStyleName(String pSSFStyleName){
        this.set(FIELD_PSSFSTYLENAME, pSSFStyleName);
    }
    
    /**
     * 获取 后台模板样式  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleName(){
        Object objValue = this.get(FIELD_PSSFSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台模板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleNameDirty(){
        if(this.contains(FIELD_PSSFSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台模板样式
     */
    @JsonIgnore
    public void resetPSSFStyleName(){
        this.reset(FIELD_PSSFSTYLENAME);
    }

    /**
     * 设置 后台模板样式
     * <P>
     * 等同 {@link #setPSSFStyleName}
     * @param pSSFStyleName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pssfstylename(String pSSFStyleName){
        this.setPSSFStyleName(pSSFStyleName);
        return this;
    }

    /**
     * <B>PSPFSTYLEID</B>&nbsp;前端模板样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFSTYLEID = "pspfstyleid";

    /**
     * 设置 前端模板样式
     * 
     * @param pSPFStyleId
     * 
     */
    @JsonProperty(FIELD_PSPFSTYLEID)
    public void setPSPFStyleId(String pSPFStyleId){
        this.set(FIELD_PSPFSTYLEID, pSPFStyleId);
    }
    
    /**
     * 获取 前端模板样式  
     * @return
     */
    @JsonIgnore
    public String getPSPFStyleId(){
        Object objValue = this.get(FIELD_PSPFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFStyleIdDirty(){
        if(this.contains(FIELD_PSPFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板样式
     */
    @JsonIgnore
    public void resetPSPFStyleId(){
        this.reset(FIELD_PSPFSTYLEID);
    }

    /**
     * 设置 前端模板样式
     * <P>
     * 等同 {@link #setPSPFStyleId}
     * @param pSPFStyleId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pspfstyleid(String pSPFStyleId){
        this.setPSPFStyleId(pSPFStyleId);
        return this;
    }

    /**
     * <B>PSSFSTYLEID</B>&nbsp;后台模板样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFSTYLEID = "pssfstyleid";

    /**
     * 设置 后台模板样式
     * 
     * @param pSSFStyleId
     * 
     */
    @JsonProperty(FIELD_PSSFSTYLEID)
    public void setPSSFStyleId(String pSSFStyleId){
        this.set(FIELD_PSSFSTYLEID, pSSFStyleId);
    }
    
    /**
     * 获取 后台模板样式  
     * @return
     */
    @JsonIgnore
    public String getPSSFStyleId(){
        Object objValue = this.get(FIELD_PSSFSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台模板样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFStyleIdDirty(){
        if(this.contains(FIELD_PSSFSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台模板样式
     */
    @JsonIgnore
    public void resetPSSFStyleId(){
        this.reset(FIELD_PSSFSTYLEID);
    }

    /**
     * 设置 后台模板样式
     * <P>
     * 等同 {@link #setPSSFStyleId}
     * @param pSSFStyleId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO pssfstyleid(String pSSFStyleId){
        this.setPSSFStyleId(pSSFStyleId);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNNAME</B>&nbsp;中心版本库
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERSVNID}
     */
    public final static String FIELD_PSDEVCENTERSVNNAME = "psdevcentersvnname";

    /**
     * 设置 中心版本库
     * 
     * @param pSDevCenterSVNName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNNAME)
    public void setPSDevCenterSVNName(String pSDevCenterSVNName){
        this.set(FIELD_PSDEVCENTERSVNNAME, pSDevCenterSVNName);
    }
    
    /**
     * 获取 中心版本库  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterSVNName(){
        Object objValue = this.get(FIELD_PSDEVCENTERSVNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心版本库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterSVNNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERSVNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心版本库
     */
    @JsonIgnore
    public void resetPSDevCenterSVNName(){
        this.reset(FIELD_PSDEVCENTERSVNNAME);
    }

    /**
     * 设置 中心版本库
     * <P>
     * 等同 {@link #setPSDevCenterSVNName}
     * @param pSDevCenterSVNName
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevcentersvnname(String pSDevCenterSVNName){
        this.setPSDevCenterSVNName(pSDevCenterSVNName);
        return this;
    }

    /**
     * <B>PSDEVCENTERSVNID</B>&nbsp;中心版本库
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERSVNID = "psdevcentersvnid";

    /**
     * 设置 中心版本库
     * 
     * @param pSDevCenterSVNId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERSVNID)
    public void setPSDevCenterSVNId(String pSDevCenterSVNId){
        this.set(FIELD_PSDEVCENTERSVNID, pSDevCenterSVNId);
    }
    
    /**
     * 获取 中心版本库  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterSVNId(){
        Object objValue = this.get(FIELD_PSDEVCENTERSVNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心版本库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterSVNIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERSVNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心版本库
     */
    @JsonIgnore
    public void resetPSDevCenterSVNId(){
        this.reset(FIELD_PSDEVCENTERSVNID);
    }

    /**
     * 设置 中心版本库
     * <P>
     * 等同 {@link #setPSDevCenterSVNId}
     * @param pSDevCenterSVNId
     */
    @JsonIgnore
    public PSDevSlnTemplDTO psdevcentersvnid(String pSDevCenterSVNId){
        this.setPSDevCenterSVNId(pSDevCenterSVNId);
        return this;
    }

    /**
     * <B>CODEREPOURL</B>&nbsp;代码仓库地址
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CODEREPOURL = "coderepourl";

    /**
     * 设置 代码仓库地址
     * 
     * @param codeRepoUrl
     * 
     */
    @JsonProperty(FIELD_CODEREPOURL)
    public void setCodeRepoUrl(String codeRepoUrl){
        this.set(FIELD_CODEREPOURL, codeRepoUrl);
    }
    
    /**
     * 获取 代码仓库地址  
     * @return
     */
    @JsonIgnore
    public String getCodeRepoUrl(){
        Object objValue = this.get(FIELD_CODEREPOURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码仓库地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeRepoUrlDirty(){
        if(this.contains(FIELD_CODEREPOURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码仓库地址
     */
    @JsonIgnore
    public void resetCodeRepoUrl(){
        this.reset(FIELD_CODEREPOURL);
    }

    /**
     * 设置 代码仓库地址
     * <P>
     * 等同 {@link #setCodeRepoUrl}
     * @param codeRepoUrl
     */
    @JsonIgnore
    public PSDevSlnTemplDTO coderepourl(String codeRepoUrl){
        this.setCodeRepoUrl(codeRepoUrl);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevSlnTemplId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevSlnTemplDTO){
            PSDevSlnTemplDTO dto = (PSDevSlnTemplDTO)iEntity;
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