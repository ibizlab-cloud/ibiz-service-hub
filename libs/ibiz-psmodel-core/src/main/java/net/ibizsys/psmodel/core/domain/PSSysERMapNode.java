package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSERMAPNODE</B>系统ER图节点 模型传输对象
 * <P>
 * 
 */
public class PSSysERMapNode extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysERMapNode(){
    }      

    /**
     * <B>COLOR</B>&nbsp;实体颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 设置 实体颜色
     * 
     * @param color
     * 
     */
    @JsonProperty(FIELD_COLOR)
    public void setColor(String color){
        this.set(FIELD_COLOR, color);
    }
    
    /**
     * 获取 实体颜色  
     * @return
     */
    @JsonIgnore
    public String getColor(){
        Object objValue = this.get(FIELD_COLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isColorDirty(){
        if(this.contains(FIELD_COLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体颜色
     */
    @JsonIgnore
    public void resetColor(){
        this.reset(FIELD_COLOR);
    }

    /**
     * 设置 实体颜色
     * <P>
     * 等同 {@link #setColor}
     * @param color
     */
    @JsonIgnore
    public PSSysERMapNode color(String color){
        this.setColor(color);
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
    public PSSysERMapNode createdate(String createDate){
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
    public PSSysERMapNode createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DETAILMODE</B>&nbsp;明细模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DETAILMODE = "detailmode";

    /**
     * 设置 明细模式
     * 
     * @param detailMode
     * 
     */
    @JsonProperty(FIELD_DETAILMODE)
    public void setDetailMode(Integer detailMode){
        this.set(FIELD_DETAILMODE, detailMode);
    }
    
    /**
     * 获取 明细模式  
     * @return
     */
    @JsonIgnore
    public Integer getDetailMode(){
        Object objValue = this.get(FIELD_DETAILMODE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 明细模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDetailModeDirty(){
        if(this.contains(FIELD_DETAILMODE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 明细模式
     */
    @JsonIgnore
    public void resetDetailMode(){
        this.reset(FIELD_DETAILMODE);
    }

    /**
     * 设置 明细模式
     * <P>
     * 等同 {@link #setDetailMode}
     * @param detailMode
     */
    @JsonIgnore
    public PSSysERMapNode detailmode(Integer detailMode){
        this.setDetailMode(detailMode);
        return this;
    }

     /**
     * 设置 明细模式
     * <P>
     * 等同 {@link #setDetailMode}
     * @param detailMode
     */
    @JsonIgnore
    public PSSysERMapNode detailmode(Boolean detailMode){
        if(detailMode == null){
            this.setDetailMode(null);
        }
        else{
            this.setDetailMode(detailMode?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>LEFTPOS</B>&nbsp;左坐标，指定实体对象在设计界面的图元的左上角X值，未定义时为【0】
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
    public PSSysERMapNode leftpos(Integer leftPos){
        this.setLeftPos(leftPos);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称
     * 
     * @param logicName
     * 
     */
    @JsonProperty(FIELD_LOGICNAME)
    public void setLogicName(String logicName){
        this.set(FIELD_LOGICNAME, logicName);
    }
    
    /**
     * 获取 逻辑名称  
     * @return
     */
    @JsonIgnore
    public String getLogicName(){
        Object objValue = this.get(FIELD_LOGICNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 逻辑名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLogicNameDirty(){
        if(this.contains(FIELD_LOGICNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 逻辑名称
     */
    @JsonIgnore
    public void resetLogicName(){
        this.reset(FIELD_LOGICNAME);
    }

    /**
     * 设置 逻辑名称
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysERMapNode logicname(String logicName){
        this.setLogicName(logicName);
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
    public PSSysERMapNode memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODCOLOR</B>&nbsp;模块颜色
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_MODCOLOR = "modcolor";

    /**
     * 设置 模块颜色
     * 
     * @param modColor
     * 
     */
    @JsonProperty(FIELD_MODCOLOR)
    public void setModColor(String modColor){
        this.set(FIELD_MODCOLOR, modColor);
    }
    
    /**
     * 获取 模块颜色  
     * @return
     */
    @JsonIgnore
    public String getModColor(){
        Object objValue = this.get(FIELD_MODCOLOR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块颜色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModColorDirty(){
        if(this.contains(FIELD_MODCOLOR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块颜色
     */
    @JsonIgnore
    public void resetModColor(){
        this.reset(FIELD_MODCOLOR);
    }

    /**
     * 设置 模块颜色
     * <P>
     * 等同 {@link #setModColor}
     * @param modColor
     */
    @JsonIgnore
    public PSSysERMapNode modcolor(String modColor){
        this.setModColor(modColor);
        return this;
    }

    /**
     * <B>NODETAG</B>&nbsp;节点标记
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NODETAG = "nodetag";

    /**
     * 设置 节点标记
     * 
     * @param nodeTag
     * 
     */
    @JsonProperty(FIELD_NODETAG)
    public void setNodeTag(String nodeTag){
        this.set(FIELD_NODETAG, nodeTag);
    }
    
    /**
     * 获取 节点标记  
     * @return
     */
    @JsonIgnore
    public String getNodeTag(){
        Object objValue = this.get(FIELD_NODETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点标记 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeTagDirty(){
        if(this.contains(FIELD_NODETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点标记
     */
    @JsonIgnore
    public void resetNodeTag(){
        this.reset(FIELD_NODETAG);
    }

    /**
     * 设置 节点标记
     * <P>
     * 等同 {@link #setNodeTag}
     * @param nodeTag
     */
    @JsonIgnore
    public PSSysERMapNode nodetag(String nodeTag){
        this.setNodeTag(nodeTag);
        return this;
    }

    /**
     * <B>NODETAG2</B>&nbsp;节点标记2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_NODETAG2 = "nodetag2";

    /**
     * 设置 节点标记2
     * 
     * @param nodeTag2
     * 
     */
    @JsonProperty(FIELD_NODETAG2)
    public void setNodeTag2(String nodeTag2){
        this.set(FIELD_NODETAG2, nodeTag2);
    }
    
    /**
     * 获取 节点标记2  
     * @return
     */
    @JsonIgnore
    public String getNodeTag2(){
        Object objValue = this.get(FIELD_NODETAG2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 节点标记2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isNodeTag2Dirty(){
        if(this.contains(FIELD_NODETAG2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 节点标记2
     */
    @JsonIgnore
    public void resetNodeTag2(){
        this.reset(FIELD_NODETAG2);
    }

    /**
     * 设置 节点标记2
     * <P>
     * 等同 {@link #setNodeTag2}
     * @param nodeTag2
     */
    @JsonIgnore
    public PSSysERMapNode nodetag2(String nodeTag2){
        this.setNodeTag2(nodeTag2);
        return this;
    }

    /**
     * <B>NODETYPE</B>&nbsp;节点类型
     * <P>
     * 字符串：最大长度 30
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
    public PSSysERMapNode nodetype(String nodeType){
        this.setNodeType(nodeType);
        return this;
    }

    /**
     * <B>PSAPPDATAENTITYID</B>&nbsp;应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSAppDataEntity} 
     */
    public final static String FIELD_PSAPPDATAENTITYID = "psappdataentityid";

    /**
     * 设置 应用实体
     * 
     * @param pSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYID)
    public void setPSAppDataEntityId(String pSAppDataEntityId){
        this.set(FIELD_PSAPPDATAENTITYID, pSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldeid", pSAppDataEntityId);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldeid");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityId(){
        this.reset(FIELD_PSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldeid");
    }

    /**
     * 设置 应用实体
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntityId
     */
    @JsonIgnore
    public PSSysERMapNode psappdataentityid(String pSAppDataEntityId){
        this.setPSAppDataEntityId(pSAppDataEntityId);
        return this;
    }

    /**
     * 设置 应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode psappdataentityid(PSAppDataEntity pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPSAppDataEntityId(null);
            this.setPSAppDataEntityName(null);
        }
        else{
            this.setPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEId(){
        return this.getPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEId(String pSAppLocalDEId){
        this.setPSAppDataEntityId(pSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDEIdDirty(){
        return this.isPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEId(){
        this.resetPSAppDataEntityId();
    }

    /**
     * <B>PSAPPDATAENTITYNAME</B>&nbsp;应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSAPPDATAENTITYID}
     */
    public final static String FIELD_PSAPPDATAENTITYNAME = "psappdataentityname";

    /**
     * 设置 应用实体
     * 
     * @param pSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PSAPPDATAENTITYNAME)
    public void setPSAppDataEntityName(String pSAppDataEntityName){
        this.set(FIELD_PSAPPDATAENTITYNAME, pSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("psapplocaldename", pSAppDataEntityName);
    }
    
    /**
     * 获取 应用实体  
     * @return
     */
    @JsonIgnore
    public String getPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("psapplocaldename");
            if(objValue == null){
                return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("psapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体
     */
    @JsonIgnore
    public void resetPSAppDataEntityName(){
        this.reset(FIELD_PSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("psapplocaldename");
    }

    /**
     * 设置 应用实体
     * <P>
     * 等同 {@link #setPSAppDataEntityName}
     * @param pSAppDataEntityName
     */
    @JsonIgnore
    public PSSysERMapNode psappdataentityname(String pSAppDataEntityName){
        this.setPSAppDataEntityName(pSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPSAppLocalDEName(){
        return this.getPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPSAppLocalDEName(String pSAppLocalDEName){
        this.setPSAppDataEntityName(pSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPSAppLocalDENameDirty(){
        return this.isPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPSAppLocalDEName(){
        this.resetPSAppDataEntityName();
    }

    /**
     * <B>PSDEID</B>&nbsp;实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
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
    public PSSysERMapNode psdeid(String pSDEId){
        this.setPSDEId(pSDEId);
        return this;
    }

    /**
     * 设置 实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDataEntity 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setColor(null);
            this.setLogicName(null);
            this.setModColor(null);
            this.setPSDEId(null);
            this.setPSDEName(null);
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        }
        else{
            this.setColor(pSDataEntity.getColor());
            this.setLogicName(pSDataEntity.getLogicName());
            this.setModColor(pSDataEntity.getModColor());
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
            this.setPSModuleId(pSDataEntity.getPSModuleId());
            this.setPSModuleName(pSDataEntity.getPSModuleName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体
     * 
     * @param pSDEName
     * 
     */
    @JsonProperty(FIELD_PSDENAME)
    public void setPSDEName(String pSDEName){
        this.set(FIELD_PSDENAME, pSDEName);
    }
    
    /**
     * 获取 实体  
     * @return
     */
    @JsonIgnore
    public String getPSDEName(){
        Object objValue = this.get(FIELD_PSDENAME);
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
    public boolean isPSDENameDirty(){
        if(this.contains(FIELD_PSDENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体
     */
    @JsonIgnore
    public void resetPSDEName(){
        this.reset(FIELD_PSDENAME);
    }

    /**
     * 设置 实体
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSSysERMapNode psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDESERVICEAPIID</B>&nbsp;实体服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEServiceAPI} 
     */
    public final static String FIELD_PSDESERVICEAPIID = "psdeserviceapiid";

    /**
     * 设置 实体服务接口
     * 
     * @param pSDEServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPIID)
    public void setPSDEServiceAPIId(String pSDEServiceAPIId){
        this.set(FIELD_PSDESERVICEAPIID, pSDEServiceAPIId);
    }
    
    /**
     * 获取 实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSDEServiceAPIId(){
        Object objValue = this.get(FIELD_PSDESERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEServiceAPIIdDirty(){
        if(this.contains(FIELD_PSDESERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体服务接口
     */
    @JsonIgnore
    public void resetPSDEServiceAPIId(){
        this.reset(FIELD_PSDESERVICEAPIID);
    }

    /**
     * 设置 实体服务接口
     * <P>
     * 等同 {@link #setPSDEServiceAPIId}
     * @param pSDEServiceAPIId
     */
    @JsonIgnore
    public PSSysERMapNode psdeserviceapiid(String pSDEServiceAPIId){
        this.setPSDEServiceAPIId(pSDEServiceAPIId);
        return this;
    }

    /**
     * 设置 实体服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEServiceAPIId}
     * @param pSDEServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode psdeserviceapiid(PSDEServiceAPI pSDEServiceAPI){
        if(pSDEServiceAPI == null){
            this.setPSDEServiceAPIId(null);
            this.setPSDEServiceAPIName(null);
        }
        else{
            this.setPSDEServiceAPIId(pSDEServiceAPI.getPSDEServiceAPIId());
            this.setPSDEServiceAPIName(pSDEServiceAPI.getPSDEServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSDESERVICEAPINAME</B>&nbsp;实体服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDESERVICEAPIID}
     */
    public final static String FIELD_PSDESERVICEAPINAME = "psdeserviceapiname";

    /**
     * 设置 实体服务接口
     * 
     * @param pSDEServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSDESERVICEAPINAME)
    public void setPSDEServiceAPIName(String pSDEServiceAPIName){
        this.set(FIELD_PSDESERVICEAPINAME, pSDEServiceAPIName);
    }
    
    /**
     * 获取 实体服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSDEServiceAPIName(){
        Object objValue = this.get(FIELD_PSDESERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEServiceAPINameDirty(){
        if(this.contains(FIELD_PSDESERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体服务接口
     */
    @JsonIgnore
    public void resetPSDEServiceAPIName(){
        this.reset(FIELD_PSDESERVICEAPINAME);
    }

    /**
     * 设置 实体服务接口
     * <P>
     * 等同 {@link #setPSDEServiceAPIName}
     * @param pSDEServiceAPIName
     */
    @JsonIgnore
    public PSSysERMapNode psdeserviceapiname(String pSDEServiceAPIName){
        this.setPSDEServiceAPIName(pSDEServiceAPIName);
        return this;
    }

    /**
     * <B>PSMODULEID</B>&nbsp;模块标识
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSMODULEID = "psmoduleid";

    /**
     * 设置 模块标识
     * 
     * @param pSModuleId
     * 
     */
    @JsonProperty(FIELD_PSMODULEID)
    public void setPSModuleId(String pSModuleId){
        this.set(FIELD_PSMODULEID, pSModuleId);
    }
    
    /**
     * 获取 模块标识  
     * @return
     */
    @JsonIgnore
    public String getPSModuleId(){
        Object objValue = this.get(FIELD_PSMODULEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleIdDirty(){
        if(this.contains(FIELD_PSMODULEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块标识
     */
    @JsonIgnore
    public void resetPSModuleId(){
        this.reset(FIELD_PSMODULEID);
    }

    /**
     * 设置 模块标识
     * <P>
     * 等同 {@link #setPSModuleId}
     * @param pSModuleId
     */
    @JsonIgnore
    public PSSysERMapNode psmoduleid(String pSModuleId){
        this.setPSModuleId(pSModuleId);
        return this;
    }

    /**
     * <B>PSMODULENAME</B>&nbsp;模块名称
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSMODULENAME = "psmodulename";

    /**
     * 设置 模块名称
     * 
     * @param pSModuleName
     * 
     */
    @JsonProperty(FIELD_PSMODULENAME)
    public void setPSModuleName(String pSModuleName){
        this.set(FIELD_PSMODULENAME, pSModuleName);
    }
    
    /**
     * 获取 模块名称  
     * @return
     */
    @JsonIgnore
    public String getPSModuleName(){
        Object objValue = this.get(FIELD_PSMODULENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 模块名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSModuleNameDirty(){
        if(this.contains(FIELD_PSMODULENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模块名称
     */
    @JsonIgnore
    public void resetPSModuleName(){
        this.reset(FIELD_PSMODULENAME);
    }

    /**
     * 设置 模块名称
     * <P>
     * 等同 {@link #setPSModuleName}
     * @param pSModuleName
     */
    @JsonIgnore
    public PSSysERMapNode psmodulename(String pSModuleName){
        this.setPSModuleName(pSModuleName);
        return this;
    }

    /**
     * <B>PSSUBSYSSADEID</B>&nbsp;外部系统接口实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysSADE} 
     */
    public final static String FIELD_PSSUBSYSSADEID = "pssubsyssadeid";

    /**
     * 设置 外部系统接口实体
     * 
     * @param pSSubSysSADEId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADEID)
    public void setPSSubSysSADEId(String pSSubSysSADEId){
        this.set(FIELD_PSSUBSYSSADEID, pSSubSysSADEId);
    }
    
    /**
     * 获取 外部系统接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEId(){
        Object objValue = this.get(FIELD_PSSUBSYSSADEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部系统接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADEIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSADEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部系统接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEId(){
        this.reset(FIELD_PSSUBSYSSADEID);
    }

    /**
     * 设置 外部系统接口实体
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADEId
     */
    @JsonIgnore
    public PSSysERMapNode pssubsyssadeid(String pSSubSysSADEId){
        this.setPSSubSysSADEId(pSSubSysSADEId);
        return this;
    }

    /**
     * 设置 外部系统接口实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysSADEId}
     * @param pSSubSysSADE 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssubsyssadeid(PSSubSysSADE pSSubSysSADE){
        if(pSSubSysSADE == null){
            this.setPSSubSysSADEId(null);
            this.setPSSubSysSADEName(null);
        }
        else{
            this.setPSSubSysSADEId(pSSubSysSADE.getPSSubSysSADEId());
            this.setPSSubSysSADEName(pSSubSysSADE.getPSSubSysSADEName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSADENAME</B>&nbsp;外部系统接口实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSADEID}
     */
    public final static String FIELD_PSSUBSYSSADENAME = "pssubsyssadename";

    /**
     * 设置 外部系统接口实体
     * 
     * @param pSSubSysSADEName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSADENAME)
    public void setPSSubSysSADEName(String pSSubSysSADEName){
        this.set(FIELD_PSSUBSYSSADENAME, pSSubSysSADEName);
    }
    
    /**
     * 获取 外部系统接口实体  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysSADEName(){
        Object objValue = this.get(FIELD_PSSUBSYSSADENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部系统接口实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysSADENameDirty(){
        if(this.contains(FIELD_PSSUBSYSSADENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部系统接口实体
     */
    @JsonIgnore
    public void resetPSSubSysSADEName(){
        this.reset(FIELD_PSSUBSYSSADENAME);
    }

    /**
     * 设置 外部系统接口实体
     * <P>
     * 等同 {@link #setPSSubSysSADEName}
     * @param pSSubSysSADEName
     */
    @JsonIgnore
    public PSSysERMapNode pssubsyssadename(String pSSubSysSADEName){
        this.setPSSubSysSADEName(pSSubSysSADEName);
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPIID</B>&nbsp;外部系统接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSubSysServiceAPI} 
     */
    public final static String FIELD_PSSUBSYSSERVICEAPIID = "pssubsysserviceapiid";

    /**
     * 设置 外部系统接口
     * 
     * @param pSSubSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPIID)
    public void setPSSubSysServiceAPIId(String pSSubSysServiceAPIId){
        this.set(FIELD_PSSUBSYSSERVICEAPIID, pSSubSysServiceAPIId);
    }
    
    /**
     * 获取 外部系统接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部系统接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部系统接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIId(){
        this.reset(FIELD_PSSUBSYSSERVICEAPIID);
    }

    /**
     * 设置 外部系统接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPIId
     */
    @JsonIgnore
    public PSSysERMapNode pssubsysserviceapiid(String pSSubSysServiceAPIId){
        this.setPSSubSysServiceAPIId(pSSubSysServiceAPIId);
        return this;
    }

    /**
     * 设置 外部系统接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIId}
     * @param pSSubSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssubsysserviceapiid(PSSubSysServiceAPI pSSubSysServiceAPI){
        if(pSSubSysServiceAPI == null){
            this.setPSSubSysServiceAPIId(null);
            this.setPSSubSysServiceAPIName(null);
        }
        else{
            this.setPSSubSysServiceAPIId(pSSubSysServiceAPI.getPSSubSysServiceAPIId());
            this.setPSSubSysServiceAPIName(pSSubSysServiceAPI.getPSSubSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSUBSYSSERVICEAPINAME</B>&nbsp;外部系统接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSUBSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSUBSYSSERVICEAPINAME = "pssubsysserviceapiname";

    /**
     * 设置 外部系统接口
     * 
     * @param pSSubSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSUBSYSSERVICEAPINAME)
    public void setPSSubSysServiceAPIName(String pSSubSysServiceAPIName){
        this.set(FIELD_PSSUBSYSSERVICEAPINAME, pSSubSysServiceAPIName);
    }
    
    /**
     * 获取 外部系统接口  
     * @return
     */
    @JsonIgnore
    public String getPSSubSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSUBSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 外部系统接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSubSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSUBSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 外部系统接口
     */
    @JsonIgnore
    public void resetPSSubSysServiceAPIName(){
        this.reset(FIELD_PSSUBSYSSERVICEAPINAME);
    }

    /**
     * 设置 外部系统接口
     * <P>
     * 等同 {@link #setPSSubSysServiceAPIName}
     * @param pSSubSysServiceAPIName
     */
    @JsonIgnore
    public PSSysERMapNode pssubsysserviceapiname(String pSSubSysServiceAPIName){
        this.setPSSubSysServiceAPIName(pSSubSysServiceAPIName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysApp} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 前端应用
     * 
     * @param pSSysAppId
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPID)
    public void setPSSysAppId(String pSSysAppId){
        this.set(FIELD_PSSYSAPPID, pSSysAppId);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppId(){
        Object objValue = this.get(FIELD_PSSYSAPPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppIdDirty(){
        if(this.contains(FIELD_PSSYSAPPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppId(){
        this.reset(FIELD_PSSYSAPPID);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSSysERMapNode pssysappid(String pSSysAppId){
        this.setPSSysAppId(pSSysAppId);
        return this;
    }

    /**
     * 设置 前端应用，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysApp 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysappid(PSSysApp pSSysApp){
        if(pSSysApp == null){
            this.setPSSysAppId(null);
            this.setPSSysAppName(null);
        }
        else{
            this.setPSSysAppId(pSSysApp.getPSSysAppId());
            this.setPSSysAppName(pSSysApp.getPSSysAppName());
        }
        return this;
    }

    /**
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用
     * 
     * @param pSSysAppName
     * 
     */
    @JsonProperty(FIELD_PSSYSAPPNAME)
    public void setPSSysAppName(String pSSysAppName){
        this.set(FIELD_PSSYSAPPNAME, pSSysAppName);
    }
    
    /**
     * 获取 前端应用  
     * @return
     */
    @JsonIgnore
    public String getPSSysAppName(){
        Object objValue = this.get(FIELD_PSSYSAPPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 前端应用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysAppNameDirty(){
        if(this.contains(FIELD_PSSYSAPPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 前端应用
     */
    @JsonIgnore
    public void resetPSSysAppName(){
        this.reset(FIELD_PSSYSAPPNAME);
    }

    /**
     * 设置 前端应用
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSSysERMapNode pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMEID</B>&nbsp;大数据库
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDScheme} 
     */
    public final static String FIELD_PSSYSBDSCHEMEID = "pssysbdschemeid";

    /**
     * 设置 大数据库
     * 
     * @param pSSysBDSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMEID)
    public void setPSSysBDSchemeId(String pSSysBDSchemeId){
        this.set(FIELD_PSSYSBDSCHEMEID, pSSysBDSchemeId);
    }
    
    /**
     * 获取 大数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeId(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据库
     */
    @JsonIgnore
    public void resetPSSysBDSchemeId(){
        this.reset(FIELD_PSSYSBDSCHEMEID);
    }

    /**
     * 设置 大数据库
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDSchemeId
     */
    @JsonIgnore
    public PSSysERMapNode pssysbdschemeid(String pSSysBDSchemeId){
        this.setPSSysBDSchemeId(pSSysBDSchemeId);
        return this;
    }

    /**
     * 设置 大数据库，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDSchemeId}
     * @param pSSysBDScheme 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysbdschemeid(PSSysBDScheme pSSysBDScheme){
        if(pSSysBDScheme == null){
            this.setPSSysBDSchemeId(null);
            this.setPSSysBDSchemeName(null);
        }
        else{
            this.setPSSysBDSchemeId(pSSysBDScheme.getPSSysBDSchemeId());
            this.setPSSysBDSchemeName(pSSysBDScheme.getPSSysBDSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDSCHEMENAME</B>&nbsp;大数据库
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDSCHEMEID}
     */
    public final static String FIELD_PSSYSBDSCHEMENAME = "pssysbdschemename";

    /**
     * 设置 大数据库
     * 
     * @param pSSysBDSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDSCHEMENAME)
    public void setPSSysBDSchemeName(String pSSysBDSchemeName){
        this.set(FIELD_PSSYSBDSCHEMENAME, pSSysBDSchemeName);
    }
    
    /**
     * 获取 大数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDSchemeName(){
        Object objValue = this.get(FIELD_PSSYSBDSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSBDSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据库
     */
    @JsonIgnore
    public void resetPSSysBDSchemeName(){
        this.reset(FIELD_PSSYSBDSCHEMENAME);
    }

    /**
     * 设置 大数据库
     * <P>
     * 等同 {@link #setPSSysBDSchemeName}
     * @param pSSysBDSchemeName
     */
    @JsonIgnore
    public PSSysERMapNode pssysbdschemename(String pSSysBDSchemeName){
        this.setPSSysBDSchemeName(pSSysBDSchemeName);
        return this;
    }

    /**
     * <B>PSSYSBDTABLEID</B>&nbsp;大数据库表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysBDTable} 
     */
    public final static String FIELD_PSSYSBDTABLEID = "pssysbdtableid";

    /**
     * 设置 大数据库表
     * 
     * @param pSSysBDTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLEID)
    public void setPSSysBDTableId(String pSSysBDTableId){
        this.set(FIELD_PSSYSBDTABLEID, pSSysBDTableId);
    }
    
    /**
     * 获取 大数据库表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableId(){
        Object objValue = this.get(FIELD_PSSYSBDTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据库表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableIdDirty(){
        if(this.contains(FIELD_PSSYSBDTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据库表
     */
    @JsonIgnore
    public void resetPSSysBDTableId(){
        this.reset(FIELD_PSSYSBDTABLEID);
    }

    /**
     * 设置 大数据库表
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTableId
     */
    @JsonIgnore
    public PSSysERMapNode pssysbdtableid(String pSSysBDTableId){
        this.setPSSysBDTableId(pSSysBDTableId);
        return this;
    }

    /**
     * 设置 大数据库表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysBDTableId}
     * @param pSSysBDTable 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysbdtableid(PSSysBDTable pSSysBDTable){
        if(pSSysBDTable == null){
            this.setPSSysBDTableId(null);
            this.setPSSysBDTableName(null);
        }
        else{
            this.setPSSysBDTableId(pSSysBDTable.getPSSysBDTableId());
            this.setPSSysBDTableName(pSSysBDTable.getPSSysBDTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSBDTABLENAME</B>&nbsp;大数据库表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSBDTABLEID}
     */
    public final static String FIELD_PSSYSBDTABLENAME = "pssysbdtablename";

    /**
     * 设置 大数据库表
     * 
     * @param pSSysBDTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSBDTABLENAME)
    public void setPSSysBDTableName(String pSSysBDTableName){
        this.set(FIELD_PSSYSBDTABLENAME, pSSysBDTableName);
    }
    
    /**
     * 获取 大数据库表  
     * @return
     */
    @JsonIgnore
    public String getPSSysBDTableName(){
        Object objValue = this.get(FIELD_PSSYSBDTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 大数据库表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysBDTableNameDirty(){
        if(this.contains(FIELD_PSSYSBDTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 大数据库表
     */
    @JsonIgnore
    public void resetPSSysBDTableName(){
        this.reset(FIELD_PSSYSBDTABLENAME);
    }

    /**
     * 设置 大数据库表
     * <P>
     * 等同 {@link #setPSSysBDTableName}
     * @param pSSysBDTableName
     */
    @JsonIgnore
    public PSSysERMapNode pssysbdtablename(String pSSysBDTableName){
        this.setPSSysBDTableName(pSSysBDTableName);
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMEID</B>&nbsp;关系数据库
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBScheme} 
     */
    public final static String FIELD_PSSYSDBSCHEMEID = "pssysdbschemeid";

    /**
     * 设置 关系数据库
     * 
     * @param pSSysDBSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMEID)
    public void setPSSysDBSchemeId(String pSSysDBSchemeId){
        this.set(FIELD_PSSYSDBSCHEMEID, pSSysDBSchemeId);
    }
    
    /**
     * 获取 关系数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBSchemeId(){
        Object objValue = this.get(FIELD_PSSYSDBSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSDBSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据库
     */
    @JsonIgnore
    public void resetPSSysDBSchemeId(){
        this.reset(FIELD_PSSYSDBSCHEMEID);
    }

    /**
     * 设置 关系数据库
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBSchemeId
     */
    @JsonIgnore
    public PSSysERMapNode pssysdbschemeid(String pSSysDBSchemeId){
        this.setPSSysDBSchemeId(pSSysDBSchemeId);
        return this;
    }

    /**
     * 设置 关系数据库，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBSchemeId}
     * @param pSSysDBScheme 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysdbschemeid(PSSysDBScheme pSSysDBScheme){
        if(pSSysDBScheme == null){
            this.setPSSysDBSchemeId(null);
            this.setPSSysDBSchemeName(null);
        }
        else{
            this.setPSSysDBSchemeId(pSSysDBScheme.getPSSysDBSchemeId());
            this.setPSSysDBSchemeName(pSSysDBScheme.getPSSysDBSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBSCHEMENAME</B>&nbsp;关系数据库
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBSCHEMEID}
     */
    public final static String FIELD_PSSYSDBSCHEMENAME = "pssysdbschemename";

    /**
     * 设置 关系数据库
     * 
     * @param pSSysDBSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBSCHEMENAME)
    public void setPSSysDBSchemeName(String pSSysDBSchemeName){
        this.set(FIELD_PSSYSDBSCHEMENAME, pSSysDBSchemeName);
    }
    
    /**
     * 获取 关系数据库  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBSchemeName(){
        Object objValue = this.get(FIELD_PSSYSDBSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据库 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSDBSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据库
     */
    @JsonIgnore
    public void resetPSSysDBSchemeName(){
        this.reset(FIELD_PSSYSDBSCHEMENAME);
    }

    /**
     * 设置 关系数据库
     * <P>
     * 等同 {@link #setPSSysDBSchemeName}
     * @param pSSysDBSchemeName
     */
    @JsonIgnore
    public PSSysERMapNode pssysdbschemename(String pSSysDBSchemeName){
        this.setPSSysDBSchemeName(pSSysDBSchemeName);
        return this;
    }

    /**
     * <B>PSSYSDBTABLEID</B>&nbsp;关系数据库表
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBTable} 
     */
    public final static String FIELD_PSSYSDBTABLEID = "pssysdbtableid";

    /**
     * 设置 关系数据库表
     * 
     * @param pSSysDBTableId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLEID)
    public void setPSSysDBTableId(String pSSysDBTableId){
        this.set(FIELD_PSSYSDBTABLEID, pSSysDBTableId);
    }
    
    /**
     * 获取 关系数据库表  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBTableId(){
        Object objValue = this.get(FIELD_PSSYSDBTABLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据库表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBTableIdDirty(){
        if(this.contains(FIELD_PSSYSDBTABLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据库表
     */
    @JsonIgnore
    public void resetPSSysDBTableId(){
        this.reset(FIELD_PSSYSDBTABLEID);
    }

    /**
     * 设置 关系数据库表
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTableId
     */
    @JsonIgnore
    public PSSysERMapNode pssysdbtableid(String pSSysDBTableId){
        this.setPSSysDBTableId(pSSysDBTableId);
        return this;
    }

    /**
     * 设置 关系数据库表，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBTableId}
     * @param pSSysDBTable 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysdbtableid(PSSysDBTable pSSysDBTable){
        if(pSSysDBTable == null){
            this.setPSSysDBTableId(null);
            this.setPSSysDBTableName(null);
        }
        else{
            this.setPSSysDBTableId(pSSysDBTable.getPSSysDBTableId());
            this.setPSSysDBTableName(pSSysDBTable.getPSSysDBTableName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBTABLENAME</B>&nbsp;关系数据库表
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBTABLEID}
     */
    public final static String FIELD_PSSYSDBTABLENAME = "pssysdbtablename";

    /**
     * 设置 关系数据库表
     * 
     * @param pSSysDBTableName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBTABLENAME)
    public void setPSSysDBTableName(String pSSysDBTableName){
        this.set(FIELD_PSSYSDBTABLENAME, pSSysDBTableName);
    }
    
    /**
     * 获取 关系数据库表  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBTableName(){
        Object objValue = this.get(FIELD_PSSYSDBTABLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系数据库表 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBTableNameDirty(){
        if(this.contains(FIELD_PSSYSDBTABLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系数据库表
     */
    @JsonIgnore
    public void resetPSSysDBTableName(){
        this.reset(FIELD_PSSYSDBTABLENAME);
    }

    /**
     * 设置 关系数据库表
     * <P>
     * 等同 {@link #setPSSysDBTableName}
     * @param pSSysDBTableName
     */
    @JsonIgnore
    public PSSysERMapNode pssysdbtablename(String pSSysDBTableName){
        this.setPSSysDBTableName(pSSysDBTableName);
        return this;
    }

    /**
     * <B>PSSYSERMAPID</B>&nbsp;ER图例
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysERMap} 
     */
    public final static String FIELD_PSSYSERMAPID = "pssysermapid";

    /**
     * 设置 ER图例
     * 
     * @param pSSysERMapId
     * 
     */
    @JsonProperty(FIELD_PSSYSERMAPID)
    public void setPSSysERMapId(String pSSysERMapId){
        this.set(FIELD_PSSYSERMAPID, pSSysERMapId);
    }
    
    /**
     * 获取 ER图例  
     * @return
     */
    @JsonIgnore
    public String getPSSysERMapId(){
        Object objValue = this.get(FIELD_PSSYSERMAPID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 ER图例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysERMapIdDirty(){
        if(this.contains(FIELD_PSSYSERMAPID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 ER图例
     */
    @JsonIgnore
    public void resetPSSysERMapId(){
        this.reset(FIELD_PSSYSERMAPID);
    }

    /**
     * 设置 ER图例
     * <P>
     * 等同 {@link #setPSSysERMapId}
     * @param pSSysERMapId
     */
    @JsonIgnore
    public PSSysERMapNode pssysermapid(String pSSysERMapId){
        this.setPSSysERMapId(pSSysERMapId);
        return this;
    }

    /**
     * 设置 ER图例，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysERMapId}
     * @param pSSysERMap 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysermapid(PSSysERMap pSSysERMap){
        if(pSSysERMap == null){
            this.setPSSysERMapId(null);
            this.setPSSysERMapName(null);
        }
        else{
            this.setPSSysERMapId(pSSysERMap.getPSSysERMapId());
            this.setPSSysERMapName(pSSysERMap.getPSSysERMapName());
        }
        return this;
    }

    /**
     * <B>PSSYSERMAPNAME</B>&nbsp;ER图例
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSERMAPID}
     */
    public final static String FIELD_PSSYSERMAPNAME = "pssysermapname";

    /**
     * 设置 ER图例
     * 
     * @param pSSysERMapName
     * 
     */
    @JsonProperty(FIELD_PSSYSERMAPNAME)
    public void setPSSysERMapName(String pSSysERMapName){
        this.set(FIELD_PSSYSERMAPNAME, pSSysERMapName);
    }
    
    /**
     * 获取 ER图例  
     * @return
     */
    @JsonIgnore
    public String getPSSysERMapName(){
        Object objValue = this.get(FIELD_PSSYSERMAPNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 ER图例 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysERMapNameDirty(){
        if(this.contains(FIELD_PSSYSERMAPNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 ER图例
     */
    @JsonIgnore
    public void resetPSSysERMapName(){
        this.reset(FIELD_PSSYSERMAPNAME);
    }

    /**
     * 设置 ER图例
     * <P>
     * 等同 {@link #setPSSysERMapName}
     * @param pSSysERMapName
     */
    @JsonIgnore
    public PSSysERMapNode pssysermapname(String pSSysERMapName){
        this.setPSSysERMapName(pSSysERMapName);
        return this;
    }

    /**
     * <B>PSSYSERMAPNODEID</B>&nbsp;系统ER图节点标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSERMAPNODEID = "pssysermapnodeid";

    /**
     * 设置 系统ER图节点标识
     * 
     * @param pSSysERMapNodeId
     * 
     */
    @JsonProperty(FIELD_PSSYSERMAPNODEID)
    public void setPSSysERMapNodeId(String pSSysERMapNodeId){
        this.set(FIELD_PSSYSERMAPNODEID, pSSysERMapNodeId);
    }
    
    /**
     * 获取 系统ER图节点标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysERMapNodeId(){
        Object objValue = this.get(FIELD_PSSYSERMAPNODEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统ER图节点标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysERMapNodeIdDirty(){
        if(this.contains(FIELD_PSSYSERMAPNODEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统ER图节点标识
     */
    @JsonIgnore
    public void resetPSSysERMapNodeId(){
        this.reset(FIELD_PSSYSERMAPNODEID);
    }

    /**
     * 设置 系统ER图节点标识
     * <P>
     * 等同 {@link #setPSSysERMapNodeId}
     * @param pSSysERMapNodeId
     */
    @JsonIgnore
    public PSSysERMapNode pssysermapnodeid(String pSSysERMapNodeId){
        this.setPSSysERMapNodeId(pSSysERMapNodeId);
        return this;
    }

    /**
     * <B>PSSYSERMAPNODENAME</B>&nbsp;系统ER图节点名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSERMAPNODENAME = "pssysermapnodename";

    /**
     * 设置 系统ER图节点名称
     * 
     * @param pSSysERMapNodeName
     * 
     */
    @JsonProperty(FIELD_PSSYSERMAPNODENAME)
    public void setPSSysERMapNodeName(String pSSysERMapNodeName){
        this.set(FIELD_PSSYSERMAPNODENAME, pSSysERMapNodeName);
    }
    
    /**
     * 获取 系统ER图节点名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysERMapNodeName(){
        Object objValue = this.get(FIELD_PSSYSERMAPNODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统ER图节点名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysERMapNodeNameDirty(){
        if(this.contains(FIELD_PSSYSERMAPNODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统ER图节点名称
     */
    @JsonIgnore
    public void resetPSSysERMapNodeName(){
        this.reset(FIELD_PSSYSERMAPNODENAME);
    }

    /**
     * 设置 系统ER图节点名称
     * <P>
     * 等同 {@link #setPSSysERMapNodeName}
     * @param pSSysERMapNodeName
     */
    @JsonIgnore
    public PSSysERMapNode pssysermapnodename(String pSSysERMapNodeName){
        this.setPSSysERMapNodeName(pSSysERMapNodeName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysERMapNodeName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysERMapNodeName(strName);
    }

    @JsonIgnore
    public PSSysERMapNode name(String strName){
        this.setPSSysERMapNodeName(strName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCID</B>&nbsp;全文检索文档
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSearchDoc} 
     */
    public final static String FIELD_PSSYSSEARCHDOCID = "pssyssearchdocid";

    /**
     * 设置 全文检索文档
     * 
     * @param pSSysSearchDocId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCID)
    public void setPSSysSearchDocId(String pSSysSearchDocId){
        this.set(FIELD_PSSYSSEARCHDOCID, pSSysSearchDocId);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocId(){
        this.reset(FIELD_PSSYSSEARCHDOCID);
    }

    /**
     * 设置 全文检索文档
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDocId
     */
    @JsonIgnore
    public PSSysERMapNode pssyssearchdocid(String pSSysSearchDocId){
        this.setPSSysSearchDocId(pSSysSearchDocId);
        return this;
    }

    /**
     * 设置 全文检索文档，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchDocId}
     * @param pSSysSearchDoc 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssyssearchdocid(PSSysSearchDoc pSSysSearchDoc){
        if(pSSysSearchDoc == null){
            this.setPSSysSearchDocId(null);
            this.setPSSysSearchDocName(null);
        }
        else{
            this.setPSSysSearchDocId(pSSysSearchDoc.getPSSysSearchDocId());
            this.setPSSysSearchDocName(pSSysSearchDoc.getPSSysSearchDocName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHDOCNAME</B>&nbsp;全文检索文档
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHDOCID}
     */
    public final static String FIELD_PSSYSSEARCHDOCNAME = "pssyssearchdocname";

    /**
     * 设置 全文检索文档
     * 
     * @param pSSysSearchDocName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHDOCNAME)
    public void setPSSysSearchDocName(String pSSysSearchDocName){
        this.set(FIELD_PSSYSSEARCHDOCNAME, pSSysSearchDocName);
    }
    
    /**
     * 获取 全文检索文档  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchDocName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHDOCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索文档 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchDocNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHDOCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索文档
     */
    @JsonIgnore
    public void resetPSSysSearchDocName(){
        this.reset(FIELD_PSSYSSEARCHDOCNAME);
    }

    /**
     * 设置 全文检索文档
     * <P>
     * 等同 {@link #setPSSysSearchDocName}
     * @param pSSysSearchDocName
     */
    @JsonIgnore
    public PSSysERMapNode pssyssearchdocname(String pSSysSearchDocName){
        this.setPSSysSearchDocName(pSSysSearchDocName);
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMEID</B>&nbsp;全文检索
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSearchScheme} 
     */
    public final static String FIELD_PSSYSSEARCHSCHEMEID = "pssyssearchschemeid";

    /**
     * 设置 全文检索
     * 
     * @param pSSysSearchSchemeId
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMEID)
    public void setPSSysSearchSchemeId(String pSSysSearchSchemeId){
        this.set(FIELD_PSSYSSEARCHSCHEMEID, pSSysSearchSchemeId);
    }
    
    /**
     * 获取 全文检索  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeId(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeIdDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeId(){
        this.reset(FIELD_PSSYSSEARCHSCHEMEID);
    }

    /**
     * 设置 全文检索
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchSchemeId
     */
    @JsonIgnore
    public PSSysERMapNode pssyssearchschemeid(String pSSysSearchSchemeId){
        this.setPSSysSearchSchemeId(pSSysSearchSchemeId);
        return this;
    }

    /**
     * 设置 全文检索，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSearchSchemeId}
     * @param pSSysSearchScheme 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssyssearchschemeid(PSSysSearchScheme pSSysSearchScheme){
        if(pSSysSearchScheme == null){
            this.setPSSysSearchSchemeId(null);
            this.setPSSysSearchSchemeName(null);
        }
        else{
            this.setPSSysSearchSchemeId(pSSysSearchScheme.getPSSysSearchSchemeId());
            this.setPSSysSearchSchemeName(pSSysSearchScheme.getPSSysSearchSchemeName());
        }
        return this;
    }

    /**
     * <B>PSSYSSEARCHSCHEMENAME</B>&nbsp;全文检索
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSEARCHSCHEMEID}
     */
    public final static String FIELD_PSSYSSEARCHSCHEMENAME = "pssyssearchschemename";

    /**
     * 设置 全文检索
     * 
     * @param pSSysSearchSchemeName
     * 
     */
    @JsonProperty(FIELD_PSSYSSEARCHSCHEMENAME)
    public void setPSSysSearchSchemeName(String pSSysSearchSchemeName){
        this.set(FIELD_PSSYSSEARCHSCHEMENAME, pSSysSearchSchemeName);
    }
    
    /**
     * 获取 全文检索  
     * @return
     */
    @JsonIgnore
    public String getPSSysSearchSchemeName(){
        Object objValue = this.get(FIELD_PSSYSSEARCHSCHEMENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 全文检索 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSearchSchemeNameDirty(){
        if(this.contains(FIELD_PSSYSSEARCHSCHEMENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全文检索
     */
    @JsonIgnore
    public void resetPSSysSearchSchemeName(){
        this.reset(FIELD_PSSYSSEARCHSCHEMENAME);
    }

    /**
     * 设置 全文检索
     * <P>
     * 等同 {@link #setPSSysSearchSchemeName}
     * @param pSSysSearchSchemeName
     */
    @JsonIgnore
    public PSSysERMapNode pssyssearchschemename(String pSSysSearchSchemeName){
        this.setPSSysSearchSchemeName(pSSysSearchSchemeName);
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPIID</B>&nbsp;系统服务接口
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysServiceAPI} 
     */
    public final static String FIELD_PSSYSSERVICEAPIID = "pssysserviceapiid";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIId
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPIID)
    public void setPSSysServiceAPIId(String pSSysServiceAPIId){
        this.set(FIELD_PSSYSSERVICEAPIID, pSSysServiceAPIId);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIId(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPIID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPIIdDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPIID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIId(){
        this.reset(FIELD_PSSYSSERVICEAPIID);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPIId
     */
    @JsonIgnore
    public PSSysERMapNode pssysserviceapiid(String pSSysServiceAPIId){
        this.setPSSysServiceAPIId(pSSysServiceAPIId);
        return this;
    }

    /**
     * 设置 系统服务接口，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysServiceAPIId}
     * @param pSSysServiceAPI 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode pssysserviceapiid(PSSysServiceAPI pSSysServiceAPI){
        if(pSSysServiceAPI == null){
            this.setPSSysServiceAPIId(null);
            this.setPSSysServiceAPIName(null);
        }
        else{
            this.setPSSysServiceAPIId(pSSysServiceAPI.getPSSysServiceAPIId());
            this.setPSSysServiceAPIName(pSSysServiceAPI.getPSSysServiceAPIName());
        }
        return this;
    }

    /**
     * <B>PSSYSSERVICEAPINAME</B>&nbsp;系统服务接口
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSERVICEAPIID}
     */
    public final static String FIELD_PSSYSSERVICEAPINAME = "pssysserviceapiname";

    /**
     * 设置 系统服务接口
     * 
     * @param pSSysServiceAPIName
     * 
     */
    @JsonProperty(FIELD_PSSYSSERVICEAPINAME)
    public void setPSSysServiceAPIName(String pSSysServiceAPIName){
        this.set(FIELD_PSSYSSERVICEAPINAME, pSSysServiceAPIName);
    }
    
    /**
     * 获取 系统服务接口  
     * @return
     */
    @JsonIgnore
    public String getPSSysServiceAPIName(){
        Object objValue = this.get(FIELD_PSSYSSERVICEAPINAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统服务接口 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysServiceAPINameDirty(){
        if(this.contains(FIELD_PSSYSSERVICEAPINAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统服务接口
     */
    @JsonIgnore
    public void resetPSSysServiceAPIName(){
        this.reset(FIELD_PSSYSSERVICEAPINAME);
    }

    /**
     * 设置 系统服务接口
     * <P>
     * 等同 {@link #setPSSysServiceAPIName}
     * @param pSSysServiceAPIName
     */
    @JsonIgnore
    public PSSysERMapNode pssysserviceapiname(String pSSysServiceAPIName){
        this.setPSSysServiceAPIName(pSSysServiceAPIName);
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELID</B>&nbsp;引用动态模型对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDynaModel} 
     */
    public final static String FIELD_REFPSSYSDYNAMODELID = "refpssysdynamodelid";

    /**
     * 设置 引用动态模型对象
     * 
     * @param refPSSysDynaModelId
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELID)
    public void setRefPSSysDynaModelId(String refPSSysDynaModelId){
        this.set(FIELD_REFPSSYSDYNAMODELID, refPSSysDynaModelId);
    }
    
    /**
     * 获取 引用动态模型对象  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelId(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用动态模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelIdDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用动态模型对象
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelId(){
        this.reset(FIELD_REFPSSYSDYNAMODELID);
    }

    /**
     * 设置 引用动态模型对象
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param refPSSysDynaModelId
     */
    @JsonIgnore
    public PSSysERMapNode refpssysdynamodelid(String refPSSysDynaModelId){
        this.setRefPSSysDynaModelId(refPSSysDynaModelId);
        return this;
    }

    /**
     * 设置 引用动态模型对象，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setRefPSSysDynaModelId}
     * @param pSSysDynaModel 引用对象
     */
    @JsonIgnore
    public PSSysERMapNode refpssysdynamodelid(PSSysDynaModel pSSysDynaModel){
        if(pSSysDynaModel == null){
            this.setRefPSSysDynaModelId(null);
            this.setRefPSSysDynaModelName(null);
        }
        else{
            this.setRefPSSysDynaModelId(pSSysDynaModel.getPSSysDynaModelId());
            this.setRefPSSysDynaModelName(pSSysDynaModel.getPSSysDynaModelName());
        }
        return this;
    }

    /**
     * <B>REFPSSYSDYNAMODELNAME</B>&nbsp;引用动态模型对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_REFPSSYSDYNAMODELID}
     */
    public final static String FIELD_REFPSSYSDYNAMODELNAME = "refpssysdynamodelname";

    /**
     * 设置 引用动态模型对象
     * 
     * @param refPSSysDynaModelName
     * 
     */
    @JsonProperty(FIELD_REFPSSYSDYNAMODELNAME)
    public void setRefPSSysDynaModelName(String refPSSysDynaModelName){
        this.set(FIELD_REFPSSYSDYNAMODELNAME, refPSSysDynaModelName);
    }
    
    /**
     * 获取 引用动态模型对象  
     * @return
     */
    @JsonIgnore
    public String getRefPSSysDynaModelName(){
        Object objValue = this.get(FIELD_REFPSSYSDYNAMODELNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 引用动态模型对象 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRefPSSysDynaModelNameDirty(){
        if(this.contains(FIELD_REFPSSYSDYNAMODELNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 引用动态模型对象
     */
    @JsonIgnore
    public void resetRefPSSysDynaModelName(){
        this.reset(FIELD_REFPSSYSDYNAMODELNAME);
    }

    /**
     * 设置 引用动态模型对象
     * <P>
     * 等同 {@link #setRefPSSysDynaModelName}
     * @param refPSSysDynaModelName
     */
    @JsonIgnore
    public PSSysERMapNode refpssysdynamodelname(String refPSSysDynaModelName){
        this.setRefPSSysDynaModelName(refPSSysDynaModelName);
        return this;
    }

    /**
     * <B>SHAPEPARAMS</B>&nbsp;形状参数
     */
    public final static String FIELD_SHAPEPARAMS = "shapeparams";

    /**
     * 设置 形状参数
     * 
     * @param shapeParams
     * 
     */
    @JsonProperty(FIELD_SHAPEPARAMS)
    public void setShapeParams(String shapeParams){
        this.set(FIELD_SHAPEPARAMS, shapeParams);
    }
    
    /**
     * 获取 形状参数  
     * @return
     */
    @JsonIgnore
    public String getShapeParams(){
        Object objValue = this.get(FIELD_SHAPEPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 形状参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShapeParamsDirty(){
        if(this.contains(FIELD_SHAPEPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 形状参数
     */
    @JsonIgnore
    public void resetShapeParams(){
        this.reset(FIELD_SHAPEPARAMS);
    }

    /**
     * 设置 形状参数
     * <P>
     * 等同 {@link #setShapeParams}
     * @param shapeParams
     */
    @JsonIgnore
    public PSSysERMapNode shapeparams(String shapeParams){
        this.setShapeParams(shapeParams);
        return this;
    }

    /**
     * <B>SHOWDEFIELDS</B>&nbsp;显示属性
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_SHOWDEFIELDS = "showdefields";

    /**
     * 设置 显示属性
     * 
     * @param showDEFields
     * 
     */
    @JsonProperty(FIELD_SHOWDEFIELDS)
    public void setShowDEFields(String showDEFields){
        this.set(FIELD_SHOWDEFIELDS, showDEFields);
    }
    
    /**
     * 获取 显示属性  
     * @return
     */
    @JsonIgnore
    public String getShowDEFields(){
        Object objValue = this.get(FIELD_SHOWDEFIELDS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 显示属性 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isShowDEFieldsDirty(){
        if(this.contains(FIELD_SHOWDEFIELDS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 显示属性
     */
    @JsonIgnore
    public void resetShowDEFields(){
        this.reset(FIELD_SHOWDEFIELDS);
    }

    /**
     * 设置 显示属性
     * <P>
     * 等同 {@link #setShowDEFields}
     * @param showDEFields
     */
    @JsonIgnore
    public PSSysERMapNode showdefields(String showDEFields){
        this.setShowDEFields(showDEFields);
        return this;
    }

    /**
     * <B>TOPPOS</B>&nbsp;上坐标，指定实体对象在设计界面的图元的左上角Y值，未定义时为【0】
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
    public PSSysERMapNode toppos(Integer topPos){
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
    public PSSysERMapNode updatedate(String updateDate){
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
    public PSSysERMapNode updateman(String updateMan){
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
    public PSSysERMapNode usercat(String userCat){
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
    public PSSysERMapNode usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysERMapNode usertag(String userTag){
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
    public PSSysERMapNode usertag2(String userTag2){
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
    public PSSysERMapNode usertag3(String userTag3){
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
    public PSSysERMapNode usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysERMapNodeId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysERMapNodeId(strValue);
    }

    @JsonIgnore
    public PSSysERMapNode id(String strValue){
        this.setPSSysERMapNodeId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysERMapNode){
            PSSysERMapNode model = (PSSysERMapNode)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
