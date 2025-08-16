package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSEAIDEFIELD</B>集成实体属性映射 模型传输对象
 * <P>
 * 
 */
public class PSSysEAIDEFieldDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysEAIDEFieldDTO(){
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
    public PSSysEAIDEFieldDTO codename(String codeName){
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
    public PSSysEAIDEFieldDTO createdate(Timestamp createDate){
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
    public PSSysEAIDEFieldDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>EAIDEFTAG</B>&nbsp;属性映射标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIDEFTAG = "eaideftag";

    /**
     * 设置 属性映射标记
     * 
     * @param eAIDEFTag
     * 
     */
    @JsonProperty(FIELD_EAIDEFTAG)
    public void setEAIDEFTag(String eAIDEFTag){
        this.set(FIELD_EAIDEFTAG, eAIDEFTag);
    }
    
    /**
     * 获取 属性映射标记  
     * @return
     */
    @JsonIgnore
    public String getEAIDEFTag(){
        Object objValue = this.get(FIELD_EAIDEFTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性映射标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDEFTagDirty(){
        if(this.contains(FIELD_EAIDEFTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性映射标记
     */
    @JsonIgnore
    public void resetEAIDEFTag(){
        this.reset(FIELD_EAIDEFTAG);
    }

    /**
     * 设置 属性映射标记
     * <P>
     * 等同 {@link #setEAIDEFTag}
     * @param eAIDEFTag
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO eaideftag(String eAIDEFTag){
        this.setEAIDEFTag(eAIDEFTag);
        return this;
    }

    /**
     * <B>EAIDEFTAG2</B>&nbsp;属性映射标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_EAIDEFTAG2 = "eaideftag2";

    /**
     * 设置 属性映射标记2
     * 
     * @param eAIDEFTag2
     * 
     */
    @JsonProperty(FIELD_EAIDEFTAG2)
    public void setEAIDEFTag2(String eAIDEFTag2){
        this.set(FIELD_EAIDEFTAG2, eAIDEFTag2);
    }
    
    /**
     * 获取 属性映射标记2  
     * @return
     */
    @JsonIgnore
    public String getEAIDEFTag2(){
        Object objValue = this.get(FIELD_EAIDEFTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性映射标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEAIDEFTag2Dirty(){
        if(this.contains(FIELD_EAIDEFTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性映射标记2
     */
    @JsonIgnore
    public void resetEAIDEFTag2(){
        this.reset(FIELD_EAIDEFTAG2);
    }

    /**
     * 设置 属性映射标记2
     * <P>
     * 等同 {@link #setEAIDEFTag2}
     * @param eAIDEFTag2
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO eaideftag2(String eAIDEFTag2){
        this.setEAIDEFTag2(eAIDEFTag2);
        return this;
    }

    /**
     * <B>MAPTYPE</B>&nbsp;映射类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.EAIDEFieldMapType} 
     */
    public final static String FIELD_MAPTYPE = "maptype";

    /**
     * 设置 映射类型
     * 
     * @param mapType
     * 
     */
    @JsonProperty(FIELD_MAPTYPE)
    public void setMapType(String mapType){
        this.set(FIELD_MAPTYPE, mapType);
    }
    
    /**
     * 获取 映射类型  
     * @return
     */
    @JsonIgnore
    public String getMapType(){
        Object objValue = this.get(FIELD_MAPTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 映射类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapTypeDirty(){
        if(this.contains(FIELD_MAPTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 映射类型
     */
    @JsonIgnore
    public void resetMapType(){
        this.reset(FIELD_MAPTYPE);
    }

    /**
     * 设置 映射类型
     * <P>
     * 等同 {@link #setMapType}
     * @param mapType
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO maptype(String mapType){
        this.setMapType(mapType);
        return this;
    }

     /**
     * 设置 映射类型
     * <P>
     * 等同 {@link #setMapType}
     * @param mapType
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO maptype(net.ibizsys.model.PSModelEnums.EAIDEFieldMapType mapType){
        if(mapType == null){
            this.setMapType(null);
        }
        else{
            this.setMapType(mapType.value);
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
    public PSSysEAIDEFieldDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO} 
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
    public PSSysEAIDEFieldDTO psdefid(String pSDEFId){
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
    public PSSysEAIDEFieldDTO psdefid(PSDEFieldDTO pSDEField){
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
    public PSSysEAIDEFieldDTO psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDEID}
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
    public PSSysEAIDEFieldDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSSYSEAIDEFIELDID</B>&nbsp;应用集成实体属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSEAIDEFIELDID = "pssyseaidefieldid";

    /**
     * 设置 应用集成实体属性标识
     * 
     * @param pSSysEAIDEFieldId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDEFIELDID)
    public void setPSSysEAIDEFieldId(String pSSysEAIDEFieldId){
        this.set(FIELD_PSSYSEAIDEFIELDID, pSSysEAIDEFieldId);
    }
    
    /**
     * 获取 应用集成实体属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEFieldId(){
        Object objValue = this.get(FIELD_PSSYSEAIDEFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用集成实体属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDEFieldIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDEFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用集成实体属性标识
     */
    @JsonIgnore
    public void resetPSSysEAIDEFieldId(){
        this.reset(FIELD_PSSYSEAIDEFIELDID);
    }

    /**
     * 设置 应用集成实体属性标识
     * <P>
     * 等同 {@link #setPSSysEAIDEFieldId}
     * @param pSSysEAIDEFieldId
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaidefieldid(String pSSysEAIDEFieldId){
        this.setPSSysEAIDEFieldId(pSSysEAIDEFieldId);
        return this;
    }

    /**
     * <B>PSSYSEAIDEFIELDNAME</B>&nbsp;属性映射名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSEAIDEFIELDNAME = "pssyseaidefieldname";

    /**
     * 设置 属性映射名称
     * 
     * @param pSSysEAIDEFieldName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDEFIELDNAME)
    public void setPSSysEAIDEFieldName(String pSSysEAIDEFieldName){
        this.set(FIELD_PSSYSEAIDEFIELDNAME, pSSysEAIDEFieldName);
    }
    
    /**
     * 获取 属性映射名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEFieldName(){
        Object objValue = this.get(FIELD_PSSYSEAIDEFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性映射名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDEFieldNameDirty(){
        if(this.contains(FIELD_PSSYSEAIDEFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性映射名称
     */
    @JsonIgnore
    public void resetPSSysEAIDEFieldName(){
        this.reset(FIELD_PSSYSEAIDEFIELDNAME);
    }

    /**
     * 设置 属性映射名称
     * <P>
     * 等同 {@link #setPSSysEAIDEFieldName}
     * @param pSSysEAIDEFieldName
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaidefieldname(String pSSysEAIDEFieldName){
        this.setPSSysEAIDEFieldName(pSSysEAIDEFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysEAIDEFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysEAIDEFieldName(strName);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO name(String strName){
        this.setPSSysEAIDEFieldName(strName);
        return this;
    }

    /**
     * <B>PSSYSEAIDEID</B>&nbsp;集成实体映射
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIDEDTO} 
     */
    public final static String FIELD_PSSYSEAIDEID = "pssyseaideid";

    /**
     * 设置 集成实体映射
     * 
     * @param pSSysEAIDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDEID)
    public void setPSSysEAIDEId(String pSSysEAIDEId){
        this.set(FIELD_PSSYSEAIDEID, pSSysEAIDEId);
    }
    
    /**
     * 获取 集成实体映射  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEId(){
        Object objValue = this.get(FIELD_PSSYSEAIDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成实体映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDEIdDirty(){
        if(this.contains(FIELD_PSSYSEAIDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成实体映射
     */
    @JsonIgnore
    public void resetPSSysEAIDEId(){
        this.reset(FIELD_PSSYSEAIDEID);
    }

    /**
     * 设置 集成实体映射
     * <P>
     * 等同 {@link #setPSSysEAIDEId}
     * @param pSSysEAIDEId
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaideid(String pSSysEAIDEId){
        this.setPSSysEAIDEId(pSSysEAIDEId);
        return this;
    }

    /**
     * 设置 集成实体映射，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIDEId}
     * @param pSSysEAIDE 引用对象
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaideid(PSSysEAIDEDTO pSSysEAIDE){
        if(pSSysEAIDE == null){
            this.setPSDEId(null);
            this.setPSSysEAIDEId(null);
            this.setPSSysEAIDEName(null);
            this.setPSSysEAIElementId(null);
        }
        else{
            this.setPSDEId(pSSysEAIDE.getPSDEId());
            this.setPSSysEAIDEId(pSSysEAIDE.getPSSysEAIDEId());
            this.setPSSysEAIDEName(pSSysEAIDE.getPSSysEAIDEName());
            this.setPSSysEAIElementId(pSSysEAIDE.getPSSysEAIElementId());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIDENAME</B>&nbsp;集成实体映射
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDEID}
     */
    public final static String FIELD_PSSYSEAIDENAME = "pssyseaidename";

    /**
     * 设置 集成实体映射
     * 
     * @param pSSysEAIDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIDENAME)
    public void setPSSysEAIDEName(String pSSysEAIDEName){
        this.set(FIELD_PSSYSEAIDENAME, pSSysEAIDEName);
    }
    
    /**
     * 获取 集成实体映射  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIDEName(){
        Object objValue = this.get(FIELD_PSSYSEAIDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成实体映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIDENameDirty(){
        if(this.contains(FIELD_PSSYSEAIDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成实体映射
     */
    @JsonIgnore
    public void resetPSSysEAIDEName(){
        this.reset(FIELD_PSSYSEAIDENAME);
    }

    /**
     * 设置 集成实体映射
     * <P>
     * 等同 {@link #setPSSysEAIDEName}
     * @param pSSysEAIDEName
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaidename(String pSSysEAIDEName){
        this.setPSSysEAIDEName(pSSysEAIDEName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTATTRID</B>&nbsp;集成元素属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIElementAttrDTO} 
     */
    public final static String FIELD_PSSYSEAIELEMENTATTRID = "pssyseaielementattrid";

    /**
     * 设置 集成元素属性
     * 
     * @param pSSysEAIElementAttrId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTATTRID)
    public void setPSSysEAIElementAttrId(String pSSysEAIElementAttrId){
        this.set(FIELD_PSSYSEAIELEMENTATTRID, pSSysEAIElementAttrId);
    }
    
    /**
     * 获取 集成元素属性  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementAttrId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTATTRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementAttrIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTATTRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素属性
     */
    @JsonIgnore
    public void resetPSSysEAIElementAttrId(){
        this.reset(FIELD_PSSYSEAIELEMENTATTRID);
    }

    /**
     * 设置 集成元素属性
     * <P>
     * 等同 {@link #setPSSysEAIElementAttrId}
     * @param pSSysEAIElementAttrId
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementattrid(String pSSysEAIElementAttrId){
        this.setPSSysEAIElementAttrId(pSSysEAIElementAttrId);
        return this;
    }

    /**
     * 设置 集成元素属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIElementAttrId}
     * @param pSSysEAIElementAttr 引用对象
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementattrid(PSSysEAIElementAttrDTO pSSysEAIElementAttr){
        if(pSSysEAIElementAttr == null){
            this.setPSSysEAIElementAttrId(null);
            this.setPSSysEAIElementAttrName(null);
        }
        else{
            this.setPSSysEAIElementAttrId(pSSysEAIElementAttr.getPSSysEAIElementAttrId());
            this.setPSSysEAIElementAttrName(pSSysEAIElementAttr.getPSSysEAIElementAttrName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTATTRNAME</B>&nbsp;集成元素属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTATTRID}
     */
    public final static String FIELD_PSSYSEAIELEMENTATTRNAME = "pssyseaielementattrname";

    /**
     * 设置 集成元素属性
     * 
     * @param pSSysEAIElementAttrName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTATTRNAME)
    public void setPSSysEAIElementAttrName(String pSSysEAIElementAttrName){
        this.set(FIELD_PSSYSEAIELEMENTATTRNAME, pSSysEAIElementAttrName);
    }
    
    /**
     * 获取 集成元素属性  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementAttrName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTATTRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementAttrNameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTATTRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素属性
     */
    @JsonIgnore
    public void resetPSSysEAIElementAttrName(){
        this.reset(FIELD_PSSYSEAIELEMENTATTRNAME);
    }

    /**
     * 设置 集成元素属性
     * <P>
     * 等同 {@link #setPSSysEAIElementAttrName}
     * @param pSSysEAIElementAttrName
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementattrname(String pSSysEAIElementAttrName){
        this.setPSSysEAIElementAttrName(pSSysEAIElementAttrName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;PSSYSEAIELEMENTID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIDEID}
     */
    public final static String FIELD_PSSYSEAIELEMENTID = "pssyseaielementid";

    /**
     * 设置 PSSYSEAIELEMENTID
     * 
     * @param pSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTID)
    public void setPSSysEAIElementId(String pSSysEAIElementId){
        this.set(FIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }
    
    /**
     * 获取 PSSYSEAIELEMENTID  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 PSSYSEAIELEMENTID 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 PSSYSEAIELEMENTID
     */
    @JsonIgnore
    public void resetPSSysEAIElementId(){
        this.reset(FIELD_PSSYSEAIELEMENTID);
    }

    /**
     * 设置 PSSYSEAIELEMENTID
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElementId
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementid(String pSSysEAIElementId){
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTREID</B>&nbsp;集成元素引用元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIElementREDTO} 
     */
    public final static String FIELD_PSSYSEAIELEMENTREID = "pssyseaielementreid";

    /**
     * 设置 集成元素引用元素
     * 
     * @param pSSysEAIElementREId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTREID)
    public void setPSSysEAIElementREId(String pSSysEAIElementREId){
        this.set(FIELD_PSSYSEAIELEMENTREID, pSSysEAIElementREId);
    }
    
    /**
     * 获取 集成元素引用元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementREId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTREID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素引用元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementREIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTREID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素引用元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementREId(){
        this.reset(FIELD_PSSYSEAIELEMENTREID);
    }

    /**
     * 设置 集成元素引用元素
     * <P>
     * 等同 {@link #setPSSysEAIElementREId}
     * @param pSSysEAIElementREId
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementreid(String pSSysEAIElementREId){
        this.setPSSysEAIElementREId(pSSysEAIElementREId);
        return this;
    }

    /**
     * 设置 集成元素引用元素，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIElementREId}
     * @param pSSysEAIElementRE 引用对象
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementreid(PSSysEAIElementREDTO pSSysEAIElementRE){
        if(pSSysEAIElementRE == null){
            this.setPSSysEAIElementREId(null);
            this.setPSSysEAIElementREName(null);
        }
        else{
            this.setPSSysEAIElementREId(pSSysEAIElementRE.getPSSysEAIElementREId());
            this.setPSSysEAIElementREName(pSSysEAIElementRE.getPSSysEAIElementREName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTRENAME</B>&nbsp;集成元素元素
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTREID}
     */
    public final static String FIELD_PSSYSEAIELEMENTRENAME = "pssyseaielementrename";

    /**
     * 设置 集成元素元素
     * 
     * @param pSSysEAIElementREName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTRENAME)
    public void setPSSysEAIElementREName(String pSSysEAIElementREName){
        this.set(FIELD_PSSYSEAIELEMENTRENAME, pSSysEAIElementREName);
    }
    
    /**
     * 获取 集成元素元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementREName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTRENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 集成元素元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementRENameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTRENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 集成元素元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementREName(){
        this.reset(FIELD_PSSYSEAIELEMENTRENAME);
    }

    /**
     * 设置 集成元素元素
     * <P>
     * 等同 {@link #setPSSysEAIElementREName}
     * @param pSSysEAIElementREName
     */
    @JsonIgnore
    public PSSysEAIDEFieldDTO pssyseaielementrename(String pSSysEAIElementREName){
        this.setPSSysEAIElementREName(pSSysEAIElementREName);
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
    public PSSysEAIDEFieldDTO updatedate(Timestamp updateDate){
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
    public PSSysEAIDEFieldDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERCAT</B>&nbsp;用户分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.ModelUserCat} 
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
    public PSSysEAIDEFieldDTO usercat(String userCat){
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
    public PSSysEAIDEFieldDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysEAIDEFieldDTO usertag(String userTag){
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
    public PSSysEAIDEFieldDTO usertag2(String userTag2){
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
    public PSSysEAIDEFieldDTO usertag3(String userTag3){
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
    public PSSysEAIDEFieldDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
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
    public PSSysEAIDEFieldDTO validflag(Integer validFlag){
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
    public PSSysEAIDEFieldDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysEAIDEFieldId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysEAIDEFieldId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysEAIDEFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysEAIDEFieldId(strValue);
    }

    @JsonIgnore
    public PSSysEAIDEFieldDTO id(String strValue){
        this.setPSSysEAIDEFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysEAIDEFieldDTO){
            PSSysEAIDEFieldDTO dto = (PSSysEAIDEFieldDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
