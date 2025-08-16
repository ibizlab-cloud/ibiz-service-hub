package net.ibizsys.centralstudio.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSAPPDERS</B>应用实体关系 模型传输对象
 * <P>
 * 前端应用实体的关系模型，定义应用实体之间的关系及相应的处理信息
 */
public class PSAppDERSDTO extends net.ibizsys.centralstudio.util.PSModelDTOBase {

    public PSAppDERSDTO(){
    }      

    /**
     * <B>ARRAYFLAG</B>&nbsp;是否数组，指定应用实体对象关系是否为数组模式，未定义时为【是】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ARRAYFLAG = "arrayflag";

    /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * 
     * @param arrayFlag
     * 
     */
    @JsonProperty(FIELD_ARRAYFLAG)
    public void setArrayFlag(Integer arrayFlag){
        this.set(FIELD_ARRAYFLAG, arrayFlag);
    }
    
    /**
     * 获取 是否数组  
     * @return
     */
    @JsonIgnore
    public Integer getArrayFlag(){
        Object objValue = this.get(FIELD_ARRAYFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 是否数组 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isArrayFlagDirty(){
        if(this.contains(FIELD_ARRAYFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 是否数组
     */
    @JsonIgnore
    public void resetArrayFlag(){
        this.reset(FIELD_ARRAYFLAG);
    }

    /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSAppDERSDTO arrayflag(Integer arrayFlag){
        this.setArrayFlag(arrayFlag);
        return this;
    }

     /**
     * 设置 是否数组，详细说明：{@link #FIELD_ARRAYFLAG}
     * <P>
     * 等同 {@link #setArrayFlag}
     * @param arrayFlag
     */
    @JsonIgnore
    public PSAppDERSDTO arrayflag(Boolean arrayFlag){
        if(arrayFlag == null){
            this.setArrayFlag(null);
        }
        else{
            this.setArrayFlag(arrayFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>CHILDFILTER</B>&nbsp;自定义关系项，指定应用实体关系的自定义关系项，在未指定实体关系或自定义时使用
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CHILDFILTER = "childfilter";

    /**
     * 设置 自定义关系项，详细说明：{@link #FIELD_CHILDFILTER}
     * 
     * @param childFilter
     * 
     */
    @JsonProperty(FIELD_CHILDFILTER)
    public void setChildFilter(String childFilter){
        this.set(FIELD_CHILDFILTER, childFilter);
    }
    
    /**
     * 获取 自定义关系项  
     * @return
     */
    @JsonIgnore
    public String getChildFilter(){
        Object objValue = this.get(FIELD_CHILDFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义关系项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isChildFilterDirty(){
        if(this.contains(FIELD_CHILDFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义关系项
     */
    @JsonIgnore
    public void resetChildFilter(){
        this.reset(FIELD_CHILDFILTER);
    }

    /**
     * 设置 自定义关系项，详细说明：{@link #FIELD_CHILDFILTER}
     * <P>
     * 等同 {@link #setChildFilter}
     * @param childFilter
     */
    @JsonIgnore
    public PSAppDERSDTO childfilter(String childFilter){
        this.setChildFilter(childFilter);
        return this;
    }

    /**
     * <B>CODENAME</B>&nbsp;代码标识，指定应用实体关系的代码标识，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_CODENAME = "codename";

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * 
     * @param codeName
     * 
     */
    @JsonProperty(FIELD_CODENAME)
    public void setCodeName(String codeName){
        this.set(FIELD_CODENAME, codeName);
    }
    
    /**
     * 获取 代码标识  
     * @return
     */
    @JsonIgnore
    public String getCodeName(){
        Object objValue = this.get(FIELD_CODENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeNameDirty(){
        if(this.contains(FIELD_CODENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识
     */
    @JsonIgnore
    public void resetCodeName(){
        this.reset(FIELD_CODENAME);
    }

    /**
     * 设置 代码标识，详细说明：{@link #FIELD_CODENAME}
     * <P>
     * 等同 {@link #setCodeName}
     * @param codeName
     */
    @JsonIgnore
    public PSAppDERSDTO codename(String codeName){
        this.setCodeName(codeName);
        return this;
    }

    /**
     * <B>CODENAME2</B>&nbsp;代码标识2，指定应用实体关系的代码标识2
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_CODENAME2 = "codename2";

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * 
     * @param codeName2
     * 
     */
    @JsonProperty(FIELD_CODENAME2)
    public void setCodeName2(String codeName2){
        this.set(FIELD_CODENAME2, codeName2);
    }
    
    /**
     * 获取 代码标识2  
     * @return
     */
    @JsonIgnore
    public String getCodeName2(){
        Object objValue = this.get(FIELD_CODENAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 代码标识2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCodeName2Dirty(){
        if(this.contains(FIELD_CODENAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 代码标识2
     */
    @JsonIgnore
    public void resetCodeName2(){
        this.reset(FIELD_CODENAME2);
    }

    /**
     * 设置 代码标识2，详细说明：{@link #FIELD_CODENAME2}
     * <P>
     * 等同 {@link #setCodeName2}
     * @param codeName2
     */
    @JsonIgnore
    public PSAppDERSDTO codename2(String codeName2){
        this.setCodeName2(codeName2);
        return this;
    }

    /**
     * <B>CPSAPPDATAENTITYID</B>&nbsp;从应用实体，指定应用实体关系的从应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO} 
     */
    public final static String FIELD_CPSAPPDATAENTITYID = "cpsappdataentityid";

    /**
     * 设置 从应用实体，详细说明：{@link #FIELD_CPSAPPDATAENTITYID}
     * 
     * @param cPSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_CPSAPPDATAENTITYID)
    public void setCPSAppDataEntityId(String cPSAppDataEntityId){
        this.set(FIELD_CPSAPPDATAENTITYID, cPSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("cpsapplocaldeid", cPSAppDataEntityId);
    }
    
    /**
     * 获取 从应用实体  
     * @return
     */
    @JsonIgnore
    public String getCPSAppDataEntityId(){
        Object objValue = this.get(FIELD_CPSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("cpsapplocaldeid");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 从应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_CPSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("cpsapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 从应用实体
     */
    @JsonIgnore
    public void resetCPSAppDataEntityId(){
        this.reset(FIELD_CPSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("cpsapplocaldeid");
    }

    /**
     * 设置 从应用实体，详细说明：{@link #FIELD_CPSAPPDATAENTITYID}
     * <P>
     * 等同 {@link #setCPSAppDataEntityId}
     * @param cPSAppDataEntityId
     */
    @JsonIgnore
    public PSAppDERSDTO cpsappdataentityid(String cPSAppDataEntityId){
        this.setCPSAppDataEntityId(cPSAppDataEntityId);
        return this;
    }

    /**
     * 设置 从应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setCPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppDERSDTO cpsappdataentityid(PSAppDataEntityDTO pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setCPSAppDataEntityId(null);
            this.setCPSAppDataEntityName(null);
        }
        else{
            this.setCPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setCPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getCPSAppLocalDEId(){
        return this.getCPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setCPSAppLocalDEId(String cPSAppLocalDEId){
        this.setCPSAppDataEntityId(cPSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isCPSAppLocalDEIdDirty(){
        return this.isCPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetCPSAppLocalDEId(){
        this.resetCPSAppDataEntityId();
    }

    /**
     * <B>CPSAPPDATAENTITYNAME</B>&nbsp;从应用实体，指定应用实体关系的从应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_CPSAPPDATAENTITYID}
     */
    public final static String FIELD_CPSAPPDATAENTITYNAME = "cpsappdataentityname";

    /**
     * 设置 从应用实体，详细说明：{@link #FIELD_CPSAPPDATAENTITYNAME}
     * 
     * @param cPSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_CPSAPPDATAENTITYNAME)
    public void setCPSAppDataEntityName(String cPSAppDataEntityName){
        this.set(FIELD_CPSAPPDATAENTITYNAME, cPSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("cpsapplocaldename", cPSAppDataEntityName);
    }
    
    /**
     * 获取 从应用实体  
     * @return
     */
    @JsonIgnore
    public String getCPSAppDataEntityName(){
        Object objValue = this.get(FIELD_CPSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("cpsapplocaldename");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 从应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_CPSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("cpsapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 从应用实体
     */
    @JsonIgnore
    public void resetCPSAppDataEntityName(){
        this.reset(FIELD_CPSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("cpsapplocaldename");
    }

    /**
     * 设置 从应用实体，详细说明：{@link #FIELD_CPSAPPDATAENTITYNAME}
     * <P>
     * 等同 {@link #setCPSAppDataEntityName}
     * @param cPSAppDataEntityName
     */
    @JsonIgnore
    public PSAppDERSDTO cpsappdataentityname(String cPSAppDataEntityName){
        this.setCPSAppDataEntityName(cPSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getCPSAppLocalDEName(){
        return this.getCPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setCPSAppLocalDEName(String cPSAppLocalDEName){
        this.setCPSAppDataEntityName(cPSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isCPSAppLocalDENameDirty(){
        return this.isCPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetCPSAppLocalDEName(){
        this.resetCPSAppDataEntityName();
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
    public PSAppDERSDTO createdate(Timestamp createDate){
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
    public PSAppDERSDTO createman(String createMan){
        this.setCreateMan(createMan);
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
    public PSAppDERSDTO memo(String memo){
        this.setMemo(memo);
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
    public PSAppDERSDTO ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PPSAPPDATAENTITYID</B>&nbsp;父应用实体，指定应用实体关系的主应用实体
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSAppDataEntityDTO} 
     */
    public final static String FIELD_PPSAPPDATAENTITYID = "ppsappdataentityid";

    /**
     * 设置 父应用实体，详细说明：{@link #FIELD_PPSAPPDATAENTITYID}
     * 
     * @param pPSAppDataEntityId
     * 
     */
    @JsonProperty(FIELD_PPSAPPDATAENTITYID)
    public void setPPSAppDataEntityId(String pPSAppDataEntityId){
        this.set(FIELD_PPSAPPDATAENTITYID, pPSAppDataEntityId);
        //属性名称与代码标识不一致，设置属性名称
        this.set("ppsapplocaldeid", pPSAppDataEntityId);
    }
    
    /**
     * 获取 父应用实体  
     * @return
     */
    @JsonIgnore
    public String getPPSAppDataEntityId(){
        Object objValue = this.get(FIELD_PPSAPPDATAENTITYID);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("ppsapplocaldeid");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 父应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppDataEntityIdDirty(){
        if(this.contains(FIELD_PPSAPPDATAENTITYID)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("ppsapplocaldeid")){
            return true;
        }
        return false;
    }

    /**
     * 重置 父应用实体
     */
    @JsonIgnore
    public void resetPPSAppDataEntityId(){
        this.reset(FIELD_PPSAPPDATAENTITYID);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("ppsapplocaldeid");
    }

    /**
     * 设置 父应用实体，详细说明：{@link #FIELD_PPSAPPDATAENTITYID}
     * <P>
     * 等同 {@link #setPPSAppDataEntityId}
     * @param pPSAppDataEntityId
     */
    @JsonIgnore
    public PSAppDERSDTO ppsappdataentityid(String pPSAppDataEntityId){
        this.setPPSAppDataEntityId(pPSAppDataEntityId);
        return this;
    }

    /**
     * 设置 父应用实体，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPPSAppDataEntityId}
     * @param pSAppDataEntity 引用对象
     */
    @JsonIgnore
    public PSAppDERSDTO ppsappdataentityid(PSAppDataEntityDTO pSAppDataEntity){
        if(pSAppDataEntity == null){
            this.setPPSAppDataEntityId(null);
            this.setPPSAppDataEntityName(null);
        }
        else{
            this.setPPSAppDataEntityId(pSAppDataEntity.getPSAppDataEntityId());
            this.setPPSAppDataEntityName(pSAppDataEntity.getPSAppDataEntityName());
        }
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPPSAppLocalDEId(){
        return this.getPPSAppDataEntityId();
    }

    @JsonIgnore
    @Deprecated        
    public void setPPSAppLocalDEId(String pPSAppLocalDEId){
        this.setPPSAppDataEntityId(pPSAppLocalDEId);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPPSAppLocalDEIdDirty(){
        return this.isPPSAppDataEntityIdDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPPSAppLocalDEId(){
        this.resetPPSAppDataEntityId();
    }

    /**
     * <B>PPSAPPDATAENTITYNAME</B>&nbsp;主应用实体，指定应用实体关系的主应用实体
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PPSAPPDATAENTITYID}
     */
    public final static String FIELD_PPSAPPDATAENTITYNAME = "ppsappdataentityname";

    /**
     * 设置 主应用实体，详细说明：{@link #FIELD_PPSAPPDATAENTITYNAME}
     * 
     * @param pPSAppDataEntityName
     * 
     */
    @JsonProperty(FIELD_PPSAPPDATAENTITYNAME)
    public void setPPSAppDataEntityName(String pPSAppDataEntityName){
        this.set(FIELD_PPSAPPDATAENTITYNAME, pPSAppDataEntityName);
        //属性名称与代码标识不一致，设置属性名称
        this.set("ppsapplocaldename", pPSAppDataEntityName);
    }
    
    /**
     * 获取 主应用实体  
     * @return
     */
    @JsonIgnore
    public String getPPSAppDataEntityName(){
        Object objValue = this.get(FIELD_PPSAPPDATAENTITYNAME);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("ppsapplocaldename");
            if(objValue == null){
                    return null;
            }
        }
        return (String)objValue;
    }

    /**
     * 判断 主应用实体 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPPSAppDataEntityNameDirty(){
        if(this.contains(FIELD_PPSAPPDATAENTITYNAME)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("ppsapplocaldename")){
            return true;
        }
        return false;
    }

    /**
     * 重置 主应用实体
     */
    @JsonIgnore
    public void resetPPSAppDataEntityName(){
        this.reset(FIELD_PPSAPPDATAENTITYNAME);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("ppsapplocaldename");
    }

    /**
     * 设置 主应用实体，详细说明：{@link #FIELD_PPSAPPDATAENTITYNAME}
     * <P>
     * 等同 {@link #setPPSAppDataEntityName}
     * @param pPSAppDataEntityName
     */
    @JsonIgnore
    public PSAppDERSDTO ppsappdataentityname(String pPSAppDataEntityName){
        this.setPPSAppDataEntityName(pPSAppDataEntityName);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public String getPPSAppLocalDEName(){
        return this.getPPSAppDataEntityName();
    }

    @JsonIgnore
    @Deprecated        
    public void setPPSAppLocalDEName(String pPSAppLocalDEName){
        this.setPPSAppDataEntityName(pPSAppLocalDEName);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPPSAppLocalDENameDirty(){
        return this.isPPSAppDataEntityNameDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPPSAppLocalDEName(){
        this.resetPPSAppDataEntityName();
    }

    /**
     * <B>PSAPPDERSID</B>&nbsp;应用实体关系标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSAPPDERSID = "psappdersid";

    /**
     * 设置 应用实体关系标识
     * 
     * @param pSAppDERSId
     * 
     */
    @JsonProperty(FIELD_PSAPPDERSID)
    public void setPSAppDERSId(String pSAppDERSId){
        this.set(FIELD_PSAPPDERSID, pSAppDERSId);
    }
    
    /**
     * 获取 应用实体关系标识  
     * @return
     */
    @JsonIgnore
    public String getPSAppDERSId(){
        Object objValue = this.get(FIELD_PSAPPDERSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 应用实体关系标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDERSIdDirty(){
        if(this.contains(FIELD_PSAPPDERSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 应用实体关系标识
     */
    @JsonIgnore
    public void resetPSAppDERSId(){
        this.reset(FIELD_PSAPPDERSID);
    }

    /**
     * 设置 应用实体关系标识
     * <P>
     * 等同 {@link #setPSAppDERSId}
     * @param pSAppDERSId
     */
    @JsonIgnore
    public PSAppDERSDTO psappdersid(String pSAppDERSId){
        this.setPSAppDERSId(pSAppDERSId);
        return this;
    }

    /**
     * <B>PSAPPDERSNAME</B>&nbsp;关系名称，指定应用实体关系的名称，需在所在前端应用中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSAPPDERSNAME = "psappdersname";

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSAPPDERSNAME}
     * 
     * @param pSAppDERSName
     * 
     */
    @JsonProperty(FIELD_PSAPPDERSNAME)
    public void setPSAppDERSName(String pSAppDERSName){
        this.set(FIELD_PSAPPDERSNAME, pSAppDERSName);
    }
    
    /**
     * 获取 关系名称  
     * @return
     */
    @JsonIgnore
    public String getPSAppDERSName(){
        Object objValue = this.get(FIELD_PSAPPDERSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 关系名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSAppDERSNameDirty(){
        if(this.contains(FIELD_PSAPPDERSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 关系名称
     */
    @JsonIgnore
    public void resetPSAppDERSName(){
        this.reset(FIELD_PSAPPDERSNAME);
    }

    /**
     * 设置 关系名称，详细说明：{@link #FIELD_PSAPPDERSNAME}
     * <P>
     * 等同 {@link #setPSAppDERSName}
     * @param pSAppDERSName
     */
    @JsonIgnore
    public PSAppDERSDTO psappdersname(String pSAppDERSName){
        this.setPSAppDERSName(pSAppDERSName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSAppDERSName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSAppDERSName(strName);
    }

    @JsonIgnore
    public PSAppDERSDTO name(String strName){
        this.setPSAppDERSName(strName);
        return this;
    }

    /**
     * <B>PSDERID</B>&nbsp;实体关系，指定应用实体关系相关的实体关系
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSDERDTO} 
     */
    public final static String FIELD_PSDERID = "psderid";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * 
     * @param pSDERId
     * 
     */
    @JsonProperty(FIELD_PSDERID)
    public void setPSDERId(String pSDERId){
        this.set(FIELD_PSDERID, pSDERId);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERId(){
        Object objValue = this.get(FIELD_PSDERID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERIdDirty(){
        if(this.contains(FIELD_PSDERID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERId(){
        this.reset(FIELD_PSDERID);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERID}
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDERId
     */
    @JsonIgnore
    public PSAppDERSDTO psderid(String pSDERId){
        this.setPSDERId(pSDERId);
        return this;
    }

    /**
     * 设置 实体关系，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDERId}
     * @param pSDER 引用对象
     */
    @JsonIgnore
    public PSAppDERSDTO psderid(PSDERDTO pSDER){
        if(pSDER == null){
            this.setPSDERId(null);
            this.setPSDERName(null);
        }
        else{
            this.setPSDERId(pSDER.getPSDERId());
            this.setPSDERName(pSDER.getPSDERName());
        }
        return this;
    }

    /**
     * <B>PSDERNAME</B>&nbsp;实体关系，指定应用实体关系相关的实体关系
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDERID}
     */
    public final static String FIELD_PSDERNAME = "psdername";

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * 
     * @param pSDERName
     * 
     */
    @JsonProperty(FIELD_PSDERNAME)
    public void setPSDERName(String pSDERName){
        this.set(FIELD_PSDERNAME, pSDERName);
    }
    
    /**
     * 获取 实体关系  
     * @return
     */
    @JsonIgnore
    public String getPSDERName(){
        Object objValue = this.get(FIELD_PSDERNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体关系 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDERNameDirty(){
        if(this.contains(FIELD_PSDERNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体关系
     */
    @JsonIgnore
    public void resetPSDERName(){
        this.reset(FIELD_PSDERNAME);
    }

    /**
     * 设置 实体关系，详细说明：{@link #FIELD_PSDERNAME}
     * <P>
     * 等同 {@link #setPSDERName}
     * @param pSDERName
     */
    @JsonIgnore
    public PSAppDERSDTO psdername(String pSDERName){
        this.setPSDERName(pSDERName);
        return this;
    }

    /**
     * <B>PSSYSAPPID</B>&nbsp;前端应用，指定应用实体关系所属的前端应用
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.centralstudio.dto.PSSysAppDTO} 
     */
    public final static String FIELD_PSSYSAPPID = "pssysappid";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPID}
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
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPID}
     * <P>
     * 等同 {@link #setPSSysAppId}
     * @param pSSysAppId
     */
    @JsonIgnore
    public PSAppDERSDTO pssysappid(String pSSysAppId){
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
    public PSAppDERSDTO pssysappid(PSSysAppDTO pSSysApp){
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
     * <B>PSSYSAPPNAME</B>&nbsp;前端应用，指定应用实体关系所属的前端应用
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSAPPID}
     */
    public final static String FIELD_PSSYSAPPNAME = "pssysappname";

    /**
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
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
     * 设置 前端应用，详细说明：{@link #FIELD_PSSYSAPPNAME}
     * <P>
     * 等同 {@link #setPSSysAppName}
     * @param pSSysAppName
     */
    @JsonIgnore
    public PSAppDERSDTO pssysappname(String pSSysAppName){
        this.setPSSysAppName(pSSysAppName);
        return this;
    }

    /**
     * <B>TYPEFILTER</B>&nbsp;类型过滤项
     * <P>
     * 字符串：最大长度 50
     */
    public final static String FIELD_TYPEFILTER = "typefilter";

    /**
     * 设置 类型过滤项
     * 
     * @param typeFilter
     * 
     */
    @JsonProperty(FIELD_TYPEFILTER)
    public void setTypeFilter(String typeFilter){
        this.set(FIELD_TYPEFILTER, typeFilter);
    }
    
    /**
     * 获取 类型过滤项  
     * @return
     */
    @JsonIgnore
    public String getTypeFilter(){
        Object objValue = this.get(FIELD_TYPEFILTER);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 类型过滤项 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isTypeFilterDirty(){
        if(this.contains(FIELD_TYPEFILTER)){
            return true;
        }
        return false;
    }

    /**
     * 重置 类型过滤项
     */
    @JsonIgnore
    public void resetTypeFilter(){
        this.reset(FIELD_TYPEFILTER);
    }

    /**
     * 设置 类型过滤项
     * <P>
     * 等同 {@link #setTypeFilter}
     * @param typeFilter
     */
    @JsonIgnore
    public PSAppDERSDTO typefilter(String typeFilter){
        this.setTypeFilter(typeFilter);
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
    public PSAppDERSDTO updatedate(Timestamp updateDate){
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
    public PSAppDERSDTO updateman(String updateMan){
        this.setUpdateMan(updateMan);
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
    public PSAppDERSDTO usertag(String userTag){
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
    public PSAppDERSDTO usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.model.PSModelEnums.YesNo} 
     */
    public final static String FIELD_VALIDFLAG = "validflag";

    /**
     * 设置 启用
     * 
     * @param validFlag
     * 
     */
    @JsonProperty(FIELD_VALIDFLAG)
    public void setValidFlag(Integer validFlag){
        this.set(FIELD_VALIDFLAG, validFlag);
    }
    
    /**
     * 获取 启用  
     * @return
     */
    @JsonIgnore
    public Integer getValidFlag(){
        Object objValue = this.get(FIELD_VALIDFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isValidFlagDirty(){
        if(this.contains(FIELD_VALIDFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用
     */
    @JsonIgnore
    public void resetValidFlag(){
        this.reset(FIELD_VALIDFLAG);
    }

    /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSAppDERSDTO validflag(Integer validFlag){
        this.setValidFlag(validFlag);
        return this;
    }

     /**
     * 设置 启用
     * <P>
     * 等同 {@link #setValidFlag}
     * @param validFlag
     */
    @JsonIgnore
    public PSAppDERSDTO validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    @Override
    public String getSrfkey(){
        return this.getPSAppDERSId();
    }

    @JsonIgnore
    public void setSrfkey(String strValue){
        this.setPSAppDERSId(strValue);
    }

    @JsonIgnore
    public String getId(){
        return this.getPSAppDERSId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSAppDERSId(strValue);
    }

    @JsonIgnore
    public PSAppDERSDTO id(String strValue){
        this.setPSAppDERSId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.centralstudio.util.IEntity iEntity){
        if(iEntity instanceof PSAppDERSDTO){
            PSAppDERSDTO dto = (PSAppDERSDTO)iEntity;
        }
        super.copyTo(iEntity);
    }
}
