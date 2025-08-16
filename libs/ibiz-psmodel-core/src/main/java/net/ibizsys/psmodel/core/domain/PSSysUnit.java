package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSUNIT</B>系统单位 模型传输对象
 * <P>
 * 计量单位模型，系统基础模型对象，提供标准单位定义能力
 */
public class PSSysUnit extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysUnit(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统单位的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysUnit codename(String codeName){
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
    public PSSysUnit createdate(String createDate){
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
    public PSSysUnit createman(String createMan){
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
    public PSSysUnit memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NAMEPSLANGUAGERESID</B>&nbsp;名称语言资源，指定单位名称的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_NAMEPSLANGUAGERESID = "namepslanguageresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANGUAGERESID}
     * 
     * @param namePSLanguageResId
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANGUAGERESID)
    public void setNamePSLanguageResId(String namePSLanguageResId){
        this.set(FIELD_NAMEPSLANGUAGERESID, namePSLanguageResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanguageResId(){
        Object objValue = this.get(FIELD_NAMEPSLANGUAGERESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanguageResIdDirty(){
        if(this.contains(FIELD_NAMEPSLANGUAGERESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanguageResId(){
        this.reset(FIELD_NAMEPSLANGUAGERESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANGUAGERESID}
     * <P>
     * 等同 {@link #setNamePSLanguageResId}
     * @param namePSLanguageResId
     */
    @JsonIgnore
    public PSSysUnit namepslanguageresid(String namePSLanguageResId){
        this.setNamePSLanguageResId(namePSLanguageResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNamePSLanguageResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysUnit namepslanguageresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setNamePSLanguageResId(null);
            this.setNamePSLanguageResName(null);
        }
        else{
            this.setNamePSLanguageResId(pSLanguageRes.getPSLanguageResId());
            this.setNamePSLanguageResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>NAMEPSLANGUAGERESNAME</B>&nbsp;名称语言资源，指定单位名称的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NAMEPSLANGUAGERESID}
     */
    public final static String FIELD_NAMEPSLANGUAGERESNAME = "namepslanguageresname";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANGUAGERESNAME}
     * 
     * @param namePSLanguageResName
     * 
     */
    @JsonProperty(FIELD_NAMEPSLANGUAGERESNAME)
    public void setNamePSLanguageResName(String namePSLanguageResName){
        this.set(FIELD_NAMEPSLANGUAGERESNAME, namePSLanguageResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getNamePSLanguageResName(){
        Object objValue = this.get(FIELD_NAMEPSLANGUAGERESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNamePSLanguageResNameDirty(){
        if(this.contains(FIELD_NAMEPSLANGUAGERESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetNamePSLanguageResName(){
        this.reset(FIELD_NAMEPSLANGUAGERESNAME);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_NAMEPSLANGUAGERESNAME}
     * <P>
     * 等同 {@link #setNamePSLanguageResName}
     * @param namePSLanguageResName
     */
    @JsonIgnore
    public PSSysUnit namepslanguageresname(String namePSLanguageResName){
        this.setNamePSLanguageResName(namePSLanguageResName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统单位所在的系统模块
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
    public PSSysUnit psmoduleid(String pSModuleId){
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
    public PSSysUnit psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统单位所在的系统模块
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
    public PSSysUnit psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSUNITID</B>&nbsp;单位标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUNITID = "pssysunitid";

    /**
     * 设置 单位标识
     * 
     * @param pSSysUnitId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITID)
    public void setPSSysUnitId(String pSSysUnitId){
        this.set(FIELD_PSSYSUNITID, pSSysUnitId);
    }
    
    /**
     * 获取 单位标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUnitId(){
        Object objValue = this.get(FIELD_PSSYSUNITID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUnitIdDirty(){
        if(this.contains(FIELD_PSSYSUNITID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位标识
     */
    @JsonIgnore
    public void resetPSSysUnitId(){
        this.reset(FIELD_PSSYSUNITID);
    }

    /**
     * 设置 单位标识
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnitId
     */
    @JsonIgnore
    public PSSysUnit pssysunitid(String pSSysUnitId){
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    /**
     * <B>PSSYSUNITNAME</B>&nbsp;单位名称，指定单位名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUNITNAME = "pssysunitname";

    /**
     * 设置 单位名称，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * 
     * @param pSSysUnitName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITNAME)
    public void setPSSysUnitName(String pSSysUnitName){
        this.set(FIELD_PSSYSUNITNAME, pSSysUnitName);
    }
    
    /**
     * 获取 单位名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUnitName(){
        Object objValue = this.get(FIELD_PSSYSUNITNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUnitNameDirty(){
        if(this.contains(FIELD_PSSYSUNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位名称
     */
    @JsonIgnore
    public void resetPSSysUnitName(){
        this.reset(FIELD_PSSYSUNITNAME);
    }

    /**
     * 设置 单位名称，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * <P>
     * 等同 {@link #setPSSysUnitName}
     * @param pSSysUnitName
     */
    @JsonIgnore
    public PSSysUnit pssysunitname(String pSSysUnitName){
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUnitName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUnitName(strName);
    }

    @JsonIgnore
    public PSSysUnit name(String strName){
        this.setPSSysUnitName(strName);
        return this;
    }

    /**
     * <B>PSUNITID</B>&nbsp;平台预置单位，指定平台预置标准单位对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSUNITID = "psunitid";

    /**
     * 设置 平台预置单位，详细说明：{@link #FIELD_PSUNITID}
     * 
     * @param pSUnitId
     * 
     */
    @JsonProperty(FIELD_PSUNITID)
    public void setPSUnitId(String pSUnitId){
        this.set(FIELD_PSUNITID, pSUnitId);
    }
    
    /**
     * 获取 平台预置单位  
     * @return
     */
    @JsonIgnore
    public String getPSUnitId(){
        Object objValue = this.get(FIELD_PSUNITID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSUnitIdDirty(){
        if(this.contains(FIELD_PSUNITID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置单位
     */
    @JsonIgnore
    public void resetPSUnitId(){
        this.reset(FIELD_PSUNITID);
    }

    /**
     * 设置 平台预置单位，详细说明：{@link #FIELD_PSUNITID}
     * <P>
     * 等同 {@link #setPSUnitId}
     * @param pSUnitId
     */
    @JsonIgnore
    public PSSysUnit psunitid(String pSUnitId){
        this.setPSUnitId(pSUnitId);
        return this;
    }

    /**
     * <B>PSUNITNAME</B>&nbsp;平台预置单位，指定平台预置标准单位对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSUNITID}
     */
    public final static String FIELD_PSUNITNAME = "psunitname";

    /**
     * 设置 平台预置单位，详细说明：{@link #FIELD_PSUNITNAME}
     * 
     * @param pSUnitName
     * 
     */
    @JsonProperty(FIELD_PSUNITNAME)
    public void setPSUnitName(String pSUnitName){
        this.set(FIELD_PSUNITNAME, pSUnitName);
    }
    
    /**
     * 获取 平台预置单位  
     * @return
     */
    @JsonIgnore
    public String getPSUnitName(){
        Object objValue = this.get(FIELD_PSUNITNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSUnitNameDirty(){
        if(this.contains(FIELD_PSUNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置单位
     */
    @JsonIgnore
    public void resetPSUnitName(){
        this.reset(FIELD_PSUNITNAME);
    }

    /**
     * 设置 平台预置单位，详细说明：{@link #FIELD_PSUNITNAME}
     * <P>
     * 等同 {@link #setPSUnitName}
     * @param pSUnitName
     */
    @JsonIgnore
    public PSSysUnit psunitname(String pSUnitName){
        this.setPSUnitName(pSUnitName);
        return this;
    }

    /**
     * <B>UNITTAG</B>&nbsp;单位标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_UNITTAG = "unittag";

    /**
     * 设置 单位标记
     * 
     * @param unitTag
     * 
     */
    @JsonProperty(FIELD_UNITTAG)
    public void setUnitTag(String unitTag){
        this.set(FIELD_UNITTAG, unitTag);
    }
    
    /**
     * 获取 单位标记  
     * @return
     */
    @JsonIgnore
    public String getUnitTag(){
        Object objValue = this.get(FIELD_UNITTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnitTagDirty(){
        if(this.contains(FIELD_UNITTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位标记
     */
    @JsonIgnore
    public void resetUnitTag(){
        this.reset(FIELD_UNITTAG);
    }

    /**
     * 设置 单位标记
     * <P>
     * 等同 {@link #setUnitTag}
     * @param unitTag
     */
    @JsonIgnore
    public PSSysUnit unittag(String unitTag){
        this.setUnitTag(unitTag);
        return this;
    }

    /**
     * <B>UNITTAG2</B>&nbsp;单位标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_UNITTAG2 = "unittag2";

    /**
     * 设置 单位标记2
     * 
     * @param unitTag2
     * 
     */
    @JsonProperty(FIELD_UNITTAG2)
    public void setUnitTag2(String unitTag2){
        this.set(FIELD_UNITTAG2, unitTag2);
    }
    
    /**
     * 获取 单位标记2  
     * @return
     */
    @JsonIgnore
    public String getUnitTag2(){
        Object objValue = this.get(FIELD_UNITTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnitTag2Dirty(){
        if(this.contains(FIELD_UNITTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位标记2
     */
    @JsonIgnore
    public void resetUnitTag2(){
        this.reset(FIELD_UNITTAG2);
    }

    /**
     * 设置 单位标记2
     * <P>
     * 等同 {@link #setUnitTag2}
     * @param unitTag2
     */
    @JsonIgnore
    public PSSysUnit unittag2(String unitTag2){
        this.setUnitTag2(unitTag2);
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
    public PSSysUnit updatedate(String updateDate){
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
    public PSSysUnit updateman(String updateMan){
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
    public PSSysUnit usercat(String userCat){
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
    public PSSysUnit usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUnit usertag(String userTag){
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
    public PSSysUnit usertag2(String userTag2){
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
    public PSSysUnit usertag3(String userTag3){
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
    public PSSysUnit usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysUnitId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUnitId(strValue);
    }

    @JsonIgnore
    public PSSysUnit id(String strValue){
        this.setPSSysUnitId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysUnit){
            PSSysUnit model = (PSSysUnit)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
