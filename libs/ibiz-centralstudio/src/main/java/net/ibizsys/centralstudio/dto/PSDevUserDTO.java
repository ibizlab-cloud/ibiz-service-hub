package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDevUserDTO extends CentralEntityDTOBase{

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
    public PSDevUserDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PSDEVUSERID</B>&nbsp;应用中心用户标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVUSERID = "psdevuserid";

    public final static String FIELD_PSDEVUSEROBJID = "psdevuserobjid";

    /**
     * 设置 应用中心用户标识
     * 
     * @param pSDevUserId
     * 
     */
    @JsonProperty(FIELD_PSDEVUSERID)
    public void setPSDevUserId(String pSDevUserId){
        this.set(FIELD_PSDEVUSERID, pSDevUserId);
        this.set(FIELD_PSDEVUSEROBJID, pSDevUserId);        
    }
    
    /**
     * 获取 应用中心用户标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevUserId(){
        Object objValue = this.get(FIELD_PSDEVUSERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心用户标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevUserIdDirty(){
        if(this.contains(FIELD_PSDEVUSERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心用户标识
     */
    @JsonIgnore
    public void resetPSDevUserId(){
        this.reset(FIELD_PSDEVUSERID);
        this.reset(FIELD_PSDEVUSEROBJID);        
    }

    /**
     * 设置 应用中心用户标识
     * <P>
     * 等同 {@link #setPSDevUserId}
     * @param pSDevUserId
     */
    @JsonIgnore
    public PSDevUserDTO psdevuserid(String pSDevUserId){
        this.setPSDevUserId(pSDevUserId);
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
    public PSDevUserDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDevUserDTO createdate(Timestamp createDate){
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
    public PSDevUserDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEVUSERNAME</B>&nbsp;应用中心用户名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVUSERNAME = "psdevusername";
    
    public final static String FIELD_PSDEVUSEROBJNAME = "psdevuserobjname";

    /**
     * 设置 应用中心用户名称
     * 
     * @param pSDevUserName
     * 
     */
    @JsonProperty(FIELD_PSDEVUSERNAME)
    public void setPSDevUserName(String pSDevUserName){
        this.set(FIELD_PSDEVUSERNAME, pSDevUserName);
        this.set(FIELD_PSDEVUSEROBJNAME, pSDevUserName);        
    }
    
    /**
     * 获取 应用中心用户名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevUserName(){
        Object objValue = this.get(FIELD_PSDEVUSERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心用户名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevUserNameDirty(){
        if(this.contains(FIELD_PSDEVUSERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心用户名称
     */
    @JsonIgnore
    public void resetPSDevUserName(){
        this.reset(FIELD_PSDEVUSERNAME);
        this.reset(FIELD_PSDEVUSEROBJNAME);        
    }

    /**
     * 设置 应用中心用户名称
     * <P>
     * 等同 {@link #setPSDevUserName}
     * @param pSDevUserName
     */
    @JsonIgnore
    public PSDevUserDTO psdevusername(String pSDevUserName){
        this.setPSDevUserName(pSDevUserName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDevUserName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDevUserName(strName);
    }

    @JsonIgnore
    public PSDevUserDTO name(String strName){
        this.setPSDevUserName(strName);
        return this;
    }

    /**
     * <B>ADMINMODE</B>&nbsp;中心管理员
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ADMINMODE = "adminmode";

    /**
     * 设置 中心管理员
     * 
     * @param adminMode
     * 
     */
    @JsonProperty(FIELD_ADMINMODE)
    public void setAdminMode(Integer adminMode){
        this.set(FIELD_ADMINMODE, adminMode);
    }
    
    /**
     * 获取 中心管理员  
     * @return
     */
    @JsonIgnore
    public Integer getAdminMode(){
        Object objValue = this.get(FIELD_ADMINMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 中心管理员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAdminModeDirty(){
        if(this.contains(FIELD_ADMINMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心管理员
     */
    @JsonIgnore
    public void resetAdminMode(){
        this.reset(FIELD_ADMINMODE);
    }

    /**
     * 设置 中心管理员
     * <P>
     * 等同 {@link #setAdminMode}
     * @param adminMode
     */
    @JsonIgnore
    public PSDevUserDTO adminmode(Integer adminMode){
        this.setAdminMode(adminMode);
        return this;
    }

     /**
     * 设置 中心管理员
     * <P>
     * 等同 {@link #setAdminMode}
     * @param adminMode
     */
    @JsonIgnore
    public PSDevUserDTO adminmode(Boolean adminMode){
        if(adminMode == null){
            this.setAdminMode(null);
        }
        else{
            this.setAdminMode(adminMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLE</B>&nbsp;逻辑有效标志
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNoColor3} 
     */
    public final static String FIELD_ENABLE = "enable";

    /**
     * 设置 逻辑有效标志
     * 
     * @param enable
     * 
     */
    @JsonProperty(FIELD_ENABLE)
    public void setEnable(Integer enable){
        this.set(FIELD_ENABLE, enable);
    }
    
    /**
     * 获取 逻辑有效标志  
     * @return
     */
    @JsonIgnore
    public Integer getEnable(){
        Object objValue = this.get(FIELD_ENABLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 逻辑有效标志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDirty(){
        if(this.contains(FIELD_ENABLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑有效标志
     */
    @JsonIgnore
    public void resetEnable(){
        this.reset(FIELD_ENABLE);
    }

    /**
     * 设置 逻辑有效标志
     * <P>
     * 等同 {@link #setEnable}
     * @param enable
     */
    @JsonIgnore
    public PSDevUserDTO enable(Integer enable){
        this.setEnable(enable);
        return this;
    }

     /**
     * 设置 逻辑有效标志
     * <P>
     * 等同 {@link #setEnable}
     * @param enable
     */
    @JsonIgnore
    public PSDevUserDTO enable(Boolean enable){
        if(enable == null){
            this.setEnable(null);
        }
        else{
            this.setEnable(enable?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FULLLOGINNAME</B>&nbsp;完整登录名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FULLLOGINNAME = "fullloginname";

    /**
     * 设置 完整登录名称
     * 
     * @param fullLoginName
     * 
     */
    @JsonProperty(FIELD_FULLLOGINNAME)
    public void setFullLoginName(String fullLoginName){
        this.set(FIELD_FULLLOGINNAME, fullLoginName);
    }
    
    /**
     * 获取 完整登录名称  
     * @return
     */
    @JsonIgnore
    public String getFullLoginName(){
        Object objValue = this.get(FIELD_FULLLOGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完整登录名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullLoginNameDirty(){
        if(this.contains(FIELD_FULLLOGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完整登录名称
     */
    @JsonIgnore
    public void resetFullLoginName(){
        this.reset(FIELD_FULLLOGINNAME);
    }

    /**
     * 设置 完整登录名称
     * <P>
     * 等同 {@link #setFullLoginName}
     * @param fullLoginName
     */
    @JsonIgnore
    public PSDevUserDTO fullloginname(String fullLoginName){
        this.setFullLoginName(fullLoginName);
        return this;
    }

    /**
     * <B>LOGINNAME</B>&nbsp;登录名称
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_LOGINNAME = "loginname";

    /**
     * 设置 登录名称
     * 
     * @param loginName
     * 
     */
    @JsonProperty(FIELD_LOGINNAME)
    public void setLoginName(String loginName){
        this.set(FIELD_LOGINNAME, loginName);
    }
    
    /**
     * 获取 登录名称  
     * @return
     */
    @JsonIgnore
    public String getLoginName(){
        Object objValue = this.get(FIELD_LOGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 登录名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLoginNameDirty(){
        if(this.contains(FIELD_LOGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 登录名称
     */
    @JsonIgnore
    public void resetLoginName(){
        this.reset(FIELD_LOGINNAME);
    }

    /**
     * 设置 登录名称
     * <P>
     * 等同 {@link #setLoginName}
     * @param loginName
     */
    @JsonIgnore
    public PSDevUserDTO loginname(String loginName){
        this.setLoginName(loginName);
        return this;
    }

    /**
     * <B>LOGINPWD</B>&nbsp;登录密码
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_LOGINPWD = "loginpwd";

    /**
     * 设置 登录密码
     * 
     * @param loginPwd
     * 
     */
    @JsonProperty(FIELD_LOGINPWD)
    public void setLoginPwd(String loginPwd){
        this.set(FIELD_LOGINPWD, loginPwd);
    }
    
    /**
     * 获取 登录密码  
     * @return
     */
    @JsonIgnore
    public String getLoginPwd(){
        Object objValue = this.get(FIELD_LOGINPWD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 登录密码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLoginPwdDirty(){
        if(this.contains(FIELD_LOGINPWD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 登录密码
     */
    @JsonIgnore
    public void resetLoginPwd(){
        this.reset(FIELD_LOGINPWD);
    }

    /**
     * 设置 登录密码
     * <P>
     * 等同 {@link #setLoginPwd}
     * @param loginPwd
     */
    @JsonIgnore
    public PSDevUserDTO loginpwd(String loginPwd){
        this.setLoginPwd(loginPwd);
        return this;
    }

    /**
     * <B>USERMODE</B>&nbsp;用户模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_USERMODE = "usermode";

    /**
     * 设置 用户模式
     * 
     * @param userMode
     * 
     */
    @JsonProperty(FIELD_USERMODE)
    public void setUserMode(String userMode){
        this.set(FIELD_USERMODE, userMode);
    }
    
    /**
     * 获取 用户模式  
     * @return
     */
    @JsonIgnore
    public String getUserMode(){
        Object objValue = this.get(FIELD_USERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserModeDirty(){
        if(this.contains(FIELD_USERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户模式
     */
    @JsonIgnore
    public void resetUserMode(){
        this.reset(FIELD_USERMODE);
    }

    /**
     * 设置 用户模式
     * <P>
     * 等同 {@link #setUserMode}
     * @param userMode
     */
    @JsonIgnore
    public PSDevUserDTO usermode(String userMode){
        this.setUserMode(userMode);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDevUserId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDevUserDTO){
            PSDevUserDTO dto = (PSDevUserDTO)iEntity;
        }
        super.copyTo(iEntity);
    }

    @Override
    protected Map<String, Object> prepareAny() {
        Map<String, Object> any = super.prepareAny();
        if(any != null){
            any.remove(FIELD_CREATEMAN);
            any.remove(FIELD_UPDATEMAN);
            any.remove(FIELD_CREATEDATE);
            any.remove(FIELD_UPDATEDATE);
            any.remove(FIELD_ENABLE);
        }
        return any;
    }
    
}