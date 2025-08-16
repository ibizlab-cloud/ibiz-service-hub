package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATASYNC 过滤器对象
 */
public class PSDEDataSyncFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDataSyncFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导入数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter importpsdeactionid__eq(String value){
        this.setFieldCond("importpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter importpsdeactionname__eq(String value){
        this.setFieldCond("importpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter importpsdeactionname__like(String value){
        this.setFieldCond("importpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdeactionid__eq(String value){
        this.setFieldCond("inpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdeactionname__eq(String value){
        this.setFieldCond("inpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入过滤行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdeactionname__like(String value){
        this.setFieldCond("inpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdedatasetid__eq(String value){
        this.setFieldCond("inpsdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdedatasetname__eq(String value){
        this.setFieldCond("inpsdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdedatasetname__like(String value){
        this.setFieldCond("inpsdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpssysdatasyncagentid__eq(String value){
        this.setFieldCond("inpssysdatasyncagentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpssysdatasyncagentname__eq(String value){
        this.setFieldCond("inpssysdatasyncagentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpssysdatasyncagentname__like(String value){
        this.setFieldCond("inpssysdatasyncagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outmode__eq(Integer value){
        this.setFieldCond("outmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdeactionid__eq(String value){
        this.setFieldCond("outpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdeactionname__eq(String value){
        this.setFieldCond("outpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出过滤行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdeactionname__like(String value){
        this.setFieldCond("outpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdedatasetid__eq(String value){
        this.setFieldCond("outpsdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdedatasetname__eq(String value){
        this.setFieldCond("outpsdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdedatasetname__like(String value){
        this.setFieldCond("outpsdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpssysdatasyncagentid__eq(String value){
        this.setFieldCond("outpssysdatasyncagentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpssysdatasyncagentname__eq(String value){
        this.setFieldCond("outpssysdatasyncagentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpssysdatasyncagentname__like(String value){
        this.setFieldCond("outpssysdatasyncagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据同步名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdedatasyncname__eq(String value){
        this.setFieldCond("psdedatasyncname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据同步名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdedatasyncname__like(String value){
        this.setFieldCond("psdedatasyncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据同步方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter syncdir__eq(String value){
        this.setFieldCond("syncdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
