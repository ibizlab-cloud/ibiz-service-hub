package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETREENODECOL</B>树节点数据项 模型传输对象
 * <P>
 * 实体树节点数据项模型，支持为树节点提供额外的数据项，同时也为树表格视图的表格列提供数据源支持
 */
public class PSDETreeNodeColDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDETreeNodeColDTO(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许空输入，指定树表格编辑项是否允许空输入，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLOWEMPTY = "allowempty";

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * 
     * @param allowEmpty
     * 
     */
    @JsonProperty(FIELD_ALLOWEMPTY)
    public void setAllowEmpty(Integer allowEmpty){
        this.set(FIELD_ALLOWEMPTY, allowEmpty);
    }
    
    /**
     * 获取 允许空输入  
     * @return
     */
    @JsonIgnore
    public Integer getAllowEmpty(){
        Object objValue = this.get(FIELD_ALLOWEMPTY);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 允许空输入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllowEmptyDirty(){
        if(this.contains(FIELD_ALLOWEMPTY)){
            return true;
        }
        return false;
    }

    /**
     * 重置 允许空输入
     */
    @JsonIgnore
    public void resetAllowEmpty(){
        this.reset(FIELD_ALLOWEMPTY);
    }

    /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDETreeNodeColDTO allowempty(Integer allowEmpty){
        this.setAllowEmpty(allowEmpty);
        return this;
    }

     /**
     * 设置 允许空输入，详细说明：{@link #FIELD_ALLOWEMPTY}
     * <P>
     * 等同 {@link #setAllowEmpty}
     * @param allowEmpty
     */
    @JsonIgnore
    public PSDETreeNodeColDTO allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CLCONVERTMODE</B>&nbsp;代码值转换模式，指定树表格数据项的代码值转换模式，未定义时为【前台】
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
    public PSDETreeNodeColDTO clconvertmode(String cLConvertMode){
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
    public PSDETreeNodeColDTO clconvertmode(net.ibizsys.model.PSModelEnums.CodeListConvertMode cLConvertMode){
        if(cLConvertMode == null){
            this.setCLConvertMode(null);
        }
        else{
            this.setCLConvertMode(cLConvertMode.value);
        }
        return this;
    }

    /**
     * <B>CODELISTCONFIGMODE</B>&nbsp;输出代码表模式，指定树表格编辑项代码表配置的输出模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.OutputCodeListMode} 
     */
    public final static String FIELD_CODELISTCONFIGMODE = "codelistconfigmode";

    /**
     * 设置 输出代码表模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * 
     * @param codeListConfigMode
     * 
     */
    @JsonProperty(FIELD_CODELISTCONFIGMODE)
    public void setCodeListConfigMode(Integer codeListConfigMode){
        this.set(FIELD_CODELISTCONFIGMODE, codeListConfigMode);
    }
    
    /**
     * 获取 输出代码表模式  
     * @return
     */
    @JsonIgnore
    public Integer getCodeListConfigMode(){
        Object objValue = this.get(FIELD_CODELISTCONFIGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输出代码表模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeListConfigModeDirty(){
        if(this.contains(FIELD_CODELISTCONFIGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出代码表模式
     */
    @JsonIgnore
    public void resetCodeListConfigMode(){
        this.reset(FIELD_CODELISTCONFIGMODE);
    }

    /**
     * 设置 输出代码表模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDETreeNodeColDTO codelistconfigmode(Integer codeListConfigMode){
        this.setCodeListConfigMode(codeListConfigMode);
        return this;
    }

     /**
     * 设置 输出代码表模式，详细说明：{@link #FIELD_CODELISTCONFIGMODE}
     * <P>
     * 等同 {@link #setCodeListConfigMode}
     * @param codeListConfigMode
     */
    @JsonIgnore
    public PSDETreeNodeColDTO codelistconfigmode(net.ibizsys.model.PSModelEnums.OutputCodeListMode codeListConfigMode){
        if(codeListConfigMode == null){
            this.setCodeListConfigMode(null);
        }
        else{
            this.setCodeListConfigMode(codeListConfigMode.value);
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
    public PSDETreeNodeColDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
        return this;
    }

    /**
     * <B>CREATEDV</B>&nbsp;建立默认值，指定树表格编辑项的建立默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_CREATEDV = "createdv";

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * 
     * @param createDV
     * 
     */
    @JsonProperty(FIELD_CREATEDV)
    public void setCreateDV(String createDV){
        this.set(FIELD_CREATEDV, createDV);
    }
    
    /**
     * 获取 建立默认值  
     * @return
     */
    @JsonIgnore
    public String getCreateDV(){
        Object objValue = this.get(FIELD_CREATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVDirty(){
        if(this.contains(FIELD_CREATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立默认值
     */
    @JsonIgnore
    public void resetCreateDV(){
        this.reset(FIELD_CREATEDV);
    }

    /**
     * 设置 建立默认值，详细说明：{@link #FIELD_CREATEDV}
     * <P>
     * 等同 {@link #setCreateDV}
     * @param createDV
     */
    @JsonIgnore
    public PSDETreeNodeColDTO createdv(String createDV){
        this.setCreateDV(createDV);
        return this;
    }

    /**
     * <B>CREATEDVT</B>&nbsp;新建默认值类型，指定树表格编辑项的建立默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.CreateDefaultValueType} 
     */
    public final static String FIELD_CREATEDVT = "createdvt";

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * 
     * @param createDVT
     * 
     */
    @JsonProperty(FIELD_CREATEDVT)
    public void setCreateDVT(String createDVT){
        this.set(FIELD_CREATEDVT, createDVT);
    }
    
    /**
     * 获取 新建默认值类型  
     * @return
     */
    @JsonIgnore
    public String getCreateDVT(){
        Object objValue = this.get(FIELD_CREATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 新建默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateDVTDirty(){
        if(this.contains(FIELD_CREATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 新建默认值类型
     */
    @JsonIgnore
    public void resetCreateDVT(){
        this.reset(FIELD_CREATEDVT);
    }

    /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDETreeNodeColDTO createdvt(String createDVT){
        this.setCreateDVT(createDVT);
        return this;
    }

     /**
     * 设置 新建默认值类型，详细说明：{@link #FIELD_CREATEDVT}
     * <P>
     * 等同 {@link #setCreateDVT}
     * @param createDVT
     */
    @JsonIgnore
    public PSDETreeNodeColDTO createdvt(net.ibizsys.model.PSModelEnums.CreateDefaultValueType createDVT){
        if(createDVT == null){
            this.setCreateDVT(null);
        }
        else{
            this.setCreateDVT(createDVT.value);
        }
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
    public PSDETreeNodeColDTO createman(String createMan){
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
    public PSDETreeNodeColDTO customcode(String customCode){
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
    public PSDETreeNodeColDTO custommode(Integer customMode){
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
    public PSDETreeNodeColDTO custommode(Boolean customMode){
        if(customMode == null){
            this.setCustomMode(null);
        }
        else{
            this.setCustomMode(customMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值，指定树节点表格列的默认值，未定义时使用树表格列定义
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDETreeNodeColDTO defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>EDITORPARAMS</B>&nbsp;编辑器参数，指定树表格编辑项编辑器的参数
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_EDITORPARAMS = "editorparams";

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * 
     * @param editorParams
     * 
     */
    @JsonProperty(FIELD_EDITORPARAMS)
    public void setEditorParams(String editorParams){
        this.set(FIELD_EDITORPARAMS, editorParams);
    }
    
    /**
     * 获取 编辑器参数  
     * @return
     */
    @JsonIgnore
    public String getEditorParams(){
        Object objValue = this.get(FIELD_EDITORPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorParamsDirty(){
        if(this.contains(FIELD_EDITORPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器参数
     */
    @JsonIgnore
    public void resetEditorParams(){
        this.reset(FIELD_EDITORPARAMS);
    }

    /**
     * 设置 编辑器参数，详细说明：{@link #FIELD_EDITORPARAMS}
     * <P>
     * 等同 {@link #setEditorParams}
     * @param editorParams
     */
    @JsonIgnore
    public PSDETreeNodeColDTO editorparams(String editorParams){
        this.setEditorParams(editorParams);
        return this;
    }

    /**
     * <B>EDITORTYPE</B>&nbsp;编辑器类型，指定树表格编辑项编辑器的类型，未定义时使用引用属性界面模式的配置
     * <P>
     * 字符串：最大长度 40
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
    public PSDETreeNodeColDTO editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>ENABLECOND</B>&nbsp;启用条件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.EditItemEnableCond} 
     */
    public final static String FIELD_ENABLECOND = "enablecond";

    /**
     * 设置 启用条件
     * 
     * @param enableCond
     * 
     */
    @JsonProperty(FIELD_ENABLECOND)
    public void setEnableCond(Integer enableCond){
        this.set(FIELD_ENABLECOND, enableCond);
    }
    
    /**
     * 获取 启用条件  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCond(){
        Object objValue = this.get(FIELD_ENABLECOND);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCondDirty(){
        if(this.contains(FIELD_ENABLECOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用条件
     */
    @JsonIgnore
    public void resetEnableCond(){
        this.reset(FIELD_ENABLECOND);
    }

    /**
     * 设置 启用条件
     * <P>
     * 等同 {@link #setEnableCond}
     * @param enableCond
     */
    @JsonIgnore
    public PSDETreeNodeColDTO enablecond(Integer enableCond){
        this.setEnableCond(enableCond);
        return this;
    }

     /**
     * 设置 启用条件
     * <P>
     * 等同 {@link #setEnableCond}
     * @param enableCond
     */
    @JsonIgnore
    public PSDETreeNodeColDTO enablecond(net.ibizsys.model.PSModelEnums.EditItemEnableCond enableCond){
        if(enableCond == null){
            this.setEnableCond(null);
        }
        else{
            this.setEnableCond(enableCond.value);
        }
        return this;
    }

    /**
     * <B>ENABLEITEMPRIV</B>&nbsp;启用列权限控制，指定树节点数据项是否启用列权限控制，未定义时由数据项绑定的实体属性决定，无实体属性则为【否】
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
    public PSDETreeNodeColDTO enableitempriv(Integer enableItemPriv){
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
    public PSDETreeNodeColDTO enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEROWEDIT</B>&nbsp;支持行编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEROWEDIT = "enablerowedit";

    /**
     * 设置 支持行编辑
     * 
     * @param enableRowEdit
     * 
     */
    @JsonProperty(FIELD_ENABLEROWEDIT)
    public void setEnableRowEdit(Integer enableRowEdit){
        this.set(FIELD_ENABLEROWEDIT, enableRowEdit);
    }
    
    /**
     * 获取 支持行编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEnableRowEdit(){
        Object objValue = this.get(FIELD_ENABLEROWEDIT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持行编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableRowEditDirty(){
        if(this.contains(FIELD_ENABLEROWEDIT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持行编辑
     */
    @JsonIgnore
    public void resetEnableRowEdit(){
        this.reset(FIELD_ENABLEROWEDIT);
    }

    /**
     * 设置 支持行编辑
     * <P>
     * 等同 {@link #setEnableRowEdit}
     * @param enableRowEdit
     */
    @JsonIgnore
    public PSDETreeNodeColDTO enablerowedit(Integer enableRowEdit){
        this.setEnableRowEdit(enableRowEdit);
        return this;
    }

     /**
     * 设置 支持行编辑
     * <P>
     * 等同 {@link #setEnableRowEdit}
     * @param enableRowEdit
     */
    @JsonIgnore
    public PSDETreeNodeColDTO enablerowedit(Boolean enableRowEdit){
        if(enableRowEdit == null){
            this.setEnableRowEdit(null);
        }
        else{
            this.setEnableRowEdit(enableRowEdit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPITEM</B>&nbsp;分组项，指定树表格列的默认分组项，此配置为早期模板保留
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
    public PSDETreeNodeColDTO groupitem(String groupItem){
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
    public PSDETreeNodeColDTO groupitem(net.ibizsys.model.PSModelEnums.GridColGroupMode groupItem){
        if(groupItem == null){
            this.setGroupItem(null);
        }
        else{
            this.setGroupItem(groupItem.value);
        }
        return this;
    }

    /**
     * <B>HIDDENDATAITEM</B>&nbsp;隐藏数据项
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDDENDATAITEM = "hiddendataitem";

    /**
     * 设置 隐藏数据项
     * 
     * @param hiddenDataItem
     * 
     */
    @JsonProperty(FIELD_HIDDENDATAITEM)
    public void setHiddenDataItem(Integer hiddenDataItem){
        this.set(FIELD_HIDDENDATAITEM, hiddenDataItem);
    }
    
    /**
     * 获取 隐藏数据项  
     * @return
     */
    @JsonIgnore
    public Integer getHiddenDataItem(){
        Object objValue = this.get(FIELD_HIDDENDATAITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 隐藏数据项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHiddenDataItemDirty(){
        if(this.contains(FIELD_HIDDENDATAITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 隐藏数据项
     */
    @JsonIgnore
    public void resetHiddenDataItem(){
        this.reset(FIELD_HIDDENDATAITEM);
    }

    /**
     * 设置 隐藏数据项
     * <P>
     * 等同 {@link #setHiddenDataItem}
     * @param hiddenDataItem
     */
    @JsonIgnore
    public PSDETreeNodeColDTO hiddendataitem(Integer hiddenDataItem){
        this.setHiddenDataItem(hiddenDataItem);
        return this;
    }

     /**
     * 设置 隐藏数据项
     * <P>
     * 等同 {@link #setHiddenDataItem}
     * @param hiddenDataItem
     */
    @JsonIgnore
    public PSDETreeNodeColDTO hiddendataitem(Boolean hiddenDataItem){
        if(hiddenDataItem == null){
            this.setHiddenDataItem(null);
        }
        else{
            this.setHiddenDataItem(hiddenDataItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>IGNOREINPUT</B>&nbsp;忽略输入值
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.EditItemEnableCond} 
     */
    public final static String FIELD_IGNOREINPUT = "ignoreinput";

    /**
     * 设置 忽略输入值
     * 
     * @param ignoreInput
     * 
     */
    @JsonProperty(FIELD_IGNOREINPUT)
    public void setIgnoreInput(Integer ignoreInput){
        this.set(FIELD_IGNOREINPUT, ignoreInput);
    }
    
    /**
     * 获取 忽略输入值  
     * @return
     */
    @JsonIgnore
    public Integer getIgnoreInput(){
        Object objValue = this.get(FIELD_IGNOREINPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 忽略输入值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIgnoreInputDirty(){
        if(this.contains(FIELD_IGNOREINPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 忽略输入值
     */
    @JsonIgnore
    public void resetIgnoreInput(){
        this.reset(FIELD_IGNOREINPUT);
    }

    /**
     * 设置 忽略输入值
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDETreeNodeColDTO ignoreinput(Integer ignoreInput){
        this.setIgnoreInput(ignoreInput);
        return this;
    }

     /**
     * 设置 忽略输入值
     * <P>
     * 等同 {@link #setIgnoreInput}
     * @param ignoreInput
     */
    @JsonIgnore
    public PSDETreeNodeColDTO ignoreinput(net.ibizsys.model.PSModelEnums.EditItemEnableCond ignoreInput){
        if(ignoreInput == null){
            this.setIgnoreInput(null);
        }
        else{
            this.setIgnoreInput(ignoreInput.value);
        }
        return this;
    }

    /**
     * <B>LINKPSDEVIEWID</B>&nbsp;数据链接视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_LINKPSDEVIEWID = "linkpsdeviewid";

    /**
     * 设置 数据链接视图
     * 
     * @param linkPSDEViewId
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWID)
    public void setLinkPSDEViewId(String linkPSDEViewId){
        this.set(FIELD_LINKPSDEVIEWID, linkPSDEViewId);
    }
    
    /**
     * 获取 数据链接视图  
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
     * 判断 数据链接视图 是否指定值，包括空值
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
     * 重置 数据链接视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewId(){
        this.reset(FIELD_LINKPSDEVIEWID);
    }

    /**
     * 设置 数据链接视图
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param linkPSDEViewId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO linkpsdeviewid(String linkPSDEViewId){
        this.setLinkPSDEViewId(linkPSDEViewId);
        return this;
    }

    /**
     * 设置 数据链接视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setLinkPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO linkpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
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
     * <B>LINKPSDEVIEWNAME</B>&nbsp;数据链接视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_LINKPSDEVIEWID}
     */
    public final static String FIELD_LINKPSDEVIEWNAME = "linkpsdeviewname";

    /**
     * 设置 数据链接视图
     * 
     * @param linkPSDEViewName
     * 
     */
    @JsonProperty(FIELD_LINKPSDEVIEWNAME)
    public void setLinkPSDEViewName(String linkPSDEViewName){
        this.set(FIELD_LINKPSDEVIEWNAME, linkPSDEViewName);
    }
    
    /**
     * 获取 数据链接视图  
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
     * 判断 数据链接视图 是否指定值，包括空值
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
     * 重置 数据链接视图
     */
    @JsonIgnore
    public void resetLinkPSDEViewName(){
        this.reset(FIELD_LINKPSDEVIEWNAME);
    }

    /**
     * 设置 数据链接视图
     * <P>
     * 等同 {@link #setLinkPSDEViewName}
     * @param linkPSDEViewName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO linkpsdeviewname(String linkPSDEViewName){
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
    public PSDETreeNodeColDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NEEDCODELISTCONFIG</B>&nbsp;需要提供代码表配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_NEEDCODELISTCONFIG = "needcodelistconfig";

    /**
     * 设置 需要提供代码表配置
     * 
     * @param needCodeListConfig
     * 
     */
    @JsonProperty(FIELD_NEEDCODELISTCONFIG)
    public void setNeedCodeListConfig(Integer needCodeListConfig){
        this.set(FIELD_NEEDCODELISTCONFIG, needCodeListConfig);
    }
    
    /**
     * 获取 需要提供代码表配置  
     * @return
     */
    @JsonIgnore
    public Integer getNeedCodeListConfig(){
        Object objValue = this.get(FIELD_NEEDCODELISTCONFIG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 需要提供代码表配置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNeedCodeListConfigDirty(){
        if(this.contains(FIELD_NEEDCODELISTCONFIG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 需要提供代码表配置
     */
    @JsonIgnore
    public void resetNeedCodeListConfig(){
        this.reset(FIELD_NEEDCODELISTCONFIG);
    }

    /**
     * 设置 需要提供代码表配置
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDETreeNodeColDTO needcodelistconfig(Integer needCodeListConfig){
        this.setNeedCodeListConfig(needCodeListConfig);
        return this;
    }

     /**
     * 设置 需要提供代码表配置
     * <P>
     * 等同 {@link #setNeedCodeListConfig}
     * @param needCodeListConfig
     */
    @JsonIgnore
    public PSDETreeNodeColDTO needcodelistconfig(Boolean needCodeListConfig){
        if(needCodeListConfig == null){
            this.setNeedCodeListConfig(null);
        }
        else{
            this.setNeedCodeListConfig(needCodeListConfig?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWID</B>&nbsp;选择界面视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_PICKUPPSDEVIEWID = "pickuppsdeviewid";

    /**
     * 设置 选择界面视图
     * 
     * @param pickupPSDEViewId
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWID)
    public void setPickupPSDEViewId(String pickupPSDEViewId){
        this.set(FIELD_PICKUPPSDEVIEWID, pickupPSDEViewId);
    }
    
    /**
     * 获取 选择界面视图  
     * @return
     */
    @JsonIgnore
    public String getPickupPSDEViewId(){
        Object objValue = this.get(FIELD_PICKUPPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择界面视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupPSDEViewIdDirty(){
        if(this.contains(FIELD_PICKUPPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择界面视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewId(){
        this.reset(FIELD_PICKUPPSDEVIEWID);
    }

    /**
     * 设置 选择界面视图
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pickupPSDEViewId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pickuppsdeviewid(String pickupPSDEViewId){
        this.setPickupPSDEViewId(pickupPSDEViewId);
        return this;
    }

    /**
     * 设置 选择界面视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPickupPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pickuppsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPickupPSDEViewId(null);
            this.setPickupPSDEViewName(null);
        }
        else{
            this.setPickupPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setPickupPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWNAME</B>&nbsp;选择界面视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PICKUPPSDEVIEWID}
     */
    public final static String FIELD_PICKUPPSDEVIEWNAME = "pickuppsdeviewname";

    /**
     * 设置 选择界面视图
     * 
     * @param pickupPSDEViewName
     * 
     */
    @JsonProperty(FIELD_PICKUPPSDEVIEWNAME)
    public void setPickupPSDEViewName(String pickupPSDEViewName){
        this.set(FIELD_PICKUPPSDEVIEWNAME, pickupPSDEViewName);
    }
    
    /**
     * 获取 选择界面视图  
     * @return
     */
    @JsonIgnore
    public String getPickupPSDEViewName(){
        Object objValue = this.get(FIELD_PICKUPPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 选择界面视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPickupPSDEViewNameDirty(){
        if(this.contains(FIELD_PICKUPPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 选择界面视图
     */
    @JsonIgnore
    public void resetPickupPSDEViewName(){
        this.reset(FIELD_PICKUPPSDEVIEWNAME);
    }

    /**
     * 设置 选择界面视图
     * <P>
     * 等同 {@link #setPickupPSDEViewName}
     * @param pickupPSDEViewName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pickuppsdeviewname(String pickupPSDEViewName){
        this.setPickupPSDEViewName(pickupPSDEViewName);
        return this;
    }

    /**
     * <B>PLACEHOLDER</B>&nbsp;占位提示，指定树表格编辑项编辑器的占位提示信息
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
    public PSDETreeNodeColDTO placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定树节点数据项的代码表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
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
    public PSDETreeNodeColDTO pscodelistid(String pSCodeListId){
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
    public PSDETreeNodeColDTO pscodelistid(PSCodeListDTO pSCodeList){
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
     * <B>PSCODELISTNAME</B>&nbsp;系统代码表，指定树节点数据项的代码表对象
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
    public PSDETreeNodeColDTO pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定树节点数据项关联的实体属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSDETreeNodeColDTO psdefid(String pSDEFId){
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
    public PSDETreeNodeColDTO psdefid(PSDEFieldDTO pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定树节点数据项关联的实体属性对象
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
    public PSDETreeNodeColDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDETREECOLID</B>&nbsp;实体树表格列，指定树节点数据项相关的树视图表格列对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDETreeColDTO} 
     */
    public final static String FIELD_PSDETREECOLID = "psdetreecolid";

    /**
     * 设置 实体树表格列，详细说明：{@link #FIELD_PSDETREECOLID}
     * 
     * @param pSDETreeColId
     * 
     */
    @JsonProperty(FIELD_PSDETREECOLID)
    public void setPSDETreeColId(String pSDETreeColId){
        this.set(FIELD_PSDETREECOLID, pSDETreeColId);
    }
    
    /**
     * 获取 实体树表格列  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeColId(){
        Object objValue = this.get(FIELD_PSDETREECOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树表格列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeColIdDirty(){
        if(this.contains(FIELD_PSDETREECOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树表格列
     */
    @JsonIgnore
    public void resetPSDETreeColId(){
        this.reset(FIELD_PSDETREECOLID);
    }

    /**
     * 设置 实体树表格列，详细说明：{@link #FIELD_PSDETREECOLID}
     * <P>
     * 等同 {@link #setPSDETreeColId}
     * @param pSDETreeColId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreecolid(String pSDETreeColId){
        this.setPSDETreeColId(pSDETreeColId);
        return this;
    }

    /**
     * 设置 实体树表格列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeColId}
     * @param pSDETreeCol 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreecolid(PSDETreeColDTO pSDETreeCol){
        if(pSDETreeCol == null){
            this.setPSDETreeColId(null);
            this.setPSDETreeColName(null);
        }
        else{
            this.setPSDETreeColId(pSDETreeCol.getPSDETreeColId());
            this.setPSDETreeColName(pSDETreeCol.getPSDETreeColName());
        }
        return this;
    }

    /**
     * <B>PSDETREECOLNAME</B>&nbsp;实体树表格列，指定树节点数据项相关的树视图表格列对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREECOLID}
     */
    public final static String FIELD_PSDETREECOLNAME = "psdetreecolname";

    /**
     * 设置 实体树表格列，详细说明：{@link #FIELD_PSDETREECOLNAME}
     * 
     * @param pSDETreeColName
     * 
     */
    @JsonProperty(FIELD_PSDETREECOLNAME)
    public void setPSDETreeColName(String pSDETreeColName){
        this.set(FIELD_PSDETREECOLNAME, pSDETreeColName);
    }
    
    /**
     * 获取 实体树表格列  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeColName(){
        Object objValue = this.get(FIELD_PSDETREECOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树表格列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeColNameDirty(){
        if(this.contains(FIELD_PSDETREECOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树表格列
     */
    @JsonIgnore
    public void resetPSDETreeColName(){
        this.reset(FIELD_PSDETREECOLNAME);
    }

    /**
     * 设置 实体树表格列，详细说明：{@link #FIELD_PSDETREECOLNAME}
     * <P>
     * 等同 {@link #setPSDETreeColName}
     * @param pSDETreeColName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreecolname(String pSDETreeColName){
        this.setPSDETreeColName(pSDETreeColName);
        return this;
    }

    /**
     * <B>PSDETREENODECOLID</B>&nbsp;树节点表格列标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETREENODECOLID = "psdetreenodecolid";

    /**
     * 设置 树节点表格列标识
     * 
     * @param pSDETreeNodeColId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODECOLID)
    public void setPSDETreeNodeColId(String pSDETreeNodeColId){
        this.set(FIELD_PSDETREENODECOLID, pSDETreeNodeColId);
    }
    
    /**
     * 获取 树节点表格列标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeColId(){
        Object objValue = this.get(FIELD_PSDETREENODECOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点表格列标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeColIdDirty(){
        if(this.contains(FIELD_PSDETREENODECOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点表格列标识
     */
    @JsonIgnore
    public void resetPSDETreeNodeColId(){
        this.reset(FIELD_PSDETREENODECOLID);
    }

    /**
     * 设置 树节点表格列标识
     * <P>
     * 等同 {@link #setPSDETreeNodeColId}
     * @param pSDETreeNodeColId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodecolid(String pSDETreeNodeColId){
        this.setPSDETreeNodeColId(pSDETreeNodeColId);
        return this;
    }

    /**
     * <B>PSDETREENODECOLNAME</B>&nbsp;节点数据项名称，指定树节点数据项的标识，需在所在树节点具备唯一性
     * <P>
     * 字符串：最大长度 20，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDETREENODECOLNAME = "psdetreenodecolname";

    /**
     * 设置 节点数据项名称，详细说明：{@link #FIELD_PSDETREENODECOLNAME}
     * 
     * @param pSDETreeNodeColName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODECOLNAME)
    public void setPSDETreeNodeColName(String pSDETreeNodeColName){
        this.set(FIELD_PSDETREENODECOLNAME, pSDETreeNodeColName);
    }
    
    /**
     * 获取 节点数据项名称  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeColName(){
        Object objValue = this.get(FIELD_PSDETREENODECOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点数据项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeColNameDirty(){
        if(this.contains(FIELD_PSDETREENODECOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点数据项名称
     */
    @JsonIgnore
    public void resetPSDETreeNodeColName(){
        this.reset(FIELD_PSDETREENODECOLNAME);
    }

    /**
     * 设置 节点数据项名称，详细说明：{@link #FIELD_PSDETREENODECOLNAME}
     * <P>
     * 等同 {@link #setPSDETreeNodeColName}
     * @param pSDETreeNodeColName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodecolname(String pSDETreeNodeColName){
        this.setPSDETreeNodeColName(pSDETreeNodeColName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeNodeColName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeNodeColName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO name(String strName){
        this.setPSDETreeNodeColName(strName);
        return this;
    }

    /**
     * <B>PSDETREENODEID</B>&nbsp;实体树节点，指定树节点数据项所在的树节点对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO} 
     */
    public final static String FIELD_PSDETREENODEID = "psdetreenodeid";

    /**
     * 设置 实体树节点，详细说明：{@link #FIELD_PSDETREENODEID}
     * 
     * @param pSDETreeNodeId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODEID)
    public void setPSDETreeNodeId(String pSDETreeNodeId){
        this.set(FIELD_PSDETREENODEID, pSDETreeNodeId);
    }
    
    /**
     * 获取 实体树节点  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeId(){
        Object objValue = this.get(FIELD_PSDETREENODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty(){
        if(this.contains(FIELD_PSDETREENODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树节点
     */
    @JsonIgnore
    public void resetPSDETreeNodeId(){
        this.reset(FIELD_PSDETREENODEID);
    }

    /**
     * 设置 实体树节点，详细说明：{@link #FIELD_PSDETREENODEID}
     * <P>
     * 等同 {@link #setPSDETreeNodeId}
     * @param pSDETreeNodeId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodeid(String pSDETreeNodeId){
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    /**
     * 设置 实体树节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeNodeId}
     * @param pSDETreeNode 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodeid(PSDETreeNodeDTO pSDETreeNode){
        if(pSDETreeNode == null){
            this.setPSDETreeNodeId(null);
            this.setPSDETreeNodeName(null);
        }
        else{
            this.setPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    /**
     * <B>PSDETREENODENAME</B>&nbsp;实体树节点，指定树节点数据项所在的树节点对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREENODEID}
     */
    public final static String FIELD_PSDETREENODENAME = "psdetreenodename";

    /**
     * 设置 实体树节点，详细说明：{@link #FIELD_PSDETREENODENAME}
     * 
     * @param pSDETreeNodeName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODENAME)
    public void setPSDETreeNodeName(String pSDETreeNodeName){
        this.set(FIELD_PSDETREENODENAME, pSDETreeNodeName);
    }
    
    /**
     * 获取 实体树节点  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeName(){
        Object objValue = this.get(FIELD_PSDETREENODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeNameDirty(){
        if(this.contains(FIELD_PSDETREENODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树节点
     */
    @JsonIgnore
    public void resetPSDETreeNodeName(){
        this.reset(FIELD_PSDETREENODENAME);
    }

    /**
     * 设置 实体树节点，详细说明：{@link #FIELD_PSDETREENODENAME}
     * <P>
     * 等同 {@link #setPSDETreeNodeName}
     * @param pSDETreeNodeName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreenodename(String pSDETreeNodeName){
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，指定树节点数据项所在的树视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDETreeViewDTO} 
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 实体树视图  
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
     * 判断 实体树视图 是否指定值，包括空值
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
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWID}
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * 设置 实体树视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeView 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreeviewid(PSDETreeViewDTO pSDETreeView){
        if(pSDETreeView == null){
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        }
        else{
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树视图，指定树节点数据项所在的树视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREEVIEWID}
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 实体树视图  
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
     * 判断 实体树视图 是否指定值，包括空值
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
     * 重置 实体树视图
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 实体树视图，详细说明：{@link #FIELD_PSDETREEVIEWNAME}
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSSYSDICTCATID</B>&nbsp;输入词条类别
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDictCatDTO} 
     */
    public final static String FIELD_PSSYSDICTCATID = "pssysdictcatid";

    /**
     * 设置 输入词条类别
     * 
     * @param pSSysDictCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATID)
    public void setPSSysDictCatId(String pSSysDictCatId){
        this.set(FIELD_PSSYSDICTCATID, pSSysDictCatId);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatId(){
        Object objValue = this.get(FIELD_PSSYSDICTCATID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatIdDirty(){
        if(this.contains(FIELD_PSSYSDICTCATID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatId(){
        this.reset(FIELD_PSSYSDICTCATID);
    }

    /**
     * 设置 输入词条类别
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCatId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pssysdictcatid(String pSSysDictCatId){
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    /**
     * 设置 输入词条类别，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCat 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pssysdictcatid(PSSysDictCatDTO pSSysDictCat){
        if(pSSysDictCat == null){
            this.setPSSysDictCatId(null);
            this.setPSSysDictCatName(null);
        }
        else{
            this.setPSSysDictCatId(pSSysDictCat.getPSSysDictCatId());
            this.setPSSysDictCatName(pSSysDictCat.getPSSysDictCatName());
        }
        return this;
    }

    /**
     * <B>PSSYSDICTCATNAME</B>&nbsp;输入词条类别
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDICTCATID}
     */
    public final static String FIELD_PSSYSDICTCATNAME = "pssysdictcatname";

    /**
     * 设置 输入词条类别
     * 
     * @param pSSysDictCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATNAME)
    public void setPSSysDictCatName(String pSSysDictCatName){
        this.set(FIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }
    
    /**
     * 获取 输入词条类别  
     * @return
     */
    @JsonIgnore
    public String getPSSysDictCatName(){
        Object objValue = this.get(FIELD_PSSYSDICTCATNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入词条类别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDictCatNameDirty(){
        if(this.contains(FIELD_PSSYSDICTCATNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入词条类别
     */
    @JsonIgnore
    public void resetPSSysDictCatName(){
        this.reset(FIELD_PSSYSDICTCATNAME);
    }

    /**
     * 设置 输入词条类别
     * <P>
     * 等同 {@link #setPSSysDictCatName}
     * @param pSSysDictCatName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pssysdictcatname(String pSSysDictCatName){
        this.setPSSysDictCatName(pSSysDictCatName);
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
    public PSDETreeNodeColDTO pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDETreeNodeColDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
    public PSDETreeNodeColDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;编辑器样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEditorStyleDTO} 
     */
    public final static String FIELD_PSSYSEDITORSTYLEID = "pssyseditorstyleid";

    /**
     * 设置 编辑器样式
     * 
     * @param pSSysEditorStyleId
     * 
     */
    @JsonProperty(FIELD_PSSYSEDITORSTYLEID)
    public void setPSSysEditorStyleId(String pSSysEditorStyleId){
        this.set(FIELD_PSSYSEDITORSTYLEID, pSSysEditorStyleId);
    }
    
    /**
     * 获取 编辑器样式  
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
     * 判断 编辑器样式 是否指定值，包括空值
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
     * 重置 编辑器样式
     */
    @JsonIgnore
    public void resetPSSysEditorStyleId(){
        this.reset(FIELD_PSSYSEDITORSTYLEID);
    }

    /**
     * 设置 编辑器样式
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyleId
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pssyseditorstyleid(String pSSysEditorStyleId){
        this.setPSSysEditorStyleId(pSSysEditorStyleId);
        return this;
    }

    /**
     * 设置 编辑器样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEditorStyleId}
     * @param pSSysEditorStyle 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pssyseditorstyleid(PSSysEditorStyleDTO pSSysEditorStyle){
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
     * <B>PSSYSEDITORSTYLENAME</B>&nbsp;编辑器样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEDITORSTYLEID}
     */
    public final static String FIELD_PSSYSEDITORSTYLENAME = "pssyseditorstylename";

    /**
     * 设置 编辑器样式
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
     * 设置 编辑器样式
     * <P>
     * 等同 {@link #setPSSysEditorStyleName}
     * @param pSSysEditorStyleName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>RESETITEMNAME</B>&nbsp;重置项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_RESETITEMNAME = "resetitemname";

    /**
     * 设置 重置项名称
     * 
     * @param resetItemName
     * 
     */
    @JsonProperty(FIELD_RESETITEMNAME)
    public void setResetItemName(String resetItemName){
        this.set(FIELD_RESETITEMNAME, resetItemName);
    }
    
    /**
     * 获取 重置项名称  
     * @return
     */
    @JsonIgnore
    public String getResetItemName(){
        Object objValue = this.get(FIELD_RESETITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 重置项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResetItemNameDirty(){
        if(this.contains(FIELD_RESETITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 重置项名称
     */
    @JsonIgnore
    public void resetResetItemName(){
        this.reset(FIELD_RESETITEMNAME);
    }

    /**
     * 设置 重置项名称
     * <P>
     * 等同 {@link #setResetItemName}
     * @param resetItemName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO resetitemname(String resetItemName){
        this.setResetItemName(resetItemName);
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
    public PSDETreeNodeColDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>UPDATEDV</B>&nbsp;更新默认值，指定树表格编辑项的更新默认值，未指定默认值类型时按直接值处理
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_UPDATEDV = "updatedv";

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * 
     * @param updateDV
     * 
     */
    @JsonProperty(FIELD_UPDATEDV)
    public void setUpdateDV(String updateDV){
        this.set(FIELD_UPDATEDV, updateDV);
    }
    
    /**
     * 获取 更新默认值  
     * @return
     */
    @JsonIgnore
    public String getUpdateDV(){
        Object objValue = this.get(FIELD_UPDATEDV);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVDirty(){
        if(this.contains(FIELD_UPDATEDV)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值
     */
    @JsonIgnore
    public void resetUpdateDV(){
        this.reset(FIELD_UPDATEDV);
    }

    /**
     * 设置 更新默认值，详细说明：{@link #FIELD_UPDATEDV}
     * <P>
     * 等同 {@link #setUpdateDV}
     * @param updateDV
     */
    @JsonIgnore
    public PSDETreeNodeColDTO updatedv(String updateDV){
        this.setUpdateDV(updateDV);
        return this;
    }

    /**
     * <B>UPDATEDVT</B>&nbsp;更新默认值类型，指定树表格编辑项的更新默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.UpdateDefaultValueType} 
     */
    public final static String FIELD_UPDATEDVT = "updatedvt";

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * 
     * @param updateDVT
     * 
     */
    @JsonProperty(FIELD_UPDATEDVT)
    public void setUpdateDVT(String updateDVT){
        this.set(FIELD_UPDATEDVT, updateDVT);
    }
    
    /**
     * 获取 更新默认值类型  
     * @return
     */
    @JsonIgnore
    public String getUpdateDVT(){
        Object objValue = this.get(FIELD_UPDATEDVT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新默认值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUpdateDVTDirty(){
        if(this.contains(FIELD_UPDATEDVT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新默认值类型
     */
    @JsonIgnore
    public void resetUpdateDVT(){
        this.reset(FIELD_UPDATEDVT);
    }

    /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDETreeNodeColDTO updatedvt(String updateDVT){
        this.setUpdateDVT(updateDVT);
        return this;
    }

     /**
     * 设置 更新默认值类型，详细说明：{@link #FIELD_UPDATEDVT}
     * <P>
     * 等同 {@link #setUpdateDVT}
     * @param updateDVT
     */
    @JsonIgnore
    public PSDETreeNodeColDTO updatedvt(net.ibizsys.model.PSModelEnums.UpdateDefaultValueType updateDVT){
        if(updateDVT == null){
            this.setUpdateDVT(null);
        }
        else{
            this.setUpdateDVT(updateDVT.value);
        }
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
    public PSDETreeNodeColDTO updateman(String updateMan){
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
    public PSDETreeNodeColDTO usercat(String userCat){
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
    public PSDETreeNodeColDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 100
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
    public PSDETreeNodeColDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDETreeNodeColDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALUEFORMAT</B>&nbsp;值格式化，指定树节点数据项的值格式化串
     * <P>
     * 字符串：最大长度 200
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
    public PSDETreeNodeColDTO valueformat(String valueFormat){
        this.setValueFormat(valueFormat);
        return this;
    }

    /**
     * <B>VALUEITEMNAME</B>&nbsp;值项名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VALUEITEMNAME = "valueitemname";

    /**
     * 设置 值项名称
     * 
     * @param valueItemName
     * 
     */
    @JsonProperty(FIELD_VALUEITEMNAME)
    public void setValueItemName(String valueItemName){
        this.set(FIELD_VALUEITEMNAME, valueItemName);
    }
    
    /**
     * 获取 值项名称  
     * @return
     */
    @JsonIgnore
    public String getValueItemName(){
        Object objValue = this.get(FIELD_VALUEITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueItemNameDirty(){
        if(this.contains(FIELD_VALUEITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值项名称
     */
    @JsonIgnore
    public void resetValueItemName(){
        this.reset(FIELD_VALUEITEMNAME);
    }

    /**
     * 设置 值项名称
     * <P>
     * 等同 {@link #setValueItemName}
     * @param valueItemName
     */
    @JsonIgnore
    public PSDETreeNodeColDTO valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDETreeNodeColId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDETreeNodeColId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDETreeNodeColId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETreeNodeColId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeColDTO id(String strValue){
        this.setPSDETreeNodeColId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDETreeNodeColDTO){
            PSDETreeNodeColDTO dto = (PSDETreeNodeColDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
