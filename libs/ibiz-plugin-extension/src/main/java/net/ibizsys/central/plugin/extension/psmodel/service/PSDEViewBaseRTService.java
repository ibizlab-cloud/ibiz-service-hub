package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.*;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.psmodel.core.filter.PSDEViewBaseFilter;


public class PSDEViewBaseRTService extends net.ibizsys.psmodel.runtime.service.PSDEViewBaseRTService {
	private static final Log log = LogFactory.getLog(PSDEViewBaseRTService.class);

	@Override
	protected List<IPSAppView> getPSModelObjectList(PSDEViewBaseFilter f) throws Exception {
		Object objPSDEId = f.getFieldCond("psdeid", "EQ");
		if (ObjectUtils.isEmpty(objPSDEId)) {
			objPSDEId = getParentId(f, "PSDATAENTITY");
		}

		String strPSDEId = null;
		if (objPSDEId != null) {
			strPSDEId = (String)objPSDEId;
		}
		List<IPSAppView> psDEViewBaseList = super.getPSModelObjectList(f);
		Map<String, IPSAppView> appViewMap = new HashMap<>();
		for (IPSAppView appView : psDEViewBaseList) {
			IPSAppDEView appDEView = (IPSAppDEView)appView;
			String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)appDEView.getPSAppDataEntity().getPSDataEntity(), true), appDEView.getPSDEViewCodeName()).toLowerCase();
			appViewMap.put(strTag, appDEView);
		}
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (iExtensionPSModelRTServiceSession.getSystemRuntime() instanceof IServiceSystemRuntime) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iExtensionPSModelRTServiceSession.getSystemRuntime();
			Collection<IExtensionSysRefRuntime> extensionSysRefRuntimeList = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
			if (!ObjectUtils.isEmpty(extensionSysRefRuntimeList)) {
				IPSApplication mainPSApplication = iExtensionPSModelRTServiceSession.getPSApplication();
				if (mainPSApplication != null) {
					for (IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimeList) {
						IPSApplication iPSApplication = iExtensionSysRefRuntime.getPSApplication(mainPSApplication.getCodeName(), true);
						if (iPSApplication != null) {
							List<IPSAppView> subPSAppViews = iPSApplication.getAllPSAppViews();
							if (!ObjectUtils.isEmpty(subPSAppViews)) {
								for (IPSAppView subPSAppView : subPSAppViews) {
									if(!(subPSAppView instanceof IPSAppDEView)) {
										continue;
									}

									if(StringUtils.hasLength(strPSDEId)) {
										if(subPSAppView.getPSAppDataEntity() == null || subPSAppView.getPSAppDataEntity().getPSDataEntity() == null) {
											continue;
										}

										String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(subPSAppView.getPSAppDataEntity().getPSDataEntity());
										if(!strPSDEId.equals(strId)) {
											continue;
										}
									}

									IPSAppDEView subPSAppDEView = (IPSAppDEView)subPSAppView;
									String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)subPSAppDEView.getPSAppDataEntity().getPSDataEntity(), true), subPSAppDEView.getPSDEViewCodeName()).toLowerCase();
									Integer currentPriority = subPSAppView.getPriority() != -1 ? subPSAppView.getPriority() : 50;
									IPSAppView existing = appViewMap.get(strTag);
									if (existing == null) {
										// 不存在：直接加入
										appViewMap.put(strTag, subPSAppView);
									} else {
										// 存在：比较 priority
										Integer existingPriority = existing.getPriority() != -1 ? existing.getPriority() : 50;
										if (currentPriority >= existingPriority) {
											appViewMap.put(strTag, subPSAppView); // 替换
										}
									}
								}
							}
						}
					}
				} else {
					for (IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimeList) {
						List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
						if (!ObjectUtils.isEmpty(psApplicationList)) {
							for (IPSApplication iPSApplication : psApplicationList) {
								List<IPSAppView> subPSAppViews = iPSApplication.getAllPSAppViews();
								if (!ObjectUtils.isEmpty(subPSAppViews)) {
									for (IPSAppView subPSAppView : subPSAppViews) {
										if(!(subPSAppView instanceof IPSAppDEView)) {
											continue;
										}

										if(StringUtils.hasLength(strPSDEId)) {
											if(subPSAppView.getPSAppDataEntity() == null || subPSAppView.getPSAppDataEntity().getPSDataEntity() == null) {
												continue;
											}

											String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(subPSAppView.getPSAppDataEntity().getPSDataEntity());
											if(!strPSDEId.equals(strId)) {
												continue;
											}
										}

										IPSAppDEView subPSAppDEView = (IPSAppDEView)subPSAppView;
										String strTag = String.format("%1$s.%2$s", PSModelUtils.calcFullUniqueTag((IPSModelObject)subPSAppDEView.getPSAppDataEntity().getPSDataEntity(), true), subPSAppDEView.getPSDEViewCodeName()).toLowerCase();
										Integer currentPriority = subPSAppView.getPriority() != -1 ? subPSAppView.getPriority() : 50;
										IPSAppView existing = appViewMap.get(strTag);
										if (existing == null) {
											// 不存在：直接加入
											appViewMap.put(strTag, subPSAppView);
										} else {
											// 存在：比较 priority
											Integer existingPriority = existing.getPriority() != -1 ? existing.getPriority() : 50;
											if (currentPriority >= existingPriority) {
												appViewMap.put(strTag, subPSAppView); // 替换
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
		psDEViewBaseList.clear();
		psDEViewBaseList.addAll(appViewMap.values());
        return psDEViewBaseList;
    }
}
