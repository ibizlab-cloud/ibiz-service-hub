package net.ibizsys.central.cloud.core.dataentity.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.SearchFieldCond;

public abstract class DESearchRuntimeBase extends net.ibizsys.central.dataentity.search.DESearchRuntimeBase implements IDESearchRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DESearchRuntimeBase.class);
//	private IPSSysSearchField denseVectorPSSysSearchField = null;
	
	/**
	 * 搜索参数：知识库查询
	 */
	public final static String SEARCHPARAM_KBQUERY = "kbquery";
	
	/**
	 * 搜索参数：知识库标记
	 */
	public final static String SEARCHPARAM_KBTAG = "kbtag";
	
	
	@Override
	protected void onInit() throws Exception {
		//判断是否有模板文件
		if(this.getPSDESearch().getPSSysMsgTempl() != null) {
//			List<IPSSysSearchField> list = this.getPSDESearch().getPSSysSearchDEMust().getPSSysSearchDocMust().getAllPSSysSearchFields();
//			if(!ObjectUtils.isEmpty(list)) {
//				for(IPSSysSearchField iPSSysSearchField : list) {
//					if(SearchFieldDataType.DENSE_VECTOR.value.equals(iPSSysSearchField.getFieldType())) {
//						this.denseVectorPSSysSearchField = iPSSysSearchField;
//						break;
//					}
//				}
//			}
		}
		super.onInit();
	}
//	
//	protected IPSSysSearchField getDenseVectorPSSysSearchField(boolean bTryMode) throws Exception {
//		if(this.denseVectorPSSysSearchField != null || bTryMode) {
//			return this.denseVectorPSSysSearchField;
//		}
//		throw new Exception(String.format("未指定高维向量存储属性"));
//	}
	
	@Override
	protected void doCreateEntity(IEntityDTO iEntityDTO, Map<String, Object> map) throws Throwable {
		//this.processDenseVectorFields(iEntityDTO, map);
		super.doCreateEntity(iEntityDTO, map);
	}
	
	@Override
	protected void doUpdateEntity(IEntityDTO iEntityDTO, Map<String, Object> map) throws Throwable {
		//this.processDenseVectorFields(iEntityDTO, map);
		super.doUpdateEntity(iEntityDTO, map);
	}
	
