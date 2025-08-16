package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFIELD 过滤器对象
 */
public class PSDEFieldFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEFieldFilter(){
    
    }      

    /**
     * 设置属性[业务标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter biztag__eq(String value){
        this.setFieldCond("biztag", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库更新值模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter dbvaluemode__eq(String value){
        this.setFieldCond("dbvaluemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库新建值模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter dbvaluemode2__eq(String value){
        this.setFieldCond("dbvaluemode2", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter deftype__eq(Integer value){
        this.setFieldCond("deftype", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter derpsdefid__eq(String value){
        this.setFieldCond("derpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter derpsdefname__eq(String value){
        this.setFieldCond("derpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter derpsdefname__like(String value){
        this.setFieldCond("derpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[重复值检查]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter dupcheckmode__eq(String value){
        this.setFieldCond("dupcheckmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter dupcheckpsdefid__eq(String value){
        this.setFieldCond("dupcheckpsdefid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("dupchkpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter dupcheckpsdefname__eq(String value){
        this.setFieldCond("dupcheckpsdefname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("dupchkpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter dupcheckpsdefname__like(String value){
        this.setFieldCond("dupcheckpsdefname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("dupchkpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter defaultvaluetype__eq(String value){
        this.setFieldCond("defaultvaluetype", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("dvt", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter exppssystranslatorid__eq(String value){
        this.setFieldCond("exppssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter exppssystranslatorname__eq(String value){
        this.setFieldCond("exppssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导出转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter exppssystranslatorname__like(String value){
        this.setFieldCond("exppssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter imppssystranslatorid__eq(String value){
        this.setFieldCond("imppssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter imppssystranslatorname__eq(String value){
        this.setFieldCond("imppssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导入转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter imppssystranslatorname__like(String value){
        this.setFieldCond("imppssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[主信息属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter majorfield__eq(Integer value){
        this.setFieldCond("majorfield", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter no2dupchkpsdefid__eq(String value){
        this.setFieldCond("no2dupchkpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter no2dupchkpsdefname__eq(String value){
        this.setFieldCond("no2dupchkpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter no2dupchkpsdefname__like(String value){
        this.setFieldCond("no2dupchkpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[范围属性3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter no3dupchkpsdefid__eq(String value){
        this.setFieldCond("no3dupchkpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter no3dupchkpsdefname__eq(String value){
        this.setFieldCond("no3dupchkpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[范围属性3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter no3dupchkpsdefname__like(String value){
        this.setFieldCond("no3dupchkpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[空值排序]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter nullvalorder__eq(String value){
        this.setFieldCond("nullvalorder", EQ, value);
        return this;
    }

    /**
     * 设置属性[一对多关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter o2mpsderid__eq(String value){
        this.setFieldCond("o2mpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[一对多关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter o2mpsdername__eq(String value){
        this.setFieldCond("o2mpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[一对多关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter o2mpsdername__like(String value){
        this.setFieldCond("o2mpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[一对一关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter o2opsderid__eq(String value){
        this.setFieldCond("o2opsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[一对一关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter o2opsdername__eq(String value){
        this.setFieldCond("o2opsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[一对一关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter o2opsdername__like(String value){
        this.setFieldCond("o2opsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[物理化属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter physicalfield__eq(Integer value){
        this.setFieldCond("physicalfield", EQ, value);
        return this;
    }

    /**
     * 设置属性[主键属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pkey__eq(Integer value){
        this.setFieldCond("pkey", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefinetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdatatypeid__eq(String value){
        this.setFieldCond("psdatatypeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdatatypename__eq(String value){
        this.setFieldCond("psdatatypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdatatypename__like(String value){
        this.setFieldCond("psdatatypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdefieldname__eq(String value){
        this.setFieldCond("psdefieldname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdefieldname__like(String value){
        this.setFieldCond("psdefieldname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssubsyssadefieldid__eq(String value){
        this.setFieldCond("pssubsyssadefieldid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssubsyssadefieldname__eq(String value){
        this.setFieldCond("pssubsyssadefieldname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部接口实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssubsyssadefieldname__like(String value){
        this.setFieldCond("pssubsyssadefieldname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssyssamplevalueid__eq(String value){
        this.setFieldCond("pssyssamplevalueid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssyssamplevaluename__eq(String value){
        this.setFieldCond("pssyssamplevaluename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统示例值]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssyssamplevaluename__like(String value){
        this.setFieldCond("pssyssamplevaluename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssyssequenceid__eq(String value){
        this.setFieldCond("pssyssequenceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssyssequencename__eq(String value){
        this.setFieldCond("pssyssequencename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值序列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssyssequencename__like(String value){
        this.setFieldCond("pssyssequencename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssysunitid__eq(String value){
        this.setFieldCond("pssysunitid", EQ, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssysunitname__eq(String value){
        this.setFieldCond("pssysunitname", EQ, value);
        return this;
    }

    /**
     * 设置属性[单位]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssysunitname__like(String value){
        this.setFieldCond("pssysunitname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[基础值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[基础值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter refpssysdynamodelid__eq(String value){
        this.setFieldCond("refpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter refpssysdynamodelname__eq(String value){
        this.setFieldCond("refpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter refpssysdynamodelname__like(String value){
        this.setFieldCond("refpssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[限制属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter restrictedpsdefid__eq(String value){
        this.setFieldCond("restrictedpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[限制属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter restrictedpsdefname__eq(String value){
        this.setFieldCond("restrictedpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[限制属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter restrictedpsdefname__like(String value){
        this.setFieldCond("restrictedpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值序列使用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter sequencemode__eq(String value){
        this.setFieldCond("sequencemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[主状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter statefield__eq(String value){
        this.setFieldCond("statefield", EQ, value);
        return this;
    }

    /**
     * 设置属性[字符转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter stringcase__eq(String value){
        this.setFieldCond("stringcase", EQ, value);
        return this;
    }

    /**
     * 设置属性[表范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter tablescope__eq(String value){
        this.setFieldCond("tablescope", EQ, value);
        return this;
    }

    /**
     * 设置属性[值转换使用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter translatormode__eq(String value){
        this.setFieldCond("translatormode", EQ, value);
        return this;
    }

    /**
     * 设置属性[联合键值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter unionkeyvalue__eq(String value){
        this.setFieldCond("unionkeyvalue", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新旧值回填]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter updateovmode__eq(String value){
        this.setFieldCond("updateovmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[值项属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值项属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值项属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图列级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFieldFilter viewcollevel__eq(Integer value){
        this.setFieldCond("viewcollevel", EQ, value);
        return this;
    }

}
