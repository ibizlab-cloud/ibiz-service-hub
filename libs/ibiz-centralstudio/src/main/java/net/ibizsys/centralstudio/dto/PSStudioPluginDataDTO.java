package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSStudioPluginDataDTO extends CentralEntityDTOBase{

    /**
     * <B>PSSTUDIOPLUGINID</B>&nbsp;建模工具
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSTUDIOPLUGINID = "psstudiopluginid";

    /**
     * 设置 建模工具
     * 
     * @param pSStudioPluginId
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOPLUGINID)
    public void setPSStudioPluginId(String pSStudioPluginId){
        this.set(FIELD_PSSTUDIOPLUGINID, pSStudioPluginId);
    }
    
    /**
     * 获取 建模工具  
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
     * 判断 建模工具 是否指定值，包括空值
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
     * 重置 建模工具
     */
    @JsonIgnore
    public void resetPSStudioPluginId(){
        this.reset(FIELD_PSSTUDIOPLUGINID);
    }

    /**
     * 设置 建模工具
     * <P>
     * 等同 {@link #setPSStudioPluginId}
     * @param pSStudioPluginId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psstudiopluginid(String pSStudioPluginId){
        this.setPSStudioPluginId(pSStudioPluginId);
        return this;
    }

    /**
     * <B>PSSTUDIOPLUGINNAME</B>&nbsp;建模工具
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSTUDIOPLUGINID}
     */
    public final static String FIELD_PSSTUDIOPLUGINNAME = "psstudiopluginname";

    /**
     * 设置 建模工具
     * 
     * @param pSStudioPluginName
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOPLUGINNAME)
    public void setPSStudioPluginName(String pSStudioPluginName){
        this.set(FIELD_PSSTUDIOPLUGINNAME, pSStudioPluginName);
    }
    
    /**
     * 获取 建模工具  
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
     * 判断 建模工具 是否指定值，包括空值
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
     * 重置 建模工具
     */
    @JsonIgnore
    public void resetPSStudioPluginName(){
        this.reset(FIELD_PSSTUDIOPLUGINNAME);
    }

    /**
     * 设置 建模工具
     * <P>
     * 等同 {@link #setPSStudioPluginName}
     * @param pSStudioPluginName
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psstudiopluginname(String pSStudioPluginName){
        this.setPSStudioPluginName(pSStudioPluginName);
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
    public PSStudioPluginDataDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PSSTUDIOPLUGINDATAID</B>&nbsp;建模工具插件数据标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSTUDIOPLUGINDATAID = "psstudioplugindataid";

    /**
     * 设置 建模工具插件数据标识
     * 
     * @param pSStudioPluginDataId
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOPLUGINDATAID)
    public void setPSStudioPluginDataId(String pSStudioPluginDataId){
        this.set(FIELD_PSSTUDIOPLUGINDATAID, pSStudioPluginDataId);
    }
    
    /**
     * 获取 建模工具插件数据标识  
     * @return
     */
    @JsonIgnore
    public String getPSStudioPluginDataId(){
        Object objValue = this.get(FIELD_PSSTUDIOPLUGINDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建模工具插件数据标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioPluginDataIdDirty(){
        if(this.contains(FIELD_PSSTUDIOPLUGINDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建模工具插件数据标识
     */
    @JsonIgnore
    public void resetPSStudioPluginDataId(){
        this.reset(FIELD_PSSTUDIOPLUGINDATAID);
    }

    /**
     * 设置 建模工具插件数据标识
     * <P>
     * 等同 {@link #setPSStudioPluginDataId}
     * @param pSStudioPluginDataId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psstudioplugindataid(String pSStudioPluginDataId){
        this.setPSStudioPluginDataId(pSStudioPluginDataId);
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
    public PSStudioPluginDataDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSSTUDIOPLUGINDATANAME</B>&nbsp;数据名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSTUDIOPLUGINDATANAME = "psstudioplugindataname";

    /**
     * 设置 数据名称
     * 
     * @param pSStudioPluginDataName
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOPLUGINDATANAME)
    public void setPSStudioPluginDataName(String pSStudioPluginDataName){
        this.set(FIELD_PSSTUDIOPLUGINDATANAME, pSStudioPluginDataName);
    }
    
    /**
     * 获取 数据名称  
     * @return
     */
    @JsonIgnore
    public String getPSStudioPluginDataName(){
        Object objValue = this.get(FIELD_PSSTUDIOPLUGINDATANAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioPluginDataNameDirty(){
        if(this.contains(FIELD_PSSTUDIOPLUGINDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据名称
     */
    @JsonIgnore
    public void resetPSStudioPluginDataName(){
        this.reset(FIELD_PSSTUDIOPLUGINDATANAME);
    }

    /**
     * 设置 数据名称
     * <P>
     * 等同 {@link #setPSStudioPluginDataName}
     * @param pSStudioPluginDataName
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psstudioplugindataname(String pSStudioPluginDataName){
        this.setPSStudioPluginDataName(pSStudioPluginDataName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSStudioPluginDataName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSStudioPluginDataName(strName);
    }

    @JsonIgnore
    public PSStudioPluginDataDTO name(String strName){
        this.setPSStudioPluginDataName(strName);
        return this;
    }

    /**
     * <B>PSOBJNAME</B>&nbsp;模型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJNAME = "psobjname";

    /**
     * 设置 模型名称
     * 
     * @param pSObjName
     * 
     */
    @JsonProperty(FIELD_PSOBJNAME)
    public void setPSObjName(String pSObjName){
        this.set(FIELD_PSOBJNAME, pSObjName);
    }
    
    /**
     * 获取 模型名称  
     * @return
     */
    @JsonIgnore
    public String getPSObjName(){
        Object objValue = this.get(FIELD_PSOBJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjNameDirty(){
        if(this.contains(FIELD_PSOBJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型名称
     */
    @JsonIgnore
    public void resetPSObjName(){
        this.reset(FIELD_PSOBJNAME);
    }

    /**
     * 设置 模型名称
     * <P>
     * 等同 {@link #setPSObjName}
     * @param pSObjName
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psobjname(String pSObjName){
        this.setPSObjName(pSObjName);
        return this;
    }

    /**
     * <B>PSOBJID</B>&nbsp;模型标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSOBJID = "psobjid";

    /**
     * 设置 模型标识
     * 
     * @param pSObjId
     * 
     */
    @JsonProperty(FIELD_PSOBJID)
    public void setPSObjId(String pSObjId){
        this.set(FIELD_PSOBJID, pSObjId);
    }
    
    /**
     * 获取 模型标识  
     * @return
     */
    @JsonIgnore
    public String getPSObjId(){
        Object objValue = this.get(FIELD_PSOBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjIdDirty(){
        if(this.contains(FIELD_PSOBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标识
     */
    @JsonIgnore
    public void resetPSObjId(){
        this.reset(FIELD_PSOBJID);
    }

    /**
     * 设置 模型标识
     * <P>
     * 等同 {@link #setPSObjId}
     * @param pSObjId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psobjid(String pSObjId){
        this.setPSObjId(pSObjId);
        return this;
    }

    /**
     * <B>PSOBJTYPE</B>&nbsp;模型类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PSOBJTYPE = "psobjtype";

    /**
     * 设置 模型类型
     * 
     * @param pSObjType
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPE)
    public void setPSObjType(String pSObjType){
        this.set(FIELD_PSOBJTYPE, pSObjType);
    }
    
    /**
     * 获取 模型类型  
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
     * 判断 模型类型 是否指定值，包括空值
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
     * 重置 模型类型
     */
    @JsonIgnore
    public void resetPSObjType(){
        this.reset(FIELD_PSOBJTYPE);
    }

    /**
     * 设置 模型类型
     * <P>
     * 等同 {@link #setPSObjType}
     * @param pSObjType
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psobjtype(String pSObjType){
        this.setPSObjType(pSObjType);
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
    public PSStudioPluginDataDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
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
    public PSStudioPluginDataDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统标识
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统标识
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
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
    public PSStudioPluginDataDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ENDTIME</B>&nbsp;结束时间
     */
    public final static String FIELD_ENDTIME = "endtime";

    /**
     * 设置 结束时间
     * 
     * @param endTime
     * 
     */
    @JsonProperty(FIELD_ENDTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setEndTime(Timestamp endTime){
        this.set(FIELD_ENDTIME, endTime);
    }
    
    /**
     * 获取 结束时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getEndTime(){
        Object objValue = this.get(FIELD_ENDTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 结束时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndTimeDirty(){
        if(this.contains(FIELD_ENDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间
     */
    @JsonIgnore
    public void resetEndTime(){
        this.reset(FIELD_ENDTIME);
    }

    /**
     * 设置 结束时间
     * <P>
     * 等同 {@link #setEndTime}
     * @param endTime
     */
    @JsonIgnore
    public PSStudioPluginDataDTO endtime(Timestamp endTime){
        this.setEndTime(endTime);
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
    public PSStudioPluginDataDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>BEGINTIME</B>&nbsp;开始时间
     */
    public final static String FIELD_BEGINTIME = "begintime";

    /**
     * 设置 开始时间
     * 
     * @param beginTime
     * 
     */
    @JsonProperty(FIELD_BEGINTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setBeginTime(Timestamp beginTime){
        this.set(FIELD_BEGINTIME, beginTime);
    }
    
    /**
     * 获取 开始时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getBeginTime(){
        Object objValue = this.get(FIELD_BEGINTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 开始时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginTimeDirty(){
        if(this.contains(FIELD_BEGINTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间
     */
    @JsonIgnore
    public void resetBeginTime(){
        this.reset(FIELD_BEGINTIME);
    }

    /**
     * 设置 开始时间
     * <P>
     * 等同 {@link #setBeginTime}
     * @param beginTime
     */
    @JsonIgnore
    public PSStudioPluginDataDTO begintime(Timestamp beginTime){
        this.setBeginTime(beginTime);
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
    public PSStudioPluginDataDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>ACTIONTYPE</B>&nbsp;操作类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_ACTIONTYPE = "actiontype";

    /**
     * 设置 操作类型
     * 
     * @param actionType
     * 
     */
    @JsonProperty(FIELD_ACTIONTYPE)
    public void setActionType(String actionType){
        this.set(FIELD_ACTIONTYPE, actionType);
    }
    
    /**
     * 获取 操作类型  
     * @return
     */
    @JsonIgnore
    public String getActionType(){
        Object objValue = this.get(FIELD_ACTIONTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionTypeDirty(){
        if(this.contains(FIELD_ACTIONTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作类型
     */
    @JsonIgnore
    public void resetActionType(){
        this.reset(FIELD_ACTIONTYPE);
    }

    /**
     * 设置 操作类型
     * <P>
     * 等同 {@link #setActionType}
     * @param actionType
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actiontype(String actionType){
        this.setActionType(actionType);
        return this;
    }

    /**
     * <B>ACTIONPARAM4</B>&nbsp;操作参数4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM4 = "actionparam4";

    /**
     * 设置 操作参数4
     * 
     * @param actionParam4
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM4)
    public void setActionParam4(String actionParam4){
        this.set(FIELD_ACTIONPARAM4, actionParam4);
    }
    
    /**
     * 获取 操作参数4  
     * @return
     */
    @JsonIgnore
    public String getActionParam4(){
        Object objValue = this.get(FIELD_ACTIONPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam4Dirty(){
        if(this.contains(FIELD_ACTIONPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数4
     */
    @JsonIgnore
    public void resetActionParam4(){
        this.reset(FIELD_ACTIONPARAM4);
    }

    /**
     * 设置 操作参数4
     * <P>
     * 等同 {@link #setActionParam4}
     * @param actionParam4
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam4(String actionParam4){
        this.setActionParam4(actionParam4);
        return this;
    }

    /**
     * <B>ACTIONPARAM3</B>&nbsp;操作参数3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM3 = "actionparam3";

    /**
     * 设置 操作参数3
     * 
     * @param actionParam3
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM3)
    public void setActionParam3(String actionParam3){
        this.set(FIELD_ACTIONPARAM3, actionParam3);
    }
    
    /**
     * 获取 操作参数3  
     * @return
     */
    @JsonIgnore
    public String getActionParam3(){
        Object objValue = this.get(FIELD_ACTIONPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam3Dirty(){
        if(this.contains(FIELD_ACTIONPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数3
     */
    @JsonIgnore
    public void resetActionParam3(){
        this.reset(FIELD_ACTIONPARAM3);
    }

    /**
     * 设置 操作参数3
     * <P>
     * 等同 {@link #setActionParam3}
     * @param actionParam3
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam3(String actionParam3){
        this.setActionParam3(actionParam3);
        return this;
    }

    /**
     * <B>ACTIONSTATE</B>&nbsp;操作状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.BackendActionState} 
     */
    public final static String FIELD_ACTIONSTATE = "actionstate";

    /**
     * 设置 操作状态
     * 
     * @param actionState
     * 
     */
    @JsonProperty(FIELD_ACTIONSTATE)
    public void setActionState(Integer actionState){
        this.set(FIELD_ACTIONSTATE, actionState);
    }
    
    /**
     * 获取 操作状态  
     * @return
     */
    @JsonIgnore
    public Integer getActionState(){
        Object objValue = this.get(FIELD_ACTIONSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 操作状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionStateDirty(){
        if(this.contains(FIELD_ACTIONSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作状态
     */
    @JsonIgnore
    public void resetActionState(){
        this.reset(FIELD_ACTIONSTATE);
    }

    /**
     * 设置 操作状态
     * <P>
     * 等同 {@link #setActionState}
     * @param actionState
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionstate(Integer actionState){
        this.setActionState(actionState);
        return this;
    }

     /**
     * 设置 操作状态
     * <P>
     * 等同 {@link #setActionState}
     * @param actionState
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionstate(net.ibizsys.centralstudio.util.CentralEnums.BackendActionState actionState){
        if(actionState == null){
            this.setActionState(null);
        }
        else{
            this.setActionState(actionState.value);
        }
        return this;
    }

    /**
     * <B>ACTIONPARAM2</B>&nbsp;操作参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM2 = "actionparam2";

    /**
     * 设置 操作参数2
     * 
     * @param actionParam2
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM2)
    public void setActionParam2(String actionParam2){
        this.set(FIELD_ACTIONPARAM2, actionParam2);
    }
    
    /**
     * 获取 操作参数2  
     * @return
     */
    @JsonIgnore
    public String getActionParam2(){
        Object objValue = this.get(FIELD_ACTIONPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam2Dirty(){
        if(this.contains(FIELD_ACTIONPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数2
     */
    @JsonIgnore
    public void resetActionParam2(){
        this.reset(FIELD_ACTIONPARAM2);
    }

    /**
     * 设置 操作参数2
     * <P>
     * 等同 {@link #setActionParam2}
     * @param actionParam2
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam2(String actionParam2){
        this.setActionParam2(actionParam2);
        return this;
    }

    /**
     * <B>ACTIONPARAM</B>&nbsp;操作参数
     */
    public final static String FIELD_ACTIONPARAM = "actionparam";

    /**
     * 设置 操作参数
     * 
     * @param actionParam
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM)
    public void setActionParam(String actionParam){
        this.set(FIELD_ACTIONPARAM, actionParam);
    }
    
    /**
     * 获取 操作参数  
     * @return
     */
    @JsonIgnore
    public String getActionParam(){
        Object objValue = this.get(FIELD_ACTIONPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParamDirty(){
        if(this.contains(FIELD_ACTIONPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数
     */
    @JsonIgnore
    public void resetActionParam(){
        this.reset(FIELD_ACTIONPARAM);
    }

    /**
     * 设置 操作参数
     * <P>
     * 等同 {@link #setActionParam}
     * @param actionParam
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam(String actionParam){
        this.setActionParam(actionParam);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案标识
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnId(){
        Object objValue = this.get(FIELD_PSDEVSLNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnIdDirty(){
        if(this.contains(FIELD_PSDEVSLNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案标识
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案标识
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVSLNTEMPLID</B>&nbsp;开发模板标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNTEMPLID = "psdevslntemplid";

    /**
     * 设置 开发模板标识
     * 
     * @param pSDevSlnTemplId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNTEMPLID)
    public void setPSDevSlnTemplId(String pSDevSlnTemplId){
        this.set(FIELD_PSDEVSLNTEMPLID, pSDevSlnTemplId);
    }
    
    /**
     * 获取 开发模板标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnTemplId(){
        Object objValue = this.get(FIELD_PSDEVSLNTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发模板标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnTemplIdDirty(){
        if(this.contains(FIELD_PSDEVSLNTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发模板标识
     */
    @JsonIgnore
    public void resetPSDevSlnTemplId(){
        this.reset(FIELD_PSDEVSLNTEMPLID);
    }

    /**
     * 设置 开发模板标识
     * <P>
     * 等同 {@link #setPSDevSlnTemplId}
     * @param pSDevSlnTemplId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO psdevslntemplid(String pSDevSlnTemplId){
        this.setPSDevSlnTemplId(pSDevSlnTemplId);
        return this;
    }

    /**
     * <B>FULLRESULTINFO</B>&nbsp;完整结果信息
     */
    public final static String FIELD_FULLRESULTINFO = "fullresultinfo";

    /**
     * 设置 完整结果信息
     * 
     * @param fullResultInfo
     * 
     */
    @JsonProperty(FIELD_FULLRESULTINFO)
    public void setFullResultInfo(String fullResultInfo){
        this.set(FIELD_FULLRESULTINFO, fullResultInfo);
    }
    
    /**
     * 获取 完整结果信息  
     * @return
     */
    @JsonIgnore
    public String getFullResultInfo(){
        Object objValue = this.get(FIELD_FULLRESULTINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 完整结果信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullResultInfoDirty(){
        if(this.contains(FIELD_FULLRESULTINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 完整结果信息
     */
    @JsonIgnore
    public void resetFullResultInfo(){
        this.reset(FIELD_FULLRESULTINFO);
    }

    /**
     * 设置 完整结果信息
     * <P>
     * 等同 {@link #setFullResultInfo}
     * @param fullResultInfo
     */
    @JsonIgnore
    public PSStudioPluginDataDTO fullresultinfo(String fullResultInfo){
        this.setFullResultInfo(fullResultInfo);
        return this;
    }

    /**
     * <B>ACTIONPARAM5</B>&nbsp;操作参数5
     */
    public final static String FIELD_ACTIONPARAM5 = "actionparam5";

    /**
     * 设置 操作参数5
     * 
     * @param actionParam5
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM5)
    public void setActionParam5(Integer actionParam5){
        this.set(FIELD_ACTIONPARAM5, actionParam5);
    }
    
    /**
     * 获取 操作参数5  
     * @return
     */
    @JsonIgnore
    public Integer getActionParam5(){
        Object objValue = this.get(FIELD_ACTIONPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 操作参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam5Dirty(){
        if(this.contains(FIELD_ACTIONPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数5
     */
    @JsonIgnore
    public void resetActionParam5(){
        this.reset(FIELD_ACTIONPARAM5);
    }

    /**
     * 设置 操作参数5
     * <P>
     * 等同 {@link #setActionParam5}
     * @param actionParam5
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam5(Integer actionParam5){
        this.setActionParam5(actionParam5);
        return this;
    }

    /**
     * <B>ACTIONPARAM6</B>&nbsp;操作参数6
     */
    public final static String FIELD_ACTIONPARAM6 = "actionparam6";

    /**
     * 设置 操作参数6
     * 
     * @param actionParam6
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM6)
    public void setActionParam6(Integer actionParam6){
        this.set(FIELD_ACTIONPARAM6, actionParam6);
    }
    
    /**
     * 获取 操作参数6  
     * @return
     */
    @JsonIgnore
    public Integer getActionParam6(){
        Object objValue = this.get(FIELD_ACTIONPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 操作参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam6Dirty(){
        if(this.contains(FIELD_ACTIONPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数6
     */
    @JsonIgnore
    public void resetActionParam6(){
        this.reset(FIELD_ACTIONPARAM6);
    }

    /**
     * 设置 操作参数6
     * <P>
     * 等同 {@link #setActionParam6}
     * @param actionParam6
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam6(Integer actionParam6){
        this.setActionParam6(actionParam6);
        return this;
    }

    /**
     * <B>ACTIONPARAM7</B>&nbsp;操作参数7
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM7 = "actionparam7";

    /**
     * 设置 操作参数7
     * 
     * @param actionParam7
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM7)
    public void setActionParam7(String actionParam7){
        this.set(FIELD_ACTIONPARAM7, actionParam7);
    }
    
    /**
     * 获取 操作参数7  
     * @return
     */
    @JsonIgnore
    public String getActionParam7(){
        Object objValue = this.get(FIELD_ACTIONPARAM7);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam7Dirty(){
        if(this.contains(FIELD_ACTIONPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数7
     */
    @JsonIgnore
    public void resetActionParam7(){
        this.reset(FIELD_ACTIONPARAM7);
    }

    /**
     * 设置 操作参数7
     * <P>
     * 等同 {@link #setActionParam7}
     * @param actionParam7
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam7(String actionParam7){
        this.setActionParam7(actionParam7);
        return this;
    }

    /**
     * <B>ACTIONPARAM8</B>&nbsp;操作参数8
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM8 = "actionparam8";

    /**
     * 设置 操作参数8
     * 
     * @param actionParam8
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM8)
    public void setActionParam8(String actionParam8){
        this.set(FIELD_ACTIONPARAM8, actionParam8);
    }
    
    /**
     * 获取 操作参数8  
     * @return
     */
    @JsonIgnore
    public String getActionParam8(){
        Object objValue = this.get(FIELD_ACTIONPARAM8);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam8Dirty(){
        if(this.contains(FIELD_ACTIONPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数8
     */
    @JsonIgnore
    public void resetActionParam8(){
        this.reset(FIELD_ACTIONPARAM8);
    }

    /**
     * 设置 操作参数8
     * <P>
     * 等同 {@link #setActionParam8}
     * @param actionParam8
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam8(String actionParam8){
        this.setActionParam8(actionParam8);
        return this;
    }

    /**
     * <B>ACTIONPARAM9</B>&nbsp;操作参数9
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM9 = "actionparam9";

    /**
     * 设置 操作参数9
     * 
     * @param actionParam9
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM9)
    public void setActionParam9(String actionParam9){
        this.set(FIELD_ACTIONPARAM9, actionParam9);
    }
    
    /**
     * 获取 操作参数9  
     * @return
     */
    @JsonIgnore
    public String getActionParam9(){
        Object objValue = this.get(FIELD_ACTIONPARAM9);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam9Dirty(){
        if(this.contains(FIELD_ACTIONPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数9
     */
    @JsonIgnore
    public void resetActionParam9(){
        this.reset(FIELD_ACTIONPARAM9);
    }

    /**
     * 设置 操作参数9
     * <P>
     * 等同 {@link #setActionParam9}
     * @param actionParam9
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam9(String actionParam9){
        this.setActionParam9(actionParam9);
        return this;
    }

    /**
     * <B>ACTIONPARAM10</B>&nbsp;操作参数10
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM10 = "actionparam10";

    /**
     * 设置 操作参数10
     * 
     * @param actionParam10
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM10)
    public void setActionParam10(String actionParam10){
        this.set(FIELD_ACTIONPARAM10, actionParam10);
    }
    
    /**
     * 获取 操作参数10  
     * @return
     */
    @JsonIgnore
    public String getActionParam10(){
        Object objValue = this.get(FIELD_ACTIONPARAM10);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam10Dirty(){
        if(this.contains(FIELD_ACTIONPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数10
     */
    @JsonIgnore
    public void resetActionParam10(){
        this.reset(FIELD_ACTIONPARAM10);
    }

    /**
     * 设置 操作参数10
     * <P>
     * 等同 {@link #setActionParam10}
     * @param actionParam10
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam10(String actionParam10){
        this.setActionParam10(actionParam10);
        return this;
    }

    /**
     * <B>ACTIONPARAM11</B>&nbsp;操作参数11
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM11 = "actionparam11";

    /**
     * 设置 操作参数11
     * 
     * @param actionParam11
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM11)
    public void setActionParam11(String actionParam11){
        this.set(FIELD_ACTIONPARAM11, actionParam11);
    }
    
    /**
     * 获取 操作参数11  
     * @return
     */
    @JsonIgnore
    public String getActionParam11(){
        Object objValue = this.get(FIELD_ACTIONPARAM11);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam11Dirty(){
        if(this.contains(FIELD_ACTIONPARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数11
     */
    @JsonIgnore
    public void resetActionParam11(){
        this.reset(FIELD_ACTIONPARAM11);
    }

    /**
     * 设置 操作参数11
     * <P>
     * 等同 {@link #setActionParam11}
     * @param actionParam11
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam11(String actionParam11){
        this.setActionParam11(actionParam11);
        return this;
    }

    /**
     * <B>ACTIONPARAM12</B>&nbsp;操作参数12
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM12 = "actionparam12";

    /**
     * 设置 操作参数12
     * 
     * @param actionParam12
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM12)
    public void setActionParam12(String actionParam12){
        this.set(FIELD_ACTIONPARAM12, actionParam12);
    }
    
    /**
     * 获取 操作参数12  
     * @return
     */
    @JsonIgnore
    public String getActionParam12(){
        Object objValue = this.get(FIELD_ACTIONPARAM12);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam12Dirty(){
        if(this.contains(FIELD_ACTIONPARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数12
     */
    @JsonIgnore
    public void resetActionParam12(){
        this.reset(FIELD_ACTIONPARAM12);
    }

    /**
     * 设置 操作参数12
     * <P>
     * 等同 {@link #setActionParam12}
     * @param actionParam12
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam12(String actionParam12){
        this.setActionParam12(actionParam12);
        return this;
    }

    /**
     * <B>ACTIONPARAM13</B>&nbsp;操作参数13
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM13 = "actionparam13";

    /**
     * 设置 操作参数13
     * 
     * @param actionParam13
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM13)
    public void setActionParam13(String actionParam13){
        this.set(FIELD_ACTIONPARAM13, actionParam13);
    }
    
    /**
     * 获取 操作参数13  
     * @return
     */
    @JsonIgnore
    public String getActionParam13(){
        Object objValue = this.get(FIELD_ACTIONPARAM13);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数13 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam13Dirty(){
        if(this.contains(FIELD_ACTIONPARAM13)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数13
     */
    @JsonIgnore
    public void resetActionParam13(){
        this.reset(FIELD_ACTIONPARAM13);
    }

    /**
     * 设置 操作参数13
     * <P>
     * 等同 {@link #setActionParam13}
     * @param actionParam13
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam13(String actionParam13){
        this.setActionParam13(actionParam13);
        return this;
    }

    /**
     * <B>ACTIONPARAM14</B>&nbsp;操作参数14
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ACTIONPARAM14 = "actionparam14";

    /**
     * 设置 操作参数14
     * 
     * @param actionParam14
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM14)
    public void setActionParam14(String actionParam14){
        this.set(FIELD_ACTIONPARAM14, actionParam14);
    }
    
    /**
     * 获取 操作参数14  
     * @return
     */
    @JsonIgnore
    public String getActionParam14(){
        Object objValue = this.get(FIELD_ACTIONPARAM14);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数14 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam14Dirty(){
        if(this.contains(FIELD_ACTIONPARAM14)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数14
     */
    @JsonIgnore
    public void resetActionParam14(){
        this.reset(FIELD_ACTIONPARAM14);
    }

    /**
     * 设置 操作参数14
     * <P>
     * 等同 {@link #setActionParam14}
     * @param actionParam14
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam14(String actionParam14){
        this.setActionParam14(actionParam14);
        return this;
    }

    /**
     * <B>ACTIONPARAM15</B>&nbsp;操作参数15
     */
    public final static String FIELD_ACTIONPARAM15 = "actionparam15";

    /**
     * 设置 操作参数15
     * 
     * @param actionParam15
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM15)
    public void setActionParam15(String actionParam15){
        this.set(FIELD_ACTIONPARAM15, actionParam15);
    }
    
    /**
     * 获取 操作参数15  
     * @return
     */
    @JsonIgnore
    public String getActionParam15(){
        Object objValue = this.get(FIELD_ACTIONPARAM15);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数15 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam15Dirty(){
        if(this.contains(FIELD_ACTIONPARAM15)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数15
     */
    @JsonIgnore
    public void resetActionParam15(){
        this.reset(FIELD_ACTIONPARAM15);
    }

    /**
     * 设置 操作参数15
     * <P>
     * 等同 {@link #setActionParam15}
     * @param actionParam15
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam15(String actionParam15){
        this.setActionParam15(actionParam15);
        return this;
    }

    /**
     * <B>ACTIONPARAM16</B>&nbsp;操作参数16
     */
    public final static String FIELD_ACTIONPARAM16 = "actionparam16";

    /**
     * 设置 操作参数16
     * 
     * @param actionParam16
     * 
     */
    @JsonProperty(FIELD_ACTIONPARAM16)
    public void setActionParam16(String actionParam16){
        this.set(FIELD_ACTIONPARAM16, actionParam16);
    }
    
    /**
     * 获取 操作参数16  
     * @return
     */
    @JsonIgnore
    public String getActionParam16(){
        Object objValue = this.get(FIELD_ACTIONPARAM16);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作参数16 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isActionParam16Dirty(){
        if(this.contains(FIELD_ACTIONPARAM16)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作参数16
     */
    @JsonIgnore
    public void resetActionParam16(){
        this.reset(FIELD_ACTIONPARAM16);
    }

    /**
     * 设置 操作参数16
     * <P>
     * 等同 {@link #setActionParam16}
     * @param actionParam16
     */
    @JsonIgnore
    public PSStudioPluginDataDTO actionparam16(String actionParam16){
        this.setActionParam16(actionParam16);
        return this;
    }

    /**
     * <B>PPSSTUDIOPLUGINDATAID</B>&nbsp;父操作标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PPSSTUDIOPLUGINDATAID = "ppsstudioplugindataid";

    /**
     * 设置 父操作标识
     * 
     * @param pPSStudioPluginDataId
     * 
     */
    @JsonProperty(FIELD_PPSSTUDIOPLUGINDATAID)
    public void setPPSStudioPluginDataId(String pPSStudioPluginDataId){
        this.set(FIELD_PPSSTUDIOPLUGINDATAID, pPSStudioPluginDataId);
    }
    
    /**
     * 获取 父操作标识  
     * @return
     */
    @JsonIgnore
    public String getPPSStudioPluginDataId(){
        Object objValue = this.get(FIELD_PPSSTUDIOPLUGINDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父操作标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSStudioPluginDataIdDirty(){
        if(this.contains(FIELD_PPSSTUDIOPLUGINDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父操作标识
     */
    @JsonIgnore
    public void resetPPSStudioPluginDataId(){
        this.reset(FIELD_PPSSTUDIOPLUGINDATAID);
    }

    /**
     * 设置 父操作标识
     * <P>
     * 等同 {@link #setPPSStudioPluginDataId}
     * @param pPSStudioPluginDataId
     */
    @JsonIgnore
    public PSStudioPluginDataDTO ppsstudioplugindataid(String pPSStudioPluginDataId){
        this.setPPSStudioPluginDataId(pPSStudioPluginDataId);
        return this;
    }

    /**
     * <B>DOWNLOADURL</B>&nbsp;下载路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_DOWNLOADURL = "downloadurl";

    /**
     * 设置 下载路径
     * 
     * @param downloadUrl
     * 
     */
    @JsonProperty(FIELD_DOWNLOADURL)
    public void setDownloadUrl(String downloadUrl){
        this.set(FIELD_DOWNLOADURL, downloadUrl);
    }
    
    /**
     * 获取 下载路径  
     * @return
     */
    @JsonIgnore
    public String getDownloadUrl(){
        Object objValue = this.get(FIELD_DOWNLOADURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下载路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDownloadUrlDirty(){
        if(this.contains(FIELD_DOWNLOADURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下载路径
     */
    @JsonIgnore
    public void resetDownloadUrl(){
        this.reset(FIELD_DOWNLOADURL);
    }

    /**
     * 设置 下载路径
     * <P>
     * 等同 {@link #setDownloadUrl}
     * @param downloadUrl
     */
    @JsonIgnore
    public PSStudioPluginDataDTO downloadurl(String downloadUrl){
        this.setDownloadUrl(downloadUrl);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSStudioPluginDataId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSStudioPluginDataDTO){
            PSStudioPluginDataDTO dto = (PSStudioPluginDataDTO)iEntity;
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