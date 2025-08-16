package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSUSECASERS</B>系统用例关系 模型传输对象
 * <P>
 * 
 */
public class PSSysUseCaseRSDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysUseCaseRSDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysUseCaseRSDTO codename(String codeName){
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
    public PSSysUseCaseRSDTO color(String color){
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
    public PSSysUseCaseRSDTO content(String content){
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
    public PSSysUseCaseRSDTO createdate(Timestamp createDate){
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
    public PSSysUseCaseRSDTO createman(String createMan){
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
    public PSSysUseCaseRSDTO memo(String memo){
        this.setMemo(memo);
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
    public PSSysUseCaseRSDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSSYSACTORID</B>&nbsp;源操作者
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysActorDTO} 
     */
    public final static String FIELD_PPSSYSACTORID = "ppssysactorid";

    /**
     * 设置 源操作者
     * 
     * @param pPSSysActorId
     * 
     */
    @JsonProperty(FIELD_PPSSYSACTORID)
    public void setPPSSysActorId(String pPSSysActorId){
        this.set(FIELD_PPSSYSACTORID, pPSSysActorId);
    }
    
    /**
     * 获取 源操作者  
     * @return
     */
    @JsonIgnore
    public String getPPSSysActorId(){
        Object objValue = this.get(FIELD_PPSSYSACTORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源操作者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysActorIdDirty(){
        if(this.contains(FIELD_PPSSYSACTORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源操作者
     */
    @JsonIgnore
    public void resetPPSSysActorId(){
        this.reset(FIELD_PPSSYSACTORID);
    }

    /**
     * 设置 源操作者
     * <P>
     * 等同 {@link #setPPSSysActorId}
     * @param pPSSysActorId
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO ppssysactorid(String pPSSysActorId){
        this.setPPSSysActorId(pPSSysActorId);
        return this;
    }

    /**
     * 设置 源操作者，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysActorId}
     * @param pSSysActor 引用对象
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO ppssysactorid(PSSysActorDTO pSSysActor){
        if(pSSysActor == null){
            this.setPPSSysActorId(null);
            this.setPPSSysActorName(null);
        }
        else{
            this.setPPSSysActorId(pSSysActor.getPSSysActorId());
            this.setPPSSysActorName(pSSysActor.getPSSysActorName());
        }
        return this;
    }

    /**
     * <B>PPSSYSACTORNAME</B>&nbsp;源操作者
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSACTORID}
     */
    public final static String FIELD_PPSSYSACTORNAME = "ppssysactorname";

    /**
     * 设置 源操作者
     * 
     * @param pPSSysActorName
     * 
     */
    @JsonProperty(FIELD_PPSSYSACTORNAME)
    public void setPPSSysActorName(String pPSSysActorName){
        this.set(FIELD_PPSSYSACTORNAME, pPSSysActorName);
    }
    
    /**
     * 获取 源操作者  
     * @return
     */
    @JsonIgnore
    public String getPPSSysActorName(){
        Object objValue = this.get(FIELD_PPSSYSACTORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源操作者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysActorNameDirty(){
        if(this.contains(FIELD_PPSSYSACTORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源操作者
     */
    @JsonIgnore
    public void resetPPSSysActorName(){
        this.reset(FIELD_PPSSYSACTORNAME);
    }

    /**
     * 设置 源操作者
     * <P>
     * 等同 {@link #setPPSSysActorName}
     * @param pPSSysActorName
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO ppssysactorname(String pPSSysActorName){
        this.setPPSSysActorName(pPSSysActorName);
        return this;
    }

    /**
     * <B>PPSSYSUSECASEID</B>&nbsp;源用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUseCaseDTO} 
     */
    public final static String FIELD_PPSSYSUSECASEID = "ppssysusecaseid";

    /**
     * 设置 源用例
     * 
     * @param pPSSysUseCaseId
     * 
     */
    @JsonProperty(FIELD_PPSSYSUSECASEID)
    public void setPPSSysUseCaseId(String pPSSysUseCaseId){
        this.set(FIELD_PPSSYSUSECASEID, pPSSysUseCaseId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("ppssysusercaseid", pPSSysUseCaseId);
    }
    
    /**
     * 获取 源用例  
     * @return
     */
    @JsonIgnore
    public String getPPSSysUseCaseId(){
        Object objValue = this.get(FIELD_PPSSYSUSECASEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("ppssysusercaseid");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 源用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysUseCaseIdDirty(){
        if(this.contains(FIELD_PPSSYSUSECASEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("ppssysusercaseid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 源用例
     */
    @JsonIgnore
    public void resetPPSSysUseCaseId(){
        this.reset(FIELD_PPSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("ppssysusercaseid");
    }

    /**
     * 设置 源用例
     * <P>
     * 等同 {@link #setPPSSysUseCaseId}
     * @param pPSSysUseCaseId
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO ppssysusecaseid(String pPSSysUseCaseId){
        this.setPPSSysUseCaseId(pPSSysUseCaseId);
        return this;
    }

    /**
     * 设置 源用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysUseCaseId}
     * @param pSSysUseCase 引用对象
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO ppssysusecaseid(PSSysUseCaseDTO pSSysUseCase){
        if(pSSysUseCase == null){
            this.setPPSSysUseCaseId(null);
            this.setPPSSysUseCaseName(null);
        }
        else{
            this.setPPSSysUseCaseId(pSSysUseCase.getPSSysUseCaseId());
            this.setPPSSysUseCaseName(pSSysUseCase.getPSSysUseCaseName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPPSSysUserCaseId(){
        return this.getPPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPPSSysUserCaseId(String pPSSysUserCaseId){
        this.setPPSSysUseCaseId(pPSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPPSSysUserCaseIdDirty(){
        return this.isPPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPPSSysUserCaseId(){
        this.resetPPSSysUseCaseId();
    }

    /**
     * <B>PPSSYSUSECASENAME</B>&nbsp;源用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSUSECASEID}
     */
    public final static String FIELD_PPSSYSUSECASENAME = "ppssysusecasename";

    /**
     * 设置 源用例
     * 
     * @param pPSSysUseCaseName
     * 
     */
    @JsonProperty(FIELD_PPSSYSUSECASENAME)
    public void setPPSSysUseCaseName(String pPSSysUseCaseName){
        this.set(FIELD_PPSSYSUSECASENAME, pPSSysUseCaseName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("ppssysusercasename", pPSSysUseCaseName);
    }
    
    /**
     * 获取 源用例  
     * @return
     */
    @JsonIgnore
    public String getPPSSysUseCaseName(){
        Object objValue = this.get(FIELD_PPSSYSUSECASENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("ppssysusercasename");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 源用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysUseCaseNameDirty(){
        if(this.contains(FIELD_PPSSYSUSECASENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("ppssysusercasename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 源用例
     */
    @JsonIgnore
    public void resetPPSSysUseCaseName(){
        this.reset(FIELD_PPSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("ppssysusercasename");
    }

    /**
     * 设置 源用例
     * <P>
     * 等同 {@link #setPPSSysUseCaseName}
     * @param pPSSysUseCaseName
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO ppssysusecasename(String pPSSysUseCaseName){
        this.setPPSSysUseCaseName(pPSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPPSSysUserCaseName(){
        return this.getPPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPPSSysUserCaseName(String pPSSysUserCaseName){
        this.setPPSSysUseCaseName(pPSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPPSSysUserCaseNameDirty(){
        return this.isPPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPPSSysUserCaseName(){
        this.resetPPSSysUseCaseName();
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统用例关系所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSSysUseCaseRSDTO psmoduleid(String pSModuleId){
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
    public PSSysUseCaseRSDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统用例关系所在的系统模块
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
    public PSSysUseCaseRSDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSACTORID</B>&nbsp;目标操作者
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysActorDTO} 
     */
    public final static String FIELD_PSSYSACTORID = "pssysactorid";

    /**
     * 设置 目标操作者
     * 
     * @param pSSysActorId
     * 
     */
    @JsonProperty(FIELD_PSSYSACTORID)
    public void setPSSysActorId(String pSSysActorId){
        this.set(FIELD_PSSYSACTORID, pSSysActorId);
    }
    
    /**
     * 获取 目标操作者  
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
     * 判断 目标操作者 是否指定值，包括空值
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
     * 重置 目标操作者
     */
    @JsonIgnore
    public void resetPSSysActorId(){
        this.reset(FIELD_PSSYSACTORID);
    }

    /**
     * 设置 目标操作者
     * <P>
     * 等同 {@link #setPSSysActorId}
     * @param pSSysActorId
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysactorid(String pSSysActorId){
        this.setPSSysActorId(pSSysActorId);
        return this;
    }

    /**
     * 设置 目标操作者，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysActorId}
     * @param pSSysActor 引用对象
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysactorid(PSSysActorDTO pSSysActor){
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
     * <B>PSSYSACTORNAME</B>&nbsp;目标操作者
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSACTORID}
     */
    public final static String FIELD_PSSYSACTORNAME = "pssysactorname";

    /**
     * 设置 目标操作者
     * 
     * @param pSSysActorName
     * 
     */
    @JsonProperty(FIELD_PSSYSACTORNAME)
    public void setPSSysActorName(String pSSysActorName){
        this.set(FIELD_PSSYSACTORNAME, pSSysActorName);
    }
    
    /**
     * 获取 目标操作者  
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
     * 判断 目标操作者 是否指定值，包括空值
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
     * 重置 目标操作者
     */
    @JsonIgnore
    public void resetPSSysActorName(){
        this.reset(FIELD_PSSYSACTORNAME);
    }

    /**
     * 设置 目标操作者
     * <P>
     * 等同 {@link #setPSSysActorName}
     * @param pSSysActorName
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysactorname(String pSSysActorName){
        this.setPSSysActorName(pSSysActorName);
        return this;
    }

    /**
     * <B>PSSYSUSECASEID</B>&nbsp;目标用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUseCaseDTO} 
     */
    public final static String FIELD_PSSYSUSECASEID = "pssysusecaseid";

    /**
     * 设置 目标用例
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
     * 获取 目标用例  
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
     * 判断 目标用例 是否指定值，包括空值
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
     * 重置 目标用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercaseid");
    }

    /**
     * 设置 目标用例
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysusecaseid(String pSSysUseCaseId){
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    /**
     * 设置 目标用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCase 引用对象
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysusecaseid(PSSysUseCaseDTO pSSysUseCase){
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
     * <B>PSSYSUSECASENAME</B>&nbsp;目标用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSECASEID}
     */
    public final static String FIELD_PSSYSUSECASENAME = "pssysusecasename";

    /**
     * 设置 目标用例
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
     * 获取 目标用例  
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
     * 判断 目标用例 是否指定值，包括空值
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
     * 重置 目标用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasename");
    }

    /**
     * 设置 目标用例
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysusecasename(String pSSysUseCaseName){
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
     * <B>PSSYSUSECASERSID</B>&nbsp;系统用例关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUSECASERSID = "pssysusecasersid";

    /**
     * 设置 系统用例关系标识
     * 
     * @param pSSysUseCaseRSId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASERSID)
    public void setPSSysUseCaseRSId(String pSSysUseCaseRSId){
        this.set(FIELD_PSSYSUSECASERSID, pSSysUseCaseRSId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercasersid", pSSysUseCaseRSId);
    }
    
    /**
     * 获取 系统用例关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseRSId(){
        Object objValue = this.get(FIELD_PSSYSUSECASERSID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercasersid");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseRSIdDirty(){
        if(this.contains(FIELD_PSSYSUSECASERSID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercasersid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例关系标识
     */
    @JsonIgnore
    public void resetPSSysUseCaseRSId(){
        this.reset(FIELD_PSSYSUSECASERSID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasersid");
    }

    /**
     * 设置 系统用例关系标识
     * <P>
     * 等同 {@link #setPSSysUseCaseRSId}
     * @param pSSysUseCaseRSId
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysusecasersid(String pSSysUseCaseRSId){
        this.setPSSysUseCaseRSId(pSSysUseCaseRSId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseRSId(){
        return this.getPSSysUseCaseRSId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseRSId(String pSSysUserCaseRSId){
        this.setPSSysUseCaseRSId(pSSysUserCaseRSId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseRSIdDirty(){
        return this.isPSSysUseCaseRSIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseRSId(){
        this.resetPSSysUseCaseRSId();
    }

    /**
     * <B>PSSYSUSECASERSNAME</B>&nbsp;系统用例关系名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUSECASERSNAME = "pssysusecasersname";

    /**
     * 设置 系统用例关系名称
     * 
     * @param pSSysUseCaseRSName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASERSNAME)
    public void setPSSysUseCaseRSName(String pSSysUseCaseRSName){
        this.set(FIELD_PSSYSUSECASERSNAME, pSSysUseCaseRSName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercasersname", pSSysUseCaseRSName);
    }
    
    /**
     * 获取 系统用例关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseRSName(){
        Object objValue = this.get(FIELD_PSSYSUSECASERSNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercasersname");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseRSNameDirty(){
        if(this.contains(FIELD_PSSYSUSECASERSNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercasersname")){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例关系名称
     */
    @JsonIgnore
    public void resetPSSysUseCaseRSName(){
        this.reset(FIELD_PSSYSUSECASERSNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasersname");
    }

    /**
     * 设置 系统用例关系名称
     * <P>
     * 等同 {@link #setPSSysUseCaseRSName}
     * @param pSSysUseCaseRSName
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO pssysusecasersname(String pSSysUseCaseRSName){
        this.setPSSysUseCaseRSName(pSSysUseCaseRSName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseRSName(){
        return this.getPSSysUseCaseRSName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseRSName(String pSSysUserCaseRSName){
        this.setPSSysUseCaseRSName(pSSysUserCaseRSName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseRSNameDirty(){
        return this.isPSSysUseCaseRSNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseRSName(){
        this.resetPSSysUseCaseRSName();
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUseCaseRSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUseCaseRSName(strName);
    }

    @JsonIgnore
    public PSSysUseCaseRSDTO name(String strName){
        this.setPSSysUseCaseRSName(strName);
        return this;
    }

    /**
     * <B>RSMODE</B>&nbsp;关系模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UseCaseRSMode} 
     */
    public final static String FIELD_RSMODE = "rsmode";

    /**
     * 设置 关系模式
     * 
     * @param rSMode
     * 
     */
    @JsonProperty(FIELD_RSMODE)
    public void setRSMode(String rSMode){
        this.set(FIELD_RSMODE, rSMode);
    }
    
    /**
     * 获取 关系模式  
     * @return
     */
    @JsonIgnore
    public String getRSMode(){
        Object objValue = this.get(FIELD_RSMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSModeDirty(){
        if(this.contains(FIELD_RSMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系模式
     */
    @JsonIgnore
    public void resetRSMode(){
        this.reset(FIELD_RSMODE);
    }

    /**
     * 设置 关系模式
     * <P>
     * 等同 {@link #setRSMode}
     * @param rSMode
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rsmode(String rSMode){
        this.setRSMode(rSMode);
        return this;
    }

     /**
     * 设置 关系模式
     * <P>
     * 等同 {@link #setRSMode}
     * @param rSMode
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rsmode(net.ibizsys.model.PSModelEnums.UseCaseRSMode rSMode){
        if(rSMode == null){
            this.setRSMode(null);
        }
        else{
            this.setRSMode(rSMode.value);
        }
        return this;
    }

    /**
     * <B>RSTAG</B>&nbsp;关系标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RSTAG = "rstag";

    /**
     * 设置 关系标记
     * 
     * @param rSTag
     * 
     */
    @JsonProperty(FIELD_RSTAG)
    public void setRSTag(String rSTag){
        this.set(FIELD_RSTAG, rSTag);
    }
    
    /**
     * 获取 关系标记  
     * @return
     */
    @JsonIgnore
    public String getRSTag(){
        Object objValue = this.get(FIELD_RSTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTagDirty(){
        if(this.contains(FIELD_RSTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记
     */
    @JsonIgnore
    public void resetRSTag(){
        this.reset(FIELD_RSTAG);
    }

    /**
     * 设置 关系标记
     * <P>
     * 等同 {@link #setRSTag}
     * @param rSTag
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rstag(String rSTag){
        this.setRSTag(rSTag);
        return this;
    }

    /**
     * <B>RSTAG2</B>&nbsp;关系标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RSTAG2 = "rstag2";

    /**
     * 设置 关系标记2
     * 
     * @param rSTag2
     * 
     */
    @JsonProperty(FIELD_RSTAG2)
    public void setRSTag2(String rSTag2){
        this.set(FIELD_RSTAG2, rSTag2);
    }
    
    /**
     * 获取 关系标记2  
     * @return
     */
    @JsonIgnore
    public String getRSTag2(){
        Object objValue = this.get(FIELD_RSTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag2Dirty(){
        if(this.contains(FIELD_RSTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记2
     */
    @JsonIgnore
    public void resetRSTag2(){
        this.reset(FIELD_RSTAG2);
    }

    /**
     * 设置 关系标记2
     * <P>
     * 等同 {@link #setRSTag2}
     * @param rSTag2
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rstag2(String rSTag2){
        this.setRSTag2(rSTag2);
        return this;
    }

    /**
     * <B>RSTAG3</B>&nbsp;关系标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RSTAG3 = "rstag3";

    /**
     * 设置 关系标记3
     * 
     * @param rSTag3
     * 
     */
    @JsonProperty(FIELD_RSTAG3)
    public void setRSTag3(String rSTag3){
        this.set(FIELD_RSTAG3, rSTag3);
    }
    
    /**
     * 获取 关系标记3  
     * @return
     */
    @JsonIgnore
    public String getRSTag3(){
        Object objValue = this.get(FIELD_RSTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag3Dirty(){
        if(this.contains(FIELD_RSTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记3
     */
    @JsonIgnore
    public void resetRSTag3(){
        this.reset(FIELD_RSTAG3);
    }

    /**
     * 设置 关系标记3
     * <P>
     * 等同 {@link #setRSTag3}
     * @param rSTag3
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rstag3(String rSTag3){
        this.setRSTag3(rSTag3);
        return this;
    }

    /**
     * <B>RSTAG4</B>&nbsp;关系标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_RSTAG4 = "rstag4";

    /**
     * 设置 关系标记4
     * 
     * @param rSTag4
     * 
     */
    @JsonProperty(FIELD_RSTAG4)
    public void setRSTag4(String rSTag4){
        this.set(FIELD_RSTAG4, rSTag4);
    }
    
    /**
     * 获取 关系标记4  
     * @return
     */
    @JsonIgnore
    public String getRSTag4(){
        Object objValue = this.get(FIELD_RSTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTag4Dirty(){
        if(this.contains(FIELD_RSTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记4
     */
    @JsonIgnore
    public void resetRSTag4(){
        this.reset(FIELD_RSTAG4);
    }

    /**
     * 设置 关系标记4
     * <P>
     * 等同 {@link #setRSTag4}
     * @param rSTag4
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rstag4(String rSTag4){
        this.setRSTag4(rSTag4);
        return this;
    }

    /**
     * <B>RSTYPE</B>&nbsp;关系类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UseCaseRSType} 
     */
    public final static String FIELD_RSTYPE = "rstype";

    /**
     * 设置 关系类型
     * 
     * @param rSType
     * 
     */
    @JsonProperty(FIELD_RSTYPE)
    public void setRSType(String rSType){
        this.set(FIELD_RSTYPE, rSType);
    }
    
    /**
     * 获取 关系类型  
     * @return
     */
    @JsonIgnore
    public String getRSType(){
        Object objValue = this.get(FIELD_RSTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRSTypeDirty(){
        if(this.contains(FIELD_RSTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系类型
     */
    @JsonIgnore
    public void resetRSType(){
        this.reset(FIELD_RSTYPE);
    }

    /**
     * 设置 关系类型
     * <P>
     * 等同 {@link #setRSType}
     * @param rSType
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rstype(String rSType){
        this.setRSType(rSType);
        return this;
    }

     /**
     * 设置 关系类型
     * <P>
     * 等同 {@link #setRSType}
     * @param rSType
     */
    @JsonIgnore
    public PSSysUseCaseRSDTO rstype(net.ibizsys.model.PSModelEnums.UseCaseRSType rSType){
        if(rSType == null){
            this.setRSType(null);
        }
        else{
            this.setRSType(rSType.value);
        }
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
    public PSSysUseCaseRSDTO tags(String tags){
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
    public PSSysUseCaseRSDTO updatedate(Timestamp updateDate){
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
    public PSSysUseCaseRSDTO updateman(String updateMan){
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
    public PSSysUseCaseRSDTO usercat(String userCat){
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
    public PSSysUseCaseRSDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUseCaseRSDTO usertag(String userTag){
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
    public PSSysUseCaseRSDTO usertag2(String userTag2){
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
    public PSSysUseCaseRSDTO usertag3(String userTag3){
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
    public PSSysUseCaseRSDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysUseCaseRSDTO validflag(Integer validFlag){
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
    public PSSysUseCaseRSDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysUseCaseRSId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysUseCaseRSId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysUseCaseRSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUseCaseRSId(strValue);
    }

    @JsonIgnore
    public PSSysUseCaseRSDTO id(String strValue){
        this.setPSSysUseCaseRSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysUseCaseRSDTO){
            PSSysUseCaseRSDTO dto = (PSSysUseCaseRSDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
