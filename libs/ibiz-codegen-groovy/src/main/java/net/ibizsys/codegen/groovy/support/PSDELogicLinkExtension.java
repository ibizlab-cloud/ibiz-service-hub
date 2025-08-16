package net.ibizsys.codegen.groovy.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.DEFVRParamType;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkSingleCond;


public class PSDELogicLinkExtension {

	public static String getGroovyExpression(IPSDELogicLink iPSDELogicLink) {
		
		if(ObjectUtils.isEmpty(iPSDELogicLink.getPSDELogicLinkGroupCond()) 
				|| ObjectUtils.isEmpty(iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds())) {
			return "true";
		}
		
		String strExpression = getGroovyExpression(iPSDELogicLink.getPSDELogicLinkGroupCond());
		if(StringUtils.hasLength(strExpression)) {
			return strExpression;
		}
		
		return "true";
		
	}
	
	protected static String getGroovyExpression(IPSDELogicLinkCond iPSDELogicLinkCond) {
		
		if(iPSDELogicLinkCond instanceof IPSDELogicLinkGroupCond) {
		
			IPSDELogicLinkGroupCond iPSDELogicLinkGroupCond = (IPSDELogicLinkGroupCond)iPSDELogicLinkCond;
			List<IPSDELogicLinkCond> psDELogicLinkCondList =	iPSDELogicLinkGroupCond.getPSDELogicLinkConds();
			if(ObjectUtils.isEmpty(psDELogicLinkCondList)) {
				return null;
			}
			
			List<String> list = new ArrayList<String>();
			for(IPSDELogicLinkCond item : psDELogicLinkCondList) {
				String strExpression = getGroovyExpression(item);
				if(!StringUtils.hasLength(strExpression)) {
					continue;
				}
				
				list.add(strExpression);
			}
			
			if(ObjectUtils.isEmpty(list)) {
				return null;
			}
			
			String strExpression = "";
			if(list.size() != 1) {
				strExpression = StringUtils.collectionToDelimitedString(list, ("AND".equalsIgnoreCase(iPSDELogicLinkGroupCond.getGroupOP())?" && ":" || ") , "(", ")");
			}
			else {
				strExpression = list.get(0);
			}
			
			if(iPSDELogicLinkGroupCond.isNotMode()) {
				strExpression = String.format("!(%1$s)", strExpression);
			}
			return strExpression;
		}
		
		if(iPSDELogicLinkCond instanceof IPSDELogicLinkSingleCond) {
			
			IPSDELogicLinkSingleCond iPSDELogicLinkSingleCond = (IPSDELogicLinkSingleCond)iPSDELogicLinkCond;
			String strValue1 = String.format((StringUtils.hasLength(iPSDELogicLinkSingleCond.getDstFieldName())?"param(%1$s).get(%2$s)":"param(%1$s).real")
					,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicLinkSingleCond.getDstLogicParamMust().getCodeName())
					,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicLinkSingleCond.getDstFieldName()));
			
			String strValue2 = "";
			
			String dstValue = iPSDELogicLinkSingleCond.getParamValue();
			String strParamType = iPSDELogicLinkSingleCond.getParamType();
			if(StringUtils.hasLength(strParamType)) {
				if(StringUtils.isEmpty(dstValue)) {
					throw new RuntimeException(String.format("连接条件[%1$s]未指定参数项名称", iPSDELogicLinkCond.getName()));
				}
				if(strParamType.equals(DEFVRParamType.ENTITYFIELD.value)) {
					//dstValue = iEntity.get(((String)dstValue).toLowerCase());
					strValue2 =  String.format("param(%1$s).get(%2$s)"
							,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicLinkSingleCond.getDstLogicParamMust().getCodeName())
							,GroovyCodeGenEngineExtension.getGroovyString(dstValue));
				}
				else
					if(strParamType.equals(DEFVRParamType.CURTIME.value)) {
						//dstValue = new java.sql.Timestamp(System.currentTimeMillis());
						strValue2 = "new Date()";
					}
					else
						if(strParamType.equals("SRCENTITYFIELD")) {
							
//							IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicLinkSingleCond.getSrcLogicParamMust().getCodeName(), false);
//							dstValue =  srcDELogicParamRuntime.get(iDELogicSession, ((String)dstValue).toLowerCase());
							
							strValue2 = String.format("param(%1$s).get(%2$s)"
										,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicLinkSingleCond.getSrcLogicParamMust().getCodeName())
										,GroovyCodeGenEngineExtension.getGroovyString(dstValue));
							 
						}
						else
							if(strParamType.equals("SRCDLPARAM")) {
//								IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicLinkSingleCond.getSrcLogicParamMust().getCodeName(), false);
//								dstValue =  srcDELogicParamRuntime.getReal(iDELogicSession);
								strValue2 = String.format("param(%1$s).real"
										,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicLinkSingleCond.getSrcLogicParamMust().getCodeName()));
							}
			}
			if(!StringUtils.hasLength(strValue2)) {
				strValue2 = GroovyCodeGenEngineExtension.getGroovyString(dstValue);
			}
			
			return String.format("test(%1$s,%2$s,%3$s)"
					,strValue1
					,GroovyCodeGenEngineExtension.getGroovyString(iPSDELogicLinkSingleCond.getCondOP())
					,strValue2);
			
		}
		
		throw new RuntimeException(String.format("连接条件[%1$s]未支持", iPSDELogicLinkCond.getName()));
	}
}
