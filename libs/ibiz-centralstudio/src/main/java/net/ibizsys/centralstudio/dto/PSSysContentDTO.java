package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSCONTENT</B>系统内容 模型传输对象
 * <P>
 * 系统通用内容存储模型，提供普通内容存储能力
 */
public class PSSysContentDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysContentDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定系统内容的代码标识，需要在所在的系统内容分类中具有唯一性
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
    public PSSysContentDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CONTENTTAG</B>&nbsp;内容标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CONTENTTAG = "contenttag";

    /**
     * 设置 内容标记
     * 
     * @param contentTag
     * 
     */
    @JsonProperty(FIELD_CONTENTTAG)
    public void setContentTag(String contentTag){
        this.set(FIELD_CONTENTTAG, contentTag);
    }
    
    /**
     * 获取 内容标记  
     * @return
     */
    @JsonIgnore
    public String getContentTag(){
        Object objValue = this.get(FIELD_CONTENTTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTagDirty(){
        if(this.contains(FIELD_CONTENTTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容标记
     */
    @JsonIgnore
    public void resetContentTag(){
        this.reset(FIELD_CONTENTTAG);
    }

    /**
     * 设置 内容标记
     * <P>
     * 等同 {@link #setContentTag}
     * @param contentTag
     */
    @JsonIgnore
    public PSSysContentDTO contenttag(String contentTag){
        this.setContentTag(contentTag);
        return this;
    }

    /**
     * <B>CONTENTTAG2</B>&nbsp;内容标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CONTENTTAG2 = "contenttag2";

    /**
     * 设置 内容标记2
     * 
     * @param contentTag2
     * 
     */
    @JsonProperty(FIELD_CONTENTTAG2)
    public void setContentTag2(String contentTag2){
        this.set(FIELD_CONTENTTAG2, contentTag2);
    }
    
    /**
     * 获取 内容标记2  
     * @return
     */
    @JsonIgnore
    public String getContentTag2(){
        Object objValue = this.get(FIELD_CONTENTTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTag2Dirty(){
        if(this.contains(FIELD_CONTENTTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容标记2
     */
    @JsonIgnore
    public void resetContentTag2(){
        this.reset(FIELD_CONTENTTAG2);
    }

    /**
     * 设置 内容标记2
     * <P>
     * 等同 {@link #setContentTag2}
     * @param contentTag2
     */
    @JsonIgnore
    public PSSysContentDTO contenttag2(String contentTag2){
        this.setContentTag2(contentTag2);
        return this;
    }

    /**
     * <B>CONTENTTAG3</B>&nbsp;内容标记3
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CONTENTTAG3 = "contenttag3";

    /**
     * 设置 内容标记3
     * 
     * @param contentTag3
     * 
     */
    @JsonProperty(FIELD_CONTENTTAG3)
    public void setContentTag3(String contentTag3){
        this.set(FIELD_CONTENTTAG3, contentTag3);
    }
    
    /**
     * 获取 内容标记3  
     * @return
     */
    @JsonIgnore
    public String getContentTag3(){
        Object objValue = this.get(FIELD_CONTENTTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTag3Dirty(){
        if(this.contains(FIELD_CONTENTTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容标记3
     */
    @JsonIgnore
    public void resetContentTag3(){
        this.reset(FIELD_CONTENTTAG3);
    }

    /**
     * 设置 内容标记3
     * <P>
     * 等同 {@link #setContentTag3}
     * @param contentTag3
     */
    @JsonIgnore
    public PSSysContentDTO contenttag3(String contentTag3){
        this.setContentTag3(contentTag3);
        return this;
    }

    /**
     * <B>CONTENTTAG4</B>&nbsp;内容标记4
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_CONTENTTAG4 = "contenttag4";

    /**
     * 设置 内容标记4
     * 
     * @param contentTag4
     * 
     */
    @JsonProperty(FIELD_CONTENTTAG4)
    public void setContentTag4(String contentTag4){
        this.set(FIELD_CONTENTTAG4, contentTag4);
    }
    
    /**
     * 获取 内容标记4  
     * @return
     */
    @JsonIgnore
    public String getContentTag4(){
        Object objValue = this.get(FIELD_CONTENTTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 内容标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isContentTag4Dirty(){
        if(this.contains(FIELD_CONTENTTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 内容标记4
     */
    @JsonIgnore
    public void resetContentTag4(){
        this.reset(FIELD_CONTENTTAG4);
    }

    /**
     * 设置 内容标记4
     * <P>
     * 等同 {@link #setContentTag4}
     * @param contentTag4
     */
    @JsonIgnore
    public PSSysContentDTO contenttag4(String contentTag4){
        this.setContentTag4(contentTag4);
        return this;
    }

    /**
     * <B>CONTENTTYPE</B>&nbsp;内容类型，指定系统内容的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysContentType} 
     */
    public final static String FIELD_CONTENTTYPE = "contenttype";

    /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
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
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysContentDTO contenttype(String contentType){
        this.setContentType(contentType);
        return this;
    }

     /**
     * 设置 内容类型，详细说明：{@link #FIELD_CONTENTTYPE}
     * <P>
     * 等同 {@link #setContentType}
     * @param contentType
     */
    @JsonIgnore
    public PSSysContentDTO contenttype(net.ibizsys.model.PSModelEnums.SysContentType contentType){
        if(contentType == null){
            this.setContentType(null);
        }
        else{
            this.setContentType(contentType.value);
        }
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
    public PSSysContentDTO createdate(Timestamp createDate){
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
    public PSSysContentDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>HTMLCONTENT</B>&nbsp;HTML内容，内容类型为【HTML内容】时指定HTML内容
     */
    public final static String FIELD_HTMLCONTENT = "htmlcontent";

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_HTMLCONTENT}
     * 
     * @param htmlContent
     * 
     */
    @JsonProperty(FIELD_HTMLCONTENT)
    public void setHtmlContent(String htmlContent){
        this.set(FIELD_HTMLCONTENT, htmlContent);
    }
    
    /**
     * 获取 HTML内容  
     * @return
     */
    @JsonIgnore
    public String getHtmlContent(){
        Object objValue = this.get(FIELD_HTMLCONTENT);
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
    public boolean isHtmlContentDirty(){
        if(this.contains(FIELD_HTMLCONTENT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 HTML内容
     */
    @JsonIgnore
    public void resetHtmlContent(){
        this.reset(FIELD_HTMLCONTENT);
    }

    /**
     * 设置 HTML内容，详细说明：{@link #FIELD_HTMLCONTENT}
     * <P>
     * 等同 {@link #setHtmlContent}
     * @param htmlContent
     */
    @JsonIgnore
    public PSSysContentDTO htmlcontent(String htmlContent){
        this.setHtmlContent(htmlContent);
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
    public PSSysContentDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定系统内容的显示次序
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
    public PSSysContentDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统内容所在的系统模块
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
    public PSSysContentDTO psmoduleid(String pSModuleId){
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
    public PSSysContentDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统内容所在的系统模块
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
    public PSSysContentDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSCONTENTCATID</B>&nbsp;系统内容分类，指定系统内容所在的内容分类
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysContentCatDTO} 
     */
    public final static String FIELD_PSSYSCONTENTCATID = "pssyscontentcatid";

    /**
     * 设置 系统内容分类，详细说明：{@link #FIELD_PSSYSCONTENTCATID}
     * 
     * @param pSSysContentCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSCONTENTCATID)
    public void setPSSysContentCatId(String pSSysContentCatId){
        this.set(FIELD_PSSYSCONTENTCATID, pSSysContentCatId);
    }
    
    /**
     * 获取 系统内容分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysContentCatId(){
        Object objValue = this.get(FIELD_PSSYSCONTENTCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统内容分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysContentCatIdDirty(){
        if(this.contains(FIELD_PSSYSCONTENTCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统内容分类
     */
    @JsonIgnore
    public void resetPSSysContentCatId(){
        this.reset(FIELD_PSSYSCONTENTCATID);
    }

    /**
     * 设置 系统内容分类，详细说明：{@link #FIELD_PSSYSCONTENTCATID}
     * <P>
     * 等同 {@link #setPSSysContentCatId}
     * @param pSSysContentCatId
     */
    @JsonIgnore
    public PSSysContentDTO pssyscontentcatid(String pSSysContentCatId){
        this.setPSSysContentCatId(pSSysContentCatId);
        return this;
    }

    /**
     * 设置 系统内容分类，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysContentCatId}
     * @param pSSysContentCat 引用对象
     */
    @JsonIgnore
    public PSSysContentDTO pssyscontentcatid(PSSysContentCatDTO pSSysContentCat){
        if(pSSysContentCat == null){
            this.setPSSysContentCatId(null);
            this.setPSSysContentCatName(null);
        }
        else{
            this.setPSSysContentCatId(pSSysContentCat.getPSSysContentCatId());
            this.setPSSysContentCatName(pSSysContentCat.getPSSysContentCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSCONTENTCATNAME</B>&nbsp;系统内容分类，指定系统内容所在的内容分类
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCONTENTCATID}
     */
    public final static String FIELD_PSSYSCONTENTCATNAME = "pssyscontentcatname";

    /**
     * 设置 系统内容分类，详细说明：{@link #FIELD_PSSYSCONTENTCATNAME}
     * 
     * @param pSSysContentCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSCONTENTCATNAME)
    public void setPSSysContentCatName(String pSSysContentCatName){
        this.set(FIELD_PSSYSCONTENTCATNAME, pSSysContentCatName);
    }
    
    /**
     * 获取 系统内容分类  
     * @return
     */
    @JsonIgnore
    public String getPSSysContentCatName(){
        Object objValue = this.get(FIELD_PSSYSCONTENTCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统内容分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysContentCatNameDirty(){
        if(this.contains(FIELD_PSSYSCONTENTCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统内容分类
     */
    @JsonIgnore
    public void resetPSSysContentCatName(){
        this.reset(FIELD_PSSYSCONTENTCATNAME);
    }

    /**
     * 设置 系统内容分类，详细说明：{@link #FIELD_PSSYSCONTENTCATNAME}
     * <P>
     * 等同 {@link #setPSSysContentCatName}
     * @param pSSysContentCatName
     */
    @JsonIgnore
    public PSSysContentDTO pssyscontentcatname(String pSSysContentCatName){
        this.setPSSysContentCatName(pSSysContentCatName);
        return this;
    }

    /**
     * <B>PSSYSCONTENTID</B>&nbsp;系统预置内容标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSCONTENTID = "pssyscontentid";

    /**
     * 设置 系统预置内容标识
     * 
     * @param pSSysContentId
     * 
     */
    @JsonProperty(FIELD_PSSYSCONTENTID)
    public void setPSSysContentId(String pSSysContentId){
        this.set(FIELD_PSSYSCONTENTID, pSSysContentId);
    }
    
    /**
     * 获取 系统预置内容标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysContentId(){
        Object objValue = this.get(FIELD_PSSYSCONTENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统预置内容标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysContentIdDirty(){
        if(this.contains(FIELD_PSSYSCONTENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统预置内容标识
     */
    @JsonIgnore
    public void resetPSSysContentId(){
        this.reset(FIELD_PSSYSCONTENTID);
    }

    /**
     * 设置 系统预置内容标识
     * <P>
     * 等同 {@link #setPSSysContentId}
     * @param pSSysContentId
     */
    @JsonIgnore
    public PSSysContentDTO pssyscontentid(String pSSysContentId){
        this.setPSSysContentId(pSSysContentId);
        return this;
    }

    /**
     * <B>PSSYSCONTENTNAME</B>&nbsp;系统内容名称，指定系统内容的名称，需在所在的内容分类中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSCONTENTNAME = "pssyscontentname";

    /**
     * 设置 系统内容名称，详细说明：{@link #FIELD_PSSYSCONTENTNAME}
     * 
     * @param pSSysContentName
     * 
     */
    @JsonProperty(FIELD_PSSYSCONTENTNAME)
    public void setPSSysContentName(String pSSysContentName){
        this.set(FIELD_PSSYSCONTENTNAME, pSSysContentName);
    }
    
    /**
     * 获取 系统内容名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysContentName(){
        Object objValue = this.get(FIELD_PSSYSCONTENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统内容名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysContentNameDirty(){
        if(this.contains(FIELD_PSSYSCONTENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统内容名称
     */
    @JsonIgnore
    public void resetPSSysContentName(){
        this.reset(FIELD_PSSYSCONTENTNAME);
    }

    /**
     * 设置 系统内容名称，详细说明：{@link #FIELD_PSSYSCONTENTNAME}
     * <P>
     * 等同 {@link #setPSSysContentName}
     * @param pSSysContentName
     */
    @JsonIgnore
    public PSSysContentDTO pssyscontentname(String pSSysContentName){
        this.setPSSysContentName(pSSysContentName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysContentName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysContentName(strName);
    }

    @JsonIgnore
    public PSSysContentDTO name(String strName){
        this.setPSSysContentName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 动态系统模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelId(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysContentDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 动态系统模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysContentDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setPSSysDynaModelId(null);
            this.setPSSysDynaModelName(null);
        }
        else{
            this.setPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;动态系统模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 动态系统模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 动态系统模型  
     * @return
     */
    @JsonIgnore
    public String getPSSysDynaModelName(){
        Object objValue = this.get(FIELD_PSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态系统模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_PSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态系统模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 动态系统模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysContentDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>RAWCONTENT</B>&nbsp;直接内容，内容类型为【直接内容】时指定直接内容
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
    public PSSysContentDTO rawcontent(String rawContent){
        this.setRawContent(rawContent);
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
    public PSSysContentDTO subject(String subject){
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
    public PSSysContentDTO tags(String tags){
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
    public PSSysContentDTO updatedate(Timestamp updateDate){
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
    public PSSysContentDTO updateman(String updateMan){
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
    public PSSysContentDTO usercat(String userCat){
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
    public PSSysContentDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysContentDTO usertag(String userTag){
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
    public PSSysContentDTO usertag2(String userTag2){
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
    public PSSysContentDTO usertag3(String userTag3){
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
    public PSSysContentDTO usertag4(String userTag4){
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
    public PSSysContentDTO validflag(Integer validFlag){
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
    public PSSysContentDTO validflag(Boolean validFlag){
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
        return this.getPSSysContentId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysContentId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysContentId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysContentId(strValue);
    }

    @JsonIgnore
    public PSSysContentDTO id(String strValue){
        this.setPSSysContentId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysContentDTO){
            PSSysContentDTO dto = (PSSysContentDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
