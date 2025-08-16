package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSUCMAPNODE</B>系统用例图节点 模型传输对象
 * <P>
 * 
 */
public class PSSysUCMapNode extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysUCMapNode(){
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
    public PSSysUCMapNode createdate(String createDate){
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
    public PSSysUCMapNode createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左坐标，指定用例在设计界面的图元的左上角X值，未定义时为【0】
     */
    public final static String FIELD_LEFTPOS = "leftpos";

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * 
     * @param leftPos
     * 
     */
    @JsonProperty(FIELD_LEFTPOS)
    public void setLeftPos(Integer leftPos){
        this.set(FIELD_LEFTPOS, leftPos);
    }
    
    /**
     * 获取 左坐标  
     * @return
     */
    @JsonIgnore
    public Integer getLeftPos(){
        Object objValue = this.get(FIELD_LEFTPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 左坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLeftPosDirty(){
        if(this.contains(FIELD_LEFTPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 左坐标
     */
    @JsonIgnore
    public void resetLeftPos(){
        this.reset(FIELD_LEFTPOS);
    }

    /**
     * 设置 左坐标，详细说明：{@link #FIELD_LEFTPOS}
     * <P>
     * 等同 {@link #setLeftPos}
     * @param leftPos
     */
    @JsonIgnore
    public PSSysUCMapNode leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
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
    public PSSysUCMapNode memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>NODETYPE</B>&nbsp;节点类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.UCMapNodeType} 
     */
    public final static String FIELD_NODETYPE = "nodetype";

    /**
     * 设置 节点类型
     * 
     * @param nodeType
     * 
     */
    @JsonProperty(FIELD_NODETYPE)
    public void setNodeType(String nodeType){
        this.set(FIELD_NODETYPE, nodeType);
    }
    
    /**
     * 获取 节点类型  
     * @return
     */
    @JsonIgnore
    public String getNodeType(){
        Object objValue = this.get(FIELD_NODETYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeTypeDirty(){
        if(this.contains(FIELD_NODETYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点类型
     */
    @JsonIgnore
    public void resetNodeType(){
        this.reset(FIELD_NODETYPE);
    }

    /**
     * 设置 节点类型
     * <P>
     * 等同 {@link #setNodeType}
     * @param nodeType
     */
    @JsonIgnore
    public PSSysUCMapNode nodetype(String nodeType){
        this.setNodeType(nodeType);
        return this;
    }

     /**
     * 设置 节点类型
     * <P>
     * 等同 {@link #setNodeType}
     * @param nodeType
     */
    @JsonIgnore
    public PSSysUCMapNode nodetype(net.ibizsys.psmodel.core.util.PSModelEnums.UCMapNodeType nodeType){
        if(nodeType == null){
            this.setNodeType(null);
        }
        else{
            this.setNodeType(nodeType.value);
        }
        return this;
    }

    /**
     * <B>PSSYSACTORID</B>&nbsp;操作者
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysActor} 
     */
    public final static String FIELD_PSSYSACTORID = "pssysactorid";

    /**
     * 设置 操作者
     * 
     * @param pSSysActorId
     * 
     */
    @JsonProperty(FIELD_PSSYSACTORID)
    public void setPSSysActorId(String pSSysActorId){
        this.set(FIELD_PSSYSACTORID, pSSysActorId);
    }
    
    /**
     * 获取 操作者  
     * @return
     */
    @JsonIgnore
    public String getPSSysActorId(){
        Object objValue = this.get(FIELD_PSSYSACTORID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysActorIdDirty(){
        if(this.contains(FIELD_PSSYSACTORID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作者
     */
    @JsonIgnore
    public void resetPSSysActorId(){
        this.reset(FIELD_PSSYSACTORID);
    }

    /**
     * 设置 操作者
     * <P>
     * 等同 {@link #setPSSysActorId}
     * @param pSSysActorId
     */
    @JsonIgnore
    public PSSysUCMapNode pssysactorid(String pSSysActorId){
        this.setPSSysActorId(pSSysActorId);
        return this;
    }

    /**
     * 设置 操作者，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysActorId}
     * @param pSSysActor 引用对象
     */
    @JsonIgnore
    public PSSysUCMapNode pssysactorid(PSSysActor pSSysActor){
        if(pSSysActor == null){
            this.setPSSysActorId(null);
            this.setPSSysActorName(null);
        }
        else{
            this.setPSSysActorId(pSSysActor.getPSSysActorId());
            this.setPSSysActorName(pSSysActor.getPSSysActorName());
        }
        return this;
    }

    /**
     * <B>PSSYSACTORNAME</B>&nbsp;操作者
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSACTORID}
     */
    public final static String FIELD_PSSYSACTORNAME = "pssysactorname";

    /**
     * 设置 操作者
     * 
     * @param pSSysActorName
     * 
     */
    @JsonProperty(FIELD_PSSYSACTORNAME)
    public void setPSSysActorName(String pSSysActorName){
        this.set(FIELD_PSSYSACTORNAME, pSSysActorName);
    }
    
    /**
     * 获取 操作者  
     * @return
     */
    @JsonIgnore
    public String getPSSysActorName(){
        Object objValue = this.get(FIELD_PSSYSACTORNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作者 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysActorNameDirty(){
        if(this.contains(FIELD_PSSYSACTORNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作者
     */
    @JsonIgnore
    public void resetPSSysActorName(){
        this.reset(FIELD_PSSYSACTORNAME);
    }

    /**
     * 设置 操作者
     * <P>
     * 等同 {@link #setPSSysActorName}
     * @param pSSysActorName
     */
    @JsonIgnore
    public PSSysUCMapNode pssysactorname(String pSSysActorName){
        this.setPSSysActorName(pSSysActorName);
        return this;
    }

    /**
     * <B>PSSYSUCMAPID</B>&nbsp;系统用例图
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUCMap} 
     */
    public final static String FIELD_PSSYSUCMAPID = "pssysucmapid";

    /**
     * 设置 系统用例图
     * 
     * @param pSSysUCMapId
     * 
     */
    @JsonProperty(FIELD_PSSYSUCMAPID)
    public void setPSSysUCMapId(String pSSysUCMapId){
        this.set(FIELD_PSSYSUCMAPID, pSSysUCMapId);
    }
    
    /**
     * 获取 系统用例图  
     * @return
     */
    @JsonIgnore
    public String getPSSysUCMapId(){
        Object objValue = this.get(FIELD_PSSYSUCMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUCMapIdDirty(){
        if(this.contains(FIELD_PSSYSUCMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例图
     */
    @JsonIgnore
    public void resetPSSysUCMapId(){
        this.reset(FIELD_PSSYSUCMAPID);
    }

    /**
     * 设置 系统用例图
     * <P>
     * 等同 {@link #setPSSysUCMapId}
     * @param pSSysUCMapId
     */
    @JsonIgnore
    public PSSysUCMapNode pssysucmapid(String pSSysUCMapId){
        this.setPSSysUCMapId(pSSysUCMapId);
        return this;
    }

    /**
     * 设置 系统用例图，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUCMapId}
     * @param pSSysUCMap 引用对象
     */
    @JsonIgnore
    public PSSysUCMapNode pssysucmapid(PSSysUCMap pSSysUCMap){
        if(pSSysUCMap == null){
            this.setPSSysUCMapId(null);
            this.setPSSysUCMapName(null);
        }
        else{
            this.setPSSysUCMapId(pSSysUCMap.getPSSysUCMapId());
            this.setPSSysUCMapName(pSSysUCMap.getPSSysUCMapName());
        }
        return this;
    }

    /**
     * <B>PSSYSUCMAPNAME</B>&nbsp;系统用例图
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUCMAPID}
     */
    public final static String FIELD_PSSYSUCMAPNAME = "pssysucmapname";

    /**
     * 设置 系统用例图
     * 
     * @param pSSysUCMapName
     * 
     */
    @JsonProperty(FIELD_PSSYSUCMAPNAME)
    public void setPSSysUCMapName(String pSSysUCMapName){
        this.set(FIELD_PSSYSUCMAPNAME, pSSysUCMapName);
    }
    
    /**
     * 获取 系统用例图  
     * @return
     */
    @JsonIgnore
    public String getPSSysUCMapName(){
        Object objValue = this.get(FIELD_PSSYSUCMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例图 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUCMapNameDirty(){
        if(this.contains(FIELD_PSSYSUCMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例图
     */
    @JsonIgnore
    public void resetPSSysUCMapName(){
        this.reset(FIELD_PSSYSUCMAPNAME);
    }

    /**
     * 设置 系统用例图
     * <P>
     * 等同 {@link #setPSSysUCMapName}
     * @param pSSysUCMapName
     */
    @JsonIgnore
    public PSSysUCMapNode pssysucmapname(String pSSysUCMapName){
        this.setPSSysUCMapName(pSSysUCMapName);
        return this;
    }

    /**
     * <B>PSSYSUCMAPNODEID</B>&nbsp;系统用例图节点标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSUCMAPNODEID = "pssysucmapnodeid";

    /**
     * 设置 系统用例图节点标识
     * 
     * @param pSSysUCMapNodeId
     * 
     */
    @JsonProperty(FIELD_PSSYSUCMAPNODEID)
    public void setPSSysUCMapNodeId(String pSSysUCMapNodeId){
        this.set(FIELD_PSSYSUCMAPNODEID, pSSysUCMapNodeId);
    }
    
    /**
     * 获取 系统用例图节点标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysUCMapNodeId(){
        Object objValue = this.get(FIELD_PSSYSUCMAPNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统用例图节点标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUCMapNodeIdDirty(){
        if(this.contains(FIELD_PSSYSUCMAPNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统用例图节点标识
     */
    @JsonIgnore
    public void resetPSSysUCMapNodeId(){
        this.reset(FIELD_PSSYSUCMAPNODEID);
    }

    /**
     * 设置 系统用例图节点标识
     * <P>
     * 等同 {@link #setPSSysUCMapNodeId}
     * @param pSSysUCMapNodeId
     */
    @JsonIgnore
    public PSSysUCMapNode pssysucmapnodeid(String pSSysUCMapNodeId){
        this.setPSSysUCMapNodeId(pSSysUCMapNodeId);
        return this;
    }

    /**
     * <B>PSSYSUCMAPNODENAME</B>&nbsp;节点名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSUCMAPNODENAME = "pssysucmapnodename";

    /**
     * 设置 节点名称
     * 
     * @param pSSysUCMapNodeName
     * 
     */
    @JsonProperty(FIELD_PSSYSUCMAPNODENAME)
    public void setPSSysUCMapNodeName(String pSSysUCMapNodeName){
        this.set(FIELD_PSSYSUCMAPNODENAME, pSSysUCMapNodeName);
    }
    
    /**
     * 获取 节点名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysUCMapNodeName(){
        Object objValue = this.get(FIELD_PSSYSUCMAPNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUCMapNodeNameDirty(){
        if(this.contains(FIELD_PSSYSUCMAPNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点名称
     */
    @JsonIgnore
    public void resetPSSysUCMapNodeName(){
        this.reset(FIELD_PSSYSUCMAPNODENAME);
    }

    /**
     * 设置 节点名称
     * <P>
     * 等同 {@link #setPSSysUCMapNodeName}
     * @param pSSysUCMapNodeName
     */
    @JsonIgnore
    public PSSysUCMapNode pssysucmapnodename(String pSSysUCMapNodeName){
        this.setPSSysUCMapNodeName(pSSysUCMapNodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysUCMapNodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysUCMapNodeName(strName);
    }

    @JsonIgnore
    public PSSysUCMapNode name(String strName){
        this.setPSSysUCMapNodeName(strName);
        return this;
    }

    /**
     * <B>PSSYSUSECASEID</B>&nbsp;操作用例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUseCase} 
     */
    public final static String FIELD_PSSYSUSECASEID = "pssysusecaseid";

    /**
     * 设置 操作用例
     * 
     * @param pSSysUseCaseId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASEID)
    public void setPSSysUseCaseId(String pSSysUseCaseId){
        this.set(FIELD_PSSYSUSECASEID, pSSysUseCaseId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercaseid", pSSysUseCaseId);
    }
    
    /**
     * 获取 操作用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseId(){
        Object objValue = this.get(FIELD_PSSYSUSECASEID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercaseid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 操作用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseIdDirty(){
        if(this.contains(FIELD_PSSYSUSECASEID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercaseid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseId(){
        this.reset(FIELD_PSSYSUSECASEID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercaseid");
    }

    /**
     * 设置 操作用例
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCaseId
     */
    @JsonIgnore
    public PSSysUCMapNode pssysusecaseid(String pSSysUseCaseId){
        this.setPSSysUseCaseId(pSSysUseCaseId);
        return this;
    }

    /**
     * 设置 操作用例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUseCaseId}
     * @param pSSysUseCase 引用对象
     */
    @JsonIgnore
    public PSSysUCMapNode pssysusecaseid(PSSysUseCase pSSysUseCase){
        if(pSSysUseCase == null){
            this.setPSSysUseCaseId(null);
            this.setPSSysUseCaseName(null);
        }
        else{
            this.setPSSysUseCaseId(pSSysUseCase.getPSSysUseCaseId());
            this.setPSSysUseCaseName(pSSysUseCase.getPSSysUseCaseName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseId(){
        return this.getPSSysUseCaseId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseId(String pSSysUserCaseId){
        this.setPSSysUseCaseId(pSSysUserCaseId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseIdDirty(){
        return this.isPSSysUseCaseIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseId(){
        this.resetPSSysUseCaseId();
    }

    /**
     * <B>PSSYSUSECASENAME</B>&nbsp;操作用例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSECASEID}
     */
    public final static String FIELD_PSSYSUSECASENAME = "pssysusecasename";

    /**
     * 设置 操作用例
     * 
     * @param pSSysUseCaseName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSECASENAME)
    public void setPSSysUseCaseName(String pSSysUseCaseName){
        this.set(FIELD_PSSYSUSECASENAME, pSSysUseCaseName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("pssysusercasename", pSSysUseCaseName);
    }
    
    /**
     * 获取 操作用例  
     * @return
     */
    @JsonIgnore
    public String getPSSysUseCaseName(){
        Object objValue = this.get(FIELD_PSSYSUSECASENAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("pssysusercasename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 操作用例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUseCaseNameDirty(){
        if(this.contains(FIELD_PSSYSUSECASENAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("pssysusercasename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作用例
     */
    @JsonIgnore
    public void resetPSSysUseCaseName(){
        this.reset(FIELD_PSSYSUSECASENAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("pssysusercasename");
    }

    /**
     * 设置 操作用例
     * <P>
     * 等同 {@link #setPSSysUseCaseName}
     * @param pSSysUseCaseName
     */
    @JsonIgnore
    public PSSysUCMapNode pssysusecasename(String pSSysUseCaseName){
        this.setPSSysUseCaseName(pSSysUseCaseName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSSysUserCaseName(){
        return this.getPSSysUseCaseName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSSysUserCaseName(String pSSysUserCaseName){
        this.setPSSysUseCaseName(pSSysUserCaseName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSSysUserCaseNameDirty(){
        return this.isPSSysUseCaseNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSSysUserCaseName(){
        this.resetPSSysUseCaseName();
    }

    /**
     * <B>TOPPOS</B>&nbsp;上坐标，指定用例在设计界面的图元的左上角Y值，未定义时为【0】
     */
    public final static String FIELD_TOPPOS = "toppos";

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * 
     * @param topPos
     * 
     */
    @JsonProperty(FIELD_TOPPOS)
    public void setTopPos(Integer topPos){
        this.set(FIELD_TOPPOS, topPos);
    }
    
    /**
     * 获取 上坐标  
     * @return
     */
    @JsonIgnore
    public Integer getTopPos(){
        Object objValue = this.get(FIELD_TOPPOS);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 上坐标 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTopPosDirty(){
        if(this.contains(FIELD_TOPPOS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上坐标
     */
    @JsonIgnore
    public void resetTopPos(){
        this.reset(FIELD_TOPPOS);
    }

    /**
     * 设置 上坐标，详细说明：{@link #FIELD_TOPPOS}
     * <P>
     * 等同 {@link #setTopPos}
     * @param topPos
     */
    @JsonIgnore
    public PSSysUCMapNode toppos(Integer topPos){
        this.setTopPos(topPos);
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
    public PSSysUCMapNode updatedate(String updateDate){
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
    public PSSysUCMapNode updateman(String updateMan){
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
    public PSSysUCMapNode usercat(String userCat){
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
    public PSSysUCMapNode usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysUCMapNode usertag(String userTag){
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
    public PSSysUCMapNode usertag2(String userTag2){
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
    public PSSysUCMapNode usertag3(String userTag3){
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
    public PSSysUCMapNode usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysUCMapNodeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysUCMapNodeId(strValue);
    }

    @JsonIgnore
    public PSSysUCMapNode id(String strValue){
        this.setPSSysUCMapNodeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysUCMapNode){
            PSSysUCMapNode model = (PSSysUCMapNode)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
