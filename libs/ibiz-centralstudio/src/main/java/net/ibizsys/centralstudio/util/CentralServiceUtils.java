package net.ibizsys.centralstudio.util;

import net.ibizsys.centralstudio.service.*;
import net.ibizsys.centralstudio.service.impl.*;

public class CentralServiceUtils extends CentralServiceUtilsBase {

	private static CentralServiceUtils instance = null;

	public static CentralServiceUtils getInstance() {
		if (CentralServiceUtils.instance == null) {
			CentralServiceUtils.instance = new CentralServiceUtils();
		}
		return CentralServiceUtils.instance;
	}

	public static void setInstance(CentralServiceUtils instance) {
		CentralServiceUtils.instance = instance;
	}

	private IPSDevSlnMSDepAppService pSDevSlnMSDepAppService = null;

	public IPSDevSlnMSDepAppService getPSDevSlnMSDepAppService() {
		if (this.pSDevSlnMSDepAppService == null) {
			this.pSDevSlnMSDepAppService = new PSDevSlnMSDepAppServiceImpl();
		}
		return this.pSDevSlnMSDepAppService;
	}

	protected void setPSDevSlnMSDepAppService(IPSDevSlnMSDepAppService pSDevSlnMSDepAppService) {
		this.pSDevSlnMSDepAppService = pSDevSlnMSDepAppService;
	}

	private IPSDevSlnSysAppService pSDevSlnSysAppService = null;

	public IPSDevSlnSysAppService getPSDevSlnSysAppService() {
		if (this.pSDevSlnSysAppService == null) {
			this.pSDevSlnSysAppService = new PSDevSlnSysAppServiceImpl();
		}
		return this.pSDevSlnSysAppService;
	}

	protected void setPSDevSlnSysAppService(IPSDevSlnSysAppService pSDevSlnSysAppService) {
		this.pSDevSlnSysAppService = pSDevSlnSysAppService;
	}

	private IPSDevSlnSysService pSDevSlnSysService = null;

	public IPSDevSlnSysService getPSDevSlnSysService() {
		if (this.pSDevSlnSysService == null) {
			this.pSDevSlnSysService = new PSDevSlnSysServiceImpl();
		}
		return this.pSDevSlnSysService;
	}

	protected void setPSDevSlnSysService(IPSDevSlnSysService pSDevSlnSysService) {
		this.pSDevSlnSysService = pSDevSlnSysService;
	}

	private IPSDCBKTaskService pSDCBKTaskService = null;

	public IPSDCBKTaskService getPSDCBKTaskService() {
		if (this.pSDCBKTaskService == null) {
			this.pSDCBKTaskService = new PSDCBKTaskServiceImpl();
		}
		return this.pSDCBKTaskService;
	}

	protected void setPSDCBKTaskService(IPSDCBKTaskService pSDCBKTaskService) {
		this.pSDCBKTaskService = pSDCBKTaskService;
	}

	private IPSDCMSPlatformNodeService pSDCMSPlatformNodeService = null;

	public IPSDCMSPlatformNodeService getPSDCMSPlatformNodeService() {
		if (this.pSDCMSPlatformNodeService == null) {
			this.pSDCMSPlatformNodeService = new PSDCMSPlatformNodeServiceImpl();
		}
		return this.pSDCMSPlatformNodeService;
	}

	protected void setPSDCMSPlatformNodeService(IPSDCMSPlatformNodeService pSDCMSPlatformNodeService) {
		this.pSDCMSPlatformNodeService = pSDCMSPlatformNodeService;
	}

	// private IPSDCDeployCenterService pSDCDeployCenterService = null;
	//
	// public IPSDCDeployCenterService getPSDCDeployCenterService() {
	// if(this.pSDCDeployCenterService == null) {
	// this.pSDCDeployCenterService = new PSDCDeployCenterServiceImpl();
	// }
	// return this.pSDCDeployCenterService;
	// }
	//
	// protected void setPSDCDeployCenterService(IPSDCDeployCenterService
	// pSDCDeployCenterService) {
	// this.pSDCDeployCenterService = pSDCDeployCenterService;
	// }

