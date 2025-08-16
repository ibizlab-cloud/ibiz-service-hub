package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSUBSYSSADETAIL</B>外部接口实体方法 模型传输对象
 * <P>
 * 外部接口实体方法模型，定义外部接口实体提供的方法
 */
public class PSSubSysSADetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSubSysSADetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AFTERCODE</B>&nbsp;执行之后代码
     */
    public final static String FIELD_AFTERCODE = "aftercode";

    /**
     * 设置 执行之后代码
     * 
     * @param afterCode
     * 
     */
    @JsonProperty(FIELD_AFTERCODE)
    public void setAfterCode(String afterCode){
        this.set(FIELD_AFTERCODE, afterCode);
    }
    
    /**
     * 获取 执行之后代码  
     * @return
     */
    @JsonIgnore
    public String getAfterCode(){
        Object objValue = this.get(FIELD_AFTERCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 执行之后代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAfterCodeDirty(){
        if(this.contains(FIELD_AFTERCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 执行之后代码
     */
    @JsonIgnore
    public void resetAfterCode(){
        this.reset(FIELD_AFTERCODE);
    }

    /**
     * 设置 执行之后代码
     * <P>
     * 等同 {@link #setAfterCode}
     * @param afterCode
     */
    @JsonIgnore
    public PSSubSysSADetail aftercode(String afterCode){
        this.setAfterCode(afterCode);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定外部接口实体方法的代码标识，需在所属接口实体中具备唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSubSysSADetail codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定外部接口实体方法的代码标识2
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSubSysSADetail codename2(String codeName2){
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
    public PSSubSysSADetail createdate(String createDate){
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
    public PSSubSysSADetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
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
     * 判断 自定义代码 是否指定值，包括空值
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
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSSubSysSADetail customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSubSysSADetail custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSSubSysSADetail custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DETAILID</B>&nbsp;外部标识，指定外部接口实体方法的实际标识，如外部接口定义的方法序号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILID = "detailid";

    /**
     * 设置 外部标识，详细说明：{@link #FIELD_DETAILID}
     * 
     * @param detailId
     * 
     */
    @JsonProperty(FIELD_DETAILID)
    public void setDetailId(String detailId){
        this.set(FIELD_DETAILID, detailId);
    }
    
    /**
     * 获取 外部标识  
     * @return
     */
    @JsonIgnore
    public String getDetailId(){
        Object objValue = this.get(FIELD_DETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailIdDirty(){
        if(this.contains(FIELD_DETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部标识
     */
    @JsonIgnore
    public void resetDetailId(){
        this.reset(FIELD_DETAILID);
    }

    /**
     * 设置 外部标识，详细说明：{@link #FIELD_DETAILID}
     * <P>
     * 等同 {@link #setDetailId}
     * @param detailId
     */
    @JsonIgnore
    public PSSubSysSADetail detailid(String detailId){
        this.setDetailId(detailId);
        return this;
    }

    /**
     * <B>DETAILPARAM</B>&nbsp;方法参数，指定外部接口实体方法的参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DETAILPARAM = "detailparam";

    /**
     * 设置 方法参数，详细说明：{@link #FIELD_DETAILPARAM}
     * 
     * @param detailParam
     * 
     */
    @JsonProperty(FIELD_DETAILPARAM)
    public void setDetailParam(String detailParam){
        this.set(FIELD_DETAILPARAM, detailParam);
    }
    
    /**
     * 获取 方法参数  
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
     * 判断 方法参数 是否指定值，包括空值
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
     * 重置 方法参数
     */
    @JsonIgnore
    public void resetDetailParam(){
        this.reset(FIELD_DETAILPARAM);
    }

    /**
     * 设置 方法参数，详细说明：{@link #FIELD_DETAILPARAM}
     * <P>
     * 等同 {@link #setDetailParam}
     * @param detailParam
     */
    @JsonIgnore
    public PSSubSysSADetail detailparam(String detailParam){
        this.setDetailParam(detailParam);
        return this;
    }

    /**
     * <B>DETAILPARAM2</B>&nbsp;方法参数2，指定外部接口实体方法的参数2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DETAILPARAM2 = "detailparam2";

    /**
     * 设置 方法参数2，详细说明：{@link #FIELD_DETAILPARAM2}
     * 
     * @param detailParam2
     * 
     */
    @JsonProperty(FIELD_DETAILPARAM2)
    public void setDetailParam2(String detailParam2){
        this.set(FIELD_DETAILPARAM2, detailParam2);
    }
    
    /**
     * 获取 方法参数2  
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
     * 判断 方法参数2 是否指定值，包括空值
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
     * 重置 方法参数2
     */
    @JsonIgnore
    public void resetDetailParam2(){
        this.reset(FIELD_DETAILPARAM2);
    }

    /**
     * 设置 方法参数2，详细说明：{@link #FIELD_DETAILPARAM2}
     * <P>
     * 等同 {@link #setDetailParam2}
     * @param detailParam2
     */
    @JsonIgnore
    public PSSubSysSADetail detailparam2(String detailParam2){
        this.setDetailParam2(detailParam2);
        return this;
    }

    /**
     * <B>DETAILPARAMS</B>&nbsp;成员参数
     */
    public final static String FIELD_DETAILPARAMS = "detailparams";

    /**
     * 设置 成员参数
     * 
     * @param detailParams
     * 
     */
    @JsonProperty(FIELD_DETAILPARAMS)
    public void setDetailParams(String detailParams){
        this.set(FIELD_DETAILPARAMS, detailParams);
    }
    
    /**
     * 获取 成员参数  
     * @return
     */
    @JsonIgnore
    public String getDetailParams(){
        Object objValue = this.get(FIELD_DETAILPARAMS);
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
    public boolean isDetailParamsDirty(){
        if(this.contains(FIELD_DETAILPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数
     */
    @JsonIgnore
    public void resetDetailParams(){
        this.reset(FIELD_DETAILPARAMS);
    }

    /**
     * 设置 成员参数
     * <P>
     * 等同 {@link #setDetailParams}
     * @param detailParams
     */
    @JsonIgnore
    public PSSubSysSADetail detailparams(String detailParams){
        this.setDetailParams(detailParams);
        return this;
    }

    /**
     * <B>DETAILTAG</B>&nbsp;方法标记，指定外部接口实体方法的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILTAG = "detailtag";

    /**
     * 设置 方法标记，详细说明：{@link #FIELD_DETAILTAG}
     * 
     * @param detailTag
     * 
     */
    @JsonProperty(FIELD_DETAILTAG)
    public void setDetailTag(String detailTag){
        this.set(FIELD_DETAILTAG, detailTag);
    }
    
    /**
     * 获取 方法标记  
     * @return
     */
    @JsonIgnore
    public String getDetailTag(){
        Object objValue = this.get(FIELD_DETAILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方法标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTagDirty(){
        if(this.contains(FIELD_DETAILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方法标记
     */
    @JsonIgnore
    public void resetDetailTag(){
        this.reset(FIELD_DETAILTAG);
    }

    /**
     * 设置 方法标记，详细说明：{@link #FIELD_DETAILTAG}
     * <P>
     * 等同 {@link #setDetailTag}
     * @param detailTag
     */
    @JsonIgnore
    public PSSubSysSADetail detailtag(String detailTag){
        this.setDetailTag(detailTag);
        return this;
    }

    /**
     * <B>DETAILTAG2</B>&nbsp;方法标记2，指定外部接口实体方法的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAILTAG2 = "detailtag2";

    /**
     * 设置 方法标记2，详细说明：{@link #FIELD_DETAILTAG2}
     * 
     * @param detailTag2
     * 
     */
    @JsonProperty(FIELD_DETAILTAG2)
    public void setDetailTag2(String detailTag2){
        this.set(FIELD_DETAILTAG2, detailTag2);
    }
    
    /**
     * 获取 方法标记2  
     * @return
     */
    @JsonIgnore
    public String getDetailTag2(){
        Object objValue = this.get(FIELD_DETAILTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方法标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTag2Dirty(){
        if(this.contains(FIELD_DETAILTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方法标记2
     */
    @JsonIgnore
    public void resetDetailTag2(){
        this.reset(FIELD_DETAILTAG2);
    }

    /**
     * 设置 方法标记2，详细说明：{@link #FIELD_DETAILTAG2}
     * <P>
     * 等同 {@link #setDetailTag2}
     * @param detailTag2
     */
    @JsonIgnore
    public PSSubSysSADetail detailtag2(String detailTag2){
        this.setDetailTag2(detailTag2);
        return this;
    }

    /**
     * <B>DETAILTYPE</B>&nbsp;方法类型，指定外部接口实体方法的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEMethodType} 
     */
    public final static String FIELD_DETAILTYPE = "detailtype";

    /**
     * 设置 方法类型，详细说明：{@link #FIELD_DETAILTYPE}
     * 
     * @param detailType
     * 
     */
    @JsonProperty(FIELD_DETAILTYPE)
    public void setDetailType(String detailType){
        this.set(FIELD_DETAILTYPE, detailType);
    }
    
    /**
     * 获取 方法类型  
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
     * 判断 方法类型 是否指定值，包括空值
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
     * 重置 方法类型
     */
    @JsonIgnore
    public void resetDetailType(){
        this.reset(FIELD_DETAILTYPE);
    }

    /**
     * 设置 方法类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSSubSysSADetail detailtype(String detailType){
        this.setDetailType(detailType);
        return this;
    }

     /**
     * 设置 方法类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSSubSysSADetail detailtype(net.ibizsys.psmodel.core.util.PSModelEnums.SADEMethodType detailType){
        if(detailType == null){
            this.setDetailType(null);
        }
        else{
            this.setDetailType(detailType.value);
        }
        return this;
    }

    /**
     * <B>INPSSUBSYSSADEID</B>&nbsp;输入对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_INPSSUBSYSSADEID = "inpssubsyssadeid";

    /**
     * 设置 输入对象
     * 
     * @param inPSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_INPSSUBSYSSADEID)
    public void setInPSSubSysSADEId(String inPSSubSysSADEId){
        this.set(FIELD_INPSSUBSYSSADEID, inPSSubSysSADEId);
    }
    
    /**
     * 获取 输入对象  
     * @return
     */
    @JsonIgnore
    public String getInPSSubSysSADEId(){
        Object objValue = this.get(FIELD_INPSSUBSYSSADEID);
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
    public boolean isInPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_INPSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象
     */
    @JsonIgnore
    public void resetInPSSubSysSADEId(){
        this.reset(FIELD_INPSSUBSYSSADEID);
    }

    /**
     * 设置 输入对象
     * <P>
     * 等同 {@link #setInPSSubSysSADEId}
     * @param inPSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADetail inpssubsyssadeid(String inPSSubSysSADEId){
        this.setInPSSubSysSADEId(inPSSubSysSADEId);
        return this;
    }

    /**
     * 设置 输入对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail inpssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setInPSSubSysSADEId(null);
            this.setInPSSubSysSADEName(null);
        }
        else{
            this.setInPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setInPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>INPSSUBSYSSADENAME</B>&nbsp;输入对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSSUBSYSSADEID}
     */
    public final static String FIELD_INPSSUBSYSSADENAME = "inpssubsyssadename";

    /**
     * 设置 输入对象
     * 
     * @param inPSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_INPSSUBSYSSADENAME)
    public void setInPSSubSysSADEName(String inPSSubSysSADEName){
        this.set(FIELD_INPSSUBSYSSADENAME, inPSSubSysSADEName);
    }
    
    /**
     * 获取 输入对象  
     * @return
     */
    @JsonIgnore
    public String getInPSSubSysSADEName(){
        Object objValue = this.get(FIELD_INPSSUBSYSSADENAME);
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
    public boolean isInPSSubSysSADENameDirty(){
        if(this.contains(FIELD_INPSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象
     */
    @JsonIgnore
    public void resetInPSSubSysSADEName(){
        this.reset(FIELD_INPSSUBSYSSADENAME);
    }

    /**
     * 设置 输入对象
     * <P>
     * 等同 {@link #setInPSSubSysSADEName}
     * @param inPSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADetail inpssubsyssadename(String inPSSubSysSADEName){
        this.setInPSSubSysSADEName(inPSSubSysSADEName);
        return this;
    }

    /**
     * <B>INPSSYSDYNAMODELID</B>&nbsp;输入对象模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_INPSSYSDYNAMODELID = "inpssysdynamodelid";

    /**
     * 设置 输入对象模型
     * 
     * @param inPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_INPSSYSDYNAMODELID)
    public void setInPSSysDynaModelId(String inPSSysDynaModelId){
        this.set(FIELD_INPSSYSDYNAMODELID, inPSSysDynaModelId);
    }
    
    /**
     * 获取 输入对象模型  
     * @return
     */
    @JsonIgnore
    public String getInPSSysDynaModelId(){
        Object objValue = this.get(FIELD_INPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_INPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象模型
     */
    @JsonIgnore
    public void resetInPSSysDynaModelId(){
        this.reset(FIELD_INPSSYSDYNAMODELID);
    }

    /**
     * 设置 输入对象模型
     * <P>
     * 等同 {@link #setInPSSysDynaModelId}
     * @param inPSSysDynaModelId
     */
    @JsonIgnore
    public PSSubSysSADetail inpssysdynamodelid(String inPSSysDynaModelId){
        this.setInPSSysDynaModelId(inPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 输入对象模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail inpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setInPSSysDynaModelId(null);
            this.setInPSSysDynaModelName(null);
        }
        else{
            this.setInPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setInPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>INPSSYSDYNAMODELNAME</B>&nbsp;输入对象模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INPSSYSDYNAMODELID}
     */
    public final static String FIELD_INPSSYSDYNAMODELNAME = "inpssysdynamodelname";

    /**
     * 设置 输入对象模型
     * 
     * @param inPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_INPSSYSDYNAMODELNAME)
    public void setInPSSysDynaModelName(String inPSSysDynaModelName){
        this.set(FIELD_INPSSYSDYNAMODELNAME, inPSSysDynaModelName);
    }
    
    /**
     * 获取 输入对象模型  
     * @return
     */
    @JsonIgnore
    public String getInPSSysDynaModelName(){
        Object objValue = this.get(FIELD_INPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_INPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入对象模型
     */
    @JsonIgnore
    public void resetInPSSysDynaModelName(){
        this.reset(FIELD_INPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 输入对象模型
     * <P>
     * 等同 {@link #setInPSSysDynaModelName}
     * @param inPSSysDynaModelName
     */
    @JsonIgnore
    public PSSubSysSADetail inpssysdynamodelname(String inPSSysDynaModelName){
        this.setInPSSysDynaModelName(inPSSysDynaModelName);
        return this;
    }

    /**
     * <B>KEYFIELDNAME</B>&nbsp;请求属性名称，请求参数类型为【指定属性】时指定请求的属性名称，一般为实体的主键
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_KEYFIELDNAME = "keyfieldname";

    /**
     * 设置 请求属性名称，详细说明：{@link #FIELD_KEYFIELDNAME}
     * 
     * @param keyFieldName
     * 
     */
    @JsonProperty(FIELD_KEYFIELDNAME)
    public void setKeyFieldName(String keyFieldName){
        this.set(FIELD_KEYFIELDNAME, keyFieldName);
    }
    
    /**
     * 获取 请求属性名称  
     * @return
     */
    @JsonIgnore
    public String getKeyFieldName(){
        Object objValue = this.get(FIELD_KEYFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeyFieldNameDirty(){
        if(this.contains(FIELD_KEYFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求属性名称
     */
    @JsonIgnore
    public void resetKeyFieldName(){
        this.reset(FIELD_KEYFIELDNAME);
    }

    /**
     * 设置 请求属性名称，详细说明：{@link #FIELD_KEYFIELDNAME}
     * <P>
     * 等同 {@link #setKeyFieldName}
     * @param keyFieldName
     */
    @JsonIgnore
    public PSSubSysSADetail keyfieldname(String keyFieldName){
        this.setKeyFieldName(keyFieldName);
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
    public PSSubSysSADetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>METHODCODE</B>&nbsp;方法代码
     */
    public final static String FIELD_METHODCODE = "methodcode";

    /**
     * 设置 方法代码
     * 
     * @param methodCode
     * 
     */
    @JsonProperty(FIELD_METHODCODE)
    public void setMethodCode(String methodCode){
        this.set(FIELD_METHODCODE, methodCode);
    }
    
    /**
     * 获取 方法代码  
     * @return
     */
    @JsonIgnore
    public String getMethodCode(){
        Object objValue = this.get(FIELD_METHODCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方法代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMethodCodeDirty(){
        if(this.contains(FIELD_METHODCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方法代码
     */
    @JsonIgnore
    public void resetMethodCode(){
        this.reset(FIELD_METHODCODE);
    }

    /**
     * 设置 方法代码
     * <P>
     * 等同 {@link #setMethodCode}
     * @param methodCode
     */
    @JsonIgnore
    public PSSubSysSADetail methodcode(String methodCode){
        this.setMethodCode(methodCode);
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
    public PSSubSysSADetail needresourcekey(Integer needResourceKey){
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
    public PSSubSysSADetail needresourcekey(Boolean needResourceKey){
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
    public PSSubSysSADetail noservicecodename(Integer noServiceCodeName){
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
    public PSSubSysSADetail noservicecodename(Boolean noServiceCodeName){
        if(noServiceCodeName == null){
            this.setNoServiceCodeName(null);
        }
        else{
            this.setNoServiceCodeName(noServiceCodeName?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>OUTPSSUBSYSSADEID</B>&nbsp;输出对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_OUTPSSUBSYSSADEID = "outpssubsyssadeid";

    /**
     * 设置 输出对象
     * 
     * @param outPSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_OUTPSSUBSYSSADEID)
    public void setOutPSSubSysSADEId(String outPSSubSysSADEId){
        this.set(FIELD_OUTPSSUBSYSSADEID, outPSSubSysSADEId);
    }
    
    /**
     * 获取 输出对象  
     * @return
     */
    @JsonIgnore
    public String getOutPSSubSysSADEId(){
        Object objValue = this.get(FIELD_OUTPSSUBSYSSADEID);
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
    public boolean isOutPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_OUTPSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象
     */
    @JsonIgnore
    public void resetOutPSSubSysSADEId(){
        this.reset(FIELD_OUTPSSUBSYSSADEID);
    }

    /**
     * 设置 输出对象
     * <P>
     * 等同 {@link #setOutPSSubSysSADEId}
     * @param outPSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADetail outpssubsyssadeid(String outPSSubSysSADEId){
        this.setOutPSSubSysSADEId(outPSSubSysSADEId);
        return this;
    }

    /**
     * 设置 输出对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail outpssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setOutPSSubSysSADEId(null);
            this.setOutPSSubSysSADEName(null);
        }
        else{
            this.setOutPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setOutPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>OUTPSSUBSYSSADENAME</B>&nbsp;输出对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSSUBSYSSADEID}
     */
    public final static String FIELD_OUTPSSUBSYSSADENAME = "outpssubsyssadename";

    /**
     * 设置 输出对象
     * 
     * @param outPSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_OUTPSSUBSYSSADENAME)
    public void setOutPSSubSysSADEName(String outPSSubSysSADEName){
        this.set(FIELD_OUTPSSUBSYSSADENAME, outPSSubSysSADEName);
    }
    
    /**
     * 获取 输出对象  
     * @return
     */
    @JsonIgnore
    public String getOutPSSubSysSADEName(){
        Object objValue = this.get(FIELD_OUTPSSUBSYSSADENAME);
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
    public boolean isOutPSSubSysSADENameDirty(){
        if(this.contains(FIELD_OUTPSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象
     */
    @JsonIgnore
    public void resetOutPSSubSysSADEName(){
        this.reset(FIELD_OUTPSSUBSYSSADENAME);
    }

    /**
     * 设置 输出对象
     * <P>
     * 等同 {@link #setOutPSSubSysSADEName}
     * @param outPSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADetail outpssubsyssadename(String outPSSubSysSADEName){
        this.setOutPSSubSysSADEName(outPSSubSysSADEName);
        return this;
    }

    /**
     * <B>OUTPSSYSDYNAMODELID</B>&nbsp;输出对象模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_OUTPSSYSDYNAMODELID = "outpssysdynamodelid";

    /**
     * 设置 输出对象模型
     * 
     * @param outPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSDYNAMODELID)
    public void setOutPSSysDynaModelId(String outPSSysDynaModelId){
        this.set(FIELD_OUTPSSYSDYNAMODELID, outPSSysDynaModelId);
    }
    
    /**
     * 获取 输出对象模型  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysDynaModelId(){
        Object objValue = this.get(FIELD_OUTPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_OUTPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象模型
     */
    @JsonIgnore
    public void resetOutPSSysDynaModelId(){
        this.reset(FIELD_OUTPSSYSDYNAMODELID);
    }

    /**
     * 设置 输出对象模型
     * <P>
     * 等同 {@link #setOutPSSysDynaModelId}
     * @param outPSSysDynaModelId
     */
    @JsonIgnore
    public PSSubSysSADetail outpssysdynamodelid(String outPSSysDynaModelId){
        this.setOutPSSysDynaModelId(outPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 输出对象模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail outpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setOutPSSysDynaModelId(null);
            this.setOutPSSysDynaModelName(null);
        }
        else{
            this.setOutPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setOutPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>OUTPSSYSDYNAMODELNAME</B>&nbsp;输出对象模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSSYSDYNAMODELID}
     */
    public final static String FIELD_OUTPSSYSDYNAMODELNAME = "outpssysdynamodelname";

    /**
     * 设置 输出对象模型
     * 
     * @param outPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSDYNAMODELNAME)
    public void setOutPSSysDynaModelName(String outPSSysDynaModelName){
        this.set(FIELD_OUTPSSYSDYNAMODELNAME, outPSSysDynaModelName);
    }
    
    /**
     * 获取 输出对象模型  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysDynaModelName(){
        Object objValue = this.get(FIELD_OUTPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出对象模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_OUTPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出对象模型
     */
    @JsonIgnore
    public void resetOutPSSysDynaModelName(){
        this.reset(FIELD_OUTPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 输出对象模型
     * <P>
     * 等同 {@link #setOutPSSysDynaModelName}
     * @param outPSSysDynaModelName
     */
    @JsonIgnore
    public PSSubSysSADetail outpssysdynamodelname(String outPSSysDynaModelName){
        this.setOutPSSysDynaModelName(outPSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体标识
     * <P>
     * 字符串：最大长度 60
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
    public PSSubSysSADetail psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;实体逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体逻辑名称
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体逻辑名称  
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
     * 判断 实体逻辑名称 是否指定值，包括空值
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
     * 重置 实体逻辑名称
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体逻辑名称
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSSubSysSADetail psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体名称
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体名称  
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
     * 判断 实体名称 是否指定值，包括空值
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
     * 重置 实体名称
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体名称
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSubSysSADetail psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;外部接口实体，指定外部接口实体方法所属的接口实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADEID}
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 外部接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADEID}
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * 设置 外部接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
        }
        else{
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADENAME</B>&nbsp;外部接口实体，指定外部接口实体方法所属的接口实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADEID}
     */
    public final static String FIELD_PSSUBSYSSADENAME = "pssubsyssadename";

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * 
     * @param pSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADENAME)
    public void setPSSubSysSADEName(String pSSubSysSADEName){
        this.set(FIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }
    
    /**
     * 获取 外部接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADENameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEName(){
        this.reset(FIELD_PSSUBSYSSADENAME);
    }

    /**
     * 设置 外部接口实体，详细说明：{@link #FIELD_PSSUBSYSSADENAME}
     * <P>
     * 等同 {@link #setPSSubSysSADEName}
     * @param pSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsyssadename(String pSSubSysSADEName){
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILID</B>&nbsp;子系统服务接口成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";

    /**
     * 设置 子系统服务接口成员标识
     * 
     * @param pSSubSysSADetailId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILID)
    public void setPSSubSysSADetailId(String pSSubSysSADetailId){
        this.set(FIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }
    
    /**
     * 获取 子系统服务接口成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADetailId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子系统服务接口成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADetailIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子系统服务接口成员标识
     */
    @JsonIgnore
    public void resetPSSubSysSADetailId(){
        this.reset(FIELD_PSSUBSYSSADETAILID);
    }

    /**
     * 设置 子系统服务接口成员标识
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetailId
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsyssadetailid(String pSSubSysSADetailId){
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILNAME</B>&nbsp;方法名称，指定外部接口实体方法的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";

    /**
     * 设置 方法名称，详细说明：{@link #FIELD_PSSUBSYSSADETAILNAME}
     * 
     * @param pSSubSysSADetailName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILNAME)
    public void setPSSubSysSADetailName(String pSSubSysSADetailName){
        this.set(FIELD_PSSUBSYSSADETAILNAME, pSSubSysSADetailName);
    }
    
    /**
     * 获取 方法名称  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADetailName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 方法名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADetailNameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 方法名称
     */
    @JsonIgnore
    public void resetPSSubSysSADetailName(){
        this.reset(FIELD_PSSUBSYSSADETAILNAME);
    }

    /**
     * 设置 方法名称，详细说明：{@link #FIELD_PSSUBSYSSADETAILNAME}
     * <P>
     * 等同 {@link #setPSSubSysSADetailName}
     * @param pSSubSysSADetailName
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsyssadetailname(String pSSubSysSADetailName){
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSubSysSADetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSubSysSADetailName(strName);
    }

    @JsonIgnore
    public PSSubSysSADetail name(String strName){
        this.setPSSubSysSADetailName(strName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部服务接口，指定外部接口实体方法所属的外部服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysServiceAPI} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsysserviceapiid(PSSubSysServiceAPI pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部服务接口，指定外部接口实体方法所属的外部服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部服务接口，详细说明：{@link #FIELD_PSSUBSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSSubSysSADetail pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定外部接口实体方法使用的后台模板扩展插件
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
    public PSSubSysSADetail pssyssfpluginid(String pSSysSFPluginId){
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
    public PSSubSysSADetail pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定外部接口实体方法使用的后台模板扩展插件
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
    public PSSubSysSADetail pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>REQUESTCONTENTTYPE</B>&nbsp;请求内容类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ServiceReqContentType} 
     */
    public final static String FIELD_REQUESTCONTENTTYPE = "requestcontenttype";

    /**
     * 设置 请求内容类型
     * 
     * @param requestContentType
     * 
     */
    @JsonProperty(FIELD_REQUESTCONTENTTYPE)
    public void setRequestContentType(String requestContentType){
        this.set(FIELD_REQUESTCONTENTTYPE, requestContentType);
    }
    
    /**
     * 获取 请求内容类型  
     * @return
     */
    @JsonIgnore
    public String getRequestContentType(){
        Object objValue = this.get(FIELD_REQUESTCONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 请求内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRequestContentTypeDirty(){
        if(this.contains(FIELD_REQUESTCONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 请求内容类型
     */
    @JsonIgnore
    public void resetRequestContentType(){
        this.reset(FIELD_REQUESTCONTENTTYPE);
    }

    /**
     * 设置 请求内容类型
     * <P>
     * 等同 {@link #setRequestContentType}
     * @param requestContentType
     */
    @JsonIgnore
    public PSSubSysSADetail requestcontenttype(String requestContentType){
        this.setRequestContentType(requestContentType);
        return this;
    }

    /**
     * <B>REQUESTMETHOD</B>&nbsp;请求方式，指定外部接口实体方法的请求方式
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
    public PSSubSysSADetail requestmethod(String requestMethod){
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
    public PSSubSysSADetail requestmethod(net.ibizsys.psmodel.core.util.PSModelEnums.RequestMethod requestMethod){
        if(requestMethod == null){
            this.setRequestMethod(null);
        }
        else{
            this.setRequestMethod(requestMethod.value);
        }
        return this;
    }

    /**
     * <B>REQUESTPARAMTYPE</B>&nbsp;请求参数类型，指定外部接口实体方法的请求参数类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ServiceReqParamType} 
     */
    public final static String FIELD_REQUESTPARAMTYPE = "requestparamtype";

    /**
     * 设置 请求参数类型，详细说明：{@link #FIELD_REQUESTPARAMTYPE}
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
     * 设置 请求参数类型，详细说明：{@link #FIELD_REQUESTPARAMTYPE}
     * <P>
     * 等同 {@link #setRequestParamType}
     * @param requestParamType
     */
    @JsonIgnore
    public PSSubSysSADetail requestparamtype(String requestParamType){
        this.setRequestParamType(requestParamType);
        return this;
    }

     /**
     * 设置 请求参数类型，详细说明：{@link #FIELD_REQUESTPARAMTYPE}
     * <P>
     * 等同 {@link #setRequestParamType}
     * @param requestParamType
     */
    @JsonIgnore
    public PSSubSysSADetail requestparamtype(net.ibizsys.psmodel.core.util.PSModelEnums.ServiceReqParamType requestParamType){
        if(requestParamType == null){
            this.setRequestParamType(null);
        }
        else{
            this.setRequestParamType(requestParamType.value);
        }
        return this;
    }

    /**
     * <B>RETPSSUBSYSSADEID</B>&nbsp;结果对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_RETPSSUBSYSSADEID = "retpssubsyssadeid";

    /**
     * 设置 结果对象
     * 
     * @param retPSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_RETPSSUBSYSSADEID)
    public void setRetPSSubSysSADEId(String retPSSubSysSADEId){
        this.set(FIELD_RETPSSUBSYSSADEID, retPSSubSysSADEId);
    }
    
    /**
     * 获取 结果对象  
     * @return
     */
    @JsonIgnore
    public String getRetPSSubSysSADEId(){
        Object objValue = this.get(FIELD_RETPSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_RETPSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果对象
     */
    @JsonIgnore
    public void resetRetPSSubSysSADEId(){
        this.reset(FIELD_RETPSSUBSYSSADEID);
    }

    /**
     * 设置 结果对象
     * <P>
     * 等同 {@link #setRetPSSubSysSADEId}
     * @param retPSSubSysSADEId
     */
    @JsonIgnore
    public PSSubSysSADetail retpssubsyssadeid(String retPSSubSysSADEId){
        this.setRetPSSubSysSADEId(retPSSubSysSADEId);
        return this;
    }

    /**
     * 设置 结果对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRetPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSubSysSADetail retpssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setRetPSSubSysSADEId(null);
            this.setRetPSSubSysSADEName(null);
        }
        else{
            this.setRetPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setRetPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>RETPSSUBSYSSADENAME</B>&nbsp;结果对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RETPSSUBSYSSADEID}
     */
    public final static String FIELD_RETPSSUBSYSSADENAME = "retpssubsyssadename";

    /**
     * 设置 结果对象
     * 
     * @param retPSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_RETPSSUBSYSSADENAME)
    public void setRetPSSubSysSADEName(String retPSSubSysSADEName){
        this.set(FIELD_RETPSSUBSYSSADENAME, retPSSubSysSADEName);
    }
    
    /**
     * 获取 结果对象  
     * @return
     */
    @JsonIgnore
    public String getRetPSSubSysSADEName(){
        Object objValue = this.get(FIELD_RETPSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetPSSubSysSADENameDirty(){
        if(this.contains(FIELD_RETPSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果对象
     */
    @JsonIgnore
    public void resetRetPSSubSysSADEName(){
        this.reset(FIELD_RETPSSUBSYSSADENAME);
    }

    /**
     * 设置 结果对象
     * <P>
     * 等同 {@link #setRetPSSubSysSADEName}
     * @param retPSSubSysSADEName
     */
    @JsonIgnore
    public PSSubSysSADetail retpssubsyssadename(String retPSSubSysSADEName){
        this.setRetPSSubSysSADEName(retPSSubSysSADEName);
        return this;
    }

    /**
     * <B>RETSTDDATATYPE</B>&nbsp;返回数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_RETSTDDATATYPE = "retstddatatype";

    /**
     * 设置 返回数据类型
     * 
     * @param retStdDataType
     * 
     */
    @JsonProperty(FIELD_RETSTDDATATYPE)
    public void setRetStdDataType(Integer retStdDataType){
        this.set(FIELD_RETSTDDATATYPE, retStdDataType);
    }
    
    /**
     * 获取 返回数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getRetStdDataType(){
        Object objValue = this.get(FIELD_RETSTDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 返回数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetStdDataTypeDirty(){
        if(this.contains(FIELD_RETSTDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 返回数据类型
     */
    @JsonIgnore
    public void resetRetStdDataType(){
        this.reset(FIELD_RETSTDDATATYPE);
    }

    /**
     * 设置 返回数据类型
     * <P>
     * 等同 {@link #setRetStdDataType}
     * @param retStdDataType
     */
    @JsonIgnore
    public PSSubSysSADetail retstddatatype(Integer retStdDataType){
        this.setRetStdDataType(retStdDataType);
        return this;
    }

     /**
     * 设置 返回数据类型
     * <P>
     * 等同 {@link #setRetStdDataType}
     * @param retStdDataType
     */
    @JsonIgnore
    public PSSubSysSADetail retstddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType retStdDataType){
        if(retStdDataType == null){
            this.setRetStdDataType(null);
        }
        else{
            this.setRetStdDataType(retStdDataType.value);
        }
        return this;
    }

    /**
     * <B>RETVALTYPE</B>&nbsp;返回值类型，指定外部接口实体方法的返回值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADetailRetType} 
     */
    public final static String FIELD_RETVALTYPE = "retvaltype";

    /**
     * 设置 返回值类型，详细说明：{@link #FIELD_RETVALTYPE}
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
     * 设置 返回值类型，详细说明：{@link #FIELD_RETVALTYPE}
     * <P>
     * 等同 {@link #setRetValType}
     * @param retValType
     */
    @JsonIgnore
    public PSSubSysSADetail retvaltype(String retValType){
        this.setRetValType(retValType);
        return this;
    }

     /**
     * 设置 返回值类型，详细说明：{@link #FIELD_RETVALTYPE}
     * <P>
     * 等同 {@link #setRetValType}
     * @param retValType
     */
    @JsonIgnore
    public PSSubSysSADetail retvaltype(net.ibizsys.psmodel.core.util.PSModelEnums.SubSysSADetailRetType retValType){
        if(retValType == null){
            this.setRetValType(null);
        }
        else{
            this.setRetValType(retValType.value);
        }
        return this;
    }

    /**
     * <B>SERVICEURL</B>&nbsp;服务路径，指定外部接口实体方法的实际服务路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_SERVICEURL = "serviceurl";

    /**
     * 设置 服务路径，详细说明：{@link #FIELD_SERVICEURL}
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
     * 设置 服务路径，详细说明：{@link #FIELD_SERVICEURL}
     * <P>
     * 等同 {@link #setServiceUrl}
     * @param serviceUrl
     */
    @JsonIgnore
    public PSSubSysSADetail serviceurl(String serviceUrl){
        this.setServiceUrl(serviceUrl);
        return this;
    }

    /**
     * <B>UNIQUETAG</B>&nbsp;唯一标识，指定外部接口实体方法在接口中的唯一标识，需在所属服务接口中具备唯一性
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UNIQUETAG = "uniquetag";

    /**
     * 设置 唯一标识，详细说明：{@link #FIELD_UNIQUETAG}
     * 
     * @param uniqueTag
     * 
     */
    @JsonProperty(FIELD_UNIQUETAG)
    public void setUniqueTag(String uniqueTag){
        this.set(FIELD_UNIQUETAG, uniqueTag);
    }
    
    /**
     * 获取 唯一标识  
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
     * 判断 唯一标识 是否指定值，包括空值
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
     * 重置 唯一标识
     */
    @JsonIgnore
    public void resetUniqueTag(){
        this.reset(FIELD_UNIQUETAG);
    }

    /**
     * 设置 唯一标识，详细说明：{@link #FIELD_UNIQUETAG}
     * <P>
     * 等同 {@link #setUniqueTag}
     * @param uniqueTag
     */
    @JsonIgnore
    public PSSubSysSADetail uniquetag(String uniqueTag){
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
    public PSSubSysSADetail updatedate(String updateDate){
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
    public PSSubSysSADetail updateman(String updateMan){
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
    public PSSubSysSADetail usercat(String userCat){
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
    public PSSubSysSADetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSubSysSADetail usertag(String userTag){
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
    public PSSubSysSADetail usertag2(String userTag2){
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
    public PSSubSysSADetail usertag3(String userTag3){
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
    public PSSubSysSADetail usertag4(String userTag4){
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
    public PSSubSysSADetail validflag(Integer validFlag){
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
    public PSSubSysSADetail validflag(Boolean validFlag){
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
        return this.getPSSubSysSADetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSubSysSADetailId(strValue);
    }

    @JsonIgnore
    public PSSubSysSADetail id(String strValue){
        this.setPSSubSysSADetailId(strValue);
        return this;
    }


    /**
     *  外部系统接口成员参数 成员集合
     */
    public final static String FIELD_PSSUBSYSSADETAILPARAMS = "pssubsyssadetailparams";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSubSysSADetailParam> pssubsyssadetailparams;

    /**
     * 获取 外部系统接口成员参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILPARAMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSubSysSADetailParam> getPSSubSysSADetailParams(){
        return this.pssubsyssadetailparams;
    }

    /**
     * 设置 外部系统接口成员参数 成员集合  
     * @param pssubsyssadetailparams
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILPARAMS)
    public void setPSSubSysSADetailParams(java.util.List<net.ibizsys.psmodel.core.domain.PSSubSysSADetailParam> pssubsyssadetailparams){
        this.pssubsyssadetailparams = pssubsyssadetailparams;
    }

    /**
     * 获取 外部系统接口成员参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSubSysSADetailParam> getPSSubSysSADetailParamsIf(){
        if(this.pssubsyssadetailparams == null){
            this.pssubsyssadetailparams = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSubSysSADetailParam>();          
        }
        return this.pssubsyssadetailparams;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSubSysSADetail){
            PSSubSysSADetail model = (PSSubSysSADetail)iPSModel;
            model.setPSSubSysSADetailParams(this.getPSSubSysSADetailParams());
        }
        super.copyTo(iPSModel);
    }
}
