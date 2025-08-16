package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPDEVIEW</B>应用实体视图 模型传输对象
 * <P>
 * 应用实体视图模型，定义加入到应用的实体视图，应用实体视图逻辑在未定义情况下默认取实体视图配置。注意：每个实体视图在同一个应用中只能被添加一次
 */
public class PSAppDEViewDTO extends PSAppViewDTO {

    public PSAppDEViewDTO(){
        this.setPSAppViewType("APPDEVIEW");
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
    public PSAppDEViewDTO createdate(Timestamp createDate){
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
    public PSAppDEViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSAPPDEVIEWID</B>&nbsp;云应用实体视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPDEVIEWID = "psappdeviewid";

    /**
     * 设置 云应用实体视图标识
     * 
     * @param pSAppDEViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPDEVIEWID)
    public void setPSAppDEViewId(String pSAppDEViewId){
        this.set(FIELD_PSAPPDEVIEWID, pSAppDEViewId);
        this.set(FIELD_PSAPPVIEWID, pSAppDEViewId);        
    }
    
    /**
     * 获取 云应用实体视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppDEViewId(){
        Object objValue = this.get(FIELD_PSAPPDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云应用实体视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDEViewIdDirty(){
        if(this.contains(FIELD_PSAPPDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云应用实体视图标识
     */
    @JsonIgnore
    public void resetPSAppDEViewId(){
        this.reset(FIELD_PSAPPDEVIEWID);
        this.reset(FIELD_PSAPPVIEWID);        
    }

    /**
     * 设置 云应用实体视图标识
     * <P>
     * 等同 {@link #setPSAppDEViewId}
     * @param pSAppDEViewId
     */
    @JsonIgnore
    public PSAppDEViewDTO psappdeviewid(String pSAppDEViewId){
        this.setPSAppDEViewId(pSAppDEViewId);
        return this;
    }

    /**
     * <B>PSAPPDEVIEWNAME</B>&nbsp;代码标识，指定应用实体视图的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPDEVIEWNAME = "psappdeviewname";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPDEVIEWNAME}
     * 
     * @param pSAppDEViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPDEVIEWNAME)
    public void setPSAppDEViewName(String pSAppDEViewName){
        this.set(FIELD_PSAPPDEVIEWNAME, pSAppDEViewName);
        this.set(FIELD_PSAPPVIEWNAME, pSAppDEViewName);        
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppDEViewName(){
        Object objValue = this.get(FIELD_PSAPPDEVIEWNAME);
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
    public boolean isPSAppDEViewNameDirty(){
        if(this.contains(FIELD_PSAPPDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetPSAppDEViewName(){
        this.reset(FIELD_PSAPPDEVIEWNAME);
        this.reset(FIELD_PSAPPVIEWNAME);        
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_PSAPPDEVIEWNAME}
     * <P>
     * 等同 {@link #setPSAppDEViewName}
     * @param pSAppDEViewName
     */
    @JsonIgnore
    public PSAppDEViewDTO psappdeviewname(String pSAppDEViewName){
        this.setPSAppDEViewName(pSAppDEViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppDEViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppDEViewName(strName);
    }

    @JsonIgnore
    public PSAppDEViewDTO name(String strName){
        this.setPSAppDEViewName(strName);
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
    public PSAppDEViewDTO updatedate(Timestamp updateDate){
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
    public PSAppDEViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppDEViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppDEViewId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppDEViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppDEViewId(strValue);
    }

    @JsonIgnore
    public PSAppDEViewDTO id(String strValue){
        this.setPSAppDEViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppDEViewDTO){
            PSAppDEViewDTO dto = (PSAppDEViewDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
