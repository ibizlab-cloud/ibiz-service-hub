package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEWIZARDSTEP</B>实体向导步骤 模型传输对象
 * <P>
 * 实体向导步骤模型，定义向导的步骤信息，向导步骤与向导表单不是一一对应，多个向导表单可对应同一个向导步骤
 */
public class PSDEWizardStep extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEWizardStep(){
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
    public PSDEWizardStep createdate(String createDate){
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
    public PSDEWizardStep createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENABLELINK</B>&nbsp;支持链接，指定实体向导步骤是否提供链接，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLELINK = "enablelink";

    /**
     * 设置 支持链接，详细说明：{@link #FIELD_ENABLELINK}
     * 
     * @param enableLink
     * 
     */
    @JsonProperty(FIELD_ENABLELINK)
    public void setEnableLink(Integer enableLink){
        this.set(FIELD_ENABLELINK, enableLink);
    }
    
    /**
     * 获取 支持链接  
     * @return
     */
    @JsonIgnore
    public Integer getEnableLink(){
        Object objValue = this.get(FIELD_ENABLELINK);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLinkDirty(){
        if(this.contains(FIELD_ENABLELINK)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持链接
     */
    @JsonIgnore
    public void resetEnableLink(){
        this.reset(FIELD_ENABLELINK);
    }

    /**
     * 设置 支持链接，详细说明：{@link #FIELD_ENABLELINK}
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDEWizardStep enablelink(Integer enableLink){
        this.setEnableLink(enableLink);
        return this;
    }

     /**
     * 设置 支持链接，详细说明：{@link #FIELD_ENABLELINK}
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDEWizardStep enablelink(Boolean enableLink){
        if(enableLink == null){
            this.setEnableLink(null);
        }
        else{
            this.setEnableLink(enableLink?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELOGIC</B>&nbsp;启用逻辑
     */
    public final static String FIELD_ENABLELOGIC = "enablelogic";

    /**
     * 设置 启用逻辑
     * 
     * @param enableLogic
     * 
     */
    @JsonProperty(FIELD_ENABLELOGIC)
    public void setEnableLogic(String enableLogic){
        this.set(FIELD_ENABLELOGIC, enableLogic);
    }
    
    /**
     * 获取 启用逻辑  
     * @return
     */
    @JsonIgnore
    public String getEnableLogic(){
        Object objValue = this.get(FIELD_ENABLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 启用逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableLogicDirty(){
        if(this.contains(FIELD_ENABLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用逻辑
     */
    @JsonIgnore
    public void resetEnableLogic(){
        this.reset(FIELD_ENABLELOGIC);
    }

    /**
     * 设置 启用逻辑
     * <P>
     * 等同 {@link #setEnableLogic}
     * @param enableLogic
     */
    @JsonIgnore
    public PSDEWizardStep enablelogic(String enableLogic){
        this.setEnableLogic(enableLogic);
        return this;
    }

    /**
     * <B>INITPSDEACTIONID</B>&nbsp;初始化实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_INITPSDEACTIONID = "initpsdeactionid";

    /**
     * 设置 初始化实体行为
     * 
     * @param initPSDEActionId
     * 
     */
    @JsonProperty(FIELD_INITPSDEACTIONID)
    public void setInitPSDEActionId(String initPSDEActionId){
        this.set(FIELD_INITPSDEACTIONID, initPSDEActionId);
    }
    
    /**
     * 获取 初始化实体行为  
     * @return
     */
    @JsonIgnore
    public String getInitPSDEActionId(){
        Object objValue = this.get(FIELD_INITPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 初始化实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitPSDEActionIdDirty(){
        if(this.contains(FIELD_INITPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 初始化实体行为
     */
    @JsonIgnore
    public void resetInitPSDEActionId(){
        this.reset(FIELD_INITPSDEACTIONID);
    }

    /**
     * 设置 初始化实体行为
     * <P>
     * 等同 {@link #setInitPSDEActionId}
     * @param initPSDEActionId
     */
    @JsonIgnore
    public PSDEWizardStep initpsdeactionid(String initPSDEActionId){
        this.setInitPSDEActionId(initPSDEActionId);
        return this;
    }

    /**
     * 设置 初始化实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setInitPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep initpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setInitPSDEActionId(null);
            this.setInitPSDEActionName(null);
        }
        else{
            this.setInitPSDEActionId(pSDEAction.getPSDEActionId());
            this.setInitPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>INITPSDEACTIONNAME</B>&nbsp;初始化实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_INITPSDEACTIONID}
     */
    public final static String FIELD_INITPSDEACTIONNAME = "initpsdeactionname";

    /**
     * 设置 初始化实体行为
     * 
     * @param initPSDEActionName
     * 
     */
    @JsonProperty(FIELD_INITPSDEACTIONNAME)
    public void setInitPSDEActionName(String initPSDEActionName){
        this.set(FIELD_INITPSDEACTIONNAME, initPSDEActionName);
    }
    
    /**
     * 获取 初始化实体行为  
     * @return
     */
    @JsonIgnore
    public String getInitPSDEActionName(){
        Object objValue = this.get(FIELD_INITPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 初始化实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInitPSDEActionNameDirty(){
        if(this.contains(FIELD_INITPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 初始化实体行为
     */
    @JsonIgnore
    public void resetInitPSDEActionName(){
        this.reset(FIELD_INITPSDEACTIONNAME);
    }

    /**
     * 设置 初始化实体行为
     * <P>
     * 等同 {@link #setInitPSDEActionName}
     * @param initPSDEActionName
     */
    @JsonIgnore
    public PSDEWizardStep initpsdeactionname(String initPSDEActionName){
        this.setInitPSDEActionName(initPSDEActionName);
        return this;
    }

    /**
     * <B>LNPSLANRESID</B>&nbsp;标题语言资源，指定实体向导步骤标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_LNPSLANRESID = "lnpslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * 
     * @param lNPSLanResId
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESID)
    public void setLNPSLanResId(String lNPSLanResId){
        this.set(FIELD_LNPSLANRESID, lNPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResId(){
        Object objValue = this.get(FIELD_LNPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResIdDirty(){
        if(this.contains(FIELD_LNPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResId(){
        this.reset(FIELD_LNPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESID}
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param lNPSLanResId
     */
    @JsonIgnore
    public PSDEWizardStep lnpslanresid(String lNPSLanResId){
        this.setLNPSLanResId(lNPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLNPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep lnpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setLNPSLanResId(null);
            this.setLNPSLanResName(null);
        }
        else{
            this.setLNPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setLNPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>LNPSLANRESNAME</B>&nbsp;标题语言资源，指定实体向导步骤标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LNPSLANRESID}
     */
    public final static String FIELD_LNPSLANRESNAME = "lnpslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * 
     * @param lNPSLanResName
     * 
     */
    @JsonProperty(FIELD_LNPSLANRESNAME)
    public void setLNPSLanResName(String lNPSLanResName){
        this.set(FIELD_LNPSLANRESNAME, lNPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getLNPSLanResName(){
        Object objValue = this.get(FIELD_LNPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLNPSLanResNameDirty(){
        if(this.contains(FIELD_LNPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetLNPSLanResName(){
        this.reset(FIELD_LNPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_LNPSLANRESNAME}
     * <P>
     * 等同 {@link #setLNPSLanResName}
     * @param lNPSLanResName
     */
    @JsonIgnore
    public PSDEWizardStep lnpslanresname(String lNPSLanResName){
        this.setLNPSLanResName(lNPSLanResName);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 中文名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 中文名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 中文名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 中文名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 中文名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEWizardStep logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEWizardStep memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NEXTPSDEACTIONID</B>&nbsp;下一步实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_NEXTPSDEACTIONID = "nextpsdeactionid";

    /**
     * 设置 下一步实体行为
     * 
     * @param nextPSDEActionId
     * 
     */
    @JsonProperty(FIELD_NEXTPSDEACTIONID)
    public void setNextPSDEActionId(String nextPSDEActionId){
        this.set(FIELD_NEXTPSDEACTIONID, nextPSDEActionId);
    }
    
    /**
     * 获取 下一步实体行为  
     * @return
     */
    @JsonIgnore
    public String getNextPSDEActionId(){
        Object objValue = this.get(FIELD_NEXTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSDEActionIdDirty(){
        if(this.contains(FIELD_NEXTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步实体行为
     */
    @JsonIgnore
    public void resetNextPSDEActionId(){
        this.reset(FIELD_NEXTPSDEACTIONID);
    }

    /**
     * 设置 下一步实体行为
     * <P>
     * 等同 {@link #setNextPSDEActionId}
     * @param nextPSDEActionId
     */
    @JsonIgnore
    public PSDEWizardStep nextpsdeactionid(String nextPSDEActionId){
        this.setNextPSDEActionId(nextPSDEActionId);
        return this;
    }

    /**
     * 设置 下一步实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setNextPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep nextpsdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setNextPSDEActionId(null);
            this.setNextPSDEActionName(null);
        }
        else{
            this.setNextPSDEActionId(pSDEAction.getPSDEActionId());
            this.setNextPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>NEXTPSDEACTIONNAME</B>&nbsp;下一步实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_NEXTPSDEACTIONID}
     */
    public final static String FIELD_NEXTPSDEACTIONNAME = "nextpsdeactionname";

    /**
     * 设置 下一步实体行为
     * 
     * @param nextPSDEActionName
     * 
     */
    @JsonProperty(FIELD_NEXTPSDEACTIONNAME)
    public void setNextPSDEActionName(String nextPSDEActionName){
        this.set(FIELD_NEXTPSDEACTIONNAME, nextPSDEActionName);
    }
    
    /**
     * 获取 下一步实体行为  
     * @return
     */
    @JsonIgnore
    public String getNextPSDEActionName(){
        Object objValue = this.get(FIELD_NEXTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 下一步实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNextPSDEActionNameDirty(){
        if(this.contains(FIELD_NEXTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 下一步实体行为
     */
    @JsonIgnore
    public void resetNextPSDEActionName(){
        this.reset(FIELD_NEXTPSDEACTIONNAME);
    }

    /**
     * 设置 下一步实体行为
     * <P>
     * 等同 {@link #setNextPSDEActionName}
     * @param nextPSDEActionName
     */
    @JsonIgnore
    public PSDEWizardStep nextpsdeactionname(String nextPSDEActionName){
        this.setNextPSDEActionName(nextPSDEActionName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定实体向导步骤的显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEWizardStep ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 实体表单
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 实体表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormId(){
        Object objValue = this.get(FIELD_PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormIdDirty(){
        if(this.contains(FIELD_PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 实体表单
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEWizardStep psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        }
        else{
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;实体表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 实体表单
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 实体表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormName(){
        Object objValue = this.get(FIELD_PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormNameDirty(){
        if(this.contains(FIELD_PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 实体表单
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEWizardStep psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEWizardStep psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEWIZARDID</B>&nbsp;实体向导，指定实体向导步骤所属的实体向导
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEWizard} 
     */
    public final static String FIELD_PSDEWIZARDID = "psdewizardid";

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDID}
     * 
     * @param pSDEWizardId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDID)
    public void setPSDEWizardId(String pSDEWizardId){
        this.set(FIELD_PSDEWIZARDID, pSDEWizardId);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardId(){
        Object objValue = this.get(FIELD_PSDEWIZARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardId(){
        this.reset(FIELD_PSDEWIZARDID);
    }

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDID}
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizardId
     */
    @JsonIgnore
    public PSDEWizardStep psdewizardid(String pSDEWizardId){
        this.setPSDEWizardId(pSDEWizardId);
        return this;
    }

    /**
     * 设置 实体向导，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEWizardId}
     * @param pSDEWizard 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep psdewizardid(PSDEWizard pSDEWizard){
        if(pSDEWizard == null){
            this.setPSDEId(null);
            this.setPSDEWizardId(null);
            this.setPSDEWizardName(null);
        }
        else{
            this.setPSDEId(pSDEWizard.getPSDEId());
            this.setPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    /**
     * <B>PSDEWIZARDNAME</B>&nbsp;实体向导，指定实体向导步骤所属的实体向导
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEWIZARDID}
     */
    public final static String FIELD_PSDEWIZARDNAME = "psdewizardname";

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * 
     * @param pSDEWizardName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDNAME)
    public void setPSDEWizardName(String pSDEWizardName){
        this.set(FIELD_PSDEWIZARDNAME, pSDEWizardName);
    }
    
    /**
     * 获取 实体向导  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardName(){
        Object objValue = this.get(FIELD_PSDEWIZARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导
     */
    @JsonIgnore
    public void resetPSDEWizardName(){
        this.reset(FIELD_PSDEWIZARDNAME);
    }

    /**
     * 设置 实体向导，详细说明：{@link #FIELD_PSDEWIZARDNAME}
     * <P>
     * 等同 {@link #setPSDEWizardName}
     * @param pSDEWizardName
     */
    @JsonIgnore
    public PSDEWizardStep psdewizardname(String pSDEWizardName){
        this.setPSDEWizardName(pSDEWizardName);
        return this;
    }

    /**
     * <B>PSDEWIZARDSTEPID</B>&nbsp;实体向导步骤标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEWIZARDSTEPID = "psdewizardstepid";

    /**
     * 设置 实体向导步骤标识
     * 
     * @param pSDEWizardStepId
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPID)
    public void setPSDEWizardStepId(String pSDEWizardStepId){
        this.set(FIELD_PSDEWIZARDSTEPID, pSDEWizardStepId);
    }
    
    /**
     * 获取 实体向导步骤标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardStepId(){
        Object objValue = this.get(FIELD_PSDEWIZARDSTEPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体向导步骤标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardStepIdDirty(){
        if(this.contains(FIELD_PSDEWIZARDSTEPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体向导步骤标识
     */
    @JsonIgnore
    public void resetPSDEWizardStepId(){
        this.reset(FIELD_PSDEWIZARDSTEPID);
    }

    /**
     * 设置 实体向导步骤标识
     * <P>
     * 等同 {@link #setPSDEWizardStepId}
     * @param pSDEWizardStepId
     */
    @JsonIgnore
    public PSDEWizardStep psdewizardstepid(String pSDEWizardStepId){
        this.setPSDEWizardStepId(pSDEWizardStepId);
        return this;
    }

    /**
     * <B>PSDEWIZARDSTEPNAME</B>&nbsp;步骤标题，指定实体向导步骤的标题，需在所在实体向导中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEWIZARDSTEPNAME = "psdewizardstepname";

    /**
     * 设置 步骤标题，详细说明：{@link #FIELD_PSDEWIZARDSTEPNAME}
     * 
     * @param pSDEWizardStepName
     * 
     */
    @JsonProperty(FIELD_PSDEWIZARDSTEPNAME)
    public void setPSDEWizardStepName(String pSDEWizardStepName){
        this.set(FIELD_PSDEWIZARDSTEPNAME, pSDEWizardStepName);
    }
    
    /**
     * 获取 步骤标题  
     * @return
     */
    @JsonIgnore
    public String getPSDEWizardStepName(){
        Object objValue = this.get(FIELD_PSDEWIZARDSTEPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 步骤标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEWizardStepNameDirty(){
        if(this.contains(FIELD_PSDEWIZARDSTEPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 步骤标题
     */
    @JsonIgnore
    public void resetPSDEWizardStepName(){
        this.reset(FIELD_PSDEWIZARDSTEPNAME);
    }

    /**
     * 设置 步骤标题，详细说明：{@link #FIELD_PSDEWIZARDSTEPNAME}
     * <P>
     * 等同 {@link #setPSDEWizardStepName}
     * @param pSDEWizardStepName
     */
    @JsonIgnore
    public PSDEWizardStep psdewizardstepname(String pSDEWizardStepName){
        this.setPSDEWizardStepName(pSDEWizardStepName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEWizardStepName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEWizardStepName(strName);
    }

    @JsonIgnore
    public PSDEWizardStep name(String strName){
        this.setPSDEWizardStepName(strName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;标题样式，指定实体向导步骤的界面样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 标题样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 标题样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssId(){
        Object objValue = this.get(FIELD_PSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssIdDirty(){
        if(this.contains(FIELD_PSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题样式
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 标题样式，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEWizardStep pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 标题样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep pssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setPSSysCssId(null);
            this.setPSSysCssName(null);
        }
        else{
            this.setPSSysCssId(pSSysCss.getPSSysCssId());
            this.setPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定实体向导步骤的界面样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
     * @return
     */
    @JsonIgnore
    public String getPSSysCssName(){
        Object objValue = this.get(FIELD_PSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面样式表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCssNameDirty(){
        if(this.contains(FIELD_PSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEWizardStep pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;标题图片，指定实体向导步骤的标题图片资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 标题图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 标题图片  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageId(){
        Object objValue = this.get(FIELD_PSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageIdDirty(){
        if(this.contains(FIELD_PSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题图片
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 标题图片，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEWizardStep pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 标题图片，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep pssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setPSSysImageId(null);
            this.setPSSysImageName(null);
        }
        else{
            this.setPSSysImageId(pSSysImage.getPSSysImageId());
            this.setPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;标题图片，指定实体向导步骤的标题图片资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 标题图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 标题图片  
     * @return
     */
    @JsonIgnore
    public String getPSSysImageName(){
        Object objValue = this.get(FIELD_PSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 标题图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysImageNameDirty(){
        if(this.contains(FIELD_PSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题图片
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 标题图片，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEWizardStep pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>STEPACTION</B>&nbsp;向导步骤行为
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.WizardStepAction} 
     */
    public final static String FIELD_STEPACTION = "stepaction";

    /**
     * 设置 向导步骤行为
     * 
     * @param stepAction
     * 
     */
    @JsonProperty(FIELD_STEPACTION)
    public void setStepAction(String stepAction){
        this.set(FIELD_STEPACTION, stepAction);
    }
    
    /**
     * 获取 向导步骤行为  
     * @return
     */
    @JsonIgnore
    public String getStepAction(){
        Object objValue = this.get(FIELD_STEPACTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 向导步骤行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepActionDirty(){
        if(this.contains(FIELD_STEPACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 向导步骤行为
     */
    @JsonIgnore
    public void resetStepAction(){
        this.reset(FIELD_STEPACTION);
    }

    /**
     * 设置 向导步骤行为
     * <P>
     * 等同 {@link #setStepAction}
     * @param stepAction
     */
    @JsonIgnore
    public PSDEWizardStep stepaction(String stepAction){
        this.setStepAction(stepAction);
        return this;
    }

     /**
     * 设置 向导步骤行为
     * <P>
     * 等同 {@link #setStepAction}
     * @param stepAction
     */
    @JsonIgnore
    public PSDEWizardStep stepaction(net.ibizsys.psmodel.core.util.PSModelEnums.WizardStepAction[] stepAction){
        if(stepAction == null || stepAction.length == 0){
            this.setStepAction(null);
        }
        else{
            String _value = "";
            for(net.ibizsys.psmodel.core.util.PSModelEnums.WizardStepAction _item : stepAction){
                if(_value.length() > 0){
                    _value += ";";
                }
                _value += _item.value;
            }
            this.setStepAction(_value);
        }
        return this;
    }

    /**
     * <B>STEPTAG</B>&nbsp;步骤标识，指定实体向导步骤的标记，需在所在实体向导中具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成
     */
    public final static String FIELD_STEPTAG = "steptag";

    /**
     * 设置 步骤标识，详细说明：{@link #FIELD_STEPTAG}
     * 
     * @param stepTag
     * 
     */
    @JsonProperty(FIELD_STEPTAG)
    public void setStepTag(String stepTag){
        this.set(FIELD_STEPTAG, stepTag);
    }
    
    /**
     * 获取 步骤标识  
     * @return
     */
    @JsonIgnore
    public String getStepTag(){
        Object objValue = this.get(FIELD_STEPTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 步骤标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepTagDirty(){
        if(this.contains(FIELD_STEPTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 步骤标识
     */
    @JsonIgnore
    public void resetStepTag(){
        this.reset(FIELD_STEPTAG);
    }

    /**
     * 设置 步骤标识，详细说明：{@link #FIELD_STEPTAG}
     * <P>
     * 等同 {@link #setStepTag}
     * @param stepTag
     */
    @JsonIgnore
    public PSDEWizardStep steptag(String stepTag){
        this.setStepTag(stepTag);
        return this;
    }

    /**
     * <B>SUBTITLE</B>&nbsp;子标题，指定实体向导步骤的子标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SUBTITLE = "subtitle";

    /**
     * 设置 子标题，详细说明：{@link #FIELD_SUBTITLE}
     * 
     * @param subTitle
     * 
     */
    @JsonProperty(FIELD_SUBTITLE)
    public void setSubTitle(String subTitle){
        this.set(FIELD_SUBTITLE, subTitle);
    }
    
    /**
     * 获取 子标题  
     * @return
     */
    @JsonIgnore
    public String getSubTitle(){
        Object objValue = this.get(FIELD_SUBTITLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubTitleDirty(){
        if(this.contains(FIELD_SUBTITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题
     */
    @JsonIgnore
    public void resetSubTitle(){
        this.reset(FIELD_SUBTITLE);
    }

    /**
     * 设置 子标题，详细说明：{@link #FIELD_SUBTITLE}
     * <P>
     * 等同 {@link #setSubTitle}
     * @param subTitle
     */
    @JsonIgnore
    public PSDEWizardStep subtitle(String subTitle){
        this.setSubTitle(subTitle);
        return this;
    }

    /**
     * <B>SUBTITLEPSLANRESID</B>&nbsp;子标题语言资源，指定实体向导步骤的子标题的多语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_SUBTITLEPSLANRESID = "subtitlepslanresid";

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESID}
     * 
     * @param subTitlePSLanResId
     * 
     */
    @JsonProperty(FIELD_SUBTITLEPSLANRESID)
    public void setSubTitlePSLanResId(String subTitlePSLanResId){
        this.set(FIELD_SUBTITLEPSLANRESID, subTitlePSLanResId);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubTitlePSLanResId(){
        Object objValue = this.get(FIELD_SUBTITLEPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubTitlePSLanResIdDirty(){
        if(this.contains(FIELD_SUBTITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubTitlePSLanResId(){
        this.reset(FIELD_SUBTITLEPSLANRESID);
    }

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESID}
     * <P>
     * 等同 {@link #setSubTitlePSLanResId}
     * @param subTitlePSLanResId
     */
    @JsonIgnore
    public PSDEWizardStep subtitlepslanresid(String subTitlePSLanResId){
        this.setSubTitlePSLanResId(subTitlePSLanResId);
        return this;
    }

    /**
     * 设置 子标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEWizardStep subtitlepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSubTitlePSLanResId(null);
            this.setSubTitlePSLanResName(null);
        }
        else{
            this.setSubTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SUBTITLEPSLANRESNAME</B>&nbsp;子标题语言资源，指定实体向导步骤的子标题的多语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBTITLEPSLANRESID}
     */
    public final static String FIELD_SUBTITLEPSLANRESNAME = "subtitlepslanresname";

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESNAME}
     * 
     * @param subTitlePSLanResName
     * 
     */
    @JsonProperty(FIELD_SUBTITLEPSLANRESNAME)
    public void setSubTitlePSLanResName(String subTitlePSLanResName){
        this.set(FIELD_SUBTITLEPSLANRESNAME, subTitlePSLanResName);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubTitlePSLanResName(){
        Object objValue = this.get(FIELD_SUBTITLEPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubTitlePSLanResNameDirty(){
        if(this.contains(FIELD_SUBTITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubTitlePSLanResName(){
        this.reset(FIELD_SUBTITLEPSLANRESNAME);
    }

    /**
     * 设置 子标题语言资源，详细说明：{@link #FIELD_SUBTITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setSubTitlePSLanResName}
     * @param subTitlePSLanResName
     */
    @JsonIgnore
    public PSDEWizardStep subtitlepslanresname(String subTitlePSLanResName){
        this.setSubTitlePSLanResName(subTitlePSLanResName);
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
    public PSDEWizardStep updatedate(String updateDate){
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
    public PSDEWizardStep updateman(String updateMan){
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
    public PSDEWizardStep usercat(String userCat){
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
    public PSDEWizardStep usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEWizardStep usertag(String userTag){
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
    public PSDEWizardStep usertag2(String userTag2){
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
    public PSDEWizardStep usertag3(String userTag3){
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
    public PSDEWizardStep usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VISIBLELOGIC</B>&nbsp;可见逻辑
     */
    public final static String FIELD_VISIBLELOGIC = "visiblelogic";

    /**
     * 设置 可见逻辑
     * 
     * @param visibleLogic
     * 
     */
    @JsonProperty(FIELD_VISIBLELOGIC)
    public void setVisibleLogic(String visibleLogic){
        this.set(FIELD_VISIBLELOGIC, visibleLogic);
    }
    
    /**
     * 获取 可见逻辑  
     * @return
     */
    @JsonIgnore
    public String getVisibleLogic(){
        Object objValue = this.get(FIELD_VISIBLELOGIC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 可见逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVisibleLogicDirty(){
        if(this.contains(FIELD_VISIBLELOGIC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 可见逻辑
     */
    @JsonIgnore
    public void resetVisibleLogic(){
        this.reset(FIELD_VISIBLELOGIC);
    }

    /**
     * 设置 可见逻辑
     * <P>
     * 等同 {@link #setVisibleLogic}
     * @param visibleLogic
     */
    @JsonIgnore
    public PSDEWizardStep visiblelogic(String visibleLogic){
        this.setVisibleLogic(visibleLogic);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEWizardStepId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEWizardStepId(strValue);
    }

    @JsonIgnore
    public PSDEWizardStep id(String strValue){
        this.setPSDEWizardStepId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEWizardStep){
            PSDEWizardStep model = (PSDEWizardStep)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
