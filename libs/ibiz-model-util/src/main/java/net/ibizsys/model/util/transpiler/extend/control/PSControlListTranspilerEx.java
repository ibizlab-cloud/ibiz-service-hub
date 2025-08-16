package net.ibizsys.model.util.transpiler.extend.control;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.CtrlType;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.PSControlImpl;
import net.ibizsys.model.control.calendar.IPSSysCalendar;
import net.ibizsys.model.control.chart.IPSDEChart;
import net.ibizsys.model.control.dashboard.IPSDashboard;
import net.ibizsys.model.control.dataview.IPSDEDataView;
import net.ibizsys.model.control.drctrl.IPSDEDRBar;
import net.ibizsys.model.control.editor.PSAutoCompleteImpl;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.model.control.form.IPSDEFormDetail;
import net.ibizsys.model.control.form.IPSDEFormItemUpdate;
import net.ibizsys.model.control.form.IPSDEFormItemVR;
import net.ibizsys.model.control.form.IPSDESearchForm;
import net.ibizsys.model.control.form.PSDEFormImpl;
import net.ibizsys.model.control.grid.IPSDEGrid;
import net.ibizsys.model.control.grid.IPSDEGridColumn;
import net.ibizsys.model.control.list.IPSDEList;
import net.ibizsys.model.control.map.IPSSysMap;
import net.ibizsys.model.control.panel.IPSPanel;
import net.ibizsys.model.control.toolbar.IPSDEContextMenu;
import net.ibizsys.model.control.toolbar.IPSDEToolbar;
import net.ibizsys.model.control.toolbar.IPSDEToolbarItem;
import net.ibizsys.model.control.tree.IPSDETree;
import net.ibizsys.model.control.tree.IPSDETreeColumn;
import net.ibizsys.model.control.tree.IPSDETreeNode;
import net.ibizsys.model.control.tree.IPSDETreeNodeRS;
import net.ibizsys.model.control.wizardpanel.IPSDEStateWizardPanel;
import net.ibizsys.model.control.wizardpanel.IPSWizardPanel;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEChart;
import net.ibizsys.psmodel.core.domain.PSDEDataRelation;
import net.ibizsys.psmodel.core.domain.PSDEDataView;
import net.ibizsys.psmodel.core.domain.PSDEFIUDetail;
import net.ibizsys.psmodel.core.domain.PSDEFIUpdate;
import net.ibizsys.psmodel.core.domain.PSDEFIVR;
import net.ibizsys.psmodel.core.domain.PSDEForm;
import net.ibizsys.psmodel.core.domain.PSDEFormDetail;
import net.ibizsys.psmodel.core.domain.PSDEGrid;
import net.ibizsys.psmodel.core.domain.PSDEGridCol;
import net.ibizsys.psmodel.core.domain.PSDEList;
import net.ibizsys.psmodel.core.domain.PSDETBItem;
import net.ibizsys.psmodel.core.domain.PSDEToolbar;
import net.ibizsys.psmodel.core.domain.PSDETreeCol;
import net.ibizsys.psmodel.core.domain.PSDETreeNode;
import net.ibizsys.psmodel.core.domain.PSDETreeNodeRS;
import net.ibizsys.psmodel.core.domain.PSDETreeView;
import net.ibizsys.psmodel.core.domain.PSDEWizard;
import net.ibizsys.psmodel.core.domain.PSSysDashboard;
import net.ibizsys.psmodel.core.domain.PSSysMapView;
import net.ibizsys.psmodel.core.domain.PSSysViewPanel;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.FormType;

public class PSControlListTranspilerEx extends net.ibizsys.model.util.transpiler.control.PSControlListTranspiler {

	private static final ThreadLocal<Deque<ObjectNode>> COMPILE_LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<ObjectNode>>() {
		@Override
		protected Deque<ObjectNode> initialValue() {
			return new ArrayDeque<ObjectNode>();
		}
	};

	public static ObjectNode peekCompileObject() {
		return COMPILE_LOOKUP_KEY_HOLDER.get().peek();
	}

	public static void pushCompileObject(ObjectNode objectNode) {
		COMPILE_LOOKUP_KEY_HOLDER.get().push(objectNode);
	}

	public static void pollCompileObject() {
		Deque<ObjectNode> deque = COMPILE_LOOKUP_KEY_HOLDER.get();
		deque.poll();
		if (deque.isEmpty()) {
			COMPILE_LOOKUP_KEY_HOLDER.remove();
		}
	}
	
	private static final ThreadLocal<Deque<IPSModel>> DECOMPILE_LOOKUP_KEY_HOLDER = new ThreadLocal<Deque<IPSModel>>() {
		@Override
		protected Deque<IPSModel> initialValue() {
			return new ArrayDeque<IPSModel>();
		}
	};

