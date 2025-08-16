package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEREPORT</B>实体报表 模型传输对象
 * <P>
 * 实体的统计分析报表模型，可通过定义报表项构建复合报表模型
 */
public class PSDEReport extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEReport(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定实体报表使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_ADPSDELOGICID = "adpsdelogicid";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * 
     * @param aDPSDELogicId
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICID)
    public void setADPSDELogicId(String aDPSDELogicId){
        this.set(FIELD_ADPSDELOGICID, aDPSDELogicId);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicId(){
        Object objValue = this.get(FIELD_ADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicIdDirty(){
        if(this.contains(FIELD_ADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicId(){
        this.reset(FIELD_ADPSDELOGICID);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICID}
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param aDPSDELogicId
     */
    @JsonIgnore
    public PSDEReport adpsdelogicid(String aDPSDELogicId){
        this.setADPSDELogicId(aDPSDELogicId);
        return this;
    }

    /**
     * 设置 查询转换逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEReport adpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setADPSDELogicId(null);
            this.setADPSDELogicName(null);
        }
        else{
            this.setADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定实体报表使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ADPSDELOGICID}
     */
    public final static String FIELD_ADPSDELOGICNAME = "adpsdelogicname";

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * 
     * @param aDPSDELogicName
     * 
     */
    @JsonProperty(FIELD_ADPSDELOGICNAME)
    public void setADPSDELogicName(String aDPSDELogicName){
        this.set(FIELD_ADPSDELOGICNAME, aDPSDELogicName);
    }
    
    /**
     * 获取 查询转换逻辑  
     * @return
     */
    @JsonIgnore
    public String getADPSDELogicName(){
        Object objValue = this.get(FIELD_ADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询转换逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isADPSDELogicNameDirty(){
        if(this.contains(FIELD_ADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询转换逻辑
     */
    @JsonIgnore
    public void resetADPSDELogicName(){
        this.reset(FIELD_ADPSDELOGICNAME);
    }

    /**
     * 设置 查询转换逻辑，详细说明：{@link #FIELD_ADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setADPSDELogicName}
     * @param aDPSDELogicName
     */
    @JsonIgnore
    public PSDEReport adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体报表的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEReport codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;默认内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ReportContentType} 
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 默认内容类型
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 默认内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 默认内容类型
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSDEReport contenttype(String contentType){
        this.setContentType(contentType);
        return this;
    }

     /**
     * 设置 默认内容类型
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSDEReport contenttype(net.ibizsys.psmodel.core.util.PSModelEnums.ReportContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
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
    public PSDEReport createdate(String createDate){
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
    public PSDEReport createman(String createMan){
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
    public PSDEReport customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;自定义模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 自定义模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 自定义模式  
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
     * 判断 自定义模式 是否指定值，包括空值
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
     * 重置 自定义模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEReport custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 自定义模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEReport custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEAUDIT</B>&nbsp;启用访问审计
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEAUDIT = "enableaudit";

    /**
     * 设置 启用访问审计
     * 
     * @param enableAudit
     * 
     */
    @JsonProperty(FIELD_ENABLEAUDIT)
    public void setEnableAudit(Integer enableAudit){
        this.set(FIELD_ENABLEAUDIT, enableAudit);
    }
    
    /**
     * 获取 启用访问审计  
     * @return
     */
    @JsonIgnore
    public Integer getEnableAudit(){
        Object objValue = this.get(FIELD_ENABLEAUDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用访问审计 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableAuditDirty(){
        if(this.contains(FIELD_ENABLEAUDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用访问审计
     */
    @JsonIgnore
    public void resetEnableAudit(){
        this.reset(FIELD_ENABLEAUDIT);
    }

    /**
     * 设置 启用访问审计
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDEReport enableaudit(Integer enableAudit){
        this.setEnableAudit(enableAudit);
        return this;
    }

     /**
     * 设置 启用访问审计
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDEReport enableaudit(Boolean enableAudit){
        if(enableAudit == null){
            this.setEnableAudit(null);
        }
        else{
            this.setEnableAudit(enableAudit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELOG</B>&nbsp;启用日志，指定实体报表是否启用报表查询日志，启用日志将记录查询报表的数据及相关操作信息。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLELOG = "enablelog";

    /**
     * 设置 启用日志，详细说明：{@link #FIELD_ENABLELOG}
     * 
     * @param enableLog
     * 
     */
    @JsonProperty(FIELD_ENABLELOG)
    public void setEnableLog(Integer enableLog){
        this.set(FIELD_ENABLELOG, enableLog);
    }
    
    /**
     * 获取 启用日志  
     * @return
     */
    @JsonIgnore
    public Integer getEnableLog(){
        Object objValue = this.get(FIELD_ENABLELOG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用日志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLogDirty(){
        if(this.contains(FIELD_ENABLELOG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用日志
     */
    @JsonIgnore
    public void resetEnableLog(){
        this.reset(FIELD_ENABLELOG);
    }

    /**
     * 设置 启用日志，详细说明：{@link #FIELD_ENABLELOG}
     * <P>
     * 等同 {@link #setEnableLog}
     * @param enableLog
     */
    @JsonIgnore
    public PSDEReport enablelog(Integer enableLog){
        this.setEnableLog(enableLog);
        return this;
    }

     /**
     * 设置 启用日志，详细说明：{@link #FIELD_ENABLELOG}
     * <P>
     * 等同 {@link #setEnableLog}
     * @param enableLog
     */
    @JsonIgnore
    public PSDEReport enablelog(Boolean enableLog){
        if(enableLog == null){
            this.setEnableLog(null);
        }
        else{
            this.setEnableLog(enableLog?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体报表的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_EXTENDMODE = "extendmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * 
     * @param extendMode
     * 
     */
    @JsonProperty(FIELD_EXTENDMODE)
    public void setExtendMode(Integer extendMode){
        this.set(FIELD_EXTENDMODE, extendMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendMode(){
        Object objValue = this.get(FIELD_EXTENDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendModeDirty(){
        if(this.contains(FIELD_EXTENDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetExtendMode(){
        this.reset(FIELD_EXTENDMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEReport extendmode(Integer extendMode){
        this.setExtendMode(extendMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSDEReport extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>LAYOUTPANELMODE</B>&nbsp;布局面板模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LayoutPanelMode} 
     */
    public final static String FIELD_LAYOUTPANELMODE = "layoutpanelmode";

    /**
     * 设置 布局面板模式
     * 
     * @param layoutPanelMode
     * 
     */
    @JsonProperty(FIELD_LAYOUTPANELMODE)
    public void setLayoutPanelMode(Integer layoutPanelMode){
        this.set(FIELD_LAYOUTPANELMODE, layoutPanelMode);
    }
    
    /**
     * 获取 布局面板模式  
     * @return
     */
    @JsonIgnore
    public Integer getLayoutPanelMode(){
        Object objValue = this.get(FIELD_LAYOUTPANELMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 布局面板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutPanelModeDirty(){
        if(this.contains(FIELD_LAYOUTPANELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板模式
     */
    @JsonIgnore
    public void resetLayoutPanelMode(){
        this.reset(FIELD_LAYOUTPANELMODE);
    }

    /**
     * 设置 布局面板模式
     * <P>
     * 等同 {@link #setLayoutPanelMode}
     * @param layoutPanelMode
     */
    @JsonIgnore
    public PSDEReport layoutpanelmode(Integer layoutPanelMode){
        this.setLayoutPanelMode(layoutPanelMode);
        return this;
    }

     /**
     * 设置 布局面板模式
     * <P>
     * 等同 {@link #setLayoutPanelMode}
     * @param layoutPanelMode
     */
    @JsonIgnore
    public PSDEReport layoutpanelmode(net.ibizsys.psmodel.core.util.PSModelEnums.LayoutPanelMode layoutPanelMode){
        if(layoutPanelMode == null){
            this.setLayoutPanelMode(null);
        }
        else{
            this.setLayoutPanelMode(layoutPanelMode.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定实体报表的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEReport logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEReport memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MULTIPAGE</B>&nbsp;多页报表，指定实体报表是否支持多页报表，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MULTIPAGE = "multipage";

    /**
     * 设置 多页报表，详细说明：{@link #FIELD_MULTIPAGE}
     * 
     * @param multiPage
     * 
     */
    @JsonProperty(FIELD_MULTIPAGE)
    public void setMultiPage(Integer multiPage){
        this.set(FIELD_MULTIPAGE, multiPage);
    }
    
    /**
     * 获取 多页报表  
     * @return
     */
    @JsonIgnore
    public Integer getMultiPage(){
        Object objValue = this.get(FIELD_MULTIPAGE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 多页报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMultiPageDirty(){
        if(this.contains(FIELD_MULTIPAGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多页报表
     */
    @JsonIgnore
    public void resetMultiPage(){
        this.reset(FIELD_MULTIPAGE);
    }

    /**
     * 设置 多页报表，详细说明：{@link #FIELD_MULTIPAGE}
     * <P>
     * 等同 {@link #setMultiPage}
     * @param multiPage
     */
    @JsonIgnore
    public PSDEReport multipage(Integer multiPage){
        this.setMultiPage(multiPage);
        return this;
    }

     /**
     * 设置 多页报表，详细说明：{@link #FIELD_MULTIPAGE}
     * <P>
     * 等同 {@link #setMultiPage}
     * @param multiPage
     */
    @JsonIgnore
    public PSDEReport multipage(Boolean multiPage){
        if(multiPage == null){
            this.setMultiPage(null);
        }
        else{
            this.setMultiPage(multiPage?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>POTIME</B>&nbsp;性能优化时间，指定报表性能优化检测时长（毫秒），超过此时长将需要进行日志等处理。未指定时为【-1】，使用默认检测时长
     */
    public final static String FIELD_POTIME = "potime";

    /**
     * 设置 性能优化时间，详细说明：{@link #FIELD_POTIME}
     * 
     * @param pOTime
     * 
     */
    @JsonProperty(FIELD_POTIME)
    public void setPOTime(Integer pOTime){
        this.set(FIELD_POTIME, pOTime);
    }
    
    /**
     * 获取 性能优化时间  
     * @return
     */
    @JsonIgnore
    public Integer getPOTime(){
        Object objValue = this.get(FIELD_POTIME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 性能优化时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPOTimeDirty(){
        if(this.contains(FIELD_POTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 性能优化时间
     */
    @JsonIgnore
    public void resetPOTime(){
        this.reset(FIELD_POTIME);
    }

    /**
     * 设置 性能优化时间，详细说明：{@link #FIELD_POTIME}
     * <P>
     * 等同 {@link #setPOTime}
     * @param pOTime
     */
    @JsonIgnore
    public PSDEReport potime(Integer pOTime){
        this.setPOTime(pOTime);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体结果集，指定实体报表的数据集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体结果集，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体结果集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体结果集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体结果集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体结果集，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEReport psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体结果集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEReport psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSID2</B>&nbsp;实体数据集2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID2 = "psdedsid2";

    /**
     * 设置 实体数据集2
     * 
     * @param pSDEDSId2
     * 
     */
    @JsonProperty(FIELD_PSDEDSID2)
    public void setPSDEDSId2(String pSDEDSId2){
        this.set(FIELD_PSDEDSID2, pSDEDSId2);
    }
    
    /**
     * 获取 实体数据集2  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId2(){
        Object objValue = this.get(FIELD_PSDEDSID2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSId2Dirty(){
        if(this.contains(FIELD_PSDEDSID2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集2
     */
    @JsonIgnore
    public void resetPSDEDSId2(){
        this.reset(FIELD_PSDEDSID2);
    }

    /**
     * 设置 实体数据集2
     * <P>
     * 等同 {@link #setPSDEDSId2}
     * @param pSDEDSId2
     */
    @JsonIgnore
    public PSDEReport psdedsid2(String pSDEDSId2){
        this.setPSDEDSId2(pSDEDSId2);
        return this;
    }

    /**
     * 设置 实体数据集2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId2}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEReport psdedsid2(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId2(null);
            this.setPSDEDSName2(null);
        }
        else{
            this.setPSDEDSId2(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName2(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSID3</B>&nbsp;实体数据集3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID3 = "psdedsid3";

    /**
     * 设置 实体数据集3
     * 
     * @param pSDEDSId3
     * 
     */
    @JsonProperty(FIELD_PSDEDSID3)
    public void setPSDEDSId3(String pSDEDSId3){
        this.set(FIELD_PSDEDSID3, pSDEDSId3);
    }
    
    /**
     * 获取 实体数据集3  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId3(){
        Object objValue = this.get(FIELD_PSDEDSID3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSId3Dirty(){
        if(this.contains(FIELD_PSDEDSID3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集3
     */
    @JsonIgnore
    public void resetPSDEDSId3(){
        this.reset(FIELD_PSDEDSID3);
    }

    /**
     * 设置 实体数据集3
     * <P>
     * 等同 {@link #setPSDEDSId3}
     * @param pSDEDSId3
     */
    @JsonIgnore
    public PSDEReport psdedsid3(String pSDEDSId3){
        this.setPSDEDSId3(pSDEDSId3);
        return this;
    }

    /**
     * 设置 实体数据集3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId3}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEReport psdedsid3(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId3(null);
            this.setPSDEDSName3(null);
        }
        else{
            this.setPSDEDSId3(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName3(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSID4</B>&nbsp;实体数据集4
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID4 = "psdedsid4";

    /**
     * 设置 实体数据集4
     * 
     * @param pSDEDSId4
     * 
     */
    @JsonProperty(FIELD_PSDEDSID4)
    public void setPSDEDSId4(String pSDEDSId4){
        this.set(FIELD_PSDEDSID4, pSDEDSId4);
    }
    
    /**
     * 获取 实体数据集4  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId4(){
        Object objValue = this.get(FIELD_PSDEDSID4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSId4Dirty(){
        if(this.contains(FIELD_PSDEDSID4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集4
     */
    @JsonIgnore
    public void resetPSDEDSId4(){
        this.reset(FIELD_PSDEDSID4);
    }

    /**
     * 设置 实体数据集4
     * <P>
     * 等同 {@link #setPSDEDSId4}
     * @param pSDEDSId4
     */
    @JsonIgnore
    public PSDEReport psdedsid4(String pSDEDSId4){
        this.setPSDEDSId4(pSDEDSId4);
        return this;
    }

    /**
     * 设置 实体数据集4，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId4}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEReport psdedsid4(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId4(null);
            this.setPSDEDSName4(null);
        }
        else{
            this.setPSDEDSId4(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName4(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体结果集，指定实体报表的数据集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体结果集，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体结果集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体结果集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体结果集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体结果集，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEReport psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEDSNAME2</B>&nbsp;实体数据集2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID2}
     */
    public final static String FIELD_PSDEDSNAME2 = "psdedsname2";

    /**
     * 设置 实体数据集2
     * 
     * @param pSDEDSName2
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME2)
    public void setPSDEDSName2(String pSDEDSName2){
        this.set(FIELD_PSDEDSNAME2, pSDEDSName2);
    }
    
    /**
     * 获取 实体数据集2  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName2(){
        Object objValue = this.get(FIELD_PSDEDSNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSName2Dirty(){
        if(this.contains(FIELD_PSDEDSNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集2
     */
    @JsonIgnore
    public void resetPSDEDSName2(){
        this.reset(FIELD_PSDEDSNAME2);
    }

    /**
     * 设置 实体数据集2
     * <P>
     * 等同 {@link #setPSDEDSName2}
     * @param pSDEDSName2
     */
    @JsonIgnore
    public PSDEReport psdedsname2(String pSDEDSName2){
        this.setPSDEDSName2(pSDEDSName2);
        return this;
    }

    /**
     * <B>PSDEDSNAME3</B>&nbsp;实体数据集3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID3}
     */
    public final static String FIELD_PSDEDSNAME3 = "psdedsname3";

    /**
     * 设置 实体数据集3
     * 
     * @param pSDEDSName3
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME3)
    public void setPSDEDSName3(String pSDEDSName3){
        this.set(FIELD_PSDEDSNAME3, pSDEDSName3);
    }
    
    /**
     * 获取 实体数据集3  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName3(){
        Object objValue = this.get(FIELD_PSDEDSNAME3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSName3Dirty(){
        if(this.contains(FIELD_PSDEDSNAME3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集3
     */
    @JsonIgnore
    public void resetPSDEDSName3(){
        this.reset(FIELD_PSDEDSNAME3);
    }

    /**
     * 设置 实体数据集3
     * <P>
     * 等同 {@link #setPSDEDSName3}
     * @param pSDEDSName3
     */
    @JsonIgnore
    public PSDEReport psdedsname3(String pSDEDSName3){
        this.setPSDEDSName3(pSDEDSName3);
        return this;
    }

    /**
     * <B>PSDEDSNAME4</B>&nbsp;实体数据集4
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID4}
     */
    public final static String FIELD_PSDEDSNAME4 = "psdedsname4";

    /**
     * 设置 实体数据集4
     * 
     * @param pSDEDSName4
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME4)
    public void setPSDEDSName4(String pSDEDSName4){
        this.set(FIELD_PSDEDSNAME4, pSDEDSName4);
    }
    
    /**
     * 获取 实体数据集4  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName4(){
        Object objValue = this.get(FIELD_PSDEDSNAME4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSName4Dirty(){
        if(this.contains(FIELD_PSDEDSNAME4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集4
     */
    @JsonIgnore
    public void resetPSDEDSName4(){
        this.reset(FIELD_PSDEDSNAME4);
    }

    /**
     * 设置 实体数据集4
     * <P>
     * 等同 {@link #setPSDEDSName4}
     * @param pSDEDSName4
     */
    @JsonIgnore
    public PSDEReport psdedsname4(String pSDEDSName4){
        this.setPSDEDSName4(pSDEDSName4);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体报表所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEReport psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEReport psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体报表所在的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEReport psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEREPORTID</B>&nbsp;实体报表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEREPORTID = "psdereportid";

    /**
     * 设置 实体报表标识
     * 
     * @param pSDEReportId
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTID)
    public void setPSDEReportId(String pSDEReportId){
        this.set(FIELD_PSDEREPORTID, pSDEReportId);
    }
    
    /**
     * 获取 实体报表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportId(){
        Object objValue = this.get(FIELD_PSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportIdDirty(){
        if(this.contains(FIELD_PSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表标识
     */
    @JsonIgnore
    public void resetPSDEReportId(){
        this.reset(FIELD_PSDEREPORTID);
    }

    /**
     * 设置 实体报表标识
     * <P>
     * 等同 {@link #setPSDEReportId}
     * @param pSDEReportId
     */
    @JsonIgnore
    public PSDEReport psdereportid(String pSDEReportId){
        this.setPSDEReportId(pSDEReportId);
        return this;
    }

    /**
     * <B>PSDEREPORTNAME</B>&nbsp;实体报表标识，指定实体报表的标识，需在所在实体中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEREPORTNAME = "psdereportname";

    /**
     * 设置 实体报表标识，详细说明：{@link #FIELD_PSDEREPORTNAME}
     * 
     * @param pSDEReportName
     * 
     */
    @JsonProperty(FIELD_PSDEREPORTNAME)
    public void setPSDEReportName(String pSDEReportName){
        this.set(FIELD_PSDEREPORTNAME, pSDEReportName);
    }
    
    /**
     * 获取 实体报表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEReportName(){
        Object objValue = this.get(FIELD_PSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEReportNameDirty(){
        if(this.contains(FIELD_PSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表标识
     */
    @JsonIgnore
    public void resetPSDEReportName(){
        this.reset(FIELD_PSDEREPORTNAME);
    }

    /**
     * 设置 实体报表标识，详细说明：{@link #FIELD_PSDEREPORTNAME}
     * <P>
     * 等同 {@link #setPSDEReportName}
     * @param pSDEReportName
     */
    @JsonIgnore
    public PSDEReport psdereportname(String pSDEReportName){
        this.setPSDEReportName(pSDEReportName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEReportName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEReportName(strName);
    }

    @JsonIgnore
    public PSDEReport name(String strName){
        this.setPSDEReportName(strName);
        return this;
    }

    /**
     * <B>PSSYSBICUBEID</B>&nbsp;系统智能立方体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICube} 
     */
    public final static String FIELD_PSSYSBICUBEID = "pssysbicubeid";

    /**
     * 设置 系统智能立方体
     * 
     * @param pSSysBICubeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEID)
    public void setPSSysBICubeId(String pSSysBICubeId){
        this.set(FIELD_PSSYSBICUBEID, pSSysBICubeId);
    }
    
    /**
     * 获取 系统智能立方体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统智能立方体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统智能立方体
     */
    @JsonIgnore
    public void resetPSSysBICubeId(){
        this.reset(FIELD_PSSYSBICUBEID);
    }

    /**
     * 设置 系统智能立方体
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICubeId
     */
    @JsonIgnore
    public PSDEReport pssysbicubeid(String pSSysBICubeId){
        this.setPSSysBICubeId(pSSysBICubeId);
        return this;
    }

    /**
     * 设置 系统智能立方体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeId}
     * @param pSSysBICube 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysbicubeid(PSSysBICube pSSysBICube){
        if(pSSysBICube == null){
            this.setPSSysBICubeId(null);
            this.setPSSysBICubeName(null);
        }
        else{
            this.setPSSysBICubeId(pSSysBICube.getPSSysBICubeId());
            this.setPSSysBICubeName(pSSysBICube.getPSSysBICubeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBENAME</B>&nbsp;系统智能立方体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEID}
     */
    public final static String FIELD_PSSYSBICUBENAME = "pssysbicubename";

    /**
     * 设置 系统智能立方体
     * 
     * @param pSSysBICubeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBENAME)
    public void setPSSysBICubeName(String pSSysBICubeName){
        this.set(FIELD_PSSYSBICUBENAME, pSSysBICubeName);
    }
    
    /**
     * 获取 系统智能立方体  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeName(){
        Object objValue = this.get(FIELD_PSSYSBICUBENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统智能立方体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统智能立方体
     */
    @JsonIgnore
    public void resetPSSysBICubeName(){
        this.reset(FIELD_PSSYSBICUBENAME);
    }

    /**
     * 设置 系统智能立方体
     * <P>
     * 等同 {@link #setPSSysBICubeName}
     * @param pSSysBICubeName
     */
    @JsonIgnore
    public PSDEReport pssysbicubename(String pSSysBICubeName){
        this.setPSSysBICubeName(pSSysBICubeName);
        return this;
    }

    /**
     * <B>PSSYSBIREPORTID</B>&nbsp;系统智能报表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIReport} 
     */
    public final static String FIELD_PSSYSBIREPORTID = "pssysbireportid";

    /**
     * 设置 系统智能报表
     * 
     * @param pSSysBIReportId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTID)
    public void setPSSysBIReportId(String pSSysBIReportId){
        this.set(FIELD_PSSYSBIREPORTID, pSSysBIReportId);
    }
    
    /**
     * 获取 系统智能报表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportId(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统智能报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportIdDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统智能报表
     */
    @JsonIgnore
    public void resetPSSysBIReportId(){
        this.reset(FIELD_PSSYSBIREPORTID);
    }

    /**
     * 设置 系统智能报表
     * <P>
     * 等同 {@link #setPSSysBIReportId}
     * @param pSSysBIReportId
     */
    @JsonIgnore
    public PSDEReport pssysbireportid(String pSSysBIReportId){
        this.setPSSysBIReportId(pSSysBIReportId);
        return this;
    }

    /**
     * 设置 系统智能报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBIReportId}
     * @param pSSysBIReport 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysbireportid(PSSysBIReport pSSysBIReport){
        if(pSSysBIReport == null){
            this.setPSSysBIReportId(null);
            this.setPSSysBIReportName(null);
        }
        else{
            this.setPSSysBIReportId(pSSysBIReport.getPSSysBIReportId());
            this.setPSSysBIReportName(pSSysBIReport.getPSSysBIReportName());
        }
        return this;
    }

    /**
     * <B>PSSYSBIREPORTNAME</B>&nbsp;系统智能报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIREPORTID}
     */
    public final static String FIELD_PSSYSBIREPORTNAME = "pssysbireportname";

    /**
     * 设置 系统智能报表
     * 
     * @param pSSysBIReportName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTNAME)
    public void setPSSysBIReportName(String pSSysBIReportName){
        this.set(FIELD_PSSYSBIREPORTNAME, pSSysBIReportName);
    }
    
    /**
     * 获取 系统智能报表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportName(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统智能报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportNameDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统智能报表
     */
    @JsonIgnore
    public void resetPSSysBIReportName(){
        this.reset(FIELD_PSSYSBIREPORTNAME);
    }

    /**
     * 设置 系统智能报表
     * <P>
     * 等同 {@link #setPSSysBIReportName}
     * @param pSSysBIReportName
     */
    @JsonIgnore
    public PSDEReport pssysbireportname(String pSSysBIReportName){
        this.setPSSysBIReportName(pSSysBIReportName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;系统智能报表体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIScheme} 
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 系统智能报表体系
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 系统智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeId(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 系统智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSDEReport pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * 设置 系统智能报表体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBIScheme 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysbischemeid(PSSysBIScheme pSSysBIScheme){
        if(pSSysBIScheme == null){
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        }
        else{
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBISCHEMENAME</B>&nbsp;系统智能报表体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBISCHEMEID}
     */
    public final static String FIELD_PSSYSBISCHEMENAME = "pssysbischemename";

    /**
     * 设置 系统智能报表体系
     * 
     * @param pSSysBISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMENAME)
    public void setPSSysBISchemeName(String pSSysBISchemeName){
        this.set(FIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }
    
    /**
     * 获取 系统智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeName(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeName(){
        this.reset(FIELD_PSSYSBISCHEMENAME);
    }

    /**
     * 设置 系统智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeName}
     * @param pSSysBISchemeName
     */
    @JsonIgnore
    public PSDEReport pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端应用插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端应用插件
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端应用插件  
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
     * 判断 前端应用插件 是否指定值，包括空值
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
     * 重置 前端应用插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端应用插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDEReport pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端应用插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEReport pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端应用插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端应用插件
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端应用插件  
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
     * 判断 前端应用插件 是否指定值，包括空值
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
     * 重置 前端应用插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端应用插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDEReport pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDEReport pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDEReport pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceId
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCEID)
    public void setPSSysResourceId(String pSSysResourceId){
        this.set(FIELD_PSSYSRESOURCEID, pSSysResourceId);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceId(){
        Object objValue = this.get(FIELD_PSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceIdDirty(){
        if(this.contains(FIELD_PSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceId(){
        this.reset(FIELD_PSSYSRESOURCEID);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSDEReport pssysresourceid(String pSSysResourceId){
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    /**
     * 设置 系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        }
        else{
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceName
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCENAME)
    public void setPSSysResourceName(String pSSysResourceName){
        this.set(FIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceName(){
        Object objValue = this.get(FIELD_PSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceNameDirty(){
        if(this.contains(FIELD_PSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceName(){
        this.reset(FIELD_PSSYSRESOURCENAME);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSDEReport pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEReport pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEReport pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
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
     * 判断 后端扩展插件 是否指定值，包括空值
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
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEReport pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，指定实体报表访问需要具备的系统统一资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSDEReport pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，指定实体报表访问需要具备的系统统一资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSDEReport pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysViewPanel} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 布局面板
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEReport pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEReport pssysviewpanelid(PSSysViewPanel pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 布局面板
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 布局面板
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEReport pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewMsgGroup} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSDEReport psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 视图消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSDEReport psviewmsggroupid(PSViewMsgGroup pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSDEReport psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>REPORTFILE</B>&nbsp;报表文件，指定实体报表报表文件的路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_REPORTFILE = "reportfile";

    /**
     * 设置 报表文件，详细说明：{@link #FIELD_REPORTFILE}
     * 
     * @param reportFile
     * 
     */
    @JsonProperty(FIELD_REPORTFILE)
    public void setReportFile(String reportFile){
        this.set(FIELD_REPORTFILE, reportFile);
    }
    
    /**
     * 获取 报表文件  
     * @return
     */
    @JsonIgnore
    public String getReportFile(){
        Object objValue = this.get(FIELD_REPORTFILE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表文件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportFileDirty(){
        if(this.contains(FIELD_REPORTFILE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表文件
     */
    @JsonIgnore
    public void resetReportFile(){
        this.reset(FIELD_REPORTFILE);
    }

    /**
     * 设置 报表文件，详细说明：{@link #FIELD_REPORTFILE}
     * <P>
     * 等同 {@link #setReportFile}
     * @param reportFile
     */
    @JsonIgnore
    public PSDEReport reportfile(String reportFile){
        this.setReportFile(reportFile);
        return this;
    }

    /**
     * <B>REPORTMODEL</B>&nbsp;报表模型
     */
    public final static String FIELD_REPORTMODEL = "reportmodel";

    /**
     * 设置 报表模型
     * 
     * @param reportModel
     * 
     */
    @JsonProperty(FIELD_REPORTMODEL)
    public void setReportModel(String reportModel){
        this.set(FIELD_REPORTMODEL, reportModel);
    }
    
    /**
     * 获取 报表模型  
     * @return
     */
    @JsonIgnore
    public String getReportModel(){
        Object objValue = this.get(FIELD_REPORTMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportModelDirty(){
        if(this.contains(FIELD_REPORTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表模型
     */
    @JsonIgnore
    public void resetReportModel(){
        this.reset(FIELD_REPORTMODEL);
    }

    /**
     * 设置 报表模型
     * <P>
     * 等同 {@link #setReportModel}
     * @param reportModel
     */
    @JsonIgnore
    public PSDEReport reportmodel(String reportModel){
        this.setReportModel(reportModel);
        return this;
    }

    /**
     * <B>REPORTPARAMS</B>&nbsp;报表参数
     */
    public final static String FIELD_REPORTPARAMS = "reportparams";

    /**
     * 设置 报表参数
     * 
     * @param reportParams
     * 
     */
    @JsonProperty(FIELD_REPORTPARAMS)
    public void setReportParams(String reportParams){
        this.set(FIELD_REPORTPARAMS, reportParams);
    }
    
    /**
     * 获取 报表参数  
     * @return
     */
    @JsonIgnore
    public String getReportParams(){
        Object objValue = this.get(FIELD_REPORTPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportParamsDirty(){
        if(this.contains(FIELD_REPORTPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表参数
     */
    @JsonIgnore
    public void resetReportParams(){
        this.reset(FIELD_REPORTPARAMS);
    }

    /**
     * 设置 报表参数
     * <P>
     * 等同 {@link #setReportParams}
     * @param reportParams
     */
    @JsonIgnore
    public PSDEReport reportparams(String reportParams){
        this.setReportParams(reportParams);
        return this;
    }

    /**
     * <B>REPORTTAG</B>&nbsp;报表标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REPORTTAG = "reporttag";

    /**
     * 设置 报表标记
     * 
     * @param reportTag
     * 
     */
    @JsonProperty(FIELD_REPORTTAG)
    public void setReportTag(String reportTag){
        this.set(FIELD_REPORTTAG, reportTag);
    }
    
    /**
     * 获取 报表标记  
     * @return
     */
    @JsonIgnore
    public String getReportTag(){
        Object objValue = this.get(FIELD_REPORTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportTagDirty(){
        if(this.contains(FIELD_REPORTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表标记
     */
    @JsonIgnore
    public void resetReportTag(){
        this.reset(FIELD_REPORTTAG);
    }

    /**
     * 设置 报表标记
     * <P>
     * 等同 {@link #setReportTag}
     * @param reportTag
     */
    @JsonIgnore
    public PSDEReport reporttag(String reportTag){
        this.setReportTag(reportTag);
        return this;
    }

    /**
     * <B>REPORTTAG2</B>&nbsp;报表标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REPORTTAG2 = "reporttag2";

    /**
     * 设置 报表标记2
     * 
     * @param reportTag2
     * 
     */
    @JsonProperty(FIELD_REPORTTAG2)
    public void setReportTag2(String reportTag2){
        this.set(FIELD_REPORTTAG2, reportTag2);
    }
    
    /**
     * 获取 报表标记2  
     * @return
     */
    @JsonIgnore
    public String getReportTag2(){
        Object objValue = this.get(FIELD_REPORTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportTag2Dirty(){
        if(this.contains(FIELD_REPORTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表标记2
     */
    @JsonIgnore
    public void resetReportTag2(){
        this.reset(FIELD_REPORTTAG2);
    }

    /**
     * 设置 报表标记2
     * <P>
     * 等同 {@link #setReportTag2}
     * @param reportTag2
     */
    @JsonIgnore
    public PSDEReport reporttag2(String reportTag2){
        this.setReportTag2(reportTag2);
        return this;
    }

    /**
     * <B>REPORTTYPE</B>&nbsp;报表格式，指定实体报表报表文件的格式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ReportType} 
     */
    public final static String FIELD_REPORTTYPE = "reporttype";

    /**
     * 设置 报表格式，详细说明：{@link #FIELD_REPORTTYPE}
     * 
     * @param reportType
     * 
     */
    @JsonProperty(FIELD_REPORTTYPE)
    public void setReportType(String reportType){
        this.set(FIELD_REPORTTYPE, reportType);
    }
    
    /**
     * 获取 报表格式  
     * @return
     */
    @JsonIgnore
    public String getReportType(){
        Object objValue = this.get(FIELD_REPORTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportTypeDirty(){
        if(this.contains(FIELD_REPORTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表格式
     */
    @JsonIgnore
    public void resetReportType(){
        this.reset(FIELD_REPORTTYPE);
    }

    /**
     * 设置 报表格式，详细说明：{@link #FIELD_REPORTTYPE}
     * <P>
     * 等同 {@link #setReportType}
     * @param reportType
     */
    @JsonIgnore
    public PSDEReport reporttype(String reportType){
        this.setReportType(reportType);
        return this;
    }

     /**
     * 设置 报表格式，详细说明：{@link #FIELD_REPORTTYPE}
     * <P>
     * 等同 {@link #setReportType}
     * @param reportType
     */
    @JsonIgnore
    public PSDEReport reporttype(net.ibizsys.psmodel.core.util.PSModelEnums.ReportType reportType){
        if(reportType == null){
            this.setReportType(null);
        }
        else{
            this.setReportType(reportType.value);
        }
        return this;
    }

    /**
     * <B>REPORTUIMODEL</B>&nbsp;报表界面模型
     */
    public final static String FIELD_REPORTUIMODEL = "reportuimodel";

    /**
     * 设置 报表界面模型
     * 
     * @param reportUIModel
     * 
     */
    @JsonProperty(FIELD_REPORTUIMODEL)
    public void setReportUIModel(String reportUIModel){
        this.set(FIELD_REPORTUIMODEL, reportUIModel);
    }
    
    /**
     * 获取 报表界面模型  
     * @return
     */
    @JsonIgnore
    public String getReportUIModel(){
        Object objValue = this.get(FIELD_REPORTUIMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 报表界面模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReportUIModelDirty(){
        if(this.contains(FIELD_REPORTUIMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 报表界面模型
     */
    @JsonIgnore
    public void resetReportUIModel(){
        this.reset(FIELD_REPORTUIMODEL);
    }

    /**
     * 设置 报表界面模型
     * <P>
     * 等同 {@link #setReportUIModel}
     * @param reportUIModel
     */
    @JsonIgnore
    public PSDEReport reportuimodel(String reportUIModel){
        this.setReportUIModel(reportUIModel);
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
    public PSDEReport updatedate(String updateDate){
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
    public PSDEReport updateman(String updateMan){
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
    public PSDEReport usercat(String userCat){
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
    public PSDEReport usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEReport usertag(String userTag){
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
    public PSDEReport usertag2(String userTag2){
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
    public PSDEReport usertag3(String userTag3){
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
    public PSDEReport usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEReportId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEReportId(strValue);
    }

    @JsonIgnore
    public PSDEReport id(String strValue){
        this.setPSDEReportId(strValue);
        return this;
    }


    /**
     *  实体报表项 成员集合
     */
    public final static String FIELD_PSDEREPITEMS = "psderepitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDERepItem> psderepitems;

    /**
     * 获取 实体报表项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEREPITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDERepItem> getPSDERepItems(){
        return this.psderepitems;
    }

    /**
     * 设置 实体报表项 成员集合  
     * @param psderepitems
     */
    @JsonProperty(FIELD_PSDEREPITEMS)
    public void setPSDERepItems(java.util.List<net.ibizsys.psmodel.core.domain.PSDERepItem> psderepitems){
        this.psderepitems = psderepitems;
    }

    /**
     * 获取 实体报表项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDERepItem> getPSDERepItemsIf(){
        if(this.psderepitems == null){
            this.psderepitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDERepItem>();          
        }
        return this.psderepitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEReport){
            PSDEReport model = (PSDEReport)iPSModel;
            model.setPSDERepItems(this.getPSDERepItems());
        }
        super.copyTo(iPSModel);
    }
}
