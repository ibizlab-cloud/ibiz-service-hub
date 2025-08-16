package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSREQMODULE</B>系统需求模块 模型传输对象
 * <P>
 * 
 */
public class PSSysReqModule extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysReqModule(){
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
    public PSSysReqModule aibuildmode(Integer aIBuildMode){
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
    public PSSysReqModule aibuildmode(net.ibizsys.psmodel.core.util.PSModelEnums.AIBuildMode aIBuildMode){
        if(aIBuildMode == null){
            this.setAIBuildMode(null);
        }
        else{
            this.setAIBuildMode(aIBuildMode.value);
        }
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
    public PSSysReqModule aibuildstate(Integer aIBuildState){
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
    public PSSysReqModule aibuildstate(net.ibizsys.psmodel.core.util.PSModelEnums.AIBuildState aIBuildState){
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
    public PSSysReqModule aichoices(String aIChoices){
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
    public PSSysReqModule aiprompt(String aIPrompt){
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
    public PSSysReqModule aipromptchoices(String aIPromptChoices){
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
    public PSSysReqModule aipromptchoices2(String aIPromptChoices2){
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
    public PSSysReqModule aipromptchoices3(String aIPromptChoices3){
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
    public PSSysReqModule aipromptchoices4(String aIPromptChoices4){
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
    public PSSysReqModule codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;内容
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
    public PSSysReqModule content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型
     * 
     * @param contentType
     * 
     */
    @JsonProperty(FIELD_CONTENTTYPE)
    public void setContentType(String contentType){
        this.set(FIELD_CONTENTTYPE, contentType);
    }
    
    /**
     * 获取 内容类型  
     * @return
     */
    @JsonIgnore
    public String getContentType(){
        Object objValue = this.get(FIELD_CONTENTTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTypeDirty(){
        if(this.contains(FIELD_CONTENTTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容类型
     */
    @JsonIgnore
    public void resetContentType(){
        this.reset(FIELD_CONTENTTYPE);
    }

    /**
     * 设置 内容类型
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysReqModule contenttype(String contentType){
        this.setContentType(contentType);
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
    public PSSysReqModule createdate(String createDate){
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
    public PSSysReqModule createman(String createMan){
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
    public PSSysReqModule memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODULESN</B>&nbsp;模块编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_MODULESN = "modulesn";

    /**
     * 设置 模块编号
     * 
     * @param moduleSN
     * 
     */
    @JsonProperty(FIELD_MODULESN)
    public void setModuleSN(String moduleSN){
        this.set(FIELD_MODULESN, moduleSN);
    }
    
    /**
     * 获取 模块编号  
     * @return
     */
    @JsonIgnore
    public String getModuleSN(){
        Object objValue = this.get(FIELD_MODULESN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleSNDirty(){
        if(this.contains(FIELD_MODULESN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块编号
     */
    @JsonIgnore
    public void resetModuleSN(){
        this.reset(FIELD_MODULESN);
    }

    /**
     * 设置 模块编号
     * <P>
     * 等同 {@link #setModuleSN}
     * @param moduleSN
     */
    @JsonIgnore
    public PSSysReqModule modulesn(String moduleSN){
        this.setModuleSN(moduleSN);
        return this;
    }

    /**
     * <B>MODULETAG</B>&nbsp;模块标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODULETAG = "moduletag";

    /**
     * 设置 模块标记
     * 
     * @param moduleTag
     * 
     */
    @JsonProperty(FIELD_MODULETAG)
    public void setModuleTag(String moduleTag){
        this.set(FIELD_MODULETAG, moduleTag);
    }
    
    /**
     * 获取 模块标记  
     * @return
     */
    @JsonIgnore
    public String getModuleTag(){
        Object objValue = this.get(FIELD_MODULETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTagDirty(){
        if(this.contains(FIELD_MODULETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记
     */
    @JsonIgnore
    public void resetModuleTag(){
        this.reset(FIELD_MODULETAG);
    }

    /**
     * 设置 模块标记
     * <P>
     * 等同 {@link #setModuleTag}
     * @param moduleTag
     */
    @JsonIgnore
    public PSSysReqModule moduletag(String moduleTag){
        this.setModuleTag(moduleTag);
        return this;
    }

    /**
     * <B>MODULETAG2</B>&nbsp;模块标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODULETAG2 = "moduletag2";

    /**
     * 设置 模块标记2
     * 
     * @param moduleTag2
     * 
     */
    @JsonProperty(FIELD_MODULETAG2)
    public void setModuleTag2(String moduleTag2){
        this.set(FIELD_MODULETAG2, moduleTag2);
    }
    
    /**
     * 获取 模块标记2  
     * @return
     */
    @JsonIgnore
    public String getModuleTag2(){
        Object objValue = this.get(FIELD_MODULETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTag2Dirty(){
        if(this.contains(FIELD_MODULETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记2
     */
    @JsonIgnore
    public void resetModuleTag2(){
        this.reset(FIELD_MODULETAG2);
    }

    /**
     * 设置 模块标记2
     * <P>
     * 等同 {@link #setModuleTag2}
     * @param moduleTag2
     */
    @JsonIgnore
    public PSSysReqModule moduletag2(String moduleTag2){
        this.setModuleTag2(moduleTag2);
        return this;
    }

    /**
     * <B>MODULETAG3</B>&nbsp;模块标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODULETAG3 = "moduletag3";

    /**
     * 设置 模块标记3
     * 
     * @param moduleTag3
     * 
     */
    @JsonProperty(FIELD_MODULETAG3)
    public void setModuleTag3(String moduleTag3){
        this.set(FIELD_MODULETAG3, moduleTag3);
    }
    
    /**
     * 获取 模块标记3  
     * @return
     */
    @JsonIgnore
    public String getModuleTag3(){
        Object objValue = this.get(FIELD_MODULETAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTag3Dirty(){
        if(this.contains(FIELD_MODULETAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记3
     */
    @JsonIgnore
    public void resetModuleTag3(){
        this.reset(FIELD_MODULETAG3);
    }

    /**
     * 设置 模块标记3
     * <P>
     * 等同 {@link #setModuleTag3}
     * @param moduleTag3
     */
    @JsonIgnore
    public PSSysReqModule moduletag3(String moduleTag3){
        this.setModuleTag3(moduleTag3);
        return this;
    }

    /**
     * <B>MODULETAG4</B>&nbsp;模块标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_MODULETAG4 = "moduletag4";

    /**
     * 设置 模块标记4
     * 
     * @param moduleTag4
     * 
     */
    @JsonProperty(FIELD_MODULETAG4)
    public void setModuleTag4(String moduleTag4){
        this.set(FIELD_MODULETAG4, moduleTag4);
    }
    
    /**
     * 获取 模块标记4  
     * @return
     */
    @JsonIgnore
    public String getModuleTag4(){
        Object objValue = this.get(FIELD_MODULETAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTag4Dirty(){
        if(this.contains(FIELD_MODULETAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标记4
     */
    @JsonIgnore
    public void resetModuleTag4(){
        this.reset(FIELD_MODULETAG4);
    }

    /**
     * 设置 模块标记4
     * <P>
     * 等同 {@link #setModuleTag4}
     * @param moduleTag4
     */
    @JsonIgnore
    public PSSysReqModule moduletag4(String moduleTag4){
        this.setModuleTag4(moduleTag4);
        return this;
    }

    /**
     * <B>MODULETYPE</B>&nbsp;模块类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_MODULETYPE = "moduletype";

    /**
     * 设置 模块类型
     * 
     * @param moduleType
     * 
     */
    @JsonProperty(FIELD_MODULETYPE)
    public void setModuleType(String moduleType){
        this.set(FIELD_MODULETYPE, moduleType);
    }
    
    /**
     * 获取 模块类型  
     * @return
     */
    @JsonIgnore
    public String getModuleType(){
        Object objValue = this.get(FIELD_MODULETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModuleTypeDirty(){
        if(this.contains(FIELD_MODULETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块类型
     */
    @JsonIgnore
    public void resetModuleType(){
        this.reset(FIELD_MODULETYPE);
    }

    /**
     * 设置 模块类型
     * <P>
     * 等同 {@link #setModuleType}
     * @param moduleType
     */
    @JsonIgnore
    public PSSysReqModule moduletype(String moduleType){
        this.setModuleType(moduleType);
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
    public PSSysReqModule ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSSYSREQMODULEID</B>&nbsp;父需求模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqModule} 
     */
    public final static String FIELD_PPSSYSREQMODULEID = "ppssysreqmoduleid";

    /**
     * 设置 父需求模块
     * 
     * @param pPSSysReqModuleId
     * 
     */
    @JsonProperty(FIELD_PPSSYSREQMODULEID)
    public void setPPSSysReqModuleId(String pPSSysReqModuleId){
        this.set(FIELD_PPSSYSREQMODULEID, pPSSysReqModuleId);
    }
    
    /**
     * 获取 父需求模块  
     * @return
     */
    @JsonIgnore
    public String getPPSSysReqModuleId(){
        Object objValue = this.get(FIELD_PPSSYSREQMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父需求模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysReqModuleIdDirty(){
        if(this.contains(FIELD_PPSSYSREQMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父需求模块
     */
    @JsonIgnore
    public void resetPPSSysReqModuleId(){
        this.reset(FIELD_PPSSYSREQMODULEID);
    }

    /**
     * 设置 父需求模块
     * <P>
     * 等同 {@link #setPPSSysReqModuleId}
     * @param pPSSysReqModuleId
     */
    @JsonIgnore
    public PSSysReqModule ppssysreqmoduleid(String pPSSysReqModuleId){
        this.setPPSSysReqModuleId(pPSSysReqModuleId);
        return this;
    }

    /**
     * 设置 父需求模块，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysReqModuleId}
     * @param pSSysReqModule 引用对象
     */
    @JsonIgnore
    public PSSysReqModule ppssysreqmoduleid(PSSysReqModule pSSysReqModule){
        if(pSSysReqModule == null){
            this.setPPSSysReqModuleId(null);
            this.setPPSSysReqModuleName(null);
        }
        else{
            this.setPPSSysReqModuleId(pSSysReqModule.getPSSysReqModuleId());
            this.setPPSSysReqModuleName(pSSysReqModule.getPSSysReqModuleName());
        }
        return this;
    }

    /**
     * <B>PPSSYSREQMODULENAME</B>&nbsp;父需求模块
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSREQMODULEID}
     */
    public final static String FIELD_PPSSYSREQMODULENAME = "ppssysreqmodulename";

    /**
     * 设置 父需求模块
     * 
     * @param pPSSysReqModuleName
     * 
     */
    @JsonProperty(FIELD_PPSSYSREQMODULENAME)
    public void setPPSSysReqModuleName(String pPSSysReqModuleName){
        this.set(FIELD_PPSSYSREQMODULENAME, pPSSysReqModuleName);
    }
    
    /**
     * 获取 父需求模块  
     * @return
     */
    @JsonIgnore
    public String getPPSSysReqModuleName(){
        Object objValue = this.get(FIELD_PPSSYSREQMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父需求模块 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysReqModuleNameDirty(){
        if(this.contains(FIELD_PPSSYSREQMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父需求模块
     */
    @JsonIgnore
    public void resetPPSSysReqModuleName(){
        this.reset(FIELD_PPSSYSREQMODULENAME);
    }

    /**
     * 设置 父需求模块
     * <P>
     * 等同 {@link #setPPSSysReqModuleName}
     * @param pPSSysReqModuleName
     */
    @JsonIgnore
    public PSSysReqModule ppssysreqmodulename(String pPSSysReqModuleName){
        this.setPPSSysReqModuleName(pPSSysReqModuleName);
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
    public PSSysReqModule psdevprdid(String pSDevPrdId){
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
    public PSSysReqModule psdevprdname(String pSDevPrdName){
        this.setPSDevPrdName(pSDevPrdName);
        return this;
    }

    /**
     * <B>PSDEVPRDVERID</B>&nbsp;开发产品版本
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVPRDVERID = "psdevprdverid";

    /**
     * 设置 开发产品版本
     * 
     * @param pSDevPrdVerId
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDVERID)
    public void setPSDevPrdVerId(String pSDevPrdVerId){
        this.set(FIELD_PSDEVPRDVERID, pSDevPrdVerId);
    }
    
    /**
     * 获取 开发产品版本  
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
     * 判断 开发产品版本 是否指定值，包括空值
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
     * 重置 开发产品版本
     */
    @JsonIgnore
    public void resetPSDevPrdVerId(){
        this.reset(FIELD_PSDEVPRDVERID);
    }

    /**
     * 设置 开发产品版本
     * <P>
     * 等同 {@link #setPSDevPrdVerId}
     * @param pSDevPrdVerId
     */
    @JsonIgnore
    public PSSysReqModule psdevprdverid(String pSDevPrdVerId){
        this.setPSDevPrdVerId(pSDevPrdVerId);
        return this;
    }

    /**
     * <B>PSDEVPRDVERNAME</B>&nbsp;开发产品版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVPRDVERID}
     */
    public final static String FIELD_PSDEVPRDVERNAME = "psdevprdvername";

    /**
     * 设置 开发产品版本
     * 
     * @param pSDevPrdVerName
     * 
     */
    @JsonProperty(FIELD_PSDEVPRDVERNAME)
    public void setPSDevPrdVerName(String pSDevPrdVerName){
        this.set(FIELD_PSDEVPRDVERNAME, pSDevPrdVerName);
    }
    
    /**
     * 获取 开发产品版本  
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
     * 判断 开发产品版本 是否指定值，包括空值
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
     * 重置 开发产品版本
     */
    @JsonIgnore
    public void resetPSDevPrdVerName(){
        this.reset(FIELD_PSDEVPRDVERNAME);
    }

    /**
     * 设置 开发产品版本
     * <P>
     * 等同 {@link #setPSDevPrdVerName}
     * @param pSDevPrdVerName
     */
    @JsonIgnore
    public PSSysReqModule psdevprdvername(String pSDevPrdVerName){
        this.setPSDevPrdVerName(pSDevPrdVerName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统需求模块所在的系统模块
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
    public PSSysReqModule psmoduleid(String pSModuleId){
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
    public PSSysReqModule psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统需求模块所在的系统模块
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
    public PSSysReqModule psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSACTORID</B>&nbsp;操作者
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysActor} 
     */
    public final static String FIELD_PSSYSACTORID = "pssysactorid";

    /**
     * 设置 操作者
     * 
     * @param pSSysActorId
     * 
     */
    @JsonProperty(FIELD_PSSYSACTORID)
    public void setPSSysActorId(String pSSysActorId){
        this.set(FIELD_PSSYSACTORID, pSSysActorId);
    }
    
    /**
     * 获取 操作者  
     * @return
     */
    @JsonIgnore
    public String getPSSysActorId(){
        Object objValue = this.get(FIELD_PSSYSACTORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysActorIdDirty(){
        if(this.contains(FIELD_PSSYSACTORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作者
     */
    @JsonIgnore
    public void resetPSSysActorId(){
        this.reset(FIELD_PSSYSACTORID);
    }

    /**
     * 设置 操作者
     * <P>
     * 等同 {@link #setPSSysActorId}
     * @param pSSysActorId
     */
    @JsonIgnore
    public PSSysReqModule pssysactorid(String pSSysActorId){
        this.setPSSysActorId(pSSysActorId);
        return this;
    }

    /**
     * 设置 操作者，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysActorId}
     * @param pSSysActor 引用对象
     */
    @JsonIgnore
    public PSSysReqModule pssysactorid(PSSysActor pSSysActor){
        if(pSSysActor == null){
            this.setPSSysActorId(null);
            this.setPSSysActorName(null);
        }
        else{
            this.setPSSysActorId(pSSysActor.getPSSysActorId());
            this.setPSSysActorName(pSSysActor.getPSSysActorName());
        }
        return this;
    }

    /**
     * <B>PSSYSACTORNAME</B>&nbsp;操作者
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSACTORID}
     */
    public final static String FIELD_PSSYSACTORNAME = "pssysactorname";

    /**
     * 设置 操作者
     * 
     * @param pSSysActorName
     * 
     */
    @JsonProperty(FIELD_PSSYSACTORNAME)
    public void setPSSysActorName(String pSSysActorName){
        this.set(FIELD_PSSYSACTORNAME, pSSysActorName);
    }
    
    /**
     * 获取 操作者  
     * @return
     */
    @JsonIgnore
    public String getPSSysActorName(){
        Object objValue = this.get(FIELD_PSSYSACTORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysActorNameDirty(){
        if(this.contains(FIELD_PSSYSACTORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作者
     */
    @JsonIgnore
    public void resetPSSysActorName(){
        this.reset(FIELD_PSSYSACTORNAME);
    }

    /**
     * 设置 操作者
     * <P>
     * 等同 {@link #setPSSysActorName}
     * @param pSSysActorName
     */
    @JsonIgnore
    public PSSysReqModule pssysactorname(String pSSysActorName){
        this.setPSSysActorName(pSSysActorName);
        return this;
    }

    /**
     * <B>PSSYSREQMODULEID</B>&nbsp;系统需求模块标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSREQMODULEID = "pssysreqmoduleid";

    /**
     * 设置 系统需求模块标识
     * 
     * @param pSSysReqModuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQMODULEID)
    public void setPSSysReqModuleId(String pSSysReqModuleId){
        this.set(FIELD_PSSYSREQMODULEID, pSSysReqModuleId);
    }
    
    /**
     * 获取 系统需求模块标识  
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
     * 判断 系统需求模块标识 是否指定值，包括空值
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
     * 重置 系统需求模块标识
     */
    @JsonIgnore
    public void resetPSSysReqModuleId(){
        this.reset(FIELD_PSSYSREQMODULEID);
    }

    /**
     * 设置 系统需求模块标识
     * <P>
     * 等同 {@link #setPSSysReqModuleId}
     * @param pSSysReqModuleId
     */
    @JsonIgnore
    public PSSysReqModule pssysreqmoduleid(String pSSysReqModuleId){
        this.setPSSysReqModuleId(pSSysReqModuleId);
        return this;
    }

    /**
     * <B>PSSYSREQMODULENAME</B>&nbsp;系统需求模块名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSREQMODULENAME = "pssysreqmodulename";

    /**
     * 设置 系统需求模块名称
     * 
     * @param pSSysReqModuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQMODULENAME)
    public void setPSSysReqModuleName(String pSSysReqModuleName){
        this.set(FIELD_PSSYSREQMODULENAME, pSSysReqModuleName);
    }
    
    /**
     * 获取 系统需求模块名称  
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
     * 判断 系统需求模块名称 是否指定值，包括空值
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
     * 重置 系统需求模块名称
     */
    @JsonIgnore
    public void resetPSSysReqModuleName(){
        this.reset(FIELD_PSSYSREQMODULENAME);
    }

    /**
     * 设置 系统需求模块名称
     * <P>
     * 等同 {@link #setPSSysReqModuleName}
     * @param pSSysReqModuleName
     */
    @JsonIgnore
    public PSSysReqModule pssysreqmodulename(String pSSysReqModuleName){
        this.setPSSysReqModuleName(pSSysReqModuleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysReqModuleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysReqModuleName(strName);
    }

    @JsonIgnore
    public PSSysReqModule name(String strName){
        this.setPSSysReqModuleName(strName);
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
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseId(){
        Object objValue = this.get(FIELD_PSSYSUSECASEID);
        if(objValue==null){
            return null;
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
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSSysReqModule pssysusecaseid(String pSSysUseCaseId){
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
    public PSSysReqModule pssysusecaseid(PSSysUseCase pSSysUseCase){
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
    }
    
    /**
     * 获取 系统用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseName(){
        Object objValue = this.get(FIELD_PSSYSUSECASENAME);
        if(objValue==null){
            return null;
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
        return false;
    }

    /**
     * 重置 系统用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
    }

    /**
     * 设置 系统用例
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSSysReqModule pssysusecasename(String pSSysUseCaseName){
        this.setPSSysUseCaseName(pSSysUseCaseName);
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
    public PSSysReqModule reqmodel(String reqModel){
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
    public PSSysReqModule reqmodeltype(String reqModelType){
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
    public PSSysReqModule subject(String subject){
        this.setSubject(subject);
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
    public PSSysReqModule tags(String tags){
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
    public PSSysReqModule updatedate(String updateDate){
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
    public PSSysReqModule updateman(String updateMan){
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
    public PSSysReqModule usercat(String userCat){
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
    public PSSysReqModule usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysReqModule usertag(String userTag){
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
    public PSSysReqModule usertag2(String userTag2){
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
    public PSSysReqModule usertag3(String userTag3){
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
    public PSSysReqModule usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysReqModuleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysReqModuleId(strValue);
    }

    @JsonIgnore
    public PSSysReqModule id(String strValue){
        this.setPSSysReqModuleId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysReqModule){
            PSSysReqModule model = (PSSysReqModule)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
