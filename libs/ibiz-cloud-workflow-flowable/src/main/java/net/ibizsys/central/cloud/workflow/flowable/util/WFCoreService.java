package net.ibizsys.central.cloud.workflow.flowable.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.logging.LogFactory;
import org.flowable.bpmn.model.FieldExtension;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.SequenceFlow;
import org.flowable.bpmn.model.ServiceTask;
import org.flowable.bpmn.model.UserTask;
import org.flowable.bpmn.model.SubProcess;
import org.flowable.bpmn.model.CallActivity;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.identitylink.service.impl.persistence.entity.IdentityLinkEntity;
import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParseException;
import org.springframework.expression.spel.SpelEvaluationException;
import org.springframework.expression.spel.SpelParseException;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.error.BadRequestAlertException;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto.CarbonCopyDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFMemberDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.IWFMemberService;
import net.ibizsys.central.cloud.workflow.core.addin.ICloudWFUtilRTAddin;
import net.ibizsys.central.cloud.workflow.core.cloudutil.ICloudWFUtilRuntimeContext;
import net.ibizsys.central.cloud.workflow.core.util.WFConsts;
import net.ibizsys.central.cloud.workflow.core.util.enums.WFUtilAction;
import net.ibizsys.central.cloud.workflow.flowable.cloudutil.ICloudFlowableUtilRuntime;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 旧有引擎实现
 * @author lionlau
 *
 */
public class WFCoreService implements ICloudWFUtilRTAddin{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WFCoreService.class);
	

//	private static final String ctx = "DEDATASET(.*?)\\.(\\w+)";

	public static final String GetGroupUserCond ="#wfCoreService.getGroupUsers2\\('(.*)',#execution\\)";
	//private  static ObjectMapper mapper = new ObjectMapper();


	private final ExpressionParser parser = new SpelExpressionParser();

	
	private ICloudFlowableUtilRuntime iCloudFlowableUtilRuntime = null;
	private ICloudWFUtilRuntimeContext iCloudWFUtilRuntimeContext = null;
	
	
	@Override
	public void init(ICloudWFUtilRuntimeContext iCloudWFUtilRuntimeContext, Object pluginData) throws Exception {
		this.iCloudWFUtilRuntimeContext = iCloudWFUtilRuntimeContext;
		this.iCloudFlowableUtilRuntime = (ICloudFlowableUtilRuntime)this.iCloudWFUtilRuntimeContext.getCloudWFUtilRuntime();
		this.onInit();
	}
	
	protected void onInit() throws Exception {
		
	}
	
	protected ICloudWFUtilRuntimeContext getCloudWFUtilRuntimeContext() {
		return this.iCloudWFUtilRuntimeContext;
	}
	
	protected ICloudFlowableUtilRuntime getCloudFlowableUtilRuntime() {
		return this.iCloudFlowableUtilRuntime;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudFlowableUtilRuntime().getSystemRuntime();
	}
	
	
	/**
	 * 获取工作流用户（返回用户标识字符串 userid,userid2）
	 * @param groupIds
	 * @param delegateExecution
	 * @return
	 */
	public String getGroupUsers(String groupIds, DelegateExecution delegateExecution) {
		String strUsers="";
		Set<WFMember> groupMembers = getGroupUsers2(groupIds,delegateExecution);
		if(!ObjectUtils.isEmpty(groupMembers))
		{
			Set<String> memberIds = new HashSet<>();
			for(WFMember groupMember: groupMembers){
				if(!ObjectUtils.isEmpty(groupMember.getMemberId())) {
					memberIds.add(groupMember.getUserId());
				}
			}
			if(!ObjectUtils.isEmpty(memberIds)){
				strUsers = String.join(",",memberIds);
			}
		}
		return strUsers;
	}
	
	/**
	 * 获取工作流用户（返回用户集合）
	 * @param groupIds
	 * @param delegateExecution
	 * @return
	 */
	public Set<WFMember> getGroupUsers2(String groupIds, DelegateExecution delegateExecution) {
		Object activeData = delegateExecution.getVariable(WFConsts.ACTIVEDATA);
		//工作流跳转模式下需忽略流程用户
		if (activeData instanceof Map) {
			Object wfTag = ((Map)activeData).get(WFConsts.WF_TAG);
			if(WFConsts.TASK_JUMP.equals(wfTag)){
				return null;
			}
		}
		if(activeData == null){
			activeData = new HashMap<>();
		}
		return getGroupUsers2(groupIds,delegateExecution,(Map)activeData);
	}

	/**
	 * 获取工作流用户（返回用户集合）
	 * @param groupIds
	 * @param delegateExecution
	 * @return
	 */
	public Set<WFMember> getGroupUsers2(String groupIds, DelegateExecution delegateExecution , Map activeData) {
		
		if (delegateExecution == null || activeData == null) {
			//throw new BadRequestAlertException("获取业务数据失败", "", "");
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), "传入参数无效");
		}
		
		if (ObjectUtils.isEmpty(groupIds)) {
			//throw new BadRequestAlertException("当前步骤未配置用户组", "", "");
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), "当前步骤未配置用户组");
		}
