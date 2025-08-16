package net.ibizsys.psmodel.runtime.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.IPSControlContainer;
import net.ibizsys.model.control.IPSNavigateContext;
import net.ibizsys.model.control.IPSNavigateParam;
import net.ibizsys.model.control.IPSNavigateParamContainer;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.model.control.form.IPSDEFormDRUIPart;
import net.ibizsys.model.control.form.IPSDEFormDetail;
import net.ibizsys.model.control.form.IPSDEFormGroupBase;
import net.ibizsys.model.control.form.IPSDEFormMDCtrl;
import net.ibizsys.model.control.form.IPSDEFormPage;
import net.ibizsys.model.control.form.IPSDEFormTabPage;
import net.ibizsys.model.control.form.IPSDEFormTabPanel;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.psmodel.core.util.Conditions;
import net.ibizsys.psmodel.core.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;

public class PSModelRTServiceBase<M extends IPSModel, F extends IPSModelFilter> extends net.ibizsys.psmodel.core.util.PSModelServiceBase<M, F> implements IPSModelRTService<M> {

	private static final Log log = LogFactory.getLog(PSModelRTServiceBase.class);
	
	/**
	 * 视图参数中的导航上下文前缀
	 */
	public static final String VIEWPARAM_NAVCONTEXT = "SRFNAVCTX.";
	
	/**
	 * 视图参数中的导航参数前缀
	 */
	public static final String VIEWPARAM_NAVPARAM = "SRFNAVPARAM.";
	
	
    //数据集
    final public static String DATASET_DEFAULT = "DEFAULT";
    
	
	public static final Random random = new Random();
	
	
	public final static String KEY_UNKNOWN = "__UNKNOWN__";

	//private Map<String, Map<String, Object>> datasetCondMap = new HashMap<String, Map<String,Object>>()
	
	protected Random getRandom() {
		return PSModelRTServiceBase.random;
	}
	
	@Override
	public Object invoke(String pmodelName, String pkey, String methodName, String key, Object param) throws Exception {
		return this.doInvoke(pmodelName, pkey, methodName, key, param);
	}
	
	protected Object doInvoke(String pmodelName, String pkey, String methodName, String key, Object param) throws Exception {
		if(methodName.toUpperCase().indexOf(METHOD_FETCH) == 0) {
			if(StringUtils.hasLength(pmodelName)) {
				//转换模型
				IPSModelService parentPSModelService = this.getPSModelRTServiceSession().getPSModelService(pmodelName);
				Map<String, Object> map = null;
				if(param != null) {
					map = (Map)param;
				}
				else {
					map = new LinkedHashMap<>();
					param = map;
				}
				map.put("srfparentdename", parentPSModelService.getModelName(true));
				map.put("srfparentkey", pkey);
			}
		}
		return this.invoke(methodName, key, param);
	}

	protected String getOriginModelName() {
		return null;
	}

	// public M createDomain(IPSModelObject iPSModelObject) {
	// return this.createDomain();
	// }

	@Override
	protected M doGet(String key, boolean tryMode) throws Exception {
		IPSModelObject iPSModelObject = this.getPSModelObject(key, tryMode);
		if (iPSModelObject != null) {
			M domain = this.createDomain();
			domain = (M)getPSModelRTServiceSession().getPSModelListTranspiler(getPSModelObjectCls(), false).decompile(this.getPSModelRTServiceSession(), iPSModelObject, domain, true);
			this.fillDomain(domain, iPSModelObject, true);
			return domain;
		}
		return null;
	}

	@Override
	protected Page<M> doFetch(String strDataSetName, F f) throws Exception {
		List<M> domainList = getDomainList(strDataSetName, f);
		return this.createPage(domainList, f);
	}

	protected IPSSystemService getPSSystemService() throws Exception {
		return ((IPSModelRTServiceSession) PSModelServiceSession.getCurrent()).getPSSystemService();
	}

	protected IPSModelRTServiceSession getPSModelRTServiceSession() throws Exception {
		return ((IPSModelRTServiceSession) PSModelServiceSession.getCurrent());
	}

	protected List<M> getDomainList(String strDataSetName, F f) throws Exception {
		List<M> domainList = new ArrayList<>();
		List<? extends IPSModelObject> psModelObjectList = this.getPSModelObjectList(f);
		if (psModelObjectList == null) {
			return domainList;
		}

		
		domainList = this.fillDomainList(domainList, psModelObjectList, strDataSetName, f);

		// 执行过滤操作
		return filterDomainList(domainList, strDataSetName, f);
	}
	
