package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTESTCASE</B>系统测试用例 模型传输对象
 * <P>
 * 系统测试用例模型，定义实体行为、应用视图等类型的测试用例，包含测试输入数据及测试结果断言模型
 */
public class PSSysTestCase extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysTestCase(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIONPARAMS</B>&nbsp;操作参数，指定测试用例的操作参数集合
     * <P>
     * 字符串：最大长度 500
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
    public PSSysTestCase actionparams(String actionParams){
        this.setActionParams(actionParams);
        return this;
    }

    /**
     * <B>ASSERTRESULT</B>&nbsp;预期结果，指定测试用例的预期结果数据
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_ASSERTRESULT = "assertresult";

    /**
     * 设置 预期结果，详细说明：{@link #FIELD_ASSERTRESULT}
     * 
     * @param assertResult
     * 
     */
    @JsonProperty(FIELD_ASSERTRESULT)
    public void setAssertResult(String assertResult){
        this.set(FIELD_ASSERTRESULT, assertResult);
    }
    
    /**
     * 获取 预期结果  
     * @return
     */
    @JsonIgnore
    public String getAssertResult(){
        Object objValue = this.get(FIELD_ASSERTRESULT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预期结果 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssertResultDirty(){
        if(this.contains(FIELD_ASSERTRESULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预期结果
     */
    @JsonIgnore
    public void resetAssertResult(){
        this.reset(FIELD_ASSERTRESULT);
    }

    /**
     * 设置 预期结果，详细说明：{@link #FIELD_ASSERTRESULT}
     * <P>
     * 等同 {@link #setAssertResult}
     * @param assertResult
     */
    @JsonIgnore
    public PSSysTestCase assertresult(String assertResult){
        this.setAssertResult(assertResult);
        return this;
    }

    /**
     * <B>ASSERTTYPE</B>&nbsp;预期类型，指定测试用例的预期结果类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseAssertType} 
     */
    public final static String FIELD_ASSERTTYPE = "asserttype";

    /**
     * 设置 预期类型，详细说明：{@link #FIELD_ASSERTTYPE}
     * 
     * @param assertType
     * 
     */
    @JsonProperty(FIELD_ASSERTTYPE)
    public void setAssertType(String assertType){
        this.set(FIELD_ASSERTTYPE, assertType);
    }
    
    /**
     * 获取 预期类型  
     * @return
     */
    @JsonIgnore
    public String getAssertType(){
        Object objValue = this.get(FIELD_ASSERTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预期类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssertTypeDirty(){
        if(this.contains(FIELD_ASSERTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预期类型
     */
    @JsonIgnore
    public void resetAssertType(){
        this.reset(FIELD_ASSERTTYPE);
    }

    /**
     * 设置 预期类型，详细说明：{@link #FIELD_ASSERTTYPE}
     * <P>
     * 等同 {@link #setAssertType}
     * @param assertType
     */
    @JsonIgnore
    public PSSysTestCase asserttype(String assertType){
        this.setAssertType(assertType);
        return this;
    }

     /**
     * 设置 预期类型，详细说明：{@link #FIELD_ASSERTTYPE}
     * <P>
     * 等同 {@link #setAssertType}
     * @param assertType
     */
    @JsonIgnore
    public PSSysTestCase asserttype(net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseAssertType assertType){
        if(assertType == null){
            this.setAssertType(null);
        }
        else{
            this.setAssertType(assertType.value);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统测试用例的代码标识，需在所属的测试项目或实体中具备唯一性
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
    public PSSysTestCase codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;内容
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 设置 内容
     * 
     * @param content
     * 
     */
    @JsonProperty(FIELD_CONTENT)
    public void setContent(String content){
        this.set(FIELD_CONTENT, content);
    }
    
    /**
     * 获取 内容  
     * @return
     */
    @JsonIgnore
    public String getContent(){
        Object objValue = this.get(FIELD_CONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentDirty(){
        if(this.contains(FIELD_CONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容
     */
    @JsonIgnore
    public void resetContent(){
        this.reset(FIELD_CONTENT);
    }

    /**
     * 设置 内容
     * <P>
     * 等同 {@link #setContent}
     * @param content
     */
    @JsonIgnore
    public PSSysTestCase content(String content){
        this.setContent(content);
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
    public PSSysTestCase createdate(String createDate){
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
    public PSSysTestCase createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysTestCase defpssyssamplevalueid(String dEFPSSysSampleValueId){
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
    public PSSysTestCase defpssyssamplevalueid(PSSysSampleValue pSSysSampleValue){
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
    public PSSysTestCase defpssyssamplevaluename(String dEFPSSysSampleValueName){
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
    public PSSysTestCase defvalue(String dEFValue){
        this.setDEFValue(dEFValue);
        return this;
    }

    /**
     * <B>EXCEPTIONDATA</B>&nbsp;异常参数，测试用例预期结果类型为【预期异常】指定预期的异常数据
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXCEPTIONDATA = "exceptiondata";

    /**
     * 设置 异常参数，详细说明：{@link #FIELD_EXCEPTIONDATA}
     * 
     * @param exceptionData
     * 
     */
    @JsonProperty(FIELD_EXCEPTIONDATA)
    public void setExceptionData(String exceptionData){
        this.set(FIELD_EXCEPTIONDATA, exceptionData);
    }
    
    /**
     * 获取 异常参数  
     * @return
     */
    @JsonIgnore
    public String getExceptionData(){
        Object objValue = this.get(FIELD_EXCEPTIONDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异常参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExceptionDataDirty(){
        if(this.contains(FIELD_EXCEPTIONDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异常参数
     */
    @JsonIgnore
    public void resetExceptionData(){
        this.reset(FIELD_EXCEPTIONDATA);
    }

    /**
     * 设置 异常参数，详细说明：{@link #FIELD_EXCEPTIONDATA}
     * <P>
     * 等同 {@link #setExceptionData}
     * @param exceptionData
     */
    @JsonIgnore
    public PSSysTestCase exceptiondata(String exceptionData){
        this.setExceptionData(exceptionData);
        return this;
    }

    /**
     * <B>EXCEPTIONDATA2</B>&nbsp;异常参数2，测试用例预期结果类型为【预期异常】指定预期的异常数据2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EXCEPTIONDATA2 = "exceptiondata2";

    /**
     * 设置 异常参数2，详细说明：{@link #FIELD_EXCEPTIONDATA2}
     * 
     * @param exceptionData2
     * 
     */
    @JsonProperty(FIELD_EXCEPTIONDATA2)
    public void setExceptionData2(String exceptionData2){
        this.set(FIELD_EXCEPTIONDATA2, exceptionData2);
    }
    
    /**
     * 获取 异常参数2  
     * @return
     */
    @JsonIgnore
    public String getExceptionData2(){
        Object objValue = this.get(FIELD_EXCEPTIONDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异常参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExceptionData2Dirty(){
        if(this.contains(FIELD_EXCEPTIONDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异常参数2
     */
    @JsonIgnore
    public void resetExceptionData2(){
        this.reset(FIELD_EXCEPTIONDATA2);
    }

    /**
     * 设置 异常参数2，详细说明：{@link #FIELD_EXCEPTIONDATA2}
     * <P>
     * 等同 {@link #setExceptionData2}
     * @param exceptionData2
     */
    @JsonIgnore
    public PSSysTestCase exceptiondata2(String exceptionData2){
        this.setExceptionData2(exceptionData2);
        return this;
    }

    /**
     * <B>EXCEPTIONNAME</B>&nbsp;异常名称，测试用例预期结果类型为【预期异常】指定预期的异常名称
     * <P>
     * 字符串：最大长度 260
     */
    public final static String FIELD_EXCEPTIONNAME = "exceptionname";

    /**
     * 设置 异常名称，详细说明：{@link #FIELD_EXCEPTIONNAME}
     * 
     * @param exceptionName
     * 
     */
    @JsonProperty(FIELD_EXCEPTIONNAME)
    public void setExceptionName(String exceptionName){
        this.set(FIELD_EXCEPTIONNAME, exceptionName);
    }
    
    /**
     * 获取 异常名称  
     * @return
     */
    @JsonIgnore
    public String getExceptionName(){
        Object objValue = this.get(FIELD_EXCEPTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 异常名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExceptionNameDirty(){
        if(this.contains(FIELD_EXCEPTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 异常名称
     */
    @JsonIgnore
    public void resetExceptionName(){
        this.reset(FIELD_EXCEPTIONNAME);
    }

    /**
     * 设置 异常名称，详细说明：{@link #FIELD_EXCEPTIONNAME}
     * <P>
     * 等同 {@link #setExceptionName}
     * @param exceptionName
     */
    @JsonIgnore
    public PSSysTestCase exceptionname(String exceptionName){
        this.setExceptionName(exceptionName);
        return this;
    }

    /**
     * <B>INPUTVALUES</B>&nbsp;其它输入值，指定测试用例的其它输入值
     * <P>
     * 字符串：最大长度 1000
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
    public PSSysTestCase inputvalues(String inputValues){
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
    public PSSysTestCase memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;测试顺序，指定测试用例的测试次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 测试顺序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 测试顺序  
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
     * 判断 测试顺序 是否指定值，包括空值
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
     * 重置 测试顺序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 测试顺序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysTestCase ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图，测试用例目标为【应用视图】时指定相关的应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSSysTestCase psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSSysTestCase psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图，测试用例目标为【应用视图】时指定相关的应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSSysTestCase psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，测试用例目标为【实体行为】时指定相关的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体行为  
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
     * 判断 实体行为 是否指定值，包括空值
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
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSSysTestCase psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSSysTestCase psdeactionid(PSDEAction pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，测试用例目标为【实体行为】时指定相关的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体行为  
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
     * 判断 实体行为 是否指定值，包括空值
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
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSSysTestCase psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，测试用例目标为【实体属性值规则】时指定相关的实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysTestCase psdefid(String pSDEFId){
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
    public PSSysTestCase psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，测试用例目标为【实体属性值规则】时指定相关的实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSSysTestCase psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定测试用例所属的实体
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
    public PSSysTestCase psdeid(String pSDEId){
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
    public PSSysTestCase psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体逻辑，测试用例目标为【实体逻辑】时指定相关的实体逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSSysTestCase psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSSysTestCase psdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;实体逻辑，测试用例目标为【实体逻辑】时指定相关的实体逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSSysTestCase psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定测试用例所属的实体
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
    public PSSysTestCase psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDESADETAILID</B>&nbsp;服务接口方法，测试用例目标为【实体接口方法】时 指定相关的服务接口方法
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDESADetail} 
     */
    public final static String FIELD_PSDESADETAILID = "psdesadetailid";

    /**
     * 设置 服务接口方法，详细说明：{@link #FIELD_PSDESADETAILID}
     * 
     * @param pSDESADetailId
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILID)
    public void setPSDESADetailId(String pSDESADetailId){
        this.set(FIELD_PSDESADETAILID, pSDESADetailId);
    }
    
    /**
     * 获取 服务接口方法  
     * @return
     */
    @JsonIgnore
    public String getPSDESADetailId(){
        Object objValue = this.get(FIELD_PSDESADETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务接口方法 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESADetailIdDirty(){
        if(this.contains(FIELD_PSDESADETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务接口方法
     */
    @JsonIgnore
    public void resetPSDESADetailId(){
        this.reset(FIELD_PSDESADETAILID);
    }

    /**
     * 设置 服务接口方法，详细说明：{@link #FIELD_PSDESADETAILID}
     * <P>
     * 等同 {@link #setPSDESADetailId}
     * @param pSDESADetailId
     */
    @JsonIgnore
    public PSSysTestCase psdesadetailid(String pSDESADetailId){
        this.setPSDESADetailId(pSDESADetailId);
        return this;
    }

    /**
     * 设置 服务接口方法，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDESADetailId}
     * @param pSDESADetail 引用对象
     */
    @JsonIgnore
    public PSSysTestCase psdesadetailid(PSDESADetail pSDESADetail){
        if(pSDESADetail == null){
            this.setPSDESADetailId(null);
            this.setPSDESADetailName(null);
        }
        else{
            this.setPSDESADetailId(pSDESADetail.getPSDESADetailId());
            this.setPSDESADetailName(pSDESADetail.getPSDESADetailName());
        }
        return this;
    }

    /**
     * <B>PSDESADETAILNAME</B>&nbsp;服务接口方法，测试用例目标为【实体接口方法】时 指定相关的服务接口方法
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESADETAILID}
     */
    public final static String FIELD_PSDESADETAILNAME = "psdesadetailname";

    /**
     * 设置 服务接口方法，详细说明：{@link #FIELD_PSDESADETAILNAME}
     * 
     * @param pSDESADetailName
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILNAME)
    public void setPSDESADetailName(String pSDESADetailName){
        this.set(FIELD_PSDESADETAILNAME, pSDESADetailName);
    }
    
    /**
     * 获取 服务接口方法  
     * @return
     */
    @JsonIgnore
    public String getPSDESADetailName(){
        Object objValue = this.get(FIELD_PSDESADETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务接口方法 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESADetailNameDirty(){
        if(this.contains(FIELD_PSDESADETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务接口方法
     */
    @JsonIgnore
    public void resetPSDESADetailName(){
        this.reset(FIELD_PSDESADETAILNAME);
    }

    /**
     * 设置 服务接口方法，详细说明：{@link #FIELD_PSDESADETAILNAME}
     * <P>
     * 等同 {@link #setPSDESADetailName}
     * @param pSDESADetailName
     */
    @JsonIgnore
    public PSSysTestCase psdesadetailname(String pSDESADetailName){
        this.setPSDESADetailName(pSDESADetailName);
        return this;
    }

    /**
     * <B>PSDESERVICEAPIID</B>&nbsp;实体服务接口，测试用例目标为【实体接口方法】时 指定相关的服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_PSDESERVICEAPIID = "psdeserviceapiid";

    /**
     * 设置 实体服务接口，详细说明：{@link #FIELD_PSDESERVICEAPIID}
     * 
     * @param pSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPIID)
    public void setPSDEServiceAPIId(String pSDEServiceAPIId){
        this.set(FIELD_PSDESERVICEAPIID, pSDEServiceAPIId);
    }
    
    /**
     * 获取 实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSDEServiceAPIId(){
        Object objValue = this.get(FIELD_PSDESERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEServiceAPIIdDirty(){
        if(this.contains(FIELD_PSDESERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体服务接口
     */
    @JsonIgnore
    public void resetPSDEServiceAPIId(){
        this.reset(FIELD_PSDESERVICEAPIID);
    }

    /**
     * 设置 实体服务接口，详细说明：{@link #FIELD_PSDESERVICEAPIID}
     * <P>
     * 等同 {@link #setPSDEServiceAPIId}
     * @param pSDEServiceAPIId
     */
    @JsonIgnore
    public PSSysTestCase psdeserviceapiid(String pSDEServiceAPIId){
        this.setPSDEServiceAPIId(pSDEServiceAPIId);
        return this;
    }

    /**
     * 设置 实体服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEServiceAPIId}
     * @param pSDEServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysTestCase psdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
        }
        else{
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSDESERVICEAPINAME</B>&nbsp;实体服务接口，测试用例目标为【实体接口方法】时 指定相关的服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESERVICEAPIID}
     */
    public final static String FIELD_PSDESERVICEAPINAME = "psdeserviceapiname";

    /**
     * 设置 实体服务接口，详细说明：{@link #FIELD_PSDESERVICEAPINAME}
     * 
     * @param pSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPINAME)
    public void setPSDEServiceAPIName(String pSDEServiceAPIName){
        this.set(FIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }
    
    /**
     * 获取 实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSDEServiceAPIName(){
        Object objValue = this.get(FIELD_PSDESERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEServiceAPINameDirty(){
        if(this.contains(FIELD_PSDESERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体服务接口
     */
    @JsonIgnore
    public void resetPSDEServiceAPIName(){
        this.reset(FIELD_PSDESERVICEAPINAME);
    }

    /**
     * 设置 实体服务接口，详细说明：{@link #FIELD_PSDESERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSDEServiceAPIName}
     * @param pSDEServiceAPIName
     */
    @JsonIgnore
    public PSSysTestCase psdeserviceapiname(String pSDEServiceAPIName){
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTPRJID}
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用标识
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用标识
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用标识
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSysTestCase pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSSysTestCase pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSSysTestCase pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSSysTestCase pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTPRJID}
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口标识
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口标识
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口标识
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSysTestCase pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysTestCase pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysTestCase pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysTestCase pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSTESTCASEID</B>&nbsp;系统测试用例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTESTCASEID = "pssystestcaseid";

    /**
     * 设置 系统测试用例标识
     * 
     * @param pSSysTestCaseId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTCASEID)
    public void setPSSysTestCaseId(String pSSysTestCaseId){
        this.set(FIELD_PSSYSTESTCASEID, pSSysTestCaseId);
    }
    
    /**
     * 获取 系统测试用例标识  
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
     * 判断 系统测试用例标识 是否指定值，包括空值
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
     * 重置 系统测试用例标识
     */
    @JsonIgnore
    public void resetPSSysTestCaseId(){
        this.reset(FIELD_PSSYSTESTCASEID);
    }

    /**
     * 设置 系统测试用例标识
     * <P>
     * 等同 {@link #setPSSysTestCaseId}
     * @param pSSysTestCaseId
     */
    @JsonIgnore
    public PSSysTestCase pssystestcaseid(String pSSysTestCaseId){
        this.setPSSysTestCaseId(pSSysTestCaseId);
        return this;
    }

    /**
     * <B>PSSYSTESTCASENAME</B>&nbsp;测试用例名称，指定测试用例的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSTESTCASENAME = "pssystestcasename";

    /**
     * 设置 测试用例名称，详细说明：{@link #FIELD_PSSYSTESTCASENAME}
     * 
     * @param pSSysTestCaseName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTCASENAME)
    public void setPSSysTestCaseName(String pSSysTestCaseName){
        this.set(FIELD_PSSYSTESTCASENAME, pSSysTestCaseName);
    }
    
    /**
     * 获取 测试用例名称  
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
     * 判断 测试用例名称 是否指定值，包括空值
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
     * 重置 测试用例名称
     */
    @JsonIgnore
    public void resetPSSysTestCaseName(){
        this.reset(FIELD_PSSYSTESTCASENAME);
    }

    /**
     * 设置 测试用例名称，详细说明：{@link #FIELD_PSSYSTESTCASENAME}
     * <P>
     * 等同 {@link #setPSSysTestCaseName}
     * @param pSSysTestCaseName
     */
    @JsonIgnore
    public PSSysTestCase pssystestcasename(String pSSysTestCaseName){
        this.setPSSysTestCaseName(pSSysTestCaseName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTestCaseName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTestCaseName(strName);
    }

    @JsonIgnore
    public PSSysTestCase name(String strName){
        this.setPSSysTestCaseName(strName);
        return this;
    }

    /**
     * <B>PSSYSTESTDATAID</B>&nbsp;系统测试数据，指定测试用例的输入测试数据
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
    public PSSysTestCase pssystestdataid(String pSSysTestDataId){
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
    public PSSysTestCase pssystestdataid(PSSysTestData pSSysTestData){
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
     * <B>PSSYSTESTDATANAME</B>&nbsp;系统测试数据，指定测试用例的输入测试数据
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
    public PSSysTestCase pssystestdataname(String pSSysTestDataName){
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    /**
     * <B>PSSYSTESTMODULEID</B>&nbsp;测试模块，指定测试用例所属的测试模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTestModule} 
     */
    public final static String FIELD_PSSYSTESTMODULEID = "pssystestmoduleid";

    /**
     * 设置 测试模块，详细说明：{@link #FIELD_PSSYSTESTMODULEID}
     * 
     * @param pSSysTestModuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTMODULEID)
    public void setPSSysTestModuleId(String pSSysTestModuleId){
        this.set(FIELD_PSSYSTESTMODULEID, pSSysTestModuleId);
    }
    
    /**
     * 获取 测试模块  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestModuleId(){
        Object objValue = this.get(FIELD_PSSYSTESTMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestModuleIdDirty(){
        if(this.contains(FIELD_PSSYSTESTMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试模块
     */
    @JsonIgnore
    public void resetPSSysTestModuleId(){
        this.reset(FIELD_PSSYSTESTMODULEID);
    }

    /**
     * 设置 测试模块，详细说明：{@link #FIELD_PSSYSTESTMODULEID}
     * <P>
     * 等同 {@link #setPSSysTestModuleId}
     * @param pSSysTestModuleId
     */
    @JsonIgnore
    public PSSysTestCase pssystestmoduleid(String pSSysTestModuleId){
        this.setPSSysTestModuleId(pSSysTestModuleId);
        return this;
    }

    /**
     * 设置 测试模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestModuleId}
     * @param pSSysTestModule 引用对象
     */
    @JsonIgnore
    public PSSysTestCase pssystestmoduleid(PSSysTestModule pSSysTestModule){
        if(pSSysTestModule == null){
            this.setPSSysTestModuleId(null);
            this.setPSSysTestModuleName(null);
        }
        else{
            this.setPSSysTestModuleId(pSSysTestModule.getPSSysTestModuleId());
            this.setPSSysTestModuleName(pSSysTestModule.getPSSysTestModuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTMODULENAME</B>&nbsp;测试模块，指定测试用例所属的测试模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTMODULEID}
     */
    public final static String FIELD_PSSYSTESTMODULENAME = "pssystestmodulename";

    /**
     * 设置 测试模块，详细说明：{@link #FIELD_PSSYSTESTMODULENAME}
     * 
     * @param pSSysTestModuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTMODULENAME)
    public void setPSSysTestModuleName(String pSSysTestModuleName){
        this.set(FIELD_PSSYSTESTMODULENAME, pSSysTestModuleName);
    }
    
    /**
     * 获取 测试模块  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestModuleName(){
        Object objValue = this.get(FIELD_PSSYSTESTMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestModuleNameDirty(){
        if(this.contains(FIELD_PSSYSTESTMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试模块
     */
    @JsonIgnore
    public void resetPSSysTestModuleName(){
        this.reset(FIELD_PSSYSTESTMODULENAME);
    }

    /**
     * 设置 测试模块，详细说明：{@link #FIELD_PSSYSTESTMODULENAME}
     * <P>
     * 等同 {@link #setPSSysTestModuleName}
     * @param pSSysTestModuleName
     */
    @JsonIgnore
    public PSSysTestCase pssystestmodulename(String pSSysTestModuleName){
        this.setPSSysTestModuleName(pSSysTestModuleName);
        return this;
    }

    /**
     * <B>PSSYSTESTPRJID</B>&nbsp;系统测试项目，指定测试用例所属的测试项目
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTestPrj} 
     */
    public final static String FIELD_PSSYSTESTPRJID = "pssystestprjid";

    /**
     * 设置 系统测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJID}
     * 
     * @param pSSysTestPrjId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTPRJID)
    public void setPSSysTestPrjId(String pSSysTestPrjId){
        this.set(FIELD_PSSYSTESTPRJID, pSSysTestPrjId);
    }
    
    /**
     * 获取 系统测试项目  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestPrjId(){
        Object objValue = this.get(FIELD_PSSYSTESTPRJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestPrjIdDirty(){
        if(this.contains(FIELD_PSSYSTESTPRJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试项目
     */
    @JsonIgnore
    public void resetPSSysTestPrjId(){
        this.reset(FIELD_PSSYSTESTPRJID);
    }

    /**
     * 设置 系统测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJID}
     * <P>
     * 等同 {@link #setPSSysTestPrjId}
     * @param pSSysTestPrjId
     */
    @JsonIgnore
    public PSSysTestCase pssystestprjid(String pSSysTestPrjId){
        this.setPSSysTestPrjId(pSSysTestPrjId);
        return this;
    }

    /**
     * 设置 系统测试项目，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestPrjId}
     * @param pSSysTestPrj 引用对象
     */
    @JsonIgnore
    public PSSysTestCase pssystestprjid(PSSysTestPrj pSSysTestPrj){
        if(pSSysTestPrj == null){
            this.setPSSysAppId(null);
            this.setPSSysServiceAPIId(null);
            this.setPSSysTestPrjId(null);
            this.setPSSysTestPrjName(null);
        }
        else{
            this.setPSSysAppId(pSSysTestPrj.getPSSysAppId());
            this.setPSSysServiceAPIId(pSSysTestPrj.getPSSysServiceAPIId());
            this.setPSSysTestPrjId(pSSysTestPrj.getPSSysTestPrjId());
            this.setPSSysTestPrjName(pSSysTestPrj.getPSSysTestPrjName());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTPRJNAME</B>&nbsp;系统测试项目，指定测试用例所属的测试项目
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTPRJID}
     */
    public final static String FIELD_PSSYSTESTPRJNAME = "pssystestprjname";

    /**
     * 设置 系统测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJNAME}
     * 
     * @param pSSysTestPrjName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTPRJNAME)
    public void setPSSysTestPrjName(String pSSysTestPrjName){
        this.set(FIELD_PSSYSTESTPRJNAME, pSSysTestPrjName);
    }
    
    /**
     * 获取 系统测试项目  
     * @return
     */
    @JsonIgnore
    public String getPSSysTestPrjName(){
        Object objValue = this.get(FIELD_PSSYSTESTPRJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试项目 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTestPrjNameDirty(){
        if(this.contains(FIELD_PSSYSTESTPRJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试项目
     */
    @JsonIgnore
    public void resetPSSysTestPrjName(){
        this.reset(FIELD_PSSYSTESTPRJNAME);
    }

    /**
     * 设置 系统测试项目，详细说明：{@link #FIELD_PSSYSTESTPRJNAME}
     * <P>
     * 等同 {@link #setPSSysTestPrjName}
     * @param pSSysTestPrjName
     */
    @JsonIgnore
    public PSSysTestCase pssystestprjname(String pSSysTestPrjName){
        this.setPSSysTestPrjName(pSSysTestPrjName);
        return this;
    }

    /**
     * <B>ROLLBACKTRAN</B>&nbsp;回滚事物，指定测试用例执行后不管成功失败都需要回滚事务，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ROLLBACKTRAN = "rollbacktran";

    /**
     * 设置 回滚事物，详细说明：{@link #FIELD_ROLLBACKTRAN}
     * 
     * @param rollbackTran
     * 
     */
    @JsonProperty(FIELD_ROLLBACKTRAN)
    public void setRollbackTran(Integer rollbackTran){
        this.set(FIELD_ROLLBACKTRAN, rollbackTran);
    }
    
    /**
     * 获取 回滚事物  
     * @return
     */
    @JsonIgnore
    public Integer getRollbackTran(){
        Object objValue = this.get(FIELD_ROLLBACKTRAN);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 回滚事物 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRollbackTranDirty(){
        if(this.contains(FIELD_ROLLBACKTRAN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 回滚事物
     */
    @JsonIgnore
    public void resetRollbackTran(){
        this.reset(FIELD_ROLLBACKTRAN);
    }

    /**
     * 设置 回滚事物，详细说明：{@link #FIELD_ROLLBACKTRAN}
     * <P>
     * 等同 {@link #setRollbackTran}
     * @param rollbackTran
     */
    @JsonIgnore
    public PSSysTestCase rollbacktran(Integer rollbackTran){
        this.setRollbackTran(rollbackTran);
        return this;
    }

     /**
     * 设置 回滚事物，详细说明：{@link #FIELD_ROLLBACKTRAN}
     * <P>
     * 等同 {@link #setRollbackTran}
     * @param rollbackTran
     */
    @JsonIgnore
    public PSSysTestCase rollbacktran(Boolean rollbackTran){
        if(rollbackTran == null){
            this.setRollbackTran(null);
        }
        else{
            this.setRollbackTran(rollbackTran?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TARGETTYPE</B>&nbsp;测试目标类型，指定测试用例的目标类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseTargetType} 
     */
    public final static String FIELD_TARGETTYPE = "targettype";

    /**
     * 设置 测试目标类型，详细说明：{@link #FIELD_TARGETTYPE}
     * 
     * @param targetType
     * 
     */
    @JsonProperty(FIELD_TARGETTYPE)
    public void setTargetType(String targetType){
        this.set(FIELD_TARGETTYPE, targetType);
    }
    
    /**
     * 获取 测试目标类型  
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
     * 判断 测试目标类型 是否指定值，包括空值
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
     * 重置 测试目标类型
     */
    @JsonIgnore
    public void resetTargetType(){
        this.reset(FIELD_TARGETTYPE);
    }

    /**
     * 设置 测试目标类型，详细说明：{@link #FIELD_TARGETTYPE}
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSSysTestCase targettype(String targetType){
        this.setTargetType(targetType);
        return this;
    }

     /**
     * 设置 测试目标类型，详细说明：{@link #FIELD_TARGETTYPE}
     * <P>
     * 等同 {@link #setTargetType}
     * @param targetType
     */
    @JsonIgnore
    public PSSysTestCase targettype(net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseTargetType targetType){
        if(targetType == null){
            this.setTargetType(null);
        }
        else{
            this.setTargetType(targetType.value);
        }
        return this;
    }

    /**
     * <B>TESTCASELEVEL</B>&nbsp;测试用例级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseLevel} 
     */
    public final static String FIELD_TESTCASELEVEL = "testcaselevel";

    /**
     * 设置 测试用例级别
     * 
     * @param testCaseLevel
     * 
     */
    @JsonProperty(FIELD_TESTCASELEVEL)
    public void setTestCaseLevel(String testCaseLevel){
        this.set(FIELD_TESTCASELEVEL, testCaseLevel);
    }
    
    /**
     * 获取 测试用例级别  
     * @return
     */
    @JsonIgnore
    public String getTestCaseLevel(){
        Object objValue = this.get(FIELD_TESTCASELEVEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试用例级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestCaseLevelDirty(){
        if(this.contains(FIELD_TESTCASELEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试用例级别
     */
    @JsonIgnore
    public void resetTestCaseLevel(){
        this.reset(FIELD_TESTCASELEVEL);
    }

    /**
     * 设置 测试用例级别
     * <P>
     * 等同 {@link #setTestCaseLevel}
     * @param testCaseLevel
     */
    @JsonIgnore
    public PSSysTestCase testcaselevel(String testCaseLevel){
        this.setTestCaseLevel(testCaseLevel);
        return this;
    }

     /**
     * 设置 测试用例级别
     * <P>
     * 等同 {@link #setTestCaseLevel}
     * @param testCaseLevel
     */
    @JsonIgnore
    public PSSysTestCase testcaselevel(net.ibizsys.psmodel.core.util.PSModelEnums.TestCaseLevel testCaseLevel){
        if(testCaseLevel == null){
            this.setTestCaseLevel(null);
        }
        else{
            this.setTestCaseLevel(testCaseLevel.value);
        }
        return this;
    }

    /**
     * <B>TESTCASESN</B>&nbsp;测试用例编号，指定测试用例的编号
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_TESTCASESN = "testcasesn";

    /**
     * 设置 测试用例编号，详细说明：{@link #FIELD_TESTCASESN}
     * 
     * @param testCaseSN
     * 
     */
    @JsonProperty(FIELD_TESTCASESN)
    public void setTestCaseSN(String testCaseSN){
        this.set(FIELD_TESTCASESN, testCaseSN);
    }
    
    /**
     * 获取 测试用例编号  
     * @return
     */
    @JsonIgnore
    public String getTestCaseSN(){
        Object objValue = this.get(FIELD_TESTCASESN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试用例编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestCaseSNDirty(){
        if(this.contains(FIELD_TESTCASESN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试用例编号
     */
    @JsonIgnore
    public void resetTestCaseSN(){
        this.reset(FIELD_TESTCASESN);
    }

    /**
     * 设置 测试用例编号，详细说明：{@link #FIELD_TESTCASESN}
     * <P>
     * 等同 {@link #setTestCaseSN}
     * @param testCaseSN
     */
    @JsonIgnore
    public PSSysTestCase testcasesn(String testCaseSN){
        this.setTestCaseSN(testCaseSN);
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
    public PSSysTestCase updatedate(String updateDate){
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
    public PSSysTestCase updateman(String updateMan){
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
    public PSSysTestCase usercat(String userCat){
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
    public PSSysTestCase usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;用例数据，指定测试用例的用例数据
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 用例数据，详细说明：{@link #FIELD_USERDATA}
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 用例数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 用例数据，详细说明：{@link #FIELD_USERDATA}
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSSysTestCase userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;用例数据2，指定测试用例的用例数据2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 用例数据2，详细说明：{@link #FIELD_USERDATA2}
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 用例数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 用例数据2，详细说明：{@link #FIELD_USERDATA2}
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSSysTestCase userdata2(String userData2){
        this.setUserData2(userData2);
        return this;
    }

    /**
     * <B>USERDATA3</B>&nbsp;用例数据3，指定测试用例的用例数据3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERDATA3 = "userdata3";

    /**
     * 设置 用例数据3，详细说明：{@link #FIELD_USERDATA3}
     * 
     * @param userData3
     * 
     */
    @JsonProperty(FIELD_USERDATA3)
    public void setUserData3(String userData3){
        this.set(FIELD_USERDATA3, userData3);
    }
    
    /**
     * 获取 用例数据3  
     * @return
     */
    @JsonIgnore
    public String getUserData3(){
        Object objValue = this.get(FIELD_USERDATA3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例数据3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData3Dirty(){
        if(this.contains(FIELD_USERDATA3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例数据3
     */
    @JsonIgnore
    public void resetUserData3(){
        this.reset(FIELD_USERDATA3);
    }

    /**
     * 设置 用例数据3，详细说明：{@link #FIELD_USERDATA3}
     * <P>
     * 等同 {@link #setUserData3}
     * @param userData3
     */
    @JsonIgnore
    public PSSysTestCase userdata3(String userData3){
        this.setUserData3(userData3);
        return this;
    }

    /**
     * <B>USERDATA4</B>&nbsp;用例数据4，指定测试用例的用例数据4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USERDATA4 = "userdata4";

    /**
     * 设置 用例数据4，详细说明：{@link #FIELD_USERDATA4}
     * 
     * @param userData4
     * 
     */
    @JsonProperty(FIELD_USERDATA4)
    public void setUserData4(String userData4){
        this.set(FIELD_USERDATA4, userData4);
    }
    
    /**
     * 获取 用例数据4  
     * @return
     */
    @JsonIgnore
    public String getUserData4(){
        Object objValue = this.get(FIELD_USERDATA4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例数据4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData4Dirty(){
        if(this.contains(FIELD_USERDATA4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例数据4
     */
    @JsonIgnore
    public void resetUserData4(){
        this.reset(FIELD_USERDATA4);
    }

    /**
     * 设置 用例数据4，详细说明：{@link #FIELD_USERDATA4}
     * <P>
     * 等同 {@link #setUserData4}
     * @param userData4
     */
    @JsonIgnore
    public PSSysTestCase userdata4(String userData4){
        this.setUserData4(userData4);
        return this;
    }

    /**
     * <B>USERFLAG</B>&nbsp;用户建立用例，指定测试用例是否是用户建立（非自动产生），未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERFLAG = "userflag";

    /**
     * 设置 用户建立用例，详细说明：{@link #FIELD_USERFLAG}
     * 
     * @param userFlag
     * 
     */
    @JsonProperty(FIELD_USERFLAG)
    public void setUserFlag(Integer userFlag){
        this.set(FIELD_USERFLAG, userFlag);
    }
    
    /**
     * 获取 用户建立用例  
     * @return
     */
    @JsonIgnore
    public Integer getUserFlag(){
        Object objValue = this.get(FIELD_USERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户建立用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserFlagDirty(){
        if(this.contains(FIELD_USERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户建立用例
     */
    @JsonIgnore
    public void resetUserFlag(){
        this.reset(FIELD_USERFLAG);
    }

    /**
     * 设置 用户建立用例，详细说明：{@link #FIELD_USERFLAG}
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSSysTestCase userflag(Integer userFlag){
        this.setUserFlag(userFlag);
        return this;
    }

     /**
     * 设置 用户建立用例，详细说明：{@link #FIELD_USERFLAG}
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSSysTestCase userflag(Boolean userFlag){
        if(userFlag == null){
            this.setUserFlag(null);
        }
        else{
            this.setUserFlag(userFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysTestCase usertag(String userTag){
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
    public PSSysTestCase usertag2(String userTag2){
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
    public PSSysTestCase usertag3(String userTag3){
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
    public PSSysTestCase usertag4(String userTag4){
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
    public PSSysTestCase validflag(Integer validFlag){
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
    public PSSysTestCase validflag(Boolean validFlag){
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
        return this.getPSSysTestCaseId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTestCaseId(strValue);
    }

    @JsonIgnore
    public PSSysTestCase id(String strValue){
        this.setPSSysTestCaseId(strValue);
        return this;
    }


    /**
     *  系统测试用例输入 成员集合
     */
    public final static String FIELD_PSSYSTCINPUTS = "pssystcinputs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCInput> pssystcinputs;

    /**
     * 获取 系统测试用例输入 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSTCINPUTS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCInput> getPSSysTCInputs(){
        return this.pssystcinputs;
    }

    /**
     * 设置 系统测试用例输入 成员集合  
     * @param pssystcinputs
     */
    @JsonProperty(FIELD_PSSYSTCINPUTS)
    public void setPSSysTCInputs(java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCInput> pssystcinputs){
        this.pssystcinputs = pssystcinputs;
    }

    /**
     * 获取 系统测试用例输入 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCInput> getPSSysTCInputsIf(){
        if(this.pssystcinputs == null){
            this.pssystcinputs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysTCInput>();          
        }
        return this.pssystcinputs;
    }


    /**
     *  系统测试用例断言 成员集合
     */
    public final static String FIELD_PSSYSTCASSERTS = "pssystcasserts";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCAssert> pssystcasserts;

    /**
     * 获取 系统测试用例断言 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSTCASSERTS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCAssert> getPSSysTCAsserts(){
        return this.pssystcasserts;
    }

    /**
     * 设置 系统测试用例断言 成员集合  
     * @param pssystcasserts
     */
    @JsonProperty(FIELD_PSSYSTCASSERTS)
    public void setPSSysTCAsserts(java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCAssert> pssystcasserts){
        this.pssystcasserts = pssystcasserts;
    }

    /**
     * 获取 系统测试用例断言 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysTCAssert> getPSSysTCAssertsIf(){
        if(this.pssystcasserts == null){
            this.pssystcasserts = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysTCAssert>();          
        }
        return this.pssystcasserts;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysTestCase){
            PSSysTestCase model = (PSSysTestCase)iPSModel;
            model.setPSSysTCInputs(this.getPSSysTCInputs());
            model.setPSSysTCAsserts(this.getPSSysTCAsserts());
        }
        super.copyTo(iPSModel);
    }
}
