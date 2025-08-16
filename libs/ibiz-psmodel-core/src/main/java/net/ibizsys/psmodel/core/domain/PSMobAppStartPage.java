package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSMOBAPPSTARTPAGE</B>移动应用资源 模型传输对象
 * <P>
 * 移动应用资源模型，定义各种规格的起始页或图标
 */
public class PSMobAppStartPage extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSMobAppStartPage(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定移动端应用资源的代码标识，需在所属应用中具备唯一性
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
    public PSMobAppStartPage codename(String codeName){
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
    public PSMobAppStartPage createdate(String createDate){
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
    public PSMobAppStartPage createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSMobAppStartPage memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSAPPVIEWID</B>&nbsp;应用视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppView} 
     */
    public final static String FIELD_PSAPPVIEWID = "psappviewid";

    /**
     * 设置 应用视图
     * 
     * @param pSAppViewId
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWID)
    public void setPSAppViewId(String pSAppViewId){
        this.set(FIELD_PSAPPVIEWID, pSAppViewId);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewId(){
        Object objValue = this.get(FIELD_PSAPPVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewIdDirty(){
        if(this.contains(FIELD_PSAPPVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewId(){
        this.reset(FIELD_PSAPPVIEWID);
    }

    /**
     * 设置 应用视图
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppViewId
     */
    @JsonIgnore
    public PSMobAppStartPage psappviewid(String pSAppViewId){
        this.setPSAppViewId(pSAppViewId);
        return this;
    }

    /**
     * 设置 应用视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppViewId}
     * @param pSAppView 引用对象
     */
    @JsonIgnore
    public PSMobAppStartPage psappviewid(PSAppView pSAppView){
        if(pSAppView == null){
            this.setPSAppViewId(null);
            this.setPSAppViewName(null);
        }
        else{
            this.setPSAppViewId(pSAppView.getPSAppViewId());
            this.setPSAppViewName(pSAppView.getPSAppViewName());
        }
        return this;
    }

    /**
     * <B>PSAPPVIEWNAME</B>&nbsp;应用视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPVIEWID}
     */
    public final static String FIELD_PSAPPVIEWNAME = "psappviewname";

    /**
     * 设置 应用视图
     * 
     * @param pSAppViewName
     * 
     */
    @JsonProperty(FIELD_PSAPPVIEWNAME)
    public void setPSAppViewName(String pSAppViewName){
        this.set(FIELD_PSAPPVIEWNAME, pSAppViewName);
    }
    
    /**
     * 获取 应用视图  
     * @return
     */
    @JsonIgnore
    public String getPSAppViewName(){
        Object objValue = this.get(FIELD_PSAPPVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppViewNameDirty(){
        if(this.contains(FIELD_PSAPPVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用视图
     */
    @JsonIgnore
    public void resetPSAppViewName(){
        this.reset(FIELD_PSAPPVIEWNAME);
    }

    /**
     * 设置 应用视图
     * <P>
     * 等同 {@link #setPSAppViewName}
     * @param pSAppViewName
     */
    @JsonIgnore
    public PSMobAppStartPage psappviewname(String pSAppViewName){
        this.setPSAppViewName(pSAppViewName);
        return this;
    }

    /**
     * <B>PSMOBAPPSTARTPAGEID</B>&nbsp;移动应用欢迎页标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSMOBAPPSTARTPAGEID = "psmobappstartpageid";

    /**
     * 设置 移动应用欢迎页标识
     * 
     * @param pSMobAppStartPageId
     * 
     */
    @JsonProperty(FIELD_PSMOBAPPSTARTPAGEID)
    public void setPSMobAppStartPageId(String pSMobAppStartPageId){
        this.set(FIELD_PSMOBAPPSTARTPAGEID, pSMobAppStartPageId);
    }
    
    /**
     * 获取 移动应用欢迎页标识  
     * @return
     */
    @JsonIgnore
    public String getPSMobAppStartPageId(){
        Object objValue = this.get(FIELD_PSMOBAPPSTARTPAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动应用欢迎页标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSMobAppStartPageIdDirty(){
        if(this.contains(FIELD_PSMOBAPPSTARTPAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动应用欢迎页标识
     */
    @JsonIgnore
    public void resetPSMobAppStartPageId(){
        this.reset(FIELD_PSMOBAPPSTARTPAGEID);
    }

    /**
     * 设置 移动应用欢迎页标识
     * <P>
     * 等同 {@link #setPSMobAppStartPageId}
     * @param pSMobAppStartPageId
     */
    @JsonIgnore
    public PSMobAppStartPage psmobappstartpageid(String pSMobAppStartPageId){
        this.setPSMobAppStartPageId(pSMobAppStartPageId);
        return this;
    }

    /**
     * <B>PSMOBAPPSTARTPAGENAME</B>&nbsp;资源名称，指定移动端应用资源的名称
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobSceenResSpec} 
     */
    public final static String FIELD_PSMOBAPPSTARTPAGENAME = "psmobappstartpagename";

    /**
     * 设置 资源名称，详细说明：{@link #FIELD_PSMOBAPPSTARTPAGENAME}
     * 
     * @param pSMobAppStartPageName
     * 
     */
    @JsonProperty(FIELD_PSMOBAPPSTARTPAGENAME)
    public void setPSMobAppStartPageName(String pSMobAppStartPageName){
        this.set(FIELD_PSMOBAPPSTARTPAGENAME, pSMobAppStartPageName);
    }
    
    /**
     * 获取 资源名称  
     * @return
     */
    @JsonIgnore
    public String getPSMobAppStartPageName(){
        Object objValue = this.get(FIELD_PSMOBAPPSTARTPAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSMobAppStartPageNameDirty(){
        if(this.contains(FIELD_PSMOBAPPSTARTPAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源名称
     */
    @JsonIgnore
    public void resetPSMobAppStartPageName(){
        this.reset(FIELD_PSMOBAPPSTARTPAGENAME);
    }

    /**
     * 设置 资源名称，详细说明：{@link #FIELD_PSMOBAPPSTARTPAGENAME}
     * <P>
     * 等同 {@link #setPSMobAppStartPageName}
     * @param pSMobAppStartPageName
     */
    @JsonIgnore
    public PSMobAppStartPage psmobappstartpagename(String pSMobAppStartPageName){
        this.setPSMobAppStartPageName(pSMobAppStartPageName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSMobAppStartPageName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSMobAppStartPageName(strName);
    }

    @JsonIgnore
    public PSMobAppStartPage name(String strName){
        this.setPSMobAppStartPageName(strName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;移动端应用，指定移动端应用资源所属的应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 移动端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 移动端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动端应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 移动端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSMobAppStartPage pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 移动端应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSMobAppStartPage pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;移动应用，指定移动端应用资源所属的应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 移动应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 移动应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移动应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移动应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 移动应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSMobAppStartPage pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;系统图片资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 系统图片资源
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 系统图片资源  
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
     * 判断 系统图片资源 是否指定值，包括空值
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
     * 重置 系统图片资源
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 系统图片资源
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSMobAppStartPage pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 系统图片资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSMobAppStartPage pssysimageid(PSSysImage pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;系统图片资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 系统图片资源
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 系统图片资源  
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
     * 判断 系统图片资源 是否指定值，包括空值
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
     * 重置 系统图片资源
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 系统图片资源
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSMobAppStartPage pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>RESSPEC</B>&nbsp;资源规格，指定移动端应用资源的规格
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobSceenResSpec} 
     */
    public final static String FIELD_RESSPEC = "resspec";

    /**
     * 设置 资源规格，详细说明：{@link #FIELD_RESSPEC}
     * 
     * @param resSpec
     * 
     */
    @JsonProperty(FIELD_RESSPEC)
    public void setResSpec(String resSpec){
        this.set(FIELD_RESSPEC, resSpec);
    }
    
    /**
     * 获取 资源规格  
     * @return
     */
    @JsonIgnore
    public String getResSpec(){
        Object objValue = this.get(FIELD_RESSPEC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源规格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResSpecDirty(){
        if(this.contains(FIELD_RESSPEC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源规格
     */
    @JsonIgnore
    public void resetResSpec(){
        this.reset(FIELD_RESSPEC);
    }

    /**
     * 设置 资源规格，详细说明：{@link #FIELD_RESSPEC}
     * <P>
     * 等同 {@link #setResSpec}
     * @param resSpec
     */
    @JsonIgnore
    public PSMobAppStartPage resspec(String resSpec){
        this.setResSpec(resSpec);
        return this;
    }

     /**
     * 设置 资源规格，详细说明：{@link #FIELD_RESSPEC}
     * <P>
     * 等同 {@link #setResSpec}
     * @param resSpec
     */
    @JsonIgnore
    public PSMobAppStartPage resspec(net.ibizsys.psmodel.core.util.PSModelEnums.MobSceenResSpec resSpec){
        if(resSpec == null){
            this.setResSpec(null);
        }
        else{
            this.setResSpec(resSpec.value);
        }
        return this;
    }

    /**
     * <B>RESTYPE</B>&nbsp;资源类型，指定移动端应用资源的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.MobAppResType} 
     */
    public final static String FIELD_RESTYPE = "restype";

    /**
     * 设置 资源类型，详细说明：{@link #FIELD_RESTYPE}
     * 
     * @param resType
     * 
     */
    @JsonProperty(FIELD_RESTYPE)
    public void setResType(String resType){
        this.set(FIELD_RESTYPE, resType);
    }
    
    /**
     * 获取 资源类型  
     * @return
     */
    @JsonIgnore
    public String getResType(){
        Object objValue = this.get(FIELD_RESTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResTypeDirty(){
        if(this.contains(FIELD_RESTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源类型
     */
    @JsonIgnore
    public void resetResType(){
        this.reset(FIELD_RESTYPE);
    }

    /**
     * 设置 资源类型，详细说明：{@link #FIELD_RESTYPE}
     * <P>
     * 等同 {@link #setResType}
     * @param resType
     */
    @JsonIgnore
    public PSMobAppStartPage restype(String resType){
        this.setResType(resType);
        return this;
    }

     /**
     * 设置 资源类型，详细说明：{@link #FIELD_RESTYPE}
     * <P>
     * 等同 {@link #setResType}
     * @param resType
     */
    @JsonIgnore
    public PSMobAppStartPage restype(net.ibizsys.psmodel.core.util.PSModelEnums.MobAppResType resType){
        if(resType == null){
            this.setResType(null);
        }
        else{
            this.setResType(resType.value);
        }
        return this;
    }

    /**
     * <B>STARTPAGEFILE</B>&nbsp;资源文件，指定移动端应用资源的路径
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_STARTPAGEFILE = "startpagefile";

    /**
     * 设置 资源文件，详细说明：{@link #FIELD_STARTPAGEFILE}
     * 
     * @param startPageFile
     * 
     */
    @JsonProperty(FIELD_STARTPAGEFILE)
    public void setStartPageFile(String startPageFile){
        this.set(FIELD_STARTPAGEFILE, startPageFile);
    }
    
    /**
     * 获取 资源文件  
     * @return
     */
    @JsonIgnore
    public String getStartPageFile(){
        Object objValue = this.get(FIELD_STARTPAGEFILE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 资源文件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStartPageFileDirty(){
        if(this.contains(FIELD_STARTPAGEFILE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 资源文件
     */
    @JsonIgnore
    public void resetStartPageFile(){
        this.reset(FIELD_STARTPAGEFILE);
    }

    /**
     * 设置 资源文件，详细说明：{@link #FIELD_STARTPAGEFILE}
     * <P>
     * 等同 {@link #setStartPageFile}
     * @param startPageFile
     */
    @JsonIgnore
    public PSMobAppStartPage startpagefile(String startPageFile){
        this.setStartPageFile(startPageFile);
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
    public PSMobAppStartPage updatedate(String updateDate){
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
    public PSMobAppStartPage updateman(String updateMan){
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
    public PSMobAppStartPage validflag(Integer validFlag){
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
    public PSMobAppStartPage validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSMobAppStartPageId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSMobAppStartPageId(strValue);
    }

    @JsonIgnore
    public PSMobAppStartPage id(String strValue){
        this.setPSMobAppStartPageId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSMobAppStartPage){
            PSMobAppStartPage model = (PSMobAppStartPage)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
