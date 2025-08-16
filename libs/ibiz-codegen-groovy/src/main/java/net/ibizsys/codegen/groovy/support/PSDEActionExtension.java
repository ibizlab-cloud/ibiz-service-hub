package net.ibizsys.codegen.groovy.support;

import net.ibizsys.model.PSModelEnums.DEActionLogicType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.action.IPSDEScriptAction;


public class PSDEActionExtension {

	public static String getComment(IPSDEAction iPSDEAction) {
		
		StringBuilder stringBuilder = new StringBuilder();
		if(iPSDEAction instanceof IPSDEScriptAction) {
			
		}
		
		return iPSDEAction.getMemo();
	}
	
	
	public static String getComment(IPSDEActionLogic iPSDEActionLogic) {
		
		StringBuilder stringBuilder = new StringBuilder();
		if(DEActionLogicType.INTERNAL.value == iPSDEActionLogic.getActionLogicType()) {
			stringBuilder.append(String.format("[%1$s] ", DEActionLogicType.INTERNAL.text));
			stringBuilder.append(String.format("%1$s(%2$s)", iPSDEActionLogic.getPSDELogicMust().getName(), iPSDEActionLogic.getPSDELogicMust().getCodeName()));
			if(iPSDEActionLogic.isCloneParam() || iPSDEActionLogic.isIgnoreException()) {
				stringBuilder.append("\n");
				if(iPSDEActionLogic.isCloneParam()) {
					stringBuilder.append(" *克隆传入参数");
				}
				if(iPSDEActionLogic.isIgnoreException()) {
					stringBuilder.append(" *忽略处理异常");
				}
			}
			return stringBuilder.toString();
		}
		
		if(DEActionLogicType.EXTERNAL.value == iPSDEActionLogic.getActionLogicType()) {
			stringBuilder.append(String.format("[%1$s] ", DEActionLogicType.EXTERNAL.text));
			stringBuilder.append(String.format("%1$s::%2$s", iPSDEActionLogic.getDstPSDEMust().getName(), iPSDEActionLogic.getDstPSDEActionMust().getName()));
			if(iPSDEActionLogic.isCloneParam() || iPSDEActionLogic.isIgnoreException()) {
				stringBuilder.append("\n");
				if(iPSDEActionLogic.isCloneParam()) {
					stringBuilder.append(" *克隆传入参数");
				}
				if(iPSDEActionLogic.isIgnoreException()) {
					stringBuilder.append(" *忽略处理异常");
				}
			}
			return stringBuilder.toString();	
		}
		
		if(DEActionLogicType.NOTIFY.value == iPSDEActionLogic.getActionLogicType()) {
			stringBuilder.append(String.format("[%1$s] ", DEActionLogicType.NOTIFY.text));
			stringBuilder.append(String.format("%1$s(%2$s)", iPSDEActionLogic.getPSDENotifyMust().getName(), iPSDEActionLogic.getPSDENotifyMust().getCodeName()));
			if(iPSDEActionLogic.isCloneParam() || iPSDEActionLogic.isIgnoreException()) {
				stringBuilder.append("\n");
				if(iPSDEActionLogic.isCloneParam()) {
					stringBuilder.append(" *克隆传入参数");
				}
				if(iPSDEActionLogic.isIgnoreException()) {
					stringBuilder.append(" *忽略处理异常");
				}
			}
			return stringBuilder.toString();
		}
		
		if(DEActionLogicType.SCRIPT.value == iPSDEActionLogic.getActionLogicType()) {
			stringBuilder.append(String.format("[%1$s]\n", DEActionLogicType.SCRIPT.text));
			stringBuilder.append(iPSDEActionLogic.getScriptCode());
			if(iPSDEActionLogic.isCloneParam() || iPSDEActionLogic.isIgnoreException()) {
				stringBuilder.append("\n");
				if(iPSDEActionLogic.isCloneParam()) {
					stringBuilder.append(" *克隆传入参数");
				}
				if(iPSDEActionLogic.isIgnoreException()) {
					stringBuilder.append(" *忽略处理异常");
				}
			}
			return stringBuilder.toString();	
		}
		
		return iPSDEActionLogic.getMemo();
	}
	
	
}
