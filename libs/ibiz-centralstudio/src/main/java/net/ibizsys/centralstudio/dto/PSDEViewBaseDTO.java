package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEVIEWBASE</B>实体视图 模型传输对象
 * <P>
 * 实体视图是实体的界面视图模型，包括了视图部件、视图逻辑等相关模型，实体视图既可以作为顶级视图，也可以嵌入到其它视图作为部件视图使用。实体视图必须加入到应用才会被使用，一个实体视图可以加入到多个应用中
 */
public class PSDEViewBaseDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEViewBaseDTO(){
    }      

    /**
     * <B>ACCUSERMODE</B>&nbsp;访问用户模式，指定授权访问该视图的用户类型，未定义时为【登录用户】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.AccessUserMode} 
     */
    public final static String FIELD_ACCUSERMODE = "accusermode";

    /**
     * 设置 访问用户模式，详细说明：{@link #FIELD_ACCUSERMODE}
     * 
     * @param accUserMode
     * 
     */
    @JsonProperty(FIELD_ACCUSERMODE)
    public void setAccUserMode(String accUserMode){
        this.set(FIELD_ACCUSERMODE, accUserMode);
    }
    
    /**
     * 获取 访问用户模式  
     * @return
     */
    @JsonIgnore
    public String getAccUserMode(){
        Object objValue = this.get(FIELD_ACCUSERMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 访问用户模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAccUserModeDirty(){
        if(this.contains(FIELD_ACCUSERMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 访问用户模式
     */
    @JsonIgnore
    public void resetAccUserMode(){
        this.reset(FIELD_ACCUSERMODE);
    }

    /**
     * 设置 访问用户模式，详细说明：{@link #FIELD_ACCUSERMODE}
     * <P>
     * 等同 {@link #setAccUserMode}
     * @param accUserMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO accusermode(String accUserMode){
        this.setAccUserMode(accUserMode);
        return this;
    }

     /**
     * 设置 访问用户模式，详细说明：{@link #FIELD_ACCUSERMODE}
     * <P>
     * 等同 {@link #setAccUserMode}
     * @param accUserMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO accusermode(net.ibizsys.model.PSModelEnums.AccessUserMode accUserMode){
        if(accUserMode == null){
            this.setAccUserMode(null);
        }
        else{
            this.setAccUserMode(accUserMode.value);
        }
        return this;
    }

    /**
     * <B>BOTTOMINFO</B>&nbsp;尾部提示信息
     */
    public final static String FIELD_BOTTOMINFO = "bottominfo";

    /**
     * 设置 尾部提示信息
     * 
     * @param bottomInfo
     * 
     */
    @JsonProperty(FIELD_BOTTOMINFO)
    public void setBottomInfo(String bottomInfo){
        this.set(FIELD_BOTTOMINFO, bottomInfo);
    }
    
    /**
     * 获取 尾部提示信息  
     * @return
     */
    @JsonIgnore
    public String getBottomInfo(){
        Object objValue = this.get(FIELD_BOTTOMINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 尾部提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBottomInfoDirty(){
        if(this.contains(FIELD_BOTTOMINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 尾部提示信息
     */
    @JsonIgnore
    public void resetBottomInfo(){
        this.reset(FIELD_BOTTOMINFO);
    }

    /**
     * 设置 尾部提示信息
     * <P>
     * 等同 {@link #setBottomInfo}
     * @param bottomInfo
     */
    @JsonIgnore
    public PSDEViewBaseDTO bottominfo(String bottomInfo){
        this.setBottomInfo(bottomInfo);
        return this;
    }

    /**
     * <B>CAPPSLANRESID</B>&nbsp;标题语言资源，指定实体视图标题的多语言资源对象
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
    public PSDEViewBaseDTO cappslanresid(String capPSLanResId){
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
    public PSDEViewBaseDTO cappslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>CAPPSLANRESNAME</B>&nbsp;标题语言资源，指定实体视图标题的多语言资源对象
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
    public PSDEViewBaseDTO cappslanresname(String capPSLanResName){
        this.setCapPSLanResName(capPSLanResName);
        return this;
    }

    /**
     * <B>CAPTION</B>&nbsp;视图标题，指定实体实体的标题
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_CAPTION = "caption";

    /**
     * 设置 视图标题，详细说明：{@link #FIELD_CAPTION}
     * 
     * @param caption
     * 
     */
    @JsonProperty(FIELD_CAPTION)
    public void setCaption(String caption){
        this.set(FIELD_CAPTION, caption);
    }
    
    /**
     * 获取 视图标题  
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
     * 判断 视图标题 是否指定值，包括空值
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
     * 重置 视图标题
     */
    @JsonIgnore
    public void resetCaption(){
        this.reset(FIELD_CAPTION);
    }

    /**
     * 设置 视图标题，详细说明：{@link #FIELD_CAPTION}
     * <P>
     * 等同 {@link #setCaption}
     * @param caption
     */
    @JsonIgnore
    public PSDEViewBaseDTO caption(String caption){
        this.setCaption(caption);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定视图的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 40，由字母、数字、下划线组成
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
    public PSDEViewBaseDTO codename(String codeName){
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
    public PSDEViewBaseDTO createdate(Timestamp createDate){
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
    public PSDEViewBaseDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEVIEWTAG</B>&nbsp;视图标记
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_DEVIEWTAG = "deviewtag";

    /**
     * 设置 视图标记
     * 
     * @param dEViewTag
     * 
     */
    @JsonProperty(FIELD_DEVIEWTAG)
    public void setDEViewTag(String dEViewTag){
        this.set(FIELD_DEVIEWTAG, dEViewTag);
    }
    
    /**
     * 获取 视图标记  
     * @return
     */
    @JsonIgnore
    public String getDEViewTag(){
        Object objValue = this.get(FIELD_DEVIEWTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewTagDirty(){
        if(this.contains(FIELD_DEVIEWTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图标记
     */
    @JsonIgnore
    public void resetDEViewTag(){
        this.reset(FIELD_DEVIEWTAG);
    }

    /**
     * 设置 视图标记
     * <P>
     * 等同 {@link #setDEViewTag}
     * @param dEViewTag
     */
    @JsonIgnore
    public PSDEViewBaseDTO deviewtag(String dEViewTag){
        this.setDEViewTag(dEViewTag);
        return this;
    }

    /**
     * <B>DEVIEWTAG2</B>&nbsp;视图标记2
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEVIEWTAG2 = "deviewtag2";

    /**
     * 设置 视图标记2
     * 
     * @param dEViewTag2
     * 
     */
    @JsonProperty(FIELD_DEVIEWTAG2)
    public void setDEViewTag2(String dEViewTag2){
        this.set(FIELD_DEVIEWTAG2, dEViewTag2);
    }
    
    /**
     * 获取 视图标记2  
     * @return
     */
    @JsonIgnore
    public String getDEViewTag2(){
        Object objValue = this.get(FIELD_DEVIEWTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewTag2Dirty(){
        if(this.contains(FIELD_DEVIEWTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图标记2
     */
    @JsonIgnore
    public void resetDEViewTag2(){
        this.reset(FIELD_DEVIEWTAG2);
    }

    /**
     * 设置 视图标记2
     * <P>
     * 等同 {@link #setDEViewTag2}
     * @param dEViewTag2
     */
    @JsonIgnore
    public PSDEViewBaseDTO deviewtag2(String dEViewTag2){
        this.setDEViewTag2(dEViewTag2);
        return this;
    }

    /**
     * <B>DEVIEWTAG3</B>&nbsp;视图标记3
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEVIEWTAG3 = "deviewtag3";

    /**
     * 设置 视图标记3
     * 
     * @param dEViewTag3
     * 
     */
    @JsonProperty(FIELD_DEVIEWTAG3)
    public void setDEViewTag3(String dEViewTag3){
        this.set(FIELD_DEVIEWTAG3, dEViewTag3);
    }
    
    /**
     * 获取 视图标记3  
     * @return
     */
    @JsonIgnore
    public String getDEViewTag3(){
        Object objValue = this.get(FIELD_DEVIEWTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewTag3Dirty(){
        if(this.contains(FIELD_DEVIEWTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图标记3
     */
    @JsonIgnore
    public void resetDEViewTag3(){
        this.reset(FIELD_DEVIEWTAG3);
    }

    /**
     * 设置 视图标记3
     * <P>
     * 等同 {@link #setDEViewTag3}
     * @param dEViewTag3
     */
    @JsonIgnore
    public PSDEViewBaseDTO deviewtag3(String dEViewTag3){
        this.setDEViewTag3(dEViewTag3);
        return this;
    }

    /**
     * <B>DEVIEWTAG4</B>&nbsp;视图标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DEVIEWTAG4 = "deviewtag4";

    /**
     * 设置 视图标记4
     * 
     * @param dEViewTag4
     * 
     */
    @JsonProperty(FIELD_DEVIEWTAG4)
    public void setDEViewTag4(String dEViewTag4){
        this.set(FIELD_DEVIEWTAG4, dEViewTag4);
    }
    
    /**
     * 获取 视图标记4  
     * @return
     */
    @JsonIgnore
    public String getDEViewTag4(){
        Object objValue = this.get(FIELD_DEVIEWTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDEViewTag4Dirty(){
        if(this.contains(FIELD_DEVIEWTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图标记4
     */
    @JsonIgnore
    public void resetDEViewTag4(){
        this.reset(FIELD_DEVIEWTAG4);
    }

    /**
     * 设置 视图标记4
     * <P>
     * 等同 {@link #setDEViewTag4}
     * @param dEViewTag4
     */
    @JsonIgnore
    public PSDEViewBaseDTO deviewtag4(String dEViewTag4){
        this.setDEViewTag4(dEViewTag4);
        return this;
    }

    /**
     * <B>DYNCMODE</B>&nbsp;视图优先级
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.AppViewPriority} 
     */
    public final static String FIELD_DYNCMODE = "dyncmode";

    /**
     * 设置 视图优先级
     * 
     * @param dyncMode
     * 
     */
    @JsonProperty(FIELD_DYNCMODE)
    public void setDyncMode(Integer dyncMode){
        this.set(FIELD_DYNCMODE, dyncMode);
    }
    
    /**
     * 获取 视图优先级  
     * @return
     */
    @JsonIgnore
    public Integer getDyncMode(){
        Object objValue = this.get(FIELD_DYNCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图优先级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDyncModeDirty(){
        if(this.contains(FIELD_DYNCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图优先级
     */
    @JsonIgnore
    public void resetDyncMode(){
        this.reset(FIELD_DYNCMODE);
    }

    /**
     * 设置 视图优先级
     * <P>
     * 等同 {@link #setDyncMode}
     * @param dyncMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO dyncmode(Integer dyncMode){
        this.setDyncMode(dyncMode);
        return this;
    }

     /**
     * 设置 视图优先级
     * <P>
     * 等同 {@link #setDyncMode}
     * @param dyncMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO dyncmode(net.ibizsys.model.PSModelEnums.AppViewPriority dyncMode){
        if(dyncMode == null){
            this.setDyncMode(null);
        }
        else{
            this.setDyncMode(dyncMode.value);
        }
        return this;
    }

    /**
     * <B>ENABLEVIEWACTIONS</B>&nbsp;启用视图操作控制，指定是否启用视图操作控制，启用视图操作控制需要显示指定视图支持哪些操作。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEVIEWACTIONS = "enableviewactions";

    /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * 
     * @param enableViewActions
     * 
     */
    @JsonProperty(FIELD_ENABLEVIEWACTIONS)
    public void setEnableViewActions(Integer enableViewActions){
        this.set(FIELD_ENABLEVIEWACTIONS, enableViewActions);
    }
    
    /**
     * 获取 启用视图操作控制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableViewActions(){
        Object objValue = this.get(FIELD_ENABLEVIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用视图操作控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableViewActionsDirty(){
        if(this.contains(FIELD_ENABLEVIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用视图操作控制
     */
    @JsonIgnore
    public void resetEnableViewActions(){
        this.reset(FIELD_ENABLEVIEWACTIONS);
    }

    /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEViewBaseDTO enableviewactions(Integer enableViewActions){
        this.setEnableViewActions(enableViewActions);
        return this;
    }

     /**
     * 设置 启用视图操作控制，详细说明：{@link #FIELD_ENABLEVIEWACTIONS}
     * <P>
     * 等同 {@link #setEnableViewActions}
     * @param enableViewActions
     */
    @JsonIgnore
    public PSDEViewBaseDTO enableviewactions(Boolean enableViewActions){
        if(enableViewActions == null){
            this.setEnableViewActions(null);
        }
        else{
            this.setEnableViewActions(enableViewActions?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTID</B>&nbsp;快速分组代码表，指定多数据视图的快速分组代码表对象，快速分组提供预置条件查询及计数能力
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCodeListDTO} 
     */
    public final static String FIELD_GROUPPSCODELISTID = "grouppscodelistid";

    /**
     * 设置 快速分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * 
     * @param groupPSCodeListId
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTID)
    public void setGroupPSCodeListId(String groupPSCodeListId){
        this.set(FIELD_GROUPPSCODELISTID, groupPSCodeListId);
    }
    
    /**
     * 获取 快速分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListId(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListIdDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListId(){
        this.reset(FIELD_GROUPPSCODELISTID);
    }

    /**
     * 设置 快速分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTID}
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param groupPSCodeListId
     */
    @JsonIgnore
    public PSDEViewBaseDTO grouppscodelistid(String groupPSCodeListId){
        this.setGroupPSCodeListId(groupPSCodeListId);
        return this;
    }

    /**
     * 设置 快速分组代码表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setGroupPSCodeListId}
     * @param pSCodeList 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO grouppscodelistid(PSCodeListDTO pSCodeList){
        if(pSCodeList == null){
            this.setGroupPSCodeListId(null);
            this.setGroupPSCodeListName(null);
        }
        else{
            this.setGroupPSCodeListId(pSCodeList.getPSCodeListId());
            this.setGroupPSCodeListName(pSCodeList.getPSCodeListName());
        }
        return this;
    }

    /**
     * <B>GROUPPSCODELISTNAME</B>&nbsp;快速分组代码表，指定多数据视图的快速分组代码表对象，快速分组提供预置条件查询及计数能力
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_GROUPPSCODELISTID}
     */
    public final static String FIELD_GROUPPSCODELISTNAME = "grouppscodelistname";

    /**
     * 设置 快速分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * 
     * @param groupPSCodeListName
     * 
     */
    @JsonProperty(FIELD_GROUPPSCODELISTNAME)
    public void setGroupPSCodeListName(String groupPSCodeListName){
        this.set(FIELD_GROUPPSCODELISTNAME, groupPSCodeListName);
    }
    
    /**
     * 获取 快速分组代码表  
     * @return
     */
    @JsonIgnore
    public String getGroupPSCodeListName(){
        Object objValue = this.get(FIELD_GROUPPSCODELISTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 快速分组代码表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupPSCodeListNameDirty(){
        if(this.contains(FIELD_GROUPPSCODELISTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 快速分组代码表
     */
    @JsonIgnore
    public void resetGroupPSCodeListName(){
        this.reset(FIELD_GROUPPSCODELISTNAME);
    }

    /**
     * 设置 快速分组代码表，详细说明：{@link #FIELD_GROUPPSCODELISTNAME}
     * <P>
     * 等同 {@link #setGroupPSCodeListName}
     * @param groupPSCodeListName
     */
    @JsonIgnore
    public PSDEViewBaseDTO grouppscodelistname(String groupPSCodeListName){
        this.setGroupPSCodeListName(groupPSCodeListName);
        return this;
    }

    /**
     * <B>HEADERINFO</B>&nbsp;头部提示信息
     */
    public final static String FIELD_HEADERINFO = "headerinfo";

    /**
     * 设置 头部提示信息
     * 
     * @param headerInfo
     * 
     */
    @JsonProperty(FIELD_HEADERINFO)
    public void setHeaderInfo(String headerInfo){
        this.set(FIELD_HEADERINFO, headerInfo);
    }
    
    /**
     * 获取 头部提示信息  
     * @return
     */
    @JsonIgnore
    public String getHeaderInfo(){
        Object objValue = this.get(FIELD_HEADERINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 头部提示信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHeaderInfoDirty(){
        if(this.contains(FIELD_HEADERINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 头部提示信息
     */
    @JsonIgnore
    public void resetHeaderInfo(){
        this.reset(FIELD_HEADERINFO);
    }

    /**
     * 设置 头部提示信息
     * <P>
     * 等同 {@link #setHeaderInfo}
     * @param headerInfo
     */
    @JsonIgnore
    public PSDEViewBaseDTO headerinfo(String headerInfo){
        this.setHeaderInfo(headerInfo);
        return this;
    }

    /**
     * <B>HEIGHT</B>&nbsp;高度，指定视图的高度，未定义时为【0】
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
    public PSDEViewBaseDTO height(Integer height){
        this.setHeight(height);
        return this;
    }

    /**
     * <B>LAYOUTPANELMODE</B>&nbsp;布局面板模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.LayoutPanelMode} 
     */
    public final static String FIELD_LAYOUTPANELMODE = "layoutpanelmode";

    /**
     * 设置 布局面板模式
     * 
     * @param layoutPanelMode
     * 
     */
    @JsonProperty(FIELD_LAYOUTPANELMODE)
    public void setLayoutPanelMode(Integer layoutPanelMode){
        this.set(FIELD_LAYOUTPANELMODE, layoutPanelMode);
    }
    
    /**
     * 获取 布局面板模式  
     * @return
     */
    @JsonIgnore
    public Integer getLayoutPanelMode(){
        Object objValue = this.get(FIELD_LAYOUTPANELMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 布局面板模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLayoutPanelModeDirty(){
        if(this.contains(FIELD_LAYOUTPANELMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 布局面板模式
     */
    @JsonIgnore
    public void resetLayoutPanelMode(){
        this.reset(FIELD_LAYOUTPANELMODE);
    }

    /**
     * 设置 布局面板模式
     * <P>
     * 等同 {@link #setLayoutPanelMode}
     * @param layoutPanelMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO layoutpanelmode(Integer layoutPanelMode){
        this.setLayoutPanelMode(layoutPanelMode);
        return this;
    }

     /**
     * 设置 布局面板模式
     * <P>
     * 等同 {@link #setLayoutPanelMode}
     * @param layoutPanelMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO layoutpanelmode(net.ibizsys.model.PSModelEnums.LayoutPanelMode layoutPanelMode){
        if(layoutPanelMode == null){
            this.setLayoutPanelMode(null);
        }
        else{
            this.setLayoutPanelMode(layoutPanelMode.value);
        }
        return this;
    }

    /**
     * <B>LOADDEFAULT</B>&nbsp;默认加载数据，指定是否默认加载视图数据，未定义时由各类型视图自行决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_LOADDEFAULT = "loaddefault";

    /**
     * 设置 默认加载数据，详细说明：{@link #FIELD_LOADDEFAULT}
     * 
     * @param loadDefault
     * 
     */
    @JsonProperty(FIELD_LOADDEFAULT)
    public void setLoadDefault(Integer loadDefault){
        this.set(FIELD_LOADDEFAULT, loadDefault);
    }
    
    /**
     * 获取 默认加载数据  
     * @return
     */
    @JsonIgnore
    public Integer getLoadDefault(){
        Object objValue = this.get(FIELD_LOADDEFAULT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认加载数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLoadDefaultDirty(){
        if(this.contains(FIELD_LOADDEFAULT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认加载数据
     */
    @JsonIgnore
    public void resetLoadDefault(){
        this.reset(FIELD_LOADDEFAULT);
    }

    /**
     * 设置 默认加载数据，详细说明：{@link #FIELD_LOADDEFAULT}
     * <P>
     * 等同 {@link #setLoadDefault}
     * @param loadDefault
     */
    @JsonIgnore
    public PSDEViewBaseDTO loaddefault(Integer loadDefault){
        this.setLoadDefault(loadDefault);
        return this;
    }

     /**
     * 设置 默认加载数据，详细说明：{@link #FIELD_LOADDEFAULT}
     * <P>
     * 等同 {@link #setLoadDefault}
     * @param loadDefault
     */
    @JsonIgnore
    public PSDEViewBaseDTO loaddefault(Boolean loadDefault){
        if(loadDefault == null){
            this.setLoadDefault(null);
        }
        else{
            this.setLoadDefault(loadDefault?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEViewBaseDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>OPENMODE</B>&nbsp;默认打开方式，指定视图的开发方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.OpenViewMode} 
     */
    public final static String FIELD_OPENMODE = "openmode";

    /**
     * 设置 默认打开方式，详细说明：{@link #FIELD_OPENMODE}
     * 
     * @param openMode
     * 
     */
    @JsonProperty(FIELD_OPENMODE)
    public void setOpenMode(String openMode){
        this.set(FIELD_OPENMODE, openMode);
    }
    
    /**
     * 获取 默认打开方式  
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
     * 判断 默认打开方式 是否指定值，包括空值
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
     * 重置 默认打开方式
     */
    @JsonIgnore
    public void resetOpenMode(){
        this.reset(FIELD_OPENMODE);
    }

    /**
     * 设置 默认打开方式，详细说明：{@link #FIELD_OPENMODE}
     * <P>
     * 等同 {@link #setOpenMode}
     * @param openMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO openmode(String openMode){
        this.setOpenMode(openMode);
        return this;
    }

     /**
     * 设置 默认打开方式，详细说明：{@link #FIELD_OPENMODE}
     * <P>
     * 等同 {@link #setOpenMode}
     * @param openMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO openmode(net.ibizsys.model.PSModelEnums.OpenViewMode openMode){
        if(openMode == null){
            this.setOpenMode(null);
        }
        else{
            this.setOpenMode(openMode.value);
        }
        return this;
    }

    /**
     * <B>PDVTPARAM</B>&nbsp;功能视图参数，当视图设置功能视图模式后可进一步指定相应的功能模式参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PDVTPARAM = "pdvtparam";

    /**
     * 设置 功能视图参数，详细说明：{@link #FIELD_PDVTPARAM}
     * 
     * @param pDVTParam
     * 
     */
    @JsonProperty(FIELD_PDVTPARAM)
    public void setPDVTParam(String pDVTParam){
        this.set(FIELD_PDVTPARAM, pDVTParam);
    }
    
    /**
     * 获取 功能视图参数  
     * @return
     */
    @JsonIgnore
    public String getPDVTParam(){
        Object objValue = this.get(FIELD_PDVTPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 功能视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPDVTParamDirty(){
        if(this.contains(FIELD_PDVTPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能视图参数
     */
    @JsonIgnore
    public void resetPDVTParam(){
        this.reset(FIELD_PDVTPARAM);
    }

    /**
     * 设置 功能视图参数，详细说明：{@link #FIELD_PDVTPARAM}
     * <P>
     * 等同 {@link #setPDVTParam}
     * @param pDVTParam
     */
    @JsonIgnore
    public PSDEViewBaseDTO pdvtparam(String pDVTParam){
        this.setPDVTParam(pDVTParam);
        return this;
    }

    /**
     * <B>PREDEFINEDVIEWTYPE</B>&nbsp;功能视图模式，指定视图在所在实体的功能模式，功能模式支持附加参数。在某些场景下，模型引擎会按照指定功能模式尝试获取视图。功能模式+模式参数 需要在所在实体具备唯一性
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.PredefinedViewType} 
     */
    public final static String FIELD_PREDEFINEDVIEWTYPE = "predefinedviewtype";

    /**
     * 设置 功能视图模式，详细说明：{@link #FIELD_PREDEFINEDVIEWTYPE}
     * 
     * @param predefinedViewType
     * 
     */
    @JsonProperty(FIELD_PREDEFINEDVIEWTYPE)
    public void setPredefinedViewType(String predefinedViewType){
        this.set(FIELD_PREDEFINEDVIEWTYPE, predefinedViewType);
        //属性名称与代码标识不一致，设置属性名称
        this.set("predefineviewtype", predefinedViewType);
    }
    
    /**
     * 获取 功能视图模式  
     * @return
     */
    @JsonIgnore
    public String getPredefinedViewType(){
        Object objValue = this.get(FIELD_PREDEFINEDVIEWTYPE);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("predefineviewtype");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 功能视图模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPredefinedViewTypeDirty(){
        if(this.contains(FIELD_PREDEFINEDVIEWTYPE)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("predefineviewtype")){
            return true;
        }
        return false;
    }

    /**
     * 重置 功能视图模式
     */
    @JsonIgnore
    public void resetPredefinedViewType(){
        this.reset(FIELD_PREDEFINEDVIEWTYPE);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("predefineviewtype");
    }

    /**
     * 设置 功能视图模式，详细说明：{@link #FIELD_PREDEFINEDVIEWTYPE}
     * <P>
     * 等同 {@link #setPredefinedViewType}
     * @param predefinedViewType
     */
    @JsonIgnore
    public PSDEViewBaseDTO predefinedviewtype(String predefinedViewType){
        this.setPredefinedViewType(predefinedViewType);
        return this;
    }

     /**
     * 设置 功能视图模式，详细说明：{@link #FIELD_PREDEFINEDVIEWTYPE}
     * <P>
     * 等同 {@link #setPredefinedViewType}
     * @param predefinedViewType
     */
    @JsonIgnore
    public PSDEViewBaseDTO predefinedviewtype(net.ibizsys.model.PSModelEnums.PredefinedViewType predefinedViewType){
        if(predefinedViewType == null){
            this.setPredefinedViewType(null);
        }
        else{
            this.setPredefinedViewType(predefinedViewType.value);
        }
        return this;
    }

    /**
     * <B>PSACHANDLERID</B>&nbsp;视图处理对象，指定实体视图的处理对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSACHandlerDTO} 
     */
    public final static String FIELD_PSACHANDLERID = "psachandlerid";

    /**
     * 设置 视图处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * 
     * @param pSACHandlerId
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERID)
    public void setPSACHandlerId(String pSACHandlerId){
        this.set(FIELD_PSACHANDLERID, pSACHandlerId);
    }
    
    /**
     * 获取 视图处理对象  
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
     * 判断 视图处理对象 是否指定值，包括空值
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
     * 重置 视图处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerId(){
        this.reset(FIELD_PSACHANDLERID);
    }

    /**
     * 设置 视图处理对象，详细说明：{@link #FIELD_PSACHANDLERID}
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandlerId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psachandlerid(String pSACHandlerId){
        this.setPSACHandlerId(pSACHandlerId);
        return this;
    }

    /**
     * 设置 视图处理对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSACHandlerId}
     * @param pSACHandler 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO psachandlerid(PSACHandlerDTO pSACHandler){
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
     * <B>PSACHANDLERNAME</B>&nbsp;视图处理对象，指定实体视图的处理对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSACHANDLERID}
     */
    public final static String FIELD_PSACHANDLERNAME = "psachandlername";

    /**
     * 设置 视图处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * 
     * @param pSACHandlerName
     * 
     */
    @JsonProperty(FIELD_PSACHANDLERNAME)
    public void setPSACHandlerName(String pSACHandlerName){
        this.set(FIELD_PSACHANDLERNAME, pSACHandlerName);
    }
    
    /**
     * 获取 视图处理对象  
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
     * 判断 视图处理对象 是否指定值，包括空值
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
     * 重置 视图处理对象
     */
    @JsonIgnore
    public void resetPSACHandlerName(){
        this.reset(FIELD_PSACHANDLERNAME);
    }

    /**
     * 设置 视图处理对象，详细说明：{@link #FIELD_PSACHANDLERNAME}
     * <P>
     * 等同 {@link #setPSACHandlerName}
     * @param pSACHandlerName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psachandlername(String pSACHandlerName){
        this.setPSACHandlerName(pSACHandlerName);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGroupDTO} 
     */
    public final static String FIELD_PSCTRLLOGICGROUPID = "psctrllogicgroupid";

    /**
     * 设置 界面逻辑组
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
     * 设置 界面逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupId}
     * @param pSCtrlLogicGroupId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEViewBaseDTO psctrllogicgroupid(PSCtrlLogicGroupDTO pSCtrlLogicGroup){
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
     * <B>PSCTRLLOGICGROUPNAME</B>&nbsp;界面逻辑组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCTRLLOGICGROUPID}
     */
    public final static String FIELD_PSCTRLLOGICGROUPNAME = "psctrllogicgroupname";

    /**
     * 设置 界面逻辑组
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
     * 设置 界面逻辑组
     * <P>
     * 等同 {@link #setPSCtrlLogicGroupName}
     * @param pSCtrlLogicGroupName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSDEAWGROUPID</B>&nbsp;实体操作向导组
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEAWGROUPID = "psdeawgroupid";

    /**
     * 设置 实体操作向导组
     * 
     * @param pSDEAWGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEAWGROUPID)
    public void setPSDEAWGroupId(String pSDEAWGroupId){
        this.set(FIELD_PSDEAWGROUPID, pSDEAWGroupId);
    }
    
    /**
     * 获取 实体操作向导组  
     * @return
     */
    @JsonIgnore
    public String getPSDEAWGroupId(){
        Object objValue = this.get(FIELD_PSDEAWGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作向导组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEAWGroupIdDirty(){
        if(this.contains(FIELD_PSDEAWGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作向导组
     */
    @JsonIgnore
    public void resetPSDEAWGroupId(){
        this.reset(FIELD_PSDEAWGROUPID);
    }

    /**
     * 设置 实体操作向导组
     * <P>
     * 等同 {@link #setPSDEAWGroupId}
     * @param pSDEAWGroupId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdeawgroupid(String pSDEAWGroupId){
        this.setPSDEAWGroupId(pSDEAWGroupId);
        return this;
    }

    /**
     * <B>PSDEAWGROUPNAME</B>&nbsp;实体操作向导组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEAWGROUPID}
     */
    public final static String FIELD_PSDEAWGROUPNAME = "psdeawgroupname";

    /**
     * 设置 实体操作向导组
     * 
     * @param pSDEAWGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEAWGROUPNAME)
    public void setPSDEAWGroupName(String pSDEAWGroupName){
        this.set(FIELD_PSDEAWGROUPNAME, pSDEAWGroupName);
    }
    
    /**
     * 获取 实体操作向导组  
     * @return
     */
    @JsonIgnore
    public String getPSDEAWGroupName(){
        Object objValue = this.get(FIELD_PSDEAWGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作向导组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEAWGroupNameDirty(){
        if(this.contains(FIELD_PSDEAWGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作向导组
     */
    @JsonIgnore
    public void resetPSDEAWGroupName(){
        this.reset(FIELD_PSDEAWGROUPNAME);
    }

    /**
     * 设置 实体操作向导组
     * <P>
     * 等同 {@link #setPSDEAWGroupName}
     * @param pSDEAWGroupName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdeawgroupname(String pSDEAWGroupName){
        this.setPSDEAWGroupName(pSDEAWGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定视图所在的实体对象
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
    public PSDEViewBaseDTO psdeid(String pSDEId){
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
    public PSDEViewBaseDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDEMAINSTATEID</B>&nbsp;实体主状态，指定视图关联的主状态对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_PSDEMAINSTATEID = "psdemainstateid";

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATEID}
     * 
     * @param pSDEMainStateId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATEID)
    public void setPSDEMainStateId(String pSDEMainStateId){
        this.set(FIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateId(){
        this.reset(FIELD_PSDEMAINSTATEID);
    }

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATEID}
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainStateId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdemainstateid(String pSDEMainStateId){
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    /**
     * 设置 实体主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdemainstateid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        }
        else{
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMAINSTATENAME</B>&nbsp;实体主状态，指定视图关联的主状态对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAINSTATEID}
     */
    public final static String FIELD_PSDEMAINSTATENAME = "psdemainstatename";

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATENAME}
     * 
     * @param pSDEMainStateName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATENAME)
    public void setPSDEMainStateName(String pSDEMainStateName){
        this.set(FIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateName(){
        this.reset(FIELD_PSDEMAINSTATENAME);
    }

    /**
     * 设置 实体主状态，详细说明：{@link #FIELD_PSDEMAINSTATENAME}
     * <P>
     * 等同 {@link #setPSDEMainStateName}
     * @param pSDEMainStateName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定视图所在的实体对象
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
    public PSDEViewBaseDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;控制关系，指定视图的控制关系对象，如指定控制关系，则要求视图只能在存在此关系的场合使用，简单的说就是显示特定父的关系数据
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 控制关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 控制关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控制关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控制关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 控制关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 控制关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO psderid(PSDERDTO pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;控制关系，指定视图的控制关系对象，如指定控制关系，则要求视图只能在存在此关系的场合使用，简单的说就是显示特定父的关系数据
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 控制关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 控制关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控制关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控制关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 控制关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图标识
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图标识
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图标识
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图名称，指定实体视图的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图名称，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图名称
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图名称，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEViewBaseName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEViewBaseName(strName);
    }

    @JsonIgnore
    public PSDEViewBaseDTO name(String strName){
        this.setPSDEViewBaseName(strName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASETYPE</B>&nbsp;视图类型，指定实体视图的类型
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVIEWBASETYPE = "psdeviewbasetype";

    /**
     * 设置 视图类型，详细说明：{@link #FIELD_PSDEVIEWBASETYPE}
     * 
     * @param pSDEViewBaseType
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASETYPE)
    public void setPSDEViewBaseType(String pSDEViewBaseType){
        this.set(FIELD_PSDEVIEWBASETYPE, pSDEViewBaseType);
    }
    
    /**
     * 获取 视图类型  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseType(){
        Object objValue = this.get(FIELD_PSDEVIEWBASETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseTypeDirty(){
        if(this.contains(FIELD_PSDEVIEWBASETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图类型
     */
    @JsonIgnore
    public void resetPSDEViewBaseType(){
        this.reset(FIELD_PSDEVIEWBASETYPE);
    }

    /**
     * 设置 视图类型，详细说明：{@link #FIELD_PSDEVIEWBASETYPE}
     * <P>
     * 等同 {@link #setPSDEViewBaseType}
     * @param pSDEViewBaseType
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdeviewbasetype(String pSDEViewBaseType){
        this.setPSDEViewBaseType(pSDEViewBaseType);
        return this;
    }

    /**
     * <B>PSDYNADEVIEWTEMPLID</B>&nbsp;动态实体视图模板，指定视图使用的动态实体视图模板
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNADEVIEWTEMPLID = "psdynadeviewtemplid";

    /**
     * 设置 动态实体视图模板，详细说明：{@link #FIELD_PSDYNADEVIEWTEMPLID}
     * 
     * @param pSDynaDEViewTemplId
     * 
     */
    @JsonProperty(FIELD_PSDYNADEVIEWTEMPLID)
    public void setPSDynaDEViewTemplId(String pSDynaDEViewTemplId){
        this.set(FIELD_PSDYNADEVIEWTEMPLID, pSDynaDEViewTemplId);
    }
    
    /**
     * 获取 动态实体视图模板  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDEViewTemplId(){
        Object objValue = this.get(FIELD_PSDYNADEVIEWTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体视图模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDEViewTemplIdDirty(){
        if(this.contains(FIELD_PSDYNADEVIEWTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体视图模板
     */
    @JsonIgnore
    public void resetPSDynaDEViewTemplId(){
        this.reset(FIELD_PSDYNADEVIEWTEMPLID);
    }

    /**
     * 设置 动态实体视图模板，详细说明：{@link #FIELD_PSDYNADEVIEWTEMPLID}
     * <P>
     * 等同 {@link #setPSDynaDEViewTemplId}
     * @param pSDynaDEViewTemplId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdynadeviewtemplid(String pSDynaDEViewTemplId){
        this.setPSDynaDEViewTemplId(pSDynaDEViewTemplId);
        return this;
    }

    /**
     * <B>PSDYNADEVIEWTEMPLNAME</B>&nbsp;动态实体视图模板，指定视图使用的动态实体视图模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDYNADEVIEWTEMPLID}
     */
    public final static String FIELD_PSDYNADEVIEWTEMPLNAME = "psdynadeviewtemplname";

    /**
     * 设置 动态实体视图模板，详细说明：{@link #FIELD_PSDYNADEVIEWTEMPLNAME}
     * 
     * @param pSDynaDEViewTemplName
     * 
     */
    @JsonProperty(FIELD_PSDYNADEVIEWTEMPLNAME)
    public void setPSDynaDEViewTemplName(String pSDynaDEViewTemplName){
        this.set(FIELD_PSDYNADEVIEWTEMPLNAME, pSDynaDEViewTemplName);
    }
    
    /**
     * 获取 动态实体视图模板  
     * @return
     */
    @JsonIgnore
    public String getPSDynaDEViewTemplName(){
        Object objValue = this.get(FIELD_PSDYNADEVIEWTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实体视图模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaDEViewTemplNameDirty(){
        if(this.contains(FIELD_PSDYNADEVIEWTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实体视图模板
     */
    @JsonIgnore
    public void resetPSDynaDEViewTemplName(){
        this.reset(FIELD_PSDYNADEVIEWTEMPLNAME);
    }

    /**
     * 设置 动态实体视图模板，详细说明：{@link #FIELD_PSDYNADEVIEWTEMPLNAME}
     * <P>
     * 等同 {@link #setPSDynaDEViewTemplName}
     * @param pSDynaDEViewTemplName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psdynadeviewtemplname(String pSDynaDEViewTemplName){
        this.setPSDynaDEViewTemplName(pSDynaDEViewTemplName);
        return this;
    }

    /**
     * <B>PSHELPMODULEID</B>&nbsp;视图帮助
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSHELPMODULEID = "pshelpmoduleid";

    /**
     * 设置 视图帮助
     * 
     * @param pSHelpModuleId
     * 
     */
    @JsonProperty(FIELD_PSHELPMODULEID)
    public void setPSHelpModuleId(String pSHelpModuleId){
        this.set(FIELD_PSHELPMODULEID, pSHelpModuleId);
    }
    
    /**
     * 获取 视图帮助  
     * @return
     */
    @JsonIgnore
    public String getPSHelpModuleId(){
        Object objValue = this.get(FIELD_PSHELPMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图帮助 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSHelpModuleIdDirty(){
        if(this.contains(FIELD_PSHELPMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图帮助
     */
    @JsonIgnore
    public void resetPSHelpModuleId(){
        this.reset(FIELD_PSHELPMODULEID);
    }

    /**
     * 设置 视图帮助
     * <P>
     * 等同 {@link #setPSHelpModuleId}
     * @param pSHelpModuleId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pshelpmoduleid(String pSHelpModuleId){
        this.setPSHelpModuleId(pSHelpModuleId);
        return this;
    }

    /**
     * <B>PSHELPMODULENAME</B>&nbsp;视图帮助
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSHELPMODULEID}
     */
    public final static String FIELD_PSHELPMODULENAME = "pshelpmodulename";

    /**
     * 设置 视图帮助
     * 
     * @param pSHelpModuleName
     * 
     */
    @JsonProperty(FIELD_PSHELPMODULENAME)
    public void setPSHelpModuleName(String pSHelpModuleName){
        this.set(FIELD_PSHELPMODULENAME, pSHelpModuleName);
    }
    
    /**
     * 获取 视图帮助  
     * @return
     */
    @JsonIgnore
    public String getPSHelpModuleName(){
        Object objValue = this.get(FIELD_PSHELPMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图帮助 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSHelpModuleNameDirty(){
        if(this.contains(FIELD_PSHELPMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图帮助
     */
    @JsonIgnore
    public void resetPSHelpModuleName(){
        this.reset(FIELD_PSHELPMODULENAME);
    }

    /**
     * 设置 视图帮助
     * <P>
     * 等同 {@link #setPSHelpModuleName}
     * @param pSHelpModuleName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pshelpmodulename(String pSHelpModuleName){
        this.setPSHelpModuleName(pSHelpModuleName);
        return this;
    }

    /**
     * <B>PSSUBVIEWTYPEID</B>&nbsp;系统视图样式，指定视图的样式，视图样式支持模板插件，视图样式在标准视图类型的基础上进一步增强视图的表现样式
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSubViewTypeDTO} 
     */
    public final static String FIELD_PSSUBVIEWTYPEID = "pssubviewtypeid";

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPEID}
     * 
     * @param pSSubViewTypeId
     * 
     */
    @JsonProperty(FIELD_PSSUBVIEWTYPEID)
    public void setPSSubViewTypeId(String pSSubViewTypeId){
        this.set(FIELD_PSSUBVIEWTYPEID, pSSubViewTypeId);
    }
    
    /**
     * 获取 系统视图样式  
     * @return
     */
    @JsonIgnore
    public String getPSSubViewTypeId(){
        Object objValue = this.get(FIELD_PSSUBVIEWTYPEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubViewTypeIdDirty(){
        if(this.contains(FIELD_PSSUBVIEWTYPEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图样式
     */
    @JsonIgnore
    public void resetPSSubViewTypeId(){
        this.reset(FIELD_PSSUBVIEWTYPEID);
    }

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPEID}
     * <P>
     * 等同 {@link #setPSSubViewTypeId}
     * @param pSSubViewTypeId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssubviewtypeid(String pSSubViewTypeId){
        this.setPSSubViewTypeId(pSSubViewTypeId);
        return this;
    }

    /**
     * 设置 系统视图样式，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubViewTypeId}
     * @param pSSubViewType 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssubviewtypeid(PSSubViewTypeDTO pSSubViewType){
        if(pSSubViewType == null){
            this.setPSSubViewTypeId(null);
            this.setPSSubViewTypeName(null);
        }
        else{
            this.setPSSubViewTypeId(pSSubViewType.getPSSubViewTypeId());
            this.setPSSubViewTypeName(pSSubViewType.getPSSubViewTypeName());
        }
        return this;
    }

    /**
     * <B>PSSUBVIEWTYPENAME</B>&nbsp;系统视图样式，指定视图的样式，视图样式支持模板插件，视图样式在标准视图类型的基础上进一步增强视图的表现样式
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBVIEWTYPEID}
     */
    public final static String FIELD_PSSUBVIEWTYPENAME = "pssubviewtypename";

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPENAME}
     * 
     * @param pSSubViewTypeName
     * 
     */
    @JsonProperty(FIELD_PSSUBVIEWTYPENAME)
    public void setPSSubViewTypeName(String pSSubViewTypeName){
        this.set(FIELD_PSSUBVIEWTYPENAME, pSSubViewTypeName);
    }
    
    /**
     * 获取 系统视图样式  
     * @return
     */
    @JsonIgnore
    public String getPSSubViewTypeName(){
        Object objValue = this.get(FIELD_PSSUBVIEWTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统视图样式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubViewTypeNameDirty(){
        if(this.contains(FIELD_PSSUBVIEWTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统视图样式
     */
    @JsonIgnore
    public void resetPSSubViewTypeName(){
        this.reset(FIELD_PSSUBVIEWTYPENAME);
    }

    /**
     * 设置 系统视图样式，详细说明：{@link #FIELD_PSSUBVIEWTYPENAME}
     * <P>
     * 等同 {@link #setPSSubViewTypeName}
     * @param pSSubViewTypeName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssubviewtypename(String pSSubViewTypeName){
        this.setPSSubViewTypeName(pSSubViewTypeName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;系统计数器，指定视图默认加载的界面计数器对象
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
    public PSDEViewBaseDTO pssyscounterid(String pSSysCounterId){
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
    public PSDEViewBaseDTO pssyscounterid(PSSysCounterDTO pSSysCounter){
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
     * <B>PSSYSCOUNTERNAME</B>&nbsp;系统计数器，指定视图默认加载的界面计数器对象
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
    public PSDEViewBaseDTO pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSSYSCSSID</B>&nbsp;界面样式表，指定视图的界面表，界面样式表将附加到视图的顶级容器，约束整体界面呈现
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysCssDTO} 
     */
    public final static String FIELD_PSSYSCSSID = "pssyscssid";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * 
     * @param pSSysCssId
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSID)
    public void setPSSysCssId(String pSSysCssId){
        this.set(FIELD_PSSYSCSSID, pSSysCssId);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssId(){
        this.reset(FIELD_PSSYSCSSID);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSID}
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCssId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssyscssid(String pSSysCssId){
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    /**
     * 设置 界面样式表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCssId}
     * @param pSSysCss 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssyscssid(PSSysCssDTO pSSysCss){
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
     * <B>PSSYSCSSNAME</B>&nbsp;界面样式表，指定视图的界面表，界面样式表将附加到视图的顶级容器，约束整体界面呈现
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCSSID}
     */
    public final static String FIELD_PSSYSCSSNAME = "pssyscssname";

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * 
     * @param pSSysCssName
     * 
     */
    @JsonProperty(FIELD_PSSYSCSSNAME)
    public void setPSSysCssName(String pSSysCssName){
        this.set(FIELD_PSSYSCSSNAME, pSSysCssName);
    }
    
    /**
     * 获取 界面样式表  
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
     * 判断 界面样式表 是否指定值，包括空值
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
     * 重置 界面样式表
     */
    @JsonIgnore
    public void resetPSSysCssName(){
        this.reset(FIELD_PSSYSCSSNAME);
    }

    /**
     * 设置 界面样式表，详细说明：{@link #FIELD_PSSYSCSSNAME}
     * <P>
     * 等同 {@link #setPSSysCssName}
     * @param pSSysCssName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssyscssname(String pSSysCssName){
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;扩展动态模型
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 扩展动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;扩展动态模型
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 扩展动态模型
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 扩展动态模型  
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
     * 判断 扩展动态模型 是否指定值，包括空值
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
     * 重置 扩展动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 扩展动态模型
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
        return this;
    }

    /**
     * <B>PSSYSIMAGEID</B>&nbsp;视图图标，指定视图的显示图标，未定义是使用所在实体的默认图标
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysImageDTO} 
     */
    public final static String FIELD_PSSYSIMAGEID = "pssysimageid";

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * 
     * @param pSSysImageId
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGEID)
    public void setPSSysImageId(String pSSysImageId){
        this.set(FIELD_PSSYSIMAGEID, pSSysImageId);
    }
    
    /**
     * 获取 视图图标  
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
     * 判断 视图图标 是否指定值，包括空值
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
     * 重置 视图图标
     */
    @JsonIgnore
    public void resetPSSysImageId(){
        this.reset(FIELD_PSSYSIMAGEID);
    }

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGEID}
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImageId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysimageid(String pSSysImageId){
        this.setPSSysImageId(pSSysImageId);
        return this;
    }

    /**
     * 设置 视图图标，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysimageid(PSSysImageDTO pSSysImage){
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
     * <B>PSSYSIMAGENAME</B>&nbsp;视图图标，指定视图的显示图标，未定义是使用所在实体的默认图标
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSIMAGEID}
     */
    public final static String FIELD_PSSYSIMAGENAME = "pssysimagename";

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * 
     * @param pSSysImageName
     * 
     */
    @JsonProperty(FIELD_PSSYSIMAGENAME)
    public void setPSSysImageName(String pSSysImageName){
        this.set(FIELD_PSSYSIMAGENAME, pSSysImageName);
    }
    
    /**
     * 获取 视图图标  
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
     * 判断 视图图标 是否指定值，包括空值
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
     * 重置 视图图标
     */
    @JsonIgnore
    public void resetPSSysImageName(){
        this.reset(FIELD_PSSYSIMAGENAME);
    }

    /**
     * 设置 视图图标，详细说明：{@link #FIELD_PSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setPSSysImageName}
     * @param pSSysImageName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysimagename(String pSSysImageName){
        this.setPSSysImageName(pSSysImageName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体视图使用的前端模板扩展插件，使用插件类型【实体视图绘制插件】
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
    public PSDEViewBaseDTO pssyspfpluginid(String pSSysPFPluginId){
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
    public PSDEViewBaseDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
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
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体视图使用的前端模板扩展插件，使用插件类型【实体视图绘制插件】
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
    public PSDEViewBaseDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSREQITEMID</B>&nbsp;系统设计需求
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysReqItemDTO} 
     */
    public final static String FIELD_PSSYSREQITEMID = "pssysreqitemid";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMID)
    public void setPSSysReqItemId(String pSSysReqItemId){
        this.set(FIELD_PSSYSREQITEMID, pSSysReqItemId);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemId(){
        Object objValue = this.get(FIELD_PSSYSREQITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemIdDirty(){
        if(this.contains(FIELD_PSSYSREQITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemId(){
        this.reset(FIELD_PSSYSREQITEMID);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItemId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysreqitemid(String pSSysReqItemId){
        this.setPSSysReqItemId(pSSysReqItemId);
        return this;
    }

    /**
     * 设置 系统设计需求，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysReqItemId}
     * @param pSSysReqItem 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysreqitemid(PSSysReqItemDTO pSSysReqItem){
        if(pSSysReqItem == null){
            this.setPSSysReqItemId(null);
            this.setPSSysReqItemName(null);
        }
        else{
            this.setPSSysReqItemId(pSSysReqItem.getPSSysReqItemId());
            this.setPSSysReqItemName(pSSysReqItem.getPSSysReqItemName());
        }
        return this;
    }

    /**
     * <B>PSSYSREQITEMNAME</B>&nbsp;系统设计需求
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSREQITEMID}
     */
    public final static String FIELD_PSSYSREQITEMNAME = "pssysreqitemname";

    /**
     * 设置 系统设计需求
     * 
     * @param pSSysReqItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSREQITEMNAME)
    public void setPSSysReqItemName(String pSSysReqItemName){
        this.set(FIELD_PSSYSREQITEMNAME, pSSysReqItemName);
    }
    
    /**
     * 获取 系统设计需求  
     * @return
     */
    @JsonIgnore
    public String getPSSysReqItemName(){
        Object objValue = this.get(FIELD_PSSYSREQITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统设计需求 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysReqItemNameDirty(){
        if(this.contains(FIELD_PSSYSREQITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统设计需求
     */
    @JsonIgnore
    public void resetPSSysReqItemName(){
        this.reset(FIELD_PSSYSREQITEMNAME);
    }

    /**
     * 设置 系统设计需求
     * <P>
     * 等同 {@link #setPSSysReqItemName}
     * @param pSSysReqItemName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysreqitemname(String pSSysReqItemName){
        this.setPSSysReqItemName(pSSysReqItemName);
        return this;
    }

    /**
     * <B>PSSYSUNIRESID</B>&nbsp;系统统一资源，实体视图访问用户模式设置为需要拥有指定资源能力时，指定相应的系统统一资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUniResDTO} 
     */
    public final static String FIELD_PSSYSUNIRESID = "pssysuniresid";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * 
     * @param pSSysUniResId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESID)
    public void setPSSysUniResId(String pSSysUniResId){
        this.set(FIELD_PSSYSUNIRESID, pSSysUniResId);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResId(){
        Object objValue = this.get(FIELD_PSSYSUNIRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResIdDirty(){
        if(this.contains(FIELD_PSSYSUNIRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResId(){
        this.reset(FIELD_PSSYSUNIRESID);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESID}
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniResId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysuniresid(String pSSysUniResId){
        this.setPSSysUniResId(pSSysUniResId);
        return this;
    }

    /**
     * 设置 系统统一资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniResId}
     * @param pSSysUniRes 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysuniresid(PSSysUniResDTO pSSysUniRes){
        if(pSSysUniRes == null){
            this.setPSSysUniResId(null);
            this.setPSSysUniResName(null);
        }
        else{
            this.setPSSysUniResId(pSSysUniRes.getPSSysUniResId());
            this.setPSSysUniResName(pSSysUniRes.getPSSysUniResName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNIRESNAME</B>&nbsp;系统统一资源，实体视图访问用户模式设置为需要拥有指定资源能力时，指定相应的系统统一资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNIRESID}
     */
    public final static String FIELD_PSSYSUNIRESNAME = "pssysuniresname";

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * 
     * @param pSSysUniResName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNIRESNAME)
    public void setPSSysUniResName(String pSSysUniResName){
        this.set(FIELD_PSSYSUNIRESNAME, pSSysUniResName);
    }
    
    /**
     * 获取 系统统一资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniResName(){
        Object objValue = this.get(FIELD_PSSYSUNIRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniResNameDirty(){
        if(this.contains(FIELD_PSSYSUNIRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一资源
     */
    @JsonIgnore
    public void resetPSSysUniResName(){
        this.reset(FIELD_PSSYSUNIRESNAME);
    }

    /**
     * 设置 系统统一资源，详细说明：{@link #FIELD_PSSYSUNIRESNAME}
     * <P>
     * 等同 {@link #setPSSysUniResName}
     * @param pSSysUniResName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysuniresname(String pSSysUniResName){
        this.setPSSysUniResName(pSSysUniResName);
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELID</B>&nbsp;视图布局面板，指定实体视图的布局面板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysViewPanelDTO} 
     */
    public final static String FIELD_PSSYSVIEWPANELID = "pssysviewpanelid";

    /**
     * 设置 视图布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * 
     * @param pSSysViewPanelId
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELID)
    public void setPSSysViewPanelId(String pSSysViewPanelId){
        this.set(FIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }
    
    /**
     * 获取 视图布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelId(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelId(){
        this.reset(FIELD_PSSYSVIEWPANELID);
    }

    /**
     * 设置 视图布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELID}
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanelId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysviewpanelid(String pSSysViewPanelId){
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    /**
     * 设置 视图布局面板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysViewPanelId}
     * @param pSSysViewPanel 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel){
        if(pSSysViewPanel == null){
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        }
        else{
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    /**
     * <B>PSSYSVIEWPANELNAME</B>&nbsp;视图布局面板，指定实体视图的布局面板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVIEWPANELID}
     */
    public final static String FIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";

    /**
     * 设置 视图布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * 
     * @param pSSysViewPanelName
     * 
     */
    @JsonProperty(FIELD_PSSYSVIEWPANELNAME)
    public void setPSSysViewPanelName(String pSSysViewPanelName){
        this.set(FIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }
    
    /**
     * 获取 视图布局面板  
     * @return
     */
    @JsonIgnore
    public String getPSSysViewPanelName(){
        Object objValue = this.get(FIELD_PSSYSVIEWPANELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图布局面板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty(){
        if(this.contains(FIELD_PSSYSVIEWPANELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图布局面板
     */
    @JsonIgnore
    public void resetPSSysViewPanelName(){
        this.reset(FIELD_PSSYSVIEWPANELNAME);
    }

    /**
     * 设置 视图布局面板，详细说明：{@link #FIELD_PSSYSVIEWPANELNAME}
     * <P>
     * 等同 {@link #setPSSysViewPanelName}
     * @param pSSysViewPanelName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pssysviewpanelname(String pSSysViewPanelName){
        this.setPSSysViewPanelName(pSSysViewPanelName);
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
    public PSDEViewBaseDTO psviewengineid(String pSViewEngineId){
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
    public PSDEViewBaseDTO psviewenginename(String pSViewEngineName){
        this.setPSViewEngineName(pSViewEngineName);
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPID</B>&nbsp;视图消息组，指定实体视图使用的视图消息组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSViewMsgGroupDTO} 
     */
    public final static String FIELD_PSVIEWMSGGROUPID = "psviewmsggroupid";

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPID}
     * 
     * @param pSViewMsgGroupId
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPID)
    public void setPSViewMsgGroupId(String pSViewMsgGroupId){
        this.set(FIELD_PSVIEWMSGGROUPID, pSViewMsgGroupId);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupId(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupIdDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupId(){
        this.reset(FIELD_PSVIEWMSGGROUPID);
    }

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPID}
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroupId
     */
    @JsonIgnore
    public PSDEViewBaseDTO psviewmsggroupid(String pSViewMsgGroupId){
        this.setPSViewMsgGroupId(pSViewMsgGroupId);
        return this;
    }

    /**
     * 设置 视图消息组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSViewMsgGroupId}
     * @param pSViewMsgGroup 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO psviewmsggroupid(PSViewMsgGroupDTO pSViewMsgGroup){
        if(pSViewMsgGroup == null){
            this.setPSViewMsgGroupId(null);
            this.setPSViewMsgGroupName(null);
        }
        else{
            this.setPSViewMsgGroupId(pSViewMsgGroup.getPSViewMsgGroupId());
            this.setPSViewMsgGroupName(pSViewMsgGroup.getPSViewMsgGroupName());
        }
        return this;
    }

    /**
     * <B>PSVIEWMSGGROUPNAME</B>&nbsp;视图消息组，指定实体视图使用的视图消息组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSVIEWMSGGROUPID}
     */
    public final static String FIELD_PSVIEWMSGGROUPNAME = "psviewmsggroupname";

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPNAME}
     * 
     * @param pSViewMsgGroupName
     * 
     */
    @JsonProperty(FIELD_PSVIEWMSGGROUPNAME)
    public void setPSViewMsgGroupName(String pSViewMsgGroupName){
        this.set(FIELD_PSVIEWMSGGROUPNAME, pSViewMsgGroupName);
    }
    
    /**
     * 获取 视图消息组  
     * @return
     */
    @JsonIgnore
    public String getPSViewMsgGroupName(){
        Object objValue = this.get(FIELD_PSVIEWMSGGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图消息组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSViewMsgGroupNameDirty(){
        if(this.contains(FIELD_PSVIEWMSGGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图消息组
     */
    @JsonIgnore
    public void resetPSViewMsgGroupName(){
        this.reset(FIELD_PSVIEWMSGGROUPNAME);
    }

    /**
     * 设置 视图消息组，详细说明：{@link #FIELD_PSVIEWMSGGROUPNAME}
     * <P>
     * 等同 {@link #setPSViewMsgGroupName}
     * @param pSViewMsgGroupName
     */
    @JsonIgnore
    public PSDEViewBaseDTO psviewmsggroupname(String pSViewMsgGroupName){
        this.setPSViewMsgGroupName(pSViewMsgGroupName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;实体工作流，指定实体工作流视图绑定的实体工作流对象，工作流视图一般都由流程版本自动展开
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFDEDTO} 
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 实体工作流，详细说明：{@link #FIELD_PSWFDEID}
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 实体工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEId(){
        Object objValue = this.get(FIELD_PSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDEIdDirty(){
        if(this.contains(FIELD_PSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体工作流
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 实体工作流，详细说明：{@link #FIELD_PSWFDEID}
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * 设置 实体工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDE 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfdeid(PSWFDEDTO pSWFDE){
        if(pSWFDE == null){
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
            this.setPSWFId(null);
        }
        else{
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
            this.setPSWFId(pSWFDE.getPSWFId());
        }
        return this;
    }

    /**
     * <B>PSWFDENAME</B>&nbsp;工作流实体，指定实体工作流视图绑定的实体工作流对象，工作流视图一般都由流程版本自动展开
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSWFDENAME = "pswfdename";

    /**
     * 设置 工作流实体，详细说明：{@link #FIELD_PSWFDENAME}
     * 
     * @param pSWFDEName
     * 
     */
    @JsonProperty(FIELD_PSWFDENAME)
    public void setPSWFDEName(String pSWFDEName){
        this.set(FIELD_PSWFDENAME, pSWFDEName);
    }
    
    /**
     * 获取 工作流实体  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEName(){
        Object objValue = this.get(FIELD_PSWFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDENameDirty(){
        if(this.contains(FIELD_PSWFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流实体
     */
    @JsonIgnore
    public void resetPSWFDEName(){
        this.reset(FIELD_PSWFDENAME);
    }

    /**
     * 设置 工作流实体，详细说明：{@link #FIELD_PSWFDENAME}
     * <P>
     * 等同 {@link #setPSWFDEName}
     * @param pSWFDEName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfdename(String pSWFDEName){
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    /**
     * <B>PSWFID</B>&nbsp;PSWFID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSWFID = "pswfid";

    /**
     * 设置 PSWFID
     * 
     * @param pSWFId
     * 
     */
    @JsonProperty(FIELD_PSWFID)
    public void setPSWFId(String pSWFId){
        this.set(FIELD_PSWFID, pSWFId);
    }
    
    /**
     * 获取 PSWFID  
     * @return
     */
    @JsonIgnore
    public String getPSWFId(){
        Object objValue = this.get(FIELD_PSWFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSWFID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFIdDirty(){
        if(this.contains(FIELD_PSWFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSWFID
     */
    @JsonIgnore
    public void resetPSWFId(){
        this.reset(FIELD_PSWFID);
    }

    /**
     * 设置 PSWFID
     * <P>
     * 等同 {@link #setPSWFId}
     * @param pSWFId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfid(String pSWFId){
        this.setPSWFId(pSWFId);
        return this;
    }

    /**
     * <B>PSWFVERSIONID</B>&nbsp;工作流版本，指定实体工作流视图使用的工作流版本，工作流视图一般都由流程版本自动展开
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFVersionDTO} 
     */
    public final static String FIELD_PSWFVERSIONID = "pswfversionid";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * 
     * @param pSWFVersionId
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONID)
    public void setPSWFVersionId(String pSWFVersionId){
        this.set(FIELD_PSWFVERSIONID, pSWFVersionId);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionId(){
        Object objValue = this.get(FIELD_PSWFVERSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionIdDirty(){
        if(this.contains(FIELD_PSWFVERSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionId(){
        this.reset(FIELD_PSWFVERSIONID);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONID}
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersionId
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfversionid(String pSWFVersionId){
        this.setPSWFVersionId(pSWFVersionId);
        return this;
    }

    /**
     * 设置 工作流版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFVersionId}
     * @param pSWFVersion 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfversionid(PSWFVersionDTO pSWFVersion){
        if(pSWFVersion == null){
            this.setPSWFVersionId(null);
            this.setPSWFVersionName(null);
        }
        else{
            this.setPSWFVersionId(pSWFVersion.getPSWFVersionId());
            this.setPSWFVersionName(pSWFVersion.getPSWFVersionName());
        }
        return this;
    }

    /**
     * <B>PSWFVERSIONNAME</B>&nbsp;工作流版本，指定实体工作流视图使用的工作流版本，工作流视图一般都由流程版本自动展开
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFVERSIONID}
     */
    public final static String FIELD_PSWFVERSIONNAME = "pswfversionname";

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * 
     * @param pSWFVersionName
     * 
     */
    @JsonProperty(FIELD_PSWFVERSIONNAME)
    public void setPSWFVersionName(String pSWFVersionName){
        this.set(FIELD_PSWFVERSIONNAME, pSWFVersionName);
    }
    
    /**
     * 获取 工作流版本  
     * @return
     */
    @JsonIgnore
    public String getPSWFVersionName(){
        Object objValue = this.get(FIELD_PSWFVERSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFVersionNameDirty(){
        if(this.contains(FIELD_PSWFVERSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流版本
     */
    @JsonIgnore
    public void resetPSWFVersionName(){
        this.reset(FIELD_PSWFVERSIONNAME);
    }

    /**
     * 设置 工作流版本，详细说明：{@link #FIELD_PSWFVERSIONNAME}
     * <P>
     * 等同 {@link #setPSWFVersionName}
     * @param pSWFVersionName
     */
    @JsonIgnore
    public PSDEViewBaseDTO pswfversionname(String pSWFVersionName){
        this.setPSWFVersionName(pSWFVersionName);
        return this;
    }

    /**
     * <B>READONLYMODE</B>&nbsp;只读模式，指定视图是否处于自读模式，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_READONLYMODE = "readonlymode";

    /**
     * 设置 只读模式，详细说明：{@link #FIELD_READONLYMODE}
     * 
     * @param readOnlyMode
     * 
     */
    @JsonProperty(FIELD_READONLYMODE)
    public void setReadOnlyMode(Integer readOnlyMode){
        this.set(FIELD_READONLYMODE, readOnlyMode);
    }
    
    /**
     * 获取 只读模式  
     * @return
     */
    @JsonIgnore
    public Integer getReadOnlyMode(){
        Object objValue = this.get(FIELD_READONLYMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 只读模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isReadOnlyModeDirty(){
        if(this.contains(FIELD_READONLYMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 只读模式
     */
    @JsonIgnore
    public void resetReadOnlyMode(){
        this.reset(FIELD_READONLYMODE);
    }

    /**
     * 设置 只读模式，详细说明：{@link #FIELD_READONLYMODE}
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO readonlymode(Integer readOnlyMode){
        this.setReadOnlyMode(readOnlyMode);
        return this;
    }

     /**
     * 设置 只读模式，详细说明：{@link #FIELD_READONLYMODE}
     * <P>
     * 等同 {@link #setReadOnlyMode}
     * @param readOnlyMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO readonlymode(Boolean readOnlyMode){
        if(readOnlyMode == null){
            this.setReadOnlyMode(null);
        }
        else{
            this.setReadOnlyMode(readOnlyMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SHOWCAPTIONBAR</B>&nbsp;显示标题栏，指定视图是否显示标题栏，未定义时由各视图类型自行决定
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SHOWCAPTIONBAR = "showcaptionbar";

    /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWCAPTIONBAR}
     * 
     * @param showCaptionBar
     * 
     */
    @JsonProperty(FIELD_SHOWCAPTIONBAR)
    public void setShowCaptionBar(Integer showCaptionBar){
        this.set(FIELD_SHOWCAPTIONBAR, showCaptionBar);
    }
    
    /**
     * 获取 显示标题栏  
     * @return
     */
    @JsonIgnore
    public Integer getShowCaptionBar(){
        Object objValue = this.get(FIELD_SHOWCAPTIONBAR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 显示标题栏 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowCaptionBarDirty(){
        if(this.contains(FIELD_SHOWCAPTIONBAR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示标题栏
     */
    @JsonIgnore
    public void resetShowCaptionBar(){
        this.reset(FIELD_SHOWCAPTIONBAR);
    }

    /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWCAPTIONBAR}
     * <P>
     * 等同 {@link #setShowCaptionBar}
     * @param showCaptionBar
     */
    @JsonIgnore
    public PSDEViewBaseDTO showcaptionbar(Integer showCaptionBar){
        this.setShowCaptionBar(showCaptionBar);
        return this;
    }

     /**
     * 设置 显示标题栏，详细说明：{@link #FIELD_SHOWCAPTIONBAR}
     * <P>
     * 等同 {@link #setShowCaptionBar}
     * @param showCaptionBar
     */
    @JsonIgnore
    public PSDEViewBaseDTO showcaptionbar(Boolean showCaptionBar){
        if(showCaptionBar == null){
            this.setShowCaptionBar(null);
        }
        else{
            this.setShowCaptionBar(showCaptionBar?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SUBCAPPSLANRESID</B>&nbsp;子标题语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_SUBCAPPSLANRESID = "subcappslanresid";

    /**
     * 设置 子标题语言资源
     * 
     * @param subCapPSLanResId
     * 
     */
    @JsonProperty(FIELD_SUBCAPPSLANRESID)
    public void setSubCapPSLanResId(String subCapPSLanResId){
        this.set(FIELD_SUBCAPPSLANRESID, subCapPSLanResId);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubCapPSLanResId(){
        Object objValue = this.get(FIELD_SUBCAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCapPSLanResIdDirty(){
        if(this.contains(FIELD_SUBCAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubCapPSLanResId(){
        this.reset(FIELD_SUBCAPPSLANRESID);
    }

    /**
     * 设置 子标题语言资源
     * <P>
     * 等同 {@link #setSubCapPSLanResId}
     * @param subCapPSLanResId
     */
    @JsonIgnore
    public PSDEViewBaseDTO subcappslanresid(String subCapPSLanResId){
        this.setSubCapPSLanResId(subCapPSLanResId);
        return this;
    }

    /**
     * 设置 子标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSubCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO subcappslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setSubCapPSLanResId(null);
            this.setSubCapPSLanResName(null);
        }
        else{
            this.setSubCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setSubCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>SUBCAPPSLANRESNAME</B>&nbsp;子标题语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SUBCAPPSLANRESID}
     */
    public final static String FIELD_SUBCAPPSLANRESNAME = "subcappslanresname";

    /**
     * 设置 子标题语言资源
     * 
     * @param subCapPSLanResName
     * 
     */
    @JsonProperty(FIELD_SUBCAPPSLANRESNAME)
    public void setSubCapPSLanResName(String subCapPSLanResName){
        this.set(FIELD_SUBCAPPSLANRESNAME, subCapPSLanResName);
    }
    
    /**
     * 获取 子标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getSubCapPSLanResName(){
        Object objValue = this.get(FIELD_SUBCAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 子标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCapPSLanResNameDirty(){
        if(this.contains(FIELD_SUBCAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 子标题语言资源
     */
    @JsonIgnore
    public void resetSubCapPSLanResName(){
        this.reset(FIELD_SUBCAPPSLANRESNAME);
    }

    /**
     * 设置 子标题语言资源
     * <P>
     * 等同 {@link #setSubCapPSLanResName}
     * @param subCapPSLanResName
     */
    @JsonIgnore
    public PSDEViewBaseDTO subcappslanresname(String subCapPSLanResName){
        this.setSubCapPSLanResName(subCapPSLanResName);
        return this;
    }

    /**
     * <B>SUBCAPTION</B>&nbsp;视图子标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SUBCAPTION = "subcaption";

    /**
     * 设置 视图子标题
     * 
     * @param subCaption
     * 
     */
    @JsonProperty(FIELD_SUBCAPTION)
    public void setSubCaption(String subCaption){
        this.set(FIELD_SUBCAPTION, subCaption);
    }
    
    /**
     * 获取 视图子标题  
     * @return
     */
    @JsonIgnore
    public String getSubCaption(){
        Object objValue = this.get(FIELD_SUBCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图子标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSubCaptionDirty(){
        if(this.contains(FIELD_SUBCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图子标题
     */
    @JsonIgnore
    public void resetSubCaption(){
        this.reset(FIELD_SUBCAPTION);
    }

    /**
     * 设置 视图子标题
     * <P>
     * 等同 {@link #setSubCaption}
     * @param subCaption
     */
    @JsonIgnore
    public PSDEViewBaseDTO subcaption(String subCaption){
        this.setSubCaption(subCaption);
        return this;
    }

    /**
     * <B>TEMPMODE</B>&nbsp;临时数据模式，指定实体视图的临时数据模型，未定义时为【无临时数据模式】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TempDataMode} 
     */
    public final static String FIELD_TEMPMODE = "tempmode";

    /**
     * 设置 临时数据模式，详细说明：{@link #FIELD_TEMPMODE}
     * 
     * @param tempMode
     * 
     */
    @JsonProperty(FIELD_TEMPMODE)
    public void setTempMode(Integer tempMode){
        this.set(FIELD_TEMPMODE, tempMode);
    }
    
    /**
     * 获取 临时数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getTempMode(){
        Object objValue = this.get(FIELD_TEMPMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 临时数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTempModeDirty(){
        if(this.contains(FIELD_TEMPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 临时数据模式
     */
    @JsonIgnore
    public void resetTempMode(){
        this.reset(FIELD_TEMPMODE);
    }

    /**
     * 设置 临时数据模式，详细说明：{@link #FIELD_TEMPMODE}
     * <P>
     * 等同 {@link #setTempMode}
     * @param tempMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO tempmode(Integer tempMode){
        this.setTempMode(tempMode);
        return this;
    }

     /**
     * 设置 临时数据模式，详细说明：{@link #FIELD_TEMPMODE}
     * <P>
     * 等同 {@link #setTempMode}
     * @param tempMode
     */
    @JsonIgnore
    public PSDEViewBaseDTO tempmode(net.ibizsys.model.PSModelEnums.TempDataMode tempMode){
        if(tempMode == null){
            this.setTempMode(null);
        }
        else{
            this.setTempMode(tempMode.value);
        }
        return this;
    }

    /**
     * <B>TITLE</B>&nbsp;视图抬头，指定视图的抬头
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 设置 视图抬头，详细说明：{@link #FIELD_TITLE}
     * 
     * @param title
     * 
     */
    @JsonProperty(FIELD_TITLE)
    public void setTitle(String title){
        this.set(FIELD_TITLE, title);
    }
    
    /**
     * 获取 视图抬头  
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
     * 判断 视图抬头 是否指定值，包括空值
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
     * 重置 视图抬头
     */
    @JsonIgnore
    public void resetTitle(){
        this.reset(FIELD_TITLE);
    }

    /**
     * 设置 视图抬头，详细说明：{@link #FIELD_TITLE}
     * <P>
     * 等同 {@link #setTitle}
     * @param title
     */
    @JsonIgnore
    public PSDEViewBaseDTO title(String title){
        this.setTitle(title);
        return this;
    }

    /**
     * <B>TITLEPSLANRESID</B>&nbsp;抬头语言资源，指定视图抬头的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_TITLEPSLANRESID = "titlepslanresid";

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * 
     * @param titlePSLanResId
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESID)
    public void setTitlePSLanResId(String titlePSLanResId){
        this.set(FIELD_TITLEPSLANRESID, titlePSLanResId);
    }
    
    /**
     * 获取 抬头语言资源  
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
     * 判断 抬头语言资源 是否指定值，包括空值
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
     * 重置 抬头语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResId(){
        this.reset(FIELD_TITLEPSLANRESID);
    }

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESID}
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param titlePSLanResId
     */
    @JsonIgnore
    public PSDEViewBaseDTO titlepslanresid(String titlePSLanResId){
        this.setTitlePSLanResId(titlePSLanResId);
        return this;
    }

    /**
     * 设置 抬头语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setTitlePSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEViewBaseDTO titlepslanresid(PSLanguageResDTO pSLanguageRes){
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
     * <B>TITLEPSLANRESNAME</B>&nbsp;抬头语言资源，指定视图抬头的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_TITLEPSLANRESID}
     */
    public final static String FIELD_TITLEPSLANRESNAME = "titlepslanresname";

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * 
     * @param titlePSLanResName
     * 
     */
    @JsonProperty(FIELD_TITLEPSLANRESNAME)
    public void setTitlePSLanResName(String titlePSLanResName){
        this.set(FIELD_TITLEPSLANRESNAME, titlePSLanResName);
    }
    
    /**
     * 获取 抬头语言资源  
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
     * 判断 抬头语言资源 是否指定值，包括空值
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
     * 重置 抬头语言资源
     */
    @JsonIgnore
    public void resetTitlePSLanResName(){
        this.reset(FIELD_TITLEPSLANRESNAME);
    }

    /**
     * 设置 抬头语言资源，详细说明：{@link #FIELD_TITLEPSLANRESNAME}
     * <P>
     * 等同 {@link #setTitlePSLanResName}
     * @param titlePSLanResName
     */
    @JsonIgnore
    public PSDEViewBaseDTO titlepslanresname(String titlePSLanResName){
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
    public PSDEViewBaseDTO updatedate(Timestamp updateDate){
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
    public PSDEViewBaseDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERDATA</B>&nbsp;视图数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA = "userdata";

    /**
     * 设置 视图数据
     * 
     * @param userData
     * 
     */
    @JsonProperty(FIELD_USERDATA)
    public void setUserData(String userData){
        this.set(FIELD_USERDATA, userData);
    }
    
    /**
     * 获取 视图数据  
     * @return
     */
    @JsonIgnore
    public String getUserData(){
        Object objValue = this.get(FIELD_USERDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserDataDirty(){
        if(this.contains(FIELD_USERDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图数据
     */
    @JsonIgnore
    public void resetUserData(){
        this.reset(FIELD_USERDATA);
    }

    /**
     * 设置 视图数据
     * <P>
     * 等同 {@link #setUserData}
     * @param userData
     */
    @JsonIgnore
    public PSDEViewBaseDTO userdata(String userData){
        this.setUserData(userData);
        return this;
    }

    /**
     * <B>USERDATA2</B>&nbsp;视图数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERDATA2 = "userdata2";

    /**
     * 设置 视图数据2
     * 
     * @param userData2
     * 
     */
    @JsonProperty(FIELD_USERDATA2)
    public void setUserData2(String userData2){
        this.set(FIELD_USERDATA2, userData2);
    }
    
    /**
     * 获取 视图数据2  
     * @return
     */
    @JsonIgnore
    public String getUserData2(){
        Object objValue = this.get(FIELD_USERDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserData2Dirty(){
        if(this.contains(FIELD_USERDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图数据2
     */
    @JsonIgnore
    public void resetUserData2(){
        this.reset(FIELD_USERDATA2);
    }

    /**
     * 设置 视图数据2
     * <P>
     * 等同 {@link #setUserData2}
     * @param userData2
     */
    @JsonIgnore
    public PSDEViewBaseDTO userdata2(String userData2){
        this.setUserData2(userData2);
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
    public PSDEViewBaseDTO userparams(String userParams){
        this.setUserParams(userParams);
        return this;
    }

    /**
     * <B>VIEWACTIONS</B>&nbsp;视图操作控制，视图启用操作控制时，指定视图支持的操作集合
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DEViewAction} 
     */
    public final static String FIELD_VIEWACTIONS = "viewactions";

    /**
     * 设置 视图操作控制，详细说明：{@link #FIELD_VIEWACTIONS}
     * 
     * @param viewActions
     * 
     */
    @JsonProperty(FIELD_VIEWACTIONS)
    public void setViewActions(Integer viewActions){
        this.set(FIELD_VIEWACTIONS, viewActions);
    }
    
    /**
     * 获取 视图操作控制  
     * @return
     */
    @JsonIgnore
    public Integer getViewActions(){
        Object objValue = this.get(FIELD_VIEWACTIONS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图操作控制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewActionsDirty(){
        if(this.contains(FIELD_VIEWACTIONS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图操作控制
     */
    @JsonIgnore
    public void resetViewActions(){
        this.reset(FIELD_VIEWACTIONS);
    }

    /**
     * 设置 视图操作控制，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewactions(Integer viewActions){
        this.setViewActions(viewActions);
        return this;
    }

     /**
     * 设置 视图操作控制，详细说明：{@link #FIELD_VIEWACTIONS}
     * <P>
     * 等同 {@link #setViewActions}
     * @param viewActions
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewactions(net.ibizsys.model.PSModelEnums.DEViewAction[] viewActions){
        if(viewActions == null || viewActions.length == 0){
            this.setViewActions(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.model.PSModelEnums.DEViewAction _item : viewActions){
                _value |= _item.value;
            }
            this.setViewActions(_value);
        }
        return this;
    }

    /**
     * <B>VIEWPARAM</B>&nbsp;视图参数，指定视图参数
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_VIEWPARAM = "viewparam";

    /**
     * 设置 视图参数，详细说明：{@link #FIELD_VIEWPARAM}
     * 
     * @param viewParam
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM)
    public void setViewParam(String viewParam){
        this.set(FIELD_VIEWPARAM, viewParam);
    }
    
    /**
     * 获取 视图参数  
     * @return
     */
    @JsonIgnore
    public String getViewParam(){
        Object objValue = this.get(FIELD_VIEWPARAM);
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
    public boolean isViewParamDirty(){
        if(this.contains(FIELD_VIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数
     */
    @JsonIgnore
    public void resetViewParam(){
        this.reset(FIELD_VIEWPARAM);
    }

    /**
     * 设置 视图参数，详细说明：{@link #FIELD_VIEWPARAM}
     * <P>
     * 等同 {@link #setViewParam}
     * @param viewParam
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam(String viewParam){
        this.setViewParam(viewParam);
        return this;
    }

    /**
     * <B>VIEWPARAM10</B>&nbsp;视图参数10，指定视图参数10
     */
    public final static String FIELD_VIEWPARAM10 = "viewparam10";

    /**
     * 设置 视图参数10，详细说明：{@link #FIELD_VIEWPARAM10}
     * 
     * @param viewParam10
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM10)
    public void setViewParam10(Integer viewParam10){
        this.set(FIELD_VIEWPARAM10, viewParam10);
    }
    
    /**
     * 获取 视图参数10  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam10(){
        Object objValue = this.get(FIELD_VIEWPARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam10Dirty(){
        if(this.contains(FIELD_VIEWPARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数10
     */
    @JsonIgnore
    public void resetViewParam10(){
        this.reset(FIELD_VIEWPARAM10);
    }

    /**
     * 设置 视图参数10，详细说明：{@link #FIELD_VIEWPARAM10}
     * <P>
     * 等同 {@link #setViewParam10}
     * @param viewParam10
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam10(Integer viewParam10){
        this.setViewParam10(viewParam10);
        return this;
    }

    /**
     * <B>VIEWPARAM2</B>&nbsp;视图参数2，指定视图参数2
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_VIEWPARAM2 = "viewparam2";

    /**
     * 设置 视图参数2，详细说明：{@link #FIELD_VIEWPARAM2}
     * 
     * @param viewParam2
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM2)
    public void setViewParam2(String viewParam2){
        this.set(FIELD_VIEWPARAM2, viewParam2);
    }
    
    /**
     * 获取 视图参数2  
     * @return
     */
    @JsonIgnore
    public String getViewParam2(){
        Object objValue = this.get(FIELD_VIEWPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam2Dirty(){
        if(this.contains(FIELD_VIEWPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数2
     */
    @JsonIgnore
    public void resetViewParam2(){
        this.reset(FIELD_VIEWPARAM2);
    }

    /**
     * 设置 视图参数2，详细说明：{@link #FIELD_VIEWPARAM2}
     * <P>
     * 等同 {@link #setViewParam2}
     * @param viewParam2
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam2(String viewParam2){
        this.setViewParam2(viewParam2);
        return this;
    }

    /**
     * <B>VIEWPARAM3</B>&nbsp;视图参数3，指定视图参数3
     */
    public final static String FIELD_VIEWPARAM3 = "viewparam3";

    /**
     * 设置 视图参数3，详细说明：{@link #FIELD_VIEWPARAM3}
     * 
     * @param viewParam3
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM3)
    public void setViewParam3(Integer viewParam3){
        this.set(FIELD_VIEWPARAM3, viewParam3);
    }
    
    /**
     * 获取 视图参数3  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam3(){
        Object objValue = this.get(FIELD_VIEWPARAM3);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam3Dirty(){
        if(this.contains(FIELD_VIEWPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数3
     */
    @JsonIgnore
    public void resetViewParam3(){
        this.reset(FIELD_VIEWPARAM3);
    }

    /**
     * 设置 视图参数3，详细说明：{@link #FIELD_VIEWPARAM3}
     * <P>
     * 等同 {@link #setViewParam3}
     * @param viewParam3
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam3(Integer viewParam3){
        this.setViewParam3(viewParam3);
        return this;
    }

    /**
     * <B>VIEWPARAM4</B>&nbsp;视图参数4，指定视图参数4
     */
    public final static String FIELD_VIEWPARAM4 = "viewparam4";

    /**
     * 设置 视图参数4，详细说明：{@link #FIELD_VIEWPARAM4}
     * 
     * @param viewParam4
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM4)
    public void setViewParam4(Integer viewParam4){
        this.set(FIELD_VIEWPARAM4, viewParam4);
    }
    
    /**
     * 获取 视图参数4  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam4(){
        Object objValue = this.get(FIELD_VIEWPARAM4);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam4Dirty(){
        if(this.contains(FIELD_VIEWPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数4
     */
    @JsonIgnore
    public void resetViewParam4(){
        this.reset(FIELD_VIEWPARAM4);
    }

    /**
     * 设置 视图参数4，详细说明：{@link #FIELD_VIEWPARAM4}
     * <P>
     * 等同 {@link #setViewParam4}
     * @param viewParam4
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam4(Integer viewParam4){
        this.setViewParam4(viewParam4);
        return this;
    }

    /**
     * <B>VIEWPARAM5</B>&nbsp;视图参数5，指定视图参数5
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VIEWPARAM5 = "viewparam5";

    /**
     * 设置 视图参数5，详细说明：{@link #FIELD_VIEWPARAM5}
     * 
     * @param viewParam5
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM5)
    public void setViewParam5(Integer viewParam5){
        this.set(FIELD_VIEWPARAM5, viewParam5);
    }
    
    /**
     * 获取 视图参数5  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam5(){
        Object objValue = this.get(FIELD_VIEWPARAM5);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam5Dirty(){
        if(this.contains(FIELD_VIEWPARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数5
     */
    @JsonIgnore
    public void resetViewParam5(){
        this.reset(FIELD_VIEWPARAM5);
    }

    /**
     * 设置 视图参数5，详细说明：{@link #FIELD_VIEWPARAM5}
     * <P>
     * 等同 {@link #setViewParam5}
     * @param viewParam5
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam5(Integer viewParam5){
        this.setViewParam5(viewParam5);
        return this;
    }

     /**
     * 设置 视图参数5，详细说明：{@link #FIELD_VIEWPARAM5}
     * <P>
     * 等同 {@link #setViewParam5}
     * @param viewParam5
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam5(Boolean viewParam5){
        if(viewParam5 == null){
            this.setViewParam5(null);
        }
        else{
            this.setViewParam5(viewParam5?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWPARAM6</B>&nbsp;视图参数6，指定视图参数6
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VIEWPARAM6 = "viewparam6";

    /**
     * 设置 视图参数6，详细说明：{@link #FIELD_VIEWPARAM6}
     * 
     * @param viewParam6
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM6)
    public void setViewParam6(Integer viewParam6){
        this.set(FIELD_VIEWPARAM6, viewParam6);
    }
    
    /**
     * 获取 视图参数6  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam6(){
        Object objValue = this.get(FIELD_VIEWPARAM6);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam6Dirty(){
        if(this.contains(FIELD_VIEWPARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数6
     */
    @JsonIgnore
    public void resetViewParam6(){
        this.reset(FIELD_VIEWPARAM6);
    }

    /**
     * 设置 视图参数6，详细说明：{@link #FIELD_VIEWPARAM6}
     * <P>
     * 等同 {@link #setViewParam6}
     * @param viewParam6
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam6(Integer viewParam6){
        this.setViewParam6(viewParam6);
        return this;
    }

     /**
     * 设置 视图参数6，详细说明：{@link #FIELD_VIEWPARAM6}
     * <P>
     * 等同 {@link #setViewParam6}
     * @param viewParam6
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam6(Boolean viewParam6){
        if(viewParam6 == null){
            this.setViewParam6(null);
        }
        else{
            this.setViewParam6(viewParam6?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VIEWPARAM7</B>&nbsp;视图参数7，指定视图参数7
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VIEWPARAM7 = "viewparam7";

    /**
     * 设置 视图参数7，详细说明：{@link #FIELD_VIEWPARAM7}
     * 
     * @param viewParam7
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM7)
    public void setViewParam7(String viewParam7){
        this.set(FIELD_VIEWPARAM7, viewParam7);
    }
    
    /**
     * 获取 视图参数7  
     * @return
     */
    @JsonIgnore
    public String getViewParam7(){
        Object objValue = this.get(FIELD_VIEWPARAM7);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam7Dirty(){
        if(this.contains(FIELD_VIEWPARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数7
     */
    @JsonIgnore
    public void resetViewParam7(){
        this.reset(FIELD_VIEWPARAM7);
    }

    /**
     * 设置 视图参数7，详细说明：{@link #FIELD_VIEWPARAM7}
     * <P>
     * 等同 {@link #setViewParam7}
     * @param viewParam7
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam7(String viewParam7){
        this.setViewParam7(viewParam7);
        return this;
    }

    /**
     * <B>VIEWPARAM8</B>&nbsp;视图参数8，指定视图参数8
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_VIEWPARAM8 = "viewparam8";

    /**
     * 设置 视图参数8，详细说明：{@link #FIELD_VIEWPARAM8}
     * 
     * @param viewParam8
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM8)
    public void setViewParam8(String viewParam8){
        this.set(FIELD_VIEWPARAM8, viewParam8);
    }
    
    /**
     * 获取 视图参数8  
     * @return
     */
    @JsonIgnore
    public String getViewParam8(){
        Object objValue = this.get(FIELD_VIEWPARAM8);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam8Dirty(){
        if(this.contains(FIELD_VIEWPARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数8
     */
    @JsonIgnore
    public void resetViewParam8(){
        this.reset(FIELD_VIEWPARAM8);
    }

    /**
     * 设置 视图参数8，详细说明：{@link #FIELD_VIEWPARAM8}
     * <P>
     * 等同 {@link #setViewParam8}
     * @param viewParam8
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam8(String viewParam8){
        this.setViewParam8(viewParam8);
        return this;
    }

    /**
     * <B>VIEWPARAM9</B>&nbsp;视图参数9，指定视图参数9
     */
    public final static String FIELD_VIEWPARAM9 = "viewparam9";

    /**
     * 设置 视图参数9，详细说明：{@link #FIELD_VIEWPARAM9}
     * 
     * @param viewParam9
     * 
     */
    @JsonProperty(FIELD_VIEWPARAM9)
    public void setViewParam9(Integer viewParam9){
        this.set(FIELD_VIEWPARAM9, viewParam9);
    }
    
    /**
     * 获取 视图参数9  
     * @return
     */
    @JsonIgnore
    public Integer getViewParam9(){
        Object objValue = this.get(FIELD_VIEWPARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 视图参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParam9Dirty(){
        if(this.contains(FIELD_VIEWPARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数9
     */
    @JsonIgnore
    public void resetViewParam9(){
        this.reset(FIELD_VIEWPARAM9);
    }

    /**
     * 设置 视图参数9，详细说明：{@link #FIELD_VIEWPARAM9}
     * <P>
     * 等同 {@link #setViewParam9}
     * @param viewParam9
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparam9(Integer viewParam9){
        this.setViewParam9(viewParam9);
        return this;
    }

    /**
     * <B>VIEWPARAMS</B>&nbsp;视图动态参数，指定视图的动态参数，使用Properties格式
     */
    public final static String FIELD_VIEWPARAMS = "viewparams";

    /**
     * 设置 视图动态参数，详细说明：{@link #FIELD_VIEWPARAMS}
     * 
     * @param viewParams
     * 
     */
    @JsonProperty(FIELD_VIEWPARAMS)
    public void setViewParams(String viewParams){
        this.set(FIELD_VIEWPARAMS, viewParams);
    }
    
    /**
     * 获取 视图动态参数  
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
     * 判断 视图动态参数 是否指定值，包括空值
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
     * 重置 视图动态参数
     */
    @JsonIgnore
    public void resetViewParams(){
        this.reset(FIELD_VIEWPARAMS);
    }

    /**
     * 设置 视图动态参数，详细说明：{@link #FIELD_VIEWPARAMS}
     * <P>
     * 等同 {@link #setViewParams}
     * @param viewParams
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewparams(String viewParams){
        this.setViewParams(viewParams);
        return this;
    }

    /**
     * <B>VIEWSN</B>&nbsp;视图编号，指定视图编号
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_VIEWSN = "viewsn";

    /**
     * 设置 视图编号，详细说明：{@link #FIELD_VIEWSN}
     * 
     * @param viewSN
     * 
     */
    @JsonProperty(FIELD_VIEWSN)
    public void setViewSN(String viewSN){
        this.set(FIELD_VIEWSN, viewSN);
    }
    
    /**
     * 获取 视图编号  
     * @return
     */
    @JsonIgnore
    public String getViewSN(){
        Object objValue = this.get(FIELD_VIEWSN);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图编号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewSNDirty(){
        if(this.contains(FIELD_VIEWSN)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图编号
     */
    @JsonIgnore
    public void resetViewSN(){
        this.reset(FIELD_VIEWSN);
    }

    /**
     * 设置 视图编号，详细说明：{@link #FIELD_VIEWSN}
     * <P>
     * 等同 {@link #setViewSN}
     * @param viewSN
     */
    @JsonIgnore
    public PSDEViewBaseDTO viewsn(String viewSN){
        this.setViewSN(viewSN);
        return this;
    }

    /**
     * <B>WFVIEWPARAM</B>&nbsp;流程视图参数，指定工作流视图参数
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_WFVIEWPARAM = "wfviewparam";

    /**
     * 设置 流程视图参数，详细说明：{@link #FIELD_WFVIEWPARAM}
     * 
     * @param wFViewParam
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM)
    public void setWFViewParam(Integer wFViewParam){
        this.set(FIELD_WFVIEWPARAM, wFViewParam);
    }
    
    /**
     * 获取 流程视图参数  
     * @return
     */
    @JsonIgnore
    public Integer getWFViewParam(){
        Object objValue = this.get(FIELD_WFVIEWPARAM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 流程视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParamDirty(){
        if(this.contains(FIELD_WFVIEWPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数
     */
    @JsonIgnore
    public void resetWFViewParam(){
        this.reset(FIELD_WFVIEWPARAM);
    }

    /**
     * 设置 流程视图参数，详细说明：{@link #FIELD_WFVIEWPARAM}
     * <P>
     * 等同 {@link #setWFViewParam}
     * @param wFViewParam
     */
    @JsonIgnore
    public PSDEViewBaseDTO wfviewparam(Integer wFViewParam){
        this.setWFViewParam(wFViewParam);
        return this;
    }

     /**
     * 设置 流程视图参数，详细说明：{@link #FIELD_WFVIEWPARAM}
     * <P>
     * 等同 {@link #setWFViewParam}
     * @param wFViewParam
     */
    @JsonIgnore
    public PSDEViewBaseDTO wfviewparam(Boolean wFViewParam){
        if(wFViewParam == null){
            this.setWFViewParam(null);
        }
        else{
            this.setWFViewParam(wFViewParam?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WFVIEWPARAM2</B>&nbsp;流程视图参数2，指定工作流视图参数2
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_WFVIEWPARAM2 = "wfviewparam2";

    /**
     * 设置 流程视图参数2，详细说明：{@link #FIELD_WFVIEWPARAM2}
     * 
     * @param wFViewParam2
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM2)
    public void setWFViewParam2(Integer wFViewParam2){
        this.set(FIELD_WFVIEWPARAM2, wFViewParam2);
    }
    
    /**
     * 获取 流程视图参数2  
     * @return
     */
    @JsonIgnore
    public Integer getWFViewParam2(){
        Object objValue = this.get(FIELD_WFVIEWPARAM2);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 流程视图参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParam2Dirty(){
        if(this.contains(FIELD_WFVIEWPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数2
     */
    @JsonIgnore
    public void resetWFViewParam2(){
        this.reset(FIELD_WFVIEWPARAM2);
    }

    /**
     * 设置 流程视图参数2，详细说明：{@link #FIELD_WFVIEWPARAM2}
     * <P>
     * 等同 {@link #setWFViewParam2}
     * @param wFViewParam2
     */
    @JsonIgnore
    public PSDEViewBaseDTO wfviewparam2(Integer wFViewParam2){
        this.setWFViewParam2(wFViewParam2);
        return this;
    }

     /**
     * 设置 流程视图参数2，详细说明：{@link #FIELD_WFVIEWPARAM2}
     * <P>
     * 等同 {@link #setWFViewParam2}
     * @param wFViewParam2
     */
    @JsonIgnore
    public PSDEViewBaseDTO wfviewparam2(Boolean wFViewParam2){
        if(wFViewParam2 == null){
            this.setWFViewParam2(null);
        }
        else{
            this.setWFViewParam2(wFViewParam2?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>WFVIEWPARAM3</B>&nbsp;流程视图参数3，指定工作流视图参数3
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_WFVIEWPARAM3 = "wfviewparam3";

    /**
     * 设置 流程视图参数3，详细说明：{@link #FIELD_WFVIEWPARAM3}
     * 
     * @param wFViewParam3
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM3)
    public void setWFViewParam3(String wFViewParam3){
        this.set(FIELD_WFVIEWPARAM3, wFViewParam3);
    }
    
    /**
     * 获取 流程视图参数3  
     * @return
     */
    @JsonIgnore
    public String getWFViewParam3(){
        Object objValue = this.get(FIELD_WFVIEWPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程视图参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParam3Dirty(){
        if(this.contains(FIELD_WFVIEWPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数3
     */
    @JsonIgnore
    public void resetWFViewParam3(){
        this.reset(FIELD_WFVIEWPARAM3);
    }

    /**
     * 设置 流程视图参数3，详细说明：{@link #FIELD_WFVIEWPARAM3}
     * <P>
     * 等同 {@link #setWFViewParam3}
     * @param wFViewParam3
     */
    @JsonIgnore
    public PSDEViewBaseDTO wfviewparam3(String wFViewParam3){
        this.setWFViewParam3(wFViewParam3);
        return this;
    }

    /**
     * <B>WFVIEWPARAM4</B>&nbsp;流程视图参数4，指定工作流视图参数4
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_WFVIEWPARAM4 = "wfviewparam4";

    /**
     * 设置 流程视图参数4，详细说明：{@link #FIELD_WFVIEWPARAM4}
     * 
     * @param wFViewParam4
     * 
     */
    @JsonProperty(FIELD_WFVIEWPARAM4)
    public void setWFViewParam4(String wFViewParam4){
        this.set(FIELD_WFVIEWPARAM4, wFViewParam4);
    }
    
    /**
     * 获取 流程视图参数4  
     * @return
     */
    @JsonIgnore
    public String getWFViewParam4(){
        Object objValue = this.get(FIELD_WFVIEWPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 流程视图参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isWFViewParam4Dirty(){
        if(this.contains(FIELD_WFVIEWPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 流程视图参数4
     */
    @JsonIgnore
    public void resetWFViewParam4(){
        this.reset(FIELD_WFVIEWPARAM4);
    }

    /**
     * 设置 流程视图参数4，详细说明：{@link #FIELD_WFVIEWPARAM4}
     * <P>
     * 等同 {@link #setWFViewParam4}
     * @param wFViewParam4
     */
    @JsonIgnore
    public PSDEViewBaseDTO wfviewparam4(String wFViewParam4){
        this.setWFViewParam4(wFViewParam4);
        return this;
    }

    /**
     * <B>WIDTH</B>&nbsp;宽度，指定视图的宽度，未定义时为【0】
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
    public PSDEViewBaseDTO width(Integer width){
        this.setWidth(width);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEViewBaseId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEViewBaseId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEViewBaseId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEViewBaseId(strValue);
    }

    @JsonIgnore
    public PSDEViewBaseDTO id(String strValue){
        this.setPSDEViewBaseId(strValue);
        return this;
    }


    /**
     *  实体视图部件 成员集合
     */
    public final static String FIELD_PSDEVIEWCTRLS = "psdeviewctrls";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO> psdeviewctrls;

    /**
     * 获取 实体视图部件 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO> getPSDEViewCtrls(){
        return this.psdeviewctrls;
    }

    /**
     * 设置 实体视图部件 成员集合  
     * @param psdeviewctrls
     */
    @JsonProperty(FIELD_PSDEVIEWCTRLS)
    public void setPSDEViewCtrls(java.util.List<net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO> psdeviewctrls){
        this.psdeviewctrls = psdeviewctrls;
    }

    /**
     * 获取 实体视图部件 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO> getPSDEViewCtrlsIf(){
        if(this.psdeviewctrls == null){
            this.psdeviewctrls = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO>();          
        }
        return this.psdeviewctrls;
    }


    /**
     *  实体视图界面引擎 成员集合
     */
    public final static String FIELD_PSDEVIEWENGINES = "psdeviewengines";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEViewEngineDTO> psdeviewengines;

    /**
     * 获取 实体视图界面引擎 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEVIEWENGINES)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewEngineDTO> getPSDEViewEngines(){
        return this.psdeviewengines;
    }

    /**
     * 设置 实体视图界面引擎 成员集合  
     * @param psdeviewengines
     */
    @JsonProperty(FIELD_PSDEVIEWENGINES)
    public void setPSDEViewEngines(java.util.List<net.ibizsys.centralstudio.dto.PSDEViewEngineDTO> psdeviewengines){
        this.psdeviewengines = psdeviewengines;
    }

    /**
     * 获取 实体视图界面引擎 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewEngineDTO> getPSDEViewEnginesIf(){
        if(this.psdeviewengines == null){
            this.psdeviewengines = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEViewEngineDTO>();          
        }
        return this.psdeviewengines;
    }


    /**
     *  实体视图逻辑 成员集合
     */
    public final static String FIELD_PSDEVIEWLOGICS = "psdeviewlogics";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEViewLogicDTO> psdeviewlogics;

    /**
     * 获取 实体视图逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewLogicDTO> getPSDEViewLogics(){
        return this.psdeviewlogics;
    }

    /**
     * 设置 实体视图逻辑 成员集合  
     * @param psdeviewlogics
     */
    @JsonProperty(FIELD_PSDEVIEWLOGICS)
    public void setPSDEViewLogics(java.util.List<net.ibizsys.centralstudio.dto.PSDEViewLogicDTO> psdeviewlogics){
        this.psdeviewlogics = psdeviewlogics;
    }

    /**
     * 获取 实体视图逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewLogicDTO> getPSDEViewLogicsIf(){
        if(this.psdeviewlogics == null){
            this.psdeviewlogics = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEViewLogicDTO>();          
        }
        return this.psdeviewlogics;
    }


    /**
     *  实体视图关联视图 成员集合
     */
    public final static String FIELD_PSDEVIEWRVS = "psdeviewrvs";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDEViewRVDTO> psdeviewrvs;

    /**
     * 获取 实体视图关联视图 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEVIEWRVS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewRVDTO> getPSDEViewRVs(){
        return this.psdeviewrvs;
    }

    /**
     * 设置 实体视图关联视图 成员集合  
     * @param psdeviewrvs
     */
    @JsonProperty(FIELD_PSDEVIEWRVS)
    public void setPSDEViewRVs(java.util.List<net.ibizsys.centralstudio.dto.PSDEViewRVDTO> psdeviewrvs){
        this.psdeviewrvs = psdeviewrvs;
    }

    /**
     * 获取 实体视图关联视图 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDEViewRVDTO> getPSDEViewRVsIf(){
        if(this.psdeviewrvs == null){
            this.psdeviewrvs = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDEViewRVDTO>();          
        }
        return this.psdeviewrvs;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEViewBaseDTO){
            PSDEViewBaseDTO dto = (PSDEViewBaseDTO)iEntity;
            dto.setPSDEViewCtrls(this.getPSDEViewCtrls());
            dto.setPSDEViewEngines(this.getPSDEViewEngines());
            dto.setPSDEViewLogics(this.getPSDEViewLogics());
            dto.setPSDEViewRVs(this.getPSDEViewRVs());
        }
        super.copyTo(iEntity);
    }
}
