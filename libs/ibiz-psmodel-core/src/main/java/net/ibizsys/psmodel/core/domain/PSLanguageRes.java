package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSLANGUAGERES</B>语言资源 模型传输对象
 * <P>
 * 系统的多语言资源模型，其它模型在需要多语言使用场合引用语言资源，语言资源项为语言资源定义不同语言的内容
 */
public class PSLanguageRes extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSLanguageRes(){
    }      

    /**
     * <B>APPREFFLAG</B>&nbsp;应用引用标记
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_APPREFFLAG = "apprefflag";

    /**
     * 设置 应用引用标记
     * 
     * @param appRefFlag
     * 
     */
    @JsonProperty(FIELD_APPREFFLAG)
    public void setAppRefFlag(Integer appRefFlag){
        this.set(FIELD_APPREFFLAG, appRefFlag);
    }
    
    /**
     * 获取 应用引用标记  
     * @return
     */
    @JsonIgnore
    public Integer getAppRefFlag(){
        Object objValue = this.get(FIELD_APPREFFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 应用引用标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppRefFlagDirty(){
        if(this.contains(FIELD_APPREFFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用引用标记
     */
    @JsonIgnore
    public void resetAppRefFlag(){
        this.reset(FIELD_APPREFFLAG);
    }

    /**
     * 设置 应用引用标记
     * <P>
     * 等同 {@link #setAppRefFlag}
     * @param appRefFlag
     */
    @JsonIgnore
    public PSLanguageRes apprefflag(Integer appRefFlag){
        this.setAppRefFlag(appRefFlag);
        return this;
    }

     /**
     * 设置 应用引用标记
     * <P>
     * 等同 {@link #setAppRefFlag}
     * @param appRefFlag
     */
    @JsonIgnore
    public PSLanguageRes apprefflag(Boolean appRefFlag){
        if(appRefFlag == null){
            this.setAppRefFlag(null);
        }
        else{
            this.setAppRefFlag(appRefFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定语言资源的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSLanguageRes codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;内容，指定语言资源的默认内容，在未找到具体的语言定义时使用
     * <P>
     * 字符串：最大长度 1048576
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
    public PSLanguageRes content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENT2</B>&nbsp;长内容
     */
    public final static String FIELD_CONTENT2 = "content2";

    /**
     * 设置 长内容
     * 
     * @param content2
     * 
     */
    @JsonProperty(FIELD_CONTENT2)
    public void setContent2(String content2){
        this.set(FIELD_CONTENT2, content2);
    }
    
    /**
     * 获取 长内容  
     * @return
     */
    @JsonIgnore
    public String getContent2(){
        Object objValue = this.get(FIELD_CONTENT2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 长内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContent2Dirty(){
        if(this.contains(FIELD_CONTENT2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 长内容
     */
    @JsonIgnore
    public void resetContent2(){
        this.reset(FIELD_CONTENT2);
    }

    /**
     * 设置 长内容
     * <P>
     * 等同 {@link #setContent2}
     * @param content2
     */
    @JsonIgnore
    public PSLanguageRes content2(String content2){
        this.setContent2(content2);
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
    public PSLanguageRes createdate(String createDate){
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
    public PSLanguageRes createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>LANRESTAG</B>&nbsp;语言资源标识，指定语言资源标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_LANRESTAG = "lanrestag";

    /**
     * 设置 语言资源标识，详细说明：{@link #FIELD_LANRESTAG}
     * 
     * @param lanResTag
     * 
     */
    @JsonProperty(FIELD_LANRESTAG)
    public void setLanResTag(String lanResTag){
        this.set(FIELD_LANRESTAG, lanResTag);
    }
    
    /**
     * 获取 语言资源标识  
     * @return
     */
    @JsonIgnore
    public String getLanResTag(){
        Object objValue = this.get(FIELD_LANRESTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言资源标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLanResTagDirty(){
        if(this.contains(FIELD_LANRESTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言资源标识
     */
    @JsonIgnore
    public void resetLanResTag(){
        this.reset(FIELD_LANRESTAG);
    }

    /**
     * 设置 语言资源标识，详细说明：{@link #FIELD_LANRESTAG}
     * <P>
     * 等同 {@link #setLanResTag}
     * @param lanResTag
     */
    @JsonIgnore
    public PSLanguageRes lanrestag(String lanResTag){
        this.setLanResTag(lanResTag);
        return this;
    }

    /**
     * <B>LANRESTYPE</B>&nbsp;资源类型，指定语言资源的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.LanResType} 
     */
    public final static String FIELD_LANRESTYPE = "lanrestype";

    /**
     * 设置 资源类型，详细说明：{@link #FIELD_LANRESTYPE}
     * 
     * @param lanResType
     * 
     */
    @JsonProperty(FIELD_LANRESTYPE)
    public void setLanResType(String lanResType){
        this.set(FIELD_LANRESTYPE, lanResType);
    }
    
    /**
     * 获取 资源类型  
     * @return
     */
    @JsonIgnore
    public String getLanResType(){
        Object objValue = this.get(FIELD_LANRESTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLanResTypeDirty(){
        if(this.contains(FIELD_LANRESTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源类型
     */
    @JsonIgnore
    public void resetLanResType(){
        this.reset(FIELD_LANRESTYPE);
    }

    /**
     * 设置 资源类型，详细说明：{@link #FIELD_LANRESTYPE}
     * <P>
     * 等同 {@link #setLanResType}
     * @param lanResType
     */
    @JsonIgnore
    public PSLanguageRes lanrestype(String lanResType){
        this.setLanResType(lanResType);
        return this;
    }

     /**
     * 设置 资源类型，详细说明：{@link #FIELD_LANRESTYPE}
     * <P>
     * 等同 {@link #setLanResType}
     * @param lanResType
     */
    @JsonIgnore
    public PSLanguageRes lanrestype(net.ibizsys.psmodel.core.util.PSModelEnums.LanResType lanResType){
        if(lanResType == null){
            this.setLanResType(null);
        }
        else{
            this.setLanResType(lanResType.value);
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
    public PSLanguageRes memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSLanguageRes psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSLanguageRes psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSLanguageRes psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFId
     * 
     */
    @JsonProperty(FIELD_PSDEFID)
    public void setPSDEFId(String pSDEFId){
        this.set(FIELD_PSDEFID, pSDEFId);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFId(){
        Object objValue = this.get(FIELD_PSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIdDirty(){
        if(this.contains(FIELD_PSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFId(){
        this.reset(FIELD_PSDEFID);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSLanguageRes psdefid(String pSDEFId){
        this.setPSDEFId(pSDEFId);
        return this;
    }

    /**
     * 设置 实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSLanguageRes psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
     * 
     * @param pSDEFName
     * 
     */
    @JsonProperty(FIELD_PSDEFNAME)
    public void setPSDEFName(String pSDEFName){
        this.set(FIELD_PSDEFNAME, pSDEFName);
    }
    
    /**
     * 获取 实体属性  
     * @return
     */
    @JsonIgnore
    public String getPSDEFName(){
        Object objValue = this.get(FIELD_PSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFNameDirty(){
        if(this.contains(FIELD_PSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性
     */
    @JsonIgnore
    public void resetPSDEFName(){
        this.reset(FIELD_PSDEFNAME);
    }

    /**
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSLanguageRes psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSLanguageRes psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSLanguageRes psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
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
     * 判断 实体 是否指定值，包括空值
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
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSLanguageRes psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图
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
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSLanguageRes psdeviewbaseid(String pSDEViewBaseId){
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
    public PSLanguageRes psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图
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
     * 设置 实体视图
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSLanguageRes psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>PSLANGUAGERESID</B>&nbsp;语言资源标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSLANGUAGERESID = "pslanguageresid";

    /**
     * 设置 语言资源标识
     * 
     * @param pSLanguageResId
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGERESID)
    public void setPSLanguageResId(String pSLanguageResId){
        this.set(FIELD_PSLANGUAGERESID, pSLanguageResId);
    }
    
    /**
     * 获取 语言资源标识  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageResId(){
        Object objValue = this.get(FIELD_PSLANGUAGERESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 语言资源标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageResIdDirty(){
        if(this.contains(FIELD_PSLANGUAGERESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 语言资源标识
     */
    @JsonIgnore
    public void resetPSLanguageResId(){
        this.reset(FIELD_PSLANGUAGERESID);
    }

    /**
     * 设置 语言资源标识
     * <P>
     * 等同 {@link #setPSLanguageResId}
     * @param pSLanguageResId
     */
    @JsonIgnore
    public PSLanguageRes pslanguageresid(String pSLanguageResId){
        this.setPSLanguageResId(pSLanguageResId);
        return this;
    }

    /**
     * <B>PSLANGUAGERESNAME</B>&nbsp;资源名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSLANGUAGERESNAME = "pslanguageresname";

    /**
     * 设置 资源名称
     * 
     * @param pSLanguageResName
     * 
     */
    @JsonProperty(FIELD_PSLANGUAGERESNAME)
    public void setPSLanguageResName(String pSLanguageResName){
        this.set(FIELD_PSLANGUAGERESNAME, pSLanguageResName);
    }
    
    /**
     * 获取 资源名称  
     * @return
     */
    @JsonIgnore
    public String getPSLanguageResName(){
        Object objValue = this.get(FIELD_PSLANGUAGERESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSLanguageResNameDirty(){
        if(this.contains(FIELD_PSLANGUAGERESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源名称
     */
    @JsonIgnore
    public void resetPSLanguageResName(){
        this.reset(FIELD_PSLANGUAGERESNAME);
    }

    /**
     * 设置 资源名称
     * <P>
     * 等同 {@link #setPSLanguageResName}
     * @param pSLanguageResName
     */
    @JsonIgnore
    public PSLanguageRes pslanguageresname(String pSLanguageResName){
        this.setPSLanguageResName(pSLanguageResName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSLanguageResName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSLanguageResName(strName);
    }

    @JsonIgnore
    public PSLanguageRes name(String strName){
        this.setPSLanguageResName(strName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定语言资源所在的系统模块
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
    public PSLanguageRes psmoduleid(String pSModuleId){
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
    public PSLanguageRes psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定语言资源所在的系统模块
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
    public PSLanguageRes psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;系统应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 系统应用
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 系统应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 系统应用
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSLanguageRes pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 系统应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSLanguageRes pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSLanguageRes pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSLANRESID</B>&nbsp;预置语言资源
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSLANRESID = "pssyslanresid";

    /**
     * 设置 预置语言资源
     * 
     * @param pSSysLanResId
     * 
     */
    @JsonProperty(FIELD_PSSYSLANRESID)
    public void setPSSysLanResId(String pSSysLanResId){
        this.set(FIELD_PSSYSLANRESID, pSSysLanResId);
    }
    
    /**
     * 获取 预置语言资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysLanResId(){
        Object objValue = this.get(FIELD_PSSYSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysLanResIdDirty(){
        if(this.contains(FIELD_PSSYSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置语言资源
     */
    @JsonIgnore
    public void resetPSSysLanResId(){
        this.reset(FIELD_PSSYSLANRESID);
    }

    /**
     * 设置 预置语言资源
     * <P>
     * 等同 {@link #setPSSysLanResId}
     * @param pSSysLanResId
     */
    @JsonIgnore
    public PSLanguageRes pssyslanresid(String pSSysLanResId){
        this.setPSSysLanResId(pSSysLanResId);
        return this;
    }

    /**
     * <B>PSSYSLANRESNAME</B>&nbsp;预置语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSLANRESID}
     */
    public final static String FIELD_PSSYSLANRESNAME = "pssyslanresname";

    /**
     * 设置 预置语言资源
     * 
     * @param pSSysLanResName
     * 
     */
    @JsonProperty(FIELD_PSSYSLANRESNAME)
    public void setPSSysLanResName(String pSSysLanResName){
        this.set(FIELD_PSSYSLANRESNAME, pSSysLanResName);
    }
    
    /**
     * 获取 预置语言资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysLanResName(){
        Object objValue = this.get(FIELD_PSSYSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysLanResNameDirty(){
        if(this.contains(FIELD_PSSYSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置语言资源
     */
    @JsonIgnore
    public void resetPSSysLanResName(){
        this.reset(FIELD_PSSYSLANRESNAME);
    }

    /**
     * 设置 预置语言资源
     * <P>
     * 等同 {@link #setPSSysLanResName}
     * @param pSSysLanResName
     */
    @JsonIgnore
    public PSLanguageRes pssyslanresname(String pSSysLanResName){
        this.setPSSysLanResName(pSSysLanResName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWorkflow} 
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 工作流
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWFId(){
        Object objValue = this.get(FIELD_PSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFIdDirty(){
        if(this.contains(FIELD_PSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 工作流
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSLanguageRes pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * 设置 工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSLanguageRes pswfid(PSWorkflow pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWFId(null);
            this.setPSWFName(null);
        }
        else{
            this.setPSWFId(pSWorkflow.getPSWorkflowId());
            this.setPSWFName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    /**
     * <B>PSWFNAME</B>&nbsp;工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFID}
     */
    public final static String FIELD_PSWFNAME = "pswfname";

    /**
     * 设置 工作流
     * 
     * @param pSWFName
     * 
     */
    @JsonProperty(FIELD_PSWFNAME)
    public void setPSWFName(String pSWFName){
        this.set(FIELD_PSWFNAME, pSWFName);
    }
    
    /**
     * 获取 工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWFName(){
        Object objValue = this.get(FIELD_PSWFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFNameDirty(){
        if(this.contains(FIELD_PSWFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWFName(){
        this.reset(FIELD_PSWFNAME);
    }

    /**
     * 设置 工作流
     * <P>
     * 等同 {@link #setPSWFName}
     * @param pSWFName
     */
    @JsonIgnore
    public PSLanguageRes pswfname(String pSWFName){
        this.setPSWFName(pSWFName);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFVersion} 
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSLanguageRes pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * 设置 工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSLanguageRes pswfversionid(PSWFVersion pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionName(){
        Object objValue = this.get(FIELD_PSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionNameDirty(){
        if(this.contains(FIELD_PSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSLanguageRes pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>SHORTTAG</B>&nbsp;短标识，指定语言资源的短标识，短标识一般使用数字序列，语言资源标识会按照一定的格式进行组织，具有可读性但长度普遍偏长，在对内容体积敏感的应用场景中可使用短标识
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_SHORTTAG = "shorttag";

    /**
     * 设置 短标识，详细说明：{@link #FIELD_SHORTTAG}
     * 
     * @param shortTag
     * 
     */
    @JsonProperty(FIELD_SHORTTAG)
    public void setShortTag(String shortTag){
        this.set(FIELD_SHORTTAG, shortTag);
    }
    
    /**
     * 获取 短标识  
     * @return
     */
    @JsonIgnore
    public String getShortTag(){
        Object objValue = this.get(FIELD_SHORTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 短标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShortTagDirty(){
        if(this.contains(FIELD_SHORTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 短标识
     */
    @JsonIgnore
    public void resetShortTag(){
        this.reset(FIELD_SHORTTAG);
    }

    /**
     * 设置 短标识，详细说明：{@link #FIELD_SHORTTAG}
     * <P>
     * 等同 {@link #setShortTag}
     * @param shortTag
     */
    @JsonIgnore
    public PSLanguageRes shorttag(String shortTag){
        this.setShortTag(shortTag);
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
    public PSLanguageRes updatedate(String updateDate){
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
    public PSLanguageRes updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 400
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 用户标识
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 用户标识  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSLanguageRes userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSLanguageResId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSLanguageResId(strValue);
    }

    @JsonIgnore
    public PSLanguageRes id(String strValue){
        this.setPSLanguageResId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSLanguageRes){
            PSLanguageRes model = (PSLanguageRes)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
