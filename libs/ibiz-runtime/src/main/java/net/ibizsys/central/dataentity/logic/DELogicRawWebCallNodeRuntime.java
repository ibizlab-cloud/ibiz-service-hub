package net.ibizsys.central.dataentity.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientRepEntity;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDERawWebCallLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体直接Web调用节点运行时对象
 * @author lionlau
 *
 */
public class DELogicRawWebCallNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDERawWebCallLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDERawWebCallLogic iPSDERawWebCallLogic = (IPSDERawWebCallLogic)iPSDELogicNode;
		
		String strRequestMethod = iPSDERawWebCallLogic.getRequestMethod();
		if(!StringUtils.hasLength(strRequestMethod)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]未指定请求方式", iPSDELogicNode.getName()));
		}
		String strRequestPath = iPSDERawWebCallLogic.getRequestPath();
		if(!StringUtils.hasLength(strRequestPath)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]未指定请求路径", iPSDELogicNode.getName()));
		}
		
		
		IWebClient iWebClient = null;
		if(iPSDERawWebCallLogic.getPSSubSysServiceAPI() != null) {
			iWebClient = iDELogicRuntimeContext.getDELogicRuntime().getSystemRuntime().getSubSysServiceAPIRuntime(iPSDERawWebCallLogic.getPSSubSysServiceAPI()).getWebClient();
		}
		else {
			iWebClient = iDELogicRuntimeContext.getDELogicRuntime().getSystemRuntime().getDefaultWebClient();
		}
		
		//准备调用参数
		Map<String, Object> urlParamMap = null;
		Map<String, Object> headerMap = null;
		List<IPSDELogicNodeParam> psDELogicNodeParamList = iPSDERawWebCallLogic.getPSDELogicNodeParams();
		if(psDELogicNodeParamList != null) {
			urlParamMap = new HashMap<>();
			headerMap = new HashMap<>();
			for(IPSDELogicNodeParam iPSDELogicNodeParam : psDELogicNodeParamList) {
				if(DELogicNodeParamTypes.WEBURIPARAM.equals(iPSDELogicNodeParam.getParamAction())) {
					urlParamMap.put(iPSDELogicNodeParam.getDstFieldName(),this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam));
					continue;
				}
				if(DELogicNodeParamTypes.WEBHEADERPARAM.equals(iPSDELogicNodeParam.getParamAction())) {
					headerMap.put(iPSDELogicNodeParam.getDstFieldName(),this.calcDELogicNodeParamValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNodeParam));
					continue;
				}
			}
		}
		
		Object objParam = null;
		if(iPSDERawWebCallLogic.getDstPSDELogicParam() != null) {
			objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERawWebCallLogic.getDstPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
		}
		
		String strContentType = iPSDERawWebCallLogic.getBodyContentType();
		
		IWebClientRep<String> rep =	iWebClient.execute(strRequestMethod, strRequestPath, urlParamMap, headerMap, null, objParam, strContentType, String.class, null);
		Object objRet = null;
		if(iPSDERawWebCallLogic.isReturnRepEntity()) {
			objRet =  WebClientRepEntity.from(rep);
		}
		else {
			objRet = rep.getBody();
		}
		
		
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDERawWebCallLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERawWebCallLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
}
