package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPUTIL</B>应用功能配置 模型传输对象
 * <P>
 * 应用的功能配置模型，定义指定应用功能配置参数及相关的实体信息
 */
public class PSAppUtil extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppUtil(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用功能配置的代码标识，需要在所在的前端应用中具有唯一性
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
    public PSAppUtil codename(String codeName){
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
    public PSAppUtil createdate(String createDate){
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
    public PSAppUtil createman(String createMan){
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
    public PSAppUtil memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPUTILID</B>&nbsp;应用功能配置标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPUTILID = "psapputilid";

    /**
     * 设置 应用功能配置标识
     * 
     * @param pSAppUtilId
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILID)
    public void setPSAppUtilId(String pSAppUtilId){
        this.set(FIELD_PSAPPUTILID, pSAppUtilId);
    }
    
    /**
     * 获取 应用功能配置标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilId(){
        Object objValue = this.get(FIELD_PSAPPUTILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用功能配置标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUtilIdDirty(){
        if(this.contains(FIELD_PSAPPUTILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用功能配置标识
     */
    @JsonIgnore
    public void resetPSAppUtilId(){
        this.reset(FIELD_PSAPPUTILID);
    }

    /**
     * 设置 应用功能配置标识
     * <P>
     * 等同 {@link #setPSAppUtilId}
     * @param pSAppUtilId
     */
    @JsonIgnore
    public PSAppUtil psapputilid(String pSAppUtilId){
        this.setPSAppUtilId(pSAppUtilId);
        return this;
    }

    /**
     * <B>PSAPPUTILNAME</B>&nbsp;功能配置名称，指定应用功能配置的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPUTILNAME = "psapputilname";

    /**
     * 设置 功能配置名称，详细说明：{@link #FIELD_PSAPPUTILNAME}
     * 
     * @param pSAppUtilName
     * 
     */
    @JsonProperty(FIELD_PSAPPUTILNAME)
    public void setPSAppUtilName(String pSAppUtilName){
        this.set(FIELD_PSAPPUTILNAME, pSAppUtilName);
    }
    
    /**
     * 获取 功能配置名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppUtilName(){
        Object objValue = this.get(FIELD_PSAPPUTILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能配置名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUtilNameDirty(){
        if(this.contains(FIELD_PSAPPUTILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能配置名称
     */
    @JsonIgnore
    public void resetPSAppUtilName(){
        this.reset(FIELD_PSAPPUTILNAME);
    }

    /**
     * 设置 功能配置名称，详细说明：{@link #FIELD_PSAPPUTILNAME}
     * <P>
     * 等同 {@link #setPSAppUtilName}
     * @param pSAppUtilName
     */
    @JsonIgnore
    public PSAppUtil psapputilname(String pSAppUtilName){
        this.setPSAppUtilName(pSAppUtilName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppUtilName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppUtilName(strName);
    }

    @JsonIgnore
    public PSAppUtil name(String strName){
        this.setPSAppUtilName(strName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用功能配置所属的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
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
    public PSAppUtil pssysappid(String pSSysAppId){
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
    public PSAppUtil pssysappid(PSSysApp pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用功能配置所属的前端应用
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
    public PSAppUtil pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSAppUtil pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSAppUtil pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSAppUtil pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端模板插件，指定应用功能配置使用的前端模板扩展插件，使用插件类型【应用功能插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端模板插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端模板插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSAppUtil pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSAppUtil pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端模板插件，指定应用功能配置使用的前端模板扩展插件，使用插件类型【应用功能插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端模板插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端模板插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSAppUtil pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSAppUtil updatedate(String updateDate){
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
    public PSAppUtil updateman(String updateMan){
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
    public PSAppUtil usercat(String userCat){
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
    public PSAppUtil usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSAppUtil usertag(String userTag){
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
    public PSAppUtil usertag2(String userTag2){
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
    public PSAppUtil usertag3(String userTag3){
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
    public PSAppUtil usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTILOBJ</B>&nbsp;功能对象，指定应用功能配置的程序组件对象，可独立完成功能或是作为代码基类对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_UTILOBJ = "utilobj";

    /**
     * 设置 功能对象，详细说明：{@link #FIELD_UTILOBJ}
     * 
     * @param utilObj
     * 
     */
    @JsonProperty(FIELD_UTILOBJ)
    public void setUtilObj(String utilObj){
        this.set(FIELD_UTILOBJ, utilObj);
    }
    
    /**
     * 获取 功能对象  
     * @return
     */
    @JsonIgnore
    public String getUtilObj(){
        Object objValue = this.get(FIELD_UTILOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilObjDirty(){
        if(this.contains(FIELD_UTILOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能对象
     */
    @JsonIgnore
    public void resetUtilObj(){
        this.reset(FIELD_UTILOBJ);
    }

    /**
     * 设置 功能对象，详细说明：{@link #FIELD_UTILOBJ}
     * <P>
     * 等同 {@link #setUtilObj}
     * @param utilObj
     */
    @JsonIgnore
    public PSAppUtil utilobj(String utilObj){
        this.setUtilObj(utilObj);
        return this;
    }

    /**
     * <B>UTILPARAM</B>&nbsp;功能参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM = "utilparam";

    /**
     * 设置 功能参数
     * 
     * @param utilParam
     * 
     */
    @JsonProperty(FIELD_UTILPARAM)
    public void setUtilParam(String utilParam){
        this.set(FIELD_UTILPARAM, utilParam);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getUtilParam(){
        Object objValue = this.get(FIELD_UTILPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParamDirty(){
        if(this.contains(FIELD_UTILPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetUtilParam(){
        this.reset(FIELD_UTILPARAM);
    }

    /**
     * 设置 功能参数
     * <P>
     * 等同 {@link #setUtilParam}
     * @param utilParam
     */
    @JsonIgnore
    public PSAppUtil utilparam(String utilParam){
        this.setUtilParam(utilParam);
        return this;
    }

    /**
     * <B>UTILPARAM10</B>&nbsp;功能参数10
     */
    public final static String FIELD_UTILPARAM10 = "utilparam10";

    /**
     * 设置 功能参数10
     * 
     * @param utilParam10
     * 
     */
    @JsonProperty(FIELD_UTILPARAM10)
    public void setUtilParam10(Integer utilParam10){
        this.set(FIELD_UTILPARAM10, utilParam10);
    }
    
    /**
     * 获取 功能参数10  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam10(){
        Object objValue = this.get(FIELD_UTILPARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam10Dirty(){
        if(this.contains(FIELD_UTILPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数10
     */
    @JsonIgnore
    public void resetUtilParam10(){
        this.reset(FIELD_UTILPARAM10);
    }

    /**
     * 设置 功能参数10
     * <P>
     * 等同 {@link #setUtilParam10}
     * @param utilParam10
     */
    @JsonIgnore
    public PSAppUtil utilparam10(Integer utilParam10){
        this.setUtilParam10(utilParam10);
        return this;
    }

    /**
     * <B>UTILPARAM11</B>&nbsp;功能参数11
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UTILPARAM11 = "utilparam11";

    /**
     * 设置 功能参数11
     * 
     * @param utilParam11
     * 
     */
    @JsonProperty(FIELD_UTILPARAM11)
    public void setUtilParam11(String utilParam11){
        this.set(FIELD_UTILPARAM11, utilParam11);
    }
    
    /**
     * 获取 功能参数11  
     * @return
     */
    @JsonIgnore
    public String getUtilParam11(){
        Object objValue = this.get(FIELD_UTILPARAM11);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam11Dirty(){
        if(this.contains(FIELD_UTILPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数11
     */
    @JsonIgnore
    public void resetUtilParam11(){
        this.reset(FIELD_UTILPARAM11);
    }

    /**
     * 设置 功能参数11
     * <P>
     * 等同 {@link #setUtilParam11}
     * @param utilParam11
     */
    @JsonIgnore
    public PSAppUtil utilparam11(String utilParam11){
        this.setUtilParam11(utilParam11);
        return this;
    }

    /**
     * <B>UTILPARAM12</B>&nbsp;功能参数12
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UTILPARAM12 = "utilparam12";

    /**
     * 设置 功能参数12
     * 
     * @param utilParam12
     * 
     */
    @JsonProperty(FIELD_UTILPARAM12)
    public void setUtilParam12(String utilParam12){
        this.set(FIELD_UTILPARAM12, utilParam12);
    }
    
    /**
     * 获取 功能参数12  
     * @return
     */
    @JsonIgnore
    public String getUtilParam12(){
        Object objValue = this.get(FIELD_UTILPARAM12);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam12Dirty(){
        if(this.contains(FIELD_UTILPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数12
     */
    @JsonIgnore
    public void resetUtilParam12(){
        this.reset(FIELD_UTILPARAM12);
    }

    /**
     * 设置 功能参数12
     * <P>
     * 等同 {@link #setUtilParam12}
     * @param utilParam12
     */
    @JsonIgnore
    public PSAppUtil utilparam12(String utilParam12){
        this.setUtilParam12(utilParam12);
        return this;
    }

    /**
     * <B>UTILPARAM2</B>&nbsp;功能参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM2 = "utilparam2";

    /**
     * 设置 功能参数2
     * 
     * @param utilParam2
     * 
     */
    @JsonProperty(FIELD_UTILPARAM2)
    public void setUtilParam2(String utilParam2){
        this.set(FIELD_UTILPARAM2, utilParam2);
    }
    
    /**
     * 获取 功能参数2  
     * @return
     */
    @JsonIgnore
    public String getUtilParam2(){
        Object objValue = this.get(FIELD_UTILPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam2Dirty(){
        if(this.contains(FIELD_UTILPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数2
     */
    @JsonIgnore
    public void resetUtilParam2(){
        this.reset(FIELD_UTILPARAM2);
    }

    /**
     * 设置 功能参数2
     * <P>
     * 等同 {@link #setUtilParam2}
     * @param utilParam2
     */
    @JsonIgnore
    public PSAppUtil utilparam2(String utilParam2){
        this.setUtilParam2(utilParam2);
        return this;
    }

    /**
     * <B>UTILPARAM3</B>&nbsp;功能参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM3 = "utilparam3";

    /**
     * 设置 功能参数3
     * 
     * @param utilParam3
     * 
     */
    @JsonProperty(FIELD_UTILPARAM3)
    public void setUtilParam3(String utilParam3){
        this.set(FIELD_UTILPARAM3, utilParam3);
    }
    
    /**
     * 获取 功能参数3  
     * @return
     */
    @JsonIgnore
    public String getUtilParam3(){
        Object objValue = this.get(FIELD_UTILPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam3Dirty(){
        if(this.contains(FIELD_UTILPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数3
     */
    @JsonIgnore
    public void resetUtilParam3(){
        this.reset(FIELD_UTILPARAM3);
    }

    /**
     * 设置 功能参数3
     * <P>
     * 等同 {@link #setUtilParam3}
     * @param utilParam3
     */
    @JsonIgnore
    public PSAppUtil utilparam3(String utilParam3){
        this.setUtilParam3(utilParam3);
        return this;
    }

    /**
     * <B>UTILPARAM4</B>&nbsp;功能参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILPARAM4 = "utilparam4";

    /**
     * 设置 功能参数4
     * 
     * @param utilParam4
     * 
     */
    @JsonProperty(FIELD_UTILPARAM4)
    public void setUtilParam4(String utilParam4){
        this.set(FIELD_UTILPARAM4, utilParam4);
    }
    
    /**
     * 获取 功能参数4  
     * @return
     */
    @JsonIgnore
    public String getUtilParam4(){
        Object objValue = this.get(FIELD_UTILPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam4Dirty(){
        if(this.contains(FIELD_UTILPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数4
     */
    @JsonIgnore
    public void resetUtilParam4(){
        this.reset(FIELD_UTILPARAM4);
    }

    /**
     * 设置 功能参数4
     * <P>
     * 等同 {@link #setUtilParam4}
     * @param utilParam4
     */
    @JsonIgnore
    public PSAppUtil utilparam4(String utilParam4){
        this.setUtilParam4(utilParam4);
        return this;
    }

    /**
     * <B>UTILPARAM5</B>&nbsp;功能参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UTILPARAM5 = "utilparam5";

    /**
     * 设置 功能参数5
     * 
     * @param utilParam5
     * 
     */
    @JsonProperty(FIELD_UTILPARAM5)
    public void setUtilParam5(Integer utilParam5){
        this.set(FIELD_UTILPARAM5, utilParam5);
    }
    
    /**
     * 获取 功能参数5  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam5(){
        Object objValue = this.get(FIELD_UTILPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam5Dirty(){
        if(this.contains(FIELD_UTILPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数5
     */
    @JsonIgnore
    public void resetUtilParam5(){
        this.reset(FIELD_UTILPARAM5);
    }

    /**
     * 设置 功能参数5
     * <P>
     * 等同 {@link #setUtilParam5}
     * @param utilParam5
     */
    @JsonIgnore
    public PSAppUtil utilparam5(Integer utilParam5){
        this.setUtilParam5(utilParam5);
        return this;
    }

     /**
     * 设置 功能参数5
     * <P>
     * 等同 {@link #setUtilParam5}
     * @param utilParam5
     */
    @JsonIgnore
    public PSAppUtil utilparam5(Boolean utilParam5){
        if(utilParam5 == null){
            this.setUtilParam5(null);
        }
        else{
            this.setUtilParam5(utilParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UTILPARAM6</B>&nbsp;功能参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UTILPARAM6 = "utilparam6";

    /**
     * 设置 功能参数6
     * 
     * @param utilParam6
     * 
     */
    @JsonProperty(FIELD_UTILPARAM6)
    public void setUtilParam6(Integer utilParam6){
        this.set(FIELD_UTILPARAM6, utilParam6);
    }
    
    /**
     * 获取 功能参数6  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam6(){
        Object objValue = this.get(FIELD_UTILPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam6Dirty(){
        if(this.contains(FIELD_UTILPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数6
     */
    @JsonIgnore
    public void resetUtilParam6(){
        this.reset(FIELD_UTILPARAM6);
    }

    /**
     * 设置 功能参数6
     * <P>
     * 等同 {@link #setUtilParam6}
     * @param utilParam6
     */
    @JsonIgnore
    public PSAppUtil utilparam6(Integer utilParam6){
        this.setUtilParam6(utilParam6);
        return this;
    }

     /**
     * 设置 功能参数6
     * <P>
     * 等同 {@link #setUtilParam6}
     * @param utilParam6
     */
    @JsonIgnore
    public PSAppUtil utilparam6(Boolean utilParam6){
        if(utilParam6 == null){
            this.setUtilParam6(null);
        }
        else{
            this.setUtilParam6(utilParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UTILPARAM7</B>&nbsp;功能参数7
     */
    public final static String FIELD_UTILPARAM7 = "utilparam7";

    /**
     * 设置 功能参数7
     * 
     * @param utilParam7
     * 
     */
    @JsonProperty(FIELD_UTILPARAM7)
    public void setUtilParam7(Integer utilParam7){
        this.set(FIELD_UTILPARAM7, utilParam7);
    }
    
    /**
     * 获取 功能参数7  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam7(){
        Object objValue = this.get(FIELD_UTILPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam7Dirty(){
        if(this.contains(FIELD_UTILPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数7
     */
    @JsonIgnore
    public void resetUtilParam7(){
        this.reset(FIELD_UTILPARAM7);
    }

    /**
     * 设置 功能参数7
     * <P>
     * 等同 {@link #setUtilParam7}
     * @param utilParam7
     */
    @JsonIgnore
    public PSAppUtil utilparam7(Integer utilParam7){
        this.setUtilParam7(utilParam7);
        return this;
    }

    /**
     * <B>UTILPARAM8</B>&nbsp;功能参数8
     */
    public final static String FIELD_UTILPARAM8 = "utilparam8";

    /**
     * 设置 功能参数8
     * 
     * @param utilParam8
     * 
     */
    @JsonProperty(FIELD_UTILPARAM8)
    public void setUtilParam8(Integer utilParam8){
        this.set(FIELD_UTILPARAM8, utilParam8);
    }
    
    /**
     * 获取 功能参数8  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam8(){
        Object objValue = this.get(FIELD_UTILPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam8Dirty(){
        if(this.contains(FIELD_UTILPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数8
     */
    @JsonIgnore
    public void resetUtilParam8(){
        this.reset(FIELD_UTILPARAM8);
    }

    /**
     * 设置 功能参数8
     * <P>
     * 等同 {@link #setUtilParam8}
     * @param utilParam8
     */
    @JsonIgnore
    public PSAppUtil utilparam8(Integer utilParam8){
        this.setUtilParam8(utilParam8);
        return this;
    }

    /**
     * <B>UTILPARAM9</B>&nbsp;功能参数9
     */
    public final static String FIELD_UTILPARAM9 = "utilparam9";

    /**
     * 设置 功能参数9
     * 
     * @param utilParam9
     * 
     */
    @JsonProperty(FIELD_UTILPARAM9)
    public void setUtilParam9(Integer utilParam9){
        this.set(FIELD_UTILPARAM9, utilParam9);
    }
    
    /**
     * 获取 功能参数9  
     * @return
     */
    @JsonIgnore
    public Integer getUtilParam9(){
        Object objValue = this.get(FIELD_UTILPARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 功能参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParam9Dirty(){
        if(this.contains(FIELD_UTILPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数9
     */
    @JsonIgnore
    public void resetUtilParam9(){
        this.reset(FIELD_UTILPARAM9);
    }

    /**
     * 设置 功能参数9
     * <P>
     * 等同 {@link #setUtilParam9}
     * @param utilParam9
     */
    @JsonIgnore
    public PSAppUtil utilparam9(Integer utilParam9){
        this.setUtilParam9(utilParam9);
        return this;
    }

    /**
     * <B>UTILPARAMS</B>&nbsp;功能参数，指定应用功能配置的功能参数集合
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_UTILPARAMS = "utilparams";

    /**
     * 设置 功能参数，详细说明：{@link #FIELD_UTILPARAMS}
     * 
     * @param utilParams
     * 
     */
    @JsonProperty(FIELD_UTILPARAMS)
    public void setUtilParams(String utilParams){
        this.set(FIELD_UTILPARAMS, utilParams);
    }
    
    /**
     * 获取 功能参数  
     * @return
     */
    @JsonIgnore
    public String getUtilParams(){
        Object objValue = this.get(FIELD_UTILPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilParamsDirty(){
        if(this.contains(FIELD_UTILPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能参数
     */
    @JsonIgnore
    public void resetUtilParams(){
        this.reset(FIELD_UTILPARAMS);
    }

    /**
     * 设置 功能参数，详细说明：{@link #FIELD_UTILPARAMS}
     * <P>
     * 等同 {@link #setUtilParams}
     * @param utilParams
     */
    @JsonIgnore
    public PSAppUtil utilparams(String utilParams){
        this.setUtilParams(utilParams);
        return this;
    }

    /**
     * <B>UTILPSDE2ID</B>&nbsp;功能实体2，指定应用功能配置的相关功能实体2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE2ID = "utilpsde2id";

    /**
     * 设置 功能实体2，详细说明：{@link #FIELD_UTILPSDE2ID}
     * 
     * @param utilPSDE2Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE2ID)
    public void setUtilPSDE2Id(String utilPSDE2Id){
        this.set(FIELD_UTILPSDE2ID, utilPSDE2Id);
    }
    
    /**
     * 获取 功能实体2  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE2Id(){
        Object objValue = this.get(FIELD_UTILPSDE2ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE2IdDirty(){
        if(this.contains(FIELD_UTILPSDE2ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体2
     */
    @JsonIgnore
    public void resetUtilPSDE2Id(){
        this.reset(FIELD_UTILPSDE2ID);
    }

    /**
     * 设置 功能实体2，详细说明：{@link #FIELD_UTILPSDE2ID}
     * <P>
     * 等同 {@link #setUtilPSDE2Id}
     * @param utilPSDE2Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde2id(String utilPSDE2Id){
        this.setUtilPSDE2Id(utilPSDE2Id);
        return this;
    }

    /**
     * 设置 功能实体2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE2Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde2id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE2Id(null);
            this.setUtilPSDE2Name(null);
        }
        else{
            this.setUtilPSDE2Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE2Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE2NAME</B>&nbsp;功能实体2，指定应用功能配置的相关功能实体2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE2ID}
     */
    public final static String FIELD_UTILPSDE2NAME = "utilpsde2name";

    /**
     * 设置 功能实体2，详细说明：{@link #FIELD_UTILPSDE2NAME}
     * 
     * @param utilPSDE2Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE2NAME)
    public void setUtilPSDE2Name(String utilPSDE2Name){
        this.set(FIELD_UTILPSDE2NAME, utilPSDE2Name);
    }
    
    /**
     * 获取 功能实体2  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE2Name(){
        Object objValue = this.get(FIELD_UTILPSDE2NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE2NameDirty(){
        if(this.contains(FIELD_UTILPSDE2NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体2
     */
    @JsonIgnore
    public void resetUtilPSDE2Name(){
        this.reset(FIELD_UTILPSDE2NAME);
    }

    /**
     * 设置 功能实体2，详细说明：{@link #FIELD_UTILPSDE2NAME}
     * <P>
     * 等同 {@link #setUtilPSDE2Name}
     * @param utilPSDE2Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde2name(String utilPSDE2Name){
        this.setUtilPSDE2Name(utilPSDE2Name);
        return this;
    }

    /**
     * <B>UTILPSDE3ID</B>&nbsp;功能实体3，指定应用功能配置的相关功能实体3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE3ID = "utilpsde3id";

    /**
     * 设置 功能实体3，详细说明：{@link #FIELD_UTILPSDE3ID}
     * 
     * @param utilPSDE3Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE3ID)
    public void setUtilPSDE3Id(String utilPSDE3Id){
        this.set(FIELD_UTILPSDE3ID, utilPSDE3Id);
    }
    
    /**
     * 获取 功能实体3  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE3Id(){
        Object objValue = this.get(FIELD_UTILPSDE3ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE3IdDirty(){
        if(this.contains(FIELD_UTILPSDE3ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体3
     */
    @JsonIgnore
    public void resetUtilPSDE3Id(){
        this.reset(FIELD_UTILPSDE3ID);
    }

    /**
     * 设置 功能实体3，详细说明：{@link #FIELD_UTILPSDE3ID}
     * <P>
     * 等同 {@link #setUtilPSDE3Id}
     * @param utilPSDE3Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde3id(String utilPSDE3Id){
        this.setUtilPSDE3Id(utilPSDE3Id);
        return this;
    }

    /**
     * 设置 功能实体3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE3Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde3id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE3Id(null);
            this.setUtilPSDE3Name(null);
        }
        else{
            this.setUtilPSDE3Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE3Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE3NAME</B>&nbsp;功能实体3，指定应用功能配置的相关功能实体3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE3ID}
     */
    public final static String FIELD_UTILPSDE3NAME = "utilpsde3name";

    /**
     * 设置 功能实体3，详细说明：{@link #FIELD_UTILPSDE3NAME}
     * 
     * @param utilPSDE3Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE3NAME)
    public void setUtilPSDE3Name(String utilPSDE3Name){
        this.set(FIELD_UTILPSDE3NAME, utilPSDE3Name);
    }
    
    /**
     * 获取 功能实体3  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE3Name(){
        Object objValue = this.get(FIELD_UTILPSDE3NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE3NameDirty(){
        if(this.contains(FIELD_UTILPSDE3NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体3
     */
    @JsonIgnore
    public void resetUtilPSDE3Name(){
        this.reset(FIELD_UTILPSDE3NAME);
    }

    /**
     * 设置 功能实体3，详细说明：{@link #FIELD_UTILPSDE3NAME}
     * <P>
     * 等同 {@link #setUtilPSDE3Name}
     * @param utilPSDE3Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde3name(String utilPSDE3Name){
        this.setUtilPSDE3Name(utilPSDE3Name);
        return this;
    }

    /**
     * <B>UTILPSDE4ID</B>&nbsp;功能实体4，指定应用功能配置的相关功能实体4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE4ID = "utilpsde4id";

    /**
     * 设置 功能实体4，详细说明：{@link #FIELD_UTILPSDE4ID}
     * 
     * @param utilPSDE4Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE4ID)
    public void setUtilPSDE4Id(String utilPSDE4Id){
        this.set(FIELD_UTILPSDE4ID, utilPSDE4Id);
    }
    
    /**
     * 获取 功能实体4  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE4Id(){
        Object objValue = this.get(FIELD_UTILPSDE4ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE4IdDirty(){
        if(this.contains(FIELD_UTILPSDE4ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体4
     */
    @JsonIgnore
    public void resetUtilPSDE4Id(){
        this.reset(FIELD_UTILPSDE4ID);
    }

    /**
     * 设置 功能实体4，详细说明：{@link #FIELD_UTILPSDE4ID}
     * <P>
     * 等同 {@link #setUtilPSDE4Id}
     * @param utilPSDE4Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde4id(String utilPSDE4Id){
        this.setUtilPSDE4Id(utilPSDE4Id);
        return this;
    }

    /**
     * 设置 功能实体4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE4Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde4id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE4Id(null);
            this.setUtilPSDE4Name(null);
        }
        else{
            this.setUtilPSDE4Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE4Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE4NAME</B>&nbsp;功能实体4，指定应用功能配置的相关功能实体4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE4ID}
     */
    public final static String FIELD_UTILPSDE4NAME = "utilpsde4name";

    /**
     * 设置 功能实体4，详细说明：{@link #FIELD_UTILPSDE4NAME}
     * 
     * @param utilPSDE4Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE4NAME)
    public void setUtilPSDE4Name(String utilPSDE4Name){
        this.set(FIELD_UTILPSDE4NAME, utilPSDE4Name);
    }
    
    /**
     * 获取 功能实体4  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE4Name(){
        Object objValue = this.get(FIELD_UTILPSDE4NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE4NameDirty(){
        if(this.contains(FIELD_UTILPSDE4NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体4
     */
    @JsonIgnore
    public void resetUtilPSDE4Name(){
        this.reset(FIELD_UTILPSDE4NAME);
    }

    /**
     * 设置 功能实体4，详细说明：{@link #FIELD_UTILPSDE4NAME}
     * <P>
     * 等同 {@link #setUtilPSDE4Name}
     * @param utilPSDE4Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde4name(String utilPSDE4Name){
        this.setUtilPSDE4Name(utilPSDE4Name);
        return this;
    }

    /**
     * <B>UTILPSDE5ID</B>&nbsp;功能实体5，指定应用功能配置的相关功能实体5
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE5ID = "utilpsde5id";

    /**
     * 设置 功能实体5，详细说明：{@link #FIELD_UTILPSDE5ID}
     * 
     * @param utilPSDE5Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE5ID)
    public void setUtilPSDE5Id(String utilPSDE5Id){
        this.set(FIELD_UTILPSDE5ID, utilPSDE5Id);
    }
    
    /**
     * 获取 功能实体5  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE5Id(){
        Object objValue = this.get(FIELD_UTILPSDE5ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE5IdDirty(){
        if(this.contains(FIELD_UTILPSDE5ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体5
     */
    @JsonIgnore
    public void resetUtilPSDE5Id(){
        this.reset(FIELD_UTILPSDE5ID);
    }

    /**
     * 设置 功能实体5，详细说明：{@link #FIELD_UTILPSDE5ID}
     * <P>
     * 等同 {@link #setUtilPSDE5Id}
     * @param utilPSDE5Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde5id(String utilPSDE5Id){
        this.setUtilPSDE5Id(utilPSDE5Id);
        return this;
    }

    /**
     * 设置 功能实体5，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE5Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde5id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE5Id(null);
            this.setUtilPSDE5Name(null);
        }
        else{
            this.setUtilPSDE5Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE5Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE5NAME</B>&nbsp;功能实体5，指定应用功能配置的相关功能实体5
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE5ID}
     */
    public final static String FIELD_UTILPSDE5NAME = "utilpsde5name";

    /**
     * 设置 功能实体5，详细说明：{@link #FIELD_UTILPSDE5NAME}
     * 
     * @param utilPSDE5Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE5NAME)
    public void setUtilPSDE5Name(String utilPSDE5Name){
        this.set(FIELD_UTILPSDE5NAME, utilPSDE5Name);
    }
    
    /**
     * 获取 功能实体5  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE5Name(){
        Object objValue = this.get(FIELD_UTILPSDE5NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE5NameDirty(){
        if(this.contains(FIELD_UTILPSDE5NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体5
     */
    @JsonIgnore
    public void resetUtilPSDE5Name(){
        this.reset(FIELD_UTILPSDE5NAME);
    }

    /**
     * 设置 功能实体5，详细说明：{@link #FIELD_UTILPSDE5NAME}
     * <P>
     * 等同 {@link #setUtilPSDE5Name}
     * @param utilPSDE5Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde5name(String utilPSDE5Name){
        this.setUtilPSDE5Name(utilPSDE5Name);
        return this;
    }

    /**
     * <B>UTILPSDE6ID</B>&nbsp;功能实体6，指定应用功能配置的相关功能实体6
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE6ID = "utilpsde6id";

    /**
     * 设置 功能实体6，详细说明：{@link #FIELD_UTILPSDE6ID}
     * 
     * @param utilPSDE6Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE6ID)
    public void setUtilPSDE6Id(String utilPSDE6Id){
        this.set(FIELD_UTILPSDE6ID, utilPSDE6Id);
    }
    
    /**
     * 获取 功能实体6  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE6Id(){
        Object objValue = this.get(FIELD_UTILPSDE6ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE6IdDirty(){
        if(this.contains(FIELD_UTILPSDE6ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体6
     */
    @JsonIgnore
    public void resetUtilPSDE6Id(){
        this.reset(FIELD_UTILPSDE6ID);
    }

    /**
     * 设置 功能实体6，详细说明：{@link #FIELD_UTILPSDE6ID}
     * <P>
     * 等同 {@link #setUtilPSDE6Id}
     * @param utilPSDE6Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde6id(String utilPSDE6Id){
        this.setUtilPSDE6Id(utilPSDE6Id);
        return this;
    }

    /**
     * 设置 功能实体6，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE6Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde6id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE6Id(null);
            this.setUtilPSDE6Name(null);
        }
        else{
            this.setUtilPSDE6Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE6Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE6NAME</B>&nbsp;功能实体6，指定应用功能配置的相关功能实体6
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE6ID}
     */
    public final static String FIELD_UTILPSDE6NAME = "utilpsde6name";

    /**
     * 设置 功能实体6，详细说明：{@link #FIELD_UTILPSDE6NAME}
     * 
     * @param utilPSDE6Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE6NAME)
    public void setUtilPSDE6Name(String utilPSDE6Name){
        this.set(FIELD_UTILPSDE6NAME, utilPSDE6Name);
    }
    
    /**
     * 获取 功能实体6  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE6Name(){
        Object objValue = this.get(FIELD_UTILPSDE6NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE6NameDirty(){
        if(this.contains(FIELD_UTILPSDE6NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体6
     */
    @JsonIgnore
    public void resetUtilPSDE6Name(){
        this.reset(FIELD_UTILPSDE6NAME);
    }

    /**
     * 设置 功能实体6，详细说明：{@link #FIELD_UTILPSDE6NAME}
     * <P>
     * 等同 {@link #setUtilPSDE6Name}
     * @param utilPSDE6Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde6name(String utilPSDE6Name){
        this.setUtilPSDE6Name(utilPSDE6Name);
        return this;
    }

    /**
     * <B>UTILPSDE7ID</B>&nbsp;功能实体7，指定应用功能配置的相关功能实体7
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE7ID = "utilpsde7id";

    /**
     * 设置 功能实体7，详细说明：{@link #FIELD_UTILPSDE7ID}
     * 
     * @param utilPSDE7Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE7ID)
    public void setUtilPSDE7Id(String utilPSDE7Id){
        this.set(FIELD_UTILPSDE7ID, utilPSDE7Id);
    }
    
    /**
     * 获取 功能实体7  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE7Id(){
        Object objValue = this.get(FIELD_UTILPSDE7ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE7IdDirty(){
        if(this.contains(FIELD_UTILPSDE7ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体7
     */
    @JsonIgnore
    public void resetUtilPSDE7Id(){
        this.reset(FIELD_UTILPSDE7ID);
    }

    /**
     * 设置 功能实体7，详细说明：{@link #FIELD_UTILPSDE7ID}
     * <P>
     * 等同 {@link #setUtilPSDE7Id}
     * @param utilPSDE7Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde7id(String utilPSDE7Id){
        this.setUtilPSDE7Id(utilPSDE7Id);
        return this;
    }

    /**
     * 设置 功能实体7，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE7Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde7id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE7Id(null);
            this.setUtilPSDE7Name(null);
        }
        else{
            this.setUtilPSDE7Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE7Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE7NAME</B>&nbsp;功能实体7，指定应用功能配置的相关功能实体7
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE7ID}
     */
    public final static String FIELD_UTILPSDE7NAME = "utilpsde7name";

    /**
     * 设置 功能实体7，详细说明：{@link #FIELD_UTILPSDE7NAME}
     * 
     * @param utilPSDE7Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE7NAME)
    public void setUtilPSDE7Name(String utilPSDE7Name){
        this.set(FIELD_UTILPSDE7NAME, utilPSDE7Name);
    }
    
    /**
     * 获取 功能实体7  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE7Name(){
        Object objValue = this.get(FIELD_UTILPSDE7NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE7NameDirty(){
        if(this.contains(FIELD_UTILPSDE7NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体7
     */
    @JsonIgnore
    public void resetUtilPSDE7Name(){
        this.reset(FIELD_UTILPSDE7NAME);
    }

    /**
     * 设置 功能实体7，详细说明：{@link #FIELD_UTILPSDE7NAME}
     * <P>
     * 等同 {@link #setUtilPSDE7Name}
     * @param utilPSDE7Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde7name(String utilPSDE7Name){
        this.setUtilPSDE7Name(utilPSDE7Name);
        return this;
    }

    /**
     * <B>UTILPSDE8ID</B>&nbsp;功能实体8，指定应用功能配置的相关功能实体8
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE8ID = "utilpsde8id";

    /**
     * 设置 功能实体8，详细说明：{@link #FIELD_UTILPSDE8ID}
     * 
     * @param utilPSDE8Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE8ID)
    public void setUtilPSDE8Id(String utilPSDE8Id){
        this.set(FIELD_UTILPSDE8ID, utilPSDE8Id);
    }
    
    /**
     * 获取 功能实体8  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE8Id(){
        Object objValue = this.get(FIELD_UTILPSDE8ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE8IdDirty(){
        if(this.contains(FIELD_UTILPSDE8ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体8
     */
    @JsonIgnore
    public void resetUtilPSDE8Id(){
        this.reset(FIELD_UTILPSDE8ID);
    }

    /**
     * 设置 功能实体8，详细说明：{@link #FIELD_UTILPSDE8ID}
     * <P>
     * 等同 {@link #setUtilPSDE8Id}
     * @param utilPSDE8Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde8id(String utilPSDE8Id){
        this.setUtilPSDE8Id(utilPSDE8Id);
        return this;
    }

    /**
     * 设置 功能实体8，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE8Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde8id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE8Id(null);
            this.setUtilPSDE8Name(null);
        }
        else{
            this.setUtilPSDE8Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE8Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE8NAME</B>&nbsp;功能实体8，指定应用功能配置的相关功能实体8
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE8ID}
     */
    public final static String FIELD_UTILPSDE8NAME = "utilpsde8name";

    /**
     * 设置 功能实体8，详细说明：{@link #FIELD_UTILPSDE8NAME}
     * 
     * @param utilPSDE8Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE8NAME)
    public void setUtilPSDE8Name(String utilPSDE8Name){
        this.set(FIELD_UTILPSDE8NAME, utilPSDE8Name);
    }
    
    /**
     * 获取 功能实体8  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE8Name(){
        Object objValue = this.get(FIELD_UTILPSDE8NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE8NameDirty(){
        if(this.contains(FIELD_UTILPSDE8NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体8
     */
    @JsonIgnore
    public void resetUtilPSDE8Name(){
        this.reset(FIELD_UTILPSDE8NAME);
    }

    /**
     * 设置 功能实体8，详细说明：{@link #FIELD_UTILPSDE8NAME}
     * <P>
     * 等同 {@link #setUtilPSDE8Name}
     * @param utilPSDE8Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde8name(String utilPSDE8Name){
        this.setUtilPSDE8Name(utilPSDE8Name);
        return this;
    }

    /**
     * <B>UTILPSDE9ID</B>&nbsp;功能实体9，指定应用功能配置的相关功能实体9
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDE9ID = "utilpsde9id";

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9ID}
     * 
     * @param utilPSDE9Id
     * 
     */
    @JsonProperty(FIELD_UTILPSDE9ID)
    public void setUtilPSDE9Id(String utilPSDE9Id){
        this.set(FIELD_UTILPSDE9ID, utilPSDE9Id);
    }
    
    /**
     * 获取 功能实体9  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE9Id(){
        Object objValue = this.get(FIELD_UTILPSDE9ID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE9IdDirty(){
        if(this.contains(FIELD_UTILPSDE9ID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体9
     */
    @JsonIgnore
    public void resetUtilPSDE9Id(){
        this.reset(FIELD_UTILPSDE9ID);
    }

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9ID}
     * <P>
     * 等同 {@link #setUtilPSDE9Id}
     * @param utilPSDE9Id
     */
    @JsonIgnore
    public PSAppUtil utilpsde9id(String utilPSDE9Id){
        this.setUtilPSDE9Id(utilPSDE9Id);
        return this;
    }

    /**
     * 设置 功能实体9，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDE9Id}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsde9id(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDE9Id(null);
            this.setUtilPSDE9Name(null);
        }
        else{
            this.setUtilPSDE9Id(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDE9Name(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDE9NAME</B>&nbsp;功能实体9，指定应用功能配置的相关功能实体9
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDE9ID}
     */
    public final static String FIELD_UTILPSDE9NAME = "utilpsde9name";

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9NAME}
     * 
     * @param utilPSDE9Name
     * 
     */
    @JsonProperty(FIELD_UTILPSDE9NAME)
    public void setUtilPSDE9Name(String utilPSDE9Name){
        this.set(FIELD_UTILPSDE9NAME, utilPSDE9Name);
    }
    
    /**
     * 获取 功能实体9  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDE9Name(){
        Object objValue = this.get(FIELD_UTILPSDE9NAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDE9NameDirty(){
        if(this.contains(FIELD_UTILPSDE9NAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体9
     */
    @JsonIgnore
    public void resetUtilPSDE9Name(){
        this.reset(FIELD_UTILPSDE9NAME);
    }

    /**
     * 设置 功能实体9，详细说明：{@link #FIELD_UTILPSDE9NAME}
     * <P>
     * 等同 {@link #setUtilPSDE9Name}
     * @param utilPSDE9Name
     */
    @JsonIgnore
    public PSAppUtil utilpsde9name(String utilPSDE9Name){
        this.setUtilPSDE9Name(utilPSDE9Name);
        return this;
    }

    /**
     * <B>UTILPSDEID</B>&nbsp;功能实体，指定应用功能配置的相关功能实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_UTILPSDEID = "utilpsdeid";

    /**
     * 设置 功能实体，详细说明：{@link #FIELD_UTILPSDEID}
     * 
     * @param utilPSDEId
     * 
     */
    @JsonProperty(FIELD_UTILPSDEID)
    public void setUtilPSDEId(String utilPSDEId){
        this.set(FIELD_UTILPSDEID, utilPSDEId);
    }
    
    /**
     * 获取 功能实体  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEId(){
        Object objValue = this.get(FIELD_UTILPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDEIdDirty(){
        if(this.contains(FIELD_UTILPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体
     */
    @JsonIgnore
    public void resetUtilPSDEId(){
        this.reset(FIELD_UTILPSDEID);
    }

    /**
     * 设置 功能实体，详细说明：{@link #FIELD_UTILPSDEID}
     * <P>
     * 等同 {@link #setUtilPSDEId}
     * @param utilPSDEId
     */
    @JsonIgnore
    public PSAppUtil utilpsdeid(String utilPSDEId){
        this.setUtilPSDEId(utilPSDEId);
        return this;
    }

    /**
     * 设置 功能实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUtilPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppUtil utilpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setUtilPSDEId(null);
            this.setUtilPSDEName(null);
        }
        else{
            this.setUtilPSDEId(pSDataEntity.getPSDataEntityId());
            this.setUtilPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>UTILPSDENAME</B>&nbsp;功能实体，指定应用功能配置的相关功能实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_UTILPSDEID}
     */
    public final static String FIELD_UTILPSDENAME = "utilpsdename";

    /**
     * 设置 功能实体，详细说明：{@link #FIELD_UTILPSDENAME}
     * 
     * @param utilPSDEName
     * 
     */
    @JsonProperty(FIELD_UTILPSDENAME)
    public void setUtilPSDEName(String utilPSDEName){
        this.set(FIELD_UTILPSDENAME, utilPSDEName);
    }
    
    /**
     * 获取 功能实体  
     * @return
     */
    @JsonIgnore
    public String getUtilPSDEName(){
        Object objValue = this.get(FIELD_UTILPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilPSDENameDirty(){
        if(this.contains(FIELD_UTILPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能实体
     */
    @JsonIgnore
    public void resetUtilPSDEName(){
        this.reset(FIELD_UTILPSDENAME);
    }

    /**
     * 设置 功能实体，详细说明：{@link #FIELD_UTILPSDENAME}
     * <P>
     * 等同 {@link #setUtilPSDEName}
     * @param utilPSDEName
     */
    @JsonIgnore
    public PSAppUtil utilpsdename(String utilPSDEName){
        this.setUtilPSDEName(utilPSDEName);
        return this;
    }

    /**
     * <B>UTILTAG</B>&nbsp;功能标记，指定应用功能配置的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UTILTAG = "utiltag";

    /**
     * 设置 功能标记，详细说明：{@link #FIELD_UTILTAG}
     * 
     * @param utilTag
     * 
     */
    @JsonProperty(FIELD_UTILTAG)
    public void setUtilTag(String utilTag){
        this.set(FIELD_UTILTAG, utilTag);
    }
    
    /**
     * 获取 功能标记  
     * @return
     */
    @JsonIgnore
    public String getUtilTag(){
        Object objValue = this.get(FIELD_UTILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTagDirty(){
        if(this.contains(FIELD_UTILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能标记
     */
    @JsonIgnore
    public void resetUtilTag(){
        this.reset(FIELD_UTILTAG);
    }

    /**
     * 设置 功能标记，详细说明：{@link #FIELD_UTILTAG}
     * <P>
     * 等同 {@link #setUtilTag}
     * @param utilTag
     */
    @JsonIgnore
    public PSAppUtil utiltag(String utilTag){
        this.setUtilTag(utilTag);
        return this;
    }

    /**
     * <B>UTILTYPE</B>&nbsp;功能类型，指定应用功能配置的功能类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilType} 
     */
    public final static String FIELD_UTILTYPE = "utiltype";

    /**
     * 设置 功能类型，详细说明：{@link #FIELD_UTILTYPE}
     * 
     * @param utilType
     * 
     */
    @JsonProperty(FIELD_UTILTYPE)
    public void setUtilType(String utilType){
        this.set(FIELD_UTILTYPE, utilType);
    }
    
    /**
     * 获取 功能类型  
     * @return
     */
    @JsonIgnore
    public String getUtilType(){
        Object objValue = this.get(FIELD_UTILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUtilTypeDirty(){
        if(this.contains(FIELD_UTILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能类型
     */
    @JsonIgnore
    public void resetUtilType(){
        this.reset(FIELD_UTILTYPE);
    }

    /**
     * 设置 功能类型，详细说明：{@link #FIELD_UTILTYPE}
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSAppUtil utiltype(String utilType){
        this.setUtilType(utilType);
        return this;
    }

     /**
     * 设置 功能类型，详细说明：{@link #FIELD_UTILTYPE}
     * <P>
     * 等同 {@link #setUtilType}
     * @param utilType
     */
    @JsonIgnore
    public PSAppUtil utiltype(net.ibizsys.psmodel.core.util.PSModelEnums.AppUtilType utilType){
        if(utilType == null){
            this.setUtilType(null);
        }
        else{
            this.setUtilType(utilType.value);
        }
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
    public PSAppUtil validflag(Integer validFlag){
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
    public PSAppUtil validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppUtilId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppUtilId(strValue);
    }

    @JsonIgnore
    public PSAppUtil id(String strValue){
        this.setPSAppUtilId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppUtil){
            PSAppUtil model = (PSAppUtil)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
