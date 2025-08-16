package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDERDEFMAP</B>实体关系属性映射 模型传输对象
 * <P>
 * 实体一对多关系的属性映射模型，将指定从实体的属性的值或计数聚合到主实体的相应属性
 */
public class PSDERDEFMap extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDERDEFMap(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体关系属性映射的代码名称，必须在所在的实体关系中具有唯一性
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
    public PSDERDEFMap codename(String codeName){
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
    public PSDERDEFMap createdate(String createDate){
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
    public PSDERDEFMap createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>FORMULAFORMAT</B>&nbsp;逻辑字段格式
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_FORMULAFORMAT = "formulaformat";

    /**
     * 设置 逻辑字段格式
     * 
     * @param formulaFormat
     * 
     */
    @JsonProperty(FIELD_FORMULAFORMAT)
    public void setFormulaFormat(String formulaFormat){
        this.set(FIELD_FORMULAFORMAT, formulaFormat);
    }
    
    /**
     * 获取 逻辑字段格式  
     * @return
     */
    @JsonIgnore
    public String getFormulaFormat(){
        Object objValue = this.get(FIELD_FORMULAFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑字段格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFormulaFormatDirty(){
        if(this.contains(FIELD_FORMULAFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑字段格式
     */
    @JsonIgnore
    public void resetFormulaFormat(){
        this.reset(FIELD_FORMULAFORMAT);
    }

    /**
     * 设置 逻辑字段格式
     * <P>
     * 等同 {@link #setFormulaFormat}
     * @param formulaFormat
     */
    @JsonIgnore
    public PSDERDEFMap formulaformat(String formulaFormat){
        this.setFormulaFormat(formulaFormat);
        return this;
    }

    /**
     * <B>MAJORPSDEFID</B>&nbsp;主实体属性，指定存储聚合值的主实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MAJORPSDEFID = "majorpsdefid";

    /**
     * 设置 主实体属性，详细说明：{@link #FIELD_MAJORPSDEFID}
     * 
     * @param majorPSDEFId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEFID)
    public void setMajorPSDEFId(String majorPSDEFId){
        this.set(FIELD_MAJORPSDEFID, majorPSDEFId);
    }
    
    /**
     * 获取 主实体属性  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEFId(){
        Object objValue = this.get(FIELD_MAJORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEFIdDirty(){
        if(this.contains(FIELD_MAJORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体属性
     */
    @JsonIgnore
    public void resetMajorPSDEFId(){
        this.reset(FIELD_MAJORPSDEFID);
    }

    /**
     * 设置 主实体属性，详细说明：{@link #FIELD_MAJORPSDEFID}
     * <P>
     * 等同 {@link #setMajorPSDEFId}
     * @param majorPSDEFId
     */
    @JsonIgnore
    public PSDERDEFMap majorpsdefid(String majorPSDEFId){
        this.setMajorPSDEFId(majorPSDEFId);
        return this;
    }

    /**
     * 设置 主实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDERDEFMap majorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMajorPSDEFId(null);
            this.setMajorPSDEFName(null);
        }
        else{
            this.setMajorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMajorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MAJORPSDEFNAME</B>&nbsp;主实体属性，指定存储聚合值的主实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEFID}
     */
    public final static String FIELD_MAJORPSDEFNAME = "majorpsdefname";

    /**
     * 设置 主实体属性，详细说明：{@link #FIELD_MAJORPSDEFNAME}
     * 
     * @param majorPSDEFName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEFNAME)
    public void setMajorPSDEFName(String majorPSDEFName){
        this.set(FIELD_MAJORPSDEFNAME, majorPSDEFName);
    }
    
    /**
     * 获取 主实体属性  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEFName(){
        Object objValue = this.get(FIELD_MAJORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEFNameDirty(){
        if(this.contains(FIELD_MAJORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体属性
     */
    @JsonIgnore
    public void resetMajorPSDEFName(){
        this.reset(FIELD_MAJORPSDEFNAME);
    }

    /**
     * 设置 主实体属性，详细说明：{@link #FIELD_MAJORPSDEFNAME}
     * <P>
     * 等同 {@link #setMajorPSDEFName}
     * @param majorPSDEFName
     */
    @JsonIgnore
    public PSDERDEFMap majorpsdefname(String majorPSDEFName){
        this.setMajorPSDEFName(majorPSDEFName);
        return this;
    }

    /**
     * <B>MAJORPSDEID</B>&nbsp;主实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_MAJORPSDEID = "majorpsdeid";

    /**
     * 设置 主实体标识
     * 
     * @param majorPSDEId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEID)
    public void setMajorPSDEId(String majorPSDEId){
        this.set(FIELD_MAJORPSDEID, majorPSDEId);
    }
    
    /**
     * 获取 主实体标识  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEId(){
        Object objValue = this.get(FIELD_MAJORPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEIdDirty(){
        if(this.contains(FIELD_MAJORPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体标识
     */
    @JsonIgnore
    public void resetMajorPSDEId(){
        this.reset(FIELD_MAJORPSDEID);
    }

    /**
     * 设置 主实体标识
     * <P>
     * 等同 {@link #setMajorPSDEId}
     * @param majorPSDEId
     */
    @JsonIgnore
    public PSDERDEFMap majorpsdeid(String majorPSDEId){
        this.setMajorPSDEId(majorPSDEId);
        return this;
    }

    /**
     * <B>MAPTYPE</B>&nbsp;映射类型，指定关系属性的映射类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DER1NDEFMapType} 
     */
    public final static String FIELD_MAPTYPE = "maptype";

    /**
     * 设置 映射类型，详细说明：{@link #FIELD_MAPTYPE}
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
     * 设置 映射类型，详细说明：{@link #FIELD_MAPTYPE}
     * <P>
     * 等同 {@link #setMapType}
     * @param mapType
     */
    @JsonIgnore
    public PSDERDEFMap maptype(String mapType){
        this.setMapType(mapType);
        return this;
    }

     /**
     * 设置 映射类型，详细说明：{@link #FIELD_MAPTYPE}
     * <P>
     * 等同 {@link #setMapType}
     * @param mapType
     */
    @JsonIgnore
    public PSDERDEFMap maptype(net.ibizsys.psmodel.core.util.PSModelEnums.DER1NDEFMapType mapType){
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
    public PSDERDEFMap memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORPSDEFID</B>&nbsp;从实体属性，指定进行聚合操作的从实体属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_MINORPSDEFID = "minorpsdefid";

    /**
     * 设置 从实体属性，详细说明：{@link #FIELD_MINORPSDEFID}
     * 
     * @param minorPSDEFId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEFID)
    public void setMinorPSDEFId(String minorPSDEFId){
        this.set(FIELD_MINORPSDEFID, minorPSDEFId);
    }
    
    /**
     * 获取 从实体属性  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEFId(){
        Object objValue = this.get(FIELD_MINORPSDEFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEFIdDirty(){
        if(this.contains(FIELD_MINORPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体属性
     */
    @JsonIgnore
    public void resetMinorPSDEFId(){
        this.reset(FIELD_MINORPSDEFID);
    }

    /**
     * 设置 从实体属性，详细说明：{@link #FIELD_MINORPSDEFID}
     * <P>
     * 等同 {@link #setMinorPSDEFId}
     * @param minorPSDEFId
     */
    @JsonIgnore
    public PSDERDEFMap minorpsdefid(String minorPSDEFId){
        this.setMinorPSDEFId(minorPSDEFId);
        return this;
    }

    /**
     * 设置 从实体属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDERDEFMap minorpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setMinorPSDEFId(null);
            this.setMinorPSDEFName(null);
        }
        else{
            this.setMinorPSDEFId(pSDEField.getPSDEFieldId());
            this.setMinorPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>MINORPSDEFNAME</B>&nbsp;从实体属性，指定进行聚合操作的从实体属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEFID}
     */
    public final static String FIELD_MINORPSDEFNAME = "minorpsdefname";

    /**
     * 设置 从实体属性，详细说明：{@link #FIELD_MINORPSDEFNAME}
     * 
     * @param minorPSDEFName
     * 
     */
    @JsonProperty(FIELD_MINORPSDEFNAME)
    public void setMinorPSDEFName(String minorPSDEFName){
        this.set(FIELD_MINORPSDEFNAME, minorPSDEFName);
    }
    
    /**
     * 获取 从实体属性  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEFName(){
        Object objValue = this.get(FIELD_MINORPSDEFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEFNameDirty(){
        if(this.contains(FIELD_MINORPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体属性
     */
    @JsonIgnore
    public void resetMinorPSDEFName(){
        this.reset(FIELD_MINORPSDEFNAME);
    }

    /**
     * 设置 从实体属性，详细说明：{@link #FIELD_MINORPSDEFNAME}
     * <P>
     * 等同 {@link #setMinorPSDEFName}
     * @param minorPSDEFName
     */
    @JsonIgnore
    public PSDERDEFMap minorpsdefname(String minorPSDEFName){
        this.setMinorPSDEFName(minorPSDEFName);
        return this;
    }

    /**
     * <B>MINORPSDEID</B>&nbsp;从实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_MINORPSDEID = "minorpsdeid";

    /**
     * 设置 从实体标识
     * 
     * @param minorPSDEId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEID)
    public void setMinorPSDEId(String minorPSDEId){
        this.set(FIELD_MINORPSDEID, minorPSDEId);
    }
    
    /**
     * 获取 从实体标识  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEId(){
        Object objValue = this.get(FIELD_MINORPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEIdDirty(){
        if(this.contains(FIELD_MINORPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体标识
     */
    @JsonIgnore
    public void resetMinorPSDEId(){
        this.reset(FIELD_MINORPSDEID);
    }

    /**
     * 设置 从实体标识
     * <P>
     * 等同 {@link #setMinorPSDEId}
     * @param minorPSDEId
     */
    @JsonIgnore
    public PSDERDEFMap minorpsdeid(String minorPSDEId){
        this.setMinorPSDEId(minorPSDEId);
        return this;
    }

    /**
     * <B>PSDEDQID</B>&nbsp;从实体数据查询，额外指定从实体的数据查询对象，对从实体进行条件过滤
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataQuery} 
     */
    public final static String FIELD_PSDEDQID = "psdedqid";

    /**
     * 设置 从实体数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * 
     * @param pSDEDQId
     * 
     */
    @JsonProperty(FIELD_PSDEDQID)
    public void setPSDEDQId(String pSDEDQId){
        this.set(FIELD_PSDEDQID, pSDEDQId);
    }
    
    /**
     * 获取 从实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQId(){
        Object objValue = this.get(FIELD_PSDEDQID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQIdDirty(){
        if(this.contains(FIELD_PSDEDQID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQId(){
        this.reset(FIELD_PSDEDQID);
    }

    /**
     * 设置 从实体数据查询，详细说明：{@link #FIELD_PSDEDQID}
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDQId
     */
    @JsonIgnore
    public PSDERDEFMap psdedqid(String pSDEDQId){
        this.setPSDEDQId(pSDEDQId);
        return this;
    }

    /**
     * 设置 从实体数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDQId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDERDEFMap psdedqid(PSDEDataQuery pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setPSDEDQId(null);
            this.setPSDEDQName(null);
        }
        else{
            this.setPSDEDQId(pSDEDataQuery.getPSDEDataQueryId());
            this.setPSDEDQName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>PSDEDQNAME</B>&nbsp;从实体数据查询，额外指定从实体的数据查询对象，对从实体进行条件过滤
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDQID}
     */
    public final static String FIELD_PSDEDQNAME = "psdedqname";

    /**
     * 设置 从实体数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * 
     * @param pSDEDQName
     * 
     */
    @JsonProperty(FIELD_PSDEDQNAME)
    public void setPSDEDQName(String pSDEDQName){
        this.set(FIELD_PSDEDQNAME, pSDEDQName);
    }
    
    /**
     * 获取 从实体数据查询  
     * @return
     */
    @JsonIgnore
    public String getPSDEDQName(){
        Object objValue = this.get(FIELD_PSDEDQNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDQNameDirty(){
        if(this.contains(FIELD_PSDEDQNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体数据查询
     */
    @JsonIgnore
    public void resetPSDEDQName(){
        this.reset(FIELD_PSDEDQNAME);
    }

    /**
     * 设置 从实体数据查询，详细说明：{@link #FIELD_PSDEDQNAME}
     * <P>
     * 等同 {@link #setPSDEDQName}
     * @param pSDEDQName
     */
    @JsonIgnore
    public PSDERDEFMap psdedqname(String pSDEDQName){
        this.setPSDEDQName(pSDEDQName);
        return this;
    }

    /**
     * <B>PSDERDEFMAPID</B>&nbsp;实体关系属性映射标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDERDEFMAPID = "psderdefmapid";

    /**
     * 设置 实体关系属性映射标识
     * 
     * @param pSDERDEFMapId
     * 
     */
    @JsonProperty(FIELD_PSDERDEFMAPID)
    public void setPSDERDEFMapId(String pSDERDEFMapId){
        this.set(FIELD_PSDERDEFMAPID, pSDERDEFMapId);
    }
    
    /**
     * 获取 实体关系属性映射标识  
     * @return
     */
    @JsonIgnore
    public String getPSDERDEFMapId(){
        Object objValue = this.get(FIELD_PSDERDEFMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系属性映射标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERDEFMapIdDirty(){
        if(this.contains(FIELD_PSDERDEFMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系属性映射标识
     */
    @JsonIgnore
    public void resetPSDERDEFMapId(){
        this.reset(FIELD_PSDERDEFMAPID);
    }

    /**
     * 设置 实体关系属性映射标识
     * <P>
     * 等同 {@link #setPSDERDEFMapId}
     * @param pSDERDEFMapId
     */
    @JsonIgnore
    public PSDERDEFMap psderdefmapid(String pSDERDEFMapId){
        this.setPSDERDEFMapId(pSDERDEFMapId);
        return this;
    }

    /**
     * <B>PSDERDEFMAPNAME</B>&nbsp;映射名称，指定实体关系属性映射的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDERDEFMAPNAME = "psderdefmapname";

    /**
     * 设置 映射名称，详细说明：{@link #FIELD_PSDERDEFMAPNAME}
     * 
     * @param pSDERDEFMapName
     * 
     */
    @JsonProperty(FIELD_PSDERDEFMAPNAME)
    public void setPSDERDEFMapName(String pSDERDEFMapName){
        this.set(FIELD_PSDERDEFMAPNAME, pSDERDEFMapName);
    }
    
    /**
     * 获取 映射名称  
     * @return
     */
    @JsonIgnore
    public String getPSDERDEFMapName(){
        Object objValue = this.get(FIELD_PSDERDEFMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 映射名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERDEFMapNameDirty(){
        if(this.contains(FIELD_PSDERDEFMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 映射名称
     */
    @JsonIgnore
    public void resetPSDERDEFMapName(){
        this.reset(FIELD_PSDERDEFMAPNAME);
    }

    /**
     * 设置 映射名称，详细说明：{@link #FIELD_PSDERDEFMAPNAME}
     * <P>
     * 等同 {@link #setPSDERDEFMapName}
     * @param pSDERDEFMapName
     */
    @JsonIgnore
    public PSDERDEFMap psderdefmapname(String pSDERDEFMapName){
        this.setPSDERDEFMapName(pSDERDEFMapName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDERDEFMapName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDERDEFMapName(strName);
    }

    @JsonIgnore
    public PSDERDEFMap name(String strName){
        this.setPSDERDEFMapName(strName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定属性映射所在的关系对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
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
     * 判断 实体关系 是否指定值，包括空值
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
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDERDEFMap psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDERDEFMap psderid(PSDER pSDER){
        if(pSDER == null){
            this.setMajorPSDEId(null);
            this.setMinorPSDEId(null);
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setMajorPSDEId(pSDER.getMajorPSDEId());
            this.setMinorPSDEId(pSDER.getMinorPSDEId());
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定属性映射所在的关系对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
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
     * 判断 实体关系 是否指定值，包括空值
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
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDERDEFMap psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定关系属性映射使用的后台模板扩展插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDERDEFMap pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后台扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDERDEFMap pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定关系属性映射使用的后台模板扩展插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后台扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台扩展插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后台扩展插件，详细说明：{@link #FIELD_PSSYSSFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDERDEFMap pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>SRCVALUE</B>&nbsp;源值
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_SRCVALUE = "srcvalue";

    /**
     * 设置 源值
     * 
     * @param srcValue
     * 
     */
    @JsonProperty(FIELD_SRCVALUE)
    public void setSrcValue(String srcValue){
        this.set(FIELD_SRCVALUE, srcValue);
    }
    
    /**
     * 获取 源值  
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
     * 判断 源值 是否指定值，包括空值
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
     * 重置 源值
     */
    @JsonIgnore
    public void resetSrcValue(){
        this.reset(FIELD_SRCVALUE);
    }

    /**
     * 设置 源值
     * <P>
     * 等同 {@link #setSrcValue}
     * @param srcValue
     */
    @JsonIgnore
    public PSDERDEFMap srcvalue(String srcValue){
        this.setSrcValue(srcValue);
        return this;
    }

    /**
     * <B>SRCVALUESTDDATATYPE</B>&nbsp;源值标准数据类型
     */
    public final static String FIELD_SRCVALUESTDDATATYPE = "srcvaluestddatatype";

    /**
     * 设置 源值标准数据类型
     * 
     * @param srcValueStdDataType
     * 
     */
    @JsonProperty(FIELD_SRCVALUESTDDATATYPE)
    public void setSrcValueStdDataType(Integer srcValueStdDataType){
        this.set(FIELD_SRCVALUESTDDATATYPE, srcValueStdDataType);
    }
    
    /**
     * 获取 源值标准数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getSrcValueStdDataType(){
        Object objValue = this.get(FIELD_SRCVALUESTDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 源值标准数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcValueStdDataTypeDirty(){
        if(this.contains(FIELD_SRCVALUESTDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源值标准数据类型
     */
    @JsonIgnore
    public void resetSrcValueStdDataType(){
        this.reset(FIELD_SRCVALUESTDDATATYPE);
    }

    /**
     * 设置 源值标准数据类型
     * <P>
     * 等同 {@link #setSrcValueStdDataType}
     * @param srcValueStdDataType
     */
    @JsonIgnore
    public PSDERDEFMap srcvaluestddatatype(Integer srcValueStdDataType){
        this.setSrcValueStdDataType(srcValueStdDataType);
        return this;
    }

    /**
     * <B>SRCVALUETYPE</B>&nbsp;源值类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamValueType} 
     */
    public final static String FIELD_SRCVALUETYPE = "srcvaluetype";

    /**
     * 设置 源值类型
     * 
     * @param srcValueType
     * 
     */
    @JsonProperty(FIELD_SRCVALUETYPE)
    public void setSrcValueType(String srcValueType){
        this.set(FIELD_SRCVALUETYPE, srcValueType);
    }
    
    /**
     * 获取 源值类型  
     * @return
     */
    @JsonIgnore
    public String getSrcValueType(){
        Object objValue = this.get(FIELD_SRCVALUETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源值类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcValueTypeDirty(){
        if(this.contains(FIELD_SRCVALUETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源值类型
     */
    @JsonIgnore
    public void resetSrcValueType(){
        this.reset(FIELD_SRCVALUETYPE);
    }

    /**
     * 设置 源值类型
     * <P>
     * 等同 {@link #setSrcValueType}
     * @param srcValueType
     */
    @JsonIgnore
    public PSDERDEFMap srcvaluetype(String srcValueType){
        this.setSrcValueType(srcValueType);
        return this;
    }

     /**
     * 设置 源值类型
     * <P>
     * 等同 {@link #setSrcValueType}
     * @param srcValueType
     */
    @JsonIgnore
    public PSDERDEFMap srcvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamValueType srcValueType){
        if(srcValueType == null){
            this.setSrcValueType(null);
        }
        else{
            this.setSrcValueType(srcValueType.value);
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
    public PSDERDEFMap updatedate(String updateDate){
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
    public PSDERDEFMap updateman(String updateMan){
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
    public PSDERDEFMap usercat(String userCat){
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
    public PSDERDEFMap usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDERDEFMap usertag(String userTag){
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
    public PSDERDEFMap usertag2(String userTag2){
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
    public PSDERDEFMap usertag3(String userTag3){
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
    public PSDERDEFMap usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDERDEFMapId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDERDEFMapId(strValue);
    }

    @JsonIgnore
    public PSDERDEFMap id(String strValue){
        this.setPSDERDEFMapId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDERDEFMap){
            PSDERDEFMap model = (PSDERDEFMap)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
