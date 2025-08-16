package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPWFVER</B>应用工作流版本 模型传输对象
 * <P>
 * 应用工作流版本模型，定义前端应用加载的工作流版本
 */
public class PSAppWFVerDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSAppWFVerDTO(){
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
    public PSAppWFVerDTO createdate(Timestamp createDate){
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
    public PSAppWFVerDTO createman(String createMan){
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
    public PSAppWFVerDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPWFID</B>&nbsp;应用工作流，指定应用工作流版本相关的应用工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppWFDTO} 
     */
    public final static String FIELD_PSAPPWFID = "psappwfid";

    /**
     * 设置 应用工作流，详细说明：{@link #FIELD_PSAPPWFID}
     * 
     * @param pSAppWFId
     * 
     */
    @JsonProperty(FIELD_PSAPPWFID)
    public void setPSAppWFId(String pSAppWFId){
        this.set(FIELD_PSAPPWFID, pSAppWFId);
    }
    
    /**
     * 获取 应用工作流  
     * @return
     */
    @JsonIgnore
    public String getPSAppWFId(){
        Object objValue = this.get(FIELD_PSAPPWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppWFIdDirty(){
        if(this.contains(FIELD_PSAPPWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用工作流
     */
    @JsonIgnore
    public void resetPSAppWFId(){
        this.reset(FIELD_PSAPPWFID);
    }

    /**
     * 设置 应用工作流，详细说明：{@link #FIELD_PSAPPWFID}
     * <P>
     * 等同 {@link #setPSAppWFId}
     * @param pSAppWFId
     */
    @JsonIgnore
    public PSAppWFVerDTO psappwfid(String pSAppWFId){
        this.setPSAppWFId(pSAppWFId);
        return this;
    }

    /**
     * 设置 应用工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppWFId}
     * @param pSAppWF 引用对象
     */
    @JsonIgnore
    public PSAppWFVerDTO psappwfid(PSAppWFDTO pSAppWF){
        if(pSAppWF == null){
            this.setPSAppWFId(null);
            this.setPSAppWFName(null);
        }
        else{
            this.setPSAppWFId(pSAppWF.getPSAppWFId());
            this.setPSAppWFName(pSAppWF.getPSAppWFName());
        }
        return this;
    }

    /**
     * <B>PSAPPWFNAME</B>&nbsp;应用工作流，指定应用工作流版本相关的应用工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPWFID}
     */
    public final static String FIELD_PSAPPWFNAME = "psappwfname";

    /**
     * 设置 应用工作流，详细说明：{@link #FIELD_PSAPPWFNAME}
     * 
     * @param pSAppWFName
     * 
     */
    @JsonProperty(FIELD_PSAPPWFNAME)
    public void setPSAppWFName(String pSAppWFName){
        this.set(FIELD_PSAPPWFNAME, pSAppWFName);
    }
    
    /**
     * 获取 应用工作流  
     * @return
     */
    @JsonIgnore
    public String getPSAppWFName(){
        Object objValue = this.get(FIELD_PSAPPWFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppWFNameDirty(){
        if(this.contains(FIELD_PSAPPWFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用工作流
     */
    @JsonIgnore
    public void resetPSAppWFName(){
        this.reset(FIELD_PSAPPWFNAME);
    }

    /**
     * 设置 应用工作流，详细说明：{@link #FIELD_PSAPPWFNAME}
     * <P>
     * 等同 {@link #setPSAppWFName}
     * @param pSAppWFName
     */
    @JsonIgnore
    public PSAppWFVerDTO psappwfname(String pSAppWFName){
        this.setPSAppWFName(pSAppWFName);
        return this;
    }

    /**
     * <B>PSAPPWFVERID</B>&nbsp;应用工作流版本标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPWFVERID = "psappwfverid";

    /**
     * 设置 应用工作流版本标识
     * 
     * @param pSAppWFVerId
     * 
     */
    @JsonProperty(FIELD_PSAPPWFVERID)
    public void setPSAppWFVerId(String pSAppWFVerId){
        this.set(FIELD_PSAPPWFVERID, pSAppWFVerId);
    }
    
    /**
     * 获取 应用工作流版本标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppWFVerId(){
        Object objValue = this.get(FIELD_PSAPPWFVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用工作流版本标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppWFVerIdDirty(){
        if(this.contains(FIELD_PSAPPWFVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用工作流版本标识
     */
    @JsonIgnore
    public void resetPSAppWFVerId(){
        this.reset(FIELD_PSAPPWFVERID);
    }

    /**
     * 设置 应用工作流版本标识
     * <P>
     * 等同 {@link #setPSAppWFVerId}
     * @param pSAppWFVerId
     */
    @JsonIgnore
    public PSAppWFVerDTO psappwfverid(String pSAppWFVerId){
        this.setPSAppWFVerId(pSAppWFVerId);
        return this;
    }

    /**
     * <B>PSAPPWFVERNAME</B>&nbsp;版本名称，指定应用工作流版本的名称，需在所属应用工作流中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPWFVERNAME = "psappwfvername";

    /**
     * 设置 版本名称，详细说明：{@link #FIELD_PSAPPWFVERNAME}
     * 
     * @param pSAppWFVerName
     * 
     */
    @JsonProperty(FIELD_PSAPPWFVERNAME)
    public void setPSAppWFVerName(String pSAppWFVerName){
        this.set(FIELD_PSAPPWFVERNAME, pSAppWFVerName);
    }
    
    /**
     * 获取 版本名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppWFVerName(){
        Object objValue = this.get(FIELD_PSAPPWFVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 版本名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppWFVerNameDirty(){
        if(this.contains(FIELD_PSAPPWFVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本名称
     */
    @JsonIgnore
    public void resetPSAppWFVerName(){
        this.reset(FIELD_PSAPPWFVERNAME);
    }

    /**
     * 设置 版本名称，详细说明：{@link #FIELD_PSAPPWFVERNAME}
     * <P>
     * 等同 {@link #setPSAppWFVerName}
     * @param pSAppWFVerName
     */
    @JsonIgnore
    public PSAppWFVerDTO psappwfvername(String pSAppWFVerName){
        this.setPSAppWFVerName(pSAppWFVerName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppWFVerName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppWFVerName(strName);
    }

    @JsonIgnore
    public PSAppWFVerDTO name(String strName){
        this.setPSAppWFVerName(strName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用，指定应用工作流版本所属的前端应用
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
    public PSAppWFVerDTO pssysappid(String pSSysAppId){
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
    public PSAppWFVerDTO pssysappid(PSSysAppDTO pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用工作流版本所属的前端应用
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
    public PSAppWFVerDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本，指定应用工作流版本相关的工作流版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFVersionDTO} 
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSAppWFVerDTO pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * 设置 工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSAppWFVerDTO pswfversionid(PSWFVersionDTO pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
            this.setPSWorkflowId(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
            this.setPSWorkflowId(pSWFVersion.getPSWFId());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本，指定应用工作流版本相关的工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionName(){
        Object objValue = this.get(FIELD_PSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionNameDirty(){
        if(this.contains(FIELD_PSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSAppWFVerDTO pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>PSWORKFLOWID</B>&nbsp;工作流标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWORKFLOWID = "psworkflowid";

    /**
     * 设置 工作流标识
     * 
     * @param pSWorkflowId
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWID)
    public void setPSWorkflowId(String pSWorkflowId){
        this.set(FIELD_PSWORKFLOWID, pSWorkflowId);
    }
    
    /**
     * 获取 工作流标识  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowId(){
        Object objValue = this.get(FIELD_PSWORKFLOWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowIdDirty(){
        if(this.contains(FIELD_PSWORKFLOWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流标识
     */
    @JsonIgnore
    public void resetPSWorkflowId(){
        this.reset(FIELD_PSWORKFLOWID);
    }

    /**
     * 设置 工作流标识
     * <P>
     * 等同 {@link #setPSWorkflowId}
     * @param pSWorkflowId
     */
    @JsonIgnore
    public PSAppWFVerDTO psworkflowid(String pSWorkflowId){
        this.setPSWorkflowId(pSWorkflowId);
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
    public PSAppWFVerDTO updatedate(Timestamp updateDate){
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
    public PSAppWFVerDTO updateman(String updateMan){
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
    public PSAppWFVerDTO usercat(String userCat){
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
    public PSAppWFVerDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSAppWFVerDTO usertag(String userTag){
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
    public PSAppWFVerDTO usertag2(String userTag2){
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
    public PSAppWFVerDTO usertag3(String userTag3){
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
    public PSAppWFVerDTO usertag4(String userTag4){
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
    public PSAppWFVerDTO validflag(Integer validFlag){
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
    public PSAppWFVerDTO validflag(Boolean validFlag){
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
        return this.getPSAppWFVerId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppWFVerId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppWFVerId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppWFVerId(strValue);
    }

    @JsonIgnore
    public PSAppWFVerDTO id(String strValue){
        this.setPSAppWFVerId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppWFVerDTO){
            PSAppWFVerDTO dto = (PSAppWFVerDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