	protected List<M> doGetDomainList(String strDataSetName, F f) throws Exception {
		List<M> domainList = new ArrayList<>();
		List<? extends IPSModelObject> psModelObjectList = this.getPSModelObjectList(f);
		if (psModelObjectList == null) {
			return domainList;
		}

		
		return this.fillDomainList(domainList, psModelObjectList, strDataSetName, f);
	}
	
	protected List<M> fillDomainList(List<M> domainList, List<? extends IPSModelObject> psModelObjectList, String strDataSetName, F f) throws Exception {
		getPSModelRTServiceSession().getPSModelListTranspiler(getPSModelObjectCls(), false).decompile(this.getPSModelRTServiceSession(), psModelObjectList, domainList, false);
		for (int i = 0; i < domainList.size(); i++) {
			this.fillDomain(domainList.get(i), psModelObjectList.get(i), false);
		}
		return domainList;
	}

	protected List<M> filterDomainList(List<M> domainList, String strDataSetName, F f) throws Exception {

		if(ObjectUtils.isEmpty(domainList)) {
			return domainList;
		}
		
		// 解出条件
		Map<String, Object> conds = f.any();
		Map<String, Object> dataSetConds = this.getDataSetConds(strDataSetName, f);
		if (!ObjectUtils.isEmpty(dataSetConds)) {
			if(conds == null) {
				conds = new HashMap<String, Object>();
			}
			conds.putAll(dataSetConds);
		}
		if (ObjectUtils.isEmpty(conds)) {
			return domainList;
		}

		Object query = f.get("query");
		String strQuery = null;
		if (!ObjectUtils.isEmpty(query)) {
			strQuery = query.toString().toUpperCase();
		}

		Map<String, Map<String, Object>> condMap = new LinkedHashMap<String, Map<String, Object>>();
		for (java.util.Map.Entry<String, Object> entry : conds.entrySet()) {
			String strCondition = entry.getKey();
			if (!StringUtils.hasLength(strCondition)) {
				continue;
			}
			
			Object value = entry.getValue();
			if (ObjectUtils.isEmpty(value)) {
				continue;
			}

			strCondition = strCondition.toLowerCase();
			if (strCondition.indexOf("n_") != 0) {
				continue;
			}

			strCondition = strCondition.substring(2);
			int nPos = strCondition.lastIndexOf("_");
			if (nPos == -1) {
				continue;
			}

			String strField = strCondition.substring(0, nPos);
			String strOp = strCondition.substring(nPos + 1);

			if (ObjectUtils.isEmpty(strField) || ObjectUtils.isEmpty(strOp) || strField.equals("dynainstmode")) {
				continue;
			}
			
//			if(strField.indexOf("psdeid")!=-1) {
//				if(value.toString().indexOf("@") != -1) {
//					value = value.toString().split("[@]")[1];
//				}
//			}
			

			Map<String, Object> map = condMap.get(strField);
			if (map == null) {
				map = new LinkedHashMap<String, Object>();
				condMap.put(strField, map);
			}
			map.put(strOp.toUpperCase(), value);
		}
		
		

		if (ObjectUtils.isEmpty(condMap) && ObjectUtils.isEmpty(strQuery)) {
			return domainList;
		}

		List<M> domainList2 = new ArrayList<>();
		for (M item : domainList) {

			if (strQuery != null) {
				if (!testQueryDomain(item,strQuery)) {
					continue;
				}
			}

			if (testDomain(item, condMap)) {
				domainList2.add(item);
			}
		}

		return domainList2;
	}
	
	protected Map<String, Object> getDataSetConds(String strDataSetName, F f) {
		return null;
	}

	protected boolean testQueryDomain(M domain,String strQuery) throws Exception {
		if (!StringUtils.hasLength(domain.getName())) {
			return false;
		}
		if (domain.getName().toUpperCase().indexOf(strQuery) == -1) {
			return false;
		}
		return true;
	}

	protected boolean testDomain(M domain, Map<String, Map<String, Object>> condMap) throws Exception {

		for (java.util.Map.Entry<String, Map<String, Object>> entry : condMap.entrySet()) {
			String strField = entry.getKey();
			Object value = domain.get(strField);
//			if (ObjectUtils.isEmpty(value)) {
//				return false;
//			}

			if(strField.indexOf("psdeid")!=-1) {
				if (!testDomainField2(value, entry.getValue())) {
					return false;
				}
				continue;
			}
			
			if (!testDomainField(value, entry.getValue())) {
				return false;
			}
		}

		return true;
	}

