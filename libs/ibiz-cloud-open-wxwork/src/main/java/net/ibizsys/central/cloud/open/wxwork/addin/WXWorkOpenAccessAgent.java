package net.ibizsys.central.cloud.open.wxwork.addin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplateType;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenDept;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.addin.OpenAccessAgentBase;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public class WXWorkOpenAccessAgent extends OpenAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(WXWorkOpenAccessAgent.class);

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	@Override
	public String getName() {
		return ICloudOpenUtilRuntime.OPENPLATFORM_WXWORK;
	}

	@Override
	public int getSupportMsgType() {
		return MsgTypes.WXWORK;
	}
	
	@Override
	protected String doRequestToken() throws Throwable {
		
		OpenAccess agentData = this.getAgentData();
		if(!StringUtils.hasLength(agentData.getAccessKey())
				|| !StringUtils.hasLength(agentData.getSecretKey())) {
			throw new Exception("未指定 corpid 或 corpsecret");
		}
		
		String strUri = String.format("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=%1$s&corpsecret=%2$s", agentData.getAccessKey(), agentData.getSecretKey());

		IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().get(strUri, null, null, null, Map.class, null);
		Map ret = rep.getBody();

		/*
		"errcode": 0,
		   "errmsg": "ok",
		   "access_token": "accesstoken000001",
		   "expires_in": 7200
		*/
		
		Object errcode = ret.get("errcode");
		if(DataTypeUtils.getIntegerValue(errcode, 0)!=0){
			throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
		}

		Object expireIn = ret.get("expires_in");
		if (expireIn != null) {
			Integer nTimeout = Integer.parseInt(expireIn.toString());
			this.setTokenTimeout(System.currentTimeMillis() + nTimeout * 1000);
		}
		Object accessToken = ret.get("access_token");

		return (String) accessToken;
	}

	@Override
	protected Collection<OpenDept> onSelectOpenDepts(ISearchContext iSearchContext) throws Throwable {
		
		String strUri = "https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token={ACCESS_TOKEN}";
		Map<String, String> urlParams = new HashMap<String, String>();
		urlParams.put("ACCESS_TOKEN", this.getToken());
		
		IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().get(strUri, urlParams, null, null, Map.class, null);
		Map ret = rep.getBody();
		
		Object errcode = ret.get("errcode");
		if(DataTypeUtils.getIntegerValue(errcode, 0)!=0){
			throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
		}
		
		List<OpenDept> openDeptList = new ArrayList<OpenDept>();
		Object departments = ret.get("department");
		if(departments instanceof List) {
			List list = (List)departments;
			for(Object item  : list) {
				if(!(item instanceof Map)) {
					continue;
				}
				
				Map dept = (Map)item;
				
				OpenDept openDept = new OpenDept();
				openDept.setOpenDeptName(DataTypeUtils.getStringValue(dept.get("name"), null));
				openDept.setRealId(DataTypeUtils.getStringValue(dept.get("id"), null));
				openDept.setOpenDeptCode(DataTypeUtils.getStringValue(dept.get("id"), null));
				openDeptList.add(openDept);
			}
			
		}

		return openDeptList;
	}

	@Override
	protected Collection<OpenUser> onSelectOpenUsers(ISearchContext iSearchContext) throws Throwable {
		List<OpenUser> openUserList = new ArrayList<OpenUser>();

		// 判断是否传入指定部门
		Collection<OpenDept> openDepts = this.selectOpenDepts(new SearchContextDTO());
		if (!ObjectUtils.isEmpty(openDepts)) {
			List<Long> deptIdList = new ArrayList<Long>();

			// 放入顶级部门
			//deptIdList.add(1l);
			for (OpenDept openDept : openDepts) {
				deptIdList.add(Long.parseLong(openDept.getRealId()));
			}
			for (Long nDeptId : deptIdList) {
				
				
				Collection<?> list = this.getUsersByDeptId(nDeptId);
				if (!ObjectUtils.isEmpty(list)) {
					for (Object item : list) {
						
						if(!(item instanceof Map)) {
							continue;
						}
						
						Map user = (Map)item;
						
						/*
						 * {
                  "userid": "zhangsan",
                  "name": "张三",
                  "department": [1, 2],
				  "open_userid": "xxxxxx"
           }
						 */
						
						OpenUser openUser = new OpenUser();
						Object department = user.get("department");
						if(department instanceof List) {
							openUser.setDepts(StringUtils.arrayToDelimitedString( ((List)department).toArray(), ","));
						}
						else {
							openUser.setDepts(nDeptId.toString());
						}
						
						openUser.setRealId(DataTypeUtils.getStringValue(user.get("open_userid"), ""));
						openUser.setUserId(DataTypeUtils.getStringValue(user.get("userid"), ""));
						//openUser.setOpenUserCode(item.getJobNumber());
						openUser.setMobile(DataTypeUtils.getStringValue(user.get("mobile"), ""));
						openUser.setOpenUserName(DataTypeUtils.getStringValue(user.get("name"), ""));
						openUserList.add(openUser);
					}
				}
			}
		}

		return openUserList;
	}

	protected Collection<?> getUsersByDeptId(Long deptId) throws Throwable {
		String strUri = "https://qyapi.weixin.qq.com/cgi-bin/user/list?access_token={ACCESS_TOKEN}&department_id={DEPARTMENT_ID}&fetch_child=0";
		Map<String, Object> urlParams = new HashMap<String, Object>();
		urlParams.put("ACCESS_TOKEN", this.getToken());
		urlParams.put("DEPARTMENT_ID",deptId);
		
		IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().get(strUri, urlParams, null, null, Map.class, null);
		Map ret = rep.getBody();
		
		Object errcode = ret.get("errcode");
		if(DataTypeUtils.getIntegerValue(errcode, 0)!=0){
			throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
		}
		
		Object userlist = ret.get("userlist");
		if(userlist instanceof List) {
			return (List)userlist;
		}
		return null;
	}



	@Override
	protected void onSendMessages(MsgSendQueue[] msgSendQueues) throws Throwable {
		for (MsgSendQueue msgSendQueue : msgSendQueues) {
			doSendMessage(msgSendQueue);
		}
	}

	protected void doSendMessage(MsgSendQueue msgSendQueue) throws Throwable {

		// 获取用户清单
		String strDstUsers = msgSendQueue.getDstUsers();
		if (ObjectUtils.isEmpty(strDstUsers)) {
			throw new Exception("未指定目标用户");
		}
		Integer strMsgType = DataTypeUtils.getIntegerValue(msgSendQueue.getMsgType(), 0);
		if (strMsgType != MsgTypes.WXWORK) {
			throw new Exception("非当前代理对象类型消息");
		}
		if (strDstUsers.indexOf("[") == 0) {
			ArrayNode arrayNode = JsonUtils.toArrayNode(strDstUsers);
			for (int i = 0; i < arrayNode.size(); i++) {
				this.doSendMessage(arrayNode.get(i).asText(), msgSendQueue);
			}
		} else {
			String[] userIds = strDstUsers.split("[,]");
			for (String strUserId : userIds) {
				this.doSendMessage(strUserId, msgSendQueue);
			}
		}

	}

	protected void doSendMessage(String strUserId, MsgSendQueue msgSendQueue) throws Throwable {

		// 获取目标用户
		OpenUser openUser = this.getContext().getOpenUser(ICloudOpenUtilRuntime.OPENPLATFORM_WXWORK, strUserId);
		if (!StringUtils.hasLength(openUser.getUserId())) {
			throw new Exception(String.format("用户[%1$s]未绑定企业微信账户", openUser.getOpenUserName()));
		}

		//
		String strUri = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token={ACCESS_TOKEN}";
		Map<String, Object> urlParams = new HashMap<String, Object>();
		urlParams.put("ACCESS_TOKEN", this.getToken());
		
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		
		body.put("touser", openUser.getUserId());
		body.put("msgtype", "text");
		body.put("agentid", this.getAgentData().getAgentId());
		
		String strWXContent = msgSendQueue.getWXContent();
		if(!StringUtils.hasLength(strWXContent)) {
			strWXContent = this.getRealContent(msgSendQueue, MsgTemplateType.MSG.getValue());
		}
		if(!StringUtils.hasLength(strWXContent)){
			log.warn(String.format("消息内容为空,忽略发送"));
			return;
		}
		Map<String, Object> text = new LinkedHashMap<String, Object>();
		text.put("content", strWXContent);
		
		body.put("text", text);
		
		IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().post(strUri, urlParams, null, null, body, null, Map.class, null);
		Map ret = rep.getBody();
		
		Object errcode = ret.get("errcode");
		if(DataTypeUtils.getIntegerValue(errcode, 0)!=0){
			throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
		}
		
	}
	
	
	
	@Override
	protected OpenUser onGetOpenUserBySNSCode(String strCode) throws Throwable {
		String strUri = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token={ACCESS_TOKEN}&code={CODE}";
		Map<String, Object> urlParams = new HashMap<String, Object>();
		urlParams.put("ACCESS_TOKEN", this.getToken());
		urlParams.put("CODE", strCode);
		
		IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().get(strUri, urlParams, null, null, Map.class, null);
		Map ret = rep.getBody();
		
		Object errcode = ret.get("errcode");
		if(DataTypeUtils.getIntegerValue(errcode, 0)!=0){
			throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
		}
		

		OpenUser openUser = new OpenUser();
		Object userId = ret.get("UserId");
		if(userId instanceof String) {
			openUser.setUserId((String)userId);
		}
		
		return openUser;
	}
	
	
	@Override
	protected OpenUser onGetOpenUserByAuthCode(String strCode) throws Throwable {
		String strUri = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token={ACCESS_TOKEN}&code={CODE}";
		Map<String, Object> urlParams = new HashMap<String, Object>();
		urlParams.put("ACCESS_TOKEN", this.getToken());
		urlParams.put("CODE", strCode);
		
		IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().get(strUri, urlParams, null, null, Map.class, null);
		Map ret = rep.getBody();
		
		Object errcode = ret.get("errcode");
		if(DataTypeUtils.getIntegerValue(errcode, 0)!=0){
			throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
		}
		

		OpenUser openUser = new OpenUser();
		Object userId = ret.get("UserId");
		if(userId instanceof String) {
			openUser.setUserId((String)userId);
		}
		
		return openUser;
	}
}