	public static IPSModel peekDecompileObject() {
		return DECOMPILE_LOOKUP_KEY_HOLDER.get().peek();
	}

	public static void pushDecompileObject(IPSModel domain) {
		DECOMPILE_LOOKUP_KEY_HOLDER.get().push(domain);
	}

	public static void pollDecompileObject() {
		Deque<IPSModel> deque = DECOMPILE_LOOKUP_KEY_HOLDER.get();
		deque.poll();
		if (deque.isEmpty()) {
			DECOMPILE_LOOKUP_KEY_HOLDER.remove();
		}
	}
	

//	public static void clear() {
//		LOOKUP_KEY_HOLDER.remove();
//	}

	@Override
	protected IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception {
		if (iPSModelObject instanceof IPSDashboard) {
			return new PSSysDashboard();
		}

		if (iPSModelObject instanceof IPSDEForm) {
			return new PSDEForm();
		}

		if (iPSModelObject instanceof IPSDEGrid) {
			return new PSDEGrid();
		}

		if (iPSModelObject instanceof IPSPanel) {
			return new PSSysViewPanel();
		}

		if ((iPSModelObject instanceof IPSDEToolbar) || (iPSModelObject instanceof IPSDEContextMenu)) {
			return new PSDEToolbar();
		}

		if (iPSModelObject instanceof IPSSysCalendar) {
			return new PSSysDashboard();
		}

		if (iPSModelObject instanceof IPSDEChart) {
			return new PSDEChart();
		}

		if (iPSModelObject instanceof IPSDEDataView) {
			return new PSDEDataView();
		}

		if (iPSModelObject instanceof IPSDEDRBar) {
			return new PSDEDataRelation();
		}

		if (iPSModelObject instanceof IPSDETree) {
			return new PSDETreeView();
		}

		if (iPSModelObject instanceof IPSDEList) {
			return new PSDEList();
		}

		if (iPSModelObject instanceof IPSSysMap) {
			return new PSSysMapView();
		}

		if ((iPSModelObject instanceof IPSWizardPanel) || (iPSModelObject instanceof IPSDEStateWizardPanel)) {
			return new PSDEWizard();
		}

		return super.createDomain(iPSModelObject);
	}

	
	
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		
		try {
			PSControlListTranspilerEx.pushDecompileObject(domain);
			
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

			IPSControl iPSControl = (IPSControl) iPSModelObject;
			if (StringUtils.hasLength(iPSControl.getLogicName())) {
				domain.setName(iPSControl.getLogicName());
			}

			if (iPSModelObject instanceof IPSDEForm) {
				IPSDEForm iPSDEForm = (IPSDEForm) iPSModelObject;
				PSDEForm psDEForm = (PSDEForm) domain;
				this.doDecompile(iPSModelTranspileContext, iPSDEForm, psDEForm, bFullMode);
				return;
			}

			if (iPSModelObject instanceof IPSDEToolbar) {
				IPSDEToolbar iPSDEToolbar = (IPSDEToolbar) iPSModelObject;
				PSDEToolbar psDEToolbar = (PSDEToolbar) domain;

				if (bFullMode) {
					if (iPSDEToolbar.getPSDEToolbarItems() != null) {
						int nOrder = 100;
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDEToolbarItem.class, false).decompile(iPSModelTranspileContext, iPSDEToolbar.getPSDEToolbarItems(), psDEToolbar.getPSDETBItemsIf(), bFullMode);
						for (PSDETBItem child : psDEToolbar.getPSDETBItemsIf()) {
							child.setPSDEToolbarId(psDEToolbar.getId());
							child.setPSDEToolbarName(psDEToolbar.getName());
							child.setOrderValue(nOrder);
							nOrder += 100;
						}
					}
				}
				return;
			}

