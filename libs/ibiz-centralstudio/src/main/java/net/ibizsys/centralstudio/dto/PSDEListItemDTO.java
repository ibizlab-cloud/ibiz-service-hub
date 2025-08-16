package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELISTITEM</B>实体多数据部件项 模型传输对象
 * <P>
 * 实体多数据部件数据项模型，为数据列表及卡片视图等多数据部件提供数据项支持，定义取值属性、值格式化等逻辑
 */
public class PSDEListItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEListItemDTO(){
    }      

    /**
     * <B>ALIGN</B>&nbsp;水平对齐，指定显示内容项的水平对齐方式，未定义时为【左对齐】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.GridColAlign} 
     */
    public final static String FIELD_ALIGN = "align";

    /**
     * 设置 水平对齐，详细说明：{@link #FIELD_ALIGN}
     * 
     * @param align
     * 
     */
    @JsonProperty(FIELD_ALIGN)
    public void setAlign(String align){
        this.set(FIELD_ALIGN, align);
    }
    
    /**
     * 获取 水平对齐  
     * @return
     */
    @JsonIgnore
    public String getAlign(){
        Object objValue = this.get(FIELD_ALIGN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 水平对齐 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAlignDirty(){
        if(this.contains(FIELD_ALIGN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 水平对齐
     */
    @JsonIgnore
    public void resetAlign(){
        this.reset(FIELD_ALIGN);
    }

    /**
     * 设置 水平对齐，详细说明：{@link #FIELD_ALIGN}
     * <P>
     * 等同 {@link #setAlign}
     * @param align
     */
    @JsonIgnore
    public PSDEListItemDTO align(String align){
        this.setAlign(align);
        return this;
    }

     /**
     * 设置 水平对齐，详细说明：{@link #FIELD_ALIGN}
     * <P>
     * 等同 {@link #setAlign}
     * @param align
     */
    @JsonIgnore
    public PSDEListItemDTO align(net.ibizsys.model.PSModelEnums.GridColAlign align){
        if(align == null){
            this.setAlign(null);
        }
        else{
            this.setAlign(align.value);
        }
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定项标题的多语言资源对象，未定义时如项存在绑定属性，使用属性逻辑名称的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
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
    public PSDEListItemDTO cappslanresid(String capPSLanResId){
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
    public PSDEListItemDTO cappslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定项标题的多语言资源对象，未定义时如项存在绑定属性，使用属性逻辑名称的多语言资源对象
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
    public PSDEListItemDTO cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;标题，指定项的标题，未定义时如项存在绑定属性，使用属性的逻辑名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 标题  
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
     * 判断 标题 是否指定值，包括空值
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
     * 重置 标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSDEListItemDTO caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CLCONVERTMODE</B>&nbsp;代码值转换模式，指定列表数据项的代码值转换模式，未定义时为【前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CodeListConvertMode} 
     */
    public final static String FIELD_CLCONVERTMODE = "clconvertmode";

    /**
     * 设置 代码值转换模式，详细说明：{@link #FIELD_CLCONVERTMODE}
     * 
     * @param cLConvertMode
     * 
     */
    @JsonProperty(FIELD_CLCONVERTMODE)
    public void setCLConvertMode(String cLConvertMode){
        this.set(FIELD_CLCONVERTMODE, cLConvertMode);
    }
    
    /**
     * 获取 代码值转换模式  
     * @return
     */
    @JsonIgnore
    public String getCLConvertMode(){
        Object objValue = this.get(FIELD_CLCONVERTMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码值转换模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCLConvertModeDirty(){
        if(this.contains(FIELD_CLCONVERTMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码值转换模式
     */
    @JsonIgnore
    public void resetCLConvertMode(){
        this.reset(FIELD_CLCONVERTMODE);
    }

    /**
     * 设置 代码值转换模式，详细说明：{@link #FIELD_CLCONVERTMODE}
     * <P>
     * 等同 {@link #setCLConvertMode}
     * @param cLConvertMode
     */
    @JsonIgnore
    public PSDEListItemDTO clconvertmode(String cLConvertMode){
        this.setCLConvertMode(cLConvertMode);
        return this;
    }

     /**
     * 设置 代码值转换模式，详细说明：{@link #FIELD_CLCONVERTMODE}
     * <P>
     * 等同 {@link #setCLConvertMode}
     * @param cLConvertMode
     */
    @JsonIgnore
    public PSDEListItemDTO clconvertmode(net.ibizsys.model.PSModelEnums.CodeListConvertMode cLConvertMode){
        if(cLConvertMode == null){
            this.setCLConvertMode(null);
        }
        else{
            this.setCLConvertMode(cLConvertMode.value);
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
    public PSDEListItemDTO createdate(Timestamp createDate){
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
    public PSDEListItemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEListItemDTO customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CUSTOMMODE = "custommode";

    /**
     * 设置 脚本代码模式
     * 
     * @param customMode
     * 
     */
    @JsonProperty(FIELD_CUSTOMMODE)
    public void setCustomMode(Integer customMode){
        this.set(FIELD_CUSTOMMODE, customMode);
    }
    
    /**
     * 获取 脚本代码模式  
     * @return
     */
    @JsonIgnore
    public Integer getCustomMode(){
        Object objValue = this.get(FIELD_CUSTOMMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 脚本代码模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomModeDirty(){
        if(this.contains(FIELD_CUSTOMMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 脚本代码模式
     */
    @JsonIgnore
    public void resetCustomMode(){
        this.reset(FIELD_CUSTOMMODE);
    }

    /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEListItemDTO custommode(Integer customMode){
        this.setCustomMode(customMode);
        return this;
    }

     /**
     * 设置 脚本代码模式
     * <P>
     * 等同 {@link #setCustomMode}
     * @param customMode
     */
    @JsonIgnore
    public PSDEListItemDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DATAITEMS</B>&nbsp;数据项参数，指定列表内容项绑定的数据项集合，多项使用【;】分隔
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DATAITEMS = "dataitems";

    /**
     * 设置 数据项参数，详细说明：{@link #FIELD_DATAITEMS}
     * 
     * @param dataItems
     * 
     */
    @JsonProperty(FIELD_DATAITEMS)
    public void setDataItems(String dataItems){
        this.set(FIELD_DATAITEMS, dataItems);
    }
    
    /**
     * 获取 数据项参数  
     * @return
     */
    @JsonIgnore
    public String getDataItems(){
        Object objValue = this.get(FIELD_DATAITEMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据项参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataItemsDirty(){
        if(this.contains(FIELD_DATAITEMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据项参数
     */
    @JsonIgnore
    public void resetDataItems(){
        this.reset(FIELD_DATAITEMS);
    }

    /**
     * 设置 数据项参数，详细说明：{@link #FIELD_DATAITEMS}
     * <P>
     * 等同 {@link #setDataItems}
     * @param dataItems
     */
    @JsonIgnore
    public PSDEListItemDTO dataitems(String dataItems){
        this.setDataItems(dataItems);
        return this;
    }

    /**
     * <B>DATAVIEWPSDEID</B>&nbsp;卡片部件实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAVIEWID}
     */
    public final static String FIELD_DATAVIEWPSDEID = "dataviewpsdeid";

    /**
     * 设置 卡片部件实体标识
     * 
     * @param dataViewPSDEId
     * 
     */
    @JsonProperty(FIELD_DATAVIEWPSDEID)
    public void setDataViewPSDEId(String dataViewPSDEId){
        this.set(FIELD_DATAVIEWPSDEID, dataViewPSDEId);
    }
    
    /**
     * 获取 卡片部件实体标识  
     * @return
     */
    @JsonIgnore
    public String getDataViewPSDEId(){
        Object objValue = this.get(FIELD_DATAVIEWPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 卡片部件实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataViewPSDEIdDirty(){
        if(this.contains(FIELD_DATAVIEWPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 卡片部件实体标识
     */
    @JsonIgnore
    public void resetDataViewPSDEId(){
        this.reset(FIELD_DATAVIEWPSDEID);
    }

    /**
     * 设置 卡片部件实体标识
     * <P>
     * 等同 {@link #setDataViewPSDEId}
     * @param dataViewPSDEId
     */
    @JsonIgnore
    public PSDEListItemDTO dataviewpsdeid(String dataViewPSDEId){
        this.setDataViewPSDEId(dataViewPSDEId);
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用列权限控制，指定列表项是否启用列权限控制，未定义时由列表项绑定的实体属性决定，无实体属性则为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEITEMPRIV = "enableitempriv";

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * 
     * @param enableItemPriv
     * 
     */
    @JsonProperty(FIELD_ENABLEITEMPRIV)
    public void setEnableItemPriv(Integer enableItemPriv){
        this.set(FIELD_ENABLEITEMPRIV, enableItemPriv);
    }
    
    /**
     * 获取 启用列权限控制  
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
     * 判断 启用列权限控制 是否指定值，包括空值
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
     * 重置 启用列权限控制
     */
    @JsonIgnore
    public void resetEnableItemPriv(){
        this.reset(FIELD_ENABLEITEMPRIV);
    }

    /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEListItemDTO enableitempriv(Integer enableItemPriv){
        this.setEnableItemPriv(enableItemPriv);
        return this;
    }

     /**
     * 设置 启用列权限控制，详细说明：{@link #FIELD_ENABLEITEMPRIV}
     * <P>
     * 等同 {@link #setEnableItemPriv}
     * @param enableItemPriv
     */
    @JsonIgnore
    public PSDEListItemDTO enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPITEM</B>&nbsp;分组项，指定列表项的默认分组项，此配置为早期模板保留
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.GridColGroupMode} 
     */
    public final static String FIELD_GROUPITEM = "groupitem";

    /**
     * 设置 分组项，详细说明：{@link #FIELD_GROUPITEM}
     * 
     * @param groupItem
     * 
     */
    @JsonProperty(FIELD_GROUPITEM)
    public void setGroupItem(String groupItem){
        this.set(FIELD_GROUPITEM, groupItem);
    }
    
    /**
     * 获取 分组项  
     * @return
     */
    @JsonIgnore
    public String getGroupItem(){
        Object objValue = this.get(FIELD_GROUPITEM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 分组项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupItemDirty(){
        if(this.contains(FIELD_GROUPITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 分组项
     */
    @JsonIgnore
    public void resetGroupItem(){
        this.reset(FIELD_GROUPITEM);
    }

    /**
     * 设置 分组项，详细说明：{@link #FIELD_GROUPITEM}
     * <P>
     * 等同 {@link #setGroupItem}
     * @param groupItem
     */
    @JsonIgnore
    public PSDEListItemDTO groupitem(String groupItem){
        this.setGroupItem(groupItem);
        return this;
    }

     /**
     * 设置 分组项，详细说明：{@link #FIELD_GROUPITEM}
     * <P>
     * 等同 {@link #setGroupItem}
     * @param groupItem
     */
    @JsonIgnore
    public PSDEListItemDTO groupitem(net.ibizsys.model.PSModelEnums.GridColGroupMode groupItem){
        if(groupItem == null){
            this.setGroupItem(null);
        }
        else{
            this.setGroupItem(groupItem.value);
        }
        return this;
    }

    /**
     * <B>ITEMTYPE</B>&nbsp;项类型，指定列表项的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ListItemType} 
     */
    public final static String FIELD_ITEMTYPE = "itemtype";

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * 
     * @param itemType
     * 
     */
    @JsonProperty(FIELD_ITEMTYPE)
    public void setItemType(String itemType){
        this.set(FIELD_ITEMTYPE, itemType);
    }
    
    /**
     * 获取 项类型  
     * @return
     */
    @JsonIgnore
    public String getItemType(){
        Object objValue = this.get(FIELD_ITEMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isItemTypeDirty(){
        if(this.contains(FIELD_ITEMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项类型
     */
    @JsonIgnore
    public void resetItemType(){
        this.reset(FIELD_ITEMTYPE);
    }

    /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSDEListItemDTO itemtype(String itemType){
        this.setItemType(itemType);
        return this;
    }

     /**
     * 设置 项类型，详细说明：{@link #FIELD_ITEMTYPE}
     * <P>
     * 等同 {@link #setItemType}
     * @param itemType
     */
    @JsonIgnore
    public PSDEListItemDTO itemtype(net.ibizsys.model.PSModelEnums.ListItemType itemType){
        if(itemType == null){
            this.setItemType(null);
        }
        else{
            this.setItemType(itemType.value);
        }
        return this;
    }

    /**
     * <B>LCRPSSYSPFPLUGINID</B>&nbsp;列表项绘制插件，指定列表项绘制插件使用的前端模板扩展插件，使用插件类型【列表项绘制插件】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_LCRPSSYSPFPLUGINID = "lcrpssyspfpluginid";

    /**
     * 设置 列表项绘制插件，详细说明：{@link #FIELD_LCRPSSYSPFPLUGINID}
     * 
     * @param lCRPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_LCRPSSYSPFPLUGINID)
    public void setLCRPSSysPFPluginId(String lCRPSSysPFPluginId){
        this.set(FIELD_LCRPSSYSPFPLUGINID, lCRPSSysPFPluginId);
    }
    
    /**
     * 获取 列表项绘制插件  
     * @return
     */
    @JsonIgnore
    public String getLCRPSSysPFPluginId(){
        Object objValue = this.get(FIELD_LCRPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表项绘制插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLCRPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_LCRPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表项绘制插件
     */
    @JsonIgnore
    public void resetLCRPSSysPFPluginId(){
        this.reset(FIELD_LCRPSSYSPFPLUGINID);
    }

    /**
     * 设置 列表项绘制插件，详细说明：{@link #FIELD_LCRPSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setLCRPSSysPFPluginId}
     * @param lCRPSSysPFPluginId
     */
    @JsonIgnore
    public PSDEListItemDTO lcrpssyspfpluginid(String lCRPSSysPFPluginId){
        this.setLCRPSSysPFPluginId(lCRPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 列表项绘制插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLCRPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEListItemDTO lcrpssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setLCRPSSysPFPluginId(null);
            this.setLCRPSSysPFPluginName(null);
        }
        else{
            this.setLCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setLCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>LCRPSSYSPFPLUGINNAME</B>&nbsp;列表项绘制插件，指定列表项绘制插件使用的前端模板扩展插件，使用插件类型【列表项绘制插件】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LCRPSSYSPFPLUGINID}
     */
    public final static String FIELD_LCRPSSYSPFPLUGINNAME = "lcrpssyspfpluginname";

    /**
     * 设置 列表项绘制插件，详细说明：{@link #FIELD_LCRPSSYSPFPLUGINNAME}
     * 
     * @param lCRPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_LCRPSSYSPFPLUGINNAME)
    public void setLCRPSSysPFPluginName(String lCRPSSysPFPluginName){
        this.set(FIELD_LCRPSSYSPFPLUGINNAME, lCRPSSysPFPluginName);
    }
    
    /**
     * 获取 列表项绘制插件  
     * @return
     */
    @JsonIgnore
    public String getLCRPSSysPFPluginName(){
        Object objValue = this.get(FIELD_LCRPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表项绘制插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLCRPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_LCRPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表项绘制插件
     */
    @JsonIgnore
    public void resetLCRPSSysPFPluginName(){
        this.reset(FIELD_LCRPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 列表项绘制插件，详细说明：{@link #FIELD_LCRPSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setLCRPSSysPFPluginName}
     * @param lCRPSSysPFPluginName
     */
    @JsonIgnore
    public PSDEListItemDTO lcrpssyspfpluginname(String lCRPSSysPFPluginName){
        this.setLCRPSSysPFPluginName(lCRPSSysPFPluginName);
        return this;
    }

    /**
     * <B>LISTPSDEID</B>&nbsp;列表部件实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELISTID}
     */
    public final static String FIELD_LISTPSDEID = "listpsdeid";

    /**
     * 设置 列表部件实体标识
     * 
     * @param listPSDEId
     * 
     */
    @JsonProperty(FIELD_LISTPSDEID)
    public void setListPSDEId(String listPSDEId){
        this.set(FIELD_LISTPSDEID, listPSDEId);
    }
    
    /**
     * 获取 列表部件实体标识  
     * @return
     */
    @JsonIgnore
    public String getListPSDEId(){
        Object objValue = this.get(FIELD_LISTPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列表部件实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isListPSDEIdDirty(){
        if(this.contains(FIELD_LISTPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列表部件实体标识
     */
    @JsonIgnore
    public void resetListPSDEId(){
        this.reset(FIELD_LISTPSDEID);
    }

    /**
     * 设置 列表部件实体标识
     * <P>
     * 等同 {@link #setListPSDEId}
     * @param listPSDEId
     */
    @JsonIgnore
    public PSDEListItemDTO listpsdeid(String listPSDEId){
        this.setListPSDEId(listPSDEId);
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
    public PSDEListItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NOSORT</B>&nbsp;禁用排序，指定是否禁用项的排序功能，未定义时由所在部件决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NOSORT = "nosort";

    /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * 
     * @param noSort
     * 
     */
    @JsonProperty(FIELD_NOSORT)
    public void setNoSort(Integer noSort){
        this.set(FIELD_NOSORT, noSort);
    }
    
    /**
     * 获取 禁用排序  
     * @return
     */
    @JsonIgnore
    public Integer getNoSort(){
        Object objValue = this.get(FIELD_NOSORT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 禁用排序 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoSortDirty(){
        if(this.contains(FIELD_NOSORT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 禁用排序
     */
    @JsonIgnore
    public void resetNoSort(){
        this.reset(FIELD_NOSORT);
    }

    /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEListItemDTO nosort(Integer noSort){
        this.setNoSort(noSort);
        return this;
    }

     /**
     * 设置 禁用排序，详细说明：{@link #FIELD_NOSORT}
     * <P>
     * 等同 {@link #setNoSort}
     * @param noSort
     */
    @JsonIgnore
    public PSDEListItemDTO nosort(Boolean noSort){
        if(noSort == null){
            this.setNoSort(null);
        }
        else{
            this.setNoSort(noSort?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示次序  
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
     * 判断 显示次序 是否指定值，包括空值
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
     * 重置 显示次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEListItemDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPE</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_PREDEFINEDTYPE = "predefinedtype";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPE)
    public void setPredefinedType(String predefinedType){
        this.set(FIELD_PREDEFINEDTYPE, predefinedType);
    }
    
    /**
     * 获取 预定义类型  
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
     * 判断 预定义类型 是否指定值，包括空值
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
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedType(){
        this.reset(FIELD_PREDEFINEDTYPE);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedType}
     * @param predefinedType
     */
    @JsonIgnore
    public PSDEListItemDTO predefinedtype(String predefinedType){
        this.setPredefinedType(predefinedType);
        return this;
    }

    /**
     * <B>PREDEFINEDTYPETEXT</B>&nbsp;预定义类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PREDEFINEDTYPETEXT = "predefinedtypetext";

    /**
     * 设置 预定义类型
     * 
     * @param predefinedTypeText
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDTYPETEXT)
    public void setPredefinedTypeText(String predefinedTypeText){
        this.set(FIELD_PREDEFINEDTYPETEXT, predefinedTypeText);
    }
    
    /**
     * 获取 预定义类型  
     * @return
     */
    @JsonIgnore
    public String getPredefinedTypeText(){
        Object objValue = this.get(FIELD_PREDEFINEDTYPETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedTypeTextDirty(){
        if(this.contains(FIELD_PREDEFINEDTYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预定义类型
     */
    @JsonIgnore
    public void resetPredefinedTypeText(){
        this.reset(FIELD_PREDEFINEDTYPETEXT);
    }

    /**
     * 设置 预定义类型
     * <P>
     * 等同 {@link #setPredefinedTypeText}
     * @param predefinedTypeText
     */
    @JsonIgnore
    public PSDEListItemDTO predefinedtypetext(String predefinedTypeText){
        this.setPredefinedTypeText(predefinedTypeText);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;代码表，启用转换代码值转换模式时，指定转换的代码表对象，未定义时使用取值属性的代码表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_PSCODELISTID = "pscodelistid";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * 
     * @param pSCodeListId
     * 
     */
    @JsonProperty(FIELD_PSCODELISTID)
    public void setPSCodeListId(String pSCodeListId){
        this.set(FIELD_PSCODELISTID, pSCodeListId);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListId(){
        this.reset(FIELD_PSCODELISTID);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTID}
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeListId
     */
    @JsonIgnore
    public PSDEListItemDTO pscodelistid(String pSCodeListId){
        this.setPSCodeListId(pSCodeListId);
        return this;
    }

    /**
     * 设置 代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEListItemDTO pscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;代码表，启用转换代码值转换模式时，指定转换的代码表对象，未定义时使用取值属性的代码表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCODELISTID}
     */
    public final static String FIELD_PSCODELISTNAME = "pscodelistname";

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * 
     * @param pSCodeListName
     * 
     */
    @JsonProperty(FIELD_PSCODELISTNAME)
    public void setPSCodeListName(String pSCodeListName){
        this.set(FIELD_PSCODELISTNAME, pSCodeListName);
    }
    
    /**
     * 获取 代码表  
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
     * 判断 代码表 是否指定值，包括空值
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
     * 重置 代码表
     */
    @JsonIgnore
    public void resetPSCodeListName(){
        this.reset(FIELD_PSCODELISTNAME);
    }

    /**
     * 设置 代码表，详细说明：{@link #FIELD_PSCODELISTNAME}
     * <P>
     * 等同 {@link #setPSCodeListName}
     * @param pSCodeListName
     */
    @JsonIgnore
    public PSDEListItemDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEDATAVIEWID</B>&nbsp;实体卡片视图，指定项所在的卡片视图部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataViewDTO} 
     */
    public final static String FIELD_PSDEDATAVIEWID = "psdedataviewid";

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWID}
     * 
     * @param pSDEDataViewId
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWID)
    public void setPSDEDataViewId(String pSDEDataViewId){
        this.set(FIELD_PSDEDATAVIEWID, pSDEDataViewId);
    }
    
    /**
     * 获取 实体卡片视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataViewId(){
        Object objValue = this.get(FIELD_PSDEDATAVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体卡片视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataViewIdDirty(){
        if(this.contains(FIELD_PSDEDATAVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体卡片视图
     */
    @JsonIgnore
    public void resetPSDEDataViewId(){
        this.reset(FIELD_PSDEDATAVIEWID);
    }

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWID}
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataViewId
     */
    @JsonIgnore
    public PSDEListItemDTO psdedataviewid(String pSDEDataViewId){
        this.setPSDEDataViewId(pSDEDataViewId);
        return this;
    }

    /**
     * 设置 实体卡片视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataViewId}
     * @param pSDEDataView 引用对象
     */
    @JsonIgnore
    public PSDEListItemDTO psdedataviewid(PSDEDataViewDTO pSDEDataView){
        if(pSDEDataView == null){
            this.setDataViewPSDEId(null);
            this.setPSDEDataViewId(null);
            this.setPSDEDataViewName(null);
        }
        else{
            this.setDataViewPSDEId(pSDEDataView.getPSDEId());
            this.setPSDEDataViewId(pSDEDataView.getPSDEDataViewId());
            this.setPSDEDataViewName(pSDEDataView.getPSDEDataViewName());
        }
        return this;
    }

    /**
     * <B>PSDEDATAVIEWNAME</B>&nbsp;实体卡片视图，指定项所在的卡片视图部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATAVIEWID}
     */
    public final static String FIELD_PSDEDATAVIEWNAME = "psdedataviewname";

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWNAME}
     * 
     * @param pSDEDataViewName
     * 
     */
    @JsonProperty(FIELD_PSDEDATAVIEWNAME)
    public void setPSDEDataViewName(String pSDEDataViewName){
        this.set(FIELD_PSDEDATAVIEWNAME, pSDEDataViewName);
    }
    
    /**
     * 获取 实体卡片视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataViewName(){
        Object objValue = this.get(FIELD_PSDEDATAVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体卡片视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataViewNameDirty(){
        if(this.contains(FIELD_PSDEDATAVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体卡片视图
     */
    @JsonIgnore
    public void resetPSDEDataViewName(){
        this.reset(FIELD_PSDEDATAVIEWNAME);
    }

    /**
     * 设置 实体卡片视图，详细说明：{@link #FIELD_PSDEDATAVIEWNAME}
     * <P>
     * 等同 {@link #setPSDEDataViewName}
     * @param pSDEDataViewName
     */
    @JsonIgnore
    public PSDEListItemDTO psdedataviewname(String pSDEDataViewName){
        this.setPSDEDataViewName(pSDEDataViewName);
        return this;
    }

    /**
     * <B>PSDELISTID</B>&nbsp;实体列表，指定项所在的数据列表部件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEListDTO} 
     */
    public final static String FIELD_PSDELISTID = "psdelistid";

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTID}
     * 
     * @param pSDEListId
     * 
     */
    @JsonProperty(FIELD_PSDELISTID)
    public void setPSDEListId(String pSDEListId){
        this.set(FIELD_PSDELISTID, pSDEListId);
    }
    
    /**
     * 获取 实体列表  
     * @return
     */
    @JsonIgnore
    public String getPSDEListId(){
        Object objValue = this.get(FIELD_PSDELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListIdDirty(){
        if(this.contains(FIELD_PSDELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表
     */
    @JsonIgnore
    public void resetPSDEListId(){
        this.reset(FIELD_PSDELISTID);
    }

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTID}
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEListId
     */
    @JsonIgnore
    public PSDEListItemDTO psdelistid(String pSDEListId){
        this.setPSDEListId(pSDEListId);
        return this;
    }

    /**
     * 设置 实体列表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEListId}
     * @param pSDEList 引用对象
     */
    @JsonIgnore
    public PSDEListItemDTO psdelistid(PSDEListDTO pSDEList){
        if(pSDEList == null){
            this.setListPSDEId(null);
            this.setPSDEListId(null);
            this.setPSDEListName(null);
        }
        else{
            this.setListPSDEId(pSDEList.getPSDEId());
            this.setPSDEListId(pSDEList.getPSDEListId());
            this.setPSDEListName(pSDEList.getPSDEListName());
        }
        return this;
    }

    /**
     * <B>PSDELISTITEMID</B>&nbsp;实体列表项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELISTITEMID = "psdelistitemid";

    /**
     * 设置 实体列表项标识
     * 
     * @param pSDEListItemId
     * 
     */
    @JsonProperty(FIELD_PSDELISTITEMID)
    public void setPSDEListItemId(String pSDEListItemId){
        this.set(FIELD_PSDELISTITEMID, pSDEListItemId);
    }
    
    /**
     * 获取 实体列表项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEListItemId(){
        Object objValue = this.get(FIELD_PSDELISTITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListItemIdDirty(){
        if(this.contains(FIELD_PSDELISTITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表项标识
     */
    @JsonIgnore
    public void resetPSDEListItemId(){
        this.reset(FIELD_PSDELISTITEMID);
    }

    /**
     * 设置 实体列表项标识
     * <P>
     * 等同 {@link #setPSDEListItemId}
     * @param pSDEListItemId
     */
    @JsonIgnore
    public PSDEListItemDTO psdelistitemid(String pSDEListItemId){
        this.setPSDEListItemId(pSDEListItemId);
        return this;
    }

    /**
     * <B>PSDELISTITEMNAME</B>&nbsp;项标识，指定项标识，需在所在部件中具备唯一性。模型引擎会使用该标识从当前实体中尝试获取项绑定的属性
     * <P>
     * 字符串：最大长度 100，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDELISTITEMNAME = "psdelistitemname";

    /**
     * 设置 项标识，详细说明：{@link #FIELD_PSDELISTITEMNAME}
     * 
     * @param pSDEListItemName
     * 
     */
    @JsonProperty(FIELD_PSDELISTITEMNAME)
    public void setPSDEListItemName(String pSDEListItemName){
        this.set(FIELD_PSDELISTITEMNAME, pSDEListItemName);
    }
    
    /**
     * 获取 项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEListItemName(){
        Object objValue = this.get(FIELD_PSDELISTITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListItemNameDirty(){
        if(this.contains(FIELD_PSDELISTITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项标识
     */
    @JsonIgnore
    public void resetPSDEListItemName(){
        this.reset(FIELD_PSDELISTITEMNAME);
    }

    /**
     * 设置 项标识，详细说明：{@link #FIELD_PSDELISTITEMNAME}
     * <P>
     * 等同 {@link #setPSDEListItemName}
     * @param pSDEListItemName
     */
    @JsonIgnore
    public PSDEListItemDTO psdelistitemname(String pSDEListItemName){
        this.setPSDEListItemName(pSDEListItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEListItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEListItemName(strName);
    }

    @JsonIgnore
    public PSDEListItemDTO name(String strName){
        this.setPSDEListItemName(strName);
        return this;
    }

    /**
     * <B>PSDELISTNAME</B>&nbsp;实体列表，指定项所在的数据列表部件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELISTID}
     */
    public final static String FIELD_PSDELISTNAME = "psdelistname";

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTNAME}
     * 
     * @param pSDEListName
     * 
     */
    @JsonProperty(FIELD_PSDELISTNAME)
    public void setPSDEListName(String pSDEListName){
        this.set(FIELD_PSDELISTNAME, pSDEListName);
    }
    
    /**
     * 获取 实体列表  
     * @return
     */
    @JsonIgnore
    public String getPSDEListName(){
        Object objValue = this.get(FIELD_PSDELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体列表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEListNameDirty(){
        if(this.contains(FIELD_PSDELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体列表
     */
    @JsonIgnore
    public void resetPSDEListName(){
        this.reset(FIELD_PSDELISTNAME);
    }

    /**
     * 设置 实体列表，详细说明：{@link #FIELD_PSDELISTNAME}
     * <P>
     * 等同 {@link #setPSDEListName}
     * @param pSDEListName
     */
    @JsonIgnore
    public PSDEListItemDTO psdelistname(String pSDEListName){
        this.setPSDEListName(pSDEListName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;界面行为组，项类型为【操作项】时指定相关的界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * 
     * @param pSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPID)
    public void setPSDEUAGroupId(String pSDEUAGroupId){
        this.set(FIELD_PSDEUAGROUPID, pSDEUAGroupId);
    }
    
    /**
     * 获取 界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupId(){
        Object objValue = this.get(FIELD_PSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_PSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupId(){
        this.reset(FIELD_PSDEUAGROUPID);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPID}
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDEListItemDTO psdeuagroupid(String pSDEUAGroupId){
        this.setPSDEUAGroupId(pSDEUAGroupId);
        return this;
    }

    /**
     * 设置 界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDEListItemDTO psdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setPSDEUAGroupId(null);
            this.setPSDEUAGroupName(null);
        }
        else{
            this.setPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组，项类型为【操作项】时指定相关的界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * 
     * @param pSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEUAGROUPNAME)
    public void setPSDEUAGroupName(String pSDEUAGroupName){
        this.set(FIELD_PSDEUAGROUPNAME, pSDEUAGroupName);
    }
    
    /**
     * 获取 界面行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEUAGroupName(){
        Object objValue = this.get(FIELD_PSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_PSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 界面行为组
     */
    @JsonIgnore
    public void resetPSDEUAGroupName(){
        this.reset(FIELD_PSDEUAGROUPNAME);
    }

    /**
     * 设置 界面行为组，详细说明：{@link #FIELD_PSDEUAGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDEListItemDTO psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>RENDERMODE</B>&nbsp;绘制模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_RENDERMODE = "rendermode";

    /**
     * 设置 绘制模式
     * 
     * @param renderMode
     * 
     */
    @JsonProperty(FIELD_RENDERMODE)
    public void setRenderMode(String renderMode){
        this.set(FIELD_RENDERMODE, renderMode);
    }
    
    /**
     * 获取 绘制模式  
     * @return
     */
    @JsonIgnore
    public String getRenderMode(){
        Object objValue = this.get(FIELD_RENDERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRenderModeDirty(){
        if(this.contains(FIELD_RENDERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绘制模式
     */
    @JsonIgnore
    public void resetRenderMode(){
        this.reset(FIELD_RENDERMODE);
    }

    /**
     * 设置 绘制模式
     * <P>
     * 等同 {@link #setRenderMode}
     * @param renderMode
     */
    @JsonIgnore
    public PSDEListItemDTO rendermode(String renderMode){
        this.setRenderMode(renderMode);
        return this;
    }

    /**
     * <B>RENDERMODETEXT</B>&nbsp;绘制模式
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_RENDERMODETEXT = "rendermodetext";

    /**
     * 设置 绘制模式
     * 
     * @param renderModeText
     * 
     */
    @JsonProperty(FIELD_RENDERMODETEXT)
    public void setRenderModeText(String renderModeText){
        this.set(FIELD_RENDERMODETEXT, renderModeText);
    }
    
    /**
     * 获取 绘制模式  
     * @return
     */
    @JsonIgnore
    public String getRenderModeText(){
        Object objValue = this.get(FIELD_RENDERMODETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 绘制模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRenderModeTextDirty(){
        if(this.contains(FIELD_RENDERMODETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 绘制模式
     */
    @JsonIgnore
    public void resetRenderModeText(){
        this.reset(FIELD_RENDERMODETEXT);
    }

    /**
     * 设置 绘制模式
     * <P>
     * 等同 {@link #setRenderModeText}
     * @param renderModeText
     */
    @JsonIgnore
    public PSDEListItemDTO rendermodetext(String renderModeText){
        this.setRenderModeText(renderModeText);
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
    public PSDEListItemDTO updatedate(Timestamp updateDate){
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
    public PSDEListItemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDEListItemDTO usertag(String userTag){
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
    public PSDEListItemDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定列表项的值格式化串，未定义时使用取值属性的配置
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
    public PSDEListItemDTO valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定列表内容项的宽度，未定义时为【150】
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 宽度  
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
     * 判断 宽度 是否指定值，包括空值
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
     * 重置 宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 宽度，详细说明：{@link #FIELD_WIDTH}
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSDEListItemDTO width(Integer width){
        this.setWidth(width);
        return this;
    }

    /**
     * <B>WIDTHUNIT</B>&nbsp;宽度单位，指定列表内容项的宽度单位，未定义时为【PX】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.GridColWidthUnitType} 
     */
    public final static String FIELD_WIDTHUNIT = "widthunit";

    /**
     * 设置 宽度单位，详细说明：{@link #FIELD_WIDTHUNIT}
     * 
     * @param widthUnit
     * 
     */
    @JsonProperty(FIELD_WIDTHUNIT)
    public void setWidthUnit(String widthUnit){
        this.set(FIELD_WIDTHUNIT, widthUnit);
    }
    
    /**
     * 获取 宽度单位  
     * @return
     */
    @JsonIgnore
    public String getWidthUnit(){
        Object objValue = this.get(FIELD_WIDTHUNIT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 宽度单位 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWidthUnitDirty(){
        if(this.contains(FIELD_WIDTHUNIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 宽度单位
     */
    @JsonIgnore
    public void resetWidthUnit(){
        this.reset(FIELD_WIDTHUNIT);
    }

    /**
     * 设置 宽度单位，详细说明：{@link #FIELD_WIDTHUNIT}
     * <P>
     * 等同 {@link #setWidthUnit}
     * @param widthUnit
     */
    @JsonIgnore
    public PSDEListItemDTO widthunit(String widthUnit){
        this.setWidthUnit(widthUnit);
        return this;
    }

     /**
     * 设置 宽度单位，详细说明：{@link #FIELD_WIDTHUNIT}
     * <P>
     * 等同 {@link #setWidthUnit}
     * @param widthUnit
     */
    @JsonIgnore
    public PSDEListItemDTO widthunit(net.ibizsys.model.PSModelEnums.GridColWidthUnitType widthUnit){
        if(widthUnit == null){
            this.setWidthUnit(null);
        }
        else{
            this.setWidthUnit(widthUnit.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEListItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEListItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEListItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEListItemId(strValue);
    }

    @JsonIgnore
    public PSDEListItemDTO id(String strValue){
        this.setPSDEListItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEListItemDTO){
            PSDEListItemDTO dto = (PSDEListItemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
