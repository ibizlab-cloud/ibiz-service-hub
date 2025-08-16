package net.ibizsys.central.plugin.extension.sysutil;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.runtime.SystemRuntimeException;

/**
 * 系统实体智能报表代理功能组件
 * 
 * @author lionlau
 *
 */
public abstract class SysDEBIReportProxyUtilRuntimeBase extends SysUtilRuntimeBase implements ISysDEBIReportProxyUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysDEBIReportProxyUtilRuntimeBase.class);
	
//	final static String PSDEMODELSYNCTOOL_PREFIX = "PSDEMODELSYNCTOOL:";
//	static {
//		RuntimeObjectFactory.getInstance().registerObjectIf(ISysDEBIReportProxyUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSDEDATARELATION", PSDEDataRelationSyncTool.class);
//	}
	
	private IPSDataEntity proxyPSDataEntity = null;

	@Override
	protected ISysDEBIReportProxyUtilRuntimeContext createModelRuntimeContext() {
		return new SysDEBIReportProxyUtilRuntimeContextBase<ISysDEBIReportProxyUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

		};
	}

	@Override
	protected ISysDEBIReportProxyUtilRuntimeContext getModelRuntimeContext() {
		return (ISysDEBIReportProxyUtilRuntimeContext) super.getModelRuntimeContext();
	}

	private SysDEBIReportProxyUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected void prepareAddinRepo() throws Exception {
		//this.prepareAddinRepo(this.getModelRuntimeContext(), ISysDEBIReportProxyUtilRTAddin.class, this.getFullUniqueTag());
	}

	@Override
	protected void onInit() throws Exception {

		if (this.getProxyPSDataEntity(true) == null) {
			this.prepareProxyPSDataEntity();
			this.getProxyPSDataEntity(false);
		}

		super.onInit();
	}

	protected void setProxyPSDataEntity(IPSDataEntity proxyPSDataEntity) {
		this.proxyPSDataEntity = proxyPSDataEntity;
	}

	final protected IPSDataEntity getProxyPSDataEntity(boolean bTryMode) throws Exception {
		if (this.proxyPSDataEntity != null || bTryMode) {
			return this.proxyPSDataEntity;
		}
		throw new Exception(String.format("代理实体模型对象无效"));
	}

	protected void prepareProxyPSDataEntity() throws Exception {
		this.setProxyPSDataEntity(this.getPSSysUtil().getUtilPSDE());
	}
	
	@Override
	public IPSDataEntity getProxyPSDataEntity() {
		try {
			return this.getProxyPSDataEntity(false);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this, ex.getMessage(), ex);
		}
	}

	@Override
	protected void onInstallData(String strMode) throws Exception {
		
		super.onInstallData(strMode);
		
//		List<IPSDEGroupDetail> psDEGroupDetailList = this.getPSDataEntity(false).getPSDEGroupDetails();
//		if(!ObjectUtils.isEmpty(psDEGroupDetailList)) {
//			for(IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
//				String strTag = iPSDEGroupDetail.getDetailTag();
//				if(!StringUtils.hasLength(strTag)) {
//					strTag = iPSDEGroupDetail.getDetailParam();
//				}
//				if(!StringUtils.hasLength(strTag)) {
//					continue;
//				}
//				
//				if(strTag.indexOf(PSDEMODELSYNCTOOL_PREFIX) == 0) {
//					IDEBIReportProxySyncTool iDEBIReportProxySyncTool =	this.getAddinRepo().getAddin(IDEBIReportProxySyncTool.class, strTag, true);
//					if(iDEBIReportProxySyncTool == null) {
//						throw new Exception(String.format("无法获取[%1$s]对应的模型同步工具", strTag));
//					}
//					
//					try {
//						Map<String, Object> map = null;
//						if(StringUtils.hasLength(iPSDEGroupDetail.getData())) {
//							map = JsonUtils.asMap(iPSDEGroupDetail.getData());
//						}
//						iDEBIReportProxySyncTool.sync(iPSDEGroupDetail.getPSDataEntityMust(), map);
//					}
//					catch (Throwable ex) {
//						SystemRuntimeException.rethrow(this, ex);
//						throw new Exception(String.format("插件[%1$s]同步实体模型发生异常，%2$s", iDEBIReportProxySyncTool.getName(), ex.getMessage()), ex);
//					}
//					continue;
//				}
//				
//				
//				throw new Exception(String.format("无法识别的插件标记[%1$s]", strTag));
//			}
//		}
	}

}
