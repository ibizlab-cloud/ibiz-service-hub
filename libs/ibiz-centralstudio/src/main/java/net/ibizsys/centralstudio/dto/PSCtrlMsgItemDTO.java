package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSCTRLMSGITEM</B>部件消息项 模型传输对象
 * <P>
 * 部件消息项模型提供更加详细的消息定义能力，包括了多语言、动态消息显示时长等
 */
public class PSCtrlMsgItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSCtrlMsgItemDTO(){
    }      

    /**
     * <B>CONTENT</B>&nbsp;内容，指定消息的内容
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 设置 内容，详细说明：{@link #FIELD_CONTENT}
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
     * 设置 内容，详细说明：{@link #FIELD_CONTENT}
     * <P>
     * 等同 {@link #setContent}
     * @param content
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENTPSLANRESID</B>&nbsp;内容语言资源，指定消息内容的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_CONTENTPSLANRESID = "contentpslanresid";

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESID}
     * 
     * @param contentPSLanResId
     * 
     */
    @JsonProperty(FIELD_CONTENTPSLANRESID)
    public void setContentPSLanResId(String contentPSLanResId){
        this.set(FIELD_CONTENTPSLANRESID, contentPSLanResId);
    }
    
    /**
     * 获取 内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getContentPSLanResId(){
        Object objValue = this.get(FIELD_CONTENTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSLanResIdDirty(){
        if(this.contains(FIELD_CONTENTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容语言资源
     */
    @JsonIgnore
    public void resetContentPSLanResId(){
        this.reset(FIELD_CONTENTPSLANRESID);
    }

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESID}
     * <P>
     * 等同 {@link #setContentPSLanResId}
     * @param contentPSLanResId
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO contentpslanresid(String contentPSLanResId){
        this.setContentPSLanResId(contentPSLanResId);
        return this;
    }

    /**
     * 设置 内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setContentPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO contentpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setContentPSLanResId(null);
            this.setContentPSLanResName(null);
        }
        else{
            this.setContentPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setContentPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CONTENTPSLANRESNAME</B>&nbsp;内容语言资源，指定消息内容的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CONTENTPSLANRESID}
     */
    public final static String FIELD_CONTENTPSLANRESNAME = "contentpslanresname";

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESNAME}
     * 
     * @param contentPSLanResName
     * 
     */
    @JsonProperty(FIELD_CONTENTPSLANRESNAME)
    public void setContentPSLanResName(String contentPSLanResName){
        this.set(FIELD_CONTENTPSLANRESNAME, contentPSLanResName);
    }
    
    /**
     * 获取 内容语言资源  
     * @return
     */
    @JsonIgnore
    public String getContentPSLanResName(){
        Object objValue = this.get(FIELD_CONTENTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentPSLanResNameDirty(){
        if(this.contains(FIELD_CONTENTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容语言资源
     */
    @JsonIgnore
    public void resetContentPSLanResName(){
        this.reset(FIELD_CONTENTPSLANRESNAME);
    }

    /**
     * 设置 内容语言资源，详细说明：{@link #FIELD_CONTENTPSLANRESNAME}
     * <P>
     * 等同 {@link #setContentPSLanResName}
     * @param contentPSLanResName
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO contentpslanresname(String contentPSLanResName){
        this.setContentPSLanResName(contentPSLanResName);
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
    public PSCtrlMsgItemDTO createdate(Timestamp createDate){
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
    public PSCtrlMsgItemDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSCtrlMsgItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定消息项所在部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlMsgDTO} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGITEMID</B>&nbsp;部件消息项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCTRLMSGITEMID = "psctrlmsgitemid";

    /**
     * 设置 部件消息项标识
     * 
     * @param pSCtrlMsgItemId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGITEMID)
    public void setPSCtrlMsgItemId(String pSCtrlMsgItemId){
        this.set(FIELD_PSCTRLMSGITEMID, pSCtrlMsgItemId);
    }
    
    /**
     * 获取 部件消息项标识  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgItemId(){
        Object objValue = this.get(FIELD_PSCTRLMSGITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgItemIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息项标识
     */
    @JsonIgnore
    public void resetPSCtrlMsgItemId(){
        this.reset(FIELD_PSCTRLMSGITEMID);
    }

    /**
     * 设置 部件消息项标识
     * <P>
     * 等同 {@link #setPSCtrlMsgItemId}
     * @param pSCtrlMsgItemId
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO psctrlmsgitemid(String pSCtrlMsgItemId){
        this.setPSCtrlMsgItemId(pSCtrlMsgItemId);
        return this;
    }

    /**
     * <B>PSCTRLMSGITEMNAME</B>&nbsp;消息标识，指定部件消息项的标识，需在所在部件消息对象中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCTRLMSGITEMNAME = "psctrlmsgitemname";

    /**
     * 设置 消息标识，详细说明：{@link #FIELD_PSCTRLMSGITEMNAME}
     * 
     * @param pSCtrlMsgItemName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGITEMNAME)
    public void setPSCtrlMsgItemName(String pSCtrlMsgItemName){
        this.set(FIELD_PSCTRLMSGITEMNAME, pSCtrlMsgItemName);
    }
    
    /**
     * 获取 消息标识  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgItemName(){
        Object objValue = this.get(FIELD_PSCTRLMSGITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgItemNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息标识
     */
    @JsonIgnore
    public void resetPSCtrlMsgItemName(){
        this.reset(FIELD_PSCTRLMSGITEMNAME);
    }

    /**
     * 设置 消息标识，详细说明：{@link #FIELD_PSCTRLMSGITEMNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgItemName}
     * @param pSCtrlMsgItemName
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO psctrlmsgitemname(String pSCtrlMsgItemName){
        this.setPSCtrlMsgItemName(pSCtrlMsgItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCtrlMsgItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCtrlMsgItemName(strName);
    }

    @JsonIgnore
    public PSCtrlMsgItemDTO name(String strName){
        this.setPSCtrlMsgItemName(strName);
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定消息项所在部件消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>TIMEOUT</B>&nbsp;显示时长，指定消息的显示时长，单位为【毫秒】
     */
    public final static String FIELD_TIMEOUT = "timeout";

    /**
     * 设置 显示时长，详细说明：{@link #FIELD_TIMEOUT}
     * 
     * @param timeout
     * 
     */
    @JsonProperty(FIELD_TIMEOUT)
    public void setTimeout(Integer timeout){
        this.set(FIELD_TIMEOUT, timeout);
    }
    
    /**
     * 获取 显示时长  
     * @return
     */
    @JsonIgnore
    public Integer getTimeout(){
        Object objValue = this.get(FIELD_TIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTimeoutDirty(){
        if(this.contains(FIELD_TIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示时长
     */
    @JsonIgnore
    public void resetTimeout(){
        this.reset(FIELD_TIMEOUT);
    }

    /**
     * 设置 显示时长，详细说明：{@link #FIELD_TIMEOUT}
     * <P>
     * 等同 {@link #setTimeout}
     * @param timeout
     */
    @JsonIgnore
    public PSCtrlMsgItemDTO timeout(Integer timeout){
        this.setTimeout(timeout);
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
    public PSCtrlMsgItemDTO updatedate(Timestamp updateDate){
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
    public PSCtrlMsgItemDTO updateman(String updateMan){
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
    public PSCtrlMsgItemDTO usercat(String userCat){
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
    public PSCtrlMsgItemDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSCtrlMsgItemDTO usertag(String userTag){
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
    public PSCtrlMsgItemDTO usertag2(String userTag2){
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
    public PSCtrlMsgItemDTO usertag3(String userTag3){
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
    public PSCtrlMsgItemDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSCtrlMsgItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSCtrlMsgItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCtrlMsgItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCtrlMsgItemId(strValue);
    }

    @JsonIgnore
    public PSCtrlMsgItemDTO id(String strValue){
        this.setPSCtrlMsgItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSCtrlMsgItemDTO){
            PSCtrlMsgItemDTO dto = (PSCtrlMsgItemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
