package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNSYS 过滤器对象
 */
public class PSDevSlnSysFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnSysFilter(){
    
    }      

    /**
     * 设置属性[开发系统标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开放方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[解决方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[解决方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pssysmodelinstname__eq(String value){
        this.setFieldCond("pssysmodelinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pssysmodelinstname__like(String value){
        this.setFieldCond("pssysmodelinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pssysmodelinstid__eq(String value){
        this.setFieldCond("pssysmodelinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter systype__eq(String value){
        this.setFieldCond("systype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcenterdbinstid__eq(String value){
        this.setFieldCond("psdevcenterdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcenterdbinstname__eq(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcenterdbinstname__like(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[MySQL实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mysqlpsdcdbinstid__eq(String value){
        this.setFieldCond("mysqlpsdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[SqlServer实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mssqlpsdcdbinstname__eq(String value){
        this.setFieldCond("mssqlpsdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[SqlServer实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mssqlpsdcdbinstname__like(String value){
        this.setFieldCond("mssqlpsdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[MySQL实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mysqlpsdcdbinstname__eq(String value){
        this.setFieldCond("mysqlpsdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[MySQL实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mysqlpsdcdbinstname__like(String value){
        this.setFieldCond("mysqlpsdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[PostgreSQL实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pgsqlpsdcdbinstid__eq(String value){
        this.setFieldCond("pgsqlpsdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[SqlServer实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mssqlpsdcdbinstid__eq(String value){
        this.setFieldCond("mssqlpsdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[PostgreSQL实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pgsqlpsdcdbinstname__eq(String value){
        this.setFieldCond("pgsqlpsdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[PostgreSQL实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pgsqlpsdcdbinstname__like(String value){
        this.setFieldCond("pgsqlpsdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[Oracle实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter orapsdcdbinstname__eq(String value){
        this.setFieldCond("orapsdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Oracle实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter orapsdcdbinstname__like(String value){
        this.setFieldCond("orapsdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[Oracle实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter orapsdcdbinstid__eq(String value){
        this.setFieldCond("orapsdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[PPAS实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ppaspsdcdbinstname__eq(String value){
        this.setFieldCond("ppaspsdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[PPAS实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ppaspsdcdbinstname__like(String value){
        this.setFieldCond("ppaspsdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[DB2实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter db2psdcdbinstname__eq(String value){
        this.setFieldCond("db2psdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[DB2实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter db2psdcdbinstname__like(String value){
        this.setFieldCond("db2psdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[PPAS实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ppaspsdcdbinstid__eq(String value){
        this.setFieldCond("ppaspsdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[DB2实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter db2psdcdbinstid__eq(String value){
        this.setFieldCond("db2psdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcentersvnname__eq(String value){
        this.setFieldCond("psdevcentersvnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcentersvnname__like(String value){
        this.setFieldCond("psdevcentersvnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[版本库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdevcentersvnid__eq(String value){
        this.setFieldCond("psdevcentersvnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本库（只读）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ropsdevcentersvnid__eq(String value){
        this.setFieldCond("ropsdevcentersvnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本库（只读）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ropsdevcentersvnname__eq(String value){
        this.setFieldCond("ropsdevcentersvnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本库（只读）]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ropsdevcentersvnname__like(String value){
        this.setFieldCond("ropsdevcentersvnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[版本库（模型）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter modelpsdevcentersvnname__eq(String value){
        this.setFieldCond("modelpsdevcentersvnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本库（模型）]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter modelpsdevcentersvnname__like(String value){
        this.setFieldCond("modelpsdevcentersvnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[版本库（模型）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter modelpsdevcentersvnid__eq(String value){
        this.setFieldCond("modelpsdevcentersvnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ppsdevslnsysid__eq(String value){
        this.setFieldCond("ppsdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主干系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mainpsdevslnsysname__eq(String value){
        this.setFieldCond("mainpsdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主干系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mainpsdevslnsysname__like(String value){
        this.setFieldCond("mainpsdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ppsdevslnsysname__eq(String value){
        this.setFieldCond("ppsdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter ppsdevslnsysname__like(String value){
        this.setFieldCond("ppsdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主干系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter mainpsdevslnsysid__eq(String value){
        this.setFieldCond("mainpsdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pssfname__eq(String value){
        this.setFieldCond("pssfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pssfname__like(String value){
        this.setFieldCond("pssfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台技术架构]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter pssfid__eq(String value){
        this.setFieldCond("pssfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter devsysstate__eq(Integer value){
        this.setFieldCond("devsysstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[支持动态系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter enabledynasys__eq(Integer value){
        this.setFieldCond("enabledynasys", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署系统类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter deploysystype__eq(String value){
        this.setFieldCond("deploysystype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[版本类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter vctype__eq(String value){
        this.setFieldCond("vctype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型规范]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdcmodeltemplname__eq(String value){
        this.setFieldCond("psdcmodeltemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型规范]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdcmodeltemplname__like(String value){
        this.setFieldCond("psdcmodeltemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型规范]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysFilter psdcmodeltemplid__eq(String value){
        this.setFieldCond("psdcmodeltemplid", Conditions.EQ, value);
        return this;
    }

}