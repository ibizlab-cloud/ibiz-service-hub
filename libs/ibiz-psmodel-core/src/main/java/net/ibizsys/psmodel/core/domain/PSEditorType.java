package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSEDITORTYPE</B>云平台编辑器类型 模型传输对象
 * <P>
 * 
 */
public class PSEditorType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSEditorType(){
        this.setValidFlag(1);
    }      

    /**
     * <B>AJAXHANDLER</B>&nbsp;后台处理对象类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorHandlerType} 
     */
    public final static String FIELD_AJAXHANDLER = "ajaxhandler";

    /**
     * 设置 后台处理对象类型
     * 
     * @param ajaxHandler
     * 
     */
    @JsonProperty(FIELD_AJAXHANDLER)
    public void setAjaxHandler(String ajaxHandler){
        this.set(FIELD_AJAXHANDLER, ajaxHandler);
    }
    
    /**
     * 获取 后台处理对象类型  
     * @return
     */
    @JsonIgnore
    public String getAjaxHandler(){
        Object objValue = this.get(FIELD_AJAXHANDLER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台处理对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAjaxHandlerDirty(){
        if(this.contains(FIELD_AJAXHANDLER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台处理对象类型
     */
    @JsonIgnore
    public void resetAjaxHandler(){
        this.reset(FIELD_AJAXHANDLER);
    }

    /**
     * 设置 后台处理对象类型
     * <P>
     * 等同 {@link #setAjaxHandler}
     * @param ajaxHandler
     */
    @JsonIgnore
    public PSEditorType ajaxhandler(String ajaxHandler){
        this.setAjaxHandler(ajaxHandler);
        return this;
    }

     /**
     * 设置 后台处理对象类型
     * <P>
     * 等同 {@link #setAjaxHandler}
     * @param ajaxHandler
     */
    @JsonIgnore
    public PSEditorType ajaxhandler(net.ibizsys.psmodel.core.util.PSModelEnums.EditorHandlerType ajaxHandler){
        if(ajaxHandler == null){
            this.setAjaxHandler(null);
        }
        else{
            this.setAjaxHandler(ajaxHandler.value);
        }
        return this;
    }

    /**
     * <B>CONVERTCITEXT</B>&nbsp;转换代码项文本
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_CONVERTCITEXT = "convertcitext";

    /**
     * 设置 转换代码项文本
     * 
     * @param convertCIText
     * 
     */
    @JsonProperty(FIELD_CONVERTCITEXT)
    public void setConvertCIText(Integer convertCIText){
        this.set(FIELD_CONVERTCITEXT, convertCIText);
    }
    
    /**
     * 获取 转换代码项文本  
     * @return
     */
    @JsonIgnore
    public Integer getConvertCIText(){
        Object objValue = this.get(FIELD_CONVERTCITEXT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 转换代码项文本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isConvertCITextDirty(){
        if(this.contains(FIELD_CONVERTCITEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 转换代码项文本
     */
    @JsonIgnore
    public void resetConvertCIText(){
        this.reset(FIELD_CONVERTCITEXT);
    }

    /**
     * 设置 转换代码项文本
     * <P>
     * 等同 {@link #setConvertCIText}
     * @param convertCIText
     */
    @JsonIgnore
    public PSEditorType convertcitext(Integer convertCIText){
        this.setConvertCIText(convertCIText);
        return this;
    }

     /**
     * 设置 转换代码项文本
     * <P>
     * 等同 {@link #setConvertCIText}
     * @param convertCIText
     */
    @JsonIgnore
    public PSEditorType convertcitext(Boolean convertCIText){
        if(convertCIText == null){
            this.setConvertCIText(null);
        }
        else{
            this.setConvertCIText(convertCIText?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSEditorType createdate(String createDate){
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
    public PSEditorType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CTRLOBJ</B>&nbsp;控件对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_CTRLOBJ = "ctrlobj";

    /**
     * 设置 控件对象
     * 
     * @param ctrlObj
     * 
     */
    @JsonProperty(FIELD_CTRLOBJ)
    public void setCtrlObj(String ctrlObj){
        this.set(FIELD_CTRLOBJ, ctrlObj);
    }
    
    /**
     * 获取 控件对象  
     * @return
     */
    @JsonIgnore
    public String getCtrlObj(){
        Object objValue = this.get(FIELD_CTRLOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控件对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCtrlObjDirty(){
        if(this.contains(FIELD_CTRLOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控件对象
     */
    @JsonIgnore
    public void resetCtrlObj(){
        this.reset(FIELD_CTRLOBJ);
    }

    /**
     * 设置 控件对象
     * <P>
     * 等同 {@link #setCtrlObj}
     * @param ctrlObj
     */
    @JsonIgnore
    public PSEditorType ctrlobj(String ctrlObj){
        this.setCtrlObj(ctrlObj);
        return this;
    }

    /**
     * <B>DOTNETFORMAT</B>&nbsp;.NET格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_DOTNETFORMAT = "dotnetformat";

    /**
     * 设置 .NET格式化
     * 
     * @param dotNETFormat
     * 
     */
    @JsonProperty(FIELD_DOTNETFORMAT)
    public void setDotNETFormat(String dotNETFormat){
        this.set(FIELD_DOTNETFORMAT, dotNETFormat);
    }
    
    /**
     * 获取 .NET格式化  
     * @return
     */
    @JsonIgnore
    public String getDotNETFormat(){
        Object objValue = this.get(FIELD_DOTNETFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 .NET格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDotNETFormatDirty(){
        if(this.contains(FIELD_DOTNETFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 .NET格式化
     */
    @JsonIgnore
    public void resetDotNETFormat(){
        this.reset(FIELD_DOTNETFORMAT);
    }

    /**
     * 设置 .NET格式化
     * <P>
     * 等同 {@link #setDotNETFormat}
     * @param dotNETFormat
     */
    @JsonIgnore
    public PSEditorType dotnetformat(String dotNETFormat){
        this.setDotNETFormat(dotNETFormat);
        return this;
    }

    /**
     * <B>EDITABLE</B>&nbsp;支持编辑
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EDITABLE = "editable";

    /**
     * 设置 支持编辑
     * 
     * @param editable
     * 
     */
    @JsonProperty(FIELD_EDITABLE)
    public void setEditable(Integer editable){
        this.set(FIELD_EDITABLE, editable);
    }
    
    /**
     * 获取 支持编辑  
     * @return
     */
    @JsonIgnore
    public Integer getEditable(){
        Object objValue = this.get(FIELD_EDITABLE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持编辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditableDirty(){
        if(this.contains(FIELD_EDITABLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持编辑
     */
    @JsonIgnore
    public void resetEditable(){
        this.reset(FIELD_EDITABLE);
    }

    /**
     * 设置 支持编辑
     * <P>
     * 等同 {@link #setEditable}
     * @param editable
     */
    @JsonIgnore
    public PSEditorType editable(Integer editable){
        this.setEditable(editable);
        return this;
    }

     /**
     * 设置 支持编辑
     * <P>
     * 等同 {@link #setEditable}
     * @param editable
     */
    @JsonIgnore
    public PSEditorType editable(Boolean editable){
        if(editable == null){
            this.setEditable(null);
        }
        else{
            this.setEditable(editable?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>EDITORCODE</B>&nbsp;编辑器编码
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_EDITORCODE = "editorcode";

    /**
     * 设置 编辑器编码
     * 
     * @param editorCode
     * 
     */
    @JsonProperty(FIELD_EDITORCODE)
    public void setEditorCode(String editorCode){
        this.set(FIELD_EDITORCODE, editorCode);
    }
    
    /**
     * 获取 编辑器编码  
     * @return
     */
    @JsonIgnore
    public String getEditorCode(){
        Object objValue = this.get(FIELD_EDITORCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器编码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEditorCodeDirty(){
        if(this.contains(FIELD_EDITORCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器编码
     */
    @JsonIgnore
    public void resetEditorCode(){
        this.reset(FIELD_EDITORCODE);
    }

    /**
     * 设置 编辑器编码
     * <P>
     * 等同 {@link #setEditorCode}
     * @param editorCode
     */
    @JsonIgnore
    public PSEditorType editorcode(String editorCode){
        this.setEditorCode(editorCode);
        return this;
    }

    /**
     * <B>EDITORPARAM</B>&nbsp;编辑器参数
     */
    public final static String FIELD_EDITORPARAM = "editorparam";

    /**
     * 设置 编辑器参数
     * 
     * @param editorParam
     * 
     */
    @JsonProperty(FIELD_EDITORPARAM)
    public void setEditorParam(String editorParam){
        this.set(FIELD_EDITORPARAM, editorParam);
    }
    
    /**
     * 获取 编辑器参数  
     * @return
     */
    @JsonIgnore
    public String getEditorParam(){
        Object objValue = this.get(FIELD_EDITORPARAM);
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
    public boolean isEditorParamDirty(){
        if(this.contains(FIELD_EDITORPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器参数
     */
    @JsonIgnore
    public void resetEditorParam(){
        this.reset(FIELD_EDITORPARAM);
    }

    /**
     * 设置 编辑器参数
     * <P>
     * 等同 {@link #setEditorParam}
     * @param editorParam
     */
    @JsonIgnore
    public PSEditorType editorparam(String editorParam){
        this.setEditorParam(editorParam);
        return this;
    }

    /**
     * <B>FIEDITOR</B>&nbsp;表单项编辑器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_FIEDITOR = "fieditor";

    /**
     * 设置 表单项编辑器
     * 
     * @param fIEditor
     * 
     */
    @JsonProperty(FIELD_FIEDITOR)
    public void setFIEditor(Integer fIEditor){
        this.set(FIELD_FIEDITOR, fIEditor);
    }
    
    /**
     * 获取 表单项编辑器  
     * @return
     */
    @JsonIgnore
    public Integer getFIEditor(){
        Object objValue = this.get(FIELD_FIEDITOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表单项编辑器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFIEditorDirty(){
        if(this.contains(FIELD_FIEDITOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项编辑器
     */
    @JsonIgnore
    public void resetFIEditor(){
        this.reset(FIELD_FIEDITOR);
    }

    /**
     * 设置 表单项编辑器
     * <P>
     * 等同 {@link #setFIEditor}
     * @param fIEditor
     */
    @JsonIgnore
    public PSEditorType fieditor(Integer fIEditor){
        this.setFIEditor(fIEditor);
        return this;
    }

     /**
     * 设置 表单项编辑器
     * <P>
     * 等同 {@link #setFIEditor}
     * @param fIEditor
     */
    @JsonIgnore
    public PSEditorType fieditor(Boolean fIEditor){
        if(fIEditor == null){
            this.setFIEditor(null);
        }
        else{
            this.setFIEditor(fIEditor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GCEDITOR</B>&nbsp;表格列编辑器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GCEDITOR = "gceditor";

    /**
     * 设置 表格列编辑器
     * 
     * @param gCEditor
     * 
     */
    @JsonProperty(FIELD_GCEDITOR)
    public void setGCEditor(Integer gCEditor){
        this.set(FIELD_GCEDITOR, gCEditor);
    }
    
    /**
     * 获取 表格列编辑器  
     * @return
     */
    @JsonIgnore
    public Integer getGCEditor(){
        Object objValue = this.get(FIELD_GCEDITOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 表格列编辑器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGCEditorDirty(){
        if(this.contains(FIELD_GCEDITOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格列编辑器
     */
    @JsonIgnore
    public void resetGCEditor(){
        this.reset(FIELD_GCEDITOR);
    }

    /**
     * 设置 表格列编辑器
     * <P>
     * 等同 {@link #setGCEditor}
     * @param gCEditor
     */
    @JsonIgnore
    public PSEditorType gceditor(Integer gCEditor){
        this.setGCEditor(gCEditor);
        return this;
    }

     /**
     * 设置 表格列编辑器
     * <P>
     * 等同 {@link #setGCEditor}
     * @param gCEditor
     */
    @JsonIgnore
    public PSEditorType gceditor(Boolean gCEditor){
        if(gCEditor == null){
            this.setGCEditor(null);
        }
        else{
            this.setGCEditor(gCEditor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;默认高度
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 默认高度
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 默认高度  
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
     * 判断 默认高度 是否指定值，包括空值
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
     * 重置 默认高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 默认高度
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSEditorType height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>ICONPATH</B>&nbsp;图标路径
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_ICONPATH = "iconpath";

    /**
     * 设置 图标路径
     * 
     * @param iconPath
     * 
     */
    @JsonProperty(FIELD_ICONPATH)
    public void setIconPath(String iconPath){
        this.set(FIELD_ICONPATH, iconPath);
    }
    
    /**
     * 获取 图标路径  
     * @return
     */
    @JsonIgnore
    public String getIconPath(){
        Object objValue = this.get(FIELD_ICONPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图标路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIconPathDirty(){
        if(this.contains(FIELD_ICONPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图标路径
     */
    @JsonIgnore
    public void resetIconPath(){
        this.reset(FIELD_ICONPATH);
    }

    /**
     * 设置 图标路径
     * <P>
     * 等同 {@link #setIconPath}
     * @param iconPath
     */
    @JsonIgnore
    public PSEditorType iconpath(String iconPath){
        this.setIconPath(iconPath);
        return this;
    }

    /**
     * <B>JAVAFORMAT</B>&nbsp;JAVA格式化
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_JAVAFORMAT = "javaformat";

    /**
     * 设置 JAVA格式化
     * 
     * @param javaFormat
     * 
     */
    @JsonProperty(FIELD_JAVAFORMAT)
    public void setJavaFormat(String javaFormat){
        this.set(FIELD_JAVAFORMAT, javaFormat);
    }
    
    /**
     * 获取 JAVA格式化  
     * @return
     */
    @JsonIgnore
    public String getJavaFormat(){
        Object objValue = this.get(FIELD_JAVAFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 JAVA格式化 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isJavaFormatDirty(){
        if(this.contains(FIELD_JAVAFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 JAVA格式化
     */
    @JsonIgnore
    public void resetJavaFormat(){
        this.reset(FIELD_JAVAFORMAT);
    }

    /**
     * 设置 JAVA格式化
     * <P>
     * 等同 {@link #setJavaFormat}
     * @param javaFormat
     */
    @JsonIgnore
    public PSEditorType javaformat(String javaFormat){
        this.setJavaFormat(javaFormat);
        return this;
    }

    /**
     * <B>LINKVIEWSHOWMODE</B>&nbsp;链接视图显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode} 
     */
    public final static String FIELD_LINKVIEWSHOWMODE = "linkviewshowmode";

    /**
     * 设置 链接视图显示模式
     * 
     * @param linkViewShowMode
     * 
     */
    @JsonProperty(FIELD_LINKVIEWSHOWMODE)
    public void setLinkViewShowMode(String linkViewShowMode){
        this.set(FIELD_LINKVIEWSHOWMODE, linkViewShowMode);
    }
    
    /**
     * 获取 链接视图显示模式  
     * @return
     */
    @JsonIgnore
    public String getLinkViewShowMode(){
        Object objValue = this.get(FIELD_LINKVIEWSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接视图显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkViewShowModeDirty(){
        if(this.contains(FIELD_LINKVIEWSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接视图显示模式
     */
    @JsonIgnore
    public void resetLinkViewShowMode(){
        this.reset(FIELD_LINKVIEWSHOWMODE);
    }

    /**
     * 设置 链接视图显示模式
     * <P>
     * 等同 {@link #setLinkViewShowMode}
     * @param linkViewShowMode
     */
    @JsonIgnore
    public PSEditorType linkviewshowmode(String linkViewShowMode){
        this.setLinkViewShowMode(linkViewShowMode);
        return this;
    }

     /**
     * 设置 链接视图显示模式
     * <P>
     * 等同 {@link #setLinkViewShowMode}
     * @param linkViewShowMode
     */
    @JsonIgnore
    public PSEditorType linkviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode linkViewShowMode){
        if(linkViewShowMode == null){
            this.setLinkViewShowMode(null);
        }
        else{
            this.setLinkViewShowMode(linkViewShowMode.value);
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
    public PSEditorType memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MOBFIEDITOR</B>&nbsp;移动端表单项编辑器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_MOBFIEDITOR = "mobfieditor";

    /**
     * 设置 移动端表单项编辑器
     * 
     * @param mobFIEditor
     * 
     */
    @JsonProperty(FIELD_MOBFIEDITOR)
    public void setMobFIEditor(Integer mobFIEditor){
        this.set(FIELD_MOBFIEDITOR, mobFIEditor);
    }
    
    /**
     * 获取 移动端表单项编辑器  
     * @return
     */
    @JsonIgnore
    public Integer getMobFIEditor(){
        Object objValue = this.get(FIELD_MOBFIEDITOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 移动端表单项编辑器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMobFIEditorDirty(){
        if(this.contains(FIELD_MOBFIEDITOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端表单项编辑器
     */
    @JsonIgnore
    public void resetMobFIEditor(){
        this.reset(FIELD_MOBFIEDITOR);
    }

    /**
     * 设置 移动端表单项编辑器
     * <P>
     * 等同 {@link #setMobFIEditor}
     * @param mobFIEditor
     */
    @JsonIgnore
    public PSEditorType mobfieditor(Integer mobFIEditor){
        this.setMobFIEditor(mobFIEditor);
        return this;
    }

     /**
     * 设置 移动端表单项编辑器
     * <P>
     * 等同 {@link #setMobFIEditor}
     * @param mobFIEditor
     */
    @JsonIgnore
    public PSEditorType mobfieditor(Boolean mobFIEditor){
        if(mobFIEditor == null){
            this.setMobFIEditor(null);
        }
        else{
            this.setMobFIEditor(mobFIEditor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSEditorType needcodelistconfig(Integer needCodeListConfig){
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
    public PSEditorType needcodelistconfig(Boolean needCodeListConfig){
        if(needCodeListConfig == null){
            this.setNeedCodeListConfig(null);
        }
        else{
            this.setNeedCodeListConfig(needCodeListConfig?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSEditorType ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSEDITORTYPEID</B>&nbsp;编辑器标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSEDITORTYPEID = "pseditortypeid";

    /**
     * 设置 编辑器标识
     * 
     * @param pSEditorTypeId
     * 
     */
    @JsonProperty(FIELD_PSEDITORTYPEID)
    public void setPSEditorTypeId(String pSEditorTypeId){
        this.set(FIELD_PSEDITORTYPEID, pSEditorTypeId);
    }
    
    /**
     * 获取 编辑器标识  
     * @return
     */
    @JsonIgnore
    public String getPSEditorTypeId(){
        Object objValue = this.get(FIELD_PSEDITORTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSEditorTypeIdDirty(){
        if(this.contains(FIELD_PSEDITORTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器标识
     */
    @JsonIgnore
    public void resetPSEditorTypeId(){
        this.reset(FIELD_PSEDITORTYPEID);
    }

    /**
     * 设置 编辑器标识
     * <P>
     * 等同 {@link #setPSEditorTypeId}
     * @param pSEditorTypeId
     */
    @JsonIgnore
    public PSEditorType pseditortypeid(String pSEditorTypeId){
        this.setPSEditorTypeId(pSEditorTypeId);
        return this;
    }

    /**
     * <B>PSEDITORTYPENAME</B>&nbsp;编辑器名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSEDITORTYPENAME = "pseditortypename";

    /**
     * 设置 编辑器名称
     * 
     * @param pSEditorTypeName
     * 
     */
    @JsonProperty(FIELD_PSEDITORTYPENAME)
    public void setPSEditorTypeName(String pSEditorTypeName){
        this.set(FIELD_PSEDITORTYPENAME, pSEditorTypeName);
    }
    
    /**
     * 获取 编辑器名称  
     * @return
     */
    @JsonIgnore
    public String getPSEditorTypeName(){
        Object objValue = this.get(FIELD_PSEDITORTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑器名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSEditorTypeNameDirty(){
        if(this.contains(FIELD_PSEDITORTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑器名称
     */
    @JsonIgnore
    public void resetPSEditorTypeName(){
        this.reset(FIELD_PSEDITORTYPENAME);
    }

    /**
     * 设置 编辑器名称
     * <P>
     * 等同 {@link #setPSEditorTypeName}
     * @param pSEditorTypeName
     */
    @JsonIgnore
    public PSEditorType pseditortypename(String pSEditorTypeName){
        this.setPSEditorTypeName(pSEditorTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSEditorTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSEditorTypeName(strName);
    }

    @JsonIgnore
    public PSEditorType name(String strName){
        this.setPSEditorTypeName(strName);
        return this;
    }

    /**
     * <B>REFVIEWSHOWMODE</B>&nbsp;引用视图显示模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode} 
     */
    public final static String FIELD_REFVIEWSHOWMODE = "refviewshowmode";

    /**
     * 设置 引用视图显示模式
     * 
     * @param refViewShowMode
     * 
     */
    @JsonProperty(FIELD_REFVIEWSHOWMODE)
    public void setRefViewShowMode(String refViewShowMode){
        this.set(FIELD_REFVIEWSHOWMODE, refViewShowMode);
    }
    
    /**
     * 获取 引用视图显示模式  
     * @return
     */
    @JsonIgnore
    public String getRefViewShowMode(){
        Object objValue = this.get(FIELD_REFVIEWSHOWMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用视图显示模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefViewShowModeDirty(){
        if(this.contains(FIELD_REFVIEWSHOWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用视图显示模式
     */
    @JsonIgnore
    public void resetRefViewShowMode(){
        this.reset(FIELD_REFVIEWSHOWMODE);
    }

    /**
     * 设置 引用视图显示模式
     * <P>
     * 等同 {@link #setRefViewShowMode}
     * @param refViewShowMode
     */
    @JsonIgnore
    public PSEditorType refviewshowmode(String refViewShowMode){
        this.setRefViewShowMode(refViewShowMode);
        return this;
    }

     /**
     * 设置 引用视图显示模式
     * <P>
     * 等同 {@link #setRefViewShowMode}
     * @param refViewShowMode
     */
    @JsonIgnore
    public PSEditorType refviewshowmode(net.ibizsys.psmodel.core.util.PSModelEnums.EditorRefViewShowMode refViewShowMode){
        if(refViewShowMode == null){
            this.setRefViewShowMode(null);
        }
        else{
            this.setRefViewShowMode(refViewShowMode.value);
        }
        return this;
    }

    /**
     * <B>SBEDITOR</B>&nbsp;搜索栏编辑器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SBEDITOR = "sbeditor";

    /**
     * 设置 搜索栏编辑器
     * 
     * @param sBEditor
     * 
     */
    @JsonProperty(FIELD_SBEDITOR)
    public void setSBEditor(Integer sBEditor){
        this.set(FIELD_SBEDITOR, sBEditor);
    }
    
    /**
     * 获取 搜索栏编辑器  
     * @return
     */
    @JsonIgnore
    public Integer getSBEditor(){
        Object objValue = this.get(FIELD_SBEDITOR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 搜索栏编辑器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSBEditorDirty(){
        if(this.contains(FIELD_SBEDITOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 搜索栏编辑器
     */
    @JsonIgnore
    public void resetSBEditor(){
        this.reset(FIELD_SBEDITOR);
    }

    /**
     * 设置 搜索栏编辑器
     * <P>
     * 等同 {@link #setSBEditor}
     * @param sBEditor
     */
    @JsonIgnore
    public PSEditorType sbeditor(Integer sBEditor){
        this.setSBEditor(sBEditor);
        return this;
    }

     /**
     * 设置 搜索栏编辑器
     * <P>
     * 等同 {@link #setSBEditor}
     * @param sBEditor
     */
    @JsonIgnore
    public PSEditorType sbeditor(Boolean sBEditor){
        if(sBEditor == null){
            this.setSBEditor(null);
        }
        else{
            this.setSBEditor(sBEditor?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>STANDARDEDITOR</B>&nbsp;基础编辑器
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_STANDARDEDITOR = "standardeditor";

    /**
     * 设置 基础编辑器
     * 
     * @param standardEditor
     * 
     */
    @JsonProperty(FIELD_STANDARDEDITOR)
    public void setStandardEditor(String standardEditor){
        this.set(FIELD_STANDARDEDITOR, standardEditor);
    }
    
    /**
     * 获取 基础编辑器  
     * @return
     */
    @JsonIgnore
    public String getStandardEditor(){
        Object objValue = this.get(FIELD_STANDARDEDITOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 基础编辑器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStandardEditorDirty(){
        if(this.contains(FIELD_STANDARDEDITOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基础编辑器
     */
    @JsonIgnore
    public void resetStandardEditor(){
        this.reset(FIELD_STANDARDEDITOR);
    }

    /**
     * 设置 基础编辑器
     * <P>
     * 等同 {@link #setStandardEditor}
     * @param standardEditor
     */
    @JsonIgnore
    public PSEditorType standardeditor(String standardEditor){
        this.setStandardEditor(standardEditor);
        return this;
    }

    /**
     * <B>STANDARDTYPE</B>&nbsp;基础编辑器
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_STANDARDTYPE = "standardtype";

    /**
     * 设置 基础编辑器
     * 
     * @param standardType
     * 
     */
    @JsonProperty(FIELD_STANDARDTYPE)
    public void setStandardType(Integer standardType){
        this.set(FIELD_STANDARDTYPE, standardType);
    }
    
    /**
     * 获取 基础编辑器  
     * @return
     */
    @JsonIgnore
    public Integer getStandardType(){
        Object objValue = this.get(FIELD_STANDARDTYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 基础编辑器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStandardTypeDirty(){
        if(this.contains(FIELD_STANDARDTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 基础编辑器
     */
    @JsonIgnore
    public void resetStandardType(){
        this.reset(FIELD_STANDARDTYPE);
    }

    /**
     * 设置 基础编辑器
     * <P>
     * 等同 {@link #setStandardType}
     * @param standardType
     */
    @JsonIgnore
    public PSEditorType standardtype(Integer standardType){
        this.setStandardType(standardType);
        return this;
    }

     /**
     * 设置 基础编辑器
     * <P>
     * 等同 {@link #setStandardType}
     * @param standardType
     */
    @JsonIgnore
    public PSEditorType standardtype(Boolean standardType){
        if(standardType == null){
            this.setStandardType(null);
        }
        else{
            this.setStandardType(standardType?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSEditorType updatedate(String updateDate){
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
    public PSEditorType updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSEditorType validflag(Integer validFlag){
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
    public PSEditorType validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VALUEPROCESSOR</B>&nbsp;值处理器
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_VALUEPROCESSOR = "valueprocessor";

    /**
     * 设置 值处理器
     * 
     * @param valueProcessor
     * 
     */
    @JsonProperty(FIELD_VALUEPROCESSOR)
    public void setValueProcessor(String valueProcessor){
        this.set(FIELD_VALUEPROCESSOR, valueProcessor);
    }
    
    /**
     * 获取 值处理器  
     * @return
     */
    @JsonIgnore
    public String getValueProcessor(){
        Object objValue = this.get(FIELD_VALUEPROCESSOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值处理器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValueProcessorDirty(){
        if(this.contains(FIELD_VALUEPROCESSOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值处理器
     */
    @JsonIgnore
    public void resetValueProcessor(){
        this.reset(FIELD_VALUEPROCESSOR);
    }

    /**
     * 设置 值处理器
     * <P>
     * 等同 {@link #setValueProcessor}
     * @param valueProcessor
     */
    @JsonIgnore
    public PSEditorType valueprocessor(String valueProcessor){
        this.setValueProcessor(valueProcessor);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;默认宽度
     */
    public final static String FIELD_WIDTH = "width";

    /**
     * 设置 默认宽度
     * 
     * @param width
     * 
     */
    @JsonProperty(FIELD_WIDTH)
    public void setWidth(Integer width){
        this.set(FIELD_WIDTH, width);
    }
    
    /**
     * 获取 默认宽度  
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
     * 判断 默认宽度 是否指定值，包括空值
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
     * 重置 默认宽度
     */
    @JsonIgnore
    public void resetWidth(){
        this.reset(FIELD_WIDTH);
    }

    /**
     * 设置 默认宽度
     * <P>
     * 等同 {@link #setWidth}
     * @param width
     */
    @JsonIgnore
    public PSEditorType width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSEditorTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSEditorTypeId(strValue);
    }

    @JsonIgnore
    public PSEditorType id(String strValue){
        this.setPSEditorTypeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSEditorType){
            PSEditorType model = (PSEditorType)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
