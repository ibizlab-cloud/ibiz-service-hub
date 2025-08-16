package net.ibizsys.model.util;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelException;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSSystemImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.func.IPSAppFunc;
import net.ibizsys.model.app.view.IPSAppIndexView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.menu.IPSAppMenu;
import net.ibizsys.model.control.menu.IPSAppMenuItem;
import net.ibizsys.model.dataentity.IPSDEGroup;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionGroup;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERGroup;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelListMergerBase;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

/**
 * 模型合并工具类
 * 
 * @author lionlau
 *
 */
public class PSModelMergeUtils {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
			.getLog(PSModelMergeUtils.class);

	protected static Set<String> IgnoreCheckMethodMap = new HashSet<String>();
	private static ThreadLocal<Set<String>> IgnoreCheckMethodSetLcoal = new ThreadLocal<Set<String>>();
	static {
		IgnoreCheckMethodMap.add("getKeyPSDEServiceAPIField");
		//系统模型默认不检查前端
		IgnoreCheckMethodMap.add("getAllPSApps");
		//忽略getPSDEWizardStep检查，从表单中输出的向导表单模型有误
		IgnoreCheckMethodMap.add("getPSDEWizardStep");
	}
	
	public static void setCurrentIgnoreCheckMethods(Set<String> set) {
		IgnoreCheckMethodSetLcoal.set(set);
	}
	
	public static Set<String> getCurrentIgnoreCheckMethods() {
		return IgnoreCheckMethodSetLcoal.get();
	}
	
	protected static boolean isIgnoreCheckMethod(String strMethodName) {
		Set<String> current = getCurrentIgnoreCheckMethods();
		if(current != null) {
			if(current.contains(strMethodName)) {
				return true;
			}
		}
		return IgnoreCheckMethodMap.contains(strMethodName);
	}

	public static void merge(IPSModelMergeContext iPSModelMergeContext) throws Exception {

		IPSModelMerger iPSModelMerger = PSModelMergerFactory.getInstance().getPSModelMerger(PSSystemImpl.class, false);
		ObjectNode objectNode = (ObjectNode) PSModelListMergerBase.MAPPER
				.readTree(new File(iPSModelMergeContext.getPSModelFolderPath() + File.separator + "PSSYSTEM.json"));
		ObjectNode mergeObjectNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(
				new File(iPSModelMergeContext.getMergePSModelFolderPath() + File.separator + "PSSYSTEM.json"));
		iPSModelMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode);

