package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSDETREENODERV</B>树节点关联视图 模型传输对象
 * <P>
 * 树节点的关联视图模型，树节点内置的处理逻辑会涉及视图的使用，关联视图就是将相关视图按照逻辑约定的标记注册到树节点中供逻辑使用
 */
public class PSDETreeNodeRV extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDETreeNodeRV(){
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
    public PSDETreeNodeRV createdate(String createDate){
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
    public PSDETreeNodeRV createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;备注
     * <P>
     * 字符串：最大长度 4000
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
    public PSDETreeNodeRV memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>PSDETREENODEID</B>&nbsp;树节点，指定树节点关联视图所在的树节点对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDETreeNode} 
     */
    public final static String FIELD_PSDETREENODEID = "psdetreenodeid";

    /**
     * 设置 树节点，详细说明：{@link #FIELD_PSDETREENODEID}
     * 
     * @param pSDETreeNodeId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODEID)
    public void setPSDETreeNodeId(String pSDETreeNodeId){
        this.set(FIELD_PSDETREENODEID, pSDETreeNodeId);
    }
    
    /**
     * 获取 树节点  
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
     * 判断 树节点 是否指定值，包括空值
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
     * 重置 树节点
     */
    @JsonIgnore
    public void resetPSDETreeNodeId(){
        this.reset(FIELD_PSDETREENODEID);
    }

    /**
     * 设置 树节点，详细说明：{@link #FIELD_PSDETREENODEID}
     * <P>
     * 等同 {@link #setPSDETreeNodeId}
     * @param pSDETreeNodeId
     */
    @JsonIgnore
    public PSDETreeNodeRV psdetreenodeid(String pSDETreeNodeId){
        this.setPSDETreeNodeId(pSDETreeNodeId);
        return this;
    }

    /**
     * 设置 树节点，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDETreeNodeId}
     * @param pSDETreeNode 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRV psdetreenodeid(PSDETreeNode pSDETreeNode){
        if(pSDETreeNode == null){
            this.setPSDETreeNodeId(null);
            this.setPSDETreeNodeName(null);
        }
        else{
            this.setPSDETreeNodeId(pSDETreeNode.getPSDETreeNodeId());
            this.setPSDETreeNodeName(pSDETreeNode.getPSDETreeNodeName());
        }
        return this;
    }

    /**
     * <B>PSDETREENODENAME</B>&nbsp;树节点，指定树节点关联视图所在的树节点对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDETREENODEID}
     */
    public final static String FIELD_PSDETREENODENAME = "psdetreenodename";

    /**
     * 设置 树节点，详细说明：{@link #FIELD_PSDETREENODENAME}
     * 
     * @param pSDETreeNodeName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODENAME)
    public void setPSDETreeNodeName(String pSDETreeNodeName){
        this.set(FIELD_PSDETREENODENAME, pSDETreeNodeName);
    }
    
    /**
     * 获取 树节点  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeName(){
        Object objValue = this.get(FIELD_PSDETREENODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeNameDirty(){
        if(this.contains(FIELD_PSDETREENODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点
     */
    @JsonIgnore
    public void resetPSDETreeNodeName(){
        this.reset(FIELD_PSDETREENODENAME);
    }

    /**
     * 设置 树节点，详细说明：{@link #FIELD_PSDETREENODENAME}
     * <P>
     * 等同 {@link #setPSDETreeNodeName}
     * @param pSDETreeNodeName
     */
    @JsonIgnore
    public PSDETreeNodeRV psdetreenodename(String pSDETreeNodeName){
        this.setPSDETreeNodeName(pSDETreeNodeName);
        return this;
    }

    /**
     * <B>PSDETREENODERVID</B>&nbsp;树节点关联视图标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDETREENODERVID = "psdetreenodervid";

    /**
     * 设置 树节点关联视图标识
     * 
     * @param pSDETreeNodeRVId
     * 
     */
    @JsonProperty(FIELD_PSDETREENODERVID)
    public void setPSDETreeNodeRVId(String pSDETreeNodeRVId){
        this.set(FIELD_PSDETREENODERVID, pSDETreeNodeRVId);
    }
    
    /**
     * 获取 树节点关联视图标识  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeRVId(){
        Object objValue = this.get(FIELD_PSDETREENODERVID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 树节点关联视图标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeRVIdDirty(){
        if(this.contains(FIELD_PSDETREENODERVID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 树节点关联视图标识
     */
    @JsonIgnore
    public void resetPSDETreeNodeRVId(){
        this.reset(FIELD_PSDETREENODERVID);
    }

