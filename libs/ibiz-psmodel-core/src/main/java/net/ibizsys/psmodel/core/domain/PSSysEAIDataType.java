package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSEAIDATATYPE</B>集成数据类型 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIDataType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysEAIDataType(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysEAIDataType codename(String codeName){
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
    public PSSysEAIDataType createdate(String createDate){
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
    public PSSysEAIDataType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EAIDATATYPETAG</B>&nbsp;数据类型标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EAIDATATYPETAG = "eaidatatypetag";

    /**
     * 设置 数据类型标记
     * 
     * @param eAIDataTypeTag
     * 
     */
    @JsonProperty(FIELD_EAIDATATYPETAG)
    public void setEAIDataTypeTag(String eAIDataTypeTag){
        this.set(FIELD_EAIDATATYPETAG, eAIDataTypeTag);
    }
    
    /**
     * 获取 数据类型标记  
     * @return
     */
    @JsonIgnore
    public String getEAIDataTypeTag(){
        Object objValue = this.get(FIELD_EAIDATATYPETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDataTypeTagDirty(){
        if(this.contains(FIELD_EAIDATATYPETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型标记
     */
    @JsonIgnore
    public void resetEAIDataTypeTag(){
        this.reset(FIELD_EAIDATATYPETAG);
    }

    /**
     * 设置 数据类型标记
     * <P>
     * 等同 {@link #setEAIDataTypeTag}
     * @param eAIDataTypeTag
     */
    @JsonIgnore
    public PSSysEAIDataType eaidatatypetag(String eAIDataTypeTag){
        this.setEAIDataTypeTag(eAIDataTypeTag);
        return this;
    }

    /**
     * <B>EAIDATATYPETAG2</B>&nbsp;数据类型标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EAIDATATYPETAG2 = "eaidatatypetag2";

    /**
     * 设置 数据类型标记2
     * 
     * @param eAIDataTypeTag2
     * 
     */
    @JsonProperty(FIELD_EAIDATATYPETAG2)
    public void setEAIDataTypeTag2(String eAIDataTypeTag2){
        this.set(FIELD_EAIDATATYPETAG2, eAIDataTypeTag2);
    }
    
    /**
     * 获取 数据类型标记2  
     * @return
     */
    @JsonIgnore
    public String getEAIDataTypeTag2(){
        Object objValue = this.get(FIELD_EAIDATATYPETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDataTypeTag2Dirty(){
        if(this.contains(FIELD_EAIDATATYPETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型标记2
     */
    @JsonIgnore
    public void resetEAIDataTypeTag2(){
        this.reset(FIELD_EAIDATATYPETAG2);
    }

    /**
     * 设置 数据类型标记2
     * <P>
     * 等同 {@link #setEAIDataTypeTag2}
     * @param eAIDataTypeTag2
     */
    @JsonIgnore
    public PSSysEAIDataType eaidatatypetag2(String eAIDataTypeTag2){
        this.setEAIDataTypeTag2(eAIDataTypeTag2);
        return this;
    }

    /**
     * <B>ENABLEENUM</B>&nbsp;启用枚举
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEENUM = "enableenum";

    /**
     * 设置 启用枚举
     * 
     * @param enableEnum
     * 
     */
    @JsonProperty(FIELD_ENABLEENUM)
    public void setEnableEnum(Integer enableEnum){
        this.set(FIELD_ENABLEENUM, enableEnum);
    }
    
    /**
     * 获取 启用枚举  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEnum(){
        Object objValue = this.get(FIELD_ENABLEENUM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用枚举 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEnumDirty(){
        if(this.contains(FIELD_ENABLEENUM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用枚举
     */
    @JsonIgnore
    public void resetEnableEnum(){
        this.reset(FIELD_ENABLEENUM);
    }

    /**
     * 设置 启用枚举
     * <P>
     * 等同 {@link #setEnableEnum}
     * @param enableEnum
     */
    @JsonIgnore
    public PSSysEAIDataType enableenum(Integer enableEnum){
        this.setEnableEnum(enableEnum);
        return this;
    }

     /**
     * 设置 启用枚举
     * <P>
     * 等同 {@link #setEnableEnum}
     * @param enableEnum
     */
    @JsonIgnore
    public PSSysEAIDataType enableenum(Boolean enableEnum){
        if(enableEnum == null){
            this.setEnableEnum(null);
        }
        else{
            this.setEnableEnum(enableEnum?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INCMAXVALUE</B>&nbsp;包含最大值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCMAXVALUE = "incmaxvalue";

    /**
     * 设置 包含最大值
     * 
     * @param incMaxValue
     * 
     */
    @JsonProperty(FIELD_INCMAXVALUE)
    public void setIncMaxValue(Integer incMaxValue){
        this.set(FIELD_INCMAXVALUE, incMaxValue);
    }
    
    /**
     * 获取 包含最大值  
     * @return
     */
    @JsonIgnore
    public Integer getIncMaxValue(){
        Object objValue = this.get(FIELD_INCMAXVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含最大值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncMaxValueDirty(){
        if(this.contains(FIELD_INCMAXVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含最大值
     */
    @JsonIgnore
    public void resetIncMaxValue(){
        this.reset(FIELD_INCMAXVALUE);
    }

    /**
     * 设置 包含最大值
     * <P>
     * 等同 {@link #setIncMaxValue}
     * @param incMaxValue
     */
    @JsonIgnore
    public PSSysEAIDataType incmaxvalue(Integer incMaxValue){
        this.setIncMaxValue(incMaxValue);
        return this;
    }

     /**
     * 设置 包含最大值
     * <P>
     * 等同 {@link #setIncMaxValue}
     * @param incMaxValue
     */
    @JsonIgnore
    public PSSysEAIDataType incmaxvalue(Boolean incMaxValue){
        if(incMaxValue == null){
            this.setIncMaxValue(null);
        }
        else{
            this.setIncMaxValue(incMaxValue?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INCMINVALUE</B>&nbsp;包含最小值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCMINVALUE = "incminvalue";

    /**
     * 设置 包含最小值
     * 
     * @param incMinValue
     * 
     */
    @JsonProperty(FIELD_INCMINVALUE)
    public void setIncMinValue(Integer incMinValue){
        this.set(FIELD_INCMINVALUE, incMinValue);
    }
    
    /**
     * 获取 包含最小值  
     * @return
     */
    @JsonIgnore
    public Integer getIncMinValue(){
        Object objValue = this.get(FIELD_INCMINVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含最小值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncMinValueDirty(){
        if(this.contains(FIELD_INCMINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含最小值
     */
    @JsonIgnore
    public void resetIncMinValue(){
        this.reset(FIELD_INCMINVALUE);
    }

    /**
     * 设置 包含最小值
     * <P>
     * 等同 {@link #setIncMinValue}
     * @param incMinValue
     */
    @JsonIgnore
    public PSSysEAIDataType incminvalue(Integer incMinValue){
        this.setIncMinValue(incMinValue);
        return this;
    }

     /**
     * 设置 包含最小值
     * <P>
     * 等同 {@link #setIncMinValue}
     * @param incMinValue
     */
    @JsonIgnore
    public PSSysEAIDataType incminvalue(Boolean incMinValue){
        if(incMinValue == null){
            this.setIncMinValue(null);
        }
        else{
            this.setIncMinValue(incMinValue?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>MAXSTRLENGTH</B>&nbsp;最大字符长度
     */
    public final static String FIELD_MAXSTRLENGTH = "maxstrlength";

    /**
     * 设置 最大字符长度
     * 
     * @param maxStrLength
     * 
     */
    @JsonProperty(FIELD_MAXSTRLENGTH)
    public void setMaxStrLength(Integer maxStrLength){
        this.set(FIELD_MAXSTRLENGTH, maxStrLength);
    }
    
    /**
     * 获取 最大字符长度  
     * @return
     */
    @JsonIgnore
    public Integer getMaxStrLength(){
        Object objValue = this.get(FIELD_MAXSTRLENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 最大字符长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMaxStrLengthDirty(){
        if(this.contains(FIELD_MAXSTRLENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 最大字符长度
     */
    @JsonIgnore
    public void resetMaxStrLength(){
        this.reset(FIELD_MAXSTRLENGTH);
    }

    /**
     * 设置 最大字符长度
     * <P>
     * 等同 {@link #setMaxStrLength}
     * @param maxStrLength
     */
    @JsonIgnore
    public PSSysEAIDataType maxstrlength(Integer maxStrLength){
        this.setMaxStrLength(maxStrLength);
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
    public PSSysEAIDataType maxvalue(String maxValue){
        this.setMaxValue(maxValue);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSSysEAIDataType memo(String memo){
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
    public PSSysEAIDataType minstrlength(Integer minStrLength){
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
    public PSSysEAIDataType minvalue(String minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>SCALE</B>&nbsp;小数位数
     */
    public final static String FIELD_SCALE = "scale";

    /**
     * 设置 小数位数
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
     * 设置 小数位数
     * <P>
     * 等同 {@link #setScale}
     * @param scale
     */
    @JsonIgnore
    public PSSysEAIDataType scale(Integer scale){
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
     * <B>PSSYSEAIDATATYPEID</B>&nbsp;应用集成数据类型标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIDATATYPEID = "pssyseaidatatypeid";

    /**
     * 设置 应用集成数据类型标识
     * 
     * @param pSSysEAIDataTypeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPEID)
    public void setPSSysEAIDataTypeId(String pSSysEAIDataTypeId){
        this.set(FIELD_PSSYSEAIDATATYPEID, pSSysEAIDataTypeId);
    }
    
    /**
     * 获取 应用集成数据类型标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDataTypeId(){
        Object objValue = this.get(FIELD_PSSYSEAIDATATYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成数据类型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDataTypeIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDATATYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成数据类型标识
     */
    @JsonIgnore
    public void resetPSSysEAIDataTypeId(){
        this.reset(FIELD_PSSYSEAIDATATYPEID);
    }

    /**
     * 设置 应用集成数据类型标识
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeId}
     * @param pSSysEAIDataTypeId
     */
    @JsonIgnore
    public PSSysEAIDataType pssyseaidatatypeid(String pSSysEAIDataTypeId){
        this.setPSSysEAIDataTypeId(pSSysEAIDataTypeId);
        return this;
    }

    /**
     * <B>PSSYSEAIDATATYPENAME</B>&nbsp;数据类型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIDATATYPENAME = "pssyseaidatatypename";

    /**
     * 设置 数据类型名称
     * 
     * @param pSSysEAIDataTypeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPENAME)
    public void setPSSysEAIDataTypeName(String pSSysEAIDataTypeName){
        this.set(FIELD_PSSYSEAIDATATYPENAME, pSSysEAIDataTypeName);
    }
    
    /**
     * 获取 数据类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDataTypeName(){
        Object objValue = this.get(FIELD_PSSYSEAIDATATYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDataTypeNameDirty(){
        if(this.contains(FIELD_PSSYSEAIDATATYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据类型名称
     */
    @JsonIgnore
    public void resetPSSysEAIDataTypeName(){
        this.reset(FIELD_PSSYSEAIDATATYPENAME);
    }

    /**
     * 设置 数据类型名称
     * <P>
     * 等同 {@link #setPSSysEAIDataTypeName}
     * @param pSSysEAIDataTypeName
     */
    @JsonIgnore
    public PSSysEAIDataType pssyseaidatatypename(String pSSysEAIDataTypeName){
        this.setPSSysEAIDataTypeName(pSSysEAIDataTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIDataTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIDataTypeName(strName);
    }

    @JsonIgnore
    public PSSysEAIDataType name(String strName){
        this.setPSSysEAIDataTypeName(strName);
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMEID</B>&nbsp;应用集成体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIScheme} 
     */
    public final static String FIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";

    /**
     * 设置 应用集成体系
     * 
     * @param pSSysEAISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMEID)
    public void setPSSysEAISchemeId(String pSSysEAISchemeId){
        this.set(FIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }
    
    /**
     * 获取 应用集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeId(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeId(){
        this.reset(FIELD_PSSYSEAISCHEMEID);
    }

    /**
     * 设置 应用集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAISchemeId
     */
    @JsonIgnore
    public PSSysEAIDataType pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * 设置 应用集成体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAIScheme 引用对象
     */
    @JsonIgnore
    public PSSysEAIDataType pssyseaischemeid(PSSysEAIScheme pSSysEAIScheme){
        if(pSSysEAIScheme == null){
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        }
        else{
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMENAME</B>&nbsp;应用集成体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAISCHEMEID}
     */
    public final static String FIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";

    /**
     * 设置 应用集成体系
     * 
     * @param pSSysEAISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMENAME)
    public void setPSSysEAISchemeName(String pSSysEAISchemeName){
        this.set(FIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }
    
    /**
     * 获取 应用集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeName(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeName(){
        this.reset(FIELD_PSSYSEAISCHEMENAME);
    }

    /**
     * 设置 应用集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeName}
     * @param pSSysEAISchemeName
     */
    @JsonIgnore
    public PSSysEAIDataType pssyseaischemename(String pSSysEAISchemeName){
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
        return this;
    }

    /**
     * <B>REGEXPCODE</B>&nbsp;正则式规则
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_REGEXPCODE = "regexpcode";

    /**
     * 设置 正则式规则
     * 
     * @param regExpCode
     * 
     */
    @JsonProperty(FIELD_REGEXPCODE)
    public void setRegExpCode(String regExpCode){
        this.set(FIELD_REGEXPCODE, regExpCode);
    }
    
    /**
     * 获取 正则式规则  
     * @return
     */
    @JsonIgnore
    public String getRegExpCode(){
        Object objValue = this.get(FIELD_REGEXPCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 正则式规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegExpCodeDirty(){
        if(this.contains(FIELD_REGEXPCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 正则式规则
     */
    @JsonIgnore
    public void resetRegExpCode(){
        this.reset(FIELD_REGEXPCODE);
    }

    /**
     * 设置 正则式规则
     * <P>
     * 等同 {@link #setRegExpCode}
     * @param regExpCode
     */
    @JsonIgnore
    public PSSysEAIDataType regexpcode(String regExpCode){
        this.setRegExpCode(regExpCode);
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
    public PSSysEAIDataType stddatatype(Integer stdDataType){
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
    public PSSysEAIDataType stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
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
    public PSSysEAIDataType updatedate(String updateDate){
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
    public PSSysEAIDataType updateman(String updateMan){
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
    public PSSysEAIDataType usercat(String userCat){
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
    public PSSysEAIDataType usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIDataType usertag(String userTag){
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
    public PSSysEAIDataType usertag2(String userTag2){
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
    public PSSysEAIDataType usertag3(String userTag3){
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
    public PSSysEAIDataType usertag4(String userTag4){
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
    public PSSysEAIDataType validflag(Integer validFlag){
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
    public PSSysEAIDataType validflag(Boolean validFlag){
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
        return this.getPSSysEAIDataTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIDataTypeId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDataType id(String strValue){
        this.setPSSysEAIDataTypeId(strValue);
        return this;
    }


    /**
     *  集成数据类型项 成员集合
     */
    public final static String FIELD_PSSYSEAIDATATYPEITEMS = "pssyseaidatatypeitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDataTypeItem> pssyseaidatatypeitems;

    /**
     * 获取 集成数据类型项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPEITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDataTypeItem> getPSSysEAIDataTypeItems(){
        return this.pssyseaidatatypeitems;
    }

    /**
     * 设置 集成数据类型项 成员集合  
     * @param pssyseaidatatypeitems
     */
    @JsonProperty(FIELD_PSSYSEAIDATATYPEITEMS)
    public void setPSSysEAIDataTypeItems(java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDataTypeItem> pssyseaidatatypeitems){
        this.pssyseaidatatypeitems = pssyseaidatatypeitems;
    }

    /**
     * 获取 集成数据类型项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIDataTypeItem> getPSSysEAIDataTypeItemsIf(){
        if(this.pssyseaidatatypeitems == null){
            this.pssyseaidatatypeitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysEAIDataTypeItem>();          
        }
        return this.pssyseaidatatypeitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysEAIDataType){
            PSSysEAIDataType model = (PSSysEAIDataType)iPSModel;
            model.setPSSysEAIDataTypeItems(this.getPSSysEAIDataTypeItems());
        }
        super.copyTo(iPSModel);
    }
}
