package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSSAMPLEVALUE</B>系统示例值 模型传输对象
 * <P>
 * 系统示例值模型，定义系统全局使用的示例值
 */
public class PSSysSampleValue extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSampleValue(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统示例数据的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysSampleValue codename(String codeName){
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
    public PSSysSampleValue createdate(String createDate){
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
    public PSSysSampleValue createman(String createMan){
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
    public PSSysSampleValue customcode(String customCode){
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
    public PSSysSampleValue custommode(Integer customMode){
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
    public PSSysSampleValue custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
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
    public PSSysSampleValue memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NULLVALUE</B>&nbsp;是否空值，指定示例值是否为空值，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NULLVALUE = "nullvalue";

    /**
     * 设置 是否空值，详细说明：{@link #FIELD_NULLVALUE}
     * 
     * @param nullValue
     * 
     */
    @JsonProperty(FIELD_NULLVALUE)
    public void setNullValue(Integer nullValue){
        this.set(FIELD_NULLVALUE, nullValue);
    }
    
    /**
     * 获取 是否空值  
     * @return
     */
    @JsonIgnore
    public Integer getNullValue(){
        Object objValue = this.get(FIELD_NULLVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否空值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNullValueDirty(){
        if(this.contains(FIELD_NULLVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否空值
     */
    @JsonIgnore
    public void resetNullValue(){
        this.reset(FIELD_NULLVALUE);
    }

    /**
     * 设置 是否空值，详细说明：{@link #FIELD_NULLVALUE}
     * <P>
     * 等同 {@link #setNullValue}
     * @param nullValue
     */
    @JsonIgnore
    public PSSysSampleValue nullvalue(Integer nullValue){
        this.setNullValue(nullValue);
        return this;
    }

     /**
     * 设置 是否空值，详细说明：{@link #FIELD_NULLVALUE}
     * <P>
     * 等同 {@link #setNullValue}
     * @param nullValue
     */
    @JsonIgnore
    public PSSysSampleValue nullvalue(Boolean nullValue){
        if(nullValue == null){
            this.setNullValue(null);
        }
        else{
            this.setNullValue(nullValue?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统示例值所在的系统模块
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
    public PSSysSampleValue psmoduleid(String pSModuleId){
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
    public PSSysSampleValue psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统示例值所在的系统模块
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
    public PSSysSampleValue psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSAMPLEVALUEID</B>&nbsp;平台预置示例值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSAMPLEVALUEID = "pssamplevalueid";

    /**
     * 设置 平台预置示例值
     * 
     * @param pSSampleValueId
     * 
     */
    @JsonProperty(FIELD_PSSAMPLEVALUEID)
    public void setPSSampleValueId(String pSSampleValueId){
        this.set(FIELD_PSSAMPLEVALUEID, pSSampleValueId);
    }
    
    /**
     * 获取 平台预置示例值  
     * @return
     */
    @JsonIgnore
    public String getPSSampleValueId(){
        Object objValue = this.get(FIELD_PSSAMPLEVALUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSampleValueIdDirty(){
        if(this.contains(FIELD_PSSAMPLEVALUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置示例值
     */
    @JsonIgnore
    public void resetPSSampleValueId(){
        this.reset(FIELD_PSSAMPLEVALUEID);
    }

    /**
     * 设置 平台预置示例值
     * <P>
     * 等同 {@link #setPSSampleValueId}
     * @param pSSampleValueId
     */
    @JsonIgnore
    public PSSysSampleValue pssamplevalueid(String pSSampleValueId){
        this.setPSSampleValueId(pSSampleValueId);
        return this;
    }

    /**
     * <B>PSSAMPLEVALUENAME</B>&nbsp;平台预置示例值
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSAMPLEVALUEID}
     */
    public final static String FIELD_PSSAMPLEVALUENAME = "pssamplevaluename";

    /**
     * 设置 平台预置示例值
     * 
     * @param pSSampleValueName
     * 
     */
    @JsonProperty(FIELD_PSSAMPLEVALUENAME)
    public void setPSSampleValueName(String pSSampleValueName){
        this.set(FIELD_PSSAMPLEVALUENAME, pSSampleValueName);
    }
    
    /**
     * 获取 平台预置示例值  
     * @return
     */
    @JsonIgnore
    public String getPSSampleValueName(){
        Object objValue = this.get(FIELD_PSSAMPLEVALUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSampleValueNameDirty(){
        if(this.contains(FIELD_PSSAMPLEVALUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置示例值
     */
    @JsonIgnore
    public void resetPSSampleValueName(){
        this.reset(FIELD_PSSAMPLEVALUENAME);
    }

    /**
     * 设置 平台预置示例值
     * <P>
     * 等同 {@link #setPSSampleValueName}
     * @param pSSampleValueName
     */
    @JsonIgnore
    public PSSysSampleValue pssamplevaluename(String pSSampleValueName){
        this.setPSSampleValueName(pSSampleValueName);
        return this;
    }

    /**
     * <B>PSSYSSAMPLEVALUEID</B>&nbsp;系统示例值标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSAMPLEVALUEID = "pssyssamplevalueid";

    /**
     * 设置 系统示例值标识
     * 
     * @param pSSysSampleValueId
     * 
     */
    @JsonProperty(FIELD_PSSYSSAMPLEVALUEID)
    public void setPSSysSampleValueId(String pSSysSampleValueId){
        this.set(FIELD_PSSYSSAMPLEVALUEID, pSSysSampleValueId);
    }
    
    /**
     * 获取 系统示例值标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSampleValueId(){
        Object objValue = this.get(FIELD_PSSYSSAMPLEVALUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统示例值标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSampleValueIdDirty(){
        if(this.contains(FIELD_PSSYSSAMPLEVALUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统示例值标识
     */
    @JsonIgnore
    public void resetPSSysSampleValueId(){
        this.reset(FIELD_PSSYSSAMPLEVALUEID);
    }

    /**
     * 设置 系统示例值标识
     * <P>
     * 等同 {@link #setPSSysSampleValueId}
     * @param pSSysSampleValueId
     */
    @JsonIgnore
    public PSSysSampleValue pssyssamplevalueid(String pSSysSampleValueId){
        this.setPSSysSampleValueId(pSSysSampleValueId);
        return this;
    }

    /**
     * <B>PSSYSSAMPLEVALUENAME</B>&nbsp;示例值名称，指定示例值的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSAMPLEVALUENAME = "pssyssamplevaluename";

    /**
     * 设置 示例值名称，详细说明：{@link #FIELD_PSSYSSAMPLEVALUENAME}
     * 
     * @param pSSysSampleValueName
     * 
     */
    @JsonProperty(FIELD_PSSYSSAMPLEVALUENAME)
    public void setPSSysSampleValueName(String pSSysSampleValueName){
        this.set(FIELD_PSSYSSAMPLEVALUENAME, pSSysSampleValueName);
    }
    
    /**
     * 获取 示例值名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSampleValueName(){
        Object objValue = this.get(FIELD_PSSYSSAMPLEVALUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例值名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSampleValueNameDirty(){
        if(this.contains(FIELD_PSSYSSAMPLEVALUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例值名称
     */
    @JsonIgnore
    public void resetPSSysSampleValueName(){
        this.reset(FIELD_PSSYSSAMPLEVALUENAME);
    }

    /**
     * 设置 示例值名称，详细说明：{@link #FIELD_PSSYSSAMPLEVALUENAME}
     * <P>
     * 等同 {@link #setPSSysSampleValueName}
     * @param pSSysSampleValueName
     */
    @JsonIgnore
    public PSSysSampleValue pssyssamplevaluename(String pSSysSampleValueName){
        this.setPSSysSampleValueName(pSSysSampleValueName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSampleValueName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSampleValueName(strName);
    }

    @JsonIgnore
    public PSSysSampleValue name(String strName){
        this.setPSSysSampleValueName(strName);
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
    public PSSysSampleValue updatedate(String updateDate){
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
    public PSSysSampleValue updateman(String updateMan){
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
    public PSSysSampleValue usercat(String userCat){
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
    public PSSysSampleValue usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSampleValue usertag(String userTag){
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
    public PSSysSampleValue usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysSampleValue usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysSampleValue usertag4(String userTag4){
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
    public PSSysSampleValue validflag(Integer validFlag){
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
    public PSSysSampleValue validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUE</B>&nbsp;值，指定示例值的值
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 设置 值，详细说明：{@link #FIELD_VALUE}
     * 
     * @param value
     * 
     */
    @JsonProperty(FIELD_VALUE)
    public void setValue(String value){
        this.set(FIELD_VALUE, value);
    }
    
    /**
     * 获取 值  
     * @return
     */
    @JsonIgnore
    public String getValue(){
        Object objValue = this.get(FIELD_VALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueDirty(){
        if(this.contains(FIELD_VALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值
     */
    @JsonIgnore
    public void resetValue(){
        this.reset(FIELD_VALUE);
    }

    /**
     * 设置 值，详细说明：{@link #FIELD_VALUE}
     * <P>
     * 等同 {@link #setValue}
     * @param value
     */
    @JsonIgnore
    public PSSysSampleValue value(String value){
        this.setValue(value);
        return this;
    }

    /**
     * <B>VALUELIST</B>&nbsp;随机值集合，指定示例值的随机值列表，值之间使用【;】分隔
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VALUELIST = "valuelist";

    /**
     * 设置 随机值集合，详细说明：{@link #FIELD_VALUELIST}
     * 
     * @param valueList
     * 
     */
    @JsonProperty(FIELD_VALUELIST)
    public void setValueList(String valueList){
        this.set(FIELD_VALUELIST, valueList);
    }
    
    /**
     * 获取 随机值集合  
     * @return
     */
    @JsonIgnore
    public String getValueList(){
        Object objValue = this.get(FIELD_VALUELIST);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 随机值集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueListDirty(){
        if(this.contains(FIELD_VALUELIST)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机值集合
     */
    @JsonIgnore
    public void resetValueList(){
        this.reset(FIELD_VALUELIST);
    }

    /**
     * 设置 随机值集合，详细说明：{@link #FIELD_VALUELIST}
     * <P>
     * 等同 {@link #setValueList}
     * @param valueList
     */
    @JsonIgnore
    public PSSysSampleValue valuelist(String valueList){
        this.setValueList(valueList);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSampleValueId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSampleValueId(strValue);
    }

    @JsonIgnore
    public PSSysSampleValue id(String strValue){
        this.setPSSysSampleValueId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSampleValue){
            PSSysSampleValue model = (PSSysSampleValue)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
