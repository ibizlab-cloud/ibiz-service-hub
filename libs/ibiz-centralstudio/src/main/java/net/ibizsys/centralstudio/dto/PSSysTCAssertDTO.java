package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSTCASSERT</B>系统测试用例断言 模型传输对象
 * <P>
 * 测试用例断言模型，定义测试用例的预期执行结果
 */
public class PSSysTCAssertDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysTCAssertDTO(){
    }      

    /**
     * <B>ASSERTRESULT</B>&nbsp;预期结果，指定测试用例断言的预期结果数据
     * <P>
     * 字符串：最大长度 4000
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
    public PSSysTCAssertDTO assertresult(String assertResult){
        this.setAssertResult(assertResult);
        return this;
    }

    /**
     * <B>ASSERTTAG</B>&nbsp;断言标记，指定测试用例断言的标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ASSERTTAG = "asserttag";

    /**
     * 设置 断言标记，详细说明：{@link #FIELD_ASSERTTAG}
     * 
     * @param assertTag
     * 
     */
    @JsonProperty(FIELD_ASSERTTAG)
    public void setAssertTag(String assertTag){
        this.set(FIELD_ASSERTTAG, assertTag);
    }
    
    /**
     * 获取 断言标记  
     * @return
     */
    @JsonIgnore
    public String getAssertTag(){
        Object objValue = this.get(FIELD_ASSERTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 断言标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssertTagDirty(){
        if(this.contains(FIELD_ASSERTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 断言标记
     */
    @JsonIgnore
    public void resetAssertTag(){
        this.reset(FIELD_ASSERTTAG);
    }

    /**
     * 设置 断言标记，详细说明：{@link #FIELD_ASSERTTAG}
     * <P>
     * 等同 {@link #setAssertTag}
     * @param assertTag
     */
    @JsonIgnore
    public PSSysTCAssertDTO asserttag(String assertTag){
        this.setAssertTag(assertTag);
        return this;
    }

    /**
     * <B>ASSERTTAG2</B>&nbsp;断言标记2，指定测试用例断言的标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ASSERTTAG2 = "asserttag2";

    /**
     * 设置 断言标记2，详细说明：{@link #FIELD_ASSERTTAG2}
     * 
     * @param assertTag2
     * 
     */
    @JsonProperty(FIELD_ASSERTTAG2)
    public void setAssertTag2(String assertTag2){
        this.set(FIELD_ASSERTTAG2, assertTag2);
    }
    
    /**
     * 获取 断言标记2  
     * @return
     */
    @JsonIgnore
    public String getAssertTag2(){
        Object objValue = this.get(FIELD_ASSERTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 断言标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssertTag2Dirty(){
        if(this.contains(FIELD_ASSERTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 断言标记2
     */
    @JsonIgnore
    public void resetAssertTag2(){
        this.reset(FIELD_ASSERTTAG2);
    }

    /**
     * 设置 断言标记2，详细说明：{@link #FIELD_ASSERTTAG2}
     * <P>
     * 等同 {@link #setAssertTag2}
     * @param assertTag2
     */
    @JsonIgnore
    public PSSysTCAssertDTO asserttag2(String assertTag2){
        this.setAssertTag2(assertTag2);
        return this;
    }

    /**
     * <B>ASSERTTAG3</B>&nbsp;断言标记3，指定测试用例断言的标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ASSERTTAG3 = "asserttag3";

    /**
     * 设置 断言标记3，详细说明：{@link #FIELD_ASSERTTAG3}
     * 
     * @param assertTag3
     * 
     */
    @JsonProperty(FIELD_ASSERTTAG3)
    public void setAssertTag3(String assertTag3){
        this.set(FIELD_ASSERTTAG3, assertTag3);
    }
    
    /**
     * 获取 断言标记3  
     * @return
     */
    @JsonIgnore
    public String getAssertTag3(){
        Object objValue = this.get(FIELD_ASSERTTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 断言标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssertTag3Dirty(){
        if(this.contains(FIELD_ASSERTTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 断言标记3
     */
    @JsonIgnore
    public void resetAssertTag3(){
        this.reset(FIELD_ASSERTTAG3);
    }

    /**
     * 设置 断言标记3，详细说明：{@link #FIELD_ASSERTTAG3}
     * <P>
     * 等同 {@link #setAssertTag3}
     * @param assertTag3
     */
    @JsonIgnore
    public PSSysTCAssertDTO asserttag3(String assertTag3){
        this.setAssertTag3(assertTag3);
        return this;
    }

    /**
     * <B>ASSERTTAG4</B>&nbsp;断言标记4，指定测试用例断言的标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ASSERTTAG4 = "asserttag4";

    /**
     * 设置 断言标记4，详细说明：{@link #FIELD_ASSERTTAG4}
     * 
     * @param assertTag4
     * 
     */
    @JsonProperty(FIELD_ASSERTTAG4)
    public void setAssertTag4(String assertTag4){
        this.set(FIELD_ASSERTTAG4, assertTag4);
    }
    
    /**
     * 获取 断言标记4  
     * @return
     */
    @JsonIgnore
    public String getAssertTag4(){
        Object objValue = this.get(FIELD_ASSERTTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 断言标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAssertTag4Dirty(){
        if(this.contains(FIELD_ASSERTTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 断言标记4
     */
    @JsonIgnore
    public void resetAssertTag4(){
        this.reset(FIELD_ASSERTTAG4);
    }

    /**
     * 设置 断言标记4，详细说明：{@link #FIELD_ASSERTTAG4}
     * <P>
     * 等同 {@link #setAssertTag4}
     * @param assertTag4
     */
    @JsonIgnore
    public PSSysTCAssertDTO asserttag4(String assertTag4){
        this.setAssertTag4(assertTag4);
        return this;
    }

    /**
     * <B>ASSERTTYPE</B>&nbsp;预期类型，指定测试用例断言的预期类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TestCaseAssertType} 
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
    public PSSysTCAssertDTO asserttype(String assertType){
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
    public PSSysTCAssertDTO asserttype(net.ibizsys.model.PSModelEnums.TestCaseAssertType assertType){
        if(assertType == null){
            this.setAssertType(null);
        }
        else{
            this.setAssertType(assertType.value);
        }
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
    public PSSysTCAssertDTO createdate(Timestamp createDate){
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
    public PSSysTCAssertDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;脚本代码，测试用例断言类型为【自定义代码】时指定自定义的代码
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
    public PSSysTCAssertDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>DSTKEYPSDEFID</B>&nbsp;目标数据主键属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
     */
    public final static String FIELD_DSTKEYPSDEFID = "dstkeypsdefid";

    /**
     * 设置 目标数据主键属性
     * 
     * @param dstKeyPSDEFId
     * 
     */
    @JsonProperty(FIELD_DSTKEYPSDEFID)
    public void setDstKeyPSDEFId(String dstKeyPSDEFId){
        this.set(FIELD_DSTKEYPSDEFID, dstKeyPSDEFId);
    }
    
    /**
     * 获取 目标数据主键属性  
     * @return
     */
    @JsonIgnore
    public String getDstKeyPSDEFId(){
        Object objValue = this.get(FIELD_DSTKEYPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据主键属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstKeyPSDEFIdDirty(){
        if(this.contains(FIELD_DSTKEYPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据主键属性
     */
    @JsonIgnore
    public void resetDstKeyPSDEFId(){
        this.reset(FIELD_DSTKEYPSDEFID);
    }

    /**
     * 设置 目标数据主键属性
     * <P>
     * 等同 {@link #setDstKeyPSDEFId}
     * @param dstKeyPSDEFId
     */
    @JsonIgnore
    public PSSysTCAssertDTO dstkeypsdefid(String dstKeyPSDEFId){
        this.setDstKeyPSDEFId(dstKeyPSDEFId);
        return this;
    }

    /**
     * 设置 目标数据主键属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstKeyPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysTCAssertDTO dstkeypsdefid(PSDEFieldDTO pSDEField){
        if(pSDEField == null){
            this.setDstKeyPSDEFId(null);
            this.setDstKeyPSDEFName(null);
        }
        else{
            this.setDstKeyPSDEFId(pSDEField.getPSDEFieldId());
            this.setDstKeyPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DSTKEYPSDEFNAME</B>&nbsp;目标数据主键属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTKEYPSDEFID}
     */
    public final static String FIELD_DSTKEYPSDEFNAME = "dstkeypsdefname";

    /**
     * 设置 目标数据主键属性
     * 
     * @param dstKeyPSDEFName
     * 
     */
    @JsonProperty(FIELD_DSTKEYPSDEFNAME)
    public void setDstKeyPSDEFName(String dstKeyPSDEFName){
        this.set(FIELD_DSTKEYPSDEFNAME, dstKeyPSDEFName);
    }
    
    /**
     * 获取 目标数据主键属性  
     * @return
     */
    @JsonIgnore
    public String getDstKeyPSDEFName(){
        Object objValue = this.get(FIELD_DSTKEYPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据主键属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstKeyPSDEFNameDirty(){
        if(this.contains(FIELD_DSTKEYPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据主键属性
     */
    @JsonIgnore
    public void resetDstKeyPSDEFName(){
        this.reset(FIELD_DSTKEYPSDEFNAME);
    }

    /**
     * 设置 目标数据主键属性
     * <P>
     * 等同 {@link #setDstKeyPSDEFName}
     * @param dstKeyPSDEFName
     */
    @JsonIgnore
    public PSSysTCAssertDTO dstkeypsdefname(String dstKeyPSDEFName){
        this.setDstKeyPSDEFName(dstKeyPSDEFName);
        return this;
    }

    /**
     * <B>DSTPSDEID</B>&nbsp;目标数据实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_DSTPSDEID = "dstpsdeid";

    /**
     * 设置 目标数据实体
     * 
     * @param dstPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEID)
    public void setDstPSDEId(String dstPSDEId){
        this.set(FIELD_DSTPSDEID, dstPSDEId);
    }
    
    /**
     * 获取 目标数据实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEId(){
        Object objValue = this.get(FIELD_DSTPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEIdDirty(){
        if(this.contains(FIELD_DSTPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据实体
     */
    @JsonIgnore
    public void resetDstPSDEId(){
        this.reset(FIELD_DSTPSDEID);
    }

    /**
     * 设置 目标数据实体
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param dstPSDEId
     */
    @JsonIgnore
    public PSSysTCAssertDTO dstpsdeid(String dstPSDEId){
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    /**
     * 设置 目标数据实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysTCAssertDTO dstpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setDstPSDEId(null);
            this.setDstPSDEName(null);
        }
        else{
            this.setDstPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDstPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>DSTPSDENAME</B>&nbsp;目标数据实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEID}
     */
    public final static String FIELD_DSTPSDENAME = "dstpsdename";

    /**
     * 设置 目标数据实体
     * 
     * @param dstPSDEName
     * 
     */
    @JsonProperty(FIELD_DSTPSDENAME)
    public void setDstPSDEName(String dstPSDEName){
        this.set(FIELD_DSTPSDENAME, dstPSDEName);
    }
    
    /**
     * 获取 目标数据实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEName(){
        Object objValue = this.get(FIELD_DSTPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDENameDirty(){
        if(this.contains(FIELD_DSTPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据实体
     */
    @JsonIgnore
    public void resetDstPSDEName(){
        this.reset(FIELD_DSTPSDENAME);
    }

    /**
     * 设置 目标数据实体
     * <P>
     * 等同 {@link #setDstPSDEName}
     * @param dstPSDEName
     */
    @JsonIgnore
    public PSSysTCAssertDTO dstpsdename(String dstPSDEName){
        this.setDstPSDEName(dstPSDEName);
        return this;
    }

    /**
     * <B>EXCEPTIONDATA</B>&nbsp;异常参数，测试用例断言预期类型为【预期异常】指定预期的异常参数
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
    public PSSysTCAssertDTO exceptiondata(String exceptionData){
        this.setExceptionData(exceptionData);
        return this;
    }

    /**
     * <B>EXCEPTIONDATA2</B>&nbsp;异常参数2，测试用例断言预期类型为【预期异常】指定预期的异常参数2
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
    public PSSysTCAssertDTO exceptiondata2(String exceptionData2){
        this.setExceptionData2(exceptionData2);
        return this;
    }

    /**
     * <B>EXCEPTIONNAME</B>&nbsp;异常名称，测试用例断言预期类型为【预期异常】指定预期的异常名称
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
    public PSSysTCAssertDTO exceptionname(String exceptionName){
        this.setExceptionName(exceptionName);
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
    public PSSysTCAssertDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;执行次序，指定测试用例断言的执行次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 执行次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 执行次序  
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
     * 判断 执行次序 是否指定值，包括空值
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
     * 重置 执行次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 执行次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysTCAssertDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
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
    public PSSysTCAssertDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSTCASSERTID</B>&nbsp;系统测试用例断言标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSTCASSERTID = "pssystcassertid";

    /**
     * 设置 系统测试用例断言标识
     * 
     * @param pSSysTCAssertId
     * 
     */
    @JsonProperty(FIELD_PSSYSTCASSERTID)
    public void setPSSysTCAssertId(String pSSysTCAssertId){
        this.set(FIELD_PSSYSTCASSERTID, pSSysTCAssertId);
    }
    
    /**
     * 获取 系统测试用例断言标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTCAssertId(){
        Object objValue = this.get(FIELD_PSSYSTCASSERTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统测试用例断言标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTCAssertIdDirty(){
        if(this.contains(FIELD_PSSYSTCASSERTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统测试用例断言标识
     */
    @JsonIgnore
    public void resetPSSysTCAssertId(){
        this.reset(FIELD_PSSYSTCASSERTID);
    }

    /**
     * 设置 系统测试用例断言标识
     * <P>
     * 等同 {@link #setPSSysTCAssertId}
     * @param pSSysTCAssertId
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystcassertid(String pSSysTCAssertId){
        this.setPSSysTCAssertId(pSSysTCAssertId);
        return this;
    }

    /**
     * <B>PSSYSTCASSERTNAME</B>&nbsp;断言标识，指定测试用例断言的标识，需在所属测试用例中具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSTCASSERTNAME = "pssystcassertname";

    /**
     * 设置 断言标识，详细说明：{@link #FIELD_PSSYSTCASSERTNAME}
     * 
     * @param pSSysTCAssertName
     * 
     */
    @JsonProperty(FIELD_PSSYSTCASSERTNAME)
    public void setPSSysTCAssertName(String pSSysTCAssertName){
        this.set(FIELD_PSSYSTCASSERTNAME, pSSysTCAssertName);
    }
    
    /**
     * 获取 断言标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysTCAssertName(){
        Object objValue = this.get(FIELD_PSSYSTCASSERTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 断言标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTCAssertNameDirty(){
        if(this.contains(FIELD_PSSYSTCASSERTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 断言标识
     */
    @JsonIgnore
    public void resetPSSysTCAssertName(){
        this.reset(FIELD_PSSYSTCASSERTNAME);
    }

    /**
     * 设置 断言标识，详细说明：{@link #FIELD_PSSYSTCASSERTNAME}
     * <P>
     * 等同 {@link #setPSSysTCAssertName}
     * @param pSSysTCAssertName
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystcassertname(String pSSysTCAssertName){
        this.setPSSysTCAssertName(pSSysTCAssertName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysTCAssertName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysTCAssertName(strName);
    }

    @JsonIgnore
    public PSSysTCAssertDTO name(String strName){
        this.setPSSysTCAssertName(strName);
        return this;
    }

    /**
     * <B>PSSYSTCINPUTID</B>&nbsp;系统测试用例输入，指定测试用例断言相关的测试用例输入
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTCInputDTO} 
     */
    public final static String FIELD_PSSYSTCINPUTID = "pssystcinputid";

    /**
     * 设置 系统测试用例输入，详细说明：{@link #FIELD_PSSYSTCINPUTID}
     * 
     * @param pSSysTCInputId
     * 
     */
    @JsonProperty(FIELD_PSSYSTCINPUTID)
    public void setPSSysTCInputId(String pSSysTCInputId){
        this.set(FIELD_PSSYSTCINPUTID, pSSysTCInputId);
    }
    
    /**
     * 获取 系统测试用例输入  
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
     * 判断 系统测试用例输入 是否指定值，包括空值
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
     * 重置 系统测试用例输入
     */
    @JsonIgnore
    public void resetPSSysTCInputId(){
        this.reset(FIELD_PSSYSTCINPUTID);
    }

    /**
     * 设置 系统测试用例输入，详细说明：{@link #FIELD_PSSYSTCINPUTID}
     * <P>
     * 等同 {@link #setPSSysTCInputId}
     * @param pSSysTCInputId
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystcinputid(String pSSysTCInputId){
        this.setPSSysTCInputId(pSSysTCInputId);
        return this;
    }

    /**
     * 设置 系统测试用例输入，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTCInputId}
     * @param pSSysTCInput 引用对象
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystcinputid(PSSysTCInputDTO pSSysTCInput){
        if(pSSysTCInput == null){
            this.setPSSysTCInputId(null);
            this.setPSSysTCInputName(null);
        }
        else{
            this.setPSSysTCInputId(pSSysTCInput.getPSSysTCInputId());
            this.setPSSysTCInputName(pSSysTCInput.getPSSysTCInputName());
        }
        return this;
    }

    /**
     * <B>PSSYSTCINPUTNAME</B>&nbsp;测试用例输入，指定测试用例断言相关的测试用例输入
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTCINPUTID}
     */
    public final static String FIELD_PSSYSTCINPUTNAME = "pssystcinputname";

    /**
     * 设置 测试用例输入，详细说明：{@link #FIELD_PSSYSTCINPUTNAME}
     * 
     * @param pSSysTCInputName
     * 
     */
    @JsonProperty(FIELD_PSSYSTCINPUTNAME)
    public void setPSSysTCInputName(String pSSysTCInputName){
        this.set(FIELD_PSSYSTCINPUTNAME, pSSysTCInputName);
    }
    
    /**
     * 获取 测试用例输入  
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
     * 判断 测试用例输入 是否指定值，包括空值
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
     * 重置 测试用例输入
     */
    @JsonIgnore
    public void resetPSSysTCInputName(){
        this.reset(FIELD_PSSYSTCINPUTNAME);
    }

    /**
     * 设置 测试用例输入，详细说明：{@link #FIELD_PSSYSTCINPUTNAME}
     * <P>
     * 等同 {@link #setPSSysTCInputName}
     * @param pSSysTCInputName
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystcinputname(String pSSysTCInputName){
        this.setPSSysTCInputName(pSSysTCInputName);
        return this;
    }

    /**
     * <B>PSSYSTESTCASEID</B>&nbsp;系统测试用例，指定测试用例断言所属的测试用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO} 
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
    public PSSysTCAssertDTO pssystestcaseid(String pSSysTestCaseId){
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
    public PSSysTCAssertDTO pssystestcaseid(PSSysTestCaseDTO pSSysTestCase){
        if(pSSysTestCase == null){
            this.setPSDEId(null);
            this.setPSSysTestCaseId(null);
            this.setPSSysTestCaseName(null);
            this.setTargetType(null);
        }
        else{
            this.setPSDEId(pSSysTestCase.getPSDEId());
            this.setPSSysTestCaseId(pSSysTestCase.getPSSysTestCaseId());
            this.setPSSysTestCaseName(pSSysTestCase.getPSSysTestCaseName());
            this.setTargetType(pSSysTestCase.getTargetType());
        }
        return this;
    }

    /**
     * <B>PSSYSTESTCASENAME</B>&nbsp;系统测试用例，指定测试用例断言所属的测试用例
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
    public PSSysTCAssertDTO pssystestcasename(String pSSysTestCaseName){
        this.setPSSysTestCaseName(pSSysTestCaseName);
        return this;
    }

    /**
     * <B>PSSYSTESTDATAID</B>&nbsp;预期结果对象，指定测试用例断言的预期结果数据对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO} 
     */
    public final static String FIELD_PSSYSTESTDATAID = "pssystestdataid";

    /**
     * 设置 预期结果对象，详细说明：{@link #FIELD_PSSYSTESTDATAID}
     * 
     * @param pSSysTestDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATAID)
    public void setPSSysTestDataId(String pSSysTestDataId){
        this.set(FIELD_PSSYSTESTDATAID, pSSysTestDataId);
    }
    
    /**
     * 获取 预期结果对象  
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
     * 判断 预期结果对象 是否指定值，包括空值
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
     * 重置 预期结果对象
     */
    @JsonIgnore
    public void resetPSSysTestDataId(){
        this.reset(FIELD_PSSYSTESTDATAID);
    }

    /**
     * 设置 预期结果对象，详细说明：{@link #FIELD_PSSYSTESTDATAID}
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestDataId
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystestdataid(String pSSysTestDataId){
        this.setPSSysTestDataId(pSSysTestDataId);
        return this;
    }

    /**
     * 设置 预期结果对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTestDataId}
     * @param pSSysTestData 引用对象
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystestdataid(PSSysTestDataDTO pSSysTestData){
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
     * <B>PSSYSTESTDATANAME</B>&nbsp;预期结果对象，指定测试用例断言的预期结果数据对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTESTDATAID}
     */
    public final static String FIELD_PSSYSTESTDATANAME = "pssystestdataname";

    /**
     * 设置 预期结果对象，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * 
     * @param pSSysTestDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSTESTDATANAME)
    public void setPSSysTestDataName(String pSSysTestDataName){
        this.set(FIELD_PSSYSTESTDATANAME, pSSysTestDataName);
    }
    
    /**
     * 获取 预期结果对象  
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
     * 判断 预期结果对象 是否指定值，包括空值
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
     * 重置 预期结果对象
     */
    @JsonIgnore
    public void resetPSSysTestDataName(){
        this.reset(FIELD_PSSYSTESTDATANAME);
    }

    /**
     * 设置 预期结果对象，详细说明：{@link #FIELD_PSSYSTESTDATANAME}
     * <P>
     * 等同 {@link #setPSSysTestDataName}
     * @param pSSysTestDataName
     */
    @JsonIgnore
    public PSSysTCAssertDTO pssystestdataname(String pSSysTestDataName){
        this.setPSSysTestDataName(pSSysTestDataName);
        return this;
    }

    /**
     * <B>TARGETTYPE</B>&nbsp;用例目标
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TestCaseTargetType} 
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
    public PSSysTCAssertDTO targettype(String targetType){
        this.setTargetType(targetType);
        return this;
    }

    /**
     * <B>TESTDATASN</B>&nbsp;随机测试数据索引
     */
    public final static String FIELD_TESTDATASN = "testdatasn";

    /**
     * 设置 随机测试数据索引
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
     * 设置 随机测试数据索引
     * <P>
     * 等同 {@link #setTestDataSN}
     * @param testDataSN
     */
    @JsonIgnore
    public PSSysTCAssertDTO testdatasn(Integer testDataSN){
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
    public PSSysTCAssertDTO updatedate(Timestamp updateDate){
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
    public PSSysTCAssertDTO updateman(String updateMan){
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
    public PSSysTCAssertDTO usercat(String userCat){
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
    public PSSysTCAssertDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysTCAssertDTO usertag(String userTag){
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
    public PSSysTCAssertDTO usertag2(String userTag2){
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
    public PSSysTCAssertDTO usertag3(String userTag3){
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
    public PSSysTCAssertDTO usertag4(String userTag4){
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
    public PSSysTCAssertDTO validflag(Integer validFlag){
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
    public PSSysTCAssertDTO validflag(Boolean validFlag){
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
        return this.getPSSysTCAssertId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysTCAssertId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysTCAssertId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysTCAssertId(strValue);
    }

    @JsonIgnore
    public PSSysTCAssertDTO id(String strValue){
        this.setPSSysTCAssertId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysTCAssertDTO){
            PSSysTCAssertDTO dto = (PSSysTCAssertDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
