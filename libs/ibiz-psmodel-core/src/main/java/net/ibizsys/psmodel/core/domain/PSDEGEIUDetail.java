package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDEGEIUDETAIL</B>表格编辑项更新成员 模型传输对象
 * <P>
 * 实体数据表格编辑项更新明细模型，定义了编辑项更新的更新内容明细
 */
public class PSDEGEIUDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEGEIUDetail(){
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
    public PSDEGEIUDetail createdate(String createDate){
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
    public PSDEGEIUDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDEGEIUDETAILID</B>&nbsp;表格编辑项更新成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEGEIUDETAILID = "psdegeiudetailid";

    /**
     * 设置 表格编辑项更新成员标识
     * 
     * @param pSDEGEIUDetailId
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUDETAILID)
    public void setPSDEGEIUDetailId(String pSDEGEIUDetailId){
        this.set(FIELD_PSDEGEIUDETAILID, pSDEGEIUDetailId);
    }
    
    /**
     * 获取 表格编辑项更新成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUDetailId(){
        Object objValue = this.get(FIELD_PSDEGEIUDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编辑项更新成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUDetailIdDirty(){
        if(this.contains(FIELD_PSDEGEIUDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编辑项更新成员标识
     */
    @JsonIgnore
    public void resetPSDEGEIUDetailId(){
        this.reset(FIELD_PSDEGEIUDETAILID);
    }

    /**
     * 设置 表格编辑项更新成员标识
     * <P>
     * 等同 {@link #setPSDEGEIUDetailId}
     * @param pSDEGEIUDetailId
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegeiudetailid(String pSDEGEIUDetailId){
        this.setPSDEGEIUDetailId(pSDEGEIUDetailId);
        return this;
    }

    /**
     * <B>PSDEGEIUDETAILNAME</B>&nbsp;更新成员名称，指定表格编辑项更新明细的名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEGEIUDETAILNAME = "psdegeiudetailname";

    /**
     * 设置 更新成员名称，详细说明：{@link #FIELD_PSDEGEIUDETAILNAME}
     * 
     * @param pSDEGEIUDetailName
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUDETAILNAME)
    public void setPSDEGEIUDetailName(String pSDEGEIUDetailName){
        this.set(FIELD_PSDEGEIUDETAILNAME, pSDEGEIUDetailName);
    }
    
    /**
     * 获取 更新成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUDetailName(){
        Object objValue = this.get(FIELD_PSDEGEIUDETAILNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新成员名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUDetailNameDirty(){
        if(this.contains(FIELD_PSDEGEIUDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新成员名称
     */
    @JsonIgnore
    public void resetPSDEGEIUDetailName(){
        this.reset(FIELD_PSDEGEIUDETAILNAME);
    }

    /**
     * 设置 更新成员名称，详细说明：{@link #FIELD_PSDEGEIUDETAILNAME}
     * <P>
     * 等同 {@link #setPSDEGEIUDetailName}
     * @param pSDEGEIUDetailName
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegeiudetailname(String pSDEGEIUDetailName){
        this.setPSDEGEIUDetailName(pSDEGEIUDetailName);
        return this;
    }

    /**
     * <B>PSDEGEIUPDATEID</B>&nbsp;表格编辑项更新，指定更新明细所属的表格编辑项更新对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGEIUpdate} 
     */
    public final static String FIELD_PSDEGEIUPDATEID = "psdegeiupdateid";

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATEID}
     * 
     * @param pSDEGEIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUPDATEID)
    public void setPSDEGEIUpdateId(String pSDEGEIUpdateId){
        this.set(FIELD_PSDEGEIUPDATEID, pSDEGEIUpdateId);
    }
    
    /**
     * 获取 表格编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUpdateId(){
        Object objValue = this.get(FIELD_PSDEGEIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUpdateIdDirty(){
        if(this.contains(FIELD_PSDEGEIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编辑项更新
     */
    @JsonIgnore
    public void resetPSDEGEIUpdateId(){
        this.reset(FIELD_PSDEGEIUPDATEID);
    }

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATEID}
     * <P>
     * 等同 {@link #setPSDEGEIUpdateId}
     * @param pSDEGEIUpdateId
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegeiupdateid(String pSDEGEIUpdateId){
        this.setPSDEGEIUpdateId(pSDEGEIUpdateId);
        return this;
    }

    /**
     * 设置 表格编辑项更新，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGEIUpdateId}
     * @param pSDEGEIUpdate 引用对象
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegeiupdateid(PSDEGEIUpdate pSDEGEIUpdate){
        if(pSDEGEIUpdate == null){
            this.setPSDEGEIUpdateId(null);
            this.setPSDEGEIUpdateName(null);
        }
        else{
            this.setPSDEGEIUpdateId(pSDEGEIUpdate.getPSDEGEIUpdateId());
            this.setPSDEGEIUpdateName(pSDEGEIUpdate.getPSDEGEIUpdateName());
        }
        return this;
    }

    /**
     * <B>PSDEGEIUPDATENAME</B>&nbsp;表格编辑项更新，指定更新明细所属的表格编辑项更新对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGEIUPDATEID}
     */
    public final static String FIELD_PSDEGEIUPDATENAME = "psdegeiupdatename";

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATENAME}
     * 
     * @param pSDEGEIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDEGEIUPDATENAME)
    public void setPSDEGEIUpdateName(String pSDEGEIUpdateName){
        this.set(FIELD_PSDEGEIUPDATENAME, pSDEGEIUpdateName);
    }
    
    /**
     * 获取 表格编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDEGEIUpdateName(){
        Object objValue = this.get(FIELD_PSDEGEIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 表格编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEGEIUpdateNameDirty(){
        if(this.contains(FIELD_PSDEGEIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 表格编辑项更新
     */
    @JsonIgnore
    public void resetPSDEGEIUpdateName(){
        this.reset(FIELD_PSDEGEIUPDATENAME);
    }

    /**
     * 设置 表格编辑项更新，详细说明：{@link #FIELD_PSDEGEIUPDATENAME}
     * <P>
     * 等同 {@link #setPSDEGEIUpdateName}
     * @param pSDEGEIUpdateName
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegeiupdatename(String pSDEGEIUpdateName){
        this.setPSDEGEIUpdateName(pSDEGEIUpdateName);
        return this;
    }

    /**
     * <B>PSDEGRIDCOLID</B>&nbsp;编辑列，指定表格编辑项更新明细指向的编辑项
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGridCol} 
     */
    public final static String FIELD_PSDEGRIDCOLID = "psdegridcolid";

    /**
     * 设置 编辑列，详细说明：{@link #FIELD_PSDEGRIDCOLID}
     * 
     * @param pSDEGridColId
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDCOLID)
    public void setPSDEGridColId(String pSDEGridColId){
        this.set(FIELD_PSDEGRIDCOLID, pSDEGridColId);
    }
    
    /**
     * 获取 编辑列  
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
     * 判断 编辑列 是否指定值，包括空值
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
     * 重置 编辑列
     */
    @JsonIgnore
    public void resetPSDEGridColId(){
        this.reset(FIELD_PSDEGRIDCOLID);
    }

    /**
     * 设置 编辑列，详细说明：{@link #FIELD_PSDEGRIDCOLID}
     * <P>
     * 等同 {@link #setPSDEGridColId}
     * @param pSDEGridColId
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegridcolid(String pSDEGridColId){
        this.setPSDEGridColId(pSDEGridColId);
        return this;
    }

    /**
     * 设置 编辑列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEGridColId}
     * @param pSDEGridCol 引用对象
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegridcolid(PSDEGridCol pSDEGridCol){
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
     * <B>PSDEGRIDCOLNAME</B>&nbsp;编辑列，指定表格编辑项更新明细指向的编辑项
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDCOLID}
     */
    public final static String FIELD_PSDEGRIDCOLNAME = "psdegridcolname";

    /**
     * 设置 编辑列，详细说明：{@link #FIELD_PSDEGRIDCOLNAME}
     * 
     * @param pSDEGridColName
     * 
     */
    @JsonProperty(FIELD_PSDEGRIDCOLNAME)
    public void setPSDEGridColName(String pSDEGridColName){
        this.set(FIELD_PSDEGRIDCOLNAME, pSDEGridColName);
    }
    
    /**
     * 获取 编辑列  
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
     * 判断 编辑列 是否指定值，包括空值
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
     * 重置 编辑列
     */
    @JsonIgnore
    public void resetPSDEGridColName(){
        this.reset(FIELD_PSDEGRIDCOLNAME);
    }

    /**
     * 设置 编辑列，详细说明：{@link #FIELD_PSDEGRIDCOLNAME}
     * <P>
     * 等同 {@link #setPSDEGridColName}
     * @param pSDEGridColName
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegridcolname(String pSDEGridColName){
        this.setPSDEGridColName(pSDEGridColName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEGridColName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEGridColName(strName);
    }

    @JsonIgnore
    public PSDEGEIUDetail name(String strName){
        this.setPSDEGridColName(strName);
        return this;
    }

    /**
     * <B>PSDEGRIDID</B>&nbsp;实体表格
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEGrid} 
     */
    public final static String FIELD_PSDEGRIDID = "psdegridid";

    /**
     * 设置 实体表格
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
     * 设置 实体表格
     * <P>
     * 等同 {@link #setPSDEGridId}
     * @param pSDEGridId
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegridid(String pSDEGridId){
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
    public PSDEGEIUDetail psdegridid(PSDEGrid pSDEGrid){
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
     * <B>PSDEGRIDNAME</B>&nbsp;实体表格
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEGRIDID}
     */
    public final static String FIELD_PSDEGRIDNAME = "psdegridname";

    /**
     * 设置 实体表格
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
     * 设置 实体表格
     * <P>
     * 等同 {@link #setPSDEGridName}
     * @param pSDEGridName
     */
    @JsonIgnore
    public PSDEGEIUDetail psdegridname(String pSDEGridName){
        this.setPSDEGridName(pSDEGridName);
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
    public PSDEGEIUDetail updatedate(String updateDate){
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
    public PSDEGEIUDetail updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEGEIUDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEGEIUDetailId(strValue);
    }

    @JsonIgnore
    public PSDEGEIUDetail id(String strValue){
        this.setPSDEGEIUDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEGEIUDetail){
            PSDEGEIUDetail model = (PSDEGEIUDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
