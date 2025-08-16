package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDETEIUDETAIL</B>树表编辑项更新成员 模型传输对象
 * <P>
 * 
 */
public class PSDETEIUDetail extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETEIUDetail(){
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
    public PSDETEIUDetail createdate(String createDate){
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
    public PSDETEIUDetail createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>PSDETEIUDETAILID</B>&nbsp;更新成员标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETEIUDETAILID = "psdeteiudetailid";

    /**
     * 设置 更新成员标识
     * 
     * @param pSDETEIUDetailId
     * 
     */
    @JsonProperty(FIELD_PSDETEIUDETAILID)
    public void setPSDETEIUDetailId(String pSDETEIUDetailId){
        this.set(FIELD_PSDETEIUDETAILID, pSDETEIUDetailId);
    }
    
    /**
     * 获取 更新成员标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETEIUDetailId(){
        Object objValue = this.get(FIELD_PSDETEIUDETAILID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 更新成员标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETEIUDetailIdDirty(){
        if(this.contains(FIELD_PSDETEIUDETAILID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新成员标识
     */
    @JsonIgnore
    public void resetPSDETEIUDetailId(){
        this.reset(FIELD_PSDETEIUDETAILID);
    }

    /**
     * 设置 更新成员标识
     * <P>
     * 等同 {@link #setPSDETEIUDetailId}
     * @param pSDETEIUDetailId
     */
    @JsonIgnore
    public PSDETEIUDetail psdeteiudetailid(String pSDETEIUDetailId){
        this.setPSDETEIUDetailId(pSDETEIUDetailId);
        return this;
    }

    /**
     * <B>PSDETEIUDETAILNAME</B>&nbsp;更新成员名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDETEIUDETAILNAME = "psdeteiudetailname";

    /**
     * 设置 更新成员名称
     * 
     * @param pSDETEIUDetailName
     * 
     */
    @JsonProperty(FIELD_PSDETEIUDETAILNAME)
    public void setPSDETEIUDetailName(String pSDETEIUDetailName){
        this.set(FIELD_PSDETEIUDETAILNAME, pSDETEIUDetailName);
    }
    
    /**
     * 获取 更新成员名称  
     * @return
     */
    @JsonIgnore
    public String getPSDETEIUDetailName(){
        Object objValue = this.get(FIELD_PSDETEIUDETAILNAME);
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
    public boolean isPSDETEIUDetailNameDirty(){
        if(this.contains(FIELD_PSDETEIUDETAILNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 更新成员名称
     */
    @JsonIgnore
    public void resetPSDETEIUDetailName(){
        this.reset(FIELD_PSDETEIUDETAILNAME);
    }

    /**
     * 设置 更新成员名称
     * <P>
     * 等同 {@link #setPSDETEIUDetailName}
     * @param pSDETEIUDetailName
     */
    @JsonIgnore
    public PSDETEIUDetail psdeteiudetailname(String pSDETEIUDetailName){
        this.setPSDETEIUDetailName(pSDETEIUDetailName);
        return this;
    }

    /**
     * <B>PSDETEIUPDATEID</B>&nbsp;树表编辑项更新
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETEIUpdate} 
     */
    public final static String FIELD_PSDETEIUPDATEID = "psdeteiupdateid";

    /**
     * 设置 树表编辑项更新
     * 
     * @param pSDETEIUpdateId
     * 
     */
    @JsonProperty(FIELD_PSDETEIUPDATEID)
    public void setPSDETEIUpdateId(String pSDETEIUpdateId){
        this.set(FIELD_PSDETEIUPDATEID, pSDETEIUpdateId);
    }
    
    /**
     * 获取 树表编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDETEIUpdateId(){
        Object objValue = this.get(FIELD_PSDETEIUPDATEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETEIUpdateIdDirty(){
        if(this.contains(FIELD_PSDETEIUPDATEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表编辑项更新
     */
    @JsonIgnore
    public void resetPSDETEIUpdateId(){
        this.reset(FIELD_PSDETEIUPDATEID);
    }

    /**
     * 设置 树表编辑项更新
     * <P>
     * 等同 {@link #setPSDETEIUpdateId}
     * @param pSDETEIUpdateId
     */
    @JsonIgnore
    public PSDETEIUDetail psdeteiupdateid(String pSDETEIUpdateId){
        this.setPSDETEIUpdateId(pSDETEIUpdateId);
        return this;
    }

    /**
     * 设置 树表编辑项更新，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETEIUpdateId}
     * @param pSDETEIUpdate 引用对象
     */
    @JsonIgnore
    public PSDETEIUDetail psdeteiupdateid(PSDETEIUpdate pSDETEIUpdate){
        if(pSDETEIUpdate == null){
            this.setPSDETEIUpdateId(null);
            this.setPSDETEIUpdateName(null);
            this.setPSDETreeNodeId(null);
        }
        else{
            this.setPSDETEIUpdateId(pSDETEIUpdate.getPSDETEIUpdateId());
            this.setPSDETEIUpdateName(pSDETEIUpdate.getPSDETEIUpdateName());
            this.setPSDETreeNodeId(pSDETEIUpdate.getPSDETreeNodeId());
        }
        return this;
    }

    /**
     * <B>PSDETEIUPDATENAME</B>&nbsp;树表编辑项更新
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETEIUPDATEID}
     */
    public final static String FIELD_PSDETEIUPDATENAME = "psdeteiupdatename";

    /**
     * 设置 树表编辑项更新
     * 
     * @param pSDETEIUpdateName
     * 
     */
    @JsonProperty(FIELD_PSDETEIUPDATENAME)
    public void setPSDETEIUpdateName(String pSDETEIUpdateName){
        this.set(FIELD_PSDETEIUPDATENAME, pSDETEIUpdateName);
    }
    
    /**
     * 获取 树表编辑项更新  
     * @return
     */
    @JsonIgnore
    public String getPSDETEIUpdateName(){
        Object objValue = this.get(FIELD_PSDETEIUPDATENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树表编辑项更新 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETEIUpdateNameDirty(){
        if(this.contains(FIELD_PSDETEIUPDATENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树表编辑项更新
     */
    @JsonIgnore
    public void resetPSDETEIUpdateName(){
        this.reset(FIELD_PSDETEIUPDATENAME);
    }

    /**
     * 设置 树表编辑项更新
     * <P>
     * 等同 {@link #setPSDETEIUpdateName}
     * @param pSDETEIUpdateName
     */
    @JsonIgnore
    public PSDETEIUDetail psdeteiupdatename(String pSDETEIUpdateName){
        this.setPSDETEIUpdateName(pSDETEIUpdateName);
        return this;
    }

    /**
     * <B>PSDETREENODECOLID</B>&nbsp;树节点编辑列
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeNodeCol} 
     */
    public final static String FIELD_PSDETREENODECOLID = "psdetreenodecolid";

    /**
     * 设置 树节点编辑列
     * 
     * @param pSDETreeNodeColId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODECOLID)
    public void setPSDETreeNodeColId(String pSDETreeNodeColId){
        this.set(FIELD_PSDETREENODECOLID, pSDETreeNodeColId);
    }
    
    /**
     * 获取 树节点编辑列  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeColId(){
        Object objValue = this.get(FIELD_PSDETREENODECOLID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点编辑列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeColIdDirty(){
        if(this.contains(FIELD_PSDETREENODECOLID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点编辑列
     */
    @JsonIgnore
    public void resetPSDETreeNodeColId(){
        this.reset(FIELD_PSDETREENODECOLID);
    }

    /**
     * 设置 树节点编辑列
     * <P>
     * 等同 {@link #setPSDETreeNodeColId}
     * @param pSDETreeNodeColId
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreenodecolid(String pSDETreeNodeColId){
        this.setPSDETreeNodeColId(pSDETreeNodeColId);
        return this;
    }

    /**
     * 设置 树节点编辑列，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeNodeColId}
     * @param pSDETreeNodeCol 引用对象
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreenodecolid(PSDETreeNodeCol pSDETreeNodeCol){
        if(pSDETreeNodeCol == null){
            this.setPSDETreeNodeColId(null);
            this.setPSDETreeNodeColName(null);
        }
        else{
            this.setPSDETreeNodeColId(pSDETreeNodeCol.getPSDETreeNodeColId());
            this.setPSDETreeNodeColName(pSDETreeNodeCol.getPSDETreeNodeColName());
        }
        return this;
    }

    /**
     * <B>PSDETREENODECOLNAME</B>&nbsp;树节点编辑列
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREENODECOLID}
     */
    public final static String FIELD_PSDETREENODECOLNAME = "psdetreenodecolname";

    /**
     * 设置 树节点编辑列
     * 
     * @param pSDETreeNodeColName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODECOLNAME)
    public void setPSDETreeNodeColName(String pSDETreeNodeColName){
        this.set(FIELD_PSDETREENODECOLNAME, pSDETreeNodeColName);
    }
    
    /**
     * 获取 树节点编辑列  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeColName(){
        Object objValue = this.get(FIELD_PSDETREENODECOLNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点编辑列 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeColNameDirty(){
        if(this.contains(FIELD_PSDETREENODECOLNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点编辑列
     */
    @JsonIgnore
    public void resetPSDETreeNodeColName(){
        this.reset(FIELD_PSDETREENODECOLNAME);
    }

    /**
     * 设置 树节点编辑列
     * <P>
     * 等同 {@link #setPSDETreeNodeColName}
     * @param pSDETreeNodeColName
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreenodecolname(String pSDETreeNodeColName){
        this.setPSDETreeNodeColName(pSDETreeNodeColName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeNodeColName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeNodeColName(strName);
    }

    @JsonIgnore
    public PSDETEIUDetail name(String strName){
        this.setPSDETreeNodeColName(strName);
        return this;
    }

    /**
     * <B>PSDETREENODEID</B>&nbsp;树节点标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETEIUPDATEID}
     */
    public final static String FIELD_PSDETREENODEID = "psdetreenodeid";

    /**
     * 设置 树节点标识
     * 
     * @param pSDETreeNodeId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODEID)
    public void setPSDETreeNodeId(String pSDETreeNodeId){
        this.set(FIELD_PSDETREENODEID, pSDETreeNodeId);
    }
    
    /**
     * 获取 树节点标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeId(){
        Object objValue = this.get(FIELD_PSDETREENODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeIdDirty(){
        if(this.contains(FIELD_PSDETREENODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点标识
     */
    @JsonIgnore
    public void resetPSDETreeNodeId(){
        this.reset(FIELD_PSDETREENODEID);
    }

    /**
     * 设置 树节点标识
     * <P>
     * 等同 {@link #setPSDETreeNodeId}
     * @param pSDETreeNodeId
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreenodeid(String pSDETreeNodeId){
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    /**
     * <B>PSDETREEVIEWID</B>&nbsp;实体树实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeView} 
     */
    public final static String FIELD_PSDETREEVIEWID = "psdetreeviewid";

    /**
     * 设置 实体树实体
     * 
     * @param pSDETreeViewId
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWID)
    public void setPSDETreeViewId(String pSDETreeViewId){
        this.set(FIELD_PSDETREEVIEWID, pSDETreeViewId);
    }
    
    /**
     * 获取 实体树实体  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewId(){
        Object objValue = this.get(FIELD_PSDETREEVIEWID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewIdDirty(){
        if(this.contains(FIELD_PSDETREEVIEWID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树实体
     */
    @JsonIgnore
    public void resetPSDETreeViewId(){
        this.reset(FIELD_PSDETREEVIEWID);
    }

    /**
     * 设置 实体树实体
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeViewId
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreeviewid(String pSDETreeViewId){
        this.setPSDETreeViewId(pSDETreeViewId);
        return this;
    }

    /**
     * 设置 实体树实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeViewId}
     * @param pSDETreeView 引用对象
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreeviewid(PSDETreeView pSDETreeView){
        if(pSDETreeView == null){
            this.setPSDETreeViewId(null);
            this.setPSDETreeViewName(null);
        }
        else{
            this.setPSDETreeViewId(pSDETreeView.getPSDETreeViewId());
            this.setPSDETreeViewName(pSDETreeView.getPSDETreeViewName());
        }
        return this;
    }

    /**
     * <B>PSDETREEVIEWNAME</B>&nbsp;实体树实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREEVIEWID}
     */
    public final static String FIELD_PSDETREEVIEWNAME = "psdetreeviewname";

    /**
     * 设置 实体树实体
     * 
     * @param pSDETreeViewName
     * 
     */
    @JsonProperty(FIELD_PSDETREEVIEWNAME)
    public void setPSDETreeViewName(String pSDETreeViewName){
        this.set(FIELD_PSDETREEVIEWNAME, pSDETreeViewName);
    }
    
    /**
     * 获取 实体树实体  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeViewName(){
        Object objValue = this.get(FIELD_PSDETREEVIEWNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体树实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeViewNameDirty(){
        if(this.contains(FIELD_PSDETREEVIEWNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体树实体
     */
    @JsonIgnore
    public void resetPSDETreeViewName(){
        this.reset(FIELD_PSDETREEVIEWNAME);
    }

    /**
     * 设置 实体树实体
     * <P>
     * 等同 {@link #setPSDETreeViewName}
     * @param pSDETreeViewName
     */
    @JsonIgnore
    public PSDETEIUDetail psdetreeviewname(String pSDETreeViewName){
        this.setPSDETreeViewName(pSDETreeViewName);
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
    public PSDETEIUDetail updatedate(String updateDate){
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
    public PSDETEIUDetail updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDETEIUDetailId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETEIUDetailId(strValue);
    }

    @JsonIgnore
    public PSDETEIUDetail id(String strValue){
        this.setPSDETEIUDetailId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETEIUDetail){
            PSDETEIUDetail model = (PSDETEIUDetail)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
