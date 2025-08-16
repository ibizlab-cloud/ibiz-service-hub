package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTESTCASE 过滤器对象
 */
public class PSSysTestCaseFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysTestCaseFilter(){
    
    }      

    /**
     * 设置属性[预期类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter asserttype__eq(String value){
        this.setFieldCond("asserttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前属性示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter defpssyssamplevalueid__eq(String value){
        this.setFieldCond("defpssyssamplevalueid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前属性示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter defpssyssamplevaluename__eq(String value){
        this.setFieldCond("defpssyssamplevaluename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前属性示例值]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter defpssyssamplevaluename__like(String value){
        this.setFieldCond("defpssyssamplevaluename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdesadetailid__eq(String value){
        this.setFieldCond("psdesadetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdesadetailname__eq(String value){
        this.setFieldCond("psdesadetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口方法]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdesadetailname__like(String value){
        this.setFieldCond("psdesadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试用例名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestcasename__eq(String value){
        this.setFieldCond("pssystestcasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试用例名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestcasename__like(String value){
        this.setFieldCond("pssystestcasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestdataid__eq(String value){
        this.setFieldCond("pssystestdataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestdataname__eq(String value){
        this.setFieldCond("pssystestdataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestdataname__like(String value){
        this.setFieldCond("pssystestdataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestmoduleid__eq(String value){
        this.setFieldCond("pssystestmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestmodulename__eq(String value){
        this.setFieldCond("pssystestmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestmodulename__like(String value){
        this.setFieldCond("pssystestmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestprjid__eq(String value){
        this.setFieldCond("pssystestprjid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试项目]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestprjname__eq(String value){
        this.setFieldCond("pssystestprjname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试项目]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter pssystestprjname__like(String value){
        this.setFieldCond("pssystestprjname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[测试目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter targettype__eq(String value){
        this.setFieldCond("targettype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试用例级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter testcaselevel__eq(String value){
        this.setFieldCond("testcaselevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试用例编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter testcasesn__like(String value){
        this.setFieldCond("testcasesn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTestCaseFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
