package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSMODELRTCFG</B>模型运行配置 模型传输对象
 * <P>
 * 
 */
public class PSModelRTCfgDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSModelRTCfgDTO(){
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
    public PSModelRTCfgDTO createdate(Timestamp createDate){
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
    public PSModelRTCfgDTO createman(String createMan){
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
    public PSModelRTCfgDTO memo(String memo){
        this.setMemo(memo);
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
    public PSModelRTCfgDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDYNAINSTID</B>&nbsp;动态实例标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDYNAINSTID = "psdynainstid";

    /**
     * 设置 动态实例标识
     * 
     * @param pSDynaInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTID)
    public void setPSDynaInstId(String pSDynaInstId){
        this.set(FIELD_PSDYNAINSTID, pSDynaInstId);
    }
    
    /**
     * 获取 动态实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstId(){
        Object objValue = this.get(FIELD_PSDYNAINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstIdDirty(){
        if(this.contains(FIELD_PSDYNAINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标识
     */
    @JsonIgnore
    public void resetPSDynaInstId(){
        this.reset(FIELD_PSDYNAINSTID);
    }

    /**
     * 设置 动态实例标识
     * <P>
     * 等同 {@link #setPSDynaInstId}
     * @param pSDynaInstId
     */
    @JsonIgnore
    public PSModelRTCfgDTO psdynainstid(String pSDynaInstId){
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    /**
     * <B>PSMODELID</B>&nbsp;模型标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSMODELID = "psmodelid";

    /**
     * 设置 模型标识
     * 
     * @param pSModelId
     * 
     */
    @JsonProperty(FIELD_PSMODELID)
    public void setPSModelId(String pSModelId){
        this.set(FIELD_PSMODELID, pSModelId);
    }
    
    /**
     * 获取 模型标识  
     * @return
     */
    @JsonIgnore
    public String getPSModelId(){
        Object objValue = this.get(FIELD_PSMODELID);
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
    public boolean isPSModelIdDirty(){
        if(this.contains(FIELD_PSMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型标识
     */
    @JsonIgnore
    public void resetPSModelId(){
        this.reset(FIELD_PSMODELID);
    }

    /**
     * 设置 模型标识
     * <P>
     * 等同 {@link #setPSModelId}
     * @param pSModelId
     */
    @JsonIgnore
    public PSModelRTCfgDTO psmodelid(String pSModelId){
        this.setPSModelId(pSModelId);
        return this;
    }

    /**
     * <B>PSMODELRTCFGID</B>&nbsp;模型运行配置标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSMODELRTCFGID = "psmodelrtcfgid";

    /**
     * 设置 模型运行配置标识
     * 
     * @param pSModelRTCfgId
     * 
     */
    @JsonProperty(FIELD_PSMODELRTCFGID)
    public void setPSModelRTCfgId(String pSModelRTCfgId){
        this.set(FIELD_PSMODELRTCFGID, pSModelRTCfgId);
    }
    
    /**
     * 获取 模型运行配置标识  
     * @return
     */
    @JsonIgnore
    public String getPSModelRTCfgId(){
        Object objValue = this.get(FIELD_PSMODELRTCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型运行配置标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModelRTCfgIdDirty(){
        if(this.contains(FIELD_PSMODELRTCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型运行配置标识
     */
    @JsonIgnore
    public void resetPSModelRTCfgId(){
        this.reset(FIELD_PSMODELRTCFGID);
    }

    /**
     * 设置 模型运行配置标识
     * <P>
     * 等同 {@link #setPSModelRTCfgId}
     * @param pSModelRTCfgId
     */
    @JsonIgnore
    public PSModelRTCfgDTO psmodelrtcfgid(String pSModelRTCfgId){
        this.setPSModelRTCfgId(pSModelRTCfgId);
        return this;
    }

    /**
     * <B>PSMODELRTCFGNAME</B>&nbsp;模型运行配置名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSMODELRTCFGNAME = "psmodelrtcfgname";

    /**
     * 设置 模型运行配置名称
     * 
     * @param pSModelRTCfgName
     * 
     */
    @JsonProperty(FIELD_PSMODELRTCFGNAME)
    public void setPSModelRTCfgName(String pSModelRTCfgName){
        this.set(FIELD_PSMODELRTCFGNAME, pSModelRTCfgName);
    }
    
    /**
     * 获取 模型运行配置名称  
     * @return
     */
    @JsonIgnore
    public String getPSModelRTCfgName(){
        Object objValue = this.get(FIELD_PSMODELRTCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型运行配置名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModelRTCfgNameDirty(){
        if(this.contains(FIELD_PSMODELRTCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型运行配置名称
     */
    @JsonIgnore
    public void resetPSModelRTCfgName(){
        this.reset(FIELD_PSMODELRTCFGNAME);
    }

    /**
     * 设置 模型运行配置名称
     * <P>
     * 等同 {@link #setPSModelRTCfgName}
     * @param pSModelRTCfgName
     */
    @JsonIgnore
    public PSModelRTCfgDTO psmodelrtcfgname(String pSModelRTCfgName){
        this.setPSModelRTCfgName(pSModelRTCfgName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSModelRTCfgName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSModelRTCfgName(strName);
    }

    @JsonIgnore
    public PSModelRTCfgDTO name(String strName){
        this.setPSModelRTCfgName(strName);
        return this;
    }

    /**
     * <B>PSMODELTYPE</B>&nbsp;模型类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSMODELTYPE = "psmodeltype";

    /**
     * 设置 模型类型
     * 
     * @param pSModelType
     * 
     */
    @JsonProperty(FIELD_PSMODELTYPE)
    public void setPSModelType(String pSModelType){
        this.set(FIELD_PSMODELTYPE, pSModelType);
    }
    
    /**
     * 获取 模型类型  
     * @return
     */
    @JsonIgnore
    public String getPSModelType(){
        Object objValue = this.get(FIELD_PSMODELTYPE);
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
    public boolean isPSModelTypeDirty(){
        if(this.contains(FIELD_PSMODELTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型类型
     */
    @JsonIgnore
    public void resetPSModelType(){
        this.reset(FIELD_PSMODELTYPE);
    }

    /**
     * 设置 模型类型
     * <P>
     * 等同 {@link #setPSModelType}
     * @param pSModelType
     */
    @JsonIgnore
    public PSModelRTCfgDTO psmodeltype(String pSModelType){
        this.setPSModelType(pSModelType);
        return this;
    }

    /**
     * <B>RTMODEL</B>&nbsp;运行时模型
     */
    public final static String FIELD_RTMODEL = "rtmodel";

    /**
     * 设置 运行时模型
     * 
     * @param rTModel
     * 
     */
    @JsonProperty(FIELD_RTMODEL)
    public void setRTModel(String rTModel){
        this.set(FIELD_RTMODEL, rTModel);
    }
    
    /**
     * 获取 运行时模型  
     * @return
     */
    @JsonIgnore
    public String getRTModel(){
        Object objValue = this.get(FIELD_RTMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTModelDirty(){
        if(this.contains(FIELD_RTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时模型
     */
    @JsonIgnore
    public void resetRTModel(){
        this.reset(FIELD_RTMODEL);
    }

    /**
     * 设置 运行时模型
     * <P>
     * 等同 {@link #setRTModel}
     * @param rTModel
     */
    @JsonIgnore
    public PSModelRTCfgDTO rtmodel(String rTModel){
        this.setRTModel(rTModel);
        return this;
    }

    /**
     * <B>RTMODELID</B>&nbsp;运行时模型标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RTMODELID = "rtmodelid";

    /**
     * 设置 运行时模型标识
     * 
     * @param rTModelId
     * 
     */
    @JsonProperty(FIELD_RTMODELID)
    public void setRTModelId(String rTModelId){
        this.set(FIELD_RTMODELID, rTModelId);
    }
    
    /**
     * 获取 运行时模型标识  
     * @return
     */
    @JsonIgnore
    public String getRTModelId(){
        Object objValue = this.get(FIELD_RTMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时模型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTModelIdDirty(){
        if(this.contains(FIELD_RTMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时模型标识
     */
    @JsonIgnore
    public void resetRTModelId(){
        this.reset(FIELD_RTMODELID);
    }

    /**
     * 设置 运行时模型标识
     * <P>
     * 等同 {@link #setRTModelId}
     * @param rTModelId
     */
    @JsonIgnore
    public PSModelRTCfgDTO rtmodelid(String rTModelId){
        this.setRTModelId(rTModelId);
        return this;
    }

    /**
     * <B>RTMODELPATH</B>&nbsp;运行时模型路径
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_RTMODELPATH = "rtmodelpath";

    /**
     * 设置 运行时模型路径
     * 
     * @param rTModelPath
     * 
     */
    @JsonProperty(FIELD_RTMODELPATH)
    public void setRTModelPath(String rTModelPath){
        this.set(FIELD_RTMODELPATH, rTModelPath);
    }
    
    /**
     * 获取 运行时模型路径  
     * @return
     */
    @JsonIgnore
    public String getRTModelPath(){
        Object objValue = this.get(FIELD_RTMODELPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时模型路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTModelPathDirty(){
        if(this.contains(FIELD_RTMODELPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时模型路径
     */
    @JsonIgnore
    public void resetRTModelPath(){
        this.reset(FIELD_RTMODELPATH);
    }

    /**
     * 设置 运行时模型路径
     * <P>
     * 等同 {@link #setRTModelPath}
     * @param rTModelPath
     */
    @JsonIgnore
    public PSModelRTCfgDTO rtmodelpath(String rTModelPath){
        this.setRTModelPath(rTModelPath);
        return this;
    }

    /**
     * <B>RTTAG</B>&nbsp;运行时标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RTTAG = "rttag";

    /**
     * 设置 运行时标记
     * 
     * @param rTTag
     * 
     */
    @JsonProperty(FIELD_RTTAG)
    public void setRTTag(String rTTag){
        this.set(FIELD_RTTAG, rTTag);
    }
    
    /**
     * 获取 运行时标记  
     * @return
     */
    @JsonIgnore
    public String getRTTag(){
        Object objValue = this.get(FIELD_RTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTTagDirty(){
        if(this.contains(FIELD_RTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时标记
     */
    @JsonIgnore
    public void resetRTTag(){
        this.reset(FIELD_RTTAG);
    }

    /**
     * 设置 运行时标记
     * <P>
     * 等同 {@link #setRTTag}
     * @param rTTag
     */
    @JsonIgnore
    public PSModelRTCfgDTO rttag(String rTTag){
        this.setRTTag(rTTag);
        return this;
    }

    /**
     * <B>RTTAG2</B>&nbsp;运行时标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RTTAG2 = "rttag2";

    /**
     * 设置 运行时标记2
     * 
     * @param rTTag2
     * 
     */
    @JsonProperty(FIELD_RTTAG2)
    public void setRTTag2(String rTTag2){
        this.set(FIELD_RTTAG2, rTTag2);
    }
    
    /**
     * 获取 运行时标记2  
     * @return
     */
    @JsonIgnore
    public String getRTTag2(){
        Object objValue = this.get(FIELD_RTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行时标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTTag2Dirty(){
        if(this.contains(FIELD_RTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行时标记2
     */
    @JsonIgnore
    public void resetRTTag2(){
        this.reset(FIELD_RTTAG2);
    }

    /**
     * 设置 运行时标记2
     * <P>
     * 等同 {@link #setRTTag2}
     * @param rTTag2
     */
    @JsonIgnore
    public PSModelRTCfgDTO rttag2(String rTTag2){
        this.setRTTag2(rTTag2);
        return this;
    }

    /**
     * <B>RTTYPE</B>&nbsp;模型运行类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelRTType} 
     */
    public final static String FIELD_RTTYPE = "rttype";

    /**
     * 设置 模型运行类型
     * 
     * @param rTType
     * 
     */
    @JsonProperty(FIELD_RTTYPE)
    public void setRTType(String rTType){
        this.set(FIELD_RTTYPE, rTType);
    }
    
    /**
     * 获取 模型运行类型  
     * @return
     */
    @JsonIgnore
    public String getRTType(){
        Object objValue = this.get(FIELD_RTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型运行类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRTTypeDirty(){
        if(this.contains(FIELD_RTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型运行类型
     */
    @JsonIgnore
    public void resetRTType(){
        this.reset(FIELD_RTTYPE);
    }

    /**
     * 设置 模型运行类型
     * <P>
     * 等同 {@link #setRTType}
     * @param rTType
     */
    @JsonIgnore
    public PSModelRTCfgDTO rttype(String rTType){
        this.setRTType(rTType);
        return this;
    }

     /**
     * 设置 模型运行类型
     * <P>
     * 等同 {@link #setRTType}
     * @param rTType
     */
    @JsonIgnore
    public PSModelRTCfgDTO rttype(net.ibizsys.model.PSModelEnums.ModelRTType rTType){
        if(rTType == null){
            this.setRTType(null);
        }
        else{
            this.setRTType(rTType.value);
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
    public PSModelRTCfgDTO updatedate(Timestamp updateDate){
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
    public PSModelRTCfgDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSModelRTCfgId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSModelRTCfgId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSModelRTCfgId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSModelRTCfgId(strValue);
    }

    @JsonIgnore
    public PSModelRTCfgDTO id(String strValue){
        this.setPSModelRTCfgId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSModelRTCfgDTO){
            PSModelRTCfgDTO dto = (PSModelRTCfgDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
