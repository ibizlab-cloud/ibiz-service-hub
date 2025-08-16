package net.ibizsys.central.dataentity.ds;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.der.DERAggDataDEFMapTypes;
import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class DEGroupDataSetRuntimeBase extends DEDataSetRuntimeBase implements IDEGroupDataSetRuntime {

	private java.util.Map<String, IPSDEDataSetGroupParam> psDEDataSetGroupParamMap = null;
	private java.util.Map<String, IPSDERAggDataDEFieldMap> psDERAggDataDEFieldMapMap = null;
	private java.util.Map<String, IPSDERAggDataDEFieldMap> timeGroupPSDERAggDataDEFieldMapMap = null;
	private java.util.Map<String, IPSDERAggDataDEFieldMap> metricPSDERAggDataDEFieldMapMap = null;
	private java.util.Map<String, IPSDERAggDataDEFieldMap> popPSDERAggDataDEFieldMapMap = null;
	private List<String> timeGroupList = null;
	private final static String[] TimeGroups = new String[] {
			DERAggDataDEFMapTypes.GROUPBY_YEAR,
			DERAggDataDEFMapTypes.GROUPBY_QUARTER,
			DERAggDataDEFMapTypes.GROUPBY_MONTH,
			DERAggDataDEFMapTypes.GROUPBY_DAYOFMONTH
	};
	
	
	@Override
	protected void onInit() throws Exception {
	
		if(!ObjectUtils.isEmpty(this.getPSDEDataSet().getPSDEDataSetGroupParams())) {
			this.psDEDataSetGroupParamMap = new HashMap<>();
			for(IPSDEDataSetGroupParam iPSDEDataSetGroupParam : this.getPSDEDataSet().getPSDEDataSetGroupParams()){
				this.psDEDataSetGroupParamMap.put(iPSDEDataSetGroupParam.getName().toUpperCase(), iPSDEDataSetGroupParam);
			}
		}
		
		if(this.getPSDEDataSet().getPSDERAggData() != null) {
			if(!ObjectUtils.isEmpty(this.getPSDEDataSet().getPSDERAggData().getPSDERAggDataDEFieldMaps())) {
				this.psDERAggDataDEFieldMapMap = new HashMap<>();
				this.timeGroupPSDERAggDataDEFieldMapMap = new HashMap<>();
				this.popPSDERAggDataDEFieldMapMap = new HashMap<>();
				this.metricPSDERAggDataDEFieldMapMap = new HashMap<>();
				
				for(IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap : this.getPSDEDataSet().getPSDERAggData().getPSDERAggDataDEFieldMaps()){
					
					//如定义分组参数，则需要判断是否在参数中定义
					if(this.psDEDataSetGroupParamMap != null 
							&& !this.psDEDataSetGroupParamMap.containsKey(iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getName())) {
						continue;
					}
					
					this.psDERAggDataDEFieldMapMap.put(iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getName(), iPSDERAggDataDEFieldMap);
					
					//判断是否有环比、同比属性
					
					String strMapType = iPSDERAggDataDEFieldMap.getMapType();
					if(strMapType.equals(DERAggDataDEFMapTypes.AVG)
							|| strMapType.equals(DERAggDataDEFMapTypes.COUNT)
							|| strMapType.equals(DERAggDataDEFMapTypes.MAX)
							|| strMapType.equals(DERAggDataDEFMapTypes.MIN)
							|| strMapType.equals(DERAggDataDEFMapTypes.SUM)) {
						
						this.metricPSDERAggDataDEFieldMapMap.put(iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName(), iPSDERAggDataDEFieldMap);
						
						String strMajorFieldName = iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getName();
						String strMajorFieldName__YOY = String.format("%1$s__YOY", strMajorFieldName);
						if(this.getDataEntityRuntime().getPSDEField(strMajorFieldName__YOY, true)!=null) {
							this.popPSDERAggDataDEFieldMapMap.put(strMajorFieldName__YOY, iPSDERAggDataDEFieldMap);
						}
						String strMajorFieldName__POP = String.format("%1$s__POP", strMajorFieldName);
						if(this.getDataEntityRuntime().getPSDEField(strMajorFieldName__POP, true)!=null) {
							this.popPSDERAggDataDEFieldMapMap.put(strMajorFieldName__POP, iPSDERAggDataDEFieldMap);
						}
						
						
					}
					if(strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_DAYOFMONTH)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_DAYOFWEEK)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_DAYOFYEAR)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_HOUR)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_MINUTE)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_MONTH)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_QUARTER)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_WEEK)
							|| strMapType.equals(DERAggDataDEFMapTypes.GROUPBY_YEAR)) {
						this.timeGroupPSDERAggDataDEFieldMapMap.put(strMapType, iPSDERAggDataDEFieldMap);
					}
				}
				
				if(ObjectUtils.isEmpty(this.timeGroupPSDERAggDataDEFieldMapMap)) {
					this.timeGroupPSDERAggDataDEFieldMapMap = null;
				}
				
				if(ObjectUtils.isEmpty(this.popPSDERAggDataDEFieldMapMap)) {
					this.popPSDERAggDataDEFieldMapMap = null;
				}
				
				if(this.timeGroupPSDERAggDataDEFieldMapMap != null) {
					this.timeGroupList = new ArrayList<String>();
					for(String strTimeGroup : TimeGroups) {
						if(this.timeGroupPSDERAggDataDEFieldMapMap.containsKey(strTimeGroup)) {
							this.timeGroupList.add(strTimeGroup);
						}
					}
					if(ObjectUtils.isEmpty(this.timeGroupList)) {
						this.timeGroupList = null;
					}
				}
			}
		}
		
		super.onInit();
	}
	
	@Override
	public Object fetch(Object[] args) throws Throwable {
		
		ISearchContext iSearchContext = (ISearchContext)args[0];
		//默认数据查询
		Object result = this.onFetch(iSearchContext);
		if(!StringUtils.hasLength(iSearchContext.getDrillDownCond())
				&& !ObjectUtils.isEmpty(this.popPSDERAggDataDEFieldMapMap)
				&& !ObjectUtils.isEmpty(this.timeGroupPSDERAggDataDEFieldMapMap)
				&& !ObjectUtils.isEmpty(this.timeGroupList)){
			//需要处理同比、环比维度
			if(result instanceof Page) {
				Page page = (Page)result;
				if(!ObjectUtils.isEmpty(page.getContent())) {
					
					//判断是否有年份条件
					IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap = timeGroupPSDERAggDataDEFieldMapMap.get(DERAggDataDEFMapTypes.GROUPBY_YEAR);
					if(iPSDERAggDataDEFieldMap != null) {
						String strSearchMode =String.format("n_%1$s_eq",iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName());
						Object objYear = iSearchContext.get(strSearchMode);
						int nYear = DataTypeUtils.getIntegerValue(objYear, -1);
						if(nYear!=-1) {
							
						
							Map<String, Object> metricMap = new HashMap<>();
							for(Object item : page.getContent()) {
								if(item instanceof IEntityDTO) {
									IEntityDTO iEntityDTO = (IEntityDTO)item;
									for(java.util.Map.Entry<String, IPSDERAggDataDEFieldMap> metric : metricPSDERAggDataDEFieldMapMap.entrySet()) {
										fillMetricMap(metricMap, iEntityDTO, metric.getValue());
									}
								}
							}
							
							//设置新时间
							iSearchContext.set(strSearchMode, nYear-1);
							Object result2 = this.onFetch(iSearchContext);
							if(result2 instanceof Page) {
								Page page2 = (Page)result2;
								if(!ObjectUtils.isEmpty(page2.getContent())) {
									for(Object item : page2.getContent()) {
										if(item instanceof IEntityDTO) {
											IEntityDTO iEntityDTO = (IEntityDTO)item;
											for(java.util.Map.Entry<String, IPSDERAggDataDEFieldMap> metric : metricPSDERAggDataDEFieldMapMap.entrySet()) {
												fillMetricMap(metricMap, iEntityDTO, metric.getValue());
											}
										}
									}
								}
							}
							
							//恢复
							iSearchContext.set(strSearchMode, objYear);
							
							
							Map<Object, Long> timeMap = new HashMap<>();
							
							for(Object item : page.getContent()) {
								if(item instanceof IEntityDTO) {
									IEntityDTO iEntityDTO = (IEntityDTO)item;
									Long nTime = this.getEntityTime(iEntityDTO);
									timeMap.put(item, nTime);
								}
							}
							
							
							for(java.util.Map.Entry<String, IPSDERAggDataDEFieldMap> metric : popPSDERAggDataDEFieldMapMap.entrySet()) {
								String strMetricName = metric.getKey().toLowerCase();
								IPSDERAggDataDEFieldMap metricPSDERAggDataDEFieldMap = metric.getValue();
								String strPOPMode = strMetricName.toUpperCase().replace(metricPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getName()+"__", "");
								for(Object item : page.getContent()) {
									if(item instanceof IEntityDTO) {
										IEntityDTO iEntityDTO = (IEntityDTO)item;
										Long nTime = timeMap.get(item);
										if(nTime == null) {
											continue;
										}
										Object objValue = getPOPMetricValue(metricMap, nTime, metricPSDERAggDataDEFieldMap, strPOPMode);
										iEntityDTO.set(strMetricName, objValue);
									}
								}
								
							}
						}
					}
				}
			}
		}
		
		return result;
	}
	
	protected Long getEntityTime(IEntityDTO iEntityDTO) throws Throwable{
		
		IPSDERAggDataDEFieldMap yearPSDERAggDataDEFieldMap = timeGroupPSDERAggDataDEFieldMapMap.get(DERAggDataDEFMapTypes.GROUPBY_YEAR);
		if(yearPSDERAggDataDEFieldMap == null) {
			return null;
		}
		
		Object objYear = iEntityDTO.get(yearPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName());
		int nYear = DataTypeUtils.getIntegerValue(objYear, -1);
		if(nYear == -1) {
			return null;
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(nYear, 0, 1, 0, 0, 0);

		int nMonth = -1;
		int nDay = -1;
		for(String strGroupTag : timeGroupList) {
			if(DERAggDataDEFMapTypes.GROUPBY_YEAR.equals(strGroupTag)) {
				continue;
			}
			IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap = timeGroupPSDERAggDataDEFieldMapMap.get(strGroupTag);
			if(iPSDERAggDataDEFieldMap == null) {
				continue;
			}
			Object objValue = iEntityDTO.get(iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName());
			int nValue  = DataTypeUtils.getIntegerValue(objValue, -1);
			if(nValue == -1) {
				return null;
			}
			
			if(DERAggDataDEFMapTypes.GROUPBY_QUARTER.equals(strGroupTag)) {
				nMonth = (nValue - 1)*3 + 1;
				continue;
			}
			
			if(DERAggDataDEFMapTypes.GROUPBY_MONTH.equals(strGroupTag)) {
				nMonth = nValue;
				continue;
			}
			
			if(DERAggDataDEFMapTypes.GROUPBY_DAYOFMONTH.equals(strGroupTag)) {
				nDay = nValue;
				continue;
			}
		}
		
		if(nMonth != -1) {
			calendar.set(Calendar.MONTH, nMonth - 1);
		}
		
		if(nDay != -1) {
			calendar.set(Calendar.DAY_OF_MONTH, nDay);
		}
		
		return calendar.getTimeInMillis();
	}
	
	protected Object getPOPMetricValue(Map<String, Object> metricMap, long nTime, IPSDERAggDataDEFieldMap metricPSDERAggDataDEFieldMap, String strPOPMode) {
		
		//计算标准时间
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(nTime);
		
		if("YOY".equals(strPOPMode)) {
			//上一年
			calendar.add(Calendar.YEAR, -1);
		}
		else
			if("POP".equals(strPOPMode)) {
				String strLastGroup = timeGroupList.get(timeGroupList.size() - 1);
				if(DERAggDataDEFMapTypes.GROUPBY_YEAR.equals(strLastGroup)) {
					calendar.add(Calendar.YEAR, -1);
				}
				else
				if(DERAggDataDEFMapTypes.GROUPBY_QUARTER.equals(strLastGroup)) {
					calendar.add(Calendar.MONTH, -3);
				}
				else
				if(DERAggDataDEFMapTypes.GROUPBY_MONTH.equals(strLastGroup)) {
					calendar.add(Calendar.MONTH, -1);
				}
				else
				if(DERAggDataDEFMapTypes.GROUPBY_DAYOFMONTH.equals(strLastGroup)) {
					calendar.add(Calendar.DAY_OF_MONTH, -1);
				}
				else
					return null;
			}
			else {
				return null;
			}
		
		String strMetricName = metricPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName();
		StringBuilder sb = new StringBuilder();
		for(String strGroupTag : this.timeGroupList) {
			IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap = timeGroupPSDERAggDataDEFieldMapMap.get(strGroupTag);
			if(iPSDERAggDataDEFieldMap == null) {
				continue;
			}
			Object objValue = null;
			if(DERAggDataDEFMapTypes.GROUPBY_YEAR.equals(strGroupTag)) {
				objValue = calendar.get(Calendar.YEAR);
			}
			else
			if(DERAggDataDEFMapTypes.GROUPBY_QUARTER.equals(strGroupTag)) {
				int nMonth = calendar.get(Calendar.MONTH ) + 1;
				objValue = (nMonth - 1) /3 + 1;
			}
			else
			if(DERAggDataDEFMapTypes.GROUPBY_MONTH.equals(strGroupTag)) {
				objValue = calendar.get(Calendar.MONTH ) + 1;
			}
			else
			if(DERAggDataDEFMapTypes.GROUPBY_DAYOFMONTH.equals(strGroupTag)) {
				objValue = calendar.get(Calendar.DAY_OF_MONTH);
			}
			else
				return null;
			
			sb.append(String.format("%1$s|", objValue));
		}
		sb.append(strMetricName);
		
		return metricMap.get(sb.toString());
		
	}
	
	protected void fillMetricMap(Map<String, Object> metricMap, IEntityDTO iEntityDTO, IPSDERAggDataDEFieldMap metricPSDERAggDataDEFieldMap) {
		String strMetricName = metricPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName();
		StringBuilder sb = new StringBuilder();
		for(String strGroupTag : this.timeGroupList) {
			IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap = timeGroupPSDERAggDataDEFieldMapMap.get(strGroupTag);
			if(iPSDERAggDataDEFieldMap == null) {
				continue;
			}
			Object objValue = iEntityDTO.get(iPSDERAggDataDEFieldMap.getMajorPSDEFieldMust().getLowerCaseName());
			sb.append(String.format("%1$s|", objValue));
		}
		sb.append(strMetricName);
		metricMap.put(sb.toString(), iEntityDTO.get(strMetricName));
	}

	@Override
	public IPSDEDataSetGroupParam getPSDEDataSetGroupParam(String strName, boolean bTryMode) {
		Assert.notNull(strName, "传入分组参数名称无效");
		IPSDEDataSetGroupParam iPSDEDataSetGroupParam = null;
		if(this.psDEDataSetGroupParamMap != null) {
			iPSDEDataSetGroupParam = this.psDEDataSetGroupParamMap.get(strName.toUpperCase());
		}
		if(iPSDEDataSetGroupParam != null || bTryMode) {
			return iPSDEDataSetGroupParam;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法获取指定分组参数[%1$s]", strName));
	}

	@Override
	public IPSDERAggDataDEFieldMap getPSDERAggDataDEFieldMapByMajorField(String strName, boolean bTryMode) {
		Assert.notNull(strName, "传入主属性名称无效");
		IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap = null;
		if(this.psDEDataSetGroupParamMap != null) {
			iPSDERAggDataDEFieldMap = this.psDERAggDataDEFieldMapMap.get(strName.toUpperCase());
		}
		if(iPSDERAggDataDEFieldMap != null || bTryMode) {
			return iPSDERAggDataDEFieldMap;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法获取指定聚合数据关系属性映射[%1$s]", strName));
	}

	@Override
	public boolean hasPSDEDataSetGroupParams() {
		return ObjectUtils.isEmpty(this.psDEDataSetGroupParamMap);
	}
	
	
	 
}
