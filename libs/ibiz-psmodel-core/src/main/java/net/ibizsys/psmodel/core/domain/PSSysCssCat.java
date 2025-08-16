package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCSSCAT</B>系统界面样式表分类 模型传输对象
 * <P>
 * 系统界面样式表分类模型，为样式表对象提供分类能力
 */
public class PSSysCssCat extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysCssCat(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定样式表分类的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysCssCat codename(String codeName){
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
    public PSSysCssCat createdate(String createDate){
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
    public PSSysCssCat createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CSSCATNAME</B>&nbsp;CSS分类样式名称
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CSSCATNAME = "csscatname";

    /**
     * 设置 CSS分类样式名称
     * 
     * @param cssCatName
     * 
     */
    @JsonProperty(FIELD_CSSCATNAME)
    public void setCssCatName(String cssCatName){
        this.set(FIELD_CSSCATNAME, cssCatName);
    }
    
    /**
     * 获取 CSS分类样式名称  
     * @return
     */
    @JsonIgnore
    public String getCssCatName(){
        Object objValue = this.get(FIELD_CSSCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 CSS分类样式名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCssCatNameDirty(){
        if(this.contains(FIELD_CSSCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 CSS分类样式名称
     */
    @JsonIgnore
    public void resetCssCatName(){
        this.reset(FIELD_CSSCATNAME);
    }

    /**
     * 设置 CSS分类样式名称
     * <P>
     * 等同 {@link #setCssCatName}
     * @param cssCatName
     */
    @JsonIgnore
    public PSSysCssCat csscatname(String cssCatName){
        this.setCssCatName(cssCatName);
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
    public PSSysCssCat memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSCSSCATTEMPLID</B>&nbsp;预置样式表分类，指定平台预置的样式表分类
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCSSCATTEMPLID = "pscsscattemplid";

    /**
     * 设置 预置样式表分类，详细说明：{@link #FIELD_PSCSSCATTEMPLID}
     * 
     * @param pSCssCatTemplId
     * 
     */
    @JsonProperty(FIELD_PSCSSCATTEMPLID)
    public void setPSCssCatTemplId(String pSCssCatTemplId){
        this.set(FIELD_PSCSSCATTEMPLID, pSCssCatTemplId);
    }
    
    /**
     * 获取 预置样式表分类  
     * @return
     */
    @JsonIgnore
    public String getPSCssCatTemplId(){
        Object objValue = this.get(FIELD_PSCSSCATTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置样式表分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCssCatTemplIdDirty(){
        if(this.contains(FIELD_PSCSSCATTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置样式表分类
     */
    @JsonIgnore
    public void resetPSCssCatTemplId(){
        this.reset(FIELD_PSCSSCATTEMPLID);
    }

    /**
     * 设置 预置样式表分类，详细说明：{@link #FIELD_PSCSSCATTEMPLID}
     * <P>
     * 等同 {@link #setPSCssCatTemplId}
     * @param pSCssCatTemplId
     */
    @JsonIgnore
    public PSSysCssCat pscsscattemplid(String pSCssCatTemplId){
        this.setPSCssCatTemplId(pSCssCatTemplId);
        return this;
    }

    /**
     * <B>PSCSSCATTEMPLNAME</B>&nbsp;预置样式表分类，指定平台预置的样式表分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCSSCATTEMPLID}
     */
    public final static String FIELD_PSCSSCATTEMPLNAME = "pscsscattemplname";

    /**
     * 设置 预置样式表分类，详细说明：{@link #FIELD_PSCSSCATTEMPLNAME}
     * 
     * @param pSCssCatTemplName
     * 
     */
    @JsonProperty(FIELD_PSCSSCATTEMPLNAME)
    public void setPSCssCatTemplName(String pSCssCatTemplName){
        this.set(FIELD_PSCSSCATTEMPLNAME, pSCssCatTemplName);
    }
    
    /**
     * 获取 预置样式表分类  
     * @return
     */
    @JsonIgnore
    public String getPSCssCatTemplName(){
        Object objValue = this.get(FIELD_PSCSSCATTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置样式表分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCssCatTemplNameDirty(){
        if(this.contains(FIELD_PSCSSCATTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置样式表分类
     */
    @JsonIgnore
    public void resetPSCssCatTemplName(){
        this.reset(FIELD_PSCSSCATTEMPLNAME);
    }

    /**
     * 设置 预置样式表分类，详细说明：{@link #FIELD_PSCSSCATTEMPLNAME}
     * <P>
     * 等同 {@link #setPSCssCatTemplName}
     * @param pSCssCatTemplName
     */
    @JsonIgnore
    public PSSysCssCat pscsscattemplname(String pSCssCatTemplName){
        this.setPSCssCatTemplName(pSCssCatTemplName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统界面样式表分类所在的系统模块
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
    public PSSysCssCat psmoduleid(String pSModuleId){
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
    public PSSysCssCat psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统界面样式表分类所在的系统模块
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
    public PSSysCssCat psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCSSCATID</B>&nbsp;系统界面样式表分类标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCSSCATID = "pssyscsscatid";

    /**
     * 设置 系统界面样式表分类标识
     * 
     * @param pSSysCssCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSCATID)
    public void setPSSysCssCatId(String pSSysCssCatId){
        this.set(FIELD_PSSYSCSSCATID, pSSysCssCatId);
    }
    
    /**
     * 获取 系统界面样式表分类标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssCatId(){
        Object objValue = this.get(FIELD_PSSYSCSSCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面样式表分类标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssCatIdDirty(){
        if(this.contains(FIELD_PSSYSCSSCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面样式表分类标识
     */
    @JsonIgnore
    public void resetPSSysCssCatId(){
        this.reset(FIELD_PSSYSCSSCATID);
    }

    /**
     * 设置 系统界面样式表分类标识
     * <P>
     * 等同 {@link #setPSSysCssCatId}
     * @param pSSysCssCatId
     */
    @JsonIgnore
    public PSSysCssCat pssyscsscatid(String pSSysCssCatId){
        this.setPSSysCssCatId(pSSysCssCatId);
        return this;
    }

    /**
     * <B>PSSYSCSSCATNAME</B>&nbsp;样式表分类名称，指定样式表分类的名称，需在所在模型域（模块或系统）具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCSSCATNAME = "pssyscsscatname";

    /**
     * 设置 样式表分类名称，详细说明：{@link #FIELD_PSSYSCSSCATNAME}
     * 
     * @param pSSysCssCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSCATNAME)
    public void setPSSysCssCatName(String pSSysCssCatName){
        this.set(FIELD_PSSYSCSSCATNAME, pSSysCssCatName);
    }
    
    /**
     * 获取 样式表分类名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssCatName(){
        Object objValue = this.get(FIELD_PSSYSCSSCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表分类名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssCatNameDirty(){
        if(this.contains(FIELD_PSSYSCSSCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表分类名称
     */
    @JsonIgnore
    public void resetPSSysCssCatName(){
        this.reset(FIELD_PSSYSCSSCATNAME);
    }

    /**
     * 设置 样式表分类名称，详细说明：{@link #FIELD_PSSYSCSSCATNAME}
     * <P>
     * 等同 {@link #setPSSysCssCatName}
     * @param pSSysCssCatName
     */
    @JsonIgnore
    public PSSysCssCat pssyscsscatname(String pSSysCssCatName){
        this.setPSSysCssCatName(pSSysCssCatName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCssCatName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCssCatName(strName);
    }

    @JsonIgnore
    public PSSysCssCat name(String strName){
        this.setPSSysCssCatName(strName);
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
    public PSSysCssCat updatedate(String updateDate){
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
    public PSSysCssCat updateman(String updateMan){
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
    public PSSysCssCat usercat(String userCat){
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
    public PSSysCssCat usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysCssCat usertag(String userTag){
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
    public PSSysCssCat usertag2(String userTag2){
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
    public PSSysCssCat usertag3(String userTag3){
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
    public PSSysCssCat usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCssCatId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCssCatId(strValue);
    }

    @JsonIgnore
    public PSSysCssCat id(String strValue){
        this.setPSSysCssCatId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysCssCat){
            PSSysCssCat model = (PSSysCssCat)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
