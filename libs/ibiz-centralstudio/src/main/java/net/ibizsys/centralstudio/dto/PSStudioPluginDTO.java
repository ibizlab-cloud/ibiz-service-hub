package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSStudioPluginDTO extends CentralEntityDTOBase{

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
    public PSStudioPluginDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
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
    public PSStudioPluginDTO validflag(Integer validFlag){
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
    public PSStudioPluginDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSSTUDIOPLUGINNAME</B>&nbsp;插件名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSTUDIOPLUGINNAME = "psstudiopluginname";

    /**
     * 设置 插件名称
     * 
     * @param pSStudioPluginName
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOPLUGINNAME)
    public void setPSStudioPluginName(String pSStudioPluginName){
        this.set(FIELD_PSSTUDIOPLUGINNAME, pSStudioPluginName);
    }
    
    /**
     * 获取 插件名称  
     * @return
     */
    @JsonIgnore
    public String getPSStudioPluginName(){
        Object objValue = this.get(FIELD_PSSTUDIOPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioPluginNameDirty(){
        if(this.contains(FIELD_PSSTUDIOPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件名称
     */
    @JsonIgnore
    public void resetPSStudioPluginName(){
        this.reset(FIELD_PSSTUDIOPLUGINNAME);
    }

    /**
     * 设置 插件名称
     * <P>
     * 等同 {@link #setPSStudioPluginName}
     * @param pSStudioPluginName
     */
    @JsonIgnore
    public PSStudioPluginDTO psstudiopluginname(String pSStudioPluginName){
        this.setPSStudioPluginName(pSStudioPluginName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSStudioPluginName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSStudioPluginName(strName);
    }

    @JsonIgnore
    public PSStudioPluginDTO name(String strName){
        this.setPSStudioPluginName(strName);
        return this;
    }

    /**
     * <B>PSSTUDIOPLUGINID</B>&nbsp;建模工具插件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSTUDIOPLUGINID = "psstudiopluginid";

    /**
     * 设置 建模工具插件标识
     * 
     * @param pSStudioPluginId
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOPLUGINID)
    public void setPSStudioPluginId(String pSStudioPluginId){
        this.set(FIELD_PSSTUDIOPLUGINID, pSStudioPluginId);
    }
    
    /**
     * 获取 建模工具插件标识  
     * @return
     */
    @JsonIgnore
    public String getPSStudioPluginId(){
        Object objValue = this.get(FIELD_PSSTUDIOPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建模工具插件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioPluginIdDirty(){
        if(this.contains(FIELD_PSSTUDIOPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建模工具插件标识
     */
    @JsonIgnore
    public void resetPSStudioPluginId(){
        this.reset(FIELD_PSSTUDIOPLUGINID);
    }

    /**
     * 设置 建模工具插件标识
     * <P>
     * 等同 {@link #setPSStudioPluginId}
     * @param pSStudioPluginId
     */
    @JsonIgnore
    public PSStudioPluginDTO psstudiopluginid(String pSStudioPluginId){
        this.setPSStudioPluginId(pSStudioPluginId);
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
    public PSStudioPluginDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSOBJTYPENAME</B>&nbsp;目标模型类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSOBJTYPENAME = "psobjtypename";

    /**
     * 设置 目标模型类型
     * 
     * @param pSObjTypeName
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPENAME)
    public void setPSObjTypeName(String pSObjTypeName){
        this.set(FIELD_PSOBJTYPENAME, pSObjTypeName);
    }
    
    /**
     * 获取 目标模型类型  
     * @return
     */
    @JsonIgnore
    public String getPSObjTypeName(){
        Object objValue = this.get(FIELD_PSOBJTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标模型类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjTypeNameDirty(){
        if(this.contains(FIELD_PSOBJTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标模型类型
     */
    @JsonIgnore
    public void resetPSObjTypeName(){
        this.reset(FIELD_PSOBJTYPENAME);
    }

    /**
     * 设置 目标模型类型
     * <P>
     * 等同 {@link #setPSObjTypeName}
     * @param pSObjTypeName
     */
    @JsonIgnore
    public PSStudioPluginDTO psobjtypename(String pSObjTypeName){
        this.setPSObjTypeName(pSObjTypeName);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterName(){
        Object objValue = this.get(FIELD_PSDEVCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSStudioPluginDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>PSOBJTYPE</B>&nbsp;目标模型类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PSOBJTYPE = "psobjtype";

    /**
     * 设置 目标模型类型
     * 
     * @param pSObjType
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPE)
    public void setPSObjType(String pSObjType){
        this.set(FIELD_PSOBJTYPE, pSObjType);
    }
    
    /**
     * 获取 目标模型类型  
     * @return
     */
    @JsonIgnore
    public String getPSObjType(){
        Object objValue = this.get(FIELD_PSOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标模型类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjTypeDirty(){
        if(this.contains(FIELD_PSOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标模型类型
     */
    @JsonIgnore
    public void resetPSObjType(){
        this.reset(FIELD_PSOBJTYPE);
    }

    /**
     * 设置 目标模型类型
     * <P>
     * 等同 {@link #setPSObjType}
     * @param pSObjType
     */
    @JsonIgnore
    public PSStudioPluginDTO psobjtype(String pSObjType){
        this.setPSObjType(pSObjType);
        return this;
    }

    /**
     * <B>PLUGINICONURL</B>&nbsp;插件图标地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PLUGINICONURL = "pluginiconurl";

    /**
     * 设置 插件图标地址
     * 
     * @param pluginIconUrl
     * 
     */
    @JsonProperty(FIELD_PLUGINICONURL)
    public void setPluginIconUrl(String pluginIconUrl){
        this.set(FIELD_PLUGINICONURL, pluginIconUrl);
    }
    
    /**
     * 获取 插件图标地址  
     * @return
     */
    @JsonIgnore
    public String getPluginIconUrl(){
        Object objValue = this.get(FIELD_PLUGINICONURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件图标地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginIconUrlDirty(){
        if(this.contains(FIELD_PLUGINICONURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件图标地址
     */
    @JsonIgnore
    public void resetPluginIconUrl(){
        this.reset(FIELD_PLUGINICONURL);
    }

    /**
     * 设置 插件图标地址
     * <P>
     * 等同 {@link #setPluginIconUrl}
     * @param pluginIconUrl
     */
    @JsonIgnore
    public PSStudioPluginDTO pluginiconurl(String pluginIconUrl){
        this.setPluginIconUrl(pluginIconUrl);
        return this;
    }

    /**
     * <B>PLUGINURL</B>&nbsp;插件地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PLUGINURL = "pluginurl";

    /**
     * 设置 插件地址
     * 
     * @param pluginUrl
     * 
     */
    @JsonProperty(FIELD_PLUGINURL)
    public void setPluginUrl(String pluginUrl){
        this.set(FIELD_PLUGINURL, pluginUrl);
    }
    
    /**
     * 获取 插件地址  
     * @return
     */
    @JsonIgnore
    public String getPluginUrl(){
        Object objValue = this.get(FIELD_PLUGINURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginUrlDirty(){
        if(this.contains(FIELD_PLUGINURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件地址
     */
    @JsonIgnore
    public void resetPluginUrl(){
        this.reset(FIELD_PLUGINURL);
    }

    /**
     * 设置 插件地址
     * <P>
     * 等同 {@link #setPluginUrl}
     * @param pluginUrl
     */
    @JsonIgnore
    public PSStudioPluginDTO pluginurl(String pluginUrl){
        this.setPluginUrl(pluginUrl);
        return this;
    }

    /**
     * <B>PLUGINURL2</B>&nbsp;插件地址2
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PLUGINURL2 = "pluginurl2";

    /**
     * 设置 插件地址2
     * 
     * @param pluginUrl2
     * 
     */
    @JsonProperty(FIELD_PLUGINURL2)
    public void setPluginUrl2(String pluginUrl2){
        this.set(FIELD_PLUGINURL2, pluginUrl2);
    }
    
    /**
     * 获取 插件地址2  
     * @return
     */
    @JsonIgnore
    public String getPluginUrl2(){
        Object objValue = this.get(FIELD_PLUGINURL2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件地址2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginUrl2Dirty(){
        if(this.contains(FIELD_PLUGINURL2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件地址2
     */
    @JsonIgnore
    public void resetPluginUrl2(){
        this.reset(FIELD_PLUGINURL2);
    }

    /**
     * 设置 插件地址2
     * <P>
     * 等同 {@link #setPluginUrl2}
     * @param pluginUrl2
     */
    @JsonIgnore
    public PSStudioPluginDTO pluginurl2(String pluginUrl2){
        this.setPluginUrl2(pluginUrl2);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 应用中心
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterId(){
        Object objValue = this.get(FIELD_PSDEVCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 应用中心
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSStudioPluginDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PLUGINDESCURL</B>&nbsp;插件说明地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PLUGINDESCURL = "plugindescurl";

    /**
     * 设置 插件说明地址
     * 
     * @param pluginDescUrl
     * 
     */
    @JsonProperty(FIELD_PLUGINDESCURL)
    public void setPluginDescUrl(String pluginDescUrl){
        this.set(FIELD_PLUGINDESCURL, pluginDescUrl);
    }
    
    /**
     * 获取 插件说明地址  
     * @return
     */
    @JsonIgnore
    public String getPluginDescUrl(){
        Object objValue = this.get(FIELD_PLUGINDESCURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件说明地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginDescUrlDirty(){
        if(this.contains(FIELD_PLUGINDESCURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件说明地址
     */
    @JsonIgnore
    public void resetPluginDescUrl(){
        this.reset(FIELD_PLUGINDESCURL);
    }

    /**
     * 设置 插件说明地址
     * <P>
     * 等同 {@link #setPluginDescUrl}
     * @param pluginDescUrl
     */
    @JsonIgnore
    public PSStudioPluginDTO plugindescurl(String pluginDescUrl){
        this.setPluginDescUrl(pluginDescUrl);
        return this;
    }

    /**
     * <B>PLUGINDATA2</B>&nbsp;插件数据2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PLUGINDATA2 = "plugindata2";

    /**
     * 设置 插件数据2
     * 
     * @param pluginData2
     * 
     */
    @JsonProperty(FIELD_PLUGINDATA2)
    public void setPluginData2(String pluginData2){
        this.set(FIELD_PLUGINDATA2, pluginData2);
    }
    
    /**
     * 获取 插件数据2  
     * @return
     */
    @JsonIgnore
    public String getPluginData2(){
        Object objValue = this.get(FIELD_PLUGINDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginData2Dirty(){
        if(this.contains(FIELD_PLUGINDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件数据2
     */
    @JsonIgnore
    public void resetPluginData2(){
        this.reset(FIELD_PLUGINDATA2);
    }

    /**
     * 设置 插件数据2
     * <P>
     * 等同 {@link #setPluginData2}
     * @param pluginData2
     */
    @JsonIgnore
    public PSStudioPluginDTO plugindata2(String pluginData2){
        this.setPluginData2(pluginData2);
        return this;
    }

    /**
     * <B>PLUGINDESC</B>&nbsp;插件说明
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_PLUGINDESC = "plugindesc";

    /**
     * 设置 插件说明
     * 
     * @param pluginDesc
     * 
     */
    @JsonProperty(FIELD_PLUGINDESC)
    public void setPluginDesc(String pluginDesc){
        this.set(FIELD_PLUGINDESC, pluginDesc);
    }
    
    /**
     * 获取 插件说明  
     * @return
     */
    @JsonIgnore
    public String getPluginDesc(){
        Object objValue = this.get(FIELD_PLUGINDESC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件说明 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginDescDirty(){
        if(this.contains(FIELD_PLUGINDESC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件说明
     */
    @JsonIgnore
    public void resetPluginDesc(){
        this.reset(FIELD_PLUGINDESC);
    }

    /**
     * 设置 插件说明
     * <P>
     * 等同 {@link #setPluginDesc}
     * @param pluginDesc
     */
    @JsonIgnore
    public PSStudioPluginDTO plugindesc(String pluginDesc){
        this.setPluginDesc(pluginDesc);
        return this;
    }

    /**
     * <B>PLUGINCAT</B>&nbsp;插件分类
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PLUGINCAT = "plugincat";

    /**
     * 设置 插件分类
     * 
     * @param pluginCat
     * 
     */
    @JsonProperty(FIELD_PLUGINCAT)
    public void setPluginCat(String pluginCat){
        this.set(FIELD_PLUGINCAT, pluginCat);
    }
    
    /**
     * 获取 插件分类  
     * @return
     */
    @JsonIgnore
    public String getPluginCat(){
        Object objValue = this.get(FIELD_PLUGINCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginCatDirty(){
        if(this.contains(FIELD_PLUGINCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件分类
     */
    @JsonIgnore
    public void resetPluginCat(){
        this.reset(FIELD_PLUGINCAT);
    }

    /**
     * 设置 插件分类
     * <P>
     * 等同 {@link #setPluginCat}
     * @param pluginCat
     */
    @JsonIgnore
    public PSStudioPluginDTO plugincat(String pluginCat){
        this.setPluginCat(pluginCat);
        return this;
    }

    /**
     * <B>PLUGINDATA</B>&nbsp;插件标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PLUGINDATA = "plugindata";

    /**
     * 设置 插件标识
     * 
     * @param pluginData
     * 
     */
    @JsonProperty(FIELD_PLUGINDATA)
    public void setPluginData(String pluginData){
        this.set(FIELD_PLUGINDATA, pluginData);
    }
    
    /**
     * 获取 插件标识  
     * @return
     */
    @JsonIgnore
    public String getPluginData(){
        Object objValue = this.get(FIELD_PLUGINDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginDataDirty(){
        if(this.contains(FIELD_PLUGINDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件标识
     */
    @JsonIgnore
    public void resetPluginData(){
        this.reset(FIELD_PLUGINDATA);
    }

    /**
     * 设置 插件标识
     * <P>
     * 等同 {@link #setPluginData}
     * @param pluginData
     */
    @JsonIgnore
    public PSStudioPluginDTO plugindata(String pluginData){
        this.setPluginData(pluginData);
        return this;
    }

    /**
     * <B>KEYWORDS</B>&nbsp;关键字
     * <P>
     * 字符串：最大长度 300
     */
    public final static String FIELD_KEYWORDS = "keywords";

    /**
     * 设置 关键字
     * 
     * @param keywords
     * 
     */
    @JsonProperty(FIELD_KEYWORDS)
    public void setKeywords(String keywords){
        this.set(FIELD_KEYWORDS, keywords);
    }
    
    /**
     * 获取 关键字  
     * @return
     */
    @JsonIgnore
    public String getKeywords(){
        Object objValue = this.get(FIELD_KEYWORDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关键字 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isKeywordsDirty(){
        if(this.contains(FIELD_KEYWORDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关键字
     */
    @JsonIgnore
    public void resetKeywords(){
        this.reset(FIELD_KEYWORDS);
    }

    /**
     * 设置 关键字
     * <P>
     * 等同 {@link #setKeywords}
     * @param keywords
     */
    @JsonIgnore
    public PSStudioPluginDTO keywords(String keywords){
        this.setKeywords(keywords);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 排序值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSStudioPluginDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
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
    public PSStudioPluginDTO memo(String memo){
        this.setMemo(memo);
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
    public PSStudioPluginDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSStudioPluginDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>ALLDCFLAG</B>&nbsp;全部中心标记
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
     */
    public final static String FIELD_ALLDCFLAG = "alldcflag";

    /**
     * 设置 全部中心标记
     * 
     * @param allDCFlag
     * 
     */
    @JsonProperty(FIELD_ALLDCFLAG)
    public void setAllDCFlag(Integer allDCFlag){
        this.set(FIELD_ALLDCFLAG, allDCFlag);
    }
    
    /**
     * 获取 全部中心标记  
     * @return
     */
    @JsonIgnore
    public Integer getAllDCFlag(){
        Object objValue = this.get(FIELD_ALLDCFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部中心标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllDCFlagDirty(){
        if(this.contains(FIELD_ALLDCFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部中心标记
     */
    @JsonIgnore
    public void resetAllDCFlag(){
        this.reset(FIELD_ALLDCFLAG);
    }

    /**
     * 设置 全部中心标记
     * <P>
     * 等同 {@link #setAllDCFlag}
     * @param allDCFlag
     */
    @JsonIgnore
    public PSStudioPluginDTO alldcflag(Integer allDCFlag){
        this.setAllDCFlag(allDCFlag);
        return this;
    }

     /**
     * 设置 全部中心标记
     * <P>
     * 等同 {@link #setAllDCFlag}
     * @param allDCFlag
     */
    @JsonIgnore
    public PSStudioPluginDTO alldcflag(Boolean allDCFlag){
        if(allDCFlag == null){
            this.setAllDCFlag(null);
        }
        else{
            this.setAllDCFlag(allDCFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;插件代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 插件代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 插件代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 插件代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSStudioPluginDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>PLUGINOBJ</B>&nbsp;插件对象
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_PLUGINOBJ = "pluginobj";

    /**
     * 设置 插件对象
     * 
     * @param pluginObj
     * 
     */
    @JsonProperty(FIELD_PLUGINOBJ)
    public void setPluginObj(String pluginObj){
        this.set(FIELD_PLUGINOBJ, pluginObj);
    }
    
    /**
     * 获取 插件对象  
     * @return
     */
    @JsonIgnore
    public String getPluginObj(){
        Object objValue = this.get(FIELD_PLUGINOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 插件对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPluginObjDirty(){
        if(this.contains(FIELD_PLUGINOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 插件对象
     */
    @JsonIgnore
    public void resetPluginObj(){
        this.reset(FIELD_PLUGINOBJ);
    }

    /**
     * 设置 插件对象
     * <P>
     * 等同 {@link #setPluginObj}
     * @param pluginObj
     */
    @JsonIgnore
    public PSStudioPluginDTO pluginobj(String pluginObj){
        this.setPluginObj(pluginObj);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSStudioPluginId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSStudioPluginDTO){
            PSStudioPluginDTO dto = (PSStudioPluginDTO)iEntity;
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