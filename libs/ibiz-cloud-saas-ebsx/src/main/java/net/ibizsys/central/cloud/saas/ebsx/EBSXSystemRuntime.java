package net.ibizsys.central.cloud.saas.ebsx;

import net.ibizsys.central.cloud.saas.ebsx.database.EBSXDBSchemeRuntime;
import net.ibizsys.central.cloud.saas.ebsx.dataentity.EBSXDataEntityRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelServiceImpl;

public class EBSXSystemRuntime extends EBSXSystemRuntimeBase {

	private static IEBSXSystemRuntime instance = null;

    public static IEBSXSystemRuntime getInstance() {
        return getInstance(false);
    }

    public static IEBSXSystemRuntime getInstance(boolean bTryMode) {
        if(EBSXSystemRuntime.instance != null || bTryMode) {
            return EBSXSystemRuntime.instance;
        }
//		//尝试建立
//		if(SystemGateway.getInstance(true)==null) {
//			throw new RuntimeException("系统网关实例不存在，无法建立核心系统运行时实例");
//		}



        throw new RuntimeException("核心系统运行时实例不存在");
    }

    public static void setInstance(IEBSXSystemRuntime instance) {
        EBSXSystemRuntime.instance = instance;
    }

    @Override
    protected void onStart() throws Exception {
        super.onStart();
        if(getInstance(true) == null) {
            setInstance(this);
        }
    }

    @Override
    public IDEService getDEService(IDataEntityRuntime iDataEntityRuntime) {
        if (!this.getSystemGatewayContext().isMultiInstanceMode(EBSXSystemRuntime.class)) {
            IDEService iDEService = this.getSystemGatewayContext().getDEService(EBSXSystemRuntime.class, iDataEntityRuntime.getId(), false);
            return iDEService;
        }
        return super.getDEService(iDataEntityRuntime);
    }


    @Override
    protected IPSSystemService createPSSystemService() throws Exception {

        PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
        psModelServiceImpl.setPSModelFolderPath("/sysmodel/saas-ebsx", true);

        return psModelServiceImpl;
    }
    
    
    @Override
    protected IDataEntityRuntime createDefaultDataEntityRuntime() {
    	return new EBSXDataEntityRuntime();
    }
    
    
    @Override
	protected ISysDBSchemeRuntime createDefaultSysDBSchemeRuntime() {
		return new EBSXDBSchemeRuntime();
	}
    
    @Override
    public boolean isEnableRTCodeMode() {
    	return false;
    }
}
