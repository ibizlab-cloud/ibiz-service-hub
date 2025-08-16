package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPFUNC 过滤器对象
 */
public class PSAppFuncFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppFuncFilter(){
    
    }      

    /**
     * 设置属性[应用功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter appfunctype__eq(String value){
        this.setFieldCond("appfunctype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter funcsn__like(String value){
        this.setFieldCond("funcsn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter openmode__eq(String value){
        this.setFieldCond("openmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappfuncname__eq(String value){
        this.setFieldCond("psappfuncname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappfuncname__like(String value){
        this.setFieldCond("psappfuncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappsubappid__eq(String value){
        this.setFieldCond("psappsubappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappsubappname__eq(String value){
        this.setFieldCond("psappsubappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappsubappname__like(String value){
        this.setFieldCond("psappsubappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pspdtappfuncid__eq(String value){
        this.setFieldCond("pspdtappfuncid", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pspdtappfuncname__eq(String value){
        this.setFieldCond("pspdtappfuncname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置应用功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pspdtappfuncname__like(String value){
        this.setFieldCond("pspdtappfuncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappid__eq(String value){
        this.setFieldCond("pssubappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappname__eq(String value){
        this.setFieldCond("pssubappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappname__like(String value){
        this.setFieldCond("pssubappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappviewid__eq(String value){
        this.setFieldCond("pssubappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappviewname__eq(String value){
        this.setFieldCond("pssubappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappviewname__like(String value){
        this.setFieldCond("pssubappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
