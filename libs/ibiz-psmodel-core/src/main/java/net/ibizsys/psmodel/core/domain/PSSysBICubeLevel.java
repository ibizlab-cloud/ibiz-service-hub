package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBICUBELEVEL</B>智能立方体维度层级 模型传输对象
 * <P>
 * 智能报表系统中定义立方体维度具体层级的核心模型，用于将全局维度层级（如时间、地理）绑定到立方体的特定维度中，并配置数据来源、显示规则及聚合行为。它作为维度与立方体的桥梁，支撑多维数据的分层聚合、钻取及报表展示
 */
public class PSSysBICubeLevel extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBICubeLevel(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLLEVELFLAG</B>&nbsp;全部层级
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLLEVELFLAG = "alllevelflag";

    /**
     * 设置 全部层级
     * 
     * @param allLevelFlag
     * 
     */
    @JsonProperty(FIELD_ALLLEVELFLAG)
    public void setAllLevelFlag(Integer allLevelFlag){
        this.set(FIELD_ALLLEVELFLAG, allLevelFlag);
    }
    
    /**
     * 获取 全部层级  
     * @return
     */
    @JsonIgnore
    public Integer getAllLevelFlag(){
        Object objValue = this.get(FIELD_ALLLEVELFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部层级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllLevelFlagDirty(){
        if(this.contains(FIELD_ALLLEVELFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部层级
     */
    @JsonIgnore
    public void resetAllLevelFlag(){
        this.reset(FIELD_ALLLEVELFLAG);
    }

    /**
     * 设置 全部层级
     * <P>
     * 等同 {@link #setAllLevelFlag}
     * @param allLevelFlag
     */
    @JsonIgnore
    public PSSysBICubeLevel alllevelflag(Integer allLevelFlag){
        this.setAllLevelFlag(allLevelFlag);
        return this;
    }

     /**
     * 设置 全部层级
     * <P>
     * 等同 {@link #setAllLevelFlag}
     * @param allLevelFlag
     */
    @JsonIgnore
    public PSSysBICubeLevel alllevelflag(Boolean allLevelFlag){
        if(allLevelFlag == null){
            this.setAllLevelFlag(null);
        }
        else{
            this.setAllLevelFlag(allLevelFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>BICUBELEVELTAG</B>&nbsp;立方体维度层级标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBELEVELTAG = "bicubeleveltag";

    /**
     * 设置 立方体维度层级标记
     * 
     * @param bICubeLevelTag
     * 
     */
    @JsonProperty(FIELD_BICUBELEVELTAG)
    public void setBICubeLevelTag(String bICubeLevelTag){
        this.set(FIELD_BICUBELEVELTAG, bICubeLevelTag);
    }
    
    /**
     * 获取 立方体维度层级标记  
     * @return
     */
    @JsonIgnore
    public String getBICubeLevelTag(){
        Object objValue = this.get(FIELD_BICUBELEVELTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度层级标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeLevelTagDirty(){
        if(this.contains(FIELD_BICUBELEVELTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度层级标记
     */
    @JsonIgnore
    public void resetBICubeLevelTag(){
        this.reset(FIELD_BICUBELEVELTAG);
    }

    /**
     * 设置 立方体维度层级标记
     * <P>
     * 等同 {@link #setBICubeLevelTag}
     * @param bICubeLevelTag
     */
    @JsonIgnore
    public PSSysBICubeLevel bicubeleveltag(String bICubeLevelTag){
        this.setBICubeLevelTag(bICubeLevelTag);
        return this;
    }

    /**
     * <B>BICUBELEVELTAG2</B>&nbsp;立方体维度层级标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_BICUBELEVELTAG2 = "bicubeleveltag2";

    /**
     * 设置 立方体维度层级标记2
     * 
     * @param bICubeLevelTag2
     * 
     */
    @JsonProperty(FIELD_BICUBELEVELTAG2)
    public void setBICubeLevelTag2(String bICubeLevelTag2){
        this.set(FIELD_BICUBELEVELTAG2, bICubeLevelTag2);
    }
    
    /**
     * 获取 立方体维度层级标记2  
     * @return
     */
    @JsonIgnore
    public String getBICubeLevelTag2(){
        Object objValue = this.get(FIELD_BICUBELEVELTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度层级标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBICubeLevelTag2Dirty(){
        if(this.contains(FIELD_BICUBELEVELTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度层级标记2
     */
    @JsonIgnore
    public void resetBICubeLevelTag2(){
        this.reset(FIELD_BICUBELEVELTAG2);
    }

    /**
     * 设置 立方体维度层级标记2
     * <P>
     * 等同 {@link #setBICubeLevelTag2}
     * @param bICubeLevelTag2
     */
    @JsonIgnore
    public PSSysBICubeLevel bicubeleveltag2(String bICubeLevelTag2){
        this.setBICubeLevelTag2(bICubeLevelTag2);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码名称
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码名称
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码名称  
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
     * 判断 代码名称 是否指定值，包括空值
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
     * 重置 代码名称
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码名称
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysBICubeLevel codename(String codeName){
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
    public PSSysBICubeLevel createdate(String createDate){
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
    public PSSysBICubeLevel createman(String createMan){
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
    public PSSysBICubeLevel memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性
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
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSSysBICubeLevel psdefid(String pSDEFId){
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
    public PSSysBICubeLevel psdefid(PSDEField pSDEField){
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
     * <B>PSDEFNAME</B>&nbsp;实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性
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
     * 设置 实体属性
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSSysBICubeLevel psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEDIMENSIONID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysBICubeLevel psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSBICUBEDIMENSIONID</B>&nbsp;立方体维度
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBICubeDimension} 
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONID = "pssysbicubedimensionid";

    /**
     * 设置 立方体维度
     * 
     * @param pSSysBICubeDimensionId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONID)
    public void setPSSysBICubeDimensionId(String pSSysBICubeDimensionId){
        this.set(FIELD_PSSYSBICUBEDIMENSIONID, pSSysBICubeDimensionId);
    }
    
    /**
     * 获取 立方体维度  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeDimensionId(){
        Object objValue = this.get(FIELD_PSSYSBICUBEDIMENSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeDimensionIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBEDIMENSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度
     */
    @JsonIgnore
    public void resetPSSysBICubeDimensionId(){
        this.reset(FIELD_PSSYSBICUBEDIMENSIONID);
    }

    /**
     * 设置 立方体维度
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionId}
     * @param pSSysBICubeDimensionId
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbicubedimensionid(String pSSysBICubeDimensionId){
        this.setPSSysBICubeDimensionId(pSSysBICubeDimensionId);
        return this;
    }

    /**
     * 设置 立方体维度，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionId}
     * @param pSSysBICubeDimension 引用对象
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbicubedimensionid(PSSysBICubeDimension pSSysBICubeDimension){
        if(pSSysBICubeDimension == null){
            this.setPSDEId(null);
            this.setPSSysBICubeDimensionId(null);
            this.setPSSysBICubeDimensionName(null);
            this.setPSSysBIDimensionId(null);
        }
        else{
            this.setPSDEId(pSSysBICubeDimension.getPSDEId());
            this.setPSSysBICubeDimensionId(pSSysBICubeDimension.getPSSysBICubeDimensionId());
            this.setPSSysBICubeDimensionName(pSSysBICubeDimension.getPSSysBICubeDimensionName());
            this.setPSSysBIDimensionId(pSSysBICubeDimension.getPSSysBIDimensionId());
        }
        return this;
    }

    /**
     * <B>PSSYSBICUBEDIMENSIONNAME</B>&nbsp;立方体维度
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEDIMENSIONID}
     */
    public final static String FIELD_PSSYSBICUBEDIMENSIONNAME = "pssysbicubedimensionname";

    /**
     * 设置 立方体维度
     * 
     * @param pSSysBICubeDimensionName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBEDIMENSIONNAME)
    public void setPSSysBICubeDimensionName(String pSSysBICubeDimensionName){
        this.set(FIELD_PSSYSBICUBEDIMENSIONNAME, pSSysBICubeDimensionName);
    }
    
    /**
     * 获取 立方体维度  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeDimensionName(){
        Object objValue = this.get(FIELD_PSSYSBICUBEDIMENSIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeDimensionNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBEDIMENSIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度
     */
    @JsonIgnore
    public void resetPSSysBICubeDimensionName(){
        this.reset(FIELD_PSSYSBICUBEDIMENSIONNAME);
    }

    /**
     * 设置 立方体维度
     * <P>
     * 等同 {@link #setPSSysBICubeDimensionName}
     * @param pSSysBICubeDimensionName
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbicubedimensionname(String pSSysBICubeDimensionName){
        this.setPSSysBICubeDimensionName(pSSysBICubeDimensionName);
        return this;
    }

    /**
     * <B>PSSYSBICUBELEVELID</B>&nbsp;立方体维度层级标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBICUBELEVELID = "pssysbicubelevelid";

    /**
     * 设置 立方体维度层级标识
     * 
     * @param pSSysBICubeLevelId
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBELEVELID)
    public void setPSSysBICubeLevelId(String pSSysBICubeLevelId){
        this.set(FIELD_PSSYSBICUBELEVELID, pSSysBICubeLevelId);
    }
    
    /**
     * 获取 立方体维度层级标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeLevelId(){
        Object objValue = this.get(FIELD_PSSYSBICUBELEVELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度层级标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeLevelIdDirty(){
        if(this.contains(FIELD_PSSYSBICUBELEVELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度层级标识
     */
    @JsonIgnore
    public void resetPSSysBICubeLevelId(){
        this.reset(FIELD_PSSYSBICUBELEVELID);
    }

    /**
     * 设置 立方体维度层级标识
     * <P>
     * 等同 {@link #setPSSysBICubeLevelId}
     * @param pSSysBICubeLevelId
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbicubelevelid(String pSSysBICubeLevelId){
        this.setPSSysBICubeLevelId(pSSysBICubeLevelId);
        return this;
    }

    /**
     * <B>PSSYSBICUBELEVELNAME</B>&nbsp;立方体维度层级名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBICUBELEVELNAME = "pssysbicubelevelname";

    /**
     * 设置 立方体维度层级名称
     * 
     * @param pSSysBICubeLevelName
     * 
     */
    @JsonProperty(FIELD_PSSYSBICUBELEVELNAME)
    public void setPSSysBICubeLevelName(String pSSysBICubeLevelName){
        this.set(FIELD_PSSYSBICUBELEVELNAME, pSSysBICubeLevelName);
    }
    
    /**
     * 获取 立方体维度层级名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBICubeLevelName(){
        Object objValue = this.get(FIELD_PSSYSBICUBELEVELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 立方体维度层级名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBICubeLevelNameDirty(){
        if(this.contains(FIELD_PSSYSBICUBELEVELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 立方体维度层级名称
     */
    @JsonIgnore
    public void resetPSSysBICubeLevelName(){
        this.reset(FIELD_PSSYSBICUBELEVELNAME);
    }

    /**
     * 设置 立方体维度层级名称
     * <P>
     * 等同 {@link #setPSSysBICubeLevelName}
     * @param pSSysBICubeLevelName
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbicubelevelname(String pSSysBICubeLevelName){
        this.setPSSysBICubeLevelName(pSSysBICubeLevelName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBICubeLevelName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBICubeLevelName(strName);
    }

    @JsonIgnore
    public PSSysBICubeLevel name(String strName){
        this.setPSSysBICubeLevelName(strName);
        return this;
    }

    /**
     * <B>PSSYSBIDIMENSIONID</B>&nbsp;PSSYSBIDIMENSIONID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBICUBEDIMENSIONID}
     */
    public final static String FIELD_PSSYSBIDIMENSIONID = "pssysbidimensionid";

    /**
     * 设置 PSSYSBIDIMENSIONID
     * 
     * @param pSSysBIDimensionId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIDIMENSIONID)
    public void setPSSysBIDimensionId(String pSSysBIDimensionId){
        this.set(FIELD_PSSYSBIDIMENSIONID, pSSysBIDimensionId);
    }
    
    /**
     * 获取 PSSYSBIDIMENSIONID  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIDimensionId(){
        Object objValue = this.get(FIELD_PSSYSBIDIMENSIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSBIDIMENSIONID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIDimensionIdDirty(){
        if(this.contains(FIELD_PSSYSBIDIMENSIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSBIDIMENSIONID
     */
    @JsonIgnore
    public void resetPSSysBIDimensionId(){
        this.reset(FIELD_PSSYSBIDIMENSIONID);
    }

    /**
     * 设置 PSSYSBIDIMENSIONID
     * <P>
     * 等同 {@link #setPSSysBIDimensionId}
     * @param pSSysBIDimensionId
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbidimensionid(String pSSysBIDimensionId){
        this.setPSSysBIDimensionId(pSSysBIDimensionId);
        return this;
    }

    /**
     * <B>PSSYSBIHIERARCHYID</B>&nbsp;维度体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBIHierarchy} 
     */
    public final static String FIELD_PSSYSBIHIERARCHYID = "pssysbihierarchyid";

    /**
     * 设置 维度体系
     * 
     * @param pSSysBIHierarchyId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHYID)
    public void setPSSysBIHierarchyId(String pSSysBIHierarchyId){
        this.set(FIELD_PSSYSBIHIERARCHYID, pSSysBIHierarchyId);
    }
    
    /**
     * 获取 维度体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIHierarchyId(){
        Object objValue = this.get(FIELD_PSSYSBIHIERARCHYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIHierarchyIdDirty(){
        if(this.contains(FIELD_PSSYSBIHIERARCHYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度体系
     */
    @JsonIgnore
    public void resetPSSysBIHierarchyId(){
        this.reset(FIELD_PSSYSBIHIERARCHYID);
    }

    /**
     * 设置 维度体系
     * <P>
     * 等同 {@link #setPSSysBIHierarchyId}
     * @param pSSysBIHierarchyId
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbihierarchyid(String pSSysBIHierarchyId){
        this.setPSSysBIHierarchyId(pSSysBIHierarchyId);
        return this;
    }

    /**
     * 设置 维度体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBIHierarchyId}
     * @param pSSysBIHierarchy 引用对象
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbihierarchyid(PSSysBIHierarchy pSSysBIHierarchy){
        if(pSSysBIHierarchy == null){
            this.setPSSysBIHierarchyId(null);
            this.setPSSysBIHierarchyName(null);
        }
        else{
            this.setPSSysBIHierarchyId(pSSysBIHierarchy.getPSSysBIHierarchyId());
            this.setPSSysBIHierarchyName(pSSysBIHierarchy.getPSSysBIHierarchyName());
        }
        return this;
    }

    /**
     * <B>PSSYSBIHIERARCHYNAME</B>&nbsp;维度体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIHIERARCHYID}
     */
    public final static String FIELD_PSSYSBIHIERARCHYNAME = "pssysbihierarchyname";

    /**
     * 设置 维度体系
     * 
     * @param pSSysBIHierarchyName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIHIERARCHYNAME)
    public void setPSSysBIHierarchyName(String pSSysBIHierarchyName){
        this.set(FIELD_PSSYSBIHIERARCHYNAME, pSSysBIHierarchyName);
    }
    
    /**
     * 获取 维度体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIHierarchyName(){
        Object objValue = this.get(FIELD_PSSYSBIHIERARCHYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIHierarchyNameDirty(){
        if(this.contains(FIELD_PSSYSBIHIERARCHYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度体系
     */
    @JsonIgnore
    public void resetPSSysBIHierarchyName(){
        this.reset(FIELD_PSSYSBIHIERARCHYNAME);
    }

    /**
     * 设置 维度体系
     * <P>
     * 等同 {@link #setPSSysBIHierarchyName}
     * @param pSSysBIHierarchyName
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbihierarchyname(String pSSysBIHierarchyName){
        this.setPSSysBIHierarchyName(pSSysBIHierarchyName);
        return this;
    }

    /**
     * <B>PSSYSBILEVELID</B>&nbsp;维度层级
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBILevel} 
     */
    public final static String FIELD_PSSYSBILEVELID = "pssysbilevelid";

    /**
     * 设置 维度层级
     * 
     * @param pSSysBILevelId
     * 
     */
    @JsonProperty(FIELD_PSSYSBILEVELID)
    public void setPSSysBILevelId(String pSSysBILevelId){
        this.set(FIELD_PSSYSBILEVELID, pSSysBILevelId);
    }
    
    /**
     * 获取 维度层级  
     * @return
     */
    @JsonIgnore
    public String getPSSysBILevelId(){
        Object objValue = this.get(FIELD_PSSYSBILEVELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBILevelIdDirty(){
        if(this.contains(FIELD_PSSYSBILEVELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级
     */
    @JsonIgnore
    public void resetPSSysBILevelId(){
        this.reset(FIELD_PSSYSBILEVELID);
    }

    /**
     * 设置 维度层级
     * <P>
     * 等同 {@link #setPSSysBILevelId}
     * @param pSSysBILevelId
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbilevelid(String pSSysBILevelId){
        this.setPSSysBILevelId(pSSysBILevelId);
        return this;
    }

    /**
     * 设置 维度层级，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBILevelId}
     * @param pSSysBILevel 引用对象
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbilevelid(PSSysBILevel pSSysBILevel){
        if(pSSysBILevel == null){
            this.setPSSysBILevelId(null);
            this.setPSSysBILevelName(null);
        }
        else{
            this.setPSSysBILevelId(pSSysBILevel.getPSSysBILevelId());
            this.setPSSysBILevelName(pSSysBILevel.getPSSysBILevelName());
        }
        return this;
    }

    /**
     * <B>PSSYSBILEVELNAME</B>&nbsp;维度层级
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBILEVELID}
     */
    public final static String FIELD_PSSYSBILEVELNAME = "pssysbilevelname";

    /**
     * 设置 维度层级
     * 
     * @param pSSysBILevelName
     * 
     */
    @JsonProperty(FIELD_PSSYSBILEVELNAME)
    public void setPSSysBILevelName(String pSSysBILevelName){
        this.set(FIELD_PSSYSBILEVELNAME, pSSysBILevelName);
    }
    
    /**
     * 获取 维度层级  
     * @return
     */
    @JsonIgnore
    public String getPSSysBILevelName(){
        Object objValue = this.get(FIELD_PSSYSBILEVELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 维度层级 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBILevelNameDirty(){
        if(this.contains(FIELD_PSSYSBILEVELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 维度层级
     */
    @JsonIgnore
    public void resetPSSysBILevelName(){
        this.reset(FIELD_PSSYSBILEVELNAME);
    }

    /**
     * 设置 维度层级
     * <P>
     * 等同 {@link #setPSSysBILevelName}
     * @param pSSysBILevelName
     */
    @JsonIgnore
    public PSSysBICubeLevel pssysbilevelname(String pSSysBILevelName){
        this.setPSSysBILevelName(pSSysBILevelName);
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
    public PSSysBICubeLevel updatedate(String updateDate){
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
    public PSSysBICubeLevel updateman(String updateMan){
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
    public PSSysBICubeLevel usercat(String userCat){
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
    public PSSysBICubeLevel usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBICubeLevel usertag(String userTag){
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
    public PSSysBICubeLevel usertag2(String userTag2){
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
    public PSSysBICubeLevel usertag3(String userTag3){
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
    public PSSysBICubeLevel usertag4(String userTag4){
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
    public PSSysBICubeLevel validflag(Integer validFlag){
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
    public PSSysBICubeLevel validflag(Boolean validFlag){
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
        return this.getPSSysBICubeLevelId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBICubeLevelId(strValue);
    }

    @JsonIgnore
    public PSSysBICubeLevel id(String strValue){
        this.setPSSysBICubeLevelId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBICubeLevel){
            PSSysBICubeLevel model = (PSSysBICubeLevel)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
