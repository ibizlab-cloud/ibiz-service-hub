package net.ibizsys.central.dataentity.logic;

import org.springframework.data.domain.Pageable;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageRequest;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 数据查询过滤器参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicFilterParamRuntime extends DELogicParamRuntimeBase {

	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if (objParam instanceof ISearchContextBase) {
			if (this.getDataEntityRuntime() != null) {
				return this.getDataEntityRuntime().createScriptSearchContext((ISearchContextBase) objParam);
			}
		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof ISearchContextBase)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是搜索过滤器类型", getCodeName()));
			}
			return object;
		}
		// 新建
		object = createSearchContext();
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	protected ISearchContextDTO createSearchContext() throws Throwable {
		if (this.getDataEntityRuntime() == null) {
			return new SearchContextDTO();
		} else {
			return this.getDataEntityRuntime().createSearchContext();
		}
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if (!(paramObject instanceof ISearchContextBase)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非搜索过滤器类型参数", getCodeName()));
			}
		}
		super.bind(iDELogicSession, paramObject);
	}
	

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		Object searchContext = this.getParamObject(iDELogicSession);
		ISearchContextDTO iSearchContextDTO = null;
		if(searchContext instanceof ISearchContextDTO) {
			iSearchContextDTO = (ISearchContextDTO)searchContext;
		}
		
		if(iSearchContextDTO == null || objValue == null) {
			super.set(iDELogicSession, strName, objValue);
			return;
		}
		
		if(net.ibizsys.central.util.ISearchContext.PARAM_PAGE.equalsIgnoreCase(strName)) {
			int nPage = Integer.valueOf(objValue.toString());
			if (nPage < 0) {
				nPage = 0;
			}
			
			Pageable lastPageable = iSearchContextDTO.getPageable();
			if(lastPageable == null) {
				iSearchContextDTO.setPageable(PageRequest.of(nPage, SearchContextDTO.getMaxSize(), 0));
			}
			else {
				iSearchContextDTO.setPageable(PageRequest.of(nPage, lastPageable.getPageSize(), lastPageable.getOffset()));
			}
			return;
		}
		
		if(net.ibizsys.central.util.ISearchContext.PARAM_SIZE.equalsIgnoreCase(strName)) {
			int nSize = Integer.valueOf(objValue.toString());
			if (nSize <= 0) {
				nSize = ISearchContextDTO.DEFAULTPAGESIZE;
			}
			
			Pageable lastPageable = iSearchContextDTO.getPageable();
			if(lastPageable == null) {
				iSearchContextDTO.setPageable(PageRequest.of(ISearchContextDTO.STARTPAGE, nSize));
			}
			else {
				iSearchContextDTO.setPageable(PageRequest.of(lastPageable.getPageNumber(), nSize, lastPageable.getOffset()));
			}
			return;
		}
		
		if(net.ibizsys.central.util.ISearchContext.PARAM_OFFSET.equalsIgnoreCase(strName)) {
			int nOffset = Integer.valueOf(objValue.toString());
			if (nOffset < 0) {
				nOffset = 0;
			}
			
			Pageable lastPageable = iSearchContextDTO.getPageable();
			if(lastPageable == null) {
				iSearchContextDTO.setPageable(PageRequest.of(ISearchContextDTO.STARTPAGE, ISearchContextDTO.DEFAULTPAGESIZE, nOffset));
			}
			else {
				iSearchContextDTO.setPageable(PageRequest.of(lastPageable.getPageNumber(), lastPageable.getPageSize(), nOffset));
			}
			return;
		}
		
		if(net.ibizsys.central.util.ISearchContext.PARAM_SORT.equalsIgnoreCase(strName)) {
			String strSortInfo = (String) objValue;
			strSortInfo = strSortInfo.trim();
			iSearchContextDTO.setPageSort(strSortInfo);
			return ;
		}
		
		if(net.ibizsys.central.util.ISearchContext.PARAM_QUERY.equalsIgnoreCase(strName)) {
			String strQuery = objValue.toString();
			strQuery = strQuery.trim();
			
			SearchContextDTO.addSearchQuickCond(iSearchContextDTO, strQuery);
			return ;
		}
		
		if(iSearchContextDTO.getDEMethodDTORuntime()!=null) {
			IPSDEMethodDTOField iPSDEMethodDTOField = iSearchContextDTO.getDEMethodDTORuntime().getPSDEMethodDTOField(strName, true);
			if(iPSDEMethodDTOField!=null) {
				SearchContextDTO.addSearchFieldCond(iSearchContextDTO, strName, objValue);
				return;
			}
		}
		
		iSearchContextDTO.set(strName, objValue);
		return;
	}
}
