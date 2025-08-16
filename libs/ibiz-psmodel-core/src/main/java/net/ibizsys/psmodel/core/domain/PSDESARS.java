package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDESARS</B>实体服务接口关系 模型传输对象
 * <P>
 * 实体服务接口关系模型，定义实体接口之间的关系及关系接口在特定关系下处理模式，提供资源目录的能力
 */
public class PSDESARS extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDESARS(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACTIONRSMODE</B>&nbsp;行为关系模式，指定服务接口关系的从实体接口的行为模式，未定义时为【继承行为】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEActionRSMode} 
     */
    public final static String FIELD_ACTIONRSMODE = "actionrsmode";

    /**
     * 设置 行为关系模式，详细说明：{@link #FIELD_ACTIONRSMODE}
     * 
     * @param actionRSMode
     * 
     */
    @JsonProperty(FIELD_ACTIONRSMODE)
    public void setActionRSMode(Integer actionRSMode){
        this.set(FIELD_ACTIONRSMODE, actionRSMode);
    }
    
    /**
     * 获取 行为关系模式  
     * @return
     */
    @JsonIgnore
    public Integer getActionRSMode(){
        Object objValue = this.get(FIELD_ACTIONRSMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 行为关系模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionRSModeDirty(){
        if(this.contains(FIELD_ACTIONRSMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行为关系模式
     */
    @JsonIgnore
    public void resetActionRSMode(){
        this.reset(FIELD_ACTIONRSMODE);
    }

    /**
     * 设置 行为关系模式，详细说明：{@link #FIELD_ACTIONRSMODE}
     * <P>
     * 等同 {@link #setActionRSMode}
     * @param actionRSMode
     */
    @JsonIgnore
    public PSDESARS actionrsmode(Integer actionRSMode){
        this.setActionRSMode(actionRSMode);
        return this;
    }

     /**
     * 设置 行为关系模式，详细说明：{@link #FIELD_ACTIONRSMODE}
     * <P>
     * 等同 {@link #setActionRSMode}
     * @param actionRSMode
     */
    @JsonIgnore
    public PSDESARS actionrsmode(net.ibizsys.psmodel.core.util.PSModelEnums.SADEActionRSMode actionRSMode){
        if(actionRSMode == null){
            this.setActionRSMode(null);
        }
        else{
            this.setActionRSMode(actionRSMode.value);
        }
        return this;
    }

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组，指定服务接口实体对象关系是否为数组模式，未定义时为【是】
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
    public PSDESARS arrayflag(Integer arrayFlag){
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
    public PSDESARS arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CHILDFILTER</B>&nbsp;自定义关系项，指定服务接口的自定义关系项，在未指定实体关系或自定义时使用
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CHILDFILTER = "childfilter";

    /**
     * 设置 自定义关系项，详细说明：{@link #FIELD_CHILDFILTER}
     * 
     * @param childFilter
     * 
     */
    @JsonProperty(FIELD_CHILDFILTER)
    public void setChildFilter(String childFilter){
        this.set(FIELD_CHILDFILTER, childFilter);
    }
    
    /**
     * 获取 自定义关系项  
     * @return
     */
    @JsonIgnore
    public String getChildFilter(){
        Object objValue = this.get(FIELD_CHILDFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义关系项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChildFilterDirty(){
        if(this.contains(FIELD_CHILDFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义关系项
     */
    @JsonIgnore
    public void resetChildFilter(){
        this.reset(FIELD_CHILDFILTER);
    }

    /**
     * 设置 自定义关系项，详细说明：{@link #FIELD_CHILDFILTER}
     * <P>
     * 等同 {@link #setChildFilter}
     * @param childFilter
     */
    @JsonIgnore
    public PSDESARS childfilter(String childFilter){
        this.setChildFilter(childFilter);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体服务接口关系的代码标识，需要在主实体服务接口中具有唯一性，未定义时使用从接口实体代码名称的复数形式
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
    public PSDESARS codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定实体服务接口关系的代码标识2，需要在主实体服务接口中具有唯一性
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
    public PSDESARS codename2(String codeName2){
        this.setCodeName2(codeName2);
        return this;
    }

    /**
     * <B>CPSDEID</B>&nbsp;从接口实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CPSDESERVICEAPIID}
     */
    public final static String FIELD_CPSDEID = "cpsdeid";

    /**
     * 设置 从接口实体标识
     * 
     * @param cPSDEId
     * 
     */
    @JsonProperty(FIELD_CPSDEID)
    public void setCPSDEId(String cPSDEId){
        this.set(FIELD_CPSDEID, cPSDEId);
    }
    
    /**
     * 获取 从接口实体标识  
     * @return
     */
    @JsonIgnore
    public String getCPSDEId(){
        Object objValue = this.get(FIELD_CPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从接口实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSDEIdDirty(){
        if(this.contains(FIELD_CPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从接口实体标识
     */
    @JsonIgnore
    public void resetCPSDEId(){
        this.reset(FIELD_CPSDEID);
    }

    /**
     * 设置 从接口实体标识
     * <P>
     * 等同 {@link #setCPSDEId}
     * @param cPSDEId
     */
    @JsonIgnore
    public PSDESARS cpsdeid(String cPSDEId){
        this.setCPSDEId(cPSDEId);
        return this;
    }

    /**
     * <B>CPSDESERVICEAPIID</B>&nbsp;从实体服务接口，指定实体服务接口关系的从实体服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_CPSDESERVICEAPIID = "cpsdeserviceapiid";

    /**
     * 设置 从实体服务接口，详细说明：{@link #FIELD_CPSDESERVICEAPIID}
     * 
     * @param cPSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_CPSDESERVICEAPIID)
    public void setCPSDEServiceAPIId(String cPSDEServiceAPIId){
        this.set(FIELD_CPSDESERVICEAPIID, cPSDEServiceAPIId);
    }
    
    /**
     * 获取 从实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getCPSDEServiceAPIId(){
        Object objValue = this.get(FIELD_CPSDESERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSDEServiceAPIIdDirty(){
        if(this.contains(FIELD_CPSDESERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体服务接口
     */
    @JsonIgnore
    public void resetCPSDEServiceAPIId(){
        this.reset(FIELD_CPSDESERVICEAPIID);
    }

    /**
     * 设置 从实体服务接口，详细说明：{@link #FIELD_CPSDESERVICEAPIID}
     * <P>
     * 等同 {@link #setCPSDEServiceAPIId}
     * @param cPSDEServiceAPIId
     */
    @JsonIgnore
    public PSDESARS cpsdeserviceapiid(String cPSDEServiceAPIId){
        this.setCPSDEServiceAPIId(cPSDEServiceAPIId);
        return this;
    }

    /**
     * 设置 从实体服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCPSDEServiceAPIId}
     * @param pSDEServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDESARS cpsdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setCPSDEId(null);
            this.setCPSDEServiceAPIId(null);
            this.setCPSDEServiceAPIName(null);
        }
        else{
            this.setCPSDEId(pSDEServiceAPI.getPSDEId());
            this.setCPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setCPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>CPSDESERVICEAPINAME</B>&nbsp;从实体服务接口，指定实体服务接口关系的从实体服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CPSDESERVICEAPIID}
     */
    public final static String FIELD_CPSDESERVICEAPINAME = "cpsdeserviceapiname";

    /**
     * 设置 从实体服务接口，详细说明：{@link #FIELD_CPSDESERVICEAPINAME}
     * 
     * @param cPSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_CPSDESERVICEAPINAME)
    public void setCPSDEServiceAPIName(String cPSDEServiceAPIName){
        this.set(FIELD_CPSDESERVICEAPINAME, cPSDEServiceAPIName);
    }
    
    /**
     * 获取 从实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getCPSDEServiceAPIName(){
        Object objValue = this.get(FIELD_CPSDESERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSDEServiceAPINameDirty(){
        if(this.contains(FIELD_CPSDESERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体服务接口
     */
    @JsonIgnore
    public void resetCPSDEServiceAPIName(){
        this.reset(FIELD_CPSDESERVICEAPINAME);
    }

    /**
     * 设置 从实体服务接口，详细说明：{@link #FIELD_CPSDESERVICEAPINAME}
     * <P>
     * 等同 {@link #setCPSDEServiceAPIName}
     * @param cPSDEServiceAPIName
     */
    @JsonIgnore
    public PSDESARS cpsdeserviceapiname(String cPSDEServiceAPIName){
        this.setCPSDEServiceAPIName(cPSDEServiceAPIName);
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
    public PSDESARS createdate(String createDate){
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
    public PSDESARS createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATAACCMODE</B>&nbsp;访问控制方式，指定实体服务接口关系从实体服务接口的访问控制方式，未定义时使用从实体服务接口设定
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
    public PSDESARS dataaccmode(Integer dataAccMode){
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
    public PSDESARS dataaccmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAccCtrlMode dataAccMode){
        if(dataAccMode == null){
            this.setDataAccMode(null);
        }
        else{
            this.setDataAccMode(dataAccMode.value);
        }
        return this;
    }

    /**
     * <B>DATARSMODE</B>&nbsp;数据关系模式，指定服务接口关系的从实体接口的数据关系模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SADEDataRSMode} 
     */
    public final static String FIELD_DATARSMODE = "datarsmode";

    /**
     * 设置 数据关系模式，详细说明：{@link #FIELD_DATARSMODE}
     * 
     * @param dataRSMode
     * 
     */
    @JsonProperty(FIELD_DATARSMODE)
    public void setDataRSMode(Integer dataRSMode){
        this.set(FIELD_DATARSMODE, dataRSMode);
    }
    
    /**
     * 获取 数据关系模式  
     * @return
     */
    @JsonIgnore
    public Integer getDataRSMode(){
        Object objValue = this.get(FIELD_DATARSMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数据关系模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataRSModeDirty(){
        if(this.contains(FIELD_DATARSMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据关系模式
     */
    @JsonIgnore
    public void resetDataRSMode(){
        this.reset(FIELD_DATARSMODE);
    }

    /**
     * 设置 数据关系模式，详细说明：{@link #FIELD_DATARSMODE}
     * <P>
     * 等同 {@link #setDataRSMode}
     * @param dataRSMode
     */
    @JsonIgnore
    public PSDESARS datarsmode(Integer dataRSMode){
        this.setDataRSMode(dataRSMode);
        return this;
    }

     /**
     * 设置 数据关系模式，详细说明：{@link #FIELD_DATARSMODE}
     * <P>
     * 等同 {@link #setDataRSMode}
     * @param dataRSMode
     */
    @JsonIgnore
    public PSDESARS datarsmode(net.ibizsys.psmodel.core.util.PSModelEnums.SADEDataRSMode[] dataRSMode){
        if(dataRSMode == null || dataRSMode.length == 0){
            this.setDataRSMode(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.SADEDataRSMode _item : dataRSMode){
                _value |= _item.value;
            }
            this.setDataRSMode(_value);
        }
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
    public PSDESARS enabledataexport(Integer enableDataExport){
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
    public PSDESARS enabledataexport(Boolean enableDataExport){
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
    public PSDESARS enabledataimport(Integer enableDataImport){
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
    public PSDESARS enabledataimport(Boolean enableDataImport){
        if(enableDataImport == null){
            this.setEnableDataImport(null);
        }
        else{
            this.setEnableDataImport(enableDataImport?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEACTION</B>&nbsp;支持实体行为，服务接口关系行为模式为【指定行为】时指定从接口实体是否默认支持实体行为，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEACTION = "enabledeaction";

    /**
     * 设置 支持实体行为，详细说明：{@link #FIELD_ENABLEDEACTION}
     * 
     * @param enableDEAction
     * 
     */
    @JsonProperty(FIELD_ENABLEDEACTION)
    public void setEnableDEAction(Integer enableDEAction){
        this.set(FIELD_ENABLEDEACTION, enableDEAction);
    }
    
    /**
     * 获取 支持实体行为  
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
     * 判断 支持实体行为 是否指定值，包括空值
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
     * 重置 支持实体行为
     */
    @JsonIgnore
    public void resetEnableDEAction(){
        this.reset(FIELD_ENABLEDEACTION);
    }

    /**
     * 设置 支持实体行为，详细说明：{@link #FIELD_ENABLEDEACTION}
     * <P>
     * 等同 {@link #setEnableDEAction}
     * @param enableDEAction
     */
    @JsonIgnore
    public PSDESARS enabledeaction(Integer enableDEAction){
        this.setEnableDEAction(enableDEAction);
        return this;
    }

     /**
     * 设置 支持实体行为，详细说明：{@link #FIELD_ENABLEDEACTION}
     * <P>
     * 等同 {@link #setEnableDEAction}
     * @param enableDEAction
     */
    @JsonIgnore
    public PSDESARS enabledeaction(Boolean enableDEAction){
        if(enableDEAction == null){
            this.setEnableDEAction(null);
        }
        else{
            this.setEnableDEAction(enableDEAction?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDEDATASET</B>&nbsp;支持获取结果集，服务接口关系行为模式为【指定行为】时指定从接口实体是否默认支持实体数据集，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDEDATASET = "enablededataset";

    /**
     * 设置 支持获取结果集，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * 
     * @param enableDEDataSet
     * 
     */
    @JsonProperty(FIELD_ENABLEDEDATASET)
    public void setEnableDEDataSet(Integer enableDEDataSet){
        this.set(FIELD_ENABLEDEDATASET, enableDEDataSet);
    }
    
    /**
     * 获取 支持获取结果集  
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
     * 判断 支持获取结果集 是否指定值，包括空值
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
     * 重置 支持获取结果集
     */
    @JsonIgnore
    public void resetEnableDEDataSet(){
        this.reset(FIELD_ENABLEDEDATASET);
    }

    /**
     * 设置 支持获取结果集，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * <P>
     * 等同 {@link #setEnableDEDataSet}
     * @param enableDEDataSet
     */
    @JsonIgnore
    public PSDESARS enablededataset(Integer enableDEDataSet){
        this.setEnableDEDataSet(enableDEDataSet);
        return this;
    }

     /**
     * 设置 支持获取结果集，详细说明：{@link #FIELD_ENABLEDEDATASET}
     * <P>
     * 等同 {@link #setEnableDEDataSet}
     * @param enableDEDataSet
     */
    @JsonIgnore
    public PSDESARS enablededataset(Boolean enableDEDataSet){
        if(enableDEDataSet == null){
            this.setEnableDEDataSet(null);
        }
        else{
            this.setEnableDEDataSet(enableDEDataSet?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESELECT</B>&nbsp;支持简单查询，服务接口关系行为模式为【指定行为】时指定从接口实体是否默认支持简单查询，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESELECT = "enableselect";

    /**
     * 设置 支持简单查询，详细说明：{@link #FIELD_ENABLESELECT}
     * 
     * @param enableSelect
     * 
     */
    @JsonProperty(FIELD_ENABLESELECT)
    public void setEnableSelect(Integer enableSelect){
        this.set(FIELD_ENABLESELECT, enableSelect);
    }
    
    /**
     * 获取 支持简单查询  
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
     * 判断 支持简单查询 是否指定值，包括空值
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
     * 重置 支持简单查询
     */
    @JsonIgnore
    public void resetEnableSelect(){
        this.reset(FIELD_ENABLESELECT);
    }

    /**
     * 设置 支持简单查询，详细说明：{@link #FIELD_ENABLESELECT}
     * <P>
     * 等同 {@link #setEnableSelect}
     * @param enableSelect
     */
    @JsonIgnore
    public PSDESARS enableselect(Integer enableSelect){
        this.setEnableSelect(enableSelect);
        return this;
    }

     /**
     * 设置 支持简单查询，详细说明：{@link #FIELD_ENABLESELECT}
     * <P>
     * 等同 {@link #setEnableSelect}
     * @param enableSelect
     */
    @JsonIgnore
    public PSDESARS enableselect(Boolean enableSelect){
        if(enableSelect == null){
            this.setEnableSelect(null);
        }
        else{
            this.setEnableSelect(enableSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EXPORTMODEL</B>&nbsp;导出模型关系
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_EXPORTMODEL = "exportmodel";

    /**
     * 设置 导出模型关系
     * 
     * @param exportModel
     * 
     */
    @JsonProperty(FIELD_EXPORTMODEL)
    public void setExportModel(Integer exportModel){
        this.set(FIELD_EXPORTMODEL, exportModel);
    }
    
    /**
     * 获取 导出模型关系  
     * @return
     */
    @JsonIgnore
    public Integer getExportModel(){
        Object objValue = this.get(FIELD_EXPORTMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 导出模型关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportModelDirty(){
        if(this.contains(FIELD_EXPORTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 导出模型关系
     */
    @JsonIgnore
    public void resetExportModel(){
        this.reset(FIELD_EXPORTMODEL);
    }

    /**
     * 设置 导出模型关系
     * <P>
     * 等同 {@link #setExportModel}
     * @param exportModel
     */
    @JsonIgnore
    public PSDESARS exportmodel(Integer exportModel){
        this.setExportModel(exportModel);
        return this;
    }

     /**
     * 设置 导出模型关系
     * <P>
     * 等同 {@link #setExportModel}
     * @param exportModel
     */
    @JsonIgnore
    public PSDESARS exportmodel(net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel exportModel){
        if(exportModel == null){
            this.setExportModel(null);
        }
        else{
            this.setExportModel(exportModel.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE</B>&nbsp;自定义导出范畴
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE = "exportscope";

    /**
     * 设置 自定义导出范畴
     * 
     * @param exportScope
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE)
    public void setExportScope(Integer exportScope){
        this.set(FIELD_EXPORTSCOPE, exportScope);
    }
    
    /**
     * 获取 自定义导出范畴  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope(){
        Object objValue = this.get(FIELD_EXPORTSCOPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出范畴 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScopeDirty(){
        if(this.contains(FIELD_EXPORTSCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出范畴
     */
    @JsonIgnore
    public void resetExportScope(){
        this.reset(FIELD_EXPORTSCOPE);
    }

    /**
     * 设置 自定义导出范畴
     * <P>
     * 等同 {@link #setExportScope}
     * @param exportScope
     */
    @JsonIgnore
    public PSDESARS exportscope(Integer exportScope){
        this.setExportScope(exportScope);
        return this;
    }

     /**
     * 设置 自定义导出范畴
     * <P>
     * 等同 {@link #setExportScope}
     * @param exportScope
     */
    @JsonIgnore
    public PSDESARS exportscope(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope){
        if(exportScope == null){
            this.setExportScope(null);
        }
        else{
            this.setExportScope(exportScope.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE2</B>&nbsp;自定义导出范畴2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE2 = "exportscope2";

    /**
     * 设置 自定义导出范畴2
     * 
     * @param exportScope2
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE2)
    public void setExportScope2(Integer exportScope2){
        this.set(FIELD_EXPORTSCOPE2, exportScope2);
    }
    
    /**
     * 获取 自定义导出范畴2  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope2(){
        Object objValue = this.get(FIELD_EXPORTSCOPE2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出范畴2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope2Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出范畴2
     */
    @JsonIgnore
    public void resetExportScope2(){
        this.reset(FIELD_EXPORTSCOPE2);
    }

    /**
     * 设置 自定义导出范畴2
     * <P>
     * 等同 {@link #setExportScope2}
     * @param exportScope2
     */
    @JsonIgnore
    public PSDESARS exportscope2(Integer exportScope2){
        this.setExportScope2(exportScope2);
        return this;
    }

     /**
     * 设置 自定义导出范畴2
     * <P>
     * 等同 {@link #setExportScope2}
     * @param exportScope2
     */
    @JsonIgnore
    public PSDESARS exportscope2(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope2){
        if(exportScope2 == null){
            this.setExportScope2(null);
        }
        else{
            this.setExportScope2(exportScope2.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE3</B>&nbsp;自定义导出范畴3
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE3 = "exportscope3";

    /**
     * 设置 自定义导出范畴3
     * 
     * @param exportScope3
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE3)
    public void setExportScope3(Integer exportScope3){
        this.set(FIELD_EXPORTSCOPE3, exportScope3);
    }
    
    /**
     * 获取 自定义导出范畴3  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope3(){
        Object objValue = this.get(FIELD_EXPORTSCOPE3);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出范畴3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope3Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出范畴3
     */
    @JsonIgnore
    public void resetExportScope3(){
        this.reset(FIELD_EXPORTSCOPE3);
    }

    /**
     * 设置 自定义导出范畴3
     * <P>
     * 等同 {@link #setExportScope3}
     * @param exportScope3
     */
    @JsonIgnore
    public PSDESARS exportscope3(Integer exportScope3){
        this.setExportScope3(exportScope3);
        return this;
    }

     /**
     * 设置 自定义导出范畴3
     * <P>
     * 等同 {@link #setExportScope3}
     * @param exportScope3
     */
    @JsonIgnore
    public PSDESARS exportscope3(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope3){
        if(exportScope3 == null){
            this.setExportScope3(null);
        }
        else{
            this.setExportScope3(exportScope3.value);
        }
        return this;
    }

    /**
     * <B>EXPORTSCOPE4</B>&nbsp;自定义导出范畴4
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2} 
     */
    public final static String FIELD_EXPORTSCOPE4 = "exportscope4";

    /**
     * 设置 自定义导出范畴4
     * 
     * @param exportScope4
     * 
     */
    @JsonProperty(FIELD_EXPORTSCOPE4)
    public void setExportScope4(Integer exportScope4){
        this.set(FIELD_EXPORTSCOPE4, exportScope4);
    }
    
    /**
     * 获取 自定义导出范畴4  
     * @return
     */
    @JsonIgnore
    public Integer getExportScope4(){
        Object objValue = this.get(FIELD_EXPORTSCOPE4);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义导出范畴4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExportScope4Dirty(){
        if(this.contains(FIELD_EXPORTSCOPE4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义导出范畴4
     */
    @JsonIgnore
    public void resetExportScope4(){
        this.reset(FIELD_EXPORTSCOPE4);
    }

    /**
     * 设置 自定义导出范畴4
     * <P>
     * 等同 {@link #setExportScope4}
     * @param exportScope4
     */
    @JsonIgnore
    public PSDESARS exportscope4(Integer exportScope4){
        this.setExportScope4(exportScope4);
        return this;
    }

     /**
     * 设置 自定义导出范畴4
     * <P>
     * 等同 {@link #setExportScope4}
     * @param exportScope4
     */
    @JsonIgnore
    public PSDESARS exportscope4(net.ibizsys.psmodel.core.util.PSModelEnums.DEExportModelScope2 exportScope4){
        if(exportScope4 == null){
            this.setExportScope4(null);
        }
        else{
            this.setExportScope4(exportScope4.value);
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
    public PSDESARS memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定实体服务接口关系的次序
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
    public PSDESARS ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSDEID</B>&nbsp;主接口实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDESERVICEAPIID}
     */
    public final static String FIELD_PPSDEID = "ppsdeid";

    /**
     * 设置 主接口实体标识
     * 
     * @param pPSDEId
     * 
     */
    @JsonProperty(FIELD_PPSDEID)
    public void setPPSDEId(String pPSDEId){
        this.set(FIELD_PPSDEID, pPSDEId);
    }
    
    /**
     * 获取 主接口实体标识  
     * @return
     */
    @JsonIgnore
    public String getPPSDEId(){
        Object objValue = this.get(FIELD_PPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主接口实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEIdDirty(){
        if(this.contains(FIELD_PPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主接口实体标识
     */
    @JsonIgnore
    public void resetPPSDEId(){
        this.reset(FIELD_PPSDEID);
    }

    /**
     * 设置 主接口实体标识
     * <P>
     * 等同 {@link #setPPSDEId}
     * @param pPSDEId
     */
    @JsonIgnore
    public PSDESARS ppsdeid(String pPSDEId){
        this.setPPSDEId(pPSDEId);
        return this;
    }

    /**
     * <B>PPSDESERVICEAPIID</B>&nbsp;主实体服务接口，指定实体服务接口关系的主实体服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_PPSDESERVICEAPIID = "ppsdeserviceapiid";

    /**
     * 设置 主实体服务接口，详细说明：{@link #FIELD_PPSDESERVICEAPIID}
     * 
     * @param pPSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PPSDESERVICEAPIID)
    public void setPPSDEServiceAPIId(String pPSDEServiceAPIId){
        this.set(FIELD_PPSDESERVICEAPIID, pPSDEServiceAPIId);
    }
    
    /**
     * 获取 主实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getPPSDEServiceAPIId(){
        Object objValue = this.get(FIELD_PPSDESERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEServiceAPIIdDirty(){
        if(this.contains(FIELD_PPSDESERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体服务接口
     */
    @JsonIgnore
    public void resetPPSDEServiceAPIId(){
        this.reset(FIELD_PPSDESERVICEAPIID);
    }

    /**
     * 设置 主实体服务接口，详细说明：{@link #FIELD_PPSDESERVICEAPIID}
     * <P>
     * 等同 {@link #setPPSDEServiceAPIId}
     * @param pPSDEServiceAPIId
     */
    @JsonIgnore
    public PSDESARS ppsdeserviceapiid(String pPSDEServiceAPIId){
        this.setPPSDEServiceAPIId(pPSDEServiceAPIId);
        return this;
    }

    /**
     * 设置 主实体服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEServiceAPIId}
     * @param pSDEServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDESARS ppsdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setPPSDEId(null);
            this.setPPSDEServiceAPIId(null);
            this.setPPSDEServiceAPIName(null);
        }
        else{
            this.setPPSDEId(pSDEServiceAPI.getPSDEId());
            this.setPPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PPSDESERVICEAPINAME</B>&nbsp;主实体服务接口，指定实体服务接口关系的主实体服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDESERVICEAPIID}
     */
    public final static String FIELD_PPSDESERVICEAPINAME = "ppsdeserviceapiname";

    /**
     * 设置 主实体服务接口，详细说明：{@link #FIELD_PPSDESERVICEAPINAME}
     * 
     * @param pPSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PPSDESERVICEAPINAME)
    public void setPPSDEServiceAPIName(String pPSDEServiceAPIName){
        this.set(FIELD_PPSDESERVICEAPINAME, pPSDEServiceAPIName);
    }
    
    /**
     * 获取 主实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getPPSDEServiceAPIName(){
        Object objValue = this.get(FIELD_PPSDESERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEServiceAPINameDirty(){
        if(this.contains(FIELD_PPSDESERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体服务接口
     */
    @JsonIgnore
    public void resetPPSDEServiceAPIName(){
        this.reset(FIELD_PPSDESERVICEAPINAME);
    }

    /**
     * 设置 主实体服务接口，详细说明：{@link #FIELD_PPSDESERVICEAPINAME}
     * <P>
     * 等同 {@link #setPPSDEServiceAPIName}
     * @param pPSDEServiceAPIName
     */
    @JsonIgnore
    public PSDESARS ppsdeserviceapiname(String pPSDEServiceAPIName){
        this.setPPSDEServiceAPIName(pPSDEServiceAPIName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定实体服务接口关系相关的实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDESARS psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDESARS psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定实体服务接口关系相关的实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDESARS psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDESARSID</B>&nbsp;服务接口关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDESARSID = "psdesarsid";

    /**
     * 设置 服务接口关系标识
     * 
     * @param pSDESARSId
     * 
     */
    @JsonProperty(FIELD_PSDESARSID)
    public void setPSDESARSId(String pSDESARSId){
        this.set(FIELD_PSDESARSID, pSDESARSId);
    }
    
    /**
     * 获取 服务接口关系标识  
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
     * 判断 服务接口关系标识 是否指定值，包括空值
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
     * 重置 服务接口关系标识
     */
    @JsonIgnore
    public void resetPSDESARSId(){
        this.reset(FIELD_PSDESARSID);
    }

    /**
     * 设置 服务接口关系标识
     * <P>
     * 等同 {@link #setPSDESARSId}
     * @param pSDESARSId
     */
    @JsonIgnore
    public PSDESARS psdesarsid(String pSDESARSId){
        this.setPSDESARSId(pSDESARSId);
        return this;
    }

    /**
     * <B>PSDESARSNAME</B>&nbsp;接口关系名称，指定接口关系名称，需在所在的系统服务接口中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDESARSNAME = "psdesarsname";

    /**
     * 设置 接口关系名称，详细说明：{@link #FIELD_PSDESARSNAME}
     * 
     * @param pSDESARSName
     * 
     */
    @JsonProperty(FIELD_PSDESARSNAME)
    public void setPSDESARSName(String pSDESARSName){
        this.set(FIELD_PSDESARSNAME, pSDESARSName);
    }
    
    /**
     * 获取 接口关系名称  
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
     * 判断 接口关系名称 是否指定值，包括空值
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
     * 重置 接口关系名称
     */
    @JsonIgnore
    public void resetPSDESARSName(){
        this.reset(FIELD_PSDESARSNAME);
    }

    /**
     * 设置 接口关系名称，详细说明：{@link #FIELD_PSDESARSNAME}
     * <P>
     * 等同 {@link #setPSDESARSName}
     * @param pSDESARSName
     */
    @JsonIgnore
    public PSDESARS psdesarsname(String pSDESARSName){
        this.setPSDESARSName(pSDESARSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDESARSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDESARSName(strName);
    }

    @JsonIgnore
    public PSDESARS name(String strName){
        this.setPSDESARSName(strName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口，指定实体服务接口关系所属的系统服务接口
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
    public PSDESARS pssysserviceapiid(String pSSysServiceAPIId){
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
    public PSDESARS pssysserviceapiid(PSSysServiceAPI pSSysServiceAPI){
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
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口，指定实体服务接口关系所属的系统服务接口
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
    public PSDESARS pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>SYNCEXPORTMODEL</B>&nbsp;模型同步
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERDataSyncAction} 
     */
    public final static String FIELD_SYNCEXPORTMODEL = "syncexportmodel";

    /**
     * 设置 模型同步
     * 
     * @param syncExportModel
     * 
     */
    @JsonProperty(FIELD_SYNCEXPORTMODEL)
    public void setSyncExportModel(Integer syncExportModel){
        this.set(FIELD_SYNCEXPORTMODEL, syncExportModel);
    }
    
    /**
     * 获取 模型同步  
     * @return
     */
    @JsonIgnore
    public Integer getSyncExportModel(){
        Object objValue = this.get(FIELD_SYNCEXPORTMODEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型同步 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncExportModelDirty(){
        if(this.contains(FIELD_SYNCEXPORTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型同步
     */
    @JsonIgnore
    public void resetSyncExportModel(){
        this.reset(FIELD_SYNCEXPORTMODEL);
    }

    /**
     * 设置 模型同步
     * <P>
     * 等同 {@link #setSyncExportModel}
     * @param syncExportModel
     */
    @JsonIgnore
    public PSDESARS syncexportmodel(Integer syncExportModel){
        this.setSyncExportModel(syncExportModel);
        return this;
    }

     /**
     * 设置 模型同步
     * <P>
     * 等同 {@link #setSyncExportModel}
     * @param syncExportModel
     */
    @JsonIgnore
    public PSDESARS syncexportmodel(net.ibizsys.psmodel.core.util.PSModelEnums.DERDataSyncAction syncExportModel){
        if(syncExportModel == null){
            this.setSyncExportModel(null);
        }
        else{
            this.setSyncExportModel(syncExportModel.value);
        }
        return this;
    }

    /**
     * <B>TEMPORDERVALUE</B>&nbsp;临时数据关系
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DERExportLevel} 
     */
    public final static String FIELD_TEMPORDERVALUE = "tempordervalue";

    /**
     * 设置 临时数据关系
     * 
     * @param tempOrderValue
     * 
     */
    @JsonProperty(FIELD_TEMPORDERVALUE)
    public void setTempOrderValue(Integer tempOrderValue){
        this.set(FIELD_TEMPORDERVALUE, tempOrderValue);
    }
    
    /**
     * 获取 临时数据关系  
     * @return
     */
    @JsonIgnore
    public Integer getTempOrderValue(){
        Object objValue = this.get(FIELD_TEMPORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 临时数据关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTempOrderValueDirty(){
        if(this.contains(FIELD_TEMPORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 临时数据关系
     */
    @JsonIgnore
    public void resetTempOrderValue(){
        this.reset(FIELD_TEMPORDERVALUE);
    }

    /**
     * 设置 临时数据关系
     * <P>
     * 等同 {@link #setTempOrderValue}
     * @param tempOrderValue
     */
    @JsonIgnore
    public PSDESARS tempordervalue(Integer tempOrderValue){
        this.setTempOrderValue(tempOrderValue);
        return this;
    }

    /**
     * <B>TYPEFILTER</B>&nbsp;类型过滤项
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TYPEFILTER = "typefilter";

    /**
     * 设置 类型过滤项
     * 
     * @param typeFilter
     * 
     */
    @JsonProperty(FIELD_TYPEFILTER)
    public void setTypeFilter(String typeFilter){
        this.set(FIELD_TYPEFILTER, typeFilter);
    }
    
    /**
     * 获取 类型过滤项  
     * @return
     */
    @JsonIgnore
    public String getTypeFilter(){
        Object objValue = this.get(FIELD_TYPEFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypeFilterDirty(){
        if(this.contains(FIELD_TYPEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型过滤项
     */
    @JsonIgnore
    public void resetTypeFilter(){
        this.reset(FIELD_TYPEFILTER);
    }

    /**
     * 设置 类型过滤项
     * <P>
     * 等同 {@link #setTypeFilter}
     * @param typeFilter
     */
    @JsonIgnore
    public PSDESARS typefilter(String typeFilter){
        this.setTypeFilter(typeFilter);
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
    public PSDESARS updatedate(String updateDate){
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
    public PSDESARS updateman(String updateMan){
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
    public PSDESARS usercat(String userCat){
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
    public PSDESARS usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDESARS usertag(String userTag){
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
    public PSDESARS usertag2(String userTag2){
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
    public PSDESARS usertag3(String userTag3){
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
    public PSDESARS usertag4(String userTag4){
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
    public PSDESARS validflag(Integer validFlag){
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
    public PSDESARS validflag(Boolean validFlag){
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
        return this.getPSDESARSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDESARSId(strValue);
    }

    @JsonIgnore
    public PSDESARS id(String strValue){
        this.setPSDESARSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDESARS){
            PSDESARS model = (PSDESARS)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
