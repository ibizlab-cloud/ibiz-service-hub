package net.ibizsys.psmodel.core.domain;

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
public class PSDETreeNodeCol extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETreeNodeCol(){
    }      

    /**
     * <B>ALLOWEMPTY</B>&nbsp;允许空输入，指定树表格编辑项是否允许空输入，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDETreeNodeCol allowempty(Integer allowEmpty){
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
    public PSDETreeNodeCol allowempty(Boolean allowEmpty){
        if(allowEmpty == null){
            this.setAllowEmpty(null);
        }
        else{
            this.setAllowEmpty(allowEmpty?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CELLPSSYSCSSID</B>&nbsp;单元格样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCss} 
     */
    public final static String FIELD_CELLPSSYSCSSID = "cellpssyscssid";

    /**
     * 设置 单元格样式
     * 
     * @param cellPSSysCssId
     * 
     */
    @JsonProperty(FIELD_CELLPSSYSCSSID)
    public void setCellPSSysCssId(String cellPSSysCssId){
        this.set(FIELD_CELLPSSYSCSSID, cellPSSysCssId);
    }
    
    /**
     * 获取 单元格样式  
     * @return
     */
    @JsonIgnore
    public String getCellPSSysCssId(){
        Object objValue = this.get(FIELD_CELLPSSYSCSSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单元格样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCellPSSysCssIdDirty(){
        if(this.contains(FIELD_CELLPSSYSCSSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单元格样式
     */
    @JsonIgnore
    public void resetCellPSSysCssId(){
        this.reset(FIELD_CELLPSSYSCSSID);
    }

    /**
     * 设置 单元格样式
     * <P>
     * 等同 {@link #setCellPSSysCssId}
     * @param cellPSSysCssId
     */
    @JsonIgnore
    public PSDETreeNodeCol cellpssyscssid(String cellPSSysCssId){
        this.setCellPSSysCssId(cellPSSysCssId);
        return this;
    }

    /**
     * 设置 单元格样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCellPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeCol cellpssyscssid(PSSysCss pSSysCss){
        if(pSSysCss == null){
            this.setCellPSSysCssId(null);
            this.setCellPSSysCssName(null);
        }
        else{
            this.setCellPSSysCssId(pSSysCss.getPSSysCssId());
            this.setCellPSSysCssName(pSSysCss.getPSSysCssName());
        }
        return this;
    }

    /**
     * <B>CELLPSSYSCSSNAME</B>&nbsp;单元格样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CELLPSSYSCSSID}
     */
    public final static String FIELD_CELLPSSYSCSSNAME = "cellpssyscssname";

    /**
     * 设置 单元格样式
     * 
     * @param cellPSSysCssName
     * 
     */
    @JsonProperty(FIELD_CELLPSSYSCSSNAME)
    public void setCellPSSysCssName(String cellPSSysCssName){
        this.set(FIELD_CELLPSSYSCSSNAME, cellPSSysCssName);
    }
    
    /**
     * 获取 单元格样式  
     * @return
     */
    @JsonIgnore
    public String getCellPSSysCssName(){
        Object objValue = this.get(FIELD_CELLPSSYSCSSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 单元格样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCellPSSysCssNameDirty(){
        if(this.contains(FIELD_CELLPSSYSCSSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 单元格样式
     */
    @JsonIgnore
    public void resetCellPSSysCssName(){
        this.reset(FIELD_CELLPSSYSCSSNAME);
    }

    /**
     * 设置 单元格样式
     * <P>
     * 等同 {@link #setCellPSSysCssName}
     * @param cellPSSysCssName
     */
    @JsonIgnore
    public PSDETreeNodeCol cellpssyscssname(String cellPSSysCssName){
        this.setCellPSSysCssName(cellPSSysCssName);
        return this;
    }

    /**
     * <B>CLCONVERTMODE</B>&nbsp;代码值转换模式，指定树表格数据项的代码值转换模式，未定义时为【前台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode} 
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
    public PSDETreeNodeCol clconvertmode(String cLConvertMode){
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
    public PSDETreeNodeCol clconvertmode(net.ibizsys.psmodel.core.util.PSModelEnums.CodeListConvertMode cLConvertMode){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode} 
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
    public PSDETreeNodeCol codelistconfigmode(Integer codeListConfigMode){
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
    public PSDETreeNodeCol codelistconfigmode(net.ibizsys.psmodel.core.util.PSModelEnums.OutputCodeListMode codeListConfigMode){
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
    public PSDETreeNodeCol createdate(String createDate){
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
    public PSDETreeNodeCol createdv(String createDV){
        this.setCreateDV(createDV);
        return this;
    }

    /**
     * <B>CREATEDVT</B>&nbsp;新建默认值类型，指定树表格编辑项的建立默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType} 
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
    public PSDETreeNodeCol createdvt(String createDVT){
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
    public PSDETreeNodeCol createdvt(net.ibizsys.psmodel.core.util.PSModelEnums.CreateDefaultValueType createDVT){
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
    public PSDETreeNodeCol createman(String createMan){
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
    public PSDETreeNodeCol customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>CUSTOMMODE</B>&nbsp;脚本代码模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDETreeNodeCol custommode(Integer customMode){
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
    public PSDETreeNodeCol custommode(Boolean customMode){
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
    public PSDETreeNodeCol defaultvalue(String defaultValue){
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
    public PSDETreeNodeCol editorparams(String editorParams){
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
    public PSDETreeNodeCol editortype(String editorType){
        this.setEditorType(editorType);
        return this;
    }

    /**
     * <B>ENABLECOND</B>&nbsp;启用条件
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond} 
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
    public PSDETreeNodeCol enablecond(Integer enableCond){
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
    public PSDETreeNodeCol enablecond(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond enableCond){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDETreeNodeCol enableitempriv(Integer enableItemPriv){
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
    public PSDETreeNodeCol enableitempriv(Boolean enableItemPriv){
        if(enableItemPriv == null){
            this.setEnableItemPriv(null);
        }
        else{
            this.setEnableItemPriv(enableItemPriv?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLELINK</B>&nbsp;启用链接
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode} 
     */
    public final static String FIELD_ENABLELINK = "enablelink";

    /**
     * 设置 启用链接
     * 
     * @param enableLink
     * 
     */
    @JsonProperty(FIELD_ENABLELINK)
    public void setEnableLink(Integer enableLink){
        this.set(FIELD_ENABLELINK, enableLink);
    }
    
    /**
     * 获取 启用链接  
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
     * 判断 启用链接 是否指定值，包括空值
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
     * 重置 启用链接
     */
    @JsonIgnore
    public void resetEnableLink(){
        this.reset(FIELD_ENABLELINK);
    }

    /**
     * 设置 启用链接
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDETreeNodeCol enablelink(Integer enableLink){
        this.setEnableLink(enableLink);
        return this;
    }

     /**
     * 设置 启用链接
     * <P>
     * 等同 {@link #setEnableLink}
     * @param enableLink
     */
    @JsonIgnore
    public PSDETreeNodeCol enablelink(net.ibizsys.psmodel.core.util.PSModelEnums.DEGridColLinkMode enableLink){
        if(enableLink == null){
            this.setEnableLink(null);
        }
        else{
            this.setEnableLink(enableLink.value);
        }
        return this;
    }

    /**
     * <B>ENABLEROWEDIT</B>&nbsp;支持行编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDETreeNodeCol enablerowedit(Integer enableRowEdit){
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
    public PSDETreeNodeCol enablerowedit(Boolean enableRowEdit){
        if(enableRowEdit == null){
            this.setEnableRowEdit(null);
        }
        else{
            this.setEnableRowEdit(enableRowEdit?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GCRPSSYSPFPLUGINID</B>&nbsp;表格列绘制器插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysPFPlugin} 
     */
    public final static String FIELD_GCRPSSYSPFPLUGINID = "gcrpssyspfpluginid";

    /**
     * 设置 表格列绘制器插件
     * 
     * @param gCRPSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_GCRPSSYSPFPLUGINID)
    public void setGCRPSSysPFPluginId(String gCRPSSysPFPluginId){
        this.set(FIELD_GCRPSSYSPFPLUGINID, gCRPSSysPFPluginId);
    }
    
    /**
     * 获取 表格列绘制器插件  
     * @return
     */
    @JsonIgnore
    public String getGCRPSSysPFPluginId(){
        Object objValue = this.get(FIELD_GCRPSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列绘制器插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCRPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_GCRPSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列绘制器插件
     */
    @JsonIgnore
    public void resetGCRPSSysPFPluginId(){
        this.reset(FIELD_GCRPSSYSPFPLUGINID);
    }

    /**
     * 设置 表格列绘制器插件
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginId}
     * @param gCRPSSysPFPluginId
     */
    @JsonIgnore
    public PSDETreeNodeCol gcrpssyspfpluginid(String gCRPSSysPFPluginId){
        this.setGCRPSSysPFPluginId(gCRPSSysPFPluginId);
        return this;
    }

    /**
     * 设置 表格列绘制器插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeCol gcrpssyspfpluginid(PSSysPFPlugin pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setGCRPSSysPFPluginId(null);
            this.setGCRPSSysPFPluginName(null);
        }
        else{
            this.setGCRPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setGCRPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>GCRPSSYSPFPLUGINNAME</B>&nbsp;表格列绘制器插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GCRPSSYSPFPLUGINID}
     */
    public final static String FIELD_GCRPSSYSPFPLUGINNAME = "gcrpssyspfpluginname";

    /**
     * 设置 表格列绘制器插件
     * 
     * @param gCRPSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_GCRPSSYSPFPLUGINNAME)
    public void setGCRPSSysPFPluginName(String gCRPSSysPFPluginName){
        this.set(FIELD_GCRPSSYSPFPLUGINNAME, gCRPSSysPFPluginName);
    }
    
    /**
     * 获取 表格列绘制器插件  
     * @return
     */
    @JsonIgnore
    public String getGCRPSSysPFPluginName(){
        Object objValue = this.get(FIELD_GCRPSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列绘制器插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCRPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_GCRPSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列绘制器插件
     */
    @JsonIgnore
    public void resetGCRPSSysPFPluginName(){
        this.reset(FIELD_GCRPSSYSPFPLUGINNAME);
    }

    /**
     * 设置 表格列绘制器插件
     * <P>
     * 等同 {@link #setGCRPSSysPFPluginName}
     * @param gCRPSSysPFPluginName
     */
    @JsonIgnore
    public PSDETreeNodeCol gcrpssyspfpluginname(String gCRPSSysPFPluginName){
        this.setGCRPSSysPFPluginName(gCRPSSysPFPluginName);
        return this;
    }

    /**
     * <B>GRIDCOLSTYLE</B>&nbsp;表格列样式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColStype} 
     */
    public final static String FIELD_GRIDCOLSTYLE = "gridcolstyle";

    /**
     * 设置 表格列样式
     * 
     * @param gridColStyle
     * 
     */
    @JsonProperty(FIELD_GRIDCOLSTYLE)
    public void setGridColStyle(String gridColStyle){
        this.set(FIELD_GRIDCOLSTYLE, gridColStyle);
    }
    
    /**
     * 获取 表格列样式  
     * @return
     */
    @JsonIgnore
    public String getGridColStyle(){
        Object objValue = this.get(FIELD_GRIDCOLSTYLE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColStyleDirty(){
        if(this.contains(FIELD_GRIDCOLSTYLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列样式
     */
    @JsonIgnore
    public void resetGridColStyle(){
        this.reset(FIELD_GRIDCOLSTYLE);
    }

    /**
     * 设置 表格列样式
     * <P>
     * 等同 {@link #setGridColStyle}
     * @param gridColStyle
     */
    @JsonIgnore
    public PSDETreeNodeCol gridcolstyle(String gridColStyle){
        this.setGridColStyle(gridColStyle);
        return this;
    }

     /**
     * 设置 表格列样式
     * <P>
     * 等同 {@link #setGridColStyle}
     * @param gridColStyle
     */
    @JsonIgnore
    public PSDETreeNodeCol gridcolstyle(net.ibizsys.psmodel.core.util.PSModelEnums.GridColStype gridColStyle){
        if(gridColStyle == null){
            this.setGridColStyle(null);
        }
        else{
            this.setGridColStyle(gridColStyle.value);
        }
        return this;
    }

    /**
     * <B>GRIDCOLTYPE</B>&nbsp;表格列类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TreeColType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREECOLID}
     */
    public final static String FIELD_GRIDCOLTYPE = "gridcoltype";

    /**
     * 设置 表格列类型
     * 
     * @param gridColType
     * 
     */
    @JsonProperty(FIELD_GRIDCOLTYPE)
    public void setGridColType(String gridColType){
        this.set(FIELD_GRIDCOLTYPE, gridColType);
    }
    
    /**
     * 获取 表格列类型  
     * @return
     */
    @JsonIgnore
    public String getGridColType(){
        Object objValue = this.get(FIELD_GRIDCOLTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格列类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGridColTypeDirty(){
        if(this.contains(FIELD_GRIDCOLTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列类型
     */
    @JsonIgnore
    public void resetGridColType(){
        this.reset(FIELD_GRIDCOLTYPE);
    }

    /**
     * 设置 表格列类型
     * <P>
     * 等同 {@link #setGridColType}
     * @param gridColType
     */
    @JsonIgnore
    public PSDETreeNodeCol gridcoltype(String gridColType){
        this.setGridColType(gridColType);
        return this;
    }

    /**
     * <B>GROUPITEM</B>&nbsp;分组项，指定树表格列的默认分组项，此配置为早期模板保留
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GridColGroupMode} 
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
    public PSDETreeNodeCol groupitem(String groupItem){
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
    public PSDETreeNodeCol groupitem(net.ibizsys.psmodel.core.util.PSModelEnums.GridColGroupMode groupItem){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDETreeNodeCol hiddendataitem(Integer hiddenDataItem){
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
    public PSDETreeNodeCol hiddendataitem(Boolean hiddenDataItem){
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
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond} 
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
    public PSDETreeNodeCol ignoreinput(Integer ignoreInput){
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
    public PSDETreeNodeCol ignoreinput(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemEnableCond ignoreInput){
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
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
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
    public PSDETreeNodeCol linkpsdeviewid(String linkPSDEViewId){
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
    public PSDETreeNodeCol linkpsdeviewid(PSDEViewBase pSDEViewBase){
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
    public PSDETreeNodeCol linkpsdeviewname(String linkPSDEViewName){
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
    public PSDETreeNodeCol memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NEEDCODELISTCONFIG</B>&nbsp;需要提供代码表配置
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDETreeNodeCol needcodelistconfig(Integer needCodeListConfig){
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
    public PSDETreeNodeCol needcodelistconfig(Boolean needCodeListConfig){
        if(needCodeListConfig == null){
            this.setNeedCodeListConfig(null);
        }
        else{
            this.setNeedCodeListConfig(needCodeListConfig?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>NOPRIVDM</B>&nbsp;无权限显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode} 
     */
    public final static String FIELD_NOPRIVDM = "noprivdm";

    /**
     * 设置 无权限显示模式
     * 
     * @param noPrivDM
     * 
     */
    @JsonProperty(FIELD_NOPRIVDM)
    public void setNoPrivDM(Integer noPrivDM){
        this.set(FIELD_NOPRIVDM, noPrivDM);
    }
    
    /**
     * 获取 无权限显示模式  
     * @return
     */
    @JsonIgnore
    public Integer getNoPrivDM(){
        Object objValue = this.get(FIELD_NOPRIVDM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 无权限显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNoPrivDMDirty(){
        if(this.contains(FIELD_NOPRIVDM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 无权限显示模式
     */
    @JsonIgnore
    public void resetNoPrivDM(){
        this.reset(FIELD_NOPRIVDM);
    }

    /**
     * 设置 无权限显示模式
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDETreeNodeCol noprivdm(Integer noPrivDM){
        this.setNoPrivDM(noPrivDM);
        return this;
    }

     /**
     * 设置 无权限显示模式
     * <P>
     * 等同 {@link #setNoPrivDM}
     * @param noPrivDM
     */
    @JsonIgnore
    public PSDETreeNodeCol noprivdm(net.ibizsys.psmodel.core.util.PSModelEnums.NoPrivDisplayMode noPrivDM){
        if(noPrivDM == null){
            this.setNoPrivDM(null);
        }
        else{
            this.setNoPrivDM(noPrivDM.value);
        }
        return this;
    }

    /**
     * <B>PICKUPPSDEVIEWID</B>&nbsp;选择界面视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
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
    public PSDETreeNodeCol pickuppsdeviewid(String pickupPSDEViewId){
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
    public PSDETreeNodeCol pickuppsdeviewid(PSDEViewBase pSDEViewBase){
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
    public PSDETreeNodeCol pickuppsdeviewname(String pickupPSDEViewName){
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
    public PSDETreeNodeCol placeholder(String placeHolder){
        this.setPlaceHolder(placeHolder);
        return this;
    }

    /**
     * <B>PSCODELISTID</B>&nbsp;系统代码表，指定树节点数据项的代码表对象
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
    public PSDETreeNodeCol pscodelistid(String pSCodeListId){
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
    public PSDETreeNodeCol pscodelistid(PSCodeList pSCodeList){
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
    public PSDETreeNodeCol pscodelistname(String pSCodeListName){
        this.setPSCodeListName(pSCodeListName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定树节点数据项关联的实体属性对象
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
    public PSDETreeNodeCol psdefid(String pSDEFId){
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
    public PSDETreeNodeCol psdefid(PSDEField pSDEField){
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
    public PSDETreeNodeCol psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEFUIMODEID</B>&nbsp;属性界面模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFUIMode} 
     */
    public final static String FIELD_PSDEFUIMODEID = "psdefuimodeid";

    /**
     * 设置 属性界面模式
     * 
     * @param pSDEFUIModeId
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODEID)
    public void setPSDEFUIModeId(String pSDEFUIModeId){
        this.set(FIELD_PSDEFUIMODEID, pSDEFUIModeId);
    }
    
    /**
     * 获取 属性界面模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeId(){
        Object objValue = this.get(FIELD_PSDEFUIMODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性界面模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeIdDirty(){
        if(this.contains(FIELD_PSDEFUIMODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性界面模式
     */
    @JsonIgnore
    public void resetPSDEFUIModeId(){
        this.reset(FIELD_PSDEFUIMODEID);
    }

    /**
     * 设置 属性界面模式
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIModeId
     */
    @JsonIgnore
    public PSDETreeNodeCol psdefuimodeid(String pSDEFUIModeId){
        this.setPSDEFUIModeId(pSDEFUIModeId);
        return this;
    }

    /**
     * 设置 属性界面模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFUIModeId}
     * @param pSDEFUIMode 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeCol psdefuimodeid(PSDEFUIMode pSDEFUIMode){
        if(pSDEFUIMode == null){
            this.setPSDEFUIModeId(null);
            this.setPSDEFUIModeName(null);
        }
        else{
            this.setPSDEFUIModeId(pSDEFUIMode.getPSDEFUIModeId());
            this.setPSDEFUIModeName(pSDEFUIMode.getPSDEFUIModeName());
        }
        return this;
    }

    /**
     * <B>PSDEFUIMODENAME</B>&nbsp;属性界面模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFUIMODEID}
     */
    public final static String FIELD_PSDEFUIMODENAME = "psdefuimodename";

    /**
     * 设置 属性界面模式
     * 
     * @param pSDEFUIModeName
     * 
     */
    @JsonProperty(FIELD_PSDEFUIMODENAME)
    public void setPSDEFUIModeName(String pSDEFUIModeName){
        this.set(FIELD_PSDEFUIMODENAME, pSDEFUIModeName);
    }
    
    /**
     * 获取 属性界面模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEFUIModeName(){
        Object objValue = this.get(FIELD_PSDEFUIMODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性界面模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFUIModeNameDirty(){
        if(this.contains(FIELD_PSDEFUIMODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性界面模式
     */
    @JsonIgnore
    public void resetPSDEFUIModeName(){
        this.reset(FIELD_PSDEFUIMODENAME);
    }

    /**
     * 设置 属性界面模式
     * <P>
     * 等同 {@link #setPSDEFUIModeName}
     * @param pSDEFUIModeName
     */
    @JsonIgnore
    public PSDETreeNodeCol psdefuimodename(String pSDEFUIModeName){
        this.setPSDEFUIModeName(pSDEFUIModeName);
        return this;
    }

    /**
     * <B>PSDETEIUPDATEID</B>&nbsp;树表编辑项更新
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETEIUpdate} 
     */
    public final static String FIELD_PSDETEIUPDATEID = "psdeteiupdateid";

    /**
     * 设置 树表编辑项更新
     * 
     * @param pSDETEIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDETEIUPDATEID)
    public void setPSDETEIUpdateId(String pSDETEIUpdateId){
        this.set(FIELD_PSDETEIUPDATEID, pSDETEIUpdateId);
    }
    
    /**
     * 获取 树表编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDETEIUpdateId(){
        Object objValue = this.get(FIELD_PSDETEIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETEIUpdateIdDirty(){
        if(this.contains(FIELD_PSDETEIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表编辑项更新
     */
    @JsonIgnore
    public void resetPSDETEIUpdateId(){
        this.reset(FIELD_PSDETEIUPDATEID);
    }

    /**
     * 设置 树表编辑项更新
     * <P>
     * 等同 {@link #setPSDETEIUpdateId}
     * @param pSDETEIUpdateId
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeteiupdateid(String pSDETEIUpdateId){
        this.setPSDETEIUpdateId(pSDETEIUpdateId);
        return this;
    }

    /**
     * 设置 树表编辑项更新，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETEIUpdateId}
     * @param pSDETEIUpdate 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeteiupdateid(PSDETEIUpdate pSDETEIUpdate){
        if(pSDETEIUpdate == null){
            this.setPSDETEIUpdateId(null);
            this.setPSDETEIUpdateName(null);
        }
        else{
            this.setPSDETEIUpdateId(pSDETEIUpdate.getPSDETEIUpdateId());
            this.setPSDETEIUpdateName(pSDETEIUpdate.getPSDETEIUpdateName());
        }
        return this;
    }

    /**
     * <B>PSDETEIUPDATENAME</B>&nbsp;树表编辑项更新
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETEIUPDATEID}
     */
    public final static String FIELD_PSDETEIUPDATENAME = "psdeteiupdatename";

    /**
     * 设置 树表编辑项更新
     * 
     * @param pSDETEIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDETEIUPDATENAME)
    public void setPSDETEIUpdateName(String pSDETEIUpdateName){
        this.set(FIELD_PSDETEIUPDATENAME, pSDETEIUpdateName);
    }
    
    /**
     * 获取 树表编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDETEIUpdateName(){
        Object objValue = this.get(FIELD_PSDETEIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETEIUpdateNameDirty(){
        if(this.contains(FIELD_PSDETEIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表编辑项更新
     */
    @JsonIgnore
    public void resetPSDETEIUpdateName(){
        this.reset(FIELD_PSDETEIUPDATENAME);
    }

    /**
     * 设置 树表编辑项更新
     * <P>
     * 等同 {@link #setPSDETEIUpdateName}
     * @param pSDETEIUpdateName
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeteiupdatename(String pSDETEIUpdateName){
        this.setPSDETEIUpdateName(pSDETEIUpdateName);
        return this;
    }

    /**
     * <B>PSDETREECOLID</B>&nbsp;实体树表格列，指定树节点数据项相关的树视图表格列对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeCol} 
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
    public PSDETreeNodeCol psdetreecolid(String pSDETreeColId){
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
    public PSDETreeNodeCol psdetreecolid(PSDETreeCol pSDETreeCol){
        if(pSDETreeCol == null){
            this.setGridColType(null);
            this.setPSDETreeColId(null);
            this.setPSDETreeColName(null);
        }
        else{
            this.setGridColType(pSDETreeCol.getGridColType());
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
    public PSDETreeNodeCol psdetreecolname(String pSDETreeColName){
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
    public PSDETreeNodeCol psdetreenodecolid(String pSDETreeNodeColId){
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
    public PSDETreeNodeCol psdetreenodecolname(String pSDETreeNodeColName){
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
    public PSDETreeNodeCol name(String strName){
        this.setPSDETreeNodeColName(strName);
        return this;
    }

    /**
     * <B>PSDETREENODEID</B>&nbsp;实体树节点，指定树节点数据项所在的树节点对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeNode} 
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
    public PSDETreeNodeCol psdetreenodeid(String pSDETreeNodeId){
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
    public PSDETreeNodeCol psdetreenodeid(PSDETreeNode pSDETreeNode){
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
    public PSDETreeNodeCol psdetreenodename(String pSDETreeNodeName){
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树视图，指定树节点数据项所在的树视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeView} 
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
    public PSDETreeNodeCol psdetreeviewid(String pSDETreeViewId){
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
    public PSDETreeNodeCol psdetreeviewid(PSDETreeView pSDETreeView){
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
    public PSDETreeNodeCol psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
        return this;
    }

    /**
     * <B>PSDEUAGROUPID</B>&nbsp;界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUAGroup} 
     */
    public final static String FIELD_PSDEUAGROUPID = "psdeuagroupid";

    /**
     * 设置 界面行为组
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
     * 设置 界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupId}
     * @param pSDEUAGroupId
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeuagroupid(String pSDEUAGroupId){
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
    public PSDETreeNodeCol psdeuagroupid(PSDEUAGroup pSDEUAGroup){
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
     * <B>PSDEUAGROUPNAME</B>&nbsp;界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUAGROUPID}
     */
    public final static String FIELD_PSDEUAGROUPNAME = "psdeuagroupname";

    /**
     * 设置 界面行为组
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
     * 设置 界面行为组
     * <P>
     * 等同 {@link #setPSDEUAGroupName}
     * @param pSDEUAGroupName
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeuagroupname(String pSDEUAGroupName){
        this.setPSDEUAGroupName(pSDEUAGroupName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEUIAction} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 实体界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 实体界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeuiactionid(PSDEUIAction pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;实体界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 实体界面行为
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 实体界面行为
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDETreeNodeCol psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSYSDICTCATID</B>&nbsp;输入词条类别
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDictCat} 
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
    public PSDETreeNodeCol pssysdictcatid(String pSSysDictCatId){
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
    public PSDETreeNodeCol pssysdictcatid(PSSysDictCat pSSysDictCat){
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
    public PSDETreeNodeCol pssysdictcatname(String pSSysDictCatName){
        this.setPSSysDictCatName(pSSysDictCatName);
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
    public PSDETreeNodeCol pssysdynamodelid(String pSSysDynaModelId){
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
    public PSDETreeNodeCol pssysdynamodelid(PSSysDynaModel pSSysDynaModel){
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
    public PSDETreeNodeCol pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSEDITORSTYLEID</B>&nbsp;编辑器样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysEditorStyle} 
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
    public PSDETreeNodeCol pssyseditorstyleid(String pSSysEditorStyleId){
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
    public PSDETreeNodeCol pssyseditorstyleid(PSSysEditorStyle pSSysEditorStyle){
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
    public PSDETreeNodeCol pssyseditorstylename(String pSSysEditorStyleName){
        this.setPSSysEditorStyleName(pSSysEditorStyleName);
        return this;
    }

    /**
     * <B>REFPSDEACMODEID</B>&nbsp;引用实体自填模式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEACMode} 
     */
    public final static String FIELD_REFPSDEACMODEID = "refpsdeacmodeid";

    /**
     * 设置 引用实体自填模式
     * 
     * @param refPSDEACModeId
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODEID)
    public void setRefPSDEACModeId(String refPSDEACModeId){
        this.set(FIELD_REFPSDEACMODEID, refPSDEACModeId);
    }
    
    /**
     * 获取 引用实体自填模式  
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
     * 判断 引用实体自填模式 是否指定值，包括空值
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
     * 重置 引用实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeId(){
        this.reset(FIELD_REFPSDEACMODEID);
    }

    /**
     * 设置 引用实体自填模式
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param refPSDEACModeId
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdeacmodeid(String refPSDEACModeId){
        this.setRefPSDEACModeId(refPSDEACModeId);
        return this;
    }

    /**
     * 设置 引用实体自填模式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSDEACModeId}
     * @param pSDEACMode 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdeacmodeid(PSDEACMode pSDEACMode){
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
     * <B>REFPSDEACMODENAME</B>&nbsp;引用实体自填模式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEACMODEID}
     */
    public final static String FIELD_REFPSDEACMODENAME = "refpsdeacmodename";

    /**
     * 设置 引用实体自填模式
     * 
     * @param refPSDEACModeName
     * 
     */
    @JsonProperty(FIELD_REFPSDEACMODENAME)
    public void setRefPSDEACModeName(String refPSDEACModeName){
        this.set(FIELD_REFPSDEACMODENAME, refPSDEACModeName);
    }
    
    /**
     * 获取 引用实体自填模式  
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
     * 判断 引用实体自填模式 是否指定值，包括空值
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
     * 重置 引用实体自填模式
     */
    @JsonIgnore
    public void resetRefPSDEACModeName(){
        this.reset(FIELD_REFPSDEACMODENAME);
    }

    /**
     * 设置 引用实体自填模式
     * <P>
     * 等同 {@link #setRefPSDEACModeName}
     * @param refPSDEACModeName
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdeacmodename(String refPSDEACModeName){
        this.setRefPSDEACModeName(refPSDEACModeName);
        return this;
    }

    /**
     * <B>REFPSDEDATASETID</B>&nbsp;引用实体数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_REFPSDEDATASETID = "refpsdedatasetid";

    /**
     * 设置 引用实体数据集
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
     * 设置 引用实体数据集
     * <P>
     * 等同 {@link #setRefPSDEDataSetId}
     * @param refPSDEDataSetId
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdedatasetid(String refPSDEDataSetId){
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
    public PSDETreeNodeCol refpsdedatasetid(PSDEDataSet pSDEDataSet){
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
     * <B>REFPSDEDATASETNAME</B>&nbsp;引用实体数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEDATASETID}
     */
    public final static String FIELD_REFPSDEDATASETNAME = "refpsdedatasetname";

    /**
     * 设置 引用实体数据集
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
     * 设置 引用实体数据集
     * <P>
     * 等同 {@link #setRefPSDEDataSetName}
     * @param refPSDEDataSetName
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdedatasetname(String refPSDEDataSetName){
        this.setRefPSDEDataSetName(refPSDEDataSetName);
        return this;
    }

    /**
     * <B>REFPSDEID</B>&nbsp;引用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_REFPSDEID = "refpsdeid";

    /**
     * 设置 引用实体
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
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEId}
     * @param refPSDEId
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdeid(String refPSDEId){
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
    public PSDETreeNodeCol refpsdeid(PSDataEntity pSDataEntity){
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
     * <B>REFPSDENAME</B>&nbsp;引用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSDEID}
     */
    public final static String FIELD_REFPSDENAME = "refpsdename";

    /**
     * 设置 引用实体
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
     * 设置 引用实体
     * <P>
     * 等同 {@link #setRefPSDEName}
     * @param refPSDEName
     */
    @JsonIgnore
    public PSDETreeNodeCol refpsdename(String refPSDEName){
        this.setRefPSDEName(refPSDEName);
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
    public PSDETreeNodeCol resetitemname(String resetItemName){
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
    public PSDETreeNodeCol updatedate(String updateDate){
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
    public PSDETreeNodeCol updatedv(String updateDV){
        this.setUpdateDV(updateDV);
        return this;
    }

    /**
     * <B>UPDATEDVT</B>&nbsp;更新默认值类型，指定树表格编辑项的更新默认值类型，未定义时为【直接值】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType} 
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
    public PSDETreeNodeCol updatedvt(String updateDVT){
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
    public PSDETreeNodeCol updatedvt(net.ibizsys.psmodel.core.util.PSModelEnums.UpdateDefaultValueType updateDVT){
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
    public PSDETreeNodeCol updateman(String updateMan){
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
    public PSDETreeNodeCol usercat(String userCat){
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
    public PSDETreeNodeCol usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDETreeNodeCol usertag(String userTag){
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
    public PSDETreeNodeCol usertag2(String userTag2){
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
    public PSDETreeNodeCol valueformat(String valueFormat){
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
    public PSDETreeNodeCol valueitemname(String valueItemName){
        this.setValueItemName(valueItemName);
        return this;
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
    public PSDETreeNodeCol id(String strValue){
        this.setPSDETreeNodeColId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETreeNodeCol){
            PSDETreeNodeCol model = (PSDETreeNodeCol)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
