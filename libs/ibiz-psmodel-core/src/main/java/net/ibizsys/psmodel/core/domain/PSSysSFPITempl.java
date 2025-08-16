package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSSFPITEMPL</B>后台模板插件代码 模型传输对象
 * <P>
 * 后台模板插件代码模型，定义后台插件在指定模板的代码
 */
public class PSSysSFPITempl extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysSFPITempl(){
    }      

    /**
     * <B>CODEMAP</B>&nbsp;代码映射，指定插件代码的代码项映射，将当前插件的预置代码项映射到新的名称
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_CODEMAP = "codemap";

    /**
     * 设置 代码映射，详细说明：{@link #FIELD_CODEMAP}
     * 
     * @param codeMap
     * 
     */
    @JsonProperty(FIELD_CODEMAP)
    public void setCodeMap(String codeMap){
        this.set(FIELD_CODEMAP, codeMap);
    }
    
    /**
     * 获取 代码映射  
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
     * 判断 代码映射 是否指定值，包括空值
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
     * 重置 代码映射
     */
    @JsonIgnore
    public void resetCodeMap(){
        this.reset(FIELD_CODEMAP);
    }

    /**
     * 设置 代码映射，详细说明：{@link #FIELD_CODEMAP}
     * <P>
     * 等同 {@link #setCodeMap}
     * @param codeMap
     */
    @JsonIgnore
    public PSSysSFPITempl codemap(String codeMap){
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
    public PSSysSFPITempl createdate(String createDate){
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
    public PSSysSFPITempl createman(String createMan){
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
    public PSSysSFPITempl memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSFID</B>&nbsp;后台模板，指定插件代码相关的后台模板对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSFID = "pssfid";

    /**
     * 设置 后台模板，详细说明：{@link #FIELD_PSSFID}
     * 
     * @param pSSFId
     * 
     */
    @JsonProperty(FIELD_PSSFID)
    public void setPSSFId(String pSSFId){
        this.set(FIELD_PSSFID, pSSFId);
    }
    
    /**
     * 获取 后台模板  
     * @return
     */
    @JsonIgnore
    public String getPSSFId(){
        Object objValue = this.get(FIELD_PSSFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFIdDirty(){
        if(this.contains(FIELD_PSSFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台模板
     */
    @JsonIgnore
    public void resetPSSFId(){
        this.reset(FIELD_PSSFID);
    }

    /**
     * 设置 后台模板，详细说明：{@link #FIELD_PSSFID}
     * <P>
     * 等同 {@link #setPSSFId}
     * @param pSSFId
     */
    @JsonIgnore
    public PSSysSFPITempl pssfid(String pSSFId){
        this.setPSSFId(pSSFId);
        return this;
    }

    /**
     * <B>PSSFNAME</B>&nbsp;后台模板，指定插件代码相关的后台模板对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSFID}
     */
    public final static String FIELD_PSSFNAME = "pssfname";

    /**
     * 设置 后台模板，详细说明：{@link #FIELD_PSSFNAME}
     * 
     * @param pSSFName
     * 
     */
    @JsonProperty(FIELD_PSSFNAME)
    public void setPSSFName(String pSSFName){
        this.set(FIELD_PSSFNAME, pSSFName);
    }
    
    /**
     * 获取 后台模板  
     * @return
     */
    @JsonIgnore
    public String getPSSFName(){
        Object objValue = this.get(FIELD_PSSFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSFNameDirty(){
        if(this.contains(FIELD_PSSFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台模板
     */
    @JsonIgnore
    public void resetPSSFName(){
        this.reset(FIELD_PSSFNAME);
    }

    /**
     * 设置 后台模板，详细说明：{@link #FIELD_PSSFNAME}
     * <P>
     * 等同 {@link #setPSSFName}
     * @param pSSFName
     */
    @JsonIgnore
    public PSSysSFPITempl pssfname(String pSSFName){
        this.setPSSFName(pSSFName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型，指定插件代码的动态模型，模型引擎将把动态模型的属性逐个注册为插件代码项（使用动态属性名称作为代码项标识）
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
    public PSSysSFPITempl pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysSFPITempl pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSSysSFPITempl pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSSFPITEMPLID</B>&nbsp;插件模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSFPITEMPLID = "pssyssfpitemplid";

    /**
     * 设置 插件模板标识
     * 
     * @param pSSysSFPITemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPITEMPLID)
    public void setPSSysSFPITemplId(String pSSysSFPITemplId){
        this.set(FIELD_PSSYSSFPITEMPLID, pSSysSFPITemplId);
    }
    
    /**
     * 获取 插件模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPITemplId(){
        Object objValue = this.get(FIELD_PSSYSSFPITEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPITemplIdDirty(){
        if(this.contains(FIELD_PSSYSSFPITEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件模板标识
     */
    @JsonIgnore
    public void resetPSSysSFPITemplId(){
        this.reset(FIELD_PSSYSSFPITEMPLID);
    }

    /**
     * 设置 插件模板标识
     * <P>
     * 等同 {@link #setPSSysSFPITemplId}
     * @param pSSysSFPITemplId
     */
    @JsonIgnore
    public PSSysSFPITempl pssyssfpitemplid(String pSSysSFPITemplId){
        this.setPSSysSFPITemplId(pSSysSFPITemplId);
        return this;
    }

    /**
     * <B>PSSYSSFPITEMPLNAME</B>&nbsp;插件模板名称，指定后台模板插件代码的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSSFPITEMPLNAME = "pssyssfpitemplname";

    /**
     * 设置 插件模板名称，详细说明：{@link #FIELD_PSSYSSFPITEMPLNAME}
     * 
     * @param pSSysSFPITemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPITEMPLNAME)
    public void setPSSysSFPITemplName(String pSSysSFPITemplName){
        this.set(FIELD_PSSYSSFPITEMPLNAME, pSSysSFPITemplName);
    }
    
    /**
     * 获取 插件模板名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPITemplName(){
        Object objValue = this.get(FIELD_PSSYSSFPITEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件模板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPITemplNameDirty(){
        if(this.contains(FIELD_PSSYSSFPITEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件模板名称
     */
    @JsonIgnore
    public void resetPSSysSFPITemplName(){
        this.reset(FIELD_PSSYSSFPITEMPLNAME);
    }

    /**
     * 设置 插件模板名称，详细说明：{@link #FIELD_PSSYSSFPITEMPLNAME}
     * <P>
     * 等同 {@link #setPSSysSFPITemplName}
     * @param pSSysSFPITemplName
     */
    @JsonIgnore
    public PSSysSFPITempl pssyssfpitemplname(String pSSysSFPITemplName){
        this.setPSSysSFPITemplName(pSSysSFPITemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSFPITemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSFPITemplName(strName);
    }

    @JsonIgnore
    public PSSysSFPITempl name(String strName){
        this.setPSSysSFPITemplName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定插件代码所在的后台模板插件对象
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
    public PSSysSFPITempl pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSysSFPITempl pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定插件代码所在的后台模板插件对象
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
    public PSSysSFPITempl pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>TEMPLCODE</B>&nbsp;代码模版，指定插件代码项的内容，项标识为【CODE】
     * <P>
     * 字符串：最大长度 100000
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
    public PSSysSFPITempl templcode(String templCode){
        this.setTemplCode(templCode);
        return this;
    }

    /**
     * <B>TEMPLCODE2</B>&nbsp;代码模版2，指定插件代码项2的内容，项标识为【CODE2】
     * <P>
     * 字符串：最大长度 100000
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
    public PSSysSFPITempl templcode2(String templCode2){
        this.setTemplCode2(templCode2);
        return this;
    }

    /**
     * <B>TEMPLCODE3</B>&nbsp;代码模版3，指定插件代码项3的内容，项标识为【CODE3】
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
    public PSSysSFPITempl templcode3(String templCode3){
        this.setTemplCode3(templCode3);
        return this;
    }

    /**
     * <B>TEMPLCODE4</B>&nbsp;代码模版4，指定插件代码项4的内容，项标识为【CODE4】
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
    public PSSysSFPITempl templcode4(String templCode4){
        this.setTemplCode4(templCode4);
        return this;
    }

    /**
     * <B>TEMPLCODE5</B>&nbsp;代码模版5，指定插件代码项5的内容，项标识为【CODE5】
     */
    public final static String FIELD_TEMPLCODE5 = "templcode5";

    /**
     * 设置 代码模版5，详细说明：{@link #FIELD_TEMPLCODE5}
     * 
     * @param templCode5
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE5)
    public void setTemplCode5(String templCode5){
        this.set(FIELD_TEMPLCODE5, templCode5);
    }
    
    /**
     * 获取 代码模版5  
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
     * 判断 代码模版5 是否指定值，包括空值
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
     * 重置 代码模版5
     */
    @JsonIgnore
    public void resetTemplCode5(){
        this.reset(FIELD_TEMPLCODE5);
    }

    /**
     * 设置 代码模版5，详细说明：{@link #FIELD_TEMPLCODE5}
     * <P>
     * 等同 {@link #setTemplCode5}
     * @param templCode5
     */
    @JsonIgnore
    public PSSysSFPITempl templcode5(String templCode5){
        this.setTemplCode5(templCode5);
        return this;
    }

    /**
     * <B>TEMPLCODE6</B>&nbsp;代码模版6，指定插件代码项6的内容，项标识为【CODE6】
     */
    public final static String FIELD_TEMPLCODE6 = "templcode6";

    /**
     * 设置 代码模版6，详细说明：{@link #FIELD_TEMPLCODE6}
     * 
     * @param templCode6
     * 
     */
    @JsonProperty(FIELD_TEMPLCODE6)
    public void setTemplCode6(String templCode6){
        this.set(FIELD_TEMPLCODE6, templCode6);
    }
    
    /**
     * 获取 代码模版6  
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
     * 判断 代码模版6 是否指定值，包括空值
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
     * 重置 代码模版6
     */
    @JsonIgnore
    public void resetTemplCode6(){
        this.reset(FIELD_TEMPLCODE6);
    }

    /**
     * 设置 代码模版6，详细说明：{@link #FIELD_TEMPLCODE6}
     * <P>
     * 等同 {@link #setTemplCode6}
     * @param templCode6
     */
    @JsonIgnore
    public PSSysSFPITempl templcode6(String templCode6){
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
    public PSSysSFPITempl updatedate(String updateDate){
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
    public PSSysSFPITempl updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSFPITemplId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSFPITemplId(strValue);
    }

    @JsonIgnore
    public PSSysSFPITempl id(String strValue){
        this.setPSSysSFPITemplId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysSFPITempl){
            PSSysSFPITempl model = (PSSysSFPITempl)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
