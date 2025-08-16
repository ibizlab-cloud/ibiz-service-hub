package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEPRINT</B>实体打印 模型传输对象
 * <P>
 * 实体的打印模型，定义实体数据的打印逻辑，提供标准单据打印能力
 */
public class PSDEPrintDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEPrintDTO(){
    }      

    /**
     * <B>ADPSDELOGICID</B>&nbsp;查询转换逻辑，指定实体打印使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
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
    public PSDEPrintDTO adpsdelogicid(String aDPSDELogicId){
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
    public PSDEPrintDTO adpsdelogicid(PSDELogicDTO pSDELogic){
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
     * <B>ADPSDELOGICNAME</B>&nbsp;查询转换逻辑，指定实体打印使用数据集的查询上下文转换逻辑，将调用环境参数转换为数据集的调用参数
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
    public PSDEPrintDTO adpsdelogicname(String aDPSDELogicName){
        this.setADPSDELogicName(aDPSDELogicName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体打印的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEPrintDTO codename(String codeName){
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
    public PSDEPrintDTO createdate(Timestamp createDate){
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
    public PSDEPrintDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认打印，指定实体打印是否为所在实体的默认打印，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认打印，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认打印  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultMode(){
        Object objValue = this.get(FIELD_DEFAULTMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultModeDirty(){
        if(this.contains(FIELD_DEFAULTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认打印
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认打印，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEPrintDTO defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认打印，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEPrintDTO defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECOLPRIV</B>&nbsp;启用列权限控制，指定实体打印是否启用列权限控制，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECOLPRIV = "enablecolpriv";

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLECOLPRIV}
     * 
     * @param enableColPriv
     * 
     */
    @JsonProperty(FIELD_ENABLECOLPRIV)
    public void setEnableColPriv(Integer enableColPriv){
        this.set(FIELD_ENABLECOLPRIV, enableColPriv);
    }
    
    /**
     * 获取 启用列权限控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableColPriv(){
        Object objValue = this.get(FIELD_ENABLECOLPRIV);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用列权限控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableColPrivDirty(){
        if(this.contains(FIELD_ENABLECOLPRIV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用列权限控制
     */
    @JsonIgnore
    public void resetEnableColPriv(){
        this.reset(FIELD_ENABLECOLPRIV);
    }

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLECOLPRIV}
     * <P>
     * 等同 {@link #setEnableColPriv}
     * @param enableColPriv
     */
    @JsonIgnore
    public PSDEPrintDTO enablecolpriv(Integer enableColPriv){
        this.setEnableColPriv(enableColPriv);
        return this;
    }

     /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLECOLPRIV}
     * <P>
     * 等同 {@link #setEnableColPriv}
     * @param enableColPriv
     */
    @JsonIgnore
    public PSDEPrintDTO enablecolpriv(Boolean enableColPriv){
        if(enableColPriv == null){
            this.setEnableColPriv(null);
        }
        else{
            this.setEnableColPriv(enableColPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELOG</B>&nbsp;启用打印日志，指定实体打印是否启用打印日志，启用日志将记录打印的数据及相关操作信息。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLELOG = "enablelog";

    /**
     * 设置 启用打印日志，详细说明：{@link #FIELD_ENABLELOG}
     * 
     * @param enableLog
     * 
     */
    @JsonProperty(FIELD_ENABLELOG)
    public void setEnableLog(Integer enableLog){
        this.set(FIELD_ENABLELOG, enableLog);
    }
    
    /**
     * 获取 启用打印日志  
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
     * 判断 启用打印日志 是否指定值，包括空值
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
     * 重置 启用打印日志
     */
    @JsonIgnore
    public void resetEnableLog(){
        this.reset(FIELD_ENABLELOG);
    }

    /**
     * 设置 启用打印日志，详细说明：{@link #FIELD_ENABLELOG}
     * <P>
     * 等同 {@link #setEnableLog}
     * @param enableLog
     */
    @JsonIgnore
    public PSDEPrintDTO enablelog(Integer enableLog){
        this.setEnableLog(enableLog);
        return this;
    }

     /**
     * 设置 启用打印日志，详细说明：{@link #FIELD_ENABLELOG}
     * <P>
     * 等同 {@link #setEnableLog}
     * @param enableLog
     */
    @JsonIgnore
    public PSDEPrintDTO enablelog(Boolean enableLog){
        if(enableLog == null){
            this.setEnableLog(null);
        }
        else{
            this.setEnableLog(enableLog?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEMP</B>&nbsp;支持多数据打印，指定实体打印是否支持多数据连续打印，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEMP = "enablemp";

    /**
     * 设置 支持多数据打印，详细说明：{@link #FIELD_ENABLEMP}
     * 
     * @param enableMP
     * 
     */
    @JsonProperty(FIELD_ENABLEMP)
    public void setEnableMP(Integer enableMP){
        this.set(FIELD_ENABLEMP, enableMP);
    }
    
    /**
     * 获取 支持多数据打印  
     * @return
     */
    @JsonIgnore
    public Integer getEnableMP(){
        Object objValue = this.get(FIELD_ENABLEMP);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持多数据打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableMPDirty(){
        if(this.contains(FIELD_ENABLEMP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持多数据打印
     */
    @JsonIgnore
    public void resetEnableMP(){
        this.reset(FIELD_ENABLEMP);
    }

    /**
     * 设置 支持多数据打印，详细说明：{@link #FIELD_ENABLEMP}
     * <P>
     * 等同 {@link #setEnableMP}
     * @param enableMP
     */
    @JsonIgnore
    public PSDEPrintDTO enablemp(Integer enableMP){
        this.setEnableMP(enableMP);
        return this;
    }

     /**
     * 设置 支持多数据打印，详细说明：{@link #FIELD_ENABLEMP}
     * <P>
     * 等同 {@link #setEnableMP}
     * @param enableMP
     */
    @JsonIgnore
    public PSDEPrintDTO enablemp(Boolean enableMP){
        if(enableMP == null){
            this.setEnableMP(null);
        }
        else{
            this.setEnableMP(enableMP?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体打印的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEExtendMode} 
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
    public PSDEPrintDTO extendmode(Integer extendMode){
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
    public PSDEPrintDTO extendmode(net.ibizsys.model.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>GETDATAPSDEACTIONID</B>&nbsp;获取数据实体行为，指定实体打印获取数据的行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_GETDATAPSDEACTIONID = "getdatapsdeactionid";

    /**
     * 设置 获取数据实体行为，详细说明：{@link #FIELD_GETDATAPSDEACTIONID}
     * 
     * @param getDataPSDEActionId
     * 
     */
    @JsonProperty(FIELD_GETDATAPSDEACTIONID)
    public void setGetDataPSDEActionId(String getDataPSDEActionId){
        this.set(FIELD_GETDATAPSDEACTIONID, getDataPSDEActionId);
    }
    
    /**
     * 获取 获取数据实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDataPSDEActionId(){
        Object objValue = this.get(FIELD_GETDATAPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 获取数据实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDataPSDEActionIdDirty(){
        if(this.contains(FIELD_GETDATAPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 获取数据实体行为
     */
    @JsonIgnore
    public void resetGetDataPSDEActionId(){
        this.reset(FIELD_GETDATAPSDEACTIONID);
    }

    /**
     * 设置 获取数据实体行为，详细说明：{@link #FIELD_GETDATAPSDEACTIONID}
     * <P>
     * 等同 {@link #setGetDataPSDEActionId}
     * @param getDataPSDEActionId
     */
    @JsonIgnore
    public PSDEPrintDTO getdatapsdeactionid(String getDataPSDEActionId){
        this.setGetDataPSDEActionId(getDataPSDEActionId);
        return this;
    }

    /**
     * 设置 获取数据实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGetDataPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEPrintDTO getdatapsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setGetDataPSDEActionId(null);
            this.setGetDataPSDEActionName(null);
        }
        else{
            this.setGetDataPSDEActionId(pSDEAction.getPSDEActionId());
            this.setGetDataPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>GETDATAPSDEACTIONNAME</B>&nbsp;读取实体行为，指定实体打印获取数据的行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GETDATAPSDEACTIONID}
     */
    public final static String FIELD_GETDATAPSDEACTIONNAME = "getdatapsdeactionname";

    /**
     * 设置 读取实体行为，详细说明：{@link #FIELD_GETDATAPSDEACTIONNAME}
     * 
     * @param getDataPSDEActionName
     * 
     */
    @JsonProperty(FIELD_GETDATAPSDEACTIONNAME)
    public void setGetDataPSDEActionName(String getDataPSDEActionName){
        this.set(FIELD_GETDATAPSDEACTIONNAME, getDataPSDEActionName);
    }
    
    /**
     * 获取 读取实体行为  
     * @return
     */
    @JsonIgnore
    public String getGetDataPSDEActionName(){
        Object objValue = this.get(FIELD_GETDATAPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGetDataPSDEActionNameDirty(){
        if(this.contains(FIELD_GETDATAPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取实体行为
     */
    @JsonIgnore
    public void resetGetDataPSDEActionName(){
        this.reset(FIELD_GETDATAPSDEACTIONNAME);
    }

    /**
     * 设置 读取实体行为，详细说明：{@link #FIELD_GETDATAPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setGetDataPSDEActionName}
     * @param getDataPSDEActionName
     */
    @JsonIgnore
    public PSDEPrintDTO getdatapsdeactionname(String getDataPSDEActionName){
        this.setGetDataPSDEActionName(getDataPSDEActionName);
        return this;
    }

    /**
     * <B>LAYOUTPANELMODE</B>&nbsp;布局面板模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.LayoutPanelMode} 
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
    public PSDEPrintDTO layoutpanelmode(Integer layoutPanelMode){
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
    public PSDEPrintDTO layoutpanelmode(net.ibizsys.model.PSModelEnums.LayoutPanelMode layoutPanelMode){
        if(layoutPanelMode == null){
            this.setLayoutPanelMode(null);
        }
        else{
            this.setLayoutPanelMode(layoutPanelMode.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定实体打印的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
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
     * 判断 中文名称 是否指定值，包括空值
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
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEPrintDTO logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEPrintDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>POTIME</B>&nbsp;性能优化时间，指定打印性能优化检测时长（毫秒），超过此时长将需要进行日志等处理。未指定时为【-1】，使用默认检测时长
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
    public PSDEPrintDTO potime(Integer pOTime){
        this.setPOTime(pOTime);
        return this;
    }

    /**
     * <B>PRINTMODEL</B>&nbsp;打印模型
     */
    public final static String FIELD_PRINTMODEL = "printmodel";

    /**
     * 设置 打印模型
     * 
     * @param printModel
     * 
     */
    @JsonProperty(FIELD_PRINTMODEL)
    public void setPrintModel(String printModel){
        this.set(FIELD_PRINTMODEL, printModel);
    }
    
    /**
     * 获取 打印模型  
     * @return
     */
    @JsonIgnore
    public String getPrintModel(){
        Object objValue = this.get(FIELD_PRINTMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打印模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrintModelDirty(){
        if(this.contains(FIELD_PRINTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打印模型
     */
    @JsonIgnore
    public void resetPrintModel(){
        this.reset(FIELD_PRINTMODEL);
    }

    /**
     * 设置 打印模型
     * <P>
     * 等同 {@link #setPrintModel}
     * @param printModel
     */
    @JsonIgnore
    public PSDEPrintDTO printmodel(String printModel){
        this.setPrintModel(printModel);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;明细数据集合，指定实体打印明细数据的结果集对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 明细数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 明细数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 明细数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 明细数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 明细数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEPrintDTO psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 明细数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEPrintDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;关系数据集合，指定实体打印明细数据的结果集对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 关系数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 关系数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 关系数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEPrintDTO psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体打印所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSDEPrintDTO psdeid(String pSDEId){
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
    public PSDEPrintDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定实体打印所在的实体对象
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
    public PSDEPrintDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEPRINTID</B>&nbsp;实体打印标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEPRINTID = "psdeprintid";

    /**
     * 设置 实体打印标识
     * 
     * @param pSDEPrintId
     * 
     */
    @JsonProperty(FIELD_PSDEPRINTID)
    public void setPSDEPrintId(String pSDEPrintId){
        this.set(FIELD_PSDEPRINTID, pSDEPrintId);
    }
    
    /**
     * 获取 实体打印标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEPrintId(){
        Object objValue = this.get(FIELD_PSDEPRINTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPrintIdDirty(){
        if(this.contains(FIELD_PSDEPRINTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印标识
     */
    @JsonIgnore
    public void resetPSDEPrintId(){
        this.reset(FIELD_PSDEPRINTID);
    }

    /**
     * 设置 实体打印标识
     * <P>
     * 等同 {@link #setPSDEPrintId}
     * @param pSDEPrintId
     */
    @JsonIgnore
    public PSDEPrintDTO psdeprintid(String pSDEPrintId){
        this.setPSDEPrintId(pSDEPrintId);
        return this;
    }

    /**
     * <B>PSDEPRINTNAME</B>&nbsp;实体打印标识，指定实体打印的标识，需在所在实体具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEPRINTNAME = "psdeprintname";

    /**
     * 设置 实体打印标识，详细说明：{@link #FIELD_PSDEPRINTNAME}
     * 
     * @param pSDEPrintName
     * 
     */
    @JsonProperty(FIELD_PSDEPRINTNAME)
    public void setPSDEPrintName(String pSDEPrintName){
        this.set(FIELD_PSDEPRINTNAME, pSDEPrintName);
    }
    
    /**
     * 获取 实体打印标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEPrintName(){
        Object objValue = this.get(FIELD_PSDEPRINTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEPrintNameDirty(){
        if(this.contains(FIELD_PSDEPRINTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印标识
     */
    @JsonIgnore
    public void resetPSDEPrintName(){
        this.reset(FIELD_PSDEPRINTNAME);
    }

    /**
     * 设置 实体打印标识，详细说明：{@link #FIELD_PSDEPRINTNAME}
     * <P>
     * 等同 {@link #setPSDEPrintName}
     * @param pSDEPrintName
     */
    @JsonIgnore
    public PSDEPrintDTO psdeprintname(String pSDEPrintName){
        this.setPSDEPrintName(pSDEPrintName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEPrintName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEPrintName(strName);
    }

    @JsonIgnore
    public PSDEPrintDTO name(String strName){
        this.setPSDEPrintName(strName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
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
    public PSDEPrintDTO pssysreqitemid(String pSSysReqItemId){
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
    public PSDEPrintDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
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
    public PSDEPrintDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
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
    public PSDEPrintDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEPrintDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
    public PSDEPrintDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
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
    public PSDEPrintDTO pssysviewpanelid(String pSSysViewPanelId){
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
    public PSDEPrintDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
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
    public PSDEPrintDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    /**
     * <B>READPSDEOPPRIVID</B>&nbsp;读取要求权限，指定实体打印获取数据需要的操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_READPSDEOPPRIVID = "readpsdeopprivid";

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVID}
     * 
     * @param readPSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_READPSDEOPPRIVID)
    public void setReadPSDEOPPrivId(String readPSDEOPPrivId){
        this.set(FIELD_READPSDEOPPRIVID, readPSDEOPPrivId);
    }
    
    /**
     * 获取 读取要求权限  
     * @return
     */
    @JsonIgnore
    public String getReadPSDEOPPrivId(){
        Object objValue = this.get(FIELD_READPSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_READPSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取要求权限
     */
    @JsonIgnore
    public void resetReadPSDEOPPrivId(){
        this.reset(FIELD_READPSDEOPPRIVID);
    }

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVID}
     * <P>
     * 等同 {@link #setReadPSDEOPPrivId}
     * @param readPSDEOPPrivId
     */
    @JsonIgnore
    public PSDEPrintDTO readpsdeopprivid(String readPSDEOPPrivId){
        this.setReadPSDEOPPrivId(readPSDEOPPrivId);
        return this;
    }

    /**
     * 设置 读取要求权限，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setReadPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEPrintDTO readpsdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setReadPSDEOPPrivId(null);
            this.setReadPSDEOPPrivName(null);
        }
        else{
            this.setReadPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setReadPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>READPSDEOPPRIVNAME</B>&nbsp;读取要求权限，指定实体打印获取数据需要的操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_READPSDEOPPRIVID}
     */
    public final static String FIELD_READPSDEOPPRIVNAME = "readpsdeopprivname";

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVNAME}
     * 
     * @param readPSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_READPSDEOPPRIVNAME)
    public void setReadPSDEOPPrivName(String readPSDEOPPrivName){
        this.set(FIELD_READPSDEOPPRIVNAME, readPSDEOPPrivName);
    }
    
    /**
     * 获取 读取要求权限  
     * @return
     */
    @JsonIgnore
    public String getReadPSDEOPPrivName(){
        Object objValue = this.get(FIELD_READPSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 读取要求权限 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_READPSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 读取要求权限
     */
    @JsonIgnore
    public void resetReadPSDEOPPrivName(){
        this.reset(FIELD_READPSDEOPPRIVNAME);
    }

    /**
     * 设置 读取要求权限，详细说明：{@link #FIELD_READPSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setReadPSDEOPPrivName}
     * @param readPSDEOPPrivName
     */
    @JsonIgnore
    public PSDEPrintDTO readpsdeopprivname(String readPSDEOPPrivName){
        this.setReadPSDEOPPrivName(readPSDEOPPrivName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;关系数据实体，指定实体打印明细数据结果集的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 关系数据实体，详细说明：{@link #FIELD_REFPSDEID}
     * 
     * @param refPSDEId
     * 
     */
    @JsonProperty(FIELD_REFPSDEID)
    public void setRefPSDEId(String refPSDEId){
        this.set(FIELD_REFPSDEID, refPSDEId);
    }
    
    /**
     * 获取 关系数据实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEId(){
        Object objValue = this.get(FIELD_REFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEIdDirty(){
        if(this.contains(FIELD_REFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据实体
     */
    @JsonIgnore
    public void resetRefPSDEId(){
        this.reset(FIELD_REFPSDEID);
    }

    /**
     * 设置 关系数据实体，详细说明：{@link #FIELD_REFPSDEID}
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDEPrintDTO refpsdeid(String refPSDEId){
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    /**
     * 设置 关系数据实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEPrintDTO refpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        }
        else{
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>REFPSDENAME</B>&nbsp;关系数据实体，指定实体打印明细数据结果集的所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 关系数据实体，详细说明：{@link #FIELD_REFPSDENAME}
     * 
     * @param refPSDEName
     * 
     */
    @JsonProperty(FIELD_REFPSDENAME)
    public void setRefPSDEName(String refPSDEName){
        this.set(FIELD_REFPSDENAME, refPSDEName);
    }
    
    /**
     * 获取 关系数据实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEName(){
        Object objValue = this.get(FIELD_REFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDENameDirty(){
        if(this.contains(FIELD_REFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据实体
     */
    @JsonIgnore
    public void resetRefPSDEName(){
        this.reset(FIELD_REFPSDENAME);
    }

    /**
     * 设置 关系数据实体，详细说明：{@link #FIELD_REFPSDENAME}
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDEPrintDTO refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REPORTFILE</B>&nbsp;报表文件，指定实体打印报表文件的路径
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
    public PSDEPrintDTO reportfile(String reportFile){
        this.setReportFile(reportFile);
        return this;
    }

    /**
     * <B>REPORTTYPE</B>&nbsp;报表格式，指定实体打印报表文件的格式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PrintType} 
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
    public PSDEPrintDTO reporttype(String reportType){
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
    public PSDEPrintDTO reporttype(net.ibizsys.model.PSModelEnums.PrintType reportType){
        if(reportType == null){
            this.setReportType(null);
        }
        else{
            this.setReportType(reportType.value);
        }
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
    public PSDEPrintDTO updatedate(Timestamp updateDate){
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
    public PSDEPrintDTO updateman(String updateMan){
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
    public PSDEPrintDTO usercat(String userCat){
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
    public PSDEPrintDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEPrintDTO usertag(String userTag){
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
    public PSDEPrintDTO usertag2(String userTag2){
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
    public PSDEPrintDTO usertag3(String userTag3){
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
    public PSDEPrintDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEPrintId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEPrintId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEPrintId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEPrintId(strValue);
    }

    @JsonIgnore
    public PSDEPrintDTO id(String strValue){
        this.setPSDEPrintId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEPrintDTO){
            PSDEPrintDTO dto = (PSDEPrintDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
