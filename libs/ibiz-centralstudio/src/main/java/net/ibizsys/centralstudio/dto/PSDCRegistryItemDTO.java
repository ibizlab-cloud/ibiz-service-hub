package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCRegistryItemDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDCREGISTRYITEMNAME</B>&nbsp;镜像名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCREGISTRYITEMNAME = "psdcregistryitemname";

    /**
     * 设置 镜像名称
     * 
     * @param pSDCRegistryItemName
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYITEMNAME)
    public void setPSDCRegistryItemName(String pSDCRegistryItemName){
        this.set(FIELD_PSDCREGISTRYITEMNAME, pSDCRegistryItemName);
    }
    
    /**
     * 获取 镜像名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCRegistryItemName(){
        Object objValue = this.get(FIELD_PSDCREGISTRYITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRegistryItemNameDirty(){
        if(this.contains(FIELD_PSDCREGISTRYITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像名称
     */
    @JsonIgnore
    public void resetPSDCRegistryItemName(){
        this.reset(FIELD_PSDCREGISTRYITEMNAME);
    }

    /**
     * 设置 镜像名称
     * <P>
     * 等同 {@link #setPSDCRegistryItemName}
     * @param pSDCRegistryItemName
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryitemname(String pSDCRegistryItemName){
        this.setPSDCRegistryItemName(pSDCRegistryItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCRegistryItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCRegistryItemName(strName);
    }

    @JsonIgnore
    public PSDCRegistryItemDTO name(String strName){
        this.setPSDCRegistryItemName(strName);
        return this;
    }

    /**
     * <B>PSDCREGISTRYITEMID</B>&nbsp;中心镜像仓库项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCREGISTRYITEMID = "psdcregistryitemid";

    /**
     * 设置 中心镜像仓库项标识
     * 
     * @param pSDCRegistryItemId
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYITEMID)
    public void setPSDCRegistryItemId(String pSDCRegistryItemId){
        this.set(FIELD_PSDCREGISTRYITEMID, pSDCRegistryItemId);
    }
    
    /**
     * 获取 中心镜像仓库项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCRegistryItemId(){
        Object objValue = this.get(FIELD_PSDCREGISTRYITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中心镜像仓库项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRegistryItemIdDirty(){
        if(this.contains(FIELD_PSDCREGISTRYITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中心镜像仓库项标识
     */
    @JsonIgnore
    public void resetPSDCRegistryItemId(){
        this.reset(FIELD_PSDCREGISTRYITEMID);
    }

    /**
     * 设置 中心镜像仓库项标识
     * <P>
     * 等同 {@link #setPSDCRegistryItemId}
     * @param pSDCRegistryItemId
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryitemid(String pSDCRegistryItemId){
        this.setPSDCRegistryItemId(pSDCRegistryItemId);
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
    public PSDCRegistryItemDTO updatedate(Timestamp updateDate){
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
    public PSDCRegistryItemDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDCRegistryItemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDCRegistryItemDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDCRegistryItemDTO deptid(String deptId){
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
    public PSDCRegistryItemDTO orgid(String orgId){
        this.setOrgId(orgId);
        return this;
    }

    /**
     * <B>PSDCREGISTRYREPONAME</B>&nbsp;镜像仓库
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCREGISTRYREPOID}
     */
    public final static String FIELD_PSDCREGISTRYREPONAME = "psdcregistryreponame";

    /**
     * 设置 镜像仓库
     * 
     * @param pSDCRegistryRepoName
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYREPONAME)
    public void setPSDCRegistryRepoName(String pSDCRegistryRepoName){
        this.set(FIELD_PSDCREGISTRYREPONAME, pSDCRegistryRepoName);
    }
    
    /**
     * 获取 镜像仓库  
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
     * 判断 镜像仓库 是否指定值，包括空值
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
     * 重置 镜像仓库
     */
    @JsonIgnore
    public void resetPSDCRegistryRepoName(){
        this.reset(FIELD_PSDCREGISTRYREPONAME);
    }

    /**
     * 设置 镜像仓库
     * <P>
     * 等同 {@link #setPSDCRegistryRepoName}
     * @param pSDCRegistryRepoName
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryreponame(String pSDCRegistryRepoName){
        this.setPSDCRegistryRepoName(pSDCRegistryRepoName);
        return this;
    }

    /**
     * <B>PSDCREGISTRYREPOID</B>&nbsp;镜像仓库
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCREGISTRYREPOID = "psdcregistryrepoid";

    /**
     * 设置 镜像仓库
     * 
     * @param pSDCRegistryRepoId
     * 
     */
    @JsonProperty(FIELD_PSDCREGISTRYREPOID)
    public void setPSDCRegistryRepoId(String pSDCRegistryRepoId){
        this.set(FIELD_PSDCREGISTRYREPOID, pSDCRegistryRepoId);
    }
    
    /**
     * 获取 镜像仓库  
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
     * 判断 镜像仓库 是否指定值，包括空值
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
     * 重置 镜像仓库
     */
    @JsonIgnore
    public void resetPSDCRegistryRepoId(){
        this.reset(FIELD_PSDCREGISTRYREPOID);
    }

    /**
     * 设置 镜像仓库
     * <P>
     * 等同 {@link #setPSDCRegistryRepoId}
     * @param pSDCRegistryRepoId
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdcregistryrepoid(String pSDCRegistryRepoId){
        this.setPSDCRegistryRepoId(pSDCRegistryRepoId);
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
    public PSDCRegistryItemDTO validflag(Integer validFlag){
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
    public PSDCRegistryItemDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDCRegistryItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ITEMTAG3</B>&nbsp;项标识3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG3 = "itemtag3";

    /**
     * 设置 项标识3
     * 
     * @param itemTag3
     * 
     */
    @JsonProperty(FIELD_ITEMTAG3)
    public void setItemTag3(String itemTag3){
        this.set(FIELD_ITEMTAG3, itemTag3);
    }
    
    /**
     * 获取 项标识3  
     * @return
     */
    @JsonIgnore
    public String getItemTag3(){
        Object objValue = this.get(FIELD_ITEMTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标识3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag3Dirty(){
        if(this.contains(FIELD_ITEMTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标识3
     */
    @JsonIgnore
    public void resetItemTag3(){
        this.reset(FIELD_ITEMTAG3);
    }

    /**
     * 设置 项标识3
     * <P>
     * 等同 {@link #setItemTag3}
     * @param itemTag3
     */
    @JsonIgnore
    public PSDCRegistryItemDTO itemtag3(String itemTag3){
        this.setItemTag3(itemTag3);
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
    public PSDCRegistryItemDTO usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>ITEMTAG2</B>&nbsp;项标识2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG2 = "itemtag2";

    /**
     * 设置 项标识2
     * 
     * @param itemTag2
     * 
     */
    @JsonProperty(FIELD_ITEMTAG2)
    public void setItemTag2(String itemTag2){
        this.set(FIELD_ITEMTAG2, itemTag2);
    }
    
    /**
     * 获取 项标识2  
     * @return
     */
    @JsonIgnore
    public String getItemTag2(){
        Object objValue = this.get(FIELD_ITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag2Dirty(){
        if(this.contains(FIELD_ITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标识2
     */
    @JsonIgnore
    public void resetItemTag2(){
        this.reset(FIELD_ITEMTAG2);
    }

    /**
     * 设置 项标识2
     * <P>
     * 等同 {@link #setItemTag2}
     * @param itemTag2
     */
    @JsonIgnore
    public PSDCRegistryItemDTO itemtag2(String itemTag2){
        this.setItemTag2(itemTag2);
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
    public PSDCRegistryItemDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>ITEMTAG4</B>&nbsp;项标识4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG4 = "itemtag4";

    /**
     * 设置 项标识4
     * 
     * @param itemTag4
     * 
     */
    @JsonProperty(FIELD_ITEMTAG4)
    public void setItemTag4(String itemTag4){
        this.set(FIELD_ITEMTAG4, itemTag4);
    }
    
    /**
     * 获取 项标识4  
     * @return
     */
    @JsonIgnore
    public String getItemTag4(){
        Object objValue = this.get(FIELD_ITEMTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标识4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag4Dirty(){
        if(this.contains(FIELD_ITEMTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标识4
     */
    @JsonIgnore
    public void resetItemTag4(){
        this.reset(FIELD_ITEMTAG4);
    }

    /**
     * 设置 项标识4
     * <P>
     * 等同 {@link #setItemTag4}
     * @param itemTag4
     */
    @JsonIgnore
    public PSDCRegistryItemDTO itemtag4(String itemTag4){
        this.setItemTag4(itemTag4);
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
    public PSDCRegistryItemDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>ITEMTAG</B>&nbsp;镜像类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.RegistryItemType} 
     */
    public final static String FIELD_ITEMTAG = "itemtag";

    /**
     * 设置 镜像类型
     * 
     * @param itemTag
     * 
     */
    @JsonProperty(FIELD_ITEMTAG)
    public void setItemTag(String itemTag){
        this.set(FIELD_ITEMTAG, itemTag);
    }
    
    /**
     * 获取 镜像类型  
     * @return
     */
    @JsonIgnore
    public String getItemTag(){
        Object objValue = this.get(FIELD_ITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 镜像类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTagDirty(){
        if(this.contains(FIELD_ITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 镜像类型
     */
    @JsonIgnore
    public void resetItemTag(){
        this.reset(FIELD_ITEMTAG);
    }

    /**
     * 设置 镜像类型
     * <P>
     * 等同 {@link #setItemTag}
     * @param itemTag
     */
    @JsonIgnore
    public PSDCRegistryItemDTO itemtag(String itemTag){
        this.setItemTag(itemTag);
        return this;
    }

     /**
     * 设置 镜像类型
     * <P>
     * 等同 {@link #setItemTag}
     * @param itemTag
     */
    @JsonIgnore
    public PSDCRegistryItemDTO itemtag(net.ibizsys.centralstudio.util.CentralEnums.RegistryItemType itemTag){
        if(itemTag == null){
            this.setItemTag(null);
        }
        else{
            this.setItemTag(itemTag.value);
        }
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
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
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDCRegistryItemDTO logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDCRegistryItemDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统标识
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统标识
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSNAME</B>&nbsp;开发系统
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNSYSNAME = "psdevslnsysname";

    /**
     * 设置 开发系统
     * 
     * @param pSDevSlnSysName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSNAME)
    public void setPSDevSlnSysName(String pSDevSlnSysName){
        this.set(FIELD_PSDEVSLNSYSNAME, pSDevSlnSysName);
    }
    
    /**
     * 获取 开发系统  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysName(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysNameDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统
     */
    @JsonIgnore
    public void resetPSDevSlnSysName(){
        this.reset(FIELD_PSDEVSLNSYSNAME);
    }

    /**
     * 设置 开发系统
     * <P>
     * 等同 {@link #setPSDevSlnSysName}
     * @param pSDevSlnSysName
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnsysname(String pSDevSlnSysName){
        this.setPSDevSlnSysName(pSDevSlnSysName);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnName(){
        Object objValue = this.get(FIELD_PSDEVSLNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnNameDirty(){
        if(this.contains(FIELD_PSDEVSLNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNSYSID}
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案标识
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnId(){
        Object objValue = this.get(FIELD_PSDEVSLNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnIdDirty(){
        if(this.contains(FIELD_PSDEVSLNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案标识
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案标识
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
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
    public PSDCRegistryItemDTO connstr(String connStr){
        this.setConnStr(connStr);
        return this;
    }

    /**
     * <B>ITEMPARAMS</B>&nbsp;项参数
     */
    public final static String FIELD_ITEMPARAMS = "itemparams";

    /**
     * 设置 项参数
     * 
     * @param itemParams
     * 
     */
    @JsonProperty(FIELD_ITEMPARAMS)
    public void setItemParams(String itemParams){
        this.set(FIELD_ITEMPARAMS, itemParams);
    }
    
    /**
     * 获取 项参数  
     * @return
     */
    @JsonIgnore
    public String getItemParams(){
        Object objValue = this.get(FIELD_ITEMPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemParamsDirty(){
        if(this.contains(FIELD_ITEMPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项参数
     */
    @JsonIgnore
    public void resetItemParams(){
        this.reset(FIELD_ITEMPARAMS);
    }

    /**
     * 设置 项参数
     * <P>
     * 等同 {@link #setItemParams}
     * @param itemParams
     */
    @JsonIgnore
    public PSDCRegistryItemDTO itemparams(String itemParams){
        this.setItemParams(itemParams);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPLOYID</B>&nbsp;开发方案微服务部署标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNMSDEPLOYID = "psdevslnmsdeployid";

    /**
     * 设置 开发方案微服务部署标识
     * 
     * @param pSDevSlnMSDeployId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPLOYID)
    public void setPSDevSlnMSDeployId(String pSDevSlnMSDeployId){
        this.set(FIELD_PSDEVSLNMSDEPLOYID, pSDevSlnMSDeployId);
    }
    
    /**
     * 获取 开发方案微服务部署标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDeployId(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPLOYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案微服务部署标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDeployIdDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPLOYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案微服务部署标识
     */
    @JsonIgnore
    public void resetPSDevSlnMSDeployId(){
        this.reset(FIELD_PSDEVSLNMSDEPLOYID);
    }

    /**
     * 设置 开发方案微服务部署标识
     * <P>
     * 等同 {@link #setPSDevSlnMSDeployId}
     * @param pSDevSlnMSDeployId
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnmsdeployid(String pSDevSlnMSDeployId){
        this.setPSDevSlnMSDeployId(pSDevSlnMSDeployId);
        return this;
    }

    /**
     * <B>PSDEVSLNMSDEPLOYNAME</B>&nbsp;部署名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNMSDEPLOYID}
     */
    public final static String FIELD_PSDEVSLNMSDEPLOYNAME = "psdevslnmsdeployname";

    /**
     * 设置 部署名称
     * 
     * @param pSDevSlnMSDeployName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNMSDEPLOYNAME)
    public void setPSDevSlnMSDeployName(String pSDevSlnMSDeployName){
        this.set(FIELD_PSDEVSLNMSDEPLOYNAME, pSDevSlnMSDeployName);
    }
    
    /**
     * 获取 部署名称  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnMSDeployName(){
        Object objValue = this.get(FIELD_PSDEVSLNMSDEPLOYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部署名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnMSDeployNameDirty(){
        if(this.contains(FIELD_PSDEVSLNMSDEPLOYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部署名称
     */
    @JsonIgnore
    public void resetPSDevSlnMSDeployName(){
        this.reset(FIELD_PSDEVSLNMSDEPLOYNAME);
    }

    /**
     * 设置 部署名称
     * <P>
     * 等同 {@link #setPSDevSlnMSDeployName}
     * @param pSDevSlnMSDeployName
     */
    @JsonIgnore
    public PSDCRegistryItemDTO psdevslnmsdeployname(String pSDevSlnMSDeployName){
        this.setPSDevSlnMSDeployName(pSDevSlnMSDeployName);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCRegistryItemId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCRegistryItemDTO){
            PSDCRegistryItemDTO dto = (PSDCRegistryItemDTO)iEntity;
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