package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEFIUDETAIL</B>实体表单项更新明细 模型传输对象
 * <P>
 * 实体表单项更新明细模型，定义了表单项更新的更新内容明细
 */
public class PSDEFIUDetailDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSDEFIUDetailDTO(){
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
    public PSDEFIUDetailDTO createdate(Timestamp createDate){
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
    public PSDEFIUDetailDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEFIUDETAILID</B>&nbsp;实体表单项更新明细标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFIUDETAILID = "psdefiudetailid";

    /**
     * 设置 实体表单项更新明细标识
     * 
     * @param pSDEFIUDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEFIUDETAILID)
    public void setPSDEFIUDetailId(String pSDEFIUDetailId){
        this.set(FIELD_PSDEFIUDETAILID, pSDEFIUDetailId);
    }
    
    /**
     * 获取 实体表单项更新明细标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIUDetailId(){
        Object objValue = this.get(FIELD_PSDEFIUDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单项更新明细标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIUDetailIdDirty(){
        if(this.contains(FIELD_PSDEFIUDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单项更新明细标识
     */
    @JsonIgnore
    public void resetPSDEFIUDetailId(){
        this.reset(FIELD_PSDEFIUDETAILID);
    }

    /**
     * 设置 实体表单项更新明细标识
     * <P>
     * 等同 {@link #setPSDEFIUDetailId}
     * @param pSDEFIUDetailId
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdefiudetailid(String pSDEFIUDetailId){
        this.setPSDEFIUDetailId(pSDEFIUDetailId);
        return this;
    }

    /**
     * <B>PSDEFIUDETAILNAME</B>&nbsp;更新明细名称，指定实体表单项更新明细的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEFIUDETAILNAME = "psdefiudetailname";

    /**
     * 设置 更新明细名称，详细说明：{@link #FIELD_PSDEFIUDETAILNAME}
     * 
     * @param pSDEFIUDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEFIUDETAILNAME)
    public void setPSDEFIUDetailName(String pSDEFIUDetailName){
        this.set(FIELD_PSDEFIUDETAILNAME, pSDEFIUDetailName);
    }
    
    /**
     * 获取 更新明细名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIUDetailName(){
        Object objValue = this.get(FIELD_PSDEFIUDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新明细名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIUDetailNameDirty(){
        if(this.contains(FIELD_PSDEFIUDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新明细名称
     */
    @JsonIgnore
    public void resetPSDEFIUDetailName(){
        this.reset(FIELD_PSDEFIUDETAILNAME);
    }

    /**
     * 设置 更新明细名称，详细说明：{@link #FIELD_PSDEFIUDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEFIUDetailName}
     * @param pSDEFIUDetailName
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdefiudetailname(String pSDEFIUDetailName){
        this.setPSDEFIUDetailName(pSDEFIUDetailName);
        return this;
    }

    /**
     * <B>PSDEFIUPDATEID</B>&nbsp;实体表单项更新，指定更新明细所属的表单项更新对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFIUpdateDTO} 
     */
    public final static String FIELD_PSDEFIUPDATEID = "psdefiupdateid";

    /**
     * 设置 实体表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATEID}
     * 
     * @param pSDEFIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDEFIUPDATEID)
    public void setPSDEFIUpdateId(String pSDEFIUpdateId){
        this.set(FIELD_PSDEFIUPDATEID, pSDEFIUpdateId);
    }
    
    /**
     * 获取 实体表单项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIUpdateId(){
        Object objValue = this.get(FIELD_PSDEFIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIUpdateIdDirty(){
        if(this.contains(FIELD_PSDEFIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单项更新
     */
    @JsonIgnore
    public void resetPSDEFIUpdateId(){
        this.reset(FIELD_PSDEFIUPDATEID);
    }

    /**
     * 设置 实体表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATEID}
     * <P>
     * 等同 {@link #setPSDEFIUpdateId}
     * @param pSDEFIUpdateId
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdefiupdateid(String pSDEFIUpdateId){
        this.setPSDEFIUpdateId(pSDEFIUpdateId);
        return this;
    }

    /**
     * 设置 实体表单项更新，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFIUpdateId}
     * @param pSDEFIUpdate 引用对象
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdefiupdateid(PSDEFIUpdateDTO pSDEFIUpdate){
        if(pSDEFIUpdate == null){
            this.setPSDEFIUpdateId(null);
            this.setPSDEFIUpdateName(null);
        }
        else{
            this.setPSDEFIUpdateId(pSDEFIUpdate.getPSDEFIUpdateId());
            this.setPSDEFIUpdateName(pSDEFIUpdate.getPSDEFIUpdateName());
        }
        return this;
    }

    /**
     * <B>PSDEFIUPDATENAME</B>&nbsp;实体表单项更新，指定更新明细所属的表单项更新对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFIUPDATEID}
     */
    public final static String FIELD_PSDEFIUPDATENAME = "psdefiupdatename";

    /**
     * 设置 实体表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATENAME}
     * 
     * @param pSDEFIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDEFIUPDATENAME)
    public void setPSDEFIUpdateName(String pSDEFIUpdateName){
        this.set(FIELD_PSDEFIUPDATENAME, pSDEFIUpdateName);
    }
    
    /**
     * 获取 实体表单项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEFIUpdateName(){
        Object objValue = this.get(FIELD_PSDEFIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFIUpdateNameDirty(){
        if(this.contains(FIELD_PSDEFIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单项更新
     */
    @JsonIgnore
    public void resetPSDEFIUpdateName(){
        this.reset(FIELD_PSDEFIUPDATENAME);
    }

    /**
     * 设置 实体表单项更新，详细说明：{@link #FIELD_PSDEFIUPDATENAME}
     * <P>
     * 等同 {@link #setPSDEFIUpdateName}
     * @param pSDEFIUpdateName
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdefiupdatename(String pSDEFIUpdateName){
        this.setPSDEFIUpdateName(pSDEFIUpdateName);
        return this;
    }

    /**
     * <B>PSDEFORMDETAILID</B>&nbsp;表单成员，指定表单项更新明细指向的表单项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO} 
     */
    public final static String FIELD_PSDEFORMDETAILID = "psdeformdetailid";

    /**
     * 设置 表单成员，详细说明：{@link #FIELD_PSDEFORMDETAILID}
     * 
     * @param pSDEFormDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMDETAILID)
    public void setPSDEFormDetailId(String pSDEFormDetailId){
        this.set(FIELD_PSDEFORMDETAILID, pSDEFormDetailId);
    }
    
    /**
     * 获取 表单成员  
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
     * 判断 表单成员 是否指定值，包括空值
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
     * 重置 表单成员
     */
    @JsonIgnore
    public void resetPSDEFormDetailId(){
        this.reset(FIELD_PSDEFORMDETAILID);
    }

    /**
     * 设置 表单成员，详细说明：{@link #FIELD_PSDEFORMDETAILID}
     * <P>
     * 等同 {@link #setPSDEFormDetailId}
     * @param pSDEFormDetailId
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdeformdetailid(String pSDEFormDetailId){
        this.setPSDEFormDetailId(pSDEFormDetailId);
        return this;
    }

    /**
     * 设置 表单成员，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEFormDetailId}
     * @param pSDEFormDetail 引用对象
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdeformdetailid(PSDEFormDetailDTO pSDEFormDetail){
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
     * <B>PSDEFORMDETAILNAME</B>&nbsp;表单项，指定表单项更新明细指向的表单项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEFORMDETAILID}
     */
    public final static String FIELD_PSDEFORMDETAILNAME = "psdeformdetailname";

    /**
     * 设置 表单项，详细说明：{@link #FIELD_PSDEFORMDETAILNAME}
     * 
     * @param pSDEFormDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMDETAILNAME)
    public void setPSDEFormDetailName(String pSDEFormDetailName){
        this.set(FIELD_PSDEFORMDETAILNAME, pSDEFormDetailName);
    }
    
    /**
     * 获取 表单项  
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
     * 判断 表单项 是否指定值，包括空值
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
     * 重置 表单项
     */
    @JsonIgnore
    public void resetPSDEFormDetailName(){
        this.reset(FIELD_PSDEFORMDETAILNAME);
    }

    /**
     * 设置 表单项，详细说明：{@link #FIELD_PSDEFORMDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEFormDetailName}
     * @param pSDEFormDetailName
     */
    @JsonIgnore
    public PSDEFIUDetailDTO psdeformdetailname(String pSDEFormDetailName){
        this.setPSDEFormDetailName(pSDEFormDetailName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFormDetailName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFormDetailName(strName);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO name(String strName){
        this.setPSDEFormDetailName(strName);
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
    public PSDEFIUDetailDTO updatedate(Timestamp updateDate){
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
    public PSDEFIUDetailDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSDEFIUDetailId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSDEFIUDetailId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFIUDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFIUDetailId(strValue);
    }

    @JsonIgnore
    public PSDEFIUDetailDTO id(String strValue){
        this.setPSDEFIUDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDEFIUDetailDTO){
            PSDEFIUDetailDTO dto = (PSDEFIUDetailDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
