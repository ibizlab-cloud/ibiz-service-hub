package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCANVASMODEL</B>系统画布相关模型 模型传输对象
 * <P>
 * 
 */
public class PSSysCanvasModelDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysCanvasModelDTO(){
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
    public PSSysCanvasModelDTO createdate(Timestamp createDate){
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
    public PSSysCanvasModelDTO createman(String createMan){
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
    public PSSysCanvasModelDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODELID</B>&nbsp;模型标识
     * <P>
     * 字符串：最大长度 100
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
    public PSSysCanvasModelDTO psmodelid(String pSModelId){
        this.setPSModelId(pSModelId);
        return this;
    }

    /**
     * <B>PSMODELNAME</B>&nbsp;模型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSMODELNAME = "psmodelname";

    /**
     * 设置 模型名称
     * 
     * @param pSModelName
     * 
     */
    @JsonProperty(FIELD_PSMODELNAME)
    public void setPSModelName(String pSModelName){
        this.set(FIELD_PSMODELNAME, pSModelName);
    }
    
    /**
     * 获取 模型名称  
     * @return
     */
    @JsonIgnore
    public String getPSModelName(){
        Object objValue = this.get(FIELD_PSMODELNAME);
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
    public boolean isPSModelNameDirty(){
        if(this.contains(FIELD_PSMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型名称
     */
    @JsonIgnore
    public void resetPSModelName(){
        this.reset(FIELD_PSMODELNAME);
    }

    /**
     * 设置 模型名称
     * <P>
     * 等同 {@link #setPSModelName}
     * @param pSModelName
     */
    @JsonIgnore
    public PSSysCanvasModelDTO psmodelname(String pSModelName){
        this.setPSModelName(pSModelName);
        return this;
    }

    /**
     * <B>PSMODELTYPE</B>&nbsp;模型类型
     * <P>
     * 字符串：最大长度 60
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
    public PSSysCanvasModelDTO psmodeltype(String pSModelType){
        this.setPSModelType(pSModelType);
        return this;
    }

    /**
     * <B>PSSYSCANVASID</B>&nbsp;系统画布
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCanvasDTO} 
     */
    public final static String FIELD_PSSYSCANVASID = "pssyscanvasid";

    /**
     * 设置 系统画布
     * 
     * @param pSSysCanvasId
     * 
     */
    @JsonProperty(FIELD_PSSYSCANVASID)
    public void setPSSysCanvasId(String pSSysCanvasId){
        this.set(FIELD_PSSYSCANVASID, pSSysCanvasId);
    }
    
    /**
     * 获取 系统画布  
     * @return
     */
    @JsonIgnore
    public String getPSSysCanvasId(){
        Object objValue = this.get(FIELD_PSSYSCANVASID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统画布 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCanvasIdDirty(){
        if(this.contains(FIELD_PSSYSCANVASID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统画布
     */
    @JsonIgnore
    public void resetPSSysCanvasId(){
        this.reset(FIELD_PSSYSCANVASID);
    }

    /**
     * 设置 系统画布
     * <P>
     * 等同 {@link #setPSSysCanvasId}
     * @param pSSysCanvasId
     */
    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasid(String pSSysCanvasId){
        this.setPSSysCanvasId(pSSysCanvasId);
        return this;
    }

    /**
     * 设置 系统画布，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCanvasId}
     * @param pSSysCanvas 引用对象
     */
    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasid(PSSysCanvasDTO pSSysCanvas){
        if(pSSysCanvas == null){
            this.setPSSysCanvasId(null);
            this.setPSSysCanvasName(null);
        }
        else{
            this.setPSSysCanvasId(pSSysCanvas.getPSSysCanvasId());
            this.setPSSysCanvasName(pSSysCanvas.getPSSysCanvasName());
        }
        return this;
    }

    /**
     * <B>PSSYSCANVASMODELID</B>&nbsp;系统画布相关模型标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCANVASMODELID = "pssyscanvasmodelid";

    /**
     * 设置 系统画布相关模型标识
     * 
     * @param pSSysCanvasModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSCANVASMODELID)
    public void setPSSysCanvasModelId(String pSSysCanvasModelId){
        this.set(FIELD_PSSYSCANVASMODELID, pSSysCanvasModelId);
    }
    
    /**
     * 获取 系统画布相关模型标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysCanvasModelId(){
        Object objValue = this.get(FIELD_PSSYSCANVASMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统画布相关模型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCanvasModelIdDirty(){
        if(this.contains(FIELD_PSSYSCANVASMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统画布相关模型标识
     */
    @JsonIgnore
    public void resetPSSysCanvasModelId(){
        this.reset(FIELD_PSSYSCANVASMODELID);
    }

    /**
     * 设置 系统画布相关模型标识
     * <P>
     * 等同 {@link #setPSSysCanvasModelId}
     * @param pSSysCanvasModelId
     */
    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasmodelid(String pSSysCanvasModelId){
        this.setPSSysCanvasModelId(pSSysCanvasModelId);
        return this;
    }

    /**
     * <B>PSSYSCANVASMODELNAME</B>&nbsp;相关模型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCANVASMODELNAME = "pssyscanvasmodelname";

    /**
     * 设置 相关模型名称
     * 
     * @param pSSysCanvasModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSCANVASMODELNAME)
    public void setPSSysCanvasModelName(String pSSysCanvasModelName){
        this.set(FIELD_PSSYSCANVASMODELNAME, pSSysCanvasModelName);
    }
    
    /**
     * 获取 相关模型名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysCanvasModelName(){
        Object objValue = this.get(FIELD_PSSYSCANVASMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关模型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCanvasModelNameDirty(){
        if(this.contains(FIELD_PSSYSCANVASMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关模型名称
     */
    @JsonIgnore
    public void resetPSSysCanvasModelName(){
        this.reset(FIELD_PSSYSCANVASMODELNAME);
    }

    /**
     * 设置 相关模型名称
     * <P>
     * 等同 {@link #setPSSysCanvasModelName}
     * @param pSSysCanvasModelName
     */
    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasmodelname(String pSSysCanvasModelName){
        this.setPSSysCanvasModelName(pSSysCanvasModelName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCanvasModelName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCanvasModelName(strName);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO name(String strName){
        this.setPSSysCanvasModelName(strName);
        return this;
    }

    /**
     * <B>PSSYSCANVASNAME</B>&nbsp;系统画布
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCANVASID}
     */
    public final static String FIELD_PSSYSCANVASNAME = "pssyscanvasname";

    /**
     * 设置 系统画布
     * 
     * @param pSSysCanvasName
     * 
     */
    @JsonProperty(FIELD_PSSYSCANVASNAME)
    public void setPSSysCanvasName(String pSSysCanvasName){
        this.set(FIELD_PSSYSCANVASNAME, pSSysCanvasName);
    }
    
    /**
     * 获取 系统画布  
     * @return
     */
    @JsonIgnore
    public String getPSSysCanvasName(){
        Object objValue = this.get(FIELD_PSSYSCANVASNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统画布 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCanvasNameDirty(){
        if(this.contains(FIELD_PSSYSCANVASNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统画布
     */
    @JsonIgnore
    public void resetPSSysCanvasName(){
        this.reset(FIELD_PSSYSCANVASNAME);
    }

    /**
     * 设置 系统画布
     * <P>
     * 等同 {@link #setPSSysCanvasName}
     * @param pSSysCanvasName
     */
    @JsonIgnore
    public PSSysCanvasModelDTO pssyscanvasname(String pSSysCanvasName){
        this.setPSSysCanvasName(pSSysCanvasName);
        return this;
    }

    /**
     * <B>SYMBOLNAME</B>&nbsp;相关图元标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SYMBOLNAME = "symbolname";

    /**
     * 设置 相关图元标识
     * 
     * @param symbolName
     * 
     */
    @JsonProperty(FIELD_SYMBOLNAME)
    public void setSymbolName(String symbolName){
        this.set(FIELD_SYMBOLNAME, symbolName);
    }
    
    /**
     * 获取 相关图元标识  
     * @return
     */
    @JsonIgnore
    public String getSymbolName(){
        Object objValue = this.get(FIELD_SYMBOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关图元标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSymbolNameDirty(){
        if(this.contains(FIELD_SYMBOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关图元标识
     */
    @JsonIgnore
    public void resetSymbolName(){
        this.reset(FIELD_SYMBOLNAME);
    }

    /**
     * 设置 相关图元标识
     * <P>
     * 等同 {@link #setSymbolName}
     * @param symbolName
     */
    @JsonIgnore
    public PSSysCanvasModelDTO symbolname(String symbolName){
        this.setSymbolName(symbolName);
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
    public PSSysCanvasModelDTO updatedate(Timestamp updateDate){
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
    public PSSysCanvasModelDTO updateman(String updateMan){
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
    public PSSysCanvasModelDTO usercat(String userCat){
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
    public PSSysCanvasModelDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysCanvasModelDTO usertag(String userTag){
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
    public PSSysCanvasModelDTO usertag2(String userTag2){
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
    public PSSysCanvasModelDTO usertag3(String userTag3){
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
    public PSSysCanvasModelDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysCanvasModelId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysCanvasModelId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCanvasModelId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCanvasModelId(strValue);
    }

    @JsonIgnore
    public PSSysCanvasModelDTO id(String strValue){
        this.setPSSysCanvasModelId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysCanvasModelDTO){
            PSSysCanvasModelDTO dto = (PSSysCanvasModelDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
