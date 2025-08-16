package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDER</B>实体关系 模型传输对象
 * <P>
 * 实体的关系模型，它用于定义实体之间的关系。关系类型包括一对一关系、一对多关系，面向对象的继承关系、虚拟继承关系、索引关系等以及自定义关系
 */
public class PSDER extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDER(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CLONEORDERVALUE</B>&nbsp;克隆关系，指定实体关系的克隆关系的级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_CLONEORDERVALUE = "cloneordervalue";

    /**
     * 设置 克隆关系，详细说明：{@link #FIELD_CLONEORDERVALUE}
     * 
     * @param cloneOrderValue
     * 
     */
    @JsonProperty(FIELD_CLONEORDERVALUE)
    public void setCloneOrderValue(Integer cloneOrderValue){
        this.set(FIELD_CLONEORDERVALUE, cloneOrderValue);
    }
    
    /**
     * 获取 克隆关系  
     * @return
     */
    @JsonIgnore
    public Integer getCloneOrderValue(){
        Object objValue = this.get(FIELD_CLONEORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 克隆关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCloneOrderValueDirty(){
        if(this.contains(FIELD_CLONEORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 克隆关系
     */
    @JsonIgnore
    public void resetCloneOrderValue(){
        this.reset(FIELD_CLONEORDERVALUE);
    }

    /**
     * 设置 克隆关系，详细说明：{@link #FIELD_CLONEORDERVALUE}
     * <P>
     * 等同 {@link #setCloneOrderValue}
     * @param cloneOrderValue
     */
    @JsonIgnore
    public PSDER cloneordervalue(Integer cloneOrderValue){
        this.setCloneOrderValue(cloneOrderValue);
        return this;
    }

     /**
     * 设置 克隆关系，详细说明：{@link #FIELD_CLONEORDERVALUE}
     * <P>
     * 等同 {@link #setCloneOrderValue}
     * @param cloneOrderValue
     */
    @JsonIgnore
    public PSDER cloneordervalue(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel cloneOrderValue){
        if(cloneOrderValue == null){
            this.setCloneOrderValue(null);
        }
        else{
            this.setCloneOrderValue(cloneOrderValue.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定关系的代码标识，需要在关系的从实体中具有唯一性
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
    public PSDER codename(String codeName){
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
    public PSDER createdate(String createDate){
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
    public PSDER createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFINHERITMODE</B>&nbsp;属性继承模式，指定继承关系的属性继承模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERDEFInheritMode} 
     */
    public final static String FIELD_DEFINHERITMODE = "definheritmode";

    /**
     * 设置 属性继承模式，详细说明：{@link #FIELD_DEFINHERITMODE}
     * 
     * @param dEFInheritMode
     * 
     */
    @JsonProperty(FIELD_DEFINHERITMODE)
    public void setDEFInheritMode(Integer dEFInheritMode){
        this.set(FIELD_DEFINHERITMODE, dEFInheritMode);
    }
    
    /**
     * 获取 属性继承模式  
     * @return
     */
    @JsonIgnore
    public Integer getDEFInheritMode(){
        Object objValue = this.get(FIELD_DEFINHERITMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 属性继承模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFInheritModeDirty(){
        if(this.contains(FIELD_DEFINHERITMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性继承模式
     */
    @JsonIgnore
    public void resetDEFInheritMode(){
        this.reset(FIELD_DEFINHERITMODE);
    }

    /**
     * 设置 属性继承模式，详细说明：{@link #FIELD_DEFINHERITMODE}
     * <P>
     * 等同 {@link #setDEFInheritMode}
     * @param dEFInheritMode
     */
    @JsonIgnore
    public PSDER definheritmode(Integer dEFInheritMode){
        this.setDEFInheritMode(dEFInheritMode);
        return this;
    }

     /**
     * 设置 属性继承模式，详细说明：{@link #FIELD_DEFINHERITMODE}
     * <P>
     * 等同 {@link #setDEFInheritMode}
     * @param dEFInheritMode
     */
    @JsonIgnore
    public PSDER definheritmode(net.ibizsys.psmodel.core.util.PSModelEnums.DERDEFInheritMode dEFInheritMode){
        if(dEFInheritMode == null){
            this.setDEFInheritMode(null);
        }
        else{
            this.setDEFInheritMode(dEFInheritMode.value);
        }
        return this;
    }

    /**
     * <B>DERFIELDLNAME</B>&nbsp;字段逻辑名称，指定实体关系连接属性的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DERFIELDLNAME = "derfieldlname";

    /**
     * 设置 字段逻辑名称，详细说明：{@link #FIELD_DERFIELDLNAME}
     * 
     * @param dERFieldLName
     * 
     */
    @JsonProperty(FIELD_DERFIELDLNAME)
    public void setDERFieldLName(String dERFieldLName){
        this.set(FIELD_DERFIELDLNAME, dERFieldLName);
    }
    
    /**
     * 获取 字段逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getDERFieldLName(){
        Object objValue = this.get(FIELD_DERFIELDLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字段逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERFieldLNameDirty(){
        if(this.contains(FIELD_DERFIELDLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字段逻辑名称
     */
    @JsonIgnore
    public void resetDERFieldLName(){
        this.reset(FIELD_DERFIELDLNAME);
    }

    /**
     * 设置 字段逻辑名称，详细说明：{@link #FIELD_DERFIELDLNAME}
     * <P>
     * 等同 {@link #setDERFieldLName}
     * @param dERFieldLName
     */
    @JsonIgnore
    public PSDER derfieldlname(String dERFieldLName){
        this.setDERFieldLName(dERFieldLName);
        return this;
    }

    /**
     * <B>DERFIELDNAME</B>&nbsp;关系字段名称，指定实体关系连接属性的名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DERFIELDNAME = "derfieldname";

    /**
     * 设置 关系字段名称，详细说明：{@link #FIELD_DERFIELDNAME}
     * 
     * @param dERFieldName
     * 
     */
    @JsonProperty(FIELD_DERFIELDNAME)
    public void setDERFieldName(String dERFieldName){
        this.set(FIELD_DERFIELDNAME, dERFieldName);
    }
    
    /**
     * 获取 关系字段名称  
     * @return
     */
    @JsonIgnore
    public String getDERFieldName(){
        Object objValue = this.get(FIELD_DERFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系字段名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERFieldNameDirty(){
        if(this.contains(FIELD_DERFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系字段名称
     */
    @JsonIgnore
    public void resetDERFieldName(){
        this.reset(FIELD_DERFIELDNAME);
    }

    /**
     * 设置 关系字段名称，详细说明：{@link #FIELD_DERFIELDNAME}
     * <P>
     * 等同 {@link #setDERFieldName}
     * @param dERFieldName
     */
    @JsonIgnore
    public PSDER derfieldname(String dERFieldName){
        this.setDERFieldName(dERFieldName);
        return this;
    }

    /**
     * <B>DERSUBTYPE</B>&nbsp;关系子类型，指定自定义关系的子类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERSubType} 
     */
    public final static String FIELD_DERSUBTYPE = "dersubtype";

    /**
     * 设置 关系子类型，详细说明：{@link #FIELD_DERSUBTYPE}
     * 
     * @param dERSubType
     * 
     */
    @JsonProperty(FIELD_DERSUBTYPE)
    public void setDERSubType(String dERSubType){
        this.set(FIELD_DERSUBTYPE, dERSubType);
    }
    
    /**
     * 获取 关系子类型  
     * @return
     */
    @JsonIgnore
    public String getDERSubType(){
        Object objValue = this.get(FIELD_DERSUBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系子类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERSubTypeDirty(){
        if(this.contains(FIELD_DERSUBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系子类型
     */
    @JsonIgnore
    public void resetDERSubType(){
        this.reset(FIELD_DERSUBTYPE);
    }

    /**
     * 设置 关系子类型，详细说明：{@link #FIELD_DERSUBTYPE}
     * <P>
     * 等同 {@link #setDERSubType}
     * @param dERSubType
     */
    @JsonIgnore
    public PSDER dersubtype(String dERSubType){
        this.setDERSubType(dERSubType);
        return this;
    }

     /**
     * 设置 关系子类型，详细说明：{@link #FIELD_DERSUBTYPE}
     * <P>
     * 等同 {@link #setDERSubType}
     * @param dERSubType
     */
    @JsonIgnore
    public PSDER dersubtype(net.ibizsys.psmodel.core.util.PSModelEnums.DERSubType dERSubType){
        if(dERSubType == null){
            this.setDERSubType(null);
        }
        else{
            this.setDERSubType(dERSubType.value);
        }
        return this;
    }

    /**
     * <B>DERTAG</B>&nbsp;关系标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DERTAG = "dertag";

    /**
     * 设置 关系标记
     * 
     * @param dERTag
     * 
     */
    @JsonProperty(FIELD_DERTAG)
    public void setDERTag(String dERTag){
        this.set(FIELD_DERTAG, dERTag);
    }
    
    /**
     * 获取 关系标记  
     * @return
     */
    @JsonIgnore
    public String getDERTag(){
        Object objValue = this.get(FIELD_DERTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERTagDirty(){
        if(this.contains(FIELD_DERTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记
     */
    @JsonIgnore
    public void resetDERTag(){
        this.reset(FIELD_DERTAG);
    }

    /**
     * 设置 关系标记
     * <P>
     * 等同 {@link #setDERTag}
     * @param dERTag
     */
    @JsonIgnore
    public PSDER dertag(String dERTag){
        this.setDERTag(dERTag);
        return this;
    }

    /**
     * <B>DERTAG2</B>&nbsp;关系标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DERTAG2 = "dertag2";

    /**
     * 设置 关系标记2
     * 
     * @param dERTag2
     * 
     */
    @JsonProperty(FIELD_DERTAG2)
    public void setDERTag2(String dERTag2){
        this.set(FIELD_DERTAG2, dERTag2);
    }
    
    /**
     * 获取 关系标记2  
     * @return
     */
    @JsonIgnore
    public String getDERTag2(){
        Object objValue = this.get(FIELD_DERTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERTag2Dirty(){
        if(this.contains(FIELD_DERTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记2
     */
    @JsonIgnore
    public void resetDERTag2(){
        this.reset(FIELD_DERTAG2);
    }

    /**
     * 设置 关系标记2
     * <P>
     * 等同 {@link #setDERTag2}
     * @param dERTag2
     */
    @JsonIgnore
    public PSDER dertag2(String dERTag2){
        this.setDERTag2(dERTag2);
        return this;
    }

    /**
     * <B>DERTYPE</B>&nbsp;关系类型，指定关系的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERType} 
     */
    public final static String FIELD_DERTYPE = "dertype";

    /**
     * 设置 关系类型，详细说明：{@link #FIELD_DERTYPE}
     * 
     * @param dERType
     * 
     */
    @JsonProperty(FIELD_DERTYPE)
    public void setDERType(String dERType){
        this.set(FIELD_DERTYPE, dERType);
    }
    
    /**
     * 获取 关系类型  
     * @return
     */
    @JsonIgnore
    public String getDERType(){
        Object objValue = this.get(FIELD_DERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERTypeDirty(){
        if(this.contains(FIELD_DERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系类型
     */
    @JsonIgnore
    public void resetDERType(){
        this.reset(FIELD_DERTYPE);
    }

    /**
     * 设置 关系类型，详细说明：{@link #FIELD_DERTYPE}
     * <P>
     * 等同 {@link #setDERType}
     * @param dERType
     */
    @JsonIgnore
    public PSDER dertype(String dERType){
        this.setDERType(dERType);
        return this;
    }

     /**
     * 设置 关系类型，详细说明：{@link #FIELD_DERTYPE}
     * <P>
     * 等同 {@link #setDERType}
     * @param dERType
     */
    @JsonIgnore
    public PSDER dertype(net.ibizsys.psmodel.core.util.PSModelEnums.DERType dERType){
        if(dERType == null){
            this.setDERType(null);
        }
        else{
            this.setDERType(dERType.value);
        }
        return this;
    }

    /**
     * <B>ENADEFIELDWRITEBACK</B>&nbsp;支持关系属性回写，指定关系的链接属性同步模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFWriteBackMode} 
     */
    public final static String FIELD_ENADEFIELDWRITEBACK = "enadefieldwriteback";

    /**
     * 设置 支持关系属性回写，详细说明：{@link #FIELD_ENADEFIELDWRITEBACK}
     * 
     * @param enaDEFieldWriteBack
     * 
     */
    @JsonProperty(FIELD_ENADEFIELDWRITEBACK)
    public void setEnaDEFieldWriteBack(Integer enaDEFieldWriteBack){
        this.set(FIELD_ENADEFIELDWRITEBACK, enaDEFieldWriteBack);
    }
    
    /**
     * 获取 支持关系属性回写  
     * @return
     */
    @JsonIgnore
    public Integer getEnaDEFieldWriteBack(){
        Object objValue = this.get(FIELD_ENADEFIELDWRITEBACK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持关系属性回写 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaDEFieldWriteBackDirty(){
        if(this.contains(FIELD_ENADEFIELDWRITEBACK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持关系属性回写
     */
    @JsonIgnore
    public void resetEnaDEFieldWriteBack(){
        this.reset(FIELD_ENADEFIELDWRITEBACK);
    }

    /**
     * 设置 支持关系属性回写，详细说明：{@link #FIELD_ENADEFIELDWRITEBACK}
     * <P>
     * 等同 {@link #setEnaDEFieldWriteBack}
     * @param enaDEFieldWriteBack
     */
    @JsonIgnore
    public PSDER enadefieldwriteback(Integer enaDEFieldWriteBack){
        this.setEnaDEFieldWriteBack(enaDEFieldWriteBack);
        return this;
    }

     /**
     * 设置 支持关系属性回写，详细说明：{@link #FIELD_ENADEFIELDWRITEBACK}
     * <P>
     * 等同 {@link #setEnaDEFieldWriteBack}
     * @param enaDEFieldWriteBack
     */
    @JsonIgnore
    public PSDER enadefieldwriteback(net.ibizsys.psmodel.core.util.PSModelEnums.DEFWriteBackMode enaDEFieldWriteBack){
        if(enaDEFieldWriteBack == null){
            this.setEnaDEFieldWriteBack(null);
        }
        else{
            this.setEnaDEFieldWriteBack(enaDEFieldWriteBack.value);
        }
        return this;
    }

    /**
     * <B>ENAEXTRANGE</B>&nbsp;启用附加约束，指定是否启用对引用实体的附加约束，如启用需同时指定等价约束的主实体属性及从实体属性，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENAEXTRANGE = "enaextrange";

    /**
     * 设置 启用附加约束，详细说明：{@link #FIELD_ENAEXTRANGE}
     * 
     * @param enaExtRange
     * 
     */
    @JsonProperty(FIELD_ENAEXTRANGE)
    public void setEnaExtRange(Integer enaExtRange){
        this.set(FIELD_ENAEXTRANGE, enaExtRange);
    }
    
    /**
     * 获取 启用附加约束  
     * @return
     */
    @JsonIgnore
    public Integer getEnaExtRange(){
        Object objValue = this.get(FIELD_ENAEXTRANGE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用附加约束 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaExtRangeDirty(){
        if(this.contains(FIELD_ENAEXTRANGE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用附加约束
     */
    @JsonIgnore
    public void resetEnaExtRange(){
        this.reset(FIELD_ENAEXTRANGE);
    }

    /**
     * 设置 启用附加约束，详细说明：{@link #FIELD_ENAEXTRANGE}
     * <P>
     * 等同 {@link #setEnaExtRange}
     * @param enaExtRange
     */
    @JsonIgnore
    public PSDER enaextrange(Integer enaExtRange){
        this.setEnaExtRange(enaExtRange);
        return this;
    }

     /**
     * 设置 启用附加约束，详细说明：{@link #FIELD_ENAEXTRANGE}
     * <P>
     * 等同 {@link #setEnaExtRange}
     * @param enaExtRange
     */
    @JsonIgnore
    public PSDER enaextrange(Boolean enaExtRange){
        if(enaExtRange == null){
            this.setEnaExtRange(null);
        }
        else{
            this.setEnaExtRange(enaExtRange?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENAPDEREQ</B>&nbsp;父关系等价，指定是否要求主实体及从实体都存在对同一个第三方实体的引用关系，如启用需同时指定主实体及从实体的引用关系，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENAPDEREQ = "enapdereq";

    /**
     * 设置 父关系等价，详细说明：{@link #FIELD_ENAPDEREQ}
     * 
     * @param enaPDEREQ
     * 
     */
    @JsonProperty(FIELD_ENAPDEREQ)
    public void setEnaPDEREQ(Integer enaPDEREQ){
        this.set(FIELD_ENAPDEREQ, enaPDEREQ);
    }
    
    /**
     * 获取 父关系等价  
     * @return
     */
    @JsonIgnore
    public Integer getEnaPDEREQ(){
        Object objValue = this.get(FIELD_ENAPDEREQ);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 父关系等价 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaPDEREQDirty(){
        if(this.contains(FIELD_ENAPDEREQ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父关系等价
     */
    @JsonIgnore
    public void resetEnaPDEREQ(){
        this.reset(FIELD_ENAPDEREQ);
    }

    /**
     * 设置 父关系等价，详细说明：{@link #FIELD_ENAPDEREQ}
     * <P>
     * 等同 {@link #setEnaPDEREQ}
     * @param enaPDEREQ
     */
    @JsonIgnore
    public PSDER enapdereq(Integer enaPDEREQ){
        this.setEnaPDEREQ(enaPDEREQ);
        return this;
    }

     /**
     * 设置 父关系等价，详细说明：{@link #FIELD_ENAPDEREQ}
     * <P>
     * 等同 {@link #setEnaPDEREQ}
     * @param enaPDEREQ
     */
    @JsonIgnore
    public PSDER enapdereq(Boolean enaPDEREQ){
        if(enaPDEREQ == null){
            this.setEnaPDEREQ(null);
        }
        else{
            this.setEnaPDEREQ(enaPDEREQ?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXPORTMAJORMODEL</B>&nbsp;导出引用模型关系
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportMajorModel} 
     */
    public final static String FIELD_EXPORTMAJORMODEL = "exportmajormodel";

    /**
     * 设置 导出引用模型关系
     * 
     * @param exportMajorModel
     * 
     */
    @JsonProperty(FIELD_EXPORTMAJORMODEL)
    public void setExportMajorModel(Integer exportMajorModel){
        this.set(FIELD_EXPORTMAJORMODEL, exportMajorModel);
    }
    
    /**
     * 获取 导出引用模型关系  
     * @return
     */
    @JsonIgnore
    public Integer getExportMajorModel(){
        Object objValue = this.get(FIELD_EXPORTMAJORMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导出引用模型关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportMajorModelDirty(){
        if(this.contains(FIELD_EXPORTMAJORMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出引用模型关系
     */
    @JsonIgnore
    public void resetExportMajorModel(){
        this.reset(FIELD_EXPORTMAJORMODEL);
    }

    /**
     * 设置 导出引用模型关系
     * <P>
     * 等同 {@link #setExportMajorModel}
     * @param exportMajorModel
     */
    @JsonIgnore
    public PSDER exportmajormodel(Integer exportMajorModel){
        this.setExportMajorModel(exportMajorModel);
        return this;
    }

     /**
     * 设置 导出引用模型关系
     * <P>
     * 等同 {@link #setExportMajorModel}
     * @param exportMajorModel
     */
    @JsonIgnore
    public PSDER exportmajormodel(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportMajorModel exportMajorModel){
        if(exportMajorModel == null){
            this.setExportMajorModel(null);
        }
        else{
            this.setExportMajorModel(exportMajorModel.value);
        }
        return this;
    }

    /**
     * <B>EXPORTMODEL</B>&nbsp;导出模型关系
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_EXPORTMODEL = "exportmodel";

    /**
     * 设置 导出模型关系
     * 
     * @param exportModel
     * 
     */
    @JsonProperty(FIELD_EXPORTMODEL)
    public void setExportModel(Integer exportModel){
        this.set(FIELD_EXPORTMODEL, exportModel);
    }
    
    /**
     * 获取 导出模型关系  
     * @return
     */
    @JsonIgnore
    public Integer getExportModel(){
        Object objValue = this.get(FIELD_EXPORTMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导出模型关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportModelDirty(){
        if(this.contains(FIELD_EXPORTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出模型关系
     */
    @JsonIgnore
    public void resetExportModel(){
        this.reset(FIELD_EXPORTMODEL);
    }

    /**
     * 设置 导出模型关系
     * <P>
     * 等同 {@link #setExportModel}
     * @param exportModel
     */
    @JsonIgnore
    public PSDER exportmodel(Integer exportModel){
        this.setExportModel(exportModel);
        return this;
    }

     /**
     * 设置 导出模型关系
     * <P>
     * 等同 {@link #setExportModel}
     * @param exportModel
     */
    @JsonIgnore
    public PSDER exportmodel(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel exportModel){
        if(exportModel == null){
            this.setExportModel(null);
        }
        else{
            this.setExportModel(exportModel.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE</B>&nbsp;自定义导出关系
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_EXPORTSCOPE = "exportscope";

    /**
     * 设置 自定义导出关系
     * 
     * @param exportScope
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE)
    public void setExportScope(Integer exportScope){
        this.set(FIELD_EXPORTSCOPE, exportScope);
    }
    
    /**
     * 获取 自定义导出关系  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope(){
        Object objValue = this.get(FIELD_EXPORTSCOPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScopeDirty(){
        if(this.contains(FIELD_EXPORTSCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出关系
     */
    @JsonIgnore
    public void resetExportScope(){
        this.reset(FIELD_EXPORTSCOPE);
    }

    /**
     * 设置 自定义导出关系
     * <P>
     * 等同 {@link #setExportScope}
     * @param exportScope
     */
    @JsonIgnore
    public PSDER exportscope(Integer exportScope){
        this.setExportScope(exportScope);
        return this;
    }

     /**
     * 设置 自定义导出关系
     * <P>
     * 等同 {@link #setExportScope}
     * @param exportScope
     */
    @JsonIgnore
    public PSDER exportscope(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel exportScope){
        if(exportScope == null){
            this.setExportScope(null);
        }
        else{
            this.setExportScope(exportScope.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE2</B>&nbsp;自定义导出关系2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_EXPORTSCOPE2 = "exportscope2";

    /**
     * 设置 自定义导出关系2
     * 
     * @param exportScope2
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE2)
    public void setExportScope2(Integer exportScope2){
        this.set(FIELD_EXPORTSCOPE2, exportScope2);
    }
    
    /**
     * 获取 自定义导出关系2  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope2(){
        Object objValue = this.get(FIELD_EXPORTSCOPE2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出关系2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope2Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出关系2
     */
    @JsonIgnore
    public void resetExportScope2(){
        this.reset(FIELD_EXPORTSCOPE2);
    }

    /**
     * 设置 自定义导出关系2
     * <P>
     * 等同 {@link #setExportScope2}
     * @param exportScope2
     */
    @JsonIgnore
    public PSDER exportscope2(Integer exportScope2){
        this.setExportScope2(exportScope2);
        return this;
    }

     /**
     * 设置 自定义导出关系2
     * <P>
     * 等同 {@link #setExportScope2}
     * @param exportScope2
     */
    @JsonIgnore
    public PSDER exportscope2(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel exportScope2){
        if(exportScope2 == null){
            this.setExportScope2(null);
        }
        else{
            this.setExportScope2(exportScope2.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE3</B>&nbsp;自定义导出关系3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE3 = "exportscope3";

    /**
     * 设置 自定义导出关系3
     * 
     * @param exportScope3
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE3)
    public void setExportScope3(Integer exportScope3){
        this.set(FIELD_EXPORTSCOPE3, exportScope3);
    }
    
    /**
     * 获取 自定义导出关系3  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope3(){
        Object objValue = this.get(FIELD_EXPORTSCOPE3);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出关系3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope3Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出关系3
     */
    @JsonIgnore
    public void resetExportScope3(){
        this.reset(FIELD_EXPORTSCOPE3);
    }

    /**
     * 设置 自定义导出关系3
     * <P>
     * 等同 {@link #setExportScope3}
     * @param exportScope3
     */
    @JsonIgnore
    public PSDER exportscope3(Integer exportScope3){
        this.setExportScope3(exportScope3);
        return this;
    }

     /**
     * 设置 自定义导出关系3
     * <P>
     * 等同 {@link #setExportScope3}
     * @param exportScope3
     */
    @JsonIgnore
    public PSDER exportscope3(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope3){
        if(exportScope3 == null){
            this.setExportScope3(null);
        }
        else{
            this.setExportScope3(exportScope3.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE4</B>&nbsp;自定义导出关系4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_EXPORTSCOPE4 = "exportscope4";

    /**
     * 设置 自定义导出关系4
     * 
     * @param exportScope4
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE4)
    public void setExportScope4(Integer exportScope4){
        this.set(FIELD_EXPORTSCOPE4, exportScope4);
    }
    
    /**
     * 获取 自定义导出关系4  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope4(){
        Object objValue = this.get(FIELD_EXPORTSCOPE4);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出关系4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope4Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出关系4
     */
    @JsonIgnore
    public void resetExportScope4(){
        this.reset(FIELD_EXPORTSCOPE4);
    }

    /**
     * 设置 自定义导出关系4
     * <P>
     * 等同 {@link #setExportScope4}
     * @param exportScope4
     */
    @JsonIgnore
    public PSDER exportscope4(Integer exportScope4){
        this.setExportScope4(exportScope4);
        return this;
    }

     /**
     * 设置 自定义导出关系4
     * <P>
     * 等同 {@link #setExportScope4}
     * @param exportScope4
     */
    @JsonIgnore
    public PSDER exportscope4(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel exportScope4){
        if(exportScope4 == null){
            this.setExportScope4(null);
        }
        else{
            this.setExportScope4(exportScope4.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE5</B>&nbsp;自定义导出关系5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE5 = "exportscope5";

    /**
     * 设置 自定义导出关系5
     * 
     * @param exportScope5
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE5)
    public void setExportScope5(Integer exportScope5){
        this.set(FIELD_EXPORTSCOPE5, exportScope5);
    }
    
    /**
     * 获取 自定义导出关系5  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope5(){
        Object objValue = this.get(FIELD_EXPORTSCOPE5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出关系5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope5Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出关系5
     */
    @JsonIgnore
    public void resetExportScope5(){
        this.reset(FIELD_EXPORTSCOPE5);
    }

    /**
     * 设置 自定义导出关系5
     * <P>
     * 等同 {@link #setExportScope5}
     * @param exportScope5
     */
    @JsonIgnore
    public PSDER exportscope5(Integer exportScope5){
        this.setExportScope5(exportScope5);
        return this;
    }

     /**
     * 设置 自定义导出关系5
     * <P>
     * 等同 {@link #setExportScope5}
     * @param exportScope5
     */
    @JsonIgnore
    public PSDER exportscope5(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope5){
        if(exportScope5 == null){
            this.setExportScope5(null);
        }
        else{
            this.setExportScope5(exportScope5.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE6</B>&nbsp;自定义导出关系6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE6 = "exportscope6";

    /**
     * 设置 自定义导出关系6
     * 
     * @param exportScope6
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE6)
    public void setExportScope6(Integer exportScope6){
        this.set(FIELD_EXPORTSCOPE6, exportScope6);
    }
    
    /**
     * 获取 自定义导出关系6  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope6(){
        Object objValue = this.get(FIELD_EXPORTSCOPE6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出关系6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope6Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出关系6
     */
    @JsonIgnore
    public void resetExportScope6(){
        this.reset(FIELD_EXPORTSCOPE6);
    }

    /**
     * 设置 自定义导出关系6
     * <P>
     * 等同 {@link #setExportScope6}
     * @param exportScope6
     */
    @JsonIgnore
    public PSDER exportscope6(Integer exportScope6){
        this.setExportScope6(exportScope6);
        return this;
    }

     /**
     * 设置 自定义导出关系6
     * <P>
     * 等同 {@link #setExportScope6}
     * @param exportScope6
     */
    @JsonIgnore
    public PSDER exportscope6(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope6){
        if(exportScope6 == null){
            this.setExportScope6(null);
        }
        else{
            this.setExportScope6(exportScope6.value);
        }
        return this;
    }

    /**
     * <B>EXTMAJORPSDEFID</B>&nbsp;附加约束主实体属性，指定启用引用实体的附加约束时的主实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_EXTMAJORPSDEFID = "extmajorpsdefid";

    /**
     * 设置 附加约束主实体属性，详细说明：{@link #FIELD_EXTMAJORPSDEFID}
     * 
     * @param eXTMajorPSDEFId
     * 
     */
    @JsonProperty(FIELD_EXTMAJORPSDEFID)
    public void setEXTMajorPSDEFId(String eXTMajorPSDEFId){
        this.set(FIELD_EXTMAJORPSDEFID, eXTMajorPSDEFId);
    }
    
    /**
     * 获取 附加约束主实体属性  
     * @return
     */
    @JsonIgnore
    public String getEXTMajorPSDEFId(){
        Object objValue = this.get(FIELD_EXTMAJORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加约束主实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEXTMajorPSDEFIdDirty(){
        if(this.contains(FIELD_EXTMAJORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加约束主实体属性
     */
    @JsonIgnore
    public void resetEXTMajorPSDEFId(){
        this.reset(FIELD_EXTMAJORPSDEFID);
    }

    /**
     * 设置 附加约束主实体属性，详细说明：{@link #FIELD_EXTMAJORPSDEFID}
     * <P>
     * 等同 {@link #setEXTMajorPSDEFId}
     * @param eXTMajorPSDEFId
     */
    @JsonIgnore
    public PSDER extmajorpsdefid(String eXTMajorPSDEFId){
        this.setEXTMajorPSDEFId(eXTMajorPSDEFId);
        return this;
    }

    /**
     * 设置 附加约束主实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEXTMajorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDER extmajorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setEXTMajorPSDEFId(null);
            this.setEXTMajorPSDEFName(null);
        }
        else{
            this.setEXTMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setEXTMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>EXTMAJORPSDEFNAME</B>&nbsp;附加约束主实体属性，指定启用引用实体的附加约束时的主实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EXTMAJORPSDEFID}
     */
    public final static String FIELD_EXTMAJORPSDEFNAME = "extmajorpsdefname";

    /**
     * 设置 附加约束主实体属性，详细说明：{@link #FIELD_EXTMAJORPSDEFNAME}
     * 
     * @param eXTMajorPSDEFName
     * 
     */
    @JsonProperty(FIELD_EXTMAJORPSDEFNAME)
    public void setEXTMajorPSDEFName(String eXTMajorPSDEFName){
        this.set(FIELD_EXTMAJORPSDEFNAME, eXTMajorPSDEFName);
    }
    
    /**
     * 获取 附加约束主实体属性  
     * @return
     */
    @JsonIgnore
    public String getEXTMajorPSDEFName(){
        Object objValue = this.get(FIELD_EXTMAJORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加约束主实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEXTMajorPSDEFNameDirty(){
        if(this.contains(FIELD_EXTMAJORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加约束主实体属性
     */
    @JsonIgnore
    public void resetEXTMajorPSDEFName(){
        this.reset(FIELD_EXTMAJORPSDEFNAME);
    }

    /**
     * 设置 附加约束主实体属性，详细说明：{@link #FIELD_EXTMAJORPSDEFNAME}
     * <P>
     * 等同 {@link #setEXTMajorPSDEFName}
     * @param eXTMajorPSDEFName
     */
    @JsonIgnore
    public PSDER extmajorpsdefname(String eXTMajorPSDEFName){
        this.setEXTMajorPSDEFName(eXTMajorPSDEFName);
        return this;
    }

    /**
     * <B>EXTMINORPSDEFID</B>&nbsp;附加约束从实体属性，指定启用引用实体的附加约束时的从实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_EXTMINORPSDEFID = "extminorpsdefid";

    /**
     * 设置 附加约束从实体属性，详细说明：{@link #FIELD_EXTMINORPSDEFID}
     * 
     * @param eXTMinorPSDEFId
     * 
     */
    @JsonProperty(FIELD_EXTMINORPSDEFID)
    public void setEXTMinorPSDEFId(String eXTMinorPSDEFId){
        this.set(FIELD_EXTMINORPSDEFID, eXTMinorPSDEFId);
    }
    
    /**
     * 获取 附加约束从实体属性  
     * @return
     */
    @JsonIgnore
    public String getEXTMinorPSDEFId(){
        Object objValue = this.get(FIELD_EXTMINORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加约束从实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEXTMinorPSDEFIdDirty(){
        if(this.contains(FIELD_EXTMINORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加约束从实体属性
     */
    @JsonIgnore
    public void resetEXTMinorPSDEFId(){
        this.reset(FIELD_EXTMINORPSDEFID);
    }

    /**
     * 设置 附加约束从实体属性，详细说明：{@link #FIELD_EXTMINORPSDEFID}
     * <P>
     * 等同 {@link #setEXTMinorPSDEFId}
     * @param eXTMinorPSDEFId
     */
    @JsonIgnore
    public PSDER extminorpsdefid(String eXTMinorPSDEFId){
        this.setEXTMinorPSDEFId(eXTMinorPSDEFId);
        return this;
    }

    /**
     * 设置 附加约束从实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEXTMinorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDER extminorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setEXTMinorPSDEFId(null);
            this.setEXTMinorPSDEFName(null);
        }
        else{
            this.setEXTMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setEXTMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>EXTMINORPSDEFNAME</B>&nbsp;附加约束从实体属性，指定启用引用实体的附加约束时的从实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EXTMINORPSDEFID}
     */
    public final static String FIELD_EXTMINORPSDEFNAME = "extminorpsdefname";

    /**
     * 设置 附加约束从实体属性，详细说明：{@link #FIELD_EXTMINORPSDEFNAME}
     * 
     * @param eXTMinorPSDEFName
     * 
     */
    @JsonProperty(FIELD_EXTMINORPSDEFNAME)
    public void setEXTMinorPSDEFName(String eXTMinorPSDEFName){
        this.set(FIELD_EXTMINORPSDEFNAME, eXTMinorPSDEFName);
    }
    
    /**
     * 获取 附加约束从实体属性  
     * @return
     */
    @JsonIgnore
    public String getEXTMinorPSDEFName(){
        Object objValue = this.get(FIELD_EXTMINORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加约束从实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEXTMinorPSDEFNameDirty(){
        if(this.contains(FIELD_EXTMINORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加约束从实体属性
     */
    @JsonIgnore
    public void resetEXTMinorPSDEFName(){
        this.reset(FIELD_EXTMINORPSDEFNAME);
    }

    /**
     * 设置 附加约束从实体属性，详细说明：{@link #FIELD_EXTMINORPSDEFNAME}
     * <P>
     * 等同 {@link #setEXTMinorPSDEFName}
     * @param eXTMinorPSDEFName
     */
    @JsonIgnore
    public PSDER extminorpsdefname(String eXTMinorPSDEFName){
        this.setEXTMinorPSDEFName(eXTMinorPSDEFName);
        return this;
    }

    /**
     * <B>FKEYNAME</B>&nbsp;外键名称，指定关系发布数据库外键时使用的名称，不指定时由引擎自动计算
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_FKEYNAME = "fkeyname";

    /**
     * 设置 外键名称，详细说明：{@link #FIELD_FKEYNAME}
     * 
     * @param fKeyName
     * 
     */
    @JsonProperty(FIELD_FKEYNAME)
    public void setFKeyName(String fKeyName){
        this.set(FIELD_FKEYNAME, fKeyName);
    }
    
    /**
     * 获取 外键名称  
     * @return
     */
    @JsonIgnore
    public String getFKeyName(){
        Object objValue = this.get(FIELD_FKEYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外键名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFKeyNameDirty(){
        if(this.contains(FIELD_FKEYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外键名称
     */
    @JsonIgnore
    public void resetFKeyName(){
        this.reset(FIELD_FKEYNAME);
    }

    /**
     * 设置 外键名称，详细说明：{@link #FIELD_FKEYNAME}
     * <P>
     * 等同 {@link #setFKeyName}
     * @param fKeyName
     */
    @JsonIgnore
    public PSDER fkeyname(String fKeyName){
        this.setFKeyName(fKeyName);
        return this;
    }

    /**
     * <B>FOREIGNKEY</B>&nbsp;启用外键，指定关系是否发布对应数据库外键约束，默认为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FOREIGNKEY = "foreignkey";

    /**
     * 设置 启用外键，详细说明：{@link #FIELD_FOREIGNKEY}
     * 
     * @param foreignKey
     * 
     */
    @JsonProperty(FIELD_FOREIGNKEY)
    public void setForeignKey(Integer foreignKey){
        this.set(FIELD_FOREIGNKEY, foreignKey);
    }
    
    /**
     * 获取 启用外键  
     * @return
     */
    @JsonIgnore
    public Integer getForeignKey(){
        Object objValue = this.get(FIELD_FOREIGNKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用外键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isForeignKeyDirty(){
        if(this.contains(FIELD_FOREIGNKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用外键
     */
    @JsonIgnore
    public void resetForeignKey(){
        this.reset(FIELD_FOREIGNKEY);
    }

    /**
     * 设置 启用外键，详细说明：{@link #FIELD_FOREIGNKEY}
     * <P>
     * 等同 {@link #setForeignKey}
     * @param foreignKey
     */
    @JsonIgnore
    public PSDER foreignkey(Integer foreignKey){
        this.setForeignKey(foreignKey);
        return this;
    }

     /**
     * 设置 启用外键，详细说明：{@link #FIELD_FOREIGNKEY}
     * <P>
     * 等同 {@link #setForeignKey}
     * @param foreignKey
     */
    @JsonIgnore
    public PSDER foreignkey(Boolean foreignKey){
        if(foreignKey == null){
            this.setForeignKey(null);
        }
        else{
            this.setForeignKey(foreignKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IGNOREDEFIELDS</B>&nbsp;继承属性集合，指定继承关系继承属性清单，使用【继承属性】=【源属性】格式
     */
    public final static String FIELD_IGNOREDEFIELDS = "ignoredefields";

    /**
     * 设置 继承属性集合，详细说明：{@link #FIELD_IGNOREDEFIELDS}
     * 
     * @param ignoreDEFields
     * 
     */
    @JsonProperty(FIELD_IGNOREDEFIELDS)
    public void setIgnoreDEFields(String ignoreDEFields){
        this.set(FIELD_IGNOREDEFIELDS, ignoreDEFields);
    }
    
    /**
     * 获取 继承属性集合  
     * @return
     */
    @JsonIgnore
    public String getIgnoreDEFields(){
        Object objValue = this.get(FIELD_IGNOREDEFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 继承属性集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreDEFieldsDirty(){
        if(this.contains(FIELD_IGNOREDEFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 继承属性集合
     */
    @JsonIgnore
    public void resetIgnoreDEFields(){
        this.reset(FIELD_IGNOREDEFIELDS);
    }

    /**
     * 设置 继承属性集合，详细说明：{@link #FIELD_IGNOREDEFIELDS}
     * <P>
     * 等同 {@link #setIgnoreDEFields}
     * @param ignoreDEFields
     */
    @JsonIgnore
    public PSDER ignoredefields(String ignoreDEFields){
        this.setIgnoreDEFields(ignoreDEFields);
        return this;
    }

    /**
     * <B>INDEXVALUE</B>&nbsp;类型识别值，指定继承或索引关系的类型识别值
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_INDEXVALUE = "indexvalue";

    /**
     * 设置 类型识别值，详细说明：{@link #FIELD_INDEXVALUE}
     * 
     * @param indexValue
     * 
     */
    @JsonProperty(FIELD_INDEXVALUE)
    public void setIndexValue(String indexValue){
        this.set(FIELD_INDEXVALUE, indexValue);
    }
    
    /**
     * 获取 类型识别值  
     * @return
     */
    @JsonIgnore
    public String getIndexValue(){
        Object objValue = this.get(FIELD_INDEXVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型识别值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIndexValueDirty(){
        if(this.contains(FIELD_INDEXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型识别值
     */
    @JsonIgnore
    public void resetIndexValue(){
        this.reset(FIELD_INDEXVALUE);
    }

    /**
     * 设置 类型识别值，详细说明：{@link #FIELD_INDEXVALUE}
     * <P>
     * 等同 {@link #setIndexValue}
     * @param indexValue
     */
    @JsonIgnore
    public PSDER indexvalue(String indexValue){
        this.setIndexValue(indexValue);
        return this;
    }

    /**
     * <B>INHERITMODE</B>&nbsp;继承处理模式，指定继承关系的继承模式，默认为【存储继承】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERInheritMode} 
     */
    public final static String FIELD_INHERITMODE = "inheritmode";

    /**
     * 设置 继承处理模式，详细说明：{@link #FIELD_INHERITMODE}
     * 
     * @param inheritMode
     * 
     */
    @JsonProperty(FIELD_INHERITMODE)
    public void setInheritMode(Integer inheritMode){
        this.set(FIELD_INHERITMODE, inheritMode);
    }
    
    /**
     * 获取 继承处理模式  
     * @return
     */
    @JsonIgnore
    public Integer getInheritMode(){
        Object objValue = this.get(FIELD_INHERITMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 继承处理模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInheritModeDirty(){
        if(this.contains(FIELD_INHERITMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 继承处理模式
     */
    @JsonIgnore
    public void resetInheritMode(){
        this.reset(FIELD_INHERITMODE);
    }

    /**
     * 设置 继承处理模式，详细说明：{@link #FIELD_INHERITMODE}
     * <P>
     * 等同 {@link #setInheritMode}
     * @param inheritMode
     */
    @JsonIgnore
    public PSDER inheritmode(Integer inheritMode){
        this.setInheritMode(inheritMode);
        return this;
    }

     /**
     * 设置 继承处理模式，详细说明：{@link #FIELD_INHERITMODE}
     * <P>
     * 等同 {@link #setInheritMode}
     * @param inheritMode
     */
    @JsonIgnore
    public PSDER inheritmode(net.ibizsys.psmodel.core.util.PSModelEnums.DERInheritMode inheritMode){
        if(inheritMode == null){
            this.setInheritMode(null);
        }
        else{
            this.setInheritMode(inheritMode.value);
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWID</B>&nbsp;链接展现视图，指定引用数据在界面上需要提供链接视图时默认使用的实体视图（网页端）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_LINKPSDEVIEWID = "linkpsdeviewid";

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * 
     * @param linkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWID)
    public void setLinkPSDEViewId(String linkPSDEViewId){
        this.set(FIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }
    
    /**
     * 获取 链接展现视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewId(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接展现视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewId(){
        this.reset(FIELD_LINKPSDEVIEWID);
    }

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param linkPSDEViewId
     */
    @JsonIgnore
    public PSDER linkpsdeviewid(String linkPSDEViewId){
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    /**
     * 设置 链接展现视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER linkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        }
        else{
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWNAME</B>&nbsp;链接展现视图，指定引用数据在界面上需要提供链接视图时默认使用的实体视图（网页端）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEVIEWID}
     */
    public final static String FIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * 
     * @param linkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWNAME)
    public void setLinkPSDEViewName(String linkPSDEViewName){
        this.set(FIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }
    
    /**
     * 获取 链接展现视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewName(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接展现视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewName(){
        this.reset(FIELD_LINKPSDEVIEWNAME);
    }

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setLinkPSDEViewName}
     * @param linkPSDEViewName
     */
    @JsonIgnore
    public PSDER linkpsdeviewname(String linkPSDEViewName){
        this.setLinkPSDEViewName(linkPSDEViewName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定实体关系的中文名称
     * <P>
     * 字符串：最大长度 200
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
    public PSDER logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORPSDEID</B>&nbsp;云关系主实体，指定关系的主实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_MAJORPSDEID = "majorpsdeid";

    /**
     * 设置 云关系主实体，详细说明：{@link #FIELD_MAJORPSDEID}
     * 
     * @param majorPSDEId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEID)
    public void setMajorPSDEId(String majorPSDEId){
        this.set(FIELD_MAJORPSDEID, majorPSDEId);
    }
    
    /**
     * 获取 云关系主实体  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEId(){
        Object objValue = this.get(FIELD_MAJORPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云关系主实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEIdDirty(){
        if(this.contains(FIELD_MAJORPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云关系主实体
     */
    @JsonIgnore
    public void resetMajorPSDEId(){
        this.reset(FIELD_MAJORPSDEID);
    }

    /**
     * 设置 云关系主实体，详细说明：{@link #FIELD_MAJORPSDEID}
     * <P>
     * 等同 {@link #setMajorPSDEId}
     * @param majorPSDEId
     */
    @JsonIgnore
    public PSDER majorpsdeid(String majorPSDEId){
        this.setMajorPSDEId(majorPSDEId);
        return this;
    }

    /**
     * 设置 云关系主实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDER majorpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setMajorPSDEId(null);
            this.setMajorPSDEName(null);
        }
        else{
            this.setMajorPSDEId(pSDataEntity.getPSDataEntityId());
            this.setMajorPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDENAME</B>&nbsp;关系主实体，指定关系的主实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEID}
     */
    public final static String FIELD_MAJORPSDENAME = "majorpsdename";

    /**
     * 设置 关系主实体，详细说明：{@link #FIELD_MAJORPSDENAME}
     * 
     * @param majorPSDEName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDENAME)
    public void setMajorPSDEName(String majorPSDEName){
        this.set(FIELD_MAJORPSDENAME, majorPSDEName);
    }
    
    /**
     * 获取 关系主实体  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEName(){
        Object objValue = this.get(FIELD_MAJORPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系主实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDENameDirty(){
        if(this.contains(FIELD_MAJORPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系主实体
     */
    @JsonIgnore
    public void resetMajorPSDEName(){
        this.reset(FIELD_MAJORPSDENAME);
    }

    /**
     * 设置 关系主实体，详细说明：{@link #FIELD_MAJORPSDENAME}
     * <P>
     * 等同 {@link #setMajorPSDEName}
     * @param majorPSDEName
     */
    @JsonIgnore
    public PSDER majorpsdename(String majorPSDEName){
        this.setMajorPSDEName(majorPSDEName);
        return this;
    }

    /**
     * <B>MAJORPSDERID</B>&nbsp;主实体父关系，在启用父关系等价时指定主实体的引用关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_MAJORPSDERID = "majorpsderid";

    /**
     * 设置 主实体父关系，详细说明：{@link #FIELD_MAJORPSDERID}
     * 
     * @param majorPSDERId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDERID)
    public void setMajorPSDERId(String majorPSDERId){
        this.set(FIELD_MAJORPSDERID, majorPSDERId);
    }
    
    /**
     * 获取 主实体父关系  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDERId(){
        Object objValue = this.get(FIELD_MAJORPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体父关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDERIdDirty(){
        if(this.contains(FIELD_MAJORPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体父关系
     */
    @JsonIgnore
    public void resetMajorPSDERId(){
        this.reset(FIELD_MAJORPSDERID);
    }

    /**
     * 设置 主实体父关系，详细说明：{@link #FIELD_MAJORPSDERID}
     * <P>
     * 等同 {@link #setMajorPSDERId}
     * @param majorPSDERId
     */
    @JsonIgnore
    public PSDER majorpsderid(String majorPSDERId){
        this.setMajorPSDERId(majorPSDERId);
        return this;
    }

    /**
     * 设置 主实体父关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDER majorpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setMajorPSDERId(null);
            this.setMajorPSDERName(null);
        }
        else{
            this.setMajorPSDERId(pSDER.getPSDERId());
            this.setMajorPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDERNAME</B>&nbsp;主实体父关系，在启用父关系等价时指定主实体的引用关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDERID}
     */
    public final static String FIELD_MAJORPSDERNAME = "majorpsdername";

    /**
     * 设置 主实体父关系，详细说明：{@link #FIELD_MAJORPSDERNAME}
     * 
     * @param majorPSDERName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDERNAME)
    public void setMajorPSDERName(String majorPSDERName){
        this.set(FIELD_MAJORPSDERNAME, majorPSDERName);
    }
    
    /**
     * 获取 主实体父关系  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDERName(){
        Object objValue = this.get(FIELD_MAJORPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体父关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDERNameDirty(){
        if(this.contains(FIELD_MAJORPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体父关系
     */
    @JsonIgnore
    public void resetMajorPSDERName(){
        this.reset(FIELD_MAJORPSDERNAME);
    }

    /**
     * 设置 主实体父关系，详细说明：{@link #FIELD_MAJORPSDERNAME}
     * <P>
     * 等同 {@link #setMajorPSDERName}
     * @param majorPSDERName
     */
    @JsonIgnore
    public PSDER majorpsdername(String majorPSDERName){
        this.setMajorPSDERName(majorPSDERName);
        return this;
    }

    /**
     * <B>MASTERORDERVALUE</B>&nbsp;主控关系排序，指定1：N关系主控模式的级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_MASTERORDERVALUE = "masterordervalue";

    /**
     * 设置 主控关系排序，详细说明：{@link #FIELD_MASTERORDERVALUE}
     * 
     * @param masterOrderValue
     * 
     */
    @JsonProperty(FIELD_MASTERORDERVALUE)
    public void setMasterOrderValue(Integer masterOrderValue){
        this.set(FIELD_MASTERORDERVALUE, masterOrderValue);
    }
    
    /**
     * 获取 主控关系排序  
     * @return
     */
    @JsonIgnore
    public Integer getMasterOrderValue(){
        Object objValue = this.get(FIELD_MASTERORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主控关系排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMasterOrderValueDirty(){
        if(this.contains(FIELD_MASTERORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主控关系排序
     */
    @JsonIgnore
    public void resetMasterOrderValue(){
        this.reset(FIELD_MASTERORDERVALUE);
    }

    /**
     * 设置 主控关系排序，详细说明：{@link #FIELD_MASTERORDERVALUE}
     * <P>
     * 等同 {@link #setMasterOrderValue}
     * @param masterOrderValue
     */
    @JsonIgnore
    public PSDER masterordervalue(Integer masterOrderValue){
        this.setMasterOrderValue(masterOrderValue);
        return this;
    }

     /**
     * 设置 主控关系排序，详细说明：{@link #FIELD_MASTERORDERVALUE}
     * <P>
     * 等同 {@link #setMasterOrderValue}
     * @param masterOrderValue
     */
    @JsonIgnore
    public PSDER masterordervalue(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel masterOrderValue){
        if(masterOrderValue == null){
            this.setMasterOrderValue(null);
        }
        else{
            this.setMasterOrderValue(masterOrderValue.value);
        }
        return this;
    }

    /**
     * <B>MASTERRS</B>&nbsp;主从关系，额外指定主从关系的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DER1NMasterRS} 
     */
    public final static String FIELD_MASTERRS = "masterrs";

    /**
     * 设置 主从关系，详细说明：{@link #FIELD_MASTERRS}
     * 
     * @param masterRS
     * 
     */
    @JsonProperty(FIELD_MASTERRS)
    public void setMasterRS(Integer masterRS){
        this.set(FIELD_MASTERRS, masterRS);
    }
    
    /**
     * 获取 主从关系  
     * @return
     */
    @JsonIgnore
    public Integer getMasterRS(){
        Object objValue = this.get(FIELD_MASTERRS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主从关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMasterRSDirty(){
        if(this.contains(FIELD_MASTERRS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主从关系
     */
    @JsonIgnore
    public void resetMasterRS(){
        this.reset(FIELD_MASTERRS);
    }

    /**
     * 设置 主从关系，详细说明：{@link #FIELD_MASTERRS}
     * <P>
     * 等同 {@link #setMasterRS}
     * @param masterRS
     */
    @JsonIgnore
    public PSDER masterrs(Integer masterRS){
        this.setMasterRS(masterRS);
        return this;
    }

     /**
     * 设置 主从关系，详细说明：{@link #FIELD_MASTERRS}
     * <P>
     * 等同 {@link #setMasterRS}
     * @param masterRS
     */
    @JsonIgnore
    public PSDER masterrs(net.ibizsys.psmodel.core.util.PSModelEnums.DER1NMasterRS[] masterRS){
        if(masterRS == null || masterRS.length == 0){
            this.setMasterRS(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DER1NMasterRS _item : masterRS){
                _value |= _item.value;
            }
            this.setMasterRS(_value);
        }
        return this;
    }

    /**
     * <B>MDPSDEVIEWID</B>&nbsp;多项数据选择视图，指定引用数据在界面上需要提供多项数据选择视图时默认使用的实体视图（网页端）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MDPSDEVIEWID = "mdpsdeviewid";

    /**
     * 设置 多项数据选择视图，详细说明：{@link #FIELD_MDPSDEVIEWID}
     * 
     * @param mDPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MDPSDEVIEWID)
    public void setMDPSDEViewId(String mDPSDEViewId){
        this.set(FIELD_MDPSDEVIEWID, mDPSDEViewId);
    }
    
    /**
     * 获取 多项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEViewId(){
        Object objValue = this.get(FIELD_MDPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEViewIdDirty(){
        if(this.contains(FIELD_MDPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多项数据选择视图
     */
    @JsonIgnore
    public void resetMDPSDEViewId(){
        this.reset(FIELD_MDPSDEVIEWID);
    }

    /**
     * 设置 多项数据选择视图，详细说明：{@link #FIELD_MDPSDEVIEWID}
     * <P>
     * 等同 {@link #setMDPSDEViewId}
     * @param mDPSDEViewId
     */
    @JsonIgnore
    public PSDER mdpsdeviewid(String mDPSDEViewId){
        this.setMDPSDEViewId(mDPSDEViewId);
        return this;
    }

    /**
     * 设置 多项数据选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER mdpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMDPSDEViewId(null);
            this.setMDPSDEViewName(null);
        }
        else{
            this.setMDPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMDPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MDPSDEVIEWNAME</B>&nbsp;多项数据选择视图，指定引用数据在界面上需要提供多项数据选择视图时默认使用的实体视图（网页端）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSDEVIEWID}
     */
    public final static String FIELD_MDPSDEVIEWNAME = "mdpsdeviewname";

    /**
     * 设置 多项数据选择视图，详细说明：{@link #FIELD_MDPSDEVIEWNAME}
     * 
     * @param mDPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MDPSDEVIEWNAME)
    public void setMDPSDEViewName(String mDPSDEViewName){
        this.set(FIELD_MDPSDEVIEWNAME, mDPSDEViewName);
    }
    
    /**
     * 获取 多项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEViewName(){
        Object objValue = this.get(FIELD_MDPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEViewNameDirty(){
        if(this.contains(FIELD_MDPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多项数据选择视图
     */
    @JsonIgnore
    public void resetMDPSDEViewName(){
        this.reset(FIELD_MDPSDEVIEWNAME);
    }

    /**
     * 设置 多项数据选择视图，详细说明：{@link #FIELD_MDPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMDPSDEViewName}
     * @param mDPSDEViewName
     */
    @JsonIgnore
    public PSDER mdpsdeviewname(String mDPSDEViewName){
        this.setMDPSDEViewName(mDPSDEViewName);
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
    public PSDER memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORCODENAME</B>&nbsp;从关系代码标识
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_MINORCODENAME = "minorcodename";

    /**
     * 设置 从关系代码标识
     * 
     * @param minorCodeName
     * 
     */
    @JsonProperty(FIELD_MINORCODENAME)
    public void setMinorCodeName(String minorCodeName){
        this.set(FIELD_MINORCODENAME, minorCodeName);
    }
    
    /**
     * 获取 从关系代码标识  
     * @return
     */
    @JsonIgnore
    public String getMinorCodeName(){
        Object objValue = this.get(FIELD_MINORCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从关系代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorCodeNameDirty(){
        if(this.contains(FIELD_MINORCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从关系代码标识
     */
    @JsonIgnore
    public void resetMinorCodeName(){
        this.reset(FIELD_MINORCODENAME);
    }

    /**
     * 设置 从关系代码标识
     * <P>
     * 等同 {@link #setMinorCodeName}
     * @param minorCodeName
     */
    @JsonIgnore
    public PSDER minorcodename(String minorCodeName){
        this.setMinorCodeName(minorCodeName);
        return this;
    }

    /**
     * <B>MINORLOGICNAME</B>&nbsp;从关系逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MINORLOGICNAME = "minorlogicname";

    /**
     * 设置 从关系逻辑名称
     * 
     * @param minorLogicName
     * 
     */
    @JsonProperty(FIELD_MINORLOGICNAME)
    public void setMinorLogicName(String minorLogicName){
        this.set(FIELD_MINORLOGICNAME, minorLogicName);
    }
    
    /**
     * 获取 从关系逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getMinorLogicName(){
        Object objValue = this.get(FIELD_MINORLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从关系逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorLogicNameDirty(){
        if(this.contains(FIELD_MINORLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从关系逻辑名称
     */
    @JsonIgnore
    public void resetMinorLogicName(){
        this.reset(FIELD_MINORLOGICNAME);
    }

    /**
     * 设置 从关系逻辑名称
     * <P>
     * 等同 {@link #setMinorLogicName}
     * @param minorLogicName
     */
    @JsonIgnore
    public PSDER minorlogicname(String minorLogicName){
        this.setMinorLogicName(minorLogicName);
        return this;
    }

    /**
     * <B>MINORPSDEDSID</B>&nbsp;从实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_MINORPSDEDSID = "minorpsdedsid";

    /**
     * 设置 从实体数据集
     * 
     * @param minorPSDEDSId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEDSID)
    public void setMinorPSDEDSId(String minorPSDEDSId){
        this.set(FIELD_MINORPSDEDSID, minorPSDEDSId);
    }
    
    /**
     * 获取 从实体数据集  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEDSId(){
        Object objValue = this.get(FIELD_MINORPSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEDSIdDirty(){
        if(this.contains(FIELD_MINORPSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体数据集
     */
    @JsonIgnore
    public void resetMinorPSDEDSId(){
        this.reset(FIELD_MINORPSDEDSID);
    }

    /**
     * 设置 从实体数据集
     * <P>
     * 等同 {@link #setMinorPSDEDSId}
     * @param minorPSDEDSId
     */
    @JsonIgnore
    public PSDER minorpsdedsid(String minorPSDEDSId){
        this.setMinorPSDEDSId(minorPSDEDSId);
        return this;
    }

    /**
     * 设置 从实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDER minorpsdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setMinorPSDEDSId(null);
            this.setMinorPSDEDSName(null);
        }
        else{
            this.setMinorPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setMinorPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>MINORPSDEDSNAME</B>&nbsp;从实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEDSID}
     */
    public final static String FIELD_MINORPSDEDSNAME = "minorpsdedsname";

    /**
     * 设置 从实体数据集
     * 
     * @param minorPSDEDSName
     * 
     */
    @JsonProperty(FIELD_MINORPSDEDSNAME)
    public void setMinorPSDEDSName(String minorPSDEDSName){
        this.set(FIELD_MINORPSDEDSNAME, minorPSDEDSName);
    }
    
    /**
     * 获取 从实体数据集  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEDSName(){
        Object objValue = this.get(FIELD_MINORPSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEDSNameDirty(){
        if(this.contains(FIELD_MINORPSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体数据集
     */
    @JsonIgnore
    public void resetMinorPSDEDSName(){
        this.reset(FIELD_MINORPSDEDSNAME);
    }

    /**
     * 设置 从实体数据集
     * <P>
     * 等同 {@link #setMinorPSDEDSName}
     * @param minorPSDEDSName
     */
    @JsonIgnore
    public PSDER minorpsdedsname(String minorPSDEDSName){
        this.setMinorPSDEDSName(minorPSDEDSName);
        return this;
    }

    /**
     * <B>MINORPSDEID</B>&nbsp;关系从实体，指定关系的从实体，除了【1:N关系】类型外，其它类型关系从实体不能与主实体一致
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_MINORPSDEID = "minorpsdeid";

    /**
     * 设置 关系从实体，详细说明：{@link #FIELD_MINORPSDEID}
     * 
     * @param minorPSDEId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEID)
    public void setMinorPSDEId(String minorPSDEId){
        this.set(FIELD_MINORPSDEID, minorPSDEId);
    }
    
    /**
     * 获取 关系从实体  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEId(){
        Object objValue = this.get(FIELD_MINORPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系从实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEIdDirty(){
        if(this.contains(FIELD_MINORPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系从实体
     */
    @JsonIgnore
    public void resetMinorPSDEId(){
        this.reset(FIELD_MINORPSDEID);
    }

    /**
     * 设置 关系从实体，详细说明：{@link #FIELD_MINORPSDEID}
     * <P>
     * 等同 {@link #setMinorPSDEId}
     * @param minorPSDEId
     */
    @JsonIgnore
    public PSDER minorpsdeid(String minorPSDEId){
        this.setMinorPSDEId(minorPSDEId);
        return this;
    }

    /**
     * 设置 关系从实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDER minorpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setMinorPSDEId(null);
            this.setMinorPSDEName(null);
        }
        else{
            this.setMinorPSDEId(pSDataEntity.getPSDataEntityId());
            this.setMinorPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>MINORPSDENAME</B>&nbsp;关系从实体，指定关系的从实体，除了【1:N关系】类型外，其它类型关系从实体不能与主实体一致
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEID}
     */
    public final static String FIELD_MINORPSDENAME = "minorpsdename";

    /**
     * 设置 关系从实体，详细说明：{@link #FIELD_MINORPSDENAME}
     * 
     * @param minorPSDEName
     * 
     */
    @JsonProperty(FIELD_MINORPSDENAME)
    public void setMinorPSDEName(String minorPSDEName){
        this.set(FIELD_MINORPSDENAME, minorPSDEName);
    }
    
    /**
     * 获取 关系从实体  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEName(){
        Object objValue = this.get(FIELD_MINORPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系从实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDENameDirty(){
        if(this.contains(FIELD_MINORPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系从实体
     */
    @JsonIgnore
    public void resetMinorPSDEName(){
        this.reset(FIELD_MINORPSDENAME);
    }

    /**
     * 设置 关系从实体，详细说明：{@link #FIELD_MINORPSDENAME}
     * <P>
     * 等同 {@link #setMinorPSDEName}
     * @param minorPSDEName
     */
    @JsonIgnore
    public PSDER minorpsdename(String minorPSDEName){
        this.setMinorPSDEName(minorPSDEName);
        return this;
    }

    /**
     * <B>MINORPSDERID</B>&nbsp;附属实体父关系，在启用父关系等价时指定从实体的引用关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_MINORPSDERID = "minorpsderid";

    /**
     * 设置 附属实体父关系，详细说明：{@link #FIELD_MINORPSDERID}
     * 
     * @param minorPSDERId
     * 
     */
    @JsonProperty(FIELD_MINORPSDERID)
    public void setMinorPSDERId(String minorPSDERId){
        this.set(FIELD_MINORPSDERID, minorPSDERId);
    }
    
    /**
     * 获取 附属实体父关系  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDERId(){
        Object objValue = this.get(FIELD_MINORPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附属实体父关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDERIdDirty(){
        if(this.contains(FIELD_MINORPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附属实体父关系
     */
    @JsonIgnore
    public void resetMinorPSDERId(){
        this.reset(FIELD_MINORPSDERID);
    }

    /**
     * 设置 附属实体父关系，详细说明：{@link #FIELD_MINORPSDERID}
     * <P>
     * 等同 {@link #setMinorPSDERId}
     * @param minorPSDERId
     */
    @JsonIgnore
    public PSDER minorpsderid(String minorPSDERId){
        this.setMinorPSDERId(minorPSDERId);
        return this;
    }

    /**
     * 设置 附属实体父关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDER minorpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setMinorPSDERId(null);
            this.setMinorPSDERName(null);
        }
        else{
            this.setMinorPSDERId(pSDER.getPSDERId());
            this.setMinorPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>MINORPSDERNAME</B>&nbsp;附属实体父关系，在启用父关系等价时指定从实体的引用关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDERID}
     */
    public final static String FIELD_MINORPSDERNAME = "minorpsdername";

    /**
     * 设置 附属实体父关系，详细说明：{@link #FIELD_MINORPSDERNAME}
     * 
     * @param minorPSDERName
     * 
     */
    @JsonProperty(FIELD_MINORPSDERNAME)
    public void setMinorPSDERName(String minorPSDERName){
        this.set(FIELD_MINORPSDERNAME, minorPSDERName);
    }
    
    /**
     * 获取 附属实体父关系  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDERName(){
        Object objValue = this.get(FIELD_MINORPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附属实体父关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDERNameDirty(){
        if(this.contains(FIELD_MINORPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附属实体父关系
     */
    @JsonIgnore
    public void resetMinorPSDERName(){
        this.reset(FIELD_MINORPSDERNAME);
    }

    /**
     * 设置 附属实体父关系，详细说明：{@link #FIELD_MINORPSDERNAME}
     * <P>
     * 等同 {@link #setMinorPSDERName}
     * @param minorPSDERName
     */
    @JsonIgnore
    public PSDER minorpsdername(String minorPSDERName){
        this.setMinorPSDERName(minorPSDERName);
        return this;
    }

    /**
     * <B>MINORSERVICECODENAME</B>&nbsp;从关系服务代码名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_MINORSERVICECODENAME = "minorservicecodename";

    /**
     * 设置 从关系服务代码名称
     * 
     * @param minorServiceCodeName
     * 
     */
    @JsonProperty(FIELD_MINORSERVICECODENAME)
    public void setMinorServiceCodeName(String minorServiceCodeName){
        this.set(FIELD_MINORSERVICECODENAME, minorServiceCodeName);
    }
    
    /**
     * 获取 从关系服务代码名称  
     * @return
     */
    @JsonIgnore
    public String getMinorServiceCodeName(){
        Object objValue = this.get(FIELD_MINORSERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从关系服务代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorServiceCodeNameDirty(){
        if(this.contains(FIELD_MINORSERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从关系服务代码名称
     */
    @JsonIgnore
    public void resetMinorServiceCodeName(){
        this.reset(FIELD_MINORSERVICECODENAME);
    }

    /**
     * 设置 从关系服务代码名称
     * <P>
     * 等同 {@link #setMinorServiceCodeName}
     * @param minorServiceCodeName
     */
    @JsonIgnore
    public PSDER minorservicecodename(String minorServiceCodeName){
        this.setMinorServiceCodeName(minorServiceCodeName);
        return this;
    }

    /**
     * <B>MOBLINKPSDEVIEWID</B>&nbsp;移动端链接展现视图，指定引用数据在界面上需要提供链接视图时默认使用的实体视图（移动端）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MOBLINKPSDEVIEWID = "moblinkpsdeviewid";

    /**
     * 设置 移动端链接展现视图，详细说明：{@link #FIELD_MOBLINKPSDEVIEWID}
     * 
     * @param mobLinkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBLINKPSDEVIEWID)
    public void setMobLinkPSDEViewId(String mobLinkPSDEViewId){
        this.set(FIELD_MOBLINKPSDEVIEWID, mobLinkPSDEViewId);
    }
    
    /**
     * 获取 移动端链接展现视图  
     * @return
     */
    @JsonIgnore
    public String getMobLinkPSDEViewId(){
        Object objValue = this.get(FIELD_MOBLINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端链接展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBLINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端链接展现视图
     */
    @JsonIgnore
    public void resetMobLinkPSDEViewId(){
        this.reset(FIELD_MOBLINKPSDEVIEWID);
    }

    /**
     * 设置 移动端链接展现视图，详细说明：{@link #FIELD_MOBLINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setMobLinkPSDEViewId}
     * @param mobLinkPSDEViewId
     */
    @JsonIgnore
    public PSDER moblinkpsdeviewid(String mobLinkPSDEViewId){
        this.setMobLinkPSDEViewId(mobLinkPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端链接展现视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER moblinkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobLinkPSDEViewId(null);
            this.setMobLinkPSDEViewName(null);
        }
        else{
            this.setMobLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBLINKPSDEVIEWNAME</B>&nbsp;移动端链接展现视图，指定引用数据在界面上需要提供链接视图时默认使用的实体视图（移动端）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBLINKPSDEVIEWID}
     */
    public final static String FIELD_MOBLINKPSDEVIEWNAME = "moblinkpsdeviewname";

    /**
     * 设置 移动端链接展现视图，详细说明：{@link #FIELD_MOBLINKPSDEVIEWNAME}
     * 
     * @param mobLinkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBLINKPSDEVIEWNAME)
    public void setMobLinkPSDEViewName(String mobLinkPSDEViewName){
        this.set(FIELD_MOBLINKPSDEVIEWNAME, mobLinkPSDEViewName);
    }
    
    /**
     * 获取 移动端链接展现视图  
     * @return
     */
    @JsonIgnore
    public String getMobLinkPSDEViewName(){
        Object objValue = this.get(FIELD_MOBLINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端链接展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBLINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端链接展现视图
     */
    @JsonIgnore
    public void resetMobLinkPSDEViewName(){
        this.reset(FIELD_MOBLINKPSDEVIEWNAME);
    }

    /**
     * 设置 移动端链接展现视图，详细说明：{@link #FIELD_MOBLINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobLinkPSDEViewName}
     * @param mobLinkPSDEViewName
     */
    @JsonIgnore
    public PSDER moblinkpsdeviewname(String mobLinkPSDEViewName){
        this.setMobLinkPSDEViewName(mobLinkPSDEViewName);
        return this;
    }

    /**
     * <B>MOBMDPSDEVIEWID</B>&nbsp;移动端多项数据选择视图，指定引用数据在界面上需要提供多项数据选择视图时默认使用的实体视图（移动端）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MOBMDPSDEVIEWID = "mobmdpsdeviewid";

    /**
     * 设置 移动端多项数据选择视图，详细说明：{@link #FIELD_MOBMDPSDEVIEWID}
     * 
     * @param mobMDPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBMDPSDEVIEWID)
    public void setMobMDPSDEViewId(String mobMDPSDEViewId){
        this.set(FIELD_MOBMDPSDEVIEWID, mobMDPSDEViewId);
    }
    
    /**
     * 获取 移动端多项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getMobMDPSDEViewId(){
        Object objValue = this.get(FIELD_MOBMDPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端多项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobMDPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBMDPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端多项数据选择视图
     */
    @JsonIgnore
    public void resetMobMDPSDEViewId(){
        this.reset(FIELD_MOBMDPSDEVIEWID);
    }

    /**
     * 设置 移动端多项数据选择视图，详细说明：{@link #FIELD_MOBMDPSDEVIEWID}
     * <P>
     * 等同 {@link #setMobMDPSDEViewId}
     * @param mobMDPSDEViewId
     */
    @JsonIgnore
    public PSDER mobmdpsdeviewid(String mobMDPSDEViewId){
        this.setMobMDPSDEViewId(mobMDPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端多项数据选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobMDPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER mobmdpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobMDPSDEViewId(null);
            this.setMobMDPSDEViewName(null);
        }
        else{
            this.setMobMDPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobMDPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBMDPSDEVIEWNAME</B>&nbsp;移动端多选视图，指定引用数据在界面上需要提供多项数据选择视图时默认使用的实体视图（移动端）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBMDPSDEVIEWID}
     */
    public final static String FIELD_MOBMDPSDEVIEWNAME = "mobmdpsdeviewname";

    /**
     * 设置 移动端多选视图，详细说明：{@link #FIELD_MOBMDPSDEVIEWNAME}
     * 
     * @param mobMDPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBMDPSDEVIEWNAME)
    public void setMobMDPSDEViewName(String mobMDPSDEViewName){
        this.set(FIELD_MOBMDPSDEVIEWNAME, mobMDPSDEViewName);
    }
    
    /**
     * 获取 移动端多选视图  
     * @return
     */
    @JsonIgnore
    public String getMobMDPSDEViewName(){
        Object objValue = this.get(FIELD_MOBMDPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端多选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobMDPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBMDPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端多选视图
     */
    @JsonIgnore
    public void resetMobMDPSDEViewName(){
        this.reset(FIELD_MOBMDPSDEVIEWNAME);
    }

    /**
     * 设置 移动端多选视图，详细说明：{@link #FIELD_MOBMDPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobMDPSDEViewName}
     * @param mobMDPSDEViewName
     */
    @JsonIgnore
    public PSDER mobmdpsdeviewname(String mobMDPSDEViewName){
        this.setMobMDPSDEViewName(mobMDPSDEViewName);
        return this;
    }

    /**
     * <B>MOBSDPSDEVIEWID</B>&nbsp;移动端单选视图，指定引用数据在界面上需要提供单项数据选择视图时默认使用的实体视图（移动端）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MOBSDPSDEVIEWID = "mobsdpsdeviewid";

    /**
     * 设置 移动端单选视图，详细说明：{@link #FIELD_MOBSDPSDEVIEWID}
     * 
     * @param mobSDPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBSDPSDEVIEWID)
    public void setMobSDPSDEViewId(String mobSDPSDEViewId){
        this.set(FIELD_MOBSDPSDEVIEWID, mobSDPSDEViewId);
    }
    
    /**
     * 获取 移动端单选视图  
     * @return
     */
    @JsonIgnore
    public String getMobSDPSDEViewId(){
        Object objValue = this.get(FIELD_MOBSDPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端单选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobSDPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBSDPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端单选视图
     */
    @JsonIgnore
    public void resetMobSDPSDEViewId(){
        this.reset(FIELD_MOBSDPSDEVIEWID);
    }

    /**
     * 设置 移动端单选视图，详细说明：{@link #FIELD_MOBSDPSDEVIEWID}
     * <P>
     * 等同 {@link #setMobSDPSDEViewId}
     * @param mobSDPSDEViewId
     */
    @JsonIgnore
    public PSDER mobsdpsdeviewid(String mobSDPSDEViewId){
        this.setMobSDPSDEViewId(mobSDPSDEViewId);
        return this;
    }

    /**
     * 设置 移动端单选视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobSDPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER mobsdpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobSDPSDEViewId(null);
            this.setMobSDPSDEViewName(null);
        }
        else{
            this.setMobSDPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobSDPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MOBSDPSDEVIEWNAME</B>&nbsp;移动端单选视图，指定引用数据在界面上需要提供单项数据选择视图时默认使用的实体视图（移动端）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBSDPSDEVIEWID}
     */
    public final static String FIELD_MOBSDPSDEVIEWNAME = "mobsdpsdeviewname";

    /**
     * 设置 移动端单选视图，详细说明：{@link #FIELD_MOBSDPSDEVIEWNAME}
     * 
     * @param mobSDPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBSDPSDEVIEWNAME)
    public void setMobSDPSDEViewName(String mobSDPSDEViewName){
        this.set(FIELD_MOBSDPSDEVIEWNAME, mobSDPSDEViewName);
    }
    
    /**
     * 获取 移动端单选视图  
     * @return
     */
    @JsonIgnore
    public String getMobSDPSDEViewName(){
        Object objValue = this.get(FIELD_MOBSDPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端单选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobSDPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBSDPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端单选视图
     */
    @JsonIgnore
    public void resetMobSDPSDEViewName(){
        this.reset(FIELD_MOBSDPSDEVIEWNAME);
    }

    /**
     * 设置 移动端单选视图，详细说明：{@link #FIELD_MOBSDPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMobSDPSDEViewName}
     * @param mobSDPSDEViewName
     */
    @JsonIgnore
    public PSDER mobsdpsdeviewname(String mobSDPSDEViewName){
        this.setMobSDPSDEViewName(mobSDPSDEViewName);
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
    public PSDER ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预置类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedCodeListType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预置类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预置类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预置类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDER predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 预置类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDER predefinedtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedCodeListType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    /**
     * <B>PROPERTYMAP</B>&nbsp;参数映射
     */
    public final static String FIELD_PROPERTYMAP = "propertymap";

    /**
     * 设置 参数映射
     * 
     * @param propertyMap
     * 
     */
    @JsonProperty(FIELD_PROPERTYMAP)
    public void setPropertyMap(String propertyMap){
        this.set(FIELD_PROPERTYMAP, propertyMap);
    }
    
    /**
     * 获取 参数映射  
     * @return
     */
    @JsonIgnore
    public String getPropertyMap(){
        Object objValue = this.get(FIELD_PROPERTYMAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPropertyMapDirty(){
        if(this.contains(FIELD_PROPERTYMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数映射
     */
    @JsonIgnore
    public void resetPropertyMap(){
        this.reset(FIELD_PROPERTYMAP);
    }

    /**
     * 设置 参数映射
     * <P>
     * 等同 {@link #setPropertyMap}
     * @param propertyMap
     */
    @JsonIgnore
    public PSDER propertymap(String propertyMap){
        this.setPropertyMap(propertyMap);
        return this;
    }

    /**
     * <B>PSDEACMODEID</B>&nbsp;引用自填模式，指定引用数据在界面上需要提供自动填充功能时默认配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_PSDEACMODEID = "psdeacmodeid";

    /**
     * 设置 引用自填模式，详细说明：{@link #FIELD_PSDEACMODEID}
     * 
     * @param pSDEACModeId
     * 
     */
    @JsonProperty(FIELD_PSDEACMODEID)
    public void setPSDEACModeId(String pSDEACModeId){
        this.set(FIELD_PSDEACMODEID, pSDEACModeId);
    }
    
    /**
     * 获取 引用自填模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeId(){
        Object objValue = this.get(FIELD_PSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeIdDirty(){
        if(this.contains(FIELD_PSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用自填模式
     */
    @JsonIgnore
    public void resetPSDEACModeId(){
        this.reset(FIELD_PSDEACMODEID);
    }

    /**
     * 设置 引用自填模式，详细说明：{@link #FIELD_PSDEACMODEID}
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACModeId
     */
    @JsonIgnore
    public PSDER psdeacmodeid(String pSDEACModeId){
        this.setPSDEACModeId(pSDEACModeId);
        return this;
    }

    /**
     * 设置 引用自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDER psdeacmodeid(PSDEACMode pSDEACMode){
        if(pSDEACMode == null){
            this.setPSDEACModeId(null);
            this.setPSDEACModeName(null);
        }
        else{
            this.setPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>PSDEACMODENAME</B>&nbsp;引用自填模式，指定引用数据在界面上需要提供自动填充功能时默认配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACMODEID}
     */
    public final static String FIELD_PSDEACMODENAME = "psdeacmodename";

    /**
     * 设置 引用自填模式，详细说明：{@link #FIELD_PSDEACMODENAME}
     * 
     * @param pSDEACModeName
     * 
     */
    @JsonProperty(FIELD_PSDEACMODENAME)
    public void setPSDEACModeName(String pSDEACModeName){
        this.set(FIELD_PSDEACMODENAME, pSDEACModeName);
    }
    
    /**
     * 获取 引用自填模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEACModeName(){
        Object objValue = this.get(FIELD_PSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEACModeNameDirty(){
        if(this.contains(FIELD_PSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用自填模式
     */
    @JsonIgnore
    public void resetPSDEACModeName(){
        this.reset(FIELD_PSDEACMODENAME);
    }

    /**
     * 设置 引用自填模式，详细说明：{@link #FIELD_PSDEACMODENAME}
     * <P>
     * 等同 {@link #setPSDEACModeName}
     * @param pSDEACModeName
     */
    @JsonIgnore
    public PSDER psdeacmodename(String pSDEACModeName){
        this.setPSDEACModeName(pSDEACModeName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;引用数据集合，指定引用数据的数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 引用数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 引用数据集合  
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
     * 判断 引用数据集合 是否指定值，包括空值
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
     * 重置 引用数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 引用数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDER psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 引用数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDER psdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>PSDEDATASETNAME</B>&nbsp;引用数据集合，指定引用数据的数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 引用数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 引用数据集合  
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
     * 判断 引用数据集合 是否指定值，包括空值
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
     * 重置 引用数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 引用数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDER psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系标识
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系标识
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系标识
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDER psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;关系名称，指定实体关系的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系名称
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDER psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDERName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDERName(strName);
    }

    @JsonIgnore
    public PSDER name(String strName){
        this.setPSDERName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDER pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDER pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
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
     * 判断 动态系统模型 是否指定值，包括空值
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
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDER pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSDER pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDER pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSDER pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>REMOVEACTIONTYPE</B>&nbsp;主实体删除操作，指定主实体数据删除时从实体的操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DER1NRemoveActionType} 
     */
    public final static String FIELD_REMOVEACTIONTYPE = "removeactiontype";

    /**
     * 设置 主实体删除操作，详细说明：{@link #FIELD_REMOVEACTIONTYPE}
     * 
     * @param removeActionType
     * 
     */
    @JsonProperty(FIELD_REMOVEACTIONTYPE)
    public void setRemoveActionType(Integer removeActionType){
        this.set(FIELD_REMOVEACTIONTYPE, removeActionType);
    }
    
    /**
     * 获取 主实体删除操作  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveActionType(){
        Object objValue = this.get(FIELD_REMOVEACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主实体删除操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveActionTypeDirty(){
        if(this.contains(FIELD_REMOVEACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体删除操作
     */
    @JsonIgnore
    public void resetRemoveActionType(){
        this.reset(FIELD_REMOVEACTIONTYPE);
    }

    /**
     * 设置 主实体删除操作，详细说明：{@link #FIELD_REMOVEACTIONTYPE}
     * <P>
     * 等同 {@link #setRemoveActionType}
     * @param removeActionType
     */
    @JsonIgnore
    public PSDER removeactiontype(Integer removeActionType){
        this.setRemoveActionType(removeActionType);
        return this;
    }

     /**
     * 设置 主实体删除操作，详细说明：{@link #FIELD_REMOVEACTIONTYPE}
     * <P>
     * 等同 {@link #setRemoveActionType}
     * @param removeActionType
     */
    @JsonIgnore
    public PSDER removeactiontype(net.ibizsys.psmodel.core.util.PSModelEnums.DER1NRemoveActionType removeActionType){
        if(removeActionType == null){
            this.setRemoveActionType(null);
        }
        else{
            this.setRemoveActionType(removeActionType.value);
        }
        return this;
    }

    /**
     * <B>REMOVEORDER</B>&nbsp;删除次序，指定从实体在进行数据关联删除时的次序，按升序处理
     */
    public final static String FIELD_REMOVEORDER = "removeorder";

    /**
     * 设置 删除次序，详细说明：{@link #FIELD_REMOVEORDER}
     * 
     * @param removeOrder
     * 
     */
    @JsonProperty(FIELD_REMOVEORDER)
    public void setRemoveOrder(Integer removeOrder){
        this.set(FIELD_REMOVEORDER, removeOrder);
    }
    
    /**
     * 获取 删除次序  
     * @return
     */
    @JsonIgnore
    public Integer getRemoveOrder(){
        Object objValue = this.get(FIELD_REMOVEORDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 删除次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveOrderDirty(){
        if(this.contains(FIELD_REMOVEORDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除次序
     */
    @JsonIgnore
    public void resetRemoveOrder(){
        this.reset(FIELD_REMOVEORDER);
    }

    /**
     * 设置 删除次序，详细说明：{@link #FIELD_REMOVEORDER}
     * <P>
     * 等同 {@link #setRemoveOrder}
     * @param removeOrder
     */
    @JsonIgnore
    public PSDER removeorder(Integer removeOrder){
        this.setRemoveOrder(removeOrder);
        return this;
    }

    /**
     * <B>REMOVEREJECTMSG</B>&nbsp;删除拒绝消息，指定限制主实体进行数据时的提示信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_REMOVEREJECTMSG = "removerejectmsg";

    /**
     * 设置 删除拒绝消息，详细说明：{@link #FIELD_REMOVEREJECTMSG}
     * 
     * @param removeRejectMsg
     * 
     */
    @JsonProperty(FIELD_REMOVEREJECTMSG)
    public void setRemoveRejectMsg(String removeRejectMsg){
        this.set(FIELD_REMOVEREJECTMSG, removeRejectMsg);
    }
    
    /**
     * 获取 删除拒绝消息  
     * @return
     */
    @JsonIgnore
    public String getRemoveRejectMsg(){
        Object objValue = this.get(FIELD_REMOVEREJECTMSG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除拒绝消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveRejectMsgDirty(){
        if(this.contains(FIELD_REMOVEREJECTMSG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除拒绝消息
     */
    @JsonIgnore
    public void resetRemoveRejectMsg(){
        this.reset(FIELD_REMOVEREJECTMSG);
    }

    /**
     * 设置 删除拒绝消息，详细说明：{@link #FIELD_REMOVEREJECTMSG}
     * <P>
     * 等同 {@link #setRemoveRejectMsg}
     * @param removeRejectMsg
     */
    @JsonIgnore
    public PSDER removerejectmsg(String removeRejectMsg){
        this.setRemoveRejectMsg(removeRejectMsg);
        return this;
    }

    /**
     * <B>REMOVEREJECTPSLANRESID</B>&nbsp;删除拒绝消息语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_REMOVEREJECTPSLANRESID = "removerejectpslanresid";

    /**
     * 设置 删除拒绝消息语言资源
     * 
     * @param removeRejectPSLanResId
     * 
     */
    @JsonProperty(FIELD_REMOVEREJECTPSLANRESID)
    public void setRemoveRejectPSLanResId(String removeRejectPSLanResId){
        this.set(FIELD_REMOVEREJECTPSLANRESID, removeRejectPSLanResId);
    }
    
    /**
     * 获取 删除拒绝消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getRemoveRejectPSLanResId(){
        Object objValue = this.get(FIELD_REMOVEREJECTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除拒绝消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveRejectPSLanResIdDirty(){
        if(this.contains(FIELD_REMOVEREJECTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除拒绝消息语言资源
     */
    @JsonIgnore
    public void resetRemoveRejectPSLanResId(){
        this.reset(FIELD_REMOVEREJECTPSLANRESID);
    }

    /**
     * 设置 删除拒绝消息语言资源
     * <P>
     * 等同 {@link #setRemoveRejectPSLanResId}
     * @param removeRejectPSLanResId
     */
    @JsonIgnore
    public PSDER removerejectpslanresid(String removeRejectPSLanResId){
        this.setRemoveRejectPSLanResId(removeRejectPSLanResId);
        return this;
    }

    /**
     * 设置 删除拒绝消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRemoveRejectPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDER removerejectpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setRemoveRejectPSLanResId(null);
            this.setRemoveRejectPSLanResName(null);
        }
        else{
            this.setRemoveRejectPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setRemoveRejectPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>REMOVEREJECTPSLANRESNAME</B>&nbsp;删除拒绝消息语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REMOVEREJECTPSLANRESID}
     */
    public final static String FIELD_REMOVEREJECTPSLANRESNAME = "removerejectpslanresname";

    /**
     * 设置 删除拒绝消息语言资源
     * 
     * @param removeRejectPSLanResName
     * 
     */
    @JsonProperty(FIELD_REMOVEREJECTPSLANRESNAME)
    public void setRemoveRejectPSLanResName(String removeRejectPSLanResName){
        this.set(FIELD_REMOVEREJECTPSLANRESNAME, removeRejectPSLanResName);
    }
    
    /**
     * 获取 删除拒绝消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getRemoveRejectPSLanResName(){
        Object objValue = this.get(FIELD_REMOVEREJECTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 删除拒绝消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoveRejectPSLanResNameDirty(){
        if(this.contains(FIELD_REMOVEREJECTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 删除拒绝消息语言资源
     */
    @JsonIgnore
    public void resetRemoveRejectPSLanResName(){
        this.reset(FIELD_REMOVEREJECTPSLANRESNAME);
    }

    /**
     * 设置 删除拒绝消息语言资源
     * <P>
     * 等同 {@link #setRemoveRejectPSLanResName}
     * @param removeRejectPSLanResName
     */
    @JsonIgnore
    public PSDER removerejectpslanresname(String removeRejectPSLanResName){
        this.setRemoveRejectPSLanResName(removeRejectPSLanResName);
        return this;
    }

    /**
     * <B>RSPSDEVIEWID</B>&nbsp;关系数据展现视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_RSPSDEVIEWID = "rspsdeviewid";

    /**
     * 设置 关系数据展现视图
     * 
     * @param rSPSDEViewId
     * 
     */
    @JsonProperty(FIELD_RSPSDEVIEWID)
    public void setRSPSDEViewId(String rSPSDEViewId){
        this.set(FIELD_RSPSDEVIEWID, rSPSDEViewId);
    }
    
    /**
     * 获取 关系数据展现视图  
     * @return
     */
    @JsonIgnore
    public String getRSPSDEViewId(){
        Object objValue = this.get(FIELD_RSPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSPSDEViewIdDirty(){
        if(this.contains(FIELD_RSPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据展现视图
     */
    @JsonIgnore
    public void resetRSPSDEViewId(){
        this.reset(FIELD_RSPSDEVIEWID);
    }

    /**
     * 设置 关系数据展现视图
     * <P>
     * 等同 {@link #setRSPSDEViewId}
     * @param rSPSDEViewId
     */
    @JsonIgnore
    public PSDER rspsdeviewid(String rSPSDEViewId){
        this.setRSPSDEViewId(rSPSDEViewId);
        return this;
    }

    /**
     * 设置 关系数据展现视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRSPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER rspsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRSPSDEViewId(null);
            this.setRSPSDEViewName(null);
        }
        else{
            this.setRSPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRSPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>RSPSDEVIEWNAME</B>&nbsp;关系数据展现视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RSPSDEVIEWID}
     */
    public final static String FIELD_RSPSDEVIEWNAME = "rspsdeviewname";

    /**
     * 设置 关系数据展现视图
     * 
     * @param rSPSDEViewName
     * 
     */
    @JsonProperty(FIELD_RSPSDEVIEWNAME)
    public void setRSPSDEViewName(String rSPSDEViewName){
        this.set(FIELD_RSPSDEVIEWNAME, rSPSDEViewName);
    }
    
    /**
     * 获取 关系数据展现视图  
     * @return
     */
    @JsonIgnore
    public String getRSPSDEViewName(){
        Object objValue = this.get(FIELD_RSPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSPSDEViewNameDirty(){
        if(this.contains(FIELD_RSPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据展现视图
     */
    @JsonIgnore
    public void resetRSPSDEViewName(){
        this.reset(FIELD_RSPSDEVIEWNAME);
    }

    /**
     * 设置 关系数据展现视图
     * <P>
     * 等同 {@link #setRSPSDEViewName}
     * @param rSPSDEViewName
     */
    @JsonIgnore
    public PSDER rspsdeviewname(String rSPSDEViewName){
        this.setRSPSDEViewName(rSPSDEViewName);
        return this;
    }

    /**
     * <B>SDPSDEVIEWID</B>&nbsp;单项数据选择视图，指定引用数据在界面上需要提供单项数据选择视图时默认使用的实体视图（网页端）
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_SDPSDEVIEWID = "sdpsdeviewid";

    /**
     * 设置 单项数据选择视图，详细说明：{@link #FIELD_SDPSDEVIEWID}
     * 
     * @param sDPSDEViewID
     * 
     */
    @JsonProperty(FIELD_SDPSDEVIEWID)
    public void setSDPSDEViewID(String sDPSDEViewID){
        this.set(FIELD_SDPSDEVIEWID, sDPSDEViewID);
    }
    
    /**
     * 获取 单项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getSDPSDEViewID(){
        Object objValue = this.get(FIELD_SDPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDPSDEViewIDDirty(){
        if(this.contains(FIELD_SDPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单项数据选择视图
     */
    @JsonIgnore
    public void resetSDPSDEViewID(){
        this.reset(FIELD_SDPSDEVIEWID);
    }

    /**
     * 设置 单项数据选择视图，详细说明：{@link #FIELD_SDPSDEVIEWID}
     * <P>
     * 等同 {@link #setSDPSDEViewID}
     * @param sDPSDEViewID
     */
    @JsonIgnore
    public PSDER sdpsdeviewid(String sDPSDEViewID){
        this.setSDPSDEViewID(sDPSDEViewID);
        return this;
    }

    /**
     * 设置 单项数据选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSDPSDEViewID}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDER sdpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setSDPSDEViewID(null);
            this.setSDPSDEViewName(null);
        }
        else{
            this.setSDPSDEViewID(pSDEViewBase.getPSDEViewBaseId());
            this.setSDPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>SDPSDEVIEWNAME</B>&nbsp;单项数据选择视图，指定引用数据在界面上需要提供单项数据选择视图时默认使用的实体视图（网页端）
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SDPSDEVIEWID}
     */
    public final static String FIELD_SDPSDEVIEWNAME = "sdpsdeviewname";

    /**
     * 设置 单项数据选择视图，详细说明：{@link #FIELD_SDPSDEVIEWNAME}
     * 
     * @param sDPSDEViewName
     * 
     */
    @JsonProperty(FIELD_SDPSDEVIEWNAME)
    public void setSDPSDEViewName(String sDPSDEViewName){
        this.set(FIELD_SDPSDEVIEWNAME, sDPSDEViewName);
    }
    
    /**
     * 获取 单项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getSDPSDEViewName(){
        Object objValue = this.get(FIELD_SDPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDPSDEViewNameDirty(){
        if(this.contains(FIELD_SDPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单项数据选择视图
     */
    @JsonIgnore
    public void resetSDPSDEViewName(){
        this.reset(FIELD_SDPSDEVIEWNAME);
    }

    /**
     * 设置 单项数据选择视图，详细说明：{@link #FIELD_SDPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setSDPSDEViewName}
     * @param sDPSDEViewName
     */
    @JsonIgnore
    public PSDER sdpsdeviewname(String sDPSDEViewName){
        this.setSDPSDEViewName(sDPSDEViewName);
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;主关系服务代码名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 主关系服务代码名称
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 主关系服务代码名称  
     * @return
     */
    @JsonIgnore
    public String getServiceCodeName(){
        Object objValue = this.get(FIELD_SERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主关系服务代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceCodeNameDirty(){
        if(this.contains(FIELD_SERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主关系服务代码名称
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 主关系服务代码名称
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSDER servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>SYNCEXPORTMODEL</B>&nbsp;同步模型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERDataSyncAction} 
     */
    public final static String FIELD_SYNCEXPORTMODEL = "syncexportmodel";

    /**
     * 设置 同步模型
     * 
     * @param syncExportModel
     * 
     */
    @JsonProperty(FIELD_SYNCEXPORTMODEL)
    public void setSyncExportModel(Integer syncExportModel){
        this.set(FIELD_SYNCEXPORTMODEL, syncExportModel);
    }
    
    /**
     * 获取 同步模型  
     * @return
     */
    @JsonIgnore
    public Integer getSyncExportModel(){
        Object objValue = this.get(FIELD_SYNCEXPORTMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 同步模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncExportModelDirty(){
        if(this.contains(FIELD_SYNCEXPORTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步模型
     */
    @JsonIgnore
    public void resetSyncExportModel(){
        this.reset(FIELD_SYNCEXPORTMODEL);
    }

    /**
     * 设置 同步模型
     * <P>
     * 等同 {@link #setSyncExportModel}
     * @param syncExportModel
     */
    @JsonIgnore
    public PSDER syncexportmodel(Integer syncExportModel){
        this.setSyncExportModel(syncExportModel);
        return this;
    }

     /**
     * 设置 同步模型
     * <P>
     * 等同 {@link #setSyncExportModel}
     * @param syncExportModel
     */
    @JsonIgnore
    public PSDER syncexportmodel(net.ibizsys.psmodel.core.util.PSModelEnums.DERDataSyncAction syncExportModel){
        if(syncExportModel == null){
            this.setSyncExportModel(null);
        }
        else{
            this.setSyncExportModel(syncExportModel.value);
        }
        return this;
    }

    /**
     * <B>TEMPORDERVALUE</B>&nbsp;临时数据关系，指定实体关系的临时数据处理模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_TEMPORDERVALUE = "tempordervalue";

    /**
     * 设置 临时数据关系，详细说明：{@link #FIELD_TEMPORDERVALUE}
     * 
     * @param tempOrderValue
     * 
     */
    @JsonProperty(FIELD_TEMPORDERVALUE)
    public void setTempOrderValue(Integer tempOrderValue){
        this.set(FIELD_TEMPORDERVALUE, tempOrderValue);
    }
    
    /**
     * 获取 临时数据关系  
     * @return
     */
    @JsonIgnore
    public Integer getTempOrderValue(){
        Object objValue = this.get(FIELD_TEMPORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 临时数据关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTempOrderValueDirty(){
        if(this.contains(FIELD_TEMPORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 临时数据关系
     */
    @JsonIgnore
    public void resetTempOrderValue(){
        this.reset(FIELD_TEMPORDERVALUE);
    }

    /**
     * 设置 临时数据关系，详细说明：{@link #FIELD_TEMPORDERVALUE}
     * <P>
     * 等同 {@link #setTempOrderValue}
     * @param tempOrderValue
     */
    @JsonIgnore
    public PSDER tempordervalue(Integer tempOrderValue){
        this.setTempOrderValue(tempOrderValue);
        return this;
    }

     /**
     * 设置 临时数据关系，详细说明：{@link #FIELD_TEMPORDERVALUE}
     * <P>
     * 等同 {@link #setTempOrderValue}
     * @param tempOrderValue
     */
    @JsonIgnore
    public PSDER tempordervalue(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel tempOrderValue){
        if(tempOrderValue == null){
            this.setTempOrderValue(null);
        }
        else{
            this.setTempOrderValue(tempOrderValue.value);
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
    public PSDER updatedate(String updateDate){
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
    public PSDER updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEPHSICALDEFIELD</B>&nbsp;更新物理化更新属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UPDATEPHSICALDEFIELD = "updatephsicaldefield";

    /**
     * 设置 更新物理化更新属性
     * 
     * @param updatePhsicalDEField
     * 
     */
    @JsonProperty(FIELD_UPDATEPHSICALDEFIELD)
    public void setUpdatePhsicalDEField(Integer updatePhsicalDEField){
        this.set(FIELD_UPDATEPHSICALDEFIELD, updatePhsicalDEField);
        //属性名称与代码标识不一致，设置属性名称
        this.set("updatephysicaldefield", updatePhsicalDEField);
    }
    
    /**
     * 获取 更新物理化更新属性  
     * @return
     */
    @JsonIgnore
    public Integer getUpdatePhsicalDEField(){
        Object objValue = this.get(FIELD_UPDATEPHSICALDEFIELD);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("updatephysicaldefield");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 更新物理化更新属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdatePhsicalDEFieldDirty(){
        if(this.contains(FIELD_UPDATEPHSICALDEFIELD)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("updatephysicaldefield")){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新物理化更新属性
     */
    @JsonIgnore
    public void resetUpdatePhsicalDEField(){
        this.reset(FIELD_UPDATEPHSICALDEFIELD);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("updatephysicaldefield");
    }

    /**
     * 设置 更新物理化更新属性
     * <P>
     * 等同 {@link #setUpdatePhsicalDEField}
     * @param updatePhsicalDEField
     */
    @JsonIgnore
    public PSDER updatephsicaldefield(Integer updatePhsicalDEField){
        this.setUpdatePhsicalDEField(updatePhsicalDEField);
        return this;
    }

     /**
     * 设置 更新物理化更新属性
     * <P>
     * 等同 {@link #setUpdatePhsicalDEField}
     * @param updatePhsicalDEField
     */
    @JsonIgnore
    public PSDER updatephsicaldefield(Boolean updatePhsicalDEField){
        if(updatePhsicalDEField == null){
            this.setUpdatePhsicalDEField(null);
        }
        else{
            this.setUpdatePhsicalDEField(updatePhsicalDEField?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDER usercat(String userCat){
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
    public PSDER usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDER userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDER usertag(String userTag){
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
    public PSDER usertag2(String userTag2){
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
    public PSDER usertag3(String userTag3){
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
    public PSDER usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDER validflag(Integer validFlag){
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
    public PSDER validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDERId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDERId(strValue);
    }

    @JsonIgnore
    public PSDER id(String strValue){
        this.setPSDERId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDER){
            PSDER model = (PSDER)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
