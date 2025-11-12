package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICube;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICubeItemType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.plugin.extension.sysutil.ISysDEBIReportProxyUtilRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DashboardScope;
import net.ibizsys.model.PSModelEnums.ReportType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.bi.IPSAppBICube;
import net.ibizsys.model.app.bi.IPSAppBICubeDimension;
import net.ibizsys.model.app.bi.IPSAppBICubeMeasure;
import net.ibizsys.model.app.bi.IPSAppBIReport;
import net.ibizsys.model.app.bi.IPSAppBIReportDimension;
import net.ibizsys.model.app.bi.IPSAppBIReportMeasure;
import net.ibizsys.model.app.bi.IPSAppBIScheme;
import net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl;
import net.ibizsys.model.app.bi.PSAppBICubeImpl;
import net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl;
import net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl;
import net.ibizsys.model.app.bi.PSAppBIReportMeasureImpl;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.control.dashboard.PSDBReportPortletPartImpl;
import net.ibizsys.model.control.reportpanel.PSDEReportPanelImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.model.dataentity.report.PSDEReportImpl;
import net.ibizsys.model.util.transpiler.extend.app.control.PSAppPortletListTranspilerEx;
import net.ibizsys.psmodel.core.domain.PSAppPortlet;
import net.ibizsys.psmodel.core.domain.PSSysBIReport;
import net.ibizsys.psmodel.core.domain.PSSysPortlet;
import net.ibizsys.psmodel.core.filter.PSAppPortletFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public class PSAppPortletRTService extends net.ibizsys.psmodel.runtime.service.PSAppPortletRTService {
	
	private static final Log log = LogFactory.getLog(PSAppPortletRTService.class);
	
	@Override
	protected PSAppPortlet doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSSysAppId = getParentId(key);
			String strSimpleId = PSModelUtils.getSimpleId(key);
			if(strSimpleId.indexOf("uxbireport") == 0){
				IPSApplication iPSApplication = ExtensionUtils.getPSApplication(iExtensionPSModelRTServiceSession, iExtensionPSModelRTServiceSession.getPSSystem(), strPSSysAppId, true, true);
				if(iPSApplication != null) {
					List<PSAppPortlet> list= getBIReportPortlets(iPSApplication);
					if(!ObjectUtils.isEmpty(list)) {
						for(PSAppPortlet item : list) {
							if(key.equalsIgnoreCase(item.getId())) {
								return item;
							}
						}
					}
				}
			}
			
		}
		
		return super.doGet(key, tryMode);
	}
	
	protected List<PSAppPortlet> getBIReportPortlets(IPSApplication iPSApplication) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		
		ISysDEBIReportProxyUtilRuntime iSysDEBIReportProxyUtilRuntime = iExtensionPSModelRTServiceSession.getSystemRuntime().getSysUtilRuntime(ISysDEBIReportProxyUtilRuntime.class, true);
		
		List<PSAppPortlet> list = new ArrayList<>();
		
		Map<String, IPSAppBIScheme> psAppBISchemeMap = new LinkedHashMap<String, IPSAppBIScheme>();
		
		Map<String, IPSAppBICube> psAppBICubeMap = new LinkedHashMap<String, IPSAppBICube>();
		
		List<IPSAppBIScheme> psAppBISchemes = iPSApplication.getAllPSAppBISchemes();
		if(!ObjectUtils.isEmpty(psAppBISchemes)) {
			for(IPSAppBIScheme iPSAppBIScheme : psAppBISchemes) {
				String strBISchemeId = iPSAppBIScheme.getUniqueTag().replace("__", ".");
			
				psAppBISchemeMap.put(strBISchemeId, iPSAppBIScheme);
				
				if(!ObjectUtils.isEmpty(iPSAppBIScheme.getPSAppBICubes())){
					for(IPSAppBICube iPSAppBICube : iPSAppBIScheme.getPSAppBICubes()) {
						psAppBICubeMap.put(String.format("%1$s.%2$s", strBISchemeId, iPSAppBICube.getCodeName()), iPSAppBICube);
					}
				}
			}
		}
		
		IPSAppDataEntity deBIPrintProxyPSAppDataEntity = null;
		if(iSysDEBIReportProxyUtilRuntime != null && iSysDEBIReportProxyUtilRuntime.getProxyPSDataEntity() != null) {
			deBIPrintProxyPSAppDataEntity = ExtensionUtils.getPSAppDataEntity(iExtensionPSModelRTServiceSession, iPSApplication, iSysDEBIReportProxyUtilRuntime.getProxyPSDataEntity(), true);
		}
		
