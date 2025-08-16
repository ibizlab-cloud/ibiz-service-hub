package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEVIEWRV</B>实体视图关联视图 模型传输对象
 * <P>
 * 实体视图的关联视图模型，视图类型内置的处理逻辑会涉及视图的使用，关联视图就是将相关视图按照逻辑约定的标记注册到视图中供逻辑使用。注意：关联视图支持重新定义引用视图的打开方式、高度、宽度等，但某些模板受限于技术或代码组织会仅使用引用视图配置，在配置时需要确定模板的特性
 */
public class PSDEViewRV extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEViewRV(){
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
    public PSDEViewRV createdate(String createDate){
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
    public PSDEViewRV createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFVIEWTYPE</B>&nbsp;预置功能视图，指定引用视图指向的预置功能视图，在未具体指定关联视图对象时尝试从视图所在实体获取指定功能模式的视图
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedViewType} 
     */
    public final static String FIELD_DEFVIEWTYPE = "defviewtype";

    /**
     * 设置 预置功能视图，详细说明：{@link #FIELD_DEFVIEWTYPE}
     * 
     * @param defViewType
     * 
     */
    @JsonProperty(FIELD_DEFVIEWTYPE)
    public void setDefViewType(String defViewType){
        this.set(FIELD_DEFVIEWTYPE, defViewType);
    }
    
