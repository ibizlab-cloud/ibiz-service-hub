package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEDBTABLE</B>实体数据库表 模型传输对象
 * <P>
 * 实体的数据表模型，定义实体使用的数据库表，包括数据列的引用模式
 */
public class PSDEDBTable extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDBTable(){
    }      

    /**
     * <B>COLINHERITMODE</B>&nbsp;列继承模式，指定实体数据表的列继承模式，未指定时为【忽略继承指定列】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TableColInheritMode} 
     */
    public final static String FIELD_COLINHERITMODE = "colinheritmode";

    /**
     * 设置 列继承模式，详细说明：{@link #FIELD_COLINHERITMODE}
     * 
     * @param colInheritMode
     * 
     */
    @JsonProperty(FIELD_COLINHERITMODE)
    public void setColInheritMode(Integer colInheritMode){
        this.set(FIELD_COLINHERITMODE, colInheritMode);
    }
    
    /**
     * 获取 列继承模式  
     * @return
     */
    @JsonIgnore
    public Integer getColInheritMode(){
        Object objValue = this.get(FIELD_COLINHERITMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 列继承模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColInheritModeDirty(){
        if(this.contains(FIELD_COLINHERITMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 列继承模式
     */
    @JsonIgnore
    public void resetColInheritMode(){
        this.reset(FIELD_COLINHERITMODE);
    }

    /**
     * 设置 列继承模式，详细说明：{@link #FIELD_COLINHERITMODE}
     * <P>
     * 等同 {@link #setColInheritMode}
     * @param colInheritMode
     */
    @JsonIgnore
    public PSDEDBTable colinheritmode(Integer colInheritMode){
        this.setColInheritMode(colInheritMode);
        return this;
    }

     /**
     * 设置 列继承模式，详细说明：{@link #FIELD_COLINHERITMODE}
     * <P>
     * 等同 {@link #setColInheritMode}
     * @param colInheritMode
     */
    @JsonIgnore
    public PSDEDBTable colinheritmode(net.ibizsys.psmodel.core.util.PSModelEnums.TableColInheritMode colInheritMode){
        if(colInheritMode == null){
            this.setColInheritMode(null);
        }
        else{
            this.setColInheritMode(colInheritMode.value);
        }
        return this;
    }

    /**
     * <B>COLUMNS</B>&nbsp;数据列集合，指定实体数据表列继承操作的列集合，使用【;】分隔
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_COLUMNS = "columns";

    /**
     * 设置 数据列集合，详细说明：{@link #FIELD_COLUMNS}
     * 
     * @param columns
     * 
     */
    @JsonProperty(FIELD_COLUMNS)
    public void setColumns(String columns){
        this.set(FIELD_COLUMNS, columns);
    }
    
    /**
     * 获取 数据列集合  
     * @return
     */
    @JsonIgnore
    public String getColumns(){
        Object objValue = this.get(FIELD_COLUMNS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据列集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColumnsDirty(){
        if(this.contains(FIELD_COLUMNS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据列集合
     */
    @JsonIgnore
    public void resetColumns(){
        this.reset(FIELD_COLUMNS);
    }

    /**
     * 设置 数据列集合，详细说明：{@link #FIELD_COLUMNS}
     * <P>
     * 等同 {@link #setColumns}
     * @param columns
     */
    @JsonIgnore
    public PSDEDBTable columns(String columns){
        this.setColumns(columns);
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
    public PSDEDBTable createdate(String createDate){
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
    public PSDEDBTable createman(String createMan){
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
    public PSDEDBTable memo(String memo){
        this.setMemo(memo);
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
    public PSDEDBTable ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSDEDBTable psdeid(String pSDEId){
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
    public PSDEDBTable psdeid(PSDataEntity pSDataEntity){
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
    public PSDEDBTable psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEDBTABLEID</B>&nbsp;实体数据库表标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDBTABLEID = "psdedbtableid";

    /**
     * 设置 实体数据库表标识
     * 
     * @param pSDEDBTableId
     * 
     */
    @JsonProperty(FIELD_PSDEDBTABLEID)
    public void setPSDEDBTableId(String pSDEDBTableId){
        this.set(FIELD_PSDEDBTABLEID, pSDEDBTableId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdetableid", pSDEDBTableId);
    }
    
    /**
     * 获取 实体数据库表标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBTableId(){
        Object objValue = this.get(FIELD_PSDEDBTABLEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdetableid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库表标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBTableIdDirty(){
        if(this.contains(FIELD_PSDEDBTABLEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdetableid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库表标识
     */
    @JsonIgnore
    public void resetPSDEDBTableId(){
        this.reset(FIELD_PSDEDBTABLEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdetableid");
    }

    /**
     * 设置 实体数据库表标识
     * <P>
     * 等同 {@link #setPSDEDBTableId}
     * @param pSDEDBTableId
     */
    @JsonIgnore
    public PSDEDBTable psdedbtableid(String pSDEDBTableId){
        this.setPSDEDBTableId(pSDEDBTableId);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDETableId(){
        return this.getPSDEDBTableId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSDETableId(String pSDETableId){
        this.setPSDEDBTableId(pSDETableId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDETableIdDirty(){
        return this.isPSDEDBTableIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDETableId(){
        this.resetPSDEDBTableId();
    }

    /**
     * <B>PSDEDBTABLENAME</B>&nbsp;名称
     * <P>
     * 字符串：最大长度 200，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSDEDBTABLENAME = "psdedbtablename";

    /**
     * 设置 名称
     * 
     * @param pSDEDBTableName
     * 
     */
    @JsonProperty(FIELD_PSDEDBTABLENAME)
    public void setPSDEDBTableName(String pSDEDBTableName){
        this.set(FIELD_PSDEDBTABLENAME, pSDEDBTableName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psdetablename", pSDEDBTableName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBTableName(){
        Object objValue = this.get(FIELD_PSDEDBTABLENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psdetablename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBTableNameDirty(){
        if(this.contains(FIELD_PSDEDBTABLENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psdetablename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSDEDBTableName(){
        this.reset(FIELD_PSDEDBTABLENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psdetablename");
    }

    /**
     * 设置 名称
     * <P>
     * 等同 {@link #setPSDEDBTableName}
     * @param pSDEDBTableName
     */
    @JsonIgnore
    public PSDEDBTable psdedbtablename(String pSDEDBTableName){
        this.setPSDEDBTableName(pSDEDBTableName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSDETableName(){
        return this.getPSDEDBTableName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSDETableName(String pSDETableName){
        this.setPSDEDBTableName(pSDETableName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSDETableNameDirty(){
        return this.isPSDEDBTableNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSDETableName(){
        this.resetPSDEDBTableName();
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDBTableName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDBTableName(strName);
    }

    @JsonIgnore
    public PSDEDBTable name(String strName){
        this.setPSDEDBTableName(strName);
        return this;
    }

    /**
     * <B>PSSYSDBTABLEID</B>&nbsp;数据库表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBTable} 
     */
    public final static String FIELD_PSSYSDBTABLEID = "pssysdbtableid";

    /**
     * 设置 数据库表
     * 
     * @param pSSysDBTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLEID)
    public void setPSSysDBTableId(String pSSysDBTableId){
        this.set(FIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }
    
    /**
     * 获取 数据库表  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBTableId(){
        Object objValue = this.get(FIELD_PSSYSDBTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBTableIdDirty(){
        if(this.contains(FIELD_PSSYSDBTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库表
     */
    @JsonIgnore
    public void resetPSSysDBTableId(){
        this.reset(FIELD_PSSYSDBTABLEID);
    }

    /**
     * 设置 数据库表
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTableId
     */
    @JsonIgnore
    public PSDEDBTable pssysdbtableid(String pSSysDBTableId){
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    /**
     * 设置 数据库表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTable 引用对象
     */
    @JsonIgnore
    public PSDEDBTable pssysdbtableid(PSSysDBTable pSSysDBTable){
        if(pSSysDBTable == null){
            this.setPSSysDBTableId(null);
            this.setPSSysDBTableName(null);
        }
        else{
            this.setPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBTABLENAME</B>&nbsp;数据库表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBTABLEID}
     */
    public final static String FIELD_PSSYSDBTABLENAME = "pssysdbtablename";

    /**
     * 设置 数据库表
     * 
     * @param pSSysDBTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLENAME)
    public void setPSSysDBTableName(String pSSysDBTableName){
        this.set(FIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }
    
    /**
     * 获取 数据库表  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBTableName(){
        Object objValue = this.get(FIELD_PSSYSDBTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBTableNameDirty(){
        if(this.contains(FIELD_PSSYSDBTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库表
     */
    @JsonIgnore
    public void resetPSSysDBTableName(){
        this.reset(FIELD_PSSYSDBTABLENAME);
    }

    /**
     * 设置 数据库表
     * <P>
     * 等同 {@link #setPSSysDBTableName}
     * @param pSSysDBTableName
     */
    @JsonIgnore
    public PSDEDBTable pssysdbtablename(String pSSysDBTableName){
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    /**
     * <B>TABLETYPE</B>&nbsp;表类型，指定实体数据表的类型，目前仅支持【主表】一种
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEDBTableType} 
     */
    public final static String FIELD_TABLETYPE = "tabletype";

    /**
     * 设置 表类型，详细说明：{@link #FIELD_TABLETYPE}
     * 
     * @param tableType
     * 
     */
    @JsonProperty(FIELD_TABLETYPE)
    public void setTableType(String tableType){
        this.set(FIELD_TABLETYPE, tableType);
    }
    
    /**
     * 获取 表类型  
     * @return
     */
    @JsonIgnore
    public String getTableType(){
        Object objValue = this.get(FIELD_TABLETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTableTypeDirty(){
        if(this.contains(FIELD_TABLETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表类型
     */
    @JsonIgnore
    public void resetTableType(){
        this.reset(FIELD_TABLETYPE);
    }

    /**
     * 设置 表类型，详细说明：{@link #FIELD_TABLETYPE}
     * <P>
     * 等同 {@link #setTableType}
     * @param tableType
     */
    @JsonIgnore
    public PSDEDBTable tabletype(String tableType){
        this.setTableType(tableType);
        return this;
    }

     /**
     * 设置 表类型，详细说明：{@link #FIELD_TABLETYPE}
     * <P>
     * 等同 {@link #setTableType}
     * @param tableType
     */
    @JsonIgnore
    public PSDEDBTable tabletype(net.ibizsys.psmodel.core.util.PSModelEnums.DEDBTableType tableType){
        if(tableType == null){
            this.setTableType(null);
        }
        else{
            this.setTableType(tableType.value);
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
    public PSDEDBTable updatedate(String updateDate){
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
    public PSDEDBTable updateman(String updateMan){
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
    public PSDEDBTable usercat(String userCat){
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
    public PSDEDBTable usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEDBTable usertag(String userTag){
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
    public PSDEDBTable usertag2(String userTag2){
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
    public PSDEDBTable usertag3(String userTag3){
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
    public PSDEDBTable usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDBTableId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDBTableId(strValue);
    }

    @JsonIgnore
    public PSDEDBTable id(String strValue){
        this.setPSDEDBTableId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDBTable){
            PSDEDBTable model = (PSDEDBTable)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
