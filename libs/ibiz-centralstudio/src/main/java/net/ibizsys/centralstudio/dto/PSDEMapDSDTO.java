package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEMAPDS</B>实体映射数据集合 模型传输对象
 * <P>
 * 实体功能映射的数据集合映射模型，定义当前实体与目标实体的数据集合关系
 */
public class PSDEMapDSDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEMapDSDTO(){
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
    public PSDEMapDSDTO createdate(Timestamp createDate){
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
    public PSDEMapDSDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DSTPSDEDATASETID</B>&nbsp;目标源数据集合，指定映射到的目标数据集合对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_DSTPSDEDATASETID = "dstpsdedatasetid";

    /**
     * 设置 目标源数据集合，详细说明：{@link #FIELD_DSTPSDEDATASETID}
     * 
     * @param dstPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASETID)
    public void setDstPSDEDataSetId(String dstPSDEDataSetId){
        this.set(FIELD_DSTPSDEDATASETID, dstPSDEDataSetId);
    }
    
    /**
     * 获取 目标源数据集合  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataSetId(){
        Object objValue = this.get(FIELD_DSTPSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标源数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataSetIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标源数据集合
     */
    @JsonIgnore
    public void resetDstPSDEDataSetId(){
        this.reset(FIELD_DSTPSDEDATASETID);
    }

    /**
     * 设置 目标源数据集合，详细说明：{@link #FIELD_DSTPSDEDATASETID}
     * <P>
     * 等同 {@link #setDstPSDEDataSetId}
     * @param dstPSDEDataSetId
     */
    @JsonIgnore
    public PSDEMapDSDTO dstpsdedatasetid(String dstPSDEDataSetId){
        this.setDstPSDEDataSetId(dstPSDEDataSetId);
        return this;
    }

    /**
     * 设置 目标源数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEMapDSDTO dstpsdedatasetid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setDstPSDEDataSetId(null);
            this.setDstPSDEDataSetName(null);
        }
        else{
            this.setDstPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setDstPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATASETNAME</B>&nbsp;目标数据集合，指定映射到的目标数据集合对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATASETID}
     */
    public final static String FIELD_DSTPSDEDATASETNAME = "dstpsdedatasetname";

    /**
     * 设置 目标数据集合，详细说明：{@link #FIELD_DSTPSDEDATASETNAME}
     * 
     * @param dstPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASETNAME)
    public void setDstPSDEDataSetName(String dstPSDEDataSetName){
        this.set(FIELD_DSTPSDEDATASETNAME, dstPSDEDataSetName);
    }
    
    /**
     * 获取 目标数据集合  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataSetName(){
        Object objValue = this.get(FIELD_DSTPSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataSetNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据集合
     */
    @JsonIgnore
    public void resetDstPSDEDataSetName(){
        this.reset(FIELD_DSTPSDEDATASETNAME);
    }

    /**
     * 设置 目标数据集合，详细说明：{@link #FIELD_DSTPSDEDATASETNAME}
     * <P>
     * 等同 {@link #setDstPSDEDataSetName}
     * @param dstPSDEDataSetName
     */
    @JsonIgnore
    public PSDEMapDSDTO dstpsdedatasetname(String dstPSDEDataSetName){
        this.setDstPSDEDataSetName(dstPSDEDataSetName);
        return this;
    }

    /**
     * <B>DSTPSDEID</B>&nbsp;目标实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAPID}
     */
    public final static String FIELD_DSTPSDEID = "dstpsdeid";

    /**
     * 设置 目标实体
     * 
     * @param dstPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEID)
    public void setDstPSDEId(String dstPSDEId){
        this.set(FIELD_DSTPSDEID, dstPSDEId);
    }
    
    /**
     * 获取 目标实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEId(){
        Object objValue = this.get(FIELD_DSTPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEIdDirty(){
        if(this.contains(FIELD_DSTPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体
     */
    @JsonIgnore
    public void resetDstPSDEId(){
        this.reset(FIELD_DSTPSDEID);
    }

    /**
     * 设置 目标实体
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param dstPSDEId
     */
    @JsonIgnore
    public PSDEMapDSDTO dstpsdeid(String dstPSDEId){
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    /**
     * <B>MAPMODE</B>&nbsp;映射模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_MAPMODE = "mapmode";

    /**
     * 设置 映射模式
     * 
     * @param mapMode
     * 
     */
    @JsonProperty(FIELD_MAPMODE)
    public void setMapMode(String mapMode){
        this.set(FIELD_MAPMODE, mapMode);
    }
    
    /**
     * 获取 映射模式  
     * @return
     */
    @JsonIgnore
    public String getMapMode(){
        Object objValue = this.get(FIELD_MAPMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 映射模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMapModeDirty(){
        if(this.contains(FIELD_MAPMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 映射模式
     */
    @JsonIgnore
    public void resetMapMode(){
        this.reset(FIELD_MAPMODE);
    }

    /**
     * 设置 映射模式
     * <P>
     * 等同 {@link #setMapMode}
     * @param mapMode
     */
    @JsonIgnore
    public PSDEMapDSDTO mapmode(String mapMode){
        this.setMapMode(mapMode);
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
    public PSDEMapDSDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PROPERTYMAP</B>&nbsp;参数映射
     */
    public final static String FIELD_PROPERTYMAP = "propertymap";

    /**
     * 设置 参数映射
     * 
     * @param propertyMap
     * 
     */
    @JsonProperty(FIELD_PROPERTYMAP)
    public void setPropertyMap(String propertyMap){
        this.set(FIELD_PROPERTYMAP, propertyMap);
    }
    
    /**
     * 获取 参数映射  
     * @return
     */
    @JsonIgnore
    public String getPropertyMap(){
        Object objValue = this.get(FIELD_PROPERTYMAP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPropertyMapDirty(){
        if(this.contains(FIELD_PROPERTYMAP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数映射
     */
    @JsonIgnore
    public void resetPropertyMap(){
        this.reset(FIELD_PROPERTYMAP);
    }

    /**
     * 设置 参数映射
     * <P>
     * 等同 {@link #setPropertyMap}
     * @param propertyMap
     */
    @JsonIgnore
    public PSDEMapDSDTO propertymap(String propertyMap){
        this.setPropertyMap(propertyMap);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;源数据集合，指定源数据集合对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 源数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 源数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 源数据集合，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEMapDSDTO psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 源数据集合，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEMapDSDTO psdedatasetid(PSDEDataSetDTO pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;源数据集合，指定源数据集合对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 源数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 源数据集合  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源数据集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源数据集合
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 源数据集合，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEMapDSDTO psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;源实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAPID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 源实体
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 源实体  
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
     * 判断 源实体 是否指定值，包括空值
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
     * 重置 源实体
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 源实体
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEMapDSDTO psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEMAPDSID</B>&nbsp;实体映射数据集合标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEMAPDSID = "psdemapdsid";

    /**
     * 设置 实体映射数据集合标识
     * 
     * @param pSDEMapDSId
     * 
     */
    @JsonProperty(FIELD_PSDEMAPDSID)
    public void setPSDEMapDSId(String pSDEMapDSId){
        this.set(FIELD_PSDEMAPDSID, pSDEMapDSId);
    }
    
    /**
     * 获取 实体映射数据集合标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapDSId(){
        Object objValue = this.get(FIELD_PSDEMAPDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射数据集合标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapDSIdDirty(){
        if(this.contains(FIELD_PSDEMAPDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射数据集合标识
     */
    @JsonIgnore
    public void resetPSDEMapDSId(){
        this.reset(FIELD_PSDEMAPDSID);
    }

    /**
     * 设置 实体映射数据集合标识
     * <P>
     * 等同 {@link #setPSDEMapDSId}
     * @param pSDEMapDSId
     */
    @JsonIgnore
    public PSDEMapDSDTO psdemapdsid(String pSDEMapDSId){
        this.setPSDEMapDSId(pSDEMapDSId);
        return this;
    }

    /**
     * <B>PSDEMAPDSNAME</B>&nbsp;实体映射数据集合名称，指定实体映射数据集合的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEMAPDSNAME = "psdemapdsname";

    /**
     * 设置 实体映射数据集合名称，详细说明：{@link #FIELD_PSDEMAPDSNAME}
     * 
     * @param pSDEMapDSName
     * 
     */
    @JsonProperty(FIELD_PSDEMAPDSNAME)
    public void setPSDEMapDSName(String pSDEMapDSName){
        this.set(FIELD_PSDEMAPDSNAME, pSDEMapDSName);
    }
    
    /**
     * 获取 实体映射数据集合名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEMapDSName(){
        Object objValue = this.get(FIELD_PSDEMAPDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体映射数据集合名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMapDSNameDirty(){
        if(this.contains(FIELD_PSDEMAPDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体映射数据集合名称
     */
    @JsonIgnore
    public void resetPSDEMapDSName(){
        this.reset(FIELD_PSDEMAPDSNAME);
    }

    /**
     * 设置 实体映射数据集合名称，详细说明：{@link #FIELD_PSDEMAPDSNAME}
     * <P>
     * 等同 {@link #setPSDEMapDSName}
     * @param pSDEMapDSName
     */
    @JsonIgnore
    public PSDEMapDSDTO psdemapdsname(String pSDEMapDSName){
        this.setPSDEMapDSName(pSDEMapDSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEMapDSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEMapDSName(strName);
    }

    @JsonIgnore
    public PSDEMapDSDTO name(String strName){
        this.setPSDEMapDSName(strName);
        return this;
    }

    /**
     * <B>PSDEMAPID</B>&nbsp;实体映射，指定数据集合映射所在的实体映射
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMapDTO} 
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
    public PSDEMapDSDTO psdemapid(String pSDEMapId){
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
    public PSDEMapDSDTO psdemapid(PSDEMapDTO pSDEMap){
        if(pSDEMap == null){
            this.setDstPSDEId(null);
            this.setPSDEId(null);
            this.setPSDEMapId(null);
            this.setPSDEMapName(null);
        }
        else{
            this.setDstPSDEId(pSDEMap.getDSTPSDEId());
            this.setPSDEId(pSDEMap.getPSDEId());
            this.setPSDEMapId(pSDEMap.getPSDEMapId());
            this.setPSDEMapName(pSDEMap.getPSDEMapName());
        }
        return this;
    }

    /**
     * <B>PSDEMAPNAME</B>&nbsp;实体映射，指定数据集合映射所在的实体映射
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
    public PSDEMapDSDTO psdemapname(String pSDEMapName){
        this.setPSDEMapName(pSDEMapName);
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
    public PSDEMapDSDTO updatedate(Timestamp updateDate){
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
    public PSDEMapDSDTO updateman(String updateMan){
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
    public PSDEMapDSDTO usercat(String userCat){
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
    public PSDEMapDSDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEMapDSDTO usertag(String userTag){
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
    public PSDEMapDSDTO usertag2(String userTag2){
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
    public PSDEMapDSDTO usertag3(String userTag3){
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
    public PSDEMapDSDTO usertag4(String userTag4){
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
    public PSDEMapDSDTO validflag(Integer validFlag){
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
    public PSDEMapDSDTO validflag(Boolean validFlag){
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
        return this.getPSDEMapDSId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEMapDSId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEMapDSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEMapDSId(strValue);
    }

    @JsonIgnore
    public PSDEMapDSDTO id(String strValue){
        this.setPSDEMapDSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEMapDSDTO){
            PSDEMapDSDTO dto = (PSDEMapDSDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
