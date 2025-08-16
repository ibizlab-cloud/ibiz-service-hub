package net.ibizsys.central.util.script;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.central.util.PageRequest;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class ScriptSearchContext implements IScriptSearchContext{

	private ISearchContextDTO iSearchContextDTO;
//	private SearchContextDTO searchContextDTO = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	public ScriptSearchContext(IDataEntityRuntime iDataEntityRuntime, ISearchContextDTO iSearchContextDTO) {
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.iSearchContextDTO = iSearchContextDTO;
//		if(this.iSearchContextDTO instanceof SearchContextDTO) {
//			this.searchContextDTO = (SearchContextDTO)iSearchContextDTO;
//		}
		
		Assert.notNull(getSearchContextDTO(), "搜索上下文对象无效");
	}
	
	
	@Override
	public Object getReal() {
		return this.getSearchContextDTO();
	}
	
	protected ISearchContextDTO getSearchContextDTO() {
		return this.iSearchContextDTO;
	}

	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	protected IDataEntityRuntime getDataEntityRuntimeMust() {
		if(getDataEntityRuntime() == null){
			throw new RuntimeException("实体运行时对象无效");
		}
		return this.getDataEntityRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getDataEntityRuntimeMust().getSystemRuntime();
	}
	
	
	
	@Override
	public IScriptSearchContext pageable(int nPageNumber, int nPageSize) {
		getSearchContextDTO().setPageable(nPageNumber, nPageSize, 0);
		return this;
	}


	@Override
	public IScriptSearchContext sort(String strPageSort) {
		getSearchContextDTO().setPageSort(strPageSort);
		return this;
	}
	
	
	
	
	@Override
	public long getPageNo() {
		if(getSearchContextDTO().getPageable() != null) {
			return getSearchContextDTO().getPageable().getPageNumber();
		}
		return ISearchContextDTO.STARTPAGE;
	}


	@Override
	public long getPageSize() {
		if(getSearchContextDTO().getPageable() != null) {
			return getSearchContextDTO().getPageable().getPageSize();
		}
		return ISearchContextDTO.DEFAULTPAGESIZE;
	}


	@Override
	public IScriptSearchContext count(boolean bCount) {
		getSearchContextDTO().setCount(bCount);
		return this;
	}


	@Override
	public IScriptSearchGroupCond and() {
		return new ScriptSearchGroupCond(getSearchContextDTO().and());
	}

	@Override
	public IScriptSearchGroupCond or() {
		return new ScriptSearchGroupCond(getSearchContextDTO().or());
	}

	@Override
	public IScriptSearchContext field(String strFieldName, String strCondOp, Object objValue) {
		getSearchContextDTO().setFieldCond(strFieldName, strCondOp, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext eq(String strFieldName, Object objValue) {
		getSearchContextDTO().eq(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext ne(String strFieldName, Object objValue) {
		getSearchContextDTO().ne(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext gt(String strFieldName, Object objValue) {
		getSearchContextDTO().gt(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext gte(String strFieldName, Object objValue) {
		getSearchContextDTO().gte(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext lt(String strFieldName, Object objValue) {
		getSearchContextDTO().lt(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext lte(String strFieldName, Object objValue) {
		getSearchContextDTO().lte(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext like(String strFieldName, Object objValue) {
		getSearchContextDTO().like(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext ll(String strFieldName, Object objValue) {
		getSearchContextDTO().ll(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext rl(String strFieldName, Object objValue) {
		getSearchContextDTO().rl(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext nvl(String strFieldName) {
		getSearchContextDTO().nvl(strFieldName);
		return this;
	}

	@Override
	public IScriptSearchContext nn(String strFieldName) {
		getSearchContextDTO().nn(strFieldName);
		return this;
	}

	@Override
	public IScriptSearchContext in(String strFieldName, Object objValue) {
		getSearchContextDTO().in(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchContext ni(String strFieldName, Object objValue) {
		getSearchContextDTO().ni(strFieldName, objValue);
		return this;
	}


	@Override
	public IScriptSearchContext custom(String strCustomCond) {
		SearchContextDTO.addSearchCustomCond(getSearchContextDTO(), strCustomCond);
		return this;
	}
	
	@Override
	public IScriptSearchContext predefined(String strPredefinedCond, String strPredefinedType) {
		SearchContextDTO.addSearchPredefinedCond(iSearchContextDTO, strPredefinedCond, strPredefinedType);
		return this;
	}

	@Override
	public IScriptSearchContext quick(String strValue) {
		SearchContextDTO.addSearchQuickCond(iSearchContextDTO, strValue);
		return this;
	}
	

	@Override
	public IScriptList select() {
		List list = this.getDataEntityRuntimeMust().select(this.getSearchContextDTO());
		return this.getSystemRuntime().createScriptList(list);
	}


	@Override
	public IScriptList select(String strDEDataQueryName) {
		if(StringUtils.isEmpty(strDEDataQueryName)) {
			return this.select();
		}
		List list = this.getDataEntityRuntimeMust().selectDataQuery(strDEDataQueryName, this.getSearchContextDTO());
		return this.getSystemRuntime().createScriptList(list);
	}


	@Override
	public IScriptList selectSimple() {
		List list = this.getDataEntityRuntimeMust().selectSimple(this.getSearchContextDTO());
		return this.getSystemRuntime().createScriptList(list);
	}

	@Override
	public IScriptList selectsimple() {
		return this.selectSimple();
	}

//	@Override
//	public IScriptList selectDefault() {
//		List list = this.getDataEntityRuntimeMust().se(this.getSearchContextDTO());
//		return this.getDataEntityRuntimeMust().createScriptList(list);
//	}


	@Override
	public IScriptPage fetch(String strDEDataSetName) {
		IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntimeMust();
		Page page = null;
		try {
			Object objRet = iDataEntityRuntime.fetchDataSet(strDEDataSetName, null, new Object[] {this.getSearchContextDTO()});
			if(objRet != null) {
				if(objRet instanceof Page) {
					page = (Page)objRet;
					if(page.getContent() == null) {
						page = null;
					}
				}
				else {
					throw new Exception("返回结果类型不正确");
				}
			}
		}
		catch(Throwable ex) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取结果集[%1$s]发生异常，%2$s", strDEDataSetName, ex.getMessage()), ex);
		}
		
		return this.getSystemRuntime().createScriptPage(page);
	}


	@Override
	public IScriptPage fetch() {
		IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntimeMust();
		IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getDefaultPSDEDataSet();
		if(iPSDEDataSet == null) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, "未指定默认结果集");
		}
		Page page = null;
		try {
			Object objRet = iDataEntityRuntime.fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, new Object[] {this.getSearchContextDTO()});
			if(objRet != null) {
				if(objRet instanceof Page) {
					page = (Page)objRet;
					if(page.getContent() == null) {
						page = null;
					}
				}
				else {
					throw new Exception("返回结果类型不正确");
				}
			}
		}
		catch(Throwable ex) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取结果集[%1$s]发生异常，%2$s", iPSDEDataSet.getName(), ex.getMessage()), ex);
		}
		return this.getSystemRuntime().createScriptPage(page);
	}


	@Override
	public int remove() {
		IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntimeMust();
		IPSDEDataQuery defaultPSDEDataQuery = iDataEntityRuntime.getDefaultPSDEDataQuery();
		List<IEntityDTO> list = null;
		if(defaultPSDEDataQuery != null) {
			list = iDataEntityRuntime.selectDataQuery(defaultPSDEDataQuery, this.getSearchContextDTO());
		}
		else {
			list = iDataEntityRuntime.select(this.getSearchContextDTO());
		}
		if(list == null || list.size() == 0) {
			return 0;
		}
		
		for(int i = 0;i<list.size();i++) {
			try {
				iDataEntityRuntime.remove(iDataEntityRuntime.getKeyFieldValue(list.get(i)));
			}
			catch(Throwable ex) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("删除数据[%1$s]发生异常，%2$s", iDataEntityRuntime.getKeyFieldValue(list.get(i)), ex.getMessage()), ex);
			}
		}
		
		return list.size();
	}


	@Override
	public IScriptPage page() {
		Pageable pageable = this.getSearchContextDTO().getPageable();
		if(pageable != null && pageable != Pageable.unpaged() && this.getSearchContextDTO().getPageSort()!=null) {
			pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), pageable.getOffset(), this.getSearchContextDTO().getPageSort());
		}
		
		return this.getSystemRuntime().createScriptPage( new ScriptPageImpl(this.getDataEntityRuntimeMust().createEntityList(), pageable, 0));
	}

	
	@Override
	public IScriptEntity selectOne(boolean bTryMode) {
		IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntimeMust();
		IEntityDTO iEntityDTO = iDataEntityRuntime.selectOne(this.getSearchContextDTO(), bTryMode);
		if(iEntityDTO != null) {
			return iDataEntityRuntime.createScriptEntity(iEntityDTO);
		}
		return null;
	}

	
	@Override
	public IScriptEntity selectone(boolean bTryMode) {
		return this.selectOne(bTryMode);
	}
	
	


	@Override
	public IScriptEntity selectOne() {
		return this.selectOne(false);
	}


	@Override
	public IScriptEntity selectone() {
		return this.selectOne(false);
	}
	
	@Override
	public boolean exists() {
		return this.selectOne(true)!=null;
	}


	@Override
	public IScriptList update(Object data) {
		
		IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntimeMust();
		
		if (data != null) {
			data = ScriptUtils.getReal(data);
		}
		
		IEntity srcEntity = null;
		Map srcMap = null;
		if(data instanceof IEntity) {
			srcEntity = (IEntity)data;
		}
		else
			if(data instanceof Map) {
				srcMap = (Map)data;
			}
			else {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法识别的更新数据[%1$s]", data));
			}
		
		IPSDEDataQuery defaultPSDEDataQuery = iDataEntityRuntime.getDefaultPSDEDataQuery();
		List<IEntityDTO> list = null;
		if(defaultPSDEDataQuery != null) {
			list = iDataEntityRuntime.selectDataQuery(defaultPSDEDataQuery, this.getSearchContextDTO());
		}
		else {
			list = iDataEntityRuntime.select(this.getSearchContextDTO());
		}
		if(list == null || list.size() == 0) {
			return null;
		}
		
		for(int i = 0;i<list.size();i++) {
			try {
				IEntityDTO iEntityDTO = list.get(i);
				if(srcEntity != null) {
					srcEntity.copyTo(iEntityDTO);
				}
				else
				{
					iEntityDTO.putAll(srcMap);
				}
				
				iDataEntityRuntime.update(iEntityDTO);
			}
			catch(Throwable ex) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("更新数据[%1$s]发生异常，%2$s", iDataEntityRuntime.getKeyFieldValue(list.get(i)), ex.getMessage()), ex);
			}
		}
		
		return this.getSystemRuntime().createScriptList(list);
	}
	
	

	
	@Override
	public IScriptSearchGroupCond cat(String strCat) {
		return cat(strCat, false);
	}


	@Override
	public IScriptSearchGroupCond cat(String strCat, boolean bCreateIf) {
		ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)getSearchContextDTO().getSearchGroupCondByCat(strCat);
		if(iSearchGroupCond == null && bCreateIf) {
			SearchGroupCond querySearchGroupCond = new SearchGroupCond();
			querySearchGroupCond.setCondOp(Conditions.AND);
			querySearchGroupCond.setCat(strCat);
			this.getSearchContextDTO().getSearchCondsIf().add(querySearchGroupCond);
			iSearchGroupCond = querySearchGroupCond;
		}
		if(iSearchGroupCond != null) {
			return new ScriptSearchGroupCond(iSearchGroupCond);
		}
		return null;
	}


	@Override
	public String toString() {
		try {
			if(this.getReal() instanceof ISearchContextDTO) {
				return WebClientBase.MAPPER.writeValueAsString(this.getReal());
			}
			return super.toString();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
