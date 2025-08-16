package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSCOREPRDINSTLOG</B>核心产品安装日志 模型传输对象
 * <P>
 * 
 */
public class PSCorePrdInstLog extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSCorePrdInstLog(){
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
    public void setBeginTime(String beginTime){
        this.set(FIELD_BEGINTIME, beginTime);
    }
    
    /**
     * 获取 开始时间  
     * @return
     */
    @JsonIgnore
    public String getBeginTime(){
        Object objValue = this.get(FIELD_BEGINTIME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSCorePrdInstLog begintime(String beginTime){
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
    public PSCorePrdInstLog createdate(String createDate){
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
    public PSCorePrdInstLog createman(String createMan){
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
    public void setEndTime(String endTime){
        this.set(FIELD_ENDTIME, endTime);
    }
    
    /**
     * 获取 结束时间  
     * @return
     */
    @JsonIgnore
    public String getEndTime(){
        Object objValue = this.get(FIELD_ENDTIME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
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
    public PSCorePrdInstLog endtime(String endTime){
        this.setEndTime(endTime);
        return this;
    }

    /**
     * <B>PSCOREPRDID</B>&nbsp;核心产品
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDID = "pscoreprdid";

    /**
     * 设置 核心产品
     * 
     * @param pSCorePrdId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDID)
    public void setPSCorePrdId(String pSCorePrdId){
        this.set(FIELD_PSCOREPRDID, pSCorePrdId);
    }
    
    /**
     * 获取 核心产品  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdId(){
        Object objValue = this.get(FIELD_PSCOREPRDID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 核心产品 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdIdDirty(){
        if(this.contains(FIELD_PSCOREPRDID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 核心产品
     */
    @JsonIgnore
    public void resetPSCorePrdId(){
        this.reset(FIELD_PSCOREPRDID);
    }

    /**
     * 设置 核心产品
     * <P>
     * 等同 {@link #setPSCorePrdId}
     * @param pSCorePrdId
     */
    @JsonIgnore
    public PSCorePrdInstLog pscoreprdid(String pSCorePrdId){
        this.setPSCorePrdId(pSCorePrdId);
        return this;
    }

    /**
     * <B>PSCOREPRDINSTLOGID</B>&nbsp;核心产品安装日志标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDINSTLOGID = "pscoreprdinstlogid";

    /**
     * 设置 核心产品安装日志标识
     * 
     * @param pSCorePrdInstLogId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDINSTLOGID)
    public void setPSCorePrdInstLogId(String pSCorePrdInstLogId){
        this.set(FIELD_PSCOREPRDINSTLOGID, pSCorePrdInstLogId);
    }
    
    /**
     * 获取 核心产品安装日志标识  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdInstLogId(){
        Object objValue = this.get(FIELD_PSCOREPRDINSTLOGID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 核心产品安装日志标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdInstLogIdDirty(){
        if(this.contains(FIELD_PSCOREPRDINSTLOGID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 核心产品安装日志标识
     */
    @JsonIgnore
    public void resetPSCorePrdInstLogId(){
        this.reset(FIELD_PSCOREPRDINSTLOGID);
    }

    /**
     * 设置 核心产品安装日志标识
     * <P>
     * 等同 {@link #setPSCorePrdInstLogId}
     * @param pSCorePrdInstLogId
     */
    @JsonIgnore
    public PSCorePrdInstLog pscoreprdinstlogid(String pSCorePrdInstLogId){
        this.setPSCorePrdInstLogId(pSCorePrdInstLogId);
        return this;
    }

    /**
     * <B>PSCOREPRDINSTLOGNAME</B>&nbsp;核心产品安装日志名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSCOREPRDINSTLOGNAME = "pscoreprdinstlogname";

    /**
     * 设置 核心产品安装日志名称
     * 
     * @param pSCorePrdInstLogName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDINSTLOGNAME)
    public void setPSCorePrdInstLogName(String pSCorePrdInstLogName){
        this.set(FIELD_PSCOREPRDINSTLOGNAME, pSCorePrdInstLogName);
    }
    
    /**
     * 获取 核心产品安装日志名称  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdInstLogName(){
        Object objValue = this.get(FIELD_PSCOREPRDINSTLOGNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 核心产品安装日志名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdInstLogNameDirty(){
        if(this.contains(FIELD_PSCOREPRDINSTLOGNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 核心产品安装日志名称
     */
    @JsonIgnore
    public void resetPSCorePrdInstLogName(){
        this.reset(FIELD_PSCOREPRDINSTLOGNAME);
    }

    /**
     * 设置 核心产品安装日志名称
     * <P>
     * 等同 {@link #setPSCorePrdInstLogName}
     * @param pSCorePrdInstLogName
     */
    @JsonIgnore
    public PSCorePrdInstLog pscoreprdinstlogname(String pSCorePrdInstLogName){
        this.setPSCorePrdInstLogName(pSCorePrdInstLogName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSCorePrdInstLogName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSCorePrdInstLogName(strName);
    }

    @JsonIgnore
    public PSCorePrdInstLog name(String strName){
        this.setPSCorePrdInstLogName(strName);
        return this;
    }

    /**
     * <B>PSCOREPRDNAME</B>&nbsp;核心产品
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDID}
     */
    public final static String FIELD_PSCOREPRDNAME = "pscoreprdname";

    /**
     * 设置 核心产品
     * 
     * @param pSCorePrdName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDNAME)
    public void setPSCorePrdName(String pSCorePrdName){
        this.set(FIELD_PSCOREPRDNAME, pSCorePrdName);
    }
    
    /**
     * 获取 核心产品  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdName(){
        Object objValue = this.get(FIELD_PSCOREPRDNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 核心产品 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdNameDirty(){
        if(this.contains(FIELD_PSCOREPRDNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 核心产品
     */
    @JsonIgnore
    public void resetPSCorePrdName(){
        this.reset(FIELD_PSCOREPRDNAME);
    }

    /**
     * 设置 核心产品
     * <P>
     * 等同 {@link #setPSCorePrdName}
     * @param pSCorePrdName
     */
    @JsonIgnore
    public PSCorePrdInstLog pscoreprdname(String pSCorePrdName){
        this.setPSCorePrdName(pSCorePrdName);
        return this;
    }

    /**
     * <B>PSCOREPRDVERID</B>&nbsp;产品版本
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSCOREPRDVERID = "pscoreprdverid";

    /**
     * 设置 产品版本
     * 
     * @param pSCorePrdVerId
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDVERID)
    public void setPSCorePrdVerId(String pSCorePrdVerId){
        this.set(FIELD_PSCOREPRDVERID, pSCorePrdVerId);
    }
    
    /**
     * 获取 产品版本  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdVerId(){
        Object objValue = this.get(FIELD_PSCOREPRDVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdVerIdDirty(){
        if(this.contains(FIELD_PSCOREPRDVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品版本
     */
    @JsonIgnore
    public void resetPSCorePrdVerId(){
        this.reset(FIELD_PSCOREPRDVERID);
    }

    /**
     * 设置 产品版本
     * <P>
     * 等同 {@link #setPSCorePrdVerId}
     * @param pSCorePrdVerId
     */
    @JsonIgnore
    public PSCorePrdInstLog pscoreprdverid(String pSCorePrdVerId){
        this.setPSCorePrdVerId(pSCorePrdVerId);
        return this;
    }

    /**
     * <B>PSCOREPRDVERNAME</B>&nbsp;产品版本
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSCOREPRDVERID}
     */
    public final static String FIELD_PSCOREPRDVERNAME = "pscoreprdvername";

    /**
     * 设置 产品版本
     * 
     * @param pSCorePrdVerName
     * 
     */
    @JsonProperty(FIELD_PSCOREPRDVERNAME)
    public void setPSCorePrdVerName(String pSCorePrdVerName){
        this.set(FIELD_PSCOREPRDVERNAME, pSCorePrdVerName);
    }
    
    /**
     * 获取 产品版本  
     * @return
     */
    @JsonIgnore
    public String getPSCorePrdVerName(){
        Object objValue = this.get(FIELD_PSCOREPRDVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 产品版本 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSCorePrdVerNameDirty(){
        if(this.contains(FIELD_PSCOREPRDVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 产品版本
     */
    @JsonIgnore
    public void resetPSCorePrdVerName(){
        this.reset(FIELD_PSCOREPRDVERNAME);
    }

    /**
     * 设置 产品版本
     * <P>
     * 等同 {@link #setPSCorePrdVerName}
     * @param pSCorePrdVerName
     */
    @JsonIgnore
    public PSCorePrdInstLog pscoreprdvername(String pSCorePrdVerName){
        this.setPSCorePrdVerName(pSCorePrdVerName);
        return this;
    }

    /**
     * <B>PSSTUDIOSERVERID</B>&nbsp;配置服务器
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSTUDIOSERVERID = "psstudioserverid";

    /**
     * 设置 配置服务器
     * 
     * @param pSStudioServerId
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOSERVERID)
    public void setPSStudioServerId(String pSStudioServerId){
        this.set(FIELD_PSSTUDIOSERVERID, pSStudioServerId);
    }
    
    /**
     * 获取 配置服务器  
     * @return
     */
    @JsonIgnore
    public String getPSStudioServerId(){
        Object objValue = this.get(FIELD_PSSTUDIOSERVERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 配置服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioServerIdDirty(){
        if(this.contains(FIELD_PSSTUDIOSERVERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 配置服务器
     */
    @JsonIgnore
    public void resetPSStudioServerId(){
        this.reset(FIELD_PSSTUDIOSERVERID);
    }

    /**
     * 设置 配置服务器
     * <P>
     * 等同 {@link #setPSStudioServerId}
     * @param pSStudioServerId
     */
    @JsonIgnore
    public PSCorePrdInstLog psstudioserverid(String pSStudioServerId){
        this.setPSStudioServerId(pSStudioServerId);
        return this;
    }

    /**
     * <B>PSSTUDIOSERVERNAME</B>&nbsp;配置服务器
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSTUDIOSERVERID}
     */
    public final static String FIELD_PSSTUDIOSERVERNAME = "psstudioservername";

    /**
     * 设置 配置服务器
     * 
     * @param pSStudioServerName
     * 
     */
    @JsonProperty(FIELD_PSSTUDIOSERVERNAME)
    public void setPSStudioServerName(String pSStudioServerName){
        this.set(FIELD_PSSTUDIOSERVERNAME, pSStudioServerName);
    }
    
    /**
     * 获取 配置服务器  
     * @return
     */
    @JsonIgnore
    public String getPSStudioServerName(){
        Object objValue = this.get(FIELD_PSSTUDIOSERVERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 配置服务器 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSStudioServerNameDirty(){
        if(this.contains(FIELD_PSSTUDIOSERVERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 配置服务器
     */
    @JsonIgnore
    public void resetPSStudioServerName(){
        this.reset(FIELD_PSSTUDIOSERVERNAME);
    }

    /**
     * 设置 配置服务器
     * <P>
     * 等同 {@link #setPSStudioServerName}
     * @param pSStudioServerName
     */
    @JsonIgnore
    public PSCorePrdInstLog psstudioservername(String pSStudioServerName){
        this.setPSStudioServerName(pSStudioServerName);
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
    public PSCorePrdInstLog pstaskserverid(String pSTaskServerId){
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
    public PSCorePrdInstLog pstaskservername(String pSTaskServerName){
        this.setPSTaskServerName(pSTaskServerName);
        return this;
    }

    /**
     * <B>RESULTINFO</B>&nbsp;结果信息
     */
    public final static String FIELD_RESULTINFO = "resultinfo";

    /**
     * 设置 结果信息
     * 
     * @param resultInfo
     * 
     */
    @JsonProperty(FIELD_RESULTINFO)
    public void setResultInfo(String resultInfo){
        this.set(FIELD_RESULTINFO, resultInfo);
    }
    
    /**
     * 获取 结果信息  
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
     * 判断 结果信息 是否指定值，包括空值
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
     * 重置 结果信息
     */
    @JsonIgnore
    public void resetResultInfo(){
        this.reset(FIELD_RESULTINFO);
    }

    /**
     * 设置 结果信息
     * <P>
     * 等同 {@link #setResultInfo}
     * @param resultInfo
     */
    @JsonIgnore
    public PSCorePrdInstLog resultinfo(String resultInfo){
        this.setResultInfo(resultInfo);
        return this;
    }

    /**
     * <B>RESULTINFO2</B>&nbsp;结果信息2
     */
    public final static String FIELD_RESULTINFO2 = "resultinfo2";

    /**
     * 设置 结果信息2
     * 
     * @param resultInfo2
     * 
     */
    @JsonProperty(FIELD_RESULTINFO2)
    public void setResultInfo2(String resultInfo2){
        this.set(FIELD_RESULTINFO2, resultInfo2);
    }
    
    /**
     * 获取 结果信息2  
     * @return
     */
    @JsonIgnore
    public String getResultInfo2(){
        Object objValue = this.get(FIELD_RESULTINFO2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果信息2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResultInfo2Dirty(){
        if(this.contains(FIELD_RESULTINFO2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果信息2
     */
    @JsonIgnore
    public void resetResultInfo2(){
        this.reset(FIELD_RESULTINFO2);
    }

    /**
     * 设置 结果信息2
     * <P>
     * 等同 {@link #setResultInfo2}
     * @param resultInfo2
     */
    @JsonIgnore
    public PSCorePrdInstLog resultinfo2(String resultInfo2){
        this.setResultInfo2(resultInfo2);
        return this;
    }

    /**
     * <B>RESULTINFO3</B>&nbsp;结果信息3
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_RESULTINFO3 = "resultinfo3";

    /**
     * 设置 结果信息3
     * 
     * @param resultInfo3
     * 
     */
    @JsonProperty(FIELD_RESULTINFO3)
    public void setResultInfo3(String resultInfo3){
        this.set(FIELD_RESULTINFO3, resultInfo3);
    }
    
    /**
     * 获取 结果信息3  
     * @return
     */
    @JsonIgnore
    public String getResultInfo3(){
        Object objValue = this.get(FIELD_RESULTINFO3);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果信息3 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResultInfo3Dirty(){
        if(this.contains(FIELD_RESULTINFO3)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果信息3
     */
    @JsonIgnore
    public void resetResultInfo3(){
        this.reset(FIELD_RESULTINFO3);
    }

    /**
     * 设置 结果信息3
     * <P>
     * 等同 {@link #setResultInfo3}
     * @param resultInfo3
     */
    @JsonIgnore
    public PSCorePrdInstLog resultinfo3(String resultInfo3){
        this.setResultInfo3(resultInfo3);
        return this;
    }

    /**
     * <B>RESULTINFO4</B>&nbsp;结果信息4
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_RESULTINFO4 = "resultinfo4";

    /**
     * 设置 结果信息4
     * 
     * @param resultInfo4
     * 
     */
    @JsonProperty(FIELD_RESULTINFO4)
    public void setResultInfo4(String resultInfo4){
        this.set(FIELD_RESULTINFO4, resultInfo4);
    }
    
    /**
     * 获取 结果信息4  
     * @return
     */
    @JsonIgnore
    public String getResultInfo4(){
        Object objValue = this.get(FIELD_RESULTINFO4);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 结果信息4 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isResultInfo4Dirty(){
        if(this.contains(FIELD_RESULTINFO4)){
            return true;
        }
        return false;
    }

    /**
     * 重置 结果信息4
     */
    @JsonIgnore
    public void resetResultInfo4(){
        this.reset(FIELD_RESULTINFO4);
    }

    /**
     * 设置 结果信息4
     * <P>
     * 等同 {@link #setResultInfo4}
     * @param resultInfo4
     */
    @JsonIgnore
    public PSCorePrdInstLog resultinfo4(String resultInfo4){
        this.setResultInfo4(resultInfo4);
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
    public PSCorePrdInstLog updatedate(String updateDate){
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
    public PSCorePrdInstLog updateman(String updateMan){
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSCorePrdInstLogId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSCorePrdInstLogId(strValue);
    }

    @JsonIgnore
    public PSCorePrdInstLog id(String strValue){
        this.setPSCorePrdInstLogId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSCorePrdInstLog){
            PSCorePrdInstLog model = (PSCorePrdInstLog)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
