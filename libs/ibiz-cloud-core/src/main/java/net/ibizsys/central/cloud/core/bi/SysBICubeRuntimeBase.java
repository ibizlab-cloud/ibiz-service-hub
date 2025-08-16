package net.ibizsys.central.cloud.core.bi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.bi.SysBISchemeRuntimeException;
import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICube;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICubeItemType;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SysBICubeRuntimeBase extends net.ibizsys.central.bi.SysBICubeRuntimeBase implements ISysBICubeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysBICubeRuntimeBase.class);
	private String strLastExtensionBICubeCacheData = null;
	private ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = null;
	private IServiceSystemRuntime iServiceSystemRuntime = null;
	
	private Map<String, IPSSysBICubeMeasure> psSysBICubeMeasureMap = new LinkedHashMap<>();
	private Map<String, IPSSysBICubeDimension> psSysBICubeDimensionMap = new LinkedHashMap<>();
	
	@Override
	protected void onInit() throws Exception {
		
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			this.iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
		}
		
		
		super.onInit();
	}
	
	
	protected ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime(){
		if(this.iSysCloudExtensionUtilRuntime == null) {
			this.iSysCloudExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudExtensionUtilRuntime.class, false);
		}
		return this.iSysCloudExtensionUtilRuntime;
	}
	

	@Override
	protected List onFetch(IBISearchContext iBISearchContext) throws Throwable {
		prepareExtensionBICubes();
		return super.onFetch(iBISearchContext);
	}
	
	protected void prepareExtensionBICubes() throws Exception {
		if(this.getServiceSystemRuntime(true) == null || !this.getServiceSystemRuntime(false).isEnableExtension()) {
			return;
		}
		onPrepareExtensionBICubes();
	}
	
	protected synchronized void onPrepareExtensionBICubes() throws Exception {
		String strCurrentExtensionCacheData = getCurrentExtensionBICubeCacheData();
		if(this.strLastExtensionBICubeCacheData == null || !this.strLastExtensionBICubeCacheData.equals(strCurrentExtensionCacheData)) {
			//查询相关数据
			List<V2SystemExtensionBICube> v2SystemExtensionBICubeList = this.getSysCloudExtensionUtilRuntime().getSystemExtensionBICubes(this.getServiceSystemRuntime(false).getExtensionId(), this.getFullUniqueTag());
			//注销
			for(IPSSysBICubeDimension iPSysBICubeDimension : this.psSysBICubeDimensionMap.values()) {
				this.resetDimensionFormulaCache(iPSysBICubeDimension);
			}
			
			for(IPSSysBICubeMeasure iPSysBICubeMeasure : this.psSysBICubeMeasureMap.values()) {
				this.resetMeasureFormulaCache(iPSysBICubeMeasure);
			}
			
			this.psSysBICubeMeasureMap.clear();
			this.psSysBICubeDimensionMap.clear();
			
			if(!ObjectUtils.isEmpty(v2SystemExtensionBICubeList)) {
				for(V2SystemExtensionBICube v2SystemExtensionBICube : v2SystemExtensionBICubeList) {
					
					if(!StringUtils.hasLength(v2SystemExtensionBICube.getRuntimeModel())) {
						continue;
					}
					
					ObjectNode objectNode = JsonUtils.toObjectNode(v2SystemExtensionBICube.getRuntimeModel());
					
					if(V2SystemExtensionBICubeItemType.DIMENSION.value.equals(v2SystemExtensionBICube.getType())) {
						IPSSysBICubeDimension iPSSysBICubeDimension = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSSysBICube(), IPSSysBICubeDimension.class, objectNode);
						if(!StringUtils.hasLength(iPSSysBICubeDimension.getCodeName())) {
							continue;
						}
						
						this.psSysBICubeDimensionMap.put(iPSSysBICubeDimension.getCodeName().toLowerCase(), iPSSysBICubeDimension);
						continue;
					}
					
					if(V2SystemExtensionBICubeItemType.MEASURE.value.equals(v2SystemExtensionBICube.getType())) {
						IPSSysBICubeMeasure iPSSysBICubeMeasure = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSSysBICube(), IPSSysBICubeMeasure.class, objectNode);
						if(!StringUtils.hasLength(iPSSysBICubeMeasure.getCodeName())) {
							continue;
						}
						
						this.psSysBICubeMeasureMap.put(iPSSysBICubeMeasure.getCodeName().toLowerCase(), iPSSysBICubeMeasure);
						continue;
					}
					
				}
			}
			
			this.strLastExtensionBICubeCacheData = strCurrentExtensionCacheData;
		}
	}
	
	protected String getCurrentExtensionBICubeCacheData() throws Exception {
		return this.getSysCloudExtensionUtilRuntime().getSystemExtensionBICubeCacheData(this.getServiceSystemRuntime(false).getExtensionId(), this.getFullUniqueTag());
		
	}
	
	protected String getLastExtensionBICubeCacheData() {
		return this.strLastExtensionBICubeCacheData;
	}
	
	@Override
	public IPSSysBICubeMeasure getPSSysBICubeMeasure(String strName, boolean bTryMode) {

		IPSSysBICubeMeasure iPSSysBICubeMeasure = super.getPSSysBICubeMeasure(strName, true);
		if(iPSSysBICubeMeasure != null) {
			return iPSSysBICubeMeasure;
		}
		
		iPSSysBICubeMeasure = this.psSysBICubeMeasureMap.get(strName.toLowerCase());
		if(iPSSysBICubeMeasure != null || bTryMode) {
			return iPSSysBICubeMeasure;
		}

		throw new SysBISchemeRuntimeException(this.getSysBISchemeRuntime(), this, String.format("指定立方体指标[%1$s]不存在", strName));
	}

	@Override
	public IPSSysBICubeDimension getPSSysBICubeDimension(String strName, boolean bTryMode) {
		IPSSysBICubeDimension iPSSysBICubeDimension = super.getPSSysBICubeDimension(strName, true);
		if(iPSSysBICubeDimension != null) {
			return iPSSysBICubeDimension;
		}
		
		iPSSysBICubeDimension = this.psSysBICubeDimensionMap.get(strName.toLowerCase());
		if(iPSSysBICubeDimension != null || bTryMode) {
			return iPSSysBICubeDimension;
		}

		throw new SysBISchemeRuntimeException(this.getSysBISchemeRuntime(), this, String.format("指定立方体维度[%1$s]不存在", strName));
	}
	
	protected IServiceSystemRuntime getServiceSystemRuntime(boolean bTryMode) throws Exception {
		if(this.iServiceSystemRuntime != null || bTryMode) {
			return this.iServiceSystemRuntime;
		}
		throw new Exception(String.format("服务系统运行时对象无效"));
	}
	
	
}
