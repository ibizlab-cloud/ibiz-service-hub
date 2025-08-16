package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDESERVICEAPI</B>实体服务接口 模型传输对象
 * <P>
 * 实体服务接口模型，定义实体在系统服务接口提供的能力，包括了认证模式、行为或数据集的默认提供方式等，也包含了实体服务接口方法等成员模型
 */
public class PSDEServiceAPI extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEServiceAPI(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACCCTRLARCH</B>&nbsp;访问控制体系，指定实体服务接口的访问控制体系，未定义时使用实体设定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AccCtrlArch} 
     */
    public final static String FIELD_ACCCTRLARCH = "accctrlarch";

    /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * 
     * @param accCtrlArch
     * 
     */
    @JsonProperty(FIELD_ACCCTRLARCH)
    public void setAccCtrlArch(Integer accCtrlArch){
        this.set(FIELD_ACCCTRLARCH, accCtrlArch);
    }
    
    /**
     * 获取 访问控制体系  
     * @return
     */
    @JsonIgnore
    public Integer getAccCtrlArch(){
        Object objValue = this.get(FIELD_ACCCTRLARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 访问控制体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccCtrlArchDirty(){
        if(this.contains(FIELD_ACCCTRLARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问控制体系
     */
    @JsonIgnore
    public void resetAccCtrlArch(){
        this.reset(FIELD_ACCCTRLARCH);
    }

    /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * <P>
     * 等同 {@link #setAccCtrlArch}
     * @param accCtrlArch
     */
    @JsonIgnore
    public PSDEServiceAPI accctrlarch(Integer accCtrlArch){
        this.setAccCtrlArch(accCtrlArch);
        return this;
    }

     /**
     * 设置 访问控制体系，详细说明：{@link #FIELD_ACCCTRLARCH}
     * <P>
     * 等同 {@link #setAccCtrlArch}
     * @param accCtrlArch
     */
    @JsonIgnore
    public PSDEServiceAPI accctrlarch(net.ibizsys.psmodel.core.util.PSModelEnums.AccCtrlArch accCtrlArch){
        if(accCtrlArch == null){
            this.setAccCtrlArch(null);
        }
        else{
            this.setAccCtrlArch(accCtrlArch.value);
        }
        return this;
    }

    /**
     * <B>APITAG</B>&nbsp;API标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_APITAG = "apitag";

    /**
     * 设置 API标记
     * 
     * @param aPITag
     * 
     */
    @JsonProperty(FIELD_APITAG)
    public void setAPITag(String aPITag){
        this.set(FIELD_APITAG, aPITag);
    }
    
    /**
     * 获取 API标记  
     * @return
     */
    @JsonIgnore
    public String getAPITag(){
        Object objValue = this.get(FIELD_APITAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 API标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPITagDirty(){
        if(this.contains(FIELD_APITAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 API标记
     */
    @JsonIgnore
    public void resetAPITag(){
        this.reset(FIELD_APITAG);
    }

    /**
     * 设置 API标记
     * <P>
     * 等同 {@link #setAPITag}
     * @param aPITag
     */
    @JsonIgnore
    public PSDEServiceAPI apitag(String aPITag){
        this.setAPITag(aPITag);
        return this;
    }

    /**
     * <B>APITAG2</B>&nbsp;API标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_APITAG2 = "apitag2";

    /**
     * 设置 API标记2
     * 
     * @param aPITag2
     * 
     */
    @JsonProperty(FIELD_APITAG2)
    public void setAPITag2(String aPITag2){
        this.set(FIELD_APITAG2, aPITag2);
    }
    
    /**
     * 获取 API标记2  
     * @return
     */
    @JsonIgnore
    public String getAPITag2(){
        Object objValue = this.get(FIELD_APITAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 API标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAPITag2Dirty(){
        if(this.contains(FIELD_APITAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 API标记2
     */
    @JsonIgnore
    public void resetAPITag2(){
        this.reset(FIELD_APITAG2);
    }

    /**
     * 设置 API标记2
     * <P>
     * 等同 {@link #setAPITag2}
     * @param aPITag2
     */
    @JsonIgnore
    public PSDEServiceAPI apitag2(String aPITag2){
        this.setAPITag2(aPITag2);
        return this;
    }

    /**
     * <B>BASECLSPARAMS</B>&nbsp;发布参数
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_BASECLSPARAMS = "baseclsparams";

    /**
     * 设置 发布参数
     * 
     * @param baseClsParams
     * 
     */
    @JsonProperty(FIELD_BASECLSPARAMS)
    public void setBaseClsParams(String baseClsParams){
        this.set(FIELD_BASECLSPARAMS, baseClsParams);
    }
    
    /**
     * 获取 发布参数  
     * @return
     */
    @JsonIgnore
    public String getBaseClsParams(){
        Object objValue = this.get(FIELD_BASECLSPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 发布参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBaseClsParamsDirty(){
        if(this.contains(FIELD_BASECLSPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 发布参数
     */
    @JsonIgnore
    public void resetBaseClsParams(){
        this.reset(FIELD_BASECLSPARAMS);
    }

    /**
     * 设置 发布参数
     * <P>
     * 等同 {@link #setBaseClsParams}
     * @param baseClsParams
     */
    @JsonIgnore
    public PSDEServiceAPI baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体服务接口的代码标识，需要在所在的系统服务接口中具有唯一性
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
    public PSDEServiceAPI codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码名称2
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码名称2
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码名称2  
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
     * 判断 代码名称2 是否指定值，包括空值
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
     * 重置 代码名称2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码名称2
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSDEServiceAPI codename2(String codeName2){
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
    public PSDEServiceAPI createdate(String createDate){
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
    public PSDEServiceAPI createman(String createMan){
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
    public PSDEServiceAPI customcode(String customCode){
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
    public PSDEServiceAPI custommode(Integer customMode){
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
    public PSDEServiceAPI custommode(net.ibizsys.psmodel.core.util.PSModelEnums.ScriptMode2 customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode.value);
        }
        return this;
    }

    /**
     * <B>DATAACCMODE</B>&nbsp;访问控制方式，指定实体服务接口的访问控制方式，未定义时使用实体设定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAccCtrlMode} 
     */
    public final static String FIELD_DATAACCMODE = "dataaccmode";

    /**
     * 设置 访问控制方式，详细说明：{@link #FIELD_DATAACCMODE}
     * 
     * @param dataAccMode
     * 
     */
    @JsonProperty(FIELD_DATAACCMODE)
    public void setDataAccMode(Integer dataAccMode){
        this.set(FIELD_DATAACCMODE, dataAccMode);
    }
    
    /**
     * 获取 访问控制方式  
     * @return
     */
    @JsonIgnore
    public Integer getDataAccMode(){
        Object objValue = this.get(FIELD_DATAACCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 访问控制方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataAccModeDirty(){
        if(this.contains(FIELD_DATAACCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问控制方式
     */
    @JsonIgnore
    public void resetDataAccMode(){
        this.reset(FIELD_DATAACCMODE);
    }

    /**
     * 设置 访问控制方式，详细说明：{@link #FIELD_DATAACCMODE}
     * <P>
     * 等同 {@link #setDataAccMode}
     * @param dataAccMode
     */
    @JsonIgnore
    public PSDEServiceAPI dataaccmode(Integer dataAccMode){
        this.setDataAccMode(dataAccMode);
        return this;
    }

     /**
     * 设置 访问控制方式，详细说明：{@link #FIELD_DATAACCMODE}
     * <P>
     * 等同 {@link #setDataAccMode}
     * @param dataAccMode
     */
    @JsonIgnore
    public PSDEServiceAPI dataaccmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAccCtrlMode dataAccMode){
        if(dataAccMode == null){
            this.setDataAccMode(null);
        }
        else{
            this.setDataAccMode(dataAccMode.value);
        }
        return this;
    }

    /**
     * <B>DEFGROUPMODE</B>&nbsp;属性组模式，实体服务接口指定属性组时同时指定属性组的使用模式，未定义时为【替换实体属性】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEDEFGroupMode} 
     */
    public final static String FIELD_DEFGROUPMODE = "defgroupmode";

    /**
     * 设置 属性组模式，详细说明：{@link #FIELD_DEFGROUPMODE}
     * 
     * @param dEFGroupMode
     * 
     */
    @JsonProperty(FIELD_DEFGROUPMODE)
    public void setDEFGroupMode(String dEFGroupMode){
        this.set(FIELD_DEFGROUPMODE, dEFGroupMode);
    }
    
    /**
     * 获取 属性组模式  
     * @return
     */
    @JsonIgnore
    public String getDEFGroupMode(){
        Object objValue = this.get(FIELD_DEFGROUPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性组模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEFGroupModeDirty(){
        if(this.contains(FIELD_DEFGROUPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性组模式
     */
    @JsonIgnore
    public void resetDEFGroupMode(){
        this.reset(FIELD_DEFGROUPMODE);
    }

    /**
     * 设置 属性组模式，详细说明：{@link #FIELD_DEFGROUPMODE}
     * <P>
     * 等同 {@link #setDEFGroupMode}
     * @param dEFGroupMode
     */
    @JsonIgnore
    public PSDEServiceAPI defgroupmode(String dEFGroupMode){
        this.setDEFGroupMode(dEFGroupMode);
        return this;
    }

     /**
     * 设置 属性组模式，详细说明：{@link #FIELD_DEFGROUPMODE}
     * <P>
     * 等同 {@link #setDEFGroupMode}
     * @param dEFGroupMode
     */
    @JsonIgnore
    public PSDEServiceAPI defgroupmode(net.ibizsys.psmodel.core.util.PSModelEnums.SADEDEFGroupMode dEFGroupMode){
        if(dEFGroupMode == null){
            this.setDEFGroupMode(null);
        }
        else{
            this.setDEFGroupMode(dEFGroupMode.value);
        }
        return this;
    }

    /**
     * <B>DELOGICNAME</B>&nbsp;实体逻辑名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_DELOGICNAME = "delogicname";

    /**
     * 设置 实体逻辑名称
     * 
     * @param dELogicName
     * 
     */
    @JsonProperty(FIELD_DELOGICNAME)
    public void setDELogicName(String dELogicName){
        this.set(FIELD_DELOGICNAME, dELogicName);
    }
    
    /**
     * 获取 实体逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getDELogicName(){
        Object objValue = this.get(FIELD_DELOGICNAME);
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
    public boolean isDELogicNameDirty(){
        if(this.contains(FIELD_DELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体逻辑名称
     */
    @JsonIgnore
    public void resetDELogicName(){
        this.reset(FIELD_DELOGICNAME);
    }

    /**
     * 设置 实体逻辑名称
     * <P>
     * 等同 {@link #setDELogicName}
     * @param dELogicName
     */
    @JsonIgnore
    public PSDEServiceAPI delogicname(String dELogicName){
        this.setDELogicName(dELogicName);
        return this;
    }

    /**
     * <B>ENABLEDATAEXPORT</B>&nbsp;支持数据导出
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDATAEXPORT = "enabledataexport";

    /**
     * 设置 支持数据导出
     * 
     * @param enableDataExport
     * 
     */
    @JsonProperty(FIELD_ENABLEDATAEXPORT)
    public void setEnableDataExport(Integer enableDataExport){
        this.set(FIELD_ENABLEDATAEXPORT, enableDataExport);
    }
    
    /**
     * 获取 支持数据导出  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDataExport(){
        Object objValue = this.get(FIELD_ENABLEDATAEXPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDataExportDirty(){
        if(this.contains(FIELD_ENABLEDATAEXPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持数据导出
     */
    @JsonIgnore
    public void resetEnableDataExport(){
        this.reset(FIELD_ENABLEDATAEXPORT);
    }

    /**
     * 设置 支持数据导出
     * <P>
     * 等同 {@link #setEnableDataExport}
     * @param enableDataExport
     */
    @JsonIgnore
    public PSDEServiceAPI enabledataexport(Integer enableDataExport){
        this.setEnableDataExport(enableDataExport);
        return this;
    }

     /**
     * 设置 支持数据导出
     * <P>
     * 等同 {@link #setEnableDataExport}
     * @param enableDataExport
     */
    @JsonIgnore
    public PSDEServiceAPI enabledataexport(Boolean enableDataExport){
        if(enableDataExport == null){
            this.setEnableDataExport(null);
        }
        else{
            this.setEnableDataExport(enableDataExport?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDATAIMPORT</B>&nbsp;支持数据导入
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDATAIMPORT = "enabledataimport";

    /**
     * 设置 支持数据导入
     * 
     * @param enableDataImport
     * 
     */
    @JsonProperty(FIELD_ENABLEDATAIMPORT)
    public void setEnableDataImport(Integer enableDataImport){
        this.set(FIELD_ENABLEDATAIMPORT, enableDataImport);
    }
    
    /**
     * 获取 支持数据导入  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDataImport(){
        Object objValue = this.get(FIELD_ENABLEDATAIMPORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDataImportDirty(){
        if(this.contains(FIELD_ENABLEDATAIMPORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持数据导入
     */
    @JsonIgnore
    public void resetEnableDataImport(){
        this.reset(FIELD_ENABLEDATAIMPORT);
    }

    /**
     * 设置 支持数据导入
     * <P>
     * 等同 {@link #setEnableDataImport}
     * @param enableDataImport
     */
    @JsonIgnore
    public PSDEServiceAPI enabledataimport(Integer enableDataImport){
        this.setEnableDataImport(enableDataImport);
        return this;
    }

     /**
     * 设置 支持数据导入
     * <P>
     * 等同 {@link #setEnableDataImport}
     * @param enableDataImport
     */
    @JsonIgnore
    public PSDEServiceAPI enabledataimport(Boolean enableDataImport){
        if(enableDataImport == null){
            this.setEnableDataImport(null);
        }
        else{
            this.setEnableDataImport(enableDataImport?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEACTION</B>&nbsp;行为默认支持，指定实体服务接口是否默认支持实体行为，未定义时使用实体的默认配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEACTION = "enabledeaction";

    /**
     * 设置 行为默认支持，详细说明：{@link #FIELD_ENABLEDEACTION}
     * 
     * @param enableDEAction
     * 
     */
    @JsonProperty(FIELD_ENABLEDEACTION)
    public void setEnableDEAction(Integer enableDEAction){
        this.set(FIELD_ENABLEDEACTION, enableDEAction);
    }
    
    /**
     * 获取 行为默认支持  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDEAction(){
        Object objValue = this.get(FIELD_ENABLEDEACTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为默认支持 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDEActionDirty(){
        if(this.contains(FIELD_ENABLEDEACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为默认支持
     */
    @JsonIgnore
    public void resetEnableDEAction(){
        this.reset(FIELD_ENABLEDEACTION);
    }

    /**
     * 设置 行为默认支持，详细说明：{@link #FIELD_ENABLEDEACTION}
     * <P>
     * 等同 {@link #setEnableDEAction}
     * @param enableDEAction
     */
    @JsonIgnore
    public PSDEServiceAPI enabledeaction(Integer enableDEAction){
        this.setEnableDEAction(enableDEAction);
        return this;
    }

     /**
     * 设置 行为默认支持，详细说明：{@link #FIELD_ENABLEDEACTION}
     * <P>
     * 等同 {@link #setEnableDEAction}
     * @param enableDEAction
     */
    @JsonIgnore
    public PSDEServiceAPI enabledeaction(Boolean enableDEAction){
        if(enableDEAction == null){
            this.setEnableDEAction(null);
        }
        else{
            this.setEnableDEAction(enableDEAction?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEDATASET</B>&nbsp;结果集默认支持，指定实体服务接口是否默认支持实体数据集合，未定义时使用实体的默认配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEDATASET = "enablededataset";

    /**
     * 设置 结果集默认支持，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * 
     * @param enableDEDataSet
     * 
     */
    @JsonProperty(FIELD_ENABLEDEDATASET)
    public void setEnableDEDataSet(Integer enableDEDataSet){
        this.set(FIELD_ENABLEDEDATASET, enableDEDataSet);
    }
    
    /**
     * 获取 结果集默认支持  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDEDataSet(){
        Object objValue = this.get(FIELD_ENABLEDEDATASET);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 结果集默认支持 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDEDataSetDirty(){
        if(this.contains(FIELD_ENABLEDEDATASET)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果集默认支持
     */
    @JsonIgnore
    public void resetEnableDEDataSet(){
        this.reset(FIELD_ENABLEDEDATASET);
    }

    /**
     * 设置 结果集默认支持，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * <P>
     * 等同 {@link #setEnableDEDataSet}
     * @param enableDEDataSet
     */
    @JsonIgnore
    public PSDEServiceAPI enablededataset(Integer enableDEDataSet){
        this.setEnableDEDataSet(enableDEDataSet);
        return this;
    }

     /**
     * 设置 结果集默认支持，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * <P>
     * 等同 {@link #setEnableDEDataSet}
     * @param enableDEDataSet
     */
    @JsonIgnore
    public PSDEServiceAPI enablededataset(Boolean enableDEDataSet){
        if(enableDEDataSet == null){
            this.setEnableDEDataSet(null);
        }
        else{
            this.setEnableDEDataSet(enableDEDataSet?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESELECT</B>&nbsp;简单查询默认支持，指定实体服务接口是否默认支持简单查询，未定义时使用实体的默认配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESELECT = "enableselect";

    /**
     * 设置 简单查询默认支持，详细说明：{@link #FIELD_ENABLESELECT}
     * 
     * @param enableSelect
     * 
     */
    @JsonProperty(FIELD_ENABLESELECT)
    public void setEnableSelect(Integer enableSelect){
        this.set(FIELD_ENABLESELECT, enableSelect);
    }
    
    /**
     * 获取 简单查询默认支持  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSelect(){
        Object objValue = this.get(FIELD_ENABLESELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 简单查询默认支持 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSelectDirty(){
        if(this.contains(FIELD_ENABLESELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 简单查询默认支持
     */
    @JsonIgnore
    public void resetEnableSelect(){
        this.reset(FIELD_ENABLESELECT);
    }

    /**
     * 设置 简单查询默认支持，详细说明：{@link #FIELD_ENABLESELECT}
     * <P>
     * 等同 {@link #setEnableSelect}
     * @param enableSelect
     */
    @JsonIgnore
    public PSDEServiceAPI enableselect(Integer enableSelect){
        this.setEnableSelect(enableSelect);
        return this;
    }

     /**
     * 设置 简单查询默认支持，详细说明：{@link #FIELD_ENABLESELECT}
     * <P>
     * 等同 {@link #setEnableSelect}
     * @param enableSelect
     */
    @JsonIgnore
    public PSDEServiceAPI enableselect(Boolean enableSelect){
        if(enableSelect == null){
            this.setEnableSelect(null);
        }
        else{
            this.setEnableSelect(enableSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENATEMPDATA</B>&nbsp;启用临时数据，实体支持后台临时数据模式时，指定实体服务接口是否支持临时数据模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENATEMPDATA = "enatempdata";

    /**
     * 设置 启用临时数据，详细说明：{@link #FIELD_ENATEMPDATA}
     * 
     * @param enaTempData
     * 
     */
    @JsonProperty(FIELD_ENATEMPDATA)
    public void setEnaTempData(Integer enaTempData){
        this.set(FIELD_ENATEMPDATA, enaTempData);
    }
    
    /**
     * 获取 启用临时数据  
     * @return
     */
    @JsonIgnore
    public Integer getEnaTempData(){
        Object objValue = this.get(FIELD_ENATEMPDATA);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用临时数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnaTempDataDirty(){
        if(this.contains(FIELD_ENATEMPDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用临时数据
     */
    @JsonIgnore
    public void resetEnaTempData(){
        this.reset(FIELD_ENATEMPDATA);
    }

    /**
     * 设置 启用临时数据，详细说明：{@link #FIELD_ENATEMPDATA}
     * <P>
     * 等同 {@link #setEnaTempData}
     * @param enaTempData
     */
    @JsonIgnore
    public PSDEServiceAPI enatempdata(Integer enaTempData){
        this.setEnaTempData(enaTempData);
        return this;
    }

     /**
     * 设置 启用临时数据，详细说明：{@link #FIELD_ENATEMPDATA}
     * <P>
     * 等同 {@link #setEnaTempData}
     * @param enaTempData
     */
    @JsonIgnore
    public PSDEServiceAPI enatempdata(Boolean enaTempData){
        if(enaTempData == null){
            this.setEnaTempData(null);
        }
        else{
            this.setEnaTempData(enaTempData?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;逻辑名称语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 逻辑名称语言资源
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
     * 设置 逻辑名称语言资源
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSDEServiceAPI lnpslanresid(String lNPSLanResId){
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
    public PSDEServiceAPI lnpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>LNPSLANRESNAME</B>&nbsp;逻辑名称语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 逻辑名称语言资源
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
     * 设置 逻辑名称语言资源
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSDEServiceAPI lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定实体服务接口的逻辑名称，未定义时使用实体的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
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
     * 判断 逻辑名称 是否指定值，包括空值
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
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEServiceAPI logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORFLAG</B>&nbsp;接口模式，指定实体服务接口的模式，未定义时为【主接口】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEMode} 
     */
    public final static String FIELD_MAJORFLAG = "majorflag";

    /**
     * 设置 接口模式，详细说明：{@link #FIELD_MAJORFLAG}
     * 
     * @param majorFlag
     * 
     */
    @JsonProperty(FIELD_MAJORFLAG)
    public void setMajorFlag(Integer majorFlag){
        this.set(FIELD_MAJORFLAG, majorFlag);
    }
    
    /**
     * 获取 接口模式  
     * @return
     */
    @JsonIgnore
    public Integer getMajorFlag(){
        Object objValue = this.get(FIELD_MAJORFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 接口模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorFlagDirty(){
        if(this.contains(FIELD_MAJORFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 接口模式
     */
    @JsonIgnore
    public void resetMajorFlag(){
        this.reset(FIELD_MAJORFLAG);
    }

    /**
     * 设置 接口模式，详细说明：{@link #FIELD_MAJORFLAG}
     * <P>
     * 等同 {@link #setMajorFlag}
     * @param majorFlag
     */
    @JsonIgnore
    public PSDEServiceAPI majorflag(Integer majorFlag){
        this.setMajorFlag(majorFlag);
        return this;
    }

     /**
     * 设置 接口模式，详细说明：{@link #FIELD_MAJORFLAG}
     * <P>
     * 等同 {@link #setMajorFlag}
     * @param majorFlag
     */
    @JsonIgnore
    public PSDEServiceAPI majorflag(net.ibizsys.psmodel.core.util.PSModelEnums.SADEMode majorFlag){
        if(majorFlag == null){
            this.setMajorFlag(null);
        }
        else{
            this.setMajorFlag(majorFlag.value);
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
    public PSDEServiceAPI memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OUTPSSYSTRANSLATORID</B>&nbsp;输出转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_OUTPSSYSTRANSLATORID = "outpssystranslatorid";

    /**
     * 设置 输出转换器
     * 
     * @param outPSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSTRANSLATORID)
    public void setOutPSSysTranslatorId(String outPSSysTranslatorId){
        this.set(FIELD_OUTPSSYSTRANSLATORID, outPSSysTranslatorId);
    }
    
    /**
     * 获取 输出转换器  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysTranslatorId(){
        Object objValue = this.get(FIELD_OUTPSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_OUTPSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出转换器
     */
    @JsonIgnore
    public void resetOutPSSysTranslatorId(){
        this.reset(FIELD_OUTPSSYSTRANSLATORID);
    }

    /**
     * 设置 输出转换器
     * <P>
     * 等同 {@link #setOutPSSysTranslatorId}
     * @param outPSSysTranslatorId
     */
    @JsonIgnore
    public PSDEServiceAPI outpssystranslatorid(String outPSSysTranslatorId){
        this.setOutPSSysTranslatorId(outPSSysTranslatorId);
        return this;
    }

    /**
     * 设置 输出转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOutPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEServiceAPI outpssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setOutPSSysTranslatorId(null);
            this.setOutPSSysTranslatorName(null);
        }
        else{
            this.setOutPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setOutPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>OUTPSSYSTRANSLATORNAME</B>&nbsp;输出转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OUTPSSYSTRANSLATORID}
     */
    public final static String FIELD_OUTPSSYSTRANSLATORNAME = "outpssystranslatorname";

    /**
     * 设置 输出转换器
     * 
     * @param outPSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_OUTPSSYSTRANSLATORNAME)
    public void setOutPSSysTranslatorName(String outPSSysTranslatorName){
        this.set(FIELD_OUTPSSYSTRANSLATORNAME, outPSSysTranslatorName);
    }
    
    /**
     * 获取 输出转换器  
     * @return
     */
    @JsonIgnore
    public String getOutPSSysTranslatorName(){
        Object objValue = this.get(FIELD_OUTPSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOutPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_OUTPSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出转换器
     */
    @JsonIgnore
    public void resetOutPSSysTranslatorName(){
        this.reset(FIELD_OUTPSSYSTRANSLATORNAME);
    }

    /**
     * 设置 输出转换器
     * <P>
     * 等同 {@link #setOutPSSysTranslatorName}
     * @param outPSSysTranslatorName
     */
    @JsonIgnore
    public PSDEServiceAPI outpssystranslatorname(String outPSSysTranslatorName){
        this.setOutPSSysTranslatorName(outPSSysTranslatorName);
        return this;
    }

    /**
     * <B>PSDEFGROUPID</B>&nbsp;实体属性组，指定实体服务接口绑定的实体属性组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
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
    public PSDEServiceAPI psdefgroupid(String pSDEFGroupId){
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
    public PSDEServiceAPI psdefgroupid(PSDEFGroup pSDEFGroup){
        if(pSDEFGroup == null){
            this.setPSDEFGroupId(null);
            this.setPSDEFGroupName(null);
        }
        else{
            this.setPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEFGROUPNAME</B>&nbsp;实体属性组，指定实体服务接口绑定的实体属性组对象
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
    public PSDEServiceAPI psdefgroupname(String pSDEFGroupName){
        this.setPSDEFGroupName(pSDEFGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体服务接口相关的实体对象
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
    public PSDEServiceAPI psdeid(String pSDEId){
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
    public PSDEServiceAPI psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setDELogicName(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setDELogicName(pSDataEntity.getLogicName());
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体服务接口相关的实体对象
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
    public PSDEServiceAPI psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDESERVICEAPIID</B>&nbsp;实体服务接口标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDESERVICEAPIID = "psdeserviceapiid";

    /**
     * 设置 实体服务接口标识
     * 
     * @param pSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPIID)
    public void setPSDEServiceAPIId(String pSDEServiceAPIId){
        this.set(FIELD_PSDESERVICEAPIID, pSDEServiceAPIId);
    }
    
    /**
     * 获取 实体服务接口标识  
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
     * 判断 实体服务接口标识 是否指定值，包括空值
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
     * 重置 实体服务接口标识
     */
    @JsonIgnore
    public void resetPSDEServiceAPIId(){
        this.reset(FIELD_PSDESERVICEAPIID);
    }

    /**
     * 设置 实体服务接口标识
     * <P>
     * 等同 {@link #setPSDEServiceAPIId}
     * @param pSDEServiceAPIId
     */
    @JsonIgnore
    public PSDEServiceAPI psdeserviceapiid(String pSDEServiceAPIId){
        this.setPSDEServiceAPIId(pSDEServiceAPIId);
        return this;
    }

    /**
     * <B>PSDESERVICEAPINAME</B>&nbsp;实体接口名称，指定实体服务接口的名称，需在所在系统服务接口中具备唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDESERVICEAPINAME = "psdeserviceapiname";

    /**
     * 设置 实体接口名称，详细说明：{@link #FIELD_PSDESERVICEAPINAME}
     * 
     * @param pSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPINAME)
    public void setPSDEServiceAPIName(String pSDEServiceAPIName){
        this.set(FIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }
    
    /**
     * 获取 实体接口名称  
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
     * 判断 实体接口名称 是否指定值，包括空值
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
     * 重置 实体接口名称
     */
    @JsonIgnore
    public void resetPSDEServiceAPIName(){
        this.reset(FIELD_PSDESERVICEAPINAME);
    }

    /**
     * 设置 实体接口名称，详细说明：{@link #FIELD_PSDESERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSDEServiceAPIName}
     * @param pSDEServiceAPIName
     */
    @JsonIgnore
    public PSDEServiceAPI psdeserviceapiname(String pSDEServiceAPIName){
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEServiceAPIName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEServiceAPIName(strName);
    }

    @JsonIgnore
    public PSDEServiceAPI name(String strName){
        this.setPSDEServiceAPIName(strName);
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
    public PSDEServiceAPI pssysreqitemid(String pSSysReqItemId){
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
    public PSDEServiceAPI pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSDEServiceAPI pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口，指定实体服务接口所属的系统服务接口对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysServiceAPI} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPIID}
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口  
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
     * 判断 系统服务接口 是否指定值，包括空值
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
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPIID}
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSDEServiceAPI pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * 设置 系统服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDEServiceAPI pssysserviceapiid(PSSysServiceAPI pSSysServiceAPI){
        if(pSSysServiceAPI == null){
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        }
        else{
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口，指定实体服务接口所属的系统服务接口对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPINAME}
     * 
     * @param pSSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPINAME)
    public void setPSSysServiceAPIName(String pSSysServiceAPIName){
        this.set(FIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIName(){
        this.reset(FIELD_PSSYSSERVICEAPINAME);
    }

    /**
     * 设置 系统服务接口，详细说明：{@link #FIELD_PSSYSSERVICEAPINAME}
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSDEServiceAPI pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定实体服务接口的后台模板扩展插件
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
    public PSDEServiceAPI pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEServiceAPI pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定实体服务接口的后台模板扩展插件
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
    public PSDEServiceAPI pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SERVICEPARAM</B>&nbsp;服务参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPARAM = "serviceparam";

    /**
     * 设置 服务参数
     * 
     * @param serviceParam
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAM)
    public void setServiceParam(String serviceParam){
        this.set(FIELD_SERVICEPARAM, serviceParam);
    }
    
    /**
     * 获取 服务参数  
     * @return
     */
    @JsonIgnore
    public String getServiceParam(){
        Object objValue = this.get(FIELD_SERVICEPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParamDirty(){
        if(this.contains(FIELD_SERVICEPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务参数
     */
    @JsonIgnore
    public void resetServiceParam(){
        this.reset(FIELD_SERVICEPARAM);
    }

    /**
     * 设置 服务参数
     * <P>
     * 等同 {@link #setServiceParam}
     * @param serviceParam
     */
    @JsonIgnore
    public PSDEServiceAPI serviceparam(String serviceParam){
        this.setServiceParam(serviceParam);
        return this;
    }

    /**
     * <B>SERVICEPARAM2</B>&nbsp;服务参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SERVICEPARAM2 = "serviceparam2";

    /**
     * 设置 服务参数2
     * 
     * @param serviceParam2
     * 
     */
    @JsonProperty(FIELD_SERVICEPARAM2)
    public void setServiceParam2(String serviceParam2){
        this.set(FIELD_SERVICEPARAM2, serviceParam2);
    }
    
    /**
     * 获取 服务参数2  
     * @return
     */
    @JsonIgnore
    public String getServiceParam2(){
        Object objValue = this.get(FIELD_SERVICEPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceParam2Dirty(){
        if(this.contains(FIELD_SERVICEPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务参数2
     */
    @JsonIgnore
    public void resetServiceParam2(){
        this.reset(FIELD_SERVICEPARAM2);
    }

    /**
     * 设置 服务参数2
     * <P>
     * 等同 {@link #setServiceParam2}
     * @param serviceParam2
     */
    @JsonIgnore
    public PSDEServiceAPI serviceparam2(String serviceParam2){
        this.setServiceParam2(serviceParam2);
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
    public PSDEServiceAPI updatedate(String updateDate){
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
    public PSDEServiceAPI updateman(String updateMan){
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
    public PSDEServiceAPI usercat(String userCat){
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
    public PSDEServiceAPI usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEServiceAPI usertag(String userTag){
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
    public PSDEServiceAPI usertag2(String userTag2){
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
    public PSDEServiceAPI usertag3(String userTag3){
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
    public PSDEServiceAPI usertag4(String userTag4){
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
    public PSDEServiceAPI validflag(Integer validFlag){
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
    public PSDEServiceAPI validflag(Boolean validFlag){
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
        return this.getPSDEServiceAPIId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEServiceAPIId(strValue);
    }

    @JsonIgnore
    public PSDEServiceAPI id(String strValue){
        this.setPSDEServiceAPIId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEServiceAPI){
            PSDEServiceAPI model = (PSDEServiceAPI)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
