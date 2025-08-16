package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEFORMRF</B>实体表单引用 模型传输对象
 * <P>
 * 实体表单直接表单部件引用模型，支持引入其它表单或预留运行时的动态表单占位
 */
public class PSDEFormRF extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEFormRF(){
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
    public PSDEFormRF createdate(String createDate){
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
    public PSDEFormRF createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MAJORPSDEFORMID</B>&nbsp;主实体表单，指定表单部件引用的所属表单
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MAJORPSDEFORMID = "majorpsdeformid";

    /**
     * 设置 主实体表单，详细说明：{@link #FIELD_MAJORPSDEFORMID}
     * 
     * @param majorPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEFORMID)
    public void setMajorPSDEFormId(String majorPSDEFormId){
        this.set(FIELD_MAJORPSDEFORMID, majorPSDEFormId);
    }
    
    /**
     * 获取 主实体表单  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEFormId(){
        Object objValue = this.get(FIELD_MAJORPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEFormIdDirty(){
        if(this.contains(FIELD_MAJORPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体表单
     */
    @JsonIgnore
    public void resetMajorPSDEFormId(){
        this.reset(FIELD_MAJORPSDEFORMID);
    }

    /**
     * 设置 主实体表单，详细说明：{@link #FIELD_MAJORPSDEFORMID}
     * <P>
     * 等同 {@link #setMajorPSDEFormId}
     * @param majorPSDEFormId
     */
    @JsonIgnore
    public PSDEFormRF majorpsdeformid(String majorPSDEFormId){
        this.setMajorPSDEFormId(majorPSDEFormId);
        return this;
    }

    /**
     * 设置 主实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMajorPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEFormRF majorpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMajorPSDEFormId(null);
            this.setMajorPSDEFormName(null);
            this.setPSDEId(null);
        }
        else{
            this.setMajorPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMajorPSDEFormName(pSDEForm.getPSDEFormName());
            this.setPSDEId(pSDEForm.getPSDEId());
        }
        return this;
    }

    /**
     * <B>MAJORPSDEFORMNAME</B>&nbsp;主实体表单，指定表单部件引用的所属表单
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEFORMID}
     */
    public final static String FIELD_MAJORPSDEFORMNAME = "majorpsdeformname";

    /**
     * 设置 主实体表单，详细说明：{@link #FIELD_MAJORPSDEFORMNAME}
     * 
     * @param majorPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MAJORPSDEFORMNAME)
    public void setMajorPSDEFormName(String majorPSDEFormName){
        this.set(FIELD_MAJORPSDEFORMNAME, majorPSDEFormName);
    }
    
    /**
     * 获取 主实体表单  
     * @return
     */
    @JsonIgnore
    public String getMajorPSDEFormName(){
        Object objValue = this.get(FIELD_MAJORPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 主实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMajorPSDEFormNameDirty(){
        if(this.contains(FIELD_MAJORPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 主实体表单
     */
    @JsonIgnore
    public void resetMajorPSDEFormName(){
        this.reset(FIELD_MAJORPSDEFORMNAME);
    }

    /**
     * 设置 主实体表单，详细说明：{@link #FIELD_MAJORPSDEFORMNAME}
     * <P>
     * 等同 {@link #setMajorPSDEFormName}
     * @param majorPSDEFormName
     */
    @JsonIgnore
    public PSDEFormRF majorpsdeformname(String majorPSDEFormName){
        this.setMajorPSDEFormName(majorPSDEFormName);
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
    public PSDEFormRF memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MINORPSDEFORMID</B>&nbsp;从实体表单，指定引用的实体表单对象，引用表单与当前表单必须同属一个实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEForm} 
     */
    public final static String FIELD_MINORPSDEFORMID = "minorpsdeformid";

    /**
     * 设置 从实体表单，详细说明：{@link #FIELD_MINORPSDEFORMID}
     * 
     * @param minorPSDEFormId
     * 
     */
    @JsonProperty(FIELD_MINORPSDEFORMID)
    public void setMinorPSDEFormId(String minorPSDEFormId){
        this.set(FIELD_MINORPSDEFORMID, minorPSDEFormId);
    }
    
    /**
     * 获取 从实体表单  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEFormId(){
        Object objValue = this.get(FIELD_MINORPSDEFORMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEFormIdDirty(){
        if(this.contains(FIELD_MINORPSDEFORMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体表单
     */
    @JsonIgnore
    public void resetMinorPSDEFormId(){
        this.reset(FIELD_MINORPSDEFORMID);
    }

    /**
     * 设置 从实体表单，详细说明：{@link #FIELD_MINORPSDEFORMID}
     * <P>
     * 等同 {@link #setMinorPSDEFormId}
     * @param minorPSDEFormId
     */
    @JsonIgnore
    public PSDEFormRF minorpsdeformid(String minorPSDEFormId){
        this.setMinorPSDEFormId(minorPSDEFormId);
        return this;
    }

    /**
     * 设置 从实体表单，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setMinorPSDEFormId}
     * @param pSDEForm 引用对象
     */
    @JsonIgnore
    public PSDEFormRF minorpsdeformid(PSDEForm pSDEForm){
        if(pSDEForm == null){
            this.setMinorPSDEFormId(null);
            this.setMinorPSDEFormName(null);
        }
        else{
            this.setMinorPSDEFormId(pSDEForm.getPSDEFormId());
            this.setMinorPSDEFormName(pSDEForm.getPSDEFormName());
        }
        return this;
    }

    /**
     * <B>MINORPSDEFORMNAME</B>&nbsp;从实体表单，指定引用的实体表单对象，引用表单与当前表单必须同属一个实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MINORPSDEFORMID}
     */
    public final static String FIELD_MINORPSDEFORMNAME = "minorpsdeformname";

    /**
     * 设置 从实体表单，详细说明：{@link #FIELD_MINORPSDEFORMNAME}
     * 
     * @param minorPSDEFormName
     * 
     */
    @JsonProperty(FIELD_MINORPSDEFORMNAME)
    public void setMinorPSDEFormName(String minorPSDEFormName){
        this.set(FIELD_MINORPSDEFORMNAME, minorPSDEFormName);
    }
    
    /**
     * 获取 从实体表单  
     * @return
     */
    @JsonIgnore
    public String getMinorPSDEFormName(){
        Object objValue = this.get(FIELD_MINORPSDEFORMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 从实体表单 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isMinorPSDEFormNameDirty(){
        if(this.contains(FIELD_MINORPSDEFORMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 从实体表单
     */
    @JsonIgnore
    public void resetMinorPSDEFormName(){
        this.reset(FIELD_MINORPSDEFORMNAME);
    }

    /**
     * 设置 从实体表单，详细说明：{@link #FIELD_MINORPSDEFORMNAME}
     * <P>
     * 等同 {@link #setMinorPSDEFormName}
     * @param minorPSDEFormName
     */
    @JsonIgnore
    public PSDEFormRF minorpsdeformname(String minorPSDEFormName){
        this.setMinorPSDEFormName(minorPSDEFormName);
        return this;
    }

    /**
     * <B>PSDEFORMRFID</B>&nbsp;实体表单引用标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEFORMRFID = "psdeformrfid";

    /**
     * 设置 实体表单引用标识
     * 
     * @param pSDEFormRFId
     * 
     */
    @JsonProperty(FIELD_PSDEFORMRFID)
    public void setPSDEFormRFId(String pSDEFormRFId){
        this.set(FIELD_PSDEFORMRFID, pSDEFormRFId);
    }
    
    /**
     * 获取 实体表单引用标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormRFId(){
        Object objValue = this.get(FIELD_PSDEFORMRFID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体表单引用标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormRFIdDirty(){
        if(this.contains(FIELD_PSDEFORMRFID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体表单引用标识
     */
    @JsonIgnore
    public void resetPSDEFormRFId(){
        this.reset(FIELD_PSDEFORMRFID);
    }

    /**
     * 设置 实体表单引用标识
     * <P>
     * 等同 {@link #setPSDEFormRFId}
     * @param pSDEFormRFId
     */
    @JsonIgnore
    public PSDEFormRF psdeformrfid(String pSDEFormRFId){
        this.setPSDEFormRFId(pSDEFormRFId);
        return this;
    }

    /**
     * <B>PSDEFORMRFNAME</B>&nbsp;引用名称，指定引用表单部件的名称，需在所在表单中具备唯一性
     * <P>
     * 字符串：最大长度 20
     */
    public final static String FIELD_PSDEFORMRFNAME = "psdeformrfname";

    /**
     * 设置 引用名称，详细说明：{@link #FIELD_PSDEFORMRFNAME}
     * 
     * @param pSDEFormRFName
     * 
     */
    @JsonProperty(FIELD_PSDEFORMRFNAME)
    public void setPSDEFormRFName(String pSDEFormRFName){
        this.set(FIELD_PSDEFORMRFNAME, pSDEFormRFName);
    }
    
    /**
     * 获取 引用名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEFormRFName(){
        Object objValue = this.get(FIELD_PSDEFORMRFNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEFormRFNameDirty(){
        if(this.contains(FIELD_PSDEFORMRFNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用名称
     */
    @JsonIgnore
    public void resetPSDEFormRFName(){
        this.reset(FIELD_PSDEFORMRFNAME);
    }

    /**
     * 设置 引用名称，详细说明：{@link #FIELD_PSDEFORMRFNAME}
     * <P>
     * 等同 {@link #setPSDEFormRFName}
     * @param pSDEFormRFName
     */
    @JsonIgnore
    public PSDEFormRF psdeformrfname(String pSDEFormRFName){
        this.setPSDEFormRFName(pSDEFormRFName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEFormRFName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEFormRFName(strName);
    }

    @JsonIgnore
    public PSDEFormRF name(String strName){
        this.setPSDEFormRFName(strName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;PSDEID
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_MAJORPSDEFORMID}
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
    public PSDEFormRF psdeid(String pSDEId){
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
    public PSDEFormRF updatedate(String updateDate){
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
    public PSDEFormRF updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEFormRFId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEFormRFId(strValue);
    }

    @JsonIgnore
    public PSDEFormRF id(String strValue){
        this.setPSDEFormRFId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEFormRF){
            PSDEFormRF model = (PSDEFormRF)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
