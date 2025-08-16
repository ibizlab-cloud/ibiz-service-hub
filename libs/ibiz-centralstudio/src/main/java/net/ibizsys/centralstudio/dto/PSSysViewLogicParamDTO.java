package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSVIEWLOGICPARAM</B>系统界面逻辑参数 模型传输对象
 * <P>
 * 系统界面逻辑参数模型，定义参数的名称、值、次序等
 */
public class PSSysViewLogicParamDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysViewLogicParamDTO(){
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
    public PSSysViewLogicParamDTO createdate(Timestamp createDate){
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
    public PSSysViewLogicParamDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 1000
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
    public PSSysViewLogicParamDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;参数次序，指定系统界面逻辑参数的次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 参数次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 参数次序  
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
     * 判断 参数次序 是否指定值，包括空值
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
     * 重置 参数次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 参数次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMCAT</B>&nbsp;参数分类
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PARAMCAT = "paramcat";

    /**
     * 设置 参数分类
     * 
     * @param paramCat
     * 
     */
    @JsonProperty(FIELD_PARAMCAT)
    public void setParamCat(String paramCat){
        this.set(FIELD_PARAMCAT, paramCat);
    }
    
    /**
     * 获取 参数分类  
     * @return
     */
    @JsonIgnore
    public String getParamCat(){
        Object objValue = this.get(FIELD_PARAMCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamCatDirty(){
        if(this.contains(FIELD_PARAMCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数分类
     */
    @JsonIgnore
    public void resetParamCat(){
        this.reset(FIELD_PARAMCAT);
    }

    /**
     * 设置 参数分类
     * <P>
     * 等同 {@link #setParamCat}
     * @param paramCat
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramcat(String paramCat){
        this.setParamCat(paramCat);
        return this;
    }

    /**
     * <B>PARAMDESC</B>&nbsp;参数说明
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAMDESC = "paramdesc";

    /**
     * 设置 参数说明
     * 
     * @param paramDesc
     * 
     */
    @JsonProperty(FIELD_PARAMDESC)
    public void setParamDesc(String paramDesc){
        this.set(FIELD_PARAMDESC, paramDesc);
    }
    
    /**
     * 获取 参数说明  
     * @return
     */
    @JsonIgnore
    public String getParamDesc(){
        Object objValue = this.get(FIELD_PARAMDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDescDirty(){
        if(this.contains(FIELD_PARAMDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数说明
     */
    @JsonIgnore
    public void resetParamDesc(){
        this.reset(FIELD_PARAMDESC);
    }

    /**
     * 设置 参数说明
     * <P>
     * 等同 {@link #setParamDesc}
     * @param paramDesc
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramdesc(String paramDesc){
        this.setParamDesc(paramDesc);
        return this;
    }

    /**
     * <B>PARAMKEY</B>&nbsp;参数键名
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PARAMKEY = "paramkey";

    /**
     * 设置 参数键名
     * 
     * @param paramKey
     * 
     */
    @JsonProperty(FIELD_PARAMKEY)
    public void setParamKey(String paramKey){
        this.set(FIELD_PARAMKEY, paramKey);
    }
    
    /**
     * 获取 参数键名  
     * @return
     */
    @JsonIgnore
    public String getParamKey(){
        Object objValue = this.get(FIELD_PARAMKEY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数键名 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamKeyDirty(){
        if(this.contains(FIELD_PARAMKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数键名
     */
    @JsonIgnore
    public void resetParamKey(){
        this.reset(FIELD_PARAMKEY);
    }

    /**
     * 设置 参数键名
     * <P>
     * 等同 {@link #setParamKey}
     * @param paramKey
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramkey(String paramKey){
        this.setParamKey(paramKey);
        return this;
    }

    /**
     * <B>PARAMSTATE</B>&nbsp;参数状态
     */
    public final static String FIELD_PARAMSTATE = "paramstate";

    /**
     * 设置 参数状态
     * 
     * @param paramState
     * 
     */
    @JsonProperty(FIELD_PARAMSTATE)
    public void setParamState(Integer paramState){
        this.set(FIELD_PARAMSTATE, paramState);
    }
    
    /**
     * 获取 参数状态  
     * @return
     */
    @JsonIgnore
    public Integer getParamState(){
        Object objValue = this.get(FIELD_PARAMSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamStateDirty(){
        if(this.contains(FIELD_PARAMSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数状态
     */
    @JsonIgnore
    public void resetParamState(){
        this.reset(FIELD_PARAMSTATE);
    }

    /**
     * 设置 参数状态
     * <P>
     * 等同 {@link #setParamState}
     * @param paramState
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramstate(Integer paramState){
        this.setParamState(paramState);
        return this;
    }

    /**
     * <B>PARAMSUBKEY</B>&nbsp;参数子键
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMSUBKEY = "paramsubkey";

    /**
     * 设置 参数子键
     * 
     * @param paramSubKey
     * 
     */
    @JsonProperty(FIELD_PARAMSUBKEY)
    public void setParamSubKey(String paramSubKey){
        this.set(FIELD_PARAMSUBKEY, paramSubKey);
    }
    
    /**
     * 获取 参数子键  
     * @return
     */
    @JsonIgnore
    public String getParamSubKey(){
        Object objValue = this.get(FIELD_PARAMSUBKEY);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数子键 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamSubKeyDirty(){
        if(this.contains(FIELD_PARAMSUBKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数子键
     */
    @JsonIgnore
    public void resetParamSubKey(){
        this.reset(FIELD_PARAMSUBKEY);
    }

    /**
     * 设置 参数子键
     * <P>
     * 等同 {@link #setParamSubKey}
     * @param paramSubKey
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramsubkey(String paramSubKey){
        this.setParamSubKey(paramSubKey);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;参数类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PARAMTYPE = "paramtype";

    /**
     * 设置 参数类型
     * 
     * @param paramType
     * 
     */
    @JsonProperty(FIELD_PARAMTYPE)
    public void setParamType(String paramType){
        this.set(FIELD_PARAMTYPE, paramType);
    }
    
    /**
     * 获取 参数类型  
     * @return
     */
    @JsonIgnore
    public String getParamType(){
        Object objValue = this.get(FIELD_PARAMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTypeDirty(){
        if(this.contains(FIELD_PARAMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数类型
     */
    @JsonIgnore
    public void resetParamType(){
        this.reset(FIELD_PARAMTYPE);
    }

    /**
     * 设置 参数类型
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramtype(String paramType){
        this.setParamType(paramType);
        return this;
    }

    /**
     * <B>PARAMVALUE</B>&nbsp;参数值，指定系统界面逻辑参数的参数值
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PARAMVALUE = "paramvalue";

    /**
     * 设置 参数值，详细说明：{@link #FIELD_PARAMVALUE}
     * 
     * @param paramValue
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE)
    public void setParamValue(String paramValue){
        this.set(FIELD_PARAMVALUE, paramValue);
    }
    
    /**
     * 获取 参数值  
     * @return
     */
    @JsonIgnore
    public String getParamValue(){
        Object objValue = this.get(FIELD_PARAMVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValueDirty(){
        if(this.contains(FIELD_PARAMVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值
     */
    @JsonIgnore
    public void resetParamValue(){
        this.reset(FIELD_PARAMVALUE);
    }

    /**
     * 设置 参数值，详细说明：{@link #FIELD_PARAMVALUE}
     * <P>
     * 等同 {@link #setParamValue}
     * @param paramValue
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue(String paramValue){
        this.setParamValue(paramValue);
        return this;
    }

    /**
     * <B>PARAMVALUE10</B>&nbsp;参数值10
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARAMVALUE10 = "paramvalue10";

    /**
     * 设置 参数值10
     * 
     * @param paramValue10
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE10)
    public void setParamValue10(Integer paramValue10){
        this.set(FIELD_PARAMVALUE10, paramValue10);
    }
    
    /**
     * 获取 参数值10  
     * @return
     */
    @JsonIgnore
    public Integer getParamValue10(){
        Object objValue = this.get(FIELD_PARAMVALUE10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数值10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue10Dirty(){
        if(this.contains(FIELD_PARAMVALUE10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值10
     */
    @JsonIgnore
    public void resetParamValue10(){
        this.reset(FIELD_PARAMVALUE10);
    }

    /**
     * 设置 参数值10
     * <P>
     * 等同 {@link #setParamValue10}
     * @param paramValue10
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue10(Integer paramValue10){
        this.setParamValue10(paramValue10);
        return this;
    }

     /**
     * 设置 参数值10
     * <P>
     * 等同 {@link #setParamValue10}
     * @param paramValue10
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue10(Boolean paramValue10){
        if(paramValue10 == null){
            this.setParamValue10(null);
        }
        else{
            this.setParamValue10(paramValue10?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PARAMVALUE2</B>&nbsp;参数值2，指定系统界面逻辑参数的参数值2
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PARAMVALUE2 = "paramvalue2";

    /**
     * 设置 参数值2，详细说明：{@link #FIELD_PARAMVALUE2}
     * 
     * @param paramValue2
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE2)
    public void setParamValue2(String paramValue2){
        this.set(FIELD_PARAMVALUE2, paramValue2);
    }
    
    /**
     * 获取 参数值2  
     * @return
     */
    @JsonIgnore
    public String getParamValue2(){
        Object objValue = this.get(FIELD_PARAMVALUE2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数值2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue2Dirty(){
        if(this.contains(FIELD_PARAMVALUE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值2
     */
    @JsonIgnore
    public void resetParamValue2(){
        this.reset(FIELD_PARAMVALUE2);
    }

    /**
     * 设置 参数值2，详细说明：{@link #FIELD_PARAMVALUE2}
     * <P>
     * 等同 {@link #setParamValue2}
     * @param paramValue2
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue2(String paramValue2){
        this.setParamValue2(paramValue2);
        return this;
    }

    /**
     * <B>PARAMVALUE3</B>&nbsp;参数值3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMVALUE3 = "paramvalue3";

    /**
     * 设置 参数值3
     * 
     * @param paramValue3
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE3)
    public void setParamValue3(String paramValue3){
        this.set(FIELD_PARAMVALUE3, paramValue3);
    }
    
    /**
     * 获取 参数值3  
     * @return
     */
    @JsonIgnore
    public String getParamValue3(){
        Object objValue = this.get(FIELD_PARAMVALUE3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数值3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue3Dirty(){
        if(this.contains(FIELD_PARAMVALUE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值3
     */
    @JsonIgnore
    public void resetParamValue3(){
        this.reset(FIELD_PARAMVALUE3);
    }

    /**
     * 设置 参数值3
     * <P>
     * 等同 {@link #setParamValue3}
     * @param paramValue3
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue3(String paramValue3){
        this.setParamValue3(paramValue3);
        return this;
    }

    /**
     * <B>PARAMVALUE4</B>&nbsp;参数值4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMVALUE4 = "paramvalue4";

    /**
     * 设置 参数值4
     * 
     * @param paramValue4
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE4)
    public void setParamValue4(String paramValue4){
        this.set(FIELD_PARAMVALUE4, paramValue4);
    }
    
    /**
     * 获取 参数值4  
     * @return
     */
    @JsonIgnore
    public String getParamValue4(){
        Object objValue = this.get(FIELD_PARAMVALUE4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数值4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue4Dirty(){
        if(this.contains(FIELD_PARAMVALUE4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值4
     */
    @JsonIgnore
    public void resetParamValue4(){
        this.reset(FIELD_PARAMVALUE4);
    }

    /**
     * 设置 参数值4
     * <P>
     * 等同 {@link #setParamValue4}
     * @param paramValue4
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue4(String paramValue4){
        this.setParamValue4(paramValue4);
        return this;
    }

    /**
     * <B>PARAMVALUE5</B>&nbsp;参数值5
     */
    public final static String FIELD_PARAMVALUE5 = "paramvalue5";

    /**
     * 设置 参数值5
     * 
     * @param paramValue5
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE5)
    public void setParamValue5(Integer paramValue5){
        this.set(FIELD_PARAMVALUE5, paramValue5);
    }
    
    /**
     * 获取 参数值5  
     * @return
     */
    @JsonIgnore
    public Integer getParamValue5(){
        Object objValue = this.get(FIELD_PARAMVALUE5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数值5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue5Dirty(){
        if(this.contains(FIELD_PARAMVALUE5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值5
     */
    @JsonIgnore
    public void resetParamValue5(){
        this.reset(FIELD_PARAMVALUE5);
    }

    /**
     * 设置 参数值5
     * <P>
     * 等同 {@link #setParamValue5}
     * @param paramValue5
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue5(Integer paramValue5){
        this.setParamValue5(paramValue5);
        return this;
    }

    /**
     * <B>PARAMVALUE6</B>&nbsp;参数值6
     */
    public final static String FIELD_PARAMVALUE6 = "paramvalue6";

    /**
     * 设置 参数值6
     * 
     * @param paramValue6
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE6)
    public void setParamValue6(Integer paramValue6){
        this.set(FIELD_PARAMVALUE6, paramValue6);
    }
    
    /**
     * 获取 参数值6  
     * @return
     */
    @JsonIgnore
    public Integer getParamValue6(){
        Object objValue = this.get(FIELD_PARAMVALUE6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数值6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue6Dirty(){
        if(this.contains(FIELD_PARAMVALUE6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值6
     */
    @JsonIgnore
    public void resetParamValue6(){
        this.reset(FIELD_PARAMVALUE6);
    }

    /**
     * 设置 参数值6
     * <P>
     * 等同 {@link #setParamValue6}
     * @param paramValue6
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue6(Integer paramValue6){
        this.setParamValue6(paramValue6);
        return this;
    }

    /**
     * <B>PARAMVALUE7</B>&nbsp;参数值7
     */
    public final static String FIELD_PARAMVALUE7 = "paramvalue7";

    /**
     * 设置 参数值7
     * 
     * @param paramValue7
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE7)
    public void setParamValue7(BigDecimal paramValue7){
        this.set(FIELD_PARAMVALUE7, paramValue7);
    }
    
    /**
     * 获取 参数值7  
     * @return
     */
    @JsonIgnore
    public BigDecimal getParamValue7(){
        Object objValue = this.get(FIELD_PARAMVALUE7);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 参数值7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue7Dirty(){
        if(this.contains(FIELD_PARAMVALUE7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值7
     */
    @JsonIgnore
    public void resetParamValue7(){
        this.reset(FIELD_PARAMVALUE7);
    }

    /**
     * 设置 参数值7
     * <P>
     * 等同 {@link #setParamValue7}
     * @param paramValue7
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue7(BigDecimal paramValue7){
        this.setParamValue7(paramValue7);
        return this;
    }

    /**
     * <B>PARAMVALUE8</B>&nbsp;参数值8
     */
    public final static String FIELD_PARAMVALUE8 = "paramvalue8";

    /**
     * 设置 参数值8
     * 
     * @param paramValue8
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE8)
    public void setParamValue8(BigDecimal paramValue8){
        this.set(FIELD_PARAMVALUE8, paramValue8);
    }
    
    /**
     * 获取 参数值8  
     * @return
     */
    @JsonIgnore
    public BigDecimal getParamValue8(){
        Object objValue = this.get(FIELD_PARAMVALUE8);
        if(objValue==null){
            return null;
        }
        return (BigDecimal)objValue;
    }

    /**
     * 判断 参数值8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue8Dirty(){
        if(this.contains(FIELD_PARAMVALUE8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值8
     */
    @JsonIgnore
    public void resetParamValue8(){
        this.reset(FIELD_PARAMVALUE8);
    }

    /**
     * 设置 参数值8
     * <P>
     * 等同 {@link #setParamValue8}
     * @param paramValue8
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue8(BigDecimal paramValue8){
        this.setParamValue8(paramValue8);
        return this;
    }

    /**
     * <B>PARAMVALUE9</B>&nbsp;参数值9
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARAMVALUE9 = "paramvalue9";

    /**
     * 设置 参数值9
     * 
     * @param paramValue9
     * 
     */
    @JsonProperty(FIELD_PARAMVALUE9)
    public void setParamValue9(Integer paramValue9){
        this.set(FIELD_PARAMVALUE9, paramValue9);
    }
    
    /**
     * 获取 参数值9  
     * @return
     */
    @JsonIgnore
    public Integer getParamValue9(){
        Object objValue = this.get(FIELD_PARAMVALUE9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数值9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamValue9Dirty(){
        if(this.contains(FIELD_PARAMVALUE9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数值9
     */
    @JsonIgnore
    public void resetParamValue9(){
        this.reset(FIELD_PARAMVALUE9);
    }

    /**
     * 设置 参数值9
     * <P>
     * 等同 {@link #setParamValue9}
     * @param paramValue9
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue9(Integer paramValue9){
        this.setParamValue9(paramValue9);
        return this;
    }

     /**
     * 设置 参数值9
     * <P>
     * 等同 {@link #setParamValue9}
     * @param paramValue9
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO paramvalue9(Boolean paramValue9){
        if(paramValue9 == null){
            this.setParamValue9(null);
        }
        else{
            this.setParamValue9(paramValue9?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICID</B>&nbsp;系统界面逻辑，指定系统界面逻辑参数的所在的界面逻辑对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewLogicDTO} 
     */
    public final static String FIELD_PSSYSVIEWLOGICID = "pssysviewlogicid";

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * 
     * @param pSSysViewLogicId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICID)
    public void setPSSysViewLogicId(String pSSysViewLogicId){
        this.set(FIELD_PSSYSVIEWLOGICID, pSSysViewLogicId);
    }
    
    /**
     * 获取 系统界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicId(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicId(){
        this.reset(FIELD_PSSYSVIEWLOGICID);
    }

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICID}
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogicId
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicid(String pSSysViewLogicId){
        this.setPSSysViewLogicId(pSSysViewLogicId);
        return this;
    }

    /**
     * 设置 系统界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewLogicId}
     * @param pSSysViewLogic 引用对象
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicid(PSSysViewLogicDTO pSSysViewLogic){
        if(pSSysViewLogic == null){
            this.setPSSysViewLogicId(null);
            this.setPSSysViewLogicName(null);
        }
        else{
            this.setPSSysViewLogicId(pSSysViewLogic.getPSSysViewLogicId());
            this.setPSSysViewLogicName(pSSysViewLogic.getPSSysViewLogicName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICNAME</B>&nbsp;系统界面逻辑，指定系统界面逻辑参数的所在的界面逻辑对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWLOGICID}
     */
    public final static String FIELD_PSSYSVIEWLOGICNAME = "pssysviewlogicname";

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * 
     * @param pSSysViewLogicName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICNAME)
    public void setPSSysViewLogicName(String pSSysViewLogicName){
        this.set(FIELD_PSSYSVIEWLOGICNAME, pSSysViewLogicName);
    }
    
    /**
     * 获取 系统界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicName(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统界面逻辑
     */
    @JsonIgnore
    public void resetPSSysViewLogicName(){
        this.reset(FIELD_PSSYSVIEWLOGICNAME);
    }

    /**
     * 设置 系统界面逻辑，详细说明：{@link #FIELD_PSSYSVIEWLOGICNAME}
     * <P>
     * 等同 {@link #setPSSysViewLogicName}
     * @param pSSysViewLogicName
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicname(String pSSysViewLogicName){
        this.setPSSysViewLogicName(pSSysViewLogicName);
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICPARAMID</B>&nbsp;系统视图逻辑参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSVIEWLOGICPARAMID = "pssysviewlogicparamid";

    /**
     * 设置 系统视图逻辑参数标识
     * 
     * @param pSSysViewLogicParamId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICPARAMID)
    public void setPSSysViewLogicParamId(String pSSysViewLogicParamId){
        this.set(FIELD_PSSYSVIEWLOGICPARAMID, pSSysViewLogicParamId);
    }
    
    /**
     * 获取 系统视图逻辑参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicParamId(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图逻辑参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicParamIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图逻辑参数标识
     */
    @JsonIgnore
    public void resetPSSysViewLogicParamId(){
        this.reset(FIELD_PSSYSVIEWLOGICPARAMID);
    }

    /**
     * 设置 系统视图逻辑参数标识
     * <P>
     * 等同 {@link #setPSSysViewLogicParamId}
     * @param pSSysViewLogicParamId
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicparamid(String pSSysViewLogicParamId){
        this.setPSSysViewLogicParamId(pSSysViewLogicParamId);
        return this;
    }

    /**
     * <B>PSSYSVIEWLOGICPARAMNAME</B>&nbsp;参数名称，指定系统界面逻辑参数的名称，需在所在界面系统界面逻辑中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSVIEWLOGICPARAMNAME = "pssysviewlogicparamname";

    /**
     * 设置 参数名称，详细说明：{@link #FIELD_PSSYSVIEWLOGICPARAMNAME}
     * 
     * @param pSSysViewLogicParamName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWLOGICPARAMNAME)
    public void setPSSysViewLogicParamName(String pSSysViewLogicParamName){
        this.set(FIELD_PSSYSVIEWLOGICPARAMNAME, pSSysViewLogicParamName);
    }
    
    /**
     * 获取 参数名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewLogicParamName(){
        Object objValue = this.get(FIELD_PSSYSVIEWLOGICPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewLogicParamNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWLOGICPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数名称
     */
    @JsonIgnore
    public void resetPSSysViewLogicParamName(){
        this.reset(FIELD_PSSYSVIEWLOGICPARAMNAME);
    }

    /**
     * 设置 参数名称，详细说明：{@link #FIELD_PSSYSVIEWLOGICPARAMNAME}
     * <P>
     * 等同 {@link #setPSSysViewLogicParamName}
     * @param pSSysViewLogicParamName
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO pssysviewlogicparamname(String pSSysViewLogicParamName){
        this.setPSSysViewLogicParamName(pSSysViewLogicParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysViewLogicParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysViewLogicParamName(strName);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO name(String strName){
        this.setPSSysViewLogicParamName(strName);
        return this;
    }

    /**
     * <B>REFOBJID</B>&nbsp;引用对象标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFOBJID = "refobjid";

    /**
     * 设置 引用对象标识
     * 
     * @param refObjId
     * 
     */
    @JsonProperty(FIELD_REFOBJID)
    public void setRefObjId(String refObjId){
        this.set(FIELD_REFOBJID, refObjId);
    }
    
    /**
     * 获取 引用对象标识  
     * @return
     */
    @JsonIgnore
    public String getRefObjId(){
        Object objValue = this.get(FIELD_REFOBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用对象标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefObjIdDirty(){
        if(this.contains(FIELD_REFOBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用对象标识
     */
    @JsonIgnore
    public void resetRefObjId(){
        this.reset(FIELD_REFOBJID);
    }

    /**
     * 设置 引用对象标识
     * <P>
     * 等同 {@link #setRefObjId}
     * @param refObjId
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO refobjid(String refObjId){
        this.setRefObjId(refObjId);
        return this;
    }

    /**
     * <B>REFOBJNAME</B>&nbsp;引用对象名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_REFOBJNAME = "refobjname";

    /**
     * 设置 引用对象名称
     * 
     * @param refObjName
     * 
     */
    @JsonProperty(FIELD_REFOBJNAME)
    public void setRefObjName(String refObjName){
        this.set(FIELD_REFOBJNAME, refObjName);
    }
    
    /**
     * 获取 引用对象名称  
     * @return
     */
    @JsonIgnore
    public String getRefObjName(){
        Object objValue = this.get(FIELD_REFOBJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用对象名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefObjNameDirty(){
        if(this.contains(FIELD_REFOBJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用对象名称
     */
    @JsonIgnore
    public void resetRefObjName(){
        this.reset(FIELD_REFOBJNAME);
    }

    /**
     * 设置 引用对象名称
     * <P>
     * 等同 {@link #setRefObjName}
     * @param refObjName
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO refobjname(String refObjName){
        this.setRefObjName(refObjName);
        return this;
    }

    /**
     * <B>REFOBJTYPE</B>&nbsp;引用对象类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_REFOBJTYPE = "refobjtype";

    /**
     * 设置 引用对象类型
     * 
     * @param refObjType
     * 
     */
    @JsonProperty(FIELD_REFOBJTYPE)
    public void setRefObjType(String refObjType){
        this.set(FIELD_REFOBJTYPE, refObjType);
    }
    
    /**
     * 获取 引用对象类型  
     * @return
     */
    @JsonIgnore
    public String getRefObjType(){
        Object objValue = this.get(FIELD_REFOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefObjTypeDirty(){
        if(this.contains(FIELD_REFOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用对象类型
     */
    @JsonIgnore
    public void resetRefObjType(){
        this.reset(FIELD_REFOBJTYPE);
    }

    /**
     * 设置 引用对象类型
     * <P>
     * 等同 {@link #setRefObjType}
     * @param refObjType
     */
    @JsonIgnore
    public PSSysViewLogicParamDTO refobjtype(String refObjType){
        this.setRefObjType(refObjType);
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
    public PSSysViewLogicParamDTO updatedate(Timestamp updateDate){
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
    public PSSysViewLogicParamDTO updateman(String updateMan){
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
    public PSSysViewLogicParamDTO usercat(String userCat){
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
    public PSSysViewLogicParamDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysViewLogicParamDTO usertag(String userTag){
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
    public PSSysViewLogicParamDTO usertag2(String userTag2){
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
    public PSSysViewLogicParamDTO usertag3(String userTag3){
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
    public PSSysViewLogicParamDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysViewLogicParamId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysViewLogicParamId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysViewLogicParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysViewLogicParamId(strValue);
    }

    @JsonIgnore
    public PSSysViewLogicParamDTO id(String strValue){
        this.setPSSysViewLogicParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysViewLogicParamDTO){
            PSSysViewLogicParamDTO dto = (PSSysViewLogicParamDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
