package net.ibizsys.central.dataentity.logic;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDEDEReportLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.domain.File;

/**
 * 实体调用实体报表节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEReportNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEReportLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEReportLogic iPSDEDEReportLogic = (IPSDEDEReportLogic)iPSDELogicNode;
		
		Object value = iDELogicSession.getParamObject(iPSDEDEReportLogic.getDstPSDELogicParamMust().getCodeName());
		if(!(value instanceof ISearchContextBase)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]目标参数类型不正确", iPSDELogicNode.getName()));
		}
		
		ISearchContextBase iSearchContextBase = (ISearchContextBase)value;
		
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEDEReportLogic.getDstPSDataEntityMust().getId(), false);
		IPSDEReport dstPSDEReport = iPSDEDEReportLogic.getDstPSDEReportMust();
		
		if(iPSDEDEReportLogic.getOSPSDELogicParam() != null) {
			//取出文件
			Object osParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEReportLogic.getOSPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
			if(!(osParam instanceof File)) {
				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定输出流参数[%2$s]不是文件对象类型", iPSDELogicNode.getName(), iPSDEDEReportLogic.getOSPSDELogicParamMust().getCodeName()));
			}
			File file = (File)osParam;
			
			try(OutputStream os = iDELogicRuntimeContext.getDataEntityRuntime().getDEFileUtilRuntime().getOutputStream(file, false);){
				dstDataEntityRuntime.outputReport(dstPSDEReport.getId(), os, iSearchContextBase, null, false);
			}
			
			iDELogicSession.setLastReturn(null);
		}
		else {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			dstDataEntityRuntime.outputReport(dstPSDEReport.getId(), bos, iSearchContextBase, null, false);
			iDELogicSession.setLastReturn(bos.toString("utf-8"));
		}
		
	}
	
}
