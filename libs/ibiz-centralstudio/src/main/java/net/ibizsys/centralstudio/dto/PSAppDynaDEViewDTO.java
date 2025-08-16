package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPDYNADEVIEW</B>应用动态实体视图 模型传输对象
 * <P>
 * 
 */
public class PSAppDynaDEViewDTO extends PSAppViewDTO {

    public PSAppDynaDEViewDTO(){
        this.setPSAppViewType("APPDYNADEVIEW");
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
    public PSAppDynaDEViewDTO createdate(Timestamp createDate){
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
    public PSAppDynaDEViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSAPPDYNADEVIEWID</B>&nbsp;应用动态实体视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPDYNADEVIEWID = "psappdynadeviewid";

    /**
     * 设置 应用动态实体视图标识
     * 
     * @param pSAppDynaDEViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPDYNADEVIEWID)
    public void setPSAppDynaDEViewId(String pSAppDynaDEViewId){
        this.set(FIELD_PSAPPDYNADEVIEWID, pSAppDynaDEViewId);
        this.set(FIELD_PSAPPVIEWID, pSAppDynaDEViewId);        
    }
    
    /**
     * 获取 应用动态实体视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppDynaDEViewId(){
        Object objValue = this.get(FIELD_PSAPPDYNADEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用动态实体视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDynaDEViewIdDirty(){
        if(this.contains(FIELD_PSAPPDYNADEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用动态实体视图标识
     */
    @JsonIgnore
    public void resetPSAppDynaDEViewId(){
        this.reset(FIELD_PSAPPDYNADEVIEWID);
        this.reset(FIELD_PSAPPVIEWID);        
    }

    /**
     * 设置 应用动态实体视图标识
     * <P>
     * 等同 {@link #setPSAppDynaDEViewId}
     * @param pSAppDynaDEViewId
     */
    @JsonIgnore
    public PSAppDynaDEViewDTO psappdynadeviewid(String pSAppDynaDEViewId){
        this.setPSAppDynaDEViewId(pSAppDynaDEViewId);
        return this;
    }

    /**
     * <B>PSAPPDYNADEVIEWNAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPDYNADEVIEWNAME = "psappdynadeviewname";

    /**
     * 设置 代码标识
     * 
     * @param pSAppDynaDEViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPDYNADEVIEWNAME)
    public void setPSAppDynaDEViewName(String pSAppDynaDEViewName){
        this.set(FIELD_PSAPPDYNADEVIEWNAME, pSAppDynaDEViewName);
        this.set(FIELD_PSAPPVIEWNAME, pSAppDynaDEViewName);        
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppDynaDEViewName(){
        Object objValue = this.get(FIELD_PSAPPDYNADEVIEWNAME);
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
    public boolean isPSAppDynaDEViewNameDirty(){
        if(this.contains(FIELD_PSAPPDYNADEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppDynaDEViewName(){
        this.reset(FIELD_PSAPPDYNADEVIEWNAME);
        this.reset(FIELD_PSAPPVIEWNAME);        
    }

    /**
     * 设置 代码标识
     * <P>
     * 等同 {@link #setPSAppDynaDEViewName}
     * @param pSAppDynaDEViewName
     */
    @JsonIgnore
    public PSAppDynaDEViewDTO psappdynadeviewname(String pSAppDynaDEViewName){
        this.setPSAppDynaDEViewName(pSAppDynaDEViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppDynaDEViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppDynaDEViewName(strName);
    }

    @JsonIgnore
    public PSAppDynaDEViewDTO name(String strName){
        this.setPSAppDynaDEViewName(strName);
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
    public PSAppDynaDEViewDTO updatedate(Timestamp updateDate){
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
    public PSAppDynaDEViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppDynaDEViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppDynaDEViewId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppDynaDEViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppDynaDEViewId(strValue);
    }

    @JsonIgnore
    public PSAppDynaDEViewDTO id(String strValue){
        this.setPSAppDynaDEViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppDynaDEViewDTO){
            PSAppDynaDEViewDTO dto = (PSAppDynaDEViewDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
