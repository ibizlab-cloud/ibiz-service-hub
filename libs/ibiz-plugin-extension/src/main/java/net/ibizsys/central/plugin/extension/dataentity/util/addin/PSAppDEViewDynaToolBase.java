package net.ibizsys.central.plugin.extension.dataentity.util.addin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionForm;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflow;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflowDefinition;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.app.view.PSAppDEViewImpl;
import net.ibizsys.model.app.view.PSAppViewImpl;
import net.ibizsys.model.app.view.PSAppViewRefImpl;
import net.ibizsys.model.control.form.PSDEFormImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSDEForm;
import net.ibizsys.psmodel.core.domain.PSWFLink;
import net.ibizsys.psmodel.core.domain.PSWFProcess;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.util.PSModelEnums.WFProcessType;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class PSAppDEViewDynaToolBase extends PSModelDynaToolBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSAppDEViewDynaToolBase.class);

	final static String APPDEVIEWTYPE_DEMOBWFDYNAACTIONVIEW = "DEMOBWFDYNAACTIONVIEW";// 实体移动端工作流动态操作视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW = "DEMOBWFDYNAEDITVIEW";// 实体移动端工作流动态编辑视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW3 = "DEMOBWFDYNAEDITVIEW3";// 实体移动端工作流动态编辑视图（分页关系）
	// final static String APPDEVIEWTYPE_DEMOBWFDYNAEXPMDVIEW =
	// "DEMOBWFDYNAEXPMDVIEW";//实体移动端工作流动态导航多数据视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNASTARTVIEW = "DEMOBWFDYNASTARTVIEW";// 实体移动端工作流动态启动视图

	final static String APPDEVIEWTYPE_DEWFDYNAACTIONVIEW = "DEWFDYNAACTIONVIEW";// 实体工作流动态操作视图
	final static String APPDEVIEWTYPE_DEWFDYNAEDITVIEW = "DEWFDYNAEDITVIEW";// 实体工作流动态编辑视图
	final static String APPDEVIEWTYPE_DEWFDYNAEDITVIEW3 = "DEWFDYNAEDITVIEW3";// 实体工作流动态视图（分页关系）
	// final static String APPDEVIEWTYPE_DEWFDYNAEXPGRIDVIEW =
	// "DEWFDYNAEXPGRIDVIEW";//实体工作流动态导航表格视图
	final static String APPDEVIEWTYPE_DEWFDYNASTARTVIEW = "DEWFDYNASTARTVIEW";// 实体工作流动态启动视图

	final static String APPDEVIEWTYPE_DEEDITVIEW = "DEEDITVIEW";// 实体编辑视图
	final static String APPDEVIEWTYPE_DEEDITVIEW2 = "DEEDITVIEW2";// 实体编辑视图（左右关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW3 = "DEEDITVIEW3";// 实体编辑视图（分页关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW4 = "DEEDITVIEW4";// 实体编辑视图（上下关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW9 = "DEEDITVIEW9";// 实体编辑视图（部件视图）

	final static String APPDEVIEWTYPE_DEMOBEDITVIEW = "DEMOBEDITVIEW";// 实体移动端编辑视图
	final static String APPDEVIEWTYPE_DEMOBEDITVIEW3 = "DEMOBEDITVIEW3";// 实体移动端编辑视图（分页关系）
	final static String APPDEVIEWTYPE_DEMOBEDITVIEW9 = "DEMOBEDITVIEW9";// 实体移动端编辑视图（部件视图）

	final static String APPDEVIEWTYPE_DEMOBOPTVIEW = "DEMOBOPTVIEW";// 实体移动端选项操作视图
	final static String APPDEVIEWTYPE_DEOPTVIEW = "DEOPTVIEW";// 实体选项操作视图

	/**
	 * 动态视图模式：实体工作流视图
	 */
	public final static String DYNAVIEWMODE_DEWFVIEW = "DEWFVIEW";

	/**
	 * 动态视图模式：实体编辑视图
	 */
	public final static String DYNAVIEWMODE_DEEDITVIEW = "DEEDITVIEW";

	private static Map<String, String> DynaViewModeMap = new HashMap<String, String>();
	static {
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAACTIONVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW3, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNASTARTVIEW, DYNAVIEWMODE_DEWFVIEW);

		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNAACTIONVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNAEDITVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNAEDITVIEW3, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNASTARTVIEW, DYNAVIEWMODE_DEWFVIEW);

		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW2, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW3, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW4, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW9, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW3, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW9, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBOPTVIEW, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEOPTVIEW, DYNAVIEWMODE_DEEDITVIEW);
	}
	
	@Override
	protected ObjectNode onGetModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSModelObject iPSModelObject, Object param) throws Throwable {
		
		if(!(iPSModelObject instanceof IPSAppView)) {
			throw new Exception(String.format("传入模型对象[%1$s]类型不正确", iPSModelObject));
		}
		
		IPSAppView iPSAppView = (IPSAppView)iPSModelObject;
		Assert.hasLength(iPSAppView.getViewType(), "传入应用视图应用模型视图类型无效");
		Assert.notNull(iPSAppView.getPSAppDataEntity(), "传入应用视图应用实体模型无效");
		Assert.notNull(iPSAppView.getPSAppDataEntity().getPSDataEntity(), "传入应用视图应用实体实体模型无效");
		Assert.isTrue(this.getPSDataEntity().getId().equals(iPSAppView.getPSAppDataEntity().getPSDataEntity().getId()), "传入应用视图应用实体实体模型标识不一致");
		
		return this.onGetModel(v2SystemExtensionSuite, iPSAppView, param);
	}
	

	protected ObjectNode onGetModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppView iPSAppView, Object param) throws Throwable {

		String strMode = this.getDynaViewMode(iPSAppView.getViewType());
		if (!StringUtils.hasLength(strMode)) {
			return null;
		}

		// 获取工作流编辑
		String strWFTag = null;
		if (param instanceof Map) {
			Map map = (Map) param;
			strWFTag = (String) map.get("srfwftag");
		}

		if (strMode.equalsIgnoreCase(DYNAVIEWMODE_DEWFVIEW)) {
			return onGetPSAppDEWFViewModel(v2SystemExtensionSuite, (IPSAppDEView) iPSAppView, strWFTag, param);
		}

		if (strMode.equalsIgnoreCase(DYNAVIEWMODE_DEEDITVIEW)) {
			return onGetPSAppDEEditViewModel(v2SystemExtensionSuite, (IPSAppDEView) iPSAppView, strWFTag, param);
		}

		log.warn(String.format("动态视图模式[%1$s]未支持", strMode));

		return null;
	}

	protected ObjectNode onGetPSAppDEWFViewModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppDEView iPSAppDEView, String strWFTag, Object param) throws Throwable {
		return getPSAppDEWFViewModel(v2SystemExtensionSuite, iPSAppDEView, strWFTag, param);
	}

	public static ObjectNode getPSAppDEWFViewModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppDEView iPSAppDEView, String strWFTag, Object param) throws Throwable {
		// 查出相关实体工作流

		boolean bMobile = iPSAppDEView.getViewType().indexOf("DEMOB") != -1;

		boolean bDynaEditView = iPSAppDEView.getViewType().indexOf("DYNAEDITVIEW") != -1;

		IPSApplication iPSApplication = iPSAppDEView.getParentPSModelObject(IPSApplication.class);
		// 根据流程标记，查出全部版本
		IPSDEWF iPSDEWF = null;
		IPSDataEntity iPSDataEntity = iPSAppDEView.getPSAppDataEntityMust().getPSDataEntityMust();
		List<IPSDEWF> psDEWFs = iPSDataEntity.getAllPSDEWFs();
		if (!ObjectUtils.isEmpty(psDEWFs)) {
			for (IPSDEWF item : psDEWFs) {
				if (StringUtils.hasLength(strWFTag) && strWFTag.equalsIgnoreCase(item.getPSWorkflowMust().getCodeName())) {
					iPSDEWF = item;
					break;
				}
			}
		}

		List<IPSWFVersion> psWFVersionList = new ArrayList<IPSWFVersion>();
		String strFullWFTag = null;
		String strDEWFTag = null;
		String strWFName = null;
		Map<String, IPSAppDEView> psAppViewRefMap = new LinkedHashMap<String, IPSAppDEView>();

		if (iPSDEWF != null) {

			IPSWorkflow iPSWorkflow = iPSDEWF.getPSWorkflowMust();
			if (!ObjectUtils.isEmpty(iPSWorkflow.getPSWFDEs())) {
				strDEWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow.getPSWFDEs().get(0));
			}
			if (!StringUtils.hasLength(strDEWFTag)) {
				return null;
			}
			strFullWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow);
			// 现有流程
			if (iPSWorkflow.getPSWFVersions() != null) {
				psWFVersionList.addAll(iPSWorkflow.getPSWFVersions());
			}

			// 现有流程
			strWFName = iPSWorkflow.getName();
		} else {
			String strDETag = PSModelUtils.calcUniqueTag2(iPSDataEntity);
			strFullWFTag = String.format("%1$s.%2$s", PSModelUtils.getParentId(strDETag), strWFTag);
			strDEWFTag = String.format("%1$s.%2$s", strFullWFTag, "default");

			List<V2SystemExtensionWorkflow> v2SystemExtensionWorkflowList = v2SystemExtensionSuite.getWorkflows();
			if (!ObjectUtils.isEmpty(v2SystemExtensionWorkflowList)) {
				for (V2SystemExtensionWorkflow v2SystemExtensionWorkflow : v2SystemExtensionWorkflowList) {
					if (strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflow.getWorkflowTag())) {

						String strModel = v2SystemExtensionWorkflow.getPendingExtensionModel();
						if (!StringUtils.hasLength(strModel)) {
							strModel = v2SystemExtensionWorkflow.getExtensionModel();
						}

						if (StringUtils.hasLength(strModel)) {
							PSWorkflow psWorkflow = JsonUtils.as(strModel, PSWorkflow.class);
							strWFName = psWorkflow.getName();
							break;
						}

					}
				}
			}
		}

		if (!StringUtils.hasLength(strFullWFTag) || !StringUtils.hasLength(strDEWFTag)) {
			return null;
		}

		Map<String, String> formCodeNameMap = new HashMap<String, String>();
		//
		List<V2SystemExtensionWorkflowDefinition> v2SystemExtensionWorkflowDefinitionList = v2SystemExtensionSuite.getWorkflowDefinitions();
		if (!ObjectUtils.isEmpty(v2SystemExtensionWorkflowDefinitionList)) {
			for (V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition : v2SystemExtensionWorkflowDefinitionList) {
				if (!strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflowDefinition.getWorkflowTag())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getExtensionModel())) {
					continue;
				}

				PSWFVersion psWFVersion = JsonUtils.as(v2SystemExtensionWorkflowDefinition.getExtensionModel(), PSWFVersion.class);
				// 枚举处理节点及连接
				if (!ObjectUtils.isEmpty(psWFVersion.getPSWFProcesses())) {
					for (PSWFProcess psWFProcess : psWFVersion.getPSWFProcesses()) {
						if (!bMobile) {
							// 合成表单标识
							if (StringUtils.hasLength(psWFProcess.getPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getPSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getUtilPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtilPSDEFormId()).toLowerCase(), "");

							}

							if (StringUtils.hasLength(psWFProcess.getUtil2PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil2PSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getUtil3PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil3PSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getUtil4PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil4PSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getUtil5PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil5PSDEFormId()).toLowerCase(), "");
							}
						} else {
							if (StringUtils.hasLength(psWFProcess.getMobPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobPSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getMobUtilPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtilPSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getMobUtil2PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil2PSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getMobUtil3PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil3PSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getMobUtil4PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil4PSDEFormId()).toLowerCase(), "");
							}

							if (StringUtils.hasLength(psWFProcess.getMobUtil5PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil5PSDEFormId()).toLowerCase(), "");
							}
						}
					}
				}

				if (!ObjectUtils.isEmpty(psWFVersion.getPSWFLinks())) {
					for (PSWFLink psWFLink : psWFVersion.getPSWFLinks()) {
						if (!bMobile) {
							// 合成表单标识
							if (StringUtils.hasLength(psWFLink.getPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFLink.getPSDEFormId()).toLowerCase(), "");
							}
						} else {
							if (StringUtils.hasLength(psWFLink.getMobPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFLink.getMobPSDEFormId()).toLowerCase(), "");
							}
						}

						if (bDynaEditView) {
							String strViewCodeName = null;
							if (!bMobile) {
								if (StringUtils.hasLength(psWFLink.getPSDEViewBaseId())) {
									strViewCodeName = PSModelUtils.getSimpleId(psWFLink.getPSDEViewBaseId());
								}
							} else {
								if (StringUtils.hasLength(psWFLink.getMobPSDEViewId())) {
									strViewCodeName = PSModelUtils.getSimpleId(psWFLink.getMobPSDEViewId());
								}
							}

							if (StringUtils.hasLength(strViewCodeName)) {
								java.util.List<IPSAppView> psAppViewList = iPSApplication.getAllPSAppViews();
								if (!ObjectUtils.isEmpty(psAppViewList)) {
									for (IPSAppView iPSAppView : psAppViewList) {
										if (iPSAppView instanceof IPSAppDEView) {
											IPSAppDEView iPSAppDEView2 = (IPSAppDEView) iPSAppView;
											if (!iPSAppDEView2.getPSAppDataEntityMust().getPSDataEntityMust().getId().equals(iPSDataEntity.getId())) {
												continue;
											}
											if (strViewCodeName.equalsIgnoreCase(iPSAppDEView2.getPSDEViewCodeName())) {
												String strViewRefMode = String.format("%1$s@%2$s", "WFACTION", strViewCodeName);
												psAppViewRefMap.put(strViewRefMode, iPSAppDEView2);
												break;
											}
										} else {
											continue;
										}
									}
								}
							}
						}

					}
				}
			}
		}

		ObjectNode originViewNode = iPSAppDEView.getObjectNode().deepCopy();
		JsonNode node = originViewNode.get(PSAppViewImpl.ATTR_GETPSCONTROLS);
		if (node == null) {
			// 尝试从视图面板中获取
			JsonNode viewLayoutPanelNode = originViewNode.get(PSAppViewImpl.ATTR_GETPSVIEWLAYOUTPANEL);
			if (viewLayoutPanelNode instanceof ObjectNode) {
				node = ((ObjectNode) viewLayoutPanelNode).get(PSAppViewImpl.ATTR_GETPSCONTROLS);
			}
		}
		if (node instanceof ArrayNode) {
			// 循环表单
			ArrayNode arrayNode = (ArrayNode) node;
			for (int i = 0; i < arrayNode.size(); i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if (strName.indexOf("wfform_") == 0) {
					formCodeNameMap.put(strName.substring(7).toLowerCase(), "");
				}
			}
		}

		Map<String, V2SystemExtensionForm> v2SystemExtensionFormMap = new HashMap<String, V2SystemExtensionForm>();

		// 查出表单
		List<V2SystemExtensionForm> v2SystemExtensionFormList = v2SystemExtensionSuite.getForms();
		if (!ObjectUtils.isEmpty(v2SystemExtensionFormList)) {
			for (V2SystemExtensionForm v2SystemExtensionForm : v2SystemExtensionFormList) {
				if (!StringUtils.hasLength(v2SystemExtensionForm.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionForm.getExtensionModel())) {
					continue;
				}

				PSDEForm psDEForm = JsonUtils.as(v2SystemExtensionForm.getExtensionModel(), PSDEForm.class);
				if (strDEWFTag.equalsIgnoreCase(psDEForm.getPSWFDEId())) {
					if (!formCodeNameMap.containsKey(psDEForm.getCodeName().toLowerCase())) {
						continue;
					}

					v2SystemExtensionFormMap.put("wfform_" + psDEForm.getCodeName().toLowerCase(), v2SystemExtensionForm);
				}
			}
		}

		// 执行替换操作
		if (node instanceof ArrayNode) {

			List<ObjectNode> list = new ArrayList<ObjectNode>();
			// 循环表单
			ArrayNode arrayNode = (ArrayNode) node;
			ObjectNode formNode = null;
			for (int i = 0; i < arrayNode.size(); i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if (strName.indexOf("wfform_") == 0) {
					formNode = ctrlNode;
					break;
				}
			}
			for (int i = 0; i < arrayNode.size(); i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				V2SystemExtensionForm v2SystemExtensionForm = v2SystemExtensionFormMap.remove(strName);
				if (v2SystemExtensionForm == null) {
					list.add(ctrlNode);
					continue;
				}
				String strRuntimeModel = ExtensionUtils.replaceRuntimeModel(v2SystemExtensionForm.getRuntimeModel(), iPSApplication, false);
				ObjectNode form = JsonUtils.toObjectNode(strRuntimeModel);
				//ObjectNode form = JsonUtils.toObjectNode(v2SystemExtensionForm.getRuntimeModel());
				// 有新的，准备替换
				ObjectNode newForm = ctrlNode.deepCopy();// JsonUtils.toObjectNode(ctrlNode.toString());
				newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES));
				newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMPAGES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMPAGES));
				newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS));
				newForm.set(PSDEFormImpl.ATTR_GETCODENAME, form.get(PSDEFormImpl.ATTR_GETCODENAME));
				newForm.set(PSDEFormImpl.ATTR_GETLOGICNAME, form.get(PSDEFormImpl.ATTR_GETLOGICNAME));
				if (form.get(PSDEFormImpl.ATTR_ISNOTABHEADER) != null) {
					newForm.set(PSDEFormImpl.ATTR_ISNOTABHEADER, form.get(PSDEFormImpl.ATTR_ISNOTABHEADER));
				}

				newForm.remove(PSDEFormImpl.ATTR_GETPSDEFORMITEMS);
				newForm.remove(PSDEFormImpl.ATTR_GETDYNAMODELFILEPATH);

				list.add(newForm);

			}

			for (java.util.Map.Entry<String, V2SystemExtensionForm> entry : v2SystemExtensionFormMap.entrySet()) {
				ObjectNode form = JsonUtils.toObjectNode(entry.getValue().getRuntimeModel());
				ObjectNode newForm = null;
				if (formNode != null) {
					newForm = formNode.deepCopy();// JsonUtils.toObjectNode(formNode.toString());
					newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES));
					newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMPAGES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMPAGES));
					newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS));
					newForm.set(PSDEFormImpl.ATTR_GETCODENAME, form.get(PSDEFormImpl.ATTR_GETCODENAME));
					newForm.set(PSDEFormImpl.ATTR_GETLOGICNAME, form.get(PSDEFormImpl.ATTR_GETLOGICNAME));
					if (form.get(PSDEFormImpl.ATTR_ISNOTABHEADER) != null) {
						newForm.set(PSDEFormImpl.ATTR_ISNOTABHEADER, form.get(PSDEFormImpl.ATTR_ISNOTABHEADER));
					}
					newForm.remove(PSDEFormImpl.ATTR_GETPSDEFORMITEMS);
					newForm.remove(PSDEFormImpl.ATTR_GETDYNAMODELFILEPATH);

				} else {
					newForm = form;
				}
				newForm.put("name", entry.getKey());
				list.add(newForm);

			}

			arrayNode.removeAll();
			arrayNode.addAll(list);

			if (!ObjectUtils.isEmpty(psAppViewRefMap)) {
				JsonNode node2 = originViewNode.get(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				ArrayNode psAppViewRefsNode = null;
				if (node2 instanceof ArrayNode) {
					psAppViewRefsNode = (ArrayNode) node2;
				} else {
					psAppViewRefsNode = originViewNode.putArray(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				}

				Map<String, String> map = new LinkedHashMap<String, String>();
				for (int i = 0; i < psAppViewRefsNode.size(); i++) {
					ObjectNode objectNode = (ObjectNode) psAppViewRefsNode.get(i);
					JsonNode jsonNode = objectNode.get(PSAppViewRefImpl.ATTR_GETNAME);
					if (jsonNode != null) {
						map.put(jsonNode.asText(), null);
					}
				}

				for (java.util.Map.Entry<String, IPSAppDEView> entry : psAppViewRefMap.entrySet()) {

					if (map.containsKey(entry.getKey())) {
						continue;
					}

					ObjectNode psAppViewRefNode = psAppViewRefsNode.addObject();
					IPSAppDEView refPSAppDEView = entry.getValue();

					psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETNAME, entry.getKey());
					if (StringUtils.hasLength(refPSAppDEView.getOpenMode())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALOPENMODE, refPSAppDEView.getOpenMode());
					}
					if (StringUtils.hasLength(refPSAppDEView.getTitle())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALTITLE, refPSAppDEView.getTitle());
					}

					ObjectNode refNode = psAppViewRefNode.putObject(PSAppViewRefImpl.ATTR_GETREFPSAPPVIEW);
					refNode.put("modelref", true);
					refNode.put("path", refPSAppDEView.getDynaModelFilePath());
					refNode.put("viewType", refPSAppDEView.getViewType());
				}
			}

			// 修复名称
			if (StringUtils.hasLength(strWFName)) {
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETCAPPSLANGUAGERES);
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETTITLEPSLANGUAGERES);

				originViewNode.put(PSAppDEViewImpl.ATTR_GETCAPTION, strWFName);
				originViewNode.put(PSAppDEViewImpl.ATTR_GETTITLE, strWFName);
			}

			return originViewNode;
		}

		return null;
	}

	protected ObjectNode onGetPSAppDEEditViewModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppDEView iPSAppDEView, String strWFTag, Object param) throws Throwable {
		return getPSAppDEEditViewModel(v2SystemExtensionSuite, iPSAppDEView, strWFTag, param);
	}

	public static ObjectNode getPSAppDEEditViewModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppDEView iPSAppDEView, String strWFTag, Object param) throws Throwable {
		// 查出相关实体工作流
		boolean bMobile = iPSAppDEView.getViewType().indexOf("DEMOB") != -1;
		String strFullWFTag = null;
		String strDEWFTag = null;
		String strWFName = null;

		IPSApplication iPSApplication = iPSAppDEView.getParentPSModelObject(IPSApplication.class);
		IPSDataEntity iPSDataEntity = iPSAppDEView.getPSAppDataEntityMust().getPSDataEntityMust();

		Map<String, IPSAppDEView> psAppViewRefMap = new LinkedHashMap<String, IPSAppDEView>();

		if (StringUtils.hasLength(strWFTag)) {
			// 根据流程标记，查出全部版本
			IPSDEWF iPSDEWF = null;
			List<IPSDEWF> psDEWFs = iPSDataEntity.getAllPSDEWFs();
			if (!ObjectUtils.isEmpty(psDEWFs)) {
				for (IPSDEWF item : psDEWFs) {
					if (strWFTag.equalsIgnoreCase(item.getPSWorkflowMust().getCodeName())) {
						iPSDEWF = item;
						break;
					}
				}
			}

			if (iPSDEWF != null) {

				IPSWorkflow iPSWorkflow = iPSDEWF.getPSWorkflowMust();
				if (!ObjectUtils.isEmpty(iPSWorkflow.getPSWFDEs())) {
					strDEWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow.getPSWFDEs().get(0));
				}
				if (!StringUtils.hasLength(strDEWFTag)) {
					return null;
				}
				strFullWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow);
				// 现有流程
				strWFName = iPSWorkflow.getName();
			} else {
				String strDETag = PSModelUtils.calcUniqueTag2(iPSDataEntity);
				strFullWFTag = String.format("%1$s.%2$s", PSModelUtils.getParentId(strDETag), strWFTag);
				strDEWFTag = String.format("%1$s.%2$s", strFullWFTag, "default");

				List<V2SystemExtensionWorkflow> v2SystemExtensionWorkflowList = v2SystemExtensionSuite.getWorkflows();
				if (!ObjectUtils.isEmpty(v2SystemExtensionWorkflowList)) {
					for (V2SystemExtensionWorkflow v2SystemExtensionWorkflow : v2SystemExtensionWorkflowList) {
						if (strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflow.getWorkflowTag())) {

							String strModel = v2SystemExtensionWorkflow.getPendingExtensionModel();
							if (!StringUtils.hasLength(strModel)) {
								strModel = v2SystemExtensionWorkflow.getExtensionModel();
							}

							if (StringUtils.hasLength(strModel)) {
								PSWorkflow psWorkflow = JsonUtils.as(strModel, PSWorkflow.class);
								strWFName = psWorkflow.getName();
								break;
							}

						}
					}
				}
			}

			if (!StringUtils.hasLength(strFullWFTag) || !StringUtils.hasLength(strDEWFTag)) {
				return null;
			}

			//
			List<V2SystemExtensionWorkflowDefinition> v2SystemExtensionWorkflowDefinitionList = v2SystemExtensionSuite.getWorkflowDefinitions();
			if (!ObjectUtils.isEmpty(v2SystemExtensionWorkflowDefinitionList)) {
				for (V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition : v2SystemExtensionWorkflowDefinitionList) {
					if (!strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflowDefinition.getWorkflowTag())) {
						continue;
					}

					if (!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getRuntimeModel())) {
						continue;
					}

					if (!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getExtensionModel())) {
						continue;
					}

					PSWFVersion psWFVersion = JsonUtils.as(v2SystemExtensionWorkflowDefinition.getExtensionModel(), PSWFVersion.class);
					List<PSWFProcess> psWFProcessList = psWFVersion.getPSWFProcesses();
					if (!ObjectUtils.isEmpty(psWFProcessList)) {

						for (PSWFProcess psWFProcess : psWFProcessList) {
							if (WFProcessType.START.value.equalsIgnoreCase(psWFProcess.getWFProcessType())) {
								String strViewCodeName = null;
								if (!bMobile) {
									if (StringUtils.hasLength(psWFProcess.getPSDEViewBaseId())) {
										strViewCodeName = PSModelUtils.getSimpleId(psWFProcess.getPSDEViewBaseId());

									}
								} else {
									if (StringUtils.hasLength(psWFProcess.getMobPSDEViewId())) {
										strViewCodeName = PSModelUtils.getSimpleId(psWFProcess.getMobPSDEViewId());
									}
								}

								if (StringUtils.hasLength(strViewCodeName)) {
									java.util.List<IPSAppView> psAppViewList = iPSApplication.getAllPSAppViews();
									if (!ObjectUtils.isEmpty(psAppViewList)) {
										for (IPSAppView iPSAppView : psAppViewList) {
											if (iPSAppView instanceof IPSAppDEView) {
												IPSAppDEView iPSAppDEView2 = (IPSAppDEView) iPSAppView;
												if (!iPSAppDEView2.getPSAppDataEntityMust().getPSDataEntityMust().getId().equals(iPSDataEntity.getId())) {
													continue;
												}
												if (strViewCodeName.equalsIgnoreCase(iPSAppDEView2.getPSDEViewCodeName())) {
													String strViewRefMode = String.format("%1$s@%2$s", "WFSTART", psWFVersion.getWFVersion());
													psAppViewRefMap.put(strViewRefMode, iPSAppDEView2);
													break;
												}
											} else {
												continue;
											}
										}
									}
								}
							}
						}
					}

				}
			}
		}

		Map<String, String> formCodeNameMap = new HashMap<String, String>();

		ObjectNode originViewNode = iPSAppDEView.getObjectNode().deepCopy();// JsonUtils.toObjectNode(iPSAppDEView.getObjectNode().toString());
		JsonNode node = originViewNode.get(PSAppViewImpl.ATTR_GETPSCONTROLS);
		if (node == null) {
			// 尝试从视图面板中获取
			JsonNode viewLayoutPanelNode = originViewNode.get(PSAppViewImpl.ATTR_GETPSVIEWLAYOUTPANEL);
			if (viewLayoutPanelNode instanceof ObjectNode) {
				node = ((ObjectNode) viewLayoutPanelNode).get(PSAppViewImpl.ATTR_GETPSCONTROLS);
			}
		}
		if (node instanceof ArrayNode) {
			// 循环表单
			ArrayNode arrayNode = (ArrayNode) node;
			for (int i = 0; i < arrayNode.size(); i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if (strName.equals("form")) {
					JsonNode codeNameNode = ctrlNode.get("codeName");
					if (codeNameNode != null) {
						String strCodeName = codeNameNode.asText();
						if (StringUtils.hasLength(strCodeName)) {
							formCodeNameMap.put(strCodeName.toLowerCase(), "");
						}
					}
				}
			}
		}

		Map<String, V2SystemExtensionForm> v2SystemExtensionFormMap = new HashMap<String, V2SystemExtensionForm>();

		// 查出表单
		List<V2SystemExtensionForm> v2SystemExtensionFormList = v2SystemExtensionSuite.getForms();
		if (!ObjectUtils.isEmpty(v2SystemExtensionFormList)) {
			for (V2SystemExtensionForm v2SystemExtensionForm : v2SystemExtensionFormList) {
				if (!StringUtils.hasLength(v2SystemExtensionForm.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionForm.getExtensionModel())) {
					continue;
				}

				PSDEForm psDEForm = JsonUtils.as(v2SystemExtensionForm.getExtensionModel(), PSDEForm.class);
				if ((StringUtils.hasLength(strDEWFTag) && strDEWFTag.equalsIgnoreCase(psDEForm.getPSWFDEId())) || (!StringUtils.hasLength(strDEWFTag) && !StringUtils.hasLength(psDEForm.getPSWFDEId()))) {
					if (!formCodeNameMap.containsKey(psDEForm.getCodeName().toLowerCase())) {
						continue;
					}

					v2SystemExtensionFormMap.put(psDEForm.getCodeName().toLowerCase(), v2SystemExtensionForm);
				}
			}
		}

		// 执行替换操作
		if (node instanceof ArrayNode) {

			List<ObjectNode> list = new ArrayList<ObjectNode>();
			// 循环表单
			ArrayNode arrayNode = (ArrayNode) node;

			for (int i = 0; i < arrayNode.size(); i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if (!strName.equals("form")) {
					list.add(ctrlNode);
				} else {
					String strCodeName = null;
					JsonNode codeNameNode = ctrlNode.get("codeName");
					if (codeNameNode != null) {
						strCodeName = codeNameNode.asText();
					}

					V2SystemExtensionForm v2SystemExtensionForm = StringUtils.hasLength(strCodeName) ? v2SystemExtensionFormMap.remove(strCodeName.toLowerCase()) : null;
					if (v2SystemExtensionForm == null) {
						list.add(ctrlNode);
					} else {
						String strRuntimeModel = ExtensionUtils.replaceRuntimeModel(v2SystemExtensionForm.getRuntimeModel(), iPSApplication, false);
						ObjectNode form = JsonUtils.toObjectNode(strRuntimeModel);
						//ObjectNode form = JsonUtils.toObjectNode(v2SystemExtensionForm.getRuntimeModel());
						ObjectNode newForm = ctrlNode.deepCopy();// JsonUtils.toObjectNode(ctrlNode.toString());
						newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES));
						newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMPAGES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMPAGES));
						newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS));
						newForm.set(PSDEFormImpl.ATTR_GETCODENAME, form.get(PSDEFormImpl.ATTR_GETCODENAME));
						newForm.set(PSDEFormImpl.ATTR_GETLOGICNAME, form.get(PSDEFormImpl.ATTR_GETLOGICNAME));
						if (form.get(PSDEFormImpl.ATTR_ISNOTABHEADER) != null) {
							newForm.set(PSDEFormImpl.ATTR_ISNOTABHEADER, form.get(PSDEFormImpl.ATTR_ISNOTABHEADER));
						}
						newForm.remove(PSDEFormImpl.ATTR_GETPSDEFORMITEMS);
						newForm.remove(PSDEFormImpl.ATTR_GETDYNAMODELFILEPATH);

						list.add(newForm);
					}
				}
			}

			arrayNode.removeAll();
			arrayNode.addAll(list);

			if (!ObjectUtils.isEmpty(psAppViewRefMap)) {
				JsonNode node2 = originViewNode.get(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				ArrayNode psAppViewRefsNode = null;
				if (node2 instanceof ArrayNode) {
					psAppViewRefsNode = (ArrayNode) node2;
				} else {
					psAppViewRefsNode = originViewNode.putArray(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				}

				for (java.util.Map.Entry<String, IPSAppDEView> entry : psAppViewRefMap.entrySet()) {
					ObjectNode psAppViewRefNode = psAppViewRefsNode.addObject();
					IPSAppDEView refPSAppDEView = entry.getValue();

					psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETNAME, entry.getKey());
					if (StringUtils.hasLength(refPSAppDEView.getOpenMode())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALOPENMODE, refPSAppDEView.getOpenMode());
					}
					if (StringUtils.hasLength(refPSAppDEView.getTitle())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALTITLE, refPSAppDEView.getTitle());
					}

					ObjectNode refNode = psAppViewRefNode.putObject(PSAppViewRefImpl.ATTR_GETREFPSAPPVIEW);
					refNode.put("modelref", true);
					refNode.put("path", refPSAppDEView.getDynaModelFilePath());
					refNode.put("viewType", refPSAppDEView.getViewType());
				}
			}

			// 修复名称
			if (StringUtils.hasLength(strWFName)) {
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETCAPPSLANGUAGERES);
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETTITLEPSLANGUAGERES);

				originViewNode.put(PSAppDEViewImpl.ATTR_GETCAPTION, strWFName);
				originViewNode.put(PSAppDEViewImpl.ATTR_GETTITLE, strWFName);
			}

			return originViewNode;
		}

		return null;
	}

	protected String getDynaViewMode(String strViewType) {
		return DynaViewModeMap.get(strViewType);
	}

	public static ObjectNode getPSAppDEViewModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppDEView iPSAppDEView, Object param) throws Throwable {
		String strMode = DynaViewModeMap.get(iPSAppDEView.getViewType());
		if (!StringUtils.hasLength(strMode)) {
			return null;
		}
		// 获取工作流编辑
		String strWFTag = null;
		if (param instanceof Map) {
			Map map = (Map) param;
			strWFTag = (String) map.get("srfwftag");
		}

		if (strMode.equalsIgnoreCase(DYNAVIEWMODE_DEWFVIEW)) {
			return getPSAppDEWFViewModel(v2SystemExtensionSuite, (IPSAppDEView) iPSAppDEView, strWFTag, param);
		}

		if (strMode.equalsIgnoreCase(DYNAVIEWMODE_DEEDITVIEW)) {
			return getPSAppDEEditViewModel(v2SystemExtensionSuite, (IPSAppDEView) iPSAppDEView, strWFTag, param);
		}

		log.warn(String.format("动态视图模式[%1$s]未支持", strMode));

		return null;
	}
}
