package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCModelTemplDTO extends CentralEntityDTOBase{

    /**
     * <B>PSDCMODELTEMPLID</B>&nbsp;云模型模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCMODELTEMPLID = "psdcmodeltemplid";

    /**
     * 设置 云模型模板标识
     * 
     * @param pSDCModelTemplId
     * 
     */
    @JsonProperty(FIELD_PSDCMODELTEMPLID)
    public void setPSDCModelTemplId(String pSDCModelTemplId){
        this.set(FIELD_PSDCMODELTEMPLID, pSDCModelTemplId);
    }
    
    /**
     * 获取 云模型模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCModelTemplId(){
        Object objValue = this.get(FIELD_PSDCMODELTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云模型模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCModelTemplIdDirty(){
        if(this.contains(FIELD_PSDCMODELTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云模型模板标识
     */
    @JsonIgnore
    public void resetPSDCModelTemplId(){
        this.reset(FIELD_PSDCMODELTEMPLID);
    }

    /**
     * 设置 云模型模板标识
     * <P>
     * 等同 {@link #setPSDCModelTemplId}
     * @param pSDCModelTemplId
     */
    @JsonIgnore
    public PSDCModelTemplDTO psdcmodeltemplid(String pSDCModelTemplId){
        this.setPSDCModelTemplId(pSDCModelTemplId);
        return this;
    }

    /**
     * <B>PSDCMODELTEMPLNAME</B>&nbsp;云模型模板名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCMODELTEMPLNAME = "psdcmodeltemplname";

    /**
     * 设置 云模型模板名称
     * 
     * @param pSDCModelTemplName
     * 
     */
    @JsonProperty(FIELD_PSDCMODELTEMPLNAME)
    public void setPSDCModelTemplName(String pSDCModelTemplName){
        this.set(FIELD_PSDCMODELTEMPLNAME, pSDCModelTemplName);
    }
    
    /**
     * 获取 云模型模板名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCModelTemplName(){
        Object objValue = this.get(FIELD_PSDCMODELTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云模型模板名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCModelTemplNameDirty(){
        if(this.contains(FIELD_PSDCMODELTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云模型模板名称
     */
    @JsonIgnore
    public void resetPSDCModelTemplName(){
        this.reset(FIELD_PSDCMODELTEMPLNAME);
    }

    /**
     * 设置 云模型模板名称
     * <P>
     * 等同 {@link #setPSDCModelTemplName}
     * @param pSDCModelTemplName
     */
    @JsonIgnore
    public PSDCModelTemplDTO psdcmodeltemplname(String pSDCModelTemplName){
        this.setPSDCModelTemplName(pSDCModelTemplName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCModelTemplName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCModelTemplName(strName);
    }

    @JsonIgnore
    public PSDCModelTemplDTO name(String strName){
        this.setPSDCModelTemplName(strName);
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
    public PSDCModelTemplDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDCModelTemplDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDCModelTemplDTO updatedate(Timestamp updateDate){
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
    public PSDCModelTemplDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCModelTemplId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCModelTemplDTO){
            PSDCModelTemplDTO dto = (PSDCModelTemplDTO)iEntity;
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