package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEFINPUTTIP</B>实体属性输入提示 模型传输对象
 * <P>
 * 属性输入提示信息模型，定义属性在输入时提供的提示信息，支持静态及来至输入提示集合的动态信息
 */
public class PSDEFInputTip extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFInputTip(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定输入提示的代码标识，需要在所在的实体属性中具有唯一性
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
    public PSDEFInputTip codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENT</B>&nbsp;HTML内容，指定属性输入提示的HTML格式内容
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_CONTENT}
     * 
     * @param content
     * 
     */
    @JsonProperty(FIELD_CONTENT)
    public void setContent(String content){
        this.set(FIELD_CONTENT, content);
    }
    
    /**
     * 获取 HTML内容  
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
     * 判断 HTML内容 是否指定值，包括空值
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
     * 重置 HTML内容
     */
    @JsonIgnore
    public void resetContent(){
        this.reset(FIELD_CONTENT);
    }

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_CONTENT}
     * <P>
     * 等同 {@link #setContent}
     * @param content
     */
    @JsonIgnore
    public PSDEFInputTip content(String content){
        this.setContent(content);
        return this;
    }

    /**
     * <B>CONTENTPSLANRESID</B>&nbsp;内容语言资源，指定属性输入提示内容的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
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
    public PSDEFInputTip contentpslanresid(String contentPSLanResId){
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
    public PSDEFInputTip contentpslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CONTENTPSLANRESNAME</B>&nbsp;内容语言资源，指定属性输入提示内容的多语言资源对象
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
    public PSDEFInputTip contentpslanresname(String contentPSLanResName){
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
    public PSDEFInputTip createdate(String createDate){
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
    public PSDEFInputTip createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认提示，指定属性输入提示是否为所在属性的默认提示，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认提示，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认提示  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认提示
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认提示，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEFInputTip defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认提示，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEFInputTip defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLECLOSE</B>&nbsp;支持关闭操作，指定属性输入提示是否支持关闭，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECLOSE = "enableclose";

    /**
     * 设置 支持关闭操作，详细说明：{@link #FIELD_ENABLECLOSE}
     * 
     * @param enableClose
     * 
     */
    @JsonProperty(FIELD_ENABLECLOSE)
    public void setEnableClose(Integer enableClose){
        this.set(FIELD_ENABLECLOSE, enableClose);
    }
    
    /**
     * 获取 支持关闭操作  
     * @return
     */
    @JsonIgnore
    public Integer getEnableClose(){
        Object objValue = this.get(FIELD_ENABLECLOSE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持关闭操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCloseDirty(){
        if(this.contains(FIELD_ENABLECLOSE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持关闭操作
     */
    @JsonIgnore
    public void resetEnableClose(){
        this.reset(FIELD_ENABLECLOSE);
    }

    /**
     * 设置 支持关闭操作，详细说明：{@link #FIELD_ENABLECLOSE}
     * <P>
     * 等同 {@link #setEnableClose}
     * @param enableClose
     */
    @JsonIgnore
    public PSDEFInputTip enableclose(Integer enableClose){
        this.setEnableClose(enableClose);
        return this;
    }

     /**
     * 设置 支持关闭操作，详细说明：{@link #FIELD_ENABLECLOSE}
     * <P>
     * 等同 {@link #setEnableClose}
     * @param enableClose
     */
    @JsonIgnore
    public PSDEFInputTip enableclose(Boolean enableClose){
        if(enableClose == null){
            this.setEnableClose(null);
        }
        else{
            this.setEnableClose(enableClose?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEFInputTip memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOREURL</B>&nbsp;更多链接，指定属性输入提示的更多信息链接地址
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_MOREURL = "moreurl";

    /**
     * 设置 更多链接，详细说明：{@link #FIELD_MOREURL}
     * 
     * @param moreUrl
     * 
     */
    @JsonProperty(FIELD_MOREURL)
    public void setMoreUrl(String moreUrl){
        this.set(FIELD_MOREURL, moreUrl);
    }
    
    /**
     * 获取 更多链接  
     * @return
     */
    @JsonIgnore
    public String getMoreUrl(){
        Object objValue = this.get(FIELD_MOREURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更多链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMoreUrlDirty(){
        if(this.contains(FIELD_MOREURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更多链接
     */
    @JsonIgnore
    public void resetMoreUrl(){
        this.reset(FIELD_MOREURL);
    }

    /**
     * 设置 更多链接，详细说明：{@link #FIELD_MOREURL}
     * <P>
     * 等同 {@link #setMoreUrl}
     * @param moreUrl
     */
    @JsonIgnore
    public PSDEFInputTip moreurl(String moreUrl){
        this.setMoreUrl(moreUrl);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定属性输入提示所在的实体属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEFInputTip psdefid(String pSDEFId){
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
    public PSDEFInputTip psdefid(PSDEField pSDEField){
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
     * <B>PSDEFINPUTTIPID</B>&nbsp;属性输入提示标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFINPUTTIPID = "psdefinputtipid";

    /**
     * 设置 属性输入提示标识
     * 
     * @param pSDEFInputTipId
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPID)
    public void setPSDEFInputTipId(String pSDEFInputTipId){
        this.set(FIELD_PSDEFINPUTTIPID, pSDEFInputTipId);
    }
    
    /**
     * 获取 属性输入提示标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipId(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性输入提示标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipIdDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性输入提示标识
     */
    @JsonIgnore
    public void resetPSDEFInputTipId(){
        this.reset(FIELD_PSDEFINPUTTIPID);
    }

    /**
     * 设置 属性输入提示标识
     * <P>
     * 等同 {@link #setPSDEFInputTipId}
     * @param pSDEFInputTipId
     */
    @JsonIgnore
    public PSDEFInputTip psdefinputtipid(String pSDEFInputTipId){
        this.setPSDEFInputTipId(pSDEFInputTipId);
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPNAME</B>&nbsp;属性输入提示名称，指定属性输入提示的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFINPUTTIPNAME = "psdefinputtipname";

    /**
     * 设置 属性输入提示名称，详细说明：{@link #FIELD_PSDEFINPUTTIPNAME}
     * 
     * @param pSDEFInputTipName
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPNAME)
    public void setPSDEFInputTipName(String pSDEFInputTipName){
        this.set(FIELD_PSDEFINPUTTIPNAME, pSDEFInputTipName);
    }
    
    /**
     * 获取 属性输入提示名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipName(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性输入提示名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipNameDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性输入提示名称
     */
    @JsonIgnore
    public void resetPSDEFInputTipName(){
        this.reset(FIELD_PSDEFINPUTTIPNAME);
    }

    /**
     * 设置 属性输入提示名称，详细说明：{@link #FIELD_PSDEFINPUTTIPNAME}
     * <P>
     * 等同 {@link #setPSDEFInputTipName}
     * @param pSDEFInputTipName
     */
    @JsonIgnore
    public PSDEFInputTip psdefinputtipname(String pSDEFInputTipName){
        this.setPSDEFInputTipName(pSDEFInputTipName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFInputTipName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFInputTipName(strName);
    }

    @JsonIgnore
    public PSDEFInputTip name(String strName){
        this.setPSDEFInputTipName(strName);
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETID</B>&nbsp;属性输入提示集，指定动态属性输入提示引用的提示信息集合对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFInputTipSet} 
     */
    public final static String FIELD_PSDEFINPUTTIPSETID = "psdefinputtipsetid";

    /**
     * 设置 属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETID}
     * 
     * @param pSDEFInputTipSetId
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETID)
    public void setPSDEFInputTipSetId(String pSDEFInputTipSetId){
        this.set(FIELD_PSDEFINPUTTIPSETID, pSDEFInputTipSetId);
    }
    
    /**
     * 获取 属性输入提示集  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipSetId(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPSETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性输入提示集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipSetIdDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPSETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性输入提示集
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetId(){
        this.reset(FIELD_PSDEFINPUTTIPSETID);
    }

    /**
     * 设置 属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETID}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSetId
     */
    @JsonIgnore
    public PSDEFInputTip psdefinputtipsetid(String pSDEFInputTipSetId){
        this.setPSDEFInputTipSetId(pSDEFInputTipSetId);
        return this;
    }

    /**
     * 设置 属性输入提示集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFInputTipSetId}
     * @param pSDEFInputTipSet 引用对象
     */
    @JsonIgnore
    public PSDEFInputTip psdefinputtipsetid(PSDEFInputTipSet pSDEFInputTipSet){
        if(pSDEFInputTipSet == null){
            this.setPSDEFInputTipSetId(null);
            this.setPSDEFInputTipSetName(null);
        }
        else{
            this.setPSDEFInputTipSetId(pSDEFInputTipSet.getPSDEFInputTipSetId());
            this.setPSDEFInputTipSetName(pSDEFInputTipSet.getPSDEFInputTipSetName());
        }
        return this;
    }

    /**
     * <B>PSDEFINPUTTIPSETNAME</B>&nbsp;属性输入提示集，指定动态属性输入提示引用的提示信息集合对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFINPUTTIPSETID}
     */
    public final static String FIELD_PSDEFINPUTTIPSETNAME = "psdefinputtipsetname";

    /**
     * 设置 属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * 
     * @param pSDEFInputTipSetName
     * 
     */
    @JsonProperty(FIELD_PSDEFINPUTTIPSETNAME)
    public void setPSDEFInputTipSetName(String pSDEFInputTipSetName){
        this.set(FIELD_PSDEFINPUTTIPSETNAME, pSDEFInputTipSetName);
    }
    
    /**
     * 获取 属性输入提示集  
     * @return
     */
    @JsonIgnore
    public String getPSDEFInputTipSetName(){
        Object objValue = this.get(FIELD_PSDEFINPUTTIPSETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性输入提示集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFInputTipSetNameDirty(){
        if(this.contains(FIELD_PSDEFINPUTTIPSETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性输入提示集
     */
    @JsonIgnore
    public void resetPSDEFInputTipSetName(){
        this.reset(FIELD_PSDEFINPUTTIPSETNAME);
    }

    /**
     * 设置 属性输入提示集，详细说明：{@link #FIELD_PSDEFINPUTTIPSETNAME}
     * <P>
     * 等同 {@link #setPSDEFInputTipSetName}
     * @param pSDEFInputTipSetName
     */
    @JsonIgnore
    public PSDEFInputTip psdefinputtipsetname(String pSDEFInputTipSetName){
        this.setPSDEFInputTipSetName(pSDEFInputTipSetName);
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定属性输入提示所在的实体属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEFInputTip psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定属性输入提示所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
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
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEFInputTip psdeid(String pSDEId){
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
    public PSDEFInputTip psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定属性输入提示所在的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
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
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEFInputTip psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定属性输入提示所在的系统模块
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
    public PSDEFInputTip psmoduleid(String pSModuleId){
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
    public PSDEFInputTip psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定属性输入提示所在的系统模块
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
    public PSDEFInputTip psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>RAWCONTENT</B>&nbsp;直接内容，指定属性输入提示信息的内容
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_RAWCONTENT = "rawcontent";

    /**
     * 设置 直接内容，详细说明：{@link #FIELD_RAWCONTENT}
     * 
     * @param rawContent
     * 
     */
    @JsonProperty(FIELD_RAWCONTENT)
    public void setRawContent(String rawContent){
        this.set(FIELD_RAWCONTENT, rawContent);
    }
    
    /**
     * 获取 直接内容  
     * @return
     */
    @JsonIgnore
    public String getRawContent(){
        Object objValue = this.get(FIELD_RAWCONTENT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 直接内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRawContentDirty(){
        if(this.contains(FIELD_RAWCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 直接内容
     */
    @JsonIgnore
    public void resetRawContent(){
        this.reset(FIELD_RAWCONTENT);
    }

    /**
     * 设置 直接内容，详细说明：{@link #FIELD_RAWCONTENT}
     * <P>
     * 等同 {@link #setRawContent}
     * @param rawContent
     */
    @JsonIgnore
    public PSDEFInputTip rawcontent(String rawContent){
        this.setRawContent(rawContent);
        return this;
    }

    /**
     * <B>TIPMODE</B>&nbsp;提示模式，指定属性输入提示信息的模式，需在所在实体属性对象中具备唯一性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFInputTipMode} 
     */
    public final static String FIELD_TIPMODE = "tipmode";

    /**
     * 设置 提示模式，详细说明：{@link #FIELD_TIPMODE}
     * 
     * @param tipMode
     * 
     */
    @JsonProperty(FIELD_TIPMODE)
    public void setTipMode(String tipMode){
        this.set(FIELD_TIPMODE, tipMode);
    }
    
    /**
     * 获取 提示模式  
     * @return
     */
    @JsonIgnore
    public String getTipMode(){
        Object objValue = this.get(FIELD_TIPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 提示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTipModeDirty(){
        if(this.contains(FIELD_TIPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 提示模式
     */
    @JsonIgnore
    public void resetTipMode(){
        this.reset(FIELD_TIPMODE);
    }

    /**
     * 设置 提示模式，详细说明：{@link #FIELD_TIPMODE}
     * <P>
     * 等同 {@link #setTipMode}
     * @param tipMode
     */
    @JsonIgnore
    public PSDEFInputTip tipmode(String tipMode){
        this.setTipMode(tipMode);
        return this;
    }

     /**
     * 设置 提示模式，详细说明：{@link #FIELD_TIPMODE}
     * <P>
     * 等同 {@link #setTipMode}
     * @param tipMode
     */
    @JsonIgnore
    public PSDEFInputTip tipmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFInputTipMode tipMode){
        if(tipMode == null){
            this.setTipMode(null);
        }
        else{
            this.setTipMode(tipMode.value);
        }
        return this;
    }

    /**
     * <B>UNIQUETAG</B>&nbsp;业务标识，指定动态属性输入提示的业务标识，通过这个标识从提示信息集合中获取提示信息
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_UNIQUETAG = "uniquetag";

    /**
     * 设置 业务标识，详细说明：{@link #FIELD_UNIQUETAG}
     * 
     * @param uniqueTag
     * 
     */
    @JsonProperty(FIELD_UNIQUETAG)
    public void setUniqueTag(String uniqueTag){
        this.set(FIELD_UNIQUETAG, uniqueTag);
    }
    
    /**
     * 获取 业务标识  
     * @return
     */
    @JsonIgnore
    public String getUniqueTag(){
        Object objValue = this.get(FIELD_UNIQUETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 业务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUniqueTagDirty(){
        if(this.contains(FIELD_UNIQUETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 业务标识
     */
    @JsonIgnore
    public void resetUniqueTag(){
        this.reset(FIELD_UNIQUETAG);
    }

    /**
     * 设置 业务标识，详细说明：{@link #FIELD_UNIQUETAG}
     * <P>
     * 等同 {@link #setUniqueTag}
     * @param uniqueTag
     */
    @JsonIgnore
    public PSDEFInputTip uniquetag(String uniqueTag){
        this.setUniqueTag(uniqueTag);
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
    public PSDEFInputTip updatedate(String updateDate){
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
    public PSDEFInputTip updateman(String updateMan){
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
    public PSDEFInputTip usercat(String userCat){
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
    public PSDEFInputTip usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEFInputTip usertag(String userTag){
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
    public PSDEFInputTip usertag2(String userTag2){
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
    public PSDEFInputTip usertag3(String userTag3){
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
    public PSDEFInputTip usertag4(String userTag4){
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
    public PSDEFInputTip validflag(Integer validFlag){
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
    public PSDEFInputTip validflag(Boolean validFlag){
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
        return this.getPSDEFInputTipId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFInputTipId(strValue);
    }

    @JsonIgnore
    public PSDEFInputTip id(String strValue){
        this.setPSDEFInputTipId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFInputTip){
            PSDEFInputTip model = (PSDEFInputTip)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
