package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDER 过滤器对象
 */
public class PSDERFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDERFilter(){
    
    }      

    /**
     * 设置属性[克隆关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter cloneordervalue__eq(Integer value){
        this.setFieldCond("cloneordervalue", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性继承模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter definheritmode__eq(Integer value){
        this.setFieldCond("definheritmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系子类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter dersubtype__eq(String value){
        this.setFieldCond("dersubtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter dertype__eq(String value){
        this.setFieldCond("dertype", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系类型]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter dertype__in(String value){
        this.setFieldCond("dertype", IN, value);
        return this;
    }

    /**
     * 设置属性[导出引用模型关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportmajormodel__eq(Integer value){
        this.setFieldCond("exportmajormodel", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出模型关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportmodel__eq(Integer value){
        this.setFieldCond("exportmodel", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope__eq(Integer value){
        this.setFieldCond("exportscope", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope2__eq(Integer value){
        this.setFieldCond("exportscope2", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope3__eq(Integer value){
        this.setFieldCond("exportscope3", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope4__eq(Integer value){
        this.setFieldCond("exportscope4", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope5__eq(Integer value){
        this.setFieldCond("exportscope5", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope6__eq(Integer value){
        this.setFieldCond("exportscope6", EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extmajorpsdefid__eq(String value){
        this.setFieldCond("extmajorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extmajorpsdefname__eq(String value){
        this.setFieldCond("extmajorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束主实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extmajorpsdefname__like(String value){
        this.setFieldCond("extmajorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加约束从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extminorpsdefid__eq(String value){
        this.setFieldCond("extminorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extminorpsdefname__eq(String value){
        this.setFieldCond("extminorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束从实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extminorpsdefname__like(String value){
        this.setFieldCond("extminorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[继承处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter inheritmode__eq(Integer value){
        this.setFieldCond("inheritmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[云关系主实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdeid__eq(String value){
        this.setFieldCond("majorpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系主实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdename__eq(String value){
        this.setFieldCond("majorpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系主实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdename__like(String value){
        this.setFieldCond("majorpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsderid__eq(String value){
        this.setFieldCond("majorpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdername__eq(String value){
        this.setFieldCond("majorpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体父关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdername__like(String value){
        this.setFieldCond("majorpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mdpsdeviewid__eq(String value){
        this.setFieldCond("mdpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mdpsdeviewname__eq(String value){
        this.setFieldCond("mdpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mdpsdeviewname__like(String value){
        this.setFieldCond("mdpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[从实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdedsid__eq(String value){
        this.setFieldCond("minorpsdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdedsname__eq(String value){
        this.setFieldCond("minorpsdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdedsname__like(String value){
        this.setFieldCond("minorpsdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系从实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdeid__eq(String value){
        this.setFieldCond("minorpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系从实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdename__eq(String value){
        this.setFieldCond("minorpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系从实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdename__like(String value){
        this.setFieldCond("minorpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[附属实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsderid__eq(String value){
        this.setFieldCond("minorpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[附属实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdername__eq(String value){
        this.setFieldCond("minorpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[附属实体父关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdername__like(String value){
        this.setFieldCond("minorpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter moblinkpsdeviewid__eq(String value){
        this.setFieldCond("moblinkpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter moblinkpsdeviewname__eq(String value){
        this.setFieldCond("moblinkpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端链接展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter moblinkpsdeviewname__like(String value){
        this.setFieldCond("moblinkpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobmdpsdeviewid__eq(String value){
        this.setFieldCond("mobmdpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobmdpsdeviewname__eq(String value){
        this.setFieldCond("mobmdpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端多选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobmdpsdeviewname__like(String value){
        this.setFieldCond("mobmdpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobsdpsdeviewid__eq(String value){
        this.setFieldCond("mobsdpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobsdpsdeviewname__eq(String value){
        this.setFieldCond("mobsdpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端单选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobsdpsdeviewname__like(String value){
        this.setFieldCond("mobsdpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdeacmodeid__eq(String value){
        this.setFieldCond("psdeacmodeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdeacmodename__eq(String value){
        this.setFieldCond("psdeacmodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdeacmodename__like(String value){
        this.setFieldCond("psdeacmodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主实体删除操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removeactiontype__eq(Integer value){
        this.setFieldCond("removeactiontype", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removerejectpslanresid__eq(String value){
        this.setFieldCond("removerejectpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removerejectpslanresname__eq(String value){
        this.setFieldCond("removerejectpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除拒绝消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removerejectpslanresname__like(String value){
        this.setFieldCond("removerejectpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter rspsdeviewid__eq(String value){
        this.setFieldCond("rspsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter rspsdeviewname__eq(String value){
        this.setFieldCond("rspsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter rspsdeviewname__like(String value){
        this.setFieldCond("rspsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter sdpsdeviewid__eq(String value){
        this.setFieldCond("sdpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter sdpsdeviewname__eq(String value){
        this.setFieldCond("sdpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter sdpsdeviewname__like(String value){
        this.setFieldCond("sdpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[同步模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter syncexportmodel__eq(Integer value){
        this.setFieldCond("syncexportmodel", EQ, value);
        return this;
    }

    /**
     * 设置属性[临时数据关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter tempordervalue__eq(Integer value){
        this.setFieldCond("tempordervalue", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
