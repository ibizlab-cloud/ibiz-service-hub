package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEACTIONVR</B>实体行为值规则 模型传输对象
 * <P>
 * 实体行为值规则模型，定义行为调用参数的检查逻辑
 */
public class PSDEActionVR extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEActionVR(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定行为值规则的代码标识，需要在所在的实体行为中具有唯一性
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
    public PSDEActionVR codename(String codeName){
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
    public PSDEActionVR createdate(String createDate){
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
    public PSDEActionVR createman(String createMan){
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
    public PSDEActionVR memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定行为值规则的检查次序
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
    public PSDEActionVR ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，指定行为值规则所在实体行为对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEAction} 
     */
    public final static String FIELD_PSDEACTIONID = "psdeactionid";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * 
     * @param pSDEActionId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONID)
    public void setPSDEActionId(String pSDEActionId){
        this.set(FIELD_PSDEACTIONID, pSDEActionId);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionId(){
        Object objValue = this.get(FIELD_PSDEACTIONID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionIdDirty(){
        if(this.contains(FIELD_PSDEACTIONID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionId(){
        this.reset(FIELD_PSDEACTIONID);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONID}
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEActionId
     */
    @JsonIgnore
    public PSDEActionVR psdeactionid(String pSDEActionId){
        this.setPSDEActionId(pSDEActionId);
        return this;
    }

    /**
     * 设置 实体行为，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionId}
     * @param pSDEAction 引用对象
     */
    @JsonIgnore
    public PSDEActionVR psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
            this.setPSDEId(pSDEAction.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，指定行为值规则所在实体行为对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
     */
    public final static String FIELD_PSDEACTIONNAME = "psdeactionname";

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * 
     * @param pSDEActionName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONNAME)
    public void setPSDEActionName(String pSDEActionName){
        this.set(FIELD_PSDEACTIONNAME, pSDEActionName);
    }
    
    /**
     * 获取 实体行为  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionName(){
        Object objValue = this.get(FIELD_PSDEACTIONNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionNameDirty(){
        if(this.contains(FIELD_PSDEACTIONNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为
     */
    @JsonIgnore
    public void resetPSDEActionName(){
        this.reset(FIELD_PSDEACTIONNAME);
    }

    /**
     * 设置 实体行为，详细说明：{@link #FIELD_PSDEACTIONNAME}
     * <P>
     * 等同 {@link #setPSDEActionName}
     * @param pSDEActionName
     */
    @JsonIgnore
    public PSDEActionVR psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEACTIONVRID</B>&nbsp;实体行为值规则标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEACTIONVRID = "psdeactionvrid";

    /**
     * 设置 实体行为值规则标识
     * 
     * @param pSDEActionVRId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONVRID)
    public void setPSDEActionVRId(String pSDEActionVRId){
        this.set(FIELD_PSDEACTIONVRID, pSDEActionVRId);
    }
    
    /**
     * 获取 实体行为值规则标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionVRId(){
        Object objValue = this.get(FIELD_PSDEACTIONVRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为值规则标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionVRIdDirty(){
        if(this.contains(FIELD_PSDEACTIONVRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为值规则标识
     */
    @JsonIgnore
    public void resetPSDEActionVRId(){
        this.reset(FIELD_PSDEACTIONVRID);
    }

    /**
     * 设置 实体行为值规则标识
     * <P>
     * 等同 {@link #setPSDEActionVRId}
     * @param pSDEActionVRId
     */
    @JsonIgnore
    public PSDEActionVR psdeactionvrid(String pSDEActionVRId){
        this.setPSDEActionVRId(pSDEActionVRId);
        return this;
    }

    /**
     * <B>PSDEACTIONVRNAME</B>&nbsp;名称，指定行为值规则的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEACTIONVRNAME = "psdeactionvrname";

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSDEACTIONVRNAME}
     * 
     * @param pSDEActionVRName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONVRNAME)
    public void setPSDEActionVRName(String pSDEActionVRName){
        this.set(FIELD_PSDEACTIONVRNAME, pSDEActionVRName);
    }
    
    /**
     * 获取 名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionVRName(){
        Object objValue = this.get(FIELD_PSDEACTIONVRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionVRNameDirty(){
        if(this.contains(FIELD_PSDEACTIONVRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 名称
     */
    @JsonIgnore
    public void resetPSDEActionVRName(){
        this.reset(FIELD_PSDEACTIONVRNAME);
    }

    /**
     * 设置 名称，详细说明：{@link #FIELD_PSDEACTIONVRNAME}
     * <P>
     * 等同 {@link #setPSDEActionVRName}
     * @param pSDEActionVRName
     */
    @JsonIgnore
    public PSDEActionVR psdeactionvrname(String pSDEActionVRName){
        this.setPSDEActionVRName(pSDEActionVRName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEActionVRName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEActionVRName(strName);
    }

    @JsonIgnore
    public PSDEActionVR name(String strName){
        this.setPSDEActionVRName(strName);
        return this;
    }

    /**
     * <B>PSDEFVRID</B>&nbsp;实体值规则，行为值规则类型为【实体值规则】指定实体值规则对象，注意一般不指定默认检查的值规则对象
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
    public PSDEActionVR psdefvrid(String pSDEFVRId){
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
    public PSDEActionVR psdefvrid(PSDEFValueRule pSDEFValueRule){
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
     * <B>PSDEFVRNAME</B>&nbsp;实体值规则，行为值规则类型为【实体值规则】指定实体值规则对象，注意一般不指定默认检查的值规则对象
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
    public PSDEActionVR psdefvrname(String pSDEFVRName){
        this.setPSDEFVRName(pSDEFVRName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONID}
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
    public PSDEActionVR psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
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
    public PSDEActionVR updatedate(String updateDate){
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
    public PSDEActionVR updateman(String updateMan){
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
    public PSDEActionVR usercat(String userCat){
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
    public PSDEActionVR usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEActionVR usertag(String userTag){
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
    public PSDEActionVR usertag2(String userTag2){
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
    public PSDEActionVR usertag3(String userTag3){
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
    public PSDEActionVR usertag4(String userTag4){
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
    public PSDEActionVR validflag(Integer validFlag){
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
    public PSDEActionVR validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>VRTYPE</B>&nbsp;值规则类型，指定行为值规则的类型，未定义时为【实体值规则】
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
    public PSDEActionVR vrtype(String vRType){
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
    public PSDEActionVR vrtype(net.ibizsys.psmodel.core.util.PSModelEnums.TargetVRType vRType){
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
        return this.getPSDEActionVRId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEActionVRId(strValue);
    }

    @JsonIgnore
    public PSDEActionVR id(String strValue){
        this.setPSDEActionVRId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEActionVR){
            PSDEActionVR model = (PSDEActionVR)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
