package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFDE 过滤器对象
 */
public class PSWFDEFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWFDEFilter(){
    
    }      

    /**
     * 设置属性[移动端默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionmobpsdeviewid__eq(String value){
        this.setFieldCond("actionmobpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionmobpsdeviewname__eq(String value){
        this.setFieldCond("actionmobpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionmobpsdeviewname__like(String value){
        this.setFieldCond("actionmobpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionpsdeviewid__eq(String value){
        this.setFieldCond("actionpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionpsdeviewname__eq(String value){
        this.setFieldCond("actionpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter actionpsdeviewname__like(String value){
        this.setFieldCond("actionpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter finishpsdeactionid__eq(String value){
        this.setFieldCond("finishpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter finishpsdeactionname__eq(String value){
        this.setFieldCond("finishpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter finishpsdeactionname__like(String value){
        this.setFieldCond("finishpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter initpsdeactionid__eq(String value){
        this.setFieldCond("initpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter initpsdeactionname__eq(String value){
        this.setFieldCond("initpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[初始化实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter initpsdeactionname__like(String value){
        this.setFieldCond("initpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydata2psdeviewid__eq(String value){
        this.setFieldCond("mobproxydata2psdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydata2psdeviewname__eq(String value){
        this.setFieldCond("mobproxydata2psdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据编辑视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydata2psdeviewname__like(String value){
        this.setFieldCond("mobproxydata2psdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydatapsdeviewid__eq(String value){
        this.setFieldCond("mobproxydatapsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydatapsdeviewname__eq(String value){
        this.setFieldCond("mobproxydatapsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端代理数据视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mobproxydatapsdeviewname__like(String value){
        this.setFieldCond("mobproxydatapsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程数据语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfdatapslanresid__eq(String value){
        this.setFieldCond("mywfdatapslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程数据语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfdatapslanresname__eq(String value){
        this.setFieldCond("mywfdatapslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程数据语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfdatapslanresname__like(String value){
        this.setFieldCond("mywfdatapslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程工作语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfworkpslanresid__eq(String value){
        this.setFieldCond("mywfworkpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程工作语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfworkpslanresname__eq(String value){
        this.setFieldCond("mywfworkpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程工作语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter mywfworkpslanresname__like(String value){
        this.setFieldCond("mywfworkpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydata2psdeviewid__eq(String value){
        this.setFieldCond("proxydata2psdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据编辑视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydata2psdeviewname__eq(String value){
        this.setFieldCond("proxydata2psdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据编辑视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydata2psdeviewname__like(String value){
        this.setFieldCond("proxydata2psdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdefid__eq(String value){
        this.setFieldCond("proxydatapsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdefname__eq(String value){
        this.setFieldCond("proxydatapsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdefname__like(String value){
        this.setFieldCond("proxydatapsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdeviewid__eq(String value){
        this.setFieldCond("proxydatapsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdeviewname__eq(String value){
        this.setFieldCond("proxydatapsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理数据视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxydatapsdeviewname__like(String value){
        this.setFieldCond("proxydatapsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理模块属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxymodulepsdefid__eq(String value){
        this.setFieldCond("proxymodulepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理模块属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxymodulepsdefname__eq(String value){
        this.setFieldCond("proxymodulepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理模块属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxymodulepsdefname__like(String value){
        this.setFieldCond("proxymodulepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理流程属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxywfpsdefid__eq(String value){
        this.setFieldCond("proxywfpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理流程属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxywfpsdefname__eq(String value){
        this.setFieldCond("proxywfpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代理流程属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter proxywfpsdefname__like(String value){
        this.setFieldCond("proxywfpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流实体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfdename__eq(String value){
        this.setFieldCond("pswfdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfname__eq(String value){
        this.setFieldCond("pswfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pswfname__like(String value){
        this.setFieldCond("pswfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[父流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pwfinstpsdefid__eq(String value){
        this.setFieldCond("pwfinstpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pwfinstpsdefname__eq(String value){
        this.setFieldCond("pwfinstpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[父流程实例属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter pwfinstpsdefname__like(String value){
        this.setFieldCond("pwfinstpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startmobpsdeviewid__eq(String value){
        this.setFieldCond("startmobpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startmobpsdeviewname__eq(String value){
        this.setFieldCond("startmobpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端默认启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startmobpsdeviewname__like(String value){
        this.setFieldCond("startmobpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startpsdeviewid__eq(String value){
        this.setFieldCond("startpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认启动视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startpsdeviewname__eq(String value){
        this.setFieldCond("startpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认启动视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter startpsdeviewname__like(String value){
        this.setFieldCond("startpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[业务状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[业务状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程操作者属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfactorpsdefid__eq(String value){
        this.setFieldCond("wfactorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程操作者属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfactorpsdefname__eq(String value){
        this.setFieldCond("wfactorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程操作者属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfactorpsdefname__like(String value){
        this.setFieldCond("wfactorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfidpsdefid__eq(String value){
        this.setFieldCond("wfidpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfidpsdefname__eq(String value){
        this.setFieldCond("wfidpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfidpsdefname__like(String value){
        this.setFieldCond("wfidpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfinstpsdefid__eq(String value){
        this.setFieldCond("wfinstpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程实例属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfinstpsdefname__eq(String value){
        this.setFieldCond("wfinstpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程实例属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfinstpsdefname__like(String value){
        this.setFieldCond("wfinstpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程结果属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfretpsdefid__eq(String value){
        this.setFieldCond("wfretpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程结果属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfretpsdefname__eq(String value){
        this.setFieldCond("wfretpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程结果属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfretpsdefname__like(String value){
        this.setFieldCond("wfretpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfstatepsdefid__eq(String value){
        this.setFieldCond("wfstatepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfstatepsdefname__eq(String value){
        this.setFieldCond("wfstatepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfstatepsdefname__like(String value){
        this.setFieldCond("wfstatepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程步骤属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfsteppsdefid__eq(String value){
        this.setFieldCond("wfsteppsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfsteppsdefname__eq(String value){
        this.setFieldCond("wfsteppsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程步骤属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfsteppsdefname__like(String value){
        this.setFieldCond("wfsteppsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程版本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfverpsdefid__eq(String value){
        this.setFieldCond("wfverpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程版本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfverpsdefname__eq(String value){
        this.setFieldCond("wfverpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[流程版本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFDEFilter wfverpsdefname__like(String value){
        this.setFieldCond("wfverpsdefname", LIKE, value);
        return this;
    }

}
