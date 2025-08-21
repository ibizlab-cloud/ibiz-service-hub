package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFDLOGIC</B>表单成员逻辑 模型传输对象
 * <P>
 * 实体表单成员的动态逻辑模型。（1）为成员提供动态的显示隐藏、启用禁用及空输入控制，支持组合、单项条件类型，支持层级逻辑结构（2）事件的响应代码
 */
public class PSDEFDLogic extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFDLogic(){
    }      

    /**
     * <B>CONDVALUE</B>&nbsp;条件值，单项逻辑的条件值
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_CONDVALUE = "condvalue";

    /**
     * 设置 条件值，详细说明：{@link #FIELD_CONDVALUE}
     * 
     * @param condValue
     * 
     */
    @JsonProperty(FIELD_CONDVALUE)
    public void setCondValue(String condValue){
        this.set(FIELD_CONDVALUE, condValue);
    }
    
    /**
     * 获取 条件值  
     * @return
     */
    @JsonIgnore
    public String getCondValue(){
        Object objValue = this.get(FIELD_CONDVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCondValueDirty(){
        if(this.contains(FIELD_CONDVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件值
     */
    @JsonIgnore
    public void resetCondValue(){
        this.reset(FIELD_CONDVALUE);
    }

    /**
     * 设置 条件值，详细说明：{@link #FIELD_CONDVALUE}
     * <P>
     * 等同 {@link #setCondValue}
     * @param condValue
     */
    @JsonIgnore
    public PSDEFDLogic condvalue(String condValue){
        this.setCondValue(condValue);
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
    public PSDEFDLogic createdate(String createDate){
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
    public PSDEFDLogic createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCODE</B>&nbsp;自定义代码，逻辑分类为【SCRIPTCODE_XXXX】时指定响应代码
     */
    public final static String FIELD_CUSTOMCODE = "customcode";

    /**
     * 设置 自定义代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * 
     * @param customCode
     * 
     */
    @JsonProperty(FIELD_CUSTOMCODE)
    public void setCustomCode(String customCode){
        this.set(FIELD_CUSTOMCODE, customCode);
    }
    
    /**
     * 获取 自定义代码  
     * @return
     */
    @JsonIgnore
    public String getCustomCode(){
        Object objValue = this.get(FIELD_CUSTOMCODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCodeDirty(){
        if(this.contains(FIELD_CUSTOMCODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义代码
     */
    @JsonIgnore
    public void resetCustomCode(){
        this.reset(FIELD_CUSTOMCODE);
    }

    /**
     * 设置 自定义代码，详细说明：{@link #FIELD_CUSTOMCODE}
     * <P>
     * 等同 {@link #setCustomCode}
     * @param customCode
     */
    @JsonIgnore
    public PSDEFDLogic customcode(String customCode){
        this.setCustomCode(customCode);
        return this;
    }

    /**
     * <B>FDNAME</B>&nbsp;表单项名称，单项逻辑判断的表单项名称
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_FDNAME = "fdname";

    /**
     * 设置 表单项名称，详细说明：{@link #FIELD_FDNAME}
     * 
     * @param fDName
     * 
     */
    @JsonProperty(FIELD_FDNAME)
    public void setFDName(String fDName){
        this.set(FIELD_FDNAME, fDName);
    }
    
    /**
     * 获取 表单项名称  
     * @return
     */
    @JsonIgnore
    public String getFDName(){
        Object objValue = this.get(FIELD_FDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFDNameDirty(){
        if(this.contains(FIELD_FDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单项名称
     */
    @JsonIgnore
    public void resetFDName(){
        this.reset(FIELD_FDNAME);
    }

    /**
     * 设置 表单项名称，详细说明：{@link #FIELD_FDNAME}
     * <P>
     * 等同 {@link #setFDName}
     * @param fDName
     */
    @JsonIgnore
    public PSDEFDLogic fdname(String fDName){
        this.setFDName(fDName);
        return this;
    }

    /**
     * <B>GROUPNOTFLAG</B>&nbsp;逻辑取反，条件逻辑是否进行取反，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_GROUPNOTFLAG = "groupnotflag";

    /**
     * 设置 逻辑取反，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * 
     * @param groupNotFlag
     * 
     */
    @JsonProperty(FIELD_GROUPNOTFLAG)
    public void setGroupNotFlag(Integer groupNotFlag){
        this.set(FIELD_GROUPNOTFLAG, groupNotFlag);
    }
    
    /**
     * 获取 逻辑取反  
     * @return
     */
    @JsonIgnore
    public Integer getGroupNotFlag(){
        Object objValue = this.get(FIELD_GROUPNOTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 逻辑取反 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupNotFlagDirty(){
        if(this.contains(FIELD_GROUPNOTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑取反
     */
    @JsonIgnore
    public void resetGroupNotFlag(){
        this.reset(FIELD_GROUPNOTFLAG);
    }

    /**
     * 设置 逻辑取反，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * <P>
     * 等同 {@link #setGroupNotFlag}
     * @param groupNotFlag
     */
    @JsonIgnore
    public PSDEFDLogic groupnotflag(Integer groupNotFlag){
        this.setGroupNotFlag(groupNotFlag);
        return this;
    }

     /**
     * 设置 逻辑取反，详细说明：{@link #FIELD_GROUPNOTFLAG}
     * <P>
     * 等同 {@link #setGroupNotFlag}
     * @param groupNotFlag
     */
    @JsonIgnore
    public PSDEFDLogic groupnotflag(Boolean groupNotFlag){
        if(groupNotFlag == null){
            this.setGroupNotFlag(null);
        }
        else{
            this.setGroupNotFlag(groupNotFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>GROUPOP</B>&nbsp;组合条件操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP} 
     */
    public final static String FIELD_GROUPOP = "groupop";

    /**
     * 设置 组合条件操作
     * 
     * @param groupOP
     * 
     */
    @JsonProperty(FIELD_GROUPOP)
    public void setGroupOP(String groupOP){
        this.set(FIELD_GROUPOP, groupOP);
    }
    
    /**
     * 获取 组合条件操作  
     * @return
     */
    @JsonIgnore
    public String getGroupOP(){
        Object objValue = this.get(FIELD_GROUPOP);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组合条件操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isGroupOPDirty(){
        if(this.contains(FIELD_GROUPOP)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组合条件操作
     */
    @JsonIgnore
    public void resetGroupOP(){
        this.reset(FIELD_GROUPOP);
    }

    /**
     * 设置 组合条件操作
     * <P>
     * 等同 {@link #setGroupOP}
     * @param groupOP
     */
    @JsonIgnore
    public PSDEFDLogic groupop(String groupOP){
        this.setGroupOP(groupOP);
        return this;
    }

     /**
     * 设置 组合条件操作
     * <P>
     * 等同 {@link #setGroupOP}
     * @param groupOP
     */
    @JsonIgnore
    public PSDEFDLogic groupop(net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP groupOP){
        if(groupOP == null){
            this.setGroupOP(null);
        }
        else{
            this.setGroupOP(groupOP.value);
        }
        return this;
    }

    /**
     * <B>LOGICCAT</B>&nbsp;逻辑分类
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailLogicCat} 
     */
    public final static String FIELD_LOGICCAT = "logiccat";

    /**
     * 设置 逻辑分类
     * 
     * @param logicCat
     * 
     */
    @JsonProperty(FIELD_LOGICCAT)
    public void setLogicCat(String logicCat){
        this.set(FIELD_LOGICCAT, logicCat);
    }
    
    /**
     * 获取 逻辑分类  
     * @return
     */
    @JsonIgnore
    public String getLogicCat(){
        Object objValue = this.get(FIELD_LOGICCAT);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑分类 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicCatDirty(){
        if(this.contains(FIELD_LOGICCAT)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑分类
     */
    @JsonIgnore
    public void resetLogicCat(){
        this.reset(FIELD_LOGICCAT);
    }

    /**
     * 设置 逻辑分类
     * <P>
     * 等同 {@link #setLogicCat}
     * @param logicCat
     */
    @JsonIgnore
    public PSDEFDLogic logiccat(String logicCat){
        this.setLogicCat(logicCat);
        return this;
    }

     /**
     * 设置 逻辑分类
     * <P>
     * 等同 {@link #setLogicCat}
     * @param logicCat
     */
    @JsonIgnore
    public PSDEFDLogic logiccat(net.ibizsys.psmodel.core.util.PSModelEnums.CtrlDetailLogicCat logicCat){
        if(logicCat == null){
            this.setLogicCat(null);
        }
        else{
            this.setLogicCat(logicCat.value);
        }
        return this;
    }

    /**
     * <B>LOGICTYPE</B>&nbsp;逻辑类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailLogicType} 
     */
    public final static String FIELD_LOGICTYPE = "logictype";

    /**
     * 设置 逻辑类型
     * 
     * @param logicType
     * 
     */
    @JsonProperty(FIELD_LOGICTYPE)
    public void setLogicType(String logicType){
        this.set(FIELD_LOGICTYPE, logicType);
    }
    
    /**
     * 获取 逻辑类型  
     * @return
     */
    @JsonIgnore
    public String getLogicType(){
        Object objValue = this.get(FIELD_LOGICTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicTypeDirty(){
        if(this.contains(FIELD_LOGICTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑类型
     */
    @JsonIgnore
    public void resetLogicType(){
        this.reset(FIELD_LOGICTYPE);
    }

    /**
     * 设置 逻辑类型
     * <P>
     * 等同 {@link #setLogicType}
     * @param logicType
     */
    @JsonIgnore
    public PSDEFDLogic logictype(String logicType){
        this.setLogicType(logicType);
        return this;
    }

     /**
     * 设置 逻辑类型
     * <P>
     * 等同 {@link #setLogicType}
     * @param logicType
     */
    @JsonIgnore
    public PSDEFDLogic logictype(net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailLogicType logicType){
        if(logicType == null){
            this.setLogicType(null);
        }
        else{
            this.setLogicType(logicType.value);
        }
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
    public PSDEFDLogic ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSDEFDLOGICID</B>&nbsp;父逻辑
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFDLogic} 
     */
    public final static String FIELD_PPSDEFDLOGICID = "ppsdefdlogicid";

    /**
     * 设置 父逻辑
     * 
     * @param pPSDEFDLogicId
     * 
     */
    @JsonProperty(FIELD_PPSDEFDLOGICID)
    public void setPPSDEFDLogicId(String pPSDEFDLogicId){
        this.set(FIELD_PPSDEFDLOGICID, pPSDEFDLogicId);
    }
    
    /**
     * 获取 父逻辑  
     * @return
     */
    @JsonIgnore
    public String getPPSDEFDLogicId(){
        Object objValue = this.get(FIELD_PPSDEFDLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEFDLogicIdDirty(){
        if(this.contains(FIELD_PPSDEFDLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父逻辑
     */
    @JsonIgnore
    public void resetPPSDEFDLogicId(){
        this.reset(FIELD_PPSDEFDLOGICID);
    }

    /**
     * 设置 父逻辑
     * <P>
     * 等同 {@link #setPPSDEFDLogicId}
     * @param pPSDEFDLogicId
     */
    @JsonIgnore
    public PSDEFDLogic ppsdefdlogicid(String pPSDEFDLogicId){
        this.setPPSDEFDLogicId(pPSDEFDLogicId);
        return this;
    }

    /**
     * 设置 父逻辑，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSDEFDLogicId}
     * @param pSDEFDLogic 引用对象
     */
    @JsonIgnore
    public PSDEFDLogic ppsdefdlogicid(PSDEFDLogic pSDEFDLogic){
        if(pSDEFDLogic == null){
            this.setPPSDEFDLogicId(null);
            this.setPPSDEFDLogicName(null);
        }
        else{
            this.setPPSDEFDLogicId(pSDEFDLogic.getPSDEFDLogicId());
            this.setPPSDEFDLogicName(pSDEFDLogic.getPSDEFDLogicName());
        }
        return this;
    }

    /**
     * <B>PPSDEFDLOGICNAME</B>&nbsp;父逻辑
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSDEFDLOGICID}
     */
    public final static String FIELD_PPSDEFDLOGICNAME = "ppsdefdlogicname";

    /**
     * 设置 父逻辑
     * 
     * @param pPSDEFDLogicName
     * 
     */
    @JsonProperty(FIELD_PPSDEFDLOGICNAME)
    public void setPPSDEFDLogicName(String pPSDEFDLogicName){
        this.set(FIELD_PPSDEFDLOGICNAME, pPSDEFDLogicName);
    }
    
    /**
     * 获取 父逻辑  
     * @return
     */
    @JsonIgnore
    public String getPPSDEFDLogicName(){
        Object objValue = this.get(FIELD_PPSDEFDLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父逻辑 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSDEFDLogicNameDirty(){
        if(this.contains(FIELD_PPSDEFDLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父逻辑
     */
    @JsonIgnore
    public void resetPPSDEFDLogicName(){
        this.reset(FIELD_PPSDEFDLOGICNAME);
    }

    /**
     * 设置 父逻辑
     * <P>
     * 等同 {@link #setPPSDEFDLogicName}
     * @param pPSDEFDLogicName
     */
    @JsonIgnore
    public PSDEFDLogic ppsdefdlogicname(String pPSDEFDLogicName){
        this.setPPSDEFDLogicName(pPSDEFDLogicName);
        return this;
    }

    /**
     * <B>PSDBVALUEOPID</B>&nbsp;条件操作
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBValueOP3} 
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDBValueOP} 
     */
    public final static String FIELD_PSDBVALUEOPID = "psdbvalueopid";

    /**
     * 设置 条件操作
     * 
     * @param pSDBValueOPId
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPID)
    public void setPSDBValueOPId(String pSDBValueOPId){
        this.set(FIELD_PSDBVALUEOPID, pSDBValueOPId);
    }
    
    /**
     * 获取 条件操作  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPId(){
        Object objValue = this.get(FIELD_PSDBVALUEOPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件操作 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPIdDirty(){
        if(this.contains(FIELD_PSDBVALUEOPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件操作
     */
    @JsonIgnore
    public void resetPSDBValueOPId(){
        this.reset(FIELD_PSDBVALUEOPID);
    }

    /**
     * 设置 条件操作
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOPId
     */
    @JsonIgnore
    public PSDEFDLogic psdbvalueopid(String pSDBValueOPId){
        this.setPSDBValueOPId(pSDBValueOPId);
        return this;
    }

    /**
     * 设置 条件操作，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDBValueOPId}
     * @param pSDBValueOP 引用对象
     */
    @JsonIgnore
    public PSDEFDLogic psdbvalueopid(PSDBValueOP pSDBValueOP){
        if(pSDBValueOP == null){
            this.setPSDBValueOPId(null);
            this.setPSDBValueOPName(null);
        }
        else{
            this.setPSDBValueOPId(pSDBValueOP.getPSDBValueOPId());
            this.setPSDBValueOPName(pSDBValueOP.getPSDBValueOPName());
        }
        return this;
    }

    /**
     * <B>PSDBVALUEOPNAME</B>&nbsp;条件操作符号
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDBVALUEOPID}
     */
    public final static String FIELD_PSDBVALUEOPNAME = "psdbvalueopname";

    /**
     * 设置 条件操作符号
     * 
     * @param pSDBValueOPName
     * 
     */
    @JsonProperty(FIELD_PSDBVALUEOPNAME)
    public void setPSDBValueOPName(String pSDBValueOPName){
        this.set(FIELD_PSDBVALUEOPNAME, pSDBValueOPName);
    }
    
    /**
     * 获取 条件操作符号  
     * @return
     */
    @JsonIgnore
    public String getPSDBValueOPName(){
        Object objValue = this.get(FIELD_PSDBVALUEOPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 条件操作符号 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDBValueOPNameDirty(){
        if(this.contains(FIELD_PSDBVALUEOPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 条件操作符号
     */
    @JsonIgnore
    public void resetPSDBValueOPName(){
        this.reset(FIELD_PSDBVALUEOPNAME);
    }

    /**
     * 设置 条件操作符号
     * <P>
     * 等同 {@link #setPSDBValueOPName}
     * @param pSDBValueOPName
     */
    @JsonIgnore
    public PSDEFDLogic psdbvalueopname(String pSDBValueOPName){
        this.setPSDBValueOPName(pSDBValueOPName);
        return this;
    }

    /**
     * <B>PSDEFDLOGICID</B>&nbsp;实体表单成员逻辑项标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFDLOGICID = "psdefdlogicid";

    /**
     * 设置 实体表单成员逻辑项标识
     * 
     * @param pSDEFDLogicId
     * 
     */
    @JsonProperty(FIELD_PSDEFDLOGICID)
    public void setPSDEFDLogicId(String pSDEFDLogicId){
        this.set(FIELD_PSDEFDLOGICID, pSDEFDLogicId);
    }
    
    /**
     * 获取 实体表单成员逻辑项标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFDLogicId(){
        Object objValue = this.get(FIELD_PSDEFDLOGICID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单成员逻辑项标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFDLogicIdDirty(){
        if(this.contains(FIELD_PSDEFDLOGICID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单成员逻辑项标识
     */
    @JsonIgnore
    public void resetPSDEFDLogicId(){
        this.reset(FIELD_PSDEFDLOGICID);
    }

    /**
     * 设置 实体表单成员逻辑项标识
     * <P>
     * 等同 {@link #setPSDEFDLogicId}
     * @param pSDEFDLogicId
     */
    @JsonIgnore
    public PSDEFDLogic psdefdlogicid(String pSDEFDLogicId){
        this.setPSDEFDLogicId(pSDEFDLogicId);
        return this;
    }

    /**
     * <B>PSDEFDLOGICNAME</B>&nbsp;逻辑项名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFDLOGICNAME = "psdefdlogicname";

    /**
     * 设置 逻辑项名称
     * 
     * @param pSDEFDLogicName
     * 
     */
    @JsonProperty(FIELD_PSDEFDLOGICNAME)
    public void setPSDEFDLogicName(String pSDEFDLogicName){
        this.set(FIELD_PSDEFDLOGICNAME, pSDEFDLogicName);
    }
    
    /**
     * 获取 逻辑项名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFDLogicName(){
        Object objValue = this.get(FIELD_PSDEFDLOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑项名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFDLogicNameDirty(){
        if(this.contains(FIELD_PSDEFDLOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑项名称
     */
    @JsonIgnore
    public void resetPSDEFDLogicName(){
        this.reset(FIELD_PSDEFDLOGICNAME);
    }

    /**
     * 设置 逻辑项名称
     * <P>
     * 等同 {@link #setPSDEFDLogicName}
     * @param pSDEFDLogicName
     */
    @JsonIgnore
    public PSDEFDLogic psdefdlogicname(String pSDEFDLogicName){
        this.setPSDEFDLogicName(pSDEFDLogicName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFDLogicName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFDLogicName(strName);
    }

    @JsonIgnore
    public PSDEFDLogic name(String strName){
        this.setPSDEFDLogicName(strName);
        return this;
    }

    /**
     * <B>PSDEFORMDETAILID</B>&nbsp;所属表单成员，指定动态逻辑项所属表单成员
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFormDetail} 
     */
    public final static String FIELD_PSDEFORMDETAILID = "psdeformdetailid";

    /**
     * 设置 所属表单成员，详细说明：{@link #FIELD_PSDEFORMDETAILID}
     * 
     * @param pSDEFormDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMDETAILID)
    public void setPSDEFormDetailId(String pSDEFormDetailId){
        this.set(FIELD_PSDEFORMDETAILID, pSDEFormDetailId);
    }
    
    /**
     * 获取 所属表单成员  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormDetailId(){
        Object objValue = this.get(FIELD_PSDEFORMDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 所属表单成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormDetailIdDirty(){
        if(this.contains(FIELD_PSDEFORMDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 所属表单成员
     */
    @JsonIgnore
    public void resetPSDEFormDetailId(){
        this.reset(FIELD_PSDEFORMDETAILID);
    }

    /**
     * 设置 所属表单成员，详细说明：{@link #FIELD_PSDEFORMDETAILID}
     * <P>
     * 等同 {@link #setPSDEFormDetailId}
     * @param pSDEFormDetailId
     */
    @JsonIgnore
    public PSDEFDLogic psdeformdetailid(String pSDEFormDetailId){
        this.setPSDEFormDetailId(pSDEFormDetailId);
        return this;
    }

    /**
     * 设置 所属表单成员，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormDetailId}
     * @param pSDEFormDetail 引用对象
     */
    @JsonIgnore
    public PSDEFDLogic psdeformdetailid(PSDEFormDetail pSDEFormDetail){
        if(pSDEFormDetail == null){
            this.setPSDEFormDetailId(null);
            this.setPSDEFormDetailName(null);
        }
        else{
            this.setPSDEFormDetailId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPSDEFormDetailName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMDETAILNAME</B>&nbsp;表单成员，指定动态逻辑项所属表单成员
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMDETAILID}
     */
    public final static String FIELD_PSDEFORMDETAILNAME = "psdeformdetailname";

    /**
     * 设置 表单成员，详细说明：{@link #FIELD_PSDEFORMDETAILNAME}
     * 
     * @param pSDEFormDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMDETAILNAME)
    public void setPSDEFormDetailName(String pSDEFormDetailName){
        this.set(FIELD_PSDEFORMDETAILNAME, pSDEFormDetailName);
    }
    
    /**
     * 获取 表单成员  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormDetailName(){
        Object objValue = this.get(FIELD_PSDEFORMDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表单成员 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormDetailNameDirty(){
        if(this.contains(FIELD_PSDEFORMDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表单成员
     */
    @JsonIgnore
    public void resetPSDEFormDetailName(){
        this.reset(FIELD_PSDEFORMDETAILNAME);
    }

    /**
     * 设置 表单成员，详细说明：{@link #FIELD_PSDEFORMDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEFormDetailName}
     * @param pSDEFormDetailName
     */
    @JsonIgnore
    public PSDEFDLogic psdeformdetailname(String pSDEFormDetailName){
        this.setPSDEFormDetailName(pSDEFormDetailName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单，指定动态逻辑项所属表单对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_PSDEFORMID = "psdeformid";

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * 
     * @param pSDEFormId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMID)
    public void setPSDEFormId(String pSDEFormId){
        this.set(FIELD_PSDEFORMID, pSDEFormId);
    }
    
    /**
     * 获取 实体表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormId(){
        Object objValue = this.get(FIELD_PSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormIdDirty(){
        if(this.contains(FIELD_PSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormId(){
        this.reset(FIELD_PSDEFORMID);
    }

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMID}
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEFormId
     */
    @JsonIgnore
    public PSDEFDLogic psdeformid(String pSDEFormId){
        this.setPSDEFormId(pSDEFormId);
        return this;
    }

    /**
     * 设置 实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEFDLogic psdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setPSDEFormId(null);
            this.setPSDEFormName(null);
        }
        else{
            this.setPSDEFormId(pSDEForm.getPSDEFormId());
            this.setPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>PSDEFORMNAME</B>&nbsp;实体表单，指定动态逻辑项所属表单对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMID}
     */
    public final static String FIELD_PSDEFORMNAME = "psdeformname";

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * 
     * @param pSDEFormName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMNAME)
    public void setPSDEFormName(String pSDEFormName){
        this.set(FIELD_PSDEFORMNAME, pSDEFormName);
    }
    
    /**
     * 获取 实体表单  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormName(){
        Object objValue = this.get(FIELD_PSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormNameDirty(){
        if(this.contains(FIELD_PSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单
     */
    @JsonIgnore
    public void resetPSDEFormName(){
        this.reset(FIELD_PSDEFORMNAME);
    }

    /**
     * 设置 实体表单，详细说明：{@link #FIELD_PSDEFORMNAME}
     * <P>
     * 等同 {@link #setPSDEFormName}
     * @param pSDEFormName
     */
    @JsonIgnore
    public PSDEFDLogic psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
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
    public PSDEFDLogic updatedate(String updateDate){
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
    public PSDEFDLogic updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFDLogicId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFDLogicId(strValue);
    }

    @JsonIgnore
    public PSDEFDLogic id(String strValue){
        this.setPSDEFDLogicId(strValue);
        return this;
    }


    /**
     *  表单成员逻辑 成员集合
     */
    public final static String FIELD_PSDEFDLOGICS = "psdefdlogics";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> psdefdlogics;

    /**
     * 获取 表单成员逻辑 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEFDLOGICS)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> getPSDEFDLogics(){
        return this.psdefdlogics;
    }

    /**
     * 设置 表单成员逻辑 成员集合  
     * @param psdefdlogics
     */
    @JsonProperty(FIELD_PSDEFDLOGICS)
    public void setPSDEFDLogics(java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> psdefdlogics){
        this.psdefdlogics = psdefdlogics;
    }

    /**
     * 获取 表单成员逻辑 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEFDLogic> getPSDEFDLogicsIf(){
        if(this.psdefdlogics == null){
            this.psdefdlogics = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEFDLogic>();          
        }
        return this.psdefdlogics;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFDLogic){
            PSDEFDLogic model = (PSDEFDLogic)iPSModel;
            model.setPSDEFDLogics(this.getPSDEFDLogics());
        }
        super.copyTo(iPSModel);
    }
}
