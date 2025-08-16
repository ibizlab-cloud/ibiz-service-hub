package net.ibizsys.psmodel.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <B>PSSYSDBPROCPARAM</B>系统数据库存储过程参数 模型传输对象
 * <P>
 * 数据库存储过程参数模型，定义参数的类型、次序、输入输出等信息
 */
public class PSSysDBProcParam extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSSysDBProcParam(){
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
    public PSSysDBProcParam createdate(String createDate){
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
    public PSSysDBProcParam createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>DEFAULTVALUE</B>&nbsp;数据库默认值，指定过程参数的默认值
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_DEFAULTVALUE = "defaultvalue";

    /**
     * 设置 数据库默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * 
     * @param defaultValue
     * 
     */
    @JsonProperty(FIELD_DEFAULTVALUE)
    public void setDefaultValue(String defaultValue){
        this.set(FIELD_DEFAULTVALUE, defaultValue);
    }
    
    /**
     * 获取 数据库默认值  
     * @return
     */
    @JsonIgnore
    public String getDefaultValue(){
        Object objValue = this.get(FIELD_DEFAULTVALUE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据库默认值 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultValueDirty(){
        if(this.contains(FIELD_DEFAULTVALUE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据库默认值
     */
    @JsonIgnore
    public void resetDefaultValue(){
        this.reset(FIELD_DEFAULTVALUE);
    }

    /**
     * 设置 数据库默认值，详细说明：{@link #FIELD_DEFAULTVALUE}
     * <P>
     * 等同 {@link #setDefaultValue}
     * @param defaultValue
     */
    @JsonIgnore
    public PSSysDBProcParam defaultvalue(String defaultValue){
        this.setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <B>LENGTH</B>&nbsp;长度，指定过程参数的数据类型长度
     */
    public final static String FIELD_LENGTH = "length";

    /**
     * 设置 长度，详细说明：{@link #FIELD_LENGTH}
     * 
     * @param length
     * 
     */
    @JsonProperty(FIELD_LENGTH)
    public void setLength(Integer length){
        this.set(FIELD_LENGTH, length);
    }
    
    /**
     * 获取 长度  
     * @return
     */
    @JsonIgnore
    public Integer getLength(){
        Object objValue = this.get(FIELD_LENGTH);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 长度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isLengthDirty(){
        if(this.contains(FIELD_LENGTH)){
            return true;
        }
        return false;
    }

    /**
     * 重置 长度
     */
    @JsonIgnore
    public void resetLength(){
        this.reset(FIELD_LENGTH);
    }

    /**
     * 设置 长度，详细说明：{@link #FIELD_LENGTH}
     * <P>
     * 等同 {@link #setLength}
     * @param length
     */
    @JsonIgnore
    public PSSysDBProcParam length(Integer length){
        this.setLength(length);
        return this;
    }

    /**
     * <B>LOGICNAME</B>&nbsp;逻辑名称，指定过程参数的逻辑名称
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_LOGICNAME = "logicname";

    /**
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
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
     * 设置 逻辑名称，详细说明：{@link #FIELD_LOGICNAME}
     * <P>
     * 等同 {@link #setLogicName}
     * @param logicName
     */
    @JsonIgnore
    public PSSysDBProcParam logicname(String logicName){
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
    public PSSysDBProcParam memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORDERVALUE</B>&nbsp;排序值，指定过程参数的次序
     */
    public final static String FIELD_ORDERVALUE = "ordervalue";

    /**
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
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
     * 设置 排序值，详细说明：{@link #FIELD_ORDERVALUE}
     * <P>
     * 等同 {@link #setOrderValue}
     * @param orderValue
     */
    @JsonIgnore
    public PSSysDBProcParam ordervalue(Integer orderValue){
        this.setOrderValue(orderValue);
        return this;
    }

    /**
     * <B>PARAMDIR</B>&nbsp;参数方向，指定过程参数方向，未定义时为【Input】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.DBProcParamDir} 
     */
    public final static String FIELD_PARAMDIR = "paramdir";

    /**
     * 设置 参数方向，详细说明：{@link #FIELD_PARAMDIR}
     * 
     * @param paramDIR
     * 
     */
    @JsonProperty(FIELD_PARAMDIR)
    public void setParamDIR(Integer paramDIR){
        this.set(FIELD_PARAMDIR, paramDIR);
    }
    
    /**
     * 获取 参数方向  
     * @return
     */
    @JsonIgnore
    public Integer getParamDIR(){
        Object objValue = this.get(FIELD_PARAMDIR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 参数方向 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isParamDIRDirty(){
        if(this.contains(FIELD_PARAMDIR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数方向
     */
    @JsonIgnore
    public void resetParamDIR(){
        this.reset(FIELD_PARAMDIR);
    }

    /**
     * 设置 参数方向，详细说明：{@link #FIELD_PARAMDIR}
     * <P>
     * 等同 {@link #setParamDIR}
     * @param paramDIR
     */
    @JsonIgnore
    public PSSysDBProcParam paramdir(Integer paramDIR){
        this.setParamDIR(paramDIR);
        return this;
    }

     /**
     * 设置 参数方向，详细说明：{@link #FIELD_PARAMDIR}
     * <P>
     * 等同 {@link #setParamDIR}
     * @param paramDIR
     */
    @JsonIgnore
    public PSSysDBProcParam paramdir(net.ibizsys.psmodel.core.util.PSModelEnums.DBProcParamDir paramDIR){
        if(paramDIR == null){
            this.setParamDIR(null);
        }
        else{
            this.setParamDIR(paramDIR.value);
        }
        return this;
    }

    /**
     * <B>PRECISION</B>&nbsp;浮点精度
     */
    public final static String FIELD_PRECISION = "precision";

    /**
     * 设置 浮点精度
     * 
     * @param precision
     * 
     */
    @JsonProperty(FIELD_PRECISION)
    public void setPrecision(Integer precision){
        this.set(FIELD_PRECISION, precision);
        //属性名称与代码标识不一致，设置属性名称
        this.set("precision2", precision);
    }
    
    /**
     * 获取 浮点精度  
     * @return
     */
    @JsonIgnore
    public Integer getPrecision(){
        Object objValue = this.get(FIELD_PRECISION);
        if(objValue==null){
            //属性名称与代码标识不一致，使用属性名称
            objValue = this.get("precision2");
            if(objValue == null){
                return null;
            }
        }
        return (Integer)objValue;
    }

    /**
     * 判断 浮点精度 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPrecisionDirty(){
        if(this.contains(FIELD_PRECISION)){
            return true;
        }
        //属性名称与代码标识不一致，判断属性名称
        if(this.contains("precision2")){
            return true;
        }
        return false;
    }

    /**
     * 重置 浮点精度
     */
    @JsonIgnore
    public void resetPrecision(){
        this.reset(FIELD_PRECISION);
        //属性名称与代码标识不一致，重置属性名称
        this.reset("precision2");
    }

    /**
     * 设置 浮点精度
     * <P>
     * 等同 {@link #setPrecision}
     * @param precision
     */
    @JsonIgnore
    public PSSysDBProcParam precision(Integer precision){
        this.setPrecision(precision);
        return this;
    }

    @JsonIgnore
    @Deprecated
    public Integer getPrecision2(){
        return this.getPrecision();
    }

    @JsonIgnore
    @Deprecated        
    public void setPrecision2(Integer precision2){
        this.setPrecision(precision2);
    }

    @JsonIgnore
    @Deprecated
    public boolean isPrecision2Dirty(){
        return this.isPrecisionDirty();
    }

    @JsonIgnore
    @Deprecated
    public void resetPrecision2(){
        this.resetPrecision();
    }

    /**
     * <B>PSSYSDBPROCID</B>&nbsp;存储过程，指定过程参数所在的存储过程对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysDBProc} 
     */
    public final static String FIELD_PSSYSDBPROCID = "pssysdbprocid";

    /**
     * 设置 存储过程，详细说明：{@link #FIELD_PSSYSDBPROCID}
     * 
     * @param pSSysDBProcId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBPROCID)
    public void setPSSysDBProcId(String pSSysDBProcId){
        this.set(FIELD_PSSYSDBPROCID, pSSysDBProcId);
    }
    
    /**
     * 获取 存储过程  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBProcId(){
        Object objValue = this.get(FIELD_PSSYSDBPROCID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 存储过程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBProcIdDirty(){
        if(this.contains(FIELD_PSSYSDBPROCID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 存储过程
     */
    @JsonIgnore
    public void resetPSSysDBProcId(){
        this.reset(FIELD_PSSYSDBPROCID);
    }

    /**
     * 设置 存储过程，详细说明：{@link #FIELD_PSSYSDBPROCID}
     * <P>
     * 等同 {@link #setPSSysDBProcId}
     * @param pSSysDBProcId
     */
    @JsonIgnore
    public PSSysDBProcParam pssysdbprocid(String pSSysDBProcId){
        this.setPSSysDBProcId(pSSysDBProcId);
        return this;
    }

    /**
     * 设置 存储过程，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysDBProcId}
     * @param pSSysDBProc 引用对象
     */
    @JsonIgnore
    public PSSysDBProcParam pssysdbprocid(PSSysDBProc pSSysDBProc){
        if(pSSysDBProc == null){
            this.setPSSysDBProcId(null);
            this.setPSSysDBProcName(null);
        }
        else{
            this.setPSSysDBProcId(pSSysDBProc.getPSSysDBProcId());
            this.setPSSysDBProcName(pSSysDBProc.getPSSysDBProcName());
        }
        return this;
    }

    /**
     * <B>PSSYSDBPROCNAME</B>&nbsp;存储过程，指定过程参数所在的存储过程对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSDBPROCID}
     */
    public final static String FIELD_PSSYSDBPROCNAME = "pssysdbprocname";

    /**
     * 设置 存储过程，详细说明：{@link #FIELD_PSSYSDBPROCNAME}
     * 
     * @param pSSysDBProcName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBPROCNAME)
    public void setPSSysDBProcName(String pSSysDBProcName){
        this.set(FIELD_PSSYSDBPROCNAME, pSSysDBProcName);
    }
    
    /**
     * 获取 存储过程  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBProcName(){
        Object objValue = this.get(FIELD_PSSYSDBPROCNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 存储过程 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBProcNameDirty(){
        if(this.contains(FIELD_PSSYSDBPROCNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 存储过程
     */
    @JsonIgnore
    public void resetPSSysDBProcName(){
        this.reset(FIELD_PSSYSDBPROCNAME);
    }

    /**
     * 设置 存储过程，详细说明：{@link #FIELD_PSSYSDBPROCNAME}
     * <P>
     * 等同 {@link #setPSSysDBProcName}
     * @param pSSysDBProcName
     */
    @JsonIgnore
    public PSSysDBProcParam pssysdbprocname(String pSSysDBProcName){
        this.setPSSysDBProcName(pSSysDBProcName);
        return this;
    }

    /**
     * <B>PSSYSDBPROCPARAMID</B>&nbsp;系统数据库存储过程参数标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSSYSDBPROCPARAMID = "pssysdbprocparamid";

    /**
     * 设置 系统数据库存储过程参数标识
     * 
     * @param pSSysDBProcParamId
     * 
     */
    @JsonProperty(FIELD_PSSYSDBPROCPARAMID)
    public void setPSSysDBProcParamId(String pSSysDBProcParamId){
        this.set(FIELD_PSSYSDBPROCPARAMID, pSSysDBProcParamId);
    }
    
    /**
     * 获取 系统数据库存储过程参数标识  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBProcParamId(){
        Object objValue = this.get(FIELD_PSSYSDBPROCPARAMID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 系统数据库存储过程参数标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBProcParamIdDirty(){
        if(this.contains(FIELD_PSSYSDBPROCPARAMID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统数据库存储过程参数标识
     */
    @JsonIgnore
    public void resetPSSysDBProcParamId(){
        this.reset(FIELD_PSSYSDBPROCPARAMID);
    }

    /**
     * 设置 系统数据库存储过程参数标识
     * <P>
     * 等同 {@link #setPSSysDBProcParamId}
     * @param pSSysDBProcParamId
     */
    @JsonIgnore
    public PSSysDBProcParam pssysdbprocparamid(String pSSysDBProcParamId){
        this.setPSSysDBProcParamId(pSSysDBProcParamId);
        return this;
    }

    /**
     * <B>PSSYSDBPROCPARAMNAME</B>&nbsp;参数名称，指定过程参数的名称，需在所在存储过程中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_PSSYSDBPROCPARAMNAME = "pssysdbprocparamname";

    /**
     * 设置 参数名称，详细说明：{@link #FIELD_PSSYSDBPROCPARAMNAME}
     * 
     * @param pSSysDBProcParamName
     * 
     */
    @JsonProperty(FIELD_PSSYSDBPROCPARAMNAME)
    public void setPSSysDBProcParamName(String pSSysDBProcParamName){
        this.set(FIELD_PSSYSDBPROCPARAMNAME, pSSysDBProcParamName);
    }
    
    /**
     * 获取 参数名称  
     * @return
     */
    @JsonIgnore
    public String getPSSysDBProcParamName(){
        Object objValue = this.get(FIELD_PSSYSDBPROCPARAMNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 参数名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysDBProcParamNameDirty(){
        if(this.contains(FIELD_PSSYSDBPROCPARAMNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 参数名称
     */
    @JsonIgnore
    public void resetPSSysDBProcParamName(){
        this.reset(FIELD_PSSYSDBPROCPARAMNAME);
    }

    /**
     * 设置 参数名称，详细说明：{@link #FIELD_PSSYSDBPROCPARAMNAME}
     * <P>
     * 等同 {@link #setPSSysDBProcParamName}
     * @param pSSysDBProcParamName
     */
    @JsonIgnore
    public PSSysDBProcParam pssysdbprocparamname(String pSSysDBProcParamName){
        this.setPSSysDBProcParamName(pSSysDBProcParamName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSSysDBProcParamName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSSysDBProcParamName(strName);
    }

    @JsonIgnore
    public PSSysDBProcParam name(String strName){
        this.setPSSysDBProcParamName(strName);
        return this;
    }

    /**
     * <B>STDDATATYPE</B>&nbsp;标准数据类型，指定存储过程参数的标准数据类型，未定义时为【UNKNOWN】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType} 
     */
    public final static String FIELD_STDDATATYPE = "stddatatype";

    /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * 
     * @param stdDataType
     * 
     */
    @JsonProperty(FIELD_STDDATATYPE)
    public void setStdDataType(Integer stdDataType){
        this.set(FIELD_STDDATATYPE, stdDataType);
    }
    
    /**
     * 获取 标准数据类型  
     * @return
     */
    @JsonIgnore
    public Integer getStdDataType(){
        Object objValue = this.get(FIELD_STDDATATYPE);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 标准数据类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isStdDataTypeDirty(){
        if(this.contains(FIELD_STDDATATYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 标准数据类型
     */
    @JsonIgnore
    public void resetStdDataType(){
        this.reset(FIELD_STDDATATYPE);
    }

    /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysDBProcParam stddatatype(Integer stdDataType){
        this.setStdDataType(stdDataType);
        return this;
    }

     /**
     * 设置 标准数据类型，详细说明：{@link #FIELD_STDDATATYPE}
     * <P>
     * 等同 {@link #setStdDataType}
     * @param stdDataType
     */
    @JsonIgnore
    public PSSysDBProcParam stddatatype(net.ibizsys.psmodel.core.util.PSModelEnums.StdDataType stdDataType){
        if(stdDataType == null){
            this.setStdDataType(null);
        }
        else{
            this.setStdDataType(stdDataType.value);
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
    public PSSysDBProcParam updatedate(String updateDate){
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
    public PSSysDBProcParam updateman(String updateMan){
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
    public PSSysDBProcParam usercat(String userCat){
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
    public PSSysDBProcParam usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
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
    public PSSysDBProcParam usertag(String userTag){
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
    public PSSysDBProcParam usertag2(String userTag2){
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSSysDBProcParamId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSSysDBProcParamId(strValue);
    }

    @JsonIgnore
    public PSSysDBProcParam id(String strValue){
        this.setPSSysDBProcParamId(strValue);
        return this;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSSysDBProcParam){
            PSSysDBProcParam model = (PSSysDBProcParam)iPSModel;
        }
        super.copyTo(iPSModel);
    }
}
