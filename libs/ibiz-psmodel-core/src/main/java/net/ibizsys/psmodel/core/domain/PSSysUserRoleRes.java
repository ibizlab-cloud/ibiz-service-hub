package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSUSERROLERES</B>系统角色资源能力 模型传输对象
 * <P>
 * 系统操作角色的统一资源能力定义模型，将系统统一资源分配到系统操作角色
 */
public class PSSysUserRoleRes extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysUserRoleRes(){
        this.setValidFlag(1);
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
    public PSSysUserRoleRes createdate(String createDate){
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
    public PSSysUserRoleRes createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSSysUserRoleRes memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSSYSUSERROLEID</B>&nbsp;系统操作角色，指定系统操作角色资源能力所属的系统操作角色
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUserRole} 
     */
    public final static String FIELD_PSSYSUSERROLEID = "pssysuserroleid";

    /**
     * 设置 系统操作角色，详细说明：{@link #FIELD_PSSYSUSERROLEID}
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
     * 获取 系统操作角色  
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
     * 判断 系统操作角色 是否指定值，包括空值
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
     * 重置 系统操作角色
     */
    @JsonIgnore
    public void resetPSSysUserRoleId(){
        this.reset(FIELD_PSSYSUSERROLEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysopprivid");
    }

    /**
     * 设置 系统操作角色，详细说明：{@link #FIELD_PSSYSUSERROLEID}
     * <P>
     * 等同 {@link #setPSSysUserRoleId}
     * @param pSSysUserRoleId
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuserroleid(String pSSysUserRoleId){
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    /**
     * 设置 系统操作角色，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserRoleId}
     * @param pSSysUserRole 引用对象
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuserroleid(PSSysUserRole pSSysUserRole){
        if(pSSysUserRole == null){
            this.setPSSysUserRoleId(null);
            this.setPSSysUserRoleName(null);
        }
        else{
            this.setPSSysUserRoleId(pSSysUserRole.getPSSysUserRoleId());
            this.setPSSysUserRoleName(pSSysUserRole.getPSSysUserRoleName());
        }
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
     * <B>PSSYSUSERROLENAME</B>&nbsp;系统操作角色，指定系统操作角色资源能力所属的系统操作角色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERROLEID}
     */
    public final static String FIELD_PSSYSUSERROLENAME = "pssysuserrolename";

    /**
     * 设置 系统操作角色，详细说明：{@link #FIELD_PSSYSUSERROLENAME}
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
     * 获取 系统操作角色  
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
     * 判断 系统操作角色 是否指定值，包括空值
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
     * 重置 系统操作角色
     */
    @JsonIgnore
    public void resetPSSysUserRoleName(){
        this.reset(FIELD_PSSYSUSERROLENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysopprivname");
    }

    /**
     * 设置 系统操作角色，详细说明：{@link #FIELD_PSSYSUSERROLENAME}
     * <P>
     * 等同 {@link #setPSSysUserRoleName}
     * @param pSSysUserRoleName
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuserrolename(String pSSysUserRoleName){
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

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，指定系统操作角色资源能力分配的系统统一资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUniRes} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuniresid(PSSysUniRes pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，指定系统操作角色资源能力分配的系统统一资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PSSYSUSERROLERESID</B>&nbsp;系统用户角色资源标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUSERROLERESID = "pssysuserroleresid";

    /**
     * 设置 系统用户角色资源标识
     * 
     * @param pSSysUserRoleResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERROLERESID)
    public void setPSSysUserRoleResId(String pSSysUserRoleResId){
        this.set(FIELD_PSSYSUSERROLERESID, pSSysUserRoleResId);
    }
    
    /**
     * 获取 系统用户角色资源标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserRoleResId(){
        Object objValue = this.get(FIELD_PSSYSUSERROLERESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用户角色资源标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserRoleResIdDirty(){
        if(this.contains(FIELD_PSSYSUSERROLERESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用户角色资源标识
     */
    @JsonIgnore
    public void resetPSSysUserRoleResId(){
        this.reset(FIELD_PSSYSUSERROLERESID);
    }

    /**
     * 设置 系统用户角色资源标识
     * <P>
     * 等同 {@link #setPSSysUserRoleResId}
     * @param pSSysUserRoleResId
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuserroleresid(String pSSysUserRoleResId){
        this.setPSSysUserRoleResId(pSSysUserRoleResId);
        return this;
    }

    /**
     * <B>PSSYSUSERROLERESNAME</B>&nbsp;系统角色资源名称，指定系统操作角色资源能力的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUSERROLERESNAME = "pssysuserroleresname";

    /**
     * 设置 系统角色资源名称，详细说明：{@link #FIELD_PSSYSUSERROLERESNAME}
     * 
     * @param pSSysUserRoleResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERROLERESNAME)
    public void setPSSysUserRoleResName(String pSSysUserRoleResName){
        this.set(FIELD_PSSYSUSERROLERESNAME, pSSysUserRoleResName);
    }
    
    /**
     * 获取 系统角色资源名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserRoleResName(){
        Object objValue = this.get(FIELD_PSSYSUSERROLERESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统角色资源名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserRoleResNameDirty(){
        if(this.contains(FIELD_PSSYSUSERROLERESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统角色资源名称
     */
    @JsonIgnore
    public void resetPSSysUserRoleResName(){
        this.reset(FIELD_PSSYSUSERROLERESNAME);
    }

    /**
     * 设置 系统角色资源名称，详细说明：{@link #FIELD_PSSYSUSERROLERESNAME}
     * <P>
     * 等同 {@link #setPSSysUserRoleResName}
     * @param pSSysUserRoleResName
     */
    @JsonIgnore
    public PSSysUserRoleRes pssysuserroleresname(String pSSysUserRoleResName){
        this.setPSSysUserRoleResName(pSSysUserRoleResName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUserRoleResName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUserRoleResName(strName);
    }

    @JsonIgnore
    public PSSysUserRoleRes name(String strName){
        this.setPSSysUserRoleResName(strName);
        return this;
    }

    /**
     * <B>RESMODEL</B>&nbsp;资源模型
     */
    public final static String FIELD_RESMODEL = "resmodel";

    /**
     * 设置 资源模型
     * 
     * @param resModel
     * 
     */
    @JsonProperty(FIELD_RESMODEL)
    public void setResModel(String resModel){
        this.set(FIELD_RESMODEL, resModel);
    }
    
    /**
     * 获取 资源模型  
     * @return
     */
    @JsonIgnore
    public String getResModel(){
        Object objValue = this.get(FIELD_RESMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResModelDirty(){
        if(this.contains(FIELD_RESMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源模型
     */
    @JsonIgnore
    public void resetResModel(){
        this.reset(FIELD_RESMODEL);
    }

    /**
     * 设置 资源模型
     * <P>
     * 等同 {@link #setResModel}
     * @param resModel
     */
    @JsonIgnore
    public PSSysUserRoleRes resmodel(String resModel){
        this.setResModel(resModel);
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
    public PSSysUserRoleRes updatedate(String updateDate){
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
    public PSSysUserRoleRes updateman(String updateMan){
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
    public PSSysUserRoleRes usercat(String userCat){
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
    public PSSysUserRoleRes usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSSysUserRoleRes usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSSysUserRoleRes usertag2(String userTag2){
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
    public PSSysUserRoleRes usertag3(String userTag3){
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
    public PSSysUserRoleRes usertag4(String userTag4){
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
    public PSSysUserRoleRes validflag(Integer validFlag){
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
    public PSSysUserRoleRes validflag(Boolean validFlag){
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
        return this.getPSSysUserRoleResId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUserRoleResId(strValue);
    }

    @JsonIgnore
    public PSSysUserRoleRes id(String strValue){
        this.setPSSysUserRoleResId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysUserRoleRes){
            PSSysUserRoleRes model = (PSSysUserRoleRes)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
