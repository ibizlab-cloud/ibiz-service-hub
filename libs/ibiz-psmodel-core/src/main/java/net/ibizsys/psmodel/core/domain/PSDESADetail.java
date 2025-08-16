package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDESADETAIL</B>实体服务接口成员 模型传输对象
 * <P>
 * 实体服务接口成员模型，定义实体接口提供的方法，包括了行为、数据集合、数据查询等
 */
public class PSDESADetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDESADetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体服务接口方法的代码标识，需要在所在的模型域（实体服务接口或实体服务接口关系）中具有唯一性
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
    public PSDESADetail codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定实体服务接口方法的代码标识2，需要在所在的模型域（实体服务接口或实体服务接口关系）中具有唯一性
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
    public PSDESADetail codename2(String codeName2){
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
    public PSDESADetail createdate(String createDate){
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
    public PSDESADetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DETAILPARAM</B>&nbsp;成员参数，指定实体服务接口成员的参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DETAILPARAM = "detailparam";

    /**
     * 设置 成员参数，详细说明：{@link #FIELD_DETAILPARAM}
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
     * 设置 成员参数，详细说明：{@link #FIELD_DETAILPARAM}
     * <P>
     * 等同 {@link #setDetailParam}
     * @param detailParam
     */
    @JsonIgnore
    public PSDESADetail detailparam(String detailParam){
        this.setDetailParam(detailParam);
        return this;
    }

    /**
     * <B>DETAILPARAM2</B>&nbsp;成员参数2，指定实体服务接口成员的参数2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DETAILPARAM2 = "detailparam2";

    /**
     * 设置 成员参数2，详细说明：{@link #FIELD_DETAILPARAM2}
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
     * 设置 成员参数2，详细说明：{@link #FIELD_DETAILPARAM2}
     * <P>
     * 等同 {@link #setDetailParam2}
     * @param detailParam2
     */
    @JsonIgnore
    public PSDESADetail detailparam2(String detailParam2){
        this.setDetailParam2(detailParam2);
        return this;
    }

    /**
     * <B>DETAILTYPE</B>&nbsp;成员类型，指定实体服务接口成员的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEMethodType} 
     */
    public final static String FIELD_DETAILTYPE = "detailtype";

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * 
     * @param detailType
     * 
     */
    @JsonProperty(FIELD_DETAILTYPE)
    public void setDetailType(String detailType){
        this.set(FIELD_DETAILTYPE, detailType);
    }
    
    /**
     * 获取 成员类型  
     * @return
     */
    @JsonIgnore
    public String getDetailType(){
        Object objValue = this.get(FIELD_DETAILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTypeDirty(){
        if(this.contains(FIELD_DETAILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetDetailType(){
        this.reset(FIELD_DETAILTYPE);
    }

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDESADetail detailtype(String detailType){
        this.setDetailType(detailType);
        return this;
    }

     /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDESADetail detailtype(net.ibizsys.psmodel.core.util.PSModelEnums.SADEMethodType detailType){
        if(detailType == null){
            this.setDetailType(null);
        }
        else{
            this.setDetailType(detailType.value);
        }
        return this;
    }

    /**
     * <B>INPSDESERVICEAPIID</B>&nbsp;输入对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_INPSDESERVICEAPIID = "inpsdeserviceapiid";

    /**
     * 设置 输入对象
     * 
     * @param inPSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_INPSDESERVICEAPIID)
    public void setInPSDEServiceAPIId(String inPSDEServiceAPIId){
        this.set(FIELD_INPSDESERVICEAPIID, inPSDEServiceAPIId);
    }
    
    /**
     * 获取 输入对象  
     * @return
     */
    @JsonIgnore
    public String getInPSDEServiceAPIId(){
        Object objValue = this.get(FIELD_INPSDESERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEServiceAPIIdDirty(){
        if(this.contains(FIELD_INPSDESERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象
     */
    @JsonIgnore
    public void resetInPSDEServiceAPIId(){
        this.reset(FIELD_INPSDESERVICEAPIID);
    }

    /**
     * 设置 输入对象
     * <P>
     * 等同 {@link #setInPSDEServiceAPIId}
     * @param inPSDEServiceAPIId
     */
    @JsonIgnore
    public PSDESADetail inpsdeserviceapiid(String inPSDEServiceAPIId){
        this.setInPSDEServiceAPIId(inPSDEServiceAPIId);
        return this;
    }

    /**
     * 设置 输入对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSDEServiceAPIId}
     * @param pSDEServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDESADetail inpsdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setInPSDEServiceAPIId(null);
            this.setInPSDEServiceAPIName(null);
        }
        else{
            this.setInPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setInPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>INPSDESERVICEAPINAME</B>&nbsp;输入对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSDESERVICEAPIID}
     */
    public final static String FIELD_INPSDESERVICEAPINAME = "inpsdeserviceapiname";

    /**
     * 设置 输入对象
     * 
     * @param inPSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_INPSDESERVICEAPINAME)
    public void setInPSDEServiceAPIName(String inPSDEServiceAPIName){
        this.set(FIELD_INPSDESERVICEAPINAME, inPSDEServiceAPIName);
    }
    
    /**
     * 获取 输入对象  
     * @return
     */
    @JsonIgnore
    public String getInPSDEServiceAPIName(){
        Object objValue = this.get(FIELD_INPSDESERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSDEServiceAPINameDirty(){
        if(this.contains(FIELD_INPSDESERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象
     */
    @JsonIgnore
    public void resetInPSDEServiceAPIName(){
        this.reset(FIELD_INPSDESERVICEAPINAME);
    }

    /**
     * 设置 输入对象
     * <P>
     * 等同 {@link #setInPSDEServiceAPIName}
     * @param inPSDEServiceAPIName
     */
    @JsonIgnore
    public PSDESADetail inpsdeserviceapiname(String inPSDEServiceAPIName){
        this.setInPSDEServiceAPIName(inPSDEServiceAPIName);
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
    public PSDESADetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>METHODTAG</B>&nbsp;成员方法标识，指定实体服务接口方法的标识，需要在所在的模型域（实体服务接口或实体服务接口关系）中具有唯一性
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_METHODTAG = "methodtag";

    /**
     * 设置 成员方法标识，详细说明：{@link #FIELD_METHODTAG}
     * 
     * @param methodTag
     * 
     */
    @JsonProperty(FIELD_METHODTAG)
    public void setMethodTag(String methodTag){
        this.set(FIELD_METHODTAG, methodTag);
    }
    
    /**
     * 获取 成员方法标识  
     * @return
     */
    @JsonIgnore
    public String getMethodTag(){
        Object objValue = this.get(FIELD_METHODTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员方法标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMethodTagDirty(){
        if(this.contains(FIELD_METHODTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员方法标识
     */
    @JsonIgnore
    public void resetMethodTag(){
        this.reset(FIELD_METHODTAG);
    }

    /**
     * 设置 成员方法标识，详细说明：{@link #FIELD_METHODTAG}
     * <P>
     * 等同 {@link #setMethodTag}
     * @param methodTag
     */
    @JsonIgnore
    public PSDESADetail methodtag(String methodTag){
        this.setMethodTag(methodTag);
        return this;
    }

    /**
     * <B>NEEDRESOURCEKEY</B>&nbsp;独立输出资源键值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NEEDRESOURCEKEY = "needresourcekey";

    /**
     * 设置 独立输出资源键值
     * 
     * @param needResourceKey
     * 
     */
    @JsonProperty(FIELD_NEEDRESOURCEKEY)
    public void setNeedResourceKey(Integer needResourceKey){
        this.set(FIELD_NEEDRESOURCEKEY, needResourceKey);
    }
    
    /**
     * 获取 独立输出资源键值  
     * @return
     */
    @JsonIgnore
    public Integer getNeedResourceKey(){
        Object objValue = this.get(FIELD_NEEDRESOURCEKEY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 独立输出资源键值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNeedResourceKeyDirty(){
        if(this.contains(FIELD_NEEDRESOURCEKEY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 独立输出资源键值
     */
    @JsonIgnore
    public void resetNeedResourceKey(){
        this.reset(FIELD_NEEDRESOURCEKEY);
    }

    /**
     * 设置 独立输出资源键值
     * <P>
     * 等同 {@link #setNeedResourceKey}
     * @param needResourceKey
     */
    @JsonIgnore
    public PSDESADetail needresourcekey(Integer needResourceKey){
        this.setNeedResourceKey(needResourceKey);
        return this;
    }

     /**
     * 设置 独立输出资源键值
     * <P>
     * 等同 {@link #setNeedResourceKey}
     * @param needResourceKey
     */
    @JsonIgnore
    public PSDESADetail needresourcekey(Boolean needResourceKey){
        if(needResourceKey == null){
            this.setNeedResourceKey(null);
        }
        else{
            this.setNeedResourceKey(needResourceKey?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NOSERVICECODENAME</B>&nbsp;无服务代码标识
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSERVICECODENAME = "noservicecodename";

    /**
     * 设置 无服务代码标识
     * 
     * @param noServiceCodeName
     * 
     */
    @JsonProperty(FIELD_NOSERVICECODENAME)
    public void setNoServiceCodeName(Integer noServiceCodeName){
        this.set(FIELD_NOSERVICECODENAME, noServiceCodeName);
    }
    
    /**
     * 获取 无服务代码标识  
     * @return
     */
    @JsonIgnore
    public Integer getNoServiceCodeName(){
        Object objValue = this.get(FIELD_NOSERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无服务代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoServiceCodeNameDirty(){
        if(this.contains(FIELD_NOSERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无服务代码标识
     */
    @JsonIgnore
    public void resetNoServiceCodeName(){
        this.reset(FIELD_NOSERVICECODENAME);
    }

    /**
     * 设置 无服务代码标识
     * <P>
     * 等同 {@link #setNoServiceCodeName}
     * @param noServiceCodeName
     */
    @JsonIgnore
    public PSDESADetail noservicecodename(Integer noServiceCodeName){
        this.setNoServiceCodeName(noServiceCodeName);
        return this;
    }

     /**
     * 设置 无服务代码标识
     * <P>
     * 等同 {@link #setNoServiceCodeName}
     * @param noServiceCodeName
     */
    @JsonIgnore
    public PSDESADetail noservicecodename(Boolean noServiceCodeName){
        if(noServiceCodeName == null){
            this.setNoServiceCodeName(null);
        }
        else{
            this.setNoServiceCodeName(noServiceCodeName?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDESADetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>OUTPSDESERVICEAPIID</B>&nbsp;输出对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_OUTPSDESERVICEAPIID = "outpsdeserviceapiid";

    /**
     * 设置 输出对象
     * 
     * @param outPSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_OUTPSDESERVICEAPIID)
    public void setOutPSDEServiceAPIId(String outPSDEServiceAPIId){
        this.set(FIELD_OUTPSDESERVICEAPIID, outPSDEServiceAPIId);
    }
    
    /**
     * 获取 输出对象  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEServiceAPIId(){
        Object objValue = this.get(FIELD_OUTPSDESERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEServiceAPIIdDirty(){
        if(this.contains(FIELD_OUTPSDESERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象
     */
    @JsonIgnore
    public void resetOutPSDEServiceAPIId(){
        this.reset(FIELD_OUTPSDESERVICEAPIID);
    }

    /**
     * 设置 输出对象
     * <P>
     * 等同 {@link #setOutPSDEServiceAPIId}
     * @param outPSDEServiceAPIId
     */
    @JsonIgnore
    public PSDESADetail outpsdeserviceapiid(String outPSDEServiceAPIId){
        this.setOutPSDEServiceAPIId(outPSDEServiceAPIId);
        return this;
    }

    /**
     * 设置 输出对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSDEServiceAPIId}
     * @param pSDEServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDESADetail outpsdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setOutPSDEServiceAPIId(null);
            this.setOutPSDEServiceAPIName(null);
        }
        else{
            this.setOutPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setOutPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>OUTPSDESERVICEAPINAME</B>&nbsp;输出对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSDESERVICEAPIID}
     */
    public final static String FIELD_OUTPSDESERVICEAPINAME = "outpsdeserviceapiname";

    /**
     * 设置 输出对象
     * 
     * @param outPSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_OUTPSDESERVICEAPINAME)
    public void setOutPSDEServiceAPIName(String outPSDEServiceAPIName){
        this.set(FIELD_OUTPSDESERVICEAPINAME, outPSDEServiceAPIName);
    }
    
    /**
     * 获取 输出对象  
     * @return
     */
    @JsonIgnore
    public String getOutPSDEServiceAPIName(){
        Object objValue = this.get(FIELD_OUTPSDESERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSDEServiceAPINameDirty(){
        if(this.contains(FIELD_OUTPSDESERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象
     */
    @JsonIgnore
    public void resetOutPSDEServiceAPIName(){
        this.reset(FIELD_OUTPSDESERVICEAPINAME);
    }

    /**
     * 设置 输出对象
     * <P>
     * 等同 {@link #setOutPSDEServiceAPIName}
     * @param outPSDEServiceAPIName
     */
    @JsonIgnore
    public PSDESADetail outpsdeserviceapiname(String outPSDEServiceAPIName){
        this.setOutPSDEServiceAPIName(outPSDEServiceAPIName);
        return this;
    }

    /**
     * <B>PARENTKEYMODE</B>&nbsp;父值处理模式，指定实体服务接口成员在接口关系下对传入父值的处理模式，未定义时为【默认】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEMethodParentKeyMode} 
     */
    public final static String FIELD_PARENTKEYMODE = "parentkeymode";

    /**
     * 设置 父值处理模式，详细说明：{@link #FIELD_PARENTKEYMODE}
     * 
     * @param parentKeyMode
     * 
     */
    @JsonProperty(FIELD_PARENTKEYMODE)
    public void setParentKeyMode(String parentKeyMode){
        this.set(FIELD_PARENTKEYMODE, parentKeyMode);
    }
    
    /**
     * 获取 父值处理模式  
     * @return
     */
    @JsonIgnore
    public String getParentKeyMode(){
        Object objValue = this.get(FIELD_PARENTKEYMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父值处理模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParentKeyModeDirty(){
        if(this.contains(FIELD_PARENTKEYMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父值处理模式
     */
    @JsonIgnore
    public void resetParentKeyMode(){
        this.reset(FIELD_PARENTKEYMODE);
    }

    /**
     * 设置 父值处理模式，详细说明：{@link #FIELD_PARENTKEYMODE}
     * <P>
     * 等同 {@link #setParentKeyMode}
     * @param parentKeyMode
     */
    @JsonIgnore
    public PSDESADetail parentkeymode(String parentKeyMode){
        this.setParentKeyMode(parentKeyMode);
        return this;
    }

     /**
     * 设置 父值处理模式，详细说明：{@link #FIELD_PARENTKEYMODE}
     * <P>
     * 等同 {@link #setParentKeyMode}
     * @param parentKeyMode
     */
    @JsonIgnore
    public PSDESADetail parentkeymode(net.ibizsys.psmodel.core.util.PSModelEnums.SADEMethodParentKeyMode parentKeyMode){
        if(parentKeyMode == null){
            this.setParentKeyMode(null);
        }
        else{
            this.setParentKeyMode(parentKeyMode.value);
        }
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，实体服务接口成员类型为【实体行为】时指定调用的实体行为对象
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
    public PSDESADetail psdeactionid(String pSDEActionId){
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
    public PSDESADetail psdeactionid(PSDEAction pSDEAction){
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
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，实体服务接口成员类型为【实体行为】时指定调用的实体行为对象
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
    public PSDESADetail psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;实体数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataQuery} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 实体数据查询
     * 
     * @param pSDEDQId
     * 
     */
    @JsonProperty(FIELD_PSDEDQID)
    public void setPSDEDQId(String pSDEDQId){
        this.set(FIELD_PSDEDQID, pSDEDQId);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQId(){
        Object objValue = this.get(FIELD_PSDEDQID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQIdDirty(){
        if(this.contains(FIELD_PSDEDQID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQId(){
        this.reset(FIELD_PSDEDQID);
    }

    /**
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDESADetail psdedqid(String pSDEDQId){
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    /**
     * 设置 实体数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDESADetail psdedqid(PSDEDataQuery pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        }
        else{
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;实体数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 实体数据查询
     * 
     * @param pSDEDQName
     * 
     */
    @JsonProperty(FIELD_PSDEDQNAME)
    public void setPSDEDQName(String pSDEDQName){
        this.set(FIELD_PSDEDQNAME, pSDEDQName);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQName(){
        Object objValue = this.get(FIELD_PSDEDQNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQNameDirty(){
        if(this.contains(FIELD_PSDEDQNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQName(){
        this.reset(FIELD_PSDEDQNAME);
    }

    /**
     * 设置 实体数据查询
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDESADetail psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集合，实体服务接口成员类型为【实体数据集】时指定调用的实体集合对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDESADetail psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDESADetail psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体数据集合，实体服务接口成员类型为【实体数据集】时指定调用的实体集合对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDESADetail psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESERVICEAPIID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDESADetail psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;实体操作标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEOPPriv} 
     */
    public final static String FIELD_PSDEOPPRIVID = "psdeopprivid";

    /**
     * 设置 实体操作标识
     * 
     * @param pSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVID)
    public void setPSDEOPPrivId(String pSDEOPPrivId){
        this.set(FIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivId(){
        this.reset(FIELD_PSDEOPPRIVID);
    }

    /**
     * 设置 实体操作标识
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPrivId
     */
    @JsonIgnore
    public PSDESADetail psdeopprivid(String pSDEOPPrivId){
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    /**
     * 设置 实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDESADetail psdeopprivid(PSDEOPPriv pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        }
        else{
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>PSDEOPPRIVNAME</B>&nbsp;实体操作标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEOPPRIVID}
     */
    public final static String FIELD_PSDEOPPRIVNAME = "psdeopprivname";

    /**
     * 设置 实体操作标识
     * 
     * @param pSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVNAME)
    public void setPSDEOPPrivName(String pSDEOPPrivName){
        this.set(FIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivName(){
        this.reset(FIELD_PSDEOPPRIVNAME);
    }

    /**
     * 设置 实体操作标识
     * <P>
     * 等同 {@link #setPSDEOPPrivName}
     * @param pSDEOPPrivName
     */
    @JsonIgnore
    public PSDESADetail psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    /**
     * <B>PSDESADETAILID</B>&nbsp;实体服务接口成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDESADETAILID = "psdesadetailid";

    /**
     * 设置 实体服务接口成员标识
     * 
     * @param pSDESADetailId
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILID)
    public void setPSDESADetailId(String pSDESADetailId){
        this.set(FIELD_PSDESADETAILID, pSDESADetailId);
    }
    
    /**
     * 获取 实体服务接口成员标识  
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
     * 判断 实体服务接口成员标识 是否指定值，包括空值
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
     * 重置 实体服务接口成员标识
     */
    @JsonIgnore
    public void resetPSDESADetailId(){
        this.reset(FIELD_PSDESADETAILID);
    }

    /**
     * 设置 实体服务接口成员标识
     * <P>
     * 等同 {@link #setPSDESADetailId}
     * @param pSDESADetailId
     */
    @JsonIgnore
    public PSDESADetail psdesadetailid(String pSDESADetailId){
        this.setPSDESADetailId(pSDESADetailId);
        return this;
    }

    /**
     * <B>PSDESADETAILNAME</B>&nbsp;成员名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDESADETAILNAME = "psdesadetailname";

    /**
     * 设置 成员名称
     * 
     * @param pSDESADetailName
     * 
     */
    @JsonProperty(FIELD_PSDESADETAILNAME)
    public void setPSDESADetailName(String pSDESADetailName){
        this.set(FIELD_PSDESADETAILNAME, pSDESADetailName);
    }
    
    /**
     * 获取 成员名称  
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
     * 判断 成员名称 是否指定值，包括空值
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
     * 重置 成员名称
     */
    @JsonIgnore
    public void resetPSDESADetailName(){
        this.reset(FIELD_PSDESADETAILNAME);
    }

    /**
     * 设置 成员名称
     * <P>
     * 等同 {@link #setPSDESADetailName}
     * @param pSDESADetailName
     */
    @JsonIgnore
    public PSDESADetail psdesadetailname(String pSDESADetailName){
        this.setPSDESADetailName(pSDESADetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDESADetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDESADetailName(strName);
    }

    @JsonIgnore
    public PSDESADetail name(String strName){
        this.setPSDESADetailName(strName);
        return this;
    }

    /**
     * <B>PSDESARSID</B>&nbsp;接口关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDESARS} 
     */
    public final static String FIELD_PSDESARSID = "psdesarsid";

    /**
     * 设置 接口关系
     * 
     * @param pSDESARSId
     * 
     */
    @JsonProperty(FIELD_PSDESARSID)
    public void setPSDESARSId(String pSDESARSId){
        this.set(FIELD_PSDESARSID, pSDESARSId);
    }
    
    /**
     * 获取 接口关系  
     * @return
     */
    @JsonIgnore
    public String getPSDESARSId(){
        Object objValue = this.get(FIELD_PSDESARSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESARSIdDirty(){
        if(this.contains(FIELD_PSDESARSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口关系
     */
    @JsonIgnore
    public void resetPSDESARSId(){
        this.reset(FIELD_PSDESARSID);
    }

    /**
     * 设置 接口关系
     * <P>
     * 等同 {@link #setPSDESARSId}
     * @param pSDESARSId
     */
    @JsonIgnore
    public PSDESADetail psdesarsid(String pSDESARSId){
        this.setPSDESARSId(pSDESARSId);
        return this;
    }

    /**
     * 设置 接口关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDESARSId}
     * @param pSDESARS 引用对象
     */
    @JsonIgnore
    public PSDESADetail psdesarsid(PSDESARS pSDESARS){
        if(pSDESARS == null){
            this.setPSDESARSId(null);
            this.setPSDESARSName(null);
        }
        else{
            this.setPSDESARSId(pSDESARS.getPSDESARSId());
            this.setPSDESARSName(pSDESARS.getPSDESARSName());
        }
        return this;
    }

    /**
     * <B>PSDESARSNAME</B>&nbsp;接口关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESARSID}
     */
    public final static String FIELD_PSDESARSNAME = "psdesarsname";

    /**
     * 设置 接口关系
     * 
     * @param pSDESARSName
     * 
     */
    @JsonProperty(FIELD_PSDESARSNAME)
    public void setPSDESARSName(String pSDESARSName){
        this.set(FIELD_PSDESARSNAME, pSDESARSName);
    }
    
    /**
     * 获取 接口关系  
     * @return
     */
    @JsonIgnore
    public String getPSDESARSName(){
        Object objValue = this.get(FIELD_PSDESARSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 接口关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDESARSNameDirty(){
        if(this.contains(FIELD_PSDESARSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口关系
     */
    @JsonIgnore
    public void resetPSDESARSName(){
        this.reset(FIELD_PSDESARSNAME);
    }

    /**
     * 设置 接口关系
     * <P>
     * 等同 {@link #setPSDESARSName}
     * @param pSDESARSName
     */
    @JsonIgnore
    public PSDESADetail psdesarsname(String pSDESARSName){
        this.setPSDESARSName(pSDESARSName);
        return this;
    }

    /**
     * <B>PSDESERVICEAPIID</B>&nbsp;实体服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_PSDESERVICEAPIID = "psdeserviceapiid";

    /**
     * 设置 实体服务接口
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
     * 设置 实体服务接口
     * <P>
     * 等同 {@link #setPSDEServiceAPIId}
     * @param pSDEServiceAPIId
     */
    @JsonIgnore
    public PSDESADetail psdeserviceapiid(String pSDEServiceAPIId){
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
    public PSDESADetail psdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setPSDEId(null);
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
            this.setPSSysServiceAPIId(null);
        }
        else{
            this.setPSDEId(pSDEServiceAPI.getPSDEId());
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
            this.setPSSysServiceAPIId(pSDEServiceAPI.getPSSysServiceAPIId());
        }
        return this;
    }

    /**
     * <B>PSDESERVICEAPINAME</B>&nbsp;实体服务接口名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESERVICEAPIID}
     */
    public final static String FIELD_PSDESERVICEAPINAME = "psdeserviceapiname";

    /**
     * 设置 实体服务接口名称
     * 
     * @param pSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPINAME)
    public void setPSDEServiceAPIName(String pSDEServiceAPIName){
        this.set(FIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }
    
    /**
     * 获取 实体服务接口名称  
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
     * 判断 实体服务接口名称 是否指定值，包括空值
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
     * 重置 实体服务接口名称
     */
    @JsonIgnore
    public void resetPSDEServiceAPIName(){
        this.reset(FIELD_PSDESERVICEAPINAME);
    }

    /**
     * 设置 实体服务接口名称
     * <P>
     * 等同 {@link #setPSDEServiceAPIName}
     * @param pSDEServiceAPIName
     */
    @JsonIgnore
    public PSDESADetail psdeserviceapiname(String pSDEServiceAPIName){
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;PSSYSSERVICEAPIID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 PSSYSSERVICEAPIID
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 PSSYSSERVICEAPIID  
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
     * 判断 PSSYSSERVICEAPIID 是否指定值，包括空值
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
     * 重置 PSSYSSERVICEAPIID
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 PSSYSSERVICEAPIID
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSDESADetail pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定实体服务接口方法使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDESADetail pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDESADetail pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定实体服务接口方法使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
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
     * 判断 后台扩展插件 是否指定值，包括空值
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
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDESADetail pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>REQUESTFIELD</B>&nbsp;属性名称
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_REQUESTFIELD = "requestfield";

    /**
     * 设置 属性名称
     * 
     * @param requestField
     * 
     */
    @JsonProperty(FIELD_REQUESTFIELD)
    public void setRequestField(String requestField){
        this.set(FIELD_REQUESTFIELD, requestField);
    }
    
    /**
     * 获取 属性名称  
     * @return
     */
    @JsonIgnore
    public String getRequestField(){
        Object objValue = this.get(FIELD_REQUESTFIELD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestFieldDirty(){
        if(this.contains(FIELD_REQUESTFIELD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性名称
     */
    @JsonIgnore
    public void resetRequestField(){
        this.reset(FIELD_REQUESTFIELD);
    }

    /**
     * 设置 属性名称
     * <P>
     * 等同 {@link #setRequestField}
     * @param requestField
     */
    @JsonIgnore
    public PSDESADetail requestfield(String requestField){
        this.setRequestField(requestField);
        return this;
    }

    /**
     * <B>REQUESTMETHOD</B>&nbsp;请求方式，指定服务实体方法的请求方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod} 
     */
    public final static String FIELD_REQUESTMETHOD = "requestmethod";

    /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * 
     * @param requestMethod
     * 
     */
    @JsonProperty(FIELD_REQUESTMETHOD)
    public void setRequestMethod(String requestMethod){
        this.set(FIELD_REQUESTMETHOD, requestMethod);
    }
    
    /**
     * 获取 请求方式  
     * @return
     */
    @JsonIgnore
    public String getRequestMethod(){
        Object objValue = this.get(FIELD_REQUESTMETHOD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestMethodDirty(){
        if(this.contains(FIELD_REQUESTMETHOD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求方式
     */
    @JsonIgnore
    public void resetRequestMethod(){
        this.reset(FIELD_REQUESTMETHOD);
    }

    /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * <P>
     * 等同 {@link #setRequestMethod}
     * @param requestMethod
     */
    @JsonIgnore
    public PSDESADetail requestmethod(String requestMethod){
        this.setRequestMethod(requestMethod);
        return this;
    }

     /**
     * 设置 请求方式，详细说明：{@link #FIELD_REQUESTMETHOD}
     * <P>
     * 等同 {@link #setRequestMethod}
     * @param requestMethod
     */
    @JsonIgnore
    public PSDESADetail requestmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod requestMethod){
        if(requestMethod == null){
            this.setRequestMethod(null);
        }
        else{
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    /**
     * <B>REQUESTPARAMTYPE</B>&nbsp;请求参数类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ServiceReqParamType} 
     */
    public final static String FIELD_REQUESTPARAMTYPE = "requestparamtype";

    /**
     * 设置 请求参数类型
     * 
     * @param requestParamType
     * 
     */
    @JsonProperty(FIELD_REQUESTPARAMTYPE)
    public void setRequestParamType(String requestParamType){
        this.set(FIELD_REQUESTPARAMTYPE, requestParamType);
    }
    
    /**
     * 获取 请求参数类型  
     * @return
     */
    @JsonIgnore
    public String getRequestParamType(){
        Object objValue = this.get(FIELD_REQUESTPARAMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求参数类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestParamTypeDirty(){
        if(this.contains(FIELD_REQUESTPARAMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求参数类型
     */
    @JsonIgnore
    public void resetRequestParamType(){
        this.reset(FIELD_REQUESTPARAMTYPE);
    }

    /**
     * 设置 请求参数类型
     * <P>
     * 等同 {@link #setRequestParamType}
     * @param requestParamType
     */
    @JsonIgnore
    public PSDESADetail requestparamtype(String requestParamType){
        this.setRequestParamType(requestParamType);
        return this;
    }

     /**
     * 设置 请求参数类型
     * <P>
     * 等同 {@link #setRequestParamType}
     * @param requestParamType
     */
    @JsonIgnore
    public PSDESADetail requestparamtype(net.ibizsys.psmodel.core.util.PSModelEnums.ServiceReqParamType requestParamType){
        if(requestParamType == null){
            this.setRequestParamType(null);
        }
        else{
            this.setRequestParamType(requestParamType.value);
        }
        return this;
    }

    /**
     * <B>RETVALTYPE</B>&nbsp;返回值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEActionRetType} 
     */
    public final static String FIELD_RETVALTYPE = "retvaltype";

    /**
     * 设置 返回值类型
     * 
     * @param retValType
     * 
     */
    @JsonProperty(FIELD_RETVALTYPE)
    public void setRetValType(String retValType){
        this.set(FIELD_RETVALTYPE, retValType);
    }
    
    /**
     * 获取 返回值类型  
     * @return
     */
    @JsonIgnore
    public String getRetValType(){
        Object objValue = this.get(FIELD_RETVALTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 返回值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetValTypeDirty(){
        if(this.contains(FIELD_RETVALTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 返回值类型
     */
    @JsonIgnore
    public void resetRetValType(){
        this.reset(FIELD_RETVALTYPE);
    }

    /**
     * 设置 返回值类型
     * <P>
     * 等同 {@link #setRetValType}
     * @param retValType
     */
    @JsonIgnore
    public PSDESADetail retvaltype(String retValType){
        this.setRetValType(retValType);
        return this;
    }

     /**
     * 设置 返回值类型
     * <P>
     * 等同 {@link #setRetValType}
     * @param retValType
     */
    @JsonIgnore
    public PSDESADetail retvaltype(net.ibizsys.psmodel.core.util.PSModelEnums.DEActionRetType retValType){
        if(retValType == null){
            this.setRetValType(null);
        }
        else{
            this.setRetValType(retValType.value);
        }
        return this;
    }

    /**
     * <B>SERVICEURL</B>&nbsp;服务路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_SERVICEURL = "serviceurl";

    /**
     * 设置 服务路径
     * 
     * @param serviceUrl
     * 
     */
    @JsonProperty(FIELD_SERVICEURL)
    public void setServiceUrl(String serviceUrl){
        this.set(FIELD_SERVICEURL, serviceUrl);
    }
    
    /**
     * 获取 服务路径  
     * @return
     */
    @JsonIgnore
    public String getServiceUrl(){
        Object objValue = this.get(FIELD_SERVICEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceUrlDirty(){
        if(this.contains(FIELD_SERVICEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务路径
     */
    @JsonIgnore
    public void resetServiceUrl(){
        this.reset(FIELD_SERVICEURL);
    }

    /**
     * 设置 服务路径
     * <P>
     * 等同 {@link #setServiceUrl}
     * @param serviceUrl
     */
    @JsonIgnore
    public PSDESADetail serviceurl(String serviceUrl){
        this.setServiceUrl(serviceUrl);
        return this;
    }

    /**
     * <B>UNIQUETAG</B>&nbsp;成员唯一标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UNIQUETAG = "uniquetag";

    /**
     * 设置 成员唯一标识
     * 
     * @param uniqueTag
     * 
     */
    @JsonProperty(FIELD_UNIQUETAG)
    public void setUniqueTag(String uniqueTag){
        this.set(FIELD_UNIQUETAG, uniqueTag);
    }
    
    /**
     * 获取 成员唯一标识  
     * @return
     */
    @JsonIgnore
    public String getUniqueTag(){
        Object objValue = this.get(FIELD_UNIQUETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员唯一标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueTagDirty(){
        if(this.contains(FIELD_UNIQUETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员唯一标识
     */
    @JsonIgnore
    public void resetUniqueTag(){
        this.reset(FIELD_UNIQUETAG);
    }

    /**
     * 设置 成员唯一标识
     * <P>
     * 等同 {@link #setUniqueTag}
     * @param uniqueTag
     */
    @JsonIgnore
    public PSDESADetail uniquetag(String uniqueTag){
        this.setUniqueTag(uniqueTag);
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
    public PSDESADetail updatedate(String updateDate){
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
    public PSDESADetail updateman(String updateMan){
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
    public PSDESADetail usercat(String userCat){
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
    public PSDESADetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDESADetail usertag(String userTag){
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
    public PSDESADetail usertag2(String userTag2){
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
    public PSDESADetail usertag3(String userTag3){
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
    public PSDESADetail usertag4(String userTag4){
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
    public PSDESADetail validflag(Integer validFlag){
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
    public PSDESADetail validflag(Boolean validFlag){
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
        return this.getPSDESADetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDESADetailId(strValue);
    }

    @JsonIgnore
    public PSDESADetail id(String strValue){
        this.setPSDESADetailId(strValue);
        return this;
    }


    /**
     *  实体服务接口成员参数 成员集合
     */
    public final static String FIELD_PSDESADETAILPARAMS = "psdesadetailparams";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDESADetailParam> psdesadetailparams;

    /**
     * 获取 实体服务接口成员参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDESADETAILPARAMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDESADetailParam> getPSDESADetailParams(){
        return this.psdesadetailparams;
    }

    /**
     * 设置 实体服务接口成员参数 成员集合  
     * @param psdesadetailparams
     */
    @JsonProperty(FIELD_PSDESADETAILPARAMS)
    public void setPSDESADetailParams(java.util.List<net.ibizsys.psmodel.core.domain.PSDESADetailParam> psdesadetailparams){
        this.psdesadetailparams = psdesadetailparams;
    }

    /**
     * 获取 实体服务接口成员参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDESADetailParam> getPSDESADetailParamsIf(){
        if(this.psdesadetailparams == null){
            this.psdesadetailparams = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDESADetailParam>();          
        }
        return this.psdesadetailparams;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDESADetail){
            PSDESADetail model = (PSDESADetail)iPSModel;
            model.setPSDESADetailParams(this.getPSDESADetailParams());
        }
        super.copyTo(iPSModel);
    }
}
