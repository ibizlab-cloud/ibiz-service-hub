package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSREQITEMHIS</B>需求项备份 模型传输对象
 * <P>
 * 
 */
public class PSSysReqItemHis extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysReqItemHis(){
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
    public PSSysReqItemHis createdate(String createDate){
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
    public PSSysReqItemHis createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ITEMTAG</B>&nbsp;项标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG = "itemtag";

    /**
     * 设置 项标记
     * 
     * @param itemTag
     * 
     */
    @JsonProperty(FIELD_ITEMTAG)
    public void setItemTag(String itemTag){
        this.set(FIELD_ITEMTAG, itemTag);
    }
    
    /**
     * 获取 项标记  
     * @return
     */
    @JsonIgnore
    public String getItemTag(){
        Object objValue = this.get(FIELD_ITEMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTagDirty(){
        if(this.contains(FIELD_ITEMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记
     */
    @JsonIgnore
    public void resetItemTag(){
        this.reset(FIELD_ITEMTAG);
    }

    /**
     * 设置 项标记
     * <P>
     * 等同 {@link #setItemTag}
     * @param itemTag
     */
    @JsonIgnore
    public PSSysReqItemHis itemtag(String itemTag){
        this.setItemTag(itemTag);
        return this;
    }

    /**
     * <B>ITEMTAG2</B>&nbsp;项标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG2 = "itemtag2";

    /**
     * 设置 项标记2
     * 
     * @param itemTag2
     * 
     */
    @JsonProperty(FIELD_ITEMTAG2)
    public void setItemTag2(String itemTag2){
        this.set(FIELD_ITEMTAG2, itemTag2);
    }
    
    /**
     * 获取 项标记2  
     * @return
     */
    @JsonIgnore
    public String getItemTag2(){
        Object objValue = this.get(FIELD_ITEMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag2Dirty(){
        if(this.contains(FIELD_ITEMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记2
     */
    @JsonIgnore
    public void resetItemTag2(){
        this.reset(FIELD_ITEMTAG2);
    }

    /**
     * 设置 项标记2
     * <P>
     * 等同 {@link #setItemTag2}
     * @param itemTag2
     */
    @JsonIgnore
    public PSSysReqItemHis itemtag2(String itemTag2){
        this.setItemTag2(itemTag2);
        return this;
    }

    /**
     * <B>PSSYSREQITEMHISID</B>&nbsp;需求项备份标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSREQITEMHISID = "pssysreqitemhisid";

    /**
     * 设置 需求项备份标识
     * 
     * @param pSSysReqItemHisId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMHISID)
    public void setPSSysReqItemHisId(String pSSysReqItemHisId){
        this.set(FIELD_PSSYSREQITEMHISID, pSSysReqItemHisId);
    }
    
    /**
     * 获取 需求项备份标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemHisId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMHISID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求项备份标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemHisIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMHISID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求项备份标识
     */
    @JsonIgnore
    public void resetPSSysReqItemHisId(){
        this.reset(FIELD_PSSYSREQITEMHISID);
    }

    /**
     * 设置 需求项备份标识
     * <P>
     * 等同 {@link #setPSSysReqItemHisId}
     * @param pSSysReqItemHisId
     */
    @JsonIgnore
    public PSSysReqItemHis pssysreqitemhisid(String pSSysReqItemHisId){
        this.setPSSysReqItemHisId(pSSysReqItemHisId);
        return this;
    }

    /**
     * <B>PSSYSREQITEMHISNAME</B>&nbsp;标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSREQITEMHISNAME = "pssysreqitemhisname";

    /**
     * 设置 标题
     * 
     * @param pSSysReqItemHisName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMHISNAME)
    public void setPSSysReqItemHisName(String pSSysReqItemHisName){
        this.set(FIELD_PSSYSREQITEMHISNAME, pSSysReqItemHisName);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemHisName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMHISNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemHisNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMHISNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetPSSysReqItemHisName(){
        this.reset(FIELD_PSSYSREQITEMHISNAME);
    }

    /**
     * 设置 标题
     * <P>
     * 等同 {@link #setPSSysReqItemHisName}
     * @param pSSysReqItemHisName
     */
    @JsonIgnore
    public PSSysReqItemHis pssysreqitemhisname(String pSSysReqItemHisName){
        this.setPSSysReqItemHisName(pSSysReqItemHisName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysReqItemHisName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysReqItemHisName(strName);
    }

    @JsonIgnore
    public PSSysReqItemHis name(String strName){
        this.setPSSysReqItemHisName(strName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;需求项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 需求项
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 需求项  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 需求项
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSSysReqItemHis pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 需求项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSSysReqItemHis pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;需求项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 需求项
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 需求项  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求项
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 需求项
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSSysReqItemHis pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>REQCONTENT</B>&nbsp;内容
     */
    public final static String FIELD_REQCONTENT = "reqcontent";

    /**
     * 设置 内容
     * 
     * @param reqContent
     * 
     */
    @JsonProperty(FIELD_REQCONTENT)
    public void setReqContent(String reqContent){
        this.set(FIELD_REQCONTENT, reqContent);
    }
    
    /**
     * 获取 内容  
     * @return
     */
    @JsonIgnore
    public String getReqContent(){
        Object objValue = this.get(FIELD_REQCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReqContentDirty(){
        if(this.contains(FIELD_REQCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容
     */
    @JsonIgnore
    public void resetReqContent(){
        this.reset(FIELD_REQCONTENT);
    }

    /**
     * 设置 内容
     * <P>
     * 等同 {@link #setReqContent}
     * @param reqContent
     */
    @JsonIgnore
    public PSSysReqItemHis reqcontent(String reqContent){
        this.setReqContent(reqContent);
        return this;
    }

    /**
     * <B>TAGS</B>&nbsp;标记
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_TAGS = "tags";

    /**
     * 设置 标记
     * 
     * @param tags
     * 
     */
    @JsonProperty(FIELD_TAGS)
    public void setTags(String tags){
        this.set(FIELD_TAGS, tags);
    }
    
    /**
     * 获取 标记  
     * @return
     */
    @JsonIgnore
    public String getTags(){
        Object objValue = this.get(FIELD_TAGS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTagsDirty(){
        if(this.contains(FIELD_TAGS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标记
     */
    @JsonIgnore
    public void resetTags(){
        this.reset(FIELD_TAGS);
    }

    /**
     * 设置 标记
     * <P>
     * 等同 {@link #setTags}
     * @param tags
     */
    @JsonIgnore
    public PSSysReqItemHis tags(String tags){
        this.setTags(tags);
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
    public PSSysReqItemHis updatedate(String updateDate){
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
    public PSSysReqItemHis updateman(String updateMan){
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
    public PSSysReqItemHis usercat(String userCat){
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
    public PSSysReqItemHis usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysReqItemHis usertag(String userTag){
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
    public PSSysReqItemHis usertag2(String userTag2){
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
    public PSSysReqItemHis usertag3(String userTag3){
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
    public PSSysReqItemHis usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VER</B>&nbsp;版本
     */
    public final static String FIELD_VER = "ver";

    /**
     * 设置 版本
     * 
     * @param ver
     * 
     */
    @JsonProperty(FIELD_VER)
    public void setVer(Integer ver){
        this.set(FIELD_VER, ver);
    }
    
    /**
     * 获取 版本  
     * @return
     */
    @JsonIgnore
    public Integer getVer(){
        Object objValue = this.get(FIELD_VER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVerDirty(){
        if(this.contains(FIELD_VER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 版本
     */
    @JsonIgnore
    public void resetVer(){
        this.reset(FIELD_VER);
    }

    /**
     * 设置 版本
     * <P>
     * 等同 {@link #setVer}
     * @param ver
     */
    @JsonIgnore
    public PSSysReqItemHis ver(Integer ver){
        this.setVer(ver);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysReqItemHisId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysReqItemHisId(strValue);
    }

    @JsonIgnore
    public PSSysReqItemHis id(String strValue){
        this.setPSSysReqItemHisId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysReqItemHis){
            PSSysReqItemHis model = (PSSysReqItemHis)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
