package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSEAIELEMENT</B>集成元素 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIElement extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysEAIElement(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysEAIElement codename(String codeName){
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
    public PSSysEAIElement createdate(String createDate){
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
    public PSSysEAIElement createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EAIELEMENTTAG</B>&nbsp;集成元素标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIELEMENTTAG = "eaielementtag";

    /**
     * 设置 集成元素标记
     * 
     * @param eAIElementTag
     * 
     */
    @JsonProperty(FIELD_EAIELEMENTTAG)
    public void setEAIElementTag(String eAIElementTag){
        this.set(FIELD_EAIELEMENTTAG, eAIElementTag);
    }
    
    /**
     * 获取 集成元素标记  
     * @return
     */
    @JsonIgnore
    public String getEAIElementTag(){
        Object objValue = this.get(FIELD_EAIELEMENTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIElementTagDirty(){
        if(this.contains(FIELD_EAIELEMENTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素标记
     */
    @JsonIgnore
    public void resetEAIElementTag(){
        this.reset(FIELD_EAIELEMENTTAG);
    }

    /**
     * 设置 集成元素标记
     * <P>
     * 等同 {@link #setEAIElementTag}
     * @param eAIElementTag
     */
    @JsonIgnore
    public PSSysEAIElement eaielementtag(String eAIElementTag){
        this.setEAIElementTag(eAIElementTag);
        return this;
    }

    /**
     * <B>EAIELEMENTTAG2</B>&nbsp;集成元素标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIELEMENTTAG2 = "eaielementtag2";

    /**
     * 设置 集成元素标记2
     * 
     * @param eAIElementTag2
     * 
     */
    @JsonProperty(FIELD_EAIELEMENTTAG2)
    public void setEAIElementTag2(String eAIElementTag2){
        this.set(FIELD_EAIELEMENTTAG2, eAIElementTag2);
    }
    
    /**
     * 获取 集成元素标记2  
     * @return
     */
    @JsonIgnore
    public String getEAIElementTag2(){
        Object objValue = this.get(FIELD_EAIELEMENTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIElementTag2Dirty(){
        if(this.contains(FIELD_EAIELEMENTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素标记2
     */
    @JsonIgnore
    public void resetEAIElementTag2(){
        this.reset(FIELD_EAIELEMENTTAG2);
    }

    /**
     * 设置 集成元素标记2
     * <P>
     * 等同 {@link #setEAIElementTag2}
     * @param eAIElementTag2
     */
    @JsonIgnore
    public PSSysEAIElement eaielementtag2(String eAIElementTag2){
        this.setEAIElementTag2(eAIElementTag2);
        return this;
    }

    /**
     * <B>EAIELEMENTTYPE</B>&nbsp;集成元素类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EAIElementType} 
     */
    public final static String FIELD_EAIELEMENTTYPE = "eaielementtype";

    /**
     * 设置 集成元素类型
     * 
     * @param eAIElementType
     * 
     */
    @JsonProperty(FIELD_EAIELEMENTTYPE)
    public void setEAIElementType(String eAIElementType){
        this.set(FIELD_EAIELEMENTTYPE, eAIElementType);
    }
    
    /**
     * 获取 集成元素类型  
     * @return
     */
    @JsonIgnore
    public String getEAIElementType(){
        Object objValue = this.get(FIELD_EAIELEMENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIElementTypeDirty(){
        if(this.contains(FIELD_EAIELEMENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素类型
     */
    @JsonIgnore
    public void resetEAIElementType(){
        this.reset(FIELD_EAIELEMENTTYPE);
    }

    /**
     * 设置 集成元素类型
     * <P>
     * 等同 {@link #setEAIElementType}
     * @param eAIElementType
     */
    @JsonIgnore
    public PSSysEAIElement eaielementtype(String eAIElementType){
        this.setEAIElementType(eAIElementType);
        return this;
    }

     /**
     * 设置 集成元素类型
     * <P>
     * 等同 {@link #setEAIElementType}
     * @param eAIElementType
     */
    @JsonIgnore
    public PSSysEAIElement eaielementtype(net.ibizsys.psmodel.core.util.PSModelEnums.EAIElementType eAIElementType){
        if(eAIElementType == null){
            this.setEAIElementType(null);
        }
        else{
            this.setEAIElementType(eAIElementType.value);
        }
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
    public PSSysEAIElement memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERMODE</B>&nbsp;元素排序模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EAIElementREOrderMode} 
     */
    public final static String FIELD_ORDERMODE = "ordermode";

    /**
     * 设置 元素排序模式
     * 
     * @param orderMode
     * 
     */
    @JsonProperty(FIELD_ORDERMODE)
    public void setOrderMode(String orderMode){
        this.set(FIELD_ORDERMODE, orderMode);
    }
    
    /**
     * 获取 元素排序模式  
     * @return
     */
    @JsonIgnore
    public String getOrderMode(){
        Object objValue = this.get(FIELD_ORDERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 元素排序模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderModeDirty(){
        if(this.contains(FIELD_ORDERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 元素排序模式
     */
    @JsonIgnore
    public void resetOrderMode(){
        this.reset(FIELD_ORDERMODE);
    }

    /**
     * 设置 元素排序模式
     * <P>
     * 等同 {@link #setOrderMode}
     * @param orderMode
     */
    @JsonIgnore
    public PSSysEAIElement ordermode(String orderMode){
        this.setOrderMode(orderMode);
        return this;
    }

     /**
     * 设置 元素排序模式
     * <P>
     * 等同 {@link #setOrderMode}
     * @param orderMode
     */
    @JsonIgnore
    public PSSysEAIElement ordermode(net.ibizsys.psmodel.core.util.PSModelEnums.EAIElementREOrderMode orderMode){
        if(orderMode == null){
            this.setOrderMode(null);
        }
        else{
            this.setOrderMode(orderMode.value);
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;系统集成元素标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIELEMENTID = "pssyseaielementid";

    /**
     * 设置 系统集成元素标识
     * 
     * @param pSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTID)
    public void setPSSysEAIElementId(String pSSysEAIElementId){
        this.set(FIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }
    
    /**
     * 获取 系统集成元素标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成元素标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成元素标识
     */
    @JsonIgnore
    public void resetPSSysEAIElementId(){
        this.reset(FIELD_PSSYSEAIELEMENTID);
    }

    /**
     * 设置 系统集成元素标识
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIElement pssyseaielementid(String pSSysEAIElementId){
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTNAME</B>&nbsp;集成元素名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";

    /**
     * 设置 集成元素名称
     * 
     * @param pSSysEAIElementName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTNAME)
    public void setPSSysEAIElementName(String pSSysEAIElementName){
        this.set(FIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }
    
    /**
     * 获取 集成元素名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素名称
     */
    @JsonIgnore
    public void resetPSSysEAIElementName(){
        this.reset(FIELD_PSSYSEAIELEMENTNAME);
    }

    /**
     * 设置 集成元素名称
     * <P>
     * 等同 {@link #setPSSysEAIElementName}
     * @param pSSysEAIElementName
     */
    @JsonIgnore
    public PSSysEAIElement pssyseaielementname(String pSSysEAIElementName){
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIElementName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIElementName(strName);
    }

    @JsonIgnore
    public PSSysEAIElement name(String strName){
        this.setPSSysEAIElementName(strName);
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMEID</B>&nbsp;应用集成体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEAIScheme} 
     */
    public final static String FIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";

    /**
     * 设置 应用集成体系
     * 
     * @param pSSysEAISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMEID)
    public void setPSSysEAISchemeId(String pSSysEAISchemeId){
        this.set(FIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }
    
    /**
     * 获取 应用集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeId(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeId(){
        this.reset(FIELD_PSSYSEAISCHEMEID);
    }

    /**
     * 设置 应用集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAISchemeId
     */
    @JsonIgnore
    public PSSysEAIElement pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * 设置 应用集成体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAIScheme 引用对象
     */
    @JsonIgnore
    public PSSysEAIElement pssyseaischemeid(PSSysEAIScheme pSSysEAIScheme){
        if(pSSysEAIScheme == null){
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        }
        else{
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMENAME</B>&nbsp;应用集成体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAISCHEMEID}
     */
    public final static String FIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";

    /**
     * 设置 应用集成体系
     * 
     * @param pSSysEAISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMENAME)
    public void setPSSysEAISchemeName(String pSSysEAISchemeName){
        this.set(FIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }
    
    /**
     * 获取 应用集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeName(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeName(){
        this.reset(FIELD_PSSYSEAISCHEMENAME);
    }

    /**
     * 设置 应用集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeName}
     * @param pSSysEAISchemeName
     */
    @JsonIgnore
    public PSSysEAIElement pssyseaischemename(String pSSysEAISchemeName){
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
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
    public PSSysEAIElement updatedate(String updateDate){
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
    public PSSysEAIElement updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat} 
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
    public PSSysEAIElement usercat(String userCat){
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
    public PSSysEAIElement usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIElement usertag(String userTag){
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
    public PSSysEAIElement usertag2(String userTag2){
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
    public PSSysEAIElement usertag3(String userTag3){
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
    public PSSysEAIElement usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSSysEAIElement validflag(Integer validFlag){
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
    public PSSysEAIElement validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysEAIElementId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIElementId(strValue);
    }

    @JsonIgnore
    public PSSysEAIElement id(String strValue){
        this.setPSSysEAIElementId(strValue);
        return this;
    }


    /**
     *  集成元素属性 成员集合
     */
    public final static String FIELD_PSSYSEAIELEMENTATTRS = "pssyseaielementattrs";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementAttr> pssyseaielementattrs;

    /**
     * 获取 集成元素属性 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTATTRS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementAttr> getPSSysEAIElementAttrs(){
        return this.pssyseaielementattrs;
    }

    /**
     * 设置 集成元素属性 成员集合  
     * @param pssyseaielementattrs
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTATTRS)
    public void setPSSysEAIElementAttrs(java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementAttr> pssyseaielementattrs){
        this.pssyseaielementattrs = pssyseaielementattrs;
    }

    /**
     * 获取 集成元素属性 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementAttr> getPSSysEAIElementAttrsIf(){
        if(this.pssyseaielementattrs == null){
            this.pssyseaielementattrs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysEAIElementAttr>();          
        }
        return this.pssyseaielementattrs;
    }


    /**
     *  集成元素元素 成员集合
     */
    public final static String FIELD_PSSYSEAIELEMENTRES = "pssyseaielementres";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementRE> pssyseaielementres;

    /**
     * 获取 集成元素元素 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTRES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementRE> getPSSysEAIElementREs(){
        return this.pssyseaielementres;
    }

    /**
     * 设置 集成元素元素 成员集合  
     * @param pssyseaielementres
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTRES)
    public void setPSSysEAIElementREs(java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementRE> pssyseaielementres){
        this.pssyseaielementres = pssyseaielementres;
    }

    /**
     * 获取 集成元素元素 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSSysEAIElementRE> getPSSysEAIElementREsIf(){
        if(this.pssyseaielementres == null){
            this.pssyseaielementres = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSSysEAIElementRE>();          
        }
        return this.pssyseaielementres;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysEAIElement){
            PSSysEAIElement model = (PSSysEAIElement)iPSModel;
            model.setPSSysEAIElementAttrs(this.getPSSysEAIElementAttrs());
            model.setPSSysEAIElementREs(this.getPSSysEAIElementREs());
        }
        super.copyTo(iPSModel);
    }
}
