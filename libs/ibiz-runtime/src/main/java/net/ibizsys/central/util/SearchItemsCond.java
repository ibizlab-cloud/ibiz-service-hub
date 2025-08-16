package net.ibizsys.central.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import net.ibizsys.runtime.util.*;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchItemsCond extends net.ibizsys.runtime.util.SearchItemsCond implements ISearchItemsCond {

	public static SearchItemsCond from(Map<String, Object> map, boolean bIgnoreEmtpyGroup) {

		Object objSearchConds = map.remove("searchconds");

		SearchItemsCond searchItemsCond = JsonUtils.MAPPER.convertValue(map, SearchItemsCond.class);
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
					searchItemsCond.getSearchCondsIf().add(searchFieldCond);
					continue;
				}

				if(CONDTYPE_GROUP.equalsIgnoreCase(strType)) {
					SearchGroupCond childGroup = SearchGroupCond.from(child, bIgnoreEmtpyGroup);
					if(childGroup != null) {
						//排除无子条件
						searchItemsCond.getSearchCondsIf().add(childGroup);
					}
					continue;
				}

				if(CONDTYPE_CUSTOM.equalsIgnoreCase(strType)) {
					SearchCustomCond searchCustomCond = JsonUtils.MAPPER.convertValue(child, SearchCustomCond.class);
					searchItemsCond.getSearchCondsIf().add(searchCustomCond);
					continue;
				}

				if(CONDTYPE_PREDEFINED.equalsIgnoreCase(strType)) {
					SearchPredefinedCond searchPredefinedCond = JsonUtils.MAPPER.convertValue(child, SearchPredefinedCond.class);
					searchItemsCond.getSearchCondsIf().add(searchPredefinedCond);
					continue;
				}

				if(CONDTYPE_ITEMS.equalsIgnoreCase(strType)) {
					SearchItemsCond childItems = SearchItemsCond.from(child, bIgnoreEmtpyGroup);
					if(childItems != null) {
						//排除无子条件
						searchItemsCond.getSearchCondsIf().add(childItems);
					}
					continue;
				}
			}
		}

		if(bIgnoreEmtpyGroup && ObjectUtils.isEmpty(searchItemsCond.getSearchConds())) {
			return null;
		}

		return searchItemsCond;
	}
}
