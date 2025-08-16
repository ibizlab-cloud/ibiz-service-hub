package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBDTABLERS</B>大数据表关系 模型传输对象
 * <P>
 * 大数据表关系模型，定义大数据表之间的关系
 */
public class PSSysBDTableRSDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBDTableRSDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;主关系代码标识，指定大数据表关系的代码标识，需在从数据表中具备唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 主关系代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 主关系代码标识  
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
     * 判断 主关系代码标识 是否指定值，包括空值
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
     * 重置 主关系代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 主关系代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSSysBDTableRSDTO codename(String codeName){
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
    public PSSysBDTableRSDTO createdate(Timestamp createDate){
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
    public PSSysBDTableRSDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MAJORPSSYSBDTABLEID</B>&nbsp;主数据表，指定大数据表关系的主大数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDTableDTO} 
     */
    public final static String FIELD_MAJORPSSYSBDTABLEID = "majorpssysbdtableid";

    /**
     * 设置 主数据表，详细说明：{@link #FIELD_MAJORPSSYSBDTABLEID}
     * 
     * @param majorPSSysBDTableId
     * 
     */
    @JsonProperty(FIELD_MAJORPSSYSBDTABLEID)
    public void setMajorPSSysBDTableId(String majorPSSysBDTableId){
        this.set(FIELD_MAJORPSSYSBDTABLEID, majorPSSysBDTableId);
    }
    
    /**
     * 获取 主数据表  
     * @return
     */
    @JsonIgnore
    public String getMajorPSSysBDTableId(){
        Object objValue = this.get(FIELD_MAJORPSSYSBDTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSSysBDTableIdDirty(){
        if(this.contains(FIELD_MAJORPSSYSBDTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主数据表
     */
    @JsonIgnore
    public void resetMajorPSSysBDTableId(){
        this.reset(FIELD_MAJORPSSYSBDTABLEID);
    }

    /**
     * 设置 主数据表，详细说明：{@link #FIELD_MAJORPSSYSBDTABLEID}
     * <P>
     * 等同 {@link #setMajorPSSysBDTableId}
     * @param majorPSSysBDTableId
     */
    @JsonIgnore
    public PSSysBDTableRSDTO majorpssysbdtableid(String majorPSSysBDTableId){
        this.setMajorPSSysBDTableId(majorPSSysBDTableId);
        return this;
    }

    /**
     * 设置 主数据表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSSysBDTableId}
     * @param pSSysBDTable 引用对象
     */
    @JsonIgnore
    public PSSysBDTableRSDTO majorpssysbdtableid(PSSysBDTableDTO pSSysBDTable){
        if(pSSysBDTable == null){
            this.setMajorPSSysBDTableId(null);
            this.setMajorPSSysBDTableName(null);
        }
        else{
            this.setMajorPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setMajorPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    /**
     * <B>MAJORPSSYSBDTABLENAME</B>&nbsp;主数据表，指定大数据表关系的主大数据表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSSYSBDTABLEID}
     */
    public final static String FIELD_MAJORPSSYSBDTABLENAME = "majorpssysbdtablename";

    /**
     * 设置 主数据表，详细说明：{@link #FIELD_MAJORPSSYSBDTABLENAME}
     * 
     * @param majorPSSysBDTableName
     * 
     */
    @JsonProperty(FIELD_MAJORPSSYSBDTABLENAME)
    public void setMajorPSSysBDTableName(String majorPSSysBDTableName){
        this.set(FIELD_MAJORPSSYSBDTABLENAME, majorPSSysBDTableName);
    }
    
    /**
     * 获取 主数据表  
     * @return
     */
    @JsonIgnore
    public String getMajorPSSysBDTableName(){
        Object objValue = this.get(FIELD_MAJORPSSYSBDTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSSysBDTableNameDirty(){
        if(this.contains(FIELD_MAJORPSSYSBDTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主数据表
     */
    @JsonIgnore
    public void resetMajorPSSysBDTableName(){
        this.reset(FIELD_MAJORPSSYSBDTABLENAME);
    }

    /**
     * 设置 主数据表，详细说明：{@link #FIELD_MAJORPSSYSBDTABLENAME}
     * <P>
     * 等同 {@link #setMajorPSSysBDTableName}
     * @param majorPSSysBDTableName
     */
    @JsonIgnore
    public PSSysBDTableRSDTO majorpssysbdtablename(String majorPSSysBDTableName){
        this.setMajorPSSysBDTableName(majorPSSysBDTableName);
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
    public PSSysBDTableRSDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORCODENAME</B>&nbsp;从关系代码标识，指定大数据表关系的从关系代码标识，需在主数据表中具备唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_MINORCODENAME = "minorcodename";

    /**
     * 设置 从关系代码标识，详细说明：{@link #FIELD_MINORCODENAME}
     * 
     * @param minorCodeName
     * 
     */
    @JsonProperty(FIELD_MINORCODENAME)
    public void setMinorCodeName(String minorCodeName){
        this.set(FIELD_MINORCODENAME, minorCodeName);
    }
    
    /**
     * 获取 从关系代码标识  
     * @return
     */
    @JsonIgnore
    public String getMinorCodeName(){
        Object objValue = this.get(FIELD_MINORCODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从关系代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorCodeNameDirty(){
        if(this.contains(FIELD_MINORCODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从关系代码标识
     */
    @JsonIgnore
    public void resetMinorCodeName(){
        this.reset(FIELD_MINORCODENAME);
    }

    /**
     * 设置 从关系代码标识，详细说明：{@link #FIELD_MINORCODENAME}
     * <P>
     * 等同 {@link #setMinorCodeName}
     * @param minorCodeName
     */
    @JsonIgnore
    public PSSysBDTableRSDTO minorcodename(String minorCodeName){
        this.setMinorCodeName(minorCodeName);
        return this;
    }

    /**
     * <B>MINORPSSYSBDTABLEID</B>&nbsp;从数据表，指定大数据表关系的从大数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDTableDTO} 
     */
    public final static String FIELD_MINORPSSYSBDTABLEID = "minorpssysbdtableid";

    /**
     * 设置 从数据表，详细说明：{@link #FIELD_MINORPSSYSBDTABLEID}
     * 
     * @param minorPSSysBDTableId
     * 
     */
    @JsonProperty(FIELD_MINORPSSYSBDTABLEID)
    public void setMinorPSSysBDTableId(String minorPSSysBDTableId){
        this.set(FIELD_MINORPSSYSBDTABLEID, minorPSSysBDTableId);
    }
    
    /**
     * 获取 从数据表  
     * @return
     */
    @JsonIgnore
    public String getMinorPSSysBDTableId(){
        Object objValue = this.get(FIELD_MINORPSSYSBDTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSSysBDTableIdDirty(){
        if(this.contains(FIELD_MINORPSSYSBDTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从数据表
     */
    @JsonIgnore
    public void resetMinorPSSysBDTableId(){
        this.reset(FIELD_MINORPSSYSBDTABLEID);
    }

    /**
     * 设置 从数据表，详细说明：{@link #FIELD_MINORPSSYSBDTABLEID}
     * <P>
     * 等同 {@link #setMinorPSSysBDTableId}
     * @param minorPSSysBDTableId
     */
    @JsonIgnore
    public PSSysBDTableRSDTO minorpssysbdtableid(String minorPSSysBDTableId){
        this.setMinorPSSysBDTableId(minorPSSysBDTableId);
        return this;
    }

    /**
     * 设置 从数据表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSSysBDTableId}
     * @param pSSysBDTable 引用对象
     */
    @JsonIgnore
    public PSSysBDTableRSDTO minorpssysbdtableid(PSSysBDTableDTO pSSysBDTable){
        if(pSSysBDTable == null){
            this.setMinorPSSysBDTableId(null);
            this.setMinorPSSysBDTableName(null);
        }
        else{
            this.setMinorPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setMinorPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    /**
     * <B>MINORPSSYSBDTABLENAME</B>&nbsp;从数据表，指定大数据表关系的从大数据表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSSYSBDTABLEID}
     */
    public final static String FIELD_MINORPSSYSBDTABLENAME = "minorpssysbdtablename";

    /**
     * 设置 从数据表，详细说明：{@link #FIELD_MINORPSSYSBDTABLENAME}
     * 
     * @param minorPSSysBDTableName
     * 
     */
    @JsonProperty(FIELD_MINORPSSYSBDTABLENAME)
    public void setMinorPSSysBDTableName(String minorPSSysBDTableName){
        this.set(FIELD_MINORPSSYSBDTABLENAME, minorPSSysBDTableName);
    }
    
    /**
     * 获取 从数据表  
     * @return
     */
    @JsonIgnore
    public String getMinorPSSysBDTableName(){
        Object objValue = this.get(FIELD_MINORPSSYSBDTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSSysBDTableNameDirty(){
        if(this.contains(FIELD_MINORPSSYSBDTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从数据表
     */
    @JsonIgnore
    public void resetMinorPSSysBDTableName(){
        this.reset(FIELD_MINORPSSYSBDTABLENAME);
    }

    /**
     * 设置 从数据表，详细说明：{@link #FIELD_MINORPSSYSBDTABLENAME}
     * <P>
     * 等同 {@link #setMinorPSSysBDTableName}
     * @param minorPSSysBDTableName
     */
    @JsonIgnore
    public PSSysBDTableRSDTO minorpssysbdtablename(String minorPSSysBDTableName){
        this.setMinorPSSysBDTableName(minorPSSysBDTableName);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 排序值  
     * @return
     */
    @JsonIgnore
    public Integer getOrderValue(){
        Object objValue = this.get(FIELD_ORDERVALUE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 排序值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrderValueDirty(){
        if(this.contains(FIELD_ORDERVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序值
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 排序值
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysBDTableRSDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定大数据表关系相关的实体关系对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
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
    public PSSysBDTableRSDTO psderid(String pSDERId){
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
    public PSSysBDTableRSDTO psderid(PSDERDTO pSDER){
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
     * <B>PSDERNAME</B>&nbsp;实体关系，指定大数据表关系相关的实体关系对象
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
    public PSSysBDTableRSDTO psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMEID</B>&nbsp;大数据体系，指定大数据表关系所属的大数据体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDSchemeDTO} 
     */
    public final static String FIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMEID}
     * 
     * @param pSSysBDSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMEID)
    public void setPSSysBDSchemeId(String pSSysBDSchemeId){
        this.set(FIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }
    
    /**
     * 获取 大数据体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeId(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据体系
     */
    @JsonIgnore
    public void resetPSSysBDSchemeId(){
        this.reset(FIELD_PSSYSBDSCHEMEID);
    }

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMEID}
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDSchemeId
     */
    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdschemeid(String pSSysBDSchemeId){
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    /**
     * 设置 大数据体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDScheme 引用对象
     */
    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdschemeid(PSSysBDSchemeDTO pSSysBDScheme){
        if(pSSysBDScheme == null){
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDSchemeName(null);
        }
        else{
            this.setPSSysBDSchemeId(pSSysBDScheme.getPSSysBDSchemeId());
            this.setPSSysBDSchemeName(pSSysBDScheme.getPSSysBDSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMENAME</B>&nbsp;大数据体系，指定大数据表关系所属的大数据体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDSCHEMEID}
     */
    public final static String FIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMENAME}
     * 
     * @param pSSysBDSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMENAME)
    public void setPSSysBDSchemeName(String pSSysBDSchemeName){
        this.set(FIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }
    
    /**
     * 获取 大数据体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeName(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据体系
     */
    @JsonIgnore
    public void resetPSSysBDSchemeName(){
        this.reset(FIELD_PSSYSBDSCHEMENAME);
    }

    /**
     * 设置 大数据体系，详细说明：{@link #FIELD_PSSYSBDSCHEMENAME}
     * <P>
     * 等同 {@link #setPSSysBDSchemeName}
     * @param pSSysBDSchemeName
     */
    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdschemename(String pSSysBDSchemeName){
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLERSID</B>&nbsp;大数据表关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDTABLERSID = "pssysbdtablersid";

    /**
     * 设置 大数据表关系标识
     * 
     * @param pSSysBDTableRSId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLERSID)
    public void setPSSysBDTableRSId(String pSSysBDTableRSId){
        this.set(FIELD_PSSYSBDTABLERSID, pSSysBDTableRSId);
    }
    
    /**
     * 获取 大数据表关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableRSId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLERSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableRSIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLERSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表关系标识
     */
    @JsonIgnore
    public void resetPSSysBDTableRSId(){
        this.reset(FIELD_PSSYSBDTABLERSID);
    }

    /**
     * 设置 大数据表关系标识
     * <P>
     * 等同 {@link #setPSSysBDTableRSId}
     * @param pSSysBDTableRSId
     */
    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdtablersid(String pSSysBDTableRSId){
        this.setPSSysBDTableRSId(pSSysBDTableRSId);
        return this;
    }

    /**
     * <B>PSSYSBDTABLERSNAME</B>&nbsp;关系名称，指定大数据表关系的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBDTABLERSNAME = "pssysbdtablersname";

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSSYSBDTABLERSNAME}
     * 
     * @param pSSysBDTableRSName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLERSNAME)
    public void setPSSysBDTableRSName(String pSSysBDTableRSName){
        this.set(FIELD_PSSYSBDTABLERSNAME, pSSysBDTableRSName);
    }
    
    /**
     * 获取 关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableRSName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLERSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableRSNameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLERSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系名称
     */
    @JsonIgnore
    public void resetPSSysBDTableRSName(){
        this.reset(FIELD_PSSYSBDTABLERSNAME);
    }

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSSYSBDTABLERSNAME}
     * <P>
     * 等同 {@link #setPSSysBDTableRSName}
     * @param pSSysBDTableRSName
     */
    @JsonIgnore
    public PSSysBDTableRSDTO pssysbdtablersname(String pSSysBDTableRSName){
        this.setPSSysBDTableRSName(pSSysBDTableRSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDTableRSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDTableRSName(strName);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO name(String strName){
        this.setPSSysBDTableRSName(strName);
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
    public PSSysBDTableRSDTO updatedate(Timestamp updateDate){
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
    public PSSysBDTableRSDTO updateman(String updateMan){
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
    public PSSysBDTableRSDTO usercat(String userCat){
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
    public PSSysBDTableRSDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDTableRSDTO usertag(String userTag){
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
    public PSSysBDTableRSDTO usertag2(String userTag2){
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
    public PSSysBDTableRSDTO usertag3(String userTag3){
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
    public PSSysBDTableRSDTO usertag4(String userTag4){
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
    public PSSysBDTableRSDTO validflag(Integer validFlag){
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
    public PSSysBDTableRSDTO validflag(Boolean validFlag){
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
        return this.getPSSysBDTableRSId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBDTableRSId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDTableRSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDTableRSId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableRSDTO id(String strValue){
        this.setPSSysBDTableRSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBDTableRSDTO){
            PSSysBDTableRSDTO dto = (PSSysBDTableRSDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