    /**
     * 设置 树节点关联视图标识
     * <P>
     * 等同 {@link #setPSDETreeNodeRVId}
     * @param pSDETreeNodeRVId
     */
    @JsonIgnore
    public PSDETreeNodeRV psdetreenodervid(String pSDETreeNodeRVId){
        this.setPSDETreeNodeRVId(pSDETreeNodeRVId);
        return this;
    }

    /**
     * <B>PSDETREENODERVNAME</B>&nbsp;引用模式，指定树节点关联视图的引用模式，需在所在树节点中具备唯一性
     * <P>
     * 字符串：最大长度 40
     */
    public final static String FIELD_PSDETREENODERVNAME = "psdetreenodervname";

    /**
     * 设置 引用模式，详细说明：{@link #FIELD_PSDETREENODERVNAME}
     * 
     * @param pSDETreeNodeRVName
     * 
     */
    @JsonProperty(FIELD_PSDETREENODERVNAME)
    public void setPSDETreeNodeRVName(String pSDETreeNodeRVName){
        this.set(FIELD_PSDETREENODERVNAME, pSDETreeNodeRVName);
    }
    
    /**
     * 获取 引用模式  
     * @return
     */
    @JsonIgnore
    public String getPSDETreeNodeRVName(){
        Object objValue = this.get(FIELD_PSDETREENODERVNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDETreeNodeRVNameDirty(){
        if(this.contains(FIELD_PSDETREENODERVNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模式
     */
    @JsonIgnore
    public void resetPSDETreeNodeRVName(){
        this.reset(FIELD_PSDETREENODERVNAME);
    }

    /**
     * 设置 引用模式，详细说明：{@link #FIELD_PSDETREENODERVNAME}
     * <P>
     * 等同 {@link #setPSDETreeNodeRVName}
     * @param pSDETreeNodeRVName
     */
    @JsonIgnore
    public PSDETreeNodeRV psdetreenodervname(String pSDETreeNodeRVName){
        this.setPSDETreeNodeRVName(pSDETreeNodeRVName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDETreeNodeRVName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDETreeNodeRVName(strName);
    }

    @JsonIgnore
    public PSDETreeNodeRV name(String strName){
        this.setPSDETreeNodeRVName(strName);
        return this;
    }

    /**
     * <B>PSDEVIEWBASEID</B>&nbsp;实体视图，指定树节点关联视图引用的实体视图对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEViewBase} 
     */
    public final static String FIELD_PSDEVIEWBASEID = "psdeviewbaseid";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * 
     * @param pSDEViewBaseId
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASEID)
    public void setPSDEViewBaseId(String pSDEViewBaseId){
        this.set(FIELD_PSDEVIEWBASEID, pSDEViewBaseId);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseId(){
        Object objValue = this.get(FIELD_PSDEVIEWBASEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseIdDirty(){
        if(this.contains(FIELD_PSDEVIEWBASEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseId(){
        this.reset(FIELD_PSDEVIEWBASEID);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASEID}
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBaseId
     */
    @JsonIgnore
    public PSDETreeNodeRV psdeviewbaseid(String pSDEViewBaseId){
        this.setPSDEViewBaseId(pSDEViewBaseId);
        return this;
    }

    /**
     * 设置 实体视图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEViewBaseId}
     * @param pSDEViewBase 引用对象
     */
    @JsonIgnore
    public PSDETreeNodeRV psdeviewbaseid(PSDEViewBase pSDEViewBase){
        if(pSDEViewBase == null){
            this.setPSDEViewBaseId(null);
            this.setPSDEViewBaseName(null);
        }
        else{
            this.setPSDEViewBaseId(pSDEViewBase.getPSDEViewBaseId());
            this.setPSDEViewBaseName(pSDEViewBase.getPSDEViewBaseName());
        }
        return this;
    }

    /**
     * <B>PSDEVIEWBASENAME</B>&nbsp;实体视图，指定树节点关联视图引用的实体视图对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVIEWBASEID}
     */
    public final static String FIELD_PSDEVIEWBASENAME = "psdeviewbasename";

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * 
     * @param pSDEViewBaseName
     * 
     */
    @JsonProperty(FIELD_PSDEVIEWBASENAME)
    public void setPSDEViewBaseName(String pSDEViewBaseName){
        this.set(FIELD_PSDEVIEWBASENAME, pSDEViewBaseName);
    }
    
    /**
     * 获取 实体视图  
     * @return
     */
    @JsonIgnore
    public String getPSDEViewBaseName(){
        Object objValue = this.get(FIELD_PSDEVIEWBASENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体视图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEViewBaseNameDirty(){
        if(this.contains(FIELD_PSDEVIEWBASENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体视图
     */
    @JsonIgnore
    public void resetPSDEViewBaseName(){
        this.reset(FIELD_PSDEVIEWBASENAME);
    }

    /**
     * 设置 实体视图，详细说明：{@link #FIELD_PSDEVIEWBASENAME}
     * <P>
     * 等同 {@link #setPSDEViewBaseName}
     * @param pSDEViewBaseName
     */
    @JsonIgnore
    public PSDETreeNodeRV psdeviewbasename(String pSDEViewBaseName){
        this.setPSDEViewBaseName(pSDEViewBaseName);
        return this;
    }

    /**
     * <B>REFMODE</B>&nbsp;引用模式，指定树节点关联视图的引用模式，与引用参数一起形成关联视图模式
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_REFMODE = "refmode";

    /**
     * 设置 引用模式，详细说明：{@link #FIELD_REFMODE}
     * 
     * @param refMode
     * 
     */
    @JsonProperty(FIELD_REFMODE)
    public void setRefMode(String refMode){
        this.set(FIELD_REFMODE, refMode);
    }
    
    /**
     * 获取 引用模式  
     * @return
     */
    @JsonIgnore
    public String getRefMode(){
        Object objValue = this.get(FIELD_REFMODE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefModeDirty(){
        if(this.contains(FIELD_REFMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用模式
     */
    @JsonIgnore
    public void resetRefMode(){
        this.reset(FIELD_REFMODE);
    }

    /**
     * 设置 引用模式，详细说明：{@link #FIELD_REFMODE}
     * <P>
     * 等同 {@link #setRefMode}
     * @param refMode
     */
    @JsonIgnore
    public PSDETreeNodeRV refmode(String refMode){
        this.setRefMode(refMode);
        return this;
    }

    /**
     * <B>REFPARAM</B>&nbsp;引用参数，指定树节点关联视图的引用参数，与引用模式一起形成关联视图模式
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REFPARAM = "refparam";

    /**
     * 设置 引用参数，详细说明：{@link #FIELD_REFPARAM}
     * 
     * @param refParam
     * 
     */
    @JsonProperty(FIELD_REFPARAM)
    public void setRefParam(String refParam){
        this.set(FIELD_REFPARAM, refParam);
    }
    
    /**
     * 获取 引用参数  
     * @return
     */
    @JsonIgnore
    public String getRefParam(){
        Object objValue = this.get(FIELD_REFPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefParamDirty(){
        if(this.contains(FIELD_REFPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用参数
     */
    @JsonIgnore
    public void resetRefParam(){
        this.reset(FIELD_REFPARAM);
    }

    /**
     * 设置 引用参数，详细说明：{@link #FIELD_REFPARAM}
     * <P>
     * 等同 {@link #setRefParam}
     * @param refParam
     */
    @JsonIgnore
    public PSDETreeNodeRV refparam(String refParam){
        this.setRefParam(refParam);
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
    public PSDETreeNodeRV updatedate(String updateDate){
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
    public PSDETreeNodeRV updateman(String updateMan){
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
    public PSDETreeNodeRV usercat(String userCat){
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
    public PSDETreeNodeRV usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
     * 字符串：最大长度 100
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
    public PSDETreeNodeRV usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>USERTAG2</B>&nbsp;用户标记2
     * <P>
     * 字符串：最大长度 100
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
    public PSDETreeNodeRV usertag2(String userTag2){
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
    public PSDETreeNodeRV usertag3(String userTag3){
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
    public PSDETreeNodeRV usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VIEWPARAMS</B>&nbsp;视图参数，指定树节点关联视图的动态视图参数，将与视图默认参数合并
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_VIEWPARAMS = "viewparams";

    /**
     * 设置 视图参数，详细说明：{@link #FIELD_VIEWPARAMS}
     * 
     * @param viewParams
     * 
     */
    @JsonProperty(FIELD_VIEWPARAMS)
    public void setViewParams(String viewParams){
        this.set(FIELD_VIEWPARAMS, viewParams);
    }
    
    /**
     * 获取 视图参数  
     * @return
     */
    @JsonIgnore
    public String getViewParams(){
        Object objValue = this.get(FIELD_VIEWPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 视图参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isViewParamsDirty(){
        if(this.contains(FIELD_VIEWPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 视图参数
     */
    @JsonIgnore
    public void resetViewParams(){
        this.reset(FIELD_VIEWPARAMS);
    }

    /**
     * 设置 视图参数，详细说明：{@link #FIELD_VIEWPARAMS}
     * <P>
     * 等同 {@link #setViewParams}
     * @param viewParams
     */
    @JsonIgnore
    public PSDETreeNodeRV viewparams(String viewParams){
        this.setViewParams(viewParams);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDETreeNodeRVId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDETreeNodeRVId(strValue);
    }

    @JsonIgnore
    public PSDETreeNodeRV id(String strValue){
        this.setPSDETreeNodeRVId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDETreeNodeRV){
            PSDETreeNodeRV model = (PSDETreeNodeRV)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
