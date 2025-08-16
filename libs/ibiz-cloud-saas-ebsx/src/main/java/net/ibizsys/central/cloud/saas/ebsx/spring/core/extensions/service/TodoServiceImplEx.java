package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Priority;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.TodoHisDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.ITodoHisService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.service.impl.TodoServiceImpl;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFInstanceDTO;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;

@Priority(100)
@Service
public class TodoServiceImplEx extends TodoServiceImpl {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TodoServiceImplEx.class);

	private ICloudSaaSUtilRuntime iCloudSaaSUtilRuntime = null;


	public static String PREKEY_WFINST ="WFINST__";

	public static String PREKEY_TODOHIS ="TODOHIS__";

	public static String PREKEY_CARBONCOPY ="CARBONCOPY__";


	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		if(this.iCloudSaaSUtilRuntime != null) {
			return this.iCloudSaaSUtilRuntime;
		}

		this.iCloudSaaSUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ICloudSaaSUtilRuntime.class, false);
		return this.iCloudSaaSUtilRuntime;
	}


	@Override
	public void create(TodoDTO et) throws Throwable{

		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			userId = (String)et.get("todousers");
		}
		if (ObjectUtils.isEmpty(userId)) {
			throw new Exception("未指定待办操作用户");
		}

		String srfkeys = "";
		String[] ids = userId.trim().split("[,;]");
		for (int i = 0; i < ids.length; i++) {
			TodoDTO item = new TodoDTO();
			et.copyTo(item);
			item.setUserId(ids[i]);
			super.create(item);
			if (!ObjectUtils.isEmpty(srfkeys)) {
				srfkeys += ";";
			}
			srfkeys += item.getTodoId();
		}
		et.set("srfkeys", srfkeys);


