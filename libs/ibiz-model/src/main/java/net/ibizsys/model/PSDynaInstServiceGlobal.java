package net.ibizsys.model;

import java.util.HashMap;

import org.springframework.util.StringUtils;

/**
 * 模型服务全局对象
 * @author lionlau
 *
 */
public class PSDynaInstServiceGlobal implements IPSDynaInstServiceGlobal{

	private static IPSDynaInstServiceGlobal instance = new PSDynaInstServiceGlobal();
	private java.util.Map<String,String> dynaInstCfgPathMap  = new HashMap<String, String>();
	private java.util.Map<String,IPSDynaInstService> psDynaInstServicehMap  = new HashMap<String, IPSDynaInstService>();
	
	
	private IPSSystemService iPSSystemService = null;
	
	/**
	 * 获取模型服务对象全局实例
	 * @return
	 */
	public static IPSDynaInstServiceGlobal getInstance() {
		return PSDynaInstServiceGlobal.instance;
	}
	
	
	/**
	 * 设置模型服务对象全局实例
	 * @return
	 */
	public static void setInstance(IPSDynaInstServiceGlobal iPSDynaInstServiceGlobal) {
		PSDynaInstServiceGlobal.instance = iPSDynaInstServiceGlobal;
	}
	
	
	/**
	 * 建立模型辅助对象
	 * @return
	 */
	protected IPSDynaInstService createPSDynaInstService() {
		return new PSModelServiceImpl();
	}
	
	
	public void registerPSDynaInst(String strDynaInstId,String strCfgPath) {
		dynaInstCfgPathMap.put(strDynaInstId, strCfgPath);
	}
	
	public String getPSDynaInstPath(String strDynaInstId) {
		return dynaInstCfgPathMap.get(strDynaInstId);
	}
	
	@Override
	public IPSDynaInstService getCachePSDynaInstService(String strPSDynaInstId){
		return psDynaInstServicehMap.get(strPSDynaInstId);
	}
	
	/**
	 * 获取指定实例的模型服务对象
	 * @param strPSDynaInstId
	 * @param bReload
	 * @return
	 * @throws Exception
	 */
	@Override
	public IPSDynaInstService getPSDynaInstService(String strPSDynaInstId,boolean bReload)throws Exception{
		IPSDynaInstService iPSDynaInstService = null;
		if(!bReload) {
			iPSDynaInstService = psDynaInstServicehMap.get(strPSDynaInstId);
			if(iPSDynaInstService != null) {
				return iPSDynaInstService;
			}
		}
		String strCfgPath = this.dynaInstCfgPathMap.get(strPSDynaInstId);
		if(!StringUtils.hasLength(strCfgPath)) {
			throw new Exception(String.format("无法获取动态实例[%1$s]配置路径", strPSDynaInstId));
		}
		iPSDynaInstService = this.createPSDynaInstService();
		if(iPSDynaInstService instanceof IPSDynaInstServiceRuntime) {
			IPSDynaInstServiceRuntime iPSModelServiceRuntime = (IPSDynaInstServiceRuntime)iPSDynaInstService;
			iPSModelServiceRuntime.setPSDynaInstId(strPSDynaInstId);
			iPSModelServiceRuntime.setPSSystemService(getPSSystemService());
			iPSModelServiceRuntime.setPSModelFolderPath(strCfgPath);
		}
		//准备环境
		iPSDynaInstService.getPSSystem();
		
		psDynaInstServicehMap.put(strPSDynaInstId, iPSDynaInstService);
		return iPSDynaInstService;
	}


	@Override
	public void resetPSDynaInstService(String strPSDynaInstId) {
		psDynaInstServicehMap.remove(strPSDynaInstId);
	}


	@Override
	public IPSSystemService getPSSystemService() {
		return this.iPSSystemService;
	}
	
	/**
	 * 设置系统核心服务对象
	 * @param iPSSystemService
	 */
	public void setPSSystemService(IPSSystemService iPSSystemService) {
		this.iPSSystemService = iPSSystemService;
	}
	
}
