package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBACKSERVICE 过滤器对象
 */
public class PSSysBackServiceFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBackServiceFilter(){
    
    }      

    /**
     * 设置属性[预置类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置任务]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psbackserviceid__eq(String value){
        this.setFieldCond("psbackserviceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置任务]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psbackservicename__eq(String value){
        this.setFieldCond("psbackservicename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置任务]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psbackservicename__like(String value){
        this.setFieldCond("psbackservicename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台任务名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysbackservicename__like(String value){
        this.setFieldCond("pssysbackservicename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysutildeid__eq(String value){
        this.setFieldCond("pssysutildeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysutildename__eq(String value){
        this.setFieldCond("pssysutildename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter pssysutildename__like(String value){
        this.setFieldCond("pssysutildename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务容器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter servicecontainer__eq(String value){
        this.setFieldCond("servicecontainer", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启动模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter startmode__eq(String value){
        this.setFieldCond("startmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter tasktype__eq(String value){
        this.setFieldCond("tasktype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBackServiceFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
