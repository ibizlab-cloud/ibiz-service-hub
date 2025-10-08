package net.ibizsys.central.cloud.core.dataentity.logic;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.dataentity.logic.DELogicParamRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 聊天交互反馈参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicChatCompletionResultParamRuntime extends DELogicParamRuntimeBase {

	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
//		Object objParam = getParamObject(iDELogicSession);
//		if (objParam instanceof ChatCompletionResult) {
//			if (this.getDataEntityRuntime() != null) {
//				return this.getDataEntityRuntime().createScriptSearchContext((ChatCompletionResult) objParam);
//			}
//		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof ChatCompletionResult)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是聊天交互反馈类型", getCodeName()));
			}
			return object;
		}
		// 新建
		object = createChatCompletionResult();
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	protected ChatCompletionResult createChatCompletionResult() throws Throwable {
		return new ChatCompletionResult();
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if (!(paramObject instanceof ChatCompletionResult)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非聊天交互反馈类型参数", getCodeName()));
			}
		}
		super.bind(iDELogicSession, paramObject);
	}
	

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		Object param = this.getParamObject(iDELogicSession);
		ChatCompletionResult chatCompletionResult = null;
		if(param instanceof ChatCompletionResult) {
			chatCompletionResult = (ChatCompletionResult)param;
		}
		
		if(chatCompletionResult == null || objValue == null) {
			super.set(iDELogicSession, strName, objValue);
			return;
		}
		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_PAGE.equalsIgnoreCase(strName)) {
//			int nPage = Integer.valueOf(objValue.toString());
//			if (nPage < 0) {
//				nPage = 0;
//			}
//			
//			Pageable lastPageable = chatCompletionResult.getPageable();
//			if(lastPageable == null) {
//				chatCompletionResult.setPageable(PageResult.of(nPage, SearchContextDTO.getMaxSize(), 0));
//			}
//			else {
//				chatCompletionResult.setPageable(PageResult.of(nPage, lastPageable.getPageSize(), lastPageable.getOffset()));
//			}
//			return;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_SIZE.equalsIgnoreCase(strName)) {
//			int nSize = Integer.valueOf(objValue.toString());
//			if (nSize <= 0) {
//				nSize = ChatCompletionResult.DEFAULTPAGESIZE;
//			}
//			
//			Pageable lastPageable = chatCompletionResult.getPageable();
//			if(lastPageable == null) {
//				chatCompletionResult.setPageable(PageResult.of(ChatCompletionResult.STARTPAGE, nSize));
//			}
//			else {
//				chatCompletionResult.setPageable(PageResult.of(lastPageable.getPageNumber(), nSize, lastPageable.getOffset()));
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
//			Pageable lastPageable = chatCompletionResult.getPageable();
//			if(lastPageable == null) {
//				chatCompletionResult.setPageable(PageResult.of(ChatCompletionResult.STARTPAGE, ChatCompletionResult.DEFAULTPAGESIZE, nOffset));
//			}
//			else {
//				chatCompletionResult.setPageable(PageResult.of(lastPageable.getPageNumber(), lastPageable.getPageSize(), nOffset));
//			}
//			return;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_SORT.equalsIgnoreCase(strName)) {
//			String strSortInfo = (String) objValue;
//			strSortInfo = strSortInfo.trim();
//			chatCompletionResult.setPageSort(strSortInfo);
//			return ;
//		}
//		
//		if(net.ibizsys.central.util.ISearchContext.PARAM_QUERY.equalsIgnoreCase(strName)) {
//			String strQuery = objValue.toString();
//			strQuery = strQuery.trim();
//			
//			SearchContextDTO.addSearchQuickCond(chatCompletionResult, strQuery);
//			return ;
//		}
//		
//		if(chatCompletionResult.getDEMethodDTORuntime()!=null) {
//			IPSDEMethodDTOField iPSDEMethodDTOField = chatCompletionResult.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
//			if(iPSDEMethodDTOField!=null) {
//				SearchContextDTO.addSearchFieldCond(chatCompletionResult, strName, objValue);
//				return;
//			}
//		}
//		
//		chatCompletionResult.set(strName, objValue);
		return;
	}
}
