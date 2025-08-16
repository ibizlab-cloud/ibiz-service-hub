package net.ibizsys.central.plugin.extension.psmodel.util;

import net.ibizsys.psmodel.core.util.PSModels;

public class PSModelRTServiceFactory extends net.ibizsys.psmodel.runtime.util.PSModelRTServiceFactory {

	public PSModelRTServiceFactory() {
		super();
		registerPSModelRTServices(this);
	}
	
	private static void registerPSModelRTServices(PSModelRTServiceFactory instance) {
		instance.registerPSModelService(PSModels.PSWORKFLOW, net.ibizsys.central.plugin.extension.psmodel.service.PSWorkflowRTService.class);
        instance.registerPSModelService("PSWORKFLOWS", net.ibizsys.central.plugin.extension.psmodel.service.PSWorkflowRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFVERSION, net.ibizsys.central.plugin.extension.psmodel.service.PSWFVersionRTService.class);
        instance.registerPSModelService("PSWFVERSIONS", net.ibizsys.central.plugin.extension.psmodel.service.PSWFVersionRTService.class);
        

        instance.registerPSModelService("PSCOREPRDCAT", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdCatRTService.class);
        instance.registerPSModelService("PSCOREPRDCATS", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdCatRTService.class);
        
        instance.registerPSModelService("PSCOREPRD", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdRTService.class);
        instance.registerPSModelService("PSCOREPRDS", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdRTService.class);
        
        instance.registerPSModelService("PSCOREPRDFUNC", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdFuncRTService.class);
        instance.registerPSModelService("PSCOREPRDFUNCS", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdFuncRTService.class);
        
        instance.registerPSModelService("PSCOREPRDVER", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdVerRTService.class);
        instance.registerPSModelService("PSCOREPRDVERS", net.ibizsys.central.plugin.extension.psmodel.service.PSCorePrdVerRTService.class);
        
        
        instance.registerPSModelService(PSModels.PSWFDE, net.ibizsys.central.plugin.extension.psmodel.service.PSWFDERTService.class);
        instance.registerPSModelService("PSWFDES", net.ibizsys.central.plugin.extension.psmodel.service.PSWFDERTService.class);
        
        instance.registerPSModelService(PSModels.PSDATAENTITY, net.ibizsys.central.plugin.extension.psmodel.service.PSDataEntityRTService.class);
        instance.registerPSModelService("PSDATAENTITIES", net.ibizsys.central.plugin.extension.psmodel.service.PSDataEntityRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFIELD, net.ibizsys.central.plugin.extension.psmodel.service.PSDEFieldRTService.class);
        instance.registerPSModelService("PSDEFIELDS", net.ibizsys.central.plugin.extension.psmodel.service.PSDEFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFORM, net.ibizsys.central.plugin.extension.psmodel.service.PSDEFormRTService.class);
        instance.registerPSModelService("PSDEFORMS", net.ibizsys.central.plugin.extension.psmodel.service.PSDEFormRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELOGIC, net.ibizsys.central.plugin.extension.psmodel.service.PSDELogicRTService.class);
        instance.registerPSModelService("PSDELOGICS", net.ibizsys.central.plugin.extension.psmodel.service.PSDELogicRTService.class);
        
        instance.registerPSModelService("PSDEMSLOGIC", net.ibizsys.central.plugin.extension.psmodel.service.PSDEMSLogicRTService.class);
        instance.registerPSModelService("PSDEMSLOGICS", net.ibizsys.central.plugin.extension.psmodel.service.PSDEMSLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDENOTIFY, net.ibizsys.central.plugin.extension.psmodel.service.PSDENotifyRTService.class);
        instance.registerPSModelService("PSDENOTIFIES", net.ibizsys.central.plugin.extension.psmodel.service.PSDENotifyRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBICUBEDIMENSION, net.ibizsys.central.plugin.extension.psmodel.service.PSSysBICubeDimensionRTService.class);
        instance.registerPSModelService("PSSYSBICUBEDIMENSIONS", net.ibizsys.central.plugin.extension.psmodel.service.PSSysBICubeDimensionRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBICUBEMEASURE, net.ibizsys.central.plugin.extension.psmodel.service.PSSysBICubeMeasureRTService.class);
        instance.registerPSModelService("PSSYSBICUBEMEASURES", net.ibizsys.central.plugin.extension.psmodel.service.PSSysBICubeMeasureRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBIREPORT, net.ibizsys.central.plugin.extension.psmodel.service.PSSysBIReportRTService.class);
        instance.registerPSModelService("PSSYSBIREPORTS", net.ibizsys.central.plugin.extension.psmodel.service.PSSysBIReportRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPORTLET, net.ibizsys.central.plugin.extension.psmodel.service.PSAppPortletRTService.class);
        instance.registerPSModelService("PSAPPPORTLETS", net.ibizsys.central.plugin.extension.psmodel.service.PSAppPortletRTService.class);
	}
}
