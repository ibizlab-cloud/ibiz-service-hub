package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPTYPE</B>云应用系统类型 模型传输对象
 * <P>
 * 
 */
public class PSAppType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSAppType(){
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
    public PSAppType createdate(String createDate){
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
    public PSAppType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ICONPATH</B>&nbsp;图标路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_ICONPATH = "iconpath";

    /**
     * 设置 图标路径
     * 
     * @param iconPath
     * 
     */
    @JsonProperty(FIELD_ICONPATH)
    public void setIconPath(String iconPath){
        this.set(FIELD_ICONPATH, iconPath);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getIconPath(){
        Object objValue = this.get(FIELD_ICONPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathDirty(){
        if(this.contains(FIELD_ICONPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetIconPath(){
        this.reset(FIELD_ICONPATH);
    }

    /**
     * 设置 图标路径
     * <P>
     * 等同 {@link #setIconPath}
     * @param iconPath
     */
    @JsonIgnore
    public PSAppType iconpath(String iconPath){
        this.setIconPath(iconPath);
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
    public PSAppType memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBILEMODE</B>&nbsp;移动应用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MOBILEMODE = "mobilemode";

    /**
     * 设置 移动应用
     * 
     * @param mobileMode
     * 
     */
    @JsonProperty(FIELD_MOBILEMODE)
    public void setMobileMode(Integer mobileMode){
        this.set(FIELD_MOBILEMODE, mobileMode);
    }
    
    /**
     * 获取 移动应用  
     * @return
     */
    @JsonIgnore
    public Integer getMobileMode(){
        Object objValue = this.get(FIELD_MOBILEMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobileModeDirty(){
        if(this.contains(FIELD_MOBILEMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动应用
     */
    @JsonIgnore
    public void resetMobileMode(){
        this.reset(FIELD_MOBILEMODE);
    }

    /**
     * 设置 移动应用
     * <P>
     * 等同 {@link #setMobileMode}
     * @param mobileMode
     */
    @JsonIgnore
    public PSAppType mobilemode(Integer mobileMode){
        this.setMobileMode(mobileMode);
        return this;
    }

     /**
     * 设置 移动应用
     * <P>
     * 等同 {@link #setMobileMode}
     * @param mobileMode
     */
    @JsonIgnore
    public PSAppType mobilemode(Boolean mobileMode){
        if(mobileMode == null){
            this.setMobileMode(null);
        }
        else{
            this.setMobileMode(mobileMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSAPPTYPEID</B>&nbsp;云应用系统类型标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPTYPEID = "psapptypeid";

    /**
     * 设置 云应用系统类型标识
     * 
     * @param pSAppTypeId
     * 
     */
    @JsonProperty(FIELD_PSAPPTYPEID)
    public void setPSAppTypeId(String pSAppTypeId){
        this.set(FIELD_PSAPPTYPEID, pSAppTypeId);
    }
    
    /**
     * 获取 云应用系统类型标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppTypeId(){
        Object objValue = this.get(FIELD_PSAPPTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云应用系统类型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTypeIdDirty(){
        if(this.contains(FIELD_PSAPPTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云应用系统类型标识
     */
    @JsonIgnore
    public void resetPSAppTypeId(){
        this.reset(FIELD_PSAPPTYPEID);
    }

    /**
     * 设置 云应用系统类型标识
     * <P>
     * 等同 {@link #setPSAppTypeId}
     * @param pSAppTypeId
     */
    @JsonIgnore
    public PSAppType psapptypeid(String pSAppTypeId){
        this.setPSAppTypeId(pSAppTypeId);
        return this;
    }

    /**
     * <B>PSAPPTYPENAME</B>&nbsp;云应用系统类型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPTYPENAME = "psapptypename";

    /**
     * 设置 云应用系统类型名称
     * 
     * @param pSAppTypeName
     * 
     */
    @JsonProperty(FIELD_PSAPPTYPENAME)
    public void setPSAppTypeName(String pSAppTypeName){
        this.set(FIELD_PSAPPTYPENAME, pSAppTypeName);
    }
    
    /**
     * 获取 云应用系统类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppTypeName(){
        Object objValue = this.get(FIELD_PSAPPTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云应用系统类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppTypeNameDirty(){
        if(this.contains(FIELD_PSAPPTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云应用系统类型名称
     */
    @JsonIgnore
    public void resetPSAppTypeName(){
        this.reset(FIELD_PSAPPTYPENAME);
    }

    /**
     * 设置 云应用系统类型名称
     * <P>
     * 等同 {@link #setPSAppTypeName}
     * @param pSAppTypeName
     */
    @JsonIgnore
    public PSAppType psapptypename(String pSAppTypeName){
        this.setPSAppTypeName(pSAppTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppTypeName(strName);
    }

    @JsonIgnore
    public PSAppType name(String strName){
        this.setPSAppTypeName(strName);
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
    public PSAppType updatedate(String updateDate){
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
    public PSAppType updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppTypeId(strValue);
    }

    @JsonIgnore
    public PSAppType id(String strValue){
        this.setPSAppTypeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSAppType){
            PSAppType model = (PSAppType)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
