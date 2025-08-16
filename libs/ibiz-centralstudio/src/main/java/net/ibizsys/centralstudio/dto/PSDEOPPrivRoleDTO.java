package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEOPPRIVROLE</B>实体操作标识角色 模型传输对象
 * <P>
 * 实体数据操作标识与角色的关系模型，将实体数据操作标识授予角色对象，支持实体角色与系统角色
 */
public class PSDEOPPrivRoleDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEOPPrivRoleDTO(){
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
    public PSDEOPPrivRoleDTO createdate(Timestamp createDate){
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
    public PSDEOPPrivRoleDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO customcond(String customCond){
        this.setCustomCond(customCond);
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
    public PSDEOPPrivRoleDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;实体数据查询，指定数据范围的数据查询对象，来自当前实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * 
     * @param pSDEDQId
     * 
     */
    @JsonProperty(FIELD_PSDEDQID)
    public void setPSDEDQId(String pSDEDQId){
        this.set(FIELD_PSDEDQID, pSDEDQId);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQId(){
        Object objValue = this.get(FIELD_PSDEDQID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQIdDirty(){
        if(this.contains(FIELD_PSDEDQID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQId(){
        this.reset(FIELD_PSDEDQID);
    }

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdedqid(String pSDEDQId){
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    /**
     * 设置 实体数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdedqid(PSDEDataQueryDTO pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        }
        else{
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;实体数据查询，指定数据范围的数据查询对象，来自当前实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * 
     * @param pSDEDQName
     * 
     */
    @JsonProperty(FIELD_PSDEDQNAME)
    public void setPSDEDQName(String pSDEDQName){
        this.set(FIELD_PSDEDQNAME, pSDEDQName);
    }
    
    /**
     * 获取 实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQName(){
        Object objValue = this.get(FIELD_PSDEDQNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQNameDirty(){
        if(this.contains(FIELD_PSDEDQNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQName(){
        this.reset(FIELD_PSDEDQNAME);
    }

    /**
     * 设置 实体数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定操作标识角色所在的实体对象
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
    public PSDEOPPrivRoleDTO psdeid(String pSDEId){
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
    public PSDEOPPrivRoleDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定操作标识角色所在的实体对象
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
    public PSDEOPPrivRoleDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVID</B>&nbsp;实体操作标识，指定操作标识角色的操作标识对象，来自当前实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEOPPrivDTO} 
     */
    public final static String FIELD_PSDEOPPRIVID = "psdeopprivid";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * 
     * @param pSDEOPPrivId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVID)
    public void setPSDEOPPrivId(String pSDEOPPrivId){
        this.set(FIELD_PSDEOPPRIVID, pSDEOPPrivId);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivId(){
        this.reset(FIELD_PSDEOPPRIVID);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVID}
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPrivId
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivid(String pSDEOPPrivId){
        this.setPSDEOPPrivId(pSDEOPPrivId);
        return this;
    }

    /**
     * 设置 实体操作标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEOPPrivId}
     * @param pSDEOPPriv 引用对象
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivid(PSDEOPPrivDTO pSDEOPPriv){
        if(pSDEOPPriv == null){
            this.setPSDEOPPrivId(null);
            this.setPSDEOPPrivName(null);
        }
        else{
            this.setPSDEOPPrivId(pSDEOPPriv.getPSDEOPPrivId());
            this.setPSDEOPPrivName(pSDEOPPriv.getPSDEOPPrivName());
        }
        return this;
    }

    /**
     * <B>PSDEOPPRIVNAME</B>&nbsp;实体操作标识，指定操作标识角色的操作标识对象，来自当前实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEOPPRIVID}
     */
    public final static String FIELD_PSDEOPPRIVNAME = "psdeopprivname";

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * 
     * @param pSDEOPPrivName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVNAME)
    public void setPSDEOPPrivName(String pSDEOPPrivName){
        this.set(FIELD_PSDEOPPRIVNAME, pSDEOPPrivName);
    }
    
    /**
     * 获取 实体操作标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivName(){
        this.reset(FIELD_PSDEOPPRIVNAME);
    }

    /**
     * 设置 实体操作标识，详细说明：{@link #FIELD_PSDEOPPRIVNAME}
     * <P>
     * 等同 {@link #setPSDEOPPrivName}
     * @param pSDEOPPrivName
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivname(String pSDEOPPrivName){
        this.setPSDEOPPrivName(pSDEOPPrivName);
        return this;
    }

    /**
     * <B>PSDEOPPRIVROLEID</B>&nbsp;实体操作标识角色标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEOPPRIVROLEID = "psdeopprivroleid";

    /**
     * 设置 实体操作标识角色标识
     * 
     * @param pSDEOPPrivRoleId
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVROLEID)
    public void setPSDEOPPrivRoleId(String pSDEOPPrivRoleId){
        this.set(FIELD_PSDEOPPRIVROLEID, pSDEOPPrivRoleId);
    }
    
    /**
     * 获取 实体操作标识角色标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivRoleId(){
        Object objValue = this.get(FIELD_PSDEOPPRIVROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作标识角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivRoleIdDirty(){
        if(this.contains(FIELD_PSDEOPPRIVROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作标识角色标识
     */
    @JsonIgnore
    public void resetPSDEOPPrivRoleId(){
        this.reset(FIELD_PSDEOPPRIVROLEID);
    }

    /**
     * 设置 实体操作标识角色标识
     * <P>
     * 等同 {@link #setPSDEOPPrivRoleId}
     * @param pSDEOPPrivRoleId
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivroleid(String pSDEOPPrivRoleId){
        this.setPSDEOPPrivRoleId(pSDEOPPrivRoleId);
        return this;
    }

    /**
     * <B>PSDEOPPRIVROLENAME</B>&nbsp;操作标识角色名称，指定操作标识角色的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEOPPRIVROLENAME = "psdeopprivrolename";

    /**
     * 设置 操作标识角色名称，详细说明：{@link #FIELD_PSDEOPPRIVROLENAME}
     * 
     * @param pSDEOPPrivRoleName
     * 
     */
    @JsonProperty(FIELD_PSDEOPPRIVROLENAME)
    public void setPSDEOPPrivRoleName(String pSDEOPPrivRoleName){
        this.set(FIELD_PSDEOPPRIVROLENAME, pSDEOPPrivRoleName);
    }
    
    /**
     * 获取 操作标识角色名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEOPPrivRoleName(){
        Object objValue = this.get(FIELD_PSDEOPPRIVROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作标识角色名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEOPPrivRoleNameDirty(){
        if(this.contains(FIELD_PSDEOPPRIVROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作标识角色名称
     */
    @JsonIgnore
    public void resetPSDEOPPrivRoleName(){
        this.reset(FIELD_PSDEOPPRIVROLENAME);
    }

    /**
     * 设置 操作标识角色名称，详细说明：{@link #FIELD_PSDEOPPRIVROLENAME}
     * <P>
     * 等同 {@link #setPSDEOPPrivRoleName}
     * @param pSDEOPPrivRoleName
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO psdeopprivrolename(String pSDEOPPrivRoleName){
        this.setPSDEOPPrivRoleName(pSDEOPPrivRoleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEOPPrivRoleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEOPPrivRoleName(strName);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO name(String strName){
        this.setPSDEOPPrivRoleName(strName);
        return this;
    }

    /**
     * <B>PSDEUSERROLEID</B>&nbsp;实体操作角色，角色类型为【实体角色】时指定实体操作角色对象，来自当前实体
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
    public PSDEOPPrivRoleDTO psdeuserroleid(String pSDEUserRoleId){
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
    public PSDEOPPrivRoleDTO psdeuserroleid(PSDEUserRoleDTO pSDEUserRole){
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
     * <B>PSDEUSERROLENAME</B>&nbsp;实体操作角色，角色类型为【实体角色】时指定实体操作角色对象，来自当前实体
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
    public PSDEOPPrivRoleDTO psdeuserrolename(String pSDEUserRoleName){
        this.setPSDEUserRoleName(pSDEUserRoleName);
        return this;
    }

    /**
     * <B>PSSYSUSERROLEID</B>&nbsp;系统操作角色，角色类型为【系统角色】时指定系统操作角色对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUserRoleDTO} 
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
    public PSDEOPPrivRoleDTO pssysuserroleid(String pSSysUserRoleId){
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
    public PSDEOPPrivRoleDTO pssysuserroleid(PSSysUserRoleDTO pSSysUserRole){
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
     * <B>PSSYSUSERROLENAME</B>&nbsp;系统操作角色，角色类型为【系统角色】时指定系统操作角色对象
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
    public PSDEOPPrivRoleDTO pssysuserrolename(String pSSysUserRoleName){
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
     * <B>ROLETYPE</B>&nbsp;角色类型，指定角色的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEOPPrivRoleType} 
     */
    public final static String FIELD_ROLETYPE = "roletype";

    /**
     * 设置 角色类型，详细说明：{@link #FIELD_ROLETYPE}
     * 
     * @param roleType
     * 
     */
    @JsonProperty(FIELD_ROLETYPE)
    public void setRoleType(String roleType){
        this.set(FIELD_ROLETYPE, roleType);
    }
    
    /**
     * 获取 角色类型  
     * @return
     */
    @JsonIgnore
    public String getRoleType(){
        Object objValue = this.get(FIELD_ROLETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 角色类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRoleTypeDirty(){
        if(this.contains(FIELD_ROLETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 角色类型
     */
    @JsonIgnore
    public void resetRoleType(){
        this.reset(FIELD_ROLETYPE);
    }

    /**
     * 设置 角色类型，详细说明：{@link #FIELD_ROLETYPE}
     * <P>
     * 等同 {@link #setRoleType}
     * @param roleType
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO roletype(String roleType){
        this.setRoleType(roleType);
        return this;
    }

     /**
     * 设置 角色类型，详细说明：{@link #FIELD_ROLETYPE}
     * <P>
     * 等同 {@link #setRoleType}
     * @param roleType
     */
    @JsonIgnore
    public PSDEOPPrivRoleDTO roletype(net.ibizsys.model.PSModelEnums.DEOPPrivRoleType roleType){
        if(roleType == null){
            this.setRoleType(null);
        }
        else{
            this.setRoleType(roleType.value);
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
    public PSDEOPPrivRoleDTO updatedate(Timestamp updateDate){
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
    public PSDEOPPrivRoleDTO updateman(String updateMan){
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
    public PSDEOPPrivRoleDTO usercat(String userCat){
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
    public PSDEOPPrivRoleDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEOPPrivRoleDTO usertag(String userTag){
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
    public PSDEOPPrivRoleDTO usertag2(String userTag2){
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
    public PSDEOPPrivRoleDTO usertag3(String userTag3){
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
    public PSDEOPPrivRoleDTO usertag4(String userTag4){
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
    public PSDEOPPrivRoleDTO validflag(Integer validFlag){
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
    public PSDEOPPrivRoleDTO validflag(Boolean validFlag){
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
        return this.getPSDEOPPrivRoleId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEOPPrivRoleId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEOPPrivRoleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEOPPrivRoleId(strValue);
    }

    @JsonIgnore
    public PSDEOPPrivRoleDTO id(String strValue){
        this.setPSDEOPPrivRoleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEOPPrivRoleDTO){
            PSDEOPPrivRoleDTO dto = (PSDEOPPrivRoleDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
