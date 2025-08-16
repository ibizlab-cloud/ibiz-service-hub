package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUTIL 过滤器对象
 */
public class PSSysUtilFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUtilFilter(){
    
    }      

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter authmode__eq(String value){
        this.setFieldCond("authmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter inpssysdatasyncagentid__eq(String value){
        this.setFieldCond("inpssysdatasyncagentid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter inpssysdatasyncagentname__eq(String value){
        this.setFieldCond("inpssysdatasyncagentname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter inpssysdatasyncagentname__like(String value){
        this.setFieldCond("inpssysdatasyncagentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysdatasyncagentid__eq(String value){
        this.setFieldCond("outpssysdatasyncagentid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysdatasyncagentname__eq(String value){
        this.setFieldCond("outpssysdatasyncagentname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出数据代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysdatasyncagentname__like(String value){
        this.setFieldCond("outpssysdatasyncagentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysresourceid__eq(String value){
        this.setFieldCond("outpssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysresourcename__eq(String value){
        this.setFieldCond("outpssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter outpssysresourcename__like(String value){
        this.setFieldCond("outpssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysutilname__eq(String value){
        this.setFieldCond("pssysutilname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysutildename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter pssysutilname__like(String value){
        this.setFieldCond("pssysutilname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysutildename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde10id__eq(String value){
        this.setFieldCond("utilpsde10id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde10name__eq(String value){
        this.setFieldCond("utilpsde10name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体10]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde10name__like(String value){
        this.setFieldCond("utilpsde10name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde11id__eq(String value){
        this.setFieldCond("utilpsde11id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde11name__eq(String value){
        this.setFieldCond("utilpsde11name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体11]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde11name__like(String value){
        this.setFieldCond("utilpsde11name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde12id__eq(String value){
        this.setFieldCond("utilpsde12id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde12name__eq(String value){
        this.setFieldCond("utilpsde12name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体12]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde12name__like(String value){
        this.setFieldCond("utilpsde12name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde13id__eq(String value){
        this.setFieldCond("utilpsde13id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde13name__eq(String value){
        this.setFieldCond("utilpsde13name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体13]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde13name__like(String value){
        this.setFieldCond("utilpsde13name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde14id__eq(String value){
        this.setFieldCond("utilpsde14id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde14name__eq(String value){
        this.setFieldCond("utilpsde14name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体14]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde14name__like(String value){
        this.setFieldCond("utilpsde14name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde15id__eq(String value){
        this.setFieldCond("utilpsde15id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde15name__eq(String value){
        this.setFieldCond("utilpsde15name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体15]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde15name__like(String value){
        this.setFieldCond("utilpsde15name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde16id__eq(String value){
        this.setFieldCond("utilpsde16id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde16name__eq(String value){
        this.setFieldCond("utilpsde16name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体16]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde16name__like(String value){
        this.setFieldCond("utilpsde16name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde17id__eq(String value){
        this.setFieldCond("utilpsde17id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde17name__eq(String value){
        this.setFieldCond("utilpsde17name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体17]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde17name__like(String value){
        this.setFieldCond("utilpsde17name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde18id__eq(String value){
        this.setFieldCond("utilpsde18id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde18name__eq(String value){
        this.setFieldCond("utilpsde18name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体18]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde18name__like(String value){
        this.setFieldCond("utilpsde18name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde19id__eq(String value){
        this.setFieldCond("utilpsde19id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde19name__eq(String value){
        this.setFieldCond("utilpsde19name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体19]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde19name__like(String value){
        this.setFieldCond("utilpsde19name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde20id__eq(String value){
        this.setFieldCond("utilpsde20id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde20name__eq(String value){
        this.setFieldCond("utilpsde20name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体20]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde20name__like(String value){
        this.setFieldCond("utilpsde20name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde2id__eq(String value){
        this.setFieldCond("utilpsde2id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde2name__eq(String value){
        this.setFieldCond("utilpsde2name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde2name__like(String value){
        this.setFieldCond("utilpsde2name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde3id__eq(String value){
        this.setFieldCond("utilpsde3id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde3name__eq(String value){
        this.setFieldCond("utilpsde3name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde3name__like(String value){
        this.setFieldCond("utilpsde3name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde4id__eq(String value){
        this.setFieldCond("utilpsde4id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde4name__eq(String value){
        this.setFieldCond("utilpsde4name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde4name__like(String value){
        this.setFieldCond("utilpsde4name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde5id__eq(String value){
        this.setFieldCond("utilpsde5id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde5name__eq(String value){
        this.setFieldCond("utilpsde5name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde5name__like(String value){
        this.setFieldCond("utilpsde5name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde6id__eq(String value){
        this.setFieldCond("utilpsde6id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde6name__eq(String value){
        this.setFieldCond("utilpsde6name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde6name__like(String value){
        this.setFieldCond("utilpsde6name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde7id__eq(String value){
        this.setFieldCond("utilpsde7id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde7name__eq(String value){
        this.setFieldCond("utilpsde7name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体7]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde7name__like(String value){
        this.setFieldCond("utilpsde7name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde8id__eq(String value){
        this.setFieldCond("utilpsde8id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde8name__eq(String value){
        this.setFieldCond("utilpsde8name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体8]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde8name__like(String value){
        this.setFieldCond("utilpsde8name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde9id__eq(String value){
        this.setFieldCond("utilpsde9id", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde9name__eq(String value){
        this.setFieldCond("utilpsde9name", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能实体9]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsde9name__like(String value){
        this.setFieldCond("utilpsde9name", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsdeid__eq(String value){
        this.setFieldCond("utilpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsdename__eq(String value){
        this.setFieldCond("utilpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[相关实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utilpsdename__like(String value){
        this.setFieldCond("utilpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUtilFilter utiltype__eq(String value){
        this.setFieldCond("utiltype", Conditions.EQ, value);
        return this;
    }

}
