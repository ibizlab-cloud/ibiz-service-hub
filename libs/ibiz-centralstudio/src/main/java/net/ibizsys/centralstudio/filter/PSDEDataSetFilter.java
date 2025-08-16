package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATASET 过滤器对象
 */
public class PSDEDataSetFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataSetFilter(){
    
    }      

    /**
     * 设置属性[行为持有者]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter actionholder__eq(Integer value){
        this.setFieldCond("actionholder", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合数据关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter aggdatapsderid__eq(String value){
        this.setFieldCond("aggdatapsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter aggdatapsdername__eq(String value){
        this.setFieldCond("aggdatapsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter aggdatapsdername__like(String value){
        this.setFieldCond("aggdatapsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[缓存检查状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachecheckstate__eq(String value){
        this.setFieldCond("cachecheckstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachescope__eq(String value){
        this.setFieldCond("cachescope", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存状态计算逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachestatepsdelogicid__eq(String value){
        this.setFieldCond("cachestatepsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存状态计算逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachestatepsdelogicname__eq(String value){
        this.setFieldCond("cachestatepsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[缓存状态计算逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter cachestatepsdelogicname__like(String value){
        this.setFieldCond("cachestatepsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdefgroupid__eq(String value){
        this.setFieldCond("inpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdefgroupname__eq(String value){
        this.setFieldCond("inpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入属性集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdefgroupname__like(String value){
        this.setFieldCond("inpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdesampledataid__eq(String value){
        this.setFieldCond("inpsdesampledataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdesampledataname__eq(String value){
        this.setFieldCond("inpsdesampledataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpsdesampledataname__like(String value){
        this.setFieldCond("inpsdesampledataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpssysdynamodelid__eq(String value){
        this.setFieldCond("inpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpssysdynamodelname__eq(String value){
        this.setFieldCond("inpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter inpssysdynamodelname__like(String value){
        this.setFieldCond("inpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorpsdefid__eq(String value){
        this.setFieldCond("majorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorpsdefname__eq(String value){
        this.setFieldCond("majorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorpsdefname__like(String value){
        this.setFieldCond("majorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter majorsortdir__eq(String value){
        this.setFieldCond("majorsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorpsdefid__eq(String value){
        this.setFieldCond("minorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorpsdefname__eq(String value){
        this.setFieldCond("minorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorpsdefname__like(String value){
        this.setFieldCond("minorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdefgroupid__eq(String value){
        this.setFieldCond("outpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdefgroupname__eq(String value){
        this.setFieldCond("outpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出属性集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdefgroupname__like(String value){
        this.setFieldCond("outpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdesampledataid__eq(String value){
        this.setFieldCond("outpsdesampledataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdesampledataname__eq(String value){
        this.setFieldCond("outpsdesampledataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出示例数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter outpsdesampledataname__like(String value){
        this.setFieldCond("outpsdesampledataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter paramtype__eq(Integer value){
        this.setFieldCond("paramtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefinetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter predefinedtype__like(String value){
        this.setFieldCond("predefinedtype", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefinetype", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedataimpid__eq(String value){
        this.setFieldCond("psdedataimpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedataimpname__eq(String value){
        this.setFieldCond("psdedataimpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据导入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedataimpname__like(String value){
        this.setFieldCond("psdedataimpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[访问操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssubsyssadetailid__eq(String value){
        this.setFieldCond("pssubsyssadetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssubsyssadetailname__eq(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体方法]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统状态协调]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysunistateid__eq(String value){
        this.setFieldCond("pssysunistateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统状态协同]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysunistatename__eq(String value){
        this.setFieldCond("pssysunistatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统状态协同]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysunistatename__like(String value){
        this.setFieldCond("pssysunistatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrid__eq(String value){
        this.setFieldCond("pssysuserdrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrid2__eq(String value){
        this.setFieldCond("pssysuserdrid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname__eq(String value){
        this.setFieldCond("pssysuserdrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname__like(String value){
        this.setFieldCond("pssysuserdrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname2__eq(String value){
        this.setFieldCond("pssysuserdrname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter pssysuserdrname2__like(String value){
        this.setFieldCond("pssysuserdrname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[直接服务请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter rawservicemethod__eq(String value){
        this.setFieldCond("rawservicemethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter requestmethod__eq(String value){
        this.setFieldCond("requestmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter retvaltype__eq(String value){
        this.setFieldCond("retvaltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSetFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
