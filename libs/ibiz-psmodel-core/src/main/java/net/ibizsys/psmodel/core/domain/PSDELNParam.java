package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELNPARAM</B>实体处理逻辑节点参数 模型传输对象
 * <P>
 * 实体处理逻辑节点参数模型，为处理节点提供动态参数定义能力
 */
public class PSDELNParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDELNParam(){
    }      

    /**
     * <B>AGGMODE</B>&nbsp;聚合模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.AggMode} 
     */
    public final static String FIELD_AGGMODE = "aggmode";

    /**
     * 设置 聚合模式
     * 
     * @param aggMode
     * 
     */
    @JsonProperty(FIELD_AGGMODE)
    public void setAggMode(String aggMode){
        this.set(FIELD_AGGMODE, aggMode);
    }
    
    /**
     * 获取 聚合模式  
     * @return
     */
    @JsonIgnore
    public String getAggMode(){
        Object objValue = this.get(FIELD_AGGMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 聚合模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAggModeDirty(){
        if(this.contains(FIELD_AGGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 聚合模式
     */
    @JsonIgnore
    public void resetAggMode(){
        this.reset(FIELD_AGGMODE);
    }

    /**
     * 设置 聚合模式
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDELNParam aggmode(String aggMode){
        this.setAggMode(aggMode);
        return this;
    }

     /**
     * 设置 聚合模式
     * <P>
     * 等同 {@link #setAggMode}
     * @param aggMode
     */
    @JsonIgnore
    public PSDELNParam aggmode(net.ibizsys.psmodel.core.util.PSModelEnums.AggMode aggMode){
        if(aggMode == null){
            this.setAggMode(null);
        }
        else{
            this.setAggMode(aggMode.value);
        }
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
    public PSDELNParam createdate(String createDate){
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
    public PSDELNParam createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDSTPARAM</B>&nbsp;自定义目标属性，指定目标参数的自定义属性
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CUSTOMDSTPARAM = "customdstparam";

    /**
     * 设置 自定义目标属性，详细说明：{@link #FIELD_CUSTOMDSTPARAM}
     * 
     * @param customDstParam
     * 
     */
    @JsonProperty(FIELD_CUSTOMDSTPARAM)
    public void setCustomDstParam(String customDstParam){
        this.set(FIELD_CUSTOMDSTPARAM, customDstParam);
    }
    
    /**
     * 获取 自定义目标属性  
     * @return
     */
    @JsonIgnore
    public String getCustomDstParam(){
        Object objValue = this.get(FIELD_CUSTOMDSTPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义目标属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomDstParamDirty(){
        if(this.contains(FIELD_CUSTOMDSTPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义目标属性
     */
    @JsonIgnore
    public void resetCustomDstParam(){
        this.reset(FIELD_CUSTOMDSTPARAM);
    }

    /**
     * 设置 自定义目标属性，详细说明：{@link #FIELD_CUSTOMDSTPARAM}
     * <P>
     * 等同 {@link #setCustomDstParam}
     * @param customDstParam
     */
    @JsonIgnore
    public PSDELNParam customdstparam(String customDstParam){
        this.setCustomDstParam(customDstParam);
        return this;
    }

    /**
     * <B>CUSTOMSRCPARAM</B>&nbsp;自定义源属性，指定源参数的自定义属性
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CUSTOMSRCPARAM = "customsrcparam";

    /**
     * 设置 自定义源属性，详细说明：{@link #FIELD_CUSTOMSRCPARAM}
     * 
     * @param customSrcParam
     * 
     */
    @JsonProperty(FIELD_CUSTOMSRCPARAM)
    public void setCustomSrcParam(String customSrcParam){
        this.set(FIELD_CUSTOMSRCPARAM, customSrcParam);
    }
    
    /**
     * 获取 自定义源属性  
     * @return
     */
    @JsonIgnore
    public String getCustomSrcParam(){
        Object objValue = this.get(FIELD_CUSTOMSRCPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义源属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomSrcParamDirty(){
        if(this.contains(FIELD_CUSTOMSRCPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义源属性
     */
    @JsonIgnore
    public void resetCustomSrcParam(){
        this.reset(FIELD_CUSTOMSRCPARAM);
    }

    /**
     * 设置 自定义源属性，详细说明：{@link #FIELD_CUSTOMSRCPARAM}
     * <P>
     * 等同 {@link #setCustomSrcParam}
     * @param customSrcParam
     */
    @JsonIgnore
    public PSDELNParam customsrcparam(String customSrcParam){
        this.setCustomSrcParam(customSrcParam);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;默认值
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 默认值
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 默认值
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSDELNParam defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>DIRECTCODE</B>&nbsp;代码
     */
    public final static String FIELD_DIRECTCODE = "directcode";

    /**
     * 设置 代码
     * 
     * @param directCode
     * 
     */
    @JsonProperty(FIELD_DIRECTCODE)
    public void setDirectCode(String directCode){
        this.set(FIELD_DIRECTCODE, directCode);
    }
    
    /**
     * 获取 代码  
     * @return
     */
    @JsonIgnore
    public String getDirectCode(){
        Object objValue = this.get(FIELD_DIRECTCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDirectCodeDirty(){
        if(this.contains(FIELD_DIRECTCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码
     */
    @JsonIgnore
    public void resetDirectCode(){
        this.reset(FIELD_DIRECTCODE);
    }

    /**
     * 设置 代码
     * <P>
     * 等同 {@link #setDirectCode}
     * @param directCode
     */
    @JsonIgnore
    public PSDELNParam directcode(String directCode){
        this.setDirectCode(directCode);
        return this;
    }

    /**
     * <B>DSTINDEX</B>&nbsp;目标位置
     */
    public final static String FIELD_DSTINDEX = "dstindex";

    /**
     * 设置 目标位置
     * 
     * @param dstIndex
     * 
     */
    @JsonProperty(FIELD_DSTINDEX)
    public void setDstIndex(Integer dstIndex){
        this.set(FIELD_DSTINDEX, dstIndex);
    }
    
    /**
     * 获取 目标位置  
     * @return
     */
    @JsonIgnore
    public Integer getDstIndex(){
        Object objValue = this.get(FIELD_DSTINDEX);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 目标位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstIndexDirty(){
        if(this.contains(FIELD_DSTINDEX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标位置
     */
    @JsonIgnore
    public void resetDstIndex(){
        this.reset(FIELD_DSTINDEX);
    }

    /**
     * 设置 目标位置
     * <P>
     * 等同 {@link #setDstIndex}
     * @param dstIndex
     */
    @JsonIgnore
    public PSDELNParam dstindex(Integer dstIndex){
        this.setDstIndex(dstIndex);
        return this;
    }

    /**
     * <B>DSTPARAMPSDEID</B>&nbsp;目前参数实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDLPARAMID}
     */
    public final static String FIELD_DSTPARAMPSDEID = "dstparampsdeid";

    /**
     * 设置 目前参数实体标识
     * 
     * @param dstParamPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPARAMPSDEID)
    public void setDstParamPSDEId(String dstParamPSDEId){
        this.set(FIELD_DSTPARAMPSDEID, dstParamPSDEId);
    }
    
    /**
     * 获取 目前参数实体标识  
     * @return
     */
    @JsonIgnore
    public String getDstParamPSDEId(){
        Object objValue = this.get(FIELD_DSTPARAMPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目前参数实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstParamPSDEIdDirty(){
        if(this.contains(FIELD_DSTPARAMPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目前参数实体标识
     */
    @JsonIgnore
    public void resetDstParamPSDEId(){
        this.reset(FIELD_DSTPARAMPSDEID);
    }

    /**
     * 设置 目前参数实体标识
     * <P>
     * 等同 {@link #setDstParamPSDEId}
     * @param dstParamPSDEId
     */
    @JsonIgnore
    public PSDELNParam dstparampsdeid(String dstParamPSDEId){
        this.setDstParamPSDEId(dstParamPSDEId);
        return this;
    }

    /**
     * <B>DSTPSDEFID</B>&nbsp;目标属性，指定目标参数的属性，如存在自定义目标参数属性则优先使用自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_DSTPSDEFID = "dstpsdefid";

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFID}
     * 
     * @param dstPSDEFId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFID)
    public void setDstPSDEFId(String dstPSDEFId){
        this.set(FIELD_DSTPSDEFID, dstPSDEFId);
    }
    
    /**
     * 获取 目标属性  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFId(){
        Object objValue = this.get(FIELD_DSTPSDEFID);
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
    public boolean isDstPSDEFIdDirty(){
        if(this.contains(FIELD_DSTPSDEFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性
     */
    @JsonIgnore
    public void resetDstPSDEFId(){
        this.reset(FIELD_DSTPSDEFID);
    }

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFID}
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param dstPSDEFId
     */
    @JsonIgnore
    public PSDELNParam dstpsdefid(String dstPSDEFId){
        this.setDstPSDEFId(dstPSDEFId);
        return this;
    }

    /**
     * 设置 目标属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDELNParam dstpsdefid(PSDEField pSDEField){
        if(pSDEField == null){
            this.setDstPSDEFId(null);
            this.setDstPSDEFName(null);
        }
        else{
            this.setDstPSDEFId(pSDEField.getPSDEFieldId());
            this.setDstPSDEFName(pSDEField.getPSDEFieldName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEFNAME</B>&nbsp;目标属性，指定目标参数的属性，如存在自定义目标参数属性则优先使用自定义属性
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFID}
     */
    public final static String FIELD_DSTPSDEFNAME = "dstpsdefname";

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFNAME}
     * 
     * @param dstPSDEFName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFNAME)
    public void setDstPSDEFName(String dstPSDEFName){
        this.set(FIELD_DSTPSDEFNAME, dstPSDEFName);
    }
    
    /**
     * 获取 目标属性  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFName(){
        Object objValue = this.get(FIELD_DSTPSDEFNAME);
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
    public boolean isDstPSDEFNameDirty(){
        if(this.contains(FIELD_DSTPSDEFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性
     */
    @JsonIgnore
    public void resetDstPSDEFName(){
        this.reset(FIELD_DSTPSDEFNAME);
    }

    /**
     * 设置 目标属性，详细说明：{@link #FIELD_DSTPSDEFNAME}
     * <P>
     * 等同 {@link #setDstPSDEFName}
     * @param dstPSDEFName
     */
    @JsonIgnore
    public PSDELNParam dstpsdefname(String dstPSDEFName){
        this.setDstPSDEFName(dstPSDEFName);
        return this;
    }

    /**
     * <B>DSTPSDLPARAMID</B>&nbsp;目标参数，指定处理节点操作的目标参数，来自当前处理逻辑的定义的参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicParam} 
     */
    public final static String FIELD_DSTPSDLPARAMID = "dstpsdlparamid";

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMID}
     * 
     * @param dstPSDLParamId
     * 
     */
    @JsonProperty(FIELD_DSTPSDLPARAMID)
    public void setDstPSDLParamId(String dstPSDLParamId){
        this.set(FIELD_DSTPSDLPARAMID, dstPSDLParamId);
    }
    
    /**
     * 获取 目标参数  
     * @return
     */
    @JsonIgnore
    public String getDstPSDLParamId(){
        Object objValue = this.get(FIELD_DSTPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDLParamIdDirty(){
        if(this.contains(FIELD_DSTPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标参数
     */
    @JsonIgnore
    public void resetDstPSDLParamId(){
        this.reset(FIELD_DSTPSDLPARAMID);
    }

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMID}
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param dstPSDLParamId
     */
    @JsonIgnore
    public PSDELNParam dstpsdlparamid(String dstPSDLParamId){
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    /**
     * 设置 目标参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELNParam dstpsdlparamid(PSDELogicParam pSDELogicParam){
        if(pSDELogicParam == null){
            this.setDstParamPSDEId(null);
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        }
        else{
            this.setDstParamPSDEId(pSDELogicParam.getParamPSDEId());
            this.setDstPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setDstPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>DSTPSDLPARAMNAME</B>&nbsp;目标参数，指定处理节点操作的目标参数，来自当前处理逻辑的定义的参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDLPARAMID}
     */
    public final static String FIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMNAME}
     * 
     * @param dstPSDLParamName
     * 
     */
    @JsonProperty(FIELD_DSTPSDLPARAMNAME)
    public void setDstPSDLParamName(String dstPSDLParamName){
        this.set(FIELD_DSTPSDLPARAMNAME, dstPSDLParamName);
    }
    
    /**
     * 获取 目标参数  
     * @return
     */
    @JsonIgnore
    public String getDstPSDLParamName(){
        Object objValue = this.get(FIELD_DSTPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDLParamNameDirty(){
        if(this.contains(FIELD_DSTPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标参数
     */
    @JsonIgnore
    public void resetDstPSDLParamName(){
        this.reset(FIELD_DSTPSDLPARAMNAME);
    }

    /**
     * 设置 目标参数，详细说明：{@link #FIELD_DSTPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setDstPSDLParamName}
     * @param dstPSDLParamName
     */
    @JsonIgnore
    public PSDELNParam dstpsdlparamname(String dstPSDLParamName){
        this.setDstPSDLParamName(dstPSDLParamName);
        return this;
    }

    /**
     * <B>DSTSORTDIR</B>&nbsp;目标属性排序方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.SortDir} 
     */
    public final static String FIELD_DSTSORTDIR = "dstsortdir";

    /**
     * 设置 目标属性排序方向
     * 
     * @param dstSortDir
     * 
     */
    @JsonProperty(FIELD_DSTSORTDIR)
    public void setDstSortDir(String dstSortDir){
        this.set(FIELD_DSTSORTDIR, dstSortDir);
    }
    
    /**
     * 获取 目标属性排序方向  
     * @return
     */
    @JsonIgnore
    public String getDstSortDir(){
        Object objValue = this.get(FIELD_DSTSORTDIR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性排序方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstSortDirDirty(){
        if(this.contains(FIELD_DSTSORTDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性排序方向
     */
    @JsonIgnore
    public void resetDstSortDir(){
        this.reset(FIELD_DSTSORTDIR);
    }

    /**
     * 设置 目标属性排序方向
     * <P>
     * 等同 {@link #setDstSortDir}
     * @param dstSortDir
     */
    @JsonIgnore
    public PSDELNParam dstsortdir(String dstSortDir){
        this.setDstSortDir(dstSortDir);
        return this;
    }

     /**
     * 设置 目标属性排序方向
     * <P>
     * 等同 {@link #setDstSortDir}
     * @param dstSortDir
     */
    @JsonIgnore
    public PSDELNParam dstsortdir(net.ibizsys.psmodel.core.util.PSModelEnums.SortDir dstSortDir){
        if(dstSortDir == null){
            this.setDstSortDir(null);
        }
        else{
            this.setDstSortDir(dstSortDir.value);
        }
        return this;
    }

    /**
     * <B>INOUTFLAG</B>&nbsp;输入模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_INOUTFLAG = "inoutflag";

    /**
     * 设置 输入模式
     * 
     * @param inOutFlag
     * 
     */
    @JsonProperty(FIELD_INOUTFLAG)
    public void setInOutFlag(Integer inOutFlag){
        this.set(FIELD_INOUTFLAG, inOutFlag);
    }
    
    /**
     * 获取 输入模式  
     * @return
     */
    @JsonIgnore
    public Integer getInOutFlag(){
        Object objValue = this.get(FIELD_INOUTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 输入模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isInOutFlagDirty(){
        if(this.contains(FIELD_INOUTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入模式
     */
    @JsonIgnore
    public void resetInOutFlag(){
        this.reset(FIELD_INOUTFLAG);
    }

    /**
     * 设置 输入模式
     * <P>
     * 等同 {@link #setInOutFlag}
     * @param inOutFlag
     */
    @JsonIgnore
    public PSDELNParam inoutflag(Integer inOutFlag){
        this.setInOutFlag(inOutFlag);
        return this;
    }

     /**
     * 设置 输入模式
     * <P>
     * 等同 {@link #setInOutFlag}
     * @param inOutFlag
     */
    @JsonIgnore
    public PSDELNParam inoutflag(Boolean inOutFlag){
        if(inOutFlag == null){
            this.setInOutFlag(null);
        }
        else{
            this.setInOutFlag(inOutFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSDELNParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;处理次序，指定处理节点参数的处理次序，如需放置到数组中也将按照此次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 处理次序，详细说明：{@link #FIELD_ORDERVALUE}
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 处理次序  
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
     * 判断 处理次序 是否指定值，包括空值
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
     * 重置 处理次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 处理次序，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDELNParam ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMS</B>&nbsp;动态参数
     */
    public final static String FIELD_PARAMS = "params";

    /**
     * 设置 动态参数
     * 
     * @param params
     * 
     */
    @JsonProperty(FIELD_PARAMS)
    public void setParams(String params){
        this.set(FIELD_PARAMS, params);
    }
    
    /**
     * 获取 动态参数  
     * @return
     */
    @JsonIgnore
    public String getParams(){
        Object objValue = this.get(FIELD_PARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamsDirty(){
        if(this.contains(FIELD_PARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态参数
     */
    @JsonIgnore
    public void resetParams(){
        this.reset(FIELD_PARAMS);
    }

    /**
     * 设置 动态参数
     * <P>
     * 等同 {@link #setParams}
     * @param params
     */
    @JsonIgnore
    public PSDELNParam params(String params){
        this.setParams(params);
        return this;
    }

    /**
     * <B>PARAMTAG</B>&nbsp;参数标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMTAG = "paramtag";

    /**
     * 设置 参数标记
     * 
     * @param paramTag
     * 
     */
    @JsonProperty(FIELD_PARAMTAG)
    public void setParamTag(String paramTag){
        this.set(FIELD_PARAMTAG, paramTag);
    }
    
    /**
     * 获取 参数标记  
     * @return
     */
    @JsonIgnore
    public String getParamTag(){
        Object objValue = this.get(FIELD_PARAMTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTagDirty(){
        if(this.contains(FIELD_PARAMTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标记
     */
    @JsonIgnore
    public void resetParamTag(){
        this.reset(FIELD_PARAMTAG);
    }

    /**
     * 设置 参数标记
     * <P>
     * 等同 {@link #setParamTag}
     * @param paramTag
     */
    @JsonIgnore
    public PSDELNParam paramtag(String paramTag){
        this.setParamTag(paramTag);
        return this;
    }

    /**
     * <B>PARAMTAG2</B>&nbsp;参数标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAMTAG2 = "paramtag2";

    /**
     * 设置 参数标记2
     * 
     * @param paramTag2
     * 
     */
    @JsonProperty(FIELD_PARAMTAG2)
    public void setParamTag2(String paramTag2){
        this.set(FIELD_PARAMTAG2, paramTag2);
    }
    
    /**
     * 获取 参数标记2  
     * @return
     */
    @JsonIgnore
    public String getParamTag2(){
        Object objValue = this.get(FIELD_PARAMTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTag2Dirty(){
        if(this.contains(FIELD_PARAMTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数标记2
     */
    @JsonIgnore
    public void resetParamTag2(){
        this.reset(FIELD_PARAMTAG2);
    }

    /**
     * 设置 参数标记2
     * <P>
     * 等同 {@link #setParamTag2}
     * @param paramTag2
     */
    @JsonIgnore
    public PSDELNParam paramtag2(String paramTag2){
        this.setParamTag2(paramTag2);
        return this;
    }

    /**
     * <B>PARAMTYPE</B>&nbsp;参数操作类型，指定处理节点参数的操作类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicNodeParamType} 
     */
    public final static String FIELD_PARAMTYPE = "paramtype";

    /**
     * 设置 参数操作类型，详细说明：{@link #FIELD_PARAMTYPE}
     * 
     * @param paramType
     * 
     */
    @JsonProperty(FIELD_PARAMTYPE)
    public void setParamType(String paramType){
        this.set(FIELD_PARAMTYPE, paramType);
    }
    
    /**
     * 获取 参数操作类型  
     * @return
     */
    @JsonIgnore
    public String getParamType(){
        Object objValue = this.get(FIELD_PARAMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数操作类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTypeDirty(){
        if(this.contains(FIELD_PARAMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数操作类型
     */
    @JsonIgnore
    public void resetParamType(){
        this.reset(FIELD_PARAMTYPE);
    }

    /**
     * 设置 参数操作类型，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDELNParam paramtype(String paramType){
        this.setParamType(paramType);
        return this;
    }

     /**
     * 设置 参数操作类型，详细说明：{@link #FIELD_PARAMTYPE}
     * <P>
     * 等同 {@link #setParamType}
     * @param paramType
     */
    @JsonIgnore
    public PSDELNParam paramtype(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicNodeParamType paramType){
        if(paramType == null){
            this.setParamType(null);
        }
        else{
            this.setParamType(paramType.value);
        }
        return this;
    }

    /**
     * <B>PARAMTYPETEXT</B>&nbsp;参数类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PARAMTYPETEXT = "paramtypetext";

    /**
     * 设置 参数类型
     * 
     * @param paramTypeText
     * 
     */
    @JsonProperty(FIELD_PARAMTYPETEXT)
    public void setParamTypeText(String paramTypeText){
        this.set(FIELD_PARAMTYPETEXT, paramTypeText);
    }
    
    /**
     * 获取 参数类型  
     * @return
     */
    @JsonIgnore
    public String getParamTypeText(){
        Object objValue = this.get(FIELD_PARAMTYPETEXT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamTypeTextDirty(){
        if(this.contains(FIELD_PARAMTYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数类型
     */
    @JsonIgnore
    public void resetParamTypeText(){
        this.reset(FIELD_PARAMTYPETEXT);
    }

    /**
     * 设置 参数类型
     * <P>
     * 等同 {@link #setParamTypeText}
     * @param paramTypeText
     */
    @JsonIgnore
    public PSDELNParam paramtypetext(String paramTypeText){
        this.setParamTypeText(paramTypeText);
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
    public PSDELNParam psdeid(String pSDEId){
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
    public PSDELNParam psdeid(PSDataEntity pSDataEntity){
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
     * <B>PSDELNPARAMID</B>&nbsp;实体处理逻辑节点参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELNPARAMID = "psdelnparamid";

    /**
     * 设置 实体处理逻辑节点参数标识
     * 
     * @param pSDELNParamId
     * 
     */
    @JsonProperty(FIELD_PSDELNPARAMID)
    public void setPSDELNParamId(String pSDELNParamId){
        this.set(FIELD_PSDELNPARAMID, pSDELNParamId);
    }
    
    /**
     * 获取 实体处理逻辑节点参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSDELNParamId(){
        Object objValue = this.get(FIELD_PSDELNPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体处理逻辑节点参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELNParamIdDirty(){
        if(this.contains(FIELD_PSDELNPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体处理逻辑节点参数标识
     */
    @JsonIgnore
    public void resetPSDELNParamId(){
        this.reset(FIELD_PSDELNPARAMID);
    }

    /**
     * 设置 实体处理逻辑节点参数标识
     * <P>
     * 等同 {@link #setPSDELNParamId}
     * @param pSDELNParamId
     */
    @JsonIgnore
    public PSDELNParam psdelnparamid(String pSDELNParamId){
        this.setPSDELNParamId(pSDELNParamId);
        return this;
    }

    /**
     * <B>PSDELNPARAMNAME</B>&nbsp;详细信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDELNPARAMNAME = "psdelnparamname";

    /**
     * 设置 详细信息
     * 
     * @param pSDELNParamName
     * 
     */
    @JsonProperty(FIELD_PSDELNPARAMNAME)
    public void setPSDELNParamName(String pSDELNParamName){
        this.set(FIELD_PSDELNPARAMNAME, pSDELNParamName);
    }
    
    /**
     * 获取 详细信息  
     * @return
     */
    @JsonIgnore
    public String getPSDELNParamName(){
        Object objValue = this.get(FIELD_PSDELNPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 详细信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELNParamNameDirty(){
        if(this.contains(FIELD_PSDELNPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 详细信息
     */
    @JsonIgnore
    public void resetPSDELNParamName(){
        this.reset(FIELD_PSDELNPARAMNAME);
    }

    /**
     * 设置 详细信息
     * <P>
     * 等同 {@link #setPSDELNParamName}
     * @param pSDELNParamName
     */
    @JsonIgnore
    public PSDELNParam psdelnparamname(String pSDELNParamName){
        this.setPSDELNParamName(pSDELNParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDELNParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDELNParamName(strName);
    }

    @JsonIgnore
    public PSDELNParam name(String strName){
        this.setPSDELNParamName(strName);
        return this;
    }

    /**
     * <B>PSDELOGICNODEID</B>&nbsp;逻辑处理参数，指定处理节点参数所在的处理节点
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicNode} 
     */
    public final static String FIELD_PSDELOGICNODEID = "psdelogicnodeid";

    /**
     * 设置 逻辑处理参数，详细说明：{@link #FIELD_PSDELOGICNODEID}
     * 
     * @param pSDELogicNodeId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNODEID)
    public void setPSDELogicNodeId(String pSDELogicNodeId){
        this.set(FIELD_PSDELOGICNODEID, pSDELogicNodeId);
    }
    
    /**
     * 获取 逻辑处理参数  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicNodeId(){
        Object objValue = this.get(FIELD_PSDELOGICNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑处理参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNodeIdDirty(){
        if(this.contains(FIELD_PSDELOGICNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑处理参数
     */
    @JsonIgnore
    public void resetPSDELogicNodeId(){
        this.reset(FIELD_PSDELOGICNODEID);
    }

    /**
     * 设置 逻辑处理参数，详细说明：{@link #FIELD_PSDELOGICNODEID}
     * <P>
     * 等同 {@link #setPSDELogicNodeId}
     * @param pSDELogicNodeId
     */
    @JsonIgnore
    public PSDELNParam psdelogicnodeid(String pSDELogicNodeId){
        this.setPSDELogicNodeId(pSDELogicNodeId);
        return this;
    }

    /**
     * 设置 逻辑处理参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicNodeId}
     * @param pSDELogicNode 引用对象
     */
    @JsonIgnore
    public PSDELNParam psdelogicnodeid(PSDELogicNode pSDELogicNode){
        if(pSDELogicNode == null){
            this.setPSDELogicNodeId(null);
            this.setPSDELogicNodeName(null);
        }
        else{
            this.setPSDELogicNodeId(pSDELogicNode.getPSDELogicNodeId());
            this.setPSDELogicNodeName(pSDELogicNode.getPSDELogicNodeName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNODENAME</B>&nbsp;逻辑处理，指定处理节点参数所在的处理节点
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICNODEID}
     */
    public final static String FIELD_PSDELOGICNODENAME = "psdelogicnodename";

    /**
     * 设置 逻辑处理，详细说明：{@link #FIELD_PSDELOGICNODENAME}
     * 
     * @param pSDELogicNodeName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNODENAME)
    public void setPSDELogicNodeName(String pSDELogicNodeName){
        this.set(FIELD_PSDELOGICNODENAME, pSDELogicNodeName);
    }
    
    /**
     * 获取 逻辑处理  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicNodeName(){
        Object objValue = this.get(FIELD_PSDELOGICNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNodeNameDirty(){
        if(this.contains(FIELD_PSDELOGICNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑处理
     */
    @JsonIgnore
    public void resetPSDELogicNodeName(){
        this.reset(FIELD_PSDELOGICNODENAME);
    }

    /**
     * 设置 逻辑处理，详细说明：{@link #FIELD_PSDELOGICNODENAME}
     * <P>
     * 等同 {@link #setPSDELogicNodeName}
     * @param pSDELogicNodeName
     */
    @JsonIgnore
    public PSDELNParam psdelogicnodename(String pSDELogicNodeName){
        this.setPSDELogicNodeName(pSDELogicNodeName);
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
    public PSDELNParam psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSOBJDATA</B>&nbsp;模型对象数据
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJDATA = "psobjdata";

    /**
     * 设置 模型对象数据
     * 
     * @param pSObjData
     * 
     */
    @JsonProperty(FIELD_PSOBJDATA)
    public void setPSObjData(String pSObjData){
        this.set(FIELD_PSOBJDATA, pSObjData);
    }
    
    /**
     * 获取 模型对象数据  
     * @return
     */
    @JsonIgnore
    public String getPSObjData(){
        Object objValue = this.get(FIELD_PSOBJDATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型对象数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjDataDirty(){
        if(this.contains(FIELD_PSOBJDATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型对象数据
     */
    @JsonIgnore
    public void resetPSObjData(){
        this.reset(FIELD_PSOBJDATA);
    }

    /**
     * 设置 模型对象数据
     * <P>
     * 等同 {@link #setPSObjData}
     * @param pSObjData
     */
    @JsonIgnore
    public PSDELNParam psobjdata(String pSObjData){
        this.setPSObjData(pSObjData);
        return this;
    }

    /**
     * <B>PSOBJDATA2</B>&nbsp;模型对象数据2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJDATA2 = "psobjdata2";

    /**
     * 设置 模型对象数据2
     * 
     * @param pSObjData2
     * 
     */
    @JsonProperty(FIELD_PSOBJDATA2)
    public void setPSObjData2(String pSObjData2){
        this.set(FIELD_PSOBJDATA2, pSObjData2);
    }
    
    /**
     * 获取 模型对象数据2  
     * @return
     */
    @JsonIgnore
    public String getPSObjData2(){
        Object objValue = this.get(FIELD_PSOBJDATA2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型对象数据2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjData2Dirty(){
        if(this.contains(FIELD_PSOBJDATA2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型对象数据2
     */
    @JsonIgnore
    public void resetPSObjData2(){
        this.reset(FIELD_PSOBJDATA2);
    }

    /**
     * 设置 模型对象数据2
     * <P>
     * 等同 {@link #setPSObjData2}
     * @param pSObjData2
     */
    @JsonIgnore
    public PSDELNParam psobjdata2(String pSObjData2){
        this.setPSObjData2(pSObjData2);
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
    public PSDELNParam psobjid(String pSObjId){
        this.setPSObjId(pSObjId);
        return this;
    }

    /**
     * <B>PSOBJNAME</B>&nbsp;模型对象名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSOBJNAME = "psobjname";

    /**
     * 设置 模型对象名称
     * 
     * @param pSObjName
     * 
     */
    @JsonProperty(FIELD_PSOBJNAME)
    public void setPSObjName(String pSObjName){
        this.set(FIELD_PSOBJNAME, pSObjName);
    }
    
    /**
     * 获取 模型对象名称  
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
     * 判断 模型对象名称 是否指定值，包括空值
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
     * 重置 模型对象名称
     */
    @JsonIgnore
    public void resetPSObjName(){
        this.reset(FIELD_PSOBJNAME);
    }

    /**
     * 设置 模型对象名称
     * <P>
     * 等同 {@link #setPSObjName}
     * @param pSObjName
     */
    @JsonIgnore
    public PSDELNParam psobjname(String pSObjName){
        this.setPSObjName(pSObjName);
        return this;
    }

    /**
     * <B>PSOBJTYPE</B>&nbsp;模型对象类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_PSOBJTYPE = "psobjtype";

    /**
     * 设置 模型对象类型
     * 
     * @param pSObjType
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPE)
    public void setPSObjType(String pSObjType){
        this.set(FIELD_PSOBJTYPE, pSObjType);
    }
    
    /**
     * 获取 模型对象类型  
     * @return
     */
    @JsonIgnore
    public String getPSObjType(){
        Object objValue = this.get(FIELD_PSOBJTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型对象类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjTypeDirty(){
        if(this.contains(FIELD_PSOBJTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型对象类型
     */
    @JsonIgnore
    public void resetPSObjType(){
        this.reset(FIELD_PSOBJTYPE);
    }

    /**
     * 设置 模型对象类型
     * <P>
     * 等同 {@link #setPSObjType}
     * @param pSObjType
     */
    @JsonIgnore
    public PSDELNParam psobjtype(String pSObjType){
        this.setPSObjType(pSObjType);
        return this;
    }

    /**
     * <B>PSOBJTYPENAME</B>&nbsp;模型对象类型名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSOBJTYPENAME = "psobjtypename";

    /**
     * 设置 模型对象类型名称
     * 
     * @param pSObjTypeName
     * 
     */
    @JsonProperty(FIELD_PSOBJTYPENAME)
    public void setPSObjTypeName(String pSObjTypeName){
        this.set(FIELD_PSOBJTYPENAME, pSObjTypeName);
    }
    
    /**
     * 获取 模型对象类型名称  
     * @return
     */
    @JsonIgnore
    public String getPSObjTypeName(){
        Object objValue = this.get(FIELD_PSOBJTYPENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模型对象类型名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSObjTypeNameDirty(){
        if(this.contains(FIELD_PSOBJTYPENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型对象类型名称
     */
    @JsonIgnore
    public void resetPSObjTypeName(){
        this.reset(FIELD_PSOBJTYPENAME);
    }

    /**
     * 设置 模型对象类型名称
     * <P>
     * 等同 {@link #setPSObjTypeName}
     * @param pSObjTypeName
     */
    @JsonIgnore
    public PSDELNParam psobjtypename(String pSObjTypeName){
        this.setPSObjTypeName(pSObjTypeName);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysMsgTempl} 
     */
    public final static String FIELD_PSSYSMSGTEMPLID = "pssysmsgtemplid";

    /**
     * 设置 消息模板
     * 
     * @param pSSysMsgTemplId
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLID)
    public void setPSSysMsgTemplId(String pSSysMsgTemplId){
        this.set(FIELD_PSSYSMSGTEMPLID, pSSysMsgTemplId);
    }
    
    /**
     * 获取 消息模板  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplId(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplIdDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplId(){
        this.reset(FIELD_PSSYSMSGTEMPLID);
    }

    /**
     * 设置 消息模板
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTemplId
     */
    @JsonIgnore
    public PSDELNParam pssysmsgtemplid(String pSSysMsgTemplId){
        this.setPSSysMsgTemplId(pSSysMsgTemplId);
        return this;
    }

    /**
     * 设置 消息模板，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysMsgTemplId}
     * @param pSSysMsgTempl 引用对象
     */
    @JsonIgnore
    public PSDELNParam pssysmsgtemplid(PSSysMsgTempl pSSysMsgTempl){
        if(pSSysMsgTempl == null){
            this.setPSSysMsgTemplId(null);
            this.setPSSysMsgTemplName(null);
        }
        else{
            this.setPSSysMsgTemplId(pSSysMsgTempl.getPSSysMsgTemplId());
            this.setPSSysMsgTemplName(pSSysMsgTempl.getPSSysMsgTemplName());
        }
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLNAME</B>&nbsp;消息模板
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSMSGTEMPLID}
     */
    public final static String FIELD_PSSYSMSGTEMPLNAME = "pssysmsgtemplname";

    /**
     * 设置 消息模板
     * 
     * @param pSSysMsgTemplName
     * 
     */
    @JsonProperty(FIELD_PSSYSMSGTEMPLNAME)
    public void setPSSysMsgTemplName(String pSSysMsgTemplName){
        this.set(FIELD_PSSYSMSGTEMPLNAME, pSSysMsgTemplName);
    }
    
    /**
     * 获取 消息模板  
     * @return
     */
    @JsonIgnore
    public String getPSSysMsgTemplName(){
        Object objValue = this.get(FIELD_PSSYSMSGTEMPLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息模板 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysMsgTemplNameDirty(){
        if(this.contains(FIELD_PSSYSMSGTEMPLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息模板
     */
    @JsonIgnore
    public void resetPSSysMsgTemplName(){
        this.reset(FIELD_PSSYSMSGTEMPLNAME);
    }

    /**
     * 设置 消息模板
     * <P>
     * 等同 {@link #setPSSysMsgTemplName}
     * @param pSSysMsgTemplName
     */
    @JsonIgnore
    public PSDELNParam pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSSYSSEQUENCEID</B>&nbsp;值序列
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSequence} 
     */
    public final static String FIELD_PSSYSSEQUENCEID = "pssyssequenceid";

    /**
     * 设置 值序列
     * 
     * @param pSSysSequenceId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCEID)
    public void setPSSysSequenceId(String pSSysSequenceId){
        this.set(FIELD_PSSYSSEQUENCEID, pSSysSequenceId);
    }
    
    /**
     * 获取 值序列  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceId(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值序列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceIdDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值序列
     */
    @JsonIgnore
    public void resetPSSysSequenceId(){
        this.reset(FIELD_PSSYSSEQUENCEID);
    }

    /**
     * 设置 值序列
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequenceId
     */
    @JsonIgnore
    public PSDELNParam pssyssequenceid(String pSSysSequenceId){
        this.setPSSysSequenceId(pSSysSequenceId);
        return this;
    }

    /**
     * 设置 值序列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSequenceId}
     * @param pSSysSequence 引用对象
     */
    @JsonIgnore
    public PSDELNParam pssyssequenceid(PSSysSequence pSSysSequence){
        if(pSSysSequence == null){
            this.setPSSysSequenceId(null);
            this.setPSSysSequenceName(null);
        }
        else{
            this.setPSSysSequenceId(pSSysSequence.getPSSysSequenceId());
            this.setPSSysSequenceName(pSSysSequence.getPSSysSequenceName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEQUENCENAME</B>&nbsp;值序列
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEQUENCEID}
     */
    public final static String FIELD_PSSYSSEQUENCENAME = "pssyssequencename";

    /**
     * 设置 值序列
     * 
     * @param pSSysSequenceName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEQUENCENAME)
    public void setPSSysSequenceName(String pSSysSequenceName){
        this.set(FIELD_PSSYSSEQUENCENAME, pSSysSequenceName);
    }
    
    /**
     * 获取 值序列  
     * @return
     */
    @JsonIgnore
    public String getPSSysSequenceName(){
        Object objValue = this.get(FIELD_PSSYSSEQUENCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值序列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSequenceNameDirty(){
        if(this.contains(FIELD_PSSYSSEQUENCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值序列
     */
    @JsonIgnore
    public void resetPSSysSequenceName(){
        this.reset(FIELD_PSSYSSEQUENCENAME);
    }

    /**
     * 设置 值序列
     * <P>
     * 等同 {@link #setPSSysSequenceName}
     * @param pSSysSequenceName
     */
    @JsonIgnore
    public PSDELNParam pssyssequencename(String pSSysSequenceName){
        this.setPSSysSequenceName(pSSysSequenceName);
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
    public PSDELNParam pssystranslatorid(String pSSysTranslatorId){
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
    public PSDELNParam pssystranslatorid(PSSysTranslator pSSysTranslator){
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
    public PSDELNParam pssystranslatorname(String pSSysTranslatorName){
        this.setPSSysTranslatorName(pSSysTranslatorName);
        return this;
    }

    /**
     * <B>SRCINDEX</B>&nbsp;源位置
     */
    public final static String FIELD_SRCINDEX = "srcindex";

    /**
     * 设置 源位置
     * 
     * @param srcIndex
     * 
     */
    @JsonProperty(FIELD_SRCINDEX)
    public void setSrcIndex(Integer srcIndex){
        this.set(FIELD_SRCINDEX, srcIndex);
    }
    
    /**
     * 获取 源位置  
     * @return
     */
    @JsonIgnore
    public Integer getSrcIndex(){
        Object objValue = this.get(FIELD_SRCINDEX);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 源位置 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcIndexDirty(){
        if(this.contains(FIELD_SRCINDEX)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源位置
     */
    @JsonIgnore
    public void resetSrcIndex(){
        this.reset(FIELD_SRCINDEX);
    }

    /**
     * 设置 源位置
     * <P>
     * 等同 {@link #setSrcIndex}
     * @param srcIndex
     */
    @JsonIgnore
    public PSDELNParam srcindex(Integer srcIndex){
        this.setSrcIndex(srcIndex);
        return this;
    }

    /**
     * <B>SRCPARAMPSDEID</B>&nbsp;源参数实体标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSDLPARAMID}
     */
    public final static String FIELD_SRCPARAMPSDEID = "srcparampsdeid";

    /**
     * 设置 源参数实体标识
     * 
     * @param srcParamPSDEId
     * 
     */
    @JsonProperty(FIELD_SRCPARAMPSDEID)
    public void setSrcParamPSDEId(String srcParamPSDEId){
        this.set(FIELD_SRCPARAMPSDEID, srcParamPSDEId);
    }
    
    /**
     * 获取 源参数实体标识  
     * @return
     */
    @JsonIgnore
    public String getSrcParamPSDEId(){
        Object objValue = this.get(FIELD_SRCPARAMPSDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源参数实体标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcParamPSDEIdDirty(){
        if(this.contains(FIELD_SRCPARAMPSDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源参数实体标识
     */
    @JsonIgnore
    public void resetSrcParamPSDEId(){
        this.reset(FIELD_SRCPARAMPSDEID);
    }

    /**
     * 设置 源参数实体标识
     * <P>
     * 等同 {@link #setSrcParamPSDEId}
     * @param srcParamPSDEId
     */
    @JsonIgnore
    public PSDELNParam srcparampsdeid(String srcParamPSDEId){
        this.setSrcParamPSDEId(srcParamPSDEId);
        return this;
    }

    /**
     * <B>SRCPSDEFID</B>&nbsp;源属性，指定源参数的属性，如存在自定义源参数属性则优先使用自定义属性
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEField} 
     */
    public final static String FIELD_SRCPSDEFID = "srcpsdefid";

    /**
     * 设置 源属性，详细说明：{@link #FIELD_SRCPSDEFID}
     * 
     * @param srcPSDEFId
     * 
     */
    @JsonProperty(FIELD_SRCPSDEFID)
    public void setSrcPSDEFId(String srcPSDEFId){
        this.set(FIELD_SRCPSDEFID, srcPSDEFId);
    }
    
    /**
     * 获取 源属性  
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
     * 判断 源属性 是否指定值，包括空值
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
     * 重置 源属性
     */
    @JsonIgnore
    public void resetSrcPSDEFId(){
        this.reset(FIELD_SRCPSDEFID);
    }

    /**
     * 设置 源属性，详细说明：{@link #FIELD_SRCPSDEFID}
     * <P>
     * 等同 {@link #setSrcPSDEFId}
     * @param srcPSDEFId
     */
    @JsonIgnore
    public PSDELNParam srcpsdefid(String srcPSDEFId){
        this.setSrcPSDEFId(srcPSDEFId);
        return this;
    }

    /**
     * 设置 源属性，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSDEFId}
     * @param pSDEField 引用对象
     */
    @JsonIgnore
    public PSDELNParam srcpsdefid(PSDEField pSDEField){
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
     * <B>SRCPSDEFNAME</B>&nbsp;源属性，指定源参数的属性，如存在自定义源参数属性则优先使用自定义属性
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
    public PSDELNParam srcpsdefname(String srcPSDEFName){
        this.setSrcPSDEFName(srcPSDEFName);
        return this;
    }

    /**
     * <B>SRCPSDLPARAMID</B>&nbsp;源参数，源值类型为【源逻辑参数】时，指定当前处理逻辑的参数作为源参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDELogicParam} 
     */
    public final static String FIELD_SRCPSDLPARAMID = "srcpsdlparamid";

    /**
     * 设置 源参数，详细说明：{@link #FIELD_SRCPSDLPARAMID}
     * 
     * @param srcPSDLParamId
     * 
     */
    @JsonProperty(FIELD_SRCPSDLPARAMID)
    public void setSrcPSDLParamId(String srcPSDLParamId){
        this.set(FIELD_SRCPSDLPARAMID, srcPSDLParamId);
    }
    
    /**
     * 获取 源参数  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDLParamId(){
        Object objValue = this.get(FIELD_SRCPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDLParamIdDirty(){
        if(this.contains(FIELD_SRCPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源参数
     */
    @JsonIgnore
    public void resetSrcPSDLParamId(){
        this.reset(FIELD_SRCPSDLPARAMID);
    }

    /**
     * 设置 源参数，详细说明：{@link #FIELD_SRCPSDLPARAMID}
     * <P>
     * 等同 {@link #setSrcPSDLParamId}
     * @param srcPSDLParamId
     */
    @JsonIgnore
    public PSDELNParam srcpsdlparamid(String srcPSDLParamId){
        this.setSrcPSDLParamId(srcPSDLParamId);
        return this;
    }

    /**
     * 设置 源参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setSrcPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELNParam srcpsdlparamid(PSDELogicParam pSDELogicParam){
        if(pSDELogicParam == null){
            this.setSrcParamPSDEId(null);
            this.setSrcPSDLParamId(null);
            this.setSrcPSDLParamName(null);
        }
        else{
            this.setSrcParamPSDEId(pSDELogicParam.getParamPSDEId());
            this.setSrcPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setSrcPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>SRCPSDLPARAMNAME</B>&nbsp;源参数，源值类型为【源逻辑参数】时，指定当前处理逻辑的参数作为源参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_SRCPSDLPARAMID}
     */
    public final static String FIELD_SRCPSDLPARAMNAME = "srcpsdlparamname";

    /**
     * 设置 源参数，详细说明：{@link #FIELD_SRCPSDLPARAMNAME}
     * 
     * @param srcPSDLParamName
     * 
     */
    @JsonProperty(FIELD_SRCPSDLPARAMNAME)
    public void setSrcPSDLParamName(String srcPSDLParamName){
        this.set(FIELD_SRCPSDLPARAMNAME, srcPSDLParamName);
    }
    
    /**
     * 获取 源参数  
     * @return
     */
    @JsonIgnore
    public String getSrcPSDLParamName(){
        Object objValue = this.get(FIELD_SRCPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 源参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcPSDLParamNameDirty(){
        if(this.contains(FIELD_SRCPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源参数
     */
    @JsonIgnore
    public void resetSrcPSDLParamName(){
        this.reset(FIELD_SRCPSDLPARAMNAME);
    }

    /**
     * 设置 源参数，详细说明：{@link #FIELD_SRCPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setSrcPSDLParamName}
     * @param srcPSDLParamName
     */
    @JsonIgnore
    public PSDELNParam srcpsdlparamname(String srcPSDLParamName){
        this.setSrcPSDLParamName(srcPSDLParamName);
        return this;
    }

    /**
     * <B>SRCSIZE</B>&nbsp;源长度
     */
    public final static String FIELD_SRCSIZE = "srcsize";

    /**
     * 设置 源长度
     * 
     * @param srcSize
     * 
     */
    @JsonProperty(FIELD_SRCSIZE)
    public void setSrcSize(Integer srcSize){
        this.set(FIELD_SRCSIZE, srcSize);
    }
    
    /**
     * 获取 源长度  
     * @return
     */
    @JsonIgnore
    public Integer getSrcSize(){
        Object objValue = this.get(FIELD_SRCSIZE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 源长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSrcSizeDirty(){
        if(this.contains(FIELD_SRCSIZE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源长度
     */
    @JsonIgnore
    public void resetSrcSize(){
        this.reset(FIELD_SRCSIZE);
    }

    /**
     * 设置 源长度
     * <P>
     * 等同 {@link #setSrcSize}
     * @param srcSize
     */
    @JsonIgnore
    public PSDELNParam srcsize(Integer srcSize){
        this.setSrcSize(srcSize);
        return this;
    }

    /**
     * <B>SRCVALUE</B>&nbsp;源值，源值类型为【直接值】时，指定直接值的内容
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_SRCVALUE = "srcvalue";

    /**
     * 设置 源值，详细说明：{@link #FIELD_SRCVALUE}
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
     * 设置 源值，详细说明：{@link #FIELD_SRCVALUE}
     * <P>
     * 等同 {@link #setSrcValue}
     * @param srcValue
     */
    @JsonIgnore
    public PSDELNParam srcvalue(String srcValue){
        this.setSrcValue(srcValue);
        return this;
    }

    /**
     * <B>SRCVALUESTDDATATYPE</B>&nbsp;值标准数据类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_SRCVALUESTDDATATYPE = "srcvaluestddatatype";

    /**
     * 设置 值标准数据类型
     * 
     * @param srcValueStdDataType
     * 
     */
    @JsonProperty(FIELD_SRCVALUESTDDATATYPE)
    public void setSrcValueStdDataType(Integer srcValueStdDataType){
        this.set(FIELD_SRCVALUESTDDATATYPE, srcValueStdDataType);
    }
    
    /**
     * 获取 值标准数据类型  
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
     * 判断 值标准数据类型 是否指定值，包括空值
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
     * 重置 值标准数据类型
     */
    @JsonIgnore
    public void resetSrcValueStdDataType(){
        this.reset(FIELD_SRCVALUESTDDATATYPE);
    }

    /**
     * 设置 值标准数据类型
     * <P>
     * 等同 {@link #setSrcValueStdDataType}
     * @param srcValueStdDataType
     */
    @JsonIgnore
    public PSDELNParam srcvaluestddatatype(Integer srcValueStdDataType){
        this.setSrcValueStdDataType(srcValueStdDataType);
        return this;
    }

     /**
     * 设置 值标准数据类型
     * <P>
     * 等同 {@link #setSrcValueStdDataType}
     * @param srcValueStdDataType
     */
    @JsonIgnore
    public PSDELNParam srcvaluestddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType srcValueStdDataType){
        if(srcValueStdDataType == null){
            this.setSrcValueStdDataType(null);
        }
        else{
            this.setSrcValueStdDataType(srcValueStdDataType.value);
        }
        return this;
    }

    /**
     * <B>SRCVALUETYPE</B>&nbsp;源值类型，指定源值的类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamValueType} 
     */
    public final static String FIELD_SRCVALUETYPE = "srcvaluetype";

    /**
     * 设置 源值类型，详细说明：{@link #FIELD_SRCVALUETYPE}
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
     * 设置 源值类型，详细说明：{@link #FIELD_SRCVALUETYPE}
     * <P>
     * 等同 {@link #setSrcValueType}
     * @param srcValueType
     */
    @JsonIgnore
    public PSDELNParam srcvaluetype(String srcValueType){
        this.setSrcValueType(srcValueType);
        return this;
    }

     /**
     * 设置 源值类型，详细说明：{@link #FIELD_SRCVALUETYPE}
     * <P>
     * 等同 {@link #setSrcValueType}
     * @param srcValueType
     */
    @JsonIgnore
    public PSDELNParam srcvaluetype(net.ibizsys.psmodel.core.util.PSModelEnums.DELogicParamValueType srcValueType){
        if(srcValueType == null){
            this.setSrcValueType(null);
        }
        else{
            this.setSrcValueType(srcValueType.value);
        }
        return this;
    }

    /**
     * <B>SRCVALUETYPETEXT</B>&nbsp;源值类型
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_SRCVALUETYPETEXT = "srcvaluetypetext";

    /**
     * 设置 源值类型
     * 
     * @param srcValueTypeText
     * 
     */
    @JsonProperty(FIELD_SRCVALUETYPETEXT)
    public void setSrcValueTypeText(String srcValueTypeText){
        this.set(FIELD_SRCVALUETYPETEXT, srcValueTypeText);
    }
    
    /**
     * 获取 源值类型  
     * @return
     */
    @JsonIgnore
    public String getSrcValueTypeText(){
        Object objValue = this.get(FIELD_SRCVALUETYPETEXT);
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
    public boolean isSrcValueTypeTextDirty(){
        if(this.contains(FIELD_SRCVALUETYPETEXT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 源值类型
     */
    @JsonIgnore
    public void resetSrcValueTypeText(){
        this.reset(FIELD_SRCVALUETYPETEXT);
    }

    /**
     * 设置 源值类型
     * <P>
     * 等同 {@link #setSrcValueTypeText}
     * @param srcValueTypeText
     */
    @JsonIgnore
    public PSDELNParam srcvaluetypetext(String srcValueTypeText){
        this.setSrcValueTypeText(srcValueTypeText);
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
    public PSDELNParam updatedate(String updateDate){
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
    public PSDELNParam updateman(String updateMan){
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
    public PSDELNParam usercat(String userCat){
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
    public PSDELNParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDELNParam usertag(String userTag){
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
    public PSDELNParam usertag2(String userTag2){
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
    public PSDELNParam usertag3(String userTag3){
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
    public PSDELNParam usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDELNParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDELNParamId(strValue);
    }

    @JsonIgnore
    public PSDELNParam id(String strValue){
        this.setPSDELNParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDELNParam){
            PSDELNParam model = (PSDELNParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
