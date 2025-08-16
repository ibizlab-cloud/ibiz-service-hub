package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETREEVIEW</B>实体树视图 模型传输对象
 * <P>
 * 树视图部件模型，定义树视图的界面及处理逻辑，包括了树节点与树节点的关系。支持定义树表格列及树节点表格列，为常规树表格及甘特树表格部件提供支持
 */
public class PSDETreeViewDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDETreeViewDTO(){
    }      

    /**
     * <B>BUFFERRENDERERMODE</B>&nbsp;缓存绘制模式，指定树视图部件是否使用缓存绘制模式，未定义时为【是】。此配置为早期前端技术使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUFFERRENDERERMODE = "bufferrenderermode";

    /**
     * 设置 缓存绘制模式，详细说明：{@link #FIELD_BUFFERRENDERERMODE}
     * 
     * @param bufferRendererMode
     * 
     */
    @JsonProperty(FIELD_BUFFERRENDERERMODE)
    public void setBufferRendererMode(Integer bufferRendererMode){
        this.set(FIELD_BUFFERRENDERERMODE, bufferRendererMode);
    }
    
    /**
     * 获取 缓存绘制模式  
     * @return
     */
    @JsonIgnore
    public Integer getBufferRendererMode(){
        Object objValue = this.get(FIELD_BUFFERRENDERERMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 缓存绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBufferRendererModeDirty(){
        if(this.contains(FIELD_BUFFERRENDERERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 缓存绘制模式
     */
    @JsonIgnore
    public void resetBufferRendererMode(){
        this.reset(FIELD_BUFFERRENDERERMODE);
    }

    /**
     * 设置 缓存绘制模式，详细说明：{@link #FIELD_BUFFERRENDERERMODE}
     * <P>
     * 等同 {@link #setBufferRendererMode}
     * @param bufferRendererMode
     */
    @JsonIgnore
    public PSDETreeViewDTO bufferrenderermode(Integer bufferRendererMode){
        this.setBufferRendererMode(bufferRendererMode);
        return this;
    }

     /**
     * 设置 缓存绘制模式，详细说明：{@link #FIELD_BUFFERRENDERERMODE}
     * <P>
     * 等同 {@link #setBufferRendererMode}
     * @param bufferRendererMode
     */
    @JsonIgnore
    public PSDETreeViewDTO bufferrenderermode(Boolean bufferRendererMode){
        if(bufferRendererMode == null){
            this.setBufferRendererMode(null);
        }
        else{
            this.setBufferRendererMode(bufferRendererMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BUSYINDICATOR</B>&nbsp;显示处理提示
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_BUSYINDICATOR = "busyindicator";

    /**
     * 设置 显示处理提示
     * 
     * @param busyIndicator
     * 
     */
    @JsonProperty(FIELD_BUSYINDICATOR)
    public void setBusyIndicator(Integer busyIndicator){
        this.set(FIELD_BUSYINDICATOR, busyIndicator);
    }
    
    /**
     * 获取 显示处理提示  
     * @return
     */
    @JsonIgnore
    public Integer getBusyIndicator(){
        Object objValue = this.get(FIELD_BUSYINDICATOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示处理提示 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBusyIndicatorDirty(){
        if(this.contains(FIELD_BUSYINDICATOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示处理提示
     */
    @JsonIgnore
    public void resetBusyIndicator(){
        this.reset(FIELD_BUSYINDICATOR);
    }

    /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDETreeViewDTO busyindicator(Integer busyIndicator){
        this.setBusyIndicator(busyIndicator);
        return this;
    }

     /**
     * 设置 显示处理提示
     * <P>
     * 等同 {@link #setBusyIndicator}
     * @param busyIndicator
     */
    @JsonIgnore
    public PSDETreeViewDTO busyindicator(Boolean busyIndicator){
        if(busyIndicator == null){
            this.setBusyIndicator(null);
        }
        else{
            this.setBusyIndicator(busyIndicator?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CATPSCODELISTID</B>&nbsp;树目录代码表，指定树视图部件的分类代码表对象，分类代码表提供顶级树节点分支切换功能
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_CATPSCODELISTID = "catpscodelistid";

    /**
     * 设置 树目录代码表，详细说明：{@link #FIELD_CATPSCODELISTID}
     * 
     * @param catPSCodeListId
     * 
     */
    @JsonProperty(FIELD_CATPSCODELISTID)
    public void setCatPSCodeListId(String catPSCodeListId){
        this.set(FIELD_CATPSCODELISTID, catPSCodeListId);
    }
    
    /**
     * 获取 树目录代码表  
     * @return
     */
    @JsonIgnore
    public String getCatPSCodeListId(){
        Object objValue = this.get(FIELD_CATPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树目录代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCatPSCodeListIdDirty(){
        if(this.contains(FIELD_CATPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树目录代码表
     */
    @JsonIgnore
    public void resetCatPSCodeListId(){
        this.reset(FIELD_CATPSCODELISTID);
    }

    /**
     * 设置 树目录代码表，详细说明：{@link #FIELD_CATPSCODELISTID}
     * <P>
     * 等同 {@link #setCatPSCodeListId}
     * @param catPSCodeListId
     */
    @JsonIgnore
    public PSDETreeViewDTO catpscodelistid(String catPSCodeListId){
        this.setCatPSCodeListId(catPSCodeListId);
        return this;
    }

    /**
     * 设置 树目录代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCatPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO catpscodelistid(PSCodeListDTO pSCodeList){
        if(pSCodeList == null){
            this.setCatPSCodeListId(null);
            this.setCatPSCodeListName(null);
        }
        else{
            this.setCatPSCodeListId(pSCodeList.getPSCodeListId());
            this.setCatPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>CATPSCODELISTNAME</B>&nbsp;树目录代码表，指定树视图部件的分类代码表对象，分类代码表提供顶级树节点分支切换功能
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CATPSCODELISTID}
     */
    public final static String FIELD_CATPSCODELISTNAME = "catpscodelistname";

    /**
     * 设置 树目录代码表，详细说明：{@link #FIELD_CATPSCODELISTNAME}
     * 
     * @param catPSCodeListName
     * 
     */
    @JsonProperty(FIELD_CATPSCODELISTNAME)
    public void setCatPSCodeListName(String catPSCodeListName){
        this.set(FIELD_CATPSCODELISTNAME, catPSCodeListName);
    }
    
    /**
     * 获取 树目录代码表  
     * @return
     */
    @JsonIgnore
    public String getCatPSCodeListName(){
        Object objValue = this.get(FIELD_CATPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树目录代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCatPSCodeListNameDirty(){
        if(this.contains(FIELD_CATPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树目录代码表
     */
    @JsonIgnore
    public void resetCatPSCodeListName(){
        this.reset(FIELD_CATPSCODELISTNAME);
    }

    /**
     * 设置 树目录代码表，详细说明：{@link #FIELD_CATPSCODELISTNAME}
     * <P>
     * 等同 {@link #setCatPSCodeListName}
     * @param catPSCodeListName
     */
    @JsonIgnore
    public PSDETreeViewDTO catpscodelistname(String catPSCodeListName){
        this.setCatPSCodeListName(catPSCodeListName);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定树视图的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDETreeViewDTO codename(String codeName){
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
    public PSDETreeViewDTO createdate(Timestamp createDate){
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
    public PSDETreeViewDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EMPTYTEXT</B>&nbsp;无值显示内容，指定树视图部件的无值显示内容，未定义时使用前端应用配置
     * <P>
     * 字符串：最大长度 200
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
    public PSDETreeViewDTO emptytext(String emptyText){
        this.setEmptyText(emptyText);
        return this;
    }

    /**
     * <B>EMPTYTEXTPSLANRESID</B>&nbsp;无值内容语言资源，指定树视图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_EMPTYTEXTPSLANRESID = "emptytextpslanresid";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * 
     * @param emptyTextPSLanResId
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESID)
    public void setEmptyTextPSLanResId(String emptyTextPSLanResId){
        this.set(FIELD_EMPTYTEXTPSLANRESID, emptyTextPSLanResId);
    }
    
    /**
     * 获取 无值内容语言资源  
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
     * 判断 无值内容语言资源 是否指定值，包括空值
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
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResId(){
        this.reset(FIELD_EMPTYTEXTPSLANRESID);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESID}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param emptyTextPSLanResId
     */
    @JsonIgnore
    public PSDETreeViewDTO emptytextpslanresid(String emptyTextPSLanResId){
        this.setEmptyTextPSLanResId(emptyTextPSLanResId);
        return this;
    }

    /**
     * 设置 无值内容语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setEmptyTextPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO emptytextpslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>EMPTYTEXTPSLANRESNAME</B>&nbsp;无值内容语言资源，指定树视图部件的无值显示内容多语言资源对象，未定义时使用前端应用配置
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_EMPTYTEXTPSLANRESID}
     */
    public final static String FIELD_EMPTYTEXTPSLANRESNAME = "emptytextpslanresname";

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * 
     * @param emptyTextPSLanResName
     * 
     */
    @JsonProperty(FIELD_EMPTYTEXTPSLANRESNAME)
    public void setEmptyTextPSLanResName(String emptyTextPSLanResName){
        this.set(FIELD_EMPTYTEXTPSLANRESNAME, emptyTextPSLanResName);
    }
    
    /**
     * 获取 无值内容语言资源  
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
     * 判断 无值内容语言资源 是否指定值，包括空值
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
     * 重置 无值内容语言资源
     */
    @JsonIgnore
    public void resetEmptyTextPSLanResName(){
        this.reset(FIELD_EMPTYTEXTPSLANRESNAME);
    }

    /**
     * 设置 无值内容语言资源，详细说明：{@link #FIELD_EMPTYTEXTPSLANRESNAME}
     * <P>
     * 等同 {@link #setEmptyTextPSLanResName}
     * @param emptyTextPSLanResName
     */
    @JsonIgnore
    public PSDETreeViewDTO emptytextpslanresname(String emptyTextPSLanResName){
        this.setEmptyTextPSLanResName(emptyTextPSLanResName);
        return this;
    }

    /**
     * <B>ENABLEEDIT</B>&nbsp;启用编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEEDIT = "enableedit";

    /**
     * 设置 启用编辑
     * 
     * @param enableEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEEDIT)
    public void setEnableEdit(Integer enableEdit){
        this.set(FIELD_ENABLEEDIT, enableEdit);
    }
    
    /**
     * 获取 启用编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableEdit(){
        Object objValue = this.get(FIELD_ENABLEEDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableEditDirty(){
        if(this.contains(FIELD_ENABLEEDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用编辑
     */
    @JsonIgnore
    public void resetEnableEdit(){
        this.reset(FIELD_ENABLEEDIT);
    }

    /**
     * 设置 启用编辑
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDETreeViewDTO enableedit(Integer enableEdit){
        this.setEnableEdit(enableEdit);
        return this;
    }

     /**
     * 设置 启用编辑
     * <P>
     * 等同 {@link #setEnableEdit}
     * @param enableEdit
     */
    @JsonIgnore
    public PSDETreeViewDTO enableedit(Boolean enableEdit){
        if(enableEdit == null){
            this.setEnableEdit(null);
        }
        else{
            this.setEnableEdit(enableEdit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用项权限控制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用项权限控制
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用项权限控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableItemPriv(){
        Object objValue = this.get(FIELD_ENABLEITEMPRIV);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用项权限控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableItemPrivDirty(){
        if(this.contains(FIELD_ENABLEITEMPRIV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用项权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDETreeViewDTO enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用项权限控制
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDETreeViewDTO enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESEARCH</B>&nbsp;默认支持搜索，指定树视图部件的节点是否默认支持搜索，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESEARCH = "enablesearch";

    /**
     * 设置 默认支持搜索，详细说明：{@link #FIELD_ENABLESEARCH}
     * 
     * @param enableSearch
     * 
     */
    @JsonProperty(FIELD_ENABLESEARCH)
    public void setEnableSearch(Integer enableSearch){
        this.set(FIELD_ENABLESEARCH, enableSearch);
    }
    
    /**
     * 获取 默认支持搜索  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSearch(){
        Object objValue = this.get(FIELD_ENABLESEARCH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认支持搜索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSearchDirty(){
        if(this.contains(FIELD_ENABLESEARCH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认支持搜索
     */
    @JsonIgnore
    public void resetEnableSearch(){
        this.reset(FIELD_ENABLESEARCH);
    }

    /**
     * 设置 默认支持搜索，详细说明：{@link #FIELD_ENABLESEARCH}
     * <P>
     * 等同 {@link #setEnableSearch}
     * @param enableSearch
     */
    @JsonIgnore
    public PSDETreeViewDTO enablesearch(Integer enableSearch){
        this.setEnableSearch(enableSearch);
        return this;
    }

     /**
     * 设置 默认支持搜索，详细说明：{@link #FIELD_ENABLESEARCH}
     * <P>
     * 等同 {@link #setEnableSearch}
     * @param enableSearch
     */
    @JsonIgnore
    public PSDETreeViewDTO enablesearch(Boolean enableSearch){
        if(enableSearch == null){
            this.setEnableSearch(null);
        }
        else{
            this.setEnableSearch(enableSearch?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDETreeViewDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NOICONDEFAULT</B>&nbsp;默认不输出图标，指定树视图部件的节点是否默认不输出图标，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOICONDEFAULT = "noicondefault";

    /**
     * 设置 默认不输出图标，详细说明：{@link #FIELD_NOICONDEFAULT}
     * 
     * @param noIconDefault
     * 
     */
    @JsonProperty(FIELD_NOICONDEFAULT)
    public void setNoIconDefault(Integer noIconDefault){
        this.set(FIELD_NOICONDEFAULT, noIconDefault);
    }
    
    /**
     * 获取 默认不输出图标  
     * @return
     */
    @JsonIgnore
    public Integer getNoIconDefault(){
        Object objValue = this.get(FIELD_NOICONDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认不输出图标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoIconDefaultDirty(){
        if(this.contains(FIELD_NOICONDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认不输出图标
     */
    @JsonIgnore
    public void resetNoIconDefault(){
        this.reset(FIELD_NOICONDEFAULT);
    }

    /**
     * 设置 默认不输出图标，详细说明：{@link #FIELD_NOICONDEFAULT}
     * <P>
     * 等同 {@link #setNoIconDefault}
     * @param noIconDefault
     */
    @JsonIgnore
    public PSDETreeViewDTO noicondefault(Integer noIconDefault){
        this.setNoIconDefault(noIconDefault);
        return this;
    }

     /**
     * 设置 默认不输出图标，详细说明：{@link #FIELD_NOICONDEFAULT}
     * <P>
     * 等同 {@link #setNoIconDefault}
     * @param noIconDefault
     */
    @JsonIgnore
    public PSDETreeViewDTO noicondefault(Boolean noIconDefault){
        if(noIconDefault == null){
            this.setNoIconDefault(null);
        }
        else{
            this.setNoIconDefault(noIconDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;界面处理对象，指定树视图部件的默认界面处理器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 界面处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerId(){
        Object objValue = this.get(FIELD_PSACHANDLERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerIdDirty(){
        if(this.contains(FIELD_PSACHANDLERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDETreeViewDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 界面处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO psachandlerid(PSACHandlerDTO pSACHandler){
        if(pSACHandler == null){
            this.setPSACHandlerId(null);
            this.setPSACHandlerName(null);
        }
        else{
            this.setPSACHandlerId(pSACHandler.getPSACHandlerId());
            this.setPSACHandlerName(pSACHandler.getPSACHandlerName());
        }
        return this;
    }

    /**
     * <B>PSACHANDLERNAME</B>&nbsp;界面处理对象，指定树视图部件的默认界面处理器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 界面处理对象  
     * @return
     */
    @JsonIgnore
    public String getPSACHandlerName(){
        Object objValue = this.get(FIELD_PSACHANDLERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSACHandlerNameDirty(){
        if(this.contains(FIELD_PSACHANDLERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 界面处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDETreeViewDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组，指定树视图部件默认附加的部件逻辑组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * 
     * @param pSCtrlLogicGroupId
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPID)
    public void setPSCtrlLogicGroupId(String pSCtrlLogicGroupId){
        this.set(FIELD_PSCTRLLOGICGROUPID, pSCtrlLogicGroupId);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupId(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupIdDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupId(){
        this.reset(FIELD_PSCTRLLOGICGROUPID);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPID}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSDETreeViewDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
        this.setPSCtrlLogicGroupId(pSCtrlLogicGroupId);
        return this;
    }

    /**
     * 设置 界面逻辑组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroup 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
        if(pSCtrlLogicGroup == null){
            this.setPSCtrlLogicGroupId(null);
            this.setPSCtrlLogicGroupName(null);
        }
        else{
            this.setPSCtrlLogicGroupId(pSCtrlLogicGroup.getPSCtrlLogicGroupId());
            this.setPSCtrlLogicGroupName(pSCtrlLogicGroup.getPSCtrlLogicGroupName());
        }
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组，指定树视图部件默认附加的部件逻辑组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * 
     * @param pSCtrlLogicGroupName
     * 
     */
    @JsonProperty(FIELD_PSCTRLLOGICGROUPNAME)
    public void setPSCtrlLogicGroupName(String pSCtrlLogicGroupName){
        this.set(FIELD_PSCTRLLOGICGROUPNAME, pSCtrlLogicGroupName);
    }
    
    /**
     * 获取 界面逻辑组  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlLogicGroupName(){
        Object objValue = this.get(FIELD_PSCTRLLOGICGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面逻辑组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlLogicGroupNameDirty(){
        if(this.contains(FIELD_PSCTRLLOGICGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面逻辑组
     */
    @JsonIgnore
    public void resetPSCtrlLogicGroupName(){
        this.reset(FIELD_PSCTRLLOGICGROUPNAME);
    }

    /**
     * 设置 界面逻辑组，详细说明：{@link #FIELD_PSCTRLLOGICGROUPNAME}
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSDETreeViewDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSCTRLMSGID</B>&nbsp;部件消息，指定树视图部件默认的部件消息对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlMsgDTO} 
     */
    public final static String FIELD_PSCTRLMSGID = "psctrlmsgid";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * 
     * @param pSCtrlMsgId
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGID)
    public void setPSCtrlMsgId(String pSCtrlMsgId){
        this.set(FIELD_PSCTRLMSGID, pSCtrlMsgId);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgId(){
        Object objValue = this.get(FIELD_PSCTRLMSGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgIdDirty(){
        if(this.contains(FIELD_PSCTRLMSGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgId(){
        this.reset(FIELD_PSCTRLMSGID);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGID}
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsgId
     */
    @JsonIgnore
    public PSDETreeViewDTO psctrlmsgid(String pSCtrlMsgId){
        this.setPSCtrlMsgId(pSCtrlMsgId);
        return this;
    }

    /**
     * 设置 部件消息，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCtrlMsgId}
     * @param pSCtrlMsg 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO psctrlmsgid(PSCtrlMsgDTO pSCtrlMsg){
        if(pSCtrlMsg == null){
            this.setPSCtrlMsgId(null);
            this.setPSCtrlMsgName(null);
        }
        else{
            this.setPSCtrlMsgId(pSCtrlMsg.getPSCtrlMsgId());
            this.setPSCtrlMsgName(pSCtrlMsg.getPSCtrlMsgName());
        }
        return this;
    }

    /**
     * <B>PSCTRLMSGNAME</B>&nbsp;部件消息，指定树视图部件默认的部件消息对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLMSGID}
     */
    public final static String FIELD_PSCTRLMSGNAME = "psctrlmsgname";

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * 
     * @param pSCtrlMsgName
     * 
     */
    @JsonProperty(FIELD_PSCTRLMSGNAME)
    public void setPSCtrlMsgName(String pSCtrlMsgName){
        this.set(FIELD_PSCTRLMSGNAME, pSCtrlMsgName);
    }
    
    /**
     * 获取 部件消息  
     * @return
     */
    @JsonIgnore
    public String getPSCtrlMsgName(){
        Object objValue = this.get(FIELD_PSCTRLMSGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部件消息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCtrlMsgNameDirty(){
        if(this.contains(FIELD_PSCTRLMSGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部件消息
     */
    @JsonIgnore
    public void resetPSCtrlMsgName(){
        this.reset(FIELD_PSCTRLMSGNAME);
    }

    /**
     * 设置 部件消息，详细说明：{@link #FIELD_PSCTRLMSGNAME}
     * <P>
     * 等同 {@link #setPSCtrlMsgName}
     * @param pSCtrlMsgName
     */
    @JsonIgnore
    public PSDETreeViewDTO psctrlmsgname(String pSCtrlMsgName){
        this.setPSCtrlMsgName(pSCtrlMsgName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定树视图部件所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
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
    public PSDETreeViewDTO psdeid(String pSDEId){
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
    public PSDETreeViewDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定树视图部件所在的实体对象
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
    public PSDETreeViewDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 实体树视图标识
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 实体树视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewId(){
        Object objValue = this.get(FIELD_PSDETREEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewIdDirty(){
        if(this.contains(FIELD_PSDETREEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图标识
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 实体树视图标识
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDETreeViewDTO psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图名称，指定树视图部件的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 实体树视图名称，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 实体树视图名称  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewName(){
        Object objValue = this.get(FIELD_PSDETREEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewNameDirty(){
        if(this.contains(FIELD_PSDETREEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树视图名称
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 实体树视图名称，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDETreeViewDTO psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeViewName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeViewName(strName);
    }

    @JsonIgnore
    public PSDETreeViewDTO name(String strName){
        this.setPSDETreeViewName(strName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定树视图部件默认挂接的计数器对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCounterDTO} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterId(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterIdDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 系统计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyscounterid(PSSysCounterDTO pSSysCounter){
        if(pSSysCounter == null){
            this.setPSSysCounterId(null);
            this.setPSSysCounterName(null);
        }
        else{
            this.setPSSysCounterId(pSSysCounter.getPSSysCounterId());
            this.setPSSysCounterName(pSSysCounter.getPSSysCounterName());
        }
        return this;
    }

    /**
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定树视图部件默认挂接的计数器对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 系统计数器  
     * @return
     */
    @JsonIgnore
    public String getPSSysCounterName(){
        Object objValue = this.get(FIELD_PSSYSCOUNTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统计数器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysCounterNameDirty(){
        if(this.contains(FIELD_PSSYSCOUNTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 系统计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;默认样式表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 默认样式表  
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
     * 判断 默认样式表 是否指定值，包括空值
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
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 默认样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;默认样式表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 默认样式表
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 默认样式表  
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
     * 判断 默认样式表 是否指定值，包括空值
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
     * 重置 默认样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 默认样式表
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体树视图使用的前端模板扩展插件，使用插件类型【树视图绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
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
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDETreeViewDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体树视图使用的前端模板扩展插件，使用插件类型【树视图绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
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
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDETreeViewDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>ROOTSELECT</B>&nbsp;根节点选择，指定树视图部件是否支持根节点选择，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ROOTSELECT = "rootselect";

    /**
     * 设置 根节点选择，详细说明：{@link #FIELD_ROOTSELECT}
     * 
     * @param rootSelect
     * 
     */
    @JsonProperty(FIELD_ROOTSELECT)
    public void setRootSelect(Integer rootSelect){
        this.set(FIELD_ROOTSELECT, rootSelect);
    }
    
    /**
     * 获取 根节点选择  
     * @return
     */
    @JsonIgnore
    public Integer getRootSelect(){
        Object objValue = this.get(FIELD_ROOTSELECT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 根节点选择 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRootSelectDirty(){
        if(this.contains(FIELD_ROOTSELECT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 根节点选择
     */
    @JsonIgnore
    public void resetRootSelect(){
        this.reset(FIELD_ROOTSELECT);
    }

    /**
     * 设置 根节点选择，详细说明：{@link #FIELD_ROOTSELECT}
     * <P>
     * 等同 {@link #setRootSelect}
     * @param rootSelect
     */
    @JsonIgnore
    public PSDETreeViewDTO rootselect(Integer rootSelect){
        this.setRootSelect(rootSelect);
        return this;
    }

     /**
     * 设置 根节点选择，详细说明：{@link #FIELD_ROOTSELECT}
     * <P>
     * 等同 {@link #setRootSelect}
     * @param rootSelect
     */
    @JsonIgnore
    public PSDETreeViewDTO rootselect(Boolean rootSelect){
        if(rootSelect == null){
            this.setRootSelect(null);
        }
        else{
            this.setRootSelect(rootSelect?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHOWROOT</B>&nbsp;显示根节点，指定树视图部件是否显示根节点，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWROOT = "showroot";

    /**
     * 设置 显示根节点，详细说明：{@link #FIELD_SHOWROOT}
     * 
     * @param showRoot
     * 
     */
    @JsonProperty(FIELD_SHOWROOT)
    public void setShowRoot(Integer showRoot){
        this.set(FIELD_SHOWROOT, showRoot);
    }
    
    /**
     * 获取 显示根节点  
     * @return
     */
    @JsonIgnore
    public Integer getShowRoot(){
        Object objValue = this.get(FIELD_SHOWROOT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示根节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowRootDirty(){
        if(this.contains(FIELD_SHOWROOT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示根节点
     */
    @JsonIgnore
    public void resetShowRoot(){
        this.reset(FIELD_SHOWROOT);
    }

    /**
     * 设置 显示根节点，详细说明：{@link #FIELD_SHOWROOT}
     * <P>
     * 等同 {@link #setShowRoot}
     * @param showRoot
     */
    @JsonIgnore
    public PSDETreeViewDTO showroot(Integer showRoot){
        this.setShowRoot(showRoot);
        return this;
    }

     /**
     * 设置 显示根节点，详细说明：{@link #FIELD_SHOWROOT}
     * <P>
     * 等同 {@link #setShowRoot}
     * @param showRoot
     */
    @JsonIgnore
    public PSDETreeViewDTO showroot(Boolean showRoot){
        if(showRoot == null){
            this.setShowRoot(null);
        }
        else{
            this.setShowRoot(showRoot?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>TREEGRIDFLAG</B>&nbsp;树表格模式，指定树视图的树表格模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TreeGridMode} 
     */
    public final static String FIELD_TREEGRIDFLAG = "treegridflag";

    /**
     * 设置 树表格模式，详细说明：{@link #FIELD_TREEGRIDFLAG}
     * 
     * @param treeGridFlag
     * 
     */
    @JsonProperty(FIELD_TREEGRIDFLAG)
    public void setTreeGridFlag(Integer treeGridFlag){
        this.set(FIELD_TREEGRIDFLAG, treeGridFlag);
    }
    
    /**
     * 获取 树表格模式  
     * @return
     */
    @JsonIgnore
    public Integer getTreeGridFlag(){
        Object objValue = this.get(FIELD_TREEGRIDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 树表格模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTreeGridFlagDirty(){
        if(this.contains(FIELD_TREEGRIDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表格模式
     */
    @JsonIgnore
    public void resetTreeGridFlag(){
        this.reset(FIELD_TREEGRIDFLAG);
    }

    /**
     * 设置 树表格模式，详细说明：{@link #FIELD_TREEGRIDFLAG}
     * <P>
     * 等同 {@link #setTreeGridFlag}
     * @param treeGridFlag
     */
    @JsonIgnore
    public PSDETreeViewDTO treegridflag(Integer treeGridFlag){
        this.setTreeGridFlag(treeGridFlag);
        return this;
    }

     /**
     * 设置 树表格模式，详细说明：{@link #FIELD_TREEGRIDFLAG}
     * <P>
     * 等同 {@link #setTreeGridFlag}
     * @param treeGridFlag
     */
    @JsonIgnore
    public PSDETreeViewDTO treegridflag(net.ibizsys.model.PSModelEnums.TreeGridMode treeGridFlag){
        if(treeGridFlag == null){
            this.setTreeGridFlag(null);
        }
        else{
            this.setTreeGridFlag(treeGridFlag.value);
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
    public PSDETreeViewDTO updatedate(Timestamp updateDate){
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
    public PSDETreeViewDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDETreeViewId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDETreeViewId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDETreeViewId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETreeViewId(strValue);
    }

    @JsonIgnore
    public PSDETreeViewDTO id(String strValue){
        this.setPSDETreeViewId(strValue);
        return this;
    }


    /**
     *  实体树表格列 成员集合
     */
    public final static String FIELD_PSDETREECOLS = "psdetreecols";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDETreeColDTO> psdetreecols;

    /**
     * 获取 实体树表格列 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETREECOLS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeColDTO> getPSDETreeCols(){
        return this.psdetreecols;
    }

    /**
     * 设置 实体树表格列 成员集合  
     * @param psdetreecols
     */
    @JsonProperty(FIELD_PSDETREECOLS)
    public void setPSDETreeCols(java.util.List<net.ibizsys.centralstudio.dto.PSDETreeColDTO> psdetreecols){
        this.psdetreecols = psdetreecols;
    }

    /**
     * 获取 实体树表格列 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeColDTO> getPSDETreeColsIf(){
        if(this.psdetreecols == null){
            this.psdetreecols = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDETreeColDTO>();          
        }
        return this.psdetreecols;
    }


    /**
     *  实体树节点 成员集合
     */
    public final static String FIELD_PSDETREENODES = "psdetreenodes";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeDTO> psdetreenodes;

    /**
     * 获取 实体树节点 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETREENODES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeDTO> getPSDETreeNodes(){
        return this.psdetreenodes;
    }

    /**
     * 设置 实体树节点 成员集合  
     * @param psdetreenodes
     */
    @JsonProperty(FIELD_PSDETREENODES)
    public void setPSDETreeNodes(java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeDTO> psdetreenodes){
        this.psdetreenodes = psdetreenodes;
    }

    /**
     * 获取 实体树节点 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeDTO> getPSDETreeNodesIf(){
        if(this.psdetreenodes == null){
            this.psdetreenodes = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDETreeNodeDTO>();          
        }
        return this.psdetreenodes;
    }


    /**
     *  实体树节点关系 成员集合
     */
    public final static String FIELD_PSDETREENODERS = "psdetreenoders";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeRSDTO> psdetreenoders;

    /**
     * 获取 实体树节点关系 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETREENODERS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeRSDTO> getPSDETreeNodeRs(){
        return this.psdetreenoders;
    }

    /**
     * 设置 实体树节点关系 成员集合  
     * @param psdetreenoders
     */
    @JsonProperty(FIELD_PSDETREENODERS)
    public void setPSDETreeNodeRs(java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeRSDTO> psdetreenoders){
        this.psdetreenoders = psdetreenoders;
    }

    /**
     * 获取 实体树节点关系 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeNodeRSDTO> getPSDETreeNodeRsIf(){
        if(this.psdetreenoders == null){
            this.psdetreenoders = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDETreeNodeRSDTO>();          
        }
        return this.psdetreenoders;
    }


    /**
     *  实体树视图逻辑 成员集合
     */
    public final static String FIELD_PSDETREELOGICS = "psdetreelogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDETreeLogicDTO> psdetreelogics;

    /**
     * 获取 实体树视图逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDETREELOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeLogicDTO> getPSDETreeLogics(){
        return this.psdetreelogics;
    }

    /**
     * 设置 实体树视图逻辑 成员集合  
     * @param psdetreelogics
     */
    @JsonProperty(FIELD_PSDETREELOGICS)
    public void setPSDETreeLogics(java.util.List<net.ibizsys.centralstudio.dto.PSDETreeLogicDTO> psdetreelogics){
        this.psdetreelogics = psdetreelogics;
    }

    /**
     * 获取 实体树视图逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDETreeLogicDTO> getPSDETreeLogicsIf(){
        if(this.psdetreelogics == null){
            this.psdetreelogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDETreeLogicDTO>();          
        }
        return this.psdetreelogics;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDETreeViewDTO){
            PSDETreeViewDTO dto = (PSDETreeViewDTO)iEntity;
            dto.setPSDETreeCols(this.getPSDETreeCols());
            dto.setPSDETreeNodes(this.getPSDETreeNodes());
            dto.setPSDETreeNodeRs(this.getPSDETreeNodeRs());
            dto.setPSDETreeLogics(this.getPSDETreeLogics());
        }
        super.copyTo(iEntity);
    }
}
