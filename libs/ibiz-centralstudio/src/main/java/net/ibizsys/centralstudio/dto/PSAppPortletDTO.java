package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPPORTLET</B>应用门户部件 模型传输对象
 * <P>
 * 应用门户部件模型，定义应用中支持动态数据看板使用的门户部件
 */
public class PSAppPortletDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSAppPortletDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用门户部件的代码标识，需要在所在的前端应用中具有唯一性
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
    public PSAppPortletDTO codename(String codeName){
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
    public PSAppPortletDTO createdate(Timestamp createDate){
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
    public PSAppPortletDTO createman(String createMan){
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
    public PSAppPortletDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPDATAENTITYID</B>&nbsp;应用实体，指定应用门户部件所属的应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO} 
     */
    public final static String FIELD_PSAPPDATAENTITYID = "psappdataentityid";

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYID}
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
     * 获取 应用实体  
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
     * 判断 应用实体 是否指定值，包括空值
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
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityId(){
        this.reset(FIELD_PSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldeid");
    }

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYID}
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntityId
     */
    @JsonIgnore
    public PSAppPortletDTO psappdataentityid(String pSAppDataEntityId){
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    /**
     * 设置 应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppPortletDTO psappdataentityid(PSAppDataEntityDTO pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
        }
        else{
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
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
     * <B>PSAPPDATAENTITYNAME</B>&nbsp;应用实体，指定应用门户部件所属的应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
     */
    public final static String FIELD_PSAPPDATAENTITYNAME = "psappdataentityname";

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYNAME}
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
     * 获取 应用实体  
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
     * 判断 应用实体 是否指定值，包括空值
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
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityName(){
        this.reset(FIELD_PSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldename");
    }

    /**
     * 设置 应用实体，详细说明：{@link #FIELD_PSAPPDATAENTITYNAME}
     * <P>
     * 等同 {@link #setPSAppDataEntityName}
     * @param pSAppDataEntityName
     */
    @JsonIgnore
    public PSAppPortletDTO psappdataentityname(String pSAppDataEntityName){
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

    /**
     * <B>PSAPPPORTLETID</B>&nbsp;应用门户部件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPPORTLETID = "psappportletid";

    /**
     * 设置 应用门户部件标识
     * 
     * @param pSAppPortletId
     * 
     */
    @JsonProperty(FIELD_PSAPPPORTLETID)
    public void setPSAppPortletId(String pSAppPortletId){
        this.set(FIELD_PSAPPPORTLETID, pSAppPortletId);
    }
    
    /**
     * 获取 应用门户部件标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppPortletId(){
        Object objValue = this.get(FIELD_PSAPPPORTLETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用门户部件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPortletIdDirty(){
        if(this.contains(FIELD_PSAPPPORTLETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用门户部件标识
     */
    @JsonIgnore
    public void resetPSAppPortletId(){
        this.reset(FIELD_PSAPPPORTLETID);
    }

    /**
     * 设置 应用门户部件标识
     * <P>
     * 等同 {@link #setPSAppPortletId}
     * @param pSAppPortletId
     */
    @JsonIgnore
    public PSAppPortletDTO psappportletid(String pSAppPortletId){
        this.setPSAppPortletId(pSAppPortletId);
        return this;
    }

    /**
     * <B>PSAPPPORTLETNAME</B>&nbsp;应用门户部件名称，指定应用门户部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPPORTLETNAME = "psappportletname";

    /**
     * 设置 应用门户部件名称，详细说明：{@link #FIELD_PSAPPPORTLETNAME}
     * 
     * @param pSAppPortletName
     * 
     */
    @JsonProperty(FIELD_PSAPPPORTLETNAME)
    public void setPSAppPortletName(String pSAppPortletName){
        this.set(FIELD_PSAPPPORTLETNAME, pSAppPortletName);
    }
    
    /**
     * 获取 应用门户部件名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppPortletName(){
        Object objValue = this.get(FIELD_PSAPPPORTLETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用门户部件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppPortletNameDirty(){
        if(this.contains(FIELD_PSAPPPORTLETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用门户部件名称
     */
    @JsonIgnore
    public void resetPSAppPortletName(){
        this.reset(FIELD_PSAPPPORTLETNAME);
    }

    /**
     * 设置 应用门户部件名称，详细说明：{@link #FIELD_PSAPPPORTLETNAME}
     * <P>
     * 等同 {@link #setPSAppPortletName}
     * @param pSAppPortletName
     */
    @JsonIgnore
    public PSAppPortletDTO psappportletname(String pSAppPortletName){
        this.setPSAppPortletName(pSAppPortletName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppPortletName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppPortletName(strName);
    }

    @JsonIgnore
    public PSAppPortletDTO name(String strName){
        this.setPSAppPortletName(strName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用门户部件所属的前端应用
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
    public PSAppPortletDTO pssysappid(String pSSysAppId){
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
    public PSAppPortletDTO pssysappid(PSSysAppDTO pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用门户部件所属的前端应用
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
    public PSAppPortletDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSPORTLETID</B>&nbsp;系统门户部件，指定应用门户部件引用的系统门户部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPortletDTO} 
     */
    public final static String FIELD_PSSYSPORTLETID = "pssysportletid";

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETID}
     * 
     * @param pSSysPortletId
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETID)
    public void setPSSysPortletId(String pSSysPortletId){
        this.set(FIELD_PSSYSPORTLETID, pSSysPortletId);
    }
    
    /**
     * 获取 系统门户部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletId(){
        Object objValue = this.get(FIELD_PSSYSPORTLETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统门户部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletIdDirty(){
        if(this.contains(FIELD_PSSYSPORTLETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统门户部件
     */
    @JsonIgnore
    public void resetPSSysPortletId(){
        this.reset(FIELD_PSSYSPORTLETID);
    }

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETID}
     * <P>
     * 等同 {@link #setPSSysPortletId}
     * @param pSSysPortletId
     */
    @JsonIgnore
    public PSAppPortletDTO pssysportletid(String pSSysPortletId){
        this.setPSSysPortletId(pSSysPortletId);
        return this;
    }

    /**
     * 设置 系统门户部件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPortletId}
     * @param pSSysPortlet 引用对象
     */
    @JsonIgnore
    public PSAppPortletDTO pssysportletid(PSSysPortletDTO pSSysPortlet){
        if(pSSysPortlet == null){
            this.setPSSysPortletId(null);
            this.setPSSysPortletName(null);
        }
        else{
            this.setPSSysPortletId(pSSysPortlet.getPSSysPortletId());
            this.setPSSysPortletName(pSSysPortlet.getPSSysPortletName());
        }
        return this;
    }

    /**
     * <B>PSSYSPORTLETNAME</B>&nbsp;系统门户部件，指定应用门户部件引用的系统门户部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPORTLETID}
     */
    public final static String FIELD_PSSYSPORTLETNAME = "pssysportletname";

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETNAME}
     * 
     * @param pSSysPortletName
     * 
     */
    @JsonProperty(FIELD_PSSYSPORTLETNAME)
    public void setPSSysPortletName(String pSSysPortletName){
        this.set(FIELD_PSSYSPORTLETNAME, pSSysPortletName);
    }
    
    /**
     * 获取 系统门户部件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPortletName(){
        Object objValue = this.get(FIELD_PSSYSPORTLETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统门户部件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPortletNameDirty(){
        if(this.contains(FIELD_PSSYSPORTLETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统门户部件
     */
    @JsonIgnore
    public void resetPSSysPortletName(){
        this.reset(FIELD_PSSYSPORTLETNAME);
    }

    /**
     * 设置 系统门户部件，详细说明：{@link #FIELD_PSSYSPORTLETNAME}
     * <P>
     * 等同 {@link #setPSSysPortletName}
     * @param pSSysPortletName
     */
    @JsonIgnore
    public PSAppPortletDTO pssysportletname(String pSSysPortletName){
        this.setPSSysPortletName(pSSysPortletName);
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
    public PSAppPortletDTO updatedate(Timestamp updateDate){
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
    public PSAppPortletDTO updateman(String updateMan){
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
    public PSAppPortletDTO usercat(String userCat){
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
    public PSAppPortletDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSAppPortletDTO usertag(String userTag){
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
    public PSAppPortletDTO usertag2(String userTag2){
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
    public PSAppPortletDTO usertag3(String userTag3){
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
    public PSAppPortletDTO usertag4(String userTag4){
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
    public PSAppPortletDTO validflag(Integer validFlag){
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
    public PSAppPortletDTO validflag(Boolean validFlag){
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
        return this.getPSAppPortletId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppPortletId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppPortletId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppPortletId(strValue);
    }

    @JsonIgnore
    public PSAppPortletDTO id(String strValue){
        this.setPSAppPortletId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppPortletDTO){
            PSAppPortletDTO dto = (PSAppPortletDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
