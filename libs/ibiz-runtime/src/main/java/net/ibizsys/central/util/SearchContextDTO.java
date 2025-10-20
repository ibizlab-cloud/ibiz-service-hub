package net.ibizsys.central.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.dataentity.ds.IDEFilterDTORuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;
import net.ibizsys.runtime.util.SearchPredefinedCond;

@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class SearchContextDTO extends EntityBase implements ISearchContextDTO {

	@JsonIgnore
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SearchContextDTO.class);

	@JsonIgnore
	private static int MaxSize = 1000;

	@JsonIgnore
	public static void setMaxSize(int nMaxSize) {
		SearchContextDTO.MaxSize = nMaxSize;
	}

	@JsonIgnore
	public static int getMaxSize() {
		return SearchContextDTO.MaxSize;
	}

	@JsonIgnore
	private static int DefaultSize = 20;

	@JsonIgnore
	public static void setDefaultSize(int nDefaultSize) {
		SearchContextDTO.DefaultSize = nDefaultSize;
	}

	@JsonIgnore
	public static int getDefaultSize() {
		return SearchContextDTO.DefaultSize;
	}


	@JsonIgnore
	private transient IDEFilterDTORuntime iDEFilterDTORuntime = null;

	@JsonIgnore
	private Pageable pageable = null;

	@JsonIgnore
	private Sort sort = null;

	@JsonIgnore
	private boolean bCount = true;

	@JsonIgnore
	private List<ISearchCond> searchCondList = null;
	
	@JsonIgnore
	private List<ISearchCond> groupDataCondList = null;

	@JsonIgnore
	private transient boolean bFillDynaFields = true;

	@JsonIgnore
	private transient boolean bFillComputedFields = true;

	@JsonIgnore
	private transient boolean bFillNestedFields = true;
	
	@JsonIgnore
	private transient boolean bTranslateFields = true;

	@Override
	public void init(IDEMethodDTORuntime iDEMethodDTORuntime, Object objData, boolean bDTOData) throws Exception {

		if(!(iDEMethodDTORuntime instanceof IDEFilterDTORuntime)) {
			throw new Exception(String.format("传入实体方法DTO运行时对象不正确"));
		}

		if(!bDTOData) {
			throw new Exception(String.format("仅支持传入DTO"));
		}

		this.iDEFilterDTORuntime = (IDEFilterDTORuntime)iDEMethodDTORuntime;
		if (objData instanceof Map) {
			Map<String,Object> map = (Map<String,Object>)objData;
			this.setAny(map, true);
		}
		onInit();
	}

	protected void onInit() throws Exception {

		Object size = this.get(PARAM_SIZE);
		Object page = this.get(PARAM_PAGE);
		Object offset = this.get(PARAM_OFFSET);
		Object sortinfo = this.get(PARAM_SORT);

		this.reset(PARAM_SIZE);
		this.reset(PARAM_PAGE);
		this.reset(PARAM_OFFSET);
		this.reset(PARAM_SORT);

		int nSize = getDefaultSize();
		if (size != null) {
			nSize = Integer.valueOf(size.toString());
			if (nSize <= 0 ) {
				log.warn(String.format("传入分页大小[%1$s]无效，调整为[%2$s]", nSize, getDefaultSize()));
				nSize = getDefaultSize();
			}
			else
			if (nSize > SearchContextDTO.getMaxSize()) {
				log.warn(String.format("传入分页大小[%1$s]无效，调整为[%2$s]", nSize, getMaxSize()));
				nSize = getMaxSize();
			}

		}

		int nPage = 0;
		if (page != null) {
			nPage = Integer.valueOf(page.toString());
			if (nPage < 0) {
				nPage = 0;
			}
		}
		long nOffset = 0;
		if (offset != null) {
			nOffset = Long.valueOf(offset.toString());
			if (nOffset < 0) {
				nOffset = 0;
			}
		}

		if (sortinfo instanceof String) {
			String strSortInfo = (String) sortinfo;
			strSortInfo = strSortInfo.trim();
			this.setPageSort(strSortInfo);
		}

		this.setPageable(PageRequest.of(nPage, nSize, nOffset));

		Object count = this.get(PARAM_COUNT);
		this.reset(PARAM_COUNT);
		if(count != null && count.toString().equalsIgnoreCase("false")) {
			this.setCount(false);
		}

		Object objSearchConds = this.get(PARAM_SEARCHCONDS);
		this.reset(PARAM_SEARCHCONDS);
		if(objSearchConds instanceof List) {
			//实际展开条件
			SearchGroupCond customSearchGroupCond = null;
			List<ISearchCond> searchConds = this.getSearchConds();
			if(!ObjectUtils.isEmpty(searchConds)) {
				for(ISearchCond iSearchCond : searchConds) {
					if(iSearchCond instanceof SearchGroupCond) {
						SearchGroupCond searchGroupCond =  (SearchGroupCond)iSearchCond;
						if(ISearchGroupCond.CAT_SEARCHCONDS.equals(searchGroupCond.getCat())) {
							customSearchGroupCond = searchGroupCond;
							break;
						}
					}
				}
			}

			List list = (List)objSearchConds;
			for(Object objItem : list) {
				if(!(objItem instanceof Map)) {
					continue;
				}

				ISearchCond iSearchCond = net.ibizsys.central.util.SearchGroupCond.getSearchCond((Map)objItem, true);
				if(iSearchCond != null) {
					if(customSearchGroupCond == null) {
						customSearchGroupCond = new SearchGroupCond();
						customSearchGroupCond.setCondOp(Conditions.AND);
						customSearchGroupCond.setCat(ISearchGroupCond.CAT_SEARCHCONDS);
						this.getSearchCondsIf().add(customSearchGroupCond);
					}
					customSearchGroupCond.getSearchCondsIf().add(iSearchCond);
				}
			}
		}
		
		Object objGroupDataConds = this.get(PARAM_GROUPDATACONDS);
		this.reset(PARAM_GROUPDATACONDS);
		if(objGroupDataConds instanceof List) {
			//实际展开条件
			SearchGroupCond customSearchGroupCond = null;
			List<ISearchCond> searchConds = this.getGroupDataConds();
			if(!ObjectUtils.isEmpty(searchConds)) {
				for(ISearchCond iSearchCond : searchConds) {
					if(iSearchCond instanceof SearchGroupCond) {
						SearchGroupCond searchGroupCond =  (SearchGroupCond)iSearchCond;
						if(ISearchGroupCond.CAT_SEARCHCONDS.equals(searchGroupCond.getCat())) {
							customSearchGroupCond = searchGroupCond;
							break;
						}
					}
				}
			}

			List list = (List)objGroupDataConds;
			for(Object objItem : list) {
				if(!(objItem instanceof Map)) {
					continue;
				}

				ISearchCond iSearchCond = net.ibizsys.central.util.SearchGroupCond.getSearchCond((Map)objItem, true);
				if(iSearchCond != null) {
					if(customSearchGroupCond == null) {
						customSearchGroupCond = new SearchGroupCond();
						customSearchGroupCond.setCondOp(Conditions.AND);
						customSearchGroupCond.setCat(ISearchGroupCond.CAT_SEARCHCONDS);
						this.getGroupDataCondsIf().add(customSearchGroupCond);
					}
					customSearchGroupCond.getSearchCondsIf().add(iSearchCond);
				}
			}
		}
		

		if(this.getDEMethodDTORuntime()!=null) {
			//计算查询条件
			java.util.List<IPSDEFilterDTOField> psDEFilterDTOFieldList = this.getDEMethodDTORuntime().getPSDEFilterDTO().getPSDEFilterDTOFields();
			if(!ObjectUtils.isEmpty(psDEFilterDTOFieldList)) {

				SearchGroupCond filterSearchGroupCond = null;
				List<ISearchCond> searchConds = this.getSearchConds();
				if(!ObjectUtils.isEmpty(searchConds)) {
					for(ISearchCond iSearchCond : searchConds) {
						if(iSearchCond instanceof SearchGroupCond) {
							SearchGroupCond searchGroupCond =  (SearchGroupCond)iSearchCond;
							if(ISearchGroupCond.CAT_FILTER.equals(searchGroupCond.getCat())) {
								filterSearchGroupCond = searchGroupCond;
								break;
							}
						}
					}
				}


				for(IPSDEFilterDTOField iPSDEFilterDTOField : psDEFilterDTOFieldList) {
					Object objValue = this.get(iPSDEFilterDTOField.getLowerCaseName());
					if(ObjectUtils.isEmpty(objValue)) {
						String strSearchMode =  iPSDEFilterDTOField.getPSDEFSearchModeMust().getName();
						if(StringUtils.hasLength(strSearchMode)) {
							strSearchMode = strSearchMode.split("[#]")[0];
							objValue = this.get(strSearchMode.toLowerCase());
						}
						if(ObjectUtils.isEmpty(objValue)) {
							continue;
						}
					}

					SearchFieldCond searchFieldCond = new SearchFieldCond();
					searchFieldCond.setFieldName(iPSDEFilterDTOField.getPSDEFieldMust().getName());
					searchFieldCond.setParamMode(true);
					searchFieldCond.setCondOp(iPSDEFilterDTOField.getPSDEFSearchModeMust().getValueOP());
					searchFieldCond.setValue(iPSDEFilterDTOField.getLowerCaseName());
					searchFieldCond.setDataType(iPSDEFilterDTOField.getStdDataType());
					searchFieldCond.setValueFunc(iPSDEFilterDTOField.getPSDEFSearchModeMust().getValueFunc());
					searchFieldCond.setSource(iPSDEFilterDTOField.getPSDEFSearchModeMust().getName());

					if(filterSearchGroupCond == null) {
						filterSearchGroupCond = new SearchGroupCond();
						filterSearchGroupCond.setCondOp(Conditions.AND);
						filterSearchGroupCond.setCat(ISearchGroupCond.CAT_FILTER);
						this.getSearchCondsIf().add(filterSearchGroupCond);
					}

					filterSearchGroupCond.getSearchCondsIf().add(searchFieldCond);
				}
			}

			Object query = this.get(PARAM_QUERY);
			if(query instanceof String) {
				if(!ObjectUtils.isEmpty(query)) {

					Object queryConds = this.get(PARAM_QUERYCONDS);
					List<String> queryItems = null;
					if(queryConds!=null) {
						if(queryConds instanceof List) {
							queryItems = (List<String>)queryConds;
						}
						else {
							queryItems = Arrays.asList(queryConds.toString().split("[,]"));
						}
					}

					//查找是否存在默认的查询组
					SearchGroupCond querySearchGroupCond = null;
					List<ISearchCond> searchConds = this.getSearchCondsIf();
					for(ISearchCond iSearchCond : searchConds) {
						if(iSearchCond instanceof SearchGroupCond) {
							SearchGroupCond searchGroupCond =  (SearchGroupCond)iSearchCond;
							if(ISearchGroupCond.CAT_QUERY.equals(searchGroupCond.getCat())
									&& Conditions.OR.equals(searchGroupCond.getCondOp())) {
								querySearchGroupCond = searchGroupCond;
								break;
							}
						}
					}

					if(queryItems != null) {
						for(String strItem : queryItems) {
							IPSDEFilterDTOField iPSDEFilterDTOField = (IPSDEFilterDTOField)this.getDEMethodDTORuntime().getPSDEMethodDTOField(strItem, true);
							if(iPSDEFilterDTOField == null) {
								log.warn(String.format("指定查询项[%1$s]不存在", strItem));
								continue;
							}

							if(querySearchGroupCond == null) {
								querySearchGroupCond = new SearchGroupCond();
								querySearchGroupCond.setCondOp(Conditions.OR);
								querySearchGroupCond.setCat(ISearchGroupCond.CAT_QUERY);
								this.getSearchCondsIf().add(querySearchGroupCond);
							}

							SearchFieldCond searchFieldCond = new SearchFieldCond();
							searchFieldCond.setFieldName(iPSDEFilterDTOField.getPSDEFieldMust().getName());
							searchFieldCond.setParamMode(true);
							searchFieldCond.setCondOp(iPSDEFilterDTOField.getPSDEFSearchModeMust().getValueOP());
							searchFieldCond.setValue(PARAM_QUERY);
							searchFieldCond.setDataType(iPSDEFilterDTOField.getStdDataType());
							searchFieldCond.setValueFunc(iPSDEFilterDTOField.getPSDEFSearchModeMust().getValueFunc());
							searchFieldCond.setSource(iPSDEFilterDTOField.getPSDEFSearchModeMust().getName());
							
							querySearchGroupCond.getSearchCondsIf().add(searchFieldCond);
						}
					}
					else {
						//获取所有支持快速搜索的属性
						List<IPSDEField> psDEFieldList = this.getDEMethodDTORuntime().getDataEntityRuntime().getQuickSearchPSDEFields();
						if(psDEFieldList != null && psDEFieldList.size() > 0) {

							if(querySearchGroupCond == null) {
								querySearchGroupCond = new SearchGroupCond();
								querySearchGroupCond.setCondOp(Conditions.OR);
								querySearchGroupCond.setCat(ISearchGroupCond.CAT_QUERY);
								this.getSearchCondsIf().add(querySearchGroupCond);
							}

							for(IPSDEField iPSDEField: psDEFieldList ) {
								SearchFieldCond searchFieldCond = new SearchFieldCond();
								searchFieldCond.setFieldName(iPSDEField.getName());
								searchFieldCond.setParamMode(true);
								searchFieldCond.setCondOp(Conditions.LIKE);
								searchFieldCond.setValue(PARAM_QUERY);
								searchFieldCond.setDataType(iPSDEField.getStdDataType());

								querySearchGroupCond.getSearchCondsIf().add(searchFieldCond);
							}
						}
					}
				}
			}
		}

		Object predefinedcond = this.get(PARAM_PREDEFINEDCOND);
		if(predefinedcond instanceof String) {
			if(!ObjectUtils.isEmpty(predefinedcond)) {
				SearchContextDTO.addSearchPredefinedCond(this, (String)predefinedcond, null);
			}
		}
	}

	@Override
	@JsonIgnore
	protected Map<String, Object> createAny() {
		return new LinkedHashMap<String, Object>();
	}


	@Override
	@JsonIgnore
	public IDEFilterDTORuntime getDEMethodDTORuntime() {
		return this.iDEFilterDTORuntime;
	}

	@Override
	@JsonIgnore
	public void setDEMethodDTORuntime(IDEFilterDTORuntime iDEFilterDTORuntime) {
		this.iDEFilterDTORuntime = iDEFilterDTORuntime;
	}

	@Override
	@JsonIgnore
	public Pageable getPageable() {
		return this.pageable;
	}

	@Override
	@JsonIgnore
	public void setPageable(Pageable pageable) {
		this.pageable = pageable;
	}

	@Override
	@JsonIgnore
	public Sort getPageSort() {
		return this.sort;
	}

	@Override
	@JsonIgnore
	public void setPageSort(Sort sort) {
		this.sort = sort;
	}

	@Override
	@JsonProperty(PARAM_COUNT)
	public boolean isCount() {
		return this.bCount;
	}

	@Override
	@JsonIgnore
	public void setCount(boolean bCount) {
		this.bCount = bCount;
	}