			if (iPSModelObject instanceof IPSDEGrid) {
				IPSDEGrid iPSDEGrid = (IPSDEGrid) iPSModelObject;
				PSDEGrid psDEGrid = (PSDEGrid) domain;

				if (bFullMode) {
					if (iPSDEGrid.getPSDEGridColumns() != null) {
						int nOrder = 100;
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDEGridColumn.class, false).decompile(iPSModelTranspileContext, iPSDEGrid.getPSDEGridColumns(), psDEGrid.getPSDEGridColsIf(), bFullMode);
						for (PSDEGridCol child : psDEGrid.getPSDEGridColsIf()) {
							child.setPSDEGridId(psDEGrid.getId());
							child.setPSDEGridName(psDEGrid.getName());
							child.setOrderValue(nOrder);
							nOrder += 100;
						}
					}
				}
				return;
			}

			if (iPSModelObject instanceof IPSDETree) {
				IPSDETree iPSDETree = (IPSDETree) iPSModelObject;
				PSDETreeView psDETreeView = (PSDETreeView) domain;

				if (bFullMode) {
					if (iPSDETree.getPSDETreeNodes() != null) {
						int nOrder = 100;
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDETreeNode.class, false).decompile(iPSModelTranspileContext, iPSDETree.getPSDETreeNodes(), psDETreeView.getPSDETreeNodesIf(), bFullMode);
						for (PSDETreeNode child : psDETreeView.getPSDETreeNodesIf()) {
							child.setPSDETreeViewId(psDETreeView.getId());
							child.setPSDETreeViewName(psDETreeView.getName());
							// child.setOrderValue(nOrder);
							nOrder += 100;
						}
					}

					if (iPSDETree.getPSDETreeNodeRSs() != null) {
						int nOrder = 100;
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDETreeNodeRS.class, false).decompile(iPSModelTranspileContext, iPSDETree.getPSDETreeNodeRSs(), psDETreeView.getPSDETreeNodeRsIf(), bFullMode);
						for (PSDETreeNodeRS child : psDETreeView.getPSDETreeNodeRsIf()) {
							child.setPSDETreeViewId(psDETreeView.getId());
							child.setPSDETreeViewName(psDETreeView.getName());
							child.setOrderValue(nOrder);
							nOrder += 100;
						}
					}

					if (iPSDETree.getPSDETreeColumns() != null) {
						int nOrder = 100;
						iPSModelTranspileContext.getPSModelListTranspiler(IPSDETreeColumn.class, false).decompile(iPSModelTranspileContext, iPSDETree.getPSDETreeColumns(), psDETreeView.getPSDETreeColsIf(), bFullMode);
						for (PSDETreeCol child : psDETreeView.getPSDETreeColsIf()) {
							child.setPSDETreeViewId(psDETreeView.getId());
							child.setPSDETreeViewName(psDETreeView.getName());
							child.setOrderValue(nOrder);
							nOrder += 100;
						}
					}
				}
				return;
			}
			
		}
		finally {
			
			PSControlListTranspilerEx.pollDecompileObject();
		}
		
	}

	protected void doDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSDEForm iPSDEForm, PSDEForm psDEForm, boolean bFullMode) throws Exception {
		if (iPSDEForm instanceof IPSDESearchForm) {
			psDEForm.formtype(FormType.SEARCHFORM);
		} else {
			psDEForm.formtype(FormType.EDITFORM);
		}

		if (bFullMode) {
			
			Map<String, PSDEFormDetail> psDEFormDetailMap = new HashMap<String, PSDEFormDetail>(); 
			
			if (iPSDEForm.getPSDEFormPages() != null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).decompile(iPSModelTranspileContext, iPSDEForm.getPSDEFormPages(), psDEForm.getPSDEFormDetailsIf(), bFullMode);
				for (PSDEFormDetail child : psDEForm.getPSDEFormDetailsIf()) {
					child.setPSDEFormId(psDEForm.getId());
					child.setPSDEFormName(psDEForm.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
					
					this.fillPSDEFormDetailMap(psDEFormDetailMap, child);
				}
			}

			if (iPSDEForm.getPSDEFormItemUpdates() != null) {
				// int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormItemUpdate.class, false).decompile(iPSModelTranspileContext, iPSDEForm.getPSDEFormItemUpdates(), psDEForm.getPSDEFIUpdatesIf(), bFullMode);
				for (PSDEFIUpdate child : psDEForm.getPSDEFIUpdatesIf()) {
					child.setPSDEFormId(psDEForm.getId());
					child.setPSDEFormName(psDEForm.getName());
					// child.setOrderValue(nOrder);
					// nOrder += 100;
					if(!ObjectUtils.isEmpty(child.getPSDEFIDetails())) {
						for(PSDEFIUDetail detail : child.getPSDEFIDetails()) {
							if(!StringUtils.hasLength(detail.getPSDEFormDetailName())) {
								continue;
							}
							
							PSDEFormDetail psDEFormDetail = psDEFormDetailMap.get(detail.getPSDEFormDetailName().toLowerCase());
							if(psDEFormDetail == null) {
								throw new Exception(String.format("无法获取表单项更新[%1$s]成员[%2$s]指定表单项[%3$s]", child.getName(), detail.getName(), detail.getPSDEFormDetailName())); 
							}
							
							detail.setPSDEFormDetailId(psDEFormDetail.getId());
							detail.setPSDEFormDetailName(psDEFormDetail.getName());
						}
					}
				}
			}

			if (iPSDEForm.getPSDEFormItemVRs() != null) {
				int nOrder = 100;
				iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormItemVR.class, false).decompile(iPSModelTranspileContext, iPSDEForm.getPSDEFormItemVRs(), psDEForm.getPSDEFIVRsIf(), bFullMode);
				for (PSDEFIVR child : psDEForm.getPSDEFIVRsIf()) {
					child.setPSDEFormId(psDEForm.getId());
					child.setPSDEFormName(psDEForm.getName());
					child.setOrderValue(nOrder);
					nOrder += 100;
					
					if(StringUtils.hasLength(child.getPSDEFIName())) {

						PSDEFormDetail psDEFormDetail = psDEFormDetailMap.get(child.getPSDEFIName().toLowerCase());
						if(psDEFormDetail == null) {
							throw new Exception(String.format("无法获取表单项规则[%1$s]指定表单项[%2$s]", child.getName(), child.getPSDEFIName())); 
						}
						
						child.setPSDEFIId(psDEFormDetail.getId());
						child.setPSDEFIName(psDEFormDetail.getName());
					}
					
				}
			}
		}
	}
	
	protected Map<String, PSDEFormDetail> fillPSDEFormDetailMap(Map<String, PSDEFormDetail> map, PSDEFormDetail psDEFormDetail) {
		if(map == null) {
			map = new HashMap<String, PSDEFormDetail>();
		}
		if(StringUtils.hasLength(psDEFormDetail.getName())) {
			map.put(psDEFormDetail.getName().toLowerCase(), psDEFormDetail);
		}
		if(!ObjectUtils.isEmpty(psDEFormDetail.getPSDEFormDetails())) {
			for (PSDEFormDetail child : psDEFormDetail.getPSDEFormDetails()) {
				this.fillPSDEFormDetailMap(map, child);
			}
		}
		return map;
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {

		try {
			PSControlListTranspilerEx.pushCompileObject(objectNode);
			
			if (domain instanceof PSDEForm) {
				String strFormType = (String) domain.get("formtype");
				if (FormType.EDITFORM.value.equals(strFormType)) {
					domain.set("controltype", CtrlType.FORM.value);
				} else if (FormType.SEARCHFORM.value.equals(strFormType)) {
					domain.set("controltype", CtrlType.SEARCHFORM.value);
				} else
					domain.set("controltype", CtrlType.FORM.value);
			}

			super.onCompile(iPSModelTranspileContext, domain, objectNode);

			objectNode.put(PSControlImpl.ATTR_GETCONTROLTYPE, (String) domain.get("controltype"));
			objectNode.put(PSControlImpl.ATTR_GETCODENAME, (String) domain.get("codename"));
			objectNode.remove(PSControlImpl.ATTR_GETNAME);

			if (domain instanceof PSDEForm) {
				this.doCompile(iPSModelTranspileContext, (PSDEForm) domain, objectNode);
				return;
			}
		}
		finally {
			
			PSControlListTranspilerEx.pollCompileObject();
		}
	}

	protected void doCompile(IPSModelTranspileContext iPSModelTranspileContext, PSDEForm psDEForm, ObjectNode objectNode) throws Exception {

		objectNode.put(PSControlImpl.ATTR_GETLOGICNAME, psDEForm.getName());
		//
		if (StringUtils.hasLength(psDEForm.getPSDEId())) {
			objectNode.set(PSAutoCompleteImpl.ATTR_GETPSAPPDATAENTITY, iPSModelTranspileContext.getPSModelListTranspiler(IPSAppDataEntity.class, false).getModelRef(iPSModelTranspileContext, psDEForm.getPSDEId(), false, null));
		}

		String strLayoutMode = psDEForm.getLayoutMode();
		if (!ObjectUtils.isEmpty(psDEForm.getPSDEFormDetails())) {
			ArrayNode arrayNode = objectNode.putArray(PSDEFormImpl.ATTR_GETPSDEFORMPAGES);
			for (PSDEFormDetail item : psDEForm.getPSDEFormDetails()) {
				if (!StringUtils.hasLength(item.getLayoutMode())) {
					item.setLayoutMode(strLayoutMode);
				}
			}
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormDetail.class, false).compile(iPSModelTranspileContext, psDEForm.getPSDEFormDetails(), arrayNode);
		}

		if (!ObjectUtils.isEmpty(psDEForm.getPSDEFIUpdates())) {
			ArrayNode arrayNode = objectNode.putArray(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES);
			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormItemUpdate.class, false).compile(iPSModelTranspileContext, psDEForm.getPSDEFIUpdates(), arrayNode);
		}

//		if (!ObjectUtils.isEmpty(psDEForm.getPSDEFormRves())) {
//			ArrayNode arrayNode = objectNode.putArray(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS);
//			iPSModelTranspileContext.getPSModelListTranspiler(IPSDEFormItemVR.class, false).compile(iPSModelTranspileContext, psDEForm.getPSDEFormRves(), arrayNode);
//		}
	}
}