	protected boolean testDomainField(Object value, Map<String, Object> condMap) throws Exception {

		for (java.util.Map.Entry<String, Object> entry : condMap.entrySet()) {
			if (ObjectUtils.isEmpty(value) && !Conditions.NOTEQ.equals(entry.getKey())&& !Conditions.ISNULL.equals(entry.getKey())) {
				return false;
			}
			if (!testDomainField(value, entry.getKey(), entry.getValue())) {
				return false;
			}
		}
		return true;
	}
	
	protected boolean testDomainField2(Object value, Map<String, Object> condMap) throws Exception {

		if(value.toString().indexOf("@") != -1) {
			//指定范围，需要满足  无范围或范围登记
			String value2 = value.toString().split("[@]")[1];
			for (java.util.Map.Entry<String, Object> entry : condMap.entrySet()) {
				Object value3 = entry.getValue();
				if(value3.toString().indexOf("@") != -1) {
					//有范围
					if (!testDomainField(value, entry.getKey(), value3)) {
						return false;
					}
				}
				else {
					if (!testDomainField(value2, entry.getKey(), value3)) {
						return false;
					}
				}
			}
			return true;
		}
		
		for (java.util.Map.Entry<String, Object> entry : condMap.entrySet()) {
			Object value3 = entry.getValue();
			if(value3.toString().indexOf("@") != -1) {
				String value2 = value3.toString().split("[@]")[1];
				//有范围
				if (!testDomainField(value, entry.getKey(), value2)) {
					return false;
				}
			}
			else {
				if (!testDomainField(value, entry.getKey(), value3)) {
					return false;
				}
			}
		}
		return true;
	}
	

	protected boolean testDomainField(Object value, String strCondition, Object condValue) throws Exception {
		if (Conditions.EQ.equals(strCondition) || Conditions.ABSEQ.equals(strCondition)) {
			if (value instanceof String) {
				return ((String) value).equalsIgnoreCase(condValue.toString());
			}
			int nDataType = DataTypeUtils.getObjectDataType(value);
			return DataTypeUtils.compare(nDataType, value, condValue) == 0;
		}

		if (Conditions.GT.equals(strCondition)) {
			int nDataType = DataTypeUtils.getObjectDataType(value);
			return DataTypeUtils.compare(nDataType, value, condValue) > 0;
		}

		if (Conditions.GTANDEQ.equals(strCondition)) {
			int nDataType = DataTypeUtils.getObjectDataType(value);
			return DataTypeUtils.compare(nDataType, value, condValue) >= 0;
		}

		if (Conditions.LT.equals(strCondition)) {
			int nDataType = DataTypeUtils.getObjectDataType(value);
			return DataTypeUtils.compare(nDataType, value, condValue) < 0;
		}

		if (Conditions.LTANDEQ.equals(strCondition)) {
			int nDataType = DataTypeUtils.getObjectDataType(value);
			return DataTypeUtils.compare(nDataType, value, condValue) <= 0;
		}

		if (Conditions.NOTEQ.equals(strCondition)) {
			if (value instanceof String) {
				return !((String) value).equalsIgnoreCase(condValue.toString());
			}
			int nDataType = DataTypeUtils.getObjectDataType(value);
			return DataTypeUtils.compare(nDataType, value, condValue) != 0;
		}

		if (Conditions.IN.equals(strCondition)) {
			return  Arrays.stream((condValue.toString()).split(",")).filter(cond -> !cond.isEmpty()&&cond.equals((String) value)).count() > 0;
		}

		if (Conditions.NOTIN.equals(strCondition)) {
			return  Arrays.stream((condValue.toString()).split(",")).filter(cond -> !cond.isEmpty()&&cond.equals((String) value)).count() <= 0;
		}

		if (Conditions.ISNULL.equals(strCondition)) {
			return  value == null;
		}

		if (Conditions.ISNOTNULL.equals(strCondition)) {
			return value != null;
		}

		if (Conditions.LIKE.equals(strCondition)) {
			return value.toString().toUpperCase().indexOf(condValue.toString().toUpperCase()) != -1;
		}

		// if (Conditions.LEFTLIKE.equals(strCondition)) {
		// if (objValue != null && objValue instanceof String) {
		// return com.mongodb.client.model.Filters.regex(strFieldName, "^" +
		// (String) objValue, "i");
		// } else {
		// if (objValue != null) {
		// return com.mongodb.client.model.Filters.regex(strFieldName, "^" +
		// objValue.toString(), "i");
		// }
		// }
		// return null;
		// }
		//
		// if (Conditions.RIGHTLIKE.equals(strCondition)) {
		// if (objValue != null && objValue instanceof String) {
		// return com.mongodb.client.model.Filters.regex(strFieldName, (String)
		// objValue + "^", "i");
		// } else {
		// if (objValue != null) {
		// return com.mongodb.client.model.Filters.regex(strFieldName,
		// objValue.toString() + "^", "i");
		// }
		// }
		// return null;
		// }
		log.warn(String.format("无法识别的条件操作[%1$s]", strCondition));
		return false;
	}