//	
	
	@Override
	public List<Chunk> selectChunks(IChunkSearchContext iChunkSearchContext) {
		Assert.notNull(iChunkSearchContext, "传入片段搜索上下文对象无效");
		try {
			return this.onSelectChunks(iChunkSearchContext);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("查询片段发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<Chunk> onSelectChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
		if(this.getSysSearchSchemeRuntime() instanceof ISysSearchSchemeRuntime) {
			return ((ISysSearchSchemeRuntime)this.getSysSearchSchemeRuntime()).selectChunks(this.getPSSysSearchDoc().getName(), iChunkSearchContext);
		}
		throw new Exception("没有实现");
	}
	
	@Override
	public boolean isValid(IPSDEDataSet iPSDEDataSet, Object[] args) {
		if(args != null && args.length > 0 && args[0] instanceof ISearchContext) {
			ISearchContext iSearchContext = (ISearchContext)args[0];
			String kbQuery = DataTypeUtils.asString(iSearchContext.get(SEARCHPARAM_KBQUERY));
			if(StringUtils.hasLength(kbQuery)) {
				return true;
			}
		}
		return super.isValid(iPSDEDataSet, args);
	}
	
	@Override
	public Page<?> fetchDataSet(IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		ISearchContextDTO iSearchContext = null;
		if(args != null && args.length > 0 && args[0] instanceof ISearchContextDTO) {
			iSearchContext = (ISearchContextDTO)args[0];
		}
		Assert.notNull(iPSDEDataSet, "传入实体数据集对象无效");
		Assert.notNull(iSearchContext, "传入搜索上下文对象无效");
			
		try {
			return this.onFetchDataSet(iPSDEDataSet, iSearchContext, args, actionData);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("查询片段发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Page<?> onFetchDataSet(IPSDEDataSet iPSDEDataSet, ISearchContextDTO iSearchContextDTO, Object[] args, Object actionData) throws Throwable {
		
		//进行数据查询，关闭分页
		if (this.getDataEntityRuntime().getSystemPersistentAdapter() == null) {
			throw new Exception("实体未提供系统持久化设置器");
		}
				
		String kbQuery = DataTypeUtils.asString(iSearchContextDTO.get(SEARCHPARAM_KBQUERY));
		if(!StringUtils.hasLength(kbQuery)) {
			throw new Exception("传入知识库查询无效");
		}
		
		
		ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
		chunkSearchContext.setQuery(kbQuery);
		List<Chunk> chunkList = this.selectChunks(chunkSearchContext);
		
		if(ObjectUtils.isEmpty(chunkList)) {
			return new PageImpl(new ArrayList(), iSearchContextDTO.getPageable(), 0);
		}
		
		Map<String, Chunk> map = new LinkedHashMap<String, Chunk>();
		for(Chunk chunk : chunkList) {
			if(map.containsKey(chunk.getDocId())) {
				continue;
			}
			map.put(chunk.getDocId(), chunk);
		}
		
		

		//备份分页信息
		Pageable pageable = iSearchContextDTO.getPageable();
		
		iSearchContextDTO.setPageable(ISearchContextDTO.STARTPAGE, map.size(), 0);
		
		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
		searchFieldCond.setCondOp(Conditions.IN);
		searchFieldCond.setValue(new ArrayList(map.keySet()));
		iSearchContextDTO.getSearchCondsIf().add(searchFieldCond);
		
		Page<?> ret = this.getDataEntityRuntime().getSystemPersistentAdapter().fetchDataSet(this.getDataEntityRuntime(), iPSDEDataSet, iSearchContextDTO, null);
		if(ObjectUtils.isEmpty(ret) || ObjectUtils.isEmpty(ret.getContent())) {
			return new PageImpl(new ArrayList(), iSearchContextDTO.getPageable(), 0);
		}
		ret = this.getDataEntityRuntime().getEntityDTOPage(ret, iPSDEDataSet, iSearchContextDTO.getPageable());
		
		iSearchContextDTO.setPageable(pageable);
		
		
		Map<String, IEntityDTO> entityMap = new HashMap<String, IEntityDTO>();
		for(Object item : ret.getContent()) {
			IEntityDTO iEntityDTO = (IEntityDTO)item;
			String strKey = DataTypeUtils.asString(iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()));
			if(!StringUtils.hasLength(strKey)) {
				continue;
			}
			entityMap.put(strKey, iEntityDTO);
		}
		
		List<IEntityDTO> sortedList = new ArrayList<IEntityDTO>();
		for(String key : map.keySet()) {
			IEntityDTO iEntityDTO = entityMap.get(key);
			if(iEntityDTO == null) {
				continue;
			}
			Chunk chunk = map.get(key);
			iEntityDTO.set("_chunk", chunk.getContent());
			iEntityDTO.set("_similarity", chunk.getSimilarity());
			sortedList.add(iEntityDTO);
		}
		
		List<IEntityDTO> realList = new ArrayList<IEntityDTO>();
		int nStartPos = pageable.getPageNumber() * pageable.getPageSize();
		int nEndPos = (pageable.getPageNumber() + 1) * pageable.getPageSize();
		if(nStartPos< sortedList.size()) {
			if(nEndPos > sortedList.size()) {
				nEndPos = sortedList.size();
			}
			for(int i = nStartPos;i<nEndPos;i++) {
				realList.add(sortedList.get(i));
			}
		}
		
		Page<IEntityDTO> ret2 =  new PageImpl<IEntityDTO>(realList, iSearchContextDTO.getPageable(), sortedList.size());
		if (iSearchContextDTO.isFillNestedFields()) {
			this.getDataEntityRuntime().fillEntityDTOPageNestedFields(ret2, iPSDEDataSet);
		}
		
		return ret2;
	}
	
//	@Override
//	protected String getUniqueId(Object id) {
//		return String.valueOf(id);
//	}
}
