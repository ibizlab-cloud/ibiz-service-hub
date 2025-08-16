package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEGEIVR</B>表格编辑项值规则 模型传输对象
 * <P>
 * 实体数据表格编辑项的值规则模型，定义编辑项的值校验配置，包括了校验方式，校验规则等
 */
public class PSDEGEIVRDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEGEIVRDTO(){
    }      

    /**
     * <B>CHECKMODE</B>&nbsp;检查方式，指定表格编辑项值规则校验方式，未定义时为【前后台】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.EditItemVRCheckMode} 
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
    public PSDEGEIVRDTO checkmode(Integer checkMode){
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
    public PSDEGEIVRDTO checkmode(net.ibizsys.model.PSModelEnums.EditItemVRCheckMode checkMode){
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
    public PSDEGEIVRDTO createdate(Timestamp createDate){
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
    public PSDEGEIVRDTO createman(String createMan){
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
    public PSDEGEIVRDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDEGEIVRDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFVRID</B>&nbsp;实体值规则，值规则类型为【实体值规则】指定实体值规则对象，注意一般不指定默认检查的值规则对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFValueRuleDTO} 
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
    public PSDEGEIVRDTO psdefvrid(String pSDEFVRId){
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
    public PSDEGEIVRDTO psdefvrid(PSDEFValueRuleDTO pSDEFValueRule){
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
    public PSDEGEIVRDTO psdefvrname(String pSDEFVRName){
        this.setPSDEFVRName(pSDEFVRName);
        return this;
    }

    /**
     * <B>PSDEGEIVRID</B>&nbsp;表格编辑项值规则标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEGEIVRID = "psdegeivrid";

    /**
     * 设置 表格编辑项值规则标识
     * 
     * @param pSDEGEIVRId
     * 
     */
    @JsonProperty(FIELD_PSDEGEIVRID)
    public void setPSDEGEIVRId(String pSDEGEIVRId){
        this.set(FIELD_PSDEGEIVRID, pSDEGEIVRId);
    }
    
    /**
     * 获取 表格编辑项值规则标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIVRId(){
        Object objValue = this.get(FIELD_PSDEGEIVRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编辑项值规则标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIVRIdDirty(){
        if(this.contains(FIELD_PSDEGEIVRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编辑项值规则标识
     */
    @JsonIgnore
    public void resetPSDEGEIVRId(){
        this.reset(FIELD_PSDEGEIVRID);
    }

    /**
     * 设置 表格编辑项值规则标识
     * <P>
     * 等同 {@link #setPSDEGEIVRId}
     * @param pSDEGEIVRId
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegeivrid(String pSDEGEIVRId){
        this.setPSDEGEIVRId(pSDEGEIVRId);
        return this;
    }

    /**
     * <B>PSDEGEIVRNAME</B>&nbsp;值规则名称，指定数据表格编辑项的值规则名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEGEIVRNAME = "psdegeivrname";

    /**
     * 设置 值规则名称，详细说明：{@link #FIELD_PSDEGEIVRNAME}
     * 
     * @param pSDEGEIVRName
     * 
     */
    @JsonProperty(FIELD_PSDEGEIVRNAME)
    public void setPSDEGEIVRName(String pSDEGEIVRName){
        this.set(FIELD_PSDEGEIVRNAME, pSDEGEIVRName);
    }
    
    /**
     * 获取 值规则名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIVRName(){
        Object objValue = this.get(FIELD_PSDEGEIVRNAME);
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
    public boolean isPSDEGEIVRNameDirty(){
        if(this.contains(FIELD_PSDEGEIVRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 值规则名称
     */
    @JsonIgnore
    public void resetPSDEGEIVRName(){
        this.reset(FIELD_PSDEGEIVRNAME);
    }

    /**
     * 设置 值规则名称，详细说明：{@link #FIELD_PSDEGEIVRNAME}
     * <P>
     * 等同 {@link #setPSDEGEIVRName}
     * @param pSDEGEIVRName
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegeivrname(String pSDEGEIVRName){
        this.setPSDEGEIVRName(pSDEGEIVRName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEGEIVRName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEGEIVRName(strName);
    }

    @JsonIgnore
    public PSDEGEIVRDTO name(String strName){
        this.setPSDEGEIVRName(strName);
        return this;
    }

    /**
     * <B>PSDEGRIDCOLID</B>&nbsp;实体表格列，指定校验的数据表格编辑项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO} 
     */
    public final static String FIELD_PSDEGRIDCOLID = "psdegridcolid";

    /**
     * 设置 实体表格列，详细说明：{@link #FIELD_PSDEGRIDCOLID}
     * 
     * @param pSDEGridColId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDCOLID)
    public void setPSDEGridColId(String pSDEGridColId){
        this.set(FIELD_PSDEGRIDCOLID, pSDEGridColId);
    }
    
    /**
     * 获取 实体表格列  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridColId(){
        Object objValue = this.get(FIELD_PSDEGRIDCOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridColIdDirty(){
        if(this.contains(FIELD_PSDEGRIDCOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格列
     */
    @JsonIgnore
    public void resetPSDEGridColId(){
        this.reset(FIELD_PSDEGRIDCOLID);
    }

    /**
     * 设置 实体表格列，详细说明：{@link #FIELD_PSDEGRIDCOLID}
     * <P>
     * 等同 {@link #setPSDEGridColId}
     * @param pSDEGridColId
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegridcolid(String pSDEGridColId){
        this.setPSDEGridColId(pSDEGridColId);
        return this;
    }

    /**
     * 设置 实体表格列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridColId}
     * @param pSDEGridCol 引用对象
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegridcolid(PSDEGridColDTO pSDEGridCol){
        if(pSDEGridCol == null){
            this.setPSDEGridColId(null);
            this.setPSDEGridColName(null);
        }
        else{
            this.setPSDEGridColId(pSDEGridCol.getPSDEGridColId());
            this.setPSDEGridColName(pSDEGridCol.getPSDEGridColName());
        }
        return this;
    }

    /**
     * <B>PSDEGRIDCOLNAME</B>&nbsp;实体表格列，指定校验的数据表格编辑项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDCOLID}
     */
    public final static String FIELD_PSDEGRIDCOLNAME = "psdegridcolname";

    /**
     * 设置 实体表格列，详细说明：{@link #FIELD_PSDEGRIDCOLNAME}
     * 
     * @param pSDEGridColName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDCOLNAME)
    public void setPSDEGridColName(String pSDEGridColName){
        this.set(FIELD_PSDEGRIDCOLNAME, pSDEGridColName);
    }
    
    /**
     * 获取 实体表格列  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridColName(){
        Object objValue = this.get(FIELD_PSDEGRIDCOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridColNameDirty(){
        if(this.contains(FIELD_PSDEGRIDCOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格列
     */
    @JsonIgnore
    public void resetPSDEGridColName(){
        this.reset(FIELD_PSDEGRIDCOLNAME);
    }

    /**
     * 设置 实体表格列，详细说明：{@link #FIELD_PSDEGRIDCOLNAME}
     * <P>
     * 等同 {@link #setPSDEGridColName}
     * @param pSDEGridColName
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegridcolname(String pSDEGridColName){
        this.setPSDEGridColName(pSDEGridColName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体表格，指定表格编辑项值规则所在的数据表格对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEGridDTO} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * 
     * @param pSDEGridId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDID)
    public void setPSDEGridId(String pSDEGridId){
        this.set(FIELD_PSDEGRIDID, pSDEGridId);
    }
    
    /**
     * 获取 实体表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridId(){
        Object objValue = this.get(FIELD_PSDEGRIDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridIdDirty(){
        if(this.contains(FIELD_PSDEGRIDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格
     */
    @JsonIgnore
    public void resetPSDEGridId(){
        this.reset(FIELD_PSDEGRIDID);
    }

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDID}
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegridid(String pSDEGridId){
        this.setPSDEGridId(pSDEGridId);
        return this;
    }

    /**
     * 设置 实体表格，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGrid 引用对象
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegridid(PSDEGridDTO pSDEGrid){
        if(pSDEGrid == null){
            this.setPSDEGridId(null);
            this.setPSDEGridName(null);
        }
        else{
            this.setPSDEGridId(pSDEGrid.getPSDEGridId());
            this.setPSDEGridName(pSDEGrid.getPSDEGridName());
        }
        return this;
    }

    /**
     * <B>PSDEGRIDNAME</B>&nbsp;实体表格，指定表格编辑项值规则所在的数据表格对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDID}
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * 
     * @param pSDEGridName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDNAME)
    public void setPSDEGridName(String pSDEGridName){
        this.set(FIELD_PSDEGRIDNAME, pSDEGridName);
    }
    
    /**
     * 获取 实体表格  
     * @return
     */
    @JsonIgnore
    public String getPSDEGridName(){
        Object objValue = this.get(FIELD_PSDEGRIDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表格 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGridNameDirty(){
        if(this.contains(FIELD_PSDEGRIDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表格
     */
    @JsonIgnore
    public void resetPSDEGridName(){
        this.reset(FIELD_PSDEGRIDNAME);
    }

    /**
     * 设置 实体表格，详细说明：{@link #FIELD_PSDEGRIDNAME}
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDEGEIVRDTO psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
        return this;
    }

    /**
     * <B>PSSYSVALUERULEID</B>&nbsp;系统值规则，值规则类型为【系统值规则】指定系统值规则对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysValueRuleDTO} 
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
    public PSDEGEIVRDTO pssysvalueruleid(String pSSysValueRuleId){
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
    public PSDEGEIVRDTO pssysvalueruleid(PSSysValueRuleDTO pSSysValueRule){
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
    public PSDEGEIVRDTO pssysvaluerulename(String pSSysValueRuleName){
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
    public PSDEGEIVRDTO updatedate(Timestamp updateDate){
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
    public PSDEGEIVRDTO updateman(String updateMan){
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
    public PSDEGEIVRDTO usercat(String userCat){
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
    public PSDEGEIVRDTO usercat(net.ibizsys.model.PSModelEnums.ModelUserCat userCat){
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
    public PSDEGEIVRDTO usertag(String userTag){
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
    public PSDEGEIVRDTO usertag2(String userTag2){
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
    public PSDEGEIVRDTO usertag3(String userTag3){
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
    public PSDEGEIVRDTO usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VRTYPE</B>&nbsp;值规则类型，指定检查值规则的类型，未定义时为【实体值规则】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.TargetVRType} 
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
    public PSDEGEIVRDTO vrtype(String vRType){
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
    public PSDEGEIVRDTO vrtype(net.ibizsys.model.PSModelEnums.TargetVRType vRType){
        if(vRType == null){
            this.setVRType(null);
        }
        else{
            this.setVRType(vRType.value);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEGEIVRId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEGEIVRId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEGEIVRId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEGEIVRId(strValue);
    }

    @JsonIgnore
    public PSDEGEIVRDTO id(String strValue){
        this.setPSDEGEIVRId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEGEIVRDTO){
            PSDEGEIVRDTO dto = (PSDEGEIVRDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