//		SearchContextDTO searchContextDTO = new SearchContextDTO();
//		searchContextDTO.all();
//		
//		//全部查询报表相关（需要其它数据进行模型补充）
//		searchContextDTO.eq(V2SystemExtensionBICube.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.BICUBE.value);
//		searchContextDTO.nn(V2SystemExtensionBICube.FIELD_RUNTIME_MODEL);
//		//searchContextDTO.eq(V2SystemExtensionBICube.FIELD_BI_CUBE_TAG, strPSSysBICubeId);
//		//searchContextDTO.eq(V2SystemExtensionBICube.FIELD_TYPE, V2SystemExtensionBICubeItemType.BIREPORT.value);
		
		
		List<V2SystemExtensionBICube> all = iExtensionPSModelRTServiceSession.getSysCloudExtensionUtilRuntime().getSystemExtensionBICubes(iExtensionPSModelRTServiceSession.getExtensionId());
		if(!ObjectUtils.isEmpty(all)) {
//			List<PSSysBIReport> psSysBIReportList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionBICube.FIELD_ITEM_TAG, PSSysBIReport.class);
//			list = ExtensionUtils.replacePSModelList(list, psSysBIReportList, PSSysBIReport.class);
			//提取维度和指标 
			Map<String, V2SystemExtensionBICube> v2SystemExtensionBICubeMap = new HashMap<String, V2SystemExtensionBICube>();
			for(V2SystemExtensionBICube v2SystemExtensionBICube : all) {
				if(!StringUtils.hasLength(v2SystemExtensionBICube.getItemTag())
						|| !StringUtils.hasLength(v2SystemExtensionBICube.getRuntimeModel())) {
					continue;
				}
				if(V2SystemExtensionBICubeItemType.MEASURE.value.equals(v2SystemExtensionBICube.getType())
						|| V2SystemExtensionBICubeItemType.DIMENSION.value.equals(v2SystemExtensionBICube.getType())) {
					v2SystemExtensionBICubeMap.put(v2SystemExtensionBICube.getItemTag(), v2SystemExtensionBICube);
				}
			}
			
			//仿真门户部件
			for(V2SystemExtensionBICube v2SystemExtensionBICube : all) {
				
				if(!StringUtils.hasLength(v2SystemExtensionBICube.getItemTag())
						|| !StringUtils.hasLength(v2SystemExtensionBICube.getRuntimeModel())
						|| !StringUtils.hasLength(v2SystemExtensionBICube.getExtensionModel())) {
					continue;
				}
				
				if(!V2SystemExtensionBICubeItemType.BIREPORT.value.equals(v2SystemExtensionBICube.getType())) {
					continue;
				}	
				
				IPSAppBIScheme iPSAppBIScheme = psAppBISchemeMap.get(v2SystemExtensionBICube.getBISchemeTag());
				if(iPSAppBIScheme == null) {
					continue;
				}
				
				IPSAppBICube iPSAppBICube = psAppBICubeMap.get(v2SystemExtensionBICube.getBICubeTag());
				if(iPSAppBICube == null) {
					continue;
				}
				
				PSSysBIReport psSysBIReport = JsonUtils.as(v2SystemExtensionBICube.getExtensionModel(), PSSysBIReport.class);
				ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSAppBIReport.class, false).compile(iExtensionPSModelRTServiceSession, psSysBIReport, null);
				
//				objectNode.remove(PSAppBIReportImpl.ATTR_GETPSAPPBICUBE);
//				if(StringUtils.hasLength(psSysBIReport.getPSSysBICubeId())) {
//					ObjectNode refNode = objectNode.putObject(PSAppBIReportImpl.ATTR_GETPSAPPBICUBE);
//					refNode.put("modelref", true);
//					refNode.put("id", PSModelUtils.getSimpleId(psSysBIReport.getPSSysBICubeId()));
//				}
				
				IPSAppBIReport iPSAppBIReport = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSAppBIScheme, IPSAppBIReport.class, objectNode);
				//进一步填充
				List<IPSAppBIReportDimension> psAppBIReportDimensionList = iPSAppBIReport.getPSAppBIReportDimensions();
				if(!ObjectUtils.isEmpty(psAppBIReportDimensionList)) {
					for(IPSAppBIReportDimension item : psAppBIReportDimensionList) {
						//获取相关维度
						String strTag = item.getDimensionTag();
						if(!StringUtils.hasLength(strTag)) {
							continue;
						}
						
						IPSAppBICubeDimension iPSAppBICubeDimension = iPSAppBICube.getPSAppBICubeDimension(strTag, true);
						if(iPSAppBICubeDimension == null) {
							V2SystemExtensionBICube dimension = v2SystemExtensionBICubeMap.get(String.format("%1$s.%2$s", v2SystemExtensionBICube.getBICubeTag(), strTag));
							if(dimension != null) {
								iPSAppBICubeDimension = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSAppBICube, IPSAppBICubeDimension.class, JsonUtils.toObjectNode(dimension.getRuntimeModel()));
							}
						}
						if(iPSAppBICubeDimension == null) {
							log.error(String.format("无法获取应用智能报表立方体维度[%1$s.%2$s]", v2SystemExtensionBICube.getBICubeTag(), strTag));
							continue;
						}
						
						item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONTYPE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETDIMENSIONTYPE));
						if(iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETPSAPPCODELIST)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETPSAPPCODELIST, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETPSAPPCODELIST).deepCopy());
						}
						if(iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETPSAPPDEFIELD)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETPSAPPDEFIELD, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETPSAPPDEFIELD).deepCopy());
						}
						if(iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETTEXTPSAPPDEFIELD)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETTEXTPSAPPDEFIELD, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETTEXTPSAPPDEFIELD).deepCopy());
						}
						if(iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETDIMENSIONFORMULA)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONFORMULA, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETDIMENSIONFORMULA).deepCopy());
						}
						
						if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETNAME)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETDIMENSIONNAME, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETNAME).deepCopy());
						}
						
						if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETTEXTTEMPLATE)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETTEXTTEMPLATE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETTEXTTEMPLATE).deepCopy());
						}
						
						if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETTIPTEMPLATE)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETTIPTEMPLATE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETTIPTEMPLATE).deepCopy());
						}
						
						if (iPSAppBICubeDimension.getObjectNode().has(PSAppBICubeDimensionImpl.ATTR_GETSTDDATATYPE)) {
							item.getObjectNode().put(PSAppBIReportDimensionImpl.ATTR_GETSTDDATATYPE, iPSAppBICubeDimension.getObjectNode().get(PSAppBICubeDimensionImpl.ATTR_GETSTDDATATYPE).deepCopy());
						}
					}
				}
				
				List<IPSAppBIReportMeasure> psAppBIReportMeasureList = iPSAppBIReport.getPSAppBIReportMeasures();
				if(!ObjectUtils.isEmpty(psAppBIReportMeasureList)) {
					for(IPSAppBIReportMeasure item : psAppBIReportMeasureList) {
						//获取相关指标
						String strTag = item.getMeasureTag();
						if(!StringUtils.hasLength(strTag)) {
							continue;
						}
						
						IPSAppBICubeMeasure iPSAppBICubeMeasure = iPSAppBICube.getPSAppBICubeMeasure(strTag, true);
						if(iPSAppBICubeMeasure == null) {
							V2SystemExtensionBICube Measure = v2SystemExtensionBICubeMap.get(String.format("%1$s.%2$s", v2SystemExtensionBICube.getBICubeTag(), strTag));
							if(Measure != null) {
								iPSAppBICubeMeasure = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSAppBICube, IPSAppBICubeMeasure.class, JsonUtils.toObjectNode(Measure.getRuntimeModel()));
							}
						}
						if(iPSAppBICubeMeasure == null) {
							log.error(String.format("无法获取应用智能报表立方体指标[%1$s.%2$s]", v2SystemExtensionBICube.getBICubeTag(), strTag));
							continue;
						}
						
						item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASURETYPE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETMEASURETYPE));
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETPSAPPCODELIST)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETPSAPPCODELIST, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETPSAPPCODELIST).deepCopy());
						}
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETDRILLDOWNPSAPPVIEW)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETDRILLDOWNPSAPPVIEW, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETDRILLDOWNPSAPPVIEW).deepCopy());
						}
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW).deepCopy());
						}
						else
							if(iPSAppBICube.getObjectNode().has(PSAppBICubeImpl.ATTR_GETDRILLDETAILPSAPPVIEW)) {
								item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETDRILLDETAILPSAPPVIEW, iPSAppBICube.getObjectNode().get(PSAppBICubeImpl.ATTR_GETDRILLDETAILPSAPPVIEW).deepCopy());
							}
						
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETPSAPPDEFIELD)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETPSAPPDEFIELD, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETPSAPPDEFIELD).deepCopy());
						}
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETMEASUREFORMULA)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASUREFORMULA, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETMEASUREFORMULA).deepCopy());
						}
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETMEASUREGROUP)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASUREGROUP, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETMEASUREGROUP).deepCopy());
						}
						if(iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETJSONFORMAT)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETJSONFORMAT, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETJSONFORMAT).deepCopy());
						}
						
						if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETNAME)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETMEASURENAME, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETNAME).deepCopy());
						}
						
						if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETTEXTTEMPLATE)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETTEXTTEMPLATE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETTEXTTEMPLATE).deepCopy());
						}
						
						if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETTIPTEMPLATE)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETTIPTEMPLATE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETTIPTEMPLATE).deepCopy());
						}
						
						if (iPSAppBICubeMeasure.getObjectNode().has(PSAppBICubeMeasureImpl.ATTR_GETSTDDATATYPE)) {
							item.getObjectNode().put(PSAppBIReportMeasureImpl.ATTR_GETSTDDATATYPE, iPSAppBICubeMeasure.getObjectNode().get(PSAppBICubeMeasureImpl.ATTR_GETSTDDATATYPE).deepCopy());
						}
					}
				}
				
				IPSDEReport iPSDEReport = null;
				if(deBIPrintProxyPSAppDataEntity != null) {
					List<IPSDEReport> psDEReportList = deBIPrintProxyPSAppDataEntity.getPSDataEntityMust().getAllPSDEReports();
					if(!ObjectUtils.isEmpty(psDEReportList)) {
						for(IPSDEReport item : psDEReportList) {
							if(item.getPSSysBIScheme() == null) {
								continue;
							}
							
							if(item.getPSSysBIScheme().getUniqueTag().equalsIgnoreCase(iPSAppBIScheme.getUniqueTag())) {
								iPSDEReport = item;
								if(ReportType.ALLSYSBIREPORTS.value.equals(iPSDEReport.getReportType())) {
									break;
								}
							}
						}
					}
				}
				else {
					IPSDataEntity iPSDataEntity = iPSAppBICube.getPSAppDataEntity().getPSDataEntity();
					if(iPSDataEntity!=null) {
						List<IPSDEReport> psDEReportList = iPSDataEntity.getAllPSDEReports();
						if(!ObjectUtils.isEmpty(psDEReportList)) {
							for(IPSDEReport item : psDEReportList) {
								if(item.getPSSysBIScheme() == null) {
									continue;
								}
								
								if(item.getPSSysBIScheme().getUniqueTag().equalsIgnoreCase(iPSAppBIScheme.getUniqueTag())) {
									iPSDEReport = item;
									break;
								}
							}
						}
					}
				}
				
				ObjectNode appDEReportNode = JsonUtils.createObjectNode();
				if(iPSDEReport != null) {
					appDEReportNode.put(PSDEReportImpl.ATTR_GETCODENAME, iPSDEReport.getCodeName());
					appDEReportNode.put(PSDEReportImpl.ATTR_GETNAME, iPSDEReport.getName());
				}
				else {
					appDEReportNode.put(PSDEReportImpl.ATTR_GETCODENAME, iPSAppBIReport.getCodeName());
					appDEReportNode.put(PSDEReportImpl.ATTR_GETNAME, iPSAppBIReport.getName());
				}
				
				appDEReportNode.put(PSDEReportImpl.ATTR_GETREPORTTYPE, ReportType.SYSBIREPORT.value);
				ObjectNode appBISchemeNodeRefNode = appDEReportNode.putObject(PSDEReportImpl.ATTR_GETPSAPPBISCHEME);
				appBISchemeNodeRefNode.put("modelref", true);
				appBISchemeNodeRefNode.put("path", iPSAppBIScheme.getDynaModelFilePath());
				appDEReportNode.put(PSDEReportImpl.ATTR_GETPSAPPBIREPORT, iPSAppBIReport.getObjectNode().deepCopy());
				
				String strPortletCodeName = String.format("uxbireport__%1$s", v2SystemExtensionBICube.getItemTag().replace(".", "__")).toLowerCase(); 
				
				ObjectNode reportPanelNode = JsonUtils.createObjectNode();
				
				String strPortletPanelCodeName = String.format("%1$s__panel", strPortletCodeName); 
				
				reportPanelNode.put(PSDEReportPanelImpl.ATTR_GETCODENAME, strPortletPanelCodeName);
				reportPanelNode.put(PSDEReportPanelImpl.ATTR_GETNAME, strPortletPanelCodeName);
				reportPanelNode.put(PSDEReportPanelImpl.ATTR_GETCONTROLTYPE, "REPORTPANEL");
				
				if(deBIPrintProxyPSAppDataEntity != null) {
					ObjectNode appDataEntityRefNode = reportPanelNode.putObject(PSDEReportPanelImpl.ATTR_GETPSAPPDATAENTITY);
					appDataEntityRefNode.put("modelref", true);
					appDataEntityRefNode.put("path", deBIPrintProxyPSAppDataEntity.getDynaModelFilePath());
				}
				else {
					if(iPSAppBICube.getObjectNode().has(PSAppBICubeImpl.ATTR_GETPSAPPDATAENTITY)) {
						reportPanelNode.put(PSDEReportPanelImpl.ATTR_GETPSAPPDATAENTITY, iPSAppBICube.getObjectNode().get(PSAppBICubeImpl.ATTR_GETPSAPPDATAENTITY).deepCopy());
					}
				}
				
				reportPanelNode.put(PSDEReportPanelImpl.ATTR_GETPSAPPDEREPORT, appDEReportNode);
				
				
				ObjectNode portletNode = JsonUtils.createObjectNode();
				portletNode.put(PSDBReportPortletPartImpl.ATTR_GETCODENAME, strPortletCodeName);
				portletNode.put(PSDBReportPortletPartImpl.ATTR_GETNAME, strPortletCodeName);
				portletNode.put(PSDBReportPortletPartImpl.ATTR_GETPORTLETTYPE, "REPORT");
				portletNode.put(PSDBReportPortletPartImpl.ATTR_GETCONTROLTYPE, "PORTLET");
				portletNode.put(PSDBReportPortletPartImpl.ATTR_GETLOGICNAME, iPSAppBIReport.getName());
				portletNode.put(PSDBReportPortletPartImpl.ATTR_ISSHOWTITLEBAR, true);
				portletNode.put(PSDBReportPortletPartImpl.ATTR_GETTITLE, iPSAppBIReport.getName());
				
				if(iPSAppBICube.getObjectNode().has(PSAppBICubeImpl.ATTR_GETPORLETPSUIACTIONGROUP)) {
					portletNode.put(PSDBReportPortletPartImpl.ATTR_GETPSUIACTIONGROUP, iPSAppBICube.getObjectNode().get(PSAppBICubeImpl.ATTR_GETPORLETPSUIACTIONGROUP).deepCopy());
				}
				
				if(deBIPrintProxyPSAppDataEntity != null) {
					ObjectNode appDataEntityRefNode = portletNode.putObject(PSDBReportPortletPartImpl.ATTR_GETPSAPPDATAENTITY);
					appDataEntityRefNode.put("modelref", true);
					appDataEntityRefNode.put("path", deBIPrintProxyPSAppDataEntity.getDynaModelFilePath());
				}
				else {
					if(iPSAppBICube.getObjectNode().has(PSAppBICubeImpl.ATTR_GETPSAPPDATAENTITY)) {
						portletNode.put(PSDBReportPortletPartImpl.ATTR_GETPSAPPDATAENTITY, iPSAppBICube.getObjectNode().get(PSAppBICubeImpl.ATTR_GETPSAPPDATAENTITY).deepCopy());
					}
				}
				
				
				ArrayNode psControlsNode = portletNode.putArray(PSDBReportPortletPartImpl.ATTR_GETPSCONTROLS);
				psControlsNode.add(reportPanelNode);
				
				ObjectNode psControlRefNode = portletNode.putObject(PSDBReportPortletPartImpl.ATTR_GETCONTENTPSCONTROL);
				psControlRefNode.put("modelref", true);
				psControlRefNode.put("id", strPortletCodeName);
				
				PSAppPortlet psAppPortlet = new PSAppPortlet();
				psAppPortlet.setId(String.format("%1$s.%2$s", iPSApplication.getCodeName(), strPortletCodeName));
				psAppPortlet.setCodeName(strPortletCodeName);
				psAppPortlet.setName(iPSAppBIReport.getName());
				psAppPortlet.setPSSysAppId(iPSApplication.getCodeName());
				
				psAppPortlet.set(PSAppPortletListTranspilerEx.FIELD_CATUNIQUETAG, "Ungroup");
				psAppPortlet.set(PSSysPortlet.FIELD_DASHBOARDSCOPE,  DashboardScope.APP.value|DashboardScope.DE.value);
				psAppPortlet.set(PSSysPortlet.FIELD_PORTLETTYPE, "REPORT");
				
				String strControlModelDigest = KeyValueUtils.genUniqueId(portletNode.toString());
				psAppPortlet.set(PSAppPortletListTranspilerEx.FIELD_CONTROLMODELDIGEST, strControlModelDigest);
				
				//写入模型
				portletNode.put(PSAppPortletListTranspilerEx.FIELD_CONTROLMODELDIGEST, strControlModelDigest);
				
				psAppPortlet.set(PSAppPortletListTranspilerEx.FIELD_CONTROLMODEL, portletNode.toString());
				if(deBIPrintProxyPSAppDataEntity != null) {
					psAppPortlet.setPSAppDataEntityId(PSModelUtils.calcFullUniqueTag2(deBIPrintProxyPSAppDataEntity));
					psAppPortlet.setPSAppDataEntityName(deBIPrintProxyPSAppDataEntity.getName());
				}
				else {
					psAppPortlet.setPSAppDataEntityId(PSModelUtils.calcFullUniqueTag2(iPSAppBICube.getPSAppDataEntityMust()));
					psAppPortlet.setPSAppDataEntityName(iPSAppBICube.getPSAppDataEntityMust().getName());
				}
				
				psAppPortlet.set("psdynainstid", v2SystemExtensionBICube.getId());
				psAppPortlet.set("dynamodelflag", 1);
				
				
				list.add(psAppPortlet);
			}
			
		}
		return list;
	}
	
	@Override
	protected List<PSAppPortlet> getDomainList(String strDataSetName, PSAppPortletFilter f) throws Exception {
		List<PSAppPortlet> list = super.getDomainList(strDataSetName, f);
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}
		
		IPSApplication iPSApplication = null;
		Object objPSSysAppId = f.getFieldCond(PSAppPortlet.FIELD_PSSYSAPPID, IPSModelFilter.EQ);
		if(ObjectUtils.isEmpty(objPSSysAppId)) {
    		objPSSysAppId  = getParentId(f, PSModels.PSSYSAPP);
		}
    	if(!ObjectUtils.isEmpty(objPSSysAppId)) {
    		iPSApplication = ExtensionUtils.getPSApplication(iExtensionPSModelRTServiceSession, iExtensionPSModelRTServiceSession.getPSSystem(), objPSSysAppId.toString(), true);
    	}
	
		if(iPSApplication != null) {
			List<PSAppPortlet> list2 = getBIReportPortlets(iPSApplication);
			if(!ObjectUtils.isEmpty(list2)) {
				list.addAll(list2);
			}
		}
		return this.filterDomainList(list, strDataSetName, f) ;		
	}
	
	
	@Override
	protected Page<PSAppPortlet> doFetch(String strDataSetName, PSAppPortletFilter f) throws Exception {
		Page<PSAppPortlet> page = super.doFetch(strDataSetName, f);
		if(ObjectUtils.isEmpty(page) || ObjectUtils.isEmpty(page.getContent())) {
			return page;
		}
		
		for(PSAppPortlet psAppPortlet : page) {
			psAppPortlet.reset(PSAppPortletListTranspilerEx.FIELD_CONTROLMODEL);
		}
		
		return page;
	}

}
