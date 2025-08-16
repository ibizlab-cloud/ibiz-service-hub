package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDICTCAT</B>系统输入词条类别 模型传输对象
 * <P>
 * 输入词条类别模型，输入词条类别约定了一个输入场合，预置了常用的输入内容，允许用户对内容进行管理
 */
public class PSSysDictCatDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDictCatDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定词条类别的代码标识，需要在所在的模型域（系统模块或系统）中具有唯一性
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
    public PSSysDictCatDTO codename(String codeName){
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
    public PSSysDictCatDTO createdate(Timestamp createDate){
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
    public PSSysDictCatDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DICTCATTAG</B>&nbsp;词条类别标记，指定词条类别的标记值
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DICTCATTAG = "dictcattag";

    /**
     * 设置 词条类别标记，详细说明：{@link #FIELD_DICTCATTAG}
     * 
     * @param dictCatTag
     * 
     */
    @JsonProperty(FIELD_DICTCATTAG)
    public void setDictCatTag(String dictCatTag){
        this.set(FIELD_DICTCATTAG, dictCatTag);
    }
    
    /**
     * 获取 词条类别标记  
     * @return
     */
    @JsonIgnore
    public String getDictCatTag(){
        Object objValue = this.get(FIELD_DICTCATTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 词条类别标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDictCatTagDirty(){
        if(this.contains(FIELD_DICTCATTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 词条类别标记
     */
    @JsonIgnore
    public void resetDictCatTag(){
        this.reset(FIELD_DICTCATTAG);
    }

    /**
     * 设置 词条类别标记，详细说明：{@link #FIELD_DICTCATTAG}
     * <P>
     * 等同 {@link #setDictCatTag}
     * @param dictCatTag
     */
    @JsonIgnore
    public PSSysDictCatDTO dictcattag(String dictCatTag){
        this.setDictCatTag(dictCatTag);
        return this;
    }

    /**
     * <B>DICTCATTAG2</B>&nbsp;词条类别标记2，指定词条类别的标记值2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DICTCATTAG2 = "dictcattag2";

    /**
     * 设置 词条类别标记2，详细说明：{@link #FIELD_DICTCATTAG2}
     * 
     * @param dictCatTag2
     * 
     */
    @JsonProperty(FIELD_DICTCATTAG2)
    public void setDictCatTag2(String dictCatTag2){
        this.set(FIELD_DICTCATTAG2, dictCatTag2);
    }
    
    /**
     * 获取 词条类别标记2  
     * @return
     */
    @JsonIgnore
    public String getDictCatTag2(){
        Object objValue = this.get(FIELD_DICTCATTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 词条类别标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDictCatTag2Dirty(){
        if(this.contains(FIELD_DICTCATTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 词条类别标记2
     */
    @JsonIgnore
    public void resetDictCatTag2(){
        this.reset(FIELD_DICTCATTAG2);
    }

    /**
     * 设置 词条类别标记2，详细说明：{@link #FIELD_DICTCATTAG2}
     * <P>
     * 等同 {@link #setDictCatTag2}
     * @param dictCatTag2
     */
    @JsonIgnore
    public PSSysDictCatDTO dictcattag2(String dictCatTag2){
        this.setDictCatTag2(dictCatTag2);
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
    public PSSysDictCatDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;系统模块，指定系统输入词条类别所在的系统模块
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSModuleDTO} 
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
    public PSSysDictCatDTO psmoduleid(String pSModuleId){
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
    public PSSysDictCatDTO psmoduleid(PSModuleDTO pSModule){
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
     * <B>PSMODULENAME</B>&nbsp;系统模块，指定系统输入词条类别所在的系统模块
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
    public PSSysDictCatDTO psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSYSDICTCATID</B>&nbsp;系统输入词条类别标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDICTCATID = "pssysdictcatid";

    /**
     * 设置 系统输入词条类别标识
     * 
     * @param pSSysDictCatId
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATID)
    public void setPSSysDictCatId(String pSSysDictCatId){
        this.set(FIELD_PSSYSDICTCATID, pSSysDictCatId);
    }
    
    /**
     * 获取 系统输入词条类别标识  
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
     * 判断 系统输入词条类别标识 是否指定值，包括空值
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
     * 重置 系统输入词条类别标识
     */
    @JsonIgnore
    public void resetPSSysDictCatId(){
        this.reset(FIELD_PSSYSDICTCATID);
    }

    /**
     * 设置 系统输入词条类别标识
     * <P>
     * 等同 {@link #setPSSysDictCatId}
     * @param pSSysDictCatId
     */
    @JsonIgnore
    public PSSysDictCatDTO pssysdictcatid(String pSSysDictCatId){
        this.setPSSysDictCatId(pSSysDictCatId);
        return this;
    }

    /**
     * <B>PSSYSDICTCATNAME</B>&nbsp;词条类别名称，指定词条类别的名称，需要在所在的模型域（系统模块或系统）中具有唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDICTCATNAME = "pssysdictcatname";

    /**
     * 设置 词条类别名称，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * 
     * @param pSSysDictCatName
     * 
     */
    @JsonProperty(FIELD_PSSYSDICTCATNAME)
    public void setPSSysDictCatName(String pSSysDictCatName){
        this.set(FIELD_PSSYSDICTCATNAME, pSSysDictCatName);
    }
    
    /**
     * 获取 词条类别名称  
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
     * 判断 词条类别名称 是否指定值，包括空值
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
     * 重置 词条类别名称
     */
    @JsonIgnore
    public void resetPSSysDictCatName(){
        this.reset(FIELD_PSSYSDICTCATNAME);
    }

    /**
     * 设置 词条类别名称，详细说明：{@link #FIELD_PSSYSDICTCATNAME}
     * <P>
     * 等同 {@link #setPSSysDictCatName}
     * @param pSSysDictCatName
     */
    @JsonIgnore
    public PSSysDictCatDTO pssysdictcatname(String pSSysDictCatName){
        this.setPSSysDictCatName(pSSysDictCatName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDictCatName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDictCatName(strName);
    }

    @JsonIgnore
    public PSSysDictCatDTO name(String strName){
        this.setPSSysDictCatName(strName);
        return this;
    }

    /**
     * <B>PSSYSDYNAMODELID</B>&nbsp;系统动态模型，指定扩展词条分类定义的动态模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDynaModelDTO} 
     */
    public final static String FIELD_PSSYSDYNAMODELID = "pssysdynamodelid";

    /**
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELID}
     * 
     * @param pSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELID)
    public void setPSSysDynaModelId(String pSSysDynaModelId){
        this.set(FIELD_PSSYSDYNAMODELID, pSSysDynaModelId);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelId(){
        this.reset(FIELD_PSSYSDYNAMODELID);
    }

    /**
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELID}
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModelId
     */
    @JsonIgnore
    public PSSysDictCatDTO pssysdynamodelid(String pSSysDynaModelId){
        this.setPSSysDynaModelId(pSSysDynaModelId);
        return this;
    }

    /**
     * 设置 系统动态模型，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysDictCatDTO pssysdynamodelid(PSSysDynaModelDTO pSSysDynaModel){
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
     * <B>PSSYSDYNAMODELNAME</B>&nbsp;系统动态模型，指定扩展词条分类定义的动态模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDYNAMODELID}
     */
    public final static String FIELD_PSSYSDYNAMODELNAME = "pssysdynamodelname";

    /**
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * 
     * @param pSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_PSSYSDYNAMODELNAME)
    public void setPSSysDynaModelName(String pSSysDynaModelName){
        this.set(FIELD_PSSYSDYNAMODELNAME, pSSysDynaModelName);
    }
    
    /**
     * 获取 系统动态模型  
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
     * 判断 系统动态模型 是否指定值，包括空值
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
     * 重置 系统动态模型
     */
    @JsonIgnore
    public void resetPSSysDynaModelName(){
        this.reset(FIELD_PSSYSDYNAMODELNAME);
    }

    /**
     * 设置 系统动态模型，详细说明：{@link #FIELD_PSSYSDYNAMODELNAME}
     * <P>
     * 等同 {@link #setPSSysDynaModelName}
     * @param pSSysDynaModelName
     */
    @JsonIgnore
    public PSSysDictCatDTO pssysdynamodelname(String pSSysDynaModelName){
        this.setPSSysDynaModelName(pSSysDynaModelName);
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
    public PSSysDictCatDTO updatedate(Timestamp updateDate){
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
    public PSSysDictCatDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类，指定是否为用户自管理分类，未定义时为【是】。注意当前属性与模型预置的扩展属性同名（早期模型）
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERCAT = "usercat";

    /**
     * 设置 用户分类，详细说明：{@link #FIELD_USERCAT}
     * 
     * @param userCat
     * 
     */
    @JsonProperty(FIELD_USERCAT)
    public void setUserCat(Integer userCat){
        this.set(FIELD_USERCAT, userCat);
    }
    
    /**
     * 获取 用户分类  
     * @return
     */
    @JsonIgnore
    public Integer getUserCat(){
        Object objValue = this.get(FIELD_USERCAT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
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
     * 设置 用户分类，详细说明：{@link #FIELD_USERCAT}
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSSysDictCatDTO usercat(Integer userCat){
        this.setUserCat(userCat);
        return this;
    }

     /**
     * 设置 用户分类，详细说明：{@link #FIELD_USERCAT}
     * <P>
     * 等同 {@link #setUserCat}
     * @param userCat
     */
    @JsonIgnore
    public PSSysDictCatDTO usercat(Boolean userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysDictCatDTO usertag(String userTag){
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
    public PSSysDictCatDTO usertag2(String userTag2){
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
    public PSSysDictCatDTO usertag3(String userTag3){
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
    public PSSysDictCatDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysDictCatId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDictCatId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDictCatId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDictCatId(strValue);
    }

    @JsonIgnore
    public PSSysDictCatDTO id(String strValue){
        this.setPSSysDictCatId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDictCatDTO){
            PSSysDictCatDTO dto = (PSSysDictCatDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
