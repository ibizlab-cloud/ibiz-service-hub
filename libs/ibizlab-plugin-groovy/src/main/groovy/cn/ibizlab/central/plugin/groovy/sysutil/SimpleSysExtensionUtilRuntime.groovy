package cn.ibizlab.central.plugin.groovy.sysutil

import net.ibizsys.central.ISystemRuntime
import net.ibizsys.central.plugin.extension.psmodel.service.PSDEFormRTService
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionPSModelRTServiceSession
import net.ibizsys.central.plugin.extension.sysutil.SysExtensionUtilRuntimeBase
import net.ibizsys.psmodel.core.domain.PSDEForm
import net.ibizsys.psmodel.core.util.IPSModelServiceSession
import net.ibizsys.central.plugin.extension.psmodel.util.PSModelRTServiceFactory

class SimpleSysExtensionUtilRuntime extends SysExtensionUtilRuntimeBase{

	
	class SimplePSDEFormRTService extends PSDEFormRTService {
		@Override
		public PSDEForm get(String key, boolean tryMode) throws Exception {
			// TODO Auto-generated method stub
			return super.get(key, tryMode);
		}
	}
	
	class SimpleExtensionPSModelRTServiceSession extends ExtensionPSModelRTServiceSession {
		
	}
	
	class SimplePSModelRTServiceFactory extends PSModelRTServiceFactory{
		public SimplePSModelRTServiceFactory() {
			SimplePSDEFormRTService simplePSDEFormRTService  = new SimplePSDEFormRTService ();
			this.registerPSModelService("PSDEFORM", simplePSDEFormRTService);
			this.registerPSModelService("PSDEFORMS", simplePSDEFormRTService);
		}
	}
	
	@Override
	protected ExtensionPSModelRTServiceSession fillExtensionPSModelRTServiceSession(ExtensionPSModelRTServiceSession psModelServiceSession, ISystemRuntime iSystemRuntime) throws Throwable {
		if(psModelServiceSession == null) {
			psModelServiceSession = new SimpleExtensionPSModelRTServiceSession();
		}
		return super.fillExtensionPSModelRTServiceSession(psModelServiceSession, iSystemRuntime);
	}
	
	@Override
	protected PSModelRTServiceFactory getPSModelRTServiceFactory(ISystemRuntime iSystemRuntime) throws Throwable {
		// TODO Auto-generated method stub
		//eturn super.getPSModelRTServiceFactory(iSystemRuntime);
		return new SimplePSModelRTServiceFactory();
	}
}
