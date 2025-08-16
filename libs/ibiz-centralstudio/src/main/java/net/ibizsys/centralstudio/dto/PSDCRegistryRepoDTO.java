package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCRegistryRepoDTO extends CentralEntityDTOBase{

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
    public PSDCRegistryRepoDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDCRegistryRepoDTO createdate(Timestamp createDate){
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
    public PSDCRegistryRepoDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDCREGISTRYREPOID</B>&nbsp;中心镜像仓库标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCREGISTRYREPOID = "psdcregistryrepoid";

    /**
     * 设置 中心镜像仓库标识
     * 
     * @param pSDCRegistryRepoId
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYREPOID)
    public void setPSDCRegistryRepoId(String pSDCRegistryRepoId){
        this.set(FIELD_PSDCREGISTRYREPOID, pSDCRegistryRepoId);
    }
    
    /**
     * 获取 中心镜像仓库标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCRegistryRepoId(){
        Object objValue = this.get(FIELD_PSDCREGISTRYREPOID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心镜像仓库标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRegistryRepoIdDirty(){
        if(this.contains(FIELD_PSDCREGISTRYREPOID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心镜像仓库标识
     */
    @JsonIgnore
    public void resetPSDCRegistryRepoId(){
        this.reset(FIELD_PSDCREGISTRYREPOID);
    }

    /**
     * 设置 中心镜像仓库标识
     * <P>
     * 等同 {@link #setPSDCRegistryRepoId}
     * @param pSDCRegistryRepoId
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO psdcregistryrepoid(String pSDCRegistryRepoId){
        this.setPSDCRegistryRepoId(pSDCRegistryRepoId);
        return this;
    }

    /**
     * <B>PSDCREGISTRYREPONAME</B>&nbsp;镜像仓库名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCREGISTRYREPONAME = "psdcregistryreponame";

    /**
     * 设置 镜像仓库名称
     * 
     * @param pSDCRegistryRepoName
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYREPONAME)
    public void setPSDCRegistryRepoName(String pSDCRegistryRepoName){
        this.set(FIELD_PSDCREGISTRYREPONAME, pSDCRegistryRepoName);
    }
    
    /**
     * 获取 镜像仓库名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCRegistryRepoName(){
        Object objValue = this.get(FIELD_PSDCREGISTRYREPONAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像仓库名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRegistryRepoNameDirty(){
        if(this.contains(FIELD_PSDCREGISTRYREPONAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像仓库名称
     */
    @JsonIgnore
    public void resetPSDCRegistryRepoName(){
        this.reset(FIELD_PSDCREGISTRYREPONAME);
    }

    /**
     * 设置 镜像仓库名称
     * <P>
     * 等同 {@link #setPSDCRegistryRepoName}
     * @param pSDCRegistryRepoName
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO psdcregistryreponame(String pSDCRegistryRepoName){
        this.setPSDCRegistryRepoName(pSDCRegistryRepoName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCRegistryRepoName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCRegistryRepoName(strName);
    }

    @JsonIgnore
    public PSDCRegistryRepoDTO name(String strName){
        this.setPSDCRegistryRepoName(strName);
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
    public PSDCRegistryRepoDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>DEPTID</B>&nbsp;组织部门标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPTID = "deptid";

    /**
     * 设置 组织部门标识
     * 
     * @param deptId
     * 
     */
    @JsonProperty(FIELD_DEPTID)
    public void setDeptId(String deptId){
        this.set(FIELD_DEPTID, deptId);
    }
    
    /**
     * 获取 组织部门标识  
     * @return
     */
    @JsonIgnore
    public String getDeptId(){
        Object objValue = this.get(FIELD_DEPTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组织部门标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeptIdDirty(){
        if(this.contains(FIELD_DEPTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组织部门标识
     */
    @JsonIgnore
    public void resetDeptId(){
        this.reset(FIELD_DEPTID);
    }

    /**
     * 设置 组织部门标识
     * <P>
     * 等同 {@link #setDeptId}
     * @param deptId
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO deptid(String deptId){
        this.setDeptId(deptId);
        return this;
    }

    /**
     * <B>ORGID</B>&nbsp;组织机构标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_ORGID = "orgid";

    /**
     * 设置 组织机构标识
     * 
     * @param orgId
     * 
     */
    @JsonProperty(FIELD_ORGID)
    public void setOrgId(String orgId){
        this.set(FIELD_ORGID, orgId);
    }
    
    /**
     * 获取 组织机构标识  
     * @return
     */
    @JsonIgnore
    public String getOrgId(){
        Object objValue = this.get(FIELD_ORGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组织机构标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrgIdDirty(){
        if(this.contains(FIELD_ORGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组织机构标识
     */
    @JsonIgnore
    public void resetOrgId(){
        this.reset(FIELD_ORGID);
    }

    /**
     * 设置 组织机构标识
     * <P>
     * 等同 {@link #setOrgId}
     * @param orgId
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO orgid(String orgId){
        this.setOrgId(orgId);
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
    public PSDCRegistryRepoDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ROUSERNAME</B>&nbsp;只读库用户
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_ROUSERNAME = "rousername";

    /**
     * 设置 只读库用户
     * 
     * @param rOUserName
     * 
     */
    @JsonProperty(FIELD_ROUSERNAME)
    public void setROUserName(String rOUserName){
        this.set(FIELD_ROUSERNAME, rOUserName);
    }
    
    /**
     * 获取 只读库用户  
     * @return
     */
    @JsonIgnore
    public String getROUserName(){
        Object objValue = this.get(FIELD_ROUSERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 只读库用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isROUserNameDirty(){
        if(this.contains(FIELD_ROUSERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只读库用户
     */
    @JsonIgnore
    public void resetROUserName(){
        this.reset(FIELD_ROUSERNAME);
    }

    /**
     * 设置 只读库用户
     * <P>
     * 等同 {@link #setROUserName}
     * @param rOUserName
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO rousername(String rOUserName){
        this.setROUserName(rOUserName);
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
    public PSDCRegistryRepoDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>PARAM3</B>&nbsp;参数3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM3 = "param3";

    /**
     * 设置 参数3
     * 
     * @param param3
     * 
     */
    @JsonProperty(FIELD_PARAM3)
    public void setParam3(String param3){
        this.set(FIELD_PARAM3, param3);
    }
    
    /**
     * 获取 参数3  
     * @return
     */
    @JsonIgnore
    public String getParam3(){
        Object objValue = this.get(FIELD_PARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam3Dirty(){
        if(this.contains(FIELD_PARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数3
     */
    @JsonIgnore
    public void resetParam3(){
        this.reset(FIELD_PARAM3);
    }

    /**
     * 设置 参数3
     * <P>
     * 等同 {@link #setParam3}
     * @param param3
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO param3(String param3){
        this.setParam3(param3);
        return this;
    }

    /**
     * <B>REGISTRYPASSWD</B>&nbsp;库密码
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REGISTRYPASSWD = "registrypasswd";

    /**
     * 设置 库密码
     * 
     * @param registryPasswd
     * 
     */
    @JsonProperty(FIELD_REGISTRYPASSWD)
    public void setRegistryPasswd(String registryPasswd){
        this.set(FIELD_REGISTRYPASSWD, registryPasswd);
    }
    
    /**
     * 获取 库密码  
     * @return
     */
    @JsonIgnore
    public String getRegistryPasswd(){
        Object objValue = this.get(FIELD_REGISTRYPASSWD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 库密码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegistryPasswdDirty(){
        if(this.contains(FIELD_REGISTRYPASSWD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 库密码
     */
    @JsonIgnore
    public void resetRegistryPasswd(){
        this.reset(FIELD_REGISTRYPASSWD);
    }

    /**
     * 设置 库密码
     * <P>
     * 等同 {@link #setRegistryPasswd}
     * @param registryPasswd
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO registrypasswd(String registryPasswd){
        this.setRegistryPasswd(registryPasswd);
        return this;
    }

    /**
     * <B>PARAM</B>&nbsp;参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM = "param";

    /**
     * 设置 参数
     * 
     * @param param
     * 
     */
    @JsonProperty(FIELD_PARAM)
    public void setParam(String param){
        this.set(FIELD_PARAM, param);
    }
    
    /**
     * 获取 参数  
     * @return
     */
    @JsonIgnore
    public String getParam(){
        Object objValue = this.get(FIELD_PARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDirty(){
        if(this.contains(FIELD_PARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数
     */
    @JsonIgnore
    public void resetParam(){
        this.reset(FIELD_PARAM);
    }

    /**
     * 设置 参数
     * <P>
     * 等同 {@link #setParam}
     * @param param
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO param(String param){
        this.setParam(param);
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
    public PSDCRegistryRepoDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>REGISTRYUSERNAME</B>&nbsp;库用户
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_REGISTRYUSERNAME = "registryusername";

    /**
     * 设置 库用户
     * 
     * @param registryUserName
     * 
     */
    @JsonProperty(FIELD_REGISTRYUSERNAME)
    public void setRegistryUserName(String registryUserName){
        this.set(FIELD_REGISTRYUSERNAME, registryUserName);
    }
    
    /**
     * 获取 库用户  
     * @return
     */
    @JsonIgnore
    public String getRegistryUserName(){
        Object objValue = this.get(FIELD_REGISTRYUSERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 库用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegistryUserNameDirty(){
        if(this.contains(FIELD_REGISTRYUSERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 库用户
     */
    @JsonIgnore
    public void resetRegistryUserName(){
        this.reset(FIELD_REGISTRYUSERNAME);
    }

    /**
     * 设置 库用户
     * <P>
     * 等同 {@link #setRegistryUserName}
     * @param registryUserName
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO registryusername(String registryUserName){
        this.setRegistryUserName(registryUserName);
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
    public PSDCRegistryRepoDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>PARAM4</B>&nbsp;参数4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM4 = "param4";

    /**
     * 设置 参数4
     * 
     * @param param4
     * 
     */
    @JsonProperty(FIELD_PARAM4)
    public void setParam4(String param4){
        this.set(FIELD_PARAM4, param4);
    }
    
    /**
     * 获取 参数4  
     * @return
     */
    @JsonIgnore
    public String getParam4(){
        Object objValue = this.get(FIELD_PARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam4Dirty(){
        if(this.contains(FIELD_PARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数4
     */
    @JsonIgnore
    public void resetParam4(){
        this.reset(FIELD_PARAM4);
    }

    /**
     * 设置 参数4
     * <P>
     * 等同 {@link #setParam4}
     * @param param4
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO param4(String param4){
        this.setParam4(param4);
        return this;
    }

    /**
     * <B>ROPASSWD</B>&nbsp;只读库密码
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ROPASSWD = "ropasswd";

    /**
     * 设置 只读库密码
     * 
     * @param rOPasswd
     * 
     */
    @JsonProperty(FIELD_ROPASSWD)
    public void setROPasswd(String rOPasswd){
        this.set(FIELD_ROPASSWD, rOPasswd);
    }
    
    /**
     * 获取 只读库密码  
     * @return
     */
    @JsonIgnore
    public String getROPasswd(){
        Object objValue = this.get(FIELD_ROPASSWD);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 只读库密码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isROPasswdDirty(){
        if(this.contains(FIELD_ROPASSWD)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只读库密码
     */
    @JsonIgnore
    public void resetROPasswd(){
        this.reset(FIELD_ROPASSWD);
    }

    /**
     * 设置 只读库密码
     * <P>
     * 等同 {@link #setROPasswd}
     * @param rOPasswd
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO ropasswd(String rOPasswd){
        this.setROPasswd(rOPasswd);
        return this;
    }

    /**
     * <B>PARAM2</B>&nbsp;参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PARAM2 = "param2";

    /**
     * 设置 参数2
     * 
     * @param param2
     * 
     */
    @JsonProperty(FIELD_PARAM2)
    public void setParam2(String param2){
        this.set(FIELD_PARAM2, param2);
    }
    
    /**
     * 获取 参数2  
     * @return
     */
    @JsonIgnore
    public String getParam2(){
        Object objValue = this.get(FIELD_PARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam2Dirty(){
        if(this.contains(FIELD_PARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数2
     */
    @JsonIgnore
    public void resetParam2(){
        this.reset(FIELD_PARAM2);
    }

    /**
     * 设置 参数2
     * <P>
     * 等同 {@link #setParam2}
     * @param param2
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO param2(String param2){
        this.setParam2(param2);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;中心默认仓库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 中心默认仓库
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 中心默认仓库  
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
     * 判断 中心默认仓库 是否指定值，包括空值
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
     * 重置 中心默认仓库
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 中心默认仓库
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 中心默认仓库
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDCRegistryRepoDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>CONNSTR</B>&nbsp;连接串
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CONNSTR = "connstr";

    /**
     * 设置 连接串
     * 
     * @param connStr
     * 
     */
    @JsonProperty(FIELD_CONNSTR)
    public void setConnStr(String connStr){
        this.set(FIELD_CONNSTR, connStr);
    }
    
    /**
     * 获取 连接串  
     * @return
     */
    @JsonIgnore
    public String getConnStr(){
        Object objValue = this.get(FIELD_CONNSTR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 连接串 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConnStrDirty(){
        if(this.contains(FIELD_CONNSTR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 连接串
     */
    @JsonIgnore
    public void resetConnStr(){
        this.reset(FIELD_CONNSTR);
    }

    /**
     * 设置 连接串
     * <P>
     * 等同 {@link #setConnStr}
     * @param connStr
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO connstr(String connStr){
        this.setConnStr(connStr);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
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
    public PSDCRegistryRepoDTO validflag(Integer validFlag){
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
    public PSDCRegistryRepoDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>REGISTRYTYPE</B>&nbsp;镜像服务器类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.RepoType} 
     */
    public final static String FIELD_REGISTRYTYPE = "registrytype";

    /**
     * 设置 镜像服务器类型
     * 
     * @param registryType
     * 
     */
    @JsonProperty(FIELD_REGISTRYTYPE)
    public void setRegistryType(String registryType){
        this.set(FIELD_REGISTRYTYPE, registryType);
    }
    
    /**
     * 获取 镜像服务器类型  
     * @return
     */
    @JsonIgnore
    public String getRegistryType(){
        Object objValue = this.get(FIELD_REGISTRYTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像服务器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRegistryTypeDirty(){
        if(this.contains(FIELD_REGISTRYTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像服务器类型
     */
    @JsonIgnore
    public void resetRegistryType(){
        this.reset(FIELD_REGISTRYTYPE);
    }

    /**
     * 设置 镜像服务器类型
     * <P>
     * 等同 {@link #setRegistryType}
     * @param registryType
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO registrytype(String registryType){
        this.setRegistryType(registryType);
        return this;
    }

     /**
     * 设置 镜像服务器类型
     * <P>
     * 等同 {@link #setRegistryType}
     * @param registryType
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO registrytype(net.ibizsys.centralstudio.util.CentralEnums.RepoType registryType){
        if(registryType == null){
            this.setRegistryType(null);
        }
        else{
            this.setRegistryType(registryType.value);
        }
        return this;
    }

    /**
     * <B>RESPOS</B>&nbsp;资源来源
     */
    public final static String FIELD_RESPOS = "respos";

    /**
     * 设置 资源来源
     * 
     * @param resPos
     * 
     */
    @JsonProperty(FIELD_RESPOS)
    public void setResPos(Integer resPos){
        this.set(FIELD_RESPOS, resPos);
    }
    
    /**
     * 获取 资源来源  
     * @return
     */
    @JsonIgnore
    public Integer getResPos(){
        Object objValue = this.get(FIELD_RESPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 资源来源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResPosDirty(){
        if(this.contains(FIELD_RESPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源来源
     */
    @JsonIgnore
    public void resetResPos(){
        this.reset(FIELD_RESPOS);
    }

    /**
     * 设置 资源来源
     * <P>
     * 等同 {@link #setResPos}
     * @param resPos
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO respos(Integer resPos){
        this.setResPos(resPos);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;应用中心
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterName(){
        Object objValue = this.get(FIELD_PSDEVCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterId(){
        Object objValue = this.get(FIELD_PSDEVCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDCRegistryRepoDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCRegistryRepoId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCRegistryRepoDTO){
            PSDCRegistryRepoDTO dto = (PSDCRegistryRepoDTO)iEntity;
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
        }
        return any;
    }
    
}