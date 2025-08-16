package net.ibizsys.centralstudio.util;

/**
 * 模型枚举集合
 */
public class CentralEnums {

    /**
     * 镜像仓库类型
     * <P>
     * <ul>
     * <li>REGISTRY
     * <P>
     * REGISTRY
     * </ul>     
     */
    public static enum RepoType{
        REGISTRY("REGISTRY", "REGISTRY")
;
           
        public final String text;
        public final String value;
        
        private RepoType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static RepoType from(String value){
            switch(value){
                case "REGISTRY":
                    return REGISTRY;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 平台微服务平台功能组件
     * <P>
     * <ul>
     * <li>SERVICECENTER
     * <P>
     * 服务注册中心
     * <li>SERVICEGATEWAY
     * <P>
     * 服务网关
     * <li>CONFIGCENTER
     * <P>
     * 配置中心
     * <li>CACHECENTER
     * <P>
     * 缓存中心
     * <li>STATECENTER
     * <P>
     * 状态中心
     * <li>MESSAGEBUS
     * <P>
     * 消息总线
     * <li>LOGCENTER
     * <P>
     * 日志聚合
     * <li>CLOUDUAAUTIL
     * <P>
     * Cloud认证组件（UAA）
     * <li>CLOUDWFUTIL
     * <P>
     * Cloud工作流组件（WF）
     * <li>CLOUDTASKUTIL
     * <P>
     * Cloud任务组件（Task）
     * <li>CLOUDOUUTIL
     * <P>
     * Cloud组织单元组件（OU）
     * <li>CLOUDOSSUTIL
     * <P>
     * Cloud对象存储组件（OSS）
     * <li>CLOUDOPENUTIL
     * <P>
     * Cloud开放平台组件（Open）
     * <li>CLOUDNOTIFYUTIL
     * <P>
     * Cloud通知组件（Notify）
     * <li>CLOUDLOGUTIL
     * <P>
     * Cloud日志组件（Log）
     * <li>CLOUDDEVOPSUTIL
     * <P>
     * Cloud开发运行组件（DevOps）
     * <li>CLOUDCONFUTIL
     * <P>
     * Cloud配置组件（Conf）
     * <li>CLOUDCONFITEM
     * <P>
     * Cloud直接配置项
     * <li>USER
     * <P>
     * 用户自定义
     * <li>USER2
     * <P>
     * 用户自定义2
     * <li>USER3
     * <P>
     * 用户自定义3
     * <li>USER4
     * <P>
     * 用户自定义4
     * </ul>     
     */
    public static enum MSPlatformFuncType{
        SERVICECENTER("SERVICECENTER", "服务注册中心")
        ,SERVICEGATEWAY("SERVICEGATEWAY", "服务网关")
        ,CONFIGCENTER("CONFIGCENTER", "配置中心")
        ,CACHECENTER("CACHECENTER", "缓存中心")
        ,STATECENTER("STATECENTER", "状态中心")
        ,MESSAGEBUS("MESSAGEBUS", "消息总线")
        ,LOGCENTER("LOGCENTER", "日志聚合")
        ,CLOUDUAAUTIL("CLOUDUAAUTIL", "Cloud认证组件（UAA）")
        ,CLOUDWFUTIL("CLOUDWFUTIL", "Cloud工作流组件（WF）")
        ,CLOUDTASKUTIL("CLOUDTASKUTIL", "Cloud任务组件（Task）")
        ,CLOUDOUUTIL("CLOUDOUUTIL", "Cloud组织单元组件（OU）")
        ,CLOUDOSSUTIL("CLOUDOSSUTIL", "Cloud对象存储组件（OSS）")
        ,CLOUDOPENUTIL("CLOUDOPENUTIL", "Cloud开放平台组件（Open）")
        ,CLOUDNOTIFYUTIL("CLOUDNOTIFYUTIL", "Cloud通知组件（Notify）")
        ,CLOUDLOGUTIL("CLOUDLOGUTIL", "Cloud日志组件（Log）")
        ,CLOUDDEVOPSUTIL("CLOUDDEVOPSUTIL", "Cloud开发运行组件（DevOps）")
        ,CLOUDCONFUTIL("CLOUDCONFUTIL", "Cloud配置组件（Conf）")
        ,CLOUDCONFITEM("CLOUDCONFITEM", "Cloud直接配置项")
        ,USER("USER", "用户自定义")
        ,USER2("USER2", "用户自定义2")
        ,USER3("USER3", "用户自定义3")
        ,USER4("USER4", "用户自定义4")
;
           
        public final String text;
        public final String value;
        
        private MSPlatformFuncType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static MSPlatformFuncType from(String value){
            switch(value){
                case "SERVICECENTER":
                    return SERVICECENTER;
                case "SERVICEGATEWAY":
                    return SERVICEGATEWAY;
                case "CONFIGCENTER":
                    return CONFIGCENTER;
                case "CACHECENTER":
                    return CACHECENTER;
                case "STATECENTER":
                    return STATECENTER;
                case "MESSAGEBUS":
                    return MESSAGEBUS;
                case "LOGCENTER":
                    return LOGCENTER;
                case "CLOUDUAAUTIL":
                    return CLOUDUAAUTIL;
                case "CLOUDWFUTIL":
                    return CLOUDWFUTIL;
                case "CLOUDTASKUTIL":
                    return CLOUDTASKUTIL;
                case "CLOUDOUUTIL":
                    return CLOUDOUUTIL;
                case "CLOUDOSSUTIL":
                    return CLOUDOSSUTIL;
                case "CLOUDOPENUTIL":
                    return CLOUDOPENUTIL;
                case "CLOUDNOTIFYUTIL":
                    return CLOUDNOTIFYUTIL;
                case "CLOUDLOGUTIL":
                    return CLOUDLOGUTIL;
                case "CLOUDDEVOPSUTIL":
                    return CLOUDDEVOPSUTIL;
                case "CLOUDCONFUTIL":
                    return CLOUDCONFUTIL;
                case "CLOUDCONFITEM":
                    return CLOUDCONFITEM;
                case "USER":
                    return USER;
                case "USER2":
                    return USER2;
                case "USER3":
                    return USER3;
                case "USER4":
                    return USER4;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 资源类型
     * <P>
     * <ul>
     * <li>PSDCMSPLATFORMNODE
     * <P>
     * Cloud平台服务
     * </ul>     
     */
    public static enum ResourceType{
        PSDCMSPLATFORMNODE("PSDCMSPLATFORMNODE", "Cloud平台服务")
;
           
        public final String text;
        public final String value;
        
        private ResourceType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static ResourceType from(String value){
            switch(value){
                case "PSDCMSPLATFORMNODE":
                    return PSDCMSPLATFORMNODE;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 镜像项类型2
     * <P>
     * <ul>
     * <li>PSMODELTOOL&nbsp;(psmodeltool)
     * <P>
     * 系统作业项
     * <li>CODEGEN&nbsp;(codegen)
     * <P>
     * 代码发布
     * </ul>     
     */
    public static enum RegistryItemType2{
        PSMODELTOOL("psmodeltool", "系统作业项")
        ,CODEGEN("codegen", "代码发布")
;
           
        public final String text;
        public final String value;
        
        private RegistryItemType2(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static RegistryItemType2 from(String value){
            switch(value){
                case "psmodeltool":
                    return PSMODELTOOL;
                case "codegen":
                    return CODEGEN;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发系统备份模式
     * <P>
     * <ul>
     * <li>DEFAULT
     * <P>
     * 默认
     * <li>V2
     * <P>
     * 版本2
     * </ul>     
     */
    public static enum DevSlnSysBKMode{
        DEFAULT("DEFAULT", "默认")
        ,V2("V2", "版本2")
;
           
        public final String text;
        public final String value;
        
        private DevSlnSysBKMode(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSlnSysBKMode from(String value){
            switch(value){
                case "DEFAULT":
                    return DEFAULT;
                case "V2":
                    return V2;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云应用方案访问能力（带所有者），数值项
     * <P>
     * <ul>
     * <li>READ&nbsp;(1)
     * <P>
     * 读
     * <li>READWRITE&nbsp;(3)
     * <P>
     * 读写
     * <li>ITEM_19&nbsp;(19)
     * <P>
     * 所有者
     * </ul>     
     */
    public static enum SlnSysAccMode2{
        READ(1, "读")
        ,READWRITE(3, "读写")
        ,ITEM_19(19, "所有者")
;
           
        public final String text;
        public final int value;
        
        private SlnSysAccMode2(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static SlnSysAccMode2 from(int value){
            switch(value){
                case 1:
                    return READ;
                case 3:
                    return READWRITE;
                case 19:
                    return ITEM_19;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 部署系统类型
     * <P>
     * <ul>
     * <li>ORGWFSYS
     * <P>
     * 机构流程运行系统
     * <li>ORGSECTORWFSYS
     * <P>
     * 部门流程运行系统
     * <li>USER
     * <P>
     * 用户自定义
     * <li>USER2
     * <P>
     * 用户自定义2
     * </ul>     
     */
    public static enum DeploySysType{
        ORGWFSYS("ORGWFSYS", "机构流程运行系统")
        ,ORGSECTORWFSYS("ORGSECTORWFSYS", "部门流程运行系统")
        ,USER("USER", "用户自定义")
        ,USER2("USER2", "用户自定义2")
;
           
        public final String text;
        public final String value;
        
        private DeploySysType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DeploySysType from(String value){
            switch(value){
                case "ORGWFSYS":
                    return ORGWFSYS;
                case "ORGSECTORWFSYS":
                    return ORGSECTORWFSYS;
                case "USER":
                    return USER;
                case "USER2":
                    return USER2;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统应用类型
     * <P>
     * <ul>
     * <li>WEBAPP_HTML5
     * <P>
     * 网页应用（HTML5）
     * <li>MOBILEAPP_HTML5
     * <P>
     * 移动应用（HTML5）
     * <li>IOSAPP
     * <P>
     * iOS原生应用
     * <li>ANDROIDAPP
     * <P>
     * Android原生应用
     * </ul>     
     */
    public static enum SysAppType{
        WEBAPP_HTML5("WEBAPP_HTML5", "网页应用（HTML5）")
        ,MOBILEAPP_HTML5("MOBILEAPP_HTML5", "移动应用（HTML5）")
        ,IOSAPP("IOSAPP", "iOS原生应用")
        ,ANDROIDAPP("ANDROIDAPP", "Android原生应用")
;
           
        public final String text;
        public final String value;
        
        private SysAppType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysAppType from(String value){
            switch(value){
                case "WEBAPP_HTML5":
                    return WEBAPP_HTML5;
                case "MOBILEAPP_HTML5":
                    return MOBILEAPP_HTML5;
                case "IOSAPP":
                    return IOSAPP;
                case "ANDROIDAPP":
                    return ANDROIDAPP;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云应用中心用户对象类型
     * <P>
     * <ul>
     * <li>USER
     * <P>
     * 用户
     * <li>USERGROUP
     * <P>
     * 用户组
     * </ul>     
     */
    public static enum DevUserObjectType{
        USER("USER", "用户")
        ,USERGROUP("USERGROUP", "用户组")
;
           
        public final String text;
        public final String value;
        
        private DevUserObjectType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevUserObjectType from(String value){
            switch(value){
                case "USER":
                    return USER;
                case "USERGROUP":
                    return USERGROUP;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发系统状态，数值项
     * <P>
     * <ul>
     * <li>UNINITIALIZED&nbsp;(10)
     * <P>
     * 未初始化
     * <li>CREATING&nbsp;(20)
     * <P>
     * 创建中
     * <li>RECOVERING&nbsp;(21)
     * <P>
     * 恢复中
     * <li>ONLINE&nbsp;(30)
     * <P>
     * 正常
     * <li>MAINTAIN&nbsp;(31)
     * <P>
     * 运维中
     * <li>OFFLINE&nbsp;(35)
     * <P>
     * 已离线
     * <li>REMOVED&nbsp;(40)
     * <P>
     * 已删除
     * <li>EXPIRED&nbsp;(41)
     * <P>
     * 已超期
     * <li>CREATEFAILED&nbsp;(42)
     * <P>
     * 创建失败
     * </ul>     
     */
    public static enum DevSysState{
        UNINITIALIZED(10, "未初始化")
        ,CREATING(20, "创建中")
        ,RECOVERING(21, "恢复中")
        ,ONLINE(30, "正常")
        ,MAINTAIN(31, "运维中")
        ,OFFLINE(35, "已离线")
        ,REMOVED(40, "已删除")
        ,EXPIRED(41, "已超期")
        ,CREATEFAILED(42, "创建失败")
;
           
        public final String text;
        public final int value;
        
        private DevSysState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSysState from(int value){
            switch(value){
                case 10:
                    return UNINITIALIZED;
                case 20:
                    return CREATING;
                case 21:
                    return RECOVERING;
                case 30:
                    return ONLINE;
                case 31:
                    return MAINTAIN;
                case 35:
                    return OFFLINE;
                case 40:
                    return REMOVED;
                case 41:
                    return EXPIRED;
                case 42:
                    return CREATEFAILED;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 应用中心版本库类型
     * <P>
     * <ul>
     * <li>SVN
     * <P>
     * SVN
     * <li>GIT
     * <P>
     * GIT
     * </ul>     
     */
    public static enum DevCenterSVNType{
        SVN("SVN", "SVN")
        ,GIT("GIT", "GIT")
;
           
        public final String text;
        public final String value;
        
        private DevCenterSVNType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevCenterSVNType from(String value){
            switch(value){
                case "SVN":
                    return SVN;
                case "GIT":
                    return GIT;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 平台微服务平台类型（设计）
     * <P>
     * <ul>
     * <li>IBIZCLOUD
     * <P>
     * iBizCloud
     * </ul>     
     */
    public static enum MSPlatformType2{
        IBIZCLOUD("IBIZCLOUD", "iBizCloud")
;
           
        public final String text;
        public final String value;
        
        private MSPlatformType2(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static MSPlatformType2 from(String value){
            switch(value){
                case "IBIZCLOUD":
                    return IBIZCLOUD;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 后台作业状态，数值项
     * <P>
     * <ul>
     * <li>NOTCREATED&nbsp;(10)
     * <P>
     * 未开始
     * <li>CREATING&nbsp;(20)
     * <P>
     * 执行中
     * <li>CREATED&nbsp;(30)
     * <P>
     * 已执行
     * <li>FAILED&nbsp;(40)
     * <P>
     * 执行失败
     * </ul>     
     */
    public static enum BackendActionState{
        NOTCREATED(10, "未开始")
        ,CREATING(20, "执行中")
        ,CREATED(30, "已执行")
        ,FAILED(40, "执行失败")
;
           
        public final String text;
        public final int value;
        
        private BackendActionState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static BackendActionState from(int value){
            switch(value){
                case 10:
                    return NOTCREATED;
                case 20:
                    return CREATING;
                case 30:
                    return CREATED;
                case 40:
                    return FAILED;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 资源状态，数值项
     * <P>
     * <ul>
     * <li>UNINIT&nbsp;(10)
     * <P>
     * 未初始化
     * <li>UNSET&nbsp;(11)
     * <P>
     * 未设置
     * <li>VALID&nbsp;(20)
     * <P>
     * 正常
     * <li>INVALID&nbsp;(40)
     * <P>
     * 已失效
     * <li>EXPIRED&nbsp;(41)
     * <P>
     * 已超期
     * <li>UNASSIGNED&nbsp;(42)
     * <P>
     * 分时资源未分配
     * </ul>     
     */
    public static enum DevCenterResState{
        UNINIT(10, "未初始化")
        ,UNSET(11, "未设置")
        ,VALID(20, "正常")
        ,INVALID(40, "已失效")
        ,EXPIRED(41, "已超期")
        ,UNASSIGNED(42, "分时资源未分配")
;
           
        public final String text;
        public final int value;
        
        private DevCenterResState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevCenterResState from(int value){
            switch(value){
                case 10:
                    return UNINIT;
                case 11:
                    return UNSET;
                case 20:
                    return VALID;
                case 40:
                    return INVALID;
                case 41:
                    return EXPIRED;
                case 42:
                    return UNASSIGNED;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发系统引用使用模式
     * <P>
     * <ul>
     * <li>LIB
     * <P>
     * 组件
     * <li>CLOUD
     * <P>
     * 云服务
     * <li>USER
     * <P>
     * 用户自定义
     * <li>USER2
     * <P>
     * 用户自定义2
     * <li>ETLSOURCE
     * <P>
     * ETL数据源
     * <li>ETLMODEL
     * <P>
     * ETL模型
     * </ul>     
     */
    public static enum DevSysRefUsage{
        LIB("LIB", "组件")
        ,CLOUD("CLOUD", "云服务")
        ,USER("USER", "用户自定义")
        ,USER2("USER2", "用户自定义2")
        ,ETLSOURCE("ETLSOURCE", "ETL数据源")
        ,ETLMODEL("ETLMODEL", "ETL模型")
;
           
        public final String text;
        public final String value;
        
        private DevSysRefUsage(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSysRefUsage from(String value){
            switch(value){
                case "LIB":
                    return LIB;
                case "CLOUD":
                    return CLOUD;
                case "USER":
                    return USER;
                case "USER2":
                    return USER2;
                case "ETLSOURCE":
                    return ETLSOURCE;
                case "ETLMODEL":
                    return ETLMODEL;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统运行会话重构模式，数值项
     * <P>
     * <ul>
     * <li>NONE&nbsp;(0)
     * <P>
     * 无操作
     * <li>FIXMODEL&nbsp;(4)
     * <P>
     * 模型修复
     * <li>QUICK&nbsp;(1)
     * <P>
     * 快速（删除本地项目与代码仓库多余文件）
     * <li>FULL&nbsp;(2)
     * <P>
     * 完整（完全重建本地项目及代码仓库）
     * </ul>     
     */
    public static enum SysRunRebuildMode{
        NONE(0, "无操作")
        ,FIXMODEL(4, "模型修复")
        ,QUICK(1, "快速（删除本地项目与代码仓库多余文件）")
        ,FULL(2, "完整（完全重建本地项目及代码仓库）")
;
           
        public final String text;
        public final int value;
        
        private SysRunRebuildMode(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysRunRebuildMode from(int value){
            switch(value){
                case 0:
                    return NONE;
                case 4:
                    return FIXMODEL;
                case 1:
                    return QUICK;
                case 2:
                    return FULL;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 是否（蓝、红）（是否启用：是），数值项
     * <P>
     * <ul>
     * <li>ITEM_1&nbsp;(1)
     * <P>
     * 是
     * <li>ITEM_0&nbsp;(0)
     * <P>
     * 否
     * </ul>     
     */
    public static enum YesNoColor3{
        ITEM_1(1, "是")
        ,ITEM_0(0, "否")
;
           
        public final String text;
        public final int value;
        
        private YesNoColor3(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static YesNoColor3 from(int value){
            switch(value){
                case 1:
                    return ITEM_1;
                case 0:
                    return ITEM_0;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统运行用户代码模式，数值项
     * <P>
     * <ul>
     * <li>ITEM_0&nbsp;(0)
     * <P>
     * 不联合
     * <li>ITEM_1&nbsp;(1)
     * <P>
     * 仅联合应用代码
     * <li>ITEM_2&nbsp;(2)
     * <P>
     * 仅联合服务代码
     * <li>ITEM_255&nbsp;(255)
     * <P>
     * 全部联合
     * </ul>     
     */
    public static enum SysRunUserCodeMode{
        ITEM_0(0, "不联合")
        ,ITEM_1(1, "仅联合应用代码")
        ,ITEM_2(2, "仅联合服务代码")
        ,ITEM_255(255, "全部联合")
;
           
        public final String text;
        public final int value;
        
        private SysRunUserCodeMode(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysRunUserCodeMode from(int value){
            switch(value){
                case 0:
                    return ITEM_0;
                case 1:
                    return ITEM_1;
                case 2:
                    return ITEM_2;
                case 255:
                    return ITEM_255;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统运行会话状态，数值项
     * <P>
     * <ul>
     * <li>ITEM_10&nbsp;(10)
     * <P>
     * 未启动
     * <li>ITEM_20&nbsp;(20)
     * <P>
     * 正在运行
     * <li>ITEM_30&nbsp;(30)
     * <P>
     * 已终止
     * </ul>     
     */
    public static enum SysRunSessionState{
        ITEM_10(10, "未启动")
        ,ITEM_20(20, "正在运行")
        ,ITEM_30(30, "已终止")
;
           
        public final String text;
        public final int value;
        
        private SysRunSessionState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysRunSessionState from(int value){
            switch(value){
                case 10:
                    return ITEM_10;
                case 20:
                    return ITEM_20;
                case 30:
                    return ITEM_30;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * GIT仓库
     * <P>
     * <ul>
     * <li>OSCHINA&nbsp;(https://git.oschina.net/)
     * <P>
     * https://git.oschina.net/
     * <li>GITHUB&nbsp;(https://github.com/)
     * <P>
     * https://github.com/
     * <li>IBIZ
     * <P>
     * iBiz仓库
     * <li>GITEE
     * <P>
     * https://gitee.com/
     * </ul>     
     */
    public static enum GitRepoType{
        OSCHINA("https://git.oschina.net/", "https://git.oschina.net/")
        ,GITHUB("https://github.com/", "https://github.com/")
        ,IBIZ("IBIZ", "iBiz仓库")
        ,GITEE("GITEE", "https://gitee.com/")
;
           
        public final String text;
        public final String value;
        
        private GitRepoType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static GitRepoType from(String value){
            switch(value){
                case "https://git.oschina.net/":
                    return OSCHINA;
                case "https://github.com/":
                    return GITHUB;
                case "IBIZ":
                    return IBIZ;
                case "GITEE":
                    return GITEE;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发系统引用链接状态，数值项
     * <P>
     * <ul>
     * <li>NOTCREATED&nbsp;(10)
     * <P>
     * 未创建
     * <li>CREATING&nbsp;(20)
     * <P>
     * 创建中
     * <li>CREATED&nbsp;(30)
     * <P>
     * 已创建
     * <li>FAILED&nbsp;(40)
     * <P>
     * 创建失败
     * <li>LINKFAILED&nbsp;(41)
     * <P>
     * 备份链接无效
     * <li>LINKUNAUTHORIZED&nbsp;(42)
     * <P>
     * 备份链接未授权
     * </ul>     
     */
    public static enum DevSysRefLinkState{
        NOTCREATED(10, "未创建")
        ,CREATING(20, "创建中")
        ,CREATED(30, "已创建")
        ,FAILED(40, "创建失败")
        ,LINKFAILED(41, "备份链接无效")
        ,LINKUNAUTHORIZED(42, "备份链接未授权")
;
           
        public final String text;
        public final int value;
        
        private DevSysRefLinkState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSysRefLinkState from(int value){
            switch(value){
                case 10:
                    return NOTCREATED;
                case 20:
                    return CREATING;
                case 30:
                    return CREATED;
                case 40:
                    return FAILED;
                case 41:
                    return LINKFAILED;
                case 42:
                    return LINKUNAUTHORIZED;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统运行会话打包模式
     * <P>
     * <ul>
     * <li>DEBUG
     * <P>
     * 开发模式
     * <li>RELEASE
     * <P>
     * 生产模式
     * </ul>     
     */
    public static enum SysRunPackMode{
        DEBUG("DEBUG", "开发模式")
        ,RELEASE("RELEASE", "生产模式")
;
           
        public final String text;
        public final String value;
        
        private SysRunPackMode(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysRunPackMode from(String value){
            switch(value){
                case "DEBUG":
                    return DEBUG;
                case "RELEASE":
                    return RELEASE;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统开发后台任务状态，数值项，多值模式（字符或处理）
     * <P>
     * <ul>
     * <li>CREATED&nbsp;(10)
     * <P>
     * 已建立
     * <li>EXECUTING&nbsp;(20)
     * <P>
     * 执行中
     * <li>FINISHED&nbsp;(30)
     * <P>
     * 已完成
     * <li>CANCELLED&nbsp;(40)
     * <P>
     * 已取消
     * </ul>     
     */
    public static enum SysDevBKTaskState{
        CREATED(10, "已建立")
        ,EXECUTING(20, "执行中")
        ,FINISHED(30, "已完成")
        ,CANCELLED(40, "已取消")
;
           
        public final String text;
        public final int value;
        
        private SysDevBKTaskState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysDevBKTaskState from(int value){
            switch(value){
                case 10:
                    return CREATED;
                case 20:
                    return EXECUTING;
                case 30:
                    return FINISHED;
                case 40:
                    return CANCELLED;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 镜像项类型
     * <P>
     * <ul>
     * <li>API&nbsp;(api)
     * <P>
     * 服务接口
     * <li>APP&nbsp;(app)
     * <P>
     * 前端应用
     * <li>PSMODELTOOL&nbsp;(psmodeltool)
     * <P>
     * 系统作业项
     * <li>USER&nbsp;(user)
     * <P>
     * 用户自定义
     * <li>USER2&nbsp;(user2)
     * <P>
     * 用户自定义2
     * <li>USER3&nbsp;(user3)
     * <P>
     * 用户自定义3
     * <li>USER4&nbsp;(user4)
     * <P>
     * 用户自定义4
     * </ul>     
     */
    public static enum RegistryItemType{
        API("api", "服务接口")
        ,APP("app", "前端应用")
        ,PSMODELTOOL("psmodeltool", "系统作业项")
        ,USER("user", "用户自定义")
        ,USER2("user2", "用户自定义2")
        ,USER3("user3", "用户自定义3")
        ,USER4("user4", "用户自定义4")
;
           
        public final String text;
        public final String value;
        
        private RegistryItemType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static RegistryItemType from(String value){
            switch(value){
                case "api":
                    return API;
                case "app":
                    return APP;
                case "psmodeltool":
                    return PSMODELTOOL;
                case "user":
                    return USER;
                case "user2":
                    return USER2;
                case "user3":
                    return USER3;
                case "user4":
                    return USER4;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云应用方案系统版本分支类型(仅分支)
     * <P>
     * <ul>
     * <li>BRANCH
     * <P>
     * 分支
     * <li>TAG
     * <P>
     * 标记
     * </ul>     
     */
    public static enum DevSlnSysVCType2{
        BRANCH("BRANCH", "分支")
        ,TAG("TAG", "标记")
;
           
        public final String text;
        public final String value;
        
        private DevSlnSysVCType2(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSlnSysVCType2 from(String value){
            switch(value){
                case "BRANCH":
                    return BRANCH;
                case "TAG":
                    return TAG;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发系统引用模式
     * <P>
     * <ul>
     * <li>DEVSYS01
     * <P>
     * 开发系统引用1
     * <li>DEVSYS02
     * <P>
     * 开发系统引用2
     * <li>DEVSYS03
     * <P>
     * 开发系统引用3
     * <li>DEVSYS04
     * <P>
     * 开发系统引用4
     * <li>DEVSYS05
     * <P>
     * 开发系统引用5
     * <li>DEVSYS06
     * <P>
     * 开发系统引用6
     * <li>DEVSYS07
     * <P>
     * 开发系统引用7
     * <li>DEVSYS08
     * <P>
     * 开发系统引用8
     * <li>DEVSYS09
     * <P>
     * 开发系统引用9
     * <li>DEVSYS19
     * <P>
     * 开发系统引用10
     * <li>DEVSYS11
     * <P>
     * 开发系统引用11
     * <li>DEVSYS12
     * <P>
     * 开发系统引用12
     * </ul>     
     */
    public static enum DevSysRefMode{
        DEVSYS01("DEVSYS01", "开发系统引用1")
        ,DEVSYS02("DEVSYS02", "开发系统引用2")
        ,DEVSYS03("DEVSYS03", "开发系统引用3")
        ,DEVSYS04("DEVSYS04", "开发系统引用4")
        ,DEVSYS05("DEVSYS05", "开发系统引用5")
        ,DEVSYS06("DEVSYS06", "开发系统引用6")
        ,DEVSYS07("DEVSYS07", "开发系统引用7")
        ,DEVSYS08("DEVSYS08", "开发系统引用8")
        ,DEVSYS09("DEVSYS09", "开发系统引用9")
        ,DEVSYS19("DEVSYS19", "开发系统引用10")
        ,DEVSYS11("DEVSYS11", "开发系统引用11")
        ,DEVSYS12("DEVSYS12", "开发系统引用12")
;
           
        public final String text;
        public final String value;
        
        private DevSysRefMode(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSysRefMode from(String value){
            switch(value){
                case "DEVSYS01":
                    return DEVSYS01;
                case "DEVSYS02":
                    return DEVSYS02;
                case "DEVSYS03":
                    return DEVSYS03;
                case "DEVSYS04":
                    return DEVSYS04;
                case "DEVSYS05":
                    return DEVSYS05;
                case "DEVSYS06":
                    return DEVSYS06;
                case "DEVSYS07":
                    return DEVSYS07;
                case "DEVSYS08":
                    return DEVSYS08;
                case "DEVSYS09":
                    return DEVSYS09;
                case "DEVSYS19":
                    return DEVSYS19;
                case "DEVSYS11":
                    return DEVSYS11;
                case "DEVSYS12":
                    return DEVSYS12;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 资源位置，数值项
     * <P>
     * <ul>
     * <li>ITEM_2&nbsp;(2)
     * <P>
     * 用户自建
     * <li>ITEM_1&nbsp;(1)
     * <P>
     * 云平台
     * <li>ITEM_5&nbsp;(5)
     * <P>
     * 云平台分时资源
     * <li>ITEM_10&nbsp;(10)
     * <P>
     * 用户集群自建
     * </ul>     
     */
    public static enum DevCenterResPos{
        ITEM_2(2, "用户自建")
        ,ITEM_1(1, "云平台")
        ,ITEM_5(5, "云平台分时资源")
        ,ITEM_10(10, "用户集群自建")
;
           
        public final String text;
        public final int value;
        
        private DevCenterResPos(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevCenterResPos from(int value){
            switch(value){
                case 2:
                    return ITEM_2;
                case 1:
                    return ITEM_1;
                case 5:
                    return ITEM_5;
                case 10:
                    return ITEM_10;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 模板样式引擎
     * <P>
     * <ul>
     * <li>DEFAULT
     * <P>
     * 默认
     * <li>V2
     * <P>
     * V2
     * </ul>     
     */
    public static enum PSTemplEngine{
        DEFAULT("DEFAULT", "默认")
        ,V2("V2", "V2")
;
           
        public final String text;
        public final String value;
        
        private PSTemplEngine(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static PSTemplEngine from(String value){
            switch(value){
                case "DEFAULT":
                    return DEFAULT;
                case "V2":
                    return V2;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统服务接口认证模式
     * <P>
     * <ul>
     * <li>NONE
     * <P>
     * 无认证
     * <li>AUTHORIZATION_CODE
     * <P>
     * 授权码模式
     * <li>PASSWORD
     * <P>
     * 密码模式
     * <li>CLIENT_CREDENTIALS
     * <P>
     * 客户端模式
     * <li>IMPLICIT
     * <P>
     * 简化模式
     * <li>USER
     * <P>
     * 用户自定义
     * <li>USER2
     * <P>
     * 用户自定义2
     * </ul>     
     */
    public static enum APIAuthMode{
        NONE("NONE", "无认证")
        ,AUTHORIZATION_CODE("AUTHORIZATION_CODE", "授权码模式")
        ,PASSWORD("PASSWORD", "密码模式")
        ,CLIENT_CREDENTIALS("CLIENT_CREDENTIALS", "客户端模式")
        ,IMPLICIT("IMPLICIT", "简化模式")
        ,USER("USER", "用户自定义")
        ,USER2("USER2", "用户自定义2")
;
           
        public final String text;
        public final String value;
        
        private APIAuthMode(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static APIAuthMode from(String value){
            switch(value){
                case "NONE":
                    return NONE;
                case "AUTHORIZATION_CODE":
                    return AUTHORIZATION_CODE;
                case "PASSWORD":
                    return PASSWORD;
                case "CLIENT_CREDENTIALS":
                    return CLIENT_CREDENTIALS;
                case "IMPLICIT":
                    return IMPLICIT;
                case "USER":
                    return USER;
                case "USER2":
                    return USER2;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 应用容器上传文件模式
     * <P>
     * <ul>
     * <li>SSH
     * <P>
     * SSH
     * <li>SFTP
     * <P>
     * SFTP
     * <li>FTP
     * <P>
     * FTP
     * </ul>     
     */
    public static enum ASFileUploadMode{
        SSH("SSH", "SSH")
        ,SFTP("SFTP", "SFTP")
        ,FTP("FTP", "FTP")
;
           
        public final String text;
        public final String value;
        
        private ASFileUploadMode(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static ASFileUploadMode from(String value){
            switch(value){
                case "SSH":
                    return SSH;
                case "SFTP":
                    return SFTP;
                case "FTP":
                    return FTP;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统服务接口类型
     * <P>
     * <ul>
     * <li>RESTFUL
     * <P>
     * RESTful API
     * <li>JAXRS
     * <P>
     * RESTful WebService
     * <li>WEBSERVICE
     * <P>
     * WebService
     * <li>USER
     * <P>
     * 用户自定义
     * <li>USER2
     * <P>
     * 用户自定义2
     * </ul>     
     */
    public static enum ServiceAPIType{
        RESTFUL("RESTFUL", "RESTful API")
        ,JAXRS("JAXRS", "RESTful WebService")
        ,WEBSERVICE("WEBSERVICE", "WebService")
        ,USER("USER", "用户自定义")
        ,USER2("USER2", "用户自定义2")
;
           
        public final String text;
        public final String value;
        
        private ServiceAPIType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static ServiceAPIType from(String value){
            switch(value){
                case "RESTFUL":
                    return RESTFUL;
                case "JAXRS":
                    return JAXRS;
                case "WEBSERVICE":
                    return WEBSERVICE;
                case "USER":
                    return USER;
                case "USER2":
                    return USER2;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 动态系统类型，数值项
     * <P>
     * <ul>
     * <li>NOTSUPPORTED&nbsp;(0)
     * <P>
     * 不支持
     * <li>DYNAINST&nbsp;(1)
     * <P>
     * 支持（标准动态实例）
     * <li>DYNASYS&nbsp;(2)
     * <P>
     * 支持（高级动态系统）
     * </ul>     
     */
    public static enum DynaSysTypes{
        NOTSUPPORTED(0, "不支持")
        ,DYNAINST(1, "支持（标准动态实例）")
        ,DYNASYS(2, "支持（高级动态系统）")
;
           
        public final String text;
        public final int value;
        
        private DynaSysTypes(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DynaSysTypes from(int value){
            switch(value){
                case 0:
                    return NOTSUPPORTED;
                case 1:
                    return DYNAINST;
                case 2:
                    return DYNASYS;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发模板类型
     * <P>
     * <ul>
     * <li>PSPF
     * <P>
     * 前端模板
     * <li>PSSF
     * <P>
     * 后台模板
     * </ul>     
     */
    public static enum DevSlnTemplType{
        PSPF("PSPF", "前端模板")
        ,PSSF("PSSF", "后台模板")
;
           
        public final String text;
        public final String value;
        
        private DevSlnTemplType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSlnTemplType from(String value){
            switch(value){
                case "PSPF":
                    return PSPF;
                case "PSSF":
                    return PSSF;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 部署中心类型
     * <P>
     * <ul>
     * <li>JENKINS
     * <P>
     * Jenkins
     * </ul>     
     */
    public static enum DeployCenterType{
        JENKINS("JENKINS", "Jenkins")
;
           
        public final String text;
        public final String value;
        
        private DeployCenterType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DeployCenterType from(String value){
            switch(value){
                case "JENKINS":
                    return JENKINS;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统运行会话运行模式
     * <P>
     * <ul>
     * <li>STARTX
     * <P>
     * 启动系统
     * <li>PUBCODE
     * <P>
     * 代码发布
     * <li>PACKVER
     * <P>
     * 打包版本
     * <li>PACKMOBAPP
     * <P>
     * 打包移动应用
     * <li>STARTMSAPI
     * <P>
     * 启动微服务
     * <li>STARTMSAPP
     * <P>
     * 启动微服务应用
     * <li>DEPLOYPKG
     * <P>
     * 部署系统组件到仓库
     * <li>STARTMSFUNC
     * <P>
     * 启动微服务功能
     * <li>PUBCODE2
     * <P>
     * 代码发布（模板开发）
     * <li>PUBDOC
     * <P>
     * 文档发布
     * <li>PUBMODEL
     * <P>
     * 模型发布
     * </ul>     
     */
    public static enum SysRunModes{
        STARTX("STARTX", "启动系统")
        ,PUBCODE("PUBCODE", "代码发布")
        ,PACKVER("PACKVER", "打包版本")
        ,PACKMOBAPP("PACKMOBAPP", "打包移动应用")
        ,STARTMSAPI("STARTMSAPI", "启动微服务")
        ,STARTMSAPP("STARTMSAPP", "启动微服务应用")
        ,DEPLOYPKG("DEPLOYPKG", "部署系统组件到仓库")
        ,STARTMSFUNC("STARTMSFUNC", "启动微服务功能")
        ,PUBCODE2("PUBCODE2", "代码发布（模板开发）")
        ,PUBDOC("PUBDOC", "文档发布")
        ,PUBMODEL("PUBMODEL", "模型发布")
;
           
        public final String text;
        public final String value;
        
        private SysRunModes(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysRunModes from(String value){
            switch(value){
                case "STARTX":
                    return STARTX;
                case "PUBCODE":
                    return PUBCODE;
                case "PACKVER":
                    return PACKVER;
                case "PACKMOBAPP":
                    return PACKMOBAPP;
                case "STARTMSAPI":
                    return STARTMSAPI;
                case "STARTMSAPP":
                    return STARTMSAPP;
                case "DEPLOYPKG":
                    return DEPLOYPKG;
                case "STARTMSFUNC":
                    return STARTMSFUNC;
                case "PUBCODE2":
                    return PUBCODE2;
                case "PUBDOC":
                    return PUBDOC;
                case "PUBMODEL":
                    return PUBMODEL;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发系统备份状态，数值项
     * <P>
     * <ul>
     * <li>NOTCREATED&nbsp;(10)
     * <P>
     * 未创建
     * <li>CREATING&nbsp;(20)
     * <P>
     * 创建中
     * <li>CREATED&nbsp;(30)
     * <P>
     * 已创建
     * <li>FAILED&nbsp;(40)
     * <P>
     * 创建失败
     * <li>LINKFAILED&nbsp;(41)
     * <P>
     * 备份链接无效
     * <li>LINKUNAUTHORIZED&nbsp;(42)
     * <P>
     * 备份链接未授权
     * </ul>     
     */
    public static enum DevSlnSysBkState{
        NOTCREATED(10, "未创建")
        ,CREATING(20, "创建中")
        ,CREATED(30, "已创建")
        ,FAILED(40, "创建失败")
        ,LINKFAILED(41, "备份链接无效")
        ,LINKUNAUTHORIZED(42, "备份链接未授权")
;
           
        public final String text;
        public final int value;
        
        private DevSlnSysBkState(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSlnSysBkState from(int value){
            switch(value){
                case 10:
                    return NOTCREATED;
                case 20:
                    return CREATING;
                case 30:
                    return CREATED;
                case 40:
                    return FAILED;
                case 41:
                    return LINKFAILED;
                case 42:
                    return LINKUNAUTHORIZED;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云应用方案访问能力，数值项
     * <P>
     * <ul>
     * <li>READ&nbsp;(1)
     * <P>
     * 读
     * <li>READWRITE&nbsp;(3)
     * <P>
     * 读写
     * </ul>     
     */
    public static enum SlnSysAccMode{
        READ(1, "读")
        ,READWRITE(3, "读写")
;
           
        public final String text;
        public final int value;
        
        private SlnSysAccMode(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static SlnSysAccMode from(int value){
            switch(value){
                case 1:
                    return READ;
                case 3:
                    return READWRITE;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 集群类型
     * <P>
     * <ul>
     * <li>K8S
     * <P>
     * K8s
     * <li>SWARM
     * <P>
     * Swarm
     * </ul>     
     */
    public static enum ClusterType{
        K8S("K8S", "K8s")
        ,SWARM("SWARM", "Swarm")
;
           
        public final String text;
        public final String value;
        
        private ClusterType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static ClusterType from(String value){
            switch(value){
                case "K8S":
                    return K8S;
                case "SWARM":
                    return SWARM;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 产品类型
     * <P>
     * <ul>
     * <li>MODEL
     * <P>
     * 系统模型
     * <li>IMAGE
     * <P>
     * 运行镜像
     * <li>IMAGE_SF
     * <P>
     * 后台服务镜像
     * <li>IMAGE_PF
     * <P>
     * 前端应用镜像
     * <li>CONFIG_MSP
     * <P>
     * Cloud平台
     * <li>CONFIG_MSPF
     * <P>
     * Cloud平台配置项
     * <li>CODETEMPL
     * <P>
     * 代码模板
     * <li>CODETEMPL_SF
     * <P>
     * 代码模板（后台）
     * <li>CODETEMPL_PF
     * <P>
     * 代码模板（前端）
     * <li>CODEENGINE
     * <P>
     * 代码发布引擎
     * <li>PSMODELTOOL
     * <P>
     * 模型工具
     * <li>PSMODELTOOL_IMPSYSMODEL
     * <P>
     * 模型工具（导入系统模型）
     * <li>PSMODELTOOL_EXPSYSRTMODEL
     * <P>
     * 模型工具（导出系统RT模型）
     * <li>SCRIPT
     * <P>
     * 二开脚本
     * <li>SCRIPT_SF
     * <P>
     * 二开脚本（后台）
     * <li>SCRIPT_PF
     * <P>
     * 二开脚本（前端）
     * </ul>     
     */
    public static enum ProductType{
        MODEL("MODEL", "系统模型")
        ,IMAGE("IMAGE", "运行镜像")
        ,IMAGE_SF("IMAGE_SF", "后台服务镜像")
        ,IMAGE_PF("IMAGE_PF", "前端应用镜像")
        ,CONFIG_MSP("CONFIG_MSP", "Cloud平台")
        ,CONFIG_MSPF("CONFIG_MSPF", "Cloud平台配置项")
        ,CODETEMPL("CODETEMPL", "代码模板")
        ,CODETEMPL_SF("CODETEMPL_SF", "代码模板（后台）")
        ,CODETEMPL_PF("CODETEMPL_PF", "代码模板（前端）")
        ,CODEENGINE("CODEENGINE", "代码发布引擎")
        ,PSMODELTOOL("PSMODELTOOL", "模型工具")
        ,PSMODELTOOL_IMPSYSMODEL("PSMODELTOOL_IMPSYSMODEL", "模型工具（导入系统模型）")
        ,PSMODELTOOL_EXPSYSRTMODEL("PSMODELTOOL_EXPSYSRTMODEL", "模型工具（导出系统RT模型）")
        ,SCRIPT("SCRIPT", "二开脚本")
        ,SCRIPT_SF("SCRIPT_SF", "二开脚本（后台）")
        ,SCRIPT_PF("SCRIPT_PF", "二开脚本（前端）")
;
           
        public final String text;
        public final String value;
        
        private ProductType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static ProductType from(String value){
            switch(value){
                case "MODEL":
                    return MODEL;
                case "IMAGE":
                    return IMAGE;
                case "IMAGE_SF":
                    return IMAGE_SF;
                case "IMAGE_PF":
                    return IMAGE_PF;
                case "CONFIG_MSP":
                    return CONFIG_MSP;
                case "CONFIG_MSPF":
                    return CONFIG_MSPF;
                case "CODETEMPL":
                    return CODETEMPL;
                case "CODETEMPL_SF":
                    return CODETEMPL_SF;
                case "CODETEMPL_PF":
                    return CODETEMPL_PF;
                case "CODEENGINE":
                    return CODEENGINE;
                case "PSMODELTOOL":
                    return PSMODELTOOL;
                case "PSMODELTOOL_IMPSYSMODEL":
                    return PSMODELTOOL_IMPSYSMODEL;
                case "PSMODELTOOL_EXPSYSRTMODEL":
                    return PSMODELTOOL_EXPSYSRTMODEL;
                case "SCRIPT":
                    return SCRIPT;
                case "SCRIPT_SF":
                    return SCRIPT_SF;
                case "SCRIPT_PF":
                    return SCRIPT_PF;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 应用中心资源锁定模式，数值项
     * <P>
     * <ul>
     * <li>NONE&nbsp;(0)
     * <P>
     * 未锁定
     * <li>SHARE&nbsp;(1)
     * <P>
     * 共享锁定
     * <li>SINGLE&nbsp;(2)
     * <P>
     * 独占锁定
     * </ul>     
     */
    public static enum DCResLockMode{
        NONE(0, "未锁定")
        ,SHARE(1, "共享锁定")
        ,SINGLE(2, "独占锁定")
;
           
        public final String text;
        public final int value;
        
        private DCResLockMode(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DCResLockMode from(int value){
            switch(value){
                case 0:
                    return NONE;
                case 1:
                    return SHARE;
                case 2:
                    return SINGLE;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 平台微服务平台类型
     * <P>
     * <ul>
     * <li>SPRINGCLOUD
     * <P>
     * SpringCloud
     * <li>DUBBO
     * <P>
     * Dubbo
     * <li>IBIZCLOUD
     * <P>
     * iBizCloud
     * </ul>     
     */
    public static enum MSPlatformType{
        SPRINGCLOUD("SPRINGCLOUD", "SpringCloud")
        ,DUBBO("DUBBO", "Dubbo")
        ,IBIZCLOUD("IBIZCLOUD", "iBizCloud")
;
           
        public final String text;
        public final String value;
        
        private MSPlatformType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static MSPlatformType from(String value){
            switch(value){
                case "SPRINGCLOUD":
                    return SPRINGCLOUD;
                case "DUBBO":
                    return DUBBO;
                case "IBIZCLOUD":
                    return IBIZCLOUD;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云应用方案系统版本分支类型
     * <P>
     * <ul>
     * <li>TRUNK
     * <P>
     * 主干版本
     * <li>BRANCH
     * <P>
     * 分支
     * <li>TAG
     * <P>
     * 标记
     * </ul>     
     */
    public static enum DevSlnSysVCType{
        TRUNK("TRUNK", "主干版本")
        ,BRANCH("BRANCH", "分支")
        ,TAG("TAG", "标记")
;
           
        public final String text;
        public final String value;
        
        private DevSlnSysVCType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSlnSysVCType from(String value){
            switch(value){
                case "TRUNK":
                    return TRUNK;
                case "BRANCH":
                    return BRANCH;
                case "TAG":
                    return TAG;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 系统运行组件部署目标
     * <P>
     * <ul>
     * <li>SLN
     * <P>
     * 开发方案仓库（默认）
     * <li>DC
     * <P>
     * 应用中心仓库
     * </ul>     
     */
    public static enum SysRunPkgDeployTarget{
        SLN("SLN", "开发方案仓库（默认）")
        ,DC("DC", "应用中心仓库")
;
           
        public final String text;
        public final String value;
        
        private SysRunPkgDeployTarget(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysRunPkgDeployTarget from(String value){
            switch(value){
                case "SLN":
                    return SLN;
                case "DC":
                    return DC;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 开发方案用户模式，数值项
     * <P>
     * <ul>
     * <li>ITEM_0&nbsp;(0)
     * <P>
     * 指定系统
     * <li>ITEM_1&nbsp;(1)
     * <P>
     * 全部系统
     * <li>ITEM_2&nbsp;(2)
     * <P>
     * 指定模板
     * <li>ITEM_3&nbsp;(3)
     * <P>
     * 全部模板
     * </ul>     
     */
    public static enum DevSlnUserMode{
        ITEM_0(0, "指定系统")
        ,ITEM_1(1, "全部系统")
        ,ITEM_2(2, "指定模板")
        ,ITEM_3(3, "全部模板")
;
           
        public final String text;
        public final int value;
        
        private DevSlnUserMode(int value, String text){
            this.value = value;
            this.text = text;
        }

        public static DevSlnUserMode from(int value){
            switch(value){
                case 0:
                    return ITEM_0;
                case 1:
                    return ITEM_1;
                case 2:
                    return ITEM_2;
                case 3:
                    return ITEM_3;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云系统开发后台任务类型
     * <P>
     * <ul>
     * <li>DEPLOYSYS
     * <P>
     * 部署系统
     * <li>PACKSFCODE
     * <P>
     * 打包服务代码
     * <li>PACKPFCODE
     * <P>
     * 打包应用代码
     * <li>PUBSFCODE
     * <P>
     * 发布服务代码
     * <li>PUBPFCODE
     * <P>
     * 发布应用代码
     * <li>STARTUPAS
     * <P>
     * 启动应用服务器
     * <li>SYNCDBMODEL
     * <P>
     * 同步数据结构
     * <li>SHUTDOWNAS
     * <P>
     * 关闭应用服务器
     * <li>STARTUPEX
     * <P>
     * 一键系统启动
     * <li>SYNCSUBSYSDBMODEL
     * <P>
     * 同步子系统数据结构
     * <li>SYNCSUBSYSMODEL
     * <P>
     * 同步子系统模型
     * <li>INITSYSMODEL
     * <P>
     * 初始化系统模型
     * <li>INITSYSDEDBCFG
     * <P>
     * 初始化系统实体数据库配置
     * <li>RESETSFCODE
     * <P>
     * 重置服务代码（前）
     * <li>RESETPFCODE
     * <P>
     * 重置应用代码
     * <li>IMPSUBSYSMODEL
     * <P>
     * 导入子系统模型
     * <li>INITAPPMODEL
     * <P>
     * 初始化应用模型
     * <li>CHECKSYSMODEL
     * <P>
     * 检查系统模型
     * <li>CHECKSYSAPPMODEL
     * <P>
     * 检查系统应用模型
     * <li>RESETSFCODE2
     * <P>
     * 重置服务代码（后）
     * <li>STARTUPEX2
     * <P>
     * 一键代码发布
     * <li>STARTUPEX3
     * <P>
     * 一键版本打包
     * <li>PACKSYSVER
     * <P>
     * 打包系统版本
     * <li>PUBSYSDBMODEL
     * <P>
     * 重新发布系统数据库结构
     * <li>DIFFSYSMODEL
     * <P>
     * 对比系统模型差异
     * <li>CREATESYS
     * <P>
     * 建立系统
     * <li>INSTALLRTDATA
     * <P>
     * 安装系统运行数据
     * <li>STARTUPEX4
     * <P>
     * 一键移动应用打包
     * <li>PACKANDROIDAPP
     * <P>
     * 打包Android应用
     * <li>PACKIOSAPP
     * <P>
     * 打包iOS应用
     * <li>REMOTEPACKSYS
     * <P>
     * 远程系统打包
     * <li>STARTUPEX5
     * <P>
     * 一键微服务接口部署
     * <li>STARTUPEX6
     * <P>
     * 一键微服务应用部署
     * <li>STARTUPEX7
     * <P>
     * 一键部署组件包
     * <li>DEPLOYPKG
     * <P>
     * 部署组件包到仓库
     * <li>CLONEDEMODEL
     * <P>
     * 克隆实体模型
     * <li>SYNCSERVICEAPICLIENTMODEL
     * <P>
     * 克隆服务接口客户端模型
     * <li>STARTUPEX8
     * <P>
     * 一键微服务功能部署
     * <li>BEGINPUBCODE
     * <P>
     * 准备发布代码
     * <li>ENDPUBCODE
     * <P>
     * 结束发布代码
     * <li>RESETPUBCODE
     * <P>
     * 重置发布代码
     * <li>PFPREVIEWACTION
     * <P>
     * 前端预览作业
     * <li>SFPREVIEWACTION
     * <P>
     * 后台预览作业
     * <li>CODEPREVIEWACTION
     * <P>
     * 代码预览作业
     * <li>SYNCSUBSYSSADEMODEL
     * <P>
     * 同步服务接口实体模型
     * <li>SYNCAPPSBMODEL
     * <P>
     * 同步应用故事板
     * <li>STARTUPEX9
     * <P>
     * 一键动态实例模型发布
     * <li>PUBDYNAINSTMODEL
     * <P>
     * 发布动态实例模型
     * <li>DYNAINSTPREVIEWACTION
     * <P>
     * 动态实例预览作业
     * <li>SYNCSYSDBSCHEMAMODEL
     * <P>
     * 同步系统数据库模型
     * </ul>     
     */
    public static enum SysDevBKTaskType{
        DEPLOYSYS("DEPLOYSYS", "部署系统")
        ,PACKSFCODE("PACKSFCODE", "打包服务代码")
        ,PACKPFCODE("PACKPFCODE", "打包应用代码")
        ,PUBSFCODE("PUBSFCODE", "发布服务代码")
        ,PUBPFCODE("PUBPFCODE", "发布应用代码")
        ,STARTUPAS("STARTUPAS", "启动应用服务器")
        ,SYNCDBMODEL("SYNCDBMODEL", "同步数据结构")
        ,SHUTDOWNAS("SHUTDOWNAS", "关闭应用服务器")
        ,STARTUPEX("STARTUPEX", "一键系统启动")
        ,SYNCSUBSYSDBMODEL("SYNCSUBSYSDBMODEL", "同步子系统数据结构")
        ,SYNCSUBSYSMODEL("SYNCSUBSYSMODEL", "同步子系统模型")
        ,INITSYSMODEL("INITSYSMODEL", "初始化系统模型")
        ,INITSYSDEDBCFG("INITSYSDEDBCFG", "初始化系统实体数据库配置")
        ,RESETSFCODE("RESETSFCODE", "重置服务代码（前）")
        ,RESETPFCODE("RESETPFCODE", "重置应用代码")
        ,IMPSUBSYSMODEL("IMPSUBSYSMODEL", "导入子系统模型")
        ,INITAPPMODEL("INITAPPMODEL", "初始化应用模型")
        ,CHECKSYSMODEL("CHECKSYSMODEL", "检查系统模型")
        ,CHECKSYSAPPMODEL("CHECKSYSAPPMODEL", "检查系统应用模型")
        ,RESETSFCODE2("RESETSFCODE2", "重置服务代码（后）")
        ,STARTUPEX2("STARTUPEX2", "一键代码发布")
        ,STARTUPEX3("STARTUPEX3", "一键版本打包")
        ,PACKSYSVER("PACKSYSVER", "打包系统版本")
        ,PUBSYSDBMODEL("PUBSYSDBMODEL", "重新发布系统数据库结构")
        ,DIFFSYSMODEL("DIFFSYSMODEL", "对比系统模型差异")
        ,CREATESYS("CREATESYS", "建立系统")
        ,INSTALLRTDATA("INSTALLRTDATA", "安装系统运行数据")
        ,STARTUPEX4("STARTUPEX4", "一键移动应用打包")
        ,PACKANDROIDAPP("PACKANDROIDAPP", "打包Android应用")
        ,PACKIOSAPP("PACKIOSAPP", "打包iOS应用")
        ,REMOTEPACKSYS("REMOTEPACKSYS", "远程系统打包")
        ,STARTUPEX5("STARTUPEX5", "一键微服务接口部署")
        ,STARTUPEX6("STARTUPEX6", "一键微服务应用部署")
        ,STARTUPEX7("STARTUPEX7", "一键部署组件包")
        ,DEPLOYPKG("DEPLOYPKG", "部署组件包到仓库")
        ,CLONEDEMODEL("CLONEDEMODEL", "克隆实体模型")
        ,SYNCSERVICEAPICLIENTMODEL("SYNCSERVICEAPICLIENTMODEL", "克隆服务接口客户端模型")
        ,STARTUPEX8("STARTUPEX8", "一键微服务功能部署")
        ,BEGINPUBCODE("BEGINPUBCODE", "准备发布代码")
        ,ENDPUBCODE("ENDPUBCODE", "结束发布代码")
        ,RESETPUBCODE("RESETPUBCODE", "重置发布代码")
        ,PFPREVIEWACTION("PFPREVIEWACTION", "前端预览作业")
        ,SFPREVIEWACTION("SFPREVIEWACTION", "后台预览作业")
        ,CODEPREVIEWACTION("CODEPREVIEWACTION", "代码预览作业")
        ,SYNCSUBSYSSADEMODEL("SYNCSUBSYSSADEMODEL", "同步服务接口实体模型")
        ,SYNCAPPSBMODEL("SYNCAPPSBMODEL", "同步应用故事板")
        ,STARTUPEX9("STARTUPEX9", "一键动态实例模型发布")
        ,PUBDYNAINSTMODEL("PUBDYNAINSTMODEL", "发布动态实例模型")
        ,DYNAINSTPREVIEWACTION("DYNAINSTPREVIEWACTION", "动态实例预览作业")
        ,SYNCSYSDBSCHEMAMODEL("SYNCSYSDBSCHEMAMODEL", "同步系统数据库模型")
;
           
        public final String text;
        public final String value;
        
        private SysDevBKTaskType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static SysDevBKTaskType from(String value){
            switch(value){
                case "DEPLOYSYS":
                    return DEPLOYSYS;
                case "PACKSFCODE":
                    return PACKSFCODE;
                case "PACKPFCODE":
                    return PACKPFCODE;
                case "PUBSFCODE":
                    return PUBSFCODE;
                case "PUBPFCODE":
                    return PUBPFCODE;
                case "STARTUPAS":
                    return STARTUPAS;
                case "SYNCDBMODEL":
                    return SYNCDBMODEL;
                case "SHUTDOWNAS":
                    return SHUTDOWNAS;
                case "STARTUPEX":
                    return STARTUPEX;
                case "SYNCSUBSYSDBMODEL":
                    return SYNCSUBSYSDBMODEL;
                case "SYNCSUBSYSMODEL":
                    return SYNCSUBSYSMODEL;
                case "INITSYSMODEL":
                    return INITSYSMODEL;
                case "INITSYSDEDBCFG":
                    return INITSYSDEDBCFG;
                case "RESETSFCODE":
                    return RESETSFCODE;
                case "RESETPFCODE":
                    return RESETPFCODE;
                case "IMPSUBSYSMODEL":
                    return IMPSUBSYSMODEL;
                case "INITAPPMODEL":
                    return INITAPPMODEL;
                case "CHECKSYSMODEL":
                    return CHECKSYSMODEL;
                case "CHECKSYSAPPMODEL":
                    return CHECKSYSAPPMODEL;
                case "RESETSFCODE2":
                    return RESETSFCODE2;
                case "STARTUPEX2":
                    return STARTUPEX2;
                case "STARTUPEX3":
                    return STARTUPEX3;
                case "PACKSYSVER":
                    return PACKSYSVER;
                case "PUBSYSDBMODEL":
                    return PUBSYSDBMODEL;
                case "DIFFSYSMODEL":
                    return DIFFSYSMODEL;
                case "CREATESYS":
                    return CREATESYS;
                case "INSTALLRTDATA":
                    return INSTALLRTDATA;
                case "STARTUPEX4":
                    return STARTUPEX4;
                case "PACKANDROIDAPP":
                    return PACKANDROIDAPP;
                case "PACKIOSAPP":
                    return PACKIOSAPP;
                case "REMOTEPACKSYS":
                    return REMOTEPACKSYS;
                case "STARTUPEX5":
                    return STARTUPEX5;
                case "STARTUPEX6":
                    return STARTUPEX6;
                case "STARTUPEX7":
                    return STARTUPEX7;
                case "DEPLOYPKG":
                    return DEPLOYPKG;
                case "CLONEDEMODEL":
                    return CLONEDEMODEL;
                case "SYNCSERVICEAPICLIENTMODEL":
                    return SYNCSERVICEAPICLIENTMODEL;
                case "STARTUPEX8":
                    return STARTUPEX8;
                case "BEGINPUBCODE":
                    return BEGINPUBCODE;
                case "ENDPUBCODE":
                    return ENDPUBCODE;
                case "RESETPUBCODE":
                    return RESETPUBCODE;
                case "PFPREVIEWACTION":
                    return PFPREVIEWACTION;
                case "SFPREVIEWACTION":
                    return SFPREVIEWACTION;
                case "CODEPREVIEWACTION":
                    return CODEPREVIEWACTION;
                case "SYNCSUBSYSSADEMODEL":
                    return SYNCSUBSYSSADEMODEL;
                case "SYNCAPPSBMODEL":
                    return SYNCAPPSBMODEL;
                case "STARTUPEX9":
                    return STARTUPEX9;
                case "PUBDYNAINSTMODEL":
                    return PUBDYNAINSTMODEL;
                case "DYNAINSTPREVIEWACTION":
                    return DYNAINSTPREVIEWACTION;
                case "SYNCSYSDBSCHEMAMODEL":
                    return SYNCSYSDBSCHEMAMODEL;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

    /**
     * 云应用中心后台任务类型
     * <P>
     * <ul>
     * <li>PACKDEVSLNSYS
     * <P>
     * 打包开发系统
     * <li>CREATEDEVSLNSYS
     * <P>
     * 建立开发系统
     * <li>BACKUPDCDBINST
     * <P>
     * 备份应用中心数据库实例
     * <li>RESTOREDCDBINST
     * <P>
     * 恢复应用中心数据库实例
     * <li>IMPPFSTYLE
     * <P>
     * 导入前端样式模板
     * <li>IMPSFSTYLEVER
     * <P>
     * 导入后台服务框架模板
     * <li>BACKUPDEVSLNSYS
     * <P>
     * 备份开发系统
     * <li>RESTOREDEVSLNSYS
     * <P>
     * 恢复开发系统
     * <li>ONLINEDEVSLNSYS
     * <P>
     * 连线开发系统
     * <li>OFFLINEDEVSLNSYS
     * <P>
     * 离线开发系统
     * <li>CREATEDEVSLNSYS2
     * <P>
     * 建立开发系统分支
     * <li>CREATEDEVSLNSYSDEPINST
     * <P>
     * 建立系统部署模型仓库
     * <li>EXPORTDEVSYSMODEL
     * <P>
     * 导出系统模型
     * <li>IMPORTDEVSYSMODEL
     * <P>
     * 导入系统模型
     * <li>UPGRATEDEVSYSMODEL
     * <P>
     * 升级模型仓库
     * <li>WORKSPACEACTION
     * <P>
     * 中心生产线作业
     * <li>IBIZCENTRAL
     * <P>
     * iBizCentral（中台）
     * <li>USER
     * <P>
     * 用户自定义
     * </ul>     
     */
    public static enum DCBKTaskType{
        PACKDEVSLNSYS("PACKDEVSLNSYS", "打包开发系统")
        ,CREATEDEVSLNSYS("CREATEDEVSLNSYS", "建立开发系统")
        ,BACKUPDCDBINST("BACKUPDCDBINST", "备份应用中心数据库实例")
        ,RESTOREDCDBINST("RESTOREDCDBINST", "恢复应用中心数据库实例")
        ,IMPPFSTYLE("IMPPFSTYLE", "导入前端样式模板")
        ,IMPSFSTYLEVER("IMPSFSTYLEVER", "导入后台服务框架模板")
        ,BACKUPDEVSLNSYS("BACKUPDEVSLNSYS", "备份开发系统")
        ,RESTOREDEVSLNSYS("RESTOREDEVSLNSYS", "恢复开发系统")
        ,ONLINEDEVSLNSYS("ONLINEDEVSLNSYS", "连线开发系统")
        ,OFFLINEDEVSLNSYS("OFFLINEDEVSLNSYS", "离线开发系统")
        ,CREATEDEVSLNSYS2("CREATEDEVSLNSYS2", "建立开发系统分支")
        ,CREATEDEVSLNSYSDEPINST("CREATEDEVSLNSYSDEPINST", "建立系统部署模型仓库")
        ,EXPORTDEVSYSMODEL("EXPORTDEVSYSMODEL", "导出系统模型")
        ,IMPORTDEVSYSMODEL("IMPORTDEVSYSMODEL", "导入系统模型")
        ,UPGRATEDEVSYSMODEL("UPGRATEDEVSYSMODEL", "升级模型仓库")
        ,WORKSPACEACTION("WORKSPACEACTION", "中心生产线作业")
        ,IBIZCENTRAL("IBIZCENTRAL", "iBizCentral（中台）")
        ,USER("USER", "用户自定义")
;
           
        public final String text;
        public final String value;
        
        private DCBKTaskType(String value, String text){
            this.value = value;
            this.text = text;
        }

        public static DCBKTaskType from(String value){
            switch(value){
                case "PACKDEVSLNSYS":
                    return PACKDEVSLNSYS;
                case "CREATEDEVSLNSYS":
                    return CREATEDEVSLNSYS;
                case "BACKUPDCDBINST":
                    return BACKUPDCDBINST;
                case "RESTOREDCDBINST":
                    return RESTOREDCDBINST;
                case "IMPPFSTYLE":
                    return IMPPFSTYLE;
                case "IMPSFSTYLEVER":
                    return IMPSFSTYLEVER;
                case "BACKUPDEVSLNSYS":
                    return BACKUPDEVSLNSYS;
                case "RESTOREDEVSLNSYS":
                    return RESTOREDEVSLNSYS;
                case "ONLINEDEVSLNSYS":
                    return ONLINEDEVSLNSYS;
                case "OFFLINEDEVSLNSYS":
                    return OFFLINEDEVSLNSYS;
                case "CREATEDEVSLNSYS2":
                    return CREATEDEVSLNSYS2;
                case "CREATEDEVSLNSYSDEPINST":
                    return CREATEDEVSLNSYSDEPINST;
                case "EXPORTDEVSYSMODEL":
                    return EXPORTDEVSYSMODEL;
                case "IMPORTDEVSYSMODEL":
                    return IMPORTDEVSYSMODEL;
                case "UPGRATEDEVSYSMODEL":
                    return UPGRATEDEVSYSMODEL;
                case "WORKSPACEACTION":
                    return WORKSPACEACTION;
                case "IBIZCENTRAL":
                    return IBIZCENTRAL;
                case "USER":
                    return USER;
                default:
                    throw new RuntimeException(String.format("无法识别的值[%1$s]",value));
            }
        }
    }

}