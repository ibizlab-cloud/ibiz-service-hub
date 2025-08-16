package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSUSERROLEDATA</B>系统角色数据能力 模型传输对象
 * <P>
 * 系统操作角色的实体数据能力定义模型，将实体操作角色分配到系统操作角色
 */
public class PSSysUserRoleDataDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysUserRoleDataDTO(){
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
    public PSSysUserRoleDataDTO createdate(Timestamp createDate){
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
    public PSSysUserRoleDataDTO createman(String createMan){
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
    public PSSysUserRoleDataDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定系统操作角色数据能力分配的实体操作角色的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSSysUserRoleDataDTO psdeid(String pSDEId){
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
    public PSSysUserRoleDataDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定系统操作角色数据能力分配的实体操作角色的所在实体
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
    public PSSysUserRoleDataDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUSERROLEID</B>&nbsp;实体操作角色，指定系统操作角色数据能力分配的实体操作角色
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUserRoleDTO} 
     */
    public final static String FIELD_PSDEUSERROLEID = "psdeuserroleid";

    /**
     * 设置 实体操作角色，详细说明：{@link #FIELD_PSDEUSERROLEID}
     * 
     * @param pSDEUserRoleId
     * 
     */
    @JsonProperty(FIELD_PSDEUSERROLEID)
    public void setPSDEUserRoleId(String pSDEUserRoleId){
        this.set(FIELD_PSDEUSERROLEID, pSDEUserRoleId);
    }
    
    /**
     * 获取 实体操作角色  
     * @return
     */
    @JsonIgnore
    public String getPSDEUserRoleId(){
        Object objValue = this.get(FIELD_PSDEUSERROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUserRoleIdDirty(){
        if(this.contains(FIELD_PSDEUSERROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作角色
     */
    @JsonIgnore
    public void resetPSDEUserRoleId(){
        this.reset(FIELD_PSDEUSERROLEID);
    }

    /**
     * 设置 实体操作角色，详细说明：{@link #FIELD_PSDEUSERROLEID}
     * <P>
     * 等同 {@link #setPSDEUserRoleId}
     * @param pSDEUserRoleId
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO psdeuserroleid(String pSDEUserRoleId){
        this.setPSDEUserRoleId(pSDEUserRoleId);
        return this;
    }

    /**
     * 设置 实体操作角色，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUserRoleId}
     * @param pSDEUserRole 引用对象
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO psdeuserroleid(PSDEUserRoleDTO pSDEUserRole){
        if(pSDEUserRole == null){
            this.setPSDEUserRoleId(null);
            this.setPSDEUserRoleName(null);
        }
        else{
            this.setPSDEUserRoleId(pSDEUserRole.getPSDEUserRoleId());
            this.setPSDEUserRoleName(pSDEUserRole.getPSDEUserRoleName());
        }
        return this;
    }

    /**
     * <B>PSDEUSERROLENAME</B>&nbsp;实体操作角色，指定系统操作角色数据能力分配的实体操作角色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUSERROLEID}
     */
    public final static String FIELD_PSDEUSERROLENAME = "psdeuserrolename";

    /**
     * 设置 实体操作角色，详细说明：{@link #FIELD_PSDEUSERROLENAME}
     * 
     * @param pSDEUserRoleName
     * 
     */
    @JsonProperty(FIELD_PSDEUSERROLENAME)
    public void setPSDEUserRoleName(String pSDEUserRoleName){
        this.set(FIELD_PSDEUSERROLENAME, pSDEUserRoleName);
    }
    
    /**
     * 获取 实体操作角色  
     * @return
     */
    @JsonIgnore
    public String getPSDEUserRoleName(){
        Object objValue = this.get(FIELD_PSDEUSERROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUserRoleNameDirty(){
        if(this.contains(FIELD_PSDEUSERROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作角色
     */
    @JsonIgnore
    public void resetPSDEUserRoleName(){
        this.reset(FIELD_PSDEUSERROLENAME);
    }

    /**
     * 设置 实体操作角色，详细说明：{@link #FIELD_PSDEUSERROLENAME}
     * <P>
     * 等同 {@link #setPSDEUserRoleName}
     * @param pSDEUserRoleName
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO psdeuserrolename(String pSDEUserRoleName){
        this.setPSDEUserRoleName(pSDEUserRoleName);
        return this;
    }

    /**
     * <B>PSSYSUSERROLEID</B>&nbsp;系统角色，指定系统操作角色数据能力所属的系统操作角色
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUserRoleDTO} 
     */
    public final static String FIELD_PSSYSUSERROLEID = "pssysuserroleid";

    /**
     * 设置 系统角色，详细说明：{@link #FIELD_PSSYSUSERROLEID}
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
     * 获取 系统角色  
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
     * 判断 系统角色 是否指定值，包括空值
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
     * 重置 系统角色
     */
    @JsonIgnore
    public void resetPSSysUserRoleId(){
        this.reset(FIELD_PSSYSUSERROLEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysopprivid");
    }

    /**
     * 设置 系统角色，详细说明：{@link #FIELD_PSSYSUSERROLEID}
     * <P>
     * 等同 {@link #setPSSysUserRoleId}
     * @param pSSysUserRoleId
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroleid(String pSSysUserRoleId){
        this.setPSSysUserRoleId(pSSysUserRoleId);
        return this;
    }

    /**
     * 设置 系统角色，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserRoleId}
     * @param pSSysUserRole 引用对象
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroleid(PSSysUserRoleDTO pSSysUserRole){
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
     * <B>PSSYSUSERROLENAME</B>&nbsp;系统角色，指定系统操作角色数据能力所属的系统操作角色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERROLEID}
     */
    public final static String FIELD_PSSYSUSERROLENAME = "pssysuserrolename";

    /**
     * 设置 系统角色，详细说明：{@link #FIELD_PSSYSUSERROLENAME}
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
     * 获取 系统角色  
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
     * 判断 系统角色 是否指定值，包括空值
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
     * 重置 系统角色
     */
    @JsonIgnore
    public void resetPSSysUserRoleName(){
        this.reset(FIELD_PSSYSUSERROLENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysopprivname");
    }

    /**
     * 设置 系统角色，详细说明：{@link #FIELD_PSSYSUSERROLENAME}
     * <P>
     * 等同 {@link #setPSSysUserRoleName}
     * @param pSSysUserRoleName
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserrolename(String pSSysUserRoleName){
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
     * <B>PSSYSUSERROLEDATAID</B>&nbsp;系统角色数据能力标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUSERROLEDATAID = "pssysuserroledataid";

    /**
     * 设置 系统角色数据能力标识
     * 
     * @param pSSysUserRoleDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERROLEDATAID)
    public void setPSSysUserRoleDataId(String pSSysUserRoleDataId){
        this.set(FIELD_PSSYSUSERROLEDATAID, pSSysUserRoleDataId);
    }
    
    /**
     * 获取 系统角色数据能力标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserRoleDataId(){
        Object objValue = this.get(FIELD_PSSYSUSERROLEDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统角色数据能力标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserRoleDataIdDirty(){
        if(this.contains(FIELD_PSSYSUSERROLEDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统角色数据能力标识
     */
    @JsonIgnore
    public void resetPSSysUserRoleDataId(){
        this.reset(FIELD_PSSYSUSERROLEDATAID);
    }

    /**
     * 设置 系统角色数据能力标识
     * <P>
     * 等同 {@link #setPSSysUserRoleDataId}
     * @param pSSysUserRoleDataId
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroledataid(String pSSysUserRoleDataId){
        this.setPSSysUserRoleDataId(pSSysUserRoleDataId);
        return this;
    }

    /**
     * <B>PSSYSUSERROLEDATANAME</B>&nbsp;能力名称，指定系统操作角色数据能力的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUSERROLEDATANAME = "pssysuserroledataname";

    /**
     * 设置 能力名称，详细说明：{@link #FIELD_PSSYSUSERROLEDATANAME}
     * 
     * @param pSSysUserRoleDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERROLEDATANAME)
    public void setPSSysUserRoleDataName(String pSSysUserRoleDataName){
        this.set(FIELD_PSSYSUSERROLEDATANAME, pSSysUserRoleDataName);
    }
    
    /**
     * 获取 能力名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserRoleDataName(){
        Object objValue = this.get(FIELD_PSSYSUSERROLEDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 能力名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserRoleDataNameDirty(){
        if(this.contains(FIELD_PSSYSUSERROLEDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 能力名称
     */
    @JsonIgnore
    public void resetPSSysUserRoleDataName(){
        this.reset(FIELD_PSSYSUSERROLEDATANAME);
    }

    /**
     * 设置 能力名称，详细说明：{@link #FIELD_PSSYSUSERROLEDATANAME}
     * <P>
     * 等同 {@link #setPSSysUserRoleDataName}
     * @param pSSysUserRoleDataName
     */
    @JsonIgnore
    public PSSysUserRoleDataDTO pssysuserroledataname(String pSSysUserRoleDataName){
        this.setPSSysUserRoleDataName(pSSysUserRoleDataName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUserRoleDataName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUserRoleDataName(strName);
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO name(String strName){
        this.setPSSysUserRoleDataName(strName);
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
    public PSSysUserRoleDataDTO updatedate(Timestamp updateDate){
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
    public PSSysUserRoleDataDTO updateman(String updateMan){
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
    public PSSysUserRoleDataDTO usercat(String userCat){
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
    public PSSysUserRoleDataDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUserRoleDataDTO usertag(String userTag){
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
    public PSSysUserRoleDataDTO usertag2(String userTag2){
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
    public PSSysUserRoleDataDTO usertag3(String userTag3){
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
    public PSSysUserRoleDataDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysUserRoleDataDTO validflag(Integer validFlag){
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
    public PSSysUserRoleDataDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysUserRoleDataId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysUserRoleDataId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysUserRoleDataId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUserRoleDataId(strValue);
    }

    @JsonIgnore
    public PSSysUserRoleDataDTO id(String strValue){
        this.setPSSysUserRoleDataId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysUserRoleDataDTO){
            PSSysUserRoleDataDTO dto = (PSSysUserRoleDataDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
