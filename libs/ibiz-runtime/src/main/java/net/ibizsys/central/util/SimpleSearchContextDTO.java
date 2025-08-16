package net.ibizsys.central.util;

import java.util.ArrayList;
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
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;
import net.ibizsys.runtime.util.SearchPredefinedCond;

@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class SimpleSearchContextDTO extends EntityBase implements ISearchContextDTO {

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
	
	public SimpleSearchContextDTO() {
		
	}
	

	public SimpleSearchContextDTO(Map map) throws Exception{
		this.init(null, map, true);
	}
	
	
	@Override
	public void init(IDEMethodDTORuntime iDEMethodDTORuntime, Object objData, boolean bDTOData) throws Exception {
		
		if(!bDTOData) {
			throw new Exception(String.format("仅支持传入DTO"));
		}
		
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
		Object searchConds = this.get(PARAM_SEARCHCONDS);
		
		this.reset(PARAM_SIZE);
		this.reset(PARAM_PAGE);
		this.reset(PARAM_OFFSET);
		this.reset(PARAM_SORT);
		this.reset(PARAM_SEARCHCONDS);

		
		int nSize = 20;
		if (size != null) {
			nSize = Integer.valueOf(size.toString());
			if (nSize <= 0 || nSize >= 1000) {
				nSize = 20;
			}
		}
		
		long nOffset = 0;
		if (offset != null) {
			nOffset = Long.valueOf(offset.toString());
			if (nOffset < 0) {
				nOffset = 0;
			}
		}
		
		int nPage = 0;
		if (page != null) {
			nPage = Integer.valueOf(page.toString());
			if (nPage < 0) {
				nPage = 0;
			}
		}

		if (sortinfo instanceof String) {
			String strSortInfo = (String) sortinfo;
			strSortInfo = strSortInfo.trim();
			if (StringUtils.hasLength(strSortInfo)) {
				List<Sort.Order> list = new ArrayList<Sort.Order>();
				String[] items = strSortInfo.split("[,]");
				if (items.length == 1) {
					list.add(Sort.Order.asc(items[0].trim()));
				} else if (items.length == 2) {
					if ("DESC".equalsIgnoreCase(items[1].trim())) {
						list.add(Sort.Order.desc(items[0].trim()));
					} else {
						list.add(Sort.Order.asc(items[0].trim()));
					}
				}
				if (list.size() > 0) {
					this.sort = Sort.by(list);
				}
			}
		}

		this.pageable = PageRequest.of(nPage, nSize, nOffset);

		Object count = this.get(PARAM_COUNT);
		this.reset(PARAM_COUNT);
		if(count != null && count.toString().equalsIgnoreCase("false")) {
			this.setCount(false);
		}
		
		if(searchConds instanceof List) {
			List list = (List)searchConds;
			for(Object item : list) {
				if(item instanceof Map) {
					ISearchCond iSearchCond = SearchGroupCond.getSearchCond((Map)item, true);
					if(iSearchCond != null) {
						this.getSearchCondsIf().add(iSearchCond);
					}
				}
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
		return null;
	}



	@Override
	public void setDEMethodDTORuntime(IDEFilterDTORuntime iDEFilterDTORuntime) {
		
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
	@JsonIgnore
	public boolean isCount() {
		return this.bCount;
	}

	@Override
	@JsonIgnore
	public void setCount(boolean bCount) {
		this.bCount = bCount;
	}

	
	@Override
	@JsonIgnore
	protected boolean isLowerCaseName() {
		return false;
	}

	
	@Override
	@JsonIgnore
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
	
	@Override
	public void set(String strName, String strValue) {
		this.set(strName, (Object)strValue);
	}
	
	
	@Override
	@JsonIgnore
	public String getCondOp() {
		return Conditions.AND;
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
	public String getQuery() {
		Object query = this.get(PARAM_QUERY);
		if(query instanceof String) {
			return (String)query;
		}
		return null;
	}
	
	@JsonIgnore
	public void setQuery(String query) {
		this.set(PARAM_QUERY, query);
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
	public void setPageable(int nPageNumber, int nPageSize, long nOffset) {
		this.setPageable(PageRequest.of(nPageNumber, nPageSize, nOffset));
	}

	@Override
	public void setPageSort(String strSortInfo) {
		if (StringUtils.hasLength(strSortInfo)) {
			List<Sort.Order> list = new ArrayList<Sort.Order>();
			String[] items = strSortInfo.split("[,]");
			if (items.length == 1) {
				list.add(Sort.Order.asc(items[0]));
			} else if (items.length == 2) {
				if ("DESC".equalsIgnoreCase(items[1])) {
					list.add(Sort.Order.desc(items[0]));
				} else {
					list.add(Sort.Order.asc(items[0]));
				}
			}
			if (list.size() > 0) {
				this.setPageSort(Sort.by(list));
			}
		}
		else {
			this.setPageSort(Sort.unsorted());
		}
	}
	
	
	@Override
	public SimpleSearchContextDTO setFieldCond(String strFieldName, String strCondOp, Object objValue) {
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
	public SimpleSearchContextDTO eq(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.EQ, objValue);
		return this;
	}

	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO ne(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO gt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GT, objValue);
		return this;
	}

	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO gte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO lt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LT, objValue);
		return this;
	}

	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO lte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO like(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO ll(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LEFTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO rl(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.RIGHTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO nvl(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNULL, null);
		return this;
	}

	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO nn(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNOTNULL, null);
		return this;
	}

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO in(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.IN, objValue);
		return this;
	}

	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	@Override
	public SimpleSearchContextDTO ni(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTIN, objValue);
		return this;
	}

	/**
	 * 添加自定义条件
	 * @param strCustomCond
	 */
	@JsonIgnore
	@Override
	public SimpleSearchContextDTO custom(String strCustomCond) {
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
	public SimpleSearchContextDTO predefined(String strPredefinedCond, String strPredefinedType) {
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
	

	@Override
	@JsonIgnore
	public SimpleSearchContextDTO count(boolean bCount) {
		this.setCount(bCount);
		return this;
	}
	
	@Override
	@JsonIgnore
	public SimpleSearchContextDTO sort(String strSortInfo) {
		this.setPageSort(strSortInfo);
		return this;
	}
	
	@Override
	@JsonIgnore
	public SimpleSearchContextDTO all() {
		return this.limit(Integer.MAX_VALUE).count(false);
	}
	
	@Override
	@JsonIgnore
	public SimpleSearchContextDTO limit(int nSize) {
		return limit(0, nSize);
	}

	@Override
	@JsonIgnore
	public SimpleSearchContextDTO limit(int nStart, int nSize) {
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
	public SimpleSearchContextDTO param(String strName, Object objValue) {
		this.set(strName, objValue);
		return this;
	}
	
	
	@Override
	@JsonIgnore
	public ISearchGroupCond getSearchGroupCondByCat(String strCat) {
		Assert.hasLength(strCat, "未传入条件分组");
		List<ISearchCond> searchCondList = this.getSearchConds();
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
	

	@Override
	@JsonIgnore
	public ISearchGroupCond getGroupDataGroupCondByCat(String strCat) {
		Assert.hasLength(strCat, "未传入条件分组");
		List<ISearchCond> searchCondList = this.getGroupDataConds();
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
	public SimpleSearchContextDTO nestedfields(boolean bFillNestedFields) {
		this.setFillNestedFields(bFillNestedFields);
		return this;
	}

	@JsonIgnore
	@Override
	public SimpleSearchContextDTO dynafields(boolean bFillDynaFields) {
		this.setFillDynaFields(bFillDynaFields);
		return this;
	}

	@JsonIgnore
	@Override
	public SimpleSearchContextDTO computedfields(boolean bFillComputedFields) {
		this.setFillComputedFields(bFillComputedFields);
		return this;
	}
	
	@JsonIgnore
	@Override
	public SimpleSearchContextDTO translatefields(boolean bTranslateFields) {
		this.setTranslateFields(bTranslateFields);
		return this;
	}
	
	@Override
	@JsonIgnore
	public SimpleSearchContextDTO raw() {
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
}
