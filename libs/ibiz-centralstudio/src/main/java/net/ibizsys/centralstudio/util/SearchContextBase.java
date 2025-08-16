package net.ibizsys.centralstudio.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;



@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class SearchContextBase extends EntityBase implements ISearchContext {

	@JsonIgnore
	private Pageable pageable = null;

	@JsonIgnore
	private Sort sort = null;

	@JsonIgnore
	private boolean bCount = true;
	
	
	@JsonIgnore
	private String strDataSetName = null;
	
	
	@JsonIgnore
	private List<ISearchCond> searchCondList = null;

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
	public String getDataSetName() {
		return this.strDataSetName;
	}
	
	
	
	
	@Override
	@JsonIgnore
	public void setDataSetName(String strDataSetName) {
		this.strDataSetName = strDataSetName;
	}

	@Override
	@JsonIgnore
	protected boolean isLowerCaseName() {
		return false;
	}


	
	
	@Override
	public void setPageable(int nPageNumber, int nPageSize) {
		this.setPageable(PageRequest.of(nPageNumber, nPageSize));
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
	@JsonProperty("searchconds")
	public List<ISearchCond> getSearchConds() {
		return this.searchCondList;
	}
	
	@JsonProperty("searchconds")
	public void setSearchConds(List<ISearchCond> list) {
		this.searchCondList = list;
	}
	
	@JsonIgnore
	public List<ISearchCond> getSearchCondsIf() {
		if(this.searchCondList == null) {
			this.searchCondList = new ArrayList<ISearchCond>();
		}
		return this.searchCondList;
	}
	
	@Override
	public SearchContextBase setFieldCond(String strFieldName, String strCondOp, Object objValue) {
		
		if(!Conditions.ISNULL.equals(strCondOp)
				&& !Conditions.ISNOTNULL.equals(strCondOp)) {
			
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
					set(strParamName, objValue);
					break;
				}
			}

		}
		return this;
	}


	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase eq(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.EQ, objValue);
		return this;
	}

	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase ne(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase gt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GT, objValue);
		return this;
	}

	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase gte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase lt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LT, objValue);
		return this;
	}

	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase lte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase like(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase ll(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LEFTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase rl(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.RIGHTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase nvl(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNULL, null);
		return this;
	}

	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase nn(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNOTNULL, null);
		return this;
	}

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase in(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.IN, objValue);
		return this;
	}

	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	@Override
	public SearchContextBase ni(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTIN, objValue);
		return this;
	}

	
	

	@Override
	public SearchContextBase count(boolean bCount) {
		this.setCount(bCount);
		return this;
	}
	
	@Override
	public SearchContextBase sort(String strSortInfo) {
		this.setPageSort(strSortInfo);
		return this;
	}
	
	@Override
	public SearchContextBase all() {
		return this.limit(Integer.MAX_VALUE).count(false);
	}
	
	@Override
	public SearchContextBase limit(int nSize) {
		this.setPageable(STARTPAGE, nSize);
		return this;
	}

	
	
	/**
	 * 设置直接变量值
	 * @param strName
	 * @param objValue
	 * @return
	 */
	@Override
	public SearchContextBase param(String strName, Object objValue) {
		this.set(strName, objValue);
		return this;
	}

	
	
}
