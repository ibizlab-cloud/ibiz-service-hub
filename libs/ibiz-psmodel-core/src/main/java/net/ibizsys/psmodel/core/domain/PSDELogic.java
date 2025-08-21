package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELOGIC</B>实体处理逻辑 模型传输对象
 * <P>
 * 实体的处理逻辑模型，提供面向业务逻辑、状态迁移、数据流及界面交互的动态逻辑定义能力。处理逻辑包含逻辑参数、处理节点与处理连接等主要模型
 */
public class PSDELogic extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDELogic(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定处理逻辑的代码标识，需要在所在的实体中具有唯一性，注意处理逻辑有多个类型，建议为每种类型设定代码前缀
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
    public PSDELogic codename(String codeName){
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
    public PSDELogic createdate(String createDate){
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
    public PSDELogic createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 脚本代码  
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
     * 判断 脚本代码 是否指定值，包括空值
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
     * 重置 脚本代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 脚本代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDELogic customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode} 
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
    public PSDELogic custommode(Integer customMode){
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
    public PSDELogic custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DEBUGMODE</B>&nbsp;调试模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicDebugMode} 
     */
    public final static String FIELD_DEBUGMODE = "debugmode";

    /**
     * 设置 调试模式
     * 
     * @param debugMode
     * 
     */
    @JsonProperty(FIELD_DEBUGMODE)
    public void setDebugMode(Integer debugMode){
        this.set(FIELD_DEBUGMODE, debugMode);
    }
    
    /**
     * 获取 调试模式  
     * @return
     */
    @JsonIgnore
    public Integer getDebugMode(){
        Object objValue = this.get(FIELD_DEBUGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 调试模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDebugModeDirty(){
        if(this.contains(FIELD_DEBUGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调试模式
     */
    @JsonIgnore
    public void resetDebugMode(){
        this.reset(FIELD_DEBUGMODE);
    }

    /**
     * 设置 调试模式
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSDELogic debugmode(Integer debugMode){
        this.setDebugMode(debugMode);
        return this;
    }

     /**
     * 设置 调试模式
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSDELogic debugmode(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicDebugMode debugMode){
        if(debugMode == null){
            this.setDebugMode(null);
        }
        else{
            this.setDebugMode(debugMode.value);
        }
        return this;
    }

    /**
     * <B>DEFAULTMSLOGIC</B>&nbsp;默认状态逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMSLOGIC = "defaultmslogic";

    /**
     * 设置 默认状态逻辑
     * 
     * @param defaultMSLogic
     * 
     */
    @JsonProperty(FIELD_DEFAULTMSLOGIC)
    public void setDefaultMSLogic(Integer defaultMSLogic){
        this.set(FIELD_DEFAULTMSLOGIC, defaultMSLogic);
    }
    
    /**
     * 获取 默认状态逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultMSLogic(){
        Object objValue = this.get(FIELD_DEFAULTMSLOGIC);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认状态逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultMSLogicDirty(){
        if(this.contains(FIELD_DEFAULTMSLOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认状态逻辑
     */
    @JsonIgnore
    public void resetDefaultMSLogic(){
        this.reset(FIELD_DEFAULTMSLOGIC);
    }

    /**
     * 设置 默认状态逻辑
     * <P>
     * 等同 {@link #setDefaultMSLogic}
     * @param defaultMSLogic
     */
    @JsonIgnore
    public PSDELogic defaultmslogic(Integer defaultMSLogic){
        this.setDefaultMSLogic(defaultMSLogic);
        return this;
    }

     /**
     * 设置 默认状态逻辑
     * <P>
     * 等同 {@link #setDefaultMSLogic}
     * @param defaultMSLogic
     */
    @JsonIgnore
    public PSDELogic defaultmslogic(Boolean defaultMSLogic){
        if(defaultMSLogic == null){
            this.setDefaultMSLogic(null);
        }
        else{
            this.setDefaultMSLogic(defaultMSLogic?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFLOGICMODE</B>&nbsp;属性逻辑模式，逻辑子类为【属性逻辑】时指定属性逻辑模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFLogicMode} 
     */
    public final static String FIELD_DEFLOGICMODE = "deflogicmode";

    /**
     * 设置 属性逻辑模式，详细说明：{@link #FIELD_DEFLOGICMODE}
     * 
     * @param dEFLogicMode
     * 
     */
    @JsonProperty(FIELD_DEFLOGICMODE)
    public void setDEFLogicMode(String dEFLogicMode){
        this.set(FIELD_DEFLOGICMODE, dEFLogicMode);
    }
    
    /**
     * 获取 属性逻辑模式  
     * @return
     */
    @JsonIgnore
    public String getDEFLogicMode(){
        Object objValue = this.get(FIELD_DEFLOGICMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性逻辑模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFLogicModeDirty(){
        if(this.contains(FIELD_DEFLOGICMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性逻辑模式
     */
    @JsonIgnore
    public void resetDEFLogicMode(){
        this.reset(FIELD_DEFLOGICMODE);
    }

    /**
     * 设置 属性逻辑模式，详细说明：{@link #FIELD_DEFLOGICMODE}
     * <P>
     * 等同 {@link #setDEFLogicMode}
     * @param dEFLogicMode
     */
    @JsonIgnore
    public PSDELogic deflogicmode(String dEFLogicMode){
        this.setDEFLogicMode(dEFLogicMode);
        return this;
    }

     /**
     * 设置 属性逻辑模式，详细说明：{@link #FIELD_DEFLOGICMODE}
     * <P>
     * 等同 {@link #setDEFLogicMode}
     * @param dEFLogicMode
     */
    @JsonIgnore
    public PSDELogic deflogicmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFLogicMode dEFLogicMode){
        if(dEFLogicMode == null){
            this.setDEFLogicMode(null);
        }
        else{
            this.setDEFLogicMode(dEFLogicMode.value);
        }
        return this;
    }

    /**
     * <B>EVENTMODEL</B>&nbsp;事件模型
     */
    public final static String FIELD_EVENTMODEL = "eventmodel";

    /**
     * 设置 事件模型
     * 
     * @param eventModel
     * 
     */
    @JsonProperty(FIELD_EVENTMODEL)
    public void setEventModel(String eventModel){
        this.set(FIELD_EVENTMODEL, eventModel);
    }
    
    /**
     * 获取 事件模型  
     * @return
     */
    @JsonIgnore
    public String getEventModel(){
        Object objValue = this.get(FIELD_EVENTMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 事件模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventModelDirty(){
        if(this.contains(FIELD_EVENTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事件模型
     */
    @JsonIgnore
    public void resetEventModel(){
        this.reset(FIELD_EVENTMODEL);
    }

    /**
     * 设置 事件模型
     * <P>
     * 等同 {@link #setEventModel}
     * @param eventModel
     */
    @JsonIgnore
    public PSDELogic eventmodel(String eventModel){
        this.setEventModel(eventModel);
        return this;
    }

    /**
     * <B>EVENTS</B>&nbsp;监控事件
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EVENTS = "events";

    /**
     * 设置 监控事件
     * 
     * @param events
     * 
     */
    @JsonProperty(FIELD_EVENTS)
    public void setEvents(String events){
        this.set(FIELD_EVENTS, events);
    }
    
    /**
     * 获取 监控事件  
     * @return
     */
    @JsonIgnore
    public String getEvents(){
        Object objValue = this.get(FIELD_EVENTS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 监控事件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEventsDirty(){
        if(this.contains(FIELD_EVENTS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 监控事件
     */
    @JsonIgnore
    public void resetEvents(){
        this.reset(FIELD_EVENTS);
    }

    /**
     * 设置 监控事件
     * <P>
     * 等同 {@link #setEvents}
     * @param events
     */
    @JsonIgnore
    public PSDELogic events(String events){
        this.setEvents(events);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体处理逻辑的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
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
    public PSDELogic extendmode(Integer extendMode){
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
    public PSDELogic extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>FINISHFLAG</B>&nbsp;是否完成
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTASKID}
     */
    public final static String FIELD_FINISHFLAG = "finishflag";

    /**
     * 设置 是否完成
     * 
     * @param finishFlag
     * 
     */
    @JsonProperty(FIELD_FINISHFLAG)
    public void setFinishFlag(Integer finishFlag){
        this.set(FIELD_FINISHFLAG, finishFlag);
    }
    
    /**
     * 获取 是否完成  
     * @return
     */
    @JsonIgnore
    public Integer getFinishFlag(){
        Object objValue = this.get(FIELD_FINISHFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否完成 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFinishFlagDirty(){
        if(this.contains(FIELD_FINISHFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否完成
     */
    @JsonIgnore
    public void resetFinishFlag(){
        this.reset(FIELD_FINISHFLAG);
    }

    /**
     * 设置 是否完成
     * <P>
     * 等同 {@link #setFinishFlag}
     * @param finishFlag
     */
    @JsonIgnore
    public PSDELogic finishflag(Integer finishFlag){
        this.setFinishFlag(finishFlag);
        return this;
    }

    /**
     * <B>IGNOREEXCEPTION</B>&nbsp;忽略异常
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_IGNOREEXCEPTION = "ignoreexception";

    /**
     * 设置 忽略异常
     * 
     * @param ignoreException
     * 
     */
    @JsonProperty(FIELD_IGNOREEXCEPTION)
    public void setIgnoreException(Integer ignoreException){
        this.set(FIELD_IGNOREEXCEPTION, ignoreException);
    }
    
    /**
     * 获取 忽略异常  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreException(){
        Object objValue = this.get(FIELD_IGNOREEXCEPTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略异常 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreExceptionDirty(){
        if(this.contains(FIELD_IGNOREEXCEPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略异常
     */
    @JsonIgnore
    public void resetIgnoreException(){
        this.reset(FIELD_IGNOREEXCEPTION);
    }

    /**
     * 设置 忽略异常
     * <P>
     * 等同 {@link #setIgnoreException}
     * @param ignoreException
     */
    @JsonIgnore
    public PSDELogic ignoreexception(Integer ignoreException){
        this.setIgnoreException(ignoreException);
        return this;
    }

     /**
     * 设置 忽略异常
     * <P>
     * 等同 {@link #setIgnoreException}
     * @param ignoreException
     */
    @JsonIgnore
    public PSDELogic ignoreexception(Boolean ignoreException){
        if(ignoreException == null){
            this.setIgnoreException(null);
        }
        else{
            this.setIgnoreException(ignoreException?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICHOLDER</B>&nbsp;逻辑持有者，指定具备独立提供逻辑功能的持有者，未指定时为【后台及前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder} 
     */
    public final static String FIELD_LOGICHOLDER = "logicholder";

    /**
     * 设置 逻辑持有者，详细说明：{@link #FIELD_LOGICHOLDER}
     * 
     * @param logicHolder
     * 
     */
    @JsonProperty(FIELD_LOGICHOLDER)
    public void setLogicHolder(Integer logicHolder){
        this.set(FIELD_LOGICHOLDER, logicHolder);
    }
    
    /**
     * 获取 逻辑持有者  
     * @return
     */
    @JsonIgnore
    public Integer getLogicHolder(){
        Object objValue = this.get(FIELD_LOGICHOLDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 逻辑持有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicHolderDirty(){
        if(this.contains(FIELD_LOGICHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑持有者
     */
    @JsonIgnore
    public void resetLogicHolder(){
        this.reset(FIELD_LOGICHOLDER);
    }

    /**
     * 设置 逻辑持有者，详细说明：{@link #FIELD_LOGICHOLDER}
     * <P>
     * 等同 {@link #setLogicHolder}
     * @param logicHolder
     */
    @JsonIgnore
    public PSDELogic logicholder(Integer logicHolder){
        this.setLogicHolder(logicHolder);
        return this;
    }

     /**
     * 设置 逻辑持有者，详细说明：{@link #FIELD_LOGICHOLDER}
     * <P>
     * 等同 {@link #setLogicHolder}
     * @param logicHolder
     */
    @JsonIgnore
    public PSDELogic logicholder(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder logicHolder){
        if(logicHolder == null){
            this.setLogicHolder(null);
        }
        else{
            this.setLogicHolder(logicHolder.value);
        }
        return this;
    }

    /**
     * <B>LOGICSN</B>&nbsp;逻辑编号
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_LOGICSN = "logicsn";

    /**
     * 设置 逻辑编号
     * 
     * @param logicSN
     * 
     */
    @JsonProperty(FIELD_LOGICSN)
    public void setLogicSN(String logicSN){
        this.set(FIELD_LOGICSN, logicSN);
    }
    
    /**
     * 获取 逻辑编号  
     * @return
     */
    @JsonIgnore
    public String getLogicSN(){
        Object objValue = this.get(FIELD_LOGICSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicSNDirty(){
        if(this.contains(FIELD_LOGICSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑编号
     */
    @JsonIgnore
    public void resetLogicSN(){
        this.reset(FIELD_LOGICSN);
    }

    /**
     * 设置 逻辑编号
     * <P>
     * 等同 {@link #setLogicSN}
     * @param logicSN
     */
    @JsonIgnore
    public PSDELogic logicsn(String logicSN){
        this.setLogicSN(logicSN);
        return this;
    }

    /**
     * <B>LOGICSUBTYPE</B>&nbsp;逻辑子类，指定处理逻辑的子类，未定义为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LogicSubType} 
     */
    public final static String FIELD_LOGICSUBTYPE = "logicsubtype";

    /**
     * 设置 逻辑子类，详细说明：{@link #FIELD_LOGICSUBTYPE}
     * 
     * @param logicSubType
     * 
     */
    @JsonProperty(FIELD_LOGICSUBTYPE)
    public void setLogicSubType(String logicSubType){
        this.set(FIELD_LOGICSUBTYPE, logicSubType);
    }
    
    /**
     * 获取 逻辑子类  
     * @return
     */
    @JsonIgnore
    public String getLogicSubType(){
        Object objValue = this.get(FIELD_LOGICSUBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑子类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicSubTypeDirty(){
        if(this.contains(FIELD_LOGICSUBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑子类
     */
    @JsonIgnore
    public void resetLogicSubType(){
        this.reset(FIELD_LOGICSUBTYPE);
    }

    /**
     * 设置 逻辑子类，详细说明：{@link #FIELD_LOGICSUBTYPE}
     * <P>
     * 等同 {@link #setLogicSubType}
     * @param logicSubType
     */
    @JsonIgnore
    public PSDELogic logicsubtype(String logicSubType){
        this.setLogicSubType(logicSubType);
        return this;
    }

     /**
     * 设置 逻辑子类，详细说明：{@link #FIELD_LOGICSUBTYPE}
     * <P>
     * 等同 {@link #setLogicSubType}
     * @param logicSubType
     */
    @JsonIgnore
    public PSDELogic logicsubtype(net.ibizsys.psmodel.core.util.PSModelEnums.LogicSubType logicSubType){
        if(logicSubType == null){
            this.setLogicSubType(null);
        }
        else{
            this.setLogicSubType(logicSubType.value);
        }
        return this;
    }

    /**
     * <B>LOGICTAG</B>&nbsp;逻辑标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICTAG = "logictag";

    /**
     * 设置 逻辑标记
     * 
     * @param logicTag
     * 
     */
    @JsonProperty(FIELD_LOGICTAG)
    public void setLogicTag(String logicTag){
        this.set(FIELD_LOGICTAG, logicTag);
    }
    
    /**
     * 获取 逻辑标记  
     * @return
     */
    @JsonIgnore
    public String getLogicTag(){
        Object objValue = this.get(FIELD_LOGICTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTagDirty(){
        if(this.contains(FIELD_LOGICTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑标记
     */
    @JsonIgnore
    public void resetLogicTag(){
        this.reset(FIELD_LOGICTAG);
    }

    /**
     * 设置 逻辑标记
     * <P>
     * 等同 {@link #setLogicTag}
     * @param logicTag
     */
    @JsonIgnore
    public PSDELogic logictag(String logicTag){
        this.setLogicTag(logicTag);
        return this;
    }

    /**
     * <B>LOGICTAG2</B>&nbsp;逻辑标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICTAG2 = "logictag2";

    /**
     * 设置 逻辑标记2
     * 
     * @param logicTag2
     * 
     */
    @JsonProperty(FIELD_LOGICTAG2)
    public void setLogicTag2(String logicTag2){
        this.set(FIELD_LOGICTAG2, logicTag2);
    }
    
    /**
     * 获取 逻辑标记2  
     * @return
     */
    @JsonIgnore
    public String getLogicTag2(){
        Object objValue = this.get(FIELD_LOGICTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTag2Dirty(){
        if(this.contains(FIELD_LOGICTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑标记2
     */
    @JsonIgnore
    public void resetLogicTag2(){
        this.reset(FIELD_LOGICTAG2);
    }

    /**
     * 设置 逻辑标记2
     * <P>
     * 等同 {@link #setLogicTag2}
     * @param logicTag2
     */
    @JsonIgnore
    public PSDELogic logictag2(String logicTag2){
        this.setLogicTag2(logicTag2);
        return this;
    }

    /**
     * <B>LOGICTAG3</B>&nbsp;逻辑标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICTAG3 = "logictag3";

    /**
     * 设置 逻辑标记3
     * 
     * @param logicTag3
     * 
     */
    @JsonProperty(FIELD_LOGICTAG3)
    public void setLogicTag3(String logicTag3){
        this.set(FIELD_LOGICTAG3, logicTag3);
    }
    
    /**
     * 获取 逻辑标记3  
     * @return
     */
    @JsonIgnore
    public String getLogicTag3(){
        Object objValue = this.get(FIELD_LOGICTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTag3Dirty(){
        if(this.contains(FIELD_LOGICTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑标记3
     */
    @JsonIgnore
    public void resetLogicTag3(){
        this.reset(FIELD_LOGICTAG3);
    }

    /**
     * 设置 逻辑标记3
     * <P>
     * 等同 {@link #setLogicTag3}
     * @param logicTag3
     */
    @JsonIgnore
    public PSDELogic logictag3(String logicTag3){
        this.setLogicTag3(logicTag3);
        return this;
    }

    /**
     * <B>LOGICTAG4</B>&nbsp;逻辑标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_LOGICTAG4 = "logictag4";

    /**
     * 设置 逻辑标记4
     * 
     * @param logicTag4
     * 
     */
    @JsonProperty(FIELD_LOGICTAG4)
    public void setLogicTag4(String logicTag4){
        this.set(FIELD_LOGICTAG4, logicTag4);
    }
    
    /**
     * 获取 逻辑标记4  
     * @return
     */
    @JsonIgnore
    public String getLogicTag4(){
        Object objValue = this.get(FIELD_LOGICTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTag4Dirty(){
        if(this.contains(FIELD_LOGICTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑标记4
     */
    @JsonIgnore
    public void resetLogicTag4(){
        this.reset(FIELD_LOGICTAG4);
    }

    /**
     * 设置 逻辑标记4
     * <P>
     * 等同 {@link #setLogicTag4}
     * @param logicTag4
     */
    @JsonIgnore
    public PSDELogic logictag4(String logicTag4){
        this.setLogicTag4(logicTag4);
        return this;
    }

    /**
     * <B>LOGICTYPE</B>&nbsp;逻辑类型，指定处理逻辑的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LogicType} 
     */
    public final static String FIELD_LOGICTYPE = "logictype";

    /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_LOGICTYPE}
     * 
     * @param logicType
     * 
     */
    @JsonProperty(FIELD_LOGICTYPE)
    public void setLogicType(String logicType){
        this.set(FIELD_LOGICTYPE, logicType);
    }
    
    /**
     * 获取 逻辑类型  
     * @return
     */
    @JsonIgnore
    public String getLogicType(){
        Object objValue = this.get(FIELD_LOGICTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTypeDirty(){
        if(this.contains(FIELD_LOGICTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑类型
     */
    @JsonIgnore
    public void resetLogicType(){
        this.reset(FIELD_LOGICTYPE);
    }

    /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_LOGICTYPE}
     * <P>
     * 等同 {@link #setLogicType}
     * @param logicType
     */
    @JsonIgnore
    public PSDELogic logictype(String logicType){
        this.setLogicType(logicType);
        return this;
    }

     /**
     * 设置 逻辑类型，详细说明：{@link #FIELD_LOGICTYPE}
     * <P>
     * 等同 {@link #setLogicType}
     * @param logicType
     */
    @JsonIgnore
    public PSDELogic logictype(net.ibizsys.psmodel.core.util.PSModelEnums.LogicType logicType){
        if(logicType == null){
            this.setLogicType(null);
        }
        else{
            this.setLogicType(logicType.value);
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
    public PSDELogic memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;附加次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 附加次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 附加次序  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 附加次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 附加次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDELogic ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，逻辑子类为【属性逻辑】时指定相应的属性，必须在逻辑所在的实体中
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDELogic psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDELogic psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，逻辑子类为【属性逻辑】时指定相应的属性，必须在逻辑所在的实体中
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDELogic psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定处理逻辑所在的实体，业务处理逻辑与界面处理逻辑都需要有容器实体
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
    public PSDELogic psdeid(String pSDEId){
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
    public PSDELogic psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELOGICID</B>&nbsp;实体处理逻辑标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体处理逻辑标识
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体处理逻辑标识  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体处理逻辑标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体处理逻辑标识
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体处理逻辑标识
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDELogic psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;处理逻辑名称，指定处理逻辑的名称，需要在所在的实体中具有唯一性，注意实体处理逻辑分为业务逻辑及界面逻辑两类
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 处理逻辑名称，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 处理逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 处理逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 处理逻辑名称
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 处理逻辑名称，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDELogic psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDELogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDELogicName(strName);
    }

    @JsonIgnore
    public PSDELogic name(String strName){
        this.setPSDELogicName(strName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定处理逻辑所在的实体，业务处理逻辑与界面处理逻辑都需要有容器实体
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
    public PSDELogic psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSDELogic psmoduleid(String pSModuleId){
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
    public PSDELogic psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
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
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSDELogic psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型，指定系统的动态模型对象，扩展当前模型定义
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELID}
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
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELID}
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDELogic pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDELogic pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型，指定系统的动态模型对象，扩展当前模型定义
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
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
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDELogic pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求，指定处理逻辑所对应的系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求，详细说明：{@link #FIELD_PSSYSREQITEMID}
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
     * 设置 系统设计需求，详细说明：{@link #FIELD_PSSYSREQITEMID}
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDELogic pssysreqitemid(String pSSysReqItemId){
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
    public PSDELogic pssysreqitemid(PSSysReqItem pSSysReqItem){
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
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求，指定处理逻辑所对应的系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求，详细说明：{@link #FIELD_PSSYSREQITEMNAME}
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
     * 设置 系统设计需求，详细说明：{@link #FIELD_PSSYSREQITEMNAME}
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDELogic pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
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
    public PSDELogic pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDELogic pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSDELogic pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SCRIPTENGINE</B>&nbsp;默认脚本引擎
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptEngine} 
     */
    public final static String FIELD_SCRIPTENGINE = "scriptengine";

    /**
     * 设置 默认脚本引擎
     * 
     * @param scriptEngine
     * 
     */
    @JsonProperty(FIELD_SCRIPTENGINE)
    public void setScriptEngine(String scriptEngine){
        this.set(FIELD_SCRIPTENGINE, scriptEngine);
    }
    
    /**
     * 获取 默认脚本引擎  
     * @return
     */
    @JsonIgnore
    public String getScriptEngine(){
        Object objValue = this.get(FIELD_SCRIPTENGINE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认脚本引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isScriptEngineDirty(){
        if(this.contains(FIELD_SCRIPTENGINE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认脚本引擎
     */
    @JsonIgnore
    public void resetScriptEngine(){
        this.reset(FIELD_SCRIPTENGINE);
    }

    /**
     * 设置 默认脚本引擎
     * <P>
     * 等同 {@link #setScriptEngine}
     * @param scriptEngine
     */
    @JsonIgnore
    public PSDELogic scriptengine(String scriptEngine){
        this.setScriptEngine(scriptEngine);
        return this;
    }

    /**
     * <B>TEMPLFLAG</B>&nbsp;模板逻辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_TEMPLFLAG = "templflag";

    /**
     * 设置 模板逻辑
     * 
     * @param templFlag
     * 
     */
    @JsonProperty(FIELD_TEMPLFLAG)
    public void setTemplFlag(Integer templFlag){
        this.set(FIELD_TEMPLFLAG, templFlag);
    }
    
    /**
     * 获取 模板逻辑  
     * @return
     */
    @JsonIgnore
    public Integer getTemplFlag(){
        Object objValue = this.get(FIELD_TEMPLFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模板逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplFlagDirty(){
        if(this.contains(FIELD_TEMPLFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模板逻辑
     */
    @JsonIgnore
    public void resetTemplFlag(){
        this.reset(FIELD_TEMPLFLAG);
    }

    /**
     * 设置 模板逻辑
     * <P>
     * 等同 {@link #setTemplFlag}
     * @param templFlag
     */
    @JsonIgnore
    public PSDELogic templflag(Integer templFlag){
        this.setTemplFlag(templFlag);
        return this;
    }

     /**
     * 设置 模板逻辑
     * <P>
     * 等同 {@link #setTemplFlag}
     * @param templFlag
     */
    @JsonIgnore
    public PSDELogic templflag(Boolean templFlag){
        if(templFlag == null){
            this.setTemplFlag(null);
        }
        else{
            this.setTemplFlag(templFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>THREADRUNMODE</B>&nbsp;线程运行模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicThreadRunMode} 
     */
    public final static String FIELD_THREADRUNMODE = "threadrunmode";

    /**
     * 设置 线程运行模式
     * 
     * @param threadRunMode
     * 
     */
    @JsonProperty(FIELD_THREADRUNMODE)
    public void setThreadRunMode(Integer threadRunMode){
        this.set(FIELD_THREADRUNMODE, threadRunMode);
    }
    
    /**
     * 获取 线程运行模式  
     * @return
     */
    @JsonIgnore
    public Integer getThreadRunMode(){
        Object objValue = this.get(FIELD_THREADRUNMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 线程运行模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThreadRunModeDirty(){
        if(this.contains(FIELD_THREADRUNMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 线程运行模式
     */
    @JsonIgnore
    public void resetThreadRunMode(){
        this.reset(FIELD_THREADRUNMODE);
    }

    /**
     * 设置 线程运行模式
     * <P>
     * 等同 {@link #setThreadRunMode}
     * @param threadRunMode
     */
    @JsonIgnore
    public PSDELogic threadrunmode(Integer threadRunMode){
        this.setThreadRunMode(threadRunMode);
        return this;
    }

     /**
     * 设置 线程运行模式
     * <P>
     * 等同 {@link #setThreadRunMode}
     * @param threadRunMode
     */
    @JsonIgnore
    public PSDELogic threadrunmode(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicThreadRunMode threadRunMode){
        if(threadRunMode == null){
            this.setThreadRunMode(null);
        }
        else{
            this.setThreadRunMode(threadRunMode.value);
        }
        return this;
    }

    /**
     * <B>TIMERPOLICY</B>&nbsp;定时策略
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_TIMERPOLICY = "timerpolicy";

    /**
     * 设置 定时策略
     * 
     * @param timerPolicy
     * 
     */
    @JsonProperty(FIELD_TIMERPOLICY)
    public void setTimerPolicy(String timerPolicy){
        this.set(FIELD_TIMERPOLICY, timerPolicy);
    }
    
    /**
     * 获取 定时策略  
     * @return
     */
    @JsonIgnore
    public String getTimerPolicy(){
        Object objValue = this.get(FIELD_TIMERPOLICY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 定时策略 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimerPolicyDirty(){
        if(this.contains(FIELD_TIMERPOLICY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 定时策略
     */
    @JsonIgnore
    public void resetTimerPolicy(){
        this.reset(FIELD_TIMERPOLICY);
    }

    /**
     * 设置 定时策略
     * <P>
     * 等同 {@link #setTimerPolicy}
     * @param timerPolicy
     */
    @JsonIgnore
    public PSDELogic timerpolicy(String timerPolicy){
        this.setTimerPolicy(timerPolicy);
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
    public PSDELogic updatedate(String updateDate){
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
    public PSDELogic updateman(String updateMan){
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
    public PSDELogic usercat(String userCat){
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
    public PSDELogic usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDELogic usertag(String userTag){
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
    public PSDELogic usertag2(String userTag2){
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
    public PSDELogic usertag3(String userTag3){
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
    public PSDELogic usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDELogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDELogicId(strValue);
    }

    @JsonIgnore
    public PSDELogic id(String strValue){
        this.setPSDELogicId(strValue);
        return this;
    }


    /**
     *  实体处理逻辑连接 成员集合
     */
    public final static String FIELD_PSDELOGICLINKS = "psdelogiclinks";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicLink> psdelogiclinks;

    /**
     * 获取 实体处理逻辑连接 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELOGICLINKS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicLink> getPSDELogicLinks(){
        return this.psdelogiclinks;
    }

    /**
     * 设置 实体处理逻辑连接 成员集合  
     * @param psdelogiclinks
     */
    @JsonProperty(FIELD_PSDELOGICLINKS)
    public void setPSDELogicLinks(java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicLink> psdelogiclinks){
        this.psdelogiclinks = psdelogiclinks;
    }

    /**
     * 获取 实体处理逻辑连接 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicLink> getPSDELogicLinksIf(){
        if(this.psdelogiclinks == null){
            this.psdelogiclinks = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDELogicLink>();          
        }
        return this.psdelogiclinks;
    }


    /**
     *  实体处理逻辑节点 成员集合
     */
    public final static String FIELD_PSDELOGICNODES = "psdelogicnodes";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicNode> psdelogicnodes;

    /**
     * 获取 实体处理逻辑节点 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELOGICNODES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicNode> getPSDELogicNodes(){
        return this.psdelogicnodes;
    }

    /**
     * 设置 实体处理逻辑节点 成员集合  
     * @param psdelogicnodes
     */
    @JsonProperty(FIELD_PSDELOGICNODES)
    public void setPSDELogicNodes(java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicNode> psdelogicnodes){
        this.psdelogicnodes = psdelogicnodes;
    }

    /**
     * 获取 实体处理逻辑节点 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicNode> getPSDELogicNodesIf(){
        if(this.psdelogicnodes == null){
            this.psdelogicnodes = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDELogicNode>();          
        }
        return this.psdelogicnodes;
    }


    /**
     *  实体逻辑参数 成员集合
     */
    public final static String FIELD_PSDELOGICPARAMS = "psdelogicparams";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicParam> psdelogicparams;

    /**
     * 获取 实体逻辑参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELOGICPARAMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicParam> getPSDELogicParams(){
        return this.psdelogicparams;
    }

    /**
     * 设置 实体逻辑参数 成员集合  
     * @param psdelogicparams
     */
    @JsonProperty(FIELD_PSDELOGICPARAMS)
    public void setPSDELogicParams(java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicParam> psdelogicparams){
        this.psdelogicparams = psdelogicparams;
    }

    /**
     * 获取 实体逻辑参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDELogicParam> getPSDELogicParamsIf(){
        if(this.psdelogicparams == null){
            this.psdelogicparams = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDELogicParam>();          
        }
        return this.psdelogicparams;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDELogic){
            PSDELogic model = (PSDELogic)iPSModel;
            model.setPSDELogicLinks(this.getPSDELogicLinks());
            model.setPSDELogicNodes(this.getPSDELogicNodes());
            model.setPSDELogicParams(this.getPSDELogicParams());
        }
        super.copyTo(iPSModel);
    }
}
