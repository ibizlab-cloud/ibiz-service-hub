package net.ibizsys.central.dataentity.logic;

import java.io.OutputStream;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.logic.IPSDEDEPrintLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.domain.File;

/**
 * 实体调用实体打印节点运行时对象
 * @author lionlau
 *
 */
public class DELogicDEPrintNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEDEPrintLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEDEPrintLogic iPSDEDEPrintLogic = (IPSDEDEPrintLogic)iPSDELogicNode;
		
		IEntity dstEntity = (IEntity)iDELogicSession.getParamObject(iPSDEDEPrintLogic.getDstPSDELogicParamMust().getCodeName());
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDEDEPrintLogic.getDstPSDataEntityMust().getId(), false);
		IPSDEPrint dstPSDEPrint = iPSDEDEPrintLogic.getDstPSDEPrintMust();
		
		//取出文件
		Object osParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEDEPrintLogic.getOSPSDELogicParamMust().getCodeName(), false).getReal(iDELogicSession);
		if(!(osParam instanceof File)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定输出流参数[%2$s]不是文件对象类型", iPSDELogicNode.getName(), iPSDEDEPrintLogic.getOSPSDELogicParamMust().getCodeName()));
		}
		File file = (File)osParam;
		
		try(OutputStream os = iDELogicRuntimeContext.getDataEntityRuntime().getDEFileUtilRuntime().getOutputStream(file, false);){
			dstDataEntityRuntime.outputPrint(dstPSDEPrint.getId(), os, new Object[] {dstDataEntityRuntime.getKeyFieldValue(dstEntity)}, null, false);
		}
		
		iDELogicSession.setLastReturn(null);
		
	}
	
}
