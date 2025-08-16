package net.ibizsys.central.res;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.InfomMsgType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 支持 @ 符号内容转换器对象
 *
 * @author lionlau
 *
 */
public class SysAtContentTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAtContentTranslatorRuntime.class);

	private final static Map<String, Integer> MsgTypeMap = new LinkedHashMap<String, Integer>();

	static {
		MsgTypeMap.put(InfomMsgType.INTERNAL.toString(), InfomMsgType.INTERNAL.value);
		MsgTypeMap.put(InfomMsgType.DT.toString(), InfomMsgType.DT.value);
		MsgTypeMap.put(InfomMsgType.EMAIL.toString(), InfomMsgType.EMAIL.value);
		MsgTypeMap.put(InfomMsgType.ENTWT.toString(), InfomMsgType.ENTWT.value);
		MsgTypeMap.put("ENTWX", InfomMsgType.ENTWT.value);
		MsgTypeMap.put(InfomMsgType.MSN.toString(), InfomMsgType.MSN.value);
		MsgTypeMap.put(InfomMsgType.SAIM.toString(), InfomMsgType.SAIM.value);
		MsgTypeMap.put(InfomMsgType.SMS.toString(), InfomMsgType.SMS.value);
		MsgTypeMap.put(InfomMsgType.WT.toString(), InfomMsgType.WT.value);
		MsgTypeMap.put("WX", InfomMsgType.WT.value);
		MsgTypeMap.put(InfomMsgType.USER.toString(), InfomMsgType.USER.value);
		MsgTypeMap.put(InfomMsgType.USER2.toString(), InfomMsgType.USER2.value);
	}

	// 编译正则表达式
	private final static Pattern Regex = Pattern.compile("@(\\{.*?\\})");


	public final static String TEMPLPARAM_CONTENT = "content";

	public final static String PARAM_MSGTYPE = "msgtype";

	public final static String PARAM_MSGTEMPL = "msgtempl";

	public final static String PARAM_MSGQUEUE = "msgqueue";

	public final static String PARAM_USERID = "userid";

	public final static String PARAM_USERNAME = "username";
	
	public final static String PARAM_CODEITEMTEXTSUFFIX = "codeitemtextsuffix";
	
	public final static String PARAM_THREADMODE = "threadmode";
	

	private String strUserIdField = null;

	private String strUserNameField = null;

	private int nMsgType = InfomMsgType.INTERNAL.value;

	private String strMsgTemplTag = "";

	private String strMsgQueueTag = "";

	private String strCodeItemTextSuffix = null;

	private ISysMsgTemplRuntime iSysMsgTemplRuntime = null;
	private ISysMsgQueueRuntime iSysMsgQueueRuntime = null;
	
	private boolean bThreadMode = true;

	@Override
	protected void onInit() throws Exception {
		this.strUserIdField = this.getTranslatorParam(PARAM_USERID, "id");
		this.strUserNameField = this.getTranslatorParam(PARAM_USERNAME, "name");
		String strMsgType = this.getTranslatorParam(PARAM_MSGTYPE, "INTERNAL");
		this.strCodeItemTextSuffix = this.getTranslatorParam(PARAM_CODEITEMTEXTSUFFIX, "text");
		if(StringUtils.hasLength(strMsgType)) {
			nMsgType = 0;
			String[] items = strMsgType.toUpperCase().replace(",",";").split("[;]");
			for(String item : items) {
				if(!MsgTypeMap.containsKey(item)) {
					continue;
				}
				nMsgType |= MsgTypeMap.get(item);
			}
			if(nMsgType == 0) {
				nMsgType = InfomMsgType.INTERNAL.value;
			}
		}
		this.strMsgTemplTag = this.getTranslatorParam(PARAM_MSGTEMPL, null);
		this.strMsgQueueTag = this.getTranslatorParam(PARAM_MSGQUEUE, null);
		this.bThreadMode = this.getTranslatorParam(PARAM_THREADMODE, true);

		if(StringUtils.hasLength(this.getMsgTemplTag())) {
			this.iSysMsgTemplRuntime = this.getSystemRuntime().getSysMsgTemplRuntime(this.getMsgTemplTag(), false);
		}

		if(StringUtils.hasLength(this.getMsgQueueTag())) {
			this.iSysMsgQueueRuntime = (ISysMsgQueueRuntime)this.getSystemRuntime().getSysMsgQueueRuntime(this.getMsgQueueTag(), false);
		}

		if(this.getSysMsgQueueRuntime() == null) {
			throw new Exception("未指定消息发送队列");
		}

		if(this.getSysMsgTemplRuntime() == null) {
			throw new Exception("未指定消息模板");
		}

		super.onInit();
	}

	protected Pattern getPattern() {
		return SysAtContentTranslatorRuntime.Regex;
	}

	protected String getUserIdField() {
		return strUserIdField;
	}

	protected String getUserNameField() {
		return strUserNameField;
	}


	protected int getMsgType() {
		return nMsgType;
	}

	protected String getMsgTemplTag() {
		return strMsgTemplTag;
	}

	protected String getMsgQueueTag() {
		return strMsgQueueTag;
	}

	protected String getCodeItemTextSuffix() {
		return strCodeItemTextSuffix;
	}

	protected ISysMsgQueueRuntime getSysMsgQueueRuntime() {
		return this.iSysMsgQueueRuntime;
	}

	protected ISysMsgTemplRuntime getSysMsgTemplRuntime() {
		return this.iSysMsgTemplRuntime;
	}

	protected boolean isThreadMode() {
		return this.bThreadMode;
	}
	
	@Override
	protected Object onTranslate(Object objValue, boolean bIn, IEntityDTO iEntityDTO, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		if (bIn && !ObjectUtils.isEmpty(objValue) && iEntityDTO!=null) {
			// 再输入的时候处理
			if (iPSDEField != null && entityDataEntityRuntime != null) {
				IEntityBase lastEntity = entityDataEntityRuntime.getLastEntity();
				if (lastEntity != null) {
					Object lastContent = entityDataEntityRuntime.getFieldValue(lastEntity, iPSDEField);
					// 判断内容是否变化
					if (DataTypeUtils.compare(iPSDEField.getStdDataType(), objValue, lastContent) == 0) {
						return super.onTranslate(objValue, bIn, iEntityDTO, iPSDEField, entityDataEntityRuntime);
					}
				}
			}

			// 进行内容分析
			String text = objValue.toString();
			// 创建 Matcher 对象，并匹配文本
			Matcher matcher = getPattern().matcher(text);

			// 查找匹配的结果
			Map<String, String> replaceContentMap = new LinkedHashMap<>();
			Map<String, String> userIdMap = new LinkedHashMap<>();
			while (matcher.find()) {
				// 提取 JSON 内容
				String json = matcher.group(1);
				try {
					Map<String, Object> map = JsonUtils.asMap(json);
					Object userid = map.get(this.getUserIdField());
					Object username = map.get(this.getUserNameField());
					if(userid != null && username != null) {
						//替换新内容
						replaceContentMap.put(String.format("@%1$s", json), String.format("@%1$s", username));
						userIdMap.put(userid.toString(), username.toString());
					}
				} catch (Throwable ex) {
					log.error(String.format("转化值处理解析Json发生异常，%1$s", ex.getMessage()), ex);
				}
			}

			if(replaceContentMap.size() > 0) {
				//形成新内容
				for(java.util.Map.Entry<String, String> entry : replaceContentMap.entrySet()) {
					text = text.replace(entry.getKey(), entry.getValue());
				}

				Map<String, Object> templParams = new HashMap<String, Object>();
				templParams.put(TEMPLPARAM_CONTENT, text);
				
				ActionSessionManager.getCurrentSession().registerFutureAction(new ASFutureActionBase() {
					@Override
					public void commit() {
						if(isThreadMode()) {
							getSystemRuntime().threadRun(new Runnable() {
								@Override
								public void run() {
									onCommit();
								}
							});
						}
						else {
							onCommit();
						}
					}
					
					private void onCommit() {
						IEntityDTO temp = iEntityDTO;
						if(entityDataEntityRuntime instanceof net.ibizsys.central.dataentity.IDataEntityRuntime) {
							temp = ((net.ibizsys.central.dataentity.IDataEntityRuntime)entityDataEntityRuntime).createEntity();
							iEntityDTO.copyTo(temp, true);
							((net.ibizsys.central.dataentity.IDataEntityRuntime)entityDataEntityRuntime).fillEntityCodeListTexts(temp, getCodeItemTextSuffix());
						}

						MsgSendQueue msgSendQueue;
						try {
							msgSendQueue = getMsgSendQueue(temp, templParams, userIdMap, entityDataEntityRuntime);
						} catch (Throwable ex) {
							log.error(String.format("获取消息发送队列发生异常，%1$s", ex.getMessage()), ex);
							return;
						}
						if(msgSendQueue == null) {
							return;
						}
						getSysMsgQueueRuntime().send(new MsgSendQueue[] {msgSendQueue});
					}
				});
			}
		}
		return super.onTranslate(objValue, bIn, iEntityDTO, iPSDEField, entityDataEntityRuntime);
	}



	protected MsgSendQueue getMsgSendQueue(IEntity iEntity, Map<String, Object> params, Map<String, String> targetMap, IDataEntityRuntime entityDataEntityRuntime) throws Throwable{
		// 判断消息类型
		MsgSendQueue msgSendQueue = fillMsgSendQueue(null, iEntity, params, entityDataEntityRuntime);

		ArrayNode array = JsonUtils.createArrayNode();
		for(java.util.Map.Entry<String,String> entry: targetMap.entrySet()) {
			array.add(entry.getKey());
		}

		msgSendQueue.setDstUsers(array.toString());

		return msgSendQueue;
	}

	protected MsgSendQueue fillMsgSendQueue(MsgSendQueue msgSendQueue, IEntity iEntity, Map<String, Object> params, IDataEntityRuntime entityDataEntityRuntime) throws Throwable{
		if(msgSendQueue == null) {
			msgSendQueue = new MsgSendQueue();
		}

		int nMsgType = this.getMsgType();

		IEntityBase data = iEntity;

		if(entityDataEntityRuntime != null) {
			data = entityDataEntityRuntime.createScriptEntity(iEntity);
		}

		net.ibizsys.central.msg.ISysMsgTemplRuntime iSysMsgTemplRuntime = null;
		if(this.getSysMsgTemplRuntime() instanceof net.ibizsys.central.msg.ISysMsgTemplRuntime) {
			iSysMsgTemplRuntime = (net.ibizsys.central.msg.ISysMsgTemplRuntime)this.getSysMsgTemplRuntime();
		}


		msgSendQueue.setMsgType(nMsgType);
		msgSendQueue.setTemplateId(getSysMsgTemplRuntime().getPSSysMsgTempl().getCodeName());

		// 填充标题
		if(iSysMsgTemplRuntime != null) {
			msgSendQueue.setSubject(iSysMsgTemplRuntime.getSubject(data, params));
			msgSendQueue.setUrl(iSysMsgTemplRuntime.getUrl(data, params));
			msgSendQueue.setMobileUrl(iSysMsgTemplRuntime.getMobileUrl(data, params));
		}
		else {
			msgSendQueue.setSubject(getSysMsgTemplRuntime().getSubject(data));
			msgSendQueue.setUrl(getSysMsgTemplRuntime().getUrl(data));
			msgSendQueue.setMobileUrl(getSysMsgTemplRuntime().getMobileUrl(data));
		}


		// 邮件及内部消息
		if ((nMsgType & (MsgTypes.INTERNAL | MsgTypes.EMAIL)) != 0) {
			msgSendQueue.setContentType(getSysMsgTemplRuntime().getContentType());
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setContent(iSysMsgTemplRuntime.getContent(data, params));
			}
			else {
				msgSendQueue.setContent(getSysMsgTemplRuntime().getContent(data));
			}
		}

		// 短消息
		if ((nMsgType & (MsgTypes.SMS)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setSMSContent(iSysMsgTemplRuntime.getSMSContent(data, params));
			}
			else {
				msgSendQueue.setSMSContent(getSysMsgTemplRuntime().getSMSContent(data));
			}
		}

		// 即时通讯
		if ((nMsgType & (MsgTypes.MSN | MsgTypes.IM)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setIMContent(iSysMsgTemplRuntime.getIMContent(data, params));
			}
			else {
				msgSendQueue.setIMContent(getSysMsgTemplRuntime().getIMContent(data));
			}

		}

		// 微信
		if ((nMsgType & (MsgTypes.WX)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setWXContent(iSysMsgTemplRuntime.getWXContent(data, params));
			}
			else {
				msgSendQueue.setWXContent(getSysMsgTemplRuntime().getWXContent(data));
			}
		}

		// 钉钉
		if ((nMsgType & (MsgTypes.DD)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setDDContent(iSysMsgTemplRuntime.getDDContent(data, params));
			}
			else {
				msgSendQueue.setDDContent(getSysMsgTemplRuntime().getDDContent(data));
			}
		}


		return msgSendQueue;
	}

}
