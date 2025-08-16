package net.ibizsys.central.dataentity.logic;

import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDERawSqlCallLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体SQL查询并循环调用节点运行时对象
 * @author lionlau
 *
 */
public class DELogicRawSqlCallNodeRuntime extends DELogicRawSqlCallNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDERawSqlCallLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDERawSqlCallLogic iPSDERawSqlCallLogic = (IPSDERawSqlCallLogic)iPSDELogicNode;
		
		
//		ISysDBSchemeRuntime iSysDBSchemeRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSysDBSchemeRuntime();
//		if(iSysDBSchemeRuntime == null) {
//			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("实体[%1$s]运行时未提供SQL支持", iDELogicRuntimeContext.getDataEntityRuntime().getName()));
//		}
		
		ISysDBSchemeRuntime iSysDBSchemeRuntime = null;
		if(iPSDERawSqlCallLogic.getPSSysDBScheme() != null) {
			iSysDBSchemeRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSystemRuntime().getSysDBSchemeRuntime(iPSDERawSqlCallLogic.getPSSysDBScheme());
		}
		else {
			iSysDBSchemeRuntime = iDELogicRuntimeContext.getDataEntityRuntime().getSysDBSchemeRuntime();
		}
		
		if(iSysDBSchemeRuntime == null) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("实体[%1$s]运行时未提供SQL支持", iDELogicRuntimeContext.getDataEntityRuntime().getName()));
		}
		
		List<Object> paramList = getSqlParamList(iDELogicRuntimeContext, iDELogicSession, iPSDELogicNode);
		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
			if(!ObjectUtils.isEmpty(paramList)) {
				int nIndex = 0;
				for(Object param : paramList) {
					iDELogicSession.debugInfo(String.format("SQL参数[%1$s] ==> %2$s", nIndex, param));
					nIndex ++;
				}
			}
		}
		
		if(iPSDERawSqlCallLogic.isFillDstLogicParam()) {
			List list = iSysDBSchemeRuntime.executeSelectSQL(iPSDERawSqlCallLogic.getSql(), paramList);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("调用SQL\r\n%1$s\r\n ==> %2$s", iPSDERawSqlCallLogic.getSql(), list));
			}
			
			
			if(list!=null && list.size()>0) {
				//判断参数类型
				IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDERawSqlCallLogic.getDstPSDELogicParamMust().getCodeName(), false);
				Object dstParam = dstDELogicParamRuntime.getParamObject(iDELogicSession);
				if(dstParam instanceof IEntity) {
					IEntity dstEntity = (IEntity)dstParam;
					if(!iPSDERawSqlCallLogic.isIgnoreResetDstLogicParam()) {
						dstEntity.resetAll();
					}
					
					IEntityDTO iEntityDTO = null;
					if(dstDELogicParamRuntime.getDataEntityRuntime() != null) {
						iEntityDTO = dstDELogicParamRuntime.getDataEntityRuntime().createEntity();
					}
					else {
						iEntityDTO = iDELogicRuntimeContext.getDataEntityRuntime().createEntity();
					}
					iEntityDTO.reload(list.get(0), false);
					iEntityDTO.copyTo(dstEntity);
				}
				else {
					List dstList = DELogicParamRuntime.asList(dstParam);
					if(dstList!=null) {
						if(!iPSDERawSqlCallLogic.isIgnoreResetDstLogicParam()) {
							dstList.clear();
						}
						
						for(Object item : list) {
							IEntityDTO iEntityDTO = null;
							if(dstDELogicParamRuntime.getDataEntityRuntime() != null) {
								iEntityDTO = dstDELogicParamRuntime.getDataEntityRuntime().createEntity();
							}
							else {
								iEntityDTO = iDELogicRuntimeContext.getDataEntityRuntime().createEntity();
							}
							iEntityDTO.reload(item, false);
							dstList.add(iEntityDTO);
						}
					}
					else {
						throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定输出回填参数[%2$s]类型不支持", iPSDELogicNode.getName(), iPSDERawSqlCallLogic.getDstPSDELogicParamMust().getCodeName())); 
					}
				}
				
//				IEntity dstEntity = iDELogicSession.getParam(iPSDERawSqlCallLogic.getDstPSDELogicParamMust().getCodeName());
//				if(!iPSDERawSqlCallLogic.isIgnoreResetDstLogicParam()) {
//					dstEntity.resetAll();
//				}
//				IEntityDTO iEntityDTO = iDELogicRuntimeContext.getDataEntityRuntime().createEntity();
//				iEntityDTO.reload(list.get(0), false);
//				iEntityDTO.copyTo(dstEntity);
			}
		}
		else {
			iSysDBSchemeRuntime.executeSQL(iPSDERawSqlCallLogic.getSql(), paramList);
			
			if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
				iDELogicSession.debugInfo(String.format("调用SQL\r\n%1$s", iPSDERawSqlCallLogic.getSql()));
			}
		}
		
	}
	
}
