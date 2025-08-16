package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFPROCESS 过滤器对象
 */
public class PSWFProcessFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFProcessFilter(){
    
    }      

    /**
     * 设置属性[编辑相关属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter editpsdefgroupid__eq(String value){
        this.setFieldCond("editpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑相关属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter editpsdefgroupname__eq(String value){
        this.setFieldCond("editpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑相关属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter editpsdefgroupname__like(String value){
        this.setFieldCond("editpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[嵌套实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpsdedsid__eq(String value){
        this.setFieldCond("embedpsdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpsdedsname__eq(String value){
        this.setFieldCond("embedpsdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpsdedsname__like(String value){
        this.setFieldCond("embedpsdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpswfdeid__eq(String value){
        this.setFieldCond("embedpswfdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpswfdename__eq(String value){
        this.setFieldCond("embedpswfdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[嵌套工作流实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpswfdename__like(String value){
        this.setFieldCond("embedpswfdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[嵌套流程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpswfid__eq(String value){
        this.setFieldCond("embedpswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[调用工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpswfname__eq(String value){
        this.setFieldCond("embedpswfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[调用工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter embedpswfname__like(String value){
        this.setFieldCond("embedpswfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端流程表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeformid__eq(String value){
        this.setFieldCond("mobpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端流程表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeformname__eq(String value){
        this.setFieldCond("mobpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端流程表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeformname__like(String value){
        this.setFieldCond("mobpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端附加界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeuagroupid__eq(String value){
        this.setFieldCond("mobpsdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端附加界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeuagroupname__eq(String value){
        this.setFieldCond("mobpsdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端附加界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeuagroupname__like(String value){
        this.setFieldCond("mobpsdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeviewid__eq(String value){
        this.setFieldCond("mobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeviewname__eq(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobpsdeviewname__like(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端后加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil2psdeformid__eq(String value){
        this.setFieldCond("mobutil2psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端后加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil2psdeformname__eq(String value){
        this.setFieldCond("mobutil2psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端后加签表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil2psdeformname__like(String value){
        this.setFieldCond("mobutil2psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端转办表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil3psdeformid__eq(String value){
        this.setFieldCond("mobutil3psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端转办表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil3psdeformname__eq(String value){
        this.setFieldCond("mobutil3psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端转办表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil3psdeformname__like(String value){
        this.setFieldCond("mobutil3psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil4psdeformid__eq(String value){
        this.setFieldCond("mobutil4psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil4psdeformname__eq(String value){
        this.setFieldCond("mobutil4psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil4psdeformname__like(String value){
        this.setFieldCond("mobutil4psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil5psdeformid__eq(String value){
        this.setFieldCond("mobutil5psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil5psdeformname__eq(String value){
        this.setFieldCond("mobutil5psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端功能表单5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutil5psdeformname__like(String value){
        this.setFieldCond("mobutil5psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端前加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutilpsdeformid__eq(String value){
        this.setFieldCond("mobutilpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端前加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutilpsdeformname__eq(String value){
        this.setFieldCond("mobutilpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端前加签表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobutilpsdeformname__like(String value){
        this.setFieldCond("mobutilpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端流程编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter mobwfeditviewtype__eq(String value){
        this.setFieldCond("mobwfeditviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多实例模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter multiinstmode__eq(String value){
        this.setFieldCond("multiinstmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[常规处理类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter normalproctype__eq(String value){
        this.setFieldCond("normalproctype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[发送消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[发送消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[发送消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfdeid__eq(String value){
        this.setFieldCond("pswfdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfdename__eq(String value){
        this.setFieldCond("pswfdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfid__eq(String value){
        this.setFieldCond("pswfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfprocessname__like(String value){
        this.setFieldCond("pswfprocessname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作时间]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfworktimeid__eq(String value){
        this.setFieldCond("pswfworktimeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作时间]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfworktimename__eq(String value){
        this.setFieldCond("pswfworktimename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作时间]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter pswfworktimename__like(String value){
        this.setFieldCond("pswfworktimename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter refpswfversionid__eq(String value){
        this.setFieldCond("refpswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter refpswfversionname__eq(String value){
        this.setFieldCond("refpswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter refpswfversionname__like(String value){
        this.setFieldCond("refpswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态超时属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter timeoutpsdefid__eq(String value){
        this.setFieldCond("timeoutpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态超时属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter timeoutpsdefname__eq(String value){
        this.setFieldCond("timeoutpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态超时属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter timeoutpsdefname__like(String value){
        this.setFieldCond("timeoutpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[超时类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter timeouttype__eq(String value){
        this.setFieldCond("timeouttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util2psdeformid__eq(String value){
        this.setFieldCond("util2psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util2psdeformname__eq(String value){
        this.setFieldCond("util2psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后加签表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util2psdeformname__like(String value){
        this.setFieldCond("util2psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[转办表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util3psdeformid__eq(String value){
        this.setFieldCond("util3psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[转办表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util3psdeformname__eq(String value){
        this.setFieldCond("util3psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[转办表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util3psdeformname__like(String value){
        this.setFieldCond("util3psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能表单4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util4psdeformid__eq(String value){
        this.setFieldCond("util4psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util4psdeformname__eq(String value){
        this.setFieldCond("util4psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util4psdeformname__like(String value){
        this.setFieldCond("util4psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能表单5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util5psdeformid__eq(String value){
        this.setFieldCond("util5psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util5psdeformname__eq(String value){
        this.setFieldCond("util5psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能表单5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter util5psdeformname__like(String value){
        this.setFieldCond("util5psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter utilpsdeformid__eq(String value){
        this.setFieldCond("utilpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前加签表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter utilpsdeformname__eq(String value){
        this.setFieldCond("utilpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前加签表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter utilpsdeformname__like(String value){
        this.setFieldCond("utilpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程编辑视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter wfeditviewtype__eq(String value){
        this.setFieldCond("wfeditviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcessFilter wfprocesstype__eq(String value){
        this.setFieldCond("wfprocesstype", Conditions.EQ, value);
        return this;
    }

}
