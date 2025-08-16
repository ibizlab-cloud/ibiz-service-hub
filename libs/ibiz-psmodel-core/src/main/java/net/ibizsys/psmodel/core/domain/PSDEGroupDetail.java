package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEGROUPDETAIL</B>实体组成员 模型传输对象
 * <P>
 * 实体组成员模型，定义实体组包含的实体对象
 */
public class PSDEGroupDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEGroupDetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体组成员的代码标识，需在所在实体组具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
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
    public PSDEGroupDetail codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定实体组成员的代码标识2，需在所在实体组具备唯一性
     * <P>
     * 字符串：最大长度 50，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSDEGroupDetail codename2(String codeName2){
        this.setCodeName2(codeName2);
        return this;
    }

    /**
     * <B>COLOR</B>&nbsp;实体颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 实体颜色
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 实体颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 实体颜色
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSDEGroupDetail color(String color){
        this.setColor(color);
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
    public PSDEGroupDetail createdate(String createDate){
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
    public PSDEGroupDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DATA</B>&nbsp;项数据
     */
    public final static String FIELD_DATA = "data";

    /**
     * 设置 项数据
     * 
     * @param data
     * 
     */
    @JsonProperty(FIELD_DATA)
    public void setData(String data){
        this.set(FIELD_DATA, data);
    }
    
    /**
     * 获取 项数据  
     * @return
     */
    @JsonIgnore
    public String getData(){
        Object objValue = this.get(FIELD_DATA);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 项数据 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDataDirty(){
        if(this.contains(FIELD_DATA)){
            return true;
        }
        return false;
    }

    /**
     * 重置 项数据
     */
    @JsonIgnore
    public void resetData(){
        this.reset(FIELD_DATA);
    }

    /**
     * 设置 项数据
     * <P>
     * 等同 {@link #setData}
     * @param data
     */
    @JsonIgnore
    public PSDEGroupDetail data(String data){
        this.setData(data);
        return this;
    }

    /**
     * <B>DETAG</B>&nbsp;实体标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAG = "detag";

    /**
     * 设置 实体标记
     * 
     * @param dETag
     * 
     */
    @JsonProperty(FIELD_DETAG)
    public void setDETag(String dETag){
        this.set(FIELD_DETAG, dETag);
    }
    
    /**
     * 获取 实体标记  
     * @return
     */
    @JsonIgnore
    public String getDETag(){
        Object objValue = this.get(FIELD_DETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETagDirty(){
        if(this.contains(FIELD_DETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记
     */
    @JsonIgnore
    public void resetDETag(){
        this.reset(FIELD_DETAG);
    }

    /**
     * 设置 实体标记
     * <P>
     * 等同 {@link #setDETag}
     * @param dETag
     */
    @JsonIgnore
    public PSDEGroupDetail detag(String dETag){
        this.setDETag(dETag);
        return this;
    }

    /**
     * <B>DETAG2</B>&nbsp;实体标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_DETAG2 = "detag2";

    /**
     * 设置 实体标记2
     * 
     * @param dETag2
     * 
     */
    @JsonProperty(FIELD_DETAG2)
    public void setDETag2(String dETag2){
        this.set(FIELD_DETAG2, dETag2);
    }
    
    /**
     * 获取 实体标记2  
     * @return
     */
    @JsonIgnore
    public String getDETag2(){
        Object objValue = this.get(FIELD_DETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDETag2Dirty(){
        if(this.contains(FIELD_DETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体标记2
     */
    @JsonIgnore
    public void resetDETag2(){
        this.reset(FIELD_DETAG2);
    }

    /**
     * 设置 实体标记2
     * <P>
     * 等同 {@link #setDETag2}
     * @param dETag2
     */
    @JsonIgnore
    public PSDEGroupDetail detag2(String dETag2){
        this.setDETag2(dETag2);
        return this;
    }

    /**
     * <B>DETAILPARAM</B>&nbsp;成员参数
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILPARAM = "detailparam";

    /**
     * 设置 成员参数
     * 
     * @param detailParam
     * 
     */
    @JsonProperty(FIELD_DETAILPARAM)
    public void setDetailParam(String detailParam){
        this.set(FIELD_DETAILPARAM, detailParam);
    }
    
    /**
     * 获取 成员参数  
     * @return
     */
    @JsonIgnore
    public String getDetailParam(){
        Object objValue = this.get(FIELD_DETAILPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailParamDirty(){
        if(this.contains(FIELD_DETAILPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数
     */
    @JsonIgnore
    public void resetDetailParam(){
        this.reset(FIELD_DETAILPARAM);
    }

    /**
     * 设置 成员参数
     * <P>
     * 等同 {@link #setDetailParam}
     * @param detailParam
     */
    @JsonIgnore
    public PSDEGroupDetail detailparam(String detailParam){
        this.setDetailParam(detailParam);
        return this;
    }

    /**
     * <B>DETAILPARAM2</B>&nbsp;成员参数2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILPARAM2 = "detailparam2";

    /**
     * 设置 成员参数2
     * 
     * @param detailParam2
     * 
     */
    @JsonProperty(FIELD_DETAILPARAM2)
    public void setDetailParam2(String detailParam2){
        this.set(FIELD_DETAILPARAM2, detailParam2);
    }
    
    /**
     * 获取 成员参数2  
     * @return
     */
    @JsonIgnore
    public String getDetailParam2(){
        Object objValue = this.get(FIELD_DETAILPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailParam2Dirty(){
        if(this.contains(FIELD_DETAILPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员参数2
     */
    @JsonIgnore
    public void resetDetailParam2(){
        this.reset(FIELD_DETAILPARAM2);
    }

    /**
     * 设置 成员参数2
     * <P>
     * 等同 {@link #setDetailParam2}
     * @param detailParam2
     */
    @JsonIgnore
    public PSDEGroupDetail detailparam2(String detailParam2){
        this.setDetailParam2(detailParam2);
        return this;
    }

    /**
     * <B>DETAILTAG</B>&nbsp;成员标记
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILTAG = "detailtag";

    /**
     * 设置 成员标记
     * 
     * @param detailTag
     * 
     */
    @JsonProperty(FIELD_DETAILTAG)
    public void setDetailTag(String detailTag){
        this.set(FIELD_DETAILTAG, detailTag);
    }
    
    /**
     * 获取 成员标记  
     * @return
     */
    @JsonIgnore
    public String getDetailTag(){
        Object objValue = this.get(FIELD_DETAILTAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTagDirty(){
        if(this.contains(FIELD_DETAILTAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标记
     */
    @JsonIgnore
    public void resetDetailTag(){
        this.reset(FIELD_DETAILTAG);
    }

    /**
     * 设置 成员标记
     * <P>
     * 等同 {@link #setDetailTag}
     * @param detailTag
     */
    @JsonIgnore
    public PSDEGroupDetail detailtag(String detailTag){
        this.setDetailTag(detailTag);
        return this;
    }

    /**
     * <B>DETAILTAG2</B>&nbsp;成员标记2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DETAILTAG2 = "detailtag2";

    /**
     * 设置 成员标记2
     * 
     * @param detailTag2
     * 
     */
    @JsonProperty(FIELD_DETAILTAG2)
    public void setDetailTag2(String detailTag2){
        this.set(FIELD_DETAILTAG2, detailTag2);
    }
    
    /**
     * 获取 成员标记2  
     * @return
     */
    @JsonIgnore
    public String getDetailTag2(){
        Object objValue = this.get(FIELD_DETAILTAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTag2Dirty(){
        if(this.contains(FIELD_DETAILTAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员标记2
     */
    @JsonIgnore
    public void resetDetailTag2(){
        this.reset(FIELD_DETAILTAG2);
    }

    /**
     * 设置 成员标记2
     * <P>
     * 等同 {@link #setDetailTag2}
     * @param detailTag2
     */
    @JsonIgnore
    public PSDEGroupDetail detailtag2(String detailTag2){
        this.setDetailTag2(detailTag2);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSDEGroupDetail logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSDEGroupDetail memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODCOLOR</B>&nbsp;模块颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_MODCOLOR = "modcolor";

    /**
     * 设置 模块颜色
     * 
     * @param modColor
     * 
     */
    @JsonProperty(FIELD_MODCOLOR)
    public void setModColor(String modColor){
        this.set(FIELD_MODCOLOR, modColor);
    }
    
    /**
     * 获取 模块颜色  
     * @return
     */
    @JsonIgnore
    public String getModColor(){
        Object objValue = this.get(FIELD_MODCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModColorDirty(){
        if(this.contains(FIELD_MODCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块颜色
     */
    @JsonIgnore
    public void resetModColor(){
        this.reset(FIELD_MODCOLOR);
    }

    /**
     * 设置 模块颜色
     * <P>
     * 等同 {@link #setModColor}
     * @param modColor
     */
    @JsonIgnore
    public PSDEGroupDetail modcolor(String modColor){
        this.setModColor(modColor);
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
    public PSDEGroupDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEGROUPDETAILID</B>&nbsp;实体组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEGROUPDETAILID = "psdegroupdetailid";

    /**
     * 设置 实体组成员标识
     * 
     * @param pSDEGroupDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEGROUPDETAILID)
    public void setPSDEGroupDetailId(String pSDEGroupDetailId){
        this.set(FIELD_PSDEGROUPDETAILID, pSDEGroupDetailId);
    }
    
    /**
     * 获取 实体组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEGroupDetailId(){
        Object objValue = this.get(FIELD_PSDEGROUPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGroupDetailIdDirty(){
        if(this.contains(FIELD_PSDEGROUPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体组成员标识
     */
    @JsonIgnore
    public void resetPSDEGroupDetailId(){
        this.reset(FIELD_PSDEGROUPDETAILID);
    }

    /**
     * 设置 实体组成员标识
     * <P>
     * 等同 {@link #setPSDEGroupDetailId}
     * @param pSDEGroupDetailId
     */
    @JsonIgnore
    public PSDEGroupDetail psdegroupdetailid(String pSDEGroupDetailId){
        this.setPSDEGroupDetailId(pSDEGroupDetailId);
        return this;
    }

    /**
     * <B>PSDEGROUPDETAILNAME</B>&nbsp;组成员名称，指定实体组成员的名称，需在所在实体组中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEGROUPDETAILNAME = "psdegroupdetailname";

    /**
     * 设置 组成员名称，详细说明：{@link #FIELD_PSDEGROUPDETAILNAME}
     * 
     * @param pSDEGroupDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEGROUPDETAILNAME)
    public void setPSDEGroupDetailName(String pSDEGroupDetailName){
        this.set(FIELD_PSDEGROUPDETAILNAME, pSDEGroupDetailName);
    }
    
    /**
     * 获取 组成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEGroupDetailName(){
        Object objValue = this.get(FIELD_PSDEGROUPDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组成员名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGroupDetailNameDirty(){
        if(this.contains(FIELD_PSDEGROUPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组成员名称
     */
    @JsonIgnore
    public void resetPSDEGroupDetailName(){
        this.reset(FIELD_PSDEGROUPDETAILNAME);
    }

    /**
     * 设置 组成员名称，详细说明：{@link #FIELD_PSDEGROUPDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEGroupDetailName}
     * @param pSDEGroupDetailName
     */
    @JsonIgnore
    public PSDEGroupDetail psdegroupdetailname(String pSDEGroupDetailName){
        this.setPSDEGroupDetailName(pSDEGroupDetailName);
        return this;
    }

    /**
     * <B>PSDEGROUPID</B>&nbsp;实体组，指定实体组成员所在的实体组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGroup} 
     */
    public final static String FIELD_PSDEGROUPID = "psdegroupid";

    /**
     * 设置 实体组，详细说明：{@link #FIELD_PSDEGROUPID}
     * 
     * @param pSDEGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEGROUPID)
    public void setPSDEGroupId(String pSDEGroupId){
        this.set(FIELD_PSDEGROUPID, pSDEGroupId);
    }
    
    /**
     * 获取 实体组  
     * @return
     */
    @JsonIgnore
    public String getPSDEGroupId(){
        Object objValue = this.get(FIELD_PSDEGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGroupIdDirty(){
        if(this.contains(FIELD_PSDEGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体组
     */
    @JsonIgnore
    public void resetPSDEGroupId(){
        this.reset(FIELD_PSDEGROUPID);
    }

    /**
     * 设置 实体组，详细说明：{@link #FIELD_PSDEGROUPID}
     * <P>
     * 等同 {@link #setPSDEGroupId}
     * @param pSDEGroupId
     */
    @JsonIgnore
    public PSDEGroupDetail psdegroupid(String pSDEGroupId){
        this.setPSDEGroupId(pSDEGroupId);
        return this;
    }

    /**
     * 设置 实体组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGroupId}
     * @param pSDEGroup 引用对象
     */
    @JsonIgnore
    public PSDEGroupDetail psdegroupid(PSDEGroup pSDEGroup){
        if(pSDEGroup == null){
            this.setPSDEGroupId(null);
            this.setPSDEGroupName(null);
        }
        else{
            this.setPSDEGroupId(pSDEGroup.getPSDEGroupId());
            this.setPSDEGroupName(pSDEGroup.getPSDEGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEGROUPNAME</B>&nbsp;实体组，指定实体组成员所在的实体组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGROUPID}
     */
    public final static String FIELD_PSDEGROUPNAME = "psdegroupname";

    /**
     * 设置 实体组，详细说明：{@link #FIELD_PSDEGROUPNAME}
     * 
     * @param pSDEGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEGROUPNAME)
    public void setPSDEGroupName(String pSDEGroupName){
        this.set(FIELD_PSDEGROUPNAME, pSDEGroupName);
    }
    
    /**
     * 获取 实体组  
     * @return
     */
    @JsonIgnore
    public String getPSDEGroupName(){
        Object objValue = this.get(FIELD_PSDEGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGroupNameDirty(){
        if(this.contains(FIELD_PSDEGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体组
     */
    @JsonIgnore
    public void resetPSDEGroupName(){
        this.reset(FIELD_PSDEGROUPNAME);
    }

    /**
     * 设置 实体组，详细说明：{@link #FIELD_PSDEGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEGroupName}
     * @param pSDEGroupName
     */
    @JsonIgnore
    public PSDEGroupDetail psdegroupname(String pSDEGroupName){
        this.setPSDEGroupName(pSDEGroupName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定实体组成员引用的实体对象
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
    public PSDEGroupDetail psdeid(String pSDEId){
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
    public PSDEGroupDetail psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setColor(null);
            this.setLogicName(null);
            this.setModColor(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSModuleName(null);
        }
        else{
            this.setColor(pSDataEntity.getColor());
            this.setLogicName(pSDataEntity.getLogicName());
            this.setModColor(pSDataEntity.getModColor());
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSModuleName(pSDataEntity.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定实体组成员引用的实体对象
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
    public PSDEGroupDetail psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEName(strName);
    }

    @JsonIgnore
    public PSDEGroupDetail name(String strName){
        this.setPSDEName(strName);
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;模块名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 模块名称
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 模块名称  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块名称
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 模块名称
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSDEGroupDetail psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
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
    public PSDEGroupDetail updatedate(String updateDate){
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
    public PSDEGroupDetail updateman(String updateMan){
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
    public PSDEGroupDetail usercat(String userCat){
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
    public PSDEGroupDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERTAG</B>&nbsp;用户标识
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG = "usertag";

    /**
     * 设置 用户标识
     * 
     * @param userTag
     * 
     */
    @JsonProperty(FIELD_USERTAG)
    public void setUserTag(String userTag){
        this.set(FIELD_USERTAG, userTag);
    }
    
    /**
     * 获取 用户标识  
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
     * 判断 用户标识 是否指定值，包括空值
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
     * 重置 用户标识
     */
    @JsonIgnore
    public void resetUserTag(){
        this.reset(FIELD_USERTAG);
    }

    /**
     * 设置 用户标识
     * <P>
     * 等同 {@link #setUserTag}
     * @param userTag
     */
    @JsonIgnore
    public PSDEGroupDetail usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标识2
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_USERTAG2 = "usertag2";

    /**
     * 设置 用户标识2
     * 
     * @param userTag2
     * 
     */
    @JsonProperty(FIELD_USERTAG2)
    public void setUserTag2(String userTag2){
        this.set(FIELD_USERTAG2, userTag2);
    }
    
    /**
     * 获取 用户标识2  
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
     * 判断 用户标识2 是否指定值，包括空值
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
     * 重置 用户标识2
     */
    @JsonIgnore
    public void resetUserTag2(){
        this.reset(FIELD_USERTAG2);
    }

    /**
     * 设置 用户标识2
     * <P>
     * 等同 {@link #setUserTag2}
     * @param userTag2
     */
    @JsonIgnore
    public PSDEGroupDetail usertag2(String userTag2){
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
    public PSDEGroupDetail usertag3(String userTag3){
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
    public PSDEGroupDetail usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEGroupDetail validflag(Integer validFlag){
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
    public PSDEGroupDetail validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEGroupDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEGroupDetailId(strValue);
    }

    @JsonIgnore
    public PSDEGroupDetail id(String strValue){
        this.setPSDEGroupDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEGroupDetail){
            PSDEGroupDetail model = (PSDEGroupDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
