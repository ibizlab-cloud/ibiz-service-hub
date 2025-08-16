package net.ibizsys.central.bi.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class BISearchContext implements IBISearchContext {

	public static final TypeReference<List<BISearchDimension>> BISearchDimensionListType = new TypeReference<List<BISearchDimension>>() {
	};
	public static final TypeReference<List<BISearchMeasure>> BISearchMeasureListType = new TypeReference<List<BISearchMeasure>>() {
	};
	
	transient final ISearchContext iSearchContext ;
	transient String strBICubeTag = null;
	transient String strBIReportTag = null;
	transient List<IBISearchMeasure> biSearchMeasureList = null;
	transient List<IBISearchDimension> biSearchDimensionList = null;
	transient IBISearchPeriod iBISearchPeriod = null;
	transient Sort biSort = null;
	
	
	public BISearchContext(ISearchContext iSearchContext) {
		Assert.notNull(iSearchContext, "未传入搜索上下文");
		this.iSearchContext = iSearchContext;
		
		this.strBICubeTag = DataTypeUtils.getStringValue(this.getSearchContext().get(PARAM_BICUBETAG), null);
		this.strBIReportTag = DataTypeUtils.getStringValue(this.getSearchContext().get(PARAM_BIREPORTTAG), null);
		
		Object bimeasures = this.getSearchContext().get(PARAM_BIMEASURES); 
		if(!ObjectUtils.isEmpty(bimeasures)) {
			Object list = JsonUtils.as(bimeasures, BISearchMeasureListType);
			this.biSearchMeasureList = (List<IBISearchMeasure>)list;
		}
		
		Object bidimensions = this.getSearchContext().get(PARAM_BIDIMENSIONS); 
		if(!ObjectUtils.isEmpty(bidimensions)) {
			Object list = JsonUtils.as(bidimensions, BISearchDimensionListType);
			this.biSearchDimensionList = (List<IBISearchDimension>)list;
		}
		
		Object bisearchperiod = this.getSearchContext().get(PARAM_BIPERIOD);
		if(!ObjectUtils.isEmpty(bisearchperiod)) { 
			this.iBISearchPeriod = JsonUtils.as(bisearchperiod, BISearchPeriod.class);
		}
		
		String strBISortInfo = DataTypeUtils.getStringValue(this.getSearchContext().get(PARAM_BISORT), null);
		if(!ObjectUtils.isEmpty(strBISortInfo)) { 
			this.setBISort(strBISortInfo);
		}
	}

	@Override
	@JsonIgnore
	public ISearchContext getSearchContext() {
		return this.iSearchContext;
	}

	@Override
	public String getBICubeTag() {
		return this.strBICubeTag;
	}
	
	public void setBICubeTag(String strBICubeTag) {
		this.strBICubeTag = strBICubeTag;
	}

	@Override
	public String getBIReportTag() {
		return this.strBIReportTag;
	}
	
	public void setBIReportTag(String strBIReportTag) {
		this.strBIReportTag = strBIReportTag;
	}

	@Override
	@JsonIgnore
	public List<IBISearchDimension> getBISearchDimensionsIf() {
		if(this.biSearchDimensionList == null) {
			this.biSearchDimensionList = new ArrayList<IBISearchDimension>();
		}
		return this.biSearchDimensionList;
	}

	@Override
	public List<IBISearchDimension> getBISearchDimensions() {
		return this.biSearchDimensionList;
	}

	@Override
	@JsonIgnore
	public List<IBISearchMeasure> getBISearchMeasuresIf() {
		if(this.biSearchMeasureList == null) {
			this.biSearchMeasureList = new ArrayList<IBISearchMeasure>();
		}
		return this.biSearchMeasureList;
	}

	@Override
	public List<IBISearchMeasure> getBISearchMeasures() {
		return this.biSearchMeasureList;
	}

	@Override
	public IBISearchPeriod getBISearchPeriod() {
		return this.iBISearchPeriod;
	}
	
	public void setBISearchPeriod(IBISearchPeriod iBISearchPeriod) {
		this.iBISearchPeriod = iBISearchPeriod;
	}
	
	@Override
	public Sort getBISort() {
		return this.biSort;
	}

	public void setBISort(Sort biSort) {
		this.biSort = biSort;
	}
	
	@JsonIgnore
	public void setBISort(String strSortInfo) {
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
		this.setBISort(sort);
	}

	

	public static IBISearchMeasure getBISearchMeasure(IBISearchContext iBISearchContext, String strName, boolean bTryMode) throws Exception {
		List<IBISearchMeasure> list = iBISearchContext.getBISearchMeasures();
		if(!ObjectUtils.isEmpty(list)) {
			for(IBISearchMeasure iBISearchMeasure : list) {
				if(strName.equalsIgnoreCase(iBISearchMeasure.getName())) {
					return iBISearchMeasure;
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("无法获取指定BI搜索指标[%1$s]", strName));
	}
	
	
	
	public static IBISearchDimension getBISearchDimension(IBISearchContext iBISearchContext, String strName, boolean bTryMode) throws Exception {
		List<IBISearchDimension> list = iBISearchContext.getBISearchDimensions();
		if(!ObjectUtils.isEmpty(list)) {
			for(IBISearchDimension iBISearchDimension : list) {
				if(strName.equalsIgnoreCase(iBISearchDimension.getName())) {
					return iBISearchDimension;
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("无法获取指定BI搜索维度[%1$s]", strName));
	}
	
}
