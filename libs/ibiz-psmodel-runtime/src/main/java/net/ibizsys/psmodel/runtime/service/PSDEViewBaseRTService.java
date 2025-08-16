package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.calendar.IPSSysCalendar;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.model.control.form.IPSDESearchForm;
import net.ibizsys.model.control.grid.IPSDEGrid;
import net.ibizsys.model.control.toolbar.IPSDEToolbar;
import net.ibizsys.psmodel.core.domain.PSAppDEView;
import net.ibizsys.psmodel.core.domain.PSAppView;
import net.ibizsys.psmodel.core.domain.PSDEViewBase;
import net.ibizsys.psmodel.core.domain.PSDEViewCtrl;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDEViewBaseFilter;
import net.ibizsys.psmodel.core.service.IPSDEViewBaseService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEViewBaseRTService extends PSModelRTServiceBase<PSDEViewBase, PSDEViewBaseFilter> implements IPSDEViewBaseService{
    private static final Log log = LogFactory.getLog(PSDEViewBaseRTService.class);

    @Override
    public PSDEViewBase createDomain(){
        return new PSDEViewBase();
    }

    @Override
    public PSDEViewBaseFilter createFilter(){
        return new PSDEViewBaseFilter();
	}

	@Override
	public PSDEViewBase getDomain(Object params) {
		if(params instanceof PSDEViewBase) {
			return (PSDEViewBase)params;
		}
		return getMapper().convertValue(params, PSDEViewBase.class);
	}

	@Override
	public PSDEViewBaseFilter getFilter(Object params) {
		if(params instanceof PSDEViewBaseFilter) {
			return (PSDEViewBaseFilter)params;
		}
		return getMapper().convertValue(params, PSDEViewBaseFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEVIEWBASE";
        }
        else{
            return "PSDEVIEWBASES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSAppView.class;
    }
    
    @Override
    protected List<IPSAppView> getPSModelObjectList(PSDEViewBaseFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDEViewBase.FIELD_PSDEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSDEId)) {
     		objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    	}
    	
    	String strPSDEId = null;
    	if(objPSDEId!=null) {
    		strPSDEId = (String)objPSDEId;
    	}

    	List<IPSAppView> psDEViewBaseList = new ArrayList<IPSAppView>();
    	if(!ObjectUtils.isEmpty(this.getPSSystemService().getPSSystem().getAllPSApps())) {
    		for(IPSApplication iPSApplication : this.getPSSystemService().getPSSystem().getAllPSApps()) {
    			if(ObjectUtils.isEmpty(iPSApplication.getAllPSAppViews())) {
    				continue;
    			}
    			psDEViewBaseList.addAll(iPSApplication.getAllPSAppViews());
    		}
    	}
    	
    	Map<String, IPSAppView> psDEViewBaseMap = new HashMap<String, IPSAppView>();
    	
    	for(IPSAppView iPSDEViewBase: psDEViewBaseList) {
    		
    		if(!(iPSDEViewBase instanceof IPSAppDEView)) {
    			continue;
    		}
    		
    		if(StringUtils.hasLength(strPSDEId)) {
    			if(iPSDEViewBase.getPSAppDataEntity() == null || iPSDEViewBase.getPSAppDataEntity().getPSDataEntity() == null) {
    				continue;
    			}
    			
    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEViewBase.getPSAppDataEntity().getPSDataEntity());
    			if(!strPSDEId.equals(strId)) {
    				continue;
    			}
    		}
    		
    		IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSDEViewBase;
    		String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)iPSDEViewBase.getPSAppDataEntity().getPSDataEntity(), true), iPSAppDEView.getPSDEViewCodeName()).toLowerCase();
    		
    		psDEViewBaseMap.put(strTag
    				, iPSDEViewBase);
    		
    	}
    	
    	psDEViewBaseList.clear();
    	psDEViewBaseList.addAll(psDEViewBaseMap.values());
    	return psDEViewBaseList;
    	
    }
    
    @Override
    protected PSDEViewBase doGet(String key, boolean tryMode) throws Exception {
    	IPSModelObject iPSModelObject = this.getPSModelObject(key, tryMode);
		if (iPSModelObject != null) {
			PSAppView psAppDEView = (PSAppView)getPSModelRTServiceSession().getPSModelListTranspiler(getPSModelObjectCls(), false).decompile(this.getPSModelRTServiceSession(), iPSModelObject, null, true);
			
			PSDEViewBase psDEViewBase = new PSDEViewBase();
			psDEViewBase.putAll(psAppDEView.any());
			
			IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSModelObject;
			String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)iPSAppDEView.getPSAppDataEntity().getPSDataEntity(), true), iPSAppDEView.getPSDEViewCodeName()).toLowerCase();
			psDEViewBase.setId(strTag);
			
			
			this.fillDomain(psDEViewBase, iPSModelObject, true);
			return psDEViewBase;
		}
		return null;
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	
    	String strPSDEId = getParentId(key);
    	PSDEViewBaseFilter psDEViewBaseFilter = new PSDEViewBaseFilter();
    	psDEViewBaseFilter.psdeid__eq(strPSDEId);
    	
    	List<IPSAppView> psAppViewList = this.getPSModelObjectList(psDEViewBaseFilter);
    	if (psAppViewList != null) {
			for (IPSAppView iPSDEViewBase : psAppViewList) {
				
	    		if(!(iPSDEViewBase instanceof IPSAppDEView)) {
	    			continue;
	    		}
	    		
	    		if(StringUtils.hasLength(strPSDEId)) {
	    			if(iPSDEViewBase.getPSAppDataEntity() == null || iPSDEViewBase.getPSAppDataEntity().getPSDataEntity() == null) {
	    				continue;
	    			}
	    			
	    			String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEViewBase.getPSAppDataEntity().getPSDataEntity());
	    			if(!strPSDEId.equals(strId)) {
	    				continue;
	    			}
	    		}
	    		
	    		IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSDEViewBase;
	    		String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)iPSDEViewBase.getPSAppDataEntity().getPSDataEntity(), true), iPSAppDEView.getPSDEViewCodeName()).toLowerCase();
	    		if(strTag.equalsIgnoreCase(key)) {
	    			return iPSAppDEView;
	    		}
			}
		}
		if (tryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定模型对象[%1$s]", key));
    }
    
    protected List<PSDEViewBase> fillDomainList(List<PSDEViewBase> domainList, List<? extends IPSModelObject> psModelObjectList, String strDataSetName, PSDEViewBaseFilter f) throws Exception {
    	List<PSAppDEView> psAppDEViewList = new ArrayList<PSAppDEView>();
		getPSModelRTServiceSession().getPSModelListTranspiler(getPSModelObjectCls(), false).decompile(this.getPSModelRTServiceSession(), psModelObjectList, psAppDEViewList, false);
		
		for (int i = 0; i < psAppDEViewList.size(); i++) {
			
			PSDEViewBase psDEViewBase = new PSDEViewBase();
			psDEViewBase.putAll(psAppDEViewList.get(i).any());
			
			IPSAppDEView iPSAppDEView = (IPSAppDEView)psModelObjectList.get(i);
			String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)iPSAppDEView.getPSAppDataEntity().getPSDataEntity(), true), iPSAppDEView.getPSDEViewCodeName()).toLowerCase();
			psDEViewBase.setId(strTag);
			
			
			this.fillDomain(psDEViewBase, iPSAppDEView, false);
			domainList.add(psDEViewBase);
		}
		return domainList;
	}
    
    
    @Override
    protected void doFillDomain(PSDEViewBase domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, getParentId(domain.getId()));
    	
    	IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSModelObject;
    	
    	domain.setPSDEId(parentPSModel.getId());
    	domain.setPSDEName(parentPSModel.getName());
    	domain.setPSDEViewBaseName(iPSAppDEView.getTitle());
    	domain.set("psdeviewbasetype", domain.get("psdeviewtype"));
		
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    	
    	if(bFullMode) {
    		if(iPSAppDEView.getPSControls()!=null) {
    			int nOrderValue = 100;
    			for(IPSControl iPSControl : iPSAppDEView.getPSControls()) {
    				
    				PSDEViewCtrl psDEViewCtrl = this.getPSDEViewCtrl(iPSControl);
    				if(psDEViewCtrl == null) {
    					continue;
    				}
    				psDEViewCtrl.setPSDEViewBaseId(domain.getPSDEViewBaseId());
    				psDEViewCtrl.setPSDEViewBaseName(domain.getPSDEViewBaseName());
    				psDEViewCtrl.setPSDEViewCtrlId(String.format("%1$s.%2$s", domain.getPSDEViewBaseId(), psDEViewCtrl.getPSDEViewCtrlName()).toLowerCase());
    				psDEViewCtrl.setOrderValue(nOrderValue);
    				psDEViewCtrl.setValidFlag(1);
    				domain.getPSDEViewCtrlsIf().add(psDEViewCtrl);
    				nOrderValue += 100;
    			}
    		}
    	}
    } 
    
    protected PSDEViewCtrl getPSDEViewCtrl(IPSControl iPSControl) throws Exception {
    	PSDEViewCtrl psDEViewCtrl = new PSDEViewCtrl();
    	String strControlType = iPSControl.getControlType();
    	psDEViewCtrl.setPSDEViewCtrlType(strControlType);
    	psDEViewCtrl.setPSDEViewCtrlName(iPSControl.getName().toUpperCase());
    	if(iPSControl.getPSAppDataEntity()!=null && iPSControl.getPSAppDataEntity().getPSDataEntity() != null) {
    		psDEViewCtrl.setPSDEId(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSControl.getPSAppDataEntity().getPSDataEntity()));
        	psDEViewCtrl.setPSDEName(iPSControl.getPSAppDataEntity().getPSDataEntity().getName());
    	}
    	
		switch(strControlType) {
		
		case "APPMENU":
			//return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuImpl.class, false);
			return null;
		case "CALENDAR":
			IPSSysCalendar iPSSysCalendar = (IPSSysCalendar)iPSControl;
			psDEViewCtrl.setPSSysCalendarId(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSysCalendar));
			psDEViewCtrl.setPSSysCalendarName(iPSSysCalendar.getLogicName());
			psDEViewCtrl.set("psctrlid", psDEViewCtrl.getPSSysCalendarId());
			psDEViewCtrl.set("psctrlname", psDEViewCtrl.getPSSysCalendarName());
			break;
		case "CALENDAREXPBAR":
			break;
		case "CAPTIONBAR":
			break;
		case "CHART":
			break;
		case "CHARTEXPBAR":
			break;
		case "CONTEXTMENU":
			break;
		case "CUSTOM":
			break;
		case "DASHBOARD":
			break;
		case "DATAINFOBAR":
			break;
		case "DATAVIEW":
			break;
		case "DATAVIEWEXPBAR":
			break;
		case "DRBAR":
			break;
		case "DRTAB":
			break;
		case "EXPBAR":
			break;
		case "FORM":
			IPSDEForm iPSDEForm = (IPSDEForm)iPSControl;
			psDEViewCtrl.setPSDEFormId(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEForm));
			psDEViewCtrl.setPSDEFormName(iPSDEForm.getLogicName());
			psDEViewCtrl.set("psctrlid", psDEViewCtrl.getPSDEFormId());
			psDEViewCtrl.set("psctrlname", psDEViewCtrl.getPSDEFormName());
			break;
		case "GANTT":
			break;
		case "GANTTEXPBAR":
			break;
		case "GRID":
			IPSDEGrid iPSDEGrid = (IPSDEGrid)iPSControl;
			psDEViewCtrl.setPSDEGridId(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEGrid));
			psDEViewCtrl.setPSDEGridName(iPSDEGrid.getLogicName());
			psDEViewCtrl.set("psctrlid", psDEViewCtrl.getPSDEGridId());
			psDEViewCtrl.set("psctrlname", psDEViewCtrl.getPSDEGridName());
			break;
		case "GRIDEXPBAR":
			break;
		case "KANBAN":
			break;
		case "LIST":
			break;
		case "LISTEXPBAR":
			break;
		case "MAP":
			break;
		case "MAPEXPBAR":
			break;
		case "MOBMDCTRL":
			break;
		case "MULTIEDITVIEWPANEL":
			break;
		case "PANEL":
			break;
		case "PICKUPVIEWPANEL":
			break;
		case "PORTLET":
			break;
		case "REPORTPANEL":
			break;
		case "SEARCHBAR":
			break;
		case "SEARCHFORM":
			IPSDESearchForm iPSDESearchForm = (IPSDESearchForm)iPSControl;
			psDEViewCtrl.setPSDEFormId(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDESearchForm));
			psDEViewCtrl.setPSDEFormName(iPSDESearchForm.getLogicName());
			psDEViewCtrl.set("psctrlid", psDEViewCtrl.getPSDEFormId());
			psDEViewCtrl.set("psctrlname", psDEViewCtrl.getPSDEFormName());
			break;
		case "STATEWIZARDPANEL":
			break;
		case "TABEXPPANEL":
			break;
		case "TABVIEWPANEL":
			break;
		case "TOOLBAR":
			IPSDEToolbar iPSDEToolbar = (IPSDEToolbar)iPSControl;
			psDEViewCtrl.setPSDEToolbarId(this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSDEToolbar));
			psDEViewCtrl.setPSDEToolbarName(iPSDEToolbar.getLogicName());
			psDEViewCtrl.set("psctrlid", psDEViewCtrl.getPSDEToolbarId());
			psDEViewCtrl.set("psctrlname", psDEViewCtrl.getPSDEToolbarName());
			break;
		case "TREEEXPBAR":
			break;
		case "TREEGRID":
			break;
		case "TREEGRIDEX":
			break;
		case "TREEVIEW":
			break;
		case "VIEWLAYOUTPANEL":
			break;
		case "VIEWPANEL":
			break;
		case "WFEXPBAR":
			break;
		case "WIZARDPANEL":
			break;
			
		}
    	
    	return psDEViewCtrl;
    }
}
