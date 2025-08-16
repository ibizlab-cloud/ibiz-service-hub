package net.ibizsys.runtime.dataentity.action;

/**
 * 实体行为逻辑类型
 * @author lionlau
 *
 */
public class DEActionLogicTypes {

	/**
     *  内部逻辑
     */
    public final static int INTERNAL = 1;

     /**
     *  外部逻辑
     */
    public final static int EXTERNAL = 0;

    /**
     *  脚本代码
     */
    public final static int SCRIPT = 2;

   
    /**
     *  实体通知
     */
    public final static int NOTIFY = 3;
    
    
    /**
     *  填充实体主状态
     */
    public final static int FILLMAINSTATE = 4;


    /**
     *  实体数据同步
     */
    public final static int DATASYNC = 5;


    /**
     *  目标数据操作（指定主关系）
     */
    public final static int DSTDATAACTION = 6;

   
    /**
     *  目标数据操作（指定数据集）
     */
    public final static int DSTDATAACTION2 = 7;

    /**
     *  系统预置逻辑
     */
    public final static int SYSLOGIC = 8;

    /**
     *  属性值转换
     */
    public final static int SYSTRANSLATOR = 9;

     /**
     *  属性值序列填充
     */
    public final static int SYSSEQUENCE = 10;
    
    /**
     *  目标实体逻辑
     */
    public final static int DSTDELOGIC = 11;
    
    

   /**
     *  检查属性值规则
     */
    public final static int CHECKDEFVALUERULE = 50;

   /**
     *  检查数据主状态（处于）
     */
    public final static int CHECKMAINSTATE = 51;

    /**
     *  检查数据主状态（不处于）
     */
    public final static int CHECKNOTMAINSTATE = 52;

     /**
     *  检查目标数据存在（指定主关系）
     */
    public final static int CHECKDSTDATAEXISTS = 53;

    /**
     *  检查目标数据不存在（指定主关系）
     */
    public final static int CHECKDSTDATANOTEXISTS = 54;

    /**
     *  检查目标数据存在（指定数据集）
     */
    public final static int CHECKDSTDATAEXISTS2 = 55;

    /**
     *  检查目标数据不存在（指定数据集）
     */
    public final static int CHECKDSTDATANOTEXISTS2 = 56;

}