//	@Override
//	@JsonIgnore
//	protected boolean isLowerCaseName() {
//		return false;
//	}


	@Override
	@JsonProperty(PARAM_SEARCHCONDS)
	public List<ISearchCond> getSearchConds() {
		return this.searchCondList;
	}

	@JsonIgnore
	public void setSearchConds(List<ISearchCond> searchCondList) {
		this.searchCondList = searchCondList;
	}


	@JsonIgnore
	public List<ISearchCond> getSearchCondsIf() {
		if(this.searchCondList == null) {
			this.searchCondList = new ArrayList<ISearchCond>();
		}
		return this.searchCondList;
	}
	
	
	@Override
	@JsonProperty(PARAM_GROUPDATACONDS)
	public List<ISearchCond> getGroupDataConds() {
		return this.groupDataCondList;
	}

	@JsonIgnore
	public void setGroupDataConds(List<ISearchCond> groupDataCondList) {
		this.groupDataCondList = groupDataCondList;
	}

	@JsonIgnore
	public List<ISearchCond> getGroupDataCondsIf() {
		if(this.groupDataCondList == null) {
			this.groupDataCondList = new ArrayList<ISearchCond>();
		}
		return this.groupDataCondList;
	}
	

	public static ISearchCond addSearchCustomCond(ISearchContextDTO iSearchContextDTO, String strCustomCond) {

		Assert.notNull(iSearchContextDTO,"传入搜索上下文对象无效");
		Assert.hasLength(strCustomCond, "传入自定义条件无效");

		SearchCustomCond searchCustomCond = new SearchCustomCond();
		searchCustomCond.setCustomCond(strCustomCond);

		iSearchContextDTO.getSearchCondsIf().add(searchCustomCond);

		return searchCustomCond;
	}

	public static ISearchCond addSearchPredefinedCond(ISearchContextDTO iSearchContextDTO, String strPredefinedCond, String strPredefinedType) {

		Assert.notNull(iSearchContextDTO,"传入搜索上下文对象无效");

		SearchPredefinedCond searchPredefinedCond = new SearchPredefinedCond();
		searchPredefinedCond.setPredefinedCond(strPredefinedCond);
		searchPredefinedCond.setPredefinedType(strPredefinedType);
		iSearchContextDTO.getSearchCondsIf().add(searchPredefinedCond);

		return searchPredefinedCond;
	}

	public static ISearchCond addSearchFieldCond(ISearchContextDTO iSearchContextDTO, String strFieldName, String strCondOp, Object objValue) {

		Assert.notNull(iSearchContextDTO,"传入搜索上下文对象无效");
		Assert.hasLength(strFieldName, "传入过滤属性无效");
		Assert.hasLength(strCondOp, "传入过滤操作无效");

		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setParamMode(false);
		searchFieldCond.setCondOp(strCondOp);
		searchFieldCond.setValue(objValue);

		iSearchContextDTO.getSearchCondsIf().add(searchFieldCond);

		return searchFieldCond;
	}

	public static ISearchCond addSearchFieldCond(ISearchContextDTO iSearchContextDTO, String strFieldName, String strCondOp, Object objValue, String strParamName) {
		return addSearchFieldCond(iSearchContextDTO, strFieldName, strCondOp, objValue, strParamName, null);
	}
	
	/**
	 * 增加查询条件
	 * @param iSearchContextDTO
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @param strParamName
	 * @param iPSDEFSearchMode
	 * @return
	 */
	public static ISearchCond addSearchFieldCond(ISearchContextDTO iSearchContextDTO, String strFieldName, String strCondOp, Object objValue, String strParamName, IPSDEFSearchMode iPSDEFSearchMode) {

		Assert.notNull(iSearchContextDTO,"传入搜索上下文对象无效");
		Assert.hasLength(strFieldName, "传入过滤属性无效");
		Assert.hasLength(strCondOp, "传入过滤操作无效");


		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setCondOp(strCondOp);
		if(!Conditions.ISNULL.equals(strCondOp)
				&& !Conditions.ISNOTNULL.equals(strCondOp)) {
			searchFieldCond.setParamMode(true);
			if(StringUtils.hasLength(strParamName)) {
				iSearchContextDTO.set(strParamName, objValue);
			}
			else {
				int nIndex = 1;
				while(true) {
					if(nIndex == 1) {
						strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
					}
					else {
						strParamName = String.format("n_%1$s_%2$s_%3$s", strFieldName, strCondOp, nIndex).toLowerCase();
					}

					nIndex ++;
					if(!iSearchContextDTO.contains(strParamName)) {
						iSearchContextDTO.set(strParamName, objValue);
						break;
					}
				}
			}
			searchFieldCond.setValue(strParamName);
		}
		
		if(iPSDEFSearchMode!=null) {
			searchFieldCond.setSource(iPSDEFSearchMode.getName());
		}

		iSearchContextDTO.getSearchCondsIf().add(searchFieldCond);

		return searchFieldCond;
	}


	/**
	 * 增加查询条件（判断条件不存在）
	 * @param iSearchContextDTO
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @param strParamName
	 * @return
	 */
	public static ISearchCond addSearchFieldCondIf(ISearchContextDTO iSearchContextDTO, String strFieldName, String strCondOp, Object objValue, String strParamName) {

		Assert.notNull(iSearchContextDTO,"传入搜索上下文对象无效");
		Assert.hasLength(strFieldName, "传入过滤属性无效");
		Assert.hasLength(strCondOp, "传入过滤操作无效");

		List<ISearchCond> searchCondList = iSearchContextDTO.getSearchConds();
		if(!ObjectUtils.isEmpty(searchCondList)) {
			for(ISearchCond iSearchCond : searchCondList) {
				if(!(iSearchCond instanceof ISearchFieldCond)) {
					continue;
				}

				ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
				if(!iSearchFieldCond.isParamMode()) {
					continue;
				}

				if(!strFieldName.equalsIgnoreCase(iSearchFieldCond.getFieldName())) {
					continue;
				}

				if(!strCondOp.equalsIgnoreCase(iSearchFieldCond.getCondOp())) {
					continue;
				}

				if(!Conditions.ISNULL.equals(strCondOp)
						&& !Conditions.ISNOTNULL.equals(strCondOp)) {
					//进一步判断值
					String strLastParamName = strParamName;
					if(!StringUtils.hasLength(strLastParamName)) {
						strLastParamName = (String) iSearchFieldCond.getValue();
					}
					Object lastValue = iSearchContextDTO.get(strLastParamName);
					if(objValue == null || lastValue == null || !objValue.equals(lastValue)) {
						continue;
					}
				}
				return iSearchFieldCond;
			}
		}

		return addSearchFieldCond(iSearchContextDTO, strFieldName, strCondOp, objValue, strParamName);
	}


	/**
	 * 增加查询条件
	 * @param iSearchContextDTO
	 * @param strSearchMode
	 * @param objValue
	 * @return
	 */
	public static ISearchCond addSearchFieldCond(ISearchContextDTO iSearchContextDTO, String strSearchMode, Object objValue) {

		Assert.notNull(iSearchContextDTO.getDEMethodDTORuntime(), "搜索过滤器未指定运行时对象");

		//获取对应的搜索项
		IPSDEMethodDTOField iPSDEMethodDTOField = iSearchContextDTO.getDEMethodDTORuntime().getPSDEMethodDTOField(strSearchMode.toLowerCase(), false);
		if(iPSDEMethodDTOField instanceof IPSDEFilterDTOField) {
			IPSDEFilterDTOField iPSDEFilterDTOField = (IPSDEFilterDTOField)iPSDEMethodDTOField;
			IPSDEFSearchMode iPSDEFSearchMode = iPSDEFilterDTOField.getPSDEFSearchModeMust();
			IPSDEField iPSDEField = iPSDEFSearchMode.getParentPSModelObject(IPSDEField.class, false);

			return addSearchFieldCond(iSearchContextDTO, iPSDEField.getName(), iPSDEFSearchMode.getValueOP(), objValue, strSearchMode, iPSDEFSearchMode);
		}
		else {
			throw new DataEntityRuntimeException(iSearchContextDTO.getDEMethodDTORuntime().getDataEntityRuntime(), iSearchContextDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]类型不是过滤器属性", strSearchMode));
		}
	}

	/**
	 * 增加快速查询条件
	 * @param iSearchContextDTO
	 * @param objValue
	 * @return
	 */
	public static ISearchCond addSearchQuickCond(ISearchContextDTO iSearchContextDTO, String strValue) {

		Assert.notNull(iSearchContextDTO.getDEMethodDTORuntime(), "搜索过滤器未指定运行时对象");

		//获取所有支持快速搜索的属性
		List<IPSDEField> psDEFieldList = iSearchContextDTO.getDEMethodDTORuntime().getDataEntityRuntime().getQuickSearchPSDEFields();
		if(StringUtils.hasLength(strValue) && !ObjectUtils.isEmpty(psDEFieldList)) {

			iSearchContextDTO.set(PARAM_QUERY,  strValue);

			SearchGroupCond searchGroupCond = new SearchGroupCond();
			searchGroupCond.setCondOp(Conditions.OR);

			for(IPSDEField iPSDEField: psDEFieldList ) {
				SearchFieldCond searchFieldCond = new SearchFieldCond();
				searchFieldCond.setFieldName(iPSDEField.getName());
				searchFieldCond.setParamMode(true);
				searchFieldCond.setCondOp(Conditions.LIKE);
				searchFieldCond.setValue(PARAM_QUERY);
				searchFieldCond.setDataType(iPSDEField.getStdDataType());

				searchGroupCond.getSearchCondsIf().add(searchFieldCond);
			}

			iSearchContextDTO.getSearchCondsIf().add(searchGroupCond);

			return searchGroupCond;
		}

		return null;
	}



	@Override
	public void set(String strName, String strValue) {
		this.set(strName, (Object)strValue);
	}


	@Override
	public SearchContextDTO setFieldCond(String strFieldName, String strCondOp, Object objValue) {
		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setCondOp(strCondOp);
		if(!Conditions.ISNULL.equals(strCondOp)
				&& !Conditions.ISNOTNULL.equals(strCondOp)) {
			searchFieldCond.setParamMode(true);

			String strParamName = "";
			int nIndex = 1;
			while(true) {
				if(nIndex == 1) {
					strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
				}
				else {
					strParamName = String.format("n_%1$s_%2$s_%3$s", strFieldName, strCondOp, nIndex).toLowerCase();
				}

				nIndex ++;
				if(!contains(strParamName)) {
					searchFieldCond.setValue(strParamName);
					set(strParamName, objValue);
					break;
				}
			}
//
//			String strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
//			searchFieldCond.setValue(strParamName);
//			this.set(strParamName, objValue);
		}
		this.getSearchCondsIf().add(searchFieldCond);
		return this;
	}


	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO eq(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.EQ, objValue);
		return this;
	}

	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO ne(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO gt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GT, objValue);
		return this;
	}

	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO gte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO lt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LT, objValue);
		return this;
	}

	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO lte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO like(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO ll(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LEFTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO rl(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.RIGHTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO nvl(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNULL, null);
		return this;
	}

	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO nn(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNOTNULL, null);
		return this;
	}

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO in(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.IN, objValue);
		return this;
	}

	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	@Override
	public SearchContextDTO ni(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTIN, objValue);
		return this;
	}

	/**
	 * 添加自定义条件
	 * @param strCustomCond
	 */
	@JsonIgnore
	@Override
	public SearchContextDTO custom(String strCustomCond) {
		SearchCustomCond searchCustomCond = new SearchCustomCond();
		searchCustomCond.setCustomCond(strCustomCond);
		this.getSearchCondsIf().add(searchCustomCond);
		return this;
	}

	/**
	 * 添加预定义条件
	 * @param strPredefined
	 */
	@JsonIgnore
	@Override
	public SearchContextDTO predefined(String strPredefinedCond, String strPredefinedType) {
		SearchPredefinedCond searchPredefinedCond = new SearchPredefinedCond();
		searchPredefinedCond.setPredefinedCond(strPredefinedCond);
		searchPredefinedCond.setPredefinedType(strPredefinedType);
		this.getSearchCondsIf().add(searchPredefinedCond);
		return this;
	}

	@JsonIgnore
	@Override
	public net.ibizsys.central.util.SearchGroupCond and() {
		net.ibizsys.central.util.SearchGroupCond searchGroupCond = new net.ibizsys.central.util.SearchGroupCond(this);
		searchGroupCond.setCondOp(Conditions.AND);
		this.getSearchCondsIf().add(searchGroupCond);
		return searchGroupCond;
	}

	@JsonIgnore
	@Override
	public net.ibizsys.central.util.SearchGroupCond or() {
		net.ibizsys.central.util.SearchGroupCond searchGroupCond = new net.ibizsys.central.util.SearchGroupCond(this);
		searchGroupCond.setCondOp(Conditions.OR);
		this.getSearchCondsIf().add(searchGroupCond);
		return searchGroupCond;
	}


	@JsonIgnore
	@Override
	public SearchContextDTO count(boolean bCount) {
		this.setCount(bCount);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchContextDTO sort(String strSortInfo) {
		this.setPageSort(strSortInfo);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchContextDTO all() {
		return this.limit(Integer.MAX_VALUE).count(false);
	}

	@JsonIgnore
	@Override
	public SearchContextDTO limit(int nSize) {
		return limit(0, nSize);
	}

	@JsonIgnore
	@Override
	public SearchContextDTO limit(int nStart, int nSize) {
		this.setPageable(STARTPAGE, nSize, nStart);
		return this;
	}


	/**
	 * 设置直接变量值
	 * @param strName
	 * @param objValue
	 * @return
	 */
	@Override
	public SearchContextDTO param(String strName, Object objValue) {
		this.set(strName, objValue);
		return this;
	}


	@Override
	@JsonIgnore
	public String getCondOp() {
		return Conditions.AND;
	}

	@Override
	@JsonIgnore
	public boolean isNotMode() {
		return false;
	}

	@Override
	@JsonIgnore
	public String getCondType() {
		return CONDTYPE_GROUP;
	}

	@Override
	@JsonIgnore
	public String getCat() {
		return null;
	}

	@Override
	@JsonIgnore
	public String getTag() {
		return null;
	}


	@Override
	@JsonIgnore
	public String getQuery() {
		Object query = this.get(PARAM_QUERY);
		if(query instanceof String) {
			return (String)query;
		}
		return null;
	}

	@Override
	@JsonIgnore
	public String getDrillDownCond() {
		Object drilldowncond = this.get(PARAM_DRILLDOWNCOND);
		if(drilldowncond instanceof String) {
			return (String)drilldowncond;
		}
		return null;
	}


	@Override
	@JsonIgnore
	public String getGroupCond() {
		Object groupcond = this.get(PARAM_GROUPCOND);
		if(groupcond instanceof String) {
			return (String)groupcond;
		}
		return null;
	}

	@Override
	@JsonIgnore
	public void setPageable(int nPageNumber, int nPageSize, long nOffset) {
		this.setPageable(PageRequest.of(nPageNumber, nPageSize, nOffset));
	}

	@Override
	@JsonIgnore
	public void setPageSort(String strSortInfo) {
		Sort sort = null;
		if (StringUtils.hasLength(strSortInfo)) {
			List<Sort.Order> list = new ArrayList<Sort.Order>();

			String[] parts = strSortInfo.split("[;]");
			for(String strPart : parts) {
				String[] items = strPart.split("[,]");
				if (items.length == 1) {
					list.add(Sort.Order.asc(items[0].trim()));
				} else if (items.length == 2) {
					if ("DESC".equalsIgnoreCase(items[1].trim())) {
						list.add(Sort.Order.desc(items[0].trim()));
					} else {
						list.add(Sort.Order.asc(items[0].trim()));
					}
				}
			}


			if (list.size() > 0) {
				sort = Sort.by(list);
			}
		}
		this.setPageSort(sort);
	}


	@JsonProperty(PARAM_SORT)
	public String getSortInfo() {
		if(this.getPageSort() != null && this.getPageSort() != Sort.unsorted()) {
			java.util.Iterator<Sort.Order> orders = sort.iterator();
			if(orders != null) {
				String strSortInfo = "";
				while (orders.hasNext()) {
					if(StringUtils.hasLength(strSortInfo)) {
						strSortInfo += ";";
					}
					Sort.Order order = orders.next();
					if(order.isAscending()) {
						strSortInfo += String.format("%1$s,asc", order.getProperty());
					}
					else {
						strSortInfo += String.format("%1$s,desc", order.getProperty());
					}
				}
				return strSortInfo;
			}
		}
		return null;
	}

	@JsonProperty(PARAM_OFFSET)
	public long getOffset() {
		if(this.getPageable() != null) {
			return this.getPageable().getOffset();
		}
		return 0;
	}

	@JsonProperty(PARAM_SIZE)
	public int getSize() {
		if(this.getPageable() != null) {
			return this.getPageable().getPageSize();
		}
		return DEFAULTPAGESIZE;
	}

	@JsonProperty(PARAM_PAGE)
	public int getPage() {
		if(this.getPageable() != null) {
			return this.getPageable().getPageNumber();
		}
		return STARTPAGE;
	}



	@Override
	@JsonIgnore
	public ISearchGroupCond getSearchGroupCondByCat(String strCat) {
		return getSearchGroupCondByCat(this, strCat);
	};
	
	@Override
	@JsonIgnore
	public ISearchGroupCond getGroupDataGroupCondByCat(String strCat) {
		return getGroupDataGroupCondByCat(this, strCat);
	}
	
	@Override
	@JsonIgnore
	@Deprecated
	public boolean isFillNestedField() {
		return this.isFillNestedFields();
	}

	@Override
	@JsonIgnore
	public boolean isFillNestedFields() {
		return this.bFillNestedFields;
	}

	@Override
	@JsonIgnore
	public void setFillNestedFields(boolean bFillNestedFields) {
		this.bFillNestedFields = bFillNestedFields;
	}

	@Override
	@JsonIgnore
	public boolean isFillDynaFields() {
		return this.bFillDynaFields;
	}

	@Override
	@JsonIgnore
	public void setFillDynaFields(boolean bFillDynaFields) {
		this.bFillDynaFields = bFillDynaFields;
	}

	@Override
	@JsonIgnore
	public boolean isFillComputedFields() {
		return this.bFillComputedFields;
	}

	@Override
	@JsonIgnore
	public void setFillComputedFields(boolean bFillComputedFields) {
		this.bFillComputedFields = bFillComputedFields;
	}

	@Override
	@JsonIgnore
	public boolean isTranslateFields() {
		return this.bTranslateFields;
	}

	@Override
	@JsonIgnore
	public void setTranslateFields(boolean bTranslateFields) {
		this.bTranslateFields = bTranslateFields;
	}
	
	@JsonIgnore
	@Override
	public SearchContextDTO nestedfields(boolean bFillNestedFields) {
		this.setFillNestedFields(bFillNestedFields);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchContextDTO dynafields(boolean bFillDynaFields) {
		this.setFillDynaFields(bFillDynaFields);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchContextDTO computedfields(boolean bFillComputedFields) {
		this.setFillComputedFields(bFillComputedFields);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchContextDTO translatefields(boolean bTranslateFields) {
		this.setTranslateFields(bTranslateFields);
		return this;
	}

	
	@Override
	@JsonIgnore
	public SearchContextDTO raw() {
		this.setFillComputedFields(false);
		this.setFillDynaFields(false);
		this.setFillNestedFields(false);
		this.setTranslateFields(false);
		this.setCount(false);
		return this;
	}
	
	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}

	
	@JsonIgnore
	public static ISearchGroupCond getSearchGroupCondByCat(ISearchContext iSearchContext, String strCat) {
		Assert.hasLength(strCat, "未传入条件分组");
		List<ISearchCond> searchCondList = iSearchContext.getSearchConds();
		if(!ObjectUtils.isEmpty(searchCondList)) {
			for(ISearchCond iSearchCond : searchCondList) {
				if(iSearchCond instanceof ISearchGroupCond) {
					ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)iSearchCond;
					if(strCat.equals(iSearchGroupCond.getCat())) {
						return iSearchGroupCond;
					}
				}
			}
		}
		return null;
	}
	
	@JsonIgnore
	public static ISearchGroupCond getGroupDataGroupCondByCat(ISearchContext iSearchContext, String strCat) {
		Assert.hasLength(strCat, "未传入条件分组");
		List<ISearchCond> searchCondList = iSearchContext.getGroupDataConds();
		if(!ObjectUtils.isEmpty(searchCondList)) {
			for(ISearchCond iSearchCond : searchCondList) {
				if(iSearchCond instanceof ISearchGroupCond) {
					ISearchGroupCond iSearchGroupCond = (ISearchGroupCond)iSearchCond;
					if(strCat.equals(iSearchGroupCond.getCat())) {
						return iSearchGroupCond;
					}
				}
			}
		}
		return null;
	}
}

