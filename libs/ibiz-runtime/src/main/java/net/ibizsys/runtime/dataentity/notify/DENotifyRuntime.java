package net.ibizsys.runtime.dataentity.notify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.notify.IPSDENotifyTarget;
import net.ibizsys.runtime.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.res.ISysNotifyAgentRuntime;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;
import net.ibizsys.runtime.util.script.IScriptEntity;

/**
 * 实体通知运行时对象接口
 * 
 * @author lionlau
 *
 */
public class DENotifyRuntime extends DataEntityModelRuntimeBase implements IDENotifyRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DENotifyRuntime.class);

	/***
	 * 每次处理的最大条目
	 */
	public final static int MAXCOUNT = 200;

	public final static int PAGESIZE = 200;

	private IPSDENotify iPSDENotify = null;

	private IPSDEDataSet iPSDEDataSet = null;
	private IPSDEField beginTimePSDEField = null;
	private IPSDEField endTimePSDEField = null;
	private ISysMsgTemplRuntime iSysMsgTemplRuntime = null;
	private ISysMsgQueueRuntime iSysMsgQueueRuntime = null;
	private List<IPSDENotifyTarget> psDENotifyTargetList = null;
	private List<ISysMsgTargetRuntime> sysMsgTargetRuntimeList = null;
	private Map<IPSDEField, IPSDEField> deTargetMap = null;

	@Override
	public void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDENotify iPSDENotify) throws Exception {
		Assert.notNull(iDataEntityRuntimeBase, "传入实体运行时对象无效");
		Assert.notNull(iPSDENotify, "传入实体通知模型对象无效");

		this.setDataEntityRuntimeBase(iDataEntityRuntimeBase);

		this.iPSDENotify = iPSDENotify;

		Assert.notNull(this.getPSDENotify().getPSSysMsgQueue(), "没有指定输出的系统消息队列");
		Assert.notNull(this.getPSDENotify().getPSSysMsgTempl(), "没有指定系统消息模板");

		this.psDENotifyTargetList = this.getPSDENotify().getPSDENotifyTargets();
		Assert.notEmpty(this.psDENotifyTargetList, "没有指定消息目标");

		this.iSysMsgQueueRuntime = this.getSystemRuntimeBase().getSysMsgQueueRuntime(this.getPSDENotify().getPSSysMsgQueue());
		this.iSysMsgTemplRuntime = this.getSystemRuntimeBase().getSysMsgTemplRuntime(this.getPSDENotify().getPSSysMsgTempl());

		List<ISysMsgTargetRuntime> sysMsgTargetRuntimeList = new ArrayList<ISysMsgTargetRuntime>();
		Map<IPSDEField, IPSDEField> deTargetMap = new HashMap<IPSDEField, IPSDEField>();
		for (IPSDENotifyTarget iPSDENotifyTarget : this.psDENotifyTargetList) {
			if (DENotifyTargetTypes.SYSMSGTARGET.equals(iPSDENotifyTarget.getTargetType())) {
				Assert.notNull(iPSDENotifyTarget.getPSSysMsgTarget(), String.format("目标[%1$s]没有指定系统消息目标", iPSDENotifyTarget.getName()));
				ISysMsgTargetRuntime iSysMsgTargetRuntime = this.getSystemRuntimeBase().getSysMsgTargetRuntime(iPSDENotifyTarget.getPSSysMsgTarget());
				sysMsgTargetRuntimeList.add(iSysMsgTargetRuntime);
				continue;
			}
			if (DENotifyTargetTypes.DEFIELD.equals(iPSDENotifyTarget.getTargetType())) {
				Assert.notNull(iPSDENotifyTarget.getTargetPSDEField(), String.format("目标[%1$s]没有指定目标属性", iPSDENotifyTarget.getName()));
				deTargetMap.put(iPSDENotifyTarget.getTargetPSDEField(), iPSDENotifyTarget.getTargetTypePSDEField());
				continue;
			}
		}

		if (sysMsgTargetRuntimeList != null) {
			this.sysMsgTargetRuntimeList = sysMsgTargetRuntimeList;
		}

		if (deTargetMap != null) {
			this.deTargetMap = deTargetMap;
		}

		if (this.getPSDENotify().isTimerMode()) {
			this.iPSDEDataSet = this.getPSDENotify().getPSDEDataSet();
			this.beginTimePSDEField = this.getPSDENotify().getBeginTimePSDEField();
			this.endTimePSDEField = this.getPSDENotify().getEndTimePSDEField();
			Assert.notNull(iPSDEDataSet, "查询结果集对象无效");
			Assert.notNull(beginTimePSDEField, "开始时间属性对象无效");
		}

		this.onInit();
	}

	@Override
	public IPSDENotify getPSDENotify() {
		return this.iPSDENotify;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDENotify();
	}

	public IPSDEDataSet getPSDEDataSet() {
		return iPSDEDataSet;
	}

	public IPSDEField getBeginTimePSDEField() {
		return beginTimePSDEField;
	}

	public IPSDEField getEndTimePSDEField() {
		return endTimePSDEField;
	}

	public ISysMsgTemplRuntime getSysMsgTemplRuntime() {
		return iSysMsgTemplRuntime;
	}

	public ISysMsgQueueRuntime getSysMsgQueueRuntime() {
		return iSysMsgQueueRuntime;
	}

	public List<IPSDENotifyTarget> getPSDENotifyTargets() {
		return this.psDENotifyTargetList;
	}

	protected List<ISysMsgTargetRuntime> getSysMsgTargetRuntimes() {
		return this.sysMsgTargetRuntimeList;
	}

	protected Map<IPSDEField, IPSDEField> getDETargets() {
		return this.deTargetMap;
	}

	@Override
	public String getId() {
		if (getPSDENotify() != null) {
			return getPSDENotify().getId();
		}
		return null;
	}

	@Override
	public String getName() {
		if (getPSDENotify() != null) {
			return getPSDENotify().getName();
		}
		return null;
	}

	@Override
	protected void onInit() throws Exception {
		ISysNotifyAgentRuntime iSysNotifyAgentRuntime = null;

		if (this.getPSDENotify().isTimerMode()) {
			if (this.getDynaInstRuntime() != null) {
				iSysNotifyAgentRuntime = this.getDynaInstRuntime().getSysNotifyAgentRuntime();
			} else {
				iSysNotifyAgentRuntime = this.getSystemRuntime().getSysNotifyAgentRuntime();
			}
		}

		super.onInit();

		if (this.getPSDENotify().isTimerMode()) {
			// 注册到通知代理
			iSysNotifyAgentRuntime.registerDENotifyRuntime(this);
		}
	}

	@Override
	public void send(IEntityBase iEntityBase) {
		try {
			onSend(iEntityBase);
		} catch (Throwable ex) {
			log.error(String.format("实体通知[%1$s]发送通知发生异常， %2$s", this.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), String.format("实体通知[%1$s]发送通知发生异常， %2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	protected void onSend(IEntityBase iEntityBase) throws Throwable {
		MsgSendQueue msgSendQueue = this.getMsgSendQueue(iEntityBase);
		if (msgSendQueue == null) {
			return;
		}

		this.getSysMsgQueueRuntime().send(new MsgSendQueue[] { msgSendQueue });
	}

	@Override
	public void send() {
		if (!this.getPSDENotify().isTimerMode()) {
			return;
		}

		try {
			onSend();
		} catch (Throwable ex) {
			log.error(String.format("实体通知[%1$s]发送通知发生异常， %2$s", this.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), String.format("实体通知[%1$s]发送通知发生异常， %2$s", this.getName(), ex.getMessage()), ex);
		}

	}

	protected void onSend() throws Throwable {
		// 进行数据查询
		ISearchContextBase iSearchContextBase = this.getDataEntityRuntime().createSearchContext();

		long nCurTime = System.currentTimeMillis();
		// 开始时间条件
		long nFromTime = nCurTime - this.getPSDENotify().getNotifyStart() * 60000;
		long nToTime = nCurTime + this.getPSDENotify().getNotifyEnd() * 60000;

		List<Sort.Order> list = new ArrayList<Sort.Order>();

		// 开始条件
		if (this.getBeginTimePSDEField() != null) {
			this.getDataEntityRuntime().setSearchCondition(iSearchContextBase, this.getBeginTimePSDEField(), Conditions.GTANDEQ, new java.sql.Timestamp(nFromTime));

			// 只需传入属性名称，实体运行时将进行转换
			list.add(Sort.Order.asc(this.getBeginTimePSDEField().getName()));

		}
		// 结束条件
		if (this.getEndTimePSDEField() != null) {
			this.getDataEntityRuntime().setSearchCondition(iSearchContextBase, this.getEndTimePSDEField(), Conditions.LTANDEQ, new java.sql.Timestamp(nToTime));
		} else if (this.getBeginTimePSDEField() != null) {
			this.getDataEntityRuntime().setSearchCondition(iSearchContextBase, this.getBeginTimePSDEField(), Conditions.LTANDEQ, new java.sql.Timestamp(nToTime));
		}

		// 自定义条件
		String strCustomCond = this.getPSDENotify().getCustomCond();
		if (StringUtils.hasLength(strCustomCond)) {
			this.getDataEntityRuntime().setSearchCustomCondition(iSearchContextBase, strCustomCond);
		}

		Sort sort = Sort.by(list);

		Map<String, IEntityBase> sendEntityMap = new HashMap<String, IEntityBase>();

		// 执行发生处理，要注意可能会重复发送，需要检查消息标记
		int nPageNumber = ISearchContext.STARTPAGE;
		while (true) {
			this.getDataEntityRuntime().setSearchPaging(iSearchContextBase, nPageNumber, PAGESIZE, sort);

			Page<? extends IEntityBase> page = this.getDataEntityRuntime().searchDataSet(this.getPSDEDataSet(), iSearchContextBase);
			if (page == null || page.getNumberOfElements() == 0) {
				break;
			}

			nPageNumber++;

			Map<String, IEntityBase> entityMap = new HashMap<String, IEntityBase>();

			for (IEntityBase iEntity : page.getContent()) {
				Object objKey = this.getDataEntityRuntime().getFieldValue(iEntity, this.getDataEntityRuntime().getKeyPSDEField());
				String strMsgId = KeyValueUtils.genUniqueId(this.getDataEntityRuntime().getId(), this.getId(), objKey);
				entityMap.put(strMsgId, iEntity);
			}

			// 检查是否需要发送
			MsgSendQueue[] msgSendQueues = this.getSysMsgQueueRuntime().listSimple(entityMap.keySet().toArray(new String[entityMap.size()]));
			if (msgSendQueues != null && msgSendQueues.length > 0) {
				for (MsgSendQueue msgSendQueue : msgSendQueues) {
					entityMap.remove(msgSendQueue.getMsgSendQueueId());
				}
			}

			sendEntityMap.putAll(entityMap);

			if (sendEntityMap.size() >= MAXCOUNT) {
				break;
			}
		}

		List<MsgSendQueue> msgSendQueueList = new ArrayList<MsgSendQueue>();

		// 执行数据发送
		for (java.util.Map.Entry<String, IEntityBase> entry : sendEntityMap.entrySet()) {
			MsgSendQueue msgSendQueue = this.getMsgSendQueue(entry.getValue());
			if (msgSendQueue == null) {
				continue;
			}
			msgSendQueue.setMsgSendQueueId(entry.getKey());

			msgSendQueueList.add(msgSendQueue);
		}

		if (msgSendQueueList.size() == 0) {
			return;
		}

		this.getSysMsgQueueRuntime().send(msgSendQueueList.toArray(new MsgSendQueue[msgSendQueueList.size()]));
	}

	protected MsgSendQueue getMsgSendQueue(IEntityBase iEntityBase) throws Throwable {
		// 判断消息类型
		int nMsgType = this.getPSDENotify().getMsgType();
		if (nMsgType == 0) {
			log.warn(String.format("实体[%1$s]通知[%2$s]没有指定消息类型，忽略建立通知消息", this.getDataEntityRuntime().getId(), this.getName()));
			return null;
		}

		Map<String, String> targetMap = new HashMap<String, String>();
		if (getDETargets() != null) {
			for (java.util.Map.Entry<IPSDEField, IPSDEField> entry : getDETargets().entrySet()) {
				String strTargetId = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(iEntityBase, entry.getKey()), null);
				if (!StringUtils.hasLength(strTargetId)) {
					continue;
				}
				String strTargetType = null;
				if (entry.getValue() != null) {
					strTargetType = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(iEntityBase, entry.getValue()), null);
				}

				targetMap.put(strTargetId, strTargetType);
			}
		}

		if (this.getSysMsgTargetRuntimes() != null) {
			for (ISysMsgTargetRuntime iSysMsgTargetRuntime : this.getSysMsgTargetRuntimes()) {
				Map<String, String> result = iSysMsgTargetRuntime.get(iEntityBase);
				if (result != null) {
					targetMap.putAll(result);
				}
			}
		}

		// 计算自定义目标用户
		for (IPSDENotifyTarget iPSDENotifyTarget : getPSDENotifyTargets()) {
			Map<String, String> result = this.getTarget(iPSDENotifyTarget, iEntityBase);
			if (result != null) {
				targetMap.putAll(result);
			}
		}

		if (targetMap.size() == 0) {
			log.warn(String.format("实体[%1$s]通知[%2$s]没有任何通知目标，忽略建立通知消息", this.getDataEntityRuntime().getId(), this.getName()));
			return null;
		}

		MsgSendQueue msgSendQueue = new MsgSendQueue();

		IScriptEntity iScriptEntity = this.getDataEntityRuntime().createScriptEntity(iEntityBase);

		msgSendQueue.setMsgType(nMsgType);
		// 填充标题
		msgSendQueue.setSubject(getSysMsgTemplRuntime().getSubject(iScriptEntity));
		msgSendQueue.setTemplateId(getSysMsgTemplRuntime().getPSSysMsgTempl().getCodeName());

		msgSendQueue.setUrl(getSysMsgTemplRuntime().getUrl(iScriptEntity));
		msgSendQueue.setMobileUrl(getSysMsgTemplRuntime().getMobileUrl(iScriptEntity));

		// 邮件及内部消息
		if ((nMsgType & (MsgTypes.INTERNAL | MsgTypes.EMAIL)) != 0) {
			msgSendQueue.setContent(getSysMsgTemplRuntime().getContent(iScriptEntity));
			msgSendQueue.setContentType(getSysMsgTemplRuntime().getContentType());
		}

		// 短消息
		if ((nMsgType & (MsgTypes.SMS)) != 0) {
			msgSendQueue.setSMSContent(getSysMsgTemplRuntime().getSMSContent(iScriptEntity));
		}

		// 即时通讯
		if ((nMsgType & (MsgTypes.MSN | MsgTypes.IM)) != 0) {
			msgSendQueue.setIMContent(getSysMsgTemplRuntime().getIMContent(iScriptEntity));
		}

		// 微信
		if ((nMsgType & (MsgTypes.WX)) != 0) {
			msgSendQueue.setWXContent(getSysMsgTemplRuntime().getWXContent(iScriptEntity));
		}

		// 钉钉
		if ((nMsgType & (MsgTypes.DD)) != 0) {
			msgSendQueue.setDDContent(getSysMsgTemplRuntime().getDDContent(iScriptEntity));
		}

		ArrayNode array = JsonUtils.createArrayNode();
		for (java.util.Map.Entry<String, String> entry : targetMap.entrySet()) {
			array.add(entry.getKey());
		}

		msgSendQueue.setDstUsers(array.toString());

		return msgSendQueue;
	}

	protected Map<String, String> getTarget(IPSDENotifyTarget iPSDENotifyTarget, IEntityBase iEntityBase) throws Throwable {
		if (DENotifyTargetTypes.DEFIELD.equals(iPSDENotifyTarget.getTargetType())) {

			Object objTargetId = this.getDataEntityRuntime().getFieldValue(iEntityBase, iPSDENotifyTarget.getTargetPSDEFieldMust());
			if (ObjectUtils.isEmpty(objTargetId)) {
				return null;
			}
			
			List<String> list = this.getTargetIdList(objTargetId);
			if (ObjectUtils.isEmpty(list)) {
				return null;
			}
			
			Map<String, String> map = new LinkedHashMap<String, String>();
			if (iPSDENotifyTarget.getTargetTypePSDEField() != null) {
				Object objTargetType = this.getDataEntityRuntime().getFieldValue(iEntityBase, iPSDENotifyTarget.getTargetTypePSDEField());
				if (!ObjectUtils.isEmpty(objTargetType)) {
					for(String strItem : list) {
						map.put(strItem, objTargetType.toString());
					}
					
					return map;
				}
			}
			
			for(String strItem : list) {
				map.put(strItem, null);
			}
			return map;
		}
		 if(DENotifyTargetTypes.SYSMSGTARGET.equals(iPSDENotifyTarget.getTargetType()))
		 {
			 return null;
		 }
		log.warn(String.format("未支持的消息目标[%1$s][%2$s]", iPSDENotifyTarget.getName(), iPSDENotifyTarget.getTargetType()));
		return null;
	}

	protected List<String> getTargetIdList(Object objTargetId) throws Throwable {
		if(ObjectUtils.isEmpty(objTargetId)) {
			return null;
		}
		
		if (objTargetId instanceof List) {
			List list = (List)objTargetId;
			List<String> list2 = new ArrayList<String>();
			for(Object item : list) {
				List<String> list4 = getTargetIdList(item);
				if (!ObjectUtils.isEmpty(list4)) {
					list2.addAll(list4);
				}
			}
			return list2.size()>0? list2:null;
		}

		if (objTargetId instanceof Map) {
			Map map = (Map)objTargetId;
			List<String> list2 = new ArrayList<String>();
			for(Object item : map.keySet()) {
				List<String> list4 = getTargetIdList(item);
				if (!ObjectUtils.isEmpty(list4)) {
					list2.addAll(list4);
				}
			}
			return list2.size()>0? list2:null;
		}

		if (objTargetId.getClass().isArray()) {
			List<String> list2 = new ArrayList<String>();
			if (objTargetId instanceof Object[]) {
				Object[] list3 = (Object[]) objTargetId;
				for (int i = 0; i < list3.length; i++) {
					List<String> list4 = getTargetIdList(list3[i]);
					if (!ObjectUtils.isEmpty(list4)) {
						list2.addAll(list4);
					}
				}
			} else if (objTargetId instanceof int[]) {
				int[] list3 = (int[]) objTargetId;
				for (int i = 0; i < list3.length; i++) {
					list2.add(Integer.toString(list3[i]));
				}
			} else {
				log.warn(String.format("无法从值[%1$s]计算消息目标", objTargetId));
			}
			return list2.size()>0? list2:null;
		}
		
		if(objTargetId instanceof ArrayNode) {
			List<String> list2 = new ArrayList<String>();
			ArrayNode arrayNode = (ArrayNode)objTargetId;
			for(int i = 0;i<arrayNode.size();i++) {
				JsonNode jsonNode = arrayNode.get(i);
				String strValue = jsonNode.asText();
				if(!ObjectUtils.isEmpty(strValue)) {
					list2.add(strValue);
				}
			}
			return list2.size()>0? list2:null;
		}

		String id = objTargetId.toString();
		if(id.indexOf("[") == 0) {
			ArrayNode arrayNode = JsonUtils.toArrayNode(id);
			return getTargetIdList(arrayNode);
		}
		
		return Arrays.asList(id.replace(",", ";").split("[;]"));
	}

}
