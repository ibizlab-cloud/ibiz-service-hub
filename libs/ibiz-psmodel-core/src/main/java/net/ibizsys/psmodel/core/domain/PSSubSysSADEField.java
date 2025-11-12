package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSUBSYSSADEFIELD</B>外部接口实体属性 模型传输对象
 * <P>
 * 外部接口实体属性模型，定义外部接口实体对象的属性，包括数据类型，代码表等信息
 */
public class PSSubSysSADEField extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSubSysSADEField(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许为空，指定外部接口实体属性是否允许输入空，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许为空，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许为空  
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
     * 判断 允许为空 是否指定值，包括空值
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
     * 重置 允许为空
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许为空，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSSubSysSADEField allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许为空，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSSubSysSADEField allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ARRAYFLAG = "arrayflag";

    /**
     * 设置 是否数组
     * 
     * @param arrayFlag
     * 
     */
    @JsonProperty(FIELD_ARRAYFLAG)
    public void setArrayFlag(Integer arrayFlag){
        this.set(FIELD_ARRAYFLAG, arrayFlag);
    }
    
    /**
     * 获取 是否数组  
     * @return
     */
    @JsonIgnore
    public Integer getArrayFlag(){
        Object objValue = this.get(FIELD_ARRAYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否数组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isArrayFlagDirty(){
        if(this.contains(FIELD_ARRAYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否数组
     */
    @JsonIgnore
    public void resetArrayFlag(){
        this.reset(FIELD_ARRAYFLAG);
    }

    /**
     * 设置 是否数组
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSSubSysSADEField arrayflag(Integer arrayFlag){
        this.setArrayFlag(arrayFlag);
        return this;
    }

     /**
     * 设置 是否数组
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSSubSysSADEField arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定外部接口实体属性的代码标识，需在所属接口实体中具备唯一性
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
    public PSSubSysSADEField codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定外部接口实体属性的代码标识2
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSSubSysSADEField codename2(String codeName2){
        this.setCodeName2(codeName2);
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
    public PSSubSysSADEField createdate(String createDate){
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
    public PSSubSysSADEField createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值，指定外部接口实体属性的默认值
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
    public PSSubSysSADEField defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>EXAMPLEVALUE</B>&nbsp;示例值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EXAMPLEVALUE = "examplevalue";

    /**
     * 设置 示例值
     * 
     * @param exampleValue
     * 
     */
    @JsonProperty(FIELD_EXAMPLEVALUE)
    public void setExampleValue(String exampleValue){
        this.set(FIELD_EXAMPLEVALUE, exampleValue);
    }
    
    /**
     * 获取 示例值  
     * @return
     */
    @JsonIgnore
    public String getExampleValue(){
        Object objValue = this.get(FIELD_EXAMPLEVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExampleValueDirty(){
        if(this.contains(FIELD_EXAMPLEVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 示例值
     */
    @JsonIgnore
    public void resetExampleValue(){
        this.reset(FIELD_EXAMPLEVALUE);
    }

    /**
     * 设置 示例值
     * <P>
     * 等同 {@link #setExampleValue}
     * @param exampleValue
     */
    @JsonIgnore
    public PSSubSysSADEField examplevalue(String exampleValue){
        this.setExampleValue(exampleValue);
        return this;
    }

    /**
     * <B>FIELDTAG</B>&nbsp;属性标记，指定外部接口实体属性的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDTAG = "fieldtag";

    /**
     * 设置 属性标记，详细说明：{@link #FIELD_FIELDTAG}
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
     * 设置 属性标记，详细说明：{@link #FIELD_FIELDTAG}
     * <P>
     * 等同 {@link #setFieldTag}
     * @param fieldTag
     */
    @JsonIgnore
    public PSSubSysSADEField fieldtag(String fieldTag){
        this.setFieldTag(fieldTag);
        return this;
    }

    /**
     * <B>FIELDTAG2</B>&nbsp;属性标记2，指定外部接口实体属性的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDTAG2 = "fieldtag2";

    /**
     * 设置 属性标记2，详细说明：{@link #FIELD_FIELDTAG2}
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
     * 设置 属性标记2，详细说明：{@link #FIELD_FIELDTAG2}
     * <P>
     * 等同 {@link #setFieldTag2}
     * @param fieldTag2
     */
    @JsonIgnore
    public PSSubSysSADEField fieldtag2(String fieldTag2){
        this.setFieldTag2(fieldTag2);
        return this;
    }

    /**
     * <B>FIELDTYPE</B>&nbsp;属性类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADEFieldType} 
     */
    public final static String FIELD_FIELDTYPE = "fieldtype";

    /**
     * 设置 属性类型
     * 
     * @param fieldType
     * 
     */
    @JsonProperty(FIELD_FIELDTYPE)
    public void setFieldType(String fieldType){
        this.set(FIELD_FIELDTYPE, fieldType);
    }
    
    /**
     * 获取 属性类型  
     * @return
     */
    @JsonIgnore
    public String getFieldType(){
        Object objValue = this.get(FIELD_FIELDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldTypeDirty(){
        if(this.contains(FIELD_FIELDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性类型
     */
    @JsonIgnore
    public void resetFieldType(){
        this.reset(FIELD_FIELDTYPE);
    }

    /**
     * 设置 属性类型
     * <P>
     * 等同 {@link #setFieldType}
     * @param fieldType
     */
    @JsonIgnore
    public PSSubSysSADEField fieldtype(String fieldType){
        this.setFieldType(fieldType);
        return this;
    }

     /**
     * 设置 属性类型
     * <P>
     * 等同 {@link #setFieldType}
     * @param fieldType
     */
    @JsonIgnore
    public PSSubSysSADEField fieldtype(net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADEFieldType fieldType){
        if(fieldType == null){
            this.setFieldType(null);
        }
        else{
            this.setFieldType(fieldType.value);
        }
        return this;
    }

    /**
     * <B>LENGTH</B>&nbsp;长度或精度，指定外部接口实体属性数据类型的长度，未定义时为【0】
     */
    public final static String FIELD_LENGTH = "length";

    /**
     * 设置 长度或精度，详细说明：{@link #FIELD_LENGTH}
     * 
     * @param length
     * 
     */
    @JsonProperty(FIELD_LENGTH)
    public void setLength(Integer length){
        this.set(FIELD_LENGTH, length);
    }
    
    /**
     * 获取 长度或精度  
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
     * 判断 长度或精度 是否指定值，包括空值
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
     * 重置 长度或精度
     */
    @JsonIgnore
    public void resetLength(){
        this.reset(FIELD_LENGTH);
    }

    /**
     * 设置 长度或精度，详细说明：{@link #FIELD_LENGTH}
     * <P>
     * 等同 {@link #setLength}
     * @param length
     */
    @JsonIgnore
    public PSSubSysSADEField length(Integer length){
        this.setLength(length);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定外部接口实体属性的逻辑名称
     * <P>
     * 字符串：最大长度 200
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
    public PSSubSysSADEField logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORFIELD</B>&nbsp;主属性，指定外部接口实体属性是否为主信息属性，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MAJORFIELD = "majorfield";

    /**
     * 设置 主属性，详细说明：{@link #FIELD_MAJORFIELD}
     * 
     * @param majorField
     * 
     */
    @JsonProperty(FIELD_MAJORFIELD)
    public void setMajorField(Integer majorField){
        this.set(FIELD_MAJORFIELD, majorField);
    }
    
    /**
     * 获取 主属性  
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
     * 判断 主属性 是否指定值，包括空值
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
     * 重置 主属性
     */
    @JsonIgnore
    public void resetMajorField(){
        this.reset(FIELD_MAJORFIELD);
    }

    /**
     * 设置 主属性，详细说明：{@link #FIELD_MAJORFIELD}
     * <P>
     * 等同 {@link #setMajorField}
     * @param majorField
     */
    @JsonIgnore
    public PSSubSysSADEField majorfield(Integer majorField){
        this.setMajorField(majorField);
        return this;
    }

     /**
     * 设置 主属性，详细说明：{@link #FIELD_MAJORFIELD}
     * <P>
     * 等同 {@link #setMajorField}
     * @param majorField
     */
    @JsonIgnore
    public PSSubSysSADEField majorfield(Boolean majorField){
        if(majorField == null){
            this.setMajorField(null);
        }
        else{
            this.setMajorField(majorField?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MAXVALUE = "maxvalue";

    /**
     * 设置 最大值
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
     * 设置 最大值
     * <P>
     * 等同 {@link #setMaxValue}
     * @param maxValue
     */
    @JsonIgnore
    public PSSubSysSADEField maxvalue(String maxValue){
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
    public PSSubSysSADEField memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINSTRLENGTH</B>&nbsp;最小字符长度
     */
    public final static String FIELD_MINSTRLENGTH = "minstrlength";

    /**
     * 设置 最小字符长度
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
     * 设置 最小字符长度
     * <P>
     * 等同 {@link #setMinStrLength}
     * @param minStrLength
     */
    @JsonIgnore
    public PSSubSysSADEField minstrlength(Integer minStrLength){
        this.setMinStrLength(minStrLength);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MINVALUE = "minvalue";

    /**
     * 设置 最小值
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
     * 设置 最小值
     * <P>
     * 等同 {@link #setMinValue}
     * @param minValue
     */
    @JsonIgnore
    public PSSubSysSADEField minvalue(String minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定外部接口实体属性的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSubSysSADEField ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PKEY</B>&nbsp;主键属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FieldPKeyMode} 
     */
    public final static String FIELD_PKEY = "pkey";

    /**
     * 设置 主键属性
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
     * 设置 主键属性
     * <P>
     * 等同 {@link #setPKey}
     * @param pKey
     */
    @JsonIgnore
    public PSSubSysSADEField pkey(Integer pKey){
        this.setPKey(pKey);
        return this;
    }

     /**
     * 设置 主键属性
     * <P>
     * 等同 {@link #setPKey}
     * @param pKey
     */
    @JsonIgnore
    public PSSubSysSADEField pkey(net.ibizsys.psmodel.core.util.PSModelEnums.FieldPKeyMode pKey){
        if(pKey == null){
            this.setPKey(null);
        }
        else{
            this.setPKey(pKey.value);
        }
        return this;
    }

    /**
     * <B>SCALE</B>&nbsp;小数位数，指定外部接口实体属性数据类型的小数位数，未定义时为【-1】
     */
    public final static String FIELD_SCALE = "scale";

    /**
     * 设置 小数位数，详细说明：{@link #FIELD_SCALE}
     * 
     * @param scale
     * 
     */
    @JsonProperty(FIELD_SCALE)
    public void setScale(Integer scale){
        this.set(FIELD_SCALE, scale);
        //属性名称与代码标识不一致，设置属性名称
        this.set("precision2", scale);
    }
    
    /**
     * 获取 小数位数  
     * @return
     */
    @JsonIgnore
    public Integer getScale(){
        Object objValue = this.get(FIELD_SCALE);
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
     * 判断 小数位数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isScaleDirty(){
        if(this.contains(FIELD_SCALE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("precision2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 小数位数
     */
    @JsonIgnore
    public void resetScale(){
        this.reset(FIELD_SCALE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("precision2");
    }

    /**
     * 设置 小数位数，详细说明：{@link #FIELD_SCALE}
     * <P>
     * 等同 {@link #setScale}
     * @param scale
     */
    @JsonIgnore
    public PSSubSysSADEField scale(Integer scale){
        this.setScale(scale);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2(){
        return this.getScale();
    }

    @JsonIgnore
    @Deprecated        
    public void setPrecision2(Integer precision2){
        this.setScale(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty(){
        return this.isScaleDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2(){
        this.resetScale();
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADEFieldPredefinedType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
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
     * 判断 预定义类型 是否指定值，包括空值
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
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSubSysSADEField predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSSubSysSADEField predefinedtype(net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADEFieldPredefinedType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表，指定外部接口实体属性的代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSSubSysSADEField pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSSubSysSADEField pscodelistid(PSCodeList pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;代码表，指定外部接口实体属性的代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSSubSysSADEField pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDATATYPEID</B>&nbsp;数据类型，指定外部接口实体属性的数据类型
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
    public PSSubSysSADEField psdatatypeid(String pSDataTypeId){
        this.setPSDataTypeId(pSDataTypeId);
        return this;
    }

    /**
     * <B>PSDATATYPENAME</B>&nbsp;数据类型，指定外部接口实体属性的数据类型
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
    public PSSubSysSADEField psdatatypename(String pSDataTypeName){
        this.setPSDataTypeName(pSDataTypeName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEFIELDID</B>&nbsp;接口实体属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBSYSSADEFIELDID = "pssubsyssadefieldid";

    /**
     * 设置 接口实体属性标识
     * 
     * @param pSSubSysSADEFieldId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEFIELDID)
    public void setPSSubSysSADEFieldId(String pSSubSysSADEFieldId){
        this.set(FIELD_PSSUBSYSSADEFIELDID, pSSubSysSADEFieldId);
    }
    
    /**
     * 获取 接口实体属性标识  
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
     * 判断 接口实体属性标识 是否指定值，包括空值
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
     * 重置 接口实体属性标识
     */
    @JsonIgnore
    public void resetPSSubSysSADEFieldId(){
        this.reset(FIELD_PSSUBSYSSADEFIELDID);
    }

    /**
     * 设置 接口实体属性标识
     * <P>
     * 等同 {@link #setPSSubSysSADEFieldId}
     * @param pSSubSysSADEFieldId
     */
    @JsonIgnore
    public PSSubSysSADEField pssubsyssadefieldid(String pSSubSysSADEFieldId){
        this.setPSSubSysSADEFieldId(pSSubSysSADEFieldId);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEFIELDNAME</B>&nbsp;属性名称，指定外部接口实体属性名称，需在所属接口实体中具备唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSUBSYSSADEFIELDNAME = "pssubsyssadefieldname";

    /**
     * 设置 属性名称，详细说明：{@link #FIELD_PSSUBSYSSADEFIELDNAME}
     * 
     * @param pSSubSysSADEFieldName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEFIELDNAME)
    public void setPSSubSysSADEFieldName(String pSSubSysSADEFieldName){
        this.set(FIELD_PSSUBSYSSADEFIELDNAME, pSSubSysSADEFieldName);
    }
    
    /**
     * 获取 属性名称  
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
     * 判断 属性名称 是否指定值，包括空值
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
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetPSSubSysSADEFieldName(){
        this.reset(FIELD_PSSUBSYSSADEFIELDNAME);
    }

    /**
     * 设置 属性名称，详细说明：{@link #FIELD_PSSUBSYSSADEFIELDNAME}
     * <P>
     * 等同 {@link #setPSSubSysSADEFieldName}
     * @param pSSubSysSADEFieldName
     */
    @JsonIgnore
    public PSSubSysSADEField pssubsyssadefieldname(String pSSubSysSADEFieldName){
        this.setPSSubSysSADEFieldName(pSSubSysSADEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSubSysSADEFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSubSysSADEFieldName(strName);
    }

    @JsonIgnore
    public PSSubSysSADEField name(String strName){
        this.setPSSubSysSADEFieldName(strName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;子系统接口实体，指定外部接口实体属性所属接口实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 子系统接口实体，详细说明：{@link #FIELD_PSSUBSYSSADEID}
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 子系统接口实体  
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
     * 判断 子系统接口实体 是否指定值，包括空值
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
     * 重置 子系统接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 子系统接口实体，详细说明：{@link #FIELD_PSSUBSYSSADEID}
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADEField pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * 设置 子系统接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADEField pssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
            this.setPSSubSysServiceAPIId(null);
        }
        else{
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
            this.setPSSubSysServiceAPIId(pSSubSysSADE.getPSSubSysServiceAPIId());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADENAME</B>&nbsp;接口实体，指定外部接口实体属性所属接口实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADEID}
     */
    public final static String FIELD_PSSUBSYSSADENAME = "pssubsyssadename";

    /**
     * 设置 接口实体，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * 
     * @param pSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADENAME)
    public void setPSSubSysSADEName(String pSSubSysSADEName){
        this.set(FIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }
    
    /**
     * 获取 接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADENameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEName(){
        this.reset(FIELD_PSSUBSYSSADENAME);
    }

    /**
     * 设置 接口实体，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * <P>
     * 等同 {@link #setPSSubSysSADEName}
     * @param pSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADEField pssubsyssadename(String pSSubSysSADEName){
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;PSSUBSYSSERVICEAPIID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADEID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 PSSUBSYSSERVICEAPIID
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 PSSUBSYSSERVICEAPIID  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSUBSYSSERVICEAPIID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSUBSYSSERVICEAPIID
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 PSSUBSYSSERVICEAPIID
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSubSysSADEField pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysValueRule} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 值规则
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
     * 设置 值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSSubSysSADEField pssysvalueruleid(String pSSysValueRuleId){
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
    public PSSubSysSADEField pssysvalueruleid(PSSysValueRule pSSysValueRule){
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
     * <B>PSSYSVALUERULENAME</B>&nbsp;值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 值规则
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 值规则  
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
     * 判断 值规则 是否指定值，包括空值
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
     * 重置 值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSSubSysSADEField pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>REFPSSUBSYSSADEID</B>&nbsp;引用接口实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_REFPSSUBSYSSADEID = "refpssubsyssadeid";

    /**
     * 设置 引用接口实体
     * 
     * @param refPSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_REFPSSUBSYSSADEID)
    public void setRefPSSubSysSADEId(String refPSSubSysSADEId){
        this.set(FIELD_REFPSSUBSYSSADEID, refPSSubSysSADEId);
    }
    
    /**
     * 获取 引用接口实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSSubSysSADEId(){
        Object objValue = this.get(FIELD_REFPSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_REFPSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用接口实体
     */
    @JsonIgnore
    public void resetRefPSSubSysSADEId(){
        this.reset(FIELD_REFPSSUBSYSSADEID);
    }

    /**
     * 设置 引用接口实体
     * <P>
     * 等同 {@link #setRefPSSubSysSADEId}
     * @param refPSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADEField refpssubsyssadeid(String refPSSubSysSADEId){
        this.setRefPSSubSysSADEId(refPSSubSysSADEId);
        return this;
    }

    /**
     * 设置 引用接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADEField refpssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setRefPSSubSysSADEId(null);
            this.setRefPSSubSysSADEName(null);
        }
        else{
            this.setRefPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setRefPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>REFPSSUBSYSSADENAME</B>&nbsp;引用接口实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSUBSYSSADEID}
     */
    public final static String FIELD_REFPSSUBSYSSADENAME = "refpssubsyssadename";

    /**
     * 设置 引用接口实体
     * 
     * @param refPSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_REFPSSUBSYSSADENAME)
    public void setRefPSSubSysSADEName(String refPSSubSysSADEName){
        this.set(FIELD_REFPSSUBSYSSADENAME, refPSSubSysSADEName);
    }
    
    /**
     * 获取 引用接口实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSSubSysSADEName(){
        Object objValue = this.get(FIELD_REFPSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSubSysSADENameDirty(){
        if(this.contains(FIELD_REFPSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用接口实体
     */
    @JsonIgnore
    public void resetRefPSSubSysSADEName(){
        this.reset(FIELD_REFPSSUBSYSSADENAME);
    }

    /**
     * 设置 引用接口实体
     * <P>
     * 等同 {@link #setRefPSSubSysSADEName}
     * @param refPSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADEField refpssubsyssadename(String refPSSubSysSADEName){
        this.setRefPSSubSysSADEName(refPSSubSysSADEName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型，指定外部接口实体属性的标准数据类型，未定义时为【VARCHAR】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
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
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSubSysSADEField stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSubSysSADEField stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
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
    public PSSubSysSADEField updatedate(String updateDate){
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
    public PSSubSysSADEField updateman(String updateMan){
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
    public PSSubSysSADEField usercat(String userCat){
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
    public PSSubSysSADEField usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSubSysSADEField usertag(String userTag){
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
    public PSSubSysSADEField usertag2(String userTag2){
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
    public PSSubSysSADEField usertag3(String userTag3){
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
    public PSSubSysSADEField usertag4(String userTag4){
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
    public PSSubSysSADEField validflag(Integer validFlag){
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
    public PSSubSysSADEField validflag(Boolean validFlag){
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
        return this.getPSSubSysSADEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSubSysSADEFieldId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADEField id(String strValue){
        this.setPSSubSysSADEFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSubSysSADEField){
            PSSubSysSADEField model = (PSSubSysSADEField)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
