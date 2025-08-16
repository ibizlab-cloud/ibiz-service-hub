package net.ibizsys.central.cloud.report.grafana.addin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.report.core.addin.ReportDataSourceBase;
import net.ibizsys.central.cloud.report.grafana.util.GrafanaUtils;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.codelist.ICodeListRuntime;

public class GrafanaDataSource extends ReportDataSourceBase {

	private static final Log log = LogFactory.getLog(GrafanaDataSource.class);
	
	@Override
	protected Object onExecuteAction(String strAction, Object params) throws Throwable {
		
		if(GrafanaUtils.ACTION_QUERY.equalsIgnoreCase(strAction)) {
			return this.doExecuteQuery(params);
		}
		
		
		log.warn(String.format("无法识别的操作[%1$s]", strAction));
		
		return null;
	}
	
	
	protected Object doExecuteQuery(Object params) throws Throwable {
		
		Map body = null;
		if(params instanceof Map) {
			body = (Map)params;
		}
		
		List targetList = GrafanaUtils.getQueryTargets(body);
		if(targetList == null) {
			throw new Exception("未指定查询目标集合");
		}
		
		List<Object> totalList = new ArrayList<Object>();
		
		for(Object target : targetList) {
			
			Map targetMap = (Map)target;
			String strType = GrafanaUtils.getQueryTargetType(targetMap);
			String strTarget = GrafanaUtils.getQueryTarget(targetMap);
					
			//分解
//			int nPos = strTarget.indexOf("://");
//			if(nPos <= 0) {
//				throw new Exception("未指定目标类型");
//			}
//			
//			String strProtocol = strTarget.substring(0, nPos);
//			strTarget = strTarget.substring(nPos + 3);
//			
//			nPos = strTarget.indexOf("/");
//			if(nPos <= 0) {
//				throw new Exception("未指定目标系统");
//			}
			
			String[] parts = strTarget.split("[?]");
			String strPath = parts[0];
			String strQuery = null;
			
			if(parts.length>1) {
				strQuery = parts[1];
			}
			
			String[] paths = strPath.toLowerCase().split("[/]");
			if(paths.length < 4) {
				throw new Exception(String.format("目标路径[%1$s]不正确", strPath));
			}
			
			String strServiceId = String.format("lb://%1$s-%2$s", paths[0], paths[1]);
			
			String strServiceUrl = "";
			for(int i = 0; i<paths.length;i++) {
				strServiceUrl += "/";
				strServiceUrl += paths[i];
			}
			
			//根据类型返回结果
			if(GrafanaUtils.TARGETTYPE_TABLE.equalsIgnoreCase(strType)){
				
				Map<String, Object> paramMap = RestUtils.queryString2Map(strQuery, false);
				String strColumns = (String)paramMap.remove(GrafanaUtils.PARAM_PSDEDATASET_COLUMNS);
				if(!StringUtils.hasLength(strColumns)) {
					throw new Exception("未指定查询列");
				}
//				if(!StringUtils.hasLength(strColumns) && iDataEntityRuntime.getMajorPSDEField()!=null) {
//					strColumns = iDataEntityRuntime.getMajorPSDEField().getLowerCaseName();
//				}
				
				String[] columns = strColumns.toLowerCase().split("[,]");
				
				Map<String, ICodeListRuntime> columnMap = new LinkedHashMap<String, ICodeListRuntime>();
				for(String strColumn :  columns) {
					columnMap.put(strColumn.trim(), null);
				}
				
				
				IWebClientRep<String> rep = this.getContext().executeCloudServiceCall(strServiceId, strServiceUrl, paramMap, String.class, paths[0]);
				String strRet = rep.getBody();
				//解析包
				Map<String, Object> ret = new LinkedHashMap<String, Object>();
				List<Map> columnsList = new ArrayList<Map>();
				List<List> rowsList = new ArrayList<List>();
				
				ret.put("columns", columnsList);
				ret.put("rows", rowsList);
				ret.put("type", "table");
				
				for(String strColumn :  columns) {
					Map<String, String> map = new LinkedHashMap<String, String>();
					map.put("text", strColumn);
					//map.put("type", "string");
					columnsList.add(map);
				}
				
				
				
				if(StringUtils.hasLength(strRet)) {
					List list = this.getSystemRuntime().deserialize(strRet, List.class);
					for(Object item : list) {
						if(!(item instanceof Map)) {
							continue;
						}
						
						Map map = (Map)item;
						
						List<Object> row = new ArrayList<Object>();
						for(String strColumn :  columns) {
							Object value = map.get(strColumn);
							row.add(value);
						}
						
						rowsList.add(row);
					}
				}
				
				totalList.add(ret);
				//return Arrays.asList(ret);
	
			}
//			{
//			    "columns":[
//			      {"text":"Time","type":"time"},
//			      {"text":"Country","type":"string"},
//			      {"text":"Number","type":"number"}
//			    ],
//			    "rows":[
//			      [1234567,"SE",123],
//			      [1234567,"DE",231],
//			      [1234567,"US",321]
//			    ],
//			    "type":"table"
//			  }
			
			
		}
		
		if(totalList.size() == 0) {
			return null;
		}
		return totalList;
		
	}
}
