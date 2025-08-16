package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDER 过滤器对象
 */
public class PSDERFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDERFilter(){
    
    }      

    /**
     * 设置属性[克隆关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter cloneordervalue__eq(Integer value){
        this.setFieldCond("cloneordervalue", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性继承模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter definheritmode__eq(Integer value){
        this.setFieldCond("definheritmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系子类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter dersubtype__eq(String value){
        this.setFieldCond("dersubtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter dertype__eq(String value){
        this.setFieldCond("dertype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系类型]过滤操作[IN]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter dertype__in(String value){
        this.setFieldCond("dertype", Conditions.IN, value);
        return this;
    }

    /**
     * 设置属性[导出引用模型关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportmajormodel__eq(Integer value){
        this.setFieldCond("exportmajormodel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导出模型关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportmodel__eq(Integer value){
        this.setFieldCond("exportmodel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope__eq(Integer value){
        this.setFieldCond("exportscope", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope2__eq(Integer value){
        this.setFieldCond("exportscope2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope3__eq(Integer value){
        this.setFieldCond("exportscope3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope4__eq(Integer value){
        this.setFieldCond("exportscope4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope5__eq(Integer value){
        this.setFieldCond("exportscope5", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义导出关系6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter exportscope6__eq(Integer value){
        this.setFieldCond("exportscope6", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extmajorpsdefid__eq(String value){
        this.setFieldCond("extmajorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束主实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extmajorpsdefname__eq(String value){
        this.setFieldCond("extmajorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束主实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extmajorpsdefname__like(String value){
        this.setFieldCond("extmajorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加约束从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extminorpsdefid__eq(String value){
        this.setFieldCond("extminorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束从实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extminorpsdefname__eq(String value){
        this.setFieldCond("extminorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加约束从实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter extminorpsdefname__like(String value){
        this.setFieldCond("extminorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[继承处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter inheritmode__eq(Integer value){
        this.setFieldCond("inheritmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云关系主实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdeid__eq(String value){
        this.setFieldCond("majorpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系主实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdename__eq(String value){
        this.setFieldCond("majorpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系主实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdename__like(String value){
        this.setFieldCond("majorpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsderid__eq(String value){
        this.setFieldCond("majorpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdername__eq(String value){
        this.setFieldCond("majorpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体父关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter majorpsdername__like(String value){
        this.setFieldCond("majorpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mdpsdeviewid__eq(String value){
        this.setFieldCond("mdpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mdpsdeviewname__eq(String value){
        this.setFieldCond("mdpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多项数据选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mdpsdeviewname__like(String value){
        this.setFieldCond("mdpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdedsid__eq(String value){
        this.setFieldCond("minorpsdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdedsname__eq(String value){
        this.setFieldCond("minorpsdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdedsname__like(String value){
        this.setFieldCond("minorpsdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系从实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdeid__eq(String value){
        this.setFieldCond("minorpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系从实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdename__eq(String value){
        this.setFieldCond("minorpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系从实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdename__like(String value){
        this.setFieldCond("minorpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[附属实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsderid__eq(String value){
        this.setFieldCond("minorpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附属实体父关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdername__eq(String value){
        this.setFieldCond("minorpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附属实体父关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter minorpsdername__like(String value){
        this.setFieldCond("minorpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter moblinkpsdeviewid__eq(String value){
        this.setFieldCond("moblinkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端链接展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter moblinkpsdeviewname__eq(String value){
        this.setFieldCond("moblinkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端链接展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter moblinkpsdeviewname__like(String value){
        this.setFieldCond("moblinkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端多项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobmdpsdeviewid__eq(String value){
        this.setFieldCond("mobmdpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端多选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobmdpsdeviewname__eq(String value){
        this.setFieldCond("mobmdpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端多选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobmdpsdeviewname__like(String value){
        this.setFieldCond("mobmdpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobsdpsdeviewid__eq(String value){
        this.setFieldCond("mobsdpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端单选视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobsdpsdeviewname__eq(String value){
        this.setFieldCond("mobsdpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端单选视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter mobsdpsdeviewname__like(String value){
        this.setFieldCond("mobsdpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdeacmodeid__eq(String value){
        this.setFieldCond("psdeacmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdeacmodename__eq(String value){
        this.setFieldCond("psdeacmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdeacmodename__like(String value){
        this.setFieldCond("psdeacmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[主实体删除操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removeactiontype__eq(Integer value){
        this.setFieldCond("removeactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removerejectpslanresid__eq(String value){
        this.setFieldCond("removerejectpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除拒绝消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removerejectpslanresname__eq(String value){
        this.setFieldCond("removerejectpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除拒绝消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter removerejectpslanresname__like(String value){
        this.setFieldCond("removerejectpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter rspsdeviewid__eq(String value){
        this.setFieldCond("rspsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter rspsdeviewname__eq(String value){
        this.setFieldCond("rspsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关系数据展现视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter rspsdeviewname__like(String value){
        this.setFieldCond("rspsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter sdpsdeviewid__eq(String value){
        this.setFieldCond("sdpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter sdpsdeviewname__eq(String value){
        this.setFieldCond("sdpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单项数据选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter sdpsdeviewname__like(String value){
        this.setFieldCond("sdpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[同步模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter syncexportmodel__eq(Integer value){
        this.setFieldCond("syncexportmodel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[临时数据关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter tempordervalue__eq(Integer value){
        this.setFieldCond("tempordervalue", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
