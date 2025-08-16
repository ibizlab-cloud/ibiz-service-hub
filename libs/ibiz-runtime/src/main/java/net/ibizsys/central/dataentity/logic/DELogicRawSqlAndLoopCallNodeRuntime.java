package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDERawSqlAndLoopCallLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体SQL查询并循环调用节点运行时对象
 * @author lionlau
 *
 */
public class DELogicRawSqlAndLoopCallNodeRuntime extends DELogicRawSqlCallNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDERawSqlAndLoopCallLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDERawSqlAndLoopCallLogic iPSDERawSqlAndLoopCallLogic = (IPSDERawSqlAndLoopCallLogic)iPSDELogicNode;
		
		IDataEntityRuntime dstDataEntityRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSDERawSqlAndLoopCallLogic.getDstPSDataEntityMust().getId(), false);
		IPSDEAction dstPSDEAction = iPSDERawSqlAndLoopCallLogic.getDstPSDEActionMust();
		
		ISysDBSchemeRuntime iSysDBSchemeRuntime = null;
		if(iPSDERawSqlAndLoopCallLogic.getPSSysDBScheme() != null) {
			iSysDBSchemeRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getSysDBSchemeRuntime(iPSDERawSqlAndLoopCallLogic.getPSSysDBScheme());
		}
		else {
			iSysDBSchemeRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSysDBSchemeRuntime();
		}
		if(iSysDBSchemeRuntime == null) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("实体[%1$s]运行时未提供SQL支持", iDELogicRuntimeContext.getDataEntityRuntime().getName()));
		}
		List<Object> paramList = this.getSqlParamList(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
		
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			if(!ObjectUtils.isEmpty(paramList)) {
				int nIndex = 0;
				for(Object param : paramList) {
					iDELogicSession.debugInfo(String.format("SQL参数[%1$s] ==> %2$s", nIndex, param));
					nIndex ++;
				}
			}
		}
		
		
		List list = iSysDBSchemeRuntime.executeSelectSQL(iPSDERawSqlAndLoopCallLogic.getSql(), paramList);
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			iDELogicSession.debugInfo(String.format("调用SQL\r\n%1$s\r\n ==> %2$s", iPSDERawSqlAndLoopCallLogic.getSql(), list));
		}
		
		if(list != null) {
			if((DEMethodInputTypes.DTO.equals(dstPSDEAction.getPSDEActionInputMust().getType()))
					||(DEMethodInputTypes.DTOS.equals(dstPSDEAction.getPSDEActionInputMust().getType()))){
					List dtoList = new ArrayList<>();
					IEntity srcEntity = null;
					if(iPSDERawSqlAndLoopCallLogic.getSrcPSDELogicParam() != null) {
						srcEntity = iDELogicSession.getParam(iPSDERawSqlAndLoopCallLogic.getSrcPSDELogicParam().getCodeName());
					}
					for(Object item : list) {
						IEntityDTO iEntityDTO = (IEntityDTO)dstDataEntityRuntime.getDEMethodDTO(dstPSDEAction.getPSDEActionInputMust().getPSDEMethodDTOMust(), null);
						iEntityDTO.reload(item, false);
						if(srcEntity!=null) {
							srcEntity.copyTo(iEntityDTO);
						}
						dtoList.add(iEntityDTO);
					}
					
					if(DEMethodInputTypes.DTO.equals(dstPSDEAction.getPSDEActionInputMust().getType())) {
						for(Object dto : dtoList) {
							dstDataEntityRuntime.executeAction(dstPSDEAction.getName(), dstPSDEAction, new Object[] {dto});
						}
					}
					else {
						dstDataEntityRuntime.executeAction(dstPSDEAction.getName(), dstPSDEAction, new Object[] {dtoList});
					}
				}
			else {
				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("实体[%1$s]行为[%2$s]输入类型[%3$s]不正确", dstDataEntityRuntime.getName(), dstPSDEAction.getName(), dstPSDEAction.getPSDEActionInput().getType()));
			}
		}
		
	}
	
}
