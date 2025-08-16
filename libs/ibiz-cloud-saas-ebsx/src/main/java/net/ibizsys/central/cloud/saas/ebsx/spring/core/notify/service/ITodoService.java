package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service;

import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoSimpleDTO;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

/**
 * 待办
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/.ibizmodel.index
 */
public interface ITodoService extends IDEService<TodoDTO, SearchContextDTO> {

    String DATAENTITYID = "PSMODULES/notify/PSDATAENTITIES/Todo.json";

  /**
   * 属性: 处理时间
   */
  String FIELD_PROCESSDATE = "PROCESSDATE";
  /**
   * 属性: 待办子类
   */
  String FIELD_TODOSUBTYPE = "TODOSUBTYPE";
  /**
   * 属性: 更新时间
   */
  String FIELD_UPDATEDATE = "UPDATEDATE";
  /**
   * 属性: 参数06
   */
  String FIELD_PARAM06 = "PARAM06";
  /**
   * 属性: 参数01
   */
  String FIELD_PARAM01 = "PARAM01";
  /**
   * 属性: 创建人
   */
  String FIELD_CREATEMAN = "CREATEMAN";
  /**
   * 属性: 参数07
   */
  String FIELD_PARAM07 = "PARAM07";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMANNAME = "UPDATEMANNAME";
  /**
   * 属性: 参数04
   */
  String FIELD_PARAM04 = "PARAM04";
  /**
   * 属性: 待办用户
   */
  String FIELD_USERNAME = "USERNAME";
  /**
   * 属性: 待办用户标识
   */
  String FIELD_USERID = "USERID";
  /**
   * 属性: 内容
   */
  String FIELD_CONTENT = "CONTENT";
  /**
   * 属性: 长文本参数01
   */
  String FIELD_CLOBPARAM01 = "CLOBPARAM01";
  /**
   * 属性: 创建时间
   */
  String FIELD_CREATEDATE = "CREATEDATE";
  /**
   * 属性: 创建人
   */
  String FIELD_CREATEMANNAME = "CREATEMANNAME";
  /**
   * 属性: 参数03
   */
  String FIELD_PARAM03 = "PARAM03";
  /**
   * 属性: 长文本参数02
   */
  String FIELD_CLOBPARAM02 = "CLOBPARAM02";
  /**
   * 属性: 参数05
   */
  String FIELD_PARAM05 = "PARAM05";
  /**
   * 属性: 标题
   */
  String FIELD_TITLE = "TITLE";
  /**
   * 属性: 参数08
   */
  String FIELD_PARAM08 = "PARAM08";
  /**
   * 属性: 参数02
   */
  String FIELD_PARAM02 = "PARAM02";
  /**
   * 属性: 待办地址类型
   */
  String FIELD_TODOURLTYPE = "TODOURLTYPE";
  /**
   * 属性: 业务对象
   */
  String FIELD_BIZTYPE = "BIZTYPE";
  /**
   * 属性: 业务数据标识
   */
  String FIELD_BIZKEY = "BIZKEY";
  /**
   * 属性: 组织机构标识
   */
  String FIELD_ORGID = "ORGID";
  /**
   * 属性: 待办状态
   */
  String FIELD_TODOSTATE = "TODOSTATE";
  /**
   * 属性: 待办标识
   */
  String FIELD_TODOID = "TODOID";
  /**
   * 属性: 过期时间
   */
  String FIELD_DUEDATE = "DUEDATE";
  /**
   * 属性: 待办类型
   */
  String FIELD_TODOTYPE = "TODOTYPE";
  /**
   * 属性: 是否已读
   */
  String FIELD_ISREAD = "ISREAD";
  /**
   * 属性: 更新人
   */
  String FIELD_UPDATEMAN = "UPDATEMAN";
  /**
   * 属性: 连接地址
   */
  String FIELD_LINKURL = "LINKURL";
  /**
   * 属性: 系统
   */
  String FIELD_DCSYSTEMNAME = "DCSYSTEMNAME";
  /**
   * 属性: 租户系统标识
   */
  String FIELD_DCSYSTEMID = "DCSYSTEMID";
  /**
   * 属性: 参数09
   */
  String FIELD_PARAM09 = "PARAM09";
  /**
   * 行为: Create
   */
  String ACTION_CREATE = "Create";
  /**
   * 行为: Update
   */
  String ACTION_UPDATE = "Update";
  /**
   * 行为: Remove
   */
  String ACTION_REMOVE = "Remove";
  /**
   * 行为: Get
   */
  String ACTION_GET = "Get";
  /**
   * 行为: GetDraft
   */
  String ACTION_GETDRAFT = "GetDraft";
  /**
   * 行为: 激活
   */
  String ACTION_ACTIVATE = "Activate";
  /**
   * 行为: 取消
   */
  String ACTION_CANCEL = "Cancel";
  /**
   * 行为: CheckKey
   */
  String ACTION_CHECKKEY = "CheckKey";
  /**
   * 行为: 完成
   */
  String ACTION_COMPLETE = "Complete";
  /**
   * 行为: 委派
   */
  String ACTION_DELEGATE = "Delegate";
  /**
   * 行为: 获取链接地址
   */
  String ACTION_GETLINKURL = "GetLinkUrl";
  /**
   * 行为: 移动端获取链接地址
   */
  String ACTION_GETLINKURLMOB = "GetLinkUrlMob";
  /**
   * 行为: 设置已读
   */
  String ACTION_MARKREAD = "MarkRead";
  /**
   * 行为: 挂起
   */
  String ACTION_PAUSE = "Pause";
  /**
   * 行为: 转办
   */
  String ACTION_REASSIGN = "Reassign";
  /**
   * 行为: 完成委派
   */
  String ACTION_RESOLVE = "Resolve";
  /**
   * 行为: 回滚
   */
  String ACTION_ROLLBACK = "Rollback";
  /**
   * 行为: Save
   */
  String ACTION_SAVE = "Save";
  /**
   * 行为: 待办消息发送
   */
  String ACTION_SENDMSG = "SendMsg";
  /**
   * 查询: 抄送
   */
  String DATAQUERY_CARBONCOPY = "CarbonCopy";
  /**
   * 查询: 当前用户数据
   */
  String DATAQUERY_CURUSER = "CurUser";
  /**
   * 查询: 数据查询
   */
  String DATAQUERY_DEFAULT = "DEFAULT";
  /**
   * 查询: 已办
   */
  String DATAQUERY_DONE = "Done";
  /**
   * 查询: 办结
   */
  String DATAQUERY_FINISH = "Finish";
  /**
   * 查询: 基础属性查询
   */
  String DATAQUERY_SIMPLE = "SIMPLE";
  /**
   * 查询: 发起
   */
  String DATAQUERY_STARTED = "Started";
  /**
   * 查询: 待办
   */
  String DATAQUERY_TODO = "Todo";
  /**
   * 查询: 待阅
   */
  String DATAQUERY_TOREAD = "Toread";
  /**
   * 查询: 未提交
   */
  String DATAQUERY_UNDO = "Undo";
  /**
   * 查询: 默认（全部数据）
   */
  String DATAQUERY_VIEW = "VIEW";
  /**
   * 集合: 抄送
   */
  String DATASET_CARBONCOPY = "CarbonCopy";
  /**
   * 集合: 当前用户数据
   */
  String DATASET_CURUSER = "CurUser";
  /**
   * 集合: 数据集
   */
  String DATASET_DEFAULT = "DEFAULT";
  /**
   * 集合: 已办
   */
  String DATASET_DONE = "Done";
  /**
   * 集合: 办结
   */
  String DATASET_FINISH = "Finish";
  /**
   * 集合: 已办
   */
  String DATASET_LASTDONE = "LastDone";
  /**
   * 集合: 发起
   */
  String DATASET_STARTED = "Started";
  /**
   * 集合: 待办
   */
  String DATASET_TODO = "Todo";
  /**
   * 集合: 待阅
   */
  String DATASET_TOREAD = "Toread";
  /**
   * 集合: 未提交
   */
  String DATASET_UNDO = "Undo";

