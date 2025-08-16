package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSMODELRTCFG 过滤器对象
 */
public class PSModelRTCfgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSModelRTCfgFilter(){
    
    }      

    /**
     * 设置属性[模型运行配置名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModelRTCfgFilter psmodelrtcfgname__like(String value){
        this.setFieldCond("psmodelrtcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模型运行类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModelRTCfgFilter rttype__eq(String value){
        this.setFieldCond("rttype", Conditions.EQ, value);
        return this;
    }

}
