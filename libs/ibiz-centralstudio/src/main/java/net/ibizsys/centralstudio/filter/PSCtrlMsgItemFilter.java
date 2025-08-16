package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCTRLMSGITEM 过滤器对象
 */
public class PSCtrlMsgItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSCtrlMsgItemFilter(){
    
    }      

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter psctrlmsgitemname__like(String value){
        this.setFieldCond("psctrlmsgitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCtrlMsgItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
