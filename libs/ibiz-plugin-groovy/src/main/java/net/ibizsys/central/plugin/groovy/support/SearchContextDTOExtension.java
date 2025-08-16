package net.ibizsys.central.plugin.groovy.support;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import groovy.lang.Closure;
import groovy.lang.DelegatesTo;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.central.util.PageRequest;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

public class SearchContextDTOExtension {

	protected static IDataEntityRuntime getDataEntityRuntime(ISearchContextDTO iSearchContextDTO) {
		return (iSearchContextDTO.getDEMethodDTORuntime()!=null)?iSearchContextDTO.getDEMethodDTORuntime().getDataEntityRuntime():null;
	}
	
	protected static IDataEntityRuntime getDataEntityRuntimeMust(ISearchContextDTO iSearchContextDTO) {
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntime(iSearchContextDTO);
		if(iDataEntityRuntime == null){
			throw new RuntimeException("实体运行时对象无效");
		}
		return iDataEntityRuntime;
	}
	
	/**
	 * 查询返回数据
	 * @return
	 */
	public static List<? extends IEntityDTO> select(ISearchContextDTO iSearchContextDTO){
		return getDataEntityRuntimeMust(iSearchContextDTO).select(iSearchContextDTO);
	}
	
	
	/**
	 * 查询返回数据
	 * @param strDEDataQueryName 数据查询名称
	 * @return
	 */
	public static List<? extends IEntityDTO> select(ISearchContextDTO iSearchContextDTO, String strDEDataQueryName){
		if(!StringUtils.hasLength(strDEDataQueryName)) {
			return select(iSearchContextDTO);
		}
		return getDataEntityRuntimeMust(iSearchContextDTO).selectDataQuery(strDEDataQueryName, iSearchContextDTO);
	}
	
	
	/**
	 * 查询简单数据查询对象
	 * @return
	 */
	public static List<? extends IEntityDTO> selectSimple(ISearchContextDTO iSearchContextDTO){
		return getDataEntityRuntimeMust(iSearchContextDTO).selectSimple(iSearchContextDTO);
	}
	
