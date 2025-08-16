package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSBDTABLEDER</B>大数据表实体关系 模型传输对象
 * <P>
 * 大数据表实体关系模型，定义大数据表相关的实体关系对象及相应的配置信息
 */
public class PSSysBDTableDERDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysBDTableDERDTO(){
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
    public PSSysBDTableDERDTO createdate(Timestamp createDate){
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
    public PSSysBDTableDERDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DERLEVEL</B>&nbsp;关系级别，指定大数据表实体关系的排序级别
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.BDTableDERLevel} 
     */
    public final static String FIELD_DERLEVEL = "derlevel";

    /**
     * 设置 关系级别，详细说明：{@link #FIELD_DERLEVEL}
     * 
     * @param dERLevel
     * 
     */
    @JsonProperty(FIELD_DERLEVEL)
    public void setDERLevel(Integer dERLevel){
        this.set(FIELD_DERLEVEL, dERLevel);
    }
    
    /**
     * 获取 关系级别  
     * @return
     */
    @JsonIgnore
    public Integer getDERLevel(){
        Object objValue = this.get(FIELD_DERLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 关系级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDERLevelDirty(){
        if(this.contains(FIELD_DERLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系级别
     */
    @JsonIgnore
    public void resetDERLevel(){
        this.reset(FIELD_DERLEVEL);
    }

    /**
     * 设置 关系级别，详细说明：{@link #FIELD_DERLEVEL}
     * <P>
     * 等同 {@link #setDERLevel}
     * @param dERLevel
     */
    @JsonIgnore
    public PSSysBDTableDERDTO derlevel(Integer dERLevel){
        this.setDERLevel(dERLevel);
        return this;
    }

     /**
     * 设置 关系级别，详细说明：{@link #FIELD_DERLEVEL}
     * <P>
     * 等同 {@link #setDERLevel}
     * @param dERLevel
     */
    @JsonIgnore
    public PSSysBDTableDERDTO derlevel(net.ibizsys.model.PSModelEnums.BDTableDERLevel dERLevel){
        if(dERLevel == null){
            this.setDERLevel(null);
        }
        else{
            this.setDERLevel(dERLevel.value);
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
    public PSSysBDTableDERDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定大数据表实体关系引用的实体关系对象
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
    public PSSysBDTableDERDTO psderid(String pSDERId){
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
    public PSSysBDTableDERDTO psderid(PSDERDTO pSDER){
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
     * <B>PSDERNAME</B>&nbsp;实体关系，指定大数据表实体关系引用的实体关系对象
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
    public PSSysBDTableDERDTO psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEDERID</B>&nbsp;大数据表关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDTABLEDERID = "pssysbdtablederid";

    /**
     * 设置 大数据表关系标识
     * 
     * @param pSSysBDTableDERId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEDERID)
    public void setPSSysBDTableDERId(String pSSysBDTableDERId){
        this.set(FIELD_PSSYSBDTABLEDERID, pSSysBDTableDERId);
    }
    
    /**
     * 获取 大数据表关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableDERId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEDERID);
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
    public boolean isPSSysBDTableDERIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表关系标识
     */
    @JsonIgnore
    public void resetPSSysBDTableDERId(){
        this.reset(FIELD_PSSYSBDTABLEDERID);
    }

    /**
     * 设置 大数据表关系标识
     * <P>
     * 等同 {@link #setPSSysBDTableDERId}
     * @param pSSysBDTableDERId
     */
    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtablederid(String pSSysBDTableDERId){
        this.setPSSysBDTableDERId(pSSysBDTableDERId);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEDERNAME</B>&nbsp;关系名称，指定大数据表实体关系的名称
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSBDTABLEDERNAME = "pssysbdtabledername";

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSSYSBDTABLEDERNAME}
     * 
     * @param pSSysBDTableDERName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEDERNAME)
    public void setPSSysBDTableDERName(String pSSysBDTableDERName){
        this.set(FIELD_PSSYSBDTABLEDERNAME, pSSysBDTableDERName);
    }
    
    /**
     * 获取 关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableDERName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEDERNAME);
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
    public boolean isPSSysBDTableDERNameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系名称
     */
    @JsonIgnore
    public void resetPSSysBDTableDERName(){
        this.reset(FIELD_PSSYSBDTABLEDERNAME);
    }

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSSYSBDTABLEDERNAME}
     * <P>
     * 等同 {@link #setPSSysBDTableDERName}
     * @param pSSysBDTableDERName
     */
    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtabledername(String pSSysBDTableDERName){
        this.setPSSysBDTableDERName(pSSysBDTableDERName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDTableDERName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDTableDERName(strName);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO name(String strName){
        this.setPSSysBDTableDERName(strName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据表，指定大数据表实体关系所属的大数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDTableDTO} 
     */
    public final static String FIELD_PSSYSBDTABLEID = "pssysbdtableid";

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLEID}
     * 
     * @param pSSysBDTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEID)
    public void setPSSysBDTableId(String pSSysBDTableId){
        this.set(FIELD_PSSYSBDTABLEID, pSSysBDTableId);
    }
    
    /**
     * 获取 大数据表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表
     */
    @JsonIgnore
    public void resetPSSysBDTableId(){
        this.reset(FIELD_PSSYSBDTABLEID);
    }

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLEID}
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTableId
     */
    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtableid(String pSSysBDTableId){
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    /**
     * 设置 大数据表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTable 引用对象
     */
    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable){
        if(pSSysBDTable == null){
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        }
        else{
            this.setPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据表，指定大数据表实体关系所属的大数据表对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDTABLEID}
     */
    public final static String FIELD_PSSYSBDTABLENAME = "pssysbdtablename";

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLENAME}
     * 
     * @param pSSysBDTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLENAME)
    public void setPSSysBDTableName(String pSSysBDTableName){
        this.set(FIELD_PSSYSBDTABLENAME, pSSysBDTableName);
    }
    
    /**
     * 获取 大数据表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableNameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表
     */
    @JsonIgnore
    public void resetPSSysBDTableName(){
        this.reset(FIELD_PSSYSBDTABLENAME);
    }

    /**
     * 设置 大数据表，详细说明：{@link #FIELD_PSSYSBDTABLENAME}
     * <P>
     * 等同 {@link #setPSSysBDTableName}
     * @param pSSysBDTableName
     */
    @JsonIgnore
    public PSSysBDTableDERDTO pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
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
    public PSSysBDTableDERDTO updatedate(Timestamp updateDate){
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
    public PSSysBDTableDERDTO updateman(String updateMan){
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
    public PSSysBDTableDERDTO usercat(String userCat){
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
    public PSSysBDTableDERDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDTableDERDTO usertag(String userTag){
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
    public PSSysBDTableDERDTO usertag2(String userTag2){
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
    public PSSysBDTableDERDTO usertag3(String userTag3){
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
    public PSSysBDTableDERDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysBDTableDERId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysBDTableDERId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDTableDERId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDTableDERId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableDERDTO id(String strValue){
        this.setPSSysBDTableDERId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysBDTableDERDTO){
            PSSysBDTableDERDTO dto = (PSSysBDTableDERDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
