package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFLINK 过滤器对象
 */
public class PSWFLinkFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFLinkFilter(){
    
    }      

    /**
     * 设置属性[操作代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter actionpscodelistid__eq(String value){
        this.setFieldCond("actionpscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter actionpscodelistname__eq(String value){
        this.setFieldCond("actionpscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter actionpscodelistname__like(String value){
        this.setFieldCond("actionpscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[起始处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter frompswfprocid__eq(String value){
        this.setFieldCond("frompswfprocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[起始处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter frompswfprocname__eq(String value){
        this.setFieldCond("frompswfprocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[起始处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter frompswfprocname__like(String value){
        this.setFieldCond("frompswfprocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter lnpslanresid__eq(String value){
        this.setFieldCond("lnpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter lnpslanresname__eq(String value){
        this.setFieldCond("lnpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter lnpslanresname__like(String value){
        this.setFieldCond("lnpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端操作表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter mobpsdeformid__eq(String value){
        this.setFieldCond("mobpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter mobpsdeformname__eq(String value){
        this.setFieldCond("mobpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter mobpsdeformname__like(String value){
        this.setFieldCond("mobpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter mobpsdeviewid__eq(String value){
        this.setFieldCond("mobpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter mobpsdeviewname__eq(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter mobpsdeviewname__like(String value){
        this.setFieldCond("mobpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[连接名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswflinkname__like(String value){
        this.setFieldCond("pswflinkname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加工作流角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswfroleid__eq(String value){
        this.setFieldCond("pswfroleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加工作流角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswfrolename__eq(String value){
        this.setFieldCond("pswfrolename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加工作流角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswfrolename__like(String value){
        this.setFieldCond("pswfrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter topswfprocid__eq(String value){
        this.setFieldCond("topswfprocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter topswfprocname__eq(String value){
        this.setFieldCond("topswfprocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter topswfprocname__like(String value){
        this.setFieldCond("topswfprocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkFilter wflinktype__eq(String value){
        this.setFieldCond("wflinktype", Conditions.EQ, value);
        return this;
    }

}