	private IPSDevSlnSysBakService pSDevSlnSysBakService = null;

	public IPSDevSlnSysBakService getPSDevSlnSysBakService() {
		if (this.pSDevSlnSysBakService == null) {
			this.pSDevSlnSysBakService = new PSDevSlnSysBakServiceImpl();
		}
		return this.pSDevSlnSysBakService;
	}

	protected void setPSDevSlnSysBakService(IPSDevSlnSysBakService pSDevSlnSysBakService) {
		this.pSDevSlnSysBakService = pSDevSlnSysBakService;
	}

	private IPSDCModelTemplService pSDCModelTemplService = null;

	public IPSDCModelTemplService getPSDCModelTemplService() {
		if (this.pSDCModelTemplService == null) {
			this.pSDCModelTemplService = new PSDCModelTemplServiceImpl();
		}
		return this.pSDCModelTemplService;
	}

	protected void setPSDCModelTemplService(IPSDCModelTemplService pSDCModelTemplService) {
		this.pSDCModelTemplService = pSDCModelTemplService;
	}

	private IPSDCRegistryItemService pSDCRegistryItemService = null;

	public IPSDCRegistryItemService getPSDCRegistryItemService() {
		if (this.pSDCRegistryItemService == null) {
			this.pSDCRegistryItemService = new PSDCRegistryItemServiceImpl();
		}
		return this.pSDCRegistryItemService;
	}

	protected void setPSDCRegistryItemService(IPSDCRegistryItemService pSDCRegistryItemService) {
		this.pSDCRegistryItemService = pSDCRegistryItemService;
	}

	private IPSDevSlnService pSDevSlnService = null;

	public IPSDevSlnService getPSDevSlnService() {
		if (this.pSDevSlnService == null) {
			this.pSDevSlnService = new PSDevSlnServiceImpl();
		}
		return this.pSDevSlnService;
	}

	protected void setPSDevSlnService(IPSDevSlnService pSDevSlnService) {
		this.pSDevSlnService = pSDevSlnService;
	}

	private IPSDevSlnSysRefService pSDevSlnSysRefService = null;

	public IPSDevSlnSysRefService getPSDevSlnSysRefService() {
		if (this.pSDevSlnSysRefService == null) {
			this.pSDevSlnSysRefService = new PSDevSlnSysRefServiceImpl();
		}
		return this.pSDevSlnSysRefService;
	}

	protected void setPSDevSlnSysRefService(IPSDevSlnSysRefService pSDevSlnSysRefService) {
		this.pSDevSlnSysRefService = pSDevSlnSysRefService;
	}

	private IPSDCClusterService pSDCClusterService = null;

	public IPSDCClusterService getPSDCClusterService() {
		if (this.pSDCClusterService == null) {
			this.pSDCClusterService = new PSDCClusterServiceImpl();
		}
		return this.pSDCClusterService;
	}

	protected void setPSDCClusterService(IPSDCClusterService pSDCClusterService) {
		this.pSDCClusterService = pSDCClusterService;
	}

	private IPSDevSlnTemplService pSDevSlnTemplService = null;

	public IPSDevSlnTemplService getPSDevSlnTemplService() {
		if (this.pSDevSlnTemplService == null) {
			this.pSDevSlnTemplService = new PSDevSlnTemplServiceImpl();
		}
		return this.pSDevSlnTemplService;
	}

	protected void setPSDevSlnTemplService(IPSDevSlnTemplService pSDevSlnTemplService) {
		this.pSDevSlnTemplService = pSDevSlnTemplService;
	}

	private IPSDevSlnSysSrvService pSDevSlnSysSrvService = null;

	public IPSDevSlnSysSrvService getPSDevSlnSysSrvService() {
		if (this.pSDevSlnSysSrvService == null) {
			this.pSDevSlnSysSrvService = new PSDevSlnSysSrvServiceImpl();
		}
		return this.pSDevSlnSysSrvService;
	}

