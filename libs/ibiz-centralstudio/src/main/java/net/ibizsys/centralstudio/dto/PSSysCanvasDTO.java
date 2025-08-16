package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCANVAS</B>系统画布 模型传输对象
 * <P>
 * 
 */
public class PSSysCanvasDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysCanvasDTO(){
    }      

    /**
     * <B>CANVASMODEL</B>&nbsp;画布模型
     */
    public final static String FIELD_CANVASMODEL = "canvasmodel";

    /**
     * 设置 画布模型
     * 
     * @param canvasModel
     * 
     */
    @JsonProperty(FIELD_CANVASMODEL)
    public void setCanvasModel(String canvasModel){
        this.set(FIELD_CANVASMODEL, canvasModel);
    }
    
    /**
     * 获取 画布模型  
     * @return
     */
    @JsonIgnore
    public String getCanvasModel(){
        Object objValue = this.get(FIELD_CANVASMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 画布模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCanvasModelDirty(){
        if(this.contains(FIELD_CANVASMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 画布模型
     */
    @JsonIgnore
    public void resetCanvasModel(){
        this.reset(FIELD_CANVASMODEL);
    }

    /**
     * 设置 画布模型
     * <P>
     * 等同 {@link #setCanvasModel}
     * @param canvasModel
     */
    @JsonIgnore
    public PSSysCanvasDTO canvasmodel(String canvasModel){
        this.setCanvasModel(canvasModel);
        return this;
    }

    /**
     * <B>CANVASTAG</B>&nbsp;画布标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CANVASTAG = "canvastag";

    /**
     * 设置 画布标记
     * 
     * @param canvasTag
     * 
     */
    @JsonProperty(FIELD_CANVASTAG)
    public void setCanvasTag(String canvasTag){
        this.set(FIELD_CANVASTAG, canvasTag);
    }
    
    /**
     * 获取 画布标记  
     * @return
     */
    @JsonIgnore
    public String getCanvasTag(){
        Object objValue = this.get(FIELD_CANVASTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 画布标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCanvasTagDirty(){
        if(this.contains(FIELD_CANVASTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 画布标记
     */
    @JsonIgnore
    public void resetCanvasTag(){
        this.reset(FIELD_CANVASTAG);
    }

    /**
     * 设置 画布标记
     * <P>
     * 等同 {@link #setCanvasTag}
     * @param canvasTag
     */
    @JsonIgnore
    public PSSysCanvasDTO canvastag(String canvasTag){
        this.setCanvasTag(canvasTag);
        return this;
    }

    /**
     * <B>CANVASTAG2</B>&nbsp;画布标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CANVASTAG2 = "canvastag2";

    /**
     * 设置 画布标记2
     * 
     * @param canvasTag2
     * 
     */
    @JsonProperty(FIELD_CANVASTAG2)
    public void setCanvasTag2(String canvasTag2){
        this.set(FIELD_CANVASTAG2, canvasTag2);
    }
    
    /**
     * 获取 画布标记2  
     * @return
     */
    @JsonIgnore
    public String getCanvasTag2(){
        Object objValue = this.get(FIELD_CANVASTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 画布标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCanvasTag2Dirty(){
        if(this.contains(FIELD_CANVASTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 画布标记2
     */
    @JsonIgnore
    public void resetCanvasTag2(){
        this.reset(FIELD_CANVASTAG2);
    }

    /**
     * 设置 画布标记2
     * <P>
     * 等同 {@link #setCanvasTag2}
     * @param canvasTag2
     */
    @JsonIgnore
    public PSSysCanvasDTO canvastag2(String canvasTag2){
        this.setCanvasTag2(canvasTag2);
        return this;
    }

    /**
     * <B>CANVASTAG3</B>&nbsp;画布标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CANVASTAG3 = "canvastag3";

    /**
     * 设置 画布标记3
     * 
     * @param canvasTag3
     * 
     */
    @JsonProperty(FIELD_CANVASTAG3)
    public void setCanvasTag3(String canvasTag3){
        this.set(FIELD_CANVASTAG3, canvasTag3);
    }
    
    /**
     * 获取 画布标记3  
     * @return
     */
    @JsonIgnore
    public String getCanvasTag3(){
        Object objValue = this.get(FIELD_CANVASTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 画布标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCanvasTag3Dirty(){
        if(this.contains(FIELD_CANVASTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 画布标记3
     */
    @JsonIgnore
    public void resetCanvasTag3(){
        this.reset(FIELD_CANVASTAG3);
    }

    /**
     * 设置 画布标记3
     * <P>
     * 等同 {@link #setCanvasTag3}
     * @param canvasTag3
     */
    @JsonIgnore
    public PSSysCanvasDTO canvastag3(String canvasTag3){
        this.setCanvasTag3(canvasTag3);
        return this;
    }

    /**
     * <B>CANVASTAG4</B>&nbsp;画布标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CANVASTAG4 = "canvastag4";

    /**
     * 设置 画布标记4
     * 
     * @param canvasTag4
     * 
     */
    @JsonProperty(FIELD_CANVASTAG4)
    public void setCanvasTag4(String canvasTag4){
        this.set(FIELD_CANVASTAG4, canvasTag4);
    }
    
    /**
     * 获取 画布标记4  
     * @return
     */
    @JsonIgnore
    public String getCanvasTag4(){
        Object objValue = this.get(FIELD_CANVASTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 画布标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCanvasTag4Dirty(){
        if(this.contains(FIELD_CANVASTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 画布标记4
     */
    @JsonIgnore
    public void resetCanvasTag4(){
        this.reset(FIELD_CANVASTAG4);
    }

    /**
     * 设置 画布标记4
     * <P>
     * 等同 {@link #setCanvasTag4}
     * @param canvasTag4
     */
    @JsonIgnore
    public PSSysCanvasDTO canvastag4(String canvasTag4){
        this.setCanvasTag4(canvasTag4);
        return this;
    }

    /**
     * <B>CANVASTYPE</B>&nbsp;画布类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CANVASTYPE = "canvastype";

    /**
     * 设置 画布类型
     * 
     * @param canvasType
     * 
     */
    @JsonProperty(FIELD_CANVASTYPE)
    public void setCanvasType(String canvasType){
        this.set(FIELD_CANVASTYPE, canvasType);
    }
    
    /**
     * 获取 画布类型  
     * @return
     */
    @JsonIgnore
    public String getCanvasType(){
        Object objValue = this.get(FIELD_CANVASTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 画布类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCanvasTypeDirty(){
        if(this.contains(FIELD_CANVASTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 画布类型
     */
    @JsonIgnore
    public void resetCanvasType(){
        this.reset(FIELD_CANVASTYPE);
    }

    /**
     * 设置 画布类型
     * <P>
     * 等同 {@link #setCanvasType}
     * @param canvasType
     */
    @JsonIgnore
    public PSSysCanvasDTO canvastype(String canvasType){
        this.setCanvasType(canvasType);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
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
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysCanvasDTO codename(String codeName){
        this.setCodeName(codeName);
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
    public PSSysCanvasDTO createdate(Timestamp createDate){
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
    public PSSysCanvasDTO createman(String createMan){
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
    public PSSysCanvasDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysCanvasDTO psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * 设置 系统模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModule 引用对象
     */
    @JsonIgnore
    public PSSysCanvasDTO psmoduleid(PSModuleDTO pSModule){
        if(pSModule == null){
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 系统模块  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模块
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 系统模块
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysCanvasDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCANVASID</B>&nbsp;系统画布标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCANVASID = "pssyscanvasid";

    /**
     * 设置 系统画布标识
     * 
     * @param pSSysCanvasId
     * 
     */
    @JsonProperty(FIELD_PSSYSCANVASID)
    public void setPSSysCanvasId(String pSSysCanvasId){
        this.set(FIELD_PSSYSCANVASID, pSSysCanvasId);
    }
    
    /**
     * 获取 系统画布标识  
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
     * 判断 系统画布标识 是否指定值，包括空值
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
     * 重置 系统画布标识
     */
    @JsonIgnore
    public void resetPSSysCanvasId(){
        this.reset(FIELD_PSSYSCANVASID);
    }

    /**
     * 设置 系统画布标识
     * <P>
     * 等同 {@link #setPSSysCanvasId}
     * @param pSSysCanvasId
     */
    @JsonIgnore
    public PSSysCanvasDTO pssyscanvasid(String pSSysCanvasId){
        this.setPSSysCanvasId(pSSysCanvasId);
        return this;
    }

    /**
     * <B>PSSYSCANVASNAME</B>&nbsp;系统画布名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCANVASNAME = "pssyscanvasname";

    /**
     * 设置 系统画布名称
     * 
     * @param pSSysCanvasName
     * 
     */
    @JsonProperty(FIELD_PSSYSCANVASNAME)
    public void setPSSysCanvasName(String pSSysCanvasName){
        this.set(FIELD_PSSYSCANVASNAME, pSSysCanvasName);
    }
    
    /**
     * 获取 系统画布名称  
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
     * 判断 系统画布名称 是否指定值，包括空值
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
     * 重置 系统画布名称
     */
    @JsonIgnore
    public void resetPSSysCanvasName(){
        this.reset(FIELD_PSSYSCANVASNAME);
    }

    /**
     * 设置 系统画布名称
     * <P>
     * 等同 {@link #setPSSysCanvasName}
     * @param pSSysCanvasName
     */
    @JsonIgnore
    public PSSysCanvasDTO pssyscanvasname(String pSSysCanvasName){
        this.setPSSysCanvasName(pSSysCanvasName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysCanvasName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysCanvasName(strName);
    }

    @JsonIgnore
    public PSSysCanvasDTO name(String strName){
        this.setPSSysCanvasName(strName);
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
    public PSSysCanvasDTO updatedate(Timestamp updateDate){
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
    public PSSysCanvasDTO updateman(String updateMan){
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
    public PSSysCanvasDTO usercat(String userCat){
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
    public PSSysCanvasDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysCanvasDTO usertag(String userTag){
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
    public PSSysCanvasDTO usertag2(String userTag2){
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
    public PSSysCanvasDTO usertag3(String userTag3){
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
    public PSSysCanvasDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysCanvasId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysCanvasId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysCanvasId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysCanvasId(strValue);
    }

    @JsonIgnore
    public PSSysCanvasDTO id(String strValue){
        this.setPSSysCanvasId(strValue);
        return this;
    }


    /**
     *  系统画布相关模型 成员集合
     */
    public final static String FIELD_PSSYSCANVASMODELS = "pssyscanvasmodels";

    private java.util.List<net.ibizsys.centralstudio.dto.PSSysCanvasModelDTO> pssyscanvasmodels;

    /**
     * 获取 系统画布相关模型 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSCANVASMODELS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCanvasModelDTO> getPSSysCanvasModels(){
        return this.pssyscanvasmodels;
    }

    /**
     * 设置 系统画布相关模型 成员集合  
     * @param pssyscanvasmodels
     */
    @JsonProperty(FIELD_PSSYSCANVASMODELS)
    public void setPSSysCanvasModels(java.util.List<net.ibizsys.centralstudio.dto.PSSysCanvasModelDTO> pssyscanvasmodels){
        this.pssyscanvasmodels = pssyscanvasmodels;
    }

    /**
     * 获取 系统画布相关模型 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSSysCanvasModelDTO> getPSSysCanvasModelsIf(){
        if(this.pssyscanvasmodels == null){
            this.pssyscanvasmodels = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSSysCanvasModelDTO>();          
        }
        return this.pssyscanvasmodels;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysCanvasDTO){
            PSSysCanvasDTO dto = (PSSysCanvasDTO)iEntity;
            dto.setPSSysCanvasModels(this.getPSSysCanvasModels());
        }
        super.copyTo(iEntity);
    }
}
