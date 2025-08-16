package net.ibizsys.model.util.transpiler.extend.control.form;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.ButtonListType;
import net.ibizsys.model.PSModelEnums.DEFormDetailState;
import net.ibizsys.model.PSModelEnums.EditorType;
import net.ibizsys.model.PSModelEnums.FormDetailMDCtrlType;
import net.ibizsys.model.PSModelEnums.FormDetailType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.control.IPSAppCounter;
import net.ibizsys.model.app.control.PSAppCounterRefImpl;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.IPSEditor;
import net.ibizsys.model.control.IPSNavigateContext;
import net.ibizsys.model.control.IPSNavigateParam;
import net.ibizsys.model.control.IPSRawItemBase;
import net.ibizsys.model.control.counter.IPSSysCounter;
import net.ibizsys.model.control.dataview.IPSDEDataView;
import net.ibizsys.model.control.form.IPSDEFDCatGroupLogic;
import net.ibizsys.model.control.form.IPSDEFDLogic;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.model.control.form.IPSDEFormButton;
import net.ibizsys.model.control.form.IPSDEFormButtonList;
import net.ibizsys.model.control.form.IPSDEFormDRUIPart;
import net.ibizsys.model.control.form.IPSDEFormDetail;
import net.ibizsys.model.control.form.IPSDEFormGroupBase;
import net.ibizsys.model.control.form.IPSDEFormItem;
import net.ibizsys.model.control.form.IPSDEFormItemEx;
import net.ibizsys.model.control.form.IPSDEFormMDCtrl;
import net.ibizsys.model.control.form.IPSDEFormRawItem;
import net.ibizsys.model.control.form.IPSDEFormTabPage;
import net.ibizsys.model.control.form.IPSDEFormTabPanel;
import net.ibizsys.model.control.form.IPSDESearchFormItem;
import net.ibizsys.model.control.form.PSDEEditFormItemExImpl;
import net.ibizsys.model.control.form.PSDEFDCatGroupLogicImpl;
import net.ibizsys.model.control.form.PSDEFormButtonListImpl;
import net.ibizsys.model.control.form.PSDEFormDRUIPartImpl;
import net.ibizsys.model.control.form.PSDEFormDetailImpl;
import net.ibizsys.model.control.form.PSDEFormImpl;
import net.ibizsys.model.control.form.PSDEFormItemImpl;
import net.ibizsys.model.control.form.PSDEFormMDCtrlImpl;
import net.ibizsys.model.control.form.PSDEFormPageImpl;
import net.ibizsys.model.control.form.PSDEFormRawItemImpl;
import net.ibizsys.model.control.form.PSDEFormTabPageImpl;
import net.ibizsys.model.control.form.PSDEFormTabPanelImpl;
import net.ibizsys.model.control.grid.IPSDEGrid;
import net.ibizsys.model.control.layout.IPSLayout;
import net.ibizsys.model.control.layout.IPSLayoutPos;
import net.ibizsys.model.control.list.IPSDEList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dr.IPSDEDRItem;
import net.ibizsys.model.dataentity.dr.IPSDEDataRelation;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.model.util.KeyValueUtils;
import net.ibizsys.model.util.transpiler.IPSModelRTService;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.extend.control.PSControlListTranspilerEx;
import net.ibizsys.psmodel.core.domain.PSDEDRDetail;
import net.ibizsys.psmodel.core.domain.PSDEDataRelation;
import net.ibizsys.psmodel.core.domain.PSDEFDLogic;
import net.ibizsys.psmodel.core.domain.PSDEFormDetail;
import net.ibizsys.psmodel.core.service.IPSDEDataRelationService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.FormDetailLogicType;
import net.ibizsys.psmodel.core.util.PSModelEnums.GroupCondOP;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModels;

