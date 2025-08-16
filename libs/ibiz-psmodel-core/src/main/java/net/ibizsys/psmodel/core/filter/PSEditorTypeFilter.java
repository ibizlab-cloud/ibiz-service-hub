package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSEDITORTYPE 过滤器对象
 */
public class PSEditorTypeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSEditorTypeFilter(){
    
    }      

    /**
     * 设置属性[后台处理对象类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSEditorTypeFilter ajaxhandler__eq(String value){
        this.setFieldCond("ajaxhandler", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSEditorTypeFilter linkviewshowmode__eq(String value){
        this.setFieldCond("linkviewshowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSEditorTypeFilter pseditortypename__like(String value){
        this.setFieldCond("pseditortypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSEditorTypeFilter refviewshowmode__eq(String value){
        this.setFieldCond("refviewshowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[基础编辑器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSEditorTypeFilter standardeditor__eq(String value){
        this.setFieldCond("standardeditor", EQ, value);
        return this;
    }

}
