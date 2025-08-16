package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSAPPDATAENTITY</B>应用实体 模型传输对象
 * <P>
 * 前端应用实体模型，系统实体添加到前端应用形成应用实体，同一个系统实体可以被多次添加到同一个应用
 */
public class PSAppDataEntity extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppDataEntity(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ACCCTRLARCH</B>&nbsp;访问控制体系，指定应用实体的访问控制体系，未定义时使用实体设定
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
    public PSAppDataEntity accctrlarch(Integer accCtrlArch){
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
    public PSAppDataEntity accctrlarch(net.ibizsys.psmodel.core.util.PSModelEnums.AccCtrlArch accCtrlArch){
        if(accCtrlArch == null){
            this.setAccCtrlArch(null);
        }
        else{
            this.setAccCtrlArch(accCtrlArch.value);
        }
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
    public PSAppDataEntity baseclsparams(String baseClsParams){
        this.setBaseClsParams(baseClsParams);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用实体代码标识，需要在所在的前端应用中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSAppDataEntity codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2
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
     * 设置 代码标识2
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSAppDataEntity codename2(String codeName2){
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
    public PSAppDataEntity createdate(String createDate){
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
    public PSAppDataEntity createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMUSERACTION</B>&nbsp;自定义用户行为
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMUSERACTION = "customuseraction";

    /**
     * 设置 自定义用户行为
     * 
     * @param customUserAction
     * 
     */
    @JsonProperty(FIELD_CUSTOMUSERACTION)
    public void setCustomUserAction(Integer customUserAction){
        this.set(FIELD_CUSTOMUSERACTION, customUserAction);
    }
    
    /**
     * 获取 自定义用户行为  
     * @return
     */
    @JsonIgnore
    public Integer getCustomUserAction(){
        Object objValue = this.get(FIELD_CUSTOMUSERACTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 自定义用户行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomUserActionDirty(){
        if(this.contains(FIELD_CUSTOMUSERACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义用户行为
     */
    @JsonIgnore
    public void resetCustomUserAction(){
        this.reset(FIELD_CUSTOMUSERACTION);
    }

    /**
     * 设置 自定义用户行为
     * <P>
     * 等同 {@link #setCustomUserAction}
     * @param customUserAction
     */
    @JsonIgnore
    public PSAppDataEntity customuseraction(Integer customUserAction){
        this.setCustomUserAction(customUserAction);
        return this;
    }

     /**
     * 设置 自定义用户行为
     * <P>
     * 等同 {@link #setCustomUserAction}
     * @param customUserAction
     */
    @JsonIgnore
    public PSAppDataEntity customuseraction(Boolean customUserAction){
        if(customUserAction == null){
            this.setCustomUserAction(null);
        }
        else{
            this.setCustomUserAction(customUserAction?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATAACCMODE</B>&nbsp;访问控制方式，指定应用实体的访问控制方式，未定义时使用实体设定
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
    public PSAppDataEntity dataaccmode(Integer dataAccMode){
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
    public PSAppDataEntity dataaccmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEDataAccCtrlMode dataAccMode){
        if(dataAccMode == null){
            this.setDataAccMode(null);
        }
        else{
            this.setDataAccMode(dataAccMode.value);
        }
        return this;
    }

    /**
     * <B>DECODENAME</B>&nbsp;实体代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_DECODENAME = "decodename";

    /**
     * 设置 实体代码标识
     * 
     * @param dECodeName
     * 
     */
    @JsonProperty(FIELD_DECODENAME)
    public void setDECodeName(String dECodeName){
        this.set(FIELD_DECODENAME, dECodeName);
    }
    
    /**
     * 获取 实体代码标识  
     * @return
     */
    @JsonIgnore
    public String getDECodeName(){
        Object objValue = this.get(FIELD_DECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDECodeNameDirty(){
        if(this.contains(FIELD_DECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体代码标识
     */
    @JsonIgnore
    public void resetDECodeName(){
        this.reset(FIELD_DECODENAME);
    }

    /**
     * 设置 实体代码标识
     * <P>
     * 等同 {@link #setDECodeName}
     * @param dECodeName
     */
    @JsonIgnore
    public PSAppDataEntity decodename(String dECodeName){
        this.setDECodeName(dECodeName);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;实体默认
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 实体默认
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 实体默认  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体默认 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体默认
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 实体默认
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSAppDataEntity defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 实体默认
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSAppDataEntity defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFGROUPMODE</B>&nbsp;属性组模式，应用实体指定属性组时同时指定属性组的使用模式，未定义时为【替换实体属性】
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
    public PSAppDataEntity defgroupmode(String dEFGroupMode){
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
    public PSAppDataEntity defgroupmode(net.ibizsys.psmodel.core.util.PSModelEnums.SADEDEFGroupMode dEFGroupMode){
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
    public PSAppDataEntity delogicname(String dELogicName){
        this.setDELogicName(dELogicName);
        return this;
    }

    /**
     * <B>STORAGEMODE</B>&nbsp;存储模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppDEStorageMode} 
     */
    public final static String FIELD_STORAGEMODE = "storagemode";

    /**
     * 设置 存储模式
     * 
     * @param storageMode
     * 
     */
    @JsonProperty(FIELD_STORAGEMODE)
    public void setStorageMode(Integer storageMode){
        this.set(FIELD_STORAGEMODE, storageMode);
        //属性名称与代码标识不一致，设置属性名称
        this.set("enablestorage", storageMode);
    }
    
    /**
     * 获取 存储模式  
     * @return
     */
    @JsonIgnore
    public Integer getStorageMode(){
        Object objValue = this.get(FIELD_STORAGEMODE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("enablestorage");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 存储模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStorageModeDirty(){
        if(this.contains(FIELD_STORAGEMODE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("enablestorage")){
            return true;
        }
        return false;
    }

    /**
     * 重置 存储模式
     */
    @JsonIgnore
    public void resetStorageMode(){
        this.reset(FIELD_STORAGEMODE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("enablestorage");
    }

    /**
     * 设置 存储模式
     * <P>
     * 等同 {@link #setStorageMode}
     * @param storageMode
     */
    @JsonIgnore
    public PSAppDataEntity storagemode(Integer storageMode){
        this.setStorageMode(storageMode);
        return this;
    }

     /**
     * 设置 存储模式
     * <P>
     * 等同 {@link #setStorageMode}
     * @param storageMode
     */
    @JsonIgnore
    public PSAppDataEntity storagemode(net.ibizsys.psmodel.core.util.PSModelEnums.AppDEStorageMode storageMode){
        if(storageMode == null){
            this.setStorageMode(null);
        }
        else{
            this.setStorageMode(storageMode.value);
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getEnableStorage(){
        return this.getStorageMode();
    }

    @JsonIgnore
    @Deprecated        
    public void setEnableStorage(Integer enableStorage){
        this.setStorageMode(enableStorage);
    }

    @JsonIgnore
    @Deprecated
    public boolean isEnableStorageDirty(){
        return this.isStorageModeDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetEnableStorage(){
        this.resetStorageMode();
    }

    /**
     * <B>LINKPSDEVIEWID</B>&nbsp;链接展现视图，指定应用实体提供的链接视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_LINKPSDEVIEWID = "linkpsdeviewid";

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * 
     * @param linkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWID)
    public void setLinkPSDEViewId(String linkPSDEViewId){
        this.set(FIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }
    
    /**
     * 获取 链接展现视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewId(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接展现视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewId(){
        this.reset(FIELD_LINKPSDEVIEWID);
    }

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param linkPSDEViewId
     */
    @JsonIgnore
    public PSAppDataEntity linkpsdeviewid(String linkPSDEViewId){
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    /**
     * 设置 链接展现视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity linkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        }
        else{
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWNAME</B>&nbsp;链接展现视图，指定应用实体提供的链接视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEVIEWID}
     */
    public final static String FIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * 
     * @param linkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWNAME)
    public void setLinkPSDEViewName(String linkPSDEViewName){
        this.set(FIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }
    
    /**
     * 获取 链接展现视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewName(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接展现视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接展现视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewName(){
        this.reset(FIELD_LINKPSDEVIEWNAME);
    }

    /**
     * 设置 链接展现视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setLinkPSDEViewName}
     * @param linkPSDEViewName
     */
    @JsonIgnore
    public PSAppDataEntity linkpsdeviewname(String linkPSDEViewName){
        this.setLinkPSDEViewName(linkPSDEViewName);
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
    public PSAppDataEntity lnpslanresid(String lNPSLanResId){
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
    public PSAppDataEntity lnpslanresid(PSLanguageRes pSLanguageRes){
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
    public PSAppDataEntity lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称
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
     * 设置 逻辑名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSAppDataEntity logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MAJORFLAG</B>&nbsp;主实体模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AppDEMode} 
     */
    public final static String FIELD_MAJORFLAG = "majorflag";

    /**
     * 设置 主实体模式
     * 
     * @param majorFlag
     * 
     */
    @JsonProperty(FIELD_MAJORFLAG)
    public void setMajorFlag(Integer majorFlag){
        this.set(FIELD_MAJORFLAG, majorFlag);
    }
    
    /**
     * 获取 主实体模式  
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
     * 判断 主实体模式 是否指定值，包括空值
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
     * 重置 主实体模式
     */
    @JsonIgnore
    public void resetMajorFlag(){
        this.reset(FIELD_MAJORFLAG);
    }

    /**
     * 设置 主实体模式
     * <P>
     * 等同 {@link #setMajorFlag}
     * @param majorFlag
     */
    @JsonIgnore
    public PSAppDataEntity majorflag(Integer majorFlag){
        this.setMajorFlag(majorFlag);
        return this;
    }

     /**
     * 设置 主实体模式
     * <P>
     * 等同 {@link #setMajorFlag}
     * @param majorFlag
     */
    @JsonIgnore
    public PSAppDataEntity majorflag(net.ibizsys.psmodel.core.util.PSModelEnums.AppDEMode majorFlag){
        if(majorFlag == null){
            this.setMajorFlag(null);
        }
        else{
            this.setMajorFlag(majorFlag.value);
        }
        return this;
    }

    /**
     * <B>MDPSDEVIEWID</B>&nbsp;多项数据选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MDPSDEVIEWID = "mdpsdeviewid";

    /**
     * 设置 多项数据选择视图
     * 
     * @param mDPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MDPSDEVIEWID)
    public void setMDPSDEViewId(String mDPSDEViewId){
        this.set(FIELD_MDPSDEVIEWID, mDPSDEViewId);
    }
    
    /**
     * 获取 多项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEViewId(){
        Object objValue = this.get(FIELD_MDPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEViewIdDirty(){
        if(this.contains(FIELD_MDPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多项数据选择视图
     */
    @JsonIgnore
    public void resetMDPSDEViewId(){
        this.reset(FIELD_MDPSDEVIEWID);
    }

    /**
     * 设置 多项数据选择视图
     * <P>
     * 等同 {@link #setMDPSDEViewId}
     * @param mDPSDEViewId
     */
    @JsonIgnore
    public PSAppDataEntity mdpsdeviewid(String mDPSDEViewId){
        this.setMDPSDEViewId(mDPSDEViewId);
        return this;
    }

    /**
     * 设置 多项数据选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMDPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity mdpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMDPSDEViewId(null);
            this.setMDPSDEViewName(null);
        }
        else{
            this.setMDPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMDPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MDPSDEVIEWNAME</B>&nbsp;多项数据选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MDPSDEVIEWID}
     */
    public final static String FIELD_MDPSDEVIEWNAME = "mdpsdeviewname";

    /**
     * 设置 多项数据选择视图
     * 
     * @param mDPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MDPSDEVIEWNAME)
    public void setMDPSDEViewName(String mDPSDEViewName){
        this.set(FIELD_MDPSDEVIEWNAME, mDPSDEViewName);
    }
    
    /**
     * 获取 多项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getMDPSDEViewName(){
        Object objValue = this.get(FIELD_MDPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMDPSDEViewNameDirty(){
        if(this.contains(FIELD_MDPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多项数据选择视图
     */
    @JsonIgnore
    public void resetMDPSDEViewName(){
        this.reset(FIELD_MDPSDEVIEWNAME);
    }

    /**
     * 设置 多项数据选择视图
     * <P>
     * 等同 {@link #setMDPSDEViewName}
     * @param mDPSDEViewName
     */
    @JsonIgnore
    public PSAppDataEntity mdpsdeviewname(String mDPSDEViewName){
        this.setMDPSDEViewName(mDPSDEViewName);
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
    public PSAppDataEntity memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PPSAPPDATAENTITYID</B>&nbsp;主应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppDataEntity} 
     */
    public final static String FIELD_PPSAPPDATAENTITYID = "ppsappdataentityid";

    /**
     * 设置 主应用实体
     * 
     * @param pPSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PPSAPPDATAENTITYID)
    public void setPPSAppDataEntityId(String pPSAppDataEntityId){
        this.set(FIELD_PPSAPPDATAENTITYID, pPSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("ppsapplocaldeid", pPSAppDataEntityId);
    }
    
    /**
     * 获取 主应用实体  
     * @return
     */
    @JsonIgnore
    public String getPPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PPSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("ppsapplocaldeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 主应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PPSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("ppsapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 主应用实体
     */
    @JsonIgnore
    public void resetPPSAppDataEntityId(){
        this.reset(FIELD_PPSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("ppsapplocaldeid");
    }

    /**
     * 设置 主应用实体
     * <P>
     * 等同 {@link #setPPSAppDataEntityId}
     * @param pPSAppDataEntityId
     */
    @JsonIgnore
    public PSAppDataEntity ppsappdataentityid(String pPSAppDataEntityId){
        this.setPPSAppDataEntityId(pPSAppDataEntityId);
        return this;
    }

    /**
     * 设置 主应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity ppsappdataentityid(PSAppDataEntity pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPPSAppDataEntityId(null);
            this.setPPSAppDataEntityName(null);
        }
        else{
            this.setPPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPPSAppLocalDEId(){
        return this.getPPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPPSAppLocalDEId(String pPSAppLocalDEId){
        this.setPPSAppDataEntityId(pPSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPPSAppLocalDEIdDirty(){
        return this.isPPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPPSAppLocalDEId(){
        this.resetPPSAppDataEntityId();
    }

    /**
     * <B>PPSAPPDATAENTITYNAME</B>&nbsp;主应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSAPPDATAENTITYID}
     */
    public final static String FIELD_PPSAPPDATAENTITYNAME = "ppsappdataentityname";

    /**
     * 设置 主应用实体
     * 
     * @param pPSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PPSAPPDATAENTITYNAME)
    public void setPPSAppDataEntityName(String pPSAppDataEntityName){
        this.set(FIELD_PPSAPPDATAENTITYNAME, pPSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("ppsapplocaldename", pPSAppDataEntityName);
    }
    
    /**
     * 获取 主应用实体  
     * @return
     */
    @JsonIgnore
    public String getPPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PPSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("ppsapplocaldename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 主应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PPSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("ppsapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 主应用实体
     */
    @JsonIgnore
    public void resetPPSAppDataEntityName(){
        this.reset(FIELD_PPSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("ppsapplocaldename");
    }

    /**
     * 设置 主应用实体
     * <P>
     * 等同 {@link #setPPSAppDataEntityName}
     * @param pPSAppDataEntityName
     */
    @JsonIgnore
    public PSAppDataEntity ppsappdataentityname(String pPSAppDataEntityName){
        this.setPPSAppDataEntityName(pPSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPPSAppLocalDEName(){
        return this.getPPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPPSAppLocalDEName(String pPSAppLocalDEName){
        this.setPPSAppDataEntityName(pPSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPPSAppLocalDENameDirty(){
        return this.isPPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPPSAppLocalDEName(){
        this.resetPPSAppDataEntityName();
    }

    /**
     * <B>PSAPPDATAENTITYID</B>&nbsp;应用实体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPDATAENTITYID = "psappdataentityid";

    /**
     * 设置 应用实体标识
     * 
     * @param pSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYID)
    public void setPSAppDataEntityId(String pSAppDataEntityId){
        this.set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldeid", pSAppDataEntityId);
    }
    
    /**
     * 获取 应用实体标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体标识
     */
    @JsonIgnore
    public void resetPSAppDataEntityId(){
        this.reset(FIELD_PSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldeid");
    }

    /**
     * 设置 应用实体标识
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntityId
     */
    @JsonIgnore
    public PSAppDataEntity psappdataentityid(String pSAppDataEntityId){
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId(){
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEId(String pSAppLocalDEId){
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty(){
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId(){
        this.resetPSAppDataEntityId();
    }

    /**
     * <B>PSAPPDATAENTITYNAME</B>&nbsp;名称
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSAPPDATAENTITYNAME = "psappdataentityname";

    /**
     * 设置 名称
     * 
     * @param pSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYNAME)
    public void setPSAppDataEntityName(String pSAppDataEntityName){
        this.set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldename", pSAppDataEntityName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSAppDataEntityName(){
        this.reset(FIELD_PSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldename");
    }

    /**
     * 设置 名称
     * <P>
     * 等同 {@link #setPSAppDataEntityName}
     * @param pSAppDataEntityName
     */
    @JsonIgnore
    public PSAppDataEntity psappdataentityname(String pSAppDataEntityName){
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName(){
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEName(String pSAppLocalDEName){
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty(){
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName(){
        this.resetPSAppDataEntityName();
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppDataEntityName(strName);
    }

    @JsonIgnore
    public PSAppDataEntity name(String strName){
        this.setPSAppDataEntityName(strName);
        return this;
    }

    /**
     * <B>PSAPPMODULEID</B>&nbsp;应用模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppModule} 
     */
    public final static String FIELD_PSAPPMODULEID = "psappmoduleid";

    /**
     * 设置 应用模块
     * 
     * @param pSAppModuleId
     * 
     */
    @JsonProperty(FIELD_PSAPPMODULEID)
    public void setPSAppModuleId(String pSAppModuleId){
        this.set(FIELD_PSAPPMODULEID, pSAppModuleId);
    }
    
    /**
     * 获取 应用模块  
     * @return
     */
    @JsonIgnore
    public String getPSAppModuleId(){
        Object objValue = this.get(FIELD_PSAPPMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppModuleIdDirty(){
        if(this.contains(FIELD_PSAPPMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模块
     */
    @JsonIgnore
    public void resetPSAppModuleId(){
        this.reset(FIELD_PSAPPMODULEID);
    }

    /**
     * 设置 应用模块
     * <P>
     * 等同 {@link #setPSAppModuleId}
     * @param pSAppModuleId
     */
    @JsonIgnore
    public PSAppDataEntity psappmoduleid(String pSAppModuleId){
        this.setPSAppModuleId(pSAppModuleId);
        return this;
    }

    /**
     * 设置 应用模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppModuleId}
     * @param pSAppModule 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity psappmoduleid(PSAppModule pSAppModule){
        if(pSAppModule == null){
            this.setPSAppModuleId(null);
            this.setPSAppModuleName(null);
        }
        else{
            this.setPSAppModuleId(pSAppModule.getPSAppModuleId());
            this.setPSAppModuleName(pSAppModule.getPSAppModuleName());
        }
        return this;
    }

    /**
     * <B>PSAPPMODULENAME</B>&nbsp;应用模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMODULEID}
     */
    public final static String FIELD_PSAPPMODULENAME = "psappmodulename";

    /**
     * 设置 应用模块
     * 
     * @param pSAppModuleName
     * 
     */
    @JsonProperty(FIELD_PSAPPMODULENAME)
    public void setPSAppModuleName(String pSAppModuleName){
        this.set(FIELD_PSAPPMODULENAME, pSAppModuleName);
    }
    
    /**
     * 获取 应用模块  
     * @return
     */
    @JsonIgnore
    public String getPSAppModuleName(){
        Object objValue = this.get(FIELD_PSAPPMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppModuleNameDirty(){
        if(this.contains(FIELD_PSAPPMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用模块
     */
    @JsonIgnore
    public void resetPSAppModuleName(){
        this.reset(FIELD_PSAPPMODULENAME);
    }

    /**
     * 设置 应用模块
     * <P>
     * 等同 {@link #setPSAppModuleName}
     * @param pSAppModuleName
     */
    @JsonIgnore
    public PSAppDataEntity psappmodulename(String pSAppModuleName){
        this.setPSAppModuleName(pSAppModuleName);
        return this;
    }

    /**
     * <B>PSDEFGROUPID</B>&nbsp;实体属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFGroup} 
     */
    public final static String FIELD_PSDEFGROUPID = "psdefgroupid";

    /**
     * 设置 实体属性组
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
     * 设置 实体属性组
     * <P>
     * 等同 {@link #setPSDEFGroupId}
     * @param pSDEFGroupId
     */
    @JsonIgnore
    public PSAppDataEntity psdefgroupid(String pSDEFGroupId){
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
    public PSAppDataEntity psdefgroupid(PSDEFGroup pSDEFGroup){
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
     * <B>PSDEFGROUPNAME</B>&nbsp;实体属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFGROUPID}
     */
    public final static String FIELD_PSDEFGROUPNAME = "psdefgroupname";

    /**
     * 设置 实体属性组
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
     * 设置 实体属性组
     * <P>
     * 等同 {@link #setPSDEFGroupName}
     * @param pSDEFGroupName
     */
    @JsonIgnore
    public PSAppDataEntity psdefgroupname(String pSDEFGroupName){
        this.setPSDEFGroupName(pSDEFGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSAppDataEntity psdeid(String pSDEId){
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
    public PSAppDataEntity psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setDECodeName(null);
            this.setDELogicName(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSModuleId(null);
        }
        else{
            this.setDECodeName(pSDataEntity.getCodeName());
            this.setDELogicName(pSDataEntity.getLogicName());
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSModuleId(pSDataEntity.getPSModuleId());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSAppDataEntity psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;控制实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 控制实体关系
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 控制实体关系  
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
     * 判断 控制实体关系 是否指定值，包括空值
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
     * 重置 控制实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 控制实体关系
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSAppDataEntity psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 控制实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity psderid(PSDER pSDER){
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
     * <B>PSDERNAME</B>&nbsp;控制实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 控制实体关系
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 控制实体关系  
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
     * 判断 控制实体关系 是否指定值，包括空值
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
     * 重置 控制实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 控制实体关系
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSAppDataEntity psdername(String pSDERName){
        this.setPSDERName(pSDERName);
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
    public PSAppDataEntity psdeserviceapiid(String pSDEServiceAPIId){
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
    public PSAppDataEntity psdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
        }
        else{
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSDESERVICEAPINAME</B>&nbsp;实体服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESERVICEAPIID}
     */
    public final static String FIELD_PSDESERVICEAPINAME = "psdeserviceapiname";

    /**
     * 设置 实体服务接口
     * 
     * @param pSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPINAME)
    public void setPSDEServiceAPIName(String pSDEServiceAPIName){
        this.set(FIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }
    
    /**
     * 获取 实体服务接口  
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
     * 判断 实体服务接口 是否指定值，包括空值
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
     * 重置 实体服务接口
     */
    @JsonIgnore
    public void resetPSDEServiceAPIName(){
        this.reset(FIELD_PSDESERVICEAPINAME);
    }

    /**
     * 设置 实体服务接口
     * <P>
     * 等同 {@link #setPSDEServiceAPIName}
     * @param pSDEServiceAPIName
     */
    @JsonIgnore
    public PSAppDataEntity psdeserviceapiname(String pSDEServiceAPIName){
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;实体模块标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 实体模块标识
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 实体模块标识  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体模块标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体模块标识
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 实体模块标识
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSAppDataEntity psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppDataEntity pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSAppDataEntity pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
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
    public PSAppDataEntity pssysdynamodelid(String pSSysDynaModelId){
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
    public PSAppDataEntity pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSAppDataEntity pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSAppDataEntity pssysreqitemid(String pSSysReqItemId){
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
    public PSAppDataEntity pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSAppDataEntity pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysServiceAPI} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口
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
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSAppDataEntity pssysserviceapiid(String pSSysServiceAPIId){
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
    public PSAppDataEntity pssysserviceapiid(PSSysServiceAPI pSSysServiceAPI){
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
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口
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
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSAppDataEntity pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端插件  
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
     * 判断 后端插件 是否指定值，包括空值
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
     * 重置 后端插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSAppDataEntity pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端插件  
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
     * 判断 后端插件 是否指定值，包括空值
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
     * 重置 后端插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSAppDataEntity pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SDPSDEVIEWID</B>&nbsp;单项数据选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_SDPSDEVIEWID = "sdpsdeviewid";

    /**
     * 设置 单项数据选择视图
     * 
     * @param sDPSDEViewID
     * 
     */
    @JsonProperty(FIELD_SDPSDEVIEWID)
    public void setSDPSDEViewID(String sDPSDEViewID){
        this.set(FIELD_SDPSDEVIEWID, sDPSDEViewID);
    }
    
    /**
     * 获取 单项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getSDPSDEViewID(){
        Object objValue = this.get(FIELD_SDPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDPSDEViewIDDirty(){
        if(this.contains(FIELD_SDPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单项数据选择视图
     */
    @JsonIgnore
    public void resetSDPSDEViewID(){
        this.reset(FIELD_SDPSDEVIEWID);
    }

    /**
     * 设置 单项数据选择视图
     * <P>
     * 等同 {@link #setSDPSDEViewID}
     * @param sDPSDEViewID
     */
    @JsonIgnore
    public PSAppDataEntity sdpsdeviewid(String sDPSDEViewID){
        this.setSDPSDEViewID(sDPSDEViewID);
        return this;
    }

    /**
     * 设置 单项数据选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSDPSDEViewID}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSAppDataEntity sdpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setSDPSDEViewID(null);
            this.setSDPSDEViewName(null);
        }
        else{
            this.setSDPSDEViewID(pSDEViewBase.getPSDEViewBaseId());
            this.setSDPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>SDPSDEVIEWNAME</B>&nbsp;单项数据选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SDPSDEVIEWID}
     */
    public final static String FIELD_SDPSDEVIEWNAME = "sdpsdeviewname";

    /**
     * 设置 单项数据选择视图
     * 
     * @param sDPSDEViewName
     * 
     */
    @JsonProperty(FIELD_SDPSDEVIEWNAME)
    public void setSDPSDEViewName(String sDPSDEViewName){
        this.set(FIELD_SDPSDEVIEWNAME, sDPSDEViewName);
    }
    
    /**
     * 获取 单项数据选择视图  
     * @return
     */
    @JsonIgnore
    public String getSDPSDEViewName(){
        Object objValue = this.get(FIELD_SDPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单项数据选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSDPSDEViewNameDirty(){
        if(this.contains(FIELD_SDPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单项数据选择视图
     */
    @JsonIgnore
    public void resetSDPSDEViewName(){
        this.reset(FIELD_SDPSDEVIEWNAME);
    }

    /**
     * 设置 单项数据选择视图
     * <P>
     * 等同 {@link #setSDPSDEViewName}
     * @param sDPSDEViewName
     */
    @JsonIgnore
    public PSAppDataEntity sdpsdeviewname(String sDPSDEViewName){
        this.setSDPSDEViewName(sDPSDEViewName);
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
    public PSAppDataEntity updatedate(String updateDate){
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
    public PSAppDataEntity updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERACTION</B>&nbsp;用户数据行为
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEUserUIAbility} 
     */
    public final static String FIELD_USERACTION = "useraction";

    /**
     * 设置 用户数据行为
     * 
     * @param userAction
     * 
     */
    @JsonProperty(FIELD_USERACTION)
    public void setUserAction(Integer userAction){
        this.set(FIELD_USERACTION, userAction);
    }
    
    /**
     * 获取 用户数据行为  
     * @return
     */
    @JsonIgnore
    public Integer getUserAction(){
        Object objValue = this.get(FIELD_USERACTION);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户数据行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserActionDirty(){
        if(this.contains(FIELD_USERACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户数据行为
     */
    @JsonIgnore
    public void resetUserAction(){
        this.reset(FIELD_USERACTION);
    }

    /**
     * 设置 用户数据行为
     * <P>
     * 等同 {@link #setUserAction}
     * @param userAction
     */
    @JsonIgnore
    public PSAppDataEntity useraction(Integer userAction){
        this.setUserAction(userAction);
        return this;
    }

     /**
     * 设置 用户数据行为
     * <P>
     * 等同 {@link #setUserAction}
     * @param userAction
     */
    @JsonIgnore
    public PSAppDataEntity useraction(net.ibizsys.psmodel.core.util.PSModelEnums.DEUserUIAbility[] userAction){
        if(userAction == null || userAction.length == 0){
            this.setUserAction(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEUserUIAbility _item : userAction){
                _value |= _item.value;
            }
            this.setUserAction(_value);
        }
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
    public PSAppDataEntity usercat(String userCat){
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
    public PSAppDataEntity usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSAppDataEntity usertag(String userTag){
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
    public PSAppDataEntity usertag2(String userTag2){
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
    public PSAppDataEntity usertag3(String userTag3){
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
    public PSAppDataEntity usertag4(String userTag4){
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
    public PSAppDataEntity validflag(Integer validFlag){
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
    public PSAppDataEntity validflag(Boolean validFlag){
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
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppDataEntityId(strValue);
    }

    @JsonIgnore
    public PSAppDataEntity id(String strValue){
        this.setPSAppDataEntityId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppDataEntity){
            PSAppDataEntity model = (PSAppDataEntity)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
