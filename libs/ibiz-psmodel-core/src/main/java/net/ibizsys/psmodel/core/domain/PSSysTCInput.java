package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSTCINPUT</B>系统测试用例输入 模型传输对象
 * <P>
 * 测试用例输入模型，定义测试用例的输入数据
 */
public class PSSysTCInput extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysTCInput(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIONPARAMS</B>&nbsp;操作参数，指定测试用例输入的操作参数集合
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_ACTIONPARAMS = "actionparams";

    /**
     * 设置 操作参数，详细说明：{@link #FIELD_ACTIONPARAMS}
     * 
     * @param actionParams
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAMS)
    public void setActionParams(String actionParams){
        this.set(FIELD_ACTIONPARAMS, actionParams);
    }
    
    /**
     * 获取 操作参数  
     * @return
     */
    @JsonIgnore
    public String getActionParams(){
        Object objValue = this.get(FIELD_ACTIONPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParamsDirty(){
        if(this.contains(FIELD_ACTIONPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数
     */
    @JsonIgnore
    public void resetActionParams(){
        this.reset(FIELD_ACTIONPARAMS);
    }

    /**
     * 设置 操作参数，详细说明：{@link #FIELD_ACTIONPARAMS}
     * <P>
     * 等同 {@link #setActionParams}
     * @param actionParams
     */
    @JsonIgnore
    public PSSysTCInput actionparams(String actionParams){
        this.setActionParams(actionParams);
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
    public PSSysTCInput createdate(String createDate){
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
    public PSSysTCInput createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码，测试用例输入类型为【自定义代码】时指定自定义的代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 脚本代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 脚本代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 脚本代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 脚本代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSysTCInput customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DEFPSSYSSAMPLEVALUEID</B>&nbsp;当前属性示例值，测试用例类型为【实体属性值规则】指定属性的值，来自系统示例值
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSampleValue} 
     */
    public final static String FIELD_DEFPSSYSSAMPLEVALUEID = "defpssyssamplevalueid";

    /**
     * 设置 当前属性示例值，详细说明：{@link #FIELD_DEFPSSYSSAMPLEVALUEID}
     * 
     * @param dEFPSSysSampleValueId
     * 
     */
    @JsonProperty(FIELD_DEFPSSYSSAMPLEVALUEID)
    public void setDEFPSSysSampleValueId(String dEFPSSysSampleValueId){
        this.set(FIELD_DEFPSSYSSAMPLEVALUEID, dEFPSSysSampleValueId);
    }
    
    /**
     * 获取 当前属性示例值  
     * @return
     */
    @JsonIgnore
    public String getDEFPSSysSampleValueId(){
        Object objValue = this.get(FIELD_DEFPSSYSSAMPLEVALUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前属性示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFPSSysSampleValueIdDirty(){
        if(this.contains(FIELD_DEFPSSYSSAMPLEVALUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前属性示例值
     */
    @JsonIgnore
    public void resetDEFPSSysSampleValueId(){
        this.reset(FIELD_DEFPSSYSSAMPLEVALUEID);
    }

    /**
     * 设置 当前属性示例值，详细说明：{@link #FIELD_DEFPSSYSSAMPLEVALUEID}
     * <P>
     * 等同 {@link #setDEFPSSysSampleValueId}
     * @param dEFPSSysSampleValueId
     */
    @JsonIgnore
    public PSSysTCInput defpssyssamplevalueid(String dEFPSSysSampleValueId){
        this.setDEFPSSysSampleValueId(dEFPSSysSampleValueId);
        return this;
    }

    /**
     * 设置 当前属性示例值，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDEFPSSysSampleValueId}
     * @param pSSysSampleValue 引用对象
     */
    @JsonIgnore
    public PSSysTCInput defpssyssamplevalueid(PSSysSampleValue pSSysSampleValue){
        if(pSSysSampleValue == null){
            this.setDEFPSSysSampleValueId(null);
            this.setDEFPSSysSampleValueName(null);
        }
        else{
            this.setDEFPSSysSampleValueId(pSSysSampleValue.getPSSysSampleValueId());
            this.setDEFPSSysSampleValueName(pSSysSampleValue.getPSSysSampleValueName());
        }
        return this;
    }

    /**
     * <B>DEFPSSYSSAMPLEVALUENAME</B>&nbsp;当前属性示例值，测试用例类型为【实体属性值规则】指定属性的值，来自系统示例值
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DEFPSSYSSAMPLEVALUEID}
     */
    public final static String FIELD_DEFPSSYSSAMPLEVALUENAME = "defpssyssamplevaluename";

    /**
     * 设置 当前属性示例值，详细说明：{@link #FIELD_DEFPSSYSSAMPLEVALUENAME}
     * 
     * @param dEFPSSysSampleValueName
     * 
     */
    @JsonProperty(FIELD_DEFPSSYSSAMPLEVALUENAME)
    public void setDEFPSSysSampleValueName(String dEFPSSysSampleValueName){
        this.set(FIELD_DEFPSSYSSAMPLEVALUENAME, dEFPSSysSampleValueName);
    }
    
    /**
     * 获取 当前属性示例值  
     * @return
     */
    @JsonIgnore
    public String getDEFPSSysSampleValueName(){
        Object objValue = this.get(FIELD_DEFPSSYSSAMPLEVALUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前属性示例值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFPSSysSampleValueNameDirty(){
        if(this.contains(FIELD_DEFPSSYSSAMPLEVALUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前属性示例值
     */
    @JsonIgnore
    public void resetDEFPSSysSampleValueName(){
        this.reset(FIELD_DEFPSSYSSAMPLEVALUENAME);
    }

    /**
     * 设置 当前属性示例值，详细说明：{@link #FIELD_DEFPSSYSSAMPLEVALUENAME}
     * <P>
     * 等同 {@link #setDEFPSSysSampleValueName}
     * @param dEFPSSysSampleValueName
     */
    @JsonIgnore
    public PSSysTCInput defpssyssamplevaluename(String dEFPSSysSampleValueName){
        this.setDEFPSSysSampleValueName(dEFPSSysSampleValueName);
        return this;
    }

    /**
     * <B>DEFVALUE</B>&nbsp;当前属性值，测试用例类型为【实体属性值规则】指定属性的值
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_DEFVALUE = "defvalue";

    /**
     * 设置 当前属性值，详细说明：{@link #FIELD_DEFVALUE}
     * 
     * @param dEFValue
     * 
     */
    @JsonProperty(FIELD_DEFVALUE)
    public void setDEFValue(String dEFValue){
        this.set(FIELD_DEFVALUE, dEFValue);
    }
    
    /**
     * 获取 当前属性值  
     * @return
     */
    @JsonIgnore
    public String getDEFValue(){
        Object objValue = this.get(FIELD_DEFVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前属性值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFValueDirty(){
        if(this.contains(FIELD_DEFVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前属性值
     */
    @JsonIgnore
    public void resetDEFValue(){
        this.reset(FIELD_DEFVALUE);
    }

    /**
     * 设置 当前属性值，详细说明：{@link #FIELD_DEFVALUE}
     * <P>
     * 等同 {@link #setDEFValue}
     * @param dEFValue
     */
    @JsonIgnore
    public PSSysTCInput defvalue(String dEFValue){
        this.setDEFValue(dEFValue);
        return this;
    }

    /**
     * <B>INPUTTAG</B>&nbsp;输入标记，指定测试用例输入的标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_INPUTTAG = "inputtag";

    /**
     * 设置 输入标记，详细说明：{@link #FIELD_INPUTTAG}
     * 
     * @param inputTag
     * 
     */
    @JsonProperty(FIELD_INPUTTAG)
    public void setInputTag(String inputTag){
        this.set(FIELD_INPUTTAG, inputTag);
    }
    
    /**
     * 获取 输入标记  
     * @return
     */
    @JsonIgnore
    public String getInputTag(){
        Object objValue = this.get(FIELD_INPUTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputTagDirty(){
        if(this.contains(FIELD_INPUTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入标记
     */
    @JsonIgnore
    public void resetInputTag(){
        this.reset(FIELD_INPUTTAG);
    }

    /**
     * 设置 输入标记，详细说明：{@link #FIELD_INPUTTAG}
     * <P>
     * 等同 {@link #setInputTag}
     * @param inputTag
     */
    @JsonIgnore
    public PSSysTCInput inputtag(String inputTag){
        this.setInputTag(inputTag);
        return this;
    }

    /**
     * <B>INPUTTAG2</B>&nbsp;输入标记2，指定测试用例输入的标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_INPUTTAG2 = "inputtag2";

    /**
     * 设置 输入标记2，详细说明：{@link #FIELD_INPUTTAG2}
     * 
     * @param inputTag2
     * 
     */
    @JsonProperty(FIELD_INPUTTAG2)
    public void setInputTag2(String inputTag2){
        this.set(FIELD_INPUTTAG2, inputTag2);
    }
    
    /**
     * 获取 输入标记2  
     * @return
     */
    @JsonIgnore
    public String getInputTag2(){
        Object objValue = this.get(FIELD_INPUTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputTag2Dirty(){
        if(this.contains(FIELD_INPUTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入标记2
     */
    @JsonIgnore
    public void resetInputTag2(){
        this.reset(FIELD_INPUTTAG2);
    }

    /**
     * 设置 输入标记2，详细说明：{@link #FIELD_INPUTTAG2}
     * <P>
     * 等同 {@link #setInputTag2}
     * @param inputTag2
     */
    @JsonIgnore
    public PSSysTCInput inputtag2(String inputTag2){
        this.setInputTag2(inputTag2);
        return this;
    }

    /**
     * <B>INPUTTAG3</B>&nbsp;输入标记3，指定测试用例输入的标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_INPUTTAG3 = "inputtag3";

    /**
     * 设置 输入标记3，详细说明：{@link #FIELD_INPUTTAG3}
     * 
     * @param inputTag3
     * 
     */
    @JsonProperty(FIELD_INPUTTAG3)
    public void setInputTag3(String inputTag3){
        this.set(FIELD_INPUTTAG3, inputTag3);
    }
    
    /**
     * 获取 输入标记3  
     * @return
     */
    @JsonIgnore
    public String getInputTag3(){
        Object objValue = this.get(FIELD_INPUTTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputTag3Dirty(){
        if(this.contains(FIELD_INPUTTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入标记3
     */
    @JsonIgnore
    public void resetInputTag3(){
        this.reset(FIELD_INPUTTAG3);
    }

    /**
     * 设置 输入标记3，详细说明：{@link #FIELD_INPUTTAG3}
     * <P>
     * 等同 {@link #setInputTag3}
     * @param inputTag3
     */
    @JsonIgnore
    public PSSysTCInput inputtag3(String inputTag3){
        this.setInputTag3(inputTag3);
        return this;
    }

    /**
     * <B>INPUTTAG4</B>&nbsp;输入标记4，指定测试用例输入的标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_INPUTTAG4 = "inputtag4";

    /**
     * 设置 输入标记4，详细说明：{@link #FIELD_INPUTTAG4}
     * 
     * @param inputTag4
     * 
     */
    @JsonProperty(FIELD_INPUTTAG4)
    public void setInputTag4(String inputTag4){
        this.set(FIELD_INPUTTAG4, inputTag4);
    }
    
    /**
     * 获取 输入标记4  
     * @return
     */
    @JsonIgnore
    public String getInputTag4(){
        Object objValue = this.get(FIELD_INPUTTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputTag4Dirty(){
        if(this.contains(FIELD_INPUTTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入标记4
     */
    @JsonIgnore
    public void resetInputTag4(){
        this.reset(FIELD_INPUTTAG4);
    }

    /**
     * 设置 输入标记4，详细说明：{@link #FIELD_INPUTTAG4}
     * <P>
     * 等同 {@link #setInputTag4}
     * @param inputTag4
     */
    @JsonIgnore
    public PSSysTCInput inputtag4(String inputTag4){
        this.setInputTag4(inputTag4);
        return this;
    }

    /**
     * <B>INPUTTYPE</B>&nbsp;输入类型，指定测试用例输入的类型，未定义时为【数据】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseInputType} 
     */
    public final static String FIELD_INPUTTYPE = "inputtype";

    /**
     * 设置 输入类型，详细说明：{@link #FIELD_INPUTTYPE}
     * 
     * @param inputType
     * 
     */
    @JsonProperty(FIELD_INPUTTYPE)
    public void setInputType(String inputType){
        this.set(FIELD_INPUTTYPE, inputType);
    }
    
    /**
     * 获取 输入类型  
     * @return
     */
    @JsonIgnore
    public String getInputType(){
        Object objValue = this.get(FIELD_INPUTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputTypeDirty(){
        if(this.contains(FIELD_INPUTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入类型
     */
    @JsonIgnore
    public void resetInputType(){
        this.reset(FIELD_INPUTTYPE);
    }

    /**
     * 设置 输入类型，详细说明：{@link #FIELD_INPUTTYPE}
     * <P>
     * 等同 {@link #setInputType}
     * @param inputType
     */
    @JsonIgnore
    public PSSysTCInput inputtype(String inputType){
        this.setInputType(inputType);
        return this;
    }

     /**
     * 设置 输入类型，详细说明：{@link #FIELD_INPUTTYPE}
     * <P>
     * 等同 {@link #setInputType}
     * @param inputType
     */
    @JsonIgnore
    public PSSysTCInput inputtype(net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseInputType inputType){
        if(inputType == null){
            this.setInputType(null);
        }
        else{
            this.setInputType(inputType.value);
        }
        return this;
    }

    /**
     * <B>INPUTVALUES</B>&nbsp;其它输入值，指定测试用例输入的其它输入值
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_INPUTVALUES = "inputvalues";

    /**
     * 设置 其它输入值，详细说明：{@link #FIELD_INPUTVALUES}
     * 
     * @param inputValues
     * 
     */
    @JsonProperty(FIELD_INPUTVALUES)
    public void setInputValues(String inputValues){
        this.set(FIELD_INPUTVALUES, inputValues);
    }
    
    /**
     * 获取 其它输入值  
     * @return
     */
    @JsonIgnore
    public String getInputValues(){
        Object objValue = this.get(FIELD_INPUTVALUES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 其它输入值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInputValuesDirty(){
        if(this.contains(FIELD_INPUTVALUES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 其它输入值
     */
    @JsonIgnore
    public void resetInputValues(){
        this.reset(FIELD_INPUTVALUES);
    }

    /**
     * 设置 其它输入值，详细说明：{@link #FIELD_INPUTVALUES}
     * <P>
     * 等同 {@link #setInputValues}
     * @param inputValues
     */
    @JsonIgnore
    public PSSysTCInput inputvalues(String inputValues){
        this.setInputValues(inputValues);
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
    public PSSysTCInput memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;输入次序，指定测试用例输入的次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 输入次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 输入次序  
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
     * 判断 输入次序 是否指定值，包括空值
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
     * 重置 输入次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 输入次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysTCInput ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;输入实体行为，指定测试用例输入调用实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 输入实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 输入实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionId(){
        Object objValue = this.get(FIELD_PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionIdDirty(){
        if(this.contains(FIELD_PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 输入实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSSysTCInput psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 输入实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysTCInput psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;输入实体行为，指定测试用例输入调用实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 输入实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 输入实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionName(){
        Object objValue = this.get(FIELD_PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionNameDirty(){
        if(this.contains(FIELD_PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 输入实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSSysTCInput psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTCASEID}
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性标识
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性标识  
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
     * 判断 实体属性标识 是否指定值，包括空值
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
     * 重置 实体属性标识
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性标识
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysTCInput psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTCASEID}
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
    public PSSysTCInput psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSTCINPUTID</B>&nbsp;系统测试用例输入标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTCINPUTID = "pssystcinputid";

    /**
     * 设置 系统测试用例输入标识
     * 
     * @param pSSysTCInputId
     * 
     */
    @JsonProperty(FIELD_PSSYSTCINPUTID)
    public void setPSSysTCInputId(String pSSysTCInputId){
        this.set(FIELD_PSSYSTCINPUTID, pSSysTCInputId);
    }
    
    /**
     * 获取 系统测试用例输入标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTCInputId(){
        Object objValue = this.get(FIELD_PSSYSTCINPUTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试用例输入标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTCInputIdDirty(){
        if(this.contains(FIELD_PSSYSTCINPUTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试用例输入标识
     */
    @JsonIgnore
    public void resetPSSysTCInputId(){
        this.reset(FIELD_PSSYSTCINPUTID);
    }

    /**
     * 设置 系统测试用例输入标识
     * <P>
     * 等同 {@link #setPSSysTCInputId}
     * @param pSSysTCInputId
     */
    @JsonIgnore
    public PSSysTCInput pssystcinputid(String pSSysTCInputId){
        this.setPSSysTCInputId(pSSysTCInputId);
        return this;
    }

    /**
     * <B>PSSYSTCINPUTNAME</B>&nbsp;用例输入标识，指定测试用例输入的标识，需在所属测试用例中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSTCINPUTNAME = "pssystcinputname";

    /**
     * 设置 用例输入标识，详细说明：{@link #FIELD_PSSYSTCINPUTNAME}
     * 
     * @param pSSysTCInputName
     * 
     */
    @JsonProperty(FIELD_PSSYSTCINPUTNAME)
    public void setPSSysTCInputName(String pSSysTCInputName){
        this.set(FIELD_PSSYSTCINPUTNAME, pSSysTCInputName);
    }
    
    /**
     * 获取 用例输入标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTCInputName(){
        Object objValue = this.get(FIELD_PSSYSTCINPUTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例输入标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTCInputNameDirty(){
        if(this.contains(FIELD_PSSYSTCINPUTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例输入标识
     */
    @JsonIgnore
    public void resetPSSysTCInputName(){
        this.reset(FIELD_PSSYSTCINPUTNAME);
    }

    /**
     * 设置 用例输入标识，详细说明：{@link #FIELD_PSSYSTCINPUTNAME}
     * <P>
     * 等同 {@link #setPSSysTCInputName}
     * @param pSSysTCInputName
     */
    @JsonIgnore
    public PSSysTCInput pssystcinputname(String pSSysTCInputName){
        this.setPSSysTCInputName(pSSysTCInputName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTCInputName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTCInputName(strName);
    }

    @JsonIgnore
    public PSSysTCInput name(String strName){
        this.setPSSysTCInputName(strName);
        return this;
    }

    /**
     * <B>PSSYSTESTCASEID</B>&nbsp;系统测试用例，指定测试用例输入所属的测试用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTestCase} 
     */
    public final static String FIELD_PSSYSTESTCASEID = "pssystestcaseid";

    /**
     * 设置 系统测试用例，详细说明：{@link #FIELD_PSSYSTESTCASEID}
     * 
     * @param pSSysTestCaseId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTCASEID)
    public void setPSSysTestCaseId(String pSSysTestCaseId){
        this.set(FIELD_PSSYSTESTCASEID, pSSysTestCaseId);
    }
    
    /**
     * 获取 系统测试用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestCaseId(){
        Object objValue = this.get(FIELD_PSSYSTESTCASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestCaseIdDirty(){
        if(this.contains(FIELD_PSSYSTESTCASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试用例
     */
    @JsonIgnore
    public void resetPSSysTestCaseId(){
        this.reset(FIELD_PSSYSTESTCASEID);
    }

    /**
     * 设置 系统测试用例，详细说明：{@link #FIELD_PSSYSTESTCASEID}
     * <P>
     * 等同 {@link #setPSSysTestCaseId}
     * @param pSSysTestCaseId
     */
    @JsonIgnore
    public PSSysTCInput pssystestcaseid(String pSSysTestCaseId){
        this.setPSSysTestCaseId(pSSysTestCaseId);
        return this;
    }

    /**
     * 设置 系统测试用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestCaseId}
     * @param pSSysTestCase 引用对象
     */
    @JsonIgnore
    public PSSysTCInput pssystestcaseid(PSSysTestCase pSSysTestCase){
        if(pSSysTestCase == null){
            this.setPSDEFId(null);
            this.setPSDEId(null);
            this.setPSSysTestCaseId(null);
            this.setPSSysTestCaseName(null);
            this.setTargetType(null);
        }
        else{
            this.setPSDEFId(pSSysTestCase.getPSDEFId());
            this.setPSDEId(pSSysTestCase.getPSDEId());
            this.setPSSysTestCaseId(pSSysTestCase.getPSSysTestCaseId());
            this.setPSSysTestCaseName(pSSysTestCase.getPSSysTestCaseName());
            this.setTargetType(pSSysTestCase.getTargetType());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTCASENAME</B>&nbsp;系统测试用例，指定测试用例输入所属的测试用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTCASEID}
     */
    public final static String FIELD_PSSYSTESTCASENAME = "pssystestcasename";

    /**
     * 设置 系统测试用例，详细说明：{@link #FIELD_PSSYSTESTCASENAME}
     * 
     * @param pSSysTestCaseName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTCASENAME)
    public void setPSSysTestCaseName(String pSSysTestCaseName){
        this.set(FIELD_PSSYSTESTCASENAME, pSSysTestCaseName);
    }
    
    /**
     * 获取 系统测试用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestCaseName(){
        Object objValue = this.get(FIELD_PSSYSTESTCASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestCaseNameDirty(){
        if(this.contains(FIELD_PSSYSTESTCASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试用例
     */
    @JsonIgnore
    public void resetPSSysTestCaseName(){
        this.reset(FIELD_PSSYSTESTCASENAME);
    }

    /**
     * 设置 系统测试用例，详细说明：{@link #FIELD_PSSYSTESTCASENAME}
     * <P>
     * 等同 {@link #setPSSysTestCaseName}
     * @param pSSysTestCaseName
     */
    @JsonIgnore
    public PSSysTCInput pssystestcasename(String pSSysTestCaseName){
        this.setPSSysTestCaseName(pSSysTestCaseName);
        return this;
    }

    /**
     * <B>PSSYSTESTDATAID</B>&nbsp;系统测试数据，指定测试用例输入的测试数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTestData} 
     */
    public final static String FIELD_PSSYSTESTDATAID = "pssystestdataid";

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATAID}
     * 
     * @param pSSysTestDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATAID)
    public void setPSSysTestDataId(String pSSysTestDataId){
        this.set(FIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }
    
    /**
     * 获取 系统测试数据  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestDataId(){
        Object objValue = this.get(FIELD_PSSYSTESTDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestDataIdDirty(){
        if(this.contains(FIELD_PSSYSTESTDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试数据
     */
    @JsonIgnore
    public void resetPSSysTestDataId(){
        this.reset(FIELD_PSSYSTESTDATAID);
    }

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATAID}
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestDataId
     */
    @JsonIgnore
    public PSSysTCInput pssystestdataid(String pSSysTestDataId){
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    /**
     * 设置 系统测试数据，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestData 引用对象
     */
    @JsonIgnore
    public PSSysTCInput pssystestdataid(PSSysTestData pSSysTestData){
        if(pSSysTestData == null){
            this.setPSSysTestDataId(null);
            this.setPSSysTestDataName(null);
        }
        else{
            this.setPSSysTestDataId(pSSysTestData.getPSSysTestDataId());
            this.setPSSysTestDataName(pSSysTestData.getPSSysTestDataName());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTDATANAME</B>&nbsp;系统测试数据，指定测试用例输入的测试数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTDATAID}
     */
    public final static String FIELD_PSSYSTESTDATANAME = "pssystestdataname";

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * 
     * @param pSSysTestDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATANAME)
    public void setPSSysTestDataName(String pSSysTestDataName){
        this.set(FIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }
    
    /**
     * 获取 系统测试数据  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestDataName(){
        Object objValue = this.get(FIELD_PSSYSTESTDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestDataNameDirty(){
        if(this.contains(FIELD_PSSYSTESTDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试数据
     */
    @JsonIgnore
    public void resetPSSysTestDataName(){
        this.reset(FIELD_PSSYSTESTDATANAME);
    }

    /**
     * 设置 系统测试数据，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * <P>
     * 等同 {@link #setPSSysTestDataName}
     * @param pSSysTestDataName
     */
    @JsonIgnore
    public PSSysTCInput pssystestdataname(String pSSysTestDataName){
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    /**
     * <B>TARGETTYPE</B>&nbsp;用例目标
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseTargetType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTCASEID}
     */
    public final static String FIELD_TARGETTYPE = "targettype";

    /**
     * 设置 用例目标
     * 
     * @param targetType
     * 
     */
    @JsonProperty(FIELD_TARGETTYPE)
    public void setTargetType(String targetType){
        this.set(FIELD_TARGETTYPE, targetType);
    }
    
    /**
     * 获取 用例目标  
     * @return
     */
    @JsonIgnore
    public String getTargetType(){
        Object objValue = this.get(FIELD_TARGETTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例目标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTargetTypeDirty(){
        if(this.contains(FIELD_TARGETTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例目标
     */
    @JsonIgnore
    public void resetTargetType(){
        this.reset(FIELD_TARGETTYPE);
    }

    /**
     * 设置 用例目标
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSSysTCInput targettype(String targetType){
        this.setTargetType(targetType);
        return this;
    }

    /**
     * <B>TESTDATASN</B>&nbsp;随机测试数据索引，指定测试用例输入的随机测试数据索引
     */
    public final static String FIELD_TESTDATASN = "testdatasn";

    /**
     * 设置 随机测试数据索引，详细说明：{@link #FIELD_TESTDATASN}
     * 
     * @param testDataSN
     * 
     */
    @JsonProperty(FIELD_TESTDATASN)
    public void setTestDataSN(Integer testDataSN){
        this.set(FIELD_TESTDATASN, testDataSN);
    }
    
    /**
     * 获取 随机测试数据索引  
     * @return
     */
    @JsonIgnore
    public Integer getTestDataSN(){
        Object objValue = this.get(FIELD_TESTDATASN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 随机测试数据索引 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestDataSNDirty(){
        if(this.contains(FIELD_TESTDATASN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 随机测试数据索引
     */
    @JsonIgnore
    public void resetTestDataSN(){
        this.reset(FIELD_TESTDATASN);
    }

    /**
     * 设置 随机测试数据索引，详细说明：{@link #FIELD_TESTDATASN}
     * <P>
     * 等同 {@link #setTestDataSN}
     * @param testDataSN
     */
    @JsonIgnore
    public PSSysTCInput testdatasn(Integer testDataSN){
        this.setTestDataSN(testDataSN);
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
    public PSSysTCInput updatedate(String updateDate){
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
    public PSSysTCInput updateman(String updateMan){
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
    public PSSysTCInput usercat(String userCat){
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
    public PSSysTCInput usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysTCInput usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysTCInput usertag2(String userTag2){
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
    public PSSysTCInput usertag3(String userTag3){
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
    public PSSysTCInput usertag4(String userTag4){
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
    public PSSysTCInput validflag(Integer validFlag){
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
    public PSSysTCInput validflag(Boolean validFlag){
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
        return this.getPSSysTCInputId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTCInputId(strValue);
    }

    @JsonIgnore
    public PSSysTCInput id(String strValue){
        this.setPSSysTCInputId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysTCInput){
            PSSysTCInput model = (PSSysTCInput)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