    /**
     * 获取 预置功能视图  
     * @return
     */
    @JsonIgnore
    public String getDefViewType(){
        Object objValue = this.get(FIELD_DEFVIEWTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 预置功能视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefViewTypeDirty(){
        if(this.contains(FIELD_DEFVIEWTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 预置功能视图
     */
    @JsonIgnore
    public void resetDefViewType(){
        this.reset(FIELD_DEFVIEWTYPE);
    }

    /**
     * 设置 预置功能视图，详细说明：{@link #FIELD_DEFVIEWTYPE}
     * <P>
     * 等同 {@link #setDefViewType}
     * @param defViewType
     */
    @JsonIgnore
    public PSDEViewRV defviewtype(String defViewType){
        this.setDefViewType(defViewType);
        return this;
    }

     /**
     * 设置 预置功能视图，详细说明：{@link #FIELD_DEFVIEWTYPE}
     * <P>
     * 等同 {@link #setDefViewType}
     * @param defViewType
     */
    @JsonIgnore
    public PSDEViewRV defviewtype(net.ibizsys.psmodel.core.util.PSModelEnums.PredefinedViewType defViewType){
        if(defViewType == null){
            this.setDefViewType(null);
        }
        else{
            this.setDefViewType(defViewType.value);
        }
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定关联视图的高度，未定义时使用视图默认
     */
    public final static String FIELD_HEIGHT = "height";

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * 
     * @param height
     * 
     */
    @JsonProperty(FIELD_HEIGHT)
    public void setHeight(Integer height){
        this.set(FIELD_HEIGHT, height);
    }
    
    /**
     * 获取 高度  
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
     * 判断 高度 是否指定值，包括空值
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
     * 重置 高度
     */
    @JsonIgnore
    public void resetHeight(){
        this.reset(FIELD_HEIGHT);
    }

    /**
     * 设置 高度，详细说明：{@link #FIELD_HEIGHT}
     * <P>
     * 等同 {@link #setHeight}
     * @param height
     */
    @JsonIgnore
    public PSDEViewRV height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>MAJORPSDEVIEWID</B>&nbsp;主实体视图，指定视图引用所在的实体视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MAJORPSDEVIEWID = "majorpsdeviewid";

    /**
     * 设置 主实体视图，详细说明：{@link #FIELD_MAJORPSDEVIEWID}
     * 
     * @param majorPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEVIEWID)
    public void setMajorPSDEViewId(String majorPSDEViewId){
        this.set(FIELD_MAJORPSDEVIEWID, majorPSDEViewId);
    }
    
    /**
     * 获取 主实体视图  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEViewId(){
        Object objValue = this.get(FIELD_MAJORPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEViewIdDirty(){
        if(this.contains(FIELD_MAJORPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体视图
     */
    @JsonIgnore
    public void resetMajorPSDEViewId(){
        this.reset(FIELD_MAJORPSDEVIEWID);
    }

    /**
     * 设置 主实体视图，详细说明：{@link #FIELD_MAJORPSDEVIEWID}
     * <P>
     * 等同 {@link #setMajorPSDEViewId}
     * @param majorPSDEViewId
     */
    @JsonIgnore
    public PSDEViewRV majorpsdeviewid(String majorPSDEViewId){
        this.setMajorPSDEViewId(majorPSDEViewId);
        return this;
    }

    /**
     * 设置 主实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEViewRV majorpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMajorPSDEViewId(null);
            this.setMajorPSDEViewName(null);
        }
        else{
            this.setMajorPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMajorPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDEVIEWNAME</B>&nbsp;主实体视图，指定视图引用所在的实体视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEVIEWID}
     */
    public final static String FIELD_MAJORPSDEVIEWNAME = "majorpsdeviewname";

    /**
     * 设置 主实体视图，详细说明：{@link #FIELD_MAJORPSDEVIEWNAME}
     * 
     * @param majorPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEVIEWNAME)
    public void setMajorPSDEViewName(String majorPSDEViewName){
        this.set(FIELD_MAJORPSDEVIEWNAME, majorPSDEViewName);
    }
    
    /**
     * 获取 主实体视图  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEViewName(){
        Object objValue = this.get(FIELD_MAJORPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEViewNameDirty(){
        if(this.contains(FIELD_MAJORPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体视图
     */
    @JsonIgnore
    public void resetMajorPSDEViewName(){
        this.reset(FIELD_MAJORPSDEVIEWNAME);
    }

    /**
     * 设置 主实体视图，详细说明：{@link #FIELD_MAJORPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMajorPSDEViewName}
     * @param majorPSDEViewName
     */
    @JsonIgnore
    public PSDEViewRV majorpsdeviewname(String majorPSDEViewName){
        this.setMajorPSDEViewName(majorPSDEViewName);
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
    public PSDEViewRV memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORPSDEVIEWID</B>&nbsp;关联实体视图，指定引用视图指向的关联视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_MINORPSDEVIEWID = "minorpsdeviewid";

    /**
     * 设置 关联实体视图，详细说明：{@link #FIELD_MINORPSDEVIEWID}
     * 
     * @param minorPSDEViewId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEVIEWID)
    public void setMinorPSDEViewId(String minorPSDEViewId){
        this.set(FIELD_MINORPSDEVIEWID, minorPSDEViewId);
    }
    
    /**
     * 获取 关联实体视图  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEViewId(){
        Object objValue = this.get(FIELD_MINORPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEViewIdDirty(){
        if(this.contains(FIELD_MINORPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体视图
     */
    @JsonIgnore
    public void resetMinorPSDEViewId(){
        this.reset(FIELD_MINORPSDEVIEWID);
    }

    /**
     * 设置 关联实体视图，详细说明：{@link #FIELD_MINORPSDEVIEWID}
     * <P>
     * 等同 {@link #setMinorPSDEViewId}
     * @param minorPSDEViewId
     */
    @JsonIgnore
    public PSDEViewRV minorpsdeviewid(String minorPSDEViewId){
        this.setMinorPSDEViewId(minorPSDEViewId);
        return this;
    }

    /**
     * 设置 关联实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEViewRV minorpsdeviewid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setMinorPSDEViewId(null);
            this.setMinorPSDEViewName(null);
        }
        else{
            this.setMinorPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setMinorPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>MINORPSDEVIEWNAME</B>&nbsp;关联实体视图，指定引用视图指向的关联视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEVIEWID}
     */
    public final static String FIELD_MINORPSDEVIEWNAME = "minorpsdeviewname";

    /**
     * 设置 关联实体视图，详细说明：{@link #FIELD_MINORPSDEVIEWNAME}
     * 
     * @param minorPSDEViewName
     * 
     */
    @JsonProperty(FIELD_MINORPSDEVIEWNAME)
    public void setMinorPSDEViewName(String minorPSDEViewName){
        this.set(FIELD_MINORPSDEVIEWNAME, minorPSDEViewName);
    }
    
    /**
     * 获取 关联实体视图  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEViewName(){
        Object objValue = this.get(FIELD_MINORPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEViewNameDirty(){
        if(this.contains(FIELD_MINORPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联实体视图
     */
    @JsonIgnore
    public void resetMinorPSDEViewName(){
        this.reset(FIELD_MINORPSDEVIEWNAME);
    }

    /**
     * 设置 关联实体视图，详细说明：{@link #FIELD_MINORPSDEVIEWNAME}
     * <P>
     * 等同 {@link #setMinorPSDEViewName}
     * @param minorPSDEViewName
     */
    @JsonIgnore
    public PSDEViewRV minorpsdeviewname(String minorPSDEViewName){
        this.setMinorPSDEViewName(minorPSDEViewName);
        return this;
    }

    /**
     * <B>OPENMODE</B>&nbsp;打开方式，指定关联视图的打开方式，未定义时使用视图默认
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OpenViewMode} 
     */
    public final static String FIELD_OPENMODE = "openmode";

    /**
     * 设置 打开方式，详细说明：{@link #FIELD_OPENMODE}
     * 
     * @param openMode
     * 
     */
    @JsonProperty(FIELD_OPENMODE)
    public void setOpenMode(String openMode){
        this.set(FIELD_OPENMODE, openMode);
    }
    
    /**
     * 获取 打开方式  
     * @return
     */
    @JsonIgnore
    public String getOpenMode(){
        Object objValue = this.get(FIELD_OPENMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 打开方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOpenModeDirty(){
        if(this.contains(FIELD_OPENMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 打开方式
     */
    @JsonIgnore
    public void resetOpenMode(){
        this.reset(FIELD_OPENMODE);
    }

    /**
     * 设置 打开方式，详细说明：{@link #FIELD_OPENMODE}
     * <P>
     * 等同 {@link #setOpenMode}
     * @param openMode
     */
    @JsonIgnore
    public PSDEViewRV openmode(String openMode){
        this.setOpenMode(openMode);
        return this;
    }

     /**
     * 设置 打开方式，详细说明：{@link #FIELD_OPENMODE}
     * <P>
     * 等同 {@link #setOpenMode}
     * @param openMode
     */
    @JsonIgnore
    public PSDEViewRV openmode(net.ibizsys.psmodel.core.util.PSModelEnums.OpenViewMode openMode){
        if(openMode == null){
            this.setOpenMode(null);
        }
        else{
            this.setOpenMode(openMode.value);
        }
        return this;
    }

    /**
     * <B>PSDEVIEWRVID</B>&nbsp;实体视图关联视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVIEWRVID = "psdeviewrvid";

    /**
     * 设置 实体视图关联视图标识
     * 
     * @param pSDEViewRVId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWRVID)
    public void setPSDEViewRVId(String pSDEViewRVId){
        this.set(FIELD_PSDEVIEWRVID, pSDEViewRVId);
    }
    
    /**
     * 获取 实体视图关联视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewRVId(){
        Object objValue = this.get(FIELD_PSDEVIEWRVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图关联视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewRVIdDirty(){
        if(this.contains(FIELD_PSDEVIEWRVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图关联视图标识
     */
    @JsonIgnore
    public void resetPSDEViewRVId(){
        this.reset(FIELD_PSDEVIEWRVID);
    }

    /**
     * 设置 实体视图关联视图标识
     * <P>
     * 等同 {@link #setPSDEViewRVId}
     * @param pSDEViewRVId
     */
    @JsonIgnore
    public PSDEViewRV psdeviewrvid(String pSDEViewRVId){
        this.setPSDEViewRVId(pSDEViewRVId);
        return this;
    }

    /**
     * <B>PSDEVIEWRVNAME</B>&nbsp;关联视图模式，指定关联视图的模式，必须在所在视图具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVIEWRVNAME = "psdeviewrvname";

    /**
     * 设置 关联视图模式，详细说明：{@link #FIELD_PSDEVIEWRVNAME}
     * 
     * @param pSDEViewRVName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWRVNAME)
    public void setPSDEViewRVName(String pSDEViewRVName){
        this.set(FIELD_PSDEVIEWRVNAME, pSDEViewRVName);
    }
    
    /**
     * 获取 关联视图模式  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewRVName(){
        Object objValue = this.get(FIELD_PSDEVIEWRVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关联视图模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewRVNameDirty(){
        if(this.contains(FIELD_PSDEVIEWRVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关联视图模式
     */
    @JsonIgnore
    public void resetPSDEViewRVName(){
        this.reset(FIELD_PSDEVIEWRVNAME);
    }

    /**
     * 设置 关联视图模式，详细说明：{@link #FIELD_PSDEVIEWRVNAME}
     * <P>
     * 等同 {@link #setPSDEViewRVName}
     * @param pSDEViewRVName
     */
    @JsonIgnore
    public PSDEViewRV psdeviewrvname(String pSDEViewRVName){
        this.setPSDEViewRVName(pSDEViewRVName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEViewRVName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEViewRVName(strName);
    }

    @JsonIgnore
    public PSDEViewRV name(String strName){
        this.setPSDEViewRVName(strName);
        return this;
    }

    /**
     * <B>REFMODE</B>&nbsp;引用模式，指定关联视图的引用模式，与引用参数一起形成关联视图模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_REFMODE = "refmode";

    /**
     * 设置 引用模式，详细说明：{@link #FIELD_REFMODE}
     * 
     * @param refMode
     * 
     */
    @JsonProperty(FIELD_REFMODE)
    public void setRefMode(String refMode){
        this.set(FIELD_REFMODE, refMode);
    }
    
    /**
     * 获取 引用模式  
     * @return
     */
    @JsonIgnore
    public String getRefMode(){
        Object objValue = this.get(FIELD_REFMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefModeDirty(){
        if(this.contains(FIELD_REFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模式
     */
    @JsonIgnore
    public void resetRefMode(){
        this.reset(FIELD_REFMODE);
    }

    /**
     * 设置 引用模式，详细说明：{@link #FIELD_REFMODE}
     * <P>
     * 等同 {@link #setRefMode}
     * @param refMode
     */
    @JsonIgnore
    public PSDEViewRV refmode(String refMode){
        this.setRefMode(refMode);
        return this;
    }

    /**
     * <B>REFPARAM</B>&nbsp;引用参数，指定关联视图的引用参数，与引用模式一起形成关联视图模式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFPARAM = "refparam";

    /**
     * 设置 引用参数，详细说明：{@link #FIELD_REFPARAM}
     * 
     * @param refParam
     * 
     */
    @JsonProperty(FIELD_REFPARAM)
    public void setRefParam(String refParam){
        this.set(FIELD_REFPARAM, refParam);
    }
    
    /**
     * 获取 引用参数  
     * @return
     */
    @JsonIgnore
    public String getRefParam(){
        Object objValue = this.get(FIELD_REFPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefParamDirty(){
        if(this.contains(FIELD_REFPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用参数
     */
    @JsonIgnore
    public void resetRefParam(){
        this.reset(FIELD_REFPARAM);
    }

    /**
     * 设置 引用参数，详细说明：{@link #FIELD_REFPARAM}
     * <P>
     * 等同 {@link #setRefParam}
     * @param refParam
     */
    @JsonIgnore
    public PSDEViewRV refparam(String refParam){
        this.setRefParam(refParam);
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;抬头，指定关联视图的标题，未定义时使用视图默认
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 抬头，详细说明：{@link #FIELD_TITLE}
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 抬头  
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
     * 判断 抬头 是否指定值，包括空值
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
     * 重置 抬头
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 抬头，详细说明：{@link #FIELD_TITLE}
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSDEViewRV title(String title){
        this.setTitle(title);
        return this;
    }

    /**
     * <B>TITLEPSLANRESID</B>&nbsp;标题语言资源，指定关联视图的标题的多语言资源对象，未定义时使用视图默认
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_TITLEPSLANRESID = "titlepslanresid";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * 
     * @param titlePSLanResId
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESID)
    public void setTitlePSLanResId(String titlePSLanResId){
        this.set(FIELD_TITLEPSLANRESID, titlePSLanResId);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResId(){
        Object objValue = this.get(FIELD_TITLEPSLANRESID);
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
    public boolean isTitlePSLanResIdDirty(){
        if(this.contains(FIELD_TITLEPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResId(){
        this.reset(FIELD_TITLEPSLANRESID);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param titlePSLanResId
     */
    @JsonIgnore
    public PSDEViewRV titlepslanresid(String titlePSLanResId){
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    /**
     * 设置 标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEViewRV titlepslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setTitlePSLanResId(null);
            this.setTitlePSLanResName(null);
        }
        else{
            this.setTitlePSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setTitlePSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>TITLEPSLANRESNAME</B>&nbsp;标题语言资源，指定关联视图的标题的多语言资源对象，未定义时使用视图默认
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSLANRESID}
     */
    public final static String FIELD_TITLEPSLANRESNAME = "titlepslanresname";

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * 
     * @param titlePSLanResName
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESNAME)
    public void setTitlePSLanResName(String titlePSLanResName){
        this.set(FIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }
    
    /**
     * 获取 标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getTitlePSLanResName(){
        Object objValue = this.get(FIELD_TITLEPSLANRESNAME);
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
    public boolean isTitlePSLanResNameDirty(){
        if(this.contains(FIELD_TITLEPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标题语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResName(){
        this.reset(FIELD_TITLEPSLANRESNAME);
    }

    /**
     * 设置 标题语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setTitlePSLanResName}
     * @param titlePSLanResName
     */
    @JsonIgnore
    public PSDEViewRV titlepslanresname(String titlePSLanResName){
        this.setTitlePSLanResName(titlePSLanResName);
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
    public PSDEViewRV updatedate(String updateDate){
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
    public PSDEViewRV updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSDEViewRV usertag(String userTag){
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
    public PSDEViewRV usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VIEWPARAMS</B>&nbsp;视图参数，指定关联视图的动态视图参数，将与视图默认参数合并
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VIEWPARAMS = "viewparams";

    /**
     * 设置 视图参数，详细说明：{@link #FIELD_VIEWPARAMS}
     * 
     * @param viewParams
     * 
     */
    @JsonProperty(FIELD_VIEWPARAMS)
    public void setViewParams(String viewParams){
        this.set(FIELD_VIEWPARAMS, viewParams);
    }
    
    /**
     * 获取 视图参数  
     * @return
     */
    @JsonIgnore
    public String getViewParams(){
        Object objValue = this.get(FIELD_VIEWPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParamsDirty(){
        if(this.contains(FIELD_VIEWPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数
     */
    @JsonIgnore
    public void resetViewParams(){
        this.reset(FIELD_VIEWPARAMS);
    }

    /**
     * 设置 视图参数，详细说明：{@link #FIELD_VIEWPARAMS}
     * <P>
     * 等同 {@link #setViewParams}
     * @param viewParams
     */
    @JsonIgnore
    public PSDEViewRV viewparams(String viewParams){
        this.setViewParams(viewParams);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定关联视图的宽度，未定义时使用视图默认
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
    public PSDEViewRV width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEViewRVId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEViewRVId(strValue);
    }

    @JsonIgnore
    public PSDEViewRV id(String strValue){
        this.setPSDEViewRVId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEViewRV){
            PSDEViewRV model = (PSDEViewRV)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
