package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFIVR</B>实体表单项值规则 模型传输对象
 * <P>
 * 实体表单项的值规则模型，定义表单项的值校验配置，包括了校验方式，校验规则等
 */
public class PSDEFIVR extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFIVR(){
    }      

    /**
     * <B>CHECKMODE</B>&nbsp;检查方式，指定表单项值规则校验方式，未定义时为【前后台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.EditItemVRCheckMode} 
     */
    public final static String FIELD_CHECKMODE = "checkmode";

    /**
     * 设置 检查方式，详细说明：{@link #FIELD_CHECKMODE}
     * 
     * @param checkMode
     * 
     */
    @JsonProperty(FIELD_CHECKMODE)
    public void setCheckMode(Integer checkMode){
        this.set(FIELD_CHECKMODE, checkMode);
    }
    
    /**
     * 获取 检查方式  
     * @return
     */
    @JsonIgnore
    public Integer getCheckMode(){
        Object objValue = this.get(FIELD_CHECKMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 检查方式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCheckModeDirty(){
        if(this.contains(FIELD_CHECKMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 检查方式
     */
    @JsonIgnore
    public void resetCheckMode(){
        this.reset(FIELD_CHECKMODE);
    }

    /**
     * 设置 检查方式，详细说明：{@link #FIELD_CHECKMODE}
     * <P>
     * 等同 {@link #setCheckMode}
     * @param checkMode
     */
    @JsonIgnore
    public PSDEFIVR checkmode(Integer checkMode){
        this.setCheckMode(checkMode);
        return this;
    }

     /**
     * 设置 检查方式，详细说明：{@link #FIELD_CHECKMODE}
     * <P>
     * 等同 {@link #setCheckMode}
     * @param checkMode
     */
    @JsonIgnore
    public PSDEFIVR checkmode(net.ibizsys.psmodel.core.util.PSModelEnums.EditItemVRCheckMode checkMode){
        if(checkMode == null){
            this.setCheckMode(null);
        }
        else{
            this.setCheckMode(checkMode.value);
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
    public PSDEFIVR createdate(String createDate){
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
    public PSDEFIVR createman(String createMan){
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
    public PSDEFIVR memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELSTATE</B>&nbsp;模型状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEFormDetailState} 
     */
    public final static String FIELD_MODELSTATE = "modelstate";

    /**
     * 设置 模型状态
     * 
     * @param modelState
     * 
     */
    @JsonProperty(FIELD_MODELSTATE)
    public void setModelState(Integer modelState){
        this.set(FIELD_MODELSTATE, modelState);
    }
    
    /**
     * 获取 模型状态  
     * @return
     */
    @JsonIgnore
    public Integer getModelState(){
        Object objValue = this.get(FIELD_MODELSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelStateDirty(){
        if(this.contains(FIELD_MODELSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型状态
     */
    @JsonIgnore
    public void resetModelState(){
        this.reset(FIELD_MODELSTATE);
    }

    /**
     * 设置 模型状态
     * <P>
     * 等同 {@link #setModelState}
     * @param modelState
     */
    @JsonIgnore
    public PSDEFIVR modelstate(Integer modelState){
        this.setModelState(modelState);
        return this;
    }

     /**
     * 设置 模型状态
     * <P>
     * 等同 {@link #setModelState}
     * @param modelState
     */
    @JsonIgnore
    public PSDEFIVR modelstate(net.ibizsys.psmodel.core.util.PSModelEnums.DEFormDetailState[] modelState){
        if(modelState == null || modelState.length == 0){
            this.setModelState(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.DEFormDetailState _item : modelState){
                _value |= _item.value;
            }
            this.setModelState(_value);
        }
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定检查的次序，按升序处理
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSDEFIVR ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFIID</B>&nbsp;实体表单项，指定校验的表单项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFormDetail} 
     */
    public final static String FIELD_PSDEFIID = "psdefiid";

    /**
     * 设置 实体表单项，详细说明：{@link #FIELD_PSDEFIID}
     * 
     * @param pSDEFIId
     * 
     */
    @JsonProperty(FIELD_PSDEFIID)
    public void setPSDEFIId(String pSDEFIId){
        this.set(FIELD_PSDEFIID, pSDEFIId);
    }
    
    /**
     * 获取 实体表单项  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIId(){
        Object objValue = this.get(FIELD_PSDEFIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIIdDirty(){
        if(this.contains(FIELD_PSDEFIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单项
     */
    @JsonIgnore
    public void resetPSDEFIId(){
        this.reset(FIELD_PSDEFIID);
    }

    /**
     * 设置 实体表单项，详细说明：{@link #FIELD_PSDEFIID}
     * <P>
     * 等同 {@link #setPSDEFIId}
     * @param pSDEFIId
     */
    @JsonIgnore
    public PSDEFIVR psdefiid(String pSDEFIId){
        this.setPSDEFIId(pSDEFIId);
        return this;
    }

    /**
     * 设置 实体表单项，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFIId}
     * @param pSDEFormDetail 引用对象
     */
    @JsonIgnore
    public PSDEFIVR psdefiid(PSDEFormDetail pSDEFormDetail){
        if(pSDEFormDetail == null){
            this.setPSDEFIId(null);
            this.setPSDEFIName(null);
        }
        else{
            this.setPSDEFIId(pSDEFormDetail.getPSDEFormDetailId());
            this.setPSDEFIName(pSDEFormDetail.getPSDEFormDetailName());
        }
        return this;
    }

    /**
     * <B>PSDEFINAME</B>&nbsp;实体表单项，指定校验的表单项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFIID}
     */
    public final static String FIELD_PSDEFINAME = "psdefiname";

    /**
     * 设置 实体表单项，详细说明：{@link #FIELD_PSDEFINAME}
     * 
     * @param pSDEFIName
     * 
     */
    @JsonProperty(FIELD_PSDEFINAME)
    public void setPSDEFIName(String pSDEFIName){
        this.set(FIELD_PSDEFINAME, pSDEFIName);
    }
    
    /**
     * 获取 实体表单项  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIName(){
        Object objValue = this.get(FIELD_PSDEFINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFINameDirty(){
        if(this.contains(FIELD_PSDEFINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单项
     */
    @JsonIgnore
    public void resetPSDEFIName(){
        this.reset(FIELD_PSDEFINAME);
    }

    /**
     * 设置 实体表单项，详细说明：{@link #FIELD_PSDEFINAME}
     * <P>
     * 等同 {@link #setPSDEFIName}
     * @param pSDEFIName
     */
    @JsonIgnore
    public PSDEFIVR psdefiname(String pSDEFIName){
        this.setPSDEFIName(pSDEFIName);
        return this;
    }

    /**
     * <B>PSDEFIVRID</B>&nbsp;实体表单项值规则标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFIVRID = "psdefivrid";

    /**
     * 设置 实体表单项值规则标识
     * 
     * @param pSDEFIVRId
     * 
     */
    @JsonProperty(FIELD_PSDEFIVRID)
    public void setPSDEFIVRId(String pSDEFIVRId){
        this.set(FIELD_PSDEFIVRID, pSDEFIVRId);
    }
    
    /**
     * 获取 实体表单项值规则标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIVRId(){
        Object objValue = this.get(FIELD_PSDEFIVRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单项值规则标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIVRIdDirty(){
        if(this.contains(FIELD_PSDEFIVRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单项值规则标识
     */
    @JsonIgnore
    public void resetPSDEFIVRId(){
        this.reset(FIELD_PSDEFIVRID);
    }

    /**
     * 设置 实体表单项值规则标识
     * <P>
     * 等同 {@link #setPSDEFIVRId}
     * @param pSDEFIVRId
     */
    @JsonIgnore
    public PSDEFIVR psdefivrid(String pSDEFIVRId){
        this.setPSDEFIVRId(pSDEFIVRId);
        return this;
    }

    /**
     * <B>PSDEFIVRNAME</B>&nbsp;值规则名称，指定实体表单项的值规则名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFIVRNAME = "psdefivrname";

    /**
     * 设置 值规则名称，详细说明：{@link #FIELD_PSDEFIVRNAME}
     * 
     * @param pSDEFIVRName
     * 
     */
    @JsonProperty(FIELD_PSDEFIVRNAME)
    public void setPSDEFIVRName(String pSDEFIVRName){
        this.set(FIELD_PSDEFIVRNAME, pSDEFIVRName);
    }
    
    /**
     * 获取 值规则名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIVRName(){
        Object objValue = this.get(FIELD_PSDEFIVRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIVRNameDirty(){
        if(this.contains(FIELD_PSDEFIVRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则名称
     */
    @JsonIgnore
    public void resetPSDEFIVRName(){
        this.reset(FIELD_PSDEFIVRNAME);
    }

    /**
     * 设置 值规则名称，详细说明：{@link #FIELD_PSDEFIVRNAME}
     * <P>
     * 等同 {@link #setPSDEFIVRName}
     * @param pSDEFIVRName
     */
    @JsonIgnore
    public PSDEFIVR psdefivrname(String pSDEFIVRName){
        this.setPSDEFIVRName(pSDEFIVRName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFIVRName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFIVRName(strName);
    }

    @JsonIgnore
    public PSDEFIVR name(String strName){
        this.setPSDEFIVRName(strName);
        return this;
    }

    /**
     * <B>PSDEFORMID</B>&nbsp;实体表单，指定表单项值规则所在的表单对象
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
    public PSDEFIVR psdeformid(String pSDEFormId){
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
    public PSDEFIVR psdeformid(PSDEForm pSDEForm){
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
     * <B>PSDEFORMNAME</B>&nbsp;实体表单，指定表单项值规则所在的表单对象
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
    public PSDEFIVR psdeformname(String pSDEFormName){
        this.setPSDEFormName(pSDEFormName);
        return this;
    }

    /**
     * <B>PSDEFVRID</B>&nbsp;实体值规则，值规则类型为【实体值规则】指定实体值规则对象，注意一般不指定默认检查的值规则对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFValueRule} 
     */
    public final static String FIELD_PSDEFVRID = "psdefvrid";

    /**
     * 设置 实体值规则，详细说明：{@link #FIELD_PSDEFVRID}
     * 
     * @param pSDEFVRId
     * 
     */
    @JsonProperty(FIELD_PSDEFVRID)
    public void setPSDEFVRId(String pSDEFVRId){
        this.set(FIELD_PSDEFVRID, pSDEFVRId);
    }
    
    /**
     * 获取 实体值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFVRId(){
        Object objValue = this.get(FIELD_PSDEFVRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFVRIdDirty(){
        if(this.contains(FIELD_PSDEFVRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体值规则
     */
    @JsonIgnore
    public void resetPSDEFVRId(){
        this.reset(FIELD_PSDEFVRID);
    }

    /**
     * 设置 实体值规则，详细说明：{@link #FIELD_PSDEFVRID}
     * <P>
     * 等同 {@link #setPSDEFVRId}
     * @param pSDEFVRId
     */
    @JsonIgnore
    public PSDEFIVR psdefvrid(String pSDEFVRId){
        this.setPSDEFVRId(pSDEFVRId);
        return this;
    }

    /**
     * 设置 实体值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFVRId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEFIVR psdefvrid(PSDEFValueRule pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFVRId(null);
            this.setPSDEFVRName(null);
        }
        else{
            this.setPSDEFVRId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFVRName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVRNAME</B>&nbsp;实体值规则，值规则类型为【实体值规则】指定实体值规则对象，注意一般不指定默认检查的值规则对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVRID}
     */
    public final static String FIELD_PSDEFVRNAME = "psdefvrname";

    /**
     * 设置 实体值规则，详细说明：{@link #FIELD_PSDEFVRNAME}
     * 
     * @param pSDEFVRName
     * 
     */
    @JsonProperty(FIELD_PSDEFVRNAME)
    public void setPSDEFVRName(String pSDEFVRName){
        this.set(FIELD_PSDEFVRNAME, pSDEFVRName);
    }
    
    /**
     * 获取 实体值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFVRName(){
        Object objValue = this.get(FIELD_PSDEFVRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFVRNameDirty(){
        if(this.contains(FIELD_PSDEFVRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体值规则
     */
    @JsonIgnore
    public void resetPSDEFVRName(){
        this.reset(FIELD_PSDEFVRNAME);
    }

    /**
     * 设置 实体值规则，详细说明：{@link #FIELD_PSDEFVRNAME}
     * <P>
     * 等同 {@link #setPSDEFVRName}
     * @param pSDEFVRName
     */
    @JsonIgnore
    public PSDEFIVR psdefvrname(String pSDEFVRName){
        this.setPSDEFVRName(pSDEFVRName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;系统值规则，值规则类型为【系统值规则】指定系统值规则对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysValueRule} 
     */
    public final static String FIELD_PSSYSVALUERULEID = "pssysvalueruleid";

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * 
     * @param pSSysValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULEID)
    public void setPSSysValueRuleId(String pSSysValueRuleId){
        this.set(FIELD_PSSYSVALUERULEID, pSSysValueRuleId);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleId(){
        Object objValue = this.get(FIELD_PSSYSVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleIdDirty(){
        if(this.contains(FIELD_PSSYSVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleId(){
        this.reset(FIELD_PSSYSVALUERULEID);
    }

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULEID}
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRuleId
     */
    @JsonIgnore
    public PSDEFIVR pssysvalueruleid(String pSSysValueRuleId){
        this.setPSSysValueRuleId(pSSysValueRuleId);
        return this;
    }

    /**
     * 设置 系统值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysValueRuleId}
     * @param pSSysValueRule 引用对象
     */
    @JsonIgnore
    public PSDEFIVR pssysvalueruleid(PSSysValueRule pSSysValueRule){
        if(pSSysValueRule == null){
            this.setPSSysValueRuleId(null);
            this.setPSSysValueRuleName(null);
        }
        else{
            this.setPSSysValueRuleId(pSSysValueRule.getPSSysValueRuleId());
            this.setPSSysValueRuleName(pSSysValueRule.getPSSysValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSSYSVALUERULENAME</B>&nbsp;系统值规则，值规则类型为【系统值规则】指定系统值规则对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSVALUERULEID}
     */
    public final static String FIELD_PSSYSVALUERULENAME = "pssysvaluerulename";

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * 
     * @param pSSysValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSSYSVALUERULENAME)
    public void setPSSysValueRuleName(String pSSysValueRuleName){
        this.set(FIELD_PSSYSVALUERULENAME, pSSysValueRuleName);
    }
    
    /**
     * 获取 系统值规则  
     * @return
     */
    @JsonIgnore
    public String getPSSysValueRuleName(){
        Object objValue = this.get(FIELD_PSSYSVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysValueRuleNameDirty(){
        if(this.contains(FIELD_PSSYSVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统值规则
     */
    @JsonIgnore
    public void resetPSSysValueRuleName(){
        this.reset(FIELD_PSSYSVALUERULENAME);
    }

    /**
     * 设置 系统值规则，详细说明：{@link #FIELD_PSSYSVALUERULENAME}
     * <P>
     * 等同 {@link #setPSSysValueRuleName}
     * @param pSSysValueRuleName
     */
    @JsonIgnore
    public PSDEFIVR pssysvaluerulename(String pSSysValueRuleName){
        this.setPSSysValueRuleName(pSSysValueRuleName);
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
    public PSDEFIVR updatedate(String updateDate){
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
    public PSDEFIVR updateman(String updateMan){
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
    public PSDEFIVR usercat(String userCat){
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
    public PSDEFIVR usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEFIVR usertag(String userTag){
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
    public PSDEFIVR usertag2(String userTag2){
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
    public PSDEFIVR usertag3(String userTag3){
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
    public PSDEFIVR usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VRTYPE</B>&nbsp;值规则类型，指定检查值规则的类型，未定义时为【实体值规则】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.TargetVRType} 
     */
    public final static String FIELD_VRTYPE = "vrtype";

    /**
     * 设置 值规则类型，详细说明：{@link #FIELD_VRTYPE}
     * 
     * @param vRType
     * 
     */
    @JsonProperty(FIELD_VRTYPE)
    public void setVRType(String vRType){
        this.set(FIELD_VRTYPE, vRType);
    }
    
    /**
     * 获取 值规则类型  
     * @return
     */
    @JsonIgnore
    public String getVRType(){
        Object objValue = this.get(FIELD_VRTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 值规则类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isVRTypeDirty(){
        if(this.contains(FIELD_VRTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则类型
     */
    @JsonIgnore
    public void resetVRType(){
        this.reset(FIELD_VRTYPE);
    }

    /**
     * 设置 值规则类型，详细说明：{@link #FIELD_VRTYPE}
     * <P>
     * 等同 {@link #setVRType}
     * @param vRType
     */
    @JsonIgnore
    public PSDEFIVR vrtype(String vRType){
        this.setVRType(vRType);
        return this;
    }

     /**
     * 设置 值规则类型，详细说明：{@link #FIELD_VRTYPE}
     * <P>
     * 等同 {@link #setVRType}
     * @param vRType
     */
    @JsonIgnore
    public PSDEFIVR vrtype(net.ibizsys.psmodel.core.util.PSModelEnums.TargetVRType vRType){
        if(vRType == null){
            this.setVRType(null);
        }
        else{
            this.setVRType(vRType.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFIVRId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFIVRId(strValue);
    }

    @JsonIgnore
    public PSDEFIVR id(String strValue){
        this.setPSDEFIVRId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFIVR){
            PSDEFIVR model = (PSDEFIVR)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
