package net.ibizsys.central.dataentity.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.service.ISysServiceAPIRuntimeContext;
import net.ibizsys.central.service.SysServiceAPIRuntimeException;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.runtime.ModelRuntimeBase;

/**
 * 实体服务接口关系运行时对象接口
 * 
 * @author lionlau
 *
 */
public class DEServiceAPIRSRuntime extends ModelRuntimeBase implements IDEServiceAPIRSRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEServiceAPIRSRuntime.class);

	private ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext = null;
	private IPSDEServiceAPIRS iPSDEServiceAPIRS = null;
	private Map<String, IPSDEServiceAPIMethod> psDEServiceAPIMethodMap = new HashMap<String, IPSDEServiceAPIMethod>();
	private IDEServiceAPIRuntime majorDEServiceAPIRuntime = null;
	private IDEServiceAPIRuntime minorDEServiceAPIRuntime = null;

	@Override
	public void init(ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext, IPSDEServiceAPIRS iPSDEServiceAPIRS) throws Exception {
		Assert.notNull(iSysServiceAPIRuntimeContext, "传入系统服务接口运行时上下文对象无效");
		Assert.notNull(iPSDEServiceAPIRS, "传入实体服务接口关系模型对象无效");
		
		this.iSysServiceAPIRuntimeContext = iSysServiceAPIRuntimeContext;
	
		this.iPSDEServiceAPIRS = iPSDEServiceAPIRS;
		
		

		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		this.majorDEServiceAPIRuntime = this.getSysServiceAPIRuntimeContext().getSysServiceAPIRuntime().getDEServiceAPIRuntime(this.getPSDEServiceAPIRS().getMajorPSDEServiceAPIMust().getId(), false);
		this.minorDEServiceAPIRuntime = this.getSysServiceAPIRuntimeContext().getSysServiceAPIRuntime().getDEServiceAPIRuntime(this.getPSDEServiceAPIRS().getMinorPSDEServiceAPIMust().getId(), false);
		
		java.util.List<IPSDEServiceAPIMethod> psDEServcieAPIMethodList =  this.getPSDEServiceAPIRS().getPSDEServiceAPIMethods();
		if(psDEServcieAPIMethodList != null) {
			for(IPSDEServiceAPIMethod iPSDEServiceAPIMethod : psDEServcieAPIMethodList) {
				
				iPSDEServiceAPIMethod.getPSDEAction();
				iPSDEServiceAPIMethod.getPSDEDataSet();
				
				if(StringUtils.hasLength(iPSDEServiceAPIMethod.getCodeName())) {
					psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getCodeName(), iPSDEServiceAPIMethod);
					psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getCodeName().toUpperCase(), iPSDEServiceAPIMethod);
					psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getCodeName().toLowerCase(), iPSDEServiceAPIMethod);
				}
				else {
					if(iPSDEServiceAPIMethod.getPSDEAction() != null) {
						psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getPSDEAction().getCodeName(), iPSDEServiceAPIMethod);
						psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getPSDEAction().getCodeName().toUpperCase(), iPSDEServiceAPIMethod);
						psDEServiceAPIMethodMap.put(iPSDEServiceAPIMethod.getPSDEAction().getCodeName().toLowerCase(), iPSDEServiceAPIMethod);
					}
				}
			}
		}
		
//		IPSDEField parentIdPSDEField = this.getPSDEServiceAPIRS().getParentIdPSDEField();
//		IPSDEField parentTypePSDEField = this.getPSDEServiceAPIRS().getParentTypePSDEField();
		
		
		super.onInit();
	}
	
	
	
	@Override
	public IPSDEServiceAPIRS getPSDEServiceAPIRS() {
		return this.iPSDEServiceAPIRS;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEServiceAPIRS();
	}
	
	protected ISysServiceAPIRuntimeContext getSysServiceAPIRuntimeContext() {
		return this.iSysServiceAPIRuntimeContext;
	}

	@Override
	public IPSDEServiceAPIMethod getPSDEServiceAPIMethod(String strMethodCodeName, boolean bTryMode) {
		IPSDEServiceAPIMethod iPSDEServiceAPIMethod = psDEServiceAPIMethodMap.get(strMethodCodeName);
		if(iPSDEServiceAPIMethod != null || bTryMode) {
			return iPSDEServiceAPIMethod;
		}
		
		throw new SysServiceAPIRuntimeException(getSysServiceAPIRuntimeContext().getSysServiceAPIRuntime(), this, String.format("不存在指定方法[%1$s]",strMethodCodeName));
	}

	@Override
	public IDEServiceAPIRuntime getMajorDEServiceAPIRuntime() {
		return this.majorDEServiceAPIRuntime;
	}

	@Override
	public IDEServiceAPIRuntime getMinorDEServiceAPIRuntime() {
		return this.minorDEServiceAPIRuntime;
	}
	
	

	
}
