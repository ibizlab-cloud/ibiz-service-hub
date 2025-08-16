package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATASET 过滤器对象
 */
public class PSDEDataSetFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDataSetFilter(){
    
    }      

    /**
     * 设置属性[行为持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合数据关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter aggdatapsderid__eq(String value){
        this.setFieldCond("aggdatapsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter aggdatapsdername__eq(String value){
        this.setFieldCond("aggdatapsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter aggdatapsdername__like(String value){
        this.setFieldCond("aggdatapsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[缓存检查状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachecheckstate__eq(String value){
        this.setFieldCond("cachecheckstate", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachescope__eq(String value){
        this.setFieldCond("cachescope", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存状态计算逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachestatepsdelogicid__eq(String value){
        this.setFieldCond("cachestatepsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存状态计算逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachestatepsdelogicname__eq(String value){
        this.setFieldCond("cachestatepsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存状态计算逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachestatepsdelogicname__like(String value){
        this.setFieldCond("cachestatepsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdefgroupid__eq(String value){
        this.setFieldCond("inpsdefgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdefgroupname__eq(String value){
        this.setFieldCond("inpsdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdefgroupname__like(String value){
        this.setFieldCond("inpsdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdesampledataid__eq(String value){
        this.setFieldCond("inpsdesampledataid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdesampledataname__eq(String value){
        this.setFieldCond("inpsdesampledataname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdesampledataname__like(String value){
        this.setFieldCond("inpsdesampledataname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpssysdynamodelid__eq(String value){
        this.setFieldCond("inpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpssysdynamodelname__eq(String value){
        this.setFieldCond("inpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpssysdynamodelname__like(String value){
        this.setFieldCond("inpssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorpsdefid__eq(String value){
        this.setFieldCond("majorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorpsdefname__eq(String value){
        this.setFieldCond("majorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[主排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorpsdefname__like(String value){
        this.setFieldCond("majorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorsortdir__eq(String value){
        this.setFieldCond("majorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[从排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorpsdefid__eq(String value){
        this.setFieldCond("minorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorpsdefname__eq(String value){
        this.setFieldCond("minorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[从排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorpsdefname__like(String value){
        this.setFieldCond("minorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[从排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdefgroupid__eq(String value){
        this.setFieldCond("outpsdefgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdefgroupname__eq(String value){
        this.setFieldCond("outpsdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdefgroupname__like(String value){
        this.setFieldCond("outpsdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdesampledataid__eq(String value){
        this.setFieldCond("outpsdesampledataid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdesampledataname__eq(String value){
        this.setFieldCond("outpsdesampledataname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdesampledataname__like(String value){
        this.setFieldCond("outpsdesampledataname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter paramtype__eq(Integer value){
        this.setFieldCond("paramtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefinetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter predefinedtype__like(String value){
        this.setFieldCond("predefinedtype", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefinetype", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedataimpid__eq(String value){
        this.setFieldCond("psdedataimpid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedataimpname__eq(String value){
        this.setFieldCond("psdedataimpname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssubsyssadetailid__eq(String value){
        this.setFieldCond("pssubsyssadetailid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssubsyssadetailname__eq(String value){
        this.setFieldCond("pssubsyssadetailname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统状态协调]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysunistateid__eq(String value){
        this.setFieldCond("pssysunistateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统状态协同]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysunistatename__eq(String value){
        this.setFieldCond("pssysunistatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统状态协同]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysunistatename__like(String value){
        this.setFieldCond("pssysunistatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrid__eq(String value){
        this.setFieldCond("pssysuserdrid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrid2__eq(String value){
        this.setFieldCond("pssysuserdrid2", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname__eq(String value){
        this.setFieldCond("pssysuserdrname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname__like(String value){
        this.setFieldCond("pssysuserdrname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname2__eq(String value){
        this.setFieldCond("pssysuserdrname2", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname2__like(String value){
        this.setFieldCond("pssysuserdrname2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[直接服务请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter rawservicemethod__eq(String value){
        this.setFieldCond("rawservicemethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图列级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter viewcollevel__eq(Integer value){
        this.setFieldCond("viewcollevel", EQ, value);
        return this;
    }

}
