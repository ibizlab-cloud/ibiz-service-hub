package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSCODELIST</B>系统代码表 模型传输对象
 * <P>
 * 系统的代码表模型，定义静态或动态的数据字典
 */
public class PSCodeList extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSCodeList(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLTEXT</B>&nbsp;全部显示内容
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ALLTEXT = "alltext";

    /**
     * 设置 全部显示内容
     * 
     * @param allText
     * 
     */
    @JsonProperty(FIELD_ALLTEXT)
    public void setAllText(String allText){
        this.set(FIELD_ALLTEXT, allText);
    }
    
    /**
     * 获取 全部显示内容  
     * @return
     */
    @JsonIgnore
    public String getAllText(){
        Object objValue = this.get(FIELD_ALLTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全部显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllTextDirty(){
        if(this.contains(FIELD_ALLTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部显示内容
     */
    @JsonIgnore
    public void resetAllText(){
        this.reset(FIELD_ALLTEXT);
    }

    /**
     * 设置 全部显示内容
     * <P>
     * 等同 {@link #setAllText}
     * @param allText
     */
    @JsonIgnore
    public PSCodeList alltext(String allText){
        this.setAllText(allText);
        return this;
    }

    /**
     * <B>ALLTEXTPSLANRESID</B>&nbsp;全部文本语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_ALLTEXTPSLANRESID = "alltextpslanresid";

    /**
     * 设置 全部文本语言资源
     * 
     * @param allTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_ALLTEXTPSLANRESID)
    public void setAllTextPSLanResId(String allTextPSLanResId){
        this.set(FIELD_ALLTEXTPSLANRESID, allTextPSLanResId);
    }
    
    /**
     * 获取 全部文本语言资源  
     * @return
     */
    @JsonIgnore
    public String getAllTextPSLanResId(){
        Object objValue = this.get(FIELD_ALLTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全部文本语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllTextPSLanResIdDirty(){
        if(this.contains(FIELD_ALLTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部文本语言资源
     */
    @JsonIgnore
    public void resetAllTextPSLanResId(){
        this.reset(FIELD_ALLTEXTPSLANRESID);
    }

    /**
     * 设置 全部文本语言资源
     * <P>
     * 等同 {@link #setAllTextPSLanResId}
     * @param allTextPSLanResId
     */
    @JsonIgnore
    public PSCodeList alltextpslanresid(String allTextPSLanResId){
        this.setAllTextPSLanResId(allTextPSLanResId);
        return this;
    }

    /**
     * 设置 全部文本语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setAllTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSCodeList alltextpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setAllTextPSLanResId(null);
            this.setAllTextPSLanResName(null);
        }
        else{
            this.setAllTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setAllTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>ALLTEXTPSLANRESNAME</B>&nbsp;全部文本语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ALLTEXTPSLANRESID}
     */
    public final static String FIELD_ALLTEXTPSLANRESNAME = "alltextpslanresname";

    /**
     * 设置 全部文本语言资源
     * 
     * @param allTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_ALLTEXTPSLANRESNAME)
    public void setAllTextPSLanResName(String allTextPSLanResName){
        this.set(FIELD_ALLTEXTPSLANRESNAME, allTextPSLanResName);
    }
    
    /**
     * 获取 全部文本语言资源  
     * @return
     */
    @JsonIgnore
    public String getAllTextPSLanResName(){
        Object objValue = this.get(FIELD_ALLTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全部文本语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllTextPSLanResNameDirty(){
        if(this.contains(FIELD_ALLTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部文本语言资源
     */
    @JsonIgnore
    public void resetAllTextPSLanResName(){
        this.reset(FIELD_ALLTEXTPSLANRESNAME);
    }

    /**
     * 设置 全部文本语言资源
     * <P>
     * 等同 {@link #setAllTextPSLanResName}
     * @param allTextPSLanResName
     */
    @JsonIgnore
    public PSCodeList alltextpslanresname(String allTextPSLanResName){
        this.setAllTextPSLanResName(allTextPSLanResName);
        return this;
    }

    /**
     * <B>BEGINVALUEPSDEFID</B>&nbsp;开始值属性，动态代码表为阈值组模式时指定阈值项开始值的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_BEGINVALUEPSDEFID = "beginvaluepsdefid";

    /**
     * 设置 开始值属性，详细说明：{@link #FIELD_BEGINVALUEPSDEFID}
     * 
     * @param beginValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_BEGINVALUEPSDEFID)
    public void setBeginValuePSDEFId(String beginValuePSDEFId){
        this.set(FIELD_BEGINVALUEPSDEFID, beginValuePSDEFId);
    }
    
    /**
     * 获取 开始值属性  
     * @return
     */
    @JsonIgnore
    public String getBeginValuePSDEFId(){
        Object objValue = this.get(FIELD_BEGINVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginValuePSDEFIdDirty(){
        if(this.contains(FIELD_BEGINVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始值属性
     */
    @JsonIgnore
    public void resetBeginValuePSDEFId(){
        this.reset(FIELD_BEGINVALUEPSDEFID);
    }

    /**
     * 设置 开始值属性，详细说明：{@link #FIELD_BEGINVALUEPSDEFID}
     * <P>
     * 等同 {@link #setBeginValuePSDEFId}
     * @param beginValuePSDEFId
     */
    @JsonIgnore
    public PSCodeList beginvaluepsdefid(String beginValuePSDEFId){
        this.setBeginValuePSDEFId(beginValuePSDEFId);
        return this;
    }

    /**
     * 设置 开始值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBeginValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList beginvaluepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setBeginValuePSDEFId(null);
            this.setBeginValuePSDEFName(null);
        }
        else{
            this.setBeginValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setBeginValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>BEGINVALUEPSDEFNAME</B>&nbsp;开始值属性，动态代码表为阈值组模式时指定阈值项开始值的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BEGINVALUEPSDEFID}
     */
    public final static String FIELD_BEGINVALUEPSDEFNAME = "beginvaluepsdefname";

    /**
     * 设置 开始值属性，详细说明：{@link #FIELD_BEGINVALUEPSDEFNAME}
     * 
     * @param beginValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_BEGINVALUEPSDEFNAME)
    public void setBeginValuePSDEFName(String beginValuePSDEFName){
        this.set(FIELD_BEGINVALUEPSDEFNAME, beginValuePSDEFName);
    }
    
    /**
     * 获取 开始值属性  
     * @return
     */
    @JsonIgnore
    public String getBeginValuePSDEFName(){
        Object objValue = this.get(FIELD_BEGINVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开始值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginValuePSDEFNameDirty(){
        if(this.contains(FIELD_BEGINVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始值属性
     */
    @JsonIgnore
    public void resetBeginValuePSDEFName(){
        this.reset(FIELD_BEGINVALUEPSDEFNAME);
    }

    /**
     * 设置 开始值属性，详细说明：{@link #FIELD_BEGINVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setBeginValuePSDEFName}
     * @param beginValuePSDEFName
     */
    @JsonIgnore
    public PSCodeList beginvaluepsdefname(String beginValuePSDEFName){
        this.setBeginValuePSDEFName(beginValuePSDEFName);
        return this;
    }

    /**
     * <B>BKCOLORPSDEFID</B>&nbsp;背景颜色值属性，动态代码表指定代码项背景颜色读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_BKCOLORPSDEFID = "bkcolorpsdefid";

    /**
     * 设置 背景颜色值属性，详细说明：{@link #FIELD_BKCOLORPSDEFID}
     * 
     * @param bKColorPSDEFId
     * 
     */
    @JsonProperty(FIELD_BKCOLORPSDEFID)
    public void setBKColorPSDEFId(String bKColorPSDEFId){
        this.set(FIELD_BKCOLORPSDEFID, bKColorPSDEFId);
    }
    
    /**
     * 获取 背景颜色值属性  
     * @return
     */
    @JsonIgnore
    public String getBKColorPSDEFId(){
        Object objValue = this.get(FIELD_BKCOLORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 背景颜色值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBKColorPSDEFIdDirty(){
        if(this.contains(FIELD_BKCOLORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 背景颜色值属性
     */
    @JsonIgnore
    public void resetBKColorPSDEFId(){
        this.reset(FIELD_BKCOLORPSDEFID);
    }

    /**
     * 设置 背景颜色值属性，详细说明：{@link #FIELD_BKCOLORPSDEFID}
     * <P>
     * 等同 {@link #setBKColorPSDEFId}
     * @param bKColorPSDEFId
     */
    @JsonIgnore
    public PSCodeList bkcolorpsdefid(String bKColorPSDEFId){
        this.setBKColorPSDEFId(bKColorPSDEFId);
        return this;
    }

    /**
     * 设置 背景颜色值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setBKColorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList bkcolorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setBKColorPSDEFId(null);
            this.setBKColorPSDEFName(null);
        }
        else{
            this.setBKColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setBKColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>BKCOLORPSDEFNAME</B>&nbsp;背景颜色值属性，动态代码表指定代码项背景颜色读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_BKCOLORPSDEFID}
     */
    public final static String FIELD_BKCOLORPSDEFNAME = "bkcolorpsdefname";

    /**
     * 设置 背景颜色值属性，详细说明：{@link #FIELD_BKCOLORPSDEFNAME}
     * 
     * @param bKColorPSDEFName
     * 
     */
    @JsonProperty(FIELD_BKCOLORPSDEFNAME)
    public void setBKColorPSDEFName(String bKColorPSDEFName){
        this.set(FIELD_BKCOLORPSDEFNAME, bKColorPSDEFName);
    }
    
    /**
     * 获取 背景颜色值属性  
     * @return
     */
    @JsonIgnore
    public String getBKColorPSDEFName(){
        Object objValue = this.get(FIELD_BKCOLORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 背景颜色值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBKColorPSDEFNameDirty(){
        if(this.contains(FIELD_BKCOLORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 背景颜色值属性
     */
    @JsonIgnore
    public void resetBKColorPSDEFName(){
        this.reset(FIELD_BKCOLORPSDEFNAME);
    }

    /**
     * 设置 背景颜色值属性，详细说明：{@link #FIELD_BKCOLORPSDEFNAME}
     * <P>
     * 等同 {@link #setBKColorPSDEFName}
     * @param bKColorPSDEFName
     */
    @JsonIgnore
    public PSCodeList bkcolorpsdefname(String bKColorPSDEFName){
        this.setBKColorPSDEFName(bKColorPSDEFName);
        return this;
    }

    /**
     * <B>CACHECAT</B>&nbsp;缓存分类
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CACHECAT = "cachecat";

    /**
     * 设置 缓存分类
     * 
     * @param cacheCat
     * 
     */
    @JsonProperty(FIELD_CACHECAT)
    public void setCacheCat(String cacheCat){
        this.set(FIELD_CACHECAT, cacheCat);
    }
    
    /**
     * 获取 缓存分类  
     * @return
     */
    @JsonIgnore
    public String getCacheCat(){
        Object objValue = this.get(FIELD_CACHECAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheCatDirty(){
        if(this.contains(FIELD_CACHECAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存分类
     */
    @JsonIgnore
    public void resetCacheCat(){
        this.reset(FIELD_CACHECAT);
    }

    /**
     * 设置 缓存分类
     * <P>
     * 等同 {@link #setCacheCat}
     * @param cacheCat
     */
    @JsonIgnore
    public PSCodeList cachecat(String cacheCat){
        this.setCacheCat(cacheCat);
        return this;
    }

    /**
     * <B>CACHETAG</B>&nbsp;缓存标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CACHETAG = "cachetag";

    /**
     * 设置 缓存标记
     * 
     * @param cacheTag
     * 
     */
    @JsonProperty(FIELD_CACHETAG)
    public void setCacheTag(String cacheTag){
        this.set(FIELD_CACHETAG, cacheTag);
    }
    
    /**
     * 获取 缓存标记  
     * @return
     */
    @JsonIgnore
    public String getCacheTag(){
        Object objValue = this.get(FIELD_CACHETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 缓存标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTagDirty(){
        if(this.contains(FIELD_CACHETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存标记
     */
    @JsonIgnore
    public void resetCacheTag(){
        this.reset(FIELD_CACHETAG);
    }

    /**
     * 设置 缓存标记
     * <P>
     * 等同 {@link #setCacheTag}
     * @param cacheTag
     */
    @JsonIgnore
    public PSCodeList cachetag(String cacheTag){
        this.setCacheTag(cacheTag);
        return this;
    }

    /**
     * <B>CACHETIMEOUT</B>&nbsp;缓存失效时长，指定动态代码表的缓存失效时长，单位为【毫秒】，-1为永不过期，未定义时为【-1】
     */
    public final static String FIELD_CACHETIMEOUT = "cachetimeout";

    /**
     * 设置 缓存失效时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * 
     * @param cacheTimeout
     * 
     */
    @JsonProperty(FIELD_CACHETIMEOUT)
    public void setCacheTimeout(Integer cacheTimeout){
        this.set(FIELD_CACHETIMEOUT, cacheTimeout);
    }
    
    /**
     * 获取 缓存失效时长  
     * @return
     */
    @JsonIgnore
    public Integer getCacheTimeout(){
        Object objValue = this.get(FIELD_CACHETIMEOUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 缓存失效时长 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCacheTimeoutDirty(){
        if(this.contains(FIELD_CACHETIMEOUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存失效时长
     */
    @JsonIgnore
    public void resetCacheTimeout(){
        this.reset(FIELD_CACHETIMEOUT);
    }

    /**
     * 设置 缓存失效时长，详细说明：{@link #FIELD_CACHETIMEOUT}
     * <P>
     * 等同 {@link #setCacheTimeout}
     * @param cacheTimeout
     */
    @JsonIgnore
    public PSCodeList cachetimeout(Integer cacheTimeout){
        this.setCacheTimeout(cacheTimeout);
        return this;
    }

    /**
     * <B>CLSPSDEFID</B>&nbsp;样式表属性，动态代码表指定代码项样式表的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_CLSPSDEFID = "clspsdefid";

    /**
     * 设置 样式表属性，详细说明：{@link #FIELD_CLSPSDEFID}
     * 
     * @param clsPSDEFId
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFID)
    public void setClsPSDEFId(String clsPSDEFId){
        this.set(FIELD_CLSPSDEFID, clsPSDEFId);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFId(){
        Object objValue = this.get(FIELD_CLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFIdDirty(){
        if(this.contains(FIELD_CLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFId(){
        this.reset(FIELD_CLSPSDEFID);
    }

    /**
     * 设置 样式表属性，详细说明：{@link #FIELD_CLSPSDEFID}
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param clsPSDEFId
     */
    @JsonIgnore
    public PSCodeList clspsdefid(String clsPSDEFId){
        this.setClsPSDEFId(clsPSDEFId);
        return this;
    }

    /**
     * 设置 样式表属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList clspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setClsPSDEFId(null);
            this.setClsPSDEFName(null);
        }
        else{
            this.setClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>CLSPSDEFNAME</B>&nbsp;样式表属性，动态代码表指定代码项样式表的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CLSPSDEFID}
     */
    public final static String FIELD_CLSPSDEFNAME = "clspsdefname";

    /**
     * 设置 样式表属性，详细说明：{@link #FIELD_CLSPSDEFNAME}
     * 
     * @param clsPSDEFName
     * 
     */
    @JsonProperty(FIELD_CLSPSDEFNAME)
    public void setClsPSDEFName(String clsPSDEFName){
        this.set(FIELD_CLSPSDEFNAME, clsPSDEFName);
    }
    
    /**
     * 获取 样式表属性  
     * @return
     */
    @JsonIgnore
    public String getClsPSDEFName(){
        Object objValue = this.get(FIELD_CLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isClsPSDEFNameDirty(){
        if(this.contains(FIELD_CLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表属性
     */
    @JsonIgnore
    public void resetClsPSDEFName(){
        this.reset(FIELD_CLSPSDEFNAME);
    }

    /**
     * 设置 样式表属性，详细说明：{@link #FIELD_CLSPSDEFNAME}
     * <P>
     * 等同 {@link #setClsPSDEFName}
     * @param clsPSDEFName
     */
    @JsonIgnore
    public PSCodeList clspsdefname(String clsPSDEFName){
        this.setClsPSDEFName(clsPSDEFName);
        return this;
    }

    /**
     * <B>CLTYPE</B>&nbsp;代码表类型，指定代码表的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeListType} 
     */
    public final static String FIELD_CLTYPE = "cltype";

    /**
     * 设置 代码表类型，详细说明：{@link #FIELD_CLTYPE}
     * 
     * @param cLType
     * 
     */
    @JsonProperty(FIELD_CLTYPE)
    public void setCLType(String cLType){
        this.set(FIELD_CLTYPE, cLType);
    }
    
    /**
     * 获取 代码表类型  
     * @return
     */
    @JsonIgnore
    public String getCLType(){
        Object objValue = this.get(FIELD_CLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCLTypeDirty(){
        if(this.contains(FIELD_CLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表类型
     */
    @JsonIgnore
    public void resetCLType(){
        this.reset(FIELD_CLTYPE);
    }

    /**
     * 设置 代码表类型，详细说明：{@link #FIELD_CLTYPE}
     * <P>
     * 等同 {@link #setCLType}
     * @param cLType
     */
    @JsonIgnore
    public PSCodeList cltype(String cLType){
        this.setCLType(cLType);
        return this;
    }

     /**
     * 设置 代码表类型，详细说明：{@link #FIELD_CLTYPE}
     * <P>
     * 等同 {@link #setCLType}
     * @param cLType
     */
    @JsonIgnore
    public PSCodeList cltype(net.ibizsys.psmodel.core.util.PSModelEnums.CodeListType cLType){
        if(cLType == null){
            this.setCLType(null);
        }
        else{
            this.setCLType(cLType.value);
        }
        return this;
    }

    /**
     * <B>CODELISTSN</B>&nbsp;代码表编号，指定代码表的编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CODELISTSN = "codelistsn";

    /**
     * 设置 代码表编号，详细说明：{@link #FIELD_CODELISTSN}
     * 
     * @param codeListSN
     * 
     */
    @JsonProperty(FIELD_CODELISTSN)
    public void setCodeListSN(String codeListSN){
        this.set(FIELD_CODELISTSN, codeListSN);
    }
    
    /**
     * 获取 代码表编号  
     * @return
     */
    @JsonIgnore
    public String getCodeListSN(){
        Object objValue = this.get(FIELD_CODELISTSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeListSNDirty(){
        if(this.contains(FIELD_CODELISTSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表编号
     */
    @JsonIgnore
    public void resetCodeListSN(){
        this.reset(FIELD_CODELISTSN);
    }

    /**
     * 设置 代码表编号，详细说明：{@link #FIELD_CODELISTSN}
     * <P>
     * 等同 {@link #setCodeListSN}
     * @param codeListSN
     */
    @JsonIgnore
    public PSCodeList codelistsn(String codeListSN){
        this.setCodeListSN(codeListSN);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定代码表的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
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
    public PSCodeList codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLORPSDEFID</B>&nbsp;颜色值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_COLORPSDEFID = "colorpsdefid";

    /**
     * 设置 颜色值属性
     * 
     * @param colorPSDEFId
     * 
     */
    @JsonProperty(FIELD_COLORPSDEFID)
    public void setColorPSDEFId(String colorPSDEFId){
        this.set(FIELD_COLORPSDEFID, colorPSDEFId);
    }
    
    /**
     * 获取 颜色值属性  
     * @return
     */
    @JsonIgnore
    public String getColorPSDEFId(){
        Object objValue = this.get(FIELD_COLORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 颜色值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorPSDEFIdDirty(){
        if(this.contains(FIELD_COLORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 颜色值属性
     */
    @JsonIgnore
    public void resetColorPSDEFId(){
        this.reset(FIELD_COLORPSDEFID);
    }

    /**
     * 设置 颜色值属性
     * <P>
     * 等同 {@link #setColorPSDEFId}
     * @param colorPSDEFId
     */
    @JsonIgnore
    public PSCodeList colorpsdefid(String colorPSDEFId){
        this.setColorPSDEFId(colorPSDEFId);
        return this;
    }

    /**
     * 设置 颜色值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setColorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList colorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setColorPSDEFId(null);
            this.setColorPSDEFName(null);
        }
        else{
            this.setColorPSDEFId(pSDEField.getPSDEFieldId());
            this.setColorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>COLORPSDEFNAME</B>&nbsp;颜色值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_COLORPSDEFID}
     */
    public final static String FIELD_COLORPSDEFNAME = "colorpsdefname";

    /**
     * 设置 颜色值属性
     * 
     * @param colorPSDEFName
     * 
     */
    @JsonProperty(FIELD_COLORPSDEFNAME)
    public void setColorPSDEFName(String colorPSDEFName){
        this.set(FIELD_COLORPSDEFNAME, colorPSDEFName);
    }
    
    /**
     * 获取 颜色值属性  
     * @return
     */
    @JsonIgnore
    public String getColorPSDEFName(){
        Object objValue = this.get(FIELD_COLORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 颜色值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorPSDEFNameDirty(){
        if(this.contains(FIELD_COLORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 颜色值属性
     */
    @JsonIgnore
    public void resetColorPSDEFName(){
        this.reset(FIELD_COLORPSDEFNAME);
    }

    /**
     * 设置 颜色值属性
     * <P>
     * 等同 {@link #setColorPSDEFName}
     * @param colorPSDEFName
     */
    @JsonIgnore
    public PSCodeList colorpsdefname(String colorPSDEFName){
        this.setColorPSDEFName(colorPSDEFName);
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
    public PSCodeList createdate(String createDate){
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
    public PSCodeList createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSCodeList customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CUSTOMTYPE = "customtype";

    /**
     * 设置 自定义类型
     * 
     * @param customType
     * 
     */
    @JsonProperty(FIELD_CUSTOMTYPE)
    public void setCustomType(String customType){
        this.set(FIELD_CUSTOMTYPE, customType);
    }
    
    /**
     * 获取 自定义类型  
     * @return
     */
    @JsonIgnore
    public String getCustomType(){
        Object objValue = this.get(FIELD_CUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomTypeDirty(){
        if(this.contains(FIELD_CUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义类型
     */
    @JsonIgnore
    public void resetCustomType(){
        this.reset(FIELD_CUSTOMTYPE);
    }

    /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSCodeList customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>DATAPSDEFID</B>&nbsp;数据属性，动态代码表指定代码项数据项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DATAPSDEFID = "datapsdefid";

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_DATAPSDEFID}
     * 
     * @param dataPSDEFId
     * 
     */
    @JsonProperty(FIELD_DATAPSDEFID)
    public void setDataPSDEFId(String dataPSDEFId){
        this.set(FIELD_DATAPSDEFID, dataPSDEFId);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataPSDEFId(){
        Object objValue = this.get(FIELD_DATAPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataPSDEFIdDirty(){
        if(this.contains(FIELD_DATAPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataPSDEFId(){
        this.reset(FIELD_DATAPSDEFID);
    }

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_DATAPSDEFID}
     * <P>
     * 等同 {@link #setDataPSDEFId}
     * @param dataPSDEFId
     */
    @JsonIgnore
    public PSCodeList datapsdefid(String dataPSDEFId){
        this.setDataPSDEFId(dataPSDEFId);
        return this;
    }

    /**
     * 设置 数据属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDataPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList datapsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDataPSDEFId(null);
            this.setDataPSDEFName(null);
        }
        else{
            this.setDataPSDEFId(pSDEField.getPSDEFieldId());
            this.setDataPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DATAPSDEFNAME</B>&nbsp;数据属性，动态代码表指定代码项数据项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DATAPSDEFID}
     */
    public final static String FIELD_DATAPSDEFNAME = "datapsdefname";

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_DATAPSDEFNAME}
     * 
     * @param dataPSDEFName
     * 
     */
    @JsonProperty(FIELD_DATAPSDEFNAME)
    public void setDataPSDEFName(String dataPSDEFName){
        this.set(FIELD_DATAPSDEFNAME, dataPSDEFName);
    }
    
    /**
     * 获取 数据属性  
     * @return
     */
    @JsonIgnore
    public String getDataPSDEFName(){
        Object objValue = this.get(FIELD_DATAPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataPSDEFNameDirty(){
        if(this.contains(FIELD_DATAPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据属性
     */
    @JsonIgnore
    public void resetDataPSDEFName(){
        this.reset(FIELD_DATAPSDEFNAME);
    }

    /**
     * 设置 数据属性，详细说明：{@link #FIELD_DATAPSDEFNAME}
     * <P>
     * 等同 {@link #setDataPSDEFName}
     * @param dataPSDEFName
     */
    @JsonIgnore
    public PSCodeList datapsdefname(String dataPSDEFName){
        this.setDataPSDEFName(dataPSDEFName);
        return this;
    }

    /**
     * <B>DISABLEPSDEFID</B>&nbsp;禁止选择属性，动态代码表指定代码项禁止选择项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DISABLEPSDEFID = "disablepsdefid";

    /**
     * 设置 禁止选择属性，详细说明：{@link #FIELD_DISABLEPSDEFID}
     * 
     * @param disablePSDEFId
     * 
     */
    @JsonProperty(FIELD_DISABLEPSDEFID)
    public void setDisablePSDEFId(String disablePSDEFId){
        this.set(FIELD_DISABLEPSDEFID, disablePSDEFId);
    }
    
    /**
     * 获取 禁止选择属性  
     * @return
     */
    @JsonIgnore
    public String getDisablePSDEFId(){
        Object objValue = this.get(FIELD_DISABLEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 禁止选择属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDisablePSDEFIdDirty(){
        if(this.contains(FIELD_DISABLEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁止选择属性
     */
    @JsonIgnore
    public void resetDisablePSDEFId(){
        this.reset(FIELD_DISABLEPSDEFID);
    }

    /**
     * 设置 禁止选择属性，详细说明：{@link #FIELD_DISABLEPSDEFID}
     * <P>
     * 等同 {@link #setDisablePSDEFId}
     * @param disablePSDEFId
     */
    @JsonIgnore
    public PSCodeList disablepsdefid(String disablePSDEFId){
        this.setDisablePSDEFId(disablePSDEFId);
        return this;
    }

    /**
     * 设置 禁止选择属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDisablePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList disablepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDisablePSDEFId(null);
            this.setDisablePSDEFName(null);
        }
        else{
            this.setDisablePSDEFId(pSDEField.getPSDEFieldId());
            this.setDisablePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DISABLEPSDEFNAME</B>&nbsp;禁止选择属性，动态代码表指定代码项禁止选择项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DISABLEPSDEFID}
     */
    public final static String FIELD_DISABLEPSDEFNAME = "disablepsdefname";

    /**
     * 设置 禁止选择属性，详细说明：{@link #FIELD_DISABLEPSDEFNAME}
     * 
     * @param disablePSDEFName
     * 
     */
    @JsonProperty(FIELD_DISABLEPSDEFNAME)
    public void setDisablePSDEFName(String disablePSDEFName){
        this.set(FIELD_DISABLEPSDEFNAME, disablePSDEFName);
    }
    
    /**
     * 获取 禁止选择属性  
     * @return
     */
    @JsonIgnore
    public String getDisablePSDEFName(){
        Object objValue = this.get(FIELD_DISABLEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 禁止选择属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDisablePSDEFNameDirty(){
        if(this.contains(FIELD_DISABLEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁止选择属性
     */
    @JsonIgnore
    public void resetDisablePSDEFName(){
        this.reset(FIELD_DISABLEPSDEFNAME);
    }

    /**
     * 设置 禁止选择属性，详细说明：{@link #FIELD_DISABLEPSDEFNAME}
     * <P>
     * 等同 {@link #setDisablePSDEFName}
     * @param disablePSDEFName
     */
    @JsonIgnore
    public PSCodeList disablepsdefname(String disablePSDEFName){
        this.setDisablePSDEFName(disablePSDEFName);
        return this;
    }

    /**
     * <B>DSCONDITIONS</B>&nbsp;附加查询条件，动态代码表指定数据集额外的查询条件
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_DSCONDITIONS = "dsconditions";

    /**
     * 设置 附加查询条件，详细说明：{@link #FIELD_DSCONDITIONS}
     * 
     * @param dSConditions
     * 
     */
    @JsonProperty(FIELD_DSCONDITIONS)
    public void setDSConditions(String dSConditions){
        this.set(FIELD_DSCONDITIONS, dSConditions);
    }
    
    /**
     * 获取 附加查询条件  
     * @return
     */
    @JsonIgnore
    public String getDSConditions(){
        Object objValue = this.get(FIELD_DSCONDITIONS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 附加查询条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDSConditionsDirty(){
        if(this.contains(FIELD_DSCONDITIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 附加查询条件
     */
    @JsonIgnore
    public void resetDSConditions(){
        this.reset(FIELD_DSCONDITIONS);
    }

    /**
     * 设置 附加查询条件，详细说明：{@link #FIELD_DSCONDITIONS}
     * <P>
     * 等同 {@link #setDSConditions}
     * @param dSConditions
     */
    @JsonIgnore
    public PSCodeList dsconditions(String dSConditions){
        this.setDSConditions(dSConditions);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定代码表无值显示内容，未指定时使用系统默认配置。如代码表指定【无值显示空白】则忽略此配置
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EMPTYTEXT = "emptytext";

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * 
     * @param emptyText
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXT)
    public void setEmptyText(String emptyText){
        this.set(FIELD_EMPTYTEXT, emptyText);
    }
    
    /**
     * 获取 无值显示内容  
     * @return
     */
    @JsonIgnore
    public String getEmptyText(){
        Object objValue = this.get(FIELD_EMPTYTEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值显示内容 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextDirty(){
        if(this.contains(FIELD_EMPTYTEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值显示内容
     */
    @JsonIgnore
    public void resetEmptyText(){
        this.reset(FIELD_EMPTYTEXT);
    }

    /**
     * 设置 无值显示内容，详细说明：{@link #FIELD_EMPTYTEXT}
     * <P>
     * 等同 {@link #setEmptyText}
     * @param emptyText
     */
    @JsonIgnore
    public PSCodeList emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值文本语言资源，指定代码表无值显示内容的多语言资源，未指定时使用系统默认配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";

    /**
     * 设置 无值文本语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * 
     * @param emptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESID)
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId){
        this.set(FIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }
    
    /**
     * 获取 无值文本语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResId(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值文本语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResIdDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值文本语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResId(){
        this.reset(FIELD_EMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 无值文本语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param emptyTextPSLanResId
     */
    @JsonIgnore
    public PSCodeList emptytextpslanresid(String emptyTextPSLanResId){
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 无值文本语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSCodeList emptytextpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setEmptyTextPSLanResId(null);
            this.setEmptyTextPSLanResName(null);
        }
        else{
            this.setEmptyTextPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setEmptyTextPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值文本语言资源，指定代码表无值显示内容的多语言资源，未指定时使用系统默认配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";

    /**
     * 设置 无值文本语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * 
     * @param emptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESNAME)
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName){
        this.set(FIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }
    
    /**
     * 获取 无值文本语言资源  
     * @return
     */
    @JsonIgnore
    public String getEmptyTextPSLanResName(){
        Object objValue = this.get(FIELD_EMPTYTEXTPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 无值文本语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmptyTextPSLanResNameDirty(){
        if(this.contains(FIELD_EMPTYTEXTPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值文本语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResName(){
        this.reset(FIELD_EMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 无值文本语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResName}
     * @param emptyTextPSLanResName
     */
    @JsonIgnore
    public PSCodeList emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLECACHE</B>&nbsp;启用缓存，动态代码表指定代码表是否启用缓存，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECACHE = "enablecache";

    /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * 
     * @param enableCache
     * 
     */
    @JsonProperty(FIELD_ENABLECACHE)
    public void setEnableCache(Integer enableCache){
        this.set(FIELD_ENABLECACHE, enableCache);
    }
    
    /**
     * 获取 启用缓存  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCache(){
        Object objValue = this.get(FIELD_ENABLECACHE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用缓存 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCacheDirty(){
        if(this.contains(FIELD_ENABLECACHE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用缓存
     */
    @JsonIgnore
    public void resetEnableCache(){
        this.reset(FIELD_ENABLECACHE);
    }

    /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSCodeList enablecache(Integer enableCache){
        this.setEnableCache(enableCache);
        return this;
    }

     /**
     * 设置 启用缓存，详细说明：{@link #FIELD_ENABLECACHE}
     * <P>
     * 等同 {@link #setEnableCache}
     * @param enableCache
     */
    @JsonIgnore
    public PSCodeList enablecache(Boolean enableCache){
        if(enableCache == null){
            this.setEnableCache(null);
        }
        else{
            this.setEnableCache(enableCache?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNASYS</B>&nbsp;支持动态系统
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DynaSysMode} 
     */
    public final static String FIELD_ENABLEDYNASYS = "enabledynasys";

    /**
     * 设置 支持动态系统
     * 
     * @param enableDynaSys
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNASYS)
    public void setEnableDynaSys(Integer enableDynaSys){
        this.set(FIELD_ENABLEDYNASYS, enableDynaSys);
    }
    
    /**
     * 获取 支持动态系统  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaSys(){
        Object objValue = this.get(FIELD_ENABLEDYNASYS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态系统 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaSysDirty(){
        if(this.contains(FIELD_ENABLEDYNASYS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态系统
     */
    @JsonIgnore
    public void resetEnableDynaSys(){
        this.reset(FIELD_ENABLEDYNASYS);
    }

    /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSCodeList enabledynasys(Integer enableDynaSys){
        this.setEnableDynaSys(enableDynaSys);
        return this;
    }

     /**
     * 设置 支持动态系统
     * <P>
     * 等同 {@link #setEnableDynaSys}
     * @param enableDynaSys
     */
    @JsonIgnore
    public PSCodeList enabledynasys(net.ibizsys.psmodel.core.util.PSModelEnums.DynaSysMode enableDynaSys){
        if(enableDynaSys == null){
            this.setEnableDynaSys(null);
        }
        else{
            this.setEnableDynaSys(enableDynaSys.value);
        }
        return this;
    }

    /**
     * <B>ENDVALUEPSDEFID</B>&nbsp;结束值属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ENDVALUEPSDEFID = "endvaluepsdefid";

    /**
     * 设置 结束值属性
     * 
     * @param endValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_ENDVALUEPSDEFID)
    public void setEndValuePSDEFId(String endValuePSDEFId){
        this.set(FIELD_ENDVALUEPSDEFID, endValuePSDEFId);
    }
    
    /**
     * 获取 结束值属性  
     * @return
     */
    @JsonIgnore
    public String getEndValuePSDEFId(){
        Object objValue = this.get(FIELD_ENDVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndValuePSDEFIdDirty(){
        if(this.contains(FIELD_ENDVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束值属性
     */
    @JsonIgnore
    public void resetEndValuePSDEFId(){
        this.reset(FIELD_ENDVALUEPSDEFID);
    }

    /**
     * 设置 结束值属性
     * <P>
     * 等同 {@link #setEndValuePSDEFId}
     * @param endValuePSDEFId
     */
    @JsonIgnore
    public PSCodeList endvaluepsdefid(String endValuePSDEFId){
        this.setEndValuePSDEFId(endValuePSDEFId);
        return this;
    }

    /**
     * 设置 结束值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEndValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList endvaluepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setEndValuePSDEFId(null);
            this.setEndValuePSDEFName(null);
        }
        else{
            this.setEndValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setEndValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ENDVALUEPSDEFNAME</B>&nbsp;结束值属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ENDVALUEPSDEFID}
     */
    public final static String FIELD_ENDVALUEPSDEFNAME = "endvaluepsdefname";

    /**
     * 设置 结束值属性
     * 
     * @param endValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_ENDVALUEPSDEFNAME)
    public void setEndValuePSDEFName(String endValuePSDEFName){
        this.set(FIELD_ENDVALUEPSDEFNAME, endValuePSDEFName);
    }
    
    /**
     * 获取 结束值属性  
     * @return
     */
    @JsonIgnore
    public String getEndValuePSDEFName(){
        Object objValue = this.get(FIELD_ENDVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结束值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndValuePSDEFNameDirty(){
        if(this.contains(FIELD_ENDVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束值属性
     */
    @JsonIgnore
    public void resetEndValuePSDEFName(){
        this.reset(FIELD_ENDVALUEPSDEFNAME);
    }

    /**
     * 设置 结束值属性
     * <P>
     * 等同 {@link #setEndValuePSDEFName}
     * @param endValuePSDEFName
     */
    @JsonIgnore
    public PSCodeList endvaluepsdefname(String endValuePSDEFName){
        this.setEndValuePSDEFName(endValuePSDEFName);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定代码表的扩展模式，此配置针对子系统代码表，标记是否要对原功能进行扩展。未定义时为【无扩展】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode} 
     */
    public final static String FIELD_EXTENDMODE = "extendmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * 
     * @param extendMode
     * 
     */
    @JsonProperty(FIELD_EXTENDMODE)
    public void setExtendMode(Integer extendMode){
        this.set(FIELD_EXTENDMODE, extendMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public Integer getExtendMode(){
        Object objValue = this.get(FIELD_EXTENDMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isExtendModeDirty(){
        if(this.contains(FIELD_EXTENDMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetExtendMode(){
        this.reset(FIELD_EXTENDMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSCodeList extendmode(Integer extendMode){
        this.setExtendMode(extendMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_EXTENDMODE}
     * <P>
     * 等同 {@link #setExtendMode}
     * @param extendMode
     */
    @JsonIgnore
    public PSCodeList extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>ICONCLSPSDEFID</B>&nbsp;图标样式属性，动态代码表指定代码项图标样式项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ICONCLSPSDEFID = "iconclspsdefid";

    /**
     * 设置 图标样式属性，详细说明：{@link #FIELD_ICONCLSPSDEFID}
     * 
     * @param iconClsPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONCLSPSDEFID)
    public void setIconClsPSDEFId(String iconClsPSDEFId){
        this.set(FIELD_ICONCLSPSDEFID, iconClsPSDEFId);
    }
    
    /**
     * 获取 图标样式属性  
     * @return
     */
    @JsonIgnore
    public String getIconClsPSDEFId(){
        Object objValue = this.get(FIELD_ICONCLSPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsPSDEFIdDirty(){
        if(this.contains(FIELD_ICONCLSPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式属性
     */
    @JsonIgnore
    public void resetIconClsPSDEFId(){
        this.reset(FIELD_ICONCLSPSDEFID);
    }

    /**
     * 设置 图标样式属性，详细说明：{@link #FIELD_ICONCLSPSDEFID}
     * <P>
     * 等同 {@link #setIconClsPSDEFId}
     * @param iconClsPSDEFId
     */
    @JsonIgnore
    public PSCodeList iconclspsdefid(String iconClsPSDEFId){
        this.setIconClsPSDEFId(iconClsPSDEFId);
        return this;
    }

    /**
     * 设置 图标样式属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconClsPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList iconclspsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIconClsPSDEFId(null);
            this.setIconClsPSDEFName(null);
        }
        else{
            this.setIconClsPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconClsPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONCLSPSDEFNAME</B>&nbsp;图标样式属性，动态代码表指定代码项图标样式项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONCLSPSDEFID}
     */
    public final static String FIELD_ICONCLSPSDEFNAME = "iconclspsdefname";

    /**
     * 设置 图标样式属性，详细说明：{@link #FIELD_ICONCLSPSDEFNAME}
     * 
     * @param iconClsPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONCLSPSDEFNAME)
    public void setIconClsPSDEFName(String iconClsPSDEFName){
        this.set(FIELD_ICONCLSPSDEFNAME, iconClsPSDEFName);
    }
    
    /**
     * 获取 图标样式属性  
     * @return
     */
    @JsonIgnore
    public String getIconClsPSDEFName(){
        Object objValue = this.get(FIELD_ICONCLSPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsPSDEFNameDirty(){
        if(this.contains(FIELD_ICONCLSPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式属性
     */
    @JsonIgnore
    public void resetIconClsPSDEFName(){
        this.reset(FIELD_ICONCLSPSDEFNAME);
    }

    /**
     * 设置 图标样式属性，详细说明：{@link #FIELD_ICONCLSPSDEFNAME}
     * <P>
     * 等同 {@link #setIconClsPSDEFName}
     * @param iconClsPSDEFName
     */
    @JsonIgnore
    public PSCodeList iconclspsdefname(String iconClsPSDEFName){
        this.setIconClsPSDEFName(iconClsPSDEFName);
        return this;
    }

    /**
     * <B>ICONCLSXPSDEFID</B>&nbsp;图标样式（X）属性，动态代码表指定代码项图标样式（支持放大）项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ICONCLSXPSDEFID = "iconclsxpsdefid";

    /**
     * 设置 图标样式（X）属性，详细说明：{@link #FIELD_ICONCLSXPSDEFID}
     * 
     * @param iconClsXPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONCLSXPSDEFID)
    public void setIconClsXPSDEFId(String iconClsXPSDEFId){
        this.set(FIELD_ICONCLSXPSDEFID, iconClsXPSDEFId);
    }
    
    /**
     * 获取 图标样式（X）属性  
     * @return
     */
    @JsonIgnore
    public String getIconClsXPSDEFId(){
        Object objValue = this.get(FIELD_ICONCLSXPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式（X）属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsXPSDEFIdDirty(){
        if(this.contains(FIELD_ICONCLSXPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式（X）属性
     */
    @JsonIgnore
    public void resetIconClsXPSDEFId(){
        this.reset(FIELD_ICONCLSXPSDEFID);
    }

    /**
     * 设置 图标样式（X）属性，详细说明：{@link #FIELD_ICONCLSXPSDEFID}
     * <P>
     * 等同 {@link #setIconClsXPSDEFId}
     * @param iconClsXPSDEFId
     */
    @JsonIgnore
    public PSCodeList iconclsxpsdefid(String iconClsXPSDEFId){
        this.setIconClsXPSDEFId(iconClsXPSDEFId);
        return this;
    }

    /**
     * 设置 图标样式（X）属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconClsXPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList iconclsxpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIconClsXPSDEFId(null);
            this.setIconClsXPSDEFName(null);
        }
        else{
            this.setIconClsXPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconClsXPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONCLSXPSDEFNAME</B>&nbsp;图标样式（X）属性，动态代码表指定代码项图标样式（支持放大）项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONCLSXPSDEFID}
     */
    public final static String FIELD_ICONCLSXPSDEFNAME = "iconclsxpsdefname";

    /**
     * 设置 图标样式（X）属性，详细说明：{@link #FIELD_ICONCLSXPSDEFNAME}
     * 
     * @param iconClsXPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONCLSXPSDEFNAME)
    public void setIconClsXPSDEFName(String iconClsXPSDEFName){
        this.set(FIELD_ICONCLSXPSDEFNAME, iconClsXPSDEFName);
    }
    
    /**
     * 获取 图标样式（X）属性  
     * @return
     */
    @JsonIgnore
    public String getIconClsXPSDEFName(){
        Object objValue = this.get(FIELD_ICONCLSXPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标样式（X）属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconClsXPSDEFNameDirty(){
        if(this.contains(FIELD_ICONCLSXPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标样式（X）属性
     */
    @JsonIgnore
    public void resetIconClsXPSDEFName(){
        this.reset(FIELD_ICONCLSXPSDEFNAME);
    }

    /**
     * 设置 图标样式（X）属性，详细说明：{@link #FIELD_ICONCLSXPSDEFNAME}
     * <P>
     * 等同 {@link #setIconClsXPSDEFName}
     * @param iconClsXPSDEFName
     */
    @JsonIgnore
    public PSCodeList iconclsxpsdefname(String iconClsXPSDEFName){
        this.setIconClsXPSDEFName(iconClsXPSDEFName);
        return this;
    }

    /**
     * <B>ICONPATHPSDEFID</B>&nbsp;图标路径属性，动态代码表指定代码项图标路径项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ICONPATHPSDEFID = "iconpathpsdefid";

    /**
     * 设置 图标路径属性，详细说明：{@link #FIELD_ICONPATHPSDEFID}
     * 
     * @param iconPathPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONPATHPSDEFID)
    public void setIconPathPSDEFId(String iconPathPSDEFId){
        this.set(FIELD_ICONPATHPSDEFID, iconPathPSDEFId);
    }
    
    /**
     * 获取 图标路径属性  
     * @return
     */
    @JsonIgnore
    public String getIconPathPSDEFId(){
        Object objValue = this.get(FIELD_ICONPATHPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathPSDEFIdDirty(){
        if(this.contains(FIELD_ICONPATHPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径属性
     */
    @JsonIgnore
    public void resetIconPathPSDEFId(){
        this.reset(FIELD_ICONPATHPSDEFID);
    }

    /**
     * 设置 图标路径属性，详细说明：{@link #FIELD_ICONPATHPSDEFID}
     * <P>
     * 等同 {@link #setIconPathPSDEFId}
     * @param iconPathPSDEFId
     */
    @JsonIgnore
    public PSCodeList iconpathpsdefid(String iconPathPSDEFId){
        this.setIconPathPSDEFId(iconPathPSDEFId);
        return this;
    }

    /**
     * 设置 图标路径属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconPathPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList iconpathpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIconPathPSDEFId(null);
            this.setIconPathPSDEFName(null);
        }
        else{
            this.setIconPathPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPathPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONPATHPSDEFNAME</B>&nbsp;图标路径属性，动态代码表指定代码项图标路径项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONPATHPSDEFID}
     */
    public final static String FIELD_ICONPATHPSDEFNAME = "iconpathpsdefname";

    /**
     * 设置 图标路径属性，详细说明：{@link #FIELD_ICONPATHPSDEFNAME}
     * 
     * @param iconPathPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONPATHPSDEFNAME)
    public void setIconPathPSDEFName(String iconPathPSDEFName){
        this.set(FIELD_ICONPATHPSDEFNAME, iconPathPSDEFName);
    }
    
    /**
     * 获取 图标路径属性  
     * @return
     */
    @JsonIgnore
    public String getIconPathPSDEFName(){
        Object objValue = this.get(FIELD_ICONPATHPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathPSDEFNameDirty(){
        if(this.contains(FIELD_ICONPATHPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径属性
     */
    @JsonIgnore
    public void resetIconPathPSDEFName(){
        this.reset(FIELD_ICONPATHPSDEFNAME);
    }

    /**
     * 设置 图标路径属性，详细说明：{@link #FIELD_ICONPATHPSDEFNAME}
     * <P>
     * 等同 {@link #setIconPathPSDEFName}
     * @param iconPathPSDEFName
     */
    @JsonIgnore
    public PSCodeList iconpathpsdefname(String iconPathPSDEFName){
        this.setIconPathPSDEFName(iconPathPSDEFName);
        return this;
    }

    /**
     * <B>ICONPATHXPSDEFID</B>&nbsp;图标路径（X）属性，动态代码表指定代码项图标路径（支持放大）项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_ICONPATHXPSDEFID = "iconpathxpsdefid";

    /**
     * 设置 图标路径（X）属性，详细说明：{@link #FIELD_ICONPATHXPSDEFID}
     * 
     * @param iconPathXPSDEFId
     * 
     */
    @JsonProperty(FIELD_ICONPATHXPSDEFID)
    public void setIconPathXPSDEFId(String iconPathXPSDEFId){
        this.set(FIELD_ICONPATHXPSDEFID, iconPathXPSDEFId);
    }
    
    /**
     * 获取 图标路径（X）属性  
     * @return
     */
    @JsonIgnore
    public String getIconPathXPSDEFId(){
        Object objValue = this.get(FIELD_ICONPATHXPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径（X）属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathXPSDEFIdDirty(){
        if(this.contains(FIELD_ICONPATHXPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径（X）属性
     */
    @JsonIgnore
    public void resetIconPathXPSDEFId(){
        this.reset(FIELD_ICONPATHXPSDEFID);
    }

    /**
     * 设置 图标路径（X）属性，详细说明：{@link #FIELD_ICONPATHXPSDEFID}
     * <P>
     * 等同 {@link #setIconPathXPSDEFId}
     * @param iconPathXPSDEFId
     */
    @JsonIgnore
    public PSCodeList iconpathxpsdefid(String iconPathXPSDEFId){
        this.setIconPathXPSDEFId(iconPathXPSDEFId);
        return this;
    }

    /**
     * 设置 图标路径（X）属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setIconPathXPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList iconpathxpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setIconPathXPSDEFId(null);
            this.setIconPathXPSDEFName(null);
        }
        else{
            this.setIconPathXPSDEFId(pSDEField.getPSDEFieldId());
            this.setIconPathXPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>ICONPATHXPSDEFNAME</B>&nbsp;图标路径（X）属性，动态代码表指定代码项图标路径（支持放大）项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ICONPATHXPSDEFID}
     */
    public final static String FIELD_ICONPATHXPSDEFNAME = "iconpathxpsdefname";

    /**
     * 设置 图标路径（X）属性，详细说明：{@link #FIELD_ICONPATHXPSDEFNAME}
     * 
     * @param iconPathXPSDEFName
     * 
     */
    @JsonProperty(FIELD_ICONPATHXPSDEFNAME)
    public void setIconPathXPSDEFName(String iconPathXPSDEFName){
        this.set(FIELD_ICONPATHXPSDEFNAME, iconPathXPSDEFName);
    }
    
    /**
     * 获取 图标路径（X）属性  
     * @return
     */
    @JsonIgnore
    public String getIconPathXPSDEFName(){
        Object objValue = this.get(FIELD_ICONPATHXPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径（X）属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathXPSDEFNameDirty(){
        if(this.contains(FIELD_ICONPATHXPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径（X）属性
     */
    @JsonIgnore
    public void resetIconPathXPSDEFName(){
        this.reset(FIELD_ICONPATHXPSDEFNAME);
    }

    /**
     * 设置 图标路径（X）属性，详细说明：{@link #FIELD_ICONPATHXPSDEFNAME}
     * <P>
     * 等同 {@link #setIconPathXPSDEFName}
     * @param iconPathXPSDEFName
     */
    @JsonIgnore
    public PSCodeList iconpathxpsdefname(String iconPathXPSDEFName){
        this.setIconPathXPSDEFName(iconPathXPSDEFName);
        return this;
    }

    /**
     * <B>INCBEGINVALUE</B>&nbsp;包含开始值，动态代码表为阈值组模式时指定阈值项开始值的包含模式，未定义时为【首项包含】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ThresholdIncValueMode} 
     */
    public final static String FIELD_INCBEGINVALUE = "incbeginvalue";

    /**
     * 设置 包含开始值，详细说明：{@link #FIELD_INCBEGINVALUE}
     * 
     * @param incBeginValue
     * 
     */
    @JsonProperty(FIELD_INCBEGINVALUE)
    public void setIncBeginValue(Integer incBeginValue){
        this.set(FIELD_INCBEGINVALUE, incBeginValue);
    }
    
    /**
     * 获取 包含开始值  
     * @return
     */
    @JsonIgnore
    public Integer getIncBeginValue(){
        Object objValue = this.get(FIELD_INCBEGINVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含开始值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncBeginValueDirty(){
        if(this.contains(FIELD_INCBEGINVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含开始值
     */
    @JsonIgnore
    public void resetIncBeginValue(){
        this.reset(FIELD_INCBEGINVALUE);
    }

    /**
     * 设置 包含开始值，详细说明：{@link #FIELD_INCBEGINVALUE}
     * <P>
     * 等同 {@link #setIncBeginValue}
     * @param incBeginValue
     */
    @JsonIgnore
    public PSCodeList incbeginvalue(Integer incBeginValue){
        this.setIncBeginValue(incBeginValue);
        return this;
    }

     /**
     * 设置 包含开始值，详细说明：{@link #FIELD_INCBEGINVALUE}
     * <P>
     * 等同 {@link #setIncBeginValue}
     * @param incBeginValue
     */
    @JsonIgnore
    public PSCodeList incbeginvalue(net.ibizsys.psmodel.core.util.PSModelEnums.ThresholdIncValueMode incBeginValue){
        if(incBeginValue == null){
            this.setIncBeginValue(null);
        }
        else{
            this.setIncBeginValue(incBeginValue.value);
        }
        return this;
    }

    /**
     * <B>INCENDVALUE</B>&nbsp;包含结束值，动态代码表为阈值组模式时指定阈值项结束值的包含模式，未定义时为【尾项包含】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ThresholdIncValueMode} 
     */
    public final static String FIELD_INCENDVALUE = "incendvalue";

    /**
     * 设置 包含结束值，详细说明：{@link #FIELD_INCENDVALUE}
     * 
     * @param incEndValue
     * 
     */
    @JsonProperty(FIELD_INCENDVALUE)
    public void setIncEndValue(Integer incEndValue){
        this.set(FIELD_INCENDVALUE, incEndValue);
    }
    
    /**
     * 获取 包含结束值  
     * @return
     */
    @JsonIgnore
    public Integer getIncEndValue(){
        Object objValue = this.get(FIELD_INCENDVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含结束值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncEndValueDirty(){
        if(this.contains(FIELD_INCENDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含结束值
     */
    @JsonIgnore
    public void resetIncEndValue(){
        this.reset(FIELD_INCENDVALUE);
    }

    /**
     * 设置 包含结束值，详细说明：{@link #FIELD_INCENDVALUE}
     * <P>
     * 等同 {@link #setIncEndValue}
     * @param incEndValue
     */
    @JsonIgnore
    public PSCodeList incendvalue(Integer incEndValue){
        this.setIncEndValue(incEndValue);
        return this;
    }

     /**
     * 设置 包含结束值，详细说明：{@link #FIELD_INCENDVALUE}
     * <P>
     * 等同 {@link #setIncEndValue}
     * @param incEndValue
     */
    @JsonIgnore
    public PSCodeList incendvalue(net.ibizsys.psmodel.core.util.PSModelEnums.ThresholdIncValueMode incEndValue){
        if(incEndValue == null){
            this.setIncEndValue(null);
        }
        else{
            this.setIncEndValue(incEndValue.value);
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWID</B>&nbsp;链接实体视图，指定代码表值项的链接实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_LINKPSDEVIEWID = "linkpsdeviewid";

    /**
     * 设置 链接实体视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * 
     * @param linkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWID)
    public void setLinkPSDEViewId(String linkPSDEViewId){
        this.set(FIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }
    
    /**
     * 获取 链接实体视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewId(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewIdDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接实体视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewId(){
        this.reset(FIELD_LINKPSDEVIEWID);
    }

    /**
     * 设置 链接实体视图，详细说明：{@link #FIELD_LINKPSDEVIEWID}
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param linkPSDEViewId
     */
    @JsonIgnore
    public PSCodeList linkpsdeviewid(String linkPSDEViewId){
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    /**
     * 设置 链接实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSCodeList linkpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setLinkPSDEViewId(null);
            this.setLinkPSDEViewName(null);
        }
        else{
            this.setLinkPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setLinkPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWNAME</B>&nbsp;链接实体视图，指定代码表值项的链接实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEVIEWID}
     */
    public final static String FIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";

    /**
     * 设置 链接实体视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * 
     * @param linkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWNAME)
    public void setLinkPSDEViewName(String linkPSDEViewName){
        this.set(FIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }
    
    /**
     * 获取 链接实体视图  
     * @return
     */
    @JsonIgnore
    public String getLinkPSDEViewName(){
        Object objValue = this.get(FIELD_LINKPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkPSDEViewNameDirty(){
        if(this.contains(FIELD_LINKPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接实体视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewName(){
        this.reset(FIELD_LINKPSDEVIEWNAME);
    }

    /**
     * 设置 链接实体视图，详细说明：{@link #FIELD_LINKPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setLinkPSDEViewName}
     * @param linkPSDEViewName
     */
    @JsonIgnore
    public PSCodeList linkpsdeviewname(String linkPSDEViewName){
        this.setLinkPSDEViewName(linkPSDEViewName);
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
    public PSCodeList memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORSORTDIR</B>&nbsp;默认排序方向，指定动态代码表对数据集合的排序方向，需指定排序属性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_MINORSORTDIR = "minorsortdir";

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * 
     * @param minorSortDir
     * 
     */
    @JsonProperty(FIELD_MINORSORTDIR)
    public void setMinorSortDir(String minorSortDir){
        this.set(FIELD_MINORSORTDIR, minorSortDir);
    }
    
    /**
     * 获取 默认排序方向  
     * @return
     */
    @JsonIgnore
    public String getMinorSortDir(){
        Object objValue = this.get(FIELD_MINORSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortDirDirty(){
        if(this.contains(FIELD_MINORSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序方向
     */
    @JsonIgnore
    public void resetMinorSortDir(){
        this.reset(FIELD_MINORSORTDIR);
    }

    /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSCodeList minorsortdir(String minorSortDir){
        this.setMinorSortDir(minorSortDir);
        return this;
    }

     /**
     * 设置 默认排序方向，详细说明：{@link #FIELD_MINORSORTDIR}
     * <P>
     * 等同 {@link #setMinorSortDir}
     * @param minorSortDir
     */
    @JsonIgnore
    public PSCodeList minorsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir minorSortDir){
        if(minorSortDir == null){
            this.setMinorSortDir(null);
        }
        else{
            this.setMinorSortDir(minorSortDir.value);
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFID</B>&nbsp;默认排序属性，指定动态代码表对数据集合的排序属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MINORSORTPSDEFID = "minorsortpsdefid";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * 
     * @param minorSortPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFID)
    public void setMinorSortPSDEFId(String minorSortPSDEFId){
        this.set(FIELD_MINORSORTPSDEFID, minorSortPSDEFId);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFId(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFIdDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFId(){
        this.reset(FIELD_MINORSORTPSDEFID);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFID}
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param minorSortPSDEFId
     */
    @JsonIgnore
    public PSCodeList minorsortpsdefid(String minorSortPSDEFId){
        this.setMinorSortPSDEFId(minorSortPSDEFId);
        return this;
    }

    /**
     * 设置 默认排序属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorSortPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList minorsortpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMinorSortPSDEFId(null);
            this.setMinorSortPSDEFName(null);
        }
        else{
            this.setMinorSortPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorSortPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORSORTPSDEFNAME</B>&nbsp;默认排序属性，指定动态代码表对数据集合的排序属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORSORTPSDEFID}
     */
    public final static String FIELD_MINORSORTPSDEFNAME = "minorsortpsdefname";

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * 
     * @param minorSortPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORSORTPSDEFNAME)
    public void setMinorSortPSDEFName(String minorSortPSDEFName){
        this.set(FIELD_MINORSORTPSDEFNAME, minorSortPSDEFName);
    }
    
    /**
     * 获取 默认排序属性  
     * @return
     */
    @JsonIgnore
    public String getMinorSortPSDEFName(){
        Object objValue = this.get(FIELD_MINORSORTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认排序属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorSortPSDEFNameDirty(){
        if(this.contains(FIELD_MINORSORTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认排序属性
     */
    @JsonIgnore
    public void resetMinorSortPSDEFName(){
        this.reset(FIELD_MINORSORTPSDEFNAME);
    }

    /**
     * 设置 默认排序属性，详细说明：{@link #FIELD_MINORSORTPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorSortPSDEFName}
     * @param minorSortPSDEFName
     */
    @JsonIgnore
    public PSCodeList minorsortpsdefname(String minorSortPSDEFName){
        this.setMinorSortPSDEFName(minorSortPSDEFName);
        return this;
    }

    /**
     * <B>MODCOLOR</B>&nbsp;模块颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSMODULEID}
     */
    public final static String FIELD_MODCOLOR = "modcolor";

    /**
     * 设置 模块颜色
     * 
     * @param modColor
     * 
     */
    @JsonProperty(FIELD_MODCOLOR)
    public void setModColor(String modColor){
        this.set(FIELD_MODCOLOR, modColor);
    }
    
    /**
     * 获取 模块颜色  
     * @return
     */
    @JsonIgnore
    public String getModColor(){
        Object objValue = this.get(FIELD_MODCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModColorDirty(){
        if(this.contains(FIELD_MODCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块颜色
     */
    @JsonIgnore
    public void resetModColor(){
        this.reset(FIELD_MODCOLOR);
    }

    /**
     * 设置 模块颜色
     * <P>
     * 等同 {@link #setModColor}
     * @param modColor
     */
    @JsonIgnore
    public PSCodeList modcolor(String modColor){
        this.setModColor(modColor);
        return this;
    }

    /**
     * <B>NOVALUEEMPTY</B>&nbsp;无值显示空白，指定代码表在无值情况是否输出空白内容，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOVALUEEMPTY = "novalueempty";

    /**
     * 设置 无值显示空白，详细说明：{@link #FIELD_NOVALUEEMPTY}
     * 
     * @param noValueEmpty
     * 
     */
    @JsonProperty(FIELD_NOVALUEEMPTY)
    public void setNoValueEmpty(Integer noValueEmpty){
        this.set(FIELD_NOVALUEEMPTY, noValueEmpty);
    }
    
    /**
     * 获取 无值显示空白  
     * @return
     */
    @JsonIgnore
    public Integer getNoValueEmpty(){
        Object objValue = this.get(FIELD_NOVALUEEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无值显示空白 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoValueEmptyDirty(){
        if(this.contains(FIELD_NOVALUEEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无值显示空白
     */
    @JsonIgnore
    public void resetNoValueEmpty(){
        this.reset(FIELD_NOVALUEEMPTY);
    }

    /**
     * 设置 无值显示空白，详细说明：{@link #FIELD_NOVALUEEMPTY}
     * <P>
     * 等同 {@link #setNoValueEmpty}
     * @param noValueEmpty
     */
    @JsonIgnore
    public PSCodeList novalueempty(Integer noValueEmpty){
        this.setNoValueEmpty(noValueEmpty);
        return this;
    }

     /**
     * 设置 无值显示空白，详细说明：{@link #FIELD_NOVALUEEMPTY}
     * <P>
     * 等同 {@link #setNoValueEmpty}
     * @param noValueEmpty
     */
    @JsonIgnore
    public PSCodeList novalueempty(Boolean noValueEmpty){
        if(noValueEmpty == null){
            this.setNoValueEmpty(null);
        }
        else{
            this.setNoValueEmpty(noValueEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NUMBERITEM</B>&nbsp;数值代码项，指定代码项的在值为数值类型，默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NUMBERITEM = "numberitem";

    /**
     * 设置 数值代码项，详细说明：{@link #FIELD_NUMBERITEM}
     * 
     * @param numberItem
     * 
     */
    @JsonProperty(FIELD_NUMBERITEM)
    public void setNumberItem(Integer numberItem){
        this.set(FIELD_NUMBERITEM, numberItem);
    }
    
    /**
     * 获取 数值代码项  
     * @return
     */
    @JsonIgnore
    public Integer getNumberItem(){
        Object objValue = this.get(FIELD_NUMBERITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 数值代码项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNumberItemDirty(){
        if(this.contains(FIELD_NUMBERITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数值代码项
     */
    @JsonIgnore
    public void resetNumberItem(){
        this.reset(FIELD_NUMBERITEM);
    }

    /**
     * 设置 数值代码项，详细说明：{@link #FIELD_NUMBERITEM}
     * <P>
     * 等同 {@link #setNumberItem}
     * @param numberItem
     */
    @JsonIgnore
    public PSCodeList numberitem(Integer numberItem){
        this.setNumberItem(numberItem);
        return this;
    }

     /**
     * 设置 数值代码项，详细说明：{@link #FIELD_NUMBERITEM}
     * <P>
     * 等同 {@link #setNumberItem}
     * @param numberItem
     */
    @JsonIgnore
    public PSCodeList numberitem(Boolean numberItem){
        if(numberItem == null){
            this.setNumberItem(null);
        }
        else{
            this.setNumberItem(numberItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSCodeList ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>ORMODE</B>&nbsp;多项或模式，指定代码表的多项或模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DesignCodeListOrMode} 
     */
    public final static String FIELD_ORMODE = "ormode";

    /**
     * 设置 多项或模式，详细说明：{@link #FIELD_ORMODE}
     * 
     * @param orMode
     * 
     */
    @JsonProperty(FIELD_ORMODE)
    public void setOrMode(String orMode){
        this.set(FIELD_ORMODE, orMode);
    }
    
    /**
     * 获取 多项或模式  
     * @return
     */
    @JsonIgnore
    public String getOrMode(){
        Object objValue = this.get(FIELD_ORMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 多项或模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrModeDirty(){
        if(this.contains(FIELD_ORMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 多项或模式
     */
    @JsonIgnore
    public void resetOrMode(){
        this.reset(FIELD_ORMODE);
    }

    /**
     * 设置 多项或模式，详细说明：{@link #FIELD_ORMODE}
     * <P>
     * 等同 {@link #setOrMode}
     * @param orMode
     */
    @JsonIgnore
    public PSCodeList ormode(String orMode){
        this.setOrMode(orMode);
        return this;
    }

     /**
     * 设置 多项或模式，详细说明：{@link #FIELD_ORMODE}
     * <P>
     * 等同 {@link #setOrMode}
     * @param orMode
     */
    @JsonIgnore
    public PSCodeList ormode(net.ibizsys.psmodel.core.util.PSModelEnums.DesignCodeListOrMode orMode){
        if(orMode == null){
            this.setOrMode(null);
        }
        else{
            this.setOrMode(orMode.value);
        }
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预置类型，在代码表类型为【预定义】时进一步指定预定义模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedCodeListType} 
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预置类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预置类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedType(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预置类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSCodeList predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

     /**
     * 设置 预置类型，详细说明：{@link #FIELD_PREDEFINEDTYPE}
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSCodeList predefinedtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedCodeListType predefinedType){
        if(predefinedType == null){
            this.setPredefinedType(null);
        }
        else{
            this.setPredefinedType(predefinedType.value);
        }
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表标识
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表标识  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListId(){
        Object objValue = this.get(FIELD_PSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统代码表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListIdDirty(){
        if(this.contains(FIELD_PSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统代码表标识
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表标识
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSCodeList pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;代码表名称，指定代码表的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表名称，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表名称  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListName(){
        Object objValue = this.get(FIELD_PSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListNameDirty(){
        if(this.contains(FIELD_PSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表名称
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表名称，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSCodeList pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCodeListName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCodeListName(strName);
    }

    @JsonIgnore
    public PSCodeList name(String strName){
        this.setPSCodeListName(strName);
        return this;
    }

    /**
     * <B>PSCODELISTTEMPLID</B>&nbsp;预置代码表，指定代码表来源的平台预置代码表
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCODELISTTEMPLID = "pscodelisttemplid";

    /**
     * 设置 预置代码表，详细说明：{@link #FIELD_PSCODELISTTEMPLID}
     * 
     * @param pSCodeListTemplId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTTEMPLID)
    public void setPSCodeListTemplId(String pSCodeListTemplId){
        this.set(FIELD_PSCODELISTTEMPLID, pSCodeListTemplId);
    }
    
    /**
     * 获取 预置代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListTemplId(){
        Object objValue = this.get(FIELD_PSCODELISTTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListTemplIdDirty(){
        if(this.contains(FIELD_PSCODELISTTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置代码表
     */
    @JsonIgnore
    public void resetPSCodeListTemplId(){
        this.reset(FIELD_PSCODELISTTEMPLID);
    }

    /**
     * 设置 预置代码表，详细说明：{@link #FIELD_PSCODELISTTEMPLID}
     * <P>
     * 等同 {@link #setPSCodeListTemplId}
     * @param pSCodeListTemplId
     */
    @JsonIgnore
    public PSCodeList pscodelisttemplid(String pSCodeListTemplId){
        this.setPSCodeListTemplId(pSCodeListTemplId);
        return this;
    }

    /**
     * <B>PSCODELISTTEMPLNAME</B>&nbsp;预置代码表，指定代码表来源的平台预置代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTTEMPLID}
     */
    public final static String FIELD_PSCODELISTTEMPLNAME = "pscodelisttemplname";

    /**
     * 设置 预置代码表，详细说明：{@link #FIELD_PSCODELISTTEMPLNAME}
     * 
     * @param pSCodeListTemplName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTTEMPLNAME)
    public void setPSCodeListTemplName(String pSCodeListTemplName){
        this.set(FIELD_PSCODELISTTEMPLNAME, pSCodeListTemplName);
    }
    
    /**
     * 获取 预置代码表  
     * @return
     */
    @JsonIgnore
    public String getPSCodeListTemplName(){
        Object objValue = this.get(FIELD_PSCODELISTTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCodeListTemplNameDirty(){
        if(this.contains(FIELD_PSCODELISTTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置代码表
     */
    @JsonIgnore
    public void resetPSCodeListTemplName(){
        this.reset(FIELD_PSCODELISTTEMPLNAME);
    }

    /**
     * 设置 预置代码表，详细说明：{@link #FIELD_PSCODELISTTEMPLNAME}
     * <P>
     * 等同 {@link #setPSCodeListTemplName}
     * @param pSCodeListTemplName
     */
    @JsonIgnore
    public PSCodeList pscodelisttemplname(String pSCodeListTemplName){
        this.setPSCodeListTemplName(pSCodeListTemplName);
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;实体数据集，指定动态代码表加载的数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSID}
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSID}
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSCodeList psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSCodeList psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;实体数据集，指定动态代码表加载的数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSNAME}
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDSNAME}
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSCodeList psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定动态代码表数据集的所在实体
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
    public PSCodeList psdeid(String pSDEId){
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
    public PSCodeList psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDEMSLOGICID</B>&nbsp;实体主状态逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_PSDEMSLOGICID = "psdemslogicid";

    /**
     * 设置 实体主状态逻辑
     * 
     * @param pSDEMSLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEMSLOGICID)
    public void setPSDEMSLogicId(String pSDEMSLogicId){
        this.set(FIELD_PSDEMSLOGICID, pSDEMSLogicId);
    }
    
    /**
     * 获取 实体主状态逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSLogicId(){
        Object objValue = this.get(FIELD_PSDEMSLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSLogicIdDirty(){
        if(this.contains(FIELD_PSDEMSLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态逻辑
     */
    @JsonIgnore
    public void resetPSDEMSLogicId(){
        this.reset(FIELD_PSDEMSLOGICID);
    }

    /**
     * 设置 实体主状态逻辑
     * <P>
     * 等同 {@link #setPSDEMSLogicId}
     * @param pSDEMSLogicId
     */
    @JsonIgnore
    public PSCodeList psdemslogicid(String pSDEMSLogicId){
        this.setPSDEMSLogicId(pSDEMSLogicId);
        return this;
    }

    /**
     * 设置 实体主状态逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMSLogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSCodeList psdemslogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setPSDEMSLogicId(null);
            this.setPSDEMSLogicName(null);
        }
        else{
            this.setPSDEMSLogicId(pSDELogic.getPSDELogicId());
            this.setPSDEMSLogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDEMSLOGICNAME</B>&nbsp;实体主状态逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMSLOGICID}
     */
    public final static String FIELD_PSDEMSLOGICNAME = "psdemslogicname";

    /**
     * 设置 实体主状态逻辑
     * 
     * @param pSDEMSLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEMSLOGICNAME)
    public void setPSDEMSLogicName(String pSDEMSLogicName){
        this.set(FIELD_PSDEMSLOGICNAME, pSDEMSLogicName);
    }
    
    /**
     * 获取 实体主状态逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDEMSLogicName(){
        Object objValue = this.get(FIELD_PSDEMSLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMSLogicNameDirty(){
        if(this.contains(FIELD_PSDEMSLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态逻辑
     */
    @JsonIgnore
    public void resetPSDEMSLogicName(){
        this.reset(FIELD_PSDEMSLOGICNAME);
    }

    /**
     * 设置 实体主状态逻辑
     * <P>
     * 等同 {@link #setPSDEMSLogicName}
     * @param pSDEMSLogicName
     */
    @JsonIgnore
    public PSCodeList psdemslogicname(String pSDEMSLogicName){
        this.setPSDEMSLogicName(pSDEMSLogicName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定动态代码表数据集的所在实体
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
    public PSCodeList psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDYNACODELISTID</B>&nbsp;扩展代码表
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNACODELISTID = "psdynacodelistid";

    /**
     * 设置 扩展代码表
     * 
     * @param pSDynaCodeListId
     * 
     */
    @JsonProperty(FIELD_PSDYNACODELISTID)
    public void setPSDynaCodeListId(String pSDynaCodeListId){
        this.set(FIELD_PSDYNACODELISTID, pSDynaCodeListId);
    }
    
    /**
     * 获取 扩展代码表  
     * @return
     */
    @JsonIgnore
    public String getPSDynaCodeListId(){
        Object objValue = this.get(FIELD_PSDYNACODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaCodeListIdDirty(){
        if(this.contains(FIELD_PSDYNACODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展代码表
     */
    @JsonIgnore
    public void resetPSDynaCodeListId(){
        this.reset(FIELD_PSDYNACODELISTID);
    }

    /**
     * 设置 扩展代码表
     * <P>
     * 等同 {@link #setPSDynaCodeListId}
     * @param pSDynaCodeListId
     */
    @JsonIgnore
    public PSCodeList psdynacodelistid(String pSDynaCodeListId){
        this.setPSDynaCodeListId(pSDynaCodeListId);
        return this;
    }

    /**
     * <B>PSDYNACODELISTNAME</B>&nbsp;扩展代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNACODELISTID}
     */
    public final static String FIELD_PSDYNACODELISTNAME = "psdynacodelistname";

    /**
     * 设置 扩展代码表
     * 
     * @param pSDynaCodeListName
     * 
     */
    @JsonProperty(FIELD_PSDYNACODELISTNAME)
    public void setPSDynaCodeListName(String pSDynaCodeListName){
        this.set(FIELD_PSDYNACODELISTNAME, pSDynaCodeListName);
    }
    
    /**
     * 获取 扩展代码表  
     * @return
     */
    @JsonIgnore
    public String getPSDynaCodeListName(){
        Object objValue = this.get(FIELD_PSDYNACODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaCodeListNameDirty(){
        if(this.contains(FIELD_PSDYNACODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展代码表
     */
    @JsonIgnore
    public void resetPSDynaCodeListName(){
        this.reset(FIELD_PSDYNACODELISTNAME);
    }

    /**
     * 设置 扩展代码表
     * <P>
     * 等同 {@link #setPSDynaCodeListName}
     * @param pSDynaCodeListName
     */
    @JsonIgnore
    public PSCodeList psdynacodelistname(String pSDynaCodeListName){
        this.setPSDynaCodeListName(pSDynaCodeListName);
        return this;
    }

    /**
     * <B>PSDYNAINSTNAME</B>&nbsp;动态实例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNAINSTID}
     */
    public final static String FIELD_PSDYNAINSTNAME = "psdynainstname";

    /**
     * 设置 动态实例
     * 
     * @param pSDynaInstName
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTNAME)
    public void setPSDynaInstName(String pSDynaInstName){
        this.set(FIELD_PSDYNAINSTNAME, pSDynaInstName);
    }
    
    /**
     * 获取 动态实例  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstName(){
        Object objValue = this.get(FIELD_PSDYNAINSTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstNameDirty(){
        if(this.contains(FIELD_PSDYNAINSTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例
     */
    @JsonIgnore
    public void resetPSDynaInstName(){
        this.reset(FIELD_PSDYNAINSTNAME);
    }

    /**
     * 设置 动态实例
     * <P>
     * 等同 {@link #setPSDynaInstName}
     * @param pSDynaInstName
     */
    @JsonIgnore
    public PSCodeList psdynainstname(String pSDynaInstName){
        this.setPSDynaInstName(pSDynaInstName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定代码表所在的系统模块
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
    public PSCodeList psmoduleid(String pSModuleId){
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
    public PSCodeList psmoduleid(PSModule pSModule){
        if(pSModule == null){
            this.setModColor(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setModColor(pSModule.getColor());
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定代码表所在的系统模块
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
    public PSCodeList psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;动态系统模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
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
    public PSCodeList pssysdynamodelid(String pSSysDynaModelId){
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
    public PSCodeList pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSCodeList pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSCodeList pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSCodeList pssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSCodeList pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysReqItem} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
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
     * 判断 系统设计需求 是否指定值，包括空值
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
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSCodeList pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSCodeList pssysreqitemid(PSSysReqItem pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
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
     * 判断 系统设计需求 是否指定值，包括空值
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
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSCodeList pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSCodeList pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSCodeList pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端扩展插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端扩展插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSCodeList pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PVALUEPSDEFID</B>&nbsp;父值属性，动态代码表指定代码项父值项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PVALUEPSDEFID = "pvaluepsdefid";

    /**
     * 设置 父值属性，详细说明：{@link #FIELD_PVALUEPSDEFID}
     * 
     * @param pValuePSDEFId
     * 
     */
    @JsonProperty(FIELD_PVALUEPSDEFID)
    public void setPValuePSDEFId(String pValuePSDEFId){
        this.set(FIELD_PVALUEPSDEFID, pValuePSDEFId);
    }
    
    /**
     * 获取 父值属性  
     * @return
     */
    @JsonIgnore
    public String getPValuePSDEFId(){
        Object objValue = this.get(FIELD_PVALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPValuePSDEFIdDirty(){
        if(this.contains(FIELD_PVALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父值属性
     */
    @JsonIgnore
    public void resetPValuePSDEFId(){
        this.reset(FIELD_PVALUEPSDEFID);
    }

    /**
     * 设置 父值属性，详细说明：{@link #FIELD_PVALUEPSDEFID}
     * <P>
     * 等同 {@link #setPValuePSDEFId}
     * @param pValuePSDEFId
     */
    @JsonIgnore
    public PSCodeList pvaluepsdefid(String pValuePSDEFId){
        this.setPValuePSDEFId(pValuePSDEFId);
        return this;
    }

    /**
     * 设置 父值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList pvaluepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPValuePSDEFId(null);
            this.setPValuePSDEFName(null);
        }
        else{
            this.setPValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setPValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PVALUEPSDEFNAME</B>&nbsp;父值属性，动态代码表指定代码项父值项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PVALUEPSDEFID}
     */
    public final static String FIELD_PVALUEPSDEFNAME = "pvaluepsdefname";

    /**
     * 设置 父值属性，详细说明：{@link #FIELD_PVALUEPSDEFNAME}
     * 
     * @param pValuePSDEFName
     * 
     */
    @JsonProperty(FIELD_PVALUEPSDEFNAME)
    public void setPValuePSDEFName(String pValuePSDEFName){
        this.set(FIELD_PVALUEPSDEFNAME, pValuePSDEFName);
    }
    
    /**
     * 获取 父值属性  
     * @return
     */
    @JsonIgnore
    public String getPValuePSDEFName(){
        Object objValue = this.get(FIELD_PVALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPValuePSDEFNameDirty(){
        if(this.contains(FIELD_PVALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父值属性
     */
    @JsonIgnore
    public void resetPValuePSDEFName(){
        this.reset(FIELD_PVALUEPSDEFNAME);
    }

    /**
     * 设置 父值属性，详细说明：{@link #FIELD_PVALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setPValuePSDEFName}
     * @param pValuePSDEFName
     */
    @JsonIgnore
    public PSCodeList pvaluepsdefname(String pValuePSDEFName){
        this.setPValuePSDEFName(pValuePSDEFName);
        return this;
    }

    /**
     * <B>SEPERATOR</B>&nbsp;显示分隔符号，指定多项代码表显示时项与项直接的分隔符号，默认为【、】
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_SEPERATOR = "seperator";

    /**
     * 设置 显示分隔符号，详细说明：{@link #FIELD_SEPERATOR}
     * 
     * @param seperator
     * 
     */
    @JsonProperty(FIELD_SEPERATOR)
    public void setSeperator(String seperator){
        this.set(FIELD_SEPERATOR, seperator);
    }
    
    /**
     * 获取 显示分隔符号  
     * @return
     */
    @JsonIgnore
    public String getSeperator(){
        Object objValue = this.get(FIELD_SEPERATOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示分隔符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSeperatorDirty(){
        if(this.contains(FIELD_SEPERATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示分隔符号
     */
    @JsonIgnore
    public void resetSeperator(){
        this.reset(FIELD_SEPERATOR);
    }

    /**
     * 设置 显示分隔符号，详细说明：{@link #FIELD_SEPERATOR}
     * <P>
     * 等同 {@link #setSeperator}
     * @param seperator
     */
    @JsonIgnore
    public PSCodeList seperator(String seperator){
        this.setSeperator(seperator);
        return this;
    }

    /**
     * <B>SYSREFFLAG</B>&nbsp;系统引用标志
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SYSREFFLAG = "sysrefflag";

    /**
     * 设置 系统引用标志
     * 
     * @param sysRefFlag
     * 
     */
    @JsonProperty(FIELD_SYSREFFLAG)
    public void setSysRefFlag(Integer sysRefFlag){
        this.set(FIELD_SYSREFFLAG, sysRefFlag);
    }
    
    /**
     * 获取 系统引用标志  
     * @return
     */
    @JsonIgnore
    public Integer getSysRefFlag(){
        Object objValue = this.get(FIELD_SYSREFFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统引用标志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysRefFlagDirty(){
        if(this.contains(FIELD_SYSREFFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统引用标志
     */
    @JsonIgnore
    public void resetSysRefFlag(){
        this.reset(FIELD_SYSREFFLAG);
    }

    /**
     * 设置 系统引用标志
     * <P>
     * 等同 {@link #setSysRefFlag}
     * @param sysRefFlag
     */
    @JsonIgnore
    public PSCodeList sysrefflag(Integer sysRefFlag){
        this.setSysRefFlag(sysRefFlag);
        return this;
    }

     /**
     * 设置 系统引用标志
     * <P>
     * 等同 {@link #setSysRefFlag}
     * @param sysRefFlag
     */
    @JsonIgnore
    public PSCodeList sysrefflag(Boolean sysRefFlag){
        if(sysRefFlag == null){
            this.setSysRefFlag(null);
        }
        else{
            this.setSysRefFlag(sysRefFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFID</B>&nbsp;文本属性，动态代码表指定代码项显示文本的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_TEXTPSDEFID = "textpsdefid";

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFID}
     * 
     * @param textPSDEFId
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFID)
    public void setTextPSDEFId(String textPSDEFId){
        this.set(FIELD_TEXTPSDEFID, textPSDEFId);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFId(){
        Object objValue = this.get(FIELD_TEXTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFIdDirty(){
        if(this.contains(FIELD_TEXTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFId(){
        this.reset(FIELD_TEXTPSDEFID);
    }

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFID}
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param textPSDEFId
     */
    @JsonIgnore
    public PSCodeList textpsdefid(String textPSDEFId){
        this.setTextPSDEFId(textPSDEFId);
        return this;
    }

    /**
     * 设置 文本属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTextPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList textpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setTextPSDEFId(null);
            this.setTextPSDEFName(null);
        }
        else{
            this.setTextPSDEFId(pSDEField.getPSDEFieldId());
            this.setTextPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>TEXTPSDEFNAME</B>&nbsp;文本属性，动态代码表指定代码项显示文本的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TEXTPSDEFID}
     */
    public final static String FIELD_TEXTPSDEFNAME = "textpsdefname";

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFNAME}
     * 
     * @param textPSDEFName
     * 
     */
    @JsonProperty(FIELD_TEXTPSDEFNAME)
    public void setTextPSDEFName(String textPSDEFName){
        this.set(FIELD_TEXTPSDEFNAME, textPSDEFName);
    }
    
    /**
     * 获取 文本属性  
     * @return
     */
    @JsonIgnore
    public String getTextPSDEFName(){
        Object objValue = this.get(FIELD_TEXTPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 文本属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTextPSDEFNameDirty(){
        if(this.contains(FIELD_TEXTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 文本属性
     */
    @JsonIgnore
    public void resetTextPSDEFName(){
        this.reset(FIELD_TEXTPSDEFNAME);
    }

    /**
     * 设置 文本属性，详细说明：{@link #FIELD_TEXTPSDEFNAME}
     * <P>
     * 等同 {@link #setTextPSDEFName}
     * @param textPSDEFName
     */
    @JsonIgnore
    public PSCodeList textpsdefname(String textPSDEFName){
        this.setTextPSDEFName(textPSDEFName);
        return this;
    }

    /**
     * <B>THRESHOLDGROUPFLAG</B>&nbsp;阈值组模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_THRESHOLDGROUPFLAG = "thresholdgroupflag";

    /**
     * 设置 阈值组模式
     * 
     * @param thresholdGroupFlag
     * 
     */
    @JsonProperty(FIELD_THRESHOLDGROUPFLAG)
    public void setThresholdGroupFlag(Integer thresholdGroupFlag){
        this.set(FIELD_THRESHOLDGROUPFLAG, thresholdGroupFlag);
    }
    
    /**
     * 获取 阈值组模式  
     * @return
     */
    @JsonIgnore
    public Integer getThresholdGroupFlag(){
        Object objValue = this.get(FIELD_THRESHOLDGROUPFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 阈值组模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThresholdGroupFlagDirty(){
        if(this.contains(FIELD_THRESHOLDGROUPFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 阈值组模式
     */
    @JsonIgnore
    public void resetThresholdGroupFlag(){
        this.reset(FIELD_THRESHOLDGROUPFLAG);
    }

    /**
     * 设置 阈值组模式
     * <P>
     * 等同 {@link #setThresholdGroupFlag}
     * @param thresholdGroupFlag
     */
    @JsonIgnore
    public PSCodeList thresholdgroupflag(Integer thresholdGroupFlag){
        this.setThresholdGroupFlag(thresholdGroupFlag);
        return this;
    }

     /**
     * 设置 阈值组模式
     * <P>
     * 等同 {@link #setThresholdGroupFlag}
     * @param thresholdGroupFlag
     */
    @JsonIgnore
    public PSCodeList thresholdgroupflag(Boolean thresholdGroupFlag){
        if(thresholdGroupFlag == null){
            this.setThresholdGroupFlag(null);
        }
        else{
            this.setThresholdGroupFlag(thresholdGroupFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSCodeList updatedate(String updateDate){
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
    public PSCodeList updateman(String updateMan){
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
    public PSCodeList usercat(String userCat){
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
    public PSCodeList usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;代码表数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 代码表数据
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 代码表数据  
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
     * 判断 代码表数据 是否指定值，包括空值
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
     * 重置 代码表数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 代码表数据
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSCodeList userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;代码表数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 代码表数据2
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 代码表数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码表数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码表数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 代码表数据2
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSCodeList userdata2(String userData2){
        this.setUserData2(userData2);
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;自定义参数
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 自定义参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 自定义参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 自定义参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSCodeList userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>USERREFFLAG</B>&nbsp;用户引用标志，指定代码表是否被手动标注引用，引擎会根据其它模型对代码表的引用情况标志代码表被引用，某些代码表可能没有被其它模型引用但会在程序处理中使用，这时候需要进行手动标志，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERREFFLAG = "userrefflag";

    /**
     * 设置 用户引用标志，详细说明：{@link #FIELD_USERREFFLAG}
     * 
     * @param userRefFlag
     * 
     */
    @JsonProperty(FIELD_USERREFFLAG)
    public void setUserRefFlag(Integer userRefFlag){
        this.set(FIELD_USERREFFLAG, userRefFlag);
    }
    
    /**
     * 获取 用户引用标志  
     * @return
     */
    @JsonIgnore
    public Integer getUserRefFlag(){
        Object objValue = this.get(FIELD_USERREFFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户引用标志 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserRefFlagDirty(){
        if(this.contains(FIELD_USERREFFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户引用标志
     */
    @JsonIgnore
    public void resetUserRefFlag(){
        this.reset(FIELD_USERREFFLAG);
    }

    /**
     * 设置 用户引用标志，详细说明：{@link #FIELD_USERREFFLAG}
     * <P>
     * 等同 {@link #setUserRefFlag}
     * @param userRefFlag
     */
    @JsonIgnore
    public PSCodeList userrefflag(Integer userRefFlag){
        this.setUserRefFlag(userRefFlag);
        return this;
    }

     /**
     * 设置 用户引用标志，详细说明：{@link #FIELD_USERREFFLAG}
     * <P>
     * 等同 {@link #setUserRefFlag}
     * @param userRefFlag
     */
    @JsonIgnore
    public PSCodeList userrefflag(Boolean userRefFlag){
        if(userRefFlag == null){
            this.setUserRefFlag(null);
        }
        else{
            this.setUserRefFlag(userRefFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>USERSCOPE</B>&nbsp;用户范围，动态代码表指定代码表是否是与用户身份相关，也就是非全局通用。默认为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERSCOPE = "userscope";

    /**
     * 设置 用户范围，详细说明：{@link #FIELD_USERSCOPE}
     * 
     * @param userScope
     * 
     */
    @JsonProperty(FIELD_USERSCOPE)
    public void setUserScope(Integer userScope){
        this.set(FIELD_USERSCOPE, userScope);
    }
    
    /**
     * 获取 用户范围  
     * @return
     */
    @JsonIgnore
    public Integer getUserScope(){
        Object objValue = this.get(FIELD_USERSCOPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserScopeDirty(){
        if(this.contains(FIELD_USERSCOPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户范围
     */
    @JsonIgnore
    public void resetUserScope(){
        this.reset(FIELD_USERSCOPE);
    }

    /**
     * 设置 用户范围，详细说明：{@link #FIELD_USERSCOPE}
     * <P>
     * 等同 {@link #setUserScope}
     * @param userScope
     */
    @JsonIgnore
    public PSCodeList userscope(Integer userScope){
        this.setUserScope(userScope);
        return this;
    }

     /**
     * 设置 用户范围，详细说明：{@link #FIELD_USERSCOPE}
     * <P>
     * 等同 {@link #setUserScope}
     * @param userScope
     */
    @JsonIgnore
    public PSCodeList userscope(Boolean userScope){
        if(userScope == null){
            this.setUserScope(null);
        }
        else{
            this.setUserScope(userScope?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSCodeList usertag(String userTag){
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
    public PSCodeList usertag2(String userTag2){
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
    public PSCodeList usertag3(String userTag3){
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
    public PSCodeList usertag4(String userTag4){
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
    public PSCodeList validflag(Integer validFlag){
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
    public PSCodeList validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFID</B>&nbsp;值属性，动态代码表指定代码项值项的读取属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_VALUEPSDEFID = "valuepsdefid";

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFID}
     * 
     * @param valuePSDEFId
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFID)
    public void setValuePSDEFId(String valuePSDEFId){
        this.set(FIELD_VALUEPSDEFID, valuePSDEFId);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFId(){
        Object objValue = this.get(FIELD_VALUEPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFIdDirty(){
        if(this.contains(FIELD_VALUEPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFId(){
        this.reset(FIELD_VALUEPSDEFID);
    }

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFID}
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param valuePSDEFId
     */
    @JsonIgnore
    public PSCodeList valuepsdefid(String valuePSDEFId){
        this.setValuePSDEFId(valuePSDEFId);
        return this;
    }

    /**
     * 设置 值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setValuePSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSCodeList valuepsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setValuePSDEFId(null);
            this.setValuePSDEFName(null);
        }
        else{
            this.setValuePSDEFId(pSDEField.getPSDEFieldId());
            this.setValuePSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>VALUEPSDEFNAME</B>&nbsp;值属性，动态代码表指定代码项值项的读取属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_VALUEPSDEFID}
     */
    public final static String FIELD_VALUEPSDEFNAME = "valuepsdefname";

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFNAME}
     * 
     * @param valuePSDEFName
     * 
     */
    @JsonProperty(FIELD_VALUEPSDEFNAME)
    public void setValuePSDEFName(String valuePSDEFName){
        this.set(FIELD_VALUEPSDEFNAME, valuePSDEFName);
    }
    
    /**
     * 获取 值属性  
     * @return
     */
    @JsonIgnore
    public String getValuePSDEFName(){
        Object objValue = this.get(FIELD_VALUEPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValuePSDEFNameDirty(){
        if(this.contains(FIELD_VALUEPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值属性
     */
    @JsonIgnore
    public void resetValuePSDEFName(){
        this.reset(FIELD_VALUEPSDEFNAME);
    }

    /**
     * 设置 值属性，详细说明：{@link #FIELD_VALUEPSDEFNAME}
     * <P>
     * 等同 {@link #setValuePSDEFName}
     * @param valuePSDEFName
     */
    @JsonIgnore
    public PSCodeList valuepsdefname(String valuePSDEFName){
        this.setValuePSDEFName(valuePSDEFName);
        return this;
    }

    /**
     * <B>VALUESEPERATOR</B>&nbsp;值分隔符号，文本或模式的多项代码表值得拼接分隔符号，默认为【;】
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_VALUESEPERATOR = "valueseperator";

    /**
     * 设置 值分隔符号，详细说明：{@link #FIELD_VALUESEPERATOR}
     * 
     * @param valueSeperator
     * 
     */
    @JsonProperty(FIELD_VALUESEPERATOR)
    public void setValueSeperator(String valueSeperator){
        this.set(FIELD_VALUESEPERATOR, valueSeperator);
    }
    
    /**
     * 获取 值分隔符号  
     * @return
     */
    @JsonIgnore
    public String getValueSeperator(){
        Object objValue = this.get(FIELD_VALUESEPERATOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值分隔符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueSeperatorDirty(){
        if(this.contains(FIELD_VALUESEPERATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值分隔符号
     */
    @JsonIgnore
    public void resetValueSeperator(){
        this.reset(FIELD_VALUESEPERATOR);
    }

    /**
     * 设置 值分隔符号，详细说明：{@link #FIELD_VALUESEPERATOR}
     * <P>
     * 等同 {@link #setValueSeperator}
     * @param valueSeperator
     */
    @JsonIgnore
    public PSCodeList valueseperator(String valueSeperator){
        this.setValueSeperator(valueSeperator);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCodeListId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCodeListId(strValue);
    }

    @JsonIgnore
    public PSCodeList id(String strValue){
        this.setPSCodeListId(strValue);
        return this;
    }


    /**
     *  代码表项 成员集合
     */
    public final static String FIELD_PSCODEITEMS = "pscodeitems";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSCodeItem> pscodeitems;

    /**
     * 获取 代码表项 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSCODEITEMS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSCodeItem> getPSCodeItems(){
        return this.pscodeitems;
    }

    /**
     * 设置 代码表项 成员集合  
     * @param pscodeitems
     */
    @JsonProperty(FIELD_PSCODEITEMS)
    public void setPSCodeItems(java.util.List<net.ibizsys.psmodel.core.domain.PSCodeItem> pscodeitems){
        this.pscodeitems = pscodeitems;
    }

    /**
     * 获取 代码表项 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSCodeItem> getPSCodeItemsIf(){
        if(this.pscodeitems == null){
            this.pscodeitems = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSCodeItem>();          
        }
        return this.pscodeitems;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSCodeList){
            PSCodeList model = (PSCodeList)iPSModel;
            model.setPSCodeItems(this.getPSCodeItems());
        }
        super.copyTo(iPSModel);
    }
}
