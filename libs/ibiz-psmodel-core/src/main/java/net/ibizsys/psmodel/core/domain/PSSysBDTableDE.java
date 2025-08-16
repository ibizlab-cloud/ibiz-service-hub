package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSBDTABLEDE</B>大数据表实体 模型传输对象
 * <P>
 * 大数据表实体模型，定义大数据表相关的实体对象及相应的配置信息
 */
public class PSSysBDTableDE extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysBDTableDE(){
    }      

    /**
     * <B>ADDCOLMODE</B>&nbsp;列添加模式，指定大数据表实体添加列的模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.BDTableColMode} 
     */
    public final static String FIELD_ADDCOLMODE = "addcolmode";

    /**
     * 设置 列添加模式，详细说明：{@link #FIELD_ADDCOLMODE}
     * 
     * @param addColMode
     * 
     */
    @JsonProperty(FIELD_ADDCOLMODE)
    public void setAddColMode(Integer addColMode){
        this.set(FIELD_ADDCOLMODE, addColMode);
    }
    
    /**
     * 获取 列添加模式  
     * @return
     */
    @JsonIgnore
    public Integer getAddColMode(){
        Object objValue = this.get(FIELD_ADDCOLMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 列添加模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAddColModeDirty(){
        if(this.contains(FIELD_ADDCOLMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列添加模式
     */
    @JsonIgnore
    public void resetAddColMode(){
        this.reset(FIELD_ADDCOLMODE);
    }

    /**
     * 设置 列添加模式，详细说明：{@link #FIELD_ADDCOLMODE}
     * <P>
     * 等同 {@link #setAddColMode}
     * @param addColMode
     */
    @JsonIgnore
    public PSSysBDTableDE addcolmode(Integer addColMode){
        this.setAddColMode(addColMode);
        return this;
    }

     /**
     * 设置 列添加模式，详细说明：{@link #FIELD_ADDCOLMODE}
     * <P>
     * 等同 {@link #setAddColMode}
     * @param addColMode
     */
    @JsonIgnore
    public PSSysBDTableDE addcolmode(net.ibizsys.psmodel.core.util.PSModelEnums.BDTableColMode addColMode){
        if(addColMode == null){
            this.setAddColMode(null);
        }
        else{
            this.setAddColMode(addColMode.value);
        }
        return this;
    }

    /**
     * <B>COLFILTER</B>&nbsp;列过滤条件，指定大数据表实体的列名过滤条件，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_COLFILTER = "colfilter";

    /**
     * 设置 列过滤条件，详细说明：{@link #FIELD_COLFILTER}
     * 
     * @param colFilter
     * 
     */
    @JsonProperty(FIELD_COLFILTER)
    public void setColFilter(String colFilter){
        this.set(FIELD_COLFILTER, colFilter);
    }
    
    /**
     * 获取 列过滤条件  
     * @return
     */
    @JsonIgnore
    public String getColFilter(){
        Object objValue = this.get(FIELD_COLFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 列过滤条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColFilterDirty(){
        if(this.contains(FIELD_COLFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列过滤条件
     */
    @JsonIgnore
    public void resetColFilter(){
        this.reset(FIELD_COLFILTER);
    }

    /**
     * 设置 列过滤条件，详细说明：{@link #FIELD_COLFILTER}
     * <P>
     * 等同 {@link #setColFilter}
     * @param colFilter
     */
    @JsonIgnore
    public PSSysBDTableDE colfilter(String colFilter){
        this.setColFilter(colFilter);
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
    public PSSysBDTableDE createdate(String createDate){
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
    public PSSysBDTableDE createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;实体类型，指定大数据表实体的类型，未定义时为【默认实体】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEBDTableType} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 实体类型，详细说明：{@link #FIELD_DEFAULTFLAG}
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 实体类型  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 实体类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体类型
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 实体类型，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysBDTableDE defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 实体类型，详细说明：{@link #FIELD_DEFAULTFLAG}
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSSysBDTableDE defaultflag(net.ibizsys.psmodel.core.util.PSModelEnums.DEBDTableType defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag.value);
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
    public PSSysBDTableDE memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定大数据表实体引用的实体对象
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
    public PSSysBDTableDE psdeid(String pSDEId){
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
    public PSSysBDTableDE psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDENAME</B>&nbsp;实体，指定大数据表实体引用的实体对象
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
    public PSSysBDTableDE psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSSYSBDCOLSETID</B>&nbsp;默认列族，指定大数据表实体默认使用的列族对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDColSet} 
     */
    public final static String FIELD_PSSYSBDCOLSETID = "pssysbdcolsetid";

    /**
     * 设置 默认列族，详细说明：{@link #FIELD_PSSYSBDCOLSETID}
     * 
     * @param pSSysBDColSetId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLSETID)
    public void setPSSysBDColSetId(String pSSysBDColSetId){
        this.set(FIELD_PSSYSBDCOLSETID, pSSysBDColSetId);
    }
    
    /**
     * 获取 默认列族  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDColSetId(){
        Object objValue = this.get(FIELD_PSSYSBDCOLSETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认列族 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDColSetIdDirty(){
        if(this.contains(FIELD_PSSYSBDCOLSETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认列族
     */
    @JsonIgnore
    public void resetPSSysBDColSetId(){
        this.reset(FIELD_PSSYSBDCOLSETID);
    }

    /**
     * 设置 默认列族，详细说明：{@link #FIELD_PSSYSBDCOLSETID}
     * <P>
     * 等同 {@link #setPSSysBDColSetId}
     * @param pSSysBDColSetId
     */
    @JsonIgnore
    public PSSysBDTableDE pssysbdcolsetid(String pSSysBDColSetId){
        this.setPSSysBDColSetId(pSSysBDColSetId);
        return this;
    }

    /**
     * 设置 默认列族，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDColSetId}
     * @param pSSysBDColSet 引用对象
     */
    @JsonIgnore
    public PSSysBDTableDE pssysbdcolsetid(PSSysBDColSet pSSysBDColSet){
        if(pSSysBDColSet == null){
            this.setPSSysBDColSetId(null);
            this.setPSSysBDColSetName(null);
        }
        else{
            this.setPSSysBDColSetId(pSSysBDColSet.getPSSysBDColSetId());
            this.setPSSysBDColSetName(pSSysBDColSet.getPSSysBDColSetName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDCOLSETNAME</B>&nbsp;默认列族，指定大数据表实体默认使用的列族对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDCOLSETID}
     */
    public final static String FIELD_PSSYSBDCOLSETNAME = "pssysbdcolsetname";

    /**
     * 设置 默认列族，详细说明：{@link #FIELD_PSSYSBDCOLSETNAME}
     * 
     * @param pSSysBDColSetName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDCOLSETNAME)
    public void setPSSysBDColSetName(String pSSysBDColSetName){
        this.set(FIELD_PSSYSBDCOLSETNAME, pSSysBDColSetName);
    }
    
    /**
     * 获取 默认列族  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDColSetName(){
        Object objValue = this.get(FIELD_PSSYSBDCOLSETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认列族 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDColSetNameDirty(){
        if(this.contains(FIELD_PSSYSBDCOLSETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认列族
     */
    @JsonIgnore
    public void resetPSSysBDColSetName(){
        this.reset(FIELD_PSSYSBDCOLSETNAME);
    }

    /**
     * 设置 默认列族，详细说明：{@link #FIELD_PSSYSBDCOLSETNAME}
     * <P>
     * 等同 {@link #setPSSysBDColSetName}
     * @param pSSysBDColSetName
     */
    @JsonIgnore
    public PSSysBDTableDE pssysbdcolsetname(String pSSysBDColSetName){
        this.setPSSysBDColSetName(pSSysBDColSetName);
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMEID</B>&nbsp;大数据体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDTABLEID}
     */
    public final static String FIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";

    /**
     * 设置 大数据体系
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
     * 设置 大数据体系
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDSchemeId
     */
    @JsonIgnore
    public PSSysBDTableDE pssysbdschemeid(String pSSysBDSchemeId){
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEDEID</B>&nbsp;大数据表实体关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBDTABLEDEID = "pssysbdtabledeid";

    /**
     * 设置 大数据表实体关系标识
     * 
     * @param pSSysBDTableDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEDEID)
    public void setPSSysBDTableDEId(String pSSysBDTableDEId){
        this.set(FIELD_PSSYSBDTABLEDEID, pSSysBDTableDEId);
    }
    
    /**
     * 获取 大数据表实体关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableDEId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表实体关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableDEIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表实体关系标识
     */
    @JsonIgnore
    public void resetPSSysBDTableDEId(){
        this.reset(FIELD_PSSYSBDTABLEDEID);
    }

    /**
     * 设置 大数据表实体关系标识
     * <P>
     * 等同 {@link #setPSSysBDTableDEId}
     * @param pSSysBDTableDEId
     */
    @JsonIgnore
    public PSSysBDTableDE pssysbdtabledeid(String pSSysBDTableDEId){
        this.setPSSysBDTableDEId(pSSysBDTableDEId);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEDENAME</B>&nbsp;大数据表实体名称，指定大数据表实体的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSBDTABLEDENAME = "pssysbdtabledename";

    /**
     * 设置 大数据表实体名称，详细说明：{@link #FIELD_PSSYSBDTABLEDENAME}
     * 
     * @param pSSysBDTableDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEDENAME)
    public void setPSSysBDTableDEName(String pSSysBDTableDEName){
        this.set(FIELD_PSSYSBDTABLEDENAME, pSSysBDTableDEName);
    }
    
    /**
     * 获取 大数据表实体名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableDEName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据表实体名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableDENameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据表实体名称
     */
    @JsonIgnore
    public void resetPSSysBDTableDEName(){
        this.reset(FIELD_PSSYSBDTABLEDENAME);
    }

    /**
     * 设置 大数据表实体名称，详细说明：{@link #FIELD_PSSYSBDTABLEDENAME}
     * <P>
     * 等同 {@link #setPSSysBDTableDEName}
     * @param pSSysBDTableDEName
     */
    @JsonIgnore
    public PSSysBDTableDE pssysbdtabledename(String pSSysBDTableDEName){
        this.setPSSysBDTableDEName(pSSysBDTableDEName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysBDTableDEName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysBDTableDEName(strName);
    }

    @JsonIgnore
    public PSSysBDTableDE name(String strName){
        this.setPSSysBDTableDEName(strName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据表，指定大数据表实体所属的大数据表对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDTable} 
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
    public PSSysBDTableDE pssysbdtableid(String pSSysBDTableId){
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
    public PSSysBDTableDE pssysbdtableid(PSSysBDTable pSSysBDTable){
        if(pSSysBDTable == null){
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        }
        else{
            this.setPSSysBDSchemeId(pSSysBDTable.getPSSysBDSchemeId());
            this.setPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据表，指定大数据表实体所属的大数据表对象
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
    public PSSysBDTableDE pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    /**
     * <B>ROWKEYFORMAT</B>&nbsp;行键值格式，指定大数据表实体行键值的格式化串
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ROWKEYFORMAT = "rowkeyformat";

    /**
     * 设置 行键值格式，详细说明：{@link #FIELD_ROWKEYFORMAT}
     * 
     * @param rowKeyFormat
     * 
     */
    @JsonProperty(FIELD_ROWKEYFORMAT)
    public void setRowKeyFormat(String rowKeyFormat){
        this.set(FIELD_ROWKEYFORMAT, rowKeyFormat);
    }
    
    /**
     * 获取 行键值格式  
     * @return
     */
    @JsonIgnore
    public String getRowKeyFormat(){
        Object objValue = this.get(FIELD_ROWKEYFORMAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行键值格式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRowKeyFormatDirty(){
        if(this.contains(FIELD_ROWKEYFORMAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行键值格式
     */
    @JsonIgnore
    public void resetRowKeyFormat(){
        this.reset(FIELD_ROWKEYFORMAT);
    }

    /**
     * 设置 行键值格式，详细说明：{@link #FIELD_ROWKEYFORMAT}
     * <P>
     * 等同 {@link #setRowKeyFormat}
     * @param rowKeyFormat
     */
    @JsonIgnore
    public PSSysBDTableDE rowkeyformat(String rowKeyFormat){
        this.setRowKeyFormat(rowKeyFormat);
        return this;
    }

    /**
     * <B>ROWKEYPARAMS</B>&nbsp;行键值格式参数，指定大数据表实体行键值的格式化参数，多值使用【;】分隔
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_ROWKEYPARAMS = "rowkeyparams";

    /**
     * 设置 行键值格式参数，详细说明：{@link #FIELD_ROWKEYPARAMS}
     * 
     * @param rowKeyParams
     * 
     */
    @JsonProperty(FIELD_ROWKEYPARAMS)
    public void setRowKeyParams(String rowKeyParams){
        this.set(FIELD_ROWKEYPARAMS, rowKeyParams);
    }
    
    /**
     * 获取 行键值格式参数  
     * @return
     */
    @JsonIgnore
    public String getRowKeyParams(){
        Object objValue = this.get(FIELD_ROWKEYPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 行键值格式参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRowKeyParamsDirty(){
        if(this.contains(FIELD_ROWKEYPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 行键值格式参数
     */
    @JsonIgnore
    public void resetRowKeyParams(){
        this.reset(FIELD_ROWKEYPARAMS);
    }

    /**
     * 设置 行键值格式参数，详细说明：{@link #FIELD_ROWKEYPARAMS}
     * <P>
     * 等同 {@link #setRowKeyParams}
     * @param rowKeyParams
     */
    @JsonIgnore
    public PSSysBDTableDE rowkeyparams(String rowKeyParams){
        this.setRowKeyParams(rowKeyParams);
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
    public PSSysBDTableDE updatedate(String updateDate){
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
    public PSSysBDTableDE updateman(String updateMan){
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
    public PSSysBDTableDE usercat(String userCat){
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
    public PSSysBDTableDE usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysBDTableDE usertag(String userTag){
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
    public PSSysBDTableDE usertag2(String userTag2){
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
    public PSSysBDTableDE usertag3(String userTag3){
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
    public PSSysBDTableDE usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysBDTableDEId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysBDTableDEId(strValue);
    }

    @JsonIgnore
    public PSSysBDTableDE id(String strValue){
        this.setPSSysBDTableDEId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysBDTableDE){
            PSSysBDTableDE model = (PSSysBDTableDE)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
