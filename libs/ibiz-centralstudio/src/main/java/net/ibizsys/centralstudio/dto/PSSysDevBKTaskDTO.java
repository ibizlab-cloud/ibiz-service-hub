package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSSYSDEVBKTASK</B>系统开发后台任务 模型传输对象
 * <P>
 * 
 */
public class PSSysDevBKTaskDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSSysDevBKTaskDTO(){
    }      

    /**
     * <B>BEGINTIME</B>&nbsp;开始时间
     */
    public final static String FIELD_BEGINTIME = "begintime";

    /**
     * 设置 开始时间
     * 
     * @param beginTime
     * 
     */
    @JsonProperty(FIELD_BEGINTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setBeginTime(Timestamp beginTime){
        this.set(FIELD_BEGINTIME, beginTime);
    }
    
    /**
     * 获取 开始时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getBeginTime(){
        Object objValue = this.get(FIELD_BEGINTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 开始时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isBeginTimeDirty(){
        if(this.contains(FIELD_BEGINTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开始时间
     */
    @JsonIgnore
    public void resetBeginTime(){
        this.reset(FIELD_BEGINTIME);
    }

    /**
     * 设置 开始时间
     * <P>
     * 等同 {@link #setBeginTime}
     * @param beginTime
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO begintime(Timestamp beginTime){
        this.setBeginTime(beginTime);
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
    public PSSysDevBKTaskDTO createdate(Timestamp createDate){
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
    public PSSysDevBKTaskDTO createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>ENDTIME</B>&nbsp;结束时间
     */
    public final static String FIELD_ENDTIME = "endtime";

    /**
     * 设置 结束时间
     * 
     * @param endTime
     * 
     */
    @JsonProperty(FIELD_ENDTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setEndTime(Timestamp endTime){
        this.set(FIELD_ENDTIME, endTime);
    }
    
    /**
     * 获取 结束时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getEndTime(){
        Object objValue = this.get(FIELD_ENDTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 结束时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEndTimeDirty(){
        if(this.contains(FIELD_ENDTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结束时间
     */
    @JsonIgnore
    public void resetEndTime(){
        this.reset(FIELD_ENDTIME);
    }

    /**
     * 设置 结束时间
     * <P>
     * 等同 {@link #setEndTime}
     * @param endTime
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO endtime(Timestamp endTime){
        this.setEndTime(endTime);
        return this;
    }

    /**
     * <B>FULLRESULTINFO</B>&nbsp;结果信息
     */
    public final static String FIELD_FULLRESULTINFO = "fullresultinfo";

    /**
     * 设置 结果信息
     * 
     * @param fullResultInfo
     * 
     */
    @JsonProperty(FIELD_FULLRESULTINFO)
    public void setFullResultInfo(String fullResultInfo){
        this.set(FIELD_FULLRESULTINFO, fullResultInfo);
    }
    
    /**
     * 获取 结果信息  
     * @return
     */
    @JsonIgnore
    public String getFullResultInfo(){
        Object objValue = this.get(FIELD_FULLRESULTINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isFullResultInfoDirty(){
        if(this.contains(FIELD_FULLRESULTINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果信息
     */
    @JsonIgnore
    public void resetFullResultInfo(){
        this.reset(FIELD_FULLRESULTINFO);
    }

    /**
     * 设置 结果信息
     * <P>
     * 等同 {@link #setFullResultInfo}
     * @param fullResultInfo
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO fullresultinfo(String fullResultInfo){
        this.setFullResultInfo(fullResultInfo);
        return this;
    }

    /**
     * <B>LINKINFO</B>&nbsp;链接
     * <P>
     * 字符串：最大长度 1000
     */
    public final static String FIELD_LINKINFO = "linkinfo";

    /**
     * 设置 链接
     * 
     * @param linkInfo
     * 
     */
    @JsonProperty(FIELD_LINKINFO)
    public void setLinkInfo(String linkInfo){
        this.set(FIELD_LINKINFO, linkInfo);
    }
    
    /**
     * 获取 链接  
     * @return
     */
    @JsonIgnore
    public String getLinkInfo(){
        Object objValue = this.get(FIELD_LINKINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 链接 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLinkInfoDirty(){
        if(this.contains(FIELD_LINKINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 链接
     */
    @JsonIgnore
    public void resetLinkInfo(){
        this.reset(FIELD_LINKINFO);
    }

    /**
     * 设置 链接
     * <P>
     * 等同 {@link #setLinkInfo}
     * @param linkInfo
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO linkinfo(String linkInfo){
        this.setLinkInfo(linkInfo);
        return this;
    }

    /**
     * <B>MEMO</B>&nbsp;任务信息
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_MEMO = "memo";

    /**
     * 设置 任务信息
     * 
     * @param memo
     * 
     */
    @JsonProperty(FIELD_MEMO)
    public void setMemo(String memo){
        this.set(FIELD_MEMO, memo);
    }
    
    /**
     * 获取 任务信息  
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
     * 判断 任务信息 是否指定值，包括空值
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
     * 重置 任务信息
     */
    @JsonIgnore
    public void resetMemo(){
        this.reset(FIELD_MEMO);
    }

    /**
     * 设置 任务信息
     * <P>
     * 等同 {@link #setMemo}
     * @param memo
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>MODELLEVEL</B>&nbsp;模型级别
     */
    public final static String FIELD_MODELLEVEL = "modellevel";

    /**
     * 设置 模型级别
     * 
     * @param modelLevel
     * 
     */
    @JsonProperty(FIELD_MODELLEVEL)
    public void setModelLevel(Integer modelLevel){
        this.set(FIELD_MODELLEVEL, modelLevel);
    }
    
    /**
     * 获取 模型级别  
     * @return
     */
    @JsonIgnore
    public Integer getModelLevel(){
        Object objValue = this.get(FIELD_MODELLEVEL);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 模型级别 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isModelLevelDirty(){
        if(this.contains(FIELD_MODELLEVEL)){
            return true;
        }
        return false;
    }

    /**
     * 重置 模型级别
     */
    @JsonIgnore
    public void resetModelLevel(){
        this.reset(FIELD_MODELLEVEL);
    }

    /**
     * 设置 模型级别
     * <P>
     * 等同 {@link #setModelLevel}
     * @param modelLevel
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO modellevel(Integer modelLevel){
        this.setModelLevel(modelLevel);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;执行次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 执行次序
     * 
     * @param orderValue
     * 
     */
    @JsonProperty(FIELD_ORDERVALUE)
    public void setOrderValue(Integer orderValue){
        this.set(FIELD_ORDERVALUE, orderValue);
    }
    
    /**
     * 获取 执行次序  
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
     * 判断 执行次序 是否指定值，包括空值
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
     * 重置 执行次序
     */
    @JsonIgnore
    public void resetOrderValue(){
        this.reset(FIELD_ORDERVALUE);
    }

    /**
     * 设置 执行次序
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PLANPSDCROBOTID</B>&nbsp;计划作业机器人
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PLANPSDCROBOTID = "planpsdcrobotid";

    /**
     * 设置 计划作业机器人
     * 
     * @param planPSDCRobotId
     * 
     */
    @JsonProperty(FIELD_PLANPSDCROBOTID)
    public void setPlanPSDCRobotId(String planPSDCRobotId){
        this.set(FIELD_PLANPSDCROBOTID, planPSDCRobotId);
    }
    
    /**
     * 获取 计划作业机器人  
     * @return
     */
    @JsonIgnore
    public String getPlanPSDCRobotId(){
        Object objValue = this.get(FIELD_PLANPSDCROBOTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计划作业机器人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlanPSDCRobotIdDirty(){
        if(this.contains(FIELD_PLANPSDCROBOTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计划作业机器人
     */
    @JsonIgnore
    public void resetPlanPSDCRobotId(){
        this.reset(FIELD_PLANPSDCROBOTID);
    }

    /**
     * 设置 计划作业机器人
     * <P>
     * 等同 {@link #setPlanPSDCRobotId}
     * @param planPSDCRobotId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO planpsdcrobotid(String planPSDCRobotId){
        this.setPlanPSDCRobotId(planPSDCRobotId);
        return this;
    }

    /**
     * <B>PLANPSDCROBOTNAME</B>&nbsp;计划作业机器人
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PLANPSDCROBOTID}
     */
    public final static String FIELD_PLANPSDCROBOTNAME = "planpsdcrobotname";

    /**
     * 设置 计划作业机器人
     * 
     * @param planPSDCRobotName
     * 
     */
    @JsonProperty(FIELD_PLANPSDCROBOTNAME)
    public void setPlanPSDCRobotName(String planPSDCRobotName){
        this.set(FIELD_PLANPSDCROBOTNAME, planPSDCRobotName);
    }
    
    /**
     * 获取 计划作业机器人  
     * @return
     */
    @JsonIgnore
    public String getPlanPSDCRobotName(){
        Object objValue = this.get(FIELD_PLANPSDCROBOTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 计划作业机器人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPlanPSDCRobotNameDirty(){
        if(this.contains(FIELD_PLANPSDCROBOTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计划作业机器人
     */
    @JsonIgnore
    public void resetPlanPSDCRobotName(){
        this.reset(FIELD_PLANPSDCROBOTNAME);
    }

    /**
     * 设置 计划作业机器人
     * <P>
     * 等同 {@link #setPlanPSDCRobotName}
     * @param planPSDCRobotName
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO planpsdcrobotname(String planPSDCRobotName){
        this.setPlanPSDCRobotName(planPSDCRobotName);
        return this;
    }

    /**
     * <B>PPSSYSDEVBKTASKID</B>&nbsp;父任务
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysDevBKTaskDTO} 
     */
    public final static String FIELD_PPSSYSDEVBKTASKID = "ppssysdevbktaskid";

    /**
     * 设置 父任务
     * 
     * @param pPSSysDevBKTaskId
     * 
     */
    @JsonProperty(FIELD_PPSSYSDEVBKTASKID)
    public void setPPSSysDevBKTaskId(String pPSSysDevBKTaskId){
        this.set(FIELD_PPSSYSDEVBKTASKID, pPSSysDevBKTaskId);
    }
    
    /**
     * 获取 父任务  
     * @return
     */
    @JsonIgnore
    public String getPPSSysDevBKTaskId(){
        Object objValue = this.get(FIELD_PPSSYSDEVBKTASKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父任务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysDevBKTaskIdDirty(){
        if(this.contains(FIELD_PPSSYSDEVBKTASKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父任务
     */
    @JsonIgnore
    public void resetPPSSysDevBKTaskId(){
        this.reset(FIELD_PPSSYSDEVBKTASKID);
    }

    /**
     * 设置 父任务
     * <P>
     * 等同 {@link #setPPSSysDevBKTaskId}
     * @param pPSSysDevBKTaskId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO ppssysdevbktaskid(String pPSSysDevBKTaskId){
        this.setPPSSysDevBKTaskId(pPSSysDevBKTaskId);
        return this;
    }

    /**
     * 设置 父任务，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSSysDevBKTaskId}
     * @param pSSysDevBKTask 引用对象
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO ppssysdevbktaskid(PSSysDevBKTaskDTO pSSysDevBKTask){
        if(pSSysDevBKTask == null){
            this.setPPSSysDevBKTaskId(null);
            this.setPPSSysDevBKTaskName(null);
        }
        else{
            this.setPPSSysDevBKTaskId(pSSysDevBKTask.getPSSysDevBKTaskId());
            this.setPPSSysDevBKTaskName(pSSysDevBKTask.getPSSysDevBKTaskName());
        }
        return this;
    }

    /**
     * <B>PPSSYSDEVBKTASKNAME</B>&nbsp;父任务
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSSYSDEVBKTASKID}
     */
    public final static String FIELD_PPSSYSDEVBKTASKNAME = "ppssysdevbktaskname";

    /**
     * 设置 父任务
     * 
     * @param pPSSysDevBKTaskName
     * 
     */
    @JsonProperty(FIELD_PPSSYSDEVBKTASKNAME)
    public void setPPSSysDevBKTaskName(String pPSSysDevBKTaskName){
        this.set(FIELD_PPSSYSDEVBKTASKNAME, pPSSysDevBKTaskName);
    }
    
    /**
     * 获取 父任务  
     * @return
     */
    @JsonIgnore
    public String getPPSSysDevBKTaskName(){
        Object objValue = this.get(FIELD_PPSSYSDEVBKTASKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 父任务 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSSysDevBKTaskNameDirty(){
        if(this.contains(FIELD_PPSSYSDEVBKTASKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 父任务
     */
    @JsonIgnore
    public void resetPPSSysDevBKTaskName(){
        this.reset(FIELD_PPSSYSDEVBKTASKNAME);
    }

    /**
     * 设置 父任务
     * <P>
     * 等同 {@link #setPPSSysDevBKTaskName}
     * @param pPSSysDevBKTaskName
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO ppssysdevbktaskname(String pPSSysDevBKTaskName){
        this.setPPSSysDevBKTaskName(pPSSysDevBKTaskName);
        return this;
    }

    /**
     * <B>PSDCROBOTID</B>&nbsp;作业机器人
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCROBOTID = "psdcrobotid";

    /**
     * 设置 作业机器人
     * 
     * @param pSDCRobotId
     * 
     */
    @JsonProperty(FIELD_PSDCROBOTID)
    public void setPSDCRobotId(String pSDCRobotId){
        this.set(FIELD_PSDCROBOTID, pSDCRobotId);
    }
    
    /**
     * 获取 作业机器人  
     * @return
     */
    @JsonIgnore
    public String getPSDCRobotId(){
        Object objValue = this.get(FIELD_PSDCROBOTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业机器人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRobotIdDirty(){
        if(this.contains(FIELD_PSDCROBOTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业机器人
     */
    @JsonIgnore
    public void resetPSDCRobotId(){
        this.reset(FIELD_PSDCROBOTID);
    }

    /**
     * 设置 作业机器人
     * <P>
     * 等同 {@link #setPSDCRobotId}
     * @param pSDCRobotId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO psdcrobotid(String pSDCRobotId){
        this.setPSDCRobotId(pSDCRobotId);
        return this;
    }

    /**
     * <B>PSDCROBOTNAME</B>&nbsp;作业机器人
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDCROBOTID}
     */
    public final static String FIELD_PSDCROBOTNAME = "psdcrobotname";

    /**
     * 设置 作业机器人
     * 
     * @param pSDCRobotName
     * 
     */
    @JsonProperty(FIELD_PSDCROBOTNAME)
    public void setPSDCRobotName(String pSDCRobotName){
        this.set(FIELD_PSDCROBOTNAME, pSDCRobotName);
    }
    
    /**
     * 获取 作业机器人  
     * @return
     */
    @JsonIgnore
    public String getPSDCRobotName(){
        Object objValue = this.get(FIELD_PSDCROBOTNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 作业机器人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCRobotNameDirty(){
        if(this.contains(FIELD_PSDCROBOTNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 作业机器人
     */
    @JsonIgnore
    public void resetPSDCRobotName(){
        this.reset(FIELD_PSDCROBOTNAME);
    }

    /**
     * 设置 作业机器人
     * <P>
     * 等同 {@link #setPSDCRobotName}
     * @param pSDCRobotName
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO psdcrobotname(String pSDCRobotName){
        this.setPSDCRobotName(pSDCRobotName);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案标识
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnId(){
        Object objValue = this.get(FIELD_PSDEVSLNID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnIdDirty(){
        if(this.contains(FIELD_PSDEVSLNID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案标识
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案标识
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVSLNSYSID</B>&nbsp;开发系统标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNSYSID = "psdevslnsysid";

    /**
     * 设置 开发系统标识
     * 
     * @param pSDevSlnSysId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNSYSID)
    public void setPSDevSlnSysId(String pSDevSlnSysId){
        this.set(FIELD_PSDEVSLNSYSID, pSDevSlnSysId);
    }
    
    /**
     * 获取 开发系统标识  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnSysId(){
        Object objValue = this.get(FIELD_PSDEVSLNSYSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发系统标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnSysIdDirty(){
        if(this.contains(FIELD_PSDEVSLNSYSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发系统标识
     */
    @JsonIgnore
    public void resetPSDevSlnSysId(){
        this.reset(FIELD_PSDEVSLNSYSID);
    }

    /**
     * 设置 开发系统标识
     * <P>
     * 等同 {@link #setPSDevSlnSysId}
     * @param pSDevSlnSysId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    /**
     * <B>PSDSCONSOLEID</B>&nbsp;控制台标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDSCONSOLEID = "psdsconsoleid";

    /**
     * 设置 控制台标识
     * 
     * @param pSDSConsoleId
     * 
     */
    @JsonProperty(FIELD_PSDSCONSOLEID)
    public void setPSDSConsoleId(String pSDSConsoleId){
        this.set(FIELD_PSDSCONSOLEID, pSDSConsoleId);
    }
    
    /**
     * 获取 控制台标识  
     * @return
     */
    @JsonIgnore
    public String getPSDSConsoleId(){
        Object objValue = this.get(FIELD_PSDSCONSOLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 控制台标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDSConsoleIdDirty(){
        if(this.contains(FIELD_PSDSCONSOLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 控制台标识
     */
    @JsonIgnore
    public void resetPSDSConsoleId(){
        this.reset(FIELD_PSDSCONSOLEID);
    }

    /**
     * 设置 控制台标识
     * <P>
     * 等同 {@link #setPSDSConsoleId}
     * @param pSDSConsoleId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO psdsconsoleid(String pSDSConsoleId){
        this.setPSDSConsoleId(pSDSConsoleId);
        return this;
    }

    /**
     * <B>PSDYNAINSTID</B>&nbsp;动态实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDYNAINSTID = "psdynainstid";

    /**
     * 设置 动态实例标识
     * 
     * @param pSDynaInstId
     * 
     */
    @JsonProperty(FIELD_PSDYNAINSTID)
    public void setPSDynaInstId(String pSDynaInstId){
        this.set(FIELD_PSDYNAINSTID, pSDynaInstId);
    }
    
    /**
     * 获取 动态实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSDynaInstId(){
        Object objValue = this.get(FIELD_PSDYNAINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 动态实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDynaInstIdDirty(){
        if(this.contains(FIELD_PSDYNAINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 动态实例标识
     */
    @JsonIgnore
    public void resetPSDynaInstId(){
        this.reset(FIELD_PSDYNAINSTID);
    }

    /**
     * 设置 动态实例标识
     * <P>
     * 等同 {@link #setPSDynaInstId}
     * @param pSDynaInstId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO psdynainstid(String pSDynaInstId){
        this.setPSDynaInstId(pSDynaInstId);
        return this;
    }

    /**
     * <B>PSSYSDEVBKTASKID</B>&nbsp;系统开发后台任务标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDEVBKTASKID = "pssysdevbktaskid";

    /**
     * 设置 系统开发后台任务标识
     * 
     * @param pSSysDevBKTaskId
     * 
     */
    @JsonProperty(FIELD_PSSYSDEVBKTASKID)
    public void setPSSysDevBKTaskId(String pSSysDevBKTaskId){
        this.set(FIELD_PSSYSDEVBKTASKID, pSSysDevBKTaskId);
    }
    
    /**
     * 获取 系统开发后台任务标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDevBKTaskId(){
        Object objValue = this.get(FIELD_PSSYSDEVBKTASKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统开发后台任务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDevBKTaskIdDirty(){
        if(this.contains(FIELD_PSSYSDEVBKTASKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统开发后台任务标识
     */
    @JsonIgnore
    public void resetPSSysDevBKTaskId(){
        this.reset(FIELD_PSSYSDEVBKTASKID);
    }

    /**
     * 设置 系统开发后台任务标识
     * <P>
     * 等同 {@link #setPSSysDevBKTaskId}
     * @param pSSysDevBKTaskId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO pssysdevbktaskid(String pSSysDevBKTaskId){
        this.setPSSysDevBKTaskId(pSSysDevBKTaskId);
        return this;
    }

    /**
     * <B>PSSYSDEVBKTASKNAME</B>&nbsp;任务名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSSYSDEVBKTASKNAME = "pssysdevbktaskname";

    /**
     * 设置 任务名称
     * 
     * @param pSSysDevBKTaskName
     * 
     */
    @JsonProperty(FIELD_PSSYSDEVBKTASKNAME)
    public void setPSSysDevBKTaskName(String pSSysDevBKTaskName){
        this.set(FIELD_PSSYSDEVBKTASKNAME, pSSysDevBKTaskName);
    }
    
    /**
     * 获取 任务名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDevBKTaskName(){
        Object objValue = this.get(FIELD_PSSYSDEVBKTASKNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDevBKTaskNameDirty(){
        if(this.contains(FIELD_PSSYSDEVBKTASKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务名称
     */
    @JsonIgnore
    public void resetPSSysDevBKTaskName(){
        this.reset(FIELD_PSSYSDEVBKTASKNAME);
    }

    /**
     * 设置 任务名称
     * <P>
     * 等同 {@link #setPSSysDevBKTaskName}
     * @param pSSysDevBKTaskName
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO pssysdevbktaskname(String pSSysDevBKTaskName){
        this.setPSSysDevBKTaskName(pSSysDevBKTaskName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDevBKTaskName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDevBKTaskName(strName);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO name(String strName){
        this.setPSSysDevBKTaskName(strName);
        return this;
    }

    /**
     * <B>PSSYSMODELINSTID</B>&nbsp;系统模型实例标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSMODELINSTID = "pssysmodelinstid";

    /**
     * 设置 系统模型实例标识
     * 
     * @param pSSysModelInstId
     * 
     */
    @JsonProperty(FIELD_PSSYSMODELINSTID)
    public void setPSSysModelInstId(String pSSysModelInstId){
        this.set(FIELD_PSSYSMODELINSTID, pSSysModelInstId);
    }
    
    /**
     * 获取 系统模型实例标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysModelInstId(){
        Object objValue = this.get(FIELD_PSSYSMODELINSTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统模型实例标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysModelInstIdDirty(){
        if(this.contains(FIELD_PSSYSMODELINSTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统模型实例标识
     */
    @JsonIgnore
    public void resetPSSysModelInstId(){
        this.reset(FIELD_PSSYSMODELINSTID);
    }

    /**
     * 设置 系统模型实例标识
     * <P>
     * 等同 {@link #setPSSysModelInstId}
     * @param pSSysModelInstId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO pssysmodelinstid(String pSSysModelInstId){
        this.setPSSysModelInstId(pSSysModelInstId);
        return this;
    }

    /**
     * <B>PSTASKSERVERID</B>&nbsp;任务服务器
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSTASKSERVERID = "pstaskserverid";

    /**
     * 设置 任务服务器
     * 
     * @param pSTaskServerId
     * 
     */
    @JsonProperty(FIELD_PSTASKSERVERID)
    public void setPSTaskServerId(String pSTaskServerId){
        this.set(FIELD_PSTASKSERVERID, pSTaskServerId);
    }
    
    /**
     * 获取 任务服务器  
     * @return
     */
    @JsonIgnore
    public String getPSTaskServerId(){
        Object objValue = this.get(FIELD_PSTASKSERVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSTaskServerIdDirty(){
        if(this.contains(FIELD_PSTASKSERVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务服务器
     */
    @JsonIgnore
    public void resetPSTaskServerId(){
        this.reset(FIELD_PSTASKSERVERID);
    }

    /**
     * 设置 任务服务器
     * <P>
     * 等同 {@link #setPSTaskServerId}
     * @param pSTaskServerId
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO pstaskserverid(String pSTaskServerId){
        this.setPSTaskServerId(pSTaskServerId);
        return this;
    }

    /**
     * <B>PSTASKSERVERNAME</B>&nbsp;任务服务器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSTASKSERVERID}
     */
    public final static String FIELD_PSTASKSERVERNAME = "pstaskservername";

    /**
     * 设置 任务服务器
     * 
     * @param pSTaskServerName
     * 
     */
    @JsonProperty(FIELD_PSTASKSERVERNAME)
    public void setPSTaskServerName(String pSTaskServerName){
        this.set(FIELD_PSTASKSERVERNAME, pSTaskServerName);
    }
    
    /**
     * 获取 任务服务器  
     * @return
     */
    @JsonIgnore
    public String getPSTaskServerName(){
        Object objValue = this.get(FIELD_PSTASKSERVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSTaskServerNameDirty(){
        if(this.contains(FIELD_PSTASKSERVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务服务器
     */
    @JsonIgnore
    public void resetPSTaskServerName(){
        this.reset(FIELD_PSTASKSERVERNAME);
    }

    /**
     * 设置 任务服务器
     * <P>
     * 等同 {@link #setPSTaskServerName}
     * @param pSTaskServerName
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO pstaskservername(String pSTaskServerName){
        this.setPSTaskServerName(pSTaskServerName);
        return this;
    }

    /**
     * <B>QUEUEINFO</B>&nbsp;任务调度信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_QUEUEINFO = "queueinfo";

    /**
     * 设置 任务调度信息
     * 
     * @param queueInfo
     * 
     */
    @JsonProperty(FIELD_QUEUEINFO)
    public void setQueueInfo(String queueInfo){
        this.set(FIELD_QUEUEINFO, queueInfo);
    }
    
    /**
     * 获取 任务调度信息  
     * @return
     */
    @JsonIgnore
    public String getQueueInfo(){
        Object objValue = this.get(FIELD_QUEUEINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务调度信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isQueueInfoDirty(){
        if(this.contains(FIELD_QUEUEINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务调度信息
     */
    @JsonIgnore
    public void resetQueueInfo(){
        this.reset(FIELD_QUEUEINFO);
    }

    /**
     * 设置 任务调度信息
     * <P>
     * 等同 {@link #setQueueInfo}
     * @param queueInfo
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO queueinfo(String queueInfo){
        this.setQueueInfo(queueInfo);
        return this;
    }

    /**
     * <B>REMOTEADDR</B>&nbsp;远端地址
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_REMOTEADDR = "remoteaddr";

    /**
     * 设置 远端地址
     * 
     * @param remoteAddr
     * 
     */
    @JsonProperty(FIELD_REMOTEADDR)
    public void setRemoteAddr(String remoteAddr){
        this.set(FIELD_REMOTEADDR, remoteAddr);
    }
    
    /**
     * 获取 远端地址  
     * @return
     */
    @JsonIgnore
    public String getRemoteAddr(){
        Object objValue = this.get(FIELD_REMOTEADDR);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 远端地址 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemoteAddrDirty(){
        if(this.contains(FIELD_REMOTEADDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 远端地址
     */
    @JsonIgnore
    public void resetRemoteAddr(){
        this.reset(FIELD_REMOTEADDR);
    }

    /**
     * 设置 远端地址
     * <P>
     * 等同 {@link #setRemoteAddr}
     * @param remoteAddr
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO remoteaddr(String remoteAddr){
        this.setRemoteAddr(remoteAddr);
        return this;
    }

    /**
     * <B>RESULTINFO</B>&nbsp;运行信息
     * <P>
     * 字符串：最大长度 4000
     */
    public final static String FIELD_RESULTINFO = "resultinfo";

    /**
     * 设置 运行信息
     * 
     * @param resultInfo
     * 
     */
    @JsonProperty(FIELD_RESULTINFO)
    public void setResultInfo(String resultInfo){
        this.set(FIELD_RESULTINFO, resultInfo);
    }
    
    /**
     * 获取 运行信息  
     * @return
     */
    @JsonIgnore
    public String getResultInfo(){
        Object objValue = this.get(FIELD_RESULTINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 运行信息 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResultInfoDirty(){
        if(this.contains(FIELD_RESULTINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 运行信息
     */
    @JsonIgnore
    public void resetResultInfo(){
        this.reset(FIELD_RESULTINFO);
    }

    /**
     * 设置 运行信息
     * <P>
     * 等同 {@link #setResultInfo}
     * @param resultInfo
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO resultinfo(String resultInfo){
        this.setResultInfo(resultInfo);
        return this;
    }

    /**
     * <B>TASKPARAM</B>&nbsp;任务参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TASKPARAM = "taskparam";

    /**
     * 设置 任务参数
     * 
     * @param taskParam
     * 
     */
    @JsonProperty(FIELD_TASKPARAM)
    public void setTaskParam(String taskParam){
        this.set(FIELD_TASKPARAM, taskParam);
    }
    
    /**
     * 获取 任务参数  
     * @return
     */
    @JsonIgnore
    public String getTaskParam(){
        Object objValue = this.get(FIELD_TASKPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskParamDirty(){
        if(this.contains(FIELD_TASKPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务参数
     */
    @JsonIgnore
    public void resetTaskParam(){
        this.reset(FIELD_TASKPARAM);
    }

    /**
     * 设置 任务参数
     * <P>
     * 等同 {@link #setTaskParam}
     * @param taskParam
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO taskparam(String taskParam){
        this.setTaskParam(taskParam);
        return this;
    }

    /**
     * <B>TASKPARAM2</B>&nbsp;任务参数2
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TASKPARAM2 = "taskparam2";

    /**
     * 设置 任务参数2
     * 
     * @param taskParam2
     * 
     */
    @JsonProperty(FIELD_TASKPARAM2)
    public void setTaskParam2(String taskParam2){
        this.set(FIELD_TASKPARAM2, taskParam2);
    }
    
    /**
     * 获取 任务参数2  
     * @return
     */
    @JsonIgnore
    public String getTaskParam2(){
        Object objValue = this.get(FIELD_TASKPARAM2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务参数2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskParam2Dirty(){
        if(this.contains(FIELD_TASKPARAM2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务参数2
     */
    @JsonIgnore
    public void resetTaskParam2(){
        this.reset(FIELD_TASKPARAM2);
    }

    /**
     * 设置 任务参数2
     * <P>
     * 等同 {@link #setTaskParam2}
     * @param taskParam2
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO taskparam2(String taskParam2){
        this.setTaskParam2(taskParam2);
        return this;
    }

    /**
     * <B>TASKPARAM3</B>&nbsp;任务参数3
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TASKPARAM3 = "taskparam3";

    /**
     * 设置 任务参数3
     * 
     * @param taskParam3
     * 
     */
    @JsonProperty(FIELD_TASKPARAM3)
    public void setTaskParam3(String taskParam3){
        this.set(FIELD_TASKPARAM3, taskParam3);
    }
    
    /**
     * 获取 任务参数3  
     * @return
     */
    @JsonIgnore
    public String getTaskParam3(){
        Object objValue = this.get(FIELD_TASKPARAM3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务参数3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskParam3Dirty(){
        if(this.contains(FIELD_TASKPARAM3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务参数3
     */
    @JsonIgnore
    public void resetTaskParam3(){
        this.reset(FIELD_TASKPARAM3);
    }

    /**
     * 设置 任务参数3
     * <P>
     * 等同 {@link #setTaskParam3}
     * @param taskParam3
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO taskparam3(String taskParam3){
        this.setTaskParam3(taskParam3);
        return this;
    }

    /**
     * <B>TASKPARAM4</B>&nbsp;任务参数4
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_TASKPARAM4 = "taskparam4";

    /**
     * 设置 任务参数4
     * 
     * @param taskParam4
     * 
     */
    @JsonProperty(FIELD_TASKPARAM4)
    public void setTaskParam4(String taskParam4){
        this.set(FIELD_TASKPARAM4, taskParam4);
    }
    
    /**
     * 获取 任务参数4  
     * @return
     */
    @JsonIgnore
    public String getTaskParam4(){
        Object objValue = this.get(FIELD_TASKPARAM4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务参数4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskParam4Dirty(){
        if(this.contains(FIELD_TASKPARAM4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务参数4
     */
    @JsonIgnore
    public void resetTaskParam4(){
        this.reset(FIELD_TASKPARAM4);
    }

    /**
     * 设置 任务参数4
     * <P>
     * 等同 {@link #setTaskParam4}
     * @param taskParam4
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO taskparam4(String taskParam4){
        this.setTaskParam4(taskParam4);
        return this;
    }

    /**
     * <B>TASKSTATE</B>&nbsp;任务状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysDevBKTaskState} 
     */
    public final static String FIELD_TASKSTATE = "taskstate";

    /**
     * 设置 任务状态
     * 
     * @param taskState
     * 
     */
    @JsonProperty(FIELD_TASKSTATE)
    public void setTaskState(Integer taskState){
        this.set(FIELD_TASKSTATE, taskState);
    }
    
    /**
     * 获取 任务状态  
     * @return
     */
    @JsonIgnore
    public Integer getTaskState(){
        Object objValue = this.get(FIELD_TASKSTATE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 任务状态 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskStateDirty(){
        if(this.contains(FIELD_TASKSTATE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务状态
     */
    @JsonIgnore
    public void resetTaskState(){
        this.reset(FIELD_TASKSTATE);
    }

    /**
     * 设置 任务状态
     * <P>
     * 等同 {@link #setTaskState}
     * @param taskState
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO taskstate(Integer taskState){
        this.setTaskState(taskState);
        return this;
    }

     /**
     * 设置 任务状态
     * <P>
     * 等同 {@link #setTaskState}
     * @param taskState
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO taskstate(net.ibizsys.model.PSModelEnums.SysDevBKTaskState taskState){
        if(taskState == null){
            this.setTaskState(null);
        }
        else{
            this.setTaskState(taskState.value);
        }
        return this;
    }

    /**
     * <B>TASKTYPE</B>&nbsp;任务类型
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.SysDevBKTaskType} 
     */
    public final static String FIELD_TASKTYPE = "tasktype";

    /**
     * 设置 任务类型
     * 
     * @param taskType
     * 
     */
    @JsonProperty(FIELD_TASKTYPE)
    public void setTaskType(String taskType){
        this.set(FIELD_TASKTYPE, taskType);
    }
    
    /**
     * 获取 任务类型  
     * @return
     */
    @JsonIgnore
    public String getTaskType(){
        Object objValue = this.get(FIELD_TASKTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskTypeDirty(){
        if(this.contains(FIELD_TASKTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务类型
     */
    @JsonIgnore
    public void resetTaskType(){
        this.reset(FIELD_TASKTYPE);
    }

    /**
     * 设置 任务类型
     * <P>
     * 等同 {@link #setTaskType}
     * @param taskType
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO tasktype(String taskType){
        this.setTaskType(taskType);
        return this;
    }

     /**
     * 设置 任务类型
     * <P>
     * 等同 {@link #setTaskType}
     * @param taskType
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO tasktype(net.ibizsys.model.PSModelEnums.SysDevBKTaskType taskType){
        if(taskType == null){
            this.setTaskType(null);
        }
        else{
            this.setTaskType(taskType.value);
        }
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
    public PSSysDevBKTaskDTO updatedate(Timestamp updateDate){
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
    public PSSysDevBKTaskDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>USEROBOTFLAG</B>&nbsp;使用机器人
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_USEROBOTFLAG = "userobotflag";

    /**
     * 设置 使用机器人
     * 
     * @param useRobotFlag
     * 
     */
    @JsonProperty(FIELD_USEROBOTFLAG)
    public void setUseRobotFlag(Integer useRobotFlag){
        this.set(FIELD_USEROBOTFLAG, useRobotFlag);
    }
    
    /**
     * 获取 使用机器人  
     * @return
     */
    @JsonIgnore
    public Integer getUseRobotFlag(){
        Object objValue = this.get(FIELD_USEROBOTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 使用机器人 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUseRobotFlagDirty(){
        if(this.contains(FIELD_USEROBOTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 使用机器人
     */
    @JsonIgnore
    public void resetUseRobotFlag(){
        this.reset(FIELD_USEROBOTFLAG);
    }

    /**
     * 设置 使用机器人
     * <P>
     * 等同 {@link #setUseRobotFlag}
     * @param useRobotFlag
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO userobotflag(Integer useRobotFlag){
        this.setUseRobotFlag(useRobotFlag);
        return this;
    }

     /**
     * 设置 使用机器人
     * <P>
     * 等同 {@link #setUseRobotFlag}
     * @param useRobotFlag
     */
    @JsonIgnore
    public PSSysDevBKTaskDTO userobotflag(Boolean useRobotFlag){
        if(useRobotFlag == null){
            this.setUseRobotFlag(null);
        }
        else{
            this.setUseRobotFlag(useRobotFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
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
    public PSSysDevBKTaskDTO usertag(String userTag){
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
    public PSSysDevBKTaskDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSSysDevBKTaskId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSSysDevBKTaskId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDevBKTaskId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDevBKTaskId(strValue);
    }

    @JsonIgnore
    public PSSysDevBKTaskDTO id(String strValue){
        this.setPSSysDevBKTaskId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSSysDevBKTaskDTO){
            PSSysDevBKTaskDTO dto = (PSSysDevBKTaskDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
