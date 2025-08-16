package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPFUNC 过滤器对象
 */
public class PSAppFuncFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppFuncFilter(){
    
    }      

    /**
     * 设置属性[应用功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter appfunctype__eq(String value){
        this.setFieldCond("appfunctype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter funcsn__like(String value){
        this.setFieldCond("funcsn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter openmode__eq(String value){
        this.setFieldCond("openmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用功能名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappfuncname__like(String value){
        this.setFieldCond("psappfuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappsubappid__eq(String value){
        this.setFieldCond("psappsubappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappsubappname__eq(String value){
        this.setFieldCond("psappsubappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappsubappname__like(String value){
        this.setFieldCond("psappsubappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pspdtappfuncid__eq(String value){
        this.setFieldCond("pspdtappfuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置应用功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pspdtappfuncname__eq(String value){
        this.setFieldCond("pspdtappfuncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置应用功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pspdtappfuncname__like(String value){
        this.setFieldCond("pspdtappfuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappid__eq(String value){
        this.setFieldCond("pssubappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappname__eq(String value){
        this.setFieldCond("pssubappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappname__like(String value){
        this.setFieldCond("pssubappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappviewid__eq(String value){
        this.setFieldCond("pssubappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappviewname__eq(String value){
        this.setFieldCond("pssubappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssubappviewname__like(String value){
        this.setFieldCond("pssubappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppFuncFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
