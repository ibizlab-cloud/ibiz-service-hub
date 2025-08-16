package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSUSECASE</B>系统用例 模型传输对象
 * <P>
 * 系统用例模型
 */
public class PSSysUseCase extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysUseCase(){
        this.setValidFlag(1);
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
    public PSSysUseCase aichoices(String aIChoices){
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
    public PSSysUseCase aiprompt(String aIPrompt){
        this.setAIPrompt(aIPrompt);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统用例的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
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
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysUseCase codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 颜色
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 颜色
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSSysUseCase color(String color){
        this.setColor(color);
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
    public PSSysUseCase content(String content){
        this.setContent(content);
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
    public PSSysUseCase createdate(String createDate){
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
    public PSSysUseCase createman(String createMan){
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
    public PSSysUseCase memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;相关实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 相关实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 相关实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEId(){
        Object objValue = this.get(FIELD_PSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEIdDirty(){
        if(this.contains(FIELD_PSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysUseCase psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 相关实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysUseCase psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;相关实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 相关实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 相关实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 相关实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 相关实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 相关实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysUseCase psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统用例所在的系统模块
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
    public PSSysUseCase psmoduleid(String pSModuleId){
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
    public PSSysUseCase psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统用例所在的系统模块
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
    public PSSysUseCase psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSUSECASECATID</B>&nbsp;用例分类
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUseCaseCat} 
     */
    public final static String FIELD_PSSYSUSECASECATID = "pssysusecasecatid";

    /**
     * 设置 用例分类
     * 
     * @param pSSysUseCaseCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASECATID)
    public void setPSSysUseCaseCatId(String pSSysUseCaseCatId){
        this.set(FIELD_PSSYSUSECASECATID, pSSysUseCaseCatId);
    }
    
    /**
     * 获取 用例分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseCatId(){
        Object objValue = this.get(FIELD_PSSYSUSECASECATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseCatIdDirty(){
        if(this.contains(FIELD_PSSYSUSECASECATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例分类
     */
    @JsonIgnore
    public void resetPSSysUseCaseCatId(){
        this.reset(FIELD_PSSYSUSECASECATID);
    }

    /**
     * 设置 用例分类
     * <P>
     * 等同 {@link #setPSSysUseCaseCatId}
     * @param pSSysUseCaseCatId
     */
    @JsonIgnore
    public PSSysUseCase pssysusecasecatid(String pSSysUseCaseCatId){
        this.setPSSysUseCaseCatId(pSSysUseCaseCatId);
        return this;
    }

    /**
     * 设置 用例分类，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUseCaseCatId}
     * @param pSSysUseCaseCat 引用对象
     */
    @JsonIgnore
    public PSSysUseCase pssysusecasecatid(PSSysUseCaseCat pSSysUseCaseCat){
        if(pSSysUseCaseCat == null){
            this.setPSSysUseCaseCatId(null);
            this.setPSSysUseCaseCatName(null);
        }
        else{
            this.setPSSysUseCaseCatId(pSSysUseCaseCat.getPSSysUseCaseCatId());
            this.setPSSysUseCaseCatName(pSSysUseCaseCat.getPSSysUseCaseCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSUSECASECATNAME</B>&nbsp;用例分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSECASECATID}
     */
    public final static String FIELD_PSSYSUSECASECATNAME = "pssysusecasecatname";

    /**
     * 设置 用例分类
     * 
     * @param pSSysUseCaseCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASECATNAME)
    public void setPSSysUseCaseCatName(String pSSysUseCaseCatName){
        this.set(FIELD_PSSYSUSECASECATNAME, pSSysUseCaseCatName);
    }
    
    /**
     * 获取 用例分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseCatName(){
        Object objValue = this.get(FIELD_PSSYSUSECASECATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseCatNameDirty(){
        if(this.contains(FIELD_PSSYSUSECASECATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例分类
     */
    @JsonIgnore
    public void resetPSSysUseCaseCatName(){
        this.reset(FIELD_PSSYSUSECASECATNAME);
    }

    /**
     * 设置 用例分类
     * <P>
     * 等同 {@link #setPSSysUseCaseCatName}
     * @param pSSysUseCaseCatName
     */
    @JsonIgnore
    public PSSysUseCase pssysusecasecatname(String pSSysUseCaseCatName){
        this.setPSSysUseCaseCatName(pSSysUseCaseCatName);
        return this;
    }

    /**
     * <B>PSSYSUSECASEID</B>&nbsp;系统用例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUSECASEID = "pssysusecaseid";

    /**
     * 设置 系统用例标识
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
     * 获取 系统用例标识  
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
     * 判断 系统用例标识 是否指定值，包括空值
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
     * 重置 系统用例标识
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercaseid");
    }

    /**
     * 设置 系统用例标识
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSSysUseCase pssysusecaseid(String pSSysUseCaseId){
        this.setPSSysUseCaseId(pSSysUseCaseId);
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
     * <B>PSSYSUSECASENAME</B>&nbsp;用例名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUSECASENAME = "pssysusecasename";

    /**
     * 设置 用例名称
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
     * 获取 用例名称  
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
     * 判断 用例名称 是否指定值，包括空值
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
     * 重置 用例名称
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasename");
    }

    /**
     * 设置 用例名称
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSSysUseCase pssysusecasename(String pSSysUseCaseName){
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

    @JsonIgnore
    public String getName(){
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUseCaseName(strName);
    }

    @JsonIgnore
    public PSSysUseCase name(String strName){
        this.setPSSysUseCaseName(strName);
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
    public PSSysUseCase subject(String subject){
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
    public PSSysUseCase tags(String tags){
        this.setTags(tags);
        return this;
    }

    /**
     * <B>UCTAG</B>&nbsp;用例标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_UCTAG = "uctag";

    /**
     * 设置 用例标记
     * 
     * @param uCTag
     * 
     */
    @JsonProperty(FIELD_UCTAG)
    public void setUCTag(String uCTag){
        this.set(FIELD_UCTAG, uCTag);
    }
    
    /**
     * 获取 用例标记  
     * @return
     */
    @JsonIgnore
    public String getUCTag(){
        Object objValue = this.get(FIELD_UCTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUCTagDirty(){
        if(this.contains(FIELD_UCTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例标记
     */
    @JsonIgnore
    public void resetUCTag(){
        this.reset(FIELD_UCTAG);
    }

    /**
     * 设置 用例标记
     * <P>
     * 等同 {@link #setUCTag}
     * @param uCTag
     */
    @JsonIgnore
    public PSSysUseCase uctag(String uCTag){
        this.setUCTag(uCTag);
        return this;
    }

    /**
     * <B>UCTAG2</B>&nbsp;用例标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_UCTAG2 = "uctag2";

    /**
     * 设置 用例标记2
     * 
     * @param uCTag2
     * 
     */
    @JsonProperty(FIELD_UCTAG2)
    public void setUCTag2(String uCTag2){
        this.set(FIELD_UCTAG2, uCTag2);
    }
    
    /**
     * 获取 用例标记2  
     * @return
     */
    @JsonIgnore
    public String getUCTag2(){
        Object objValue = this.get(FIELD_UCTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUCTag2Dirty(){
        if(this.contains(FIELD_UCTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例标记2
     */
    @JsonIgnore
    public void resetUCTag2(){
        this.reset(FIELD_UCTAG2);
    }

    /**
     * 设置 用例标记2
     * <P>
     * 等同 {@link #setUCTag2}
     * @param uCTag2
     */
    @JsonIgnore
    public PSSysUseCase uctag2(String uCTag2){
        this.setUCTag2(uCTag2);
        return this;
    }

    /**
     * <B>UCTAG3</B>&nbsp;用例标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_UCTAG3 = "uctag3";

    /**
     * 设置 用例标记3
     * 
     * @param uCTag3
     * 
     */
    @JsonProperty(FIELD_UCTAG3)
    public void setUCTag3(String uCTag3){
        this.set(FIELD_UCTAG3, uCTag3);
    }
    
    /**
     * 获取 用例标记3  
     * @return
     */
    @JsonIgnore
    public String getUCTag3(){
        Object objValue = this.get(FIELD_UCTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUCTag3Dirty(){
        if(this.contains(FIELD_UCTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例标记3
     */
    @JsonIgnore
    public void resetUCTag3(){
        this.reset(FIELD_UCTAG3);
    }

    /**
     * 设置 用例标记3
     * <P>
     * 等同 {@link #setUCTag3}
     * @param uCTag3
     */
    @JsonIgnore
    public PSSysUseCase uctag3(String uCTag3){
        this.setUCTag3(uCTag3);
        return this;
    }

    /**
     * <B>UCTAG4</B>&nbsp;用例标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_UCTAG4 = "uctag4";

    /**
     * 设置 用例标记4
     * 
     * @param uCTag4
     * 
     */
    @JsonProperty(FIELD_UCTAG4)
    public void setUCTag4(String uCTag4){
        this.set(FIELD_UCTAG4, uCTag4);
    }
    
    /**
     * 获取 用例标记4  
     * @return
     */
    @JsonIgnore
    public String getUCTag4(){
        Object objValue = this.get(FIELD_UCTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用例标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUCTag4Dirty(){
        if(this.contains(FIELD_UCTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例标记4
     */
    @JsonIgnore
    public void resetUCTag4(){
        this.reset(FIELD_UCTAG4);
    }

    /**
     * 设置 用例标记4
     * <P>
     * 等同 {@link #setUCTag4}
     * @param uCTag4
     */
    @JsonIgnore
    public PSSysUseCase uctag4(String uCTag4){
        this.setUCTag4(uCTag4);
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
    public PSSysUseCase updatedate(String updateDate){
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
    public PSSysUseCase updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USECASESN</B>&nbsp;用例编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_USECASESN = "usecasesn";

    /**
     * 设置 用例编号
     * 
     * @param useCaseSN
     * 
     */
    @JsonProperty(FIELD_USECASESN)
    public void setUseCaseSN(String useCaseSN){
        this.set(FIELD_USECASESN, useCaseSN);
        //属性名称与代码标识不一致，设置属性名称
        this.set("usercasesn", useCaseSN);
    }
    
    /**
     * 获取 用例编号  
     * @return
     */
    @JsonIgnore
    public String getUseCaseSN(){
        Object objValue = this.get(FIELD_USECASESN);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("usercasesn");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 用例编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUseCaseSNDirty(){
        if(this.contains(FIELD_USECASESN)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("usercasesn")){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例编号
     */
    @JsonIgnore
    public void resetUseCaseSN(){
        this.reset(FIELD_USECASESN);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("usercasesn");
    }

    /**
     * 设置 用例编号
     * <P>
     * 等同 {@link #setUseCaseSN}
     * @param useCaseSN
     */
    @JsonIgnore
    public PSSysUseCase usecasesn(String useCaseSN){
        this.setUseCaseSN(useCaseSN);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getUserCaseSN(){
        return this.getUseCaseSN();
    }

    @JsonIgnore
    @Deprecated        
    public void setUserCaseSN(String userCaseSN){
        this.setUseCaseSN(userCaseSN);
    }

    @JsonIgnore
    @Deprecated
    public boolean isUserCaseSNDirty(){
        return this.isUseCaseSNDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetUserCaseSN(){
        this.resetUseCaseSN();
    }

    /**
     * <B>USECASETAG</B>&nbsp;用例标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USECASETAG = "usecasetag";

    /**
     * 设置 用例标记
     * 
     * @param useCaseTag
     * 
     */
    @JsonProperty(FIELD_USECASETAG)
    public void setUseCaseTag(String useCaseTag){
        this.set(FIELD_USECASETAG, useCaseTag);
        //属性名称与代码标识不一致，设置属性名称
        this.set("usercasetag", useCaseTag);
    }
    
    /**
     * 获取 用例标记  
     * @return
     */
    @JsonIgnore
    public String getUseCaseTag(){
        Object objValue = this.get(FIELD_USECASETAG);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("usercasetag");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 用例标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUseCaseTagDirty(){
        if(this.contains(FIELD_USECASETAG)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("usercasetag")){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例标记
     */
    @JsonIgnore
    public void resetUseCaseTag(){
        this.reset(FIELD_USECASETAG);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("usercasetag");
    }

    /**
     * 设置 用例标记
     * <P>
     * 等同 {@link #setUseCaseTag}
     * @param useCaseTag
     */
    @JsonIgnore
    public PSSysUseCase usecasetag(String useCaseTag){
        this.setUseCaseTag(useCaseTag);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getUserCaseTag(){
        return this.getUseCaseTag();
    }

    @JsonIgnore
    @Deprecated        
    public void setUserCaseTag(String userCaseTag){
        this.setUseCaseTag(userCaseTag);
    }

    @JsonIgnore
    @Deprecated
    public boolean isUserCaseTagDirty(){
        return this.isUseCaseTagDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetUserCaseTag(){
        this.resetUseCaseTag();
    }

    /**
     * <B>USECASETAG2</B>&nbsp;用例标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USECASETAG2 = "usecasetag2";

    /**
     * 设置 用例标记2
     * 
     * @param useCaseTag2
     * 
     */
    @JsonProperty(FIELD_USECASETAG2)
    public void setUseCaseTag2(String useCaseTag2){
        this.set(FIELD_USECASETAG2, useCaseTag2);
        //属性名称与代码标识不一致，设置属性名称
        this.set("usercasetag2", useCaseTag2);
    }
    
    /**
     * 获取 用例标记2  
     * @return
     */
    @JsonIgnore
    public String getUseCaseTag2(){
        Object objValue = this.get(FIELD_USECASETAG2);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("usercasetag2");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 用例标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUseCaseTag2Dirty(){
        if(this.contains(FIELD_USECASETAG2)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("usercasetag2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 用例标记2
     */
    @JsonIgnore
    public void resetUseCaseTag2(){
        this.reset(FIELD_USECASETAG2);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("usercasetag2");
    }

    /**
     * 设置 用例标记2
     * <P>
     * 等同 {@link #setUseCaseTag2}
     * @param useCaseTag2
     */
    @JsonIgnore
    public PSSysUseCase usecasetag2(String useCaseTag2){
        this.setUseCaseTag2(useCaseTag2);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getUserCaseTag2(){
        return this.getUseCaseTag2();
    }

    @JsonIgnore
    @Deprecated        
    public void setUserCaseTag2(String userCaseTag2){
        this.setUseCaseTag2(userCaseTag2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isUserCaseTag2Dirty(){
        return this.isUseCaseTag2Dirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetUserCaseTag2(){
        this.resetUseCaseTag2();
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
    public PSSysUseCase usercat(String userCat){
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
    public PSSysUseCase usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUseCase usertag(String userTag){
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
    public PSSysUseCase usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>USERTAG3</B>&nbsp;用户标识3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG3 = "usertag3";

    /**
     * 设置 用户标识3
     * 
     * @param userTag3
     * 
     */
    @JsonProperty(FIELD_USERTAG3)
    public void setUserTag3(String userTag3){
        this.set(FIELD_USERTAG3, userTag3);
    }
    
    /**
     * 获取 用户标识3  
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
     * 判断 用户标识3 是否指定值，包括空值
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
     * 重置 用户标识3
     */
    @JsonIgnore
    public void resetUserTag3(){
        this.reset(FIELD_USERTAG3);
    }

    /**
     * 设置 用户标识3
     * <P>
     * 等同 {@link #setUserTag3}
     * @param userTag3
     */
    @JsonIgnore
    public PSSysUseCase usertag3(String userTag3){
        this.setUserTag3(userTag3);
        return this;
    }

    /**
     * <B>USERTAG4</B>&nbsp;用户标识4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_USERTAG4 = "usertag4";

    /**
     * 设置 用户标识4
     * 
     * @param userTag4
     * 
     */
    @JsonProperty(FIELD_USERTAG4)
    public void setUserTag4(String userTag4){
        this.set(FIELD_USERTAG4, userTag4);
    }
    
    /**
     * 获取 用户标识4  
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
     * 判断 用户标识4 是否指定值，包括空值
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
     * 重置 用户标识4
     */
    @JsonIgnore
    public void resetUserTag4(){
        this.reset(FIELD_USERTAG4);
    }

    /**
     * 设置 用户标识4
     * <P>
     * 等同 {@link #setUserTag4}
     * @param userTag4
     */
    @JsonIgnore
    public PSSysUseCase usertag4(String userTag4){
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
    public PSSysUseCase validflag(Integer validFlag){
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
    public PSSysUseCase validflag(Boolean validFlag){
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
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUseCaseId(strValue);
    }

    @JsonIgnore
    public PSSysUseCase id(String strValue){
        this.setPSSysUseCaseId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysUseCase){
            PSSysUseCase model = (PSSysUseCase)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
