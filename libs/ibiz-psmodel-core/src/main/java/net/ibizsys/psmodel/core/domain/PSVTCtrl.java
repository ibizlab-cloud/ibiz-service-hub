package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSVTCTRL</B>云平台视图类型部件 模型传输对象
 * <P>
 * 
 */
public class PSVTCtrl extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSVTCtrl(){
        this.setValidFlag(1);
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
    public PSVTCtrl createdate(String createDate){
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
    public PSVTCtrl createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLPARAM</B>&nbsp;控件参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM = "ctrlparam";

    /**
     * 设置 控件参数
     * 
     * @param ctrlParam
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM)
    public void setCtrlParam(String ctrlParam){
        this.set(FIELD_CTRLPARAM, ctrlParam);
    }
    
    /**
     * 获取 控件参数  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam(){
        Object objValue = this.get(FIELD_CTRLPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParamDirty(){
        if(this.contains(FIELD_CTRLPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数
     */
    @JsonIgnore
    public void resetCtrlParam(){
        this.reset(FIELD_CTRLPARAM);
    }

    /**
     * 设置 控件参数
     * <P>
     * 等同 {@link #setCtrlParam}
     * @param ctrlParam
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam(String ctrlParam){
        this.setCtrlParam(ctrlParam);
        return this;
    }

    /**
     * <B>CTRLPARAM10</B>&nbsp;控件参数10
     */
    public final static String FIELD_CTRLPARAM10 = "ctrlparam10";

    /**
     * 设置 控件参数10
     * 
     * @param ctrlParam10
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM10)
    public void setCtrlParam10(Double ctrlParam10){
        this.set(FIELD_CTRLPARAM10, ctrlParam10);
    }
    
    /**
     * 获取 控件参数10  
     * @return
     */
    @JsonIgnore
    public Double getCtrlParam10(){
        Object objValue = this.get(FIELD_CTRLPARAM10);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 控件参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam10Dirty(){
        if(this.contains(FIELD_CTRLPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数10
     */
    @JsonIgnore
    public void resetCtrlParam10(){
        this.reset(FIELD_CTRLPARAM10);
    }

    /**
     * 设置 控件参数10
     * <P>
     * 等同 {@link #setCtrlParam10}
     * @param ctrlParam10
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam10(Double ctrlParam10){
        this.setCtrlParam10(ctrlParam10);
        return this;
    }

    /**
     * <B>CTRLPARAM11</B>&nbsp;控件参数11
     */
    public final static String FIELD_CTRLPARAM11 = "ctrlparam11";

    /**
     * 设置 控件参数11
     * 
     * @param ctrlParam11
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM11)
    public void setCtrlParam11(Integer ctrlParam11){
        this.set(FIELD_CTRLPARAM11, ctrlParam11);
    }
    
    /**
     * 获取 控件参数11  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam11(){
        Object objValue = this.get(FIELD_CTRLPARAM11);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam11Dirty(){
        if(this.contains(FIELD_CTRLPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数11
     */
    @JsonIgnore
    public void resetCtrlParam11(){
        this.reset(FIELD_CTRLPARAM11);
    }

    /**
     * 设置 控件参数11
     * <P>
     * 等同 {@link #setCtrlParam11}
     * @param ctrlParam11
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam11(Integer ctrlParam11){
        this.setCtrlParam11(ctrlParam11);
        return this;
    }

    /**
     * <B>CTRLPARAM12</B>&nbsp;控件参数12
     */
    public final static String FIELD_CTRLPARAM12 = "ctrlparam12";

    /**
     * 设置 控件参数12
     * 
     * @param ctrlParam12
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM12)
    public void setCtrlParam12(Integer ctrlParam12){
        this.set(FIELD_CTRLPARAM12, ctrlParam12);
    }
    
    /**
     * 获取 控件参数12  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam12(){
        Object objValue = this.get(FIELD_CTRLPARAM12);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam12Dirty(){
        if(this.contains(FIELD_CTRLPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数12
     */
    @JsonIgnore
    public void resetCtrlParam12(){
        this.reset(FIELD_CTRLPARAM12);
    }

    /**
     * 设置 控件参数12
     * <P>
     * 等同 {@link #setCtrlParam12}
     * @param ctrlParam12
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam12(Integer ctrlParam12){
        this.setCtrlParam12(ctrlParam12);
        return this;
    }

    /**
     * <B>CTRLPARAM2</B>&nbsp;控件参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM2 = "ctrlparam2";

    /**
     * 设置 控件参数2
     * 
     * @param ctrlParam2
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM2)
    public void setCtrlParam2(String ctrlParam2){
        this.set(FIELD_CTRLPARAM2, ctrlParam2);
    }
    
    /**
     * 获取 控件参数2  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam2(){
        Object objValue = this.get(FIELD_CTRLPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam2Dirty(){
        if(this.contains(FIELD_CTRLPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数2
     */
    @JsonIgnore
    public void resetCtrlParam2(){
        this.reset(FIELD_CTRLPARAM2);
    }

    /**
     * 设置 控件参数2
     * <P>
     * 等同 {@link #setCtrlParam2}
     * @param ctrlParam2
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam2(String ctrlParam2){
        this.setCtrlParam2(ctrlParam2);
        return this;
    }

    /**
     * <B>CTRLPARAM3</B>&nbsp;控件参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM3 = "ctrlparam3";

    /**
     * 设置 控件参数3
     * 
     * @param ctrlParam3
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM3)
    public void setCtrlParam3(String ctrlParam3){
        this.set(FIELD_CTRLPARAM3, ctrlParam3);
    }
    
    /**
     * 获取 控件参数3  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam3(){
        Object objValue = this.get(FIELD_CTRLPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam3Dirty(){
        if(this.contains(FIELD_CTRLPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数3
     */
    @JsonIgnore
    public void resetCtrlParam3(){
        this.reset(FIELD_CTRLPARAM3);
    }

    /**
     * 设置 控件参数3
     * <P>
     * 等同 {@link #setCtrlParam3}
     * @param ctrlParam3
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam3(String ctrlParam3){
        this.setCtrlParam3(ctrlParam3);
        return this;
    }

    /**
     * <B>CTRLPARAM4</B>&nbsp;控件参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CTRLPARAM4 = "ctrlparam4";

    /**
     * 设置 控件参数4
     * 
     * @param ctrlParam4
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM4)
    public void setCtrlParam4(String ctrlParam4){
        this.set(FIELD_CTRLPARAM4, ctrlParam4);
    }
    
    /**
     * 获取 控件参数4  
     * @return
     */
    @JsonIgnore
    public String getCtrlParam4(){
        Object objValue = this.get(FIELD_CTRLPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam4Dirty(){
        if(this.contains(FIELD_CTRLPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数4
     */
    @JsonIgnore
    public void resetCtrlParam4(){
        this.reset(FIELD_CTRLPARAM4);
    }

    /**
     * 设置 控件参数4
     * <P>
     * 等同 {@link #setCtrlParam4}
     * @param ctrlParam4
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam4(String ctrlParam4){
        this.setCtrlParam4(ctrlParam4);
        return this;
    }

    /**
     * <B>CTRLPARAM5</B>&nbsp;控件参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLPARAM5 = "ctrlparam5";

    /**
     * 设置 控件参数5
     * 
     * @param ctrlParam5
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM5)
    public void setCtrlParam5(Integer ctrlParam5){
        this.set(FIELD_CTRLPARAM5, ctrlParam5);
    }
    
    /**
     * 获取 控件参数5  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam5(){
        Object objValue = this.get(FIELD_CTRLPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam5Dirty(){
        if(this.contains(FIELD_CTRLPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数5
     */
    @JsonIgnore
    public void resetCtrlParam5(){
        this.reset(FIELD_CTRLPARAM5);
    }

    /**
     * 设置 控件参数5
     * <P>
     * 等同 {@link #setCtrlParam5}
     * @param ctrlParam5
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam5(Integer ctrlParam5){
        this.setCtrlParam5(ctrlParam5);
        return this;
    }

     /**
     * 设置 控件参数5
     * <P>
     * 等同 {@link #setCtrlParam5}
     * @param ctrlParam5
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam5(Boolean ctrlParam5){
        if(ctrlParam5 == null){
            this.setCtrlParam5(null);
        }
        else{
            this.setCtrlParam5(ctrlParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CTRLPARAM6</B>&nbsp;控件参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CTRLPARAM6 = "ctrlparam6";

    /**
     * 设置 控件参数6
     * 
     * @param ctrlParam6
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM6)
    public void setCtrlParam6(Integer ctrlParam6){
        this.set(FIELD_CTRLPARAM6, ctrlParam6);
    }
    
    /**
     * 获取 控件参数6  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam6(){
        Object objValue = this.get(FIELD_CTRLPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam6Dirty(){
        if(this.contains(FIELD_CTRLPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数6
     */
    @JsonIgnore
    public void resetCtrlParam6(){
        this.reset(FIELD_CTRLPARAM6);
    }

    /**
     * 设置 控件参数6
     * <P>
     * 等同 {@link #setCtrlParam6}
     * @param ctrlParam6
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam6(Integer ctrlParam6){
        this.setCtrlParam6(ctrlParam6);
        return this;
    }

     /**
     * 设置 控件参数6
     * <P>
     * 等同 {@link #setCtrlParam6}
     * @param ctrlParam6
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam6(Boolean ctrlParam6){
        if(ctrlParam6 == null){
            this.setCtrlParam6(null);
        }
        else{
            this.setCtrlParam6(ctrlParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CTRLPARAM7</B>&nbsp;控件参数7
     */
    public final static String FIELD_CTRLPARAM7 = "ctrlparam7";

    /**
     * 设置 控件参数7
     * 
     * @param ctrlParam7
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM7)
    public void setCtrlParam7(Integer ctrlParam7){
        this.set(FIELD_CTRLPARAM7, ctrlParam7);
    }
    
    /**
     * 获取 控件参数7  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam7(){
        Object objValue = this.get(FIELD_CTRLPARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam7Dirty(){
        if(this.contains(FIELD_CTRLPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数7
     */
    @JsonIgnore
    public void resetCtrlParam7(){
        this.reset(FIELD_CTRLPARAM7);
    }

    /**
     * 设置 控件参数7
     * <P>
     * 等同 {@link #setCtrlParam7}
     * @param ctrlParam7
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam7(Integer ctrlParam7){
        this.setCtrlParam7(ctrlParam7);
        return this;
    }

    /**
     * <B>CTRLPARAM8</B>&nbsp;控件参数8
     */
    public final static String FIELD_CTRLPARAM8 = "ctrlparam8";

    /**
     * 设置 控件参数8
     * 
     * @param ctrlParam8
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM8)
    public void setCtrlParam8(Integer ctrlParam8){
        this.set(FIELD_CTRLPARAM8, ctrlParam8);
    }
    
    /**
     * 获取 控件参数8  
     * @return
     */
    @JsonIgnore
    public Integer getCtrlParam8(){
        Object objValue = this.get(FIELD_CTRLPARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 控件参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam8Dirty(){
        if(this.contains(FIELD_CTRLPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数8
     */
    @JsonIgnore
    public void resetCtrlParam8(){
        this.reset(FIELD_CTRLPARAM8);
    }

    /**
     * 设置 控件参数8
     * <P>
     * 等同 {@link #setCtrlParam8}
     * @param ctrlParam8
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam8(Integer ctrlParam8){
        this.setCtrlParam8(ctrlParam8);
        return this;
    }

    /**
     * <B>CTRLPARAM9</B>&nbsp;控件参数9
     */
    public final static String FIELD_CTRLPARAM9 = "ctrlparam9";

    /**
     * 设置 控件参数9
     * 
     * @param ctrlParam9
     * 
     */
    @JsonProperty(FIELD_CTRLPARAM9)
    public void setCtrlParam9(Double ctrlParam9){
        this.set(FIELD_CTRLPARAM9, ctrlParam9);
    }
    
    /**
     * 获取 控件参数9  
     * @return
     */
    @JsonIgnore
    public Double getCtrlParam9(){
        Object objValue = this.get(FIELD_CTRLPARAM9);
        if(objValue==null){
            return null;
        }
        return (Double)objValue;
    }

    /**
     * 判断 控件参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlParam9Dirty(){
        if(this.contains(FIELD_CTRLPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件参数9
     */
    @JsonIgnore
    public void resetCtrlParam9(){
        this.reset(FIELD_CTRLPARAM9);
    }

    /**
     * 设置 控件参数9
     * <P>
     * 等同 {@link #setCtrlParam9}
     * @param ctrlParam9
     */
    @JsonIgnore
    public PSVTCtrl ctrlparam9(Double ctrlParam9){
        this.setCtrlParam9(ctrlParam9);
        return this;
    }

    /**
     * <B>CTRLTYPE</B>&nbsp;部件类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlType} 
     */
    public final static String FIELD_CTRLTYPE = "ctrltype";

    /**
     * 设置 部件类型
     * 
     * @param ctrlType
     * 
     */
    @JsonProperty(FIELD_CTRLTYPE)
    public void setCtrlType(String ctrlType){
        this.set(FIELD_CTRLTYPE, ctrlType);
    }
    
    /**
     * 获取 部件类型  
     * @return
     */
    @JsonIgnore
    public String getCtrlType(){
        Object objValue = this.get(FIELD_CTRLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlTypeDirty(){
        if(this.contains(FIELD_CTRLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件类型
     */
    @JsonIgnore
    public void resetCtrlType(){
        this.reset(FIELD_CTRLTYPE);
    }

    /**
     * 设置 部件类型
     * <P>
     * 等同 {@link #setCtrlType}
     * @param ctrlType
     */
    @JsonIgnore
    public PSVTCtrl ctrltype(String ctrlType){
        this.setCtrlType(ctrlType);
        return this;
    }

     /**
     * 设置 部件类型
     * <P>
     * 等同 {@link #setCtrlType}
     * @param ctrlType
     */
    @JsonIgnore
    public PSVTCtrl ctrltype(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlType ctrlType){
        if(ctrlType == null){
            this.setCtrlType(null);
        }
        else{
            this.setCtrlType(ctrlType.value);
        }
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;是否默认
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 是否默认
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 是否默认  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否默认 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否默认
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 是否默认
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSVTCtrl defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 是否默认
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSVTCtrl defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNATOOL</B>&nbsp;支持动态工具建立
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDYNATOOL = "enabledynatool";

    /**
     * 设置 支持动态工具建立
     * 
     * @param enableDynaTool
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNATOOL)
    public void setEnableDynaTool(Integer enableDynaTool){
        this.set(FIELD_ENABLEDYNATOOL, enableDynaTool);
    }
    
    /**
     * 获取 支持动态工具建立  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaTool(){
        Object objValue = this.get(FIELD_ENABLEDYNATOOL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态工具建立 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaToolDirty(){
        if(this.contains(FIELD_ENABLEDYNATOOL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态工具建立
     */
    @JsonIgnore
    public void resetEnableDynaTool(){
        this.reset(FIELD_ENABLEDYNATOOL);
    }

    /**
     * 设置 支持动态工具建立
     * <P>
     * 等同 {@link #setEnableDynaTool}
     * @param enableDynaTool
     */
    @JsonIgnore
    public PSVTCtrl enabledynatool(Integer enableDynaTool){
        this.setEnableDynaTool(enableDynaTool);
        return this;
    }

     /**
     * 设置 支持动态工具建立
     * <P>
     * 等同 {@link #setEnableDynaTool}
     * @param enableDynaTool
     */
    @JsonIgnore
    public PSVTCtrl enabledynatool(Boolean enableDynaTool){
        if(enableDynaTool == null){
            this.setEnableDynaTool(null);
        }
        else{
            this.setEnableDynaTool(enableDynaTool?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用界面行为控制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用界面行为控制
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用界面行为控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableViewActions(){
        Object objValue = this.get(FIELD_ENABLEVIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用界面行为控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableViewActionsDirty(){
        if(this.contains(FIELD_ENABLEVIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用界面行为控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用界面行为控制
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSVTCtrl enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用界面行为控制
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSVTCtrl enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSVTCtrl memo(String memo){
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
    public PSVTCtrl ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSSYSACHANDLERID</B>&nbsp;部件处理器
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSACHANDLERID = "pssysachandlerid";

    /**
     * 设置 部件处理器
     * 
     * @param pSSysACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSSYSACHANDLERID)
    public void setPSSysACHandlerId(String pSSysACHandlerId){
        this.set(FIELD_PSSYSACHANDLERID, pSSysACHandlerId);
    }
    
    /**
     * 获取 部件处理器  
     * @return
     */
    @JsonIgnore
    public String getPSSysACHandlerId(){
        Object objValue = this.get(FIELD_PSSYSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysACHandlerIdDirty(){
        if(this.contains(FIELD_PSSYSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件处理器
     */
    @JsonIgnore
    public void resetPSSysACHandlerId(){
        this.reset(FIELD_PSSYSACHANDLERID);
    }

    /**
     * 设置 部件处理器
     * <P>
     * 等同 {@link #setPSSysACHandlerId}
     * @param pSSysACHandlerId
     */
    @JsonIgnore
    public PSVTCtrl pssysachandlerid(String pSSysACHandlerId){
        this.setPSSysACHandlerId(pSSysACHandlerId);
        return this;
    }

    /**
     * <B>PSSYSACHANDLERNAME</B>&nbsp;部件处理器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSACHANDLERID}
     */
    public final static String FIELD_PSSYSACHANDLERNAME = "pssysachandlername";

    /**
     * 设置 部件处理器
     * 
     * @param pSSysACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSSYSACHANDLERNAME)
    public void setPSSysACHandlerName(String pSSysACHandlerName){
        this.set(FIELD_PSSYSACHANDLERNAME, pSSysACHandlerName);
    }
    
    /**
     * 获取 部件处理器  
     * @return
     */
    @JsonIgnore
    public String getPSSysACHandlerName(){
        Object objValue = this.get(FIELD_PSSYSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysACHandlerNameDirty(){
        if(this.contains(FIELD_PSSYSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件处理器
     */
    @JsonIgnore
    public void resetPSSysACHandlerName(){
        this.reset(FIELD_PSSYSACHANDLERNAME);
    }

    /**
     * 设置 部件处理器
     * <P>
     * 等同 {@link #setPSSysACHandlerName}
     * @param pSSysACHandlerName
     */
    @JsonIgnore
    public PSVTCtrl pssysachandlername(String pSSysACHandlerName){
        this.setPSSysACHandlerName(pSSysACHandlerName);
        return this;
    }

    /**
     * <B>PSSYSTOOLBARID</B>&nbsp;云平台工具栏
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTOOLBARID = "pssystoolbarid";

    /**
     * 设置 云平台工具栏
     * 
     * @param pSSysToolbarId
     * 
     */
    @JsonProperty(FIELD_PSSYSTOOLBARID)
    public void setPSSysToolbarId(String pSSysToolbarId){
        this.set(FIELD_PSSYSTOOLBARID, pSSysToolbarId);
    }
    
    /**
     * 获取 云平台工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysToolbarId(){
        Object objValue = this.get(FIELD_PSSYSTOOLBARID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysToolbarIdDirty(){
        if(this.contains(FIELD_PSSYSTOOLBARID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台工具栏
     */
    @JsonIgnore
    public void resetPSSysToolbarId(){
        this.reset(FIELD_PSSYSTOOLBARID);
    }

    /**
     * 设置 云平台工具栏
     * <P>
     * 等同 {@link #setPSSysToolbarId}
     * @param pSSysToolbarId
     */
    @JsonIgnore
    public PSVTCtrl pssystoolbarid(String pSSysToolbarId){
        this.setPSSysToolbarId(pSSysToolbarId);
        return this;
    }

    /**
     * <B>PSSYSTOOLBARNAME</B>&nbsp;云平台工具栏
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTOOLBARID}
     */
    public final static String FIELD_PSSYSTOOLBARNAME = "pssystoolbarname";

    /**
     * 设置 云平台工具栏
     * 
     * @param pSSysToolbarName
     * 
     */
    @JsonProperty(FIELD_PSSYSTOOLBARNAME)
    public void setPSSysToolbarName(String pSSysToolbarName){
        this.set(FIELD_PSSYSTOOLBARNAME, pSSysToolbarName);
    }
    
    /**
     * 获取 云平台工具栏  
     * @return
     */
    @JsonIgnore
    public String getPSSysToolbarName(){
        Object objValue = this.get(FIELD_PSSYSTOOLBARNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台工具栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysToolbarNameDirty(){
        if(this.contains(FIELD_PSSYSTOOLBARNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台工具栏
     */
    @JsonIgnore
    public void resetPSSysToolbarName(){
        this.reset(FIELD_PSSYSTOOLBARNAME);
    }

    /**
     * 设置 云平台工具栏
     * <P>
     * 等同 {@link #setPSSysToolbarName}
     * @param pSSysToolbarName
     */
    @JsonIgnore
    public PSVTCtrl pssystoolbarname(String pSSysToolbarName){
        this.setPSSysToolbarName(pSSysToolbarName);
        return this;
    }

    /**
     * <B>PSVIEWTYPEID</B>&nbsp;视图类型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSViewType} 
     */
    public final static String FIELD_PSVIEWTYPEID = "psviewtypeid";

    /**
     * 设置 视图类型
     * 
     * @param pSViewTypeId
     * 
     */
    @JsonProperty(FIELD_PSVIEWTYPEID)
    public void setPSViewTypeId(String pSViewTypeId){
        this.set(FIELD_PSVIEWTYPEID, pSViewTypeId);
    }
    
    /**
     * 获取 视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSViewTypeId(){
        Object objValue = this.get(FIELD_PSVIEWTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewTypeIdDirty(){
        if(this.contains(FIELD_PSVIEWTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型
     */
    @JsonIgnore
    public void resetPSViewTypeId(){
        this.reset(FIELD_PSVIEWTYPEID);
    }

    /**
     * 设置 视图类型
     * <P>
     * 等同 {@link #setPSViewTypeId}
     * @param pSViewTypeId
     */
    @JsonIgnore
    public PSVTCtrl psviewtypeid(String pSViewTypeId){
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    /**
     * 设置 视图类型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewTypeId}
     * @param pSViewType 引用对象
     */
    @JsonIgnore
    public PSVTCtrl psviewtypeid(PSViewType pSViewType){
        if(pSViewType == null){
            this.setPSViewTypeId(null);
            this.setPSViewTypeName(null);
        }
        else{
            this.setPSViewTypeId(pSViewType.getPSViewTypeId());
            this.setPSViewTypeName(pSViewType.getPSViewTypeName());
        }
        return this;
    }

    /**
     * <B>PSVIEWTYPENAME</B>&nbsp;视图类型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWTYPEID}
     */
    public final static String FIELD_PSVIEWTYPENAME = "psviewtypename";

    /**
     * 设置 视图类型
     * 
     * @param pSViewTypeName
     * 
     */
    @JsonProperty(FIELD_PSVIEWTYPENAME)
    public void setPSViewTypeName(String pSViewTypeName){
        this.set(FIELD_PSVIEWTYPENAME, pSViewTypeName);
    }
    
    /**
     * 获取 视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSViewTypeName(){
        Object objValue = this.get(FIELD_PSVIEWTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewTypeNameDirty(){
        if(this.contains(FIELD_PSVIEWTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型
     */
    @JsonIgnore
    public void resetPSViewTypeName(){
        this.reset(FIELD_PSVIEWTYPENAME);
    }

    /**
     * 设置 视图类型
     * <P>
     * 等同 {@link #setPSViewTypeName}
     * @param pSViewTypeName
     */
    @JsonIgnore
    public PSVTCtrl psviewtypename(String pSViewTypeName){
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    /**
     * <B>PSVTCTRLID</B>&nbsp;云平台视图类型部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVTCTRLID = "psvtctrlid";

    /**
     * 设置 云平台视图类型部件标识
     * 
     * @param pSVTCtrlId
     * 
     */
    @JsonProperty(FIELD_PSVTCTRLID)
    public void setPSVTCtrlId(String pSVTCtrlId){
        this.set(FIELD_PSVTCTRLID, pSVTCtrlId);
    }
    
    /**
     * 获取 云平台视图类型部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSVTCtrlId(){
        Object objValue = this.get(FIELD_PSVTCTRLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台视图类型部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVTCtrlIdDirty(){
        if(this.contains(FIELD_PSVTCTRLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台视图类型部件标识
     */
    @JsonIgnore
    public void resetPSVTCtrlId(){
        this.reset(FIELD_PSVTCTRLID);
    }

    /**
     * 设置 云平台视图类型部件标识
     * <P>
     * 等同 {@link #setPSVTCtrlId}
     * @param pSVTCtrlId
     */
    @JsonIgnore
    public PSVTCtrl psvtctrlid(String pSVTCtrlId){
        this.setPSVTCtrlId(pSVTCtrlId);
        return this;
    }

    /**
     * <B>PSVTCTRLNAME</B>&nbsp;部件名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSVTCTRLNAME = "psvtctrlname";

    /**
     * 设置 部件名称
     * 
     * @param pSVTCtrlName
     * 
     */
    @JsonProperty(FIELD_PSVTCTRLNAME)
    public void setPSVTCtrlName(String pSVTCtrlName){
        this.set(FIELD_PSVTCTRLNAME, pSVTCtrlName);
    }
    
    /**
     * 获取 部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSVTCtrlName(){
        Object objValue = this.get(FIELD_PSVTCTRLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVTCtrlNameDirty(){
        if(this.contains(FIELD_PSVTCTRLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件名称
     */
    @JsonIgnore
    public void resetPSVTCtrlName(){
        this.reset(FIELD_PSVTCTRLNAME);
    }

    /**
     * 设置 部件名称
     * <P>
     * 等同 {@link #setPSVTCtrlName}
     * @param pSVTCtrlName
     */
    @JsonIgnore
    public PSVTCtrl psvtctrlname(String pSVTCtrlName){
        this.setPSVTCtrlName(pSVTCtrlName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSVTCtrlName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSVTCtrlName(strName);
    }

    @JsonIgnore
    public PSVTCtrl name(String strName){
        this.setPSVTCtrlName(strName);
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
    public PSVTCtrl updatedate(String updateDate){
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
    public PSVTCtrl updateman(String updateMan){
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
    public PSVTCtrl usercat(String userCat){
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
    public PSVTCtrl usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSVTCtrl usertag(String userTag){
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
    public PSVTCtrl usertag2(String userTag2){
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
    public PSVTCtrl usertag3(String userTag3){
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
    public PSVTCtrl usertag4(String userTag4){
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
    public PSVTCtrl validflag(Integer validFlag){
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
    public PSVTCtrl validflag(Boolean validFlag){
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
        return this.getPSVTCtrlId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSVTCtrlId(strValue);
    }

    @JsonIgnore
    public PSVTCtrl id(String strValue){
        this.setPSVTCtrlId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSVTCtrl){
            PSVTCtrl model = (PSVTCtrl)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