		File modelFile = new File(iPSModelMergeContext.getDstPSModelFolderPath() + File.separator + "PSSYSTEM.json");
		modelFile.getParentFile().mkdirs();
		try (FileOutputStream os = new FileOutputStream(modelFile)) {
			PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, objectNode);
			os.flush();
		}

		// 进一步展开模型
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(iPSModelMergeContext.getDstPSModelFolderPath(), false);
		IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();

		java.util.List<IPSDataEntity> psDataEntityList = iPSSystem.getAllPSDataEntities();
		if (!ObjectUtils.isEmpty(psDataEntityList)) {
			for (IPSDataEntity iPSDataEntity : psDataEntityList) {
				pubPSDataEntityModel(iPSDataEntity, iPSModelMergeContext.getDstPSModelFolderPath());
			}
		}

		// 重建缓存
		if (iPSModelMergeContext.isEnableMergeChild(IPSApplication.class)) {
			java.util.List<IPSApplication> psApplications = iPSSystem.getAllPSApps();
			if (!ObjectUtils.isEmpty(psApplications)) {
				for (IPSApplication iPSApplication : psApplications) {
					if (buildPSApplicationCache(iPSApplication)) {
						modelFile = new File(iPSModelMergeContext.getDstPSModelFolderPath() + File.separator
								+ iPSApplication.getDynaModelFilePath());
						modelFile.getParentFile().mkdirs();
						try (FileOutputStream os = new FileOutputStream(modelFile)) {
							PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os,
									iPSApplication.getObjectNode());
							os.flush();
						}
					}
				}
			}
		}
	}

	protected static boolean buildPSApplicationCache(IPSApplication iPSApplication) throws Exception {

		if (iPSApplication.getObjectNode().has("cache")) {
			return false;
		}

		// 输出快速缓存
		Map<String, IPSAppView> cachePSAppViewMap = new LinkedHashMap<String, IPSAppView>();
		Map<String, IPSAppDataEntity> cachePSDataEntityMap = new LinkedHashMap<String, IPSAppDataEntity>();

		// if(this.getDefaultPSAppView()!=null) {
		// cachePSAppViewMap.put(this.getDefaultPSAppView().getId(),this.getDefaultPSAppView());
		// }
		IPSAppIndexView iPSAppIndexView = iPSApplication.getDefaultPSAppIndexView();

		if (iPSApplication.getDefaultPSAppIndexView() != null) {
			iPSAppIndexView = iPSApplication.getDefaultPSAppIndexView();
		} else {
			java.util.List<IPSAppView> psAppViews = iPSApplication.getAllPSAppViews();
			if (!ObjectUtils.isEmpty(psAppViews)) {
				for (IPSAppView iPSAppView : psAppViews) {
					if (iPSAppView instanceof IPSAppIndexView) {
						iPSAppIndexView = (IPSAppIndexView) iPSAppView;
						break;
					}
				}
			}
		}

		if (iPSAppIndexView != null) {
			cachePSAppViewMap.put(iPSAppIndexView.getId(), iPSAppIndexView);

			IPSAppMenu defaultPSAppMenu = null;
			List<IPSControl> psControls = iPSAppIndexView.getPSControls();
			if (!ObjectUtils.isEmpty(psControls)) {
				for (IPSControl iPSControl : psControls) {
					if (iPSControl instanceof IPSAppMenu) {
						defaultPSAppMenu = (IPSAppMenu) iPSControl;
						break;
					}
				}
			}

			if (defaultPSAppMenu != null) {
				java.util.List<IPSAppMenuItem> psAppMenuItems = defaultPSAppMenu.getPSAppMenuItems();
				if (!ObjectUtils.isEmpty(psAppMenuItems)) {
					for (IPSAppMenuItem iPSAppMenuItem : psAppMenuItems) {
						IPSAppFunc iPSAppFunc = iPSAppMenuItem.getPSAppFunc();
						if (iPSAppFunc == null || iPSAppFunc.getPSAppView() == null) {
							continue;
						}
						cachePSAppViewMap.put(iPSAppFunc.getPSAppView().getId(), iPSAppFunc.getPSAppView());
					}
				}
			}
		}

		for (IPSAppView iPSAppView : cachePSAppViewMap.values()) {
			IPSAppDataEntity iPSAppDataEntity = iPSAppView.getPSAppDataEntity();
			if (iPSAppDataEntity != null) {
				cachePSDataEntityMap.put(iPSAppDataEntity.getId(), iPSAppDataEntity);
			}
		}

		ObjectNode cacheNode = iPSApplication.getObjectNode().putObject("cache");
		if (cachePSAppViewMap != null) {
			ArrayNode arrayNode = cacheNode.putArray("getPSAppViews");
			for (IPSAppView iPSAppView : cachePSAppViewMap.values()) {
				arrayNode.add(iPSAppView.getObjectNode());
			}
		}
		if (cachePSDataEntityMap != null) {
			ArrayNode arrayNode = cacheNode.putArray("getPSAppDataEntities");
			for (IPSAppDataEntity iPSAppDataEntity : cachePSDataEntityMap.values()) {
				arrayNode.add(iPSAppDataEntity.getObjectNode());
			}
		}

		return true;
	}

	protected static void pubPSDataEntityModel(IPSDataEntity iPSDataEntity, String strDstPModelFolderPath)
			throws Exception {

		java.util.List<IPSDEAction> psDEActions = iPSDataEntity.getAllPSDEActions();
		if (psDEActions != null) {
			for (IPSDEAction iPSDEAction : psDEActions) {
				pubPSModelObjectModel(iPSDEAction, strDstPModelFolderPath);
			}
		}

		java.util.List<IPSDELogic> psDELogics = iPSDataEntity.getAllPSDELogics();
		if (psDELogics != null) {
			for (IPSDELogic iPSDELogic : psDELogics) {
				pubPSModelObjectModel(iPSDELogic, strDstPModelFolderPath);
			}
		}

		java.util.List<IPSDEDataSync> psDEDataSyncs = iPSDataEntity.getAllPSDEDataSyncs();
		if (psDEDataSyncs != null) {
			for (IPSDEDataSync iPSDEDataSync : psDEDataSyncs) {
				pubPSModelObjectModel(iPSDEDataSync, strDstPModelFolderPath);
			}
		}

		java.util.List<IPSDERBase> majorPSDERs = iPSDataEntity.getMajorPSDERs();
		if (majorPSDERs != null) {
			for (IPSDERBase iPSDERBase : majorPSDERs) {
				pubPSModelObjectModel(iPSDERBase, strDstPModelFolderPath);
			}
		}

		java.util.List<IPSDERBase> minorPSDERs = iPSDataEntity.getMinorPSDERs();
		if (minorPSDERs != null) {
			for (IPSDERBase iPSDERBase : minorPSDERs) {
				pubPSModelObjectModel(iPSDERBase, strDstPModelFolderPath);
			}
		}

		java.util.List<IPSDEPrint> psDEPrints = iPSDataEntity.getAllPSDEPrints();
		if (psDEPrints != null) {
			for (IPSDEPrint iPSDEPrint : psDEPrints) {
				pubPSModelObjectModel(iPSDEPrint, strDstPModelFolderPath);
			}
		}

		java.util.List<IPSDEReport> psDEReports = iPSDataEntity.getAllPSDEReports();
		if (psDEReports != null) {
			for (IPSDEReport iPSDEReport : psDEReports) {
				pubPSModelObjectModel(iPSDEReport, strDstPModelFolderPath);
			}
		}

		if (true) {
			java.util.List<IPSDEUserRole> psDEUserRoles = iPSDataEntity.getAllPSDEUserRoles();
			if (psDEUserRoles != null) {
				for (IPSDEUserRole iPSDEUserRole : psDEUserRoles) {
					pubPSModelObjectModel(iPSDEUserRole, strDstPModelFolderPath);
				}
			}

			java.util.List<IPSDEDataQuery> psDEDataQueries = iPSDataEntity.getAllPSDEDataQueries();
			if (psDEDataQueries != null) {
				// for(IPSDEDataQuery iPSDEDataQuery : psDEDataQueries){
				// java.util.List<IPSDEDataQueryCode> psDEDataQueryCodes =
				// iPSDEDataQuery.getAllPSDEDataQueryCodes();
				// if (psDEDataQueryCodes != null) {
				// for(IPSDEDataQueryCode iPSDEDataQueryCode :
				// psDEDataQueryCodes){
				// pubPSModelObjectModel(iPSDEDataQueryCode,
				// strDstPModelFolderPath);
				// }
				// }
				// }
			}
		}

		if (true) {
			java.util.List<IPSDEFGroup> psDEFGroups = iPSDataEntity.getAllPSDEFGroups();
			if (psDEFGroups != null) {
				for (IPSDEFGroup iPSDEFGroup : psDEFGroups) {
					pubPSModelObjectModel(iPSDEFGroup, strDstPModelFolderPath);
				}
			}

			java.util.List<IPSDEGroup> psDEGroups = iPSDataEntity.getAllPSDEGroups();
			if (psDEGroups != null) {
				for (IPSDEGroup iPSDEGroup : psDEGroups) {
					pubPSModelObjectModel(iPSDEGroup, strDstPModelFolderPath);
				}
			}

			java.util.List<IPSDERGroup> psDERGroups = iPSDataEntity.getAllPSDERGroups();
			if (psDERGroups != null) {
				for (IPSDERGroup iPSDERGroup : psDERGroups) {
					pubPSModelObjectModel(iPSDERGroup, strDstPModelFolderPath);
				}
			}

			java.util.List<IPSDEActionGroup> psDEActionGroups = iPSDataEntity.getAllPSDEActionGroups();
			if (psDEActionGroups != null) {
				for (IPSDEActionGroup iPSDEActionGroup : psDEActionGroups) {
					pubPSModelObjectModel(iPSDEActionGroup, strDstPModelFolderPath);
				}
			}
		}

	}

	protected static void pubPSModelObjectModel(IPSModelObject iPSModelObject, String strDstPModelFolderPath)
			throws Exception {
		String strDynaModelFilePath = iPSModelObject.getDynaModelFilePath();
		if (!StringUtils.hasLength(strDynaModelFilePath)) {
			return;
		}

		File modelFile = new File(strDstPModelFolderPath + File.separator + strDynaModelFilePath);
		modelFile.getParentFile().mkdirs();
		try (FileOutputStream os = new FileOutputStream(modelFile)) {
			PSModelListMergerBase.MAPPER.writerWithDefaultPrettyPrinter().writeValue(os, iPSModelObject.getObjectNode());
			os.flush();
		}
	}

	public static void verify(String strPSModelFolderPath) throws Exception {

		long nStart = System.currentTimeMillis();

		// 进一步展开模型
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strPSModelFolderPath, false);
		IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();

		Map<Object, String> map = new HashMap<Object, String>();
		verify(iPSSystem, map);

		System.out.print(String.format("校验耗时[%1$s]ms，对象数[%2$s]", System.currentTimeMillis() - nStart, map.size()));
	}

	public static void verify(IPSModelObject iPSModelObject) throws Exception {
		verify(iPSModelObject, false);
	}

	public static void verify(IPSModelObject iPSModelObject, boolean bQuick) throws Exception {
		Map<Object, String> map = new HashMap<Object, String>();
		verify(iPSModelObject, map, bQuick);
	}

	private static void verify(Object iPSModelObject, Map<Object, String> map) throws Exception {
		verify(iPSModelObject, map, false);
	}

	private static void verify(Object iPSModelObject, Map<Object, String> map, boolean bQuick) throws Exception {
		if (map.containsKey(iPSModelObject)) {
			return;
		}

		if (bQuick && iPSModelObject instanceof IPSModelObject) {
			if (map.size() != 0) {
				String strDynaModelFilePath = ((IPSModelObject) iPSModelObject).getDynaModelFilePath();
				if (StringUtils.hasLength(strDynaModelFilePath)) {
					map.put(iPSModelObject, "");
					return;
				}
			}
		}
		map.put(iPSModelObject, "");

		// if(iPSModelObject instanceof IPSApplication) {
		// ((IPSApplication)iPSModelObject).getAllPSAppCodeLists();
		// }

		Method[] methods = iPSModelObject.getClass().getMethods();
		if (ObjectUtils.isEmpty(methods)) {
			return;
		}

		for (Method method : methods) {
			if (method.getParameterCount() != 0) {
				continue;
			}

			if (isIgnoreCheckMethod(method.getName())) {
				continue;
			}

			if (method.getName().indexOf("Must") == method.getName().length() - 4) {
				continue;
			}

			if (!IPSModelObject.class.isAssignableFrom(method.getDeclaringClass())) {
				continue;
			}
			try {
				Object ret = method.invoke(iPSModelObject);
				if (ret != null) {

					if (ret instanceof List) {
						List list = (List) ret;
						for (Object item : list) {
							if (item instanceof IPSModelObject) {
								verify(item, map, bQuick);
							}
						}
					} else if (ret instanceof IPSModelObject) {
						verify(ret, map, bQuick);
					}

				}
			} catch (Throwable ex) {
				if(ex instanceof InvocationTargetException) {
					if(iPSModelObject instanceof IPSModelObject) {
						Throwable e = ((InvocationTargetException)ex).getTargetException();
						IPSModelObject real = (IPSModelObject)iPSModelObject;
						throw new PSModelException(real, String.format("模型[%1$s][%2$s]检查发生异常，%3$s", iPSModelObject.getClass().getSimpleName(), PSModelUtils.calcFullUniqueTag2(real, true) , e.getMessage()));
					}
					ex = ((InvocationTargetException)ex).getTargetException();
				}
				
				if(ex instanceof PSModelException) {
					throw (PSModelException)ex;
				}
				
				if(iPSModelObject instanceof IPSModelObject) {
					IPSModelObject real = (IPSModelObject)iPSModelObject;
					throw new PSModelException(real, String.format("模型[%1$s][%2$s]检查发生异常，%3$s", iPSModelObject.getClass().getSimpleName(), PSModelUtils.calcFullUniqueTag2(real, true) , ex.getMessage()));
				}
				
				throw new Exception(String.format("模型[%1$s]检查发生异常，%2$s", iPSModelObject.getClass().getSimpleName(), ex.getMessage()), ex);
				
			}
		}
	}

	public static <T> void forEach(Object iPSModelObject, Class<T> cls, Consumer<T> consumer) throws Throwable {
		Map<Object, String> map = new HashMap<Object, String>();
		forEach(iPSModelObject, cls, consumer, map);
	}

	private static <T> void forEach(Object iPSModelObject, Class<T> cls, Consumer<T> consumer, Map<Object, String> map) 
			throws Throwable {
		if (map.containsKey(iPSModelObject)) {
			return;
		}

		map.put(iPSModelObject, "");
		if (cls.isAssignableFrom(iPSModelObject.getClass())) {
			consumer.accept((T) iPSModelObject);
		}

		Method[] methods = iPSModelObject.getClass().getMethods();
		if (ObjectUtils.isEmpty(methods)) {
			return;
		}

		for (Method method : methods) {

			// System.out.println(String.format("%1$s_%2$s", iPSModelObject,
			// method));

			if (method.getParameterCount() != 0) {
				continue;
			}

			if (isIgnoreCheckMethod(method.getName())) {
				continue;
			}

			if (method.getName().indexOf("Must") == method.getName().length() - 4) {
				continue;
			}

			if (!IPSModelObject.class.isAssignableFrom(method.getDeclaringClass())) {
				continue;
			}

			try {
				Object ret = method.invoke(iPSModelObject);
				if (ret != null) {

					if (ret instanceof List) {
						List list = (List) ret;
						for (Object item : list) {
							if (item instanceof IPSModelObject) {
								forEach(item, cls, consumer, map);
							}
						}
					} else if (ret instanceof IPSModelObject) {
						forEach(ret, cls, consumer, map);
					}

				}
			} catch (Throwable ex) {
				if(ex instanceof InvocationTargetException) {
					throw ((InvocationTargetException)ex).getTargetException();
				}
				throw ex;
			}

		}
	}

	public static void mergeCloudSubApp(String strPSModelFolderPath, String strMergePSModelFolderPath,
			String strAppCodeName) throws Throwable {

		// 进一步展开模型
		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strPSModelFolderPath, false);
		IPSSystem iPSSystem = psModelServiceImpl.getPSSystem();

		IPSApplication iPSApplication = null;
		IPSApplication mergePSApplication = null;
		List<IPSApplication> list = iPSSystem.getAllPSApps();
		if (!ObjectUtils.isEmpty(list)) {
			for (IPSApplication item : list) {
				if (strAppCodeName.equals(item.getCodeName())) {
					iPSApplication = item;
					break;
				}
			}
		}

		if (iPSApplication == null) {
			throw new Exception(String.format("无法获取指定应用[%1$s]", strAppCodeName));
		}

		// 合入子应用模型
		String strModelPath = String.format("%1$s%2$sPSSYSAPPS%2$s%3$s%2$sPSSYSAPP.hubsubapp.json",
				strMergePSModelFolderPath, File.separator, strAppCodeName);
		File hubsubappFile = new File(strModelPath);
		if (hubsubappFile.exists()) {
			ObjectNode objectNode = (ObjectNode) PSModelListMergerBase.MAPPER.readTree(hubsubappFile);
			JsonNode allPSAppDEUIActionGroupsNode = objectNode.get("getAllPSAppDEUIActionGroups");
			if (allPSAppDEUIActionGroupsNode instanceof ArrayNode) {
				ArrayNode arrayNode = (ArrayNode) allPSAppDEUIActionGroupsNode;
				for (int i = 0; i < arrayNode.size(); i++) {
					ObjectNode psAppDEUIActionGroupNode = (ObjectNode) arrayNode.get(i);
					JsonNode uniqueTagNode = psAppDEUIActionGroupNode.get("uniqueTag");
					if (uniqueTagNode == null || !StringUtils.hasLength(uniqueTagNode.asText())) {
						continue;
					}
					String strUniqueId = uniqueTagNode.asText();
					// 查找对于的模型组
					forEach(iPSApplication, IPSAppDEUIActionGroup.class, new Consumer<IPSAppDEUIActionGroup>() {
						@Override
						public void accept(IPSAppDEUIActionGroup t) {
							if (strUniqueId.equals(t.getUniqueTag())) {
								System.out.println(t);
							}

						}
					});
				}
			}
		}

		PSModelServiceImpl mergePSModelServiceImpl = new PSModelServiceImpl();
		mergePSModelServiceImpl.setPSModelFolderPath(strMergePSModelFolderPath, false);
		IPSSystem mergePSSystem = mergePSModelServiceImpl.getPSSystem();

		list = mergePSSystem.getAllPSApps();
		if (!ObjectUtils.isEmpty(list)) {
			for (IPSApplication item : list) {
				if (strAppCodeName.equalsIgnoreCase(item.getCodeName())) {
					mergePSApplication = item;
					break;
				}
			}
		}

		if (mergePSApplication == null) {
			throw new Exception(String.format("无法获取合入应用[%1$s]", strAppCodeName));
		}

		// 开始

	}

}
