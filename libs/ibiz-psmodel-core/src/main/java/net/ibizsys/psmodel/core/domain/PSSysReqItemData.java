package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSREQITEMDATA</B>需求项讨论 模型传输对象
 * <P>
 * 
 */
public class PSSysReqItemData extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysReqItemData(){
    }      

    /**
     * <B>AIBUILDSTATE</B>&nbsp;AI构建状态
     */
    public final static String FIELD_AIBUILDSTATE = "aibuildstate";

    /**
     * 设置 AI构建状态
     * 
     * @param aIBuildState
     * 
     */
    @JsonProperty(FIELD_AIBUILDSTATE)
    public void setAIBuildState(Integer aIBuildState){
        this.set(FIELD_AIBUILDSTATE, aIBuildState);
    }
    
    /**
     * 获取 AI构建状态  
     * @return
     */
    @JsonIgnore
    public Integer getAIBuildState(){
        Object objValue = this.get(FIELD_AIBUILDSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 AI构建状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIBuildStateDirty(){
        if(this.contains(FIELD_AIBUILDSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI构建状态
     */
    @JsonIgnore
    public void resetAIBuildState(){
        this.reset(FIELD_AIBUILDSTATE);
    }

    /**
     * 设置 AI构建状态
     * <P>
     * 等同 {@link #setAIBuildState}
     * @param aIBuildState
     */
    @JsonIgnore
    public PSSysReqItemData aibuildstate(Integer aIBuildState){
        this.setAIBuildState(aIBuildState);
        return this;
    }

    /**
     * <B>AICHOICES</B>&nbsp;AI反馈
     */
    public final static String FIELD_AICHOICES = "aichoices";

    /**
     * 设置 AI反馈
     * 
     * @param aIChoices
     * 
     */
    @JsonProperty(FIELD_AICHOICES)
    public void setAIChoices(String aIChoices){
        this.set(FIELD_AICHOICES, aIChoices);
    }
    
    /**
     * 获取 AI反馈  
     * @return
     */
    @JsonIgnore
    public String getAIChoices(){
        Object objValue = this.get(FIELD_AICHOICES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI反馈 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIChoicesDirty(){
        if(this.contains(FIELD_AICHOICES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI反馈
     */
    @JsonIgnore
    public void resetAIChoices(){
        this.reset(FIELD_AICHOICES);
    }

    /**
     * 设置 AI反馈
     * <P>
     * 等同 {@link #setAIChoices}
     * @param aIChoices
     */
    @JsonIgnore
    public PSSysReqItemData aichoices(String aIChoices){
        this.setAIChoices(aIChoices);
        return this;
    }

    /**
     * <B>AIPROMPT</B>&nbsp;AI提示词
     */
    public final static String FIELD_AIPROMPT = "aiprompt";

    /**
     * 设置 AI提示词
     * 
     * @param aIPrompt
     * 
     */
    @JsonProperty(FIELD_AIPROMPT)
    public void setAIPrompt(String aIPrompt){
        this.set(FIELD_AIPROMPT, aIPrompt);
    }
    
    /**
     * 获取 AI提示词  
     * @return
     */
    @JsonIgnore
    public String getAIPrompt(){
        Object objValue = this.get(FIELD_AIPROMPT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI提示词 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIPromptDirty(){
        if(this.contains(FIELD_AIPROMPT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI提示词
     */
    @JsonIgnore
    public void resetAIPrompt(){
        this.reset(FIELD_AIPROMPT);
    }

    /**
     * 设置 AI提示词
     * <P>
     * 等同 {@link #setAIPrompt}
     * @param aIPrompt
     */
    @JsonIgnore
    public PSSysReqItemData aiprompt(String aIPrompt){
        this.setAIPrompt(aIPrompt);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;内容
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 设置 内容
     * 
     * @param content
     * 
     */
    @JsonProperty(FIELD_CONTENT)
    public void setContent(String content){
        this.set(FIELD_CONTENT, content);
    }
    
    /**
     * 获取 内容  
     * @return
     */
    @JsonIgnore
    public String getContent(){
        Object objValue = this.get(FIELD_CONTENT);
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
    public boolean isContentDirty(){
        if(this.contains(FIELD_CONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容
     */
    @JsonIgnore
    public void resetContent(){
        this.reset(FIELD_CONTENT);
    }

    /**
     * 设置 内容
     * <P>
     * 等同 {@link #setContent}
     * @param content
     */
    @JsonIgnore
    public PSSysReqItemData content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CREATEDATE</B>&nbsp;讨论时间
     */
    public final static String FIELD_CREATEDATE = "createdate";

    /**
     * 设置 讨论时间
     * 
     * @param createDate
     * 
     */
    @JsonProperty(FIELD_CREATEDATE)
    public void setCreateDate(String createDate){
        this.set(FIELD_CREATEDATE, createDate);
    }
    
    /**
     * 获取 讨论时间  
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
     * 判断 讨论时间 是否指定值，包括空值
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
     * 重置 讨论时间
     */
    @JsonIgnore
    public void resetCreateDate(){
        this.reset(FIELD_CREATEDATE);
    }

    /**
     * 设置 讨论时间
     * <P>
     * 等同 {@link #setCreateDate}
     * @param createDate
     */
    @JsonIgnore
    public PSSysReqItemData createdate(String createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEMAN</B>&nbsp;讨论人
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CREATEMAN = "createman";

    /**
     * 设置 讨论人
     * 
     * @param createMan
     * 
     */
    @JsonProperty(FIELD_CREATEMAN)
    public void setCreateMan(String createMan){
        this.set(FIELD_CREATEMAN, createMan);
    }
    
    /**
     * 获取 讨论人  
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
     * 判断 讨论人 是否指定值，包括空值
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
     * 重置 讨论人
     */
    @JsonIgnore
    public void resetCreateMan(){
        this.reset(FIELD_CREATEMAN);
    }

    /**
     * 设置 讨论人
     * <P>
     * 等同 {@link #setCreateMan}
     * @param createMan
     */
    @JsonIgnore
    public PSSysReqItemData createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 次序  
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
     * 判断 次序 是否指定值，包括空值
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
     * 重置 次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysReqItemData ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSSYSREQITEMDATAID</B>&nbsp;需求项讨论标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSREQITEMDATAID = "pssysreqitemdataid";

    /**
     * 设置 需求项讨论标识
     * 
     * @param pSSysReqItemDataId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMDATAID)
    public void setPSSysReqItemDataId(String pSSysReqItemDataId){
        this.set(FIELD_PSSYSREQITEMDATAID, pSSysReqItemDataId);
    }
    
    /**
     * 获取 需求项讨论标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemDataId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMDATAID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求项讨论标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemDataIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMDATAID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求项讨论标识
     */
    @JsonIgnore
    public void resetPSSysReqItemDataId(){
        this.reset(FIELD_PSSYSREQITEMDATAID);
    }

    /**
     * 设置 需求项讨论标识
     * <P>
     * 等同 {@link #setPSSysReqItemDataId}
     * @param pSSysReqItemDataId
     */
    @JsonIgnore
    public PSSysReqItemData pssysreqitemdataid(String pSSysReqItemDataId){
        this.setPSSysReqItemDataId(pSSysReqItemDataId);
        return this;
    }

    /**
     * <B>PSSYSREQITEMDATANAME</B>&nbsp;标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSREQITEMDATANAME = "pssysreqitemdataname";

    /**
     * 设置 标题
     * 
     * @param pSSysReqItemDataName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMDATANAME)
    public void setPSSysReqItemDataName(String pSSysReqItemDataName){
        this.set(FIELD_PSSYSREQITEMDATANAME, pSSysReqItemDataName);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemDataName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMDATANAME);
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
    public boolean isPSSysReqItemDataNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMDATANAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetPSSysReqItemDataName(){
        this.reset(FIELD_PSSYSREQITEMDATANAME);
    }

    /**
     * 设置 标题
     * <P>
     * 等同 {@link #setPSSysReqItemDataName}
     * @param pSSysReqItemDataName
     */
    @JsonIgnore
    public PSSysReqItemData pssysreqitemdataname(String pSSysReqItemDataName){
        this.setPSSysReqItemDataName(pSSysReqItemDataName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysReqItemDataName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysReqItemDataName(strName);
    }

    @JsonIgnore
    public PSSysReqItemData name(String strName){
        this.setPSSysReqItemDataName(strName);
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
    public PSSysReqItemData pssysreqitemid(String pSSysReqItemId){
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
    public PSSysReqItemData pssysreqitemid(PSSysReqItem pSSysReqItem){
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
    public PSSysReqItemData pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>SUBJECT</B>&nbsp;标题
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 设置 标题
     * 
     * @param subject
     * 
     */
    @JsonProperty(FIELD_SUBJECT)
    public void setSubject(String subject){
        this.set(FIELD_SUBJECT, subject);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getSubject(){
        Object objValue = this.get(FIELD_SUBJECT);
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
    public boolean isSubjectDirty(){
        if(this.contains(FIELD_SUBJECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetSubject(){
        this.reset(FIELD_SUBJECT);
    }

    /**
     * 设置 标题
     * <P>
     * 等同 {@link #setSubject}
     * @param subject
     */
    @JsonIgnore
    public PSSysReqItemData subject(String subject){
        this.setSubject(subject);
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
    public PSSysReqItemData updatedate(String updateDate){
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
    public PSSysReqItemData updateman(String updateMan){
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
    public PSSysReqItemData usercat(String userCat){
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
    public PSSysReqItemData usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysReqItemData usertag(String userTag){
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
    public PSSysReqItemData usertag2(String userTag2){
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
    public PSSysReqItemData usertag3(String userTag3){
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
    public PSSysReqItemData usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysReqItemDataId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysReqItemDataId(strValue);
    }

    @JsonIgnore
    public PSSysReqItemData id(String strValue){
        this.setPSSysReqItemDataId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysReqItemData){
            PSSysReqItemData model = (PSSysReqItemData)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
