package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPUSERMODE</B>应用用户模式 模型传输对象
 * <P>
 * 应用用户模式模型，定义应用支持的用户模式，包括默认视图、默认应用菜单等
 */
public class PSAppUserModeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSAppUserModeDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用用户模式的代码标识，需在所在的前端应用中具备唯一性
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
    public PSAppUserModeDTO codename(String codeName){
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setCreateDate(Timestamp createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 建立时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getCreateDate(){
        Object objValue = this.get(FIELD_CREATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSAppUserModeDTO createdate(Timestamp createDate){
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
    public PSAppUserModeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认模式，指定应用用户模式是否为所在前端应用的默认用户模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认模式，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认模式  
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
     * 判断 默认模式 是否指定值，包括空值
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
     * 重置 默认模式
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认模式，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSAppUserModeDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认模式，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSAppUserModeDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称，指定应用用户模式的逻辑名称
     * <P>
     * 字符串：最大长度 200
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
    public PSAppUserModeDTO logicname(String logicName){
        this.setLogicName(logicName);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSAppUserModeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPMENUID</B>&nbsp;应用菜单，指定应用用户模式的默认应用菜单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO} 
     */
    public final static String FIELD_PSAPPMENUID = "psappmenuid";

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUID}
     * 
     * @param pSAppMenuId
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUID)
    public void setPSAppMenuId(String pSAppMenuId){
        this.set(FIELD_PSAPPMENUID, pSAppMenuId);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuId(){
        Object objValue = this.get(FIELD_PSAPPMENUID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuIdDirty(){
        if(this.contains(FIELD_PSAPPMENUID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuId(){
        this.reset(FIELD_PSAPPMENUID);
    }

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUID}
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenuId
     */
    @JsonIgnore
    public PSAppUserModeDTO psappmenuid(String pSAppMenuId){
        this.setPSAppMenuId(pSAppMenuId);
        return this;
    }

    /**
     * 设置 应用菜单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppMenuId}
     * @param pSAppMenu 引用对象
     */
    @JsonIgnore
    public PSAppUserModeDTO psappmenuid(PSAppMenuDTO pSAppMenu){
        if(pSAppMenu == null){
            this.setPSAppMenuId(null);
            this.setPSAppMenuName(null);
        }
        else{
            this.setPSAppMenuId(pSAppMenu.getPSAppMenuId());
            this.setPSAppMenuName(pSAppMenu.getPSAppMenuName());
        }
        return this;
    }

    /**
     * <B>PSAPPMENUNAME</B>&nbsp;应用菜单，指定应用用户模式的默认应用菜单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPMENUID}
     */
    public final static String FIELD_PSAPPMENUNAME = "psappmenuname";

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUNAME}
     * 
     * @param pSAppMenuName
     * 
     */
    @JsonProperty(FIELD_PSAPPMENUNAME)
    public void setPSAppMenuName(String pSAppMenuName){
        this.set(FIELD_PSAPPMENUNAME, pSAppMenuName);
    }
    
    /**
     * 获取 应用菜单  
     * @return
     */
    @JsonIgnore
    public String getPSAppMenuName(){
        Object objValue = this.get(FIELD_PSAPPMENUNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用菜单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppMenuNameDirty(){
        if(this.contains(FIELD_PSAPPMENUNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用菜单
     */
    @JsonIgnore
    public void resetPSAppMenuName(){
        this.reset(FIELD_PSAPPMENUNAME);
    }

    /**
     * 设置 应用菜单，详细说明：{@link #FIELD_PSAPPMENUNAME}
     * <P>
     * 等同 {@link #setPSAppMenuName}
     * @param pSAppMenuName
     */
    @JsonIgnore
    public PSAppUserModeDTO psappmenuname(String pSAppMenuName){
        this.setPSAppMenuName(pSAppMenuName);
        return this;
    }

    /**
     * <B>PSAPPUSERMODEID</B>&nbsp;应用用户模式标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPUSERMODEID = "psappusermodeid";

    /**
     * 设置 应用用户模式标识
     * 
     * @param pSAppUserModeId
     * 
     */
    @JsonProperty(FIELD_PSAPPUSERMODEID)
    public void setPSAppUserModeId(String pSAppUserModeId){
        this.set(FIELD_PSAPPUSERMODEID, pSAppUserModeId);
    }
    
    /**
     * 获取 应用用户模式标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppUserModeId(){
        Object objValue = this.get(FIELD_PSAPPUSERMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用用户模式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUserModeIdDirty(){
        if(this.contains(FIELD_PSAPPUSERMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用用户模式标识
     */
    @JsonIgnore
    public void resetPSAppUserModeId(){
        this.reset(FIELD_PSAPPUSERMODEID);
    }

    /**
     * 设置 应用用户模式标识
     * <P>
     * 等同 {@link #setPSAppUserModeId}
     * @param pSAppUserModeId
     */
    @JsonIgnore
    public PSAppUserModeDTO psappusermodeid(String pSAppUserModeId){
        this.setPSAppUserModeId(pSAppUserModeId);
        return this;
    }

    /**
     * <B>PSAPPUSERMODENAME</B>&nbsp;应用用户模式，指定应用用户模式的名称，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPUSERMODENAME = "psappusermodename";

    /**
     * 设置 应用用户模式，详细说明：{@link #FIELD_PSAPPUSERMODENAME}
     * 
     * @param pSAppUserModeName
     * 
     */
    @JsonProperty(FIELD_PSAPPUSERMODENAME)
    public void setPSAppUserModeName(String pSAppUserModeName){
        this.set(FIELD_PSAPPUSERMODENAME, pSAppUserModeName);
    }
    
    /**
     * 获取 应用用户模式  
     * @return
     */
    @JsonIgnore
    public String getPSAppUserModeName(){
        Object objValue = this.get(FIELD_PSAPPUSERMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppUserModeNameDirty(){
        if(this.contains(FIELD_PSAPPUSERMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用用户模式
     */
    @JsonIgnore
    public void resetPSAppUserModeName(){
        this.reset(FIELD_PSAPPUSERMODENAME);
    }

    /**
     * 设置 应用用户模式，详细说明：{@link #FIELD_PSAPPUSERMODENAME}
     * <P>
     * 等同 {@link #setPSAppUserModeName}
     * @param pSAppUserModeName
     */
    @JsonIgnore
    public PSAppUserModeDTO psappusermodename(String pSAppUserModeName){
        this.setPSAppUserModeName(pSAppUserModeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppUserModeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppUserModeName(strName);
    }

    @JsonIgnore
    public PSAppUserModeDTO name(String strName){
        this.setPSAppUserModeName(strName);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;默认视图，指定应用用户模式的默认应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppViewDTO} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 默认视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_PSAPPVIEWID}
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSAppUserModeDTO psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 默认视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSAppUserModeDTO psappviewid(PSAppViewDTO pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;默认视图，指定应用用户模式的默认应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 默认视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 默认视图，详细说明：{@link #FIELD_PSAPPVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSAppUserModeDTO psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用用户模式所在的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysAppDTO} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
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
     * 设置 系统应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppUserModeDTO pssysappid(String pSSysAppId){
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
    public PSAppUserModeDTO pssysappid(PSSysAppDTO pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用用户模式所在的前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
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
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSAppUserModeDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSUSERMODEID</B>&nbsp;系统用户模式，指定应用用户模式相关的系统用户模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUserModeDTO} 
     */
    public final static String FIELD_PSSYSUSERMODEID = "pssysusermodeid";

    /**
     * 设置 系统用户模式，详细说明：{@link #FIELD_PSSYSUSERMODEID}
     * 
     * @param pSSysUserModeId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERMODEID)
    public void setPSSysUserModeId(String pSSysUserModeId){
        this.set(FIELD_PSSYSUSERMODEID, pSSysUserModeId);
    }
    
    /**
     * 获取 系统用户模式  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserModeId(){
        Object objValue = this.get(FIELD_PSSYSUSERMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserModeIdDirty(){
        if(this.contains(FIELD_PSSYSUSERMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用户模式
     */
    @JsonIgnore
    public void resetPSSysUserModeId(){
        this.reset(FIELD_PSSYSUSERMODEID);
    }

    /**
     * 设置 系统用户模式，详细说明：{@link #FIELD_PSSYSUSERMODEID}
     * <P>
     * 等同 {@link #setPSSysUserModeId}
     * @param pSSysUserModeId
     */
    @JsonIgnore
    public PSAppUserModeDTO pssysusermodeid(String pSSysUserModeId){
        this.setPSSysUserModeId(pSSysUserModeId);
        return this;
    }

    /**
     * 设置 系统用户模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserModeId}
     * @param pSSysUserMode 引用对象
     */
    @JsonIgnore
    public PSAppUserModeDTO pssysusermodeid(PSSysUserModeDTO pSSysUserMode){
        if(pSSysUserMode == null){
            this.setPSSysUserModeId(null);
            this.setPSSysUserModeName(null);
        }
        else{
            this.setPSSysUserModeId(pSSysUserMode.getPSSysUserModeId());
            this.setPSSysUserModeName(pSSysUserMode.getPSSysUserModeName());
        }
        return this;
    }

    /**
     * <B>PSSYSUSERMODENAME</B>&nbsp;系统用户模式，指定应用用户模式相关的系统用户模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERMODEID}
     */
    public final static String FIELD_PSSYSUSERMODENAME = "pssysusermodename";

    /**
     * 设置 系统用户模式，详细说明：{@link #FIELD_PSSYSUSERMODENAME}
     * 
     * @param pSSysUserModeName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERMODENAME)
    public void setPSSysUserModeName(String pSSysUserModeName){
        this.set(FIELD_PSSYSUSERMODENAME, pSSysUserModeName);
    }
    
    /**
     * 获取 系统用户模式  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserModeName(){
        Object objValue = this.get(FIELD_PSSYSUSERMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserModeNameDirty(){
        if(this.contains(FIELD_PSSYSUSERMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用户模式
     */
    @JsonIgnore
    public void resetPSSysUserModeName(){
        this.reset(FIELD_PSSYSUSERMODENAME);
    }

    /**
     * 设置 系统用户模式，详细说明：{@link #FIELD_PSSYSUSERMODENAME}
     * <P>
     * 等同 {@link #setPSSysUserModeName}
     * @param pSSysUserModeName
     */
    @JsonIgnore
    public PSAppUserModeDTO pssysusermodename(String pSSysUserModeName){
        this.setPSSysUserModeName(pSSysUserModeName);
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setUpdateDate(Timestamp updateDate){
        this.set(FIELD_UPDATEDATE, updateDate);
    }
    
    /**
     * 获取 更新时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getUpdateDate(){
        Object objValue = this.get(FIELD_UPDATEDATE);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
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
    public PSAppUserModeDTO updatedate(Timestamp updateDate){
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
    public PSAppUserModeDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSAppUserModeDTO usercat(String userCat){
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
    public PSAppUserModeDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSAppUserModeDTO usertag(String userTag){
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
    public PSAppUserModeDTO usertag2(String userTag2){
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
    public PSAppUserModeDTO usertag3(String userTag3){
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
    public PSAppUserModeDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppUserModeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppUserModeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppUserModeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppUserModeId(strValue);
    }

    @JsonIgnore
    public PSAppUserModeDTO id(String strValue){
        this.setPSAppUserModeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppUserModeDTO){
            PSAppUserModeDTO dto = (PSAppUserModeDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
