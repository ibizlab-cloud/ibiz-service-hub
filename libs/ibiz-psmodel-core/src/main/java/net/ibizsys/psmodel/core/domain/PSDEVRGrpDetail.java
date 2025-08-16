package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEVRGRPDETAIL</B>实体属性值规则组成员 模型传输对象
 * <P>
 * 
 */
public class PSDEVRGrpDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEVRGrpDetail(){
        this.setValidFlag(1);
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
    public PSDEVRGrpDetail createdate(String createDate){
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
    public PSDEVRGrpDetail createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDEVRGrpDetail detailparam(String detailParam){
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
    public PSDEVRGrpDetail detailparam2(String detailParam2){
        this.setDetailParam2(detailParam2);
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
    public PSDEVRGrpDetail memo(String memo){
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
    public PSDEVRGrpDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEFVALUERULEID</B>&nbsp;属性值规则
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEFValueRule} 
     */
    public final static String FIELD_PSDEFVALUERULEID = "psdefvalueruleid";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleId
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULEID)
    public void setPSDEFValueRuleId(String pSDEFValueRuleId){
        this.set(FIELD_PSDEFVALUERULEID, pSDEFValueRuleId);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleId(){
        Object objValue = this.get(FIELD_PSDEFVALUERULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleIdDirty(){
        if(this.contains(FIELD_PSDEFVALUERULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleId(){
        this.reset(FIELD_PSDEFVALUERULEID);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRuleId
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdefvalueruleid(String pSDEFValueRuleId){
        this.setPSDEFValueRuleId(pSDEFValueRuleId);
        return this;
    }

    /**
     * 设置 属性值规则，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFValueRuleId}
     * @param pSDEFValueRule 引用对象
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdefvalueruleid(PSDEFValueRule pSDEFValueRule){
        if(pSDEFValueRule == null){
            this.setPSDEFValueRuleId(null);
            this.setPSDEFValueRuleName(null);
        }
        else{
            this.setPSDEFValueRuleId(pSDEFValueRule.getPSDEFValueRuleId());
            this.setPSDEFValueRuleName(pSDEFValueRule.getPSDEFValueRuleName());
        }
        return this;
    }

    /**
     * <B>PSDEFVALUERULENAME</B>&nbsp;属性值规则
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFVALUERULEID}
     */
    public final static String FIELD_PSDEFVALUERULENAME = "psdefvaluerulename";

    /**
     * 设置 属性值规则
     * 
     * @param pSDEFValueRuleName
     * 
     */
    @JsonProperty(FIELD_PSDEFVALUERULENAME)
    public void setPSDEFValueRuleName(String pSDEFValueRuleName){
        this.set(FIELD_PSDEFVALUERULENAME, pSDEFValueRuleName);
    }
    
    /**
     * 获取 属性值规则  
     * @return
     */
    @JsonIgnore
    public String getPSDEFValueRuleName(){
        Object objValue = this.get(FIELD_PSDEFVALUERULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFValueRuleNameDirty(){
        if(this.contains(FIELD_PSDEFVALUERULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则
     */
    @JsonIgnore
    public void resetPSDEFValueRuleName(){
        this.reset(FIELD_PSDEFVALUERULENAME);
    }

    /**
     * 设置 属性值规则
     * <P>
     * 等同 {@link #setPSDEFValueRuleName}
     * @param pSDEFValueRuleName
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdefvaluerulename(String pSDEFValueRuleName){
        this.setPSDEFValueRuleName(pSDEFValueRuleName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVRGROUPID}
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 PSDEID
     * 
     * @param pSDEId
     * 
     */
    @JsonProperty(FIELD_PSDEID)
    public void setPSDEId(String pSDEId){
        this.set(FIELD_PSDEID, pSDEId);
    }
    
    /**
     * 获取 PSDEID  
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
     * 判断 PSDEID 是否指定值，包括空值
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
     * 重置 PSDEID
     */
    @JsonIgnore
    public void resetPSDEId(){
        this.reset(FIELD_PSDEID);
    }

    /**
     * 设置 PSDEID
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * <B>PSDEVRGROUPID</B>&nbsp;属性值规则组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEVRGroup} 
     */
    public final static String FIELD_PSDEVRGROUPID = "psdevrgroupid";

    /**
     * 设置 属性值规则组
     * 
     * @param pSDEVRGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEVRGROUPID)
    public void setPSDEVRGroupId(String pSDEVRGroupId){
        this.set(FIELD_PSDEVRGROUPID, pSDEVRGroupId);
    }
    
    /**
     * 获取 属性值规则组  
     * @return
     */
    @JsonIgnore
    public String getPSDEVRGroupId(){
        Object objValue = this.get(FIELD_PSDEVRGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEVRGroupIdDirty(){
        if(this.contains(FIELD_PSDEVRGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则组
     */
    @JsonIgnore
    public void resetPSDEVRGroupId(){
        this.reset(FIELD_PSDEVRGROUPID);
    }

    /**
     * 设置 属性值规则组
     * <P>
     * 等同 {@link #setPSDEVRGroupId}
     * @param pSDEVRGroupId
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdevrgroupid(String pSDEVRGroupId){
        this.setPSDEVRGroupId(pSDEVRGroupId);
        return this;
    }

    /**
     * 设置 属性值规则组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEVRGroupId}
     * @param pSDEVRGroup 引用对象
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdevrgroupid(PSDEVRGroup pSDEVRGroup){
        if(pSDEVRGroup == null){
            this.setPSDEId(null);
            this.setPSDEVRGroupId(null);
            this.setPSDEVRGroupName(null);
        }
        else{
            this.setPSDEId(pSDEVRGroup.getPSDEId());
            this.setPSDEVRGroupId(pSDEVRGroup.getPSDEVRGroupId());
            this.setPSDEVRGroupName(pSDEVRGroup.getPSDEVRGroupName());
        }
        return this;
    }

    /**
     * <B>PSDEVRGROUPNAME</B>&nbsp;属性值规则组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVRGROUPID}
     */
    public final static String FIELD_PSDEVRGROUPNAME = "psdevrgroupname";

    /**
     * 设置 属性值规则组
     * 
     * @param pSDEVRGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEVRGROUPNAME)
    public void setPSDEVRGroupName(String pSDEVRGroupName){
        this.set(FIELD_PSDEVRGROUPNAME, pSDEVRGroupName);
    }
    
    /**
     * 获取 属性值规则组  
     * @return
     */
    @JsonIgnore
    public String getPSDEVRGroupName(){
        Object objValue = this.get(FIELD_PSDEVRGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 属性值规则组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEVRGroupNameDirty(){
        if(this.contains(FIELD_PSDEVRGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 属性值规则组
     */
    @JsonIgnore
    public void resetPSDEVRGroupName(){
        this.reset(FIELD_PSDEVRGROUPNAME);
    }

    /**
     * 设置 属性值规则组
     * <P>
     * 等同 {@link #setPSDEVRGroupName}
     * @param pSDEVRGroupName
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdevrgroupname(String pSDEVRGroupName){
        this.setPSDEVRGroupName(pSDEVRGroupName);
        return this;
    }

    /**
     * <B>PSDEVRGRPDETAILID</B>&nbsp;实体属性值规则组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVRGRPDETAILID = "psdevrgrpdetailid";

    /**
     * 设置 实体属性值规则组成员标识
     * 
     * @param pSDEVRGrpDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEVRGRPDETAILID)
    public void setPSDEVRGrpDetailId(String pSDEVRGrpDetailId){
        this.set(FIELD_PSDEVRGRPDETAILID, pSDEVRGrpDetailId);
    }
    
    /**
     * 获取 实体属性值规则组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEVRGrpDetailId(){
        Object objValue = this.get(FIELD_PSDEVRGRPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体属性值规则组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEVRGrpDetailIdDirty(){
        if(this.contains(FIELD_PSDEVRGRPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体属性值规则组成员标识
     */
    @JsonIgnore
    public void resetPSDEVRGrpDetailId(){
        this.reset(FIELD_PSDEVRGRPDETAILID);
    }

    /**
     * 设置 实体属性值规则组成员标识
     * <P>
     * 等同 {@link #setPSDEVRGrpDetailId}
     * @param pSDEVRGrpDetailId
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdevrgrpdetailid(String pSDEVRGrpDetailId){
        this.setPSDEVRGrpDetailId(pSDEVRGrpDetailId);
        return this;
    }

    /**
     * <B>PSDEVRGRPDETAILNAME</B>&nbsp;成员名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEVRGRPDETAILNAME = "psdevrgrpdetailname";

    /**
     * 设置 成员名称
     * 
     * @param pSDEVRGrpDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEVRGRPDETAILNAME)
    public void setPSDEVRGrpDetailName(String pSDEVRGrpDetailName){
        this.set(FIELD_PSDEVRGRPDETAILNAME, pSDEVRGrpDetailName);
    }
    
    /**
     * 获取 成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEVRGrpDetailName(){
        Object objValue = this.get(FIELD_PSDEVRGRPDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEVRGrpDetailNameDirty(){
        if(this.contains(FIELD_PSDEVRGRPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员名称
     */
    @JsonIgnore
    public void resetPSDEVRGrpDetailName(){
        this.reset(FIELD_PSDEVRGRPDETAILNAME);
    }

    /**
     * 设置 成员名称
     * <P>
     * 等同 {@link #setPSDEVRGrpDetailName}
     * @param pSDEVRGrpDetailName
     */
    @JsonIgnore
    public PSDEVRGrpDetail psdevrgrpdetailname(String pSDEVRGrpDetailName){
        this.setPSDEVRGrpDetailName(pSDEVRGrpDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEVRGrpDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEVRGrpDetailName(strName);
    }

    @JsonIgnore
    public PSDEVRGrpDetail name(String strName){
        this.setPSDEVRGrpDetailName(strName);
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
    public PSDEVRGrpDetail updatedate(String updateDate){
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
    public PSDEVRGrpDetail updateman(String updateMan){
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
    public PSDEVRGrpDetail usercat(String userCat){
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
    public PSDEVRGrpDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEVRGrpDetail usertag(String userTag){
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
    public PSDEVRGrpDetail usertag2(String userTag2){
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
    public PSDEVRGrpDetail usertag3(String userTag3){
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
    public PSDEVRGrpDetail usertag4(String userTag4){
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
    public PSDEVRGrpDetail validflag(Integer validFlag){
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
    public PSDEVRGrpDetail validflag(Boolean validFlag){
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
        return this.getPSDEVRGrpDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEVRGrpDetailId(strValue);
    }

    @JsonIgnore
    public PSDEVRGrpDetail id(String strValue){
        this.setPSDEVRGrpDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEVRGrpDetail){
            PSDEVRGrpDetail model = (PSDEVRGrpDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
