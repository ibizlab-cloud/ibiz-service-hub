package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCDETemplDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDCDETEMPLID</B>&nbsp;云实体模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCDETEMPLID = "psdcdetemplid";

    /**
     * 设置 云实体模板标识
     * 
     * @param pSDCDETemplId
     * 
     */
    @JsonProperty(FIELD_PSDCDETEMPLID)
    public void setPSDCDETemplId(String pSDCDETemplId){
        this.set(FIELD_PSDCDETEMPLID, pSDCDETemplId);
    }
    
    /**
     * 获取 云实体模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCDETemplId(){
        Object objValue = this.get(FIELD_PSDCDETEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云实体模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCDETemplIdDirty(){
        if(this.contains(FIELD_PSDCDETEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云实体模板标识
     */
    @JsonIgnore
    public void resetPSDCDETemplId(){
        this.reset(FIELD_PSDCDETEMPLID);
    }

    /**
     * 设置 云实体模板标识
     * <P>
     * 等同 {@link #setPSDCDETemplId}
     * @param pSDCDETemplId
     */
    @JsonIgnore
    public PSDCDETemplDTO psdcdetemplid(String pSDCDETemplId){
        this.setPSDCDETemplId(pSDCDETemplId);
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
    public PSDCDETemplDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
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
    public PSDCDETemplDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDCDETEMPLNAME</B>&nbsp;云实体模板名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCDETEMPLNAME = "psdcdetemplname";

    /**
     * 设置 云实体模板名称
     * 
     * @param pSDCDETemplName
     * 
     */
    @JsonProperty(FIELD_PSDCDETEMPLNAME)
    public void setPSDCDETemplName(String pSDCDETemplName){
        this.set(FIELD_PSDCDETEMPLNAME, pSDCDETemplName);
    }
    
    /**
     * 获取 云实体模板名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCDETemplName(){
        Object objValue = this.get(FIELD_PSDCDETEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云实体模板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCDETemplNameDirty(){
        if(this.contains(FIELD_PSDCDETEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云实体模板名称
     */
    @JsonIgnore
    public void resetPSDCDETemplName(){
        this.reset(FIELD_PSDCDETEMPLNAME);
    }

    /**
     * 设置 云实体模板名称
     * <P>
     * 等同 {@link #setPSDCDETemplName}
     * @param pSDCDETemplName
     */
    @JsonIgnore
    public PSDCDETemplDTO psdcdetemplname(String pSDCDETemplName){
        this.setPSDCDETemplName(pSDCDETemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCDETemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCDETemplName(strName);
    }

    @JsonIgnore
    public PSDCDETemplDTO name(String strName){
        this.setPSDCDETemplName(strName);
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
    public PSDCDETemplDTO updateman(String updateMan){
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
    public PSDCDETemplDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCDETemplId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCDETemplDTO){
            PSDCDETemplDTO dto = (PSDCDETemplDTO)iEntity;
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