	protected Page<M> createPage(List<M> domainList, F f) throws Exception {

		Sort sort = f.getPageSort();
		if (sort != null && !sort.isUnsorted()) {
			Sort.Order order = null;
			java.util.Iterator<Sort.Order> orders = sort.iterator();
			while (orders.hasNext()) {
				order = orders.next();
				break;
			}

			if (order != null) {
				Sort.Order order2 = order;
				Collections.sort(domainList, new Comparator<M>() {
					@Override
					public int compare(M o1, M o2) {
						Object objValue = o1.get(order2.getProperty().toLowerCase());
						Object objValueCompare = o2.get(order2.getProperty().toLowerCase());
						if (order2.isDescending()) {
							Object temp = objValueCompare;
							objValueCompare = objValue;
							objValue = temp;
						}

						if (objValue == null || objValueCompare == null) {
							if (objValue == null && objValueCompare == null)
								return 0;
							if (objValue == null)
								return 1;
							else
								return -1;
						}

						int nDataType = DataTypeUtils.getObjectDataType(objValue);
						return (int) DataTypeUtils.compare(nDataType, objValue, objValueCompare);
					}
				});
			}
		}

		if (f.getPageable() != null && !f.getPageable().isUnpaged()) {
			if (f.getPageable().getPageNumber() == 0 && f.getPageable().getPageSize() >= domainList.size()) {
				return new PageImpl<M>(domainList, f.getPageable(), domainList.size());
			} else {
				List<M> domainList2 = new ArrayList<>();
				int nStartPos = f.getPageable().getPageSize() * f.getPageable().getPageNumber();
				int nEndPos = f.getPageable().getPageSize() * (f.getPageable().getPageNumber() + 1);
				if (nStartPos >= domainList.size()) {
					return new PageImpl<M>(domainList2, f.getPageable(), domainList.size());
				}
				if (nEndPos > domainList.size()) {
					nEndPos = domainList.size();
				}
				for (int i = nStartPos; i < nEndPos; i++) {
					domainList2.add(domainList.get(i));
				}
				return new PageImpl<M>(domainList2, f.getPageable(), domainList.size());
			}

		} else {
			return new PageImpl<M>(domainList);
		}

	}

	@Override
	public void fillDomain(M domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
		this.doFillDomain(domain, iPSModelObject, bFullMode);
	}

	protected void doFillDomain(M domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
		domain.set("dynamodelflag", 0);
	}

	protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
		throw new Exception("没有实现");
	}

	protected List<? extends IPSModelObject> getPSModelObjectList(F f) throws Exception {
		throw new Exception("没有实现");
	}

	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
		throw new Exception("没有实现");
	}
	
	@Override
	public <T> T getPSModelObject(String key, Class<T> cls, boolean tryMode) throws Exception {
		IPSModelObject iPSModelObject = getPSModelObject(key, tryMode);
		if(iPSModelObject != null) {
			return (T)iPSModelObject;
		}
		return null;
	}

	protected <T extends IPSModelObject> T getPSModelObject(Class<T> cls, List<T> list, String strTag, boolean bTryMode) throws Exception {
		if(cls.equals(IPSDataEntity.class)) {
			if(strTag.indexOf("@") != -1) {
				strTag = strTag.split("[@]")[1];
			}
		}
		if (list != null) {
			for (T item : list) {
				String strFullTag = this.getPSModelRTServiceSession().getPSModelUniqueTag(item);
				if (StringUtils.hasLength(strFullTag) && strFullTag.equalsIgnoreCase(strTag)) {
					return item;
				}
			}
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定模型对象[%1$s]", strTag));
	}

	public static String getParentId(String strId) {
		String[] items = strId.split("[.]");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < items.length - 1; i++) {
			if (i != 0) {
				sb.append(".");
			}
			sb.append(items[i]);
		}
		return sb.toString();
	}

	public static String getParentId(IPSModelFilter iPSModelFilter, String strParentName) {

		// srfparentdename=PSWorkflow&srfparentkey=lawcase.lawcaseassistw
		if (StringUtils.hasLength(strParentName)) {
			Object strPName = iPSModelFilter.get("srfparentdename");
			if (ObjectUtils.isEmpty(strPName)) {
				return null;
			}
			if (!strParentName.equalsIgnoreCase(strPName.toString())) {
				return null;
			}
		}
		Object strPKey = iPSModelFilter.get("srfparentkey");
		if (strPKey != null) {
			return strPKey.toString();
		}
		return null;
	}
	
	protected <T extends IPSControl> void fillPSControlList(Class<T> cls, List<T> list) throws Exception{
		IPSApplication currentPSApplication = this.getPSModelRTServiceSession().getPSApplication();
		if(currentPSApplication != null) {
			List<IPSAppView> psAppViews = currentPSApplication.getAllPSAppViews();
			if(!ObjectUtils.isEmpty(psAppViews)) {
				for(IPSAppView iPSAppView : psAppViews) {
					fillPSControlList(cls, iPSAppView, list);
				}
			}
		}
		else {
			List<IPSApplication> psApplications = this.getPSSystemService().getPSSystem().getAllPSApps();
	    	if(!ObjectUtils.isEmpty(psApplications)) {
	    		for(IPSApplication iPSApplication : psApplications) {
	    			List<IPSAppView> psAppViews = iPSApplication.getAllPSAppViews();
	    			if(!ObjectUtils.isEmpty(psAppViews)) {
	    				for(IPSAppView iPSAppView : psAppViews) {
	    					fillPSControlList(cls, iPSAppView, list);
	    				}
	    			}
	    		}
	    	}
		}
		
	}
	
	public static void fillPSDEFormDRUIParts(IPSDEForm iPSDEForm, List<IPSDEFormDRUIPart> psDEFormDRUIPartList) throws Exception {
    	if(!ObjectUtils.isEmpty(iPSDEForm.getPSDEFormPages())) {
    		for(IPSDEFormPage iPSDEFormPage : iPSDEForm.getPSDEFormPages()) {
    			fillPSDEFormDRUIParts(iPSDEFormPage, psDEFormDRUIPartList);
    		}
    	}
    }
    
	public static void fillPSDEFormDRUIParts(IPSDEFormDetail iPSDEFormDetail, List<IPSDEFormDRUIPart> psDEFormDRUIPartList) throws Exception {
    	
    	if(iPSDEFormDetail instanceof IPSDEFormDRUIPart) {
    		psDEFormDRUIPartList.add((IPSDEFormDRUIPart)iPSDEFormDetail);
    		return;
    	}
    	
    	if(iPSDEFormDetail instanceof IPSDEFormTabPanel) {
			IPSDEFormTabPanel iPSDEFormTabPanel = (IPSDEFormTabPanel)iPSDEFormDetail;
			if(iPSDEFormTabPanel.getPSDEFormTabPages()!=null) {
				for(IPSDEFormTabPage item : iPSDEFormTabPanel.getPSDEFormTabPages()) {
					fillPSDEFormDRUIParts(item, psDEFormDRUIPartList);
				}
			}
			return;
		}
		if(iPSDEFormDetail instanceof IPSDEFormGroupBase) {
			IPSDEFormGroupBase iPSDEFormGroupBase = (IPSDEFormGroupBase)iPSDEFormDetail;
			if(iPSDEFormGroupBase.getPSDEFormDetails()!=null) {
				for(IPSDEFormDetail item : iPSDEFormGroupBase.getPSDEFormDetails()) {
					fillPSDEFormDRUIParts(item, psDEFormDRUIPartList);
				}
			}
			return;
		}
    }
	
	
	
	public static <T extends IPSControl> void fillPSControlList(Class<T> cls, IPSAppView iPSAppView, List<T> list) {
		if(iPSAppView.getPSViewLayoutPanel() != null) {
			fillPSControlList(cls, (IPSControl)iPSAppView.getPSViewLayoutPanel(), list);
		}
		fillPSControlList(cls, (IPSControlContainer)iPSAppView, list);
	}
    
	
	public static <T extends IPSControl> void fillPSControlList(Class<T> cls, IPSControlContainer iPSControlContainer, List<T> list) {
		List<IPSControl> psControls = iPSControlContainer.getPSControls();
		if(psControls == null) {
			return;
		}
		
		for(IPSControl item : psControls) {
			fillPSControlList(cls, item, list);
		}
	}
	
	public static <T extends IPSControl> void fillPSControlList(Class<T> cls, IPSControl iPSControl, List<T> list) {
		
		if(cls.isAssignableFrom(iPSControl.getClass())) {
			list.add((T)iPSControl);
		}
		
		if(iPSControl instanceof IPSDEForm) {
			fillPSControlList(cls, (IPSDEForm)iPSControl, list);
		}
		
		if(iPSControl instanceof IPSControlContainer) {
			fillPSControlList(cls, (IPSControlContainer)iPSControl, list);
		}
	}
	
	public static <T extends IPSControl> void fillPSControlList(Class<T> cls, IPSDEForm iPSDEForm, List<T> list) {
    	if(!ObjectUtils.isEmpty(iPSDEForm.getPSDEFormPages())) {
    		for(IPSDEFormPage iPSDEFormPage : iPSDEForm.getPSDEFormPages()) {
    			fillPSControlList(cls, iPSDEFormPage, list);
    		}
    	}
    }
    
	public static <T extends IPSControl> void fillPSControlList(Class<T> cls,  IPSDEFormDetail iPSDEFormDetail, List<T> list) {
    	
    	if(iPSDEFormDetail instanceof IPSDEFormMDCtrl) {
    		IPSDEFormMDCtrl iPSDEFormMDCtrl = (IPSDEFormMDCtrl)iPSDEFormDetail;
    		if(iPSDEFormMDCtrl.getContentPSControl() != null) {
    			fillPSControlList(cls, iPSDEFormMDCtrl.getContentPSControl(), list);
    		}
    		
    		return;
    	}
    	
    	if(iPSDEFormDetail instanceof IPSDEFormTabPanel) {
			IPSDEFormTabPanel iPSDEFormTabPanel = (IPSDEFormTabPanel)iPSDEFormDetail;
			if(iPSDEFormTabPanel.getPSDEFormTabPages()!=null) {
				for(IPSDEFormTabPage item : iPSDEFormTabPanel.getPSDEFormTabPages()) {
					fillPSControlList(cls, item, list);
				}
			}
			return;
		}
		if(iPSDEFormDetail instanceof IPSDEFormGroupBase) {
			IPSDEFormGroupBase iPSDEFormGroupBase = (IPSDEFormGroupBase)iPSDEFormDetail;
			if(iPSDEFormGroupBase.getPSDEFormDetails()!=null) {
				for(IPSDEFormDetail item : iPSDEFormGroupBase.getPSDEFormDetails()) {
					fillPSControlList(cls, item, list);
				}
			}
			return;
		}
    }
	
	
	public static String getPSNavigateParams(IPSNavigateParamContainer iPSNavigateParamContainer) throws Exception {
		StringBuilder sb = new StringBuilder();
		boolean bFirst = true;
		if(!ObjectUtils.isEmpty(iPSNavigateParamContainer.getPSNavigateParams())) {
			for(IPSNavigateParam iPSNavigateParam : iPSNavigateParamContainer.getPSNavigateParams()) {
				if(bFirst) {
					bFirst = false;
				}
				else {
					sb.append("\r\n");
				}
				if(iPSNavigateParam.isRawValue()) {
					sb.append(String.format("%1$s%2$s=%3$s", VIEWPARAM_NAVPARAM, iPSNavigateParam.getKey(), iPSNavigateParam.getValue()));
				}
				else {
					sb.append(String.format("%1$s%2$s=%%%3$s%%", VIEWPARAM_NAVPARAM, iPSNavigateParam.getKey(), iPSNavigateParam.getValue()));
				}
			}
		}
		
		if(!ObjectUtils.isEmpty(iPSNavigateParamContainer.getPSNavigateContexts())) {
			for(IPSNavigateContext iPSNavigateContext : iPSNavigateParamContainer.getPSNavigateContexts()) {
				if(bFirst) {
					bFirst = false;
				}
				else {
					sb.append("\r\n");
				}
				if(iPSNavigateContext.isRawValue()) {
					sb.append(String.format("%1$s%2$s=%3$s", VIEWPARAM_NAVCONTEXT, iPSNavigateContext.getKey(), iPSNavigateContext.getValue()));
				}
				else {
					sb.append(String.format("%1$s%2$s=%%%3$s%%", VIEWPARAM_NAVCONTEXT, iPSNavigateContext.getKey(), iPSNavigateContext.getValue()));
				}
			}
		}
		if(bFirst) {
			return null;
		}
		return sb.toString();
	}
}
