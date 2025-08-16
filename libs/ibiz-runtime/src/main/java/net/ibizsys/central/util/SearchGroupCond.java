package net.ibizsys.central.util;

import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;
import net.ibizsys.runtime.util.SearchItemsCond;
import net.ibizsys.runtime.util.SearchPredefinedCond;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class SearchGroupCond extends net.ibizsys.runtime.util.SearchGroupCond implements ISearchGroupCond {

	@JsonIgnore
	private ISearchContextDTO iSearchContextDTO = null;

	public SearchGroupCond() {

	}

	@JsonIgnore
	public SearchGroupCond(ISearchContextDTO iSearchContextDTO) {
		this.iSearchContextDTO = iSearchContextDTO;
	}

	@JsonIgnore
	public ISearchContextDTO getSearchContextDTO() {
		return this.iSearchContextDTO;
	}

	@JsonIgnore
	public SearchGroupCond not() {
		this.setNotMode(true);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchGroupCond setFieldCond(String strFieldName, String strCondOp, Object objValue) {
		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldName);
		searchFieldCond.setCondOp(strCondOp);
		if(getSearchContextDTO()!=null) {
			if(!Conditions.ISNULL.equals(strCondOp)
					&& !Conditions.ISNOTNULL.equals(strCondOp)) {
				searchFieldCond.setParamMode(true);

				int nIndex = 1;
				String strParamName = "";
				while(true) {
					if(nIndex == 1) {
						strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
					}
					else {
						strParamName = String.format("n_%1$s_%2$s_%3$s", strFieldName, strCondOp, nIndex).toLowerCase();
					}

					nIndex ++;
					if(!this.getSearchContextDTO().contains(strParamName)) {
						searchFieldCond.setValue(strParamName);
						this.getSearchContextDTO().set(strParamName, objValue);
						break;
					}
				}


//				String strParamName = String.format("n_%1$s_%2$s", strFieldName, strCondOp).toLowerCase();
//				searchFieldCond.setValue(strParamName);
//				this.getSearchContextDTO().set(strParamName, objValue);
			}
		}
		else {
			if(!Conditions.ISNULL.equals(strCondOp)
					&& !Conditions.ISNOTNULL.equals(strCondOp)) {
				searchFieldCond.setValue(objValue);
			}
		}

		this.getSearchCondsIf().add(searchFieldCond);

		return this;
	}


	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond eq(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.EQ, objValue);
		return this;
	}

	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond ne(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond gt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GT, objValue);
		return this;
	}

	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond gte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.GTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond lt(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LT, objValue);
		return this;
	}

	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond lte(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LTANDEQ, objValue);
		return this;
	}

	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond like(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond ll(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.LEFTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond rl(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.RIGHTLIKE, objValue);
		return this;
	}

	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond nvl(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNULL, null);
		return this;
	}

	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond nn(String strFieldName) {
		setFieldCond(strFieldName, Conditions.ISNOTNULL, null);
		return this;
	}

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond in(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.IN, objValue);
		return this;
	}

	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond ni(String strFieldName, Object objValue) {
		setFieldCond(strFieldName, Conditions.NOTIN, objValue);
		return this;
	}

	/**
	 * 添加自定义条件
	 * @param strCustomCond
	 */
	@JsonIgnore
	@Override
	public SearchGroupCond custom(String strCustomCond) {
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
	public SearchGroupCond predefined(String strPredefinedCond, String strPredefinedType) {
		SearchPredefinedCond searchPredefinedCond = new SearchPredefinedCond();
		searchPredefinedCond.setPredefinedCond(strPredefinedCond);
		searchPredefinedCond.setPredefinedType(strPredefinedType);
		this.getSearchCondsIf().add(searchPredefinedCond);
		return this;
	}

	@JsonIgnore
	@Override
	public SearchGroupCond and() {
		net.ibizsys.central.util.SearchGroupCond searchGroupCond = new net.ibizsys.central.util.SearchGroupCond(this.getSearchContextDTO());
		searchGroupCond.setCondOp(Conditions.AND);
		this.getSearchCondsIf().add(searchGroupCond);
		return searchGroupCond;
	}

	@JsonIgnore
	public SearchGroupCond or() {
		net.ibizsys.central.util.SearchGroupCond searchGroupCond = new net.ibizsys.central.util.SearchGroupCond(this.getSearchContextDTO());
		searchGroupCond.setCondOp(Conditions.OR);
		this.getSearchCondsIf().add(searchGroupCond);
		return searchGroupCond;
	}

//	@JsonIgnore
//	public SearchGroupCond or(Closure closure) {
//		SearchGroupCond or = this.or();
//		closure.setResolveStrategy(Closure.DELEGATE_ONLY);
//		closure.setDelegate(or);
//		closure.call();
//		return this;
//	}
//
//	@JsonIgnore
//	public SearchGroupCond and(Closure closure) {
//		SearchGroupCond and = this.and();
//		closure.setResolveStrategy(Closure.DELEGATE_ONLY);
//		closure.setDelegate(and);
//		closure.call();
//		return this;
//	}
//

	public static SearchGroupCond from(Map<String, Object> map, boolean bIgnoreEmtpyGroup) {

		Object objSearchConds = map.remove("searchconds");
		map.remove("condtype");

		SearchGroupCond searchGroupCond = JsonUtils.MAPPER.convertValue(map, SearchGroupCond.class);
		if(objSearchConds instanceof List) {
			List list = (List)objSearchConds;
			for(Object objItem : list) {
				if(!(objItem instanceof Map)) {
					continue;
				}

				Map child = (Map)objItem;
				String strType = (String)child.remove("condtype");

				if(CONDTYPE_DEFIELD.equalsIgnoreCase(strType)) {
					SearchFieldCond searchFieldCond = JsonUtils.MAPPER.convertValue(child, SearchFieldCond.class);
					searchGroupCond.getSearchCondsIf().add(searchFieldCond);
					continue;
				}

				if(CONDTYPE_GROUP.equalsIgnoreCase(strType)) {
					SearchGroupCond childGroup = SearchGroupCond.from(child, bIgnoreEmtpyGroup);
					if(childGroup != null) {
						//排除无子条件
						searchGroupCond.getSearchCondsIf().add(childGroup);
					}
					continue;
				}

				if(CONDTYPE_CUSTOM.equalsIgnoreCase(strType)) {
					SearchCustomCond searchCustomCond = JsonUtils.MAPPER.convertValue(child, SearchCustomCond.class);
					searchGroupCond.getSearchCondsIf().add(searchCustomCond);
					continue;
				}

				if(CONDTYPE_PREDEFINED.equalsIgnoreCase(strType)) {
					SearchPredefinedCond searchPredefinedCond = JsonUtils.MAPPER.convertValue(child, SearchPredefinedCond.class);
					searchGroupCond.getSearchCondsIf().add(searchPredefinedCond);
					continue;
				}

				if(CONDTYPE_ITEMS.equalsIgnoreCase(strType)) {
					SearchItemsCond childItems = net.ibizsys.central.util.SearchItemsCond.from(child, bIgnoreEmtpyGroup);
					if(childItems != null) {
						//排除无子条件
						searchGroupCond.getSearchCondsIf().add(childItems);
					}
					continue;
				}
			}
		}

		if(bIgnoreEmtpyGroup && ObjectUtils.isEmpty(searchGroupCond.getSearchConds())) {
			return null;
		}

		return searchGroupCond;
	}

	public static ISearchCond getSearchCond(Map<String, Object> map, boolean bIgnoreEmtpyGroup) {

		String strType = (String)map.remove("condtype");

		if(CONDTYPE_DEFIELD.equalsIgnoreCase(strType)) {
			return JsonUtils.MAPPER.convertValue(map, SearchFieldCond.class);
		}

		if(CONDTYPE_GROUP.equalsIgnoreCase(strType)) {
			return net.ibizsys.central.util.SearchGroupCond.from(map, bIgnoreEmtpyGroup);
		}

		if(CONDTYPE_CUSTOM.equalsIgnoreCase(strType)) {
			return JsonUtils.MAPPER.convertValue(map, SearchCustomCond.class);
		}

		if(CONDTYPE_PREDEFINED.equalsIgnoreCase(strType)) {
			return JsonUtils.MAPPER.convertValue(map, SearchPredefinedCond.class);
		}

		if(CONDTYPE_ITEMS.equalsIgnoreCase(strType)) {
			return net.ibizsys.central.util.SearchItemsCond.from(map, bIgnoreEmtpyGroup);
		}

		throw new RuntimeException(String.format("无法识别的条件类型[%1$s]", strType));
	}

}
