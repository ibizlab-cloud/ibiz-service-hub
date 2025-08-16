package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEDATARELATION</B>实体关系界面组 模型传输对象
 * <P>
 * 实体的关系界面组模型，包含一个或多个实体的关系界面。关系界面组体现了业务和技术表现的分离和统一，关系界面组可被视图部件直接使用，调整关系界面组成员将自动对关系界面进行调整。
 */
public class PSDEDataRelation extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDataRelation(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定关系界面组的代码标识，需要在所在的实体中具有唯一性
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEDataRelation codename(String codeName){
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
    public PSDEDataRelation createdate(String createDate){
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
    public PSDEDataRelation createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DRTAG</B>&nbsp;关系标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DRTAG = "drtag";

    /**
     * 设置 关系标记
     * 
     * @param dRTag
     * 
     */
    @JsonProperty(FIELD_DRTAG)
    public void setDRTag(String dRTag){
        this.set(FIELD_DRTAG, dRTag);
    }
    
    /**
     * 获取 关系标记  
     * @return
     */
    @JsonIgnore
    public String getDRTag(){
        Object objValue = this.get(FIELD_DRTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDRTagDirty(){
        if(this.contains(FIELD_DRTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记
     */
    @JsonIgnore
    public void resetDRTag(){
        this.reset(FIELD_DRTAG);
    }

    /**
     * 设置 关系标记
     * <P>
     * 等同 {@link #setDRTag}
     * @param dRTag
     */
    @JsonIgnore
    public PSDEDataRelation drtag(String dRTag){
        this.setDRTag(dRTag);
        return this;
    }

    /**
     * <B>DRTAG2</B>&nbsp;关系标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DRTAG2 = "drtag2";

    /**
     * 设置 关系标记2
     * 
     * @param dRTag2
     * 
     */
    @JsonProperty(FIELD_DRTAG2)
    public void setDRTag2(String dRTag2){
        this.set(FIELD_DRTAG2, dRTag2);
    }
    
    /**
     * 获取 关系标记2  
     * @return
     */
    @JsonIgnore
    public String getDRTag2(){
        Object objValue = this.get(FIELD_DRTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDRTag2Dirty(){
        if(this.contains(FIELD_DRTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记2
     */
    @JsonIgnore
    public void resetDRTag2(){
        this.reset(FIELD_DRTAG2);
    }

    /**
     * 设置 关系标记2
     * <P>
     * 等同 {@link #setDRTag2}
     * @param dRTag2
     */
    @JsonIgnore
    public PSDEDataRelation drtag2(String dRTag2){
        this.setDRTag2(dRTag2);
        return this;
    }

    /**
     * <B>DRTAG3</B>&nbsp;关系标记3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DRTAG3 = "drtag3";

    /**
     * 设置 关系标记3
     * 
     * @param dRTag3
     * 
     */
    @JsonProperty(FIELD_DRTAG3)
    public void setDRTag3(String dRTag3){
        this.set(FIELD_DRTAG3, dRTag3);
    }
    
    /**
     * 获取 关系标记3  
     * @return
     */
    @JsonIgnore
    public String getDRTag3(){
        Object objValue = this.get(FIELD_DRTAG3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDRTag3Dirty(){
        if(this.contains(FIELD_DRTAG3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记3
     */
    @JsonIgnore
    public void resetDRTag3(){
        this.reset(FIELD_DRTAG3);
    }

    /**
     * 设置 关系标记3
     * <P>
     * 等同 {@link #setDRTag3}
     * @param dRTag3
     */
    @JsonIgnore
    public PSDEDataRelation drtag3(String dRTag3){
        this.setDRTag3(dRTag3);
        return this;
    }

    /**
     * <B>DRTAG4</B>&nbsp;关系标记4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DRTAG4 = "drtag4";

    /**
     * 设置 关系标记4
     * 
     * @param dRTag4
     * 
     */
    @JsonProperty(FIELD_DRTAG4)
    public void setDRTag4(String dRTag4){
        this.set(FIELD_DRTAG4, dRTag4);
    }
    
    /**
     * 获取 关系标记4  
     * @return
     */
    @JsonIgnore
    public String getDRTag4(){
        Object objValue = this.get(FIELD_DRTAG4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系标记4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDRTag4Dirty(){
        if(this.contains(FIELD_DRTAG4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系标记4
     */
    @JsonIgnore
    public void resetDRTag4(){
        this.reset(FIELD_DRTAG4);
    }

    /**
     * 设置 关系标记4
     * <P>
     * 等同 {@link #setDRTag4}
     * @param dRTag4
     */
    @JsonIgnore
    public PSDEDataRelation drtag4(String dRTag4){
        this.setDRTag4(dRTag4);
        return this;
    }

    /**
     * <B>ENABLECUSTOMIZED</B>&nbsp;支持定制
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLECUSTOMIZED = "enablecustomized";

    /**
     * 设置 支持定制
     * 
     * @param enableCustomized
     * 
     */
    @JsonProperty(FIELD_ENABLECUSTOMIZED)
    public void setEnableCustomized(Integer enableCustomized){
        this.set(FIELD_ENABLECUSTOMIZED, enableCustomized);
    }
    
    /**
     * 获取 支持定制  
     * @return
     */
    @JsonIgnore
    public Integer getEnableCustomized(){
        Object objValue = this.get(FIELD_ENABLECUSTOMIZED);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 支持定制 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableCustomizedDirty(){
        if(this.contains(FIELD_ENABLECUSTOMIZED)){
            return true;
        }
        return false;
    }

    /**
     * 重置 支持定制
     */
    @JsonIgnore
    public void resetEnableCustomized(){
        this.reset(FIELD_ENABLECUSTOMIZED);
    }

    /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEDataRelation enablecustomized(Integer enableCustomized){
        this.setEnableCustomized(enableCustomized);
        return this;
    }

     /**
     * 设置 支持定制
     * <P>
     * 等同 {@link #setEnableCustomized}
     * @param enableCustomized
     */
    @JsonIgnore
    public PSDEDataRelation enablecustomized(Boolean enableCustomized){
        if(enableCustomized == null){
            this.setEnableCustomized(null);
        }
        else{
            this.setEnableCustomized(enableCustomized?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>FORMCAPPSLANRESID</B>&nbsp;编辑项标题语言资源，指定编辑项标题的多语言资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSLanguageRes} 
     */
    public final static String FIELD_FORMCAPPSLANRESID = "formcappslanresid";

    /**
     * 设置 编辑项标题语言资源，详细说明：{@link #FIELD_FORMCAPPSLANRESID}
     * 
     * @param formCapPSLanResId
     * 
     */
    @JsonProperty(FIELD_FORMCAPPSLANRESID)
    public void setFormCapPSLanResId(String formCapPSLanResId){
        this.set(FIELD_FORMCAPPSLANRESID, formCapPSLanResId);
    }
    
    /**
     * 获取 编辑项标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getFormCapPSLanResId(){
        Object objValue = this.get(FIELD_FORMCAPPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormCapPSLanResIdDirty(){
        if(this.contains(FIELD_FORMCAPPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项标题语言资源
     */
    @JsonIgnore
    public void resetFormCapPSLanResId(){
        this.reset(FIELD_FORMCAPPSLANRESID);
    }

    /**
     * 设置 编辑项标题语言资源，详细说明：{@link #FIELD_FORMCAPPSLANRESID}
     * <P>
     * 等同 {@link #setFormCapPSLanResId}
     * @param formCapPSLanResId
     */
    @JsonIgnore
    public PSDEDataRelation formcappslanresid(String formCapPSLanResId){
        this.setFormCapPSLanResId(formCapPSLanResId);
        return this;
    }

    /**
     * 设置 编辑项标题语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFormCapPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDEDataRelation formcappslanresid(PSLanguageRes pSLanguageRes){
        if(pSLanguageRes == null){
            this.setFormCapPSLanResId(null);
            this.setFormCapPSLanResName(null);
        }
        else{
            this.setFormCapPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setFormCapPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>FORMCAPPSLANRESNAME</B>&nbsp;编辑项标题语言资源，指定编辑项标题的多语言资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FORMCAPPSLANRESID}
     */
    public final static String FIELD_FORMCAPPSLANRESNAME = "formcappslanresname";

    /**
     * 设置 编辑项标题语言资源，详细说明：{@link #FIELD_FORMCAPPSLANRESNAME}
     * 
     * @param formCapPSLanResName
     * 
     */
    @JsonProperty(FIELD_FORMCAPPSLANRESNAME)
    public void setFormCapPSLanResName(String formCapPSLanResName){
        this.set(FIELD_FORMCAPPSLANRESNAME, formCapPSLanResName);
    }
    
    /**
     * 获取 编辑项标题语言资源  
     * @return
     */
    @JsonIgnore
    public String getFormCapPSLanResName(){
        Object objValue = this.get(FIELD_FORMCAPPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项标题语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormCapPSLanResNameDirty(){
        if(this.contains(FIELD_FORMCAPPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项标题语言资源
     */
    @JsonIgnore
    public void resetFormCapPSLanResName(){
        this.reset(FIELD_FORMCAPPSLANRESNAME);
    }

    /**
     * 设置 编辑项标题语言资源，详细说明：{@link #FIELD_FORMCAPPSLANRESNAME}
     * <P>
     * 等同 {@link #setFormCapPSLanResName}
     * @param formCapPSLanResName
     */
    @JsonIgnore
    public PSDEDataRelation formcappslanresname(String formCapPSLanResName){
        this.setFormCapPSLanResName(formCapPSLanResName);
        return this;
    }

    /**
     * <B>FORMCAPTION</B>&nbsp;编辑项标题，指定编辑项显示标题
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_FORMCAPTION = "formcaption";

    /**
     * 设置 编辑项标题，详细说明：{@link #FIELD_FORMCAPTION}
     * 
     * @param formCaption
     * 
     */
    @JsonProperty(FIELD_FORMCAPTION)
    public void setFormCaption(String formCaption){
        this.set(FIELD_FORMCAPTION, formCaption);
    }
    
    /**
     * 获取 编辑项标题  
     * @return
     */
    @JsonIgnore
    public String getFormCaption(){
        Object objValue = this.get(FIELD_FORMCAPTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项标题 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormCaptionDirty(){
        if(this.contains(FIELD_FORMCAPTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项标题
     */
    @JsonIgnore
    public void resetFormCaption(){
        this.reset(FIELD_FORMCAPTION);
    }

    /**
     * 设置 编辑项标题，详细说明：{@link #FIELD_FORMCAPTION}
     * <P>
     * 等同 {@link #setFormCaption}
     * @param formCaption
     */
    @JsonIgnore
    public PSDEDataRelation formcaption(String formCaption){
        this.setFormCaption(formCaption);
        return this;
    }

    /**
     * <B>FORMPSDEVIEWBASEID</B>&nbsp;编辑项视图，指定编辑项使用的实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_FORMPSDEVIEWBASEID = "formpsdeviewbaseid";

    /**
     * 设置 编辑项视图，详细说明：{@link #FIELD_FORMPSDEVIEWBASEID}
     * 
     * @param formPSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_FORMPSDEVIEWBASEID)
    public void setFormPSDEViewBaseId(String formPSDEViewBaseId){
        this.set(FIELD_FORMPSDEVIEWBASEID, formPSDEViewBaseId);
    }
    
    /**
     * 获取 编辑项视图  
     * @return
     */
    @JsonIgnore
    public String getFormPSDEViewBaseId(){
        Object objValue = this.get(FIELD_FORMPSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_FORMPSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项视图
     */
    @JsonIgnore
    public void resetFormPSDEViewBaseId(){
        this.reset(FIELD_FORMPSDEVIEWBASEID);
    }

    /**
     * 设置 编辑项视图，详细说明：{@link #FIELD_FORMPSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setFormPSDEViewBaseId}
     * @param formPSDEViewBaseId
     */
    @JsonIgnore
    public PSDEDataRelation formpsdeviewbaseid(String formPSDEViewBaseId){
        this.setFormPSDEViewBaseId(formPSDEViewBaseId);
        return this;
    }

    /**
     * 设置 编辑项视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFormPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDEDataRelation formpsdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setFormPSDEViewBaseId(null);
            this.setFormPSDEViewBaseName(null);
        }
        else{
            this.setFormPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setFormPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>FORMPSDEVIEWBASENAME</B>&nbsp;编辑项视图，指定编辑项使用的实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FORMPSDEVIEWBASEID}
     */
    public final static String FIELD_FORMPSDEVIEWBASENAME = "formpsdeviewbasename";

    /**
     * 设置 编辑项视图，详细说明：{@link #FIELD_FORMPSDEVIEWBASENAME}
     * 
     * @param formPSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_FORMPSDEVIEWBASENAME)
    public void setFormPSDEViewBaseName(String formPSDEViewBaseName){
        this.set(FIELD_FORMPSDEVIEWBASENAME, formPSDEViewBaseName);
    }
    
    /**
     * 获取 编辑项视图  
     * @return
     */
    @JsonIgnore
    public String getFormPSDEViewBaseName(){
        Object objValue = this.get(FIELD_FORMPSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_FORMPSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项视图
     */
    @JsonIgnore
    public void resetFormPSDEViewBaseName(){
        this.reset(FIELD_FORMPSDEVIEWBASENAME);
    }

    /**
     * 设置 编辑项视图，详细说明：{@link #FIELD_FORMPSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setFormPSDEViewBaseName}
     * @param formPSDEViewBaseName
     */
    @JsonIgnore
    public PSDEDataRelation formpsdeviewbasename(String formPSDEViewBaseName){
        this.setFormPSDEViewBaseName(formPSDEViewBaseName);
        return this;
    }

    /**
     * <B>FORMPSSYSIMAGEID</B>&nbsp;编辑项图片资源，指定编辑项图标使用的图片资源对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysImage} 
     */
    public final static String FIELD_FORMPSSYSIMAGEID = "formpssysimageid";

    /**
     * 设置 编辑项图片资源，详细说明：{@link #FIELD_FORMPSSYSIMAGEID}
     * 
     * @param formPSSysImageId
     * 
     */
    @JsonProperty(FIELD_FORMPSSYSIMAGEID)
    public void setFormPSSysImageId(String formPSSysImageId){
        this.set(FIELD_FORMPSSYSIMAGEID, formPSSysImageId);
    }
    
    /**
     * 获取 编辑项图片资源  
     * @return
     */
    @JsonIgnore
    public String getFormPSSysImageId(){
        Object objValue = this.get(FIELD_FORMPSSYSIMAGEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项图片资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormPSSysImageIdDirty(){
        if(this.contains(FIELD_FORMPSSYSIMAGEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项图片资源
     */
    @JsonIgnore
    public void resetFormPSSysImageId(){
        this.reset(FIELD_FORMPSSYSIMAGEID);
    }

    /**
     * 设置 编辑项图片资源，详细说明：{@link #FIELD_FORMPSSYSIMAGEID}
     * <P>
     * 等同 {@link #setFormPSSysImageId}
     * @param formPSSysImageId
     */
    @JsonIgnore
    public PSDEDataRelation formpssysimageid(String formPSSysImageId){
        this.setFormPSSysImageId(formPSSysImageId);
        return this;
    }

    /**
     * 设置 编辑项图片资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setFormPSSysImageId}
     * @param pSSysImage 引用对象
     */
    @JsonIgnore
    public PSDEDataRelation formpssysimageid(PSSysImage pSSysImage){
        if(pSSysImage == null){
            this.setFormPSSysImageId(null);
            this.setFormPSSysImageName(null);
        }
        else{
            this.setFormPSSysImageId(pSSysImage.getPSSysImageId());
            this.setFormPSSysImageName(pSSysImage.getPSSysImageName());
        }
        return this;
    }

    /**
     * <B>FORMPSSYSIMAGENAME</B>&nbsp;编辑项图片资源，指定编辑项图标使用的图片资源对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_FORMPSSYSIMAGEID}
     */
    public final static String FIELD_FORMPSSYSIMAGENAME = "formpssysimagename";

    /**
     * 设置 编辑项图片资源，详细说明：{@link #FIELD_FORMPSSYSIMAGENAME}
     * 
     * @param formPSSysImageName
     * 
     */
    @JsonProperty(FIELD_FORMPSSYSIMAGENAME)
    public void setFormPSSysImageName(String formPSSysImageName){
        this.set(FIELD_FORMPSSYSIMAGENAME, formPSSysImageName);
    }
    
    /**
     * 获取 编辑项图片资源  
     * @return
     */
    @JsonIgnore
    public String getFormPSSysImageName(){
        Object objValue = this.get(FIELD_FORMPSSYSIMAGENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 编辑项图片资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormPSSysImageNameDirty(){
        if(this.contains(FIELD_FORMPSSYSIMAGENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 编辑项图片资源
     */
    @JsonIgnore
    public void resetFormPSSysImageName(){
        this.reset(FIELD_FORMPSSYSIMAGENAME);
    }

    /**
     * 设置 编辑项图片资源，详细说明：{@link #FIELD_FORMPSSYSIMAGENAME}
     * <P>
     * 等同 {@link #setFormPSSysImageName}
     * @param formPSSysImageName
     */
    @JsonIgnore
    public PSDEDataRelation formpssysimagename(String formPSSysImageName){
        this.setFormPSSysImageName(formPSSysImageName);
        return this;
    }

    /**
     * <B>HIDEEDITITEM</B>&nbsp;不输出默认编辑项，指定关系界面组是否隐藏当前数据编辑项，此配置仅在【编辑视图（左右关系）】等带关系部件的视图中有效，此类视图需要判断是否输出编辑项。未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_HIDEEDITITEM = "hideedititem";

    /**
     * 设置 不输出默认编辑项，详细说明：{@link #FIELD_HIDEEDITITEM}
     * 
     * @param hideEditItem
     * 
     */
    @JsonProperty(FIELD_HIDEEDITITEM)
    public void setHideEditItem(Integer hideEditItem){
        this.set(FIELD_HIDEEDITITEM, hideEditItem);
    }
    
    /**
     * 获取 不输出默认编辑项  
     * @return
     */
    @JsonIgnore
    public Integer getHideEditItem(){
        Object objValue = this.get(FIELD_HIDEEDITITEM);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 不输出默认编辑项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isHideEditItemDirty(){
        if(this.contains(FIELD_HIDEEDITITEM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 不输出默认编辑项
     */
    @JsonIgnore
    public void resetHideEditItem(){
        this.reset(FIELD_HIDEEDITITEM);
    }

    /**
     * 设置 不输出默认编辑项，详细说明：{@link #FIELD_HIDEEDITITEM}
     * <P>
     * 等同 {@link #setHideEditItem}
     * @param hideEditItem
     */
    @JsonIgnore
    public PSDEDataRelation hideedititem(Integer hideEditItem){
        this.setHideEditItem(hideEditItem);
        return this;
    }

     /**
     * 设置 不输出默认编辑项，详细说明：{@link #FIELD_HIDEEDITITEM}
     * <P>
     * 等同 {@link #setHideEditItem}
     * @param hideEditItem
     */
    @JsonIgnore
    public PSDEDataRelation hideedititem(Boolean hideEditItem){
        if(hideEditItem == null){
            this.setHideEditItem(null);
        }
        else{
            this.setHideEditItem(hideEditItem?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDEDataRelation memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSCTRLLOGICGROUPID</B>&nbsp;界面逻辑组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSCtrlLogicGroup} 
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
    public PSDEDataRelation psctrllogicgroupid(String pSCtrlLogicGroupId){
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
    public PSDEDataRelation psctrllogicgroupid(PSCtrlLogicGroup pSCtrlLogicGroup){
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
    public PSDEDataRelation psctrllogicgroupname(String pSCtrlLogicGroupName){
        this.setPSCtrlLogicGroupName(pSCtrlLogicGroupName);
        return this;
    }

    /**
     * <B>PSDEDATARELATIONID</B>&nbsp;实体数据关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDATARELATIONID = "psdedatarelationid";

    /**
     * 设置 实体数据关系标识
     * 
     * @param pSDEDataRelationId
     * 
     */
    @JsonProperty(FIELD_PSDEDATARELATIONID)
    public void setPSDEDataRelationId(String pSDEDataRelationId){
        this.set(FIELD_PSDEDATARELATIONID, pSDEDataRelationId);
    }
    
    /**
     * 获取 实体数据关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataRelationId(){
        Object objValue = this.get(FIELD_PSDEDATARELATIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataRelationIdDirty(){
        if(this.contains(FIELD_PSDEDATARELATIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据关系标识
     */
    @JsonIgnore
    public void resetPSDEDataRelationId(){
        this.reset(FIELD_PSDEDATARELATIONID);
    }

    /**
     * 设置 实体数据关系标识
     * <P>
     * 等同 {@link #setPSDEDataRelationId}
     * @param pSDEDataRelationId
     */
    @JsonIgnore
    public PSDEDataRelation psdedatarelationid(String pSDEDataRelationId){
        this.setPSDEDataRelationId(pSDEDataRelationId);
        return this;
    }

    /**
     * <B>PSDEDATARELATIONNAME</B>&nbsp;关系界面组名称，指定关系界面组的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDATARELATIONNAME = "psdedatarelationname";

    /**
     * 设置 关系界面组名称，详细说明：{@link #FIELD_PSDEDATARELATIONNAME}
     * 
     * @param pSDEDataRelationName
     * 
     */
    @JsonProperty(FIELD_PSDEDATARELATIONNAME)
    public void setPSDEDataRelationName(String pSDEDataRelationName){
        this.set(FIELD_PSDEDATARELATIONNAME, pSDEDataRelationName);
    }
    
    /**
     * 获取 关系界面组名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataRelationName(){
        Object objValue = this.get(FIELD_PSDEDATARELATIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系界面组名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataRelationNameDirty(){
        if(this.contains(FIELD_PSDEDATARELATIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系界面组名称
     */
    @JsonIgnore
    public void resetPSDEDataRelationName(){
        this.reset(FIELD_PSDEDATARELATIONNAME);
    }

    /**
     * 设置 关系界面组名称，详细说明：{@link #FIELD_PSDEDATARELATIONNAME}
     * <P>
     * 等同 {@link #setPSDEDataRelationName}
     * @param pSDEDataRelationName
     */
    @JsonIgnore
    public PSDEDataRelation psdedatarelationname(String pSDEDataRelationName){
        this.setPSDEDataRelationName(pSDEDataRelationName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDataRelationName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDataRelationName(strName);
    }

    @JsonIgnore
    public PSDEDataRelation name(String strName){
        this.setPSDEDataRelationName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定关系界面组所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSDEDataRelation psdeid(String pSDEId){
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
    public PSDEDataRelation psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定关系界面组所在的实体对象
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
    public PSDEDataRelation psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSCOUNTERID</B>&nbsp;关系计数器，指定关系界面组默认使用的界面计数器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysCounter} 
     */
    public final static String FIELD_PSSYSCOUNTERID = "pssyscounterid";

    /**
     * 设置 关系计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * 
     * @param pSSysCounterId
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERID)
    public void setPSSysCounterId(String pSSysCounterId){
        this.set(FIELD_PSSYSCOUNTERID, pSSysCounterId);
    }
    
    /**
     * 获取 关系计数器  
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
     * 判断 关系计数器 是否指定值，包括空值
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
     * 重置 关系计数器
     */
    @JsonIgnore
    public void resetPSSysCounterId(){
        this.reset(FIELD_PSSYSCOUNTERID);
    }

    /**
     * 设置 关系计数器，详细说明：{@link #FIELD_PSSYSCOUNTERID}
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounterId
     */
    @JsonIgnore
    public PSDEDataRelation pssyscounterid(String pSSysCounterId){
        this.setPSSysCounterId(pSSysCounterId);
        return this;
    }

    /**
     * 设置 关系计数器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysCounterId}
     * @param pSSysCounter 引用对象
     */
    @JsonIgnore
    public PSDEDataRelation pssyscounterid(PSSysCounter pSSysCounter){
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
     * <B>PSSYSCOUNTERNAME</B>&nbsp;关系计数器，指定关系界面组默认使用的界面计数器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSCOUNTERID}
     */
    public final static String FIELD_PSSYSCOUNTERNAME = "pssyscountername";

    /**
     * 设置 关系计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * 
     * @param pSSysCounterName
     * 
     */
    @JsonProperty(FIELD_PSSYSCOUNTERNAME)
    public void setPSSysCounterName(String pSSysCounterName){
        this.set(FIELD_PSSYSCOUNTERNAME, pSSysCounterName);
    }
    
    /**
     * 获取 关系计数器  
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
     * 判断 关系计数器 是否指定值，包括空值
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
     * 重置 关系计数器
     */
    @JsonIgnore
    public void resetPSSysCounterName(){
        this.reset(FIELD_PSSYSCOUNTERNAME);
    }

    /**
     * 设置 关系计数器，详细说明：{@link #FIELD_PSSYSCOUNTERNAME}
     * <P>
     * 等同 {@link #setPSSysCounterName}
     * @param pSSysCounterName
     */
    @JsonIgnore
    public PSDEDataRelation pssyscountername(String pSSysCounterName){
        this.setPSSysCounterName(pSSysCounterName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;工作流实体标识
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSWFDE} 
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 工作流实体标识
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 工作流实体标识  
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
     * 判断 工作流实体标识 是否指定值，包括空值
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
     * 重置 工作流实体标识
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 工作流实体标识
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSDEDataRelation pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * 设置 工作流实体标识，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDE 引用对象
     */
    @JsonIgnore
    public PSDEDataRelation pswfdeid(PSWFDE pSWFDE){
        if(pSWFDE == null){
            this.setPSWFDEId(null);
        }
        else{
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
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
    public PSDEDataRelation updatedate(String updateDate){
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
    public PSDEDataRelation updateman(String updateMan){
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
    public PSDEDataRelation usercat(String userCat){
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
    public PSDEDataRelation usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDataRelation usertag(String userTag){
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
    public PSDEDataRelation usertag2(String userTag2){
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
    public PSDEDataRelation usertag3(String userTag3){
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
    public PSDEDataRelation usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDataRelationId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDataRelationId(strValue);
    }

    @JsonIgnore
    public PSDEDataRelation id(String strValue){
        this.setPSDEDataRelationId(strValue);
        return this;
    }


    /**
     *  实体界面组成员 成员集合
     */
    public final static String FIELD_PSDEDRDETAILS = "psdedrdetails";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEDRDetail> psdedrdetails;

    /**
     * 获取 实体界面组成员 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEDRDETAILS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDRDetail> getPSDEDRDetails(){
        return this.psdedrdetails;
    }

    /**
     * 设置 实体界面组成员 成员集合  
     * @param psdedrdetails
     */
    @JsonProperty(FIELD_PSDEDRDETAILS)
    public void setPSDEDRDetails(java.util.List<net.ibizsys.psmodel.core.domain.PSDEDRDetail> psdedrdetails){
        this.psdedrdetails = psdedrdetails;
    }

    /**
     * 获取 实体界面组成员 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEDRDetail> getPSDEDRDetailsIf(){
        if(this.psdedrdetails == null){
            this.psdedrdetails = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEDRDetail>();          
        }
        return this.psdedrdetails;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDataRelation){
            PSDEDataRelation model = (PSDEDataRelation)iPSModel;
            model.setPSDEDRDetails(this.getPSDEDRDetails());
        }
        super.copyTo(iPSModel);
    }
}
