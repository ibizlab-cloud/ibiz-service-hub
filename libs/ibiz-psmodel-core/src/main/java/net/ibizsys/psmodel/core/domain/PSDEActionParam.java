package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEACTIONPARAM</B>实体行为参数 模型传输对象
 * <P>
 * 实体行为参数模型，定义行为的调用参数以及参数的取值等逻辑
 */
public class PSDEActionParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEActionParam(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许为空，参数类型为【输入值】时指定参数是否允许为空，未定义时为【是】
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
    public PSDEActionParam allowempty(Integer allowEmpty){
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
    public PSDEActionParam allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组，指定行为参数是否为数组，为定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ARRAYFLAG = "arrayflag";

    /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
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
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSDEActionParam arrayflag(Integer arrayFlag){
        this.setArrayFlag(arrayFlag);
        return this;
    }

     /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSDEActionParam arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEActionParam codename(String codeName){
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
    public PSDEActionParam createdate(String createDate){
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
    public PSDEActionParam createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDEActionParam jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
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
    public PSDEActionParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定行为参数的次序
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
    public PSDEActionParam ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMDESC</B>&nbsp;参数说明，指定行为参数描述信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAMDESC = "paramdesc";

    /**
     * 设置 参数说明，详细说明：{@link #FIELD_PARAMDESC}
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
     * 设置 参数说明，详细说明：{@link #FIELD_PARAMDESC}
     * <P>
     * 等同 {@link #setParamDesc}
     * @param paramDesc
     */
    @JsonIgnore
    public PSDEActionParam paramdesc(String paramDesc){
        this.setParamDesc(paramDesc);
        return this;
    }

    /**
     * <B>PARAMTAG</B>&nbsp;参数标记，指定行为参数标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMTAG = "paramtag";

    /**
     * 设置 参数标记，详细说明：{@link #FIELD_PARAMTAG}
     * 
     * @param paramTag
     * 
     */
    @JsonProperty(FIELD_PARAMTAG)
    public void setParamTag(String paramTag){
        this.set(FIELD_PARAMTAG, paramTag);
    }
    
    /**
     * 获取 参数标记  
     * @return
     */
    @JsonIgnore
    public String getParamTag(){
        Object objValue = this.get(FIELD_PARAMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTagDirty(){
        if(this.contains(FIELD_PARAMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标记
     */
    @JsonIgnore
    public void resetParamTag(){
        this.reset(FIELD_PARAMTAG);
    }

    /**
     * 设置 参数标记，详细说明：{@link #FIELD_PARAMTAG}
     * <P>
     * 等同 {@link #setParamTag}
     * @param paramTag
     */
    @JsonIgnore
    public PSDEActionParam paramtag(String paramTag){
        this.setParamTag(paramTag);
        return this;
    }

    /**
     * <B>PARAMTAG2</B>&nbsp;参数标记2，指定行为参数标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMTAG2 = "paramtag2";

    /**
     * 设置 参数标记2，详细说明：{@link #FIELD_PARAMTAG2}
     * 
     * @param paramTag2
     * 
     */
    @JsonProperty(FIELD_PARAMTAG2)
    public void setParamTag2(String paramTag2){
        this.set(FIELD_PARAMTAG2, paramTag2);
    }
    
    /**
     * 获取 参数标记2  
     * @return
     */
    @JsonIgnore
    public String getParamTag2(){
        Object objValue = this.get(FIELD_PARAMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTag2Dirty(){
        if(this.contains(FIELD_PARAMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标记2
     */
    @JsonIgnore
    public void resetParamTag2(){
        this.reset(FIELD_PARAMTAG2);
    }

    /**
     * 设置 参数标记2，详细说明：{@link #FIELD_PARAMTAG2}
     * <P>
     * 等同 {@link #setParamTag2}
     * @param paramTag2
     */
    @JsonIgnore
    public PSDEActionParam paramtag2(String paramTag2){
        this.setParamTag2(paramTag2);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定行为参数所在的实体行为对象
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
    public PSDEActionParam psdeactionid(String pSDEActionId){
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
    public PSDEActionParam psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
            this.setPSDEId(pSDEAction.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定行为参数所在的实体行为对象
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
    public PSDEActionParam psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEACTIONPARAMID</B>&nbsp;实体行为参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEACTIONPARAMID = "psdeactionparamid";

    /**
     * 设置 实体行为参数标识
     * 
     * @param pSDEActionParamId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONPARAMID)
    public void setPSDEActionParamId(String pSDEActionParamId){
        this.set(FIELD_PSDEACTIONPARAMID, pSDEActionParamId);
    }
    
    /**
     * 获取 实体行为参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionParamId(){
        Object objValue = this.get(FIELD_PSDEACTIONPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionParamIdDirty(){
        if(this.contains(FIELD_PSDEACTIONPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为参数标识
     */
    @JsonIgnore
    public void resetPSDEActionParamId(){
        this.reset(FIELD_PSDEACTIONPARAMID);
    }

    /**
     * 设置 实体行为参数标识
     * <P>
     * 等同 {@link #setPSDEActionParamId}
     * @param pSDEActionParamId
     */
    @JsonIgnore
    public PSDEActionParam psdeactionparamid(String pSDEActionParamId){
        this.setPSDEActionParamId(pSDEActionParamId);
        return this;
    }

    /**
     * <B>PSDEACTIONPARAMNAME</B>&nbsp;参数标识，指定行为参数的名称，需在所在实体行为中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEACTIONPARAMNAME = "psdeactionparamname";

    /**
     * 设置 参数标识，详细说明：{@link #FIELD_PSDEACTIONPARAMNAME}
     * 
     * @param pSDEActionParamName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONPARAMNAME)
    public void setPSDEActionParamName(String pSDEActionParamName){
        this.set(FIELD_PSDEACTIONPARAMNAME, pSDEActionParamName);
    }
    
    /**
     * 获取 参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionParamName(){
        Object objValue = this.get(FIELD_PSDEACTIONPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionParamNameDirty(){
        if(this.contains(FIELD_PSDEACTIONPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标识
     */
    @JsonIgnore
    public void resetPSDEActionParamName(){
        this.reset(FIELD_PSDEACTIONPARAMNAME);
    }

    /**
     * 设置 参数标识，详细说明：{@link #FIELD_PSDEACTIONPARAMNAME}
     * <P>
     * 等同 {@link #setPSDEActionParamName}
     * @param pSDEActionParamName
     */
    @JsonIgnore
    public PSDEActionParam psdeactionparamname(String pSDEActionParamName){
        this.setPSDEActionParamName(pSDEActionParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEActionParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEActionParamName(strName);
    }

    @JsonIgnore
    public PSDEActionParam name(String strName){
        this.setPSDEActionParamName(strName);
        return this;
    }

    /**
     * <B>PSDEFVALUERULEID</B>&nbsp;属性值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFValueRule} 
     */
    public final static String FIELD_PSDEFVALUERULEID = "psdefvalueruleid";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULEID)
    public void setPSDEFValueRuleId(String pSDEFValueRuleId){
        this.set(FIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleId(){
        Object objValue = this.get(FIELD_PSDEFVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty(){
        if(this.contains(FIELD_PSDEFVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleId(){
        this.reset(FIELD_PSDEFVALUERULEID);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRuleId
     */
    @JsonIgnore
    public PSDEActionParam psdefvalueruleid(String pSDEFValueRuleId){
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    /**
     * 设置 属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEActionParam psdefvalueruleid(PSDEFValueRule pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        }
        else{
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVALUERULENAME</B>&nbsp;属性值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVALUERULEID}
     */
    public final static String FIELD_PSDEFVALUERULENAME = "psdefvaluerulename";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULENAME)
    public void setPSDEFValueRuleName(String pSDEFValueRuleName){
        this.set(FIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleName(){
        Object objValue = this.get(FIELD_PSDEFVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty(){
        if(this.contains(FIELD_PSDEFVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleName(){
        this.reset(FIELD_PSDEFVALUERULENAME);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleName}
     * @param pSDEFValueRuleName
     */
    @JsonIgnore
    public PSDEActionParam psdefvaluerulename(String pSDEFValueRuleName){
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEActionParam psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
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
    public PSDEActionParam pssysvalueruleid(String pSSysValueRuleId){
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
    public PSDEActionParam pssysvalueruleid(PSSysValueRule pSSysValueRule){
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
    public PSDEActionParam pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>REFPSDEFGROUPID</B>&nbsp;引用属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
     */
    public final static String FIELD_REFPSDEFGROUPID = "refpsdefgroupid";

    /**
     * 设置 引用属性组
     * 
     * @param refPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_REFPSDEFGROUPID)
    public void setRefPSDEFGroupId(String refPSDEFGroupId){
        this.set(FIELD_REFPSDEFGROUPID, refPSDEFGroupId);
    }
    
    /**
     * 获取 引用属性组  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFGroupId(){
        Object objValue = this.get(FIELD_REFPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFGroupIdDirty(){
        if(this.contains(FIELD_REFPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用属性组
     */
    @JsonIgnore
    public void resetRefPSDEFGroupId(){
        this.reset(FIELD_REFPSDEFGROUPID);
    }

    /**
     * 设置 引用属性组
     * <P>
     * 等同 {@link #setRefPSDEFGroupId}
     * @param refPSDEFGroupId
     */
    @JsonIgnore
    public PSDEActionParam refpsdefgroupid(String refPSDEFGroupId){
        this.setRefPSDEFGroupId(refPSDEFGroupId);
        return this;
    }

    /**
     * 设置 引用属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDEActionParam refpsdefgroupid(PSDEFGroup pSDEFGroup){
        if(pSDEFGroup == null){
            this.setRefPSDEFGroupId(null);
            this.setRefPSDEFGroupName(null);
        }
        else{
            this.setRefPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setRefPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>REFPSDEFGROUPNAME</B>&nbsp;引用属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEFGROUPID}
     */
    public final static String FIELD_REFPSDEFGROUPNAME = "refpsdefgroupname";

    /**
     * 设置 引用属性组
     * 
     * @param refPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_REFPSDEFGROUPNAME)
    public void setRefPSDEFGroupName(String refPSDEFGroupName){
        this.set(FIELD_REFPSDEFGROUPNAME, refPSDEFGroupName);
    }
    
    /**
     * 获取 引用属性组  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEFGroupName(){
        Object objValue = this.get(FIELD_REFPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEFGroupNameDirty(){
        if(this.contains(FIELD_REFPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用属性组
     */
    @JsonIgnore
    public void resetRefPSDEFGroupName(){
        this.reset(FIELD_REFPSDEFGROUPNAME);
    }

    /**
     * 设置 引用属性组
     * <P>
     * 等同 {@link #setRefPSDEFGroupName}
     * @param refPSDEFGroupName
     */
    @JsonIgnore
    public PSDEActionParam refpsdefgroupname(String refPSDEFGroupName){
        this.setRefPSDEFGroupName(refPSDEFGroupName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体
     * 
     * @param refPSDEId
     * 
     */
    @JsonProperty(FIELD_REFPSDEID)
    public void setRefPSDEId(String refPSDEId){
        this.set(FIELD_REFPSDEID, refPSDEId);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEId(){
        Object objValue = this.get(FIELD_REFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEIdDirty(){
        if(this.contains(FIELD_REFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEId(){
        this.reset(FIELD_REFPSDEID);
    }

    /**
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDEActionParam refpsdeid(String refPSDEId){
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    /**
     * 设置 引用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEActionParam refpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        }
        else{
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>REFPSDENAME</B>&nbsp;引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体
     * 
     * @param refPSDEName
     * 
     */
    @JsonProperty(FIELD_REFPSDENAME)
    public void setRefPSDEName(String refPSDEName){
        this.set(FIELD_REFPSDENAME, refPSDEName);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEName(){
        Object objValue = this.get(FIELD_REFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDENameDirty(){
        if(this.contains(FIELD_REFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEName(){
        this.reset(FIELD_REFPSDENAME);
    }

    /**
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDEActionParam refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELID</B>&nbsp;引用动态模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";

    /**
     * 设置 引用动态模型对象
     * 
     * @param refPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELID)
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId){
        this.set(FIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }
    
    /**
     * 获取 引用动态模型对象  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelId(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用动态模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用动态模型对象
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelId(){
        this.reset(FIELD_REFPSSYSDYNAMODELID);
    }

    /**
     * 设置 引用动态模型对象
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param refPSSysDynaModelId
     */
    @JsonIgnore
    public PSDEActionParam refpssysdynamodelid(String refPSSysDynaModelId){
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 引用动态模型对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEActionParam refpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        }
        else{
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELNAME</B>&nbsp;引用动态模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSDYNAMODELID}
     */
    public final static String FIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";

    /**
     * 设置 引用动态模型对象
     * 
     * @param refPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELNAME)
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName){
        this.set(FIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }
    
    /**
     * 获取 引用动态模型对象  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelName(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用动态模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用动态模型对象
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelName(){
        this.reset(FIELD_REFPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 引用动态模型对象
     * <P>
     * 等同 {@link #setRefPSSysDynaModelName}
     * @param refPSSysDynaModelName
     */
    @JsonIgnore
    public PSDEActionParam refpssysdynamodelname(String refPSSysDynaModelName){
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型，指定行为参数的标准数据类型，未定义时为如行为参数有相关实体属性则使用属性的标准数据类型，否则为【UNKNOWN】
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
    public PSDEActionParam stddatatype(Integer stdDataType){
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
    public PSDEActionParam stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
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
    public PSDEActionParam updatedate(String updateDate){
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
    public PSDEActionParam updateman(String updateMan){
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
    public PSDEActionParam usercat(String userCat){
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
    public PSDEActionParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEActionParam usertag(String userTag){
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
    public PSDEActionParam usertag2(String userTag2){
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
    public PSDEActionParam usertag3(String userTag3){
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
    public PSDEActionParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALUE</B>&nbsp;值或属性，参数值类型为【指定值】时指定参数的直接值
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 设置 值或属性，详细说明：{@link #FIELD_VALUE}
     * 
     * @param value
     * 
     */
    @JsonProperty(FIELD_VALUE)
    public void setValue(String value){
        this.set(FIELD_VALUE, value);
    }
    
    /**
     * 获取 值或属性  
     * @return
     */
    @JsonIgnore
    public String getValue(){
        Object objValue = this.get(FIELD_VALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值或属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueDirty(){
        if(this.contains(FIELD_VALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值或属性
     */
    @JsonIgnore
    public void resetValue(){
        this.reset(FIELD_VALUE);
    }

    /**
     * 设置 值或属性，详细说明：{@link #FIELD_VALUE}
     * <P>
     * 等同 {@link #setValue}
     * @param value
     */
    @JsonIgnore
    public PSDEActionParam value(String value){
        this.setValue(value);
        return this;
    }

    /**
     * <B>VALUEDESC</B>&nbsp;值说明
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_VALUEDESC = "valuedesc";

    /**
     * 设置 值说明
     * 
     * @param valueDesc
     * 
     */
    @JsonProperty(FIELD_VALUEDESC)
    public void setValueDesc(String valueDesc){
        this.set(FIELD_VALUEDESC, valueDesc);
    }
    
    /**
     * 获取 值说明  
     * @return
     */
    @JsonIgnore
    public String getValueDesc(){
        Object objValue = this.get(FIELD_VALUEDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueDescDirty(){
        if(this.contains(FIELD_VALUEDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值说明
     */
    @JsonIgnore
    public void resetValueDesc(){
        this.reset(FIELD_VALUEDESC);
    }

    /**
     * 设置 值说明
     * <P>
     * 等同 {@link #setValueDesc}
     * @param valueDesc
     */
    @JsonIgnore
    public PSDEActionParam valuedesc(String valueDesc){
        this.setValueDesc(valueDesc);
        return this;
    }

    /**
     * <B>VALUETYPE</B>&nbsp;设置值类型，指定行为参数的值类型，未定义时为【输入值（默认）】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEActionParamValueType} 
     */
    public final static String FIELD_VALUETYPE = "valuetype";

    /**
     * 设置 设置值类型，详细说明：{@link #FIELD_VALUETYPE}
     * 
     * @param valueType
     * 
     */
    @JsonProperty(FIELD_VALUETYPE)
    public void setValueType(String valueType){
        this.set(FIELD_VALUETYPE, valueType);
    }
    
    /**
     * 获取 设置值类型  
     * @return
     */
    @JsonIgnore
    public String getValueType(){
        Object objValue = this.get(FIELD_VALUETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 设置值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueTypeDirty(){
        if(this.contains(FIELD_VALUETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 设置值类型
     */
    @JsonIgnore
    public void resetValueType(){
        this.reset(FIELD_VALUETYPE);
    }

    /**
     * 设置 设置值类型，详细说明：{@link #FIELD_VALUETYPE}
     * <P>
     * 等同 {@link #setValueType}
     * @param valueType
     */
    @JsonIgnore
    public PSDEActionParam valuetype(String valueType){
        this.setValueType(valueType);
        return this;
    }

     /**
     * 设置 设置值类型，详细说明：{@link #FIELD_VALUETYPE}
     * <P>
     * 等同 {@link #setValueType}
     * @param valueType
     */
    @JsonIgnore
    public PSDEActionParam valuetype(net.ibizsys.psmodel.core.util.PSModelEnums.DEActionParamValueType valueType){
        if(valueType == null){
            this.setValueType(null);
        }
        else{
            this.setValueType(valueType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEActionParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEActionParamId(strValue);
    }

    @JsonIgnore
    public PSDEActionParam id(String strValue){
        this.setPSDEActionParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEActionParam){
            PSDEActionParam model = (PSDEActionParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
