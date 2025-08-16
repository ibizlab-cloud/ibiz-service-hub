package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSVALUERULE</B>系统值规则 模型传输对象
 * <P>
 * 系统的全局值规则模型，支持脚本、正则式及自定义类型
 */
public class PSSysValueRule extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysValueRule(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统值规则的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysValueRule codename(String codeName){
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
    public PSSysValueRule createdate(String createDate){
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
    public PSSysValueRule createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMOBJ</B>&nbsp;自定义对象，指定自定义规则的处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CUSTOMOBJ = "customobj";

    /**
     * 设置 自定义对象，详细说明：{@link #FIELD_CUSTOMOBJ}
     * 
     * @param customObj
     * 
     */
    @JsonProperty(FIELD_CUSTOMOBJ)
    public void setCustomObj(String customObj){
        this.set(FIELD_CUSTOMOBJ, customObj);
    }
    
    /**
     * 获取 自定义对象  
     * @return
     */
    @JsonIgnore
    public String getCustomObj(){
        Object objValue = this.get(FIELD_CUSTOMOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomObjDirty(){
        if(this.contains(FIELD_CUSTOMOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义对象
     */
    @JsonIgnore
    public void resetCustomObj(){
        this.reset(FIELD_CUSTOMOBJ);
    }

    /**
     * 设置 自定义对象，详细说明：{@link #FIELD_CUSTOMOBJ}
     * <P>
     * 等同 {@link #setCustomObj}
     * @param customObj
     */
    @JsonIgnore
    public PSSysValueRule customobj(String customObj){
        this.setCustomObj(customObj);
        return this;
    }

    /**
     * <B>CUSTOMPARAMS</B>&nbsp;自定义参数，值规则类型为【自定义】时除了指定自定义的处理对象，还支持指定自定义的参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMPARAMS = "customparams";

    /**
     * 设置 自定义参数，详细说明：{@link #FIELD_CUSTOMPARAMS}
     * 
     * @param customParams
     * 
     */
    @JsonProperty(FIELD_CUSTOMPARAMS)
    public void setCustomParams(String customParams){
        this.set(FIELD_CUSTOMPARAMS, customParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getCustomParams(){
        Object objValue = this.get(FIELD_CUSTOMPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomParamsDirty(){
        if(this.contains(FIELD_CUSTOMPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetCustomParams(){
        this.reset(FIELD_CUSTOMPARAMS);
    }

    /**
     * 设置 自定义参数，详细说明：{@link #FIELD_CUSTOMPARAMS}
     * <P>
     * 等同 {@link #setCustomParams}
     * @param customParams
     */
    @JsonIgnore
    public PSSysValueRule customparams(String customParams){
        this.setCustomParams(customParams);
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
    public PSSysValueRule memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统值规则所在的系统模块
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
    public PSSysValueRule psmoduleid(String pSModuleId){
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
    public PSSysValueRule psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统值规则所在的系统模块
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
    public PSSysValueRule psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysValueRule pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysValueRule pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysValueRule pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统值规则使用的前端模板扩展插件，使用插件类型【应用值规则】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
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
     * 判断 前端扩展插件 是否指定值，包括空值
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
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSSysValueRule pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysValueRule pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统值规则使用的前端模板扩展插件，使用插件类型【应用值规则】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
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
     * 判断 前端扩展插件 是否指定值，包括空值
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
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSSysValueRule pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定系统值规则使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysValueRule pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysValueRule pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定系统值规则使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysValueRule pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;系统值规则标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 系统值规则标识
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 系统值规则标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则标识
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 系统值规则标识
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSSysValueRule pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;值规则名称，指定值规则的名称，需要在值规则所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 值规则名称，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 值规则名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则名称
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 值规则名称，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSSysValueRule pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysValueRuleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysValueRuleName(strName);
    }

    @JsonIgnore
    public PSSysValueRule name(String strName){
        this.setPSSysValueRuleName(strName);
        return this;
    }

    /**
     * <B>PSVALUERULEID</B>&nbsp;预置值规则
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVALUERULEID = "psvalueruleid";

    /**
     * 设置 预置值规则
     * 
     * @param pSValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSVALUERULEID)
    public void setPSValueRuleId(String pSValueRuleId){
        this.set(FIELD_PSVALUERULEID, pSValueRuleId);
    }
    
    /**
     * 获取 预置值规则  
     * @return
     */
    @JsonIgnore
    public String getPSValueRuleId(){
        Object objValue = this.get(FIELD_PSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSValueRuleIdDirty(){
        if(this.contains(FIELD_PSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置值规则
     */
    @JsonIgnore
    public void resetPSValueRuleId(){
        this.reset(FIELD_PSVALUERULEID);
    }

    /**
     * 设置 预置值规则
     * <P>
     * 等同 {@link #setPSValueRuleId}
     * @param pSValueRuleId
     */
    @JsonIgnore
    public PSSysValueRule psvalueruleid(String pSValueRuleId){
        this.setPSValueRuleId(pSValueRuleId);
        return this;
    }

    /**
     * <B>PSVALUERULENAME</B>&nbsp;预置值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVALUERULEID}
     */
    public final static String FIELD_PSVALUERULENAME = "psvaluerulename";

    /**
     * 设置 预置值规则
     * 
     * @param pSValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSVALUERULENAME)
    public void setPSValueRuleName(String pSValueRuleName){
        this.set(FIELD_PSVALUERULENAME, pSValueRuleName);
    }
    
    /**
     * 获取 预置值规则  
     * @return
     */
    @JsonIgnore
    public String getPSValueRuleName(){
        Object objValue = this.get(FIELD_PSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSValueRuleNameDirty(){
        if(this.contains(FIELD_PSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置值规则
     */
    @JsonIgnore
    public void resetPSValueRuleName(){
        this.reset(FIELD_PSVALUERULENAME);
    }

    /**
     * 设置 预置值规则
     * <P>
     * 等同 {@link #setPSValueRuleName}
     * @param pSValueRuleName
     */
    @JsonIgnore
    public PSSysValueRule psvaluerulename(String pSValueRuleName){
        this.setPSValueRuleName(pSValueRuleName);
        return this;
    }

    /**
     * <B>REGEXPCODE</B>&nbsp;正则表达式，指定正则式规则的正则表达式
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_REGEXPCODE = "regexpcode";

    /**
     * 设置 正则表达式，详细说明：{@link #FIELD_REGEXPCODE}
     * 
     * @param regExpCode
     * 
     */
    @JsonProperty(FIELD_REGEXPCODE)
    public void setRegExpCode(String regExpCode){
        this.set(FIELD_REGEXPCODE, regExpCode);
    }
    
    /**
     * 获取 正则表达式  
     * @return
     */
    @JsonIgnore
    public String getRegExpCode(){
        Object objValue = this.get(FIELD_REGEXPCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 正则表达式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegExpCodeDirty(){
        if(this.contains(FIELD_REGEXPCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 正则表达式
     */
    @JsonIgnore
    public void resetRegExpCode(){
        this.reset(FIELD_REGEXPCODE);
    }

    /**
     * 设置 正则表达式，详细说明：{@link #FIELD_REGEXPCODE}
     * <P>
     * 等同 {@link #setRegExpCode}
     * @param regExpCode
     */
    @JsonIgnore
    public PSSysValueRule regexpcode(String regExpCode){
        this.setRegExpCode(regExpCode);
        return this;
    }

    /**
     * <B>REGEXPCODE2</B>&nbsp;正则表达式2
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_REGEXPCODE2 = "regexpcode2";

    /**
     * 设置 正则表达式2
     * 
     * @param regExpCode2
     * 
     */
    @JsonProperty(FIELD_REGEXPCODE2)
    public void setRegExpCode2(String regExpCode2){
        this.set(FIELD_REGEXPCODE2, regExpCode2);
    }
    
    /**
     * 获取 正则表达式2  
     * @return
     */
    @JsonIgnore
    public String getRegExpCode2(){
        Object objValue = this.get(FIELD_REGEXPCODE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 正则表达式2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegExpCode2Dirty(){
        if(this.contains(FIELD_REGEXPCODE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 正则表达式2
     */
    @JsonIgnore
    public void resetRegExpCode2(){
        this.reset(FIELD_REGEXPCODE2);
    }

    /**
     * 设置 正则表达式2
     * <P>
     * 等同 {@link #setRegExpCode2}
     * @param regExpCode2
     */
    @JsonIgnore
    public PSSysValueRule regexpcode2(String regExpCode2){
        this.setRegExpCode2(regExpCode2);
        return this;
    }

    /**
     * <B>REGEXPCODE3</B>&nbsp;正则表达式3
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_REGEXPCODE3 = "regexpcode3";

    /**
     * 设置 正则表达式3
     * 
     * @param regExpCode3
     * 
     */
    @JsonProperty(FIELD_REGEXPCODE3)
    public void setRegExpCode3(String regExpCode3){
        this.set(FIELD_REGEXPCODE3, regExpCode3);
    }
    
    /**
     * 获取 正则表达式3  
     * @return
     */
    @JsonIgnore
    public String getRegExpCode3(){
        Object objValue = this.get(FIELD_REGEXPCODE3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 正则表达式3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegExpCode3Dirty(){
        if(this.contains(FIELD_REGEXPCODE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 正则表达式3
     */
    @JsonIgnore
    public void resetRegExpCode3(){
        this.reset(FIELD_REGEXPCODE3);
    }

    /**
     * 设置 正则表达式3
     * <P>
     * 等同 {@link #setRegExpCode3}
     * @param regExpCode3
     */
    @JsonIgnore
    public PSSysValueRule regexpcode3(String regExpCode3){
        this.setRegExpCode3(regExpCode3);
        return this;
    }

    /**
     * <B>REGEXPCODE4</B>&nbsp;正则表达式4
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_REGEXPCODE4 = "regexpcode4";

    /**
     * 设置 正则表达式4
     * 
     * @param regExpCode4
     * 
     */
    @JsonProperty(FIELD_REGEXPCODE4)
    public void setRegExpCode4(String regExpCode4){
        this.set(FIELD_REGEXPCODE4, regExpCode4);
    }
    
    /**
     * 获取 正则表达式4  
     * @return
     */
    @JsonIgnore
    public String getRegExpCode4(){
        Object objValue = this.get(FIELD_REGEXPCODE4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 正则表达式4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegExpCode4Dirty(){
        if(this.contains(FIELD_REGEXPCODE4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 正则表达式4
     */
    @JsonIgnore
    public void resetRegExpCode4(){
        this.reset(FIELD_REGEXPCODE4);
    }

    /**
     * 设置 正则表达式4
     * <P>
     * 等同 {@link #setRegExpCode4}
     * @param regExpCode4
     */
    @JsonIgnore
    public PSSysValueRule regexpcode4(String regExpCode4){
        this.setRegExpCode4(regExpCode4);
        return this;
    }

    /**
     * <B>RIPSLANRESID</B>&nbsp;规则信息语言资源，指定规则信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_RIPSLANRESID = "ripslanresid";

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESID}
     * 
     * @param rIPSLanResId
     * 
     */
    @JsonProperty(FIELD_RIPSLANRESID)
    public void setRIPSLanResId(String rIPSLanResId){
        this.set(FIELD_RIPSLANRESID, rIPSLanResId);
    }
    
    /**
     * 获取 规则信息语言资源  
     * @return
     */
    @JsonIgnore
    public String getRIPSLanResId(){
        Object objValue = this.get(FIELD_RIPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则信息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRIPSLanResIdDirty(){
        if(this.contains(FIELD_RIPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则信息语言资源
     */
    @JsonIgnore
    public void resetRIPSLanResId(){
        this.reset(FIELD_RIPSLANRESID);
    }

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESID}
     * <P>
     * 等同 {@link #setRIPSLanResId}
     * @param rIPSLanResId
     */
    @JsonIgnore
    public PSSysValueRule ripslanresid(String rIPSLanResId){
        this.setRIPSLanResId(rIPSLanResId);
        return this;
    }

    /**
     * 设置 规则信息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRIPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysValueRule ripslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setRIPSLanResId(null);
            this.setRIPSLanResName(null);
        }
        else{
            this.setRIPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setRIPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>RIPSLANRESNAME</B>&nbsp;规则信息语言资源，指定规则信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RIPSLANRESID}
     */
    public final static String FIELD_RIPSLANRESNAME = "ripslanresname";

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESNAME}
     * 
     * @param rIPSLanResName
     * 
     */
    @JsonProperty(FIELD_RIPSLANRESNAME)
    public void setRIPSLanResName(String rIPSLanResName){
        this.set(FIELD_RIPSLANRESNAME, rIPSLanResName);
    }
    
    /**
     * 获取 规则信息语言资源  
     * @return
     */
    @JsonIgnore
    public String getRIPSLanResName(){
        Object objValue = this.get(FIELD_RIPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则信息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRIPSLanResNameDirty(){
        if(this.contains(FIELD_RIPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则信息语言资源
     */
    @JsonIgnore
    public void resetRIPSLanResName(){
        this.reset(FIELD_RIPSLANRESNAME);
    }

    /**
     * 设置 规则信息语言资源，详细说明：{@link #FIELD_RIPSLANRESNAME}
     * <P>
     * 等同 {@link #setRIPSLanResName}
     * @param rIPSLanResName
     */
    @JsonIgnore
    public PSSysValueRule ripslanresname(String rIPSLanResName){
        this.setRIPSLanResName(rIPSLanResName);
        return this;
    }

    /**
     * <B>RULEHOLDER</B>&nbsp;规则所有者，指定系统值规则的逻辑所有者，默认为【后台及前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder} 
     */
    public final static String FIELD_RULEHOLDER = "ruleholder";

    /**
     * 设置 规则所有者，详细说明：{@link #FIELD_RULEHOLDER}
     * 
     * @param ruleHolder
     * 
     */
    @JsonProperty(FIELD_RULEHOLDER)
    public void setRuleHolder(Integer ruleHolder){
        this.set(FIELD_RULEHOLDER, ruleHolder);
    }
    
    /**
     * 获取 规则所有者  
     * @return
     */
    @JsonIgnore
    public Integer getRuleHolder(){
        Object objValue = this.get(FIELD_RULEHOLDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 规则所有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuleHolderDirty(){
        if(this.contains(FIELD_RULEHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则所有者
     */
    @JsonIgnore
    public void resetRuleHolder(){
        this.reset(FIELD_RULEHOLDER);
    }

    /**
     * 设置 规则所有者，详细说明：{@link #FIELD_RULEHOLDER}
     * <P>
     * 等同 {@link #setRuleHolder}
     * @param ruleHolder
     */
    @JsonIgnore
    public PSSysValueRule ruleholder(Integer ruleHolder){
        this.setRuleHolder(ruleHolder);
        return this;
    }

     /**
     * 设置 规则所有者，详细说明：{@link #FIELD_RULEHOLDER}
     * <P>
     * 等同 {@link #setRuleHolder}
     * @param ruleHolder
     */
    @JsonIgnore
    public PSSysValueRule ruleholder(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder ruleHolder){
        if(ruleHolder == null){
            this.setRuleHolder(null);
        }
        else{
            this.setRuleHolder(ruleHolder.value);
        }
        return this;
    }

    /**
     * <B>RULEINFO</B>&nbsp;规则信息，指定值规则的规则信息
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_RULEINFO = "ruleinfo";

    /**
     * 设置 规则信息，详细说明：{@link #FIELD_RULEINFO}
     * 
     * @param ruleInfo
     * 
     */
    @JsonProperty(FIELD_RULEINFO)
    public void setRuleInfo(String ruleInfo){
        this.set(FIELD_RULEINFO, ruleInfo);
    }
    
    /**
     * 获取 规则信息  
     * @return
     */
    @JsonIgnore
    public String getRuleInfo(){
        Object objValue = this.get(FIELD_RULEINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuleInfoDirty(){
        if(this.contains(FIELD_RULEINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则信息
     */
    @JsonIgnore
    public void resetRuleInfo(){
        this.reset(FIELD_RULEINFO);
    }

    /**
     * 设置 规则信息，详细说明：{@link #FIELD_RULEINFO}
     * <P>
     * 等同 {@link #setRuleInfo}
     * @param ruleInfo
     */
    @JsonIgnore
    public PSSysValueRule ruleinfo(String ruleInfo){
        this.setRuleInfo(ruleInfo);
        return this;
    }

    /**
     * <B>RULETAG</B>&nbsp;规则标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RULETAG = "ruletag";

    /**
     * 设置 规则标记
     * 
     * @param ruleTag
     * 
     */
    @JsonProperty(FIELD_RULETAG)
    public void setRuleTag(String ruleTag){
        this.set(FIELD_RULETAG, ruleTag);
    }
    
    /**
     * 获取 规则标记  
     * @return
     */
    @JsonIgnore
    public String getRuleTag(){
        Object objValue = this.get(FIELD_RULETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuleTagDirty(){
        if(this.contains(FIELD_RULETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则标记
     */
    @JsonIgnore
    public void resetRuleTag(){
        this.reset(FIELD_RULETAG);
    }

    /**
     * 设置 规则标记
     * <P>
     * 等同 {@link #setRuleTag}
     * @param ruleTag
     */
    @JsonIgnore
    public PSSysValueRule ruletag(String ruleTag){
        this.setRuleTag(ruleTag);
        return this;
    }

    /**
     * <B>RULETAG2</B>&nbsp;规则标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_RULETAG2 = "ruletag2";

    /**
     * 设置 规则标记2
     * 
     * @param ruleTag2
     * 
     */
    @JsonProperty(FIELD_RULETAG2)
    public void setRuleTag2(String ruleTag2){
        this.set(FIELD_RULETAG2, ruleTag2);
    }
    
    /**
     * 获取 规则标记2  
     * @return
     */
    @JsonIgnore
    public String getRuleTag2(){
        Object objValue = this.get(FIELD_RULETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuleTag2Dirty(){
        if(this.contains(FIELD_RULETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则标记2
     */
    @JsonIgnore
    public void resetRuleTag2(){
        this.reset(FIELD_RULETAG2);
    }

    /**
     * 设置 规则标记2
     * <P>
     * 等同 {@link #setRuleTag2}
     * @param ruleTag2
     */
    @JsonIgnore
    public PSSysValueRule ruletag2(String ruleTag2){
        this.setRuleTag2(ruleTag2);
        return this;
    }

    /**
     * <B>RULETYPE</B>&nbsp;规则类型，指定系统值规则的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ValueRuleType} 
     */
    public final static String FIELD_RULETYPE = "ruletype";

    /**
     * 设置 规则类型，详细说明：{@link #FIELD_RULETYPE}
     * 
     * @param ruleType
     * 
     */
    @JsonProperty(FIELD_RULETYPE)
    public void setRuleType(String ruleType){
        this.set(FIELD_RULETYPE, ruleType);
    }
    
    /**
     * 获取 规则类型  
     * @return
     */
    @JsonIgnore
    public String getRuleType(){
        Object objValue = this.get(FIELD_RULETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 规则类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRuleTypeDirty(){
        if(this.contains(FIELD_RULETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 规则类型
     */
    @JsonIgnore
    public void resetRuleType(){
        this.reset(FIELD_RULETYPE);
    }

    /**
     * 设置 规则类型，详细说明：{@link #FIELD_RULETYPE}
     * <P>
     * 等同 {@link #setRuleType}
     * @param ruleType
     */
    @JsonIgnore
    public PSSysValueRule ruletype(String ruleType){
        this.setRuleType(ruleType);
        return this;
    }

     /**
     * 设置 规则类型，详细说明：{@link #FIELD_RULETYPE}
     * <P>
     * 等同 {@link #setRuleType}
     * @param ruleType
     */
    @JsonIgnore
    public PSSysValueRule ruletype(net.ibizsys.psmodel.core.util.PSModelEnums.ValueRuleType ruleType){
        if(ruleType == null){
            this.setRuleType(null);
        }
        else{
            this.setRuleType(ruleType.value);
        }
        return this;
    }

    /**
     * <B>SCRIPT</B>&nbsp;脚本，指定脚本规则的脚本代码
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_SCRIPT = "script";

    /**
     * 设置 脚本，详细说明：{@link #FIELD_SCRIPT}
     * 
     * @param script
     * 
     */
    @JsonProperty(FIELD_SCRIPT)
    public void setScript(String script){
        this.set(FIELD_SCRIPT, script);
    }
    
    /**
     * 获取 脚本  
     * @return
     */
    @JsonIgnore
    public String getScript(){
        Object objValue = this.get(FIELD_SCRIPT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 脚本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isScriptDirty(){
        if(this.contains(FIELD_SCRIPT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本
     */
    @JsonIgnore
    public void resetScript(){
        this.reset(FIELD_SCRIPT);
    }

    /**
     * 设置 脚本，详细说明：{@link #FIELD_SCRIPT}
     * <P>
     * 等同 {@link #setScript}
     * @param script
     */
    @JsonIgnore
    public PSSysValueRule script(String script){
        this.setScript(script);
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
    public PSSysValueRule updatedate(String updateDate){
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
    public PSSysValueRule updateman(String updateMan){
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
    public PSSysValueRule usercat(String userCat){
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
    public PSSysValueRule usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysValueRule usertag(String userTag){
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
    public PSSysValueRule usertag2(String userTag2){
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
    public PSSysValueRule usertag3(String userTag3){
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
    public PSSysValueRule usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysValueRuleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysValueRuleId(strValue);
    }

    @JsonIgnore
    public PSSysValueRule id(String strValue){
        this.setPSSysValueRuleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysValueRule){
            PSSysValueRule model = (PSSysValueRule)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
