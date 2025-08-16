package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATAQUERY</B>实体数据查询 模型传输对象
 * <P>
 * 实体数据查询模型，定义实体的原子数据查询模型。数据查询支持定义查询连接及条件，数据查询可独立使用或被数据集引用
 */
public class PSDEDataQueryDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEDataQueryDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定数据查询的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEDataQueryDTO codename(String codeName){
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
    public PSDEDataQueryDTO createdate(Timestamp createDate){
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
    public PSDEDataQueryDTO createman(String createMan){
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
    public PSDEDataQueryDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;自定义代码，指定数据查询是否启用自定义代码模式，自定义代码满足个性化或复杂应用场景，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 自定义代码，详细说明：{@link #FIELD_CUSTOMMODE}
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 自定义代码  
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
     * 判断 自定义代码 是否指定值，包括空值
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
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 自定义代码，详细说明：{@link #FIELD_CUSTOMMODE}
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 自定义代码，详细说明：{@link #FIELD_CUSTOMMODE}
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认查询，指定数据查询是否作为当前实体的默认数据查询，未指定时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认查询，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(Integer defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认查询  
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
     * 判断 默认查询 是否指定值，包括空值
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
     * 重置 默认查询
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认查询，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO defaultmode(Integer defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认查询，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO defaultmode(Boolean defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DQSN</B>&nbsp;查询编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DQSN = "dqsn";

    /**
     * 设置 查询编号
     * 
     * @param dQSN
     * 
     */
    @JsonProperty(FIELD_DQSN)
    public void setDQSN(String dQSN){
        this.set(FIELD_DQSN, dQSN);
    }
    
    /**
     * 获取 查询编号  
     * @return
     */
    @JsonIgnore
    public String getDQSN(){
        Object objValue = this.get(FIELD_DQSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDQSNDirty(){
        if(this.contains(FIELD_DQSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询编号
     */
    @JsonIgnore
    public void resetDQSN(){
        this.reset(FIELD_DQSN);
    }

    /**
     * 设置 查询编号
     * <P>
     * 等同 {@link #setDQSN}
     * @param dQSN
     */
    @JsonIgnore
    public PSDEDataQueryDTO dqsn(String dQSN){
        this.setDQSN(dQSN);
        return this;
    }

    /**
     * <B>DQTAG</B>&nbsp;数据查询标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DQTAG = "dqtag";

    /**
     * 设置 数据查询标记
     * 
     * @param dQTag
     * 
     */
    @JsonProperty(FIELD_DQTAG)
    public void setDQTag(String dQTag){
        this.set(FIELD_DQTAG, dQTag);
    }
    
    /**
     * 获取 数据查询标记  
     * @return
     */
    @JsonIgnore
    public String getDQTag(){
        Object objValue = this.get(FIELD_DQTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDQTagDirty(){
        if(this.contains(FIELD_DQTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询标记
     */
    @JsonIgnore
    public void resetDQTag(){
        this.reset(FIELD_DQTAG);
    }

    /**
     * 设置 数据查询标记
     * <P>
     * 等同 {@link #setDQTag}
     * @param dQTag
     */
    @JsonIgnore
    public PSDEDataQueryDTO dqtag(String dQTag){
        this.setDQTag(dQTag);
        return this;
    }

    /**
     * <B>DQTAG2</B>&nbsp;数据查询标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DQTAG2 = "dqtag2";

    /**
     * 设置 数据查询标记2
     * 
     * @param dQTag2
     * 
     */
    @JsonProperty(FIELD_DQTAG2)
    public void setDQTag2(String dQTag2){
        this.set(FIELD_DQTAG2, dQTag2);
    }
    
    /**
     * 获取 数据查询标记2  
     * @return
     */
    @JsonIgnore
    public String getDQTag2(){
        Object objValue = this.get(FIELD_DQTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDQTag2Dirty(){
        if(this.contains(FIELD_DQTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询标记2
     */
    @JsonIgnore
    public void resetDQTag2(){
        this.reset(FIELD_DQTAG2);
    }

    /**
     * 设置 数据查询标记2
     * <P>
     * 等同 {@link #setDQTag2}
     * @param dQTag2
     */
    @JsonIgnore
    public PSDEDataQueryDTO dqtag2(String dQTag2){
        this.setDQTag2(dQTag2);
        return this;
    }

    /**
     * <B>DQTAG3</B>&nbsp;数据查询标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DQTAG3 = "dqtag3";

    /**
     * 设置 数据查询标记3
     * 
     * @param dQTag3
     * 
     */
    @JsonProperty(FIELD_DQTAG3)
    public void setDQTag3(String dQTag3){
        this.set(FIELD_DQTAG3, dQTag3);
    }
    
    /**
     * 获取 数据查询标记3  
     * @return
     */
    @JsonIgnore
    public String getDQTag3(){
        Object objValue = this.get(FIELD_DQTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDQTag3Dirty(){
        if(this.contains(FIELD_DQTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询标记3
     */
    @JsonIgnore
    public void resetDQTag3(){
        this.reset(FIELD_DQTAG3);
    }

    /**
     * 设置 数据查询标记3
     * <P>
     * 等同 {@link #setDQTag3}
     * @param dQTag3
     */
    @JsonIgnore
    public PSDEDataQueryDTO dqtag3(String dQTag3){
        this.setDQTag3(dQTag3);
        return this;
    }

    /**
     * <B>DQTAG4</B>&nbsp;数据查询标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DQTAG4 = "dqtag4";

    /**
     * 设置 数据查询标记4
     * 
     * @param dQTag4
     * 
     */
    @JsonProperty(FIELD_DQTAG4)
    public void setDQTag4(String dQTag4){
        this.set(FIELD_DQTAG4, dQTag4);
    }
    
    /**
     * 获取 数据查询标记4  
     * @return
     */
    @JsonIgnore
    public String getDQTag4(){
        Object objValue = this.get(FIELD_DQTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDQTag4Dirty(){
        if(this.contains(FIELD_DQTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询标记4
     */
    @JsonIgnore
    public void resetDQTag4(){
        this.reset(FIELD_DQTAG4);
    }

    /**
     * 设置 数据查询标记4
     * <P>
     * 等同 {@link #setDQTag4}
     * @param dQTag4
     */
    @JsonIgnore
    public PSDEDataQueryDTO dqtag4(String dQTag4){
        this.setDQTag4(dQTag4);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体数据查询的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
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
    public PSDEDataQueryDTO extendmode(Integer extendMode){
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
    public PSDEDataQueryDTO extendmode(net.ibizsys.model.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
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
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEDataQueryDTO logicname(String logicName){
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
    public PSDEDataQueryDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
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
     * 判断 排序值 是否指定值，包括空值
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
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEDataQueryDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PRIVMODE</B>&nbsp;查询权限使用，指定数据查询是否应用于权限查询，用于权限查询的数据查询将被发布到运行环境，用于授权分配，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PRIVMODE = "privmode";

    /**
     * 设置 查询权限使用，详细说明：{@link #FIELD_PRIVMODE}
     * 
     * @param privMode
     * 
     */
    @JsonProperty(FIELD_PRIVMODE)
    public void setPrivMode(Integer privMode){
        this.set(FIELD_PRIVMODE, privMode);
    }
    
    /**
     * 获取 查询权限使用  
     * @return
     */
    @JsonIgnore
    public Integer getPrivMode(){
        Object objValue = this.get(FIELD_PRIVMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 查询权限使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrivModeDirty(){
        if(this.contains(FIELD_PRIVMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询权限使用
     */
    @JsonIgnore
    public void resetPrivMode(){
        this.reset(FIELD_PRIVMODE);
    }

    /**
     * 设置 查询权限使用，详细说明：{@link #FIELD_PRIVMODE}
     * <P>
     * 等同 {@link #setPrivMode}
     * @param privMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO privmode(Integer privMode){
        this.setPrivMode(privMode);
        return this;
    }

     /**
     * 设置 查询权限使用，详细说明：{@link #FIELD_PRIVMODE}
     * <P>
     * 等同 {@link #setPrivMode}
     * @param privMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO privmode(Boolean privMode){
        if(privMode == null){
            this.setPrivMode(null);
        }
        else{
            this.setPrivMode(privMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSDEDATAQUERYID</B>&nbsp;实体数据查询标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATAQUERYID = "psdedataqueryid";

    /**
     * 设置 实体数据查询标识
     * 
     * @param pSDEDataQueryId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAQUERYID)
    public void setPSDEDataQueryId(String pSDEDataQueryId){
        this.set(FIELD_PSDEDATAQUERYID, pSDEDataQueryId);
    }
    
    /**
     * 获取 实体数据查询标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataQueryId(){
        Object objValue = this.get(FIELD_PSDEDATAQUERYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataQueryIdDirty(){
        if(this.contains(FIELD_PSDEDATAQUERYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询标识
     */
    @JsonIgnore
    public void resetPSDEDataQueryId(){
        this.reset(FIELD_PSDEDATAQUERYID);
    }

    /**
     * 设置 实体数据查询标识
     * <P>
     * 等同 {@link #setPSDEDataQueryId}
     * @param pSDEDataQueryId
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdedataqueryid(String pSDEDataQueryId){
        this.setPSDEDataQueryId(pSDEDataQueryId);
        return this;
    }

    /**
     * <B>PSDEDATAQUERYNAME</B>&nbsp;查询标识，指定数据查询的标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDATAQUERYNAME = "psdedataqueryname";

    /**
     * 设置 查询标识，详细说明：{@link #FIELD_PSDEDATAQUERYNAME}
     * 
     * @param pSDEDataQueryName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAQUERYNAME)
    public void setPSDEDataQueryName(String pSDEDataQueryName){
        this.set(FIELD_PSDEDATAQUERYNAME, pSDEDataQueryName);
    }
    
    /**
     * 获取 查询标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataQueryName(){
        Object objValue = this.get(FIELD_PSDEDATAQUERYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataQueryNameDirty(){
        if(this.contains(FIELD_PSDEDATAQUERYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询标识
     */
    @JsonIgnore
    public void resetPSDEDataQueryName(){
        this.reset(FIELD_PSDEDATAQUERYNAME);
    }

    /**
     * 设置 查询标识，详细说明：{@link #FIELD_PSDEDATAQUERYNAME}
     * <P>
     * 等同 {@link #setPSDEDataQueryName}
     * @param pSDEDataQueryName
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdedataqueryname(String pSDEDataQueryName){
        this.setPSDEDataQueryName(pSDEDataQueryName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataQueryName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataQueryName(strName);
    }

    @JsonIgnore
    public PSDEDataQueryDTO name(String strName){
        this.setPSDEDataQueryName(strName);
        return this;
    }

    /**
     * <B>PSDEFGROUPID</B>&nbsp;属性组，选择列级别为【属性组】时指定属性组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_PSDEFGROUPID = "psdefgroupid";

    /**
     * 设置 属性组，详细说明：{@link #FIELD_PSDEFGROUPID}
     * 
     * @param pSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEFGROUPID)
    public void setPSDEFGroupId(String pSDEFGroupId){
        this.set(FIELD_PSDEFGROUPID, pSDEFGroupId);
    }
    
    /**
     * 获取 属性组  
     * @return
     */
    @JsonIgnore
    public String getPSDEFGroupId(){
        Object objValue = this.get(FIELD_PSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFGroupIdDirty(){
        if(this.contains(FIELD_PSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性组
     */
    @JsonIgnore
    public void resetPSDEFGroupId(){
        this.reset(FIELD_PSDEFGROUPID);
    }

    /**
     * 设置 属性组，详细说明：{@link #FIELD_PSDEFGROUPID}
     * <P>
     * 等同 {@link #setPSDEFGroupId}
     * @param pSDEFGroupId
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdefgroupid(String pSDEFGroupId){
        this.setPSDEFGroupId(pSDEFGroupId);
        return this;
    }

    /**
     * 设置 属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setPSDEFGroupId(null);
            this.setPSDEFGroupName(null);
        }
        else{
            this.setPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEFGROUPNAME</B>&nbsp;属性组，选择列级别为【属性组】时指定属性组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFGROUPID}
     */
    public final static String FIELD_PSDEFGROUPNAME = "psdefgroupname";

    /**
     * 设置 属性组，详细说明：{@link #FIELD_PSDEFGROUPNAME}
     * 
     * @param pSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEFGROUPNAME)
    public void setPSDEFGroupName(String pSDEFGroupName){
        this.set(FIELD_PSDEFGROUPNAME, pSDEFGroupName);
    }
    
    /**
     * 获取 属性组  
     * @return
     */
    @JsonIgnore
    public String getPSDEFGroupName(){
        Object objValue = this.get(FIELD_PSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFGroupNameDirty(){
        if(this.contains(FIELD_PSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性组
     */
    @JsonIgnore
    public void resetPSDEFGroupName(){
        this.reset(FIELD_PSDEFGROUPNAME);
    }

    /**
     * 设置 属性组，详细说明：{@link #FIELD_PSDEFGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEFGroupName}
     * @param pSDEFGroupName
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdefgroupname(String pSDEFGroupName){
        this.setPSDEFGroupName(pSDEFGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdeid(String pSDEId){
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
    public PSDEDataQueryDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDEMAINSTATEID</B>&nbsp;主状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_PSDEMAINSTATEID = "psdemainstateid";

    /**
     * 设置 主状态
     * 
     * @param pSDEMainStateId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATEID)
    public void setPSDEMainStateId(String pSDEMainStateId){
        this.set(FIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }
    
    /**
     * 获取 主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateId(){
        this.reset(FIELD_PSDEMAINSTATEID);
    }

    /**
     * 设置 主状态
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainStateId
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdemainstateid(String pSDEMainStateId){
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    /**
     * 设置 主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdemainstateid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        }
        else{
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMAINSTATENAME</B>&nbsp;主状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAINSTATEID}
     */
    public final static String FIELD_PSDEMAINSTATENAME = "psdemainstatename";

    /**
     * 设置 主状态
     * 
     * @param pSDEMainStateName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATENAME)
    public void setPSDEMainStateName(String pSDEMainStateName){
        this.set(FIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }
    
    /**
     * 获取 主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateName(){
        this.reset(FIELD_PSDEMAINSTATENAME);
    }

    /**
     * 设置 主状态
     * <P>
     * 等同 {@link #setPSDEMainStateName}
     * @param pSDEMainStateName
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEDataQueryDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PUBMODE</B>&nbsp;默认启用服务，指定查询是否默认提供服务能力，未指定时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PUBMODE = "pubmode";

    /**
     * 设置 默认启用服务，详细说明：{@link #FIELD_PUBMODE}
     * 
     * @param pubMode
     * 
     */
    @JsonProperty(FIELD_PUBMODE)
    public void setPubMode(Integer pubMode){
        this.set(FIELD_PUBMODE, pubMode);
    }
    
    /**
     * 获取 默认启用服务  
     * @return
     */
    @JsonIgnore
    public Integer getPubMode(){
        Object objValue = this.get(FIELD_PUBMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认启用服务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPubModeDirty(){
        if(this.contains(FIELD_PUBMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认启用服务
     */
    @JsonIgnore
    public void resetPubMode(){
        this.reset(FIELD_PUBMODE);
    }

    /**
     * 设置 默认启用服务，详细说明：{@link #FIELD_PUBMODE}
     * <P>
     * 等同 {@link #setPubMode}
     * @param pubMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO pubmode(Integer pubMode){
        this.setPubMode(pubMode);
        return this;
    }

     /**
     * 设置 默认启用服务，详细说明：{@link #FIELD_PUBMODE}
     * <P>
     * 等同 {@link #setPubMode}
     * @param pubMode
     */
    @JsonIgnore
    public PSDEDataQueryDTO pubmode(Boolean pubMode){
        if(pubMode == null){
            this.setPubMode(null);
        }
        else{
            this.setPubMode(pubMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>QUERYVIEWFLAG</B>&nbsp;从视图查询，指定数据查询是否从视图查询，如直接使用外部视图数据源时就无需还原原本的实体及关系，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_QUERYVIEWFLAG = "queryviewflag";

    /**
     * 设置 从视图查询，详细说明：{@link #FIELD_QUERYVIEWFLAG}
     * 
     * @param queryViewFlag
     * 
     */
    @JsonProperty(FIELD_QUERYVIEWFLAG)
    public void setQueryViewFlag(Integer queryViewFlag){
        this.set(FIELD_QUERYVIEWFLAG, queryViewFlag);
    }
    
    /**
     * 获取 从视图查询  
     * @return
     */
    @JsonIgnore
    public Integer getQueryViewFlag(){
        Object objValue = this.get(FIELD_QUERYVIEWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 从视图查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueryViewFlagDirty(){
        if(this.contains(FIELD_QUERYVIEWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从视图查询
     */
    @JsonIgnore
    public void resetQueryViewFlag(){
        this.reset(FIELD_QUERYVIEWFLAG);
    }

    /**
     * 设置 从视图查询，详细说明：{@link #FIELD_QUERYVIEWFLAG}
     * <P>
     * 等同 {@link #setQueryViewFlag}
     * @param queryViewFlag
     */
    @JsonIgnore
    public PSDEDataQueryDTO queryviewflag(Integer queryViewFlag){
        this.setQueryViewFlag(queryViewFlag);
        return this;
    }

     /**
     * 设置 从视图查询，详细说明：{@link #FIELD_QUERYVIEWFLAG}
     * <P>
     * 等同 {@link #setQueryViewFlag}
     * @param queryViewFlag
     */
    @JsonIgnore
    public PSDEDataQueryDTO queryviewflag(Boolean queryViewFlag){
        if(queryViewFlag == null){
            this.setQueryViewFlag(null);
        }
        else{
            this.setQueryViewFlag(queryViewFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>REQUESTMETHOD</B>&nbsp;请求方式，指定数据查询在提供服务时使用的请求方式，未定义时为【POST】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_REQUESTMETHOD = "requestmethod";

    /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * 
     * @param requestMethod
     * 
     */
    @JsonProperty(FIELD_REQUESTMETHOD)
    public void setRequestMethod(String requestMethod){
        this.set(FIELD_REQUESTMETHOD, requestMethod);
    }
    
    /**
     * 获取 请求方式  
     * @return
     */
    @JsonIgnore
    public String getRequestMethod(){
        Object objValue = this.get(FIELD_REQUESTMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestMethodDirty(){
        if(this.contains(FIELD_REQUESTMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求方式
     */
    @JsonIgnore
    public void resetRequestMethod(){
        this.reset(FIELD_REQUESTMETHOD);
    }

    /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * <P>
     * 等同 {@link #setRequestMethod}
     * @param requestMethod
     */
    @JsonIgnore
    public PSDEDataQueryDTO requestmethod(String requestMethod){
        this.setRequestMethod(requestMethod);
        return this;
    }

     /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * <P>
     * 等同 {@link #setRequestMethod}
     * @param requestMethod
     */
    @JsonIgnore
    public PSDEDataQueryDTO requestmethod(net.ibizsys.model.PSModelEnums.RequestMethod requestMethod){
        if(requestMethod == null){
            this.setRequestMethod(null);
        }
        else{
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    /**
     * <B>REQUESTPATH</B>&nbsp;请求路径
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_REQUESTPATH = "requestpath";

    /**
     * 设置 请求路径
     * 
     * @param requestPath
     * 
     */
    @JsonProperty(FIELD_REQUESTPATH)
    public void setRequestPath(String requestPath){
        this.set(FIELD_REQUESTPATH, requestPath);
    }
    
    /**
     * 获取 请求路径  
     * @return
     */
    @JsonIgnore
    public String getRequestPath(){
        Object objValue = this.get(FIELD_REQUESTPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestPathDirty(){
        if(this.contains(FIELD_REQUESTPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求路径
     */
    @JsonIgnore
    public void resetRequestPath(){
        this.reset(FIELD_REQUESTPATH);
    }

    /**
     * 设置 请求路径
     * <P>
     * 等同 {@link #setRequestPath}
     * @param requestPath
     */
    @JsonIgnore
    public PSDEDataQueryDTO requestpath(String requestPath){
        this.setRequestPath(requestPath);
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
    public PSDEDataQueryDTO updatedate(Timestamp updateDate){
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
    public PSDEDataQueryDTO updateman(String updateMan){
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
    public PSDEDataQueryDTO usercat(String userCat){
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
    public PSDEDataQueryDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataQueryDTO usertag(String userTag){
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
    public PSDEDataQueryDTO usertag2(String userTag2){
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
    public PSDEDataQueryDTO usertag3(String userTag3){
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
    public PSDEDataQueryDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEDataQueryDTO validflag(Integer validFlag){
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
    public PSDEDataQueryDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWCOLLEVEL</B>&nbsp;选择列级别，支持数据查询选择的列级别，未定义时按默认处理。注意默认处理只包括实体中定义为【查询输出】的属性，而非全部属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel} 
     */
    public final static String FIELD_VIEWCOLLEVEL = "viewcollevel";

    /**
     * 设置 选择列级别，详细说明：{@link #FIELD_VIEWCOLLEVEL}
     * 
     * @param viewColLevel
     * 
     */
    @JsonProperty(FIELD_VIEWCOLLEVEL)
    public void setViewColLevel(Integer viewColLevel){
        this.set(FIELD_VIEWCOLLEVEL, viewColLevel);
    }
    
    /**
     * 获取 选择列级别  
     * @return
     */
    @JsonIgnore
    public Integer getViewColLevel(){
        Object objValue = this.get(FIELD_VIEWCOLLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 选择列级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewColLevelDirty(){
        if(this.contains(FIELD_VIEWCOLLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择列级别
     */
    @JsonIgnore
    public void resetViewColLevel(){
        this.reset(FIELD_VIEWCOLLEVEL);
    }

    /**
     * 设置 选择列级别，详细说明：{@link #FIELD_VIEWCOLLEVEL}
     * <P>
     * 等同 {@link #setViewColLevel}
     * @param viewColLevel
     */
    @JsonIgnore
    public PSDEDataQueryDTO viewcollevel(Integer viewColLevel){
        this.setViewColLevel(viewColLevel);
        return this;
    }

     /**
     * 设置 选择列级别，详细说明：{@link #FIELD_VIEWCOLLEVEL}
     * <P>
     * 等同 {@link #setViewColLevel}
     * @param viewColLevel
     */
    @JsonIgnore
    public PSDEDataQueryDTO viewcollevel(net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel viewColLevel){
        if(viewColLevel == null){
            this.setViewColLevel(null);
        }
        else{
            this.setViewColLevel(viewColLevel.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEDataQueryId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEDataQueryId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDataQueryId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataQueryId(strValue);
    }

    @JsonIgnore
    public PSDEDataQueryDTO id(String strValue){
        this.setPSDEDataQueryId(strValue);
        return this;
    }


    /**
     *  实体数据查询连接 成员集合
     */
    public final static String FIELD_PSDEDQJOINS = "psdedqjoins";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEDQJoinDTO> psdedqjoins;

    /**
     * 获取 实体数据查询连接 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDQJOINS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEDQJoinDTO> getPSDEDQJoins(){
        return this.psdedqjoins;
    }

    /**
     * 设置 实体数据查询连接 成员集合  
     * @param psdedqjoins
     */
    @JsonProperty(FIELD_PSDEDQJOINS)
    public void setPSDEDQJoins(java.util.List<net.ibizsys.centralstudio.dto.PSDEDQJoinDTO> psdedqjoins){
        this.psdedqjoins = psdedqjoins;
    }

    /**
     * 获取 实体数据查询连接 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEDQJoinDTO> getPSDEDQJoinsIf(){
        if(this.psdedqjoins == null){
            this.psdedqjoins = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEDQJoinDTO>();          
        }
        return this.psdedqjoins;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEDataQueryDTO){
            PSDEDataQueryDTO dto = (PSDEDataQueryDTO)iEntity;
            dto.setPSDEDQJoins(this.getPSDEDQJoins());
        }
        super.copyTo(iEntity);
    }
}