//		AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
//		if (user == null || ObjectUtils.isEmpty(user.getSrfdcid())){
//			throw new BadRequestAlertException("部署工作流失败，无法获取租户标识", "", "");
//		}
		
		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
		
		//String srfdcid = user.getSrfdcid();
		String srfdcid = employeeContext.getTenant();
		
		Set<String> orgList = new HashSet<>();
		Set<String> deptList = new HashSet<>();
		Set<WFMember> memberList = new HashSet<>();

		String[] groups = groupIds.split(",");
		for (String groupId : groups) {
			String userData = "";
			String userData2 = "";
			if (groupId.indexOf("|") > 0) {
				String[] arg = groupId.split("[|]");
				if (arg.length == 3) {
					groupId = arg[0];
					if (arg[1] != null) {
						userData = arg[1].toLowerCase();
					}
					if (arg[2] != null) {
						userData2 = arg[2].toLowerCase();
					}
				}
			}
			//按照组织、部门等条件过滤组成员
			if ((!ObjectUtils.isEmpty(userData)) && (!ObjectUtils.isEmpty(userData2))) {
				for (String field : userData2.split(";")) {
					Object fieldvalue = null;
					if (field.indexOf("srf") == 0) {
//						FlowUser curUser = FlowUser.getCurUser();
//						if (curUser != null && curUser.getUser() != null) {
//							fieldvalue = curUser.getUser().getSessionParams().get(field);
//						}
						
						fieldvalue = employeeContext.getSessionParam(field);
					} else {
						if (activeData instanceof Map) {
							fieldvalue = activeData.get(field);
						}
					}
					if (fieldvalue != null) {
						if ("org".equals(userData)) {
							orgList.addAll(Arrays.asList(String.valueOf(fieldvalue).split(",")));
						} else if ("dept".equals(userData)) {
							deptList.addAll(Arrays.asList(String.valueOf(fieldvalue).split(",")));
						}
					}
				}
				//指定查询org、dept的工作流用户时，需传入orgid、deptid值，未传入则返回空
				if(ObjectUtils.isEmpty(orgList) && ObjectUtils.isEmpty(deptList)){
					return memberList;
				}
			}
			//查询指定部门用户
//			WFGroup group = iwfGroupService.getById(String.format("%s-%s",srfdcid,groupId));
//			if(group == null || ObjectUtils.isEmpty(group.getGroupscope())){
//				return memberList;
//			}
			
//			WFGroupDTO wfGroupDTO;
//			try {
//				wfGroupDTO = EBSXSystemRuntime.getInstance().getWFGroupService().get(String.format("%s-%s",srfdcid,groupId));
//			} catch (Throwable ex) {
//				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("获取指定工作流用户组[%1$s]发生异常，%2$s", groupId, ex.getMessage()), ex);
//			}
			WFGroup wfGroup = this.getCloudWFUtilRuntimeContext().getWFGroup(String.format("%s-%s",srfdcid,groupId));
			
			String groupType = wfGroup.getGroupScope();
			if (groupType.startsWith("DEDATASET")) {
				List<WFMember> members = getDSGroupMember(wfGroup, userData, userData2 , delegateExecution );
				if(!ObjectUtils.isEmpty(members)){
					memberList.addAll(members);
				}
			}
			else if ("USERGROUP".equalsIgnoreCase(groupType)){
			
				
				
//				WFMemberSearchContext ctx = new WFMemberSearchContext();
//				ctx.setN_groupid_eq(group.getId());
//				if(!ObjectUtils.isEmpty(orgList)){
//					ctx.setN_orgid_in(String.join(",",orgList));
//				}
//				if(!ObjectUtils.isEmpty(deptList)){
//					ctx.setN_mdeptid_in(String.join(",",deptList));
//				}
//				
//				List<WFMember> members = memberService.select(ctx);
//				if(!ObjectUtils.isEmpty(members)){
//					for(WFMember member :members ){
//						//使用tempMember避免触发懒加载
//						WFMember tempMember = new WFMember();
//						tempMember.setMemberid(member.getMemberid());
//						tempMember.setUserid(member.getUserId());
//						tempMember.setGroupid(member.getGroupId());
//						tempMember.setMdeptid(member.getMDeptId());
//						memberList.add(tempMember);
//					}
//				}
				
				SearchContextDTO searchContextDTO = new SearchContextDTO();
				searchContextDTO.eq(IWFMemberService.FIELD_GROUPID, wfGroup.getId());
				if(!ObjectUtils.isEmpty(orgList)){
					searchContextDTO.in(IWFMemberService.FIELD_ORGID, String.join(",",orgList));
				}
				if(!ObjectUtils.isEmpty(deptList)){
					searchContextDTO.in(IWFMemberService.FIELD_MDEPTID, String.join(",",deptList));
				}
				List<WFMemberDTO> wfMemberDTOList;
				try {
					wfMemberDTOList = EBSXSystemRuntime.getInstance().getWFMemberService().selectDefault(searchContextDTO);
				} catch (Throwable ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("查询工作流用户组成员发生异常，%1$s", ex.getMessage()), ex);
				}
				if(!ObjectUtils.isEmpty(wfMemberDTOList)) {
					for(WFMemberDTO wfMemberDTO :wfMemberDTOList ){
						WFMember tempMember = new WFMember();
						tempMember.setMemberId(wfMemberDTO.getMemberId());
						tempMember.setUserId(wfMemberDTO.getUserId());
						tempMember.setGroupId(wfMemberDTO.getGroupId());
						tempMember.setMDeptId(wfMemberDTO.getMDeptId());
						memberList.add(tempMember);
					}
				}
			} else if("CUSTOM".equalsIgnoreCase(groupType)){
				//新增识别流程角色（自定义）从flowable工作流参数中取值
				String strUserIds = String.format("%1$s",delegateExecution.getVariable(wfGroup.getGroupCode()));
				String[] userIds = strUserIds.split(",");
				for (String userId:userIds) {
					WFMember customMember = new WFMember();
					if(StringUtils.hasLength(userId)) {
						customMember.setMemberId(userId);
						customMember.setUserId(userId);
						memberList.add(customMember);
					}
				}
			}else if("SYSUSERROLE".equals(wfGroup.getGroupScope())) {
				memberList.addAll(this.getCloudWFUtilRuntimeContext().getWFMembers(wfGroup, activeData));
				if(!ObjectUtils.isEmpty(orgList)) {
					memberList = memberList.stream().filter(member -> orgList.contains(member.getOrgId())).collect(Collectors.toSet());
				}
				if(!ObjectUtils.isEmpty(deptList)) {
					memberList = memberList.stream().filter(member -> deptList.contains(member.getMDeptId())).collect(Collectors.toSet());
				}
			} else {
				memberList.addAll(this.getCloudWFUtilRuntimeContext().getWFMembers(wfGroup, activeData));
			}
		}
		return memberList;
	}

	/**
	 * 获取组成员
	 * @param group
	 * @param delegateExecution
	 * @return
	 */
	private List<WFMember> getDSGroupMember(WFGroup group , String userData, String userData2, DelegateExecution delegateExecution){
		
		Object activeData = delegateExecution.getVariable(WFConsts.ACTIVEDATA);
		String system = (String)delegateExecution.getVariable("system");
		String appId = (String)delegateExecution.getVariable("appname");
		//String entityName = getEntityName(delegateExecution);
		
		
		String groupType = group.getGroupScope();
		List<WFMember> list = new ArrayList<>();
		if(ObjectUtils.isEmpty(groupType)) {
			return list;
		}
		//if("1".equals(callbackMode)){
		if(true) {
			//log.debug("正在进行数据集回调操作,当前模式为：{}",callbackMode);
//			FlowUser curUser = FlowUser.getCurUser();
//			if (curUser == null || activeData == null) {
//				throw new BadRequestAlertException("获取工作流操作用户失败，无法获取当前用户信息", "", "");
//			}
			//IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
			String[] dataSet = groupType.split("[/]");
			if (dataSet != null && dataSet.length >= 4) {
				String entity = dataSet[1];
				String dsname = dataSet[2];
				String userIdField = dataSet[3];
				Map<String, Object> param = new HashMap<>();
				param.putAll( (Map) activeData);
				//Map param = (Map) activeData;
				param.put("actiontype", "dataset");
				// 临时补充
				if (param.get("updatedate") != null) {
					param.remove("updatedate");
				}
				if (param.get("createdate") != null) {
					param.remove("createdate");
				}
				
				IWebClientRep<String> rep = this.getCloudWFUtilRuntimeContext().executeWFCallback(system, entity, ICloudWFUtilRuntime.CALLBACKTYPE_DATASET, dsname, param, String.class, appId);
				if(StringUtils.hasLength(rep.getBody())) {
					List<?> retList = this.getSystemRuntime().deserialize(rep.getBody(), List.class);
					if(!ObjectUtils.isEmpty(retList)) {
						for(Object objItem : retList) {
							if(!(objItem instanceof Map)) {
								continue;
							}
							Object objUserId = ((Map)objItem).get(userIdField);
							if(ObjectUtils.isEmpty(objUserId)) {
								continue;
							}
							
							WFMember member = new WFMember();
							String userid = objUserId.toString();
							member.setMemberId(userid);
							member.setUserId(userid);
							list.add(member);
						}
					}
				}
				
//				JobsInfo callBack = this.executeCallback(entity, dename, param);
//				if (!ObjectUtils.isEmpty(callBack)) {
//					JSONObject callbackresult = (JSONObject) callBack.getExtensionparams().get("callbackresult");
//					String msg = (String) callbackresult.get("msg");
//					if ("执行成功".equals(msg)) {
//						return list;
//					}
//					Map result = JSON.parseObject(msg, Map.class);
//					if (!ObjectUtils.isEmpty(result) && result instanceof Map) {
//						Map rsDatas = result;
//						if (!ObjectUtils.isEmpty(rsDatas.get("content"))) {
//							List<Map> users = (List) rsDatas.get("content");
//							for (Map user : users) {
//								if (ObjectUtils.isEmpty(user.get(userIdField))) {
//									continue;
//								}
//								WFMember member = new WFMember();
//								String userid = user.get(userIdField).toString();
//								member.setMemberid(userid);
//								member.setUserid(userid);
//								list.add(member);
//							}
//						}
//					}
//				}
			}
		}
//		else if("2".equals(callbackMode)){
//			log.debug("正在进行数据集回调操作,当前模式为：{}",callbackMode);
//			String businessKey = DataObject.getStringValue(delegateExecution.getVariable("businessKey"),"");
//			String entity = DataObject.getStringValue(delegateExecution.getVariable("entitys"),"");
//			Map param = new HashMap<String, Object>();
//			param.put("actiontype", "dataset2");
//			param.put("businessKey", businessKey);
//			if("datasetfilter".equalsIgnoreCase(userData) && !ObjectUtils.isEmpty(userData2)){
//				param.put("dataSetFilter", userData2);
//			}
//			JobsInfo callBack = this.executeCallback(entity, group.getGroupcode(), param);
//			if(!ObjectUtils.isEmpty(callBack)) {
//				JSONObject callbackresult = (JSONObject) callBack.getExtensionparams().get("callbackresult");
//				String msg = (String) callbackresult.get("msg");
//				List<JSONObject> users = JSON.parseArray(msg, JSONObject.class);
//				for (JSONObject user : users) {
//					String userId = DataObject.getStringValue(user.get("id"), "");
//					String userName = DataObject.getStringValue(user.get("username"), "");
//					if (ObjectUtils.isEmpty(userId)) {
//						continue;
//					}
//					WFMember member = new WFMember();
//					member.setMemberid(userId);
//					member.setUserid(userId);
//					member.setMembername(userName);
//					list.add(member);
//				}
//			}
//		}
		return list;
	}
	
	/**
	 * 获取角色成员
	 * @param groups
	 * @param execution
	 * @return
	 */
	public Map getUsersByGroup(Set<String> groups, boolean isOrder, DelegateExecution execution) {
		
		Map result = new HashMap();
		Map activeData = (Map) execution.getVariable(WFConsts.ACTIVEDATA);
		Set processRoles = new HashSet();
		Set<String> processUserIds = new HashSet();
		Set<WFMember> groupUsers = new LinkedHashSet();
		if(!ObjectUtils.isEmpty(groups)){
			for (String group : groups) {
					if (group.contains(WFConsts.ACTIVEDATA)) {
						for (String elUserId : group.split("\\|")) {
							try {
								ExpressionParser parser = new SpelExpressionParser();
								StandardEvaluationContext context = new StandardEvaluationContext();
								Expression exp = parser.parseExpression(elUserId);
								context.addPropertyAccessor(new MapAccessor());
								context.setVariable(WFConsts.ACTIVEDATA,activeData);
								String userIds = exp.getValue(context,String.class);
								if(!ObjectUtils.isEmpty(userIds)){
									for(String userId: userIds.split(",")){
										if (!ObjectUtils.isEmpty(userId)) {
											processUserIds.add(userId);
											processRoles.add(group);
										}
									}
								}
							} catch (SpelEvaluationException e){
								log.error(String.format("Spel表达式解析表达式解析异常:[%s]", e));
							}
						}
					}
				if (group.contains("wfCoreService.getGroupUsers")) {
					String exp = group;
					EvaluationContext oldContext = new StandardEvaluationContext();
					oldContext.setVariable("wfCoreService", this);
					oldContext.setVariable("execution", execution);
					Expression oldExp = null;
					try {
						oldExp = parser.parseExpression(exp);
					}catch (SpelParseException e){
						throw new BadRequestAlertException(String.format("解析表达式[%s]失败,%s",exp,e) ,"","");
					}

					List<WFMember> users = oldExp.getValue(oldContext, List.class);
					if (!ObjectUtils.isEmpty(users)) {
						users.forEach(groupMember->{
							String roleId;
							if(!ObjectUtils.isEmpty(groupMember.getMDeptId())){
								roleId = String.format("%s_%s",groupMember.getGroupId(),groupMember.getMDeptId());
							}
							else{
								roleId = groupMember.getGroupId();
							}
							processRoles.add(roleId);
							groupUsers.add(groupMember);
							processUserIds.add(groupMember.getUserId());
						});
					}
				}
			}
			//区分是否需要排序
			if(isOrder){
				
//				List<Employee> allUsers = new ArrayList<>();
//				if(processUserIds.size()>0){
//					List<Employee> users = empService.list(new QueryWrapper<Employee>().in("userid",processUserIds));
//					if(users.size()>0) {
//						allUsers.addAll(users);
//					}
//				}
//				if(groupUsers.size()>0){
//					List<Employee> users = memberMapping.toDomain(new ArrayList(groupUsers));
//					allUsers.addAll(users);
//				}
				Collection<Employee> allUsers = this.getCloudWFUtilRuntimeContext().getEmployees(processUserIds.toArray(new String[processUserIds.size()]));
				//需要排序，返回emp信息
				result.put("groupUsers",allUsers);
			}
			else{
				//无需排序，只返回userid
				result.put("groupUsers",processUserIds);
			}
			result.put("all_role_cnt",processRoles.size());
		}
		return result;
	}
	
	/**
	 * 工作流连接条件
	 * @param finalObject
	 * @param option
	 * @param exp
	 * @return
	 */
	public boolean test(Object finalObject, String option, Object exp) {
		return RuleUtils.test(finalObject, option, exp);
	}
	
	/**
	 * 存储多实例节点参数（用于ALL|ROLE:ANY)
	 * @param groups
	 * @param execution
	 */
	public void saveProcessNodeParams(Set<String> groups, DelegateExecution execution) {
		try {
			//判断当前步骤对外连接线中是否配置 all|role:any条件
			boolean isAllRoleAny = false;
			FlowElement element = execution.getCurrentFlowElement();
			if (element != null && element instanceof UserTask) {
				UserTask userTask = (UserTask) element;
				List<SequenceFlow> flows = userTask.getOutgoingFlows();
				if (!ObjectUtils.isEmpty(flows)) {
					for (SequenceFlow flow : flows) {
						String nextCond = FlowableUtils.getElementParam(flow, "form", WFConsts.LINK_NEXTCOND);
						if (!ObjectUtils.isEmpty(nextCond) && "ALL|ROLE:ANY".equals(nextCond)) {
							isAllRoleAny = true;
							continue;
						}
					}
				}
				//存储步骤中选择的步骤用户相关信息，用于后续获取当前用户所属的角色。master为当前步骤中使用到的角色参数列表，包含active（当前数据属性）与group（工作流用户组）
				if (isAllRoleAny) {
					Map<String, Object> masterMap = new LinkedHashMap<String, Object>();
					Map<String, Object> activeMap = new LinkedHashMap<String, Object>();
					Map<String, Object> groupMap = new LinkedHashMap<String, Object>();
					Map activeData = (Map) execution.getVariable(WFConsts.ACTIVEDATA);
					if (ObjectUtils.isEmpty(activeData)) {
						throw new BadRequestAlertException("获取业务数据[activedata]失败，请检查配置是否正确。", "", "");
					}
					if (!ObjectUtils.isEmpty(groups)) {
						for (String group : groups) {
							//当前数据属性
							if (group.contains(WFConsts.ACTIVEDATA)) {
								for (String activeField : group.split(";")) {
									String fieldName = activeField.replace("#activedata.", "");
									if (!ObjectUtils.isEmpty(fieldName)) {
										String fieldValue = getActiveData(activeData, fieldName);
										if (ObjectUtils.isEmpty(fieldValue)) {
											//log.info("工作流角色-->工作流用户组[{}]-->当前数据属性-->[{}]属性值为空，将被忽略。", group,fieldName);
											log.info(String.format("工作流角色-->工作流用户组[%1$s]-->当前数据属性-->[%2$s]属性值为空，将被忽略。", group,fieldName));
											continue;
										}
										//将当前数据属性存入act_ru_variable变量表
										activeMap.put(fieldName, fieldValue);
										execution.setVariableLocal(fieldName, fieldValue);
									}
								}
							}
							//工作流用户组
							if (group.contains("wfCoreService.getGroupUsers")) {
								String strGroup = parseExpress(group);
								if (ObjectUtils.isEmpty(strGroup)) {
									//log.error("解析工作流用户角色[{}]失败", group);
									log.error(String.format("解析工作流用户角色[%1$s]失败", group));
									continue;
								}
								String[] fields = strGroup.split("\\|");
								if (fields.length == 3) {
									String groupFields = fields[2];
									if (!ObjectUtils.isEmpty(groupFields)) {
										String[] fieldNames = groupFields.split(";");
										if (fieldNames.length > 0) {
											for (String fieldName : fieldNames) {
												if (!ObjectUtils.isEmpty(fieldName)) {
													String fieldValue = getActiveData(activeData, fieldName);
													if (ObjectUtils.isEmpty(fieldValue)) {
														//log.info("工作流角色-->工作流用户组[{}]-->[{}]属性值为空，将被忽略。",group, fieldName);
														log.info(String.format("工作流角色-->工作流用户组[%1$s]-->[%2$s]属性值为空，将被忽略。",group, fieldName));
														continue;
													}
													groupMap.put(fieldName, fieldValue);
													//将工作流用户组存入act_ru_variable变量表
													execution.setVariableLocal(fieldName, fieldValue);
												}
											}
										}
									}
								}
							}
						}
						masterMap.put("active", activeMap.keySet());
						masterMap.put("group", groupMap.keySet());
						execution.setVariableLocal("all_role_info", JsonUtils.toString(masterMap));
					}
				}
			}
		} catch (ParseException e) {
			log.error("存储多实例节点参数失败，将无法计算ALL|ROLE:ANY通过条件。");
		}
	}
	
	
	/**
	 * 审批用户排序（含去重）
	 *
	 * @param users 排序用户
	 * @param order 排序方向
	 * @return
	 */
	public List<Employee> sort(List<Employee> users, String order) {
		//去重
		Map<String, Employee> mapUsers = new HashMap<>();
		users.forEach(user -> {
			mapUsers.put(user.getUserId(), user);
		});
		//排序
		List<Employee> listUsers = new ArrayList<>(mapUsers.values());
		if ("reverse".equalsIgnoreCase(order)) {
			Collections.sort(listUsers, new Comparator<Employee>() {
				@Override
				public int compare(Employee user1, Employee user2) {
					if (user1.getShowOrder() > user2.getShowOrder()) {
						return -1;
					}
					if (user1.getShowOrder().equals(user2.getShowOrder())) {
						return 0;
					}
					return 1;
				}
			});
		} else {
			Collections.sort(listUsers, new Comparator<Employee>() {
				@Override
				public int compare(Employee user1, Employee user2) {
					if (!ObjectUtils.isEmpty(user1.getShowOrder()) && !ObjectUtils.isEmpty(user2.getShowOrder())) {
						int o1 = user1.getShowOrder();
						int o2 = user2.getShowOrder();
						if (o1 > o2) {
							return 1;
						}
						if (o1 == o2) {
							return 0;
						}
					}
					return -1;
				}
			});
		}
		return listUsers;
	}
	
	/**
	 * 获取activeData属性值
	 * @param activeData
	 * @param field
	 * @return
	 */
	private String  getActiveData(Map activeData , String field ){
		String fieldValue = null;
		try {
			ExpressionParser parser = new SpelExpressionParser();
			StandardEvaluationContext context = new StandardEvaluationContext();
			Expression exp = parser.parseExpression(String.format("#activedata.%s",field));
			context.addPropertyAccessor(new MapAccessor());
			context.setVariable(WFConsts.ACTIVEDATA,activeData);
			fieldValue = exp.getValue(context,String.class);
		} catch (Exception e) {
			//log.error("解析activedata属性[{}]发生异常，"+e,field);
			log.error(String.format("解析activedata属性[%1$s]发生异常，%2$s", field, e.getMessage()), e);
		}
		return fieldValue;
	}
	
	
	public Set<String> getUserIds(List<Employee> groupUsers){
		Set <String> groupUserIds = new LinkedHashSet<>();
		if(!ObjectUtils.isEmpty(groupUsers)){
			for(Employee e : groupUsers){
				groupUserIds.add(e.getUserId());
			}
		}
		return groupUserIds;
	}
	
	
	/**
	 * 获取用户组表达式(多实例)
	 * @param express
	 * @return
	 */
	protected String parseExpress(String express){
		String result = null;
		if(!ObjectUtils.isEmpty(express)){
			Matcher matcher = Pattern.compile(GetGroupUserCond).matcher(express);
			if(matcher.find() && matcher.group().length()>1) {
				String groupParam = matcher.group(1);
				if (ObjectUtils.isEmpty(groupParam)) {
					//log.error("解析用户角色[{}]失败，无法获取步骤用户信息。", express);
					log.error(String.format("解析用户角色[%1$s]失败，无法获取步骤用户信息", express));
					return result;
				}
				return groupParam;
			}
		}
		return result;
	}


	/**
	 * 获取用户组表达式（区分单实例与多实例）
	 * @param express
	 * @param execution
	 * @return
	 */
	protected String parseExpress(String express , DelegateExecution execution){
		//多实例
		if(execution.getParent() != null && execution.getParent().isMultiInstanceRoot()){
			return parseExpress(express);
		}
		else{
			//单实例
			if(!ObjectUtils.isEmpty(express)){
				return express.replaceAll("\\$\\{wfCoreService.getGroupUsers\\('(.+)',execution\\)}","$1");
			}
			return null;
		}
	}
	
	
	/**
	 * 获取连接线条件 （all/any/all|role:any）
	 *
	 * @param execution
	 * @param flowId
	 * @return
	 */
	public String getNextCond(DelegateExecution execution, Object flowId , String paramName) {
		if (!ObjectUtils.isEmpty(execution.getCurrentFlowElement()) && execution.getCurrentFlowElement() instanceof UserTask) {
			//仅后加签模式可忽略连接线条件
			if(ObjectUtils.isEmpty(flowId) && WFUtilAction.ADDSTEPAFTER.value.equals(execution.getVariable("taskwaytype"))){
				return null;
			}
			UserTask userTask = (UserTask) execution.getCurrentFlowElement();
			for (SequenceFlow flow : userTask.getOutgoingFlows()) {
				if (flowId.equals(flow.getId())) {
					return FlowableUtils.getElementParam(flow, "form", paramName);
				}
			}
		}
		//判断嵌入子流程节点
		if (!ObjectUtils.isEmpty(execution.getCurrentFlowElement()) && execution.getCurrentFlowElement() instanceof SubProcess) {
			SubProcess subProcess = (SubProcess) execution.getCurrentFlowElement();
			for (SequenceFlow flow : subProcess.getOutgoingFlows()) {
				return FlowableUtils.getElementParam(flow, "form", paramName);
			}
		}
		//判断调用活动子流程节点
		if (!ObjectUtils.isEmpty(execution.getCurrentFlowElement()) && execution.getCurrentFlowElement() instanceof CallActivity){
			CallActivity callActivity = (CallActivity) execution.getCurrentFlowElement();
			for (SequenceFlow flow: callActivity.getOutgoingFlows()) {
					return FlowableUtils.getElementParam(flow, "form", paramName);
			}
		}
		return null;
	}

	/**
	 * 清除角色中其他成员待办任务
	 *
	 * @param userRoles
	 * @param execution
	 */
	public void deleteRoleTask(Set userRoles, DelegateExecution execution) {
		Object processInstanceId = execution.getProcessInstanceId();
		
		
//		String userId = AuthenticationUser.getAuthenticationUser().getPersonid();
//		if (ObjectUtils.isEmpty(userId)) {
//			throw new BadRequestAlertException("获取当前用户信息失败", "", "");
//		}
		
		String userId = EmployeeContext.getCurrentMust().getUserid();
		
		if (ObjectUtils.isEmpty(processInstanceId)) {
			throw new BadRequestAlertException("无法获取流程实例", "", "");
		}
		Set<String> roleUserIds = getUsersByRole(userRoles, execution);
		if(!ObjectUtils.isEmpty(roleUserIds)){
			roleUserIds.remove(userId);
		}
		if(!ObjectUtils.isEmpty(roleUserIds)){
			Map param = new HashMap();
			param.put("userids", roleUserIds);
			param.put("processinstanceid", processInstanceId);
			
			/*
			 *   <select id="searchUserTask"  parameterType="java.util.Map"  resultType="java.util.Map">
        select t2.id_ as  ID ,t2.execution_id_ as EXECUTION from act_ru_identitylink  t1 inner join act_ru_task t2 on t1.task_id_ = t2.id_ where t1.USER_ID_ in
        <foreach collection="et.userids" item="userid" index="index" open="(" close=")" separator=",">
            #{userid}
        </foreach>
        and t2.PROC_INST_ID_=#{et.processinstanceid}
    </select>
			 */
			
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), "以下代码未实现");
			
			
//			List<Map> tasks = wfCoreMapper.searchUserTask(param);
//
//			//获取与当前用户相同角色的用户任务
//			Set<String> executionIds = new HashSet<>();
//			Set <String> taskIds = new HashSet<>();
//			if(!ObjectUtils.isEmpty(tasks)){
//				for(Map task : tasks){
//					Object executionId = task.get("EXECUTION");
//					if(!ObjectUtils.isEmpty(executionId)) {
//						executionIds.add(executionId.toString());
//					}
//					Object taskId = task.get("ID");
//					if(!ObjectUtils.isEmpty(taskId)){
//						taskIds.add(taskId.toString());
//					}
//				}
//			}
//			//清除用户任务
//			if(!ObjectUtils.isEmpty(executionIds)){
//				for(String executionId : executionIds){
//					runtimeService.deleteMultiInstanceExecution(String.valueOf(executionId), false);
//				}
//			}
		}
	}
	
	/**
	 * 获取角色成员
	 *
	 * @param roles
	 * @param execution
	 * @return
	 */
	public Set<String> getUsersByRole(Set roles, DelegateExecution execution) {
		Set<String> userIds = new HashSet<String>();
		if (!ObjectUtils.isEmpty(roles)) {
			String candidateUsers = FlowableUtils.getElementParam(execution.getCurrentFlowElement(), "form", "candidateUsersList");
			if (!ObjectUtils.isEmpty(candidateUsers)) {
				Map executionMap = (Map) execution.getVariable(WFConsts.ACTIVEDATA);
				String[] groups = candidateUsers.split("\\|\\|");
				if (groups.length > 0) {
					for (String group : groups) {
						if (group.contains(WFConsts.ACTIVEDATA) && roles.contains(group)) {
							for (String elUserId : group.split("\\|")) {
								try {
								ExpressionParser parser = new SpelExpressionParser();
								StandardEvaluationContext context = new StandardEvaluationContext();
								Expression exp = parser.parseExpression(elUserId);
								context.addPropertyAccessor(new MapAccessor());
								context.setVariable(WFConsts.ACTIVEDATA, executionMap);
								String processUserId = exp.getValue(context, String.class);
								if (!ObjectUtils.isEmpty(processUserId)) {
									userIds.add(processUserId);
								}
								} catch (SpelEvaluationException e){
									log.error(String.format("Spel表达式解析表达式解析异常:[%s]", e));
								}
							}
						}
						if (group.contains("wfCoreService.getGroupUsers")) {
							EvaluationContext oldContext = new StandardEvaluationContext();
							oldContext.setVariable("wfCoreService", this);
							oldContext.setVariable("execution", execution);
							Expression oldExp = parser.parseExpression(group);
							List<WFMember> users = oldExp.getValue(oldContext, List.class);
							if (!ObjectUtils.isEmpty(users)) {
								users.forEach(groupMember -> {
									if (!ObjectUtils.isEmpty(groupMember.getUserId())) {
										String roleId;
										if (!ObjectUtils.isEmpty(groupMember.getMDeptId())) {
											roleId = String.format("%s_%s", groupMember.getGroupId(), groupMember.getMDeptId());
										} else {
											roleId = groupMember.getGroupId();
										}
										if (roles.contains(roleId)) {
											userIds.add(groupMember.getUserId());
										}
									}
								});
							}
						}
					}
				}
			}
		}
		return userIds;
	}
	
	/**
	 * 获取用户所属的工作流角色
	 * 根据步骤中的角色信息，获取用户所属的工作流角色。
	 * 如：步骤角色为部门内勤，界面中选择部门，流程发送至部门内勤。
	 * 界面中选择的部门存入all_role_info，提交任务时，从all_role_info中获取部门，
	 * 得到内勤，判断用户是否属于内勤，属于则userRole++
	 *
	 * @param userId
	 * @param execution
	 * @return
	 */
	public Set<String> getRoleByUserId(String userId, DelegateExecution execution) {
		Set<String> roles = new HashSet<String>();
		//多实例(all|role:any)实现逻辑
		if (!ObjectUtils.isEmpty(userId)) {
			Map activeData = (Map) execution.getVariable(WFConsts.ACTIVEDATA);
			if (ObjectUtils.isEmpty(activeData)) {
				//throw new BadRequestAlertException("获取业务数据[activedata]失败，请检查配置是否正确。", "", "");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), "流程当前数据对象无效");
			}
			//获取多实例节点用户角色数据，填充回activedata中，用于计算all|role:any。active为工作流步骤角色中的当前数据属性，group为工作流用户组
			if (execution != null && execution.getParent() != null) {
				Object all_role_info = execution.getParent().getVariableLocal("all_role_info");
				if (all_role_info != null) {
					try {
						//JSONObject roleInfo = JSONObject.parseObject(all_role_info.toString());
						Map roleInfo = JsonUtils.MAPPER.readValue(JsonUtils.MAPPER.writeValueAsString(all_role_info), Map.class);
						
						Object active = roleInfo.get("active");
						Object group = roleInfo.get("group");

						//active回填至activeData
						if (active != null) {
							Set activeInfo = JsonUtils.MAPPER.readValue(JsonUtils.MAPPER.writeValueAsString(active), Set.class);
							if (activeInfo != null) {
								Iterator<String> it = activeInfo.iterator();
								while (it.hasNext()) {
									String field = it.next();
									Object fieldValue = execution.getParent().getVariableLocal(field);
									activeData.put(field, fieldValue);
								}
							}
						}
						//group回填至activeData
						if (group != null) {
							Set groupInfo = JsonUtils.MAPPER.readValue(JsonUtils.MAPPER.writeValueAsString(group), Set.class);
							if (groupInfo != null) {
								Iterator<String> it = groupInfo.iterator();
								while (it.hasNext()) {
									String field = it.next();
									Object fieldValue = execution.getParent().getVariableLocal(field);
									activeData.put(field, fieldValue);
								}
							}
						}
					}
					catch(Exception ex) {
						throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("回填角色信息发生异常， %1$s", ex.getMessage()), ex);
					}
				}
			}

			//查询步骤角色的用户信息，若当前用户在角色内，则userRole++
			String candidateUsers = FlowableUtils.getElementParam(execution.getCurrentFlowElement(), "form", "candidateUsersList");
			if (!ObjectUtils.isEmpty(candidateUsers)) {
				String[] groups = candidateUsers.split("\\|\\|");
				if (groups.length > 0) {
					for (String group : groups) {
						//当前数据属性
						if (group.contains(WFConsts.ACTIVEDATA)) {
							for (String elUserId : group.split("\\|")) {
								try {
								ExpressionParser parser = new SpelExpressionParser();
								StandardEvaluationContext ctx = new StandardEvaluationContext();
								Expression exp = parser.parseExpression(elUserId);
								ctx.addPropertyAccessor(new MapAccessor());
								//使用填充后的activeData
								ctx.setVariable(WFConsts.ACTIVEDATA, activeData);
								String processUserId = exp.getValue(ctx, String.class);
								if (!ObjectUtils.isEmpty(processUserId) && processUserId.contains(userId)) {
									roles.add(group);
								}
								} catch (SpelEvaluationException e){
									log.error(String.format("Spel表达式解析表达式解析异常:[%s]", e));
								}
							}
						}
						//工作流用户组
						if (group.contains("wfCoreService.getGroupUsers")) {
							String groupParam = parseExpress(group);
							if (ObjectUtils.isEmpty(groupParam)) {
								//log.error("解析用户角色[{}]失败，无法获取步骤用户信息。", group);
								log.error(String.format("解析用户角色[%1$s]失败，无法获取步骤用户信息。", group));
								return roles;
							}
							EvaluationContext ctx = new StandardEvaluationContext();
							ctx.setVariable("wfCoreService", this);
							ctx.setVariable("execution", execution);
							//使用填充后的activeData
							ctx.setVariable("activedata", activeData);
							Expression oldExp = parser.parseExpression(String.format("#wfCoreService.getGroupUsers2('%s',#execution,#activedata)", groupParam));
							List<WFMember> users = oldExp.getValue(ctx, List.class);
							if (!ObjectUtils.isEmpty(users)) {
								users.forEach(groupMember -> {
									if (!ObjectUtils.isEmpty(groupMember.getUserId()) && userId.equals(groupMember.getUserId())) {
										String roleId;
										if (!ObjectUtils.isEmpty(groupMember.getMDeptId())) {
											roleId = String.format("%s_%s", groupMember.getGroupId(), groupMember.getMDeptId());
										} else {
											roleId = groupMember.getGroupId();
										}
										roles.add(roleId);
									}
								});
							}
						}
					}
				}
			}
		}
		return roles;
	}
	
	/**
	 * 获取用户id
	 * @param identityLinks
	 * @return
	 */
	public String getUserIds2(List<IdentityLinkEntity> identityLinks) {
		if(!ObjectUtils.isEmpty(identityLinks) && identityLinks.size()>0){
			return identityLinks.stream().map(IdentityLinkEntity::getUserId).distinct().collect(Collectors.joining(";"));
		}
		return null;
	}
	
	
	/**
	 * 生成抄送任务
	 * @return
	 */
	public boolean saveSendCopyTask(String title , String dcsystemid, String userIds , String businesskey, String entity , String param01 , String param02, String param03 , String param04 , String param05 , String clobparam01){

//		AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
//		if (user == null || ObjectUtils.isEmpty(user.getSrfdcsystemid())) {
//			throw new BadRequestAlertException("获取用户信息失败","","");
//		}
		
		log.debug(String.format("正在生成抄送任务，抄送用户为:[%1$s]", userIds));
		CarbonCopyDTO scTask = new CarbonCopyDTO();
		scTask.setTitle(title);
		scTask.setTodoType(WFConsts.TPS_SENDCOPY);
		scTask.set("scusers",userIds);
		scTask.setBizKey(businesskey);
		scTask.setBizType(entity);
		scTask.setParam01(param01);
		scTask.setParam02(param02);
		scTask.setParam03(param03);
		scTask.setParam04(param04);
		scTask.setParam05(param05);
		scTask.setClobParam01(clobparam01);
		scTask.setDCSystemId(dcsystemid);
		
		try {
			//sysCarbonCopyService.create(scTask);
			EBSXSystemRuntime.getInstance().getCarbonCopyService().create(scTask);
			return true;
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("建立抄送任务发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	public boolean accessCondition(DelegateExecution execution) {

		Object sequenceFlowId = execution.getVariable("sequenceFlowId");
		String flowAccessCond = getNextCond(execution, sequenceFlowId , WFConsts.LINK_NEXTCOND); //下一步连接条件
		String customCond = getNextCond(execution, sequenceFlowId , WFConsts.LINK_CUSTOMCOND); //自定义连接条件

		if (!ObjectUtils.isEmpty(flowAccessCond)){
			if ("ANY".equalsIgnoreCase(flowAccessCond)) {
				return true;
			} else if ("ALL|ROLE:ANY".equalsIgnoreCase(flowAccessCond)) {
				Object allRolesCnt = execution.getVariable("all_roles_cnt");
				Object completeRolesCnt = execution.getVariable("complete_roles_cnt");
				if(allRolesCnt == completeRolesCnt)
					return true;
				else
					return false;
			}
			else if("ALL".equalsIgnoreCase(flowAccessCond)){
				Object completeInstance = execution.getVariable("nrOfCompletedInstances");
				Object allInstance = execution.getVariable("nrOfInstances");
				return (int) completeInstance / (int) allInstance == 1;
			}
			else if(!ObjectUtils.isEmpty(customCond)){
				Object activeData = execution.getVariable(WFConsts.ACTIVEDATA);
				return RuleUtils.test(customCond, activeData);
			}
		   else {
				//throw new BadRequestAlertException(String.format("暂未支持[%s]类型的连接配置",flowAccessCond),"","");
			   throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("未支持的连接配置类型[%1$s]",flowAccessCond));
			}
		} else {
			return false;
		}
	}
	
	
	public void execute(DelegateExecution delegateExecution,Object activedata) throws Exception {
		
		if(delegateExecution.getCurrentFlowElement() instanceof ServiceTask && activedata instanceof Map)
		{
			ServiceTask task=(ServiceTask)delegateExecution.getCurrentFlowElement();
			//FlowUser curUser= FlowUser.getCurUser();
			String businessKey = (String)delegateExecution.getVariable("businessKey");
			String system = (String)delegateExecution.getVariable("system");
			String appId = (String)delegateExecution.getVariable("appname");
			//String entityName = getEntityName(delegateExecution);
			
			
			if(ObjectUtils.isEmpty(businessKey)){
				//throw new BadRequestAlertException("执行工作流服务发生异常，无法获取业务数据键值","","");
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("无法获取业务数据键值"));
			}

			Map<String, Object> entity= new HashMap<>();
			String serviceEntity="";
			String serviceDEAction="";
			String emptyHandle="";
			for(FieldExtension fieldExtension : task.getFieldExtensions())
			{
				if("service-entity".equals(fieldExtension.getFieldName()))
				{
					serviceEntity=fieldExtension.getStringValue();
				}
				else if("service-deaction".equals(fieldExtension.getFieldName()))
				{
					serviceDEAction=fieldExtension.getStringValue();
				}
				else if(fieldExtension.getFieldName().startsWith("params-"))
				{
					String key=fieldExtension.getFieldName().split("-")[1];
					entity.put(key,fieldExtension.getStringValue());
				}
			}
			
			
//			if(!ObjectUtils.isEmpty(serviceDEAction) && "create".equalsIgnoreCase(serviceDEAction)){
//				if(activedata instanceof  Map){
//					Map datas = (Map) activedata;
//					datas.putAll(entity);
//					entity.clear();
//					entity.putAll(datas);
//				}
//			}
			
			/**
			 * 回调送出srfwf前缀保留控制属性
			 */
			Map datas = (Map)activedata;
			for(Object objKey : datas.keySet()) {
				String key = objKey.toString().toLowerCase();
				if(entity.containsKey(key)) {
					continue;
				}
				
				if(key.indexOf("srfwf") == 0) {
					entity.put(key, datas.get(objKey));
				}
			}
			
			entity.put("businessKey", businessKey);
			entity.put(Entity.KEY, businessKey);
			if((ObjectUtils.isEmpty(serviceEntity)||ObjectUtils.isEmpty(serviceDEAction))&&ObjectUtils.isEmpty(emptyHandle)) {
				return;
			}
//			if(ObjectUtils.isEmpty(curUser.getToken()) || ObjectUtils.isEmpty(curUser.getOrg()) || ObjectUtils.isEmpty(curUser.getDept())|| ObjectUtils.isEmpty(curUser.getSystem())) {
//				return;
//			}
//			String token=curUser.getToken();
//			String path=serviceEntity;
//			if("create".equalsIgnoreCase(serviceDEAction)) {
//				this.executeCallback(serviceEntity,"create", entity);
//			} else if("update".equalsIgnoreCase(serviceDEAction)) {
//				this.executeCallback(serviceEntity,"update", entity);
//			} else if("remove".equalsIgnoreCase(serviceDEAction)) {
//				this.executeCallback(serviceEntity,"remove", entity);
//			} else if("save".equalsIgnoreCase(serviceDEAction)) {
//				this.executeCallback(serviceEntity,"save", entity);
//			} else if("get".equalsIgnoreCase(serviceDEAction)) {
//				this.executeCallback(serviceEntity,"get", entity);
//			} else if("getdraft".equalsIgnoreCase(serviceDEAction)){}
//			else if("checkkey".equalsIgnoreCase(serviceDEAction)){}
//			else {
//				this.executeCallback(serviceEntity,serviceDEAction, entity);
//			}
			try {
				this.getCloudWFUtilRuntimeContext().executeWFCallback(system, serviceEntity, ICloudWFUtilRuntime.CALLBACKTYPE_SERVICEACTION, serviceDEAction, entity, String.class, appId);
			}catch (Throwable e){
				log.error(String.format("执行工作流回调发生异常,回调系统[%1$s]-实体[%2$s]-行为[%3$s]",system,serviceEntity,serviceDEAction));
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(),e.getCause().getMessage());
			}
		}
	}
	
	public void saveWFStepUser(DelegateExecution execution){
		Object wfstepId = execution.getVariableLocal("actInstId");
		if(ObjectUtils.isEmpty(wfstepId))
		   throw new BadRequestAlertException("流程执行发生异常，无法获取流程步骤标识","","");

		//获取流程步骤用户表达式
		String strCandidate= getCandidateUser(execution);
		Set<String> groups = new HashSet(Arrays.asList(strCandidate.split("\\|\\|")));
		try {
			FlowElement element = execution.getCurrentFlowElement();
			if (element != null && element instanceof UserTask) {
				//存储步骤中选择的步骤用户相关信息，用于后续获取当前用户所属的角色。master为当前步骤中使用到的角色参数列表，包含active（当前数据属性）与group（工作流用户组）
				Map<String, Object> masterMap = new LinkedHashMap<String, Object>();
				Map<String, Object> activeMap = new LinkedHashMap<String, Object>();
				Map<String, Object> groupMap = new LinkedHashMap<String, Object>();
				LinkedHashMap activeData = (LinkedHashMap) execution.getVariable(WFConsts.ACTIVEDATA);
				if (ObjectUtils.isEmpty(activeData)) {
					throw new BadRequestAlertException("获取业务数据[activedata]失败，请检查配置是否正确。", "", "");
				}
				if (!ObjectUtils.isEmpty(groups)) {
					for (String group : groups) {
						//当前数据属性
						if (group.contains(WFConsts.ACTIVEDATA)) {
							for (String activeField : group.split(";")) {
								String fieldName = null;
								if(execution.getParent() != null && execution.getParent().isMultiInstanceRoot())
									fieldName = activeField.replaceAll("#activedata\\.(.+)", "$1"); //多实例
								else
									fieldName = activeField.replaceAll("\\$\\{activedata\\.(.+)}", "$1"); //单实例
								if (!ObjectUtils.isEmpty(fieldName)) {
									String fieldValue = getActiveData(activeData, fieldName);
									if (ObjectUtils.isEmpty(fieldValue)) {
										//log.info("工作流角色-->工作流用户组[{}]-->当前数据属性-->[{}]属性值为空，将被忽略。", group,fieldName);
										log.info(String.format("工作流角色-->工作流用户组[%1$s]-->当前数据属性-->[%2$s]属性值为空，将被忽略。", group,fieldName));
										continue;
									}
									//将当前数据属性存入act_ru_variable变量表
									activeMap.put(String.format("wfstep-%s-%s",wfstepId,fieldName), fieldValue);
									execution.setVariable(String.format("wfstep-%s-%s",wfstepId,fieldName), fieldValue);
								}
							}
						}
						//工作流用户组
						else if (group.contains(WFConsts.WFGROUP)) {
							String strGroup = parseExpress(group,execution);
							if (ObjectUtils.isEmpty(strGroup)) {
							//	log.error("解析工作流用户角色[{}]失败", group);
								log.error(String.format("解析工作流用户角色[%1$s]失败", group));
								continue;
							}
							String[] fields = strGroup.split("\\|");
							if (fields.length == 3) {
								String groupFields = fields[2];
								if (!ObjectUtils.isEmpty(groupFields)) {
									String[] fieldNames = groupFields.split(";");
									if (fieldNames.length > 0) {
										for (String fieldName : fieldNames) {
											if (!ObjectUtils.isEmpty(fieldName)) {
												fieldName = fieldName.toLowerCase();
												String fieldValue = getActiveData(activeData, fieldName);
												if (ObjectUtils.isEmpty(fieldValue)) {
													//log.info("工作流角色-->工作流用户组[{}]-->[{}]属性值为空，将被忽略。",group, fieldName);
													log.info(String.format("工作流角色-->工作流用户组[%1$s}]-->[%2$s]属性值为空，将被忽略。",group, fieldName));
													continue;
												}
												groupMap.put(String.format("wfstep-%s-%s",wfstepId,fieldName), fieldValue);
												//将工作流用户组存入act_ru_variable变量表
												execution.setVariable(String.format("wfstep-%s-%s",wfstepId,fieldName), fieldValue);
											}
										}
									}
								}
							}
						}
					}
					masterMap.put("active", activeMap.keySet());
					masterMap.put("group", groupMap.keySet());
					execution.setVariable(String.format("wfstep-%1$s-stepuser",wfstepId), JsonUtils.toString(masterMap));
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取流程步骤用户表达式
	 * @param execution
	 * @return
	 */
	public String getCandidateUser(DelegateExecution execution) {
		UserTask task = (UserTask)execution.getCurrentFlowElement();
		String strCandidate;
		List candidateUsers = task.getCandidateUsers();
		//单实例
		if(!ObjectUtils.isEmpty(candidateUsers) && !"${candidateUsers}".equals(String.join("||",candidateUsers))){
			strCandidate = String.join("||",candidateUsers);
		}
		else{
			//多实例
			strCandidate = FlowableUtils.getElementParam(task,"form","candidateUsersList");
		}
		if(ObjectUtils.isEmpty(strCandidate)) {
			log.error(String.format("无法获取流程操作用户配置，请检查bpmn步骤是否包含[%1$s]参数","candidateUsersList"));
			//throw new BadRequestAlertException("无法获取流程操作用户配置，请确认配置是否正确","","");
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), String.format("无法获取流程操作用户配置"));
		}
		return strCandidate;
	}

	/**
	 * 获取流程定义标识
	 * @return
	 */
	public String getDefinitionKey(String processCodeName, DelegateExecution execution) {

		String system = (String)execution.getVariable("system");
		String entityName = (String)execution.getVariable("entity");
		if(ObjectUtils.isEmpty(system))
			throw new BadRequestAlertException("流程获取系统类型失败","","");
		if(ObjectUtils.isEmpty(entityName))
			throw new BadRequestAlertException("流程获取实体名称失败","","");
		List<WFDefinition> wfDefinitions = (List<WFDefinition>) this.getCloudFlowableUtilRuntime().getWFDefinitions(system, (String) null, (String) null, entityName.toLowerCase(), "web");
		String result = null;
		//按照版本排序，默认获取最新流程定义
		wfDefinitions = wfDefinitions.stream().sorted(Comparator.comparing(WFDefinition::getModelVersion).reversed()).collect(Collectors.toList());
		// 判断是否包含相应的流程
		for (WFDefinition wfDefinition : wfDefinitions) {
			String definitionKey = wfDefinition.getDefinitionKey().substring(0,wfDefinition.getDefinitionKey().lastIndexOf('v'));
			if (definitionKey.endsWith(processCodeName.toLowerCase())){
				result = wfDefinition.getDefinitionKey();
			}
		}
		if (ObjectUtils.isEmpty(result)){
			log.error(String.format("无法获取流程定义标识，请检查流程[%1$s]是否已部署",processCodeName));
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudFlowableUtilRuntime(), "无法获取流程定义标识");
		}
		return result;
	}

	/**
	 * 用于bpmn文件中服务任务获取当前时间
	 * @return
	 */
	public Timestamp getnow()
	{
		return new Timestamp(new Date().getTime());
	}
	
	protected String getEntityName(DelegateExecution delegateExecution) {
		Object objEntity = delegateExecution.getVariable("entity");
		if(objEntity == null) {
			objEntity = delegateExecution.getVariable("entitys");
		}
		if(objEntity != null) {
			return objEntity.toString();
		}
		return null;
	}
}
