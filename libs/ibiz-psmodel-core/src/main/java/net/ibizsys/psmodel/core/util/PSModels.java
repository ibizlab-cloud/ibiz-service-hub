package net.ibizsys.psmodel.core.util;

/**
 * 系统模型集合
 */
public class PSModels {

    /**
     * 系统 [PSSYSTEM]
     * 开发系统的顶级模型对象，定义系统的主信息及全局默认的表现或处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSystem}
     */
    public final static String PSSYSTEM = "PSSYSTEM";
    /**
     * 系统模块 [PSMODULE]
     * 系统的功能模块模型，提供了按照业务或是功能对模型进行分组的能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSModule}
     */
    public final static String PSMODULE = "PSMODULE";
    /**
     * 实体 [PSDATAENTITY]
     * 系统的业务对象模型，实体中包括了属性、关系等基本数据模型；还包括了处理逻辑；界面表现；访问控制等功能模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDataEntity}
     */
    public final static String PSDATAENTITY = "PSDATAENTITY";
    /**
     * 实体属性 [PSDEFIELD]
     * 实体属性的模型，定义属性的基本信息，包括了类型、基础值规则、关系引用、值处理等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEField}
     */
    public final static String PSDEFIELD = "PSDEFIELD";
    /**
     * 实体关系 [PSDER]
     * 实体的关系模型，它用于定义实体之间的关系。关系类型包括一对一关系、一对多关系，面向对象的继承关系、虚拟继承关系、索引关系等以及自定义关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDER}
     */
    public final static String PSDER = "PSDER";
    /**
     * 界面处理对象 [PSACHANDLER]
     * 界面处理配置模型，定义界面部件或视图的请求响应处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSACHandler}
     */
    public final static String PSACHANDLER = "PSACHANDLER";
    /**
     * 界面处理对象行为 [PSACHANDLERACTION]
     * 界面处理对象的行为配置模型，定义界面请求行为及相应的处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSACHandlerAction}
     */
    public final static String PSACHANDLERACTION = "PSACHANDLERACTION";
    /**
     * 应用实体关系 [PSAPPDERS]
     * 前端应用实体的关系模型，定义应用实体之间的关系及相应的处理信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppDERS}
     */
    public final static String PSAPPDERS = "PSAPPDERS";
    /**
     * 应用实体视图 [PSAPPDEVIEW]
     * 应用实体视图模型，定义加入到应用的实体视图，应用实体视图逻辑在未定义情况下默认取实体视图配置。注意：每个实体视图在同一个应用中只能被添加一次
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppDEView}
     */
    public final static String PSAPPDEVIEW = "PSAPPDEVIEW";
    /**
     * 应用动态实体视图 [PSAPPDYNADEVIEW]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppDynaDEView}
     */
    public final static String PSAPPDYNADEVIEW = "PSAPPDYNADEVIEW";
    /**
     * 应用功能 [PSAPPFUNC]
     * 应用功能模型，定义前端应用提供的操作功能，一般绑定到应用菜单提供操作入口
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppFunc}
     */
    public final static String PSAPPFUNC = "PSAPPFUNC";
    /**
     * 应用首页视图 [PSAPPINDEXVIEW]
     * 应用首页视图模型，应用首页视图一般作为应用的起始视图，加载主菜单，提供应用功能的入口
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppIndexView}
     */
    public final static String PSAPPINDEXVIEW = "PSAPPINDEXVIEW";
    /**
     * 应用多语言 [PSAPPLAN]
     * 应用多语言模型，定义应用程序支持的多语言信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppLan}
     */
    public final static String PSAPPLAN = "PSAPPLAN";
    /**
     * 应用实体 [PSAPPDATAENTITY]
     * 前端应用实体模型，系统实体添加到前端应用形成应用实体，同一个系统实体可以被多次添加到同一个应用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppDataEntity}
     */
    public final static String PSAPPDATAENTITY = "PSAPPDATAENTITY";
    /**
     * 应用逻辑 [PSAPPLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppLogic}
     */
    public final static String PSAPPLOGIC = "PSAPPLOGIC";
    /**
     * 应用菜单 [PSAPPMENU]
     * 应用菜单模型，定义应用菜单部件的界面及处理逻辑。应用菜单包含多类型、多层级的菜单项模型。应用菜单及菜单项都支持布局定义，除了传统的菜单样式，还支持卡片视图等样式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppMenu}
     */
    public final static String PSAPPMENU = "PSAPPMENU";
    /**
     * 应用菜单项 [PSAPPMENUITEM]
     * 应用菜单项模型，支持菜单项、直接内容项等类型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppMenuItem}
     */
    public final static String PSAPPMENUITEM = "PSAPPMENUITEM";
    /**
     * 应用菜单逻辑 [PSAPPMENULOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppMenuLogic}
     */
    public final static String PSAPPMENULOGIC = "PSAPPMENULOGIC";
    /**
     * 应用模块 [PSAPPMODULE]
     * 前端应用模块模型，定义前端应用中的功能模块，为应用实体及应用视图提供分组支持
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppModule}
     */
    public final static String PSAPPMODULE = "PSAPPMODULE";
    /**
     * 应用预置视图 [PSAPPPDTVIEW]
     * 应用预置视图模型，定义系统预置视图到前端应用的实际映射
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPDTView}
     */
    public final static String PSAPPPDTVIEW = "PSAPPPDTVIEW";
    /**
     * 应用前端插件 [PSAPPPFPLUGIN]
     * 应用前端插件模型，手动指定应用中需要加载的前端插件模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPFPlugin}
     */
    public final static String PSAPPPFPLUGIN = "PSAPPPFPLUGIN";
    /**
     * 应用门户视图部件 [PSAPPPVPART]
     * 应用数据看板视图部件成员模型，定义数据看板成员的界面表现及处理逻辑。支持多种类型，支持多层结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPVPart}
     */
    public final static String PSAPPPVPART = "PSAPPPVPART";
    /**
     * 应用面板视图 [PSAPPPANELVIEW]
     * 应用面板视图模型，应用面板视图内置面板部件，提供自由布局的多部件呈现能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPanelView}
     */
    public final static String PSAPPPANELVIEW = "PSAPPPANELVIEW";
    /**
     * 应用组件包 [PSAPPPKG]
     * 前端应用组件包模型，定义前端应用额外加载的组件包
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPkg}
     */
    public final static String PSAPPPKG = "PSAPPPKG";
    /**
     * 应用看板视图 [PSAPPPORTALVIEW]
     * 应用数据看板视图模型，应用数据看板视图内置数据看板部件，提供应用级别的数据看板展现能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPortalView}
     */
    public final static String PSAPPPORTALVIEW = "PSAPPPORTALVIEW";
    /**
     * 应用门户部件 [PSAPPPORTLET]
     * 应用门户部件模型，定义应用中支持动态数据看板使用的门户部件
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppPortlet}
     */
    public final static String PSAPPPORTLET = "PSAPPPORTLET";
    /**
     * 应用资源 [PSAPPRESOURCE]
     * 前端应用资源模型，定义应用预置的资源内容。应用资源属于前端应用的通用内容定义模型，一般在模板中通过资源标记获取使用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppResource}
     */
    public final static String PSAPPRESOURCE = "PSAPPRESOURCE";
    /**
     * 应用故事板项目 [PSAPPSBITEM]
     * 应用故事板项目模型，定义应用故事板的项成员
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppSBItem}
     */
    public final static String PSAPPSBITEM = "PSAPPSBITEM";
    /**
     * 应用故事板项目关系 [PSAPPSBITEMRS]
     * 应用故事板项目关系模型，定义应用故事板项成员的迁移关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppSBItemRS}
     */
    public final static String PSAPPSBITEMRS = "PSAPPSBITEMRS";
    /**
     * 应用故事板 [PSAPPSTORYBOARD]
     * 应用故事板模型，定义应用中视图的迁移信息，提供应用及视图的全局关联展示场景
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppStoryBoard}
     */
    public final static String PSAPPSTORYBOARD = "PSAPPSTORYBOARD";
    /**
     * 应用标题栏 [PSAPPTITLEBAR]
     * 应用标题栏部件模型，定义前端应用全局的标题栏部件对象，在应用视图中可选择使用的标题栏
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppTitleBar}
     */
    public final static String PSAPPTITLEBAR = "PSAPPTITLEBAR";
    /**
     * 云应用系统类型 [PSAPPTYPE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppType}
     */
    public final static String PSAPPTYPE = "PSAPPTYPE";
    /**
     * 应用界面模式 [PSAPPUISTYLE]
     * 应用界面模式模型，定义界面模式支持定义前端模板、模板样式及应用界面的相关参数。界面模式就是前端应用的界面构型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppUIStyle}
     */
    public final static String PSAPPUISTYLE = "PSAPPUISTYLE";
    /**
     * 应用界面主题 [PSAPPUITHEME]
     * 应用界面主题模型，定义前端应用支持的界面主题信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppUITheme}
     */
    public final static String PSAPPUITHEME = "PSAPPUITHEME";
    /**
     * 应用用户模式 [PSAPPUSERMODE]
     * 应用用户模式模型，定义应用支持的用户模式，包括默认视图、默认应用菜单等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppUserMode}
     */
    public final static String PSAPPUSERMODE = "PSAPPUSERMODE";
    /**
     * 应用功能组件 [PSAPPUTIL]
     * 应用的功能组件配置模型，定义指定应用功能配置参数及相关的实体信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppUtil}
     */
    public final static String PSAPPUTIL = "PSAPPUTIL";
    /**
     * 应用功能页面 [PSAPPUTILPAGE]
     * 应用功能页面模型，定义前端应用中使用的功能页面（路径）
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppUtilPage}
     */
    public final static String PSAPPUTILPAGE = "PSAPPUTILPAGE";
    /**
     * 应用功能视图 [PSAPPUTILVIEW]
     * 应用功能视图模型，定义应用的预置功能视图
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppUtilView}
     */
    public final static String PSAPPUTILVIEW = "PSAPPUTILVIEW";
    /**
     * 应用视图 [PSAPPVIEW]
     * 前端应用的基本视图对象模型，具体类型的视图模型都必须继承该对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppView}
     */
    public final static String PSAPPVIEW = "PSAPPVIEW";
    /**
     * 应用工作流 [PSAPPWF]
     * 应用工作流模型，定义前端应用加载的工作流
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppWF}
     */
    public final static String PSAPPWF = "PSAPPWF";
    /**
     * 应用工作流版本 [PSAPPWFVER]
     * 应用工作流版本模型，定义前端应用加载的工作流版本
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSAppWFVer}
     */
    public final static String PSAPPWFVER = "PSAPPWFVER";
    /**
     * 代码表项 [PSCODEITEM]
     * 系统的代码表项模型，支持定义层级代码项
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCodeItem}
     */
    public final static String PSCODEITEM = "PSCODEITEM";
    /**
     * 系统代码表 [PSCODELIST]
     * 系统的代码表模型，定义静态或动态的数据字典
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCodeList}
     */
    public final static String PSCODELIST = "PSCODELIST";
    /**
     * 云平台核心产品 [PSCOREPRD]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCorePrd}
     */
    public final static String PSCOREPRD = "PSCOREPRD";
    /**
     * 云平台核心产品分类 [PSCOREPRDCAT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCorePrdCat}
     */
    public final static String PSCOREPRDCAT = "PSCOREPRDCAT";
    /**
     * 云平台核心产品功能 [PSCOREPRDFUNC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCorePrdFunc}
     */
    public final static String PSCOREPRDFUNC = "PSCOREPRDFUNC";
    /**
     * 核心产品安装日志 [PSCOREPRDINSTLOG]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCorePrdInstLog}
     */
    public final static String PSCOREPRDINSTLOG = "PSCOREPRDINSTLOG";
    /**
     * 云平台核心产品版本 [PSCOREPRDVER]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCorePrdVer}
     */
    public final static String PSCOREPRDVER = "PSCOREPRDVER";
    /**
     * 部件逻辑组 [PSCTRLLOGICGROUP]
     * 部件逻辑组模型，包含一个或多个的的逻辑成员，界面部件通过挂接逻辑组增强处理能力。部件逻辑组按照部件类型、处理模式进行抽象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCtrlLogicGroup}
     */
    public final static String PSCTRLLOGICGROUP = "PSCTRLLOGICGROUP";
    /**
     * 部件逻辑组成员 [PSCTRLLOGICGRPDETAIL]
     * 部件逻辑组成员模型，定义具体的逻辑配置，包括了触发类型，触发逻辑等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCtrlLogicGrpDetail}
     */
    public final static String PSCTRLLOGICGRPDETAIL = "PSCTRLLOGICGRPDETAIL";
    /**
     * 部件消息 [PSCTRLMSG]
     * 界面部件的消息定义模型，提供定制界面部件显示及交互信息的能力。支持两种定义方式：（1）在消息模型中整体定义（2）在消息项模型中逐项定义
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCtrlMsg}
     */
    public final static String PSCTRLMSG = "PSCTRLMSG";
    /**
     * 部件消息项 [PSCTRLMSGITEM]
     * 部件消息项模型提供更加详细的消息定义能力，包括了多语言、动态消息显示时长等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSCtrlMsgItem}
     */
    public final static String PSCTRLMSGITEM = "PSCTRLMSGITEM";
    /**
     * 数据库值操作符 [PSDBVALUEOP]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDBValueOP}
     */
    public final static String PSDBVALUEOP = "PSDBVALUEOP";
    /**
     * 实体自填模式 [PSDEACMODE]
     * 实体自动填充模式模型，定义自填填充的数据项、界面表现等逻辑。数据项除了显示文本及值这两个基础项，还可通过自填模式数据项模型定义其它的数据项
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEACMode}
     */
    public final static String PSDEACMODE = "PSDEACMODE";
    /**
     * 实体自填数据项 [PSDEACMODEITEM]
     * 实体自填模式的数据项模型，定义取值属性、值格式化等逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEACModeItem}
     */
    public final static String PSDEACMODEITEM = "PSDEACMODEITEM";
    /**
     * 实体行为组成员 [PSDEAGDETAIL]
     * 实体行为组成员模型，定义行为组包含的实体行为或实体数据集对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEAGDetail}
     */
    public final static String PSDEAGDETAIL = "PSDEAGDETAIL";
    /**
     * 实体行为 [PSDEACTION]
     * 实体的行为模型，定义实体对外提供的操作能力。实体行为提供内置、处理逻辑及自定义等类型，支持定义行为参数及调用的检查规则，同时支持附加内外部处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEAction}
     */
    public final static String PSDEACTION = "PSDEACTION";
    /**
     * 实体行为组 [PSDEACTIONGROUP]
     * 实体行为组模型，在所在实体中定义包含实体行为、数据集的组对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEActionGroup}
     */
    public final static String PSDEACTIONGROUP = "PSDEACTIONGROUP";
    /**
     * 实体行为附加逻辑 [PSDEACTIONLOGIC]
     * 实体行为附加逻辑模型，支持在实体行为上以不同模式附加内部处理逻辑或外部行为等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEActionLogic}
     */
    public final static String PSDEACTIONLOGIC = "PSDEACTIONLOGIC";
    /**
     * 实体行为参数 [PSDEACTIONPARAM]
     * 实体行为参数模型，定义行为的调用参数以及参数的取值等逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEActionParam}
     */
    public final static String PSDEACTIONPARAM = "PSDEACTIONPARAM";
    /**
     * 实体行为模板 [PSDEACTIONTEMPL]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEActionTempl}
     */
    public final static String PSDEACTIONTEMPL = "PSDEACTIONTEMPL";
    /**
     * 实体行为值规则 [PSDEACTIONVR]
     * 实体行为值规则模型，定义行为调用参数的检查逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEActionVR}
     */
    public final static String PSDEACTIONVR = "PSDEACTIONVR";
    /**
     * 实体图表 [PSDECHART]
     * 实体图表部件模型，定义部件的表现及处理逻辑，包括图表坐标系及数据序列。图表模型参考ECharts，相关的编码值可参考ECharts说明
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEChart}
     */
    public final static String PSDECHART = "PSDECHART";
    /**
     * 实体图表坐标轴 [PSDECHARTAXES]
     * 实体图表部件的坐标轴模型，定义坐标轴的类型，刻度等逻辑，不同类型的坐标轴放置在不同的坐标系中
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEChartAxes}
     */
    public final static String PSDECHARTAXES = "PSDECHARTAXES";
    /**
     * 实体图表逻辑 [PSDECHARTLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEChartLogic}
     */
    public final static String PSDECHARTLOGIC = "PSDECHARTLOGIC";
    /**
     * 实体图表数据序列 [PSDECHARTPARAM]
     * 实体图表部件的数据序列模型，定义绘制的图形，投射的坐标系及其它的表现及处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEChartParam}
     */
    public final static String PSDECHARTPARAM = "PSDECHARTPARAM";
    /**
     * 实体数据库配置 [PSDEDBCFG]
     * 实体的数据库配置模型，支持定义实体在具体数据库类型使用对象、发布开关等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDBCfg}
     */
    public final static String PSDEDBCFG = "PSDEDBCFG";
    /**
     * 实体数据库索引属性 [PSDEDBIDXFIELD]
     * 实体数据库索引的属性模型，将实体属性加入到数据库索引对象中
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDBIdxField}
     */
    public final static String PSDEDBIDXFIELD = "PSDEDBIDXFIELD";
    /**
     * 实体数据库索引 [PSDEDBINDEX]
     * 实体数据库索引模型，支持定义索引类型、方向等参数，包含一个或多个的索引属性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDBIndex}
     */
    public final static String PSDEDBINDEX = "PSDEDBINDEX";
    /**
     * 实体数据查询代码 [PSDEDQCODE]
     * 实体数据查询代码模型，存放分析引擎对数据查询模型编译后的代码，支持自定义。查询代码模型包含表达式及条件子模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDQCode}
     */
    public final static String PSDEDQCODE = "PSDEDQCODE";
    /**
     * 实体查询代码条件 [PSDEDQCODECOND]
     * 实体数据查询代码条件模型，存放模型引擎对数据查询模型编译后的条件代码，查询代码与条件代码分开定义，使用时再进行拼装，支持运行时的查询条件附加。
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDQCodeCond}
     */
    public final static String PSDEDQCODECOND = "PSDEDQCODECOND";
    /**
     * 实体查询代码表达式 [PSDEDQCODEEXP]
     * 查询代码表达式模型，存放模型引擎对数据查询模型编译后的属性表达式，在查询代码上附加属性查询条件必须知道属性的查询表达式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDQCodeExp}
     */
    public final static String PSDEDQCODEEXP = "PSDEDQCODEEXP";
    /**
     * 实体数据查询条件 [PSDEDQCOND]
     * 查询连接条件模型，支持组合、属性单项、自定义及预置条件类型，支持层级结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDQCond}
     */
    public final static String PSDEDQCOND = "PSDEDQCOND";
    /**
     * 实体数据查询连接 [PSDEDQJOIN]
     * 查询连接模型定义数据查询的连接，支持多种连接方式：相关N:1（INNER JOIN）、存在1:N（EXISTS (SELECT)）等。
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDQJoin}
     */
    public final static String PSDEDQJOIN = "PSDEDQJOIN";
    /**
     * 实体界面组成员 [PSDEDRDETAIL]
     * 实体界面组成员模型，将实体关系界面或系统预定义视图添加到实体界面组，并定义分组、显示次序等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDRDetail}
     */
    public final static String PSDEDRDETAIL = "PSDEDRDETAIL";
    /**
     * 实体关系界面分组 [PSDEDRGROUP]
     * 实体关系界面分组模型，定义实体的关系界面的分组信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDRGroup}
     */
    public final static String PSDEDRGROUP = "PSDEDRGROUP";
    /**
     * 实体关系界面 [PSDEDRITEM]
     * 实体的关系界面模型，定义指定关系的相关数据的展现界面
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDRItem}
     */
    public final static String PSDEDRITEM = "PSDEDRITEM";
    /**
     * 实体数据集合查询 [PSDEDSDQ]
     * 实体数据集合与数据查询的连接模型，定义数据集合包含的数据查询
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDSDQ}
     */
    public final static String PSDEDSDQ = "PSDEDSDQ";
    /**
     * 实体数据集分组参数 [PSDEDSGRPPARAM]
     * 实体数据集合启用分组（GROUP）是配套的分组模型，定义数据分组及聚合操作逻辑等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDSGrpParam}
     */
    public final static String PSDEDSGRPPARAM = "PSDEDSGRPPARAM";
    /**
     * 实体数据集合参数 [PSDEDSPARAM]
     * 实体数据集参数模型，定义行为的调用参数以及参数的取值等逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDSParam}
     */
    public final static String PSDEDSPARAM = "PSDEDSPARAM";
    /**
     * 实体异步处理队列 [PSDEDTSQUEUE]
     * 实体分布事务队列模型，定义支持二阶段提交的分布式事务的队列及处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDTSQueue}
     */
    public final static String PSDEDTSQUEUE = "PSDEDTSQUEUE";
    /**
     * 实体数据导出 [PSDEDATAEXP]
     * 实体的数据导出模型，为实体提供多模式的数据导出功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataExp}
     */
    public final static String PSDEDATAEXP = "PSDEDATAEXP";
    /**
     * 实体数据导入 [PSDEDATAIMP]
     * 实体的数据导入定义模型，为实体提供多模式的数据导入功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataImp}
     */
    public final static String PSDEDATAIMP = "PSDEDATAIMP";
    /**
     * 实体数据导入项 [PSDEDATAIMPITEM]
     * 实体数据导入成员项模型，定义相关的属性、默认值等导入处理配置信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataImpItem}
     */
    public final static String PSDEDATAIMPITEM = "PSDEDATAIMPITEM";
    /**
     * 实体数据查询 [PSDEDATAQUERY]
     * 实体数据查询模型，定义实体的原子数据查询模型。数据查询支持定义查询连接及条件，数据查询可独立使用或被数据集引用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataQuery}
     */
    public final static String PSDEDATAQUERY = "PSDEDATAQUERY";
    /**
     * 实体关系界面组 [PSDEDATARELATION]
     * 实体的关系界面组模型，包含一个或多个实体的关系界面。关系界面组体现了业务和技术表现的分离和统一，关系界面组可被视图部件直接使用，调整关系界面组成员将自动对关系界面进行调整。
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataRelation}
     */
    public final static String PSDEDATARELATION = "PSDEDATARELATION";
    /**
     * 实体数据集合 [PSDEDATASET]
     * 实体的数据集模型，定义实体对外提供的数据集查询能力。数据集合支持不同的类型：联合一个或多个数据查询、从代码表取数或其它预定义模式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataSet}
     */
    public final static String PSDEDATASET = "PSDEDATASET";
    /**
     * 实体数据同步 [PSDEDATASYNC]
     * 实体数据同步模型，定义实体数据的同步方向及同步代理，也包括了数据的导入导出处理等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataSync}
     */
    public final static String PSDEDATASYNC = "PSDEDATASYNC";
    /**
     * 实体卡片视图部件 [PSDEDATAVIEW]
     * 实体卡片视图部件模型，定义容器、卡片及分组项的界面逻辑及数据项等处理逻辑，一般需要指定卡片的布局面板。卡片视图支持启用看板（KanBan）模式，配置卡片在分组间移动的逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataView}
     */
    public final static String PSDEDATAVIEW = "PSDEDATAVIEW";
    /**
     * 卡片视图部件逻辑 [PSDEDATAVIEWLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDataViewLogic}
     */
    public final static String PSDEDATAVIEWLOGIC = "PSDEDATAVIEWLOGIC";
    /**
     * 表单成员逻辑 [PSDEFDLOGIC]
     * 实体表单成员的动态逻辑模型。（1）为成员提供动态的显示隐藏、启用禁用及空输入控制，支持组合、单项条件类型，支持层级逻辑结构（2）事件的响应代码
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFDLogic}
     */
    public final static String PSDEFDLOGIC = "PSDEFDLOGIC";
    /**
     * 属性数据库列配置 [PSDEFDTCOL]
     * 实体属性的数据库列配置模型，支持属性针对特定数据库类型的进行额外配置
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFDTCol}
     */
    public final static String PSDEFDTCOL = "PSDEFDTCOL";
    /**
     * 实体属性组 [PSDEFGROUP]
     * 实体属性组模型，组合所在实体的属性对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFGroup}
     */
    public final static String PSDEFGROUP = "PSDEFGROUP";
    /**
     * 属性组成员 [PSDEFGROUPDETAIL]
     * 实体属性组成员模型，定义属性组包含的属性对象，属性组成员还提供属性参数的重新定义能力（未定义时使用属性的默认配置）
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFGroupDetail}
     */
    public final static String PSDEFGROUPDETAIL = "PSDEFGROUPDETAIL";
    /**
     * 表单项更新成员 [PSDEFIUDETAIL]
     * 实体表单项更新成员模型，定义了更新内容明细
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFIUDetail}
     */
    public final static String PSDEFIUDETAIL = "PSDEFIUDETAIL";
    /**
     * 实体表单项更新 [PSDEFIUPDATE]
     * 实体表单项更新模型定义了局部更新表单的模式，包括了调用的行为及更新的明细内容
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFIUpdate}
     */
    public final static String PSDEFIUPDATE = "PSDEFIUPDATE";
    /**
     * 实体表单项值规则 [PSDEFIVR]
     * 实体表单项的值规则模型，定义表单项的值校验配置，包括了校验方式，校验规则等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFIVR}
     */
    public final static String PSDEFIVR = "PSDEFIVR";
    /**
     * 实体属性输入提示 [PSDEFINPUTTIP]
     * 属性输入提示信息模型，定义属性在输入时提供的提示信息，支持静态及来至输入提示集合的动态信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFInputTip}
     */
    public final static String PSDEFINPUTTIP = "PSDEFINPUTTIP";
    /**
     * 实体属性输入提示集合 [PSDEFINPUTTIPSET]
     * 实体属性输入提示集模型，定义动态的属性输入信息存储对象，包括了信息存储的结果集对象，相关内容存储的属性等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFInputTipSet}
     */
    public final static String PSDEFINPUTTIPSET = "PSDEFINPUTTIPSET";
    /**
     * 实体属性搜索模式 [PSDEFSFITEM]
     * 实体属性的搜索模式模型，定义属性支持的搜索模式以及相关的界面配置等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFSFItem}
     */
    public final static String PSDEFSFITEM = "PSDEFSFITEM";
    /**
     * 实体属性类型 [PSDEFTYPE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFType}
     */
    public final static String PSDEFTYPE = "PSDEFTYPE";
    /**
     * 实体属性界面配置 [PSDEFUIMODE]
     * 实体属性的界面模式模型，属性在桌面端或移动端会存在不同的表现样式，在不同业务场景甚至不同的前端应用中也会有不同的展现需求。属性界面模式就是将属性的表现需求进行归纳，以默认或显式的方式进行使用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFUIMode}
     */
    public final static String PSDEFUIMODE = "PSDEFUIMODE";
    /**
     * 属性值规则项 [PSDEFVRCOND]
     * 属性值规则条件模型，支持组合、预置的单项检查类型，支持层级结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFVRCond}
     */
    public final static String PSDEFVRCOND = "PSDEFVRCOND";
    /**
     * 实体属性值规则 [PSDEFVALUERULE]
     * 属性值规则模型，支持定义针对实体属性的值校验规则，值规格模型包含多种类型、支持层级结构的值规则条件项，满足定义复杂规则的需求。值规格可以被默认使用，也可以被显式加载使用，比如表单、表格行编辑、服务接口等输入校验。
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFValueRule}
     */
    public final static String PSDEFVALUERULE = "PSDEFVALUERULE";
    /**
     * 实体表单 [PSDEFORM]
     * 实体表单部件模型，基于数据实体构建，专注于处理与特定实体相关的数据输入和编辑操作。支持编辑表单及搜索表单两种类型。
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEForm}
     */
    public final static String PSDEFORM = "PSDEFORM";
    /**
     * 表单成员 [PSDEFORMDETAIL]
     * 实体表单成员模型，提供多种成员类型。支持定义成员的子成员（多层）、成员的动态逻辑等。为实现界面与业务逻辑的解耦，属性界面模式（PSDEFUIMODE）支持定义属性的界面表现模式，覆盖编辑、展示、移动端适配等场景；属性搜索模式（PSDEFSFITEM）则定义属性搜索条件输入界面及处理模式，所以表单项大部分场景无需专门配置参数（由预置模式提供）
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFormDetail}
     */
    public final static String PSDEFORMDETAIL = "PSDEFORMDETAIL";
    /**
     * 实体表单逻辑 [PSDEFORMLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFormLogic}
     */
    public final static String PSDEFORMLOGIC = "PSDEFORMLOGIC";
    /**
     * 实体表单引用 [PSDEFORMRF]
     * 实体表单直接表单部件引用模型，支持引入其它表单或预留运行时的动态表单占位
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEFormRF}
     */
    public final static String PSDEFORMRF = "PSDEFORMRF";
    /**
     * 表格编辑项更新成员 [PSDEGEIUDETAIL]
     * 实体数据表格编辑项更新明细模型，定义了编辑项更新的更新内容明细
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGEIUDetail}
     */
    public final static String PSDEGEIUDETAIL = "PSDEGEIUDETAIL";
    /**
     * 表格编辑项更新模式 [PSDEGEIUPDATE]
     * 实体数据表格编辑项更新模型，定义了局部更新数据表格的模式，包括了调用的行为及更新的明细内容
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGEIUpdate}
     */
    public final static String PSDEGEIUPDATE = "PSDEGEIUPDATE";
    /**
     * 表格编辑项值规则 [PSDEGEIVR]
     * 实体数据表格编辑项的值规则模型，定义编辑项的值校验配置，包括了校验方式，校验规则等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGEIVR}
     */
    public final static String PSDEGEIVR = "PSDEGEIVR";
    /**
     * 实体表格 [PSDEGRID]
     * 实体数据表格部件模型，数据表格包含表格列、表格编辑项更新等模型对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGrid}
     */
    public final static String PSDEGRID = "PSDEGRID";
    /**
     * 表格列 [PSDEGRIDCOL]
     * 实体数据表格列模型，提供多种列类型。支持定义分组列（多层）、列编辑项的动态逻辑等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGridCol}
     */
    public final static String PSDEGRIDCOL = "PSDEGRIDCOL";
    /**
     * 表格逻辑 [PSDEGRIDLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGridLogic}
     */
    public final static String PSDEGRIDLOGIC = "PSDEGRIDLOGIC";
    /**
     * 实体组 [PSDEGROUP]
     * 实体组模型，定义包含实体的组对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGroup}
     */
    public final static String PSDEGROUP = "PSDEGROUP";
    /**
     * 实体组成员 [PSDEGROUPDETAIL]
     * 实体组成员模型，定义实体组包含的实体对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEGroupDetail}
     */
    public final static String PSDEGROUPDETAIL = "PSDEGROUPDETAIL";
    /**
     * 云实体查询连接类型 [PSDEJOINTYPE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEJoinType}
     */
    public final static String PSDEJOINTYPE = "PSDEJOINTYPE";
    /**
     * 实体处理逻辑连接条件 [PSDELLCOND]
     * 实体处理逻辑中的处理节点连接条件模型，支持组合、单项条件类型，支持层级结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDELLCond}
     */
    public final static String PSDELLCOND = "PSDELLCOND";
    /**
     * 实体处理逻辑节点参数 [PSDELNPARAM]
     * 实体处理逻辑节点参数模型，为处理节点提供动态参数定义能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDELNParam}
     */
    public final static String PSDELNPARAM = "PSDELNPARAM";
    /**
     * 实体列表 [PSDELIST]
     * 实体数据列表部件模型，定义容器、列表项及分组项的界面逻辑及数据项等处理逻辑，一般需要指定列表项的布局面板。数据列表支持定义显示内容项，表现上类似数据表格。数据列表还作为移动端的通用多数据部件模型，支持定义左滑、右滑界面行为组等移动端特征逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEList}
     */
    public final static String PSDELIST = "PSDELIST";
    /**
     * 实体多数据部件项 [PSDELISTITEM]
     * 实体多数据部件数据项模型，为数据列表及卡片视图等多数据部件提供数据项支持，定义取值属性、值格式化等逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEListItem}
     */
    public final static String PSDELISTITEM = "PSDELISTITEM";
    /**
     * 实体列表逻辑 [PSDELISTLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEListLogic}
     */
    public final static String PSDELISTLOGIC = "PSDELISTLOGIC";
    /**
     * 实体处理逻辑 [PSDELOGIC]
     * 实体的处理逻辑模型，提供面向业务逻辑、状态迁移、数据流及界面交互的动态逻辑定义能力。处理逻辑包含逻辑参数、处理节点与处理连接等主要模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDELogic}
     */
    public final static String PSDELOGIC = "PSDELOGIC";
    /**
     * 实体处理逻辑连接 [PSDELOGICLINK]
     * 实体处理逻辑中的处理节点连接模型，区分【业务处理逻辑】与【界面处理逻辑】
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDELogicLink}
     */
    public final static String PSDELOGICLINK = "PSDELOGICLINK";
    /**
     * 实体处理逻辑节点 [PSDELOGICNODE]
     * 实体处理逻辑中的处理节点模型，不同类型的处理节点提供不同的功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDELogicNode}
     */
    public final static String PSDELOGICNODE = "PSDELOGICNODE";
    /**
     * 实体逻辑参数 [PSDELOGICPARAM]
     * 实体处理逻辑的参数模型，定义在逻辑处理中需要的参数，包括了默认的上下文变量，处理过程中的临时变量等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDELogicParam}
     */
    public final static String PSDELOGICPARAM = "PSDELOGICPARAM";
    /**
     * 实体主状态操作 [PSDEMSACTION]
     * 主状态行为控制模型，定义主状态控制的实体行为
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMSAction}
     */
    public final static String PSDEMSACTION = "PSDEMSACTION";
    /**
     * 实体主状态属性 [PSDEMSFIELD]
     * 主状态属性控制模型，定义主状态控制的实体属性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMSField}
     */
    public final static String PSDEMSFIELD = "PSDEMSFIELD";
    /**
     * 实体主状态操作标识 [PSDEMSOPPRIV]
     * 主状态操作标识控制模型，定义主状态控制的实体数据操作标识
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMSOPPriv}
     */
    public final static String PSDEMSOPPRIV = "PSDEMSOPPRIV";
    /**
     * 实体主状态 [PSDEMAINSTATE]
     * 实体主状态控制模型，定义最多由三个实体属性值组成的主状态标记、相应的行为及数据操作标识控制逻辑。主状态控制逻辑是实体的基础控制逻辑，超越权限控制，如指定状态数据拒绝删除则不管是否具备权限都将无法对数据进行删除操作
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMainState}
     */
    public final static String PSDEMAINSTATE = "PSDEMAINSTATE";
    /**
     * 实体主状态关系 [PSDEMAINSTATERS]
     * 实体主状态关系模型，定义主状态之间的迁移关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMainStateRS}
     */
    public final static String PSDEMAINSTATERS = "PSDEMAINSTATERS";
    /**
     * 实体映射 [PSDEMAP]
     * 实体功能映射模型，定义实体到目标实体的功能映射，包括属性、行为、数据集及查询。实体支持定义多个功能映射，在运行态配置使用的映射
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMap}
     */
    public final static String PSDEMAP = "PSDEMAP";
    /**
     * 实体映射行为 [PSDEMAPACTION]
     * 实体功能映射的行为映射模型，定义当前实体与目标实体的行为关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMapAction}
     */
    public final static String PSDEMAPACTION = "PSDEMAPACTION";
    /**
     * 实体映射查询 [PSDEMAPDQ]
     * 实体功能映射的数据查询映射模型，定义当前实体与目标实体的数据查询关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMapDQ}
     */
    public final static String PSDEMAPDQ = "PSDEMAPDQ";
    /**
     * 实体映射数据集合 [PSDEMAPDS]
     * 实体功能映射的数据集合映射模型，定义当前实体与目标实体的数据集合关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMapDS}
     */
    public final static String PSDEMAPDS = "PSDEMAPDS";
    /**
     * 实体映射属性 [PSDEMAPDETAIL]
     * 实体功能映射的属性映射模型，定义当前实体与目标实体的属性关系，（1）将源属性或直接值映射到目标属性；（2）将目标属性或直接值映射回源属性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEMapDetail}
     */
    public final static String PSDEMAPDETAIL = "PSDEMAPDETAIL";
    /**
     * 实体模型计数 [PSDEMODELCNT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEModelCnt}
     */
    public final static String PSDEMODELCNT = "PSDEMODELCNT";
    /**
     * 实体通知 [PSDENOTIFY]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDENotify}
     */
    public final static String PSDENOTIFY = "PSDENOTIFY";
    /**
     * 实体通知目标 [PSDENOTIFYTARGET]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDENotifyTarget}
     */
    public final static String PSDENOTIFYTARGET = "PSDENOTIFYTARGET";
    /**
     * 实体操作标识 [PSDEOPPRIV]
     * 实体数据的访问操作标识模型，访问操作标识一般用于对行数据的访问控制，要求在对数据进行操作之前要判断是否对该数据有相应的操作能力。操作标识可以映射到系统统一资源或是指定实体（通过关系）的操作标识
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEOPPriv}
     */
    public final static String PSDEOPPRIV = "PSDEOPPRIV";
    /**
     * 实体操作标识角色 [PSDEOPPRIVROLE]
     * 实体数据操作标识与角色的关系模型，将实体数据操作标识授予角色对象，支持实体角色与系统角色
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEOPPrivRole}
     */
    public final static String PSDEOPPRIVROLE = "PSDEOPPRIVROLE";
    /**
     * 实体打印 [PSDEPRINT]
     * 实体的打印模型，定义实体数据的打印逻辑，提供标准单据打印能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEPrint}
     */
    public final static String PSDEPRINT = "PSDEPRINT";
    /**
     * 实体关系属性映射 [PSDERDEFMAP]
     * 实体一对多关系的属性映射模型，将指定从实体的属性的值或计数聚合到主实体的相应属性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDERDEFMap}
     */
    public final static String PSDERDEFMAP = "PSDERDEFMAP";
    /**
     * 实体关系组 [PSDERGROUP]
     * 实体关系组模型，定义包含实体关系的组对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDERGroup}
     */
    public final static String PSDERGROUP = "PSDERGROUP";
    /**
     * 实体关系组成员 [PSDERGROUPDETAIL]
     * 实体关系组成员模型，定义实体关系组包含的实体关系对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDERGroupDetail}
     */
    public final static String PSDERGROUPDETAIL = "PSDERGROUPDETAIL";
    /**
     * 实体报表项 [PSDEREPITEM]
     * 实体报表项模型，为实体报表提供复合报表模型支持
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDERepItem}
     */
    public final static String PSDEREPITEM = "PSDEREPITEM";
    /**
     * 实体报表 [PSDEREPORT]
     * 实体的统计分析报表模型，可通过定义报表项构建复合报表模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEReport}
     */
    public final static String PSDEREPORT = "PSDEREPORT";
    /**
     * 实体服务接口成员 [PSDESADETAIL]
     * 实体服务接口成员模型，定义实体接口提供的方法，包括了行为、数据集合、数据查询等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDESADetail}
     */
    public final static String PSDESADETAIL = "PSDESADETAIL";
    /**
     * 实体服务接口方法参数 [PSDESADETAILPARAM]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDESADetailParam}
     */
    public final static String PSDESADETAILPARAM = "PSDESADETAILPARAM";
    /**
     * 实体服务接口关系 [PSDESARS]
     * 实体服务接口关系模型，定义实体接口之间的关系及关系接口在特定关系下处理模式，提供资源目录的能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDESARS}
     */
    public final static String PSDESARS = "PSDESARS";
    /**
     * 实体接口值规则 [PSDESAVR]
     * 实体服务接口值规则模型，定义接口调用参数的检查逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDESAVR}
     */
    public final static String PSDESAVR = "PSDESAVR";
    /**
     * 实体示例数据 [PSDESAMPLEDATA]
     * 实体示例数据模型，定义实体用于演示或测试用途的数据，包括关联的主状态及随机参数等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDESampleData}
     */
    public final static String PSDESAMPLEDATA = "PSDESAMPLEDATA";
    /**
     * 实体服务接口 [PSDESERVICEAPI]
     * 实体服务接口模型，系统服务接口的成员模型。定义实体通过系统服务接口对外提供的能力，包括了认证模式、行为或数据集的默认提供方式等，也包含了实体服务接口方法等成员模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEServiceAPI}
     */
    public final static String PSDESERVICEAPI = "PSDESERVICEAPI";
    /**
     * 工具栏项 [PSDETBITEM]
     * 工具栏项模型，支持界面行为、直接内容、分组等类型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETBItem}
     */
    public final static String PSDETBITEM = "PSDETBITEM";
    /**
     * 树表编辑项更新成员 [PSDETEIUDETAIL]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETEIUDetail}
     */
    public final static String PSDETEIUDETAIL = "PSDETEIUDETAIL";
    /**
     * 树表编辑项更新模式 [PSDETEIUPDATE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETEIUpdate}
     */
    public final static String PSDETEIUPDATE = "PSDETEIUPDATE";
    /**
     * 实体数据库表配置 [PSDEDBTABLE]
     * 实体的数据表模型，定义实体使用的数据库表，包括数据列的引用模式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEDBTable}
     */
    public final static String PSDEDBTABLE = "PSDEDBTABLE";
    /**
     * 实体工具栏 [PSDETOOLBAR]
     * 工具栏部件模型，包含支持层级的工具栏项。工具栏部件模型是通用的命令栏模型，还可应用在菜单（普通及上下文菜单）等场合
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEToolbar}
     */
    public final static String PSDETOOLBAR = "PSDETOOLBAR";
    /**
     * 工具栏逻辑 [PSDETOOLBARLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEToolbarLogic}
     */
    public final static String PSDETOOLBARLOGIC = "PSDETOOLBARLOGIC";
    /**
     * 树表格列 [PSDETREECOL]
     * 实体树视图表格列模型，支持定义属性列及操作列
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeCol}
     */
    public final static String PSDETREECOL = "PSDETREECOL";
    /**
     * 树部件逻辑 [PSDETREELOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeLogic}
     */
    public final static String PSDETREELOGIC = "PSDETREELOGIC";
    /**
     * 树节点 [PSDETREENODE]
     * 树视图节点模型，支持定义静态及动态树节点及相关的处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeNode}
     */
    public final static String PSDETREENODE = "PSDETREENODE";
    /**
     * 树节点数据项 [PSDETREENODECOL]
     * 实体树节点数据项模型，支持为树节点提供额外的数据项，同时也为树表格视图的表格列提供数据源支持
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeNodeCol}
     */
    public final static String PSDETREENODECOL = "PSDETREENODECOL";
    /**
     * 树节点关系 [PSDETREENODERS]
     * 树数据节点关系模型，定义树节点之间的关系。树视图默认从根节点开始加载，后续按树节点关系逻辑展开加载
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeNodeRS}
     */
    public final static String PSDETREENODERS = "PSDETREENODERS";
    /**
     * 树节点关联视图 [PSDETREENODERV]
     * 树节点的关联视图模型，树节点内置的处理逻辑会涉及视图的使用，关联视图就是将相关视图按照逻辑约定的标记注册到树节点中供逻辑使用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeNodeRV}
     */
    public final static String PSDETREENODERV = "PSDETREENODERV";
    /**
     * 实体树部件 [PSDETREEVIEW]
     * 树视图部件模型，定义树部件的界面及处理逻辑，包括了树节点与树节点的关系。支持定义树表格列及树节点表格列，为常规树表格及甘特树表格部件提供支持
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDETreeView}
     */
    public final static String PSDETREEVIEW = "PSDETREEVIEW";
    /**
     * 实体界面行为组 [PSDEUAGROUP]
     * 实体界面行为的集合模型，组装一个或多个界面行为对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEUAGroup}
     */
    public final static String PSDEUAGROUP = "PSDEUAGROUP";
    /**
     * 界面行为组成员 [PSDEUAGROUPDETAIL]
     * 界面行为组成员模型，将界面行为加入到行为组中，每个界面行为只能被添加一次
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEUAGroupDetail}
     */
    public final static String PSDEUAGROUPDETAIL = "PSDEUAGROUPDETAIL";
    /**
     * 实体界面行为 [PSDEUIACTION]
     * 界面行为模型，定义界面行为的操作目标、操作方式及附加逻辑等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEUIAction}
     */
    public final static String PSDEUIACTION = "PSDEUIACTION";
    /**
     * 实体操作角色 [PSDEUSERROLE]
     * 实体的操作角色模型，定义实体预置的操作角色，包括数据的操作标识及范围
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEUserRole}
     */
    public final static String PSDEUSERROLE = "PSDEUSERROLE";
    /**
     * 实体功能组件 [PSDEUTIL]
     * 实体的功能组件配置模型，定义指定实体功能配置参数及相关的实体信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEUtil}
     */
    public final static String PSDEUTIL = "PSDEUTIL";
    /**
     * 实体值规则组 [PSDEVRGROUP]
     * 实体值规则是将多个实体属性值规则组合为规则包模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEVRGroup}
     */
    public final static String PSDEVRGROUP = "PSDEVRGROUP";
    /**
     * 实体值规则组成员 [PSDEVRGRPDETAIL]
     * 实体值规则组成员模型，指定引用的属性值规则对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEVRGrpDetail}
     */
    public final static String PSDEVRGRPDETAIL = "PSDEVRGRPDETAIL";
    /**
     * 实体视图 [PSDEVIEWBASE]
     * 实体视图是实体的界面视图模型，包括了视图部件、视图逻辑等模型，实体视图通过视图类型使用默认布局模板，也可以指定视图布局面板实现自定义布局。实体视图既可以独立使用，也可以作为部件视图被引用。实体视图加入到应用形成应用实体视图，一个实体视图可以加入到多个应用中。
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEViewBase}
     */
    public final static String PSDEVIEWBASE = "PSDEVIEWBASE";
    /**
     * 实体视图部件 [PSDEVIEWCTRL]
     * 实体视图的部件成员模型，将系统或实体定义的界面部件挂接到视图，并指定相应的参数。要注意，视图部件的配置优先于部件自身定义的默认配置
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEViewCtrl}
     */
    public final static String PSDEVIEWCTRL = "PSDEVIEWCTRL";
    /**
     * 实体视图界面引擎 [PSDEVIEWENGINE]
     * 实体视图挂接的界面引擎模型，界面引擎是预置的界面交互逻辑，视图挂接引擎并指定引擎需要的参数
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEViewEngine}
     */
    public final static String PSDEVIEWENGINE = "PSDEVIEWENGINE";
    /**
     * 实体视图逻辑 [PSDEVIEWLOGIC]
     * 实体视图的处理逻辑模型，定义视图及部件的自定义处理逻辑，增强视图类型内置处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEViewLogic}
     */
    public final static String PSDEVIEWLOGIC = "PSDEVIEWLOGIC";
    /**
     * 实体视图引用视图 [PSDEVIEWRV]
     * 实体视图的引用视图模型，视图类型内置的处理逻辑会涉及视图的使用，引用视图就是将相关视图按照逻辑约定的标记注册到视图中供逻辑使用。注意：引用视图支持重新定义引用视图的打开方式、高度、宽度等，但某些模板受限于技术或代码组织会仅使用引用视图配置，在配置时需要确定模板的特性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEViewRV}
     */
    public final static String PSDEVIEWRV = "PSDEVIEWRV";
    /**
     * 实体向导 [PSDEWIZARD]
     * 实体向导模型，定义向导的界面及处理信息，包括初始化，完成等处理逻辑，向导模型包含向导步骤及向导表单成员模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEWizard}
     */
    public final static String PSDEWIZARD = "PSDEWIZARD";
    /**
     * 实体向导表单引用 [PSDEWIZARDFORM]
     * 实体向导表单引用模型，定义向导的操作界面，包括引用的操作表单和操作行为等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEWizardForm}
     */
    public final static String PSDEWIZARDFORM = "PSDEWIZARDFORM";
    /**
     * 实体向导逻辑 [PSDEWIZARDLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEWizardLogic}
     */
    public final static String PSDEWIZARDLOGIC = "PSDEWIZARDLOGIC";
    /**
     * 实体向导步骤 [PSDEWIZARDSTEP]
     * 实体向导步骤模型，定义向导的步骤信息，向导步骤与向导表单不是一一对应，多个向导表单可对应同一个向导步骤
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSDEWizardStep}
     */
    public final static String PSDEWIZARDSTEP = "PSDEWIZARDSTEP";
    /**
     * 云平台编辑器类型 [PSEDITORTYPE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSEditorType}
     */
    public final static String PSEDITORTYPE = "PSEDITORTYPE";
    /**
     * 平台语言 [PSLANGUAGE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSLanguage}
     */
    public final static String PSLANGUAGE = "PSLANGUAGE";
    /**
     * 语言定义项 [PSLANGUAGEITEM]
     * 系统语言资源项模型，定义语言资源在不同语言下的内容
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSLanguageItem}
     */
    public final static String PSLANGUAGEITEM = "PSLANGUAGEITEM";
    /**
     * 语言资源 [PSLANGUAGERES]
     * 系统的多语言资源模型，其它模型在需要多语言使用场合引用语言资源，语言资源项为语言资源定义不同语言的内容
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSLanguageRes}
     */
    public final static String PSLANGUAGERES = "PSLANGUAGERES";
    /**
     * 移动应用打包 [PSMOBAPPPACK]
     * 移动端应用打包模型，定义打包的应用支持的操作系统、安全设置等相关信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSMobAppPack}
     */
    public final static String PSMOBAPPPACK = "PSMOBAPPPACK";
    /**
     * 移动应用资源 [PSMOBAPPSTARTPAGE]
     * 移动应用资源模型，定义各种规格的起始页或图标
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSMobAppStartPage}
     */
    public final static String PSMOBAPPSTARTPAGE = "PSMOBAPPSTARTPAGE";
    /**
     * 模型运行时 [PSMODELRT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSModelRT}
     */
    public final static String PSMODELRT = "PSMODELRT";
    /**
     * 前台技术架构 [PSPF]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSPF}
     */
    public final static String PSPF = "PSPF";
    /**
     * 应用样式 [PSPFSTYLE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSPFStyle}
     */
    public final static String PSPFSTYLE = "PSPFSTYLE";
    /**
     * 面板界面引擎 [PSPANELENGINE]
     * 面板部件挂接的界面引擎模型，界面引擎是预置的界面交互逻辑，面板挂接引擎并指定引擎需要的参数
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSPanelEngine}
     */
    public final static String PSPANELENGINE = "PSPANELENGINE";
    /**
     * 面板项逻辑 [PSPANELITEMLOGIC]
     * 面板部件成员的动态逻辑模型，为成员提供动态的显示隐藏控制逻辑，支持组合、单项条件类型，支持层级逻辑结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSPanelItemLogic}
     */
    public final static String PSPANELITEMLOGIC = "PSPANELITEMLOGIC";
    /**
     * 外部接口实体 [PSSUBSYSSADE]
     * 外部接口实体模型，定义外部服务接口中的对象，包括代码标识，类型等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubSysSADE}
     */
    public final static String PSSUBSYSSADE = "PSSUBSYSSADE";
    /**
     * 外部接口实体属性 [PSSUBSYSSADEFIELD]
     * 外部接口实体属性模型，定义外部接口实体对象的属性，包括数据类型，代码表等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubSysSADEField}
     */
    public final static String PSSUBSYSSADEFIELD = "PSSUBSYSSADEFIELD";
    /**
     * 外部接口实体关系 [PSSUBSYSSADERS]
     * 外部接口实体关系模型，定义外部服务接口实体之间的关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubSysSADERS}
     */
    public final static String PSSUBSYSSADERS = "PSSUBSYSSADERS";
    /**
     * 外部接口实体方法 [PSSUBSYSSADETAIL]
     * 外部接口实体方法模型，定义外部接口实体提供的方法
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubSysSADetail}
     */
    public final static String PSSUBSYSSADETAIL = "PSSUBSYSSADETAIL";
    /**
     * 外部系统接口成员参数 [PSSUBSYSSADETAILPARAM]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubSysSADetailParam}
     */
    public final static String PSSUBSYSSADETAILPARAM = "PSSUBSYSSADETAILPARAM";
    /**
     * 外部接口 [PSSUBSYSSERVICEAPI]
     * 外部接口模型，定义系统使用的外部服务接口，包括接口类型、认证模式等信息，外部服务接口包含外部接口实体、外部接口实体关系等模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubSysServiceAPI}
     */
    public final static String PSSUBSYSSERVICEAPI = "PSSUBSYSSERVICEAPI";
    /**
     * 系统视图样式 [PSSUBVIEWTYPE]
     * 系统定义的视图样式，在视图样式中可以定义使用的模板插件、附加参数。视图样式在标准视图类型的基础上进一步增强视图的表现及处理，在视图中应用系统视图样式将默认具备样式的特性，规划好视图样式对相同模式的视图进行管理，可以做到一致表现，一致演进
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSubViewType}
     */
    public final static String PSSUBVIEWTYPE = "PSSUBVIEWTYPE";
    /**
     * 系统AI交谈代理 [PSSYSAICHATAGENT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysAIChatAgent}
     */
    public final static String PSSYSAICHATAGENT = "PSSYSAICHATAGENT";
    /**
     * 系统AI工厂 [PSSYSAIFACTORY]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysAIFactory}
     */
    public final static String PSSYSAIFACTORY = "PSSYSAIFACTORY";
    /**
     * 系统AI生产线代理 [PSSYSAIPIPELINEAGENT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysAIPipelineAgent}
     */
    public final static String PSSYSAIPIPELINEAGENT = "PSSYSAIPIPELINEAGENT";
    /**
     * 系统AI生产线作业 [PSSYSAIPIPELINEJOB]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysAIPipelineJob}
     */
    public final static String PSSYSAIPIPELINEJOB = "PSSYSAIPIPELINEJOB";
    /**
     * AI生产线工作者 [PSSYSAIPIPELINEWORKER]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysAIPipelineWorker}
     */
    public final static String PSSYSAIPIPELINEWORKER = "PSSYSAIPIPELINEWORKER";
    /**
     * 系统AI工作者代理 [PSSYSAIWORKERAGENT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysAIWorkerAgent}
     */
    public final static String PSSYSAIWORKERAGENT = "PSSYSAIWORKERAGENT";
    /**
     * 系统操作者 [PSSYSACTOR]
     * 系统操作者模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysActor}
     */
    public final static String PSSYSACTOR = "PSSYSACTOR";
    /**
     * 应用程序 [PSSYSAPP]
     * 提供人机交互的应用程序模型，指定应用使用的技术及界面样式，包括使用的服务接口等。前端应用是前端模板的顶级目标模型对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysApp}
     */
    public final static String PSSYSAPP = "PSSYSAPP";
    /**
     * 大数据表列族 [PSSYSBDCOLSET]
     * 大数据表列族模型，定义列族的相关信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDColSet}
     */
    public final static String PSSYSBDCOLSET = "PSSYSBDCOLSET";
    /**
     * 大数据表列 [PSSYSBDCOLUMN]
     * 大数据表列模型，定义列族及相关实体属性等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDColumn}
     */
    public final static String PSSYSBDCOLUMN = "PSSYSBDCOLUMN";
    /**
     * 系统大数据实例配置 [PSSYSBDINSTCFG]
     * 系统大数据实例配置模型，指定大数据库的类型及相应开发实例信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDInstCfg}
     */
    public final static String PSSYSBDINSTCFG = "PSSYSBDINSTCFG";
    /**
     * 大数据模块 [PSSYSBDMODULE]
     * 大数据体系的功能模块模型，定义模块的信息，一般会引用相关的系统模块
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDModule}
     */
    public final static String PSSYSBDMODULE = "PSSYSBDMODULE";
    /**
     * 大数据分区 [PSSYSBDPART]
     * 大数据体系的存储分区模型，定义存储分区的信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDPart}
     */
    public final static String PSSYSBDPART = "PSSYSBDPART";
    /**
     * 系统大数据体系 [PSSYSBDSCHEME]
     * 系统的大数据体系模型，定义大数据类型等信息，同时包括了大数据表及关系等成员模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDScheme}
     */
    public final static String PSSYSBDSCHEME = "PSSYSBDSCHEME";
    /**
     * 大数据库表 [PSSYSBDTABLE]
     * 大数据表模型，定义大数据表的类型、默认实体等信息，同时包括了大数据表列族及列等成员模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDTable}
     */
    public final static String PSSYSBDTABLE = "PSSYSBDTABLE";
    /**
     * 大数据表实体 [PSSYSBDTABLEDE]
     * 大数据表实体模型，定义大数据表相关的实体对象及相应的配置信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDTableDE}
     */
    public final static String PSSYSBDTABLEDE = "PSSYSBDTABLEDE";
    /**
     * 大数据表实体关系 [PSSYSBDTABLEDER]
     * 大数据表实体关系模型，定义大数据表相关的实体关系对象及相应的配置信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDTableDER}
     */
    public final static String PSSYSBDTABLEDER = "PSSYSBDTABLEDER";
    /**
     * 大数据表关系 [PSSYSBDTABLERS]
     * 大数据表关系模型，定义大数据表之间的关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBDTableRS}
     */
    public final static String PSSYSBDTABLERS = "PSSYSBDTABLERS";
    /**
     * 智能报表聚合数据列 [PSSYSBIAGGCOLUMN]
     * 智能报表系统中定义聚合数据表列的核心模型，用于明确聚合结果中的列类型（指标、维度或自定义类型），关联立方体维度、层级或指标
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIAggColumn}
     */
    public final static String PSSYSBIAGGCOLUMN = "PSSYSBIAGGCOLUMN";
    /**
     * 智能报表聚合数据 [PSSYSBIAGGTABLE]
     * 智能报表系统中用于定义数据聚合逻辑的核心模型，支持预计算聚合或实时动态聚合，以提升查询性能和分析效率。它基于宽表实体构建聚合数据集，并与立方体、报表体系深度集成，实现高性能多维分析
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIAggTable}
     */
    public final static String PSSYSBIAGGTABLE = "PSSYSBIAGGTABLE";
    /**
     * 智能立方体 [PSSYSBICUBE]
     * 智能报表系统的核心模型，用于定义多维数据分析的立方体结构。它通过关联数据实体、数据源、维度、指标等组件，构建可进行多维钻取、反查和分析的数据立方体
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBICube}
     */
    public final static String PSSYSBICUBE = "PSSYSBICUBE";
    /**
     * 智能立方体维度 [PSSYSBICUBEDIMENSION]
     * 智能报表立方体的核心模型，用于定义多维分析维度，支持常规维度与动态计算维度。它通过层级结构、代码表、实体属性等配置，实现数据的分类、分组及动态计算
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBICubeDimension}
     */
    public final static String PSSYSBICUBEDIMENSION = "PSSYSBICUBEDIMENSION";
    /**
     * 智能立方体维度层级 [PSSYSBICUBELEVEL]
     * 智能报表系统中定义立方体维度具体层级的核心模型，用于将全局维度层级（如时间、地理）绑定到立方体的特定维度中，并配置数据来源、显示规则及聚合行为。它作为维度与立方体的桥梁，支撑多维数据的分层聚合、钻取及报表展示
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBICubeLevel}
     */
    public final static String PSSYSBICUBELEVEL = "PSSYSBICUBELEVEL";
    /**
     * 智能立方体指标 [PSSYSBICUBEMEASURE]
     * 智能报表立方体核心模型，用于定义多维分析中的指标。它支持常规指标和动态计算指标，允许配置聚合方式、数据格式、钻取行为等，并与视图、代码表等组件关联
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBICubeMeasure}
     */
    public final static String PSSYSBICUBEMEASURE = "PSSYSBICUBEMEASURE";
    /**
     * 智能报表维度 [PSSYSBIDIMENSION]
     * 智能报表体系中的基础维度定义模型，用于全局定义业务分析中可复用的维度（如时间、地区、产品类别等）。它通过层级体系（Hierarchy）构建多维分析结构，并被立方体维度引用，实现跨立方体的统一维度管理
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIDimension}
     */
    public final static String PSSYSBIDIMENSION = "PSSYSBIDIMENSION";
    /**
     * 智能报表维度体系 [PSSYSBIHIERARCHY]
     * 智能报表系统中用于定义维度层级结构的核心模型，支持实体型（如组织架构）和时间型（如年-月-日）层级体系。它通过关联代码表、实体属性或自定义层级，构建多维分析中的钻取路径，并与立方体维度层级关联，实现数据的分层展示与分析
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIHierarchy}
     */
    public final static String PSSYSBIHIERARCHY = "PSSYSBIHIERARCHY";
    /**
     * 智能报表维度层级 [PSSYSBILEVEL]
     * 智能报表系统中定义维度层级节点的核心模型，用于构建多维分析中的层级结构（如时间维度的“年-季度-月”或实体维度的“国家-省份-城市”）。它通过关联实体属性、定义唯一性规则及层级类型，支撑数据的分层聚合与钻取分析
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBILevel}
     */
    public final static String PSSYSBILEVEL = "PSSYSBILEVEL";
    /**
     * 智能报表 [PSSYSBIREPORT]
     * 智能报表系统的核心模型，用于定义具体的报表实例，整合数据源（立方体）、展示布局、交互逻辑及扩展插件，构建完整的业务分析报表
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIReport}
     */
    public final static String PSSYSBIREPORT = "PSSYSBIREPORT";
    /**
     * 智能报表项 [PSSYSBIREPORTITEM]
     * 智能报表中的最小组成单元，用于定义报表中具体展示的内容（如指标、维度或自定义项），并控制其显示位置、格式及交互逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIReportItem}
     */
    public final static String PSSYSBIREPORTITEM = "PSSYSBIREPORTITEM";
    /**
     * 智能报表体系 [PSSYSBISCHEME]
     * 智能报表系统的顶层架构模型，用于整合分析组件（如立方体、维度、报表）及数据模型，构建完整的业务分析体系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBIScheme}
     */
    public final static String PSSYSBISCHEME = "PSSYSBISCHEME";
    /**
     * 系统后台任务 [PSSYSBACKSERVICE]
     * 系统的后台作业任务模型，定义作业组件或是调用的实体行为信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysBackService}
     */
    public final static String PSSYSBACKSERVICE = "PSSYSBACKSERVICE";
    /**
     * 日历部件 [PSSYSCALENDAR]
     * 系统日历部件模型，定义界面表现及处理逻辑，支持多个日历项同时提供数据源
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCalendar}
     */
    public final static String PSSYSCALENDAR = "PSSYSCALENDAR";
    /**
     * 日历部件项 [PSSYSCALENDARITEM]
     * 日历部件项模型，定义日历部件的子项数据源、界面表现及处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCalendarItem}
     */
    public final static String PSSYSCALENDARITEM = "PSSYSCALENDARITEM";
    /**
     * 日历项引用视图 [PSSYSCALENDARITEMRV]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCalendarItemRV}
     */
    public final static String PSSYSCALENDARITEMRV = "PSSYSCALENDARITEMRV";
    /**
     * 日历部件逻辑 [PSSYSCALENDARLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCalendarLogic}
     */
    public final static String PSSYSCALENDARLOGIC = "PSSYSCALENDARLOGIC";
    /**
     * 系统画布 [PSSYSCANVAS]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCanvas}
     */
    public final static String PSSYSCANVAS = "PSSYSCANVAS";
    /**
     * 系统画布相关模型 [PSSYSCANVASMODEL]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCanvasModel}
     */
    public final static String PSSYSCANVASMODEL = "PSSYSCANVASMODEL";
    /**
     * 系统图表主题 [PSSYSCHARTTHEME]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysChartTheme}
     */
    public final static String PSSYSCHARTTHEME = "PSSYSCHARTTHEME";
    /**
     * 系统代码块 [PSSYSCODESNIPPET]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCodeSnippet}
     */
    public final static String PSSYSCODESNIPPET = "PSSYSCODESNIPPET";
    /**
     * 系统控制台信息 [PSSYSCONSOLE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysConsole}
     */
    public final static String PSSYSCONSOLE = "PSSYSCONSOLE";
    /**
     * 系统内容 [PSSYSCONTENT]
     * 系统通用内容存储模型，提供普通内容存储能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysContent}
     */
    public final static String PSSYSCONTENT = "PSSYSCONTENT";
    /**
     * 系统内容分类 [PSSYSCONTENTCAT]
     * 系统内容分类模型，为通用内容对象提供分类能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysContentCat}
     */
    public final static String PSSYSCONTENTCAT = "PSSYSCONTENTCAT";
    /**
     * 系统计数器 [PSSYSCOUNTER]
     * 系统计数器模型，为界面提供计数支持
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCounter}
     */
    public final static String PSSYSCOUNTER = "PSSYSCOUNTER";
    /**
     * 系统计数器项 [PSSYSCOUNTERITEM]
     * 系统计数器项模型，定义计数器提供的数据项
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCounterItem}
     */
    public final static String PSSYSCOUNTERITEM = "PSSYSCOUNTERITEM";
    /**
     * 系统界面样式表 [PSSYSCSS]
     * 系统统一的界面样式表模型，支持定义字体、边框、背景等基本样式信息，也支持直接自定义样式内容。注意：设定的样式值需符合CSS规范
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCss}
     */
    public final static String PSSYSCSS = "PSSYSCSS";
    /**
     * 系统界面样式表分类 [PSSYSCSSCAT]
     * 系统界面样式表分类模型，为样式表对象提供分类能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysCssCat}
     */
    public final static String PSSYSCSSCAT = "PSSYSCSSCAT";
    /**
     * 数据库列 [PSSYSDBCOLUMN]
     * 关系数据表数据列模型，定义数据列的类型等逻辑，如数据列为外键列，则可进一步指定引用的数据列
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBColumn}
     */
    public final static String PSSYSDBCOLUMN = "PSSYSDBCOLUMN";
    /**
     * 系统数据库发布版本 [PSSYSDBDETAIL]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBDetail}
     */
    public final static String PSSYSDBDETAIL = "PSSYSDBDETAIL";
    /**
     * 数据看板成员 [PSSYSDBPART]
     * 数据看板成员模型，定义数据看板成员的界面表现及处理逻辑。支持多种类型，支持多层结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBPart}
     */
    public final static String PSSYSDBPART = "PSSYSDBPART";
    /**
     * 系统数据库体系 [PSSYSDBSCHEME]
     * 系统关系数据库体系模型，定义数据库体系的基本信息，包括数据表及存储过程对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBScheme}
     */
    public final static String PSSYSDBSCHEME = "PSSYSDBSCHEME";
    /**
     * 系统数据库表 [PSSYSDBTABLE]
     * 关系数据表模型，定义数据表的基本信息，包括数据列对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBTable}
     */
    public final static String PSSYSDBTABLE = "PSSYSDBTABLE";
    /**
     * 系统值函数 [PSSYSDBVF]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBVF}
     */
    public final static String PSSYSDBVF = "PSSYSDBVF";
    /**
     * 系统数据库值函数代码 [PSSYSDBVFCODE]
     * MODELV2
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDBVFCode}
     */
    public final static String PSSYSDBVFCODE = "PSSYSDBVFCODE";
    /**
     * 系统属性类型逻辑 [PSSYSDEFTYPE]
     * 系统属性类型逻辑模型，定义系统级别的属性类型处理逻辑对平台预置逻辑进行覆盖，逻辑值未配置时将默认使用预置逻辑的定义
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDEFType}
     */
    public final static String PSSYSDEFTYPE = "PSSYSDEFTYPE";
    /**
     * 系统预置处理逻辑 [PSSYSDELOGICNODE]
     * 系统预置的处理逻辑功能组件模型，功能组件实现后台模板约定的接口，实体处理逻辑支持定义调用系统处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDELogicNode}
     */
    public final static String PSSYSDELOGICNODE = "PSSYSDELOGICNODE";
    /**
     * 系统数据库模型项 [PSSYSDMITEM]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDMItem}
     */
    public final static String PSSYSDMITEM = "PSSYSDMITEM";
    /**
     * 系统数据库模型关键变更 [PSSYSDMITEMLOG]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDMItemLog}
     */
    public final static String PSSYSDMITEMLOG = "PSSYSDMITEMLOG";
    /**
     * 系统数据库模型版本 [PSSYSDMVER]
     * 系统数据库模型版本模型，定义系统的数据库结构版本信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDMVer}
     */
    public final static String PSSYSDMVER = "PSSYSDMVER";
    /**
     * 系统数据看板 [PSSYSDASHBOARD]
     * 数据看板部件模型，定义部件的界面及处理逻辑。数据看板部件包含部件成员，不同类型的部件成员提供不同的功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDashboard}
     */
    public final static String PSSYSDASHBOARD = "PSSYSDASHBOARD";
    /**
     * 数据看板逻辑 [PSSYSDASHBOARDLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDashboardLogic}
     */
    public final static String PSSYSDASHBOARDLOGIC = "PSSYSDASHBOARDLOGIC";
    /**
     * 系统数据同步代理 [PSSYSDATASYNCAGENT]
     * 系统数据同步代理模型，定义系统的数据同步代理，包括代理的类型，数据同步方向等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDataSyncAgent}
     */
    public final static String PSSYSDATASYNCAGENT = "PSSYSDATASYNCAGENT";
    /**
     * 系统输入词条类别 [PSSYSDICTCAT]
     * 输入词条类别模型，输入词条类别约定了一个输入场合，预置了常用的输入内容，允许用户对内容进行管理
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDictCat}
     */
    public final static String PSSYSDICTCAT = "PSSYSDICTCAT";
    /**
     * 系统动态模型对象 [PSSYSDYNAMODEL]
     * 动态模型对象模型，用于补充或扩展标准模型定义。定义动态模型一般有两种形式，一种是直接以JSON内容定义，另一种则使用动态模型属性进行明细定义，使用动态模型属性定义多一层标准目录，具体使用何种形式由建模方与模型消费方自行约定
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDynaModel}
     */
    public final static String PSSYSDYNAMODEL = "PSSYSDYNAMODEL";
    /**
     * 系统动态模型属性 [PSSYSDYNAMODELATTR]
     * 动态模型的属性模型，为动态模型提供条目化定义维度
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDynaModelAttr}
     */
    public final static String PSSYSDYNAMODELATTR = "PSSYSDYNAMODELATTR";
    /**
     * 系统动态模型分类 [PSSYSDYNAMODELCAT]
     * 动态模型分类模型，为动态模型提供分类管理能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysDynaModelCat}
     */
    public final static String PSSYSDYNAMODELCAT = "PSSYSDYNAMODELCAT";
    /**
     * 集成实体映射 [PSSYSEAIDE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIDE}
     */
    public final static String PSSYSEAIDE = "PSSYSEAIDE";
    /**
     * 集成实体属性映射 [PSSYSEAIDEFIELD]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIDEField}
     */
    public final static String PSSYSEAIDEFIELD = "PSSYSEAIDEFIELD";
    /**
     * 集成实体关系映射 [PSSYSEAIDER]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIDER}
     */
    public final static String PSSYSEAIDER = "PSSYSEAIDER";
    /**
     * 集成数据类型 [PSSYSEAIDATATYPE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIDataType}
     */
    public final static String PSSYSEAIDATATYPE = "PSSYSEAIDATATYPE";
    /**
     * 集成数据类型项 [PSSYSEAIDATATYPEITEM]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIDataTypeItem}
     */
    public final static String PSSYSEAIDATATYPEITEM = "PSSYSEAIDATATYPEITEM";
    /**
     * 集成元素 [PSSYSEAIELEMENT]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIElement}
     */
    public final static String PSSYSEAIELEMENT = "PSSYSEAIELEMENT";
    /**
     * 集成元素属性 [PSSYSEAIELEMENTATTR]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIElementAttr}
     */
    public final static String PSSYSEAIELEMENTATTR = "PSSYSEAIELEMENTATTR";
    /**
     * 集成元素元素 [PSSYSEAIELEMENTRE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIElementRE}
     */
    public final static String PSSYSEAIELEMENTRE = "PSSYSEAIELEMENTRE";
    /**
     * 应用集成体系 [PSSYSEAISCHEME]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEAIScheme}
     */
    public final static String PSSYSEAISCHEME = "PSSYSEAISCHEME";
    /**
     * 系统ER图 [PSSYSERMAP]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysERMap}
     */
    public final static String PSSYSERMAP = "PSSYSERMAP";
    /**
     * 系统ER图节点 [PSSYSERMAPNODE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysERMapNode}
     */
    public final static String PSSYSERMAPNODE = "PSSYSERMAPNODE";
    /**
     * 系统编辑器样式 [PSSYSEDITORSTYLE]
     * 定义系统全局的编辑器样式，包括了使用的模板插件及其它配置信息。系统编辑器样式可被使用编辑器的场合显示指定使用，或是直接替换编辑器类型默认样式，实现全局界面统一
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysEditorStyle}
     */
    public final static String PSSYSEDITORSTYLE = "PSSYSEDITORSTYLE";
    /**
     * 系统图片资源 [PSSYSIMAGE]
     * 系统统一的图片资源模型，支持定义图片的规格、来源及其它的参数
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysImage}
     */
    public final static String PSSYSIMAGE = "PSSYSIMAGE";
    /**
     * 系统问题 [PSSYSISSUE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysIssue}
     */
    public final static String PSSYSISSUE = "PSSYSISSUE";
    /**
     * 地图数据项 [PSSYSMAPITEM]
     * 地图部件项模型，定义地图部件的子项数据源，包括子项的界面表现及处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysMapItem}
     */
    public final static String PSSYSMAPITEM = "PSSYSMAPITEM";
    /**
     * 地图部件逻辑 [PSSYSMAPLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysMapLogic}
     */
    public final static String PSSYSMAPLOGIC = "PSSYSMAPLOGIC";
    /**
     * 系统地图部件 [PSSYSMAPVIEW]
     * 系统地图部件模型，定义界面表现及处理逻辑，支持多个地图项同时提供地图数据源
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysMapView}
     */
    public final static String PSSYSMAPVIEW = "PSSYSMAPVIEW";
    /**
     * 系统模型目录 [PSSYSMODELFOLDER]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysModelFolder}
     */
    public final static String PSSYSMODELFOLDER = "PSSYSMODELFOLDER";
    /**
     * 系统模型目录成员 [PSSYSMODELFOLDERITEM]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysModelFolderItem}
     */
    public final static String PSSYSMODELFOLDERITEM = "PSSYSMODELFOLDERITEM";
    /**
     * 系统模型组 [PSSYSMODELGROUP]
     * 模型组解决模块模型的交换、存储问题，模块代码标识在同一个模型域要求具备唯一性，这种情况下在导入外部模型时可能会存在冲突，模型组就可以将导入的外部模型独立在一个模型域中，避免冲突
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysModelGroup}
     */
    public final static String PSSYSMODELGROUP = "PSSYSMODELGROUP";
    /**
     * 系统消息队列 [PSSYSMSGQUEUE]
     * 系统消息队列模型，定义系统对外发送消息的队列，包括系统本地实体存储队列或运行环境（Cloud）的队列
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysMsgQueue}
     */
    public final static String PSSYSMSGQUEUE = "PSSYSMSGQUEUE";
    /**
     * 系统消息目标 [PSSYSMSGTARGET]
     * 系统消息目标模型，定义系统对外发送消息的目标，包括系统本地实体数据集或运行环境（Cloud）定义的目标对象
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysMsgTarget}
     */
    public final static String PSSYSMSGTARGET = "PSSYSMSGTARGET";
    /**
     * 系统消息模板 [PSSYSMSGTEMPL]
     * 系统消息模板模型，定义系统对外发送消息的内容模板，支持为不同的接收目标定义不同的内容
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysMsgTempl}
     */
    public final static String PSSYSMSGTEMPL = "PSSYSMSGTEMPL";
    /**
     * 系统操作角色 [PSSYSUSERROLE]
     * 系统操作用户角色，分配系统统一资源标识及实体操作角色。在系统运行环境中，拥有该角色的用户同时具备相应的能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUserRole}
     */
    public final static String PSSYSUSERROLE = "PSSYSUSERROLE";
    /**
     * 系统预置视图 [PSSYSPDTVIEW]
     * 系统的预置视图模型是预先定义的占位视图，用于满足某些逻辑在定义时对视图的需求（只是需要这么一个视图，具体是哪个可由用户决定）
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysPDTView}
     */
    public final static String PSSYSPDTVIEW = "PSSYSPDTVIEW";
    /**
     * 前端模板插件代码 [PSSYSPFPITEMPL]
     * 前端模板插件代码模型，定义前端插件在指定模板的代码
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysPFPITempl}
     */
    public final static String PSSYSPFPITEMPL = "PSSYSPFPITEMPL";
    /**
     * 前端模板插件 [PSSYSPFPLUGIN]
     * 系统前端模板插件模型，模板插件支持用户不修改标准模板、不直接编写最终代码就能实现目标功能。插件的使用既保证了体系的一致性，也能实现应用的个性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysPFPlugin}
     */
    public final static String PSSYSPFPLUGIN = "PSSYSPFPLUGIN";
    /**
     * 系统门户部件 [PSSYSPORTLET]
     * 可放置在数据看板的部件模型，定义部件的表现及处理逻辑，门户部件有多种类型，根据类型嵌入不同的成员部件
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysPortlet}
     */
    public final static String PSSYSPORTLET = "PSSYSPORTLET";
    /**
     * 系统门户部件分类 [PSSYSPORTLETCAT]
     * 系统门户部件的分类模型，为门户部件提供分类能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysPortletCat}
     */
    public final static String PSSYSPORTLETCAT = "PSSYSPORTLETCAT";
    /**
     * 系统引用 [PSSYSREF]
     * 系统引用模型，定义当前系统对其它开发系统或平台子系统的引用信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysRef}
     */
    public final static String PSSYSREF = "PSSYSREF";
    /**
     * 需求作业单 [PSSYSREQITEM]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysReqItem}
     */
    public final static String PSSYSREQITEM = "PSSYSREQITEM";
    /**
     * 需求项讨论 [PSSYSREQITEMDATA]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysReqItemData}
     */
    public final static String PSSYSREQITEMDATA = "PSSYSREQITEMDATA";
    /**
     * 需求项备份 [PSSYSREQITEMHIS]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysReqItemHis}
     */
    public final static String PSSYSREQITEMHIS = "PSSYSREQITEMHIS";
    /**
     * 系统需求模块 [PSSYSREQMODULE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysReqModule}
     */
    public final static String PSSYSREQMODULE = "PSSYSREQMODULE";
    /**
     * 系统资源 [PSSYSRESOURCE]
     * 系统资源模型，定义系统预置的资源内容。直接内容部件可使用系统资源作为内容的提供者
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysResource}
     */
    public final static String PSSYSRESOURCE = "PSSYSRESOURCE";
    /**
     * 系统运行会话 [PSSYSRUNSESSION]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysRunSession}
     */
    public final static String PSSYSRUNSESSION = "PSSYSRUNSESSION";
    /**
     * 系统服务接口处理器 [PSSYSSAHANDLER]
     * 系统服务接口处理器模型，为接口提供预置处理能力，接口处理器可以是全功能组件或是以代码的基类对象存在
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSAHandler}
     */
    public final static String PSSYSSAHANDLER = "PSSYSSAHANDLER";
    /**
     * 后台模板插件代码 [PSSYSSFPITEMPL]
     * 后台模板插件代码模型，定义后台插件在指定模板的代码
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSFPITempl}
     */
    public final static String PSSYSSFPITEMPL = "PSSYSSFPITEMPL";
    /**
     * 后台模板插件 [PSSYSSFPLUGIN]
     * 系统后台模板插件，模板插件支持用户不修改标准模板、不直接编写最终代码就能实现目标功能。插件的使用既保证了体系的一致性，也能实现应用的个性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSFPlugin}
     */
    public final static String PSSYSSFPLUGIN = "PSSYSSFPLUGIN";
    /**
     * 后台体系 [PSSYSSFPUB]
     * 系统后台模板的发布配置，由于后台模板产生的代码一般作为系统后台服务体系，所以也称为后台体系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSFPub}
     */
    public final static String PSSYSSFPUB = "PSSYSSFPUB";
    /**
     * 后台体系组件 [PSSYSSFPUBPKG]
     * 后台体系组件模型，定义后台体系额外使用的组件信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSFPubPkg}
     */
    public final static String PSSYSSFPUBPKG = "PSSYSSFPUBPKG";
    /**
     * 系统示例值 [PSSYSSAMPLEVALUE]
     * 系统示例值模型，定义系统全局使用的示例值
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSampleValue}
     */
    public final static String PSSYSSAMPLEVALUE = "PSSYSSAMPLEVALUE";
    /**
     * 系统搜索栏 [PSSYSSEARCHBAR]
     * 系统搜索栏部件模型，定义部件的表现及处理逻辑。支持为搜索栏定义快速分组项、属性过滤项等搜索功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchBar}
     */
    public final static String PSSYSSEARCHBAR = "PSSYSSEARCHBAR";
    /**
     * 搜索栏项 [PSSYSSEARCHBARITEM]
     * 搜索栏部件子项模型，定义搜索栏提供的分组条件过滤能力、属性过滤能力及快速搜索能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchBarItem}
     */
    public final static String PSSYSSEARCHBARITEM = "PSSYSSEARCHBARITEM";
    /**
     * 搜索栏逻辑 [PSSYSSEARCHBARLOGIC]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchBarLogic}
     */
    public final static String PSSYSSEARCHBARLOGIC = "PSSYSSEARCHBARLOGIC";
    /**
     * 全文检索实体 [PSSYSSEARCHDE]
     * 全文检索实体的模型，定义全文检索体系与实体的关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchDE}
     */
    public final static String PSSYSSEARCHDE = "PSSYSSEARCHDE";
    /**
     * 全文检索实体属性 [PSSYSSEARCHDEFIELD]
     * 全文检索实体属性的模型，定义全文检索文档与实体属性的关系
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchDEField}
     */
    public final static String PSSYSSEARCHDEFIELD = "PSSYSSEARCHDEFIELD";
    /**
     * 全文检索文档 [PSSYSSEARCHDOC]
     * 全文检索文档模型，包含检索文档属性对象集合
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchDoc}
     */
    public final static String PSSYSSEARCHDOC = "PSSYSSEARCHDOC";
    /**
     * 全文检索属性 [PSSYSSEARCHFIELD]
     * 全文检索文档属性模型，定义属性的类型、索引模式等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchField}
     */
    public final static String PSSYSSEARCHFIELD = "PSSYSSEARCHFIELD";
    /**
     * 系统全文检索体系 [PSSYSSEARCHSCHEME]
     * 系统全文检索体系模型，定义检索体系的引擎类型等参数，全文检索体系包含检索文档集合
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSearchScheme}
     */
    public final static String PSSYSSEARCHSCHEME = "PSSYSSEARCHSCHEME";
    /**
     * 系统值序列 [PSSYSSEQUENCE]
     * 系统值序列模型，提供数据库、实体类型的值序列功能，支持定义格式化等参数
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysSequence}
     */
    public final static String PSSYSSEQUENCE = "PSSYSSEQUENCE";
    /**
     * 系统服务接口 [PSSYSSERVICEAPI]
     * 系统服务接口模型，定义系统对外提供的服务接口，包括了接口类型、模式等信息，也包含了实体服务接口、实体服务接口关系等成员模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysServiceAPI}
     */
    public final static String PSSYSSERVICEAPI = "PSSYSSERVICEAPI";
    /**
     * 系统测试用例断言 [PSSYSTCASSERT]
     * 测试用例断言模型，定义测试用例的预期执行结果
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTCAssert}
     */
    public final static String PSSYSTCASSERT = "PSSYSTCASSERT";
    /**
     * 系统测试用例输入 [PSSYSTCINPUT]
     * 测试用例输入模型，定义测试用例的输入数据
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTCInput}
     */
    public final static String PSSYSTCINPUT = "PSSYSTCINPUT";
    /**
     * 系统测试数据项 [PSSYSTDITEM]
     * 系统测试数据项模型，定义测试数据的数据项逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTDItem}
     */
    public final static String PSSYSTDITEM = "PSSYSTDITEM";
    /**
     * 系统测试用例 [PSSYSTESTCASE]
     * 系统测试用例模型，定义实体行为、应用视图等类型的测试用例，包含测试输入数据及测试结果断言模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTestCase}
     */
    public final static String PSSYSTESTCASE = "PSSYSTESTCASE";
    /**
     * 系统测试数据 [PSSYSTESTDATA]
     * 系统测试数据模型，定义系统实体的数据对象，支持主状态区分
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTestData}
     */
    public final static String PSSYSTESTDATA = "PSSYSTESTDATA";
    /**
     * 测试模块 [PSSYSTESTMODULE]
     * 测试模块模型，定义项目测试中的模块
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTestModule}
     */
    public final static String PSSYSTESTMODULE = "PSSYSTESTMODULE";
    /**
     * 系统测试项目 [PSSYSTESTPRJ]
     * 系统测试项目模型，定义不同类型的测试项目，测试项目包含测试模块及测试用例模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTestPrj}
     */
    public final static String PSSYSTESTPRJ = "PSSYSTESTPRJ";
    /**
     * 系统值转换 [PSSYSTRANSLATOR]
     * 系统值转换器模型，为属性值提供转换功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysTranslator}
     */
    public final static String PSSYSTRANSLATOR = "PSSYSTRANSLATOR";
    /**
     * 系统用例图 [PSSYSUCMAP]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUCMap}
     */
    public final static String PSSYSUCMAP = "PSSYSUCMAP";
    /**
     * 系统用例图节点 [PSSYSUCMAPNODE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUCMapNode}
     */
    public final static String PSSYSUCMAPNODE = "PSSYSUCMAPNODE";
    /**
     * 系统统一资源 [PSSYSUNIRES]
     * 系统统一资源是访问控制体系中一类控制维度，提供简单的控制模式，访问受限资源需要一把钥匙，拥有钥匙的用户可以访问，统一资源就是钥匙，视图、菜单、报表等内容都可以配置需要的统一资源
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUniRes}
     */
    public final static String PSSYSUNIRES = "PSSYSUNIRES";
    /**
     * 系统状态协同 [PSSYSUNISTATE]
     * 系统全局状态协同的模型，协同模型以zk作为功能载体，定义节点的目录及数据项：/目录1/目录2/目录3/数据标识：{状态1、状态2、...状态8}
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUniState}
     */
    public final static String PSSYSUNISTATE = "PSSYSUNISTATE";
    /**
     * 系统单位 [PSSYSUNIT]
     * 计量单位模型，系统基础模型对象，提供标准单位定义能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUnit}
     */
    public final static String PSSYSUNIT = "PSSYSUNIT";
    /**
     * 系统用例分类 [PSSYSUSECASECAT]
     * 系统用例分类模型，用于为用例对象提供分类支持
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUseCaseCat}
     */
    public final static String PSSYSUSECASECAT = "PSSYSUSECASECAT";
    /**
     * 系统用例 [PSSYSUSECASE]
     * 系统用例模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUseCase}
     */
    public final static String PSSYSUSECASE = "PSSYSUSECASE";
    /**
     * 系统用例关系 [PSSYSUSECASERS]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUseCaseRS}
     */
    public final static String PSSYSUSECASERS = "PSSYSUSECASERS";
    /**
     * 系统自定义数据范围 [PSSYSUSERDR]
     * 系统的自定义数据范围能力模型，除了组织、部门等标准数据范围，系统一般也会存在一些特定的数据范围模式，合理使用自定义数据范围，业务化使用场景，可以降低系统的权限配置级别，提高管理性
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUserDR}
     */
    public final static String PSSYSUSERDR = "PSSYSUSERDR";
    /**
     * 系统用户模式 [PSSYSUSERMODE]
     * 系统用户模式模型，定义系统中的用户模式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUserMode}
     */
    public final static String PSSYSUSERMODE = "PSSYSUSERMODE";
    /**
     * 系统角色数据能力 [PSSYSUSERROLEDATA]
     * 系统操作角色的实体数据能力定义模型，将实体操作角色分配到系统操作角色
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUserRoleData}
     */
    public final static String PSSYSUSERROLEDATA = "PSSYSUSERROLEDATA";
    /**
     * 系统角色资源能力 [PSSYSUSERROLERES]
     * 系统操作角色的统一资源能力定义模型，将系统统一资源分配到系统操作角色
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUserRoleRes}
     */
    public final static String PSSYSUSERROLERES = "PSSYSUSERROLERES";
    /**
     * 系统功能组件 [PSSYSUTIL]
     * 系统功能组件配置模型，定义系统全局开启的功能模式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysUtil}
     */
    public final static String PSSYSUTIL = "PSSYSUTIL";
    /**
     * 系统预置值规则 [PSSYSVALUERULE]
     * 系统的全局值规则模型，支持脚本、正则式及自定义类型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysValueRule}
     */
    public final static String PSSYSVALUERULE = "PSSYSVALUERULE";
    /**
     * 系统预置界面逻辑 [PSSYSVIEWLOGIC]
     * 系统的全局界面逻辑模型，定义全局通用的界面处理逻辑供界面行为或视图、部件处理逻辑等调用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysViewLogic}
     */
    public final static String PSSYSVIEWLOGIC = "PSSYSVIEWLOGIC";
    /**
     * 面板部件 [PSSYSVIEWPANEL]
     * 系统面板部件模型，定义面板部件的界面及处理逻辑。面板部件是支持多种布局模式的容器，多种类型的面板成员提供了灵活的界面组织能力，满足各种界面组装需求。面板模式为布局面板时可应用在视图或部件的布局
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysViewPanel}
     */
    public final static String PSSYSVIEWPANEL = "PSSYSVIEWPANEL";
    /**
     * 面板成员 [PSSYSVIEWPANELITEM]
     * 面板部件成员模型，定义面板成员的表现及处理逻辑，提供多种成员类型。支持定义成员的子项（多层）、成员的动态逻辑等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysViewPanelItem}
     */
    public final static String PSSYSVIEWPANELITEM = "PSSYSVIEWPANELITEM";
    /**
     * 面板逻辑 [PSSYSVIEWPANELLOGIC]
     * 面板处理逻辑模型，定义面板及成员的自定义交互处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysViewPanelLogic}
     */
    public final static String PSSYSVIEWPANELLOGIC = "PSSYSVIEWPANELLOGIC";
    /**
     * 系统工作流分类 [PSSYSWFCAT]
     * 系统工作流的分类模型，为工作流提供分类能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysWFCat}
     */
    public final static String PSSYSWFCAT = "PSSYSWFCAT";
    /**
     * 系统工作流模式 [PSSYSWFMODE]
     * 系统工作流模式模型，定义系统工作流的运行模式
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysWFMode}
     */
    public final static String PSSYSWFMODE = "PSSYSWFMODE";
    /**
     * 系统工作流设置 [PSSYSWFSETTING]
     * 系统工作流全局设置模型，定义工作流全局的默认设置，包括了催办消息模板，系统级流程操作行为等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSysWFSetting}
     */
    public final static String PSSYSWFSETTING = "PSSYSWFSETTING";
    /**
     * 系统数据库 [PSSYSTEMDBCFG]
     * 系统的关系数据库配置模型，定义指定数据库类型的默认配置参数，包括是否发布外键、视图等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSystemDBCfg}
     */
    public final static String PSSYSTEMDBCFG = "PSSYSTEMDBCFG";
    /**
     * 系统运行 [PSSYSTEMRUN]
     * 系统运行配置模型，定义系统运行模式，包括了后台体系、前端应用等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSSystemRun}
     */
    public final static String PSSYSTEMRUN = "PSSYSTEMRUN";
    /**
     * 云平台视图类型部件 [PSVTCTRL]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSVTCtrl}
     */
    public final static String PSVTCTRL = "PSVTCTRL";
    /**
     * 云平台视图类型关联视图 [PSVTRV]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSVTRV}
     */
    public final static String PSVTRV = "PSVTRV";
    /**
     * 视图消息 [PSVIEWMSG]
     * 系统视图消息模型，支持定义静态及动态视图消息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSViewMsg}
     */
    public final static String PSVIEWMSG = "PSVIEWMSG";
    /**
     * 视图消息组 [PSVIEWMSGGROUP]
     * 系统视图消息组模型，包括一组静态或动态视图消息成员
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSViewMsgGroup}
     */
    public final static String PSVIEWMSGGROUP = "PSVIEWMSGGROUP";
    /**
     * 视图消息组成员 [PSVIEWMSGGRPDETAIL]
     * 视图消息组成员模型，将视图消息加入到消息组中，一个视图消息只能被加入一次
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSViewMsgGrpDetail}
     */
    public final static String PSVIEWMSGGRPDETAIL = "PSVIEWMSGGRPDETAIL";
    /**
     * 云平台视图类型 [PSVIEWTYPE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSViewType}
     */
    public final static String PSVIEWTYPE = "PSVIEWTYPE";
    /**
     * 工作流实体 [PSWFDE]
     * 工作流实体模型，定义支持工作流能力的实体，指定流程运行时信息存储的实体属性，相关的操作视图等
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFDE}
     */
    public final static String PSWFDE = "PSWFDE";
    /**
     * 流程处理连接 [PSWFLINK]
     * 流程处理连接模型，支持定义不同类型的流程处理节点连接
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFLink}
     */
    public final static String PSWFLINK = "PSWFLINK";
    /**
     * 流程处理连接条件 [PSWFLINKCOND]
     * 流程处理连接的条件模型，支持组合、单项条件类型，支持层级结构
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFLinkCond}
     */
    public final static String PSWFLINKCOND = "PSWFLINKCOND";
    /**
     * 流程处理连接角色 [PSWFLINKROLE]
     * 
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFLinkRole}
     */
    public final static String PSWFLINKROLE = "PSWFLINKROLE";
    /**
     * 流程处理参数 [PSWFPROCPARAM]
     * 流程处理逻辑节点参数模型，为处理节点提供动态参数定义能力
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFProcParam}
     */
    public final static String PSWFPROCPARAM = "PSWFPROCPARAM";
    /**
     * 流程处理角色 [PSWFPROCROLE]
     * 流程处理角色模型，定义交互流程处理的工作流角色
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFProcRole}
     */
    public final static String PSWFPROCROLE = "PSWFPROCROLE";
    /**
     * 流程处理子流程 [PSWFPROCSUBWF]
     * 流程处理节点子流程模型，为嵌套流程节点提供定义子流程的能力，包括了工作流、工作流实体及启动的数据集等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFProcSubWF}
     */
    public final static String PSWFPROCSUBWF = "PSWFPROCSUBWF";
    /**
     * 流程处理节点 [PSWFPROCESS]
     * 流程处理节点模型，定义流程处理的逻辑信息，支持多种类型，也包括了设计界面图元展示信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFProcess}
     */
    public final static String PSWFPROCESS = "PSWFPROCESS";
    /**
     * 工作流角色 [PSWFROLE]
     * 工作流角色模型，定义工作流相关的角色，支持自定义、数据集合及预置类型角色
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFRole}
     */
    public final static String PSWFROLE = "PSWFROLE";
    /**
     * 工作流功能操作 [PSWFUTILUIACTION]
     * 工作流功能操作模型，定义全局流程功能操作使用的界面行为，也支持区分工作流、工作流版本进行分别定义
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFUtilUIAction}
     */
    public final static String PSWFUTILUIACTION = "PSWFUTILUIACTION";
    /**
     * 流程定义版本 [PSWFVERSION]
     * 工作流版本模型，定义工作流不同版本的执行流程
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFVersion}
     */
    public final static String PSWFVERSION = "PSWFVERSION";
    /**
     * 工作流工作时间 [PSWFWORKTIME]
     * 工作流工作时间模型，定义工作流使用的工作时间模式，工作时间一般是程序组件计算或在运行时定义
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWFWorkTime}
     */
    public final static String PSWFWORKTIME = "PSWFWORKTIME";
    /**
     * 微信公众号 [PSWXACCOUNT]
     * 微信公众号模型，定义系统中的微信公众号信息。iBiz未提供对钉钉的模型直接支持，如需使用可通过微信公众号模型进行相应标记，在模板中进行区分
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWXAccount}
     */
    public final static String PSWXACCOUNT = "PSWXACCOUNT";
    /**
     * 微信企业应用 [PSWXENTAPP]
     * 微信企业应用模型，定义微信公众号中企业应用信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWXEntApp}
     */
    public final static String PSWXENTAPP = "PSWXENTAPP";
    /**
     * 微信交互逻辑 [PSWXLOGIC]
     * 微信交互逻辑模型，定义微信应用的事件处理逻辑
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWXLogic}
     */
    public final static String PSWXLOGIC = "PSWXLOGIC";
    /**
     * 微信菜单 [PSWXMENU]
     * 微信菜单模型，定义微信公众号或微信应用使用的菜单。微信菜单包含多层级的菜单项模型
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWXMenu}
     */
    public final static String PSWXMENU = "PSWXMENU";
    /**
     * 微信菜单功能 [PSWXMENUFUNC]
     * 微信菜单功能模型，定义微信公众号或微信应用的菜单功能，供微信菜单项调用
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWXMenuFunc}
     */
    public final static String PSWXMENUFUNC = "PSWXMENUFUNC";
    /**
     * 微信菜单项 [PSWXMENUITEM]
     * 微信菜单项模型，定义菜单项的显示内容及触发的菜单功能
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWXMenuItem}
     */
    public final static String PSWXMENUITEM = "PSWXMENUITEM";
    /**
     * 系统工作流 [PSWORKFLOW]
     * 系统工作流模型，定义系统运行的工作流，包括了状态、步骤代码表、相关的操作视图等信息
     * 
     * {@link net.ibizsys.psmodel.core.util.domain.PSWorkflow}
     */
    public final static String PSWORKFLOW = "PSWORKFLOW";
}