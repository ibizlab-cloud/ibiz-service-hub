package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACTION 过滤器对象
 */
public class PSDEActionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEActionFilter(){
    
    }      

    /**
     * 设置属性[行为持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter actiontype__eq(String value){
        this.setFieldCond("actiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter batchactionmode__eq(Integer value){
        this.setFieldCond("batchactionmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter cachescope__eq(String value){
        this.setFieldCond("cachescope", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpsdefgroupid__eq(String value){
        this.setFieldCond("inpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpsdefgroupname__eq(String value){
        this.setFieldCond("inpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpsdefgroupname__like(String value){
        this.setFieldCond("inpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpsdesampledataid__eq(String value){
        this.setFieldCond("inpsdesampledataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpsdesampledataname__eq(String value){
        this.setFieldCond("inpsdesampledataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpsdesampledataname__like(String value){
        this.setFieldCond("inpsdesampledataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpssysdynamodelid__eq(String value){
        this.setFieldCond("inpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpssysdynamodelname__eq(String value){
        this.setFieldCond("inpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入对象模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter inpssysdynamodelname__like(String value){
        this.setFieldCond("inpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpsdefgroupid__eq(String value){
        this.setFieldCond("outpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpsdefgroupname__eq(String value){
        this.setFieldCond("outpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpsdefgroupname__like(String value){
        this.setFieldCond("outpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpsdesampledataid__eq(String value){
        this.setFieldCond("outpsdesampledataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpsdesampledataname__eq(String value){
        this.setFieldCond("outpsdesampledataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpsdesampledataname__like(String value){
        this.setFieldCond("outpsdesampledataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpssysdynamodelid__eq(String value){
        this.setFieldCond("outpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpssysdynamodelname__eq(String value){
        this.setFieldCond("outpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出对象模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outpssysdynamodelname__like(String value){
        this.setFieldCond("outpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出引用属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outrefpsdefgroupid__eq(String value){
        this.setFieldCond("outrefpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出引用属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outrefpsdefgroupname__eq(String value){
        this.setFieldCond("outrefpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出引用属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outrefpsdefgroupname__like(String value){
        this.setFieldCond("outrefpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outrefpsdeid__eq(String value){
        this.setFieldCond("outrefpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outrefpsdename__eq(String value){
        this.setFieldCond("outrefpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter outrefpsdename__like(String value){
        this.setFieldCond("outrefpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter paramtype__eq(Integer value){
        this.setFieldCond("paramtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeactiontemplid__eq(String value){
        this.setFieldCond("psdeactiontemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeactiontemplname__eq(String value){
        this.setFieldCond("psdeactiontemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeactiontemplname__like(String value){
        this.setFieldCond("psdeactiontemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdedataqueryid__eq(String value){
        this.setFieldCond("psdedataqueryid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdedataqueryname__eq(String value){
        this.setFieldCond("psdedataqueryname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdedataqueryname__like(String value){
        this.setFieldCond("psdedataqueryname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体系统过程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdesysprocid__eq(String value){
        this.setFieldCond("psdesysprocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体系统过程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdesysprocname__eq(String value){
        this.setFieldCond("psdesysprocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体系统过程]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter psdesysprocname__like(String value){
        this.setFieldCond("psdesysprocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统接口成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssubsyssadetailid__eq(String value){
        this.setFieldCond("pssubsyssadetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssubsyssadetailname__eq(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[直接服务请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter rawservicemethod__eq(String value){
        this.setFieldCond("rawservicemethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[请求参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter requestparamtype__eq(String value){
        this.setFieldCond("requestparamtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter retstddatatype__eq(Integer value){
        this.setFieldCond("retstddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试行为模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter testactionmode__eq(Integer value){
        this.setFieldCond("testactionmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[事务模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter tsmode__eq(String value){
        this.setFieldCond("tsmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
