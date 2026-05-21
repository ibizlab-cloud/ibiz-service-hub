package net.ibizsys.central.cloud.core.dataentity.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.dataentity.logic.DELogicParamRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 聊天交互请求参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicChatCompletionRequestParamRuntime extends DELogicParamRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicChatCompletionRequestParamRuntime.class);
	
	/**
	 * 参数：最后的消息内容
	 */
	public final static String PARAM_LAST = "last";
	
	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
//		Object objParam = getParamObject(iDELogicSession);
//		if (objParam instanceof ChatCompletionRequest) {
//			if (this.getDataEntityRuntime() != null) {
//				return this.getDataEntityRuntime().createScriptSearchContext((ChatCompletionRequest) objParam);
//			}
//		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof ChatCompletionRequest)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是聊天交互请求类型", getCodeName()));
			}
			return object;
		}
		// 新建
		object = createChatCompletionRequest();
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	protected ChatCompletionRequest createChatCompletionRequest() throws Throwable {
		return new ChatCompletionRequest();
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if (!(paramObject instanceof ChatCompletionRequest)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非聊天交互请求类型参数", getCodeName()));
			}
		}
		super.bind(iDELogicSession, paramObject);
	}
	

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		Object param = this.getParamObject(iDELogicSession);
		ChatCompletionRequest chatCompletionRequest = null;
		if(param instanceof ChatCompletionRequest) {
			chatCompletionRequest = (ChatCompletionRequest)param;
		}
		
		if(chatCompletionRequest == null) {
			super.set(iDELogicSession, strName, objValue);
			return;
		}
		
		if(ChatCompletionRequest.FIELD_CHUNKQUERIES.equalsIgnoreCase(strName)) {
			List<String> chunkQueries = this.getIntentList(objValue);
			chatCompletionRequest.setChunkQueries(chunkQueries);
			return;
		}
		
		
		chatCompletionRequest.set(strName, objValue);
		return;
	}
	
	protected List<String> getIntentList(Object objParam) throws Exception {
		List<String> intentList = new ArrayList<String>();
		if(objParam == null) {
			return intentList;
		}
		//判断类型
		if(objParam instanceof List) {
			List list = (List)objParam;
			for(Object item : list) {
				if(item instanceof IEntity) {
					IEntity iEntity = (IEntity)item;
					for(String field : DELogicSysAIChatAgentNodeRuntime.INTENT_FIELDS) {
						Object value = iEntity.get(field);
						if(value instanceof String) {
							String strIntent = (String)value;
							if(StringUtils.hasLength(strIntent)) {
								intentList.add(strIntent);
							}
							break;
						}
					}
				}
				else
					if(item instanceof String) {
						String strIntent = (String)item;
						if(StringUtils.hasLength(strIntent)) {
							intentList.add(strIntent);
						}
					}
					else
						throw new Exception(String.format("无法从数据项类型[%1$s]提取用户意图", item.getClass()));
			}
		}
		else 
			if(objParam instanceof IEntity) {
				IEntity iEntity = (IEntity)objParam;
				for(String field : DELogicSysAIChatAgentNodeRuntime.INTENT_FIELDS) {
					Object value = iEntity.get(field);
					if(value instanceof String) {
						String strIntent = (String)value;
						if(StringUtils.hasLength(strIntent)) {
							intentList.add(strIntent);
						}
						break;
					}
				}
			}
			else
				if(objParam instanceof String) {
					String strIntent = (String)objParam;
					if(StringUtils.hasLength(strIntent)) {
						intentList.add(strIntent);
					}
				}
				else
					throw new Exception(String.format("无法从参数类型[%1$s]提取用户意图", objParam.getClass()));
		
		return intentList;
	}
	
	
	@Override
	public Object get(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object param = this.getParamObject(iDELogicSession);
		ChatCompletionRequest chatCompletionRequest = null;
		if(param instanceof ChatCompletionRequest) {
			chatCompletionRequest = (ChatCompletionRequest)param;
		}
		
		if(chatCompletionRequest == null) {
			return super.get(iDELogicSession, strName);
		}
		
		if(PARAM_LAST.equalsIgnoreCase(strName)) {
			if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
				return null;
			}
			
			String strContent = chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() -1).getContent();
			return strContent;
		}
		
		return super.get(iDELogicSession, strName);
	}
	
	@Override
	public void reset(IDELogicSession iDELogicSession, String strName) throws Throwable {
		Object param = this.getParamObject(iDELogicSession);
		ChatCompletionRequest chatCompletionRequest = null;
		if(param instanceof ChatCompletionRequest) {
			chatCompletionRequest = (ChatCompletionRequest)param;
		}
		
		if(chatCompletionRequest == null) {
			super.reset(iDELogicSession, strName);
			return;
		}
		
		chatCompletionRequest.reset(strName);
	}
}
