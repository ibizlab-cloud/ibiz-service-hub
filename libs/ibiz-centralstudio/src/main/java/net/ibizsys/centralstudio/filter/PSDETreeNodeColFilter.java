package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETREENODECOL 过滤器对象
 */
public class PSDETreeNodeColFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDETreeNodeColFilter(){
    
    }      

    /**
     * 设置属性[代码值转换模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter clconvertmode__eq(String value){
        this.setFieldCond("clconvertmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出代码表模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter codelistconfigmode__eq(Integer value){
        this.setFieldCond("codelistconfigmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[新建默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter createdvt__eq(String value){
        this.setFieldCond("createdvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter editortype__eq(String value){
        this.setFieldCond("editortype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter enablecond__eq(Integer value){
        this.setFieldCond("enablecond", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter groupitem__eq(String value){
        this.setFieldCond("groupitem", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[忽略输入值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter ignoreinput__eq(Integer value){
        this.setFieldCond("ignoreinput", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pickuppsdeviewid__eq(String value){
        this.setFieldCond("pickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pickuppsdeviewname__eq(String value){
        this.setFieldCond("pickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pickuppsdeviewname__like(String value){
        this.setFieldCond("pickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树表格列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreecolid__eq(String value){
        this.setFieldCond("psdetreecolid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树表格列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreecolname__eq(String value){
        this.setFieldCond("psdetreecolname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树表格列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreecolname__like(String value){
        this.setFieldCond("psdetreecolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[节点数据项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreenodecolname__like(String value){
        this.setFieldCond("psdetreenodecolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreenodeid__eq(String value){
        this.setFieldCond("psdetreenodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreenodename__eq(String value){
        this.setFieldCond("psdetreenodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreenodename__like(String value){
        this.setFieldCond("psdetreenodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssysdictcatid__eq(String value){
        this.setFieldCond("pssysdictcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssysdictcatname__eq(String value){
        this.setFieldCond("pssysdictcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssysdictcatname__like(String value){
        this.setFieldCond("pssysdictcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter updatedvt__eq(String value){
        this.setFieldCond("updatedvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeColFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
