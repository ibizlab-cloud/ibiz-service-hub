package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATASYNC 过滤器对象
 */
public class PSDEDataSyncFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataSyncFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导入数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter importpsdeactionid__eq(String value){
        this.setFieldCond("importpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导入数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter importpsdeactionname__eq(String value){
        this.setFieldCond("importpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导入数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter importpsdeactionname__like(String value){
        this.setFieldCond("importpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdeactionid__eq(String value){
        this.setFieldCond("inpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdeactionname__eq(String value){
        this.setFieldCond("inpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入过滤行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdeactionname__like(String value){
        this.setFieldCond("inpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdedatasetid__eq(String value){
        this.setFieldCond("inpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdedatasetname__eq(String value){
        this.setFieldCond("inpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpsdedatasetname__like(String value){
        this.setFieldCond("inpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpssysdatasyncagentid__eq(String value){
        this.setFieldCond("inpssysdatasyncagentid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpssysdatasyncagentname__eq(String value){
        this.setFieldCond("inpssysdatasyncagentname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter inpssysdatasyncagentname__like(String value){
        this.setFieldCond("inpssysdatasyncagentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outmode__eq(Integer value){
        this.setFieldCond("outmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdeactionid__eq(String value){
        this.setFieldCond("outpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出过滤行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdeactionname__eq(String value){
        this.setFieldCond("outpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出过滤行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdeactionname__like(String value){
        this.setFieldCond("outpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdedatasetid__eq(String value){
        this.setFieldCond("outpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdedatasetname__eq(String value){
        this.setFieldCond("outpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpsdedatasetname__like(String value){
        this.setFieldCond("outpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpssysdatasyncagentid__eq(String value){
        this.setFieldCond("outpssysdatasyncagentid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpssysdatasyncagentname__eq(String value){
        this.setFieldCond("outpssysdatasyncagentname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter outpssysdatasyncagentname__like(String value){
        this.setFieldCond("outpssysdatasyncagentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据同步名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdedatasyncname__like(String value){
        this.setFieldCond("psdedatasyncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据同步方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter syncdir__eq(String value){
        this.setFieldCond("syncdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataSyncFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
