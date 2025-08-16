package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSPDTVIEW</B>系统预置视图 模型传输对象
 * <P>
 * 系统的预置视图模型是预先定义的占位视图，用于满足某些逻辑在定义时对视图的需求（只是需要这么一个视图，具体是哪个可由用户决定）
 */
public class PSSysPDTView extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysPDTView(){
    }      

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_CAPPSLANRESID = "cappslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * 
     * @param capPSLanResId
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESID)
    public void setCapPSLanResId(String capPSLanResId){
        this.set(FIELD_CAPPSLANRESID, capPSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResId(){
        Object objValue = this.get(FIELD_CAPPSLANRESID);
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
    public boolean isCapPSLanResIdDirty(){
        if(this.contains(FIELD_CAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResId(){
        this.reset(FIELD_CAPPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESID}
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param capPSLanResId
     */
    @JsonIgnore
    public PSSysPDTView cappslanresid(String capPSLanResId){
        this.setCapPSLanResId(capPSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSSysPDTView cappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setCapPSLanResId(null);
            this.setCapPSLanResName(null);
        }
        else{
            this.setCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CAPPSLANRESID}
     */
    public final static String FIELD_CAPPSLANRESNAME = "cappslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * 
     * @param capPSLanResName
     * 
     */
    @JsonProperty(FIELD_CAPPSLANRESNAME)
    public void setCapPSLanResName(String capPSLanResName){
        this.set(FIELD_CAPPSLANRESNAME, capPSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getCapPSLanResName(){
        Object objValue = this.get(FIELD_CAPPSLANRESNAME);
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
    public boolean isCapPSLanResNameDirty(){
        if(this.contains(FIELD_CAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetCapPSLanResName(){
        this.reset(FIELD_CAPPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_CAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setCapPSLanResName}
     * @param capPSLanResName
     */
    @JsonIgnore
    public PSSysPDTView cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统预置视图的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysPDTView codename(String codeName){
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
    public PSSysPDTView createdate(String createDate){
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
    public PSSysPDTView createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FROMDEVIEWFLAG</B>&nbsp;实体视图重定向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FROMDEVIEWFLAG = "fromdeviewflag";

    /**
     * 设置 实体视图重定向
     * 
     * @param fromDEViewFlag
     * 
     */
    @JsonProperty(FIELD_FROMDEVIEWFLAG)
    public void setFromDEViewFlag(Integer fromDEViewFlag){
        this.set(FIELD_FROMDEVIEWFLAG, fromDEViewFlag);
    }
    
    /**
     * 获取 实体视图重定向  
     * @return
     */
    @JsonIgnore
    public Integer getFromDEViewFlag(){
        Object objValue = this.get(FIELD_FROMDEVIEWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体视图重定向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFromDEViewFlagDirty(){
        if(this.contains(FIELD_FROMDEVIEWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图重定向
     */
    @JsonIgnore
    public void resetFromDEViewFlag(){
        this.reset(FIELD_FROMDEVIEWFLAG);
    }

    /**
     * 设置 实体视图重定向
     * <P>
     * 等同 {@link #setFromDEViewFlag}
     * @param fromDEViewFlag
     */
    @JsonIgnore
    public PSSysPDTView fromdeviewflag(Integer fromDEViewFlag){
        this.setFromDEViewFlag(fromDEViewFlag);
        return this;
    }

     /**
     * 设置 实体视图重定向
     * <P>
     * 等同 {@link #setFromDEViewFlag}
     * @param fromDEViewFlag
     */
    @JsonIgnore
    public PSSysPDTView fromdeviewflag(Boolean fromDEViewFlag){
        if(fromDEViewFlag == null){
            this.setFromDEViewFlag(null);
        }
        else{
            this.setFromDEViewFlag(fromDEViewFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysPDTView memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBPSDEVIEWID</B>&nbsp;实体移动端视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MOBPSDEVIEWID = "mobpsdeviewid";

    /**
     * 设置 实体移动端视图
     * 
     * @param mobPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWID)
    public void setMobPSDEViewId(String mobPSDEViewId){
        this.set(FIELD_MOBPSDEVIEWID, mobPSDEViewId);
    }
    
    /**
     * 获取 实体移动端视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewId(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体移动端视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewIdDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体移动端视图
     */
    @JsonIgnore
    public void resetMobPSDEViewId(){
        this.reset(FIELD_MOBPSDEVIEWID);
    }

    /**
     * 设置 实体移动端视图
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param mobPSDEViewId
     */
    @JsonIgnore
    public PSSysPDTView mobpsdeviewid(String mobPSDEViewId){
        this.setMobPSDEViewId(mobPSDEViewId);
        return this;
    }

    /**
     * 设置 实体移动端视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMobPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysPDTView mobpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMobPSDEViewId(null);
            this.setMobPSDEViewName(null);
            this.setMobViewCodeName(null);
            this.setMobViewPSDEId(null);
        }
        else{
            this.setMobPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMobPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
            this.setMobViewCodeName(pSDEViewBase.getCodeName());
            this.setMobViewPSDEId(pSDEViewBase.getPSDEId());
        }
        return this;
    }

    /**
     * <B>MOBPSDEVIEWNAME</B>&nbsp;实体移动端视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBPSDEVIEWNAME = "mobpsdeviewname";

    /**
     * 设置 实体移动端视图
     * 
     * @param mobPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MOBPSDEVIEWNAME)
    public void setMobPSDEViewName(String mobPSDEViewName){
        this.set(FIELD_MOBPSDEVIEWNAME, mobPSDEViewName);
    }
    
    /**
     * 获取 实体移动端视图  
     * @return
     */
    @JsonIgnore
    public String getMobPSDEViewName(){
        Object objValue = this.get(FIELD_MOBPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体移动端视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobPSDEViewNameDirty(){
        if(this.contains(FIELD_MOBPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体移动端视图
     */
    @JsonIgnore
    public void resetMobPSDEViewName(){
        this.reset(FIELD_MOBPSDEVIEWNAME);
    }

    /**
     * 设置 实体移动端视图
     * <P>
     * 等同 {@link #setMobPSDEViewName}
     * @param mobPSDEViewName
     */
    @JsonIgnore
    public PSSysPDTView mobpsdeviewname(String mobPSDEViewName){
        this.setMobPSDEViewName(mobPSDEViewName);
        return this;
    }

    /**
     * <B>MOBVIEWCODENAME</B>&nbsp;移动端视图代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBVIEWCODENAME = "mobviewcodename";

    /**
     * 设置 移动端视图代码标识
     * 
     * @param mobViewCodeName
     * 
     */
    @JsonProperty(FIELD_MOBVIEWCODENAME)
    public void setMobViewCodeName(String mobViewCodeName){
        this.set(FIELD_MOBVIEWCODENAME, mobViewCodeName);
    }
    
    /**
     * 获取 移动端视图代码标识  
     * @return
     */
    @JsonIgnore
    public String getMobViewCodeName(){
        Object objValue = this.get(FIELD_MOBVIEWCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端视图代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobViewCodeNameDirty(){
        if(this.contains(FIELD_MOBVIEWCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端视图代码标识
     */
    @JsonIgnore
    public void resetMobViewCodeName(){
        this.reset(FIELD_MOBVIEWCODENAME);
    }

    /**
     * 设置 移动端视图代码标识
     * <P>
     * 等同 {@link #setMobViewCodeName}
     * @param mobViewCodeName
     */
    @JsonIgnore
    public PSSysPDTView mobviewcodename(String mobViewCodeName){
        this.setMobViewCodeName(mobViewCodeName);
        return this;
    }

    /**
     * <B>MOBVIEWPSDEID</B>&nbsp;移动端视图实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MOBPSDEVIEWID}
     */
    public final static String FIELD_MOBVIEWPSDEID = "mobviewpsdeid";

    /**
     * 设置 移动端视图实体标识
     * 
     * @param mobViewPSDEId
     * 
     */
    @JsonProperty(FIELD_MOBVIEWPSDEID)
    public void setMobViewPSDEId(String mobViewPSDEId){
        this.set(FIELD_MOBVIEWPSDEID, mobViewPSDEId);
    }
    
    /**
     * 获取 移动端视图实体标识  
     * @return
     */
    @JsonIgnore
    public String getMobViewPSDEId(){
        Object objValue = this.get(FIELD_MOBVIEWPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端视图实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobViewPSDEIdDirty(){
        if(this.contains(FIELD_MOBVIEWPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端视图实体标识
     */
    @JsonIgnore
    public void resetMobViewPSDEId(){
        this.reset(FIELD_MOBVIEWPSDEID);
    }

    /**
     * 设置 移动端视图实体标识
     * <P>
     * 等同 {@link #setMobViewPSDEId}
     * @param mobViewPSDEId
     */
    @JsonIgnore
    public PSSysPDTView mobviewpsdeid(String mobViewPSDEId){
        this.setMobViewPSDEId(mobViewPSDEId);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图，指定为预置视图提供功能的实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSSysPDTView psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSSysPDTView psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
            this.setViewCodeName(null);
            this.setViewPSDEId(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
            this.setViewCodeName(pSDEViewBase.getCodeName());
            this.setViewPSDEId(pSDEViewBase.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图，指定为预置视图提供功能的实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSSysPDTView psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统预置视图所在的系统模块
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
    public PSSysPDTView psmoduleid(String pSModuleId){
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
    public PSSysPDTView psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统预置视图所在的系统模块
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
    public PSSysPDTView psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSPDTVIEWID</B>&nbsp;云平台预置视图，指定平台定义的预置视图
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSPDTVIEWID = "pspdtviewid";

    /**
     * 设置 云平台预置视图，详细说明：{@link #FIELD_PSPDTVIEWID}
     * 
     * @param pSPDTViewId
     * 
     */
    @JsonProperty(FIELD_PSPDTVIEWID)
    public void setPSPDTViewId(String pSPDTViewId){
        this.set(FIELD_PSPDTVIEWID, pSPDTViewId);
    }
    
    /**
     * 获取 云平台预置视图  
     * @return
     */
    @JsonIgnore
    public String getPSPDTViewId(){
        Object objValue = this.get(FIELD_PSPDTVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPDTViewIdDirty(){
        if(this.contains(FIELD_PSPDTVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台预置视图
     */
    @JsonIgnore
    public void resetPSPDTViewId(){
        this.reset(FIELD_PSPDTVIEWID);
    }

    /**
     * 设置 云平台预置视图，详细说明：{@link #FIELD_PSPDTVIEWID}
     * <P>
     * 等同 {@link #setPSPDTViewId}
     * @param pSPDTViewId
     */
    @JsonIgnore
    public PSSysPDTView pspdtviewid(String pSPDTViewId){
        this.setPSPDTViewId(pSPDTViewId);
        return this;
    }

    /**
     * <B>PSPDTVIEWNAME</B>&nbsp;云平台预置视图，指定平台定义的预置视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSPDTVIEWID}
     */
    public final static String FIELD_PSPDTVIEWNAME = "pspdtviewname";

    /**
     * 设置 云平台预置视图，详细说明：{@link #FIELD_PSPDTVIEWNAME}
     * 
     * @param pSPDTViewName
     * 
     */
    @JsonProperty(FIELD_PSPDTVIEWNAME)
    public void setPSPDTViewName(String pSPDTViewName){
        this.set(FIELD_PSPDTVIEWNAME, pSPDTViewName);
    }
    
    /**
     * 获取 云平台预置视图  
     * @return
     */
    @JsonIgnore
    public String getPSPDTViewName(){
        Object objValue = this.get(FIELD_PSPDTVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云平台预置视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSPDTViewNameDirty(){
        if(this.contains(FIELD_PSPDTVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云平台预置视图
     */
    @JsonIgnore
    public void resetPSPDTViewName(){
        this.reset(FIELD_PSPDTVIEWNAME);
    }

    /**
     * 设置 云平台预置视图，详细说明：{@link #FIELD_PSPDTVIEWNAME}
     * <P>
     * 等同 {@link #setPSPDTViewName}
     * @param pSPDTViewName
     */
    @JsonIgnore
    public PSSysPDTView pspdtviewname(String pSPDTViewName){
        this.setPSPDTViewName(pSPDTViewName);
        return this;
    }

    /**
     * <B>PSSYSPDTVIEWID</B>&nbsp;系统预置视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSPDTVIEWID = "pssyspdtviewid";

    /**
     * 设置 系统预置视图标识
     * 
     * @param pSSysPDTViewId
     * 
     */
    @JsonProperty(FIELD_PSSYSPDTVIEWID)
    public void setPSSysPDTViewId(String pSSysPDTViewId){
        this.set(FIELD_PSSYSPDTVIEWID, pSSysPDTViewId);
    }
    
    /**
     * 获取 系统预置视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysPDTViewId(){
        Object objValue = this.get(FIELD_PSSYSPDTVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPDTViewIdDirty(){
        if(this.contains(FIELD_PSSYSPDTVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置视图标识
     */
    @JsonIgnore
    public void resetPSSysPDTViewId(){
        this.reset(FIELD_PSSYSPDTVIEWID);
    }

    /**
     * 设置 系统预置视图标识
     * <P>
     * 等同 {@link #setPSSysPDTViewId}
     * @param pSSysPDTViewId
     */
    @JsonIgnore
    public PSSysPDTView pssyspdtviewid(String pSSysPDTViewId){
        this.setPSSysPDTViewId(pSSysPDTViewId);
        return this;
    }

    /**
     * <B>PSSYSPDTVIEWNAME</B>&nbsp;预置视图名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSPDTVIEWNAME = "pssyspdtviewname";

    /**
     * 设置 预置视图名称
     * 
     * @param pSSysPDTViewName
     * 
     */
    @JsonProperty(FIELD_PSSYSPDTVIEWNAME)
    public void setPSSysPDTViewName(String pSSysPDTViewName){
        this.set(FIELD_PSSYSPDTVIEWNAME, pSSysPDTViewName);
    }
    
    /**
     * 获取 预置视图名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysPDTViewName(){
        Object objValue = this.get(FIELD_PSSYSPDTVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPDTViewNameDirty(){
        if(this.contains(FIELD_PSSYSPDTVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置视图名称
     */
    @JsonIgnore
    public void resetPSSysPDTViewName(){
        this.reset(FIELD_PSSYSPDTVIEWNAME);
    }

    /**
     * 设置 预置视图名称
     * <P>
     * 等同 {@link #setPSSysPDTViewName}
     * @param pSSysPDTViewName
     */
    @JsonIgnore
    public PSSysPDTView pssyspdtviewname(String pSSysPDTViewName){
        this.setPSSysPDTViewName(pSSysPDTViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysPDTViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysPDTViewName(strName);
    }

    @JsonIgnore
    public PSSysPDTView name(String strName){
        this.setPSSysPDTViewName(strName);
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
    public PSSysPDTView updatedate(String updateDate){
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
    public PSSysPDTView updateman(String updateMan){
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
    public PSSysPDTView usercat(String userCat){
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
    public PSSysPDTView usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysPDTView usertag(String userTag){
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
    public PSSysPDTView usertag2(String userTag2){
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
    public PSSysPDTView usertag3(String userTag3){
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
    public PSSysPDTView usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWCODENAME</B>&nbsp;视图代码标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_VIEWCODENAME = "viewcodename";

    /**
     * 设置 视图代码标识
     * 
     * @param viewCodeName
     * 
     */
    @JsonProperty(FIELD_VIEWCODENAME)
    public void setViewCodeName(String viewCodeName){
        this.set(FIELD_VIEWCODENAME, viewCodeName);
    }
    
    /**
     * 获取 视图代码标识  
     * @return
     */
    @JsonIgnore
    public String getViewCodeName(){
        Object objValue = this.get(FIELD_VIEWCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewCodeNameDirty(){
        if(this.contains(FIELD_VIEWCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图代码标识
     */
    @JsonIgnore
    public void resetViewCodeName(){
        this.reset(FIELD_VIEWCODENAME);
    }

    /**
     * 设置 视图代码标识
     * <P>
     * 等同 {@link #setViewCodeName}
     * @param viewCodeName
     */
    @JsonIgnore
    public PSSysPDTView viewcodename(String viewCodeName){
        this.setViewCodeName(viewCodeName);
        return this;
    }

    /**
     * <B>VIEWPSDEID</B>&nbsp;视图实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_VIEWPSDEID = "viewpsdeid";

    /**
     * 设置 视图实体标识
     * 
     * @param viewPSDEId
     * 
     */
    @JsonProperty(FIELD_VIEWPSDEID)
    public void setViewPSDEId(String viewPSDEId){
        this.set(FIELD_VIEWPSDEID, viewPSDEId);
    }
    
    /**
     * 获取 视图实体标识  
     * @return
     */
    @JsonIgnore
    public String getViewPSDEId(){
        Object objValue = this.get(FIELD_VIEWPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewPSDEIdDirty(){
        if(this.contains(FIELD_VIEWPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图实体标识
     */
    @JsonIgnore
    public void resetViewPSDEId(){
        this.reset(FIELD_VIEWPSDEID);
    }

    /**
     * 设置 视图实体标识
     * <P>
     * 等同 {@link #setViewPSDEId}
     * @param viewPSDEId
     */
    @JsonIgnore
    public PSSysPDTView viewpsdeid(String viewPSDEId){
        this.setViewPSDEId(viewPSDEId);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysPDTViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysPDTViewId(strValue);
    }

    @JsonIgnore
    public PSSysPDTView id(String strValue){
        this.setPSSysPDTViewId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysPDTView){
            PSSysPDTView model = (PSSysPDTView)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
