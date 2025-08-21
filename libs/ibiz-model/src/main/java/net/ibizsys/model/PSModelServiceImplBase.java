package net.ibizsys.model;
import org.springframework.util.StringUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


@SuppressWarnings("unchecked")
public abstract class PSModelServiceImplBase extends PSModelServiceImplBaseBase {

	protected <T> T onCreatePSModelObject(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		if(cls.equals(net.ibizsys.model.ai.IPSSysAIChatAgent.class)){
			T t = createIPSSysAIChatAgent(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ai.IPSSysAIChatAgent)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ai.IPSSysAIFactory.class)){
			T t = createIPSSysAIFactory(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ai.IPSSysAIFactory)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ai.IPSSysAIPipelineAgent.class)){
			T t = createIPSSysAIPipelineAgent(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ai.IPSSysAIPipelineAgent)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ai.IPSSysAIPipelineJob.class)){
			T t = createIPSSysAIPipelineJob(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ai.IPSSysAIPipelineJob)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ai.IPSSysAIPipelineWorker.class)){
			T t = createIPSSysAIPipelineWorker(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ai.IPSSysAIPipelineWorker)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ai.IPSSysAIWorkerAgent.class)){
			T t = createIPSSysAIWorkerAgent(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ai.IPSSysAIWorkerAgent)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.appmenu.IPSAppMenuModel.class)){
			T t = createIPSAppMenuModel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.appmenu.IPSAppMenuModel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBICube.class)){
			T t = createIPSAppBICube(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBICube)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBICubeDimension.class)){
			T t = createIPSAppBICubeDimension(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBICubeDimension)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBICubeHierarchy.class)){
			T t = createIPSAppBICubeHierarchy(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBICubeHierarchy)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBICubeLevel.class)){
			T t = createIPSAppBICubeLevel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBICubeLevel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBICubeMeasure.class)){
			T t = createIPSAppBICubeMeasure(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBICubeMeasure)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBIReport.class)){
			T t = createIPSAppBIReport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBIReport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBIReportDimension.class)){
			T t = createIPSAppBIReportDimension(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBIReportDimension)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBIReportMeasure.class)){
			T t = createIPSAppBIReportMeasure(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBIReportMeasure)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.bi.IPSAppBIScheme.class)){
			T t = createIPSAppBIScheme(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.bi.IPSAppBIScheme)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.codelist.IPSAppCodeList.class)){
			T t = createIPSAppCodeList(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.codelist.IPSAppCodeList)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.control.IPSAppCounter.class)){
			T t = createIPSAppCounter(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.control.IPSAppCounter)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.control.IPSAppCounterRef.class)){
			T t = createIPSAppCounterRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.control.IPSAppCounterRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.control.IPSAppPortlet.class)){
			T t = createIPSAppPortlet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.control.IPSAppPortlet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.control.IPSAppPortletCat.class)){
			T t = createIPSAppPortletCat(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.control.IPSAppPortletCat)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEACMode.class)){
			T t = createIPSAppDEACMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEACMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEAction.class)){
			T t = createIPSAppDEAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEDataExport.class)){
			T t = createIPSAppDEDataExport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEDataExport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEDataImport.class)){
			T t = createIPSAppDEDataImport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEDataImport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class)){
			T t = createIPSAppDEDataSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEDataSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEFLogic.class)){
			T t = createIPSAppDEFLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEFLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEFUIMode.class)){
			T t = createIPSAppDEFUIMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEFUIMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEField.class)){
			T t = createIPSAppDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDELogic.class)){
			T t = createIPSAppDELogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDELogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMap.class)){
			T t = createIPSAppDEMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMapAction.class)){
			T t = createIPSAppDEMapAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMapAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet.class)){
			T t = createIPSAppDEMapDataSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMapField.class)){
			T t = createIPSAppDEMapField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMapField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMethod.class)){
			T t = createIPSAppDEMethod(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMethod)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO.class)){
			T t = createIPSAppDEMethodDTO(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField.class)){
			T t = createIPSAppDEMethodDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMethodInput.class)){
			T t = createIPSAppDEMethodInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMethodInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn.class)){
			T t = createIPSAppDEMethodReturn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEPrint.class)){
			T t = createIPSAppDEPrint(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEPrint)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDERS.class)){
			T t = createIPSAppDERS(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDERS)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEReport.class)){
			T t = createIPSAppDEReport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEReport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEReportItem.class)){
			T t = createIPSAppDEReportItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEReportItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class)){
			T t = createIPSAppDEUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup.class)){
			T t = createIPSAppDEUIActionGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class)){
			T t = createIPSAppDEUILogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEUILogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail.class)){
			T t = createIPSAppDEUILogicGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class)){
			T t = createIPSAppDataEntity(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.dataentity.IPSAppDataEntity)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.func.IPSAppFunc.class)){
			T t = createIPSAppFunc(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.func.IPSAppFunc)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppLan.class)){
			T t = createIPSAppLan(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppLan)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppLogic.class)){
			T t = createIPSAppLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppMethodDTO.class)){
			T t = createIPSAppMethodDTO(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppMethodDTO)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppMethodDTOField.class)){
			T t = createIPSAppMethodDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppMethodDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppModule.class)){
			T t = createIPSAppModule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppModule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppPkg.class)){
			T t = createIPSAppPkg(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppPkg)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppResource.class)){
			T t = createIPSAppResource(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppResource)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppUIStyle.class)){
			T t = createIPSAppUIStyle(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppUIStyle)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSAppUtilPage.class)){
			T t = createIPSAppUtilPage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSAppUtilPage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSApplication.class)){
			T t = createIPSApplication(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSApplication)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSApplicationLogic.class)){
			T t = createIPSApplicationLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSApplicationLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.IPSSubAppRef.class)){
			T t = createIPSSubAppRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.IPSSubAppRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.logic.IPSAppUILogic.class)){
			T t = createIPSAppUILogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.logic.IPSAppUILogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class)){
			T t = createIPSAppUILogicRefView(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.logic.IPSAppUILogicRefView)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.msg.IPSAppMsgTempl.class)){
			T t = createIPSAppMsgTempl(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.msg.IPSAppMsgTempl)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.res.IPSAppDEFInputTipSet.class)){
			T t = createIPSAppDEFInputTipSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.res.IPSAppDEFInputTipSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.res.IPSAppEditorStyleRef.class)){
			T t = createIPSAppEditorStyleRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.res.IPSAppEditorStyleRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.res.IPSAppPFPluginRef.class)){
			T t = createIPSAppPFPluginRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.res.IPSAppPFPluginRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.res.IPSAppSubViewTypeRef.class)){
			T t = createIPSAppSubViewTypeRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.res.IPSAppSubViewTypeRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.theme.IPSAppUITheme.class)){
			T t = createIPSAppUITheme(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.theme.IPSAppUITheme)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.usermode.IPSAppUserMode.class)){
			T t = createIPSAppUserMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.usermode.IPSAppUserMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.util.IPSAppDynaDashboardUtil.class)){
			T t = createIPSAppDynaDashboardUtil(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.util.IPSAppDynaDashboardUtil)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.util.IPSAppUtil.class)){
			T t = createIPSAppUtil(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.util.IPSAppUtil)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppDEView.class)){
			T t = createIPSAppDEView(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppDEView)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppIndexView.class)){
			T t = createIPSAppIndexView(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppIndexView)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppUIAction.class)){
			T t = createIPSAppUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppView.class)){
			T t = createIPSAppView(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppView)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewEngine.class)){
			T t = createIPSAppViewEngine(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewEngine)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewLogic.class)){
			T t = createIPSAppViewLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewMsg.class)){
			T t = createIPSAppViewMsg(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewMsg)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewMsgGroup.class)){
			T t = createIPSAppViewMsgGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewMsgGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail.class)){
			T t = createIPSAppViewMsgGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewNavContext.class)){
			T t = createIPSAppViewNavContext(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewNavContext)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewNavParam.class)){
			T t = createIPSAppViewNavParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewNavParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewParam.class)){
			T t = createIPSAppViewParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewRef.class)){
			T t = createIPSAppViewRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.view.IPSAppViewUIAction.class)){
			T t = createIPSAppViewUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.view.IPSAppViewUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.wf.IPSAppWF.class)){
			T t = createIPSAppWF(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.wf.IPSAppWF)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.wf.IPSAppWFDE.class)){
			T t = createIPSAppWFDE(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.wf.IPSAppWFDE)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.wf.IPSAppWFUIAction.class)){
			T t = createIPSAppWFUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.wf.IPSAppWFUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.app.wf.IPSAppWFVer.class)){
			T t = createIPSAppWFVer(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.app.wf.IPSAppWFVer)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDColSet.class)){
			T t = createIPSSysBDColSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDColSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDColumn.class)){
			T t = createIPSSysBDColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDModule.class)){
			T t = createIPSSysBDModule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDModule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDPart.class)){
			T t = createIPSSysBDPart(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDPart)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDScheme.class)){
			T t = createIPSSysBDScheme(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDScheme)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDTable.class)){
			T t = createIPSSysBDTable(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDTable)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.ba.IPSSysBDTableRS.class)){
			T t = createIPSSysBDTableRS(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.ba.IPSSysBDTableRS)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIAggColumn.class)){
			T t = createIPSSysBIAggColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIAggColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIAggTable.class)){
			T t = createIPSSysBIAggTable(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIAggTable)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBICube.class)){
			T t = createIPSSysBICube(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBICube)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBICubeDimension.class)){
			T t = createIPSSysBICubeDimension(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBICubeDimension)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBICubeLevel.class)){
			T t = createIPSSysBICubeLevel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBICubeLevel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBICubeMeasure.class)){
			T t = createIPSSysBICubeMeasure(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBICubeMeasure)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIDimension.class)){
			T t = createIPSSysBIDimension(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIDimension)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIHierarchy.class)){
			T t = createIPSSysBIHierarchy(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIHierarchy)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBILevel.class)){
			T t = createIPSSysBILevel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBILevel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIReport.class)){
			T t = createIPSSysBIReport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIReport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIReportDimension.class)){
			T t = createIPSSysBIReportDimension(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIReportDimension)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIReportMeasure.class)){
			T t = createIPSSysBIReportMeasure(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIReportMeasure)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.bi.IPSSysBIScheme.class)){
			T t = createIPSSysBIScheme(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.bi.IPSSysBIScheme)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.backservice.IPSSysBackService.class)){
			T t = createIPSSysBackService(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.backservice.IPSSysBackService)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.codelist.IPSCodeItem.class)){
			T t = createIPSCodeItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.codelist.IPSCodeItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.codelist.IPSCodeList.class)){
			T t = createIPSCodeList(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.codelist.IPSCodeList)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.codelist.IPSThreshold.class)){
			T t = createIPSThreshold(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.codelist.IPSThreshold)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.calendar.IPSSysCalendarItem.class)){
			T t = createIPSSysCalendarItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.calendar.IPSSysCalendarItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartAngleAxis.class)){
			T t = createIPSChartAngleAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartAngleAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartCalendar.class)){
			T t = createIPSChartCalendar(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartCalendar)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class)){
			T t = createIPSChartCoordinateSystem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartCoordinateSystem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartDataSet.class)){
			T t = createIPSChartDataSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartDataSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartDataSetField.class)){
			T t = createIPSChartDataSetField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartDataSetField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartDataSetGroup.class)){
			T t = createIPSChartDataSetGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartDataSetGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartGeo.class)){
			T t = createIPSChartGeo(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartGeo)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartGrid.class)){
			T t = createIPSChartGrid(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartGrid)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartGridXAxis.class)){
			T t = createIPSChartGridXAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartGridXAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartGridYAxis.class)){
			T t = createIPSChartGridYAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartGridYAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartParallel.class)){
			T t = createIPSChartParallel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartParallel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartParallelAxis.class)){
			T t = createIPSChartParallelAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartParallelAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartPolar.class)){
			T t = createIPSChartPolar(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartPolar)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartPolarAngleAxis.class)){
			T t = createIPSChartPolarAngleAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartPolarAngleAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis.class)){
			T t = createIPSChartPolarRadiusAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartRadar.class)){
			T t = createIPSChartRadar(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartRadar)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartRadiusAxis.class)){
			T t = createIPSChartRadiusAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartRadiusAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartSeriesEncode.class)){
			T t = createIPSChartSeriesEncode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartSeriesEncode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartSingle.class)){
			T t = createIPSChartSingle(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartSingle)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartSingleAxis.class)){
			T t = createIPSChartSingleAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartSingleAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartXAxis.class)){
			T t = createIPSChartXAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartXAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSChartYAxis.class)){
			T t = createIPSChartYAxis(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSChartYAxis)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSDEChartDataGrid.class)){
			T t = createIPSDEChartDataGrid(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSDEChartDataGrid)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSDEChartLegend.class)){
			T t = createIPSDEChartLegend(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSDEChartLegend)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSDEChartSeries.class)){
			T t = createIPSDEChartSeries(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSDEChartSeries)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.chart.IPSDEChartTitle.class)){
			T t = createIPSDEChartTitle(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.chart.IPSDEChartTitle)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.counter.IPSSysCounter.class)){
			T t = createIPSSysCounter(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.counter.IPSSysCounter)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.drctrl.IPSDEDRBarGroup.class)){
			T t = createIPSDEDRBarGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.drctrl.IPSDEDRBarGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem.class)){
			T t = createIPSDEDRCtrlItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.drctrl.IPSDEDRTabPage.class)){
			T t = createIPSDEDRTabPage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.drctrl.IPSDEDRTabPage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class)){
			T t = createIPSDBPortletPart(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.dashboard.IPSDBPortletPart)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.dataview.IPSDEDataViewDataItem.class)){
			T t = createIPSDEDataViewDataItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.dataview.IPSDEDataViewDataItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.dataview.IPSDEDataViewItem.class)){
			T t = createIPSDEDataViewItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.dataview.IPSDEDataViewItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.expbar.IPSTabExpPage.class)){
			T t = createIPSTabExpPage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.expbar.IPSTabExpPage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEEditForm.class)){
			T t = createIPSDEEditForm(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEEditForm)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFDCatGroupLogic.class)){
			T t = createIPSDEFDCatGroupLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFDCatGroupLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFDLogic.class)){
			T t = createIPSDEFDLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFDLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFFormItem.class)){
			T t = createIPSDEFFormItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFFormItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFIUpdateDetail.class)){
			T t = createIPSDEFIUpdateDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFIUpdateDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormButton.class)){
			T t = createIPSDEFormButton(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormButton)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormDetail.class)){
			T t = createIPSDEFormDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormItem.class)){
			T t = createIPSDEFormItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormItemUpdate.class)){
			T t = createIPSDEFormItemUpdate(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormItemUpdate)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormItemVR.class)){
			T t = createIPSDEFormItemVR(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormItemVR)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormPage.class)){
			T t = createIPSDEFormPage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormPage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.form.IPSDEFormTabPage.class)){
			T t = createIPSDEFormTabPage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.form.IPSDEFormTabPage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail.class)){
			T t = createIPSDEGEIUpdateDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.grid.IPSDEGridColumn.class)){
			T t = createIPSDEGridColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.grid.IPSDEGridColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.grid.IPSDEGridDataItem.class)){
			T t = createIPSDEGridDataItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.grid.IPSDEGridDataItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.grid.IPSDEGridEditItem.class)){
			T t = createIPSDEGridEditItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.grid.IPSDEGridEditItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate.class)){
			T t = createIPSDEGridEditItemUpdate(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.grid.IPSDEGridEditItemVR.class)){
			T t = createIPSDEGridEditItemVR(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.grid.IPSDEGridEditItemVR)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControl.class)){
			T t = createIPSControl(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControl)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlAction.class)){
			T t = createIPSControlAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlAttribute.class)){
			T t = createIPSControlAttribute(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlAttribute)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlHandler.class)){
			T t = createIPSControlHandler(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlHandler)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlHandlerAction.class)){
			T t = createIPSControlHandlerAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlHandlerAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlLogic.class)){
			T t = createIPSControlLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlNavContext.class)){
			T t = createIPSControlNavContext(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlNavContext)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlNavParam.class)){
			T t = createIPSControlNavParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlNavParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlParam.class)){
			T t = createIPSControlParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSControlRender.class)){
			T t = createIPSControlRender(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSControlRender)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSEditor.class)){
			T t = createIPSEditor(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSEditor)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSEditorItem.class)){
			T t = createIPSEditorItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSEditorItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSNavigateContext.class)){
			T t = createIPSNavigateContext(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSNavigateContext)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSNavigateParam.class)){
			T t = createIPSNavigateParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSNavigateParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSRawItemBase.class)){
			T t = createIPSRawItemBase(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSRawItemBase)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.IPSRawItemParam.class)){
			T t = createIPSRawItemParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.IPSRawItemParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.layout.IPSLayout.class)){
			T t = createIPSLayout(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.layout.IPSLayout)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.layout.IPSLayoutPos.class)){
			T t = createIPSLayoutPos(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.layout.IPSLayoutPos)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.list.IPSDEListDataItem.class)){
			T t = createIPSDEListDataItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.list.IPSDEListDataItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.list.IPSDEListItem.class)){
			T t = createIPSDEListItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.list.IPSDEListItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.map.IPSSysMapItem.class)){
			T t = createIPSSysMapItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.map.IPSSysMapItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.menu.IPSAppMenuItem.class)){
			T t = createIPSAppMenuItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.menu.IPSAppMenuItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSLayoutPanel.class)){
			T t = createIPSLayoutPanel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSLayoutPanel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSPanelButton.class)){
			T t = createIPSPanelButton(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSPanelButton)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSPanelField.class)){
			T t = createIPSPanelField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSPanelField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSPanelItem.class)){
			T t = createIPSPanelItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSPanelItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSPanelItemCatGroupLogic.class)){
			T t = createIPSPanelItemCatGroupLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSPanelItemCatGroupLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSPanelItemLogic.class)){
			T t = createIPSPanelItemLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSPanelItemLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSPanelTabPage.class)){
			T t = createIPSPanelTabPage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSPanelTabPage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.panel.IPSViewLayoutPanel.class)){
			T t = createIPSViewLayoutPanel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.panel.IPSViewLayoutPanel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.searchbar.IPSSearchBarFilter.class)){
			T t = createIPSSearchBarFilter(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.searchbar.IPSSearchBarFilter)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.searchbar.IPSSearchBarGroup.class)){
			T t = createIPSSearchBarGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.searchbar.IPSSearchBarGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch.class)){
			T t = createIPSSearchBarQuickSearch(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.toolbar.IPSDEContextMenu.class)){
			T t = createIPSDEContextMenu(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.toolbar.IPSDEContextMenu)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.toolbar.IPSDEContextMenuItem.class)){
			T t = createIPSDEContextMenuItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.toolbar.IPSDEContextMenuItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.toolbar.IPSDEToolbarItem.class)){
			T t = createIPSDEToolbarItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.toolbar.IPSDEToolbarItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeColumn.class)){
			T t = createIPSDETreeColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNode.class)){
			T t = createIPSDETreeNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeColumn.class)){
			T t = createIPSDETreeNodeColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeDataItem.class)){
			T t = createIPSDETreeNodeDataItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeDataItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeEditItem.class)){
			T t = createIPSDETreeNodeEditItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeEditItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate.class)){
			T t = createIPSDETreeNodeEditItemUpdate(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeRS.class)){
			T t = createIPSDETreeNodeRS(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeRS)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeRSParam.class)){
			T t = createIPSDETreeNodeRSParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeRSParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.control.tree.IPSDETreeNodeRV.class)){
			T t = createIPSDETreeNodeRV(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.control.tree.IPSDETreeNodeRV)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSDEFGroup.class)){
			T t = createIPSDEFGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSDEFGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail.class)){
			T t = createIPSDEFGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode.class)){
			T t = createIPSDEFSearchMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSDEFUIMode.class)){
			T t = createIPSDEFUIMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSDEFUIMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSDEField.class)){
			T t = createIPSDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSLinkDEField.class)){
			T t = createIPSLinkDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSLinkDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField.class)){
			T t = createIPSOne2ManyDataDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField.class)){
			T t = createIPSOne2OneDataDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.IPSPickupDEField.class)){
			T t = createIPSPickupDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.IPSPickupDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class)){
			T t = createIPSDEFVRCondition(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition.class)){
			T t = createIPSDEFVRGroupCondition(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule.class)){
			T t = createIPSDEFValueRule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dts.IPSSysDTSQueue.class)){
			T t = createIPSSysDTSQueue(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dts.IPSSysDTSQueue)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ac.IPSDEACMode.class)){
			T t = createIPSDEACMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ac.IPSDEACMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem.class)){
			T t = createIPSDEACModeDataItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEAction.class)){
			T t = createIPSDEAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionGroup.class)){
			T t = createIPSDEActionGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail.class)){
			T t = createIPSDEActionGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionInput.class)){
			T t = createIPSDEActionInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField.class)){
			T t = createIPSDEActionInputDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class)){
			T t = createIPSDEActionLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionParam.class)){
			T t = createIPSDEActionParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionReturn.class)){
			T t = createIPSDEActionReturn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionReturn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.action.IPSDEActionVR.class)){
			T t = createIPSDEActionVR(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.action.IPSDEActionVR)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDER1N.class)){
			T t = createIPSDER1N(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDER1N)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap.class)){
			T t = createIPSDER1NDEFieldMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERAggData.class)){
			T t = createIPSDERAggData(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERAggData)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap.class)){
			T t = createIPSDERAggDataDEFieldMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERBase.class)){
			T t = createIPSDERBase(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERBase)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERGroup.class)){
			T t = createIPSDERGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERGroupDetail.class)){
			T t = createIPSDERGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap.class)){
			T t = createIPSDERIndexDEFieldMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSDERInherit.class)){
			T t = createIPSDERInherit(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSDERInherit)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.der.IPSSysDERGroup.class)){
			T t = createIPSSysDERGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.der.IPSSysDERGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dr.IPSDEDRDetail.class)){
			T t = createIPSDEDRDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dr.IPSDEDRDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dr.IPSDEDRGroup.class)){
			T t = createIPSDEDRGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dr.IPSDEDRGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dr.IPSDEDRItem.class)){
			T t = createIPSDEDRItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dr.IPSDEDRItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dr.IPSDEDataRelation.class)){
			T t = createIPSDEDataRelation(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dr.IPSDEDataRelation)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDQColumn.class)){
			T t = createIPSDEDQColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDQColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class)){
			T t = createIPSDEDQCondition(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDQCondition)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition.class)){
			T t = createIPSDEDQGroupCondition(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDQJoin.class)){
			T t = createIPSDEDQJoin(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDQJoin)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDQMain.class)){
			T t = createIPSDEDQMain(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDQMain)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class)){
			T t = createIPSDEDataQuery(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataQuery)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode.class)){
			T t = createIPSDEDataQueryCode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond.class)){
			T t = createIPSDEDataQueryCodeCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp.class)){
			T t = createIPSDEDataQueryCodeExp(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput.class)){
			T t = createIPSDEDataQueryInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataQueryInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn.class)){
			T t = createIPSDEDataQueryReturn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataQueryReturn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataSet.class)){
			T t = createIPSDEDataSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam.class)){
			T t = createIPSDEDataSetGroupParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataSetInput.class)){
			T t = createIPSDEDataSetInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataSetInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataSetParam.class)){
			T t = createIPSDEDataSetParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataSetParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn.class)){
			T t = createIPSDEDataSetReturn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEFilterDTO.class)){
			T t = createIPSDEFilterDTO(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEFilterDTO)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField.class)){
			T t = createIPSDEFilterDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dts.IPSDEDTSQueue.class)){
			T t = createIPSDEDTSQueue(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dts.IPSDEDTSQueue)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataexport.IPSDEDataExport.class)){
			T t = createIPSDEDataExport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataexport.IPSDEDataExport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup.class)){
			T t = createIPSDEDataExportGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem.class)){
			T t = createIPSDEDataExportItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond.class)){
			T t = createIPSDEDFJoinCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond.class)){
			T t = createIPSDEDFJoinGroupCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow.class)){
			T t = createIPSDEDataFlow(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond.class)){
			T t = createIPSDEDataFlowFilterCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink.class)){
			T t = createIPSDEDataFlowLink(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode.class)){
			T t = createIPSDEDataFlowNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter.class)){
			T t = createIPSDEDataFlowNodeFilter(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam.class)){
			T t = createIPSDEDataFlowNodeParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataimport.IPSDEDataImport.class)){
			T t = createIPSDEDataImport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataimport.IPSDEDataImport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem.class)){
			T t = createIPSDEDataImportItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.datamap.IPSDEMap.class)){
			T t = createIPSDEMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.datamap.IPSDEMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.datamap.IPSDEMapAction.class)){
			T t = createIPSDEMapAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.datamap.IPSDEMapAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery.class)){
			T t = createIPSDEMapDataQuery(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.datamap.IPSDEMapDataQuery)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet.class)){
			T t = createIPSDEMapDataSet(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.datamap.IPSDEMapDataSet)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.datamap.IPSDEMapField.class)){
			T t = createIPSDEMapField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.datamap.IPSDEMapField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.datasync.IPSDEDataSync.class)){
			T t = createIPSDEDataSync(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.datasync.IPSDEDataSync)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.IPSDEGroup.class)){
			T t = createIPSDEGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.IPSDEGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.IPSDEGroupDetail.class)){
			T t = createIPSDEGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.IPSDEGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.IPSDataEntity.class)){
			T t = createIPSDataEntity(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.IPSDataEntity)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.IPSSysDEGroup.class)){
			T t = createIPSSysDEGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.IPSSysDEGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEFLogic.class)){
			T t = createIPSDEFLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEFLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogic.class)){
			T t = createIPSDELogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicLink.class)){
			T t = createIPSDELogicLink(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicLink)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond.class)){
			T t = createIPSDELogicLinkCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond.class)){
			T t = createIPSDELogicLinkGroupCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class)){
			T t = createIPSDELogicNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam.class)){
			T t = createIPSDELogicNodeParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicParam.class)){
			T t = createIPSDELogicParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDELogicParamBase.class)){
			T t = createIPSDELogicParamBase(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDELogicParamBase)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class)){
			T t = createIPSDEMSLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEMSLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink.class)){
			T t = createIPSDEMSLogicLink(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond.class)){
			T t = createIPSDEMSLogicLinkCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond.class)){
			T t = createIPSDEMSLogicLinkGroupCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode.class)){
			T t = createIPSDEMSLogicNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEUILogicLink.class)){
			T t = createIPSDEUILogicLink(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEUILogicLink)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond.class)){
			T t = createIPSDEUILogicLinkCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond.class)){
			T t = createIPSDEUILogicLinkGroupCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class)){
			T t = createIPSDEUILogicNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam.class)){
			T t = createIPSDEUILogicNodeParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class)){
			T t = createIPSDEUILogicParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class)){
			T t = createIPSDEMainState(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.mainstate.IPSDEMainState)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction.class)){
			T t = createIPSDEMainStateAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField.class)){
			T t = createIPSDEMainStateField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv.class)){
			T t = createIPSDEMainStateOPPriv(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.notify.IPSDENotify.class)){
			T t = createIPSDENotify(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.notify.IPSDENotify)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.notify.IPSDENotifyTarget.class)){
			T t = createIPSDENotifyTarget(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.notify.IPSDENotifyTarget)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.print.IPSDEPrint.class)){
			T t = createIPSDEPrint(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.print.IPSDEPrint)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class)){
			T t = createIPSDEOPPriv(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.priv.IPSDEOPPriv)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.priv.IPSDEUserRole.class)){
			T t = createIPSDEUserRole(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.priv.IPSDEUserRole)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv.class)){
			T t = createIPSDEUserRoleOPPriv(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv.class)){
			T t = createIPSSysDEOPPriv(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.report.IPSDEReport.class)){
			T t = createIPSDEReport(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.report.IPSDEReport)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.report.IPSDEReportItem.class)){
			T t = createIPSDEReportItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.report.IPSDEReportItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.search.IPSDESearch.class)){
			T t = createIPSDESearch(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.search.IPSDESearch)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEMethodDTO.class)){
			T t = createIPSDEMethodDTO(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEMethodDTO)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEMethodDTOField.class)){
			T t = createIPSDEMethodDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEMethodDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class)){
			T t = createIPSDEServiceAPI(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEServiceAPI)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEServiceAPIField.class)){
			T t = createIPSDEServiceAPIField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEServiceAPIField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod.class)){
			T t = createIPSDEServiceAPIMethod(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput.class)){
			T t = createIPSDEServiceAPIMethodInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn.class)){
			T t = createIPSDEServiceAPIMethodReturn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS.class)){
			T t = createIPSDEServiceAPIRS(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.uiaction.IPSDEUIAction.class)){
			T t = createIPSDEUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.uiaction.IPSDEUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class)){
			T t = createIPSDEUIActionGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.unistate.IPSDEUniState.class)){
			T t = createIPSDEUniState(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.unistate.IPSDEUniState)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.util.IPSDEUtil.class)){
			T t = createIPSDEUtil(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.util.IPSDEUtil)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.wf.IPSDEWF.class)){
			T t = createIPSDEWF(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.wf.IPSDEWF)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.wizard.IPSDEWizard.class)){
			T t = createIPSDEWizard(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.wizard.IPSDEWizard)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm.class)){
			T t = createIPSDEWizardForm(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dataentity.wizard.IPSDEWizardStep.class)){
			T t = createIPSDEWizardStep(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dataentity.wizard.IPSDEWizardStep)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSDEDBConfig.class)){
			T t = createIPSDEDBConfig(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSDEDBConfig)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSDEDBIndex.class)){
			T t = createIPSDEDBIndex(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSDEDBIndex)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSDEDBIndexField.class)){
			T t = createIPSDEDBIndexField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSDEDBIndexField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSDEDBTable.class)){
			T t = createIPSDEDBTable(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSDEDBTable)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSDEFDTColumn.class)){
			T t = createIPSDEFDTColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSDEFDTColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSysDBColumn.class)){
			T t = createIPSSysDBColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSysDBColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSysDBIndex.class)){
			T t = createIPSSysDBIndex(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSysDBIndex)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSysDBIndexColumn.class)){
			T t = createIPSSysDBIndexColumn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSysDBIndexColumn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSysDBScheme.class)){
			T t = createIPSSysDBScheme(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSysDBScheme)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSysDBTable.class)){
			T t = createIPSSysDBTable(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSysDBTable)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSysDBValueFunc.class)){
			T t = createIPSSysDBValueFunc(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSysDBValueFunc)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.database.IPSSystemDBConfig.class)){
			T t = createIPSSystemDBConfig(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.database.IPSSystemDBConfig)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dynamodel.IPSDynaModel.class)){
			T t = createIPSDynaModel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dynamodel.IPSDynaModel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dynamodel.IPSDynaModelAttr.class)){
			T t = createIPSDynaModelAttr(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dynamodel.IPSDynaModelAttr)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.dynamodel.IPSSysDynaModel.class)){
			T t = createIPSSysDynaModel(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.dynamodel.IPSSysDynaModel)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIDE.class)){
			T t = createIPSSysEAIDE(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIDE)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIDEField.class)){
			T t = createIPSSysEAIDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIDER.class)){
			T t = createIPSSysEAIDER(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIDER)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIDataType.class)){
			T t = createIPSSysEAIDataType(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIDataType)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIDataTypeItem.class)){
			T t = createIPSSysEAIDataTypeItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIDataTypeItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIElement.class)){
			T t = createIPSSysEAIElement(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIElement)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIElementAttr.class)){
			T t = createIPSSysEAIElementAttr(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIElementAttr)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.eai.IPSSysEAIElementRE.class)){
			T t = createIPSSysEAIElementRE(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.eai.IPSSysEAIElementRE)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.er.IPSSysERMap.class)){
			T t = createIPSSysERMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.er.IPSSysERMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.er.IPSSysERMapNode.class)){
			T t = createIPSSysERMapNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.er.IPSSysERMapNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.IPSModelData.class)){
			T t = createIPSModelData(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.IPSModelData)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.msg.IPSSysMsgQueue.class)){
			T t = createIPSSysMsgQueue(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.msg.IPSSysMsgQueue)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.msg.IPSSysMsgTarget.class)){
			T t = createIPSSysMsgTarget(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.msg.IPSSysMsgTarget)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.msg.IPSSysMsgTempl.class)){
			T t = createIPSSysMsgTempl(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.msg.IPSSysMsgTempl)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.pub.IPSSysSFPub.class)){
			T t = createIPSSysSFPub(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.pub.IPSSysSFPub)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.pub.IPSSysSFPubPkg.class)){
			T t = createIPSSysSFPubPkg(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.pub.IPSSysSFPubPkg)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.requirement.IPSSysReqItem.class)){
			T t = createIPSSysReqItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.requirement.IPSSysReqItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.requirement.IPSSysReqModule.class)){
			T t = createIPSSysReqModule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.requirement.IPSSysReqModule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSCtrlMsg.class)){
			T t = createIPSCtrlMsg(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSCtrlMsg)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSCtrlMsgItem.class)){
			T t = createIPSCtrlMsgItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSCtrlMsgItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSLanguageItem.class)){
			T t = createIPSLanguageItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSLanguageItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSLanguageRes.class)){
			T t = createIPSLanguageRes(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSLanguageRes)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysContent.class)){
			T t = createIPSSysContent(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysContent)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysContentCat.class)){
			T t = createIPSSysContentCat(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysContentCat)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysCss.class)){
			T t = createIPSSysCss(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysCss)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysDataSyncAgent.class)){
			T t = createIPSSysDataSyncAgent(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysDataSyncAgent)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysDictCat.class)){
			T t = createIPSSysDictCat(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysDictCat)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysEditorStyle.class)){
			T t = createIPSSysEditorStyle(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysEditorStyle)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysI18N.class)){
			T t = createIPSSysI18N(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysI18N)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysImage.class)){
			T t = createIPSSysImage(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysImage)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysLan.class)){
			T t = createIPSSysLan(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysLan)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysLogic.class)){
			T t = createIPSSysLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysPDTView.class)){
			T t = createIPSSysPDTView(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysPDTView)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysPFPlugin.class)){
			T t = createIPSSysPFPlugin(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysPFPlugin)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysResource.class)){
			T t = createIPSSysResource(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysResource)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysSFPlugin.class)){
			T t = createIPSSysSFPlugin(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysSFPlugin)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysSampleValue.class)){
			T t = createIPSSysSampleValue(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysSampleValue)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysSequence.class)){
			T t = createIPSSysSequence(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysSequence)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysTranslator.class)){
			T t = createIPSSysTranslator(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysTranslator)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysUniState.class)){
			T t = createIPSSysUniState(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysUniState)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.res.IPSSysUtil.class)){
			T t = createIPSSysUtil(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.res.IPSSysUtil)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.search.IPSSysSearchDE.class)){
			T t = createIPSSysSearchDE(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.search.IPSSysSearchDE)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.search.IPSSysSearchDEField.class)){
			T t = createIPSSysSearchDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.search.IPSSysSearchDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.search.IPSSysSearchDoc.class)){
			T t = createIPSSysSearchDoc(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.search.IPSSysSearchDoc)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.search.IPSSysSearchField.class)){
			T t = createIPSSysSearchField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.search.IPSSysSearchField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.search.IPSSysSearchScheme.class)){
			T t = createIPSSysSearchScheme(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.search.IPSSysSearchScheme)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.security.IPSSysUniRes.class)){
			T t = createIPSSysUniRes(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.security.IPSSysUniRes)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.security.IPSSysUserDR.class)){
			T t = createIPSSysUserDR(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.security.IPSSysUserDR)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.security.IPSSysUserMode.class)){
			T t = createIPSSysUserMode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.security.IPSSysUserMode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.security.IPSSysUserRole.class)){
			T t = createIPSSysUserRole(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.security.IPSSysUserRole)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.security.IPSSysUserRoleData.class)){
			T t = createIPSSysUserRoleData(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.security.IPSSysUserRoleData)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.security.IPSSysUserRoleRes.class)){
			T t = createIPSSysUserRoleRes(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.security.IPSSysUserRoleRes)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPI.class)){
			T t = createIPSSubSysServiceAPI(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPI)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIDE.class)){
			T t = createIPSSubSysServiceAPIDE(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIDE)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIDEField.class)){
			T t = createIPSSubSysServiceAPIDEField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIDEField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod.class)){
			T t = createIPSSubSysServiceAPIDEMethod(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIDERS.class)){
			T t = createIPSSubSysServiceAPIDERS(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIDERS)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIDTO.class)){
			T t = createIPSSubSysServiceAPIDTO(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIDTO)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIDTOField.class)){
			T t = createIPSSubSysServiceAPIDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput.class)){
			T t = createIPSSubSysServiceAPIMethodInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn.class)){
			T t = createIPSSubSysServiceAPIMethodReturn(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSysMethodDTO.class)){
			T t = createIPSSysMethodDTO(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSysMethodDTO)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSysMethodDTOField.class)){
			T t = createIPSSysMethodDTOField(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSysMethodDTOField)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.IPSSysServiceAPI.class)){
			T t = createIPSSysServiceAPI(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.IPSSysServiceAPI)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.service.openapi.IPSOpenAPI3Schema.class)){
			T t = createIPSOpenAPI3Schema(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.service.openapi.IPSOpenAPI3Schema)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.system.IPSSysModelGroup.class)){
			T t = createIPSSysModelGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.system.IPSSysModelGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.system.IPSSysRef.class)){
			T t = createIPSSysRef(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.system.IPSSysRef)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.system.IPSSystemModule.class)){
			T t = createIPSSystemModule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.system.IPSSystemModule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestCase.class)){
			T t = createIPSSysTestCase(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestCase)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestCaseAssert.class)){
			T t = createIPSSysTestCaseAssert(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestCaseAssert)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestCaseInput.class)){
			T t = createIPSSysTestCaseInput(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestCaseInput)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestData.class)){
			T t = createIPSSysTestData(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestData)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestDataItem.class)){
			T t = createIPSSysTestDataItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestDataItem)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestModule.class)){
			T t = createIPSSysTestModule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestModule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.testing.IPSSysTestPrj.class)){
			T t = createIPSSysTestPrj(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.testing.IPSSysTestPrj)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.uml.IPSSysActor.class)){
			T t = createIPSSysActor(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.uml.IPSSysActor)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.uml.IPSSysUCMap.class)){
			T t = createIPSSysUCMap(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.uml.IPSSysUCMap)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.uml.IPSSysUCMapNode.class)){
			T t = createIPSSysUCMapNode(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.uml.IPSSysUCMapNode)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.uml.IPSSysUseCase.class)){
			T t = createIPSSysUseCase(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.uml.IPSSysUseCase)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.uml.IPSSysUseCaseRS.class)){
			T t = createIPSSysUseCaseRS(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.uml.IPSSysUseCaseRS)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.valuerule.IPSSysValueRule.class)){
			T t = createIPSSysValueRule(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.valuerule.IPSSysValueRule)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.view.IPSUIAction.class)){
			T t = createIPSUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.view.IPSUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.view.IPSUIActionGroup.class)){
			T t = createIPSUIActionGroup(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.view.IPSUIActionGroup)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.view.IPSUIActionGroupDetail.class)){
			T t = createIPSUIActionGroupDetail(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.view.IPSUIActionGroupDetail)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.view.IPSUIEngineParam.class)){
			T t = createIPSUIEngineParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.view.IPSUIEngineParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFDE.class)){
			T t = createIPSWFDE(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFDE)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFInteractiveProcess.class)){
			T t = createIPSWFInteractiveProcess(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFInteractiveProcess)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFLink.class)){
			T t = createIPSWFLink(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFLink)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFLinkCond.class)){
			T t = createIPSWFLinkCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFLinkCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFLinkGroupCond.class)){
			T t = createIPSWFLinkGroupCond(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFLinkGroupCond)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFLinkRole.class)){
			T t = createIPSWFLinkRole(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFLinkRole)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFProcess.class)){
			T t = createIPSWFProcess(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFProcess)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFProcessParam.class)){
			T t = createIPSWFProcessParam(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFProcessParam)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFProcessRole.class)){
			T t = createIPSWFProcessRole(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFProcessRole)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFProcessSubWF.class)){
			T t = createIPSWFProcessSubWF(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFProcessSubWF)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFRole.class)){
			T t = createIPSWFRole(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFRole)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFUtilUIAction.class)){
			T t = createIPSWFUtilUIAction(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFUtilUIAction)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFVersion.class)){
			T t = createIPSWFVersion(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFVersion)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWFWorkTime.class)){
			T t = createIPSWFWorkTime(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWFWorkTime)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wf.IPSWorkflow.class)){
			T t = createIPSWorkflow(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wf.IPSWorkflow)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wx.IPSWXAccount.class)){
			T t = createIPSWXAccount(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wx.IPSWXAccount)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wx.IPSWXEntApp.class)){
			T t = createIPSWXEntApp(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wx.IPSWXEntApp)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wx.IPSWXLogic.class)){
			T t = createIPSWXLogic(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wx.IPSWXLogic)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wx.IPSWXMenu.class)){
			T t = createIPSWXMenu(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wx.IPSWXMenu)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wx.IPSWXMenuFunc.class)){
			T t = createIPSWXMenuFunc(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wx.IPSWXMenuFunc)实现对象", parentPSModelObject);		}
		if(cls.equals(net.ibizsys.model.wx.IPSWXMenuItem.class)){
			T t = createIPSWXMenuItem(parentPSModelObject,cls,objNode);
			if(t != null) return (T)t;
			throw new PSModelServiceException(this, "无法建立类型(net.ibizsys.model.wx.IPSWXMenuItem)实现对象", parentPSModelObject);		}
			throw new PSModelServiceException(this, "无法建立类型(未知)实现对象", parentPSModelObject);	}
	protected <T> T create(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				//TODO：没有实现对象
				return null;
	}
	protected <T> T createIPSModelData(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.PSModelDataImpl());
	}
	protected <T> T createIPSSysAIChatAgent(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ai.PSSysAIChatAgentImpl());
	}
	protected <T> T createIPSSysAIFactory(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ai.PSSysAIFactoryImpl());
	}
	protected <T> T createIPSSysAIPipelineAgent(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ai.PSSysAIPipelineAgentImpl());
	}
	protected <T> T createIPSSysAIPipelineJob(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ai.PSSysAIPipelineJobImpl());
	}
	protected <T> T createIPSSysAIPipelineWorker(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ai.PSSysAIPipelineWorkerImpl());
	}
	protected <T> T createIPSSysAIWorkerAgent(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ai.PSSysAIWorkerAgentImpl());
	}
	protected <T> T createIPSAppLan(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppLanImpl());
	}
	protected <T> T createIPSAppLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppLogicImpl());
	}
	protected <T> T createIPSAppMethodDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppMethodDTOImpl());
	}
	protected <T> T createIPSAppMethodDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppMethodDTOFieldImpl());
	}
	protected <T> T createIPSAppModule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppModuleImpl());
	}
	protected <T> T createIPSAppPkg(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppPkgImpl());
	}
	protected <T> T createIPSAppResource(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppResourceImpl());
	}
	protected <T> T createIPSAppUIStyle(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppUIStyleImpl());
	}
	protected <T> T createIPSAppUtilPage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSAppUtilPageImpl());
	}
	protected <T> T createIPSApplication(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSApplicationImpl());
	}
	protected <T> T createIPSApplicationLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.app.PSApplicationLogicImpl());
	}
	protected <T> T createIPSSubAppRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.PSSubAppRefImpl());
	}
	protected <T> T createIPSAppMenuModel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.app.appmenu.PSAppMenuModelImpl());
	}
	protected <T> T createIPSAppBICube(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBICubeImpl());
	}
	protected <T> T createIPSAppBICubeDimension(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBICubeDimensionImpl());
	}
	protected <T> T createIPSAppBICubeHierarchy(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBICubeHierarchyImpl());
	}
	protected <T> T createIPSAppBICubeLevel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBICubeLevelImpl());
	}
	protected <T> T createIPSAppBICubeMeasure(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBICubeMeasureImpl());
	}
	protected <T> T createIPSAppBIReport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBIReportImpl());
	}
	protected <T> T createIPSAppBIReportDimension(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBIReportDimensionImpl());
	}
	protected <T> T createIPSAppBIReportMeasure(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBIReportMeasureImpl());
	}
	protected <T> T createIPSAppBIScheme(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.bi.PSAppBISchemeImpl());
	}
	protected <T> T createIPSAppCodeList(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.codelist.PSAppCodeListImpl());
	}
	protected <T> T createIPSAppCounter(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.control.PSAppCounterImpl());
	}
	protected <T> T createIPSAppCounterRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.control.PSAppCounterRefImpl());
	}
	protected <T> T createIPSAppPortlet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.control.PSAppPortletImpl());
	}
	protected <T> T createIPSAppPortletCat(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.control.PSAppPortletCatImpl());
	}
	protected <T> T createIPSAppDEACMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ac.PSDEACModeImpl());
	}
	protected <T> T createIPSAppDEAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodImpl());
	}
	protected <T> T createIPSAppDEDataExport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataexport.PSDEDataExportImpl());
	}
	protected <T> T createIPSAppDEDataImport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataimport.PSDEDataImportImpl());
	}
	protected <T> T createIPSAppDEDataSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodImpl());
	}
	protected <T> T createIPSAppDEFLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEFLogicImpl());
	}
	protected <T> T createIPSAppDEFUIMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.defield.PSDEFUIModeImpl());
	}
	protected <T> T createIPSAppDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEFieldImpl2());
	}
	protected <T> T createIPSAppDELogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicSubType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEFIELD")){
				return createIPSAppDEFLogic(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicImpl());
	}
	protected <T> T createIPSAppDEMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapImpl());
	}
	protected <T> T createIPSAppDEMapAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapActionImpl());
	}
	protected <T> T createIPSAppDEMapDataSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapDataSetImpl());
	}
	protected <T> T createIPSAppDEMapField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapDetailImpl());
	}
	protected <T> T createIPSAppDEMethod(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodImpl());
	}
	protected <T> T createIPSAppDEMethodDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodDTOImpl());
	}
	protected <T> T createIPSAppDEMethodDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodDTOFieldImpl());
	}
	protected <T> T createIPSAppDEMethodInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodInputImpl());
	}
	protected <T> T createIPSAppDEMethodReturn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDEMethodReturnImpl());
	}
	protected <T> T createIPSAppDEPrint(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.print.PSDEPrintImpl());
	}
	protected <T> T createIPSAppDERS(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDERSImpl2());
	}
	protected <T> T createIPSAppDEReport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.report.PSDEReportImpl());
	}
	protected <T> T createIPSAppDEReportItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.report.PSDEReportItemImpl());
	}
	protected <T> T createIPSAppDEUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl());
	}
	protected <T> T createIPSAppDEUIActionGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl());
	}
	protected <T> T createIPSAppDEUILogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEViewLogicImpl());
	}
	protected <T> T createIPSAppDEUILogicGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicGroupDetailImpl());
	}
	protected <T> T createIPSAppDataEntity(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.dataentity.PSAppDataEntityImpl());
	}
	protected <T> T createIPSAppFunc(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.func.PSAppFuncImpl());
	}
	protected <T> T createIPSAppUILogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "viewLogicType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("APP_NEWDATA")){
				return createIPSAppUINewDataLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APP_OPENDATA")){
				return createIPSAppUIOpenDataLogic(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.app.logic.PSAppUILogicImpl());
	}
	protected <T> T createIPSAppUILogicRefView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.logic.PSAppUILogicRefViewImpl());
	}
	protected <T> T createIPSAppUINewDataLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.logic.BuiltinPSAppUINewDataLogicImpl());
	}
	protected <T> T createIPSAppUIOpenDataLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.logic.BuiltinPSAppUIOpenDataLogicImpl());
	}
	protected <T> T createIPSAppMsgTempl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.msg.PSAppMsgTemplImpl());
	}
	protected <T> T createIPSAppDEFInputTipSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.res.PSAppDEFInputTipSetImpl());
	}
	protected <T> T createIPSAppEditorStyleRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.res.PSAppEditorStyleRefImpl());
	}
	protected <T> T createIPSAppPFPluginRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.res.PSAppPFPluginRefImpl());
	}
	protected <T> T createIPSAppSubViewTypeRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.res.PSAppSubViewTypeRefImpl());
	}
	protected <T> T createIPSAppUITheme(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.theme.PSAppUIThemeImpl());
	}
	protected <T> T createIPSAppUserMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.usermode.PSAppUserModeImpl());
	}
	protected <T> T createIPSAppDynaDashboardUtil(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.util.PSAppDynaDashboardUtilImpl());
	}
	protected <T> T createIPSAppUtil(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "utilType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DYNADASHBOARD")){
				return (T)(new net.ibizsys.model.app.util.PSAppDynaDashboardUtilImpl());
			}
			if(strTypeValue.equals("FILTERSTORAGE")){
				return (T)(new net.ibizsys.model.app.util.PSAppFilterStorageUtilImpl());
			}
		}
		return (T)(new net.ibizsys.model.app.util.PSAppUtilImpl());
	}
	protected <T> T createIPSAppDEChartView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEChartViewImpl());
	}
	protected <T> T createIPSAppDECustomView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDECustomViewImpl());
	}
	protected <T> T createIPSAppDEDashboardView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEDashboardViewImpl());
	}
	protected <T> T createIPSAppDEDataSetViewMsg(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEDataSetViewMsgImpl());
	}
	protected <T> T createIPSAppDEEditView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEEditViewImpl());
	}
	protected <T> T createIPSAppDEHtmlView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEHtmlViewImpl());
	}
	protected <T> T createIPSAppDEIndexView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEIndexViewImpl());
	}
	protected <T> T createIPSAppDEPanelView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPanelViewImpl());
	}
	protected <T> T createIPSAppDEPickupView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPickupViewImpl());
	}
	protected <T> T createIPSAppDERedirectView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDERedirectViewImpl());
	}
	protected <T> T createIPSAppDEReportView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEReportViewImpl());
	}
	protected <T> T createIPSAppDESubAppRefView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDESubAppRefViewImpl());
	}
	protected <T> T createIPSAppDEView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "viewType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DECALENDAREXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDECalendarExplorerViewImpl());
			}
			if(strTypeValue.equals("DECALENDARVIEW") || strTypeValue.equals("DECALENDARVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDECalendarViewImpl());
			}
			if(strTypeValue.equals("DECHARTEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEChartExplorerViewImpl());
			}
			if(strTypeValue.equals("DECHARTVIEW") || strTypeValue.equals("DECHARTVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEChartViewImpl());
			}
			if(strTypeValue.equals("DECUSTOMVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDECustomViewImpl());
			}
			if(strTypeValue.equals("DEPORTALVIEW") || strTypeValue.equals("DEPORTALVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEDashboardViewImpl());
			}
			if(strTypeValue.equals("DEDATAVIEWEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEDataViewExplorerViewImpl());
			}
			if(strTypeValue.equals("DEDATAVIEW") || strTypeValue.equals("DEDATAVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEDataViewImpl());
			}
			if(strTypeValue.equals("DEEDITVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEEditView9Impl());
			}
			if(strTypeValue.equals("DEOPTVIEW") || strTypeValue.equals("DEEDITVIEW") || strTypeValue.equals("DEEDITVIEW2") || strTypeValue.equals("DEEDITVIEW3") || strTypeValue.equals("DEEDITVIEW4")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEEditViewImpl());
			}
			if(strTypeValue.equals("DEFORMPICKUPDATAVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEFormPickupDataViewImpl());
			}
			if(strTypeValue.equals("DEGANTTEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEGanttExplorerViewImpl());
			}
			if(strTypeValue.equals("DEGANTTVIEW") || strTypeValue.equals("DEGANTTVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEGanttViewImpl());
			}
			if(strTypeValue.equals("DEGRIDEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEGridExplorerViewImpl());
			}
			if(strTypeValue.equals("DEGRIDVIEW8")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEGridView8Impl());
			}
			if(strTypeValue.equals("DEGRIDVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEGridView9Impl());
			}
			if(strTypeValue.equals("DEGRIDVIEW") || strTypeValue.equals("DEGRIDVIEW2") || strTypeValue.equals("DEGRIDVIEW4")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEGridViewImpl());
			}
			if(strTypeValue.equals("DEHTMLVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEHtmlViewImpl());
			}
			if(strTypeValue.equals("DEINDEXPICKUPDATAVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEIndexPickupDataViewImpl());
			}
			if(strTypeValue.equals("DEINDEXVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEIndexViewImpl());
			}
			if(strTypeValue.equals("DEKANBANVIEW") || strTypeValue.equals("DEKANBANVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEKanbanViewImpl());
			}
			if(strTypeValue.equals("DELISTEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEListExplorerViewImpl());
			}
			if(strTypeValue.equals("DELISTVIEW") || strTypeValue.equals("DELISTVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEListViewImpl());
			}
			if(strTypeValue.equals("DEMEDITVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMEditViewImpl());
			}
			if(strTypeValue.equals("DEMPICKUPVIEW") || strTypeValue.equals("DEMPICKUPVIEW2")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMPickupViewImpl());
			}
			if(strTypeValue.equals("DEMAPEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMapExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMAPVIEW") || strTypeValue.equals("DEMAPVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMapViewImpl());
			}
			if(strTypeValue.equals("DEMOBCALENDAREXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobCalendarExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBCALENDARVIEW") || strTypeValue.equals("DEMOBCALENDARVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobCalendarViewImpl());
			}
			if(strTypeValue.equals("DEMOBCHARTEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobChartExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBCHARTVIEW") || strTypeValue.equals("DEMOBCHARTVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobChartViewImpl());
			}
			if(strTypeValue.equals("DEMOBCUSTOMVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobCustomViewImpl());
			}
			if(strTypeValue.equals("DEMOBPORTALVIEW") || strTypeValue.equals("DEMOBPORTALVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobDashboardViewImpl());
			}
			if(strTypeValue.equals("DEMOBDATAVIEWEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobDataViewExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBDATAVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobDataViewImpl());
			}
			if(strTypeValue.equals("DEMOBOPTVIEW") || strTypeValue.equals("DEMOBEDITVIEW") || strTypeValue.equals("DEMOBEDITVIEW3") || strTypeValue.equals("DEMOBEDITVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobEditViewImpl());
			}
			if(strTypeValue.equals("DEMOBGANTTEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobGanttExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBGANTTVIEW") || strTypeValue.equals("DEMOBGANTTVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobGanttViewImpl());
			}
			if(strTypeValue.equals("DEMOBHTMLVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobHtmlViewImpl());
			}
			if(strTypeValue.equals("DEMOBLISTEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobListExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBLISTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobListViewImpl());
			}
			if(strTypeValue.equals("DEMOBMDVIEW") || strTypeValue.equals("DEMOBMDVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobMDViewImpl());
			}
			if(strTypeValue.equals("DEMOBMEDITVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl());
			}
			if(strTypeValue.equals("DEMOBMPICKUPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobMPickupViewImpl());
			}
			if(strTypeValue.equals("DEMOBMAPEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobMapExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBMAPVIEW") || strTypeValue.equals("DEMOBMAPVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobMapViewImpl());
			}
			if(strTypeValue.equals("DEMOBPANELVIEW") || strTypeValue.equals("DEMOBPANELVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobPanelViewImpl());
			}
			if(strTypeValue.equals("DEMOBPICKUPLISTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobPickupListViewImpl());
			}
			if(strTypeValue.equals("DEMOBPICKUPMDVIEW") || strTypeValue.equals("DEMOBFORMPICKUPMDVIEW") || strTypeValue.equals("DEMOBINDEXPICKUPMDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobPickupMDViewImpl());
			}
			if(strTypeValue.equals("DEMOBPICKUPTREEVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobPickupTreeViewImpl());
			}
			if(strTypeValue.equals("DEMOBPICKUPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobPickupViewImpl());
			}
			if(strTypeValue.equals("DEMOBREDIRECTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobRedirectViewImpl());
			}
			if(strTypeValue.equals("DEMOBREPORTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobReportViewImpl());
			}
			if(strTypeValue.equals("DEMOBTABEXPVIEW") || strTypeValue.equals("DEMOBTABEXPVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobTabExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBTABSEARCHVIEW") || strTypeValue.equals("DEMOBTABSEARCHVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobTabSearchViewImpl());
			}
			if(strTypeValue.equals("DEMOBTREEEXPVIEW") || strTypeValue.equals("DEMOBTREEEXPVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobTreeExplorerViewImpl());
			}
			if(strTypeValue.equals("DEMOBTREEVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobTreeViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFACTIONVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFActionViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFDATAREDIRECTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFDataRedirectViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFDYNAACTIONVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFDynaActionViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFDYNAEDITVIEW") || strTypeValue.equals("DEMOBWFDYNAEDITVIEW3")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFDynaEditViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFDYNAEXPMDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFDynaExpMDViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFDYNASTARTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFDynaStartViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFEDITVIEW") || strTypeValue.equals("DEMOBWFEDITVIEW3")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFEditViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFMDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFMDViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFPROXYRESULTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFProxyResultViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFPROXYSTARTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFProxyStartViewImpl());
			}
			if(strTypeValue.equals("DEMOBWFSTARTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWFStartViewImpl());
			}
			if(strTypeValue.equals("DEMOBWIZARDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMobWizardViewImpl());
			}
			if(strTypeValue.equals("DEMDCUSTOMVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl());
			}
			if(strTypeValue.equals("DEPANELVIEW") || strTypeValue.equals("DEPANELVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPanelViewImpl());
			}
			if(strTypeValue.equals("DEPICKUPDATAVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPickupDataViewImpl());
			}
			if(strTypeValue.equals("DEPICKUPGRIDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPickupGridViewImpl());
			}
			if(strTypeValue.equals("DEPICKUPTREEVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPickupTreeViewImpl());
			}
			if(strTypeValue.equals("DEPICKUPVIEW") || strTypeValue.equals("DEPICKUPVIEW2") || strTypeValue.equals("DEPICKUPVIEW3")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEPickupViewImpl());
			}
			if(strTypeValue.equals("DEREDIRECTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDERedirectViewImpl());
			}
			if(strTypeValue.equals("DEREPORTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEReportViewImpl());
			}
			if(strTypeValue.equals("DESUBAPPREFVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDESubAppRefViewImpl());
			}
			if(strTypeValue.equals("DETABEXPVIEW") || strTypeValue.equals("DETABEXPVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETabExplorerViewImpl());
			}
			if(strTypeValue.equals("DETABSEARCHVIEW") || strTypeValue.equals("DETABSEARCHVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETabSearchViewImpl());
			}
			if(strTypeValue.equals("DETREEEXPVIEW2")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETreeExplorerView2Impl());
			}
			if(strTypeValue.equals("DETREEEXPVIEW") || strTypeValue.equals("DETREEEXPVIEW3")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETreeExplorerViewImpl());
			}
			if(strTypeValue.equals("DETREEGRIDEXVIEW") || strTypeValue.equals("DETREEGRIDEXVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETreeGridExViewImpl());
			}
			if(strTypeValue.equals("DETREEGRIDVIEW") || strTypeValue.equals("DETREEGRIDVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETreeGridViewImpl());
			}
			if(strTypeValue.equals("DETREEVIEW") || strTypeValue.equals("DETREEVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDETreeViewImpl());
			}
			if(strTypeValue.equals("DEWFACTIONVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFActionViewImpl());
			}
			if(strTypeValue.equals("DEWFDATAREDIRECTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFDataRedirectViewImpl());
			}
			if(strTypeValue.equals("DEWFDYNAACTIONVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFDynaActionViewImpl());
			}
			if(strTypeValue.equals("DEWFDYNAEDITVIEW") || strTypeValue.equals("DEWFDYNAEDITVIEW3")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFDynaEditViewImpl());
			}
			if(strTypeValue.equals("DEWFDYNAEXPGRIDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFDynaExpGridViewImpl());
			}
			if(strTypeValue.equals("DEWFDYNASTARTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFDynaStartViewImpl());
			}
			if(strTypeValue.equals("DEWFEDITPROXYDATAVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFEditProxyDataViewImpl());
			}
			if(strTypeValue.equals("DEWFEDITVIEW") || strTypeValue.equals("DEWFEDITVIEW2") || strTypeValue.equals("DEWFEDITVIEW3") || strTypeValue.equals("DEWFEDITVIEW9")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFEditViewImpl());
			}
			if(strTypeValue.equals("DEWFEXPVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFExplorerViewImpl());
			}
			if(strTypeValue.equals("DEWFGRIDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFGridViewImpl());
			}
			if(strTypeValue.equals("DEWFPROXYDATAREDIRECTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFProxyDataRedirectViewImpl());
			}
			if(strTypeValue.equals("DEWFPROXYDATAVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFProxyDataViewImpl());
			}
			if(strTypeValue.equals("DEWFPROXYRESULTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFProxyResultViewImpl());
			}
			if(strTypeValue.equals("DEWFPROXYSTARTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFProxyStartViewImpl());
			}
			if(strTypeValue.equals("DEWFSTARTVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWFStartViewImpl());
			}
			if(strTypeValue.equals("DEWIZARDVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWizardViewImpl());
			}
			if(strTypeValue.equals("DECHARTVIEW") || strTypeValue.equals("DECHARTVIEW9")){
				return createIPSAppDEChartView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DECUSTOMVIEW")){
				return createIPSAppDECustomView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEPORTALVIEW") || strTypeValue.equals("DEPORTALVIEW9")){
				return createIPSAppDEDashboardView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEOPTVIEW") || strTypeValue.equals("DEEDITVIEW") || strTypeValue.equals("DEEDITVIEW2") || strTypeValue.equals("DEEDITVIEW3") || strTypeValue.equals("DEEDITVIEW4")){
				return createIPSAppDEEditView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEHTMLVIEW")){
				return createIPSAppDEHtmlView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEINDEXVIEW")){
				return createIPSAppDEIndexView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEPANELVIEW") || strTypeValue.equals("DEPANELVIEW9")){
				return createIPSAppDEPanelView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEPICKUPVIEW") || strTypeValue.equals("DEPICKUPVIEW2") || strTypeValue.equals("DEPICKUPVIEW3")){
				return createIPSAppDEPickupView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEREDIRECTVIEW")){
				return createIPSAppDERedirectView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEREPORTVIEW")){
				return createIPSAppDEReportView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEWIZARDVIEW")){
				return createIPSAppDEWizardView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DESUBAPPREFVIEW")){
				return createIPSAppDESubAppRefView(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.app.view.PSAppDEViewImpl());
	}
	protected <T> T createIPSAppDEWizardView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppDEWizardViewImpl());
	}
	protected <T> T createIPSAppErrorView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppErrorViewImpl());
	}
	protected <T> T createIPSAppFuncPickupView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppFuncPickupViewImpl());
	}
	protected <T> T createIPSAppIndexView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppIndexViewImpl());
	}
	protected <T> T createIPSAppPanelView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppPanelViewImpl());
	}
	protected <T> T createIPSAppPortalView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppPortalViewImpl());
	}
	protected <T> T createIPSAppUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				//TODO：没有实现对象
				return null;
	}
	protected <T> T createIPSAppUtilView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "viewType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("APPERRORVIEW")){
				return (T)(new net.ibizsys.model.app.view.PSAppErrorViewImpl());
			}
			if(strTypeValue.equals("APPERRORVIEW")){
				return createIPSAppErrorView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPFUNCPICKUPVIEW")){
				return createIPSAppFuncPickupView(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.app.view.PSAppUtilViewImpl());
	}
	protected <T> T createIPSAppView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "viewType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("APPPORTALVIEW")){
				return createIPSAppPortalView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPDEVIEW")){
				return createIPSAppDEView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPUTILVIEW") || strTypeValue.equals("APPSTARTVIEW") || strTypeValue.equals("APPWELCOMEVIEW") || strTypeValue.equals("APPLOGINVIEW") || strTypeValue.equals("APPLOGOUTVIEW") || strTypeValue.equals("APPFILEUPLOADVIEW") || strTypeValue.equals("APPPICUPLOADVIEW") || strTypeValue.equals("APPDATAUPLOADVIEW") || strTypeValue.equals("APPFUNCPICKUPVIEW") || strTypeValue.equals("APPERRORVIEW") || strTypeValue.equals("APPWFSTEPDATAVIEW") || strTypeValue.equals("APPWFSTEPACTORVIEW") || strTypeValue.equals("APPWFSTEPTRACEVIEW") || strTypeValue.equals("APPWFSENDBACKVIEW") || strTypeValue.equals("APPWFSUPPLYINFOVIEW") || strTypeValue.equals("APPWFADDSTEPBEFOREVIEW") || strTypeValue.equals("APPWFTAKEADVICEVIEW") || strTypeValue.equals("APPWFREDIRECTVIEW") || strTypeValue.equals("APPREDIRECTVIEW")){
				return createIPSAppUtilView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPINDEXVIEW")){
				return createIPSAppIndexView(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPPANELVIEW")){
				return createIPSAppPanelView(parentPSModelObject, cls, objNode);
			}
		}
		return (T)createIPSAppDEView(parentPSModelObject, cls, objNode);
	}
	protected <T> T createIPSAppViewEngine(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.app.view.PSAppDEViewEngineImpl());
	}
	protected <T> T createIPSAppViewLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.app.view.PSAppViewLogicImpl());
	}
	protected <T> T createIPSAppViewMsg(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "dynamicMode", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("1")){
				return (T)(new net.ibizsys.model.app.view.PSAppDEDataSetViewMsgImpl());
			}
			if(strTypeValue.equals("1")){
				return createIPSAppDEDataSetViewMsg(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.app.view.PSAppViewMsgImpl());
	}
	protected <T> T createIPSAppViewMsgGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewMsgGroupImpl());
	}
	protected <T> T createIPSAppViewMsgGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewMsgGroupDetailImpl());
	}
	protected <T> T createIPSAppViewNavContext(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewNavContextImpl());
	}
	protected <T> T createIPSAppViewNavParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewNavParamImpl());
	}
	protected <T> T createIPSAppViewParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewParamImpl());
	}
	protected <T> T createIPSAppViewRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewRefImpl());
	}
	protected <T> T createIPSAppViewUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.view.PSAppViewUIActionImpl());
	}
	protected <T> T createIPSAppWF(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.wf.PSAppWFImpl());
	}
	protected <T> T createIPSAppWFDE(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.wf.PSAppWFDEImpl());
	}
	protected <T> T createIPSAppWFUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.wf.uiaction.PSWFUIActionImpl());
	}
	protected <T> T createIPSAppWFVer(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.app.wf.PSAppWFVerImpl());
	}
	protected <T> T createIPSSysBDColSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDColSetImpl());
	}
	protected <T> T createIPSSysBDColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDColumnImpl());
	}
	protected <T> T createIPSSysBDModule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDModuleImpl());
	}
	protected <T> T createIPSSysBDPart(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDPartImpl());
	}
	protected <T> T createIPSSysBDScheme(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDSchemeImpl());
	}
	protected <T> T createIPSSysBDTable(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDTableImpl());
	}
	protected <T> T createIPSSysBDTableRS(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.ba.PSSysBDTableRSImpl());
	}
	protected <T> T createIPSSysBackService(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.backservice.PSSysBackServiceImpl());
	}
	protected <T> T createIPSSysBIAggColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIAggColumnImpl());
	}
	protected <T> T createIPSSysBIAggTable(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIAggTableImpl());
	}
	protected <T> T createIPSSysBICube(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBICubeImpl());
	}
	protected <T> T createIPSSysBICubeDimension(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBICubeDimensionImpl());
	}
	protected <T> T createIPSSysBICubeLevel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBICubeLevelImpl());
	}
	protected <T> T createIPSSysBICubeMeasure(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBICubeMeasureImpl());
	}
	protected <T> T createIPSSysBIDimension(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIDimensionImpl());
	}
	protected <T> T createIPSSysBIHierarchy(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIHierarchyImpl());
	}
	protected <T> T createIPSSysBILevel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBILevelImpl());
	}
	protected <T> T createIPSSysBIReport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIReportImpl());
	}
	protected <T> T createIPSSysBIReportDimension(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIReportDimensionImpl());
	}
	protected <T> T createIPSSysBIReportMeasure(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBIReportMeasureImpl());
	}
	protected <T> T createIPSSysBIScheme(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.bi.PSSysBISchemeImpl());
	}
	protected <T> T createIPSCodeItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.codelist.PSCodeItemImpl());
	}
	protected <T> T createIPSCodeList(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.codelist.PSCodeListImpl());
	}
	protected <T> T createIPSThreshold(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.codelist.PSThresholdImpl());
	}
	protected <T> T createIPSControl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "controlType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("CALENDAR")){
				return (T)(new net.ibizsys.model.control.calendar.PSSysCalendarImpl());
			}
			if(strTypeValue.equals("CAPTIONBAR")){
				return (T)(new net.ibizsys.model.control.captionbar.PSCaptionBarImpl());
			}
			if(strTypeValue.equals("CHART")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartImpl());
			}
			if(strTypeValue.equals("CUSTOM")){
				return (T)(new net.ibizsys.model.control.custom.PSCustomControlImpl());
			}
			if(strTypeValue.equals("DRBAR")){
				return (T)(new net.ibizsys.model.control.drctrl.PSDEDRBarImpl());
			}
			if(strTypeValue.equals("DRTAB")){
				return (T)(new net.ibizsys.model.control.drctrl.PSDEDRTabImpl());
			}
			if(strTypeValue.equals("DASHBOARD")){
				return (T)(new net.ibizsys.model.control.dashboard.PSSysDashboardImpl());
			}
			if(strTypeValue.equals("DATAINFOBAR")){
				return (T)(new net.ibizsys.model.control.datainfobar.PSDataInfoBarImpl());
			}
			if(strTypeValue.equals("DATAVIEW")){
				return (T)(new net.ibizsys.model.control.dataview.PSDEDataViewImpl());
			}
			if(strTypeValue.equals("KANBAN")){
				return (T)(new net.ibizsys.model.control.dataview.PSDEKanbanImpl());
			}
			if(strTypeValue.equals("CALENDAREXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSCalendarExpBarImpl());
			}
			if(strTypeValue.equals("CHARTEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSChartExpBarImpl());
			}
			if(strTypeValue.equals("DATAVIEWEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSDataViewExpBarImpl());
			}
			if(strTypeValue.equals("EXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSExpBarImpl());
			}
			if(strTypeValue.equals("GANTTEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSGanttExpBarImpl());
			}
			if(strTypeValue.equals("GRIDEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSGridExpBarImpl());
			}
			if(strTypeValue.equals("LISTEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSListExpBarImpl());
			}
			if(strTypeValue.equals("MAPEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSMapExpBarImpl());
			}
			if(strTypeValue.equals("TABEXPPANEL")){
				return (T)(new net.ibizsys.model.control.expbar.PSTabExpPanelImpl());
			}
			if(strTypeValue.equals("TREEEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSTreeExpBarImpl());
			}
			if(strTypeValue.equals("WFEXPBAR")){
				return (T)(new net.ibizsys.model.control.expbar.PSWFExpBarImpl());
			}
			if(strTypeValue.equals("FORM")){
				return (T)(new net.ibizsys.model.control.form.PSDEEditFormImpl());
			}
			if(strTypeValue.equals("SEARCHFORM")){
				return (T)(new net.ibizsys.model.control.form.PSDESearchFormImpl());
			}
			if(strTypeValue.equals("GRID")){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridImpl());
			}
			if(strTypeValue.equals("MULTIEDITVIEWPANEL")){
				return (T)(new net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl());
			}
			if(strTypeValue.equals("TREEGRID")){
				return (T)(new net.ibizsys.model.control.grid.PSDETreeGridImpl());
			}
			if(strTypeValue.equals("LIST")){
				return (T)(new net.ibizsys.model.control.list.PSDEListImpl());
			}
			if(strTypeValue.equals("MOBMDCTRL")){
				return (T)(new net.ibizsys.model.control.list.PSDEMobMDCtrlImpl());
			}
			if(strTypeValue.equals("MAP")){
				return (T)(new net.ibizsys.model.control.map.PSSysMapImpl());
			}
			if(strTypeValue.equals("APPMENU")){
				return (T)(new net.ibizsys.model.control.menu.PSAppMenuImpl());
			}
			if(strTypeValue.equals("PANEL")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelImpl());
			}
			if(strTypeValue.equals("VIEWLAYOUTPANEL")){
				return (T)(new net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl());
			}
			if(strTypeValue.equals("REPORTPANEL")){
				return (T)(new net.ibizsys.model.control.reportpanel.PSDEReportPanelImpl());
			}
			if(strTypeValue.equals("SEARCHBAR")){
				return (T)(new net.ibizsys.model.control.searchbar.PSSysSearchBarImpl());
			}
			if(strTypeValue.equals("CONTEXTMENU")){
				return (T)(new net.ibizsys.model.control.toolbar.PSDEContextMenuImpl());
			}
			if(strTypeValue.equals("TOOLBAR")){
				return (T)(new net.ibizsys.model.control.toolbar.PSDEToolbarImpl());
			}
			if(strTypeValue.equals("GANTT")){
				return (T)(new net.ibizsys.model.control.tree.PSDEGanttImpl());
			}
			if(strTypeValue.equals("TREEGRIDEX")){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeGridExImpl());
			}
			if(strTypeValue.equals("TREEVIEW")){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeImpl());
			}
			if(strTypeValue.equals("PICKUPVIEWPANEL")){
				return (T)(new net.ibizsys.model.control.viewpanel.PSDEPickupViewPanelImpl());
			}
			if(strTypeValue.equals("TABVIEWPANEL")){
				return (T)(new net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl());
			}
			if(strTypeValue.equals("VIEWPANEL")){
				return (T)(new net.ibizsys.model.control.viewpanel.PSDEViewPanelImpl());
			}
			if(strTypeValue.equals("STATEWIZARDPANEL")){
				return (T)(new net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelImpl());
			}
			if(strTypeValue.equals("WIZARDPANEL")){
				return (T)(new net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl());
			}
			if(strTypeValue.equals("PORTLET")){
				return createIPSDBPortletPart(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSControlAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.ajax.PSAjaxControlHandlerActionImpl());
	}
	protected <T> T createIPSControlAttribute(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.PSControlAttributeProxy());
	}
	protected <T> T createIPSControlHandler(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.ajax.PSMDAjaxControlHandlerImpl());
	}
	protected <T> T createIPSControlHandlerAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.ajax.PSAjaxControlHandlerActionImpl());
	}
	protected <T> T createIPSControlLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.PSControlLogicProxy());
	}
	protected <T> T createIPSControlNavContext(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.PSControlNavContextImpl());
	}
	protected <T> T createIPSControlNavParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.PSControlNavParamImpl());
	}
	protected <T> T createIPSControlParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.PSControlParamImpl());
	}
	protected <T> T createIPSControlRender(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.PSControlRenderProxy());
	}
	protected <T> T createIPSEditor(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "editorType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("MOBARRAY") || strTypeValue.equals("ARRAY")){
				return (T)(new net.ibizsys.model.control.editor.PSArrayImpl());
			}
			if(strTypeValue.equals("AC") || strTypeValue.equals("AC_FS") || strTypeValue.equals("AC_NOBUTTON") || strTypeValue.equals("AC_FS_NOBUTTON")){
				return (T)(new net.ibizsys.model.control.editor.PSAutoCompleteImpl());
			}
			if(strTypeValue.equals("SWITCH") || strTypeValue.equals("CHECKBOX") || strTypeValue.equals("MOBSWITCH")){
				return (T)(new net.ibizsys.model.control.editor.PSCheckBoxImpl());
			}
			if(strTypeValue.equals("CHECKBOXLIST") || strTypeValue.equals("MOBCHECKLIST")){
				return (T)(new net.ibizsys.model.control.editor.PSCheckBoxListImpl());
			}
			if(strTypeValue.equals("CODE") || strTypeValue.equals("MOBCODE")){
				return (T)(new net.ibizsys.model.control.editor.PSCodeImpl());
			}
			if(strTypeValue.equals("COLORPICKER") || strTypeValue.equals("MOBCOLORPICKER")){
				return (T)(new net.ibizsys.model.control.editor.PSColorPickerImpl());
			}
			if(strTypeValue.equals("MOBDATE") || strTypeValue.equals("DATEPICKER") || strTypeValue.equals("DATEPICKEREX") || strTypeValue.equals("DATEPICKEREX_HOUR") || strTypeValue.equals("DATEPICKEREX_NODAY") || strTypeValue.equals("DATEPICKEREX_MINUTE") || strTypeValue.equals("DATEPICKEREX_NOTIME") || strTypeValue.equals("DATEPICKEREX_SECOND") || strTypeValue.equals("DATEPICKEREX_NODAY_NOSECOND")){
				return (T)(new net.ibizsys.model.control.editor.PSDatePickerImpl());
			}
			if(strTypeValue.equals("DATERANGE") || strTypeValue.equals("MOBDATERANGE")){
				return (T)(new net.ibizsys.model.control.editor.PSDateRangeImpl());
			}
			if(strTypeValue.equals("DROPDOWNLIST") || strTypeValue.equals("MOBDROPDOWNLIST") || strTypeValue.equals("DROPDOWNLIST_100")){
				return (T)(new net.ibizsys.model.control.editor.PSDropDownListImpl());
			}
			if(strTypeValue.equals("FILEUPLOADER") || strTypeValue.equals("MOBMULTIFILEUPLOAD") || strTypeValue.equals("MOBSINGLEFILEUPLOAD") || strTypeValue.equals("FILEUPLOADERONE")){
				return (T)(new net.ibizsys.model.control.editor.PSFileUploaderImpl());
			}
			if(strTypeValue.equals("HIDDEN")){
				return (T)(new net.ibizsys.model.control.editor.PSHiddenImpl());
			}
			if(strTypeValue.equals("HTMLEDITOR") || strTypeValue.equals("MOBHTMLTEXT")){
				return (T)(new net.ibizsys.model.control.editor.PSHtmlImpl());
			}
			if(strTypeValue.equals("IPADDRESSTEXTBOX")){
				return (T)(new net.ibizsys.model.control.editor.PSIPAddressImpl());
			}
			if(strTypeValue.equals("LISTBOX")){
				return (T)(new net.ibizsys.model.control.editor.PSListBoxImpl());
			}
			if(strTypeValue.equals("LISTBOXPICKUP")){
				return (T)(new net.ibizsys.model.control.editor.PSListBoxPickerImpl());
			}
			if(strTypeValue.equals("MDROPDOWNLIST")){
				return (T)(new net.ibizsys.model.control.editor.PSMDropDownListImpl());
			}
			if(strTypeValue.equals("MOBMPICKER")){
				return (T)(new net.ibizsys.model.control.editor.PSMPickerImpl());
			}
			if(strTypeValue.equals("ADDRESSPICKUP") || strTypeValue.equals("ADDRESSPICKUP_AC")){
				return (T)(new net.ibizsys.model.control.editor.PSMailAddressImpl());
			}
			if(strTypeValue.equals("MAPPICKER") || strTypeValue.equals("MOBMAPPICKER")){
				return (T)(new net.ibizsys.model.control.editor.PSMapPickerImpl());
			}
			if(strTypeValue.equals("MARKDOWN") || strTypeValue.equals("MOBMARKDOWN")){
				return (T)(new net.ibizsys.model.control.editor.PSMarkdownImpl());
			}
			if(strTypeValue.equals("NUMBER") || strTypeValue.equals("MOBNUMBER")){
				return (T)(new net.ibizsys.model.control.editor.PSNumberEditorImpl());
			}
			if(strTypeValue.equals("NUMBERRANGE") || strTypeValue.equals("MOBNUMBERRANGE")){
				return (T)(new net.ibizsys.model.control.editor.PSNumberRangeImpl());
			}
			if(strTypeValue.equals("OFFICEEDITOR2")){
				return (T)(new net.ibizsys.model.control.editor.PSOffice2Impl());
			}
			if(strTypeValue.equals("OFFICEEDITOR")){
				return (T)(new net.ibizsys.model.control.editor.PSOfficeImpl());
			}
			if(strTypeValue.equals("PASSWORD") || strTypeValue.equals("MOBPASSWORD")){
				return (T)(new net.ibizsys.model.control.editor.PSPasswordImpl());
			}
			if(strTypeValue.equals("PICKER") || strTypeValue.equals("MOBPICKER") || strTypeValue.equals("PICKEREX_LINK") || strTypeValue.equals("PICKEREX_NOAC") || strTypeValue.equals("PICKEREX_TRIGGER") || strTypeValue.equals("PICKEREX_LINKONLY") || strTypeValue.equals("PICKEREX_NOBUTTON") || strTypeValue.equals("PICKEREX_NOAC_LINK") || strTypeValue.equals("PICKEREX_DROPDOWNVIEW") || strTypeValue.equals("PICKEREX_TRIGGER_LINK") || strTypeValue.equals("MOBPICKER_DROPDOWNVIEW") || strTypeValue.equals("PICKEREX_DROPDOWNVIEW_LINK")){
				return (T)(new net.ibizsys.model.control.editor.PSPickerImpl());
			}
			if(strTypeValue.equals("PICKUPVIEW")){
				return (T)(new net.ibizsys.model.control.editor.PSPickupViewImpl());
			}
			if(strTypeValue.equals("PICTURE") || strTypeValue.equals("MOBPICTURELIST") || strTypeValue.equals("MOBPICTURE") || strTypeValue.equals("PICTURE_ONE")){
				return (T)(new net.ibizsys.model.control.editor.PSPictureImpl());
			}
			if(strTypeValue.equals("PREDEFINED")){
				return (T)(new net.ibizsys.model.control.editor.PSPredefinedImpl());
			}
			if(strTypeValue.equals("MOBRADIOLIST") || strTypeValue.equals("RADIOBUTTONLIST")){
				return (T)(new net.ibizsys.model.control.editor.PSRadioButtonListImpl());
			}
			if(strTypeValue.equals("RATING") || strTypeValue.equals("MOBRATING")){
				return (T)(new net.ibizsys.model.control.editor.PSRatingImpl());
			}
			if(strTypeValue.equals("RAW")){
				return (T)(new net.ibizsys.model.control.editor.PSRawImpl());
			}
			if(strTypeValue.equals("SLIDER") || strTypeValue.equals("MOBSLIDER")){
				return (T)(new net.ibizsys.model.control.editor.PSSliderImpl());
			}
			if(strTypeValue.equals("SPAN") || strTypeValue.equals("SPANEX") || strTypeValue.equals("SPAN_LINK")){
				return (T)(new net.ibizsys.model.control.editor.PSSpanImpl());
			}
			if(strTypeValue.equals("STEPPER") || strTypeValue.equals("MOBSTEPPER")){
				return (T)(new net.ibizsys.model.control.editor.PSStepperImpl());
			}
			if(strTypeValue.equals("TEXTAREA") || strTypeValue.equals("MOBTEXTAREA") || strTypeValue.equals("TEXTAREA_10")){
				return (T)(new net.ibizsys.model.control.editor.PSTextAreaImpl());
			}
			if(strTypeValue.equals("MOBTEXT") || strTypeValue.equals("TEXTBOX")){
				return (T)(new net.ibizsys.model.control.editor.PSTextBoxImpl());
			}
			if(strTypeValue.equals("NUMBER") || strTypeValue.equals("MOBNUMBER")){
				return createIPSNumberEditor(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SWITCH") || strTypeValue.equals("CHECKBOX") || strTypeValue.equals("MOBSWITCH")){
				return createIPSCheckBox(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("COLORPICKER") || strTypeValue.equals("MOBCOLORPICKER")){
				return createIPSColorPicker(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MOBDATE") || strTypeValue.equals("DATEPICKER") || strTypeValue.equals("DATEPICKEREX") || strTypeValue.equals("DATEPICKEREX_HOUR") || strTypeValue.equals("DATEPICKEREX_NODAY") || strTypeValue.equals("DATEPICKEREX_MINUTE") || strTypeValue.equals("DATEPICKEREX_NOTIME") || strTypeValue.equals("DATEPICKEREX_SECOND") || strTypeValue.equals("DATEPICKEREX_NODAY_NOSECOND")){
				return createIPSDatePicker(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("HIDDEN")){
				return createIPSHidden(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("HTMLEDITOR") || strTypeValue.equals("MOBHTMLTEXT")){
				return createIPSHtml(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("IPADDRESSTEXTBOX")){
				return createIPSIPAddress(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MAPPICKER") || strTypeValue.equals("MOBMAPPICKER")){
				return createIPSMapPicker(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("OFFICEEDITOR")){
				return createIPSOffice(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("OFFICEEDITOR2")){
				return createIPSOffice2(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAW")){
				return createIPSRaw(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.control.PSEditorImpl());
	}
	protected <T> T createIPSEditorItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.PSEditorItemImpl());
	}
	protected <T> T createIPSNavigateContext(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.PSNavigateContextImpl());
	}
	protected <T> T createIPSNavigateParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.PSNavigateParamImpl());
	}
	protected <T> T createIPSRawItemBase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "contentType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("HTML")){
				return (T)(new net.ibizsys.model.control.rawitem.PSHtmlItemImpl());
			}
			if(strTypeValue.equals("IMAGE")){
				return (T)(new net.ibizsys.model.control.rawitem.PSImageItemImpl());
			}
			if(strTypeValue.equals("MARKDOWN")){
				return (T)(new net.ibizsys.model.control.rawitem.PSMarkdownItemImpl());
			}
			if(strTypeValue.equals("PLACEHOLDER")){
				return (T)(new net.ibizsys.model.control.rawitem.PSPlaceholderItemImpl());
			}
			if(strTypeValue.equals("RAW")){
				return (T)(new net.ibizsys.model.control.rawitem.PSTextItemImpl());
			}
			if(strTypeValue.equals("VIDEO")){
				return (T)(new net.ibizsys.model.control.rawitem.PSVideoItemImpl());
			}
			if(strTypeValue.equals("HTML")){
				return createIPSHtmlItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("IMAGE")){
				return createIPSImageItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MARKDOWN")){
				return createIPSMarkdownItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("PLACEHOLDER")){
				return createIPSPlaceholderItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAW")){
				return createIPSTextItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("VIDEO")){
				return createIPSVideoItem(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.control.PSRawItemImpl());
	}
	protected <T> T createIPSRawItemParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.PSRawItemParamProxy());
	}
	protected <T> T createIPSSysCalendarItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.calendar.PSSysCalendarItemImpl());
	}
	protected <T> T createIPSChartAngleAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartPolarAngleAxisImpl());
	}
	protected <T> T createIPSChartCalendar(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartCalendarImpl());
	}
	protected <T> T createIPSChartCoordinateSystem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "type", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("CALENDAR")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCalendarImpl());
			}
			if(strTypeValue.equals("XY")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCartesian2DImpl());
			}
			if(strTypeValue.equals("MAP")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemGeoImpl());
			}
			if(strTypeValue.equals("NONE")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemNoneImpl());
			}
			if(strTypeValue.equals("PARALLEL")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemParallelImpl());
			}
			if(strTypeValue.equals("POLAR")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemPolarImpl());
			}
			if(strTypeValue.equals("RADAR")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemRadarImpl());
			}
			if(strTypeValue.equals("SINGLE")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemSingleImpl());
			}
			if(strTypeValue.equals("CALENDAR")){
				return createIPSChartCoordinateSystemCalendar(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("XY")){
				return createIPSChartCoordinateSystemCartesian2D(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MAP")){
				return createIPSChartCoordinateSystemGeo(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("NONE")){
				return createIPSChartCoordinateSystemNone(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("PARALLEL")){
				return createIPSChartCoordinateSystemParallel(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("POLAR")){
				return createIPSChartCoordinateSystemPolar(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RADAR")){
				return createIPSChartCoordinateSystemRadar(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSChartCoordinateSystemSingle(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSChartCoordinateSystemCalendar(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCalendarImpl());
	}
	protected <T> T createIPSChartCoordinateSystemCartesian2D(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemCartesian2DImpl());
	}
	protected <T> T createIPSChartCoordinateSystemGeo(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemGeoImpl());
	}
	protected <T> T createIPSChartCoordinateSystemNone(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemNoneImpl());
	}
	protected <T> T createIPSChartCoordinateSystemParallel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemParallelImpl());
	}
	protected <T> T createIPSChartCoordinateSystemPolar(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemPolarImpl());
	}
	protected <T> T createIPSChartCoordinateSystemRadar(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemRadarImpl());
	}
	protected <T> T createIPSChartCoordinateSystemSingle(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartCoordinateSystemSingleImpl());
	}
	protected <T> T createIPSChartDataSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartDataSetImpl());
	}
	protected <T> T createIPSChartDataSetField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartDataSetFieldImpl());
	}
	protected <T> T createIPSChartDataSetGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartDataSetGroupImpl());
	}
	protected <T> T createIPSChartGeo(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartGeoImpl());
	}
	protected <T> T createIPSChartGrid(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartGridImpl());
	}
	protected <T> T createIPSChartGridXAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartGridXAxisImpl());
	}
	protected <T> T createIPSChartGridYAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartGridYAxisImpl());
	}
	protected <T> T createIPSChartParallel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartParallelImpl());
	}
	protected <T> T createIPSChartParallelAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartParallelAxisImpl());
	}
	protected <T> T createIPSChartPolar(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartPolarImpl());
	}
	protected <T> T createIPSChartPolarAngleAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartPolarAngleAxisImpl());
	}
	protected <T> T createIPSChartPolarRadiusAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartPolarRadiusAxisImpl());
	}
	protected <T> T createIPSChartRadar(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartRadarImpl());
	}
	protected <T> T createIPSChartRadiusAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartPolarRadiusAxisImpl());
	}
	protected <T> T createIPSChartSeriesCSCartesian2DEncode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesCSCartesian2DEncodeImpl());
	}
	protected <T> T createIPSChartSeriesCSNoneEncode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneEncodeImpl());
	}
	protected <T> T createIPSChartSeriesEncode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "type", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("XY")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesCSCartesian2DEncodeImpl());
			}
			if(strTypeValue.equals("NONE")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesCSNoneEncodeImpl());
			}
			if(strTypeValue.equals("XY")){
				return createIPSChartSeriesCSCartesian2DEncode(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("NONE")){
				return createIPSChartSeriesCSNoneEncode(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSChartSingle(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartSingleImpl());
	}
	protected <T> T createIPSChartSingleAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartSingleAxisImpl());
	}
	protected <T> T createIPSChartXAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartGridXAxisImpl());
	}
	protected <T> T createIPSChartYAxis(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.chart.PSDEChartGridYAxisImpl());
	}
	protected <T> T createIPSDEChartDataGrid(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartDataGridImpl());
	}
	protected <T> T createIPSDEChartLegend(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartLegendImpl());
	}
	protected <T> T createIPSDEChartSeries(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "seriesType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("bar") || strTypeValue.equals("bar3d") || strTypeValue.equals("column")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesBarImpl());
			}
			if(strTypeValue.equals("candlestick")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesCandlestickImpl());
			}
			if(strTypeValue.equals("custom")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesCustomImpl());
			}
			if(strTypeValue.equals("funnel")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesFunnelImpl());
			}
			if(strTypeValue.equals("gauge")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesGaugeImpl());
			}
			if(strTypeValue.equals("area") || strTypeValue.equals("line")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesLineImpl());
			}
			if(strTypeValue.equals("map")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesMapImpl());
			}
			if(strTypeValue.equals("pie") || strTypeValue.equals("pie3d")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesPieImpl());
			}
			if(strTypeValue.equals("radar")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesRadarImpl());
			}
			if(strTypeValue.equals("scatter")){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartSeriesScatterImpl());
			}
		}
		return null;
	}
	protected <T> T createIPSDEChartTitle(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.chart.PSDEChartTitleImpl());
	}
	protected <T> T createIPSSysCounter(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.counter.PSSysCounterImpl());
	}
	protected <T> T createIPSDBPortletPart(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "portletType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("APPMENU")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl());
			}
			if(strTypeValue.equals("VIEW")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBAppViewPortletPartImpl());
			}
			if(strTypeValue.equals("CHART")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBChartPortletPartImpl());
			}
			if(strTypeValue.equals("CONTAINER")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBContainerPortletPartImpl());
			}
			if(strTypeValue.equals("CUSTOM")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBCustomPortletPartImpl());
			}
			if(strTypeValue.equals("FILTER")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBFilterPortletPartImpl());
			}
			if(strTypeValue.equals("HTML")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBHtmlPortletPartImpl());
			}
			if(strTypeValue.equals("LIST")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBListPortletPartImpl());
			}
			if(strTypeValue.equals("RAWITEM")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBRawItemPortletPartImpl());
			}
			if(strTypeValue.equals("REPORT")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBReportPortletPartImpl());
			}
			if(strTypeValue.equals("TOOLBAR")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBToolbarPortletPartImpl());
			}
			if(strTypeValue.equals("VIEW")){
				return (T)(new net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl());
			}
		}
		return (T)(new net.ibizsys.model.control.dashboard.PSDBPortletPartImpl());
	}
	protected <T> T createIPSDEDataViewDataItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.dataview.PSDEDataViewDataItemImpl());
	}
	protected <T> T createIPSDEDataViewItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.dataview.PSDEDataViewItemImpl());
	}
	protected <T> T createIPSDEDRBarGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.drctrl.PSDEDRBarGroupImpl());
	}
	protected <T> T createIPSDEDRCtrlItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.drctrl.PSDEDRBarItemImpl());
	}
	protected <T> T createIPSDEDRTabPage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.drctrl.PSDEDRTabPageImpl());
	}
	protected <T> T createIPSCheckBox(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSCheckBoxImpl());
	}
	protected <T> T createIPSColorPicker(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSColorPickerImpl());
	}
	protected <T> T createIPSDatePicker(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSDatePickerImpl());
	}
	protected <T> T createIPSHidden(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSHiddenImpl());
	}
	protected <T> T createIPSHtml(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSHtmlImpl());
	}
	protected <T> T createIPSIPAddress(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSIPAddressImpl());
	}
	protected <T> T createIPSMapPicker(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSMapPickerImpl());
	}
	protected <T> T createIPSNumberEditor(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSNumberEditorImpl());
	}
	protected <T> T createIPSOffice(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSOfficeImpl());
	}
	protected <T> T createIPSOffice2(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSOffice2Impl());
	}
	protected <T> T createIPSRaw(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.editor.PSRawImpl());
	}
	protected <T> T createIPSTabExpPage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl());
	}
	protected <T> T createIPSDEEditForm(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEEditFormImpl());
	}
	protected <T> T createIPSDEFDCatGroupLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.form.PSDEFDCatGroupLogicImpl());
	}
	protected <T> T createIPSDEFDGroupLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFDGroupLogicImpl());
	}
	protected <T> T createIPSDEFDLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return createIPSDEFDGroupLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDEFDSingleLogic(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEFDSingleLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFDSingleLogicImpl());
	}
	protected <T> T createIPSDEFFormItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.form.PSDEFFormItemImpl());
	}
	protected <T> T createIPSDEFIUpdateDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFIUpdateDetailImpl());
	}
	protected <T> T createIPSDEFormButton(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormButtonImpl());
	}
	protected <T> T createIPSDEFormButtonList(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormButtonListImpl());
	}
	protected <T> T createIPSDEFormDRUIPart(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormDRUIPartImpl());
	}
	protected <T> T createIPSDEFormDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "detailType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("FORMITEM")){
				return createIPSDEFormItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BUTTON")){
				return createIPSDEFormButton(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BUTTONLIST")){
				return createIPSDEFormButtonList(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DRUIPART")){
				return createIPSDEFormDRUIPart(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("GROUPPANEL")){
				return createIPSDEFormGroupPanel(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("IFRAME")){
				return createIPSDEFormIFrame(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FORMITEMEX")){
				return createIPSDEFormItemEx(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MDCTRL")){
				return createIPSDEFormMDCtrl(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FORMPAGE")){
				return createIPSDEFormPage(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWITEM")){
				return createIPSDEFormRawItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABPAGE")){
				return createIPSDEFormTabPage(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABPANEL")){
				return createIPSDEFormTabPanel(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USERCONTROL")){
				return createIPSDEFormUserControl(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEFormGroupPanel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormGroupPanelImpl());
	}
	protected <T> T createIPSDEFormIFrame(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormIFrameImpl());
	}
	protected <T> T createIPSDEFormItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormItemImpl());
	}
	protected <T> T createIPSDEFormItemEx(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.form.PSDEEditFormItemExImpl());
	}
	protected <T> T createIPSDEFormItemUpdate(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormItemUpdateImpl());
	}
	protected <T> T createIPSDEFormItemVR(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormItemVRImpl());
	}
	protected <T> T createIPSDEFormMDCtrl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormMDCtrlImpl());
	}
	protected <T> T createIPSDEFormPage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormPageImpl());
	}
	protected <T> T createIPSDEFormRawItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormRawItemImpl());
	}
	protected <T> T createIPSDEFormTabPage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormTabPageImpl());
	}
	protected <T> T createIPSDEFormTabPanel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormTabPanelImpl());
	}
	protected <T> T createIPSDEFormUserControl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.form.PSDEFormUserControlImpl());
	}
	protected <T> T createIPSDEGEIUpdateDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGEIUpdateDetailImpl());
	}
	protected <T> T createIPSDEGridColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "columnType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEFGRIDCOLUMN")){
				return createIPSDEGridFieldColumn(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("GROUPGRIDCOLUMN")){
				return createIPSDEGridGroupColumn(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("UAGRIDCOLUMN")){
				return createIPSDEGridUAColumn(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.control.grid.PSDEGridFieldColumnImpl());
	}
	protected <T> T createIPSDEGridDataItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridDataItemImpl());
	}
	protected <T> T createIPSDEGridEditItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.grid.HiddenPSDEGridEditItemImpl());
	}
	protected <T> T createIPSDEGridEditItemUpdate(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridEditItemUpdateImpl());
	}
	protected <T> T createIPSDEGridEditItemVR(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridEditItemVRImpl());
	}
	protected <T> T createIPSDEGridFieldColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridFieldColumnImpl());
	}
	protected <T> T createIPSDEGridGroupColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridGroupColumnImpl());
	}
	protected <T> T createIPSDEGridUAColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.grid.PSDEGridUAColumnImpl());
	}
	protected <T> T createIPSAbsoluteLayout(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSAbsoluteLayoutImpl());
	}
	protected <T> T createIPSAbsoluteLayoutPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSAbsoluteLayoutPosImpl());
	}
	protected <T> T createIPSBorderLayout(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSBorderLayoutImpl());
	}
	protected <T> T createIPSBorderLayoutPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSBorderLayoutPosImpl());
	}
	protected <T> T createIPSFlexLayout(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSFlexLayoutImpl());
	}
	protected <T> T createIPSFlexLayoutPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSFlexLayoutPosImpl());
	}
	protected <T> T createIPSGridLayout(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSGrid12LayoutImpl());
	}
	protected <T> T createIPSGridLayoutPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSGridLayoutPosImpl());
	}
	protected <T> T createIPSLayout(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "layout", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("FLEX") || strTypeValue.equals("SIMPLEFLEX")){
				return (T)(new net.ibizsys.model.control.layout.PSFlexLayoutImpl());
			}
			if(strTypeValue.equals("TABLE_12COL")){
				return (T)(new net.ibizsys.model.control.layout.PSGrid12LayoutImpl());
			}
			if(strTypeValue.equals("TABLE_24COL")){
				return (T)(new net.ibizsys.model.control.layout.PSGrid24LayoutImpl());
			}
			if(strTypeValue.equals("ABSOLUTE")){
				return createIPSAbsoluteLayout(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BORDER")){
				return createIPSBorderLayout(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FLEX")){
				return createIPSFlexLayout(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABLE_12COL") || strTypeValue.equals("TABLE_24COL")){
				return createIPSGridLayout(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABLE")){
				return createIPSTableLayout(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSLayoutPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "layout", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("FLEX") || strTypeValue.equals("SIMPLEFLEX")){
				return (T)(new net.ibizsys.model.control.layout.PSFlexLayoutPosImpl());
			}
			if(strTypeValue.equals("TABLE_12COL") || strTypeValue.equals("TABLE_24COL")){
				return (T)(new net.ibizsys.model.control.layout.PSGridLayoutPosImpl());
			}
			if(strTypeValue.equals("ABSOLUTE")){
				return createIPSAbsoluteLayoutPos(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BORDER")){
				return createIPSBorderLayoutPos(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FLEX")){
				return createIPSFlexLayoutPos(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABLE_12COL") || strTypeValue.equals("TABLE_24COL")){
				return createIPSGridLayoutPos(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABLE")){
				return createIPSTableLayoutPos(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSTableLayout(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSTableLayoutImpl());
	}
	protected <T> T createIPSTableLayoutPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.layout.PSTableLayoutPosImpl());
	}
	protected <T> T createIPSDEListDataItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.list.PSDEListDataItemImpl());
	}
	protected <T> T createIPSDEListItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.list.PSDEListItemImpl());
	}
	protected <T> T createIPSSysMapItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.map.PSSysMapItemImpl());
	}
	protected <T> T createIPSAppMenuItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "itemType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("APPMENUREF")){
				return (T)(new net.ibizsys.model.control.menu.PSAppMenuAMRefImpl());
			}
			if(strTypeValue.equals("MENUITEM")){
				return (T)(new net.ibizsys.model.control.menu.PSAppMenuItemImpl());
			}
			if(strTypeValue.equals("RAWITEM")){
				return (T)(new net.ibizsys.model.control.menu.PSAppMenuRawItemImpl());
			}
			if(strTypeValue.equals("SEPERATOR")){
				return (T)(new net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl());
			}
			if(strTypeValue.equals("RAWITEM")){
				return createIPSAppMenuRawItem(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.control.menu.PSAppMenuItemImpl());
	}
	protected <T> T createIPSAppMenuRawItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.menu.PSAppMenuRawItemImpl());
	}
	protected <T> T createIPSLayoutPanel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelImpl());
	}
	protected <T> T createIPSPanelButton(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelButtonImpl());
	}
	protected <T> T createIPSPanelButtonList(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelButtonListImpl());
	}
	protected <T> T createIPSPanelContainer(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelContainerImpl());
	}
	protected <T> T createIPSPanelControl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelControlImpl());
	}
	protected <T> T createIPSPanelCtrlPos(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelCtrlPosImpl());
	}
	protected <T> T createIPSPanelField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelFieldImpl());
	}
	protected <T> T createIPSPanelItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "itemType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("BUTTON")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelButtonImpl());
			}
			if(strTypeValue.equals("BUTTONLIST")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelButtonListImpl());
			}
			if(strTypeValue.equals("CONTAINER")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelContainerImpl());
			}
			if(strTypeValue.equals("CONTROL")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelControlImpl());
			}
			if(strTypeValue.equals("CTRLPOS")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelCtrlPosImpl());
			}
			if(strTypeValue.equals("FIELD")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelFieldImpl());
			}
			if(strTypeValue.equals("RAWITEM")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelRawItemImpl());
			}
			if(strTypeValue.equals("TAGPAGE")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelTabPageImpl());
			}
			if(strTypeValue.equals("TABPANEL")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelTabPanelImpl());
			}
			if(strTypeValue.equals("USERCONTROL")){
				return (T)(new net.ibizsys.model.control.panel.PSSysPanelUserControlImpl());
			}
			if(strTypeValue.equals("BUTTON")){
				return createIPSPanelButton(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BUTTONLIST")){
				return createIPSPanelButtonList(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("CONTAINER")){
				return createIPSPanelContainer(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("CONTROL")){
				return createIPSPanelControl(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("CTRLPOS")){
				return createIPSPanelCtrlPos(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FIELD")){
				return createIPSPanelField(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWITEM")){
				return createIPSPanelRawItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TABPANEL")){
				return createIPSPanelTabPanel(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USERCONTROL")){
				return createIPSPanelUserControl(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSPanelItemCatGroupLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.panel.PSPanelItemCatGroupLogicImpl());
	}
	protected <T> T createIPSPanelItemGroupLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.panel.PSPanelItemGroupLogicImpl());
	}
	protected <T> T createIPSPanelItemLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return createIPSPanelItemGroupLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSPanelItemSingleLogic(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSPanelItemSingleLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.panel.PSPanelItemSingleLogicImpl());
	}
	protected <T> T createIPSPanelRawItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelRawItemImpl());
	}
	protected <T> T createIPSPanelTabPage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelTabPageImpl());
	}
	protected <T> T createIPSPanelTabPanel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelTabPanelImpl());
	}
	protected <T> T createIPSPanelUserControl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysPanelUserControlImpl());
	}
	protected <T> T createIPSViewLayoutPanel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl());
	}
	protected <T> T createIPSHtmlItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.rawitem.PSHtmlItemImpl());
	}
	protected <T> T createIPSImageItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.rawitem.PSImageItemImpl());
	}
	protected <T> T createIPSMarkdownItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.rawitem.PSMarkdownItemImpl());
	}
	protected <T> T createIPSPlaceholderItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.rawitem.PSPlaceholderItemImpl());
	}
	protected <T> T createIPSTextItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.rawitem.PSTextItemImpl());
	}
	protected <T> T createIPSVideoItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.rawitem.PSVideoItemImpl());
	}
	protected <T> T createIPSSearchBarFilter(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl());
	}
	protected <T> T createIPSSearchBarGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.searchbar.PSSysSearchBarGroupImpl());
	}
	protected <T> T createIPSSearchBarQuickSearch(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.searchbar.PSSysSearchBarQuickSearchImpl());
	}
	protected <T> T createIPSDECMGroupItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl());
	}
	protected <T> T createIPSDECMRawItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBRawItemImpl());
	}
	protected <T> T createIPSDECMSeperatorItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBSeperatorItemImpl());
	}
	protected <T> T createIPSDECMUIActionItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl());
	}
	protected <T> T createIPSDEContextMenu(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.toolbar.PSDEContextMenuImpl());
	}
	protected <T> T createIPSDEContextMenuItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "itemType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("ITEMS")){
				return createIPSDECMGroupItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWITEM")){
				return createIPSDECMRawItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SEPERATOR")){
				return createIPSDECMSeperatorItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEUIACTION")){
				return createIPSDECMUIActionItem(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDETBGroupItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBGroupItemImpl());
	}
	protected <T> T createIPSDETBRawItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBRawItemImpl());
	}
	protected <T> T createIPSDETBSeperatorItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.toolbar.PSDETBSeperatorItemImpl());
	}
	protected <T> T createIPSDETBUIActionItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.toolbar.PSDETBUIActionItemImpl());
	}
	protected <T> T createIPSDEToolbarItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "itemType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("ITEMS")){
				return createIPSDETBGroupItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWITEM")){
				return createIPSDETBRawItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SEPERATOR")){
				return createIPSDETBSeperatorItem(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEUIACTION")){
				return createIPSDETBUIActionItem(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl());
	}
	protected <T> T createIPSDETreeCodeListNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeCodeListNodeImpl());
	}
	protected <T> T createIPSDETreeColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeColumnImpl());
	}
	protected <T> T createIPSDETreeDataSetNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeDataSetNodeImpl());
	}
	protected <T> T createIPSDETreeNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "treeNodeType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("CODELIST")){
				return createIPSDETreeCodeListNode(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DE")){
				return createIPSDETreeDataSetNode(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("STATIC")){
				return createIPSDETreeStaticNode(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDETreeNodeColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "columnType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEFGRIDCOLUMN")){
				return createIPSDETreeNodeFieldColumn(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("UAGRIDCOLUMN")){
				return createIPSDETreeNodeUAColumn(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeFieldColumnImpl());
	}
	protected <T> T createIPSDETreeNodeDataItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeDataItemImpl());
	}
	protected <T> T createIPSDETreeNodeEditItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.control.tree.HiddenPSDETreeNodeEditItemImpl());
	}
	protected <T> T createIPSDETreeNodeEditItemUpdate(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				//TODO：没有实现对象
				return null;
	}
	protected <T> T createIPSDETreeNodeFieldColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeFieldColumnImpl());
	}
	protected <T> T createIPSDETreeNodeRS(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeRSImpl());
	}
	protected <T> T createIPSDETreeNodeRSParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeRSParamImpl());
	}
	protected <T> T createIPSDETreeNodeRV(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeRVImpl());
	}
	protected <T> T createIPSDETreeNodeUAColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeNodeUAColumnImpl());
	}
	protected <T> T createIPSDETreeStaticNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.control.tree.PSDETreeStaticNodeImpl());
	}
	protected <T> T createIPSDEDBConfig(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSDEDBConfigImpl());
	}
	protected <T> T createIPSDEDBIndex(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSDEDBIndexImpl());
	}
	protected <T> T createIPSDEDBIndexField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSDEDBIndexFieldImpl());
	}
	protected <T> T createIPSDEDBTable(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSDEDBTableImpl());
	}
	protected <T> T createIPSDEFDTColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.database.PSDEFDTColumnImpl());
	}
	protected <T> T createIPSSysDBColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSysDBColumnImpl());
	}
	protected <T> T createIPSSysDBIndex(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSysDBIndexImpl());
	}
	protected <T> T createIPSSysDBIndexColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSysDBIndexColumnImpl());
	}
	protected <T> T createIPSSysDBScheme(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSysDBSchemeImpl());
	}
	protected <T> T createIPSSysDBTable(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSysDBTableImpl());
	}
	protected <T> T createIPSSysDBValueFunc(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSysDBValueFuncImpl());
	}
	protected <T> T createIPSSystemDBConfig(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.database.PSSystemDBConfigImpl());
	}
	protected <T> T createIPSDEGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.PSDEGroupImpl());
	}
	protected <T> T createIPSDEGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.PSDEGroupDetailImpl());
	}
	protected <T> T createIPSDataEntity(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.PSDataEntityImpl());
	}
	protected <T> T createIPSSysDEGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.PSSysDEGroupImpl());
	}
	protected <T> T createIPSDEACMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ac.PSDEACModeImpl());
	}
	protected <T> T createIPSDEACModeDataItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ac.PSDEACModeDataItemImpl());
	}
	protected <T> T createIPSDEAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "actionType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("BUILTIN")){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEBuiltinActionImpl());
			}
			if(strTypeValue.equals("INHERIT")){
				return createIPSDEInheritAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DELOGIC")){
				return createIPSDELogicAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("REMOTE")){
				return createIPSDERemoteAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SCRIPT")){
				return createIPSDEScriptAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SELECTBYKEY")){
				return createIPSDESelectByKeyAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USERCREATE")){
				return createIPSDEUserCreateAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USERCUSTOM")){
				return createIPSDEUserCustomAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USERSYSUPDATE")){
				return createIPSDEUserSysUpdateAction(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USERUPDATE")){
				return createIPSDEUserUpdateAction(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.action.PSDEUserCustomActionImpl());
	}
	protected <T> T createIPSDEActionGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionGroupImpl());
	}
	protected <T> T createIPSDEActionGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionGroupDetailImpl());
	}
	protected <T> T createIPSDEActionInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionInputImpl());
	}
	protected <T> T createIPSDEActionInputDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionInputDTOImpl());
	}
	protected <T> T createIPSDEActionInputDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionInputDTOFieldImpl());
	}
	protected <T> T createIPSDEActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionLogicImpl());
	}
	protected <T> T createIPSDEActionParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionParamImpl());
	}
	protected <T> T createIPSDEActionReturn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionReturnImpl());
	}
	protected <T> T createIPSDEActionVR(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEActionVRImpl());
	}
	protected <T> T createIPSDEInheritAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEInheritActionImpl());
	}
	protected <T> T createIPSDELogicAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDELogicActionImpl());
	}
	protected <T> T createIPSDERemoteAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDERemoteActionImpl());
	}
	protected <T> T createIPSDEScriptAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEScriptActionImpl());
	}
	protected <T> T createIPSDESelectByKeyAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDESelectByKeyActionImpl());
	}
	protected <T> T createIPSDEUserCreateAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEUserCreateActionImpl());
	}
	protected <T> T createIPSDEUserCustomAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEUserCustomActionImpl());
	}
	protected <T> T createIPSDEUserSysUpdateAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEUserSysUpdateActionImpl());
	}
	protected <T> T createIPSDEUserUpdateAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.action.PSDEUserUpdateActionImpl());
	}
	protected <T> T createIPSDEDataExport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataexport.PSDEDataExportImpl());
	}
	protected <T> T createIPSDEDataExportGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataexport.PSDEDataExportGroupImpl());
	}
	protected <T> T createIPSDEDataExportItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataexport.PSDEDataExportItemImpl());
	}
	protected <T> T createIPSDEDFJoinCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "condType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return createIPSDEDFJoinGroupCond(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDEDFJoinSingleCond(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEDFJoinGroupCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFJoinGroupCondImpl());
	}
	protected <T> T createIPSDEDFJoinSingleCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFJoinSingleCondImpl());
	}
	protected <T> T createIPSDEDataFlow(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowImpl());
	}
	protected <T> T createIPSDEDataFlowFilterCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "condType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return createIPSDEDataFlowFilterGroupCond(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDEDataFlowFilterSingleCond(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEDataFlowFilterGroupCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowFilterGroupCondImpl());
	}
	protected <T> T createIPSDEDataFlowFilterSingleCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowFilterSingleCondImpl());
	}
	protected <T> T createIPSDEDataFlowLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowLinkImpl());
	}
	protected <T> T createIPSDEDataFlowNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "nodeType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DFAGGREGATEPROCESS")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFAggregateProcessNodeImpl());
			}
			if(strTypeValue.equals("DFDEACTIONSINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFDEActionSinkNodeImpl());
			}
			if(strTypeValue.equals("DFDEDATAFLOWSINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataFlowSinkNodeImpl());
			}
			if(strTypeValue.equals("DFDEDATASETSOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataSetSourceNodeImpl());
			}
			if(strTypeValue.equals("DFDEDATASYNCSINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataSyncSinkNodeImpl());
			}
			if(strTypeValue.equals("DFDELOGICSINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFDELogicSinkNodeImpl());
			}
			if(strTypeValue.equals("DFJOINPROCESS")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl());
			}
			if(strTypeValue.equals("DFMERGEPROCESS")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl());
			}
			if(strTypeValue.equals("DFPREDEFINEDSOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFPredefinedSourceNodeImpl());
			}
			if(strTypeValue.equals("DFPREPAREPROCESS")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl());
			}
			if(strTypeValue.equals("DFSORTROCESS")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl());
			}
			if(strTypeValue.equals("DFSUBSYSSERVICEAPISINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSubSysServiceAPISinkNodeImpl());
			}
			if(strTypeValue.equals("DFSUBSYSSERVICEAPISOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSubSysServiceAPISourceNodeImpl());
			}
			if(strTypeValue.equals("DFSYSBDSCHEMESINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl());
			}
			if(strTypeValue.equals("DFSYSBDSCHEMESOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSourceNodeImpl());
			}
			if(strTypeValue.equals("DFSYSDBSCHEMESINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSinkNodeImpl());
			}
			if(strTypeValue.equals("DFSYSDBSCHEMESOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl());
			}
			if(strTypeValue.equals("DFSYSDATASYNCAGENTSINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl());
			}
			if(strTypeValue.equals("DFSYSDATASYNCAGENTSOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSourceNodeImpl());
			}
			if(strTypeValue.equals("DFSYSRESOURCESINK")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysResourceSinkNodeImpl());
			}
			if(strTypeValue.equals("DFSYSRESOURCESOURCE")){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDFSysResourceSourceNodeImpl());
			}
		}
		return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowNodeImpl());
	}
	protected <T> T createIPSDEDataFlowNodeFilter(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowNodeFilterImpl());
	}
	protected <T> T createIPSDEDataFlowNodeParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataflow.PSDEDataFlowNodeParamImpl());
	}
	protected <T> T createIPSDEDataImport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataimport.PSDEDataImportImpl());
	}
	protected <T> T createIPSDEDataImportItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dataimport.PSDEDataImportItemImpl());
	}
	protected <T> T createIPSDEMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapImpl());
	}
	protected <T> T createIPSDEMapAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapActionImpl());
	}
	protected <T> T createIPSDEMapDataQuery(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapDataQueryImpl());
	}
	protected <T> T createIPSDEMapDataSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapDataSetImpl());
	}
	protected <T> T createIPSDEMapField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.datamap.PSDEMapDetailImpl());
	}
	protected <T> T createIPSDEDataSync(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.datasync.PSDEDataSyncImpl());
	}
	protected <T> T createIPSDEFGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.PSDEFGroupImpl());
	}
	protected <T> T createIPSDEFGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.defield.PSDEFGroupDetailImpl());
	}
	protected <T> T createIPSDEFSearchMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.PSDEFSearchModeImpl());
	}
	protected <T> T createIPSDEFUIMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.PSDEFUIModeImpl());
	}
	protected <T> T createIPSDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.defield.PSDEFieldImpl());
	}
	protected <T> T createIPSLinkDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl());
	}
	protected <T> T createIPSOne2ManyDataDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				//TODO：存在多个实现对象
				return null;
	}
	protected <T> T createIPSOne2OneDataDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				//TODO：存在多个实现对象
				return null;
	}
	protected <T> T createIPSPickupDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.PSPickupDEFieldImpl());
	}
	protected <T> T createIPSDEFVRCondition(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "condType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl());
			}
			if(strTypeValue.equals("QUERYCOUNT")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRQueryCountConditionImpl());
			}
			if(strTypeValue.equals("REGEX")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRRegExConditionImpl());
			}
			if(strTypeValue.equals("SIMPLE")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSimpleConditionImpl());
			}
			if(strTypeValue.equals("STRINGLENGTH")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRStringLengthConditionImpl());
			}
			if(strTypeValue.equals("SYSVALUERULE")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSysValueRuleConditionImpl());
			}
			if(strTypeValue.equals("VALUERANGE2")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange2ConditionImpl());
			}
			if(strTypeValue.equals("VALUERANGE3")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRange3ConditionImpl());
			}
			if(strTypeValue.equals("VALUERANGE")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl());
			}
			if(strTypeValue.equals("VALUERECURSION")){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRecursionConditionImpl());
			}
			if(strTypeValue.equals("GROUP")){
				return createIPSDEFVRGroupCondition(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEFVRGroupCondition(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRGroupConditionImpl());
	}
	protected <T> T createIPSDEFValueRule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.defield.valuerule.PSDEFValueRuleImpl());
	}
	protected <T> T createIPSDER11(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDER11Impl());
	}
	protected <T> T createIPSDER1N(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDER1NImpl());
	}
	protected <T> T createIPSDER1NDEFieldMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDER1NDEFieldMapImpl());
	}
	protected <T> T createIPSDERAggData(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERAggDataImpl());
	}
	protected <T> T createIPSDERAggDataDEFieldMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERAggDataDEFieldMapImpl());
	}
	protected <T> T createIPSDERBase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "dERType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DER11")){
				return createIPSDER11(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DER1N")){
				return createIPSDER1N(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DERAGGDATA")){
				return createIPSDERAggData(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DERCUSTOM")){
				return createIPSDERCustom(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DERINDEX")){
				return createIPSDERIndex(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DERINHERIT")){
				return createIPSDERInherit(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DERMULINH")){
				return createIPSDERMultiInherit(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.der.PSDERBaseImpl());
	}
	protected <T> T createIPSDERCustom(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERCustomImpl());
	}
	protected <T> T createIPSDERGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.der.PSDERGroupImpl());
	}
	protected <T> T createIPSDERGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERGroupDetailImpl());
	}
	protected <T> T createIPSDERIndex(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERIndexImpl());
	}
	protected <T> T createIPSDERIndexDEFieldMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERIndexDEFieldMapImpl());
	}
	protected <T> T createIPSDERInherit(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERInheritImpl());
	}
	protected <T> T createIPSDERMultiInherit(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.der.PSDERMultiInheritImpl());
	}
	protected <T> T createIPSSysDERGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.der.PSSysDERGroupImpl());
	}
	protected <T> T createIPSDEDRDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRDetailImpl());
	}
	protected <T> T createIPSDEDRGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRGroupImpl());
	}
	protected <T> T createIPSDEDRItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "itemType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("CUSTOM")){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRCustomItemImpl());
			}
			if(strTypeValue.equals("DER11")){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRDER11ItemImpl());
			}
			if(strTypeValue.equals("DER1N")){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRDER1NItemImpl());
			}
			if(strTypeValue.equals("SYSDER11")){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRSysDER11ItemImpl());
			}
			if(strTypeValue.equals("SYSDER1N")){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDRSysDER1NItemImpl());
			}
		}
		return null;
	}
	protected <T> T createIPSDEDataRelation(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dr.PSDEDataRelationImpl());
	}
	protected <T> T createIPSDEDQColumn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDQColumnImpl());
	}
	protected <T> T createIPSDEDQCondition(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "condType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("CUSTOM")){
				return createIPSDEDQCustomCondition(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDEDQFieldCondition(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("GROUP")){
				return createIPSDEDQGroupCondition(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEDQCustomCondition(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDQCustomConditionImpl());
	}
	protected <T> T createIPSDEDQFieldCondition(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDQFieldConditionImpl());
	}
	protected <T> T createIPSDEDQGroupCondition(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDQGroupConditionImpl());
	}
	protected <T> T createIPSDEDQJoin(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDQJoinImpl());
	}
	protected <T> T createIPSDEDQMain(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDQMainImpl());
	}
	protected <T> T createIPSDEDataQuery(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataQueryImpl());
	}
	protected <T> T createIPSDEDataQueryCode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl());
	}
	protected <T> T createIPSDEDataQueryCodeCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeCondImp());
	}
	protected <T> T createIPSDEDataQueryCodeExp(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeExpImp());
	}
	protected <T> T createIPSDEDataQueryInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataQueryInputImpl());
	}
	protected <T> T createIPSDEDataQueryReturn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataQueryReturnImpl());
	}
	protected <T> T createIPSDEDataSet(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataSetImpl());
	}
	protected <T> T createIPSDEDataSetGroupParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataSetGroupParamImpl());
	}
	protected <T> T createIPSDEDataSetInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataSetInputImpl());
	}
	protected <T> T createIPSDEDataSetInputDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEFilterDTOImpl());
	}
	protected <T> T createIPSDEDataSetParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataSetParamImpl());
	}
	protected <T> T createIPSDEDataSetReturn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEDataSetReturnImpl());
	}
	protected <T> T createIPSDEFilterDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEFilterDTOImpl());
	}
	protected <T> T createIPSDEFilterDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.ds.PSDEFilterDTOFieldImpl());
	}
	protected <T> T createIPSDEDTSQueue(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.dts.PSDEDTSQueueImpl());
	}
	protected <T> T createIPSDEAggregateParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEAggregateParamLogicImpl());
	}
	protected <T> T createIPSDEAppendParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl());
	}
	protected <T> T createIPSDEBeginLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEBeginLogicImpl());
	}
	protected <T> T createIPSDEBindParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEBindParamLogicImpl());
	}
	protected <T> T createIPSDECancelWFLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl());
	}
	protected <T> T createIPSDECommitLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDECommitLogicImpl());
	}
	protected <T> T createIPSDECopyParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl());
	}
	protected <T> T createIPSDEDEActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEActionLogicImpl());
	}
	protected <T> T createIPSDEDEDTSQueueLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEDTSQueueLogicImpl());
	}
	protected <T> T createIPSDEDEDataFlowLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEDataFlowLogicImpl());
	}
	protected <T> T createIPSDEDEDataQueryLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl());
	}
	protected <T> T createIPSDEDEDataSetLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEDataSetLogicImpl());
	}
	protected <T> T createIPSDEDEDataSyncLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEDataSyncLogicImpl());
	}
	protected <T> T createIPSDEDELogicLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDELogicLogicImpl());
	}
	protected <T> T createIPSDEDENotifyLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDENotifyLogicImpl());
	}
	protected <T> T createIPSDEDEPrintLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEPrintLogicImpl());
	}
	protected <T> T createIPSDEDEReportLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDEReportLogicImpl());
	}
	protected <T> T createIPSDEDebugParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDebugParamLogicImpl());
	}
	protected <T> T createIPSDEDecisionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEDecisionLogicImpl());
	}
	protected <T> T createIPSDEEndLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl());
	}
	protected <T> T createIPSDEFLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEFLogicImpl());
	}
	protected <T> T createIPSDEFilterParam2Logic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEFilterParam2LogicImpl());
	}
	protected <T> T createIPSDEFilterParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEFilterParamLogicImpl());
	}
	protected <T> T createIPSDELogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicSubType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEFIELD")){
				return createIPSDEFLogic(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicImpl());
	}
	protected <T> T createIPSDELogicLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicLinkImpl());
	}
	protected <T> T createIPSDELogicLinkCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicLinkGroupCondImpl());
			}
			if(strTypeValue.equals("SINGLE")){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicLinkSingleCondImpl());
			}
			if(strTypeValue.equals("GROUP")){
				return createIPSDELogicLinkGroupCond(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDELogicLinkSingleCond(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDELogicLinkGroupCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicLinkGroupCondImpl());
	}
	protected <T> T createIPSDELogicLinkSingleCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicLinkSingleCondImpl());
	}
	protected <T> T createIPSDELogicNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicNodeType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("AGGREGATEPARAM")){
				return createIPSDEAggregateParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPENDPARAM")){
				return createIPSDEAppendParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BEGIN")){
				return createIPSDEBeginLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BINDPARAM")){
				return createIPSDEBindParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("CANCELWF")){
				return createIPSDECancelWFLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("COMMIT")){
				return createIPSDECommitLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("COPYPARAM")){
				return createIPSDECopyParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEACTION")){
				return createIPSDEDEActionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEBUGPARAM")){
				return createIPSDEDebugParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DECISION")){
				return createIPSDEDecisionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDATAFLOW")){
				return createIPSDEDEDataFlowLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDATAQUERY")){
				return createIPSDEDEDataQueryLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDATASET")){
				return createIPSDEDEDataSetLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDATASYNC")){
				return createIPSDEDEDataSyncLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDTSQUEUE")){
				return createIPSDEDEDTSQueueLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DELOGIC")){
				return createIPSDEDELogicLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DENOTIFY")){
				return createIPSDEDENotifyLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEPRINT")){
				return createIPSDEDEPrintLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEREPORT")){
				return createIPSDEDEReportLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("END")){
				return createIPSDEEndLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FILTERPARAM2")){
				return createIPSDEFilterParam2Logic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("FILTERPARAM")){
				return createIPSDEFilterParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("LOOPSUBCALL")){
				return createIPSDELoopSubCallLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MEMO")){
				return createIPSDEMemoLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MERGEPARAM")){
				return createIPSDEMergeParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("PREPAREPARAM")){
				return createIPSDEPrepareParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWSFCODE")){
				return createIPSDERawCodeLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWSQLANDLOOPCALL")){
				return createIPSDERawSqlAndLoopCallLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWSQLCALL")){
				return createIPSDERawSqlCallLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWWEBCALL")){
				return createIPSDERawWebCallLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RENEWPARAM")){
				return createIPSDERenewParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RESETPARAM")){
				return createIPSDEResetParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("ROLLBACK")){
				return createIPSDERollbackLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SFPLUGIN")){
				return createIPSDESFPluginLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SORTPARAM")){
				return createIPSDESortParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("STARTWF")){
				return createIPSDEStartWFLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SUBMITWF")){
				return createIPSDESubmitWFLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SUBSYSSAMETHOD")){
				return createIPSDESubSysSAMethodLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSAICHATAGENT")){
				return createIPSDESysAIChatAgentLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSAIPIPELINEAGENT")){
				return createIPSDESysAIPipelineAgentLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSBDTABLEACTION")){
				return createIPSDESysBDTableActionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSDATASYNCAGENTOUT")){
				return createIPSDESysDataSyncAgentOutLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSDBTABLEACTION")){
				return createIPSDESysDBTableActionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSLOGIC")){
				return createIPSDESysLogicLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSSEARCHDOCACTION")){
				return createIPSDESysSearchDocActionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SYSUTIL")){
				return createIPSDESysUtilLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("THROWEXCEPTION")){
				return createIPSDEThrowExceptionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("USER")){
				return createIPSDEUserLogic(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl());
	}
	protected <T> T createIPSDELogicNodeParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicNodeParamImpl());
	}
	protected <T> T createIPSDELogicParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELogicParamImpl());
	}
	protected <T> T createIPSDELogicParamBase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				//TODO：没有实现对象
				return null;
	}
	protected <T> T createIPSDELoopSubCallLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDELoopSubCallLogicImpl());
	}
	protected <T> T createIPSDEMSLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl());
	}
	protected <T> T createIPSDEMSLogicLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkImpl());
	}
	protected <T> T createIPSDEMSLogicLinkCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl());
			}
			if(strTypeValue.equals("SINGLE")){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkSingleCondImpl());
			}
			if(strTypeValue.equals("GROUP")){
				return createIPSDEMSLogicLinkGroupCond(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDEMSLogicLinkSingleCond(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEMSLogicLinkGroupCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl());
	}
	protected <T> T createIPSDEMSLogicLinkSingleCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkSingleCondImpl());
	}
	protected <T> T createIPSDEMSLogicNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicNodeType", null);
		if(StringUtils.hasLength(strTypeValue)){
		}
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEMSLogicNodeImpl());
	}
	protected <T> T createIPSDEMemoLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMemoLogicImpl());
	}
	protected <T> T createIPSDEMergeParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl());
	}
	protected <T> T createIPSDEPrepareParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEPrepareParamLogicImpl());
	}
	protected <T> T createIPSDERawCodeLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDERawCodeLogicImpl());
	}
	protected <T> T createIPSDERawSqlAndLoopCallLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDERawSqlAndLoopCallLogicImpl());
	}
	protected <T> T createIPSDERawSqlCallLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl());
	}
	protected <T> T createIPSDERawWebCallLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl());
	}
	protected <T> T createIPSDERenewParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDERenewParamLogicImpl());
	}
	protected <T> T createIPSDEResetParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEResetParamLogicImpl());
	}
	protected <T> T createIPSDERollbackLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDERollbackLogicImpl());
	}
	protected <T> T createIPSDESFPluginLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESFPluginLogicImpl());
	}
	protected <T> T createIPSDESortParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESortParamLogicImpl());
	}
	protected <T> T createIPSDEStartWFLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl());
	}
	protected <T> T createIPSDESubSysSAMethodLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESubSysSAMethodLogicImpl());
	}
	protected <T> T createIPSDESubmitWFLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESubmitWFLogicImpl());
	}
	protected <T> T createIPSDESysAIChatAgentLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl());
	}
	protected <T> T createIPSDESysAIPipelineAgentLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysAIPipelineAgentLogicImpl());
	}
	protected <T> T createIPSDESysBDTableActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl());
	}
	protected <T> T createIPSDESysDBTableActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl());
	}
	protected <T> T createIPSDESysDataSyncAgentOutLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysDataSyncAgentOutLogicImpl());
	}
	protected <T> T createIPSDESysLogicLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysLogicLogicImpl());
	}
	protected <T> T createIPSDESysSearchDocActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl());
	}
	protected <T> T createIPSDESysUtilLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDESysUtilLogicImpl());
	}
	protected <T> T createIPSDEThrowExceptionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEThrowExceptionLogicImpl());
	}
	protected <T> T createIPSDEUIActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIActionLogicImpl());
	}
	protected <T> T createIPSDEUIAppendParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIAppendParamLogicImpl());
	}
	protected <T> T createIPSDEUIBeginLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIBeginLogicImpl());
	}
	protected <T> T createIPSDEUIBindParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIBindParamLogicImpl());
	}
	protected <T> T createIPSDEUICopyParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUICopyParamLogicImpl());
	}
	protected <T> T createIPSDEUICtrlFireEventLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl());
	}
	protected <T> T createIPSDEUICtrlInvokeLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl());
	}
	protected <T> T createIPSDEUIDEActionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl());
	}
	protected <T> T createIPSDEUIDEDataSetLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIDEDataSetLogicImpl());
	}
	protected <T> T createIPSDEUIDELogicLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIDELogicLogicImpl());
	}
	protected <T> T createIPSDEUIDebugParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIDebugParamLogicImpl());
	}
	protected <T> T createIPSDEUIDecisionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIDecisionLogicImpl());
	}
	protected <T> T createIPSDEUIEndLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIEndLogicImpl());
	}
	protected <T> T createIPSDEUILogicLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicLinkImpl());
	}
	protected <T> T createIPSDEUILogicLinkCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicLinkGroupCondImpl());
			}
			if(strTypeValue.equals("SINGLE")){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicLinkSingleCondImpl());
			}
			if(strTypeValue.equals("GROUP")){
				return createIPSDEUILogicLinkGroupCond(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSDEUILogicLinkSingleCond(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSDEUILogicLinkGroupCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicLinkGroupCondImpl());
	}
	protected <T> T createIPSDEUILogicLinkSingleCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicLinkSingleCondImpl());
	}
	protected <T> T createIPSDEUILogicNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "logicNodeType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEUIACTION")){
				return createIPSDEUIActionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("APPENDPARAM")){
				return createIPSDEUIAppendParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BEGIN")){
				return createIPSDEUIBeginLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("BINDPARAM")){
				return createIPSDEUIBindParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("COPYPARAM")){
				return createIPSDEUICopyParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("VIEWCTRLFIREEVENT")){
				return createIPSDEUICtrlFireEventLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("VIEWCTRLINVOKE")){
				return createIPSDEUICtrlInvokeLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEACTION")){
				return createIPSDEUIDEActionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEBUGPARAM")){
				return createIPSDEUIDebugParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DECISION")){
				return createIPSDEUIDecisionLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDATASET")){
				return createIPSDEUIDEDataSetLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DELOGIC")){
				return createIPSDEUIDELogicLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("END")){
				return createIPSDEUIEndLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("LOOPSUBCALL")){
				return createIPSDEUILoopSubCallLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MEMO")){
				return createIPSDEUIMemoLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("MSGBOX")){
				return createIPSDEUIMsgBoxLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("PFPLUGIN")){
				return createIPSDEUIPFPluginLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RAWJSCODE")){
				return createIPSDEUIRawCodeLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RENEWPARAM")){
				return createIPSDEUIRenewParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("RESETPARAM")){
				return createIPSDEUIResetParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SORTPARAM")){
				return createIPSDEUISortParamLogic(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("THROWEXCEPTION")){
				return createIPSDEUIThrowExceptionLogic(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl());
	}
	protected <T> T createIPSDEUILogicNodeParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicNodeParamImpl());
	}
	protected <T> T createIPSDEUILogicParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILogicParamImpl());
	}
	protected <T> T createIPSDEUILoopSubCallLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUILoopSubCallLogicImpl());
	}
	protected <T> T createIPSDEUIMemoLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIMemoLogicImpl());
	}
	protected <T> T createIPSDEUIMsgBoxLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl());
	}
	protected <T> T createIPSDEUIPFPluginLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIPFPluginLogicImpl());
	}
	protected <T> T createIPSDEUIRawCodeLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIRawCodeLogicImpl());
	}
	protected <T> T createIPSDEUIRenewParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIRenewParamLogicImpl());
	}
	protected <T> T createIPSDEUIResetParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIResetParamLogicImpl());
	}
	protected <T> T createIPSDEUISortParamLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUISortParamLogicImpl());
	}
	protected <T> T createIPSDEUIThrowExceptionLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl());
	}
	protected <T> T createIPSDEUserLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl());
	}
	protected <T> T createIPSDEMainState(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.mainstate.PSDEMainStateImpl());
	}
	protected <T> T createIPSDEMainStateAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.mainstate.PSDEMainStateActionImpl());
	}
	protected <T> T createIPSDEMainStateField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.mainstate.PSDEMainStateFieldImpl());
	}
	protected <T> T createIPSDEMainStateOPPriv(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.mainstate.PSDEMainStateOPPrivImpl());
	}
	protected <T> T createIPSDENotify(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.notify.PSDENotifyImpl());
	}
	protected <T> T createIPSDENotifyTarget(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.notify.PSDENotifyTargetImpl());
	}
	protected <T> T createIPSDEPrint(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.print.PSDEPrintImpl());
	}
	protected <T> T createIPSDEOPPriv(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.priv.PSDEOPPrivImpl());
	}
	protected <T> T createIPSDEUserRole(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl());
	}
	protected <T> T createIPSDEUserRoleOPPriv(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl());
	}
	protected <T> T createIPSSysDEOPPriv(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.priv.PSSysDEOPPrivImpl());
	}
	protected <T> T createIPSDEReport(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.report.PSDEReportImpl());
	}
	protected <T> T createIPSDEReportItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.report.PSDEReportItemImpl());
	}
	protected <T> T createIPSDESearch(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.search.PSDESearchImpl());
	}
	protected <T> T createIPSDEMethodDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "type", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEACTIONINPUT")){
				return createIPSDEActionInputDTO(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEDATASETINPUT")){
				return createIPSDEDataSetInputDTO(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEFILTER")){
				return createIPSDEFilterDTO(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("LINK")){
				return createIPSLinkDEMethodDTO(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.service.PSDEMethodDTOImpl());
	}
	protected <T> T createIPSDEMethodDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "sourceType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("DEACTIONPARAM")){
				return createIPSDEActionInputDTOField(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEFSEARCHMODE")){
				return createIPSDEFilterDTOField(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.dataentity.service.PSDEMethodDTOFieldImpl());
	}
	protected <T> T createIPSDEServiceAPI(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSDEServiceAPIImpl());
	}
	protected <T> T createIPSDEServiceAPIField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSDEServiceAPIFieldImpl());
	}
	protected <T> T createIPSDEServiceAPIMethod(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodImpl());
	}
	protected <T> T createIPSDEServiceAPIMethodInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodInputImpl());
	}
	protected <T> T createIPSDEServiceAPIMethodReturn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSDEServiceAPIMethodReturnImpl());
	}
	protected <T> T createIPSDEServiceAPIRS(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSDEServiceAPIRSImpl());
	}
	protected <T> T createIPSLinkDEMethodDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.service.PSLinkDEMethodDTOImpl());
	}
	protected <T> T createIPSDEUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl());
	}
	protected <T> T createIPSDEUIActionGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl());
	}
	protected <T> T createIPSDEUniState(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.unistate.PSDEUniStateImpl());
	}
	protected <T> T createIPSDEUtil(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.util.PSDEUtilImpl());
	}
	protected <T> T createIPSDEWF(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.wf.PSDEWFImpl());
	}
	protected <T> T createIPSDEWizard(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.wizard.PSDEWizardImpl());
	}
	protected <T> T createIPSDEWizardForm(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.wizard.PSDEWizardFormImpl());
	}
	protected <T> T createIPSDEWizardStep(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dataentity.wizard.PSDEWizardStepImpl());
	}
	protected <T> T createIPSSysDTSQueue(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.dts.PSSysDTSQueueImpl());
	}
	protected <T> T createIPSDynaModel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dynamodel.PSSysDynaModelImpl());
	}
	protected <T> T createIPSDynaModelAttr(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dynamodel.PSSysDynaModelAttrImpl());
	}
	protected <T> T createIPSSysDynaModel(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "usage", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("LIQUIBASECHANGELOG")){
				return (T)(new net.ibizsys.model.dynamodel.PSLiquibaseChangeLogModelImpl());
			}
			if(strTypeValue.equals("OPENAPI3SCHEMA")){
				return (T)(new net.ibizsys.model.dynamodel.PSOpenAPI3SchemaModelImpl());
			}
		}
		return (T)(new net.ibizsys.model.dynamodel.PSSysDynaModelImpl());
	}
	protected <T> T createIPSSysEAIDE(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIDEImpl());
	}
	protected <T> T createIPSSysEAIDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIDEFieldImpl());
	}
	protected <T> T createIPSSysEAIDER(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIDERImpl());
	}
	protected <T> T createIPSSysEAIDataType(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIDataTypeImpl());
	}
	protected <T> T createIPSSysEAIDataTypeItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIDataTypeItemImpl());
	}
	protected <T> T createIPSSysEAIElement(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIElementImpl());
	}
	protected <T> T createIPSSysEAIElementAttr(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIElementAttrImpl());
	}
	protected <T> T createIPSSysEAIElementRE(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.eai.PSSysEAIElementREImpl());
	}
	protected <T> T createIPSSysERMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.er.PSSysERMapImpl());
	}
	protected <T> T createIPSSysERMapNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.er.PSSysERMapNodeImpl());
	}
	protected <T> T createIPSSysMsgQueue(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.msg.PSSysMsgQueueImpl());
	}
	protected <T> T createIPSSysMsgTarget(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.msg.PSSysMsgTargetImpl());
	}
	protected <T> T createIPSSysMsgTempl(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.msg.PSSysMsgTemplImpl());
	}
	protected <T> T createIPSSysSFPub(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.pub.PSSysSFPubImpl());
	}
	protected <T> T createIPSSysSFPubPkg(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.pub.PSSysSFPubPkgImpl());
	}
	protected <T> T createIPSSysReqItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.requirement.PSSysReqItemImpl());
	}
	protected <T> T createIPSSysReqModule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.requirement.PSSysReqModuleImpl());
	}
	protected <T> T createIPSCtrlMsg(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSCtrlMsgImpl());
	}
	protected <T> T createIPSCtrlMsgItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSCtrlMsgItemImpl());
	}
	protected <T> T createIPSLanguageItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSLanguageItemImpl());
	}
	protected <T> T createIPSLanguageRes(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSLanguageResImpl());
	}
	protected <T> T createIPSSysContent(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysContentImpl());
	}
	protected <T> T createIPSSysContentCat(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysContentCatImpl());
	}
	protected <T> T createIPSSysCss(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysCssImpl());
	}
	protected <T> T createIPSSysDataSyncAgent(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysDataSyncAgentImpl());
	}
	protected <T> T createIPSSysDictCat(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysDictCatImpl());
	}
	protected <T> T createIPSSysEditorStyle(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysEditorStyleImpl());
	}
	protected <T> T createIPSSysI18N(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysI18NImpl());
	}
	protected <T> T createIPSSysImage(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysImageImpl());
	}
	protected <T> T createIPSSysLan(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysLanImpl());
	}
	protected <T> T createIPSSysLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysLogicImpl());
	}
	protected <T> T createIPSSysPDTView(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysPDTViewImpl());
	}
	protected <T> T createIPSSysPFPlugin(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysPFPluginImpl());
	}
	protected <T> T createIPSSysResource(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysResourceImpl());
	}
	protected <T> T createIPSSysSFPlugin(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysSFPluginImpl());
	}
	protected <T> T createIPSSysSampleValue(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysSampleValueImpl());
	}
	protected <T> T createIPSSysSequence(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysSequenceImpl());
	}
	protected <T> T createIPSSysTranslator(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysTranslatorImpl());
	}
	protected <T> T createIPSSysUniState(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysUniStateImpl());
	}
	protected <T> T createIPSSysUtil(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.res.PSSysUtilImpl());
	}
	protected <T> T createIPSSysSearchDE(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.search.PSSysSearchDEImpl());
	}
	protected <T> T createIPSSysSearchDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.search.PSSysSearchDEFieldImpl());
	}
	protected <T> T createIPSSysSearchDoc(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.search.PSSysSearchDocImpl());
	}
	protected <T> T createIPSSysSearchField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.search.PSSysSearchFieldImpl());
	}
	protected <T> T createIPSSysSearchScheme(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.search.PSSysSearchSchemeImpl());
	}
	protected <T> T createIPSSysUniRes(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.security.PSSysUniResImpl());
	}
	protected <T> T createIPSSysUserDR(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.security.PSSysUserDRImpl());
	}
	protected <T> T createIPSSysUserMode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.security.PSSysUserModeImpl());
	}
	protected <T> T createIPSSysUserRole(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.security.PSSysUserRoleImpl());
	}
	protected <T> T createIPSSysUserRoleData(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.security.PSSysUserRoleDataImpl());
	}
	protected <T> T createIPSSysUserRoleRes(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.security.PSSysUserRoleResImpl());
	}
	protected <T> T createIPSSubSysServiceAPI(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIImpl());
	}
	protected <T> T createIPSSubSysServiceAPIDE(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIDEImpl());
	}
	protected <T> T createIPSSubSysServiceAPIDEField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIDEFieldImpl());
	}
	protected <T> T createIPSSubSysServiceAPIDEMethod(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIMethodImpl());
	}
	protected <T> T createIPSSubSysServiceAPIDERS(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIDERSImpl());
	}
	protected <T> T createIPSSubSysServiceAPIDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIDTOImpl());
	}
	protected <T> T createIPSSubSysServiceAPIDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIDTOFieldImpl());
	}
	protected <T> T createIPSSubSysServiceAPIMethodInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIMethodInputImpl());
	}
	protected <T> T createIPSSubSysServiceAPIMethodReturn(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSubSysServiceAPIMethodReturnImpl());
	}
	protected <T> T createIPSSysMethodDTO(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSysMethodDTOImpl());
	}
	protected <T> T createIPSSysMethodDTOField(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSysMethodDTOFieldImpl());
	}
	protected <T> T createIPSSysServiceAPI(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.service.PSSysServiceAPIImpl());
	}
	protected <T> T createIPSOpenAPI3Schema(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.service.openapi.PSOpenAPI3SchemaImpl());
	}
	protected <T> T createIPSSysModelGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.system.PSSysModelGroupImpl());
	}
	protected <T> T createIPSSysRef(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.system.PSSysRefImpl());
	}
	protected <T> T createIPSSystemModule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.system.PSSystemModuleImpl());
	}
	protected <T> T createIPSDEActionTestCase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestCaseImpl());
	}
	protected <T> T createIPSDEFVRTestCase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestCaseImpl());
	}
	protected <T> T createIPSSysTestCase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "testCaseType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("APPVIEW") || strTypeValue.equals("CUSTOM") || strTypeValue.equals("DESADETAIL")){
				return (T)(new net.ibizsys.model.testing.PSSysTestCase2Impl());
			}
			if(strTypeValue.equals("DEACTION")){
				return createIPSDEActionTestCase(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("DEFVR")){
				return createIPSDEFVRTestCase(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.testing.PSSysTestCaseImpl());
	}
	protected <T> T createIPSSysTestCaseAssert(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestCaseAssertImpl());
	}
	protected <T> T createIPSSysTestCaseInput(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestCaseInputImpl());
	}
	protected <T> T createIPSSysTestData(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestDataImpl());
	}
	protected <T> T createIPSSysTestDataItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestDataItemImpl());
	}
	protected <T> T createIPSSysTestModule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestModuleImpl());
	}
	protected <T> T createIPSSysTestPrj(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.testing.PSSysTestPrjImpl());
	}
	protected <T> T createIPSSysActor(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.uml.PSSysActorImpl());
	}
	protected <T> T createIPSSysUCMap(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.uml.PSSysUCMapImpl());
	}
	protected <T> T createIPSSysUCMapNode(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.uml.PSSysUCMapNodeImpl());
	}
	protected <T> T createIPSSysUseCase(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.uml.PSSysUseCaseImpl());
	}
	protected <T> T createIPSSysUseCaseRS(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.uml.PSSysUseCaseRSImpl());
	}
	protected <T> T createIPSSysValueRule(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.valuerule.PSSysValueRuleImpl());
	}
	protected <T> T createIPSUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl());
	}
	protected <T> T createIPSUIActionGroup(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl());
	}
	protected <T> T createIPSUIActionGroupDetail(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupDetailImpl());
	}
	protected <T> T createIPSUIEngineParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		return (T)(new net.ibizsys.model.app.view.PSAppViewEngineParamImpl());
	}
	protected <T> T createIPSWFDE(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFDEImpl());
	}
	protected <T> T createIPSWFDEActionProcess(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFDEActionProcessImpl());
	}
	protected <T> T createIPSWFEmbedWFReturnLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFEmbedWFReturnLinkImpl());
	}
	protected <T> T createIPSWFEndProcess(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.EndPSWFProcessImpl());
	}
	protected <T> T createIPSWFInteractiveLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFInteractiveLinkImpl());
	}
	protected <T> T createIPSWFInteractiveProcess(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFInteractiveProcessImpl());
	}
	protected <T> T createIPSWFLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "wFLinkType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("WFRETURN")){
				return createIPSWFEmbedWFReturnLink(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("IAACTION")){
				return createIPSWFInteractiveLink(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("ROUTE")){
				return createIPSWFRouteLink(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TIMEOUT")){
				return createIPSWFTimeoutLink(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.wf.PSWFLinkImpl());
	}
	protected <T> T createIPSWFLinkCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "condType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("GROUP")){
				return createIPSWFLinkGroupCond(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("SINGLE")){
				return createIPSWFLinkSingleCond(parentPSModelObject, cls, objNode);
			}
		}
		return null;
	}
	protected <T> T createIPSWFLinkGroupCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFLinkGroupCondImpl());
	}
	protected <T> T createIPSWFLinkRole(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFLinkRoleImpl());
	}
	protected <T> T createIPSWFLinkSingleCond(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFLinkSingleCondImpl());
	}
	protected <T> T createIPSWFProcess(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
		String strTypeValue = net.ibizsys.model.PSObjectImplBase.getString(objNode, "wFProcessType", null);
		if(StringUtils.hasLength(strTypeValue)){
			if(strTypeValue.equals("END")){
				return (T)(new net.ibizsys.model.wf.EndPSWFProcessImpl());
			}
			if(strTypeValue.equals("CALLORGACTIVITY")){
				return (T)(new net.ibizsys.model.wf.PSWFCallOrgActivityProcessImpl());
			}
			if(strTypeValue.equals("PROCESS")){
				return (T)(new net.ibizsys.model.wf.PSWFDEActionProcessImpl());
			}
			if(strTypeValue.equals("EMBED")){
				return (T)(new net.ibizsys.model.wf.PSWFEmbedWFProcessImpl());
			}
			if(strTypeValue.equals("EXCLUSIVEGATEWAY")){
				return (T)(new net.ibizsys.model.wf.PSWFExclusiveGatewayProcessImpl());
			}
			if(strTypeValue.equals("INCLUSIVEGATEWAY")){
				return (T)(new net.ibizsys.model.wf.PSWFInclusiveGatewayProcessImpl());
			}
			if(strTypeValue.equals("INTERACTIVE")){
				return (T)(new net.ibizsys.model.wf.PSWFInteractiveProcessImpl());
			}
			if(strTypeValue.equals("PARALLELGATEWAY")){
				return (T)(new net.ibizsys.model.wf.PSWFParallelGatewayProcessImpl());
			}
			if(strTypeValue.equals("PARALLEL")){
				return (T)(new net.ibizsys.model.wf.PSWFParallelSubWFProcessImpl());
			}
			if(strTypeValue.equals("TIMEREVENT")){
				return (T)(new net.ibizsys.model.wf.PSWFTimerEventProcessImpl());
			}
			if(strTypeValue.equals("START")){
				return (T)(new net.ibizsys.model.wf.StartPSWFProcessImpl());
			}
			if(strTypeValue.equals("END")){
				return createIPSWFEndProcess(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("PROCESS")){
				return createIPSWFDEActionProcess(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("INTERACTIVE")){
				return createIPSWFInteractiveProcess(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("START")){
				return createIPSWFStartProcess(parentPSModelObject, cls, objNode);
			}
			if(strTypeValue.equals("TIMEREVENT")){
				return createIPSWFTimerEventProcess(parentPSModelObject, cls, objNode);
			}
		}
		return (T)(new net.ibizsys.model.wf.PSWFProcessImpl());
	}
	protected <T> T createIPSWFProcessParam(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFProcessParamImpl());
	}
	protected <T> T createIPSWFProcessRole(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFProcessRoleImpl());
	}
	protected <T> T createIPSWFProcessSubWF(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFProcessSubWFImpl());
	}
	protected <T> T createIPSWFRole(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFRoleImpl());
	}
	protected <T> T createIPSWFRouteLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFRouteLinkImpl());
	}
	protected <T> T createIPSWFStartProcess(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.StartPSWFProcessImpl());
	}
	protected <T> T createIPSWFTimeoutLink(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFTimeoutLinkImpl());
	}
	protected <T> T createIPSWFTimerEventProcess(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFTimerEventProcessImpl());
	}
	protected <T> T createIPSWFUtilUIAction(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFUtilUIActionImpl());
	}
	protected <T> T createIPSWFVersion(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFVersionImpl());
	}
	protected <T> T createIPSWFWorkTime(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWFWorkTimeImpl());
	}
	protected <T> T createIPSWorkflow(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wf.PSWorkflowImpl());
	}
	protected <T> T createIPSWXAccount(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wx.PSWXAccountImpl());
	}
	protected <T> T createIPSWXEntApp(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wx.PSWXEntAppImpl());
	}
	protected <T> T createIPSWXLogic(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wx.PSWXLogicImpl());
	}
	protected <T> T createIPSWXMenu(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wx.PSWXMenuImpl());
	}
	protected <T> T createIPSWXMenuFunc(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wx.PSWXMenuFuncImpl());
	}
	protected <T> T createIPSWXMenuItem(IPSModelObjectRuntime parentPSModelObject,Class<T> cls,ObjectNode objNode){
				return (T)(new net.ibizsys.model.wx.PSWXMenuItemImpl());
	}
}