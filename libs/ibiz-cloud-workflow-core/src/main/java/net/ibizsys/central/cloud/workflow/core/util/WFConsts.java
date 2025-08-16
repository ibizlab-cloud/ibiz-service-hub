package net.ibizsys.central.cloud.workflow.core.util;

public class WFConsts {

    /**
     * 上下文参数
     */
    public final static String ACTIVEDATA = "activedata";

    /**
     * 加签用户
     */
    public final static String BEFORESIGN_USER = "srfwfannotator";

    /**
     * 后加签用户
     */
    public final static String AFTERSIGN_USER = "srfwfannotator";

    /**
     * 转办用户
     */
    public final static String REASSIGN_USER = "srfwftransferor";
    
    /**
     * 预置用户
     */
    public final static String PREDEFINED_USER ="srfwfpredefinedusers";
    

    /**
     * 转办用户
     */
    public final static String WFSENDCOPY = "srfwfcc";

    /**
     * 排序属性
     */
    public final static String WFORDER = "srfwforderandreverse";

    /**
     * 审批意见
     */
    public final static String WFMEMO = "srfwfmemo";

    /**
     * 工作流超时
     */
    public final static String WFTIMTOUT = "srfwftimeout";

    /**
     * 工作流实例（回调参数）
     */
    public final static String WFINSTANCE = "srfwfinstance";
    /**
     * 超时属性时间格式
     */
    public final static String WFTIMTOUT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 工作流待办类型
     */
    public final static String TASKTYPE = "srfwf";
    /**
     * 下一步连接条件
     */
    public final static String LINK_NEXTCOND = "nextCondition";
    /**
     * 自定义连接条件
     */
    public final static String LINK_CUSTOMCOND = "customCond";
    /**
     * 业务数据主键属性
     */
    public static final String BUSINESSKEY = "businessKey";
    /**
     * 工作流权限（拒绝访问）
     */
    public static final int ACCESSMODE_DENY = 0;
    /**
     * 工作流权限（只读）
     */
    public static final int ACCESSMODE_READ = 1;
    /**
     * 工作流权限（读写）
     */
    public static final int ACCESSMODE_UPDATE = 3;
    
    

    public static final String  TPS_WFTASK = "WFTASK";

    public static final String  TPS_SENDCOPY = "WFCC";

    public static final String  WF_TAG = "WFTAG";

    public static final String  TASK_COMPLETE = "TASKCOMPLETE";

    public static final String  TASK_JUMP = "TASKJUMP";
    /**
     * 工作流预定义用户（用于流程跳转）
     */
    public static final String  WFSTEP_PREDEFINED_USER = "srfwfpredefinedusers";
    /**
     * 动态实例的标准实例标记
     */
    public static final String  DYNAINST_STD_TAG = "__srfstdinst__";
    /**
     * 动态实例的副本实例标记
     */
    public static final String  DYNAINST_TAG = "dynainsttag";
    /**
     * 动态实例的副本实例标记2
     */
    public static final String  DYNAINST_TAG2 ="dynainsttag2";
    /**
     * 工作流待办模式（简易模式）
     */
    public static final String TASK_MODE_SIMPLE = "2";
    
    /**
     * 流程操作角色预定义前缀（多实例步骤单实例模式，按部门生成实例任务）
     */
    public static final String PROCESSROLE_SINGTON_PREFIX = "PRE_";
    /**
     * 流程操作角色标记（多实例步骤单实例模式，按部门生成实例任务）
     */
    public static  final String PROCESSROLE_SINGTON_TAG = "_sington";

    public static final String WFGROUP = "wfCoreService.getGroupUsers";
    /**
     * 处理意见字段
     */
    public static final String WFMEMOFIELD = "memofield";
    
    /**
     * 预置流程辅助功能类型
     */
    public final static String PROCFUNCTYPE = "srfwfprocfunctype";
}