	protected void setPSDevSlnSysSrvService(IPSDevSlnSysSrvService pSDevSlnSysSrvService) {
		this.pSDevSlnSysSrvService = pSDevSlnSysSrvService;
	}

	private IPSDevCenterSVNService pSDevCenterSVNService = null;

	public IPSDevCenterSVNService getPSDevCenterSVNService() {
		if (this.pSDevCenterSVNService == null) {
			this.pSDevCenterSVNService = new PSDevCenterSVNServiceImpl();
		}
		return this.pSDevCenterSVNService;
	}

	protected void setPSDevCenterSVNService(IPSDevCenterSVNService pSDevCenterSVNService) {
		this.pSDevCenterSVNService = pSDevCenterSVNService;
	}

	private IPSDevCenterDBInstService pSDevCenterDBInstService = null;

	public IPSDevCenterDBInstService getPSDevCenterDBInstService() {
		if (this.pSDevCenterDBInstService == null) {
			this.pSDevCenterDBInstService = new PSDevCenterDBInstServiceImpl();
		}
		return this.pSDevCenterDBInstService;
	}

	protected void setPSDevCenterDBInstService(IPSDevCenterDBInstService pSDevCenterDBInstService) {
		this.pSDevCenterDBInstService = pSDevCenterDBInstService;
	}

	private IPSDevUserService pSDevUserService = null;

	public IPSDevUserService getPSDevUserService() {
		if (this.pSDevUserService == null) {
			this.pSDevUserService = new PSDevUserServiceImpl();
		}
		return this.pSDevUserService;
	}

	protected void setPSDevUserService(IPSDevUserService pSDevUserService) {
		this.pSDevUserService = pSDevUserService;
	}

	private IPSDevSlnMSDepAPIService pSDevSlnMSDepAPIService = null;

	public IPSDevSlnMSDepAPIService getPSDevSlnMSDepAPIService() {
		if (this.pSDevSlnMSDepAPIService == null) {
			this.pSDevSlnMSDepAPIService = new PSDevSlnMSDepAPIServiceImpl();
		}
		return this.pSDevSlnMSDepAPIService;
	}

	protected void setPSDevSlnMSDepAPIService(IPSDevSlnMSDepAPIService pSDevSlnMSDepAPIService) {
		this.pSDevSlnMSDepAPIService = pSDevSlnMSDepAPIService;
	}

	private IPSDevSlnUserService pSDevSlnUserService = null;

	public IPSDevSlnUserService getPSDevSlnUserService() {
		if (this.pSDevSlnUserService == null) {
			this.pSDevSlnUserService = new PSDevSlnUserServiceImpl();
		}
		return this.pSDevSlnUserService;
	}

	protected void setPSDevSlnUserService(IPSDevSlnUserService pSDevSlnUserService) {
		this.pSDevSlnUserService = pSDevSlnUserService;
	}

	private IPSDCMSPlatformFuncService pSDCMSPlatformFuncService = null;

	public IPSDCMSPlatformFuncService getPSDCMSPlatformFuncService() {
		if (this.pSDCMSPlatformFuncService == null) {
			this.pSDCMSPlatformFuncService = new PSDCMSPlatformFuncServiceImpl();
		}
		return this.pSDCMSPlatformFuncService;
	}

	protected void setPSDCMSPlatformFuncService(IPSDCMSPlatformFuncService pSDCMSPlatformFuncService) {
		this.pSDCMSPlatformFuncService = pSDCMSPlatformFuncService;
	}

	private IPSDCMSPlatformService pSDCMSPlatformService = null;

	public IPSDCMSPlatformService getPSDCMSPlatformService() {
		if (this.pSDCMSPlatformService == null) {
			this.pSDCMSPlatformService = new PSDCMSPlatformServiceImpl();
		}
		return this.pSDCMSPlatformService;
	}

