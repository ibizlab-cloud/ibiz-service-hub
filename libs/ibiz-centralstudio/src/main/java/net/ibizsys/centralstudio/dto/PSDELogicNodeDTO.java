package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDELOGICNODE</B>实体处理逻辑节点 模型传输对象
 * <P>
 * 实体处理逻辑中的处理节点模型，不同类型的处理节点提供不同的功能
 */
public class PSDELogicNodeDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDELogicNodeDTO(){
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定处理逻辑节点的代码标识，需要在所在的处理逻辑中具有唯一性
     * <P>
     * 字符串：最大长度 60，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDELogicNodeDTO codename(String codeName){
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
    public PSDELogicNodeDTO createdate(Timestamp createDate){
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
    public PSDELogicNodeDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMDSTPARAM</B>&nbsp;自定义目标属性
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CUSTOMDSTPARAM = "customdstparam";

    /**
     * 设置 自定义目标属性
     * 
     * @param customDSTParam
     * 
     */
    @JsonProperty(FIELD_CUSTOMDSTPARAM)
    public void setCustomDSTParam(String customDSTParam){
        this.set(FIELD_CUSTOMDSTPARAM, customDSTParam);
    }
    
    /**
     * 获取 自定义目标属性  
     * @return
     */
    @JsonIgnore
    public String getCustomDSTParam(){
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
    public boolean isCustomDSTParamDirty(){
        if(this.contains(FIELD_CUSTOMDSTPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义目标属性
     */
    @JsonIgnore
    public void resetCustomDSTParam(){
        this.reset(FIELD_CUSTOMDSTPARAM);
    }

    /**
     * 设置 自定义目标属性
     * <P>
     * 等同 {@link #setCustomDSTParam}
     * @param customDSTParam
     */
    @JsonIgnore
    public PSDELogicNodeDTO customdstparam(String customDSTParam){
        this.setCustomDSTParam(customDSTParam);
        return this;
    }

    /**
     * <B>CUSTOMSRCPARAM</B>&nbsp;自定义源属性
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_CUSTOMSRCPARAM = "customsrcparam";

    /**
     * 设置 自定义源属性
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
     * 设置 自定义源属性
     * <P>
     * 等同 {@link #setCustomSrcParam}
     * @param customSrcParam
     */
    @JsonIgnore
    public PSDELogicNodeDTO customsrcparam(String customSrcParam){
        this.setCustomSrcParam(customSrcParam);
        return this;
    }

    /**
     * <B>DEBUGMODE</B>&nbsp;调试模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DELogicDebugMode} 
     */
    public final static String FIELD_DEBUGMODE = "debugmode";

    /**
     * 设置 调试模式
     * 
     * @param debugMode
     * 
     */
    @JsonProperty(FIELD_DEBUGMODE)
    public void setDebugMode(Integer debugMode){
        this.set(FIELD_DEBUGMODE, debugMode);
    }
    
    /**
     * 获取 调试模式  
     * @return
     */
    @JsonIgnore
    public Integer getDebugMode(){
        Object objValue = this.get(FIELD_DEBUGMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 调试模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDebugModeDirty(){
        if(this.contains(FIELD_DEBUGMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 调试模式
     */
    @JsonIgnore
    public void resetDebugMode(){
        this.reset(FIELD_DEBUGMODE);
    }

    /**
     * 设置 调试模式
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSDELogicNodeDTO debugmode(Integer debugMode){
        this.setDebugMode(debugMode);
        return this;
    }

     /**
     * 设置 调试模式
     * <P>
     * 等同 {@link #setDebugMode}
     * @param debugMode
     */
    @JsonIgnore
    public PSDELogicNodeDTO debugmode(net.ibizsys.model.PSModelEnums.DELogicDebugMode debugMode){
        if(debugMode == null){
            this.setDebugMode(null);
        }
        else{
            this.setDebugMode(debugMode.value);
        }
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
    public PSDELogicNodeDTO dstindex(Integer dstIndex){
        this.setDstIndex(dstIndex);
        return this;
    }

    /**
     * <B>DSTPARAMACTION</B>&nbsp;目标参数操作，指定对目标参数的操作方式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DELogicParamAction2} 
     */
    public final static String FIELD_DSTPARAMACTION = "dstparamaction";

    /**
     * 设置 目标参数操作，详细说明：{@link #FIELD_DSTPARAMACTION}
     * 
     * @param dstParamAction
     * 
     */
    @JsonProperty(FIELD_DSTPARAMACTION)
    public void setDstParamAction(String dstParamAction){
        this.set(FIELD_DSTPARAMACTION, dstParamAction);
    }
    
    /**
     * 获取 目标参数操作  
     * @return
     */
    @JsonIgnore
    public String getDstParamAction(){
        Object objValue = this.get(FIELD_DSTPARAMACTION);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标参数操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstParamActionDirty(){
        if(this.contains(FIELD_DSTPARAMACTION)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标参数操作
     */
    @JsonIgnore
    public void resetDstParamAction(){
        this.reset(FIELD_DSTPARAMACTION);
    }

    /**
     * 设置 目标参数操作，详细说明：{@link #FIELD_DSTPARAMACTION}
     * <P>
     * 等同 {@link #setDstParamAction}
     * @param dstParamAction
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstparamaction(String dstParamAction){
        this.setDstParamAction(dstParamAction);
        return this;
    }

     /**
     * 设置 目标参数操作，详细说明：{@link #FIELD_DSTPARAMACTION}
     * <P>
     * 等同 {@link #setDstParamAction}
     * @param dstParamAction
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstparamaction(net.ibizsys.model.PSModelEnums.DELogicParamAction2 dstParamAction){
        if(dstParamAction == null){
            this.setDstParamAction(null);
        }
        else{
            this.setDstParamAction(dstParamAction.value);
        }
        return this;
    }

    /**
     * <B>DSTPSDEACTIONID</B>&nbsp;操作行为，指定对目标参数的操作行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEActionDTO} 
     */
    public final static String FIELD_DSTPSDEACTIONID = "dstpsdeactionid";

    /**
     * 设置 操作行为，详细说明：{@link #FIELD_DSTPSDEACTIONID}
     * 
     * @param dstPSDEActionId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEACTIONID)
    public void setDstPSDEActionId(String dstPSDEActionId){
        this.set(FIELD_DSTPSDEACTIONID, dstPSDEActionId);
    }
    
    /**
     * 获取 操作行为  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEActionId(){
        Object objValue = this.get(FIELD_DSTPSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEActionIdDirty(){
        if(this.contains(FIELD_DSTPSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作行为
     */
    @JsonIgnore
    public void resetDstPSDEActionId(){
        this.reset(FIELD_DSTPSDEACTIONID);
    }

    /**
     * 设置 操作行为，详细说明：{@link #FIELD_DSTPSDEACTIONID}
     * <P>
     * 等同 {@link #setDstPSDEActionId}
     * @param dstPSDEActionId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeactionid(String dstPSDEActionId){
        this.setDstPSDEActionId(dstPSDEActionId);
        return this;
    }

    /**
     * 设置 操作行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeactionid(PSDEActionDTO pSDEAction){
        if(pSDEAction == null){
            this.setDstPSDEActionId(null);
            this.setDstPSDEActionName(null);
        }
        else{
            this.setDstPSDEActionId(pSDEAction.getPSDEActionId());
            this.setDstPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEACTIONNAME</B>&nbsp;操作行为，指定对目标参数的操作行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEACTIONID}
     */
    public final static String FIELD_DSTPSDEACTIONNAME = "dstpsdeactionname";

    /**
     * 设置 操作行为，详细说明：{@link #FIELD_DSTPSDEACTIONNAME}
     * 
     * @param dstPSDEActionName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEACTIONNAME)
    public void setDstPSDEActionName(String dstPSDEActionName){
        this.set(FIELD_DSTPSDEACTIONNAME, dstPSDEActionName);
    }
    
    /**
     * 获取 操作行为  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEActionName(){
        Object objValue = this.get(FIELD_DSTPSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEActionNameDirty(){
        if(this.contains(FIELD_DSTPSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作行为
     */
    @JsonIgnore
    public void resetDstPSDEActionName(){
        this.reset(FIELD_DSTPSDEACTIONNAME);
    }

    /**
     * 设置 操作行为，详细说明：{@link #FIELD_DSTPSDEACTIONNAME}
     * <P>
     * 等同 {@link #setDstPSDEActionName}
     * @param dstPSDEActionName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeactionname(String dstPSDEActionName){
        this.setDstPSDEActionName(dstPSDEActionName);
        return this;
    }

    /**
     * <B>DSTPSDEDATAEXPID</B>&nbsp;目标数据导出
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataExpDTO} 
     */
    public final static String FIELD_DSTPSDEDATAEXPID = "dstpsdedataexpid";

    /**
     * 设置 目标数据导出
     * 
     * @param dstPSDEDataExpId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAEXPID)
    public void setDstPSDEDataExpId(String dstPSDEDataExpId){
        this.set(FIELD_DSTPSDEDATAEXPID, dstPSDEDataExpId);
    }
    
    /**
     * 获取 目标数据导出  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataExpId(){
        Object objValue = this.get(FIELD_DSTPSDEDATAEXPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataExpIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATAEXPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据导出
     */
    @JsonIgnore
    public void resetDstPSDEDataExpId(){
        this.reset(FIELD_DSTPSDEDATAEXPID);
    }

    /**
     * 设置 目标数据导出
     * <P>
     * 等同 {@link #setDstPSDEDataExpId}
     * @param dstPSDEDataExpId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataexpid(String dstPSDEDataExpId){
        this.setDstPSDEDataExpId(dstPSDEDataExpId);
        return this;
    }

    /**
     * 设置 目标数据导出，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataExpId}
     * @param pSDEDataExp 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataexpid(PSDEDataExpDTO pSDEDataExp){
        if(pSDEDataExp == null){
            this.setDstPSDEDataExpId(null);
            this.setDstPSDEDataExpName(null);
        }
        else{
            this.setDstPSDEDataExpId(pSDEDataExp.getPSDEDataExpId());
            this.setDstPSDEDataExpName(pSDEDataExp.getPSDEDataExpName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATAEXPNAME</B>&nbsp;目标数据导出
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATAEXPID}
     */
    public final static String FIELD_DSTPSDEDATAEXPNAME = "dstpsdedataexpname";

    /**
     * 设置 目标数据导出
     * 
     * @param dstPSDEDataExpName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAEXPNAME)
    public void setDstPSDEDataExpName(String dstPSDEDataExpName){
        this.set(FIELD_DSTPSDEDATAEXPNAME, dstPSDEDataExpName);
    }
    
    /**
     * 获取 目标数据导出  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataExpName(){
        Object objValue = this.get(FIELD_DSTPSDEDATAEXPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据导出 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataExpNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATAEXPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据导出
     */
    @JsonIgnore
    public void resetDstPSDEDataExpName(){
        this.reset(FIELD_DSTPSDEDATAEXPNAME);
    }

    /**
     * 设置 目标数据导出
     * <P>
     * 等同 {@link #setDstPSDEDataExpName}
     * @param dstPSDEDataExpName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataexpname(String dstPSDEDataExpName){
        this.setDstPSDEDataExpName(dstPSDEDataExpName);
        return this;
    }

    /**
     * <B>DSTPSDEDATAIMPID</B>&nbsp;目标数据导入
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO} 
     */
    public final static String FIELD_DSTPSDEDATAIMPID = "dstpsdedataimpid";

    /**
     * 设置 目标数据导入
     * 
     * @param dstPSDEDataImpId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAIMPID)
    public void setDstPSDEDataImpId(String dstPSDEDataImpId){
        this.set(FIELD_DSTPSDEDATAIMPID, dstPSDEDataImpId);
    }
    
    /**
     * 获取 目标数据导入  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataImpId(){
        Object objValue = this.get(FIELD_DSTPSDEDATAIMPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataImpIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATAIMPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据导入
     */
    @JsonIgnore
    public void resetDstPSDEDataImpId(){
        this.reset(FIELD_DSTPSDEDATAIMPID);
    }

    /**
     * 设置 目标数据导入
     * <P>
     * 等同 {@link #setDstPSDEDataImpId}
     * @param dstPSDEDataImpId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataimpid(String dstPSDEDataImpId){
        this.setDstPSDEDataImpId(dstPSDEDataImpId);
        return this;
    }

    /**
     * 设置 目标数据导入，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataImpId}
     * @param pSDEDataImp 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataimpid(PSDEDataImpDTO pSDEDataImp){
        if(pSDEDataImp == null){
            this.setDstPSDEDataImpId(null);
            this.setDstPSDEDataImpName(null);
        }
        else{
            this.setDstPSDEDataImpId(pSDEDataImp.getPSDEDataImpId());
            this.setDstPSDEDataImpName(pSDEDataImp.getPSDEDataImpName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATAIMPNAME</B>&nbsp;目标数据导入
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATAIMPID}
     */
    public final static String FIELD_DSTPSDEDATAIMPNAME = "dstpsdedataimpname";

    /**
     * 设置 目标数据导入
     * 
     * @param dstPSDEDataImpName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAIMPNAME)
    public void setDstPSDEDataImpName(String dstPSDEDataImpName){
        this.set(FIELD_DSTPSDEDATAIMPNAME, dstPSDEDataImpName);
    }
    
    /**
     * 获取 目标数据导入  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataImpName(){
        Object objValue = this.get(FIELD_DSTPSDEDATAIMPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据导入 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataImpNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATAIMPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据导入
     */
    @JsonIgnore
    public void resetDstPSDEDataImpName(){
        this.reset(FIELD_DSTPSDEDATAIMPNAME);
    }

    /**
     * 设置 目标数据导入
     * <P>
     * 等同 {@link #setDstPSDEDataImpName}
     * @param dstPSDEDataImpName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataimpname(String dstPSDEDataImpName){
        this.setDstPSDEDataImpName(dstPSDEDataImpName);
        return this;
    }

    /**
     * <B>DSTPSDEDATAQUERYID</B>&nbsp;数据查询
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO} 
     */
    public final static String FIELD_DSTPSDEDATAQUERYID = "dstpsdedataqueryid";

    /**
     * 设置 数据查询
     * 
     * @param dstPSDEDataQueryId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAQUERYID)
    public void setDstPSDEDataQueryId(String dstPSDEDataQueryId){
        this.set(FIELD_DSTPSDEDATAQUERYID, dstPSDEDataQueryId);
    }
    
    /**
     * 获取 数据查询  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataQueryId(){
        Object objValue = this.get(FIELD_DSTPSDEDATAQUERYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataQueryIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATAQUERYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据查询
     */
    @JsonIgnore
    public void resetDstPSDEDataQueryId(){
        this.reset(FIELD_DSTPSDEDATAQUERYID);
    }

    /**
     * 设置 数据查询
     * <P>
     * 等同 {@link #setDstPSDEDataQueryId}
     * @param dstPSDEDataQueryId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataqueryid(String dstPSDEDataQueryId){
        this.setDstPSDEDataQueryId(dstPSDEDataQueryId);
        return this;
    }

    /**
     * 设置 数据查询，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataQueryId}
     * @param pSDEDataQuery 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataqueryid(PSDEDataQueryDTO pSDEDataQuery){
        if(pSDEDataQuery == null){
            this.setDstPSDEDataQueryId(null);
            this.setDstPSDEDataQueryName(null);
        }
        else{
            this.setDstPSDEDataQueryId(pSDEDataQuery.getPSDEDataQueryId());
            this.setDstPSDEDataQueryName(pSDEDataQuery.getPSDEDataQueryName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATAQUERYNAME</B>&nbsp;目标数据查询
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATAQUERYID}
     */
    public final static String FIELD_DSTPSDEDATAQUERYNAME = "dstpsdedataqueryname";

    /**
     * 设置 目标数据查询
     * 
     * @param dstPSDEDataQueryName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATAQUERYNAME)
    public void setDstPSDEDataQueryName(String dstPSDEDataQueryName){
        this.set(FIELD_DSTPSDEDATAQUERYNAME, dstPSDEDataQueryName);
    }
    
    /**
     * 获取 目标数据查询  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataQueryName(){
        Object objValue = this.get(FIELD_DSTPSDEDATAQUERYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标数据查询 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataQueryNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATAQUERYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标数据查询
     */
    @JsonIgnore
    public void resetDstPSDEDataQueryName(){
        this.reset(FIELD_DSTPSDEDATAQUERYNAME);
    }

    /**
     * 设置 目标数据查询
     * <P>
     * 等同 {@link #setDstPSDEDataQueryName}
     * @param dstPSDEDataQueryName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedataqueryname(String dstPSDEDataQueryName){
        this.setDstPSDEDataQueryName(dstPSDEDataQueryName);
        return this;
    }

    /**
     * <B>DSTPSDEDATASETID</B>&nbsp;目标数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSetDTO} 
     */
    public final static String FIELD_DSTPSDEDATASETID = "dstpsdedatasetid";

    /**
     * 设置 目标数据集
     * 
     * @param dstPSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASETID)
    public void setDstPSDEDataSetId(String dstPSDEDataSetId){
        this.set(FIELD_DSTPSDEDATASETID, dstPSDEDataSetId);
    }
    
    /**
     * 获取 目标数据集  
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
     * 判断 目标数据集 是否指定值，包括空值
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
     * 重置 目标数据集
     */
    @JsonIgnore
    public void resetDstPSDEDataSetId(){
        this.reset(FIELD_DSTPSDEDATASETID);
    }

    /**
     * 设置 目标数据集
     * <P>
     * 等同 {@link #setDstPSDEDataSetId}
     * @param dstPSDEDataSetId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasetid(String dstPSDEDataSetId){
        this.setDstPSDEDataSetId(dstPSDEDataSetId);
        return this;
    }

    /**
     * 设置 目标数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasetid(PSDEDataSetDTO pSDEDataSet){
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
     * <B>DSTPSDEDATASETNAME</B>&nbsp;目标数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATASETID}
     */
    public final static String FIELD_DSTPSDEDATASETNAME = "dstpsdedatasetname";

    /**
     * 设置 目标数据集
     * 
     * @param dstPSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASETNAME)
    public void setDstPSDEDataSetName(String dstPSDEDataSetName){
        this.set(FIELD_DSTPSDEDATASETNAME, dstPSDEDataSetName);
    }
    
    /**
     * 获取 目标数据集  
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
     * 判断 目标数据集 是否指定值，包括空值
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
     * 重置 目标数据集
     */
    @JsonIgnore
    public void resetDstPSDEDataSetName(){
        this.reset(FIELD_DSTPSDEDATASETNAME);
    }

    /**
     * 设置 目标数据集
     * <P>
     * 等同 {@link #setDstPSDEDataSetName}
     * @param dstPSDEDataSetName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasetname(String dstPSDEDataSetName){
        this.setDstPSDEDataSetName(dstPSDEDataSetName);
        return this;
    }

    /**
     * <B>DSTPSDEDATASYNCID</B>&nbsp;目标实体数据同步
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDataSyncDTO} 
     */
    public final static String FIELD_DSTPSDEDATASYNCID = "dstpsdedatasyncid";

    /**
     * 设置 目标实体数据同步
     * 
     * @param dstPSDEDataSyncId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASYNCID)
    public void setDstPSDEDataSyncId(String dstPSDEDataSyncId){
        this.set(FIELD_DSTPSDEDATASYNCID, dstPSDEDataSyncId);
    }
    
    /**
     * 获取 目标实体数据同步  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataSyncId(){
        Object objValue = this.get(FIELD_DSTPSDEDATASYNCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体数据同步 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataSyncIdDirty(){
        if(this.contains(FIELD_DSTPSDEDATASYNCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体数据同步
     */
    @JsonIgnore
    public void resetDstPSDEDataSyncId(){
        this.reset(FIELD_DSTPSDEDATASYNCID);
    }

    /**
     * 设置 目标实体数据同步
     * <P>
     * 等同 {@link #setDstPSDEDataSyncId}
     * @param dstPSDEDataSyncId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasyncid(String dstPSDEDataSyncId){
        this.setDstPSDEDataSyncId(dstPSDEDataSyncId);
        return this;
    }

    /**
     * 设置 目标实体数据同步，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDataSyncId}
     * @param pSDEDataSync 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasyncid(PSDEDataSyncDTO pSDEDataSync){
        if(pSDEDataSync == null){
            this.setDstPSDEDataSyncId(null);
            this.setDstPSDEDataSyncName(null);
        }
        else{
            this.setDstPSDEDataSyncId(pSDEDataSync.getPSDEDataSyncId());
            this.setDstPSDEDataSyncName(pSDEDataSync.getPSDEDataSyncName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDATASYNCNAME</B>&nbsp;目标实体数据同步
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDATASYNCID}
     */
    public final static String FIELD_DSTPSDEDATASYNCNAME = "dstpsdedatasyncname";

    /**
     * 设置 目标实体数据同步
     * 
     * @param dstPSDEDataSyncName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDATASYNCNAME)
    public void setDstPSDEDataSyncName(String dstPSDEDataSyncName){
        this.set(FIELD_DSTPSDEDATASYNCNAME, dstPSDEDataSyncName);
    }
    
    /**
     * 获取 目标实体数据同步  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDataSyncName(){
        Object objValue = this.get(FIELD_DSTPSDEDATASYNCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体数据同步 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDataSyncNameDirty(){
        if(this.contains(FIELD_DSTPSDEDATASYNCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体数据同步
     */
    @JsonIgnore
    public void resetDstPSDEDataSyncName(){
        this.reset(FIELD_DSTPSDEDATASYNCNAME);
    }

    /**
     * 设置 目标实体数据同步
     * <P>
     * 等同 {@link #setDstPSDEDataSyncName}
     * @param dstPSDEDataSyncName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedatasyncname(String dstPSDEDataSyncName){
        this.setDstPSDEDataSyncName(dstPSDEDataSyncName);
        return this;
    }

    /**
     * <B>DSTPSDEDTSQUEUEID</B>&nbsp;实体分布式处理队列
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEDTSQueueDTO} 
     */
    public final static String FIELD_DSTPSDEDTSQUEUEID = "dstpsdedtsqueueid";

    /**
     * 设置 实体分布式处理队列
     * 
     * @param dstPSDEDTSQueueId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDTSQUEUEID)
    public void setDstPSDEDTSQueueId(String dstPSDEDTSQueueId){
        this.set(FIELD_DSTPSDEDTSQUEUEID, dstPSDEDTSQueueId);
    }
    
    /**
     * 获取 实体分布式处理队列  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDTSQueueId(){
        Object objValue = this.get(FIELD_DSTPSDEDTSQUEUEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体分布式处理队列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDTSQueueIdDirty(){
        if(this.contains(FIELD_DSTPSDEDTSQUEUEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体分布式处理队列
     */
    @JsonIgnore
    public void resetDstPSDEDTSQueueId(){
        this.reset(FIELD_DSTPSDEDTSQUEUEID);
    }

    /**
     * 设置 实体分布式处理队列
     * <P>
     * 等同 {@link #setDstPSDEDTSQueueId}
     * @param dstPSDEDTSQueueId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedtsqueueid(String dstPSDEDTSQueueId){
        this.setDstPSDEDTSQueueId(dstPSDEDTSQueueId);
        return this;
    }

    /**
     * 设置 实体分布式处理队列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEDTSQueueId}
     * @param pSDEDTSQueue 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedtsqueueid(PSDEDTSQueueDTO pSDEDTSQueue){
        if(pSDEDTSQueue == null){
            this.setDstPSDEDTSQueueId(null);
            this.setDstPSDEDTSQueueName(null);
        }
        else{
            this.setDstPSDEDTSQueueId(pSDEDTSQueue.getPSDEDTSQueueId());
            this.setDstPSDEDTSQueueName(pSDEDTSQueue.getPSDEDTSQueueName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEDTSQUEUENAME</B>&nbsp;实体异步处理队列
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEDTSQUEUEID}
     */
    public final static String FIELD_DSTPSDEDTSQUEUENAME = "dstpsdedtsqueuename";

    /**
     * 设置 实体异步处理队列
     * 
     * @param dstPSDEDTSQueueName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEDTSQUEUENAME)
    public void setDstPSDEDTSQueueName(String dstPSDEDTSQueueName){
        this.set(FIELD_DSTPSDEDTSQUEUENAME, dstPSDEDTSQueueName);
    }
    
    /**
     * 获取 实体异步处理队列  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEDTSQueueName(){
        Object objValue = this.get(FIELD_DSTPSDEDTSQUEUENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体异步处理队列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEDTSQueueNameDirty(){
        if(this.contains(FIELD_DSTPSDEDTSQUEUENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体异步处理队列
     */
    @JsonIgnore
    public void resetDstPSDEDTSQueueName(){
        this.reset(FIELD_DSTPSDEDTSQUEUENAME);
    }

    /**
     * 设置 实体异步处理队列
     * <P>
     * 等同 {@link #setDstPSDEDTSQueueName}
     * @param dstPSDEDTSQueueName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdedtsqueuename(String dstPSDEDTSQueueName){
        this.setDstPSDEDTSQueueName(dstPSDEDTSQueueName);
        return this;
    }

    /**
     * <B>DSTPSDEFGROUPID</B>&nbsp;目标实体属性组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFGroupDTO} 
     */
    public final static String FIELD_DSTPSDEFGROUPID = "dstpsdefgroupid";

    /**
     * 设置 目标实体属性组
     * 
     * @param dstPSDEFGroupId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFGROUPID)
    public void setDstPSDEFGroupId(String dstPSDEFGroupId){
        this.set(FIELD_DSTPSDEFGROUPID, dstPSDEFGroupId);
    }
    
    /**
     * 获取 目标实体属性组  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFGroupId(){
        Object objValue = this.get(FIELD_DSTPSDEFGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFGroupIdDirty(){
        if(this.contains(FIELD_DSTPSDEFGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体属性组
     */
    @JsonIgnore
    public void resetDstPSDEFGroupId(){
        this.reset(FIELD_DSTPSDEFGROUPID);
    }

    /**
     * 设置 目标实体属性组
     * <P>
     * 等同 {@link #setDstPSDEFGroupId}
     * @param dstPSDEFGroupId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefgroupid(String dstPSDEFGroupId){
        this.setDstPSDEFGroupId(dstPSDEFGroupId);
        return this;
    }

    /**
     * 设置 目标实体属性组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFGroupId}
     * @param pSDEFGroup 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefgroupid(PSDEFGroupDTO pSDEFGroup){
        if(pSDEFGroup == null){
            this.setDstPSDEFGroupId(null);
            this.setDstPSDEFGroupName(null);
        }
        else{
            this.setDstPSDEFGroupId(pSDEFGroup.getPSDEFGroupId());
            this.setDstPSDEFGroupName(pSDEFGroup.getPSDEFGroupName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEFGROUPNAME</B>&nbsp;目标实体属性组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFGROUPID}
     */
    public final static String FIELD_DSTPSDEFGROUPNAME = "dstpsdefgroupname";

    /**
     * 设置 目标实体属性组
     * 
     * @param dstPSDEFGroupName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFGROUPNAME)
    public void setDstPSDEFGroupName(String dstPSDEFGroupName){
        this.set(FIELD_DSTPSDEFGROUPNAME, dstPSDEFGroupName);
    }
    
    /**
     * 获取 目标实体属性组  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFGroupName(){
        Object objValue = this.get(FIELD_DSTPSDEFGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体属性组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFGroupNameDirty(){
        if(this.contains(FIELD_DSTPSDEFGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体属性组
     */
    @JsonIgnore
    public void resetDstPSDEFGroupName(){
        this.reset(FIELD_DSTPSDEFGROUPNAME);
    }

    /**
     * 设置 目标实体属性组
     * <P>
     * 等同 {@link #setDstPSDEFGroupName}
     * @param dstPSDEFGroupName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefgroupname(String dstPSDEFGroupName){
        this.setDstPSDEFGroupName(dstPSDEFGroupName);
        return this;
    }

    /**
     * <B>DSTPSDEFORMID</B>&nbsp;目标实体表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFormDTO} 
     */
    public final static String FIELD_DSTPSDEFORMID = "dstpsdeformid";

    /**
     * 设置 目标实体表单
     * 
     * @param dstPSDEFormId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFORMID)
    public void setDstPSDEFormId(String dstPSDEFormId){
        this.set(FIELD_DSTPSDEFORMID, dstPSDEFormId);
    }
    
    /**
     * 获取 目标实体表单  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFormId(){
        Object objValue = this.get(FIELD_DSTPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFormIdDirty(){
        if(this.contains(FIELD_DSTPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体表单
     */
    @JsonIgnore
    public void resetDstPSDEFormId(){
        this.reset(FIELD_DSTPSDEFORMID);
    }

    /**
     * 设置 目标实体表单
     * <P>
     * 等同 {@link #setDstPSDEFormId}
     * @param dstPSDEFormId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeformid(String dstPSDEFormId){
        this.setDstPSDEFormId(dstPSDEFormId);
        return this;
    }

    /**
     * 设置 目标实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeformid(PSDEFormDTO pSDEForm){
        if(pSDEForm == null){
            this.setDstPSDEFormId(null);
            this.setDstPSDEFormName(null);
        }
        else{
            this.setDstPSDEFormId(pSDEForm.getPSDEFormId());
            this.setDstPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEFORMNAME</B>&nbsp;目标实体表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFORMID}
     */
    public final static String FIELD_DSTPSDEFORMNAME = "dstpsdeformname";

    /**
     * 设置 目标实体表单
     * 
     * @param dstPSDEFormName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFORMNAME)
    public void setDstPSDEFormName(String dstPSDEFormName){
        this.set(FIELD_DSTPSDEFORMNAME, dstPSDEFormName);
    }
    
    /**
     * 获取 目标实体表单  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFormName(){
        Object objValue = this.get(FIELD_DSTPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFormNameDirty(){
        if(this.contains(FIELD_DSTPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体表单
     */
    @JsonIgnore
    public void resetDstPSDEFormName(){
        this.reset(FIELD_DSTPSDEFORMNAME);
    }

    /**
     * 设置 目标实体表单
     * <P>
     * 等同 {@link #setDstPSDEFormName}
     * @param dstPSDEFormName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeformname(String dstPSDEFormName){
        this.setDstPSDEFormName(dstPSDEFormName);
        return this;
    }

    /**
     * <B>DSTPSDEFVALUERULEID</B>&nbsp;目标属性值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO} 
     */
    public final static String FIELD_DSTPSDEFVALUERULEID = "dstpsdefvalueruleid";

    /**
     * 设置 目标属性值规则
     * 
     * @param dstPSDEFValueRuleId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFVALUERULEID)
    public void setDstPSDEFValueRuleId(String dstPSDEFValueRuleId){
        this.set(FIELD_DSTPSDEFVALUERULEID, dstPSDEFValueRuleId);
    }
    
    /**
     * 获取 目标属性值规则  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFValueRuleId(){
        Object objValue = this.get(FIELD_DSTPSDEFVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFValueRuleIdDirty(){
        if(this.contains(FIELD_DSTPSDEFVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性值规则
     */
    @JsonIgnore
    public void resetDstPSDEFValueRuleId(){
        this.reset(FIELD_DSTPSDEFVALUERULEID);
    }

    /**
     * 设置 目标属性值规则
     * <P>
     * 等同 {@link #setDstPSDEFValueRuleId}
     * @param dstPSDEFValueRuleId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefvalueruleid(String dstPSDEFValueRuleId){
        this.setDstPSDEFValueRuleId(dstPSDEFValueRuleId);
        return this;
    }

    /**
     * 设置 目标属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEFValueRuleId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefvalueruleid(PSDEFValueRuleDTO pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setDstPSDEFValueRuleId(null);
            this.setDstPSDEFValueRuleName(null);
        }
        else{
            this.setDstPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setDstPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEFVALUERULENAME</B>&nbsp;目标属性值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEFVALUERULEID}
     */
    public final static String FIELD_DSTPSDEFVALUERULENAME = "dstpsdefvaluerulename";

    /**
     * 设置 目标属性值规则
     * 
     * @param dstPSDEFValueRuleName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEFVALUERULENAME)
    public void setDstPSDEFValueRuleName(String dstPSDEFValueRuleName){
        this.set(FIELD_DSTPSDEFVALUERULENAME, dstPSDEFValueRuleName);
    }
    
    /**
     * 获取 目标属性值规则  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEFValueRuleName(){
        Object objValue = this.get(FIELD_DSTPSDEFVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEFValueRuleNameDirty(){
        if(this.contains(FIELD_DSTPSDEFVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标属性值规则
     */
    @JsonIgnore
    public void resetDstPSDEFValueRuleName(){
        this.reset(FIELD_DSTPSDEFVALUERULENAME);
    }

    /**
     * 设置 目标属性值规则
     * <P>
     * 等同 {@link #setDstPSDEFValueRuleName}
     * @param dstPSDEFValueRuleName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdefvaluerulename(String dstPSDEFValueRuleName){
        this.setDstPSDEFValueRuleName(dstPSDEFValueRuleName);
        return this;
    }

    /**
     * <B>DSTPSDEID</B>&nbsp;操作实体，指定对目标参数的操作行为的所在实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDataEntityDTO} 
     */
    public final static String FIELD_DSTPSDEID = "dstpsdeid";

    /**
     * 设置 操作实体，详细说明：{@link #FIELD_DSTPSDEID}
     * 
     * @param dstPSDEId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEID)
    public void setDstPSDEId(String dstPSDEId){
        this.set(FIELD_DSTPSDEID, dstPSDEId);
    }
    
    /**
     * 获取 操作实体  
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
     * 判断 操作实体 是否指定值，包括空值
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
     * 重置 操作实体
     */
    @JsonIgnore
    public void resetDstPSDEId(){
        this.reset(FIELD_DSTPSDEID);
    }

    /**
     * 设置 操作实体，详细说明：{@link #FIELD_DSTPSDEID}
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param dstPSDEId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeid(String dstPSDEId){
        this.setDstPSDEId(dstPSDEId);
        return this;
    }

    /**
     * 设置 操作实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeid(PSDataEntityDTO pSDataEntity){
        if(pSDataEntity == null){
            this.setDstPSDEId(null);
            this.setDstPSDEName(null);
        }
        else{
            this.setDstPSDEId(pSDataEntity.getPSDataEntityId());
            this.setDstPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>DSTPSDELOGICID</B>&nbsp;目标处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_DSTPSDELOGICID = "dstpsdelogicid";

    /**
     * 设置 目标处理逻辑
     * 
     * @param dstPSDELogicId
     * 
     */
    @JsonProperty(FIELD_DSTPSDELOGICID)
    public void setDstPSDELogicId(String dstPSDELogicId){
        this.set(FIELD_DSTPSDELOGICID, dstPSDELogicId);
    }
    
    /**
     * 获取 目标处理逻辑  
     * @return
     */
    @JsonIgnore
    public String getDstPSDELogicId(){
        Object objValue = this.get(FIELD_DSTPSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标处理逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDELogicIdDirty(){
        if(this.contains(FIELD_DSTPSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标处理逻辑
     */
    @JsonIgnore
    public void resetDstPSDELogicId(){
        this.reset(FIELD_DSTPSDELOGICID);
    }

    /**
     * 设置 目标处理逻辑
     * <P>
     * 等同 {@link #setDstPSDELogicId}
     * @param dstPSDELogicId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdelogicid(String dstPSDELogicId){
        this.setDstPSDELogicId(dstPSDELogicId);
        return this;
    }

    /**
     * 设置 目标处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdelogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setDstPSDELogicId(null);
            this.setDstPSDELogicName(null);
        }
        else{
            this.setDstPSDELogicId(pSDELogic.getPSDELogicId());
            this.setDstPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>DSTPSDELOGICNAME</B>&nbsp;目标处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDELOGICID}
     */
    public final static String FIELD_DSTPSDELOGICNAME = "dstpsdelogicname";

    /**
     * 设置 目标处理逻辑
     * 
     * @param dstPSDELogicName
     * 
     */
    @JsonProperty(FIELD_DSTPSDELOGICNAME)
    public void setDstPSDELogicName(String dstPSDELogicName){
        this.set(FIELD_DSTPSDELOGICNAME, dstPSDELogicName);
    }
    
    /**
     * 获取 目标处理逻辑  
     * @return
     */
    @JsonIgnore
    public String getDstPSDELogicName(){
        Object objValue = this.get(FIELD_DSTPSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标处理逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDELogicNameDirty(){
        if(this.contains(FIELD_DSTPSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标处理逻辑
     */
    @JsonIgnore
    public void resetDstPSDELogicName(){
        this.reset(FIELD_DSTPSDELOGICNAME);
    }

    /**
     * 设置 目标处理逻辑
     * <P>
     * 等同 {@link #setDstPSDELogicName}
     * @param dstPSDELogicName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdelogicname(String dstPSDELogicName){
        this.setDstPSDELogicName(dstPSDELogicName);
        return this;
    }

    /**
     * <B>DSTPSDEMAPID</B>&nbsp;目标实体映射
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMapDTO} 
     */
    public final static String FIELD_DSTPSDEMAPID = "dstpsdemapid";

    /**
     * 设置 目标实体映射
     * 
     * @param dstPSDEMapId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEMAPID)
    public void setDstPSDEMapId(String dstPSDEMapId){
        this.set(FIELD_DSTPSDEMAPID, dstPSDEMapId);
    }
    
    /**
     * 获取 目标实体映射  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEMapId(){
        Object objValue = this.get(FIELD_DSTPSDEMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEMapIdDirty(){
        if(this.contains(FIELD_DSTPSDEMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体映射
     */
    @JsonIgnore
    public void resetDstPSDEMapId(){
        this.reset(FIELD_DSTPSDEMAPID);
    }

    /**
     * 设置 目标实体映射
     * <P>
     * 等同 {@link #setDstPSDEMapId}
     * @param dstPSDEMapId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdemapid(String dstPSDEMapId){
        this.setDstPSDEMapId(dstPSDEMapId);
        return this;
    }

    /**
     * 设置 目标实体映射，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEMapId}
     * @param pSDEMap 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdemapid(PSDEMapDTO pSDEMap){
        if(pSDEMap == null){
            this.setDstPSDEMapId(null);
            this.setDstPSDEMapName(null);
        }
        else{
            this.setDstPSDEMapId(pSDEMap.getPSDEMapId());
            this.setDstPSDEMapName(pSDEMap.getPSDEMapName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEMAPNAME</B>&nbsp;目标实体映射
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEMAPID}
     */
    public final static String FIELD_DSTPSDEMAPNAME = "dstpsdemapname";

    /**
     * 设置 目标实体映射
     * 
     * @param dstPSDEMapName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEMAPNAME)
    public void setDstPSDEMapName(String dstPSDEMapName){
        this.set(FIELD_DSTPSDEMAPNAME, dstPSDEMapName);
    }
    
    /**
     * 获取 目标实体映射  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEMapName(){
        Object objValue = this.get(FIELD_DSTPSDEMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体映射 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEMapNameDirty(){
        if(this.contains(FIELD_DSTPSDEMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体映射
     */
    @JsonIgnore
    public void resetDstPSDEMapName(){
        this.reset(FIELD_DSTPSDEMAPNAME);
    }

    /**
     * 设置 目标实体映射
     * <P>
     * 等同 {@link #setDstPSDEMapName}
     * @param dstPSDEMapName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdemapname(String dstPSDEMapName){
        this.setDstPSDEMapName(dstPSDEMapName);
        return this;
    }

    /**
     * <B>DSTPSDENAME</B>&nbsp;操作实体，指定对目标参数的操作行为的所在实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEID}
     */
    public final static String FIELD_DSTPSDENAME = "dstpsdename";

    /**
     * 设置 操作实体，详细说明：{@link #FIELD_DSTPSDENAME}
     * 
     * @param dstPSDEName
     * 
     */
    @JsonProperty(FIELD_DSTPSDENAME)
    public void setDstPSDEName(String dstPSDEName){
        this.set(FIELD_DSTPSDENAME, dstPSDEName);
    }
    
    /**
     * 获取 操作实体  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEName(){
        Object objValue = this.get(FIELD_DSTPSDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDENameDirty(){
        if(this.contains(FIELD_DSTPSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作实体
     */
    @JsonIgnore
    public void resetDstPSDEName(){
        this.reset(FIELD_DSTPSDENAME);
    }

    /**
     * 设置 操作实体，详细说明：{@link #FIELD_DSTPSDENAME}
     * <P>
     * 等同 {@link #setDstPSDEName}
     * @param dstPSDEName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdename(String dstPSDEName){
        this.setDstPSDEName(dstPSDEName);
        return this;
    }

    /**
     * <B>DSTPSDENOTIFYID</B>&nbsp;目标实体通知
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDENotifyDTO} 
     */
    public final static String FIELD_DSTPSDENOTIFYID = "dstpsdenotifyid";

    /**
     * 设置 目标实体通知
     * 
     * @param dstPSDENotifyId
     * 
     */
    @JsonProperty(FIELD_DSTPSDENOTIFYID)
    public void setDstPSDENotifyId(String dstPSDENotifyId){
        this.set(FIELD_DSTPSDENOTIFYID, dstPSDENotifyId);
    }
    
    /**
     * 获取 目标实体通知  
     * @return
     */
    @JsonIgnore
    public String getDstPSDENotifyId(){
        Object objValue = this.get(FIELD_DSTPSDENOTIFYID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体通知 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDENotifyIdDirty(){
        if(this.contains(FIELD_DSTPSDENOTIFYID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体通知
     */
    @JsonIgnore
    public void resetDstPSDENotifyId(){
        this.reset(FIELD_DSTPSDENOTIFYID);
    }

    /**
     * 设置 目标实体通知
     * <P>
     * 等同 {@link #setDstPSDENotifyId}
     * @param dstPSDENotifyId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdenotifyid(String dstPSDENotifyId){
        this.setDstPSDENotifyId(dstPSDENotifyId);
        return this;
    }

    /**
     * 设置 目标实体通知，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDENotifyId}
     * @param pSDENotify 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdenotifyid(PSDENotifyDTO pSDENotify){
        if(pSDENotify == null){
            this.setDstPSDENotifyId(null);
            this.setDstPSDENotifyName(null);
        }
        else{
            this.setDstPSDENotifyId(pSDENotify.getPSDENotifyId());
            this.setDstPSDENotifyName(pSDENotify.getPSDENotifyName());
        }
        return this;
    }

    /**
     * <B>DSTPSDENOTIFYNAME</B>&nbsp;目标实体通知
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDENOTIFYID}
     */
    public final static String FIELD_DSTPSDENOTIFYNAME = "dstpsdenotifyname";

    /**
     * 设置 目标实体通知
     * 
     * @param dstPSDENotifyName
     * 
     */
    @JsonProperty(FIELD_DSTPSDENOTIFYNAME)
    public void setDstPSDENotifyName(String dstPSDENotifyName){
        this.set(FIELD_DSTPSDENOTIFYNAME, dstPSDENotifyName);
    }
    
    /**
     * 获取 目标实体通知  
     * @return
     */
    @JsonIgnore
    public String getDstPSDENotifyName(){
        Object objValue = this.get(FIELD_DSTPSDENOTIFYNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体通知 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDENotifyNameDirty(){
        if(this.contains(FIELD_DSTPSDENOTIFYNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体通知
     */
    @JsonIgnore
    public void resetDstPSDENotifyName(){
        this.reset(FIELD_DSTPSDENOTIFYNAME);
    }

    /**
     * 设置 目标实体通知
     * <P>
     * 等同 {@link #setDstPSDENotifyName}
     * @param dstPSDENotifyName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdenotifyname(String dstPSDENotifyName){
        this.setDstPSDENotifyName(dstPSDENotifyName);
        return this;
    }

    /**
     * <B>DSTPSDEPRINTID</B>&nbsp;实体打印
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEPrintDTO} 
     */
    public final static String FIELD_DSTPSDEPRINTID = "dstpsdeprintid";

    /**
     * 设置 实体打印
     * 
     * @param dstPSDEPrintId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEPRINTID)
    public void setDstPSDEPrintId(String dstPSDEPrintId){
        this.set(FIELD_DSTPSDEPRINTID, dstPSDEPrintId);
    }
    
    /**
     * 获取 实体打印  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEPrintId(){
        Object objValue = this.get(FIELD_DSTPSDEPRINTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEPrintIdDirty(){
        if(this.contains(FIELD_DSTPSDEPRINTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印
     */
    @JsonIgnore
    public void resetDstPSDEPrintId(){
        this.reset(FIELD_DSTPSDEPRINTID);
    }

    /**
     * 设置 实体打印
     * <P>
     * 等同 {@link #setDstPSDEPrintId}
     * @param dstPSDEPrintId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeprintid(String dstPSDEPrintId){
        this.setDstPSDEPrintId(dstPSDEPrintId);
        return this;
    }

    /**
     * 设置 实体打印，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEPrintId}
     * @param pSDEPrint 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeprintid(PSDEPrintDTO pSDEPrint){
        if(pSDEPrint == null){
            this.setDstPSDEPrintId(null);
            this.setDstPSDEPrintName(null);
        }
        else{
            this.setDstPSDEPrintId(pSDEPrint.getPSDEPrintId());
            this.setDstPSDEPrintName(pSDEPrint.getPSDEPrintName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEPRINTNAME</B>&nbsp;实体打印
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEPRINTID}
     */
    public final static String FIELD_DSTPSDEPRINTNAME = "dstpsdeprintname";

    /**
     * 设置 实体打印
     * 
     * @param dstPSDEPrintName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEPRINTNAME)
    public void setDstPSDEPrintName(String dstPSDEPrintName){
        this.set(FIELD_DSTPSDEPRINTNAME, dstPSDEPrintName);
    }
    
    /**
     * 获取 实体打印  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEPrintName(){
        Object objValue = this.get(FIELD_DSTPSDEPRINTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体打印 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEPrintNameDirty(){
        if(this.contains(FIELD_DSTPSDEPRINTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体打印
     */
    @JsonIgnore
    public void resetDstPSDEPrintName(){
        this.reset(FIELD_DSTPSDEPRINTNAME);
    }

    /**
     * 设置 实体打印
     * <P>
     * 等同 {@link #setDstPSDEPrintName}
     * @param dstPSDEPrintName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeprintname(String dstPSDEPrintName){
        this.setDstPSDEPrintName(dstPSDEPrintName);
        return this;
    }

    /**
     * <B>DSTPSDEREPORTID</B>&nbsp;实体报表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEReportDTO} 
     */
    public final static String FIELD_DSTPSDEREPORTID = "dstpsdereportid";

    /**
     * 设置 实体报表
     * 
     * @param dstPSDEReportId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEREPORTID)
    public void setDstPSDEReportId(String dstPSDEReportId){
        this.set(FIELD_DSTPSDEREPORTID, dstPSDEReportId);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEReportId(){
        Object objValue = this.get(FIELD_DSTPSDEREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEReportIdDirty(){
        if(this.contains(FIELD_DSTPSDEREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetDstPSDEReportId(){
        this.reset(FIELD_DSTPSDEREPORTID);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setDstPSDEReportId}
     * @param dstPSDEReportId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdereportid(String dstPSDEReportId){
        this.setDstPSDEReportId(dstPSDEReportId);
        return this;
    }

    /**
     * 设置 实体报表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEReportId}
     * @param pSDEReport 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdereportid(PSDEReportDTO pSDEReport){
        if(pSDEReport == null){
            this.setDstPSDEReportId(null);
            this.setDstPSDEReportName(null);
        }
        else{
            this.setDstPSDEReportId(pSDEReport.getPSDEReportId());
            this.setDstPSDEReportName(pSDEReport.getPSDEReportName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEREPORTNAME</B>&nbsp;实体报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEREPORTID}
     */
    public final static String FIELD_DSTPSDEREPORTNAME = "dstpsdereportname";

    /**
     * 设置 实体报表
     * 
     * @param dstPSDEReportName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEREPORTNAME)
    public void setDstPSDEReportName(String dstPSDEReportName){
        this.set(FIELD_DSTPSDEREPORTNAME, dstPSDEReportName);
    }
    
    /**
     * 获取 实体报表  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEReportName(){
        Object objValue = this.get(FIELD_DSTPSDEREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEReportNameDirty(){
        if(this.contains(FIELD_DSTPSDEREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体报表
     */
    @JsonIgnore
    public void resetDstPSDEReportName(){
        this.reset(FIELD_DSTPSDEREPORTNAME);
    }

    /**
     * 设置 实体报表
     * <P>
     * 等同 {@link #setDstPSDEReportName}
     * @param dstPSDEReportName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdereportname(String dstPSDEReportName){
        this.setDstPSDEReportName(dstPSDEReportName);
        return this;
    }

    /**
     * <B>DSTPSDEUAGROUPID</B>&nbsp;目标界面行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUAGroupDTO} 
     */
    public final static String FIELD_DSTPSDEUAGROUPID = "dstpsdeuagroupid";

    /**
     * 设置 目标界面行为组
     * 
     * @param dstPSDEUAGroupId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEUAGROUPID)
    public void setDstPSDEUAGroupId(String dstPSDEUAGroupId){
        this.set(FIELD_DSTPSDEUAGROUPID, dstPSDEUAGroupId);
    }
    
    /**
     * 获取 目标界面行为组  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEUAGroupId(){
        Object objValue = this.get(FIELD_DSTPSDEUAGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEUAGroupIdDirty(){
        if(this.contains(FIELD_DSTPSDEUAGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标界面行为组
     */
    @JsonIgnore
    public void resetDstPSDEUAGroupId(){
        this.reset(FIELD_DSTPSDEUAGROUPID);
    }

    /**
     * 设置 目标界面行为组
     * <P>
     * 等同 {@link #setDstPSDEUAGroupId}
     * @param dstPSDEUAGroupId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuagroupid(String dstPSDEUAGroupId){
        this.setDstPSDEUAGroupId(dstPSDEUAGroupId);
        return this;
    }

    /**
     * 设置 目标界面行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEUAGroupId}
     * @param pSDEUAGroup 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuagroupid(PSDEUAGroupDTO pSDEUAGroup){
        if(pSDEUAGroup == null){
            this.setDstPSDEUAGroupId(null);
            this.setDstPSDEUAGroupName(null);
        }
        else{
            this.setDstPSDEUAGroupId(pSDEUAGroup.getPSDEUAGroupId());
            this.setDstPSDEUAGroupName(pSDEUAGroup.getPSDEUAGroupName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEUAGROUPNAME</B>&nbsp;目标界面行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEUAGROUPID}
     */
    public final static String FIELD_DSTPSDEUAGROUPNAME = "dstpsdeuagroupname";

    /**
     * 设置 目标界面行为组
     * 
     * @param dstPSDEUAGroupName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEUAGROUPNAME)
    public void setDstPSDEUAGroupName(String dstPSDEUAGroupName){
        this.set(FIELD_DSTPSDEUAGROUPNAME, dstPSDEUAGroupName);
    }
    
    /**
     * 获取 目标界面行为组  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEUAGroupName(){
        Object objValue = this.get(FIELD_DSTPSDEUAGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标界面行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEUAGroupNameDirty(){
        if(this.contains(FIELD_DSTPSDEUAGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标界面行为组
     */
    @JsonIgnore
    public void resetDstPSDEUAGroupName(){
        this.reset(FIELD_DSTPSDEUAGROUPNAME);
    }

    /**
     * 设置 目标界面行为组
     * <P>
     * 等同 {@link #setDstPSDEUAGroupName}
     * @param dstPSDEUAGroupName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuagroupname(String dstPSDEUAGroupName){
        this.setDstPSDEUAGroupName(dstPSDEUAGroupName);
        return this;
    }

    /**
     * <B>DSTPSDEUILOGICID</B>&nbsp;目标界面逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_DSTPSDEUILOGICID = "dstpsdeuilogicid";

    /**
     * 设置 目标界面逻辑
     * 
     * @param dstPSDEUILogicId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEUILOGICID)
    public void setDstPSDEUILogicId(String dstPSDEUILogicId){
        this.set(FIELD_DSTPSDEUILOGICID, dstPSDEUILogicId);
    }
    
    /**
     * 获取 目标界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEUILogicId(){
        Object objValue = this.get(FIELD_DSTPSDEUILOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEUILogicIdDirty(){
        if(this.contains(FIELD_DSTPSDEUILOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标界面逻辑
     */
    @JsonIgnore
    public void resetDstPSDEUILogicId(){
        this.reset(FIELD_DSTPSDEUILOGICID);
    }

    /**
     * 设置 目标界面逻辑
     * <P>
     * 等同 {@link #setDstPSDEUILogicId}
     * @param dstPSDEUILogicId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuilogicid(String dstPSDEUILogicId){
        this.setDstPSDEUILogicId(dstPSDEUILogicId);
        return this;
    }

    /**
     * 设置 目标界面逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEUILogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuilogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setDstPSDEUILogicId(null);
            this.setDstPSDEUILogicName(null);
        }
        else{
            this.setDstPSDEUILogicId(pSDELogic.getPSDELogicId());
            this.setDstPSDEUILogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEUILOGICNAME</B>&nbsp;目标界面逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEUILOGICID}
     */
    public final static String FIELD_DSTPSDEUILOGICNAME = "dstpsdeuilogicname";

    /**
     * 设置 目标界面逻辑
     * 
     * @param dstPSDEUILogicName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEUILOGICNAME)
    public void setDstPSDEUILogicName(String dstPSDEUILogicName){
        this.set(FIELD_DSTPSDEUILOGICNAME, dstPSDEUILogicName);
    }
    
    /**
     * 获取 目标界面逻辑  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEUILogicName(){
        Object objValue = this.get(FIELD_DSTPSDEUILOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标界面逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEUILogicNameDirty(){
        if(this.contains(FIELD_DSTPSDEUILOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标界面逻辑
     */
    @JsonIgnore
    public void resetDstPSDEUILogicName(){
        this.reset(FIELD_DSTPSDEUILOGICNAME);
    }

    /**
     * 设置 目标界面逻辑
     * <P>
     * 等同 {@link #setDstPSDEUILogicName}
     * @param dstPSDEUILogicName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeuilogicname(String dstPSDEUILogicName){
        this.setDstPSDEUILogicName(dstPSDEUILogicName);
        return this;
    }

    /**
     * <B>DSTPSDEVIEWID</B>&nbsp;目标实体视图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO} 
     */
    public final static String FIELD_DSTPSDEVIEWID = "dstpsdeviewid";

    /**
     * 设置 目标实体视图
     * 
     * @param dstPSDEViewId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEVIEWID)
    public void setDstPSDEViewId(String dstPSDEViewId){
        this.set(FIELD_DSTPSDEVIEWID, dstPSDEViewId);
    }
    
    /**
     * 获取 目标实体视图  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEViewId(){
        Object objValue = this.get(FIELD_DSTPSDEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEViewIdDirty(){
        if(this.contains(FIELD_DSTPSDEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体视图
     */
    @JsonIgnore
    public void resetDstPSDEViewId(){
        this.reset(FIELD_DSTPSDEVIEWID);
    }

    /**
     * 设置 目标实体视图
     * <P>
     * 等同 {@link #setDstPSDEViewId}
     * @param dstPSDEViewId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeviewid(String dstPSDEViewId){
        this.setDstPSDEViewId(dstPSDEViewId);
        return this;
    }

    /**
     * 设置 目标实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEViewId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeviewid(PSDEViewBaseDTO pSDEViewBase){
        if(pSDEViewBase == null){
            this.setDstPSDEViewId(null);
            this.setDstPSDEViewName(null);
        }
        else{
            this.setDstPSDEViewId(pSDEViewBase.getPSDEViewBaseId());
            this.setDstPSDEViewName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEVIEWNAME</B>&nbsp;目标实体视图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEVIEWID}
     */
    public final static String FIELD_DSTPSDEVIEWNAME = "dstpsdeviewname";

    /**
     * 设置 目标实体视图
     * 
     * @param dstPSDEViewName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEVIEWNAME)
    public void setDstPSDEViewName(String dstPSDEViewName){
        this.set(FIELD_DSTPSDEVIEWNAME, dstPSDEViewName);
    }
    
    /**
     * 获取 目标实体视图  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEViewName(){
        Object objValue = this.get(FIELD_DSTPSDEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEViewNameDirty(){
        if(this.contains(FIELD_DSTPSDEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体视图
     */
    @JsonIgnore
    public void resetDstPSDEViewName(){
        this.reset(FIELD_DSTPSDEVIEWNAME);
    }

    /**
     * 设置 目标实体视图
     * <P>
     * 等同 {@link #setDstPSDEViewName}
     * @param dstPSDEViewName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdeviewname(String dstPSDEViewName){
        this.setDstPSDEViewName(dstPSDEViewName);
        return this;
    }

    /**
     * <B>DSTPSDEVRGROUPID</B>&nbsp;目标规则组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEVRGroupDTO} 
     */
    public final static String FIELD_DSTPSDEVRGROUPID = "dstpsdevrgroupid";

    /**
     * 设置 目标规则组
     * 
     * @param dstPSDEVRGroupId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEVRGROUPID)
    public void setDstPSDEVRGroupId(String dstPSDEVRGroupId){
        this.set(FIELD_DSTPSDEVRGROUPID, dstPSDEVRGroupId);
    }
    
    /**
     * 获取 目标规则组  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEVRGroupId(){
        Object objValue = this.get(FIELD_DSTPSDEVRGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标规则组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEVRGroupIdDirty(){
        if(this.contains(FIELD_DSTPSDEVRGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标规则组
     */
    @JsonIgnore
    public void resetDstPSDEVRGroupId(){
        this.reset(FIELD_DSTPSDEVRGROUPID);
    }

    /**
     * 设置 目标规则组
     * <P>
     * 等同 {@link #setDstPSDEVRGroupId}
     * @param dstPSDEVRGroupId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdevrgroupid(String dstPSDEVRGroupId){
        this.setDstPSDEVRGroupId(dstPSDEVRGroupId);
        return this;
    }

    /**
     * 设置 目标规则组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEVRGroupId}
     * @param pSDEVRGroup 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdevrgroupid(PSDEVRGroupDTO pSDEVRGroup){
        if(pSDEVRGroup == null){
            this.setDstPSDEVRGroupId(null);
            this.setDstPSDEVRGroupName(null);
        }
        else{
            this.setDstPSDEVRGroupId(pSDEVRGroup.getPSDEVRGroupId());
            this.setDstPSDEVRGroupName(pSDEVRGroup.getPSDEVRGroupName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEVRGROUPNAME</B>&nbsp;目标规则组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEVRGROUPID}
     */
    public final static String FIELD_DSTPSDEVRGROUPNAME = "dstpsdevrgroupname";

    /**
     * 设置 目标规则组
     * 
     * @param dstPSDEVRGroupName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEVRGROUPNAME)
    public void setDstPSDEVRGroupName(String dstPSDEVRGroupName){
        this.set(FIELD_DSTPSDEVRGROUPNAME, dstPSDEVRGroupName);
    }
    
    /**
     * 获取 目标规则组  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEVRGroupName(){
        Object objValue = this.get(FIELD_DSTPSDEVRGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标规则组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEVRGroupNameDirty(){
        if(this.contains(FIELD_DSTPSDEVRGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标规则组
     */
    @JsonIgnore
    public void resetDstPSDEVRGroupName(){
        this.reset(FIELD_DSTPSDEVRGROUPNAME);
    }

    /**
     * 设置 目标规则组
     * <P>
     * 等同 {@link #setDstPSDEVRGroupName}
     * @param dstPSDEVRGroupName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdevrgroupname(String dstPSDEVRGroupName){
        this.setDstPSDEVRGroupName(dstPSDEVRGroupName);
        return this;
    }

    /**
     * <B>DSTPSDEWIZARDID</B>&nbsp;目标实体向导
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO} 
     */
    public final static String FIELD_DSTPSDEWIZARDID = "dstpsdewizardid";

    /**
     * 设置 目标实体向导
     * 
     * @param dstPSDEWizardId
     * 
     */
    @JsonProperty(FIELD_DSTPSDEWIZARDID)
    public void setDstPSDEWizardId(String dstPSDEWizardId){
        this.set(FIELD_DSTPSDEWIZARDID, dstPSDEWizardId);
    }
    
    /**
     * 获取 目标实体向导  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEWizardId(){
        Object objValue = this.get(FIELD_DSTPSDEWIZARDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEWizardIdDirty(){
        if(this.contains(FIELD_DSTPSDEWIZARDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体向导
     */
    @JsonIgnore
    public void resetDstPSDEWizardId(){
        this.reset(FIELD_DSTPSDEWIZARDID);
    }

    /**
     * 设置 目标实体向导
     * <P>
     * 等同 {@link #setDstPSDEWizardId}
     * @param dstPSDEWizardId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdewizardid(String dstPSDEWizardId){
        this.setDstPSDEWizardId(dstPSDEWizardId);
        return this;
    }

    /**
     * 设置 目标实体向导，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDEWizardId}
     * @param pSDEWizard 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdewizardid(PSDEWizardDTO pSDEWizard){
        if(pSDEWizard == null){
            this.setDstPSDEWizardId(null);
            this.setDstPSDEWizardName(null);
        }
        else{
            this.setDstPSDEWizardId(pSDEWizard.getPSDEWizardId());
            this.setDstPSDEWizardName(pSDEWizard.getPSDEWizardName());
        }
        return this;
    }

    /**
     * <B>DSTPSDEWIZARDNAME</B>&nbsp;目标实体向导
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDEWIZARDID}
     */
    public final static String FIELD_DSTPSDEWIZARDNAME = "dstpsdewizardname";

    /**
     * 设置 目标实体向导
     * 
     * @param dstPSDEWizardName
     * 
     */
    @JsonProperty(FIELD_DSTPSDEWIZARDNAME)
    public void setDstPSDEWizardName(String dstPSDEWizardName){
        this.set(FIELD_DSTPSDEWIZARDNAME, dstPSDEWizardName);
    }
    
    /**
     * 获取 目标实体向导  
     * @return
     */
    @JsonIgnore
    public String getDstPSDEWizardName(){
        Object objValue = this.get(FIELD_DSTPSDEWIZARDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 目标实体向导 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDstPSDEWizardNameDirty(){
        if(this.contains(FIELD_DSTPSDEWIZARDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 目标实体向导
     */
    @JsonIgnore
    public void resetDstPSDEWizardName(){
        this.reset(FIELD_DSTPSDEWIZARDNAME);
    }

    /**
     * 设置 目标实体向导
     * <P>
     * 等同 {@link #setDstPSDEWizardName}
     * @param dstPSDEWizardName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdewizardname(String dstPSDEWizardName){
        this.setDstPSDEWizardName(dstPSDEWizardName);
        return this;
    }

    /**
     * <B>DSTPSDLPARAMID</B>&nbsp;操作参数，指定操作的目标参数
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO} 
     */
    public final static String FIELD_DSTPSDLPARAMID = "dstpsdlparamid";

    /**
     * 设置 操作参数，详细说明：{@link #FIELD_DSTPSDLPARAMID}
     * 
     * @param dstPSDLParamId
     * 
     */
    @JsonProperty(FIELD_DSTPSDLPARAMID)
    public void setDstPSDLParamId(String dstPSDLParamId){
        this.set(FIELD_DSTPSDLPARAMID, dstPSDLParamId);
    }
    
    /**
     * 获取 操作参数  
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
     * 判断 操作参数 是否指定值，包括空值
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
     * 重置 操作参数
     */
    @JsonIgnore
    public void resetDstPSDLParamId(){
        this.reset(FIELD_DSTPSDLPARAMID);
    }

    /**
     * 设置 操作参数，详细说明：{@link #FIELD_DSTPSDLPARAMID}
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param dstPSDLParamId
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdlparamid(String dstPSDLParamId){
        this.setDstPSDLParamId(dstPSDLParamId);
        return this;
    }

    /**
     * 设置 操作参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setDstPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdlparamid(PSDELogicParamDTO pSDELogicParam){
        if(pSDELogicParam == null){
            this.setDstPSDLParamId(null);
            this.setDstPSDLParamName(null);
        }
        else{
            this.setDstPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setDstPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>DSTPSDLPARAMNAME</B>&nbsp;操作参数，指定操作的目标参数
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_DSTPSDLPARAMID}
     */
    public final static String FIELD_DSTPSDLPARAMNAME = "dstpsdlparamname";

    /**
     * 设置 操作参数，详细说明：{@link #FIELD_DSTPSDLPARAMNAME}
     * 
     * @param dstPSDLParamName
     * 
     */
    @JsonProperty(FIELD_DSTPSDLPARAMNAME)
    public void setDstPSDLParamName(String dstPSDLParamName){
        this.set(FIELD_DSTPSDLPARAMNAME, dstPSDLParamName);
    }
    
    /**
     * 获取 操作参数  
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
     * 判断 操作参数 是否指定值，包括空值
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
     * 重置 操作参数
     */
    @JsonIgnore
    public void resetDstPSDLParamName(){
        this.reset(FIELD_DSTPSDLPARAMNAME);
    }

    /**
     * 设置 操作参数，详细说明：{@link #FIELD_DSTPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setDstPSDLParamName}
     * @param dstPSDLParamName
     */
    @JsonIgnore
    public PSDELogicNodeDTO dstpsdlparamname(String dstPSDLParamName){
        this.setDstPSDLParamName(dstPSDLParamName);
        return this;
    }

    /**
     * <B>DSTSORTDIR</B>&nbsp;目标属性排序方向
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SortDir} 
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
    public PSDELogicNodeDTO dstsortdir(String dstSortDir){
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
    public PSDELogicNodeDTO dstsortdir(net.ibizsys.model.PSModelEnums.SortDir dstSortDir){
        if(dstSortDir == null){
            this.setDstSortDir(null);
        }
        else{
            this.setDstSortDir(dstSortDir.value);
        }
        return this;
    }

    /**
     * <B>ISPSDLPARAMID</B>&nbsp;输入流参数，指定操作的输入流参数对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO} 
     */
    public final static String FIELD_ISPSDLPARAMID = "ispsdlparamid";

    /**
     * 设置 输入流参数，详细说明：{@link #FIELD_ISPSDLPARAMID}
     * 
     * @param iSPSDLParamId
     * 
     */
    @JsonProperty(FIELD_ISPSDLPARAMID)
    public void setISPSDLParamId(String iSPSDLParamId){
        this.set(FIELD_ISPSDLPARAMID, iSPSDLParamId);
    }
    
    /**
     * 获取 输入流参数  
     * @return
     */
    @JsonIgnore
    public String getISPSDLParamId(){
        Object objValue = this.get(FIELD_ISPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入流参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isISPSDLParamIdDirty(){
        if(this.contains(FIELD_ISPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入流参数
     */
    @JsonIgnore
    public void resetISPSDLParamId(){
        this.reset(FIELD_ISPSDLPARAMID);
    }

    /**
     * 设置 输入流参数，详细说明：{@link #FIELD_ISPSDLPARAMID}
     * <P>
     * 等同 {@link #setISPSDLParamId}
     * @param iSPSDLParamId
     */
    @JsonIgnore
    public PSDELogicNodeDTO ispsdlparamid(String iSPSDLParamId){
        this.setISPSDLParamId(iSPSDLParamId);
        return this;
    }

    /**
     * 设置 输入流参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setISPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO ispsdlparamid(PSDELogicParamDTO pSDELogicParam){
        if(pSDELogicParam == null){
            this.setISPSDLParamId(null);
            this.setISPSDLParamName(null);
        }
        else{
            this.setISPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setISPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>ISPSDLPARAMNAME</B>&nbsp;输入流参数，指定操作的输入流参数对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_ISPSDLPARAMID}
     */
    public final static String FIELD_ISPSDLPARAMNAME = "ispsdlparamname";

    /**
     * 设置 输入流参数，详细说明：{@link #FIELD_ISPSDLPARAMNAME}
     * 
     * @param iSPSDLParamName
     * 
     */
    @JsonProperty(FIELD_ISPSDLPARAMNAME)
    public void setISPSDLParamName(String iSPSDLParamName){
        this.set(FIELD_ISPSDLPARAMNAME, iSPSDLParamName);
    }
    
    /**
     * 获取 输入流参数  
     * @return
     */
    @JsonIgnore
    public String getISPSDLParamName(){
        Object objValue = this.get(FIELD_ISPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输入流参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isISPSDLParamNameDirty(){
        if(this.contains(FIELD_ISPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输入流参数
     */
    @JsonIgnore
    public void resetISPSDLParamName(){
        this.reset(FIELD_ISPSDLPARAMNAME);
    }

    /**
     * 设置 输入流参数，详细说明：{@link #FIELD_ISPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setISPSDLParamName}
     * @param iSPSDLParamName
     */
    @JsonIgnore
    public PSDELogicNodeDTO ispsdlparamname(String iSPSDLParamName){
        this.setISPSDLParamName(iSPSDLParamName);
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左坐标，指定处理节点在设计界面的图元的左上角X值，未定义时为【0】
     */
    public final static String FIELD_LEFTPOS = "leftpos";

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * 
     * @param leftPos
     * 
     */
    @JsonProperty(FIELD_LEFTPOS)
    public void setLeftPos(Integer leftPos){
        this.set(FIELD_LEFTPOS, leftPos);
    }
    
    /**
     * 获取 左坐标  
     * @return
     */
    @JsonIgnore
    public Integer getLeftPos(){
        Object objValue = this.get(FIELD_LEFTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 左坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeftPosDirty(){
        if(this.contains(FIELD_LEFTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左坐标
     */
    @JsonIgnore
    public void resetLeftPos(){
        this.reset(FIELD_LEFTPOS);
    }

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * <P>
     * 等同 {@link #setLeftPos}
     * @param leftPos
     */
    @JsonIgnore
    public PSDELogicNodeDTO leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
        return this;
    }

    /**
     * <B>LOGICNODESUBTYPE</B>&nbsp;逻辑节点子类型
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_LOGICNODESUBTYPE = "logicnodesubtype";

    /**
     * 设置 逻辑节点子类型
     * 
     * @param logicNodeSubType
     * 
     */
    @JsonProperty(FIELD_LOGICNODESUBTYPE)
    public void setLogicNodeSubType(String logicNodeSubType){
        this.set(FIELD_LOGICNODESUBTYPE, logicNodeSubType);
    }
    
    /**
     * 获取 逻辑节点子类型  
     * @return
     */
    @JsonIgnore
    public String getLogicNodeSubType(){
        Object objValue = this.get(FIELD_LOGICNODESUBTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑节点子类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNodeSubTypeDirty(){
        if(this.contains(FIELD_LOGICNODESUBTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑节点子类型
     */
    @JsonIgnore
    public void resetLogicNodeSubType(){
        this.reset(FIELD_LOGICNODESUBTYPE);
    }

    /**
     * 设置 逻辑节点子类型
     * <P>
     * 等同 {@link #setLogicNodeSubType}
     * @param logicNodeSubType
     */
    @JsonIgnore
    public PSDELogicNodeDTO logicnodesubtype(String logicNodeSubType){
        this.setLogicNodeSubType(logicNodeSubType);
        return this;
    }

    /**
     * <B>LOGICNODETYPE</B>&nbsp;逻辑节点类型，指定逻辑节点的类型，逻辑节点需要区分是应用的处理逻辑类型，也包括逻辑的执行容器等
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.LogicNodeType} 
     */
    public final static String FIELD_LOGICNODETYPE = "logicnodetype";

    /**
     * 设置 逻辑节点类型，详细说明：{@link #FIELD_LOGICNODETYPE}
     * 
     * @param logicNodeType
     * 
     */
    @JsonProperty(FIELD_LOGICNODETYPE)
    public void setLogicNodeType(String logicNodeType){
        this.set(FIELD_LOGICNODETYPE, logicNodeType);
    }
    
    /**
     * 获取 逻辑节点类型  
     * @return
     */
    @JsonIgnore
    public String getLogicNodeType(){
        Object objValue = this.get(FIELD_LOGICNODETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑节点类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNodeTypeDirty(){
        if(this.contains(FIELD_LOGICNODETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑节点类型
     */
    @JsonIgnore
    public void resetLogicNodeType(){
        this.reset(FIELD_LOGICNODETYPE);
    }

    /**
     * 设置 逻辑节点类型，详细说明：{@link #FIELD_LOGICNODETYPE}
     * <P>
     * 等同 {@link #setLogicNodeType}
     * @param logicNodeType
     */
    @JsonIgnore
    public PSDELogicNodeDTO logicnodetype(String logicNodeType){
        this.setLogicNodeType(logicNodeType);
        return this;
    }

     /**
     * 设置 逻辑节点类型，详细说明：{@link #FIELD_LOGICNODETYPE}
     * <P>
     * 等同 {@link #setLogicNodeType}
     * @param logicNodeType
     */
    @JsonIgnore
    public PSDELogicNodeDTO logicnodetype(net.ibizsys.model.PSModelEnums.LogicNodeType logicNodeType){
        if(logicNodeType == null){
            this.setLogicNodeType(null);
        }
        else{
            this.setLogicNodeType(logicNodeType.value);
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
    public PSDELogicNodeDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MSGPSLANRESID</B>&nbsp;消息语言资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSLanguageResDTO} 
     */
    public final static String FIELD_MSGPSLANRESID = "msgpslanresid";

    /**
     * 设置 消息语言资源
     * 
     * @param msgPSLanResId
     * 
     */
    @JsonProperty(FIELD_MSGPSLANRESID)
    public void setMsgPSLanResId(String msgPSLanResId){
        this.set(FIELD_MSGPSLANRESID, msgPSLanResId);
    }
    
    /**
     * 获取 消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getMsgPSLanResId(){
        Object objValue = this.get(FIELD_MSGPSLANRESID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgPSLanResIdDirty(){
        if(this.contains(FIELD_MSGPSLANRESID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息语言资源
     */
    @JsonIgnore
    public void resetMsgPSLanResId(){
        this.reset(FIELD_MSGPSLANRESID);
    }

    /**
     * 设置 消息语言资源
     * <P>
     * 等同 {@link #setMsgPSLanResId}
     * @param msgPSLanResId
     */
    @JsonIgnore
    public PSDELogicNodeDTO msgpslanresid(String msgPSLanResId){
        this.setMsgPSLanResId(msgPSLanResId);
        return this;
    }

    /**
     * 设置 消息语言资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMsgPSLanResId}
     * @param pSLanguageRes 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO msgpslanresid(PSLanguageResDTO pSLanguageRes){
        if(pSLanguageRes == null){
            this.setMsgPSLanResId(null);
            this.setMsgPSLanResName(null);
        }
        else{
            this.setMsgPSLanResId(pSLanguageRes.getPSLanguageResId());
            this.setMsgPSLanResName(pSLanguageRes.getPSLanguageResName());
        }
        return this;
    }

    /**
     * <B>MSGPSLANRESNAME</B>&nbsp;消息语言资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MSGPSLANRESID}
     */
    public final static String FIELD_MSGPSLANRESNAME = "msgpslanresname";

    /**
     * 设置 消息语言资源
     * 
     * @param msgPSLanResName
     * 
     */
    @JsonProperty(FIELD_MSGPSLANRESNAME)
    public void setMsgPSLanResName(String msgPSLanResName){
        this.set(FIELD_MSGPSLANRESNAME, msgPSLanResName);
    }
    
    /**
     * 获取 消息语言资源  
     * @return
     */
    @JsonIgnore
    public String getMsgPSLanResName(){
        Object objValue = this.get(FIELD_MSGPSLANRESNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 消息语言资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMsgPSLanResNameDirty(){
        if(this.contains(FIELD_MSGPSLANRESNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 消息语言资源
     */
    @JsonIgnore
    public void resetMsgPSLanResName(){
        this.reset(FIELD_MSGPSLANRESNAME);
    }

    /**
     * 设置 消息语言资源
     * <P>
     * 等同 {@link #setMsgPSLanResName}
     * @param msgPSLanResName
     */
    @JsonIgnore
    public PSDELogicNodeDTO msgpslanresname(String msgPSLanResName){
        this.setMsgPSLanResName(msgPSLanResName);
        return this;
    }

    /**
     * <B>NODEPARAMS</B>&nbsp;节点参数
     */
    public final static String FIELD_NODEPARAMS = "nodeparams";

    /**
     * 设置 节点参数
     * 
     * @param nodeParams
     * 
     */
    @JsonProperty(FIELD_NODEPARAMS)
    public void setNodeParams(String nodeParams){
        this.set(FIELD_NODEPARAMS, nodeParams);
    }
    
    /**
     * 获取 节点参数  
     * @return
     */
    @JsonIgnore
    public String getNodeParams(){
        Object objValue = this.get(FIELD_NODEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeParamsDirty(){
        if(this.contains(FIELD_NODEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点参数
     */
    @JsonIgnore
    public void resetNodeParams(){
        this.reset(FIELD_NODEPARAMS);
    }

    /**
     * 设置 节点参数
     * <P>
     * 等同 {@link #setNodeParams}
     * @param nodeParams
     */
    @JsonIgnore
    public PSDELogicNodeDTO nodeparams(String nodeParams){
        this.setNodeParams(nodeParams);
        return this;
    }

    /**
     * <B>OSPSDLPARAMID</B>&nbsp;输出流参数，指定操作的输出流参数对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO} 
     */
    public final static String FIELD_OSPSDLPARAMID = "ospsdlparamid";

    /**
     * 设置 输出流参数，详细说明：{@link #FIELD_OSPSDLPARAMID}
     * 
     * @param oSPSDLParamId
     * 
     */
    @JsonProperty(FIELD_OSPSDLPARAMID)
    public void setOSPSDLParamId(String oSPSDLParamId){
        this.set(FIELD_OSPSDLPARAMID, oSPSDLParamId);
    }
    
    /**
     * 获取 输出流参数  
     * @return
     */
    @JsonIgnore
    public String getOSPSDLParamId(){
        Object objValue = this.get(FIELD_OSPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出流参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOSPSDLParamIdDirty(){
        if(this.contains(FIELD_OSPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出流参数
     */
    @JsonIgnore
    public void resetOSPSDLParamId(){
        this.reset(FIELD_OSPSDLPARAMID);
    }

    /**
     * 设置 输出流参数，详细说明：{@link #FIELD_OSPSDLPARAMID}
     * <P>
     * 等同 {@link #setOSPSDLParamId}
     * @param oSPSDLParamId
     */
    @JsonIgnore
    public PSDELogicNodeDTO ospsdlparamid(String oSPSDLParamId){
        this.setOSPSDLParamId(oSPSDLParamId);
        return this;
    }

    /**
     * 设置 输出流参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setOSPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO ospsdlparamid(PSDELogicParamDTO pSDELogicParam){
        if(pSDELogicParam == null){
            this.setOSPSDLParamId(null);
            this.setOSPSDLParamName(null);
        }
        else{
            this.setOSPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setOSPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>OSPSDLPARAMNAME</B>&nbsp;输出流参数，指定操作的输出流参数对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_OSPSDLPARAMID}
     */
    public final static String FIELD_OSPSDLPARAMNAME = "ospsdlparamname";

    /**
     * 设置 输出流参数，详细说明：{@link #FIELD_OSPSDLPARAMNAME}
     * 
     * @param oSPSDLParamName
     * 
     */
    @JsonProperty(FIELD_OSPSDLPARAMNAME)
    public void setOSPSDLParamName(String oSPSDLParamName){
        this.set(FIELD_OSPSDLPARAMNAME, oSPSDLParamName);
    }
    
    /**
     * 获取 输出流参数  
     * @return
     */
    @JsonIgnore
    public String getOSPSDLParamName(){
        Object objValue = this.get(FIELD_OSPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 输出流参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOSPSDLParamNameDirty(){
        if(this.contains(FIELD_OSPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 输出流参数
     */
    @JsonIgnore
    public void resetOSPSDLParamName(){
        this.reset(FIELD_OSPSDLPARAMNAME);
    }

    /**
     * 设置 输出流参数，详细说明：{@link #FIELD_OSPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setOSPSDLParamName}
     * @param oSPSDLParamName
     */
    @JsonIgnore
    public PSDELogicNodeDTO ospsdlparamname(String oSPSDLParamName){
        this.setOSPSDLParamName(oSPSDLParamName);
        return this;
    }

    /**
     * <B>PARALLELOUTPUT</B>&nbsp;循环后续处理，指定处理节点后续的多个逻辑是平行输出或串行输出，串行输出只执行第一个满足条件的连接，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARALLELOUTPUT = "paralleloutput";

    /**
     * 设置 循环后续处理，详细说明：{@link #FIELD_PARALLELOUTPUT}
     * 
     * @param parallelOutput
     * 
     */
    @JsonProperty(FIELD_PARALLELOUTPUT)
    public void setParallelOutput(Integer parallelOutput){
        this.set(FIELD_PARALLELOUTPUT, parallelOutput);
    }
    
    /**
     * 获取 循环后续处理  
     * @return
     */
    @JsonIgnore
    public Integer getParallelOutput(){
        Object objValue = this.get(FIELD_PARALLELOUTPUT);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 循环后续处理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParallelOutputDirty(){
        if(this.contains(FIELD_PARALLELOUTPUT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 循环后续处理
     */
    @JsonIgnore
    public void resetParallelOutput(){
        this.reset(FIELD_PARALLELOUTPUT);
    }

    /**
     * 设置 循环后续处理，详细说明：{@link #FIELD_PARALLELOUTPUT}
     * <P>
     * 等同 {@link #setParallelOutput}
     * @param parallelOutput
     */
    @JsonIgnore
    public PSDELogicNodeDTO paralleloutput(Integer parallelOutput){
        this.setParallelOutput(parallelOutput);
        return this;
    }

     /**
     * 设置 循环后续处理，详细说明：{@link #FIELD_PARALLELOUTPUT}
     * <P>
     * 等同 {@link #setParallelOutput}
     * @param parallelOutput
     */
    @JsonIgnore
    public PSDELogicNodeDTO paralleloutput(Boolean parallelOutput){
        if(parallelOutput == null){
            this.setParallelOutput(null);
        }
        else{
            this.setParallelOutput(parallelOutput?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PARAM1</B>&nbsp;参数1
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM1 = "param1";

    /**
     * 设置 参数1
     * 
     * @param param1
     * 
     */
    @JsonProperty(FIELD_PARAM1)
    public void setParam1(String param1){
        this.set(FIELD_PARAM1, param1);
    }
    
    /**
     * 获取 参数1  
     * @return
     */
    @JsonIgnore
    public String getParam1(){
        Object objValue = this.get(FIELD_PARAM1);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数1 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam1Dirty(){
        if(this.contains(FIELD_PARAM1)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数1
     */
    @JsonIgnore
    public void resetParam1(){
        this.reset(FIELD_PARAM1);
    }

    /**
     * 设置 参数1
     * <P>
     * 等同 {@link #setParam1}
     * @param param1
     */
    @JsonIgnore
    public PSDELogicNodeDTO param1(String param1){
        this.setParam1(param1);
        return this;
    }

    /**
     * <B>PARAM10</B>&nbsp;参数10
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARAM10 = "param10";

    /**
     * 设置 参数10
     * 
     * @param param10
     * 
     */
    @JsonProperty(FIELD_PARAM10)
    public void setParam10(Integer param10){
        this.set(FIELD_PARAM10, param10);
    }
    
    /**
     * 获取 参数10  
     * @return
     */
    @JsonIgnore
    public Integer getParam10(){
        Object objValue = this.get(FIELD_PARAM10);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数10 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam10Dirty(){
        if(this.contains(FIELD_PARAM10)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数10
     */
    @JsonIgnore
    public void resetParam10(){
        this.reset(FIELD_PARAM10);
    }

    /**
     * 设置 参数10
     * <P>
     * 等同 {@link #setParam10}
     * @param param10
     */
    @JsonIgnore
    public PSDELogicNodeDTO param10(Integer param10){
        this.setParam10(param10);
        return this;
    }

     /**
     * 设置 参数10
     * <P>
     * 等同 {@link #setParam10}
     * @param param10
     */
    @JsonIgnore
    public PSDELogicNodeDTO param10(Boolean param10){
        if(param10 == null){
            this.setParam10(null);
        }
        else{
            this.setParam10(param10?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PARAM11</B>&nbsp;参数11
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM11 = "param11";

    /**
     * 设置 参数11
     * 
     * @param param11
     * 
     */
    @JsonProperty(FIELD_PARAM11)
    public void setParam11(String param11){
        this.set(FIELD_PARAM11, param11);
    }
    
    /**
     * 获取 参数11  
     * @return
     */
    @JsonIgnore
    public String getParam11(){
        Object objValue = this.get(FIELD_PARAM11);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数11 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam11Dirty(){
        if(this.contains(FIELD_PARAM11)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数11
     */
    @JsonIgnore
    public void resetParam11(){
        this.reset(FIELD_PARAM11);
    }

    /**
     * 设置 参数11
     * <P>
     * 等同 {@link #setParam11}
     * @param param11
     */
    @JsonIgnore
    public PSDELogicNodeDTO param11(String param11){
        this.setParam11(param11);
        return this;
    }

    /**
     * <B>PARAM12</B>&nbsp;参数12
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM12 = "param12";

    /**
     * 设置 参数12
     * 
     * @param param12
     * 
     */
    @JsonProperty(FIELD_PARAM12)
    public void setParam12(String param12){
        this.set(FIELD_PARAM12, param12);
    }
    
    /**
     * 获取 参数12  
     * @return
     */
    @JsonIgnore
    public String getParam12(){
        Object objValue = this.get(FIELD_PARAM12);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数12 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam12Dirty(){
        if(this.contains(FIELD_PARAM12)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数12
     */
    @JsonIgnore
    public void resetParam12(){
        this.reset(FIELD_PARAM12);
    }

    /**
     * 设置 参数12
     * <P>
     * 等同 {@link #setParam12}
     * @param param12
     */
    @JsonIgnore
    public PSDELogicNodeDTO param12(String param12){
        this.setParam12(param12);
        return this;
    }

    /**
     * <B>PARAM13</B>&nbsp;参数13
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM13 = "param13";

    /**
     * 设置 参数13
     * 
     * @param param13
     * 
     */
    @JsonProperty(FIELD_PARAM13)
    public void setParam13(String param13){
        this.set(FIELD_PARAM13, param13);
    }
    
    /**
     * 获取 参数13  
     * @return
     */
    @JsonIgnore
    public String getParam13(){
        Object objValue = this.get(FIELD_PARAM13);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数13 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam13Dirty(){
        if(this.contains(FIELD_PARAM13)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数13
     */
    @JsonIgnore
    public void resetParam13(){
        this.reset(FIELD_PARAM13);
    }

    /**
     * 设置 参数13
     * <P>
     * 等同 {@link #setParam13}
     * @param param13
     */
    @JsonIgnore
    public PSDELogicNodeDTO param13(String param13){
        this.setParam13(param13);
        return this;
    }

    /**
     * <B>PARAM14</B>&nbsp;参数14
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM14 = "param14";

    /**
     * 设置 参数14
     * 
     * @param param14
     * 
     */
    @JsonProperty(FIELD_PARAM14)
    public void setParam14(String param14){
        this.set(FIELD_PARAM14, param14);
    }
    
    /**
     * 获取 参数14  
     * @return
     */
    @JsonIgnore
    public String getParam14(){
        Object objValue = this.get(FIELD_PARAM14);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数14 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam14Dirty(){
        if(this.contains(FIELD_PARAM14)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数14
     */
    @JsonIgnore
    public void resetParam14(){
        this.reset(FIELD_PARAM14);
    }

    /**
     * 设置 参数14
     * <P>
     * 等同 {@link #setParam14}
     * @param param14
     */
    @JsonIgnore
    public PSDELogicNodeDTO param14(String param14){
        this.setParam14(param14);
        return this;
    }

    /**
     * <B>PARAM2</B>&nbsp;参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM2 = "param2";

    /**
     * 设置 参数2
     * 
     * @param param2
     * 
     */
    @JsonProperty(FIELD_PARAM2)
    public void setParam2(String param2){
        this.set(FIELD_PARAM2, param2);
    }
    
    /**
     * 获取 参数2  
     * @return
     */
    @JsonIgnore
    public String getParam2(){
        Object objValue = this.get(FIELD_PARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam2Dirty(){
        if(this.contains(FIELD_PARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数2
     */
    @JsonIgnore
    public void resetParam2(){
        this.reset(FIELD_PARAM2);
    }

    /**
     * 设置 参数2
     * <P>
     * 等同 {@link #setParam2}
     * @param param2
     */
    @JsonIgnore
    public PSDELogicNodeDTO param2(String param2){
        this.setParam2(param2);
        return this;
    }

    /**
     * <B>PARAM3</B>&nbsp;参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PARAM3 = "param3";

    /**
     * 设置 参数3
     * 
     * @param param3
     * 
     */
    @JsonProperty(FIELD_PARAM3)
    public void setParam3(String param3){
        this.set(FIELD_PARAM3, param3);
    }
    
    /**
     * 获取 参数3  
     * @return
     */
    @JsonIgnore
    public String getParam3(){
        Object objValue = this.get(FIELD_PARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam3Dirty(){
        if(this.contains(FIELD_PARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数3
     */
    @JsonIgnore
    public void resetParam3(){
        this.reset(FIELD_PARAM3);
    }

    /**
     * 设置 参数3
     * <P>
     * 等同 {@link #setParam3}
     * @param param3
     */
    @JsonIgnore
    public PSDELogicNodeDTO param3(String param3){
        this.setParam3(param3);
        return this;
    }

    /**
     * <B>PARAM4</B>&nbsp;参数4
     */
    public final static String FIELD_PARAM4 = "param4";

    /**
     * 设置 参数4
     * 
     * @param param4
     * 
     */
    @JsonProperty(FIELD_PARAM4)
    public void setParam4(String param4){
        this.set(FIELD_PARAM4, param4);
    }
    
    /**
     * 获取 参数4  
     * @return
     */
    @JsonIgnore
    public String getParam4(){
        Object objValue = this.get(FIELD_PARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam4Dirty(){
        if(this.contains(FIELD_PARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数4
     */
    @JsonIgnore
    public void resetParam4(){
        this.reset(FIELD_PARAM4);
    }

    /**
     * 设置 参数4
     * <P>
     * 等同 {@link #setParam4}
     * @param param4
     */
    @JsonIgnore
    public PSDELogicNodeDTO param4(String param4){
        this.setParam4(param4);
        return this;
    }

    /**
     * <B>PARAM5</B>&nbsp;参数5
     */
    public final static String FIELD_PARAM5 = "param5";

    /**
     * 设置 参数5
     * 
     * @param param5
     * 
     */
    @JsonProperty(FIELD_PARAM5)
    public void setParam5(String param5){
        this.set(FIELD_PARAM5, param5);
    }
    
    /**
     * 获取 参数5  
     * @return
     */
    @JsonIgnore
    public String getParam5(){
        Object objValue = this.get(FIELD_PARAM5);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数5 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam5Dirty(){
        if(this.contains(FIELD_PARAM5)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数5
     */
    @JsonIgnore
    public void resetParam5(){
        this.reset(FIELD_PARAM5);
    }

    /**
     * 设置 参数5
     * <P>
     * 等同 {@link #setParam5}
     * @param param5
     */
    @JsonIgnore
    public PSDELogicNodeDTO param5(String param5){
        this.setParam5(param5);
        return this;
    }

    /**
     * <B>PARAM6</B>&nbsp;参数6
     */
    public final static String FIELD_PARAM6 = "param6";

    /**
     * 设置 参数6
     * 
     * @param param6
     * 
     */
    @JsonProperty(FIELD_PARAM6)
    public void setParam6(String param6){
        this.set(FIELD_PARAM6, param6);
    }
    
    /**
     * 获取 参数6  
     * @return
     */
    @JsonIgnore
    public String getParam6(){
        Object objValue = this.get(FIELD_PARAM6);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数6 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam6Dirty(){
        if(this.contains(FIELD_PARAM6)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数6
     */
    @JsonIgnore
    public void resetParam6(){
        this.reset(FIELD_PARAM6);
    }

    /**
     * 设置 参数6
     * <P>
     * 等同 {@link #setParam6}
     * @param param6
     */
    @JsonIgnore
    public PSDELogicNodeDTO param6(String param6){
        this.setParam6(param6);
        return this;
    }

    /**
     * <B>PARAM7</B>&nbsp;参数7
     */
    public final static String FIELD_PARAM7 = "param7";

    /**
     * 设置 参数7
     * 
     * @param param7
     * 
     */
    @JsonProperty(FIELD_PARAM7)
    public void setParam7(Integer param7){
        this.set(FIELD_PARAM7, param7);
    }
    
    /**
     * 获取 参数7  
     * @return
     */
    @JsonIgnore
    public Integer getParam7(){
        Object objValue = this.get(FIELD_PARAM7);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数7 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam7Dirty(){
        if(this.contains(FIELD_PARAM7)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数7
     */
    @JsonIgnore
    public void resetParam7(){
        this.reset(FIELD_PARAM7);
    }

    /**
     * 设置 参数7
     * <P>
     * 等同 {@link #setParam7}
     * @param param7
     */
    @JsonIgnore
    public PSDELogicNodeDTO param7(Integer param7){
        this.setParam7(param7);
        return this;
    }

    /**
     * <B>PARAM8</B>&nbsp;参数8
     */
    public final static String FIELD_PARAM8 = "param8";

    /**
     * 设置 参数8
     * 
     * @param param8
     * 
     */
    @JsonProperty(FIELD_PARAM8)
    public void setParam8(Integer param8){
        this.set(FIELD_PARAM8, param8);
    }
    
    /**
     * 获取 参数8  
     * @return
     */
    @JsonIgnore
    public Integer getParam8(){
        Object objValue = this.get(FIELD_PARAM8);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数8 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam8Dirty(){
        if(this.contains(FIELD_PARAM8)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数8
     */
    @JsonIgnore
    public void resetParam8(){
        this.reset(FIELD_PARAM8);
    }

    /**
     * 设置 参数8
     * <P>
     * 等同 {@link #setParam8}
     * @param param8
     */
    @JsonIgnore
    public PSDELogicNodeDTO param8(Integer param8){
        this.setParam8(param8);
        return this;
    }

    /**
     * <B>PARAM9</B>&nbsp;参数9
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_PARAM9 = "param9";

    /**
     * 设置 参数9
     * 
     * @param param9
     * 
     */
    @JsonProperty(FIELD_PARAM9)
    public void setParam9(Integer param9){
        this.set(FIELD_PARAM9, param9);
    }
    
    /**
     * 获取 参数9  
     * @return
     */
    @JsonIgnore
    public Integer getParam9(){
        Object objValue = this.get(FIELD_PARAM9);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数9 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParam9Dirty(){
        if(this.contains(FIELD_PARAM9)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数9
     */
    @JsonIgnore
    public void resetParam9(){
        this.reset(FIELD_PARAM9);
    }

    /**
     * 设置 参数9
     * <P>
     * 等同 {@link #setParam9}
     * @param param9
     */
    @JsonIgnore
    public PSDELogicNodeDTO param9(Integer param9){
        this.setParam9(param9);
        return this;
    }

     /**
     * 设置 参数9
     * <P>
     * 等同 {@link #setParam9}
     * @param param9
     */
    @JsonIgnore
    public PSDELogicNodeDTO param9(Boolean param9){
        if(param9 == null){
            this.setParam9(null);
        }
        else{
            this.setParam9(param9?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>PSDELOGICID</B>&nbsp;实体处理逻辑，指定处理节点所在的处理逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicDTO} 
     */
    public final static String FIELD_PSDELOGICID = "psdelogicid";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * 
     * @param pSDELogicId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICID)
    public void setPSDELogicId(String pSDELogicId){
        this.set(FIELD_PSDELOGICID, pSDELogicId);
    }
    
    /**
     * 获取 实体处理逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicId(){
        Object objValue = this.get(FIELD_PSDELOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体处理逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicIdDirty(){
        if(this.contains(FIELD_PSDELOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicId(){
        this.reset(FIELD_PSDELOGICID);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICID}
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogicId
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdelogicid(String pSDELogicId){
        this.setPSDELogicId(pSDELogicId);
        return this;
    }

    /**
     * 设置 实体处理逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDELogicId}
     * @param pSDELogic 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdelogicid(PSDELogicDTO pSDELogic){
        if(pSDELogic == null){
            this.setPSDELogicId(null);
            this.setPSDELogicName(null);
        }
        else{
            this.setPSDELogicId(pSDELogic.getPSDELogicId());
            this.setPSDELogicName(pSDELogic.getPSDELogicName());
        }
        return this;
    }

    /**
     * <B>PSDELOGICNAME</B>&nbsp;实体处理逻辑，指定处理节点所在的处理逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDELOGICID}
     */
    public final static String FIELD_PSDELOGICNAME = "psdelogicname";

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * 
     * @param pSDELogicName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNAME)
    public void setPSDELogicName(String pSDELogicName){
        this.set(FIELD_PSDELOGICNAME, pSDELogicName);
    }
    
    /**
     * 获取 实体处理逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSDELogicName(){
        Object objValue = this.get(FIELD_PSDELOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体处理逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDELogicNameDirty(){
        if(this.contains(FIELD_PSDELOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体处理逻辑
     */
    @JsonIgnore
    public void resetPSDELogicName(){
        this.reset(FIELD_PSDELOGICNAME);
    }

    /**
     * 设置 实体处理逻辑，详细说明：{@link #FIELD_PSDELOGICNAME}
     * <P>
     * 等同 {@link #setPSDELogicName}
     * @param pSDELogicName
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdelogicname(String pSDELogicName){
        this.setPSDELogicName(pSDELogicName);
        return this;
    }

    /**
     * <B>PSDELOGICNODEID</B>&nbsp;实体处理逻辑节点标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDELOGICNODEID = "psdelogicnodeid";

    /**
     * 设置 实体处理逻辑节点标识
     * 
     * @param pSDELogicNodeId
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNODEID)
    public void setPSDELogicNodeId(String pSDELogicNodeId){
        this.set(FIELD_PSDELOGICNODEID, pSDELogicNodeId);
    }
    
    /**
     * 获取 实体处理逻辑节点标识  
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
     * 判断 实体处理逻辑节点标识 是否指定值，包括空值
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
     * 重置 实体处理逻辑节点标识
     */
    @JsonIgnore
    public void resetPSDELogicNodeId(){
        this.reset(FIELD_PSDELOGICNODEID);
    }

    /**
     * 设置 实体处理逻辑节点标识
     * <P>
     * 等同 {@link #setPSDELogicNodeId}
     * @param pSDELogicNodeId
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdelogicnodeid(String pSDELogicNodeId){
        this.setPSDELogicNodeId(pSDELogicNodeId);
        return this;
    }

    /**
     * <B>PSDELOGICNODENAME</B>&nbsp;处理名称，指定处理节点名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDELOGICNODENAME = "psdelogicnodename";

    /**
     * 设置 处理名称，详细说明：{@link #FIELD_PSDELOGICNODENAME}
     * 
     * @param pSDELogicNodeName
     * 
     */
    @JsonProperty(FIELD_PSDELOGICNODENAME)
    public void setPSDELogicNodeName(String pSDELogicNodeName){
        this.set(FIELD_PSDELOGICNODENAME, pSDELogicNodeName);
    }
    
    /**
     * 获取 处理名称  
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
     * 判断 处理名称 是否指定值，包括空值
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
     * 重置 处理名称
     */
    @JsonIgnore
    public void resetPSDELogicNodeName(){
        this.reset(FIELD_PSDELOGICNODENAME);
    }

    /**
     * 设置 处理名称，详细说明：{@link #FIELD_PSDELOGICNODENAME}
     * <P>
     * 等同 {@link #setPSDELogicNodeName}
     * @param pSDELogicNodeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdelogicnodename(String pSDELogicNodeName){
        this.setPSDELogicNodeName(pSDELogicNodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDELogicNodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDELogicNodeName(strName);
    }

    @JsonIgnore
    public PSDELogicNodeDTO name(String strName){
        this.setPSDELogicNodeName(strName);
        return this;
    }

    /**
     * <B>PSDEMAINSTATEID</B>&nbsp;实体主状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO} 
     */
    public final static String FIELD_PSDEMAINSTATEID = "psdemainstateid";

    /**
     * 设置 实体主状态
     * 
     * @param pSDEMainStateId
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATEID)
    public void setPSDEMainStateId(String pSDEMainStateId){
        this.set(FIELD_PSDEMAINSTATEID, pSDEMainStateId);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateId(){
        Object objValue = this.get(FIELD_PSDEMAINSTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateIdDirty(){
        if(this.contains(FIELD_PSDEMAINSTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateId(){
        this.reset(FIELD_PSDEMAINSTATEID);
    }

    /**
     * 设置 实体主状态
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainStateId
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdemainstateid(String pSDEMainStateId){
        this.setPSDEMainStateId(pSDEMainStateId);
        return this;
    }

    /**
     * 设置 实体主状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEMainStateId}
     * @param pSDEMainState 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdemainstateid(PSDEMainStateDTO pSDEMainState){
        if(pSDEMainState == null){
            this.setPSDEMainStateId(null);
            this.setPSDEMainStateName(null);
        }
        else{
            this.setPSDEMainStateId(pSDEMainState.getPSDEMainStateId());
            this.setPSDEMainStateName(pSDEMainState.getPSDEMainStateName());
        }
        return this;
    }

    /**
     * <B>PSDEMAINSTATENAME</B>&nbsp;实体主状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEMAINSTATEID}
     */
    public final static String FIELD_PSDEMAINSTATENAME = "psdemainstatename";

    /**
     * 设置 实体主状态
     * 
     * @param pSDEMainStateName
     * 
     */
    @JsonProperty(FIELD_PSDEMAINSTATENAME)
    public void setPSDEMainStateName(String pSDEMainStateName){
        this.set(FIELD_PSDEMAINSTATENAME, pSDEMainStateName);
    }
    
    /**
     * 获取 实体主状态  
     * @return
     */
    @JsonIgnore
    public String getPSDEMainStateName(){
        Object objValue = this.get(FIELD_PSDEMAINSTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体主状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEMainStateNameDirty(){
        if(this.contains(FIELD_PSDEMAINSTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体主状态
     */
    @JsonIgnore
    public void resetPSDEMainStateName(){
        this.reset(FIELD_PSDEMAINSTATENAME);
    }

    /**
     * 设置 实体主状态
     * <P>
     * 等同 {@link #setPSDEMainStateName}
     * @param pSDEMainStateName
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdemainstatename(String pSDEMainStateName){
        this.setPSDEMainStateName(pSDEMainStateName);
        return this;
    }

    /**
     * <B>PSDEUIACTIONID</B>&nbsp;实体界面行为，指定对目标参数操作的界面行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEUIActionDTO} 
     */
    public final static String FIELD_PSDEUIACTIONID = "psdeuiactionid";

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * 
     * @param pSDEUIActionId
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONID)
    public void setPSDEUIActionId(String pSDEUIActionId){
        this.set(FIELD_PSDEUIACTIONID, pSDEUIActionId);
    }
    
    /**
     * 获取 实体界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionId(){
        Object objValue = this.get(FIELD_PSDEUIACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionIdDirty(){
        if(this.contains(FIELD_PSDEUIACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionId(){
        this.reset(FIELD_PSDEUIACTIONID);
    }

    /**
     * 设置 实体界面行为，详细说明：{@link #FIELD_PSDEUIACTIONID}
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIActionId
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdeuiactionid(String pSDEUIActionId){
        this.setPSDEUIActionId(pSDEUIActionId);
        return this;
    }

    /**
     * 设置 实体界面行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEUIActionId}
     * @param pSDEUIAction 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdeuiactionid(PSDEUIActionDTO pSDEUIAction){
        if(pSDEUIAction == null){
            this.setPSDEUIActionId(null);
            this.setPSDEUIActionName(null);
        }
        else{
            this.setPSDEUIActionId(pSDEUIAction.getPSDEUIActionId());
            this.setPSDEUIActionName(pSDEUIAction.getPSDEUIActionName());
        }
        return this;
    }

    /**
     * <B>PSDEUIACTIONNAME</B>&nbsp;操作界面行为，指定对目标参数操作的界面行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEUIACTIONID}
     */
    public final static String FIELD_PSDEUIACTIONNAME = "psdeuiactionname";

    /**
     * 设置 操作界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * 
     * @param pSDEUIActionName
     * 
     */
    @JsonProperty(FIELD_PSDEUIACTIONNAME)
    public void setPSDEUIActionName(String pSDEUIActionName){
        this.set(FIELD_PSDEUIACTIONNAME, pSDEUIActionName);
    }
    
    /**
     * 获取 操作界面行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEUIActionName(){
        Object objValue = this.get(FIELD_PSDEUIACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作界面行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUIActionNameDirty(){
        if(this.contains(FIELD_PSDEUIACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作界面行为
     */
    @JsonIgnore
    public void resetPSDEUIActionName(){
        this.reset(FIELD_PSDEUIACTIONNAME);
    }

    /**
     * 设置 操作界面行为，详细说明：{@link #FIELD_PSDEUIACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEUIActionName}
     * @param pSDEUIActionName
     */
    @JsonIgnore
    public PSDELogicNodeDTO psdeuiactionname(String pSDEUIActionName){
        this.setPSDEUIActionName(pSDEUIActionName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILID</B>&nbsp;外部服务接口方法
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSubSysSADetailDTO} 
     */
    public final static String FIELD_PSSUBSYSSADETAILID = "pssubsyssadetailid";

    /**
     * 设置 外部服务接口方法
     * 
     * @param pSSubSysSADetailId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILID)
    public void setPSSubSysSADetailId(String pSSubSysSADetailId){
        this.set(FIELD_PSSUBSYSSADETAILID, pSSubSysSADetailId);
    }
    
    /**
     * 获取 外部服务接口方法  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADetailId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口方法 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADetailIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口方法
     */
    @JsonIgnore
    public void resetPSSubSysSADetailId(){
        this.reset(FIELD_PSSUBSYSSADETAILID);
    }

    /**
     * 设置 外部服务接口方法
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetailId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssubsyssadetailid(String pSSubSysSADetailId){
        this.setPSSubSysSADetailId(pSSubSysSADetailId);
        return this;
    }

    /**
     * 设置 外部服务接口方法，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADetailId}
     * @param pSSubSysSADetail 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssubsyssadetailid(PSSubSysSADetailDTO pSSubSysSADetail){
        if(pSSubSysSADetail == null){
            this.setPSSubSysSADetailId(null);
            this.setPSSubSysSADetailName(null);
        }
        else{
            this.setPSSubSysSADetailId(pSSubSysSADetail.getPSSubSysSADetailId());
            this.setPSSubSysSADetailName(pSSubSysSADetail.getPSSubSysSADetailName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADETAILNAME</B>&nbsp;外部服务接口方法
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADETAILID}
     */
    public final static String FIELD_PSSUBSYSSADETAILNAME = "pssubsyssadetailname";

    /**
     * 设置 外部服务接口方法
     * 
     * @param pSSubSysSADetailName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADETAILNAME)
    public void setPSSubSysSADetailName(String pSSubSysSADetailName){
        this.set(FIELD_PSSUBSYSSADETAILNAME, pSSubSysSADetailName);
    }
    
    /**
     * 获取 外部服务接口方法  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADetailName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口方法 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADetailNameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口方法
     */
    @JsonIgnore
    public void resetPSSubSysSADetailName(){
        this.reset(FIELD_PSSUBSYSSADETAILNAME);
    }

    /**
     * 设置 外部服务接口方法
     * <P>
     * 等同 {@link #setPSSubSysSADetailName}
     * @param pSSubSysSADetailName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssubsyssadetailname(String pSSubSysSADetailName){
        this.setPSSubSysSADetailName(pSSubSysSADetailName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSubSysServiceAPIDTO} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部服务接口
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部服务接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssubsysserviceapiid(PSSubSysServiceAPIDTO pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部服务接口
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部服务接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部服务接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSBACKSERVICEID</B>&nbsp;后台作业
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBackServiceDTO} 
     */
    public final static String FIELD_PSSYSBACKSERVICEID = "pssysbackserviceid";

    /**
     * 设置 后台作业
     * 
     * @param pSSysBackServiceId
     * 
     */
    @JsonProperty(FIELD_PSSYSBACKSERVICEID)
    public void setPSSysBackServiceId(String pSSysBackServiceId){
        this.set(FIELD_PSSYSBACKSERVICEID, pSSysBackServiceId);
    }
    
    /**
     * 获取 后台作业  
     * @return
     */
    @JsonIgnore
    public String getPSSysBackServiceId(){
        Object objValue = this.get(FIELD_PSSYSBACKSERVICEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台作业 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBackServiceIdDirty(){
        if(this.contains(FIELD_PSSYSBACKSERVICEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台作业
     */
    @JsonIgnore
    public void resetPSSysBackServiceId(){
        this.reset(FIELD_PSSYSBACKSERVICEID);
    }

    /**
     * 设置 后台作业
     * <P>
     * 等同 {@link #setPSSysBackServiceId}
     * @param pSSysBackServiceId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbackserviceid(String pSSysBackServiceId){
        this.setPSSysBackServiceId(pSSysBackServiceId);
        return this;
    }

    /**
     * 设置 后台作业，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBackServiceId}
     * @param pSSysBackService 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbackserviceid(PSSysBackServiceDTO pSSysBackService){
        if(pSSysBackService == null){
            this.setPSSysBackServiceId(null);
            this.setPSSysBackServiceName(null);
        }
        else{
            this.setPSSysBackServiceId(pSSysBackService.getPSSysBackServiceId());
            this.setPSSysBackServiceName(pSSysBackService.getPSSysBackServiceName());
        }
        return this;
    }

    /**
     * <B>PSSYSBACKSERVICENAME</B>&nbsp;后台作业
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBACKSERVICEID}
     */
    public final static String FIELD_PSSYSBACKSERVICENAME = "pssysbackservicename";

    /**
     * 设置 后台作业
     * 
     * @param pSSysBackServiceName
     * 
     */
    @JsonProperty(FIELD_PSSYSBACKSERVICENAME)
    public void setPSSysBackServiceName(String pSSysBackServiceName){
        this.set(FIELD_PSSYSBACKSERVICENAME, pSSysBackServiceName);
    }
    
    /**
     * 获取 后台作业  
     * @return
     */
    @JsonIgnore
    public String getPSSysBackServiceName(){
        Object objValue = this.get(FIELD_PSSYSBACKSERVICENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后台作业 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBackServiceNameDirty(){
        if(this.contains(FIELD_PSSYSBACKSERVICENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后台作业
     */
    @JsonIgnore
    public void resetPSSysBackServiceName(){
        this.reset(FIELD_PSSYSBACKSERVICENAME);
    }

    /**
     * 设置 后台作业
     * <P>
     * 等同 {@link #setPSSysBackServiceName}
     * @param pSSysBackServiceName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbackservicename(String pSSysBackServiceName){
        this.setPSSysBackServiceName(pSSysBackServiceName);
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMEID</B>&nbsp;大数据体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDSchemeDTO} 
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
    public PSDELogicNodeDTO pssysbdschemeid(String pSSysBDSchemeId){
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
    public PSDELogicNodeDTO pssysbdschemeid(PSSysBDSchemeDTO pSSysBDScheme){
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
     * <B>PSSYSBDSCHEMENAME</B>&nbsp;大数据体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDSCHEMEID}
     */
    public final static String FIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";

    /**
     * 设置 大数据体系
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
     * 设置 大数据体系
     * <P>
     * 等同 {@link #setPSSysBDSchemeName}
     * @param pSSysBDSchemeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbdschemename(String pSSysBDSchemeName){
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBDTableDTO} 
     */
    public final static String FIELD_PSSYSBDTABLEID = "pssysbdtableid";

    /**
     * 设置 大数据表
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
     * 设置 大数据表
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTableId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbdtableid(String pSSysBDTableId){
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
    public PSDELogicNodeDTO pssysbdtableid(PSSysBDTableDTO pSSysBDTable){
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
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDTABLEID}
     */
    public final static String FIELD_PSSYSBDTABLENAME = "pssysbdtablename";

    /**
     * 设置 大数据表
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
     * 设置 大数据表
     * <P>
     * 等同 {@link #setPSSysBDTableName}
     * @param pSSysBDTableName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    /**
     * <B>PSSYSBIREPORTID</B>&nbsp;智能报表
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSBIREPORTID = "pssysbireportid";

    /**
     * 设置 智能报表
     * 
     * @param pSSysBIReportId
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTID)
    public void setPSSysBIReportId(String pSSysBIReportId){
        this.set(FIELD_PSSYSBIREPORTID, pSSysBIReportId);
    }
    
    /**
     * 获取 智能报表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportId(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportIdDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表
     */
    @JsonIgnore
    public void resetPSSysBIReportId(){
        this.reset(FIELD_PSSYSBIREPORTID);
    }

    /**
     * 设置 智能报表
     * <P>
     * 等同 {@link #setPSSysBIReportId}
     * @param pSSysBIReportId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbireportid(String pSSysBIReportId){
        this.setPSSysBIReportId(pSSysBIReportId);
        return this;
    }

    /**
     * <B>PSSYSBIREPORTNAME</B>&nbsp;智能报表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBIREPORTID}
     */
    public final static String FIELD_PSSYSBIREPORTNAME = "pssysbireportname";

    /**
     * 设置 智能报表
     * 
     * @param pSSysBIReportName
     * 
     */
    @JsonProperty(FIELD_PSSYSBIREPORTNAME)
    public void setPSSysBIReportName(String pSSysBIReportName){
        this.set(FIELD_PSSYSBIREPORTNAME, pSSysBIReportName);
    }
    
    /**
     * 获取 智能报表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBIReportName(){
        Object objValue = this.get(FIELD_PSSYSBIREPORTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBIReportNameDirty(){
        if(this.contains(FIELD_PSSYSBIREPORTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表
     */
    @JsonIgnore
    public void resetPSSysBIReportName(){
        this.reset(FIELD_PSSYSBIREPORTNAME);
    }

    /**
     * 设置 智能报表
     * <P>
     * 等同 {@link #setPSSysBIReportName}
     * @param pSSysBIReportName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbireportname(String pSSysBIReportName){
        this.setPSSysBIReportName(pSSysBIReportName);
        return this;
    }

    /**
     * <B>PSSYSBISCHEMEID</B>&nbsp;智能报表体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysBISchemeDTO} 
     */
    public final static String FIELD_PSSYSBISCHEMEID = "pssysbischemeid";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMEID)
    public void setPSSysBISchemeId(String pSSysBISchemeId){
        this.set(FIELD_PSSYSBISCHEMEID, pSSysBISchemeId);
    }
    
    /**
     * 获取 智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeId(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeId(){
        this.reset(FIELD_PSSYSBISCHEMEID);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBISchemeId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbischemeid(String pSSysBISchemeId){
        this.setPSSysBISchemeId(pSSysBISchemeId);
        return this;
    }

    /**
     * 设置 智能报表体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBISchemeId}
     * @param pSSysBIScheme 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbischemeid(PSSysBISchemeDTO pSSysBIScheme){
        if(pSSysBIScheme == null){
            this.setPSSysBISchemeId(null);
            this.setPSSysBISchemeName(null);
        }
        else{
            this.setPSSysBISchemeId(pSSysBIScheme.getPSSysBISchemeId());
            this.setPSSysBISchemeName(pSSysBIScheme.getPSSysBISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBISCHEMENAME</B>&nbsp;智能报表体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBISCHEMEID}
     */
    public final static String FIELD_PSSYSBISCHEMENAME = "pssysbischemename";

    /**
     * 设置 智能报表体系
     * 
     * @param pSSysBISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBISCHEMENAME)
    public void setPSSysBISchemeName(String pSSysBISchemeName){
        this.set(FIELD_PSSYSBISCHEMENAME, pSSysBISchemeName);
    }
    
    /**
     * 获取 智能报表体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysBISchemeName(){
        Object objValue = this.get(FIELD_PSSYSBISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 智能报表体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 智能报表体系
     */
    @JsonIgnore
    public void resetPSSysBISchemeName(){
        this.reset(FIELD_PSSYSBISCHEMENAME);
    }

    /**
     * 设置 智能报表体系
     * <P>
     * 等同 {@link #setPSSysBISchemeName}
     * @param pSSysBISchemeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysbischemename(String pSSysBISchemeName){
        this.setPSSysBISchemeName(pSSysBISchemeName);
        return this;
    }

    /**
     * <B>PSSYSDATASYNCAGENTID</B>&nbsp;数据同步代理
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDataSyncAgentDTO} 
     */
    public final static String FIELD_PSSYSDATASYNCAGENTID = "pssysdatasyncagentid";

    /**
     * 设置 数据同步代理
     * 
     * @param pSSysDataSyncAgentId
     * 
     */
    @JsonProperty(FIELD_PSSYSDATASYNCAGENTID)
    public void setPSSysDataSyncAgentId(String pSSysDataSyncAgentId){
        this.set(FIELD_PSSYSDATASYNCAGENTID, pSSysDataSyncAgentId);
    }
    
    /**
     * 获取 数据同步代理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDataSyncAgentId(){
        Object objValue = this.get(FIELD_PSSYSDATASYNCAGENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据同步代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDataSyncAgentIdDirty(){
        if(this.contains(FIELD_PSSYSDATASYNCAGENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据同步代理
     */
    @JsonIgnore
    public void resetPSSysDataSyncAgentId(){
        this.reset(FIELD_PSSYSDATASYNCAGENTID);
    }

    /**
     * 设置 数据同步代理
     * <P>
     * 等同 {@link #setPSSysDataSyncAgentId}
     * @param pSSysDataSyncAgentId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdatasyncagentid(String pSSysDataSyncAgentId){
        this.setPSSysDataSyncAgentId(pSSysDataSyncAgentId);
        return this;
    }

    /**
     * 设置 数据同步代理，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDataSyncAgentId}
     * @param pSSysDataSyncAgent 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdatasyncagentid(PSSysDataSyncAgentDTO pSSysDataSyncAgent){
        if(pSSysDataSyncAgent == null){
            this.setPSSysDataSyncAgentId(null);
            this.setPSSysDataSyncAgentName(null);
        }
        else{
            this.setPSSysDataSyncAgentId(pSSysDataSyncAgent.getPSSysDataSyncAgentId());
            this.setPSSysDataSyncAgentName(pSSysDataSyncAgent.getPSSysDataSyncAgentName());
        }
        return this;
    }

    /**
     * <B>PSSYSDATASYNCAGENTNAME</B>&nbsp;数据同步代理
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDATASYNCAGENTID}
     */
    public final static String FIELD_PSSYSDATASYNCAGENTNAME = "pssysdatasyncagentname";

    /**
     * 设置 数据同步代理
     * 
     * @param pSSysDataSyncAgentName
     * 
     */
    @JsonProperty(FIELD_PSSYSDATASYNCAGENTNAME)
    public void setPSSysDataSyncAgentName(String pSSysDataSyncAgentName){
        this.set(FIELD_PSSYSDATASYNCAGENTNAME, pSSysDataSyncAgentName);
    }
    
    /**
     * 获取 数据同步代理  
     * @return
     */
    @JsonIgnore
    public String getPSSysDataSyncAgentName(){
        Object objValue = this.get(FIELD_PSSYSDATASYNCAGENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据同步代理 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDataSyncAgentNameDirty(){
        if(this.contains(FIELD_PSSYSDATASYNCAGENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据同步代理
     */
    @JsonIgnore
    public void resetPSSysDataSyncAgentName(){
        this.reset(FIELD_PSSYSDATASYNCAGENTNAME);
    }

    /**
     * 设置 数据同步代理
     * <P>
     * 等同 {@link #setPSSysDataSyncAgentName}
     * @param pSSysDataSyncAgentName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdatasyncagentname(String pSSysDataSyncAgentName){
        this.setPSSysDataSyncAgentName(pSSysDataSyncAgentName);
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMEID</B>&nbsp;数据库体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDBSchemeDTO} 
     */
    public final static String FIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";

    /**
     * 设置 数据库体系
     * 
     * @param pSSysDBSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMEID)
    public void setPSSysDBSchemeId(String pSSysDBSchemeId){
        this.set(FIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }
    
    /**
     * 获取 数据库体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBSchemeId(){
        Object objValue = this.get(FIELD_PSSYSDBSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSDBSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库体系
     */
    @JsonIgnore
    public void resetPSSysDBSchemeId(){
        this.reset(FIELD_PSSYSDBSCHEMEID);
    }

    /**
     * 设置 数据库体系
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBSchemeId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdbschemeid(String pSSysDBSchemeId){
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    /**
     * 设置 数据库体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBScheme 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdbschemeid(PSSysDBSchemeDTO pSSysDBScheme){
        if(pSSysDBScheme == null){
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBSchemeName(null);
        }
        else{
            this.setPSSysDBSchemeId(pSSysDBScheme.getPSSysDBSchemeId());
            this.setPSSysDBSchemeName(pSSysDBScheme.getPSSysDBSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMENAME</B>&nbsp;数据库体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBSCHEMEID}
     */
    public final static String FIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";

    /**
     * 设置 数据库体系
     * 
     * @param pSSysDBSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMENAME)
    public void setPSSysDBSchemeName(String pSSysDBSchemeName){
        this.set(FIELD_PSSYSDBSCHEMENAME, pSSysDBSchemeName);
    }
    
    /**
     * 获取 数据库体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBSchemeName(){
        Object objValue = this.get(FIELD_PSSYSDBSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSDBSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库体系
     */
    @JsonIgnore
    public void resetPSSysDBSchemeName(){
        this.reset(FIELD_PSSYSDBSCHEMENAME);
    }

    /**
     * 设置 数据库体系
     * <P>
     * 等同 {@link #setPSSysDBSchemeName}
     * @param pSSysDBSchemeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdbschemename(String pSSysDBSchemeName){
        this.setPSSysDBSchemeName(pSSysDBSchemeName);
        return this;
    }

    /**
     * <B>PSSYSDBTABLEID</B>&nbsp;数据表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDBTableDTO} 
     */
    public final static String FIELD_PSSYSDBTABLEID = "pssysdbtableid";

    /**
     * 设置 数据表
     * 
     * @param pSSysDBTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLEID)
    public void setPSSysDBTableId(String pSSysDBTableId){
        this.set(FIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }
    
    /**
     * 获取 数据表  
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
     * 判断 数据表 是否指定值，包括空值
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
     * 重置 数据表
     */
    @JsonIgnore
    public void resetPSSysDBTableId(){
        this.reset(FIELD_PSSYSDBTABLEID);
    }

    /**
     * 设置 数据表
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTableId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdbtableid(String pSSysDBTableId){
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    /**
     * 设置 数据表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTable 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdbtableid(PSSysDBTableDTO pSSysDBTable){
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
     * <B>PSSYSDBTABLENAME</B>&nbsp;数据表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBTABLEID}
     */
    public final static String FIELD_PSSYSDBTABLENAME = "pssysdbtablename";

    /**
     * 设置 数据表
     * 
     * @param pSSysDBTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLENAME)
    public void setPSSysDBTableName(String pSSysDBTableName){
        this.set(FIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }
    
    /**
     * 获取 数据表  
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
     * 判断 数据表 是否指定值，包括空值
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
     * 重置 数据表
     */
    @JsonIgnore
    public void resetPSSysDBTableName(){
        this.reset(FIELD_PSSYSDBTABLENAME);
    }

    /**
     * 设置 数据表
     * <P>
     * 等同 {@link #setPSSysDBTableName}
     * @param pSSysDBTableName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdbtablename(String pSSysDBTableName){
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    /**
     * <B>PSSYSDELOGICNODEID</B>&nbsp;系统逻辑处理节点，指定调用的系统预定义逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDELogicNodeDTO} 
     */
    public final static String FIELD_PSSYSDELOGICNODEID = "pssysdelogicnodeid";

    /**
     * 设置 系统逻辑处理节点，详细说明：{@link #FIELD_PSSYSDELOGICNODEID}
     * 
     * @param pSSysDELogicNodeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDELOGICNODEID)
    public void setPSSysDELogicNodeId(String pSSysDELogicNodeId){
        this.set(FIELD_PSSYSDELOGICNODEID, pSSysDELogicNodeId);
    }
    
    /**
     * 获取 系统逻辑处理节点  
     * @return
     */
    @JsonIgnore
    public String getPSSysDELogicNodeId(){
        Object objValue = this.get(FIELD_PSSYSDELOGICNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统逻辑处理节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDELogicNodeIdDirty(){
        if(this.contains(FIELD_PSSYSDELOGICNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统逻辑处理节点
     */
    @JsonIgnore
    public void resetPSSysDELogicNodeId(){
        this.reset(FIELD_PSSYSDELOGICNODEID);
    }

    /**
     * 设置 系统逻辑处理节点，详细说明：{@link #FIELD_PSSYSDELOGICNODEID}
     * <P>
     * 等同 {@link #setPSSysDELogicNodeId}
     * @param pSSysDELogicNodeId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdelogicnodeid(String pSSysDELogicNodeId){
        this.setPSSysDELogicNodeId(pSSysDELogicNodeId);
        return this;
    }

    /**
     * 设置 系统逻辑处理节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDELogicNodeId}
     * @param pSSysDELogicNode 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdelogicnodeid(PSSysDELogicNodeDTO pSSysDELogicNode){
        if(pSSysDELogicNode == null){
            this.setPSSysDELogicNodeId(null);
            this.setPSSysDELogicNodeName(null);
        }
        else{
            this.setPSSysDELogicNodeId(pSSysDELogicNode.getPSSysDELogicNodeId());
            this.setPSSysDELogicNodeName(pSSysDELogicNode.getPSSysDELogicNodeName());
        }
        return this;
    }

    /**
     * <B>PSSYSDELOGICNODENAME</B>&nbsp;系统处理逻辑，指定调用的系统预定义逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDELOGICNODEID}
     */
    public final static String FIELD_PSSYSDELOGICNODENAME = "pssysdelogicnodename";

    /**
     * 设置 系统处理逻辑，详细说明：{@link #FIELD_PSSYSDELOGICNODENAME}
     * 
     * @param pSSysDELogicNodeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDELOGICNODENAME)
    public void setPSSysDELogicNodeName(String pSSysDELogicNodeName){
        this.set(FIELD_PSSYSDELOGICNODENAME, pSSysDELogicNodeName);
    }
    
    /**
     * 获取 系统处理逻辑  
     * @return
     */
    @JsonIgnore
    public String getPSSysDELogicNodeName(){
        Object objValue = this.get(FIELD_PSSYSDELOGICNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统处理逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDELogicNodeNameDirty(){
        if(this.contains(FIELD_PSSYSDELOGICNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统处理逻辑
     */
    @JsonIgnore
    public void resetPSSysDELogicNodeName(){
        this.reset(FIELD_PSSYSDELOGICNODENAME);
    }

    /**
     * 设置 系统处理逻辑，详细说明：{@link #FIELD_PSSYSDELOGICNODENAME}
     * <P>
     * 等同 {@link #setPSSysDELogicNodeName}
     * @param pSSysDELogicNodeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysdelogicnodename(String pSSysDELogicNodeName){
        this.setPSSysDELogicNodeName(pSSysDELogicNodeName);
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTID</B>&nbsp;系统集成元素
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAIElementDTO} 
     */
    public final static String FIELD_PSSYSEAIELEMENTID = "pssyseaielementid";

    /**
     * 设置 系统集成元素
     * 
     * @param pSSysEAIElementId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTID)
    public void setPSSysEAIElementId(String pSSysEAIElementId){
        this.set(FIELD_PSSYSEAIELEMENTID, pSSysEAIElementId);
    }
    
    /**
     * 获取 系统集成元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementId(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementIdDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementId(){
        this.reset(FIELD_PSSYSEAIELEMENTID);
    }

    /**
     * 设置 系统集成元素
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElementId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyseaielementid(String pSSysEAIElementId){
        this.setPSSysEAIElementId(pSSysEAIElementId);
        return this;
    }

    /**
     * 设置 系统集成元素，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAIElementId}
     * @param pSSysEAIElement 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyseaielementid(PSSysEAIElementDTO pSSysEAIElement){
        if(pSSysEAIElement == null){
            this.setPSSysEAIElementId(null);
            this.setPSSysEAIElementName(null);
        }
        else{
            this.setPSSysEAIElementId(pSSysEAIElement.getPSSysEAIElementId());
            this.setPSSysEAIElementName(pSSysEAIElement.getPSSysEAIElementName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAIELEMENTNAME</B>&nbsp;系统集成元素
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAIELEMENTID}
     */
    public final static String FIELD_PSSYSEAIELEMENTNAME = "pssyseaielementname";

    /**
     * 设置 系统集成元素
     * 
     * @param pSSysEAIElementName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAIELEMENTNAME)
    public void setPSSysEAIElementName(String pSSysEAIElementName){
        this.set(FIELD_PSSYSEAIELEMENTNAME, pSSysEAIElementName);
    }
    
    /**
     * 获取 系统集成元素  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAIElementName(){
        Object objValue = this.get(FIELD_PSSYSEAIELEMENTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成元素 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAIElementNameDirty(){
        if(this.contains(FIELD_PSSYSEAIELEMENTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成元素
     */
    @JsonIgnore
    public void resetPSSysEAIElementName(){
        this.reset(FIELD_PSSYSEAIELEMENTNAME);
    }

    /**
     * 设置 系统集成元素
     * <P>
     * 等同 {@link #setPSSysEAIElementName}
     * @param pSSysEAIElementName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyseaielementname(String pSSysEAIElementName){
        this.setPSSysEAIElementName(pSSysEAIElementName);
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMEID</B>&nbsp;系统集成体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysEAISchemeDTO} 
     */
    public final static String FIELD_PSSYSEAISCHEMEID = "pssyseaischemeid";

    /**
     * 设置 系统集成体系
     * 
     * @param pSSysEAISchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMEID)
    public void setPSSysEAISchemeId(String pSSysEAISchemeId){
        this.set(FIELD_PSSYSEAISCHEMEID, pSSysEAISchemeId);
    }
    
    /**
     * 获取 系统集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeId(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeIdDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeId(){
        this.reset(FIELD_PSSYSEAISCHEMEID);
    }

    /**
     * 设置 系统集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAISchemeId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyseaischemeid(String pSSysEAISchemeId){
        this.setPSSysEAISchemeId(pSSysEAISchemeId);
        return this;
    }

    /**
     * 设置 系统集成体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysEAISchemeId}
     * @param pSSysEAIScheme 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyseaischemeid(PSSysEAISchemeDTO pSSysEAIScheme){
        if(pSSysEAIScheme == null){
            this.setPSSysEAISchemeId(null);
            this.setPSSysEAISchemeName(null);
        }
        else{
            this.setPSSysEAISchemeId(pSSysEAIScheme.getPSSysEAISchemeId());
            this.setPSSysEAISchemeName(pSSysEAIScheme.getPSSysEAISchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSEAISCHEMENAME</B>&nbsp;系统集成体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSEAISCHEMEID}
     */
    public final static String FIELD_PSSYSEAISCHEMENAME = "pssyseaischemename";

    /**
     * 设置 系统集成体系
     * 
     * @param pSSysEAISchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSEAISCHEMENAME)
    public void setPSSysEAISchemeName(String pSSysEAISchemeName){
        this.set(FIELD_PSSYSEAISCHEMENAME, pSSysEAISchemeName);
    }
    
    /**
     * 获取 系统集成体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysEAISchemeName(){
        Object objValue = this.get(FIELD_PSSYSEAISCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统集成体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysEAISchemeNameDirty(){
        if(this.contains(FIELD_PSSYSEAISCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统集成体系
     */
    @JsonIgnore
    public void resetPSSysEAISchemeName(){
        this.reset(FIELD_PSSYSEAISCHEMENAME);
    }

    /**
     * 设置 系统集成体系
     * <P>
     * 等同 {@link #setPSSysEAISchemeName}
     * @param pSSysEAISchemeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyseaischemename(String pSSysEAISchemeName){
        this.setPSSysEAISchemeName(pSSysEAISchemeName);
        return this;
    }

    /**
     * <B>PSSYSMSGTEMPLID</B>&nbsp;消息模板
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysMsgTemplDTO} 
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
    public PSDELogicNodeDTO pssysmsgtemplid(String pSSysMsgTemplId){
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
    public PSDELogicNodeDTO pssysmsgtemplid(PSSysMsgTemplDTO pSSysMsgTempl){
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
    public PSDELogicNodeDTO pssysmsgtemplname(String pSSysMsgTemplName){
        this.setPSSysMsgTemplName(pSSysMsgTemplName);
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINID</B>&nbsp;前端扩展插件，指定实体处理逻辑节点使用的前端模板扩展插件，使用插件类型【界面逻辑节点】
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysPFPluginDTO} 
     */
    public final static String FIELD_PSSYSPFPLUGINID = "pssyspfpluginid";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * 
     * @param pSSysPFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINID)
    public void setPSSysPFPluginId(String pSSysPFPluginId){
        this.set(FIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginId(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginId(){
        this.reset(FIELD_PSSYSPFPLUGINID);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINID}
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPluginId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyspfpluginid(String pSSysPFPluginId){
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    /**
     * 设置 前端扩展插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysPFPluginId}
     * @param pSSysPFPlugin 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin){
        if(pSSysPFPlugin == null){
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        }
        else{
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSPFPLUGINNAME</B>&nbsp;前端扩展插件，指定实体处理逻辑节点使用的前端模板扩展插件，使用插件类型【界面逻辑节点】
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSPFPLUGINID}
     */
    public final static String FIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * 
     * @param pSSysPFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSPFPLUGINNAME)
    public void setPSSysPFPluginName(String pSSysPFPluginName){
        this.set(FIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }
    
    /**
     * 获取 前端扩展插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysPFPluginName(){
        Object objValue = this.get(FIELD_PSSYSPFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端扩展插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSPFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端扩展插件
     */
    @JsonIgnore
    public void resetPSSysPFPluginName(){
        this.reset(FIELD_PSSYSPFPLUGINNAME);
    }

    /**
     * 设置 前端扩展插件，详细说明：{@link #FIELD_PSSYSPFPLUGINNAME}
     * <P>
     * 等同 {@link #setPSSysPFPluginName}
     * @param pSSysPFPluginName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyspfpluginname(String pSSysPFPluginName){
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    /**
     * <B>PSSYSRESOURCEID</B>&nbsp;系统资源
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysResourceDTO} 
     */
    public final static String FIELD_PSSYSRESOURCEID = "pssysresourceid";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceId
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCEID)
    public void setPSSysResourceId(String pSSysResourceId){
        this.set(FIELD_PSSYSRESOURCEID, pSSysResourceId);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceId(){
        Object objValue = this.get(FIELD_PSSYSRESOURCEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceIdDirty(){
        if(this.contains(FIELD_PSSYSRESOURCEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceId(){
        this.reset(FIELD_PSSYSRESOURCEID);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResourceId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysresourceid(String pSSysResourceId){
        this.setPSSysResourceId(pSSysResourceId);
        return this;
    }

    /**
     * 设置 系统资源，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysResourceId}
     * @param pSSysResource 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysresourceid(PSSysResourceDTO pSSysResource){
        if(pSSysResource == null){
            this.setPSSysResourceId(null);
            this.setPSSysResourceName(null);
        }
        else{
            this.setPSSysResourceId(pSSysResource.getPSSysResourceId());
            this.setPSSysResourceName(pSSysResource.getPSSysResourceName());
        }
        return this;
    }

    /**
     * <B>PSSYSRESOURCENAME</B>&nbsp;系统资源
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSRESOURCEID}
     */
    public final static String FIELD_PSSYSRESOURCENAME = "pssysresourcename";

    /**
     * 设置 系统资源
     * 
     * @param pSSysResourceName
     * 
     */
    @JsonProperty(FIELD_PSSYSRESOURCENAME)
    public void setPSSysResourceName(String pSSysResourceName){
        this.set(FIELD_PSSYSRESOURCENAME, pSSysResourceName);
    }
    
    /**
     * 获取 系统资源  
     * @return
     */
    @JsonIgnore
    public String getPSSysResourceName(){
        Object objValue = this.get(FIELD_PSSYSRESOURCENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统资源 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysResourceNameDirty(){
        if(this.contains(FIELD_PSSYSRESOURCENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统资源
     */
    @JsonIgnore
    public void resetPSSysResourceName(){
        this.reset(FIELD_PSSYSRESOURCENAME);
    }

    /**
     * 设置 系统资源
     * <P>
     * 等同 {@link #setPSSysResourceName}
     * @param pSSysResourceName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysresourcename(String pSSysResourceName){
        this.setPSSysResourceName(pSSysResourceName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCID</B>&nbsp;全文检索文档
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchDocDTO} 
     */
    public final static String FIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";

    /**
     * 设置 全文检索文档
     * 
     * @param pSSysSearchDocId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCID)
    public void setPSSysSearchDocId(String pSSysSearchDocId){
        this.set(FIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocId(){
        this.reset(FIELD_PSSYSSEARCHDOCID);
    }

    /**
     * 设置 全文检索文档
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDocId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchdocid(String pSSysSearchDocId){
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    /**
     * 设置 全文检索文档，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDoc 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchdocid(PSSysSearchDocDTO pSSysSearchDoc){
        if(pSSysSearchDoc == null){
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        }
        else{
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCNAME</B>&nbsp;全文检索文档
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHDOCID}
     */
    public final static String FIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";

    /**
     * 设置 全文检索文档
     * 
     * @param pSSysSearchDocName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCNAME)
    public void setPSSysSearchDocName(String pSSysSearchDocName){
        this.set(FIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocName(){
        this.reset(FIELD_PSSYSSEARCHDOCNAME);
    }

    /**
     * 设置 全文检索文档
     * <P>
     * 等同 {@link #setPSSysSearchDocName}
     * @param pSSysSearchDocName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchdocname(String pSSysSearchDocName){
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMEID</B>&nbsp;全文检索体系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSearchSchemeDTO} 
     */
    public final static String FIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";

    /**
     * 设置 全文检索体系
     * 
     * @param pSSysSearchSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMEID)
    public void setPSSysSearchSchemeId(String pSSysSearchSchemeId){
        this.set(FIELD_PSSYSSEARCHSCHEMEID, pSSysSearchSchemeId);
    }
    
    /**
     * 获取 全文检索体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索体系
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeId(){
        this.reset(FIELD_PSSYSSEARCHSCHEMEID);
    }

    /**
     * 设置 全文检索体系
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchSchemeId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchschemeid(String pSSysSearchSchemeId){
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    /**
     * 设置 全文检索体系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchScheme 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchschemeid(PSSysSearchSchemeDTO pSSysSearchScheme){
        if(pSSysSearchScheme == null){
            this.setPSSysSearchSchemeId(null);
            this.setPSSysSearchSchemeName(null);
        }
        else{
            this.setPSSysSearchSchemeId(pSSysSearchScheme.getPSSysSearchSchemeId());
            this.setPSSysSearchSchemeName(pSSysSearchScheme.getPSSysSearchSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMENAME</B>&nbsp;全文检索体系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHSCHEMEID}
     */
    public final static String FIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";

    /**
     * 设置 全文检索体系
     * 
     * @param pSSysSearchSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMENAME)
    public void setPSSysSearchSchemeName(String pSSysSearchSchemeName){
        this.set(FIELD_PSSYSSEARCHSCHEMENAME, pSSysSearchSchemeName);
    }
    
    /**
     * 获取 全文检索体系  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索体系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索体系
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeName(){
        this.reset(FIELD_PSSYSSEARCHSCHEMENAME);
    }

    /**
     * 设置 全文检索体系
     * <P>
     * 等同 {@link #setPSSysSearchSchemeName}
     * @param pSSysSearchSchemeName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssearchschemename(String pSSysSearchSchemeName){
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后台扩展插件，指定处理节点的后台模板插件，使用插件代码替换原有逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO} 
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
    public PSDELogicNodeDTO pssyssfpluginid(String pSSysSFPluginId){
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
    public PSDELogicNodeDTO pssyssfpluginid(PSSysSFPluginDTO pSSysSFPlugin){
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
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后台扩展插件，指定处理节点的后台模板插件，使用插件代码替换原有逻辑
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
    public PSDELogicNodeDTO pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSSQLCMDID</B>&nbsp;系统数据库命令
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSSQLCMDID = "pssyssqlcmdid";

    /**
     * 设置 系统数据库命令
     * 
     * @param pSSysSQLCmdId
     * 
     */
    @JsonProperty(FIELD_PSSYSSQLCMDID)
    public void setPSSysSQLCmdId(String pSSysSQLCmdId){
        this.set(FIELD_PSSYSSQLCMDID, pSSysSQLCmdId);
    }
    
    /**
     * 获取 系统数据库命令  
     * @return
     */
    @JsonIgnore
    public String getPSSysSQLCmdId(){
        Object objValue = this.get(FIELD_PSSYSSQLCMDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库命令 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSQLCmdIdDirty(){
        if(this.contains(FIELD_PSSYSSQLCMDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库命令
     */
    @JsonIgnore
    public void resetPSSysSQLCmdId(){
        this.reset(FIELD_PSSYSSQLCMDID);
    }

    /**
     * 设置 系统数据库命令
     * <P>
     * 等同 {@link #setPSSysSQLCmdId}
     * @param pSSysSQLCmdId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssqlcmdid(String pSSysSQLCmdId){
        this.setPSSysSQLCmdId(pSSysSQLCmdId);
        return this;
    }

    /**
     * <B>PSSYSSQLCMDNAME</B>&nbsp;系统数据库命令
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSQLCMDID}
     */
    public final static String FIELD_PSSYSSQLCMDNAME = "pssyssqlcmdname";

    /**
     * 设置 系统数据库命令
     * 
     * @param pSSysSQLCmdName
     * 
     */
    @JsonProperty(FIELD_PSSYSSQLCMDNAME)
    public void setPSSysSQLCmdName(String pSSysSQLCmdName){
        this.set(FIELD_PSSYSSQLCMDNAME, pSSysSQLCmdName);
    }
    
    /**
     * 获取 系统数据库命令  
     * @return
     */
    @JsonIgnore
    public String getPSSysSQLCmdName(){
        Object objValue = this.get(FIELD_PSSYSSQLCMDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库命令 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSQLCmdNameDirty(){
        if(this.contains(FIELD_PSSYSSQLCMDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库命令
     */
    @JsonIgnore
    public void resetPSSysSQLCmdName(){
        this.reset(FIELD_PSSYSSQLCMDNAME);
    }

    /**
     * 设置 系统数据库命令
     * <P>
     * 等同 {@link #setPSSysSQLCmdName}
     * @param pSSysSQLCmdName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssyssqlcmdname(String pSSysSQLCmdName){
        this.setPSSysSQLCmdName(pSSysSQLCmdName);
        return this;
    }

    /**
     * <B>PSSYSUNISTATEID</B>&nbsp;系统统一状态
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUniStateDTO} 
     */
    public final static String FIELD_PSSYSUNISTATEID = "pssysunistateid";

    /**
     * 设置 系统统一状态
     * 
     * @param pSSysUniStateId
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATEID)
    public void setPSSysUniStateId(String pSSysUniStateId){
        this.set(FIELD_PSSYSUNISTATEID, pSSysUniStateId);
    }
    
    /**
     * 获取 系统统一状态  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniStateId(){
        Object objValue = this.get(FIELD_PSSYSUNISTATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniStateIdDirty(){
        if(this.contains(FIELD_PSSYSUNISTATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一状态
     */
    @JsonIgnore
    public void resetPSSysUniStateId(){
        this.reset(FIELD_PSSYSUNISTATEID);
    }

    /**
     * 设置 系统统一状态
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniStateId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysunistateid(String pSSysUniStateId){
        this.setPSSysUniStateId(pSSysUniStateId);
        return this;
    }

    /**
     * 设置 系统统一状态，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUniStateId}
     * @param pSSysUniState 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysunistateid(PSSysUniStateDTO pSSysUniState){
        if(pSSysUniState == null){
            this.setPSSysUniStateId(null);
            this.setPSSysUniStateName(null);
        }
        else{
            this.setPSSysUniStateId(pSSysUniState.getPSSysUniStateId());
            this.setPSSysUniStateName(pSSysUniState.getPSSysUniStateName());
        }
        return this;
    }

    /**
     * <B>PSSYSUNISTATENAME</B>&nbsp;系统统一状态
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUNISTATEID}
     */
    public final static String FIELD_PSSYSUNISTATENAME = "pssysunistatename";

    /**
     * 设置 系统统一状态
     * 
     * @param pSSysUniStateName
     * 
     */
    @JsonProperty(FIELD_PSSYSUNISTATENAME)
    public void setPSSysUniStateName(String pSSysUniStateName){
        this.set(FIELD_PSSYSUNISTATENAME, pSSysUniStateName);
    }
    
    /**
     * 获取 系统统一状态  
     * @return
     */
    @JsonIgnore
    public String getPSSysUniStateName(){
        Object objValue = this.get(FIELD_PSSYSUNISTATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统统一状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUniStateNameDirty(){
        if(this.contains(FIELD_PSSYSUNISTATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统统一状态
     */
    @JsonIgnore
    public void resetPSSysUniStateName(){
        this.reset(FIELD_PSSYSUNISTATENAME);
    }

    /**
     * 设置 系统统一状态
     * <P>
     * 等同 {@link #setPSSysUniStateName}
     * @param pSSysUniStateName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysunistatename(String pSSysUniStateName){
        this.setPSSysUniStateName(pSSysUniStateName);
        return this;
    }

    /**
     * <B>PSSYSUTILDEID</B>&nbsp;系统功能组件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO} 
     */
    public final static String FIELD_PSSYSUTILDEID = "pssysutildeid";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEId
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDEID)
    public void setPSSysUtilDEId(String pSSysUtilDEId){
        this.set(FIELD_PSSYSUTILDEID, pSSysUtilDEId);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEId(){
        Object objValue = this.get(FIELD_PSSYSUTILDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDEIdDirty(){
        if(this.contains(FIELD_PSSYSUTILDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEId(){
        this.reset(FIELD_PSSYSUTILDEID);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtilDEId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysutildeid(String pSSysUtilDEId){
        this.setPSSysUtilDEId(pSSysUtilDEId);
        return this;
    }

    /**
     * 设置 系统功能组件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUtilDEId}
     * @param pSSysUtil 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysutildeid(PSSysUtilDTO pSSysUtil){
        if(pSSysUtil == null){
            this.setPSSysUtilDEId(null);
            this.setPSSysUtilDEName(null);
        }
        else{
            this.setPSSysUtilDEId(pSSysUtil.getPSSysUtilId());
            this.setPSSysUtilDEName(pSSysUtil.getPSSysUtilName());
        }
        return this;
    }

    /**
     * <B>PSSYSUTILDENAME</B>&nbsp;系统功能组件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUTILDEID}
     */
    public final static String FIELD_PSSYSUTILDENAME = "pssysutildename";

    /**
     * 设置 系统功能组件
     * 
     * @param pSSysUtilDEName
     * 
     */
    @JsonProperty(FIELD_PSSYSUTILDENAME)
    public void setPSSysUtilDEName(String pSSysUtilDEName){
        this.set(FIELD_PSSYSUTILDENAME, pSSysUtilDEName);
    }
    
    /**
     * 获取 系统功能组件  
     * @return
     */
    @JsonIgnore
    public String getPSSysUtilDEName(){
        Object objValue = this.get(FIELD_PSSYSUTILDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统功能组件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUtilDENameDirty(){
        if(this.contains(FIELD_PSSYSUTILDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统功能组件
     */
    @JsonIgnore
    public void resetPSSysUtilDEName(){
        this.reset(FIELD_PSSYSUTILDENAME);
    }

    /**
     * 设置 系统功能组件
     * <P>
     * 等同 {@link #setPSSysUtilDEName}
     * @param pSSysUtilDEName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pssysutildename(String pSSysUtilDEName){
        this.setPSSysUtilDEName(pSSysUtilDEName);
        return this;
    }

    /**
     * <B>PSWFDEID</B>&nbsp;工作流实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWFDEDTO} 
     */
    public final static String FIELD_PSWFDEID = "pswfdeid";

    /**
     * 设置 工作流实体
     * 
     * @param pSWFDEId
     * 
     */
    @JsonProperty(FIELD_PSWFDEID)
    public void setPSWFDEId(String pSWFDEId){
        this.set(FIELD_PSWFDEID, pSWFDEId);
    }
    
    /**
     * 获取 工作流实体  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEId(){
        Object objValue = this.get(FIELD_PSWFDEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDEIdDirty(){
        if(this.contains(FIELD_PSWFDEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流实体
     */
    @JsonIgnore
    public void resetPSWFDEId(){
        this.reset(FIELD_PSWFDEID);
    }

    /**
     * 设置 工作流实体
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDEId
     */
    @JsonIgnore
    public PSDELogicNodeDTO pswfdeid(String pSWFDEId){
        this.setPSWFDEId(pSWFDEId);
        return this;
    }

    /**
     * 设置 工作流实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWFDEId}
     * @param pSWFDE 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO pswfdeid(PSWFDEDTO pSWFDE){
        if(pSWFDE == null){
            this.setPSWFDEId(null);
            this.setPSWFDEName(null);
        }
        else{
            this.setPSWFDEId(pSWFDE.getPSWFDEId());
            this.setPSWFDEName(pSWFDE.getPSWFDEName());
        }
        return this;
    }

    /**
     * <B>PSWFDENAME</B>&nbsp;工作流实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWFDEID}
     */
    public final static String FIELD_PSWFDENAME = "pswfdename";

    /**
     * 设置 工作流实体
     * 
     * @param pSWFDEName
     * 
     */
    @JsonProperty(FIELD_PSWFDENAME)
    public void setPSWFDEName(String pSWFDEName){
        this.set(FIELD_PSWFDENAME, pSWFDEName);
    }
    
    /**
     * 获取 工作流实体  
     * @return
     */
    @JsonIgnore
    public String getPSWFDEName(){
        Object objValue = this.get(FIELD_PSWFDENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWFDENameDirty(){
        if(this.contains(FIELD_PSWFDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流实体
     */
    @JsonIgnore
    public void resetPSWFDEName(){
        this.reset(FIELD_PSWFDENAME);
    }

    /**
     * 设置 工作流实体
     * <P>
     * 等同 {@link #setPSWFDEName}
     * @param pSWFDEName
     */
    @JsonIgnore
    public PSDELogicNodeDTO pswfdename(String pSWFDEName){
        this.setPSWFDEName(pSWFDEName);
        return this;
    }

    /**
     * <B>PSWORKFLOWID</B>&nbsp;工作流，指定启动的工作流
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSWorkflowDTO} 
     */
    public final static String FIELD_PSWORKFLOWID = "psworkflowid";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWID}
     * 
     * @param pSWorkflowId
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWID)
    public void setPSWorkflowId(String pSWorkflowId){
        this.set(FIELD_PSWORKFLOWID, pSWorkflowId);
    }
    
    /**
     * 获取 工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowId(){
        Object objValue = this.get(FIELD_PSWORKFLOWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowIdDirty(){
        if(this.contains(FIELD_PSWORKFLOWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWorkflowId(){
        this.reset(FIELD_PSWORKFLOWID);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWID}
     * <P>
     * 等同 {@link #setPSWorkflowId}
     * @param pSWorkflowId
     */
    @JsonIgnore
    public PSDELogicNodeDTO psworkflowid(String pSWorkflowId){
        this.setPSWorkflowId(pSWorkflowId);
        return this;
    }

    /**
     * 设置 工作流，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSWorkflowId}
     * @param pSWorkflow 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO psworkflowid(PSWorkflowDTO pSWorkflow){
        if(pSWorkflow == null){
            this.setPSWorkflowId(null);
            this.setPSWorkflowName(null);
        }
        else{
            this.setPSWorkflowId(pSWorkflow.getPSWorkflowId());
            this.setPSWorkflowName(pSWorkflow.getPSWorkflowName());
        }
        return this;
    }

    /**
     * <B>PSWORKFLOWNAME</B>&nbsp;工作流，指定启动的工作流
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSWORKFLOWID}
     */
    public final static String FIELD_PSWORKFLOWNAME = "psworkflowname";

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWNAME}
     * 
     * @param pSWorkflowName
     * 
     */
    @JsonProperty(FIELD_PSWORKFLOWNAME)
    public void setPSWorkflowName(String pSWorkflowName){
        this.set(FIELD_PSWORKFLOWNAME, pSWorkflowName);
    }
    
    /**
     * 获取 工作流  
     * @return
     */
    @JsonIgnore
    public String getPSWorkflowName(){
        Object objValue = this.get(FIELD_PSWORKFLOWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 工作流 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSWorkflowNameDirty(){
        if(this.contains(FIELD_PSWORKFLOWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 工作流
     */
    @JsonIgnore
    public void resetPSWorkflowName(){
        this.reset(FIELD_PSWORKFLOWNAME);
    }

    /**
     * 设置 工作流，详细说明：{@link #FIELD_PSWORKFLOWNAME}
     * <P>
     * 等同 {@link #setPSWorkflowName}
     * @param pSWorkflowName
     */
    @JsonIgnore
    public PSDELogicNodeDTO psworkflowname(String pSWorkflowName){
        this.setPSWorkflowName(pSWorkflowName);
        return this;
    }

    /**
     * <B>RETPSDLPARAMID</B>&nbsp;返回绑定参数，指定操作的返回值填充参数对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO} 
     */
    public final static String FIELD_RETPSDLPARAMID = "retpsdlparamid";

    /**
     * 设置 返回绑定参数，详细说明：{@link #FIELD_RETPSDLPARAMID}
     * 
     * @param retPSDLParamId
     * 
     */
    @JsonProperty(FIELD_RETPSDLPARAMID)
    public void setRetPSDLParamId(String retPSDLParamId){
        this.set(FIELD_RETPSDLPARAMID, retPSDLParamId);
    }
    
    /**
     * 获取 返回绑定参数  
     * @return
     */
    @JsonIgnore
    public String getRetPSDLParamId(){
        Object objValue = this.get(FIELD_RETPSDLPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 返回绑定参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetPSDLParamIdDirty(){
        if(this.contains(FIELD_RETPSDLPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 返回绑定参数
     */
    @JsonIgnore
    public void resetRetPSDLParamId(){
        this.reset(FIELD_RETPSDLPARAMID);
    }

    /**
     * 设置 返回绑定参数，详细说明：{@link #FIELD_RETPSDLPARAMID}
     * <P>
     * 等同 {@link #setRetPSDLParamId}
     * @param retPSDLParamId
     */
    @JsonIgnore
    public PSDELogicNodeDTO retpsdlparamid(String retPSDLParamId){
        this.setRetPSDLParamId(retPSDLParamId);
        return this;
    }

    /**
     * 设置 返回绑定参数，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRetPSDLParamId}
     * @param pSDELogicParam 引用对象
     */
    @JsonIgnore
    public PSDELogicNodeDTO retpsdlparamid(PSDELogicParamDTO pSDELogicParam){
        if(pSDELogicParam == null){
            this.setRetPSDLParamId(null);
            this.setRetPSDLParamName(null);
        }
        else{
            this.setRetPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setRetPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>RETPSDLPARAMNAME</B>&nbsp;返回绑定参数，指定操作的返回值填充参数对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_RETPSDLPARAMID}
     */
    public final static String FIELD_RETPSDLPARAMNAME = "retpsdlparamname";

    /**
     * 设置 返回绑定参数，详细说明：{@link #FIELD_RETPSDLPARAMNAME}
     * 
     * @param retPSDLParamName
     * 
     */
    @JsonProperty(FIELD_RETPSDLPARAMNAME)
    public void setRetPSDLParamName(String retPSDLParamName){
        this.set(FIELD_RETPSDLPARAMNAME, retPSDLParamName);
    }
    
    /**
     * 获取 返回绑定参数  
     * @return
     */
    @JsonIgnore
    public String getRetPSDLParamName(){
        Object objValue = this.get(FIELD_RETPSDLPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 返回绑定参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRetPSDLParamNameDirty(){
        if(this.contains(FIELD_RETPSDLPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 返回绑定参数
     */
    @JsonIgnore
    public void resetRetPSDLParamName(){
        this.reset(FIELD_RETPSDLPARAMNAME);
    }

    /**
     * 设置 返回绑定参数，详细说明：{@link #FIELD_RETPSDLPARAMNAME}
     * <P>
     * 等同 {@link #setRetPSDLParamName}
     * @param retPSDLParamName
     */
    @JsonIgnore
    public PSDELogicNodeDTO retpsdlparamname(String retPSDLParamName){
        this.setRetPSDLParamName(retPSDLParamName);
        return this;
    }

    /**
     * <B>SHAPEPARAMS</B>&nbsp;形状参数
     */
    public final static String FIELD_SHAPEPARAMS = "shapeparams";

    /**
     * 设置 形状参数
     * 
     * @param shapeParams
     * 
     */
    @JsonProperty(FIELD_SHAPEPARAMS)
    public void setShapeParams(String shapeParams){
        this.set(FIELD_SHAPEPARAMS, shapeParams);
    }
    
    /**
     * 获取 形状参数  
     * @return
     */
    @JsonIgnore
    public String getShapeParams(){
        Object objValue = this.get(FIELD_SHAPEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 形状参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeParamsDirty(){
        if(this.contains(FIELD_SHAPEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 形状参数
     */
    @JsonIgnore
    public void resetShapeParams(){
        this.reset(FIELD_SHAPEPARAMS);
    }

    /**
     * 设置 形状参数
     * <P>
     * 等同 {@link #setShapeParams}
     * @param shapeParams
     */
    @JsonIgnore
    public PSDELogicNodeDTO shapeparams(String shapeParams){
        this.setShapeParams(shapeParams);
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
    public PSDELogicNodeDTO srcindex(Integer srcIndex){
        this.setSrcIndex(srcIndex);
        return this;
    }

    /**
     * <B>SRCPSDLPARAMID</B>&nbsp;源参数，指定操作的源参数对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO} 
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
    public PSDELogicNodeDTO srcpsdlparamid(String srcPSDLParamId){
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
    public PSDELogicNodeDTO srcpsdlparamid(PSDELogicParamDTO pSDELogicParam){
        if(pSDELogicParam == null){
            this.setSrcPSDLParamId(null);
            this.setSrcPSDLParamName(null);
        }
        else{
            this.setSrcPSDLParamId(pSDELogicParam.getPSDELogicParamId());
            this.setSrcPSDLParamName(pSDELogicParam.getPSDELogicParamName());
        }
        return this;
    }

    /**
     * <B>SRCPSDLPARAMNAME</B>&nbsp;源参数，指定操作的源参数对象
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
    public PSDELogicNodeDTO srcpsdlparamname(String srcPSDLParamName){
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
    public PSDELogicNodeDTO srcsize(Integer srcSize){
        this.setSrcSize(srcSize);
        return this;
    }

    /**
     * <B>THREADRUNMODE</B>&nbsp;线程运行模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DELogicNodeThreadRunMode} 
     */
    public final static String FIELD_THREADRUNMODE = "threadrunmode";

    /**
     * 设置 线程运行模式
     * 
     * @param threadRunMode
     * 
     */
    @JsonProperty(FIELD_THREADRUNMODE)
    public void setThreadRunMode(Integer threadRunMode){
        this.set(FIELD_THREADRUNMODE, threadRunMode);
    }
    
    /**
     * 获取 线程运行模式  
     * @return
     */
    @JsonIgnore
    public Integer getThreadRunMode(){
        Object objValue = this.get(FIELD_THREADRUNMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 线程运行模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThreadRunModeDirty(){
        if(this.contains(FIELD_THREADRUNMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 线程运行模式
     */
    @JsonIgnore
    public void resetThreadRunMode(){
        this.reset(FIELD_THREADRUNMODE);
    }

    /**
     * 设置 线程运行模式
     * <P>
     * 等同 {@link #setThreadRunMode}
     * @param threadRunMode
     */
    @JsonIgnore
    public PSDELogicNodeDTO threadrunmode(Integer threadRunMode){
        this.setThreadRunMode(threadRunMode);
        return this;
    }

     /**
     * 设置 线程运行模式
     * <P>
     * 等同 {@link #setThreadRunMode}
     * @param threadRunMode
     */
    @JsonIgnore
    public PSDELogicNodeDTO threadrunmode(net.ibizsys.model.PSModelEnums.DELogicNodeThreadRunMode threadRunMode){
        if(threadRunMode == null){
            this.setThreadRunMode(null);
        }
        else{
            this.setThreadRunMode(threadRunMode.value);
        }
        return this;
    }

    /**
     * <B>THREADRUNTIMER</B>&nbsp;线程运行间隔，指定处理节点的异步处理间隔，单位为【毫秒】，-1为未定义，未定义时为【-1】
     */
    public final static String FIELD_THREADRUNTIMER = "threadruntimer";

    /**
     * 设置 线程运行间隔，详细说明：{@link #FIELD_THREADRUNTIMER}
     * 
     * @param threadRunTimer
     * 
     */
    @JsonProperty(FIELD_THREADRUNTIMER)
    public void setThreadRunTimer(Integer threadRunTimer){
        this.set(FIELD_THREADRUNTIMER, threadRunTimer);
    }
    
    /**
     * 获取 线程运行间隔  
     * @return
     */
    @JsonIgnore
    public Integer getThreadRunTimer(){
        Object objValue = this.get(FIELD_THREADRUNTIMER);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 线程运行间隔 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isThreadRunTimerDirty(){
        if(this.contains(FIELD_THREADRUNTIMER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 线程运行间隔
     */
    @JsonIgnore
    public void resetThreadRunTimer(){
        this.reset(FIELD_THREADRUNTIMER);
    }

    /**
     * 设置 线程运行间隔，详细说明：{@link #FIELD_THREADRUNTIMER}
     * <P>
     * 等同 {@link #setThreadRunTimer}
     * @param threadRunTimer
     */
    @JsonIgnore
    public PSDELogicNodeDTO threadruntimer(Integer threadRunTimer){
        this.setThreadRunTimer(threadRunTimer);
        return this;
    }

    /**
     * <B>TOPPOS</B>&nbsp;上坐标，指定处理节点在设计界面的图元的左上角Y值，未定义时为【0】
     */
    public final static String FIELD_TOPPOS = "toppos";

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * 
     * @param topPos
     * 
     */
    @JsonProperty(FIELD_TOPPOS)
    public void setTopPos(Integer topPos){
        this.set(FIELD_TOPPOS, topPos);
    }
    
    /**
     * 获取 上坐标  
     * @return
     */
    @JsonIgnore
    public Integer getTopPos(){
        Object objValue = this.get(FIELD_TOPPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 上坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopPosDirty(){
        if(this.contains(FIELD_TOPPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上坐标
     */
    @JsonIgnore
    public void resetTopPos(){
        this.reset(FIELD_TOPPOS);
    }

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * <P>
     * 等同 {@link #setTopPos}
     * @param topPos
     */
    @JsonIgnore
    public PSDELogicNodeDTO toppos(Integer topPos){
        this.setTopPos(topPos);
        return this;
    }

    /**
     * <B>TSMODE</B>&nbsp;事务模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.DELogicNodeTSMode} 
     */
    public final static String FIELD_TSMODE = "tsmode";

    /**
     * 设置 事务模式
     * 
     * @param tSMode
     * 
     */
    @JsonProperty(FIELD_TSMODE)
    public void setTSMode(Integer tSMode){
        this.set(FIELD_TSMODE, tSMode);
    }
    
    /**
     * 获取 事务模式  
     * @return
     */
    @JsonIgnore
    public Integer getTSMode(){
        Object objValue = this.get(FIELD_TSMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 事务模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTSModeDirty(){
        if(this.contains(FIELD_TSMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 事务模式
     */
    @JsonIgnore
    public void resetTSMode(){
        this.reset(FIELD_TSMODE);
    }

    /**
     * 设置 事务模式
     * <P>
     * 等同 {@link #setTSMode}
     * @param tSMode
     */
    @JsonIgnore
    public PSDELogicNodeDTO tsmode(Integer tSMode){
        this.setTSMode(tSMode);
        return this;
    }

     /**
     * 设置 事务模式
     * <P>
     * 等同 {@link #setTSMode}
     * @param tSMode
     */
    @JsonIgnore
    public PSDELogicNodeDTO tsmode(net.ibizsys.model.PSModelEnums.DELogicNodeTSMode tSMode){
        if(tSMode == null){
            this.setTSMode(null);
        }
        else{
            this.setTSMode(tSMode.value);
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
    public PSDELogicNodeDTO updatedate(Timestamp updateDate){
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
    public PSDELogicNodeDTO updateman(String updateMan){
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
    public PSDELogicNodeDTO usercat(String userCat){
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
    public PSDELogicNodeDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERPARAMS</B>&nbsp;用户参数
     */
    public final static String FIELD_USERPARAMS = "userparams";

    /**
     * 设置 用户参数
     * 
     * @param userParams
     * 
     */
    @JsonProperty(FIELD_USERPARAMS)
    public void setUserParams(String userParams){
        this.set(FIELD_USERPARAMS, userParams);
    }
    
    /**
     * 获取 用户参数  
     * @return
     */
    @JsonIgnore
    public String getUserParams(){
        Object objValue = this.get(FIELD_USERPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 用户参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserParamsDirty(){
        if(this.contains(FIELD_USERPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 用户参数
     */
    @JsonIgnore
    public void resetUserParams(){
        this.reset(FIELD_USERPARAMS);
    }

    /**
     * 设置 用户参数
     * <P>
     * 等同 {@link #setUserParams}
     * @param userParams
     */
    @JsonIgnore
    public PSDELogicNodeDTO userparams(String userParams){
        this.setUserParams(userParams);
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
    public PSDELogicNodeDTO usertag(String userTag){
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
    public PSDELogicNodeDTO usertag2(String userTag2){
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
    public PSDELogicNodeDTO usertag3(String userTag3){
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
    public PSDELogicNodeDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDELogicNodeId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDELogicNodeId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDELogicNodeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDELogicNodeId(strValue);
    }

    @JsonIgnore
    public PSDELogicNodeDTO id(String strValue){
        this.setPSDELogicNodeId(strValue);
        return this;
    }


    /**
     *  实体处理逻辑节点参数 成员集合
     */
    public final static String FIELD_PSDELNPARAMS = "psdelnparams";

    private java.util.List<net.ibizsys.centralstudio.dto.PSDELNParamDTO> psdelnparams;

    /**
     * 获取 实体处理逻辑节点参数 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDELNPARAMS)
    public java.util.List<net.ibizsys.centralstudio.dto.PSDELNParamDTO> getPSDELNParams(){
        return this.psdelnparams;
    }

    /**
     * 设置 实体处理逻辑节点参数 成员集合  
     * @param psdelnparams
     */
    @JsonProperty(FIELD_PSDELNPARAMS)
    public void setPSDELNParams(java.util.List<net.ibizsys.centralstudio.dto.PSDELNParamDTO> psdelnparams){
        this.psdelnparams = psdelnparams;
    }

    /**
     * 获取 实体处理逻辑节点参数 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.centralstudio.dto.PSDELNParamDTO> getPSDELNParamsIf(){
        if(this.psdelnparams == null){
            this.psdelnparams = new java.util.ArrayList<net.ibizsys.centralstudio.dto.PSDELNParamDTO>();          
        }
        return this.psdelnparams;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDELogicNodeDTO){
            PSDELogicNodeDTO dto = (PSDELogicNodeDTO)iEntity;
            dto.setPSDELNParams(this.getPSDELNParams());
        }
        super.copyTo(iEntity);
    }
}
