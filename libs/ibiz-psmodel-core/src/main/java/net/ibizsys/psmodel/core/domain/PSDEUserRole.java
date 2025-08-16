package net.ibizsys.psmodel.core.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <B>PSDEUSERROLE</B>实体操作角色 模型传输对象
 * <P>
 * 实体的操作角色模型，定义实体预置的操作角色，包括数据的操作标识及范围
 */
public class PSDEUserRole extends net.ibizsys.psmodel.core.util.PSModelBase {

    public PSDEUserRole(){
        this.setValidFlag(1);
    }      

    /**
     * <B>ALLDATAFLAG</B>&nbsp;全部数据模式
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ALLDATAFLAG = "alldataflag";

    /**
     * 设置 全部数据模式
     * 
     * @param allDataFlag
     * 
     */
    @JsonProperty(FIELD_ALLDATAFLAG)
    public void setAllDataFlag(Integer allDataFlag){
        this.set(FIELD_ALLDATAFLAG, allDataFlag);
    }
    
    /**
     * 获取 全部数据模式  
     * @return
     */
    @JsonIgnore
    public Integer getAllDataFlag(){
        Object objValue = this.get(FIELD_ALLDATAFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 全部数据模式 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isAllDataFlagDirty(){
        if(this.contains(FIELD_ALLDATAFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 全部数据模式
     */
    @JsonIgnore
    public void resetAllDataFlag(){
        this.reset(FIELD_ALLDATAFLAG);
    }

    /**
     * 设置 全部数据模式
     * <P>
     * 等同 {@link #setAllDataFlag}
     * @param allDataFlag
     */
    @JsonIgnore
    public PSDEUserRole alldataflag(Integer allDataFlag){
        this.setAllDataFlag(allDataFlag);
        return this;
    }

     /**
     * 设置 全部数据模式
     * <P>
     * 等同 {@link #setAllDataFlag}
     * @param allDataFlag
     */
    @JsonIgnore
    public PSDEUserRole alldataflag(Boolean allDataFlag){
        if(allDataFlag == null){
            this.setAllDataFlag(null);
        }
        else{
            this.setAllDataFlag(allDataFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEUserRole createdate(String createDate){
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
    public PSDEUserRole createman(String createMan){
        this.setCreateMan(createMan);
        return this;
    }

    /**
     * <B>CUSTOMCOND</B>&nbsp;自定义条件
     * <P>
     * 字符串：最大长度 2000
     */
    public final static String FIELD_CUSTOMCOND = "customcond";

    /**
     * 设置 自定义条件
     * 
     * @param customCond
     * 
     */
    @JsonProperty(FIELD_CUSTOMCOND)
    public void setCustomCond(String customCond){
        this.set(FIELD_CUSTOMCOND, customCond);
    }
    
    /**
     * 获取 自定义条件  
     * @return
     */
    @JsonIgnore
    public String getCustomCond(){
        Object objValue = this.get(FIELD_CUSTOMCOND);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义条件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomCondDirty(){
        if(this.contains(FIELD_CUSTOMCOND)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义条件
     */
    @JsonIgnore
    public void resetCustomCond(){
        this.reset(FIELD_CUSTOMCOND);
    }

    /**
     * 设置 自定义条件
     * <P>
     * 等同 {@link #setCustomCond}
     * @param customCond
     */
    @JsonIgnore
    public PSDEUserRole customcond(String customCond){
        this.setCustomCond(customCond);
        return this;
    }

    /**
     * <B>CUSTOMTYPE</B>&nbsp;自定义类型
     * <P>
     * 字符串：最大长度 30
     */
    public final static String FIELD_CUSTOMTYPE = "customtype";

    /**
     * 设置 自定义类型
     * 
     * @param customType
     * 
     */
    @JsonProperty(FIELD_CUSTOMTYPE)
    public void setCustomType(String customType){
        this.set(FIELD_CUSTOMTYPE, customType);
    }
    
    /**
     * 获取 自定义类型  
     * @return
     */
    @JsonIgnore
    public String getCustomType(){
        Object objValue = this.get(FIELD_CUSTOMTYPE);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义类型 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isCustomTypeDirty(){
        if(this.contains(FIELD_CUSTOMTYPE)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义类型
     */
    @JsonIgnore
    public void resetCustomType(){
        this.reset(FIELD_CUSTOMTYPE);
    }

    /**
     * 设置 自定义类型
     * <P>
     * 等同 {@link #setCustomType}
     * @param customType
     */
    @JsonIgnore
    public PSDEUserRole customtype(String customType){
        this.setCustomType(customType);
        return this;
    }

    /**
     * <B>DEFAULTFLAG</B>&nbsp;默认角色
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_DEFAULTFLAG = "defaultflag";

    /**
     * 设置 默认角色
     * 
     * @param defaultFlag
     * 
     */
    @JsonProperty(FIELD_DEFAULTFLAG)
    public void setDefaultFlag(Integer defaultFlag){
        this.set(FIELD_DEFAULTFLAG, defaultFlag);
    }
    
    /**
     * 获取 默认角色  
     * @return
     */
    @JsonIgnore
    public Integer getDefaultFlag(){
        Object objValue = this.get(FIELD_DEFAULTFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 默认角色 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isDefaultFlagDirty(){
        if(this.contains(FIELD_DEFAULTFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 默认角色
     */
    @JsonIgnore
    public void resetDefaultFlag(){
        this.reset(FIELD_DEFAULTFLAG);
    }

    /**
     * 设置 默认角色
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEUserRole defaultflag(Integer defaultFlag){
        this.setDefaultFlag(defaultFlag);
        return this;
    }

     /**
     * 设置 默认角色
     * <P>
     * 等同 {@link #setDefaultFlag}
     * @param defaultFlag
     */
    @JsonIgnore
    public PSDEUserRole defaultflag(Boolean defaultFlag){
        if(defaultFlag == null){
            this.setDefaultFlag(null);
        }
        else{
            this.setDefaultFlag(defaultFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEORGDR</B>&nbsp;启用机构数据范围，指定实体角色的数据范围是否启用机构范围，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEORGDR = "enableorgdr";

    /**
     * 设置 启用机构数据范围，详细说明：{@link #FIELD_ENABLEORGDR}
     * 
     * @param enableOrgDR
     * 
     */
    @JsonProperty(FIELD_ENABLEORGDR)
    public void setEnableOrgDR(Integer enableOrgDR){
        this.set(FIELD_ENABLEORGDR, enableOrgDR);
    }
    
    /**
     * 获取 启用机构数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getEnableOrgDR(){
        Object objValue = this.get(FIELD_ENABLEORGDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用机构数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableOrgDRDirty(){
        if(this.contains(FIELD_ENABLEORGDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用机构数据范围
     */
    @JsonIgnore
    public void resetEnableOrgDR(){
        this.reset(FIELD_ENABLEORGDR);
    }

    /**
     * 设置 启用机构数据范围，详细说明：{@link #FIELD_ENABLEORGDR}
     * <P>
     * 等同 {@link #setEnableOrgDR}
     * @param enableOrgDR
     */
    @JsonIgnore
    public PSDEUserRole enableorgdr(Integer enableOrgDR){
        this.setEnableOrgDR(enableOrgDR);
        return this;
    }

     /**
     * 设置 启用机构数据范围，详细说明：{@link #FIELD_ENABLEORGDR}
     * <P>
     * 等同 {@link #setEnableOrgDR}
     * @param enableOrgDR
     */
    @JsonIgnore
    public PSDEUserRole enableorgdr(Boolean enableOrgDR){
        if(enableOrgDR == null){
            this.setEnableOrgDR(null);
        }
        else{
            this.setEnableOrgDR(enableOrgDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESECBC</B>&nbsp;启用部门业务代码，指定实体角色的数据范围是否启用部门业务条线代码，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESECBC = "enablesecbc";

    /**
     * 设置 启用部门业务代码，详细说明：{@link #FIELD_ENABLESECBC}
     * 
     * @param enableSecBC
     * 
     */
    @JsonProperty(FIELD_ENABLESECBC)
    public void setEnableSecBC(Integer enableSecBC){
        this.set(FIELD_ENABLESECBC, enableSecBC);
    }
    
    /**
     * 获取 启用部门业务代码  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSecBC(){
        Object objValue = this.get(FIELD_ENABLESECBC);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用部门业务代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSecBCDirty(){
        if(this.contains(FIELD_ENABLESECBC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用部门业务代码
     */
    @JsonIgnore
    public void resetEnableSecBC(){
        this.reset(FIELD_ENABLESECBC);
    }

    /**
     * 设置 启用部门业务代码，详细说明：{@link #FIELD_ENABLESECBC}
     * <P>
     * 等同 {@link #setEnableSecBC}
     * @param enableSecBC
     */
    @JsonIgnore
    public PSDEUserRole enablesecbc(Integer enableSecBC){
        this.setEnableSecBC(enableSecBC);
        return this;
    }

     /**
     * 设置 启用部门业务代码，详细说明：{@link #FIELD_ENABLESECBC}
     * <P>
     * 等同 {@link #setEnableSecBC}
     * @param enableSecBC
     */
    @JsonIgnore
    public PSDEUserRole enablesecbc(Boolean enableSecBC){
        if(enableSecBC == null){
            this.setEnableSecBC(null);
        }
        else{
            this.setEnableSecBC(enableSecBC?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLESECDR</B>&nbsp;启用部门数据范围，指定实体角色的数据范围是否启用部门范围，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLESECDR = "enablesecdr";

    /**
     * 设置 启用部门数据范围，详细说明：{@link #FIELD_ENABLESECDR}
     * 
     * @param enableSecDR
     * 
     */
    @JsonProperty(FIELD_ENABLESECDR)
    public void setEnableSecDR(Integer enableSecDR){
        this.set(FIELD_ENABLESECDR, enableSecDR);
    }
    
    /**
     * 获取 启用部门数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getEnableSecDR(){
        Object objValue = this.get(FIELD_ENABLESECDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用部门数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableSecDRDirty(){
        if(this.contains(FIELD_ENABLESECDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用部门数据范围
     */
    @JsonIgnore
    public void resetEnableSecDR(){
        this.reset(FIELD_ENABLESECDR);
    }

    /**
     * 设置 启用部门数据范围，详细说明：{@link #FIELD_ENABLESECDR}
     * <P>
     * 等同 {@link #setEnableSecDR}
     * @param enableSecDR
     */
    @JsonIgnore
    public PSDEUserRole enablesecdr(Integer enableSecDR){
        this.setEnableSecDR(enableSecDR);
        return this;
    }

     /**
     * 设置 启用部门数据范围，详细说明：{@link #FIELD_ENABLESECDR}
     * <P>
     * 等同 {@link #setEnableSecDR}
     * @param enableSecDR
     */
    @JsonIgnore
    public PSDEUserRole enablesecdr(Boolean enableSecDR){
        if(enableSecDR == null){
            this.setEnableSecDR(null);
        }
        else{
            this.setEnableSecDR(enableSecDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>ENABLEUSERDR</B>&nbsp;启用用户数据范围，指定实体角色的数据范围是否启用当前用户身份，未定义时为【否】
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_ENABLEUSERDR = "enableuserdr";

    /**
     * 设置 启用用户数据范围，详细说明：{@link #FIELD_ENABLEUSERDR}
     * 
     * @param enableUserDR
     * 
     */
    @JsonProperty(FIELD_ENABLEUSERDR)
    public void setEnableUserDR(Integer enableUserDR){
        this.set(FIELD_ENABLEUSERDR, enableUserDR);
    }
    
    /**
     * 获取 启用用户数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getEnableUserDR(){
        Object objValue = this.get(FIELD_ENABLEUSERDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 启用用户数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isEnableUserDRDirty(){
        if(this.contains(FIELD_ENABLEUSERDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 启用用户数据范围
     */
    @JsonIgnore
    public void resetEnableUserDR(){
        this.reset(FIELD_ENABLEUSERDR);
    }

    /**
     * 设置 启用用户数据范围，详细说明：{@link #FIELD_ENABLEUSERDR}
     * <P>
     * 等同 {@link #setEnableUserDR}
     * @param enableUserDR
     */
    @JsonIgnore
    public PSDEUserRole enableuserdr(Integer enableUserDR){
        this.setEnableUserDR(enableUserDR);
        return this;
    }

     /**
     * 设置 启用用户数据范围，详细说明：{@link #FIELD_ENABLEUSERDR}
     * <P>
     * 等同 {@link #setEnableUserDR}
     * @param enableUserDR
     */
    @JsonIgnore
    public PSDEUserRole enableuserdr(Boolean enableUserDR){
        if(enableUserDR == null){
            this.setEnableUserDR(null);
        }
        else{
            this.setEnableUserDR(enableUserDR?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
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
    public PSDEUserRole memo(String memo){
        this.setMemo(memo);
        return this;
    }

    /**
     * <B>ORGDR</B>&nbsp;机构数据范围，实体角色启用机构数据范围功能，指定机构的数据范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope} 
     */
    public final static String FIELD_ORGDR = "orgdr";

    /**
     * 设置 机构数据范围，详细说明：{@link #FIELD_ORGDR}
     * 
     * @param orgDR
     * 
     */
    @JsonProperty(FIELD_ORGDR)
    public void setOrgDR(Integer orgDR){
        this.set(FIELD_ORGDR, orgDR);
    }
    
    /**
     * 获取 机构数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getOrgDR(){
        Object objValue = this.get(FIELD_ORGDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 机构数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isOrgDRDirty(){
        if(this.contains(FIELD_ORGDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 机构数据范围
     */
    @JsonIgnore
    public void resetOrgDR(){
        this.reset(FIELD_ORGDR);
    }

    /**
     * 设置 机构数据范围，详细说明：{@link #FIELD_ORGDR}
     * <P>
     * 等同 {@link #setOrgDR}
     * @param orgDR
     */
    @JsonIgnore
    public PSDEUserRole orgdr(Integer orgDR){
        this.setOrgDR(orgDR);
        return this;
    }

     /**
     * 设置 机构数据范围，详细说明：{@link #FIELD_ORGDR}
     * <P>
     * 等同 {@link #setOrgDR}
     * @param orgDR
     */
    @JsonIgnore
    public PSDEUserRole orgdr(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope[] orgDR){
        if(orgDR == null || orgDR.length == 0){
            this.setOrgDR(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope _item : orgDR){
                _value |= _item.value;
            }
            this.setOrgDR(_value);
        }
        return this;
    }

    /**
     * <B>PSDEDSID</B>&nbsp;数据集
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDEDataSet} 
     */
    public final static String FIELD_PSDEDSID = "psdedsid";

    /**
     * 设置 数据集
     * 
     * @param pSDEDSId
     * 
     */
    @JsonProperty(FIELD_PSDEDSID)
    public void setPSDEDSId(String pSDEDSId){
        this.set(FIELD_PSDEDSID, pSDEDSId);
    }
    
    /**
     * 获取 数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSId(){
        Object objValue = this.get(FIELD_PSDEDSID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSIdDirty(){
        if(this.contains(FIELD_PSDEDSID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDSId(){
        this.reset(FIELD_PSDEDSID);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDSId
     */
    @JsonIgnore
    public PSDEUserRole psdedsid(String pSDEDSId){
        this.setPSDEDSId(pSDEDSId);
        return this;
    }

    /**
     * 设置 数据集，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSDEDSId}
     * @param pSDEDataSet 引用对象
     */
    @JsonIgnore
    public PSDEUserRole psdedsid(PSDEDataSet pSDEDataSet){
        if(pSDEDataSet == null){
            this.setPSDEDSId(null);
            this.setPSDEDSName(null);
        }
        else{
            this.setPSDEDSId(pSDEDataSet.getPSDEDataSetId());
            this.setPSDEDSName(pSDEDataSet.getPSDEDataSetName());
        }
        return this;
    }

    /**
     * <B>PSDEDSNAME</B>&nbsp;数据集
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEDSID}
     */
    public final static String FIELD_PSDEDSNAME = "psdedsname";

    /**
     * 设置 数据集
     * 
     * @param pSDEDSName
     * 
     */
    @JsonProperty(FIELD_PSDEDSNAME)
    public void setPSDEDSName(String pSDEDSName){
        this.set(FIELD_PSDEDSNAME, pSDEDSName);
    }
    
    /**
     * 获取 数据集  
     * @return
     */
    @JsonIgnore
    public String getPSDEDSName(){
        Object objValue = this.get(FIELD_PSDEDSNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 数据集 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEDSNameDirty(){
        if(this.contains(FIELD_PSDEDSNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 数据集
     */
    @JsonIgnore
    public void resetPSDEDSName(){
        this.reset(FIELD_PSDEDSNAME);
    }

    /**
     * 设置 数据集
     * <P>
     * 等同 {@link #setPSDEDSName}
     * @param pSDEDSName
     */
    @JsonIgnore
    public PSDEUserRole psdedsname(String pSDEDSName){
        this.setPSDEDSName(pSDEDSName);
        return this;
    }

    /**
     * <B>PSDEID</B>&nbsp;实体，指定操作角色所在的实体对象
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSDataEntity} 
     */
    public final static String FIELD_PSDEID = "psdeid";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
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
     * 设置 实体，详细说明：{@link #FIELD_PSDEID}
     * <P>
     * 等同 {@link #setPSDEId}
     * @param pSDEId
     */
    @JsonIgnore
    public PSDEUserRole psdeid(String pSDEId){
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
    public PSDEUserRole psdeid(PSDataEntity pSDataEntity){
        if(pSDataEntity == null){
            this.setPSDEId(null);
            this.setPSDEName(null);
        }
        else{
            this.setPSDEId(pSDataEntity.getPSDataEntityId());
            this.setPSDEName(pSDataEntity.getPSDataEntityName());
        }
        return this;
    }

    /**
     * <B>PSDENAME</B>&nbsp;实体，指定操作角色所在的实体对象
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSDEID}
     */
    public final static String FIELD_PSDENAME = "psdename";

    /**
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
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
     * 设置 实体，详细说明：{@link #FIELD_PSDENAME}
     * <P>
     * 等同 {@link #setPSDEName}
     * @param pSDEName
     */
    @JsonIgnore
    public PSDEUserRole psdename(String pSDEName){
        this.setPSDEName(pSDEName);
        return this;
    }

    /**
     * <B>PSDEUSERROLEID</B>&nbsp;实体操作角色标识
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_PSDEUSERROLEID = "psdeuserroleid";

    /**
     * 设置 实体操作角色标识
     * 
     * @param pSDEUserRoleId
     * 
     */
    @JsonProperty(FIELD_PSDEUSERROLEID)
    public void setPSDEUserRoleId(String pSDEUserRoleId){
        this.set(FIELD_PSDEUSERROLEID, pSDEUserRoleId);
    }
    
    /**
     * 获取 实体操作角色标识  
     * @return
     */
    @JsonIgnore
    public String getPSDEUserRoleId(){
        Object objValue = this.get(FIELD_PSDEUSERROLEID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 实体操作角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUserRoleIdDirty(){
        if(this.contains(FIELD_PSDEUSERROLEID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 实体操作角色标识
     */
    @JsonIgnore
    public void resetPSDEUserRoleId(){
        this.reset(FIELD_PSDEUSERROLEID);
    }

    /**
     * 设置 实体操作角色标识
     * <P>
     * 等同 {@link #setPSDEUserRoleId}
     * @param pSDEUserRoleId
     */
    @JsonIgnore
    public PSDEUserRole psdeuserroleid(String pSDEUserRoleId){
        this.setPSDEUserRoleId(pSDEUserRoleId);
        return this;
    }

    /**
     * <B>PSDEUSERROLENAME</B>&nbsp;操作角色名称，指定操作角色的名称，需在所在实体中具备唯一性
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_PSDEUSERROLENAME = "psdeuserrolename";

    /**
     * 设置 操作角色名称，详细说明：{@link #FIELD_PSDEUSERROLENAME}
     * 
     * @param pSDEUserRoleName
     * 
     */
    @JsonProperty(FIELD_PSDEUSERROLENAME)
    public void setPSDEUserRoleName(String pSDEUserRoleName){
        this.set(FIELD_PSDEUSERROLENAME, pSDEUserRoleName);
    }
    
    /**
     * 获取 操作角色名称  
     * @return
     */
    @JsonIgnore
    public String getPSDEUserRoleName(){
        Object objValue = this.get(FIELD_PSDEUSERROLENAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作角色名称 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSDEUserRoleNameDirty(){
        if(this.contains(FIELD_PSDEUSERROLENAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作角色名称
     */
    @JsonIgnore
    public void resetPSDEUserRoleName(){
        this.reset(FIELD_PSDEUSERROLENAME);
    }

    /**
     * 设置 操作角色名称，详细说明：{@link #FIELD_PSDEUSERROLENAME}
     * <P>
     * 等同 {@link #setPSDEUserRoleName}
     * @param pSDEUserRoleName
     */
    @JsonIgnore
    public PSDEUserRole psdeuserrolename(String pSDEUserRoleName){
        this.setPSDEUserRoleName(pSDEUserRoleName);
        return this;
    }

    @JsonIgnore
    public String getName(){
        return this.getPSDEUserRoleName();
    }

    @JsonIgnore
    public void setName(String strName){
        this.setPSDEUserRoleName(strName);
    }

    @JsonIgnore
    public PSDEUserRole name(String strName){
        this.setPSDEUserRoleName(strName);
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINID</B>&nbsp;后端模板插件
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysSFPlugin} 
     */
    public final static String FIELD_PSSYSSFPLUGINID = "pssyssfpluginid";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginId
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINID)
    public void setPSSysSFPluginId(String pSSysSFPluginId){
        this.set(FIELD_PSSYSSFPLUGINID, pSSysSFPluginId);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginId(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginIdDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginId(){
        this.reset(FIELD_PSSYSSFPLUGINID);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPluginId
     */
    @JsonIgnore
    public PSDEUserRole pssyssfpluginid(String pSSysSFPluginId){
        this.setPSSysSFPluginId(pSSysSFPluginId);
        return this;
    }

    /**
     * 设置 后端模板插件，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysSFPluginId}
     * @param pSSysSFPlugin 引用对象
     */
    @JsonIgnore
    public PSDEUserRole pssyssfpluginid(PSSysSFPlugin pSSysSFPlugin){
        if(pSSysSFPlugin == null){
            this.setPSSysSFPluginId(null);
            this.setPSSysSFPluginName(null);
        }
        else{
            this.setPSSysSFPluginId(pSSysSFPlugin.getPSSysSFPluginId());
            this.setPSSysSFPluginName(pSSysSFPlugin.getPSSysSFPluginName());
        }
        return this;
    }

    /**
     * <B>PSSYSSFPLUGINNAME</B>&nbsp;后端模板插件
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSSFPLUGINID}
     */
    public final static String FIELD_PSSYSSFPLUGINNAME = "pssyssfpluginname";

    /**
     * 设置 后端模板插件
     * 
     * @param pSSysSFPluginName
     * 
     */
    @JsonProperty(FIELD_PSSYSSFPLUGINNAME)
    public void setPSSysSFPluginName(String pSSysSFPluginName){
        this.set(FIELD_PSSYSSFPLUGINNAME, pSSysSFPluginName);
    }
    
    /**
     * 获取 后端模板插件  
     * @return
     */
    @JsonIgnore
    public String getPSSysSFPluginName(){
        Object objValue = this.get(FIELD_PSSYSSFPLUGINNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 后端模板插件 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysSFPluginNameDirty(){
        if(this.contains(FIELD_PSSYSSFPLUGINNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 后端模板插件
     */
    @JsonIgnore
    public void resetPSSysSFPluginName(){
        this.reset(FIELD_PSSYSSFPLUGINNAME);
    }

    /**
     * 设置 后端模板插件
     * <P>
     * 等同 {@link #setPSSysSFPluginName}
     * @param pSSysSFPluginName
     */
    @JsonIgnore
    public PSDEUserRole pssyssfpluginname(String pSSysSFPluginName){
        this.setPSSysSFPluginName(pSSysSFPluginName);
        return this;
    }

    /**
     * <B>PSSYSUSERDRID</B>&nbsp;自定义数据范围，指定实体角色数据范围使用的自定义数据范围
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUserDR} 
     */
    public final static String FIELD_PSSYSUSERDRID = "pssysuserdrid";

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRID}
     * 
     * @param pSSysUserDRId
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRID)
    public void setPSSysUserDRId(String pSSysUserDRId){
        this.set(FIELD_PSSYSUSERDRID, pSSysUserDRId);
    }
    
    /**
     * 获取 自定义数据范围  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRId(){
        Object objValue = this.get(FIELD_PSSYSUSERDRID);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRIdDirty(){
        if(this.contains(FIELD_PSSYSUSERDRID)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围
     */
    @JsonIgnore
    public void resetPSSysUserDRId(){
        this.reset(FIELD_PSSYSUSERDRID);
    }

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRID}
     * <P>
     * 等同 {@link #setPSSysUserDRId}
     * @param pSSysUserDRId
     */
    @JsonIgnore
    public PSDEUserRole pssysuserdrid(String pSSysUserDRId){
        this.setPSSysUserDRId(pSSysUserDRId);
        return this;
    }

    /**
     * 设置 自定义数据范围，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserDRId}
     * @param pSSysUserDR 引用对象
     */
    @JsonIgnore
    public PSDEUserRole pssysuserdrid(PSSysUserDR pSSysUserDR){
        if(pSSysUserDR == null){
            this.setPSSysUserDRId(null);
            this.setPSSysUserDRName(null);
        }
        else{
            this.setPSSysUserDRId(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    /**
     * <B>PSSYSUSERDRID2</B>&nbsp;自定义数据范围2，指定实体角色数据范围使用的自定义数据范围2
     * <P>
     * 引用连接属性：对象&nbsp;{@link net.ibizsys.psmodel.core.domain.PSSysUserDR} 
     */
    public final static String FIELD_PSSYSUSERDRID2 = "pssysuserdrid2";

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRID2}
     * 
     * @param pSSysUserDRId2
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRID2)
    public void setPSSysUserDRId2(String pSSysUserDRId2){
        this.set(FIELD_PSSYSUSERDRID2, pSSysUserDRId2);
    }
    
    /**
     * 获取 自定义数据范围2  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRId2(){
        Object objValue = this.get(FIELD_PSSYSUSERDRID2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRId2Dirty(){
        if(this.contains(FIELD_PSSYSUSERDRID2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围2
     */
    @JsonIgnore
    public void resetPSSysUserDRId2(){
        this.reset(FIELD_PSSYSUSERDRID2);
    }

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRID2}
     * <P>
     * 等同 {@link #setPSSysUserDRId2}
     * @param pSSysUserDRId2
     */
    @JsonIgnore
    public PSDEUserRole pssysuserdrid2(String pSSysUserDRId2){
        this.setPSSysUserDRId2(pSSysUserDRId2);
        return this;
    }

    /**
     * 设置 自定义数据范围2，包括引用对象的其它关系属性
     * <P>
     * 等同 {@link #setPSSysUserDRId2}
     * @param pSSysUserDR 引用对象
     */
    @JsonIgnore
    public PSDEUserRole pssysuserdrid2(PSSysUserDR pSSysUserDR){
        if(pSSysUserDR == null){
            this.setPSSysUserDRId2(null);
            this.setPSSysUserDRName2(null);
        }
        else{
            this.setPSSysUserDRId2(pSSysUserDR.getPSSysUserDRId());
            this.setPSSysUserDRName2(pSSysUserDR.getPSSysUserDRName());
        }
        return this;
    }

    /**
     * <B>PSSYSUSERDRNAME</B>&nbsp;自定义数据范围，指定实体角色数据范围使用的自定义数据范围
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERDRID}
     */
    public final static String FIELD_PSSYSUSERDRNAME = "pssysuserdrname";

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRNAME}
     * 
     * @param pSSysUserDRName
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRNAME)
    public void setPSSysUserDRName(String pSSysUserDRName){
        this.set(FIELD_PSSYSUSERDRNAME, pSSysUserDRName);
    }
    
    /**
     * 获取 自定义数据范围  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRName(){
        Object objValue = this.get(FIELD_PSSYSUSERDRNAME);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRNameDirty(){
        if(this.contains(FIELD_PSSYSUSERDRNAME)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围
     */
    @JsonIgnore
    public void resetPSSysUserDRName(){
        this.reset(FIELD_PSSYSUSERDRNAME);
    }

    /**
     * 设置 自定义数据范围，详细说明：{@link #FIELD_PSSYSUSERDRNAME}
     * <P>
     * 等同 {@link #setPSSysUserDRName}
     * @param pSSysUserDRName
     */
    @JsonIgnore
    public PSDEUserRole pssysuserdrname(String pSSysUserDRName){
        this.setPSSysUserDRName(pSSysUserDRName);
        return this;
    }

    /**
     * <B>PSSYSUSERDRNAME2</B>&nbsp;自定义数据范围2，指定实体角色数据范围使用的自定义数据范围2
     * <P>
     * 引用附加属性：连接&nbsp;{@link #FIELD_PSSYSUSERDRID2}
     */
    public final static String FIELD_PSSYSUSERDRNAME2 = "pssysuserdrname2";

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRNAME2}
     * 
     * @param pSSysUserDRName2
     * 
     */
    @JsonProperty(FIELD_PSSYSUSERDRNAME2)
    public void setPSSysUserDRName2(String pSSysUserDRName2){
        this.set(FIELD_PSSYSUSERDRNAME2, pSSysUserDRName2);
    }
    
    /**
     * 获取 自定义数据范围2  
     * @return
     */
    @JsonIgnore
    public String getPSSysUserDRName2(){
        Object objValue = this.get(FIELD_PSSYSUSERDRNAME2);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义数据范围2 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isPSSysUserDRName2Dirty(){
        if(this.contains(FIELD_PSSYSUSERDRNAME2)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义数据范围2
     */
    @JsonIgnore
    public void resetPSSysUserDRName2(){
        this.reset(FIELD_PSSYSUSERDRNAME2);
    }

    /**
     * 设置 自定义数据范围2，详细说明：{@link #FIELD_PSSYSUSERDRNAME2}
     * <P>
     * 等同 {@link #setPSSysUserDRName2}
     * @param pSSysUserDRName2
     */
    @JsonIgnore
    public PSDEUserRole pssysuserdrname2(String pSSysUserDRName2){
        this.setPSSysUserDRName2(pSSysUserDRName2);
        return this;
    }

    /**
     * <B>SECBC</B>&nbsp;部门业务代码，实体角色启用部门业务条线数据范围功能，指定部门的业务代码
     * <P>
     * 字符串：最大长度 200
     */
    public final static String FIELD_SECBC = "secbc";

    /**
     * 设置 部门业务代码，详细说明：{@link #FIELD_SECBC}
     * 
     * @param secBC
     * 
     */
    @JsonProperty(FIELD_SECBC)
    public void setSecBC(String secBC){
        this.set(FIELD_SECBC, secBC);
    }
    
    /**
     * 获取 部门业务代码  
     * @return
     */
    @JsonIgnore
    public String getSecBC(){
        Object objValue = this.get(FIELD_SECBC);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 部门业务代码 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSecBCDirty(){
        if(this.contains(FIELD_SECBC)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部门业务代码
     */
    @JsonIgnore
    public void resetSecBC(){
        this.reset(FIELD_SECBC);
    }

    /**
     * 设置 部门业务代码，详细说明：{@link #FIELD_SECBC}
     * <P>
     * 等同 {@link #setSecBC}
     * @param secBC
     */
    @JsonIgnore
    public PSDEUserRole secbc(String secBC){
        this.setSecBC(secBC);
        return this;
    }

    /**
     * <B>SECDR</B>&nbsp;部门数据范围，实体角色启用部门数据范围功能，指定部门的数据范围
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope} 
     */
    public final static String FIELD_SECDR = "secdr";

    /**
     * 设置 部门数据范围，详细说明：{@link #FIELD_SECDR}
     * 
     * @param secDR
     * 
     */
    @JsonProperty(FIELD_SECDR)
    public void setSecDR(Integer secDR){
        this.set(FIELD_SECDR, secDR);
    }
    
    /**
     * 获取 部门数据范围  
     * @return
     */
    @JsonIgnore
    public Integer getSecDR(){
        Object objValue = this.get(FIELD_SECDR);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 部门数据范围 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSecDRDirty(){
        if(this.contains(FIELD_SECDR)){
            return true;
        }
        return false;
    }

    /**
     * 重置 部门数据范围
     */
    @JsonIgnore
    public void resetSecDR(){
        this.reset(FIELD_SECDR);
    }

    /**
     * 设置 部门数据范围，详细说明：{@link #FIELD_SECDR}
     * <P>
     * 等同 {@link #setSecDR}
     * @param secDR
     */
    @JsonIgnore
    public PSDEUserRole secdr(Integer secDR){
        this.setSecDR(secDR);
        return this;
    }

     /**
     * 设置 部门数据范围，详细说明：{@link #FIELD_SECDR}
     * <P>
     * 等同 {@link #setSecDR}
     * @param secDR
     */
    @JsonIgnore
    public PSDEUserRole secdr(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope[] secDR){
        if(secDR == null || secDR.length == 0){
            this.setSecDR(null);
        }
        else{
            int _value = 0;
            for(net.ibizsys.psmodel.core.util.PSModelEnums.OrgScope _item : secDR){
                _value |= _item.value;
            }
            this.setSecDR(_value);
        }
        return this;
    }

    /**
     * <B>SYSTEMFLAG</B>&nbsp;系统使用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
     */
    public final static String FIELD_SYSTEMFLAG = "systemflag";

    /**
     * 设置 系统使用
     * 
     * @param systemFlag
     * 
     */
    @JsonProperty(FIELD_SYSTEMFLAG)
    public void setSystemFlag(Integer systemFlag){
        this.set(FIELD_SYSTEMFLAG, systemFlag);
    }
    
    /**
     * 获取 系统使用  
     * @return
     */
    @JsonIgnore
    public Integer getSystemFlag(){
        Object objValue = this.get(FIELD_SYSTEMFLAG);
        if(objValue==null){
            return null;
        }
        return (Integer)objValue;
    }

    /**
     * 判断 系统使用 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSystemFlagDirty(){
        if(this.contains(FIELD_SYSTEMFLAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 系统使用
     */
    @JsonIgnore
    public void resetSystemFlag(){
        this.reset(FIELD_SYSTEMFLAG);
    }

    /**
     * 设置 系统使用
     * <P>
     * 等同 {@link #setSystemFlag}
     * @param systemFlag
     */
    @JsonIgnore
    public PSDEUserRole systemflag(Integer systemFlag){
        this.setSystemFlag(systemFlag);
        return this;
    }

     /**
     * 设置 系统使用
     * <P>
     * 等同 {@link #setSystemFlag}
     * @param systemFlag
     */
    @JsonIgnore
    public PSDEUserRole systemflag(Boolean systemFlag){
        if(systemFlag == null){
            this.setSystemFlag(null);
        }
        else{
            this.setSystemFlag(systemFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    /**
     * <B>SYSUSERDR2PARAM</B>&nbsp;自定义范围2参数，实体角色启用自定义数据范围2时，进一步指定范围的参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SYSUSERDR2PARAM = "sysuserdr2param";

    /**
     * 设置 自定义范围2参数，详细说明：{@link #FIELD_SYSUSERDR2PARAM}
     * 
     * @param sysUserDR2Param
     * 
     */
    @JsonProperty(FIELD_SYSUSERDR2PARAM)
    public void setSysUserDR2Param(String sysUserDR2Param){
        this.set(FIELD_SYSUSERDR2PARAM, sysUserDR2Param);
    }
    
    /**
     * 获取 自定义范围2参数  
     * @return
     */
    @JsonIgnore
    public String getSysUserDR2Param(){
        Object objValue = this.get(FIELD_SYSUSERDR2PARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义范围2参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysUserDR2ParamDirty(){
        if(this.contains(FIELD_SYSUSERDR2PARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义范围2参数
     */
    @JsonIgnore
    public void resetSysUserDR2Param(){
        this.reset(FIELD_SYSUSERDR2PARAM);
    }

    /**
     * 设置 自定义范围2参数，详细说明：{@link #FIELD_SYSUSERDR2PARAM}
     * <P>
     * 等同 {@link #setSysUserDR2Param}
     * @param sysUserDR2Param
     */
    @JsonIgnore
    public PSDEUserRole sysuserdr2param(String sysUserDR2Param){
        this.setSysUserDR2Param(sysUserDR2Param);
        return this;
    }

    /**
     * <B>SYSUSERDRPARAM</B>&nbsp;自定义范围参数，实体角色启用自定义数据范围时，进一步指定范围的参数
     * <P>
     * 字符串：最大长度 100
     */
    public final static String FIELD_SYSUSERDRPARAM = "sysuserdrparam";

    /**
     * 设置 自定义范围参数，详细说明：{@link #FIELD_SYSUSERDRPARAM}
     * 
     * @param sysUserDRParam
     * 
     */
    @JsonProperty(FIELD_SYSUSERDRPARAM)
    public void setSysUserDRParam(String sysUserDRParam){
        this.set(FIELD_SYSUSERDRPARAM, sysUserDRParam);
    }
    
    /**
     * 获取 自定义范围参数  
     * @return
     */
    @JsonIgnore
    public String getSysUserDRParam(){
        Object objValue = this.get(FIELD_SYSUSERDRPARAM);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 自定义范围参数 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isSysUserDRParamDirty(){
        if(this.contains(FIELD_SYSUSERDRPARAM)){
            return true;
        }
        return false;
    }

    /**
     * 重置 自定义范围参数
     */
    @JsonIgnore
    public void resetSysUserDRParam(){
        this.reset(FIELD_SYSUSERDRPARAM);
    }

    /**
     * 设置 自定义范围参数，详细说明：{@link #FIELD_SYSUSERDRPARAM}
     * <P>
     * 等同 {@link #setSysUserDRParam}
     * @param sysUserDRParam
     */
    @JsonIgnore
    public PSDEUserRole sysuserdrparam(String sysUserDRParam){
        this.setSysUserDRParam(sysUserDRParam);
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
    public PSDEUserRole updatedate(String updateDate){
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
    public PSDEUserRole updateman(String updateMan){
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
    public PSDEUserRole usercat(String userCat){
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
    public PSDEUserRole usercat(net.ibizsys.psmodel.core.util.PSModelEnums.ModelUserCat userCat){
        if(userCat == null){
            this.setUserCat(null);
        }
        else{
            this.setUserCat(userCat.value);
        }
        return this;
    }

    /**
     * <B>USERROLETAG</B>&nbsp;操作角色标识，指定操作角色的标识，需在所在实体中具备唯一性
     * <P>
     * 字符串：最大长度 30，由字母、数字、下划线组成，且开始必须为字母
     */
    public final static String FIELD_USERROLETAG = "userroletag";

    /**
     * 设置 操作角色标识，详细说明：{@link #FIELD_USERROLETAG}
     * 
     * @param userRoleTag
     * 
     */
    @JsonProperty(FIELD_USERROLETAG)
    public void setUserRoleTag(String userRoleTag){
        this.set(FIELD_USERROLETAG, userRoleTag);
    }
    
    /**
     * 获取 操作角色标识  
     * @return
     */
    @JsonIgnore
    public String getUserRoleTag(){
        Object objValue = this.get(FIELD_USERROLETAG);
        if(objValue==null){
            return null;
        }
        return (String)objValue;
    }

    /**
     * 判断 操作角色标识 是否指定值，包括空值
     * @return
     */
    @JsonIgnore
    public boolean isUserRoleTagDirty(){
        if(this.contains(FIELD_USERROLETAG)){
            return true;
        }
        return false;
    }

    /**
     * 重置 操作角色标识
     */
    @JsonIgnore
    public void resetUserRoleTag(){
        this.reset(FIELD_USERROLETAG);
    }

    /**
     * 设置 操作角色标识，详细说明：{@link #FIELD_USERROLETAG}
     * <P>
     * 等同 {@link #setUserRoleTag}
     * @param userRoleTag
     */
    @JsonIgnore
    public PSDEUserRole userroletag(String userRoleTag){
        this.setUserRoleTag(userRoleTag);
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
    public PSDEUserRole usertag(String userTag){
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
    public PSDEUserRole usertag2(String userTag2){
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
    public PSDEUserRole usertag3(String userTag3){
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
    public PSDEUserRole usertag4(String userTag4){
        this.setUserTag4(userTag4);
        return this;
    }

    /**
     * <B>VALIDFLAG</B>&nbsp;启用
     * <P>
     * 值参考&nbsp;{@link net.ibizsys.psmodel.core.util.PSModelEnums.YesNo} 
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
    public PSDEUserRole validflag(Integer validFlag){
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
    public PSDEUserRole validflag(Boolean validFlag){
        if(validFlag == null){
            this.setValidFlag(null);
        }
        else{
            this.setValidFlag(validFlag?BOOLEAN_TRUE:BOOLEAN_FALSE);
        }
        return this;
    }

    @JsonIgnore
    public String getId(){
        return this.getPSDEUserRoleId();
    }

    @JsonIgnore
    public void setId(String strValue){
        this.setPSDEUserRoleId(strValue);
    }

    @JsonIgnore
    public PSDEUserRole id(String strValue){
        this.setPSDEUserRoleId(strValue);
        return this;
    }


    /**
     *  实体操作标识角色 成员集合
     */
    public final static String FIELD_PSDEOPPRIVROLES = "psdeopprivroles";

    private java.util.List<net.ibizsys.psmodel.core.domain.PSDEOPPrivRole> psdeopprivroles;

    /**
     * 获取 实体操作标识角色 成员集合
     * @return
     */
    @JsonProperty(FIELD_PSDEOPPRIVROLES)
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEOPPrivRole> getPSDEOPPrivRoles(){
        return this.psdeopprivroles;
    }

    /**
     * 设置 实体操作标识角色 成员集合  
     * @param psdeopprivroles
     */
    @JsonProperty(FIELD_PSDEOPPRIVROLES)
    public void setPSDEOPPrivRoles(java.util.List<net.ibizsys.psmodel.core.domain.PSDEOPPrivRole> psdeopprivroles){
        this.psdeopprivroles = psdeopprivroles;
    }

    /**
     * 获取 实体操作标识角色 成员集合，不存在时建立集合对象
     * @return
     */
    @JsonIgnore
    public java.util.List<net.ibizsys.psmodel.core.domain.PSDEOPPrivRole> getPSDEOPPrivRolesIf(){
        if(this.psdeopprivroles == null){
            this.psdeopprivroles = new java.util.ArrayList<net.ibizsys.psmodel.core.domain.PSDEOPPrivRole>();          
        }
        return this.psdeopprivroles;
    }

    @Override
    public void copyTo(net.ibizsys.psmodel.core.util.IPSModel iPSModel){
        if(iPSModel instanceof PSDEUserRole){
            PSDEUserRole model = (PSDEUserRole)iPSModel;
            model.setPSDEOPPrivRoles(this.getPSDEOPPrivRoles());
        }
        super.copyTo(iPSModel);
    }
}
