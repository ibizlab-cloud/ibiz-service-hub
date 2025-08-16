package net.ibizsys.central.cloud.open.dingtalk.addin;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.*;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request.Body;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request.Msg;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request.OA;
import com.dingtalk.api.request.OapiMessageCorpconversationAsyncsendV2Request.Text;
import com.dingtalk.api.response.*;
import com.dingtalk.api.response.OapiV2DepartmentListsubResponse.DeptBaseResponse;
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
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.*;

public class DingTalkOpenAccessAgent extends OpenAccessAgentBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(DingTalkOpenAccessAgent.class);

    @Override
    protected void onInit() throws Exception {
        super.onInit();
    }

    @Override
    public String getName() {
        return ICloudOpenUtilRuntime.OPENPLATFORM_DINGTALK;
    }

    @Override
    protected String doRequestToken() throws Throwable {
        // https://api.dingtalk.com/v1.0/oauth2/accessToken
        // {
        // "appKey":"dingdaawg24tueoegabo",
        // "appSecret":"t8cjrgjDrjNssRQX9_wcMhjItibDopi_KFnJgakyPIq78nlmIRk-Xk8ez_164NDN"

        OpenAccess agentData = this.getAgentData();
        if (!StringUtils.hasLength(agentData.getAccessKey()) || !StringUtils.hasLength(agentData.getSecretKey())) {
            throw new Exception("未指定 appKey 或 appSecret");
        }

        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("appKey", agentData.getAccessKey());
        map.put("appSecret", agentData.getSecretKey());

        String strUri = "https://api.dingtalk.com/v1.0/oauth2/accessToken";

        IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().post(strUri, null, null, null, map, null, Map.class, null);
        Map ret = rep.getBody();

        // return super.doRequestToken();
        // "expireIn":7200,
        // "accessToken":"4bc6e96621fe3c3dada1c786a673dfd2"

        Object errcode = ret.get("errcode");
        if (DataTypeUtils.getIntegerValue(errcode, 0) != 0) {
            throw new Exception(String.format("返回错误，%1$s", ret.get("errmsg")));
        }

        Object expireIn = ret.get("expireIn");
        if (expireIn != null) {
            Integer nTimeout = Integer.parseInt(expireIn.toString());
            this.setTokenTimeout(System.currentTimeMillis() + nTimeout * 1000);
        }
        Object accessToken = ret.get("accessToken");

        return (String) accessToken;
    }

    @Override
    protected Collection<OpenDept> onSelectOpenDepts(ISearchContext iSearchContext) throws Throwable {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/department/listsub");
        OapiV2DepartmentListsubRequest req = new OapiV2DepartmentListsubRequest();
        req.setLanguage("zh_CN");
        if (iSearchContext.get("dept_id") != null) {
            req.setDeptId(DataTypeUtils.getLongValue(iSearchContext.get("dept_id"), 0l));
        }
        OapiV2DepartmentListsubResponse rsp = client.execute(req, this.getToken());
        if (!rsp.isSuccess()) {
            throw new Exception(rsp.getErrmsg());
        }
        List<DeptBaseResponse> list = rsp.getResult();

        List<OpenDept> openDeptList = new ArrayList<OpenDept>();
        if (!ObjectUtils.isEmpty(list)) {
            for (DeptBaseResponse item : list) {
                OpenDept openDept = new OpenDept();
                openDept.setOpenDeptName(item.getName());
                openDept.setRealId(item.getDeptId().toString());
                openDept.setOpenDeptCode(item.getDeptId().toString());
                openDeptList.add(openDept);

                ISearchContext subSearchContext = new SearchContextDTO();
                subSearchContext.set("dept_id", item.getDeptId());
                Collection<OpenDept> subDepts = this.selectOpenDepts(subSearchContext);
                if (!ObjectUtils.isEmpty(subDepts)) {
                    openDeptList.addAll(subDepts);
                }
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
            deptIdList.add(1l);
            for (OpenDept openDept : openDepts) {
                deptIdList.add(Long.parseLong(openDept.getRealId()));
            }
            for (Long nDeptId : deptIdList) {
                Collection<OapiV2UserListResponse.ListUserResponse> list = this.getUsersByDeptId(nDeptId);
                if (!ObjectUtils.isEmpty(list)) {
                    for (OapiV2UserListResponse.ListUserResponse item : list) {
                        OpenUser openUser = new OpenUser();
                        if (!ObjectUtils.isEmpty(item.getDeptIdList())) {
                            openUser.setDepts(StringUtils.arrayToDelimitedString(item.getDeptIdList().toArray(), ","));
                        } else {
                            openUser.setDepts(nDeptId.toString());
                        }

                        openUser.setRealId(item.getUnionid());
                        openUser.setUserId(item.getUserid());
                        openUser.setOpenUserCode(item.getJobNumber());
                        openUser.setMobile(item.getMobile());
                        openUser.setOpenUserName(item.getName());
                        openUserList.add(openUser);
                    }
                }
            }
        }

        return openUserList;
    }

    protected Collection<OapiV2UserListResponse.ListUserResponse> getUsersByDeptId(Long deptId) throws Throwable {
        Collection<OapiV2UserListResponse.ListUserResponse> list = getUsersByDeptId(deptId, 0l, 100l);
        return list;
    }

    protected Collection<OapiV2UserListResponse.ListUserResponse> getUsersByDeptId(Long deptId, Long offset, Long size) throws Throwable {

        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/v2/user/list");
        OapiV2UserListRequest req = new OapiV2UserListRequest();
        req.setDeptId(deptId);
        req.setCursor(offset * size);
        req.setSize(size);
        req.setOrderField("modify_desc");
        req.setContainAccessLimit(false);
        req.setLanguage("zh_CN");
        OapiV2UserListResponse rsp = client.execute(req, this.getToken());
        if (!rsp.isSuccess()) {
            throw new Exception(rsp.getErrmsg());
        }

        List<OapiV2UserListResponse.ListUserResponse> list = rsp.getResult().getList();

        if (rsp.getResult().getHasMore()) {
            list.addAll(getUsersByDeptId(deptId, offset++, size));
        }

        return list;
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
        OpenUser openUser = this.getContext().getOpenUser(ICloudOpenUtilRuntime.OPENPLATFORM_DINGTALK, strUserId);
        if (!StringUtils.hasLength(openUser.getUserId())) {
            throw new Exception(String.format("用户[%1$s]未绑定钉钉账户", openUser.getOpenUserName()));
        }

        //

        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/message/corpconversation/asyncsend_v2");
        OapiMessageCorpconversationAsyncsendV2Request req = new OapiMessageCorpconversationAsyncsendV2Request();
        req.setAgentId(this.getAgentData().getAgentId());
        req.setUseridList(openUser.getUserId());

        String strDDContent = msgSendQueue.getDDContent();
        if (!StringUtils.hasLength(strDDContent)) {
            strDDContent = this.getRealContent(msgSendQueue, MsgTemplateType.MSG.getValue());
        }

        Msg obj1 = new Msg();
        obj1.setMsgtype("text");
        Text obj2 = new Text();
        obj2.setContent(strDDContent);
        obj1.setText(obj2);
        OA obj3 = new OA();
        Body obj4 = new Body();
        obj4.setContent(strDDContent);
        obj3.setBody(obj4);
        obj1.setOa(obj3);
        req.setMsg(obj1);
        OapiMessageCorpconversationAsyncsendV2Response rsp = client.execute(req, this.getToken());
        if (!rsp.isSuccess()) {
            throw new Exception(rsp.getErrmsg());
        }

    }

    @Override
    protected OpenUser onGetOpenUserBySNSCode(String strCode) throws Throwable {

        OpenAccess agentData = this.getAgentData();
        if (!StringUtils.hasLength(agentData.getAccessKey()) || !StringUtils.hasLength(agentData.getSecretKey())) {
            throw new Exception("未指定 appKey 或 appSecret");
        }

        DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/sns/getuserinfo_bycode");
        OapiSnsGetuserinfoBycodeRequest req = new OapiSnsGetuserinfoBycodeRequest();
        req.setTmpAuthCode(strCode);
        OapiSnsGetuserinfoBycodeResponse response = client.execute(req, agentData.getAccessKey(), agentData.getSecretKey());
        if (!response.isSuccess()) {
            throw new Exception(response.getErrmsg());
        }

        com.dingtalk.api.response.OapiSnsGetuserinfoBycodeResponse.UserInfo userInfo = response.getUserInfo();
        OpenUser openUser = new OpenUser();

        openUser.setRealId(userInfo.getUnionid());
        // openUser.setUserId(userInfo.getOpenid());
        openUser.setOpenUserName(userInfo.getNick());

        return openUser;
    }

    @Override
    protected OpenUser onGetOpenUserByAuthCode(String strCode) throws Throwable {
        OpenAccess agentData = this.getAgentData();
        if (!StringUtils.hasLength(agentData.getAccessKey()) || !StringUtils.hasLength(agentData.getSecretKey())) {
            throw new Exception("未指定 appKey 或 appSecret");
        }

        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/getuserinfo");
        OapiUserGetuserinfoRequest request = new OapiUserGetuserinfoRequest();
        request.setCode(strCode);
        request.setHttpMethod("GET");
        OapiUserGetuserinfoResponse response = client.execute(request, this.getToken());
        if (!response.isSuccess()) {
            throw new Exception(response.getErrmsg());
        }

        OpenUser openUser = new OpenUser();

        //openUser.setRealId(userInfo.getUnionid());
        openUser.setUserId(response.getUserid());
        //openUser.setOpenUserName(userInfo.getNick());

        return openUser;
    }
}
