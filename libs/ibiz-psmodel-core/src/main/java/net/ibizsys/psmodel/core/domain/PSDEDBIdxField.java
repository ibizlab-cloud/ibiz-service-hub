package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEDBIDXFIELD</B>实体数据库索引属性 模型传输对象
 * <P>
 * 实体数据库索引的属性模型，将实体属性加入到数据库索引对象中
 */
public class PSDEDBIdxField extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEDBIdxField(){
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
    public PSDEDBIdxField createdate(String createDate){
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
    public PSDEDBIdxField createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>INCMODE</B>&nbsp;包含属性，指定相关属性是作为索引数据附加，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INCMODE = "incmode";

    /**
     * 设置 包含属性，详细说明：{@link #FIELD_INCMODE}
     * 
     * @param incMode
     * 
     */
    @JsonProperty(FIELD_INCMODE)
    public void setIncMode(Integer incMode){
        this.set(FIELD_INCMODE, incMode);
    }
    
    /**
     * 获取 包含属性  
     * @return
     */
    @JsonIgnore
    public Integer getIncMode(){
        Object objValue = this.get(FIELD_INCMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 包含属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIncModeDirty(){
        if(this.contains(FIELD_INCMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 包含属性
     */
    @JsonIgnore
    public void resetIncMode(){
        this.reset(FIELD_INCMODE);
    }

    /**
     * 设置 包含属性，详细说明：{@link #FIELD_INCMODE}
     * <P>
     * 等同 {@link #setIncMode}
     * @param incMode
     */
    @JsonIgnore
    public PSDEDBIdxField incmode(Integer incMode){
        this.setIncMode(incMode);
        return this;
    }

     /**
     * 设置 包含属性，详细说明：{@link #FIELD_INCMODE}
     * <P>
     * 等同 {@link #setIncMode}
     * @param incMode
     */
    @JsonIgnore
    public PSDEDBIdxField incmode(Boolean incMode){
        if(incMode == null){
            this.setIncMode(null);
        }
        else{
            this.setIncMode(incMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>INDEXLENGTH</B>&nbsp;索引长度，指定索引内容的长度，-1为不指定。未定义时为【-1】
     */
    public final static String FIELD_INDEXLENGTH = "indexlength";

    /**
     * 设置 索引长度，详细说明：{@link #FIELD_INDEXLENGTH}
     * 
     * @param indexLength
     * 
     */
    @JsonProperty(FIELD_INDEXLENGTH)
    public void setIndexLength(Integer indexLength){
        this.set(FIELD_INDEXLENGTH, indexLength);
    }
    
    /**
     * 获取 索引长度  
     * @return
     */
    @JsonIgnore
    public Integer getIndexLength(){
        Object objValue = this.get(FIELD_INDEXLENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 索引长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isIndexLengthDirty(){
        if(this.contains(FIELD_INDEXLENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 索引长度
     */
    @JsonIgnore
    public void resetIndexLength(){
        this.reset(FIELD_INDEXLENGTH);
    }

    /**
     * 设置 索引长度，详细说明：{@link #FIELD_INDEXLENGTH}
     * <P>
     * 等同 {@link #setIndexLength}
     * @param indexLength
     */
    @JsonIgnore
    public PSDEDBIdxField indexlength(Integer indexLength){
        this.setIndexLength(indexLength);
        return this;
    }

    /**
     * <B>PSDEDBIDXFIELDID</B>&nbsp;实体数据库索引属性标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEDBIDXFIELDID = "psdedbidxfieldid";

    /**
     * 设置 实体数据库索引属性标识
     * 
     * @param pSDEDBIdxFieldId
     * 
     */
    @JsonProperty(FIELD_PSDEDBIDXFIELDID)
    public void setPSDEDBIdxFieldId(String pSDEDBIdxFieldId){
        this.set(FIELD_PSDEDBIDXFIELDID, pSDEDBIdxFieldId);
    }
    
    /**
     * 获取 实体数据库索引属性标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBIdxFieldId(){
        Object objValue = this.get(FIELD_PSDEDBIDXFIELDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库索引属性标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBIdxFieldIdDirty(){
        if(this.contains(FIELD_PSDEDBIDXFIELDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库索引属性标识
     */
    @JsonIgnore
    public void resetPSDEDBIdxFieldId(){
        this.reset(FIELD_PSDEDBIDXFIELDID);
    }

    /**
     * 设置 实体数据库索引属性标识
     * <P>
     * 等同 {@link #setPSDEDBIdxFieldId}
     * @param pSDEDBIdxFieldId
     */
    @JsonIgnore
    public PSDEDBIdxField psdedbidxfieldid(String pSDEDBIdxFieldId){
        this.setPSDEDBIdxFieldId(pSDEDBIdxFieldId);
        return this;
    }

    /**
     * <B>PSDEDBIDXFIELDNAME</B>&nbsp;索引属性名称，指定索引的属性名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEDBIDXFIELDNAME = "psdedbidxfieldname";

    /**
     * 设置 索引属性名称，详细说明：{@link #FIELD_PSDEDBIDXFIELDNAME}
     * 
     * @param pSDEDBIdxFieldName
     * 
     */
    @JsonProperty(FIELD_PSDEDBIDXFIELDNAME)
    public void setPSDEDBIdxFieldName(String pSDEDBIdxFieldName){
        this.set(FIELD_PSDEDBIDXFIELDNAME, pSDEDBIdxFieldName);
    }
    
    /**
     * 获取 索引属性名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBIdxFieldName(){
        Object objValue = this.get(FIELD_PSDEDBIDXFIELDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 索引属性名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBIdxFieldNameDirty(){
        if(this.contains(FIELD_PSDEDBIDXFIELDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 索引属性名称
     */
    @JsonIgnore
    public void resetPSDEDBIdxFieldName(){
        this.reset(FIELD_PSDEDBIDXFIELDNAME);
    }

    /**
     * 设置 索引属性名称，详细说明：{@link #FIELD_PSDEDBIDXFIELDNAME}
     * <P>
     * 等同 {@link #setPSDEDBIdxFieldName}
     * @param pSDEDBIdxFieldName
     */
    @JsonIgnore
    public PSDEDBIdxField psdedbidxfieldname(String pSDEDBIdxFieldName){
        this.setPSDEDBIdxFieldName(pSDEDBIdxFieldName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEDBIdxFieldName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEDBIdxFieldName(strName);
    }

    @JsonIgnore
    public PSDEDBIdxField name(String strName){
        this.setPSDEDBIdxFieldName(strName);
        return this;
    }

    /**
     * <B>PSDEDBINDEXID</B>&nbsp;实体数据库索引，指定索引属性所在的数据库索引对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDBIndex} 
     */
    public final static String FIELD_PSDEDBINDEXID = "psdedbindexid";

    /**
     * 设置 实体数据库索引，详细说明：{@link #FIELD_PSDEDBINDEXID}
     * 
     * @param pSDEDBIndexId
     * 
     */
    @JsonProperty(FIELD_PSDEDBINDEXID)
    public void setPSDEDBIndexId(String pSDEDBIndexId){
        this.set(FIELD_PSDEDBINDEXID, pSDEDBIndexId);
    }
    
    /**
     * 获取 实体数据库索引  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBIndexId(){
        Object objValue = this.get(FIELD_PSDEDBINDEXID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库索引 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBIndexIdDirty(){
        if(this.contains(FIELD_PSDEDBINDEXID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库索引
     */
    @JsonIgnore
    public void resetPSDEDBIndexId(){
        this.reset(FIELD_PSDEDBINDEXID);
    }

    /**
     * 设置 实体数据库索引，详细说明：{@link #FIELD_PSDEDBINDEXID}
     * <P>
     * 等同 {@link #setPSDEDBIndexId}
     * @param pSDEDBIndexId
     */
    @JsonIgnore
    public PSDEDBIdxField psdedbindexid(String pSDEDBIndexId){
        this.setPSDEDBIndexId(pSDEDBIndexId);
        return this;
    }

    /**
     * 设置 实体数据库索引，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDBIndexId}
     * @param pSDEDBIndex 引用对象
     */
    @JsonIgnore
    public PSDEDBIdxField psdedbindexid(PSDEDBIndex pSDEDBIndex){
        if(pSDEDBIndex == null){
            this.setPSDEDBIndexId(null);
            this.setPSDEDBIndexName(null);
        }
        else{
            this.setPSDEDBIndexId(pSDEDBIndex.getPSDEDBIndexId());
            this.setPSDEDBIndexName(pSDEDBIndex.getPSDEDBIndexName());
        }
        return this;
    }

    /**
     * <B>PSDEDBINDEXNAME</B>&nbsp;实体数据库索引，指定索引属性所在的数据库索引对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDBINDEXID}
     */
    public final static String FIELD_PSDEDBINDEXNAME = "psdedbindexname";

    /**
     * 设置 实体数据库索引，详细说明：{@link #FIELD_PSDEDBINDEXNAME}
     * 
     * @param pSDEDBIndexName
     * 
     */
    @JsonProperty(FIELD_PSDEDBINDEXNAME)
    public void setPSDEDBIndexName(String pSDEDBIndexName){
        this.set(FIELD_PSDEDBINDEXNAME, pSDEDBIndexName);
    }
    
    /**
     * 获取 实体数据库索引  
     * @return
     */
    @JsonIgnore
    public String getPSDEDBIndexName(){
        Object objValue = this.get(FIELD_PSDEDBINDEXNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据库索引 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDBIndexNameDirty(){
        if(this.contains(FIELD_PSDEDBINDEXNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据库索引
     */
    @JsonIgnore
    public void resetPSDEDBIndexName(){
        this.reset(FIELD_PSDEDBINDEXNAME);
    }

    /**
     * 设置 实体数据库索引，详细说明：{@link #FIELD_PSDEDBINDEXNAME}
     * <P>
     * 等同 {@link #setPSDEDBIndexName}
     * @param pSDEDBIndexName
     */
    @JsonIgnore
    public PSDEDBIdxField psdedbindexname(String pSDEDBIndexName){
        this.setPSDEDBIndexName(pSDEDBIndexName);
        return this;
    }

    /**
     * <B>PSDEFID</B>&nbsp;实体属性，指定索引的实体属性对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_PSDEFID = "psdefid";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFID}
     * <P>
     * 等同 {@link #setPSDEFId}
     * @param pSDEFId
     */
    @JsonIgnore
    public PSDEDBIdxField psdefid(String pSDEFId){
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
    public PSDEDBIdxField psdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setPSDEFId(null);
            this.setPSDEFName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEFId(pSDEField.getPSDEFieldId());
            this.setPSDEFName(pSDEField.getPSDEFieldName());
            this.setPSDEId(pSDEField.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEFNAME</B>&nbsp;实体属性，指定索引的实体属性对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
     */
    public final static String FIELD_PSDEFNAME = "psdefname";

    /**
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
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
     * 设置 实体属性，详细说明：{@link #FIELD_PSDEFNAME}
     * <P>
     * 等同 {@link #setPSDEFName}
     * @param pSDEFName
     */
    @JsonIgnore
    public PSDEDBIdxField psdefname(String pSDEFName){
        this.setPSDEFName(pSDEFName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFID}
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
    public PSDEDBIdxField psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>SORTDIR</B>&nbsp;排序方向，指定索引属性的排序方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_SORTDIR = "sortdir";

    /**
     * 设置 排序方向，详细说明：{@link #FIELD_SORTDIR}
     * 
     * @param sortDir
     * 
     */
    @JsonProperty(FIELD_SORTDIR)
    public void setSortDir(String sortDir){
        this.set(FIELD_SORTDIR, sortDir);
    }
    
    /**
     * 获取 排序方向  
     * @return
     */
    @JsonIgnore
    public String getSortDir(){
        Object objValue = this.get(FIELD_SORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSortDirDirty(){
        if(this.contains(FIELD_SORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 排序方向
     */
    @JsonIgnore
    public void resetSortDir(){
        this.reset(FIELD_SORTDIR);
    }

    /**
     * 设置 排序方向，详细说明：{@link #FIELD_SORTDIR}
     * <P>
     * 等同 {@link #setSortDir}
     * @param sortDir
     */
    @JsonIgnore
    public PSDEDBIdxField sortdir(String sortDir){
        this.setSortDir(sortDir);
        return this;
    }

     /**
     * 设置 排序方向，详细说明：{@link #FIELD_SORTDIR}
     * <P>
     * 等同 {@link #setSortDir}
     * @param sortDir
     */
    @JsonIgnore
    public PSDEDBIdxField sortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir sortDir){
        if(sortDir == null){
            this.setSortDir(null);
        }
        else{
            this.setSortDir(sortDir.value);
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
    public PSDEDBIdxField updatedate(String updateDate){
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
    public PSDEDBIdxField updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEDBIdxFieldId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEDBIdxFieldId(strValue);
    }

    @JsonIgnore
    public PSDEDBIdxField id(String strValue){
        this.setPSDEDBIdxFieldId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEDBIdxField){
            PSDEDBIdxField model = (PSDEDBIdxField)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
