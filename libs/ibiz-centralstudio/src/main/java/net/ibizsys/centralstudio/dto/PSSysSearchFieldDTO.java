package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSSEARCHFIELD</B>全文检索属性 模型传输对象
 * <P>
 * 全文检索文档属性模型，定义属性的类型、索引模式等
 */
public class PSSysSearchFieldDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysSearchFieldDTO(){
    }      

    /**
     * <B>ANALYZER</B>&nbsp;分析器，指定检索文档属性的分析器
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ANALYZER = "analyzer";

    /**
     * 设置 分析器，详细说明：{@link #FIELD_ANALYZER}
     * 
     * @param analyzer
     * 
     */
    @JsonProperty(FIELD_ANALYZER)
    public void setAnalyzer(String analyzer){
        this.set(FIELD_ANALYZER, analyzer);
    }
    
    /**
     * 获取 分析器  
     * @return
     */
    @JsonIgnore
    public String getAnalyzer(){
        Object objValue = this.get(FIELD_ANALYZER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分析器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAnalyzerDirty(){
        if(this.contains(FIELD_ANALYZER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分析器
     */
    @JsonIgnore
    public void resetAnalyzer(){
        this.reset(FIELD_ANALYZER);
    }

    /**
     * 设置 分析器，详细说明：{@link #FIELD_ANALYZER}
     * <P>
     * 等同 {@link #setAnalyzer}
     * @param analyzer
     */
    @JsonIgnore
    public PSSysSearchFieldDTO analyzer(String analyzer){
        this.setAnalyzer(analyzer);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定检索文档属性的代码标识，需在所在检索文档中具备唯一性
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
    public PSSysSearchFieldDTO codename(String codeName){
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
    public PSSysSearchFieldDTO createdate(Timestamp createDate){
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
    public PSSysSearchFieldDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATEFORMAT</B>&nbsp;日期格式化，指定检索文档属性的日期格式化串
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DATEFORMAT = "dateformat";

    /**
     * 设置 日期格式化，详细说明：{@link #FIELD_DATEFORMAT}
     * 
     * @param dateFormat
     * 
     */
    @JsonProperty(FIELD_DATEFORMAT)
    public void setDateFormat(String dateFormat){
        this.set(FIELD_DATEFORMAT, dateFormat);
    }
    
    /**
     * 获取 日期格式化  
     * @return
     */
    @JsonIgnore
    public String getDateFormat(){
        Object objValue = this.get(FIELD_DATEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 日期格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDateFormatDirty(){
        if(this.contains(FIELD_DATEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 日期格式化
     */
    @JsonIgnore
    public void resetDateFormat(){
        this.reset(FIELD_DATEFORMAT);
    }

    /**
     * 设置 日期格式化，详细说明：{@link #FIELD_DATEFORMAT}
     * <P>
     * 等同 {@link #setDateFormat}
     * @param dateFormat
     */
    @JsonIgnore
    public PSSysSearchFieldDTO dateformat(String dateFormat){
        this.setDateFormat(dateFormat);
        return this;
    }

    /**
     * <B>FIELDDATAFLAG</B>&nbsp;是否属性数据，指定检索文档属性是否启用属性数据模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FIELDDATAFLAG = "fielddataflag";

    /**
     * 设置 是否属性数据，详细说明：{@link #FIELD_FIELDDATAFLAG}
     * 
     * @param fieldDataFlag
     * 
     */
    @JsonProperty(FIELD_FIELDDATAFLAG)
    public void setFieldDataFlag(Integer fieldDataFlag){
        this.set(FIELD_FIELDDATAFLAG, fieldDataFlag);
    }
    
    /**
     * 获取 是否属性数据  
     * @return
     */
    @JsonIgnore
    public Integer getFieldDataFlag(){
        Object objValue = this.get(FIELD_FIELDDATAFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否属性数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldDataFlagDirty(){
        if(this.contains(FIELD_FIELDDATAFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否属性数据
     */
    @JsonIgnore
    public void resetFieldDataFlag(){
        this.reset(FIELD_FIELDDATAFLAG);
    }

    /**
     * 设置 是否属性数据，详细说明：{@link #FIELD_FIELDDATAFLAG}
     * <P>
     * 等同 {@link #setFieldDataFlag}
     * @param fieldDataFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO fielddataflag(Integer fieldDataFlag){
        this.setFieldDataFlag(fieldDataFlag);
        return this;
    }

     /**
     * 设置 是否属性数据，详细说明：{@link #FIELD_FIELDDATAFLAG}
     * <P>
     * 等同 {@link #setFieldDataFlag}
     * @param fieldDataFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO fielddataflag(Boolean fieldDataFlag){
        if(fieldDataFlag == null){
            this.setFieldDataFlag(null);
        }
        else{
            this.setFieldDataFlag(fieldDataFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FIELDTAG</B>&nbsp;属性标记
     * <P>
     * 字符串：最大长度 200
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
    public PSSysSearchFieldDTO fieldtag(String fieldTag){
        this.setFieldTag(fieldTag);
        return this;
    }

    /**
     * <B>FIELDTAG2</B>&nbsp;属性标记2
     * <P>
     * 字符串：最大长度 200
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
    public PSSysSearchFieldDTO fieldtag2(String fieldTag2){
        this.setFieldTag2(fieldTag2);
        return this;
    }

    /**
     * <B>FIELDTYPE</B>&nbsp;属性类型，指定检索文档属性的数据类型，未定义时为【Auto】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SearchFieldDataType} 
     */
    public final static String FIELD_FIELDTYPE = "fieldtype";

    /**
     * 设置 属性类型，详细说明：{@link #FIELD_FIELDTYPE}
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
     * 设置 属性类型，详细说明：{@link #FIELD_FIELDTYPE}
     * <P>
     * 等同 {@link #setFieldType}
     * @param fieldType
     */
    @JsonIgnore
    public PSSysSearchFieldDTO fieldtype(String fieldType){
        this.setFieldType(fieldType);
        return this;
    }

     /**
     * 设置 属性类型，详细说明：{@link #FIELD_FIELDTYPE}
     * <P>
     * 等同 {@link #setFieldType}
     * @param fieldType
     */
    @JsonIgnore
    public PSSysSearchFieldDTO fieldtype(net.ibizsys.model.PSModelEnums.SearchFieldDataType fieldType){
        if(fieldType == null){
            this.setFieldType(null);
        }
        else{
            this.setFieldType(fieldType.value);
        }
        return this;
    }

    /**
     * <B>IGNOREFIELDS</B>&nbsp;忽略属性，指定忽略索引的属性值集合，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_IGNOREFIELDS = "ignorefields";

    /**
     * 设置 忽略属性，详细说明：{@link #FIELD_IGNOREFIELDS}
     * 
     * @param ignoreFields
     * 
     */
    @JsonProperty(FIELD_IGNOREFIELDS)
    public void setIgnoreFields(String ignoreFields){
        this.set(FIELD_IGNOREFIELDS, ignoreFields);
    }
    
    /**
     * 获取 忽略属性  
     * @return
     */
    @JsonIgnore
    public String getIgnoreFields(){
        Object objValue = this.get(FIELD_IGNOREFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 忽略属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreFieldsDirty(){
        if(this.contains(FIELD_IGNOREFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略属性
     */
    @JsonIgnore
    public void resetIgnoreFields(){
        this.reset(FIELD_IGNOREFIELDS);
    }

    /**
     * 设置 忽略属性，详细说明：{@link #FIELD_IGNOREFIELDS}
     * <P>
     * 等同 {@link #setIgnoreFields}
     * @param ignoreFields
     */
    @JsonIgnore
    public PSSysSearchFieldDTO ignorefields(String ignoreFields){
        this.setIgnoreFields(ignoreFields);
        return this;
    }

    /**
     * <B>INCINPARENTFLAG</B>&nbsp;是否在父中，指定检索属性是否包含在父中，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCINPARENTFLAG = "incinparentflag";

    /**
     * 设置 是否在父中，详细说明：{@link #FIELD_INCINPARENTFLAG}
     * 
     * @param incInParentFlag
     * 
     */
    @JsonProperty(FIELD_INCINPARENTFLAG)
    public void setIncInParentFlag(Integer incInParentFlag){
        this.set(FIELD_INCINPARENTFLAG, incInParentFlag);
    }
    
    /**
     * 获取 是否在父中  
     * @return
     */
    @JsonIgnore
    public Integer getIncInParentFlag(){
        Object objValue = this.get(FIELD_INCINPARENTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否在父中 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncInParentFlagDirty(){
        if(this.contains(FIELD_INCINPARENTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否在父中
     */
    @JsonIgnore
    public void resetIncInParentFlag(){
        this.reset(FIELD_INCINPARENTFLAG);
    }

    /**
     * 设置 是否在父中，详细说明：{@link #FIELD_INCINPARENTFLAG}
     * <P>
     * 等同 {@link #setIncInParentFlag}
     * @param incInParentFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO incinparentflag(Integer incInParentFlag){
        this.setIncInParentFlag(incInParentFlag);
        return this;
    }

     /**
     * 设置 是否在父中，详细说明：{@link #FIELD_INCINPARENTFLAG}
     * <P>
     * 等同 {@link #setIncInParentFlag}
     * @param incInParentFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO incinparentflag(Boolean incInParentFlag){
        if(incInParentFlag == null){
            this.setIncInParentFlag(null);
        }
        else{
            this.setIncInParentFlag(incInParentFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INDEXFLAG</B>&nbsp;是否索引，指定是否索引该属性，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INDEXFLAG = "indexflag";

    /**
     * 设置 是否索引，详细说明：{@link #FIELD_INDEXFLAG}
     * 
     * @param indexFlag
     * 
     */
    @JsonProperty(FIELD_INDEXFLAG)
    public void setIndexFlag(Integer indexFlag){
        this.set(FIELD_INDEXFLAG, indexFlag);
    }
    
    /**
     * 获取 是否索引  
     * @return
     */
    @JsonIgnore
    public Integer getIndexFlag(){
        Object objValue = this.get(FIELD_INDEXFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否索引 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIndexFlagDirty(){
        if(this.contains(FIELD_INDEXFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否索引
     */
    @JsonIgnore
    public void resetIndexFlag(){
        this.reset(FIELD_INDEXFLAG);
    }

    /**
     * 设置 是否索引，详细说明：{@link #FIELD_INDEXFLAG}
     * <P>
     * 等同 {@link #setIndexFlag}
     * @param indexFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO indexflag(Integer indexFlag){
        this.setIndexFlag(indexFlag);
        return this;
    }

     /**
     * 设置 是否索引，详细说明：{@link #FIELD_INDEXFLAG}
     * <P>
     * 等同 {@link #setIndexFlag}
     * @param indexFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO indexflag(Boolean indexFlag){
        if(indexFlag == null){
            this.setIndexFlag(null);
        }
        else{
            this.setIndexFlag(indexFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定检索文档属性的逻辑名称
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
    public PSSysSearchFieldDTO logicname(String logicName){
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
    public PSSysSearchFieldDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;次序，指定检索文档属性的排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 次序  
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
     * 判断 次序 是否指定值，包括空值
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
     * 重置 次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysSearchFieldDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PATTERN</B>&nbsp;模式，指定检索文档属性的模式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PATTERN = "pattern";

    /**
     * 设置 模式，详细说明：{@link #FIELD_PATTERN}
     * 
     * @param pattern
     * 
     */
    @JsonProperty(FIELD_PATTERN)
    public void setPattern(String pattern){
        this.set(FIELD_PATTERN, pattern);
    }
    
    /**
     * 获取 模式  
     * @return
     */
    @JsonIgnore
    public String getPattern(){
        Object objValue = this.get(FIELD_PATTERN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPatternDirty(){
        if(this.contains(FIELD_PATTERN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模式
     */
    @JsonIgnore
    public void resetPattern(){
        this.reset(FIELD_PATTERN);
    }

    /**
     * 设置 模式，详细说明：{@link #FIELD_PATTERN}
     * <P>
     * 等同 {@link #setPattern}
     * @param pattern
     */
    @JsonIgnore
    public PSSysSearchFieldDTO pattern(String pattern){
        this.setPattern(pattern);
        return this;
    }

    /**
     * <B>PKEY</B>&nbsp;主键属性，指定检索文档属性的是否为主键，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysSearchFieldDTO pkey(Integer pKey){
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
    public PSSysSearchFieldDTO pkey(Boolean pKey){
        if(pKey == null){
            this.setPKey(null);
        }
        else{
            this.setPKey(pKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCID</B>&nbsp;全文检索文档，指定检索属性所在的全文检索文档
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchDocDTO} 
     */
    public final static String FIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCID}
     * 
     * @param pSSysSearchDocId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCID)
    public void setPSSysSearchDocId(String pSSysSearchDocId){
        this.set(FIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocId(){
        this.reset(FIELD_PSSYSSEARCHDOCID);
    }

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCID}
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDocId
     */
    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchdocid(String pSSysSearchDocId){
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    /**
     * 设置 全文检索文档，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDoc 引用对象
     */
    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchdocid(PSSysSearchDocDTO pSSysSearchDoc){
        if(pSSysSearchDoc == null){
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        }
        else{
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCNAME</B>&nbsp;全文检索文档，指定检索属性所在的全文检索文档
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHDOCID}
     */
    public final static String FIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCNAME}
     * 
     * @param pSSysSearchDocName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCNAME)
    public void setPSSysSearchDocName(String pSSysSearchDocName){
        this.set(FIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocName(){
        this.reset(FIELD_PSSYSSEARCHDOCNAME);
    }

    /**
     * 设置 全文检索文档，详细说明：{@link #FIELD_PSSYSSEARCHDOCNAME}
     * <P>
     * 等同 {@link #setPSSysSearchDocName}
     * @param pSSysSearchDocName
     */
    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchdocname(String pSSysSearchDocName){
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHFIELDID</B>&nbsp;检索属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSEARCHFIELDID = "pssyssearchfieldid";

    /**
     * 设置 检索属性标识
     * 
     * @param pSSysSearchFieldId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHFIELDID)
    public void setPSSysSearchFieldId(String pSSysSearchFieldId){
        this.set(FIELD_PSSYSSEARCHFIELDID, pSSysSearchFieldId);
    }
    
    /**
     * 获取 检索属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchFieldId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchFieldIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索属性标识
     */
    @JsonIgnore
    public void resetPSSysSearchFieldId(){
        this.reset(FIELD_PSSYSSEARCHFIELDID);
    }

    /**
     * 设置 检索属性标识
     * <P>
     * 等同 {@link #setPSSysSearchFieldId}
     * @param pSSysSearchFieldId
     */
    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchfieldid(String pSSysSearchFieldId){
        this.setPSSysSearchFieldId(pSSysSearchFieldId);
        return this;
    }

    /**
     * <B>PSSYSSEARCHFIELDNAME</B>&nbsp;检索属性名称，指定检索属性的名称，需在所在的全文检索文档中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSSEARCHFIELDNAME = "pssyssearchfieldname";

    /**
     * 设置 检索属性名称，详细说明：{@link #FIELD_PSSYSSEARCHFIELDNAME}
     * 
     * @param pSSysSearchFieldName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHFIELDNAME)
    public void setPSSysSearchFieldName(String pSSysSearchFieldName){
        this.set(FIELD_PSSYSSEARCHFIELDNAME, pSSysSearchFieldName);
    }
    
    /**
     * 获取 检索属性名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchFieldName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchFieldNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索属性名称
     */
    @JsonIgnore
    public void resetPSSysSearchFieldName(){
        this.reset(FIELD_PSSYSSEARCHFIELDNAME);
    }

    /**
     * 设置 检索属性名称，详细说明：{@link #FIELD_PSSYSSEARCHFIELDNAME}
     * <P>
     * 等同 {@link #setPSSysSearchFieldName}
     * @param pSSysSearchFieldName
     */
    @JsonIgnore
    public PSSysSearchFieldDTO pssyssearchfieldname(String pSSysSearchFieldName){
        this.setPSSysSearchFieldName(pSSysSearchFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysSearchFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysSearchFieldName(strName);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO name(String strName){
        this.setPSSysSearchFieldName(strName);
        return this;
    }

    /**
     * <B>SEARCHANALYZER</B>&nbsp;检索分析器，指定属性的检索分析器
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SEARCHANALYZER = "searchanalyzer";

    /**
     * 设置 检索分析器，详细说明：{@link #FIELD_SEARCHANALYZER}
     * 
     * @param searchAnalyzer
     * 
     */
    @JsonProperty(FIELD_SEARCHANALYZER)
    public void setSearchAnalyzer(String searchAnalyzer){
        this.set(FIELD_SEARCHANALYZER, searchAnalyzer);
    }
    
    /**
     * 获取 检索分析器  
     * @return
     */
    @JsonIgnore
    public String getSearchAnalyzer(){
        Object objValue = this.get(FIELD_SEARCHANALYZER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 检索分析器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchAnalyzerDirty(){
        if(this.contains(FIELD_SEARCHANALYZER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检索分析器
     */
    @JsonIgnore
    public void resetSearchAnalyzer(){
        this.reset(FIELD_SEARCHANALYZER);
    }

    /**
     * 设置 检索分析器，详细说明：{@link #FIELD_SEARCHANALYZER}
     * <P>
     * 等同 {@link #setSearchAnalyzer}
     * @param searchAnalyzer
     */
    @JsonIgnore
    public PSSysSearchFieldDTO searchanalyzer(String searchAnalyzer){
        this.setSearchAnalyzer(searchAnalyzer);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型，指定检索属性的标准数据类型，未定义时为【UNKNOWN】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.StdDataType} 
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
    public PSSysSearchFieldDTO stddatatype(Integer stdDataType){
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
    public PSSysSearchFieldDTO stddatatype(net.ibizsys.model.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
        }
        return this;
    }

    /**
     * <B>STOREFLAG</B>&nbsp;是否存储，指定检索属性是否需要存储，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STOREFLAG = "storeflag";

    /**
     * 设置 是否存储，详细说明：{@link #FIELD_STOREFLAG}
     * 
     * @param storeFlag
     * 
     */
    @JsonProperty(FIELD_STOREFLAG)
    public void setStoreFlag(Integer storeFlag){
        this.set(FIELD_STOREFLAG, storeFlag);
    }
    
    /**
     * 获取 是否存储  
     * @return
     */
    @JsonIgnore
    public Integer getStoreFlag(){
        Object objValue = this.get(FIELD_STOREFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否存储 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStoreFlagDirty(){
        if(this.contains(FIELD_STOREFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否存储
     */
    @JsonIgnore
    public void resetStoreFlag(){
        this.reset(FIELD_STOREFLAG);
    }

    /**
     * 设置 是否存储，详细说明：{@link #FIELD_STOREFLAG}
     * <P>
     * 等同 {@link #setStoreFlag}
     * @param storeFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO storeflag(Integer storeFlag){
        this.setStoreFlag(storeFlag);
        return this;
    }

     /**
     * 设置 是否存储，详细说明：{@link #FIELD_STOREFLAG}
     * <P>
     * 等同 {@link #setStoreFlag}
     * @param storeFlag
     */
    @JsonIgnore
    public PSSysSearchFieldDTO storeflag(Boolean storeFlag){
        if(storeFlag == null){
            this.setStoreFlag(null);
        }
        else{
            this.setStoreFlag(storeFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysSearchFieldDTO updatedate(Timestamp updateDate){
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
    public PSSysSearchFieldDTO updateman(String updateMan){
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
    public PSSysSearchFieldDTO usercat(String userCat){
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
    public PSSysSearchFieldDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysSearchFieldDTO usertag(String userTag){
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
    public PSSysSearchFieldDTO usertag2(String userTag2){
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
    public PSSysSearchFieldDTO usertag3(String userTag3){
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
    public PSSysSearchFieldDTO usertag4(String userTag4){
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
    public PSSysSearchFieldDTO validflag(Integer validFlag){
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
    public PSSysSearchFieldDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysSearchFieldId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysSearchFieldId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysSearchFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysSearchFieldId(strValue);
    }

    @JsonIgnore
    public PSSysSearchFieldDTO id(String strValue){
        this.setPSSysSearchFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysSearchFieldDTO){
            PSSysSearchFieldDTO dto = (PSSysSearchFieldDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
