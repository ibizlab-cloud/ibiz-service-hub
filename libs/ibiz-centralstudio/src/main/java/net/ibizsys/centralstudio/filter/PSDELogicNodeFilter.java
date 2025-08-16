package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELOGICNODE 过滤器对象
 */
public class PSDELogicNodeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDELogicNodeFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstparamaction__eq(String value){
        this.setFieldCond("dstparamaction", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeactionid__eq(String value){
        this.setFieldCond("dstpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeactionname__eq(String value){
        this.setFieldCond("dstpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeactionname__like(String value){
        this.setFieldCond("dstpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataexpid__eq(String value){
        this.setFieldCond("dstpsdedataexpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据导出]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataexpname__eq(String value){
        this.setFieldCond("dstpsdedataexpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据导出]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataexpname__like(String value){
        this.setFieldCond("dstpsdedataexpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataimpid__eq(String value){
        this.setFieldCond("dstpsdedataimpid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据导入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataimpname__eq(String value){
        this.setFieldCond("dstpsdedataimpname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据导入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataimpname__like(String value){
        this.setFieldCond("dstpsdedataimpname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataqueryid__eq(String value){
        this.setFieldCond("dstpsdedataqueryid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataqueryname__eq(String value){
        this.setFieldCond("dstpsdedataqueryname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedataqueryname__like(String value){
        this.setFieldCond("dstpsdedataqueryname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedatasetid__eq(String value){
        this.setFieldCond("dstpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedatasetname__eq(String value){
        this.setFieldCond("dstpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedatasetname__like(String value){
        this.setFieldCond("dstpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标实体数据同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedatasyncid__eq(String value){
        this.setFieldCond("dstpsdedatasyncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体数据同步]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedatasyncname__eq(String value){
        this.setFieldCond("dstpsdedatasyncname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体数据同步]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedatasyncname__like(String value){
        this.setFieldCond("dstpsdedatasyncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体分布式处理队列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedtsqueueid__eq(String value){
        this.setFieldCond("dstpsdedtsqueueid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体异步处理队列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedtsqueuename__eq(String value){
        this.setFieldCond("dstpsdedtsqueuename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体异步处理队列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdedtsqueuename__like(String value){
        this.setFieldCond("dstpsdedtsqueuename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdefvalueruleid__eq(String value){
        this.setFieldCond("dstpsdefvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdefvaluerulename__eq(String value){
        this.setFieldCond("dstpsdefvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdefvaluerulename__like(String value){
        this.setFieldCond("dstpsdefvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeid__eq(String value){
        this.setFieldCond("dstpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdelogicid__eq(String value){
        this.setFieldCond("dstpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdelogicname__eq(String value){
        this.setFieldCond("dstpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdelogicname__like(String value){
        this.setFieldCond("dstpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdemapid__eq(String value){
        this.setFieldCond("dstpsdemapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdemapname__eq(String value){
        this.setFieldCond("dstpsdemapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体映射]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdemapname__like(String value){
        this.setFieldCond("dstpsdemapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdename__eq(String value){
        this.setFieldCond("dstpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdename__like(String value){
        this.setFieldCond("dstpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdenotifyid__eq(String value){
        this.setFieldCond("dstpsdenotifyid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体通知]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdenotifyname__eq(String value){
        this.setFieldCond("dstpsdenotifyname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标实体通知]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdenotifyname__like(String value){
        this.setFieldCond("dstpsdenotifyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeprintid__eq(String value){
        this.setFieldCond("dstpsdeprintid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeprintname__eq(String value){
        this.setFieldCond("dstpsdeprintname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdeprintname__like(String value){
        this.setFieldCond("dstpsdeprintname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdereportid__eq(String value){
        this.setFieldCond("dstpsdereportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdereportname__eq(String value){
        this.setFieldCond("dstpsdereportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdereportname__like(String value){
        this.setFieldCond("dstpsdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdevrgroupid__eq(String value){
        this.setFieldCond("dstpsdevrgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标规则组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdevrgroupname__eq(String value){
        this.setFieldCond("dstpsdevrgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标规则组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdevrgroupname__like(String value){
        this.setFieldCond("dstpsdevrgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdlparamid__eq(String value){
        this.setFieldCond("dstpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdlparamname__eq(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstpsdlparamname__like(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标属性排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter dstsortdir__eq(String value){
        this.setFieldCond("dstsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入流参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter ispsdlparamid__eq(String value){
        this.setFieldCond("ispsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入流参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter ispsdlparamname__eq(String value){
        this.setFieldCond("ispsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入流参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter ispsdlparamname__like(String value){
        this.setFieldCond("ispsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑节点类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter logicnodetype__eq(String value){
        this.setFieldCond("logicnodetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter msgpslanresid__eq(String value){
        this.setFieldCond("msgpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter msgpslanresname__eq(String value){
        this.setFieldCond("msgpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter msgpslanresname__like(String value){
        this.setFieldCond("msgpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出流参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter ospsdlparamid__eq(String value){
        this.setFieldCond("ospsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出流参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter ospsdlparamname__eq(String value){
        this.setFieldCond("ospsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出流参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter ospsdlparamname__like(String value){
        this.setFieldCond("ospsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdelogicnodename__eq(String value){
        this.setFieldCond("psdelogicnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[处理名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdelogicnodename__like(String value){
        this.setFieldCond("psdelogicnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssubsyssadetailid__eq(String value){
        this.setFieldCond("pssubsyssadetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssubsyssadetailname__eq(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口方法]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台作业]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbackserviceid__eq(String value){
        this.setFieldCond("pssysbackserviceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台作业]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbackservicename__eq(String value){
        this.setFieldCond("pssysbackservicename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台作业]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbackservicename__like(String value){
        this.setFieldCond("pssysbackservicename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbireportid__eq(String value){
        this.setFieldCond("pssysbireportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbireportname__eq(String value){
        this.setFieldCond("pssysbireportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbireportname__like(String value){
        this.setFieldCond("pssysbireportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据同步代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdatasyncagentid__eq(String value){
        this.setFieldCond("pssysdatasyncagentid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据同步代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdatasyncagentname__eq(String value){
        this.setFieldCond("pssysdatasyncagentname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据同步代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdatasyncagentname__like(String value){
        this.setFieldCond("pssysdatasyncagentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdbtableid__eq(String value){
        this.setFieldCond("pssysdbtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统逻辑处理节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdelogicnodeid__eq(String value){
        this.setFieldCond("pssysdelogicnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdelogicnodename__eq(String value){
        this.setFieldCond("pssysdelogicnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysdelogicnodename__like(String value){
        this.setFieldCond("pssysdelogicnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyseaielementid__eq(String value){
        this.setFieldCond("pssyseaielementid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成元素]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyseaielementname__eq(String value){
        this.setFieldCond("pssyseaielementname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成元素]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyseaielementname__like(String value){
        this.setFieldCond("pssyseaielementname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyseaischemeid__eq(String value){
        this.setFieldCond("pssyseaischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyseaischemename__eq(String value){
        this.setFieldCond("pssyseaischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyseaischemename__like(String value){
        this.setFieldCond("pssyseaischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssearchdocid__eq(String value){
        this.setFieldCond("pssyssearchdocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssearchdocname__eq(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssearchschemeid__eq(String value){
        this.setFieldCond("pssyssearchschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssearchschemename__eq(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssearchschemename__like(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统数据库命令]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssqlcmdid__eq(String value){
        this.setFieldCond("pssyssqlcmdid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据库命令]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssqlcmdname__eq(String value){
        this.setFieldCond("pssyssqlcmdname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据库命令]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssyssqlcmdname__like(String value){
        this.setFieldCond("pssyssqlcmdname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysunistateid__eq(String value){
        this.setFieldCond("pssysunistateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysunistatename__eq(String value){
        this.setFieldCond("pssysunistatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysunistatename__like(String value){
        this.setFieldCond("pssysunistatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysutildeid__eq(String value){
        this.setFieldCond("pssysutildeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysutildename__eq(String value){
        this.setFieldCond("pssysutildename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pssysutildename__like(String value){
        this.setFieldCond("pssysutildename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pswfdeid__eq(String value){
        this.setFieldCond("pswfdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pswfdename__eq(String value){
        this.setFieldCond("pswfdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psworkflowname__eq(String value){
        this.setFieldCond("psworkflowname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[返回绑定参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter retpsdlparamid__eq(String value){
        this.setFieldCond("retpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回绑定参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter retpsdlparamname__eq(String value){
        this.setFieldCond("retpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[返回绑定参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter retpsdlparamname__like(String value){
        this.setFieldCond("retpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter srcpsdlparamid__eq(String value){
        this.setFieldCond("srcpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter srcpsdlparamname__eq(String value){
        this.setFieldCond("srcpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter srcpsdlparamname__like(String value){
        this.setFieldCond("srcpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELogicNodeFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
