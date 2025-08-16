package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFDE 过滤器对象
 */
public class PSWFDEFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFDEFilter(){
    
    }      

    /**
     * 设置属性[移动端默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionmobpsdeviewid__eq(String value){
        this.setFieldCond("actionmobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionmobpsdeviewname__eq(String value){
        this.setFieldCond("actionmobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionmobpsdeviewname__like(String value){
        this.setFieldCond("actionmobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionpsdeviewid__eq(String value){
        this.setFieldCond("actionpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionpsdeviewname__eq(String value){
        this.setFieldCond("actionpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionpsdeviewname__like(String value){
        this.setFieldCond("actionpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[完成实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter finishpsdeactionid__eq(String value){
        this.setFieldCond("finishpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter finishpsdeactionname__eq(String value){
        this.setFieldCond("finishpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter finishpsdeactionname__like(String value){
        this.setFieldCond("finishpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter initpsdeactionid__eq(String value){
        this.setFieldCond("initpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter initpsdeactionname__eq(String value){
        this.setFieldCond("initpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter initpsdeactionname__like(String value){
        this.setFieldCond("initpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydata2psdeviewid__eq(String value){
        this.setFieldCond("mobproxydata2psdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydata2psdeviewname__eq(String value){
        this.setFieldCond("mobproxydata2psdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据编辑视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydata2psdeviewname__like(String value){
        this.setFieldCond("mobproxydata2psdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydatapsdeviewid__eq(String value){
        this.setFieldCond("mobproxydatapsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydatapsdeviewname__eq(String value){
        this.setFieldCond("mobproxydatapsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydatapsdeviewname__like(String value){
        this.setFieldCond("mobproxydatapsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程数据语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfdatapslanresid__eq(String value){
        this.setFieldCond("mywfdatapslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程数据语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfdatapslanresname__eq(String value){
        this.setFieldCond("mywfdatapslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程数据语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfdatapslanresname__like(String value){
        this.setFieldCond("mywfdatapslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程工作语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfworkpslanresid__eq(String value){
        this.setFieldCond("mywfworkpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程工作语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfworkpslanresname__eq(String value){
        this.setFieldCond("mywfworkpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程工作语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfworkpslanresname__like(String value){
        this.setFieldCond("mywfworkpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydata2psdeviewid__eq(String value){
        this.setFieldCond("proxydata2psdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydata2psdeviewname__eq(String value){
        this.setFieldCond("proxydata2psdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据编辑视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydata2psdeviewname__like(String value){
        this.setFieldCond("proxydata2psdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdefid__eq(String value){
        this.setFieldCond("proxydatapsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdefname__eq(String value){
        this.setFieldCond("proxydatapsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdefname__like(String value){
        this.setFieldCond("proxydatapsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdeviewid__eq(String value){
        this.setFieldCond("proxydatapsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdeviewname__eq(String value){
        this.setFieldCond("proxydatapsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdeviewname__like(String value){
        this.setFieldCond("proxydatapsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理模块属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxymodulepsdefid__eq(String value){
        this.setFieldCond("proxymodulepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理模块属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxymodulepsdefname__eq(String value){
        this.setFieldCond("proxymodulepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理模块属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxymodulepsdefname__like(String value){
        this.setFieldCond("proxymodulepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理流程属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxywfpsdefid__eq(String value){
        this.setFieldCond("proxywfpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理流程属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxywfpsdefname__eq(String value){
        this.setFieldCond("proxywfpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代理流程属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxywfpsdefname__like(String value){
        this.setFieldCond("proxywfpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfname__like(String value){
        this.setFieldCond("pswfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pwfinstpsdefid__eq(String value){
        this.setFieldCond("pwfinstpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pwfinstpsdefname__eq(String value){
        this.setFieldCond("pwfinstpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父流程实例属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pwfinstpsdefname__like(String value){
        this.setFieldCond("pwfinstpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startmobpsdeviewid__eq(String value){
        this.setFieldCond("startmobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startmobpsdeviewname__eq(String value){
        this.setFieldCond("startmobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startmobpsdeviewname__like(String value){
        this.setFieldCond("startmobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startpsdeviewid__eq(String value){
        this.setFieldCond("startpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startpsdeviewname__eq(String value){
        this.setFieldCond("startpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startpsdeviewname__like(String value){
        this.setFieldCond("startpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[业务状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程操作者属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfactorpsdefid__eq(String value){
        this.setFieldCond("wfactorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程操作者属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfactorpsdefname__eq(String value){
        this.setFieldCond("wfactorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程操作者属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfactorpsdefname__like(String value){
        this.setFieldCond("wfactorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfidpsdefid__eq(String value){
        this.setFieldCond("wfidpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfidpsdefname__eq(String value){
        this.setFieldCond("wfidpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfidpsdefname__like(String value){
        this.setFieldCond("wfidpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfinstpsdefid__eq(String value){
        this.setFieldCond("wfinstpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfinstpsdefname__eq(String value){
        this.setFieldCond("wfinstpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程实例属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfinstpsdefname__like(String value){
        this.setFieldCond("wfinstpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程结果属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfretpsdefid__eq(String value){
        this.setFieldCond("wfretpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程结果属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfretpsdefname__eq(String value){
        this.setFieldCond("wfretpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程结果属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfretpsdefname__like(String value){
        this.setFieldCond("wfretpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfstatepsdefid__eq(String value){
        this.setFieldCond("wfstatepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfstatepsdefname__eq(String value){
        this.setFieldCond("wfstatepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfstatepsdefname__like(String value){
        this.setFieldCond("wfstatepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程步骤属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfsteppsdefid__eq(String value){
        this.setFieldCond("wfsteppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfsteppsdefname__eq(String value){
        this.setFieldCond("wfsteppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfsteppsdefname__like(String value){
        this.setFieldCond("wfsteppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程版本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfverpsdefid__eq(String value){
        this.setFieldCond("wfverpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程版本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfverpsdefname__eq(String value){
        this.setFieldCond("wfverpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程版本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfverpsdefname__like(String value){
        this.setFieldCond("wfverpsdefname", Conditions.LIKE, value);
        return this;
    }

}