	/**
	 * 查询简单数据查询对象（等同 selectSimple）
	 * @return
	 */
	public static List<? extends IEntityDTO> selectsimple(ISearchContextDTO iSearchContextDTO){
		return selectSimple(iSearchContextDTO);
	}
	
//	/**
//	 * 查询默认数据查询对象
//	 * @return
//	 */
//	IScriptEntityList selectDefault();
//	
	
	
	/**
	 * 查询结果集
	 * @param strDEDataSetName 数据集名称
	 * @return
	 */
	public static Page<? extends IEntityDTO> fetch(ISearchContextDTO iSearchContextDTO, String strDEDataSetName){
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntimeMust(iSearchContextDTO);
		Page page = null;
		try {
			Object objRet = iDataEntityRuntime.fetchDataSet(strDEDataSetName, null, new Object[] {iSearchContextDTO});
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
		return page;
	}
	
	
	/**
	 * 查询默认数据集
	 * @return
	 */
	public static Page<? extends IEntityDTO> fetch(ISearchContextDTO iSearchContextDTO){
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntimeMust(iSearchContextDTO);
		IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getDefaultPSDEDataSet();
		if(iPSDEDataSet == null) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, "未指定默认结果集");
		}
		Page page = null;
		try {
			Object objRet = iDataEntityRuntime.fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, new Object[] {iSearchContextDTO});
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
		return page;
	}
	
	
	
	/**
	 * 删除符合条件的数据
	 * @return
	 */
	public static int remove(ISearchContextDTO iSearchContextDTO){
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntimeMust(iSearchContextDTO);
		IPSDEDataQuery defaultPSDEDataQuery = iDataEntityRuntime.getDefaultPSDEDataQuery();
		List<IEntityDTO> list = null;
		if(defaultPSDEDataQuery != null) {
			list = iDataEntityRuntime.selectDataQuery(defaultPSDEDataQuery, iSearchContextDTO);
		}
		else {
			list = iDataEntityRuntime.select(iSearchContextDTO);
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
	
	/**
	 * 更新符合条件的数据
	 * @param data
	 * @return
	 */
	public static List<? extends IEntityDTO> update(ISearchContextDTO iSearchContextDTO, Object data){

		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntimeMust(iSearchContextDTO);
		
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
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法识别的更新数据[%1$s]", data));
			}
		
		IPSDEDataQuery defaultPSDEDataQuery = iDataEntityRuntime.getDefaultPSDEDataQuery();
		List<IEntityDTO> list = null;
		if(defaultPSDEDataQuery != null) {
			list = iDataEntityRuntime.selectDataQuery(defaultPSDEDataQuery, iSearchContextDTO);
		}
		else {
			list = iDataEntityRuntime.select(iSearchContextDTO);
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
		
		return list;
	}
	
	
	/**
	 * 返回分页结果对象
	 * @return
	 */
	public static Page<? extends IEntityDTO> page(ISearchContextDTO iSearchContextDTO){
		Pageable pageable = iSearchContextDTO.getPageable();
		if(pageable != null && pageable != Pageable.unpaged() && iSearchContextDTO.getPageSort()!=null) {
			pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), pageable.getOffset(), iSearchContextDTO.getPageSort());
		}
		return new PageImpl<IEntityDTO>(getDataEntityRuntimeMust(iSearchContextDTO).createEntityList(), pageable, 0);

	}
	
	
	
	
	/**
	 * 返回分页结果对象
	 * @param iSearchContextDTO
	 * @param list
	 * @return
	 */
	public static Page<? extends IEntityDTO> page(ISearchContextDTO iSearchContextDTO, List<? extends IEntityDTO> list){
		int total = (list!=null)?list.size():0;
		return page(iSearchContextDTO, list, total);
	}
	
	
	/**
	 * 返回分页结果对象
	 * @param iSearchContextDTO
	 * @param list
	 * @param total
	 * @return
	 */
	public static Page<? extends IEntityDTO> page(ISearchContextDTO iSearchContextDTO, List<? extends IEntityDTO> list, int total){
		Pageable pageable = iSearchContextDTO.getPageable();
		if(pageable != null && pageable != Pageable.unpaged() && iSearchContextDTO.getPageSort()!=null) {
			pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), pageable.getOffset(), iSearchContextDTO.getPageSort());
		}
		return new PageImpl<IEntityDTO>((List<IEntityDTO>)list, pageable, total);
	}
	
	
	
	/**
	 * 查询一行数据
	 * @param bTryMode 是否为尝试模式
	 * @return
	 */
	public static IEntityDTO selectOne(ISearchContextDTO iSearchContextDTO, boolean bTryMode){
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntimeMust(iSearchContextDTO);
		return iDataEntityRuntime.selectOne(iSearchContextDTO, bTryMode);
	}
	
	
	/**
	 * 查询一行数据（等同 selectOne）
	 * @param bTryMode 是否为尝试模式
	 * @return
	 */
	public static IEntityDTO selectone(ISearchContextDTO iSearchContextDTO, boolean bTryMode){
		return selectOne(iSearchContextDTO, bTryMode);
	}
	
	
	/**
	 * 查询一行数据，必须存在
	 * @return
	 */
	public static IEntityDTO selectOne(ISearchContextDTO iSearchContextDTO){
		return selectOne(iSearchContextDTO, false);
	}
	
	
	/**
	 * 查询一行数据（等同 selectOne），必须存在
	 * @return
	 */
	public static IEntityDTO selectone(ISearchContextDTO iSearchContextDTO){
		return selectOne(iSearchContextDTO, false);
	}
	
	
	
	/**
	 * 是否存在数据
	 * @return
	 */
	public static boolean exists(ISearchContextDTO iSearchContextDTO){
		return selectOne(iSearchContextDTO, true)!=null;
	}
	
	
	
	/**
	 * 设置快速搜索条件
	 * @param iSearchContextDTO
	 * @param strValue
	 * @return
	 */
	public static ISearchContextDTO quick(ISearchContextDTO iSearchContextDTO, String strValue){
		SearchContextDTO.addSearchQuickCond(iSearchContextDTO, strValue);
		return iSearchContextDTO;
	}
	
	
	/**
	 * 注入与条件
	 * @param iSearchContextDTO
	 * @param closure
	 * @return
	 */
	public static ISearchContextDTO and(ISearchContextDTO iSearchContextDTO, @DelegatesTo(ISearchGroupCond.class) Closure closure) {
		ISearchGroupCond groupCond = iSearchContextDTO.and();
		closure.setDelegate(groupCond);	
		closure.setResolveStrategy(Closure.OWNER_FIRST);
		
		closure.call();
		return iSearchContextDTO;
	}
	
	
	/**
	 * 注入或条件
	 * @param iSearchContextDTO
	 * @param closure
	 * @return
	 */
	public static ISearchContextDTO or(ISearchContextDTO iSearchContextDTO, @DelegatesTo(ISearchGroupCond.class) Closure closure) {
		ISearchGroupCond groupCond = iSearchContextDTO.or();
		closure.setDelegate(groupCond);	
		closure.setResolveStrategy(Closure.OWNER_FIRST);
		
		closure.call();
		return iSearchContextDTO;
	}
}