    @Override
    default String getDataEntityId() {
        return DATAENTITYID;
    }

    @Override
    default IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String strName = iPSDEMethodDTO.getName();
        switch (strName) {
            case "TodoDTO":
                return new TodoDTO();
            case "TodoSimpleDTO":
                return new TodoSimpleDTO();
            default:
                return null;
        }
    }

    @Override
    default ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        return new SearchContextDTO();
    }

    @Override
    default Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
        switch (strActionName.toLowerCase()) {
            case "create" :
                this.create((TodoDTO) args[0]);
                return null;
            case "update" :
                this.update((TodoDTO) args[0]);
                return null;
            case "remove" :
                this.remove((List<String>) args[0]);
                return null;
            case "get" :
                return this.get((String) args[0]);
            case "getdraft" :
                return this.getDraft((TodoDTO) args[0]);
            case "activate" :
                return this.activate((TodoDTO) args[0]);
            case "cancel" :
                return this.cancel((TodoDTO) args[0]);
            case "checkkey" :
                return this.checkKey((TodoDTO) args[0]);
            case "complete" :
                return this.complete((TodoDTO) args[0]);
            case "delegate" :
                return this.delegate((TodoDTO) args[0]);
            case "getlinkurl" :
                return this.getLinkUrl((TodoDTO) args[0]);
            case "getlinkurlmob" :
                return this.getLinkUrlMob((TodoDTO) args[0]);
            case "markread" :
                return this.markRead((TodoDTO) args[0]);
            case "pause" :
                return this.pause((TodoDTO) args[0]);
            case "reassign" :
                return this.reassign((TodoDTO) args[0]);
            case "resolve" :
                return this.resolve((TodoDTO) args[0]);
            case "rollback" :
                return this.rollback((TodoDTO) args[0]);
            case "save" :
                this.save((TodoDTO) args[0]);
                return null;
            case "sendmsg" :
                return this.sendMsg((TodoDTO) args[0]);
        }
        return this.getDataEntityRuntime().executeAction(strActionName, iPSDEAction, args, true);
    }

    @Override
    default Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
        switch (strDataSetName.toLowerCase()) {
            case "carboncopy" :
               return this.fetchCarbonCopy((ISearchContextDTO) args[0]);
            case "curuser" :
               return this.fetchCurUser((ISearchContextDTO) args[0]);
            case "default" :
               return this.fetchDefault((ISearchContextDTO) args[0]);
            case "done" :
               return this.fetchDone((ISearchContextDTO) args[0]);
            case "finish" :
               return this.fetchFinish((ISearchContextDTO) args[0]);
            case "lastdone" :
               return this.fetchLastDone((ISearchContextDTO) args[0]);
            case "started" :
               return this.fetchStarted((ISearchContextDTO) args[0]);
            case "todo" :
               return this.fetchTodo((ISearchContextDTO) args[0]);
            case "toread" :
               return this.fetchToread((ISearchContextDTO) args[0]);
            case "undo" :
               return this.fetchUndo((ISearchContextDTO) args[0]);
        }
        return this.getDataEntityRuntime().fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
    } 

    /**
     * Create
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Create.ibizmodel.yaml
     */
    default void create(TodoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Create", null, new Object[]{dto}, true);
    }

    /**
     * Update
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Update.ibizmodel.yaml
     */
    default void update(TodoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Update", null, new Object[]{dto}, true);
    }

    /**
     * Remove
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Remove.ibizmodel.yaml
     */
    default void remove(List<String> keys) throws Throwable {
        this.getDataEntityRuntime().executeAction("Remove", null, new Object[]{keys}, true);
    }

    /**
     * Get
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Get.ibizmodel.yaml
     */
    default TodoDTO get(String key) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Get", null, new Object[]{key}, true);
    }

    /**
     * GetDraft
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/GetDraft.ibizmodel.yaml
     */
    default TodoDTO getDraft(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("GetDraft", null, new Object[]{dto}, true);
    }

    /**
     * 激活
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Activate.ibizmodel.yaml
     */
    default TodoDTO activate(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Activate", null, new Object[]{dto}, true);
    }

    /**
     * 取消
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Cancel.ibizmodel.yaml
     */
    default TodoDTO cancel(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Cancel", null, new Object[]{dto}, true);
    }

    /**
     * CheckKey
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/CheckKey.ibizmodel.yaml
     */
    default Integer checkKey(TodoDTO dto) throws Throwable {
        return (Integer) this.getDataEntityRuntime().executeAction("CheckKey", null, new Object[]{dto}, true);
    }

    /**
     * 完成
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Complete.ibizmodel.yaml
     */
    default TodoDTO complete(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Complete", null, new Object[]{dto}, true);
    }

    /**
     * 委派
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Delegate.ibizmodel.yaml
     */
    default TodoDTO delegate(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Delegate", null, new Object[]{dto}, true);
    }

    /**
     * 获取链接地址
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/GetLinkUrl.ibizmodel.yaml
     */
    default TodoDTO getLinkUrl(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("GetLinkUrl", null, new Object[]{dto}, true);
    }

    /**
     * 移动端获取链接地址
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/GetLinkUrlMob.ibizmodel.yaml
     */
    default TodoDTO getLinkUrlMob(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("GetLinkUrlMob", null, new Object[]{dto}, true);
    }

    /**
     * 设置已读
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/MarkRead.ibizmodel.yaml
     */
    default TodoDTO markRead(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("MarkRead", null, new Object[]{dto}, true);
    }

    /**
     * 挂起
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Pause.ibizmodel.yaml
     */
    default TodoDTO pause(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Pause", null, new Object[]{dto}, true);
    }

    /**
     * 转办
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Reassign.ibizmodel.yaml
     */
    default TodoDTO reassign(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Reassign", null, new Object[]{dto}, true);
    }

    /**
     * 完成委派
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Resolve.ibizmodel.yaml
     */
    default TodoDTO resolve(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Resolve", null, new Object[]{dto}, true);
    }

    /**
     * 回滚
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Rollback.ibizmodel.yaml
     */
    default TodoDTO rollback(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("Rollback", null, new Object[]{dto}, true);
    }

    /**
     * Save
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/Save.ibizmodel.yaml
     */
    default void save(TodoDTO dto) throws Throwable {
        this.getDataEntityRuntime().executeAction("Save", null, new Object[]{dto}, true);
    }

    /**
     * 待办消息发送
     *
     * @param dto
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdeactions/SendMsg.ibizmodel.yaml
     */
    default TodoDTO sendMsg(TodoDTO dto) throws Throwable {
        return (TodoDTO) this.getDataEntityRuntime().executeAction("SendMsg", null, new Object[]{dto}, true);
    }

    /**
     * 抄送
     * 包含数据查询：抄送
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/CarbonCopy.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/CarbonCopy.ibizmodel.ui
     */
    default Page<TodoDTO> fetchCarbonCopy(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("CarbonCopy", null, new Object[]{dto}, true);
    }

    /**
     * 当前用户数据
     * 包含数据查询：当前用户数据
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/CurUser.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/CurUser.ibizmodel.ui
     */
    default Page<TodoDTO> fetchCurUser(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("CurUser", null, new Object[]{dto}, true);
    }

    /**
     * 数据集
     * 包含数据查询：数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/DEFAULT.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default Page<TodoDTO> fetchDefault(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("DEFAULT", null, new Object[]{dto}, true);
    }

    /**
     * 已办
     * 包含数据查询：已办
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/Done.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Done.ibizmodel.ui
     */
    default Page<TodoDTO> fetchDone(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("Done", null, new Object[]{dto}, true);
    }

    /**
     * 办结
     * 包含数据查询：办结
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/Finish.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Finish.ibizmodel.ui
     */
    default Page<TodoDTO> fetchFinish(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("Finish", null, new Object[]{dto}, true);
    }

    /**
     * 已办
     * 包含数据查询：已办
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/LastDone.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Done.ibizmodel.ui
     */
    default Page<TodoDTO> fetchLastDone(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("LastDone", null, new Object[]{dto}, true);
    }

    /**
     * 发起
     * 包含数据查询：发起
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/Started.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Started.ibizmodel.ui
     */
    default Page<TodoDTO> fetchStarted(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("Started", null, new Object[]{dto}, true);
    }

    /**
     * 待办
     * 包含数据查询：待办
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/Todo.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Todo.ibizmodel.ui
     */
    default Page<TodoDTO> fetchTodo(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("Todo", null, new Object[]{dto}, true);
    }

    /**
     * 待阅
     * 包含数据查询：待阅
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/Toread.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Toread.ibizmodel.ui
     */
    default Page<TodoDTO> fetchToread(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("Toread", null, new Object[]{dto}, true);
    }

    /**
     * 未提交
     * 包含数据查询：未提交
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedatasets/Undo.ibizmodel.yaml
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Undo.ibizmodel.ui
     */
    default Page<TodoDTO> fetchUndo(ISearchContextDTO dto) throws Throwable {
        return (Page<TodoDTO>) this.getDataEntityRuntime().fetchDataSet("Undo", null, new Object[]{dto}, true);
    }


    /**
     * 抄送
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/CarbonCopy.ibizmodel.ui
     */
    default List<TodoDTO> selectCarbonCopy(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CarbonCopy", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 当前用户数据
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/CurUser.ibizmodel.ui
     */
    default List<TodoDTO> selectCurUser(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("CurUser", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 数据查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/DEFAULT.ibizmodel.ui
     */
    default List<TodoDTO> selectDefault(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("DEFAULT", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 已办
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Done.ibizmodel.ui
     */
    default List<TodoDTO> selectDone(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Done", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 办结
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Finish.ibizmodel.ui
     */
    default List<TodoDTO> selectFinish(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Finish", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 基础属性查询
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/SIMPLE.ibizmodel.ui
     */
    default List<TodoSimpleDTO> selectSimple(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("SIMPLE", dto);
        return (List<TodoSimpleDTO>) obj;
    }


    /**
     * 发起
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Started.ibizmodel.ui
     */
    default List<TodoDTO> selectStarted(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Started", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 待办
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Todo.ibizmodel.ui
     */
    default List<TodoDTO> selectTodo(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Todo", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 待阅
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Toread.ibizmodel.ui
     */
    default List<TodoDTO> selectToread(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Toread", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 未提交
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/Undo.ibizmodel.ui
     */
    default List<TodoDTO> selectUndo(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("Undo", dto);
        return (List<TodoDTO>) obj;
    }


    /**
     * 默认（全部数据）
     *
     * @param dto
     * @return
     * @throws Throwable
     * @see ibizmos:/psmodules/notify/psdataentities/SYS_TODO/psdedataqueries/VIEW.ibizmodel.ui
     */
    default List<TodoDTO> selectView(ISearchContextDTO dto) throws Throwable {
        Object obj = this.getDataEntityRuntime().selectDataQuery("VIEW", dto);
        return (List<TodoDTO>) obj;
    }

}

