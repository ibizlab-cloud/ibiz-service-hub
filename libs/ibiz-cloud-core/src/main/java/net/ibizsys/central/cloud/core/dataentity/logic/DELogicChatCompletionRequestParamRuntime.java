package net.ibizsys.central.cloud.core.dataentity.logic;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.dataentity.logic.DELogicParamRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 聊天交互请求参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicChatCompletionRequestParamRuntime extends DELogicParamRuntimeBase {

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
		
		if(chatCompletionRequest == null || objValue == null) {
			super.set(iDELogicSession, strName, objValue);
			return;
		}
		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_PAGE.equalsIgnoreCase(strName)) {
//			int nPage = Integer.valueOf(objValue.toString());
//			if (nPage < 0) {
//				nPage = 0;
//			}
//			
//			Pageable lastPageable = chatCompletionRequest.getPageable();
//			if(lastPageable == null) {
//				chatCompletionRequest.setPageable(PageRequest.of(nPage, SearchContextDTO.getMaxSize(), 0));
//			}
//			else {
//				chatCompletionRequest.setPageable(PageRequest.of(nPage, lastPageable.getPageSize(), lastPageable.getOffset()));
//			}
//			return;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_SIZE.equalsIgnoreCase(strName)) {
//			int nSize = Integer.valueOf(objValue.toString());
//			if (nSize <= 0) {
//				nSize = ChatCompletionRequest.DEFAULTPAGESIZE;
//			}
//			
//			Pageable lastPageable = chatCompletionRequest.getPageable();
//			if(lastPageable == null) {
//				chatCompletionRequest.setPageable(PageRequest.of(ChatCompletionRequest.STARTPAGE, nSize));
//			}
//			else {
//				chatCompletionRequest.setPageable(PageRequest.of(lastPageable.getPageNumber(), nSize, lastPageable.getOffset()));
//			}
//			return;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_OFFSET.equalsIgnoreCase(strName)) {
//			int nOffset = Integer.valueOf(objValue.toString());
//			if (nOffset < 0) {
//				nOffset = 0;
//			}
//			
//			Pageable lastPageable = chatCompletionRequest.getPageable();
//			if(lastPageable == null) {
//				chatCompletionRequest.setPageable(PageRequest.of(ChatCompletionRequest.STARTPAGE, ChatCompletionRequest.DEFAULTPAGESIZE, nOffset));
//			}
//			else {
//				chatCompletionRequest.setPageable(PageRequest.of(lastPageable.getPageNumber(), lastPageable.getPageSize(), nOffset));
//			}
//			return;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_SORT.equalsIgnoreCase(strName)) {
//			String strSortInfo = (String) objValue;
//			strSortInfo = strSortInfo.trim();
//			chatCompletionRequest.setPageSort(strSortInfo);
//			return ;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_QUERY.equalsIgnoreCase(strName)) {
//			String strQuery = objValue.toString();
//			strQuery = strQuery.trim();
//			
//			SearchContextDTO.addSearchQuickCond(chatCompletionRequest, strQuery);
//			return ;
//		}
//		
//		if(chatCompletionRequest.getDEMethodDTORuntime()!=null) {
//			IPSDEMethodDTOField iPSDEMethodDTOField = chatCompletionRequest.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
//			if(iPSDEMethodDTOField!=null) {
//				SearchContextDTO.addSearchFieldCond(chatCompletionRequest, strName, objValue);
//				return;
//			}
//		}
//		
//		chatCompletionRequest.set(strName, objValue);
		return;
	}
}
