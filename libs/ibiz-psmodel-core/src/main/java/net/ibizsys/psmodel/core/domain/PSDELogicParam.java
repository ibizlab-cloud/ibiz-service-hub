package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDELOGICPARAM</B>实体逻辑参数 模型传输对象
 * <P>
 * 实体处理逻辑的参数模型，定义在逻辑处理中需要的参数，包括了默认的上下文变量，处理过程中的临时变量等
 */
public class PSDELogicParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDELogicParam(){
    }      

    /**
     * <B>CLONEPARAMFLAG</B>&nbsp;克隆参数传入
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CLONEPARAMFLAG = "cloneparamflag";

    /**
     * 设置 克隆参数传入
     * 
     * @param cloneParamFlag
     * 
     */
    @JsonProperty(FIELD_CLONEPARAMFLAG)
    public void setCloneParamFlag(Integer cloneParamFlag){
        this.set(FIELD_CLONEPARAMFLAG, cloneParamFlag);
    }
    
    /**
     * 获取 克隆参数传入  
     * @return
     */
    @JsonIgnore
    public Integer getCloneParamFlag(){
        Object objValue = this.get(FIELD_CLONEPARAMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 克隆参数传入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCloneParamFlagDirty(){
        if(this.contains(FIELD_CLONEPARAMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 克隆参数传入
     */
    @JsonIgnore
    public void resetCloneParamFlag(){
        this.reset(FIELD_CLONEPARAMFLAG);
    }

    /**
     * 设置 克隆参数传入
     * <P>
     * 等同 {@link #setCloneParamFlag}
     * @param cloneParamFlag
     */
    @JsonIgnore
    public PSDELogicParam cloneparamflag(Integer cloneParamFlag){
        this.setCloneParamFlag(cloneParamFlag);
        return this;
    }

     /**
     * 设置 克隆参数传入
     * <P>
     * 等同 {@link #setCloneParamFlag}
     * @param cloneParamFlag
     */
    @JsonIgnore
    public PSDELogicParam cloneparamflag(Boolean cloneParamFlag){
        if(cloneParamFlag == null){
            this.setCloneParamFlag(null);
        }
        else{
            this.setCloneParamFlag(cloneParamFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDELogicParam createdate(String createDate){
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
    public PSDELogicParam createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTPARAM</B>&nbsp;默认变量，指定是否为处理逻辑的默认变量，未指定时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTPARAM = "defaultparam";

    /**
     * 设置 默认变量，详细说明：{@link #FIELD_DEFAULTPARAM}
     * 
     * @param defaultParam
     * 
     */
    @JsonProperty(FIELD_DEFAULTPARAM)
    public void setDefaultParam(Integer defaultParam){
        this.set(FIELD_DEFAULTPARAM, defaultParam);
    }
    
    /**
     * 获取 默认变量  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultParam(){
        Object objValue = this.get(FIELD_DEFAULTPARAM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认变量 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultParamDirty(){
        if(this.contains(FIELD_DEFAULTPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认变量
     */
    @JsonIgnore
    public void resetDefaultParam(){
        this.reset(FIELD_DEFAULTPARAM);
    }

    /**
     * 设置 默认变量，详细说明：{@link #FIELD_DEFAULTPARAM}
     * <P>
     * 等同 {@link #setDefaultParam}
     * @param defaultParam
     */
    @JsonIgnore
    public PSDELogicParam defaultparam(Integer defaultParam){
        this.setDefaultParam(defaultParam);
        return this;
    }

     /**
     * 设置 默认变量，详细说明：{@link #FIELD_DEFAULTPARAM}
     * <P>
     * 等同 {@link #setDefaultParam}
     * @param defaultParam
     */
    @JsonIgnore
    public PSDELogicParam defaultparam(Boolean defaultParam){
        if(defaultParam == null){
            this.setDefaultParam(null);
        }
        else{
            this.setDefaultParam(defaultParam?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值
     * <P>
     * 字符串：最大长度 1000
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
    public PSDELogicParam defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DEFAULTVALUETYPE</B>&nbsp;默认值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType} 
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
    }
    
    /**
     * 获取 默认值类型  
     * @return
     */
    @JsonIgnore
    public String getDefaultValueType(){
        Object objValue = this.get(FIELD_DEFAULTVALUETYPE);
        if(objValue==null){
            return null;
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
        return false;
    }

    /**
     * 重置 默认值类型
     */
    @JsonIgnore
    public void resetDefaultValueType(){
        this.reset(FIELD_DEFAULTVALUETYPE);
    }

    /**
     * 设置 默认值类型
     * <P>
     * 等同 {@link #setDefaultValueType}
     * @param defaultValueType
     */
    @JsonIgnore
    public PSDELogicParam defaultvaluetype(String defaultValueType){
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
    public PSDELogicParam defaultvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.DEFDefaultValueType defaultValueType){
        if(defaultValueType == null){
            this.setDefaultValueType(null);
        }
        else{
            this.setDefaultValueType(defaultValueType.value);
        }
        return this;
    }

    /**
     * <B>FILETYPE</B>&nbsp;文件类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamFileType} 
     */
    public final static String FIELD_FILETYPE = "filetype";

    /**
     * 设置 文件类型
     * 
     * @param fileType
     * 
     */
    @JsonProperty(FIELD_FILETYPE)
    public void setFileType(String fileType){
        this.set(FIELD_FILETYPE, fileType);
    }
    
    /**
     * 获取 文件类型  
     * @return
     */
    @JsonIgnore
    public String getFileType(){
        Object objValue = this.get(FIELD_FILETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文件类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFileTypeDirty(){
        if(this.contains(FIELD_FILETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文件类型
     */
    @JsonIgnore
    public void resetFileType(){
        this.reset(FIELD_FILETYPE);
    }

    /**
     * 设置 文件类型
     * <P>
     * 等同 {@link #setFileType}
     * @param fileType
     */
    @JsonIgnore
    public PSDELogicParam filetype(String fileType){
        this.setFileType(fileType);
        return this;
    }

     /**
     * 设置 文件类型
     * <P>
     * 等同 {@link #setFileType}
     * @param fileType
     */
    @JsonIgnore
    public PSDELogicParam filetype(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamFileType fileType){
        if(fileType == null){
            this.setFileType(null);
        }
        else{
            this.setFileType(fileType.value);
        }
        return this;
    }

    /**
     * <B>FILEURL</B>&nbsp;文件路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_FILEURL = "fileurl";

    /**
     * 设置 文件路径
     * 
     * @param fileUrl
     * 
     */
    @JsonProperty(FIELD_FILEURL)
    public void setFileUrl(String fileUrl){
        this.set(FIELD_FILEURL, fileUrl);
    }
    
    /**
     * 获取 文件路径  
     * @return
     */
    @JsonIgnore
    public String getFileUrl(){
        Object objValue = this.get(FIELD_FILEURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文件路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFileUrlDirty(){
        if(this.contains(FIELD_FILEURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文件路径
     */
    @JsonIgnore
    public void resetFileUrl(){
        this.reset(FIELD_FILEURL);
    }

    /**
     * 设置 文件路径
     * <P>
     * 等同 {@link #setFileUrl}
     * @param fileUrl
     */
    @JsonIgnore
    public PSDELogicParam fileurl(String fileUrl){
        this.setFileUrl(fileUrl);
        return this;
    }

    /**
     * <B>GLOBALPARAM</B>&nbsp;变量类别，指定全局变量类别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamMode} 
     */
    public final static String FIELD_GLOBALPARAM = "globalparam";

    /**
     * 设置 变量类别，详细说明：{@link #FIELD_GLOBALPARAM}
     * 
     * @param globalParam
     * 
     */
    @JsonProperty(FIELD_GLOBALPARAM)
    public void setGlobalParam(Integer globalParam){
        this.set(FIELD_GLOBALPARAM, globalParam);
    }
    
    /**
     * 获取 变量类别  
     * @return
     */
    @JsonIgnore
    public Integer getGlobalParam(){
        Object objValue = this.get(FIELD_GLOBALPARAM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 变量类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGlobalParamDirty(){
        if(this.contains(FIELD_GLOBALPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 变量类别
     */
    @JsonIgnore
    public void resetGlobalParam(){
        this.reset(FIELD_GLOBALPARAM);
    }

    /**
     * 设置 变量类别，详细说明：{@link #FIELD_GLOBALPARAM}
     * <P>
     * 等同 {@link #setGlobalParam}
     * @param globalParam
     */
    @JsonIgnore
    public PSDELogicParam globalparam(Integer globalParam){
        this.setGlobalParam(globalParam);
        return this;
    }

     /**
     * 设置 变量类别，详细说明：{@link #FIELD_GLOBALPARAM}
     * <P>
     * 等同 {@link #setGlobalParam}
     * @param globalParam
     */
    @JsonIgnore
    public PSDELogicParam globalparam(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamMode globalParam){
        if(globalParam == null){
            this.setGlobalParam(null);
        }
        else{
            this.setGlobalParam(globalParam.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定处理逻辑参数的中文名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDELogicParam logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDELogicParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORIGINENTITYFLAG</B>&nbsp;原始数据对象
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ORIGINENTITYFLAG = "originentityflag";

    /**
     * 设置 原始数据对象
     * 
     * @param originEntityFlag
     * 
     */
    @JsonProperty(FIELD_ORIGINENTITYFLAG)
    public void setOriginEntityFlag(Integer originEntityFlag){
        this.set(FIELD_ORIGINENTITYFLAG, originEntityFlag);
    }
    
    /**
     * 获取 原始数据对象  
     * @return
     */
    @JsonIgnore
    public Integer getOriginEntityFlag(){
        Object objValue = this.get(FIELD_ORIGINENTITYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 原始数据对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOriginEntityFlagDirty(){
        if(this.contains(FIELD_ORIGINENTITYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 原始数据对象
     */
    @JsonIgnore
    public void resetOriginEntityFlag(){
        this.reset(FIELD_ORIGINENTITYFLAG);
    }

    /**
     * 设置 原始数据对象
     * <P>
     * 等同 {@link #setOriginEntityFlag}
     * @param originEntityFlag
     */
    @JsonIgnore
    public PSDELogicParam originentityflag(Integer originEntityFlag){
        this.setOriginEntityFlag(originEntityFlag);
        return this;
    }

     /**
     * 设置 原始数据对象
     * <P>
     * 等同 {@link #setOriginEntityFlag}
     * @param originEntityFlag
     */
    @JsonIgnore
    public PSDELogicParam originentityflag(Boolean originEntityFlag){
        if(originEntityFlag == null){
            this.setOriginEntityFlag(null);
        }
        else{
            this.setOriginEntityFlag(originEntityFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PARAMPSDEFGROUPID</B>&nbsp;参数实体属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
     */
    public final static String FIELD_PARAMPSDEFGROUPID = "parampsdefgroupid";

    /**
     * 设置 参数实体属性组
     * 
     * @param paramPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEFGROUPID)
    public void setParamPSDEFGroupId(String paramPSDEFGroupId){
        this.set(FIELD_PARAMPSDEFGROUPID, paramPSDEFGroupId);
    }
    
    /**
     * 获取 参数实体属性组  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEFGroupId(){
        Object objValue = this.get(FIELD_PARAMPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEFGroupIdDirty(){
        if(this.contains(FIELD_PARAMPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数实体属性组
     */
    @JsonIgnore
    public void resetParamPSDEFGroupId(){
        this.reset(FIELD_PARAMPSDEFGROUPID);
    }

    /**
     * 设置 参数实体属性组
     * <P>
     * 等同 {@link #setParamPSDEFGroupId}
     * @param paramPSDEFGroupId
     */
    @JsonIgnore
    public PSDELogicParam parampsdefgroupid(String paramPSDEFGroupId){
        this.setParamPSDEFGroupId(paramPSDEFGroupId);
        return this;
    }

    /**
     * 设置 参数实体属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setParamPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDELogicParam parampsdefgroupid(PSDEFGroup pSDEFGroup){
        if(pSDEFGroup == null){
            this.setParamPSDEFGroupId(null);
            this.setParamPSDEFGroupName(null);
        }
        else{
            this.setParamPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setParamPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>PARAMPSDEFGROUPNAME</B>&nbsp;参数实体属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PARAMPSDEFGROUPID}
     */
    public final static String FIELD_PARAMPSDEFGROUPNAME = "parampsdefgroupname";

    /**
     * 设置 参数实体属性组
     * 
     * @param paramPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEFGROUPNAME)
    public void setParamPSDEFGroupName(String paramPSDEFGroupName){
        this.set(FIELD_PARAMPSDEFGROUPNAME, paramPSDEFGroupName);
    }
    
    /**
     * 获取 参数实体属性组  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEFGroupName(){
        Object objValue = this.get(FIELD_PARAMPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEFGroupNameDirty(){
        if(this.contains(FIELD_PARAMPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数实体属性组
     */
    @JsonIgnore
    public void resetParamPSDEFGroupName(){
        this.reset(FIELD_PARAMPSDEFGROUPNAME);
    }

    /**
     * 设置 参数实体属性组
     * <P>
     * 等同 {@link #setParamPSDEFGroupName}
     * @param paramPSDEFGroupName
     */
    @JsonIgnore
    public PSDELogicParam parampsdefgroupname(String paramPSDEFGroupName){
        this.setParamPSDEFGroupName(paramPSDEFGroupName);
        return this;
    }

    /**
     * <B>PARAMPSDEID</B>&nbsp;参数实体，指定参数所对应的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PARAMPSDEID = "parampsdeid";

    /**
     * 设置 参数实体，详细说明：{@link #FIELD_PARAMPSDEID}
     * 
     * @param paramPSDEId
     * 
     */
    @JsonProperty(FIELD_PARAMPSDEID)
    public void setParamPSDEId(String paramPSDEId){
        this.set(FIELD_PARAMPSDEID, paramPSDEId);
    }
    
    /**
     * 获取 参数实体  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEId(){
        Object objValue = this.get(FIELD_PARAMPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDEIdDirty(){
        if(this.contains(FIELD_PARAMPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数实体
     */
    @JsonIgnore
    public void resetParamPSDEId(){
        this.reset(FIELD_PARAMPSDEID);
    }

    /**
     * 设置 参数实体，详细说明：{@link #FIELD_PARAMPSDEID}
     * <P>
     * 等同 {@link #setParamPSDEId}
     * @param paramPSDEId
     */
    @JsonIgnore
    public PSDELogicParam parampsdeid(String paramPSDEId){
        this.setParamPSDEId(paramPSDEId);
        return this;
    }

    /**
     * 设置 参数实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setParamPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDELogicParam parampsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setParamPSDEId(null);
            this.setParamPSDEName(null);
        }
        else{
            this.setParamPSDEId(pSDataEntity.getPSDataEntityId());
            this.setParamPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PARAMPSDENAME</B>&nbsp;参数实体类型，指定参数所对应的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PARAMPSDEID}
     */
    public final static String FIELD_PARAMPSDENAME = "parampsdename";

    /**
     * 设置 参数实体类型，详细说明：{@link #FIELD_PARAMPSDENAME}
     * 
     * @param paramPSDEName
     * 
     */
    @JsonProperty(FIELD_PARAMPSDENAME)
    public void setParamPSDEName(String paramPSDEName){
        this.set(FIELD_PARAMPSDENAME, paramPSDEName);
    }
    
    /**
     * 获取 参数实体类型  
     * @return
     */
    @JsonIgnore
    public String getParamPSDEName(){
        Object objValue = this.get(FIELD_PARAMPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数实体类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamPSDENameDirty(){
        if(this.contains(FIELD_PARAMPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数实体类型
     */
    @JsonIgnore
    public void resetParamPSDEName(){
        this.reset(FIELD_PARAMPSDENAME);
    }

    /**
     * 设置 参数实体类型，详细说明：{@link #FIELD_PARAMPSDENAME}
     * <P>
     * 等同 {@link #setParamPSDEName}
     * @param paramPSDEName
     */
    @JsonIgnore
    public PSDELogicParam parampsdename(String paramPSDEName){
        this.setParamPSDEName(paramPSDEName);
        return this;
    }

    /**
     * <B>PARAMS</B>&nbsp;动态参数
     */
    public final static String FIELD_PARAMS = "params";

    /**
     * 设置 动态参数
     * 
     * @param params
     * 
     */
    @JsonProperty(FIELD_PARAMS)
    public void setParams(String params){
        this.set(FIELD_PARAMS, params);
    }
    
    /**
     * 获取 动态参数  
     * @return
     */
    @JsonIgnore
    public String getParams(){
        Object objValue = this.get(FIELD_PARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamsDirty(){
        if(this.contains(FIELD_PARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态参数
     */
    @JsonIgnore
    public void resetParams(){
        this.reset(FIELD_PARAMS);
    }

    /**
     * 设置 动态参数
     * <P>
     * 等同 {@link #setParams}
     * @param params
     */
    @JsonIgnore
    public PSDELogicParam params(String params){
        this.setParams(params);
        return this;
    }

    /**
     * <B>PARAMTAG</B>&nbsp;参数标记
     * <P>
     * 字符串：最大长度 100
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
    public PSDELogicParam paramtag(String paramTag){
        this.setParamTag(paramTag);
        return this;
    }

    /**
     * <B>PARAMTAG2</B>&nbsp;参数标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDELogicParam paramtag2(String paramTag2){
        this.setParamTag2(paramTag2);
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体处理逻辑，指定处理参数所在的处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDELogicParam psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDELogicParam psdelogicid(PSDELogic pSDELogic){
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
     * <B>PSDELOGICNAME</B>&nbsp;实体处理逻辑，指定处理参数所在的处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体处理逻辑  
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
     * 判断 实体处理逻辑 是否指定值，包括空值
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
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDELogicParam psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDELOGICPARAMID</B>&nbsp;实体逻辑参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELOGICPARAMID = "psdelogicparamid";

    /**
     * 设置 实体逻辑参数标识
     * 
     * @param pSDELogicParamId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICPARAMID)
    public void setPSDELogicParamId(String pSDELogicParamId){
        this.set(FIELD_PSDELOGICPARAMID, pSDELogicParamId);
    }
    
    /**
     * 获取 实体逻辑参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicParamId(){
        Object objValue = this.get(FIELD_PSDELOGICPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体逻辑参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicParamIdDirty(){
        if(this.contains(FIELD_PSDELOGICPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑参数标识
     */
    @JsonIgnore
    public void resetPSDELogicParamId(){
        this.reset(FIELD_PSDELOGICPARAMID);
    }

    /**
     * 设置 实体逻辑参数标识
     * <P>
     * 等同 {@link #setPSDELogicParamId}
     * @param pSDELogicParamId
     */
    @JsonIgnore
    public PSDELogicParam psdelogicparamid(String pSDELogicParamId){
        this.setPSDELogicParamId(pSDELogicParamId);
        return this;
    }

    /**
     * <B>PSDELOGICPARAMNAME</B>&nbsp;参数标识，指定处理逻辑参数标识，需要在所在的处理逻辑中具有唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDELOGICPARAMNAME = "psdelogicparamname";

    /**
     * 设置 参数标识，详细说明：{@link #FIELD_PSDELOGICPARAMNAME}
     * 
     * @param pSDELogicParamName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICPARAMNAME)
    public void setPSDELogicParamName(String pSDELogicParamName){
        this.set(FIELD_PSDELOGICPARAMNAME, pSDELogicParamName);
    }
    
    /**
     * 获取 参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicParamName(){
        Object objValue = this.get(FIELD_PSDELOGICPARAMNAME);
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
    public boolean isPSDELogicParamNameDirty(){
        if(this.contains(FIELD_PSDELOGICPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标识
     */
    @JsonIgnore
    public void resetPSDELogicParamName(){
        this.reset(FIELD_PSDELOGICPARAMNAME);
    }

    /**
     * 设置 参数标识，详细说明：{@link #FIELD_PSDELOGICPARAMNAME}
     * <P>
     * 等同 {@link #setPSDELogicParamName}
     * @param pSDELogicParamName
     */
    @JsonIgnore
    public PSDELogicParam psdelogicparamname(String pSDELogicParamName){
        this.setPSDELogicParamName(pSDELogicParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDELogicParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDELogicParamName(strName);
    }

    @JsonIgnore
    public PSDELogicParam name(String strName){
        this.setPSDELogicParamName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDELogicParam pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDELogicParam pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统动态模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDELogicParam pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDELogicParam pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDELogicParam pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDELogicParam pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysResource} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceId
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCEID)
    public void setPSSysResourceId(String pSSysResourceId){
        this.set(FIELD_PSSYSRESOURCEID, pSSysResourceId);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceId(){
        Object objValue = this.get(FIELD_PSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceIdDirty(){
        if(this.contains(FIELD_PSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceId(){
        this.reset(FIELD_PSSYSRESOURCEID);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSDELogicParam pssysresourceid(String pSSysResourceId){
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    /**
     * 设置 系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSDELogicParam pssysresourceid(PSSysResource pSSysResource){
        if(pSSysResource == null){
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        }
        else{
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceName
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCENAME)
    public void setPSSysResourceName(String pSSysResourceName){
        this.set(FIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceName(){
        Object objValue = this.get(FIELD_PSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceNameDirty(){
        if(this.contains(FIELD_PSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceName(){
        this.reset(FIELD_PSSYSRESOURCENAME);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSDELogicParam pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件
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
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDELogicParam pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDELogicParam pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件
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
     * 设置 后台扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDELogicParam pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>REFFIELDNAME</B>&nbsp;参数属性名称
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_REFFIELDNAME = "reffieldname";

    /**
     * 设置 参数属性名称
     * 
     * @param refFieldName
     * 
     */
    @JsonProperty(FIELD_REFFIELDNAME)
    public void setRefFieldName(String refFieldName){
        this.set(FIELD_REFFIELDNAME, refFieldName);
    }
    
    /**
     * 获取 参数属性名称  
     * @return
     */
    @JsonIgnore
    public String getRefFieldName(){
        Object objValue = this.get(FIELD_REFFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefFieldNameDirty(){
        if(this.contains(FIELD_REFFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数属性名称
     */
    @JsonIgnore
    public void resetRefFieldName(){
        this.reset(FIELD_REFFIELDNAME);
    }

    /**
     * 设置 参数属性名称
     * <P>
     * 等同 {@link #setRefFieldName}
     * @param refFieldName
     */
    @JsonIgnore
    public PSDELogicParam reffieldname(String refFieldName){
        this.setRefFieldName(refFieldName);
        return this;
    }

    /**
     * <B>REFPARAMNAME</B>&nbsp;引用变量名称
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_REFPARAMNAME = "refparamname";

    /**
     * 设置 引用变量名称
     * 
     * @param refParamName
     * 
     */
    @JsonProperty(FIELD_REFPARAMNAME)
    public void setRefParamName(String refParamName){
        this.set(FIELD_REFPARAMNAME, refParamName);
    }
    
    /**
     * 获取 引用变量名称  
     * @return
     */
    @JsonIgnore
    public String getRefParamName(){
        Object objValue = this.get(FIELD_REFPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用变量名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefParamNameDirty(){
        if(this.contains(FIELD_REFPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用变量名称
     */
    @JsonIgnore
    public void resetRefParamName(){
        this.reset(FIELD_REFPARAMNAME);
    }

    /**
     * 设置 引用变量名称
     * <P>
     * 等同 {@link #setRefParamName}
     * @param refParamName
     */
    @JsonIgnore
    public PSDELogicParam refparamname(String refParamName){
        this.setRefParamName(refParamName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型
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
    public PSDELogicParam stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
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
    public PSDELogicParam updatedate(String updateDate){
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
    public PSDELogicParam updateman(String updateMan){
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
    public PSDELogicParam usercat(String userCat){
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
    public PSDELogicParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;用户参数
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 用户参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 用户参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 用户参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDELogicParam userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDELogicParam usertag(String userTag){
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
    public PSDELogicParam usertag2(String userTag2){
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
    public PSDELogicParam usertag3(String userTag3){
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
    public PSDELogicParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDELogicParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDELogicParamId(strValue);
    }

    @JsonIgnore
    public PSDELogicParam id(String strValue){
        this.setPSDELogicParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDELogicParam){
            PSDELogicParam model = (PSDELogicParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
