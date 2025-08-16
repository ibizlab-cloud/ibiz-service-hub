package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSFPLUGIN</B>后台模板插件 模型传输对象
 * <P>
 * 系统后台模板插件，模板插件支持用户不修改标准模板、不直接编写最终代码就能实现目标功能。插件的使用既保证了体系的一致性，也能实现应用的个性
 */
public class PSSysSFPluginDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSFPluginDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定后台模板插件的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysSFPluginDTO codename(String codeName){
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
    public PSSysSFPluginDTO createdate(Timestamp createDate){
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
    public PSSysSFPluginDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>KEYWORDS</B>&nbsp;关键字，指定后台模板插件的关键字，方便检索及定位
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_KEYWORDS = "keywords";

    /**
     * 设置 关键字，详细说明：{@link #FIELD_KEYWORDS}
     * 
     * @param keywords
     * 
     */
    @JsonProperty(FIELD_KEYWORDS)
    public void setKeywords(String keywords){
        this.set(FIELD_KEYWORDS, keywords);
    }
    
    /**
     * 获取 关键字  
     * @return
     */
    @JsonIgnore
    public String getKeywords(){
        Object objValue = this.get(FIELD_KEYWORDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关键字 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeywordsDirty(){
        if(this.contains(FIELD_KEYWORDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关键字
     */
    @JsonIgnore
    public void resetKeywords(){
        this.reset(FIELD_KEYWORDS);
    }

    /**
     * 设置 关键字，详细说明：{@link #FIELD_KEYWORDS}
     * <P>
     * 等同 {@link #setKeywords}
     * @param keywords
     */
    @JsonIgnore
    public PSSysSFPluginDTO keywords(String keywords){
        this.setKeywords(keywords);
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
    public PSSysSFPluginDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PARAMDESC</B>&nbsp;参数说明，指定后台模板插件的参数说明
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_PARAMDESC = "paramdesc";

    /**
     * 设置 参数说明，详细说明：{@link #FIELD_PARAMDESC}
     * 
     * @param paramDesc
     * 
     */
    @JsonProperty(FIELD_PARAMDESC)
    public void setParamDesc(String paramDesc){
        this.set(FIELD_PARAMDESC, paramDesc);
    }
    
    /**
     * 获取 参数说明  
     * @return
     */
    @JsonIgnore
    public String getParamDesc(){
        Object objValue = this.get(FIELD_PARAMDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDescDirty(){
        if(this.contains(FIELD_PARAMDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数说明
     */
    @JsonIgnore
    public void resetParamDesc(){
        this.reset(FIELD_PARAMDESC);
    }

    /**
     * 设置 参数说明，详细说明：{@link #FIELD_PARAMDESC}
     * <P>
     * 等同 {@link #setParamDesc}
     * @param paramDesc
     */
    @JsonIgnore
    public PSSysSFPluginDTO paramdesc(String paramDesc){
        this.setParamDesc(paramDesc);
        return this;
    }

    /**
     * <B>PLUGINMODEL</B>&nbsp;插件模型
     */
    public final static String FIELD_PLUGINMODEL = "pluginmodel";

    /**
     * 设置 插件模型
     * 
     * @param pluginModel
     * 
     */
    @JsonProperty(FIELD_PLUGINMODEL)
    public void setPluginModel(String pluginModel){
        this.set(FIELD_PLUGINMODEL, pluginModel);
    }
    
    /**
     * 获取 插件模型  
     * @return
     */
    @JsonIgnore
    public String getPluginModel(){
        Object objValue = this.get(FIELD_PLUGINMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginModelDirty(){
        if(this.contains(FIELD_PLUGINMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件模型
     */
    @JsonIgnore
    public void resetPluginModel(){
        this.reset(FIELD_PLUGINMODEL);
    }

    /**
     * 设置 插件模型
     * <P>
     * 等同 {@link #setPluginModel}
     * @param pluginModel
     */
    @JsonIgnore
    public PSSysSFPluginDTO pluginmodel(String pluginModel){
        this.setPluginModel(pluginModel);
        return this;
    }

    /**
     * <B>PLUGINPARAMS</B>&nbsp;插件参数
     */
    public final static String FIELD_PLUGINPARAMS = "pluginparams";

    /**
     * 设置 插件参数
     * 
     * @param pluginParams
     * 
     */
    @JsonProperty(FIELD_PLUGINPARAMS)
    public void setPluginParams(String pluginParams){
        this.set(FIELD_PLUGINPARAMS, pluginParams);
    }
    
    /**
     * 获取 插件参数  
     * @return
     */
    @JsonIgnore
    public String getPluginParams(){
        Object objValue = this.get(FIELD_PLUGINPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginParamsDirty(){
        if(this.contains(FIELD_PLUGINPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件参数
     */
    @JsonIgnore
    public void resetPluginParams(){
        this.reset(FIELD_PLUGINPARAMS);
    }

    /**
     * 设置 插件参数
     * <P>
     * 等同 {@link #setPluginParams}
     * @param pluginParams
     */
    @JsonIgnore
    public PSSysSFPluginDTO pluginparams(String pluginParams){
        this.setPluginParams(pluginParams);
        return this;
    }

    /**
     * <B>PLUGINTYPE</B>&nbsp;插件类型，指定后台模板插件的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SFPluginType} 
     */
    public final static String FIELD_PLUGINTYPE = "plugintype";

    /**
     * 设置 插件类型，详细说明：{@link #FIELD_PLUGINTYPE}
     * 
     * @param pluginType
     * 
     */
    @JsonProperty(FIELD_PLUGINTYPE)
    public void setPluginType(String pluginType){
        this.set(FIELD_PLUGINTYPE, pluginType);
    }
    
    /**
     * 获取 插件类型  
     * @return
     */
    @JsonIgnore
    public String getPluginType(){
        Object objValue = this.get(FIELD_PLUGINTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginTypeDirty(){
        if(this.contains(FIELD_PLUGINTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件类型
     */
    @JsonIgnore
    public void resetPluginType(){
        this.reset(FIELD_PLUGINTYPE);
    }

    /**
     * 设置 插件类型，详细说明：{@link #FIELD_PLUGINTYPE}
     * <P>
     * 等同 {@link #setPluginType}
     * @param pluginType
     */
    @JsonIgnore
    public PSSysSFPluginDTO plugintype(String pluginType){
        this.setPluginType(pluginType);
        return this;
    }

     /**
     * 设置 插件类型，详细说明：{@link #FIELD_PLUGINTYPE}
     * <P>
     * 等同 {@link #setPluginType}
     * @param pluginType
     */
    @JsonIgnore
    public PSSysSFPluginDTO plugintype(net.ibizsys.model.PSModelEnums.SFPluginType pluginType){
        if(pluginType == null){
            this.setPluginType(null);
        }
        else{
            this.setPluginType(pluginType.value);
        }
        return this;
    }

    /**
     * <B>PREVIEWHTML</B>&nbsp;预览内容
     */
    public final static String FIELD_PREVIEWHTML = "previewhtml";

    /**
     * 设置 预览内容
     * 
     * @param previewHtml
     * 
     */
    @JsonProperty(FIELD_PREVIEWHTML)
    public void setPreviewHtml(String previewHtml){
        this.set(FIELD_PREVIEWHTML, previewHtml);
    }
    
    /**
     * 获取 预览内容  
     * @return
     */
    @JsonIgnore
    public String getPreviewHtml(){
        Object objValue = this.get(FIELD_PREVIEWHTML);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预览内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPreviewHtmlDirty(){
        if(this.contains(FIELD_PREVIEWHTML)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预览内容
     */
    @JsonIgnore
    public void resetPreviewHtml(){
        this.reset(FIELD_PREVIEWHTML);
    }

    /**
     * 设置 预览内容
     * <P>
     * 等同 {@link #setPreviewHtml}
     * @param previewHtml
     */
    @JsonIgnore
    public PSSysSFPluginDTO previewhtml(String previewHtml){
        this.setPreviewHtml(previewHtml);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统后台模板插件所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSSysSFPluginDTO psmoduleid(String pSModuleId){
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
    public PSSysSFPluginDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统后台模板插件所在的系统模块
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
    public PSSysSFPluginDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSFPLUGINID</B>&nbsp;预置模板插件，指定后台模板插件来源的平台预置模板插件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFPLUGINID = "pssfpluginid";

    /**
     * 设置 预置模板插件，详细说明：{@link #FIELD_PSSFPLUGINID}
     * 
     * @param pSSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSFPLUGINID)
    public void setPSSFPluginId(String pSSFPluginId){
        this.set(FIELD_PSSFPLUGINID, pSSFPluginId);
    }
    
    /**
     * 获取 预置模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSFPluginId(){
        Object objValue = this.get(FIELD_PSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFPluginIdDirty(){
        if(this.contains(FIELD_PSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置模板插件
     */
    @JsonIgnore
    public void resetPSSFPluginId(){
        this.reset(FIELD_PSSFPLUGINID);
    }

    /**
     * 设置 预置模板插件，详细说明：{@link #FIELD_PSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSFPluginId}
     * @param pSSFPluginId
     */
    @JsonIgnore
    public PSSysSFPluginDTO pssfpluginid(String pSSFPluginId){
        this.setPSSFPluginId(pSSFPluginId);
        return this;
    }

    /**
     * <B>PSSFPLUGINNAME</B>&nbsp;预置模板插件，指定后台模板插件来源的平台预置模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFPLUGINID}
     */
    public final static String FIELD_PSSFPLUGINNAME = "pssfpluginname";

    /**
     * 设置 预置模板插件，详细说明：{@link #FIELD_PSSFPLUGINNAME}
     * 
     * @param pSSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSFPLUGINNAME)
    public void setPSSFPluginName(String pSSFPluginName){
        this.set(FIELD_PSSFPLUGINNAME, pSSFPluginName);
    }
    
    /**
     * 获取 预置模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSFPluginName(){
        Object objValue = this.get(FIELD_PSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFPluginNameDirty(){
        if(this.contains(FIELD_PSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置模板插件
     */
    @JsonIgnore
    public void resetPSSFPluginName(){
        this.reset(FIELD_PSSFPLUGINNAME);
    }

    /**
     * 设置 预置模板插件，详细说明：{@link #FIELD_PSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSFPluginName}
     * @param pSSFPluginName
     */
    @JsonIgnore
    public PSSysSFPluginDTO pssfpluginname(String pSSFPluginName){
        this.setPSSFPluginName(pSSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;服务插件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 服务插件标识
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 服务插件标识  
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
     * 判断 服务插件标识 是否指定值，包括空值
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
     * 重置 服务插件标识
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 服务插件标识
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysSFPluginDTO pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;插件名称，指定后台模板插件的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 插件名称，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 插件名称  
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
     * 判断 插件名称 是否指定值，包括空值
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
     * 重置 插件名称
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 插件名称，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysSFPluginDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSFPluginName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSFPluginName(strName);
    }

    @JsonIgnore
    public PSSysSFPluginDTO name(String strName){
        this.setPSSysSFPluginName(strName);
        return this;
    }

    /**
     * <B>REPDEFAULT</B>&nbsp;全局默认
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REPDEFAULT = "repdefault";

    /**
     * 设置 全局默认
     * 
     * @param repDefault
     * 
     */
    @JsonProperty(FIELD_REPDEFAULT)
    public void setRepDefault(Integer repDefault){
        this.set(FIELD_REPDEFAULT, repDefault);
    }
    
    /**
     * 获取 全局默认  
     * @return
     */
    @JsonIgnore
    public Integer getRepDefault(){
        Object objValue = this.get(FIELD_REPDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全局默认 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRepDefaultDirty(){
        if(this.contains(FIELD_REPDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全局默认
     */
    @JsonIgnore
    public void resetRepDefault(){
        this.reset(FIELD_REPDEFAULT);
    }

    /**
     * 设置 全局默认
     * <P>
     * 等同 {@link #setRepDefault}
     * @param repDefault
     */
    @JsonIgnore
    public PSSysSFPluginDTO repdefault(Integer repDefault){
        this.setRepDefault(repDefault);
        return this;
    }

     /**
     * 设置 全局默认
     * <P>
     * 等同 {@link #setRepDefault}
     * @param repDefault
     */
    @JsonIgnore
    public PSSysSFPluginDTO repdefault(Boolean repDefault){
        if(repDefault == null){
            this.setRepDefault(null);
        }
        else{
            this.setRepDefault(repDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>RTOBJECTMODE</B>&nbsp;运行时插件模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PluginRTMode} 
     */
    public final static String FIELD_RTOBJECTMODE = "rtobjectmode";

    /**
     * 设置 运行时插件模式
     * 
     * @param rTObjectMode
     * 
     */
    @JsonProperty(FIELD_RTOBJECTMODE)
    public void setRTObjectMode(Integer rTObjectMode){
        this.set(FIELD_RTOBJECTMODE, rTObjectMode);
    }
    
    /**
     * 获取 运行时插件模式  
     * @return
     */
    @JsonIgnore
    public Integer getRTObjectMode(){
        Object objValue = this.get(FIELD_RTOBJECTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 运行时插件模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTObjectModeDirty(){
        if(this.contains(FIELD_RTOBJECTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时插件模式
     */
    @JsonIgnore
    public void resetRTObjectMode(){
        this.reset(FIELD_RTOBJECTMODE);
    }

    /**
     * 设置 运行时插件模式
     * <P>
     * 等同 {@link #setRTObjectMode}
     * @param rTObjectMode
     */
    @JsonIgnore
    public PSSysSFPluginDTO rtobjectmode(Integer rTObjectMode){
        this.setRTObjectMode(rTObjectMode);
        return this;
    }

     /**
     * 设置 运行时插件模式
     * <P>
     * 等同 {@link #setRTObjectMode}
     * @param rTObjectMode
     */
    @JsonIgnore
    public PSSysSFPluginDTO rtobjectmode(net.ibizsys.model.PSModelEnums.PluginRTMode rTObjectMode){
        if(rTObjectMode == null){
            this.setRTObjectMode(null);
        }
        else{
            this.setRTObjectMode(rTObjectMode.value);
        }
        return this;
    }

    /**
     * <B>RTOBJECTNAME</B>&nbsp;运行时插件名称
     * <P>
     * 字符串：最大长度 250，由字母、数字、下划线及点号组成，且开始必须字母
     */
    public final static String FIELD_RTOBJECTNAME = "rtobjectname";

    /**
     * 设置 运行时插件名称
     * 
     * @param rTObjectName
     * 
     */
    @JsonProperty(FIELD_RTOBJECTNAME)
    public void setRTObjectName(String rTObjectName){
        this.set(FIELD_RTOBJECTNAME, rTObjectName);
    }
    
    /**
     * 获取 运行时插件名称  
     * @return
     */
    @JsonIgnore
    public String getRTObjectName(){
        Object objValue = this.get(FIELD_RTOBJECTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时插件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTObjectNameDirty(){
        if(this.contains(FIELD_RTOBJECTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时插件名称
     */
    @JsonIgnore
    public void resetRTObjectName(){
        this.reset(FIELD_RTOBJECTNAME);
    }

    /**
     * 设置 运行时插件名称
     * <P>
     * 等同 {@link #setRTObjectName}
     * @param rTObjectName
     */
    @JsonIgnore
    public PSSysSFPluginDTO rtobjectname(String rTObjectName){
        this.setRTObjectName(rTObjectName);
        return this;
    }

    /**
     * <B>RTOBJECTREPO</B>&nbsp;运行时插件仓库
     */
    public final static String FIELD_RTOBJECTREPO = "rtobjectrepo";

    /**
     * 设置 运行时插件仓库
     * 
     * @param rTObjectRepo
     * 
     */
    @JsonProperty(FIELD_RTOBJECTREPO)
    public void setRTObjectRepo(String rTObjectRepo){
        this.set(FIELD_RTOBJECTREPO, rTObjectRepo);
    }
    
    /**
     * 获取 运行时插件仓库  
     * @return
     */
    @JsonIgnore
    public String getRTObjectRepo(){
        Object objValue = this.get(FIELD_RTOBJECTREPO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时插件仓库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTObjectRepoDirty(){
        if(this.contains(FIELD_RTOBJECTREPO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时插件仓库
     */
    @JsonIgnore
    public void resetRTObjectRepo(){
        this.reset(FIELD_RTOBJECTREPO);
    }

    /**
     * 设置 运行时插件仓库
     * <P>
     * 等同 {@link #setRTObjectRepo}
     * @param rTObjectRepo
     */
    @JsonIgnore
    public PSSysSFPluginDTO rtobjectrepo(String rTObjectRepo){
        this.setRTObjectRepo(rTObjectRepo);
        return this;
    }

    /**
     * <B>STUDIOICON</B>&nbsp;工具图标
     */
    public final static String FIELD_STUDIOICON = "studioicon";

    /**
     * 设置 工具图标
     * 
     * @param studioIcon
     * 
     */
    @JsonProperty(FIELD_STUDIOICON)
    public void setStudioIcon(String studioIcon){
        this.set(FIELD_STUDIOICON, studioIcon);
    }
    
    /**
     * 获取 工具图标  
     * @return
     */
    @JsonIgnore
    public String getStudioIcon(){
        Object objValue = this.get(FIELD_STUDIOICON);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工具图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStudioIconDirty(){
        if(this.contains(FIELD_STUDIOICON)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工具图标
     */
    @JsonIgnore
    public void resetStudioIcon(){
        this.reset(FIELD_STUDIOICON);
    }

    /**
     * 设置 工具图标
     * <P>
     * 等同 {@link #setStudioIcon}
     * @param studioIcon
     */
    @JsonIgnore
    public PSSysSFPluginDTO studioicon(String studioIcon){
        this.setStudioIcon(studioIcon);
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
    public PSSysSFPluginDTO updatedate(Timestamp updateDate){
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
    public PSSysSFPluginDTO updateman(String updateMan){
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
    public PSSysSFPluginDTO usercat(String userCat){
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
    public PSSysSFPluginDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSFPluginDTO usertag(String userTag){
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
    public PSSysSFPluginDTO usertag2(String userTag2){
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
    public PSSysSFPluginDTO usertag3(String userTag3){
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
    public PSSysSFPluginDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysSFPluginId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSFPluginId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSFPluginId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSFPluginId(strValue);
    }

    @JsonIgnore
    public PSSysSFPluginDTO id(String strValue){
        this.setPSSysSFPluginId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSFPluginDTO){
            PSSysSFPluginDTO dto = (PSSysSFPluginDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
