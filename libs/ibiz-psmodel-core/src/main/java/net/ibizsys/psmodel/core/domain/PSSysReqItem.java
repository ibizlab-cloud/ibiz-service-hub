package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSREQITEM</B>需求作业单 模型传输对象
 * <P>
 * 
 */
public class PSSysReqItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysReqItem(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AIBUILDMODE</B>&nbsp;AI构建模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AIBuildMode} 
     */
    public final static String FIELD_AIBUILDMODE = "aibuildmode";

    /**
     * 设置 AI构建模式
     * 
     * @param aIBuildMode
     * 
     */
    @JsonProperty(FIELD_AIBUILDMODE)
    public void setAIBuildMode(Integer aIBuildMode){
        this.set(FIELD_AIBUILDMODE, aIBuildMode);
    }
    
    /**
     * 获取 AI构建模式  
     * @return
     */
    @JsonIgnore
    public Integer getAIBuildMode(){
        Object objValue = this.get(FIELD_AIBUILDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 AI构建模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIBuildModeDirty(){
        if(this.contains(FIELD_AIBUILDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI构建模式
     */
    @JsonIgnore
    public void resetAIBuildMode(){
        this.reset(FIELD_AIBUILDMODE);
    }

    /**
     * 设置 AI构建模式
     * <P>
     * 等同 {@link #setAIBuildMode}
     * @param aIBuildMode
     */
    @JsonIgnore
    public PSSysReqItem aibuildmode(Integer aIBuildMode){
        this.setAIBuildMode(aIBuildMode);
        return this;
    }

     /**
     * 设置 AI构建模式
     * <P>
     * 等同 {@link #setAIBuildMode}
     * @param aIBuildMode
     */
    @JsonIgnore
    public PSSysReqItem aibuildmode(net.ibizsys.psmodel.core.util.PSModelEnums.AIBuildMode aIBuildMode){
        if(aIBuildMode == null){
            this.setAIBuildMode(null);
        }
        else{
            this.setAIBuildMode(aIBuildMode.value);
        }
        return this;
    }

    /**
     * <B>AIBUILDPARAMS</B>&nbsp;AI构建参数
     */
    public final static String FIELD_AIBUILDPARAMS = "aibuildparams";

    /**
     * 设置 AI构建参数
     * 
     * @param aIBuildParams
     * 
     */
    @JsonProperty(FIELD_AIBUILDPARAMS)
    public void setAIBuildParams(String aIBuildParams){
        this.set(FIELD_AIBUILDPARAMS, aIBuildParams);
    }
    
    /**
     * 获取 AI构建参数  
     * @return
     */
    @JsonIgnore
    public String getAIBuildParams(){
        Object objValue = this.get(FIELD_AIBUILDPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI构建参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIBuildParamsDirty(){
        if(this.contains(FIELD_AIBUILDPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI构建参数
     */
    @JsonIgnore
    public void resetAIBuildParams(){
        this.reset(FIELD_AIBUILDPARAMS);
    }

    /**
     * 设置 AI构建参数
     * <P>
     * 等同 {@link #setAIBuildParams}
     * @param aIBuildParams
     */
    @JsonIgnore
    public PSSysReqItem aibuildparams(String aIBuildParams){
        this.setAIBuildParams(aIBuildParams);
        return this;
    }

    /**
     * <B>AIBUILDSTATE</B>&nbsp;AI构建状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AIBuildState} 
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
    public PSSysReqItem aibuildstate(Integer aIBuildState){
        this.setAIBuildState(aIBuildState);
        return this;
    }

     /**
     * 设置 AI构建状态
     * <P>
     * 等同 {@link #setAIBuildState}
     * @param aIBuildState
     */
    @JsonIgnore
    public PSSysReqItem aibuildstate(net.ibizsys.psmodel.core.util.PSModelEnums.AIBuildState aIBuildState){
        if(aIBuildState == null){
            this.setAIBuildState(null);
        }
        else{
            this.setAIBuildState(aIBuildState.value);
        }
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
    public PSSysReqItem aichoices(String aIChoices){
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
    public PSSysReqItem aiprompt(String aIPrompt){
        this.setAIPrompt(aIPrompt);
        return this;
    }

    /**
     * <B>AIPROMPTCHOICES</B>&nbsp;AI提示词选择
     */
    public final static String FIELD_AIPROMPTCHOICES = "aipromptchoices";

    /**
     * 设置 AI提示词选择
     * 
     * @param aIPromptChoices
     * 
     */
    @JsonProperty(FIELD_AIPROMPTCHOICES)
    public void setAIPromptChoices(String aIPromptChoices){
        this.set(FIELD_AIPROMPTCHOICES, aIPromptChoices);
    }
    
    /**
     * 获取 AI提示词选择  
     * @return
     */
    @JsonIgnore
    public String getAIPromptChoices(){
        Object objValue = this.get(FIELD_AIPROMPTCHOICES);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI提示词选择 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIPromptChoicesDirty(){
        if(this.contains(FIELD_AIPROMPTCHOICES)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI提示词选择
     */
    @JsonIgnore
    public void resetAIPromptChoices(){
        this.reset(FIELD_AIPROMPTCHOICES);
    }

    /**
     * 设置 AI提示词选择
     * <P>
     * 等同 {@link #setAIPromptChoices}
     * @param aIPromptChoices
     */
    @JsonIgnore
    public PSSysReqItem aipromptchoices(String aIPromptChoices){
        this.setAIPromptChoices(aIPromptChoices);
        return this;
    }

    /**
     * <B>AIPROMPTCHOICES2</B>&nbsp;AI提示词选择2
     */
    public final static String FIELD_AIPROMPTCHOICES2 = "aipromptchoices2";

    /**
     * 设置 AI提示词选择2
     * 
     * @param aIPromptChoices2
     * 
     */
    @JsonProperty(FIELD_AIPROMPTCHOICES2)
    public void setAIPromptChoices2(String aIPromptChoices2){
        this.set(FIELD_AIPROMPTCHOICES2, aIPromptChoices2);
    }
    
    /**
     * 获取 AI提示词选择2  
     * @return
     */
    @JsonIgnore
    public String getAIPromptChoices2(){
        Object objValue = this.get(FIELD_AIPROMPTCHOICES2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI提示词选择2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIPromptChoices2Dirty(){
        if(this.contains(FIELD_AIPROMPTCHOICES2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI提示词选择2
     */
    @JsonIgnore
    public void resetAIPromptChoices2(){
        this.reset(FIELD_AIPROMPTCHOICES2);
    }

    /**
     * 设置 AI提示词选择2
     * <P>
     * 等同 {@link #setAIPromptChoices2}
     * @param aIPromptChoices2
     */
    @JsonIgnore
    public PSSysReqItem aipromptchoices2(String aIPromptChoices2){
        this.setAIPromptChoices2(aIPromptChoices2);
        return this;
    }

    /**
     * <B>AIPROMPTCHOICES3</B>&nbsp;AI提示词选择3
     */
    public final static String FIELD_AIPROMPTCHOICES3 = "aipromptchoices3";

    /**
     * 设置 AI提示词选择3
     * 
     * @param aIPromptChoices3
     * 
     */
    @JsonProperty(FIELD_AIPROMPTCHOICES3)
    public void setAIPromptChoices3(String aIPromptChoices3){
        this.set(FIELD_AIPROMPTCHOICES3, aIPromptChoices3);
    }
    
    /**
     * 获取 AI提示词选择3  
     * @return
     */
    @JsonIgnore
    public String getAIPromptChoices3(){
        Object objValue = this.get(FIELD_AIPROMPTCHOICES3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI提示词选择3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIPromptChoices3Dirty(){
        if(this.contains(FIELD_AIPROMPTCHOICES3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI提示词选择3
     */
    @JsonIgnore
    public void resetAIPromptChoices3(){
        this.reset(FIELD_AIPROMPTCHOICES3);
    }

    /**
     * 设置 AI提示词选择3
     * <P>
     * 等同 {@link #setAIPromptChoices3}
     * @param aIPromptChoices3
     */
    @JsonIgnore
    public PSSysReqItem aipromptchoices3(String aIPromptChoices3){
        this.setAIPromptChoices3(aIPromptChoices3);
        return this;
    }

    /**
     * <B>AIPROMPTCHOICES4</B>&nbsp;AI提示词选择4
     */
    public final static String FIELD_AIPROMPTCHOICES4 = "aipromptchoices4";

    /**
     * 设置 AI提示词选择4
     * 
     * @param aIPromptChoices4
     * 
     */
    @JsonProperty(FIELD_AIPROMPTCHOICES4)
    public void setAIPromptChoices4(String aIPromptChoices4){
        this.set(FIELD_AIPROMPTCHOICES4, aIPromptChoices4);
    }
    
    /**
     * 获取 AI提示词选择4  
     * @return
     */
    @JsonIgnore
    public String getAIPromptChoices4(){
        Object objValue = this.get(FIELD_AIPROMPTCHOICES4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 AI提示词选择4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAIPromptChoices4Dirty(){
        if(this.contains(FIELD_AIPROMPTCHOICES4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 AI提示词选择4
     */
    @JsonIgnore
    public void resetAIPromptChoices4(){
        this.reset(FIELD_AIPROMPTCHOICES4);
    }

    /**
     * 设置 AI提示词选择4
     * <P>
     * 等同 {@link #setAIPromptChoices4}
     * @param aIPromptChoices4
     */
    @JsonIgnore
    public PSSysReqItem aipromptchoices4(String aIPromptChoices4){
        this.setAIPromptChoices4(aIPromptChoices4);
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
    public PSSysReqItem codename(String codeName){
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
    public PSSysReqItem createdate(String createDate){
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
    public PSSysReqItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ITEMSN</B>&nbsp;项编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMSN = "itemsn";

    /**
     * 设置 项编号
     * 
     * @param itemSN
     * 
     */
    @JsonProperty(FIELD_ITEMSN)
    public void setItemSN(String itemSN){
        this.set(FIELD_ITEMSN, itemSN);
    }
    
    /**
     * 获取 项编号  
     * @return
     */
    @JsonIgnore
    public String getItemSN(){
        Object objValue = this.get(FIELD_ITEMSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemSNDirty(){
        if(this.contains(FIELD_ITEMSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项编号
     */
    @JsonIgnore
    public void resetItemSN(){
        this.reset(FIELD_ITEMSN);
    }

    /**
     * 设置 项编号
     * <P>
     * 等同 {@link #setItemSN}
     * @param itemSN
     */
    @JsonIgnore
    public PSSysReqItem itemsn(String itemSN){
        this.setItemSN(itemSN);
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
    public PSSysReqItem itemtag(String itemTag){
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
    public PSSysReqItem itemtag2(String itemTag2){
        this.setItemTag2(itemTag2);
        return this;
    }

    /**
     * <B>ITEMTAG3</B>&nbsp;项标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG3 = "itemtag3";

    /**
     * 设置 项标记3
     * 
     * @param itemTag3
     * 
     */
    @JsonProperty(FIELD_ITEMTAG3)
    public void setItemTag3(String itemTag3){
        this.set(FIELD_ITEMTAG3, itemTag3);
    }
    
    /**
     * 获取 项标记3  
     * @return
     */
    @JsonIgnore
    public String getItemTag3(){
        Object objValue = this.get(FIELD_ITEMTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag3Dirty(){
        if(this.contains(FIELD_ITEMTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记3
     */
    @JsonIgnore
    public void resetItemTag3(){
        this.reset(FIELD_ITEMTAG3);
    }

    /**
     * 设置 项标记3
     * <P>
     * 等同 {@link #setItemTag3}
     * @param itemTag3
     */
    @JsonIgnore
    public PSSysReqItem itemtag3(String itemTag3){
        this.setItemTag3(itemTag3);
        return this;
    }

    /**
     * <B>ITEMTAG4</B>&nbsp;项标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_ITEMTAG4 = "itemtag4";

    /**
     * 设置 项标记4
     * 
     * @param itemTag4
     * 
     */
    @JsonProperty(FIELD_ITEMTAG4)
    public void setItemTag4(String itemTag4){
        this.set(FIELD_ITEMTAG4, itemTag4);
    }
    
    /**
     * 获取 项标记4  
     * @return
     */
    @JsonIgnore
    public String getItemTag4(){
        Object objValue = this.get(FIELD_ITEMTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTag4Dirty(){
        if(this.contains(FIELD_ITEMTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标记4
     */
    @JsonIgnore
    public void resetItemTag4(){
        this.reset(FIELD_ITEMTAG4);
    }

    /**
     * 设置 项标记4
     * <P>
     * 等同 {@link #setItemTag4}
     * @param itemTag4
     */
    @JsonIgnore
    public PSSysReqItem itemtag4(String itemTag4){
        this.setItemTag4(itemTag4);
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;项类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SysReqItemType} 
     */
    public final static String FIELD_ITEMTYPE = "itemtype";

    /**
     * 设置 项类型
     * 
     * @param itemType
     * 
     */
    @JsonProperty(FIELD_ITEMTYPE)
    public void setItemType(String itemType){
        this.set(FIELD_ITEMTYPE, itemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getItemType(){
        Object objValue = this.get(FIELD_ITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTypeDirty(){
        if(this.contains(FIELD_ITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetItemType(){
        this.reset(FIELD_ITEMTYPE);
    }

    /**
     * 设置 项类型
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysReqItem itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

     /**
     * 设置 项类型
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSSysReqItem itemtype(net.ibizsys.psmodel.core.util.PSModelEnums.SysReqItemType itemType){
        if(itemType == null){
            this.setItemType(null);
        }
        else{
            this.setItemType(itemType.value);
        }
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
    public PSSysReqItem memo(String memo){
        this.setMemo(memo);
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
    public PSSysReqItem ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSSYSREQITEMID</B>&nbsp;父需求项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PPSSYSREQITEMID = "ppssysreqitemid";

    /**
     * 设置 父需求项
     * 
     * @param pPSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PPSSYSREQITEMID)
    public void setPPSSysReqItemId(String pPSSysReqItemId){
        this.set(FIELD_PPSSYSREQITEMID, pPSSysReqItemId);
    }
    
    /**
     * 获取 父需求项  
     * @return
     */
    @JsonIgnore
    public String getPPSSysReqItemId(){
        Object objValue = this.get(FIELD_PPSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PPSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父需求项
     */
    @JsonIgnore
    public void resetPPSSysReqItemId(){
        this.reset(FIELD_PPSSYSREQITEMID);
    }

    /**
     * 设置 父需求项
     * <P>
     * 等同 {@link #setPPSSysReqItemId}
     * @param pPSSysReqItemId
     */
    @JsonIgnore
    public PSSysReqItem ppssysreqitemid(String pPSSysReqItemId){
        this.setPPSSysReqItemId(pPSSysReqItemId);
        return this;
    }

    /**
     * 设置 父需求项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSSysReqItem ppssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPPSSysReqItemId(null);
            this.setPPSSysReqItemName(null);
        }
        else{
            this.setPPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PPSSYSREQITEMNAME</B>&nbsp;父需求项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSREQITEMID}
     */
    public final static String FIELD_PPSSYSREQITEMNAME = "ppssysreqitemname";

    /**
     * 设置 父需求项
     * 
     * @param pPSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PPSSYSREQITEMNAME)
    public void setPPSSysReqItemName(String pPSSysReqItemName){
        this.set(FIELD_PPSSYSREQITEMNAME, pPSSysReqItemName);
    }
    
    /**
     * 获取 父需求项  
     * @return
     */
    @JsonIgnore
    public String getPPSSysReqItemName(){
        Object objValue = this.get(FIELD_PPSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父需求项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PPSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父需求项
     */
    @JsonIgnore
    public void resetPPSSysReqItemName(){
        this.reset(FIELD_PPSSYSREQITEMNAME);
    }

    /**
     * 设置 父需求项
     * <P>
     * 等同 {@link #setPPSSysReqItemName}
     * @param pPSSysReqItemName
     */
    @JsonIgnore
    public PSSysReqItem ppssysreqitemname(String pPSSysReqItemName){
        this.setPPSSysReqItemName(pPSSysReqItemName);
        return this;
    }

    /**
     * <B>PSDEVPRDID</B>&nbsp;开发产品
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVPRDID = "psdevprdid";

    /**
     * 设置 开发产品
     * 
     * @param pSDevPrdId
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDID)
    public void setPSDevPrdId(String pSDevPrdId){
        this.set(FIELD_PSDEVPRDID, pSDevPrdId);
    }
    
    /**
     * 获取 开发产品  
     * @return
     */
    @JsonIgnore
    public String getPSDevPrdId(){
        Object objValue = this.get(FIELD_PSDEVPRDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发产品 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevPrdIdDirty(){
        if(this.contains(FIELD_PSDEVPRDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发产品
     */
    @JsonIgnore
    public void resetPSDevPrdId(){
        this.reset(FIELD_PSDEVPRDID);
    }

    /**
     * 设置 开发产品
     * <P>
     * 等同 {@link #setPSDevPrdId}
     * @param pSDevPrdId
     */
    @JsonIgnore
    public PSSysReqItem psdevprdid(String pSDevPrdId){
        this.setPSDevPrdId(pSDevPrdId);
        return this;
    }

    /**
     * <B>PSDEVPRDNAME</B>&nbsp;开发产品
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVPRDID}
     */
    public final static String FIELD_PSDEVPRDNAME = "psdevprdname";

    /**
     * 设置 开发产品
     * 
     * @param pSDevPrdName
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDNAME)
    public void setPSDevPrdName(String pSDevPrdName){
        this.set(FIELD_PSDEVPRDNAME, pSDevPrdName);
    }
    
    /**
     * 获取 开发产品  
     * @return
     */
    @JsonIgnore
    public String getPSDevPrdName(){
        Object objValue = this.get(FIELD_PSDEVPRDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发产品 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevPrdNameDirty(){
        if(this.contains(FIELD_PSDEVPRDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发产品
     */
    @JsonIgnore
    public void resetPSDevPrdName(){
        this.reset(FIELD_PSDEVPRDNAME);
    }

    /**
     * 设置 开发产品
     * <P>
     * 等同 {@link #setPSDevPrdName}
     * @param pSDevPrdName
     */
    @JsonIgnore
    public PSSysReqItem psdevprdname(String pSDevPrdName){
        this.setPSDevPrdName(pSDevPrdName);
        return this;
    }

    /**
     * <B>PSDEVPRDSPECID</B>&nbsp;产品规范
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVPRDSPECID = "psdevprdspecid";

    /**
     * 设置 产品规范
     * 
     * @param pSDevPrdSpecId
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDSPECID)
    public void setPSDevPrdSpecId(String pSDevPrdSpecId){
        this.set(FIELD_PSDEVPRDSPECID, pSDevPrdSpecId);
    }
    
    /**
     * 获取 产品规范  
     * @return
     */
    @JsonIgnore
    public String getPSDevPrdSpecId(){
        Object objValue = this.get(FIELD_PSDEVPRDSPECID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品规范 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevPrdSpecIdDirty(){
        if(this.contains(FIELD_PSDEVPRDSPECID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品规范
     */
    @JsonIgnore
    public void resetPSDevPrdSpecId(){
        this.reset(FIELD_PSDEVPRDSPECID);
    }

    /**
     * 设置 产品规范
     * <P>
     * 等同 {@link #setPSDevPrdSpecId}
     * @param pSDevPrdSpecId
     */
    @JsonIgnore
    public PSSysReqItem psdevprdspecid(String pSDevPrdSpecId){
        this.setPSDevPrdSpecId(pSDevPrdSpecId);
        return this;
    }

    /**
     * <B>PSDEVPRDSPECNAME</B>&nbsp;产品规范
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVPRDSPECID}
     */
    public final static String FIELD_PSDEVPRDSPECNAME = "psdevprdspecname";

    /**
     * 设置 产品规范
     * 
     * @param pSDevPrdSpecName
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDSPECNAME)
    public void setPSDevPrdSpecName(String pSDevPrdSpecName){
        this.set(FIELD_PSDEVPRDSPECNAME, pSDevPrdSpecName);
    }
    
    /**
     * 获取 产品规范  
     * @return
     */
    @JsonIgnore
    public String getPSDevPrdSpecName(){
        Object objValue = this.get(FIELD_PSDEVPRDSPECNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品规范 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevPrdSpecNameDirty(){
        if(this.contains(FIELD_PSDEVPRDSPECNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品规范
     */
    @JsonIgnore
    public void resetPSDevPrdSpecName(){
        this.reset(FIELD_PSDEVPRDSPECNAME);
    }

    /**
     * 设置 产品规范
     * <P>
     * 等同 {@link #setPSDevPrdSpecName}
     * @param pSDevPrdSpecName
     */
    @JsonIgnore
    public PSSysReqItem psdevprdspecname(String pSDevPrdSpecName){
        this.setPSDevPrdSpecName(pSDevPrdSpecName);
        return this;
    }

    /**
     * <B>PSDEVPRDVERID</B>&nbsp;开发产品主干
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVPRDVERID = "psdevprdverid";

    /**
     * 设置 开发产品主干
     * 
     * @param pSDevPrdVerId
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDVERID)
    public void setPSDevPrdVerId(String pSDevPrdVerId){
        this.set(FIELD_PSDEVPRDVERID, pSDevPrdVerId);
    }
    
    /**
     * 获取 开发产品主干  
     * @return
     */
    @JsonIgnore
    public String getPSDevPrdVerId(){
        Object objValue = this.get(FIELD_PSDEVPRDVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发产品主干 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevPrdVerIdDirty(){
        if(this.contains(FIELD_PSDEVPRDVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发产品主干
     */
    @JsonIgnore
    public void resetPSDevPrdVerId(){
        this.reset(FIELD_PSDEVPRDVERID);
    }

    /**
     * 设置 开发产品主干
     * <P>
     * 等同 {@link #setPSDevPrdVerId}
     * @param pSDevPrdVerId
     */
    @JsonIgnore
    public PSSysReqItem psdevprdverid(String pSDevPrdVerId){
        this.setPSDevPrdVerId(pSDevPrdVerId);
        return this;
    }

    /**
     * <B>PSDEVPRDVERNAME</B>&nbsp;开发产品主干
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVPRDVERID}
     */
    public final static String FIELD_PSDEVPRDVERNAME = "psdevprdvername";

    /**
     * 设置 开发产品主干
     * 
     * @param pSDevPrdVerName
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDVERNAME)
    public void setPSDevPrdVerName(String pSDevPrdVerName){
        this.set(FIELD_PSDEVPRDVERNAME, pSDevPrdVerName);
    }
    
    /**
     * 获取 开发产品主干  
     * @return
     */
    @JsonIgnore
    public String getPSDevPrdVerName(){
        Object objValue = this.get(FIELD_PSDEVPRDVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发产品主干 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevPrdVerNameDirty(){
        if(this.contains(FIELD_PSDEVPRDVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发产品主干
     */
    @JsonIgnore
    public void resetPSDevPrdVerName(){
        this.reset(FIELD_PSDEVPRDVERNAME);
    }

    /**
     * 设置 开发产品主干
     * <P>
     * 等同 {@link #setPSDevPrdVerName}
     * @param pSDevPrdVerName
     */
    @JsonIgnore
    public PSSysReqItem psdevprdvername(String pSDevPrdVerName){
        this.setPSDevPrdVerName(pSDevPrdVerName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统需求项所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSModule} 
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
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
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULEID}
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysReqItem psmoduleid(String pSModuleId){
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
    public PSSysReqItem psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统需求项所在的系统模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
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
     * 设置 系统模块，详细说明：{@link #FIELD_PSMODULENAME}
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysReqItem psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求项标识
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求项标识  
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
     * 判断 系统设计需求项标识 是否指定值，包括空值
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
     * 重置 系统设计需求项标识
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求项标识
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSSysReqItem pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 标题
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 标题  
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
     * 判断 标题 是否指定值，包括空值
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
     * 重置 标题
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 标题
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSSysReqItem pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysReqItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysReqItemName(strName);
    }

    @JsonIgnore
    public PSSysReqItem name(String strName){
        this.setPSSysReqItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSREQMODULEID</B>&nbsp;需求模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqModule} 
     */
    public final static String FIELD_PSSYSREQMODULEID = "pssysreqmoduleid";

    /**
     * 设置 需求模块
     * 
     * @param pSSysReqModuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQMODULEID)
    public void setPSSysReqModuleId(String pSSysReqModuleId){
        this.set(FIELD_PSSYSREQMODULEID, pSSysReqModuleId);
    }
    
    /**
     * 获取 需求模块  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqModuleId(){
        Object objValue = this.get(FIELD_PSSYSREQMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqModuleIdDirty(){
        if(this.contains(FIELD_PSSYSREQMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求模块
     */
    @JsonIgnore
    public void resetPSSysReqModuleId(){
        this.reset(FIELD_PSSYSREQMODULEID);
    }

    /**
     * 设置 需求模块
     * <P>
     * 等同 {@link #setPSSysReqModuleId}
     * @param pSSysReqModuleId
     */
    @JsonIgnore
    public PSSysReqItem pssysreqmoduleid(String pSSysReqModuleId){
        this.setPSSysReqModuleId(pSSysReqModuleId);
        return this;
    }

    /**
     * 设置 需求模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqModuleId}
     * @param pSSysReqModule 引用对象
     */
    @JsonIgnore
    public PSSysReqItem pssysreqmoduleid(PSSysReqModule pSSysReqModule){
        if(pSSysReqModule == null){
            this.setPSSysReqModuleId(null);
            this.setPSSysReqModuleName(null);
        }
        else{
            this.setPSSysReqModuleId(pSSysReqModule.getPSSysReqModuleId());
            this.setPSSysReqModuleName(pSSysReqModule.getPSSysReqModuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQMODULENAME</B>&nbsp;需求模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQMODULEID}
     */
    public final static String FIELD_PSSYSREQMODULENAME = "pssysreqmodulename";

    /**
     * 设置 需求模块
     * 
     * @param pSSysReqModuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQMODULENAME)
    public void setPSSysReqModuleName(String pSSysReqModuleName){
        this.set(FIELD_PSSYSREQMODULENAME, pSSysReqModuleName);
    }
    
    /**
     * 获取 需求模块  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqModuleName(){
        Object objValue = this.get(FIELD_PSSYSREQMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqModuleNameDirty(){
        if(this.contains(FIELD_PSSYSREQMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求模块
     */
    @JsonIgnore
    public void resetPSSysReqModuleName(){
        this.reset(FIELD_PSSYSREQMODULENAME);
    }

    /**
     * 设置 需求模块
     * <P>
     * 等同 {@link #setPSSysReqModuleName}
     * @param pSSysReqModuleName
     */
    @JsonIgnore
    public PSSysReqItem pssysreqmodulename(String pSSysReqModuleName){
        this.setPSSysReqModuleName(pSSysReqModuleName);
        return this;
    }

    /**
     * <B>PSSYSUSECASEID</B>&nbsp;系统用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUseCase} 
     */
    public final static String FIELD_PSSYSUSECASEID = "pssysusecaseid";

    /**
     * 设置 系统用例
     * 
     * @param pSSysUseCaseId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASEID)
    public void setPSSysUseCaseId(String pSSysUseCaseId){
        this.set(FIELD_PSSYSUSECASEID, pSSysUseCaseId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercaseid", pSSysUseCaseId);
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseId(){
        Object objValue = this.get(FIELD_PSSYSUSECASEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercaseid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty(){
        if(this.contains(FIELD_PSSYSUSECASEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercaseid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercaseid");
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSSysReqItem pssysusecaseid(String pSSysUseCaseId){
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    /**
     * 设置 系统用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCase 引用对象
     */
    @JsonIgnore
    public PSSysReqItem pssysusecaseid(PSSysUseCase pSSysUseCase){
        if(pSSysUseCase == null){
            this.setPSSysUseCaseId(null);
            this.setPSSysUseCaseName(null);
        }
        else{
            this.setPSSysUseCaseId(pSSysUseCase.getPSSysUseCaseId());
            this.setPSSysUseCaseName(pSSysUseCase.getPSSysUseCaseName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseId(){
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseId(String pSSysUserCaseId){
        this.setPSSysUseCaseId(pSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseIdDirty(){
        return this.isPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseId(){
        this.resetPSSysUseCaseId();
    }

    /**
     * <B>PSSYSUSECASENAME</B>&nbsp;系统用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSECASEID}
     */
    public final static String FIELD_PSSYSUSECASENAME = "pssysusecasename";

    /**
     * 设置 系统用例
     * 
     * @param pSSysUseCaseName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASENAME)
    public void setPSSysUseCaseName(String pSSysUseCaseName){
        this.set(FIELD_PSSYSUSECASENAME, pSSysUseCaseName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercasename", pSSysUseCaseName);
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseName(){
        Object objValue = this.get(FIELD_PSSYSUSECASENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercasename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty(){
        if(this.contains(FIELD_PSSYSUSECASENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercasename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasename");
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSSysReqItem pssysusecasename(String pSSysUseCaseName){
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseName(){
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseName(String pSSysUserCaseName){
        this.setPSSysUseCaseName(pSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseNameDirty(){
        return this.isPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseName(){
        this.resetPSSysUseCaseName();
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
    public PSSysReqItem reqcontent(String reqContent){
        this.setReqContent(reqContent);
        return this;
    }

    /**
     * <B>REQMODEL</B>&nbsp;需求模型
     */
    public final static String FIELD_REQMODEL = "reqmodel";

    /**
     * 设置 需求模型
     * 
     * @param reqModel
     * 
     */
    @JsonProperty(FIELD_REQMODEL)
    public void setReqModel(String reqModel){
        this.set(FIELD_REQMODEL, reqModel);
    }
    
    /**
     * 获取 需求模型  
     * @return
     */
    @JsonIgnore
    public String getReqModel(){
        Object objValue = this.get(FIELD_REQMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReqModelDirty(){
        if(this.contains(FIELD_REQMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求模型
     */
    @JsonIgnore
    public void resetReqModel(){
        this.reset(FIELD_REQMODEL);
    }

    /**
     * 设置 需求模型
     * <P>
     * 等同 {@link #setReqModel}
     * @param reqModel
     */
    @JsonIgnore
    public PSSysReqItem reqmodel(String reqModel){
        this.setReqModel(reqModel);
        return this;
    }

    /**
     * <B>REQMODELTYPE</B>&nbsp;需求模型类型
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_REQMODELTYPE = "reqmodeltype";

    /**
     * 设置 需求模型类型
     * 
     * @param reqModelType
     * 
     */
    @JsonProperty(FIELD_REQMODELTYPE)
    public void setReqModelType(String reqModelType){
        this.set(FIELD_REQMODELTYPE, reqModelType);
    }
    
    /**
     * 获取 需求模型类型  
     * @return
     */
    @JsonIgnore
    public String getReqModelType(){
        Object objValue = this.get(FIELD_REQMODELTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 需求模型类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReqModelTypeDirty(){
        if(this.contains(FIELD_REQMODELTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需求模型类型
     */
    @JsonIgnore
    public void resetReqModelType(){
        this.reset(FIELD_REQMODELTYPE);
    }

    /**
     * 设置 需求模型类型
     * <P>
     * 等同 {@link #setReqModelType}
     * @param reqModelType
     */
    @JsonIgnore
    public PSSysReqItem reqmodeltype(String reqModelType){
        this.setReqModelType(reqModelType);
        return this;
    }

    /**
     * <B>SUBJECT</B>&nbsp;标题
     * <P>
     * 字符串：最大长度 2000
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
    public PSSysReqItem subject(String subject){
        this.setSubject(subject);
        return this;
    }

    /**
     * <B>SYNCMODELMODE</B>&nbsp;同步模型模式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_SYNCMODELMODE = "syncmodelmode";

    /**
     * 设置 同步模型模式
     * 
     * @param syncModelMode
     * 
     */
    @JsonProperty(FIELD_SYNCMODELMODE)
    public void setSyncModelMode(String syncModelMode){
        this.set(FIELD_SYNCMODELMODE, syncModelMode);
    }
    
    /**
     * 获取 同步模型模式  
     * @return
     */
    @JsonIgnore
    public String getSyncModelMode(){
        Object objValue = this.get(FIELD_SYNCMODELMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 同步模型模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSyncModelModeDirty(){
        if(this.contains(FIELD_SYNCMODELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 同步模型模式
     */
    @JsonIgnore
    public void resetSyncModelMode(){
        this.reset(FIELD_SYNCMODELMODE);
    }

    /**
     * 设置 同步模型模式
     * <P>
     * 等同 {@link #setSyncModelMode}
     * @param syncModelMode
     */
    @JsonIgnore
    public PSSysReqItem syncmodelmode(String syncModelMode){
        this.setSyncModelMode(syncModelMode);
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
    public PSSysReqItem tags(String tags){
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
    public PSSysReqItem updatedate(String updateDate){
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
    public PSSysReqItem updateman(String updateMan){
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
    public PSSysReqItem usercat(String userCat){
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
    public PSSysReqItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysReqItem usertag(String userTag){
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
    public PSSysReqItem usertag2(String userTag2){
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
    public PSSysReqItem usertag3(String userTag3){
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
    public PSSysReqItem usertag4(String userTag4){
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
    public PSSysReqItem validflag(Integer validFlag){
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
    public PSSysReqItem validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSSysReqItem ver(Integer ver){
        this.setVer(ver);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysReqItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysReqItemId(strValue);
    }

    @JsonIgnore
    public PSSysReqItem id(String strValue){
        this.setPSSysReqItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysReqItem){
            PSSysReqItem model = (PSSysReqItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
