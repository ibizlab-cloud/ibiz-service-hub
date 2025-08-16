package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSIMAGE</B>系统图片资源 模型传输对象
 * <P>
 * 系统统一的图片资源模型，支持定义图片的规格、来源及其它的参数
 */
public class PSSysImage extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysImage(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定图片资源的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
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
    public PSSysImage codename(String codeName){
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
    public PSSysImage createdate(String createDate){
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
    public PSSysImage createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CSSCLASS</B>&nbsp;样式表名称，指定图片资源的样式表名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CSSCLASS = "cssclass";

    /**
     * 设置 样式表名称，详细说明：{@link #FIELD_CSSCLASS}
     * 
     * @param cssClass
     * 
     */
    @JsonProperty(FIELD_CSSCLASS)
    public void setCssClass(String cssClass){
        this.set(FIELD_CSSCLASS, cssClass);
    }
    
    /**
     * 获取 样式表名称  
     * @return
     */
    @JsonIgnore
    public String getCssClass(){
        Object objValue = this.get(FIELD_CSSCLASS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCssClassDirty(){
        if(this.contains(FIELD_CSSCLASS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表名称
     */
    @JsonIgnore
    public void resetCssClass(){
        this.reset(FIELD_CSSCLASS);
    }

    /**
     * 设置 样式表名称，详细说明：{@link #FIELD_CSSCLASS}
     * <P>
     * 等同 {@link #setCssClass}
     * @param cssClass
     */
    @JsonIgnore
    public PSSysImage cssclass(String cssClass){
        this.setCssClass(cssClass);
        return this;
    }

    /**
     * <B>CSSCLASSX</B>&nbsp;样式表名称（X），指定图片资源的动态规格样式表名称，提供占位符供外部代入显示规格
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CSSCLASSX = "cssclassx";

    /**
     * 设置 样式表名称（X），详细说明：{@link #FIELD_CSSCLASSX}
     * 
     * @param cssClassX
     * 
     */
    @JsonProperty(FIELD_CSSCLASSX)
    public void setCssClassX(String cssClassX){
        this.set(FIELD_CSSCLASSX, cssClassX);
    }
    
    /**
     * 获取 样式表名称（X）  
     * @return
     */
    @JsonIgnore
    public String getCssClassX(){
        Object objValue = this.get(FIELD_CSSCLASSX);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 样式表名称（X） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCssClassXDirty(){
        if(this.contains(FIELD_CSSCLASSX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 样式表名称（X）
     */
    @JsonIgnore
    public void resetCssClassX(){
        this.reset(FIELD_CSSCLASSX);
    }

    /**
     * 设置 样式表名称（X），详细说明：{@link #FIELD_CSSCLASSX}
     * <P>
     * 等同 {@link #setCssClassX}
     * @param cssClassX
     */
    @JsonIgnore
    public PSSysImage cssclassx(String cssClassX){
        this.setCssClassX(cssClassX);
        return this;
    }

    /**
     * <B>GLYPH</B>&nbsp;字体标识，指定字符图片资源的字体标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_GLYPH = "glyph";

    /**
     * 设置 字体标识，详细说明：{@link #FIELD_GLYPH}
     * 
     * @param glyph
     * 
     */
    @JsonProperty(FIELD_GLYPH)
    public void setGlyph(String glyph){
        this.set(FIELD_GLYPH, glyph);
    }
    
    /**
     * 获取 字体标识  
     * @return
     */
    @JsonIgnore
    public String getGlyph(){
        Object objValue = this.get(FIELD_GLYPH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 字体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGlyphDirty(){
        if(this.contains(FIELD_GLYPH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 字体标识
     */
    @JsonIgnore
    public void resetGlyph(){
        this.reset(FIELD_GLYPH);
    }

    /**
     * 设置 字体标识，详细说明：{@link #FIELD_GLYPH}
     * <P>
     * 等同 {@link #setGlyph}
     * @param glyph
     */
    @JsonIgnore
    public PSSysImage glyph(String glyph){
        this.setGlyph(glyph);
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定图片的高度，未定义时为【0】
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
    public PSSysImage height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>IMAGEPATH</B>&nbsp;图片路径，指定图片资源的访问路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_IMAGEPATH = "imagepath";

    /**
     * 设置 图片路径，详细说明：{@link #FIELD_IMAGEPATH}
     * 
     * @param imagePath
     * 
     */
    @JsonProperty(FIELD_IMAGEPATH)
    public void setImagePath(String imagePath){
        this.set(FIELD_IMAGEPATH, imagePath);
    }
    
    /**
     * 获取 图片路径  
     * @return
     */
    @JsonIgnore
    public String getImagePath(){
        Object objValue = this.get(FIELD_IMAGEPATH);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图片路径 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImagePathDirty(){
        if(this.contains(FIELD_IMAGEPATH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图片路径
     */
    @JsonIgnore
    public void resetImagePath(){
        this.reset(FIELD_IMAGEPATH);
    }

    /**
     * 设置 图片路径，详细说明：{@link #FIELD_IMAGEPATH}
     * <P>
     * 等同 {@link #setImagePath}
     * @param imagePath
     */
    @JsonIgnore
    public PSSysImage imagepath(String imagePath){
        this.setImagePath(imagePath);
        return this;
    }

    /**
     * <B>IMAGEPATHX</B>&nbsp;图片路径（X），指定图片资源的动态规格访问路径，提供占位符供外部代入显示规格
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_IMAGEPATHX = "imagepathx";

    /**
     * 设置 图片路径（X），详细说明：{@link #FIELD_IMAGEPATHX}
     * 
     * @param imagePathX
     * 
     */
    @JsonProperty(FIELD_IMAGEPATHX)
    public void setImagePathX(String imagePathX){
        this.set(FIELD_IMAGEPATHX, imagePathX);
    }
    
    /**
     * 获取 图片路径（X）  
     * @return
     */
    @JsonIgnore
    public String getImagePathX(){
        Object objValue = this.get(FIELD_IMAGEPATHX);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 图片路径（X） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImagePathXDirty(){
        if(this.contains(FIELD_IMAGEPATHX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 图片路径（X）
     */
    @JsonIgnore
    public void resetImagePathX(){
        this.reset(FIELD_IMAGEPATHX);
    }

    /**
     * 设置 图片路径（X），详细说明：{@link #FIELD_IMAGEPATHX}
     * <P>
     * 等同 {@link #setImagePathX}
     * @param imagePathX
     */
    @JsonIgnore
    public PSSysImage imagepathx(String imagePathX){
        this.setImagePathX(imagePathX);
        return this;
    }

    /**
     * <B>IMAGESRC</B>&nbsp;来源，指定图片的来源
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ImageSource} 
     */
    public final static String FIELD_IMAGESRC = "imagesrc";

    /**
     * 设置 来源，详细说明：{@link #FIELD_IMAGESRC}
     * 
     * @param imageSrc
     * 
     */
    @JsonProperty(FIELD_IMAGESRC)
    public void setImageSrc(String imageSrc){
        this.set(FIELD_IMAGESRC, imageSrc);
    }
    
    /**
     * 获取 来源  
     * @return
     */
    @JsonIgnore
    public String getImageSrc(){
        Object objValue = this.get(FIELD_IMAGESRC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 来源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImageSrcDirty(){
        if(this.contains(FIELD_IMAGESRC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 来源
     */
    @JsonIgnore
    public void resetImageSrc(){
        this.reset(FIELD_IMAGESRC);
    }

    /**
     * 设置 来源，详细说明：{@link #FIELD_IMAGESRC}
     * <P>
     * 等同 {@link #setImageSrc}
     * @param imageSrc
     */
    @JsonIgnore
    public PSSysImage imagesrc(String imageSrc){
        this.setImageSrc(imageSrc);
        return this;
    }

     /**
     * 设置 来源，详细说明：{@link #FIELD_IMAGESRC}
     * <P>
     * 等同 {@link #setImageSrc}
     * @param imageSrc
     */
    @JsonIgnore
    public PSSysImage imagesrc(net.ibizsys.psmodel.core.util.PSModelEnums.ImageSource imageSrc){
        if(imageSrc == null){
            this.setImageSrc(null);
        }
        else{
            this.setImageSrc(imageSrc.value);
        }
        return this;
    }

    /**
     * <B>IMAGETYPE</B>&nbsp;类型，指定图片的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.ImageType} 
     */
    public final static String FIELD_IMAGETYPE = "imagetype";

    /**
     * 设置 类型，详细说明：{@link #FIELD_IMAGETYPE}
     * 
     * @param imageType
     * 
     */
    @JsonProperty(FIELD_IMAGETYPE)
    public void setImageType(String imageType){
        this.set(FIELD_IMAGETYPE, imageType);
    }
    
    /**
     * 获取 类型  
     * @return
     */
    @JsonIgnore
    public String getImageType(){
        Object objValue = this.get(FIELD_IMAGETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isImageTypeDirty(){
        if(this.contains(FIELD_IMAGETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型
     */
    @JsonIgnore
    public void resetImageType(){
        this.reset(FIELD_IMAGETYPE);
    }

    /**
     * 设置 类型，详细说明：{@link #FIELD_IMAGETYPE}
     * <P>
     * 等同 {@link #setImageType}
     * @param imageType
     */
    @JsonIgnore
    public PSSysImage imagetype(String imageType){
        this.setImageType(imageType);
        return this;
    }

     /**
     * 设置 类型，详细说明：{@link #FIELD_IMAGETYPE}
     * <P>
     * 等同 {@link #setImageType}
     * @param imageType
     */
    @JsonIgnore
    public PSSysImage imagetype(net.ibizsys.psmodel.core.util.PSModelEnums.ImageType imageType){
        if(imageType == null){
            this.setImageType(null);
        }
        else{
            this.setImageType(imageType.value);
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
    public PSSysImage memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSIMAGETEMPLID</B>&nbsp;平台预置图片，指定平台预置的图片资源对象
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSIMAGETEMPLID = "psimagetemplid";

    /**
     * 设置 平台预置图片，详细说明：{@link #FIELD_PSIMAGETEMPLID}
     * 
     * @param pSImageTemplId
     * 
     */
    @JsonProperty(FIELD_PSIMAGETEMPLID)
    public void setPSImageTemplId(String pSImageTemplId){
        this.set(FIELD_PSIMAGETEMPLID, pSImageTemplId);
    }
    
    /**
     * 获取 平台预置图片  
     * @return
     */
    @JsonIgnore
    public String getPSImageTemplId(){
        Object objValue = this.get(FIELD_PSIMAGETEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSImageTemplIdDirty(){
        if(this.contains(FIELD_PSIMAGETEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置图片
     */
    @JsonIgnore
    public void resetPSImageTemplId(){
        this.reset(FIELD_PSIMAGETEMPLID);
    }

    /**
     * 设置 平台预置图片，详细说明：{@link #FIELD_PSIMAGETEMPLID}
     * <P>
     * 等同 {@link #setPSImageTemplId}
     * @param pSImageTemplId
     */
    @JsonIgnore
    public PSSysImage psimagetemplid(String pSImageTemplId){
        this.setPSImageTemplId(pSImageTemplId);
        return this;
    }

    /**
     * <B>PSIMAGETEMPLNAME</B>&nbsp;平台预置图片，指定平台预置的图片资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSIMAGETEMPLID}
     */
    public final static String FIELD_PSIMAGETEMPLNAME = "psimagetemplname";

    /**
     * 设置 平台预置图片，详细说明：{@link #FIELD_PSIMAGETEMPLNAME}
     * 
     * @param pSImageTemplName
     * 
     */
    @JsonProperty(FIELD_PSIMAGETEMPLNAME)
    public void setPSImageTemplName(String pSImageTemplName){
        this.set(FIELD_PSIMAGETEMPLNAME, pSImageTemplName);
    }
    
    /**
     * 获取 平台预置图片  
     * @return
     */
    @JsonIgnore
    public String getPSImageTemplName(){
        Object objValue = this.get(FIELD_PSIMAGETEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 平台预置图片 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSImageTemplNameDirty(){
        if(this.contains(FIELD_PSIMAGETEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 平台预置图片
     */
    @JsonIgnore
    public void resetPSImageTemplName(){
        this.reset(FIELD_PSIMAGETEMPLNAME);
    }

    /**
     * 设置 平台预置图片，详细说明：{@link #FIELD_PSIMAGETEMPLNAME}
     * <P>
     * 等同 {@link #setPSImageTemplName}
     * @param pSImageTemplName
     */
    @JsonIgnore
    public PSSysImage psimagetemplname(String pSImageTemplName){
        this.setPSImageTemplName(pSImageTemplName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统图片资源所在的系统模块
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
    public PSSysImage psmoduleid(String pSModuleId){
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
    public PSSysImage psmoduleid(PSModule pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统图片资源所在的系统模块
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
    public PSSysImage psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 系统图片标识
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 系统图片标识  
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
     * 判断 系统图片标识 是否指定值，包括空值
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
     * 重置 系统图片标识
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 系统图片标识
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSSysImage pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * <B>PSSYSIMAGENAME</B>&nbsp;图片名称，指定图片资源的名称，需在所在模型域（模块或系统）具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 图片名称，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 图片名称  
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
     * 判断 图片名称 是否指定值，包括空值
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
     * 重置 图片名称
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 图片名称，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSSysImage pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysImageName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysImageName(strName);
    }

    @JsonIgnore
    public PSSysImage name(String strName){
        this.setPSSysImageName(strName);
        return this;
    }

    /**
     * <B>RAWCONTENT</B>&nbsp;直接内容，定义图片的直接内容，一般存储图片内容的Base64编码
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
    public PSSysImage rawcontent(String rawContent){
        this.setRawContent(rawContent);
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
    public PSSysImage updatedate(String updateDate){
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
    public PSSysImage updateman(String updateMan){
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
    public PSSysImage usercat(String userCat){
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
    public PSSysImage usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysImage usertag(String userTag){
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
    public PSSysImage usertag2(String userTag2){
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
    public PSSysImage usertag3(String userTag3){
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
    public PSSysImage usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定图片的宽度，未定义时为【0】
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
    public PSSysImage width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysImageId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysImageId(strValue);
    }

    @JsonIgnore
    public PSSysImage id(String strValue){
        this.setPSSysImageId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysImage){
            PSSysImage model = (PSSysImage)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