public class PSDEFormDetailListTranspilerEx extends net.ibizsys.model.util.transpiler.control.form.PSDEFormDetailListTranspiler {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSDEFormDetailListTranspilerEx.class);
	
	private static final ThreadLocal<Boolean> RepeatContentThreadLocal = new ThreadLocal<Boolean>();
	
	/**
	 * 编译参数：表单分页部件支持数据关系界面组。反编译时会将由数据关系界面组展开的分页异常
	 */
	public final static String PARAM_PSDEFORMTABPANEL_ENABLEDEDR = "PARAM.IPSDEFormTabPanel.EnableDEDR";
	
	public final static int MODELSTATE_PLACEHOLDER = DEFormDetailState.ENABLEEXTENSION.value | DEFormDetailState.ENABLEPLACEHOLDER.value;
	
	public final static String FIELD_PLACEHOLDERMODEL = "placeholdermodel";
	
	public final static String FIELD_COUNTERPARAM = "counterparam";
	
	public final static String FIELD_COUNTERREFTAG = "counterreftag";
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {

		IPSDEFormDetail iPSDEFormDetail = (IPSDEFormDetail) iPSModelObject;
		PSDEFormDetail psDEFormDetail = (PSDEFormDetail) domain;

		if (iPSDEFormDetail.getPSLayout() != null) {
			iPSModelTranspileContext.getPSModelListTranspiler(IPSLayout.class, false).decompile(iPSModelTranspileContext, iPSDEFormDetail.getPSLayout(), psDEFormDetail, bFullMode);
			psDEFormDetail.setLayoutMode(iPSDEFormDetail.getPSLayout().getLayout());
		}

		if (iPSDEFormDetail.getPSLayoutPos() != null) {
			iPSModelTranspileContext.getPSModelListTranspiler(IPSLayoutPos.class, false).decompile(iPSModelTranspileContext, iPSDEFormDetail.getPSLayoutPos(), psDEFormDetail, bFullMode);
		}

		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		//判断是否有模型控制
		if (bFullMode) {
			if((iPSDEFormDetail.getModelState() & MODELSTATE_PLACEHOLDER) == MODELSTATE_PLACEHOLDER) {
				domain.set(FIELD_PLACEHOLDERMODEL, iPSDEFormDetail.getObjectNode().toString());
			}
		}
		
		//反编译计算器应用
		if(iPSDEFormDetail.getPSAppCounterRef() != null) {
			IPSAppCounter iPSAppCounter = iPSDEFormDetail.getPSAppCounterRef().getPSAppCounterMust();
			//直接写入
			this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", iPSAppCounter, iPSModelObject, "");
			if(iPSDEFormDetail.getPSAppCounterRef().getRefMode()!=null) {
				domain.set(FIELD_COUNTERPARAM, iPSDEFormDetail.getPSAppCounterRef().getRefMode().toString());
			}
			domain.set(FIELD_COUNTERREFTAG, iPSDEFormDetail.getPSAppCounterRef().getTag());
		}

		if (iPSDEFormDetail instanceof IPSDEFormItem) {
			IPSDEFormItem iPSDEFormItem = (IPSDEFormItem) iPSDEFormDetail;
			if (iPSDEFormItem.getPSEditor() != null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSEditor.class, false).decompile(iPSModelTranspileContext, iPSDEFormItem.getPSEditor(), psDEFormDetail, bFullMode);
			}

			if (iPSDEFormItem instanceof IPSDESearchFormItem) {
				IPSDESearchFormItem iPSDESearchFormItem = (IPSDESearchFormItem) iPSDEFormItem;
				// 设置搜索模式
				String strPSDEFieldId = psDEFormDetail.getPSDEFId();
				if (StringUtils.hasLength(strPSDEFieldId)) {

				}
			}
		}

		if (iPSDEFormDetail instanceof IPSDEFormDRUIPart) {
			IPSDEFormDRUIPart iPSDEFormDRUIPart = (IPSDEFormDRUIPart) iPSDEFormDetail;
			if(StringUtils.hasLength(iPSDEFormDRUIPart.getDRItemTag())) {
				IPSDEForm iPSDEForm = iPSDEFormDRUIPart.getParentPSModelObject(IPSDEForm.class, false);
				IPSDEDRItem iPSDEDRItem = null;
				//获取应用实体
				if(iPSDEForm.getPSAppDataEntity() != null && iPSDEForm.getPSAppDataEntity().getPSDataEntity() != null) {
					List<IPSDEDRItem> list = iPSDEForm.getPSAppDataEntity().getPSDataEntity().getAllPSDEDRItems();
					if(!ObjectUtils.isEmpty(list)) {
						for(IPSDEDRItem item : list) {
							if(iPSDEFormDRUIPart.getDRItemTag().equalsIgnoreCase(item.getCodeName())) {
								iPSDEDRItem = item;
								break;
							}
						}
					}
				}
				if(iPSDEDRItem != null) {
					psDEFormDetail.setPSDEDRItemId(iPSModelTranspileContext.getPSModelUniqueTag(iPSDEDRItem));
					psDEFormDetail.setPSDEDRItemName(iPSDEDRItem.getName());
				}
				else {
					throw new Exception(String.format("无法获取关系界面项[%1$s]对应的模型对象", iPSDEFormDRUIPart.getDRItemTag()));
				}
			}
		}
		
		if (iPSDEFormDetail instanceof IPSDEFormRawItem) {
			IPSDEFormRawItem iPSDEFormRawItem = (IPSDEFormRawItem) iPSDEFormDetail;
			if (iPSDEFormRawItem.getPSRawItem() != null) {
				iPSModelTranspileContext.getPSModelListTranspiler(IPSRawItemBase.class, false).decompile(iPSModelTranspileContext, iPSDEFormRawItem.getPSRawItem(), psDEFormDetail, bFullMode);
			}
		}
		
		
		if (iPSDEFormDetail instanceof IPSDEFormTabPanel) {
			IPSDEFormTabPanel iPSDEFormTabPanel = (IPSDEFormTabPanel) iPSDEFormDetail;
			if(StringUtils.hasLength(iPSDEFormTabPanel.getDataRelationTag())) {
				//设置数据关系分组
				IPSDEForm iPSDEForm = iPSDEFormTabPanel.getParentPSModelObject(IPSDEForm.class, false);
				IPSDEDataRelation iPSDEDataRelation = null;
				//获取应用实体
				if(iPSDEForm.getPSAppDataEntity() != null && iPSDEForm.getPSAppDataEntity().getPSDataEntity() != null) {
					List<IPSDEDataRelation> list = iPSDEForm.getPSAppDataEntity().getPSDataEntity().getAllPSDEDataRelations();
					if(!ObjectUtils.isEmpty(list)) {
						for(IPSDEDataRelation item : list) {
							if(iPSDEFormTabPanel.getDataRelationTag().equalsIgnoreCase(item.getCodeName())) {
								iPSDEDataRelation = item;
								break;
							}
						}
					}
				}
				
				if(iPSDEDataRelation != null) {
					psDEFormDetail.setPSDEDRId(iPSModelTranspileContext.getPSModelUniqueTag(iPSDEDataRelation));
					psDEFormDetail.setPSDEDRName(iPSDEDataRelation.getName());
				}
				else {
					throw new Exception(String.format("无法获取关系界面分组[%1$s]对应的模型对象", iPSDEFormTabPanel.getDataRelationTag()));
				}
			}
		}
		
		if (iPSDEFormDetail instanceof IPSDEFormTabPage) {
			IPSDEFormTabPage iPSDEFormTabPage = (IPSDEFormTabPage) iPSDEFormDetail;
			if(StringUtils.hasLength(iPSDEFormTabPage.getDRItemTag())) {
				
			}
		}
		
		
		if (iPSDEFormDetail instanceof IPSDEFormMDCtrl) {
			IPSDEFormMDCtrl iPSDEFormMDCtrl = (IPSDEFormMDCtrl) iPSDEFormDetail;
			if(iPSDEFormMDCtrl.getContentPSControl()!=null) {
				IPSControl contentPSControl = iPSDEFormMDCtrl.getContentPSControl();
				String strPSCtrlId = iPSModelTranspileContext.getPSModelUniqueTag(contentPSControl);
				String strPSCtrlName = iPSDEFormMDCtrl.getContentPSControl().getLogicName();
				if(contentPSControl.getPSAppDataEntity() != null && contentPSControl.getPSAppDataEntity().getPSDataEntity() != null) {
					psDEFormDetail.setRefPSDEId(iPSModelTranspileContext.getPSModelUniqueTag(contentPSControl.getPSAppDataEntity().getPSDataEntity()));
					psDEFormDetail.setRefPSDEName(contentPSControl.getPSAppDataEntity().getPSDataEntity().getName());
				}
				if(FormDetailMDCtrlType.DATAVIEW.value.equals(iPSDEFormMDCtrl.getContentType())) {
					psDEFormDetail.setMDPSDEDataViewId(strPSCtrlId);
					psDEFormDetail.setMDPSDEDataViewName(strPSCtrlName);
					psDEFormDetail.setMDCtrlType(FormDetailMDCtrlType.DATAVIEW.value);
				}
				else
					if(FormDetailMDCtrlType.LIST.value.equals(iPSDEFormMDCtrl.getContentType())) {
						psDEFormDetail.setMDPSDEListId(strPSCtrlId);
						psDEFormDetail.setMDPSDEListName(strPSCtrlName);
						psDEFormDetail.setMDCtrlType(FormDetailMDCtrlType.LIST.value);
					}
					else
						if(FormDetailMDCtrlType.GRID.value.equals(iPSDEFormMDCtrl.getContentType())) {
							psDEFormDetail.setMDPSDEGridId(strPSCtrlId);
							psDEFormDetail.setMDPSDEGridName(strPSCtrlName);
							psDEFormDetail.setMDCtrlType(FormDetailMDCtrlType.GRID.value);
						}
						else
							if(FormDetailMDCtrlType.FORM.value.equals(iPSDEFormMDCtrl.getContentType())) {
								psDEFormDetail.setMDPSDEFormId(strPSCtrlId);
								psDEFormDetail.setMDPSDEFormName(strPSCtrlName);
								psDEFormDetail.setMDCtrlType(FormDetailMDCtrlType.FORM.value);
							}
							
				
			}
		}

		if (bFullMode) {

			if (iPSDEFormDetail.getPSDEFDGroupLogics() != null) {
				for (IPSDEFDCatGroupLogic iPSDEFDGroupLogic : iPSDEFormDetail.getPSDEFDGroupLogics()) {
					if (iPSDEFDGroupLogic.getPSDEFDLogics() != null) {
						int nOrder = 100;
						List<PSDEFDLogic> psDEFDLogicList = new ArrayList<PSDEFDLogic>();
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFDLogic.class, false).decompile(iPSModelTranspileContext, iPSDEFDGroupLogic.getPSDEFDLogics(), psDEFDLogicList, bFullMode);
						for (PSDEFDLogic child : psDEFDLogicList) {
							child.setLogicCat(iPSDEFDGroupLogic.getLogicCat());
							child.setPSDEFormDetailId(psDEFormDetail.getId());
							child.setPSDEFormDetailName(psDEFormDetail.getName());
							child.setOrderValue(nOrder);
							nOrder += 100;
						}
						psDEFormDetail.getPSDEFDLogicsIf().addAll(psDEFDLogicList);
					}
				}
			}

			if (iPSDEFormDetail instanceof IPSDEFormTabPanel) {
				IPSDEFormTabPanel iPSDEFormTabPanel = (IPSDEFormTabPanel) iPSDEFormDetail;
				if (iPSDEFormTabPanel.getPSDEFormTabPages() != null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFormTabPanel.getPSDEFormTabPages(), psDEFormDetail.getPSDEFormDetailsIf(), bFullMode);
					for (PSDEFormDetail child : psDEFormDetail.getPSDEFormDetailsIf()) {
						child.setPPSDEFormDetailId(psDEFormDetail.getId());
						child.setPPSDEFormDetailName(psDEFormDetail.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
					
					if(iPSModelTranspileContext.getParam(PARAM_PSDEFORMTABPANEL_ENABLEDEDR, false)) {
						//移除来自关系界面组的分页
						List<PSDEFormDetail> details = new ArrayList<PSDEFormDetail>();
						details.addAll(psDEFormDetail.getPSDEFormDetailsIf());
						psDEFormDetail.getPSDEFormDetailsIf().clear();
						for (PSDEFormDetail child : details) {
							String dritemtag = (String)child.get("dritemtag");
							if(StringUtils.hasLength(dritemtag)) {
								continue;
							}
							psDEFormDetail.getPSDEFormDetailsIf().add(child);
						}
					}
				}
				return;
			}
			if (iPSDEFormDetail instanceof IPSDEFormGroupBase) {
				IPSDEFormGroupBase iPSDEFormGroupBase = (IPSDEFormGroupBase) iPSDEFormDetail;
				if (iPSDEFormGroupBase.getPSDEFormDetails() != null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFormGroupBase.getPSDEFormDetails(), psDEFormDetail.getPSDEFormDetailsIf(), bFullMode);
					for (PSDEFormDetail child : psDEFormDetail.getPSDEFormDetailsIf()) {
						child.setPPSDEFormDetailId(psDEFormDetail.getId());
						child.setPPSDEFormDetailName(psDEFormDetail.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
				return;
			}
			if (iPSDEFormDetail instanceof IPSDEFormItemEx) {
				IPSDEFormItemEx iPSDEFormItemEx = (IPSDEFormItemEx) iPSDEFormDetail;
				if (iPSDEFormItemEx.getPSDEFormItems() != null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFormItemEx.getPSDEFormItems(), psDEFormDetail.getPSDEFormDetailsIf(), bFullMode);
					for (PSDEFormDetail child : psDEFormDetail.getPSDEFormDetailsIf()) {
						child.setPPSDEFormDetailId(psDEFormDetail.getId());
						child.setPPSDEFormDetailName(psDEFormDetail.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
				return;
			}
			
			if (iPSDEFormDetail instanceof IPSDEFormMDCtrl) {
				IPSDEFormMDCtrl iPSDEFormMDCtrl = (IPSDEFormMDCtrl) iPSDEFormDetail;
				if(FormDetailMDCtrlType.REPEATER.value.equals(iPSDEFormMDCtrl.getContentType())
						&& iPSDEFormMDCtrl.getPSDEFormDetails()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFormMDCtrl.getPSDEFormDetails(), psDEFormDetail.getPSDEFormDetailsIf(), bFullMode);
					for (PSDEFormDetail child : psDEFormDetail.getPSDEFormDetailsIf()) {
						child.setPPSDEFormDetailId(psDEFormDetail.getId());
						child.setPPSDEFormDetailName(psDEFormDetail.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
				return;
			}
			
			if (iPSDEFormDetail instanceof IPSDEFormButtonList) {
				IPSDEFormButtonList iPSDEFormButtonList = (IPSDEFormButtonList) iPSDEFormDetail;
				if(ButtonListType.BUTTONS.value.equals(iPSDEFormButtonList.getButtonListType())
						&& iPSDEFormButtonList.getPSDEFormButtons()!=null) {
					int nOrder = 100;
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).decompile(iPSModelTranspileContext, iPSDEFormButtonList.getPSDEFormButtons(), psDEFormDetail.getPSDEFormDetailsIf(), bFullMode);
					for (PSDEFormDetail child : psDEFormDetail.getPSDEFormDetailsIf()) {
						child.setPPSDEFormDetailId(psDEFormDetail.getId());
						child.setPPSDEFormDetailName(psDEFormDetail.getName());
						child.setOrderValue(nOrder);
						nOrder += 100;
					}
				}
				return;
			}
		}
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		PSDEFormDetail psDEFormDetail = (PSDEFormDetail) domain;
		if((DataTypeUtils.asInteger(psDEFormDetail.getModelState(), 0) & MODELSTATE_PLACEHOLDER) == MODELSTATE_PLACEHOLDER) {
			
			String strPlaceHolderModel = DataTypeUtils.asString(psDEFormDetail.get(FIELD_PLACEHOLDERMODEL), null);
			if(StringUtils.hasLength(strPlaceHolderModel)) {
				
				ObjectNode originNode = JsonUtils.toObjectNode(strPlaceHolderModel);
				java.util.Iterator<String> fields = originNode.fieldNames();
				if(fields!=null) {
					while(fields.hasNext()) {
						String strFieldName = fields.next();
						objectNode.set(strFieldName, originNode.get(strFieldName));
					}
				}
				return;
			}
		}
		
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		boolean repeatContent = DataTypeUtils.getBooleanValue(RepeatContentThreadLocal.get(), false);
		
		// 去除ID
		objectNode.remove(PSDEFormDetailImpl.ATTR_GETID);
		if(repeatContent) {
			objectNode.put(PSDEFormDetailImpl.ATTR_ISREPEATCONTENT, true);
		}
		
		if(!objectNode.has(PSDEFormDetailImpl.ATTR_GETCODENAME)) {
			objectNode.put(PSDEFormDetailImpl.ATTR_GETCODENAME, psDEFormDetail.getName());
		}
		
		if(StringUtils.hasLength(psDEFormDetail.getPSSysCounterId())) {
			ObjectNode formNode = PSControlListTranspilerEx.peekCompileObject();
			if(formNode != null) {
				//查出数据
				IPSModelRTService<?> iPSModelRTService = (IPSModelRTService)PSModelServiceSession.getCurrent().getPSModelService(PSModels.PSSYSCOUNTER);
				IPSSysCounter iPSSysCounter = iPSModelRTService.getPSModelObject(psDEFormDetail.getPSSysCounterId(), IPSSysCounter.class, false); 
				if(StringUtils.hasLength(iPSSysCounter.getUniqueTag())) {
					IPSAppCounter iPSAppCounter = null;
					if(iPSModelTranspileContext.getPSApplication()!=null && !ObjectUtils.isEmpty(iPSModelTranspileContext.getPSApplication().getAllPSAppCounters())) {
						for(IPSAppCounter item : iPSModelTranspileContext.getPSApplication().getAllPSAppCounters()) {
							if(iPSSysCounter.getUniqueTag().equals(item.getUniqueTag())) {
								iPSAppCounter = item;
								break;
							}
						}
					}
					
					if(iPSAppCounter == null) {
						throw new Exception(String.format("无法获取表单成员[%1$s]指定[%2$s]应用计数器", psDEFormDetail.getName(), iPSSysCounter.getUniqueTag()));
					}
					
					String strTag = "ex"+KeyValueUtils.genUniqueId(iPSSysCounter.getUniqueTag(), null);
					
					
					ArrayNode arrayNode = null;
					if(formNode.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
						arrayNode = (ArrayNode)formNode.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
					}
					else {
						arrayNode = formNode.putArray(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
					}
					
					
					//判断是否需要新建
					boolean bCreate = true;
					for(JsonNode node : arrayNode) {
						ObjectNode refNode = (ObjectNode)node;
						String strRefTag = JsonUtils.getField(refNode, PSAppCounterRefImpl.ATTR_GETTAG, "");
						if(!StringUtils.hasLength(strRefTag)) {
							continue;
						}
						
						if(strTag.equals(strRefTag)) {
							bCreate = false;
							break;
						}
					}
					
					
					if(bCreate) {
						ObjectNode refNode = arrayNode.addObject();
						refNode.put(PSAppCounterRefImpl.ATTR_GETID, strTag);
						refNode.put(PSAppCounterRefImpl.ATTR_GETTAG, strTag);
						refNode.put(PSAppCounterRefImpl.ATTR_GETUNIQUETAG, iPSSysCounter.getUniqueTag());
						refNode.put(PSAppCounterRefImpl.ATTR_GETPSAPPCOUNTER, iPSAppCounter.getObjectNode().deepCopy());
					}
					
					
					if(true) {
						ObjectNode refNode = objectNode.putObject(PSDEFormDetailImpl.ATTR_GETPSAPPCOUNTERREF);
						refNode.put("modelref", true);
						refNode.put("id", strTag);
					}
				}
			}
		}
		
		
		
		// 判断类型，输出布局信息
	
		String strLayoutPos = (String) psDEFormDetail.get("layoutpos");
		String strLayoutMode = psDEFormDetail.getLayoutMode();
		// if(!StringUtils.hasLength(strLayoutMode)) {
		// strLayoutMode = strPLayoutMode;
		// }
		if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
			for (PSDEFormDetail item : psDEFormDetail.getPSDEFormDetails()) {
				if (!StringUtils.hasLength(item.getLayoutMode())) {
					item.setLayoutMode(strLayoutMode);
				}
				item.set("layoutpos", strLayoutMode);
			}
		}

		if (StringUtils.hasLength(strLayoutPos)) {
			switch (psDEFormDetail.getDetailType()) {
			case "BUTTON":
			case "BUTTONLIST":
			case "DRUIPART":
			case "FORMITEM":
			case "FORMITEMEX":
			case "GROUPPANEL":
			case "IFRAME":
			case "MDCTRL":
			case "RAWITEM":
			case "TABPANEL":
			case "USERCONTROL":

				ObjectNode layoutPosNode = objectNode.putObject(PSDEFormDetailImpl.ATTR_GETPSLAYOUTPOS);
				psDEFormDetail.set("layout", strLayoutPos);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSLayoutPos.class, false).compile(iPSModelTranspileContext, psDEFormDetail, layoutPosNode);
			default:
				break;
			}
		}

		if (StringUtils.hasLength(strLayoutMode)) {
			switch (psDEFormDetail.getDetailType()) {
			case "FORMPAGE":
			case "GROUPPANEL":
			case "TABPAGE":
				ObjectNode layoutNode = objectNode.putObject(PSDEFormDetailImpl.ATTR_GETPSLAYOUT);
				psDEFormDetail.set("layout", strLayoutMode);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSLayout.class, false).compile(iPSModelTranspileContext, psDEFormDetail, layoutNode);
			default:
				break;
			}
		}

		switch (psDEFormDetail.getDetailType()) {
		case "BUTTON":
			// ArrayNode arrayNode =
			// objectNode.putArray(PSDEFormButtonImpl.attr_getpsde);
			// iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class,
			// false).compile(iPSModelTranspileContext,
			// psDEFormDetail.getPSDEFormDetails(), arrayNode);
			break;
		case "BUTTONLIST":{
			if(ButtonListType.BUTTONS.value.equals(psDEFormDetail.getContentType())) {
				if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
					ArrayNode arrayNode = objectNode.putArray(PSDEFormButtonListImpl.ATTR_GETPSDEFORMBUTTONS);
					iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormButton.class, false).compile(iPSModelTranspileContext, psDEFormDetail.getPSDEFormDetails(), arrayNode);
				}
			}
		}
			break;
		case "DRUIPART":{
			if(StringUtils.hasLength(psDEFormDetail.getPSDEDRItemId())) {
				//获取对应的实体
			//	iPSModelTranspileContext.getPSSystemService().getPSDataEntity(strName, bTryMode);
				String strParentId = PSModelUtils.getParentId(psDEFormDetail.getPSDEDRItemId());
				if(StringUtils.hasLength(strParentId)) {
					IPSDataEntity iPSDataEntity = null;
					if(!ObjectUtils.isEmpty(iPSModelTranspileContext.getPSSystem().getAllPSDataEntities())) {
						for(IPSDataEntity item : iPSModelTranspileContext.getPSSystem().getAllPSDataEntities()) {
							
							String strPSDEId = PSModelUtils.calcFullUniqueTag2(item);
							if(!strParentId.equalsIgnoreCase(strPSDEId)) {
								continue;
							}

							iPSDataEntity = item;
							break;
						}
					}
					
					if(iPSDataEntity == null) {
						throw new Exception(String.format("无法获取指定实体对象[%1$s]", strParentId));
					}
					
					
					IPSDEDRItem iPSDEDRItem = null;
					if(!ObjectUtils.isEmpty(iPSDataEntity.getAllPSDEDRItems())) {
						String strCodeName = PSModelUtils.getSimpleId(psDEFormDetail.getPSDEDRItemId());
						for(IPSDEDRItem item : iPSDataEntity.getAllPSDEDRItems()) {
							if(!strCodeName.equalsIgnoreCase(item.getCodeName())) {
								continue;
							}

							iPSDEDRItem = item;
							break;
						}
					}
					
					if(iPSDEDRItem == null) {
						throw new Exception(String.format("无法获取指定实体关系界面[%1$s]", psDEFormDetail.getPSDEDRItemId()));
					}
					
					if(iPSDEDRItem.getPSNavigateContexts()!=null) {
						ArrayNode arrayNode = objectNode.putArray(PSDEFormDRUIPartImpl.ATTR_GETPSNAVIGATECONTEXTS);
						for(IPSNavigateContext iPSNavigateContext : iPSDEDRItem.getPSNavigateContexts()) {
							arrayNode.add(iPSNavigateContext.getObjectNode().deepCopy());
						}
					}
					
					if(iPSDEDRItem.getPSNavigateParams()!=null) {
						ArrayNode arrayNode = objectNode.putArray(PSDEFormDRUIPartImpl.ATTR_GETPSNAVIGATEPARAMS);
						for(IPSNavigateParam iPSNavigateParam : iPSDEDRItem.getPSNavigateParams()) {
							arrayNode.add(iPSNavigateParam.getObjectNode().deepCopy());
						}
					}
					
					if(iPSDEDRItem.getParentDataJO()!=null) {
						objectNode.set(PSDEFormDRUIPartImpl.ATTR_GETPARENTDATAJO, iPSDEDRItem.getParentDataJO().deepCopy());
					}
					
					//计算视图
					IPSAppView relatedPSAppView = null;
					if(StringUtils.hasLength(iPSDEDRItem.getViewCodeName()) && iPSDEDRItem.getViewPSDataEntity()!=null) {
						if(iPSModelTranspileContext.getPSApplication()!=null) {
							List<IPSAppView> psAppViewList = iPSModelTranspileContext.getPSApplication().getAllPSAppViews();
							if(!ObjectUtils.isEmpty(psAppViewList)) {
								for(IPSAppView iPSAppView : psAppViewList) {
									if(!(iPSAppView instanceof IPSAppDEView)) {
										continue;
									}
									
									IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSAppView;
									
									if(iPSAppDEView.getPSAppDataEntity() == null || iPSAppDEView.getPSAppDataEntity().getPSDataEntity() == null) {
										continue;
									}
									
									if(!iPSDEDRItem.getViewPSDataEntity().getId().equals(iPSAppDEView.getPSAppDataEntity().getPSDataEntity().getId())) {
										continue;
									}
									
									if(!iPSDEDRItem.getViewCodeName().equals(iPSAppDEView.getPSDEViewCodeName())) {
										continue;
									}
									
									relatedPSAppView = iPSAppDEView;
									break;
								}
							}
						}
					}
					
					if(relatedPSAppView == null) {
						throw new Exception(String.format("关系界面项[%1$s]无法获取指定实体应用视图[%2$s]", psDEFormDetail.getName(), iPSDEDRItem.getViewCodeName()));
					}
					
					ObjectNode relatedPSAppViewNode = objectNode.putObject(PSDEFormDRUIPartImpl.ATTR_GETPSAPPVIEW);
					
					relatedPSAppViewNode.put("modelref", true);
					relatedPSAppViewNode.put("path", relatedPSAppView.getDynaModelFilePath());
				}
			}
		}
			break;
		case "FORMITEM": {
			ObjectNode editorNode = objectNode.putObject(PSDEFormItemImpl.ATTR_GETPSEDITOR);
			if(!StringUtils.hasLength(psDEFormDetail.getEditorType())) {
				//默认设置为文本框
				psDEFormDetail.setEditorType(EditorType.TEXTBOX.value);
			}
			iPSModelTranspileContext.getPSModelListTranspiler(IPSEditor.class, false).compile(iPSModelTranspileContext, psDEFormDetail, editorNode);

			// objectNode.get(index)
			// 缺 默认 labelWidth，ItemHeight，ItemWidth
		}
			break;
		case "FORMITEMEX": {
			ObjectNode editorNode = objectNode.putObject(PSDEFormItemImpl.ATTR_GETPSEDITOR);
			if(!StringUtils.hasLength(psDEFormDetail.getEditorType())) {
				//默认设置为文本框
				psDEFormDetail.setEditorType(EditorType.TEXTBOX.value);
			}
			iPSModelTranspileContext.getPSModelListTranspiler(IPSEditor.class, false).compile(iPSModelTranspileContext, psDEFormDetail, editorNode);

			if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
				ArrayNode arrayNode = objectNode.putArray(PSDEEditFormItemExImpl.ATTR_GETPSDEFORMITEMS);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, psDEFormDetail.getPSDEFormDetails(), arrayNode);
			}

		}
			break;
		case "FORMPAGE": {
			objectNode.put(PSDEFormPageImpl.ATTR_ISSHOWCAPTION, true);

			if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
				ArrayNode arrayNode = objectNode.putArray(PSDEFormPageImpl.ATTR_GETPSDEFORMDETAILS);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, psDEFormDetail.getPSDEFormDetails(), arrayNode);
			}
		}
			break;
		case "GROUPPANEL": {
			if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
				ArrayNode arrayNode = objectNode.putArray(PSDEFormPageImpl.ATTR_GETPSDEFORMDETAILS);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, psDEFormDetail.getPSDEFormDetails(), arrayNode);
			}
		}
			break;
		case "IFRAME":
			break;
		case "MDCTRL":{
			String strMDCtrlType = psDEFormDetail.getMDCtrlType();
			if(FormDetailMDCtrlType.DATAVIEW.value.equals(strMDCtrlType)) {
				String strMDPSDEDataViewId = psDEFormDetail.getMDPSDEDataViewId();
				if(!StringUtils.hasLength(strMDPSDEDataViewId)) {
					throw new Exception(String.format("多数据部件项[%1$s]未指定多数据卡片视图", psDEFormDetail.getPSDEFormDetailName()));
				}
				
				
				IPSModelRTService<?> iPSModelRTService = (IPSModelRTService)PSModelServiceSession.getCurrent().getPSModelService(PSModels.PSDEDATAVIEW);
				IPSDEDataView iPSDEDataView = iPSModelRTService.getPSModelObject(strMDPSDEDataViewId, IPSDEDataView.class, true);
				if(iPSDEDataView == null) {
					throw new Exception(String.format("多数据部件项[%1$s]指定多数据卡片视图[%2$s]无效", psDEFormDetail.getPSDEFormDetailName(), strMDPSDEDataViewId));
				}
				
				ObjectNode contentNode = iPSDEDataView.getObjectNode().deepCopy();
				//写入部件标识
				
				//调整部件内部模型
				objectNode.set(PSDEFormMDCtrlImpl.ATTR_GETCONTENTPSCONTROL, contentNode);
			}
			else
				if(FormDetailMDCtrlType.LIST.value.equals(strMDCtrlType)) {
					String strMDPSDEListId = psDEFormDetail.getMDPSDEListId();
					if(!StringUtils.hasLength(strMDPSDEListId)) {
						throw new Exception(String.format("多数据部件项[%1$s]未指定列表", psDEFormDetail.getPSDEFormDetailName()));
					}
					
					
					IPSModelRTService<?> iPSModelRTService = (IPSModelRTService)PSModelServiceSession.getCurrent().getPSModelService(PSModels.PSDELIST);
					IPSDEList iPSDEList = iPSModelRTService.getPSModelObject(strMDPSDEListId, IPSDEList.class, true);
					if(iPSDEList == null) {
						throw new Exception(String.format("多数据部件项[%1$s]指定列表[%2$s]无效", psDEFormDetail.getPSDEFormDetailName(), strMDPSDEListId));
					}
					
					ObjectNode contentNode = iPSDEList.getObjectNode().deepCopy();
					//写入部件标识
					
					//调整部件内部模型
					objectNode.set(PSDEFormMDCtrlImpl.ATTR_GETCONTENTPSCONTROL, contentNode);
				}
				else
					if(FormDetailMDCtrlType.GRID.value.equals(strMDCtrlType)) {
						String strMDPSDEGridId = psDEFormDetail.getMDPSDEGridId();
						if(!StringUtils.hasLength(strMDPSDEGridId)) {
							throw new Exception(String.format("多数据部件项[%1$s]未指定表格", psDEFormDetail.getPSDEFormDetailName()));
						}
						
						
						IPSModelRTService<?> iPSModelRTService = (IPSModelRTService)PSModelServiceSession.getCurrent().getPSModelService(PSModels.PSDEGRID);
						IPSDEGrid iPSDEGrid = iPSModelRTService.getPSModelObject(strMDPSDEGridId, IPSDEGrid.class, true);
						if(iPSDEGrid == null) {
							throw new Exception(String.format("多数据部件项[%1$s]指定表格[%2$s]无效", psDEFormDetail.getPSDEFormDetailName(), strMDPSDEGridId));
						}
						
						ObjectNode contentNode = iPSDEGrid.getObjectNode().deepCopy();
						//写入部件标识
						
						//调整部件内部模型
						objectNode.set(PSDEFormMDCtrlImpl.ATTR_GETCONTENTPSCONTROL, contentNode);
					}
					else
						if(FormDetailMDCtrlType.FORM.value.equals(strMDCtrlType)) {
							String strMDPSDEFormId = psDEFormDetail.getMDPSDEFormId();
							if(!StringUtils.hasLength(strMDPSDEFormId)) {
								throw new Exception(String.format("多数据部件项[%1$s]未指定表单", psDEFormDetail.getPSDEFormDetailName()));
							}
							
							
							IPSModelRTService<?> iPSModelRTService = (IPSModelRTService)PSModelServiceSession.getCurrent().getPSModelService(PSModels.PSDEFORM);
							IPSDEForm iPSDEForm = iPSModelRTService.getPSModelObject(strMDPSDEFormId, IPSDEForm.class, true);
							if(iPSDEForm == null) {
								throw new Exception(String.format("多数据部件项[%1$s]指定表单[%2$s]无效", psDEFormDetail.getPSDEFormDetailName(), strMDPSDEFormId));
							}
							
							ObjectNode contentNode = iPSDEForm.getObjectNode().deepCopy();
							//写入部件标识
							
							//调整部件内部模型
							objectNode.set(PSDEFormMDCtrlImpl.ATTR_GETCONTENTPSCONTROL, contentNode);
						}
						else
							if(FormDetailMDCtrlType.REPEATER.value.equals(strMDCtrlType)) {
								try {
									RepeatContentThreadLocal.set(true);
									
									if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
										ArrayNode arrayNode = objectNode.putArray(PSDEFormPageImpl.ATTR_GETPSDEFORMDETAILS);
										iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, psDEFormDetail.getPSDEFormDetails(), arrayNode);
									}
									
								}
								finally {
									RepeatContentThreadLocal.set(repeatContent);
								}
							}
		}
			break;
		case "RAWITEM":
			{
				ObjectNode rawItemNode = objectNode.putObject(PSDEFormRawItemImpl.ATTR_GETPSRAWITEM);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSRawItemBase.class, false).compile(iPSModelTranspileContext, psDEFormDetail, rawItemNode);
			}
			break;
		case "TABPAGE": {
			objectNode.put(PSDEFormTabPageImpl.ATTR_ISSHOWCAPTION, true);
			if(StringUtils.hasLength(psDEFormDetail.getPSDEDRItemName())) {
				objectNode.put(PSDEFormTabPageImpl.ATTR_GETDRITEMTAG, psDEFormDetail.getPSDEDRItemName());
			}
			
			if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
				ArrayNode arrayNode = objectNode.putArray(PSDEFormTabPageImpl.ATTR_GETPSDEFORMDETAILS);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, psDEFormDetail.getPSDEFormDetails(), arrayNode);
			}
		}
			break;
		case "TABPANEL": {
			List<PSDEFormDetail> list = new ArrayList<PSDEFormDetail>();
			if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
				list.addAll(psDEFormDetail.getPSDEFormDetails());
			}
			if (StringUtils.hasLength(psDEFormDetail.getPSDEDRId())) {
				objectNode.put(PSDEFormTabPanelImpl.ATTR_GETDATARELATIONTAG, getSimpleId(psDEFormDetail.getPSDEDRId()));
				if(iPSModelTranspileContext.getParam(PARAM_PSDEFORMTABPANEL_ENABLEDEDR, false)) {
					//获取明细数据
					IPSDEDataRelationService iPSDEDataRelationService = (IPSDEDataRelationService)PSModelServiceSession.getCurrent().getPSModelService(PSModels.PSDEDATARELATION);
					PSDEDataRelation psDEDataRelation = iPSDEDataRelationService.get(psDEFormDetail.getPSDEDRId(), false);
					if(psDEDataRelation == null) {
						throw new Exception(String.format("分页部件项[%1$s]指定实体关系界面组[%2$s]无效", psDEFormDetail.getPSDEFormDetailName(), psDEFormDetail.getPSDEDRId()));
					}
					
					//循环展开分页
					if(!ObjectUtils.isEmpty(psDEDataRelation.getPSDEDRDetails())) {
						List<PSDEFormDetail> list2 = new ArrayList<PSDEFormDetail>();
						for(PSDEDRDetail psDEDRDetail : psDEDataRelation.getPSDEDRDetails()) {
							
							if(!StringUtils.hasLength(psDEDRDetail.getPSDEDRItemId())) {
								continue;
							}
							
							
//							PSDEDRItem psDEDRItem = new PSDEDRItem();
//							iPSModelTranspileContext.getPSModelListTranspiler(IPSDEDRItem.class, false).decompile(iPSModelTranspileContext, iPSDEDRDetail.getPSDEDRItem(), psDEDRItem, false);
//							
							
							//添加一个
							PSDEFormDetail tabPagePSDEFormDetail = new PSDEFormDetail();
							tabPagePSDEFormDetail.setPSDEDRItemName(psDEDRDetail.getPSDEDRItemName());
							tabPagePSDEFormDetail.setCaption(psDEDRDetail.getCaption());
							String strName = String.format("%1$s_%2$s", psDEFormDetail.getName(), psDEDRDetail.getName()).toLowerCase();
							tabPagePSDEFormDetail.setName(strName);
//							if(iPSDEDRDetail.getCapPSLanguageRes()!=null) {
//								tabPagePSDEFormDetail.setCAPPSLANRESID(iPSDEDRDetail.getCapPSLanguageRes().getId());
//							}
							tabPagePSDEFormDetail.setDetailType(FormDetailType.TABPAGE.value);
							//放入计数器
							if(StringUtils.hasLength(psDEDRDetail.getCounterId())) {
								tabPagePSDEFormDetail.setCounterId(psDEDRDetail.getCounterId());
								tabPagePSDEFormDetail.setCounterMode(psDEDRDetail.getCounterMode());
								tabPagePSDEFormDetail.setPSSysCounterId(psDEDataRelation.getPSSysCounterId());
								tabPagePSDEFormDetail.setPSSysCounterName(psDEDataRelation.getPSSysCounterName());
//								if(StringUtils.hasLength(iPSDEDataRelation.getps())) {
//									tabPagePSDEFormDetail.setPSSYSCOUNTERID(this.iPSDEDataRelation.getPSSysCounterId());
//								}
							}
							
							//插入一个关系部件
							
							PSDEFormDetail druipartPSDEFormDetail = new PSDEFormDetail();
							strName = String.format("%1$s_%2$s_druipart", psDEFormDetail.getName(), psDEDRDetail.getName()).toLowerCase();
							druipartPSDEFormDetail.setName(strName);
							druipartPSDEFormDetail.setDetailType(FormDetailType.DRUIPART.value);
							druipartPSDEFormDetail.setPSDEDRItemId(psDEDRDetail.getPSDEDRItemId());
							if(StringUtils.hasLength(psDEFormDetail.getResetItemName())) {
								druipartPSDEFormDetail.setResetItemName(psDEFormDetail.getResetItemName());
							}
							
							if(psDEFormDetail.getMaskMode()!=null) {
								druipartPSDEFormDetail.setMaskMode(psDEFormDetail.getMaskMode());
							}
							
							if(StringUtils.hasLength(psDEFormDetail.getMaskInfo())) {
								druipartPSDEFormDetail.setMaskInfo(psDEFormDetail.getMaskInfo());
							}
							
//							if(!StringHelper.IsNullOrEmpty(this.psDEFormDetail.getMASKPSLANRESID())) {
//								druipartPSDEFormDetail.setMASKPSLANRESID(this.psDEFormDetail.getMASKPSLANRESID());
//							}
							
						
							if(psDEFormDetail.getBuildInAction() != null) {
								druipartPSDEFormDetail.setBuildInAction(psDEFormDetail.getBuildInAction());
							}
							
							tabPagePSDEFormDetail.getPSDEFormDetailsIf().add(druipartPSDEFormDetail);
							list2.add(tabPagePSDEFormDetail);
							
						}
						
						if(list2.size()>0) {
							if(list.size() == 0) {
								list.addAll(list2); 
							}
							else {
								int nInsertPos = DataTypeUtils.getIntegerValue(psDEFormDetail.getInsertPos(), -1);
								
								if(nInsertPos >= list.size()) {
									nInsertPos = -1;
								}
								
								if(nInsertPos == -1) {
									list.addAll(list2);
								}
								else {
									list.addAll(nInsertPos, list2);
								}
							}
						}
					}
				}
			}
			
			if (!ObjectUtils.isEmpty(list)) {
				ArrayNode arrayNode = objectNode.putArray(PSDEFormTabPanelImpl.ATTR_GETPSDEFORMTABPAGES);
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, list, arrayNode);
			}
			
			
		}
			break;
		case "USERCONTROL":
			break;
		default:
			break;
		}

		if (!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFDLogics())) {

			Map<String, PSDEFDLogic> catPSDEFDLogicMap = new LinkedHashMap<String, PSDEFDLogic>();
			for(PSDEFDLogic psDEFDLogic : psDEFormDetail.getPSDEFDLogics()) {
				if(!StringUtils.hasLength(psDEFDLogic.getLogicCat())){
					continue;
				}
				
				PSDEFDLogic groupPSDEFDLogic = catPSDEFDLogicMap.get(psDEFDLogic.getLogicCat());
				if(groupPSDEFDLogic == null) {
					groupPSDEFDLogic = new PSDEFDLogic();
					groupPSDEFDLogic.setName(String.format("表单成员[%1$s][%2$s]逻辑", psDEFormDetail.getName(), psDEFDLogic.getLogicCat()));
					groupPSDEFDLogic.setGroupOP(GroupCondOP.AND.value);
					groupPSDEFDLogic.logictype(FormDetailLogicType.GROUP);
					groupPSDEFDLogic.setLogicCat(psDEFDLogic.getLogicCat());
					catPSDEFDLogicMap.put(psDEFDLogic.getLogicCat(), groupPSDEFDLogic);
				}
				groupPSDEFDLogic.getPSDEFDLogicsIf().add(psDEFDLogic);
			}
			
			
			if(!ObjectUtils.isEmpty(catPSDEFDLogicMap)) {
				ArrayNode arrayNode = objectNode.putArray(PSDEFormDetailImpl.ATTR_GETPSDEFDGROUPLOGICS);
				for(java.util.Map.Entry<String, PSDEFDLogic> entry : catPSDEFDLogicMap.entrySet()) {
					ObjectNode psDEFDLogicNode = iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFDLogic.class, false).compile(iPSModelTranspileContext, entry.getValue(), null);
					psDEFDLogicNode.put(PSDEFDCatGroupLogicImpl.ATTR_GETLOGICCAT, entry.getKey());
					
					//获取相关的项集合
					Map<String, String> nameMap = new LinkedHashMap<String, String>();
					fillPSDEFDLogicItemNames(entry.getValue(), nameMap);
					if(!ObjectUtils.isEmpty(nameMap)) {
						ArrayNode nameArray = psDEFDLogicNode.putArray(PSDEFDCatGroupLogicImpl.ATTR_GETRELATEDDETAILNAMES);
						for(String strName : nameMap.keySet()) {
							nameArray.add(strName);
						}
					}
					
					arrayNode.add(psDEFDLogicNode);
				}
			}
		}

	}
	
	
	protected void fillPSDEFDLogicItemNames(PSDEFDLogic groupPSDEFDLogic, Map<String, String> map) {
		
		List<PSDEFDLogic> psDEFDLogics = groupPSDEFDLogic.getPSDEFDLogics();
		if(ObjectUtils.isEmpty(psDEFDLogics)) {
			return;
		}
		
		for(PSDEFDLogic psDEFDLogic : psDEFDLogics) {
			if(FormDetailLogicType.GROUP.value.equalsIgnoreCase(psDEFDLogic.getLogicType())) {
				fillPSDEFDLogicItemNames(psDEFDLogic, map);
				continue;
			}
			
			if(FormDetailLogicType.SINGLE.value.equalsIgnoreCase(psDEFDLogic.getLogicType())) {
				if(StringUtils.hasLength(psDEFDLogic.getFDName())) {
					map.put(psDEFDLogic.getFDName(), "");
				}
				continue;
			}
		}
		
	}
}