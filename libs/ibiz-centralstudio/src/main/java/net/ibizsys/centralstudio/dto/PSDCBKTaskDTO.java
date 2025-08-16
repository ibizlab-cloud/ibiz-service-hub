package net.ibizsys.centralstudio.dto;

import net.ibizsys.centralstudio.util.CentralEntityDTOBase;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class PSDCBKTaskDTO extends CentralEntityDTOBase{

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
    public PSDCBKTaskDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSDCBKTaskDTO createdate(Timestamp createDate){
        this.setCreateDate(createDate);
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
    public PSDCBKTaskDTO updatedate(Timestamp updateDate){
        this.setUpdateDate(updateDate);
        return this;
    }

    /**
     * <B>PSDCBKTASKID</B>&nbsp;应用中心后台任务标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDCBKTASKID = "psdcbktaskid";

    /**
     * 设置 应用中心后台任务标识
     * 
     * @param pSDCBKTaskId
     * 
     */
    @JsonProperty(FIELD_PSDCBKTASKID)
    public void setPSDCBKTaskId(String pSDCBKTaskId){
        this.set(FIELD_PSDCBKTASKID, pSDCBKTaskId);
    }
    
    /**
     * 获取 应用中心后台任务标识  
     * @return
     */
    @JsonIgnore
    public String getPSDCBKTaskId(){
        Object objValue = this.get(FIELD_PSDCBKTASKID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用中心后台任务标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDCBKTaskIdDirty(){
        if(this.contains(FIELD_PSDCBKTASKID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用中心后台任务标识
     */
    @JsonIgnore
    public void resetPSDCBKTaskId(){
        this.reset(FIELD_PSDCBKTASKID);
    }

    /**
     * 设置 应用中心后台任务标识
     * <P>
     * 等同 {@link #setPSDCBKTaskId}
     * @param pSDCBKTaskId
     */
    @JsonIgnore
    public PSDCBKTaskDTO psdcbktaskid(String pSDCBKTaskId){
        this.setPSDCBKTaskId(pSDCBKTaskId);
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
    public PSDCBKTaskDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    /**
     * <B>PSDCBKTASKNAME</B>&nbsp;任务名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDCBKTASKNAME = "psdcbktaskname";

    /**
     * 设置 任务名称
     * 
     * @param pSDCBKTaskName
     * 
     */
    @JsonProperty(FIELD_PSDCBKTASKNAME)
    public void setPSDCBKTaskName(String pSDCBKTaskName){
        this.set(FIELD_PSDCBKTASKNAME, pSDCBKTaskName);
    }
    
    /**
     * 获取 任务名称  
     * @return
     */
    @JsonIgnore
    public String getPSDCBKTaskName(){
        Object objValue = this.get(FIELD_PSDCBKTASKNAME);
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
    public boolean isPSDCBKTaskNameDirty(){
        if(this.contains(FIELD_PSDCBKTASKNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务名称
     */
    @JsonIgnore
    public void resetPSDCBKTaskName(){
        this.reset(FIELD_PSDCBKTASKNAME);
    }

    /**
     * 设置 任务名称
     * <P>
     * 等同 {@link #setPSDCBKTaskName}
     * @param pSDCBKTaskName
     */
    @JsonIgnore
    public PSDCBKTaskDTO psdcbktaskname(String pSDCBKTaskName){
        this.setPSDCBKTaskName(pSDCBKTaskName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDCBKTaskName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDCBKTaskName(strName);
    }

    @JsonIgnore
    public PSDCBKTaskDTO name(String strName){
        this.setPSDCBKTaskName(strName);
        return this;
    }

    /**
     * <B>ORGID</B>&nbsp;组织机构标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_ORGID = "orgid";

    /**
     * 设置 组织机构标识
     * 
     * @param orgId
     * 
     */
    @JsonProperty(FIELD_ORGID)
    public void setOrgId(String orgId){
        this.set(FIELD_ORGID, orgId);
    }
    
    /**
     * 获取 组织机构标识  
     * @return
     */
    @JsonIgnore
    public String getOrgId(){
        Object objValue = this.get(FIELD_ORGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组织机构标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrgIdDirty(){
        if(this.contains(FIELD_ORGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组织机构标识
     */
    @JsonIgnore
    public void resetOrgId(){
        this.reset(FIELD_ORGID);
    }

    /**
     * 设置 组织机构标识
     * <P>
     * 等同 {@link #setOrgId}
     * @param orgId
     */
    @JsonIgnore
    public PSDCBKTaskDTO orgid(String orgId){
        this.setOrgId(orgId);
        return this;
    }

    /**
     * <B>DEPTID</B>&nbsp;组织部门标识
     * <P>
     * 字符串：最大长度 60
     */
    public final static String FIELD_DEPTID = "deptid";

    /**
     * 设置 组织部门标识
     * 
     * @param deptId
     * 
     */
    @JsonProperty(FIELD_DEPTID)
    public void setDeptId(String deptId){
        this.set(FIELD_DEPTID, deptId);
    }
    
    /**
     * 获取 组织部门标识  
     * @return
     */
    @JsonIgnore
    public String getDeptId(){
        Object objValue = this.get(FIELD_DEPTID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 组织部门标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDeptIdDirty(){
        if(this.contains(FIELD_DEPTID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 组织部门标识
     */
    @JsonIgnore
    public void resetDeptId(){
        this.reset(FIELD_DEPTID);
    }

    /**
     * 设置 组织部门标识
     * <P>
     * 等同 {@link #setDeptId}
     * @param deptId
     */
    @JsonIgnore
    public PSDCBKTaskDTO deptid(String deptId){
        this.setDeptId(deptId);
        return this;
    }

    /**
     * <B>TOTALTIME</B>&nbsp;计划总时间
     */
    public final static String FIELD_TOTALTIME = "totaltime";

    /**
     * 设置 计划总时间
     * 
     * @param totalTime
     * 
     */
    @JsonProperty(FIELD_TOTALTIME)
    public void setTotalTime(Integer totalTime){
        this.set(FIELD_TOTALTIME, totalTime);
    }
    
    /**
     * 获取 计划总时间  
     * @return
     */
    @JsonIgnore
    public Integer getTotalTime(){
        Object objValue = this.get(FIELD_TOTALTIME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 计划总时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTotalTimeDirty(){
        if(this.contains(FIELD_TOTALTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 计划总时间
     */
    @JsonIgnore
    public void resetTotalTime(){
        this.reset(FIELD_TOTALTIME);
    }

    /**
     * 设置 计划总时间
     * <P>
     * 等同 {@link #setTotalTime}
     * @param totalTime
     */
    @JsonIgnore
    public PSDCBKTaskDTO totaltime(Integer totalTime){
        this.setTotalTime(totalTime);
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
    public PSDCBKTaskDTO remoteaddr(String remoteAddr){
        this.setRemoteAddr(remoteAddr);
        return this;
    }

    /**
     * <B>REMAININGTIME</B>&nbsp;剩余时间
     */
    public final static String FIELD_REMAININGTIME = "remainingtime";

    /**
     * 设置 剩余时间
     * 
     * @param remainingTime
     * 
     */
    @JsonProperty(FIELD_REMAININGTIME)
    public void setRemainingTime(Integer remainingTime){
        this.set(FIELD_REMAININGTIME, remainingTime);
    }
    
    /**
     * 获取 剩余时间  
     * @return
     */
    @JsonIgnore
    public Integer getRemainingTime(){
        Object objValue = this.get(FIELD_REMAININGTIME);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 剩余时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isRemainingTimeDirty(){
        if(this.contains(FIELD_REMAININGTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 剩余时间
     */
    @JsonIgnore
    public void resetRemainingTime(){
        this.reset(FIELD_REMAININGTIME);
    }

    /**
     * 设置 剩余时间
     * <P>
     * 等同 {@link #setRemainingTime}
     * @param remainingTime
     */
    @JsonIgnore
    public PSDCBKTaskDTO remainingtime(Integer remainingTime){
        this.setRemainingTime(remainingTime);
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
    public PSDCBKTaskDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>QUEUEINFO</B>&nbsp;队列信息
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_QUEUEINFO = "queueinfo";

    /**
     * 设置 队列信息
     * 
     * @param queueInfo
     * 
     */
    @JsonProperty(FIELD_QUEUEINFO)
    public void setQueueInfo(String queueInfo){
        this.set(FIELD_QUEUEINFO, queueInfo);
    }
    
    /**
     * 获取 队列信息  
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
     * 判断 队列信息 是否指定值，包括空值
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
     * 重置 队列信息
     */
    @JsonIgnore
    public void resetQueueInfo(){
        this.reset(FIELD_QUEUEINFO);
    }

    /**
     * 设置 队列信息
     * <P>
     * 等同 {@link #setQueueInfo}
     * @param queueInfo
     */
    @JsonIgnore
    public PSDCBKTaskDTO queueinfo(String queueInfo){
        this.setQueueInfo(queueInfo);
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
    public PSDCBKTaskDTO psdsconsoleid(String pSDSConsoleId){
        this.setPSDSConsoleId(pSDSConsoleId);
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
    public PSDCBKTaskDTO taskparam4(String taskParam4){
        this.setTaskParam4(taskParam4);
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
    public PSDCBKTaskDTO taskparam(String taskParam){
        this.setTaskParam(taskParam);
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
    public PSDCBKTaskDTO taskparam3(String taskParam3){
        this.setTaskParam3(taskParam3);
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
    public PSDCBKTaskDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
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
    public PSDCBKTaskDTO usertag(String userTag){
        this.setUserTag(userTag);
        return this;
    }

    /**
     * <B>STEPINFO</B>&nbsp;当前步骤
     * <P>
     * 字符串：最大长度 500
     */
    public final static String FIELD_STEPINFO = "stepinfo";

    /**
     * 设置 当前步骤
     * 
     * @param stepInfo
     * 
     */
    @JsonProperty(FIELD_STEPINFO)
    public void setStepInfo(String stepInfo){
        this.set(FIELD_STEPINFO, stepInfo);
    }
    
    /**
     * 获取 当前步骤  
     * @return
     */
    @JsonIgnore
    public String getStepInfo(){
        Object objValue = this.get(FIELD_STEPINFO);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 当前步骤 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStepInfoDirty(){
        if(this.contains(FIELD_STEPINFO)){
            return true;
        }
        return false;
    }

    /**
     * 重置 当前步骤
     */
    @JsonIgnore
    public void resetStepInfo(){
        this.reset(FIELD_STEPINFO);
    }

    /**
     * 设置 当前步骤
     * <P>
     * 等同 {@link #setStepInfo}
     * @param stepInfo
     */
    @JsonIgnore
    public PSDCBKTaskDTO stepinfo(String stepInfo){
        this.setStepInfo(stepInfo);
        return this;
    }

    /**
     * <B>LASTCALCTIME</B>&nbsp;上次计算时间
     */
    public final static String FIELD_LASTCALCTIME = "lastcalctime";

    /**
     * 设置 上次计算时间
     * 
     * @param lastCalcTime
     * 
     */
    @JsonProperty(FIELD_LASTCALCTIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public void setLastCalcTime(Timestamp lastCalcTime){
        this.set(FIELD_LASTCALCTIME, lastCalcTime);
    }
    
    /**
     * 获取 上次计算时间  
     * @return
     */
    @JsonIgnore
    public Timestamp getLastCalcTime(){
        Object objValue = this.get(FIELD_LASTCALCTIME);
        if(objValue==null){
            return null;
        }
        return (Timestamp)objValue;
    }

    /**
     * 判断 上次计算时间 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLastCalcTimeDirty(){
        if(this.contains(FIELD_LASTCALCTIME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 上次计算时间
     */
    @JsonIgnore
    public void resetLastCalcTime(){
        this.reset(FIELD_LASTCALCTIME);
    }

    /**
     * 设置 上次计算时间
     * <P>
     * 等同 {@link #setLastCalcTime}
     * @param lastCalcTime
     */
    @JsonIgnore
    public PSDCBKTaskDTO lastcalctime(Timestamp lastCalcTime){
        this.setLastCalcTime(lastCalcTime);
        return this;
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
    public PSDCBKTaskDTO begintime(Timestamp beginTime){
        this.setBeginTime(beginTime);
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
    public PSDCBKTaskDTO taskparam2(String taskParam2){
        this.setTaskParam2(taskParam2);
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
    public PSDCBKTaskDTO resultinfo(String resultInfo){
        this.setResultInfo(resultInfo);
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
    public PSDCBKTaskDTO fullresultinfo(String fullResultInfo){
        this.setFullResultInfo(fullResultInfo);
        return this;
    }

    /**
     * <B>TASKPARAMS</B>&nbsp;任务参数集合
     */
    public final static String FIELD_TASKPARAMS = "taskparams";

    /**
     * 设置 任务参数集合
     * 
     * @param taskParams
     * 
     */
    @JsonProperty(FIELD_TASKPARAMS)
    public void setTaskParams(String taskParams){
        this.set(FIELD_TASKPARAMS, taskParams);
    }
    
    /**
     * 获取 任务参数集合  
     * @return
     */
    @JsonIgnore
    public String getTaskParams(){
        Object objValue = this.get(FIELD_TASKPARAMS);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 任务参数集合 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTaskParamsDirty(){
        if(this.contains(FIELD_TASKPARAMS)){
            return true;
        }
        return false;
    }

    /**
     * 重置 任务参数集合
     */
    @JsonIgnore
    public void resetTaskParams(){
        this.reset(FIELD_TASKPARAMS);
    }

    /**
     * 设置 任务参数集合
     * <P>
     * 等同 {@link #setTaskParams}
     * @param taskParams
     */
    @JsonIgnore
    public PSDCBKTaskDTO taskparams(String taskParams){
        this.setTaskParams(taskParams);
        return this;
    }

    /**
     * <B>USEROBOTFLAG</B>&nbsp;使用机器人
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.YesNo} 
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
    public PSDCBKTaskDTO userobotflag(Integer useRobotFlag){
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
    public PSDCBKTaskDTO userobotflag(Boolean useRobotFlag){
        if(useRobotFlag == null){
            this.setUseRobotFlag(null);
        }
        else{
            this.setUseRobotFlag(useRobotFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDCBKTaskDTO memo(String memo){
        this.setMemo(memo);
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
    public PSDCBKTaskDTO endtime(Timestamp endTime){
        this.setEndTime(endTime);
        return this;
    }

    /**
     * <B>PSDEVSLNNAME</B>&nbsp;开发方案
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVSLNID}
     */
    public final static String FIELD_PSDEVSLNNAME = "psdevslnname";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnName
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNNAME)
    public void setPSDevSlnName(String pSDevSlnName){
        this.set(FIELD_PSDEVSLNNAME, pSDevSlnName);
    }
    
    /**
     * 获取 开发方案  
     * @return
     */
    @JsonIgnore
    public String getPSDevSlnName(){
        Object objValue = this.get(FIELD_PSDEVSLNNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 开发方案 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevSlnNameDirty(){
        if(this.contains(FIELD_PSDEVSLNNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnName(){
        this.reset(FIELD_PSDEVSLNNAME);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnName}
     * @param pSDevSlnName
     */
    @JsonIgnore
    public PSDCBKTaskDTO psdevslnname(String pSDevSlnName){
        this.setPSDevSlnName(pSDevSlnName);
        return this;
    }

    /**
     * <B>PSDEVCENTERNAME</B>&nbsp;云应用中心
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEVCENTERID}
     */
    public final static String FIELD_PSDEVCENTERNAME = "psdevcentername";

    /**
     * 设置 云应用中心
     * 
     * @param pSDevCenterName
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERNAME)
    public void setPSDevCenterName(String pSDevCenterName){
        this.set(FIELD_PSDEVCENTERNAME, pSDevCenterName);
    }
    
    /**
     * 获取 云应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterName(){
        Object objValue = this.get(FIELD_PSDEVCENTERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterNameDirty(){
        if(this.contains(FIELD_PSDEVCENTERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterName(){
        this.reset(FIELD_PSDEVCENTERNAME);
    }

    /**
     * 设置 云应用中心
     * <P>
     * 等同 {@link #setPSDevCenterName}
     * @param pSDevCenterName
     */
    @JsonIgnore
    public PSDCBKTaskDTO psdevcentername(String pSDevCenterName){
        this.setPSDevCenterName(pSDevCenterName);
        return this;
    }

    /**
     * <B>PSDEVSLNID</B>&nbsp;开发方案
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVSLNID = "psdevslnid";

    /**
     * 设置 开发方案
     * 
     * @param pSDevSlnId
     * 
     */
    @JsonProperty(FIELD_PSDEVSLNID)
    public void setPSDevSlnId(String pSDevSlnId){
        this.set(FIELD_PSDEVSLNID, pSDevSlnId);
    }
    
    /**
     * 获取 开发方案  
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
     * 判断 开发方案 是否指定值，包括空值
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
     * 重置 开发方案
     */
    @JsonIgnore
    public void resetPSDevSlnId(){
        this.reset(FIELD_PSDEVSLNID);
    }

    /**
     * 设置 开发方案
     * <P>
     * 等同 {@link #setPSDevSlnId}
     * @param pSDevSlnId
     */
    @JsonIgnore
    public PSDCBKTaskDTO psdevslnid(String pSDevSlnId){
        this.setPSDevSlnId(pSDevSlnId);
        return this;
    }

    /**
     * <B>PSDEVCENTERID</B>&nbsp;云应用中心
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEVCENTERID = "psdevcenterid";

    /**
     * 设置 云应用中心
     * 
     * @param pSDevCenterId
     * 
     */
    @JsonProperty(FIELD_PSDEVCENTERID)
    public void setPSDevCenterId(String pSDevCenterId){
        this.set(FIELD_PSDEVCENTERID, pSDevCenterId);
    }
    
    /**
     * 获取 云应用中心  
     * @return
     */
    @JsonIgnore
    public String getPSDevCenterId(){
        Object objValue = this.get(FIELD_PSDEVCENTERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 云应用中心 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDevCenterIdDirty(){
        if(this.contains(FIELD_PSDEVCENTERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 云应用中心
     */
    @JsonIgnore
    public void resetPSDevCenterId(){
        this.reset(FIELD_PSDEVCENTERID);
    }

    /**
     * 设置 云应用中心
     * <P>
     * 等同 {@link #setPSDevCenterId}
     * @param pSDevCenterId
     */
    @JsonIgnore
    public PSDCBKTaskDTO psdevcenterid(String pSDevCenterId){
        this.setPSDevCenterId(pSDevCenterId);
        return this;
    }

    /**
     * <B>TASKSTATE</B>&nbsp;任务状态
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.SysDevBKTaskState} 
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
    public PSDCBKTaskDTO taskstate(Integer taskState){
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
    public PSDCBKTaskDTO taskstate(net.ibizsys.centralstudio.util.CentralEnums.SysDevBKTaskState taskState){
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
     * 值参考&nbsp;{@link net.ibizsys.centralstudio.util.CentralEnums.DCBKTaskType} 
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
    public PSDCBKTaskDTO tasktype(String taskType){
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
    public PSDCBKTaskDTO tasktype(net.ibizsys.centralstudio.util.CentralEnums.DCBKTaskType taskType){
        if(taskType == null){
            this.setTaskType(null);
        }
        else{
            this.setTaskType(taskType.value);
        }
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
    public PSDCBKTaskDTO psdevslnsysid(String pSDevSlnSysId){
        this.setPSDevSlnSysId(pSDevSlnSysId);
        return this;
    }

    @JsonIgnore
    @Override
    public Object getSrfkey(){
        return this.getPSDCBKTaskId();
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSDCBKTaskDTO){
            PSDCBKTaskDTO dto = (PSDCBKTaskDTO)iEntity;
        }
        super.copyTo(iEntity);
    }

    @Override
    protected Map<String, Object> prepareAny() {
        Map<String, Object> any = super.prepareAny();
        if(any != null){
            any.remove(FIELD_CREATEMAN);
            any.remove(FIELD_UPDATEMAN);
            any.remove(FIELD_CREATEDATE);
            any.remove(FIELD_UPDATEDATE);
        }
        return any;
    }
    
}