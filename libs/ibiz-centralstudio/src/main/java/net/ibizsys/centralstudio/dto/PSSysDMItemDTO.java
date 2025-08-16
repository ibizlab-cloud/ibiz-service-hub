package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDMITEM</B>系统数据库模型项 模型传输对象
 * <P>
 * 
 */
public class PSSysDMItemDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDMItemDTO(){
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
    public PSSysDMItemDTO createdate(Timestamp createDate){
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
    public PSSysDMItemDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CREATESQL</B>&nbsp;建立SQL
     */
    public final static String FIELD_CREATESQL = "createsql";

    /**
     * 设置 建立SQL
     * 
     * @param createSql
     * 
     */
    @JsonProperty(FIELD_CREATESQL)
    public void setCreateSql(String createSql){
        this.set(FIELD_CREATESQL, createSql);
    }
    
    /**
     * 获取 建立SQL  
     * @return
     */
    @JsonIgnore
    public String getCreateSql(){
        Object objValue = this.get(FIELD_CREATESQL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSqlDirty(){
        if(this.contains(FIELD_CREATESQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立SQL
     */
    @JsonIgnore
    public void resetCreateSql(){
        this.reset(FIELD_CREATESQL);
    }

    /**
     * 设置 建立SQL
     * <P>
     * 等同 {@link #setCreateSql}
     * @param createSql
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql(String createSql){
        this.setCreateSql(createSql);
        return this;
    }

    /**
     * <B>CREATESQL2</B>&nbsp;建立之后SQL
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CREATESQL2 = "createsql2";

    /**
     * 设置 建立之后SQL
     * 
     * @param createSql2
     * 
     */
    @JsonProperty(FIELD_CREATESQL2)
    public void setCreateSql2(String createSql2){
        this.set(FIELD_CREATESQL2, createSql2);
    }
    
    /**
     * 获取 建立之后SQL  
     * @return
     */
    @JsonIgnore
    public String getCreateSql2(){
        Object objValue = this.get(FIELD_CREATESQL2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立之后SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSql2Dirty(){
        if(this.contains(FIELD_CREATESQL2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立之后SQL
     */
    @JsonIgnore
    public void resetCreateSql2(){
        this.reset(FIELD_CREATESQL2);
    }

    /**
     * 设置 建立之后SQL
     * <P>
     * 等同 {@link #setCreateSql2}
     * @param createSql2
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql2(String createSql2){
        this.setCreateSql2(createSql2);
        return this;
    }

    /**
     * <B>CREATESQL3</B>&nbsp;建立之前SQL
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CREATESQL3 = "createsql3";

    /**
     * 设置 建立之前SQL
     * 
     * @param createSql3
     * 
     */
    @JsonProperty(FIELD_CREATESQL3)
    public void setCreateSql3(String createSql3){
        this.set(FIELD_CREATESQL3, createSql3);
    }
    
    /**
     * 获取 建立之前SQL  
     * @return
     */
    @JsonIgnore
    public String getCreateSql3(){
        Object objValue = this.get(FIELD_CREATESQL3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立之前SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSql3Dirty(){
        if(this.contains(FIELD_CREATESQL3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立之前SQL
     */
    @JsonIgnore
    public void resetCreateSql3(){
        this.reset(FIELD_CREATESQL3);
    }

    /**
     * 设置 建立之前SQL
     * <P>
     * 等同 {@link #setCreateSql3}
     * @param createSql3
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql3(String createSql3){
        this.setCreateSql3(createSql3);
        return this;
    }

    /**
     * <B>CREATESQL4</B>&nbsp;建立SQL（短）
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CREATESQL4 = "createsql4";

    /**
     * 设置 建立SQL（短）
     * 
     * @param createSql4
     * 
     */
    @JsonProperty(FIELD_CREATESQL4)
    public void setCreateSql4(String createSql4){
        this.set(FIELD_CREATESQL4, createSql4);
    }
    
    /**
     * 获取 建立SQL（短）  
     * @return
     */
    @JsonIgnore
    public String getCreateSql4(){
        Object objValue = this.get(FIELD_CREATESQL4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立SQL（短） 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSql4Dirty(){
        if(this.contains(FIELD_CREATESQL4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立SQL（短）
     */
    @JsonIgnore
    public void resetCreateSql4(){
        this.reset(FIELD_CREATESQL4);
    }

    /**
     * 设置 建立SQL（短）
     * <P>
     * 等同 {@link #setCreateSql4}
     * @param createSql4
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql4(String createSql4){
        this.setCreateSql4(createSql4);
        return this;
    }

    /**
     * <B>CREATESQL5</B>&nbsp;建立之后SQL2
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CREATESQL5 = "createsql5";

    /**
     * 设置 建立之后SQL2
     * 
     * @param createSql5
     * 
     */
    @JsonProperty(FIELD_CREATESQL5)
    public void setCreateSql5(String createSql5){
        this.set(FIELD_CREATESQL5, createSql5);
    }
    
    /**
     * 获取 建立之后SQL2  
     * @return
     */
    @JsonIgnore
    public String getCreateSql5(){
        Object objValue = this.get(FIELD_CREATESQL5);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立之后SQL2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSql5Dirty(){
        if(this.contains(FIELD_CREATESQL5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立之后SQL2
     */
    @JsonIgnore
    public void resetCreateSql5(){
        this.reset(FIELD_CREATESQL5);
    }

    /**
     * 设置 建立之后SQL2
     * <P>
     * 等同 {@link #setCreateSql5}
     * @param createSql5
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql5(String createSql5){
        this.setCreateSql5(createSql5);
        return this;
    }

    /**
     * <B>CREATESQL6</B>&nbsp;建立之后SQL3，此列模型库与核心库类型不同，模型库使用 2000 的文本
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CREATESQL6 = "createsql6";

    /**
     * 设置 建立之后SQL3，详细说明：{@link #FIELD_CREATESQL6}
     * 
     * @param createSql6
     * 
     */
    @JsonProperty(FIELD_CREATESQL6)
    public void setCreateSql6(String createSql6){
        this.set(FIELD_CREATESQL6, createSql6);
    }
    
    /**
     * 获取 建立之后SQL3  
     * @return
     */
    @JsonIgnore
    public String getCreateSql6(){
        Object objValue = this.get(FIELD_CREATESQL6);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立之后SQL3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSql6Dirty(){
        if(this.contains(FIELD_CREATESQL6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立之后SQL3
     */
    @JsonIgnore
    public void resetCreateSql6(){
        this.reset(FIELD_CREATESQL6);
    }

    /**
     * 设置 建立之后SQL3，详细说明：{@link #FIELD_CREATESQL6}
     * <P>
     * 等同 {@link #setCreateSql6}
     * @param createSql6
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql6(String createSql6){
        this.setCreateSql6(createSql6);
        return this;
    }

    /**
     * <B>CREATESQL7</B>&nbsp;建立之后SQL4，此列模型库与核心库类型不同，模型库使用 2000 的文本
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CREATESQL7 = "createsql7";

    /**
     * 设置 建立之后SQL4，详细说明：{@link #FIELD_CREATESQL7}
     * 
     * @param createSql7
     * 
     */
    @JsonProperty(FIELD_CREATESQL7)
    public void setCreateSql7(String createSql7){
        this.set(FIELD_CREATESQL7, createSql7);
    }
    
    /**
     * 获取 建立之后SQL4  
     * @return
     */
    @JsonIgnore
    public String getCreateSql7(){
        Object objValue = this.get(FIELD_CREATESQL7);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 建立之后SQL4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCreateSql7Dirty(){
        if(this.contains(FIELD_CREATESQL7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 建立之后SQL4
     */
    @JsonIgnore
    public void resetCreateSql7(){
        this.reset(FIELD_CREATESQL7);
    }

    /**
     * 设置 建立之后SQL4，详细说明：{@link #FIELD_CREATESQL7}
     * <P>
     * 等同 {@link #setCreateSql7}
     * @param createSql7
     */
    @JsonIgnore
    public PSSysDMItemDTO createsql7(String createSql7){
        this.setCreateSql7(createSql7);
        return this;
    }

    /**
     * <B>DBOBJTYPE</B>&nbsp;对象类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DBObjectType} 
     */
    public final static String FIELD_DBOBJTYPE = "dbobjtype";

    /**
     * 设置 对象类型
     * 
     * @param dBObjType
     * 
     */
    @JsonProperty(FIELD_DBOBJTYPE)
    public void setDBObjType(String dBObjType){
        this.set(FIELD_DBOBJTYPE, dBObjType);
    }
    
    /**
     * 获取 对象类型  
     * @return
     */
    @JsonIgnore
    public String getDBObjType(){
        Object objValue = this.get(FIELD_DBOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDBObjTypeDirty(){
        if(this.contains(FIELD_DBOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 对象类型
     */
    @JsonIgnore
    public void resetDBObjType(){
        this.reset(FIELD_DBOBJTYPE);
    }

    /**
     * 设置 对象类型
     * <P>
     * 等同 {@link #setDBObjType}
     * @param dBObjType
     */
    @JsonIgnore
    public PSSysDMItemDTO dbobjtype(String dBObjType){
        this.setDBObjType(dBObjType);
        return this;
    }

     /**
     * 设置 对象类型
     * <P>
     * 等同 {@link #setDBObjType}
     * @param dBObjType
     */
    @JsonIgnore
    public PSSysDMItemDTO dbobjtype(net.ibizsys.model.PSModelEnums.DBObjectType dBObjType){
        if(dBObjType == null){
            this.setDBObjType(null);
        }
        else{
            this.setDBObjType(dBObjType.value);
        }
        return this;
    }

    /**
     * <B>DROPSQL</B>&nbsp;移除SQL
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_DROPSQL = "dropsql";

    /**
     * 设置 移除SQL
     * 
     * @param dropSql
     * 
     */
    @JsonProperty(FIELD_DROPSQL)
    public void setDropSql(String dropSql){
        this.set(FIELD_DROPSQL, dropSql);
    }
    
    /**
     * 获取 移除SQL  
     * @return
     */
    @JsonIgnore
    public String getDropSql(){
        Object objValue = this.get(FIELD_DROPSQL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 移除SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDropSqlDirty(){
        if(this.contains(FIELD_DROPSQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 移除SQL
     */
    @JsonIgnore
    public void resetDropSql(){
        this.reset(FIELD_DROPSQL);
    }

    /**
     * 设置 移除SQL
     * <P>
     * 等同 {@link #setDropSql}
     * @param dropSql
     */
    @JsonIgnore
    public PSSysDMItemDTO dropsql(String dropSql){
        this.setDropSql(dropSql);
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
    public PSSysDMItemDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSSysDMItemDTO psdeid(String pSDEId){
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
    public PSSysDMItemDTO psdeid(PSDataEntityDTO pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
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
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysDMItemDTO psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSOBJID</B>&nbsp;模型对象标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSOBJID = "psobjid";

    /**
     * 设置 模型对象标识
     * 
     * @param pSObjId
     * 
     */
    @JsonProperty(FIELD_PSOBJID)
    public void setPSObjId(String pSObjId){
        this.set(FIELD_PSOBJID, pSObjId);
    }
    
    /**
     * 获取 模型对象标识  
     * @return
     */
    @JsonIgnore
    public String getPSObjId(){
        Object objValue = this.get(FIELD_PSOBJID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型对象标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjIdDirty(){
        if(this.contains(FIELD_PSOBJID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型对象标识
     */
    @JsonIgnore
    public void resetPSObjId(){
        this.reset(FIELD_PSOBJID);
    }

    /**
     * 设置 模型对象标识
     * <P>
     * 等同 {@link #setPSObjId}
     * @param pSObjId
     */
    @JsonIgnore
    public PSSysDMItemDTO psobjid(String pSObjId){
        this.setPSObjId(pSObjId);
        return this;
    }

    /**
     * <B>PSOBJNAME</B>&nbsp;模型名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJNAME = "psobjname";

    /**
     * 设置 模型名称
     * 
     * @param pSObjName
     * 
     */
    @JsonProperty(FIELD_PSOBJNAME)
    public void setPSObjName(String pSObjName){
        this.set(FIELD_PSOBJNAME, pSObjName);
    }
    
    /**
     * 获取 模型名称  
     * @return
     */
    @JsonIgnore
    public String getPSObjName(){
        Object objValue = this.get(FIELD_PSOBJNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjNameDirty(){
        if(this.contains(FIELD_PSOBJNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型名称
     */
    @JsonIgnore
    public void resetPSObjName(){
        this.reset(FIELD_PSOBJNAME);
    }

    /**
     * 设置 模型名称
     * <P>
     * 等同 {@link #setPSObjName}
     * @param pSObjName
     */
    @JsonIgnore
    public PSSysDMItemDTO psobjname(String pSObjName){
        this.setPSObjName(pSObjName);
        return this;
    }

    /**
     * <B>PSSYSDMITEMID</B>&nbsp;系统数据库模型项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDMITEMID = "pssysdmitemid";

    /**
     * 设置 系统数据库模型项标识
     * 
     * @param pSSysDMItemId
     * 
     */
    @JsonProperty(FIELD_PSSYSDMITEMID)
    public void setPSSysDMItemId(String pSSysDMItemId){
        this.set(FIELD_PSSYSDMITEMID, pSSysDMItemId);
    }
    
    /**
     * 获取 系统数据库模型项标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDMItemId(){
        Object objValue = this.get(FIELD_PSSYSDMITEMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库模型项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDMItemIdDirty(){
        if(this.contains(FIELD_PSSYSDMITEMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库模型项标识
     */
    @JsonIgnore
    public void resetPSSysDMItemId(){
        this.reset(FIELD_PSSYSDMITEMID);
    }

    /**
     * 设置 系统数据库模型项标识
     * <P>
     * 等同 {@link #setPSSysDMItemId}
     * @param pSSysDMItemId
     */
    @JsonIgnore
    public PSSysDMItemDTO pssysdmitemid(String pSSysDMItemId){
        this.setPSSysDMItemId(pSSysDMItemId);
        return this;
    }

    /**
     * <B>PSSYSDMITEMNAME</B>&nbsp;模型项名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDMITEMNAME = "pssysdmitemname";

    /**
     * 设置 模型项名称
     * 
     * @param pSSysDMItemName
     * 
     */
    @JsonProperty(FIELD_PSSYSDMITEMNAME)
    public void setPSSysDMItemName(String pSSysDMItemName){
        this.set(FIELD_PSSYSDMITEMNAME, pSSysDMItemName);
    }
    
    /**
     * 获取 模型项名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDMItemName(){
        Object objValue = this.get(FIELD_PSSYSDMITEMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDMItemNameDirty(){
        if(this.contains(FIELD_PSSYSDMITEMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型项名称
     */
    @JsonIgnore
    public void resetPSSysDMItemName(){
        this.reset(FIELD_PSSYSDMITEMNAME);
    }

    /**
     * 设置 模型项名称
     * <P>
     * 等同 {@link #setPSSysDMItemName}
     * @param pSSysDMItemName
     */
    @JsonIgnore
    public PSSysDMItemDTO pssysdmitemname(String pSSysDMItemName){
        this.setPSSysDMItemName(pSSysDMItemName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDMItemName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDMItemName(strName);
    }

    @JsonIgnore
    public PSSysDMItemDTO name(String strName){
        this.setPSSysDMItemName(strName);
        return this;
    }

    /**
     * <B>PSSYSDMVERID</B>&nbsp;数据库模型版本
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDMVerDTO} 
     */
    public final static String FIELD_PSSYSDMVERID = "pssysdmverid";

    /**
     * 设置 数据库模型版本
     * 
     * @param pSSysDMVerId
     * 
     */
    @JsonProperty(FIELD_PSSYSDMVERID)
    public void setPSSysDMVerId(String pSSysDMVerId){
        this.set(FIELD_PSSYSDMVERID, pSSysDMVerId);
    }
    
    /**
     * 获取 数据库模型版本  
     * @return
     */
    @JsonIgnore
    public String getPSSysDMVerId(){
        Object objValue = this.get(FIELD_PSSYSDMVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDMVerIdDirty(){
        if(this.contains(FIELD_PSSYSDMVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库模型版本
     */
    @JsonIgnore
    public void resetPSSysDMVerId(){
        this.reset(FIELD_PSSYSDMVERID);
    }

    /**
     * 设置 数据库模型版本
     * <P>
     * 等同 {@link #setPSSysDMVerId}
     * @param pSSysDMVerId
     */
    @JsonIgnore
    public PSSysDMItemDTO pssysdmverid(String pSSysDMVerId){
        this.setPSSysDMVerId(pSSysDMVerId);
        return this;
    }

    /**
     * 设置 数据库模型版本，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDMVerId}
     * @param pSSysDMVer 引用对象
     */
    @JsonIgnore
    public PSSysDMItemDTO pssysdmverid(PSSysDMVerDTO pSSysDMVer){
        if(pSSysDMVer == null){
            this.setPSSysDMVerId(null);
            this.setPSSysDMVerName(null);
        }
        else{
            this.setPSSysDMVerId(pSSysDMVer.getPSSysDMVerId());
            this.setPSSysDMVerName(pSSysDMVer.getPSSysDMVerName());
        }
        return this;
    }

    /**
     * <B>PSSYSDMVERNAME</B>&nbsp;数据库模型版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDMVERID}
     */
    public final static String FIELD_PSSYSDMVERNAME = "pssysdmvername";

    /**
     * 设置 数据库模型版本
     * 
     * @param pSSysDMVerName
     * 
     */
    @JsonProperty(FIELD_PSSYSDMVERNAME)
    public void setPSSysDMVerName(String pSSysDMVerName){
        this.set(FIELD_PSSYSDMVERNAME, pSSysDMVerName);
    }
    
    /**
     * 获取 数据库模型版本  
     * @return
     */
    @JsonIgnore
    public String getPSSysDMVerName(){
        Object objValue = this.get(FIELD_PSSYSDMVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDMVerNameDirty(){
        if(this.contains(FIELD_PSSYSDMVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库模型版本
     */
    @JsonIgnore
    public void resetPSSysDMVerName(){
        this.reset(FIELD_PSSYSDMVERNAME);
    }

    /**
     * 设置 数据库模型版本
     * <P>
     * 等同 {@link #setPSSysDMVerName}
     * @param pSSysDMVerName
     */
    @JsonIgnore
    public PSSysDMItemDTO pssysdmvername(String pSSysDMVerName){
        this.setPSSysDMVerName(pSSysDMVerName);
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGID</B>&nbsp;系统数据库
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSystemDBCfgDTO} 
     */
    public final static String FIELD_PSSYSTEMDBCFGID = "pssystemdbcfgid";

    /**
     * 设置 系统数据库
     * 
     * @param pSSystemDBCfgId
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGID)
    public void setPSSystemDBCfgId(String pSSystemDBCfgId){
        this.set(FIELD_PSSYSTEMDBCFGID, pSSystemDBCfgId);
    }
    
    /**
     * 获取 系统数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgId(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgIdDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库
     */
    @JsonIgnore
    public void resetPSSystemDBCfgId(){
        this.reset(FIELD_PSSYSTEMDBCFGID);
    }

    /**
     * 设置 系统数据库
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfgId
     */
    @JsonIgnore
    public PSSysDMItemDTO pssystemdbcfgid(String pSSystemDBCfgId){
        this.setPSSystemDBCfgId(pSSystemDBCfgId);
        return this;
    }

    /**
     * 设置 系统数据库，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSystemDBCfgId}
     * @param pSSystemDBCfg 引用对象
     */
    @JsonIgnore
    public PSSysDMItemDTO pssystemdbcfgid(PSSystemDBCfgDTO pSSystemDBCfg){
        if(pSSystemDBCfg == null){
            this.setPSSystemDBCfgId(null);
            this.setPSSystemDBCfgName(null);
        }
        else{
            this.setPSSystemDBCfgId(pSSystemDBCfg.getPSSystemDBCfgId());
            this.setPSSystemDBCfgName(pSSystemDBCfg.getPSSystemDBCfgName());
        }
        return this;
    }

    /**
     * <B>PSSYSTEMDBCFGNAME</B>&nbsp;系统数据库
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DBType} 
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSTEMDBCFGID}
     */
    public final static String FIELD_PSSYSTEMDBCFGNAME = "pssystemdbcfgname";

    /**
     * 设置 系统数据库
     * 
     * @param pSSystemDBCfgName
     * 
     */
    @JsonProperty(FIELD_PSSYSTEMDBCFGNAME)
    public void setPSSystemDBCfgName(String pSSystemDBCfgName){
        this.set(FIELD_PSSYSTEMDBCFGNAME, pSSystemDBCfgName);
    }
    
    /**
     * 获取 系统数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSystemDBCfgName(){
        Object objValue = this.get(FIELD_PSSYSTEMDBCFGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSystemDBCfgNameDirty(){
        if(this.contains(FIELD_PSSYSTEMDBCFGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库
     */
    @JsonIgnore
    public void resetPSSystemDBCfgName(){
        this.reset(FIELD_PSSYSTEMDBCFGNAME);
    }

    /**
     * 设置 系统数据库
     * <P>
     * 等同 {@link #setPSSystemDBCfgName}
     * @param pSSystemDBCfgName
     */
    @JsonIgnore
    public PSSysDMItemDTO pssystemdbcfgname(String pSSystemDBCfgName){
        this.setPSSystemDBCfgName(pSSystemDBCfgName);
        return this;
    }

    /**
     * <B>SYSDBVER</B>&nbsp;系统数据库模型版本
     */
    public final static String FIELD_SYSDBVER = "sysdbver";

    /**
     * 设置 系统数据库模型版本
     * 
     * @param sysDBVer
     * 
     */
    @JsonProperty(FIELD_SYSDBVER)
    public void setSysDBVer(Integer sysDBVer){
        this.set(FIELD_SYSDBVER, sysDBVer);
    }
    
    /**
     * 获取 系统数据库模型版本  
     * @return
     */
    @JsonIgnore
    public Integer getSysDBVer(){
        Object objValue = this.get(FIELD_SYSDBVER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统数据库模型版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysDBVerDirty(){
        if(this.contains(FIELD_SYSDBVER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库模型版本
     */
    @JsonIgnore
    public void resetSysDBVer(){
        this.reset(FIELD_SYSDBVER);
    }

    /**
     * 设置 系统数据库模型版本
     * <P>
     * 等同 {@link #setSysDBVer}
     * @param sysDBVer
     */
    @JsonIgnore
    public PSSysDMItemDTO sysdbver(Integer sysDBVer){
        this.setSysDBVer(sysDBVer);
        return this;
    }

    /**
     * <B>TESTSQL</B>&nbsp;测试SQL
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_TESTSQL = "testsql";

    /**
     * 设置 测试SQL
     * 
     * @param testSql
     * 
     */
    @JsonProperty(FIELD_TESTSQL)
    public void setTestSql(String testSql){
        this.set(FIELD_TESTSQL, testSql);
    }
    
    /**
     * 获取 测试SQL  
     * @return
     */
    @JsonIgnore
    public String getTestSql(){
        Object objValue = this.get(FIELD_TESTSQL);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 测试SQL 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTestSqlDirty(){
        if(this.contains(FIELD_TESTSQL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 测试SQL
     */
    @JsonIgnore
    public void resetTestSql(){
        this.reset(FIELD_TESTSQL);
    }

    /**
     * 设置 测试SQL
     * <P>
     * 等同 {@link #setTestSql}
     * @param testSql
     */
    @JsonIgnore
    public PSSysDMItemDTO testsql(String testSql){
        this.setTestSql(testSql);
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
    public PSSysDMItemDTO updatedate(Timestamp updateDate){
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
    public PSSysDMItemDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USERFLAG</B>&nbsp;用户自定义
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USERFLAG = "userflag";

    /**
     * 设置 用户自定义
     * 
     * @param userFlag
     * 
     */
    @JsonProperty(FIELD_USERFLAG)
    public void setUserFlag(Integer userFlag){
        this.set(FIELD_USERFLAG, userFlag);
    }
    
    /**
     * 获取 用户自定义  
     * @return
     */
    @JsonIgnore
    public Integer getUserFlag(){
        Object objValue = this.get(FIELD_USERFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 用户自定义 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserFlagDirty(){
        if(this.contains(FIELD_USERFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户自定义
     */
    @JsonIgnore
    public void resetUserFlag(){
        this.reset(FIELD_USERFLAG);
    }

    /**
     * 设置 用户自定义
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSSysDMItemDTO userflag(Integer userFlag){
        this.setUserFlag(userFlag);
        return this;
    }

     /**
     * 设置 用户自定义
     * <P>
     * 等同 {@link #setUserFlag}
     * @param userFlag
     */
    @JsonIgnore
    public PSSysDMItemDTO userflag(Boolean userFlag){
        if(userFlag == null){
            this.setUserFlag(null);
        }
        else{
            this.setUserFlag(userFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysDMItemId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDMItemId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDMItemId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDMItemId(strValue);
    }

    @JsonIgnore
    public PSSysDMItemDTO id(String strValue){
        this.setPSSysDMItemId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDMItemDTO){
            PSSysDMItemDTO dto = (PSSysDMItemDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
