package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSMODELFOLDER</B>系统模型目录 模型传输对象
 * <P>
 * 
 */
public class PSSysModelFolder extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysModelFolder(){
    }      

    /**
     * <B>ALLUSERFLAG</B>&nbsp;全部用户
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLUSERFLAG = "alluserflag";

    /**
     * 设置 全部用户
     * 
     * @param allUserFlag
     * 
     */
    @JsonProperty(FIELD_ALLUSERFLAG)
    public void setAllUserFlag(Integer allUserFlag){
        this.set(FIELD_ALLUSERFLAG, allUserFlag);
    }
    
    /**
     * 获取 全部用户  
     * @return
     */
    @JsonIgnore
    public Integer getAllUserFlag(){
        Object objValue = this.get(FIELD_ALLUSERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部用户 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllUserFlagDirty(){
        if(this.contains(FIELD_ALLUSERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部用户
     */
    @JsonIgnore
    public void resetAllUserFlag(){
        this.reset(FIELD_ALLUSERFLAG);
    }

    /**
     * 设置 全部用户
     * <P>
     * 等同 {@link #setAllUserFlag}
     * @param allUserFlag
     */
    @JsonIgnore
    public PSSysModelFolder alluserflag(Integer allUserFlag){
        this.setAllUserFlag(allUserFlag);
        return this;
    }

     /**
     * 设置 全部用户
     * <P>
     * 等同 {@link #setAllUserFlag}
     * @param allUserFlag
     */
    @JsonIgnore
    public PSSysModelFolder alluserflag(Boolean allUserFlag){
        if(allUserFlag == null){
            this.setAllUserFlag(null);
        }
        else{
            this.setAllUserFlag(allUserFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSysModelFolder createdate(String createDate){
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
    public PSSysModelFolder createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FOLDERTYPE</B>&nbsp;目录类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_FOLDERTYPE = "foldertype";

    /**
     * 设置 目录类型
     * 
     * @param folderType
     * 
     */
    @JsonProperty(FIELD_FOLDERTYPE)
    public void setFolderType(String folderType){
        this.set(FIELD_FOLDERTYPE, folderType);
    }
    
    /**
     * 获取 目录类型  
     * @return
     */
    @JsonIgnore
    public String getFolderType(){
        Object objValue = this.get(FIELD_FOLDERTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目录类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFolderTypeDirty(){
        if(this.contains(FIELD_FOLDERTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目录类型
     */
    @JsonIgnore
    public void resetFolderType(){
        this.reset(FIELD_FOLDERTYPE);
    }

    /**
     * 设置 目录类型
     * <P>
     * 等同 {@link #setFolderType}
     * @param folderType
     */
    @JsonIgnore
    public PSSysModelFolder foldertype(String folderType){
        this.setFolderType(folderType);
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
    public PSSysModelFolder memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示次序  
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
     * 判断 显示次序 是否指定值，包括空值
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
     * 重置 显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysModelFolder ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSSYSMODELFOLDERID</B>&nbsp;父目录
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysModelFolder} 
     */
    public final static String FIELD_PPSSYSMODELFOLDERID = "ppssysmodelfolderid";

    /**
     * 设置 父目录
     * 
     * @param pPSSysModelFolderId
     * 
     */
    @JsonProperty(FIELD_PPSSYSMODELFOLDERID)
    public void setPPSSysModelFolderId(String pPSSysModelFolderId){
        this.set(FIELD_PPSSYSMODELFOLDERID, pPSSysModelFolderId);
    }
    
    /**
     * 获取 父目录  
     * @return
     */
    @JsonIgnore
    public String getPPSSysModelFolderId(){
        Object objValue = this.get(FIELD_PPSSYSMODELFOLDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysModelFolderIdDirty(){
        if(this.contains(FIELD_PPSSYSMODELFOLDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父目录
     */
    @JsonIgnore
    public void resetPPSSysModelFolderId(){
        this.reset(FIELD_PPSSYSMODELFOLDERID);
    }

    /**
     * 设置 父目录
     * <P>
     * 等同 {@link #setPPSSysModelFolderId}
     * @param pPSSysModelFolderId
     */
    @JsonIgnore
    public PSSysModelFolder ppssysmodelfolderid(String pPSSysModelFolderId){
        this.setPPSSysModelFolderId(pPSSysModelFolderId);
        return this;
    }

    /**
     * 设置 父目录，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysModelFolderId}
     * @param pSSysModelFolder 引用对象
     */
    @JsonIgnore
    public PSSysModelFolder ppssysmodelfolderid(PSSysModelFolder pSSysModelFolder){
        if(pSSysModelFolder == null){
            this.setPPSSysModelFolderId(null);
            this.setPPSSysModelFolderName(null);
        }
        else{
            this.setPPSSysModelFolderId(pSSysModelFolder.getPSSysModelFolderId());
            this.setPPSSysModelFolderName(pSSysModelFolder.getPSSysModelFolderName());
        }
        return this;
    }

    /**
     * <B>PPSSYSMODELFOLDERNAME</B>&nbsp;父目录
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSMODELFOLDERID}
     */
    public final static String FIELD_PPSSYSMODELFOLDERNAME = "ppssysmodelfoldername";

    /**
     * 设置 父目录
     * 
     * @param pPSSysModelFolderName
     * 
     */
    @JsonProperty(FIELD_PPSSYSMODELFOLDERNAME)
    public void setPPSSysModelFolderName(String pPSSysModelFolderName){
        this.set(FIELD_PPSSYSMODELFOLDERNAME, pPSSysModelFolderName);
    }
    
    /**
     * 获取 父目录  
     * @return
     */
    @JsonIgnore
    public String getPPSSysModelFolderName(){
        Object objValue = this.get(FIELD_PPSSYSMODELFOLDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父目录 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysModelFolderNameDirty(){
        if(this.contains(FIELD_PPSSYSMODELFOLDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父目录
     */
    @JsonIgnore
    public void resetPPSSysModelFolderName(){
        this.reset(FIELD_PPSSYSMODELFOLDERNAME);
    }

    /**
     * 设置 父目录
     * <P>
     * 等同 {@link #setPPSSysModelFolderName}
     * @param pPSSysModelFolderName
     */
    @JsonIgnore
    public PSSysModelFolder ppssysmodelfoldername(String pPSSysModelFolderName){
        this.setPPSSysModelFolderName(pPSSysModelFolderName);
        return this;
    }

    /**
     * <B>PSOBJID</B>&nbsp;对象标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSOBJID = "psobjid";

    /**
     * 设置 对象标识
     * 
     * @param pSObjId
     * 
     */
    @JsonProperty(FIELD_PSOBJID)
    public void setPSObjId(String pSObjId){
        this.set(FIELD_PSOBJID, pSObjId);
    }
    
    /**
     * 获取 对象标识  
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
     * 判断 对象标识 是否指定值，包括空值
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
     * 重置 对象标识
     */
    @JsonIgnore
    public void resetPSObjId(){
        this.reset(FIELD_PSOBJID);
    }

    /**
     * 设置 对象标识
     * <P>
     * 等同 {@link #setPSObjId}
     * @param pSObjId
     */
    @JsonIgnore
    public PSSysModelFolder psobjid(String pSObjId){
        this.setPSObjId(pSObjId);
        return this;
    }

    /**
     * <B>PSOBJNAME</B>&nbsp;对象名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJNAME = "psobjname";

    /**
     * 设置 对象名称
     * 
     * @param pSObjName
     * 
     */
    @JsonProperty(FIELD_PSOBJNAME)
    public void setPSObjName(String pSObjName){
        this.set(FIELD_PSOBJNAME, pSObjName);
    }
    
    /**
     * 获取 对象名称  
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
     * 判断 对象名称 是否指定值，包括空值
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
     * 重置 对象名称
     */
    @JsonIgnore
    public void resetPSObjName(){
        this.reset(FIELD_PSOBJNAME);
    }

    /**
     * 设置 对象名称
     * <P>
     * 等同 {@link #setPSObjName}
     * @param pSObjName
     */
    @JsonIgnore
    public PSSysModelFolder psobjname(String pSObjName){
        this.setPSObjName(pSObjName);
        return this;
    }

    /**
     * <B>PSOBJTYPE</B>&nbsp;成员类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PSOBJTYPE = "psobjtype";

    /**
     * 设置 成员类型
     * 
     * @param pSObjType
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPE)
    public void setPSObjType(String pSObjType){
        this.set(FIELD_PSOBJTYPE, pSObjType);
    }
    
    /**
     * 获取 成员类型  
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
     * 判断 成员类型 是否指定值，包括空值
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
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetPSObjType(){
        this.reset(FIELD_PSOBJTYPE);
    }

    /**
     * 设置 成员类型
     * <P>
     * 等同 {@link #setPSObjType}
     * @param pSObjType
     */
    @JsonIgnore
    public PSSysModelFolder psobjtype(String pSObjType){
        this.setPSObjType(pSObjType);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用标识
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用标识
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用标识
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSysModelFolder pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * <B>PSSYSMODELFOLDERID</B>&nbsp;系统模型目录标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMODELFOLDERID = "pssysmodelfolderid";

    /**
     * 设置 系统模型目录标识
     * 
     * @param pSSysModelFolderId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELFOLDERID)
    public void setPSSysModelFolderId(String pSSysModelFolderId){
        this.set(FIELD_PSSYSMODELFOLDERID, pSSysModelFolderId);
    }
    
    /**
     * 获取 系统模型目录标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelFolderId(){
        Object objValue = this.get(FIELD_PSSYSMODELFOLDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型目录标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelFolderIdDirty(){
        if(this.contains(FIELD_PSSYSMODELFOLDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型目录标识
     */
    @JsonIgnore
    public void resetPSSysModelFolderId(){
        this.reset(FIELD_PSSYSMODELFOLDERID);
    }

    /**
     * 设置 系统模型目录标识
     * <P>
     * 等同 {@link #setPSSysModelFolderId}
     * @param pSSysModelFolderId
     */
    @JsonIgnore
    public PSSysModelFolder pssysmodelfolderid(String pSSysModelFolderId){
        this.setPSSysModelFolderId(pSSysModelFolderId);
        return this;
    }

    /**
     * <B>PSSYSMODELFOLDERNAME</B>&nbsp;名称
     * <P>
     * 字符串：最大长度 200，名称不包括路径符号
     */
    public final static String FIELD_PSSYSMODELFOLDERNAME = "pssysmodelfoldername";

    /**
     * 设置 名称
     * 
     * @param pSSysModelFolderName
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELFOLDERNAME)
    public void setPSSysModelFolderName(String pSSysModelFolderName){
        this.set(FIELD_PSSYSMODELFOLDERNAME, pSSysModelFolderName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelFolderName(){
        Object objValue = this.get(FIELD_PSSYSMODELFOLDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelFolderNameDirty(){
        if(this.contains(FIELD_PSSYSMODELFOLDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSSysModelFolderName(){
        this.reset(FIELD_PSSYSMODELFOLDERNAME);
    }

    /**
     * 设置 名称
     * <P>
     * 等同 {@link #setPSSysModelFolderName}
     * @param pSSysModelFolderName
     */
    @JsonIgnore
    public PSSysModelFolder pssysmodelfoldername(String pSSysModelFolderName){
        this.setPSSysModelFolderName(pSSysModelFolderName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysModelFolderName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysModelFolderName(strName);
    }

    @JsonIgnore
    public PSSysModelFolder name(String strName){
        this.setPSSysModelFolderName(strName);
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
    public PSSysModelFolder updatedate(String updateDate){
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
    public PSSysModelFolder updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标记
     * <P>
     * 字符串：最大长度 100
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
    public PSSysModelFolder usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSSysModelFolder usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysModelFolderId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysModelFolderId(strValue);
    }

    @JsonIgnore
    public PSSysModelFolder id(String strValue){
        this.setPSSysModelFolderId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysModelFolder){
            PSSysModelFolder model = (PSSysModelFolder)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
