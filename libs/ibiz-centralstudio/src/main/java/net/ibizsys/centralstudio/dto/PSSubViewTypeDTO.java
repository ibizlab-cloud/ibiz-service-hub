package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSUBVIEWTYPE</B>系统视图样式 模型传输对象
 * <P>
 * 系统定义的视图样式，在视图样式中可以定义使用的模板插件、附加参数。视图样式在标准视图类型的基础上进一步增强视图的表现及处理，在视图中应用系统视图样式将默认具备样式的特性，规划好视图样式对相同模式的视图进行管理，可以做到一致表现，一致演进
 */
public class PSSubViewTypeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSubViewTypeDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统视图样式的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSubViewTypeDTO codename(String codeName){
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
    public PSSubViewTypeDTO createdate(Timestamp createDate){
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
    public PSSubViewTypeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EXTENDCTRL</B>&nbsp;扩展视图引擎，指定视图样式是否扩展视图引擎，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXTENDCTRL = "extendctrl";

    /**
     * 设置 扩展视图引擎，详细说明：{@link #FIELD_EXTENDCTRL}
     * 
     * @param extendCtrl
     * 
     */
    @JsonProperty(FIELD_EXTENDCTRL)
    public void setExtendCtrl(Integer extendCtrl){
        this.set(FIELD_EXTENDCTRL, extendCtrl);
    }
    
    /**
     * 获取 扩展视图引擎  
     * @return
     */
    @JsonIgnore
    public Integer getExtendCtrl(){
        Object objValue = this.get(FIELD_EXTENDCTRL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展视图引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendCtrlDirty(){
        if(this.contains(FIELD_EXTENDCTRL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展视图引擎
     */
    @JsonIgnore
    public void resetExtendCtrl(){
        this.reset(FIELD_EXTENDCTRL);
    }

    /**
     * 设置 扩展视图引擎，详细说明：{@link #FIELD_EXTENDCTRL}
     * <P>
     * 等同 {@link #setExtendCtrl}
     * @param extendCtrl
     */
    @JsonIgnore
    public PSSubViewTypeDTO extendctrl(Integer extendCtrl){
        this.setExtendCtrl(extendCtrl);
        return this;
    }

     /**
     * 设置 扩展视图引擎，详细说明：{@link #FIELD_EXTENDCTRL}
     * <P>
     * 等同 {@link #setExtendCtrl}
     * @param extendCtrl
     */
    @JsonIgnore
    public PSSubViewTypeDTO extendctrl(Boolean extendCtrl){
        if(extendCtrl == null){
            this.setExtendCtrl(null);
        }
        else{
            this.setExtendCtrl(extendCtrl?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSubViewTypeDTO extendstyleonly(Integer extendStyleOnly){
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
    public PSSubViewTypeDTO extendstyleonly(Boolean extendStyleOnly){
        if(extendStyleOnly == null){
            this.setExtendStyleOnly(null);
        }
        else{
            this.setExtendStyleOnly(extendStyleOnly?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDVIEW</B>&nbsp;扩展视图表现，指定视图样式是否扩展视图表现，此参数为旧模板使用，新一代模板都通过指定模板插件进行扩展（忽略此参数），默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EXTENDVIEW = "extendview";

    /**
     * 设置 扩展视图表现，详细说明：{@link #FIELD_EXTENDVIEW}
     * 
     * @param extendView
     * 
     */
    @JsonProperty(FIELD_EXTENDVIEW)
    public void setExtendView(Integer extendView){
        this.set(FIELD_EXTENDVIEW, extendView);
    }
    
    /**
     * 获取 扩展视图表现  
     * @return
     */
    @JsonIgnore
    public Integer getExtendView(){
        Object objValue = this.get(FIELD_EXTENDVIEW);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展视图表现 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendViewDirty(){
        if(this.contains(FIELD_EXTENDVIEW)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展视图表现
     */
    @JsonIgnore
    public void resetExtendView(){
        this.reset(FIELD_EXTENDVIEW);
    }

    /**
     * 设置 扩展视图表现，详细说明：{@link #FIELD_EXTENDVIEW}
     * <P>
     * 等同 {@link #setExtendView}
     * @param extendView
     */
    @JsonIgnore
    public PSSubViewTypeDTO extendview(Integer extendView){
        this.setExtendView(extendView);
        return this;
    }

     /**
     * 设置 扩展视图表现，详细说明：{@link #FIELD_EXTENDVIEW}
     * <P>
     * 等同 {@link #setExtendView}
     * @param extendView
     */
    @JsonIgnore
    public PSSubViewTypeDTO extendview(Boolean extendView){
        if(extendView == null){
            this.setExtendView(null);
        }
        else{
            this.setExtendView(extendView?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSubViewTypeDTO memo(String memo){
        this.setMemo(memo);
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
    public PSSubViewTypeDTO previewhtml(String previewHtml){
        this.setPreviewHtml(previewHtml);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统视图样式所在的系统模块
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
    public PSSubViewTypeDTO psmoduleid(String pSModuleId){
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
    public PSSubViewTypeDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统视图样式所在的系统模块
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
    public PSSubViewTypeDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSUBVIEWTYPEID</B>&nbsp;系统视图样式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBVIEWTYPEID = "pssubviewtypeid";

    /**
     * 设置 系统视图样式
     * 
     * @param pSSubViewTypeId
     * 
     */
    @JsonProperty(FIELD_PSSUBVIEWTYPEID)
    public void setPSSubViewTypeId(String pSSubViewTypeId){
        this.set(FIELD_PSSUBVIEWTYPEID, pSSubViewTypeId);
    }
    
    /**
     * 获取 系统视图样式  
     * @return
     */
    @JsonIgnore
    public String getPSSubViewTypeId(){
        Object objValue = this.get(FIELD_PSSUBVIEWTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubViewTypeIdDirty(){
        if(this.contains(FIELD_PSSUBVIEWTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图样式
     */
    @JsonIgnore
    public void resetPSSubViewTypeId(){
        this.reset(FIELD_PSSUBVIEWTYPEID);
    }

    /**
     * 设置 系统视图样式
     * <P>
     * 等同 {@link #setPSSubViewTypeId}
     * @param pSSubViewTypeId
     */
    @JsonIgnore
    public PSSubViewTypeDTO pssubviewtypeid(String pSSubViewTypeId){
        this.setPSSubViewTypeId(pSSubViewTypeId);
        return this;
    }

    /**
     * <B>PSSUBVIEWTYPENAME</B>&nbsp;系统视图样式
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSUBVIEWTYPENAME = "pssubviewtypename";

    /**
     * 设置 系统视图样式
     * 
     * @param pSSubViewTypeName
     * 
     */
    @JsonProperty(FIELD_PSSUBVIEWTYPENAME)
    public void setPSSubViewTypeName(String pSSubViewTypeName){
        this.set(FIELD_PSSUBVIEWTYPENAME, pSSubViewTypeName);
    }
    
    /**
     * 获取 系统视图样式  
     * @return
     */
    @JsonIgnore
    public String getPSSubViewTypeName(){
        Object objValue = this.get(FIELD_PSSUBVIEWTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubViewTypeNameDirty(){
        if(this.contains(FIELD_PSSUBVIEWTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图样式
     */
    @JsonIgnore
    public void resetPSSubViewTypeName(){
        this.reset(FIELD_PSSUBVIEWTYPENAME);
    }

    /**
     * 设置 系统视图样式
     * <P>
     * 等同 {@link #setPSSubViewTypeName}
     * @param pSSubViewTypeName
     */
    @JsonIgnore
    public PSSubViewTypeDTO pssubviewtypename(String pSSubViewTypeName){
        this.setPSSubViewTypeName(pSSubViewTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSubViewTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSubViewTypeName(strName);
    }

    @JsonIgnore
    public PSSubViewTypeDTO name(String strName){
        this.setPSSubViewTypeName(strName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定系统视图样式使用的前端模板扩展插件，使用插件类型【实体视图绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
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
    public PSSubViewTypeDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSubViewTypeDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定系统视图样式使用的前端模板扩展插件，使用插件类型【实体视图绘制插件】
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
    public PSSubViewTypeDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
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
    public PSSubViewTypeDTO studioicon(String studioIcon){
        this.setStudioIcon(studioIcon);
        return this;
    }

    /**
     * <B>TYPECODE</B>&nbsp;类型代码，指定系统视图样式的代码代码
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成
     */
    public final static String FIELD_TYPECODE = "typecode";

    /**
     * 设置 类型代码，详细说明：{@link #FIELD_TYPECODE}
     * 
     * @param typeCode
     * 
     */
    @JsonProperty(FIELD_TYPECODE)
    public void setTypeCode(String typeCode){
        this.set(FIELD_TYPECODE, typeCode);
    }
    
    /**
     * 获取 类型代码  
     * @return
     */
    @JsonIgnore
    public String getTypeCode(){
        Object objValue = this.get(FIELD_TYPECODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypeCodeDirty(){
        if(this.contains(FIELD_TYPECODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型代码
     */
    @JsonIgnore
    public void resetTypeCode(){
        this.reset(FIELD_TYPECODE);
    }

    /**
     * 设置 类型代码，详细说明：{@link #FIELD_TYPECODE}
     * <P>
     * 等同 {@link #setTypeCode}
     * @param typeCode
     */
    @JsonIgnore
    public PSSubViewTypeDTO typecode(String typeCode){
        this.setTypeCode(typeCode);
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
    public PSSubViewTypeDTO updatedate(Timestamp updateDate){
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
    public PSSubViewTypeDTO updateman(String updateMan){
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
    public PSSubViewTypeDTO usercat(String userCat){
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
    public PSSubViewTypeDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSubViewTypeDTO usertag(String userTag){
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
    public PSSubViewTypeDTO usertag2(String userTag2){
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
    public PSSubViewTypeDTO usertag3(String userTag3){
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
    public PSSubViewTypeDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>UTILPARAMS</B>&nbsp;引擎参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_UTILPARAMS = "utilparams";

    /**
     * 设置 引擎参数
     * 
     * @param utilParams
     * 
     */
    @JsonProperty(FIELD_UTILPARAMS)
    public void setUtilParams(String utilParams){
        this.set(FIELD_UTILPARAMS, utilParams);
    }
    
    /**
     * 获取 引擎参数  
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
     * 判断 引擎参数 是否指定值，包括空值
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
     * 重置 引擎参数
     */
    @JsonIgnore
    public void resetUtilParams(){
        this.reset(FIELD_UTILPARAMS);
    }

    /**
     * 设置 引擎参数
     * <P>
     * 等同 {@link #setUtilParams}
     * @param utilParams
     */
    @JsonIgnore
    public PSSubViewTypeDTO utilparams(String utilParams){
        this.setUtilParams(utilParams);
        return this;
    }

    /**
     * <B>VIEWMODEL</B>&nbsp;视图模型
     */
    public final static String FIELD_VIEWMODEL = "viewmodel";

    /**
     * 设置 视图模型
     * 
     * @param viewModel
     * 
     */
    @JsonProperty(FIELD_VIEWMODEL)
    public void setViewModel(String viewModel){
        this.set(FIELD_VIEWMODEL, viewModel);
    }
    
    /**
     * 获取 视图模型  
     * @return
     */
    @JsonIgnore
    public String getViewModel(){
        Object objValue = this.get(FIELD_VIEWMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewModelDirty(){
        if(this.contains(FIELD_VIEWMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图模型
     */
    @JsonIgnore
    public void resetViewModel(){
        this.reset(FIELD_VIEWMODEL);
    }

    /**
     * 设置 视图模型
     * <P>
     * 等同 {@link #setViewModel}
     * @param viewModel
     */
    @JsonIgnore
    public PSSubViewTypeDTO viewmodel(String viewModel){
        this.setViewModel(viewModel);
        return this;
    }

    /**
     * <B>VIEWPARAMS</B>&nbsp;视图参数
     */
    public final static String FIELD_VIEWPARAMS = "viewparams";

    /**
     * 设置 视图参数
     * 
     * @param viewParams
     * 
     */
    @JsonProperty(FIELD_VIEWPARAMS)
    public void setViewParams(String viewParams){
        this.set(FIELD_VIEWPARAMS, viewParams);
    }
    
    /**
     * 获取 视图参数  
     * @return
     */
    @JsonIgnore
    public String getViewParams(){
        Object objValue = this.get(FIELD_VIEWPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParamsDirty(){
        if(this.contains(FIELD_VIEWPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数
     */
    @JsonIgnore
    public void resetViewParams(){
        this.reset(FIELD_VIEWPARAMS);
    }

    /**
     * 设置 视图参数
     * <P>
     * 等同 {@link #setViewParams}
     * @param viewParams
     */
    @JsonIgnore
    public PSSubViewTypeDTO viewparams(String viewParams){
        this.setViewParams(viewParams);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSubViewTypeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSubViewTypeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSubViewTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSubViewTypeId(strValue);
    }

    @JsonIgnore
    public PSSubViewTypeDTO id(String strValue){
        this.setPSSubViewTypeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSubViewTypeDTO){
            PSSubViewTypeDTO dto = (PSSubViewTypeDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
