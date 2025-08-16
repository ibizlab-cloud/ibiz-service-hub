package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUTIL 过滤器对象
 */
public class PSSysUtilFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysUtilFilter(){
    
    }      

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter authmode__eq(String value){
        this.setFieldCond("authmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter inpssysdatasyncagentid__eq(String value){
        this.setFieldCond("inpssysdatasyncagentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter inpssysdatasyncagentname__eq(String value){
        this.setFieldCond("inpssysdatasyncagentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter inpssysdatasyncagentname__like(String value){
        this.setFieldCond("inpssysdatasyncagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysdatasyncagentid__eq(String value){
        this.setFieldCond("outpssysdatasyncagentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysdatasyncagentname__eq(String value){
        this.setFieldCond("outpssysdatasyncagentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysdatasyncagentname__like(String value){
        this.setFieldCond("outpssysdatasyncagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysresourceid__eq(String value){
        this.setFieldCond("outpssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysresourcename__eq(String value){
        this.setFieldCond("outpssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysresourcename__like(String value){
        this.setFieldCond("outpssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psdegroupid__eq(String value){
        this.setFieldCond("psdegroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psdegroupname__eq(String value){
        this.setFieldCond("psdegroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psdegroupname__like(String value){
        this.setFieldCond("psdegroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psdergroupid__eq(String value){
        this.setFieldCond("psdergroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psdergroupname__eq(String value){
        this.setFieldCond("psdergroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psdergroupname__like(String value){
        this.setFieldCond("psdergroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysutilname__eq(String value){
        this.setFieldCond("pssysutilname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysutildename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysutilname__like(String value){
        this.setFieldCond("pssysutilname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysutildename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde10id__eq(String value){
        this.setFieldCond("utilpsde10id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde10name__eq(String value){
        this.setFieldCond("utilpsde10name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde10name__like(String value){
        this.setFieldCond("utilpsde10name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde11id__eq(String value){
        this.setFieldCond("utilpsde11id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde11name__eq(String value){
        this.setFieldCond("utilpsde11name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde11name__like(String value){
        this.setFieldCond("utilpsde11name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde12id__eq(String value){
        this.setFieldCond("utilpsde12id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde12name__eq(String value){
        this.setFieldCond("utilpsde12name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde12name__like(String value){
        this.setFieldCond("utilpsde12name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde13id__eq(String value){
        this.setFieldCond("utilpsde13id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde13name__eq(String value){
        this.setFieldCond("utilpsde13name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde13name__like(String value){
        this.setFieldCond("utilpsde13name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde14id__eq(String value){
        this.setFieldCond("utilpsde14id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde14name__eq(String value){
        this.setFieldCond("utilpsde14name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde14name__like(String value){
        this.setFieldCond("utilpsde14name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde15id__eq(String value){
        this.setFieldCond("utilpsde15id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde15name__eq(String value){
        this.setFieldCond("utilpsde15name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde15name__like(String value){
        this.setFieldCond("utilpsde15name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde16id__eq(String value){
        this.setFieldCond("utilpsde16id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde16name__eq(String value){
        this.setFieldCond("utilpsde16name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde16name__like(String value){
        this.setFieldCond("utilpsde16name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde17id__eq(String value){
        this.setFieldCond("utilpsde17id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde17name__eq(String value){
        this.setFieldCond("utilpsde17name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde17name__like(String value){
        this.setFieldCond("utilpsde17name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde18id__eq(String value){
        this.setFieldCond("utilpsde18id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde18name__eq(String value){
        this.setFieldCond("utilpsde18name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde18name__like(String value){
        this.setFieldCond("utilpsde18name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde19id__eq(String value){
        this.setFieldCond("utilpsde19id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde19name__eq(String value){
        this.setFieldCond("utilpsde19name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde19name__like(String value){
        this.setFieldCond("utilpsde19name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde20id__eq(String value){
        this.setFieldCond("utilpsde20id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde20name__eq(String value){
        this.setFieldCond("utilpsde20name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde20name__like(String value){
        this.setFieldCond("utilpsde20name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde2id__eq(String value){
        this.setFieldCond("utilpsde2id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde2name__eq(String value){
        this.setFieldCond("utilpsde2name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde2name__like(String value){
        this.setFieldCond("utilpsde2name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde3id__eq(String value){
        this.setFieldCond("utilpsde3id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde3name__eq(String value){
        this.setFieldCond("utilpsde3name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde3name__like(String value){
        this.setFieldCond("utilpsde3name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde4id__eq(String value){
        this.setFieldCond("utilpsde4id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde4name__eq(String value){
        this.setFieldCond("utilpsde4name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde4name__like(String value){
        this.setFieldCond("utilpsde4name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde5id__eq(String value){
        this.setFieldCond("utilpsde5id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde5name__eq(String value){
        this.setFieldCond("utilpsde5name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde5name__like(String value){
        this.setFieldCond("utilpsde5name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde6id__eq(String value){
        this.setFieldCond("utilpsde6id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde6name__eq(String value){
        this.setFieldCond("utilpsde6name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde6name__like(String value){
        this.setFieldCond("utilpsde6name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde7id__eq(String value){
        this.setFieldCond("utilpsde7id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde7name__eq(String value){
        this.setFieldCond("utilpsde7name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde7name__like(String value){
        this.setFieldCond("utilpsde7name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde8id__eq(String value){
        this.setFieldCond("utilpsde8id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde8name__eq(String value){
        this.setFieldCond("utilpsde8name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde8name__like(String value){
        this.setFieldCond("utilpsde8name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde9id__eq(String value){
        this.setFieldCond("utilpsde9id", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde9name__eq(String value){
        this.setFieldCond("utilpsde9name", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde9name__like(String value){
        this.setFieldCond("utilpsde9name", LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsdeid__eq(String value){
        this.setFieldCond("utilpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsdename__eq(String value){
        this.setFieldCond("utilpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsdename__like(String value){
        this.setFieldCond("utilpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utiltype__eq(String value){
        this.setFieldCond("utiltype", EQ, value);
        return this;
    }

}
