package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEFDTCOL</B>属性数据库列 模型传输对象
 * <P>
 * 实体属性的数据库列配置模型，支持属性针对特定数据库类型的进行额外配置
 */
public class PSDEFDTCol extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFDTCol(){
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
    public PSDEFDTCol createdate(String createDate){
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
    public PSDEFDTCol createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDATATYPE</B>&nbsp;自定义数据类型，指定是否自定义属性列的数据类型，未定义为【否】。引擎暂不支持此配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMDATATYPE = "customdatatype";

    /**
     * 设置 自定义数据类型，详细说明：{@link #FIELD_CUSTOMDATATYPE}
     * 
     * @param customDataType
     * 
     */
    @JsonProperty(FIELD_CUSTOMDATATYPE)
    public void setCustomDataType(Integer customDataType){
        this.set(FIELD_CUSTOMDATATYPE, customDataType);
    }
    
    /**
     * 获取 自定义数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getCustomDataType(){
        Object objValue = this.get(FIELD_CUSTOMDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomDataTypeDirty(){
        if(this.contains(FIELD_CUSTOMDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据类型
     */
    @JsonIgnore
    public void resetCustomDataType(){
        this.reset(FIELD_CUSTOMDATATYPE);
    }

    /**
     * 设置 自定义数据类型，详细说明：{@link #FIELD_CUSTOMDATATYPE}
     * <P>
     * 等同 {@link #setCustomDataType}
     * @param customDataType
     */
    @JsonIgnore
    public PSDEFDTCol customdatatype(Integer customDataType){
        this.setCustomDataType(customDataType);
        return this;
    }

     /**
     * 设置 自定义数据类型，详细说明：{@link #FIELD_CUSTOMDATATYPE}
     * <P>
     * 等同 {@link #setCustomDataType}
     * @param customDataType
     */
    @JsonIgnore
    public PSDEFDTCol customdatatype(Boolean customDataType){
        if(customDataType == null){
            this.setCustomDataType(null);
        }
        else{
            this.setCustomDataType(customDataType?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATATYPE</B>&nbsp;数据类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DATATYPE = "datatype";

    /**
     * 设置 数据类型
     * 
     * @param dataType
     * 
     */
    @JsonProperty(FIELD_DATATYPE)
    public void setDataType(String dataType){
        this.set(FIELD_DATATYPE, dataType);
    }
    
    /**
     * 获取 数据类型  
     * @return
     */
    @JsonIgnore
    public String getDataType(){
        Object objValue = this.get(FIELD_DATATYPE);
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
    public boolean isDataTypeDirty(){
        if(this.contains(FIELD_DATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型
     */
    @JsonIgnore
    public void resetDataType(){
        this.reset(FIELD_DATATYPE);
    }

    /**
     * 设置 数据类型
     * <P>
     * 等同 {@link #setDataType}
     * @param dataType
     */
    @JsonIgnore
    public PSDEFDTCol datatype(String dataType){
        this.setDataType(dataType);
        return this;
    }

    /**
     * <B>DBTYPE</B>&nbsp;数据库类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_DBTYPE = "dbtype";

    /**
     * 设置 数据库类型
     * 
     * @param dBType
     * 
     */
    @JsonProperty(FIELD_DBTYPE)
    public void setDBType(String dBType){
        this.set(FIELD_DBTYPE, dBType);
    }
    
    /**
     * 获取 数据库类型  
     * @return
     */
    @JsonIgnore
    public String getDBType(){
        Object objValue = this.get(FIELD_DBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBTypeDirty(){
        if(this.contains(FIELD_DBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库类型
     */
    @JsonIgnore
    public void resetDBType(){
        this.reset(FIELD_DBTYPE);
    }

    /**
     * 设置 数据库类型
     * <P>
     * 等同 {@link #setDBType}
     * @param dBType
     */
    @JsonIgnore
    public PSDEFDTCol dbtype(String dBType){
        this.setDBType(dBType);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;数据库默认值，指定属性列的数据库默认值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 数据库默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 数据库默认值  
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
     * 判断 数据库默认值 是否指定值，包括空值
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
     * 重置 数据库默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 数据库默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDEFDTCol defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>FORMULAFIELDS</B>&nbsp;逻辑属性参数，指定公式属性列格式参数集合，多个参数使用分号（；）分隔，未定义时使用属性配置
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FORMULAFIELDS = "formulafields";

    /**
     * 设置 逻辑属性参数，详细说明：{@link #FIELD_FORMULAFIELDS}
     * 
     * @param formulaFields
     * 
     */
    @JsonProperty(FIELD_FORMULAFIELDS)
    public void setFormulaFields(String formulaFields){
        this.set(FIELD_FORMULAFIELDS, formulaFields);
    }
    
    /**
     * 获取 逻辑属性参数  
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
     * 判断 逻辑属性参数 是否指定值，包括空值
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
     * 重置 逻辑属性参数
     */
    @JsonIgnore
    public void resetFormulaFields(){
        this.reset(FIELD_FORMULAFIELDS);
    }

    /**
     * 设置 逻辑属性参数，详细说明：{@link #FIELD_FORMULAFIELDS}
     * <P>
     * 等同 {@link #setFormulaFields}
     * @param formulaFields
     */
    @JsonIgnore
    public PSDEFDTCol formulafields(String formulaFields){
        this.setFormulaFields(formulaFields);
        return this;
    }

    /**
     * <B>FORMULAFORMAT</B>&nbsp;逻辑字段格式，指定公式属性列格式，如存在公式属性参数，可使用java字符串格式化占位符号： %1$s、 %2$s...进行参数占位，未定义时使用属性配置
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_FORMULAFORMAT = "formulaformat";

    /**
     * 设置 逻辑字段格式，详细说明：{@link #FIELD_FORMULAFORMAT}
     * 
     * @param formulaFormat
     * 
     */
    @JsonProperty(FIELD_FORMULAFORMAT)
    public void setFormulaFormat(String formulaFormat){
        this.set(FIELD_FORMULAFORMAT, formulaFormat);
    }
    
    /**
     * 获取 逻辑字段格式  
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
     * 判断 逻辑字段格式 是否指定值，包括空值
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
     * 重置 逻辑字段格式
     */
    @JsonIgnore
    public void resetFormulaFormat(){
        this.reset(FIELD_FORMULAFORMAT);
    }

    /**
     * 设置 逻辑字段格式，详细说明：{@link #FIELD_FORMULAFORMAT}
     * <P>
     * 等同 {@link #setFormulaFormat}
     * @param formulaFormat
     */
    @JsonIgnore
    public PSDEFDTCol formulaformat(String formulaFormat){
        this.setFormulaFormat(formulaFormat);
        return this;
    }

    /**
     * <B>LENGTH</B>&nbsp;长度，指定属性列的数据类型长度，未定义时使用属性配置
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
    public PSDEFDTCol length(Integer length){
        this.setLength(length);
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
    public PSDEFDTCol memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NULLVALORDER</B>&nbsp;空值排序，指定属性数据列在数据库排序时处理空值的方式，未指定时则依次从属性、数据库类型读取设置
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
    public PSDEFDTCol nullvalorder(String nullValOrder){
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
    public PSDEFDTCol nullvalorder(net.ibizsys.psmodel.core.util.PSModelEnums.DBNullValueOrderMode nullValOrder){
        if(nullValOrder == null){
            this.setNullValOrder(null);
        }
        else{
            this.setNullValOrder(nullValOrder.value);
        }
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度，指定属性列数据类型的浮点精度，未定义时使用属性配置
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
    public PSDEFDTCol precision(Integer precision){
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
     * <B>PSDEFDTCOLID</B>&nbsp;属性列定义标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFDTCOLID = "psdefdtcolid";

    /**
     * 设置 属性列定义标识
     * 
     * @param pSDEFDTColId
     * 
     */
    @JsonProperty(FIELD_PSDEFDTCOLID)
    public void setPSDEFDTColId(String pSDEFDTColId){
        this.set(FIELD_PSDEFDTCOLID, pSDEFDTColId);
    }
    
    /**
     * 获取 属性列定义标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFDTColId(){
        Object objValue = this.get(FIELD_PSDEFDTCOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性列定义标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFDTColIdDirty(){
        if(this.contains(FIELD_PSDEFDTCOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性列定义标识
     */
    @JsonIgnore
    public void resetPSDEFDTColId(){
        this.reset(FIELD_PSDEFDTCOLID);
    }

    /**
     * 设置 属性列定义标识
     * <P>
     * 等同 {@link #setPSDEFDTColId}
     * @param pSDEFDTColId
     */
    @JsonIgnore
    public PSDEFDTCol psdefdtcolid(String pSDEFDTColId){
        this.setPSDEFDTColId(pSDEFDTColId);
        return this;
    }

    /**
     * <B>PSDEFDTCOLNAME</B>&nbsp;列名称
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEFDTCOLNAME = "psdefdtcolname";

    /**
     * 设置 列名称
     * 
     * @param pSDEFDTColName
     * 
     */
    @JsonProperty(FIELD_PSDEFDTCOLNAME)
    public void setPSDEFDTColName(String pSDEFDTColName){
        this.set(FIELD_PSDEFDTCOLNAME, pSDEFDTColName);
    }
    
    /**
     * 获取 列名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFDTColName(){
        Object objValue = this.get(FIELD_PSDEFDTCOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFDTColNameDirty(){
        if(this.contains(FIELD_PSDEFDTCOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列名称
     */
    @JsonIgnore
    public void resetPSDEFDTColName(){
        this.reset(FIELD_PSDEFDTCOLNAME);
    }

    /**
     * 设置 列名称
     * <P>
     * 等同 {@link #setPSDEFDTColName}
     * @param pSDEFDTColName
     */
    @JsonIgnore
    public PSDEFDTCol psdefdtcolname(String pSDEFDTColName){
        this.setPSDEFDTColName(pSDEFDTColName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFDTColName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFDTColName(strName);
    }

    @JsonIgnore
    public PSDEFDTCol name(String strName){
        this.setPSDEFDTColName(strName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
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
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEFDTCol psdefid(String pSDEFId){
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
    public PSDEFDTCol psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setTableName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
            this.setPSDEName(pSDEField.getPSDEName());
            this.setTableName(pSDEField.getTableName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
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
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEFDTCol psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体标识
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体标识  
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
     * 判断 实体标识 是否指定值，包括空值
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
     * 重置 实体标识
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体标识
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEFDTCol psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体名称
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体名称  
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
     * 判断 实体名称 是否指定值，包括空值
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
     * 重置 实体名称
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体名称
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEFDTCol psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>TABLENAME</B>&nbsp;数据表名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_TABLENAME = "tablename";

    /**
     * 设置 数据表名称
     * 
     * @param tableName
     * 
     */
    @JsonProperty(FIELD_TABLENAME)
    public void setTableName(String tableName){
        this.set(FIELD_TABLENAME, tableName);
    }
    
    /**
     * 获取 数据表名称  
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
     * 判断 数据表名称 是否指定值，包括空值
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
     * 重置 数据表名称
     */
    @JsonIgnore
    public void resetTableName(){
        this.reset(FIELD_TABLENAME);
    }

    /**
     * 设置 数据表名称
     * <P>
     * 等同 {@link #setTableName}
     * @param tableName
     */
    @JsonIgnore
    public PSDEFDTCol tablename(String tableName){
        this.setTableName(tableName);
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
    public PSDEFDTCol updatedate(String updateDate){
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
    public PSDEFDTCol updateman(String updateMan){
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
    public PSDEFDTCol usercat(String userCat){
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
    public PSDEFDTCol usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEFDTCol userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDEFDTCol usertag(String userTag){
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
    public PSDEFDTCol usertag2(String userTag2){
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
    public PSDEFDTCol usertag3(String userTag3){
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
    public PSDEFDTCol usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALUEFUNC2FIELDS</B>&nbsp;新建值函数参数，指定属性列插入函数参数集合，多个参数使用分号（；）分隔
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEFUNC2FIELDS = "valuefunc2fields";

    /**
     * 设置 新建值函数参数，详细说明：{@link #FIELD_VALUEFUNC2FIELDS}
     * 
     * @param valueFunc2Fields
     * 
     */
    @JsonProperty(FIELD_VALUEFUNC2FIELDS)
    public void setValueFunc2Fields(String valueFunc2Fields){
        this.set(FIELD_VALUEFUNC2FIELDS, valueFunc2Fields);
    }
    
    /**
     * 获取 新建值函数参数  
     * @return
     */
    @JsonIgnore
    public String getValueFunc2Fields(){
        Object objValue = this.get(FIELD_VALUEFUNC2FIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建值函数参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFunc2FieldsDirty(){
        if(this.contains(FIELD_VALUEFUNC2FIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建值函数参数
     */
    @JsonIgnore
    public void resetValueFunc2Fields(){
        this.reset(FIELD_VALUEFUNC2FIELDS);
    }

    /**
     * 设置 新建值函数参数，详细说明：{@link #FIELD_VALUEFUNC2FIELDS}
     * <P>
     * 等同 {@link #setValueFunc2Fields}
     * @param valueFunc2Fields
     */
    @JsonIgnore
    public PSDEFDTCol valuefunc2fields(String valueFunc2Fields){
        this.setValueFunc2Fields(valueFunc2Fields);
        return this;
    }

    /**
     * <B>VALUEFUNC2FORMAT</B>&nbsp;新建值函数格式，指定属性列插入函数格式，如存在插入函数参数，可使用java字符串格式化占位符号： %1$s、 %2$s...进行参数占位
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEFUNC2FORMAT = "valuefunc2format";

    /**
     * 设置 新建值函数格式，详细说明：{@link #FIELD_VALUEFUNC2FORMAT}
     * 
     * @param valueFunc2Format
     * 
     */
    @JsonProperty(FIELD_VALUEFUNC2FORMAT)
    public void setValueFunc2Format(String valueFunc2Format){
        this.set(FIELD_VALUEFUNC2FORMAT, valueFunc2Format);
    }
    
    /**
     * 获取 新建值函数格式  
     * @return
     */
    @JsonIgnore
    public String getValueFunc2Format(){
        Object objValue = this.get(FIELD_VALUEFUNC2FORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建值函数格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFunc2FormatDirty(){
        if(this.contains(FIELD_VALUEFUNC2FORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建值函数格式
     */
    @JsonIgnore
    public void resetValueFunc2Format(){
        this.reset(FIELD_VALUEFUNC2FORMAT);
    }

    /**
     * 设置 新建值函数格式，详细说明：{@link #FIELD_VALUEFUNC2FORMAT}
     * <P>
     * 等同 {@link #setValueFunc2Format}
     * @param valueFunc2Format
     */
    @JsonIgnore
    public PSDEFDTCol valuefunc2format(String valueFunc2Format){
        this.setValueFunc2Format(valueFunc2Format);
        return this;
    }

    /**
     * <B>VALUEFUNCFIELDS</B>&nbsp;更新值函数参数，指定属性列更新函数参数集合，多个参数使用分号（；）分隔
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEFUNCFIELDS = "valuefuncfields";

    /**
     * 设置 更新值函数参数，详细说明：{@link #FIELD_VALUEFUNCFIELDS}
     * 
     * @param valueFuncFields
     * 
     */
    @JsonProperty(FIELD_VALUEFUNCFIELDS)
    public void setValueFuncFields(String valueFuncFields){
        this.set(FIELD_VALUEFUNCFIELDS, valueFuncFields);
    }
    
    /**
     * 获取 更新值函数参数  
     * @return
     */
    @JsonIgnore
    public String getValueFuncFields(){
        Object objValue = this.get(FIELD_VALUEFUNCFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新值函数参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFuncFieldsDirty(){
        if(this.contains(FIELD_VALUEFUNCFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新值函数参数
     */
    @JsonIgnore
    public void resetValueFuncFields(){
        this.reset(FIELD_VALUEFUNCFIELDS);
    }

    /**
     * 设置 更新值函数参数，详细说明：{@link #FIELD_VALUEFUNCFIELDS}
     * <P>
     * 等同 {@link #setValueFuncFields}
     * @param valueFuncFields
     */
    @JsonIgnore
    public PSDEFDTCol valuefuncfields(String valueFuncFields){
        this.setValueFuncFields(valueFuncFields);
        return this;
    }

    /**
     * <B>VALUEFUNCFORMAT</B>&nbsp;更新值函数格式，指定属性列更新函数格式，如存在更新函数参数，可使用java字符串格式化占位符号： %1$s、 %2$s...进行参数占位
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEFUNCFORMAT = "valuefuncformat";

    /**
     * 设置 更新值函数格式，详细说明：{@link #FIELD_VALUEFUNCFORMAT}
     * 
     * @param valueFuncFormat
     * 
     */
    @JsonProperty(FIELD_VALUEFUNCFORMAT)
    public void setValueFuncFormat(String valueFuncFormat){
        this.set(FIELD_VALUEFUNCFORMAT, valueFuncFormat);
    }
    
    /**
     * 获取 更新值函数格式  
     * @return
     */
    @JsonIgnore
    public String getValueFuncFormat(){
        Object objValue = this.get(FIELD_VALUEFUNCFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新值函数格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFuncFormatDirty(){
        if(this.contains(FIELD_VALUEFUNCFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新值函数格式
     */
    @JsonIgnore
    public void resetValueFuncFormat(){
        this.reset(FIELD_VALUEFUNCFORMAT);
    }

    /**
     * 设置 更新值函数格式，详细说明：{@link #FIELD_VALUEFUNCFORMAT}
     * <P>
     * 等同 {@link #setValueFuncFormat}
     * @param valueFuncFormat
     */
    @JsonIgnore
    public PSDEFDTCol valuefuncformat(String valueFuncFormat){
        this.setValueFuncFormat(valueFuncFormat);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFDTColId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFDTColId(strValue);
    }

    @JsonIgnore
    public PSDEFDTCol id(String strValue){
        this.setPSDEFDTColId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFDTCol){
            PSDEFDTCol model = (PSDEFDTCol)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
