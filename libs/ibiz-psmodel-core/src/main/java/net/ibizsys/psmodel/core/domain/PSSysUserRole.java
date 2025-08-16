package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSUSERROLE</B>系统操作角色 模型传输对象
 * <P>
 * 系统操作用户角色，分配系统统一资源标识及实体操作角色。在系统运行环境中，拥有该角色的用户同时具备相应的能力
 */
public class PSSysUserRole extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysUserRole(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统用户角色的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysUserRole codename(String codeName){
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
    public PSSysUserRole createdate(String createDate){
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
    public PSSysUserRole createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTMODE</B>&nbsp;默认用户模式，指定系统用户角色的默认用户身份，默认为【无】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SysRoleDefaultUser} 
     */
    public final static String FIELD_DEFAULTMODE = "defaultmode";

    /**
     * 设置 默认用户模式，详细说明：{@link #FIELD_DEFAULTMODE}
     * 
     * @param defaultMode
     * 
     */
    @JsonProperty(FIELD_DEFAULTMODE)
    public void setDefaultMode(String defaultMode){
        this.set(FIELD_DEFAULTMODE, defaultMode);
    }
    
    /**
     * 获取 默认用户模式  
     * @return
     */
    @JsonIgnore
    public String getDefaultMode(){
        Object objValue = this.get(FIELD_DEFAULTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultModeDirty(){
        if(this.contains(FIELD_DEFAULTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认用户模式
     */
    @JsonIgnore
    public void resetDefaultMode(){
        this.reset(FIELD_DEFAULTMODE);
    }

    /**
     * 设置 默认用户模式，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSSysUserRole defaultmode(String defaultMode){
        this.setDefaultMode(defaultMode);
        return this;
    }

     /**
     * 设置 默认用户模式，详细说明：{@link #FIELD_DEFAULTMODE}
     * <P>
     * 等同 {@link #setDefaultMode}
     * @param defaultMode
     */
    @JsonIgnore
    public PSSysUserRole defaultmode(net.ibizsys.psmodel.core.util.PSModelEnums.SysRoleDefaultUser defaultMode){
        if(defaultMode == null){
            this.setDefaultMode(null);
        }
        else{
            this.setDefaultMode(defaultMode.value);
        }
        return this;
    }

    /**
     * <B>GLOBALFLAG</B>&nbsp;全局角色
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GLOBALFLAG = "globalflag";

    /**
     * 设置 全局角色
     * 
     * @param globalFlag
     * 
     */
    @JsonProperty(FIELD_GLOBALFLAG)
    public void setGlobalFlag(Integer globalFlag){
        this.set(FIELD_GLOBALFLAG, globalFlag);
    }
    
    /**
     * 获取 全局角色  
     * @return
     */
    @JsonIgnore
    public Integer getGlobalFlag(){
        Object objValue = this.get(FIELD_GLOBALFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全局角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGlobalFlagDirty(){
        if(this.contains(FIELD_GLOBALFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全局角色
     */
    @JsonIgnore
    public void resetGlobalFlag(){
        this.reset(FIELD_GLOBALFLAG);
    }

    /**
     * 设置 全局角色
     * <P>
     * 等同 {@link #setGlobalFlag}
     * @param globalFlag
     */
    @JsonIgnore
    public PSSysUserRole globalflag(Integer globalFlag){
        this.setGlobalFlag(globalFlag);
        return this;
    }

     /**
     * 设置 全局角色
     * <P>
     * 等同 {@link #setGlobalFlag}
     * @param globalFlag
     */
    @JsonIgnore
    public PSSysUserRole globalflag(Boolean globalFlag){
        if(globalFlag == null){
            this.setGlobalFlag(null);
        }
        else{
            this.setGlobalFlag(globalFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysUserRole memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PRIVID</B>&nbsp;系统角色标识，指定系统用户角色的角色标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PRIVID = "privid";

    /**
     * 设置 系统角色标识，详细说明：{@link #FIELD_PRIVID}
     * 
     * @param privId
     * 
     */
    @JsonProperty(FIELD_PRIVID)
    public void setPrivId(String privId){
        this.set(FIELD_PRIVID, privId);
    }
    
    /**
     * 获取 系统角色标识  
     * @return
     */
    @JsonIgnore
    public String getPrivId(){
        Object objValue = this.get(FIELD_PRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrivIdDirty(){
        if(this.contains(FIELD_PRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统角色标识
     */
    @JsonIgnore
    public void resetPrivId(){
        this.reset(FIELD_PRIVID);
    }

    /**
     * 设置 系统角色标识，详细说明：{@link #FIELD_PRIVID}
     * <P>
     * 等同 {@link #setPrivId}
     * @param privId
     */
    @JsonIgnore
    public PSSysUserRole privid(String privId){
        this.setPrivId(privId);
        return this;
    }

    /**
     * <B>PRIVTYPE</B>&nbsp;角色成员动态类型，指定系统用户角色的动态类型，默认为【自定义】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SysUserRoleType} 
     */
    public final static String FIELD_PRIVTYPE = "privtype";

    /**
     * 设置 角色成员动态类型，详细说明：{@link #FIELD_PRIVTYPE}
     * 
     * @param privType
     * 
     */
    @JsonProperty(FIELD_PRIVTYPE)
    public void setPrivType(String privType){
        this.set(FIELD_PRIVTYPE, privType);
    }
    
    /**
     * 获取 角色成员动态类型  
     * @return
     */
    @JsonIgnore
    public String getPrivType(){
        Object objValue = this.get(FIELD_PRIVTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色成员动态类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrivTypeDirty(){
        if(this.contains(FIELD_PRIVTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色成员动态类型
     */
    @JsonIgnore
    public void resetPrivType(){
        this.reset(FIELD_PRIVTYPE);
    }

    /**
     * 设置 角色成员动态类型，详细说明：{@link #FIELD_PRIVTYPE}
     * <P>
     * 等同 {@link #setPrivType}
     * @param privType
     */
    @JsonIgnore
    public PSSysUserRole privtype(String privType){
        this.setPrivType(privType);
        return this;
    }

     /**
     * 设置 角色成员动态类型，详细说明：{@link #FIELD_PRIVTYPE}
     * <P>
     * 等同 {@link #setPrivType}
     * @param privType
     */
    @JsonIgnore
    public PSSysUserRole privtype(net.ibizsys.psmodel.core.util.PSModelEnums.SysUserRoleType privType){
        if(privType == null){
            this.setPrivType(null);
        }
        else{
            this.setPrivType(privType.value);
        }
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;实体数据集合，系统用户角色动态类型为【实体数据集合】时指定的实体数据集合
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 实体数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
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
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSSysUserRole psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 实体数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSSysUserRole psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;实体数据集合，系统用户角色动态类型为【实体数据集合】时指定的实体数据集合
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 实体数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
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
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 实体数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSSysUserRole psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，系统用户角色动态类型为【实体数据集合】时指定的实体数据集合所在实体
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
    public PSSysUserRole psdeid(String pSDEId){
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
    public PSSysUserRole psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，系统用户角色动态类型为【实体数据集合】时指定的实体数据集合所在实体
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
    public PSSysUserRole psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统用户角色所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
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
     * 判断 系统模块 是否指定值，包括空值
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
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysUserRole psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSSysUserRole psmoduleid(PSModule pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统用户角色所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysUserRole psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
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
    public PSSysUserRole pssysdynamodelid(String pSSysDynaModelId){
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
    public PSSysUserRole pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSSysUserRole pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSUSERROLEID</B>&nbsp;系统权限标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUSERROLEID = "pssysuserroleid";

    /**
     * 设置 系统权限标识
     * 
     * @param pSSysUserRoleId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERROLEID)
    public void setPSSysUserRoleId(String pSSysUserRoleId){
        this.set(FIELD_PSSYSUSERROLEID, pSSysUserRoleId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysopprivid", pSSysUserRoleId);
    }
    
    /**
     * 获取 系统权限标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserRoleId(){
        Object objValue = this.get(FIELD_PSSYSUSERROLEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysopprivid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统权限标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserRoleIdDirty(){
        if(this.contains(FIELD_PSSYSUSERROLEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysopprivid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统权限标识
     */
    @JsonIgnore
    public void resetPSSysUserRoleId(){
        this.reset(FIELD_PSSYSUSERROLEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysopprivid");
    }

    /**
     * 设置 系统权限标识
     * <P>
     * 等同 {@link #setPSSysUserRoleId}
     * @param pSSysUserRoleId
     */
    @JsonIgnore
    public PSSysUserRole pssysuserroleid(String pSSysUserRoleId){
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysOPPrivId(){
        return this.getPSSysUserRoleId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysOPPrivId(String pSSysOPPrivId){
        this.setPSSysUserRoleId(pSSysOPPrivId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysOPPrivIdDirty(){
        return this.isPSSysUserRoleIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysOPPrivId(){
        this.resetPSSysUserRoleId();
    }

    /**
     * <B>PSSYSUSERROLENAME</B>&nbsp;系统角色名称，指定系统角色的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUSERROLENAME = "pssysuserrolename";

    /**
     * 设置 系统角色名称，详细说明：{@link #FIELD_PSSYSUSERROLENAME}
     * 
     * @param pSSysUserRoleName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERROLENAME)
    public void setPSSysUserRoleName(String pSSysUserRoleName){
        this.set(FIELD_PSSYSUSERROLENAME, pSSysUserRoleName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysopprivname", pSSysUserRoleName);
    }
    
    /**
     * 获取 系统角色名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserRoleName(){
        Object objValue = this.get(FIELD_PSSYSUSERROLENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysopprivname");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统角色名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserRoleNameDirty(){
        if(this.contains(FIELD_PSSYSUSERROLENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysopprivname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统角色名称
     */
    @JsonIgnore
    public void resetPSSysUserRoleName(){
        this.reset(FIELD_PSSYSUSERROLENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysopprivname");
    }

    /**
     * 设置 系统角色名称，详细说明：{@link #FIELD_PSSYSUSERROLENAME}
     * <P>
     * 等同 {@link #setPSSysUserRoleName}
     * @param pSSysUserRoleName
     */
    @JsonIgnore
    public PSSysUserRole pssysuserrolename(String pSSysUserRoleName){
        this.setPSSysUserRoleName(pSSysUserRoleName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysOPPrivName(){
        return this.getPSSysUserRoleName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysOPPrivName(String pSSysOPPrivName){
        this.setPSSysUserRoleName(pSSysOPPrivName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysOPPrivNameDirty(){
        return this.isPSSysUserRoleNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysOPPrivName(){
        this.resetPSSysUserRoleName();
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUserRoleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUserRoleName(strName);
    }

    @JsonIgnore
    public PSSysUserRole name(String strName){
        this.setPSSysUserRoleName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSSysUserRole pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSSysUserRole pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
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
     * 判断 后端模板插件 是否指定值，包括空值
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
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSSysUserRole pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>ROLETAGPSDEFID</B>&nbsp;角色标记属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ROLETAGPSDEFID = "roletagpsdefid";

    /**
     * 设置 角色标记属性
     * 
     * @param roleTagPSDEFId
     * 
     */
    @JsonProperty(FIELD_ROLETAGPSDEFID)
    public void setRoleTagPSDEFId(String roleTagPSDEFId){
        this.set(FIELD_ROLETAGPSDEFID, roleTagPSDEFId);
    }
    
    /**
     * 获取 角色标记属性  
     * @return
     */
    @JsonIgnore
    public String getRoleTagPSDEFId(){
        Object objValue = this.get(FIELD_ROLETAGPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色标记属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRoleTagPSDEFIdDirty(){
        if(this.contains(FIELD_ROLETAGPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色标记属性
     */
    @JsonIgnore
    public void resetRoleTagPSDEFId(){
        this.reset(FIELD_ROLETAGPSDEFID);
    }

    /**
     * 设置 角色标记属性
     * <P>
     * 等同 {@link #setRoleTagPSDEFId}
     * @param roleTagPSDEFId
     */
    @JsonIgnore
    public PSSysUserRole roletagpsdefid(String roleTagPSDEFId){
        this.setRoleTagPSDEFId(roleTagPSDEFId);
        return this;
    }

    /**
     * 设置 角色标记属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRoleTagPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUserRole roletagpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setRoleTagPSDEFId(null);
            this.setRoleTagPSDEFName(null);
        }
        else{
            this.setRoleTagPSDEFId(pSDEField.getPSDEFieldId());
            this.setRoleTagPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ROLETAGPSDEFNAME</B>&nbsp;角色标记属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ROLETAGPSDEFID}
     */
    public final static String FIELD_ROLETAGPSDEFNAME = "roletagpsdefname";

    /**
     * 设置 角色标记属性
     * 
     * @param roleTagPSDEFName
     * 
     */
    @JsonProperty(FIELD_ROLETAGPSDEFNAME)
    public void setRoleTagPSDEFName(String roleTagPSDEFName){
        this.set(FIELD_ROLETAGPSDEFNAME, roleTagPSDEFName);
    }
    
    /**
     * 获取 角色标记属性  
     * @return
     */
    @JsonIgnore
    public String getRoleTagPSDEFName(){
        Object objValue = this.get(FIELD_ROLETAGPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色标记属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRoleTagPSDEFNameDirty(){
        if(this.contains(FIELD_ROLETAGPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色标记属性
     */
    @JsonIgnore
    public void resetRoleTagPSDEFName(){
        this.reset(FIELD_ROLETAGPSDEFNAME);
    }

    /**
     * 设置 角色标记属性
     * <P>
     * 等同 {@link #setRoleTagPSDEFName}
     * @param roleTagPSDEFName
     */
    @JsonIgnore
    public PSSysUserRole roletagpsdefname(String roleTagPSDEFName){
        this.setRoleTagPSDEFName(roleTagPSDEFName);
        return this;
    }

    /**
     * <B>SYSTEMFLAG</B>&nbsp;系统使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SYSTEMFLAG = "systemflag";

    /**
     * 设置 系统使用
     * 
     * @param systemFlag
     * 
     */
    @JsonProperty(FIELD_SYSTEMFLAG)
    public void setSystemFlag(Integer systemFlag){
        this.set(FIELD_SYSTEMFLAG, systemFlag);
    }
    
    /**
     * 获取 系统使用  
     * @return
     */
    @JsonIgnore
    public Integer getSystemFlag(){
        Object objValue = this.get(FIELD_SYSTEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSystemFlagDirty(){
        if(this.contains(FIELD_SYSTEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统使用
     */
    @JsonIgnore
    public void resetSystemFlag(){
        this.reset(FIELD_SYSTEMFLAG);
    }

    /**
     * 设置 系统使用
     * <P>
     * 等同 {@link #setSystemFlag}
     * @param systemFlag
     */
    @JsonIgnore
    public PSSysUserRole systemflag(Integer systemFlag){
        this.setSystemFlag(systemFlag);
        return this;
    }

     /**
     * 设置 系统使用
     * <P>
     * 等同 {@link #setSystemFlag}
     * @param systemFlag
     */
    @JsonIgnore
    public PSSysUserRole systemflag(Boolean systemFlag){
        if(systemFlag == null){
            this.setSystemFlag(null);
        }
        else{
            this.setSystemFlag(systemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysUserRole updatedate(String updateDate){
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
    public PSSysUserRole updateman(String updateMan){
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
    public PSSysUserRole usercat(String userCat){
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
    public PSSysUserRole usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERIDPSDEFID</B>&nbsp;用户标识属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_USERIDPSDEFID = "useridpsdefid";

    /**
     * 设置 用户标识属性
     * 
     * @param userIdPSDEFId
     * 
     */
    @JsonProperty(FIELD_USERIDPSDEFID)
    public void setUserIdPSDEFId(String userIdPSDEFId){
        this.set(FIELD_USERIDPSDEFID, userIdPSDEFId);
    }
    
    /**
     * 获取 用户标识属性  
     * @return
     */
    @JsonIgnore
    public String getUserIdPSDEFId(){
        Object objValue = this.get(FIELD_USERIDPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserIdPSDEFIdDirty(){
        if(this.contains(FIELD_USERIDPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标识属性
     */
    @JsonIgnore
    public void resetUserIdPSDEFId(){
        this.reset(FIELD_USERIDPSDEFID);
    }

    /**
     * 设置 用户标识属性
     * <P>
     * 等同 {@link #setUserIdPSDEFId}
     * @param userIdPSDEFId
     */
    @JsonIgnore
    public PSSysUserRole useridpsdefid(String userIdPSDEFId){
        this.setUserIdPSDEFId(userIdPSDEFId);
        return this;
    }

    /**
     * 设置 用户标识属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setUserIdPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSSysUserRole useridpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setUserIdPSDEFId(null);
            this.setUserIdPSDEFName(null);
        }
        else{
            this.setUserIdPSDEFId(pSDEField.getPSDEFieldId());
            this.setUserIdPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>USERIDPSDEFNAME</B>&nbsp;用户标识属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_USERIDPSDEFID}
     */
    public final static String FIELD_USERIDPSDEFNAME = "useridpsdefname";

    /**
     * 设置 用户标识属性
     * 
     * @param userIdPSDEFName
     * 
     */
    @JsonProperty(FIELD_USERIDPSDEFNAME)
    public void setUserIdPSDEFName(String userIdPSDEFName){
        this.set(FIELD_USERIDPSDEFNAME, userIdPSDEFName);
    }
    
    /**
     * 获取 用户标识属性  
     * @return
     */
    @JsonIgnore
    public String getUserIdPSDEFName(){
        Object objValue = this.get(FIELD_USERIDPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标识属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserIdPSDEFNameDirty(){
        if(this.contains(FIELD_USERIDPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标识属性
     */
    @JsonIgnore
    public void resetUserIdPSDEFName(){
        this.reset(FIELD_USERIDPSDEFNAME);
    }

    /**
     * 设置 用户标识属性
     * <P>
     * 等同 {@link #setUserIdPSDEFName}
     * @param userIdPSDEFName
     */
    @JsonIgnore
    public PSSysUserRole useridpsdefname(String userIdPSDEFName){
        this.setUserIdPSDEFName(userIdPSDEFName);
        return this;
    }

    /**
     * <B>USERROLESN</B>&nbsp;角色编号，指定系统角色的编号
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERROLESN = "userrolesn";

    /**
     * 设置 角色编号，详细说明：{@link #FIELD_USERROLESN}
     * 
     * @param userRoleSN
     * 
     */
    @JsonProperty(FIELD_USERROLESN)
    public void setUserRoleSN(String userRoleSN){
        this.set(FIELD_USERROLESN, userRoleSN);
    }
    
    /**
     * 获取 角色编号  
     * @return
     */
    @JsonIgnore
    public String getUserRoleSN(){
        Object objValue = this.get(FIELD_USERROLESN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserRoleSNDirty(){
        if(this.contains(FIELD_USERROLESN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色编号
     */
    @JsonIgnore
    public void resetUserRoleSN(){
        this.reset(FIELD_USERROLESN);
    }

    /**
     * 设置 角色编号，详细说明：{@link #FIELD_USERROLESN}
     * <P>
     * 等同 {@link #setUserRoleSN}
     * @param userRoleSN
     */
    @JsonIgnore
    public PSSysUserRole userrolesn(String userRoleSN){
        this.setUserRoleSN(userRoleSN);
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
    public PSSysUserRole usertag(String userTag){
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
    public PSSysUserRole usertag2(String userTag2){
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
    public PSSysUserRole usertag3(String userTag3){
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
    public PSSysUserRole usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysUserRoleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUserRoleId(strValue);
    }

    @JsonIgnore
    public PSSysUserRole id(String strValue){
        this.setPSSysUserRoleId(strValue);
        return this;
    }


    /**
     *  系统用户角色资源 成员集合
     */
    public final static String FIELD_PSSYSUSERROLERESES = "pssysuserroleres";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleRes> pssysuserroleres;

    /**
     * 获取 系统用户角色资源 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSUSERROLERESES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleRes> getPSSysUserRoleReses(){
        return this.pssysuserroleres;
    }

    /**
     * 设置 系统用户角色资源 成员集合  
     * @param pssysuserroleres
     */
    @JsonProperty(FIELD_PSSYSUSERROLERESES)
    public void setPSSysUserRoleReses(java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleRes> pssysuserroleres){
        this.pssysuserroleres = pssysuserroleres;
    }

    /**
     * 获取 系统用户角色资源 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleRes> getPSSysUserRoleResesIf(){
        if(this.pssysuserroleres == null){
            this.pssysuserroleres = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysUserRoleRes>();          
        }
        return this.pssysuserroleres;
    }


    /**
     *  系统角色数据能力 成员集合
     */
    public final static String FIELD_PSSYSUSERROLEDATAS = "pssysuserroledata";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleData> pssysuserroledata;

    /**
     * 获取 系统角色数据能力 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSUSERROLEDATAS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleData> getPSSysUserRoleDatas(){
        return this.pssysuserroledata;
    }

    /**
     * 设置 系统角色数据能力 成员集合  
     * @param pssysuserroledata
     */
    @JsonProperty(FIELD_PSSYSUSERROLEDATAS)
    public void setPSSysUserRoleDatas(java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleData> pssysuserroledata){
        this.pssysuserroledata = pssysuserroledata;
    }

    /**
     * 获取 系统角色数据能力 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysUserRoleData> getPSSysUserRoleDatasIf(){
        if(this.pssysuserroledata == null){
            this.pssysuserroledata = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysUserRoleData>();          
        }
        return this.pssysuserroledata;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysUserRole){
            PSSysUserRole model = (PSSysUserRole)iPSModel;
            model.setPSSysUserRoleReses(this.getPSSysUserRoleReses());
            model.setPSSysUserRoleDatas(this.getPSSysUserRoleDatas());
        }
        super.copyTo(iPSModel);
    }
}
