package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSPFPITEMPL</B>前端模板插件代码 模型传输对象
 * <P>
 * 前端模板插件代码模型，定义前端插件在指定模板的代码
 */
public class PSSysPFPITemplDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysPFPITemplDTO(){
    }      

    /**
     * <B>CODEMAP</B>&nbsp;代码项映射，指定插件代码的代码项映射，将当前插件的预置代码项映射到新的名称
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_CODEMAP = "codemap";

    /**
     * 设置 代码项映射，详细说明：{@link #FIELD_CODEMAP}
     * 
     * @param codeMap
     * 
     */
    @JsonProperty(FIELD_CODEMAP)
    public void setCodeMap(String codeMap){
        this.set(FIELD_CODEMAP, codeMap);
    }
    
    /**
     * 获取 代码项映射  
     * @return
     */
    @JsonIgnore
    public String getCodeMap(){
        Object objValue = this.get(FIELD_CODEMAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码项映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeMapDirty(){
        if(this.contains(FIELD_CODEMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码项映射
     */
    @JsonIgnore
    public void resetCodeMap(){
        this.reset(FIELD_CODEMAP);
    }

    /**
     * 设置 代码项映射，详细说明：{@link #FIELD_CODEMAP}
     * <P>
     * 等同 {@link #setCodeMap}
     * @param codeMap
     */
    @JsonIgnore
    public PSSysPFPITemplDTO codemap(String codeMap){
        this.setCodeMap(codeMap);
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
    public PSSysPFPITemplDTO createdate(Timestamp createDate){
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
    public PSSysPFPITemplDTO createman(String createMan){
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
    public PSSysPFPITemplDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSPFID</B>&nbsp;前端模板，指定插件代码相关的前端模板对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPFID = "pspfid";

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFID}
     * 
     * @param pSPFId
     * 
     */
    @JsonProperty(FIELD_PSPFID)
    public void setPSPFId(String pSPFId){
        this.set(FIELD_PSPFID, pSPFId);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFId(){
        Object objValue = this.get(FIELD_PSPFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFIdDirty(){
        if(this.contains(FIELD_PSPFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFId(){
        this.reset(FIELD_PSPFID);
    }

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFID}
     * <P>
     * 等同 {@link #setPSPFId}
     * @param pSPFId
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pspfid(String pSPFId){
        this.setPSPFId(pSPFId);
        return this;
    }

    /**
     * <B>PSPFNAME</B>&nbsp;前端模板，指定插件代码相关的前端模板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPFID}
     */
    public final static String FIELD_PSPFNAME = "pspfname";

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFNAME}
     * 
     * @param pSPFName
     * 
     */
    @JsonProperty(FIELD_PSPFNAME)
    public void setPSPFName(String pSPFName){
        this.set(FIELD_PSPFNAME, pSPFName);
    }
    
    /**
     * 获取 前端模板  
     * @return
     */
    @JsonIgnore
    public String getPSPFName(){
        Object objValue = this.get(FIELD_PSPFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFNameDirty(){
        if(this.contains(FIELD_PSPFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端模板
     */
    @JsonIgnore
    public void resetPSPFName(){
        this.reset(FIELD_PSPFNAME);
    }

    /**
     * 设置 前端模板，详细说明：{@link #FIELD_PSPFNAME}
     * <P>
     * 等同 {@link #setPSPFName}
     * @param pSPFName
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pspfname(String pSPFName){
        this.setPSPFName(pSPFName);
        return this;
    }

    /**
     * <B>PSPFPUBCODENAME</B>&nbsp;发布代码类型，指定插件代码的发布类型
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSPFPUBCODENAME = "pspfpubcodename";

    /**
     * 设置 发布代码类型，详细说明：{@link #FIELD_PSPFPUBCODENAME}
     * 
     * @param pSPFPubCodeName
     * 
     */
    @JsonProperty(FIELD_PSPFPUBCODENAME)
    public void setPSPFPubCodeName(String pSPFPubCodeName){
        this.set(FIELD_PSPFPUBCODENAME, pSPFPubCodeName);
    }
    
    /**
     * 获取 发布代码类型  
     * @return
     */
    @JsonIgnore
    public String getPSPFPubCodeName(){
        Object objValue = this.get(FIELD_PSPFPUBCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布代码类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPFPubCodeNameDirty(){
        if(this.contains(FIELD_PSPFPUBCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布代码类型
     */
    @JsonIgnore
    public void resetPSPFPubCodeName(){
        this.reset(FIELD_PSPFPUBCODENAME);
    }

    /**
     * 设置 发布代码类型，详细说明：{@link #FIELD_PSPFPUBCODENAME}
     * <P>
     * 等同 {@link #setPSPFPubCodeName}
     * @param pSPFPubCodeName
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pspfpubcodename(String pSPFPubCodeName){
        this.setPSPFPubCodeName(pSPFPubCodeName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 界面样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 界面样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 界面样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 界面样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pssyscssid(PSSysCssDTO pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型，指定插件代码的动态模型，模型引擎将把动态模型的属性逐个注册为插件代码项（使用动态属性名称作为代码项标识）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
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
    public PSSysPFPITemplDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysPFPITemplDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型，指定插件代码的动态模型，模型引擎将把动态模型的属性逐个注册为插件代码项（使用动态属性名称作为代码项标识）
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
    public PSSysPFPITemplDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPITEMPLID</B>&nbsp;应用插件模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSPFPITEMPLID = "pssyspfpitemplid";

    /**
     * 设置 应用插件模板标识
     * 
     * @param pSSysPFPITemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPITEMPLID)
    public void setPSSysPFPITemplId(String pSSysPFPITemplId){
        this.set(FIELD_PSSYSPFPITEMPLID, pSSysPFPITemplId);
    }
    
    /**
     * 获取 应用插件模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPITemplId(){
        Object objValue = this.get(FIELD_PSSYSPFPITEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用插件模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPITemplIdDirty(){
        if(this.contains(FIELD_PSSYSPFPITEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用插件模板标识
     */
    @JsonIgnore
    public void resetPSSysPFPITemplId(){
        this.reset(FIELD_PSSYSPFPITEMPLID);
    }

    /**
     * 设置 应用插件模板标识
     * <P>
     * 等同 {@link #setPSSysPFPITemplId}
     * @param pSSysPFPITemplId
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpitemplid(String pSSysPFPITemplId){
        this.setPSSysPFPITemplId(pSSysPFPITemplId);
        return this;
    }

    /**
     * <B>PSSYSPFPITEMPLNAME</B>&nbsp;插件代码名称，指定前端模板插件代码的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSPFPITEMPLNAME = "pssyspfpitemplname";

    /**
     * 设置 插件代码名称，详细说明：{@link #FIELD_PSSYSPFPITEMPLNAME}
     * 
     * @param pSSysPFPITemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPITEMPLNAME)
    public void setPSSysPFPITemplName(String pSSysPFPITemplName){
        this.set(FIELD_PSSYSPFPITEMPLNAME, pSSysPFPITemplName);
    }
    
    /**
     * 获取 插件代码名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPITemplName(){
        Object objValue = this.get(FIELD_PSSYSPFPITEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPITemplNameDirty(){
        if(this.contains(FIELD_PSSYSPFPITEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件代码名称
     */
    @JsonIgnore
    public void resetPSSysPFPITemplName(){
        this.reset(FIELD_PSSYSPFPITEMPLNAME);
    }

    /**
     * 设置 插件代码名称，详细说明：{@link #FIELD_PSSYSPFPITEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysPFPITemplName}
     * @param pSSysPFPITemplName
     */
    @JsonIgnore
    public PSSysPFPITemplDTO pssyspfpitemplname(String pSSysPFPITemplName){
        this.setPSSysPFPITemplName(pSSysPFPITemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysPFPITemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysPFPITemplName(strName);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO name(String strName){
        this.setPSSysPFPITemplName(strName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端模板插件，指定插件代码所在的前端模板插件对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
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
    public PSSysPFPITemplDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSSysPFPITemplDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端模板插件，指定插件代码所在的前端模板插件对象
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
    public PSSysPFPITemplDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>TEMPLCODE</B>&nbsp;代码模版，指定插件代码项的内容，项标识为【CODE】
     */
    public final static String FIELD_TEMPLCODE = "templcode";

    /**
     * 设置 代码模版，详细说明：{@link #FIELD_TEMPLCODE}
     * 
     * @param templCode
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE)
    public void setTemplCode(String templCode){
        this.set(FIELD_TEMPLCODE, templCode);
    }
    
    /**
     * 获取 代码模版  
     * @return
     */
    @JsonIgnore
    public String getTemplCode(){
        Object objValue = this.get(FIELD_TEMPLCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCodeDirty(){
        if(this.contains(FIELD_TEMPLCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版
     */
    @JsonIgnore
    public void resetTemplCode(){
        this.reset(FIELD_TEMPLCODE);
    }

    /**
     * 设置 代码模版，详细说明：{@link #FIELD_TEMPLCODE}
     * <P>
     * 等同 {@link #setTemplCode}
     * @param templCode
     */
    @JsonIgnore
    public PSSysPFPITemplDTO templcode(String templCode){
        this.setTemplCode(templCode);
        return this;
    }

    /**
     * <B>TEMPLCODE2</B>&nbsp;代码模版2，指定插件代码项2的内容，项标识为【CODE2】
     * <P>
     * 字符串：最大长度 1048576
     */
    public final static String FIELD_TEMPLCODE2 = "templcode2";

    /**
     * 设置 代码模版2，详细说明：{@link #FIELD_TEMPLCODE2}
     * 
     * @param templCode2
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE2)
    public void setTemplCode2(String templCode2){
        this.set(FIELD_TEMPLCODE2, templCode2);
    }
    
    /**
     * 获取 代码模版2  
     * @return
     */
    @JsonIgnore
    public String getTemplCode2(){
        Object objValue = this.get(FIELD_TEMPLCODE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode2Dirty(){
        if(this.contains(FIELD_TEMPLCODE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版2
     */
    @JsonIgnore
    public void resetTemplCode2(){
        this.reset(FIELD_TEMPLCODE2);
    }

    /**
     * 设置 代码模版2，详细说明：{@link #FIELD_TEMPLCODE2}
     * <P>
     * 等同 {@link #setTemplCode2}
     * @param templCode2
     */
    @JsonIgnore
    public PSSysPFPITemplDTO templcode2(String templCode2){
        this.setTemplCode2(templCode2);
        return this;
    }

    /**
     * <B>TEMPLCODE3</B>&nbsp;代码模版3，指定插件代码项3的内容，项标识为【CODE3】
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_TEMPLCODE3 = "templcode3";

    /**
     * 设置 代码模版3，详细说明：{@link #FIELD_TEMPLCODE3}
     * 
     * @param templCode3
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE3)
    public void setTemplCode3(String templCode3){
        this.set(FIELD_TEMPLCODE3, templCode3);
    }
    
    /**
     * 获取 代码模版3  
     * @return
     */
    @JsonIgnore
    public String getTemplCode3(){
        Object objValue = this.get(FIELD_TEMPLCODE3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode3Dirty(){
        if(this.contains(FIELD_TEMPLCODE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版3
     */
    @JsonIgnore
    public void resetTemplCode3(){
        this.reset(FIELD_TEMPLCODE3);
    }

    /**
     * 设置 代码模版3，详细说明：{@link #FIELD_TEMPLCODE3}
     * <P>
     * 等同 {@link #setTemplCode3}
     * @param templCode3
     */
    @JsonIgnore
    public PSSysPFPITemplDTO templcode3(String templCode3){
        this.setTemplCode3(templCode3);
        return this;
    }

    /**
     * <B>TEMPLCODE4</B>&nbsp;代码模版4，指定插件代码项4的内容，项标识为【CODE4】
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_TEMPLCODE4 = "templcode4";

    /**
     * 设置 代码模版4，详细说明：{@link #FIELD_TEMPLCODE4}
     * 
     * @param templCode4
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE4)
    public void setTemplCode4(String templCode4){
        this.set(FIELD_TEMPLCODE4, templCode4);
    }
    
    /**
     * 获取 代码模版4  
     * @return
     */
    @JsonIgnore
    public String getTemplCode4(){
        Object objValue = this.get(FIELD_TEMPLCODE4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码模版4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode4Dirty(){
        if(this.contains(FIELD_TEMPLCODE4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码模版4
     */
    @JsonIgnore
    public void resetTemplCode4(){
        this.reset(FIELD_TEMPLCODE4);
    }

    /**
     * 设置 代码模版4，详细说明：{@link #FIELD_TEMPLCODE4}
     * <P>
     * 等同 {@link #setTemplCode4}
     * @param templCode4
     */
    @JsonIgnore
    public PSSysPFPITemplDTO templcode4(String templCode4){
        this.setTemplCode4(templCode4);
        return this;
    }

    /**
     * <B>TEMPLCODE5</B>&nbsp;引用代码，指定插件引用代码项的内容，项标识为【CODE5】
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_TEMPLCODE5 = "templcode5";

    /**
     * 设置 引用代码，详细说明：{@link #FIELD_TEMPLCODE5}
     * 
     * @param templCode5
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE5)
    public void setTemplCode5(String templCode5){
        this.set(FIELD_TEMPLCODE5, templCode5);
    }
    
    /**
     * 获取 引用代码  
     * @return
     */
    @JsonIgnore
    public String getTemplCode5(){
        Object objValue = this.get(FIELD_TEMPLCODE5);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode5Dirty(){
        if(this.contains(FIELD_TEMPLCODE5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用代码
     */
    @JsonIgnore
    public void resetTemplCode5(){
        this.reset(FIELD_TEMPLCODE5);
    }

    /**
     * 设置 引用代码，详细说明：{@link #FIELD_TEMPLCODE5}
     * <P>
     * 等同 {@link #setTemplCode5}
     * @param templCode5
     */
    @JsonIgnore
    public PSSysPFPITemplDTO templcode5(String templCode5){
        this.setTemplCode5(templCode5);
        return this;
    }

    /**
     * <B>TEMPLCODE6</B>&nbsp;引用代码2，指定插件引用代码项2的内容，项标识为【CODE6】
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_TEMPLCODE6 = "templcode6";

    /**
     * 设置 引用代码2，详细说明：{@link #FIELD_TEMPLCODE6}
     * 
     * @param templCode6
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE6)
    public void setTemplCode6(String templCode6){
        this.set(FIELD_TEMPLCODE6, templCode6);
    }
    
    /**
     * 获取 引用代码2  
     * @return
     */
    @JsonIgnore
    public String getTemplCode6(){
        Object objValue = this.get(FIELD_TEMPLCODE6);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用代码2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTemplCode6Dirty(){
        if(this.contains(FIELD_TEMPLCODE6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用代码2
     */
    @JsonIgnore
    public void resetTemplCode6(){
        this.reset(FIELD_TEMPLCODE6);
    }

    /**
     * 设置 引用代码2，详细说明：{@link #FIELD_TEMPLCODE6}
     * <P>
     * 等同 {@link #setTemplCode6}
     * @param templCode6
     */
    @JsonIgnore
    public PSSysPFPITemplDTO templcode6(String templCode6){
        this.setTemplCode6(templCode6);
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
    public PSSysPFPITemplDTO updatedate(Timestamp updateDate){
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
    public PSSysPFPITemplDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysPFPITemplId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysPFPITemplId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysPFPITemplId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysPFPITemplId(strValue);
    }

    @JsonIgnore
    public PSSysPFPITemplDTO id(String strValue){
        this.setPSSysPFPITemplId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysPFPITemplDTO){
            PSSysPFPITemplDTO dto = (PSSysPFPITemplDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
