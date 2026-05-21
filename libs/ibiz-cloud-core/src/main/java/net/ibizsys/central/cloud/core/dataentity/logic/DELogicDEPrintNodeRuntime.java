package net.ibizsys.central.cloud.core.dataentity.logic;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.model.PSModelEnums.PrintType;
import net.ibizsys.model.dataentity.logic.IPSDEDEPrintLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public class DELogicDEPrintNodeRuntime extends net.ibizsys.central.dataentity.logic.DELogicDEPrintNodeRuntime {

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		if(!(iPSDELogicNode instanceof IPSDEDEPrintLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		IPSDEDEPrintLogic iPSDEDEPrintLogic = (IPSDEDEPrintLogic)iPSDELogicNode;
		//判断是否为AI打印，需要升级权限
		if(PrintType.CHATRESOURCE.value.equals(iPSDEDEPrintLogic.getDstPSDEPrintMust().getReportType())) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
			IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
			try {
				EmployeeContext.setCurrent(iServiceSystemRuntime.createSuperUserContext());
				super.onExecute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
			}
			finally {
				EmployeeContext.setCurrent(lastEmployeeContext);
			}
		}
		else {
			super.onExecute(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
		}
	}
}
