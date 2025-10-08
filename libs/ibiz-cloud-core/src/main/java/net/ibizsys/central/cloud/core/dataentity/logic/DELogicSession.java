package net.ibizsys.central.cloud.core.dataentity.logic;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;

public class DELogicSession extends net.ibizsys.central.dataentity.logic.DELogicSession {

	private static final Log log = LogFactory.getLog(DELogicSession.class);
	private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
	
	protected ISysCloudLogUtilRuntime getSysCloudLogUtilRuntime() {
		if(this.iSysCloudLogUtilRuntime == null) {
			this.iSysCloudLogUtilRuntime = this.getDELogicRuntimeContext().getSystemRuntime().getSysUtilRuntime(ISysCloudLogUtilRuntime.class, false);
		}
		return this.iSysCloudLogUtilRuntime;
	}
	
	public DELogicSession(IDELogicRuntimeContext iDELogicRuntimeContext) {
		super(iDELogicRuntimeContext);
	}
	
	

	public DELogicSession(IDELogicRuntimeContext iDELogicRuntimeContext, Map<String, Object> params) {
		super(iDELogicRuntimeContext, params);
	}

	@Override
	public void debugEnterNode(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode) {
		
		super.debugEnterNode(iDELogicNodeRuntime, iPSDELogicNode);
	}

	@Override
	public void debugEnterLink(IDELogicNodeRuntime iDELogicNodeRuntime, IPSDELogicNode iPSDELogicNode, IPSDELogicLink iPSDELogicLink) {
		super.debugEnterLink(iDELogicNodeRuntime, iPSDELogicNode, iPSDELogicLink);
	}

	@Override
	public void debugParam(IDELogicParamRuntime iDELogicParamRuntime) {
		super.debugParam(iDELogicParamRuntime);
	}

	@Override
	public void debugInfo(String strInfo) {
		super.debugInfo(strInfo);
	}

	protected DELogicSession clone(IDELogicRuntimeContext iDELogicRuntimeContext, Map<String, Object> params) {
		return new DELogicSession(iDELogicRuntimeContext, params);
	}
	
}
