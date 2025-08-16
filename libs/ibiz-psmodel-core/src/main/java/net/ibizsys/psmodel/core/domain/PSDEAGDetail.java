package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEAGDETAIL</B>实体行为组成员 模型传输对象
 * <P>
 * 实体行为组成员模型，定义行为组包含的实体行为或实体数据集对象
 */
public class PSDEAGDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEAGDetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体行为组成员的代码标识，需在所属行为组中具备唯一性
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
    public PSDEAGDetail codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定实体行为组成员的代码标识2，需在所属行为组中具备唯一性
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
    public PSDEAGDetail codename2(String codeName2){
        this.setCodeName2(codeName2);
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
    public PSDEAGDetail createdate(String createDate){
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
    public PSDEAGDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DETAILTYPE</B>&nbsp;成员类型，指定实体行为组的成员类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DEMethodGroupDetailType} 
     */
    public final static String FIELD_DETAILTYPE = "detailtype";

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * 
     * @param detailType
     * 
     */
    @JsonProperty(FIELD_DETAILTYPE)
    public void setDetailType(String detailType){
        this.set(FIELD_DETAILTYPE, detailType);
    }
    
    /**
     * 获取 成员类型  
     * @return
     */
    @JsonIgnore
    public String getDetailType(){
        Object objValue = this.get(FIELD_DETAILTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 成员类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailTypeDirty(){
        if(this.contains(FIELD_DETAILTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员类型
     */
    @JsonIgnore
    public void resetDetailType(){
        this.reset(FIELD_DETAILTYPE);
    }

    /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEAGDetail detailtype(String detailType){
        this.setDetailType(detailType);
        return this;
    }

     /**
     * 设置 成员类型，详细说明：{@link #FIELD_DETAILTYPE}
     * <P>
     * 等同 {@link #setDetailType}
     * @param detailType
     */
    @JsonIgnore
    public PSDEAGDetail detailtype(net.ibizsys.psmodel.core.util.PSModelEnums.DEMethodGroupDetailType detailType){
        if(detailType == null){
            this.setDetailType(null);
        }
        else{
            this.setDetailType(detailType.value);
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
    public PSDEAGDetail memo(String memo){
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
    public PSDEAGDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDEACTIONGROUPID</B>&nbsp;实体行为组，指定实体行为组成员所属的行为组
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEActionGroup} 
     */
    public final static String FIELD_PSDEACTIONGROUPID = "psdeactiongroupid";

    /**
     * 设置 实体行为组，详细说明：{@link #FIELD_PSDEACTIONGROUPID}
     * 
     * @param pSDEActionGroupId
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONGROUPID)
    public void setPSDEActionGroupId(String pSDEActionGroupId){
        this.set(FIELD_PSDEACTIONGROUPID, pSDEActionGroupId);
    }
    
    /**
     * 获取 实体行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionGroupId(){
        Object objValue = this.get(FIELD_PSDEACTIONGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionGroupIdDirty(){
        if(this.contains(FIELD_PSDEACTIONGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为组
     */
    @JsonIgnore
    public void resetPSDEActionGroupId(){
        this.reset(FIELD_PSDEACTIONGROUPID);
    }

    /**
     * 设置 实体行为组，详细说明：{@link #FIELD_PSDEACTIONGROUPID}
     * <P>
     * 等同 {@link #setPSDEActionGroupId}
     * @param pSDEActionGroupId
     */
    @JsonIgnore
    public PSDEAGDetail psdeactiongroupid(String pSDEActionGroupId){
        this.setPSDEActionGroupId(pSDEActionGroupId);
        return this;
    }

    /**
     * 设置 实体行为组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEActionGroupId}
     * @param pSDEActionGroup 引用对象
     */
    @JsonIgnore
    public PSDEAGDetail psdeactiongroupid(PSDEActionGroup pSDEActionGroup){
        if(pSDEActionGroup == null){
            this.setPSDEActionGroupId(null);
            this.setPSDEActionGroupName(null);
            this.setPSDEId(null);
        }
        else{
            this.setPSDEActionGroupId(pSDEActionGroup.getPSDEActionGroupId());
            this.setPSDEActionGroupName(pSDEActionGroup.getPSDEActionGroupName());
            this.setPSDEId(pSDEActionGroup.getPSDEId());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONGROUPNAME</B>&nbsp;实体行为组，指定实体行为组成员所属的行为组
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONGROUPID}
     */
    public final static String FIELD_PSDEACTIONGROUPNAME = "psdeactiongroupname";

    /**
     * 设置 实体行为组，详细说明：{@link #FIELD_PSDEACTIONGROUPNAME}
     * 
     * @param pSDEActionGroupName
     * 
     */
    @JsonProperty(FIELD_PSDEACTIONGROUPNAME)
    public void setPSDEActionGroupName(String pSDEActionGroupName){
        this.set(FIELD_PSDEACTIONGROUPNAME, pSDEActionGroupName);
    }
    
    /**
     * 获取 实体行为组  
     * @return
     */
    @JsonIgnore
    public String getPSDEActionGroupName(){
        Object objValue = this.get(FIELD_PSDEACTIONGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEActionGroupNameDirty(){
        if(this.contains(FIELD_PSDEACTIONGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为组
     */
    @JsonIgnore
    public void resetPSDEActionGroupName(){
        this.reset(FIELD_PSDEACTIONGROUPNAME);
    }

    /**
     * 设置 实体行为组，详细说明：{@link #FIELD_PSDEACTIONGROUPNAME}
     * <P>
     * 等同 {@link #setPSDEActionGroupName}
     * @param pSDEActionGroupName
     */
    @JsonIgnore
    public PSDEAGDetail psdeactiongroupname(String pSDEActionGroupName){
        this.setPSDEActionGroupName(pSDEActionGroupName);
        return this;
    }

    /**
     * <B>PSDEACTIONID</B>&nbsp;实体行为，行为组成员类型为【实体行为】时指定相关的实体行为
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
    public PSDEAGDetail psdeactionid(String pSDEActionId){
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
    public PSDEAGDetail psdeactionid(PSDEAction pSDEAction){
        if(pSDEAction == null){
            this.setPSDEActionId(null);
            this.setPSDEActionName(null);
        }
        else{
            this.setPSDEActionId(pSDEAction.getPSDEActionId());
            this.setPSDEActionName(pSDEAction.getPSDEActionName());
        }
        return this;
    }

    /**
     * <B>PSDEACTIONNAME</B>&nbsp;实体行为，行为组成员类型为【实体行为】时指定相关的实体行为
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
    public PSDEAGDetail psdeactionname(String pSDEActionName){
        this.setPSDEActionName(pSDEActionName);
        return this;
    }

    /**
     * <B>PSDEAGDETAILID</B>&nbsp;实体行为组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEAGDETAILID = "psdeagdetailid";

    /**
     * 设置 实体行为组成员标识
     * 
     * @param pSDEAGDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEAGDETAILID)
    public void setPSDEAGDetailId(String pSDEAGDetailId){
        this.set(FIELD_PSDEAGDETAILID, pSDEAGDetailId);
    }
    
    /**
     * 获取 实体行为组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEAGDetailId(){
        Object objValue = this.get(FIELD_PSDEAGDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体行为组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEAGDetailIdDirty(){
        if(this.contains(FIELD_PSDEAGDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体行为组成员标识
     */
    @JsonIgnore
    public void resetPSDEAGDetailId(){
        this.reset(FIELD_PSDEAGDETAILID);
    }

    /**
     * 设置 实体行为组成员标识
     * <P>
     * 等同 {@link #setPSDEAGDetailId}
     * @param pSDEAGDetailId
     */
    @JsonIgnore
    public PSDEAGDetail psdeagdetailid(String pSDEAGDetailId){
        this.setPSDEAGDetailId(pSDEAGDetailId);
        return this;
    }

    /**
     * <B>PSDEAGDETAILNAME</B>&nbsp;组成员名称，指定实体行为组成员的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEAGDETAILNAME = "psdeagdetailname";

    /**
     * 设置 组成员名称，详细说明：{@link #FIELD_PSDEAGDETAILNAME}
     * 
     * @param pSDEAGDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEAGDETAILNAME)
    public void setPSDEAGDetailName(String pSDEAGDetailName){
        this.set(FIELD_PSDEAGDETAILNAME, pSDEAGDetailName);
    }
    
    /**
     * 获取 组成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEAGDetailName(){
        Object objValue = this.get(FIELD_PSDEAGDETAILNAME);
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
    public boolean isPSDEAGDetailNameDirty(){
        if(this.contains(FIELD_PSDEAGDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组成员名称
     */
    @JsonIgnore
    public void resetPSDEAGDetailName(){
        this.reset(FIELD_PSDEAGDETAILNAME);
    }

    /**
     * 设置 组成员名称，详细说明：{@link #FIELD_PSDEAGDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEAGDetailName}
     * @param pSDEAGDetailName
     */
    @JsonIgnore
    public PSDEAGDetail psdeagdetailname(String pSDEAGDetailName){
        this.setPSDEAGDetailName(pSDEAGDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEAGDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEAGDetailName(strName);
    }

    @JsonIgnore
    public PSDEAGDetail name(String strName){
        this.setPSDEAGDetailName(strName);
        return this;
    }

    /**
     * <B>PSDEDATASETID</B>&nbsp;实体数据集，行为组成员类型为【实体数据组】时指定相关的实体行为
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDATASETID = "psdedatasetid";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETID}
     * 
     * @param pSDEDataSetId
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETID)
    public void setPSDEDataSetId(String pSDEDataSetId){
        this.set(FIELD_PSDEDATASETID, pSDEDataSetId);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetId(){
        Object objValue = this.get(FIELD_PSDEDATASETID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetIdDirty(){
        if(this.contains(FIELD_PSDEDATASETID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetId(){
        this.reset(FIELD_PSDEDATASETID);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETID}
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSetId
     */
    @JsonIgnore
    public PSDEAGDetail psdedatasetid(String pSDEDataSetId){
        this.setPSDEDataSetId(pSDEDataSetId);
        return this;
    }

    /**
     * 设置 实体数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDataSetId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEAGDetail psdedatasetid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDataSetId(null);
            this.setPSDEDataSetName(null);
        }
        else{
            this.setPSDEDataSetId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDataSetName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDATASETNAME</B>&nbsp;实体数据集，行为组成员类型为【实体数据组】时指定相关的实体行为
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDATASETID}
     */
    public final static String FIELD_PSDEDATASETNAME = "psdedatasetname";

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * 
     * @param pSDEDataSetName
     * 
     */
    @JsonProperty(FIELD_PSDEDATASETNAME)
    public void setPSDEDataSetName(String pSDEDataSetName){
        this.set(FIELD_PSDEDATASETNAME, pSDEDataSetName);
    }
    
    /**
     * 获取 实体数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDataSetName(){
        Object objValue = this.get(FIELD_PSDEDATASETNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDataSetNameDirty(){
        if(this.contains(FIELD_PSDEDATASETNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体数据集
     */
    @JsonIgnore
    public void resetPSDEDataSetName(){
        this.reset(FIELD_PSDEDATASETNAME);
    }

    /**
     * 设置 实体数据集，详细说明：{@link #FIELD_PSDEDATASETNAME}
     * <P>
     * 等同 {@link #setPSDEDataSetName}
     * @param pSDEDataSetName
     */
    @JsonIgnore
    public PSDEAGDetail psdedatasetname(String pSDEDataSetName){
        this.setPSDEDataSetName(pSDEDataSetName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEACTIONGROUPID}
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
    public PSDEAGDetail psdeid(String pSDEId){
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
    public PSDEAGDetail updatedate(String updateDate){
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
    public PSDEAGDetail updateman(String updateMan){
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
    public PSDEAGDetail usercat(String userCat){
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
    public PSDEAGDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDEAGDetail usertag(String userTag){
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
    public PSDEAGDetail usertag2(String userTag2){
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
    public PSDEAGDetail usertag3(String userTag3){
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
    public PSDEAGDetail usertag4(String userTag4){
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
    public PSDEAGDetail validflag(Integer validFlag){
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
    public PSDEAGDetail validflag(Boolean validFlag){
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
        return this.getPSDEAGDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEAGDetailId(strValue);
    }

    @JsonIgnore
    public PSDEAGDetail id(String strValue){
        this.setPSDEAGDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEAGDetail){
            PSDEAGDetail model = (PSDEAGDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
