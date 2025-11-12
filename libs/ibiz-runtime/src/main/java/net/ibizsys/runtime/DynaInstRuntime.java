package net.ibizsys.runtime;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.model.IPSDynaInst;
import net.ibizsys.model.IPSDynaInstService;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;

/**
 * 动态实例运行时默认实现
 * 
 * @author lionlau
 *
 */
public class DynaInstRuntime extends SystemRuntimeBaseBase implements IDynaInstRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaInstRuntime.class);
	
	private IPSDynaInstService iPSDynaInstService = null;
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private long nLastActiveTime = 0l;
	private long nLastCheckTime = 0l;
	private IPSSystem iPSSystem = null;
	private Map<String,IDynaInstDataEntityRuntime> dataEntityMap = new HashMap<String,IDynaInstDataEntityRuntime>();
	private long nLoadedTime = 0l;
	private String strInstallTag = null;
	
	private IDynaInstRuntimeContext iDynaInstRuntimeContext = new IDynaInstRuntimeContext() {
		@Override
		public IDynaInstRuntime getSystemRuntime() {
			return getSelf();
		}
		
		@Override
		public IPSSystemService getPSSystemService() {
			return getSelf().getPSDynaInstService();
		}
	
	};
	
	@Override
	public void init(IPSDynaInstService iPSDynaInstService, ISystemRuntimeContext iSystemRuntimeContext)
			throws Exception {
		this.iPSDynaInstService = iPSDynaInstService;
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.nLoadedTime = System.currentTimeMillis();
		
		iPSSystem = getPSDynaInstService().getPSSystem();
		
		this.onInit();
	}

	protected void onInit() throws Exception {
		
		
		if(iPSSystem.getObjectNode()!=null) {
			JsonNode jsonNode = iPSSystem.getObjectNode().get("preloadDEs");
			if(jsonNode != null && jsonNode instanceof ArrayNode) {
				ArrayNode arrayNode = (ArrayNode)jsonNode;
				for(int i = 0; i < arrayNode.size(); i++) {
					String strDEId = arrayNode.get(i).asText();
					if(StringUtils.hasLength(strDEId)) {
						log.debug(String.format("动态实例[%1$s]预载实体运行时[%2$s]",this.getId(),strDEId));
						this.getDynaInstDataEntityRuntime(strDEId);
					}
				}
			}
		}
		 
//		//缓存动态实例相关模型
//		//从模块中加载实体
//		List<IPSSystemModule> psSystemModuleList = iPSSystem.getAllPSSystemModules();
//		if(psSystemModuleList!=null) {
//			for(IPSSystemModule iPSSystemModule:psSystemModuleList) {
//				List<IPSDataEntity> psDataEntityList = iPSSystemModule.getAllPSDataEntities();
//				if(psDataEntityList!=null) {
//					for(IPSDataEntity iPSDataEntity:psDataEntityList) {
//						
//						//获取核心实体运行时
//						
//						//建立动态实例实体运行时
//						
//						
//						IPSModelObjectRuntime iPSModelObjectRuntime = (IPSModelObjectRuntime)iPSDataEntity;
//						if(StringUtils.hasLength(iPSModelObjectRuntime.getDynaModelFilePath())) {
//							this.psDataEntityMap.put(iPSModelObjectRuntime.getDynaModelFilePath(), iPSDataEntity);
//						}
////						if(StringUtils.hasLength(iPSDataEntity.getName())) {
////							this.psDataEntityMap.put(iPSDataEntity.getName(), iPSDataEntity);
////						}
//					}
//				}
//			}
//		}
		
		super.onInit();
	}
	
	private DynaInstRuntime getSelf() {
		return this;
	}
	
	protected IDynaInstRuntimeContext getDynaInstRuntimeContext() {
		return this.iDynaInstRuntimeContext;
	}
	
	
	@Override
	protected ISystemRuntimeBaseContext getSystemRuntimeBaseContext() {
		return getDynaInstRuntimeContext();
	}
	
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime(String strIdOrName) {
		
		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = dataEntityMap.get(strIdOrName);
		if(iDynaInstDataEntityRuntime == null) {
			IDataEntityRuntime iDataEntityRuntime = getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(strIdOrName);
			if(iDataEntityRuntime != null) {
				iDynaInstDataEntityRuntime = iDataEntityRuntime.createDynaInstDataEntityRuntime(this);
			}
			
			IDynaInstDataEntityRuntime iDynaInstDataEntityRuntimeLast = dataEntityMap.get(strIdOrName);
			if(iDynaInstDataEntityRuntimeLast!=null) {
				return iDynaInstDataEntityRuntimeLast;
			}
			
			dataEntityMap.put(strIdOrName, iDynaInstDataEntityRuntime);
		}
		
		return iDynaInstDataEntityRuntime;
	}

	@Override
	public IPSDynaInstService getPSDynaInstService() {
		return this.iPSDynaInstService;
	}

	@Override
	public IPSSystemService getPSSystemService() {
		return getPSDynaInstService();
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	@Override
	public IPSSystem getPSSystem() {
		return this.iPSSystem;
	}
	
	@Override
	public String getPSDevSlnSysId() {
		return this.getPSSystem().getPSDevSlnSysId(); 
	}

	@Override
	public void active() {
		this.nLastActiveTime = System.currentTimeMillis();
	}

	@Override
	public long getLastActiveTime() {
		return this.nLastActiveTime;
	}

	@Override
	public String getChildDynaInstId(String strDynaInstTag, String strDynaInstTag2) {
		IPSDynaInst iPSDynaInst = this.getPSDynaInstService().getChildPSDynaInst(strDynaInstTag, strDynaInstTag2);
		return (iPSDynaInst == null)?null:iPSDynaInst.getId();
	}
	
	@Override
	public String getDynaInstFolderPath() {
		return this.getPSDynaInstService().getPSModelFolderPath();
	}

	@Override
	public String getId() {
		return this.iPSDynaInstService.getPSDynaInstId();
	}

	@Override
	public String getName() {
		return "未知";
	}


	@Override
	public long getLastCheckTime() {
		return this.nLastCheckTime;
	}

	@Override
	public void markChecked() {
		this.nLastCheckTime = System.currentTimeMillis();
	}

	
	@Override
	public long getLoadedTime() {
		return this.nLoadedTime;
	}

	@Override
	public boolean check() {
		String strCurTag = this.getPSDynaInstService().getInstallTag();
		if(StringUtils.hasLength(strCurTag)) {
			//跟当前对比
			if(StringUtils.hasLength(this.strInstallTag)) {
				return this.strInstallTag.equals(strCurTag);
			}
			
			this.strInstallTag = strCurTag;
		}
		return true;
	}
	
	@Override
	public int getDynaInstMode() {
		return this.getPSDynaInstService().getDynaInstMode();
	}
	
	@Override
	public ISysLogicRuntime getSysLogicRuntime(IPSSysLogic iPSSysLogic) {
		return super.getSysLogicRuntime(iPSSysLogic);
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSystem();
	}

	@Override
	public ICodeListRuntime getCodeListRuntime(IPSCodeList iPSCodeList) {
		return getSystemRuntimeContext().getSystemRuntime().getCodeListRuntime(iPSCodeList);
		//return super.getCodeListRuntime(iPSCodeList);
	}
}
