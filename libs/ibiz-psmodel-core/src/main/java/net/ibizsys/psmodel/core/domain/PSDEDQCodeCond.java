package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEDQCODECOND</B>实体查询代码条件 模型传输对象
 * <P>
 * 实体数据查询代码条件模型，存放模型引擎对数据查询模型编译后的条件代码，查询代码与条件代码分开定义，使用时再进行拼装，支持运行时的查询条件附加。
 */
public class PSDEDQCodeCond extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDQCodeCond(){
    }      

    /**
     * <B>CONDCODE</B>&nbsp;条件代码，指定查询条件代码
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CONDCODE = "condcode";

    /**
     * 设置 条件代码，详细说明：{@link #FIELD_CONDCODE}
     * 
     * @param condCode
     * 
     */
    @JsonProperty(FIELD_CONDCODE)
    public void setCondCode(String condCode){
        this.set(FIELD_CONDCODE, condCode);
    }
    
    /**
     * 获取 条件代码  
     * @return
     */
    @JsonIgnore
    public String getCondCode(){
        Object objValue = this.get(FIELD_CONDCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondCodeDirty(){
        if(this.contains(FIELD_CONDCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件代码
     */
    @JsonIgnore
    public void resetCondCode(){
        this.reset(FIELD_CONDCODE);
    }

    /**
     * 设置 条件代码，详细说明：{@link #FIELD_CONDCODE}
     * <P>
     * 等同 {@link #setCondCode}
     * @param condCode
     */
    @JsonIgnore
    public PSDEDQCodeCond condcode(String condCode){
        this.setCondCode(condCode);
        return this;
    }

    /**
     * <B>CONDTAG</B>&nbsp;条件标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CONDTAG = "condtag";

    /**
     * 设置 条件标记
     * 
     * @param condTag
     * 
     */
    @JsonProperty(FIELD_CONDTAG)
    public void setCondTag(String condTag){
        this.set(FIELD_CONDTAG, condTag);
    }
    
    /**
     * 获取 条件标记  
     * @return
     */
    @JsonIgnore
    public String getCondTag(){
        Object objValue = this.get(FIELD_CONDTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondTagDirty(){
        if(this.contains(FIELD_CONDTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件标记
     */
    @JsonIgnore
    public void resetCondTag(){
        this.reset(FIELD_CONDTAG);
    }

    /**
     * 设置 条件标记
     * <P>
     * 等同 {@link #setCondTag}
     * @param condTag
     */
    @JsonIgnore
    public PSDEDQCodeCond condtag(String condTag){
        this.setCondTag(condTag);
        return this;
    }

    /**
     * <B>CONDTAG2</B>&nbsp;条件标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CONDTAG2 = "condtag2";

    /**
     * 设置 条件标记2
     * 
     * @param condTag2
     * 
     */
    @JsonProperty(FIELD_CONDTAG2)
    public void setCondTag2(String condTag2){
        this.set(FIELD_CONDTAG2, condTag2);
    }
    
    /**
     * 获取 条件标记2  
     * @return
     */
    @JsonIgnore
    public String getCondTag2(){
        Object objValue = this.get(FIELD_CONDTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondTag2Dirty(){
        if(this.contains(FIELD_CONDTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件标记2
     */
    @JsonIgnore
    public void resetCondTag2(){
        this.reset(FIELD_CONDTAG2);
    }

    /**
     * 设置 条件标记2
     * <P>
     * 等同 {@link #setCondTag2}
     * @param condTag2
     */
    @JsonIgnore
    public PSDEDQCodeCond condtag2(String condTag2){
        this.setCondTag2(condTag2);
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
    public PSDEDQCodeCond createdate(String createDate){
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
    public PSDEDQCodeCond createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FIELDNAME</B>&nbsp;变量名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FIELDNAME = "fieldname";

    /**
     * 设置 变量名称
     * 
     * @param fieldName
     * 
     */
    @JsonProperty(FIELD_FIELDNAME)
    public void setFieldName(String fieldName){
        this.set(FIELD_FIELDNAME, fieldName);
    }
    
    /**
     * 获取 变量名称  
     * @return
     */
    @JsonIgnore
    public String getFieldName(){
        Object objValue = this.get(FIELD_FIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变量名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFieldNameDirty(){
        if(this.contains(FIELD_FIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变量名称
     */
    @JsonIgnore
    public void resetFieldName(){
        this.reset(FIELD_FIELDNAME);
    }

    /**
     * 设置 变量名称
     * <P>
     * 等同 {@link #setFieldName}
     * @param fieldName
     */
    @JsonIgnore
    public PSDEDQCodeCond fieldname(String fieldName){
        this.setFieldName(fieldName);
        return this;
    }

    /**
     * <B>IGNOREEMPTY</B>&nbsp;无值时忽略条件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_IGNOREEMPTY = "ignoreempty";

    /**
     * 设置 无值时忽略条件
     * 
     * @param ignoreEmpty
     * 
     */
    @JsonProperty(FIELD_IGNOREEMPTY)
    public void setIgnoreEmpty(Integer ignoreEmpty){
        this.set(FIELD_IGNOREEMPTY, ignoreEmpty);
    }
    
    /**
     * 获取 无值时忽略条件  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreEmpty(){
        Object objValue = this.get(FIELD_IGNOREEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无值时忽略条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreEmptyDirty(){
        if(this.contains(FIELD_IGNOREEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值时忽略条件
     */
    @JsonIgnore
    public void resetIgnoreEmpty(){
        this.reset(FIELD_IGNOREEMPTY);
    }

    /**
     * 设置 无值时忽略条件
     * <P>
     * 等同 {@link #setIgnoreEmpty}
     * @param ignoreEmpty
     */
    @JsonIgnore
    public PSDEDQCodeCond ignoreempty(Integer ignoreEmpty){
        this.setIgnoreEmpty(ignoreEmpty);
        return this;
    }

     /**
     * 设置 无值时忽略条件
     * <P>
     * 等同 {@link #setIgnoreEmpty}
     * @param ignoreEmpty
     */
    @JsonIgnore
    public PSDEDQCodeCond ignoreempty(Boolean ignoreEmpty){
        if(ignoreEmpty == null){
            this.setIgnoreEmpty(null);
        }
        else{
            this.setIgnoreEmpty(ignoreEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDQCodeCond memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;条件次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 条件次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 条件次序  
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
     * 判断 条件次序 是否指定值，包括空值
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
     * 重置 条件次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 条件次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEDQCodeCond ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEDQCODECONDID</B>&nbsp;实体查询代码条件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDQCODECONDID = "psdedqcodecondid";

    /**
     * 设置 实体查询代码条件标识
     * 
     * @param pSDEDQCodeCondId
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODECONDID)
    public void setPSDEDQCodeCondId(String pSDEDQCodeCondId){
        this.set(FIELD_PSDEDQCODECONDID, pSDEDQCodeCondId);
    }
    
    /**
     * 获取 实体查询代码条件标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeCondId(){
        Object objValue = this.get(FIELD_PSDEDQCODECONDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体查询代码条件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeCondIdDirty(){
        if(this.contains(FIELD_PSDEDQCODECONDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体查询代码条件标识
     */
    @JsonIgnore
    public void resetPSDEDQCodeCondId(){
        this.reset(FIELD_PSDEDQCODECONDID);
    }

    /**
     * 设置 实体查询代码条件标识
     * <P>
     * 等同 {@link #setPSDEDQCodeCondId}
     * @param pSDEDQCodeCondId
     */
    @JsonIgnore
    public PSDEDQCodeCond psdedqcodecondid(String pSDEDQCodeCondId){
        this.setPSDEDQCodeCondId(pSDEDQCodeCondId);
        return this;
    }

    /**
     * <B>PSDEDQCODECONDNAME</B>&nbsp;条件名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDQCODECONDNAME = "psdedqcodecondname";

    /**
     * 设置 条件名称
     * 
     * @param pSDEDQCodeCondName
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODECONDNAME)
    public void setPSDEDQCodeCondName(String pSDEDQCodeCondName){
        this.set(FIELD_PSDEDQCODECONDNAME, pSDEDQCodeCondName);
    }
    
    /**
     * 获取 条件名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeCondName(){
        Object objValue = this.get(FIELD_PSDEDQCODECONDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeCondNameDirty(){
        if(this.contains(FIELD_PSDEDQCODECONDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件名称
     */
    @JsonIgnore
    public void resetPSDEDQCodeCondName(){
        this.reset(FIELD_PSDEDQCODECONDNAME);
    }

    /**
     * 设置 条件名称
     * <P>
     * 等同 {@link #setPSDEDQCodeCondName}
     * @param pSDEDQCodeCondName
     */
    @JsonIgnore
    public PSDEDQCodeCond psdedqcodecondname(String pSDEDQCodeCondName){
        this.setPSDEDQCodeCondName(pSDEDQCodeCondName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDQCodeCondName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDQCodeCondName(strName);
    }

    @JsonIgnore
    public PSDEDQCodeCond name(String strName){
        this.setPSDEDQCodeCondName(strName);
        return this;
    }

    /**
     * <B>PSDEDQCODEID</B>&nbsp;数据查询代码
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDQCode} 
     */
    public final static String FIELD_PSDEDQCODEID = "psdedqcodeid";

    /**
     * 设置 数据查询代码
     * 
     * @param pSDEDQCodeId
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODEID)
    public void setPSDEDQCodeId(String pSDEDQCodeId){
        this.set(FIELD_PSDEDQCODEID, pSDEDQCodeId);
    }
    
    /**
     * 获取 数据查询代码  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeId(){
        Object objValue = this.get(FIELD_PSDEDQCODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeIdDirty(){
        if(this.contains(FIELD_PSDEDQCODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询代码
     */
    @JsonIgnore
    public void resetPSDEDQCodeId(){
        this.reset(FIELD_PSDEDQCODEID);
    }

    /**
     * 设置 数据查询代码
     * <P>
     * 等同 {@link #setPSDEDQCodeId}
     * @param pSDEDQCodeId
     */
    @JsonIgnore
    public PSDEDQCodeCond psdedqcodeid(String pSDEDQCodeId){
        this.setPSDEDQCodeId(pSDEDQCodeId);
        return this;
    }

    /**
     * 设置 数据查询代码，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQCodeId}
     * @param pSDEDQCode 引用对象
     */
    @JsonIgnore
    public PSDEDQCodeCond psdedqcodeid(PSDEDQCode pSDEDQCode){
        if(pSDEDQCode == null){
            this.setPSDEDQCodeId(null);
            this.setPSDEDQCodeName(null);
        }
        else{
            this.setPSDEDQCodeId(pSDEDQCode.getPSDEDQCodeId());
            this.setPSDEDQCodeName(pSDEDQCode.getPSDEDQCodeName());
        }
        return this;
    }

    /**
     * <B>PSDEDQCODENAME</B>&nbsp;数据查询代码
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQCODEID}
     */
    public final static String FIELD_PSDEDQCODENAME = "psdedqcodename";

    /**
     * 设置 数据查询代码
     * 
     * @param pSDEDQCodeName
     * 
     */
    @JsonProperty(FIELD_PSDEDQCODENAME)
    public void setPSDEDQCodeName(String pSDEDQCodeName){
        this.set(FIELD_PSDEDQCODENAME, pSDEDQCodeName);
    }
    
    /**
     * 获取 数据查询代码  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQCodeName(){
        Object objValue = this.get(FIELD_PSDEDQCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQCodeNameDirty(){
        if(this.contains(FIELD_PSDEDQCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询代码
     */
    @JsonIgnore
    public void resetPSDEDQCodeName(){
        this.reset(FIELD_PSDEDQCODENAME);
    }

    /**
     * 设置 数据查询代码
     * <P>
     * 等同 {@link #setPSDEDQCodeName}
     * @param pSDEDQCodeName
     */
    @JsonIgnore
    public PSDEDQCodeCond psdedqcodename(String pSDEDQCodeName){
        this.setPSDEDQCodeName(pSDEDQCodeName);
        return this;
    }

    /**
     * <B>PSVARTYPEID</B>&nbsp;变量类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVARTYPEID = "psvartypeid";

    /**
     * 设置 变量类型
     * 
     * @param pSVarTypeId
     * 
     */
    @JsonProperty(FIELD_PSVARTYPEID)
    public void setPSVarTypeId(String pSVarTypeId){
        this.set(FIELD_PSVARTYPEID, pSVarTypeId);
    }
    
    /**
     * 获取 变量类型  
     * @return
     */
    @JsonIgnore
    public String getPSVarTypeId(){
        Object objValue = this.get(FIELD_PSVARTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 变量类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSVarTypeIdDirty(){
        if(this.contains(FIELD_PSVARTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变量类型
     */
    @JsonIgnore
    public void resetPSVarTypeId(){
        this.reset(FIELD_PSVARTYPEID);
    }

    /**
     * 设置 变量类型
     * <P>
     * 等同 {@link #setPSVarTypeId}
     * @param pSVarTypeId
     */
    @JsonIgnore
    public PSDEDQCodeCond psvartypeid(String pSVarTypeId){
        this.setPSVarTypeId(pSVarTypeId);
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
    public PSDEDQCodeCond updatedate(String updateDate){
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
    public PSDEDQCodeCond updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDQCodeCondId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDQCodeCondId(strValue);
    }

    @JsonIgnore
    public PSDEDQCodeCond id(String strValue){
        this.setPSDEDQCodeCondId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDQCodeCond){
            PSDEDQCodeCond model = (PSDEDQCodeCond)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
