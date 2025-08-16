package net.ibizsys.central.plugin.extension.sysutil;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.plugin.extension.addin.IPSDEModelSyncTool;
import net.ibizsys.central.plugin.extension.sysutil.addin.ISysPSDEModelUtilRTAddin;
import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEDataRelationSyncTool;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.model.dataentity.IPSDEGroupDetail;
import net.ibizsys.model.dataentity.IPSSysDEGroup;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 系统实体模型功能组件
 * 
 * @author lionlau
 *
 */
public abstract class SysPSDEModelUtilRuntimeBase extends SysUtilRuntimeBase implements ISysPSDEModelUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysPSDEModelUtilRuntimeBase.class);
	
	final static String PSDEMODELSYNCTOOL_PREFIX = "PSDEMODELSYNCTOOL:";
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSDEDATARELATION", PSDEDataRelationSyncTool.class);
	}
	
	private IPSSysDEGroup iPSSysDEGroup = null;

	@Override
	protected ISysPSDEModelUtilRuntimeContext createModelRuntimeContext() {
		return new SysPSDEModelUtilRuntimeContextBase<ISysPSDEModelUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()) {

		};
	}

	@Override
	protected ISysPSDEModelUtilRuntimeContext getModelRuntimeContext() {
		return (ISysPSDEModelUtilRuntimeContext) super.getModelRuntimeContext();
	}

	private SysPSDEModelUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(this.getModelRuntimeContext(), ISysPSDEModelUtilRTAddin.class, this.getFullUniqueTag()+":");
	}

	@Override
	protected void onInit() throws Exception {

		if (this.getPSSysDEGroup(true) == null) {
			this.preparePSSysDEGroup();
			this.getPSSysDEGroup(false);
		}

		super.onInit();
	}

	protected void setPSSysDEGroup(IPSSysDEGroup iPSSysDEGroup) {
		this.iPSSysDEGroup = iPSSysDEGroup;
	}

	final protected IPSSysDEGroup getPSSysDEGroup(boolean bTryMode) throws Exception {
		if (this.iPSSysDEGroup != null || bTryMode) {
			return this.iPSSysDEGroup;
		}
		throw new Exception(String.format("系统实体组模型对象无效"));
	}

	protected void preparePSSysDEGroup() throws Exception {
		this.setPSSysDEGroup(this.getPSSysUtil().getPSSysDEGroup());
	}

	@Override
	protected void onInstallData(String strMode) throws Exception {
		
		super.onInstallData(strMode);
		
		List<IPSDEGroupDetail> psDEGroupDetailList = this.getPSSysDEGroup(false).getPSDEGroupDetails();
		if(!ObjectUtils.isEmpty(psDEGroupDetailList)) {
			for(IPSDEGroupDetail iPSDEGroupDetail : psDEGroupDetailList) {
				String strTag = iPSDEGroupDetail.getDetailTag();
				if(!StringUtils.hasLength(strTag)) {
					strTag = iPSDEGroupDetail.getDetailParam();
				}
				if(!StringUtils.hasLength(strTag)) {
					continue;
				}
				
				if(strTag.indexOf(PSDEMODELSYNCTOOL_PREFIX) == 0) {
					IPSDEModelSyncTool iPSDEModelSyncTool =	this.getAddinRepo().getAddin(IPSDEModelSyncTool.class, strTag, true);
					if(iPSDEModelSyncTool == null) {
						throw new Exception(String.format("无法获取[%1$s]对应的模型同步工具", strTag));
					}
					
					try {
						Map<String, Object> map = null;
						if(StringUtils.hasLength(iPSDEGroupDetail.getData())) {
							map = JsonUtils.asMap(iPSDEGroupDetail.getData());
						}
						iPSDEModelSyncTool.sync(iPSDEGroupDetail.getPSDataEntityMust(), map);
					}
					catch (Throwable ex) {
						SystemRuntimeException.rethrow(this, ex);
						throw new Exception(String.format("插件[%1$s]同步实体模型发生异常，%2$s", iPSDEModelSyncTool.getName(), ex.getMessage()), ex);
					}
					continue;
				}
				
				
				throw new Exception(String.format("无法识别的插件标记[%1$s]", strTag));
			}
		}
	}

}
