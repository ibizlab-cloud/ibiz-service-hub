package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFGROUPDETAIL</B>实体属性组成员 模型传输对象
 * <P>
 * 实体属性组成员模型，定义属性组包含的属性对象，属性组成员提供属性基础属性的重新定义能力，支持对属性进行配置调整
 */
public class PSDEFGroupDetailDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEFGroupDetailDTO(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许为空，指定属性组成员是否允许空输入，未定义时使用实体属性配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSDEFGroupDetailDTO allowempty(Integer allowEmpty){
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
    public PSDEFGroupDetailDTO allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定属性组成员的代码标识，需在所在的属性组具备唯一性。未定义时使用实体属性配置
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
    public PSDEFGroupDetailDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定属性组成员的代码标识2，需在所在的属性组具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEFGroupDetailDTO codename2(String codeName2){
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
    public PSDEFGroupDetailDTO createdate(Timestamp createDate){
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
    public PSDEFGroupDetailDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值
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
     * 设置 默认值
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DETAILPARAM</B>&nbsp;成员参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILPARAM = "detailparam";

    /**
     * 设置 成员参数
     * 
     * @param detailParam
     * 
     */
    @JsonProperty(FIELD_DETAILPARAM)
    public void setDetailParam(String detailParam){
        this.set(FIELD_DETAILPARAM, detailParam);
    }
    
    /**
     * 获取 成员参数  
     * @return
     */
    @JsonIgnore
    public String getDetailParam(){
        Object objValue = this.get(FIELD_DETAILPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailParamDirty(){
        if(this.contains(FIELD_DETAILPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数
     */
    @JsonIgnore
    public void resetDetailParam(){
        this.reset(FIELD_DETAILPARAM);
    }

    /**
     * 设置 成员参数
     * <P>
     * 等同 {@link #setDetailParam}
     * @param detailParam
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO detailparam(String detailParam){
        this.setDetailParam(detailParam);
        return this;
    }

    /**
     * <B>DETAILPARAM2</B>&nbsp;成员参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILPARAM2 = "detailparam2";

    /**
     * 设置 成员参数2
     * 
     * @param detailParam2
     * 
     */
    @JsonProperty(FIELD_DETAILPARAM2)
    public void setDetailParam2(String detailParam2){
        this.set(FIELD_DETAILPARAM2, detailParam2);
    }
    
    /**
     * 获取 成员参数2  
     * @return
     */
    @JsonIgnore
    public String getDetailParam2(){
        Object objValue = this.get(FIELD_DETAILPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailParam2Dirty(){
        if(this.contains(FIELD_DETAILPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数2
     */
    @JsonIgnore
    public void resetDetailParam2(){
        this.reset(FIELD_DETAILPARAM2);
    }

    /**
     * 设置 成员参数2
     * <P>
     * 等同 {@link #setDetailParam2}
     * @param detailParam2
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO detailparam2(String detailParam2){
        this.setDetailParam2(detailParam2);
        return this;
    }

    /**
     * <B>DEFAULTVALUETYPE</B>&nbsp;默认值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEFDefaultValueType} 
     */
    public final static String FIELD_DEFAULTVALUETYPE = "defaultvaluetype";

    /**
     * 设置 默认值类型
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
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO defaultvaluetype(String defaultValueType){
        this.setDefaultValueType(defaultValueType);
        return this;
    }

     /**
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO defaultvaluetype(net.ibizsys.model.PSModelEnums.DEFDefaultValueType defaultValueType){
        if(defaultValueType == null){
            this.setDefaultValueType(null);
        }
        else{
            this.setDefaultValueType(defaultValueType.value);
        }
        return this;
    }

    /**
     * <B>ENABLEUSERINPUT</B>&nbsp;允许用户输入，启用修改用户输入时，指定属性组成员的用户输入模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UserInputMode} 
     */
    public final static String FIELD_ENABLEUSERINPUT = "enableuserinput";

    /**
     * 设置 允许用户输入，详细说明：{@link #FIELD_ENABLEUSERINPUT}
     * 
     * @param enableUserInput
     * 
     */
    @JsonProperty(FIELD_ENABLEUSERINPUT)
    public void setEnableUserInput(Integer enableUserInput){
        this.set(FIELD_ENABLEUSERINPUT, enableUserInput);
    }
    
    /**
     * 获取 允许用户输入  
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
     * 判断 允许用户输入 是否指定值，包括空值
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
     * 重置 允许用户输入
     */
    @JsonIgnore
    public void resetEnableUserInput(){
        this.reset(FIELD_ENABLEUSERINPUT);
    }

    /**
     * 设置 允许用户输入，详细说明：{@link #FIELD_ENABLEUSERINPUT}
     * <P>
     * 等同 {@link #setEnableUserInput}
     * @param enableUserInput
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO enableuserinput(Integer enableUserInput){
        this.setEnableUserInput(enableUserInput);
        return this;
    }

     /**
     * 设置 允许用户输入，详细说明：{@link #FIELD_ENABLEUSERINPUT}
     * <P>
     * 等同 {@link #setEnableUserInput}
     * @param enableUserInput
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO enableuserinput(net.ibizsys.model.PSModelEnums.UserInputMode[] enableUserInput){
        if(enableUserInput == null || enableUserInput.length == 0){
            this.setEnableUserInput(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.UserInputMode _item : enableUserInput){
                _value |= _item.value;
            }
            this.setEnableUserInput(_value);
        }
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
    public PSDEFGroupDetailDTO jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;逻辑名称语言资源，指定属性组属性成员的逻辑名称多语言资源，未定义时使用属性定义的逻辑名称多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * 
     * @param lNPSLanResId
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESID)
    public void setLNPSLanResId(String lNPSLanResId){
        this.set(FIELD_LNPSLANRESID, lNPSLanResId);
    }
    
    /**
     * 获取 逻辑名称语言资源  
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
     * 判断 逻辑名称语言资源 是否指定值，包括空值
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
     * 重置 逻辑名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResId(){
        this.reset(FIELD_LNPSLANRESID);
    }

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO lnpslanresid(String lNPSLanResId){
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    /**
     * 设置 逻辑名称语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO lnpslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>LNPSLANRESNAME</B>&nbsp;逻辑名称语言资源，指定属性组属性成员的逻辑名称多语言资源，未定义时使用属性定义的逻辑名称多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * 
     * @param lNPSLanResName
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESNAME)
    public void setLNPSLanResName(String lNPSLanResName){
        this.set(FIELD_LNPSLANRESNAME, lNPSLanResName);
    }
    
    /**
     * 获取 逻辑名称语言资源  
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
     * 判断 逻辑名称语言资源 是否指定值，包括空值
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
     * 重置 逻辑名称语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResName(){
        this.reset(FIELD_LNPSLANRESNAME);
    }

    /**
     * 设置 逻辑名称语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>MAXVALUE</B>&nbsp;最大值，指定属性组属性成员的最大值，未定义时使用属性定义的最大值
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
    public PSDEFGroupDetailDTO maxvalue(String maxValue){
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
    public PSDEFGroupDetailDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINSTRLENGTH</B>&nbsp;最小字符长度，指定属性组属性成员的最小字符串长度，未定义时使用属性定义的最小字符串长度
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
    public PSDEFGroupDetailDTO minstrlength(Integer minStrLength){
        this.setMinStrLength(minStrLength);
        return this;
    }

    /**
     * <B>MINVALUE</B>&nbsp;最小值，指定属性组属性成员的最小值，未定义时使用属性定义的最小值
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
    public PSDEFGroupDetailDTO minvalue(String minValue){
        this.setMinValue(minValue);
        return this;
    }

    /**
     * <B>MODIFYUSERINPUT</B>&nbsp;定义用户输入，指定是否修改用户输入模式定义，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MODIFYUSERINPUT = "modifyuserinput";

    /**
     * 设置 定义用户输入，详细说明：{@link #FIELD_MODIFYUSERINPUT}
     * 
     * @param modifyUserInput
     * 
     */
    @JsonProperty(FIELD_MODIFYUSERINPUT)
    public void setModifyUserInput(Integer modifyUserInput){
        this.set(FIELD_MODIFYUSERINPUT, modifyUserInput);
    }
    
    /**
     * 获取 定义用户输入  
     * @return
     */
    @JsonIgnore
    public Integer getModifyUserInput(){
        Object objValue = this.get(FIELD_MODIFYUSERINPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 定义用户输入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModifyUserInputDirty(){
        if(this.contains(FIELD_MODIFYUSERINPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 定义用户输入
     */
    @JsonIgnore
    public void resetModifyUserInput(){
        this.reset(FIELD_MODIFYUSERINPUT);
    }

    /**
     * 设置 定义用户输入，详细说明：{@link #FIELD_MODIFYUSERINPUT}
     * <P>
     * 等同 {@link #setModifyUserInput}
     * @param modifyUserInput
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO modifyuserinput(Integer modifyUserInput){
        this.setModifyUserInput(modifyUserInput);
        return this;
    }

     /**
     * 设置 定义用户输入，详细说明：{@link #FIELD_MODIFYUSERINPUT}
     * <P>
     * 等同 {@link #setModifyUserInput}
     * @param modifyUserInput
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO modifyuserinput(Boolean modifyUserInput){
        if(modifyUserInput == null){
            this.setModifyUserInput(null);
        }
        else{
            this.setModifyUserInput(modifyUserInput?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEFGroupDetailDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度，指定属性组属性成员的浮点精度，未定义时使用属性定义的浮点精度
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
    public PSDEFGroupDetailDTO precision(Integer precision){
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
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定属性组成员的代码表对象，未定义时使用实体属性配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
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
    public PSDEFGroupDetailDTO pscodelistid(String pSCodeListId){
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
    public PSDEFGroupDetailDTO pscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定属性组成员的代码表对象，未定义时使用实体属性配置
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
    public PSDEFGroupDetailDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFGROUPDETAILID</B>&nbsp;实体属性组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFGROUPDETAILID = "psdefgroupdetailid";

    /**
     * 设置 实体属性组成员标识
     * 
     * @param pSDEFGroupDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEFGROUPDETAILID)
    public void setPSDEFGroupDetailId(String pSDEFGroupDetailId){
        this.set(FIELD_PSDEFGROUPDETAILID, pSDEFGroupDetailId);
    }
    
    /**
     * 获取 实体属性组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFGroupDetailId(){
        Object objValue = this.get(FIELD_PSDEFGROUPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFGroupDetailIdDirty(){
        if(this.contains(FIELD_PSDEFGROUPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性组成员标识
     */
    @JsonIgnore
    public void resetPSDEFGroupDetailId(){
        this.reset(FIELD_PSDEFGROUPDETAILID);
    }

    /**
     * 设置 实体属性组成员标识
     * <P>
     * 等同 {@link #setPSDEFGroupDetailId}
     * @param pSDEFGroupDetailId
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupdetailid(String pSDEFGroupDetailId){
        this.setPSDEFGroupDetailId(pSDEFGroupDetailId);
        return this;
    }

    /**
     * <B>PSDEFGROUPDETAILNAME</B>&nbsp;成员名称，指定属性组成员的名称，需在所在的属性组具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFGROUPDETAILNAME = "psdefgroupdetailname";

    /**
     * 设置 成员名称，详细说明：{@link #FIELD_PSDEFGROUPDETAILNAME}
     * 
     * @param pSDEFGroupDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEFGROUPDETAILNAME)
    public void setPSDEFGroupDetailName(String pSDEFGroupDetailName){
        this.set(FIELD_PSDEFGROUPDETAILNAME, pSDEFGroupDetailName);
    }
    
    /**
     * 获取 成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFGroupDetailName(){
        Object objValue = this.get(FIELD_PSDEFGROUPDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFGroupDetailNameDirty(){
        if(this.contains(FIELD_PSDEFGROUPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员名称
     */
    @JsonIgnore
    public void resetPSDEFGroupDetailName(){
        this.reset(FIELD_PSDEFGROUPDETAILNAME);
    }

    /**
     * 设置 成员名称，详细说明：{@link #FIELD_PSDEFGROUPDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEFGroupDetailName}
     * @param pSDEFGroupDetailName
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupdetailname(String pSDEFGroupDetailName){
        this.setPSDEFGroupDetailName(pSDEFGroupDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFGroupDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFGroupDetailName(strName);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO name(String strName){
        this.setPSDEFGroupDetailName(strName);
        return this;
    }

    /**
     * <B>PSDEFGROUPID</B>&nbsp;实体属性组，指定属性组成员所在的实体属性组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_PSDEFGROUPID = "psdefgroupid";

    /**
     * 设置 实体属性组，详细说明：{@link #FIELD_PSDEFGROUPID}
     * 
     * @param pSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEFGROUPID)
    public void setPSDEFGroupId(String pSDEFGroupId){
        this.set(FIELD_PSDEFGROUPID, pSDEFGroupId);
    }
    
    /**
     * 获取 实体属性组  
     * @return
     */
    @JsonIgnore
    public String getPSDEFGroupId(){
        Object objValue = this.get(FIELD_PSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFGroupIdDirty(){
        if(this.contains(FIELD_PSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性组
     */
    @JsonIgnore
    public void resetPSDEFGroupId(){
        this.reset(FIELD_PSDEFGROUPID);
    }

    /**
     * 设置 实体属性组，详细说明：{@link #FIELD_PSDEFGROUPID}
     * <P>
     * 等同 {@link #setPSDEFGroupId}
     * @param pSDEFGroupId
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupid(String pSDEFGroupId){
        this.setPSDEFGroupId(pSDEFGroupId);
        return this;
    }

    /**
     * 设置 实体属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setPSDEFGroupId(null);
            this.setPSDEFGroupName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
            this.setPSDEId(pSDEFGroup.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEFGROUPNAME</B>&nbsp;实体属性组，指定属性组成员所在的实体属性组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFGROUPID}
     */
    public final static String FIELD_PSDEFGROUPNAME = "psdefgroupname";

    /**
     * 设置 实体属性组，详细说明：{@link #FIELD_PSDEFGROUPNAME}
     * 
     * @param pSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEFGROUPNAME)
    public void setPSDEFGroupName(String pSDEFGroupName){
        this.set(FIELD_PSDEFGROUPNAME, pSDEFGroupName);
    }
    
    /**
     * 获取 实体属性组  
     * @return
     */
    @JsonIgnore
    public String getPSDEFGroupName(){
        Object objValue = this.get(FIELD_PSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFGroupNameDirty(){
        if(this.contains(FIELD_PSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性组
     */
    @JsonIgnore
    public void resetPSDEFGroupName(){
        this.reset(FIELD_PSDEFGROUPNAME);
    }

    /**
     * 设置 实体属性组，详细说明：{@link #FIELD_PSDEFGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEFGroupName}
     * @param pSDEFGroupName
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO psdefgroupname(String pSDEFGroupName){
        this.setPSDEFGroupName(pSDEFGroupName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定属性组成员引用的属性对象，来自属性组所在实体。需在所在的属性组具备唯一性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSDEFGroupDetailDTO psdefid(String pSDEFId){
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
    public PSDEFGroupDetailDTO psdefid(PSDEFieldDTO pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定属性组成员引用的属性对象，来自属性组所在实体。需在所在的属性组具备唯一性
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
    public PSDEFGroupDetailDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFGROUPID}
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
    public PSDEFGroupDetailDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;值规则，指定属性组成员的基本系统值规则，未定义时使用实体属性配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO} 
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
    public PSDEFGroupDetailDTO pssysvalueruleid(String pSSysValueRuleId){
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
    public PSDEFGroupDetailDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule){
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
     * <B>PSSYSVALUERULENAME</B>&nbsp;值规则，指定属性组成员的基本系统值规则，未定义时使用实体属性配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
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
     * 设置 值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>SEARCHMODES</B>&nbsp;支持搜索模式
     */
    public final static String FIELD_SEARCHMODES = "searchmodes";

    /**
     * 设置 支持搜索模式
     * 
     * @param searchModes
     * 
     */
    @JsonProperty(FIELD_SEARCHMODES)
    public void setSearchModes(String searchModes){
        this.set(FIELD_SEARCHMODES, searchModes);
    }
    
    /**
     * 获取 支持搜索模式  
     * @return
     */
    @JsonIgnore
    public String getSearchModes(){
        Object objValue = this.get(FIELD_SEARCHMODES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 支持搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchModesDirty(){
        if(this.contains(FIELD_SEARCHMODES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持搜索模式
     */
    @JsonIgnore
    public void resetSearchModes(){
        this.reset(FIELD_SEARCHMODES);
    }

    /**
     * 设置 支持搜索模式
     * <P>
     * 等同 {@link #setSearchModes}
     * @param searchModes
     */
    @JsonIgnore
    public PSDEFGroupDetailDTO searchmodes(String searchModes){
        this.setSearchModes(searchModes);
        return this;
    }

    /**
     * <B>STRLENGTH</B>&nbsp;字符长度，指定属性组成员的字符串长度，未定义时使用实体属性配置
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
    public PSDEFGroupDetailDTO strlength(Integer strLength){
        this.setStrLength(strLength);
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
    public PSDEFGroupDetailDTO updatedate(Timestamp updateDate){
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
    public PSDEFGroupDetailDTO updateman(String updateMan){
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
    public PSDEFGroupDetailDTO usercat(String userCat){
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
    public PSDEFGroupDetailDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 200
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
    public PSDEFGroupDetailDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 200
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
    public PSDEFGroupDetailDTO usertag2(String userTag2){
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
    public PSDEFGroupDetailDTO usertag3(String userTag3){
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
    public PSDEFGroupDetailDTO usertag4(String userTag4){
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
    public PSDEFGroupDetailDTO validflag(Integer validFlag){
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
    public PSDEFGroupDetailDTO validflag(Boolean validFlag){
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
        return this.getPSDEFGroupDetailId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEFGroupDetailId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFGroupDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFGroupDetailId(strValue);
    }

    @JsonIgnore
    public PSDEFGroupDetailDTO id(String strValue){
        this.setPSDEFGroupDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEFGroupDetailDTO){
            PSDEFGroupDetailDTO dto = (PSDEFGroupDetailDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
