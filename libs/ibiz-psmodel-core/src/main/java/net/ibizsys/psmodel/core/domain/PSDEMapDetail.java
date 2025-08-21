package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEMAPDETAIL</B>实体映射属性 模型传输对象
 * <P>
 * 实体功能映射的属性映射模型，定义当前实体与目标实体的属性关系，（1）将源属性或直接值映射到目标属性；（2）将目标属性或直接值映射回源属性
 */
public class PSDEMapDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEMapDetail(){
        this.setValidFlag(1);
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
    public PSDEMapDetail createdate(String createDate){
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
    public PSDEMapDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DSTFIELDNAME</B>&nbsp;目标属性，指定映射目标实体的属性名称
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DSTFIELDNAME = "dstfieldname";

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTFIELDNAME}
     * 
     * @param dstFieldName
     * 
     */
    @JsonProperty(FIELD_DSTFIELDNAME)
    public void setDstFieldName(String dstFieldName){
        this.set(FIELD_DSTFIELDNAME, dstFieldName);
    }
    
    /**
     * 获取 目标属性  
     * @return
     */
    @JsonIgnore
    public String getDstFieldName(){
        Object objValue = this.get(FIELD_DSTFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstFieldNameDirty(){
        if(this.contains(FIELD_DSTFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性
     */
    @JsonIgnore
    public void resetDstFieldName(){
        this.reset(FIELD_DSTFIELDNAME);
    }

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTFIELDNAME}
     * <P>
     * 等同 {@link #setDstFieldName}
     * @param dstFieldName
     */
    @JsonIgnore
    public PSDEMapDetail dstfieldname(String dstFieldName){
        this.setDstFieldName(dstFieldName);
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
    public PSDEMapDetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAPID}
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
    public PSDEMapDetail psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEMAPDETAILID</B>&nbsp;实体映射明细标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMAPDETAILID = "psdemapdetailid";

    /**
     * 设置 实体映射明细标识
     * 
     * @param pSDEMapDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEMAPDETAILID)
    public void setPSDEMapDetailId(String pSDEMapDetailId){
        this.set(FIELD_PSDEMAPDETAILID, pSDEMapDetailId);
    }
    
    /**
     * 获取 实体映射明细标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapDetailId(){
        Object objValue = this.get(FIELD_PSDEMAPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射明细标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapDetailIdDirty(){
        if(this.contains(FIELD_PSDEMAPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射明细标识
     */
    @JsonIgnore
    public void resetPSDEMapDetailId(){
        this.reset(FIELD_PSDEMAPDETAILID);
    }

    /**
     * 设置 实体映射明细标识
     * <P>
     * 等同 {@link #setPSDEMapDetailId}
     * @param pSDEMapDetailId
     */
    @JsonIgnore
    public PSDEMapDetail psdemapdetailid(String pSDEMapDetailId){
        this.setPSDEMapDetailId(pSDEMapDetailId);
        return this;
    }

    /**
     * <B>PSDEMAPDETAILNAME</B>&nbsp;映射操作，指定属性映射操作名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEMAPDETAILNAME = "psdemapdetailname";

    /**
     * 设置 映射操作，详细说明：{@link #FIELD_PSDEMAPDETAILNAME}
     * 
     * @param pSDEMapDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEMAPDETAILNAME)
    public void setPSDEMapDetailName(String pSDEMapDetailName){
        this.set(FIELD_PSDEMAPDETAILNAME, pSDEMapDetailName);
    }
    
    /**
     * 获取 映射操作  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapDetailName(){
        Object objValue = this.get(FIELD_PSDEMAPDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 映射操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapDetailNameDirty(){
        if(this.contains(FIELD_PSDEMAPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 映射操作
     */
    @JsonIgnore
    public void resetPSDEMapDetailName(){
        this.reset(FIELD_PSDEMAPDETAILNAME);
    }

    /**
     * 设置 映射操作，详细说明：{@link #FIELD_PSDEMAPDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEMapDetailName}
     * @param pSDEMapDetailName
     */
    @JsonIgnore
    public PSDEMapDetail psdemapdetailname(String pSDEMapDetailName){
        this.setPSDEMapDetailName(pSDEMapDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEMapDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEMapDetailName(strName);
    }

    @JsonIgnore
    public PSDEMapDetail name(String strName){
        this.setPSDEMapDetailName(strName);
        return this;
    }

    /**
     * <B>PSDEMAPID</B>&nbsp;实体映射，指定属性映射所在的实体映射
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEMap} 
     */
    public final static String FIELD_PSDEMAPID = "psdemapid";

    /**
     * 设置 实体映射，详细说明：{@link #FIELD_PSDEMAPID}
     * 
     * @param pSDEMapId
     * 
     */
    @JsonProperty(FIELD_PSDEMAPID)
    public void setPSDEMapId(String pSDEMapId){
        this.set(FIELD_PSDEMAPID, pSDEMapId);
    }
    
    /**
     * 获取 实体映射  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapId(){
        Object objValue = this.get(FIELD_PSDEMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapIdDirty(){
        if(this.contains(FIELD_PSDEMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射
     */
    @JsonIgnore
    public void resetPSDEMapId(){
        this.reset(FIELD_PSDEMAPID);
    }

    /**
     * 设置 实体映射，详细说明：{@link #FIELD_PSDEMAPID}
     * <P>
     * 等同 {@link #setPSDEMapId}
     * @param pSDEMapId
     */
    @JsonIgnore
    public PSDEMapDetail psdemapid(String pSDEMapId){
        this.setPSDEMapId(pSDEMapId);
        return this;
    }

    /**
     * 设置 实体映射，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMapId}
     * @param pSDEMap 引用对象
     */
    @JsonIgnore
    public PSDEMapDetail psdemapid(PSDEMap pSDEMap){
        if(pSDEMap == null){
            this.setPSDEId(null);
            this.setPSDEMapId(null);
            this.setPSDEMapName(null);
        }
        else{
            this.setPSDEId(pSDEMap.getPSDEId());
            this.setPSDEMapId(pSDEMap.getPSDEMapId());
            this.setPSDEMapName(pSDEMap.getPSDEMapName());
        }
        return this;
    }

    /**
     * <B>PSDEMAPNAME</B>&nbsp;实体映射，指定属性映射所在的实体映射
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAPID}
     */
    public final static String FIELD_PSDEMAPNAME = "psdemapname";

    /**
     * 设置 实体映射，详细说明：{@link #FIELD_PSDEMAPNAME}
     * 
     * @param pSDEMapName
     * 
     */
    @JsonProperty(FIELD_PSDEMAPNAME)
    public void setPSDEMapName(String pSDEMapName){
        this.set(FIELD_PSDEMAPNAME, pSDEMapName);
    }
    
    /**
     * 获取 实体映射  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapName(){
        Object objValue = this.get(FIELD_PSDEMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapNameDirty(){
        if(this.contains(FIELD_PSDEMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射
     */
    @JsonIgnore
    public void resetPSDEMapName(){
        this.reset(FIELD_PSDEMAPNAME);
    }

    /**
     * 设置 实体映射，详细说明：{@link #FIELD_PSDEMAPNAME}
     * <P>
     * 等同 {@link #setPSDEMapName}
     * @param pSDEMapName
     */
    @JsonIgnore
    public PSDEMapDetail psdemapname(String pSDEMapName){
        this.setPSDEMapName(pSDEMapName);
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORID</B>&nbsp;值转换器
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysTranslator} 
     */
    public final static String FIELD_PSSYSTRANSLATORID = "pssystranslatorid";

    /**
     * 设置 值转换器
     * 
     * @param pSSysTranslatorId
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORID)
    public void setPSSysTranslatorId(String pSSysTranslatorId){
        this.set(FIELD_PSSYSTRANSLATORID, pSSysTranslatorId);
    }
    
    /**
     * 获取 值转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorId(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorIdDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorId(){
        this.reset(FIELD_PSSYSTRANSLATORID);
    }

    /**
     * 设置 值转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslatorId
     */
    @JsonIgnore
    public PSDEMapDetail pssystranslatorid(String pSSysTranslatorId){
        this.setPSSysTranslatorId(pSSysTranslatorId);
        return this;
    }

    /**
     * 设置 值转换器，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysTranslatorId}
     * @param pSSysTranslator 引用对象
     */
    @JsonIgnore
    public PSDEMapDetail pssystranslatorid(PSSysTranslator pSSysTranslator){
        if(pSSysTranslator == null){
            this.setPSSysTranslatorId(null);
            this.setPSSysTranslatorName(null);
        }
        else{
            this.setPSSysTranslatorId(pSSysTranslator.getPSSysTranslatorId());
            this.setPSSysTranslatorName(pSSysTranslator.getPSSysTranslatorName());
        }
        return this;
    }

    /**
     * <B>PSSYSTRANSLATORNAME</B>&nbsp;值转换器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTRANSLATORID}
     */
    public final static String FIELD_PSSYSTRANSLATORNAME = "pssystranslatorname";

    /**
     * 设置 值转换器
     * 
     * @param pSSysTranslatorName
     * 
     */
    @JsonProperty(FIELD_PSSYSTRANSLATORNAME)
    public void setPSSysTranslatorName(String pSSysTranslatorName){
        this.set(FIELD_PSSYSTRANSLATORNAME, pSSysTranslatorName);
    }
    
    /**
     * 获取 值转换器  
     * @return
     */
    @JsonIgnore
    public String getPSSysTranslatorName(){
        Object objValue = this.get(FIELD_PSSYSTRANSLATORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值转换器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysTranslatorNameDirty(){
        if(this.contains(FIELD_PSSYSTRANSLATORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值转换器
     */
    @JsonIgnore
    public void resetPSSysTranslatorName(){
        this.reset(FIELD_PSSYSTRANSLATORNAME);
    }

    /**
     * 设置 值转换器
     * <P>
     * 等同 {@link #setPSSysTranslatorName}
     * @param pSSysTranslatorName
     */
    @JsonIgnore
    public PSDEMapDetail pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    /**
     * <B>SRCPSDEFID</B>&nbsp;源值属性，源类型为【属性】时指定源属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SRCPSDEFID = "srcpsdefid";

    /**
     * 设置 源值属性，详细说明：{@link #FIELD_SRCPSDEFID}
     * 
     * @param srcPSDEFId
     * 
     */
    @JsonProperty(FIELD_SRCPSDEFID)
    public void setSrcPSDEFId(String srcPSDEFId){
        this.set(FIELD_SRCPSDEFID, srcPSDEFId);
    }
    
    /**
     * 获取 源值属性  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDEFId(){
        Object objValue = this.get(FIELD_SRCPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源值属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDEFIdDirty(){
        if(this.contains(FIELD_SRCPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源值属性
     */
    @JsonIgnore
    public void resetSrcPSDEFId(){
        this.reset(FIELD_SRCPSDEFID);
    }

    /**
     * 设置 源值属性，详细说明：{@link #FIELD_SRCPSDEFID}
     * <P>
     * 等同 {@link #setSrcPSDEFId}
     * @param srcPSDEFId
     */
    @JsonIgnore
    public PSDEMapDetail srcpsdefid(String srcPSDEFId){
        this.setSrcPSDEFId(srcPSDEFId);
        return this;
    }

    /**
     * 设置 源值属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDEMapDetail srcpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setSrcPSDEFId(null);
            this.setSrcPSDEFName(null);
        }
        else{
            this.setSrcPSDEFId(pSDEField.getPSDEFieldId());
            this.setSrcPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>SRCPSDEFNAME</B>&nbsp;源属性，源类型为【属性】时指定源属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSDEFID}
     */
    public final static String FIELD_SRCPSDEFNAME = "srcpsdefname";

    /**
     * 设置 源属性，详细说明：{@link #FIELD_SRCPSDEFNAME}
     * 
     * @param srcPSDEFName
     * 
     */
    @JsonProperty(FIELD_SRCPSDEFNAME)
    public void setSrcPSDEFName(String srcPSDEFName){
        this.set(FIELD_SRCPSDEFNAME, srcPSDEFName);
    }
    
    /**
     * 获取 源属性  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDEFName(){
        Object objValue = this.get(FIELD_SRCPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDEFNameDirty(){
        if(this.contains(FIELD_SRCPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源属性
     */
    @JsonIgnore
    public void resetSrcPSDEFName(){
        this.reset(FIELD_SRCPSDEFNAME);
    }

    /**
     * 设置 源属性，详细说明：{@link #FIELD_SRCPSDEFNAME}
     * <P>
     * 等同 {@link #setSrcPSDEFName}
     * @param srcPSDEFName
     */
    @JsonIgnore
    public PSDEMapDetail srcpsdefname(String srcPSDEFName){
        this.setSrcPSDEFName(srcPSDEFName);
        return this;
    }

    /**
     * <B>SRCTYPE</B>&nbsp;映射类型，指定属性映射的源类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMapFieldSrcType} 
     */
    public final static String FIELD_SRCTYPE = "srctype";

    /**
     * 设置 映射类型，详细说明：{@link #FIELD_SRCTYPE}
     * 
     * @param srcType
     * 
     */
    @JsonProperty(FIELD_SRCTYPE)
    public void setSrcType(String srcType){
        this.set(FIELD_SRCTYPE, srcType);
    }
    
    /**
     * 获取 映射类型  
     * @return
     */
    @JsonIgnore
    public String getSrcType(){
        Object objValue = this.get(FIELD_SRCTYPE);
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
    public boolean isSrcTypeDirty(){
        if(this.contains(FIELD_SRCTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 映射类型
     */
    @JsonIgnore
    public void resetSrcType(){
        this.reset(FIELD_SRCTYPE);
    }

    /**
     * 设置 映射类型，详细说明：{@link #FIELD_SRCTYPE}
     * <P>
     * 等同 {@link #setSrcType}
     * @param srcType
     */
    @JsonIgnore
    public PSDEMapDetail srctype(String srcType){
        this.setSrcType(srcType);
        return this;
    }

     /**
     * 设置 映射类型，详细说明：{@link #FIELD_SRCTYPE}
     * <P>
     * 等同 {@link #setSrcType}
     * @param srcType
     */
    @JsonIgnore
    public PSDEMapDetail srctype(net.ibizsys.psmodel.core.util.PSModelEnums.DEMapFieldSrcType srcType){
        if(srcType == null){
            this.setSrcType(null);
        }
        else{
            this.setSrcType(srcType.value);
        }
        return this;
    }

    /**
     * <B>SRCVALUE</B>&nbsp;值或表达式，源类型为【直接值】时指定源值
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_SRCVALUE = "srcvalue";

    /**
     * 设置 值或表达式，详细说明：{@link #FIELD_SRCVALUE}
     * 
     * @param srcValue
     * 
     */
    @JsonProperty(FIELD_SRCVALUE)
    public void setSrcValue(String srcValue){
        this.set(FIELD_SRCVALUE, srcValue);
    }
    
    /**
     * 获取 值或表达式  
     * @return
     */
    @JsonIgnore
    public String getSrcValue(){
        Object objValue = this.get(FIELD_SRCVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值或表达式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcValueDirty(){
        if(this.contains(FIELD_SRCVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值或表达式
     */
    @JsonIgnore
    public void resetSrcValue(){
        this.reset(FIELD_SRCVALUE);
    }

    /**
     * 设置 值或表达式，详细说明：{@link #FIELD_SRCVALUE}
     * <P>
     * 等同 {@link #setSrcValue}
     * @param srcValue
     */
    @JsonIgnore
    public PSDEMapDetail srcvalue(String srcValue){
        this.setSrcValue(srcValue);
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
    public PSDEMapDetail updatedate(String updateDate){
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
    public PSDEMapDetail updateman(String updateMan){
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
    public PSDEMapDetail usercat(String userCat){
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
    public PSDEMapDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMapDetail usertag(String userTag){
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
    public PSDEMapDetail usertag2(String userTag2){
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
    public PSDEMapDetail usertag3(String userTag3){
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
    public PSDEMapDetail usertag4(String userTag4){
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
    public PSDEMapDetail validflag(Integer validFlag){
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
    public PSDEMapDetail validflag(Boolean validFlag){
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
        return this.getPSDEMapDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMapDetailId(strValue);
    }

    @JsonIgnore
    public PSDEMapDetail id(String strValue){
        this.setPSDEMapDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEMapDetail){
            PSDEMapDetail model = (PSDEMapDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