	protected void setPSDCMSPlatformService(IPSDCMSPlatformService pSDCMSPlatformService) {
		this.pSDCMSPlatformService = pSDCMSPlatformService;
	}

	private IPSDCDETemplService pSDCDETemplService = null;

	public IPSDCDETemplService getPSDCDETemplService() {
		if (this.pSDCDETemplService == null) {
			this.pSDCDETemplService = new PSDCDETemplServiceImpl();
		}
		return this.pSDCDETemplService;
	}

	protected void setPSDCDETemplService(IPSDCDETemplService pSDCDETemplService) {
		this.pSDCDETemplService = pSDCDETemplService;
	}

	private IPSDevSlnSysAPIService pSDevSlnSysAPIService = null;

	public IPSDevSlnSysAPIService getPSDevSlnSysAPIService() {
		if (this.pSDevSlnSysAPIService == null) {
			this.pSDevSlnSysAPIService = new PSDevSlnSysAPIServiceImpl();
		}
		return this.pSDevSlnSysAPIService;
	}

	protected void setPSDevSlnSysAPIService(IPSDevSlnSysAPIService pSDevSlnSysAPIService) {
		this.pSDevSlnSysAPIService = pSDevSlnSysAPIService;
	}

	private IPSDevSlnMSDeployService pSDevSlnMSDeployService = null;

	public IPSDevSlnMSDeployService getPSDevSlnMSDeployService() {
		if (this.pSDevSlnMSDeployService == null) {
			this.pSDevSlnMSDeployService = new PSDevSlnMSDeployServiceImpl();
		}
		return this.pSDevSlnMSDeployService;
	}

	protected void setPSDevSlnMSDeployService(IPSDevSlnMSDeployService pSDevSlnMSDeployService) {
		this.pSDevSlnMSDeployService = pSDevSlnMSDeployService;
	}

	private IPSDCWorkspaceService pSDCWorkspaceService = null;

	public IPSDCWorkspaceService getPSDCWorkspaceService() {
		if (this.pSDCWorkspaceService == null) {
			this.pSDCWorkspaceService = new PSDCWorkspaceServiceImpl();
		}
		return this.pSDCWorkspaceService;
	}

	protected void setPSDCWorkspaceService(IPSDCWorkspaceService pSDCWorkspaceService) {
		this.pSDCWorkspaceService = pSDCWorkspaceService;
	}

	private IPSDCRegistryRepoService pSDCRegistryRepoService = null;

	public IPSDCRegistryRepoService getPSDCRegistryRepoService() {
		if (this.pSDCRegistryRepoService == null) {
			this.pSDCRegistryRepoService = new PSDCRegistryRepoServiceImpl();
		}
		return this.pSDCRegistryRepoService;
	}

	protected void setPSDCRegistryRepoService(IPSDCRegistryRepoService pSDCRegistryRepoService) {
		this.pSDCRegistryRepoService = pSDCRegistryRepoService;
	}
	
	private IPSStudioPluginService pSStudioPluginService = null;

    public IPSStudioPluginService getPSStudioPluginService() {
        if(this.pSStudioPluginService == null) {
            this.pSStudioPluginService = new PSStudioPluginServiceImpl();
        }
        return this.pSStudioPluginService;
    }

    protected void setPSStudioPluginService(IPSStudioPluginService pSStudioPluginService) {
        this.pSStudioPluginService = pSStudioPluginService;
    }
    
    private IPSStudioPluginDataService pSStudioPluginDataService = null;

    public IPSStudioPluginDataService getPSStudioPluginDataService() {
        if(this.pSStudioPluginDataService == null) {
            this.pSStudioPluginDataService = new PSStudioPluginDataServiceImpl();
        }
        return this.pSStudioPluginDataService;
    }

    protected void setPSStudioPluginDataService(IPSStudioPluginDataService pSStudioPluginDataService) {
        this.pSStudioPluginDataService = pSStudioPluginDataService;
    }

}