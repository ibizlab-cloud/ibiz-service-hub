package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFSFITEM</B>实体属性搜索模式 模型传输对象
 * <P>
 * 实体属性的搜索模式模型，定义属性支持的搜索模式以及相关的界面配置等
 */
public class PSDEFSFItem extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFSFItem(){
    }      

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ARRAYFLAG = "arrayflag";

    /**
     * 设置 是否数组
     * 
     * @param arrayFlag
     * 
     */
    @JsonProperty(FIELD_ARRAYFLAG)
    public void setArrayFlag(Integer arrayFlag){
        this.set(FIELD_ARRAYFLAG, arrayFlag);
    }
    
    /**
     * 获取 是否数组  
     * @return
     */
    @JsonIgnore
    public Integer getArrayFlag(){
        Object objValue = this.get(FIELD_ARRAYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否数组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isArrayFlagDirty(){
        if(this.contains(FIELD_ARRAYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否数组
     */
    @JsonIgnore
    public void resetArrayFlag(){
        this.reset(FIELD_ARRAYFLAG);
    }

    /**
     * 设置 是否数组
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSDEFSFItem arrayflag(Integer arrayFlag){
        this.setArrayFlag(arrayFlag);
        return this;
    }

     /**
     * 设置 是否数组
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSDEFSFItem arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定搜索模式标题的多语言资源对象
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
    public PSDEFSFItem cappslanresid(String capPSLanResId){
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
    public PSDEFSFItem cappslanresid(PSLanguageRes pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定搜索模式标题的多语言资源对象
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
    public PSDEFSFItem cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;自定义标题，指定搜索模式的标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 自定义标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 自定义标题  
     * @return
     */
    @JsonIgnore
    public String getCaption(){
        Object objValue = this.get(FIELD_CAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCaptionDirty(){
        if(this.contains(FIELD_CAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 自定义标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSDEFSFItem caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSDEFSFItem codename(String codeName){
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
    public PSDEFSFItem createdate(String createDate){
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
    public PSDEFSFItem createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认搜索项，指定是否为所在属性的默认搜索模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认搜索项，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认搜索项  
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
     * 判断 默认搜索项 是否指定值，包括空值
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
     * 重置 默认搜索项
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认搜索项，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEFSFItem defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认搜索项，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEFSFItem defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DSTPSDEFID</B>&nbsp;目标属性标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFSFITEMID}
     */
    public final static String FIELD_DSTPSDEFID = "dstpsdefid";

    /**
     * 设置 目标属性标识
     * 
     * @param dstPSDEFId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFID)
    public void setDstPSDEFId(String dstPSDEFId){
        this.set(FIELD_DSTPSDEFID, dstPSDEFId);
    }
    
    /**
     * 获取 目标属性标识  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFId(){
        Object objValue = this.get(FIELD_DSTPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFIdDirty(){
        if(this.contains(FIELD_DSTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性标识
     */
    @JsonIgnore
    public void resetDstPSDEFId(){
        this.reset(FIELD_DSTPSDEFID);
    }

    /**
     * 设置 目标属性标识
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param dstPSDEFId
     */
    @JsonIgnore
    public PSDEFSFItem dstpsdefid(String dstPSDEFId){
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    /**
     * <B>DSTPSDEFSFITEMID</B>&nbsp;目标搜索模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFSFItem} 
     */
    public final static String FIELD_DSTPSDEFSFITEMID = "dstpsdefsfitemid";

    /**
     * 设置 目标搜索模式
     * 
     * @param dstPSDEFSFItemId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFSFITEMID)
    public void setDstPSDEFSFItemId(String dstPSDEFSFItemId){
        this.set(FIELD_DSTPSDEFSFITEMID, dstPSDEFSFItemId);
    }
    
    /**
     * 获取 目标搜索模式  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFSFItemId(){
        Object objValue = this.get(FIELD_DSTPSDEFSFITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFSFItemIdDirty(){
        if(this.contains(FIELD_DSTPSDEFSFITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标搜索模式
     */
    @JsonIgnore
    public void resetDstPSDEFSFItemId(){
        this.reset(FIELD_DSTPSDEFSFITEMID);
    }

    /**
     * 设置 目标搜索模式
     * <P>
     * 等同 {@link #setDstPSDEFSFItemId}
     * @param dstPSDEFSFItemId
     */
    @JsonIgnore
    public PSDEFSFItem dstpsdefsfitemid(String dstPSDEFSFItemId){
        this.setDstPSDEFSFItemId(dstPSDEFSFItemId);
        return this;
    }

    /**
     * 设置 目标搜索模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFSFItemId}
     * @param pSDEFSFItem 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem dstpsdefsfitemid(PSDEFSFItem pSDEFSFItem){
        if(pSDEFSFItem == null){
            this.setDstPSDEFId(null);
            this.setDstPSDEFSFItemId(null);
            this.setDstPSDEFSFItemName(null);
            this.setDstPSDEId(null);
        }
        else{
            this.setDstPSDEFId(pSDEFSFItem.getPSDEFId());
            this.setDstPSDEFSFItemId(pSDEFSFItem.getPSDEFSFItemId());
            this.setDstPSDEFSFItemName(pSDEFSFItem.getPSDEFSFItemName());
            this.setDstPSDEId(pSDEFSFItem.getPSDEId());
        }
        return this;
    }

    /**
     * <B>DSTPSDEFSFITEMNAME</B>&nbsp;目标搜索模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFSFITEMID}
     */
    public final static String FIELD_DSTPSDEFSFITEMNAME = "dstpsdefsfitemname";

    /**
     * 设置 目标搜索模式
     * 
     * @param dstPSDEFSFItemName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFSFITEMNAME)
    public void setDstPSDEFSFItemName(String dstPSDEFSFItemName){
        this.set(FIELD_DSTPSDEFSFITEMNAME, dstPSDEFSFItemName);
    }
    
    /**
     * 获取 目标搜索模式  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFSFItemName(){
        Object objValue = this.get(FIELD_DSTPSDEFSFITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标搜索模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFSFItemNameDirty(){
        if(this.contains(FIELD_DSTPSDEFSFITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标搜索模式
     */
    @JsonIgnore
    public void resetDstPSDEFSFItemName(){
        this.reset(FIELD_DSTPSDEFSFITEMNAME);
    }

    /**
     * 设置 目标搜索模式
     * <P>
     * 等同 {@link #setDstPSDEFSFItemName}
     * @param dstPSDEFSFItemName
     */
    @JsonIgnore
    public PSDEFSFItem dstpsdefsfitemname(String dstPSDEFSFItemName){
        this.setDstPSDEFSFItemName(dstPSDEFSFItemName);
        return this;
    }

    /**
     * <B>DSTPSDEID</B>&nbsp;目标实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFSFITEMID}
     */
    public final static String FIELD_DSTPSDEID = "dstpsdeid";

    /**
     * 设置 目标实体标识
     * 
     * @param dstPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEID)
    public void setDstPSDEId(String dstPSDEId){
        this.set(FIELD_DSTPSDEID, dstPSDEId);
    }
    
    /**
     * 获取 目标实体标识  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEId(){
        Object objValue = this.get(FIELD_DSTPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEIdDirty(){
        if(this.contains(FIELD_DSTPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体标识
     */
    @JsonIgnore
    public void resetDstPSDEId(){
        this.reset(FIELD_DSTPSDEID);
    }

    /**
     * 设置 目标实体标识
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param dstPSDEId
     */
    @JsonIgnore
    public PSDEFSFItem dstpsdeid(String dstPSDEId){
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定属性搜索模式的编辑器类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_EDITORTYPE = "editortype";

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * 
     * @param editorType
     * 
     */
    @JsonProperty(FIELD_EDITORTYPE)
    public void setEditorType(String editorType){
        this.set(FIELD_EDITORTYPE, editorType);
    }
    
    /**
     * 获取 编辑器类型  
     * @return
     */
    @JsonIgnore
    public String getEditorType(){
        Object objValue = this.get(FIELD_EDITORTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorTypeDirty(){
        if(this.contains(FIELD_EDITORTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器类型
     */
    @JsonIgnore
    public void resetEditorType(){
        this.reset(FIELD_EDITORTYPE);
    }

    /**
     * 设置 编辑器类型，详细说明：{@link #FIELD_EDITORTYPE}
     * <P>
     * 等同 {@link #setEditorType}
     * @param editorType
     */
    @JsonIgnore
    public PSDEFSFItem editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>EXTENDMODE</B>&nbsp;扩展模式，指定实体搜索模式的扩展模式，此配置针对子系统实体，标记是否要对原功能进行扩展。未定义时为【无扩展】
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
    public PSDEFSFItem extendmode(Integer extendMode){
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
    public PSDEFSFItem extendmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEExtendMode extendMode){
        if(extendMode == null){
            this.setExtendMode(null);
        }
        else{
            this.setExtendMode(extendMode.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;编辑器高度
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 编辑器高度
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 编辑器高度  
     * @return
     */
    @JsonIgnore
    public Integer getHeight(){
        Object objValue = this.get(FIELD_HEIGHT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑器高度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeightDirty(){
        if(this.contains(FIELD_HEIGHT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 编辑器高度
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSDEFSFItem height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>ITEMTAG</B>&nbsp;项标记，指定属性搜索项的标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG = "itemtag";

    /**
     * 设置 项标记，详细说明：{@link #FIELD_ITEMTAG}
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
     * 设置 项标记，详细说明：{@link #FIELD_ITEMTAG}
     * <P>
     * 等同 {@link #setItemTag}
     * @param itemTag
     */
    @JsonIgnore
    public PSDEFSFItem itemtag(String itemTag){
        this.setItemTag(itemTag);
        return this;
    }

    /**
     * <B>ITEMTAG2</B>&nbsp;项标记2，指定属性搜索项的标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ITEMTAG2 = "itemtag2";

    /**
     * 设置 项标记2，详细说明：{@link #FIELD_ITEMTAG2}
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
     * 设置 项标记2，详细说明：{@link #FIELD_ITEMTAG2}
     * <P>
     * 等同 {@link #setItemTag2}
     * @param itemTag2
     */
    @JsonIgnore
    public PSDEFSFItem itemtag2(String itemTag2){
        this.setItemTag2(itemTag2);
        return this;
    }

    /**
     * <B>JSONFORMAT</B>&nbsp;Json格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JSONFORMAT = "jsonformat";

    /**
     * 设置 Json格式化
     * 
     * @param jsonFormat
     * 
     */
    @JsonProperty(FIELD_JSONFORMAT)
    public void setJsonFormat(String jsonFormat){
        this.set(FIELD_JSONFORMAT, jsonFormat);
    }
    
    /**
     * 获取 Json格式化  
     * @return
     */
    @JsonIgnore
    public String getJsonFormat(){
        Object objValue = this.get(FIELD_JSONFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 Json格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJsonFormatDirty(){
        if(this.contains(FIELD_JSONFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 Json格式化
     */
    @JsonIgnore
    public void resetJsonFormat(){
        this.reset(FIELD_JSONFORMAT);
    }

    /**
     * 设置 Json格式化
     * <P>
     * 等同 {@link #setJsonFormat}
     * @param jsonFormat
     */
    @JsonIgnore
    public PSDEFSFItem jsonformat(String jsonFormat){
        this.setJsonFormat(jsonFormat);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;中文名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
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
    public PSDEFSFItem logicname(String logicName){
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
    public PSDEFSFItem memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>O2MPSDERID</B>&nbsp;O2MPSDERID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_O2MPSDERID = "o2mpsderid";

    /**
     * 设置 O2MPSDERID
     * 
     * @param o2MPSDERId
     * 
     */
    @JsonProperty(FIELD_O2MPSDERID)
    public void setO2MPSDERId(String o2MPSDERId){
        this.set(FIELD_O2MPSDERID, o2MPSDERId);
    }
    
    /**
     * 获取 O2MPSDERID  
     * @return
     */
    @JsonIgnore
    public String getO2MPSDERId(){
        Object objValue = this.get(FIELD_O2MPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 O2MPSDERID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isO2MPSDERIdDirty(){
        if(this.contains(FIELD_O2MPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 O2MPSDERID
     */
    @JsonIgnore
    public void resetO2MPSDERId(){
        this.reset(FIELD_O2MPSDERID);
    }

    /**
     * 设置 O2MPSDERID
     * <P>
     * 等同 {@link #setO2MPSDERId}
     * @param o2MPSDERId
     */
    @JsonIgnore
    public PSDEFSFItem o2mpsderid(String o2MPSDERId){
        this.setO2MPSDERId(o2MPSDERId);
        return this;
    }

    /**
     * <B>O2OPSDERID</B>&nbsp;O2OPSDERID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_O2OPSDERID = "o2opsderid";

    /**
     * 设置 O2OPSDERID
     * 
     * @param o2OPSDERId
     * 
     */
    @JsonProperty(FIELD_O2OPSDERID)
    public void setO2OPSDERId(String o2OPSDERId){
        this.set(FIELD_O2OPSDERID, o2OPSDERId);
    }
    
    /**
     * 获取 O2OPSDERID  
     * @return
     */
    @JsonIgnore
    public String getO2OPSDERId(){
        Object objValue = this.get(FIELD_O2OPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 O2OPSDERID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isO2OPSDERIdDirty(){
        if(this.contains(FIELD_O2OPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 O2OPSDERID
     */
    @JsonIgnore
    public void resetO2OPSDERId(){
        this.reset(FIELD_O2OPSDERID);
    }

    /**
     * 设置 O2OPSDERID
     * <P>
     * 等同 {@link #setO2OPSDERId}
     * @param o2OPSDERId
     */
    @JsonIgnore
    public PSDEFSFItem o2opsderid(String o2OPSDERId){
        this.setO2OPSDERId(o2OPSDERId);
        return this;
    }

    /**
     * <B>PHPSLANRESID</B>&nbsp;占位提示语言资源，指定属性搜索模式编辑器占位提示信息的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_PHPSLANRESID = "phpslanresid";

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESID}
     * 
     * @param pHPSLanResId
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESID)
    public void setPHPSLanResId(String pHPSLanResId){
        this.set(FIELD_PHPSLANRESID, pHPSLanResId);
    }
    
    /**
     * 获取 占位提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResId(){
        Object objValue = this.get(FIELD_PHPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResIdDirty(){
        if(this.contains(FIELD_PHPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResId(){
        this.reset(FIELD_PHPSLANRESID);
    }

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESID}
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pHPSLanResId
     */
    @JsonIgnore
    public PSDEFSFItem phpslanresid(String pHPSLanResId){
        this.setPHPSLanResId(pHPSLanResId);
        return this;
    }

    /**
     * 设置 占位提示语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPHPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem phpslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setPHPSLanResId(null);
            this.setPHPSLanResName(null);
        }
        else{
            this.setPHPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setPHPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>PHPSLANRESNAME</B>&nbsp;占位提示语言资源，指定属性搜索模式编辑器占位提示信息的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PHPSLANRESID}
     */
    public final static String FIELD_PHPSLANRESNAME = "phpslanresname";

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESNAME}
     * 
     * @param pHPSLanResName
     * 
     */
    @JsonProperty(FIELD_PHPSLANRESNAME)
    public void setPHPSLanResName(String pHPSLanResName){
        this.set(FIELD_PHPSLANRESNAME, pHPSLanResName);
    }
    
    /**
     * 获取 占位提示语言资源  
     * @return
     */
    @JsonIgnore
    public String getPHPSLanResName(){
        Object objValue = this.get(FIELD_PHPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPHPSLanResNameDirty(){
        if(this.contains(FIELD_PHPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示语言资源
     */
    @JsonIgnore
    public void resetPHPSLanResName(){
        this.reset(FIELD_PHPSLANRESNAME);
    }

    /**
     * 设置 占位提示语言资源，详细说明：{@link #FIELD_PHPSLANRESNAME}
     * <P>
     * 等同 {@link #setPHPSLanResName}
     * @param pHPSLanResName
     */
    @JsonIgnore
    public PSDEFSFItem phpslanresname(String pHPSLanResName){
        this.setPHPSLanResName(pHPSLanResName);
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定属性搜索模式编辑器的占位提示信息
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PLACEHOLDER = "placeholder";

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * 
     * @param placeHolder
     * 
     */
    @JsonProperty(FIELD_PLACEHOLDER)
    public void setPlaceHolder(String placeHolder){
        this.set(FIELD_PLACEHOLDER, placeHolder);
    }
    
    /**
     * 获取 占位提示  
     * @return
     */
    @JsonIgnore
    public String getPlaceHolder(){
        Object objValue = this.get(FIELD_PLACEHOLDER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 占位提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlaceHolderDirty(){
        if(this.contains(FIELD_PLACEHOLDER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 占位提示
     */
    @JsonIgnore
    public void resetPlaceHolder(){
        this.reset(FIELD_PLACEHOLDER);
    }

    /**
     * 设置 占位提示，详细说明：{@link #FIELD_PLACEHOLDER}
     * <P>
     * 等同 {@link #setPlaceHolder}
     * @param placeHolder
     */
    @JsonIgnore
    public PSDEFSFItem placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定属性搜索模式的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCodeList} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 系统代码表  
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
     * 判断 系统代码表 是否指定值，包括空值
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
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDEFSFItem pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 系统代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem pscodelistid(PSCodeList pSCodeList){
        if(pSCodeList == null){
            this.setPSCodeListId(null);
            this.setPSCodeListName(null);
        }
        else{
            this.setPSCodeListId(pSCodeList.getPSCodeListId());
            this.setPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定属性搜索模式的代码表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 系统代码表  
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
     * 判断 系统代码表 是否指定值，包括空值
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
     * 重置 系统代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 系统代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDEFSFItem pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;操作符号，指定属性搜索模式的操作符
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDBValueOP} 
     */
    public final static String FIELD_PSDBVALUEOPID = "psdbvalueopid";

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * 
     * @param pSDBValueOPId
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPID)
    public void setPSDBValueOPId(String pSDBValueOPId){
        this.set(FIELD_PSDBVALUEOPID, pSDBValueOPId);
    }
    
    /**
     * 获取 操作符号  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPId(){
        Object objValue = this.get(FIELD_PSDBVALUEOPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPIdDirty(){
        if(this.contains(FIELD_PSDBVALUEOPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作符号
     */
    @JsonIgnore
    public void resetPSDBValueOPId(){
        this.reset(FIELD_PSDBVALUEOPID);
    }

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPID}
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOPId
     */
    @JsonIgnore
    public PSDEFSFItem psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * 设置 操作符号，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOP 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem psdbvalueopid(PSDBValueOP pSDBValueOP){
        if(pSDBValueOP == null){
            this.setPSDBValueOPId(null);
            this.setPSDBValueOPName(null);
        }
        else{
            this.setPSDBValueOPId(pSDBValueOP.getPSDBValueOPId());
            this.setPSDBValueOPName(pSDBValueOP.getPSDBValueOPName());
        }
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;操作符号，指定属性搜索模式的操作符
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDBVALUEOPID}
     */
    public final static String FIELD_PSDBVALUEOPNAME = "psdbvalueopname";

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPNAME}
     * 
     * @param pSDBValueOPName
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPNAME)
    public void setPSDBValueOPName(String pSDBValueOPName){
        this.set(FIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }
    
    /**
     * 获取 操作符号  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPName(){
        Object objValue = this.get(FIELD_PSDBVALUEOPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPNameDirty(){
        if(this.contains(FIELD_PSDBVALUEOPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作符号
     */
    @JsonIgnore
    public void resetPSDBValueOPName(){
        this.reset(FIELD_PSDBVALUEOPNAME);
    }

    /**
     * 设置 操作符号，详细说明：{@link #FIELD_PSDBVALUEOPNAME}
     * <P>
     * 等同 {@link #setPSDBValueOPName}
     * @param pSDBValueOPName
     */
    @JsonIgnore
    public PSDEFSFItem psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定属性搜索模式所属的实体属性对象
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
    public PSDEFSFItem psdefid(String pSDEFId){
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
    public PSDEFSFItem psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setLogicName(null);
            this.setO2MPSDERId(null);
            this.setO2OPSDERId(null);
            this.setPSDEFId(null);
            this.setPSDEFName(null);
        }
        else{
            this.setLogicName(pSDEField.getLogicName());
            this.setO2MPSDERId(pSDEField.getO2MPSDERId());
            this.setO2OPSDERId(pSDEField.getO2OPSDERId());
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定属性搜索模式所属的实体属性对象
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
    public PSDEFSFItem psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFSFITEMID</B>&nbsp;实体属性搜索表单项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFSFITEMID = "psdefsfitemid";

    /**
     * 设置 实体属性搜索表单项标识
     * 
     * @param pSDEFSFItemId
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMID)
    public void setPSDEFSFItemId(String pSDEFSFItemId){
        this.set(FIELD_PSDEFSFITEMID, pSDEFSFItemId);
    }
    
    /**
     * 获取 实体属性搜索表单项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemId(){
        Object objValue = this.get(FIELD_PSDEFSFITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性搜索表单项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemIdDirty(){
        if(this.contains(FIELD_PSDEFSFITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性搜索表单项标识
     */
    @JsonIgnore
    public void resetPSDEFSFItemId(){
        this.reset(FIELD_PSDEFSFITEMID);
    }

    /**
     * 设置 实体属性搜索表单项标识
     * <P>
     * 等同 {@link #setPSDEFSFItemId}
     * @param pSDEFSFItemId
     */
    @JsonIgnore
    public PSDEFSFItem psdefsfitemid(String pSDEFSFItemId){
        this.setPSDEFSFItemId(pSDEFSFItemId);
        return this;
    }

    /**
     * <B>PSDEFSFITEMNAME</B>&nbsp;搜索模式标识，指定搜索模式的标识，需在所在的实体对象中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFSFITEMNAME = "psdefsfitemname";

    /**
     * 设置 搜索模式标识，详细说明：{@link #FIELD_PSDEFSFITEMNAME}
     * 
     * @param pSDEFSFItemName
     * 
     */
    @JsonProperty(FIELD_PSDEFSFITEMNAME)
    public void setPSDEFSFItemName(String pSDEFSFItemName){
        this.set(FIELD_PSDEFSFITEMNAME, pSDEFSFItemName);
    }
    
    /**
     * 获取 搜索模式标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFSFItemName(){
        Object objValue = this.get(FIELD_PSDEFSFITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 搜索模式标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFSFItemNameDirty(){
        if(this.contains(FIELD_PSDEFSFITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索模式标识
     */
    @JsonIgnore
    public void resetPSDEFSFItemName(){
        this.reset(FIELD_PSDEFSFITEMNAME);
    }

    /**
     * 设置 搜索模式标识，详细说明：{@link #FIELD_PSDEFSFITEMNAME}
     * <P>
     * 等同 {@link #setPSDEFSFItemName}
     * @param pSDEFSFItemName
     */
    @JsonIgnore
    public PSDEFSFItem psdefsfitemname(String pSDEFSFItemName){
        this.setPSDEFSFItemName(pSDEFSFItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFSFItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFSFItemName(strName);
    }

    @JsonIgnore
    public PSDEFSFItem name(String strName){
        this.setPSDEFSFItemName(strName);
        return this;
    }

    /**
     * <B>PSDEFVALUERULEID</B>&nbsp;属性值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFValueRule} 
     */
    public final static String FIELD_PSDEFVALUERULEID = "psdefvalueruleid";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULEID)
    public void setPSDEFValueRuleId(String pSDEFValueRuleId){
        this.set(FIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleId(){
        Object objValue = this.get(FIELD_PSDEFVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty(){
        if(this.contains(FIELD_PSDEFVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleId(){
        this.reset(FIELD_PSDEFVALUERULEID);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRuleId
     */
    @JsonIgnore
    public PSDEFSFItem psdefvalueruleid(String pSDEFValueRuleId){
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    /**
     * 设置 属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem psdefvalueruleid(PSDEFValueRule pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        }
        else{
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVALUERULENAME</B>&nbsp;属性值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVALUERULEID}
     */
    public final static String FIELD_PSDEFVALUERULENAME = "psdefvaluerulename";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULENAME)
    public void setPSDEFValueRuleName(String pSDEFValueRuleName){
        this.set(FIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleName(){
        Object objValue = this.get(FIELD_PSDEFVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty(){
        if(this.contains(FIELD_PSDEFVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleName(){
        this.reset(FIELD_PSDEFVALUERULENAME);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleName}
     * @param pSDEFValueRuleName
     */
    @JsonIgnore
    public PSDEFSFItem psdefvaluerulename(String pSDEFValueRuleName){
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定属性搜索模式所属的实体对象
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
    public PSDEFSFItem psdeid(String pSDEId){
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
    public PSDEFSFItem psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定属性搜索模式所属的实体对象
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
    public PSDEFSFItem psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSDBVFID</B>&nbsp;值处理，指定属性搜索模式的值函数处理对象，值函数处理将属性值进行转换处理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBVF} 
     */
    public final static String FIELD_PSSYSDBVFID = "pssysdbvfid";

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFID}
     * 
     * @param pSSysDBVFId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFID)
    public void setPSSysDBVFId(String pSSysDBVFId){
        this.set(FIELD_PSSYSDBVFID, pSSysDBVFId);
    }
    
    /**
     * 获取 值处理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFId(){
        Object objValue = this.get(FIELD_PSSYSDBVFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFIdDirty(){
        if(this.contains(FIELD_PSSYSDBVFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理
     */
    @JsonIgnore
    public void resetPSSysDBVFId(){
        this.reset(FIELD_PSSYSDBVFID);
    }

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFID}
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVFId
     */
    @JsonIgnore
    public PSDEFSFItem pssysdbvfid(String pSSysDBVFId){
        this.setPSSysDBVFId(pSSysDBVFId);
        return this;
    }

    /**
     * 设置 值处理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBVFId}
     * @param pSSysDBVF 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem pssysdbvfid(PSSysDBVF pSSysDBVF){
        if(pSSysDBVF == null){
            this.setPSSysDBVFId(null);
            this.setPSSysDBVFName(null);
        }
        else{
            this.setPSSysDBVFId(pSSysDBVF.getPSSysDBVFId());
            this.setPSSysDBVFName(pSSysDBVF.getPSSysDBVFName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBVFNAME</B>&nbsp;值处理，指定属性搜索模式的值函数处理对象，值函数处理将属性值进行转换处理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBVFID}
     */
    public final static String FIELD_PSSYSDBVFNAME = "pssysdbvfname";

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFNAME}
     * 
     * @param pSSysDBVFName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBVFNAME)
    public void setPSSysDBVFName(String pSSysDBVFName){
        this.set(FIELD_PSSYSDBVFNAME, pSSysDBVFName);
    }
    
    /**
     * 获取 值处理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBVFName(){
        Object objValue = this.get(FIELD_PSSYSDBVFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBVFNameDirty(){
        if(this.contains(FIELD_PSSYSDBVFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理
     */
    @JsonIgnore
    public void resetPSSysDBVFName(){
        this.reset(FIELD_PSSYSDBVFNAME);
    }

    /**
     * 设置 值处理，详细说明：{@link #FIELD_PSSYSDBVFNAME}
     * <P>
     * 等同 {@link #setPSSysDBVFName}
     * @param pSSysDBVFName
     */
    @JsonIgnore
    public PSDEFSFItem pssysdbvfname(String pSSysDBVFName){
        this.setPSSysDBVFName(pSSysDBVFName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;云系统编辑器样式，指定属性搜索模式的编辑器的扩展样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEditorStyle} 
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 云系统编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 云系统编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleId(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云系统编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleIdDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云系统编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 云系统编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLEID}
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSDEFSFItem pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * 设置 云系统编辑器样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyle 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
        if(pSSysEditorStyle == null){
            this.setPSSysEditorStyleId(null);
            this.setPSSysEditorStyleName(null);
        }
        else{
            this.setPSSysEditorStyleId(pSSysEditorStyle.getPSSysEditorStyleId());
            this.setPSSysEditorStyleName(pSSysEditorStyle.getPSSysEditorStyleName());
        }
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式，指定属性搜索模式的编辑器的扩展样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEDITORSTYLEID}
     */
    public final static String FIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * 
     * @param pSSysEditorStyleName
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLENAME)
    public void setPSSysEditorStyleName(String pSSysEditorStyleName){
        this.set(FIELD_PSSYSEDITORSTYLENAME, pSSysEditorStyleName);
    }
    
    /**
     * 获取 编辑器样式  
     * @return
     */
    @JsonIgnore
    public String getPSSysEditorStyleName(){
        Object objValue = this.get(FIELD_PSSYSEDITORSTYLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEditorStyleNameDirty(){
        if(this.contains(FIELD_PSSYSEDITORSTYLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleName(){
        this.reset(FIELD_PSSYSEDITORSTYLENAME);
    }

    /**
     * 设置 编辑器样式，详细说明：{@link #FIELD_PSSYSEDITORSTYLENAME}
     * <P>
     * 等同 {@link #setPSSysEditorStyleName}
     * @param pSSysEditorStyleName
     */
    @JsonIgnore
    public PSDEFSFItem pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;显示图标，指定属性搜索模式的显示图标对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEFSFItem pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 显示图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;显示图标，指定属性搜索模式的显示图标对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 显示图标  
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
     * 判断 显示图标 是否指定值，包括空值
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
     * 重置 显示图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 显示图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEFSFItem pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
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
    public PSDEFSFItem pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDEFSFItem pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
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
    public PSDEFSFItem pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORID</B>&nbsp;系统转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_PSSYSTRANSLATORID = "pssystranslatorid";

    /**
     * 设置 系统转换器
     * 
     * @param pSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORID)
    public void setPSSysTranslatorId(String pSSysTranslatorId){
        this.set(FIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }
    
    /**
     * 获取 系统转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorId(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorId(){
        this.reset(FIELD_PSSYSTRANSLATORID);
    }

    /**
     * 设置 系统转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslatorId
     */
    @JsonIgnore
    public PSDEFSFItem pssystranslatorid(String pSSysTranslatorId){
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    /**
     * 设置 系统转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem pssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        }
        else{
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORNAME</B>&nbsp;系统转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTRANSLATORID}
     */
    public final static String FIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";

    /**
     * 设置 系统转换器
     * 
     * @param pSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORNAME)
    public void setPSSysTranslatorName(String pSSysTranslatorName){
        this.set(FIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }
    
    /**
     * 获取 系统转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorName(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorName(){
        this.reset(FIELD_PSSYSTRANSLATORNAME);
    }

    /**
     * 设置 系统转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorName}
     * @param pSSysTranslatorName
     */
    @JsonIgnore
    public PSDEFSFItem pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;系统值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysValueRule} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 系统值规则
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 系统值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSDEFSFItem pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 系统值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem pssysvalueruleid(PSSysValueRule pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;系统值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 系统值规则
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 系统值规则
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEFSFItem pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
        return this;
    }

    /**
     * <B>REFADPSDELOGICID</B>&nbsp;引用数据集查询逻辑，指定属性搜索模式的引用数据集上下文转换逻辑对象，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogic} 
     */
    public final static String FIELD_REFADPSDELOGICID = "refadpsdelogicid";

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICID}
     * 
     * @param refADPSDELogicId
     * 
     */
    @JsonProperty(FIELD_REFADPSDELOGICID)
    public void setRefADPSDELogicId(String refADPSDELogicId){
        this.set(FIELD_REFADPSDELOGICID, refADPSDELogicId);
    }
    
    /**
     * 获取 引用数据集查询逻辑  
     * @return
     */
    @JsonIgnore
    public String getRefADPSDELogicId(){
        Object objValue = this.get(FIELD_REFADPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据集查询逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefADPSDELogicIdDirty(){
        if(this.contains(FIELD_REFADPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据集查询逻辑
     */
    @JsonIgnore
    public void resetRefADPSDELogicId(){
        this.reset(FIELD_REFADPSDELOGICID);
    }

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICID}
     * <P>
     * 等同 {@link #setRefADPSDELogicId}
     * @param refADPSDELogicId
     */
    @JsonIgnore
    public PSDEFSFItem refadpsdelogicid(String refADPSDELogicId){
        this.setRefADPSDELogicId(refADPSDELogicId);
        return this;
    }

    /**
     * 设置 引用数据集查询逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefADPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refadpsdelogicid(PSDELogic pSDELogic){
        if(pSDELogic == null){
            this.setRefADPSDELogicId(null);
            this.setRefADPSDELogicName(null);
        }
        else{
            this.setRefADPSDELogicId(pSDELogic.getPSDELogicId());
            this.setRefADPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>REFADPSDELOGICNAME</B>&nbsp;引用数据集查询逻辑，指定属性搜索模式的引用数据集上下文转换逻辑对象，将调用环境参数转换为数据集的调用参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFADPSDELOGICID}
     */
    public final static String FIELD_REFADPSDELOGICNAME = "refadpsdelogicname";

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICNAME}
     * 
     * @param refADPSDELogicName
     * 
     */
    @JsonProperty(FIELD_REFADPSDELOGICNAME)
    public void setRefADPSDELogicName(String refADPSDELogicName){
        this.set(FIELD_REFADPSDELOGICNAME, refADPSDELogicName);
    }
    
    /**
     * 获取 引用数据集查询逻辑  
     * @return
     */
    @JsonIgnore
    public String getRefADPSDELogicName(){
        Object objValue = this.get(FIELD_REFADPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用数据集查询逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefADPSDELogicNameDirty(){
        if(this.contains(FIELD_REFADPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用数据集查询逻辑
     */
    @JsonIgnore
    public void resetRefADPSDELogicName(){
        this.reset(FIELD_REFADPSDELOGICNAME);
    }

    /**
     * 设置 引用数据集查询逻辑，详细说明：{@link #FIELD_REFADPSDELOGICNAME}
     * <P>
     * 等同 {@link #setRefADPSDELogicName}
     * @param refADPSDELogicName
     */
    @JsonIgnore
    public PSDEFSFItem refadpsdelogicname(String refADPSDELogicName){
        this.setRefADPSDELogicName(refADPSDELogicName);
        return this;
    }

    /**
     * <B>REFMOBMPICKUPPSDEVIEWID</B>&nbsp;引用实体移动端多项选择视图，指定属性搜索模式引用数据的移动端多项选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFMOBMPICKUPPSDEVIEWID = "refmobmpickuppsdeviewid";

    /**
     * 设置 引用实体移动端多项选择视图，详细说明：{@link #FIELD_REFMOBMPICKUPPSDEVIEWID}
     * 
     * @param refMobMPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFMOBMPICKUPPSDEVIEWID)
    public void setRefMobMPickupPSDEViewId(String refMobMPickupPSDEViewId){
        this.set(FIELD_REFMOBMPICKUPPSDEVIEWID, refMobMPickupPSDEViewId);
    }
    
    /**
     * 获取 引用实体移动端多项选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefMobMPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFMOBMPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体移动端多项选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMobMPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFMOBMPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体移动端多项选择视图
     */
    @JsonIgnore
    public void resetRefMobMPickupPSDEViewId(){
        this.reset(FIELD_REFMOBMPICKUPPSDEVIEWID);
    }

    /**
     * 设置 引用实体移动端多项选择视图，详细说明：{@link #FIELD_REFMOBMPICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefMobMPickupPSDEViewId}
     * @param refMobMPickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFSFItem refmobmpickuppsdeviewid(String refMobMPickupPSDEViewId){
        this.setRefMobMPickupPSDEViewId(refMobMPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 引用实体移动端多项选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefMobMPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refmobmpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefMobMPickupPSDEViewId(null);
            this.setRefMobMPickupPSDEViewName(null);
        }
        else{
            this.setRefMobMPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMobMPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFMOBMPICKUPPSDEVIEWNAME</B>&nbsp;引用实体移动端多项选择视图，指定属性搜索模式引用数据的移动端多项选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFMOBMPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFMOBMPICKUPPSDEVIEWNAME = "refmobmpickuppsdeviewname";

    /**
     * 设置 引用实体移动端多项选择视图，详细说明：{@link #FIELD_REFMOBMPICKUPPSDEVIEWNAME}
     * 
     * @param refMobMPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFMOBMPICKUPPSDEVIEWNAME)
    public void setRefMobMPickupPSDEViewName(String refMobMPickupPSDEViewName){
        this.set(FIELD_REFMOBMPICKUPPSDEVIEWNAME, refMobMPickupPSDEViewName);
    }
    
    /**
     * 获取 引用实体移动端多项选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefMobMPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFMOBMPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体移动端多项选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMobMPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFMOBMPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体移动端多项选择视图
     */
    @JsonIgnore
    public void resetRefMobMPickupPSDEViewName(){
        this.reset(FIELD_REFMOBMPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 引用实体移动端多项选择视图，详细说明：{@link #FIELD_REFMOBMPICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefMobMPickupPSDEViewName}
     * @param refMobMPickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFSFItem refmobmpickuppsdeviewname(String refMobMPickupPSDEViewName){
        this.setRefMobMPickupPSDEViewName(refMobMPickupPSDEViewName);
        return this;
    }

    /**
     * <B>REFMOBPICKUPPSDEVIEWID</B>&nbsp;引用实体移动端选择视图，指定属性搜索模式引用数据的移动端选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFMOBPICKUPPSDEVIEWID = "refmobpickuppsdeviewid";

    /**
     * 设置 引用实体移动端选择视图，详细说明：{@link #FIELD_REFMOBPICKUPPSDEVIEWID}
     * 
     * @param refMobPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFMOBPICKUPPSDEVIEWID)
    public void setRefMobPickupPSDEViewId(String refMobPickupPSDEViewId){
        this.set(FIELD_REFMOBPICKUPPSDEVIEWID, refMobPickupPSDEViewId);
    }
    
    /**
     * 获取 引用实体移动端选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefMobPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFMOBPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体移动端选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMobPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFMOBPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体移动端选择视图
     */
    @JsonIgnore
    public void resetRefMobPickupPSDEViewId(){
        this.reset(FIELD_REFMOBPICKUPPSDEVIEWID);
    }

    /**
     * 设置 引用实体移动端选择视图，详细说明：{@link #FIELD_REFMOBPICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefMobPickupPSDEViewId}
     * @param refMobPickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFSFItem refmobpickuppsdeviewid(String refMobPickupPSDEViewId){
        this.setRefMobPickupPSDEViewId(refMobPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 引用实体移动端选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefMobPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refmobpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefMobPickupPSDEViewId(null);
            this.setRefMobPickupPSDEViewName(null);
        }
        else{
            this.setRefMobPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMobPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFMOBPICKUPPSDEVIEWNAME</B>&nbsp;引用实体移动端选择视图，指定属性搜索模式引用数据的移动端选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFMOBPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFMOBPICKUPPSDEVIEWNAME = "refmobpickuppsdeviewname";

    /**
     * 设置 引用实体移动端选择视图，详细说明：{@link #FIELD_REFMOBPICKUPPSDEVIEWNAME}
     * 
     * @param refMobPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFMOBPICKUPPSDEVIEWNAME)
    public void setRefMobPickupPSDEViewName(String refMobPickupPSDEViewName){
        this.set(FIELD_REFMOBPICKUPPSDEVIEWNAME, refMobPickupPSDEViewName);
    }
    
    /**
     * 获取 引用实体移动端选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefMobPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFMOBPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体移动端选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMobPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFMOBPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体移动端选择视图
     */
    @JsonIgnore
    public void resetRefMobPickupPSDEViewName(){
        this.reset(FIELD_REFMOBPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 引用实体移动端选择视图，详细说明：{@link #FIELD_REFMOBPICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefMobPickupPSDEViewName}
     * @param refMobPickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFSFItem refmobpickuppsdeviewname(String refMobPickupPSDEViewName){
        this.setRefMobPickupPSDEViewName(refMobPickupPSDEViewName);
        return this;
    }

    /**
     * <B>REFMPICKUPPSDEVIEWID</B>&nbsp;关联实体多选视图，指定属性搜索模式的引用数据的多项选择视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFMPICKUPPSDEVIEWID = "refmpickuppsdeviewid";

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWID}
     * 
     * @param refMPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFMPICKUPPSDEVIEWID)
    public void setRefMPickupPSDEViewId(String refMPickupPSDEViewId){
        this.set(FIELD_REFMPICKUPPSDEVIEWID, refMPickupPSDEViewId);
    }
    
    /**
     * 获取 关联实体多选视图  
     * @return
     */
    @JsonIgnore
    public String getRefMPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFMPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体多选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFMPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体多选视图
     */
    @JsonIgnore
    public void resetRefMPickupPSDEViewId(){
        this.reset(FIELD_REFMPICKUPPSDEVIEWID);
    }

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefMPickupPSDEViewId}
     * @param refMPickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFSFItem refmpickuppsdeviewid(String refMPickupPSDEViewId){
        this.setRefMPickupPSDEViewId(refMPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 关联实体多选视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefMPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refmpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefMPickupPSDEViewId(null);
            this.setRefMPickupPSDEViewName(null);
        }
        else{
            this.setRefMPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefMPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFMPICKUPPSDEVIEWNAME</B>&nbsp;关联实体多选视图，指定属性搜索模式的引用数据的多项选择视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFMPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFMPICKUPPSDEVIEWNAME = "refmpickuppsdeviewname";

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWNAME}
     * 
     * @param refMPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFMPICKUPPSDEVIEWNAME)
    public void setRefMPickupPSDEViewName(String refMPickupPSDEViewName){
        this.set(FIELD_REFMPICKUPPSDEVIEWNAME, refMPickupPSDEViewName);
    }
    
    /**
     * 获取 关联实体多选视图  
     * @return
     */
    @JsonIgnore
    public String getRefMPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFMPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体多选视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefMPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFMPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体多选视图
     */
    @JsonIgnore
    public void resetRefMPickupPSDEViewName(){
        this.reset(FIELD_REFMPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 关联实体多选视图，详细说明：{@link #FIELD_REFMPICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefMPickupPSDEViewName}
     * @param refMPickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFSFItem refmpickuppsdeviewname(String refMPickupPSDEViewName){
        this.setRefMPickupPSDEViewName(refMPickupPSDEViewName);
        return this;
    }

    /**
     * <B>REFPICKUPPSDEVIEWID</B>&nbsp;关联实体选择视图，指定属性搜索项引用数据的选择视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_REFPICKUPPSDEVIEWID = "refpickuppsdeviewid";

    /**
     * 设置 关联实体选择视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWID}
     * 
     * @param refPickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_REFPICKUPPSDEVIEWID)
    public void setRefPickupPSDEViewId(String refPickupPSDEViewId){
        this.set(FIELD_REFPICKUPPSDEVIEWID, refPickupPSDEViewId);
    }
    
    /**
     * 获取 关联实体选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefPickupPSDEViewId(){
        Object objValue = this.get(FIELD_REFPICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_REFPICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体选择视图
     */
    @JsonIgnore
    public void resetRefPickupPSDEViewId(){
        this.reset(FIELD_REFPICKUPPSDEVIEWID);
    }

    /**
     * 设置 关联实体选择视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWID}
     * <P>
     * 等同 {@link #setRefPickupPSDEViewId}
     * @param refPickupPSDEViewId
     */
    @JsonIgnore
    public PSDEFSFItem refpickuppsdeviewid(String refPickupPSDEViewId){
        this.setRefPickupPSDEViewId(refPickupPSDEViewId);
        return this;
    }

    /**
     * 设置 关联实体选择视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refpickuppsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setRefPickupPSDEViewId(null);
            this.setRefPickupPSDEViewName(null);
        }
        else{
            this.setRefPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setRefPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>REFPICKUPPSDEVIEWNAME</B>&nbsp;关联实体选择视图，指定属性搜索项引用数据的选择视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPICKUPPSDEVIEWID}
     */
    public final static String FIELD_REFPICKUPPSDEVIEWNAME = "refpickuppsdeviewname";

    /**
     * 设置 关联实体选择视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWNAME}
     * 
     * @param refPickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_REFPICKUPPSDEVIEWNAME)
    public void setRefPickupPSDEViewName(String refPickupPSDEViewName){
        this.set(FIELD_REFPICKUPPSDEVIEWNAME, refPickupPSDEViewName);
    }
    
    /**
     * 获取 关联实体选择视图  
     * @return
     */
    @JsonIgnore
    public String getRefPickupPSDEViewName(){
        Object objValue = this.get(FIELD_REFPICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体选择视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_REFPICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体选择视图
     */
    @JsonIgnore
    public void resetRefPickupPSDEViewName(){
        this.reset(FIELD_REFPICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 关联实体选择视图，详细说明：{@link #FIELD_REFPICKUPPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setRefPickupPSDEViewName}
     * @param refPickupPSDEViewName
     */
    @JsonIgnore
    public PSDEFSFItem refpickuppsdeviewname(String refPickupPSDEViewName){
        this.setRefPickupPSDEViewName(refPickupPSDEViewName);
        return this;
    }

    /**
     * <B>REFPSDEACMODEID</B>&nbsp;关联实体自填模式，指定属性搜索模式的编辑项的引用自填模式，提供自动填充能力的编辑器都需要指定引用的自填模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_REFPSDEACMODEID = "refpsdeacmodeid";

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODEID}
     * 
     * @param refPSDEACModeId
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODEID)
    public void setRefPSDEACModeId(String refPSDEACModeId){
        this.set(FIELD_REFPSDEACMODEID, refPSDEACModeId);
    }
    
    /**
     * 获取 关联实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeId(){
        Object objValue = this.get(FIELD_REFPSDEACMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeIdDirty(){
        if(this.contains(FIELD_REFPSDEACMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeId(){
        this.reset(FIELD_REFPSDEACMODEID);
    }

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODEID}
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param refPSDEACModeId
     */
    @JsonIgnore
    public PSDEFSFItem refpsdeacmodeid(String refPSDEACModeId){
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    /**
     * 设置 关联实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refpsdeacmodeid(PSDEACMode pSDEACMode){
        if(pSDEACMode == null){
            this.setRefPSDEACModeId(null);
            this.setRefPSDEACModeName(null);
        }
        else{
            this.setRefPSDEACModeId(pSDEACMode.getPSDEACModeId());
            this.setRefPSDEACModeName(pSDEACMode.getPSDEACModeName());
        }
        return this;
    }

    /**
     * <B>REFPSDEACMODENAME</B>&nbsp;关联实体自填模式，指定属性搜索模式的编辑项的引用自填模式，提供自动填充能力的编辑器都需要指定引用的自填模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEACMODEID}
     */
    public final static String FIELD_REFPSDEACMODENAME = "refpsdeacmodename";

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODENAME}
     * 
     * @param refPSDEACModeName
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODENAME)
    public void setRefPSDEACModeName(String refPSDEACModeName){
        this.set(FIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }
    
    /**
     * 获取 关联实体自填模式  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEACModeName(){
        Object objValue = this.get(FIELD_REFPSDEACMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体自填模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEACModeNameDirty(){
        if(this.contains(FIELD_REFPSDEACMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeName(){
        this.reset(FIELD_REFPSDEACMODENAME);
    }

    /**
     * 设置 关联实体自填模式，详细说明：{@link #FIELD_REFPSDEACMODENAME}
     * <P>
     * 等同 {@link #setRefPSDEACModeName}
     * @param refPSDEACModeName
     */
    @JsonIgnore
    public PSDEFSFItem refpsdeacmodename(String refPSDEACModeName){
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    /**
     * <B>REFPSDEDATASETID</B>&nbsp;引用实体数据集，指定属性搜索模式的编辑项的引用数据集，提供自动填充能力的编辑器都需要指定引用的数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_REFPSDEDATASETID = "refpsdedatasetid";

    /**
     * 设置 引用实体数据集，详细说明：{@link #FIELD_REFPSDEDATASETID}
     * 
     * @param refPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETID)
    public void setRefPSDEDataSetId(String refPSDEDataSetId){
        this.set(FIELD_REFPSDEDATASETID, refPSDEDataSetId);
    }
    
    /**
     * 获取 引用实体数据集  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetId(){
        Object objValue = this.get(FIELD_REFPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetIdDirty(){
        if(this.contains(FIELD_REFPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体数据集
     */
    @JsonIgnore
    public void resetRefPSDEDataSetId(){
        this.reset(FIELD_REFPSDEDATASETID);
    }

    /**
     * 设置 引用实体数据集，详细说明：{@link #FIELD_REFPSDEDATASETID}
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param refPSDEDataSetId
     */
    @JsonIgnore
    public PSDEFSFItem refpsdedatasetid(String refPSDEDataSetId){
        this.setRefPSDEDataSetId(refPSDEDataSetId);
        return this;
    }

    /**
     * 设置 引用实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refpsdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setRefPSDEDataSetId(null);
            this.setRefPSDEDataSetName(null);
        }
        else{
            this.setRefPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setRefPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>REFPSDEDATASETNAME</B>&nbsp;引用实体数据集，指定属性搜索模式的编辑项的引用数据集，提供自动填充能力的编辑器都需要指定引用的数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEDATASETID}
     */
    public final static String FIELD_REFPSDEDATASETNAME = "refpsdedatasetname";

    /**
     * 设置 引用实体数据集，详细说明：{@link #FIELD_REFPSDEDATASETNAME}
     * 
     * @param refPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_REFPSDEDATASETNAME)
    public void setRefPSDEDataSetName(String refPSDEDataSetName){
        this.set(FIELD_REFPSDEDATASETNAME, refPSDEDataSetName);
    }
    
    /**
     * 获取 引用实体数据集  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEDataSetName(){
        Object objValue = this.get(FIELD_REFPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEDataSetNameDirty(){
        if(this.contains(FIELD_REFPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体数据集
     */
    @JsonIgnore
    public void resetRefPSDEDataSetName(){
        this.reset(FIELD_REFPSDEDATASETNAME);
    }

    /**
     * 设置 引用实体数据集，详细说明：{@link #FIELD_REFPSDEDATASETNAME}
     * <P>
     * 等同 {@link #setRefPSDEDataSetName}
     * @param refPSDEDataSetName
     */
    @JsonIgnore
    public PSDEFSFItem refpsdedatasetname(String refPSDEDataSetName){
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体，指定属性搜素模式的编辑项的引用数据集的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDEID}
     * 
     * @param refPSDEId
     * 
     */
    @JsonProperty(FIELD_REFPSDEID)
    public void setRefPSDEId(String refPSDEId){
        this.set(FIELD_REFPSDEID, refPSDEId);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEId(){
        Object objValue = this.get(FIELD_REFPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDEIdDirty(){
        if(this.contains(FIELD_REFPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEId(){
        this.reset(FIELD_REFPSDEID);
    }

    /**
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDEID}
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDEFSFItem refpsdeid(String refPSDEId){
        this.setRefPSDEId(refPSDEId);
        return this;
    }

    /**
     * 设置 引用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refpsdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setRefPSDEId(null);
            this.setRefPSDEName(null);
        }
        else{
            this.setRefPSDEId(pSDataEntity.getPSDataEntityId());
            this.setRefPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>REFPSDENAME</B>&nbsp;引用实体，指定属性搜素模式的编辑项的引用数据集的所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDENAME}
     * 
     * @param refPSDEName
     * 
     */
    @JsonProperty(FIELD_REFPSDENAME)
    public void setRefPSDEName(String refPSDEName){
        this.set(FIELD_REFPSDENAME, refPSDEName);
    }
    
    /**
     * 获取 引用实体  
     * @return
     */
    @JsonIgnore
    public String getRefPSDEName(){
        Object objValue = this.get(FIELD_REFPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDENameDirty(){
        if(this.contains(FIELD_REFPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体
     */
    @JsonIgnore
    public void resetRefPSDEName(){
        this.reset(FIELD_REFPSDENAME);
    }

    /**
     * 设置 引用实体，详细说明：{@link #FIELD_REFPSDENAME}
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDEFSFItem refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
        return this;
    }

    /**
     * <B>REFPSDERID</B>&nbsp;引用实体关系，指定属性搜索项的引用实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_REFPSDERID = "refpsderid";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * 
     * @param refPSDERId
     * 
     */
    @JsonProperty(FIELD_REFPSDERID)
    public void setRefPSDERId(String refPSDERId){
        this.set(FIELD_REFPSDERID, refPSDERId);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERId(){
        Object objValue = this.get(FIELD_REFPSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERIdDirty(){
        if(this.contains(FIELD_REFPSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERId(){
        this.reset(FIELD_REFPSDERID);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERID}
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param refPSDERId
     */
    @JsonIgnore
    public PSDEFSFItem refpsderid(String refPSDERId){
        this.setRefPSDERId(refPSDERId);
        return this;
    }

    /**
     * 设置 引用实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEFSFItem refpsderid(PSDER pSDER){
        if(pSDER == null){
            this.setRefPSDERId(null);
            this.setRefPSDERName(null);
        }
        else{
            this.setRefPSDERId(pSDER.getPSDERId());
            this.setRefPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>REFPSDERNAME</B>&nbsp;引用实体关系，指定属性搜索项的引用实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDERID}
     */
    public final static String FIELD_REFPSDERNAME = "refpsdername";

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * 
     * @param refPSDERName
     * 
     */
    @JsonProperty(FIELD_REFPSDERNAME)
    public void setRefPSDERName(String refPSDERName){
        this.set(FIELD_REFPSDERNAME, refPSDERName);
    }
    
    /**
     * 获取 引用实体关系  
     * @return
     */
    @JsonIgnore
    public String getRefPSDERName(){
        Object objValue = this.get(FIELD_REFPSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSDERNameDirty(){
        if(this.contains(FIELD_REFPSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用实体关系
     */
    @JsonIgnore
    public void resetRefPSDERName(){
        this.reset(FIELD_REFPSDERNAME);
    }

    /**
     * 设置 引用实体关系，详细说明：{@link #FIELD_REFPSDERNAME}
     * <P>
     * 等同 {@link #setRefPSDERName}
     * @param refPSDERName
     */
    @JsonIgnore
    public PSDEFSFItem refpsdername(String refPSDERName){
        this.setRefPSDERName(refPSDERName);
        return this;
    }

    /**
     * <B>SEARCHMODE</B>&nbsp;扩展模式，指定属性搜索模式的扩展模式，属性搜索模式的标识在所在实体需要具备唯一性，这种限制会导致无法建立相同搜索条件，引用数据或视图不同的搜索模式，如指定的扩展模式将自动附加到搜索模式标识上避免重复
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFSFMode} 
     */
    public final static String FIELD_SEARCHMODE = "searchmode";

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_SEARCHMODE}
     * 
     * @param searchMode
     * 
     */
    @JsonProperty(FIELD_SEARCHMODE)
    public void setSearchMode(String searchMode){
        this.set(FIELD_SEARCHMODE, searchMode);
    }
    
    /**
     * 获取 扩展模式  
     * @return
     */
    @JsonIgnore
    public String getSearchMode(){
        Object objValue = this.get(FIELD_SEARCHMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 扩展模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSearchModeDirty(){
        if(this.contains(FIELD_SEARCHMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 扩展模式
     */
    @JsonIgnore
    public void resetSearchMode(){
        this.reset(FIELD_SEARCHMODE);
    }

    /**
     * 设置 扩展模式，详细说明：{@link #FIELD_SEARCHMODE}
     * <P>
     * 等同 {@link #setSearchMode}
     * @param searchMode
     */
    @JsonIgnore
    public PSDEFSFItem searchmode(String searchMode){
        this.setSearchMode(searchMode);
        return this;
    }

     /**
     * 设置 扩展模式，详细说明：{@link #FIELD_SEARCHMODE}
     * <P>
     * 等同 {@link #setSearchMode}
     * @param searchMode
     */
    @JsonIgnore
    public PSDEFSFItem searchmode(net.ibizsys.psmodel.core.util.PSModelEnums.DEFSFMode searchMode){
        if(searchMode == null){
            this.setSearchMode(null);
        }
        else{
            this.setSearchMode(searchMode.value);
        }
        return this;
    }

    /**
     * <B>SERVICECODENAME</B>&nbsp;服务代码名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_SERVICECODENAME = "servicecodename";

    /**
     * 设置 服务代码名称
     * 
     * @param serviceCodeName
     * 
     */
    @JsonProperty(FIELD_SERVICECODENAME)
    public void setServiceCodeName(String serviceCodeName){
        this.set(FIELD_SERVICECODENAME, serviceCodeName);
    }
    
    /**
     * 获取 服务代码名称  
     * @return
     */
    @JsonIgnore
    public String getServiceCodeName(){
        Object objValue = this.get(FIELD_SERVICECODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 服务代码名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isServiceCodeNameDirty(){
        if(this.contains(FIELD_SERVICECODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 服务代码名称
     */
    @JsonIgnore
    public void resetServiceCodeName(){
        this.reset(FIELD_SERVICECODENAME);
    }

    /**
     * 设置 服务代码名称
     * <P>
     * 等同 {@link #setServiceCodeName}
     * @param serviceCodeName
     */
    @JsonIgnore
    public PSDEFSFItem servicecodename(String serviceCodeName){
        this.setServiceCodeName(serviceCodeName);
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
    public PSDEFSFItem updatedate(String updateDate){
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
    public PSDEFSFItem updateman(String updateMan){
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
    public PSDEFSFItem usercat(String userCat){
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
    public PSDEFSFItem usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
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
    public PSDEFSFItem userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDEFSFItem usertag(String userTag){
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
    public PSDEFSFItem usertag2(String userTag2){
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
    public PSDEFSFItem usertag3(String userTag3){
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
    public PSDEFSFItem usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定属性搜索模式的值格式化串，未定义时如存在值转换函数使用值转换处理格式化，否则使用属性的格式化串配置
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VALUEFORMAT = "valueformat";

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * 
     * @param valueFormat
     * 
     */
    @JsonProperty(FIELD_VALUEFORMAT)
    public void setValueFormat(String valueFormat){
        this.set(FIELD_VALUEFORMAT, valueFormat);
    }
    
    /**
     * 获取 值格式化  
     * @return
     */
    @JsonIgnore
    public String getValueFormat(){
        Object objValue = this.get(FIELD_VALUEFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueFormatDirty(){
        if(this.contains(FIELD_VALUEFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值格式化
     */
    @JsonIgnore
    public void resetValueFormat(){
        this.reset(FIELD_VALUEFORMAT);
    }

    /**
     * 设置 值格式化，详细说明：{@link #FIELD_VALUEFORMAT}
     * <P>
     * 等同 {@link #setValueFormat}
     * @param valueFormat
     */
    @JsonIgnore
    public PSDEFSFItem valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUESEPERATOR</B>&nbsp;值分割符号
     * <P>
     * 字符串：最大长度 10
     */
    public final static String FIELD_VALUESEPERATOR = "valueseperator";

    /**
     * 设置 值分割符号
     * 
     * @param valueSeperator
     * 
     */
    @JsonProperty(FIELD_VALUESEPERATOR)
    public void setValueSeperator(String valueSeperator){
        this.set(FIELD_VALUESEPERATOR, valueSeperator);
    }
    
    /**
     * 获取 值分割符号  
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
     * 判断 值分割符号 是否指定值，包括空值
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
     * 重置 值分割符号
     */
    @JsonIgnore
    public void resetValueSeperator(){
        this.reset(FIELD_VALUESEPERATOR);
    }

    /**
     * 设置 值分割符号
     * <P>
     * 等同 {@link #setValueSeperator}
     * @param valueSeperator
     */
    @JsonIgnore
    public PSDEFSFItem valueseperator(String valueSeperator){
        this.setValueSeperator(valueSeperator);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;编辑器宽度
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 编辑器宽度
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 编辑器宽度  
     * @return
     */
    @JsonIgnore
    public Integer getWidth(){
        Object objValue = this.get(FIELD_WIDTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 编辑器宽度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthDirty(){
        if(this.contains(FIELD_WIDTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 编辑器宽度
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSDEFSFItem width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFSFItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFSFItemId(strValue);
    }

    @JsonIgnore
    public PSDEFSFItem id(String strValue){
        this.setPSDEFSFItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFSFItem){
            PSDEFSFItem model = (PSDEFSFItem)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
