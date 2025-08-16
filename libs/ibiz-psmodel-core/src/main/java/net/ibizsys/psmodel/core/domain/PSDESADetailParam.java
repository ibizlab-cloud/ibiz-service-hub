package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDESADETAILPARAM</B>实体服务接口成员参数 模型传输对象
 * <P>
 * 
 */
public class PSDESADetailParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDESADetailParam(){
    }      

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组，指定服务接口实体方法参数是否为数组模式，未定义时为【否】
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
    public PSDESADetailParam arrayflag(Integer arrayFlag){
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
    public PSDESADetailParam arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDESADetailParam codename(String codeName){
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
    public PSDESADetailParam createdate(String createDate){
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
    public PSDESADetailParam createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDESADetailParam memo(String memo){
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
    public PSDESADetailParam ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMTAG</B>&nbsp;参数标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAMTAG = "paramtag";

    /**
     * 设置 参数标记
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
     * 设置 参数标记
     * <P>
     * 等同 {@link #setParamTag}
     * @param paramTag
     */
    @JsonIgnore
    public PSDESADetailParam paramtag(String paramTag){
        this.setParamTag(paramTag);
        return this;
    }

    /**
     * <B>PARAMTAG2</B>&nbsp;参数标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAMTAG2 = "paramtag2";

    /**
     * 设置 参数标记2
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
     * 设置 参数标记2
     * <P>
     * 等同 {@link #setParamTag2}
     * @param paramTag2
     */
    @JsonIgnore
    public PSDESADetailParam paramtag2(String paramTag2){
        this.setParamTag2(paramTag2);
        return this;
    }

    /**
     * <B>PSDESADETAILID</B>&nbsp;服务接口方法参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDESADetail} 
     */
    public final static String FIELD_PSDESADETAILID = "psdesadetailid";

    /**
     * 设置 服务接口方法参数
     * 
     * @param pSDESADetailId
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILID)
    public void setPSDESADetailId(String pSDESADetailId){
        this.set(FIELD_PSDESADETAILID, pSDESADetailId);
    }
    
    /**
     * 获取 服务接口方法参数  
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
     * 判断 服务接口方法参数 是否指定值，包括空值
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
     * 重置 服务接口方法参数
     */
    @JsonIgnore
    public void resetPSDESADetailId(){
        this.reset(FIELD_PSDESADETAILID);
    }

    /**
     * 设置 服务接口方法参数
     * <P>
     * 等同 {@link #setPSDESADetailId}
     * @param pSDESADetailId
     */
    @JsonIgnore
    public PSDESADetailParam psdesadetailid(String pSDESADetailId){
        this.setPSDESADetailId(pSDESADetailId);
        return this;
    }

    /**
     * 设置 服务接口方法参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDESADetailId}
     * @param pSDESADetail 引用对象
     */
    @JsonIgnore
    public PSDESADetailParam psdesadetailid(PSDESADetail pSDESADetail){
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
     * <B>PSDESADETAILNAME</B>&nbsp;服务接口方法参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESADETAILID}
     */
    public final static String FIELD_PSDESADETAILNAME = "psdesadetailname";

    /**
     * 设置 服务接口方法参数
     * 
     * @param pSDESADetailName
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILNAME)
    public void setPSDESADetailName(String pSDESADetailName){
        this.set(FIELD_PSDESADETAILNAME, pSDESADetailName);
    }
    
    /**
     * 获取 服务接口方法参数  
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
     * 判断 服务接口方法参数 是否指定值，包括空值
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
     * 重置 服务接口方法参数
     */
    @JsonIgnore
    public void resetPSDESADetailName(){
        this.reset(FIELD_PSDESADETAILNAME);
    }

    /**
     * 设置 服务接口方法参数
     * <P>
     * 等同 {@link #setPSDESADetailName}
     * @param pSDESADetailName
     */
    @JsonIgnore
    public PSDESADetailParam psdesadetailname(String pSDESADetailName){
        this.setPSDESADetailName(pSDESADetailName);
        return this;
    }

    /**
     * <B>PSDESADETAILPARAMID</B>&nbsp;参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDESADETAILPARAMID = "psdesadetailparamid";

    /**
     * 设置 参数标识
     * 
     * @param pSDESADetailParamId
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILPARAMID)
    public void setPSDESADetailParamId(String pSDESADetailParamId){
        this.set(FIELD_PSDESADETAILPARAMID, pSDESADetailParamId);
    }
    
    /**
     * 获取 参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDESADetailParamId(){
        Object objValue = this.get(FIELD_PSDESADETAILPARAMID);
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
    public boolean isPSDESADetailParamIdDirty(){
        if(this.contains(FIELD_PSDESADETAILPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标识
     */
    @JsonIgnore
    public void resetPSDESADetailParamId(){
        this.reset(FIELD_PSDESADETAILPARAMID);
    }

    /**
     * 设置 参数标识
     * <P>
     * 等同 {@link #setPSDESADetailParamId}
     * @param pSDESADetailParamId
     */
    @JsonIgnore
    public PSDESADetailParam psdesadetailparamid(String pSDESADetailParamId){
        this.setPSDESADetailParamId(pSDESADetailParamId);
        return this;
    }

    /**
     * <B>PSDESADETAILPARAMNAME</B>&nbsp;参数名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDESADETAILPARAMNAME = "psdesadetailparamname";

    /**
     * 设置 参数名称
     * 
     * @param pSDESADetailParamName
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILPARAMNAME)
    public void setPSDESADetailParamName(String pSDESADetailParamName){
        this.set(FIELD_PSDESADETAILPARAMNAME, pSDESADetailParamName);
    }
    
    /**
     * 获取 参数名称  
     * @return
     */
    @JsonIgnore
    public String getPSDESADetailParamName(){
        Object objValue = this.get(FIELD_PSDESADETAILPARAMNAME);
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
    public boolean isPSDESADetailParamNameDirty(){
        if(this.contains(FIELD_PSDESADETAILPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数名称
     */
    @JsonIgnore
    public void resetPSDESADetailParamName(){
        this.reset(FIELD_PSDESADETAILPARAMNAME);
    }

    /**
     * 设置 参数名称
     * <P>
     * 等同 {@link #setPSDESADetailParamName}
     * @param pSDESADetailParamName
     */
    @JsonIgnore
    public PSDESADetailParam psdesadetailparamname(String pSDESADetailParamName){
        this.setPSDESADetailParamName(pSDESADetailParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDESADetailParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDESADetailParamName(strName);
    }

    @JsonIgnore
    public PSDESADetailParam name(String strName){
        this.setPSDESADetailParamName(strName);
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
    public PSDESADetailParam stddatatype(Integer stdDataType){
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
    public PSDESADetailParam stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
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
    public PSDESADetailParam updatedate(String updateDate){
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
    public PSDESADetailParam updateman(String updateMan){
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
    public PSDESADetailParam usercat(String userCat){
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
    public PSDESADetailParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDESADetailParam usertag(String userTag){
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
    public PSDESADetailParam usertag2(String userTag2){
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
    public PSDESADetailParam usertag3(String userTag3){
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
    public PSDESADetailParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDESADetailParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDESADetailParamId(strValue);
    }

    @JsonIgnore
    public PSDESADetailParam id(String strValue){
        this.setPSDESADetailParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDESADetailParam){
            PSDESADetailParam model = (PSDESADetailParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
