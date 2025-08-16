package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSPFPLUGIN</B>前端模板插件 模型传输对象
 * <P>
 * 系统前端模板插件模型，模板插件支持用户不修改标准模板、不直接编写最终代码就能实现目标功能。插件的使用既保证了体系的一致性，也能实现应用的个性
 */
public class PSSysPFPluginDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysPFPluginDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定前端模板插件的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysPFPluginDTO codename(String codeName){
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
    public PSSysPFPluginDTO createdate(Timestamp createDate){
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
    public PSSysPFPluginDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EXTENDSTYLEONLY</B>&nbsp;仅扩展样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXTENDSTYLEONLY = "extendstyleonly";

    /**
     * 设置 仅扩展样式
     * 
     * @param extendStyleOnly
     * 
     */
    @JsonProperty(FIELD_EXTENDSTYLEONLY)
    public void setExtendStyleOnly(Integer extendStyleOnly){
        this.set(FIELD_EXTENDSTYLEONLY, extendStyleOnly);
    }
    
    /**
     * 获取 仅扩展样式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendStyleOnly(){
        Object objValue = this.get(FIELD_EXTENDSTYLEONLY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 仅扩展样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendStyleOnlyDirty(){
        if(this.contains(FIELD_EXTENDSTYLEONLY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 仅扩展样式
     */
    @JsonIgnore
    public void resetExtendStyleOnly(){
        this.reset(FIELD_EXTENDSTYLEONLY);
    }

    /**
     * 设置 仅扩展样式
     * <P>
     * 等同 {@link #setExtendStyleOnly}
     * @param extendStyleOnly
     */
    @JsonIgnore
    public PSSysPFPluginDTO extendstyleonly(Integer extendStyleOnly){
        this.setExtendStyleOnly(extendStyleOnly);
        return this;
    }

     /**
     * 设置 仅扩展样式
     * <P>
     * 等同 {@link #setExtendStyleOnly}
     * @param extendStyleOnly
     */
    @JsonIgnore
    public PSSysPFPluginDTO extendstyleonly(Boolean extendStyleOnly){
        if(extendStyleOnly == null){
            this.setExtendStyleOnly(null);
        }
        else{
            this.setExtendStyleOnly(extendStyleOnly?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>KEYWORDS</B>&nbsp;关键字
     * <P>
     * 字符串：最大长度 300
     */
    public final static String FIELD_KEYWORDS = "keywords";

    /**
     * 设置 关键字
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
     * 设置 关键字
     * <P>
     * 等同 {@link #setKeywords}
     * @param keywords
     */
    @JsonIgnore
    public PSSysPFPluginDTO keywords(String keywords){
        this.setKeywords(keywords);
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
    public PSSysPFPluginDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PLUGINDESC</B>&nbsp;插件描述
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_PLUGINDESC = "plugindesc";

    /**
     * 设置 插件描述
     * 
     * @param pluginDesc
     * 
     */
    @JsonProperty(FIELD_PLUGINDESC)
    public void setPluginDesc(String pluginDesc){
        this.set(FIELD_PLUGINDESC, pluginDesc);
    }
    
    /**
     * 获取 插件描述  
     * @return
     */
    @JsonIgnore
    public String getPluginDesc(){
        Object objValue = this.get(FIELD_PLUGINDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件描述 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginDescDirty(){
        if(this.contains(FIELD_PLUGINDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件描述
     */
    @JsonIgnore
    public void resetPluginDesc(){
        this.reset(FIELD_PLUGINDESC);
    }

    /**
     * 设置 插件描述
     * <P>
     * 等同 {@link #setPluginDesc}
     * @param pluginDesc
     */
    @JsonIgnore
    public PSSysPFPluginDTO plugindesc(String pluginDesc){
        this.setPluginDesc(pluginDesc);
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
    public PSSysPFPluginDTO pluginmodel(String pluginModel){
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
    public PSSysPFPluginDTO pluginparams(String pluginParams){
        this.setPluginParams(pluginParams);
        return this;
    }

    /**
     * <B>PLUGINTAG</B>&nbsp;插件标识，指定前端模板插件的标记，需要在所在插件类型中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PLUGINTAG = "plugintag";

    /**
     * 设置 插件标识，详细说明：{@link #FIELD_PLUGINTAG}
     * 
     * @param pluginTag
     * 
     */
    @JsonProperty(FIELD_PLUGINTAG)
    public void setPluginTag(String pluginTag){
        this.set(FIELD_PLUGINTAG, pluginTag);
    }
    
    /**
     * 获取 插件标识  
     * @return
     */
    @JsonIgnore
    public String getPluginTag(){
        Object objValue = this.get(FIELD_PLUGINTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginTagDirty(){
        if(this.contains(FIELD_PLUGINTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件标识
     */
    @JsonIgnore
    public void resetPluginTag(){
        this.reset(FIELD_PLUGINTAG);
    }

    /**
     * 设置 插件标识，详细说明：{@link #FIELD_PLUGINTAG}
     * <P>
     * 等同 {@link #setPluginTag}
     * @param pluginTag
     */
    @JsonIgnore
    public PSSysPFPluginDTO plugintag(String pluginTag){
        this.setPluginTag(pluginTag);
        return this;
    }

    /**
     * <B>PLUGINTYPE</B>&nbsp;插件类型，指定前端模板插件的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PFPluginType} 
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
    public PSSysPFPluginDTO plugintype(String pluginType){
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
    public PSSysPFPluginDTO plugintype(net.ibizsys.model.PSModelEnums.PFPluginType pluginType){
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
    public PSSysPFPluginDTO previewhtml(String previewHtml){
        this.setPreviewHtml(previewHtml);
        return this;
    }

    /**
     * <B>PREVIEWPSNDFILEID</B>&nbsp;预览网盘文件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PREVIEWPSNDFILEID = "previewpsndfileid";

    /**
     * 设置 预览网盘文件标识
     * 
     * @param previewPSNDFileId
     * 
     */
    @JsonProperty(FIELD_PREVIEWPSNDFILEID)
    public void setPreviewPSNDFileId(String previewPSNDFileId){
        this.set(FIELD_PREVIEWPSNDFILEID, previewPSNDFileId);
    }
    
    /**
     * 获取 预览网盘文件标识  
     * @return
     */
    @JsonIgnore
    public String getPreviewPSNDFileId(){
        Object objValue = this.get(FIELD_PREVIEWPSNDFILEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预览网盘文件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPreviewPSNDFileIdDirty(){
        if(this.contains(FIELD_PREVIEWPSNDFILEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预览网盘文件标识
     */
    @JsonIgnore
    public void resetPreviewPSNDFileId(){
        this.reset(FIELD_PREVIEWPSNDFILEID);
    }

    /**
     * 设置 预览网盘文件标识
     * <P>
     * 等同 {@link #setPreviewPSNDFileId}
     * @param previewPSNDFileId
     */
    @JsonIgnore
    public PSSysPFPluginDTO previewpsndfileid(String previewPSNDFileId){
        this.setPreviewPSNDFileId(previewPSNDFileId);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定前端模板插件所在的系统模块
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
    public PSSysPFPluginDTO psmoduleid(String pSModuleId){
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
    public PSSysPFPluginDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定前端模板插件所在的系统模块
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
    public PSSysPFPluginDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSPFPLUGINID</B>&nbsp;平台预置插件，指定前端模板插件来源的平台预置插件
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFPLUGINID = "pspfpluginid";

    /**
     * 设置 平台预置插件，详细说明：{@link #FIELD_PSPFPLUGINID}
     * 
     * @param pSPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSPFPLUGINID)
    public void setPSPFPluginId(String pSPFPluginId){
        this.set(FIELD_PSPFPLUGINID, pSPFPluginId);
    }
    
    /**
     * 获取 平台预置插件  
     * @return
     */
    @JsonIgnore
    public String getPSPFPluginId(){
        Object objValue = this.get(FIELD_PSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPluginIdDirty(){
        if(this.contains(FIELD_PSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置插件
     */
    @JsonIgnore
    public void resetPSPFPluginId(){
        this.reset(FIELD_PSPFPLUGINID);
    }

    /**
     * 设置 平台预置插件，详细说明：{@link #FIELD_PSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSPFPluginId}
     * @param pSPFPluginId
     */
    @JsonIgnore
    public PSSysPFPluginDTO pspfpluginid(String pSPFPluginId){
        this.setPSPFPluginId(pSPFPluginId);
        return this;
    }

    /**
     * <B>PSPFPLUGINNAME</B>&nbsp;平台预置插件，指定前端模板插件来源的平台预置插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFPLUGINID}
     */
    public final static String FIELD_PSPFPLUGINNAME = "pspfpluginname";

    /**
     * 设置 平台预置插件，详细说明：{@link #FIELD_PSPFPLUGINNAME}
     * 
     * @param pSPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSPFPLUGINNAME)
    public void setPSPFPluginName(String pSPFPluginName){
        this.set(FIELD_PSPFPLUGINNAME, pSPFPluginName);
    }
    
    /**
     * 获取 平台预置插件  
     * @return
     */
    @JsonIgnore
    public String getPSPFPluginName(){
        Object objValue = this.get(FIELD_PSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPluginNameDirty(){
        if(this.contains(FIELD_PSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置插件
     */
    @JsonIgnore
    public void resetPSPFPluginName(){
        this.reset(FIELD_PSPFPLUGINNAME);
    }

    /**
     * 设置 平台预置插件，详细说明：{@link #FIELD_PSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSPFPluginName}
     * @param pSPFPluginName
     */
    @JsonIgnore
    public PSSysPFPluginDTO pspfpluginname(String pSPFPluginName){
        this.setPSPFPluginName(pSPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSFILEID</B>&nbsp;系统文件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSFILEID = "pssysfileid";

    /**
     * 设置 系统文件标识
     * 
     * @param pSSysFileId
     * 
     */
    @JsonProperty(FIELD_PSSYSFILEID)
    public void setPSSysFileId(String pSSysFileId){
        this.set(FIELD_PSSYSFILEID, pSSysFileId);
    }
    
    /**
     * 获取 系统文件标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysFileId(){
        Object objValue = this.get(FIELD_PSSYSFILEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统文件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysFileIdDirty(){
        if(this.contains(FIELD_PSSYSFILEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统文件标识
     */
    @JsonIgnore
    public void resetPSSysFileId(){
        this.reset(FIELD_PSSYSFILEID);
    }

    /**
     * 设置 系统文件标识
     * <P>
     * 等同 {@link #setPSSysFileId}
     * @param pSSysFileId
     */
    @JsonIgnore
    public PSSysPFPluginDTO pssysfileid(String pSSysFileId){
        this.setPSSysFileId(pSSysFileId);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;系统应用插件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 系统应用插件标识
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 系统应用插件标识  
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
     * 判断 系统应用插件标识 是否指定值，包括空值
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
     * 重置 系统应用插件标识
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 系统应用插件标识
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSSysPFPluginDTO pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;插件名称，指定前端模板插件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 插件名称，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 插件名称  
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
     * 判断 插件名称 是否指定值，包括空值
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
     * 重置 插件名称
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 插件名称，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSSysPFPluginDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysPFPluginName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysPFPluginName(strName);
    }

    @JsonIgnore
    public PSSysPFPluginDTO name(String strName){
        this.setPSSysPFPluginName(strName);
        return this;
    }

    /**
     * <B>REPDEFAULT</B>&nbsp;替换默认样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_REPDEFAULT = "repdefault";

    /**
     * 设置 替换默认样式
     * 
     * @param repDefault
     * 
     */
    @JsonProperty(FIELD_REPDEFAULT)
    public void setRepDefault(Integer repDefault){
        this.set(FIELD_REPDEFAULT, repDefault);
    }
    
    /**
     * 获取 替换默认样式  
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
     * 判断 替换默认样式 是否指定值，包括空值
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
     * 重置 替换默认样式
     */
    @JsonIgnore
    public void resetRepDefault(){
        this.reset(FIELD_REPDEFAULT);
    }

    /**
     * 设置 替换默认样式
     * <P>
     * 等同 {@link #setRepDefault}
     * @param repDefault
     */
    @JsonIgnore
    public PSSysPFPluginDTO repdefault(Integer repDefault){
        this.setRepDefault(repDefault);
        return this;
    }

     /**
     * 设置 替换默认样式
     * <P>
     * 等同 {@link #setRepDefault}
     * @param repDefault
     */
    @JsonIgnore
    public PSSysPFPluginDTO repdefault(Boolean repDefault){
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
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PFPluginRTMode} 
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
    public PSSysPFPluginDTO rtobjectmode(Integer rTObjectMode){
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
    public PSSysPFPluginDTO rtobjectmode(net.ibizsys.model.PSModelEnums.PFPluginRTMode rTObjectMode){
        if(rTObjectMode == null){
            this.setRTObjectMode(null);
        }
        else{
            this.setRTObjectMode(rTObjectMode.value);
        }
        return this;
    }

    /**
     * <B>RTOBJECTNAME</B>&nbsp;运行时插件完整名称
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_RTOBJECTNAME = "rtobjectname";

    /**
     * 设置 运行时插件完整名称
     * 
     * @param rTObjectName
     * 
     */
    @JsonProperty(FIELD_RTOBJECTNAME)
    public void setRTObjectName(String rTObjectName){
        this.set(FIELD_RTOBJECTNAME, rTObjectName);
    }
    
    /**
     * 获取 运行时插件完整名称  
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
     * 判断 运行时插件完整名称 是否指定值，包括空值
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
     * 重置 运行时插件完整名称
     */
    @JsonIgnore
    public void resetRTObjectName(){
        this.reset(FIELD_RTOBJECTNAME);
    }

    /**
     * 设置 运行时插件完整名称
     * <P>
     * 等同 {@link #setRTObjectName}
     * @param rTObjectName
     */
    @JsonIgnore
    public PSSysPFPluginDTO rtobjectname(String rTObjectName){
        this.setRTObjectName(rTObjectName);
        return this;
    }

    /**
     * <B>RTOBJECTREPO</B>&nbsp;运行时插件仓库配置
     */
    public final static String FIELD_RTOBJECTREPO = "rtobjectrepo";

    /**
     * 设置 运行时插件仓库配置
     * 
     * @param rTObjectRepo
     * 
     */
    @JsonProperty(FIELD_RTOBJECTREPO)
    public void setRTObjectRepo(String rTObjectRepo){
        this.set(FIELD_RTOBJECTREPO, rTObjectRepo);
    }
    
    /**
     * 获取 运行时插件仓库配置  
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
     * 判断 运行时插件仓库配置 是否指定值，包括空值
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
     * 重置 运行时插件仓库配置
     */
    @JsonIgnore
    public void resetRTObjectRepo(){
        this.reset(FIELD_RTOBJECTREPO);
    }

    /**
     * 设置 运行时插件仓库配置
     * <P>
     * 等同 {@link #setRTObjectRepo}
     * @param rTObjectRepo
     */
    @JsonIgnore
    public PSSysPFPluginDTO rtobjectrepo(String rTObjectRepo){
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
    public PSSysPFPluginDTO studioicon(String studioIcon){
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
    public PSSysPFPluginDTO updatedate(Timestamp updateDate){
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
    public PSSysPFPluginDTO updateman(String updateMan){
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
    public PSSysPFPluginDTO usercat(String userCat){
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
    public PSSysPFPluginDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysPFPluginDTO usertag(String userTag){
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
    public PSSysPFPluginDTO usertag2(String userTag2){
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
    public PSSysPFPluginDTO usertag3(String userTag3){
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
    public PSSysPFPluginDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysPFPluginId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysPFPluginId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysPFPluginId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysPFPluginId(strValue);
    }

    @JsonIgnore
    public PSSysPFPluginDTO id(String strValue){
        this.setPSSysPFPluginId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysPFPluginDTO){
            PSSysPFPluginDTO dto = (PSSysPFPluginDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
