package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATAEXP</B>实体数据导出 模型传输对象
 * <P>
 * 实体的数据导出模型，为实体提供多模式的数据导出功能
 */
public class PSDEDataExp extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDataExp(){
    }      

    /**
     * <B>ACTIONHOLDER</B>&nbsp;行为持有者，指定独立提供数据导出能力的持有者，未指定时为【后台及前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder} 
     */
    public final static String FIELD_ACTIONHOLDER = "actionholder";

    /**
     * 设置 行为持有者，详细说明：{@link #FIELD_ACTIONHOLDER}
     * 
     * @param actionHolder
     * 
     */
    @JsonProperty(FIELD_ACTIONHOLDER)
    public void setActionHolder(Integer actionHolder){
        this.set(FIELD_ACTIONHOLDER, actionHolder);
    }
    
    /**
     * 获取 行为持有者  
     * @return
     */
    @JsonIgnore
    public Integer getActionHolder(){
        Object objValue = this.get(FIELD_ACTIONHOLDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为持有者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionHolderDirty(){
        if(this.contains(FIELD_ACTIONHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为持有者
     */
    @JsonIgnore
    public void resetActionHolder(){
        this.reset(FIELD_ACTIONHOLDER);
    }

    /**
     * 设置 行为持有者，详细说明：{@link #FIELD_ACTIONHOLDER}
     * <P>
     * 等同 {@link #setActionHolder}
     * @param actionHolder
     */
    @JsonIgnore
    public PSDEDataExp actionholder(Integer actionHolder){
        this.setActionHolder(actionHolder);
        return this;
    }

     /**
     * 设置 行为持有者，详细说明：{@link #FIELD_ACTIONHOLDER}
     * <P>
     * 等同 {@link #setActionHolder}
     * @param actionHolder
     */
    @JsonIgnore
    public PSDEDataExp actionholder(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicHolder actionHolder){
        if(actionHolder == null){
            this.setActionHolder(null);
        }
        else{
            this.setActionHolder(actionHolder.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据导出的代码标识，需要在所在的实体中具有唯一性
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
    public PSDEDataExp codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 内容类型  
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
     * 判断 内容类型 是否指定值，包括空值
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
     * 重置 内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 内容类型
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSDEDataExp contenttype(String contentType){
        this.setContentType(contentType);
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
    public PSDEDataExp createdate(String createDate){
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
    public PSDEDataExp createman(String createMan){
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
    public PSDEDataExp customcode(String customCode){
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
    public PSDEDataExp custommode(Integer customMode){
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
    public PSDEDataExp custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DATAEXPTYPE</B>&nbsp;数据导出类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DATAEXPTYPE = "dataexptype";

    /**
     * 设置 数据导出类型
     * 
     * @param dataExpType
     * 
     */
    @JsonProperty(FIELD_DATAEXPTYPE)
    public void setDataExpType(String dataExpType){
        this.set(FIELD_DATAEXPTYPE, dataExpType);
    }
    
    /**
     * 获取 数据导出类型  
     * @return
     */
    @JsonIgnore
    public String getDataExpType(){
        Object objValue = this.get(FIELD_DATAEXPTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据导出类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataExpTypeDirty(){
        if(this.contains(FIELD_DATAEXPTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导出类型
     */
    @JsonIgnore
    public void resetDataExpType(){
        this.reset(FIELD_DATAEXPTYPE);
    }

    /**
     * 设置 数据导出类型
     * <P>
     * 等同 {@link #setDataExpType}
     * @param dataExpType
     */
    @JsonIgnore
    public PSDEDataExp dataexptype(String dataExpType){
        this.setDataExpType(dataExpType);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认导出，指定当前实体导出是否为实体的默认导出配置，默认导出将应用在未指定的场合。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认导出，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认导出  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认导出
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认导出，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEDataExp defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认导出，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEDataExp defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEDataExp enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEDataExp enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXPPARAMS</B>&nbsp;导出参数
     */
    public final static String FIELD_EXPPARAMS = "expparams";

    /**
     * 设置 导出参数
     * 
     * @param expParams
     * 
     */
    @JsonProperty(FIELD_EXPPARAMS)
    public void setExpParams(String expParams){
        this.set(FIELD_EXPPARAMS, expParams);
    }
    
    /**
     * 获取 导出参数  
     * @return
     */
    @JsonIgnore
    public String getExpParams(){
        Object objValue = this.get(FIELD_EXPPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导出参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpParamsDirty(){
        if(this.contains(FIELD_EXPPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出参数
     */
    @JsonIgnore
    public void resetExpParams(){
        this.reset(FIELD_EXPPARAMS);
    }

    /**
     * 设置 导出参数
     * <P>
     * 等同 {@link #setExpParams}
     * @param expParams
     */
    @JsonIgnore
    public PSDEDataExp expparams(String expParams){
        this.setExpParams(expParams);
        return this;
    }

    /**
     * <B>EXPTAG</B>&nbsp;导出标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXPTAG = "exptag";

    /**
     * 设置 导出标记
     * 
     * @param expTag
     * 
     */
    @JsonProperty(FIELD_EXPTAG)
    public void setExpTag(String expTag){
        this.set(FIELD_EXPTAG, expTag);
    }
    
    /**
     * 获取 导出标记  
     * @return
     */
    @JsonIgnore
    public String getExpTag(){
        Object objValue = this.get(FIELD_EXPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导出标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpTagDirty(){
        if(this.contains(FIELD_EXPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出标记
     */
    @JsonIgnore
    public void resetExpTag(){
        this.reset(FIELD_EXPTAG);
    }

    /**
     * 设置 导出标记
     * <P>
     * 等同 {@link #setExpTag}
     * @param expTag
     */
    @JsonIgnore
    public PSDEDataExp exptag(String expTag){
        this.setExpTag(expTag);
        return this;
    }

    /**
     * <B>EXPTAG2</B>&nbsp;导出标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXPTAG2 = "exptag2";

    /**
     * 设置 导出标记2
     * 
     * @param expTag2
     * 
     */
    @JsonProperty(FIELD_EXPTAG2)
    public void setExpTag2(String expTag2){
        this.set(FIELD_EXPTAG2, expTag2);
    }
    
    /**
     * 获取 导出标记2  
     * @return
     */
    @JsonIgnore
    public String getExpTag2(){
        Object objValue = this.get(FIELD_EXPTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导出标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpTag2Dirty(){
        if(this.contains(FIELD_EXPTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出标记2
     */
    @JsonIgnore
    public void resetExpTag2(){
        this.reset(FIELD_EXPTAG2);
    }

    /**
     * 设置 导出标记2
     * <P>
     * 等同 {@link #setExpTag2}
     * @param expTag2
     */
    @JsonIgnore
    public PSDEDataExp exptag2(String expTag2){
        this.setExpTag2(expTag2);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定数据导出的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
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
    public PSDEDataExp extendmode(Integer extendMode){
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
    public PSDEDataExp extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>MAXROWCNT</B>&nbsp;最大记录数，指定数据导出的最大记录数，未定义时使用系统定义的【数据导出最大记录数】
     */
    public final static String FIELD_MAXROWCNT = "maxrowcnt";

    /**
     * 设置 最大记录数，详细说明：{@link #FIELD_MAXROWCNT}
     * 
     * @param maxRowCnt
     * 
     */
    @JsonProperty(FIELD_MAXROWCNT)
    public void setMaxRowCnt(Integer maxRowCnt){
        this.set(FIELD_MAXROWCNT, maxRowCnt);
    }
    
    /**
     * 获取 最大记录数  
     * @return
     */
    @JsonIgnore
    public Integer getMaxRowCnt(){
        Object objValue = this.get(FIELD_MAXROWCNT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大记录数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxRowCntDirty(){
        if(this.contains(FIELD_MAXROWCNT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大记录数
     */
    @JsonIgnore
    public void resetMaxRowCnt(){
        this.reset(FIELD_MAXROWCNT);
    }

    /**
     * 设置 最大记录数，详细说明：{@link #FIELD_MAXROWCNT}
     * <P>
     * 等同 {@link #setMaxRowCnt}
     * @param maxRowCnt
     */
    @JsonIgnore
    public PSDEDataExp maxrowcnt(Integer maxRowCnt){
        this.setMaxRowCnt(maxRowCnt);
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
    public PSDEDataExp memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>POTIME</B>&nbsp;性能优化时间，指定数据导出性能优化检测时长（毫秒），超过此时长将需要进行日志等处理。未指定时为【-1】，使用默认检测时长
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
    public PSDEDataExp potime(Integer pOTime){
        this.setPOTime(pOTime);
        return this;
    }

    /**
     * <B>PSDEDATAEXPID</B>&nbsp;实体数据导出标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATAEXPID = "psdedataexpid";

    /**
     * 设置 实体数据导出标识
     * 
     * @param pSDEDataExpId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAEXPID)
    public void setPSDEDataExpId(String pSDEDataExpId){
        this.set(FIELD_PSDEDATAEXPID, pSDEDataExpId);
    }
    
    /**
     * 获取 实体数据导出标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataExpId(){
        Object objValue = this.get(FIELD_PSDEDATAEXPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导出标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataExpIdDirty(){
        if(this.contains(FIELD_PSDEDATAEXPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导出标识
     */
    @JsonIgnore
    public void resetPSDEDataExpId(){
        this.reset(FIELD_PSDEDATAEXPID);
    }

    /**
     * 设置 实体数据导出标识
     * <P>
     * 等同 {@link #setPSDEDataExpId}
     * @param pSDEDataExpId
     */
    @JsonIgnore
    public PSDEDataExp psdedataexpid(String pSDEDataExpId){
        this.setPSDEDataExpId(pSDEDataExpId);
        return this;
    }

    /**
     * <B>PSDEDATAEXPNAME</B>&nbsp;实体数据导出名称，指定数据导出的名称，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDATAEXPNAME = "psdedataexpname";

    /**
     * 设置 实体数据导出名称，详细说明：{@link #FIELD_PSDEDATAEXPNAME}
     * 
     * @param pSDEDataExpName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAEXPNAME)
    public void setPSDEDataExpName(String pSDEDataExpName){
        this.set(FIELD_PSDEDATAEXPNAME, pSDEDataExpName);
    }
    
    /**
     * 获取 实体数据导出名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataExpName(){
        Object objValue = this.get(FIELD_PSDEDATAEXPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据导出名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataExpNameDirty(){
        if(this.contains(FIELD_PSDEDATAEXPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据导出名称
     */
    @JsonIgnore
    public void resetPSDEDataExpName(){
        this.reset(FIELD_PSDEDATAEXPNAME);
    }

    /**
     * 设置 实体数据导出名称，详细说明：{@link #FIELD_PSDEDATAEXPNAME}
     * <P>
     * 等同 {@link #setPSDEDataExpName}
     * @param pSDEDataExpName
     */
    @JsonIgnore
    public PSDEDataExp psdedataexpname(String pSDEDataExpName){
        this.setPSDEDataExpName(pSDEDataExpName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataExpName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataExpName(strName);
    }

    @JsonIgnore
    public PSDEDataExp name(String strName){
        this.setPSDEDataExpName(strName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 数据集
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 数据集  
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
     * 判断 数据集 是否指定值，包括空值
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
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEDataExp psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEDataExp psdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 数据集
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 数据集  
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
     * 判断 数据集 是否指定值，包括空值
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
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEDataExp psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体数据表格，指定数据导出的示例表格
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGrid} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体数据表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 实体数据表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridId(){
        Object objValue = this.get(FIELD_PSDEGRIDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridIdDirty(){
        if(this.contains(FIELD_PSDEGRIDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据表格
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 实体数据表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDEDataExp psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * 设置 实体数据表格，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSDEDataExp psdegridid(PSDEGrid pSDEGrid){
        if(pSDEGrid == null){
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        }
        else{
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    /**
     * <B>PSDEGRIDNAME</B>&nbsp;实体数据表格，指定数据导出的示例表格
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDID}
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 实体数据表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * 
     * @param pSDEGridName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDNAME)
    public void setPSDEGridName(String pSDEGridName){
        this.set(FIELD_PSDEGRIDNAME, pSDEGridName);
    }
    
    /**
     * 获取 实体数据表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridName(){
        Object objValue = this.get(FIELD_PSDEGRIDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridNameDirty(){
        if(this.contains(FIELD_PSDEGRIDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据表格
     */
    @JsonIgnore
    public void resetPSDEGridName(){
        this.reset(FIELD_PSDEGRIDNAME);
    }

    /**
     * 设置 实体数据表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDEDataExp psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定数据导出所在的实体对象
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
    public PSDEDataExp psdeid(String pSDEId){
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
    public PSDEDataExp psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定数据导出所在的实体对象
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
    public PSDEDataExp psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体数据导出使用的前端模板扩展插件，使用插件类型【应用实体数据导出】
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
    public PSDEDataExp pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEDataExp pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体数据导出使用的前端模板扩展插件，使用插件类型【应用实体数据导出】
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
    public PSDEDataExp pssyspfpluginname(String pSSysPFPluginName){
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
    public PSDEDataExp pssysreqitemid(String pSSysReqItemId){
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
    public PSDEDataExp pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEDataExp pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定实体数据导出使用的后台模板扩展插件
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
    public PSDEDataExp pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEDataExp pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定实体数据导出使用的后台模板扩展插件
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
    public PSDEDataExp pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
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
    public PSDEDataExp updatedate(String updateDate){
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
    public PSDEDataExp updateman(String updateMan){
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
    public PSDEDataExp usercat(String userCat){
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
    public PSDEDataExp usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataExp usertag(String userTag){
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
    public PSDEDataExp usertag2(String userTag2){
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
    public PSDEDataExp usertag3(String userTag3){
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
    public PSDEDataExp usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDataExpId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataExpId(strValue);
    }

    @JsonIgnore
    public PSDEDataExp id(String strValue){
        this.setPSDEDataExpId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDataExp){
            PSDEDataExp model = (PSDEDataExp)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
