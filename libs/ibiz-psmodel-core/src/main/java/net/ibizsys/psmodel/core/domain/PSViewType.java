package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSVIEWTYPE</B>云平台视图类型 模型传输对象
 * <P>
 * 
 */
public class PSViewType extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSViewType(){
    	this.setValidFlag(1);
    }      

    /**
     * <B>APPVIEWOBJ</B>&nbsp;应用视图处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_APPVIEWOBJ = "appviewobj";

    /**
     * 设置 应用视图处理对象
     * 
     * @param appViewObj
     * 
     */
    @JsonProperty(FIELD_APPVIEWOBJ)
    public void setAppViewObj(String appViewObj){
        this.set(FIELD_APPVIEWOBJ, appViewObj);
    }
    
    /**
     * 获取 应用视图处理对象  
     * @return
     */
    @JsonIgnore
    public String getAppViewObj(){
        Object objValue = this.get(FIELD_APPVIEWOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAppViewObjDirty(){
        if(this.contains(FIELD_APPVIEWOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图处理对象
     */
    @JsonIgnore
    public void resetAppViewObj(){
        this.reset(FIELD_APPVIEWOBJ);
    }

    /**
     * 设置 应用视图处理对象
     * <P>
     * 等同 {@link #setAppViewObj}
     * @param appViewObj
     */
    @JsonIgnore
    public PSViewType appviewobj(String appViewObj){
        this.setAppViewObj(appViewObj);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识
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
     * 设置 代码标识
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSViewType codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;颜色
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 颜色
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 颜色
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSViewType color(String color){
        this.setColor(color);
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
    public PSViewType createdate(String createDate){
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
    public PSViewType createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DESCURL</B>&nbsp;描述路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_DESCURL = "descurl";

    /**
     * 设置 描述路径
     * 
     * @param descURL
     * 
     */
    @JsonProperty(FIELD_DESCURL)
    public void setDescURL(String descURL){
        this.set(FIELD_DESCURL, descURL);
    }
    
    /**
     * 获取 描述路径  
     * @return
     */
    @JsonIgnore
    public String getDescURL(){
        Object objValue = this.get(FIELD_DESCURL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 描述路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDescURLDirty(){
        if(this.contains(FIELD_DESCURL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 描述路径
     */
    @JsonIgnore
    public void resetDescURL(){
        this.reset(FIELD_DESCURL);
    }

    /**
     * 设置 描述路径
     * <P>
     * 等同 {@link #setDescURL}
     * @param descURL
     */
    @JsonIgnore
    public PSViewType descurl(String descURL){
        this.setDescURL(descURL);
        return this;
    }

    /**
     * <B>DEVIEWMODE</B>&nbsp;是否实体视图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEVIEWMODE = "deviewmode";

    /**
     * 设置 是否实体视图
     * 
     * @param dEViewMode
     * 
     */
    @JsonProperty(FIELD_DEVIEWMODE)
    public void setDEViewMode(Integer dEViewMode){
        this.set(FIELD_DEVIEWMODE, dEViewMode);
    }
    
    /**
     * 获取 是否实体视图  
     * @return
     */
    @JsonIgnore
    public Integer getDEViewMode(){
        Object objValue = this.get(FIELD_DEVIEWMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewModeDirty(){
        if(this.contains(FIELD_DEVIEWMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否实体视图
     */
    @JsonIgnore
    public void resetDEViewMode(){
        this.reset(FIELD_DEVIEWMODE);
    }

    /**
     * 设置 是否实体视图
     * <P>
     * 等同 {@link #setDEViewMode}
     * @param dEViewMode
     */
    @JsonIgnore
    public PSViewType deviewmode(Integer dEViewMode){
        this.setDEViewMode(dEViewMode);
        return this;
    }

     /**
     * 设置 是否实体视图
     * <P>
     * 等同 {@link #setDEViewMode}
     * @param dEViewMode
     */
    @JsonIgnore
    public PSViewType deviewmode(Boolean dEViewMode){
        if(dEViewMode == null){
            this.setDEViewMode(null);
        }
        else{
            this.setDEViewMode(dEViewMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>DEVIEWOBJ</B>&nbsp;实体视图处理对象
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_DEVIEWOBJ = "deviewobj";

    /**
     * 设置 实体视图处理对象
     * 
     * @param dEViewObj
     * 
     */
    @JsonProperty(FIELD_DEVIEWOBJ)
    public void setDEViewObj(String dEViewObj){
        this.set(FIELD_DEVIEWOBJ, dEViewObj);
    }
    
    /**
     * 获取 实体视图处理对象  
     * @return
     */
    @JsonIgnore
    public String getDEViewObj(){
        Object objValue = this.get(FIELD_DEVIEWOBJ);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图处理对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewObjDirty(){
        if(this.contains(FIELD_DEVIEWOBJ)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图处理对象
     */
    @JsonIgnore
    public void resetDEViewObj(){
        this.reset(FIELD_DEVIEWOBJ);
    }

    /**
     * 设置 实体视图处理对象
     * <P>
     * 等同 {@link #setDEViewObj}
     * @param dEViewObj
     */
    @JsonIgnore
    public PSViewType deviewobj(String dEViewObj){
        this.setDEViewObj(dEViewObj);
        return this;
    }

    /**
     * <B>EMBEDVIEWFLAG</B>&nbsp;嵌入视图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_EMBEDVIEWFLAG = "embedviewflag";

    /**
     * 设置 嵌入视图
     * 
     * @param embedViewFlag
     * 
     */
    @JsonProperty(FIELD_EMBEDVIEWFLAG)
    public void setEmbedViewFlag(Integer embedViewFlag){
        this.set(FIELD_EMBEDVIEWFLAG, embedViewFlag);
    }
    
    /**
     * 获取 嵌入视图  
     * @return
     */
    @JsonIgnore
    public Integer getEmbedViewFlag(){
        Object objValue = this.get(FIELD_EMBEDVIEWFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 嵌入视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEmbedViewFlagDirty(){
        if(this.contains(FIELD_EMBEDVIEWFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 嵌入视图
     */
    @JsonIgnore
    public void resetEmbedViewFlag(){
        this.reset(FIELD_EMBEDVIEWFLAG);
    }

    /**
     * 设置 嵌入视图
     * <P>
     * 等同 {@link #setEmbedViewFlag}
     * @param embedViewFlag
     */
    @JsonIgnore
    public PSViewType embedviewflag(Integer embedViewFlag){
        this.setEmbedViewFlag(embedViewFlag);
        return this;
    }

     /**
     * 设置 嵌入视图
     * <P>
     * 等同 {@link #setEmbedViewFlag}
     * @param embedViewFlag
     */
    @JsonIgnore
    public PSViewType embedviewflag(Boolean embedViewFlag){
        if(embedViewFlag == null){
            this.setEmbedViewFlag(null);
        }
        else{
            this.setEmbedViewFlag(embedViewFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEDYNATOOL</B>&nbsp;支持动态工具建立
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEDYNATOOL = "enabledynatool";

    /**
     * 设置 支持动态工具建立
     * 
     * @param enableDynaTool
     * 
     */
    @JsonProperty(FIELD_ENABLEDYNATOOL)
    public void setEnableDynaTool(Integer enableDynaTool){
        this.set(FIELD_ENABLEDYNATOOL, enableDynaTool);
    }
    
    /**
     * 获取 支持动态工具建立  
     * @return
     */
    @JsonIgnore
    public Integer getEnableDynaTool(){
        Object objValue = this.get(FIELD_ENABLEDYNATOOL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持动态工具建立 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableDynaToolDirty(){
        if(this.contains(FIELD_ENABLEDYNATOOL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持动态工具建立
     */
    @JsonIgnore
    public void resetEnableDynaTool(){
        this.reset(FIELD_ENABLEDYNATOOL);
    }

    /**
     * 设置 支持动态工具建立
     * <P>
     * 等同 {@link #setEnableDynaTool}
     * @param enableDynaTool
     */
    @JsonIgnore
    public PSViewType enabledynatool(Integer enableDynaTool){
        this.setEnableDynaTool(enableDynaTool);
        return this;
    }

     /**
     * 设置 支持动态工具建立
     * <P>
     * 等同 {@link #setEnableDynaTool}
     * @param enableDynaTool
     */
    @JsonIgnore
    public PSViewType enabledynatool(Boolean enableDynaTool){
        if(enableDynaTool == null){
            this.setEnableDynaTool(null);
        }
        else{
            this.setEnableDynaTool(enableDynaTool?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSViewType iconpath(String iconPath){
        this.setIconPath(iconPath);
        return this;
    }

    /**
     * <B>LAYOUTMODEL</B>&nbsp;布局模型
     */
    public final static String FIELD_LAYOUTMODEL = "layoutmodel";

    /**
     * 设置 布局模型
     * 
     * @param layoutModel
     * 
     */
    @JsonProperty(FIELD_LAYOUTMODEL)
    public void setLayoutModel(String layoutModel){
        this.set(FIELD_LAYOUTMODEL, layoutModel);
    }
    
    /**
     * 获取 布局模型  
     * @return
     */
    @JsonIgnore
    public String getLayoutModel(){
        Object objValue = this.get(FIELD_LAYOUTMODEL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 布局模型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutModelDirty(){
        if(this.contains(FIELD_LAYOUTMODEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局模型
     */
    @JsonIgnore
    public void resetLayoutModel(){
        this.reset(FIELD_LAYOUTMODEL);
    }

    /**
     * 设置 布局模型
     * <P>
     * 等同 {@link #setLayoutModel}
     * @param layoutModel
     */
    @JsonIgnore
    public PSViewType layoutmodel(String layoutModel){
        this.setLayoutModel(layoutModel);
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
    public PSViewType memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;显示排序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 显示排序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 显示排序  
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
     * 判断 显示排序 是否指定值，包括空值
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
     * 重置 显示排序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 显示排序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSViewType ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSVIEWENGINEID</B>&nbsp;视图引擎
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVIEWENGINEID = "psviewengineid";

    /**
     * 设置 视图引擎
     * 
     * @param pSViewEngineId
     * 
     */
    @JsonProperty(FIELD_PSVIEWENGINEID)
    public void setPSViewEngineId(String pSViewEngineId){
        this.set(FIELD_PSVIEWENGINEID, pSViewEngineId);
    }
    
    /**
     * 获取 视图引擎  
     * @return
     */
    @JsonIgnore
    public String getPSViewEngineId(){
        Object objValue = this.get(FIELD_PSVIEWENGINEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewEngineIdDirty(){
        if(this.contains(FIELD_PSVIEWENGINEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎
     */
    @JsonIgnore
    public void resetPSViewEngineId(){
        this.reset(FIELD_PSVIEWENGINEID);
    }

    /**
     * 设置 视图引擎
     * <P>
     * 等同 {@link #setPSViewEngineId}
     * @param pSViewEngineId
     */
    @JsonIgnore
    public PSViewType psviewengineid(String pSViewEngineId){
        this.setPSViewEngineId(pSViewEngineId);
        return this;
    }

    /**
     * <B>PSVIEWENGINENAME</B>&nbsp;视图引擎
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWENGINEID}
     */
    public final static String FIELD_PSVIEWENGINENAME = "psviewenginename";

    /**
     * 设置 视图引擎
     * 
     * @param pSViewEngineName
     * 
     */
    @JsonProperty(FIELD_PSVIEWENGINENAME)
    public void setPSViewEngineName(String pSViewEngineName){
        this.set(FIELD_PSVIEWENGINENAME, pSViewEngineName);
    }
    
    /**
     * 获取 视图引擎  
     * @return
     */
    @JsonIgnore
    public String getPSViewEngineName(){
        Object objValue = this.get(FIELD_PSVIEWENGINENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图引擎 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewEngineNameDirty(){
        if(this.contains(FIELD_PSVIEWENGINENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图引擎
     */
    @JsonIgnore
    public void resetPSViewEngineName(){
        this.reset(FIELD_PSVIEWENGINENAME);
    }

    /**
     * 设置 视图引擎
     * <P>
     * 等同 {@link #setPSViewEngineName}
     * @param pSViewEngineName
     */
    @JsonIgnore
    public PSViewType psviewenginename(String pSViewEngineName){
        this.setPSViewEngineName(pSViewEngineName);
        return this;
    }

    /**
     * <B>PSVIEWTYPEID</B>&nbsp;视图类型标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSVIEWTYPEID = "psviewtypeid";

    /**
     * 设置 视图类型标识
     * 
     * @param pSViewTypeId
     * 
     */
    @JsonProperty(FIELD_PSVIEWTYPEID)
    public void setPSViewTypeId(String pSViewTypeId){
        this.set(FIELD_PSVIEWTYPEID, pSViewTypeId);
    }
    
    /**
     * 获取 视图类型标识  
     * @return
     */
    @JsonIgnore
    public String getPSViewTypeId(){
        Object objValue = this.get(FIELD_PSVIEWTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewTypeIdDirty(){
        if(this.contains(FIELD_PSVIEWTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型标识
     */
    @JsonIgnore
    public void resetPSViewTypeId(){
        this.reset(FIELD_PSVIEWTYPEID);
    }

    /**
     * 设置 视图类型标识
     * <P>
     * 等同 {@link #setPSViewTypeId}
     * @param pSViewTypeId
     */
    @JsonIgnore
    public PSViewType psviewtypeid(String pSViewTypeId){
        this.setPSViewTypeId(pSViewTypeId);
        return this;
    }

    /**
     * <B>PSVIEWTYPENAME</B>&nbsp;视图类型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSVIEWTYPENAME = "psviewtypename";

    /**
     * 设置 视图类型名称
     * 
     * @param pSViewTypeName
     * 
     */
    @JsonProperty(FIELD_PSVIEWTYPENAME)
    public void setPSViewTypeName(String pSViewTypeName){
        this.set(FIELD_PSVIEWTYPENAME, pSViewTypeName);
    }
    
    /**
     * 获取 视图类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSViewTypeName(){
        Object objValue = this.get(FIELD_PSVIEWTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewTypeNameDirty(){
        if(this.contains(FIELD_PSVIEWTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型名称
     */
    @JsonIgnore
    public void resetPSViewTypeName(){
        this.reset(FIELD_PSVIEWTYPENAME);
    }

    /**
     * 设置 视图类型名称
     * <P>
     * 等同 {@link #setPSViewTypeName}
     * @param pSViewTypeName
     */
    @JsonIgnore
    public PSViewType psviewtypename(String pSViewTypeName){
        this.setPSViewTypeName(pSViewTypeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSViewTypeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSViewTypeName(strName);
    }

    @JsonIgnore
    public PSViewType name(String strName){
        this.setPSViewTypeName(strName);
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 标题
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 标题  
     * @return
     */
    @JsonIgnore
    public String getTitle(){
        Object objValue = this.get(FIELD_TITLE);
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
    public boolean isTitleDirty(){
        if(this.contains(FIELD_TITLE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 标题
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSViewType title(String title){
        this.setTitle(title);
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
    public PSViewType updatedate(String updateDate){
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
    public PSViewType updateman(String updateMan){
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
    public PSViewType usercat(String userCat){
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
    public PSViewType usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSViewType usertag(String userTag){
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
    public PSViewType usertag2(String userTag2){
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
    public PSViewType usertag3(String userTag3){
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
    public PSViewType usertag4(String userTag4){
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
    public PSViewType validflag(Integer validFlag){
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
    public PSViewType validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWOBJINT</B>&nbsp;视图对象接口
     * <P>
     * 字符串：最大长度 250
     */
    public final static String FIELD_VIEWOBJINT = "viewobjint";

    /**
     * 设置 视图对象接口
     * 
     * @param viewObjInt
     * 
     */
    @JsonProperty(FIELD_VIEWOBJINT)
    public void setViewObjInt(String viewObjInt){
        this.set(FIELD_VIEWOBJINT, viewObjInt);
    }
    
    /**
     * 获取 视图对象接口  
     * @return
     */
    @JsonIgnore
    public String getViewObjInt(){
        Object objValue = this.get(FIELD_VIEWOBJINT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图对象接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewObjIntDirty(){
        if(this.contains(FIELD_VIEWOBJINT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图对象接口
     */
    @JsonIgnore
    public void resetViewObjInt(){
        this.reset(FIELD_VIEWOBJINT);
    }

    /**
     * 设置 视图对象接口
     * <P>
     * 等同 {@link #setViewObjInt}
     * @param viewObjInt
     */
    @JsonIgnore
    public PSViewType viewobjint(String viewObjInt){
        this.setViewObjInt(viewObjInt);
        return this;
    }

    /**
     * <B>VTFULLSN</B>&nbsp;视图类型长编号
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_VTFULLSN = "vtfullsn";

    /**
     * 设置 视图类型长编号
     * 
     * @param vTFullSN
     * 
     */
    @JsonProperty(FIELD_VTFULLSN)
    public void setVTFullSN(String vTFullSN){
        this.set(FIELD_VTFULLSN, vTFullSN);
    }
    
    /**
     * 获取 视图类型长编号  
     * @return
     */
    @JsonIgnore
    public String getVTFullSN(){
        Object objValue = this.get(FIELD_VTFULLSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型长编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVTFullSNDirty(){
        if(this.contains(FIELD_VTFULLSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型长编号
     */
    @JsonIgnore
    public void resetVTFullSN(){
        this.reset(FIELD_VTFULLSN);
    }

    /**
     * 设置 视图类型长编号
     * <P>
     * 等同 {@link #setVTFullSN}
     * @param vTFullSN
     */
    @JsonIgnore
    public PSViewType vtfullsn(String vTFullSN){
        this.setVTFullSN(vTFullSN);
        return this;
    }

    /**
     * <B>VTSN</B>&nbsp;视图类型编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VTSN = "vtsn";

    /**
     * 设置 视图类型编号
     * 
     * @param vTSN
     * 
     */
    @JsonProperty(FIELD_VTSN)
    public void setVTSN(String vTSN){
        this.set(FIELD_VTSN, vTSN);
    }
    
    /**
     * 获取 视图类型编号  
     * @return
     */
    @JsonIgnore
    public String getVTSN(){
        Object objValue = this.get(FIELD_VTSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVTSNDirty(){
        if(this.contains(FIELD_VTSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型编号
     */
    @JsonIgnore
    public void resetVTSN(){
        this.reset(FIELD_VTSN);
    }

    /**
     * 设置 视图类型编号
     * <P>
     * 等同 {@link #setVTSN}
     * @param vTSN
     */
    @JsonIgnore
    public PSViewType vtsn(String vTSN){
        this.setVTSN(vTSN);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSViewTypeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSViewTypeId(strValue);
    }

    @JsonIgnore
    public PSViewType id(String strValue){
        this.setPSViewTypeId(strValue);
        return this;
    }
    
    /**
     *  视图类型部件 成员集合
     */
    public final static String FIELD_PSVTCTRLS = "psvtctrls";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> psvtctrls;

    /**
     * 获取 视图类型部件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSVTCTRLS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> getPSVTCtrls(){
        return this.psvtctrls;
    }

    /**
     * 设置 视图类型部件 成员集合  
     * @param psvtctrls
     */
    @JsonProperty(FIELD_PSVTCTRLS)
    public void setPSVTCtrls(java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> psvtctrls){
        this.psvtctrls = psvtctrls;
    }

    /**
     * 获取 视图类型部件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> getPSVTCtrlsIf(){
        if(this.psvtctrls == null){
            this.psvtctrls = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSVTCtrl>();          
        }
        return this.psvtctrls;
    }
    
    
//    /**
//     *  视图类型引用视图 成员集合
//     */
//    public final static String FIELD_PSVTRVS = "psvtrvs";
//
//    private java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> psvtrvs;
//
//    /**
//     * 获取 视图类型引用视图 成员集合
//     * @return
//     */
//    @JsonProperty(FIELD_PSVTRVS)
//    public java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> getPSVTCtrls(){
//        return this.psvtrvs;
//    }
//
//    /**
//     * 设置 视图类型引用视图 成员集合  
//     * @param psvtrvs
//     */
//    @JsonProperty(FIELD_PSVTRVS)
//    public void setPSVTCtrls(java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> psvtrvs){
//        this.psvtrvs = psvtrvs;
//    }
//
//    /**
//     * 获取 视图类型引用视图 成员集合，不存在时建立集合对象
//     * @return
//     */
//    @JsonIgnore
//    public java.util.List<net.ibizsys.psmodel.core.domain.PSVTCtrl> getPSVTCtrlsIf(){
//        if(this.psvtrvs == null){
//            this.psvtrvs = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSVTCtrl>();          
//        }
//        return this.psvtrvs;
//    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSViewType){
            PSViewType model = (PSViewType)iPSModel;
            model.setPSVTCtrls(this.getPSVTCtrls());
        }
        super.copyTo(iPSModel);
    }
}