//		Object userId = et.get("todousers");
//		if(org.springframework.util.StringUtils.isEmpty(userId)){
//			throw new BadRequestException("未指定待办操作用户");
//		}
//		String strUserIds = userId.toString();
//		if(strUserIds.indexOf(";") != -1){
//			String srfkeys = "";
//			String[] ids = strUserIds.trim().split(";");
//			for(int i=0; i<ids.length; i++){
//				SysTodo item = new SysTodo();
//				et.copyTo(item,false);
//				item.setUserid(ids[i]);
//				this.retBool(this.baseMapper.insert(item));
//				if(!org.springframework.util.StringUtils.isEmpty(srfkeys)){
//					srfkeys+=";";
//				}
//				srfkeys+=item.getTodoid();
//			}
//			et.set("srfkeys", srfkeys);
//			return true;
//		}
//		else{
//			et.setUserid(strUserIds);
//			et.set("srfkeys", strUserIds);
//		}
//		boolean ret = this.retBool(this.baseMapper.insert(et));
//		if(ret) {
//			//添加待办消息
//			this.addTodoMsg(et);
//		}
//		return ret;
	}



	@Override
	public TodoDTO get(String key) throws Throwable {
		if(StringUtils.hasLength(key)){
			if(key.indexOf(PREKEY_TODOHIS) ==0){
				String tempKey = key.substring(PREKEY_TODOHIS.length());

				//return todoTodoHisMapping.toDomain(sysTodoHisService.get(tempKey));
				TodoHisDTO todoHisDTO = this.getSystemRuntime().getTodoHisService().get(tempKey);
				return (TodoDTO)this.getDataEntityRuntime().getDEMapRuntime("TodoHis", false).fromEntityDTO(todoHisDTO);


			}else if(key.indexOf(PREKEY_CARBONCOPY) ==0){
				String tempKey = key.substring(PREKEY_CARBONCOPY.length());
				//return todoCarbonCopyMapping.toDomain(sysCarbonCopyService.get(tempKey));
				CarbonCopyDTO carbonCopyDTO = this.getSystemRuntime().getCarbonCopyService().get(tempKey);
				return (TodoDTO)this.getDataEntityRuntime().getDEMapRuntime("CarbonCopy", false).fromEntityDTO(carbonCopyDTO);

			}else if(key.indexOf(PREKEY_WFINST) ==0){
				String tempKey = key.substring(PREKEY_WFINST.length());
				//return todoWFInstMapping.toDomain(wfProcessInstanceService.get(tempKey));
				WFInstanceDTO wfInstanceDTO = this.getSystemRuntime().getWFInstanceService().get(tempKey);
				return (TodoDTO)this.getDataEntityRuntime().getDEMapRuntime("WFInst", false).fromEntityDTO(wfInstanceDTO);

			}
		}
		return super.get(key);
	}




	@Override
	public void remove(List<String> keys) throws Throwable {
		if(ObjectUtils.isEmpty(keys)) {
			return;
		}
		for(String key : keys) {
			if(key.indexOf(PREKEY_TODOHIS) ==0){
				String tempKey = key.substring(PREKEY_TODOHIS.length());
				this.getSystemRuntime().getTodoHisService().remove(Arrays.asList(tempKey));
			}else if(key.indexOf(PREKEY_CARBONCOPY) ==0){
				String tempKey = key.substring(PREKEY_CARBONCOPY.length());
				this.getSystemRuntime().getCarbonCopyService().remove(Arrays.asList(tempKey));

			}else if(key.indexOf(PREKEY_WFINST) ==0){
				String tempKey = key.substring(PREKEY_WFINST.length());
				this.getSystemRuntime().getWFInstanceService().remove(Arrays.asList(tempKey));
			}
			else {
				super.remove(Arrays.asList(key));
			}
		}
	}




	@Override
	public Page<TodoDTO> fetchCurUser(ISearchContextDTO dto) throws Throwable {

		// this.fillByWFSteps(context);

		String strTodoSubType = (String) dto.get("n_todosubtype_eq");
		if (StringUtils.hasLength(strTodoSubType)) {
			if (StaticDict.TodoSubType.DONE.toString().equalsIgnoreCase(strTodoSubType)) { // 已办
				return this.fetchDone(dto);// handleDataSet(this.searchDone(context));
			} else if (StaticDict.TodoSubType.CARBONCOPY.toString().equalsIgnoreCase(strTodoSubType)) { // 抄送
				return this.fetchCarbonCopy(dto);
				// return handleDataSet(this.searchCarbonCopy(context));
			} else if (StaticDict.TodoSubType.STARTED.toString().equalsIgnoreCase(strTodoSubType)) { // 发起
				// return handleDataSet(this.searchStarted(context));
				return this.fetchStarted(dto);
			} else if (StaticDict.TodoSubType.UNDO.toString().equalsIgnoreCase(strTodoSubType)) { // 未提交
				// return handleDataSet(this.searchUndo(context));
				return this.fetchUndo(dto);
			} else if (StaticDict.TodoSubType.FINISH.toString().equalsIgnoreCase(strTodoSubType)) { // 办结
				// return handleDataSet(this.searchFinish(context));
				return this.fetchFinish(dto);
			} else if (StaticDict.TodoSubType.TOREAD.toString().equalsIgnoreCase(strTodoSubType)) { // 待阅
				// return handleDataSet(this.searchToread(context));
				return this.fetchToread(dto);
			} else if (StaticDict.TodoSubType.TODO.toString().equalsIgnoreCase(strTodoSubType)) { // 代办
				// return handleDataSet(this.searchToread(context));
				return this.fetchTodo(dto);
			}
		}

		return super.fetchCurUser(dto);
	}

	@Override
	protected TodoDTO onGetLinkUrl(TodoDTO dto) throws Throwable {
		String srfwf = dto.getTodoSubType();
		String urltype = dto.getTodoUrlType();
		String strTodoId = dto.getTodoId();
		String srfapp = dto.getString("srfapp", null);
		String srfapptype = dto.getString("srfapptype", null);
		TodoDTO todo = this.get(strTodoId);
		// if (todo == null)
		// throw new BadRequestAlertException("计算应用跳转路径失败:代办数据不存在", "WFTask",
		// strTodoId);
		if ((StaticDict.TodoType.WFTASK.toString().equals(todo.getTodoType()) || StaticDict.TodoType.WFCC.toString().equals(todo.getTodoType())) && StringUtils.hasLength(srfwf)) {
			String appRedirectPath = "";
			String strSystemId = "";
			String strSystemAppId = "";
			String strDCSystemid = "";
			String strEntityName = "";
			String strWFTaskId = todo.getParam01();
			// 获取不到取最新记录
			if (strWFTaskId == null) {

				// TodoDTOSearchContext context = new TodoDTOSearchContext();
				// context.setN_bizkey_eq(todo.getBizkey());
				// context.setSort("t1.createdate,desc");
				// context.setSize(1);
				// Page<TodoDTO> sysTodoPage = this.searchDefault(context);
				// if(sysTodoPage != null && sysTodoPage.getContent().size() >
				// 0){
				// todo = sysTodoPage.getContent().get(0);
				// strWFTaskId = todo.getParam01();
				// }
				SearchContextDTO searchContextDTO = new SearchContextDTO().limit(1).eq(FIELD_BIZKEY, todo.getBizKey()).sort("createdate,desc");
				List<TodoDTO> list = this.selectDefault(searchContextDTO);
				if (!ObjectUtils.isEmpty(list)) {
					todo = list.get(0);
					strWFTaskId = todo.getParam01();
				}
			}
			// if (todo == null)
			// throw new BadRequestAlertException("计算应用跳转路径失败:代办数据不存在",
			// "WFTask", strWFTaskId);

			String strprocessDefinitionKey = todo.getParam02();
			String strBusinessKey = todo.getBizKey();
			String strTaskdefinitionkey = todo.getParam03();
			//老模式计算工作流所属应用开始
			String strProcessinstancebusinesskey2 = todo.getClobParam01();
			if (!ObjectUtils.isEmpty(strProcessinstancebusinesskey2)) {
				String[] businesskey = strProcessinstancebusinesskey2.split(":");
				if (businesskey.length >= 3) {
					strSystemId = businesskey[0];
					strSystemAppId = businesskey[1];
					strEntityName = businesskey[2];
				} else {
					//throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("计算系统标识有误"));
					// 此处代码有问题
					strSystemId = todo.getDCSystemId();
					strSystemAppId = strProcessinstancebusinesskey2;
					strEntityName = todo.getBizType();
				}

				Collection<Application> applicationList  =	getCloudSaaSUtilRuntime().getApplications(strSystemId);
				DCSystem dcSystem = getCloudSaaSUtilRuntime().getDCSystem(strSystemId, EmployeeContext.getCurrentMust().getTenant());
				// 需要指定租户标识
//				DCSystemDTO dcSystem = EBSXSystemRuntime.getInstance().getDCSystemService().selectOne(new SearchContextDTO().all().eq(IDCSystemService.FIELD_SYSTEMID, strSystemId).eq(IDCSystemService.FIELD_SRFDCID, EmployeeContext.getCurrentMust().getTenant()), true);
//				if (dcSystem == null) {
//					throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法获取机构系统标识"));
//				}
//
//				List<ApplicationDTO> applicationList = EBSXSystemRuntime.getInstance().getApplicationService().selectDefault(new SearchContextDTO().all().eq(IApplicationService.FIELD_SYSTEMID, strSystemId));

				// 获取前端传入类型
				if(StringUtils.hasLength(srfapp)) {
					//传入应用，重新指定应用
					strSystemAppId = srfapp;
				}
				else
				if(StringUtils.hasLength(srfapptype)) {
					strSystemAppId = "";
				}

				Application application = null;
				if (!ObjectUtils.isEmpty(applicationList)) {
					if (StringUtils.hasLength(strSystemAppId)) {
						for (Application item : applicationList) {
							if (!strSystemAppId.equalsIgnoreCase(item.getCodeName())) {
								continue;
							}
							application = item;
							break;
						}
					}
					else
					if (StringUtils.hasLength(srfapptype)) {
						for (Application item : applicationList) {
							if(DataTypeUtils.getIntegerValue(item.getMobileApp(), 0) == 1) {
								if (!"mob".equalsIgnoreCase(srfapptype)) {
									continue;
								}
							}
							else {
								if ("mob".equalsIgnoreCase(srfapptype)) {
									continue;
								}
							}
							application = item;
							break;
						}
					}
					if (application == null) {
						//新模式：从应用部署工作流中自动获取匹配应用
						String[] processDefinitionKey = strprocessDefinitionKey.split("-");
						if(processDefinitionKey.length>3){
							strEntityName = processDefinitionKey[2];
							String strWFVersionName = processDefinitionKey[3];
							//提取工作流代码标识
							String strWorkflowCodeName = strWFVersionName.substring(0,strWFVersionName.lastIndexOf("v"));
							strDCSystemid = dcSystem.getDCSystemId();
							for (Application item : applicationList) {
								if(!ObjectUtils.isEmpty(item.getAppWFs())){
									String[] AppWFs = item.getAppWFs().split(";");
									//判断该应用是否部署该流程
									if(Arrays.asList(AppWFs).contains(strWorkflowCodeName)){
										//判断是否获取的是移动端的重定向
										if(DataTypeUtils.getIntegerValue(item.getMobileApp(), 0) == 1) {
											if (!"mob".equalsIgnoreCase(srfapptype)) {
												continue;
											}
										}else {
											if ("mob".equalsIgnoreCase(srfapptype)) {
												continue;
											}
										}
										application = item;
										break;
									}
								}
							}

							if(application != null) {
								Map<String, Object> viewparams = new HashMap<>();
								viewparams.put("processDefinitionKey", strprocessDefinitionKey);
								viewparams.put("taskDefinitionKey", strTaskdefinitionkey);
								viewparams.put("srfwf", srfwf.toLowerCase());
								viewparams.put("srftaskid", strWFTaskId);
								viewparams.put("srfdcsystem", strDCSystemid);
								viewparams.put("srfdename", strEntityName);
								viewparams.put("srfkey", strBusinessKey);
								String redirectUrlPart = formatWorkflowRedirectUrl(application, viewparams);
								appRedirectPath = caclWorkflowRedirectUrl(application.getUrl(), redirectUrlPart, application, urltype).replace("#", String.format("?srfdcsystem=%1$s#", strDCSystemid));
								dto.setLinkUrl(appRedirectPath);
								return dto;
							}
						}
						//新旧模式均无法查询到确切应用时默认选取一个应用
						java.util.Iterator<Application> apps = applicationList.iterator();
						while(apps.hasNext()) {
							application = apps.next();
							break;
						}

					}
				}

				if (application == null) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法计算打开的系统应用"));
				}


				strDCSystemid = dcSystem.getDCSystemId();

				String strAppUrl = application.getUrl();
				if(!StringUtils.hasLength(strAppUrl)) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("未定义应用访问路径"));
				}

				if (!strAppUrl.endsWith(application.getIndexCodeName())) {
					strAppUrl = strAppUrl + application.getIndexCodeName();
				}
				Map<String, Object> viewparams = new HashMap<>();
				viewparams.put("processDefinitionKey", strprocessDefinitionKey);
				viewparams.put("taskDefinitionKey", strTaskdefinitionkey);
				viewparams.put("srfwf", srfwf.toLowerCase());
				viewparams.put("srftaskid", strWFTaskId);
				viewparams.put("srfdcsystem", strDCSystemid);
				viewparams.put("srfdename", strEntityName);
				viewparams.put("srfkey", strBusinessKey);
				String redirectUrlPart = formatWorkflowRedirectUrl(application, viewparams);
				appRedirectPath = caclWorkflowRedirectUrl(application.getUrl(), redirectUrlPart, application, urltype).replace("#", String.format("?srfdcsystem=%1$s#", strDCSystemid));
				dto.setLinkUrl(appRedirectPath);
				return dto;
			}

			// throw new DataEntityRuntimeException(this.getDataEntityRuntime(),
			// String.format("计算应用跳转路径失败:未指定跳转应用"));
			// throw new BadRequestAlertException("计算应用跳转路径失败:未指定跳转应用",
			// "WFTask", strWFTaskId);

			//活动调用子流程|草稿数据适配：从应用部署工作流中自动获取匹配应用
			if(!ObjectUtils.isEmpty(strprocessDefinitionKey)) {
				String strWorkflowCodeName = "";
				String[] processDefinitionKey = strprocessDefinitionKey.split("-");
				if (processDefinitionKey.length > 3) {
					strSystemId = processDefinitionKey[1];
					strEntityName = processDefinitionKey[2];
					String strWFVersionName = processDefinitionKey[3];
					//提取工作流代码标识
					strWorkflowCodeName = strWFVersionName.substring(0, strWFVersionName.lastIndexOf("v"));

				} else {
					//识别草稿数据
					strWorkflowCodeName = strprocessDefinitionKey;
					strSystemId = todo.getDCSystemId();
					strEntityName = todo.getBizType();
				}
				Collection<Application> applicationList = getCloudSaaSUtilRuntime().getApplications(strSystemId);
				DCSystem dcSystem = getCloudSaaSUtilRuntime().getDCSystem(strSystemId, EmployeeContext.getCurrentMust().getTenant());
				strDCSystemid = dcSystem.getDCSystemId();
				Application application = null;
				if (!ObjectUtils.isEmpty(applicationList)) {
					for (Application item : applicationList) {
						if (!ObjectUtils.isEmpty(item.getAppWFs())) {
							String[] AppWFs = item.getAppWFs().split(";");
							//判断该应用是否部署该流程
							if (Arrays.asList(AppWFs).contains(strWorkflowCodeName.toLowerCase())) {
								//判断是否获取的是移动端的重定向
								if (DataTypeUtils.getIntegerValue(item.getMobileApp(), 0) == 1) {
									if (!"mob".equalsIgnoreCase(srfapptype)) {
										continue;
									}
								} else {
									if ("mob".equalsIgnoreCase(srfapptype)) {
										continue;
									}
								}
								application = item;
								break;
							}
						}
					}

					if (application != null) {
						Map<String, Object> viewparams = new HashMap<>();
						viewparams.put("processDefinitionKey", strprocessDefinitionKey);
						viewparams.put("taskDefinitionKey", strTaskdefinitionkey);
						viewparams.put("srfwf", srfwf.toLowerCase());
						viewparams.put("srftaskid", strWFTaskId);
						viewparams.put("srfdcsystem", strDCSystemid);
						viewparams.put("srfdename", strEntityName);
						viewparams.put("srfkey", strBusinessKey);
						String redirectUrlPart = formatWorkflowRedirectUrl(application, viewparams);
						appRedirectPath = caclWorkflowRedirectUrl(application.getUrl(), redirectUrlPart, application, urltype).replace("#", String.format("?srfdcsystem=%1$s#", strDCSystemid));
						dto.setLinkUrl(appRedirectPath);
						return dto;
					}
				}
			}
		}


		return todo;
	}

	@Override
	protected TodoDTO onGetLinkUrlMob(TodoDTO dto) throws Throwable {
		return this.getLinkUrl(dto);
	}

	protected String formatWorkflowRedirectUrl(Application redirectApp, Map viewparam) {
		String strViewPathFormats = redirectApp.getViewPathFormat();
		if (!StringUtils.hasLength(strViewPathFormats)) {
			return null;
		}

		// EBSXSystemRuntime.getInstance().des
		List viewPathFormats = EBSXSystemRuntime.getInstance().deserialize(strViewPathFormats, List.class);
		// JsonNode jsonNode = JsonUtils.toJsonNode(strViewPathFormats);
		//
		// ArrayNode viewPathFormats =
		// JsonUtils.toArrayNode(strViewPathFormats);
		String formatType = "TODOGLOBALREDIRECT";
		if (viewPathFormats != null && viewPathFormats.size() > 0) {
			for (Object format : viewPathFormats) {
				Map<String, Object> map = (Map<String, Object>) format;
				if (formatType.equals(map.get("formattype"))) {
					String formattempl = map.get("formattempl").toString();
					Map<String, Object> viewparammap = (Map<String, Object>) viewparam;
					if (StringUtils.hasLength(redirectApp.getIndexCodeName()))
						viewparammap.put("srfindexname", redirectApp.getIndexCodeName().toLowerCase());
					else
						viewparammap.put("srfindexname", "");
					return renderString(formattempl, viewparammap);
				}
			}
		}
		return "";
	}

	protected String caclWorkflowRedirectUrl(String appurl, String originUrl, Application redirectApp, String urlType) {
		// 判断是否包含应用名
		if ("RouterUrl".equals(urlType))
			return originUrl;
		if (appurl.endsWith(redirectApp.getIndexCodeName()))
			return appurl = appurl.substring(0, appurl.lastIndexOf(redirectApp.getIndexCodeName())) + originUrl;
		return appurl + originUrl;
	}

	protected static String renderString(String content, Map<String, Object> map) {
		Set<Map.Entry<String, Object>> sets = map.entrySet();
		for (Map.Entry<String, Object> entry : sets) {
			String regex = "\\$\\{" + entry.getKey() + "\\}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(content);
			String strValue = (String) entry.getValue();
			if (!StringUtils.isEmpty(strValue)) {
				if (entry.getKey().equalsIgnoreCase("srfKey") || entry.getKey().equalsIgnoreCase("processDefinitionKey")) {
					content = matcher.replaceAll(strValue);
				} else {
					content = matcher.replaceAll(strValue.toLowerCase());
				}
			}
		}
		return content;
	}

	// /**
	// * 根据步骤指定查询代办
	// * @param context
	// * @return
	// */
	// public void fillByWFSteps(TodoDTOSearchContext context) {
	// String srfwfsteps = context.getSrfwfstep();
	// if (!ObjectUtils.isEmpty(srfwfsteps)) {
	// List stepList = Arrays.asList(srfwfsteps.split(";"));
	// context.getSearchCond().in("t1.PARAM06", stepList);
	// }
	// }

	@Override
	protected TodoDTO onComplete(TodoDTO et) throws Throwable {
		//生成处理时间
		Timestamp processDate = new Timestamp(System.currentTimeMillis());
		boolean enableLastOpt = true;

		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			// throw new BadRequestException("未指定操作用户");
			throw new Exception("未指定操作用户");
		}
		boolean hasTodo = false;
		String srfkeys = "";
		List<TodoDTO> list = this.getWFTaskTodos(et);
		if (ObjectUtils.isEmpty(list)) {
			return et;
		}


		ITodoHisService iTodoHisService = this.getSystemRuntime().getTodoHisService();

		// 标记最后操作的任务，将前一个任务flag置空
		if(Boolean.valueOf(enableLastOpt)){
			String realInstId = et.getParam09();
			if(StringUtils.isEmpty(realInstId)){
				log.error("缺失流程实例标识");
				throw new Exception("缺失流程实例标识");
			}
			List<TodoHisDTO> todohisList = iTodoHisService.selectDefault(new SearchContextDTO().eq(FIELD_PARAM09, realInstId).eq(FIELD_USERID,userId));
			java.util.Iterator<TodoHisDTO> iterator = todohisList.iterator();
			while (iterator.hasNext()) {
				TodoHisDTO todoHisDTO = iterator.next();
				todoHisDTO.setLastOpt(Integer.parseInt(StaticDict.YesNo.ITEM_0.getValue()));
			}
			if(!todohisList.isEmpty()) {
				iTodoHisService.rawUpdate(todohisList);
			}
		}

		for (TodoDTO item : list) {
			// 添加待办历史
			String tempId = item.getTodoId();
			TodoHisDTO todoHis = new TodoHisDTO();
			// item.copyTo(todoHis, false);
			// item.setTodoId(tempId);
			item.copyTo(todoHis);

			if (userId.equalsIgnoreCase(item.getUserId())) {
				todoHis.setTodoState(StaticDict.TodoState.COMPLETED.getValue());
				et = item;
				hasTodo = true;
				// 标记最后操作的任务，打flag
				 if(Boolean.valueOf(enableLastOpt)){
				 	todoHis.setLastOpt(Integer.parseInt(StaticDict.YesNo.ITEM_1.getValue()));
				 }
			} else {
				todoHis.setTodoState(StaticDict.TodoState.CANCELED.getValue());
			}
			todoHis.setProcessDate(processDate);
//			iTodoHisService.rawCreate(Arrays.asList(todoHis));
			//启用标准新建模式以适配模型中配置的建立后附加建立实体通知逻辑
			iTodoHisService.create(todoHis);
			// 删除待办数据
			this.remove(Arrays.asList(item.getTodoId()));
			if (!ObjectUtils.isEmpty(srfkeys)) {
				srfkeys += ";";
			}
			srfkeys += item.getTodoId();
		}
		if (!hasTodo) {
			log.error("未找到操作用户的待办数据");
			// throw new BadRequestException("未找到操作用户的待办数据");
		}
		et.set("srfkeys", srfkeys);
		return et;
	}

	/**
	 * 查询工作流任务待办清单
	 *
	 * @param et
	 * @return
	 */
	protected List<TodoDTO> getWFTaskTodos(TodoDTO et) throws Throwable {
		String taskId = et.getParam01();
		if (ObjectUtils.isEmpty(taskId)) {
			// log.error("未指定流程任务标识");
			// throw new BadRequestException("未指定流程任务标识");
			throw new Exception("未指定流程任务标识");
		}

		List<TodoDTO> todoList = this.selectDefault(new SearchContextDTO().eq(FIELD_PARAM01, taskId));
		if (ObjectUtils.isEmpty(todoList)) {
			log.error(String.format("无效的流程任务标识[%1$s]", taskId));
		}
		return todoList;
		// TodoDTOSearchContext context = new TodoDTOSearchContext();
		// context.setN_param01_eq(taskId);
		// List<TodoDTO> list = this.selectDefault(context);
		// if(list == null || list.size() == 0){
		// log.error("无效的流程任务标识");
		// //throw new BadRequestException("无效的流程任务标识");
		// }
		// return list;

	}

	@Override
	protected TodoDTO onMarkRead(TodoDTO et) throws Throwable {
		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			throw new Exception("未指定操作用户");
		}
		String todoId = et.getTodoId();
		if (!ObjectUtils.isEmpty(todoId)) {

			// et = this.getById(todoId);
			TodoDTO toto = this.get(todoId);

			if (userId.equalsIgnoreCase(toto.getUserId())) {
				et.setIsRead(1);
				this.update(et);
			} else {
				throw new Exception("无效的待办任务标识");
			}
		} else {
			// boolean hasData = false;
			// List<TodoDTO> list = this.getWFTaskTodos(et);
			// for(TodoDTO item : list){
			// if(userId.equalsIgnoreCase(item.getUserId())){
			// item.setIsread(1);
			// //挂起当前待办数据
			// this.update(item);
			// et = item;
			// hasData = true;
			// break;
			// }
			// }
			// if(!hasData){
			// throw new BadRequestException("无效的流程任务标识");
			// }
			throw new Exception("没有实现");
		}
		return et;
	}

	@Override
	protected TodoDTO onReassign(TodoDTO et) throws Throwable {
		//生成处理时间
		Timestamp processDate = new Timestamp(System.currentTimeMillis());
		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			throw new Exception("未指定操作用户");
		}
		String targetUserId = et.getParam02();
		if (ObjectUtils.isEmpty(targetUserId)) {
			throw new Exception("未指定委派用户");
		}
		List<TodoDTO> list = this.getWFTaskTodos(et);
		// 挂起当前待办数据
		for (TodoDTO item : list) {
			if (userId.equalsIgnoreCase(item.getUserId())) {
				// 添加转办历史记录
				// String tempId = item.getTodoId();
				TodoHisDTO todoHis = new TodoHisDTO();
				item.copyTo(todoHis);
				// item.setTodoId(tempId);
				todoHis.setTodoState(StaticDict.TodoState.COMPLETED.getValue());
				todoHis.setProcessDate(processDate);
				this.getSystemRuntime().getTodoHisService().create(todoHis);
//				this.getSystemRuntime().getTodoHisService().rawCreate(Arrays.asList(todoHis));

				//移除数据
				this.remove(Arrays.asList(item.getTodoId()));

				//新建数据
				item.resetTodoId();
				item.setUserId(targetUserId);
				this.create(item);
				return item;
			}
		}
		throw new Exception("未找到操作用户的待办数据");
	}

	@Override
	protected TodoDTO onActivate(TodoDTO et) throws Throwable {
		List<TodoDTO> list = this.getWFTaskTodos(et);
		String srfkeys = "";
		for (TodoDTO item : list) {
			item.setTodoState(StaticDict.TodoState.ACTIVE.getValue());
			// 挂起当前待办数据
			this.update(item);
			if (!ObjectUtils.isEmpty(srfkeys)) {
				srfkeys += ";";
			}
			srfkeys += item.getTodoId();
		}
		et.set("srfkeys", srfkeys);
		return et;
	}

	@Override
	protected TodoDTO onCancel(TodoDTO et) throws Throwable {
		//生成处理时间
		Timestamp processDate = new Timestamp(System.currentTimeMillis());
		List<TodoDTO> list = this.getWFTaskTodos(et);
		for (TodoDTO item : list) {
			// 添加待办历史
			// String tempId = item.getTodoId();
			TodoHisDTO todoHis = new TodoHisDTO();
			item.copyTo(todoHis);
			// item.setTodoId(tempId);
			todoHis.setTodoState(StaticDict.TodoState.CANCELED.getValue());
			todoHis.setProcessDate(processDate);
			this.getSystemRuntime().getTodoHisService().create(todoHis);
//			this.getSystemRuntime().getTodoHisService().rawCreate(Arrays.asList(todoHis));

			// 删除待办数据
			this.remove(Arrays.asList(item.getTodoId()));
		}
		return et;
	}

	@Override
	protected TodoDTO onDelegate(TodoDTO et) throws Throwable {
		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			throw new Exception("未指定操作用户");
		}
		String targetUserId = et.getParam02();
		if (ObjectUtils.isEmpty(targetUserId)) {
			throw new Exception("未指定委派用户");
		}
		TodoDTO targetTodo = null;
		List<TodoDTO> list = this.getWFTaskTodos(et);
		// 挂起当前待办数据
		for (TodoDTO item : list) {
			if (userId.equalsIgnoreCase(item.getUserId())) {
				// String tempId = item.getTodoId();
				targetTodo = new TodoDTO();
				item.copyTo(targetTodo);
				// item.setTodoId(tempId);
			}
			item.setTodoState(StaticDict.TodoState.PAUSED.getValue());
			this.update(item);
		}
		if (targetTodo == null) {
			throw new Exception("未找到操作用户的待办数据");
		}
		// 添加委派待办
		targetTodo.setTodoId(null);
		targetTodo.setUserId(targetUserId);
		this.create(targetTodo);

		return targetTodo;
	}

	@Override
	protected TodoDTO onPause(TodoDTO et) throws Throwable {
		List<TodoDTO> list = this.getWFTaskTodos(et);
		String srfkeys = "";
		for (TodoDTO item : list) {
			item.setTodoState(StaticDict.TodoState.PAUSED.getValue());
			// 挂起当前待办数据
			this.update(item);
			if (!ObjectUtils.isEmpty(srfkeys)) {
				srfkeys += ";";
			}
			srfkeys += item.getTodoId();
		}
		et.set("srfkeys", srfkeys);
		return et;
	}

	@Override
	protected TodoDTO onResolve(TodoDTO et) throws Throwable {
		//生成处理时间
		Timestamp processDate = new Timestamp(System.currentTimeMillis());
		String userId = et.getUserId();
		if (ObjectUtils.isEmpty(userId)) {
			throw new Exception("未指定操作用户");
		}
		List<TodoDTO> list = this.getWFTaskTodos(et);
		boolean hasTodo = false;
		for (TodoDTO item : list) {
			if (userId.equalsIgnoreCase(item.getUserId())) { // 完成当前待办
				hasTodo = true;
				et = item;
				// 添加历史待办
				// String tempId = item.getTodoId();
				TodoHisDTO todoHis = new TodoHisDTO();
				item.copyTo(todoHis);
				// item.setTodoId(tempId);
				todoHis.setTodoState(StaticDict.TodoState.COMPLETED.getValue());
				todoHis.setProcessDate(processDate);
				this.getSystemRuntime().getTodoHisService().create(todoHis);
//				this.getSystemRuntime().getTodoHisService().rawCreate(Arrays.asList(todoHis));
				this.remove(Arrays.asList(item.getTodoId()));
			} else {
				if (StaticDict.TodoState.ACTIVE.getValue().equalsIgnoreCase(item.getTodoState())) { // 取消其他当前待办
					// 添加历史待办
					// String tempId = item.getTodoId();
					TodoHisDTO todoHis = new TodoHisDTO();
					item.copyTo(todoHis);
					// item.setTodoId(tempId);
					todoHis.setTodoState(StaticDict.TodoState.COMPLETED.getValue());
					todoHis.setProcessDate(processDate);
					this.getSystemRuntime().getTodoHisService().create(todoHis);
//					this.getSystemRuntime().getTodoHisService().rawCreate(Arrays.asList(todoHis));
					// 删除待办
					this.remove(Arrays.asList(item.getTodoId()));
				} else { // 激活挂起待办
					item.setTodoState(StaticDict.TodoState.ACTIVE.getValue());
					this.update(item);
				}
			}
		}
		if (!hasTodo) {
			throw new Exception("未找到操作用户的待办数据");
		}

		return et;
	}

	@Override
	protected TodoDTO onSendMsg(TodoDTO dto) throws Throwable {
		// TODO Auto-generated method stub
		return super.onSendMsg(dto);
	}


	/**
	 * 工作流引擎出现异常回滚时，todo也同步回滚，将待办从历史表回退到运行表。
	 * 1、清除历史表中已提交的待办。
	 * 2、重新生成运行表的待办任务。
	 * @param dto
	 * @return
	 * @throws Throwable
	 */
	@Override
	protected TodoDTO onRollback(TodoDTO dto) throws Throwable {
		SearchContextDTO searchContextDTO = new SearchContextDTO();
		searchContextDTO.eq("PARAM01", dto.getParam01());
		searchContextDTO.eq("PARAM09", dto.getParam09());
		dto = this.selectOne(searchContextDTO,true);
		//重新生成运行表的待办任务()
		this.remove(searchContextDTO);
		this.create(dto);
		return dto;
	}

}
