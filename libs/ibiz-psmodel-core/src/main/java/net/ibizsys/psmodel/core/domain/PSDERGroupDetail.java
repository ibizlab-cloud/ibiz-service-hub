package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDERGROUPDETAIL</B>实体关系组成员 模型传输对象
 * <P>
 * 实体关系组成员模型，定义实体关系组包含的实体关系对象
 */
public class PSDERGroupDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDERGroupDetail(){
        this.setValidFlag(1);
    }      

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定实体关系组成员的代码标识，需在所在实体关系组具备唯一性
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
    public PSDERGroupDetail codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定实体关系组成员的代码标识2，需在所在实体关系组具备唯一性
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
    public PSDERGroupDetail codename2(String codeName2){
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
    public PSDERGroupDetail createdate(String createDate){
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
    public PSDERGroupDetail createman(String createMan){
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
    public PSDERGroupDetail data(String data){
        this.setData(data);
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
    public PSDERGroupDetail detailtag(String detailTag){
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
    public PSDERGroupDetail detailtag2(String detailTag2){
        this.setDetailTag2(detailTag2);
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
    public PSDERGroupDetail memo(String memo){
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
    public PSDERGroupDetail ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PSDERGROUPDETAILID</B>&nbsp;实体关系组成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDERGROUPDETAILID = "psdergroupdetailid";

    /**
     * 设置 实体关系组成员标识
     * 
     * @param pSDERGroupDetailId
     * 
     */
    @JsonProperty(FIELD_PSDERGROUPDETAILID)
    public void setPSDERGroupDetailId(String pSDERGroupDetailId){
        this.set(FIELD_PSDERGROUPDETAILID, pSDERGroupDetailId);
    }
    
    /**
     * 获取 实体关系组成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDERGroupDetailId(){
        Object objValue = this.get(FIELD_PSDERGROUPDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系组成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERGroupDetailIdDirty(){
        if(this.contains(FIELD_PSDERGROUPDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系组成员标识
     */
    @JsonIgnore
    public void resetPSDERGroupDetailId(){
        this.reset(FIELD_PSDERGROUPDETAILID);
    }

    /**
     * 设置 实体关系组成员标识
     * <P>
     * 等同 {@link #setPSDERGroupDetailId}
     * @param pSDERGroupDetailId
     */
    @JsonIgnore
    public PSDERGroupDetail psdergroupdetailid(String pSDERGroupDetailId){
        this.setPSDERGroupDetailId(pSDERGroupDetailId);
        return this;
    }

    /**
     * <B>PSDERGROUPDETAILNAME</B>&nbsp;成员名称，指定实体关系组成员的名称，需在所在实体关系组具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDERGROUPDETAILNAME = "psdergroupdetailname";

    /**
     * 设置 成员名称，详细说明：{@link #FIELD_PSDERGROUPDETAILNAME}
     * 
     * @param pSDERGroupDetailName
     * 
     */
    @JsonProperty(FIELD_PSDERGROUPDETAILNAME)
    public void setPSDERGroupDetailName(String pSDERGroupDetailName){
        this.set(FIELD_PSDERGROUPDETAILNAME, pSDERGroupDetailName);
    }
    
    /**
     * 获取 成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDERGroupDetailName(){
        Object objValue = this.get(FIELD_PSDERGROUPDETAILNAME);
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
    public boolean isPSDERGroupDetailNameDirty(){
        if(this.contains(FIELD_PSDERGROUPDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 成员名称
     */
    @JsonIgnore
    public void resetPSDERGroupDetailName(){
        this.reset(FIELD_PSDERGROUPDETAILNAME);
    }

    /**
     * 设置 成员名称，详细说明：{@link #FIELD_PSDERGROUPDETAILNAME}
     * <P>
     * 等同 {@link #setPSDERGroupDetailName}
     * @param pSDERGroupDetailName
     */
    @JsonIgnore
    public PSDERGroupDetail psdergroupdetailname(String pSDERGroupDetailName){
        this.setPSDERGroupDetailName(pSDERGroupDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDERGroupDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDERGroupDetailName(strName);
    }

    @JsonIgnore
    public PSDERGroupDetail name(String strName){
        this.setPSDERGroupDetailName(strName);
        return this;
    }

    /**
     * <B>PSDERGROUPID</B>&nbsp;实体关系组，指定实体关系组成员所在的关系组对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDERGroup} 
     */
    public final static String FIELD_PSDERGROUPID = "psdergroupid";

    /**
     * 设置 实体关系组，详细说明：{@link #FIELD_PSDERGROUPID}
     * 
     * @param pSDERGroupId
     * 
     */
    @JsonProperty(FIELD_PSDERGROUPID)
    public void setPSDERGroupId(String pSDERGroupId){
        this.set(FIELD_PSDERGROUPID, pSDERGroupId);
    }
    
    /**
     * 获取 实体关系组  
     * @return
     */
    @JsonIgnore
    public String getPSDERGroupId(){
        Object objValue = this.get(FIELD_PSDERGROUPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERGroupIdDirty(){
        if(this.contains(FIELD_PSDERGROUPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系组
     */
    @JsonIgnore
    public void resetPSDERGroupId(){
        this.reset(FIELD_PSDERGROUPID);
    }

    /**
     * 设置 实体关系组，详细说明：{@link #FIELD_PSDERGROUPID}
     * <P>
     * 等同 {@link #setPSDERGroupId}
     * @param pSDERGroupId
     */
    @JsonIgnore
    public PSDERGroupDetail psdergroupid(String pSDERGroupId){
        this.setPSDERGroupId(pSDERGroupId);
        return this;
    }

    /**
     * 设置 实体关系组，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERGroupId}
     * @param pSDERGroup 引用对象
     */
    @JsonIgnore
    public PSDERGroupDetail psdergroupid(PSDERGroup pSDERGroup){
        if(pSDERGroup == null){
            this.setPSDERGroupId(null);
            this.setPSDERGroupName(null);
        }
        else{
            this.setPSDERGroupId(pSDERGroup.getPSDERGroupId());
            this.setPSDERGroupName(pSDERGroup.getPSDERGroupName());
        }
        return this;
    }

    /**
     * <B>PSDERGROUPNAME</B>&nbsp;实体关系组，指定实体关系组成员所在的关系组对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERGROUPID}
     */
    public final static String FIELD_PSDERGROUPNAME = "psdergroupname";

    /**
     * 设置 实体关系组，详细说明：{@link #FIELD_PSDERGROUPNAME}
     * 
     * @param pSDERGroupName
     * 
     */
    @JsonProperty(FIELD_PSDERGROUPNAME)
    public void setPSDERGroupName(String pSDERGroupName){
        this.set(FIELD_PSDERGROUPNAME, pSDERGroupName);
    }
    
    /**
     * 获取 实体关系组  
     * @return
     */
    @JsonIgnore
    public String getPSDERGroupName(){
        Object objValue = this.get(FIELD_PSDERGROUPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERGroupNameDirty(){
        if(this.contains(FIELD_PSDERGROUPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系组
     */
    @JsonIgnore
    public void resetPSDERGroupName(){
        this.reset(FIELD_PSDERGROUPNAME);
    }

    /**
     * 设置 实体关系组，详细说明：{@link #FIELD_PSDERGROUPNAME}
     * <P>
     * 等同 {@link #setPSDERGroupName}
     * @param pSDERGroupName
     */
    @JsonIgnore
    public PSDERGroupDetail psdergroupname(String pSDERGroupName){
        this.setPSDERGroupName(pSDERGroupName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定实体关系组成员引用的实体关系对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDER} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSDERGroupDetail psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSDERGroupDetail psderid(PSDER pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定实体关系组成员引用的实体关系对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSDERGroupDetail psdername(String pSDERName){
        this.setPSDERName(pSDERName);
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
    public PSDERGroupDetail updatedate(String updateDate){
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
    public PSDERGroupDetail updateman(String updateMan){
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
    public PSDERGroupDetail usercat(String userCat){
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
    public PSDERGroupDetail usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSDERGroupDetail usertag(String userTag){
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
    public PSDERGroupDetail usertag2(String userTag2){
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
    public PSDERGroupDetail usertag3(String userTag3){
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
    public PSDERGroupDetail usertag4(String userTag4){
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
    public PSDERGroupDetail validflag(Integer validFlag){
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
    public PSDERGroupDetail validflag(Boolean validFlag){
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
        return this.getPSDERGroupDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDERGroupDetailId(strValue);
    }

    @JsonIgnore
    public PSDERGroupDetail id(String strValue){
        this.setPSDERGroupDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDERGroupDetail){
            PSDERGroupDetail model = (PSDERGroupDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
