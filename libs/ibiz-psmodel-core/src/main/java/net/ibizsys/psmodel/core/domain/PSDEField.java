package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFIELD</B>实体属性 模型传输对象
 * <P>
 * 实体属性的模型，定义属性的基本信息，包括了类型、基础值规则、关系引用、值处理等
 */
public class PSDEField extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEField(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许空值，是否允许空值输入，空值输入检查由业务层处理
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许空值，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许空值  
     * @return
     */
    @JsonIgnore
    public Integer getAllowEmpty(){
        Object objValue = this.get(FIELD_ALLOWEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许空值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowEmptyDirty(){
        if(this.contains(FIELD_ALLOWEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许空值
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许空值，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEField allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许空值，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDEField allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>AUDITINFOFORMAT</B>&nbsp;审计信息格式
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_AUDITINFOFORMAT = "auditinfoformat";

    /**
     * 设置 审计信息格式
     * 
     * @param auditInfoFormat
     * 
     */
    @JsonProperty(FIELD_AUDITINFOFORMAT)
    public void setAuditInfoFormat(String auditInfoFormat){
        this.set(FIELD_AUDITINFOFORMAT, auditInfoFormat);
    }
    
    /**
     * 获取 审计信息格式  
     * @return
     */
    @JsonIgnore
    public String getAuditInfoFormat(){
        Object objValue = this.get(FIELD_AUDITINFOFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 审计信息格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAuditInfoFormatDirty(){
        if(this.contains(FIELD_AUDITINFOFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 审计信息格式
     */
    @JsonIgnore
    public void resetAuditInfoFormat(){
        this.reset(FIELD_AUDITINFOFORMAT);
    }

    /**
     * 设置 审计信息格式
     * <P>
     * 等同 {@link #setAuditInfoFormat}
     * @param auditInfoFormat
     */
    @JsonIgnore
    public PSDEField auditinfoformat(String auditInfoFormat){
        this.setAuditInfoFormat(auditInfoFormat);
        return this;
    }

    /**
     * <B>BIZTAG</B>&nbsp;业务标记，指定属性在实体中承担的业务功能
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFBizTag} 
     */
    public final static String FIELD_BIZTAG = "biztag";

    /**
     * 设置 业务标记，详细说明：{@link #FIELD_BIZTAG}
     * 
     * @param bizTag
     * 
     */
    @JsonProperty(FIELD_BIZTAG)
    public void setBizTag(String bizTag){
        this.set(FIELD_BIZTAG, bizTag);
    }
    
    /**
     * 获取 业务标记  
     * @return
     */
    @JsonIgnore
    public String getBizTag(){
        Object objValue = this.get(FIELD_BIZTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBizTagDirty(){
        if(this.contains(FIELD_BIZTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务标记
     */
    @JsonIgnore
    public void resetBizTag(){
        this.reset(FIELD_BIZTAG);
    }

    /**
     * 设置 业务标记，详细说明：{@link #FIELD_BIZTAG}
     * <P>
     * 等同 {@link #setBizTag}
     * @param bizTag
     */
    @JsonIgnore
    public PSDEField biztag(String bizTag){
        this.setBizTag(bizTag);
        return this;
    }

     /**
     * 设置 业务标记，详细说明：{@link #FIELD_BIZTAG}
     * <P>
     * 等同 {@link #setBizTag}
     * @param bizTag
     */
    @JsonIgnore
    public PSDEField biztag(net.ibizsys.psmodel.core.util.PSModelEnums.DEFBizTag bizTag){
        if(bizTag == null){
            this.setBizTag(null);
        }
        else{
            this.setBizTag(bizTag.value);
        }
        return this;
    }

    /**
     * <B>CHECKRECURSION</B>&nbsp;检查递归，对实体自关系的连接属性是否进行递归检查，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CHECKRECURSION = "checkrecursion";

    /**
     * 设置 检查递归，详细说明：{@link #FIELD_CHECKRECURSION}
     * 
     * @param checkRecursion
     * 
     */
    @JsonProperty(FIELD_CHECKRECURSION)
    public void setCheckRecursion(Integer checkRecursion){
        this.set(FIELD_CHECKRECURSION, checkRecursion);
    }
    
    /**
     * 获取 检查递归  
     * @return
     */
    @JsonIgnore
    public Integer getCheckRecursion(){
        Object objValue = this.get(FIELD_CHECKRECURSION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 检查递归 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCheckRecursionDirty(){
        if(this.contains(FIELD_CHECKRECURSION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检查递归
     */
    @JsonIgnore
    public void resetCheckRecursion(){
        this.reset(FIELD_CHECKRECURSION);
    }

    /**
     * 设置 检查递归，详细说明：{@link #FIELD_CHECKRECURSION}
     * <P>
     * 等同 {@link #setCheckRecursion}
     * @param checkRecursion
     */
    @JsonIgnore
    public PSDEField checkrecursion(Integer checkRecursion){
        this.setCheckRecursion(checkRecursion);
        return this;
    }

     /**
     * 设置 检查递归，详细说明：{@link #FIELD_CHECKRECURSION}
     * <P>
     * 等同 {@link #setCheckRecursion}
     * @param checkRecursion
     */
    @JsonIgnore
    public PSDEField checkrecursion(Boolean checkRecursion){
        if(checkRecursion == null){
            this.setCheckRecursion(null);
        }
        else{
            this.setCheckRecursion(checkRecursion?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，代码标识，需在所在的实体中具有唯一性
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
    public PSDEField codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COMPUTEEXP</B>&nbsp;值计算表达式
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_COMPUTEEXP = "computeexp";

    /**
     * 设置 值计算表达式
     * 
     * @param computeExp
     * 
     */
    @JsonProperty(FIELD_COMPUTEEXP)
    public void setComputeExp(String computeExp){
        this.set(FIELD_COMPUTEEXP, computeExp);
    }
    
    /**
     * 获取 值计算表达式  
     * @return
     */
    @JsonIgnore
    public String getComputeExp(){
        Object objValue = this.get(FIELD_COMPUTEEXP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值计算表达式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isComputeExpDirty(){
        if(this.contains(FIELD_COMPUTEEXP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值计算表达式
     */
    @JsonIgnore
    public void resetComputeExp(){
        this.reset(FIELD_COMPUTEEXP);
    }

    /**
     * 设置 值计算表达式
     * <P>
     * 等同 {@link #setComputeExp}
     * @param computeExp
     */
    @JsonIgnore
    public PSDEField computeexp(String computeExp){
        this.setComputeExp(computeExp);
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
    public PSDEField createdate(String createDate){
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
    public PSDEField createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMEXPORTSCOPE</B>&nbsp;自定义导出范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMEXPORTSCOPE = "customexportscope";

    /**
     * 设置 自定义导出范围
     * 
     * @param customExportScope
     * 
     */
    @JsonProperty(FIELD_CUSTOMEXPORTSCOPE)
    public void setCustomExportScope(Integer customExportScope){
        this.set(FIELD_CUSTOMEXPORTSCOPE, customExportScope);
    }
    
    /**
     * 获取 自定义导出范围  
     * @return
     */
    @JsonIgnore
    public Integer getCustomExportScope(){
        Object objValue = this.get(FIELD_CUSTOMEXPORTSCOPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomExportScopeDirty(){
        if(this.contains(FIELD_CUSTOMEXPORTSCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出范围
     */
    @JsonIgnore
    public void resetCustomExportScope(){
        this.reset(FIELD_CUSTOMEXPORTSCOPE);
    }

    /**
     * 设置 自定义导出范围
     * <P>
     * 等同 {@link #setCustomExportScope}
     * @param customExportScope
     */
    @JsonIgnore
    public PSDEField customexportscope(Integer customExportScope){
        this.setCustomExportScope(customExportScope);
        return this;
    }

     /**
     * 设置 自定义导出范围
     * <P>
     * 等同 {@link #setCustomExportScope}
     * @param customExportScope
     */
    @JsonIgnore
    public PSDEField customexportscope(Boolean customExportScope){
        if(customExportScope == null){
            this.setCustomExportScope(null);
        }
        else{
            this.setCustomExportScope(customExportScope?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DBVALUEMODE</B>&nbsp;数据库更新值模式，指定属性在关系数据库中的值更新模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBValueMode} 
     */
    public final static String FIELD_DBVALUEMODE = "dbvaluemode";

    /**
     * 设置 数据库更新值模式，详细说明：{@link #FIELD_DBVALUEMODE}
     * 
     * @param dBValueMode
     * 
     */
    @JsonProperty(FIELD_DBVALUEMODE)
    public void setDBValueMode(String dBValueMode){
        this.set(FIELD_DBVALUEMODE, dBValueMode);
    }
    
    /**
     * 获取 数据库更新值模式  
     * @return
     */
    @JsonIgnore
    public String getDBValueMode(){
        Object objValue = this.get(FIELD_DBVALUEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库更新值模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBValueModeDirty(){
        if(this.contains(FIELD_DBVALUEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库更新值模式
     */
    @JsonIgnore
    public void resetDBValueMode(){
        this.reset(FIELD_DBVALUEMODE);
    }

    /**
     * 设置 数据库更新值模式，详细说明：{@link #FIELD_DBVALUEMODE}
     * <P>
     * 等同 {@link #setDBValueMode}
     * @param dBValueMode
     */
    @JsonIgnore
    public PSDEField dbvaluemode(String dBValueMode){
        this.setDBValueMode(dBValueMode);
        return this;
    }

     /**
     * 设置 数据库更新值模式，详细说明：{@link #FIELD_DBVALUEMODE}
     * <P>
     * 等同 {@link #setDBValueMode}
     * @param dBValueMode
     */
    @JsonIgnore
    public PSDEField dbvaluemode(net.ibizsys.psmodel.core.util.PSModelEnums.DBValueMode dBValueMode){
        if(dBValueMode == null){
            this.setDBValueMode(null);
        }
        else{
            this.setDBValueMode(dBValueMode.value);
        }
        return this;
    }

    /**
     * <B>DBVALUEMODE2</B>&nbsp;数据库新建值模式，指定属性在关系数据库中的值插入模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBValueMode} 
     */
    public final static String FIELD_DBVALUEMODE2 = "dbvaluemode2";

    /**
     * 设置 数据库新建值模式，详细说明：{@link #FIELD_DBVALUEMODE2}
     * 
     * @param dBValueMode2
     * 
     */
    @JsonProperty(FIELD_DBVALUEMODE2)
    public void setDBValueMode2(String dBValueMode2){
        this.set(FIELD_DBVALUEMODE2, dBValueMode2);
    }
    
    /**
     * 获取 数据库新建值模式  
     * @return
     */
    @JsonIgnore
    public String getDBValueMode2(){
        Object objValue = this.get(FIELD_DBVALUEMODE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库新建值模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBValueMode2Dirty(){
        if(this.contains(FIELD_DBVALUEMODE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库新建值模式
     */
    @JsonIgnore
    public void resetDBValueMode2(){
        this.reset(FIELD_DBVALUEMODE2);
    }

    /**
     * 设置 数据库新建值模式，详细说明：{@link #FIELD_DBVALUEMODE2}
     * <P>
     * 等同 {@link #setDBValueMode2}
     * @param dBValueMode2
     */
    @JsonIgnore
    public PSDEField dbvaluemode2(String dBValueMode2){
        this.setDBValueMode2(dBValueMode2);
        return this;
    }

     /**
     * 设置 数据库新建值模式，详细说明：{@link #FIELD_DBVALUEMODE2}
     * <P>
     * 等同 {@link #setDBValueMode2}
     * @param dBValueMode2
     */
    @JsonIgnore
    public PSDEField dbvaluemode2(net.ibizsys.psmodel.core.util.PSModelEnums.DBValueMode dBValueMode2){
        if(dBValueMode2 == null){
            this.setDBValueMode2(null);
        }
        else{
            this.setDBValueMode2(dBValueMode2.value);
        }
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值，如指定【默认值类型】则作为默认值类型的参数，否则为直接默认值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDEField defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DEFTYPE</B>&nbsp;属性类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFType} 
     */
    public final static String FIELD_DEFTYPE = "deftype";

    /**
     * 设置 属性类型
     * 
     * @param dEFType
     * 
     */
    @JsonProperty(FIELD_DEFTYPE)
    public void setDEFType(Integer dEFType){
        this.set(FIELD_DEFTYPE, dEFType);
    }
    
    /**
     * 获取 属性类型  
     * @return
     */
    @JsonIgnore
    public Integer getDEFType(){
        Object objValue = this.get(FIELD_DEFTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 属性类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFTypeDirty(){
        if(this.contains(FIELD_DEFTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性类型
     */
    @JsonIgnore
    public void resetDEFType(){
        this.reset(FIELD_DEFTYPE);
    }

    /**
     * 设置 属性类型
     * <P>
     * 等同 {@link #setDEFType}
     * @param dEFType
     */
    @JsonIgnore
    public PSDEField deftype(Integer dEFType){
        this.setDEFType(dEFType);
        return this;
    }

     /**
     * 设置 属性类型
     * <P>
     * 等同 {@link #setDEFType}
     * @param dEFType
     */
    @JsonIgnore
    public PSDEField deftype(net.ibizsys.psmodel.core.util.PSModelEnums.DEFType dEFType){
        if(dEFType == null){
            this.setDEFType(null);
        }
        else{
            this.setDEFType(dEFType.value);
        }
        return this;
    }

    /**
     * <B>DERPSDEFID</B>&nbsp;关系属性，引用的关系属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DERPSDEFID = "derpsdefid";

    /**
     * 设置 关系属性，详细说明：{@link #FIELD_DERPSDEFID}
     * 
     * @param dERPSDEFId
     * 
     */
    @JsonProperty(FIELD_DERPSDEFID)
    public void setDERPSDEFId(String dERPSDEFId){
        this.set(FIELD_DERPSDEFID, dERPSDEFId);
    }
    
    /**
     * 获取 关系属性  
     * @return
     */
    @JsonIgnore
    public String getDERPSDEFId(){
        Object objValue = this.get(FIELD_DERPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERPSDEFIdDirty(){
        if(this.contains(FIELD_DERPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系属性
     */
    @JsonIgnore
    public void resetDERPSDEFId(){
        this.reset(FIELD_DERPSDEFID);
    }

    /**
     * 设置 关系属性，详细说明：{@link #FIELD_DERPSDEFID}
     * <P>
     * 等同 {@link #setDERPSDEFId}
     * @param dERPSDEFId
     */
    @JsonIgnore
    public PSDEField derpsdefid(String dERPSDEFId){
        this.setDERPSDEFId(dERPSDEFId);
        return this;
    }

    /**
     * 设置 关系属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDERPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEField derpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDERPSDEFId(null);
            this.setDERPSDEFName(null);
        }
        else{
            this.setDERPSDEFId(pSDEField.getPSDEFieldId());
            this.setDERPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DERPSDEFNAME</B>&nbsp;关系属性，引用的关系属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DERPSDEFID}
     */
    public final static String FIELD_DERPSDEFNAME = "derpsdefname";

    /**
     * 设置 关系属性，详细说明：{@link #FIELD_DERPSDEFNAME}
     * 
     * @param dERPSDEFName
     * 
     */
    @JsonProperty(FIELD_DERPSDEFNAME)
    public void setDERPSDEFName(String dERPSDEFName){
        this.set(FIELD_DERPSDEFNAME, dERPSDEFName);
    }
    
    /**
     * 获取 关系属性  
     * @return
     */
    @JsonIgnore
    public String getDERPSDEFName(){
        Object objValue = this.get(FIELD_DERPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERPSDEFNameDirty(){
        if(this.contains(FIELD_DERPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系属性
     */
    @JsonIgnore
    public void resetDERPSDEFName(){
        this.reset(FIELD_DERPSDEFNAME);
    }

    /**
     * 设置 关系属性，详细说明：{@link #FIELD_DERPSDEFNAME}
     * <P>
     * 等同 {@link #setDERPSDEFName}
     * @param dERPSDEFName
     */
    @JsonIgnore
    public PSDEField derpsdefname(String dERPSDEFName){
        this.setDERPSDEFName(dERPSDEFName);
        return this;
    }

    /**
     * <B>DUPCHECKMODE</B>&nbsp;重复值检查，属性重复值检查模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFDupCheckMode} 
     */
    public final static String FIELD_DUPCHECKMODE = "dupcheckmode";

    /**
     * 设置 重复值检查，详细说明：{@link #FIELD_DUPCHECKMODE}
     * 
     * @param dupCheckMode
     * 
     */
    @JsonProperty(FIELD_DUPCHECKMODE)
    public void setDupCheckMode(String dupCheckMode){
        this.set(FIELD_DUPCHECKMODE, dupCheckMode);
    }
    
    /**
     * 获取 重复值检查  
     * @return
     */
    @JsonIgnore
    public String getDupCheckMode(){
        Object objValue = this.get(FIELD_DUPCHECKMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 重复值检查 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDupCheckModeDirty(){
        if(this.contains(FIELD_DUPCHECKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重复值检查
     */
    @JsonIgnore
    public void resetDupCheckMode(){
        this.reset(FIELD_DUPCHECKMODE);
    }

    /**
     * 设置 重复值检查，详细说明：{@link #FIELD_DUPCHECKMODE}
     * <P>
     * 等同 {@link #setDupCheckMode}
     * @param dupCheckMode
     */
    @JsonIgnore
    public PSDEField dupcheckmode(String dupCheckMode){
        this.setDupCheckMode(dupCheckMode);
        return this;
    }

     /**
     * 设置 重复值检查，详细说明：{@link #FIELD_DUPCHECKMODE}
     * <P>
     * 等同 {@link #setDupCheckMode}
     * @param dupCheckMode
     */
    @JsonIgnore
    public PSDEField dupcheckmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFDupCheckMode dupCheckMode){
        if(dupCheckMode == null){
            this.setDupCheckMode(null);
        }
        else{
            this.setDupCheckMode(dupCheckMode.value);
        }
        return this;
    }

    /**
     * <B>DUPCHECKVALUES</B>&nbsp;检查值范围，重复值检查模式为【指定值范围】时指定检查的值范围，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 400
     */
    public final static String FIELD_DUPCHECKVALUES = "dupcheckvalues";

    /**
     * 设置 检查值范围，详细说明：{@link #FIELD_DUPCHECKVALUES}
     * 
     * @param dupCheckValues
     * 
     */
    @JsonProperty(FIELD_DUPCHECKVALUES)
    public void setDupCheckValues(String dupCheckValues){
        this.set(FIELD_DUPCHECKVALUES, dupCheckValues);
    }
    
    /**
     * 获取 检查值范围  
     * @return
     */
    @JsonIgnore
    public String getDupCheckValues(){
        Object objValue = this.get(FIELD_DUPCHECKVALUES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检查值范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDupCheckValuesDirty(){
        if(this.contains(FIELD_DUPCHECKVALUES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检查值范围
     */
    @JsonIgnore
    public void resetDupCheckValues(){
        this.reset(FIELD_DUPCHECKVALUES);
    }

    /**
     * 设置 检查值范围，详细说明：{@link #FIELD_DUPCHECKVALUES}
     * <P>
     * 等同 {@link #setDupCheckValues}
     * @param dupCheckValues
     */
    @JsonIgnore
    public PSDEField dupcheckvalues(String dupCheckValues){
        this.setDupCheckValues(dupCheckValues);
        return this;
    }

    /**
     * <B>DUPCHECKPSDEFID</B>&nbsp;范围属性，属性启用重复值检查时指定检查的范围属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DUPCHECKPSDEFID = "dupcheckpsdefid";

    /**
     * 设置 范围属性，详细说明：{@link #FIELD_DUPCHECKPSDEFID}
     * 
     * @param dupCheckPSDEFId
     * 
     */
    @JsonProperty(FIELD_DUPCHECKPSDEFID)
    public void setDupCheckPSDEFId(String dupCheckPSDEFId){
        this.set(FIELD_DUPCHECKPSDEFID, dupCheckPSDEFId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("dupchkpsdefid", dupCheckPSDEFId);
    }
    
    /**
     * 获取 范围属性  
     * @return
     */
    @JsonIgnore
    public String getDupCheckPSDEFId(){
        Object objValue = this.get(FIELD_DUPCHECKPSDEFID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("dupchkpsdefid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 范围属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDupCheckPSDEFIdDirty(){
        if(this.contains(FIELD_DUPCHECKPSDEFID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("dupchkpsdefid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 范围属性
     */
    @JsonIgnore
    public void resetDupCheckPSDEFId(){
        this.reset(FIELD_DUPCHECKPSDEFID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("dupchkpsdefid");
    }

    /**
     * 设置 范围属性，详细说明：{@link #FIELD_DUPCHECKPSDEFID}
     * <P>
     * 等同 {@link #setDupCheckPSDEFId}
     * @param dupCheckPSDEFId
     */
    @JsonIgnore
    public PSDEField dupcheckpsdefid(String dupCheckPSDEFId){
        this.setDupCheckPSDEFId(dupCheckPSDEFId);
        return this;
    }

    /**
     * 设置 范围属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDupCheckPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEField dupcheckpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDupCheckPSDEFId(null);
            this.setDupCheckPSDEFName(null);
        }
        else{
            this.setDupCheckPSDEFId(pSDEField.getPSDEFieldId());
            this.setDupCheckPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DUPCHECKPSDEFNAME</B>&nbsp;范围属性，属性启用重复值检查时指定检查的范围属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DUPCHECKPSDEFID}
     */
    public final static String FIELD_DUPCHECKPSDEFNAME = "dupcheckpsdefname";

    /**
     * 设置 范围属性，详细说明：{@link #FIELD_DUPCHECKPSDEFNAME}
     * 
     * @param dupCheckPSDEFName
     * 
     */
    @JsonProperty(FIELD_DUPCHECKPSDEFNAME)
    public void setDupCheckPSDEFName(String dupCheckPSDEFName){
        this.set(FIELD_DUPCHECKPSDEFNAME, dupCheckPSDEFName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("dupchkpsdefname", dupCheckPSDEFName);
    }
    
    /**
     * 获取 范围属性  
     * @return
     */
    @JsonIgnore
    public String getDupCheckPSDEFName(){
        Object objValue = this.get(FIELD_DUPCHECKPSDEFNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("dupchkpsdefname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 范围属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDupCheckPSDEFNameDirty(){
        if(this.contains(FIELD_DUPCHECKPSDEFNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("dupchkpsdefname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 范围属性
     */
    @JsonIgnore
    public void resetDupCheckPSDEFName(){
        this.reset(FIELD_DUPCHECKPSDEFNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("dupchkpsdefname");
    }

    /**
     * 设置 范围属性，详细说明：{@link #FIELD_DUPCHECKPSDEFNAME}
     * <P>
     * 等同 {@link #setDupCheckPSDEFName}
     * @param dupCheckPSDEFName
     */
    @JsonIgnore
    public PSDEField dupcheckpsdefname(String dupCheckPSDEFName){
        this.setDupCheckPSDEFName(dupCheckPSDEFName);
        return this;
    }

    /**
     * <B>DEFAULTVALUETYPE</B>&nbsp;默认值类型，属性的默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType} 
     */
    public final static String FIELD_DEFAULTVALUETYPE = "defaultvaluetype";

    /**
     * 设置 默认值类型，详细说明：{@link #FIELD_DEFAULTVALUETYPE}
     * 
     * @param defaultValueType
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUETYPE)
    public void setDefaultValueType(String defaultValueType){
        this.set(FIELD_DEFAULTVALUETYPE, defaultValueType);
        //属性名称与代码标识不一致，设置属性名称
        this.set("dvt", defaultValueType);
    }
    
    /**
     * 获取 默认值类型  
     * @return
     */
    @JsonIgnore
    public String getDefaultValueType(){
        Object objValue = this.get(FIELD_DEFAULTVALUETYPE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("dvt");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueTypeDirty(){
        if(this.contains(FIELD_DEFAULTVALUETYPE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("dvt")){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值类型
     */
    @JsonIgnore
    public void resetDefaultValueType(){
        this.reset(FIELD_DEFAULTVALUETYPE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("dvt");
    }

    /**
     * 设置 默认值类型，详细说明：{@link #FIELD_DEFAULTVALUETYPE}
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDEField defaultvaluetype(String defaultValueType){
        this.setDefaultValueType(defaultValueType);
        return this;
    }

     /**
     * 设置 默认值类型，详细说明：{@link #FIELD_DEFAULTVALUETYPE}
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDEField defaultvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType defaultValueType){
        if(defaultValueType == null){
            this.setDefaultValueType(null);
        }
        else{
            this.setDefaultValueType(defaultValueType.value);
        }
        return this;
    }

    /**
     * <B>ENABLEAUDIT</B>&nbsp;启用审计，指定属性是否参与审计记录，在实体启用审计且审计模式为【详细审计（含变化记录）】时会记录启用审计属性的变化情况（记录旧值新值），默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFieldAuditLevel} 
     */
    public final static String FIELD_ENABLEAUDIT = "enableaudit";

    /**
     * 设置 启用审计，详细说明：{@link #FIELD_ENABLEAUDIT}
     * 
     * @param enableAudit
     * 
     */
    @JsonProperty(FIELD_ENABLEAUDIT)
    public void setEnableAudit(Integer enableAudit){
        this.set(FIELD_ENABLEAUDIT, enableAudit);
    }
    
    /**
     * 获取 启用审计  
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
     * 判断 启用审计 是否指定值，包括空值
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
     * 重置 启用审计
     */
    @JsonIgnore
    public void resetEnableAudit(){
        this.reset(FIELD_ENABLEAUDIT);
    }

    /**
     * 设置 启用审计，详细说明：{@link #FIELD_ENABLEAUDIT}
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDEField enableaudit(Integer enableAudit){
        this.setEnableAudit(enableAudit);
        return this;
    }

     /**
     * 设置 启用审计，详细说明：{@link #FIELD_ENABLEAUDIT}
     * <P>
     * 等同 {@link #setEnableAudit}
     * @param enableAudit
     */
    @JsonIgnore
    public PSDEField enableaudit(net.ibizsys.psmodel.core.util.PSModelEnums.DEFieldAuditLevel enableAudit){
        if(enableAudit == null){
            this.setEnableAudit(null);
        }
        else{
            this.setEnableAudit(enableAudit.value);
        }
        return this;
    }

    /**
     * <B>ENABLECOLPRIV</B>&nbsp;启用列权限控制，指定属性是否提供列级别的权限控制，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEField enablecolpriv(Integer enableColPriv){
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
    public PSDEField enablecolpriv(Boolean enableColPriv){
        if(enableColPriv == null){
            this.setEnableColPriv(null);
        }
        else{
            this.setEnableColPriv(enableColPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEQS</B>&nbsp;启用快速搜索，指定属性是否响应快速搜索，主信息属性默认支持，其它默认不支持
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEQS = "enableqs";

    /**
     * 设置 启用快速搜索，详细说明：{@link #FIELD_ENABLEQS}
     * 
     * @param enableQS
     * 
     */
    @JsonProperty(FIELD_ENABLEQS)
    public void setEnableQS(Integer enableQS){
        this.set(FIELD_ENABLEQS, enableQS);
    }
    
    /**
     * 获取 启用快速搜索  
     * @return
     */
    @JsonIgnore
    public Integer getEnableQS(){
        Object objValue = this.get(FIELD_ENABLEQS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用快速搜索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableQSDirty(){
        if(this.contains(FIELD_ENABLEQS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用快速搜索
     */
    @JsonIgnore
    public void resetEnableQS(){
        this.reset(FIELD_ENABLEQS);
    }

    /**
     * 设置 启用快速搜索，详细说明：{@link #FIELD_ENABLEQS}
     * <P>
     * 等同 {@link #setEnableQS}
     * @param enableQS
     */
    @JsonIgnore
    public PSDEField enableqs(Integer enableQS){
        this.setEnableQS(enableQS);
        return this;
    }

     /**
     * 设置 启用快速搜索，详细说明：{@link #FIELD_ENABLEQS}
     * <P>
     * 等同 {@link #setEnableQS}
     * @param enableQS
     */
    @JsonIgnore
    public PSDEField enableqs(Boolean enableQS){
        if(enableQS == null){
            this.setEnableQS(null);
        }
        else{
            this.setEnableQS(enableQS?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLETEMPDATA</B>&nbsp;支持临时数据，实体启用临时数据时，可进一步指定属性是否支持临时数据，如不支持则相应的字段不会被发布到临时表中。默认为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLETEMPDATA = "enabletempdata";

    /**
     * 设置 支持临时数据，详细说明：{@link #FIELD_ENABLETEMPDATA}
     * 
     * @param enableTempData
     * 
     */
    @JsonProperty(FIELD_ENABLETEMPDATA)
    public void setEnableTempData(Integer enableTempData){
        this.set(FIELD_ENABLETEMPDATA, enableTempData);
    }
    
    /**
     * 获取 支持临时数据  
     * @return
     */
    @JsonIgnore
    public Integer getEnableTempData(){
        Object objValue = this.get(FIELD_ENABLETEMPDATA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持临时数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableTempDataDirty(){
        if(this.contains(FIELD_ENABLETEMPDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持临时数据
     */
    @JsonIgnore
    public void resetEnableTempData(){
        this.reset(FIELD_ENABLETEMPDATA);
    }

    /**
     * 设置 支持临时数据，详细说明：{@link #FIELD_ENABLETEMPDATA}
     * <P>
     * 等同 {@link #setEnableTempData}
     * @param enableTempData
     */
    @JsonIgnore
    public PSDEField enabletempdata(Integer enableTempData){
        this.setEnableTempData(enableTempData);
        return this;
    }

     /**
     * 设置 支持临时数据，详细说明：{@link #FIELD_ENABLETEMPDATA}
     * <P>
     * 等同 {@link #setEnableTempData}
     * @param enableTempData
     */
    @JsonIgnore
    public PSDEField enabletempdata(Boolean enableTempData){
        if(enableTempData == null){
            this.setEnableTempData(null);
        }
        else{
            this.setEnableTempData(enableTempData?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEUSERINPUT</B>&nbsp;默认用户行为，指定用户在界面上默认对该属性的操作能力
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UserInputMode} 
     */
    public final static String FIELD_ENABLEUSERINPUT = "enableuserinput";

    /**
     * 设置 默认用户行为，详细说明：{@link #FIELD_ENABLEUSERINPUT}
     * 
     * @param enableUserInput
     * 
     */
    @JsonProperty(FIELD_ENABLEUSERINPUT)
    public void setEnableUserInput(Integer enableUserInput){
        this.set(FIELD_ENABLEUSERINPUT, enableUserInput);
    }
    
    /**
     * 获取 默认用户行为  
     * @return
     */
    @JsonIgnore
    public Integer getEnableUserInput(){
        Object objValue = this.get(FIELD_ENABLEUSERINPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认用户行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableUserInputDirty(){
        if(this.contains(FIELD_ENABLEUSERINPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认用户行为
     */
    @JsonIgnore
    public void resetEnableUserInput(){
        this.reset(FIELD_ENABLEUSERINPUT);
    }

    /**
     * 设置 默认用户行为，详细说明：{@link #FIELD_ENABLEUSERINPUT}
     * <P>
     * 等同 {@link #setEnableUserInput}
     * @param enableUserInput
     */
    @JsonIgnore
    public PSDEField enableuserinput(Integer enableUserInput){
        this.setEnableUserInput(enableUserInput);
        return this;
    }

     /**
     * 设置 默认用户行为，详细说明：{@link #FIELD_ENABLEUSERINPUT}
     * <P>
     * 等同 {@link #setEnableUserInput}
     * @param enableUserInput
     */
    @JsonIgnore
    public PSDEField enableuserinput(net.ibizsys.psmodel.core.util.PSModelEnums.UserInputMode[] enableUserInput){
        if(enableUserInput == null || enableUserInput.length == 0){
            this.setEnableUserInput(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.UserInputMode _item : enableUserInput){
                _value |= _item.value;
            }
            this.setEnableUserInput(_value);
        }
        return this;
    }

    /**
     * <B>ENAWRITEBACK</B>&nbsp;链接属性同步，指定关系属性与引用属性的同步模式，未定义时为【未启用】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFWriteBackMode} 
     */
    public final static String FIELD_ENAWRITEBACK = "enawriteback";

    /**
     * 设置 链接属性同步，详细说明：{@link #FIELD_ENAWRITEBACK}
     * 
     * @param enaWriteBack
     * 
     */
    @JsonProperty(FIELD_ENAWRITEBACK)
    public void setEnaWriteBack(Integer enaWriteBack){
        this.set(FIELD_ENAWRITEBACK, enaWriteBack);
    }
    
    /**
     * 获取 链接属性同步  
     * @return
     */
    @JsonIgnore
    public Integer getEnaWriteBack(){
        Object objValue = this.get(FIELD_ENAWRITEBACK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 链接属性同步 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaWriteBackDirty(){
        if(this.contains(FIELD_ENAWRITEBACK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接属性同步
     */
    @JsonIgnore
    public void resetEnaWriteBack(){
        this.reset(FIELD_ENAWRITEBACK);
    }

    /**
     * 设置 链接属性同步，详细说明：{@link #FIELD_ENAWRITEBACK}
     * <P>
     * 等同 {@link #setEnaWriteBack}
     * @param enaWriteBack
     */
    @JsonIgnore
    public PSDEField enawriteback(Integer enaWriteBack){
        this.setEnaWriteBack(enaWriteBack);
        return this;
    }

     /**
     * 设置 链接属性同步，详细说明：{@link #FIELD_ENAWRITEBACK}
     * <P>
     * 等同 {@link #setEnaWriteBack}
     * @param enaWriteBack
     */
    @JsonIgnore
    public PSDEField enawriteback(net.ibizsys.psmodel.core.util.PSModelEnums.DEFWriteBackMode enaWriteBack){
        if(enaWriteBack == null){
            this.setEnaWriteBack(null);
        }
        else{
            this.setEnaWriteBack(enaWriteBack.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE</B>&nbsp;导出范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope} 
     */
    public final static String FIELD_EXPORTSCOPE = "exportscope";

    /**
     * 设置 导出范围
     * 
     * @param exportScope
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE)
    public void setExportScope(Integer exportScope){
        this.set(FIELD_EXPORTSCOPE, exportScope);
    }
    
    /**
     * 获取 导出范围  
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
     * 判断 导出范围 是否指定值，包括空值
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
     * 重置 导出范围
     */
    @JsonIgnore
    public void resetExportScope(){
        this.reset(FIELD_EXPORTSCOPE);
    }

    /**
     * 设置 导出范围
     * <P>
     * 等同 {@link #setExportScope}
     * @param exportScope
     */
    @JsonIgnore
    public PSDEField exportscope(Integer exportScope){
        this.setExportScope(exportScope);
        return this;
    }

     /**
     * 设置 导出范围
     * <P>
     * 等同 {@link #setExportScope}
     * @param exportScope
     */
    @JsonIgnore
    public PSDEField exportscope(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope[] exportScope){
        if(exportScope == null || exportScope.length == 0){
            this.setExportScope(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope _item : exportScope){
                _value |= _item.value;
            }
            this.setExportScope(_value);
        }
        return this;
    }

    /**
     * <B>EXPPSSYSTRANSLATORID</B>&nbsp;导出转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_EXPPSSYSTRANSLATORID = "exppssystranslatorid";

    /**
     * 设置 导出转换器
     * 
     * @param expPSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_EXPPSSYSTRANSLATORID)
    public void setExpPSSysTranslatorId(String expPSSysTranslatorId){
        this.set(FIELD_EXPPSSYSTRANSLATORID, expPSSysTranslatorId);
    }
    
    /**
     * 获取 导出转换器  
     * @return
     */
    @JsonIgnore
    public String getExpPSSysTranslatorId(){
        Object objValue = this.get(FIELD_EXPPSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导出转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_EXPPSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出转换器
     */
    @JsonIgnore
    public void resetExpPSSysTranslatorId(){
        this.reset(FIELD_EXPPSSYSTRANSLATORID);
    }

    /**
     * 设置 导出转换器
     * <P>
     * 等同 {@link #setExpPSSysTranslatorId}
     * @param expPSSysTranslatorId
     */
    @JsonIgnore
    public PSDEField exppssystranslatorid(String expPSSysTranslatorId){
        this.setExpPSSysTranslatorId(expPSSysTranslatorId);
        return this;
    }

    /**
     * 设置 导出转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setExpPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEField exppssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setExpPSSysTranslatorId(null);
            this.setExpPSSysTranslatorName(null);
        }
        else{
            this.setExpPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setExpPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>EXPPSSYSTRANSLATORNAME</B>&nbsp;导出转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EXPPSSYSTRANSLATORID}
     */
    public final static String FIELD_EXPPSSYSTRANSLATORNAME = "exppssystranslatorname";

    /**
     * 设置 导出转换器
     * 
     * @param expPSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_EXPPSSYSTRANSLATORNAME)
    public void setExpPSSysTranslatorName(String expPSSysTranslatorName){
        this.set(FIELD_EXPPSSYSTRANSLATORNAME, expPSSysTranslatorName);
    }
    
    /**
     * 获取 导出转换器  
     * @return
     */
    @JsonIgnore
    public String getExpPSSysTranslatorName(){
        Object objValue = this.get(FIELD_EXPPSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导出转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExpPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_EXPPSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出转换器
     */
    @JsonIgnore
    public void resetExpPSSysTranslatorName(){
        this.reset(FIELD_EXPPSSYSTRANSLATORNAME);
    }

    /**
     * 设置 导出转换器
     * <P>
     * 等同 {@link #setExpPSSysTranslatorName}
     * @param expPSSysTranslatorName
     */
    @JsonIgnore
    public PSDEField exppssystranslatorname(String expPSSysTranslatorName){
        this.setExpPSSysTranslatorName(expPSSysTranslatorName);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体属性的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
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
    public PSDEField extendmode(Integer extendMode){
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
    public PSDEField extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>FIELDTAG</B>&nbsp;属性标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDTAG = "fieldtag";

    /**
     * 设置 属性标记
     * 
     * @param fieldTag
     * 
     */
    @JsonProperty(FIELD_FIELDTAG)
    public void setFieldTag(String fieldTag){
        this.set(FIELD_FIELDTAG, fieldTag);
    }
    
    /**
     * 获取 属性标记  
     * @return
     */
    @JsonIgnore
    public String getFieldTag(){
        Object objValue = this.get(FIELD_FIELDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldTagDirty(){
        if(this.contains(FIELD_FIELDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标记
     */
    @JsonIgnore
    public void resetFieldTag(){
        this.reset(FIELD_FIELDTAG);
    }

    /**
     * 设置 属性标记
     * <P>
     * 等同 {@link #setFieldTag}
     * @param fieldTag
     */
    @JsonIgnore
    public PSDEField fieldtag(String fieldTag){
        this.setFieldTag(fieldTag);
        return this;
    }

    /**
     * <B>FIELDTAG2</B>&nbsp;属性标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDTAG2 = "fieldtag2";

    /**
     * 设置 属性标记2
     * 
     * @param fieldTag2
     * 
     */
    @JsonProperty(FIELD_FIELDTAG2)
    public void setFieldTag2(String fieldTag2){
        this.set(FIELD_FIELDTAG2, fieldTag2);
    }
    
    /**
     * 获取 属性标记2  
     * @return
     */
    @JsonIgnore
    public String getFieldTag2(){
        Object objValue = this.get(FIELD_FIELDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldTag2Dirty(){
        if(this.contains(FIELD_FIELDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标记2
     */
    @JsonIgnore
    public void resetFieldTag2(){
        this.reset(FIELD_FIELDTAG2);
    }

    /**
     * 设置 属性标记2
     * <P>
     * 等同 {@link #setFieldTag2}
     * @param fieldTag2
     */
    @JsonIgnore
    public PSDEField fieldtag2(String fieldTag2){
        this.setFieldTag2(fieldTag2);
        return this;
    }

    /**
     * <B>FKEY</B>&nbsp;外键属性，指定属性是否为实体关系的连接属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FKEY = "fkey";

    /**
     * 设置 外键属性，详细说明：{@link #FIELD_FKEY}
     * 
     * @param fKey
     * 
     */
    @JsonProperty(FIELD_FKEY)
    public void setFKey(Integer fKey){
        this.set(FIELD_FKEY, fKey);
    }
    
    /**
     * 获取 外键属性  
     * @return
     */
    @JsonIgnore
    public Integer getFKey(){
        Object objValue = this.get(FIELD_FKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 外键属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFKeyDirty(){
        if(this.contains(FIELD_FKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外键属性
     */
    @JsonIgnore
    public void resetFKey(){
        this.reset(FIELD_FKEY);
    }

    /**
     * 设置 外键属性，详细说明：{@link #FIELD_FKEY}
     * <P>
     * 等同 {@link #setFKey}
     * @param fKey
     */
    @JsonIgnore
    public PSDEField fkey(Integer fKey){
        this.setFKey(fKey);
        return this;
    }

     /**
     * 设置 外键属性，详细说明：{@link #FIELD_FKEY}
     * <P>
     * 等同 {@link #setFKey}
     * @param fKey
     */
    @JsonIgnore
    public PSDEField fkey(Boolean fKey){
        if(fKey == null){
            this.setFKey(null);
        }
        else{
            this.setFKey(fKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FORMULAFIELDS</B>&nbsp;计算式属性参数，指定计算式属性的格式参数（属性）集合，多个参数使用分号【；】分隔
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FORMULAFIELDS = "formulafields";

    /**
     * 设置 计算式属性参数，详细说明：{@link #FIELD_FORMULAFIELDS}
     * 
     * @param formulaFields
     * 
     */
    @JsonProperty(FIELD_FORMULAFIELDS)
    public void setFormulaFields(String formulaFields){
        this.set(FIELD_FORMULAFIELDS, formulaFields);
    }
    
    /**
     * 获取 计算式属性参数  
     * @return
     */
    @JsonIgnore
    public String getFormulaFields(){
        Object objValue = this.get(FIELD_FORMULAFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计算式属性参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormulaFieldsDirty(){
        if(this.contains(FIELD_FORMULAFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计算式属性参数
     */
    @JsonIgnore
    public void resetFormulaFields(){
        this.reset(FIELD_FORMULAFIELDS);
    }

    /**
     * 设置 计算式属性参数，详细说明：{@link #FIELD_FORMULAFIELDS}
     * <P>
     * 等同 {@link #setFormulaFields}
     * @param formulaFields
     */
    @JsonIgnore
    public PSDEField formulafields(String formulaFields){
        this.setFormulaFields(formulaFields);
        return this;
    }

    /**
     * <B>FORMULAFORMAT</B>&nbsp;计算式属性格式，指定计算式属性格式，如存在公式属性参数，可使用java字符串格式化占位符号： %1$s、 %2$s...进行参数占位
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_FORMULAFORMAT = "formulaformat";

    /**
     * 设置 计算式属性格式，详细说明：{@link #FIELD_FORMULAFORMAT}
     * 
     * @param formulaFormat
     * 
     */
    @JsonProperty(FIELD_FORMULAFORMAT)
    public void setFormulaFormat(String formulaFormat){
        this.set(FIELD_FORMULAFORMAT, formulaFormat);
    }
    
    /**
     * 获取 计算式属性格式  
     * @return
     */
    @JsonIgnore
    public String getFormulaFormat(){
        Object objValue = this.get(FIELD_FORMULAFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计算式属性格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormulaFormatDirty(){
        if(this.contains(FIELD_FORMULAFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计算式属性格式
     */
    @JsonIgnore
    public void resetFormulaFormat(){
        this.reset(FIELD_FORMULAFORMAT);
    }

    /**
     * 设置 计算式属性格式，详细说明：{@link #FIELD_FORMULAFORMAT}
     * <P>
     * 等同 {@link #setFormulaFormat}
     * @param formulaFormat
     */
    @JsonIgnore
    public PSDEField formulaformat(String formulaFormat){
        this.setFormulaFormat(formulaFormat);
        return this;
    }

    /**
     * <B>IMPORTKEY</B>&nbsp;数据导入识别，指定属性是否为数据导入识别属性，数据导入时通过指定一个或多个导入识别属性判断导入数据是新建还是更新，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_IMPORTKEY = "importkey";

    /**
     * 设置 数据导入识别，详细说明：{@link #FIELD_IMPORTKEY}
     * 
     * @param importKey
     * 
     */
    @JsonProperty(FIELD_IMPORTKEY)
    public void setImportKey(Integer importKey){
        this.set(FIELD_IMPORTKEY, importKey);
    }
    
    /**
     * 获取 数据导入识别  
     * @return
     */
    @JsonIgnore
    public Integer getImportKey(){
        Object objValue = this.get(FIELD_IMPORTKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据导入识别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImportKeyDirty(){
        if(this.contains(FIELD_IMPORTKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导入识别
     */
    @JsonIgnore
    public void resetImportKey(){
        this.reset(FIELD_IMPORTKEY);
    }

    /**
     * 设置 数据导入识别，详细说明：{@link #FIELD_IMPORTKEY}
     * <P>
     * 等同 {@link #setImportKey}
     * @param importKey
     */
    @JsonIgnore
    public PSDEField importkey(Integer importKey){
        this.setImportKey(importKey);
        return this;
    }

     /**
     * 设置 数据导入识别，详细说明：{@link #FIELD_IMPORTKEY}
     * <P>
     * 等同 {@link #setImportKey}
     * @param importKey
     */
    @JsonIgnore
    public PSDEField importkey(Boolean importKey){
        if(importKey == null){
            this.setImportKey(null);
        }
        else{
            this.setImportKey(importKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IMPORTORDER</B>&nbsp;数据导入次序，指定属性在默认数据导入的显示次序，默认为【1000】，不支持导入为【-1】
     */
    public final static String FIELD_IMPORTORDER = "importorder";

    /**
     * 设置 数据导入次序，详细说明：{@link #FIELD_IMPORTORDER}
     * 
     * @param importOrder
     * 
     */
    @JsonProperty(FIELD_IMPORTORDER)
    public void setImportOrder(Integer importOrder){
        this.set(FIELD_IMPORTORDER, importOrder);
    }
    
    /**
     * 获取 数据导入次序  
     * @return
     */
    @JsonIgnore
    public Integer getImportOrder(){
        Object objValue = this.get(FIELD_IMPORTORDER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据导入次序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImportOrderDirty(){
        if(this.contains(FIELD_IMPORTORDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导入次序
     */
    @JsonIgnore
    public void resetImportOrder(){
        this.reset(FIELD_IMPORTORDER);
    }

    /**
     * 设置 数据导入次序，详细说明：{@link #FIELD_IMPORTORDER}
     * <P>
     * 等同 {@link #setImportOrder}
     * @param importOrder
     */
    @JsonIgnore
    public PSDEField importorder(Integer importOrder){
        this.setImportOrder(importOrder);
        return this;
    }

    /**
     * <B>IMPORTTAG</B>&nbsp;数据导入标识，指定属性在默认数据导入的显示名称，需要在默认数据导入的属性中具有唯一性
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_IMPORTTAG = "importtag";

    /**
     * 设置 数据导入标识，详细说明：{@link #FIELD_IMPORTTAG}
     * 
     * @param importTag
     * 
     */
    @JsonProperty(FIELD_IMPORTTAG)
    public void setImportTag(String importTag){
        this.set(FIELD_IMPORTTAG, importTag);
    }
    
    /**
     * 获取 数据导入标识  
     * @return
     */
    @JsonIgnore
    public String getImportTag(){
        Object objValue = this.get(FIELD_IMPORTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据导入标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImportTagDirty(){
        if(this.contains(FIELD_IMPORTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据导入标识
     */
    @JsonIgnore
    public void resetImportTag(){
        this.reset(FIELD_IMPORTTAG);
    }

    /**
     * 设置 数据导入标识，详细说明：{@link #FIELD_IMPORTTAG}
     * <P>
     * 等同 {@link #setImportTag}
     * @param importTag
     */
    @JsonIgnore
    public PSDEField importtag(String importTag){
        this.setImportTag(importTag);
        return this;
    }

    /**
     * <B>IMPPSSYSTRANSLATORID</B>&nbsp;导入转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_IMPPSSYSTRANSLATORID = "imppssystranslatorid";

    /**
     * 设置 导入转换器
     * 
     * @param impPSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_IMPPSSYSTRANSLATORID)
    public void setImpPSSysTranslatorId(String impPSSysTranslatorId){
        this.set(FIELD_IMPPSSYSTRANSLATORID, impPSSysTranslatorId);
    }
    
    /**
     * 获取 导入转换器  
     * @return
     */
    @JsonIgnore
    public String getImpPSSysTranslatorId(){
        Object objValue = this.get(FIELD_IMPPSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImpPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_IMPPSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入转换器
     */
    @JsonIgnore
    public void resetImpPSSysTranslatorId(){
        this.reset(FIELD_IMPPSSYSTRANSLATORID);
    }

    /**
     * 设置 导入转换器
     * <P>
     * 等同 {@link #setImpPSSysTranslatorId}
     * @param impPSSysTranslatorId
     */
    @JsonIgnore
    public PSDEField imppssystranslatorid(String impPSSysTranslatorId){
        this.setImpPSSysTranslatorId(impPSSysTranslatorId);
        return this;
    }

    /**
     * 设置 导入转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setImpPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEField imppssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setImpPSSysTranslatorId(null);
            this.setImpPSSysTranslatorName(null);
        }
        else{
            this.setImpPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setImpPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>IMPPSSYSTRANSLATORNAME</B>&nbsp;导入转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_IMPPSSYSTRANSLATORID}
     */
    public final static String FIELD_IMPPSSYSTRANSLATORNAME = "imppssystranslatorname";

    /**
     * 设置 导入转换器
     * 
     * @param impPSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_IMPPSSYSTRANSLATORNAME)
    public void setImpPSSysTranslatorName(String impPSSysTranslatorName){
        this.set(FIELD_IMPPSSYSTRANSLATORNAME, impPSSysTranslatorName);
    }
    
    /**
     * 获取 导入转换器  
     * @return
     */
    @JsonIgnore
    public String getImpPSSysTranslatorName(){
        Object objValue = this.get(FIELD_IMPPSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 导入转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImpPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_IMPPSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导入转换器
     */
    @JsonIgnore
    public void resetImpPSSysTranslatorName(){
        this.reset(FIELD_IMPPSSYSTRANSLATORNAME);
    }

    /**
     * 设置 导入转换器
     * <P>
     * 等同 {@link #setImpPSSysTranslatorName}
     * @param impPSSysTranslatorName
     */
    @JsonIgnore
    public PSDEField imppssystranslatorname(String impPSSysTranslatorName){
        this.setImpPSSysTranslatorName(impPSSysTranslatorName);
        return this;
    }

    /**
     * <B>INDEXTYPE</B>&nbsp;索引类型属性，指定属性是否为索引类型标识属性，索引实体需要指定一个属性来存储索引数据的类型，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INDEXTYPE = "indextype";

    /**
     * 设置 索引类型属性，详细说明：{@link #FIELD_INDEXTYPE}
     * 
     * @param indexType
     * 
     */
    @JsonProperty(FIELD_INDEXTYPE)
    public void setIndexType(Integer indexType){
        this.set(FIELD_INDEXTYPE, indexType);
    }
    
    /**
     * 获取 索引类型属性  
     * @return
     */
    @JsonIgnore
    public Integer getIndexType(){
        Object objValue = this.get(FIELD_INDEXTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 索引类型属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIndexTypeDirty(){
        if(this.contains(FIELD_INDEXTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 索引类型属性
     */
    @JsonIgnore
    public void resetIndexType(){
        this.reset(FIELD_INDEXTYPE);
    }

    /**
     * 设置 索引类型属性，详细说明：{@link #FIELD_INDEXTYPE}
     * <P>
     * 等同 {@link #setIndexType}
     * @param indexType
     */
    @JsonIgnore
    public PSDEField indextype(Integer indexType){
        this.setIndexType(indexType);
        return this;
    }

     /**
     * 设置 索引类型属性，详细说明：{@link #FIELD_INDEXTYPE}
     * <P>
     * 等同 {@link #setIndexType}
     * @param indexType
     */
    @JsonIgnore
    public PSDEField indextype(Boolean indexType){
        if(indexType == null){
            this.setIndexType(null);
        }
        else{
            this.setIndexType(indexType?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>JSFORMAT</B>&nbsp;JS格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JSFORMAT = "jsformat";

    /**
     * 设置 JS格式化
     * 
     * @param jSFormat
     * 
     */
    @JsonProperty(FIELD_JSFORMAT)
    public void setJSFormat(String jSFormat){
        this.set(FIELD_JSFORMAT, jSFormat);
    }
    
    /**
     * 获取 JS格式化  
     * @return
     */
    @JsonIgnore
    public String getJSFormat(){
        Object objValue = this.get(FIELD_JSFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 JS格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJSFormatDirty(){
        if(this.contains(FIELD_JSFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 JS格式化
     */
    @JsonIgnore
    public void resetJSFormat(){
        this.reset(FIELD_JSFORMAT);
    }

    /**
     * 设置 JS格式化
     * <P>
     * 等同 {@link #setJSFormat}
     * @param jSFormat
     */
    @JsonIgnore
    public PSDEField jsformat(String jSFormat){
        this.setJSFormat(jSFormat);
        return this;
    }

    /**
     * <B>JSONFORMAT</B>&nbsp;Json格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JSONFORMAT = "jsonformat";

    /**
     * 设置 Json格式化
     * 
     * @param jsonFormat
     * 
     */
    @JsonProperty(FIELD_JSONFORMAT)
    public void setJsonFormat(String jsonFormat){
        this.set(FIELD_JSONFORMAT, jsonFormat);
    }
    
    /**
     * 获取 Json格式化  
     * @return
     */
    @JsonIgnore
    public String getJsonFormat(){
        Object objValue = this.get(FIELD_JSONFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Json格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJsonFormatDirty(){
        if(this.contains(FIELD_JSONFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Json格式化
     */
    @JsonIgnore
    public void resetJsonFormat(){
        this.reset(FIELD_JSONFORMAT);
    }

    /**
     * 设置 Json格式化
     * <P>
     * 等同 {@link #setJsonFormat}
     * @param jsonFormat
     */
    @JsonIgnore
    public PSDEField jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
        return this;
    }

    /**
     * <B>LENGTH</B>&nbsp;长度，指定属性的数据类型长度
     */
    public final static String FIELD_LENGTH = "length";

    /**
     * 设置 长度，详细说明：{@link #FIELD_LENGTH}
     * 
     * @param length
     * 
     */
    @JsonProperty(FIELD_LENGTH)
    public void setLength(Integer length){
        this.set(FIELD_LENGTH, length);
    }
    
    /**
     * 获取 长度  
     * @return
     */
    @JsonIgnore
    public Integer getLength(){
        Object objValue = this.get(FIELD_LENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLengthDirty(){
        if(this.contains(FIELD_LENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 长度
     */
    @JsonIgnore
    public void resetLength(){
        this.reset(FIELD_LENGTH);
    }

    /**
     * 设置 长度，详细说明：{@link #FIELD_LENGTH}
     * <P>
     * 等同 {@link #setLength}
     * @param length
     */
    @JsonIgnore
    public PSDEField length(Integer length){
        this.setLength(length);
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;名称语言资源，指定属性逻辑名称的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * 
     * @param lNPSLanResId
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESID)
    public void setLNPSLanResId(String lNPSLanResId){
        this.set(FIELD_LNPSLANRESID, lNPSLanResId);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResId(){
        Object objValue = this.get(FIELD_LNPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResIdDirty(){
        if(this.contains(FIELD_LNPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResId(){
        this.reset(FIELD_LNPSLANRESID);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSDEField lnpslanresid(String lNPSLanResId){
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    /**
     * 设置 名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEField lnpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        }
        else{
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>LNPSLANRESNAME</B>&nbsp;名称语言资源，指定属性逻辑名称的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * 
     * @param lNPSLanResName
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESNAME)
    public void setLNPSLanResName(String lNPSLanResName){
        this.set(FIELD_LNPSLANRESNAME, lNPSLanResName);
    }
    
    /**
     * 获取 名称语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResName(){
        Object objValue = this.get(FIELD_LNPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResNameDirty(){
        if(this.contains(FIELD_LNPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResName(){
        this.reset(FIELD_LNPSLANRESNAME);
    }

    /**
     * 设置 名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSDEField lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定属性的逻辑名称
     * <P>
     * 字符串：最大长度 60
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
    public PSDEField logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORFIELD</B>&nbsp;主信息属性，指定属性是否为主信息属性，每个实体都需要指定一个主信息属性，主信息属性用于存储数据的主信息，也是关系实体中【外键值文本】属性默认的连接属性，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FieldMajorMode} 
     */
    public final static String FIELD_MAJORFIELD = "majorfield";

    /**
     * 设置 主信息属性，详细说明：{@link #FIELD_MAJORFIELD}
     * 
     * @param majorField
     * 
     */
    @JsonProperty(FIELD_MAJORFIELD)
    public void setMajorField(Integer majorField){
        this.set(FIELD_MAJORFIELD, majorField);
    }
    
    /**
     * 获取 主信息属性  
     * @return
     */
    @JsonIgnore
    public Integer getMajorField(){
        Object objValue = this.get(FIELD_MAJORFIELD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主信息属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorFieldDirty(){
        if(this.contains(FIELD_MAJORFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主信息属性
     */
    @JsonIgnore
    public void resetMajorField(){
        this.reset(FIELD_MAJORFIELD);
    }

    /**
     * 设置 主信息属性，详细说明：{@link #FIELD_MAJORFIELD}
     * <P>
     * 等同 {@link #setMajorField}
     * @param majorField
     */
    @JsonIgnore
    public PSDEField majorfield(Integer majorField){
        this.setMajorField(majorField);
        return this;
    }

     /**
     * 设置 主信息属性，详细说明：{@link #FIELD_MAJORFIELD}
     * <P>
     * 等同 {@link #setMajorField}
     * @param majorField
     */
    @JsonIgnore
    public PSDEField majorfield(net.ibizsys.psmodel.core.util.PSModelEnums.FieldMajorMode majorField){
        if(majorField == null){
            this.setMajorField(null);
        }
        else{
            this.setMajorField(majorField.value);
        }
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值，指定属性的允许输入的最大数值（含），该值被应用在属性的默认值规则，默认不指定
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MAXVALUE = "maxvalue";

    /**
     * 设置 最大值，详细说明：{@link #FIELD_MAXVALUE}
     * 
     * @param maxValue
     * 
     */
    @JsonProperty(FIELD_MAXVALUE)
    public void setMaxValue(String maxValue){
        this.set(FIELD_MAXVALUE, maxValue);
    }
    
    /**
     * 获取 最大值  
     * @return
     */
    @JsonIgnore
    public String getMaxValue(){
        Object objValue = this.get(FIELD_MAXVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最大值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxValueDirty(){
        if(this.contains(FIELD_MAXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大值
     */
    @JsonIgnore
    public void resetMaxValue(){
        this.reset(FIELD_MAXVALUE);
    }

    /**
     * 设置 最大值，详细说明：{@link #FIELD_MAXVALUE}
     * <P>
     * 等同 {@link #setMaxValue}
     * @param maxValue
     */
    @JsonIgnore
    public PSDEField maxvalue(String maxValue){
        this.setMaxValue(maxValue);
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
    public PSDEField memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINSTRLENGTH</B>&nbsp;最小字符长度，指定属性的最小字符串长度，该值被应用在属性的默认值规则，默认不启用
     */
    public final static String FIELD_MINSTRLENGTH = "minstrlength";

    /**
     * 设置 最小字符长度，详细说明：{@link #FIELD_MINSTRLENGTH}
     * 
     * @param minStrLength
     * 
     */
    @JsonProperty(FIELD_MINSTRLENGTH)
    public void setMinStrLength(Integer minStrLength){
        this.set(FIELD_MINSTRLENGTH, minStrLength);
    }
    
    /**
     * 获取 最小字符长度  
     * @return
     */
    @JsonIgnore
    public Integer getMinStrLength(){
        Object objValue = this.get(FIELD_MINSTRLENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最小字符长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinStrLengthDirty(){
        if(this.contains(FIELD_MINSTRLENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小字符长度
     */
    @JsonIgnore
    public void resetMinStrLength(){
        this.reset(FIELD_MINSTRLENGTH);
    }

    /**
     * 设置 最小字符长度，详细说明：{@link #FIELD_MINSTRLENGTH}
     * <P>
     * 等同 {@link #setMinStrLength}
     * @param minStrLength
     */
    @JsonIgnore
    public PSDEField minstrlength(Integer minStrLength){
        this.setMinStrLength(minStrLength);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值，指定属性的允许输入的最小数值（含），该值被应用在属性的默认值规则，默认不指定
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MINVALUE = "minvalue";

    /**
     * 设置 最小值，详细说明：{@link #FIELD_MINVALUE}
     * 
     * @param minValue
     * 
     */
    @JsonProperty(FIELD_MINVALUE)
    public void setMinValue(String minValue){
        this.set(FIELD_MINVALUE, minValue);
    }
    
    /**
     * 获取 最小值  
     * @return
     */
    @JsonIgnore
    public String getMinValue(){
        Object objValue = this.get(FIELD_MINVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 最小值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinValueDirty(){
        if(this.contains(FIELD_MINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最小值
     */
    @JsonIgnore
    public void resetMinValue(){
        this.reset(FIELD_MINVALUE);
    }

    /**
     * 设置 最小值，详细说明：{@link #FIELD_MINVALUE}
     * <P>
     * 等同 {@link #setMinValue}
     * @param minValue
     */
    @JsonIgnore
    public PSDEField minvalue(String minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>MULTIFORMFIELD</B>&nbsp;多表单识别属性，指定属性是否为多表单识别属性，实体启用多表单模式需要指定一个属性来指定使用的编辑视图模式，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MULTIFORMFIELD = "multiformfield";

    /**
     * 设置 多表单识别属性，详细说明：{@link #FIELD_MULTIFORMFIELD}
     * 
     * @param multiFormField
     * 
     */
    @JsonProperty(FIELD_MULTIFORMFIELD)
    public void setMultiFormField(Integer multiFormField){
        this.set(FIELD_MULTIFORMFIELD, multiFormField);
    }
    
    /**
     * 获取 多表单识别属性  
     * @return
     */
    @JsonIgnore
    public Integer getMultiFormField(){
        Object objValue = this.get(FIELD_MULTIFORMFIELD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 多表单识别属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMultiFormFieldDirty(){
        if(this.contains(FIELD_MULTIFORMFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多表单识别属性
     */
    @JsonIgnore
    public void resetMultiFormField(){
        this.reset(FIELD_MULTIFORMFIELD);
    }

    /**
     * 设置 多表单识别属性，详细说明：{@link #FIELD_MULTIFORMFIELD}
     * <P>
     * 等同 {@link #setMultiFormField}
     * @param multiFormField
     */
    @JsonIgnore
    public PSDEField multiformfield(Integer multiFormField){
        this.setMultiFormField(multiFormField);
        return this;
    }

     /**
     * 设置 多表单识别属性，详细说明：{@link #FIELD_MULTIFORMFIELD}
     * <P>
     * 等同 {@link #setMultiFormField}
     * @param multiFormField
     */
    @JsonIgnore
    public PSDEField multiformfield(Boolean multiFormField){
        if(multiFormField == null){
            this.setMultiFormField(null);
        }
        else{
            this.setMultiFormField(multiFormField?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NO2DUPCHKPSDEFID</B>&nbsp;范围属性2，属性启用重复值检查时指定检查的范围属性2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_NO2DUPCHKPSDEFID = "no2dupchkpsdefid";

    /**
     * 设置 范围属性2，详细说明：{@link #FIELD_NO2DUPCHKPSDEFID}
     * 
     * @param no2DupChkPSDEFId
     * 
     */
    @JsonProperty(FIELD_NO2DUPCHKPSDEFID)
    public void setNo2DupChkPSDEFId(String no2DupChkPSDEFId){
        this.set(FIELD_NO2DUPCHKPSDEFID, no2DupChkPSDEFId);
    }
    
    /**
     * 获取 范围属性2  
     * @return
     */
    @JsonIgnore
    public String getNo2DupChkPSDEFId(){
        Object objValue = this.get(FIELD_NO2DUPCHKPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 范围属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2DupChkPSDEFIdDirty(){
        if(this.contains(FIELD_NO2DUPCHKPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 范围属性2
     */
    @JsonIgnore
    public void resetNo2DupChkPSDEFId(){
        this.reset(FIELD_NO2DUPCHKPSDEFID);
    }

    /**
     * 设置 范围属性2，详细说明：{@link #FIELD_NO2DUPCHKPSDEFID}
     * <P>
     * 等同 {@link #setNo2DupChkPSDEFId}
     * @param no2DupChkPSDEFId
     */
    @JsonIgnore
    public PSDEField no2dupchkpsdefid(String no2DupChkPSDEFId){
        this.setNo2DupChkPSDEFId(no2DupChkPSDEFId);
        return this;
    }

    /**
     * 设置 范围属性2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo2DupChkPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEField no2dupchkpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setNo2DupChkPSDEFId(null);
            this.setNo2DupChkPSDEFName(null);
        }
        else{
            this.setNo2DupChkPSDEFId(pSDEField.getPSDEFieldId());
            this.setNo2DupChkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>NO2DUPCHKPSDEFNAME</B>&nbsp;范围属性2，属性启用重复值检查时指定检查的范围属性2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO2DUPCHKPSDEFID}
     */
    public final static String FIELD_NO2DUPCHKPSDEFNAME = "no2dupchkpsdefname";

    /**
     * 设置 范围属性2，详细说明：{@link #FIELD_NO2DUPCHKPSDEFNAME}
     * 
     * @param no2DupChkPSDEFName
     * 
     */
    @JsonProperty(FIELD_NO2DUPCHKPSDEFNAME)
    public void setNo2DupChkPSDEFName(String no2DupChkPSDEFName){
        this.set(FIELD_NO2DUPCHKPSDEFNAME, no2DupChkPSDEFName);
    }
    
    /**
     * 获取 范围属性2  
     * @return
     */
    @JsonIgnore
    public String getNo2DupChkPSDEFName(){
        Object objValue = this.get(FIELD_NO2DUPCHKPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 范围属性2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo2DupChkPSDEFNameDirty(){
        if(this.contains(FIELD_NO2DUPCHKPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 范围属性2
     */
    @JsonIgnore
    public void resetNo2DupChkPSDEFName(){
        this.reset(FIELD_NO2DUPCHKPSDEFNAME);
    }

    /**
     * 设置 范围属性2，详细说明：{@link #FIELD_NO2DUPCHKPSDEFNAME}
     * <P>
     * 等同 {@link #setNo2DupChkPSDEFName}
     * @param no2DupChkPSDEFName
     */
    @JsonIgnore
    public PSDEField no2dupchkpsdefname(String no2DupChkPSDEFName){
        this.setNo2DupChkPSDEFName(no2DupChkPSDEFName);
        return this;
    }

    /**
     * <B>NO3DUPCHKPSDEFID</B>&nbsp;范围属性3，属性启用重复值检查时指定检查的范围属性3
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_NO3DUPCHKPSDEFID = "no3dupchkpsdefid";

    /**
     * 设置 范围属性3，详细说明：{@link #FIELD_NO3DUPCHKPSDEFID}
     * 
     * @param no3DupChkPSDEFId
     * 
     */
    @JsonProperty(FIELD_NO3DUPCHKPSDEFID)
    public void setNo3DupChkPSDEFId(String no3DupChkPSDEFId){
        this.set(FIELD_NO3DUPCHKPSDEFID, no3DupChkPSDEFId);
    }
    
    /**
     * 获取 范围属性3  
     * @return
     */
    @JsonIgnore
    public String getNo3DupChkPSDEFId(){
        Object objValue = this.get(FIELD_NO3DUPCHKPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 范围属性3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3DupChkPSDEFIdDirty(){
        if(this.contains(FIELD_NO3DUPCHKPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 范围属性3
     */
    @JsonIgnore
    public void resetNo3DupChkPSDEFId(){
        this.reset(FIELD_NO3DUPCHKPSDEFID);
    }

    /**
     * 设置 范围属性3，详细说明：{@link #FIELD_NO3DUPCHKPSDEFID}
     * <P>
     * 等同 {@link #setNo3DupChkPSDEFId}
     * @param no3DupChkPSDEFId
     */
    @JsonIgnore
    public PSDEField no3dupchkpsdefid(String no3DupChkPSDEFId){
        this.setNo3DupChkPSDEFId(no3DupChkPSDEFId);
        return this;
    }

    /**
     * 设置 范围属性3，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNo3DupChkPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEField no3dupchkpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setNo3DupChkPSDEFId(null);
            this.setNo3DupChkPSDEFName(null);
        }
        else{
            this.setNo3DupChkPSDEFId(pSDEField.getPSDEFieldId());
            this.setNo3DupChkPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>NO3DUPCHKPSDEFNAME</B>&nbsp;范围属性3，属性启用重复值检查时指定检查的范围属性3
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NO3DUPCHKPSDEFID}
     */
    public final static String FIELD_NO3DUPCHKPSDEFNAME = "no3dupchkpsdefname";

    /**
     * 设置 范围属性3，详细说明：{@link #FIELD_NO3DUPCHKPSDEFNAME}
     * 
     * @param no3DupChkPSDEFName
     * 
     */
    @JsonProperty(FIELD_NO3DUPCHKPSDEFNAME)
    public void setNo3DupChkPSDEFName(String no3DupChkPSDEFName){
        this.set(FIELD_NO3DUPCHKPSDEFNAME, no3DupChkPSDEFName);
    }
    
    /**
     * 获取 范围属性3  
     * @return
     */
    @JsonIgnore
    public String getNo3DupChkPSDEFName(){
        Object objValue = this.get(FIELD_NO3DUPCHKPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 范围属性3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNo3DupChkPSDEFNameDirty(){
        if(this.contains(FIELD_NO3DUPCHKPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 范围属性3
     */
    @JsonIgnore
    public void resetNo3DupChkPSDEFName(){
        this.reset(FIELD_NO3DUPCHKPSDEFNAME);
    }

    /**
     * 设置 范围属性3，详细说明：{@link #FIELD_NO3DUPCHKPSDEFNAME}
     * <P>
     * 等同 {@link #setNo3DupChkPSDEFName}
     * @param no3DupChkPSDEFName
     */
    @JsonIgnore
    public PSDEField no3dupchkpsdefname(String no3DupChkPSDEFName){
        this.setNo3DupChkPSDEFName(no3DupChkPSDEFName);
        return this;
    }

    /**
     * <B>NULLVALORDER</B>&nbsp;空值排序，指定属性在数据库排序时处理空值的方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBNullValueOrderMode} 
     */
    public final static String FIELD_NULLVALORDER = "nullvalorder";

    /**
     * 设置 空值排序，详细说明：{@link #FIELD_NULLVALORDER}
     * 
     * @param nullValOrder
     * 
     */
    @JsonProperty(FIELD_NULLVALORDER)
    public void setNullValOrder(String nullValOrder){
        this.set(FIELD_NULLVALORDER, nullValOrder);
    }
    
    /**
     * 获取 空值排序  
     * @return
     */
    @JsonIgnore
    public String getNullValOrder(){
        Object objValue = this.get(FIELD_NULLVALORDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 空值排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNullValOrderDirty(){
        if(this.contains(FIELD_NULLVALORDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 空值排序
     */
    @JsonIgnore
    public void resetNullValOrder(){
        this.reset(FIELD_NULLVALORDER);
    }

    /**
     * 设置 空值排序，详细说明：{@link #FIELD_NULLVALORDER}
     * <P>
     * 等同 {@link #setNullValOrder}
     * @param nullValOrder
     */
    @JsonIgnore
    public PSDEField nullvalorder(String nullValOrder){
        this.setNullValOrder(nullValOrder);
        return this;
    }

     /**
     * 设置 空值排序，详细说明：{@link #FIELD_NULLVALORDER}
     * <P>
     * 等同 {@link #setNullValOrder}
     * @param nullValOrder
     */
    @JsonIgnore
    public PSDEField nullvalorder(net.ibizsys.psmodel.core.util.PSModelEnums.DBNullValueOrderMode nullValOrder){
        if(nullValOrder == null){
            this.setNullValOrder(null);
        }
        else{
            this.setNullValOrder(nullValOrder.value);
        }
        return this;
    }

    /**
     * <B>O2MPSDERID</B>&nbsp;一对多关系，属性数据类型支持【一对多关系数据集合】，用于存放关系数据集合，使用该数据类型需指定对应的一对多关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_O2MPSDERID = "o2mpsderid";

    /**
     * 设置 一对多关系，详细说明：{@link #FIELD_O2MPSDERID}
     * 
     * @param o2MPSDERId
     * 
     */
    @JsonProperty(FIELD_O2MPSDERID)
    public void setO2MPSDERId(String o2MPSDERId){
        this.set(FIELD_O2MPSDERID, o2MPSDERId);
    }
    
    /**
     * 获取 一对多关系  
     * @return
     */
    @JsonIgnore
    public String getO2MPSDERId(){
        Object objValue = this.get(FIELD_O2MPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 一对多关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isO2MPSDERIdDirty(){
        if(this.contains(FIELD_O2MPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 一对多关系
     */
    @JsonIgnore
    public void resetO2MPSDERId(){
        this.reset(FIELD_O2MPSDERID);
    }

    /**
     * 设置 一对多关系，详细说明：{@link #FIELD_O2MPSDERID}
     * <P>
     * 等同 {@link #setO2MPSDERId}
     * @param o2MPSDERId
     */
    @JsonIgnore
    public PSDEField o2mpsderid(String o2MPSDERId){
        this.setO2MPSDERId(o2MPSDERId);
        return this;
    }

    /**
     * 设置 一对多关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setO2MPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEField o2mpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setO2MPSDERId(null);
            this.setO2MPSDERName(null);
        }
        else{
            this.setO2MPSDERId(pSDER.getPSDERId());
            this.setO2MPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>O2MPSDERNAME</B>&nbsp;一对多关系，属性数据类型支持【一对多关系数据集合】，用于存放关系数据集合，使用该数据类型需指定对应的一对多关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_O2MPSDERID}
     */
    public final static String FIELD_O2MPSDERNAME = "o2mpsdername";

    /**
     * 设置 一对多关系，详细说明：{@link #FIELD_O2MPSDERNAME}
     * 
     * @param o2MPSDERName
     * 
     */
    @JsonProperty(FIELD_O2MPSDERNAME)
    public void setO2MPSDERName(String o2MPSDERName){
        this.set(FIELD_O2MPSDERNAME, o2MPSDERName);
    }
    
    /**
     * 获取 一对多关系  
     * @return
     */
    @JsonIgnore
    public String getO2MPSDERName(){
        Object objValue = this.get(FIELD_O2MPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 一对多关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isO2MPSDERNameDirty(){
        if(this.contains(FIELD_O2MPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 一对多关系
     */
    @JsonIgnore
    public void resetO2MPSDERName(){
        this.reset(FIELD_O2MPSDERNAME);
    }

    /**
     * 设置 一对多关系，详细说明：{@link #FIELD_O2MPSDERNAME}
     * <P>
     * 等同 {@link #setO2MPSDERName}
     * @param o2MPSDERName
     */
    @JsonIgnore
    public PSDEField o2mpsdername(String o2MPSDERName){
        this.setO2MPSDERName(o2MPSDERName);
        return this;
    }

    /**
     * <B>O2OPSDERID</B>&nbsp;一对一关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_O2OPSDERID = "o2opsderid";

    /**
     * 设置 一对一关系
     * 
     * @param o2OPSDERId
     * 
     */
    @JsonProperty(FIELD_O2OPSDERID)
    public void setO2OPSDERId(String o2OPSDERId){
        this.set(FIELD_O2OPSDERID, o2OPSDERId);
    }
    
    /**
     * 获取 一对一关系  
     * @return
     */
    @JsonIgnore
    public String getO2OPSDERId(){
        Object objValue = this.get(FIELD_O2OPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 一对一关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isO2OPSDERIdDirty(){
        if(this.contains(FIELD_O2OPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 一对一关系
     */
    @JsonIgnore
    public void resetO2OPSDERId(){
        this.reset(FIELD_O2OPSDERID);
    }

    /**
     * 设置 一对一关系
     * <P>
     * 等同 {@link #setO2OPSDERId}
     * @param o2OPSDERId
     */
    @JsonIgnore
    public PSDEField o2opsderid(String o2OPSDERId){
        this.setO2OPSDERId(o2OPSDERId);
        return this;
    }

    /**
     * 设置 一对一关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setO2OPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEField o2opsderid(PSDER pSDER){
        if(pSDER == null){
            this.setO2OPSDERId(null);
            this.setO2OPSDERName(null);
        }
        else{
            this.setO2OPSDERId(pSDER.getPSDERId());
            this.setO2OPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>O2OPSDERNAME</B>&nbsp;一对一关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_O2OPSDERID}
     */
    public final static String FIELD_O2OPSDERNAME = "o2opsdername";

    /**
     * 设置 一对一关系
     * 
     * @param o2OPSDERName
     * 
     */
    @JsonProperty(FIELD_O2OPSDERNAME)
    public void setO2OPSDERName(String o2OPSDERName){
        this.set(FIELD_O2OPSDERNAME, o2OPSDERName);
    }
    
    /**
     * 获取 一对一关系  
     * @return
     */
    @JsonIgnore
    public String getO2OPSDERName(){
        Object objValue = this.get(FIELD_O2OPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 一对一关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isO2OPSDERNameDirty(){
        if(this.contains(FIELD_O2OPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 一对一关系
     */
    @JsonIgnore
    public void resetO2OPSDERName(){
        this.reset(FIELD_O2OPSDERNAME);
    }

    /**
     * 设置 一对一关系
     * <P>
     * 等同 {@link #setO2OPSDERName}
     * @param o2OPSDERName
     */
    @JsonIgnore
    public PSDEField o2opsdername(String o2OPSDERName){
        this.setO2OPSDERName(o2OPSDERName);
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
    public PSDEField ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PASTERESET</B>&nbsp;粘帖重置，指定属性在进行数据复制时是否需要重置，【主键属性】默认为【是】，其它为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PASTERESET = "pastereset";

    /**
     * 设置 粘帖重置，详细说明：{@link #FIELD_PASTERESET}
     * 
     * @param pasteReset
     * 
     */
    @JsonProperty(FIELD_PASTERESET)
    public void setPasteReset(Integer pasteReset){
        this.set(FIELD_PASTERESET, pasteReset);
    }
    
    /**
     * 获取 粘帖重置  
     * @return
     */
    @JsonIgnore
    public Integer getPasteReset(){
        Object objValue = this.get(FIELD_PASTERESET);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 粘帖重置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPasteResetDirty(){
        if(this.contains(FIELD_PASTERESET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 粘帖重置
     */
    @JsonIgnore
    public void resetPasteReset(){
        this.reset(FIELD_PASTERESET);
    }

    /**
     * 设置 粘帖重置，详细说明：{@link #FIELD_PASTERESET}
     * <P>
     * 等同 {@link #setPasteReset}
     * @param pasteReset
     */
    @JsonIgnore
    public PSDEField pastereset(Integer pasteReset){
        this.setPasteReset(pasteReset);
        return this;
    }

     /**
     * 设置 粘帖重置，详细说明：{@link #FIELD_PASTERESET}
     * <P>
     * 等同 {@link #setPasteReset}
     * @param pasteReset
     */
    @JsonIgnore
    public PSDEField pastereset(Boolean pasteReset){
        if(pasteReset == null){
            this.setPasteReset(null);
        }
        else{
            this.setPasteReset(pasteReset?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PHYSICALFIELD</B>&nbsp;物理化属性，指定关系属性是否为物理化属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PHYSICALFIELD = "physicalfield";

    /**
     * 设置 物理化属性，详细说明：{@link #FIELD_PHYSICALFIELD}
     * 
     * @param physicalField
     * 
     */
    @JsonProperty(FIELD_PHYSICALFIELD)
    public void setPhysicalField(Integer physicalField){
        this.set(FIELD_PHYSICALFIELD, physicalField);
    }
    
    /**
     * 获取 物理化属性  
     * @return
     */
    @JsonIgnore
    public Integer getPhysicalField(){
        Object objValue = this.get(FIELD_PHYSICALFIELD);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 物理化属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPhysicalFieldDirty(){
        if(this.contains(FIELD_PHYSICALFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 物理化属性
     */
    @JsonIgnore
    public void resetPhysicalField(){
        this.reset(FIELD_PHYSICALFIELD);
    }

    /**
     * 设置 物理化属性，详细说明：{@link #FIELD_PHYSICALFIELD}
     * <P>
     * 等同 {@link #setPhysicalField}
     * @param physicalField
     */
    @JsonIgnore
    public PSDEField physicalfield(Integer physicalField){
        this.setPhysicalField(physicalField);
        return this;
    }

     /**
     * 设置 物理化属性，详细说明：{@link #FIELD_PHYSICALFIELD}
     * <P>
     * 等同 {@link #setPhysicalField}
     * @param physicalField
     */
    @JsonIgnore
    public PSDEField physicalfield(Boolean physicalField){
        if(physicalField == null){
            this.setPhysicalField(null);
        }
        else{
            this.setPhysicalField(physicalField?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PKEY</B>&nbsp;主键属性，指定属性的主键模式，默认为【否】。每个实体都需要指定一个主键属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FieldPKeyMode} 
     */
    public final static String FIELD_PKEY = "pkey";

    /**
     * 设置 主键属性，详细说明：{@link #FIELD_PKEY}
     * 
     * @param pKey
     * 
     */
    @JsonProperty(FIELD_PKEY)
    public void setPKey(Integer pKey){
        this.set(FIELD_PKEY, pKey);
    }
    
    /**
     * 获取 主键属性  
     * @return
     */
    @JsonIgnore
    public Integer getPKey(){
        Object objValue = this.get(FIELD_PKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 主键属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPKeyDirty(){
        if(this.contains(FIELD_PKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主键属性
     */
    @JsonIgnore
    public void resetPKey(){
        this.reset(FIELD_PKEY);
    }

    /**
     * 设置 主键属性，详细说明：{@link #FIELD_PKEY}
     * <P>
     * 等同 {@link #setPKey}
     * @param pKey
     */
    @JsonIgnore
    public PSDEField pkey(Integer pKey){
        this.setPKey(pKey);
        return this;
    }

     /**
     * 设置 主键属性，详细说明：{@link #FIELD_PKEY}
     * <P>
     * 等同 {@link #setPKey}
     * @param pKey
     */
    @JsonIgnore
    public PSDEField pkey(net.ibizsys.psmodel.core.util.PSModelEnums.FieldPKeyMode pKey){
        if(pKey == null){
            this.setPKey(null);
        }
        else{
            this.setPKey(pKey.value);
        }
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度，指定属性数据类型的浮点精度
     */
    public final static String FIELD_PRECISION = "precision";

    /**
     * 设置 浮点精度，详细说明：{@link #FIELD_PRECISION}
     * 
     * @param precision
     * 
     */
    @JsonProperty(FIELD_PRECISION)
    public void setPrecision(Integer precision){
        this.set(FIELD_PRECISION, precision);
        //属性名称与代码标识不一致，设置属性名称
        this.set("precision2", precision);
    }
    
    /**
     * 获取 浮点精度  
     * @return
     */
    @JsonIgnore
    public Integer getPrecision(){
        Object objValue = this.get(FIELD_PRECISION);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("precision2");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 浮点精度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrecisionDirty(){
        if(this.contains(FIELD_PRECISION)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("precision2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 浮点精度
     */
    @JsonIgnore
    public void resetPrecision(){
        this.reset(FIELD_PRECISION);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("precision2");
    }

    /**
     * 设置 浮点精度，详细说明：{@link #FIELD_PRECISION}
     * <P>
     * 等同 {@link #setPrecision}
     * @param precision
     */
    @JsonIgnore
    public PSDEField precision(Integer precision){
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2(){
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated        
    public void setPrecision2(Integer precision2){
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty(){
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2(){
        this.resetPrecision();
    }

    /**
     * <B>PREDEFINEDTYPEPARAM</B>&nbsp;预定义类型参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PREDEFINEDTYPEPARAM = "predefinedtypeparam";

    /**
     * 设置 预定义类型参数
     * 
     * @param predefinedTypeParam
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPEPARAM)
    public void setPredefinedTypeParam(String predefinedTypeParam){
        this.set(FIELD_PREDEFINEDTYPEPARAM, predefinedTypeParam);
    }
    
    /**
     * 获取 预定义类型参数  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeParam(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeParamDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型参数
     */
    @JsonIgnore
    public void resetPredefinedTypeParam(){
        this.reset(FIELD_PREDEFINEDTYPEPARAM);
    }

    /**
     * 设置 预定义类型参数
     * <P>
     * 等同 {@link #setPredefinedTypeParam}
     * @param predefinedTypeParam
     */
    @JsonIgnore
    public PSDEField predefinedtypeparam(String predefinedTypeParam){
        this.setPredefinedTypeParam(predefinedTypeParam);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;系统预置属性，指定属性作为系统预置属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedFieldType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 系统预置属性，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
        //属性名称与代码标识不一致，设置属性名称
        this.set("predefinetype", predefinedType);
    }
    
    /**
     * 获取 系统预置属性  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("predefinetype");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("predefinetype")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置属性
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("predefinetype");
    }

    /**
     * 设置 系统预置属性，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEField predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 系统预置属性，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEField predefinedtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedFieldType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPreDefineType(){
        return this.getPredefinedType();
    }

    @JsonIgnore
    @Deprecated        
    public void setPreDefineType(String preDefineType){
        this.setPredefinedType(preDefineType);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPreDefineTypeDirty(){
        return this.isPredefinedTypeDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPreDefineType(){
        this.resetPredefinedType();
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定属性绑定的系统代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListId(){
        Object objValue = this.get(FIELD_PSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListIdDirty(){
        if(this.contains(FIELD_PSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDEField pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 系统代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEField pscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定属性绑定的系统代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 系统代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListName(){
        Object objValue = this.get(FIELD_PSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListNameDirty(){
        if(this.contains(FIELD_PSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDEField pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDATATYPEID</B>&nbsp;数据类型，指定属性的数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFDataType} 
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFDataType} 
     */
    public final static String FIELD_PSDATATYPEID = "psdatatypeid";

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_PSDATATYPEID}
     * 
     * @param pSDataTypeId
     * 
     */
    @JsonProperty(FIELD_PSDATATYPEID)
    public void setPSDataTypeId(String pSDataTypeId){
        this.set(FIELD_PSDATATYPEID, pSDataTypeId);
    }
    
    /**
     * 获取 数据类型  
     * @return
     */
    @JsonIgnore
    public String getPSDataTypeId(){
        Object objValue = this.get(FIELD_PSDATATYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDataTypeIdDirty(){
        if(this.contains(FIELD_PSDATATYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型
     */
    @JsonIgnore
    public void resetPSDataTypeId(){
        this.reset(FIELD_PSDATATYPEID);
    }

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_PSDATATYPEID}
     * <P>
     * 等同 {@link #setPSDataTypeId}
     * @param pSDataTypeId
     */
    @JsonIgnore
    public PSDEField psdatatypeid(String pSDataTypeId){
        this.setPSDataTypeId(pSDataTypeId);
        return this;
    }

    /**
     * <B>PSDATATYPENAME</B>&nbsp;数据类型，指定属性的数据类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDATATYPEID}
     */
    public final static String FIELD_PSDATATYPENAME = "psdatatypename";

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_PSDATATYPENAME}
     * 
     * @param pSDataTypeName
     * 
     */
    @JsonProperty(FIELD_PSDATATYPENAME)
    public void setPSDataTypeName(String pSDataTypeName){
        this.set(FIELD_PSDATATYPENAME, pSDataTypeName);
    }
    
    /**
     * 获取 数据类型  
     * @return
     */
    @JsonIgnore
    public String getPSDataTypeName(){
        Object objValue = this.get(FIELD_PSDATATYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDataTypeNameDirty(){
        if(this.contains(FIELD_PSDATATYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型
     */
    @JsonIgnore
    public void resetPSDataTypeName(){
        this.reset(FIELD_PSDATATYPENAME);
    }

    /**
     * 设置 数据类型，详细说明：{@link #FIELD_PSDATATYPENAME}
     * <P>
     * 等同 {@link #setPSDataTypeName}
     * @param pSDataTypeName
     */
    @JsonIgnore
    public PSDEField psdatatypename(String pSDataTypeName){
        this.setPSDataTypeName(pSDataTypeName);
        return this;
    }

    /**
     * <B>PSDEFIELDID</B>&nbsp;实体属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFIELDID = "psdefieldid";

    /**
     * 设置 实体属性标识
     * 
     * @param pSDEFieldId
     * 
     */
    @JsonProperty(FIELD_PSDEFIELDID)
    public void setPSDEFieldId(String pSDEFieldId){
        this.set(FIELD_PSDEFIELDID, pSDEFieldId);
    }
    
    /**
     * 获取 实体属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFieldId(){
        Object objValue = this.get(FIELD_PSDEFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFieldIdDirty(){
        if(this.contains(FIELD_PSDEFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性标识
     */
    @JsonIgnore
    public void resetPSDEFieldId(){
        this.reset(FIELD_PSDEFIELDID);
    }

    /**
     * 设置 实体属性标识
     * <P>
     * 等同 {@link #setPSDEFieldId}
     * @param pSDEFieldId
     */
    @JsonIgnore
    public PSDEField psdefieldid(String pSDEFieldId){
        this.setPSDEFieldId(pSDEFieldId);
        return this;
    }

    /**
     * <B>PSDEFIELDNAME</B>&nbsp;属性标识，指定属性的标识，需要在属性所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 100，由大写字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEFIELDNAME = "psdefieldname";

    /**
     * 设置 属性标识，详细说明：{@link #FIELD_PSDEFIELDNAME}
     * 
     * @param pSDEFieldName
     * 
     */
    @JsonProperty(FIELD_PSDEFIELDNAME)
    public void setPSDEFieldName(String pSDEFieldName){
        this.set(FIELD_PSDEFIELDNAME, pSDEFieldName);
    }
    
    /**
     * 获取 属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFieldName(){
        Object objValue = this.get(FIELD_PSDEFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFieldNameDirty(){
        if(this.contains(FIELD_PSDEFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性标识
     */
    @JsonIgnore
    public void resetPSDEFieldName(){
        this.reset(FIELD_PSDEFIELDNAME);
    }

    /**
     * 设置 属性标识，详细说明：{@link #FIELD_PSDEFIELDNAME}
     * <P>
     * 等同 {@link #setPSDEFieldName}
     * @param pSDEFieldName
     */
    @JsonIgnore
    public PSDEField psdefieldname(String pSDEFieldName){
        this.setPSDEFieldName(pSDEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFieldName(strName);
    }

    @JsonIgnore
    public PSDEField name(String strName){
        this.setPSDEFieldName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定属性所属实体
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
    public PSDEField psdeid(String pSDEId){
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
    public PSDEField psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSSubSysSADEId(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSSubSysSADEId(pSDataEntity.getPSSubSysSADEId());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定属性所属实体
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
    public PSDEField psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定关系属性相应的关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
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
     * 判断 实体关系 是否指定值，包括空值
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
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDEField psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEField psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定关系属性相应的关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
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
     * 判断 实体关系 是否指定值，包括空值
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
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDEField psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDETABLEID</B>&nbsp;实体数据库表标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDBTable} 
     */
    public final static String FIELD_PSDETABLEID = "psdetableid";

    /**
     * 设置 实体数据库表标识
     * 
     * @param pSDETableId
     * 
     */
    @JsonProperty(FIELD_PSDETABLEID)
    public void setPSDETableId(String pSDETableId){
        this.set(FIELD_PSDETABLEID, pSDETableId);
    }
    
    /**
     * 获取 实体数据库表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETableId(){
        Object objValue = this.get(FIELD_PSDETABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETableIdDirty(){
        if(this.contains(FIELD_PSDETABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库表标识
     */
    @JsonIgnore
    public void resetPSDETableId(){
        this.reset(FIELD_PSDETABLEID);
    }

    /**
     * 设置 实体数据库表标识
     * <P>
     * 等同 {@link #setPSDETableId}
     * @param pSDETableId
     */
    @JsonIgnore
    public PSDEField psdetableid(String pSDETableId){
        this.setPSDETableId(pSDETableId);
        return this;
    }

    /**
     * 设置 实体数据库表标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETableId}
     * @param pSDEDBTable 引用对象
     */
    @JsonIgnore
    public PSDEField psdetableid(PSDEDBTable pSDEDBTable){
        if(pSDEDBTable == null){
            this.setPSDETableId(null);
        }
        else{
            this.setPSDETableId(pSDEDBTable.getPSDEDBTableId());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADEFIELDID</B>&nbsp;外部接口实体属性，指定属性所对应的外部接口实体属性，在实体为外部服务接口实体时启用

     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADEField} 
     */
    public final static String FIELD_PSSUBSYSSADEFIELDID = "pssubsyssadefieldid";

    /**
     * 设置 外部接口实体属性，详细说明：{@link #FIELD_PSSUBSYSSADEFIELDID}
     * 
     * @param pSSubSysSADEFieldId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEFIELDID)
    public void setPSSubSysSADEFieldId(String pSSubSysSADEFieldId){
        this.set(FIELD_PSSUBSYSSADEFIELDID, pSSubSysSADEFieldId);
    }
    
    /**
     * 获取 外部接口实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEFieldId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEFieldIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体属性
     */
    @JsonIgnore
    public void resetPSSubSysSADEFieldId(){
        this.reset(FIELD_PSSUBSYSSADEFIELDID);
    }

    /**
     * 设置 外部接口实体属性，详细说明：{@link #FIELD_PSSUBSYSSADEFIELDID}
     * <P>
     * 等同 {@link #setPSSubSysSADEFieldId}
     * @param pSSubSysSADEFieldId
     */
    @JsonIgnore
    public PSDEField pssubsyssadefieldid(String pSSubSysSADEFieldId){
        this.setPSSubSysSADEFieldId(pSSubSysSADEFieldId);
        return this;
    }

    /**
     * 设置 外部接口实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADEFieldId}
     * @param pSSubSysSADEField 引用对象
     */
    @JsonIgnore
    public PSDEField pssubsyssadefieldid(PSSubSysSADEField pSSubSysSADEField){
        if(pSSubSysSADEField == null){
            this.setPSSubSysSADEFieldId(null);
            this.setPSSubSysSADEFieldName(null);
        }
        else{
            this.setPSSubSysSADEFieldId(pSSubSysSADEField.getPSSubSysSADEFieldId());
            this.setPSSubSysSADEFieldName(pSSubSysSADEField.getPSSubSysSADEFieldName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADEFIELDNAME</B>&nbsp;外部接口实体属性，指定属性所对应的外部接口实体属性，在实体为外部服务接口实体时启用

     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADEFIELDID}
     */
    public final static String FIELD_PSSUBSYSSADEFIELDNAME = "pssubsyssadefieldname";

    /**
     * 设置 外部接口实体属性，详细说明：{@link #FIELD_PSSUBSYSSADEFIELDNAME}
     * 
     * @param pSSubSysSADEFieldName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEFIELDNAME)
    public void setPSSubSysSADEFieldName(String pSSubSysSADEFieldName){
        this.set(FIELD_PSSUBSYSSADEFIELDNAME, pSSubSysSADEFieldName);
    }
    
    /**
     * 获取 外部接口实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEFieldName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEFieldNameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体属性
     */
    @JsonIgnore
    public void resetPSSubSysSADEFieldName(){
        this.reset(FIELD_PSSUBSYSSADEFIELDNAME);
    }

    /**
     * 设置 外部接口实体属性，详细说明：{@link #FIELD_PSSUBSYSSADEFIELDNAME}
     * <P>
     * 等同 {@link #setPSSubSysSADEFieldName}
     * @param pSSubSysSADEFieldName
     */
    @JsonIgnore
    public PSDEField pssubsyssadefieldname(String pSSubSysSADEFieldName){
        this.setPSSubSysSADEFieldName(pSSubSysSADEFieldName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;PSSUBSYSSADEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 PSSUBSYSSADEID
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 PSSUBSYSSADEID  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSUBSYSSADEID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSUBSYSSADEID
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 PSSUBSYSSADEID
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSDEField pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * <B>PSSYSDBCOLUMNID</B>&nbsp;数据库列标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBColumn} 
     */
    public final static String FIELD_PSSYSDBCOLUMNID = "pssysdbcolumnid";

    /**
     * 设置 数据库列标识
     * 
     * @param pSSysDBColumnId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBCOLUMNID)
    public void setPSSysDBColumnId(String pSSysDBColumnId){
        this.set(FIELD_PSSYSDBCOLUMNID, pSSysDBColumnId);
    }
    
    /**
     * 获取 数据库列标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBColumnId(){
        Object objValue = this.get(FIELD_PSSYSDBCOLUMNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBColumnIdDirty(){
        if(this.contains(FIELD_PSSYSDBCOLUMNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库列标识
     */
    @JsonIgnore
    public void resetPSSysDBColumnId(){
        this.reset(FIELD_PSSYSDBCOLUMNID);
    }

    /**
     * 设置 数据库列标识
     * <P>
     * 等同 {@link #setPSSysDBColumnId}
     * @param pSSysDBColumnId
     */
    @JsonIgnore
    public PSDEField pssysdbcolumnid(String pSSysDBColumnId){
        this.setPSSysDBColumnId(pSSysDBColumnId);
        return this;
    }

    /**
     * 设置 数据库列标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBColumnId}
     * @param pSSysDBColumn 引用对象
     */
    @JsonIgnore
    public PSDEField pssysdbcolumnid(PSSysDBColumn pSSysDBColumn){
        if(pSSysDBColumn == null){
            this.setPSSysDBColumnId(null);
        }
        else{
            this.setPSSysDBColumnId(pSSysDBColumn.getPSSysDBColumnId());
        }
        return this;
    }

    /**
     * <B>PSSYSSAMPLEVALUEID</B>&nbsp;系统示例值，指定属性的示例值产生对象，示例值一般应用在测试数据的产生
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSampleValue} 
     */
    public final static String FIELD_PSSYSSAMPLEVALUEID = "pssyssamplevalueid";

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUEID}
     * 
     * @param pSSysSampleValueId
     * 
     */
    @JsonProperty(FIELD_PSSYSSAMPLEVALUEID)
    public void setPSSysSampleValueId(String pSSysSampleValueId){
        this.set(FIELD_PSSYSSAMPLEVALUEID, pSSysSampleValueId);
    }
    
    /**
     * 获取 系统示例值  
     * @return
     */
    @JsonIgnore
    public String getPSSysSampleValueId(){
        Object objValue = this.get(FIELD_PSSYSSAMPLEVALUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSampleValueIdDirty(){
        if(this.contains(FIELD_PSSYSSAMPLEVALUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统示例值
     */
    @JsonIgnore
    public void resetPSSysSampleValueId(){
        this.reset(FIELD_PSSYSSAMPLEVALUEID);
    }

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUEID}
     * <P>
     * 等同 {@link #setPSSysSampleValueId}
     * @param pSSysSampleValueId
     */
    @JsonIgnore
    public PSDEField pssyssamplevalueid(String pSSysSampleValueId){
        this.setPSSysSampleValueId(pSSysSampleValueId);
        return this;
    }

    /**
     * 设置 系统示例值，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSampleValueId}
     * @param pSSysSampleValue 引用对象
     */
    @JsonIgnore
    public PSDEField pssyssamplevalueid(PSSysSampleValue pSSysSampleValue){
        if(pSSysSampleValue == null){
            this.setPSSysSampleValueId(null);
            this.setPSSysSampleValueName(null);
        }
        else{
            this.setPSSysSampleValueId(pSSysSampleValue.getPSSysSampleValueId());
            this.setPSSysSampleValueName(pSSysSampleValue.getPSSysSampleValueName());
        }
        return this;
    }

    /**
     * <B>PSSYSSAMPLEVALUENAME</B>&nbsp;系统示例值，指定属性的示例值产生对象，示例值一般应用在测试数据的产生
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSAMPLEVALUEID}
     */
    public final static String FIELD_PSSYSSAMPLEVALUENAME = "pssyssamplevaluename";

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUENAME}
     * 
     * @param pSSysSampleValueName
     * 
     */
    @JsonProperty(FIELD_PSSYSSAMPLEVALUENAME)
    public void setPSSysSampleValueName(String pSSysSampleValueName){
        this.set(FIELD_PSSYSSAMPLEVALUENAME, pSSysSampleValueName);
    }
    
    /**
     * 获取 系统示例值  
     * @return
     */
    @JsonIgnore
    public String getPSSysSampleValueName(){
        Object objValue = this.get(FIELD_PSSYSSAMPLEVALUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSampleValueNameDirty(){
        if(this.contains(FIELD_PSSYSSAMPLEVALUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统示例值
     */
    @JsonIgnore
    public void resetPSSysSampleValueName(){
        this.reset(FIELD_PSSYSSAMPLEVALUENAME);
    }

    /**
     * 设置 系统示例值，详细说明：{@link #FIELD_PSSYSSAMPLEVALUENAME}
     * <P>
     * 等同 {@link #setPSSysSampleValueName}
     * @param pSSysSampleValueName
     */
    @JsonIgnore
    public PSDEField pssyssamplevaluename(String pSSysSampleValueName){
        this.setPSSysSampleValueName(pSSysSampleValueName);
        return this;
    }

    /**
     * <B>PSSYSSEQUENCEID</B>&nbsp;系统值序列
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSequence} 
     */
    public final static String FIELD_PSSYSSEQUENCEID = "pssyssequenceid";

    /**
     * 设置 系统值序列
     * 
     * @param pSSysSequenceId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCEID)
    public void setPSSysSequenceId(String pSSysSequenceId){
        this.set(FIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }
    
    /**
     * 获取 系统值序列  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceId(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值序列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceIdDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值序列
     */
    @JsonIgnore
    public void resetPSSysSequenceId(){
        this.reset(FIELD_PSSYSSEQUENCEID);
    }

    /**
     * 设置 系统值序列
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequenceId
     */
    @JsonIgnore
    public PSDEField pssyssequenceid(String pSSysSequenceId){
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    /**
     * 设置 系统值序列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequence 引用对象
     */
    @JsonIgnore
    public PSDEField pssyssequenceid(PSSysSequence pSSysSequence){
        if(pSSysSequence == null){
            this.setPSSysSequenceId(null);
            this.setPSSysSequenceName(null);
        }
        else{
            this.setPSSysSequenceId(pSSysSequence.getPSSysSequenceId());
            this.setPSSysSequenceName(pSSysSequence.getPSSysSequenceName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEQUENCENAME</B>&nbsp;系统值序列
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEQUENCEID}
     */
    public final static String FIELD_PSSYSSEQUENCENAME = "pssyssequencename";

    /**
     * 设置 系统值序列
     * 
     * @param pSSysSequenceName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCENAME)
    public void setPSSysSequenceName(String pSSysSequenceName){
        this.set(FIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }
    
    /**
     * 获取 系统值序列  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceName(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值序列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceNameDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值序列
     */
    @JsonIgnore
    public void resetPSSysSequenceName(){
        this.reset(FIELD_PSSYSSEQUENCENAME);
    }

    /**
     * 设置 系统值序列
     * <P>
     * 等同 {@link #setPSSysSequenceName}
     * @param pSSysSequenceName
     */
    @JsonIgnore
    public PSDEField pssyssequencename(String pSSysSequenceName){
        this.setPSSysSequenceName(pSSysSequenceName);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORID</B>&nbsp;系统转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_PSSYSTRANSLATORID = "pssystranslatorid";

    /**
     * 设置 系统转换器
     * 
     * @param pSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORID)
    public void setPSSysTranslatorId(String pSSysTranslatorId){
        this.set(FIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }
    
    /**
     * 获取 系统转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorId(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorId(){
        this.reset(FIELD_PSSYSTRANSLATORID);
    }

    /**
     * 设置 系统转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslatorId
     */
    @JsonIgnore
    public PSDEField pssystranslatorid(String pSSysTranslatorId){
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    /**
     * 设置 系统转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEField pssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        }
        else{
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORNAME</B>&nbsp;系统转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTRANSLATORID}
     */
    public final static String FIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";

    /**
     * 设置 系统转换器
     * 
     * @param pSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORNAME)
    public void setPSSysTranslatorName(String pSSysTranslatorName){
        this.set(FIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }
    
    /**
     * 获取 系统转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorName(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorName(){
        this.reset(FIELD_PSSYSTRANSLATORNAME);
    }

    /**
     * 设置 系统转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorName}
     * @param pSSysTranslatorName
     */
    @JsonIgnore
    public PSDEField pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    /**
     * <B>PSSYSUNITID</B>&nbsp;单位，指定属性的单位
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUnit} 
     */
    public final static String FIELD_PSSYSUNITID = "pssysunitid";

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITID}
     * 
     * @param pSSysUnitId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITID)
    public void setPSSysUnitId(String pSSysUnitId){
        this.set(FIELD_PSSYSUNITID, pSSysUnitId);
    }
    
    /**
     * 获取 单位  
     * @return
     */
    @JsonIgnore
    public String getPSSysUnitId(){
        Object objValue = this.get(FIELD_PSSYSUNITID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUnitIdDirty(){
        if(this.contains(FIELD_PSSYSUNITID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位
     */
    @JsonIgnore
    public void resetPSSysUnitId(){
        this.reset(FIELD_PSSYSUNITID);
    }

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITID}
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnitId
     */
    @JsonIgnore
    public PSDEField pssysunitid(String pSSysUnitId){
        this.setPSSysUnitId(pSSysUnitId);
        return this;
    }

    /**
     * 设置 单位，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUnitId}
     * @param pSSysUnit 引用对象
     */
    @JsonIgnore
    public PSDEField pssysunitid(PSSysUnit pSSysUnit){
        if(pSSysUnit == null){
            this.setPSSysUnitId(null);
            this.setPSSysUnitName(null);
        }
        else{
            this.setPSSysUnitId(pSSysUnit.getPSSysUnitId());
            this.setPSSysUnitName(pSSysUnit.getPSSysUnitName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNITNAME</B>&nbsp;单位，指定属性的单位
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNITID}
     */
    public final static String FIELD_PSSYSUNITNAME = "pssysunitname";

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * 
     * @param pSSysUnitName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNITNAME)
    public void setPSSysUnitName(String pSSysUnitName){
        this.set(FIELD_PSSYSUNITNAME, pSSysUnitName);
    }
    
    /**
     * 获取 单位  
     * @return
     */
    @JsonIgnore
    public String getPSSysUnitName(){
        Object objValue = this.get(FIELD_PSSYSUNITNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUnitNameDirty(){
        if(this.contains(FIELD_PSSYSUNITNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位
     */
    @JsonIgnore
    public void resetPSSysUnitName(){
        this.reset(FIELD_PSSYSUNITNAME);
    }

    /**
     * 设置 单位，详细说明：{@link #FIELD_PSSYSUNITNAME}
     * <P>
     * 等同 {@link #setPSSysUnitName}
     * @param pSSysUnitName
     */
    @JsonIgnore
    public PSDEField pssysunitname(String pSSysUnitName){
        this.setPSSysUnitName(pSSysUnitName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;值规则，指定属性的基础值规则，基础值规则与其它规则（最大值、最小值等）一起合成属性的默认值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysValueRule} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSDEField pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSDEField pssysvalueruleid(PSSysValueRule pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;基础值规则，指定属性的基础值规则，基础值规则与其它规则（最大值、最小值等）一起合成属性的默认值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 基础值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 基础值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 基础值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基础值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 基础值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEField pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>QUERYCOLUMN</B>&nbsp;查询输出，指定属性是否作为数据查询的默认输出列，长文本属性（CLOB）默认不输出，其它默认输出
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_QUERYCOLUMN = "querycolumn";

    /**
     * 设置 查询输出，详细说明：{@link #FIELD_QUERYCOLUMN}
     * 
     * @param queryColumn
     * 
     */
    @JsonProperty(FIELD_QUERYCOLUMN)
    public void setQueryColumn(Integer queryColumn){
        this.set(FIELD_QUERYCOLUMN, queryColumn);
    }
    
    /**
     * 获取 查询输出  
     * @return
     */
    @JsonIgnore
    public Integer getQueryColumn(){
        Object objValue = this.get(FIELD_QUERYCOLUMN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 查询输出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueryColumnDirty(){
        if(this.contains(FIELD_QUERYCOLUMN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询输出
     */
    @JsonIgnore
    public void resetQueryColumn(){
        this.reset(FIELD_QUERYCOLUMN);
    }

    /**
     * 设置 查询输出，详细说明：{@link #FIELD_QUERYCOLUMN}
     * <P>
     * 等同 {@link #setQueryColumn}
     * @param queryColumn
     */
    @JsonIgnore
    public PSDEField querycolumn(Integer queryColumn){
        this.setQueryColumn(queryColumn);
        return this;
    }

     /**
     * 设置 查询输出，详细说明：{@link #FIELD_QUERYCOLUMN}
     * <P>
     * 等同 {@link #setQueryColumn}
     * @param queryColumn
     */
    @JsonIgnore
    public PSDEField querycolumn(Boolean queryColumn){
        if(queryColumn == null){
            this.setQueryColumn(null);
        }
        else{
            this.setQueryColumn(queryColumn?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>QUERYCS</B>&nbsp;查询扩展选项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFQueryCSMode} 
     */
    public final static String FIELD_QUERYCS = "querycs";

    /**
     * 设置 查询扩展选项
     * 
     * @param queryCS
     * 
     */
    @JsonProperty(FIELD_QUERYCS)
    public void setQueryCS(String queryCS){
        this.set(FIELD_QUERYCS, queryCS);
    }
    
    /**
     * 获取 查询扩展选项  
     * @return
     */
    @JsonIgnore
    public String getQueryCS(){
        Object objValue = this.get(FIELD_QUERYCS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 查询扩展选项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueryCSDirty(){
        if(this.contains(FIELD_QUERYCS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 查询扩展选项
     */
    @JsonIgnore
    public void resetQueryCS(){
        this.reset(FIELD_QUERYCS);
    }

    /**
     * 设置 查询扩展选项
     * <P>
     * 等同 {@link #setQueryCS}
     * @param queryCS
     */
    @JsonIgnore
    public PSDEField querycs(String queryCS){
        this.setQueryCS(queryCS);
        return this;
    }

     /**
     * 设置 查询扩展选项
     * <P>
     * 等同 {@link #setQueryCS}
     * @param queryCS
     */
    @JsonIgnore
    public PSDEField querycs(net.ibizsys.psmodel.core.util.PSModelEnums.DEFQueryCSMode[] queryCS){
        if(queryCS == null || queryCS.length == 0){
            this.setQueryCS(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEFQueryCSMode _item : queryCS){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setQueryCS(_value);
        }
        return this;
    }

    /**
     * <B>READONLYMODE</B>&nbsp;只读模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFReadOnlyMode} 
     */
    public final static String FIELD_READONLYMODE = "readonlymode";

    /**
     * 设置 只读模式
     * 
     * @param readOnlyMode
     * 
     */
    @JsonProperty(FIELD_READONLYMODE)
    public void setReadOnlyMode(Integer readOnlyMode){
        this.set(FIELD_READONLYMODE, readOnlyMode);
    }
    
    /**
     * 获取 只读模式  
     * @return
     */
    @JsonIgnore
    public Integer getReadOnlyMode(){
        Object objValue = this.get(FIELD_READONLYMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 只读模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadOnlyModeDirty(){
        if(this.contains(FIELD_READONLYMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只读模式
     */
    @JsonIgnore
    public void resetReadOnlyMode(){
        this.reset(FIELD_READONLYMODE);
    }

    /**
     * 设置 只读模式
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSDEField readonlymode(Integer readOnlyMode){
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

     /**
     * 设置 只读模式
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSDEField readonlymode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFReadOnlyMode[] readOnlyMode){
        if(readOnlyMode == null || readOnlyMode.length == 0){
            this.setReadOnlyMode(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEFReadOnlyMode _item : readOnlyMode){
                _value |= _item.value;
            }
            this.setReadOnlyMode(_value);
        }
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELID</B>&nbsp;引用动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";

    /**
     * 设置 引用动态模型
     * 
     * @param refPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELID)
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId){
        this.set(FIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }
    
    /**
     * 获取 引用动态模型  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelId(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用动态模型
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelId(){
        this.reset(FIELD_REFPSSYSDYNAMODELID);
    }

    /**
     * 设置 引用动态模型
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param refPSSysDynaModelId
     */
    @JsonIgnore
    public PSDEField refpssysdynamodelid(String refPSSysDynaModelId){
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 引用动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEField refpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        }
        else{
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELNAME</B>&nbsp;引用动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSDYNAMODELID}
     */
    public final static String FIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";

    /**
     * 设置 引用动态模型
     * 
     * @param refPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELNAME)
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName){
        this.set(FIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }
    
    /**
     * 获取 引用动态模型  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelName(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用动态模型
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelName(){
        this.reset(FIELD_REFPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 引用动态模型
     * <P>
     * 等同 {@link #setRefPSSysDynaModelName}
     * @param refPSSysDynaModelName
     */
    @JsonIgnore
    public PSDEField refpssysdynamodelname(String refPSSysDynaModelName){
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
        return this;
    }

    /**
     * <B>RESTRICTEDPSDEFID</B>&nbsp;限制属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_RESTRICTEDPSDEFID = "restrictedpsdefid";

    /**
     * 设置 限制属性
     * 
     * @param restrictedPSDEFId
     * 
     */
    @JsonProperty(FIELD_RESTRICTEDPSDEFID)
    public void setRestrictedPSDEFId(String restrictedPSDEFId){
        this.set(FIELD_RESTRICTEDPSDEFID, restrictedPSDEFId);
    }
    
    /**
     * 获取 限制属性  
     * @return
     */
    @JsonIgnore
    public String getRestrictedPSDEFId(){
        Object objValue = this.get(FIELD_RESTRICTEDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 限制属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRestrictedPSDEFIdDirty(){
        if(this.contains(FIELD_RESTRICTEDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 限制属性
     */
    @JsonIgnore
    public void resetRestrictedPSDEFId(){
        this.reset(FIELD_RESTRICTEDPSDEFID);
    }

    /**
     * 设置 限制属性
     * <P>
     * 等同 {@link #setRestrictedPSDEFId}
     * @param restrictedPSDEFId
     */
    @JsonIgnore
    public PSDEField restrictedpsdefid(String restrictedPSDEFId){
        this.setRestrictedPSDEFId(restrictedPSDEFId);
        return this;
    }

    /**
     * 设置 限制属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRestrictedPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEField restrictedpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setRestrictedPSDEFId(null);
            this.setRestrictedPSDEFName(null);
        }
        else{
            this.setRestrictedPSDEFId(pSDEField.getPSDEFieldId());
            this.setRestrictedPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>RESTRICTEDPSDEFNAME</B>&nbsp;限制属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RESTRICTEDPSDEFID}
     */
    public final static String FIELD_RESTRICTEDPSDEFNAME = "restrictedpsdefname";

    /**
     * 设置 限制属性
     * 
     * @param restrictedPSDEFName
     * 
     */
    @JsonProperty(FIELD_RESTRICTEDPSDEFNAME)
    public void setRestrictedPSDEFName(String restrictedPSDEFName){
        this.set(FIELD_RESTRICTEDPSDEFNAME, restrictedPSDEFName);
    }
    
    /**
     * 获取 限制属性  
     * @return
     */
    @JsonIgnore
    public String getRestrictedPSDEFName(){
        Object objValue = this.get(FIELD_RESTRICTEDPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 限制属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRestrictedPSDEFNameDirty(){
        if(this.contains(FIELD_RESTRICTEDPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 限制属性
     */
    @JsonIgnore
    public void resetRestrictedPSDEFName(){
        this.reset(FIELD_RESTRICTEDPSDEFNAME);
    }

    /**
     * 设置 限制属性
     * <P>
     * 等同 {@link #setRestrictedPSDEFName}
     * @param restrictedPSDEFName
     */
    @JsonIgnore
    public PSDEField restrictedpsdefname(String restrictedPSDEFName){
        this.setRestrictedPSDEFName(restrictedPSDEFName);
        return this;
    }

    /**
     * <B>SEQUENCEMODE</B>&nbsp;值序列使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFSequenceMode} 
     */
    public final static String FIELD_SEQUENCEMODE = "sequencemode";

    /**
     * 设置 值序列使用
     * 
     * @param sequenceMode
     * 
     */
    @JsonProperty(FIELD_SEQUENCEMODE)
    public void setSequenceMode(String sequenceMode){
        this.set(FIELD_SEQUENCEMODE, sequenceMode);
    }
    
    /**
     * 获取 值序列使用  
     * @return
     */
    @JsonIgnore
    public String getSequenceMode(){
        Object objValue = this.get(FIELD_SEQUENCEMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值序列使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSequenceModeDirty(){
        if(this.contains(FIELD_SEQUENCEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值序列使用
     */
    @JsonIgnore
    public void resetSequenceMode(){
        this.reset(FIELD_SEQUENCEMODE);
    }

    /**
     * 设置 值序列使用
     * <P>
     * 等同 {@link #setSequenceMode}
     * @param sequenceMode
     */
    @JsonIgnore
    public PSDEField sequencemode(String sequenceMode){
        this.setSequenceMode(sequenceMode);
        return this;
    }

     /**
     * 设置 值序列使用
     * <P>
     * 等同 {@link #setSequenceMode}
     * @param sequenceMode
     */
    @JsonIgnore
    public PSDEField sequencemode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFSequenceMode sequenceMode){
        if(sequenceMode == null){
            this.setSequenceMode(null);
        }
        else{
            this.setSequenceMode(sequenceMode.value);
        }
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码标识，指定属性在服务接口实体中的代码标识，不指定则使用属性【代码标识】
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 服务代码标识  
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
     * 判断 服务代码标识 是否指定值，包括空值
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
     * 重置 服务代码标识
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 服务代码标识，详细说明：{@link #FIELD_SERVICECODENAME}
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSDEField servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
        return this;
    }

    /**
     * <B>STATEFIELD</B>&nbsp;主状态属性，指定属性是否作为主状态的识别属性，实体最多使用三个属性来唯一标识数据的状态，默认不作为识别属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMSFieldMode} 
     */
    public final static String FIELD_STATEFIELD = "statefield";

    /**
     * 设置 主状态属性，详细说明：{@link #FIELD_STATEFIELD}
     * 
     * @param stateField
     * 
     */
    @JsonProperty(FIELD_STATEFIELD)
    public void setStateField(String stateField){
        this.set(FIELD_STATEFIELD, stateField);
    }
    
    /**
     * 获取 主状态属性  
     * @return
     */
    @JsonIgnore
    public String getStateField(){
        Object objValue = this.get(FIELD_STATEFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主状态属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStateFieldDirty(){
        if(this.contains(FIELD_STATEFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主状态属性
     */
    @JsonIgnore
    public void resetStateField(){
        this.reset(FIELD_STATEFIELD);
    }

    /**
     * 设置 主状态属性，详细说明：{@link #FIELD_STATEFIELD}
     * <P>
     * 等同 {@link #setStateField}
     * @param stateField
     */
    @JsonIgnore
    public PSDEField statefield(String stateField){
        this.setStateField(stateField);
        return this;
    }

     /**
     * 设置 主状态属性，详细说明：{@link #FIELD_STATEFIELD}
     * <P>
     * 等同 {@link #setStateField}
     * @param stateField
     */
    @JsonIgnore
    public PSDEField statefield(net.ibizsys.psmodel.core.util.PSModelEnums.DEMSFieldMode stateField){
        if(stateField == null){
            this.setStateField(null);
        }
        else{
            this.setStateField(stateField.value);
        }
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型
     * 
     * @param stdDataType
     * 
     */
    @JsonProperty(FIELD_STDDATATYPE)
    public void setStdDataType(Integer stdDataType){
        this.set(FIELD_STDDATATYPE, stdDataType);
    }
    
    /**
     * 获取 标准数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getStdDataType(){
        Object objValue = this.get(FIELD_STDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标准数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStdDataTypeDirty(){
        if(this.contains(FIELD_STDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标准数据类型
     */
    @JsonIgnore
    public void resetStdDataType(){
        this.reset(FIELD_STDDATATYPE);
    }

    /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEField stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSDEField stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>STRINGCASE</B>&nbsp;字符转换，指定属性在数据类型为字符串时默认的处理方式，默认为无处理
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StringCaseMode} 
     */
    public final static String FIELD_STRINGCASE = "stringcase";

    /**
     * 设置 字符转换，详细说明：{@link #FIELD_STRINGCASE}
     * 
     * @param stringCase
     * 
     */
    @JsonProperty(FIELD_STRINGCASE)
    public void setStringCase(String stringCase){
        this.set(FIELD_STRINGCASE, stringCase);
    }
    
    /**
     * 获取 字符转换  
     * @return
     */
    @JsonIgnore
    public String getStringCase(){
        Object objValue = this.get(FIELD_STRINGCASE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字符转换 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStringCaseDirty(){
        if(this.contains(FIELD_STRINGCASE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字符转换
     */
    @JsonIgnore
    public void resetStringCase(){
        this.reset(FIELD_STRINGCASE);
    }

    /**
     * 设置 字符转换，详细说明：{@link #FIELD_STRINGCASE}
     * <P>
     * 等同 {@link #setStringCase}
     * @param stringCase
     */
    @JsonIgnore
    public PSDEField stringcase(String stringCase){
        this.setStringCase(stringCase);
        return this;
    }

     /**
     * 设置 字符转换，详细说明：{@link #FIELD_STRINGCASE}
     * <P>
     * 等同 {@link #setStringCase}
     * @param stringCase
     */
    @JsonIgnore
    public PSDEField stringcase(net.ibizsys.psmodel.core.util.PSModelEnums.StringCaseMode stringCase){
        if(stringCase == null){
            this.setStringCase(null);
        }
        else{
            this.setStringCase(stringCase.value);
        }
        return this;
    }

    /**
     * <B>STRLENGTH</B>&nbsp;字符长度，指定属性的最大字符串长度，该值被应用在属性的默认值规则，不指定时使用属性的数据类型长度
     */
    public final static String FIELD_STRLENGTH = "strlength";

    /**
     * 设置 字符长度，详细说明：{@link #FIELD_STRLENGTH}
     * 
     * @param strLength
     * 
     */
    @JsonProperty(FIELD_STRLENGTH)
    public void setStrLength(Integer strLength){
        this.set(FIELD_STRLENGTH, strLength);
    }
    
    /**
     * 获取 字符长度  
     * @return
     */
    @JsonIgnore
    public Integer getStrLength(){
        Object objValue = this.get(FIELD_STRLENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 字符长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStrLengthDirty(){
        if(this.contains(FIELD_STRLENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字符长度
     */
    @JsonIgnore
    public void resetStrLength(){
        this.reset(FIELD_STRLENGTH);
    }

    /**
     * 设置 字符长度，详细说明：{@link #FIELD_STRLENGTH}
     * <P>
     * 等同 {@link #setStrLength}
     * @param strLength
     */
    @JsonIgnore
    public PSDEField strlength(Integer strLength){
        this.setStrLength(strLength);
        return this;
    }

    /**
     * <B>TABLENAME</B>&nbsp;表名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_TABLENAME = "tablename";

    /**
     * 设置 表名称
     * 
     * @param tableName
     * 
     */
    @JsonProperty(FIELD_TABLENAME)
    public void setTableName(String tableName){
        this.set(FIELD_TABLENAME, tableName);
    }
    
    /**
     * 获取 表名称  
     * @return
     */
    @JsonIgnore
    public String getTableName(){
        Object objValue = this.get(FIELD_TABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableNameDirty(){
        if(this.contains(FIELD_TABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表名称
     */
    @JsonIgnore
    public void resetTableName(){
        this.reset(FIELD_TABLENAME);
    }

    /**
     * 设置 表名称
     * <P>
     * 等同 {@link #setTableName}
     * @param tableName
     */
    @JsonIgnore
    public PSDEField tablename(String tableName){
        this.setTableName(tableName);
        return this;
    }

    /**
     * <B>TABLESCOPE</B>&nbsp;表范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDBTableType} 
     */
    public final static String FIELD_TABLESCOPE = "tablescope";

    /**
     * 设置 表范围
     * 
     * @param tableScope
     * 
     */
    @JsonProperty(FIELD_TABLESCOPE)
    public void setTableScope(String tableScope){
        this.set(FIELD_TABLESCOPE, tableScope);
    }
    
    /**
     * 获取 表范围  
     * @return
     */
    @JsonIgnore
    public String getTableScope(){
        Object objValue = this.get(FIELD_TABLESCOPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableScopeDirty(){
        if(this.contains(FIELD_TABLESCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表范围
     */
    @JsonIgnore
    public void resetTableScope(){
        this.reset(FIELD_TABLESCOPE);
    }

    /**
     * 设置 表范围
     * <P>
     * 等同 {@link #setTableScope}
     * @param tableScope
     */
    @JsonIgnore
    public PSDEField tablescope(String tableScope){
        this.setTableScope(tableScope);
        return this;
    }

     /**
     * 设置 表范围
     * <P>
     * 等同 {@link #setTableScope}
     * @param tableScope
     */
    @JsonIgnore
    public PSDEField tablescope(net.ibizsys.psmodel.core.util.PSModelEnums.DEDBTableType tableScope){
        if(tableScope == null){
            this.setTableScope(null);
        }
        else{
            this.setTableScope(tableScope.value);
        }
        return this;
    }

    /**
     * <B>TESTDATA</B>&nbsp;默认测试值，指定属性的默认测试数据
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TESTDATA = "testdata";

    /**
     * 设置 默认测试值，详细说明：{@link #FIELD_TESTDATA}
     * 
     * @param testData
     * 
     */
    @JsonProperty(FIELD_TESTDATA)
    public void setTestData(String testData){
        this.set(FIELD_TESTDATA, testData);
    }
    
    /**
     * 获取 默认测试值  
     * @return
     */
    @JsonIgnore
    public String getTestData(){
        Object objValue = this.get(FIELD_TESTDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认测试值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestDataDirty(){
        if(this.contains(FIELD_TESTDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认测试值
     */
    @JsonIgnore
    public void resetTestData(){
        this.reset(FIELD_TESTDATA);
    }

    /**
     * 设置 默认测试值，详细说明：{@link #FIELD_TESTDATA}
     * <P>
     * 等同 {@link #setTestData}
     * @param testData
     */
    @JsonIgnore
    public PSDEField testdata(String testData){
        this.setTestData(testData);
        return this;
    }

    /**
     * <B>TRANSLATORMODE</B>&nbsp;值转换使用，指定属性值转换模式，未定义时为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFTranslatorMode} 
     */
    public final static String FIELD_TRANSLATORMODE = "translatormode";

    /**
     * 设置 值转换使用，详细说明：{@link #FIELD_TRANSLATORMODE}
     * 
     * @param translatorMode
     * 
     */
    @JsonProperty(FIELD_TRANSLATORMODE)
    public void setTranslatorMode(String translatorMode){
        this.set(FIELD_TRANSLATORMODE, translatorMode);
    }
    
    /**
     * 获取 值转换使用  
     * @return
     */
    @JsonIgnore
    public String getTranslatorMode(){
        Object objValue = this.get(FIELD_TRANSLATORMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值转换使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTranslatorModeDirty(){
        if(this.contains(FIELD_TRANSLATORMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值转换使用
     */
    @JsonIgnore
    public void resetTranslatorMode(){
        this.reset(FIELD_TRANSLATORMODE);
    }

    /**
     * 设置 值转换使用，详细说明：{@link #FIELD_TRANSLATORMODE}
     * <P>
     * 等同 {@link #setTranslatorMode}
     * @param translatorMode
     */
    @JsonIgnore
    public PSDEField translatormode(String translatorMode){
        this.setTranslatorMode(translatorMode);
        return this;
    }

     /**
     * 设置 值转换使用，详细说明：{@link #FIELD_TRANSLATORMODE}
     * <P>
     * 等同 {@link #setTranslatorMode}
     * @param translatorMode
     */
    @JsonIgnore
    public PSDEField translatormode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFTranslatorMode translatorMode){
        if(translatorMode == null){
            this.setTranslatorMode(null);
        }
        else{
            this.setTranslatorMode(translatorMode.value);
        }
        return this;
    }

    /**
     * <B>UNICODECHAR</B>&nbsp;双字节字符
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_UNICODECHAR = "unicodechar";

    /**
     * 设置 双字节字符
     * 
     * @param unicodeChar
     * 
     */
    @JsonProperty(FIELD_UNICODECHAR)
    public void setUnicodeChar(Integer unicodeChar){
        this.set(FIELD_UNICODECHAR, unicodeChar);
    }
    
    /**
     * 获取 双字节字符  
     * @return
     */
    @JsonIgnore
    public Integer getUnicodeChar(){
        Object objValue = this.get(FIELD_UNICODECHAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 双字节字符 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnicodeCharDirty(){
        if(this.contains(FIELD_UNICODECHAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 双字节字符
     */
    @JsonIgnore
    public void resetUnicodeChar(){
        this.reset(FIELD_UNICODECHAR);
    }

    /**
     * 设置 双字节字符
     * <P>
     * 等同 {@link #setUnicodeChar}
     * @param unicodeChar
     */
    @JsonIgnore
    public PSDEField unicodechar(Integer unicodeChar){
        this.setUnicodeChar(unicodeChar);
        return this;
    }

     /**
     * 设置 双字节字符
     * <P>
     * 等同 {@link #setUnicodeChar}
     * @param unicodeChar
     */
    @JsonIgnore
    public PSDEField unicodechar(Boolean unicodeChar){
        if(unicodeChar == null){
            this.setUnicodeChar(null);
        }
        else{
            this.setUnicodeChar(unicodeChar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>UNIONKEYVALUE</B>&nbsp;联合键值，指定属性是否参与联合键值计算，实体支持由多个属性的值哈希得出数据的识别标记
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UnionKeyValueMode} 
     */
    public final static String FIELD_UNIONKEYVALUE = "unionkeyvalue";

    /**
     * 设置 联合键值，详细说明：{@link #FIELD_UNIONKEYVALUE}
     * 
     * @param unionKeyValue
     * 
     */
    @JsonProperty(FIELD_UNIONKEYVALUE)
    public void setUnionKeyValue(String unionKeyValue){
        this.set(FIELD_UNIONKEYVALUE, unionKeyValue);
    }
    
    /**
     * 获取 联合键值  
     * @return
     */
    @JsonIgnore
    public String getUnionKeyValue(){
        Object objValue = this.get(FIELD_UNIONKEYVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 联合键值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnionKeyValueDirty(){
        if(this.contains(FIELD_UNIONKEYVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 联合键值
     */
    @JsonIgnore
    public void resetUnionKeyValue(){
        this.reset(FIELD_UNIONKEYVALUE);
    }

    /**
     * 设置 联合键值，详细说明：{@link #FIELD_UNIONKEYVALUE}
     * <P>
     * 等同 {@link #setUnionKeyValue}
     * @param unionKeyValue
     */
    @JsonIgnore
    public PSDEField unionkeyvalue(String unionKeyValue){
        this.setUnionKeyValue(unionKeyValue);
        return this;
    }

     /**
     * 设置 联合键值，详细说明：{@link #FIELD_UNIONKEYVALUE}
     * <P>
     * 等同 {@link #setUnionKeyValue}
     * @param unionKeyValue
     */
    @JsonIgnore
    public PSDEField unionkeyvalue(net.ibizsys.psmodel.core.util.PSModelEnums.UnionKeyValueMode unionKeyValue){
        if(unionKeyValue == null){
            this.setUnionKeyValue(null);
        }
        else{
            this.setUnionKeyValue(unionKeyValue.value);
        }
        return this;
    }

    /**
     * <B>UNIT</B>&nbsp;单位
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_UNIT = "unit";

    /**
     * 设置 单位
     * 
     * @param unit
     * 
     */
    @JsonProperty(FIELD_UNIT)
    public void setUnit(String unit){
        this.set(FIELD_UNIT, unit);
    }
    
    /**
     * 获取 单位  
     * @return
     */
    @JsonIgnore
    public String getUnit(){
        Object objValue = this.get(FIELD_UNIT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnitDirty(){
        if(this.contains(FIELD_UNIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位
     */
    @JsonIgnore
    public void resetUnit(){
        this.reset(FIELD_UNIT);
    }

    /**
     * 设置 单位
     * <P>
     * 等同 {@link #setUnit}
     * @param unit
     */
    @JsonIgnore
    public PSDEField unit(String unit){
        this.setUnit(unit);
        return this;
    }

    /**
     * <B>UNITWIDTH</B>&nbsp;单位宽度
     */
    public final static String FIELD_UNITWIDTH = "unitwidth";

    /**
     * 设置 单位宽度
     * 
     * @param unitWidth
     * 
     */
    @JsonProperty(FIELD_UNITWIDTH)
    public void setUnitWidth(Integer unitWidth){
        this.set(FIELD_UNITWIDTH, unitWidth);
    }
    
    /**
     * 获取 单位宽度  
     * @return
     */
    @JsonIgnore
    public Integer getUnitWidth(){
        Object objValue = this.get(FIELD_UNITWIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 单位宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUnitWidthDirty(){
        if(this.contains(FIELD_UNITWIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单位宽度
     */
    @JsonIgnore
    public void resetUnitWidth(){
        this.reset(FIELD_UNITWIDTH);
    }

    /**
     * 设置 单位宽度
     * <P>
     * 等同 {@link #setUnitWidth}
     * @param unitWidth
     */
    @JsonIgnore
    public PSDEField unitwidth(Integer unitWidth){
        this.setUnitWidth(unitWidth);
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
    public PSDEField updatedate(String updateDate){
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
    public PSDEField updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>UPDATEOVMODE</B>&nbsp;更新旧值回填
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OldValueUpdateMode} 
     */
    public final static String FIELD_UPDATEOVMODE = "updateovmode";

    /**
     * 设置 更新旧值回填
     * 
     * @param updateOVMode
     * 
     */
    @JsonProperty(FIELD_UPDATEOVMODE)
    public void setUpdateOVMode(String updateOVMode){
        this.set(FIELD_UPDATEOVMODE, updateOVMode);
    }
    
    /**
     * 获取 更新旧值回填  
     * @return
     */
    @JsonIgnore
    public String getUpdateOVMode(){
        Object objValue = this.get(FIELD_UPDATEOVMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新旧值回填 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateOVModeDirty(){
        if(this.contains(FIELD_UPDATEOVMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新旧值回填
     */
    @JsonIgnore
    public void resetUpdateOVMode(){
        this.reset(FIELD_UPDATEOVMODE);
    }

    /**
     * 设置 更新旧值回填
     * <P>
     * 等同 {@link #setUpdateOVMode}
     * @param updateOVMode
     */
    @JsonIgnore
    public PSDEField updateovmode(String updateOVMode){
        this.setUpdateOVMode(updateOVMode);
        return this;
    }

     /**
     * 设置 更新旧值回填
     * <P>
     * 等同 {@link #setUpdateOVMode}
     * @param updateOVMode
     */
    @JsonIgnore
    public PSDEField updateovmode(net.ibizsys.psmodel.core.util.PSModelEnums.OldValueUpdateMode updateOVMode){
        if(updateOVMode == null){
            this.setUpdateOVMode(null);
        }
        else{
            this.setUpdateOVMode(updateOVMode.value);
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
    public PSDEField usercat(String userCat){
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
    public PSDEField usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEField userparams(String userParams){
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
    public PSDEField usertag(String userTag){
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
    public PSDEField usertag2(String userTag2){
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
    public PSDEField usertag3(String userTag3){
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
    public PSDEField usertag4(String userTag4){
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
    public PSDEField validflag(Integer validFlag){
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
    public PSDEField validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定属性的默认值格式化串，未定义时使用属性类型逻辑的默认定义
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VALUEFORMAT = "valueformat";

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * 
     * @param valueFormat
     * 
     */
    @JsonProperty(FIELD_VALUEFORMAT)
    public void setValueFormat(String valueFormat){
        this.set(FIELD_VALUEFORMAT, valueFormat);
    }
    
    /**
     * 获取 值格式化  
     * @return
     */
    @JsonIgnore
    public String getValueFormat(){
        Object objValue = this.get(FIELD_VALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFormatDirty(){
        if(this.contains(FIELD_VALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值格式化
     */
    @JsonIgnore
    public void resetValueFormat(){
        this.reset(FIELD_VALUEFORMAT);
    }

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * <P>
     * 等同 {@link #setValueFormat}
     * @param valueFormat
     */
    @JsonIgnore
    public PSDEField valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUEPSDEFID</B>&nbsp;值项属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_VALUEPSDEFID = "valuepsdefid";

    /**
     * 设置 值项属性
     * 
     * @param valuePSDEFId
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFID)
    public void setValuePSDEFId(String valuePSDEFId){
        this.set(FIELD_VALUEPSDEFID, valuePSDEFId);
    }
    
    /**
     * 获取 值项属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFId(){
        Object objValue = this.get(FIELD_VALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值项属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFIdDirty(){
        if(this.contains(FIELD_VALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值项属性
     */
    @JsonIgnore
    public void resetValuePSDEFId(){
        this.reset(FIELD_VALUEPSDEFID);
    }

    /**
     * 设置 值项属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param valuePSDEFId
     */
    @JsonIgnore
    public PSDEField valuepsdefid(String valuePSDEFId){
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    /**
     * 设置 值项属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEField valuepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        }
        else{
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFNAME</B>&nbsp;值项属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_VALUEPSDEFID}
     */
    public final static String FIELD_VALUEPSDEFNAME = "valuepsdefname";

    /**
     * 设置 值项属性
     * 
     * @param valuePSDEFName
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFNAME)
    public void setValuePSDEFName(String valuePSDEFName){
        this.set(FIELD_VALUEPSDEFNAME, valuePSDEFName);
    }
    
    /**
     * 获取 值项属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFName(){
        Object objValue = this.get(FIELD_VALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值项属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFNameDirty(){
        if(this.contains(FIELD_VALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值项属性
     */
    @JsonIgnore
    public void resetValuePSDEFName(){
        this.reset(FIELD_VALUEPSDEFNAME);
    }

    /**
     * 设置 值项属性
     * <P>
     * 等同 {@link #setValuePSDEFName}
     * @param valuePSDEFName
     */
    @JsonIgnore
    public PSDEField valuepsdefname(String valuePSDEFName){
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    /**
     * <B>VIEWCOLLEVEL</B>&nbsp;查询列级别，属性的查询模式，未指定时物理属性为【2级（无行外数据）】，其余为全部数据
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFieldViewColLevel} 
     */
    public final static String FIELD_VIEWCOLLEVEL = "viewcollevel";

    /**
     * 设置 查询列级别，详细说明：{@link #FIELD_VIEWCOLLEVEL}
     * 
     * @param viewColLevel
     * 
     */
    @JsonProperty(FIELD_VIEWCOLLEVEL)
    public void setViewColLevel(Integer viewColLevel){
        this.set(FIELD_VIEWCOLLEVEL, viewColLevel);
    }
    
    /**
     * 获取 查询列级别  
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
     * 判断 查询列级别 是否指定值，包括空值
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
     * 重置 查询列级别
     */
    @JsonIgnore
    public void resetViewColLevel(){
        this.reset(FIELD_VIEWCOLLEVEL);
    }

    /**
     * 设置 查询列级别，详细说明：{@link #FIELD_VIEWCOLLEVEL}
     * <P>
     * 等同 {@link #setViewColLevel}
     * @param viewColLevel
     */
    @JsonIgnore
    public PSDEField viewcollevel(Integer viewColLevel){
        this.setViewColLevel(viewColLevel);
        return this;
    }

     /**
     * 设置 查询列级别，详细说明：{@link #FIELD_VIEWCOLLEVEL}
     * <P>
     * 等同 {@link #setViewColLevel}
     * @param viewColLevel
     */
    @JsonIgnore
    public PSDEField viewcollevel(net.ibizsys.psmodel.core.util.PSModelEnums.DEFieldViewColLevel viewColLevel){
        if(viewColLevel == null){
            this.setViewColLevel(null);
        }
        else{
            this.setViewColLevel(viewColLevel.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFieldId(strValue);
    }

    @JsonIgnore
    public PSDEField id(String strValue){
        this.setPSDEFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEField){
            PSDEField model = (PSDEField)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
